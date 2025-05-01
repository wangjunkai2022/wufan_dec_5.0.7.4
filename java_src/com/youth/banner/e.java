package com.youth.banner;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: WeakHandler.java */
/* loaded from: classes6.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final Handler.Callback f68552a;

    /* renamed from: b  reason: collision with root package name */
    private final b f68553b;

    /* renamed from: c  reason: collision with root package name */
    private Lock f68554c;
    @VisibleForTesting

    /* renamed from: d  reason: collision with root package name */
    final a f68555d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WeakHandler.java */
    /* loaded from: classes6.dex */
    public static class a {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        a f68556a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        a f68557b;
        @NonNull

        /* renamed from: c  reason: collision with root package name */
        final Runnable f68558c;
        @NonNull

        /* renamed from: d  reason: collision with root package name */
        final c f68559d;
        @NonNull

        /* renamed from: e  reason: collision with root package name */
        Lock f68560e;

        public a(@NonNull Lock lock, @NonNull Runnable runnable) {
            this.f68558c = runnable;
            this.f68560e = lock;
            this.f68559d = new c(new WeakReference(runnable), new WeakReference(this));
        }

        public void a(@NonNull a aVar) {
            this.f68560e.lock();
            try {
                a aVar2 = this.f68556a;
                if (aVar2 != null) {
                    aVar2.f68557b = aVar;
                }
                aVar.f68556a = aVar2;
                this.f68556a = aVar;
                aVar.f68557b = this;
            } finally {
                this.f68560e.unlock();
            }
        }

        public c b() {
            this.f68560e.lock();
            try {
                a aVar = this.f68557b;
                if (aVar != null) {
                    aVar.f68556a = this.f68556a;
                }
                a aVar2 = this.f68556a;
                if (aVar2 != null) {
                    aVar2.f68557b = aVar;
                }
                this.f68557b = null;
                this.f68556a = null;
                this.f68560e.unlock();
                return this.f68559d;
            } catch (Throwable th) {
                this.f68560e.unlock();
                throw th;
            }
        }

        @Nullable
        public c c(Runnable runnable) {
            this.f68560e.lock();
            try {
                for (a aVar = this.f68556a; aVar != null; aVar = aVar.f68556a) {
                    if (aVar.f68558c == runnable) {
                        return aVar.b();
                    }
                }
                this.f68560e.unlock();
                return null;
            } finally {
                this.f68560e.unlock();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WeakHandler.java */
    /* loaded from: classes6.dex */
    public static class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final WeakReference<Runnable> f68562b;

        /* renamed from: c  reason: collision with root package name */
        private final WeakReference<a> f68563c;

        c(WeakReference<Runnable> weakReference, WeakReference<a> weakReference2) {
            this.f68562b = weakReference;
            this.f68563c = weakReference2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = this.f68562b.get();
            a aVar = this.f68563c.get();
            if (aVar != null) {
                aVar.b();
            }
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public e() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f68554c = reentrantLock;
        this.f68555d = new a(reentrantLock, null);
        this.f68552a = null;
        this.f68553b = new b();
    }

    private c u(@NonNull Runnable runnable) {
        Objects.requireNonNull(runnable, "Runnable can't be null");
        a aVar = new a(this.f68554c, runnable);
        this.f68555d.a(aVar);
        return aVar.f68559d;
    }

    public final Looper a() {
        return this.f68553b.getLooper();
    }

    public final boolean b(int i4) {
        return this.f68553b.hasMessages(i4);
    }

    public final boolean c(int i4, Object obj) {
        return this.f68553b.hasMessages(i4, obj);
    }

    public final boolean d(@NonNull Runnable runnable) {
        return this.f68553b.post(u(runnable));
    }

    public final boolean e(Runnable runnable) {
        return this.f68553b.postAtFrontOfQueue(u(runnable));
    }

    public final boolean f(@NonNull Runnable runnable, long j4) {
        return this.f68553b.postAtTime(u(runnable), j4);
    }

    public final boolean g(Runnable runnable, Object obj, long j4) {
        return this.f68553b.postAtTime(u(runnable), obj, j4);
    }

    public final boolean h(Runnable runnable, long j4) {
        return this.f68553b.postDelayed(u(runnable), j4);
    }

    public final void i(Runnable runnable) {
        c c5 = this.f68555d.c(runnable);
        if (c5 != null) {
            this.f68553b.removeCallbacks(c5);
        }
    }

    public final void j(Runnable runnable, Object obj) {
        c c5 = this.f68555d.c(runnable);
        if (c5 != null) {
            this.f68553b.removeCallbacks(c5, obj);
        }
    }

    public final void k(Object obj) {
        this.f68553b.removeCallbacksAndMessages(obj);
    }

    public final void l(int i4) {
        this.f68553b.removeMessages(i4);
    }

    public final void m(int i4, Object obj) {
        this.f68553b.removeMessages(i4, obj);
    }

    public final boolean n(int i4) {
        return this.f68553b.sendEmptyMessage(i4);
    }

    public final boolean o(int i4, long j4) {
        return this.f68553b.sendEmptyMessageAtTime(i4, j4);
    }

    public final boolean p(int i4, long j4) {
        return this.f68553b.sendEmptyMessageDelayed(i4, j4);
    }

    public final boolean q(Message message) {
        return this.f68553b.sendMessage(message);
    }

    public final boolean r(Message message) {
        return this.f68553b.sendMessageAtFrontOfQueue(message);
    }

    public boolean s(Message message, long j4) {
        return this.f68553b.sendMessageAtTime(message, j4);
    }

    public final boolean t(Message message, long j4) {
        return this.f68553b.sendMessageDelayed(message, j4);
    }

    /* compiled from: WeakHandler.java */
    /* loaded from: classes6.dex */
    private static class b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<Handler.Callback> f68561a;

        b() {
            this.f68561a = null;
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            Handler.Callback callback;
            WeakReference<Handler.Callback> weakReference = this.f68561a;
            if (weakReference == null || (callback = weakReference.get()) == null) {
                return;
            }
            callback.handleMessage(message);
        }

        b(WeakReference<Handler.Callback> weakReference) {
            this.f68561a = weakReference;
        }

        b(Looper looper) {
            super(looper);
            this.f68561a = null;
        }

        b(Looper looper, WeakReference<Handler.Callback> weakReference) {
            super(looper);
            this.f68561a = weakReference;
        }
    }

    public e(@Nullable Handler.Callback callback) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f68554c = reentrantLock;
        this.f68555d = new a(reentrantLock, null);
        this.f68552a = callback;
        this.f68553b = new b(new WeakReference(callback));
    }

    public e(@NonNull Looper looper) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f68554c = reentrantLock;
        this.f68555d = new a(reentrantLock, null);
        this.f68552a = null;
        this.f68553b = new b(looper);
    }

    public e(@NonNull Looper looper, @NonNull Handler.Callback callback) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f68554c = reentrantLock;
        this.f68555d = new a(reentrantLock, null);
        this.f68552a = callback;
        this.f68553b = new b(looper, new WeakReference(callback));
    }
}
