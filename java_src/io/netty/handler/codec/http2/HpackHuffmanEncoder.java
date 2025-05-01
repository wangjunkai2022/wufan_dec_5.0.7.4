package io.netty.handler.codec.http2;

import io.netty.buffer.ByteBuf;
import io.netty.util.AsciiString;
import io.netty.util.ByteProcessor;
import io.netty.util.internal.ObjectUtil;
import io.netty.util.internal.PlatformDependent;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class HpackHuffmanEncoder {
    private final int[] codes;
    private final EncodeProcessor encodeProcessor;
    private final EncodedLengthProcessor encodedLengthProcessor;
    private final byte[] lengths;

    /* loaded from: classes6.dex */
    private final class EncodeProcessor implements ByteProcessor {
        private long current;

        /* renamed from: n  reason: collision with root package name */
        private int f69199n;
        ByteBuf out;

        private EncodeProcessor() {
        }

        void end() {
            try {
                int i4 = this.f69199n;
                if (i4 > 0) {
                    long j4 = this.current << (8 - i4);
                    this.current = j4;
                    long j5 = j4 | (255 >>> i4);
                    this.current = j5;
                    this.out.writeByte((int) j5);
                }
            } finally {
                this.out = null;
                this.current = 0L;
                this.f69199n = 0;
            }
        }

        @Override // io.netty.util.ByteProcessor
        public boolean process(byte b5) {
            int i4;
            byte b6 = HpackHuffmanEncoder.this.lengths[b5 & 255];
            long j4 = this.current << b6;
            this.current = j4;
            this.current = j4 | HpackHuffmanEncoder.this.codes[i4];
            this.f69199n += b6;
            while (true) {
                int i5 = this.f69199n;
                if (i5 < 8) {
                    return true;
                }
                int i6 = i5 - 8;
                this.f69199n = i6;
                this.out.writeByte((int) (this.current >> i6));
            }
        }
    }

    /* loaded from: classes6.dex */
    private final class EncodedLengthProcessor implements ByteProcessor {
        private long len;

        private EncodedLengthProcessor() {
        }

        int length() {
            return (int) ((this.len + 7) >> 3);
        }

        @Override // io.netty.util.ByteProcessor
        public boolean process(byte b5) {
            this.len += HpackHuffmanEncoder.this.lengths[b5 & 255];
            return true;
        }

        void reset() {
            this.len = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HpackHuffmanEncoder() {
        this(HpackUtil.HUFFMAN_CODES, HpackUtil.HUFFMAN_CODE_LENGTHS);
    }

    private void encodeSlowPath(ByteBuf byteBuf, CharSequence charSequence) {
        int i4 = 0;
        long j4 = 0;
        byte b5 = 0;
        while (i4 < charSequence.length()) {
            int charAt = charSequence.charAt(i4) & 255;
            int i5 = this.codes[charAt];
            byte b6 = this.lengths[charAt];
            j4 = (j4 << b6) | i5;
            int i6 = b5 + b6;
            while (i6 >= 8) {
                i6 = (i6 == 1 ? 1 : 0) - 8;
                byteBuf.writeByte((int) (j4 >> i6));
            }
            i4++;
            b5 = i6;
        }
        if (b5 > 0) {
            byteBuf.writeByte((int) ((255 >>> b5) | (j4 << (8 - b5))));
        }
    }

    private int getEncodedLengthSlowPath(CharSequence charSequence) {
        long j4 = 0;
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            j4 += this.lengths[charSequence.charAt(i4) & 255];
        }
        return (int) ((j4 + 7) >> 3);
    }

    public void encode(ByteBuf byteBuf, CharSequence charSequence) {
        ObjectUtil.checkNotNull(byteBuf, "out");
        if (charSequence instanceof AsciiString) {
            AsciiString asciiString = (AsciiString) charSequence;
            try {
                try {
                    EncodeProcessor encodeProcessor = this.encodeProcessor;
                    encodeProcessor.out = byteBuf;
                    asciiString.forEachByte(encodeProcessor);
                } catch (Exception e5) {
                    PlatformDependent.throwException(e5);
                }
                return;
            } finally {
                this.encodeProcessor.end();
            }
        }
        encodeSlowPath(byteBuf, charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getEncodedLength(CharSequence charSequence) {
        if (charSequence instanceof AsciiString) {
            AsciiString asciiString = (AsciiString) charSequence;
            try {
                this.encodedLengthProcessor.reset();
                asciiString.forEachByte(this.encodedLengthProcessor);
                return this.encodedLengthProcessor.length();
            } catch (Exception e5) {
                PlatformDependent.throwException(e5);
                return -1;
            }
        }
        return getEncodedLengthSlowPath(charSequence);
    }

    private HpackHuffmanEncoder(int[] iArr, byte[] bArr) {
        this.encodedLengthProcessor = new EncodedLengthProcessor();
        this.encodeProcessor = new EncodeProcessor();
        this.codes = iArr;
        this.lengths = bArr;
    }
}
