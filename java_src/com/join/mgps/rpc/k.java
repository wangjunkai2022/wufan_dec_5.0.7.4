package com.join.mgps.rpc;

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
import java.util.List;
import retrofit2.http.Body;
import retrofit2.http.POST;
/* compiled from: RpcGameClient.java */
/* loaded from: classes4.dex */
public interface k {
    @POST("/v7/game/search_user_custom_game_tag")
    ResponseModel<List<String>> A(@Body RequestModel<RequestSearchUserCustomGameTag> requestModel);

    @POST("/v4/game/gameDownloadDetail")
    void A0(@Body RequestModel<QueryDownloadInfoRequestArgs> requestModel, w1.k<ResponseModel<DataGameListBean>> kVar);

    @POST("/v5/game/standAloneStartUpPanel")
    ResponseModel<ModGameDetailBean> B(@Body RequestModel<RequestModGameArgs> requestModel);

    @POST("/v7/game/feedback/list")
    ResponseModel<List<EndGameReportTypeBean>> C(@Body RequestModel<RequestEndGameReportReasonArgs> requestModel);

    @POST(h.X1)
    ResponseModel<VideoAdCfgBean> D(@Body RequestModel<VideoAdCfgRequestArgs> requestModel);

    @POST("/v7/mini_game/list")
    ResponseModel<List<CommonGameInfoBean>> E(@Body RequestModel<RequestMiniGameArgs> requestModel);

    @POST("/v7/bbs/post/comment/list")
    ResponseModel<List<BbsCommentListBean>> F(@Body RequestModel<RequestBbsCommentListArgs> requestModel);

    @POST("/v7/favorites/game_list")
    ResponseModel<FavoriteGameListBean> G(@Body RequestModel<FavoriteGameListArgs> requestModel);

    @POST("/v7/game_detail/ranking/list")
    ResponseModel<List<CollectionBeanSub>> H(@Body RequestModel<RequestRankingListArgs> requestModel);

    @POST("/v7/game/endgame/game_type/list")
    ResponseModel<EndGameListBean> I(@Body RequestModel<RequestEndGameTypeArgs> requestModel);

    @POST("/v7_2/search/gameSearchList")
    ResponseModel<SearchGameListBean> J(@Body RequestModel<RequestSearchGameArgs> requestModel);

    @POST("/v7/game/endgame/boos/list")
    ResponseModel<List<BossBean>> K(@Body RequestModel<RequestBossListArgs> requestModel);

    @POST("/v7/game/add_user_custom_game_tag")
    ResponseModel<ListUserCustomGameTagBean> L(@Body RequestModel<RequestAddUserCustomGameTag> requestModel);

    @POST("/v7/uninstall/game/index")
    ResponseModel<UninstallGuessLikeBean> M(@Body RequestModel<UninstallGuessLikeArgs> requestModel);

    @POST("/v7/game/feedback/create")
    ResponseModel N(@Body RequestModel<RequestEndGameReportReasonArgs> requestModel);

    @POST("/v7/game/endgame/main/list")
    ResponseModel<List<EndGameBean>> O(@Body RequestModel<RequestEndGameListArgs> requestModel);

    @POST("/v1/information/comment/praise")
    ResponseModel P(@Body RequestModel<GameInformationCommentPraiseArgs> requestModel);

    @POST("/v7/game/endgame/create")
    ResponseModel<Boolean> Q(@Body RequestModel<RequestCreateEndGameArgs> requestModel);

    @POST("/v7/game/endgame/main/detail")
    ResponseModel<EndGameDetailBean> R(@Body RequestModel<RequestEndGameDetailArgs> requestModel);

    @POST("/v7/favorites/search/game_list")
    ResponseModel<FavoriteGameListBean> S(@Body RequestModel<FavoriteGameListArgs> requestModel);

    @POST("/v7/uninstall/app/reason")
    ResponseModel<UninstallAppReasonBean> T(@Body RequestModel<UninstallAppReasonSubmitArgs> requestModel);

    @POST("/v7/bbs/post/reply/detail_list")
    ResponseModel<List<BbsCommentListBean>> U(@Body RequestModel<RequestBbsCommentListArgs> requestModel);

    @POST("/v7/minigame/sdk_ad_cfg")
    ResponseModel<MiniGameSdkDtoResponseResponseData> V(@Body RequestModel<MiniGameSdkDtoRequestArgs> requestModel);

    @POST("/game/private/domain/info")
    ResponseModel<DomainInfoBean> W(@Body RequestModel<RequestDomainInfoArgs> requestModel);

    @POST("/v7/game/gameSurface/recGame")
    ResponseModel<List<SimulatorRecomBean>> X(@Body RequestModel<RequestSimulatorRecomGamesArgs> requestModel);

