package org.jboss.netty.util.internal;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: SharedResourceMisuseDetector.java */
/* loaded from: classes7.dex */
public class g {

    /* renamed from: c  reason: collision with root package name */
    private static final int f72829c = 256;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicLong f72830a = new AtomicLong();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f72831b = new AtomicBoolean();

    public void a() {
        this.f72830a.decrementAndGet();
    }

    public void b() {
        if (this.f72830a.incrementAndGet() > 256) {
            this.f72831b.compareAndSet(false, true);
        }
    }
}
