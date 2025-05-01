.class Lcom/beizi/fusion/work/a/c$3;
.super Ljava/lang/Object;
.source "CsjBannerAdWorker.java"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd$ExpressAdInteractionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/a/c;->a(Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/a/c;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/a/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/a/c$3;->a:Lcom/beizi/fusion/work/a/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdClicked(Landroid/view/View;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/a/c$3;->a:Lcom/beizi/fusion/work/a/c;

    invoke-static {p1}, Lcom/beizi/fusion/work/a/c;->c(Lcom/beizi/fusion/work/a/c;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/a/c$3;->a:Lcom/beizi/fusion/work/a/c;

    invoke-static {p1}, Lcom/beizi/fusion/work/a/c;->d(Lcom/beizi/fusion/work/a/c;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    iget-object p2, p0, Lcom/beizi/fusion/work/a/c$3;->a:Lcom/beizi/fusion/work/a/c;

    invoke-virtual {p2}, Lcom/beizi/fusion/work/a/c;->g()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/beizi/fusion/d/e;->d(Ljava/lang/String;)V

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/work/a/c$3;->a:Lcom/beizi/fusion/work/a/c;

    invoke-static {p1}, Lcom/beizi/fusion/work/a/c;->e(Lcom/beizi/fusion/work/a/c;)V

    .line 4
    iget-object p1, p0, Lcom/beizi/fusion/work/a/c$3;->a:Lcom/beizi/fusion/work/a/c;

    invoke-static {p1}, Lcom/beizi/fusion/work/a/c;->f(Lcom/beizi/fusion/work/a/c;)V

    return-void
.end method

.method public onAdShow(Landroid/view/View;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/a/c$3;->a:Lcom/beizi/fusion/work/a/c;

    sget-object p2, Lcom/beizi/fusion/f/a;->c:Lcom/beizi/fusion/f/a;

    invoke-static {p1, p2}, Lcom/beizi/fusion/work/a/c;->b(Lcom/beizi/fusion/work/a/c;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/a/c$3;->a:Lcom/beizi/fusion/work/a/c;

    invoke-static {p1}, Lcom/beizi/fusion/work/a/c;->g(Lcom/beizi/fusion/work/a/c;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/work/a/c$3;->a:Lcom/beizi/fusion/work/a/c;

    invoke-static {p1}, Lcom/beizi/fusion/work/a/c;->h(Lcom/beizi/fusion/work/a/c;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    iget-object p2, p0, Lcom/beizi/fusion/work/a/c$3;->a:Lcom/beizi/fusion/work/a/c;

    invoke-virtual {p2}, Lcom/beizi/fusion/work/a/c;->g()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/beizi/fusion/d/e;->b(Ljava/lang/String;)V

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/work/a/c$3;->a:Lcom/beizi/fusion/work/a/c;

    invoke-static {p1}, Lcom/beizi/fusion/work/a/c;->i(Lcom/beizi/fusion/work/a/c;)V

    .line 5
    iget-object p1, p0, Lcom/beizi/fusion/work/a/c$3;->a:Lcom/beizi/fusion/work/a/c;

    invoke-static {p1}, Lcom/beizi/fusion/work/a/c;->j(Lcom/beizi/fusion/work/a/c;)V

    .line 6
    iget-object p1, p0, Lcom/beizi/fusion/work/a/c$3;->a:Lcom/beizi/fusion/work/a/c;

    invoke-static {p1}, Lcom/beizi/fusion/work/a/c;->k(Lcom/beizi/fusion/work/a/c;)V

    return-void
.end method

.method public onRenderFail(Landroid/view/View;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/a/c$3;->a:Lcom/beizi/fusion/work/a/c;

    invoke-static {p1, p2, p3}, Lcom/beizi/fusion/work/a/c;->b(Lcom/beizi/fusion/work/a/c;Ljava/lang/String;I)V

    return-void
.end method

.method public onRenderSuccess(Landroid/view/View;FF)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showCsjBannerAd Callback --> onRenderSuccess() width== "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p2, ", height== "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 2
    iget-object p2, p0, Lcom/beizi/fusion/work/a/c$3;->a:Lcom/beizi/fusion/work/a/c;

    invoke-static {p2, p1}, Lcom/beizi/fusion/work/a/c;->a(Lcom/beizi/fusion/work/a/c;Landroid/view/View;)Landroid/view/View;

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/work/a/c$3;->a:Lcom/beizi/fusion/work/a/c;

    invoke-static {p1}, Lcom/beizi/fusion/work/a/c;->l(Lcom/beizi/fusion/work/a/c;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 4
    iget-object p1, p0, Lcom/beizi/fusion/work/a/c$3;->a:Lcom/beizi/fusion/work/a/c;

    invoke-static {p1}, Lcom/beizi/fusion/work/a/c;->m(Lcom/beizi/fusion/work/a/c;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/work/a/c$3;->a:Lcom/beizi/fusion/work/a/c;

    invoke-static {p1}, Lcom/beizi/fusion/work/a/c;->n(Lcom/beizi/fusion/work/a/c;)V

    :goto_0
    return-void
.end method
