.class Lcom/join/mgps/activity/MyGamePapaFragment$d;
.super Ljava/lang/Object;
.source "MyGamePapaFragment.java"

# interfaces
.implements Lretrofit2/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/MyGamePapaFragment;->E0(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lretrofit2/Callback<",
        "Lcom/join/mgps/dto/ResponseModel<",
        "Lcom/join/mgps/activity/mygame/data/DataGameListBean;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Z

.field final synthetic c:Lcom/join/mgps/activity/MyGamePapaFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/MyGamePapaFragment;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFragment$d;->c:Lcom/join/mgps/activity/MyGamePapaFragment;

    iput-boolean p2, p0, Lcom/join/mgps/activity/MyGamePapaFragment$d;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/activity/mygame/data/DataGameListBean;",
            ">;>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    return-void
.end method

.method public onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/activity/mygame/data/DataGameListBean;",
            ">;>;",
            "Lretrofit2/Response<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/activity/mygame/data/DataGameListBean;",
            ">;>;)V"
        }
    .end annotation

    if-eqz p2, :cond_4

    .line 1
    :try_start_0
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/ResponseModel;

    if-eqz p1, :cond_3

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 3
    iget-boolean p2, p0, Lcom/join/mgps/activity/MyGamePapaFragment$d;->b:Z

    if-eqz p2, :cond_3

    .line 4
    iget-object p2, p0, Lcom/join/mgps/activity/MyGamePapaFragment$d;->c:Lcom/join/mgps/activity/MyGamePapaFragment;

    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/activity/mygame/data/DataGameListBean;

    iput-object v0, p2, Lcom/join/mgps/activity/MyGamePapaFragment;->U:Lcom/join/mgps/activity/mygame/data/DataGameListBean;

    .line 5
    iget-object p2, p0, Lcom/join/mgps/activity/MyGamePapaFragment$d;->c:Lcom/join/mgps/activity/MyGamePapaFragment;

    invoke-static {p2}, Lcom/join/mgps/activity/MyGamePapaFragment;->l0(Lcom/join/mgps/activity/MyGamePapaFragment;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->clear()V

    .line 6
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/activity/mygame/data/DataGameListBean;

    invoke-virtual {p2}, Lcom/join/mgps/activity/mygame/data/DataGameListBean;->getRecommendList()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_2

    const/4 v0, 0x0

    .line 7
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v1, 0x6

    if-ge v0, v1, :cond_0

    .line 8
    new-instance v1, Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/CollectionBeanSub;

    invoke-direct {v1, v2}, Lcom/join/mgps/business/CollectionBeanSubBusiness;-><init>(Lcom/join/mgps/dto/CollectionBeanSub;)V

    .line 9
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_id()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v2

    .line 10
    invoke-virtual {v1, v2}, Lcom/join/mgps/business/CollectionBeanSubBusiness;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 11
    iget-object v2, p0, Lcom/join/mgps/activity/MyGamePapaFragment$d;->c:Lcom/join/mgps/activity/MyGamePapaFragment;

    invoke-static {v2}, Lcom/join/mgps/activity/MyGamePapaFragment;->l0(Lcom/join/mgps/activity/MyGamePapaFragment;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 12
    :cond_0
    iget-object p2, p0, Lcom/join/mgps/activity/MyGamePapaFragment$d;->c:Lcom/join/mgps/activity/MyGamePapaFragment;

    invoke-static {p2}, Lcom/join/mgps/activity/MyGamePapaFragment;->m0(Lcom/join/mgps/activity/MyGamePapaFragment;)Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/join/mgps/activity/MyGamePapaFragment$d;->c:Lcom/join/mgps/activity/MyGamePapaFragment;

    invoke-static {p2}, Lcom/join/mgps/activity/MyGamePapaFragment;->m0(Lcom/join/mgps/activity/MyGamePapaFragment;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    if-nez p2, :cond_2

    .line 13
    :cond_1
    iget-object p2, p0, Lcom/join/mgps/activity/MyGamePapaFragment$d;->c:Lcom/join/mgps/activity/MyGamePapaFragment;

    invoke-virtual {p2}, Lcom/join/mgps/activity/MyGamePapaFragment;->X0()V

    .line 14
    :cond_2
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/activity/mygame/data/DataGameListBean;

    invoke-virtual {p2}, Lcom/join/mgps/activity/mygame/data/DataGameListBean;->getGameList()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 15
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 16
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment$d;->c:Lcom/join/mgps/activity/MyGamePapaFragment;

    invoke-virtual {v0, p2}, Lcom/join/mgps/activity/MyGamePapaFragment;->z1(Ljava/util/List;)V

    .line 17
    :cond_3
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/mygame/data/DataGameListBean;

    invoke-virtual {p1}, Lcom/join/mgps/activity/mygame/data/DataGameListBean;->getRecAd()Lcom/join/mgps/dto/RecommendGameAdInfo;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 18
    iget-object p2, p0, Lcom/join/mgps/activity/MyGamePapaFragment$d;->c:Lcom/join/mgps/activity/MyGamePapaFragment;

    invoke-static {p2, p1}, Lcom/join/mgps/activity/MyGamePapaFragment;->n0(Lcom/join/mgps/activity/MyGamePapaFragment;Lcom/join/mgps/dto/RecommendGameAdInfo;)Lcom/join/mgps/dto/RecommendGameAdInfo;

    .line 19
    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFragment$d;->c:Lcom/join/mgps/activity/MyGamePapaFragment;

    invoke-virtual {p1}, Lcom/join/mgps/activity/MyGamePapaFragment;->X0()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 20
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_4
    :goto_1
    return-void
.end method
