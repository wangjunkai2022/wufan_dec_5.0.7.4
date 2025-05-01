package com.join.mgps.rpc.impl;

import app.mgsim.arena.ArenaLobbyServer;
import com.join.mgps.dto.AccountBean;
import com.join.mgps.dto.AccountResultMainBean;
import com.join.mgps.dto.AccountTokenSuccess;
import com.join.mgps.dto.AccountresultData;
import com.join.mgps.dto.ArchiveRecordBean;
import com.join.mgps.dto.ArenaGameInfo;
import com.join.mgps.dto.ArenaLobbyPlayCheck;
import com.join.mgps.dto.ArenaSelectServer;
import com.join.mgps.dto.ArenaWelcomeLobby;
import com.join.mgps.dto.BattleChallengeConfig;
import com.join.mgps.dto.BattleStatus;
import com.join.mgps.dto.CloudCreateInfo;
import com.join.mgps.dto.CloudList;
import com.join.mgps.dto.CloudStatus;
import com.join.mgps.dto.CreateArchiveRecordBean;
import com.join.mgps.dto.DiscoveryMainDataBean;
import com.join.mgps.dto.GameDataBean;
import com.join.mgps.dto.GameListBannerBean;
import com.join.mgps.dto.GameListBean;
import com.join.mgps.dto.GameWorldGlobalData;
import com.join.mgps.dto.GameWorldRealTimeWorshipBean;
import com.join.mgps.dto.GameWorldResponse;
import com.join.mgps.dto.GameWorldTrophy;
import com.join.mgps.dto.GameWorldUserInfoWrap;
import com.join.mgps.dto.GameWorldWorship;
import com.join.mgps.dto.GameworldFightRecoderResultBean;
import com.join.mgps.dto.GetPaiWeiPlayCodeBean;
import com.join.mgps.dto.GradeListData;
import com.join.mgps.dto.GradeRankListData;
import com.join.mgps.dto.InWorldDataBean;
import com.join.mgps.dto.InvitationPassBean;
import com.join.mgps.dto.Message;
import com.join.mgps.dto.NetBattleGetMatchAvailableServerBean;
import com.join.mgps.dto.NetBattleInviteBean;
import com.join.mgps.dto.NetBattleOnlineCount;
import com.join.mgps.dto.NetBattleStartBattleBean;
import com.join.mgps.dto.NetBattleUserInfoResultBean;
import com.join.mgps.dto.NetGetBattleUdpPortBean;
import com.join.mgps.dto.NewArenaGameListBean;
import com.join.mgps.dto.NewGameDataBean;
import com.join.mgps.dto.PspBattleServer;
import com.join.mgps.dto.ResultArenaBean;
import com.join.mgps.dto.ResultResMainBean;
import com.join.mgps.dto.WelcomeInDataBean;
import com.join.mgps.rpc.retrofit2.RetrofitApi;
import com.papa91.arc.bean.PaiWeiDataBean;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* compiled from: RpcNetMatchClientImpl.java */
/* loaded from: classes4.dex */
public class l implements com.join.mgps.rpc.l {

    /* renamed from: b  reason: collision with root package name */
    private static l f54132b;

    /* renamed from: c  reason: collision with root package name */
    private static l f54133c;

    /* renamed from: a  reason: collision with root package name */
    private final e2.k f54134a;

    public l(e2.k kVar) {
        this.f54134a = kVar;
    }

    public static l n0() {
        if (f54132b == null) {
            f54132b = new l((e2.k) RetrofitApi.getRetrofit2(com.join.mgps.rpc.h.f54062l).create(e2.k.class));
        }
        return f54132b;
    }

    public static l o0() {
        l lVar = new l((e2.k) RetrofitApi.getRetrofit2(com.join.mgps.rpc.h.f54065m).create(e2.k.class));
        f54133c = lVar;
        return lVar;
    }

