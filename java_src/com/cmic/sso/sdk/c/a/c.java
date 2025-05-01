package com.cmic.sso.sdk.c.a;

import android.text.TextUtils;
/* compiled from: RetryAndRedirectInterceptor.java */
/* loaded from: classes2.dex */
public class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private b f9194a;

    /* renamed from: b  reason: collision with root package name */
    private com.cmic.sso.sdk.c.d.c f9195b;

    /* renamed from: c  reason: collision with root package name */
    private final com.cmic.sso.sdk.c.a f9196c = new com.cmic.sso.sdk.c.a();

    public void b(final com.cmic.sso.sdk.c.c.c cVar, final com.cmic.sso.sdk.c.d.c cVar2, final com.cmic.sso.sdk.a aVar) {
        if (this.f9194a != null) {
            this.f9195b = new com.cmic.sso.sdk.c.d.c() { // from class: com.cmic.sso.sdk.c.a.c.1
                @Override // com.cmic.sso.sdk.c.d.c
                public void a(com.cmic.sso.sdk.c.d.b bVar) {
                    if (bVar.d()) {
                        c.this.b(c.this.f9196c.a(cVar, bVar, aVar), cVar2, aVar);
                    } else if (!TextUtils.isEmpty(c.this.f9196c.a())) {
                        c.this.b(c.this.f9196c.b(cVar, bVar, aVar), cVar2, aVar);
                    } else {
                        cVar2.a(bVar);
                    }
                }

                @Override // com.cmic.sso.sdk.c.d.c
                public void a(com.cmic.sso.sdk.c.d.a aVar2) {
                    if (cVar.j()) {
                        com.cmic.sso.sdk.e.c.a("RetryAndRedirectInterceptor", "retry: " + cVar.a());
                        c.this.b(cVar, cVar2, aVar);
                        return;
                    }
                    cVar2.a(aVar2);
                }
            };
            if (cVar.g()) {
                this.f9194a.a(cVar, this.f9195b, aVar);
            } else {
                cVar2.a(com.cmic.sso.sdk.c.d.a.a(200025));
            }
        }
    }

    @Override // com.cmic.sso.sdk.c.a.b
    public void a(com.cmic.sso.sdk.c.c.c cVar, com.cmic.sso.sdk.c.d.c cVar2, com.cmic.sso.sdk.a aVar) {
        b(cVar, cVar2, aVar);
    }

    public void a(b bVar) {
        this.f9194a = bVar;
    }
}
