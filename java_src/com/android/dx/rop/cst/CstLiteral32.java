package com.android.dx.rop.cst;
/* loaded from: classes.dex */
public abstract class CstLiteral32 extends CstLiteralBits {
    private final int bits;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CstLiteral32(int i4) {
        this.bits = i4;
    }

    @Override // com.android.dx.rop.cst.Constant
    protected int compareTo0(Constant constant) {
        int i4 = ((CstLiteral32) constant).bits;
        int i5 = this.bits;
        if (i5 < i4) {
            return -1;
        }
        return i5 > i4 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        return obj != null && getClass() == obj.getClass() && this.bits == ((CstLiteral32) obj).bits;
    }

    @Override // com.android.dx.rop.cst.CstLiteralBits
    public final boolean fitsInInt() {
        return true;
    }

    @Override // com.android.dx.rop.cst.CstLiteralBits
    public final int getIntBits() {
        return this.bits;
    }

    @Override // com.android.dx.rop.cst.CstLiteralBits
    public final long getLongBits() {
        return this.bits;
    }

    public final int hashCode() {
        return this.bits;
    }

    @Override // com.android.dx.rop.cst.Constant
    public final boolean isCategory2() {
        return false;
    }
}
