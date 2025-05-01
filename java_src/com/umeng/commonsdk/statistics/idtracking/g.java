package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
/* compiled from: ImeiTracker.java */
/* loaded from: classes6.dex */
public class g extends a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f64442a = "imei";

    /* renamed from: b  reason: collision with root package name */
    private Context f64443b;

    public g(Context context) {
        super(f64442a);
        this.f64443b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        return DeviceConfig.getImeiNew(this.f64443b);
    }
}
