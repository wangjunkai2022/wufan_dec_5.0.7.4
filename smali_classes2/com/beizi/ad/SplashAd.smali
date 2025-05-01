.class public final Lcom/beizi/ad/SplashAd;
.super Ljava/lang/Object;
.source "SplashAd.java"

# interfaces
.implements Lcom/beizi/ad/AdLifeControl;


# instance fields
.field private final a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/view/View;Lcom/beizi/ad/AdListener;Ljava/lang/String;)V
    .locals 1
    .annotation build Landroidx/annotation/RequiresPermission;
        value = "android.permission.INTERNET"
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p2, v0, v0, v0, v0}, Landroid/view/ViewGroup;->setPadding(IIII)V

    .line 3
    new-instance v0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-direct {v0, p1, p2, p3}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/view/View;)V

    iput-object v0, p0, Lcom/beizi/ad/SplashAd;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    .line 4
    invoke-virtual {v0, p4}, Lcom/beizi/ad/internal/view/AdViewImpl;->setAdListener(Lcom/beizi/ad/AdListener;)V

    .line 5
    invoke-virtual {v0, p5}, Lcom/beizi/ad/internal/view/AdViewImpl;->setAdUnitId(Ljava/lang/String;)V

    .line 6
    new-instance p1, Lcom/beizi/ad/AdRequest$Builder;

    invoke-direct {p1}, Lcom/beizi/ad/AdRequest$Builder;-><init>()V

    invoke-virtual {p1}, Lcom/beizi/ad/AdRequest$Builder;->build()Lcom/beizi/ad/AdRequest;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beizi/ad/AdRequest;->impl()Lcom/beizi/ad/internal/network/a$a;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->loadAd(Lcom/beizi/ad/internal/network/a$a;)Z

    return-void
.end method


# virtual methods
.method public adClick()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/SplashAd;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->clickArea()V

    :cond_0
    return-void
.end method

.method public adClick(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 2

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/SplashAd;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    if-eqz v0, :cond_8

    .line 4
    new-instance v0, Lcom/beizi/ad/c/c;

    invoke-direct {v0}, Lcom/beizi/ad/c/c;-><init>()V

    .line 5
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 6
    invoke-virtual {v0, p1}, Lcom/beizi/ad/c/c;->a(Ljava/lang/String;)V

    .line 7
    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 8
    invoke-virtual {v0, p2}, Lcom/beizi/ad/c/c;->b(Ljava/lang/String;)V

    .line 9
    :cond_1
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 10
    invoke-virtual {v0, p3}, Lcom/beizi/ad/c/c;->c(Ljava/lang/String;)V

    .line 11
    :cond_2
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_3

    .line 12
    invoke-virtual {v0, p4}, Lcom/beizi/ad/c/c;->d(Ljava/lang/String;)V

    .line 13
    :cond_3
    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_4

    .line 14
    invoke-virtual {v0, p5}, Lcom/beizi/ad/c/c;->e(Ljava/lang/String;)V

    .line 15
    :cond_4
    invoke-static {p6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_5

    .line 16
    invoke-virtual {v0, p6}, Lcom/beizi/ad/c/c;->f(Ljava/lang/String;)V

    .line 17
    :cond_5
    invoke-static {p7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_6

    .line 18
    invoke-virtual {v0, p7}, Lcom/beizi/ad/c/c;->g(Ljava/lang/String;)V

    .line 19
    :cond_6
    invoke-static {p8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_7

    .line 20
    invoke-virtual {v0, p8}, Lcom/beizi/ad/c/c;->h(Ljava/lang/String;)V

    .line 21
    :cond_7
    iget-object p1, p0, Lcom/beizi/ad/SplashAd;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {p1, v0, p9}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->clickArea(Lcom/beizi/ad/c/c;I)V

    :cond_8
    return-void
.end method

.method public cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/SplashAd;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->cancel()V

    :cond_0
    return-void
.end method

.method public closeAd()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/SplashAd;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->closeAd()V

    :cond_0
    return-void
.end method

.method public disableFullClick(Landroid/view/View$OnTouchListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/SplashAd;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->disableFullClick(Landroid/view/View$OnTouchListener;)V

    :cond_0
    return-void
.end method

.method public getAdId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/SplashAd;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

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
    iget-object v0, p0, Lcom/beizi/ad/SplashAd;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdListener()Lcom/beizi/ad/AdListener;

    move-result-object v0

    return-object v0
.end method

.method public getAdUnitId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/SplashAd;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdUnitId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getPrice()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/SplashAd;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getPrice()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public isLoaded()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/SplashAd;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->isLoaded()Z

    move-result v0

    return v0
.end method

.method public isLoading()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/SplashAd;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->isLoading()Z

    move-result v0

    return v0
.end method

.method public onCreateLifeCycle()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/SplashAd;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->onCreateLifeCycle()V

    return-void
.end method

.method public onDestoryLifeCycle()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/SplashAd;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->onDestoryLifeCycle()V

    :cond_0
    return-void
.end method

.method public onPauseLifeCycle()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/SplashAd;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->onPauseLifeCycle()V

    return-void
.end method

.method public onRestartLifeCycle()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/SplashAd;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->onRestartLifeCycle()V

    return-void
.end method

.method public onResumeLifeCycle()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/SplashAd;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->onResumeLifeCycle()V

    return-void
.end method

.method public onStartLifeCycle()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/SplashAd;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->onStartLifeCycle()V

    return-void
.end method

.method public onStopLifeCycle()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/SplashAd;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->onStopLifeCycle()V

    return-void
.end method

.method public openAdInNativeBrowser(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/SplashAd;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/view/AdViewImpl;->openAdInNativeBrowser(Z)V

    return-void
.end method

.method public setAdUnitId(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/SplashAd;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/view/AdViewImpl;->setAdUnitId(Ljava/lang/String;)V

    return-void
.end method

.method public setCloseButtonPadding(IIII)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/SplashAd;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/beizi/ad/internal/view/AdViewImpl;->setCloseButtonPadding(IIII)V

    return-void
.end method

.method public setCloseMarketDialog(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/SplashAd;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/view/AdViewImpl;->setCloseMarketDialog(Z)V

    :cond_0
    return-void
.end method

.method public setScrollClick(Landroid/view/View$OnTouchListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/SplashAd;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->setScrollClick(Landroid/view/View$OnTouchListener;)V

    :cond_0
    return-void
.end method

.method public showAd()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/SplashAd;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->showAd()V

    return-void
.end method
