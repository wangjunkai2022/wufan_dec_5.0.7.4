package com.android.dex;

import com.android.dex.Dex;
import com.android.dex.util.Unsigned;
import com.join.mgps.Util.h0;
/* loaded from: classes2.dex */
public final class FieldId implements Comparable<FieldId> {
    private final int declaringClassIndex;
    private final Dex dex;
    private final int nameIndex;
    private final int typeIndex;

    public FieldId(Dex dex, int i4, int i5, int i6) {
        this.dex = dex;
        this.declaringClassIndex = i4;
        this.typeIndex = i5;
        this.nameIndex = i6;
    }

    public int getDeclaringClassIndex() {
        return this.declaringClassIndex;
    }

    public int getNameIndex() {
        return this.nameIndex;
    }

    public int getTypeIndex() {
        return this.typeIndex;
    }

    public String toString() {
        if (this.dex == null) {
            return this.declaringClassIndex + " " + this.typeIndex + " " + this.nameIndex;
        }
        return this.dex.typeNames().get(this.typeIndex) + h0.f27805a + this.dex.strings().get(this.nameIndex);
    }

    public void writeTo(Dex.Section section) {
        section.writeUnsignedShort(this.declaringClassIndex);
        section.writeUnsignedShort(this.typeIndex);
        section.writeInt(this.nameIndex);
    }

    @Override // java.lang.Comparable
    public int compareTo(FieldId fieldId) {
        int i4 = this.declaringClassIndex;
        int i5 = fieldId.declaringClassIndex;
        if (i4 != i5) {
            return Unsigned.compare(i4, i5);
        }
        int i6 = this.nameIndex;
        int i7 = fieldId.nameIndex;
        if (i6 != i7) {
            return Unsigned.compare(i6, i7);
        }
        return Unsigned.compare(this.typeIndex, fieldId.typeIndex);
    }
}
