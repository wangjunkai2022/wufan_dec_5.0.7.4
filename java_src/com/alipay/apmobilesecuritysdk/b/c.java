package com.alipay.apmobilesecuritysdk.b;

import com.alipay.security.mobile.module.commonutils.d;
/* loaded from: classes2.dex */
public final class c implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b f4641b;

    public c(b bVar) {
        this.f4641b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f4641b.b();
        } catch (Throwable th) {
            d.c(th);
        }
    }
}