    @POST("/v7/game/feedback_detail")
    ResponseModel<MessageDetailFeedBackBean> Y(@Body RequestModel<MessageDetailFeedBackArgs> requestModel);

    @POST("/v7/uninstall/app/reason_submit")
    ResponseModel Z(@Body RequestModel<UninstallAppReasonSubmitArgs> requestModel);

    @POST("/v7/game/feedback_user_custom_tag")
    ResponseModel a(@Body RequestModel<RequestFeedbackUserCustomTag> requestModel);

    @POST("/v7/game/feedback_reply")
    ResponseModel<Boolean> a0(@Body RequestModel<MessageDetailFeedBackArgs> requestModel);

    @POST("/v7/bbs/tag/list")
    ResponseModel<List<BbsTagListBean>> b(@Body RequestModel<RequestBbsTagListArgs> requestModel);

    @POST("/v7/game/list_user_custom_game_tag")
    ResponseModel<ListUserCustomGameTagBean> b0(@Body RequestModel<RequestListUserCustomGameTagArgs> requestModel);

    @POST("/v7/game/hot_game/list")
    ResponseModel<List<CommonGameInfoBean>> c(@Body RequestModel<RequestSimulatorRecomGamesArgs> requestModel);

    @POST("/v7/game/achievement/all_achievement")
    ResponseModel<SimulatorAllAchievementBean> c0(@Body RequestModel<RequestSimulatorAchievementListArgs> requestModel);

    @POST("/v8/discover/click_menu")
    ResponseModel d(@Body RequestModel<DiscoveryHeaderMenuClickArgs> requestModel);

    @POST("/v7/bbs/resource/praise")
    ResponseModel<Boolean> d0(@Body RequestModel<RequestBbsPraiseArgs> requestModel);

    @POST("/v7/bbs/post/recommend")
    ResponseModel<GameBbsPostListBean> e(@Body RequestModel<RequestBbsRecommendArgs> requestModel);

    @POST("/v5/game/mod_game_feedback")
    ResponseModel<ModFeedbackBean> e0(@Body RequestModel<RequestModFeedbackArgs> requestModel);

    @POST("/v7/game/endgame/user_game/list")
    ResponseModel<List<UserGameListBean>> f(@Body RequestModel<RequestGameIdArgs> requestModel);

    @POST("/v7/game/achievement/detail")
    ResponseModel<SimulatorAchievementBean> f0(@Body RequestModel<RequestSimulatorAchievementListArgs> requestModel);

    @POST("/v7/game/endgame/rangking/list")
    ResponseModel<List<EndGameDetailBean.RankingListBean>> g(@Body RequestModel<RequestEndGameDetailArgs> requestModel);

    @POST("/v7/bbs/post/detail")
    ResponseModel<BbsDetailBean> g0(@Body RequestModel<RequestBbsDetailArgs> requestModel);

    @POST(h.L1)
    ResponseModel<List<CollectionBeanSub>> h(@Body RequestModel<RequestGameIdArgs> requestModel);

    @POST("/v1/information/comment/list")
    ResponseModel<InformationCommentBackV2> h0(@Body RequestModel<GameInformationCommentRequestV2> requestModel);

    @POST("/v7/simulator/game/achievement_updates_v2")
    ResponseModel<SimulatorMomentBean> i(@Body RequestModel<RequestSimulatorMomentListArgs> requestModel);

    @POST("/v7/game/delete_user_custom_game_tag")
    ResponseModel i0(@Body RequestModel<RequestDeleteUserCustomGameTag> requestModel);

    @POST("/v7/game/gameSurface")
    ResponseModel<GameMainV4DataBean> j(@Body RequestModel<RequestGameIdArgs> requestModel);

    @POST("/v7/game/endgame/ad")
    ResponseModel<List<CommonGameInfoBean>> j0(@Body RequestModel<RequestEndGameAdArgs> requestModel);

    @POST("/v1/information/comment/add")
    ResponseModel k(@Body RequestModel<AddGameInformationCommentArgs> requestModel);

    @POST("/v7/home/discover/config")
    ResponseModel<DiscoveryBannerBean> k0(@Body RequestModel<RequestInfoArgs> requestModel);

    @POST(h.Y1)
    ResponseModel<Boolean> l(@Body RequestModel<VideoAdWatchLogRequest> requestModel);

    @POST("/v7/bbs/post/reply")
    ResponseModel<Boolean> l0(@Body RequestModel<RequestBbsReplyArgs> requestModel);

    @POST("/v7/search/pd/gameSearchList")
    ResponseModel<SearchGameListBean> m(@Body RequestModel<RequestSearchGameArgs> requestModel);

