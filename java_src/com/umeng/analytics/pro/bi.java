package com.umeng.analytics.pro;

import android.content.Context;
/* compiled from: VivoDeviceIdSupplier.java */
/* loaded from: classes6.dex */
public class bi implements ax {
    @Override // com.umeng.analytics.pro.ax
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        boolean a5 = org.repackage.com.vivo.identifier.e.a(context);
        bl.a("getOAID", "isSupported", Boolean.valueOf(a5));
        if (a5) {
            return org.repackage.com.vivo.identifier.e.c(context);
        }
        return null;
    }
}
