.class Lcom/beizi/fusion/work/splash/e$2$1;
.super Ljava/lang/Object;
.source "CsjSplashWorker.java"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/CSJSplashAd$SplashAdListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/splash/e$2;->onSplashRenderSuccess(Lcom/bytedance/sdk/openadsdk/CSJSplashAd;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/splash/e$2;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/splash/e$2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/e$2$1;->a:Lcom/beizi/fusion/work/splash/e$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSplashAdClick(Lcom/bytedance/sdk/openadsdk/CSJSplashAd;)V
    .locals 5

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/e$2$1;->a:Lcom/beizi/fusion/work/splash/e$2;

    iget-object p1, p1, Lcom/beizi/fusion/work/splash/e$2;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/e;->d(Lcom/beizi/fusion/work/splash/e;)V

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/e$2$1;->a:Lcom/beizi/fusion/work/splash/e$2;

    iget-object p1, p1, Lcom/beizi/fusion/work/splash/e$2;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/e;->e(Lcom/beizi/fusion/work/splash/e;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/e$2$1;->a:Lcom/beizi/fusion/work/splash/e$2;

    iget-object p1, p1, Lcom/beizi/fusion/work/splash/e$2;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/e;->f(Lcom/beizi/fusion/work/splash/e;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beizi/fusion/d/e;->r()I

    move-result p1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    .line 4
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/e$2$1;->a:Lcom/beizi/fusion/work/splash/e$2;

    iget-object p1, p1, Lcom/beizi/fusion/work/splash/e$2;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/e;->g(Lcom/beizi/fusion/work/splash/e;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    iget-object v1, p0, Lcom/beizi/fusion/work/splash/e$2$1;->a:Lcom/beizi/fusion/work/splash/e$2;

    iget-object v1, v1, Lcom/beizi/fusion/work/splash/e$2;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/splash/e;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/beizi/fusion/d/e;->d(Ljava/lang/String;)V

    .line 5
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/e$2$1;->a:Lcom/beizi/fusion/work/splash/e$2;

    iget-object p1, p1, Lcom/beizi/fusion/work/splash/e$2;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/e;->i(Lcom/beizi/fusion/work/splash/e;)Landroid/os/Handler;

    move-result-object p1

    const-wide/16 v1, 0x1388

    iget-object v3, p0, Lcom/beizi/fusion/work/splash/e$2$1;->a:Lcom/beizi/fusion/work/splash/e$2;

    iget-object v3, v3, Lcom/beizi/fusion/work/splash/e$2;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-static {v3}, Lcom/beizi/fusion/work/splash/e;->h(Lcom/beizi/fusion/work/splash/e;)J

    move-result-wide v3

    add-long/2addr v3, v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sub-long/2addr v3, v1

    invoke-virtual {p1, v0, v3, v4}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 6
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/e$2$1;->a:Lcom/beizi/fusion/work/splash/e$2;

    iget-object p1, p1, Lcom/beizi/fusion/work/splash/e$2;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/e;->j(Lcom/beizi/fusion/work/splash/e;)V

    :cond_1
    return-void
.end method

.method public onSplashAdClose(Lcom/bytedance/sdk/openadsdk/CSJSplashAd;I)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/e$2$1;->a:Lcom/beizi/fusion/work/splash/e$2;

    iget-object p1, p1, Lcom/beizi/fusion/work/splash/e$2;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/e;->o(Lcom/beizi/fusion/work/splash/e;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/beizi/fusion/work/splash/e$2$1;->a:Lcom/beizi/fusion/work/splash/e$2;

    iget-object p1, p1, Lcom/beizi/fusion/work/splash/e$2;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/e;->p(Lcom/beizi/fusion/work/splash/e;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beizi/fusion/d/e;->r()I

    move-result p1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/e$2$1;->a:Lcom/beizi/fusion/work/splash/e$2;

    iget-object p1, p1, Lcom/beizi/fusion/work/splash/e$2;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/e;->q(Lcom/beizi/fusion/work/splash/e;)V

    :cond_0
    const/4 p1, 0x1

    if-ne p2, p1, :cond_1

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/e$2$1;->a:Lcom/beizi/fusion/work/splash/e$2;

    iget-object p1, p1, Lcom/beizi/fusion/work/splash/e$2;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/e;->r(Lcom/beizi/fusion/work/splash/e;)V

    .line 4
    :cond_1
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/e$2$1;->a:Lcom/beizi/fusion/work/splash/e$2;

    iget-object p1, p1, Lcom/beizi/fusion/work/splash/e$2;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/e;->s(Lcom/beizi/fusion/work/splash/e;)V

    return-void
.end method

.method public onSplashAdShow(Lcom/bytedance/sdk/openadsdk/CSJSplashAd;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/e$2$1;->a:Lcom/beizi/fusion/work/splash/e$2;

    iget-object p1, p1, Lcom/beizi/fusion/work/splash/e$2;->a:Lcom/beizi/fusion/work/splash/e;

    sget-object v0, Lcom/beizi/fusion/f/a;->c:Lcom/beizi/fusion/f/a;

    invoke-static {p1, v0}, Lcom/beizi/fusion/work/splash/e;->b(Lcom/beizi/fusion/work/splash/e;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/e$2$1;->a:Lcom/beizi/fusion/work/splash/e$2;

    iget-object p1, p1, Lcom/beizi/fusion/work/splash/e$2;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/e;->k(Lcom/beizi/fusion/work/splash/e;)V

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/e$2$1;->a:Lcom/beizi/fusion/work/splash/e$2;

    iget-object p1, p1, Lcom/beizi/fusion/work/splash/e$2;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/e;->l(Lcom/beizi/fusion/work/splash/e;)V

    .line 4
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/e$2$1;->a:Lcom/beizi/fusion/work/splash/e$2;

    iget-object p1, p1, Lcom/beizi/fusion/work/splash/e$2;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/e;->m(Lcom/beizi/fusion/work/splash/e;)V

    .line 5
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/e$2$1;->a:Lcom/beizi/fusion/work/splash/e$2;

    iget-object p1, p1, Lcom/beizi/fusion/work/splash/e$2;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/e;->n(Lcom/beizi/fusion/work/splash/e;)V

    return-void
.end method
