.class public interface abstract Le2/i;
.super Ljava/lang/Object;
.source "IRpcGameClient.java"


# virtual methods
.method public abstract A(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestSearchUserCustomGameTag;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game/search_user_custom_game_tag"
    .end annotation
.end method

.method public abstract A0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/CfgInfoRequestArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/ConfigData;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v6/configure/cfg_info"
    .end annotation
.end method

.method public abstract A1(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/kotlin/ui/coupon/CouponRequest;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v6/game/take/coupon"
    .end annotation
.end method

.method public abstract B(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestModGameArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/ModGameDetailBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v6/game/cloudArchive/standAloneStartUpPanel"
    .end annotation
.end method

.method public abstract B0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/kotlin/ui/cloudarchive/data/ArchiveArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v6/game/cloudArchive/comment"
    .end annotation
.end method

.method public abstract B1(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestGameIdArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/GamedetialModleFourBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v6/game/old/gameInfo"
    .end annotation
.end method

.method public abstract C(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestEndGameReportReasonArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/EndGameReportTypeBean;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game/feedback/list"
    .end annotation
.end method

.method public abstract C0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestModGameTagArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/ModGameArchiveTagBean;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v6/game/cloudArchive/tagList"
    .end annotation
.end method

.method public abstract C1(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/GameMd5Data;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/GameMD5ResultInfo;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v4/game/fileMd5State"
    .end annotation
.end method

.method public abstract D(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/VideoAdCfgRequestArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/VideoAdCfgBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/configure/video_ad_cfg"
    .end annotation
.end method

.method public abstract D0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestGameIdArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/util/List<",
            "Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v6/game/cloudArchive/releasedList"
    .end annotation
.end method

.method public abstract E(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestMiniGameArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/mini_game/list"
    .end annotation
.end method

.method public abstract E0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/activity/vipzone/bean/SpecialgamelistRequestBean;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CollectionBeanSub;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v5/special_game_board/ranking_game_list"
    .end annotation
.end method

.method public abstract F(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestBbsCommentListArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/BbsCommentListBean;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/bbs/post/comment/list"
    .end annotation
.end method

.method public abstract F0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/kotlin/ui/findgame/data/FindClassifyResultData;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v9/game/game_type"
    .end annotation
.end method

.method public abstract G(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/FavoriteGameListArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/FavoriteGameListBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/favorites/game_list"
    .end annotation
.end method

.method public abstract G0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestGameIdArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/ArchiveDataAddPd;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v6/game/cloudArchive/communityListAddPd"
    .end annotation
.end method

.method public abstract H(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestRankingListArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CollectionBeanSub;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game_detail/ranking/list"
    .end annotation
.end method

.method public abstract H0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/activity/vipzone/bean/VipCenterRequestBean;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/activity/vipzone/bean/SpecialZoneResultbean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v5/special_game_board/index"
    .end annotation
.end method

.method public abstract I(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestEndGameTypeArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/EndGameListBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game/endgame/game_type/list"
    .end annotation
.end method

.method public abstract I0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestGameIdArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/util/List<",
            "Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v6/game/cloudArchive/downloadedList"
    .end annotation
.end method

.method public abstract J(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestSearchGameArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/SearchGameListBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7_2/search/gameSearchList"
    .end annotation
.end method

.method public abstract J0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/kotlin/ui/cloudarchive/data/ArchiveArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v6/game/cloudArchive/delReleased"
    .end annotation
.end method

.method public abstract K(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestBossListArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/BossBean;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game/endgame/boos/list"
    .end annotation
.end method

.method public abstract K0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestGameIdArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/kotlin/ui/coupon/ServerListData;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v6/game/openserver/list"
    .end annotation
.end method

.method public abstract L(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestAddUserCustomGameTag;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/ListUserCustomGameTagBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game/add_user_custom_game_tag"
    .end annotation
.end method

.method public abstract L0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/kotlin/ui/cloudarchive/data/ArchiveArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v6/game/cloudArchive/delComment"
    .end annotation
.end method

.method public abstract M(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/UninstallGuessLikeArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/UninstallGuessLikeBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/uninstall/game/index"
    .end annotation
.end method

.method public abstract M0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/activity/mygame/data/RecommendGameListBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game/myGameRecommend"
    .end annotation
.end method

.method public abstract N(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestEndGameReportReasonArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game/feedback/create"
    .end annotation
.end method

.method public abstract N0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestOnlineCouponArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/SimulatorFastEntryBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/simulatorIndex/getInfo"
    .end annotation
.end method

.method public abstract O(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestEndGameListArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/EndGameBean;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game/endgame/main/list"
    .end annotation
.end method

.method public abstract O0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/kotlin/ui/findgame/data/CategoryRequest;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/kotlin/ui/findgame/data/CategoryListMain;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v6/game/game_type_game_list"
    .end annotation
.end method

.method public abstract P(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/GameInformationCommentPraiseArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/information/comment/praise"
    .end annotation
.end method

.method public abstract P0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/activity/mygame/data/DataGameListBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v4/game/downloadRecommend"
    .end annotation
.end method

.method public abstract Q(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestCreateEndGameArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game/endgame/create"
    .end annotation
.end method

.method public abstract Q0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/kotlin/ui/userrecom/UserRecomRequestArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CollectionBeanSub;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/home/game/recommend"
    .end annotation
.end method

.method public abstract R(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestEndGameDetailArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/EndGameDetailBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game/endgame/main/detail"
    .end annotation
.end method

.method public abstract R0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestOnlineCouponArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/PapaHomeCheckNewDataBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/home/recommend/set_state"
    .end annotation
.end method

.method public abstract S(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/FavoriteGameListArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/FavoriteGameListBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/favorites/search/game_list"
    .end annotation
.end method

.method public abstract S0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/GamelistRankingmainbean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v6/ranking/game_favorites_rank"
    .end annotation
.end method

.method public abstract T(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/UninstallAppReasonBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/uninstall/app/reason"
    .end annotation
.end method

.method public abstract T0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestKeywordArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/SearchGameListBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v5/search/collectedGameSearchList"
    .end annotation
.end method

.method public abstract U(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestBbsCommentListArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/BbsCommentListBean;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/bbs/post/reply/detail_list"
    .end annotation
.end method

.method public abstract U0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestGameIdArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/FirstScreenAdDtoData;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v6/app/firstScreenAdvert"
    .end annotation
.end method

.method public abstract V(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/MiniGameSdkDtoRequestArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/MiniGameSdkDtoResponseResponseData;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/minigame/sdk_ad_cfg"
    .end annotation
.end method

.method public abstract V0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/kotlin/ui/cloudarchive/data/ArchiveArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v6/game/cloudArchive/delDownloaded"
    .end annotation
.end method

.method public abstract W(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestDomainInfoArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/DomainInfoBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/game/private/domain/info"
    .end annotation
.end method

.method public abstract W0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/activity/mygame/data/DataGameListBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v4/game/gameDownloadDetail"
    .end annotation
.end method

.method public abstract X(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestSimulatorRecomGamesArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/SimulatorRecomBean;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game/gameSurface/recGame"
    .end annotation
.end method

.method public abstract X0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game/downloadRecommend"
    .end annotation
.end method

.method public abstract Y(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/MessageDetailFeedBackArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/MessageDetailFeedBackBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game/feedback_detail"
    .end annotation
.end method

.method public abstract Y0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/papa91/common/RealNameCheckInfo;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v9/realName/auth/check"
    .end annotation
.end method

.method public abstract Z(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/UninstallAppReasonSubmitArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/uninstall/app/reason_submit"
    .end annotation
.end method

.method public abstract Z0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/kotlin/ui/cloudarchive/data/ArchiveArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v6/game/cloudArchive/reportDownload"
    .end annotation
.end method

.method public abstract a(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestFeedbackUserCustomTag;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game/feedback_user_custom_tag"
    .end annotation
.end method

.method public abstract a0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/MessageDetailFeedBackArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game/feedback_reply"
    .end annotation
.end method

.method public abstract a1(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/RankingMainDataBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/ranking/game_rank"
    .end annotation
.end method

.method public abstract b(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestBbsTagListArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/BbsTagListBean;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/bbs/tag/list"
    .end annotation
.end method

.method public abstract b0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestListUserCustomGameTagArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/ListUserCustomGameTagBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game/list_user_custom_game_tag"
    .end annotation
.end method

.method public abstract b1(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestGameIdArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/util/List<",
            "Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v6/game/cloudArchive/communityList"
    .end annotation
.end method

.method public abstract c(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestSimulatorRecomGamesArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game/hot_game/list"
    .end annotation
.end method

.method public abstract c0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestSimulatorAchievementListArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/SimulatorAllAchievementBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game/achievement/all_achievement"
    .end annotation
.end method

.method public abstract c1(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestUserCenterArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/UserCenterBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v5/personal_center/index"
    .end annotation
.end method

.method public abstract d(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/DiscoveryHeaderMenuClickArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v8/discover/click_menu"
    .end annotation
.end method

.method public abstract d0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestBbsPraiseArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/bbs/resource/praise"
    .end annotation
.end method

.method public abstract d1(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/activity/vipzone/bean/VipCenterRequestBean;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/activity/vipzone/bean/VipCenterResultData;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v5/special_game_board/every_day_luck_draw"
    .end annotation
.end method

.method public abstract e(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestBbsRecommendArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/GameBbsPostListBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/bbs/post/recommend"
    .end annotation
.end method

.method public abstract e0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestModFeedbackArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/ModFeedbackBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v5/game/mod_game_feedback"
    .end annotation
.end method

.method public abstract e1(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestGameIdArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/kotlin/ui/coupon/NoticeListData;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v6/game/activity/list"
    .end annotation
.end method

.method public abstract f(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestGameIdArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/UserGameListBean;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game/endgame/user_game/list"
    .end annotation
.end method

.method public abstract f0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestSimulatorAchievementListArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/SimulatorAchievementBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game/achievement/detail"
    .end annotation
.end method

.method public abstract f1(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/activity/vipzone/bean/PrizeBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v5/special_game_board/every_day_luck_draw_result"
    .end annotation
.end method

.method public abstract g(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestEndGameDetailArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game/endgame/rangking/list"
    .end annotation
.end method

.method public abstract g0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestBbsDetailArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/BbsDetailBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/bbs/post/detail"
    .end annotation
.end method

.method public abstract g1(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/activity/mygame/data/DataGameListBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v4/game/gameDownloadDetail"
    .end annotation
.end method

.method public abstract h(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestGameIdArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CollectionBeanSub;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game/game_tag_game_list"
    .end annotation
.end method

.method public abstract h0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/GameInformationCommentRequestV2;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/InformationCommentBackV2;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/information/comment/list"
    .end annotation
.end method

.method public abstract h1(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/activity/vipzone/bean/LuckHistoryResult;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v5/special_game_board/every_day_luck_draw_record"
    .end annotation
.end method

.method public abstract i(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestSimulatorMomentListArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/SimulatorMomentBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/simulator/game/achievement_updates_v2"
    .end annotation
.end method

.method public abstract i0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestDeleteUserCustomGameTag;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game/delete_user_custom_game_tag"
    .end annotation
.end method

.method public abstract i1(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/activity/mygame/data/DataGameListBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v4/game/myGameRecommend"
    .end annotation
.end method

.method public abstract j(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestGameIdArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/GameMainV4DataBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game/gameSurface"
    .end annotation
.end method

.method public abstract j0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestEndGameAdArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game/endgame/ad"
    .end annotation
.end method

.method public abstract j1(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/activity/vipzone/bean/LuckAddressrequest;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/activity/vipzone/bean/PrizeBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v5/special_game_board/every_day_luck_draw_address"
    .end annotation
.end method

.method public abstract k(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/AddGameInformationCommentArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v1/information/comment/add"
    .end annotation
.end method

.method public abstract k0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestInfoArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/DiscoveryBannerBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/home/discover/config"
    .end annotation
.end method

.method public abstract k1(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/kotlin/ui/coupon/CouponRequest;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/kotlin/ui/coupon/CouponListMainData;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v6/game/coupon/list"
    .end annotation
.end method

.method public abstract l(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/VideoAdWatchLogRequest;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/configure/video_ad_watch_log"
    .end annotation
.end method

.method public abstract l0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestBbsReplyArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/bbs/post/reply"
    .end annotation
.end method

.method public abstract l1(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/kotlin/ui/cloudarchive/data/ArchiveArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v6/game/cloudArchive/updateReleased"
    .end annotation
.end method

.method public abstract m(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestSearchGameArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/SearchGameListBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/search/pd/gameSearchList"
    .end annotation
.end method

.method public abstract m0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestGameBespeakArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/GameBespeakBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game/unbespeak"
    .end annotation
.end method

.method public abstract m1(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestOnlineCouponArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/PapaHomeCheckNewDataBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/home/recommend/state"
    .end annotation
.end method

.method public abstract n(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestGameIdArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/kotlin/ui/coupon/NoticeListData;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game_detail/activity/list"
    .end annotation
.end method

.method public abstract n0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/EndGameRecordArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game/endgame/challenge/url"
    .end annotation
.end method

.method public abstract n1(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestOnlineCouponArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/OnlineCouponConfigBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/non_online/user/transform"
    .end annotation
.end method

.method public abstract o(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestBbsListArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/BbsListBean;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/bbs/post/list"
    .end annotation
.end method

.method public abstract o0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/CollectionModuleSevenArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/CollectionModuleSevenBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/subject/template/index"
    .end annotation
.end method

.method public abstract o1(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/PAPAHomeBeanV6;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v6_4/home/home_page"
    .end annotation
.end method

.method public abstract p(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestGameIdArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/GamedetialModleFourBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game/gameInfo"
    .end annotation
.end method

.method public abstract p0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestSimulatorMomentLikeArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/simulator/game/achievement/praise"
    .end annotation
.end method

.method public abstract p1(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestGameIdArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/util/List<",
            "Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v6/game/cloudArchive/communityList/v2"
    .end annotation
.end method

.method public abstract q(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/QueryDownloadInfoResponseData;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game/downloadInfo"
    .end annotation
.end method

.method public abstract q0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestGameBespeakArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/GameBespeakBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game/bespeak"
    .end annotation
.end method

.method public abstract q1(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/kotlin/ui/findgame/data/FindChoiceResultData;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/home/game_choice_ness"
    .end annotation
.end method

.method public abstract r(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/ArchievePathMultiArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/ArchievePathMultiBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game/stand_alone/cloud_archive_local_path"
    .end annotation
.end method

.method public abstract r0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestGameIdArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/GameMainV4DataBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game/gameSurface"
    .end annotation
.end method

.method public abstract r1(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/RankingMainDataBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v6_4/ranking/game_rank"
    .end annotation
.end method

.method public abstract s(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestGameIdArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CollectionBeanSub;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game_detail/similar_rec/list"
    .end annotation
.end method

.method public abstract s0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestModFeedbackArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/ModFeedbackBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v5/game/mod_question_collect"
    .end annotation
.end method

.method public abstract s1(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestModGameRecommendAdArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/ModGameRecommendAdBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game/stand_alone/startUpPanelRecAd"
    .end annotation
.end method

.method public abstract t(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/UninstallGuessLikeArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/UninstallGuessLikeBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/uninstall/app/index"
    .end annotation
.end method

.method public abstract t0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/UninstallOnlineGameArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/UninstallOnlineGameBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game/install"
    .end annotation
.end method

.method public abstract t1(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestUidtagidTagdes;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/activity/search/SearchIndexData;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/search/gameSearchIndex"
    .end annotation
.end method

.method public abstract u(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestSimulatorMomentLikeArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/simulator/game/achievement/cancel_praise"
    .end annotation
.end method

.method public abstract u0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestEndGameNameListArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/EndGameNameBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game/endgame/game/list"
    .end annotation
.end method

.method public abstract u1(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestKeywordArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/activity/search/SearchAutoData;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v5/search/gameSearchAuto"
    .end annotation
.end method

.method public abstract v(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestBbsDispraiseArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/bbs/resource/dispraise"
    .end annotation
.end method

.method public abstract v0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestCommonAdArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommonAdBean;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/advert/generalAd"
    .end annotation
.end method

.method public abstract v1(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestGameIdArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/CollectionBeanSub;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v6/game/old/gameInfo"
    .end annotation
.end method

.method public abstract w(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/kotlin/discount/model/request/GameDetailRequest;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/kotlin/discount/model/bean/GameDetailDataBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v9/game/gameInfo"
    .end annotation
.end method

.method public abstract w0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestGameIdArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/kotlin/ui/coupon/ServerListData;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game/openserver/list"
    .end annotation
.end method

.method public abstract w1(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/PapaHomeBeanV9;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v9/home/home_page"
    .end annotation
.end method

.method public abstract x(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestEndGameListArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game/endgame/common/config"
    .end annotation
.end method

.method public abstract x0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/SimulatorExitPlayRequestArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/SimulatorExitPlayResponseData;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v5/game/simulatorExitPlayPanel"
    .end annotation
.end method

.method public abstract x1(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/kotlin/ui/findgame/data/EverdayNewResultData;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v6/home/the_new"
    .end annotation
.end method

.method public abstract y(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/CheckGameVersionRequestArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/CheckGameVersionResponseData;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game/version"
    .end annotation
.end method

.method public abstract y0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/DiscoveryHeaderArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/DiscoveryHeaderBean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v8/discover/index"
    .end annotation
.end method

.method public abstract y1(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/PAPAHomeBeanV7;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/home/home_page"
    .end annotation
.end method

.method public abstract z(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestDeleteUserCustomTag;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/game/delete_user_custom_tag"
    .end annotation
.end method

.method public abstract z0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/dto/RequestBbsCommentListArgs;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/BbsCommentListBean;",
            ">;>;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v7/bbs/post/reply/list"
    .end annotation
.end method

.method public abstract z1(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;
    .param p1    # Lcom/join/mgps/dto/RequestModel;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/RequestModel<",
            "Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;",
            ">;)",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/kotlin/ui/findgame/data/FindChoiceResultData;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/v6/game/game_type"
    .end annotation
.end method
