.class Lcom/beizi/fusion/work/b/b$3;
.super Ljava/lang/Object;
.source "KsDrawAdWorker.java"

# interfaces
.implements Lcom/kwad/sdk/api/KsDrawAd$AdInteractionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/b/b;->a(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:Z

.field b:Z

.field final synthetic c:Lcom/beizi/fusion/work/b/b;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/b/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/b/b$3;->c:Lcom/beizi/fusion/work/b/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/beizi/fusion/work/b/b$3;->a:Z

    .line 3
    iput-boolean p1, p0, Lcom/beizi/fusion/work/b/b$3;->b:Z

    return-void
.end method


# virtual methods
.method public onAdClicked()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/b/b$3;->c:Lcom/beizi/fusion/work/b/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/b/b;->e(Lcom/beizi/fusion/work/b/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/b/b$3;->c:Lcom/beizi/fusion/work/b/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/b/b;->f(Lcom/beizi/fusion/work/b/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/b/b$3;->c:Lcom/beizi/fusion/work/b/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/b/b;->g(Lcom/beizi/fusion/work/b/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/b/b$3;->c:Lcom/beizi/fusion/work/b/b;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/b/b;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->d(Ljava/lang/String;)V

    .line 3
    :cond_0
    iget-boolean v0, p0, Lcom/beizi/fusion/work/b/b$3;->b:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/beizi/fusion/work/b/b$3;->b:Z

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/b/b$3;->c:Lcom/beizi/fusion/work/b/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/b/b;->h(Lcom/beizi/fusion/work/b/b;)V

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/b/b$3;->c:Lcom/beizi/fusion/work/b/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/b/b;->i(Lcom/beizi/fusion/work/b/b;)V

    :cond_1
    return-void
.end method

.method public onAdShow()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/b/b$3;->c:Lcom/beizi/fusion/work/b/b;

    sget-object v1, Lcom/beizi/fusion/f/a;->c:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/b/b;->b(Lcom/beizi/fusion/work/b/b;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/b/b$3;->c:Lcom/beizi/fusion/work/b/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/b/b;->j(Lcom/beizi/fusion/work/b/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/b/b$3;->c:Lcom/beizi/fusion/work/b/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/b/b;->k(Lcom/beizi/fusion/work/b/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/b/b$3;->c:Lcom/beizi/fusion/work/b/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/b/b;->l(Lcom/beizi/fusion/work/b/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/b/b$3;->c:Lcom/beizi/fusion/work/b/b;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/b/b;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->b(Ljava/lang/String;)V

    .line 4
    :cond_0
    iget-boolean v0, p0, Lcom/beizi/fusion/work/b/b$3;->a:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/beizi/fusion/work/b/b$3;->a:Z

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/b/b$3;->c:Lcom/beizi/fusion/work/b/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/b/b;->m(Lcom/beizi/fusion/work/b/b;)V

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/work/b/b$3;->c:Lcom/beizi/fusion/work/b/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/b/b;->n(Lcom/beizi/fusion/work/b/b;)V

    .line 8
    iget-object v0, p0, Lcom/beizi/fusion/work/b/b$3;->c:Lcom/beizi/fusion/work/b/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/b/b;->o(Lcom/beizi/fusion/work/b/b;)V

    :cond_1
    return-void
.end method

.method public onVideoPlayEnd()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/b/b$3;->c:Lcom/beizi/fusion/work/b/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/b/b;->p(Lcom/beizi/fusion/work/b/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/b/b$3;->c:Lcom/beizi/fusion/work/b/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/b/b;->q(Lcom/beizi/fusion/work/b/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->l()V

    :cond_0
    return-void
.end method

.method public onVideoPlayError()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/b/b$3;->c:Lcom/beizi/fusion/work/b/b;

    const-string v1, "sdk custom error "

    const-string v2, "onVideoPlayError"

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const v2, 0x18697

    invoke-static {v0, v1, v2}, Lcom/beizi/fusion/work/b/b;->b(Lcom/beizi/fusion/work/b/b;Ljava/lang/String;I)V

    return-void
.end method

.method public onVideoPlayPause()V
    .locals 0

    return-void
.end method

.method public onVideoPlayResume()V
    .locals 0

    return-void
.end method

.method public onVideoPlayStart()V
    .locals 0

    return-void
.end method
