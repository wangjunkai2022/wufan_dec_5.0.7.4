package com.android.dex;

import com.android.dex.Dex;
import com.android.dex.util.ByteArrayByteInput;
import com.android.dex.util.ByteInput;
/* loaded from: classes2.dex */
public final class EncodedValue implements Comparable<EncodedValue> {
    private final byte[] data;

    public EncodedValue(byte[] bArr) {
        this.data = bArr;
    }

    public ByteInput asByteInput() {
        return new ByteArrayByteInput(this.data);
    }

    public byte[] getBytes() {
        return this.data;
    }

    public String toString() {
        return Integer.toHexString(this.data[0] & 255) + "...(" + this.data.length + ")";
    }

    public void writeTo(Dex.Section section) {
        section.write(this.data);
    }

    @Override // java.lang.Comparable
    public int compareTo(EncodedValue encodedValue) {
        int min = Math.min(this.data.length, encodedValue.data.length);
        for (int i4 = 0; i4 < min; i4++) {
            byte[] bArr = this.data;
            byte b5 = bArr[i4];
            byte[] bArr2 = encodedValue.data;
            if (b5 != bArr2[i4]) {
                return (bArr[i4] & 255) - (bArr2[i4] & 255);
            }
        }
        return this.data.length - encodedValue.data.length;
    }
}
