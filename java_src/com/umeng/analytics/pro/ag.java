package com.umeng.analytics.pro;

import android.content.SharedPreferences;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;
/* compiled from: IntervalPeriodCondition.java */
/* loaded from: classes6.dex */
public class ag implements ac {

    /* renamed from: a  reason: collision with root package name */
    private String f63302a;

    /* renamed from: b  reason: collision with root package name */
    private long f63303b;

    public ag(String str, long j4) {
        this.f63302a = "";
        this.f63303b = 0L;
        this.f63302a = str;
        this.f63303b = j4;
    }

    @Override // com.umeng.analytics.pro.ac
    public boolean a() {
        try {
            String str = at.f63359b + this.f63302a;
            SharedPreferences a5 = at.a(UMGlobalContext.getAppContext());
            if (a5 != null) {
                long currentTimeMillis = System.currentTimeMillis() - a5.getLong(str, 0L);
                if (currentTimeMillis > this.f63303b * 1000) {
                    return true;
                }
                UMRTLog.i(UMRTLog.RTLOG_TAG, "internal period skipped. elapse: " + currentTimeMillis + "; config: " + (this.f63303b * 1000));
                return false;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.umeng.analytics.pro.ac
    public boolean b() {
        return !a();
    }

    @Override // com.umeng.analytics.pro.ac
    public long c() {
        return 0L;
    }
}
