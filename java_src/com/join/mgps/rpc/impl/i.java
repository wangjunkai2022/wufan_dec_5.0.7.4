package com.join.mgps.rpc.impl;

import com.join.kotlin.discount.model.bean.GameDetailDataBean;
import com.join.kotlin.discount.model.request.GameDetailRequest;
import com.join.kotlin.ui.coupon.NoticeListData;
import com.join.kotlin.ui.coupon.ServerListData;
import com.join.mgps.activity.mygame.data.DataGameListBean;
import com.join.mgps.dto.AddGameInformationCommentArgs;
import com.join.mgps.dto.ArchievePathMultiArgs;
import com.join.mgps.dto.ArchievePathMultiBean;
import com.join.mgps.dto.BbsCommentListBean;
import com.join.mgps.dto.BbsDetailBean;
import com.join.mgps.dto.BbsListBean;
import com.join.mgps.dto.BbsTagListBean;
import com.join.mgps.dto.BossBean;
import com.join.mgps.dto.CheckGameVersionRequestArgs;
import com.join.mgps.dto.CheckGameVersionResponseData;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CollectionModuleSevenArgs;
import com.join.mgps.dto.CollectionModuleSevenBean;
import com.join.mgps.dto.CommonAdBean;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.DiscoveryBannerBean;
import com.join.mgps.dto.DiscoveryHeaderArgs;
import com.join.mgps.dto.DiscoveryHeaderBean;
import com.join.mgps.dto.DiscoveryHeaderMenuClickArgs;
import com.join.mgps.dto.DomainInfoBean;
import com.join.mgps.dto.EndGameBean;
import com.join.mgps.dto.EndGameDetailBean;
import com.join.mgps.dto.EndGameListBean;
import com.join.mgps.dto.EndGameNameBean;
import com.join.mgps.dto.EndGameRecordArgs;
import com.join.mgps.dto.EndGameReportTypeBean;
import com.join.mgps.dto.FavoriteGameListArgs;
import com.join.mgps.dto.FavoriteGameListBean;
import com.join.mgps.dto.GameBbsPostListBean;
import com.join.mgps.dto.GameBespeakBean;
import com.join.mgps.dto.GameInformationCommentPraiseArgs;
import com.join.mgps.dto.GameInformationCommentRequestV2;
import com.join.mgps.dto.GameMainV4DataBean;
import com.join.mgps.dto.GamedetialModleFourBean;
import com.join.mgps.dto.InformationCommentBackV2;
import com.join.mgps.dto.ListUserCustomGameTagBean;
import com.join.mgps.dto.MessageDetailFeedBackArgs;
import com.join.mgps.dto.MessageDetailFeedBackBean;
import com.join.mgps.dto.MiniGameSdkDtoRequestArgs;
import com.join.mgps.dto.MiniGameSdkDtoResponseResponseData;
import com.join.mgps.dto.ModFeedbackBean;
import com.join.mgps.dto.ModGameDetailBean;
import com.join.mgps.dto.QueryDownloadInfoRequestArgs;
import com.join.mgps.dto.QueryDownloadInfoResponseData;
import com.join.mgps.dto.RequestAddUserCustomGameTag;
import com.join.mgps.dto.RequestBbsCommentListArgs;
import com.join.mgps.dto.RequestBbsDetailArgs;
import com.join.mgps.dto.RequestBbsDispraiseArgs;
import com.join.mgps.dto.RequestBbsListArgs;
import com.join.mgps.dto.RequestBbsPraiseArgs;
import com.join.mgps.dto.RequestBbsRecommendArgs;
import com.join.mgps.dto.RequestBbsReplyArgs;
import com.join.mgps.dto.RequestBbsTagListArgs;
import com.join.mgps.dto.RequestBossListArgs;
import com.join.mgps.dto.RequestCommonAdArgs;
import com.join.mgps.dto.RequestCreateEndGameArgs;
import com.join.mgps.dto.RequestDeleteUserCustomGameTag;
import com.join.mgps.dto.RequestDeleteUserCustomTag;
import com.join.mgps.dto.RequestDomainInfoArgs;
import com.join.mgps.dto.RequestEndGameAdArgs;
import com.join.mgps.dto.RequestEndGameDetailArgs;
import com.join.mgps.dto.RequestEndGameListArgs;
import com.join.mgps.dto.RequestEndGameNameListArgs;
import com.join.mgps.dto.RequestEndGameReportReasonArgs;
import com.join.mgps.dto.RequestEndGameTypeArgs;
import com.join.mgps.dto.RequestFeedbackUserCustomTag;
import com.join.mgps.dto.RequestGameBespeakArgs;
import com.join.mgps.dto.RequestGameIdArgs;
import com.join.mgps.dto.RequestInfoArgs;
import com.join.mgps.dto.RequestListUserCustomGameTagArgs;
import com.join.mgps.dto.RequestMiniGameArgs;
import com.join.mgps.dto.RequestModFeedbackArgs;
import com.join.mgps.dto.RequestModGameArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.RequestRankingListArgs;
import com.join.mgps.dto.RequestSearchGameArgs;
import com.join.mgps.dto.RequestSearchUserCustomGameTag;
import com.join.mgps.dto.RequestSimulatorAchievementListArgs;
import com.join.mgps.dto.RequestSimulatorMomentLikeArgs;
import com.join.mgps.dto.RequestSimulatorMomentListArgs;
import com.join.mgps.dto.RequestSimulatorRecomGamesArgs;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.SearchGameListBean;
import com.join.mgps.dto.SimulatorAchievementBean;
import com.join.mgps.dto.SimulatorAllAchievementBean;
import com.join.mgps.dto.SimulatorExitPlayRequestArgs;
import com.join.mgps.dto.SimulatorExitPlayResponseData;
import com.join.mgps.dto.SimulatorMomentBean;
import com.join.mgps.dto.SimulatorRecomBean;
import com.join.mgps.dto.UninstallAppReasonBean;
import com.join.mgps.dto.UninstallAppReasonSubmitArgs;
import com.join.mgps.dto.UninstallGuessLikeArgs;
import com.join.mgps.dto.UninstallGuessLikeBean;
import com.join.mgps.dto.UninstallOnlineGameArgs;
import com.join.mgps.dto.UninstallOnlineGameBean;
import com.join.mgps.dto.UserGameListBean;
import com.join.mgps.dto.VideoAdCfgBean;
import com.join.mgps.dto.VideoAdCfgRequestArgs;
import com.join.mgps.dto.VideoAdWatchLogRequest;
import com.join.mgps.rpc.retrofit2.RetrofitApi;
import java.io.IOException;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* compiled from: RpcGameClientImpl.java */
/* loaded from: classes4.dex */
public class i implements com.join.mgps.rpc.k {

