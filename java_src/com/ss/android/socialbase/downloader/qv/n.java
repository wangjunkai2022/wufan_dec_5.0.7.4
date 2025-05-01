package com.ss.android.socialbase.downloader.qv;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
/* loaded from: classes5.dex */
public class n {

    /* renamed from: i  reason: collision with root package name */
    private Handler f61337i;

    /* renamed from: p  reason: collision with root package name */
    private vv f61339p;
    private Object vv = new Object();

    /* renamed from: m  reason: collision with root package name */
    private Queue<m> f61338m = new ConcurrentLinkedQueue();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class m {

        /* renamed from: m  reason: collision with root package name */
        public long f61340m;
        public Runnable vv;

        public m(Runnable runnable, long j4) {
            this.vv = runnable;
            this.f61340m = j4;
        }
    }

    /* loaded from: classes5.dex */
    private class vv extends HandlerThread {
        vv(String str) {
            super(str);
        }

        @Override // android.os.HandlerThread
        protected void onLooperPrepared() {
            super.onLooperPrepared();
            Looper looper = getLooper();
            synchronized (n.this.vv) {
                n.this.f61337i = new Handler(looper);
            }
            while (!n.this.f61338m.isEmpty()) {
                m mVar = (m) n.this.f61338m.poll();
                if (mVar != null) {
                    n.this.f61337i.postDelayed(mVar.vv, mVar.f61340m);
                }
            }
        }
    }

    public n(String str) {
        this.f61339p = new vv(str);
    }

    public void m() {
        this.f61339p.quit();
    }

    public void vv() {
        this.f61339p.start();
    }

    public void vv(Runnable runnable) {
        vv(runnable, 0L);
    }

    public void vv(Runnable runnable, long j4) {
        if (this.f61337i == null) {
            synchronized (this.vv) {
                if (this.f61337i == null) {
                    this.f61338m.add(new m(runnable, j4));
                    return;
                }
            }
        }
        this.f61337i.postDelayed(runnable, j4);
    }
}
