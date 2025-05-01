.class final Lcom/beizi/ad/internal/n;
.super Ljava/lang/Object;
.source "RewardedVideoAdImpl.java"

# interfaces
.implements Lcom/beizi/ad/RewardedVideoAd;


# instance fields
.field private final a:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, v2}, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;-><init>(Landroid/content/Context;ZZ)V

    iput-object v0, p0, Lcom/beizi/ad/internal/n;->a:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    return-void
.end method


# virtual methods
.method public destroy(Landroid/content/Context;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/beizi/ad/internal/n;->a:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->destroy()V

    return-void
.end method

.method public getPrice()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/n;->a:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getPrice()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getRewardedVideoAdListener()Lcom/beizi/ad/RewardedVideoAdListener;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/n;->a:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getRewaredVideoAdListener()Lcom/beizi/ad/RewardedVideoAdListener;

    move-result-object v0

    return-object v0
.end method

.method public isLoaded()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/n;->a:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->isLoaded()Z

    move-result v0

    return v0
.end method

.method public loadAd(Ljava/lang/String;Lcom/beizi/ad/AdRequest;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/beizi/ad/internal/utilities/StringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/n;->a:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/view/AdViewImpl;->setAdUnitId(Ljava/lang/String;)V

    .line 3
    iget-object p1, p0, Lcom/beizi/ad/internal/n;->a:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {p2}, Lcom/beizi/ad/AdRequest;->impl()Lcom/beizi/ad/internal/network/a$a;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->loadAd(Lcom/beizi/ad/internal/network/a$a;)Z

    return-void
.end method

.method public pause(Landroid/content/Context;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/beizi/ad/internal/n;->a:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->activityOnPause()V

    return-void
.end method

.method public resume(Landroid/content/Context;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/beizi/ad/internal/n;->a:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->activityOnResume()V

    return-void
.end method

.method public setRewardedVideoAdListener(Lcom/beizi/ad/RewardedVideoAdListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/n;->a:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/view/AdViewImpl;->setRewardedVideoAdListener(Lcom/beizi/ad/RewardedVideoAdListener;)V

    return-void
.end method

.method public show()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/n;->a:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->show()I

    return-void
.end method
