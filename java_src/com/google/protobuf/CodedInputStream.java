package com.google.protobuf;

import com.google.protobuf.MessageLite;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;
/* loaded from: classes3.dex */
public final class CodedInputStream {
    private static final int BUFFER_SIZE = 4096;
    private static final int DEFAULT_RECURSION_LIMIT = 100;
    private static final int DEFAULT_SIZE_LIMIT = 67108864;
    private final byte[] buffer;
    private final boolean bufferIsImmutable;
    private int bufferPos;
    private int bufferSize;
    private int bufferSizeAfterLimit;
    private int currentLimit;
    private boolean enableAliasing;
    private final InputStream input;
    private int lastTag;
    private int recursionDepth;
    private int recursionLimit;
    private RefillCallback refillCallback;
    private int sizeLimit;
    private int totalBytesRetired;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public interface RefillCallback {
        void onRefill();
    }

    /* loaded from: classes3.dex */
    private class SkippedDataSink implements RefillCallback {
        private ByteArrayOutputStream byteArrayStream;
        private int lastPos;

        private SkippedDataSink() {
            this.lastPos = CodedInputStream.this.bufferPos;
        }

        ByteBuffer getSkippedData() {
            ByteArrayOutputStream byteArrayOutputStream = this.byteArrayStream;
            if (byteArrayOutputStream == null) {
                return ByteBuffer.wrap(CodedInputStream.this.buffer, this.lastPos, CodedInputStream.this.bufferPos - this.lastPos);
            }
            byteArrayOutputStream.write(CodedInputStream.this.buffer, this.lastPos, CodedInputStream.this.bufferPos);
            return ByteBuffer.wrap(this.byteArrayStream.toByteArray());
        }

        @Override // com.google.protobuf.CodedInputStream.RefillCallback
        public void onRefill() {
            if (this.byteArrayStream == null) {
                this.byteArrayStream = new ByteArrayOutputStream();
            }
            this.byteArrayStream.write(CodedInputStream.this.buffer, this.lastPos, CodedInputStream.this.bufferPos - this.lastPos);
            this.lastPos = 0;
        }
    }

    private CodedInputStream(byte[] bArr, int i4, int i5, boolean z4) {
        this.enableAliasing = false;
        this.currentLimit = Integer.MAX_VALUE;
        this.recursionLimit = 100;
        this.sizeLimit = 67108864;
        this.refillCallback = null;
        this.buffer = bArr;
        this.bufferSize = i5 + i4;
        this.bufferPos = i4;
        this.totalBytesRetired = -i4;
        this.input = null;
        this.bufferIsImmutable = z4;
    }

    public static int decodeZigZag32(int i4) {
        return (-(i4 & 1)) ^ (i4 >>> 1);
    }

    public static long decodeZigZag64(long j4) {
        return (-(j4 & 1)) ^ (j4 >>> 1);
    }

    public static CodedInputStream newInstance(InputStream inputStream) {
        return new CodedInputStream(inputStream, 4096);
    }

