.class Lcom/beizi/fusion/work/g/b$2$1;
.super Ljava/lang/Object;
.source "CsjRewardVideoWorker.java"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd$RewardAdInteractionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/g/b$2;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:Z

.field b:Z

.field final synthetic c:Lcom/beizi/fusion/work/g/b$2;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/g/b$2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/g/b$2$1;->c:Lcom/beizi/fusion/work/g/b$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/beizi/fusion/work/g/b$2$1;->a:Z

    .line 3
    iput-boolean p1, p0, Lcom/beizi/fusion/work/g/b$2$1;->b:Z

    return-void
.end method


# virtual methods
.method public onAdClose()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/g/b$2$1;->c:Lcom/beizi/fusion/work/g/b$2;

    iget-object v0, v0, Lcom/beizi/fusion/work/g/b$2;->a:Lcom/beizi/fusion/work/g/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/b;->p(Lcom/beizi/fusion/work/g/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/g/b$2$1;->c:Lcom/beizi/fusion/work/g/b$2;

    iget-object v0, v0, Lcom/beizi/fusion/work/g/b$2;->a:Lcom/beizi/fusion/work/g/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/b;->q(Lcom/beizi/fusion/work/g/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/g/b$2$1;->c:Lcom/beizi/fusion/work/g/b$2;

    iget-object v0, v0, Lcom/beizi/fusion/work/g/b$2;->a:Lcom/beizi/fusion/work/g/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/b;->r(Lcom/beizi/fusion/work/g/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/g/b$2$1;->c:Lcom/beizi/fusion/work/g/b$2;

    iget-object v1, v1, Lcom/beizi/fusion/work/g/b$2;->a:Lcom/beizi/fusion/work/g/b;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/g/b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->c(Ljava/lang/String;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/g/b$2$1;->c:Lcom/beizi/fusion/work/g/b$2;

    iget-object v0, v0, Lcom/beizi/fusion/work/g/b$2;->a:Lcom/beizi/fusion/work/g/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/b;->s(Lcom/beizi/fusion/work/g/b;)V

    return-void
.end method

.method public onAdShow()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/g/b$2$1;->c:Lcom/beizi/fusion/work/g/b$2;

    iget-object v0, v0, Lcom/beizi/fusion/work/g/b$2;->a:Lcom/beizi/fusion/work/g/b;

    sget-object v1, Lcom/beizi/fusion/f/a;->c:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/g/b;->b(Lcom/beizi/fusion/work/g/b;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/g/b$2$1;->c:Lcom/beizi/fusion/work/g/b$2;

    iget-object v0, v0, Lcom/beizi/fusion/work/g/b$2;->a:Lcom/beizi/fusion/work/g/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/b;->e(Lcom/beizi/fusion/work/g/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/g/b$2$1;->c:Lcom/beizi/fusion/work/g/b$2;

    iget-object v0, v0, Lcom/beizi/fusion/work/g/b$2;->a:Lcom/beizi/fusion/work/g/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/b;->f(Lcom/beizi/fusion/work/g/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/g/b$2$1;->c:Lcom/beizi/fusion/work/g/b$2;

    iget-object v0, v0, Lcom/beizi/fusion/work/g/b$2;->a:Lcom/beizi/fusion/work/g/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/b;->g(Lcom/beizi/fusion/work/g/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/g/b$2$1;->c:Lcom/beizi/fusion/work/g/b$2;

    iget-object v1, v1, Lcom/beizi/fusion/work/g/b$2;->a:Lcom/beizi/fusion/work/g/b;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/g/b;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->b(Ljava/lang/String;)V

    .line 4
    :cond_0
    iget-boolean v0, p0, Lcom/beizi/fusion/work/g/b$2$1;->a:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/beizi/fusion/work/g/b$2$1;->a:Z

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/g/b$2$1;->c:Lcom/beizi/fusion/work/g/b$2;

    iget-object v0, v0, Lcom/beizi/fusion/work/g/b$2;->a:Lcom/beizi/fusion/work/g/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/b;->h(Lcom/beizi/fusion/work/g/b;)V

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/work/g/b$2$1;->c:Lcom/beizi/fusion/work/g/b$2;

    iget-object v0, v0, Lcom/beizi/fusion/work/g/b$2;->a:Lcom/beizi/fusion/work/g/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/b;->i(Lcom/beizi/fusion/work/g/b;)V

    .line 8
    iget-object v0, p0, Lcom/beizi/fusion/work/g/b$2$1;->c:Lcom/beizi/fusion/work/g/b$2;

    iget-object v0, v0, Lcom/beizi/fusion/work/g/b$2;->a:Lcom/beizi/fusion/work/g/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/b;->j(Lcom/beizi/fusion/work/g/b;)V

    :cond_1
    return-void
.end method

.method public onAdVideoBarClick()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/g/b$2$1;->c:Lcom/beizi/fusion/work/g/b$2;

    iget-object v0, v0, Lcom/beizi/fusion/work/g/b$2;->a:Lcom/beizi/fusion/work/g/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/b;->k(Lcom/beizi/fusion/work/g/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/g/b$2$1;->c:Lcom/beizi/fusion/work/g/b$2;

    iget-object v0, v0, Lcom/beizi/fusion/work/g/b$2;->a:Lcom/beizi/fusion/work/g/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/b;->l(Lcom/beizi/fusion/work/g/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/g/b$2$1;->c:Lcom/beizi/fusion/work/g/b$2;

    iget-object v0, v0, Lcom/beizi/fusion/work/g/b$2;->a:Lcom/beizi/fusion/work/g/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/b;->m(Lcom/beizi/fusion/work/g/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/g/b$2$1;->c:Lcom/beizi/fusion/work/g/b$2;

    iget-object v1, v1, Lcom/beizi/fusion/work/g/b$2;->a:Lcom/beizi/fusion/work/g/b;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/g/b;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->d(Ljava/lang/String;)V

    .line 3
    :cond_0
    iget-boolean v0, p0, Lcom/beizi/fusion/work/g/b$2$1;->b:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/beizi/fusion/work/g/b$2$1;->b:Z

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/g/b$2$1;->c:Lcom/beizi/fusion/work/g/b$2;

    iget-object v0, v0, Lcom/beizi/fusion/work/g/b$2;->a:Lcom/beizi/fusion/work/g/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/b;->n(Lcom/beizi/fusion/work/g/b;)V

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/g/b$2$1;->c:Lcom/beizi/fusion/work/g/b$2;

    iget-object v0, v0, Lcom/beizi/fusion/work/g/b$2;->a:Lcom/beizi/fusion/work/g/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/b;->o(Lcom/beizi/fusion/work/g/b;)V

    :cond_1
    return-void
.end method

.method public onRewardArrived(ZILandroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onRewardVerify(ZILjava/lang/String;ILjava/lang/String;)V
    .locals 1

    .line 1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "verify:"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 2
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "showCsjRewardedVideo Callback --> onRewardVerify() result== "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/work/g/b$2$1;->c:Lcom/beizi/fusion/work/g/b$2;

    iget-object p1, p1, Lcom/beizi/fusion/work/g/b$2;->a:Lcom/beizi/fusion/work/g/b;

    invoke-static {p1}, Lcom/beizi/fusion/work/g/b;->v(Lcom/beizi/fusion/work/g/b;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 4
    iget-object p1, p0, Lcom/beizi/fusion/work/g/b$2$1;->c:Lcom/beizi/fusion/work/g/b$2;

    iget-object p1, p1, Lcom/beizi/fusion/work/g/b$2;->a:Lcom/beizi/fusion/work/g/b;

    invoke-static {p1}, Lcom/beizi/fusion/work/g/b;->w(Lcom/beizi/fusion/work/g/b;)V

    .line 5
    iget-object p1, p0, Lcom/beizi/fusion/work/g/b$2$1;->c:Lcom/beizi/fusion/work/g/b$2;

    iget-object p1, p1, Lcom/beizi/fusion/work/g/b$2;->a:Lcom/beizi/fusion/work/g/b;

    invoke-static {p1}, Lcom/beizi/fusion/work/g/b;->x(Lcom/beizi/fusion/work/g/b;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beizi/fusion/d/e;->k()V

    .line 6
    :cond_0
    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 7
    iget-object p1, p0, Lcom/beizi/fusion/work/g/b$2$1;->c:Lcom/beizi/fusion/work/g/b$2;

    iget-object p1, p1, Lcom/beizi/fusion/work/g/b$2;->a:Lcom/beizi/fusion/work/g/b;

    invoke-static {p1, p5, p4}, Lcom/beizi/fusion/work/g/b;->c(Lcom/beizi/fusion/work/g/b;Ljava/lang/String;I)V

    :cond_1
    return-void
.end method

.method public onSkippedVideo()V
    .locals 0

    return-void
.end method

.method public onVideoComplete()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/g/b$2$1;->c:Lcom/beizi/fusion/work/g/b$2;

    iget-object v0, v0, Lcom/beizi/fusion/work/g/b$2;->a:Lcom/beizi/fusion/work/g/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/b;->t(Lcom/beizi/fusion/work/g/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/g/b$2$1;->c:Lcom/beizi/fusion/work/g/b$2;

    iget-object v0, v0, Lcom/beizi/fusion/work/g/b$2;->a:Lcom/beizi/fusion/work/g/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/b;->u(Lcom/beizi/fusion/work/g/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->l()V

    :cond_0
    return-void
.end method

.method public onVideoError()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/g/b$2$1;->c:Lcom/beizi/fusion/work/g/b$2;

    iget-object v0, v0, Lcom/beizi/fusion/work/g/b$2;->a:Lcom/beizi/fusion/work/g/b;

    const-string v1, "sdk custom error "

    const-string v2, "onVideoError"

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const v2, 0x18697

    invoke-static {v0, v1, v2}, Lcom/beizi/fusion/work/g/b;->b(Lcom/beizi/fusion/work/g/b;Ljava/lang/String;I)V

    return-void
.end method
