package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
/* compiled from: LottieTask.java */
/* loaded from: classes2.dex */
public class v0<T> {

    /* renamed from: e  reason: collision with root package name */
    public static Executor f4328e = Executors.newCachedThreadPool();

    /* renamed from: a  reason: collision with root package name */
    private final Set<p0<T>> f4329a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<p0<Throwable>> f4330b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f4331c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private volatile t0<T> f4332d;

    /* compiled from: LottieTask.java */
    /* loaded from: classes2.dex */
    private class a extends FutureTask<t0<T>> {
        a(Callable<t0<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            if (isCancelled()) {
                return;
            }
            try {
                v0.this.setResult(get());
            } catch (InterruptedException | ExecutionException e5) {
                v0.this.setResult(new t0(e5));
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public v0(Callable<t0<T>> callable) {
        this(callable, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        t0<T> t0Var = this.f4332d;
        if (t0Var == null) {
            return;
        }
        if (t0Var.b() != null) {
            h(t0Var.b());
        } else {
            f(t0Var.a());
        }
    }

    private synchronized void f(Throwable th) {
        ArrayList<p0> arrayList = new ArrayList(this.f4330b);
        if (arrayList.isEmpty()) {
            com.airbnb.lottie.utils.d.f("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        for (p0 p0Var : arrayList) {
            p0Var.onResult(th);
        }
    }

    private void g() {
        this.f4331c.post(new Runnable() { // from class: com.airbnb.lottie.u0
            @Override // java.lang.Runnable
            public final void run() {
                v0.this.e();
            }
        });
    }

    private synchronized void h(T t4) {
        for (p0 p0Var : new ArrayList(this.f4329a)) {
            p0Var.onResult(t4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResult(@Nullable t0<T> t0Var) {
        if (this.f4332d == null) {
            this.f4332d = t0Var;
            g();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public synchronized v0<T> c(p0<Throwable> p0Var) {
        t0<T> t0Var = this.f4332d;
        if (t0Var != null && t0Var.a() != null) {
            p0Var.onResult(t0Var.a());
        }
        this.f4330b.add(p0Var);
        return this;
    }

    public synchronized v0<T> d(p0<T> p0Var) {
        t0<T> t0Var = this.f4332d;
        if (t0Var != null && t0Var.b() != null) {
            p0Var.onResult(t0Var.b());
        }
        this.f4329a.add(p0Var);
        return this;
    }

    public synchronized v0<T> i(p0<Throwable> p0Var) {
        this.f4330b.remove(p0Var);
        return this;
    }

    public synchronized v0<T> j(p0<T> p0Var) {
        this.f4329a.remove(p0Var);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public v0(Callable<t0<T>> callable, boolean z4) {
        this.f4329a = new LinkedHashSet(1);
        this.f4330b = new LinkedHashSet(1);
        this.f4331c = new Handler(Looper.getMainLooper());
        this.f4332d = null;
        if (z4) {
            try {
                setResult(callable.call());
                return;
            } catch (Throwable th) {
                setResult(new t0<>(th));
                return;
            }
        }
        f4328e.execute(new a(callable));
    }
}
