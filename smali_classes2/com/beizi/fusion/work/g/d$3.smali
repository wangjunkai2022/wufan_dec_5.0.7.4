.class Lcom/beizi/fusion/work/g/d$3;
.super Ljava/lang/Object;
.source "HwRewardVideoWorker.java"

# interfaces
.implements Lcom/huawei/openalliance/ad/inter/listeners/IRewardAdStatusListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/g/d;->a(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:Z

.field b:Z

.field final synthetic c:Lcom/beizi/fusion/work/g/d;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/g/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/g/d$3;->c:Lcom/beizi/fusion/work/g/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/beizi/fusion/work/g/d$3;->a:Z

    .line 3
    iput-boolean p1, p0, Lcom/beizi/fusion/work/g/d$3;->b:Z

    return-void
.end method


# virtual methods
.method public onAdClicked()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/g/d$3;->c:Lcom/beizi/fusion/work/g/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/d;->l(Lcom/beizi/fusion/work/g/d;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/g/d$3;->c:Lcom/beizi/fusion/work/g/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/d;->m(Lcom/beizi/fusion/work/g/d;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/g/d$3;->c:Lcom/beizi/fusion/work/g/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/d;->n(Lcom/beizi/fusion/work/g/d;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/g/d$3;->c:Lcom/beizi/fusion/work/g/d;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/g/d;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->d(Ljava/lang/String;)V

    .line 3
    :cond_0
    iget-boolean v0, p0, Lcom/beizi/fusion/work/g/d$3;->b:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/beizi/fusion/work/g/d$3;->b:Z

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/g/d$3;->c:Lcom/beizi/fusion/work/g/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/d;->o(Lcom/beizi/fusion/work/g/d;)V

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/g/d$3;->c:Lcom/beizi/fusion/work/g/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/d;->p(Lcom/beizi/fusion/work/g/d;)V

    :cond_1
    return-void
.end method

.method public onAdClosed()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/g/d$3;->c:Lcom/beizi/fusion/work/g/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/d;->s(Lcom/beizi/fusion/work/g/d;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/g/d$3;->c:Lcom/beizi/fusion/work/g/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/d;->t(Lcom/beizi/fusion/work/g/d;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/g/d$3;->c:Lcom/beizi/fusion/work/g/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/d;->u(Lcom/beizi/fusion/work/g/d;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/g/d$3;->c:Lcom/beizi/fusion/work/g/d;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/g/d;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->c(Ljava/lang/String;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/g/d$3;->c:Lcom/beizi/fusion/work/g/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/d;->v(Lcom/beizi/fusion/work/g/d;)V

    return-void
.end method

.method public onAdCompleted()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/g/d$3;->c:Lcom/beizi/fusion/work/g/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/d;->q(Lcom/beizi/fusion/work/g/d;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/g/d$3;->c:Lcom/beizi/fusion/work/g/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/d;->r(Lcom/beizi/fusion/work/g/d;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->l()V

    :cond_0
    return-void
.end method

.method public onAdError(II)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showHwRewardedVideo Callback --> onAdError: code = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " \uff0cextra= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/g/d$3;->c:Lcom/beizi/fusion/work/g/d;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, p2}, Lcom/beizi/fusion/work/g/d;->b(Lcom/beizi/fusion/work/g/d;Ljava/lang/String;I)V

    return-void
.end method

.method public onAdShown()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/g/d$3;->c:Lcom/beizi/fusion/work/g/d;

    sget-object v1, Lcom/beizi/fusion/f/a;->c:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/g/d;->b(Lcom/beizi/fusion/work/g/d;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/g/d$3;->c:Lcom/beizi/fusion/work/g/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/d;->f(Lcom/beizi/fusion/work/g/d;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/g/d$3;->c:Lcom/beizi/fusion/work/g/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/d;->g(Lcom/beizi/fusion/work/g/d;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/g/d$3;->c:Lcom/beizi/fusion/work/g/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/d;->h(Lcom/beizi/fusion/work/g/d;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/g/d$3;->c:Lcom/beizi/fusion/work/g/d;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/g/d;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->b(Ljava/lang/String;)V

    .line 4
    :cond_0
    iget-boolean v0, p0, Lcom/beizi/fusion/work/g/d$3;->a:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/beizi/fusion/work/g/d$3;->a:Z

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/g/d$3;->c:Lcom/beizi/fusion/work/g/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/d;->i(Lcom/beizi/fusion/work/g/d;)V

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/work/g/d$3;->c:Lcom/beizi/fusion/work/g/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/d;->j(Lcom/beizi/fusion/work/g/d;)V

    .line 8
    iget-object v0, p0, Lcom/beizi/fusion/work/g/d$3;->c:Lcom/beizi/fusion/work/g/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/d;->k(Lcom/beizi/fusion/work/g/d;)V

    :cond_1
    return-void
.end method

.method public onRewarded()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/g/d$3;->c:Lcom/beizi/fusion/work/g/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/d;->w(Lcom/beizi/fusion/work/g/d;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/g/d$3;->c:Lcom/beizi/fusion/work/g/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/d;->x(Lcom/beizi/fusion/work/g/d;)V

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/g/d$3;->c:Lcom/beizi/fusion/work/g/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/d;->y(Lcom/beizi/fusion/work/g/d;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->k()V

    :cond_0
    return-void
.end method
