.class public final Lcom/beizi/ad/BannerAdView;
.super Lcom/beizi/ad/b;
.source "BannerAdView.java"


# instance fields
.field private b:I

.field private c:I

.field private d:Ljava/lang/String;

.field private e:I

.field private f:Ljava/lang/String;

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field

.field private h:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/beizi/ad/internal/j;->b:Lcom/beizi/ad/internal/j;

    invoke-direct {p0, p1, v0}, Lcom/beizi/ad/b;-><init>(Landroid/content/Context;Lcom/beizi/ad/internal/j;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget-object v0, Lcom/beizi/ad/internal/j;->b:Lcom/beizi/ad/internal/j;

    invoke-direct {p0, p1, p2, v0}, Lcom/beizi/ad/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;Lcom/beizi/ad/internal/j;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 3
    sget-object v0, Lcom/beizi/ad/internal/j;->b:Lcom/beizi/ad/internal/j;

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/beizi/ad/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/beizi/ad/internal/j;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic cancel()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/beizi/ad/b;->cancel()V

    return-void
.end method

.method public bridge synthetic getAdListener()Lcom/beizi/ad/AdListener;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/beizi/ad/b;->getAdListener()Lcom/beizi/ad/AdListener;

    move-result-object v0

    return-object v0
.end method

.method public getAdOptimizePercent()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/ad/BannerAdView;->b:I

    return v0
.end method

.method public getAdOptimizeSize()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/ad/BannerAdView;->c:I

    return v0
.end method

.method public bridge synthetic getAdSize()Lcom/beizi/ad/a;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/beizi/ad/b;->getAdSize()Lcom/beizi/ad/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getAdUnitId()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/beizi/ad/b;->getAdUnitId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDirection()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/BannerAdView;->f:Ljava/lang/String;

    return-object v0
.end method

.method public getOrderOptimizeList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/BannerAdView;->g:Ljava/util/List;

    return-object v0
.end method

.method public bridge synthetic getPrice()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/beizi/ad/b;->getPrice()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getResizeAdToFitContainer()Z
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/beizi/ad/b;->getResizeAdToFitContainer()Z

    move-result v0

    return v0
.end method

.method public getScrollDistance()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/BannerAdView;->d:Ljava/lang/String;

    return-object v0
.end method

.method public getScrollDistancePercent()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/ad/BannerAdView;->e:I

    return v0
.end method

.method public getValidOptimizePercent()I
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/b;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    const/4 v1, -0x1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getLandingPageUrl()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/b;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getLandingPageUrl()Ljava/lang/String;

    move-result-object v0

    .line 3
    iget-object v2, p0, Lcom/beizi/ad/BannerAdView;->g:Ljava/util/List;

    if-eqz v2, :cond_1

    .line 4
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, -0x1

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/util/Pair;

    .line 5
    iget-object v5, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v5, Ljava/lang/CharSequence;

    invoke-virtual {v0, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 6
    iget-object v3, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_0

    :cond_1
    const/4 v3, -0x1

    :cond_2
    if-ne v3, v1, :cond_3

    .line 7
    iget v3, p0, Lcom/beizi/ad/BannerAdView;->b:I

    :cond_3
    return v3
.end method

.method public bridge synthetic isAutoRefresh()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/beizi/ad/b;->isAutoRefresh()V

    return-void
.end method

.method public bridge synthetic isLoading()Z
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/beizi/ad/b;->isLoading()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic loadAd(Lcom/beizi/ad/AdRequest;)V
    .locals 0
    .annotation build Landroidx/annotation/RequiresPermission;
        value = "android.permission.INTERNET"
    .end annotation

    .line 1
    invoke-super {p0, p1}, Lcom/beizi/ad/b;->loadAd(Lcom/beizi/ad/AdRequest;)V

    return-void
.end method

.method public bridge synthetic onCreateLifeCycle()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/beizi/ad/b;->onCreateLifeCycle()V

    return-void
.end method

.method public bridge synthetic onDestoryLifeCycle()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/beizi/ad/b;->onDestoryLifeCycle()V

    return-void
.end method

.method public bridge synthetic onPauseLifeCycle()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/beizi/ad/b;->onPauseLifeCycle()V

    return-void
.end method

.method public bridge synthetic onRestartLifeCycle()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/beizi/ad/b;->onRestartLifeCycle()V

    return-void
.end method

.method public bridge synthetic onResumeLifeCycle()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/beizi/ad/b;->onResumeLifeCycle()V

    return-void
.end method

.method public bridge synthetic onStartLifeCycle()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/beizi/ad/b;->onStartLifeCycle()V

    return-void
.end method

.method public bridge synthetic onStopLifeCycle()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/beizi/ad/b;->onStopLifeCycle()V

    return-void
.end method

.method public bridge synthetic openAdInNativeBrowser(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/beizi/ad/b;->openAdInNativeBrowser(Z)V

    return-void
.end method

.method public optimizeClickArea(ILandroid/view/View;Landroid/view/View;Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/beizi/ad/BannerAdView;->getValidOptimizePercent()I

    move-result v0

    .line 2
    invoke-static {v0}, Lcom/beizi/ad/lance/a/o;->a(I)Z

    move-result v1

    .line 3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "percent = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ",isPass = "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "BeiZisAd"

    invoke-static {v2, v0}, Lcom/beizi/ad/lance/a/l;->c(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v1, :cond_0

    .line 4
    invoke-static {p1, p2, p3, p4}, Lcom/beizi/ad/lance/a/g;->a(ILandroid/view/View;Landroid/view/View;Ljava/lang/String;)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/beizi/ad/BannerAdView;->h:Landroid/view/View;

    :cond_0
    return-void
.end method

.method public bridge synthetic resume()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/beizi/ad/b;->resume()V

    return-void
.end method

.method public bridge synthetic setAdListener(Lcom/beizi/ad/AdListener;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/beizi/ad/b;->setAdListener(Lcom/beizi/ad/AdListener;)V

    return-void
.end method

.method public setAdOptimizePercent(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/ad/BannerAdView;->b:I

    return-void
.end method

.method public setAdOptimizeSize(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/ad/BannerAdView;->c:I

    return-void
.end method

.method public bridge synthetic setAdUnitId(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/beizi/ad/b;->setAdUnitId(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setAutoRefresh(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/beizi/ad/b;->setAutoRefresh(Z)V

    return-void
.end method

.method public bridge synthetic setCloseMarketDialog(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/beizi/ad/b;->setCloseMarketDialog(Z)V

    return-void
.end method

.method public setDirection(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/BannerAdView;->f:Ljava/lang/String;

    return-void
.end method

.method public setOrderOptimizeList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/BannerAdView;->g:Ljava/util/List;

    return-void
.end method

.method public bridge synthetic setResizeAdToFitContainer(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/beizi/ad/b;->setResizeAdToFitContainer(Z)V

    return-void
.end method

.method public setScrollDistance(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/BannerAdView;->d:Ljava/lang/String;

    return-void
.end method

.method public setScrollDistancePercent(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/ad/BannerAdView;->e:I

    return-void
.end method

.method public setTouchAreaNormal()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/BannerAdView;->h:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 2
    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/ViewUtil;->removeChildFromParent(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic setTransitionDerection(Lcom/beizi/ad/internal/animation/TransitionDirection;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/beizi/ad/b;->setTransitionDerection(Lcom/beizi/ad/internal/animation/TransitionDirection;)V

    return-void
.end method

.method public bridge synthetic setTransitionDuration(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/beizi/ad/b;->setTransitionDuration(I)V

    return-void
.end method

.method public bridge synthetic setTransitionType(Lcom/beizi/ad/internal/animation/TransitionType;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/beizi/ad/b;->setTransitionType(Lcom/beizi/ad/internal/animation/TransitionType;)V

    return-void
.end method
