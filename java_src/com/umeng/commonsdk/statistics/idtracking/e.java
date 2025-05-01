package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
/* compiled from: IDMD5Tracker.java */
/* loaded from: classes6.dex */
public class e extends a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f64428a = "idmd5";

    /* renamed from: b  reason: collision with root package name */
    private Context f64429b;

    public e(Context context) {
        super("idmd5");
        this.f64429b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        return DeviceConfig.getDeviceIdUmengMD5(this.f64429b);
    }
}
