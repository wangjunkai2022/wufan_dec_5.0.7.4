.class public Lcom/join/mgps/dto/GameMainV4DataBean;
.super Ljava/lang/Object;
.source "GameMainV4DataBean.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/dto/GameMainV4DataBean$UserInfoBean;,
        Lcom/join/mgps/dto/GameMainV4DataBean$BoundaryBean;,
        Lcom/join/mgps/dto/GameMainV4DataBean$EndgameChallengeLevelBean;,
        Lcom/join/mgps/dto/GameMainV4DataBean$CreateEndgameHintBean;,
        Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;,
        Lcom/join/mgps/dto/GameMainV4DataBean$SimulatorCoreBean;,
        Lcom/join/mgps/dto/GameMainV4DataBean$MemberFunBean;,
        Lcom/join/mgps/dto/GameMainV4DataBean$GameRecommendInfoBean;,
        Lcom/join/mgps/dto/GameMainV4DataBean$MemberInfoBean;,
        Lcom/join/mgps/dto/GameMainV4DataBean$PlayGameInfoBean;,
        Lcom/join/mgps/dto/GameMainV4DataBean$Surface_bottom_ad;
    }
.end annotation


# instance fields
.field private achieve:Lcom/join/mgps/dto/GameMainachieve;

.field private bbs_strategy_contribute_url:Ljava/lang/String;

.field private bbs_switch:Z

.field private endgame_config:Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;

.field private gameInfo:Lcom/join/mgps/dto/GameMaingameinfo;

.field private gameMasteryLevel:Lcom/join/mgps/dto/GameMasteryLevel;

.field private jp_info:Lcom/join/mgps/dto/CommonGameInfoBean;

.field private memberFun:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/GameMainV4DataBean$MemberFunBean;",
            ">;"
        }
    .end annotation
.end field

.field private memberInfo:Lcom/join/mgps/dto/GameMainV4DataBean$MemberInfoBean;

.field private netBattle:Lcom/join/mgps/dto/GameMainNetBattle;

.field private pd_info:Lcom/join/mgps/dto/DomainInfoBean;

.field private pd_info_popup:Lcom/join/mgps/dto/DomainInfoBean;

.field private playGameInfo:Lcom/join/mgps/dto/GameMainV4DataBean$PlayGameInfoBean;

.field private recommendAdList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/RecommendAd;",
            ">;"
        }
    .end annotation
.end field

.field private recommendAdList2:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/RecommendAd;",
            ">;"
        }
    .end annotation
.end field

.field private simulator_core:Lcom/join/mgps/dto/GameMainV4DataBean$SimulatorCoreBean;

.field private surfaceBottomAd:Lcom/join/mgps/dto/GameMainV4DataBean$Surface_bottom_ad;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAchieve()Lcom/join/mgps/dto/GameMainachieve;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GameMainV4DataBean;->achieve:Lcom/join/mgps/dto/GameMainachieve;

    return-object v0
.end method

.method public getBbs_strategy_contribute_url()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GameMainV4DataBean;->bbs_strategy_contribute_url:Ljava/lang/String;

    return-object v0
.end method

.method public getEndgame_config()Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GameMainV4DataBean;->endgame_config:Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;

    return-object v0
.end method

.method public getGameInfo()Lcom/join/mgps/dto/GameMaingameinfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GameMainV4DataBean;->gameInfo:Lcom/join/mgps/dto/GameMaingameinfo;

    return-object v0
.end method

.method public getGameMasteryLevel()Lcom/join/mgps/dto/GameMasteryLevel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GameMainV4DataBean;->gameMasteryLevel:Lcom/join/mgps/dto/GameMasteryLevel;

    return-object v0
.end method

.method public getJp_info()Lcom/join/mgps/dto/CommonGameInfoBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GameMainV4DataBean;->jp_info:Lcom/join/mgps/dto/CommonGameInfoBean;

    return-object v0
.end method

.method public getMemberFun()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/GameMainV4DataBean$MemberFunBean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GameMainV4DataBean;->memberFun:Ljava/util/List;

    return-object v0
.end method

.method public getMemberInfo()Lcom/join/mgps/dto/GameMainV4DataBean$MemberInfoBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GameMainV4DataBean;->memberInfo:Lcom/join/mgps/dto/GameMainV4DataBean$MemberInfoBean;

    return-object v0
.end method

.method public getNetBattle()Lcom/join/mgps/dto/GameMainNetBattle;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GameMainV4DataBean;->netBattle:Lcom/join/mgps/dto/GameMainNetBattle;

    return-object v0
.end method

.method public getPd_info()Lcom/join/mgps/dto/DomainInfoBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GameMainV4DataBean;->pd_info:Lcom/join/mgps/dto/DomainInfoBean;

    return-object v0
.end method

.method public getPd_info_popup()Lcom/join/mgps/dto/DomainInfoBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GameMainV4DataBean;->pd_info_popup:Lcom/join/mgps/dto/DomainInfoBean;

    return-object v0
