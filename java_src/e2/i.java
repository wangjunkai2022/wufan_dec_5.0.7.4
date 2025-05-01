package e2;

import com.join.kotlin.discount.model.bean.GameDetailDataBean;
import com.join.kotlin.discount.model.request.GameDetailRequest;
import com.join.kotlin.ui.cloudarchive.data.ArchiveArgs;
import com.join.kotlin.ui.cloudarchive.data.ArchiveData;
import com.join.kotlin.ui.coupon.CouponListMainData;
import com.join.kotlin.ui.coupon.CouponRequest;
import com.join.kotlin.ui.coupon.NoticeListData;
import com.join.kotlin.ui.coupon.ServerListData;
import com.join.kotlin.ui.findgame.data.CategoryListMain;
import com.join.kotlin.ui.findgame.data.CategoryRequest;
import com.join.kotlin.ui.findgame.data.EverdayNewResultData;
import com.join.kotlin.ui.findgame.data.FindChoiceResultData;
import com.join.kotlin.ui.findgame.data.FindClassifyResultData;
import com.join.kotlin.ui.userrecom.UserRecomRequestArgs;
import com.join.mgps.activity.mygame.data.DataGameListBean;
import com.join.mgps.activity.mygame.data.RecommendGameListBean;
import com.join.mgps.activity.search.SearchAutoData;
import com.join.mgps.activity.search.SearchIndexData;
import com.join.mgps.activity.vipzone.bean.LuckAddressrequest;
import com.join.mgps.activity.vipzone.bean.LuckHistoryResult;
import com.join.mgps.activity.vipzone.bean.LuckHistoryrequest;
import com.join.mgps.activity.vipzone.bean.PrizeBean;
import com.join.mgps.activity.vipzone.bean.SpecialZoneResultbean;
import com.join.mgps.activity.vipzone.bean.SpecialgamelistRequestBean;
import com.join.mgps.activity.vipzone.bean.VipCenterRequestBean;
import com.join.mgps.activity.vipzone.bean.VipCenterResultData;
import com.join.mgps.dto.AddGameInformationCommentArgs;
import com.join.mgps.dto.ArchievePathMultiArgs;
import com.join.mgps.dto.ArchievePathMultiBean;
import com.join.mgps.dto.ArchiveDataAddPd;
import com.join.mgps.dto.BbsCommentListBean;
import com.join.mgps.dto.BbsDetailBean;
import com.join.mgps.dto.BbsListBean;
import com.join.mgps.dto.BbsTagListBean;
import com.join.mgps.dto.BossBean;
import com.join.mgps.dto.CfgInfoRequestArgs;
import com.join.mgps.dto.CheckGameVersionRequestArgs;
import com.join.mgps.dto.CheckGameVersionResponseData;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CollectionModuleSevenArgs;
import com.join.mgps.dto.CollectionModuleSevenBean;
import com.join.mgps.dto.CommonAdBean;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.ConfigData;
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
import com.join.mgps.dto.FirstScreenAdDtoData;
import com.join.mgps.dto.GameBbsPostListBean;
import com.join.mgps.dto.GameBespeakBean;
import com.join.mgps.dto.GameInformationCommentPraiseArgs;
import com.join.mgps.dto.GameInformationCommentRequestV2;
import com.join.mgps.dto.GameMD5ResultInfo;
import com.join.mgps.dto.GameMainV4DataBean;
import com.join.mgps.dto.GameMd5Data;
import com.join.mgps.dto.GamedetialModleFourBean;
import com.join.mgps.dto.GamelistRankingmainbean;
import com.join.mgps.dto.InformationCommentBackV2;
import com.join.mgps.dto.ListUserCustomGameTagBean;
import com.join.mgps.dto.MessageDetailFeedBackArgs;
import com.join.mgps.dto.MessageDetailFeedBackBean;
import com.join.mgps.dto.MiniGameSdkDtoRequestArgs;
import com.join.mgps.dto.MiniGameSdkDtoResponseResponseData;
import com.join.mgps.dto.ModFeedbackBean;
import com.join.mgps.dto.ModGameArchiveTagBean;
import com.join.mgps.dto.ModGameDetailBean;
import com.join.mgps.dto.ModGameRecommendAdBean;
import com.join.mgps.dto.OnlineCouponConfigBean;
import com.join.mgps.dto.PAPAHomeBeanV6;
import com.join.mgps.dto.PAPAHomeBeanV7;
import com.join.mgps.dto.PapaHomeBeanV9;
import com.join.mgps.dto.PapaHomeCheckNewDataBean;
import com.join.mgps.dto.QueryDownloadInfoRequestArgs;
import com.join.mgps.dto.QueryDownloadInfoResponseData;
import com.join.mgps.dto.RankingMainDataBean;
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
import com.join.mgps.dto.RequestKeywordArgs;
import com.join.mgps.dto.RequestListUserCustomGameTagArgs;
import com.join.mgps.dto.RequestMiniGameArgs;
import com.join.mgps.dto.RequestModFeedbackArgs;
import com.join.mgps.dto.RequestModGameArgs;
import com.join.mgps.dto.RequestModGameRecommendAdArgs;
import com.join.mgps.dto.RequestModGameTagArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.RequestOnlineCouponArgs;
import com.join.mgps.dto.RequestRankingListArgs;
import com.join.mgps.dto.RequestSearchGameArgs;
import com.join.mgps.dto.RequestSearchUserCustomGameTag;
import com.join.mgps.dto.RequestSimulatorAchievementListArgs;
import com.join.mgps.dto.RequestSimulatorMomentLikeArgs;
import com.join.mgps.dto.RequestSimulatorMomentListArgs;
import com.join.mgps.dto.RequestSimulatorRecomGamesArgs;
import com.join.mgps.dto.RequestUidtagidTagdes;
import com.join.mgps.dto.RequestUserCenterArgs;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.SearchGameListBean;
import com.join.mgps.dto.SimulatorAchievementBean;
import com.join.mgps.dto.SimulatorAllAchievementBean;
import com.join.mgps.dto.SimulatorExitPlayRequestArgs;
import com.join.mgps.dto.SimulatorExitPlayResponseData;
import com.join.mgps.dto.SimulatorFastEntryBean;
import com.join.mgps.dto.SimulatorMomentBean;
import com.join.mgps.dto.SimulatorRecomBean;
import com.join.mgps.dto.UninstallAppReasonBean;
import com.join.mgps.dto.UninstallAppReasonSubmitArgs;
import com.join.mgps.dto.UninstallGuessLikeArgs;
import com.join.mgps.dto.UninstallGuessLikeBean;
import com.join.mgps.dto.UninstallOnlineGameArgs;
import com.join.mgps.dto.UninstallOnlineGameBean;
import com.join.mgps.dto.UserCenterBean;
import com.join.mgps.dto.UserGameListBean;
import com.join.mgps.dto.VideoAdCfgBean;
import com.join.mgps.dto.VideoAdCfgRequestArgs;
import com.join.mgps.dto.VideoAdWatchLogRequest;
import com.papa91.common.RealNameCheckInfo;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
/* compiled from: IRpcGameClient.java */
/* loaded from: classes4.dex */
public interface i {
    @POST("/v7/game/search_user_custom_game_tag")
    Call<ResponseModel<List<String>>> A(@Body RequestModel<RequestSearchUserCustomGameTag> requestModel);

