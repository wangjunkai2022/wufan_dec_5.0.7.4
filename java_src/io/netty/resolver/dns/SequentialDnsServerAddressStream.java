package io.netty.resolver.dns;

import java.net.InetSocketAddress;
import java.util.Collection;
import java.util.List;
/* loaded from: classes6.dex */
final class SequentialDnsServerAddressStream implements DnsServerAddressStream {
    private final List<? extends InetSocketAddress> addresses;

    /* renamed from: i  reason: collision with root package name */
    private int f69220i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SequentialDnsServerAddressStream(List<? extends InetSocketAddress> list, int i4) {
        this.addresses = list;
        this.f69220i = i4;
    }

    @Override // io.netty.resolver.dns.DnsServerAddressStream
    public InetSocketAddress next() {
        int i4 = this.f69220i;
        InetSocketAddress inetSocketAddress = this.addresses.get(i4);
        int i5 = i4 + 1;
        if (i5 < this.addresses.size()) {
            this.f69220i = i5;
        } else {
            this.f69220i = 0;
        }
        return inetSocketAddress;
    }

    @Override // io.netty.resolver.dns.DnsServerAddressStream
    public int size() {
        return this.addresses.size();
    }

    public String toString() {
        return toString("sequential", this.f69220i, this.addresses);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String toString(String str, int i4, Collection<? extends InetSocketAddress> collection) {
        StringBuilder sb = new StringBuilder(str.length() + 2 + (collection.size() * 16));
        sb.append(str);
        sb.append("(index: ");
        sb.append(i4);
        sb.append(", addrs: (");
        for (InetSocketAddress inetSocketAddress : collection) {
            sb.append(inetSocketAddress);
            sb.append(", ");
        }
        sb.setLength(sb.length() - 2);
        sb.append("))");
        return sb.toString();
    }

    @Override // io.netty.resolver.dns.DnsServerAddressStream
    public SequentialDnsServerAddressStream duplicate() {
        return new SequentialDnsServerAddressStream(this.addresses, this.f69220i);
    }
}
