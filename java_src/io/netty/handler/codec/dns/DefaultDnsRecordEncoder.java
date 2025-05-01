package io.netty.handler.codec.dns;

import io.netty.buffer.ByteBuf;
import io.netty.channel.socket.InternetProtocolFamily;
import io.netty.handler.codec.UnsupportedMessageTypeException;
import io.netty.util.internal.StringUtil;
/* loaded from: classes6.dex */
public class DefaultDnsRecordEncoder implements DnsRecordEncoder {
    private static final int PREFIX_MASK = 7;

    static int calculateEcsAddressLength(int i4, int i5) {
        return (i4 >>> 3) + (i5 != 0 ? 1 : 0);
    }

    private void encodeOptEcsRecord(DnsOptEcsRecord dnsOptEcsRecord, ByteBuf byteBuf) throws Exception {
        encodeRecord0(dnsOptEcsRecord, byteBuf);
        int sourcePrefixLength = dnsOptEcsRecord.sourcePrefixLength();
        int scopePrefixLength = dnsOptEcsRecord.scopePrefixLength();
        int i4 = sourcePrefixLength & 7;
        byte[] address = dnsOptEcsRecord.address();
        int length = address.length << 3;
        if (length >= sourcePrefixLength && sourcePrefixLength >= 0) {
            InternetProtocolFamily internetProtocolFamily = address.length == 4 ? InternetProtocolFamily.IPv4 : InternetProtocolFamily.IPv6;
            int calculateEcsAddressLength = calculateEcsAddressLength(sourcePrefixLength, i4);
            int i5 = calculateEcsAddressLength + 8;
            byteBuf.writeShort(i5);
            byteBuf.writeShort(8);
            byteBuf.writeShort(i5 - 4);
            byteBuf.writeShort((short) internetProtocolFamily.addressNumber());
            byteBuf.writeByte(sourcePrefixLength);
            byteBuf.writeByte(scopePrefixLength);
            if (i4 > 0) {
                int i6 = calculateEcsAddressLength - 1;
                byteBuf.writeBytes(address, 0, i6);
                byteBuf.writeByte(padWithZeros(address[i6], i4));
                return;
            }
            byteBuf.writeBytes(address, 0, calculateEcsAddressLength);
            return;
        }
        throw new IllegalArgumentException(sourcePrefixLength + ": " + sourcePrefixLength + " (expected: 0 >= " + length + ')');
    }

    private void encodeOptPseudoRecord(DnsOptPseudoRecord dnsOptPseudoRecord, ByteBuf byteBuf) throws Exception {
        encodeRecord0(dnsOptPseudoRecord, byteBuf);
        byteBuf.writeShort(0);
    }

    private void encodePtrRecord(DnsPtrRecord dnsPtrRecord, ByteBuf byteBuf) throws Exception {
        encodeRecord0(dnsPtrRecord, byteBuf);
        encodeName(dnsPtrRecord.hostname(), byteBuf);
    }

    private void encodeRawRecord(DnsRawRecord dnsRawRecord, ByteBuf byteBuf) throws Exception {
        encodeRecord0(dnsRawRecord, byteBuf);
        ByteBuf content = dnsRawRecord.content();
        int readableBytes = content.readableBytes();
        byteBuf.writeShort(readableBytes);
        byteBuf.writeBytes(content, content.readerIndex(), readableBytes);
    }

    private void encodeRecord0(DnsRecord dnsRecord, ByteBuf byteBuf) throws Exception {
        encodeName(dnsRecord.name(), byteBuf);
        byteBuf.writeShort(dnsRecord.type().intValue());
        byteBuf.writeShort(dnsRecord.dnsClass());
        byteBuf.writeInt((int) dnsRecord.timeToLive());
    }

    private static byte padWithZeros(byte b5, int i4) {
        int i5;
        switch (i4) {
            case 0:
                return (byte) 0;
            case 1:
                i5 = b5 & 128;
                break;
            case 2:
                i5 = b5 & 192;
                break;
            case 3:
                i5 = b5 & 224;
                break;
            case 4:
                i5 = b5 & 240;
                break;
            case 5:
                i5 = b5 & 248;
                break;
            case 6:
                i5 = b5 & 252;
                break;
            case 7:
                i5 = b5 & 254;
                break;
            case 8:
                return b5;
            default:
                throw new IllegalArgumentException("lowOrderBitsToPreserve: " + i4);
        }
        return (byte) i5;
    }

    protected void encodeName(String str, ByteBuf byteBuf) throws Exception {
        DnsCodecUtil.encodeDomainName(str, byteBuf);
    }

    @Override // io.netty.handler.codec.dns.DnsRecordEncoder
    public final void encodeQuestion(DnsQuestion dnsQuestion, ByteBuf byteBuf) throws Exception {
        encodeName(dnsQuestion.name(), byteBuf);
        byteBuf.writeShort(dnsQuestion.type().intValue());
        byteBuf.writeShort(dnsQuestion.dnsClass());
    }

    @Override // io.netty.handler.codec.dns.DnsRecordEncoder
    public void encodeRecord(DnsRecord dnsRecord, ByteBuf byteBuf) throws Exception {
        if (dnsRecord instanceof DnsQuestion) {
            encodeQuestion((DnsQuestion) dnsRecord, byteBuf);
        } else if (dnsRecord instanceof DnsPtrRecord) {
            encodePtrRecord((DnsPtrRecord) dnsRecord, byteBuf);
        } else if (dnsRecord instanceof DnsOptEcsRecord) {
            encodeOptEcsRecord((DnsOptEcsRecord) dnsRecord, byteBuf);
        } else if (dnsRecord instanceof DnsOptPseudoRecord) {
            encodeOptPseudoRecord((DnsOptPseudoRecord) dnsRecord, byteBuf);
        } else if (dnsRecord instanceof DnsRawRecord) {
            encodeRawRecord((DnsRawRecord) dnsRecord, byteBuf);
        } else {
            throw new UnsupportedMessageTypeException(StringUtil.simpleClassName(dnsRecord));
        }
    }
}