    @POST("/v6/configure/cfg_info")
    Call<ResponseModel<ConfigData>> A0(@Body RequestModel<CfgInfoRequestArgs> requestModel);

    @POST("/v6/game/take/coupon")
    Call<ResponseModel> A1(@Body RequestModel<CouponRequest> requestModel);

    @POST("/v6/game/cloudArchive/standAloneStartUpPanel")
    Call<ResponseModel<ModGameDetailBean>> B(@Body RequestModel<RequestModGameArgs> requestModel);

    @POST("/v6/game/cloudArchive/comment")
    Call<ResponseModel> B0(@Body RequestModel<ArchiveArgs> requestModel);

    @POST("/v6/game/old/gameInfo")
    Call<ResponseModel<GamedetialModleFourBean>> B1(@Body RequestModel<RequestGameIdArgs> requestModel);

    @POST("/v7/game/feedback/list")
    Call<ResponseModel<List<EndGameReportTypeBean>>> C(@Body RequestModel<RequestEndGameReportReasonArgs> requestModel);

    @POST("/v6/game/cloudArchive/tagList")
    Call<ResponseModel<List<ModGameArchiveTagBean>>> C0(@Body RequestModel<RequestModGameTagArgs> requestModel);

    @POST("/v4/game/fileMd5State")
    Call<ResponseModel<GameMD5ResultInfo>> C1(@Body RequestModel<GameMd5Data> requestModel);

