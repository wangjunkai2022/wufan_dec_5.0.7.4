package com.tencent.stat;

import android.content.Context;
import com.tencent.stat.common.StatLogger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private com.tencent.stat.a.e f63002a;

    /* renamed from: b  reason: collision with root package name */
    private StatReportStrategy f63003b;

    /* renamed from: c  reason: collision with root package name */
    private c f63004c = new l(this);

    public k(com.tencent.stat.a.e eVar) {
        this.f63003b = null;
        this.f63002a = eVar;
        this.f63003b = StatConfig.getStatSendStrategy();
    }

    private void a() {
        if (n.b().a() <= 0) {
            a(true);
            return;
        }
        n.b().a(this.f63002a, (c) null);
        n.b().a(-1);
    }

    private void a(boolean z4) {
        d.b().a(this.f63002a, this.f63004c);
    }

    @Override // java.lang.Runnable
    public void run() {
        StatLogger statLogger;
        StatLogger statLogger2;
        StatLogger statLogger3;
        n a5;
        com.tencent.stat.a.e eVar;
        StatLogger statLogger4;
        StatLogger statLogger5;
        StatLogger statLogger6;
        try {
            if (StatConfig.isEnableStatService()) {
                if (this.f63002a.a() != com.tencent.stat.a.f.ERROR && this.f63002a.d().length() > StatConfig.getMaxReportEventLength()) {
                    statLogger6 = StatService.f62872i;
                    statLogger6.e("Event length exceed StatConfig.getMaxReportEventLength(): " + StatConfig.getMaxReportEventLength());
                    return;
                }
                if (StatConfig.getMaxSessionStatReportCount() > 0) {
                    if (StatConfig.getCurSessionStatReportCount() >= StatConfig.getMaxSessionStatReportCount()) {
                        statLogger5 = StatService.f62872i;
                        statLogger5.e("Times for reporting events has reached the limit of StatConfig.getMaxSessionStatReportCount() in current session.");
                        return;
                    }
                    StatConfig.c();
                }
                statLogger2 = StatService.f62872i;
                statLogger2.i("Lauch stat task in thread:" + Thread.currentThread().getName());
                Context c5 = this.f63002a.c();
                m mVar = null;
                if (!com.tencent.stat.common.k.h(c5)) {
                    n.a(c5).a(this.f63002a, (c) null);
                    return;
                }
                if (StatConfig.isEnableSmartReporting() && this.f63003b != StatReportStrategy.ONLY_WIFI_NO_CACHE && com.tencent.stat.common.k.g(c5)) {
                    this.f63003b = StatReportStrategy.INSTANT;
                }
                switch (h.f62998a[this.f63003b.ordinal()]) {
                    case 1:
                        a();
                        return;
                    case 2:
                        if (!com.tencent.stat.common.k.e(c5)) {
                            a5 = n.a(c5);
                            eVar = this.f63002a;
                            a5.a(eVar, mVar);
                            return;
                        }
                        a();
                        return;
                    case 3:
                    case 4:
                        a5 = n.a(c5);
                        eVar = this.f63002a;
                        a5.a(eVar, mVar);
                        return;
                    case 5:
                        if (n.a(this.f63002a.c()) == null) {
                            return;
                        }
                        a5 = n.a(c5);
                        eVar = this.f63002a;
                        mVar = new m(this);
                        a5.a(eVar, mVar);
                        return;
                    case 6:
                        try {
                            n.a(c5).a(this.f63002a, (c) null);
                            Long valueOf = Long.valueOf(com.tencent.stat.common.p.a(c5, "last_period_ts", 0L));
                            Long valueOf2 = Long.valueOf(System.currentTimeMillis());
                            if (Long.valueOf(Long.valueOf(valueOf2.longValue() - valueOf.longValue()).longValue() / 60000).longValue() > StatConfig.getSendPeriodMinutes()) {
                                n.a(c5).a(-1);
                                com.tencent.stat.common.p.b(c5, "last_period_ts", valueOf2.longValue());
                                return;
                            }
                            return;
                        } catch (Exception e5) {
                            statLogger3 = StatService.f62872i;
                            statLogger3.e(e5);
                            return;
                        }
                    case 7:
                        if (com.tencent.stat.common.k.e(c5)) {
                            a(false);
                            return;
                        }
                        return;
                    default:
                        statLogger4 = StatService.f62872i;
                        statLogger4.error("Invalid stat strategy:" + StatConfig.getStatSendStrategy());
                        return;
                }
            }
        } catch (Throwable th) {
            statLogger = StatService.f62872i;
            statLogger.e(th);
        }
    }
}
