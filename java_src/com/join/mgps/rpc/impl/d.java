package com.join.mgps.rpc.impl;

import com.join.mgps.activity.recomend.RecomentBean1;
import com.join.mgps.activity.screenshot.ScreenShortListItemBean;
import com.join.mgps.activity.screenshot.ScreenshortTabBean;
import com.join.mgps.dto.APKVersionMainBean;
import com.join.mgps.dto.APKVersionRequestargs;
import com.join.mgps.dto.AllAppId;
import com.join.mgps.dto.ApkVersionbean;
import com.join.mgps.dto.AppBean;
import com.join.mgps.dto.AppDataBackupBean;
import com.join.mgps.dto.ArenaGameRoomListConfig;
import com.join.mgps.dto.BaiduAdDataMain;
import com.join.mgps.dto.BattlehallDatabean;
import com.join.mgps.dto.BootPageData;
import com.join.mgps.dto.BootPageRequestArgs;
import com.join.mgps.dto.CategoryBean;
import com.join.mgps.dto.CheckAppVersionBean;
import com.join.mgps.dto.ClassfyTypeBean;
import com.join.mgps.dto.ClassifyBean;
import com.join.mgps.dto.ClassifyGameBean;
import com.join.mgps.dto.CollectionBean;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CollectionDataBean;
import com.join.mgps.dto.CollectionModuleBean;
import com.join.mgps.dto.CommentSendMessageResultBean;
import com.join.mgps.dto.CommitContextDataBean;
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.dto.CommonRequestBeanInterface;
import com.join.mgps.dto.DetailResultBean;
import com.join.mgps.dto.DetailResultBeanV3;
import com.join.mgps.dto.DownDeductCoinResponse;
import com.join.mgps.dto.EverydayNewGameResponse;
import com.join.mgps.dto.ForumBannerBean;
import com.join.mgps.dto.GameDiscoverMainBean;
import com.join.mgps.dto.GameDownInfo;
import com.join.mgps.dto.GameFactoryListBean;
import com.join.mgps.dto.GameHeadAd;
import com.join.mgps.dto.GameInformationBean;
import com.join.mgps.dto.GameInformationCommentRequest;
import com.join.mgps.dto.GameListAndHeadAdAndCollectionInfoBean;
import com.join.mgps.dto.GameListAndHeadAdBean;
import com.join.mgps.dto.GameMainDataBean;
import com.join.mgps.dto.GameMainSimulatorResponse;
import com.join.mgps.dto.GameMainV3DataBean;
import com.join.mgps.dto.GameOLDataBean;
import com.join.mgps.dto.GameOLFirstBean;
import com.join.mgps.dto.GameOLHeadAdBean;
import com.join.mgps.dto.GameOLNoOpenTestBean;
import com.join.mgps.dto.GamePariseRequest;
import com.join.mgps.dto.GameReplyMessageListBean;
import com.join.mgps.dto.GameShareData;
import com.join.mgps.dto.GameSignleCompanyListbean;
import com.join.mgps.dto.GameSortBean;
import com.join.mgps.dto.GameSortRequestBean;
import com.join.mgps.dto.GameTopicBean;
import com.join.mgps.dto.GameVerByBg;
import com.join.mgps.dto.GameVerByBgRequestargs;
import com.join.mgps.dto.GamedetialModleFourBean;
import com.join.mgps.dto.GamedetialMoreGiftData;
import com.join.mgps.dto.GamesurFaceMainBean;
import com.join.mgps.dto.GiftPackageArgs;
import com.join.mgps.dto.GiftPackageBean;
import com.join.mgps.dto.GiftPackageDataInfoBean;
import com.join.mgps.dto.GiftPackageInfoArgs;
import com.join.mgps.dto.GiftPackageInfoBean;
import com.join.mgps.dto.GiftPackageOperationArgs;
import com.join.mgps.dto.GiftPackageOperationBean;
import com.join.mgps.dto.HandShankAdBean;
import com.join.mgps.dto.HomeGameCarefullyBean;
import com.join.mgps.dto.IgnoreNoticeRequestArgs;
import com.join.mgps.dto.InformationCommentBack;
import com.join.mgps.dto.InformationMainBean;
import com.join.mgps.dto.InformationSendBack;
import com.join.mgps.dto.InformationSendRequestBean;
import com.join.mgps.dto.MatchBattleManagementBean;
import com.join.mgps.dto.MessageRedPointBean;
import com.join.mgps.dto.MustPlayData;
import com.join.mgps.dto.MustPlayNetDataBean;
import com.join.mgps.dto.PAPAHomeBean;
import com.join.mgps.dto.PAPAMainBean;
import com.join.mgps.dto.PariseBackData;
import com.join.mgps.dto.PariseRequest;
import com.join.mgps.dto.PayGameDetialBean;
import com.join.mgps.dto.PopupAdBean;
import com.join.mgps.dto.RankingDataBean;
import com.join.mgps.dto.RankingItemDataBean;
import com.join.mgps.dto.RecomCentrebean;
import com.join.mgps.dto.RecomDataAllBean;
import com.join.mgps.dto.RecomDatabean;
import com.join.mgps.dto.RecomRequestArgs;
import com.join.mgps.dto.RecomRequestBean;
import com.join.mgps.dto.RecomeWifiDatabean;
import com.join.mgps.dto.RecommendInfomationBean;
import com.join.mgps.dto.RegisterRequestBean;
import com.join.mgps.dto.RequestAppDetialArgs;
import com.join.mgps.dto.RequestArenaRoomListArgs;
import com.join.mgps.dto.RequestBattlehallArgs;
import com.join.mgps.dto.RequestClassifyArgs;
import com.join.mgps.dto.RequestCollectionArgs;
import com.join.mgps.dto.RequestCommitArgs;
import com.join.mgps.dto.RequestCompanyNameArgs;
import com.join.mgps.dto.RequestDownloadCenterArgs;
import com.join.mgps.dto.RequestGameIdArgs;
import com.join.mgps.dto.RequestGameShareTag;
import com.join.mgps.dto.RequestGoogleRankArgs;
import com.join.mgps.dto.RequestHandShankAdListArgs;
import com.join.mgps.dto.RequestInfoIdArgs;
import com.join.mgps.dto.RequestKeywordArgs;
import com.join.mgps.dto.RequestPnAndPcAndUidArgs;
import com.join.mgps.dto.RequestPnAndPcArgs;
import com.join.mgps.dto.RequestPnArgs;
import com.join.mgps.dto.RequestSNKGameArgs;
import com.join.mgps.dto.RequestScreenshortListArgs;
import com.join.mgps.dto.RequestSearchPageArgs;
import com.join.mgps.dto.RequestSiliencebean;
import com.join.mgps.dto.RequestSimulatorArgs;
import com.join.mgps.dto.RequestTypePn;
import com.join.mgps.dto.RequestUidtagidTagdes;
import com.join.mgps.dto.RequestUserCenterArgs;
import com.join.mgps.dto.RequestWarIndexArgs;
import com.join.mgps.dto.ResponseDownloadCenterAd;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.ResultValbean;
import com.join.mgps.dto.RewardBean;
import com.join.mgps.dto.SNKGameInfoBean;
import com.join.mgps.dto.SearchAppBean;
import com.join.mgps.dto.SearchAutoBean;
import com.join.mgps.dto.SearchDataBean;
import com.join.mgps.dto.SearchGameFavoriteListBean;
import com.join.mgps.dto.SearchGameListBean;
import com.join.mgps.dto.SearchIntegratedBean;
import com.join.mgps.dto.SearchPageBean;
import com.join.mgps.dto.SearchPostsBean;
import com.join.mgps.dto.SearchRecommendBean;
import com.join.mgps.dto.SendAppinfoMainbean;
import com.join.mgps.dto.ServiceStateForMore;
import com.join.mgps.dto.ShowViewDataBean;
import com.join.mgps.dto.SimulatorAreaDataBean;
import com.join.mgps.dto.SimulatorAreaRequest;
import com.join.mgps.dto.StandAloneListBean;
import com.join.mgps.dto.StatisticMainBean;
import com.join.mgps.dto.TodayWufunBean;
import com.join.mgps.dto.TodayWufunTopic;
import com.join.mgps.dto.UserCenterBean;
import com.join.mgps.dto.VipPopData;
import com.join.mgps.dto.WarIndexDataBean;
import com.join.mgps.dto.WarIndexResultMainBean;
import com.join.mgps.dto.WarModuleBean;
import com.join.mgps.dto.WufunMarketHomeBean;
import com.join.mgps.rpc.retrofit2.RetrofitApi;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: RpcClientImpl.java */
/* loaded from: classes4.dex */
public class d implements com.join.mgps.rpc.e {

