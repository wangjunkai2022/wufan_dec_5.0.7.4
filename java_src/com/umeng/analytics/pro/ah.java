package com.umeng.analytics.pro;

import android.content.SharedPreferences;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;
/* compiled from: LaunchTimesCondition.java */
/* loaded from: classes6.dex */
public class ah implements ac {

    /* renamed from: a  reason: collision with root package name */
    private int f63304a;

    public ah(int i4) {
        this.f63304a = 0;
        this.f63304a = i4;
    }

    @Override // com.umeng.analytics.pro.ac
    public boolean a() {
        long j4 = 0;
        try {
            SharedPreferences a5 = at.a(UMGlobalContext.getAppContext());
            if (a5 != null) {
                j4 = a5.getLong(at.f63358a, 0L);
                if (j4 >= this.f63304a) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        UMRTLog.i(UMRTLog.RTLOG_TAG, "launch times skipped. times: " + j4 + " ; config: " + this.f63304a);
        return false;
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
