package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
/* compiled from: IDFATracker.java */
/* loaded from: classes6.dex */
public class d extends a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f64426a = "idfa";

    /* renamed from: b  reason: collision with root package name */
    private Context f64427b;

    public d(Context context) {
        super(f64426a);
        this.f64427b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        return DeviceConfig.getIdfa(this.f64427b);
    }
}