    @POST(com.join.mgps.rpc.h.X1)
    Call<ResponseModel<VideoAdCfgBean>> D(@Body RequestModel<VideoAdCfgRequestArgs> requestModel);

    @POST("/v6/game/cloudArchive/releasedList")
    Call<ResponseModel<List<ArchiveData>>> D0(@Body RequestModel<RequestGameIdArgs> requestModel);

    @POST("/v7/mini_game/list")
    Call<ResponseModel<List<CommonGameInfoBean>>> E(@Body RequestModel<RequestMiniGameArgs> requestModel);

    @POST("/v5/special_game_board/ranking_game_list")
    Call<ResponseModel<List<CollectionBeanSub>>> E0(@Body RequestModel<SpecialgamelistRequestBean> requestModel);

    @POST("/v7/bbs/post/comment/list")
    Call<ResponseModel<List<BbsCommentListBean>>> F(@Body RequestModel<RequestBbsCommentListArgs> requestModel);

    @POST("/v9/game/game_type")
    Call<ResponseModel<FindClassifyResultData>> F0(@Body RequestModel<LuckHistoryrequest> requestModel);

    @POST("/v7/favorites/game_list")
    Call<ResponseModel<FavoriteGameListBean>> G(@Body RequestModel<FavoriteGameListArgs> requestModel);

    @POST("/v6/game/cloudArchive/communityListAddPd")
    Call<ResponseModel<ArchiveDataAddPd>> G0(@Body RequestModel<RequestGameIdArgs> requestModel);

    @POST("/v7/game_detail/ranking/list")
    Call<ResponseModel<List<CollectionBeanSub>>> H(@Body RequestModel<RequestRankingListArgs> requestModel);

    @POST("/v5/special_game_board/index")
    Call<ResponseModel<SpecialZoneResultbean>> H0(@Body RequestModel<VipCenterRequestBean> requestModel);

    @POST("/v7/game/endgame/game_type/list")
    Call<ResponseModel<EndGameListBean>> I(@Body RequestModel<RequestEndGameTypeArgs> requestModel);

    @POST("/v6/game/cloudArchive/downloadedList")
    Call<ResponseModel<List<ArchiveData>>> I0(@Body RequestModel<RequestGameIdArgs> requestModel);

    @POST("/v7_2/search/gameSearchList")
    Call<ResponseModel<SearchGameListBean>> J(@Body RequestModel<RequestSearchGameArgs> requestModel);

    @POST("/v6/game/cloudArchive/delReleased")
    Call<ResponseModel> J0(@Body RequestModel<ArchiveArgs> requestModel);

    @POST("/v7/game/endgame/boos/list")
    Call<ResponseModel<List<BossBean>>> K(@Body RequestModel<RequestBossListArgs> requestModel);

    @POST("/v6/game/openserver/list")
    Call<ResponseModel<ServerListData>> K0(@Body RequestModel<RequestGameIdArgs> requestModel);