    private byte[] readRawBytesSlowPath(int i4) throws IOException {
        if (i4 <= 0) {
            if (i4 == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i5 = this.totalBytesRetired;
        int i6 = this.bufferPos;
        int i7 = i5 + i6 + i4;
        if (i7 <= this.sizeLimit) {
            int i8 = this.currentLimit;
            if (i7 <= i8) {
                InputStream inputStream = this.input;
                if (inputStream != null) {
                    int i9 = this.bufferSize;
                    int i10 = i9 - i6;
                    this.totalBytesRetired = i5 + i9;
                    this.bufferPos = 0;
                    this.bufferSize = 0;
                    int i11 = i4 - i10;
                    if (i11 >= 4096 && i11 > inputStream.available()) {
                        ArrayList<byte[]> arrayList = new ArrayList();
                        while (i11 > 0) {
                            int min = Math.min(i11, 4096);
                            byte[] bArr = new byte[min];
                            int i12 = 0;
                            while (i12 < min) {
                                int read = this.input.read(bArr, i12, min - i12);
                                if (read == -1) {
                                    throw InvalidProtocolBufferException.truncatedMessage();
                                }
                                this.totalBytesRetired += read;
                                i12 += read;
                            }
                            i11 -= min;
                            arrayList.add(bArr);
                        }
                        byte[] bArr2 = new byte[i4];
                        System.arraycopy(this.buffer, i6, bArr2, 0, i10);
                        for (byte[] bArr3 : arrayList) {
                            System.arraycopy(bArr3, 0, bArr2, i10, bArr3.length);
                            i10 += bArr3.length;
                        }
                        return bArr2;
                    }
                    byte[] bArr4 = new byte[i4];
                    System.arraycopy(this.buffer, i6, bArr4, 0, i10);
                    while (i10 < i4) {
                        int read2 = this.input.read(bArr4, i10, i4 - i10);
                        if (read2 == -1) {
                            throw InvalidProtocolBufferException.truncatedMessage();
                        }
                        this.totalBytesRetired += read2;
                        i10 += read2;
                    }
                    return bArr4;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            skipRawBytes((i8 - i5) - i6);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.sizeLimitExceeded();
    }

    private void recomputeBufferSizeAfterLimit() {
        int i4 = this.bufferSize + this.bufferSizeAfterLimit;
        this.bufferSize = i4;
        int i5 = this.totalBytesRetired + i4;
        int i6 = this.currentLimit;
        if (i5 > i6) {
            int i7 = i5 - i6;
            this.bufferSizeAfterLimit = i7;
            this.bufferSize = i4 - i7;
            return;
        }
        this.bufferSizeAfterLimit = 0;
    }

    private void refillBuffer(int i4) throws IOException {
        if (!tryRefillBuffer(i4)) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    private void skipRawBytesSlowPath(int i4) throws IOException {
        if (i4 >= 0) {
            int i5 = this.totalBytesRetired;
            int i6 = this.bufferPos;
            int i7 = i5 + i6 + i4;
            int i8 = this.currentLimit;
            if (i7 <= i8) {
                int i9 = this.bufferSize;
                int i10 = i9 - i6;
                this.bufferPos = i9;
                refillBuffer(1);
                while (true) {
                    int i11 = i4 - i10;
                    int i12 = this.bufferSize;
                    if (i11 > i12) {
                        i10 += i12;
                        this.bufferPos = i12;
                        refillBuffer(1);
                    } else {
                        this.bufferPos = i11;
                        return;
                    }
                }
            } else {
                skipRawBytes((i8 - i5) - i6);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        } else {
            throw InvalidProtocolBufferException.negativeSize();
        }
    }

    private void skipRawVarint() throws IOException {
        int i4 = this.bufferSize;
        int i5 = this.bufferPos;
        if (i4 - i5 >= 10) {
            byte[] bArr = this.buffer;
            int i6 = 0;
            while (i6 < 10) {
                int i7 = i5 + 1;
                if (bArr[i5] >= 0) {
                    this.bufferPos = i7;
                    return;
                } else {
                    i6++;
                    i5 = i7;
                }
            }
        }
        skipRawVarintSlowPath();
    }

    private void skipRawVarintSlowPath() throws IOException {
        for (int i4 = 0; i4 < 10; i4++) {
            if (readRawByte() >= 0) {
                return;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    private boolean tryRefillBuffer(int i4) throws IOException {
        int i5 = this.bufferPos;
        if (i5 + i4 > this.bufferSize) {
            if (this.totalBytesRetired + i5 + i4 > this.currentLimit) {
                return false;
            }
            RefillCallback refillCallback = this.refillCallback;
            if (refillCallback != null) {
                refillCallback.onRefill();
            }
            if (this.input != null) {
                int i6 = this.bufferPos;
                if (i6 > 0) {
                    int i7 = this.bufferSize;
                    if (i7 > i6) {
                        byte[] bArr = this.buffer;
                        System.arraycopy(bArr, i6, bArr, 0, i7 - i6);
                    }
                    this.totalBytesRetired += i6;
                    this.bufferSize -= i6;
                    this.bufferPos = 0;
                }
                InputStream inputStream = this.input;
                byte[] bArr2 = this.buffer;
                int i8 = this.bufferSize;
                int read = inputStream.read(bArr2, i8, bArr2.length - i8);
                if (read == 0 || read < -1 || read > this.buffer.length) {
                    throw new IllegalStateException("InputStream#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                } else if (read > 0) {
                    this.bufferSize += read;
                    if ((this.totalBytesRetired + i4) - this.sizeLimit <= 0) {
                        recomputeBufferSizeAfterLimit();
                        if (this.bufferSize >= i4) {
                            return true;
                        }
                        return tryRefillBuffer(i4);
                    }
                    throw InvalidProtocolBufferException.sizeLimitExceeded();
                }
            }
            return false;
        }
        throw new IllegalStateException("refillBuffer() called when " + i4 + " bytes were already available in buffer");
    }

    public void checkLastTagWas(int i4) throws InvalidProtocolBufferException {
        if (this.lastTag != i4) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    public void enableAliasing(boolean z4) {
        this.enableAliasing = z4;
    }

    public int getBytesUntilLimit() {
        int i4 = this.currentLimit;
        if (i4 == Integer.MAX_VALUE) {
            return -1;
        }
        return i4 - (this.totalBytesRetired + this.bufferPos);
    }

    public int getLastTag() {
        return this.lastTag;
    }

    public int getTotalBytesRead() {
        return this.totalBytesRetired + this.bufferPos;
    }

    public boolean isAtEnd() throws IOException {
        return this.bufferPos == this.bufferSize && !tryRefillBuffer(1);
    }

    public void popLimit(int i4) {
        this.currentLimit = i4;
        recomputeBufferSizeAfterLimit();
    }

    public int pushLimit(int i4) throws InvalidProtocolBufferException {
        if (i4 >= 0) {
            int i5 = i4 + this.totalBytesRetired + this.bufferPos;
            int i6 = this.currentLimit;
            if (i5 <= i6) {
                this.currentLimit = i5;
                recomputeBufferSizeAfterLimit();
                return i6;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    public boolean readBool() throws IOException {
        return readRawVarint64() != 0;
    }

    public byte[] readByteArray() throws IOException {
        int readRawVarint32 = readRawVarint32();
        int i4 = this.bufferSize;
        int i5 = this.bufferPos;
        if (readRawVarint32 <= i4 - i5 && readRawVarint32 > 0) {
            byte[] copyOfRange = Arrays.copyOfRange(this.buffer, i5, i5 + readRawVarint32);
            this.bufferPos += readRawVarint32;
            return copyOfRange;
        }
        return readRawBytesSlowPath(readRawVarint32);
    }

    public ByteBuffer readByteBuffer() throws IOException {
        ByteBuffer wrap;
        int readRawVarint32 = readRawVarint32();
        int i4 = this.bufferSize;
        int i5 = this.bufferPos;
        if (readRawVarint32 > i4 - i5 || readRawVarint32 <= 0) {
            if (readRawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            }
            return ByteBuffer.wrap(readRawBytesSlowPath(readRawVarint32));
        }
        if (this.input == null && !this.bufferIsImmutable && this.enableAliasing) {
            wrap = ByteBuffer.wrap(this.buffer, i5, readRawVarint32).slice();
        } else {
            wrap = ByteBuffer.wrap(Arrays.copyOfRange(this.buffer, i5, i5 + readRawVarint32));
        }
        this.bufferPos += readRawVarint32;
        return wrap;
    }

    public ByteString readBytes() throws IOException {
        ByteString copyFrom;
        int readRawVarint32 = readRawVarint32();
        int i4 = this.bufferSize;
        int i5 = this.bufferPos;
        if (readRawVarint32 > i4 - i5 || readRawVarint32 <= 0) {
            if (readRawVarint32 == 0) {
                return ByteString.EMPTY;
            }
            return ByteString.wrap(readRawBytesSlowPath(readRawVarint32));
        }
        if (this.bufferIsImmutable && this.enableAliasing) {
            copyFrom = ByteString.wrap(this.buffer, i5, readRawVarint32);
        } else {
            copyFrom = ByteString.copyFrom(this.buffer, i5, readRawVarint32);
        }
        this.bufferPos += readRawVarint32;
        return copyFrom;
    }

    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readRawLittleEndian64());
    }

    public int readEnum() throws IOException {
        return readRawVarint32();
    }

    public int readFixed32() throws IOException {
        return readRawLittleEndian32();
    }

    public long readFixed64() throws IOException {
        return readRawLittleEndian64();
    }

    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readRawLittleEndian32());
    }

    public void readGroup(int i4, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int i5 = this.recursionDepth;
        if (i5 < this.recursionLimit) {
            this.recursionDepth = i5 + 1;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i4, 4));
            this.recursionDepth--;
            return;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    public int readInt32() throws IOException {
        return readRawVarint32();
    }

    public long readInt64() throws IOException {
        return readRawVarint64();
    }

    public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int readRawVarint32 = readRawVarint32();
        if (this.recursionDepth < this.recursionLimit) {
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            popLimit(pushLimit);
            return;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    public byte readRawByte() throws IOException {
        if (this.bufferPos == this.bufferSize) {
            refillBuffer(1);
        }
        byte[] bArr = this.buffer;
        int i4 = this.bufferPos;
        this.bufferPos = i4 + 1;
        return bArr[i4];
    }

    public byte[] readRawBytes(int i4) throws IOException {
        int i5 = this.bufferPos;
        if (i4 <= this.bufferSize - i5 && i4 > 0) {
            int i6 = i4 + i5;
            this.bufferPos = i6;
            return Arrays.copyOfRange(this.buffer, i5, i6);
        }
        return readRawBytesSlowPath(i4);
    }

    public int readRawLittleEndian32() throws IOException {
        int i4 = this.bufferPos;
        if (this.bufferSize - i4 < 4) {
            refillBuffer(4);
            i4 = this.bufferPos;
        }
        byte[] bArr = this.buffer;
        this.bufferPos = i4 + 4;
        return ((bArr[i4 + 3] & 255) << 24) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16);
    }

    public long readRawLittleEndian64() throws IOException {
        int i4 = this.bufferPos;
        if (this.bufferSize - i4 < 8) {
            refillBuffer(8);
            i4 = this.bufferPos;
        }
        byte[] bArr = this.buffer;
        this.bufferPos = i4 + 8;
        return ((bArr[i4 + 7] & 255) << 56) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        if (r2[r3] < 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int readRawVarint32() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.bufferPos
            int r1 = r5.bufferSize
            if (r1 != r0) goto L7
            goto L6a
        L7:
            byte[] r2 = r5.buffer
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.bufferPos = r3
            return r0
        L12:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L18
            goto L6a
        L18:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L24
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L70
        L24:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L31
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2f:
            r1 = r3
            goto L70
        L31:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3f
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L70
        L3f:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2f
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L70
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2f
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L70
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2f
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 >= 0) goto L70
        L6a:
            long r0 = r5.readRawVarint64SlowPath()
            int r1 = (int) r0
            return r1
        L70:
            r5.bufferPos = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.readRawVarint32():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b4, code lost:
        if (r2[r0] < 0) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long readRawVarint64() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 192
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.readRawVarint64():long");
    }

    long readRawVarint64SlowPath() throws IOException {
        long j4 = 0;
        for (int i4 = 0; i4 < 64; i4 += 7) {
            byte readRawByte = readRawByte();
            j4 |= (readRawByte & ByteCompanionObject.MAX_VALUE) << i4;
            if ((readRawByte & 128) == 0) {
                return j4;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    public int readSFixed32() throws IOException {
        return readRawLittleEndian32();
    }

    public long readSFixed64() throws IOException {
        return readRawLittleEndian64();
    }

    public int readSInt32() throws IOException {
        return decodeZigZag32(readRawVarint32());
    }

    public long readSInt64() throws IOException {
        return decodeZigZag64(readRawVarint64());
    }

    public String readString() throws IOException {
        int readRawVarint32 = readRawVarint32();
        int i4 = this.bufferSize;
        int i5 = this.bufferPos;
        if (readRawVarint32 <= i4 - i5 && readRawVarint32 > 0) {
            String str = new String(this.buffer, i5, readRawVarint32, Internal.UTF_8);
            this.bufferPos += readRawVarint32;
            return str;
        } else if (readRawVarint32 == 0) {
            return "";
        } else {
            if (readRawVarint32 <= i4) {
                refillBuffer(readRawVarint32);
                String str2 = new String(this.buffer, this.bufferPos, readRawVarint32, Internal.UTF_8);
                this.bufferPos += readRawVarint32;
                return str2;
            }
            return new String(readRawBytesSlowPath(readRawVarint32), Internal.UTF_8);
        }
    }

    public String readStringRequireUtf8() throws IOException {
        byte[] readRawBytesSlowPath;
        int readRawVarint32 = readRawVarint32();
        int i4 = this.bufferPos;
        int i5 = this.bufferSize;
        if (readRawVarint32 <= i5 - i4 && readRawVarint32 > 0) {
            readRawBytesSlowPath = this.buffer;
            this.bufferPos = i4 + readRawVarint32;
        } else if (readRawVarint32 == 0) {
            return "";
        } else {
            if (readRawVarint32 <= i5) {
                refillBuffer(readRawVarint32);
                readRawBytesSlowPath = this.buffer;
                this.bufferPos = readRawVarint32 + 0;
            } else {
                readRawBytesSlowPath = readRawBytesSlowPath(readRawVarint32);
            }
            i4 = 0;
        }
        if (Utf8.isValidUtf8(readRawBytesSlowPath, i4, i4 + readRawVarint32)) {
            return new String(readRawBytesSlowPath, i4, readRawVarint32, Internal.UTF_8);
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    public int readTag() throws IOException {
        if (isAtEnd()) {
            this.lastTag = 0;
            return 0;
        }
        int readRawVarint32 = readRawVarint32();
        this.lastTag = readRawVarint32;
        if (WireFormat.getTagFieldNumber(readRawVarint32) != 0) {
            return this.lastTag;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    public int readUInt32() throws IOException {
        return readRawVarint32();
    }

    public long readUInt64() throws IOException {
        return readRawVarint64();
    }

    @Deprecated
    public void readUnknownGroup(int i4, MessageLite.Builder builder) throws IOException {
        readGroup(i4, builder, (ExtensionRegistryLite) null);
    }

    public void resetSizeCounter() {
        this.totalBytesRetired = -this.bufferPos;
    }

    public int setRecursionLimit(int i4) {
        if (i4 >= 0) {
            int i5 = this.recursionLimit;
            this.recursionLimit = i4;
            return i5;
        }
        throw new IllegalArgumentException("Recursion limit cannot be negative: " + i4);
    }

    public int setSizeLimit(int i4) {
        if (i4 >= 0) {
            int i5 = this.sizeLimit;
            this.sizeLimit = i4;
            return i5;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + i4);
    }

    public boolean skipField(int i4) throws IOException {
        int tagWireType = WireFormat.getTagWireType(i4);
        if (tagWireType == 0) {
            skipRawVarint();
            return true;
        } else if (tagWireType == 1) {
            skipRawBytes(8);
            return true;
        } else if (tagWireType == 2) {
            skipRawBytes(readRawVarint32());
            return true;
        } else if (tagWireType == 3) {
            skipMessage();
            checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i4), 4));
            return true;
        } else if (tagWireType != 4) {
            if (tagWireType == 5) {
                skipRawBytes(4);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        } else {
            return false;
        }
    }

    public void skipMessage() throws IOException {
        int readTag;
        do {
            readTag = readTag();
            if (readTag == 0) {
                return;
            }
        } while (skipField(readTag));
    }

    public void skipRawBytes(int i4) throws IOException {
        int i5 = this.bufferSize;
        int i6 = this.bufferPos;
        if (i4 <= i5 - i6 && i4 >= 0) {
            this.bufferPos = i6 + i4;
        } else {
            skipRawBytesSlowPath(i4);
        }
    }

    static CodedInputStream newInstance(InputStream inputStream, int i4) {
        return new CodedInputStream(inputStream, i4);
    }

    public static CodedInputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
        int readTag;
        do {
            readTag = readTag();
            if (readTag == 0) {
                return;
            }
        } while (skipField(readTag, codedOutputStream));
    }

    public static CodedInputStream newInstance(byte[] bArr, int i4, int i5) {
        return newInstance(bArr, i4, i5, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CodedInputStream newInstance(byte[] bArr, int i4, int i5, boolean z4) {
        CodedInputStream codedInputStream = new CodedInputStream(bArr, i4, i5, z4);
        try {
            codedInputStream.pushLimit(i5);
            return codedInputStream;
        } catch (InvalidProtocolBufferException e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public static CodedInputStream newInstance(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return newInstance(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        }
        ByteBuffer duplicate = byteBuffer.duplicate();
        byte[] bArr = new byte[duplicate.remaining()];
        duplicate.get(bArr);
        return newInstance(bArr);
    }

    public <T extends MessageLite> T readGroup(int i4, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int i5 = this.recursionDepth;
        if (i5 < this.recursionLimit) {
            this.recursionDepth = i5 + 1;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i4, 4));
            this.recursionDepth--;
            return parsePartialFrom;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int readRawVarint32 = readRawVarint32();
        if (this.recursionDepth < this.recursionLimit) {
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            popLimit(pushLimit);
            return parsePartialFrom;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    public boolean skipField(int i4, CodedOutputStream codedOutputStream) throws IOException {
        int tagWireType = WireFormat.getTagWireType(i4);
        if (tagWireType == 0) {
            long readInt64 = readInt64();
            codedOutputStream.writeRawVarint32(i4);
            codedOutputStream.writeUInt64NoTag(readInt64);
            return true;
        } else if (tagWireType == 1) {
            long readRawLittleEndian64 = readRawLittleEndian64();
            codedOutputStream.writeRawVarint32(i4);
            codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
            return true;
        } else if (tagWireType == 2) {
            ByteString readBytes = readBytes();
            codedOutputStream.writeRawVarint32(i4);
            codedOutputStream.writeBytesNoTag(readBytes);
            return true;
        } else if (tagWireType == 3) {
            codedOutputStream.writeRawVarint32(i4);
            skipMessage(codedOutputStream);
            int makeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i4), 4);
            checkLastTagWas(makeTag);
            codedOutputStream.writeRawVarint32(makeTag);
            return true;
        } else if (tagWireType != 4) {
            if (tagWireType == 5) {
                int readRawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeRawVarint32(i4);
                codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        } else {
            return false;
        }
    }

    private CodedInputStream(InputStream inputStream, int i4) {
        this.enableAliasing = false;
        this.currentLimit = Integer.MAX_VALUE;
        this.recursionLimit = 100;
        this.sizeLimit = 67108864;
        this.refillCallback = null;
        this.buffer = new byte[i4];
        this.bufferPos = 0;
        this.totalBytesRetired = 0;
        this.input = inputStream;
        this.bufferIsImmutable = false;
    }

    static int readRawVarint32(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return readRawVarint32(read, inputStream);
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int readRawVarint32(int i4, InputStream inputStream) throws IOException {
        if ((i4 & 128) == 0) {
            return i4;
        }
        int i5 = i4 & 127;
        int i6 = 7;
        while (i6 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            i5 |= (read & 127) << i6;
            if ((read & 128) == 0) {
                return i5;
            }
            i6 += 7;
        }
        while (i6 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if ((read2 & 128) == 0) {
                return i5;
            }
            i6 += 7;
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }
}
