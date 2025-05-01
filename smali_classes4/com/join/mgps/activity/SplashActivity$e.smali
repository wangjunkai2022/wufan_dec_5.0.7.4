.class Lcom/join/mgps/activity/SplashActivity$e;
.super Ljava/lang/Object;
.source "SplashActivity.java"

# interfaces
.implements Lcom/beizi/fusion/AdListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/SplashActivity;->K(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/SplashActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/SplashActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/SplashActivity$e;->a:Lcom/join/mgps/activity/SplashActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdClicked()V
    .locals 0

    return-void
.end method

.method public onAdClosed()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity$e;->a:Lcom/join/mgps/activity/SplashActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/SplashActivity;->o(Lcom/join/mgps/activity/SplashActivity;)V

    return-void
.end method

.method public onAdFailedToLoad(I)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onAdFailedToLoad:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/SplashActivity$e;->a:Lcom/join/mgps/activity/SplashActivity;

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object v0, Lcom/papa/sim/statistic/Event;->AdscopeSdk_No:Lcom/papa/sim/statistic/Event;

    new-instance v1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {p1, v0, v1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/SplashActivity$e;->a:Lcom/join/mgps/activity/SplashActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/SplashActivity;->i(Lcom/join/mgps/activity/SplashActivity;)V

    return-void
.end method

.method public onAdLoaded()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity$e;->a:Lcom/join/mgps/activity/SplashActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/SplashActivity;->q(Lcom/join/mgps/activity/SplashActivity;)Lcom/beizi/fusion/SplashAd;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity$e;->a:Lcom/join/mgps/activity/SplashActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/SplashActivity;->h(Lcom/join/mgps/activity/SplashActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity$e;->a:Lcom/join/mgps/activity/SplashActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/SplashActivity;->b:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity$e;->a:Lcom/join/mgps/activity/SplashActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/SplashActivity;->q(Lcom/join/mgps/activity/SplashActivity;)Lcom/beizi/fusion/SplashAd;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity$e;->a:Lcom/join/mgps/activity/SplashActivity;

    iget-object v1, v1, Lcom/join/mgps/activity/SplashActivity;->b:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/SplashAd;->show(Landroid/view/ViewGroup;)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity$e;->a:Lcom/join/mgps/activity/SplashActivity;

    invoke-static {v0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v1, Lcom/papa/sim/statistic/Event;->AdscopeSdk_Show:Lcom/papa/sim/statistic/Event;

    new-instance v2, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v2}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity$e;->a:Lcom/join/mgps/activity/SplashActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/SplashActivity;->q(Lcom/join/mgps/activity/SplashActivity;)Lcom/beizi/fusion/SplashAd;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/SplashAd;->reportNotShow()V

    :cond_1
    :goto_0
    return-void
.end method

.method public onAdShown()V
    .locals 0

    return-void
.end method

.method public onAdTick(J)V
    .locals 0

    return-void
.end method
