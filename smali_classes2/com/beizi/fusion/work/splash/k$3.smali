.class Lcom/beizi/fusion/work/splash/k$3;
.super Ljava/lang/Object;
.source "KsSplashWorker.java"

# interfaces
.implements Lcom/kwad/sdk/api/KsSplashScreenAd$SplashScreenAdInteractionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/splash/k;->a(Lcom/kwad/sdk/api/KsSplashScreenAd;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/splash/k;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/splash/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/k$3;->a:Lcom/beizi/fusion/work/splash/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdClicked()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$3;->a:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->f(Lcom/beizi/fusion/work/splash/k;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$3;->a:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->g(Lcom/beizi/fusion/work/splash/k;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$3;->a:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->h(Lcom/beizi/fusion/work/splash/k;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v2, p0, Lcom/beizi/fusion/work/splash/k$3;->a:Lcom/beizi/fusion/work/splash/k;

    invoke-virtual {v2}, Lcom/beizi/fusion/work/splash/k;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/beizi/fusion/d/e;->d(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$3;->a:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->j(Lcom/beizi/fusion/work/splash/k;)Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v2, 0x1388

    iget-object v4, p0, Lcom/beizi/fusion/work/splash/k$3;->a:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v4}, Lcom/beizi/fusion/work/splash/k;->i(Lcom/beizi/fusion/work/splash/k;)J

    move-result-wide v4

    add-long/2addr v4, v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v4, v2

    invoke-virtual {v0, v1, v4, v5}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$3;->a:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->k(Lcom/beizi/fusion/work/splash/k;)V

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$3;->a:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->l(Lcom/beizi/fusion/work/splash/k;)V

    return-void
.end method

.method public onAdShowEnd()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$3;->a:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->m(Lcom/beizi/fusion/work/splash/k;)V

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$3;->a:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->n(Lcom/beizi/fusion/work/splash/k;)V

    return-void
.end method

.method public onAdShowError(ILjava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showKsSplash onAdShowError:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$3;->a:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0, p2, p1}, Lcom/beizi/fusion/work/splash/k;->b(Lcom/beizi/fusion/work/splash/k;Ljava/lang/String;I)V

    return-void
.end method

.method public onAdShowStart()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$3;->a:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->o(Lcom/beizi/fusion/work/splash/k;)V

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$3;->a:Lcom/beizi/fusion/work/splash/k;

    sget-object v1, Lcom/beizi/fusion/f/a;->c:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/splash/k;->b(Lcom/beizi/fusion/work/splash/k;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$3;->a:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->p(Lcom/beizi/fusion/work/splash/k;)V

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$3;->a:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->q(Lcom/beizi/fusion/work/splash/k;)V

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$3;->a:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->r(Lcom/beizi/fusion/work/splash/k;)V

    return-void
.end method

.method public onDownloadTipsDialogCancel()V
    .locals 0

    return-void
.end method

.method public onDownloadTipsDialogDismiss()V
    .locals 0

    return-void
.end method

.method public onDownloadTipsDialogShow()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$3;->a:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->u(Lcom/beizi/fusion/work/splash/k;)V

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$3;->a:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->v(Lcom/beizi/fusion/work/splash/k;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    return-void
.end method

.method public onSkippedAd()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$3;->a:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->s(Lcom/beizi/fusion/work/splash/k;)V

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$3;->a:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->t(Lcom/beizi/fusion/work/splash/k;)V

    return-void
.end method