    /* renamed from: b  reason: collision with root package name */
    private static d f54113b;

    /* renamed from: a  reason: collision with root package name */
    private final e2.d f54114a;

    public d(e2.d dVar) {
        this.f54114a = dVar;
    }

    public static d P1() {
        if (f54113b == null) {
            f54113b = new d((e2.d) RetrofitApi.getRetrofit2(com.join.mgps.rpc.h.f54053i).create(e2.d.class));
        }
        return f54113b;
    }

    public static d Q1() {
        d dVar = new d((e2.d) RetrofitApi.getRetrofit2(com.join.mgps.rpc.h.f54053i).create(e2.d.class));
        f54113b = dVar;
        return dVar;
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<GameOLDataBean<GameOLFirstBean>> A(CommonRequestBean<RequestPnAndPcArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.A(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<TodayWufunTopic>> A0(CommonRequestBean<RequestPnAndPcArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.A0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<CollectionBeanSub>> A1(CommonRequestBean<RequestSNKGameArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.A1(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<RecomCentrebean>> B(CommonRequestBean<RequestPnArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.B(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<GameSortBean>> B0(CommonRequestBean<GameSortRequestBean> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.B0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<SearchGameListBean> B1(CommonRequestBean commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.B1(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<BootPageData>> C(CommonRequestBean<BootPageRequestArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.C(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<GameDownInfo> C0(CommonRequestBean<RequestGameIdArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.C0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<ApkVersionbean>> C1(CommonRequestBean<APKVersionRequestargs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.C1(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean D(CommonRequestBean<RequestGameIdArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.D(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<BattlehallDatabean> D0(CommonRequestBean<RequestBattlehallArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.D0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<SearchIntegratedBean> D1(CommonRequestBean commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.D1(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<MatchBattleManagementBean>> E(CommonRequestBean<RequestPnArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.E(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<ForumBannerBean.ForumAreaBannerMessagesData>> E0(ForumBannerBean.ForumBannerRequestBean forumBannerRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.E0(forumBannerRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<ResultValbean>> E1(CommonRequestBean<RequestGameShareTag> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.E1(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<RecommendInfomationBean>> F(CommonRequestBean<RequestGameIdArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.F(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<GameSignleCompanyListbean> F0(CommonRequestBean<RequestPnAndPcArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.F0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<StandAloneListBean>> F1(CommonRequestBean commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.F1(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<GameMainV3DataBean> G(CommonRequestBean<RequestGameIdArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.G(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<ShowViewDataBean>> G0(CommonRequestBean<ArrayList> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.G0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public CollectionBean G1(CommonRequestBean<RequestCollectionArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.G1(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<GameFactoryListBean> H(CommonRequestBean<Integer> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.H(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<SearchDataBean>> H0(CommonRequestBean<AppDataBackupBean> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.H0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public MessageRedPointBean H1(CommonRequestBean commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.H1(commonRequestBean).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<RecomeWifiDatabean> I(CommonRequestBean<RequestPnAndPcArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.I(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<CollectionBeanSub>> I0(CommonRequestBean<RequestClassifyArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.I0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<PAPAMainBean> I1(CommonRequestBean commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.I1(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<PopupAdBean> J(CommonRequestBean<RequestPnAndPcAndUidArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.J(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public GameDiscoverMainBean J0(CommonRequestBean<RequestPnAndPcArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.J0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<CommentSendMessageResultBean>> J1(CommonRequestBean<RegisterRequestBean> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.J1(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<BaiduAdDataMain>> K(CommonRequestBean<RequestPnArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.K(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public RecomDataAllBean K0(CommonRequestBean commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.K0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<SimulatorAreaDataBean> K1(RecomRequestBean<SimulatorAreaRequest> recomRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.K1(recomRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<RecomentBean1> L(CommonRequestBean<RequestTypePn> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.L(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public GiftPackageBean L0(CommonRequestBean<GiftPackageArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.L0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<SimulatorAreaDataBean> L1(RecomRequestBean<SimulatorAreaRequest> recomRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.M1(recomRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<GameFactoryListBean> M(CommonRequestBean<Integer> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.M(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<ClassfyTypeBean> M0(CommonRequestBean<ClassifyGameBean> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.M0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<SimulatorAreaDataBean> M1(RecomRequestBean<SimulatorAreaRequest> recomRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.O1(recomRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<GameListAndHeadAdAndCollectionInfoBean> N(CommonRequestBean<RequestPnAndPcArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.N(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<APKVersionMainBean>> N0(CommonRequestBean<APKVersionRequestargs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.N0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<SimulatorAreaDataBean> N1(RecomRequestBean<SimulatorAreaRequest> recomRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.Q1(recomRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<GameInformationBean>> O(CommonRequestBean<RequestInfoIdArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.O(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean O0(CommonRequestBean<RequestGameIdArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.O0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public e2.d O1() {
        return this.f54114a;
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<GameOLHeadAdBean>> P(CommonRequestBean<RequestPnArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.P(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public GiftPackageInfoBean P0(CommonRequestBean<GiftPackageInfoArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.P0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public WarModuleBean Q(CommonRequestBeanInterface commonRequestBeanInterface) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.Q(commonRequestBeanInterface).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<String> Q0(CommonRequestBean<RequestGameIdArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.Q0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<DetailResultBean>> R(RecomRequestBean<RequestAppDetialArgs> recomRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.R(recomRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<VipPopData>> R0(CommonRequestBean<RequestPnAndPcAndUidArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.R0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<GameListAndHeadAdBean> S(CommonRequestBean<RequestPnAndPcArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.S(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public GamesurFaceMainBean S0(RecomRequestBean<RequestAppDetialArgs> recomRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.S0(recomRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<DetailResultBeanV3>> T(RecomRequestBean<RequestAppDetialArgs> recomRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.T(recomRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<StandAloneListBean>> T0(CommonRequestBean commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.T0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<GamedetialModleFourBean>> U(CommonRequestBean<RequestGameIdArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.U(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<StatisticMainBean>> U0(CommonRequestBeanInterface commonRequestBeanInterface) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.U0(commonRequestBeanInterface).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<SNKGameInfoBean> V(CommonRequestBean commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.V(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<GameMainSimulatorResponse> V0(CommonRequestBean<RequestGameIdArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.V0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<ResultValbean>> W(CommonRequestBean<RequestUserCenterArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.W(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public CategoryBean W0(CommonRequestBean<ArrayList> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.W0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<GamedetialMoreGiftData> X(CommonRequestBean<RequestGameIdArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.X(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<HomeGameCarefullyBean> X0(CommonRequestBean commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.X0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<GameOLDataBean<GameOLFirstBean>> Y(CommonRequestBean<RequestPnAndPcArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.Y(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<RecomDatabean>> Y0(CommonRequestBean<RequestPnArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.Y0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ForumBannerBean.ForumBannerResponseBean Z(ForumBannerBean.ForumBannerRequestBean forumBannerRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.Z(forumBannerRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<UserCenterBean> Z0(CommonRequestBean<RequestUserCenterArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.Z0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<UserCenterBean> a(CommonRequestBean<RequestUserCenterArgs> commonRequestBean) {
        return null;
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<PayGameDetialBean> a0(RecomRequestBean<RequestAppDetialArgs> recomRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.a0(recomRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<GameMainDataBean>> a1(CommonRequestBean<RequestGameIdArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.a1(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<PariseBackData>> b(CommonRequestBean<GamePariseRequest> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.b(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public GameReplyMessageListBean b0(CommonRequestBean commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.b0(commonRequestBean).execute().body();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<RankingItemDataBean> b1(CommonRequestBean<RequestTypePn> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.b1(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<MustPlayNetDataBean>> c(CommonRequestBeanInterface commonRequestBeanInterface) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.c(commonRequestBeanInterface).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<CollectionDataBean>> c0(CommonRequestBean<RequestSimulatorArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.c0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public CollectionModuleBean c1(CommonRequestBean<RequestCollectionArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.c1(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean d(CommonRequestBean<RequestGameIdArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.d(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean d0(CommonRequestBean<RequestGameIdArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.d0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<ResponseDownloadCenterAd> d1(CommonRequestBean<RequestDownloadCenterArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.d1(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public SearchAutoBean e(CommonRequestBean<RequestKeywordArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.e(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<String>> e0(CommonRequestBean<IgnoreNoticeRequestArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.e0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<CollectionBeanSub> e1(RecomRequestBean<RequestAppDetialArgs> recomRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.e1(recomRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<InformationCommentBack> f(CommonRequestBean<GameInformationCommentRequest> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.f(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public GiftPackageOperationBean f0(CommonRequestBean<GiftPackageOperationArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.f0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<CheckAppVersionBean>> f1(CommonRequestBean<AllAppId> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.f1(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<GameListAndHeadAdBean> g(CommonRequestBean<RequestPnAndPcArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.g(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<CollectionBeanSub>> g0(CommonRequestBean<RequestTypePn> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.g0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<ServiceStateForMore>> g1(CommonRequestBean<RequestGameIdArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.g1(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<GameOLDataBean<GameOLNoOpenTestBean>> h(CommonRequestBean<RequestPnAndPcArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.h(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<ScreenshortTabBean>> h0(CommonRequestBean<RequestGameIdArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.h0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public SearchRecommendBean h1(CommonRequestBean commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.h1(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public WarIndexResultMainBean<List<WarIndexDataBean>> i(CommonRequestBean<RequestWarIndexArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.i(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<RewardBean>> i0(CommonRequestBean<RequestPnAndPcAndUidArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.i0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<GameOLDataBean<GameOLFirstBean>> i1(CommonRequestBean<RequestPnAndPcArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.i1(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<GameOLDataBean<GameOLFirstBean>> j(CommonRequestBean<RequestPnAndPcArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.j(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<RecommendInfomationBean>> j0(CommonRequestBean<RequestGameIdArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.j0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<SearchPageBean> j1(CommonRequestBean<RequestSearchPageArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.j1(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<RankingDataBean>> k(CommonRequestBean<GameSortRequestBean> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.k(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<InformationCommentBack> k0(CommonRequestBean<GameInformationCommentRequest> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.k0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<ResultValbean>> k1(CommonRequestBean<RequestUidtagidTagdes> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.k1(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<SearchPageBean> l(CommonRequestBean<RequestSearchPageArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.l(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public SearchAppBean l0(CommonRequestBean<RequestKeywordArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.l0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<RecomDatabean>> l1(CommonRequestBean commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.l1(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<String[]> m(CommonRequestBeanInterface commonRequestBeanInterface) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.m(commonRequestBeanInterface).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<TodayWufunBean>> m0(CommonRequestBean<RequestPnAndPcArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.m0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<CommitContextDataBean> m1(CommonRequestBean<InformationSendRequestBean> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.m1(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<CommitContextDataBean> n(CommonRequestBean commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.n(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<SearchPageBean>> n0(CommonRequestBean<RequestSearchPageArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.n0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<GameShareData> n1(CommonRequestBean<RequestGameIdArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.n1(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean o(CommonRequestBean<RequestGameIdArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.o(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<RecomDatabean>> o0(CommonRequestBean<RequestGameIdArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.o0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<SearchPostsBean> o1(CommonRequestBean commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.o1(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<CollectionBeanSub>> p(CommonRequestBean<RequestGameIdArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.p(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<PariseBackData>> p0(CommonRequestBean<PariseRequest> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.p0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<GameOLDataBean<GameOLFirstBean>> p1(CommonRequestBean<RequestPnAndPcArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.p1(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<ArenaGameRoomListConfig> q(CommonRequestBean<RequestArenaRoomListArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.q(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<ClassifyBean> q0(CommonRequestBean<GameSortRequestBean> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.q0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<CollectionBeanSub>> q1(CommonRequestBean<RequestGameIdArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.q1(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<SearchGameFavoriteListBean> r(CommonRequestBean commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.r(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<HandShankAdBean> r0(CommonRequestBean<RequestHandShankAdListArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.r0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<APKVersionMainBean>> r1(CommonRequestBean<APKVersionRequestargs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.r1(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<CollectionDataBean>> s(CommonRequestBean<RequestSimulatorArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.s(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<CommentSendMessageResultBean>> s0(CommonRequestBean<SendAppinfoMainbean> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.s0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<MustPlayData> s1(CommonRequestBean<RecomRequestArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.s1(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<GiftPackageDataInfoBean>> t(CommonRequestBean<RequestPnAndPcArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.t(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<RecomDatabean>> t0(CommonRequestBean<RequestPnArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.t0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<DownDeductCoinResponse> t1(RecomRequestBean<RequestAppDetialArgs> recomRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.t1(recomRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<ResultValbean>> u(CommonRequestBean<RequestSiliencebean> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.u(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<WufunMarketHomeBean> u0(CommonRequestBean commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.u0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<PariseBackData>> u1(CommonRequestBean<PariseRequest> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.u1(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public InformationMainBean v(CommonRequestBean<RequestPnArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.v(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<PAPAHomeBean>> v0(CommonRequestBean commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.v0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<GameHeadAd>> v1(CommonRequestBean commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.v1(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<ScreenShortListItemBean>> w(CommonRequestBean<RequestScreenshortListArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.w(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<AppBean>> w0(CommonRequestBean<RequestGoogleRankArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.w0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<InformationSendBack> w1(CommonRequestBean<InformationSendRequestBean> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.w1(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<EverydayNewGameResponse> x(CommonRequestBean<RequestSimulatorArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.x(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<ForumBannerBean.ForumBannerDataBannerBean> x0(ForumBannerBean.ForumBannerRequestBean forumBannerRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.x0(forumBannerRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public SearchAppBean x1(CommonRequestBean commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.x1(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<GameTopicBean>> y(CommonRequestBean<GameTopicBean> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.y(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<InformationCommentBack> y0(CommonRequestBean<RequestCommitArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.y0(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<RecomDatabean>> y1(CommonRequestBean<RequestGameIdArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.y1(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<List<CollectionBeanSub>> z(CommonRequestBean<RequestCompanyNameArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.z(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<GameVerByBg> z0(RecomRequestBean<GameVerByBgRequestargs> recomRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.z0(recomRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.join.mgps.rpc.e
    public ResultMainBean<GameOLDataBean<GameOLFirstBean>> z1(CommonRequestBean<RequestPnAndPcArgs> commonRequestBean) {
        try {
            e2.d dVar = this.f54114a;
            if (dVar != null) {
                return dVar.z1(commonRequestBean).execute().body();
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }
}
