package io.netty.resolver.dns;

import com.kuaishou.weapon.p0.t;
import io.netty.handler.codec.dns.DnsQuestion;
import io.netty.util.internal.ObjectUtil;
/* loaded from: classes6.dex */
public final class BiDnsQueryLifecycleObserverFactory implements DnsQueryLifecycleObserverFactory {

    /* renamed from: a  reason: collision with root package name */
    private final DnsQueryLifecycleObserverFactory f69217a;

    /* renamed from: b  reason: collision with root package name */
    private final DnsQueryLifecycleObserverFactory f69218b;

    public BiDnsQueryLifecycleObserverFactory(DnsQueryLifecycleObserverFactory dnsQueryLifecycleObserverFactory, DnsQueryLifecycleObserverFactory dnsQueryLifecycleObserverFactory2) {
        this.f69217a = (DnsQueryLifecycleObserverFactory) ObjectUtil.checkNotNull(dnsQueryLifecycleObserverFactory, "a");
        this.f69218b = (DnsQueryLifecycleObserverFactory) ObjectUtil.checkNotNull(dnsQueryLifecycleObserverFactory2, t.f55693l);
    }

    @Override // io.netty.resolver.dns.DnsQueryLifecycleObserverFactory
    public DnsQueryLifecycleObserver newDnsQueryLifecycleObserver(DnsQuestion dnsQuestion) {
        return new BiDnsQueryLifecycleObserver(this.f69217a.newDnsQueryLifecycleObserver(dnsQuestion), this.f69218b.newDnsQueryLifecycleObserver(dnsQuestion));
    }
}