    @POST("/v7/game/unbespeak")
    ResponseModel<GameBespeakBean> m0(@Body RequestModel<RequestGameBespeakArgs> requestModel);

    @POST("/v7/game_detail/activity/list")
    ResponseModel<NoticeListData> n(@Body RequestModel<RequestGameIdArgs> requestModel);

    @POST("/v7/game/endgame/challenge/url")
    ResponseModel n0(@Body RequestModel<EndGameRecordArgs> requestModel);

    @POST("/v7/bbs/post/list")
    ResponseModel<List<BbsListBean>> o(@Body RequestModel<RequestBbsListArgs> requestModel);

    @POST("/v7/subject/template/index")
    ResponseModel<CollectionModuleSevenBean> o0(@Body RequestModel<CollectionModuleSevenArgs> requestModel);

    @POST("/v7/game/gameInfo")
    ResponseModel<GamedetialModleFourBean> p(@Body RequestModel<RequestGameIdArgs> requestModel);

    @POST("/v7/simulator/game/achievement/praise")
    ResponseModel<Boolean> p0(@Body RequestModel<RequestSimulatorMomentLikeArgs> requestModel);

    @POST("/v7/game/downloadInfo")
    ResponseModel<QueryDownloadInfoResponseData> q(@Body RequestModel<QueryDownloadInfoRequestArgs> requestModel);

    @POST("/v7/game/bespeak")
    ResponseModel<GameBespeakBean> q0(@Body RequestModel<RequestGameBespeakArgs> requestModel);

    @POST("/v7/game/stand_alone/cloud_archive_local_path")
    ResponseModel<ArchievePathMultiBean> r(@Body RequestModel<ArchievePathMultiArgs> requestModel);

    @POST("/v5/game/gameSurface")
    ResponseModel<GameMainV4DataBean> r0(@Body RequestModel<RequestGameIdArgs> requestModel);

    @POST("/v7/game_detail/similar_rec/list")
    ResponseModel<List<CollectionBeanSub>> s(@Body RequestModel<RequestGameIdArgs> requestModel);

    @POST("/v5/game/mod_question_collect")
    ResponseModel<ModFeedbackBean> s0(@Body RequestModel<RequestModFeedbackArgs> requestModel);

    @POST("/v7/uninstall/app/index")
    ResponseModel<UninstallGuessLikeBean> t(@Body RequestModel<UninstallGuessLikeArgs> requestModel);

    @POST("/v7/game/install")
    ResponseModel<UninstallOnlineGameBean> t0(@Body RequestModel<UninstallOnlineGameArgs> requestModel);

    @POST("/v7/simulator/game/achievement/cancel_praise")
    ResponseModel<Boolean> u(@Body RequestModel<RequestSimulatorMomentLikeArgs> requestModel);

    @POST("/v7/game/endgame/game/list")
    ResponseModel<EndGameNameBean> u0(@Body RequestModel<RequestEndGameNameListArgs> requestModel);

    @POST("/v7/bbs/resource/dispraise")
    ResponseModel<Boolean> v(@Body RequestModel<RequestBbsDispraiseArgs> requestModel);

    @POST("/v7/advert/generalAd")
    ResponseModel<List<CommonAdBean>> v0(@Body RequestModel<RequestCommonAdArgs> requestModel);

    @POST("/v9/game/gameInfo")
    ResponseModel<GameDetailDataBean> w(@Body RequestModel<GameDetailRequest> requestModel);

    @POST("/v7/game/openserver/list")
    ResponseModel<ServerListData> w0(@Body RequestModel<RequestGameIdArgs> requestModel);

    @POST("/v7/game/endgame/common/config")
    ResponseModel<GameMainV4DataBean.EndGameConfigBean> x(@Body RequestModel<RequestEndGameListArgs> requestModel);

    @POST("/v5/game/simulatorExitPlayPanel")
    ResponseModel<SimulatorExitPlayResponseData> x0(@Body RequestModel<SimulatorExitPlayRequestArgs> requestModel);

    @POST("/v7/game/version")
    ResponseModel<CheckGameVersionResponseData> y(@Body RequestModel<CheckGameVersionRequestArgs> requestModel);

    @POST("/v8/discover/index")
    ResponseModel<DiscoveryHeaderBean> y0(@Body RequestModel<DiscoveryHeaderArgs> requestModel);

    @POST("/v7/game/delete_user_custom_tag")
    ResponseModel z(@Body RequestModel<RequestDeleteUserCustomTag> requestModel);

    @POST("/v7/bbs/post/reply/list")
    ResponseModel<List<BbsCommentListBean>> z0(@Body RequestModel<RequestBbsCommentListArgs> requestModel);
}
