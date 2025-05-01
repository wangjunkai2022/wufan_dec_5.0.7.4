.class Lcom/beizi/fusion/work/splash/j$2;
.super Ljava/lang/Object;
.source "JadYunSplashWorker.java"

# interfaces
.implements Lcom/jd/ad/sdk/splash/JADSplashListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/splash/j;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:Z

.field b:Z

.field final synthetic c:Lcom/beizi/fusion/work/splash/j;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/splash/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/j$2;->c:Lcom/beizi/fusion/work/splash/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/beizi/fusion/work/splash/j$2;->a:Z

    .line 3
    iput-boolean p1, p0, Lcom/beizi/fusion/work/splash/j$2;->b:Z

    return-void
.end method


# virtual methods
.method public onClick()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/j$2;->c:Lcom/beizi/fusion/work/splash/j;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/j;->j(Lcom/beizi/fusion/work/splash/j;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/j$2;->c:Lcom/beizi/fusion/work/splash/j;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/j;->k(Lcom/beizi/fusion/work/splash/j;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/j$2;->c:Lcom/beizi/fusion/work/splash/j;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/j;->l(Lcom/beizi/fusion/work/splash/j;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v2, p0, Lcom/beizi/fusion/work/splash/j$2;->c:Lcom/beizi/fusion/work/splash/j;

    invoke-virtual {v2}, Lcom/beizi/fusion/work/splash/j;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/beizi/fusion/d/e;->d(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/j$2;->c:Lcom/beizi/fusion/work/splash/j;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/j;->n(Lcom/beizi/fusion/work/splash/j;)Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v2, 0x1388

    iget-object v4, p0, Lcom/beizi/fusion/work/splash/j$2;->c:Lcom/beizi/fusion/work/splash/j;

    invoke-static {v4}, Lcom/beizi/fusion/work/splash/j;->m(Lcom/beizi/fusion/work/splash/j;)J

    move-result-wide v4

    add-long/2addr v4, v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v4, v2

    invoke-virtual {v0, v1, v4, v5}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 4
    :cond_0
    iget-boolean v0, p0, Lcom/beizi/fusion/work/splash/j$2;->b:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/beizi/fusion/work/splash/j$2;->b:Z

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/j$2;->c:Lcom/beizi/fusion/work/splash/j;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/j;->o(Lcom/beizi/fusion/work/splash/j;)V

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/j$2;->c:Lcom/beizi/fusion/work/splash/j;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/j;->p(Lcom/beizi/fusion/work/splash/j;)V

    :cond_1
    return-void
.end method

.method public onClose()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/j$2;->c:Lcom/beizi/fusion/work/splash/j;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/j;->q(Lcom/beizi/fusion/work/splash/j;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/j$2;->c:Lcom/beizi/fusion/work/splash/j;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/j;->r(Lcom/beizi/fusion/work/splash/j;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/j$2;->c:Lcom/beizi/fusion/work/splash/j;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/j;->s(Lcom/beizi/fusion/work/splash/j;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/j$2;->c:Lcom/beizi/fusion/work/splash/j;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/j;->t(Lcom/beizi/fusion/work/splash/j;)V

    return-void
.end method

.method public onExposure()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/j$2;->c:Lcom/beizi/fusion/work/splash/j;

    sget-object v1, Lcom/beizi/fusion/f/a;->c:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/splash/j;->b(Lcom/beizi/fusion/work/splash/j;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 2
    iget-boolean v0, p0, Lcom/beizi/fusion/work/splash/j$2;->a:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/beizi/fusion/work/splash/j$2;->a:Z

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/j$2;->c:Lcom/beizi/fusion/work/splash/j;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/a;->az()V

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/j$2;->c:Lcom/beizi/fusion/work/splash/j;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/j;->f(Lcom/beizi/fusion/work/splash/j;)V

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/j$2;->c:Lcom/beizi/fusion/work/splash/j;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/j;->g(Lcom/beizi/fusion/work/splash/j;)V

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/j$2;->c:Lcom/beizi/fusion/work/splash/j;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/j;->h(Lcom/beizi/fusion/work/splash/j;)V

    .line 8
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/j$2;->c:Lcom/beizi/fusion/work/splash/j;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/j;->i(Lcom/beizi/fusion/work/splash/j;)V

    :cond_0
    return-void
.end method

.method public onLoadFailure(ILjava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showJadYunSplash onLoadFailure code:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ";message:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/j$2;->c:Lcom/beizi/fusion/work/splash/j;

    invoke-static {v0, p2, p1}, Lcom/beizi/fusion/work/splash/j;->a(Lcom/beizi/fusion/work/splash/j;Ljava/lang/String;I)V

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/j$2;->c:Lcom/beizi/fusion/work/splash/j;

    invoke-virtual {p1}, Lcom/beizi/fusion/work/splash/j;->m()V

    return-void
.end method

.method public onLoadSuccess()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/j$2;->c:Lcom/beizi/fusion/work/splash/j;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/j;->a(Lcom/beizi/fusion/work/splash/j;)Lcom/jd/ad/sdk/splash/JADSplash;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/j$2;->c:Lcom/beizi/fusion/work/splash/j;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/j;->a(Lcom/beizi/fusion/work/splash/j;)Lcom/jd/ad/sdk/splash/JADSplash;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jd/ad/sdk/splash/JADSplash;->getJADExtra()Lcom/jd/ad/sdk/dl/model/IJADExtra;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showJadYunSplash getECPMLevel:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/beizi/fusion/work/splash/j$2;->c:Lcom/beizi/fusion/work/splash/j;

    invoke-static {v1}, Lcom/beizi/fusion/work/splash/j;->a(Lcom/beizi/fusion/work/splash/j;)Lcom/jd/ad/sdk/splash/JADSplash;

    move-result-object v1

    invoke-virtual {v1}, Lcom/jd/ad/sdk/splash/JADSplash;->getJADExtra()Lcom/jd/ad/sdk/dl/model/IJADExtra;

    move-result-object v1

    invoke-interface {v1}, Lcom/jd/ad/sdk/dl/model/IJADExtra;->getPrice()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/j$2;->c:Lcom/beizi/fusion/work/splash/j;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/j;->a(Lcom/beizi/fusion/work/splash/j;)Lcom/jd/ad/sdk/splash/JADSplash;

    move-result-object v1

    invoke-virtual {v1}, Lcom/jd/ad/sdk/splash/JADSplash;->getJADExtra()Lcom/jd/ad/sdk/dl/model/IJADExtra;

    move-result-object v1

    invoke-interface {v1}, Lcom/jd/ad/sdk/dl/model/IJADExtra;->getPrice()I

    move-result v1

    int-to-double v1, v1

    invoke-static {v0, v1, v2}, Lcom/beizi/fusion/work/splash/j;->a(Lcom/beizi/fusion/work/splash/j;D)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/j$2;->c:Lcom/beizi/fusion/work/splash/j;

    sget-object v1, Lcom/beizi/fusion/f/a;->b:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/splash/j;->a(Lcom/beizi/fusion/work/splash/j;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/j$2;->c:Lcom/beizi/fusion/work/splash/j;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/j;->b(Lcom/beizi/fusion/work/splash/j;)V

    return-void
.end method

.method public onRenderFailure(ILjava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showJadYunSplash onRenderFailure code:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ";message:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/j$2;->c:Lcom/beizi/fusion/work/splash/j;

    invoke-static {v0, p2, p1}, Lcom/beizi/fusion/work/splash/j;->b(Lcom/beizi/fusion/work/splash/j;Ljava/lang/String;I)V

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/j$2;->c:Lcom/beizi/fusion/work/splash/j;

    invoke-virtual {p1}, Lcom/beizi/fusion/work/splash/j;->m()V

    return-void
.end method

.method public onRenderSuccess(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/j$2;->c:Lcom/beizi/fusion/work/splash/j;

    invoke-static {v0, p1}, Lcom/beizi/fusion/work/splash/j;->a(Lcom/beizi/fusion/work/splash/j;Landroid/view/View;)Landroid/view/View;

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/j$2;->c:Lcom/beizi/fusion/work/splash/j;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/j;->c(Lcom/beizi/fusion/work/splash/j;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/j$2;->c:Lcom/beizi/fusion/work/splash/j;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/j;->d(Lcom/beizi/fusion/work/splash/j;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/j$2;->c:Lcom/beizi/fusion/work/splash/j;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/j;->e(Lcom/beizi/fusion/work/splash/j;)V

    :goto_0
    return-void
.end method
