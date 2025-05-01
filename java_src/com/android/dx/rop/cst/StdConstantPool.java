package com.android.dx.rop.cst;

import com.android.dex.util.ExceptionWithContext;
import com.android.dx.util.Hex;
import com.android.dx.util.MutabilityControl;
/* loaded from: classes2.dex */
public final class StdConstantPool extends MutabilityControl implements ConstantPool {
    private final Constant[] entries;

    public StdConstantPool(int i4) {
        super(i4 > 1);
        if (i4 >= 1) {
            this.entries = new Constant[i4];
            return;
        }
        throw new IllegalArgumentException("size < 1");
    }

    private static Constant throwInvalid(int i4) {
        throw new ExceptionWithContext("invalid constant pool index " + Hex.u2(i4));
    }

    @Override // com.android.dx.rop.cst.ConstantPool
    public Constant get(int i4) {
        try {
            Constant constant = this.entries[i4];
            if (constant == null) {
                throwInvalid(i4);
            }
            return constant;
        } catch (IndexOutOfBoundsException unused) {
            return throwInvalid(i4);
        }
    }

    @Override // com.android.dx.rop.cst.ConstantPool
    public Constant get0Ok(int i4) {
        if (i4 == 0) {
            return null;
        }
        return get(i4);
    }

    @Override // com.android.dx.rop.cst.ConstantPool
    public Constant[] getEntries() {
        return this.entries;
    }

    @Override // com.android.dx.rop.cst.ConstantPool
    public Constant getOrNull(int i4) {
        try {
            return this.entries[i4];
        } catch (IndexOutOfBoundsException unused) {
            return throwInvalid(i4);
        }
    }

    public void set(int i4, Constant constant) {
        int i5;
        Constant constant2;
        throwIfImmutable();
        boolean z4 = constant != null && constant.isCategory2();
        if (i4 >= 1) {
            if (z4) {
                Constant[] constantArr = this.entries;
                if (i4 != constantArr.length - 1) {
                    constantArr[i4 + 1] = null;
                } else {
                    throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                }
            }
            if (constant != null) {
                Constant[] constantArr2 = this.entries;
                if (constantArr2[i4] == null && (constant2 = constantArr2[i4 - 1]) != null && constant2.isCategory2()) {
                    this.entries[i5] = null;
                }
            }
            this.entries[i4] = constant;
            return;
        }
        throw new IllegalArgumentException("n < 1");
    }

    @Override // com.android.dx.rop.cst.ConstantPool
    public int size() {
        return this.entries.length;
    }
}
