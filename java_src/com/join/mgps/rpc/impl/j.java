package com.join.mgps.rpc.impl;

import com.join.mgps.rpc.retrofit2.RetrofitApi;
/* compiled from: RpcLoginImpl.java */
/* loaded from: classes4.dex */
public class j {

    /* renamed from: b  reason: collision with root package name */
    private static j f54128b;

    /* renamed from: a  reason: collision with root package name */
    private final e2.j f54129a;

    public j(e2.j jVar) {
        this.f54129a = jVar;
    }

    public static j b() {
        if (f54128b == null) {
            f54128b = new j((e2.j) RetrofitApi.getRetrofit2(com.join.mgps.rpc.h.E).create(e2.j.class));
        }
        return f54128b;
    }

    public e2.j a() {
        return this.f54129a;
    }
}
