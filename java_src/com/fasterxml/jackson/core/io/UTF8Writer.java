package com.fasterxml.jackson.core.io;

import com.android.dx.io.Opcodes;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
/* loaded from: classes.dex */
public final class UTF8Writer extends Writer {
    static final int SURR1_FIRST = 55296;
    static final int SURR1_LAST = 56319;
    static final int SURR2_FIRST = 56320;
    static final int SURR2_LAST = 57343;
    private final IOContext _context;
    private OutputStream _out;
    private byte[] _outBuffer;
    private final int _outBufferEnd;
    private int _outPtr;
    private int _surrogate;

    public UTF8Writer(IOContext iOContext, OutputStream outputStream) {
        this._context = iOContext;
        this._out = outputStream;
        byte[] allocWriteEncodingBuffer = iOContext.allocWriteEncodingBuffer();
        this._outBuffer = allocWriteEncodingBuffer;
        this._outBufferEnd = allocWriteEncodingBuffer.length - 4;
        this._outPtr = 0;
    }

    protected static void illegalSurrogate(int i4) throws IOException {
        throw new IOException(illegalSurrogateDesc(i4));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String illegalSurrogateDesc(int i4) {
        if (i4 > 1114111) {
            return "Illegal character point (0x" + Integer.toHexString(i4) + ") to output; max is 0x10FFFF as per RFC 4627";
        } else if (i4 < 55296) {
            return "Illegal character point (0x" + Integer.toHexString(i4) + ") to output";
        } else if (i4 <= 56319) {
            return "Unmatched first part of surrogate pair (0x" + Integer.toHexString(i4) + ")";
        } else {
            return "Unmatched second part of surrogate pair (0x" + Integer.toHexString(i4) + ")";
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        OutputStream outputStream = this._out;
        if (outputStream != null) {
            int i4 = this._outPtr;
            if (i4 > 0) {
                outputStream.write(this._outBuffer, 0, i4);
                this._outPtr = 0;
            }
            OutputStream outputStream2 = this._out;
            this._out = null;
            byte[] bArr = this._outBuffer;
            if (bArr != null) {
                this._outBuffer = null;
                this._context.releaseWriteEncodingBuffer(bArr);
            }
            outputStream2.close();
            int i5 = this._surrogate;
            this._surrogate = 0;
            if (i5 > 0) {
                illegalSurrogate(i5);
            }
        }
    }

    protected int convertSurrogate(int i4) throws IOException {
        int i5 = this._surrogate;
        this._surrogate = 0;
        if (i4 < 56320 || i4 > 57343) {
            throw new IOException("Broken surrogate pair: first char 0x" + Integer.toHexString(i5) + ", second 0x" + Integer.toHexString(i4) + "; illegal combination");
        }
        return ((i5 - 55296) << 10) + 65536 + (i4 - 56320);
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        OutputStream outputStream = this._out;
        if (outputStream != null) {
            int i4 = this._outPtr;
            if (i4 > 0) {
                outputStream.write(this._outBuffer, 0, i4);
                this._outPtr = 0;
            }
            this._out.flush();
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        write(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c5) throws IOException {
        write(c5);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0025, code lost:
        continue;
     */
    @Override // java.io.Writer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void write(char[] r8, int r9, int r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.UTF8Writer.write(char[], int, int):void");
    }

    @Override // java.io.Writer
    public void write(int i4) throws IOException {
        int i5;
        if (this._surrogate > 0) {
            i4 = convertSurrogate(i4);
        } else if (i4 >= 55296 && i4 <= 57343) {
            if (i4 > 56319) {
                illegalSurrogate(i4);
            }
            this._surrogate = i4;
            return;
        }
        int i6 = this._outPtr;
        if (i6 >= this._outBufferEnd) {
            this._out.write(this._outBuffer, 0, i6);
            this._outPtr = 0;
        }
        if (i4 < 128) {
            byte[] bArr = this._outBuffer;
            int i7 = this._outPtr;
            this._outPtr = i7 + 1;
            bArr[i7] = (byte) i4;
            return;
        }
        int i8 = this._outPtr;
        if (i4 < 2048) {
            byte[] bArr2 = this._outBuffer;
            int i9 = i8 + 1;
            bArr2[i8] = (byte) ((i4 >> 6) | 192);
            i5 = i9 + 1;
            bArr2[i9] = (byte) ((i4 & 63) | 128);
        } else if (i4 <= 65535) {
            byte[] bArr3 = this._outBuffer;
            int i10 = i8 + 1;
            bArr3[i8] = (byte) ((i4 >> 12) | Opcodes.SHL_INT_LIT8);
            int i11 = i10 + 1;
            bArr3[i10] = (byte) (((i4 >> 6) & 63) | 128);
            bArr3[i11] = (byte) ((i4 & 63) | 128);
            i5 = i11 + 1;
        } else {
            if (i4 > 1114111) {
                illegalSurrogate(i4);
            }
            byte[] bArr4 = this._outBuffer;
            int i12 = i8 + 1;
            bArr4[i8] = (byte) ((i4 >> 18) | 240);
            int i13 = i12 + 1;
            bArr4[i12] = (byte) (((i4 >> 12) & 63) | 128);
            int i14 = i13 + 1;
            bArr4[i13] = (byte) (((i4 >> 6) & 63) | 128);
            i5 = i14 + 1;
            bArr4[i14] = (byte) ((i4 & 63) | 128);
        }
        this._outPtr = i5;
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        write(str, 0, str.length());
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0029, code lost:
        continue;
     */
    @Override // java.io.Writer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void write(java.lang.String r8, int r9, int r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.UTF8Writer.write(java.lang.String, int, int):void");
    }
}
