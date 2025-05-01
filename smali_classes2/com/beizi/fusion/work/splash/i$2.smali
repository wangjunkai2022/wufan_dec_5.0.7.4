.class Lcom/beizi/fusion/work/splash/i$2;
.super Lcom/inmobi/ads/listeners/NativeAdEventListener;
.source "InmobiSplashWorker.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/splash/i;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/splash/i;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/splash/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/i$2;->a:Lcom/beizi/fusion/work/splash/i;

    invoke-direct {p0}, Lcom/inmobi/ads/listeners/NativeAdEventListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdClicked(Lcom/inmobi/ads/InMobiNative;)V
    .locals 1
    .param p1    # Lcom/inmobi/ads/InMobiNative;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/i$2;->a:Lcom/beizi/fusion/work/splash/i;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/i;->i(Lcom/beizi/fusion/work/splash/i;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/beizi/fusion/work/splash/i$2;->a:Lcom/beizi/fusion/work/splash/i;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/i;->j(Lcom/beizi/fusion/work/splash/i;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beizi/fusion/d/e;->r()I

    move-result p1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/i$2;->a:Lcom/beizi/fusion/work/splash/i;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/i;->k(Lcom/beizi/fusion/work/splash/i;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i$2;->a:Lcom/beizi/fusion/work/splash/i;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/splash/i;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/beizi/fusion/d/e;->d(Ljava/lang/String;)V

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/i$2;->a:Lcom/beizi/fusion/work/splash/i;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/i;->l(Lcom/beizi/fusion/work/splash/i;)V

    .line 4
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/i$2;->a:Lcom/beizi/fusion/work/splash/i;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/i;->m(Lcom/beizi/fusion/work/splash/i;)V

    return-void
.end method

.method public onAdImpressed(Lcom/inmobi/ads/InMobiNative;)V
    .locals 1
    .param p1    # Lcom/inmobi/ads/InMobiNative;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/i$2;->a:Lcom/beizi/fusion/work/splash/i;

    sget-object v0, Lcom/beizi/fusion/f/a;->c:Lcom/beizi/fusion/f/a;

    invoke-static {p1, v0}, Lcom/beizi/fusion/work/splash/i;->b(Lcom/beizi/fusion/work/splash/i;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/i$2;->a:Lcom/beizi/fusion/work/splash/i;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/i;->f(Lcom/beizi/fusion/work/splash/i;)V

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/i$2;->a:Lcom/beizi/fusion/work/splash/i;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/i;->g(Lcom/beizi/fusion/work/splash/i;)V

    .line 4
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/i$2;->a:Lcom/beizi/fusion/work/splash/i;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/i;->h(Lcom/beizi/fusion/work/splash/i;)V

    return-void
.end method

.method public onAdLoadFailed(Lcom/inmobi/ads/InMobiNative;Lcom/inmobi/ads/InMobiAdRequestStatus;)V
    .locals 1
    .param p1    # Lcom/inmobi/ads/InMobiNative;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/inmobi/ads/InMobiAdRequestStatus;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "showInSplash onAdFailed:"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/inmobi/ads/InMobiAdRequestStatus;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/i$2;->a:Lcom/beizi/fusion/work/splash/i;

    invoke-virtual {p2}, Lcom/inmobi/ads/InMobiAdRequestStatus;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/inmobi/ads/InMobiAdRequestStatus;->getStatusCode()Lcom/inmobi/ads/InMobiAdRequestStatus$StatusCode;

    move-result-object p2

    invoke-virtual {p2}, Lcom/inmobi/ads/InMobiAdRequestStatus$StatusCode;->ordinal()I

    move-result p2

    invoke-static {p1, v0, p2}, Lcom/beizi/fusion/work/splash/i;->a(Lcom/beizi/fusion/work/splash/i;Ljava/lang/String;I)V

    return-void
.end method

.method public onAdLoadSucceeded(Lcom/inmobi/ads/InMobiNative;)V
    .locals 2
    .param p1    # Lcom/inmobi/ads/InMobiNative;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i$2;->a:Lcom/beizi/fusion/work/splash/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/i;->a(Lcom/beizi/fusion/work/splash/i;)V

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i$2;->a:Lcom/beizi/fusion/work/splash/i;

    sget-object v1, Lcom/beizi/fusion/f/a;->b:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/splash/i;->a(Lcom/beizi/fusion/work/splash/i;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showInSplash inMobiNative.getAdBid() = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/inmobi/ads/InMobiNative;->getAdBid()F

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p1, ",mBuyerBean = "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/beizi/fusion/work/splash/i$2;->a:Lcom/beizi/fusion/work/splash/i;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/i;->b(Lcom/beizi/fusion/work/splash/i;)Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "BeiZisBid"

    invoke-static {v0, p1}, Lcom/beizi/fusion/g/af;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/i$2;->a:Lcom/beizi/fusion/work/splash/i;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/i;->c(Lcom/beizi/fusion/work/splash/i;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 5
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/i$2;->a:Lcom/beizi/fusion/work/splash/i;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/i;->d(Lcom/beizi/fusion/work/splash/i;)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/i$2;->a:Lcom/beizi/fusion/work/splash/i;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/i;->e(Lcom/beizi/fusion/work/splash/i;)V

    :goto_0
    return-void
.end method

.method public onUserWillLeaveApplication(Lcom/inmobi/ads/InMobiNative;)V
    .locals 0

    return-void
.end method
