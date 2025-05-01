package com.join.mgps.rpc.impl;

import com.join.mgps.dto.OemData;
import com.join.mgps.dto.OemResponse;
import com.join.mgps.rpc.retrofit2.RetrofitApi;
import java.io.IOException;
/* compiled from: RpcOemClientImpl.java */
/* loaded from: classes4.dex */
public class m implements com.join.mgps.rpc.m {

    /* renamed from: b  reason: collision with root package name */
    private static m f54135b;

    /* renamed from: a  reason: collision with root package name */
    private final e2.l f54136a;

    public m(e2.l lVar) {
        this.f54136a = lVar;
    }

    public static m c() {
        if (f54135b == null) {
            f54135b = new m((e2.l) RetrofitApi.getRetrofit2(com.join.mgps.rpc.h.f54074p).create(e2.l.class));
        }
        return f54135b;
    }

    @Override // com.join.mgps.rpc.m
    public OemResponse<OemData.GiftGetCdkData> a(int i4, String str, String str2) {
        try {
            e2.l lVar = this.f54136a;
            if (lVar != null) {
                return lVar.a(i4, str, str2).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.m
    public OemResponse<OemData.GiftDetailData> b(int i4, String str) {
        try {
            e2.l lVar = this.f54136a;
            if (lVar != null) {
                return lVar.b(i4, str).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }
}
