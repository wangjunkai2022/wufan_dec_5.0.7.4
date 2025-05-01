package com.join.mgps.rpc.impl;

import com.join.mgps.dto.AccountGetVoucherResult;
import com.join.mgps.dto.AccountPaBiBean;
import com.join.mgps.dto.PapayVoucherResultMain;
import com.join.mgps.dto.PapayWalletResultMain;
import com.join.mgps.dto.PayActivityConfig;
import com.join.mgps.dto.ResultMyVoucherBean;
import com.join.mgps.dto.ResultMyVoucherGameBean;
import com.join.mgps.rpc.retrofit2.RetrofitApi;
import java.io.IOException;
import java.util.Map;
/* compiled from: RpcPawalletClientImpl.java */
/* loaded from: classes4.dex */
public class n implements com.join.mgps.rpc.o {

    /* renamed from: b  reason: collision with root package name */
    private static n f54137b;

    /* renamed from: a  reason: collision with root package name */
    private final e2.m f54138a;

    public n(e2.m mVar) {
        this.f54138a = mVar;
    }

    public static n h() {
        if (f54137b == null) {
            f54137b = new n((e2.m) RetrofitApi.getRetrofit2(com.join.mgps.rpc.h.f54056j).create(e2.m.class));
        }
        return f54137b;
    }

    @Override // com.join.mgps.rpc.o
    public PapayVoucherResultMain<AccountGetVoucherResult> a(Map<String, String> map) {
        try {
            e2.m mVar = this.f54138a;
            if (mVar != null) {
                return mVar.a(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.o
    public PapayVoucherResultMain<ResultMyVoucherBean> b(Map<String, String> map) {
        try {
            e2.m mVar = this.f54138a;
            if (mVar != null) {
                return mVar.b(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.o
    public PapayWalletResultMain c(Map<String, String> map) {
        try {
            e2.m mVar = this.f54138a;
            if (mVar != null) {
                return mVar.c(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.o
    public PapayWalletResultMain d(Map<String, String> map) {
        try {
            e2.m mVar = this.f54138a;
            if (mVar != null) {
                return mVar.d(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.o
    public PapayVoucherResultMain<AccountPaBiBean> e(Map<String, String> map) {
        try {
            e2.m mVar = this.f54138a;
            if (mVar != null) {
                return mVar.e(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.o
    public PapayVoucherResultMain<ResultMyVoucherGameBean> f(Map<String, String> map) {
        try {
            e2.m mVar = this.f54138a;
            if (mVar != null) {
                return mVar.f(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.o
    public PapayVoucherResultMain<PayActivityConfig> g(Map<String, String> map) {
        try {
            e2.m mVar = this.f54138a;
            if (mVar != null) {
                return mVar.g(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.o
    public PapayVoucherResultMain<ResultMyVoucherBean> l(Map<String, String> map) {
        try {
            e2.m mVar = this.f54138a;
            if (mVar != null) {
                return mVar.l(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }
}
