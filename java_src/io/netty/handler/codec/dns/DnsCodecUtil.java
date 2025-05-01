package io.netty.handler.codec.dns;

import com.join.mgps.Util.h0;
import external.org.apache.commons.lang3.d;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.handler.codec.CorruptedFrameException;
import io.netty.util.CharsetUtil;
/* loaded from: classes6.dex */
final class DnsCodecUtil {
    private DnsCodecUtil() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String decodeDomainName(ByteBuf byteBuf) {
        int writerIndex = byteBuf.writerIndex();
        int readableBytes = byteBuf.readableBytes();
        if (readableBytes == 0) {
            return h0.f27805a;
        }
        StringBuilder sb = new StringBuilder(readableBytes << 1);
        int i4 = -1;
        int i5 = 0;
        while (byteBuf.isReadable()) {
            short readUnsignedByte = byteBuf.readUnsignedByte();
            if (!((readUnsignedByte & 192) == 192)) {
                if (readUnsignedByte == 0) {
                    break;
                } else if (byteBuf.isReadable(readUnsignedByte)) {
                    sb.append(byteBuf.toString(byteBuf.readerIndex(), readUnsignedByte, CharsetUtil.UTF_8));
                    sb.append(d.f68897a);
                    byteBuf.skipBytes(readUnsignedByte);
                } else {
                    throw new CorruptedFrameException("truncated label in a name");
                }
            } else {
                if (i4 == -1) {
                    i4 = byteBuf.readerIndex() + 1;
                }
                if (byteBuf.isReadable()) {
                    int readUnsignedByte2 = ((readUnsignedByte & 63) << 8) | byteBuf.readUnsignedByte();
                    if (readUnsignedByte2 < writerIndex) {
                        byteBuf.readerIndex(readUnsignedByte2);
                        i5 += 2;
                        if (i5 >= writerIndex) {
                            throw new CorruptedFrameException("name contains a loop.");
                        }
                    } else {
                        throw new CorruptedFrameException("name has an out-of-range pointer");
                    }
                } else {
                    throw new CorruptedFrameException("truncated pointer in a name");
                }
            }
        }
        if (i4 != -1) {
            byteBuf.readerIndex(i4);
        }
        if (sb.length() == 0) {
            return h0.f27805a;
        }
        if (sb.charAt(sb.length() - 1) != '.') {
            sb.append(d.f68897a);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ByteBuf decompressDomainName(ByteBuf byteBuf) {
        String decodeDomainName = decodeDomainName(byteBuf);
        ByteBuf buffer = byteBuf.alloc().buffer(decodeDomainName.length() << 1);
        encodeDomainName(decodeDomainName, buffer);
        return buffer;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void encodeDomainName(String str, ByteBuf byteBuf) {
        String[] split;
        if (h0.f27805a.equals(str)) {
            byteBuf.writeByte(0);
            return;
        }
        for (String str2 : str.split("\\.")) {
            int length = str2.length();
            if (length == 0) {
                break;
            }
            byteBuf.writeByte(length);
            ByteBufUtil.writeAscii(byteBuf, str2);
        }
        byteBuf.writeByte(0);
    }
}
