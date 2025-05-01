package io.netty.resolver.dns;

import io.netty.util.internal.PlatformDependent;
import java.net.InetSocketAddress;
import java.util.Collections;
import java.util.List;
/* loaded from: classes6.dex */
final class ShuffledDnsServerAddressStream implements DnsServerAddressStream {
    private final List<InetSocketAddress> addresses;

    /* renamed from: i  reason: collision with root package name */
    private int f69221i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ShuffledDnsServerAddressStream(List<InetSocketAddress> list) {
        this.addresses = list;
        shuffle();
    }

    private void shuffle() {
        Collections.shuffle(this.addresses, PlatformDependent.threadLocalRandom());
    }

    @Override // io.netty.resolver.dns.DnsServerAddressStream
    public InetSocketAddress next() {
        int i4 = this.f69221i;
        InetSocketAddress inetSocketAddress = this.addresses.get(i4);
        int i5 = i4 + 1;
        if (i5 < this.addresses.size()) {
            this.f69221i = i5;
        } else {
            this.f69221i = 0;
            shuffle();
        }
        return inetSocketAddress;
    }

    @Override // io.netty.resolver.dns.DnsServerAddressStream
    public int size() {
        return this.addresses.size();
    }

    public String toString() {
        return SequentialDnsServerAddressStream.toString("shuffled", this.f69221i, this.addresses);
    }

    @Override // io.netty.resolver.dns.DnsServerAddressStream
    public ShuffledDnsServerAddressStream duplicate() {
        return new ShuffledDnsServerAddressStream(this.addresses, this.f69221i);
    }

    private ShuffledDnsServerAddressStream(List<InetSocketAddress> list, int i4) {
        this.addresses = list;
        this.f69221i = i4;
    }
}
