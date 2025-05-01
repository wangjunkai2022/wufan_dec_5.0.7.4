.class Lcom/beizi/fusion/work/g/c$a;
.super Ljava/lang/Object;
.source "GdtRewardVideoWorker.java"

# interfaces
.implements Lcom/qq/e/ads/rewardvideo/RewardVideoADListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/work/g/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field a:Z

.field b:Z

.field final synthetic c:Lcom/beizi/fusion/work/g/c;


# direct methods
.method private constructor <init>(Lcom/beizi/fusion/work/g/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/g/c$a;->c:Lcom/beizi/fusion/work/g/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/beizi/fusion/work/g/c$a;->a:Z

    .line 3
    iput-boolean p1, p0, Lcom/beizi/fusion/work/g/c$a;->b:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/beizi/fusion/work/g/c;Lcom/beizi/fusion/work/g/c$1;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Lcom/beizi/fusion/work/g/c$a;-><init>(Lcom/beizi/fusion/work/g/c;)V

    return-void
.end method


# virtual methods
.method public onADClick()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/g/c$a;->c:Lcom/beizi/fusion/work/g/c;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/c;->o(Lcom/beizi/fusion/work/g/c;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/g/c$a;->c:Lcom/beizi/fusion/work/g/c;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/c;->p(Lcom/beizi/fusion/work/g/c;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/g/c$a;->c:Lcom/beizi/fusion/work/g/c;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/c;->q(Lcom/beizi/fusion/work/g/c;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/g/c$a;->c:Lcom/beizi/fusion/work/g/c;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/g/c;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->d(Ljava/lang/String;)V

    .line 3
    :cond_0
    iget-boolean v0, p0, Lcom/beizi/fusion/work/g/c$a;->b:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/beizi/fusion/work/g/c$a;->b:Z

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/g/c$a;->c:Lcom/beizi/fusion/work/g/c;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/c;->r(Lcom/beizi/fusion/work/g/c;)V

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/g/c$a;->c:Lcom/beizi/fusion/work/g/c;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/c;->s(Lcom/beizi/fusion/work/g/c;)V

    :cond_1
    return-void
.end method

.method public onADClose()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/g/c$a;->c:Lcom/beizi/fusion/work/g/c;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/c;->v(Lcom/beizi/fusion/work/g/c;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/g/c$a;->c:Lcom/beizi/fusion/work/g/c;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/c;->w(Lcom/beizi/fusion/work/g/c;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/g/c$a;->c:Lcom/beizi/fusion/work/g/c;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/c;->x(Lcom/beizi/fusion/work/g/c;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/g/c$a;->c:Lcom/beizi/fusion/work/g/c;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/g/c;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->c(Ljava/lang/String;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/g/c$a;->c:Lcom/beizi/fusion/work/g/c;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/c;->y(Lcom/beizi/fusion/work/g/c;)V

    return-void
.end method

.method public onADExpose()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/g/c$a;->c:Lcom/beizi/fusion/work/g/c;

    sget-object v1, Lcom/beizi/fusion/f/a;->c:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/g/c;->b(Lcom/beizi/fusion/work/g/c;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/g/c$a;->c:Lcom/beizi/fusion/work/g/c;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/c;->g(Lcom/beizi/fusion/work/g/c;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/g/c$a;->c:Lcom/beizi/fusion/work/g/c;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/c;->h(Lcom/beizi/fusion/work/g/c;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/g/c$a;->c:Lcom/beizi/fusion/work/g/c;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/c;->i(Lcom/beizi/fusion/work/g/c;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/g/c$a;->c:Lcom/beizi/fusion/work/g/c;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/g/c;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->b(Ljava/lang/String;)V

    .line 4
    :cond_0
    iget-boolean v0, p0, Lcom/beizi/fusion/work/g/c$a;->a:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/beizi/fusion/work/g/c$a;->a:Z

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/g/c$a;->c:Lcom/beizi/fusion/work/g/c;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/g/c;->az()V

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/work/g/c$a;->c:Lcom/beizi/fusion/work/g/c;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/c;->j(Lcom/beizi/fusion/work/g/c;)V

    .line 8
    iget-object v0, p0, Lcom/beizi/fusion/work/g/c$a;->c:Lcom/beizi/fusion/work/g/c;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/c;->k(Lcom/beizi/fusion/work/g/c;)V

    :cond_1
    return-void
.end method

.method public onADLoad()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/g/c$a;->c:Lcom/beizi/fusion/work/g/c;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/c;->a(Lcom/beizi/fusion/work/g/c;)Lcom/qq/e/ads/rewardvideo/RewardVideoAD;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qq/e/ads/LiteAbstractAD;->getECPM()I

    move-result v0

    if-lez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/g/c$a;->c:Lcom/beizi/fusion/work/g/c;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/c;->a(Lcom/beizi/fusion/work/g/c;)Lcom/qq/e/ads/rewardvideo/RewardVideoAD;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qq/e/ads/LiteAbstractAD;->getECPM()I

    move-result v1

    int-to-double v1, v1

    invoke-static {v0, v1, v2}, Lcom/beizi/fusion/work/g/c;->a(Lcom/beizi/fusion/work/g/c;D)V

    .line 3
    :cond_0
    sget-boolean v0, Lcom/beizi/fusion/g/v;->a:Z

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/work/g/c$a;->c:Lcom/beizi/fusion/work/g/c;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/c;->a(Lcom/beizi/fusion/work/g/c;)Lcom/qq/e/ads/rewardvideo/RewardVideoAD;

    move-result-object v0

    sget-object v1, Lcom/beizi/fusion/g/v;->b:Lcom/qq/e/comm/compliance/DownloadConfirmListener;

    invoke-virtual {v0, v1}, Lcom/qq/e/ads/LiteAbstractAD;->setDownloadConfirmListener(Lcom/qq/e/comm/compliance/DownloadConfirmListener;)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/beizi/fusion/work/g/c$a;->c:Lcom/beizi/fusion/work/g/c;

    sget-object v1, Lcom/beizi/fusion/f/a;->b:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/g/c;->a(Lcom/beizi/fusion/work/g/c;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/g/c$a;->c:Lcom/beizi/fusion/work/g/c;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/c;->b(Lcom/beizi/fusion/work/g/c;)V

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/work/g/c$a;->c:Lcom/beizi/fusion/work/g/c;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/c;->c(Lcom/beizi/fusion/work/g/c;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 8
    iget-object v0, p0, Lcom/beizi/fusion/work/g/c$a;->c:Lcom/beizi/fusion/work/g/c;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/c;->d(Lcom/beizi/fusion/work/g/c;)V

    goto :goto_0

    .line 9
    :cond_2
    iget-object v0, p0, Lcom/beizi/fusion/work/g/c$a;->c:Lcom/beizi/fusion/work/g/c;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/c;->e(Lcom/beizi/fusion/work/g/c;)V

    :goto_0
    return-void
.end method

.method public onADShow()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/g/c$a;->c:Lcom/beizi/fusion/work/g/c;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/c;->f(Lcom/beizi/fusion/work/g/c;)V

    return-void
.end method

.method public onError(Lcom/qq/e/comm/util/AdError;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showGdtRewardVideo onError:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/qq/e/comm/util/AdError;->getErrorMsg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/g/c$a;->c:Lcom/beizi/fusion/work/g/c;

    invoke-virtual {p1}, Lcom/qq/e/comm/util/AdError;->getErrorMsg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/qq/e/comm/util/AdError;->getErrorCode()I

    move-result p1

    invoke-static {v0, v1, p1}, Lcom/beizi/fusion/work/g/c;->a(Lcom/beizi/fusion/work/g/c;Ljava/lang/String;I)V

    return-void
.end method

.method public onReward(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onReward transID = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "transId"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/work/g/c$a;->c:Lcom/beizi/fusion/work/g/c;

    invoke-static {p1}, Lcom/beizi/fusion/work/g/c;->l(Lcom/beizi/fusion/work/g/c;)V

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/work/g/c$a;->c:Lcom/beizi/fusion/work/g/c;

    invoke-static {p1}, Lcom/beizi/fusion/work/g/c;->m(Lcom/beizi/fusion/work/g/c;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 4
    iget-object p1, p0, Lcom/beizi/fusion/work/g/c$a;->c:Lcom/beizi/fusion/work/g/c;

    invoke-static {p1}, Lcom/beizi/fusion/work/g/c;->n(Lcom/beizi/fusion/work/g/c;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beizi/fusion/d/e;->k()V

    :cond_1
    return-void
.end method

.method public onVideoCached()V
    .locals 0

    return-void
.end method

.method public onVideoComplete()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/g/c$a;->c:Lcom/beizi/fusion/work/g/c;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/c;->t(Lcom/beizi/fusion/work/g/c;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/g/c$a;->c:Lcom/beizi/fusion/work/g/c;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/c;->u(Lcom/beizi/fusion/work/g/c;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->l()V

    :cond_0
    return-void
.end method
