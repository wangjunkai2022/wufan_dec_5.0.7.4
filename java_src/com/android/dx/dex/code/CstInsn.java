package com.android.dx.dex.code;

import com.android.dx.rop.code.RegisterSpecList;
import com.android.dx.rop.code.SourcePosition;
import com.android.dx.rop.cst.Constant;
import com.android.dx.rop.cst.CstString;
import com.android.dx.util.Hex;
import java.util.Objects;
/* loaded from: classes.dex */
public final class CstInsn extends FixedSizeInsn {
    private int classIndex;
    private final Constant constant;
    private int index;

    public CstInsn(Dop dop, SourcePosition sourcePosition, RegisterSpecList registerSpecList, Constant constant) {
        super(dop, sourcePosition, registerSpecList);
        Objects.requireNonNull(constant, "constant == null");
        this.constant = constant;
        this.index = -1;
        this.classIndex = -1;
    }

    @Override // com.android.dx.dex.code.DalvInsn
    protected String argString() {
        return this.constant.toHuman();
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public String cstComment() {
        if (hasIndex()) {
            StringBuilder sb = new StringBuilder(20);
            sb.append(getConstant().typeName());
            sb.append('@');
            int i4 = this.index;
            if (i4 < 65536) {
                sb.append(Hex.u2(i4));
            } else {
                sb.append(Hex.u4(i4));
            }
            return sb.toString();
        }
        return "";
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public String cstString() {
        Constant constant = this.constant;
        if (constant instanceof CstString) {
            return ((CstString) constant).toQuoted();
        }
        return constant.toHuman();
    }

    public int getClassIndex() {
        int i4 = this.classIndex;
        if (i4 >= 0) {
            return i4;
        }
        throw new IllegalStateException("class index not yet set");
    }

    public Constant getConstant() {
        return this.constant;
    }

    public int getIndex() {
        int i4 = this.index;
        if (i4 >= 0) {
            return i4;
        }
        throw new IllegalStateException("index not yet set for " + this.constant);
    }

    public boolean hasClassIndex() {
        return this.classIndex >= 0;
    }

    public boolean hasIndex() {
        return this.index >= 0;
    }

    public void setClassIndex(int i4) {
        if (i4 >= 0) {
            if (this.classIndex < 0) {
                this.classIndex = i4;
                return;
            }
            throw new IllegalStateException("class index already set");
        }
        throw new IllegalArgumentException("index < 0");
    }

    public void setIndex(int i4) {
        if (i4 >= 0) {
            if (this.index < 0) {
                this.index = i4;
                return;
            }
            throw new IllegalStateException("index already set");
        }
        throw new IllegalArgumentException("index < 0");
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public DalvInsn withOpcode(Dop dop) {
        CstInsn cstInsn = new CstInsn(dop, getPosition(), getRegisters(), this.constant);
        int i4 = this.index;
        if (i4 >= 0) {
            cstInsn.setIndex(i4);
        }
        int i5 = this.classIndex;
        if (i5 >= 0) {
            cstInsn.setClassIndex(i5);
        }
        return cstInsn;
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public DalvInsn withRegisters(RegisterSpecList registerSpecList) {
        CstInsn cstInsn = new CstInsn(getOpcode(), getPosition(), registerSpecList, this.constant);
        int i4 = this.index;
        if (i4 >= 0) {
            cstInsn.setIndex(i4);
        }
        int i5 = this.classIndex;
        if (i5 >= 0) {
            cstInsn.setClassIndex(i5);
        }
        return cstInsn;
    }
}
