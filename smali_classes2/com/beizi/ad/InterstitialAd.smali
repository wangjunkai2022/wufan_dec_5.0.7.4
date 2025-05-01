.class public final Lcom/beizi/ad/InterstitialAd;
.super Ljava/lang/Object;
.source "InterstitialAd.java"

# interfaces
.implements Lcom/beizi/ad/AdLifeControl;


# instance fields
.field private final a:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1, v1}, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;-><init>(Landroid/content/Context;ZZ)V

    iput-object v0, p0, Lcom/beizi/ad/InterstitialAd;->a:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 2

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1, p2}, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;-><init>(Landroid/content/Context;ZZ)V

    iput-object v0, p0, Lcom/beizi/ad/InterstitialAd;->a:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/InterstitialAd;->a:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->cancel()V

    return-void
.end method

.method public getAdId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/InterstitialAd;->a:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdId()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public getAdListener()Lcom/beizi/ad/AdListener;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/InterstitialAd;->a:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdListener()Lcom/beizi/ad/AdListener;

    move-result-object v0

    return-object v0
.end method

.method public getAdUnitId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/InterstitialAd;->a:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdUnitId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getMediationAdapterClassName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/InterstitialAd;->a:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getMediationAdapterClassName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getPrice()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/InterstitialAd;->a:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getPrice()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isLoaded()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/InterstitialAd;->a:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->isLoaded()Z

    move-result v0

    return v0
.end method

.method public isLoading()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/InterstitialAd;->a:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->isLoading()Z

    move-result v0

    return v0
.end method

.method public loadAd(Lcom/beizi/ad/AdRequest;)V
    .locals 1
    .annotation build Landroidx/annotation/RequiresPermission;
        value = "android.permission.INTERNET"
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/InterstitialAd;->a:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {p1}, Lcom/beizi/ad/AdRequest;->impl()Lcom/beizi/ad/internal/network/a$a;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->loadAd(Lcom/beizi/ad/internal/network/a$a;)Z

    return-void
.end method

.method public onCreateLifeCycle()V
    .locals 0

    return-void
.end method

.method public onDestoryLifeCycle()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/InterstitialAd;->a:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->onDestoryLifeCycle()V

    return-void
.end method

.method public onPauseLifeCycle()V
    .locals 0

    return-void
.end method

.method public onRestartLifeCycle()V
    .locals 0

    return-void
.end method

.method public onResumeLifeCycle()V
    .locals 0

    return-void
.end method

.method public onStartLifeCycle()V
    .locals 0

    return-void
.end method

.method public onStopLifeCycle()V
    .locals 0

    return-void
.end method

.method public openAdInNativeBrowser(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/InterstitialAd;->a:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/view/AdViewImpl;->setOpensNativeBrowser(Z)V

    return-void
.end method

.method public setAdBuyerBean(Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/InterstitialAd;->a:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->setAdBuyerBean(Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;)V

    return-void
.end method

.method public setAdListener(Lcom/beizi/ad/AdListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/InterstitialAd;->a:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/view/AdViewImpl;->setAdListener(Lcom/beizi/ad/AdListener;)V

    return-void
.end method

.method public setAdUnitId(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/InterstitialAd;->a:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/view/AdViewImpl;->setAdUnitId(Ljava/lang/String;)V

    return-void
.end method

.method public setCloseMarketDialog(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/InterstitialAd;->a:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/view/AdViewImpl;->setCloseMarketDialog(Z)V

    :cond_0
    return-void
.end method

.method public setRewardedVideoAdListener(Lcom/beizi/ad/RewardedVideoAdListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/InterstitialAd;->a:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/view/AdViewImpl;->setRewardedVideoAdListener(Lcom/beizi/ad/RewardedVideoAdListener;)V

    return-void
.end method

.method public show()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/InterstitialAd;->a:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->show()I

    return-void
.end method

.method public show(Landroid/content/Context;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/InterstitialAd;->a:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->showInterstitial(Landroid/content/Context;)V

    return-void
.end method
