.class Lcom/beizi/fusion/work/splash/f$a;
.super Ljava/lang/Object;
.source "GdtSplashWorker.java"

# interfaces
.implements Lcom/qq/e/ads/splash/SplashADListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/work/splash/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field a:Z

.field b:Z

.field c:Z

.field final synthetic d:Lcom/beizi/fusion/work/splash/f;


# direct methods
.method private constructor <init>(Lcom/beizi/fusion/work/splash/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/beizi/fusion/work/splash/f$a;->a:Z

    .line 3
    iput-boolean p1, p0, Lcom/beizi/fusion/work/splash/f$a;->b:Z

    .line 4
    iput-boolean p1, p0, Lcom/beizi/fusion/work/splash/f$a;->c:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/beizi/fusion/work/splash/f;Lcom/beizi/fusion/work/splash/f$1;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Lcom/beizi/fusion/work/splash/f$a;-><init>(Lcom/beizi/fusion/work/splash/f;)V

    return-void
.end method


# virtual methods
.method public onADClicked()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->i(Lcom/beizi/fusion/work/splash/f;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->j(Lcom/beizi/fusion/work/splash/f;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->k(Lcom/beizi/fusion/work/splash/f;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v2, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-virtual {v2}, Lcom/beizi/fusion/work/splash/f;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/beizi/fusion/d/e;->d(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->m(Lcom/beizi/fusion/work/splash/f;)Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v2, 0x1388

    iget-object v4, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v4}, Lcom/beizi/fusion/work/splash/f;->l(Lcom/beizi/fusion/work/splash/f;)J

    move-result-wide v4

    add-long/2addr v4, v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v4, v2

    invoke-virtual {v0, v1, v4, v5}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 4
    :cond_0
    iget-boolean v0, p0, Lcom/beizi/fusion/work/splash/f$a;->b:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/beizi/fusion/work/splash/f$a;->b:Z

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->n(Lcom/beizi/fusion/work/splash/f;)V

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->o(Lcom/beizi/fusion/work/splash/f;)V

    :cond_1
    return-void
.end method

.method public onADDismissed()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->a(Lcom/beizi/fusion/work/splash/f;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->b(Lcom/beizi/fusion/work/splash/f;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->c(Lcom/beizi/fusion/work/splash/f;)V

    return-void
.end method

.method public onADExposure()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    sget-object v1, Lcom/beizi/fusion/f/a;->c:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/splash/f;->a(Lcom/beizi/fusion/work/splash/f;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 2
    iget-boolean v0, p0, Lcom/beizi/fusion/work/splash/f$a;->a:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/beizi/fusion/work/splash/f$a;->a:Z

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/splash/f;->az()V

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->A(Lcom/beizi/fusion/work/splash/f;)V

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->B(Lcom/beizi/fusion/work/splash/f;)V

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->C(Lcom/beizi/fusion/work/splash/f;)V

    :cond_0
    return-void
.end method

.method public onADLoaded(J)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->D(Lcom/beizi/fusion/work/splash/f;)Lcom/qq/e/ads/splash/SplashAD;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qq/e/ads/LiteAbstractAD;->getECPM()I

    move-result v0

    if-lez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->D(Lcom/beizi/fusion/work/splash/f;)Lcom/qq/e/ads/splash/SplashAD;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qq/e/ads/LiteAbstractAD;->getECPM()I

    move-result v1

    int-to-double v1, v1

    invoke-static {v0, v1, v2}, Lcom/beizi/fusion/work/splash/f;->a(Lcom/beizi/fusion/work/splash/f;D)V

    .line 3
    :cond_0
    sget-boolean v0, Lcom/beizi/fusion/g/v;->a:Z

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->D(Lcom/beizi/fusion/work/splash/f;)Lcom/qq/e/ads/splash/SplashAD;

    move-result-object v0

    sget-object v1, Lcom/beizi/fusion/g/v;->b:Lcom/qq/e/comm/compliance/DownloadConfirmListener;

    invoke-virtual {v0, v1}, Lcom/qq/e/ads/LiteAbstractAD;->setDownloadConfirmListener(Lcom/qq/e/comm/compliance/DownloadConfirmListener;)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->E(Lcom/beizi/fusion/work/splash/f;)V

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->F(Lcom/beizi/fusion/work/splash/f;)Lcom/beizi/fusion/f/a;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    sget-object v1, Lcom/beizi/fusion/f/a;->c:Lcom/beizi/fusion/f/a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-lt v0, v1, :cond_4

    .line 7
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/f;->G(Lcom/beizi/fusion/work/splash/f;)Lcom/beizi/fusion/f/a;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const/4 p2, 0x2

    if-eq p1, p2, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    const-string p1, "other"

    goto :goto_0

    :cond_2
    const-string p1, "fail"

    goto :goto_0

    :cond_3
    const-string p1, "show"

    .line 8
    :goto_0
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object p2

    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ad status error "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 10
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {p1, p2}, Lcom/beizi/fusion/work/splash/f;->a(Lcom/beizi/fusion/work/splash/f;Landroid/os/Message;)V

    return-void

    .line 11
    :cond_4
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    sget-object v1, Lcom/beizi/fusion/f/a;->b:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/splash/f;->b(Lcom/beizi/fusion/work/splash/f;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 12
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->g(Lcom/beizi/fusion/work/splash/f;)I

    .line 13
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->H(Lcom/beizi/fusion/work/splash/f;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showGdtSplash onADLoaded:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ",mAdLifeControl.getAdStatus() = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v1}, Lcom/beizi/fusion/work/splash/f;->I(Lcom/beizi/fusion/work/splash/f;)Lcom/beizi/fusion/d/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beizi/fusion/d/e;->s()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",gap = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    sub-long v1, p1, v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 16
    :cond_5
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    cmp-long v2, v0, p1

    if-gez v2, :cond_6

    iget-object p1, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/f;->J(Lcom/beizi/fusion/work/splash/f;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 17
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/f;->K(Lcom/beizi/fusion/work/splash/f;)V

    goto :goto_1

    .line 18
    :cond_6
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/f;->L(Lcom/beizi/fusion/work/splash/f;)V

    :goto_1
    return-void
.end method

.method public onADPresent()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->g(Lcom/beizi/fusion/work/splash/f;)I

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->h(Lcom/beizi/fusion/work/splash/f;)V

    return-void
.end method

.method public onADTick(J)V
    .locals 8

    .line 1
    iget-boolean v0, p0, Lcom/beizi/fusion/work/splash/f$a;->c:Z

    const/4 v1, 0x1

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->p(Lcom/beizi/fusion/work/splash/f;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->q(Lcom/beizi/fusion/work/splash/f;)Landroid/view/ViewGroup;

    move-result-object v2

    invoke-static {v2}, Lcom/beizi/fusion/g/m;->a(Landroid/view/View;)Ljava/util/List;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/beizi/fusion/work/splash/f;->a(Lcom/beizi/fusion/work/splash/f;Ljava/util/List;)Ljava/util/List;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->r(Lcom/beizi/fusion/work/splash/f;)V

    .line 5
    iput-boolean v1, p0, Lcom/beizi/fusion/work/splash/f$a;->c:Z

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->p(Lcom/beizi/fusion/work/splash/f;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->s(Lcom/beizi/fusion/work/splash/f;)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-lez v0, :cond_5

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->s(Lcom/beizi/fusion/work/splash/f;)J

    move-result-wide v2

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->t(Lcom/beizi/fusion/work/splash/f;)J

    move-result-wide v6

    cmp-long v0, v2, v6

    if-gtz v0, :cond_5

    .line 8
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->u(Lcom/beizi/fusion/work/splash/f;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    .line 9
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->v(Lcom/beizi/fusion/work/splash/f;)J

    move-result-wide v6

    cmp-long v0, v6, v4

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->v(Lcom/beizi/fusion/work/splash/f;)J

    move-result-wide v3

    cmp-long v0, p1, v3

    if-lez v0, :cond_2

    .line 10
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/splash/f;->a(Lcom/beizi/fusion/work/splash/f;Z)Z

    .line 11
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->w(Lcom/beizi/fusion/work/splash/f;)Landroid/view/View;

    move-result-object v0

    const v3, 0x3e4ccccd    # 0.2f

    invoke-virtual {v0, v3}, Landroid/view/View;->setAlpha(F)V

    goto :goto_0

    .line 12
    :cond_2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0, v2}, Lcom/beizi/fusion/work/splash/f;->a(Lcom/beizi/fusion/work/splash/f;Z)Z

    .line 13
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->w(Lcom/beizi/fusion/work/splash/f;)Landroid/view/View;

    move-result-object v0

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v0, v3}, Landroid/view/View;->setAlpha(F)V

    .line 14
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->s(Lcom/beizi/fusion/work/splash/f;)J

    move-result-wide v3

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->t(Lcom/beizi/fusion/work/splash/f;)J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-nez v0, :cond_4

    .line 15
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->w(Lcom/beizi/fusion/work/splash/f;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setEnabled(Z)V

    goto :goto_1

    .line 16
    :cond_4
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->w(Lcom/beizi/fusion/work/splash/f;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 17
    :cond_5
    :goto_1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    long-to-float v1, p1

    const/high16 v2, 0x447a0000    # 1000.0f

    div-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/splash/f;->b(Lcom/beizi/fusion/work/splash/f;I)V

    .line 18
    :cond_6
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->x(Lcom/beizi/fusion/work/splash/f;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->y(Lcom/beizi/fusion/work/splash/f;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_7

    .line 19
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/f;->z(Lcom/beizi/fusion/work/splash/f;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/beizi/fusion/d/e;->a(J)V

    :cond_7
    return-void
.end method

.method public onNoAD(Lcom/qq/e/comm/util/AdError;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showGdtSplash onNoAD:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/qq/e/comm/util/AdError;->getErrorMsg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-virtual {p1}, Lcom/qq/e/comm/util/AdError;->getErrorMsg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/qq/e/comm/util/AdError;->getErrorCode()I

    move-result p1

    invoke-static {v0, v1, p1}, Lcom/beizi/fusion/work/splash/f;->a(Lcom/beizi/fusion/work/splash/f;Ljava/lang/String;I)V

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/f;->d(Lcom/beizi/fusion/work/splash/f;)I

    move-result p1

    const/4 v0, 0x1

    if-lt p1, v0, :cond_0

    iget-object p1, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/f;->e(Lcom/beizi/fusion/work/splash/f;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 4
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/f$a;->d:Lcom/beizi/fusion/work/splash/f;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/f;->f(Lcom/beizi/fusion/work/splash/f;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beizi/fusion/d/e;->t()V

    :cond_0
    return-void
.end method
