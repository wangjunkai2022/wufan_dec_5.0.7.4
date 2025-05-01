.class Lcom/beizi/fusion/work/splash/b$3;
.super Lcom/beizi/ad/AdListener;
.source "BeiZiSplashWorker.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/splash/b;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:Z

.field final synthetic b:Lcom/beizi/fusion/work/splash/b;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/splash/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-direct {p0}, Lcom/beizi/ad/AdListener;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/beizi/fusion/work/splash/b$3;->a:Z

    return-void
.end method


# virtual methods
.method public onAdClicked()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->u(Lcom/beizi/fusion/work/splash/b;)Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "uniteTime"

    invoke-static {v0, v2, v1}, Lcom/beizi/fusion/g/at;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 2
    :try_start_0
    iget-object v2, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v2}, Lcom/beizi/fusion/work/splash/b;->v(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getCallBackStrategy()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 3
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-lez v3, :cond_1

    const/4 v3, 0x0

    .line 4
    :goto_0
    :try_start_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_2

    .line 5
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/beizi/fusion/model/AdSpacesBean$CallBackStrategyBean;

    const-string v5, "290.300"

    .line 6
    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$CallBackStrategyBean;->getEventCode()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 7
    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$CallBackStrategyBean;->getRate()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Lcom/beizi/fusion/g/al;->a(I)Z

    move-result v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catch_0
    move-exception v2

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    goto :goto_2

    :catch_1
    move-exception v2

    const/4 v0, 0x0

    .line 8
    :goto_1
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    :cond_2
    :goto_2
    if-eqz v0, :cond_3

    .line 9
    iget-object v2, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v2}, Lcom/beizi/fusion/work/splash/b;->w(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 10
    iget-object v2, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v2}, Lcom/beizi/fusion/work/splash/b;->y(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/fusion/b/b;

    move-result-object v2

    iget-object v3, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v3}, Lcom/beizi/fusion/work/splash/b;->x(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    move-result-object v3

    invoke-virtual {v3}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getCallBackStrategyUuid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/beizi/fusion/b/b;->P(Ljava/lang/String;)V

    .line 11
    iget-object v2, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v2}, Lcom/beizi/fusion/work/splash/b;->z(Lcom/beizi/fusion/work/splash/b;)V

    .line 12
    :cond_3
    iget-object v2, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v2}, Lcom/beizi/fusion/work/splash/b;->A(Lcom/beizi/fusion/work/splash/b;)V

    if-eqz v0, :cond_4

    if-nez v1, :cond_4

    return-void

    .line 13
    :cond_4
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->B(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 14
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->C(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/splash/b;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->d(Ljava/lang/String;)V

    .line 15
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->D(Lcom/beizi/fusion/work/splash/b;)V

    .line 16
    :cond_5
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->E(Lcom/beizi/fusion/work/splash/b;)V

    return-void
.end method

.method public onAdClosed()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->m(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->n(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/splash/b;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->c(Ljava/lang/String;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->o(Lcom/beizi/fusion/work/splash/b;)V

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->p(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/fusion/g/ar;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->p(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/fusion/g/ar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/g/ar;->c()V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->q(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/fusion/g/am;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->q(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/fusion/g/am;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/g/am;->a()V

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->r(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/fusion/g/ap;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 9
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->r(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/fusion/g/ap;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/g/ap;->b()V

    .line 10
    :cond_3
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->s(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/fusion/g/an;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 11
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->s(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/fusion/g/an;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/g/an;->b()V

    .line 12
    :cond_4
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->t(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/fusion/g/x;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 13
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->t(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/fusion/g/x;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/g/x;->b()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_5
    :goto_0
    return-void
.end method

.method public onAdFailedToLoad(I)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showBeiZiSplash onAdFailedToLoad:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lcom/beizi/fusion/work/splash/b;->a(Lcom/beizi/fusion/work/splash/b;Ljava/lang/String;I)V

    return-void
.end method

.method public onAdLoaded()V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showBeiZiSplash onAdLoaded:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    sget-object v1, Lcom/beizi/fusion/f/a;->b:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/splash/b;->a(Lcom/beizi/fusion/work/splash/b;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->a(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/ad/SplashAd;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/ad/SplashAd;->getPrice()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    :try_start_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->a(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/ad/SplashAd;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beizi/ad/SplashAd;->getPrice()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/beizi/fusion/work/splash/b;->a(Lcom/beizi/fusion/work/splash/b;D)V
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
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->b(Lcom/beizi/fusion/work/splash/b;)V

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->c(Lcom/beizi/fusion/work/splash/b;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 8
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->d(Lcom/beizi/fusion/work/splash/b;)V

    goto :goto_1

    .line 9
    :cond_1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->e(Lcom/beizi/fusion/work/splash/b;)V

    :goto_1
    return-void
.end method

.method public onAdShown()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    sget-object v1, Lcom/beizi/fusion/f/a;->c:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/splash/b;->b(Lcom/beizi/fusion/work/splash/b;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->f(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->g(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->h(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/splash/b;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->b(Ljava/lang/String;)V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->i(Lcom/beizi/fusion/work/splash/b;)V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->j(Lcom/beizi/fusion/work/splash/b;)V

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->k(Lcom/beizi/fusion/work/splash/b;)V

    .line 8
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->l(Lcom/beizi/fusion/work/splash/b;)V

    return-void
.end method

.method public onAdTick(J)V
    .locals 8

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lcom/beizi/fusion/work/splash/b$3;->a:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->F(Lcom/beizi/fusion/work/splash/b;)V

    .line 3
    iput-boolean v1, p0, Lcom/beizi/fusion/work/splash/b$3;->a:Z

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->G(Lcom/beizi/fusion/work/splash/b;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->H(Lcom/beizi/fusion/work/splash/b;)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-lez v0, :cond_4

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->H(Lcom/beizi/fusion/work/splash/b;)J

    move-result-wide v2

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->I(Lcom/beizi/fusion/work/splash/b;)J

    move-result-wide v6

    cmp-long v0, v2, v6

    if-gtz v0, :cond_4

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->J(Lcom/beizi/fusion/work/splash/b;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->K(Lcom/beizi/fusion/work/splash/b;)J

    move-result-wide v6

    cmp-long v0, v6, v4

    if-lez v0, :cond_1

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->K(Lcom/beizi/fusion/work/splash/b;)J

    move-result-wide v3

    cmp-long v0, p1, v3

    if-lez v0, :cond_1

    .line 8
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/splash/b;->a(Lcom/beizi/fusion/work/splash/b;Z)Z

    .line 9
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->L(Lcom/beizi/fusion/work/splash/b;)Landroid/view/View;

    move-result-object v0

    const v3, 0x3e4ccccd    # 0.2f

    invoke-virtual {v0, v3}, Landroid/view/View;->setAlpha(F)V

    goto :goto_0

    .line 10
    :cond_1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0, v2}, Lcom/beizi/fusion/work/splash/b;->a(Lcom/beizi/fusion/work/splash/b;Z)Z

    .line 11
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->L(Lcom/beizi/fusion/work/splash/b;)Landroid/view/View;

    move-result-object v0

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v0, v3}, Landroid/view/View;->setAlpha(F)V

    .line 12
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->H(Lcom/beizi/fusion/work/splash/b;)J

    move-result-wide v3

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->I(Lcom/beizi/fusion/work/splash/b;)J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-nez v0, :cond_3

    .line 13
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->L(Lcom/beizi/fusion/work/splash/b;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setEnabled(Z)V

    goto :goto_1

    .line 14
    :cond_3
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->L(Lcom/beizi/fusion/work/splash/b;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 15
    :cond_4
    :goto_1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    long-to-float v1, p1

    const/high16 v2, 0x447a0000    # 1000.0f

    div-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/splash/b;->b(Lcom/beizi/fusion/work/splash/b;I)V

    .line 16
    :cond_5
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->M(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->N(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_6

    .line 17
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$3;->b:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->O(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/beizi/fusion/d/e;->a(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_6
    :goto_2
    return-void
.end method
