package com.facebook.rebound;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
/* compiled from: AndroidSpringLooperFactory.java */
/* loaded from: classes2.dex */
abstract class a {

    /* compiled from: AndroidSpringLooperFactory.java */
    @TargetApi(16)
    /* renamed from: com.facebook.rebound.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private static class C0281a extends n {

        /* renamed from: b  reason: collision with root package name */
        private final Choreographer f12551b;

        /* renamed from: c  reason: collision with root package name */
        private final Choreographer.FrameCallback f12552c = new Choreographer$FrameCallbackC0282a();

        /* renamed from: d  reason: collision with root package name */
        private boolean f12553d;

        /* renamed from: e  reason: collision with root package name */
        private long f12554e;

        /* compiled from: AndroidSpringLooperFactory.java */
        /* renamed from: com.facebook.rebound.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class Choreographer$FrameCallbackC0282a implements Choreographer.FrameCallback {
            Choreographer$FrameCallbackC0282a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j4) {
                if (!C0281a.this.f12553d || C0281a.this.f12630a == null) {
                    return;
                }
                long uptimeMillis = SystemClock.uptimeMillis();
                C0281a c0281a = C0281a.this;
                c0281a.f12630a.i(uptimeMillis - c0281a.f12554e);
                C0281a.this.f12554e = uptimeMillis;
                C0281a.this.f12551b.postFrameCallback(C0281a.this.f12552c);
            }
        }

        public C0281a(Choreographer choreographer) {
            this.f12551b = choreographer;
        }

        public static C0281a i() {
            return new C0281a(Choreographer.getInstance());
        }

        @Override // com.facebook.rebound.n
        public void b() {
            if (this.f12553d) {
                return;
            }
            this.f12553d = true;
            this.f12554e = SystemClock.uptimeMillis();
            this.f12551b.removeFrameCallback(this.f12552c);
            this.f12551b.postFrameCallback(this.f12552c);
        }

        @Override // com.facebook.rebound.n
        public void c() {
            this.f12553d = false;
            this.f12551b.removeFrameCallback(this.f12552c);
        }
    }

    /* compiled from: AndroidSpringLooperFactory.java */
    /* loaded from: classes2.dex */
    private static class b extends n {

        /* renamed from: b  reason: collision with root package name */
        private final Handler f12556b;

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f12557c = new RunnableC0283a();

        /* renamed from: d  reason: collision with root package name */
        private boolean f12558d;

        /* renamed from: e  reason: collision with root package name */
        private long f12559e;

        /* compiled from: AndroidSpringLooperFactory.java */
        /* renamed from: com.facebook.rebound.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class RunnableC0283a implements Runnable {
            RunnableC0283a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!b.this.f12558d || b.this.f12630a == null) {
                    return;
                }
                long uptimeMillis = SystemClock.uptimeMillis();
                b bVar = b.this;
                bVar.f12630a.i(uptimeMillis - bVar.f12559e);
                b.this.f12559e = uptimeMillis;
                b.this.f12556b.post(b.this.f12557c);
            }
        }

        public b(Handler handler) {
            this.f12556b = handler;
        }

        public static n i() {
            return new b(new Handler());
        }

        @Override // com.facebook.rebound.n
        public void b() {
            if (this.f12558d) {
                return;
            }
            this.f12558d = true;
            this.f12559e = SystemClock.uptimeMillis();
            this.f12556b.removeCallbacks(this.f12557c);
            this.f12556b.post(this.f12557c);
        }

        @Override // com.facebook.rebound.n
        public void c() {
            this.f12558d = false;
            this.f12556b.removeCallbacks(this.f12557c);
        }
    }

    a() {
    }

    public static n a() {
        if (Build.VERSION.SDK_INT >= 16) {
            return C0281a.i();
        }
        return b.i();
    }
}
