package com.facebook.rebound;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
/* compiled from: ChoreographerCompat.java */
/* loaded from: classes2.dex */
public class f {

    /* renamed from: c  reason: collision with root package name */
    private static final long f12585c = 17;

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f12586d;

    /* renamed from: e  reason: collision with root package name */
    private static f f12587e;

    /* renamed from: a  reason: collision with root package name */
    private Handler f12588a;

    /* renamed from: b  reason: collision with root package name */
    private Choreographer f12589b;

    /* compiled from: ChoreographerCompat.java */
    /* loaded from: classes2.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        private Runnable f12590a;

        /* renamed from: b  reason: collision with root package name */
        private Choreographer.FrameCallback f12591b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChoreographerCompat.java */
        /* renamed from: com.facebook.rebound.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class Choreographer$FrameCallbackC0285a implements Choreographer.FrameCallback {
            Choreographer$FrameCallbackC0285a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j4) {
                a.this.a(j4);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChoreographerCompat.java */
        /* loaded from: classes2.dex */
        public class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.a(System.nanoTime());
            }
        }

        public abstract void a(long j4);

        @TargetApi(16)
        Choreographer.FrameCallback b() {
            if (this.f12591b == null) {
                this.f12591b = new Choreographer$FrameCallbackC0285a();
            }
            return this.f12591b;
        }

        Runnable c() {
            if (this.f12590a == null) {
                this.f12590a = new b();
            }
            return this.f12590a;
        }
    }

    static {
        f12586d = Build.VERSION.SDK_INT >= 16;
        f12587e = new f();
    }

    private f() {
        if (f12586d) {
            this.f12589b = d();
        } else {
            this.f12588a = new Handler(Looper.getMainLooper());
        }
    }

    @TargetApi(16)
    private void a(Choreographer.FrameCallback frameCallback) {
        this.f12589b.postFrameCallback(frameCallback);
    }

    @TargetApi(16)
    private void b(Choreographer.FrameCallback frameCallback, long j4) {
        this.f12589b.postFrameCallbackDelayed(frameCallback, j4);
    }

    @TargetApi(16)
    private void c(Choreographer.FrameCallback frameCallback) {
        this.f12589b.removeFrameCallback(frameCallback);
    }

    @TargetApi(16)
    private Choreographer d() {
        return Choreographer.getInstance();
    }

    public static f e() {
        return f12587e;
    }

    public void f(a aVar) {
        if (f12586d) {
            a(aVar.b());
        } else {
            this.f12588a.postDelayed(aVar.c(), 0L);
        }
    }

    public void g(a aVar, long j4) {
        if (f12586d) {
            b(aVar.b(), j4);
        } else {
            this.f12588a.postDelayed(aVar.c(), j4 + f12585c);
        }
    }

    public void h(a aVar) {
        if (f12586d) {
            c(aVar.b());
        } else {
            this.f12588a.removeCallbacks(aVar.c());
        }
    }
}
