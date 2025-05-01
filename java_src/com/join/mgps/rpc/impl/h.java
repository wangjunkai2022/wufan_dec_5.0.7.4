package com.join.mgps.rpc.impl;

import com.join.mgps.dto.FriendAccountInfo;
import com.join.mgps.dto.FriendBackGameReqBean;
import com.join.mgps.dto.FriendBackGameRspBean;
import com.join.mgps.dto.FriendBean;
import com.join.mgps.dto.FriendCardBean;
import com.join.mgps.dto.FriendRecommendRequest;
import com.join.mgps.dto.FriendReqBean;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.rpc.retrofit2.RetrofitApi;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* compiled from: RpcFriendClientImpl.java */
/* loaded from: classes4.dex */
public class h implements com.join.mgps.rpc.j {

    /* renamed from: b  reason: collision with root package name */
    private static h f54121b;

    /* renamed from: a  reason: collision with root package name */
    private final e2.h f54122a;

    public h(e2.h hVar) {
        this.f54122a = hVar;
    }

    public static h p() {
        if (f54121b == null) {
            f54121b = new h((e2.h) RetrofitApi.getRetrofit2(com.join.mgps.rpc.h.H).create(e2.h.class));
        }
        return f54121b;
    }

    public static h q() {
        h hVar = new h((e2.h) RetrofitApi.getRetrofit2(com.join.mgps.rpc.h.H).create(e2.h.class));
        f54121b = hVar;
        return hVar;
    }

    @Override // com.join.mgps.rpc.j
    public ResponseModel a(Map<String, Object> map) {
        try {
            e2.h hVar = this.f54122a;
            if (hVar != null) {
                return hVar.a(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.j
    public ResponseModel b(FriendReqBean friendReqBean) {
        try {
            e2.h hVar = this.f54122a;
            if (hVar != null) {
                return hVar.b(friendReqBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.j
    public ResponseModel<List<FriendBean>> c(int i4, String str, String str2) {
        try {
            e2.h hVar = this.f54122a;
            if (hVar != null) {
                return hVar.c(i4, str, str2).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.j
    public ResponseModel<List<FriendBean>> d(FriendRecommendRequest friendRecommendRequest) {
        try {
            e2.h hVar = this.f54122a;
            if (hVar != null) {
                return hVar.d(friendRecommendRequest).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.j
    public ResponseModel<List<FriendBean>> e(String str, String str2, int i4, int i5) {
        try {
            e2.h hVar = this.f54122a;
            if (hVar != null) {
                return hVar.e(str, str2, i4, i5).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.j
    public ResponseModel<FriendAccountInfo> f(String str, String str2) {
        try {
            e2.h hVar = this.f54122a;
            if (hVar != null) {
                return hVar.f(str, str2).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.j
    public ResponseModel<FriendCardBean> g(String str, String str2, String str3) {
        try {
            e2.h hVar = this.f54122a;
            if (hVar != null) {
                return hVar.g(str, str2, str3).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.j
    public ResponseModel h(Map<String, Object> map) {
        try {
            e2.h hVar = this.f54122a;
            if (hVar != null) {
                return hVar.h(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.j
    public ResponseModel<FriendAccountInfo> i(String str, String str2, String str3) {
        try {
            e2.h hVar = this.f54122a;
            if (hVar != null) {
                return hVar.i(str, str2, str3).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.j
    public ResponseModel j(Map<String, Object> map) {
        try {
            e2.h hVar = this.f54122a;
            if (hVar != null) {
                return hVar.j(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.j
    public ResponseModel<FriendBackGameRspBean> k(FriendBackGameReqBean friendBackGameReqBean) {
        try {
            e2.h hVar = this.f54122a;
            if (hVar != null) {
                return hVar.k(friendBackGameReqBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.j
    public ResponseModel<List<FriendBean>> l(String str, String str2, int i4, int i5) {
        try {
            e2.h hVar = this.f54122a;
            if (hVar != null) {
                return hVar.l(str, str2, i4, i5).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.j
    public ResponseModel m(Map<String, Object> map) {
        try {
            e2.h hVar = this.f54122a;
            if (hVar != null) {
                return hVar.m(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.j
    public ResponseModel n(Map<String, Object> map) {
        try {
            e2.h hVar = this.f54122a;
            if (hVar != null) {
                return hVar.n(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public e2.h o() {
        return this.f54122a;
    }
}