    @POST("/v7/game/add_user_custom_game_tag")
    Call<ResponseModel<ListUserCustomGameTagBean>> L(@Body RequestModel<RequestAddUserCustomGameTag> requestModel);

    @POST("/v6/game/cloudArchive/delComment")
    Call<ResponseModel> L0(@Body RequestModel<ArchiveArgs> requestModel);

    @POST("/v7/uninstall/game/index")
    Call<ResponseModel<UninstallGuessLikeBean>> M(@Body RequestModel<UninstallGuessLikeArgs> requestModel);

    @POST("/v7/game/myGameRecommend")
    Call<ResponseModel<RecommendGameListBean>> M0(@Body RequestModel<QueryDownloadInfoRequestArgs> requestModel);

    @POST("/v7/game/feedback/create")
    Call<ResponseModel> N(@Body RequestModel<RequestEndGameReportReasonArgs> requestModel);

    @POST("/v7/simulatorIndex/getInfo")
    Call<ResponseModel<SimulatorFastEntryBean>> N0(@Body RequestModel<RequestOnlineCouponArgs> requestModel);

    @POST("/v7/game/endgame/main/list")
    Call<ResponseModel<List<EndGameBean>>> O(@Body RequestModel<RequestEndGameListArgs> requestModel);

    @POST("/v6/game/game_type_game_list")
    Call<ResponseModel<CategoryListMain>> O0(@Body RequestModel<CategoryRequest> requestModel);

    @POST("/v1/information/comment/praise")
    Call<ResponseModel> P(@Body RequestModel<GameInformationCommentPraiseArgs> requestModel);

    @POST("/v4/game/downloadRecommend")
    Call<ResponseModel<DataGameListBean>> P0(@Body RequestModel<QueryDownloadInfoRequestArgs> requestModel);

    @POST("/v7/game/endgame/create")
    Call<ResponseModel<Boolean>> Q(@Body RequestModel<RequestCreateEndGameArgs> requestModel);

    @POST("/v7/home/game/recommend")
    Call<ResponseModel<List<CollectionBeanSub>>> Q0(@Body RequestModel<UserRecomRequestArgs> requestModel);

    @POST("/v7/game/endgame/main/detail")
    Call<ResponseModel<EndGameDetailBean>> R(@Body RequestModel<RequestEndGameDetailArgs> requestModel);

    @POST("/v7/home/recommend/set_state")
    Call<ResponseModel<PapaHomeCheckNewDataBean>> R0(@Body RequestModel<RequestOnlineCouponArgs> requestModel);

    @POST("/v7/favorites/search/game_list")
    Call<ResponseModel<FavoriteGameListBean>> S(@Body RequestModel<FavoriteGameListArgs> requestModel);

    @POST("/v6/ranking/game_favorites_rank")
    Call<ResponseModel<GamelistRankingmainbean>> S0(@Body RequestModel<LuckHistoryrequest> requestModel);

    @POST("/v7/uninstall/app/reason")
    Call<ResponseModel<UninstallAppReasonBean>> T(@Body RequestModel requestModel);

    @POST("/v5/search/collectedGameSearchList")
    Call<ResponseModel<SearchGameListBean>> T0(@Body RequestModel<RequestKeywordArgs> requestModel);

    @POST("/v7/bbs/post/reply/detail_list")
    Call<ResponseModel<List<BbsCommentListBean>>> U(@Body RequestModel<RequestBbsCommentListArgs> requestModel);

    @POST("/v6/app/firstScreenAdvert")
    Call<ResponseModel<FirstScreenAdDtoData>> U0(@Body RequestModel<RequestGameIdArgs> requestModel);

    @POST("/v7/minigame/sdk_ad_cfg")
    Call<ResponseModel<MiniGameSdkDtoResponseResponseData>> V(@Body RequestModel<MiniGameSdkDtoRequestArgs> requestModel);

    @POST("/v6/game/cloudArchive/delDownloaded")
    Call<ResponseModel> V0(@Body RequestModel<ArchiveArgs> requestModel);

