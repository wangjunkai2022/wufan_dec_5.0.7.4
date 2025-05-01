package com.join.mgps.rpc.impl;

import com.join.mgps.dto.AppBean;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.rpc.retrofit2.RetrofitApi;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* compiled from: RpcConsoleGameClientImpl.java */
/* loaded from: classes4.dex */
public class f implements com.join.mgps.rpc.g {

    /* renamed from: b  reason: collision with root package name */
    private static f f54117b;

    /* renamed from: a  reason: collision with root package name */
    private final e2.f f54118a;

    public f(e2.f fVar) {
        this.f54118a = fVar;
    }

    public static f b() {
        if (f54117b == null) {
            f54117b = new f((e2.f) RetrofitApi.getRetrofit2(com.join.mgps.rpc.h.f54098x).create(e2.f.class));
        }
        return f54117b;
    }

    public static f c() {
        f fVar = new f((e2.f) RetrofitApi.getRetrofit2(com.join.mgps.rpc.h.f54098x).create(e2.f.class));
        f54117b = fVar;
        return fVar;
    }

    @Override // com.join.mgps.rpc.g
    public ResultMainBean<List<AppBean>> a(Map<String, String> map) {
        try {
            e2.f fVar = this.f54118a;
            if (fVar != null) {
                return fVar.a(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }
}
