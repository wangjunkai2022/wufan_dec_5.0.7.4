.class public final Lcom/aggmoread/sdk/client/AMAdLoader;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/client/AMAdLoader$IAdLoader;
    }
.end annotation


# instance fields
.field private adLoadSlot:Lcom/aggmoread/sdk/client/AMAdLoadSlot;

.field private loaderImpl:Lcom/aggmoread/sdk/client/AMAdLoader$IAdLoader;


# direct methods
.method public constructor <init>(Lcom/aggmoread/sdk/client/AMAdLoadSlot;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/aggmoread/sdk/client/AMAdLoader;->adLoadSlot:Lcom/aggmoread/sdk/client/AMAdLoadSlot;

    invoke-static {}, Lcom/aggmoread/sdk/b/a;->a()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lcom/aggmoread/sdk/client/AMAdLoader$IAdLoader;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/aggmoread/sdk/client/AMAdLoader$IAdLoader;

    iput-object p1, p0, Lcom/aggmoread/sdk/client/AMAdLoader;->loaderImpl:Lcom/aggmoread/sdk/client/AMAdLoader$IAdLoader;

    :cond_0
    return-void
.end method

.method private loadAd(Landroid/content/Context;Lcom/aggmoread/sdk/client/AMAdType;Lcom/aggmoread/sdk/client/IAMAdLoadListener;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/aggmoread/sdk/client/AMAdType;",
            "Lcom/aggmoread/sdk/client/IAMAdLoadListener<",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/aggmoread/sdk/client/AMAdLoader;->loaderImpl:Lcom/aggmoread/sdk/client/AMAdLoader$IAdLoader;

    iget-object v1, p0, Lcom/aggmoread/sdk/client/AMAdLoader;->adLoadSlot:Lcom/aggmoread/sdk/client/AMAdLoadSlot;

    invoke-interface {v0, p1, p2, v1, p3}, Lcom/aggmoread/sdk/client/AMAdLoader$IAdLoader;->loadAd(Landroid/content/Context;Lcom/aggmoread/sdk/client/AMAdType;Lcom/aggmoread/sdk/client/AMAdLoadSlot;Lcom/aggmoread/sdk/client/IAMAdLoadListener;)V

    return-void
.end method

.method private loadAndShowAd(Landroid/content/Context;Lcom/aggmoread/sdk/client/AMAdType;Lcom/aggmoread/sdk/client/IAMAdLoadListener;Lcom/aggmoread/sdk/client/IAMAdInteractionListener;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/aggmoread/sdk/client/AMAdType;",
            "Lcom/aggmoread/sdk/client/IAMAdLoadListener<",
            "*>;",
            "Lcom/aggmoread/sdk/client/IAMAdInteractionListener;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lcom/aggmoread/sdk/client/AMAdLoader;->loaderImpl:Lcom/aggmoread/sdk/client/AMAdLoader$IAdLoader;

    iget-object v3, p0, Lcom/aggmoread/sdk/client/AMAdLoader;->adLoadSlot:Lcom/aggmoread/sdk/client/AMAdLoadSlot;

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    invoke-interface/range {v0 .. v5}, Lcom/aggmoread/sdk/client/AMAdLoader$IAdLoader;->loadAndShowAd(Landroid/content/Context;Lcom/aggmoread/sdk/client/AMAdType;Lcom/aggmoread/sdk/client/AMAdLoadSlot;Lcom/aggmoread/sdk/client/IAMAdLoadListener;Lcom/aggmoread/sdk/client/IAMAdInteractionListener;)V

    return-void
.end method


# virtual methods
.method public loadAnShowRewardAd(Landroid/content/Context;Lcom/aggmoread/sdk/client/reward/AMRewardAdListener;Lcom/aggmoread/sdk/client/reward/AMRewardInteractionListener;)V
    .locals 1

    sget-object v0, Lcom/aggmoread/sdk/client/AMAdType;->REWARD:Lcom/aggmoread/sdk/client/AMAdType;

    invoke-direct {p0, p1, v0, p2, p3}, Lcom/aggmoread/sdk/client/AMAdLoader;->loadAndShowAd(Landroid/content/Context;Lcom/aggmoread/sdk/client/AMAdType;Lcom/aggmoread/sdk/client/IAMAdLoadListener;Lcom/aggmoread/sdk/client/IAMAdInteractionListener;)V

    return-void
.end method

.method public loadAndShowBannerAd(Landroid/content/Context;Lcom/aggmoread/sdk/client/banner/AMBannerAdListener;Lcom/aggmoread/sdk/client/banner/AMBannerAdInteractionListener;)V
    .locals 1

    sget-object v0, Lcom/aggmoread/sdk/client/AMAdType;->BANNER:Lcom/aggmoread/sdk/client/AMAdType;

    invoke-direct {p0, p1, v0, p2, p3}, Lcom/aggmoread/sdk/client/AMAdLoader;->loadAndShowAd(Landroid/content/Context;Lcom/aggmoread/sdk/client/AMAdType;Lcom/aggmoread/sdk/client/IAMAdLoadListener;Lcom/aggmoread/sdk/client/IAMAdInteractionListener;)V

    return-void
.end method

.method public loadAndShowDrawAd(Landroid/content/Context;Lcom/aggmoread/sdk/client/draw/AMDrawAdListener;Lcom/aggmoread/sdk/client/draw/AMDrawAdInteractionListener;)V
    .locals 1

    sget-object v0, Lcom/aggmoread/sdk/client/AMAdType;->DRAW:Lcom/aggmoread/sdk/client/AMAdType;

    invoke-direct {p0, p1, v0, p2, p3}, Lcom/aggmoread/sdk/client/AMAdLoader;->loadAndShowAd(Landroid/content/Context;Lcom/aggmoread/sdk/client/AMAdType;Lcom/aggmoread/sdk/client/IAMAdLoadListener;Lcom/aggmoread/sdk/client/IAMAdInteractionListener;)V

    return-void
.end method

.method public loadAndShowFullScreenAd(Landroid/content/Context;Lcom/aggmoread/sdk/client/fullscreen/AMFullScreenAdListener;Lcom/aggmoread/sdk/client/fullscreen/AMFullScreenAdInteractionListener;)V
    .locals 1

    sget-object v0, Lcom/aggmoread/sdk/client/AMAdType;->FULLSCREEN:Lcom/aggmoread/sdk/client/AMAdType;

    invoke-direct {p0, p1, v0, p2, p3}, Lcom/aggmoread/sdk/client/AMAdLoader;->loadAndShowAd(Landroid/content/Context;Lcom/aggmoread/sdk/client/AMAdType;Lcom/aggmoread/sdk/client/IAMAdLoadListener;Lcom/aggmoread/sdk/client/IAMAdInteractionListener;)V

    return-void
.end method

.method public loadAndShowInterstitialAd(Landroid/content/Context;Lcom/aggmoread/sdk/client/interstitial/AMInterstitialAdListener;Lcom/aggmoread/sdk/client/interstitial/AMInterstitialAdInteractionListener;)V
    .locals 1

    sget-object v0, Lcom/aggmoread/sdk/client/AMAdType;->INTERSTITIAL:Lcom/aggmoread/sdk/client/AMAdType;

    invoke-direct {p0, p1, v0, p2, p3}, Lcom/aggmoread/sdk/client/AMAdLoader;->loadAndShowAd(Landroid/content/Context;Lcom/aggmoread/sdk/client/AMAdType;Lcom/aggmoread/sdk/client/IAMAdLoadListener;Lcom/aggmoread/sdk/client/IAMAdInteractionListener;)V

    return-void
.end method

.method public loadAndShowSplashAd(Landroid/content/Context;Lcom/aggmoread/sdk/client/splash/AMSplashAdListener;Lcom/aggmoread/sdk/client/splash/AMSplashInteractionListener;)V
    .locals 1

    sget-object v0, Lcom/aggmoread/sdk/client/AMAdType;->SPLASH:Lcom/aggmoread/sdk/client/AMAdType;

    invoke-direct {p0, p1, v0, p2, p3}, Lcom/aggmoread/sdk/client/AMAdLoader;->loadAndShowAd(Landroid/content/Context;Lcom/aggmoread/sdk/client/AMAdType;Lcom/aggmoread/sdk/client/IAMAdLoadListener;Lcom/aggmoread/sdk/client/IAMAdInteractionListener;)V

    return-void
.end method

.method public loadBannerAd(Landroid/content/Context;Lcom/aggmoread/sdk/client/banner/AMBannerAdListener;)V
    .locals 1

    sget-object v0, Lcom/aggmoread/sdk/client/AMAdType;->BANNER:Lcom/aggmoread/sdk/client/AMAdType;

    invoke-direct {p0, p1, v0, p2}, Lcom/aggmoread/sdk/client/AMAdLoader;->loadAd(Landroid/content/Context;Lcom/aggmoread/sdk/client/AMAdType;Lcom/aggmoread/sdk/client/IAMAdLoadListener;)V

    return-void
.end method

.method public loadDrawAd(Landroid/content/Context;Lcom/aggmoread/sdk/client/draw/AMDrawAdListener;)V
    .locals 1

    sget-object v0, Lcom/aggmoread/sdk/client/AMAdType;->DRAW:Lcom/aggmoread/sdk/client/AMAdType;

    invoke-direct {p0, p1, v0, p2}, Lcom/aggmoread/sdk/client/AMAdLoader;->loadAd(Landroid/content/Context;Lcom/aggmoread/sdk/client/AMAdType;Lcom/aggmoread/sdk/client/IAMAdLoadListener;)V

    return-void
.end method

.method public loadExpressAd(Landroid/content/Context;Lcom/aggmoread/sdk/client/feedlist/AMExpressAdListener;)V
    .locals 1

    sget-object v0, Lcom/aggmoread/sdk/client/AMAdType;->EXPRESS_INFORMATION_FLOW:Lcom/aggmoread/sdk/client/AMAdType;

    invoke-direct {p0, p1, v0, p2}, Lcom/aggmoread/sdk/client/AMAdLoader;->loadAd(Landroid/content/Context;Lcom/aggmoread/sdk/client/AMAdType;Lcom/aggmoread/sdk/client/IAMAdLoadListener;)V

    return-void
.end method

.method public loadFullScreenAd(Landroid/content/Context;Lcom/aggmoread/sdk/client/fullscreen/AMFullScreenAdListener;)V
    .locals 1

    sget-object v0, Lcom/aggmoread/sdk/client/AMAdType;->FULLSCREEN:Lcom/aggmoread/sdk/client/AMAdType;

    invoke-direct {p0, p1, v0, p2}, Lcom/aggmoread/sdk/client/AMAdLoader;->loadAd(Landroid/content/Context;Lcom/aggmoread/sdk/client/AMAdType;Lcom/aggmoread/sdk/client/IAMAdLoadListener;)V

    return-void
.end method

.method public loadInterstitialAd(Landroid/content/Context;Lcom/aggmoread/sdk/client/interstitial/AMInterstitialAdListener;)V
    .locals 1

    sget-object v0, Lcom/aggmoread/sdk/client/AMAdType;->INTERSTITIAL:Lcom/aggmoread/sdk/client/AMAdType;

    invoke-direct {p0, p1, v0, p2}, Lcom/aggmoread/sdk/client/AMAdLoader;->loadAd(Landroid/content/Context;Lcom/aggmoread/sdk/client/AMAdType;Lcom/aggmoread/sdk/client/IAMAdLoadListener;)V

    return-void
.end method

.method public loadNativeAd(Landroid/content/Context;Lcom/aggmoread/sdk/client/feedlist/AMNativeAdListener;)V
    .locals 1

    sget-object v0, Lcom/aggmoread/sdk/client/AMAdType;->INFORMATION_FLOW:Lcom/aggmoread/sdk/client/AMAdType;

    invoke-direct {p0, p1, v0, p2}, Lcom/aggmoread/sdk/client/AMAdLoader;->loadAd(Landroid/content/Context;Lcom/aggmoread/sdk/client/AMAdType;Lcom/aggmoread/sdk/client/IAMAdLoadListener;)V

    return-void
.end method

.method public loadRewardAd(Landroid/content/Context;Lcom/aggmoread/sdk/client/reward/AMRewardAdListener;)V
    .locals 1

    sget-object v0, Lcom/aggmoread/sdk/client/AMAdType;->REWARD:Lcom/aggmoread/sdk/client/AMAdType;

    invoke-direct {p0, p1, v0, p2}, Lcom/aggmoread/sdk/client/AMAdLoader;->loadAd(Landroid/content/Context;Lcom/aggmoread/sdk/client/AMAdType;Lcom/aggmoread/sdk/client/IAMAdLoadListener;)V

    return-void
.end method

.method public loadSplashAd(Landroid/content/Context;Lcom/aggmoread/sdk/client/splash/AMSplashAdListener;)V
    .locals 1

    sget-object v0, Lcom/aggmoread/sdk/client/AMAdType;->SPLASH:Lcom/aggmoread/sdk/client/AMAdType;

    invoke-direct {p0, p1, v0, p2}, Lcom/aggmoread/sdk/client/AMAdLoader;->loadAd(Landroid/content/Context;Lcom/aggmoread/sdk/client/AMAdType;Lcom/aggmoread/sdk/client/IAMAdLoadListener;)V

    return-void
.end method