.end method

.method public getPlayGameInfo()Lcom/join/mgps/dto/GameMainV4DataBean$PlayGameInfoBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GameMainV4DataBean;->playGameInfo:Lcom/join/mgps/dto/GameMainV4DataBean$PlayGameInfoBean;

    return-object v0
.end method

.method public getRecommendAdList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/RecommendAd;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GameMainV4DataBean;->recommendAdList:Ljava/util/List;

    return-object v0
.end method

.method public getRecommendAdList2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/RecommendAd;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GameMainV4DataBean;->recommendAdList2:Ljava/util/List;

    return-object v0
.end method

.method public getSimulator_core()Lcom/join/mgps/dto/GameMainV4DataBean$SimulatorCoreBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GameMainV4DataBean;->simulator_core:Lcom/join/mgps/dto/GameMainV4DataBean$SimulatorCoreBean;

    return-object v0
.end method

.method public getSurfaceBottomAd()Lcom/join/mgps/dto/GameMainV4DataBean$Surface_bottom_ad;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GameMainV4DataBean;->surfaceBottomAd:Lcom/join/mgps/dto/GameMainV4DataBean$Surface_bottom_ad;

    return-object v0
.end method

.method public isBbs_switch()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/dto/GameMainV4DataBean;->bbs_switch:Z

    return v0
.end method

.method public setAchieve(Lcom/join/mgps/dto/GameMainachieve;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GameMainV4DataBean;->achieve:Lcom/join/mgps/dto/GameMainachieve;

    return-void
.end method

.method public setBbs_strategy_contribute_url(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GameMainV4DataBean;->bbs_strategy_contribute_url:Ljava/lang/String;

    return-void
.end method

.method public setBbs_switch(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/dto/GameMainV4DataBean;->bbs_switch:Z

    return-void
.end method

.method public setEndgame_config(Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GameMainV4DataBean;->endgame_config:Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;

    return-void
.end method

.method public setGameInfo(Lcom/join/mgps/dto/GameMaingameinfo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GameMainV4DataBean;->gameInfo:Lcom/join/mgps/dto/GameMaingameinfo;

    return-void
.end method

.method public setGameMasteryLevel(Lcom/join/mgps/dto/GameMasteryLevel;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GameMainV4DataBean;->gameMasteryLevel:Lcom/join/mgps/dto/GameMasteryLevel;

    return-void
.end method

.method public setJp_info(Lcom/join/mgps/dto/CommonGameInfoBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GameMainV4DataBean;->jp_info:Lcom/join/mgps/dto/CommonGameInfoBean;

    return-void
.end method

.method public setMemberFun(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/GameMainV4DataBean$MemberFunBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GameMainV4DataBean;->memberFun:Ljava/util/List;

    return-void
.end method

.method public setMemberInfo(Lcom/join/mgps/dto/GameMainV4DataBean$MemberInfoBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GameMainV4DataBean;->memberInfo:Lcom/join/mgps/dto/GameMainV4DataBean$MemberInfoBean;

    return-void
.end method

.method public setNetBattle(Lcom/join/mgps/dto/GameMainNetBattle;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GameMainV4DataBean;->netBattle:Lcom/join/mgps/dto/GameMainNetBattle;

    return-void
.end method

.method public setPd_info(Lcom/join/mgps/dto/DomainInfoBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GameMainV4DataBean;->pd_info:Lcom/join/mgps/dto/DomainInfoBean;

    return-void
.end method

.method public setPd_info_popup(Lcom/join/mgps/dto/DomainInfoBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GameMainV4DataBean;->pd_info_popup:Lcom/join/mgps/dto/DomainInfoBean;

    return-void
.end method

.method public setPlayGameInfo(Lcom/join/mgps/dto/GameMainV4DataBean$PlayGameInfoBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GameMainV4DataBean;->playGameInfo:Lcom/join/mgps/dto/GameMainV4DataBean$PlayGameInfoBean;

    return-void
.end method

.method public setRecommendAdList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/RecommendAd;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GameMainV4DataBean;->recommendAdList:Ljava/util/List;

    return-void
.end method

.method public setRecommendAdList2(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/RecommendAd;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GameMainV4DataBean;->recommendAdList2:Ljava/util/List;

    return-void
.end method

.method public setSimulator_core(Lcom/join/mgps/dto/GameMainV4DataBean$SimulatorCoreBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GameMainV4DataBean;->simulator_core:Lcom/join/mgps/dto/GameMainV4DataBean$SimulatorCoreBean;

    return-void
.end method

.method public setSurfaceBottomAd(Lcom/join/mgps/dto/GameMainV4DataBean$Surface_bottom_ad;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GameMainV4DataBean;->surfaceBottomAd:Lcom/join/mgps/dto/GameMainV4DataBean$Surface_bottom_ad;

    return-void
.end method