    public static l p0() {
        l lVar = new l((e2.k) RetrofitApi.getRetrofit2(com.join.mgps.rpc.h.f54062l).create(e2.k.class));
        f54132b = lVar;
        return lVar;
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<NewGameDataBean> A(String str, int i4, String str2) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.A(str, i4, str2).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<List<GameWorldTrophy>> B(long j4, int i4) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.B(j4, i4).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<NetBattleUserInfoResultBean> C(String str, int i4, int i5, String str2) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.C(str, i4, i5, str2).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public AccountResultMainBean<AccountTokenSuccess> D(Map<String, String> map) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.D(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public ResultArenaBean<BattleChallengeConfig> E(int i4, String str, long j4) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.E(i4, str, j4).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<GradeListData> F(long j4) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.F(j4).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<GameWorldGlobalData> G(long j4) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.G(j4).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<GameDataBean> H(Map<String, String> map) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.H(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<GameDataBean> I(Map<String, String> map) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.I(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<InvitationPassBean> J(Map<String, String> map) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.J(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<InvitationPassBean> K(String str, String str2) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.K(str, str2).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<NewGameDataBean> L(Map<String, String> map) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.L(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<ArchiveRecordBean> M(String str, int i4, String str2) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.M(str, i4, str2).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<NetBattleOnlineCount> N(String str) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.N(str).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<CreateArchiveRecordBean> O(Map<String, String> map) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.O(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public ResultArenaBean<ArenaLobbyServer> P(int i4, String str) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.P(i4, str).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<InWorldDataBean> Q(Map<String, String> map) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.Q(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<BattleStatus> R(int i4, String str) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.R(i4, str).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<GameworldFightRecoderResultBean> S(String str, int i4, String str2) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.S(str, i4, str2).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse T(int i4, String str, String str2, int i5, long j4) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.T(i4, str, str2, i5, j4).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<NetBattleUserInfoResultBean> U(String str, int i4, int i5, String str2) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.U(str, i4, i5, str2).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<CloudStatus> V(Map<String, String> map) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.V(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public ResultResMainBean<GetPaiWeiPlayCodeBean> W(String str, String str2) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.W(str, str2).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<ArenaLobbyPlayCheck> X(String str, String str2) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.X(str, str2).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<List<ArenaSelectServer>> Y(String str, String str2, String str3, int i4, String str4) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.Y(str, str2, str3, i4, str4).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<NetBattleUserInfoResultBean> Z(String str, int i4, int i5, String str2) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.Z(str, i4, i5, str2).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public AccountResultMainBean<AccountresultData<AccountBean>> a(Map<String, String> map) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.a(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<CreateArchiveRecordBean> a0(Map<String, String> map) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.a0(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public AccountResultMainBean<AccountTokenSuccess> b(Map<String, String> map) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.b(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public AccountResultMainBean<AccountresultData<AccountBean>> b0(Map<String, String> map) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.b0(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public AccountResultMainBean<AccountTokenSuccess> c(Map<String, String> map) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.c(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<GameDataBean> c0(Map<String, String> map) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.c0(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public AccountResultMainBean<AccountBean> d(Map<String, String> map) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.d(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<ArenaWelcomeLobby> d0(int i4, String str) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.d0(i4, str).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public AccountResultMainBean<AccountresultData<AccountBean>> e(Map<String, String> map) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.e(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<NetGetBattleUdpPortBean> e0(String str) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.e0(str).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<NetBattleInviteBean> f(int i4, String str, String str2) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.f(i4, str, str2).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<CloudCreateInfo> f0(Map<String, String> map) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.f0(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public AccountResultMainBean<AccountTokenSuccess> g(Map<String, String> map) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.g(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<GameWorldWorship> g0(Map<String, String> map) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.g0(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public AccountResultMainBean<AccountTokenSuccess> h(Map<String, String> map) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.h(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<GradeRankListData> h0(long j4, int i4, int i5, String str, int i6) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.h0(j4, i4, i5, str, i6).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public AccountResultMainBean<AccountTokenSuccess> i(Map<String, String> map) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.i(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<NetBattleStartBattleBean> i0(int i4, String str, String str2) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.i0(i4, str, str2).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<AccountResultMainBean> j(Map<String, String> map) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.j(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<DiscoveryMainDataBean> j0(Map<String, String> map) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.j0(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public AccountResultMainBean<AccountresultData<AccountBean>> k(Map<String, String> map) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.k(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<ArenaWelcomeLobby> k0(int i4, long j4, String str, String str2, int i5) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.k0(i4, j4, str, str2, i5).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public ResultResMainBean<PaiWeiDataBean> l(String str, String str2, String str3, String str4, String str5) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.l(str, str2, str3, str4, str5).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<WelcomeInDataBean> l0(String str, int i4, String str2, String str3) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.l0(str, i4, str2, str3).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public ResultResMainBean<GameListBean> m(int i4, String str, int i5) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.m(i4, str, i5).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public e2.k m0() {
        return this.f54134a;
    }

    @Override // com.join.mgps.rpc.l
    public ResultResMainBean<PaiWeiDataBean> n(String str, String str2, String str3, String str4) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.n(str, str2, str3, str4).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<List<GameWorldRealTimeWorshipBean>> o(long j4) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.o(j4).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<NetBattleGetMatchAvailableServerBean> p(int i4, String str, String str2) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.p(i4, str, str2).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<Message> q(Map<String, String> map) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.q(map).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<List<ArenaGameInfo>> r(String str) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.r(str).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public ResultResMainBean<GetPaiWeiPlayCodeBean> s(String str, String str2, String str3, String str4) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.s(str, str2, str3, str4).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<GameWorldWorship> t(long j4, int i4, int i5, String str) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.t(j4, i4, i5, str).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public ResultResMainBean<GameListBannerBean> u(String str) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.u(str).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<List<PspBattleServer>> v() {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.v().execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public ResultResMainBean<NewArenaGameListBean> w(int i4, int i5, int i6) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.w(i4, i5, i6).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<NetBattleInviteBean> x(int i4, String str, String str2) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.x(i4, str, str2).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<GameWorldUserInfoWrap> y(long j4, int i4, int i5) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.y(j4, i4, i5).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.l
    public GameWorldResponse<CloudList> z(int i4, String str) {
        try {
            e2.k kVar = this.f54134a;
            if (kVar != null) {
                return kVar.z(i4, str).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }
}
