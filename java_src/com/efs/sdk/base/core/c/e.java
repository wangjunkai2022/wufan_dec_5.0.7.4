package com.efs.sdk.base.core.c;

import com.efs.sdk.base.http.HttpResponse;
/* loaded from: classes2.dex */
public final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private com.efs.sdk.base.core.d.b f10313a;

    /* renamed from: b  reason: collision with root package name */
    private c f10314b;

    /* renamed from: c  reason: collision with root package name */
    private String f10315c;

    public e(com.efs.sdk.base.core.d.b bVar, c cVar, String str) {
        this.f10313a = bVar;
        this.f10314b = cVar;
        this.f10315c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpResponse httpResponse;
        c cVar;
        com.efs.sdk.base.core.d.b bVar = this.f10313a;
        if (bVar != null && (cVar = this.f10314b) != null) {
            httpResponse = cVar.a(bVar, true);
        } else {
            httpResponse = new HttpResponse();
        }
        d.a().a(this.f10315c, httpResponse.succ ? 0 : httpResponse.getHttpCode());
        this.f10315c = null;
        this.f10314b = null;
    }
}
