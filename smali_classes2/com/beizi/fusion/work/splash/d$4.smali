.class Lcom/beizi/fusion/work/splash/d$4;
.super Ljava/lang/Object;
.source "CsjNSTWorker.java"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd$ExpressAdInteractionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/splash/d;->a(Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:Z

.field b:Z

.field final synthetic c:Lcom/beizi/fusion/work/splash/d;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/splash/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/d$4;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/beizi/fusion/work/splash/d$4;->a:Z

    .line 3
    iput-boolean p1, p0, Lcom/beizi/fusion/work/splash/d$4;->b:Z

    return-void
.end method


# virtual methods
.method public onAdClicked(Landroid/view/View;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/d$4;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/d;->c(Lcom/beizi/fusion/work/splash/d;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/beizi/fusion/work/splash/d$4;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/d;->d(Lcom/beizi/fusion/work/splash/d;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beizi/fusion/d/e;->r()I

    move-result p1

    const/4 p2, 0x2

    if-eq p1, p2, :cond_0

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/d$4;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/d;->e(Lcom/beizi/fusion/work/splash/d;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    iget-object p2, p0, Lcom/beizi/fusion/work/splash/d$4;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-virtual {p2}, Lcom/beizi/fusion/work/splash/d;->g()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/beizi/fusion/d/e;->d(Ljava/lang/String;)V

    .line 3
    :cond_0
    iget-boolean p1, p0, Lcom/beizi/fusion/work/splash/d$4;->b:Z

    if-nez p1, :cond_1

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/beizi/fusion/work/splash/d$4;->b:Z

    .line 5
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/d$4;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/d;->f(Lcom/beizi/fusion/work/splash/d;)V

    .line 6
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/d$4;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/d;->g(Lcom/beizi/fusion/work/splash/d;)V

    :cond_1
    return-void
.end method

.method public onAdShow(Landroid/view/View;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/d$4;->c:Lcom/beizi/fusion/work/splash/d;

    sget-object p2, Lcom/beizi/fusion/f/a;->c:Lcom/beizi/fusion/f/a;

    invoke-static {p1, p2}, Lcom/beizi/fusion/work/splash/d;->b(Lcom/beizi/fusion/work/splash/d;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/d$4;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/d;->h(Lcom/beizi/fusion/work/splash/d;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/beizi/fusion/work/splash/d$4;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/d;->i(Lcom/beizi/fusion/work/splash/d;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beizi/fusion/d/e;->r()I

    move-result p1

    const/4 p2, 0x2

    if-eq p1, p2, :cond_0

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/d$4;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/d;->j(Lcom/beizi/fusion/work/splash/d;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    iget-object p2, p0, Lcom/beizi/fusion/work/splash/d$4;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-virtual {p2}, Lcom/beizi/fusion/work/splash/d;->g()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/beizi/fusion/d/e;->b(Ljava/lang/String;)V

    .line 4
    :cond_0
    iget-boolean p1, p0, Lcom/beizi/fusion/work/splash/d$4;->a:Z

    if-nez p1, :cond_1

    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lcom/beizi/fusion/work/splash/d$4;->a:Z

    .line 6
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/d$4;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/d;->k(Lcom/beizi/fusion/work/splash/d;)V

    .line 7
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/d$4;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/d;->l(Lcom/beizi/fusion/work/splash/d;)V

    .line 8
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/d$4;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/d;->m(Lcom/beizi/fusion/work/splash/d;)V

    :cond_1
    return-void
.end method

.method public onRenderFail(Landroid/view/View;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/d$4;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-static {p1, p2, p3}, Lcom/beizi/fusion/work/splash/d;->b(Lcom/beizi/fusion/work/splash/d;Ljava/lang/String;I)V

    return-void
.end method

.method public onRenderSuccess(Landroid/view/View;FF)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showCsjNSTSplash Callback --> onRenderSuccess() width == "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", height == "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/d$4;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/d;->n(Lcom/beizi/fusion/work/splash/d;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, p2}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result p2

    int-to-float p2, p2

    invoke-static {v0, p2}, Lcom/beizi/fusion/work/splash/d;->a(Lcom/beizi/fusion/work/splash/d;F)F

    .line 3
    iget-object p2, p0, Lcom/beizi/fusion/work/splash/d$4;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-static {p2}, Lcom/beizi/fusion/work/splash/d;->n(Lcom/beizi/fusion/work/splash/d;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p3}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result p3

    int-to-float p3, p3

    invoke-static {p2, p3}, Lcom/beizi/fusion/work/splash/d;->b(Lcom/beizi/fusion/work/splash/d;F)F

    .line 4
    iget-object p2, p0, Lcom/beizi/fusion/work/splash/d$4;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-static {p2, p1}, Lcom/beizi/fusion/work/splash/d;->a(Lcom/beizi/fusion/work/splash/d;Landroid/view/View;)Landroid/view/View;

    .line 5
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/d$4;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/d;->o(Lcom/beizi/fusion/work/splash/d;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 6
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/d$4;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/d;->p(Lcom/beizi/fusion/work/splash/d;)V

    goto :goto_0

    .line 7
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/d$4;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/d;->q(Lcom/beizi/fusion/work/splash/d;)V

    :goto_0
    return-void
.end method