    /* renamed from: b  reason: collision with root package name */
    private static i f54123b;

    /* renamed from: c  reason: collision with root package name */
    private static i f54124c;

    /* renamed from: a  reason: collision with root package name */
    private final e2.i f54125a;

    /* compiled from: RpcGameClientImpl.java */
    /* loaded from: classes4.dex */
    class a implements Callback<ResponseModel<DataGameListBean>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ w1.k f54126b;

        a(w1.k kVar) {
            this.f54126b = kVar;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<ResponseModel<DataGameListBean>> call, Throwable th) {
            w1.k kVar = this.f54126b;
            if (kVar != null) {
                kVar.a(th);
            }
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<ResponseModel<DataGameListBean>> call, Response<ResponseModel<DataGameListBean>> response) {
            w1.k kVar = this.f54126b;
            if (kVar != null) {
                kVar.onSuccess(response.body());
            }
        }
    }

    public i(e2.i iVar) {
        this.f54125a = iVar;
    }

    private static void C0(boolean z4) {
        if (f54123b == null || z4) {
            f54123b = new i((e2.i) RetrofitApi.getRetrofit2(com.join.mgps.rpc.h.A).create(e2.i.class));
        }
    }

    public static i D0() {
        C0(false);
        return f54123b;
    }

    public static i E0() {
        if (f54124c == null) {
            f54124c = new i((e2.i) RetrofitApi.getRetrofit2(com.join.mgps.rpc.h.B).create(e2.i.class));
        }
        return f54124c;
    }

    public static void F0() {
        C0(true);
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<List<String>> A(RequestModel<RequestSearchUserCustomGameTag> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.A(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public void A0(RequestModel<QueryDownloadInfoRequestArgs> requestModel, w1.k<ResponseModel<DataGameListBean>> kVar) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                iVar.W0(requestModel).enqueue(new a(kVar));
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<ModGameDetailBean> B(RequestModel<RequestModGameArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.B(requestModel.makeSign()).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public e2.i B0() {
        return this.f54125a;
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<List<EndGameReportTypeBean>> C(RequestModel<RequestEndGameReportReasonArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.C(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<VideoAdCfgBean> D(RequestModel<VideoAdCfgRequestArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.D(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<List<CommonGameInfoBean>> E(RequestModel<RequestMiniGameArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.E(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<List<BbsCommentListBean>> F(RequestModel<RequestBbsCommentListArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.F(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<FavoriteGameListBean> G(RequestModel<FavoriteGameListArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.G(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<List<CollectionBeanSub>> H(RequestModel<RequestRankingListArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.H(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<EndGameListBean> I(RequestModel<RequestEndGameTypeArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.I(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<SearchGameListBean> J(RequestModel<RequestSearchGameArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.J(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<List<BossBean>> K(RequestModel<RequestBossListArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.K(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<ListUserCustomGameTagBean> L(RequestModel<RequestAddUserCustomGameTag> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.L(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<UninstallGuessLikeBean> M(RequestModel<UninstallGuessLikeArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.M(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel N(RequestModel<RequestEndGameReportReasonArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.N(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<List<EndGameBean>> O(RequestModel<RequestEndGameListArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.O(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel P(RequestModel<GameInformationCommentPraiseArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.P(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<Boolean> Q(RequestModel<RequestCreateEndGameArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.Q(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<EndGameDetailBean> R(RequestModel<RequestEndGameDetailArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.R(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<FavoriteGameListBean> S(RequestModel<FavoriteGameListArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.S(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<UninstallAppReasonBean> T(RequestModel requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.T(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<List<BbsCommentListBean>> U(RequestModel<RequestBbsCommentListArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.U(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<MiniGameSdkDtoResponseResponseData> V(RequestModel<MiniGameSdkDtoRequestArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.V(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<DomainInfoBean> W(RequestModel<RequestDomainInfoArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.W(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<List<SimulatorRecomBean>> X(RequestModel<RequestSimulatorRecomGamesArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.X(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<MessageDetailFeedBackBean> Y(RequestModel<MessageDetailFeedBackArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.Y(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel Z(RequestModel<UninstallAppReasonSubmitArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.Z(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel a(RequestModel<RequestFeedbackUserCustomTag> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.a(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<Boolean> a0(RequestModel<MessageDetailFeedBackArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.a0(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<List<BbsTagListBean>> b(RequestModel<RequestBbsTagListArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.b(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<ListUserCustomGameTagBean> b0(RequestModel<RequestListUserCustomGameTagArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.b0(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<List<CommonGameInfoBean>> c(RequestModel<RequestSimulatorRecomGamesArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.c(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<SimulatorAllAchievementBean> c0(RequestModel<RequestSimulatorAchievementListArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.c0(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel d(RequestModel<DiscoveryHeaderMenuClickArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.d(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<Boolean> d0(RequestModel<RequestBbsPraiseArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.d0(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<GameBbsPostListBean> e(RequestModel<RequestBbsRecommendArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.e(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<ModFeedbackBean> e0(RequestModel<RequestModFeedbackArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.e0(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<List<UserGameListBean>> f(RequestModel<RequestGameIdArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.f(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<SimulatorAchievementBean> f0(RequestModel<RequestSimulatorAchievementListArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.f0(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<List<EndGameDetailBean.RankingListBean>> g(RequestModel<RequestEndGameDetailArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.g(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<BbsDetailBean> g0(RequestModel<RequestBbsDetailArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.g0(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<List<CollectionBeanSub>> h(RequestModel<RequestGameIdArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.h(requestModel).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<InformationCommentBackV2> h0(RequestModel<GameInformationCommentRequestV2> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.h0(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<SimulatorMomentBean> i(RequestModel<RequestSimulatorMomentListArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.i(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel i0(RequestModel<RequestDeleteUserCustomGameTag> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.i0(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<GameMainV4DataBean> j(RequestModel<RequestGameIdArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.j(requestModel).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<List<CommonGameInfoBean>> j0(RequestModel<RequestEndGameAdArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.j0(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel k(RequestModel<AddGameInformationCommentArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.k(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<DiscoveryBannerBean> k0(RequestModel<RequestInfoArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.k0(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<Boolean> l(RequestModel<VideoAdWatchLogRequest> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.l(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<Boolean> l0(RequestModel<RequestBbsReplyArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.l0(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<SearchGameListBean> m(RequestModel<RequestSearchGameArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.m(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<GameBespeakBean> m0(RequestModel<RequestGameBespeakArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.m0(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<NoticeListData> n(RequestModel<RequestGameIdArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.n(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel n0(RequestModel<EndGameRecordArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.n0(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<List<BbsListBean>> o(RequestModel<RequestBbsListArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.o(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<CollectionModuleSevenBean> o0(RequestModel<CollectionModuleSevenArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.o0(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<GamedetialModleFourBean> p(RequestModel<RequestGameIdArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.p(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<Boolean> p0(RequestModel<RequestSimulatorMomentLikeArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.p0(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<QueryDownloadInfoResponseData> q(RequestModel<QueryDownloadInfoRequestArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.q(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<GameBespeakBean> q0(RequestModel<RequestGameBespeakArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.q0(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<ArchievePathMultiBean> r(RequestModel<ArchievePathMultiArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.r(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<GameMainV4DataBean> r0(RequestModel<RequestGameIdArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.r0(requestModel).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<List<CollectionBeanSub>> s(RequestModel<RequestGameIdArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.s(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<ModFeedbackBean> s0(RequestModel<RequestModFeedbackArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.s0(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<UninstallGuessLikeBean> t(RequestModel<UninstallGuessLikeArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.t(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<UninstallOnlineGameBean> t0(RequestModel<UninstallOnlineGameArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.t0(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<Boolean> u(RequestModel<RequestSimulatorMomentLikeArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.u(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<EndGameNameBean> u0(RequestModel<RequestEndGameNameListArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.u0(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<Boolean> v(RequestModel<RequestBbsDispraiseArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.v(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<List<CommonAdBean>> v0(RequestModel<RequestCommonAdArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.v0(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<GameDetailDataBean> w(RequestModel<GameDetailRequest> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.w(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<ServerListData> w0(RequestModel<RequestGameIdArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.w0(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<GameMainV4DataBean.EndGameConfigBean> x(RequestModel<RequestEndGameListArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.x(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<SimulatorExitPlayResponseData> x0(RequestModel<SimulatorExitPlayRequestArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.x0(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<CheckGameVersionResponseData> y(RequestModel<CheckGameVersionRequestArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.y(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<DiscoveryHeaderBean> y0(RequestModel<DiscoveryHeaderArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.y0(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel z(RequestModel<RequestDeleteUserCustomTag> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.z(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.k
    public ResponseModel<List<BbsCommentListBean>> z0(RequestModel<RequestBbsCommentListArgs> requestModel) {
        try {
            e2.i iVar = this.f54125a;
            if (iVar != null) {
                return iVar.z0(requestModel).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }
}
