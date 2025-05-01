package com.umeng.analytics.pro;

import android.content.Context;
/* compiled from: LenovoDeviceIdSupplier.java */
/* loaded from: classes6.dex */
public class bd implements ax {

    /* renamed from: a  reason: collision with root package name */
    private static final int f63428a = 1;

    /* renamed from: b  reason: collision with root package name */
    private org.repackage.com.zui.opendeviceidlibrary.b f63429b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f63430c = false;

    /* renamed from: d  reason: collision with root package name */
    private boolean f63431d = false;

    @Override // com.umeng.analytics.pro.ax
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        if (!this.f63430c) {
            org.repackage.com.zui.opendeviceidlibrary.b bVar = new org.repackage.com.zui.opendeviceidlibrary.b();
            this.f63429b = bVar;
            this.f63431d = bVar.a(context, null) == 1;
            this.f63430c = true;
        }
        bl.a("getOAID", "isSupported", Boolean.valueOf(this.f63431d));
        if (this.f63431d && this.f63429b.j()) {
            return this.f63429b.b();
        }
        return null;
    }
}
