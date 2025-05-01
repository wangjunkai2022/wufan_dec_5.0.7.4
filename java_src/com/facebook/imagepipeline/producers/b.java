package com.facebook.imagepipeline.producers;

import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;
/* compiled from: BaseConsumer.java */
@ThreadSafe
/* loaded from: classes.dex */
public abstract class b<T> implements Consumer<T> {

    /* renamed from: g  reason: collision with root package name */
    private boolean f12145g = false;

    public static boolean d(int i4) {
        return (i4 & 1) == 1;
    }

    public static boolean e(int i4) {
        return !d(i4);
    }

    public static int k(boolean z4) {
        return z4 ? 1 : 0;
    }

    public static boolean l(int i4, int i5) {
        return (i4 & i5) != 0;
    }

    public static boolean m(int i4, int i5) {
        return (i4 & i5) == i5;
    }

    public static int n(int i4, int i5) {
        return i4 & (i5 ^ (-1));
    }

    public static int o(int i4, int i5) {
        return i4 | i5;
    }

    @Override // com.facebook.imagepipeline.producers.Consumer
    public synchronized void a() {
        if (this.f12145g) {
            return;
        }
        this.f12145g = true;
        try {
            f();
        } catch (Exception e5) {
            j(e5);
        }
    }

    @Override // com.facebook.imagepipeline.producers.Consumer
    public synchronized void b(@Nullable T t4, int i4) {
        if (this.f12145g) {
            return;
        }
        this.f12145g = d(i4);
        try {
            h(t4, i4);
        } catch (Exception e5) {
            j(e5);
        }
    }

    @Override // com.facebook.imagepipeline.producers.Consumer
    public synchronized void c(float f5) {
        if (this.f12145g) {
            return;
        }
        try {
            i(f5);
        } catch (Exception e5) {
            j(e5);
        }
    }

    protected abstract void f();

    protected abstract void g(Throwable th);

    protected abstract void h(T t4, int i4);

    protected void i(float f5) {
    }

    protected void j(Exception exc) {
        com.facebook.common.logging.a.t0(getClass(), "unhandled exception", exc);
    }

    @Override // com.facebook.imagepipeline.producers.Consumer
    public synchronized void onFailure(Throwable th) {
        if (this.f12145g) {
            return;
        }
        this.f12145g = true;
        try {
            g(th);
        } catch (Exception e5) {
            j(e5);
        }
    }
}
