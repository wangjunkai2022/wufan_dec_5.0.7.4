package com.cmic.sso.sdk.c.c;

import com.cmic.sso.sdk.c.b.e;
import com.cmic.sso.sdk.e.p;
/* compiled from: HttpGetPrephoneRequest.java */
/* loaded from: classes2.dex */
public class b extends c {

    /* renamed from: b  reason: collision with root package name */
    private final e f9270b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f9271c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(String str, e eVar, String str2, String str3) {
        super(str, eVar, str2, str3);
        this.f9271c = false;
        this.f9270b = eVar;
    }

    public void a(com.cmic.sso.sdk.a aVar) {
        if (this.f9271c) {
            return;
        }
        com.cmic.sso.sdk.c.b.a c5 = this.f9270b.c();
        if (!aVar.b("isCloseIpv4", false)) {
            c5.q(p.a(true));
        }
        if (!aVar.b("isCloseIpv6", false)) {
            c5.r(p.b(true));
        }
        c5.n(c5.u(aVar.b("appkey")));
        this.f9270b.a(c5);
        this.f9270b.a(true);
        this.f9272a = this.f9270b.b().toString();
        this.f9271c = true;
    }
}
