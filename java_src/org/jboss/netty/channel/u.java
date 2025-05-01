package org.jboss.netty.channel;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
/* compiled from: CompleteChannelFuture.java */
/* loaded from: classes7.dex */
public abstract class u implements j {

    /* renamed from: b  reason: collision with root package name */
    private final e f72672b;

    /* JADX INFO: Access modifiers changed from: protected */
    public u(e eVar) {
        Objects.requireNonNull(eVar, "channel");
        this.f72672b = eVar;
    }

    @Override // org.jboss.netty.channel.j
    public j await() throws InterruptedException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        return this;
    }

    @Override // org.jboss.netty.channel.j
    public j awaitUninterruptibly() {
        return this;
    }

    @Override // org.jboss.netty.channel.j
    public boolean awaitUninterruptibly(long j4) {
        return true;
    }

    @Override // org.jboss.netty.channel.j
    public boolean awaitUninterruptibly(long j4, TimeUnit timeUnit) {
        return true;
    }

    @Override // org.jboss.netty.channel.j
    public void b(k kVar) {
        try {
            kVar.a(this);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // org.jboss.netty.channel.j
    public void c(k kVar) {
    }

    @Override // org.jboss.netty.channel.j
    public boolean cancel() {
        return false;
    }

    @Override // org.jboss.netty.channel.j
    public boolean d(long j4, long j5, long j6) {
        return false;
    }

    @Override // org.jboss.netty.channel.j
    public e getChannel() {
        return this.f72672b;
    }

    @Override // org.jboss.netty.channel.j
    public boolean isCancelled() {
        return false;
    }

    @Override // org.jboss.netty.channel.j
    public boolean isDone() {
        return true;
    }

    @Override // org.jboss.netty.channel.j
    public boolean setFailure(Throwable th) {
        return false;
    }

    @Override // org.jboss.netty.channel.j
    public boolean setSuccess() {
        return false;
    }

    @Override // org.jboss.netty.channel.j
    public boolean await(long j4, TimeUnit timeUnit) throws InterruptedException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        return true;
    }

    @Override // org.jboss.netty.channel.j
    public boolean await(long j4) throws InterruptedException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        return true;
    }
}
