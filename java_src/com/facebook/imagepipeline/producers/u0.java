package com.facebook.imagepipeline.producers;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
/* compiled from: ThreadHandoffProducerQueue.java */
/* loaded from: classes2.dex */
public class u0 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f12399a = false;

    /* renamed from: b  reason: collision with root package name */
    private final Deque<Runnable> f12400b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    private final Executor f12401c;

    public u0(Executor executor) {
        this.f12401c = (Executor) com.facebook.common.internal.h.i(executor);
    }

    private void b() {
        while (!this.f12400b.isEmpty()) {
            this.f12401c.execute(this.f12400b.pop());
        }
        this.f12400b.clear();
    }

    public synchronized void a(Runnable runnable) {
        if (this.f12399a) {
            this.f12400b.add(runnable);
        } else {
            this.f12401c.execute(runnable);
        }
    }

    public synchronized boolean c() {
        return this.f12399a;
    }

    public synchronized void d(Runnable runnable) {
        this.f12400b.remove(runnable);
    }

    public synchronized void e() {
        this.f12399a = true;
    }

    public synchronized void f() {
        this.f12399a = false;
        b();
    }
}
