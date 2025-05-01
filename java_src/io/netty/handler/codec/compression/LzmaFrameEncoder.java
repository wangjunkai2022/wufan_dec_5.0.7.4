package io.netty.handler.codec.compression;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;
import lzma.sdk.ICodeProgress;
import lzma.sdk.lzma.Encoder;
/* loaded from: classes6.dex */
public class LzmaFrameEncoder extends MessageToByteEncoder<ByteBuf> {
    private static final int DEFAULT_LC = 3;
    private static final int DEFAULT_LP = 0;
    private static final int DEFAULT_MATCH_FINDER = 1;
    private static final int DEFAULT_PB = 2;
    private static final int MAX_FAST_BYTES = 273;
    private static final int MEDIUM_DICTIONARY_SIZE = 65536;
    private static final int MEDIUM_FAST_BYTES = 32;
    private static final int MIN_FAST_BYTES = 5;
    private static final InternalLogger logger = InternalLoggerFactory.getInstance(LzmaFrameEncoder.class);
    private static boolean warningLogged;
    private final Encoder encoder;
    private final int littleEndianDictionarySize;
    private final byte properties;

    public LzmaFrameEncoder() {
        this(65536);
    }

    private static int maxOutputBufferLength(int i4) {
        double d5 = i4 < 200 ? 1.5d : i4 < 500 ? 1.2d : i4 < 1000 ? 1.1d : i4 < 10000 ? 1.05d : 1.02d;
        double d6 = i4;
        Double.isNaN(d6);
        return ((int) (d6 * d5)) + 13;
    }

    public LzmaFrameEncoder(int i4, int i5, int i6) {
        this(i4, i5, i6, 65536);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.netty.handler.codec.MessageToByteEncoder
    public ByteBuf allocateBuffer(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, boolean z4) throws Exception {
        return channelHandlerContext.alloc().ioBuffer(maxOutputBufferLength(byteBuf.readableBytes()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.netty.handler.codec.MessageToByteEncoder
    public void encode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, ByteBuf byteBuf2) throws Exception {
        ByteBufOutputStream byteBufOutputStream;
        int readableBytes = byteBuf.readableBytes();
        ByteBufInputStream byteBufInputStream = null;
        try {
            ByteBufInputStream byteBufInputStream2 = new ByteBufInputStream(byteBuf);
            try {
                byteBufOutputStream = new ByteBufOutputStream(byteBuf2);
                try {
                    byteBufOutputStream.writeByte(this.properties);
                    byteBufOutputStream.writeInt(this.littleEndianDictionarySize);
                    byteBufOutputStream.writeLong(Long.reverseBytes(readableBytes));
                    this.encoder.code(byteBufInputStream2, byteBufOutputStream, -1L, -1L, (ICodeProgress) null);
                    byteBufInputStream2.close();
                    byteBufOutputStream.close();
                } catch (Throwable th) {
                    th = th;
                    byteBufInputStream = byteBufInputStream2;
                    if (byteBufInputStream != null) {
                        byteBufInputStream.close();
                    }
                    if (byteBufOutputStream != null) {
                        byteBufOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                byteBufOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            byteBufOutputStream = null;
        }
    }

    public LzmaFrameEncoder(int i4) {
        this(3, 0, 2, i4);
    }

    public LzmaFrameEncoder(int i4, int i5, int i6, int i7) {
        this(i4, i5, i6, i7, false, 32);
    }

    public LzmaFrameEncoder(int i4, int i5, int i6, int i7, boolean z4, int i8) {
        if (i4 < 0 || i4 > 8) {
            throw new IllegalArgumentException("lc: " + i4 + " (expected: 0-8)");
        } else if (i5 < 0 || i5 > 4) {
            throw new IllegalArgumentException("lp: " + i5 + " (expected: 0-4)");
        } else if (i6 >= 0 && i6 <= 4) {
            if (i4 + i5 > 4 && !warningLogged) {
                logger.warn("The latest versions of LZMA libraries (for example, XZ Utils) has an additional requirement: lc + lp <= 4. Data which don't follow this requirement cannot be decompressed with this libraries.");
                warningLogged = true;
            }
            if (i7 < 0) {
                throw new IllegalArgumentException("dictionarySize: " + i7 + " (expected: 0+)");
            } else if (i8 >= 5 && i8 <= 273) {
                Encoder encoder = new Encoder();
                this.encoder = encoder;
                encoder.setDictionarySize(i7);
                encoder.setEndMarkerMode(z4);
                encoder.setMatchFinder(1);
                encoder.setNumFastBytes(i8);
                encoder.setLcLpPb(i4, i5, i6);
                this.properties = (byte) ((((i6 * 5) + i5) * 9) + i4);
                this.littleEndianDictionarySize = Integer.reverseBytes(i7);
            } else {
                throw new IllegalArgumentException(String.format("numFastBytes: %d (expected: %d-%d)", Integer.valueOf(i8), 5, 273));
            }
        } else {
            throw new IllegalArgumentException("pb: " + i6 + " (expected: 0-4)");
        }
    }
}
