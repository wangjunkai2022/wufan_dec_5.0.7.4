package com.umeng.analytics.pro;

import android.content.Context;
/* compiled from: OppoDeviceIdSupplier.java */
/* loaded from: classes6.dex */
public class bg implements ax {

    /* renamed from: a  reason: collision with root package name */
    private boolean f63433a = false;

    @Override // com.umeng.analytics.pro.ax
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        if (!this.f63433a) {
            f4.a.a(context);
            this.f63433a = true;
        }
        boolean b5 = f4.a.b();
        bl.a("getOAID", "isSupported", Boolean.valueOf(b5));
        if (b5) {
            return f4.a.d(context);
        }
        return null;
    }
}
