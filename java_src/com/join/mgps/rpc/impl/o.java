package com.join.mgps.rpc.impl;

import com.join.mgps.dto.UserPurchaseResponse;
import com.join.mgps.rpc.p;
import com.join.mgps.rpc.retrofit2.RetrofitApi;
/* compiled from: RpcPayClientImpl.java */
/* loaded from: classes4.dex */
public class o implements p {

    /* renamed from: b  reason: collision with root package name */
    private static o f54139b = null;

    /* renamed from: c  reason: collision with root package name */
    public static String f54140c = "";

    /* renamed from: a  reason: collision with root package name */
    private final e2.n f54141a;

    public o(e2.n nVar) {
        this.f54141a = nVar;
    }

    public static o b() {
        if (f54139b == null) {
            String str = com.join.mgps.rpc.h.f54071o;
            f54140c = str;
            f54139b = new o((e2.n) RetrofitApi.getRetrofit2(str).create(e2.n.class));
        } else if (!com.join.mgps.rpc.h.f54071o.equals(f54140c)) {
            String str2 = com.join.mgps.rpc.h.f54071o;
            f54140c = str2;
            f54139b = new o((e2.n) RetrofitApi.getRetrofit2(str2).create(e2.n.class));
        }
        return f54139b;
    }

    @Override // com.join.mgps.rpc.p
    public UserPurchaseResponse a(String str, String str2) {
        try {
            e2.n nVar = this.f54141a;
            if (nVar != null) {
                return nVar.a(str, str2).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }
}
