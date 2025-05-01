package com.android.dx.rop.code;

import com.android.dx.rop.code.Insn;
import com.android.dx.rop.cst.CstMethodRef;
import com.android.dx.rop.cst.CstNat;
import com.android.dx.rop.cst.CstProtoRef;
import com.android.dx.rop.cst.CstString;
import com.android.dx.rop.cst.CstType;
import com.android.dx.rop.type.Type;
import com.android.dx.rop.type.TypeList;
import java.util.Objects;
/* loaded from: classes.dex */
public class InvokePolymorphicInsn extends Insn {
    private final CstMethodRef callSiteMethod;
    private final CstProtoRef callSiteProto;
    private final TypeList catches;
    private final CstMethodRef polymorphicMethod;
    private static final CstString DEFAULT_DESCRIPTOR = new CstString("([Ljava/lang/Object;)Ljava/lang/Object;");
    private static final CstString VARHANDLE_SET_DESCRIPTOR = new CstString("([Ljava/lang/Object;)V");
    private static final CstString VARHANDLE_COMPARE_AND_SET_DESCRIPTOR = new CstString("([Ljava/lang/Object;)Z");

    public InvokePolymorphicInsn(Rop rop, SourcePosition sourcePosition, RegisterSpecList registerSpecList, TypeList typeList, CstMethodRef cstMethodRef) {
        super(rop, sourcePosition, null, registerSpecList);
        if (rop.getBranchingness() == 6) {
            Objects.requireNonNull(typeList, "catches == null");
            this.catches = typeList;
            Objects.requireNonNull(cstMethodRef, "callSiteMethod == null");
            if (cstMethodRef.isSignaturePolymorphic()) {
                this.callSiteMethod = cstMethodRef;
                this.polymorphicMethod = makePolymorphicMethod(cstMethodRef);
                this.callSiteProto = makeCallSiteProto(cstMethodRef);
                return;
            }
            throw new IllegalArgumentException("callSiteMethod is not signature polymorphic");
        }
        throw new IllegalArgumentException("opcode with invalid branchingness: " + rop.getBranchingness());
    }

    private static CstProtoRef makeCallSiteProto(CstMethodRef cstMethodRef) {
        return new CstProtoRef(cstMethodRef.getPrototype(true));
    }