    @POST("/game/private/domain/info")
    Call<ResponseModel<DomainInfoBean>> W(@Body RequestModel<RequestDomainInfoArgs> requestModel);

    @POST("/v4/game/gameDownloadDetail")
    Call<ResponseModel<DataGameListBean>> W0(@Body RequestModel<QueryDownloadInfoRequestArgs> requestModel);

    @POST("/v7/game/gameSurface/recGame")
    Call<ResponseModel<List<SimulatorRecomBean>>> X(@Body RequestModel<RequestSimulatorRecomGamesArgs> requestModel);

    @POST("/v7/game/downloadRecommend")
    Call<ResponseModel<List<CommonGameInfoBean>>> X0(@Body RequestModel<QueryDownloadInfoRequestArgs> requestModel);

    @POST("/v7/game/feedback_detail")
    Call<ResponseModel<MessageDetailFeedBackBean>> Y(@Body RequestModel<MessageDetailFeedBackArgs> requestModel);

    @POST("/v9/realName/auth/check")
    Call<ResponseModel<RealNameCheckInfo>> Y0(@Body RequestModel<LuckHistoryrequest> requestModel);

    @POST("/v7/uninstall/app/reason_submit")
    Call<ResponseModel> Z(@Body RequestModel<UninstallAppReasonSubmitArgs> requestModel);

    @POST("/v6/game/cloudArchive/reportDownload")
    Call<ResponseModel> Z0(@Body RequestModel<ArchiveArgs> requestModel);

    @POST("/v7/game/feedback_user_custom_tag")
    Call<ResponseModel> a(@Body RequestModel<RequestFeedbackUserCustomTag> requestModel);

    @POST("/v7/game/feedback_reply")
    Call<ResponseModel<Boolean>> a0(@Body RequestModel<MessageDetailFeedBackArgs> requestModel);

    @POST("/v7/ranking/game_rank")
    Call<ResponseModel<RankingMainDataBean>> a1(@Body RequestModel<LuckHistoryrequest> requestModel);

    @POST("/v7/bbs/tag/list")
    Call<ResponseModel<List<BbsTagListBean>>> b(@Body RequestModel<RequestBbsTagListArgs> requestModel);

    @POST("/v7/game/list_user_custom_game_tag")
    Call<ResponseModel<ListUserCustomGameTagBean>> b0(@Body RequestModel<RequestListUserCustomGameTagArgs> requestModel);

    @POST("/v6/game/cloudArchive/communityList")
    Call<ResponseModel<List<ArchiveData>>> b1(@Body RequestModel<RequestGameIdArgs> requestModel);

    @POST("/v7/game/hot_game/list")
    Call<ResponseModel<List<CommonGameInfoBean>>> c(@Body RequestModel<RequestSimulatorRecomGamesArgs> requestModel);

    @POST("/v7/game/achievement/all_achievement")
    Call<ResponseModel<SimulatorAllAchievementBean>> c0(@Body RequestModel<RequestSimulatorAchievementListArgs> requestModel);

    @POST("/v5/personal_center/index")
    Call<ResponseModel<UserCenterBean>> c1(@Body RequestModel<RequestUserCenterArgs> requestModel);

    @POST("/v8/discover/click_menu")
    Call<ResponseModel> d(@Body RequestModel<DiscoveryHeaderMenuClickArgs> requestModel);

    @POST("/v7/bbs/resource/praise")
    Call<ResponseModel<Boolean>> d0(@Body RequestModel<RequestBbsPraiseArgs> requestModel);

    @POST("/v5/special_game_board/every_day_luck_draw")
    Call<ResponseModel<VipCenterResultData>> d1(@Body RequestModel<VipCenterRequestBean> requestModel);

    @POST("/v7/bbs/post/recommend")
    Call<ResponseModel<GameBbsPostListBean>> e(@Body RequestModel<RequestBbsRecommendArgs> requestModel);

