package com.join.mgps.rpc.impl;

import com.join.mgps.dto.ArchiveDataBean;
import com.join.mgps.dto.ArchiveDownDataBean;
import com.join.mgps.dto.ArchiveEvaluteDataBean;
import com.join.mgps.dto.ArchiveNumDataBean;
import com.join.mgps.dto.ArchiveResponseMain;
import com.join.mgps.dto.ArchiveResponseMessage;
import com.join.mgps.dto.ArchiveShopDataBean;
import com.join.mgps.rpc.retrofit2.RetrofitApi;
import java.io.IOException;
import java.util.Map;
/* compiled from: RpcArchiveClientImpl.java */
/* loaded from: classes4.dex */
public class c implements com.join.mgps.rpc.d {

    /* renamed from: b  reason: collision with root package name */
    private static c f54111b;

    /* renamed from: a  reason: collision with root package name */
    private final e2.c f54112a;

    public c(e2.c cVar) {
        this.f54112a = cVar;
    }

    public static c k() {
        if (f54111b == null) {
            f54111b = new c((e2.c) RetrofitApi.getRetrofit2(com.join.mgps.rpc.h.f54101y).create(e2.c.class));
        }
        return f54111b;
    }

    @Override // com.join.mgps.rpc.d
    public ArchiveEvaluteDataBean a(Map<String, String> map) {
        e2.c cVar = this.f54112a;
        if (cVar != null) {
            try {
                return cVar.a(map).execute().body();
            } catch (IOException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override // com.join.mgps.rpc.d
    public ArchiveResponseMain<ArchiveResponseMessage> b(Map<String, String> map) {
        e2.c cVar = this.f54112a;
        if (cVar != null) {
            try {
                return cVar.b(map).execute().body();
            } catch (IOException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override // com.join.mgps.rpc.d
    public ArchiveResponseMain<ArchiveResponseMessage> c(Map<String, String> map) {
        e2.c cVar = this.f54112a;
        if (cVar != null) {
            try {
                return cVar.c(map).execute().body();
            } catch (IOException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override // com.join.mgps.rpc.d
    public ArchiveDownDataBean d(Map<String, String> map) {
        e2.c cVar = this.f54112a;
        if (cVar != null) {
            try {
                return cVar.d(map).execute().body();
            } catch (IOException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override // com.join.mgps.rpc.d
    public ArchiveResponseMain<ArchiveResponseMessage> e(Map<String, String> map) {
        e2.c cVar = this.f54112a;
        if (cVar != null) {
            try {
                return cVar.e(map).execute().body();
            } catch (IOException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override // com.join.mgps.rpc.d
    public ArchiveNumDataBean f(Map<String, String> map) {
        e2.c cVar = this.f54112a;
        if (cVar != null) {
            try {
                return cVar.i(map).execute().body();
            } catch (IOException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override // com.join.mgps.rpc.d
    public ArchiveShopDataBean g(Map<String, String> map) {
        e2.c cVar = this.f54112a;
        if (cVar != null) {
            try {
                return cVar.g(map).execute().body();
            } catch (IOException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override // com.join.mgps.rpc.d
    public ArchiveDataBean h(Map<String, String> map) {
        e2.c cVar = this.f54112a;
        if (cVar != null) {
            try {
                return cVar.h(map).execute().body();
            } catch (IOException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override // com.join.mgps.rpc.d
    public ArchiveShopDataBean i(Map<String, String> map) {
        e2.c cVar = this.f54112a;
        if (cVar != null) {
            try {
                return cVar.f(map).execute().body();
            } catch (IOException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public e2.c j() {
        return this.f54112a;
    }
}