    private static CstMethodRef makePolymorphicMethod(CstMethodRef cstMethodRef) {
        CstType definingClass = cstMethodRef.getDefiningClass();
        CstString name = cstMethodRef.getNat().getName();
        String string = cstMethodRef.getNat().getName().getString();
        if (definingClass.equals(CstType.METHOD_HANDLE) && (string.equals("invoke") || string.equals("invokeExact"))) {
            return new CstMethodRef(definingClass, new CstNat(name, DEFAULT_DESCRIPTOR));
        }
        if (definingClass.equals(CstType.VAR_HANDLE)) {
            string.hashCode();
            char c5 = 65535;
            switch (string.hashCode()) {
                case -1946504908:
                    if (string.equals("getAndBitwiseOrRelease")) {
                        c5 = 0;
                        break;
                    }
                    break;
                case -1686727776:
                    if (string.equals("getAndBitwiseAndRelease")) {
                        c5 = 1;
                        break;
                    }
                    break;
                case -1671098288:
                    if (string.equals("compareAndSet")) {
                        c5 = 2;
                        break;
                    }
                    break;
                case -1292078254:
                    if (string.equals("compareAndExchangeRelease")) {
                        c5 = 3;
                        break;
                    }
                    break;
                case -1117944904:
                    if (string.equals("weakCompareAndSet")) {
                        c5 = 4;
                        break;
                    }
                    break;
                case -1103072857:
                    if (string.equals("getAndAddRelease")) {
                        c5 = 5;
                        break;
                    }
                    break;
                case -1032914329:
                    if (string.equals("getAndBitwiseAnd")) {
                        c5 = 6;
                        break;
                    }
                    break;
                case -1032892181:
                    if (string.equals("getAndBitwiseXor")) {
                        c5 = 7;
                        break;
                    }
                    break;
                case -794517348:
                    if (string.equals("getAndBitwiseXorRelease")) {
                        c5 = '\b';
                        break;
                    }
                    break;
                case -567150350:
                    if (string.equals("weakCompareAndSetPlain")) {
                        c5 = '\t';
                        break;
                    }
                    break;
                case -240822786:
                    if (string.equals("weakCompareAndSetAcquire")) {
                        c5 = '\n';
                        break;
                    }
                    break;
                case -230706875:
                    if (string.equals("setRelease")) {
                        c5 = 11;
                        break;
                    }
                    break;
                case -127361888:
                    if (string.equals("getAcquire")) {
                        c5 = '\f';
                        break;
                    }
                    break;
                case -37641530:
                    if (string.equals("getAndSetRelease")) {
                        c5 = '\r';
                        break;
                    }
                    break;
                case 102230:
                    if (string.equals("get")) {
                        c5 = 14;
                        break;
                    }
                    break;
                case 113762:
                    if (string.equals("set")) {
                        c5 = 15;
                        break;
                    }
                    break;
                case 93645315:
                    if (string.equals("getAndBitwiseOrAcquire")) {
                        c5 = 16;
                        break;
                    }
                    break;
                case 101293086:
                    if (string.equals("setVolatile")) {
                        c5 = 17;
                        break;
                    }
                    break;
                case 189872914:
                    if (string.equals("getVolatile")) {
                        c5 = 18;
                        break;
                    }
                    break;
                case 282707520:
                    if (string.equals("getAndAdd")) {
                        c5 = 19;
                        break;
                    }
                    break;
                case 282724865:
                    if (string.equals("getAndSet")) {
                        c5 = 20;
                        break;
                    }
                    break;
                case 353422447:
                    if (string.equals("getAndBitwiseAndAcquire")) {
                        c5 = 21;
                        break;
                    }
                    break;
                case 470702883:
                    if (string.equals("setOpaque")) {
                        c5 = 22;
                        break;
                    }
                    break;
                case 685319959:
                    if (string.equals("getOpaque")) {
                        c5 = 23;
                        break;
                    }
                    break;
                case 748071969:
                    if (string.equals("compareAndExchangeAcquire")) {
                        c5 = 24;
                        break;
                    }
                    break;
                case 937077366:
                    if (string.equals("getAndAddAcquire")) {
                        c5 = 25;
                        break;
                    }
                    break;
                case 1245632875:
                    if (string.equals("getAndBitwiseXorAcquire")) {
                        c5 = 26;
                        break;
                    }
                    break;
                case 1352153939:
                    if (string.equals("getAndBitwiseOr")) {
                        c5 = 27;
                        break;
                    }
                    break;
                case 1483964149:
                    if (string.equals("compareAndExchange")) {
                        c5 = 28;
                        break;
                    }
                    break;
                case 2002508693:
                    if (string.equals("getAndSetAcquire")) {
                        c5 = 29;
                        break;
                    }
                    break;
                case 2013994287:
                    if (string.equals("weakCompareAndSetRelease")) {
                        c5 = 30;
                        break;
                    }
                    break;
            }
            switch (c5) {
                case 0:
                case 1:
                case 3:
                case 5:
                case 6:
                case 7:
                case '\b':
                case '\f':
                case '\r':
                case 14:
                case 16:
                case 18:
                case 19:
                case 20:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    return new CstMethodRef(definingClass, new CstNat(name, DEFAULT_DESCRIPTOR));
                case 2:
                case 4:
                case '\t':
                case '\n':
                case 30:
                    return new CstMethodRef(definingClass, new CstNat(name, VARHANDLE_COMPARE_AND_SET_DESCRIPTOR));
                case 11:
                case 15:
                case 17:
                case 22:
                    return new CstMethodRef(definingClass, new CstNat(name, VARHANDLE_SET_DESCRIPTOR));
            }
        }
        throw new IllegalArgumentException("Unknown signature polymorphic method: " + cstMethodRef.toHuman());
    }

    @Override // com.android.dx.rop.code.Insn
    public void accept(Insn.Visitor visitor) {
        visitor.visitInvokePolymorphicInsn(this);
    }

    public CstMethodRef getCallSiteMethod() {
        return this.callSiteMethod;
    }

    public CstProtoRef getCallSiteProto() {
        return this.callSiteProto;
    }

    @Override // com.android.dx.rop.code.Insn
    public TypeList getCatches() {
        return this.catches;
    }

    @Override // com.android.dx.rop.code.Insn
    public String getInlineString() {
        return getPolymorphicMethod().toString() + " " + getCallSiteProto().toString() + " " + ThrowingInsn.toCatchString(this.catches);
    }

    public CstMethodRef getPolymorphicMethod() {
        return this.polymorphicMethod;
    }

    @Override // com.android.dx.rop.code.Insn
    public Insn withAddedCatch(Type type) {
        return new InvokePolymorphicInsn(getOpcode(), getPosition(), getSources(), this.catches.withAddedType(type), getCallSiteMethod());
    }

    @Override // com.android.dx.rop.code.Insn
    public Insn withNewRegisters(RegisterSpec registerSpec, RegisterSpecList registerSpecList) {
        return new InvokePolymorphicInsn(getOpcode(), getPosition(), registerSpecList, this.catches, getCallSiteMethod());
    }

    @Override // com.android.dx.rop.code.Insn
    public Insn withRegisterOffset(int i4) {
        return new InvokePolymorphicInsn(getOpcode(), getPosition(), getSources().withOffset(i4), this.catches, getCallSiteMethod());
    }
}