    @POST("/v5/game/mod_game_feedback")
    Call<ResponseModel<ModFeedbackBean>> e0(@Body RequestModel<RequestModFeedbackArgs> requestModel);

    @POST("/v6/game/activity/list")
    Call<ResponseModel<NoticeListData>> e1(@Body RequestModel<RequestGameIdArgs> requestModel);

    @POST("/v7/game/endgame/user_game/list")
    Call<ResponseModel<List<UserGameListBean>>> f(@Body RequestModel<RequestGameIdArgs> requestModel);

    @POST("/v7/game/achievement/detail")
    Call<ResponseModel<SimulatorAchievementBean>> f0(@Body RequestModel<RequestSimulatorAchievementListArgs> requestModel);

    @POST("/v5/special_game_board/every_day_luck_draw_result")
    Call<ResponseModel<PrizeBean>> f1(@Body RequestModel<LuckHistoryrequest> requestModel);

    @POST("/v7/game/endgame/rangking/list")
    Call<ResponseModel<List<EndGameDetailBean.RankingListBean>>> g(@Body RequestModel<RequestEndGameDetailArgs> requestModel);

    @POST("/v7/bbs/post/detail")
    Call<ResponseModel<BbsDetailBean>> g0(@Body RequestModel<RequestBbsDetailArgs> requestModel);

    @POST("/v4/game/gameDownloadDetail")
    Call<ResponseModel<DataGameListBean>> g1(@Body RequestModel<QueryDownloadInfoRequestArgs> requestModel);

    @POST(com.join.mgps.rpc.h.L1)
    Call<ResponseModel<List<CollectionBeanSub>>> h(@Body RequestModel<RequestGameIdArgs> requestModel);

    @POST("/v1/information/comment/list")
    Call<ResponseModel<InformationCommentBackV2>> h0(@Body RequestModel<GameInformationCommentRequestV2> requestModel);

    @POST("/v5/special_game_board/every_day_luck_draw_record")
    Call<ResponseModel<LuckHistoryResult>> h1(@Body RequestModel<LuckHistoryrequest> requestModel);

    @POST("/v7/simulator/game/achievement_updates_v2")
    Call<ResponseModel<SimulatorMomentBean>> i(@Body RequestModel<RequestSimulatorMomentListArgs> requestModel);

    @POST("/v7/game/delete_user_custom_game_tag")
    Call<ResponseModel> i0(@Body RequestModel<RequestDeleteUserCustomGameTag> requestModel);

    @POST("/v4/game/myGameRecommend")
    Call<ResponseModel<DataGameListBean>> i1(@Body RequestModel<QueryDownloadInfoRequestArgs> requestModel);

    @POST("/v7/game/gameSurface")
    Call<ResponseModel<GameMainV4DataBean>> j(@Body RequestModel<RequestGameIdArgs> requestModel);

    @POST("/v7/game/endgame/ad")
    Call<ResponseModel<List<CommonGameInfoBean>>> j0(@Body RequestModel<RequestEndGameAdArgs> requestModel);

    @POST("/v5/special_game_board/every_day_luck_draw_address")
    Call<ResponseModel<PrizeBean>> j1(@Body RequestModel<LuckAddressrequest> requestModel);

    @POST("/v1/information/comment/add")
    Call<ResponseModel> k(@Body RequestModel<AddGameInformationCommentArgs> requestModel);

    @POST("/v7/home/discover/config")
    Call<ResponseModel<DiscoveryBannerBean>> k0(@Body RequestModel<RequestInfoArgs> requestModel);

    @POST("/v6/game/coupon/list")
    Call<ResponseModel<CouponListMainData>> k1(@Body RequestModel<CouponRequest> requestModel);

    @POST(com.join.mgps.rpc.h.Y1)
    Call<ResponseModel<Boolean>> l(@Body RequestModel<VideoAdWatchLogRequest> requestModel);

    @POST("/v7/bbs/post/reply")
    Call<ResponseModel<Boolean>> l0(@Body RequestModel<RequestBbsReplyArgs> requestModel);

