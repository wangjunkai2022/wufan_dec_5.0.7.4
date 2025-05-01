package com.efs.sdk.pa.a;

import android.os.SystemClock;
import android.util.Printer;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.Iterator;
import java.util.Vector;
/* loaded from: classes2.dex */
final class e implements Printer {

    /* renamed from: f  reason: collision with root package name */
    private long f10678f;

    /* renamed from: b  reason: collision with root package name */
    private boolean f10674b = false;

    /* renamed from: c  reason: collision with root package name */
    private String f10675c = null;

    /* renamed from: d  reason: collision with root package name */
    private long f10676d = -1;

    /* renamed from: e  reason: collision with root package name */
    private long f10677e = -1;

    /* renamed from: a  reason: collision with root package name */
    Vector<d> f10673a = new Vector<>();

    @Override // android.util.Printer
    public final void println(String str) {
        if (str.startsWith(SimpleComparison.GREATER_THAN_OPERATION)) {
            this.f10676d = SystemClock.elapsedRealtime();
            this.f10677e = SystemClock.currentThreadTimeMillis();
            this.f10675c = str;
            this.f10674b = true;
            Iterator<d> it2 = this.f10673a.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        } else if (this.f10674b && str.startsWith(SimpleComparison.LESS_THAN_OPERATION)) {
            this.f10674b = false;
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f10676d;
            if (elapsedRealtime > this.f10678f) {
                long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis() - this.f10677e;
                Iterator<d> it3 = this.f10673a.iterator();
                while (it3.hasNext()) {
                    it3.next().a(this.f10675c, elapsedRealtime, currentThreadTimeMillis);
                }
            }
        }
    }
}
