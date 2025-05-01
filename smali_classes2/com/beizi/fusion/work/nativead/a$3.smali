.class Lcom/beizi/fusion/work/nativead/a$3;
.super Ljava/lang/Object;
.source "BaiduNativeAdWorker.java"

# interfaces
.implements Lcom/baidu/mobads/sdk/api/ExpressResponse$ExpressInteractionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/nativead/a;->aG()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:Z

.field b:Z

.field final synthetic c:Lcom/beizi/fusion/work/nativead/a;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/nativead/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/nativead/a$3;->c:Lcom/beizi/fusion/work/nativead/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/beizi/fusion/work/nativead/a$3;->a:Z

    .line 3
    iput-boolean p1, p0, Lcom/beizi/fusion/work/nativead/a$3;->b:Z

    return-void
.end method


# virtual methods
.method public onAdClick()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/a$3;->c:Lcom/beizi/fusion/work/nativead/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/a;->d(Lcom/beizi/fusion/work/nativead/a;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/a$3;->c:Lcom/beizi/fusion/work/nativead/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/a;->e(Lcom/beizi/fusion/work/nativead/a;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/a$3;->c:Lcom/beizi/fusion/work/nativead/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/a;->f(Lcom/beizi/fusion/work/nativead/a;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/nativead/a$3;->c:Lcom/beizi/fusion/work/nativead/a;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/nativead/a;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->d(Ljava/lang/String;)V

    .line 3
    :cond_0
    iget-boolean v0, p0, Lcom/beizi/fusion/work/nativead/a$3;->b:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/beizi/fusion/work/nativead/a$3;->b:Z

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/a$3;->c:Lcom/beizi/fusion/work/nativead/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/a;->g(Lcom/beizi/fusion/work/nativead/a;)V

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/a$3;->c:Lcom/beizi/fusion/work/nativead/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/a;->h(Lcom/beizi/fusion/work/nativead/a;)V

    :cond_1
    return-void
.end method

.method public onAdExposed()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/a$3;->c:Lcom/beizi/fusion/work/nativead/a;

    sget-object v1, Lcom/beizi/fusion/f/a;->c:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/nativead/a;->b(Lcom/beizi/fusion/work/nativead/a;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/a$3;->c:Lcom/beizi/fusion/work/nativead/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/a;->i(Lcom/beizi/fusion/work/nativead/a;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/a$3;->c:Lcom/beizi/fusion/work/nativead/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/a;->j(Lcom/beizi/fusion/work/nativead/a;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/a$3;->c:Lcom/beizi/fusion/work/nativead/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/a;->k(Lcom/beizi/fusion/work/nativead/a;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/nativead/a$3;->c:Lcom/beizi/fusion/work/nativead/a;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/nativead/a;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->b(Ljava/lang/String;)V

    .line 4
    :cond_0
    iget-boolean v0, p0, Lcom/beizi/fusion/work/nativead/a$3;->a:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/beizi/fusion/work/nativead/a$3;->a:Z

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/a$3;->c:Lcom/beizi/fusion/work/nativead/a;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/nativead/a;->az()V

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/a$3;->c:Lcom/beizi/fusion/work/nativead/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/a;->l(Lcom/beizi/fusion/work/nativead/a;)V

    .line 8
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/a$3;->c:Lcom/beizi/fusion/work/nativead/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/a;->m(Lcom/beizi/fusion/work/nativead/a;)V

    .line 9
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/a$3;->c:Lcom/beizi/fusion/work/nativead/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/a;->n(Lcom/beizi/fusion/work/nativead/a;)V

    :cond_1
    return-void
.end method

.method public onAdRenderFail(Landroid/view/View;Ljava/lang/String;I)V
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "showBdNativeAd Callback --> onAdRenderFail() error:"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ";code:"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/a$3;->c:Lcom/beizi/fusion/work/nativead/a;

    invoke-static {p1, p2, p3}, Lcom/beizi/fusion/work/nativead/a;->c(Lcom/beizi/fusion/work/nativead/a;Ljava/lang/String;I)V

    return-void
.end method

.method public onAdRenderSuccess(Landroid/view/View;FF)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/a$3;->c:Lcom/beizi/fusion/work/nativead/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/a;->b(Lcom/beizi/fusion/work/nativead/a;)Lcom/baidu/mobads/sdk/api/ExpressResponse;

    move-result-object p2

    invoke-interface {p2}, Lcom/baidu/mobads/sdk/api/ExpressResponse;->getExpressAdView()Landroid/view/View;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/beizi/fusion/work/nativead/a;->a(Lcom/beizi/fusion/work/nativead/a;Landroid/view/View;)Landroid/view/View;

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/a$3;->c:Lcom/beizi/fusion/work/nativead/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/a;->o(Lcom/beizi/fusion/work/nativead/a;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/a$3;->c:Lcom/beizi/fusion/work/nativead/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/a;->p(Lcom/beizi/fusion/work/nativead/a;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/a$3;->c:Lcom/beizi/fusion/work/nativead/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/a;->q(Lcom/beizi/fusion/work/nativead/a;)V

    :goto_0
    return-void
.end method

.method public onAdUnionClick()V
    .locals 0

    return-void
.end method
