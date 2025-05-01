.class public Lcom/join/mgps/activity/mygame/data/DataGameListBean;
.super Ljava/lang/Object;
.source "DataGameListBean.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private gameCount:I

.field private gameList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/activity/recomend/GamedownRecomendItemBean;",
            ">;"
        }
    .end annotation
.end field

.field private jumpInfo:Lcom/join/mgps/dto/CommonGameInfoBean;

.field private pdInfo:Lcom/join/mgps/dto/DomainInfoBean;

.field private recAd:Lcom/join/mgps/dto/RecommendGameAdInfo;

.field private recommendList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/activity/recomend/GamedownRecomendItemBean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getGameCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/activity/mygame/data/DataGameListBean;->gameCount:I

    return v0
.end method

.method public getGameList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/mgps/activity/recomend/GamedownRecomendItemBean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/mygame/data/DataGameListBean;->gameList:Ljava/util/List;

    return-object v0
.end method

.method public getJumpInfo()Lcom/join/mgps/dto/CommonGameInfoBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/mygame/data/DataGameListBean;->jumpInfo:Lcom/join/mgps/dto/CommonGameInfoBean;

    return-object v0
.end method

.method public getPdInfo()Lcom/join/mgps/dto/DomainInfoBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/mygame/data/DataGameListBean;->pdInfo:Lcom/join/mgps/dto/DomainInfoBean;

    return-object v0
.end method

.method public getRecAd()Lcom/join/mgps/dto/RecommendGameAdInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/mygame/data/DataGameListBean;->recAd:Lcom/join/mgps/dto/RecommendGameAdInfo;

    return-object v0
.end method

.method public getRecommendList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/mgps/activity/recomend/GamedownRecomendItemBean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/mygame/data/DataGameListBean;->recommendList:Ljava/util/List;

    return-object v0
.end method

.method public setGameCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/activity/mygame/data/DataGameListBean;->gameCount:I

    return-void
.end method

.method public setGameList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/activity/recomend/GamedownRecomendItemBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/mygame/data/DataGameListBean;->gameList:Ljava/util/List;

    return-void
.end method

.method public setJumpInfo(Lcom/join/mgps/dto/CommonGameInfoBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/mygame/data/DataGameListBean;->jumpInfo:Lcom/join/mgps/dto/CommonGameInfoBean;

    return-void
.end method

.method public setPdInfo(Lcom/join/mgps/dto/DomainInfoBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/mygame/data/DataGameListBean;->pdInfo:Lcom/join/mgps/dto/DomainInfoBean;

    return-void
.end method

.method public setRecAd(Lcom/join/mgps/dto/RecommendGameAdInfo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/mygame/data/DataGameListBean;->recAd:Lcom/join/mgps/dto/RecommendGameAdInfo;

    return-void
.end method

.method public setRecommendList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/activity/recomend/GamedownRecomendItemBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/mygame/data/DataGameListBean;->recommendList:Ljava/util/List;

    return-void
.end method