    @POST("/v6/game/cloudArchive/updateReleased")
    Call<ResponseModel> l1(@Body RequestModel<ArchiveArgs> requestModel);

    @POST("/v7/search/pd/gameSearchList")
    Call<ResponseModel<SearchGameListBean>> m(@Body RequestModel<RequestSearchGameArgs> requestModel);

    @POST("/v7/game/unbespeak")
    Call<ResponseModel<GameBespeakBean>> m0(@Body RequestModel<RequestGameBespeakArgs> requestModel);

    @POST("/v7/home/recommend/state")
    Call<ResponseModel<PapaHomeCheckNewDataBean>> m1(@Body RequestModel<RequestOnlineCouponArgs> requestModel);

    @POST("/v7/game_detail/activity/list")
    Call<ResponseModel<NoticeListData>> n(@Body RequestModel<RequestGameIdArgs> requestModel);

    @POST("/v7/game/endgame/challenge/url")
    Call<ResponseModel> n0(@Body RequestModel<EndGameRecordArgs> requestModel);

    @POST("/v7/non_online/user/transform")
    Call<ResponseModel<OnlineCouponConfigBean>> n1(@Body RequestModel<RequestOnlineCouponArgs> requestModel);

    @POST("/v7/bbs/post/list")
    Call<ResponseModel<List<BbsListBean>>> o(@Body RequestModel<RequestBbsListArgs> requestModel);

    @POST("/v7/subject/template/index")
    Call<ResponseModel<CollectionModuleSevenBean>> o0(@Body RequestModel<CollectionModuleSevenArgs> requestModel);

    @POST(com.join.mgps.rpc.h.R)
    Call<ResponseModel<PAPAHomeBeanV6>> o1(@Body RequestModel<LuckHistoryrequest> requestModel);

    @POST("/v7/game/gameInfo")
    Call<ResponseModel<GamedetialModleFourBean>> p(@Body RequestModel<RequestGameIdArgs> requestModel);

    @POST("/v7/simulator/game/achievement/praise")
    Call<ResponseModel<Boolean>> p0(@Body RequestModel<RequestSimulatorMomentLikeArgs> requestModel);

    @POST("/v6/game/cloudArchive/communityList/v2")
    Call<ResponseModel<List<ArchiveData>>> p1(@Body RequestModel<RequestGameIdArgs> requestModel);

    @POST("/v7/game/downloadInfo")
    Call<ResponseModel<QueryDownloadInfoResponseData>> q(@Body RequestModel<QueryDownloadInfoRequestArgs> requestModel);

    @POST("/v7/game/bespeak")
    Call<ResponseModel<GameBespeakBean>> q0(@Body RequestModel<RequestGameBespeakArgs> requestModel);

    @POST("/v7/home/game_choice_ness")
    Call<ResponseModel<FindChoiceResultData>> q1(@Body RequestModel<LuckHistoryrequest> requestModel);

    @POST("/v7/game/stand_alone/cloud_archive_local_path")
    Call<ResponseModel<ArchievePathMultiBean>> r(@Body RequestModel<ArchievePathMultiArgs> requestModel);

    @POST("/v7/game/gameSurface")
    Call<ResponseModel<GameMainV4DataBean>> r0(@Body RequestModel<RequestGameIdArgs> requestModel);

    @POST("/v6_4/ranking/game_rank")
    Call<ResponseModel<RankingMainDataBean>> r1(@Body RequestModel<LuckHistoryrequest> requestModel);

    @POST("/v7/game_detail/similar_rec/list")
    Call<ResponseModel<List<CollectionBeanSub>>> s(@Body RequestModel<RequestGameIdArgs> requestModel);

    @POST("/v5/game/mod_question_collect")
    Call<ResponseModel<ModFeedbackBean>> s0(@Body RequestModel<RequestModFeedbackArgs> requestModel);

