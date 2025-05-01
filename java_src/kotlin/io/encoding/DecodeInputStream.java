package kotlin.io.encoding;

import java.io.IOException;
import java.io.InputStream;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: Base64IOStream.kt */
@ExperimentalEncodingApi
/* loaded from: classes6.dex */
final class DecodeInputStream extends InputStream {
    @NotNull
    private final Base64 base64;
    @NotNull
    private final byte[] byteBuffer;
    private int byteBufferEndIndex;
    private int byteBufferStartIndex;
    @NotNull
    private final InputStream input;
    private boolean isClosed;
    private boolean isEOF;
    @NotNull
    private final byte[] singleByteBuffer;
    @NotNull
    private final byte[] symbolBuffer;

    public DecodeInputStream(@NotNull InputStream input, @NotNull Base64 base64) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(base64, "base64");
        this.input = input;
        this.base64 = base64;
        this.singleByteBuffer = new byte[1];
        this.symbolBuffer = new byte[1024];
        this.byteBuffer = new byte[1024];
    }

    private final void copyByteBufferInto(byte[] bArr, int i4, int i5) {
        byte[] bArr2 = this.byteBuffer;
        int i6 = this.byteBufferStartIndex;
        ArraysKt.copyInto(bArr2, bArr, i4, i6, i6 + i5);
        this.byteBufferStartIndex += i5;
        resetByteBufferIfEmpty();
    }

    private final int decodeSymbolBufferInto(byte[] bArr, int i4, int i5, int i6) {
        int i7 = this.byteBufferEndIndex;
        this.byteBufferEndIndex = i7 + this.base64.decodeIntoByteArray(this.symbolBuffer, this.byteBuffer, i7, 0, i6);
        int min = Math.min(getByteBufferLength(), i5 - i4);
        copyByteBufferInto(bArr, i4, min);
        shiftByteBufferToStartIfNeeded();
        return min;
    }

    private final int getByteBufferLength() {
        return this.byteBufferEndIndex - this.byteBufferStartIndex;
    }

    private final int handlePaddingSymbol(int i4) {
        this.symbolBuffer[i4] = 61;
        if ((i4 & 3) == 2) {
            int readNextSymbol = readNextSymbol();
            if (readNextSymbol >= 0) {
                this.symbolBuffer[i4 + 1] = (byte) readNextSymbol;
            }
            return i4 + 2;
        }
        return i4 + 1;
    }

    private final int readNextSymbol() {
        int read;
        if (!this.base64.isMimeScheme$kotlin_stdlib()) {
            return this.input.read();
        }
        do {
            read = this.input.read();
            if (read == -1) {
                break;
            }
        } while (!Base64Kt.isInMimeAlphabet(read));
        return read;
    }

    private final void resetByteBufferIfEmpty() {
        if (this.byteBufferStartIndex == this.byteBufferEndIndex) {
            this.byteBufferStartIndex = 0;
            this.byteBufferEndIndex = 0;
        }
    }

    private final void shiftByteBufferToStartIfNeeded() {
        byte[] bArr = this.byteBuffer;
        int length = bArr.length;
        int i4 = this.byteBufferEndIndex;
        if ((this.symbolBuffer.length / 4) * 3 > length - i4) {
            ArraysKt.copyInto(bArr, bArr, 0, this.byteBufferStartIndex, i4);
            this.byteBufferEndIndex -= this.byteBufferStartIndex;
            this.byteBufferStartIndex = 0;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
        this.input.close();
    }

    @Override // java.io.InputStream
    public int read() {
        int i4 = this.byteBufferStartIndex;
        if (i4 < this.byteBufferEndIndex) {
            int i5 = this.byteBuffer[i4] & 255;
            this.byteBufferStartIndex = i4 + 1;
            resetByteBufferIfEmpty();
            return i5;
        }
        int read = read(this.singleByteBuffer, 0, 1);
        if (read != -1) {
            if (read == 1) {
                return this.singleByteBuffer[0] & 255;
            }
            throw new IllegalStateException("Unreachable".toString());
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(@NotNull byte[] destination, int i4, int i5) {
        int i6;
        boolean z4;
        boolean z5;
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (i4 >= 0 && i5 >= 0 && (i6 = i4 + i5) <= destination.length) {
            if (!this.isClosed) {
                if (this.isEOF) {
                    return -1;
                }
                if (i5 == 0) {
                    return 0;
                }
                if (getByteBufferLength() >= i5) {
                    copyByteBufferInto(destination, i4, i5);
                    return i5;
                }
                int byteBufferLength = ((((i5 - getByteBufferLength()) + 3) - 1) / 3) * 4;
                int i7 = i4;
                while (true) {
                    z4 = this.isEOF;
                    if (z4 || byteBufferLength <= 0) {
                        break;
                    }
                    int min = Math.min(this.symbolBuffer.length, byteBufferLength);
                    int i8 = 0;
                    while (true) {
                        z5 = this.isEOF;
                        if (z5 || i8 >= min) {
                            break;
                        }
                        int readNextSymbol = readNextSymbol();
                        if (readNextSymbol == -1) {
                            this.isEOF = true;
                        } else if (readNextSymbol != 61) {
                            this.symbolBuffer[i8] = (byte) readNextSymbol;
                            i8++;
                        } else {
                            i8 = handlePaddingSymbol(i8);
                            this.isEOF = true;
                        }
                    }
                    if (z5 || i8 == min) {
                        byteBufferLength -= i8;
                        i7 += decodeSymbolBufferInto(destination, i7, i6, i8);
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
                if (i7 == i4 && z4) {
                    return -1;
                }
                return i7 - i4;
            }
            throw new IOException("The input stream is closed.");
        }
        throw new IndexOutOfBoundsException("offset: " + i4 + ", length: " + i5 + ", buffer size: " + destination.length);
    }
}
