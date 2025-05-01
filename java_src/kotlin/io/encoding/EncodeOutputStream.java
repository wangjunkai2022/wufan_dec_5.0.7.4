package kotlin.io.encoding;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: Base64IOStream.kt */
@ExperimentalEncodingApi
/* loaded from: classes6.dex */
final class EncodeOutputStream extends OutputStream {
    @NotNull
    private final Base64 base64;
    @NotNull
    private final byte[] byteBuffer;
    private int byteBufferLength;
    private boolean isClosed;
    private int lineLength;
    @NotNull
    private final OutputStream output;
    @NotNull
    private final byte[] symbolBuffer;

    public EncodeOutputStream(@NotNull OutputStream output, @NotNull Base64 base64) {
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(base64, "base64");
        this.output = output;
        this.base64 = base64;
        this.lineLength = base64.isMimeScheme$kotlin_stdlib() ? 76 : -1;
        this.symbolBuffer = new byte[1024];
        this.byteBuffer = new byte[3];
    }

    private final void checkOpen() {
        if (this.isClosed) {
            throw new IOException("The output stream is closed.");
        }
    }

    private final int copyIntoByteBuffer(byte[] bArr, int i4, int i5) {
        int min = Math.min(3 - this.byteBufferLength, i5 - i4);
        ArraysKt.copyInto(bArr, this.byteBuffer, this.byteBufferLength, i4, i4 + min);
        int i6 = this.byteBufferLength + min;
        this.byteBufferLength = i6;
        if (i6 == 3) {
            encodeByteBufferIntoOutput();
        }
        return min;
    }

    private final void encodeByteBufferIntoOutput() {
        if (encodeIntoOutput(this.byteBuffer, 0, this.byteBufferLength) == 4) {
            this.byteBufferLength = 0;
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final int encodeIntoOutput(byte[] bArr, int i4, int i5) {
        int encodeIntoByteArray = this.base64.encodeIntoByteArray(bArr, this.symbolBuffer, 0, i4, i5);
        if (this.lineLength == 0) {
            this.output.write(Base64.Default.getMimeLineSeparatorSymbols$kotlin_stdlib());
            this.lineLength = 76;
            if (!(encodeIntoByteArray <= 76)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        this.output.write(this.symbolBuffer, 0, encodeIntoByteArray);
        this.lineLength -= encodeIntoByteArray;
        return encodeIntoByteArray;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
        if (this.byteBufferLength != 0) {
            encodeByteBufferIntoOutput();
        }
        this.output.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        checkOpen();
        this.output.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i4) {
        checkOpen();
        byte[] bArr = this.byteBuffer;
        int i5 = this.byteBufferLength;
        int i6 = i5 + 1;
        this.byteBufferLength = i6;
        bArr[i5] = (byte) i4;
        if (i6 == 3) {
            encodeByteBufferIntoOutput();
        }
    }

    @Override // java.io.OutputStream
    public void write(@NotNull byte[] source, int i4, int i5) {
        int i6;
        Intrinsics.checkNotNullParameter(source, "source");
        checkOpen();
        if (i4 < 0 || i5 < 0 || (i6 = i4 + i5) > source.length) {
            throw new IndexOutOfBoundsException("offset: " + i4 + ", length: " + i5 + ", source size: " + source.length);
        } else if (i5 == 0) {
        } else {
            int i7 = this.byteBufferLength;
            if (i7 < 3) {
                if (i7 != 0) {
                    i4 += copyIntoByteBuffer(source, i4, i6);
                    if (this.byteBufferLength != 0) {
                        return;
                    }
                }
                while (i4 + 3 <= i6) {
                    int min = Math.min((this.base64.isMimeScheme$kotlin_stdlib() ? this.lineLength : this.symbolBuffer.length) / 4, (i6 - i4) / 3);
                    int i8 = (min * 3) + i4;
                    if (!(encodeIntoOutput(source, i4, i8) == min * 4)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    i4 = i8;
                }
                ArraysKt.copyInto(source, this.byteBuffer, 0, i4, i6);
                this.byteBufferLength = i6 - i4;
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }
}
