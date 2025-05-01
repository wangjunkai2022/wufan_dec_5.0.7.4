.class Lcom/beizi/fusion/work/interstitial/a$2;
.super Lcom/beizi/ad/AdListener;
.source "BeiZiInterstitialWorker.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/interstitial/a;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/interstitial/a;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/interstitial/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-direct {p0}, Lcom/beizi/ad/AdListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdClicked()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/beizi/ad/AdListener;->onAdClicked()V

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/a;->e(Lcom/beizi/fusion/work/interstitial/a;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/a;->f(Lcom/beizi/fusion/work/interstitial/a;)Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/a;->h(Lcom/beizi/fusion/work/interstitial/a;)Lcom/beizi/fusion/b/b;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-static {v1}, Lcom/beizi/fusion/work/interstitial/a;->g(Lcom/beizi/fusion/work/interstitial/a;)Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getCallBackStrategyUuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/b/b;->P(Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/a;->i(Lcom/beizi/fusion/work/interstitial/a;)V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/a;->j(Lcom/beizi/fusion/work/interstitial/a;)V

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/a;->e(Lcom/beizi/fusion/work/interstitial/a;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/a;->k(Lcom/beizi/fusion/work/interstitial/a;)Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/a;->l(Lcom/beizi/fusion/work/interstitial/a;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/a;->m(Lcom/beizi/fusion/work/interstitial/a;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    .line 8
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/a;->n(Lcom/beizi/fusion/work/interstitial/a;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/interstitial/a;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->d(Ljava/lang/String;)V

    .line 9
    :cond_2
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/a;->o(Lcom/beizi/fusion/work/interstitial/a;)V

    .line 10
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/a;->p(Lcom/beizi/fusion/work/interstitial/a;)V

    return-void
.end method

.method public onAdClosed()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/a;->a(Lcom/beizi/fusion/work/interstitial/a;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/a;->b(Lcom/beizi/fusion/work/interstitial/a;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/a;->c(Lcom/beizi/fusion/work/interstitial/a;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/interstitial/a;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->c(Ljava/lang/String;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/a;->d(Lcom/beizi/fusion/work/interstitial/a;)V

    return-void
.end method

.method public onAdComplainResult(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Lcom/beizi/ad/AdListener;->onAdComplainResult(Ljava/lang/String;)V

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/a;->D(Lcom/beizi/fusion/work/interstitial/a;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    iget-object v1, v1, Lcom/beizi/fusion/work/interstitial/a;->n:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/beizi/fusion/g/at;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)V

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/a;->E(Lcom/beizi/fusion/work/interstitial/a;)Lcom/beizi/fusion/b/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/beizi/fusion/b/b;->S(Ljava/lang/String;)V

    .line 4
    iget-object p1, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/interstitial/a;->F(Lcom/beizi/fusion/work/interstitial/a;)V

    .line 5
    iget-object p1, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/interstitial/a;->G(Lcom/beizi/fusion/work/interstitial/a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 6
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public onAdFailedToLoad(I)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/beizi/ad/AdListener;->onAdFailedToLoad(I)V

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showBeiZiInterstitialAd onAdFailedToLoad: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lcom/beizi/fusion/work/interstitial/a;->a(Lcom/beizi/fusion/work/interstitial/a;Ljava/lang/String;I)V

    return-void
.end method

.method public onAdLoaded()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/beizi/ad/AdListener;->onAdLoaded()V

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    sget-object v1, Lcom/beizi/fusion/f/a;->b:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/interstitial/a;->b(Lcom/beizi/fusion/work/interstitial/a;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/a;->x(Lcom/beizi/fusion/work/interstitial/a;)Lcom/beizi/ad/InterstitialAd;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/ad/InterstitialAd;->getPrice()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    :try_start_0
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/a;->x(Lcom/beizi/fusion/work/interstitial/a;)Lcom/beizi/ad/InterstitialAd;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beizi/ad/InterstitialAd;->getPrice()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/beizi/fusion/work/interstitial/a;->a(Lcom/beizi/fusion/work/interstitial/a;D)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 6
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/a;->y(Lcom/beizi/fusion/work/interstitial/a;)V

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/a;->z(Lcom/beizi/fusion/work/interstitial/a;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 8
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/a;->A(Lcom/beizi/fusion/work/interstitial/a;)V

    goto :goto_1

    .line 9
    :cond_1
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/a;->B(Lcom/beizi/fusion/work/interstitial/a;)V

    .line 10
    :goto_1
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/a;->C(Lcom/beizi/fusion/work/interstitial/a;)V

    return-void
.end method

.method public onAdShown()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/beizi/ad/AdListener;->onAdShown()V

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    sget-object v1, Lcom/beizi/fusion/f/a;->c:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/interstitial/a;->a(Lcom/beizi/fusion/work/interstitial/a;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/a;->q(Lcom/beizi/fusion/work/interstitial/a;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/a;->r(Lcom/beizi/fusion/work/interstitial/a;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/a;->s(Lcom/beizi/fusion/work/interstitial/a;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/interstitial/a;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->b(Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/a;->t(Lcom/beizi/fusion/work/interstitial/a;)V

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/a;->u(Lcom/beizi/fusion/work/interstitial/a;)V

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/a;->v(Lcom/beizi/fusion/work/interstitial/a;)V

    .line 8
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/a$2;->a:Lcom/beizi/fusion/work/interstitial/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/a;->w(Lcom/beizi/fusion/work/interstitial/a;)V

    return-void
.end method
