.class Lcom/beizi/fusion/work/splash/a$2;
.super Ljava/lang/Object;
.source "BaiduSplashWorker.java"

# interfaces
.implements Lcom/baidu/mobads/sdk/api/SplashInteractionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/splash/a;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:Z

.field b:Z

.field final synthetic c:Lcom/beizi/fusion/work/splash/a;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/splash/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/a$2;->c:Lcom/beizi/fusion/work/splash/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/beizi/fusion/work/splash/a$2;->a:Z

    .line 3
    iput-boolean p1, p0, Lcom/beizi/fusion/work/splash/a$2;->b:Z

    return-void
.end method


# virtual methods
.method public onADLoaded()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/a$2;->c:Lcom/beizi/fusion/work/splash/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/a;->l(Lcom/beizi/fusion/work/splash/a;)Lcom/baidu/mobads/sdk/api/SplashAd;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/a$2;->c:Lcom/beizi/fusion/work/splash/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/a;->l(Lcom/beizi/fusion/work/splash/a;)Lcom/baidu/mobads/sdk/api/SplashAd;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/mobads/sdk/api/SplashAd;->getECPMLevel()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showBdSplash getECPMLevel:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/beizi/fusion/work/splash/a$2;->c:Lcom/beizi/fusion/work/splash/a;

    invoke-static {v1}, Lcom/beizi/fusion/work/splash/a;->l(Lcom/beizi/fusion/work/splash/a;)Lcom/baidu/mobads/sdk/api/SplashAd;

    move-result-object v1

    invoke-virtual {v1}, Lcom/baidu/mobads/sdk/api/SplashAd;->getECPMLevel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/a$2;->c:Lcom/beizi/fusion/work/splash/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/a;->l(Lcom/beizi/fusion/work/splash/a;)Lcom/baidu/mobads/sdk/api/SplashAd;

    move-result-object v1

    invoke-virtual {v1}, Lcom/baidu/mobads/sdk/api/SplashAd;->getECPMLevel()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/beizi/fusion/work/splash/a;->a(Lcom/beizi/fusion/work/splash/a;D)V
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
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/a$2;->c:Lcom/beizi/fusion/work/splash/a;

    sget-object v1, Lcom/beizi/fusion/f/a;->b:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/splash/a;->a(Lcom/beizi/fusion/work/splash/a;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/a$2;->c:Lcom/beizi/fusion/work/splash/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/a;->m(Lcom/beizi/fusion/work/splash/a;)V

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/a$2;->c:Lcom/beizi/fusion/work/splash/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/a;->n(Lcom/beizi/fusion/work/splash/a;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 8
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/a$2;->c:Lcom/beizi/fusion/work/splash/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/a;->o(Lcom/beizi/fusion/work/splash/a;)V

    goto :goto_1

    .line 9
    :cond_1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/a$2;->c:Lcom/beizi/fusion/work/splash/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/a;->p(Lcom/beizi/fusion/work/splash/a;)V

    :goto_1
    return-void
.end method

.method public onAdCacheFailed()V
    .locals 0

    return-void
.end method

.method public onAdCacheSuccess()V
    .locals 0

    return-void
.end method

.method public onAdClick()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/a$2;->c:Lcom/beizi/fusion/work/splash/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/a;->a(Lcom/beizi/fusion/work/splash/a;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/a$2;->c:Lcom/beizi/fusion/work/splash/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/a;->b(Lcom/beizi/fusion/work/splash/a;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/a$2;->c:Lcom/beizi/fusion/work/splash/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/a;->c(Lcom/beizi/fusion/work/splash/a;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v2, p0, Lcom/beizi/fusion/work/splash/a$2;->c:Lcom/beizi/fusion/work/splash/a;

    invoke-virtual {v2}, Lcom/beizi/fusion/work/splash/a;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/beizi/fusion/d/e;->d(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/a$2;->c:Lcom/beizi/fusion/work/splash/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/a;->e(Lcom/beizi/fusion/work/splash/a;)Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v2, 0x1388

    iget-object v4, p0, Lcom/beizi/fusion/work/splash/a$2;->c:Lcom/beizi/fusion/work/splash/a;

    invoke-static {v4}, Lcom/beizi/fusion/work/splash/a;->d(Lcom/beizi/fusion/work/splash/a;)J

    move-result-wide v4

    add-long/2addr v4, v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v4, v2

    invoke-virtual {v0, v1, v4, v5}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 4
    :cond_0
    iget-boolean v0, p0, Lcom/beizi/fusion/work/splash/a$2;->b:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/beizi/fusion/work/splash/a$2;->b:Z

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/a$2;->c:Lcom/beizi/fusion/work/splash/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/a;->f(Lcom/beizi/fusion/work/splash/a;)V

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/a$2;->c:Lcom/beizi/fusion/work/splash/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/a;->g(Lcom/beizi/fusion/work/splash/a;)V

    :cond_1
    return-void
.end method

.method public onAdDismissed()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/a$2;->c:Lcom/beizi/fusion/work/splash/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/a;->h(Lcom/beizi/fusion/work/splash/a;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/a$2;->c:Lcom/beizi/fusion/work/splash/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/a;->i(Lcom/beizi/fusion/work/splash/a;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/a$2;->c:Lcom/beizi/fusion/work/splash/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/a;->j(Lcom/beizi/fusion/work/splash/a;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/a$2;->c:Lcom/beizi/fusion/work/splash/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/a;->k(Lcom/beizi/fusion/work/splash/a;)V

    return-void
.end method

.method public onAdFailed(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showBdSplash onAdFailed:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/a$2;->c:Lcom/beizi/fusion/work/splash/a;

    const/16 v1, 0xed1

    invoke-static {v0, p1, v1}, Lcom/beizi/fusion/work/splash/a;->a(Lcom/beizi/fusion/work/splash/a;Ljava/lang/String;I)V

    return-void
.end method

.method public onAdPresent()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/a$2;->c:Lcom/beizi/fusion/work/splash/a;

    sget-object v1, Lcom/beizi/fusion/f/a;->c:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/splash/a;->b(Lcom/beizi/fusion/work/splash/a;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 2
    iget-boolean v0, p0, Lcom/beizi/fusion/work/splash/a$2;->a:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/beizi/fusion/work/splash/a$2;->a:Z

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/a$2;->c:Lcom/beizi/fusion/work/splash/a;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/splash/a;->az()V

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/a$2;->c:Lcom/beizi/fusion/work/splash/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/a;->q(Lcom/beizi/fusion/work/splash/a;)V

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/a$2;->c:Lcom/beizi/fusion/work/splash/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/a;->r(Lcom/beizi/fusion/work/splash/a;)V

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/a$2;->c:Lcom/beizi/fusion/work/splash/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/a;->s(Lcom/beizi/fusion/work/splash/a;)V

    .line 8
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/a$2;->c:Lcom/beizi/fusion/work/splash/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/a;->t(Lcom/beizi/fusion/work/splash/a;)V

    :cond_0
    return-void
.end method

.method public onLpClosed()V
    .locals 0

    return-void
.end method
