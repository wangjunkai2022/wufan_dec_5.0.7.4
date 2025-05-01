package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.base.GeneratorBase;
import com.papa91.arc.ext.Log;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
/* loaded from: classes.dex */
public class UTF32Reader extends Reader {
    protected static final int LAST_VALID_UNICODE_CHAR = 1114111;
    protected static final char NC = 0;
    protected final boolean _bigEndian;
    protected byte[] _buffer;
    protected int _byteCount;
    protected int _charCount;
    protected final IOContext _context;
    protected InputStream _in;
    protected int _length;
    protected final boolean _managedBuffers;
    protected int _ptr;
    protected char _surrogate = 0;
    protected char[] _tmpBuf;

    public UTF32Reader(IOContext iOContext, InputStream inputStream, byte[] bArr, int i4, int i5, boolean z4) {
        this._context = iOContext;
        this._in = inputStream;
        this._buffer = bArr;
        this._ptr = i4;
        this._length = i5;
        this._bigEndian = z4;
        this._managedBuffers = inputStream != null;
    }

    private void freeBuffers() {
        byte[] bArr = this._buffer;
        if (bArr != null) {
            this._buffer = null;
            this._context.releaseReadIOBuffer(bArr);
        }
    }

    private boolean loadMore(int i4) throws IOException {
        int read;
        this._byteCount += this._length - i4;
        if (i4 > 0) {
            int i5 = this._ptr;
            if (i5 > 0) {
                byte[] bArr = this._buffer;
                System.arraycopy(bArr, i5, bArr, 0, i4);
                this._ptr = 0;
            }
            this._length = i4;
        } else {
            this._ptr = 0;
            InputStream inputStream = this._in;
            int read2 = inputStream == null ? -1 : inputStream.read(this._buffer);
            if (read2 < 1) {
                this._length = 0;
                if (read2 < 0) {
                    if (this._managedBuffers) {
                        freeBuffers();
                    }
                    return false;
                }
                reportStrangeStream();
            }
            this._length = read2;
        }
        while (true) {
            int i6 = this._length;
            if (i6 >= 4) {
                return true;
            }
            InputStream inputStream2 = this._in;
            if (inputStream2 == null) {
                read = -1;
            } else {
                byte[] bArr2 = this._buffer;
                read = inputStream2.read(bArr2, i6, bArr2.length - i6);
            }
            if (read < 1) {
                if (read < 0) {
                    if (this._managedBuffers) {
                        freeBuffers();
                    }
                    reportUnexpectedEOF(this._length, 4);
                }
                reportStrangeStream();
            }
            this._length += read;
        }
    }

    private void reportBounds(char[] cArr, int i4, int i5) throws IOException {
        throw new ArrayIndexOutOfBoundsException("read(buf," + i4 + "," + i5 + "), cbuf[" + cArr.length + "]");
    }

    private void reportInvalid(int i4, int i5, String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid UTF-32 character 0x");
        sb.append(Integer.toHexString(i4));
        sb.append(str);
        sb.append(" at char #");
        sb.append(this._charCount + i5);
        sb.append(", byte #");
        sb.append((this._byteCount + this._ptr) - 1);
        sb.append(")");
        throw new CharConversionException(sb.toString());
    }

    private void reportStrangeStream() throws IOException {
        throw new IOException("Strange I/O stream, returned 0 bytes on read");
    }

    private void reportUnexpectedEOF(int i4, int i5) throws IOException {
        int i6 = this._charCount;
        throw new CharConversionException("Unexpected EOF in the middle of a 4-byte UTF-32 char: got " + i4 + ", needed " + i5 + ", at char #" + i6 + ", byte #" + (this._byteCount + i4) + ")");
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this._in;
        if (inputStream != null) {
            this._in = null;
            freeBuffers();
            inputStream.close();
        }
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        if (this._tmpBuf == null) {
            this._tmpBuf = new char[1];
        }
        if (read(this._tmpBuf, 0, 1) < 1) {
            return -1;
        }
        return this._tmpBuf[0];
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i4, int i5) throws IOException {
        int i6;
        int i7;
        int i8;
        int i9;
        if (this._buffer == null) {
            return -1;
        }
        if (i5 < 1) {
            return i5;
        }
        if (i4 < 0 || i4 + i5 > cArr.length) {
            reportBounds(cArr, i4, i5);
        }
        int i10 = i5 + i4;
        char c5 = this._surrogate;
        if (c5 != 0) {
            i6 = i4 + 1;
            cArr[i4] = c5;
            this._surrogate = (char) 0;
        } else {
            int i11 = this._length - this._ptr;
            if (i11 < 4 && !loadMore(i11)) {
                if (i11 == 0) {
                    return -1;
                }
                reportUnexpectedEOF(this._length - this._ptr, 4);
            }
            i6 = i4;
        }
        int i12 = this._length - 4;
        while (i6 < i10) {
            int i13 = this._ptr;
            if (this._bigEndian) {
                byte[] bArr = this._buffer;
                i7 = (bArr[i13] << 8) | (bArr[i13 + 1] & 255);
                i8 = (bArr[i13 + 3] & 255) | ((bArr[i13 + 2] & 255) << 8);
            } else {
                byte[] bArr2 = this._buffer;
                int i14 = (bArr2[i13] & 255) | ((bArr2[i13 + 1] & 255) << 8);
                i7 = (bArr2[i13 + 3] << 8) | (bArr2[i13 + 2] & 255);
                i8 = i14;
            }
            this._ptr = i13 + 4;
            if (i7 != 0) {
                int i15 = 65535 & i7;
                int i16 = i8 | ((i15 - 1) << 16);
                if (i15 > 16) {
                    reportInvalid(i16, i6 - i4, String.format(" (above 0x%08x)", Integer.valueOf((int) LAST_VALID_UNICODE_CHAR)));
                }
                i9 = i6 + 1;
                cArr[i6] = (char) ((i16 >> 10) + GeneratorBase.SURR1_FIRST);
                int i17 = 56320 | (i16 & Log.LogWrapper.MAX_MSG_LEN);
                if (i9 >= i10) {
                    this._surrogate = (char) i16;
                    i6 = i9;
                    break;
                }
                i8 = i17;
                i6 = i9;
            }
            i9 = i6 + 1;
            cArr[i6] = (char) i8;
            if (this._ptr > i12) {
                i6 = i9;
                break;
            }
            i6 = i9;
        }
        int i18 = i6 - i4;
        this._charCount += i18;
        return i18;
    }
}
