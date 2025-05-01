package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
/* compiled from: AndroidIdTracker.java */
/* loaded from: classes6.dex */
public class b extends a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f64420a = "android_id";

    /* renamed from: b  reason: collision with root package name */
    private Context f64421b;

    public b(Context context) {
        super(f64420a);
        this.f64421b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        return DeviceConfig.getAndroidId(this.f64421b);
    }
}
