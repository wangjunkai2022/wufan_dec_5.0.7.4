package com.umeng.commonsdk.statistics.idtracking;

import android.annotation.TargetApi;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
/* compiled from: SerialTracker.java */
/* loaded from: classes6.dex */
public class j extends a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f64451a = "serial";

    public j() {
        super(f64451a);
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    @TargetApi(9)
    public String f() {
        return DeviceConfig.getSerial();
    }
}
