package org.jboss.netty.channel;

import java.util.Objects;
/* compiled from: FailedChannelFuture.java */
/* loaded from: classes7.dex */
public class f0 extends u {

    /* renamed from: c  reason: collision with root package name */
    private final Throwable f72545c;

    public f0(e eVar, Throwable th) {
        super(eVar);
        Objects.requireNonNull(th, "cause");
        this.f72545c = th;
    }

    private void f() {
        Throwable th = this.f72545c;
        if (!(th instanceof RuntimeException)) {
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new ChannelException(this.f72545c);
        }
        throw ((RuntimeException) th);
    }

    @Override // org.jboss.netty.channel.j
    public Throwable a() {
        return this.f72545c;
    }

    @Override // org.jboss.netty.channel.j
    @Deprecated
    public j e() throws Exception {
        Throwable th = this.f72545c;
        if (!(th instanceof Exception)) {
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new RuntimeException(this.f72545c);
        }
        throw ((Exception) th);
    }

    @Override // org.jboss.netty.channel.j
    public boolean isSuccess() {
        return false;
    }

    @Override // org.jboss.netty.channel.j
    public j sync() throws InterruptedException {
        f();
        return this;
    }

    @Override // org.jboss.netty.channel.j
    public j syncUninterruptibly() {
        f();
        return this;
    }
}