    @POST("/v7/game/stand_alone/startUpPanelRecAd")
    Call<ResponseModel<ModGameRecommendAdBean>> s1(@Body RequestModel<RequestModGameRecommendAdArgs> requestModel);

    @POST("/v7/uninstall/app/index")
    Call<ResponseModel<UninstallGuessLikeBean>> t(@Body RequestModel<UninstallGuessLikeArgs> requestModel);

    @POST("/v7/game/install")
    Call<ResponseModel<UninstallOnlineGameBean>> t0(@Body RequestModel<UninstallOnlineGameArgs> requestModel);

    @POST("/v7/search/gameSearchIndex")
    Call<ResponseModel<SearchIndexData>> t1(@Body RequestModel<RequestUidtagidTagdes> requestModel);

    @POST("/v7/simulator/game/achievement/cancel_praise")
    Call<ResponseModel<Boolean>> u(@Body RequestModel<RequestSimulatorMomentLikeArgs> requestModel);

    @POST("/v7/game/endgame/game/list")
    Call<ResponseModel<EndGameNameBean>> u0(@Body RequestModel<RequestEndGameNameListArgs> requestModel);

    @POST("/v5/search/gameSearchAuto")
    Call<ResponseModel<SearchAutoData>> u1(@Body RequestModel<RequestKeywordArgs> requestModel);

    @POST("/v7/bbs/resource/dispraise")
    Call<ResponseModel<Boolean>> v(@Body RequestModel<RequestBbsDispraiseArgs> requestModel);

    @POST("/v7/advert/generalAd")
    Call<ResponseModel<List<CommonAdBean>>> v0(@Body RequestModel<RequestCommonAdArgs> requestModel);

    @POST("/v6/game/old/gameInfo")
    Call<ResponseModel<CollectionBeanSub>> v1(@Body RequestModel<RequestGameIdArgs> requestModel);

    @POST("/v9/game/gameInfo")
    Call<ResponseModel<GameDetailDataBean>> w(@Body RequestModel<GameDetailRequest> requestModel);

    @POST("/v7/game/openserver/list")
    Call<ResponseModel<ServerListData>> w0(@Body RequestModel<RequestGameIdArgs> requestModel);

    @POST("/v9/home/home_page")
    Call<ResponseModel<PapaHomeBeanV9>> w1(@Body RequestModel<LuckHistoryrequest> requestModel);

    @POST("/v7/game/endgame/common/config")
    Call<ResponseModel<GameMainV4DataBean.EndGameConfigBean>> x(@Body RequestModel<RequestEndGameListArgs> requestModel);

    @POST("/v5/game/simulatorExitPlayPanel")
    Call<ResponseModel<SimulatorExitPlayResponseData>> x0(@Body RequestModel<SimulatorExitPlayRequestArgs> requestModel);

    @POST("/v6/home/the_new")
    Call<ResponseModel<EverdayNewResultData>> x1(@Body RequestModel<LuckHistoryrequest> requestModel);

    @POST("/v7/game/version")
    Call<ResponseModel<CheckGameVersionResponseData>> y(@Body RequestModel<CheckGameVersionRequestArgs> requestModel);

    @POST("/v8/discover/index")
    Call<ResponseModel<DiscoveryHeaderBean>> y0(@Body RequestModel<DiscoveryHeaderArgs> requestModel);

    @POST("/v7/home/home_page")
    Call<ResponseModel<PAPAHomeBeanV7>> y1(@Body RequestModel<LuckHistoryrequest> requestModel);

    @POST("/v7/game/delete_user_custom_tag")
    Call<ResponseModel> z(@Body RequestModel<RequestDeleteUserCustomTag> requestModel);

    @POST("/v7/bbs/post/reply/list")
    Call<ResponseModel<List<BbsCommentListBean>>> z0(@Body RequestModel<RequestBbsCommentListArgs> requestModel);

    @POST("/v6/game/game_type")
    Call<ResponseModel<FindChoiceResultData>> z1(@Body RequestModel<LuckHistoryrequest> requestModel);
}
