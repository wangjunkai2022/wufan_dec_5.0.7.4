package com.android.dx.io.instructions;
/* loaded from: classes2.dex */
public final class ShortArrayCodeOutput extends BaseCodeCursor implements CodeOutput {
    private final short[] array;

    public ShortArrayCodeOutput(int i4) {
        if (i4 >= 0) {
            this.array = new short[i4];
            return;
        }
        throw new IllegalArgumentException("maxSize < 0");
    }

    public short[] getArray() {
        int cursor = cursor();
        short[] sArr = this.array;
        if (cursor == sArr.length) {
            return sArr;
        }
        short[] sArr2 = new short[cursor];
        System.arraycopy(sArr, 0, sArr2, 0, cursor);
        return sArr2;
    }

    @Override // com.android.dx.io.instructions.CodeOutput
    public void write(short s4) {
        this.array[cursor()] = s4;
        advance(1);
    }

    @Override // com.android.dx.io.instructions.CodeOutput
    public void writeInt(int i4) {
        write((short) i4);
        write((short) (i4 >> 16));
    }

    @Override // com.android.dx.io.instructions.CodeOutput
    public void writeLong(long j4) {
        write((short) j4);
        write((short) (j4 >> 16));
        write((short) (j4 >> 32));
        write((short) (j4 >> 48));
    }

    @Override // com.android.dx.io.instructions.CodeOutput
    public void write(short s4, short s5) {
        write(s4);
        write(s5);
    }

    @Override // com.android.dx.io.instructions.CodeOutput
    public void write(short s4, short s5, short s6) {
        write(s4);
        write(s5);
        write(s6);
    }

    @Override // com.android.dx.io.instructions.CodeOutput
    public void write(short s4, short s5, short s6, short s7) {
        write(s4);
        write(s5);
        write(s6);
        write(s7);
    }

    @Override // com.android.dx.io.instructions.CodeOutput
    public void write(short s4, short s5, short s6, short s7, short s8) {
        write(s4);
        write(s5);
        write(s6);
        write(s7);
        write(s8);
    }

    @Override // com.android.dx.io.instructions.CodeOutput
    public void write(byte[] bArr) {
        boolean z4 = true;
        int i4 = 0;
        for (byte b5 : bArr) {
            if (z4) {
                i4 = b5 & 255;
                z4 = false;
            } else {
                int i5 = (b5 << 8) | i4;
                write((short) i5);
                i4 = i5;
                z4 = true;
            }
        }
        if (z4) {
            return;
        }
        write((short) i4);
    }

    @Override // com.android.dx.io.instructions.CodeOutput
    public void write(short[] sArr) {
        for (short s4 : sArr) {
            write(s4);
        }
    }

    @Override // com.android.dx.io.instructions.CodeOutput
    public void write(int[] iArr) {
        for (int i4 : iArr) {
            writeInt(i4);
        }
    }

    @Override // com.android.dx.io.instructions.CodeOutput
    public void write(long[] jArr) {
        for (long j4 : jArr) {
            writeLong(j4);
        }
    }
}
