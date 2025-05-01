package org.greenrobot.eventbus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
/* compiled from: HandlerPoster.java */
/* loaded from: classes7.dex */
final class e extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private final h f72343a;

    /* renamed from: b  reason: collision with root package name */
    private final int f72344b;

    /* renamed from: c  reason: collision with root package name */
    private final c f72345c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f72346d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(c cVar, Looper looper, int i4) {
        super(looper);
        this.f72345c = cVar;
        this.f72344b = i4;
        this.f72343a = new h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(l lVar, Object obj) {
        g a5 = g.a(lVar, obj);
        synchronized (this) {
            this.f72343a.a(a5);
            if (!this.f72346d) {
                this.f72346d = true;
                if (!sendMessage(obtainMessage())) {
                    throw new EventBusException("Could not send handler message");
                }
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                g b5 = this.f72343a.b();
                if (b5 == null) {
                    synchronized (this) {
                        b5 = this.f72343a.b();
                        if (b5 == null) {
                            this.f72346d = false;
                            return;
                        }
                    }
                }
                this.f72345c.k(b5);
            } while (SystemClock.uptimeMillis() - uptimeMillis < this.f72344b);
            if (sendMessage(obtainMessage())) {
                this.f72346d = true;
                return;
            }
            throw new EventBusException("Could not send handler message");
        } finally {
            this.f72346d = false;
        }
    }
}
