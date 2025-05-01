package org.jboss.netty.channel;

import java.net.SocketAddress;
import java.util.Objects;
/* compiled from: UpstreamMessageEvent.java */
/* loaded from: classes7.dex */
public class p0 implements i0 {

    /* renamed from: a  reason: collision with root package name */
    private final e f72554a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f72555b;

    /* renamed from: c  reason: collision with root package name */
    private final SocketAddress f72556c;

    public p0(e eVar, Object obj, SocketAddress socketAddress) {
        Objects.requireNonNull(eVar, "channel");
        Objects.requireNonNull(obj, "message");
        this.f72554a = eVar;
        this.f72555b = obj;
        if (socketAddress != null) {
            this.f72556c = socketAddress;
        } else {
            this.f72556c = eVar.getRemoteAddress();
        }
    }

    @Override // org.jboss.netty.channel.h
    public j d() {
        return s.W(getChannel());
    }

    @Override // org.jboss.netty.channel.h
    public e getChannel() {
        return this.f72554a;
    }

    @Override // org.jboss.netty.channel.i0
    public Object getMessage() {
        return this.f72555b;
    }

    @Override // org.jboss.netty.channel.i0
    public SocketAddress getRemoteAddress() {
        return this.f72556c;
    }

    public String toString() {
        if (getRemoteAddress() == getChannel().getRemoteAddress()) {
            return getChannel().toString() + " RECEIVED: " + org.jboss.netty.util.internal.i.b(getMessage());
        }
        return getChannel().toString() + " RECEIVED: " + org.jboss.netty.util.internal.i.b(getMessage()) + " from " + getRemoteAddress();
    }
}
