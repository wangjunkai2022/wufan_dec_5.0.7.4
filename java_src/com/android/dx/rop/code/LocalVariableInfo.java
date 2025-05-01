package com.android.dx.rop.code;

import com.android.dx.util.MutabilityControl;
import java.util.HashMap;
import java.util.Objects;
/* loaded from: classes.dex */
public final class LocalVariableInfo extends MutabilityControl {
    private final RegisterSpecSet[] blockStarts;
    private final RegisterSpecSet emptySet;
    private final HashMap<Insn, RegisterSpec> insnAssignments;
    private final int regCount;

    public LocalVariableInfo(RopMethod ropMethod) {
        Objects.requireNonNull(ropMethod, "method == null");
        BasicBlockList blocks = ropMethod.getBlocks();
        int maxLabel = blocks.getMaxLabel();
        int regCount = blocks.getRegCount();
        this.regCount = regCount;
        RegisterSpecSet registerSpecSet = new RegisterSpecSet(regCount);
        this.emptySet = registerSpecSet;
        this.blockStarts = new RegisterSpecSet[maxLabel];
        this.insnAssignments = new HashMap<>(blocks.getInstructionCount());
        registerSpecSet.setImmutable();
    }

    private RegisterSpecSet getStarts0(int i4) {
        try {
            return this.blockStarts[i4];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus label");
        }
    }

    public void addAssignment(Insn insn, RegisterSpec registerSpec) {
        throwIfImmutable();
        Objects.requireNonNull(insn, "insn == null");
        Objects.requireNonNull(registerSpec, "spec == null");
        this.insnAssignments.put(insn, registerSpec);
    }

    public void debugDump() {
        int i4 = 0;
        while (true) {
            RegisterSpecSet[] registerSpecSetArr = this.blockStarts;
            if (i4 >= registerSpecSetArr.length) {
                return;
            }
            if (registerSpecSetArr[i4] != null) {
                if (registerSpecSetArr[i4] == this.emptySet) {
                    System.out.printf("%04x: empty set\n", Integer.valueOf(i4));
                } else {
                    System.out.printf("%04x: %s\n", Integer.valueOf(i4), this.blockStarts[i4]);
                }
            }
            i4++;
        }
    }

    public RegisterSpec getAssignment(Insn insn) {
        return this.insnAssignments.get(insn);
    }

    public int getAssignmentCount() {
        return this.insnAssignments.size();
    }

    public RegisterSpecSet getStarts(int i4) {
        RegisterSpecSet starts0 = getStarts0(i4);
        return starts0 != null ? starts0 : this.emptySet;
    }

    public boolean mergeStarts(int i4, RegisterSpecSet registerSpecSet) {
        RegisterSpecSet starts0 = getStarts0(i4);
        if (starts0 == null) {
            setStarts(i4, registerSpecSet);
            return true;
        }
        RegisterSpecSet mutableCopy = starts0.mutableCopy();
        if (starts0.size() != 0) {
            mutableCopy.intersect(registerSpecSet, true);
        } else {
            mutableCopy = registerSpecSet.mutableCopy();
        }
        if (starts0.equals(mutableCopy)) {
            return false;
        }
        mutableCopy.setImmutable();
        setStarts(i4, mutableCopy);
        return true;
    }

    public RegisterSpecSet mutableCopyOfStarts(int i4) {
        RegisterSpecSet starts0 = getStarts0(i4);
        return starts0 != null ? starts0.mutableCopy() : new RegisterSpecSet(this.regCount);
    }

    public void setStarts(int i4, RegisterSpecSet registerSpecSet) {
        throwIfImmutable();
        Objects.requireNonNull(registerSpecSet, "specs == null");
        try {
            this.blockStarts[i4] = registerSpecSet;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus label");
        }
    }

    public RegisterSpecSet getStarts(BasicBlock basicBlock) {
        return getStarts(basicBlock.getLabel());
    }
}
