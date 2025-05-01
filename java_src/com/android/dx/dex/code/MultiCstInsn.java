package com.android.dx.dex.code;

import com.android.dx.rop.code.RegisterSpecList;
import com.android.dx.rop.code.SourcePosition;
import com.android.dx.rop.cst.Constant;
import com.android.dx.util.Hex;
import java.util.Objects;
/* loaded from: classes.dex */
public final class MultiCstInsn extends FixedSizeInsn {
    private static final int NOT_SET = -1;
    private int classIndex;
    private final Constant[] constants;
    private final int[] index;

    public MultiCstInsn(Dop dop, SourcePosition sourcePosition, RegisterSpecList registerSpecList, Constant[] constantArr) {
        super(dop, sourcePosition, registerSpecList);
        Objects.requireNonNull(constantArr, "constants == null");
        this.constants = constantArr;
        this.index = new int[constantArr.length];
        int i4 = 0;
        while (true) {
            int[] iArr = this.index;
            if (i4 < iArr.length) {
                Objects.requireNonNull(constantArr[i4], "constants[i] == null");
                iArr[i4] = -1;
                i4++;
            } else {
                this.classIndex = -1;
                return;
            }
        }
    }

    @Override // com.android.dx.dex.code.DalvInsn
    protected String argString() {
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < this.constants.length; i4++) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(this.constants[i4].toHuman());
        }
        return sb.toString();
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public String cstComment() {
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < this.constants.length; i4++) {
            if (!hasIndex(i4)) {
                return "";
            }
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(getConstant(i4).typeName());
            sb.append('@');
            int index = getIndex(i4);
            if (index < 65536) {
                sb.append(Hex.u2(index));
            } else {
                sb.append(Hex.u4(index));
            }
        }
        return sb.toString();
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public String cstString() {
        return argString();
    }

    public int getClassIndex() {
        if (hasClassIndex()) {
            return this.classIndex;
        }
        throw new IllegalStateException("class index not yet set");
    }

    public Constant getConstant(int i4) {
        return this.constants[i4];
    }

    public int getIndex(int i4) {
        if (hasIndex(i4)) {
            return this.index[i4];
        }
        throw new IllegalStateException("index not yet set for constant " + i4 + " value = " + this.constants[i4]);
    }

    public int getNumberOfConstants() {
        return this.constants.length;
    }

    public boolean hasClassIndex() {
        return this.classIndex != -1;
    }

    public boolean hasIndex(int i4) {
        return this.index[i4] != -1;
    }

    public void setClassIndex(int i4) {
        if (i4 >= 0) {
            if (!hasClassIndex()) {
                this.classIndex = i4;
                return;
            }
            throw new IllegalStateException("class index already set");
        }
        throw new IllegalArgumentException("index < 0");
    }

    public void setIndex(int i4, int i5) {
        if (i5 >= 0) {
            if (!hasIndex(i4)) {
                this.index[i4] = i5;
                return;
            }
            throw new IllegalStateException("index already set");
        }
        throw new IllegalArgumentException("index < 0");
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public DalvInsn withOpcode(Dop dop) {
        return new MultiCstInsn(dop, getPosition(), getRegisters(), this.constants, this.index, this.classIndex);
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public DalvInsn withRegisters(RegisterSpecList registerSpecList) {
        return new MultiCstInsn(getOpcode(), getPosition(), registerSpecList, this.constants, this.index, this.classIndex);
    }

    private MultiCstInsn(Dop dop, SourcePosition sourcePosition, RegisterSpecList registerSpecList, Constant[] constantArr, int[] iArr, int i4) {
        super(dop, sourcePosition, registerSpecList);
        this.constants = constantArr;
        this.index = iArr;
        this.classIndex = i4;
    }
}
