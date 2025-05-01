package com.join.mgps.task;

import android.content.Context;
import android.os.CountDownTimer;
import io.netty.handler.traffic.AbstractTrafficShapingHandler;
/* compiled from: CreateApWifiThread.java */
/* loaded from: classes5.dex */
public class a implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    private static final String f54864d = a.class.getSimpleName();

    /* renamed from: e  reason: collision with root package name */
    private static final int f54865e = 15000;

    /* renamed from: b  reason: collision with root package name */
    private Context f54866b;

    /* renamed from: c  reason: collision with root package name */
    CountDownTimer f54867c = new CountDownTimerC0387a(AbstractTrafficShapingHandler.DEFAULT_MAX_TIME, 1000);

    /* compiled from: CreateApWifiThread.java */
    /* renamed from: com.join.mgps.task.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class CountDownTimerC0387a extends CountDownTimer {
        CountDownTimerC0387a(long j4, long j5) {
            super(j4, j5);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            a.this.b();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j4) {
            String unused = a.f54864d;
            StringBuilder sb = new StringBuilder();
            sb.append("onTick: 开始倒计时");
            long j5 = j4 / 1000;
            sb.append(j5);
            if (j5 > 0) {
                a.this.d();
            }
        }
    }

    public a(Context context) {
        this.f54866b = context;
    }

    void b() {
        com.join.mgps.event.d dVar = new com.join.mgps.event.d();
        dVar.f49881a = 0;
        org.greenrobot.eventbus.c.f().o(dVar);
    }

    public void c() {
        CountDownTimer countDownTimer = this.f54867c;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    void d() {
        if (com.join.mgps.Util.e.f(this.f54866b)) {
            com.join.mgps.event.d dVar = new com.join.mgps.event.d();
            dVar.f49881a = 1;
            dVar.f49882b = com.join.mgps.Util.e.f27769a;
            dVar.f49883c = com.join.mgps.Util.e.f27770b;
            org.greenrobot.eventbus.c.f().o(dVar);
            this.f54867c.cancel();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f54867c.start();
    }
}
