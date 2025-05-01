package com.facebook.common.executors;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: StatefulRunnable.java */
/* loaded from: classes2.dex */
public abstract class h<T> implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    protected static final int f10840c = 0;

    /* renamed from: d  reason: collision with root package name */
    protected static final int f10841d = 1;

    /* renamed from: e  reason: collision with root package name */
    protected static final int f10842e = 2;

    /* renamed from: f  reason: collision with root package name */
    protected static final int f10843f = 3;

    /* renamed from: g  reason: collision with root package name */
    protected static final int f10844g = 4;

    /* renamed from: b  reason: collision with root package name */
    protected final AtomicInteger f10845b = new AtomicInteger(0);

    public void a() {
        if (this.f10845b.compareAndSet(0, 2)) {
            d();
        }
    }

    protected void b(T t4) {
    }

    protected abstract T c() throws Exception;

    protected void d() {
    }

    protected void e(Exception exc) {
    }

    protected void f(T t4) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f10845b.compareAndSet(0, 1)) {
            try {
                T c5 = c();
                this.f10845b.set(3);
                try {
                    f(c5);
                } finally {
                    b(c5);
                }
            } catch (Exception e5) {
                this.f10845b.set(4);
                e(e5);
            }
        }
    }
}
