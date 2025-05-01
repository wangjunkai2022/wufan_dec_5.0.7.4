package com.aggmoread.sdk.z.c.a.a.d.b;

import java.util.HashMap;
/* loaded from: classes2.dex */
public class h {

    /* renamed from: e  reason: collision with root package name */
    public static h f3401e = new b().a();

    /* renamed from: a  reason: collision with root package name */
    private int f3402a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f3403b;

    /* renamed from: c  reason: collision with root package name */
    private String f3404c;

    /* renamed from: d  reason: collision with root package name */
    private com.aggmoread.sdk.z.c.a.a.c.j f3405d;

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private int f3406a = -1;

        /* renamed from: b  reason: collision with root package name */
        private boolean f3407b;

        /* renamed from: c  reason: collision with root package name */
        private String f3408c;

        /* renamed from: d  reason: collision with root package name */
        private com.aggmoread.sdk.z.c.a.a.c.j f3409d;

        public b() {
            new HashMap();
        }

        public b a(com.aggmoread.sdk.z.c.a.a.c.j jVar) {
            this.f3409d = jVar;
            return this;
        }

        public h a() {
            h hVar = new h();
            hVar.f3402a = this.f3406a;
            hVar.f3403b = this.f3407b;
            hVar.f3405d = this.f3409d;
            hVar.f3404c = this.f3408c;
            return hVar;
        }
    }

    private h() {
        this.f3402a = -1;
        this.f3403b = false;
        this.f3404c = "";
    }

    public String a() {
        return this.f3404c;
    }

    public com.aggmoread.sdk.z.c.a.a.c.j b() {
        return this.f3405d;
    }

    public String toString() {
        return "SDKInitConfig{agreePrivacy='" + this.f3402a + "'useTextureView='" + this.f3403b + "'privacyController='" + this.f3405d + "'oaid='" + this.f3404c + "'}";
    }
}
