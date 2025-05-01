package io.netty.resolver.dns;

import com.kuaishou.weapon.p0.t;
import io.netty.channel.ChannelFuture;
import io.netty.handler.codec.dns.DnsQuestion;
import io.netty.handler.codec.dns.DnsResponseCode;
import io.netty.util.internal.ObjectUtil;
import java.net.InetSocketAddress;
import java.util.List;
/* loaded from: classes6.dex */
public final class BiDnsQueryLifecycleObserver implements DnsQueryLifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    private final DnsQueryLifecycleObserver f69215a;

    /* renamed from: b  reason: collision with root package name */
    private final DnsQueryLifecycleObserver f69216b;

    public BiDnsQueryLifecycleObserver(DnsQueryLifecycleObserver dnsQueryLifecycleObserver, DnsQueryLifecycleObserver dnsQueryLifecycleObserver2) {
        this.f69215a = (DnsQueryLifecycleObserver) ObjectUtil.checkNotNull(dnsQueryLifecycleObserver, "a");
        this.f69216b = (DnsQueryLifecycleObserver) ObjectUtil.checkNotNull(dnsQueryLifecycleObserver2, t.f55693l);
    }

    @Override // io.netty.resolver.dns.DnsQueryLifecycleObserver
    public DnsQueryLifecycleObserver queryCNAMEd(DnsQuestion dnsQuestion) {
        try {
            this.f69215a.queryCNAMEd(dnsQuestion);
            return this;
        } finally {
            this.f69216b.queryCNAMEd(dnsQuestion);
        }
    }

    @Override // io.netty.resolver.dns.DnsQueryLifecycleObserver
    public void queryCancelled(int i4) {
        try {
            this.f69215a.queryCancelled(i4);
        } finally {
            this.f69216b.queryCancelled(i4);
        }
    }

    @Override // io.netty.resolver.dns.DnsQueryLifecycleObserver
    public void queryFailed(Throwable th) {
        try {
            this.f69215a.queryFailed(th);
        } finally {
            this.f69216b.queryFailed(th);
        }
    }

    @Override // io.netty.resolver.dns.DnsQueryLifecycleObserver
    public DnsQueryLifecycleObserver queryNoAnswer(DnsResponseCode dnsResponseCode) {
        try {
            this.f69215a.queryNoAnswer(dnsResponseCode);
            return this;
        } finally {
            this.f69216b.queryNoAnswer(dnsResponseCode);
        }
    }

    @Override // io.netty.resolver.dns.DnsQueryLifecycleObserver
    public DnsQueryLifecycleObserver queryRedirected(List<InetSocketAddress> list) {
        try {
            this.f69215a.queryRedirected(list);
            return this;
        } finally {
            this.f69216b.queryRedirected(list);
        }
    }

    @Override // io.netty.resolver.dns.DnsQueryLifecycleObserver
    public void querySucceed() {
        try {
            this.f69215a.querySucceed();
        } finally {
            this.f69216b.querySucceed();
        }
    }

    @Override // io.netty.resolver.dns.DnsQueryLifecycleObserver
    public void queryWritten(InetSocketAddress inetSocketAddress, ChannelFuture channelFuture) {
        try {
            this.f69215a.queryWritten(inetSocketAddress, channelFuture);
        } finally {
            this.f69216b.queryWritten(inetSocketAddress, channelFuture);
        }
    }
}
