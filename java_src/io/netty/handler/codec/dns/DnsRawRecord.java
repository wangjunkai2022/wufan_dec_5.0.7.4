package io.netty.handler.codec.dns;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufHolder;
/* loaded from: classes6.dex */
public interface DnsRawRecord extends DnsRecord, ByteBufHolder {
    DnsRawRecord copy();

    DnsRawRecord duplicate();

    DnsRawRecord replace(ByteBuf byteBuf);

    DnsRawRecord retain();

    DnsRawRecord retain(int i4);

    DnsRawRecord retainedDuplicate();

    DnsRawRecord touch();

    DnsRawRecord touch(Object obj);
}
