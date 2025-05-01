package com.umeng.commonsdk.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
/* compiled from: CountDownTimer.java */
/* loaded from: classes6.dex */
public abstract class a {

    /* renamed from: e  reason: collision with root package name */
    private static final int f64576e = 1;

    /* renamed from: a  reason: collision with root package name */
    private final long f64577a;

    /* renamed from: b  reason: collision with root package name */
    private final long f64578b;

    /* renamed from: c  reason: collision with root package name */
    private long f64579c;

    /* renamed from: f  reason: collision with root package name */
    private HandlerThread f64581f;

    /* renamed from: g  reason: collision with root package name */
    private Handler f64582g;

    /* renamed from: d  reason: collision with root package name */
    private boolean f64580d = false;

    /* renamed from: h  reason: collision with root package name */
    private Handler.Callback f64583h = new Handler.Callback() { // from class: com.umeng.commonsdk.utils.a.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            synchronized (a.this) {
                if (a.this.f64580d) {
                    return true;
                }
                long elapsedRealtime = a.this.f64579c - SystemClock.elapsedRealtime();
                if (elapsedRealtime > 0) {
                    if (elapsedRealtime < a.this.f64578b) {
                        a.this.f64582g.sendMessageDelayed(a.this.f64582g.obtainMessage(1), elapsedRealtime);
                    } else {
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        a.this.a(elapsedRealtime);
                        long elapsedRealtime3 = (elapsedRealtime2 + a.this.f64578b) - SystemClock.elapsedRealtime();
                        while (elapsedRealtime3 < 0) {
                            elapsedRealtime3 += a.this.f64578b;
                        }
                        a.this.f64582g.sendMessageDelayed(a.this.f64582g.obtainMessage(1), elapsedRealtime3);
                    }
                } else {
                    a.this.c();
                    if (a.this.f64581f != null) {
                        a.this.f64581f.quit();
                    }
                }
                return false;
            }
        }
    };

    public a(long j4, long j5) {
        this.f64577a = j4;
        this.f64578b = j5;
        if (!d()) {
            HandlerThread handlerThread = new HandlerThread("CountDownTimerThread");
            this.f64581f = handlerThread;
            handlerThread.start();
            this.f64582g = new Handler(this.f64581f.getLooper(), this.f64583h);
            return;
        }
        this.f64582g = new Handler(this.f64583h);
    }

    public abstract void a(long j4);

    public abstract void c();

    private boolean d() {
        return Looper.getMainLooper().getThread().equals(Thread.currentThread());
    }

    public final synchronized void a() {
        this.f64580d = true;
        this.f64582g.removeMessages(1);
    }

    public final synchronized a b() {
        this.f64580d = false;
        if (this.f64577a <= 0) {
            c();
            return this;
        }
        this.f64579c = SystemClock.elapsedRealtime() + this.f64577a;
        Handler handler = this.f64582g;
        handler.sendMessage(handler.obtainMessage(1));
        return this;
    }
}
