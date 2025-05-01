.class Lcom/beizi/fusion/work/a/b$2;
.super Lcom/beizi/ad/AdListener;
.source "BeiZiBannerAdWorker.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/a/b;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/a/b;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/a/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/a/b$2;->a:Lcom/beizi/fusion/work/a/b;

    invoke-direct {p0}, Lcom/beizi/ad/AdListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdClicked()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/a/b$2;->a:Lcom/beizi/fusion/work/a/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/b;->a(Lcom/beizi/fusion/work/a/b;)Lcom/beizi/ad/BannerAdView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/a/b$2;->a:Lcom/beizi/fusion/work/a/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/b;->a(Lcom/beizi/fusion/work/a/b;)Lcom/beizi/ad/BannerAdView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/ad/BannerAdView;->setTouchAreaNormal()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/a/b$2;->a:Lcom/beizi/fusion/work/a/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/b;->s(Lcom/beizi/fusion/work/a/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/work/a/b$2;->a:Lcom/beizi/fusion/work/a/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/b;->t(Lcom/beizi/fusion/work/a/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/a/b$2;->a:Lcom/beizi/fusion/work/a/b;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/a/b;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->d(Ljava/lang/String;)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/beizi/fusion/work/a/b$2;->a:Lcom/beizi/fusion/work/a/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/b;->u(Lcom/beizi/fusion/work/a/b;)V

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/a/b$2;->a:Lcom/beizi/fusion/work/a/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/b;->v(Lcom/beizi/fusion/work/a/b;)V

    return-void
.end method

.method public onAdClosed()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/a/b$2;->a:Lcom/beizi/fusion/work/a/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/b;->o(Lcom/beizi/fusion/work/a/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/a/b$2;->a:Lcom/beizi/fusion/work/a/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/b;->p(Lcom/beizi/fusion/work/a/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/a/b$2;->a:Lcom/beizi/fusion/work/a/b;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/a/b;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->c(Ljava/lang/String;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/a/b$2;->a:Lcom/beizi/fusion/work/a/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/b;->q(Lcom/beizi/fusion/work/a/b;)V

    return-void
.end method

.method public onAdFailedToLoad(I)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showBeiZiBannerAd onError:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/a/b$2;->a:Lcom/beizi/fusion/work/a/b;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lcom/beizi/fusion/work/a/b;->a(Lcom/beizi/fusion/work/a/b;Ljava/lang/String;I)V

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/work/a/b$2;->a:Lcom/beizi/fusion/work/a/b;

    invoke-static {p1}, Lcom/beizi/fusion/work/a/b;->n(Lcom/beizi/fusion/work/a/b;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 4
    iget-object p1, p0, Lcom/beizi/fusion/work/a/b$2;->a:Lcom/beizi/fusion/work/a/b;

    invoke-virtual {p1}, Lcom/beizi/fusion/work/a/b;->m()V

    :cond_0
    return-void
.end method

.method public onAdLoaded()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/a/b$2;->a:Lcom/beizi/fusion/work/a/b;

    sget-object v1, Lcom/beizi/fusion/f/a;->b:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/a/b;->a(Lcom/beizi/fusion/work/a/b;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/a/b$2;->a:Lcom/beizi/fusion/work/a/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/b;->a(Lcom/beizi/fusion/work/a/b;)Lcom/beizi/ad/BannerAdView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/ad/BannerAdView;->getPrice()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/beizi/fusion/work/a/b$2;->a:Lcom/beizi/fusion/work/a/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/b;->a(Lcom/beizi/fusion/work/a/b;)Lcom/beizi/ad/BannerAdView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beizi/ad/BannerAdView;->getPrice()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/beizi/fusion/work/a/b;->a(Lcom/beizi/fusion/work/a/b;D)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 5
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/beizi/fusion/work/a/b$2;->a:Lcom/beizi/fusion/work/a/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/b;->b(Lcom/beizi/fusion/work/a/b;)V

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/a/b$2;->a:Lcom/beizi/fusion/work/a/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/b;->c(Lcom/beizi/fusion/work/a/b;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/work/a/b$2;->a:Lcom/beizi/fusion/work/a/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/b;->d(Lcom/beizi/fusion/work/a/b;)V

    goto :goto_1

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/beizi/fusion/work/a/b$2;->a:Lcom/beizi/fusion/work/a/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/b;->e(Lcom/beizi/fusion/work/a/b;)V

    .line 9
    :goto_1
    iget-object v0, p0, Lcom/beizi/fusion/work/a/b$2;->a:Lcom/beizi/fusion/work/a/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/b;->a(Lcom/beizi/fusion/work/a/b;)Lcom/beizi/ad/BannerAdView;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/beizi/fusion/work/a/b$2;->a:Lcom/beizi/fusion/work/a/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/b;->f(Lcom/beizi/fusion/work/a/b;)Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 10
    iget-object v0, p0, Lcom/beizi/fusion/work/a/b$2;->a:Lcom/beizi/fusion/work/a/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/b;->a(Lcom/beizi/fusion/work/a/b;)Lcom/beizi/ad/BannerAdView;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/a/b$2;->a:Lcom/beizi/fusion/work/a/b;

    invoke-static {v1}, Lcom/beizi/fusion/work/a/b;->g(Lcom/beizi/fusion/work/a/b;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/ad/BannerAdView;->setOrderOptimizeList(Ljava/util/List;)V

    .line 11
    iget-object v0, p0, Lcom/beizi/fusion/work/a/b$2;->a:Lcom/beizi/fusion/work/a/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/b;->a(Lcom/beizi/fusion/work/a/b;)Lcom/beizi/ad/BannerAdView;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/a/b$2;->a:Lcom/beizi/fusion/work/a/b;

    invoke-static {v1}, Lcom/beizi/fusion/work/a/b;->f(Lcom/beizi/fusion/work/a/b;)Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->getOptimizePercent()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/beizi/ad/BannerAdView;->setAdOptimizePercent(I)V

    .line 12
    iget-object v0, p0, Lcom/beizi/fusion/work/a/b$2;->a:Lcom/beizi/fusion/work/a/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/b;->a(Lcom/beizi/fusion/work/a/b;)Lcom/beizi/ad/BannerAdView;

    move-result-object v0

    new-instance v1, Lcom/beizi/fusion/work/a/b$2$1;

    invoke-direct {v1, p0}, Lcom/beizi/fusion/work/a/b$2$1;-><init>(Lcom/beizi/fusion/work/a/b$2;)V

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->post(Ljava/lang/Runnable;)Z

    :cond_2
    return-void
.end method

.method public onAdRequest()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/a/b$2;->a:Lcom/beizi/fusion/work/a/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/b;->r(Lcom/beizi/fusion/work/a/b;)V

    return-void
.end method

.method public onAdShown()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/a/b$2;->a:Lcom/beizi/fusion/work/a/b;

    sget-object v1, Lcom/beizi/fusion/f/a;->c:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/a/b;->b(Lcom/beizi/fusion/work/a/b;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/a/b$2;->a:Lcom/beizi/fusion/work/a/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/b;->i(Lcom/beizi/fusion/work/a/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/a/b$2;->a:Lcom/beizi/fusion/work/a/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/b;->j(Lcom/beizi/fusion/work/a/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/a/b$2;->a:Lcom/beizi/fusion/work/a/b;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/a/b;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->b(Ljava/lang/String;)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/a/b$2;->a:Lcom/beizi/fusion/work/a/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/b;->k(Lcom/beizi/fusion/work/a/b;)V

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/a/b$2;->a:Lcom/beizi/fusion/work/a/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/b;->l(Lcom/beizi/fusion/work/a/b;)V

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/a/b$2;->a:Lcom/beizi/fusion/work/a/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/b;->m(Lcom/beizi/fusion/work/a/b;)V

    return-void
.end method
