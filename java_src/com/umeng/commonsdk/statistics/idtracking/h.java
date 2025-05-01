package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
/* compiled from: MacTracker.java */
/* loaded from: classes6.dex */
public class h extends a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f64444a = "mac";

    /* renamed from: b  reason: collision with root package name */
    private Context f64445b;

    public h(Context context) {
        super(f64444a);
        this.f64445b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        try {
            return DeviceConfig.getMac(this.f64445b);
        } catch (Exception e5) {
            if (AnalyticsConstants.UM_DEBUG) {
                e5.printStackTrace();
            }
            UMCrashManager.reportCrash(this.f64445b, e5);
            return null;
        }
    }
}
