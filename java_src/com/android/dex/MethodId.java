package com.android.dex;

import com.android.dex.Dex;
import com.android.dex.util.Unsigned;
import com.join.mgps.Util.h0;
/* loaded from: classes2.dex */
public final class MethodId implements Comparable<MethodId> {
    private final int declaringClassIndex;
    private final Dex dex;
    private final int nameIndex;
    private final int protoIndex;

    public MethodId(Dex dex, int i4, int i5, int i6) {
        this.dex = dex;
        this.declaringClassIndex = i4;
        this.protoIndex = i5;
        this.nameIndex = i6;
    }

    public int getDeclaringClassIndex() {
        return this.declaringClassIndex;
    }

    public int getNameIndex() {
        return this.nameIndex;
    }

    public int getProtoIndex() {
        return this.protoIndex;
    }

    public String toString() {
        if (this.dex == null) {
            return this.declaringClassIndex + " " + this.protoIndex + " " + this.nameIndex;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.dex.typeNames().get(this.declaringClassIndex));
        sb.append(h0.f27805a);
        sb.append(this.dex.strings().get(this.nameIndex));
        Dex dex = this.dex;
        sb.append(dex.readTypeList(dex.protoIds().get(this.protoIndex).getParametersOffset()));
        return sb.toString();
    }

    public void writeTo(Dex.Section section) {
        section.writeUnsignedShort(this.declaringClassIndex);
        section.writeUnsignedShort(this.protoIndex);
        section.writeInt(this.nameIndex);
    }

    @Override // java.lang.Comparable
    public int compareTo(MethodId methodId) {
        int i4 = this.declaringClassIndex;
        int i5 = methodId.declaringClassIndex;
        if (i4 != i5) {
            return Unsigned.compare(i4, i5);
        }
        int i6 = this.nameIndex;
        int i7 = methodId.nameIndex;
        if (i6 != i7) {
            return Unsigned.compare(i6, i7);
        }
        return Unsigned.compare(this.protoIndex, methodId.protoIndex);
    }
}
