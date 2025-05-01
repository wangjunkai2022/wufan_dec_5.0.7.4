.class Lcom/beizi/fusion/work/splash/g$a;
.super Ljava/lang/Object;
.source "GmSplashWorker.java"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTSplashAd$AdInteractionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/work/splash/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/splash/g;

.field private b:Z

.field private c:Z


# direct methods
.method private constructor <init>(Lcom/beizi/fusion/work/splash/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/g$a;->a:Lcom/beizi/fusion/work/splash/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/beizi/fusion/work/splash/g$a;->b:Z

    .line 3
    iput-boolean p1, p0, Lcom/beizi/fusion/work/splash/g$a;->c:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/beizi/fusion/work/splash/g;Lcom/beizi/fusion/work/splash/g$1;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Lcom/beizi/fusion/work/splash/g$a;-><init>(Lcom/beizi/fusion/work/splash/g;)V

    return-void
.end method


# virtual methods
.method public onAdClicked(Landroid/view/View;I)V
    .locals 4

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/g$a;->a:Lcom/beizi/fusion/work/splash/g;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/g;->i(Lcom/beizi/fusion/work/splash/g;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/g$a;->a:Lcom/beizi/fusion/work/splash/g;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/g;->j(Lcom/beizi/fusion/work/splash/g;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beizi/fusion/d/e;->r()I

    move-result p1

    const/4 p2, 0x2

    if-eq p1, p2, :cond_0

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/g$a;->a:Lcom/beizi/fusion/work/splash/g;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/g;->k(Lcom/beizi/fusion/work/splash/g;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/g$a;->a:Lcom/beizi/fusion/work/splash/g;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/splash/g;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/beizi/fusion/d/e;->d(Ljava/lang/String;)V

    .line 4
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/g$a;->a:Lcom/beizi/fusion/work/splash/g;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/g;->m(Lcom/beizi/fusion/work/splash/g;)Landroid/os/Handler;

    move-result-object p1

    const-wide/16 v0, 0x1388

    iget-object v2, p0, Lcom/beizi/fusion/work/splash/g$a;->a:Lcom/beizi/fusion/work/splash/g;

    invoke-static {v2}, Lcom/beizi/fusion/work/splash/g;->l(Lcom/beizi/fusion/work/splash/g;)J

    move-result-wide v2

    add-long/2addr v2, v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v2, v0

    invoke-virtual {p1, p2, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 5
    :cond_0
    iget-boolean p1, p0, Lcom/beizi/fusion/work/splash/g$a;->c:Z

    if-nez p1, :cond_1

    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lcom/beizi/fusion/work/splash/g$a;->c:Z

    .line 7
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/g$a;->a:Lcom/beizi/fusion/work/splash/g;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/g;->n(Lcom/beizi/fusion/work/splash/g;)V

    .line 8
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/g$a;->a:Lcom/beizi/fusion/work/splash/g;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/g;->o(Lcom/beizi/fusion/work/splash/g;)V

    :cond_1
    return-void
.end method

.method public onAdShow(Landroid/view/View;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/g$a;->a:Lcom/beizi/fusion/work/splash/g;

    sget-object p2, Lcom/beizi/fusion/f/a;->c:Lcom/beizi/fusion/f/a;

    invoke-static {p1, p2}, Lcom/beizi/fusion/work/splash/g;->b(Lcom/beizi/fusion/work/splash/g;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 2
    iget-boolean p1, p0, Lcom/beizi/fusion/work/splash/g$a;->b:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lcom/beizi/fusion/work/splash/g$a;->b:Z

    .line 4
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/g$a;->a:Lcom/beizi/fusion/work/splash/g;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/g;->p(Lcom/beizi/fusion/work/splash/g;)V

    .line 5
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/g$a;->a:Lcom/beizi/fusion/work/splash/g;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/g;->q(Lcom/beizi/fusion/work/splash/g;)V

    .line 6
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/g$a;->a:Lcom/beizi/fusion/work/splash/g;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/g;->r(Lcom/beizi/fusion/work/splash/g;)V

    .line 7
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/g$a;->a:Lcom/beizi/fusion/work/splash/g;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/g;->s(Lcom/beizi/fusion/work/splash/g;)V

    :cond_0
    return-void
.end method

.method public onAdSkip()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/g$a;->a:Lcom/beizi/fusion/work/splash/g;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/g;->t(Lcom/beizi/fusion/work/splash/g;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/g$a;->a:Lcom/beizi/fusion/work/splash/g;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/g;->u(Lcom/beizi/fusion/work/splash/g;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/g$a;->a:Lcom/beizi/fusion/work/splash/g;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/g;->v(Lcom/beizi/fusion/work/splash/g;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/g$a;->a:Lcom/beizi/fusion/work/splash/g;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/g;->w(Lcom/beizi/fusion/work/splash/g;)V

    return-void
.end method

.method public onAdTimeOver()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/g$a;->a:Lcom/beizi/fusion/work/splash/g;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/g;->x(Lcom/beizi/fusion/work/splash/g;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/g$a;->a:Lcom/beizi/fusion/work/splash/g;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/g;->y(Lcom/beizi/fusion/work/splash/g;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/g$a;->a:Lcom/beizi/fusion/work/splash/g;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/g;->z(Lcom/beizi/fusion/work/splash/g;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/g$a;->a:Lcom/beizi/fusion/work/splash/g;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/g;->A(Lcom/beizi/fusion/work/splash/g;)V

    return-void
.end method
