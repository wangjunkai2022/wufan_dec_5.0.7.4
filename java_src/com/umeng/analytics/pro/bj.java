package com.umeng.analytics.pro;

import android.content.Context;
/* compiled from: XiaomiDeviceIdSupplier.java */
/* loaded from: classes6.dex */
class bj implements ax {
    @Override // com.umeng.analytics.pro.ax
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        boolean c5 = org.repackage.com.miui.deviceid.b.c();
        bl.a("getOAID", "isSupported", Boolean.valueOf(c5));
        if (c5) {
            return org.repackage.com.miui.deviceid.b.d(context);
        }
        return null;
    }
}
