.class Lcom/beizi/fusion/work/nativead/f$3;
.super Ljava/lang/Object;
.source "CsjNativeAdWorker.java"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd$ExpressAdInteractionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/nativead/f;->a(Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:Z

.field b:Z

.field final synthetic c:Lcom/beizi/fusion/work/nativead/f;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/nativead/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/nativead/f$3;->c:Lcom/beizi/fusion/work/nativead/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/beizi/fusion/work/nativead/f$3;->a:Z

    .line 3
    iput-boolean p1, p0, Lcom/beizi/fusion/work/nativead/f$3;->b:Z

    return-void
.end method


# virtual methods
.method public onAdClicked(Landroid/view/View;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/f$3;->c:Lcom/beizi/fusion/work/nativead/f;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/f;->c(Lcom/beizi/fusion/work/nativead/f;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/f$3;->c:Lcom/beizi/fusion/work/nativead/f;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/f;->d(Lcom/beizi/fusion/work/nativead/f;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beizi/fusion/d/e;->r()I

    move-result p1

    const/4 p2, 0x2

    if-eq p1, p2, :cond_0

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/f$3;->c:Lcom/beizi/fusion/work/nativead/f;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/f;->e(Lcom/beizi/fusion/work/nativead/f;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    iget-object p2, p0, Lcom/beizi/fusion/work/nativead/f$3;->c:Lcom/beizi/fusion/work/nativead/f;

    invoke-virtual {p2}, Lcom/beizi/fusion/work/nativead/f;->g()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/beizi/fusion/d/e;->d(Ljava/lang/String;)V

    .line 3
    :cond_0
    iget-boolean p1, p0, Lcom/beizi/fusion/work/nativead/f$3;->b:Z

    if-nez p1, :cond_1

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/beizi/fusion/work/nativead/f$3;->b:Z

    .line 5
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/f$3;->c:Lcom/beizi/fusion/work/nativead/f;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/f;->f(Lcom/beizi/fusion/work/nativead/f;)V

    .line 6
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/f$3;->c:Lcom/beizi/fusion/work/nativead/f;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/f;->g(Lcom/beizi/fusion/work/nativead/f;)V

    :cond_1
    return-void
.end method

.method public onAdShow(Landroid/view/View;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/f$3;->c:Lcom/beizi/fusion/work/nativead/f;

    sget-object p2, Lcom/beizi/fusion/f/a;->c:Lcom/beizi/fusion/f/a;

    invoke-static {p1, p2}, Lcom/beizi/fusion/work/nativead/f;->b(Lcom/beizi/fusion/work/nativead/f;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/f$3;->c:Lcom/beizi/fusion/work/nativead/f;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/f;->h(Lcom/beizi/fusion/work/nativead/f;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/f$3;->c:Lcom/beizi/fusion/work/nativead/f;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/f;->i(Lcom/beizi/fusion/work/nativead/f;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beizi/fusion/d/e;->r()I

    move-result p1

    const/4 p2, 0x2

    if-eq p1, p2, :cond_0

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/f$3;->c:Lcom/beizi/fusion/work/nativead/f;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/f;->j(Lcom/beizi/fusion/work/nativead/f;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    iget-object p2, p0, Lcom/beizi/fusion/work/nativead/f$3;->c:Lcom/beizi/fusion/work/nativead/f;

    invoke-virtual {p2}, Lcom/beizi/fusion/work/nativead/f;->g()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/beizi/fusion/d/e;->b(Ljava/lang/String;)V

    .line 4
    :cond_0
    iget-boolean p1, p0, Lcom/beizi/fusion/work/nativead/f$3;->a:Z

    if-nez p1, :cond_1

    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lcom/beizi/fusion/work/nativead/f$3;->a:Z

    .line 6
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/f$3;->c:Lcom/beizi/fusion/work/nativead/f;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/f;->k(Lcom/beizi/fusion/work/nativead/f;)V

    .line 7
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/f$3;->c:Lcom/beizi/fusion/work/nativead/f;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/f;->l(Lcom/beizi/fusion/work/nativead/f;)V

    .line 8
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/f$3;->c:Lcom/beizi/fusion/work/nativead/f;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/f;->m(Lcom/beizi/fusion/work/nativead/f;)V

    :cond_1
    return-void
.end method

.method public onRenderFail(Landroid/view/View;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/f$3;->c:Lcom/beizi/fusion/work/nativead/f;

    invoke-static {p1, p2, p3}, Lcom/beizi/fusion/work/nativead/f;->b(Lcom/beizi/fusion/work/nativead/f;Ljava/lang/String;I)V

    return-void
.end method

.method public onRenderSuccess(Landroid/view/View;FF)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/beizi/fusion/work/nativead/f$3;->c:Lcom/beizi/fusion/work/nativead/f;

    invoke-static {p2, p1}, Lcom/beizi/fusion/work/nativead/f;->a(Lcom/beizi/fusion/work/nativead/f;Landroid/view/View;)Landroid/view/View;

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/f$3;->c:Lcom/beizi/fusion/work/nativead/f;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/f;->n(Lcom/beizi/fusion/work/nativead/f;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/f$3;->c:Lcom/beizi/fusion/work/nativead/f;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/f;->o(Lcom/beizi/fusion/work/nativead/f;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/f$3;->c:Lcom/beizi/fusion/work/nativead/f;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/f;->p(Lcom/beizi/fusion/work/nativead/f;)V

    :goto_0
    return-void
.end method
