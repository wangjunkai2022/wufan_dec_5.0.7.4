.class public Lcom/aggmoread/sdk/b/k;
.super Lcom/aggmoread/sdk/b/c;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;


# instance fields
.field private b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e;


# direct methods
.method public constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/c/o/e;Lcom/aggmoread/sdk/b/d;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/aggmoread/sdk/b/c;-><init>(Lcom/aggmoread/sdk/z/c/a/a/c/a;Lcom/aggmoread/sdk/b/d;)V

    iput-object p1, p0, Lcom/aggmoread/sdk/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e;

    return-void
.end method


# virtual methods
.method protected a()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/a;->h()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bindAdToView(Landroid/content/Context;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;Ljava/util/List;Landroid/view/View;Lcom/aggmoread/sdk/client/feedlist/AMNativeInteractionListener;)Landroid/view/View;
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Lcom/aggmoread/sdk/client/feedlist/AMNativeInteractionListener;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/view/View;",
            "Landroid/widget/FrameLayout$LayoutParams;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;",
            "Landroid/view/View;",
            "Lcom/aggmoread/sdk/client/feedlist/AMNativeInteractionListener;",
            ")",
            "Landroid/view/View;"
        }
    .end annotation

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e;

    new-instance v6, Lcom/aggmoread/sdk/b/k$a;

    invoke-direct {v6, p0, p6}, Lcom/aggmoread/sdk/b/k$a;-><init>(Lcom/aggmoread/sdk/b/k;Lcom/aggmoread/sdk/client/feedlist/AMNativeInteractionListener;)V

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v6}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e;->a(Landroid/content/Context;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;Ljava/util/List;Landroid/view/View;Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public bindMediaAdToView(Lcom/aggmoread/sdk/client/AMAdMediaView;Lcom/aggmoread/sdk/client/AMAdMediaListener;)V
    .locals 2
    .param p1    # Lcom/aggmoread/sdk/client/AMAdMediaView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e;

    new-instance v1, Lcom/aggmoread/sdk/b/k$b;

    invoke-direct {v1, p0, p2}, Lcom/aggmoread/sdk/b/k$b;-><init>(Lcom/aggmoread/sdk/b/k;Lcom/aggmoread/sdk/client/AMAdMediaListener;)V

    invoke-interface {v0, p1, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e;->a(Landroid/view/ViewGroup;Lcom/aggmoread/sdk/z/c/a/a/c/t/a;)V

    return-void
.end method

.method public destroy()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e;->destroy()V

    return-void
.end method

.method public getAdPatternType()I
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e;->getAdPatternType()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return v0

    :pswitch_0
    const/4 v0, 0x1

    return v0

    :pswitch_1
    const/4 v0, 0x2

    return v0

    :pswitch_2
    const/4 v0, 0x3

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public getAppInfo()Lcom/aggmoread/sdk/client/AMAppInfo;
    .locals 15

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e;->g()Lcom/aggmoread/sdk/z/c/a/a/c/c;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e;->g()Lcom/aggmoread/sdk/z/c/a/a/c/c;

    move-result-object v0

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/c;->g()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/c;->g()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/c;->g()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/c;->g()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/aggmoread/sdk/z/c/a/a/c/c$a;

    new-instance v3, Lcom/aggmoread/sdk/client/AMAppInfo$Permission;

    iget-object v4, v2, Lcom/aggmoread/sdk/z/c/a/a/c/c$a;->a:Ljava/lang/String;

    iget-object v2, v2, Lcom/aggmoread/sdk/z/c/a/a/c/c$a;->b:Ljava/lang/String;

    invoke-direct {v3, v4, v2}, Lcom/aggmoread/sdk/client/AMAppInfo$Permission;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v7, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance v14, Lcom/aggmoread/sdk/client/AMAppInfo;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/c;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/c;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/c;->e()J

    move-result-wide v4

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/c;->h()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/c;->i()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/c;->k()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/c;->f()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/c;->c()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/c;->d()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/c;->j()Ljava/lang/String;

    move-result-object v13

    move-object v1, v14

    invoke-direct/range {v1 .. v13}, Lcom/aggmoread/sdk/client/AMAppInfo;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v14

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getAppPrice()D
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e;->getAppPrice()D

    move-result-wide v0

    return-wide v0
.end method

.method public getAppScore()I
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e;->getAppScore()I

    move-result v0

    return v0
.end method

.method public getAppStatus()I
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e;->getAppStatus()I

    move-result v0

    return v0
.end method

.method public getDesc()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e;->getDesc()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDownloadCount()J
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e;->getDownloadCount()J

    move-result-wide v0

    return-wide v0
.end method

.method public getIconUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e;->getIconUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getImageUrlList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e;->getImageUrlList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getPictureHeight()I
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e;->getPictureHeight()I

    move-result v0

    return v0
.end method

.method public getPictureWidth()I
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e;->getPictureWidth()I

    move-result v0

    return v0
.end method

.method public getProgress()I
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e;->getProgress()I

    move-result v0

    return v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e;->getTitle()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getVideoCurrentPosition()I
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e;->getVideoCurrentPosition()I

    move-result v0

    return v0
.end method

.method public getVideoDuration()I
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e;->f()I

    move-result v0

    return v0
.end method

.method public isAppAd()Z
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e;->isAppAd()Z

    move-result v0

    return v0
.end method

.method public isVideoAd()Z
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e;->isVideoAd()Z

    move-result v0

    return v0
.end method

.method public pauseVideo()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e;->pauseVideo()V

    return-void
.end method

.method public resume()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e;->resume()V

    return-void
.end method

.method public resumeVideo()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e;->resumeVideo()V

    return-void
.end method

.method public setVideoMute(Z)V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e;

    invoke-interface {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e;->setVideoMute(Z)V

    return-void
.end method

.method public startVideo()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e;->startVideo()V

    return-void
.end method

.method public stopVideo()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e;->stopVideo()V

    return-void
.end method
