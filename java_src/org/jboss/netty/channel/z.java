package org.jboss.netty.channel;

import java.util.Objects;
/* compiled from: DefaultExceptionEvent.java */
/* loaded from: classes7.dex */
public class z implements e0 {

    /* renamed from: a  reason: collision with root package name */
    private final e f72702a;

    /* renamed from: b  reason: collision with root package name */
    private final Throwable f72703b;

    public z(e eVar, Throwable th) {
        Objects.requireNonNull(eVar, "channel");
        Objects.requireNonNull(th, "cause");
        this.f72702a = eVar;
        this.f72703b = th;
    }

    @Override // org.jboss.netty.channel.e0
    public Throwable a() {
        return this.f72703b;
    }

    @Override // org.jboss.netty.channel.h
    public j d() {
        return s.W(getChannel());
    }

    @Override // org.jboss.netty.channel.h
    public e getChannel() {
        return this.f72702a;
    }

    public String toString() {
        return getChannel().toString() + " EXCEPTION: " + this.f72703b;
    }
}
