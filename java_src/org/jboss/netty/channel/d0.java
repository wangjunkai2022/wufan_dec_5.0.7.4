package org.jboss.netty.channel;

import java.net.SocketAddress;
import java.util.Objects;
/* compiled from: DownstreamMessageEvent.java */
/* loaded from: classes7.dex */
public class d0 implements i0 {

    /* renamed from: a  reason: collision with root package name */
    private final e f72537a;

    /* renamed from: b  reason: collision with root package name */
    private final j f72538b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f72539c;

    /* renamed from: d  reason: collision with root package name */
    private final SocketAddress f72540d;

    public d0(e eVar, j jVar, Object obj, SocketAddress socketAddress) {
        Objects.requireNonNull(eVar, "channel");
        Objects.requireNonNull(jVar, "future");
        Objects.requireNonNull(obj, "message");
        this.f72537a = eVar;
        this.f72538b = jVar;
        this.f72539c = obj;
        if (socketAddress != null) {
            this.f72540d = socketAddress;
        } else {
            this.f72540d = eVar.getRemoteAddress();
        }
    }

    @Override // org.jboss.netty.channel.h
    public j d() {
        return this.f72538b;
    }

    @Override // org.jboss.netty.channel.h
    public e getChannel() {
        return this.f72537a;
    }

    @Override // org.jboss.netty.channel.i0
    public Object getMessage() {
        return this.f72539c;
    }

    @Override // org.jboss.netty.channel.i0
    public SocketAddress getRemoteAddress() {
        return this.f72540d;
    }

    public String toString() {
        if (getRemoteAddress() == getChannel().getRemoteAddress()) {
            return getChannel().toString() + " WRITE: " + org.jboss.netty.util.internal.i.b(getMessage());
        }
        return getChannel().toString() + " WRITE: " + org.jboss.netty.util.internal.i.b(getMessage()) + " to " + getRemoteAddress();
    }
}
