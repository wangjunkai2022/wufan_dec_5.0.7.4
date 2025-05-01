package com.join.mgps.rpc.impl;

import app.mgsim.arena.ArenaLobbyServer;
import com.join.mgps.dto.ArenaGameInfo;
import com.join.mgps.dto.DiscoveryMainDataBean;
import com.join.mgps.dto.GameWorldResponse;
import com.join.mgps.dto.ResultArenaBean;
import com.join.mgps.rpc.retrofit2.RetrofitApi;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* compiled from: RpcNetMatch1ClientImpl.java */
/* loaded from: classes4.dex */
public class k extends l {

    /* renamed from: e  reason: collision with root package name */
    private static l f54130e;

    /* renamed from: d  reason: collision with root package name */
    private final e2.k f54131d;

    public k(e2.k kVar) {
        super(kVar);
        this.f54131d = (e2.k) RetrofitApi.getRetrofit2(com.join.mgps.rpc.h.f54068n).create(e2.k.class);
    }

    public static l n0() {
        if (f54130e == null) {
            f54130e = new k((e2.k) RetrofitApi.getRetrofit2(com.join.mgps.rpc.h.f54062l).create(e2.k.class));
        }
        return f54130e;
    }

    @Override // com.join.mgps.rpc.impl.l, com.join.mgps.rpc.l
    public ResultArenaBean<ArenaLobbyServer> P(int i4, String str) {
        try {
            e2.k kVar = this.f54131d;
            if (kVar != null) {
                return kVar.P(i4, str).execute().body();
            }
        } catch (IOException e5) {
            e5.printStackTrace();
        }
        return super.P(i4, str);
    }

    @Override // com.join.mgps.rpc.impl.l, com.join.mgps.rpc.l
    public GameWorldResponse<DiscoveryMainDataBean> j0(Map<String, String> map) {
        try {
            e2.k kVar = this.f54131d;
            if (kVar != null) {
                return kVar.j0(map).execute().body();
            }
        } catch (IOException e5) {
            e5.printStackTrace();
        }
        return super.j0(map);
    }

    @Override // com.join.mgps.rpc.impl.l, com.join.mgps.rpc.l
    public GameWorldResponse<List<ArenaGameInfo>> r(String str) {
        try {
            e2.k kVar = this.f54131d;
            if (kVar != null) {
                return kVar.r(str).execute().body();
            }
        } catch (IOException e5) {
            e5.printStackTrace();
        }
        return r(str);
    }
}
