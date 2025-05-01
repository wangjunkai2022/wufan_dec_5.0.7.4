package com.aggmoread.sdk.z.c.a.a.d.a;

import com.aggmoread.sdk.z.c.a.a.c.f;
import com.aggmoread.sdk.z.c.a.a.d.b.d;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.d.b.i;
import com.aggmoread.sdk.z.c.a.a.d.b.k;
import java.lang.ref.WeakReference;
import java.util.UUID;
/* loaded from: classes2.dex */
public class a {

    /* renamed from: c  reason: collision with root package name */
    public f f2797c;

    /* renamed from: d  reason: collision with root package name */
    public d f2798d;

    /* renamed from: e  reason: collision with root package name */
    public e f2799e;

    /* renamed from: f  reason: collision with root package name */
    public int f2800f = 0;

    /* renamed from: g  reason: collision with root package name */
    public long f2801g = 0;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2802h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2803i = true;

    /* renamed from: k  reason: collision with root package name */
    public WeakReference<com.aggmoread.sdk.z.c.a.a.d.b.m.a> f2805k = null;

    /* renamed from: b  reason: collision with root package name */
    public String f2796b = UUID.randomUUID().toString();

    /* renamed from: j  reason: collision with root package name */
    public Object[] f2804j = com.aggmoread.sdk.z.c.a.a.b.b();

    public a(d dVar, e eVar) {
        this.f2798d = dVar;
        this.f2799e = eVar;
    }

    public com.aggmoread.sdk.z.c.a.a.d.b.m.a a() {
        return null;
    }

    public void a(i iVar) {
        new k(this.f2798d, this.f2799e).a(8).a(iVar).a(k.b.f3448n, this.f2796b).b();
        this.f2797c.a(iVar);
    }

    public String toString() {
        Object[] objArr = new Object[6];
        objArr[0] = this.f2796b;
        d dVar = this.f2798d;
        objArr[1] = dVar == null ? "unknown" : dVar.f3265i;
        objArr[2] = Integer.valueOf(this.f2800f);
        objArr[3] = Long.valueOf(this.f2801g);
        objArr[4] = Boolean.valueOf(this.f2802h);
        objArr[5] = Boolean.valueOf(this.f2803i);
        return String.format("{id=%s, placementId=%s, clicks=%s, extime=%s, exposured=%s, showInvoke=%s}", objArr);
    }
}
