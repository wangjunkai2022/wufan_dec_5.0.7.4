.class Lcom/beizi/fusion/work/b/a$4;
.super Ljava/lang/Object;
.source "CsjDrawAdWorker.java"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd$ExpressAdInteractionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/b/a;->a(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:Z

.field b:Z

.field final synthetic c:Lcom/beizi/fusion/work/b/a;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/b/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/b/a$4;->c:Lcom/beizi/fusion/work/b/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/beizi/fusion/work/b/a$4;->a:Z

    .line 3
    iput-boolean p1, p0, Lcom/beizi/fusion/work/b/a$4;->b:Z

    return-void
.end method


# virtual methods
.method public onAdClicked(Landroid/view/View;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/b/a$4;->c:Lcom/beizi/fusion/work/b/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/b/a;->d(Lcom/beizi/fusion/work/b/a;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/beizi/fusion/work/b/a$4;->c:Lcom/beizi/fusion/work/b/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/b/a;->e(Lcom/beizi/fusion/work/b/a;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beizi/fusion/d/e;->r()I

    move-result p1

    const/4 p2, 0x2

    if-eq p1, p2, :cond_0

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/b/a$4;->c:Lcom/beizi/fusion/work/b/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/b/a;->f(Lcom/beizi/fusion/work/b/a;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    iget-object p2, p0, Lcom/beizi/fusion/work/b/a$4;->c:Lcom/beizi/fusion/work/b/a;

    invoke-virtual {p2}, Lcom/beizi/fusion/work/b/a;->g()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/beizi/fusion/d/e;->d(Ljava/lang/String;)V

    .line 3
    :cond_0
    iget-boolean p1, p0, Lcom/beizi/fusion/work/b/a$4;->b:Z

    if-nez p1, :cond_1

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/beizi/fusion/work/b/a$4;->b:Z

    .line 5
    iget-object p1, p0, Lcom/beizi/fusion/work/b/a$4;->c:Lcom/beizi/fusion/work/b/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/b/a;->g(Lcom/beizi/fusion/work/b/a;)V

    .line 6
    iget-object p1, p0, Lcom/beizi/fusion/work/b/a$4;->c:Lcom/beizi/fusion/work/b/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/b/a;->h(Lcom/beizi/fusion/work/b/a;)V

    :cond_1
    return-void
.end method

.method public onAdShow(Landroid/view/View;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/b/a$4;->c:Lcom/beizi/fusion/work/b/a;

    sget-object p2, Lcom/beizi/fusion/f/a;->c:Lcom/beizi/fusion/f/a;

    invoke-static {p1, p2}, Lcom/beizi/fusion/work/b/a;->b(Lcom/beizi/fusion/work/b/a;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/b/a$4;->c:Lcom/beizi/fusion/work/b/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/b/a;->i(Lcom/beizi/fusion/work/b/a;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/beizi/fusion/work/b/a$4;->c:Lcom/beizi/fusion/work/b/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/b/a;->j(Lcom/beizi/fusion/work/b/a;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beizi/fusion/d/e;->r()I

    move-result p1

    const/4 p2, 0x2

    if-eq p1, p2, :cond_0

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/work/b/a$4;->c:Lcom/beizi/fusion/work/b/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/b/a;->k(Lcom/beizi/fusion/work/b/a;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    iget-object p2, p0, Lcom/beizi/fusion/work/b/a$4;->c:Lcom/beizi/fusion/work/b/a;

    invoke-virtual {p2}, Lcom/beizi/fusion/work/b/a;->g()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/beizi/fusion/d/e;->b(Ljava/lang/String;)V

    .line 4
    :cond_0
    iget-boolean p1, p0, Lcom/beizi/fusion/work/b/a$4;->a:Z

    if-nez p1, :cond_1

    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lcom/beizi/fusion/work/b/a$4;->a:Z

    .line 6
    iget-object p1, p0, Lcom/beizi/fusion/work/b/a$4;->c:Lcom/beizi/fusion/work/b/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/b/a;->l(Lcom/beizi/fusion/work/b/a;)V

    .line 7
    iget-object p1, p0, Lcom/beizi/fusion/work/b/a$4;->c:Lcom/beizi/fusion/work/b/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/b/a;->m(Lcom/beizi/fusion/work/b/a;)V

    .line 8
    iget-object p1, p0, Lcom/beizi/fusion/work/b/a$4;->c:Lcom/beizi/fusion/work/b/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/b/a;->n(Lcom/beizi/fusion/work/b/a;)V

    :cond_1
    return-void
.end method

.method public onRenderFail(Landroid/view/View;Ljava/lang/String;I)V
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "showCsjDrawAd Callback --> onRenderFail() code="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", error="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/b/a$4;->c:Lcom/beizi/fusion/work/b/a;

    invoke-static {p1, p2, p3}, Lcom/beizi/fusion/work/b/a;->c(Lcom/beizi/fusion/work/b/a;Ljava/lang/String;I)V

    return-void
.end method

.method public onRenderSuccess(Landroid/view/View;FF)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/beizi/fusion/work/b/a$4;->c:Lcom/beizi/fusion/work/b/a;

    invoke-static {p2, p1}, Lcom/beizi/fusion/work/b/a;->a(Lcom/beizi/fusion/work/b/a;Landroid/view/View;)Landroid/view/View;

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/b/a$4;->c:Lcom/beizi/fusion/work/b/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/b/a;->o(Lcom/beizi/fusion/work/b/a;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/work/b/a$4;->c:Lcom/beizi/fusion/work/b/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/b/a;->p(Lcom/beizi/fusion/work/b/a;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/work/b/a$4;->c:Lcom/beizi/fusion/work/b/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/b/a;->q(Lcom/beizi/fusion/work/b/a;)V

    :goto_0
    return-void
.end method
