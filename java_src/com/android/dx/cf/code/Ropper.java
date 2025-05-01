package com.android.dx.cf.code;

import com.android.dx.cf.code.ByteCatchList;
import com.android.dx.cf.code.LocalVariableList;
import com.android.dx.cf.iface.MethodList;
import com.android.dx.dex.DexOptions;
import com.android.dx.rop.code.BasicBlock;
import com.android.dx.rop.code.BasicBlockList;
import com.android.dx.rop.code.Insn;
import com.android.dx.rop.code.InsnList;
import com.android.dx.rop.code.PlainCstInsn;
import com.android.dx.rop.code.PlainInsn;
import com.android.dx.rop.code.RegisterSpec;
import com.android.dx.rop.code.RegisterSpecList;
import com.android.dx.rop.code.Rop;
import com.android.dx.rop.code.RopMethod;
import com.android.dx.rop.code.Rops;
import com.android.dx.rop.code.SourcePosition;
import com.android.dx.rop.code.ThrowingCstInsn;
import com.android.dx.rop.code.ThrowingInsn;
import com.android.dx.rop.code.TranslationAdvice;
import com.android.dx.rop.cst.CstInteger;
import com.android.dx.rop.cst.CstType;
import com.android.dx.rop.type.StdTypeList;
import com.android.dx.rop.type.Type;
import com.android.dx.rop.type.TypeList;
import com.android.dx.util.Bits;
import com.android.dx.util.Hex;
import com.android.dx.util.IntList;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class Ropper {
    private static final int PARAM_ASSIGNMENT = -1;
    private static final int RETURN = -2;
    private static final int SPECIAL_LABEL_COUNT = 7;
    private static final int SYNCH_CATCH_1 = -6;
    private static final int SYNCH_CATCH_2 = -7;
    private static final int SYNCH_RETURN = -3;
    private static final int SYNCH_SETUP_1 = -4;
    private static final int SYNCH_SETUP_2 = -5;
    private final ByteBlockList blocks;
    private final CatchInfo[] catchInfos;
    private final ExceptionSetupLabelAllocator exceptionSetupLabelAllocator;
    private boolean hasSubroutines;
    private final RopperMachine machine;
    private final int maxLabel;
    private final int maxLocals;
    private final ConcreteMethod method;
    private final ArrayList<BasicBlock> result;
    private final ArrayList<IntList> resultSubroutines;
    private final Simulator sim;
    private final Frame[] startFrames;
    private final Subroutine[] subroutines;
    private boolean synchNeedsExceptionHandler;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class CatchInfo {
        private final Map<Type, ExceptionHandlerSetup> setups;

        private CatchInfo() {
            this.setups = new HashMap();
        }

        ExceptionHandlerSetup getSetup(Type type) {
            ExceptionHandlerSetup exceptionHandlerSetup = this.setups.get(type);
            if (exceptionHandlerSetup == null) {
                ExceptionHandlerSetup exceptionHandlerSetup2 = new ExceptionHandlerSetup(type, Ropper.this.exceptionSetupLabelAllocator.getNextLabel());
                this.setups.put(type, exceptionHandlerSetup2);
                return exceptionHandlerSetup2;
            }
            return exceptionHandlerSetup;
        }

        Collection<ExceptionHandlerSetup> getSetups() {
            return this.setups.values();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class ExceptionHandlerSetup {
        private Type caughtType;
        private int label;

        ExceptionHandlerSetup(Type type, int i4) {
            this.caughtType = type;
            this.label = i4;
        }

        Type getCaughtType() {
            return this.caughtType;
        }

        public int getLabel() {
            return this.label;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class ExceptionSetupLabelAllocator extends LabelAllocator {
        int maxSetupLabel;

        ExceptionSetupLabelAllocator() {
            super(Ropper.this.maxLabel);
            this.maxSetupLabel = Ropper.this.maxLabel + Ropper.this.method.getCatches().size();
        }

        @Override // com.android.dx.cf.code.Ropper.LabelAllocator
        int getNextLabel() {
            int i4 = this.nextAvailableLabel;
            if (i4 < this.maxSetupLabel) {
                this.nextAvailableLabel = i4 + 1;
                return i4;
            }
            throw new IndexOutOfBoundsException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class LabelAllocator {
        int nextAvailableLabel;

        LabelAllocator(int i4) {
            this.nextAvailableLabel = i4;
        }

        int getNextLabel() {
            int i4 = this.nextAvailableLabel;
            this.nextAvailableLabel = i4 + 1;
            return i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class SubroutineInliner {
        private final LabelAllocator labelAllocator;
        private final ArrayList<IntList> labelToSubroutines;
        private final HashMap<Integer, Integer> origLabelToCopiedLabel = new HashMap<>();
        private int subroutineStart;
        private int subroutineSuccessor;
        private final BitSet workList;

        SubroutineInliner(LabelAllocator labelAllocator, ArrayList<IntList> arrayList) {
            this.workList = new BitSet(Ropper.this.maxLabel);
            this.labelAllocator = labelAllocator;
            this.labelToSubroutines = arrayList;
        }

        private void copyBlock(int i4, int i5) {
            IntList intList;
            BasicBlock labelToBlock = Ropper.this.labelToBlock(i4);
            IntList successors = labelToBlock.getSuccessors();
            int i6 = -1;
            if (!Ropper.this.isSubroutineCaller(labelToBlock)) {
                Subroutine subroutineFromRetBlock = Ropper.this.subroutineFromRetBlock(i4);
                if (subroutineFromRetBlock != null) {
                    if (subroutineFromRetBlock.startBlock != this.subroutineStart) {
                        throw new RuntimeException("ret instruction returns to label " + Hex.u2(subroutineFromRetBlock.startBlock) + " expected: " + Hex.u2(this.subroutineStart));
                    }
                    intList = IntList.makeImmutable(this.subroutineSuccessor);
                    i6 = this.subroutineSuccessor;
                } else {
                    int primarySuccessor = labelToBlock.getPrimarySuccessor();
                    int size = successors.size();
                    IntList intList2 = new IntList(size);
                    for (int i7 = 0; i7 < size; i7++) {
                        int i8 = successors.get(i7);
                        int mapOrAllocateLabel = mapOrAllocateLabel(i8);
                        intList2.add(mapOrAllocateLabel);
                        if (primarySuccessor == i8) {
                            i6 = mapOrAllocateLabel;
                        }
                    }
                    intList2.setImmutable();
                    intList = intList2;
                }
            } else {
                intList = IntList.makeImmutable(mapOrAllocateLabel(successors.get(0)), successors.get(1));
            }
            Ropper ropper = Ropper.this;
            ropper.addBlock(new BasicBlock(i5, ropper.filterMoveReturnAddressInsns(labelToBlock.getInsns()), intList, i6), this.labelToSubroutines.get(i5));
        }

        private boolean involvedInSubroutine(int i4, int i5) {
            IntList intList = this.labelToSubroutines.get(i4);
            return intList != null && intList.size() > 0 && intList.top() == i5;
        }

        private int mapOrAllocateLabel(int i4) {
            Integer num = this.origLabelToCopiedLabel.get(Integer.valueOf(i4));
            if (num != null) {
                return num.intValue();
            }
            if (involvedInSubroutine(i4, this.subroutineStart)) {
                int nextLabel = this.labelAllocator.getNextLabel();
                this.workList.set(i4);
                this.origLabelToCopiedLabel.put(Integer.valueOf(i4), Integer.valueOf(nextLabel));
                while (this.labelToSubroutines.size() <= nextLabel) {
                    this.labelToSubroutines.add(null);
                }
                ArrayList<IntList> arrayList = this.labelToSubroutines;
                arrayList.set(nextLabel, arrayList.get(i4));
                return nextLabel;
            }
            return i4;
        }

        void inlineSubroutineCalledFrom(BasicBlock basicBlock) {
            this.subroutineSuccessor = basicBlock.getSuccessors().get(0);
            int i4 = basicBlock.getSuccessors().get(1);
            this.subroutineStart = i4;
            int mapOrAllocateLabel = mapOrAllocateLabel(i4);
            int nextSetBit = this.workList.nextSetBit(0);
            while (nextSetBit >= 0) {
                this.workList.clear(nextSetBit);
                int intValue = this.origLabelToCopiedLabel.get(Integer.valueOf(nextSetBit)).intValue();
                copyBlock(nextSetBit, intValue);
                Ropper ropper = Ropper.this;
                if (ropper.isSubroutineCaller(ropper.labelToBlock(nextSetBit))) {
                    new SubroutineInliner(this.labelAllocator, this.labelToSubroutines).inlineSubroutineCalledFrom(Ropper.this.labelToBlock(intValue));
                }
                nextSetBit = this.workList.nextSetBit(0);
            }
            Ropper.this.addOrReplaceBlockNoDelete(new BasicBlock(basicBlock.getLabel(), basicBlock.getInsns(), IntList.makeImmutable(mapOrAllocateLabel), mapOrAllocateLabel), this.labelToSubroutines.get(basicBlock.getLabel()));
        }
    }

    private Ropper(ConcreteMethod concreteMethod, TranslationAdvice translationAdvice, MethodList methodList, DexOptions dexOptions) {
        Objects.requireNonNull(concreteMethod, "method == null");
        Objects.requireNonNull(translationAdvice, "advice == null");
        this.method = concreteMethod;
        ByteBlockList identifyBlocks = BasicBlocker.identifyBlocks(concreteMethod);
        this.blocks = identifyBlocks;
        int maxLabel = identifyBlocks.getMaxLabel();
        this.maxLabel = maxLabel;
        int maxLocals = concreteMethod.getMaxLocals();
        this.maxLocals = maxLocals;
        RopperMachine ropperMachine = new RopperMachine(this, concreteMethod, translationAdvice, methodList);
        this.machine = ropperMachine;
        this.sim = new Simulator(ropperMachine, concreteMethod, dexOptions);
        Frame[] frameArr = new Frame[maxLabel];
        this.startFrames = frameArr;
        this.subroutines = new Subroutine[maxLabel];
        this.result = new ArrayList<>((identifyBlocks.size() * 2) + 10);
        this.resultSubroutines = new ArrayList<>((identifyBlocks.size() * 2) + 10);
        this.catchInfos = new CatchInfo[maxLabel];
        this.synchNeedsExceptionHandler = false;
        frameArr[0] = new Frame(maxLocals, concreteMethod.getMaxStack());
        this.exceptionSetupLabelAllocator = new ExceptionSetupLabelAllocator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBlock(BasicBlock basicBlock, IntList intList) {
        Objects.requireNonNull(basicBlock, "block == null");
        this.result.add(basicBlock);
        intList.throwIfMutable();
        this.resultSubroutines.add(intList);
    }

    private void addExceptionSetupBlocks() {
        int length = this.catchInfos.length;
        for (int i4 = 0; i4 < length; i4++) {
            CatchInfo catchInfo = this.catchInfos[i4];
            if (catchInfo != null) {
                for (ExceptionHandlerSetup exceptionHandlerSetup : catchInfo.getSetups()) {
                    SourcePosition position = labelToBlock(i4).getFirstInsn().getPosition();
                    InsnList insnList = new InsnList(2);
                    Rop opMoveException = Rops.opMoveException(exceptionHandlerSetup.getCaughtType());
                    RegisterSpec make = RegisterSpec.make(this.maxLocals, exceptionHandlerSetup.getCaughtType());
                    RegisterSpecList registerSpecList = RegisterSpecList.EMPTY;
                    insnList.set(0, new PlainInsn(opMoveException, position, make, registerSpecList));
                    insnList.set(1, new PlainInsn(Rops.GOTO, position, (RegisterSpec) null, registerSpecList));
                    insnList.setImmutable();
                    addBlock(new BasicBlock(exceptionHandlerSetup.getLabel(), insnList, IntList.makeImmutable(i4), i4), this.startFrames[i4].getSubroutines());
                }
            }
        }
    }

    private boolean addOrReplaceBlock(BasicBlock basicBlock, IntList intList) {
        boolean z4;
        Objects.requireNonNull(basicBlock, "block == null");
        int labelToResultIndex = labelToResultIndex(basicBlock.getLabel());
        if (labelToResultIndex < 0) {
            z4 = false;
        } else {
            removeBlockAndSpecialSuccessors(labelToResultIndex);
            z4 = true;
        }
        this.result.add(basicBlock);
        intList.throwIfMutable();
        this.resultSubroutines.add(intList);
        return z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean addOrReplaceBlockNoDelete(BasicBlock basicBlock, IntList intList) {
        boolean z4;
        Objects.requireNonNull(basicBlock, "block == null");
        int labelToResultIndex = labelToResultIndex(basicBlock.getLabel());
        if (labelToResultIndex < 0) {
            z4 = false;
        } else {
            this.result.remove(labelToResultIndex);
            this.resultSubroutines.remove(labelToResultIndex);
            z4 = true;
        }
        this.result.add(basicBlock);
        intList.throwIfMutable();
        this.resultSubroutines.add(intList);
        return z4;
    }

    private void addReturnBlock() {
        RegisterSpecList make;
        Rop returnOp = this.machine.getReturnOp();
        if (returnOp == null) {
            return;
        }
        SourcePosition returnPosition = this.machine.getReturnPosition();
        int specialLabel = getSpecialLabel(-2);
        if (isSynchronized()) {
            InsnList insnList = new InsnList(1);
            insnList.set(0, new ThrowingInsn(Rops.MONITOR_EXIT, returnPosition, RegisterSpecList.make(getSynchReg()), StdTypeList.EMPTY));
            insnList.setImmutable();
            int specialLabel2 = getSpecialLabel(-3);
            addBlock(new BasicBlock(specialLabel, insnList, IntList.makeImmutable(specialLabel2), specialLabel2), IntList.EMPTY);
            specialLabel = specialLabel2;
        }
        InsnList insnList2 = new InsnList(1);
        TypeList sources = returnOp.getSources();
        if (sources.size() == 0) {
            make = RegisterSpecList.EMPTY;
        } else {
            make = RegisterSpecList.make(RegisterSpec.make(0, sources.getType(0)));
        }
        insnList2.set(0, new PlainInsn(returnOp, returnPosition, (RegisterSpec) null, make));
        insnList2.setImmutable();
        IntList intList = IntList.EMPTY;
        addBlock(new BasicBlock(specialLabel, insnList2, intList, -1), intList);
    }

    private void addSetupBlocks() {
        InsnList insnList;
        RegisterSpec makeLocalOptional;
        LocalVariableList localVariables = this.method.getLocalVariables();
        int i4 = 0;
        SourcePosition makeSourcePosistion = this.method.makeSourcePosistion(0);
        StdTypeList parameterTypes = this.method.getEffectiveDescriptor().getParameterTypes();
        int size = parameterTypes.size();
        InsnList insnList2 = new InsnList(size + 1);
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            Type type = parameterTypes.get(i5);
            LocalVariableList.Item pcAndIndexToLocal = localVariables.pcAndIndexToLocal(i4, i6);
            if (pcAndIndexToLocal == null) {
                makeLocalOptional = RegisterSpec.make(i6, type);
            } else {
                makeLocalOptional = RegisterSpec.makeLocalOptional(i6, type, pcAndIndexToLocal.getLocalItem());
            }
            insnList2.set(i5, new PlainCstInsn(Rops.opMoveParam(type), makeSourcePosistion, makeLocalOptional, RegisterSpecList.EMPTY, CstInteger.make(i6)));
            i6 += type.getCategory();
            i5++;
            i4 = 0;
        }
        Rop rop = Rops.GOTO;
        RegisterSpecList registerSpecList = RegisterSpecList.EMPTY;
        insnList2.set(size, new PlainInsn(rop, makeSourcePosistion, (RegisterSpec) null, registerSpecList));
        insnList2.setImmutable();
        boolean isSynchronized = isSynchronized();
        int specialLabel = isSynchronized ? getSpecialLabel(-4) : 0;
        BasicBlock basicBlock = new BasicBlock(getSpecialLabel(-1), insnList2, IntList.makeImmutable(specialLabel), specialLabel);
        IntList intList = IntList.EMPTY;
        addBlock(basicBlock, intList);
        if (isSynchronized) {
            RegisterSpec synchReg = getSynchReg();
            if (isStatic()) {
                ThrowingCstInsn throwingCstInsn = new ThrowingCstInsn(Rops.CONST_OBJECT, makeSourcePosistion, registerSpecList, StdTypeList.EMPTY, this.method.getDefiningClass());
                insnList = new InsnList(1);
                insnList.set(0, throwingCstInsn);
            } else {
                InsnList insnList3 = new InsnList(2);
                insnList3.set(0, new PlainCstInsn(Rops.MOVE_PARAM_OBJECT, makeSourcePosistion, synchReg, registerSpecList, CstInteger.VALUE_0));
                insnList3.set(1, new PlainInsn(rop, makeSourcePosistion, (RegisterSpec) null, registerSpecList));
                insnList = insnList3;
            }
            int specialLabel2 = getSpecialLabel(-5);
            insnList.setImmutable();
            addBlock(new BasicBlock(specialLabel, insnList, IntList.makeImmutable(specialLabel2), specialLabel2), intList);
            InsnList insnList4 = new InsnList(isStatic() ? 2 : 1);
            if (isStatic()) {
                insnList4.set(0, new PlainInsn(Rops.opMoveResultPseudo(synchReg), makeSourcePosistion, synchReg, registerSpecList));
            }
            insnList4.set(isStatic() ? 1 : 0, new ThrowingInsn(Rops.MONITOR_ENTER, makeSourcePosistion, RegisterSpecList.make(synchReg), StdTypeList.EMPTY));
            insnList4.setImmutable();
            addBlock(new BasicBlock(specialLabel2, insnList4, IntList.makeImmutable(0), 0), intList);
        }
    }

    private void addSynchExceptionHandlerBlock() {
        if (this.synchNeedsExceptionHandler) {
            SourcePosition makeSourcePosistion = this.method.makeSourcePosistion(0);
            Type type = Type.THROWABLE;
            RegisterSpec make = RegisterSpec.make(0, type);
            InsnList insnList = new InsnList(2);
            insnList.set(0, new PlainInsn(Rops.opMoveException(type), makeSourcePosistion, make, RegisterSpecList.EMPTY));
            Rop rop = Rops.MONITOR_EXIT;
            RegisterSpecList make2 = RegisterSpecList.make(getSynchReg());
            StdTypeList stdTypeList = StdTypeList.EMPTY;
            insnList.set(1, new ThrowingInsn(rop, makeSourcePosistion, make2, stdTypeList));
            insnList.setImmutable();
            int specialLabel = getSpecialLabel(-7);
            BasicBlock basicBlock = new BasicBlock(getSpecialLabel(-6), insnList, IntList.makeImmutable(specialLabel), specialLabel);
            IntList intList = IntList.EMPTY;
            addBlock(basicBlock, intList);
            InsnList insnList2 = new InsnList(1);
            insnList2.set(0, new ThrowingInsn(Rops.THROW, makeSourcePosistion, RegisterSpecList.make(make), stdTypeList));
            insnList2.setImmutable();
            addBlock(new BasicBlock(specialLabel, insnList2, intList, -1), intList);
        }
    }

    public static RopMethod convert(ConcreteMethod concreteMethod, TranslationAdvice translationAdvice, MethodList methodList, DexOptions dexOptions) {
        try {
            Ropper ropper = new Ropper(concreteMethod, translationAdvice, methodList, dexOptions);
            ropper.doit();
            return ropper.getRopMethod();
        } catch (SimException e5) {
            e5.addContext("...while working on method " + concreteMethod.getNat().toHuman());
            throw e5;
        }
    }

    private void deleteUnreachableBlocks() {
        final IntList intList = new IntList(this.result.size());
        this.resultSubroutines.clear();
        forEachNonSubBlockDepthFirst(getSpecialLabel(-1), new BasicBlock.Visitor() { // from class: com.android.dx.cf.code.Ropper.2
            @Override // com.android.dx.rop.code.BasicBlock.Visitor
            public void visitBlock(BasicBlock basicBlock) {
                intList.add(basicBlock.getLabel());
            }
        });
        intList.sort();
        for (int size = this.result.size() - 1; size >= 0; size--) {
            if (intList.indexOf(this.result.get(size).getLabel()) < 0) {
                this.result.remove(size);
            }
        }
    }

    private void doit() {
        int[] makeBitSet = Bits.makeBitSet(this.maxLabel);
        Bits.set(makeBitSet, 0);
        addSetupBlocks();
        setFirstFrame();
        while (true) {
            int findFirst = Bits.findFirst(makeBitSet, 0);
            if (findFirst < 0) {
                break;
            }
            Bits.clear(makeBitSet, findFirst);
            try {
                processBlock(this.blocks.labelToBlock(findFirst), this.startFrames[findFirst], makeBitSet);
            } catch (SimException e5) {
                e5.addContext("...while working on block " + Hex.u2(findFirst));
                throw e5;
            }
        }
        addReturnBlock();
        addSynchExceptionHandlerBlock();
        addExceptionSetupBlocks();
        if (this.hasSubroutines) {
            inlineSubroutines();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InsnList filterMoveReturnAddressInsns(InsnList insnList) {
        int size = insnList.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            if (insnList.get(i5).getOpcode() != Rops.MOVE_RETURN_ADDRESS) {
                i4++;
            }
        }
        if (i4 == size) {
            return insnList;
        }
        InsnList insnList2 = new InsnList(i4);
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            Insn insn = insnList.get(i7);
            if (insn.getOpcode() != Rops.MOVE_RETURN_ADDRESS) {
                insnList2.set(i6, insn);
                i6++;
            }
        }
        insnList2.setImmutable();
        return insnList2;
    }

    private void forEachNonSubBlockDepthFirst(int i4, BasicBlock.Visitor visitor) {
        forEachNonSubBlockDepthFirst0(labelToBlock(i4), visitor, new BitSet(this.maxLabel));
    }

    private void forEachNonSubBlockDepthFirst0(BasicBlock basicBlock, BasicBlock.Visitor visitor, BitSet bitSet) {
        int labelToResultIndex;
        visitor.visitBlock(basicBlock);
        bitSet.set(basicBlock.getLabel());
        IntList successors = basicBlock.getSuccessors();
        int size = successors.size();
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = successors.get(i4);
            if (!bitSet.get(i5) && ((!isSubroutineCaller(basicBlock) || i4 <= 0) && (labelToResultIndex = labelToResultIndex(i5)) >= 0)) {
                forEachNonSubBlockDepthFirst0(this.result.get(labelToResultIndex), visitor, bitSet);
            }
        }
    }

    private int getAvailableLabel() {
        int minimumUnreservedLabel = getMinimumUnreservedLabel();
        Iterator<BasicBlock> it2 = this.result.iterator();
        while (it2.hasNext()) {
            int label = it2.next().getLabel();
            if (label >= minimumUnreservedLabel) {
                minimumUnreservedLabel = label + 1;
            }
        }
        return minimumUnreservedLabel;
    }

    private int getMinimumUnreservedLabel() {
        return this.maxLabel + this.method.getCatches().size() + 7;
    }

    private int getNormalRegCount() {
        return this.maxLocals + this.method.getMaxStack();
    }

    private RopMethod getRopMethod() {
        int size = this.result.size();
        BasicBlockList basicBlockList = new BasicBlockList(size);
        for (int i4 = 0; i4 < size; i4++) {
            basicBlockList.set(i4, this.result.get(i4));
        }
        basicBlockList.setImmutable();
        return new RopMethod(basicBlockList, getSpecialLabel(-1));
    }

    private int getSpecialLabel(int i4) {
        return this.maxLabel + this.method.getCatches().size() + (i4 ^ (-1));
    }

    private RegisterSpec getSynchReg() {
        int normalRegCount = getNormalRegCount();
        if (normalRegCount < 1) {
            normalRegCount = 1;
        }
        return RegisterSpec.make(normalRegCount, Type.OBJECT);
    }

    private void inlineSubroutines() {
        final IntList intList = new IntList(4);
        forEachNonSubBlockDepthFirst(0, new BasicBlock.Visitor() { // from class: com.android.dx.cf.code.Ropper.1
            @Override // com.android.dx.rop.code.BasicBlock.Visitor
            public void visitBlock(BasicBlock basicBlock) {
                if (Ropper.this.isSubroutineCaller(basicBlock)) {
                    intList.add(basicBlock.getLabel());
                }
            }
        });
        int availableLabel = getAvailableLabel();
        ArrayList arrayList = new ArrayList(availableLabel);
        for (int i4 = 0; i4 < availableLabel; i4++) {
            arrayList.add(null);
        }
        for (int i5 = 0; i5 < this.result.size(); i5++) {
            BasicBlock basicBlock = this.result.get(i5);
            if (basicBlock != null) {
                arrayList.set(basicBlock.getLabel(), this.resultSubroutines.get(i5));
            }
        }
        int size = intList.size();
        for (int i6 = 0; i6 < size; i6++) {
            new SubroutineInliner(new LabelAllocator(getAvailableLabel()), arrayList).inlineSubroutineCalledFrom(labelToBlock(intList.get(i6)));
        }
        deleteUnreachableBlocks();
    }

    private boolean isStatic() {
        return (this.method.getAccessFlags() & 8) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isSubroutineCaller(BasicBlock basicBlock) {
        IntList successors = basicBlock.getSuccessors();
        if (successors.size() < 2) {
            return false;
        }
        int i4 = successors.get(1);
        Subroutine[] subroutineArr = this.subroutines;
        return i4 < subroutineArr.length && subroutineArr[i4] != null;
    }

    private boolean isSynchronized() {
        return (this.method.getAccessFlags() & 32) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BasicBlock labelToBlock(int i4) {
        int labelToResultIndex = labelToResultIndex(i4);
        if (labelToResultIndex >= 0) {
            return this.result.get(labelToResultIndex);
        }
        throw new IllegalArgumentException("no such label " + Hex.u2(i4));
    }

    private int labelToResultIndex(int i4) {
        int size = this.result.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (this.result.get(i5).getLabel() == i4) {
                return i5;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAndWorkAsNecessary(int i4, int i5, Subroutine subroutine, Frame frame, int[] iArr) {
        Frame mergeWith;
        Frame[] frameArr = this.startFrames;
        Frame frame2 = frameArr[i4];
        if (frame2 == null) {
            if (subroutine != null) {
                frameArr[i4] = frame.makeNewSubroutineStartFrame(i4, i5);
            } else {
                frameArr[i4] = frame;
            }
            Bits.set(iArr, i4);
            return;
        }
        if (subroutine != null) {
            mergeWith = frame2.mergeWithSubroutineCaller(frame, subroutine.getStartBlock(), i5);
        } else {
            mergeWith = frame2.mergeWith(frame);
        }
        if (mergeWith != frame2) {
            this.startFrames[i4] = mergeWith;
            Bits.set(iArr, i4);
        }
    }

    private void processBlock(ByteBlock byteBlock, Frame frame, int[] iArr) {
        IntList intList;
        Subroutine subroutine;
        int i4;
        IntList intList2;
        int i5;
        int i6;
        int i7;
        SourcePosition position;
        IntList intList3;
        int i8;
        ByteCatchList catches = byteBlock.getCatches();
        this.machine.startBlock(catches.toRopCatchList());
        Frame copy = frame.copy();
        this.sim.simulate(byteBlock, copy);
        copy.setImmutable();
        int extraBlockCount = this.machine.getExtraBlockCount();
        ArrayList<Insn> insns = this.machine.getInsns();
        int size = insns.size();
        int size2 = catches.size();
        IntList successors = byteBlock.getSuccessors();
        if (this.machine.hasJsr()) {
            int i9 = successors.get(1);
            Subroutine[] subroutineArr = this.subroutines;
            if (subroutineArr[i9] == null) {
                subroutineArr[i9] = new Subroutine(i9);
            }
            this.subroutines[i9].addCallerBlock(byteBlock.getLabel());
            intList = successors;
            subroutine = this.subroutines[i9];
            i4 = 1;
        } else {
            if (this.machine.hasRet()) {
                int subroutineAddress = this.machine.getReturnAddress().getSubroutineAddress();
                Subroutine[] subroutineArr2 = this.subroutines;
                if (subroutineArr2[subroutineAddress] == null) {
                    subroutineArr2[subroutineAddress] = new Subroutine(this, subroutineAddress, byteBlock.getLabel());
                } else {
                    subroutineArr2[subroutineAddress].addRetBlock(byteBlock.getLabel());
                }
                IntList successors2 = this.subroutines[subroutineAddress].getSuccessors();
                this.subroutines[subroutineAddress].mergeToSuccessors(copy, iArr);
                i4 = successors2.size();
                intList = successors2;
            } else if (this.machine.wereCatchesUsed()) {
                intList = successors;
                i4 = size2;
            } else {
                intList = successors;
                subroutine = null;
                i4 = 0;
            }
            subroutine = null;
        }
        int size3 = intList.size();
        int i10 = i4;
        while (i10 < size3) {
            try {
                int i11 = i10;
                int i12 = size3;
                IntList intList4 = intList;
                mergeAndWorkAsNecessary(intList.get(i10), byteBlock.getLabel(), subroutine, copy, iArr);
                i10 = i11 + 1;
                intList = intList4;
                size3 = i12;
            } catch (SimException e5) {
                e5.addContext("...while merging to block " + Hex.u2(i8));
                throw e5;
            }
        }
        int i13 = size3;
        IntList intList5 = intList;
        if (i13 == 0 && this.machine.returns()) {
            intList2 = IntList.makeImmutable(getSpecialLabel(-2));
            i5 = 1;
        } else {
            intList2 = intList5;
            i5 = i13;
        }
        if (i5 == 0) {
            i6 = -1;
        } else {
            int primarySuccessorIndex = this.machine.getPrimarySuccessorIndex();
            if (primarySuccessorIndex >= 0) {
                primarySuccessorIndex = intList2.get(primarySuccessorIndex);
            }
            i6 = primarySuccessorIndex;
        }
        boolean z4 = isSynchronized() && this.machine.canThrow();
        if (z4 || size2 != 0) {
            IntList intList6 = new IntList(i5);
            boolean z5 = false;
            int i14 = 0;
            while (i14 < size2) {
                ByteCatchList.Item item = catches.get(i14);
                CstType exceptionClass = item.getExceptionClass();
                int handlerPc = item.getHandlerPc();
                boolean z6 = z5 | (exceptionClass == CstType.OBJECT);
                try {
                    IntList intList7 = intList6;
                    int i15 = i6;
                    int i16 = i14;
                    mergeAndWorkAsNecessary(handlerPc, byteBlock.getLabel(), null, copy.makeExceptionHandlerStartFrame(exceptionClass), iArr);
                    CatchInfo catchInfo = this.catchInfos[handlerPc];
                    if (catchInfo == null) {
                        catchInfo = new CatchInfo();
                        this.catchInfos[handlerPc] = catchInfo;
                    }
                    intList7.add(catchInfo.getSetup(exceptionClass.getClassType()).getLabel());
                    i14 = i16 + 1;
                    intList6 = intList7;
                    z5 = z6;
                    i6 = i15;
                } catch (SimException e6) {
                    e6.addContext("...while merging exception to block " + Hex.u2(handlerPc));
                    throw e6;
                }
            }
            IntList intList8 = intList6;
            int i17 = i6;
            if (z4 && !z5) {
                intList8.add(getSpecialLabel(-6));
                this.synchNeedsExceptionHandler = true;
                for (int i18 = (size - extraBlockCount) - 1; i18 < size; i18++) {
                    Insn insn = insns.get(i18);
                    if (insn.canThrow()) {
                        insns.set(i18, insn.withAddedCatch(Type.OBJECT));
                    }
                }
            }
            i7 = i17;
            if (i7 >= 0) {
                intList8.add(i7);
            }
            intList8.setImmutable();
            intList2 = intList8;
        } else {
            i7 = i6;
        }
        int indexOf = intList2.indexOf(i7);
        int i19 = i7;
        while (extraBlockCount > 0) {
            size--;
            Insn insn2 = insns.get(size);
            boolean z7 = insn2.getOpcode().getBranchingness() == 1;
            InsnList insnList = new InsnList(z7 ? 2 : 1);
            insnList.set(0, insn2);
            if (z7) {
                insnList.set(1, new PlainInsn(Rops.GOTO, insn2.getPosition(), (RegisterSpec) null, RegisterSpecList.EMPTY));
                intList3 = IntList.makeImmutable(i19);
            } else {
                intList3 = intList2;
            }
            insnList.setImmutable();
            int availableLabel = getAvailableLabel();
            addBlock(new BasicBlock(availableLabel, insnList, intList3, i19), copy.getSubroutines());
            intList2 = intList2.mutableCopy();
            intList2.set(indexOf, availableLabel);
            intList2.setImmutable();
            extraBlockCount--;
            i19 = availableLabel;
        }
        Insn insn3 = size == 0 ? null : insns.get(size - 1);
        if (insn3 == null || insn3.getOpcode().getBranchingness() == 1) {
            if (insn3 == null) {
                position = SourcePosition.NO_INFO;
            } else {
                position = insn3.getPosition();
            }
            insns.add(new PlainInsn(Rops.GOTO, position, (RegisterSpec) null, RegisterSpecList.EMPTY));
            size++;
        }
        InsnList insnList2 = new InsnList(size);
        for (int i20 = 0; i20 < size; i20++) {
            insnList2.set(i20, insns.get(i20));
        }
        insnList2.setImmutable();
        addOrReplaceBlock(new BasicBlock(byteBlock.getLabel(), insnList2, intList2, i19), copy.getSubroutines());
    }

    private void removeBlockAndSpecialSuccessors(int i4) {
        int minimumUnreservedLabel = getMinimumUnreservedLabel();
        IntList successors = this.result.get(i4).getSuccessors();
        int size = successors.size();
        this.result.remove(i4);
        this.resultSubroutines.remove(i4);
        for (int i5 = 0; i5 < size; i5++) {
            int i6 = successors.get(i5);
            if (i6 >= minimumUnreservedLabel) {
                int labelToResultIndex = labelToResultIndex(i6);
                if (labelToResultIndex >= 0) {
                    removeBlockAndSpecialSuccessors(labelToResultIndex);
                } else {
                    throw new RuntimeException("Invalid label " + Hex.u2(i6));
                }
            }
        }
    }

    private void setFirstFrame() {
        this.startFrames[0].initializeWithParameters(this.method.getEffectiveDescriptor().getParameterTypes());
        this.startFrames[0].setImmutable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Subroutine subroutineFromRetBlock(int i4) {
        for (int length = this.subroutines.length - 1; length >= 0; length--) {
            Subroutine[] subroutineArr = this.subroutines;
            if (subroutineArr[length] != null) {
                Subroutine subroutine = subroutineArr[length];
                if (subroutine.retBlocks.get(i4)) {
                    return subroutine;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getFirstTempStackReg() {
        int normalRegCount = getNormalRegCount();
        return isSynchronized() ? normalRegCount + 1 : normalRegCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class Subroutine {
        private BitSet callerBlocks;
        private BitSet retBlocks;
        private int startBlock;

        Subroutine(int i4) {
            this.startBlock = i4;
            this.retBlocks = new BitSet(Ropper.this.maxLabel);
            this.callerBlocks = new BitSet(Ropper.this.maxLabel);
            Ropper.this.hasSubroutines = true;
        }

        void addCallerBlock(int i4) {
            this.callerBlocks.set(i4);
        }

        void addRetBlock(int i4) {
            this.retBlocks.set(i4);
        }

        int getStartBlock() {
            return this.startBlock;
        }

        IntList getSuccessors() {
            IntList intList = new IntList(this.callerBlocks.size());
            int nextSetBit = this.callerBlocks.nextSetBit(0);
            while (nextSetBit >= 0) {
                intList.add(Ropper.this.labelToBlock(nextSetBit).getSuccessors().get(0));
                nextSetBit = this.callerBlocks.nextSetBit(nextSetBit + 1);
            }
            intList.setImmutable();
            return intList;
        }

        void mergeToSuccessors(Frame frame, int[] iArr) {
            int nextSetBit = this.callerBlocks.nextSetBit(0);
            while (nextSetBit >= 0) {
                int i4 = Ropper.this.labelToBlock(nextSetBit).getSuccessors().get(0);
                Frame subFrameForLabel = frame.subFrameForLabel(this.startBlock, nextSetBit);
                if (subFrameForLabel != null) {
                    Ropper.this.mergeAndWorkAsNecessary(i4, -1, null, subFrameForLabel, iArr);
                } else {
                    Bits.set(iArr, nextSetBit);
                }
                nextSetBit = this.callerBlocks.nextSetBit(nextSetBit + 1);
            }
        }

        Subroutine(Ropper ropper, int i4, int i5) {
            this(i4);
            addRetBlock(i5);
        }
    }
}
