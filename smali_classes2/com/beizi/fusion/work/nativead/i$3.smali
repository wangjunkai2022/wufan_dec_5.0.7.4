.class Lcom/beizi/fusion/work/nativead/i$3;
.super Ljava/lang/Object;
.source "KsNativeAdWorker.java"

# interfaces
.implements Lcom/kwad/sdk/api/KsFeedAd$AdInteractionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/nativead/i;->a(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:Z

.field b:Z

.field final synthetic c:Lcom/beizi/fusion/work/nativead/i;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/nativead/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/nativead/i$3;->c:Lcom/beizi/fusion/work/nativead/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/beizi/fusion/work/nativead/i$3;->a:Z

    .line 3
    iput-boolean p1, p0, Lcom/beizi/fusion/work/nativead/i$3;->b:Z

    return-void
.end method


# virtual methods
.method public onAdClicked()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/i$3;->c:Lcom/beizi/fusion/work/nativead/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/i;->e(Lcom/beizi/fusion/work/nativead/i;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/i$3;->c:Lcom/beizi/fusion/work/nativead/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/i;->f(Lcom/beizi/fusion/work/nativead/i;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/i$3;->c:Lcom/beizi/fusion/work/nativead/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/i;->g(Lcom/beizi/fusion/work/nativead/i;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/nativead/i$3;->c:Lcom/beizi/fusion/work/nativead/i;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/nativead/i;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->d(Ljava/lang/String;)V

    .line 3
    :cond_0
    iget-boolean v0, p0, Lcom/beizi/fusion/work/nativead/i$3;->b:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/beizi/fusion/work/nativead/i$3;->b:Z

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/i$3;->c:Lcom/beizi/fusion/work/nativead/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/i;->h(Lcom/beizi/fusion/work/nativead/i;)V

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/i$3;->c:Lcom/beizi/fusion/work/nativead/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/i;->i(Lcom/beizi/fusion/work/nativead/i;)V

    :cond_1
    return-void
.end method

.method public onAdShow()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/i$3;->c:Lcom/beizi/fusion/work/nativead/i;

    sget-object v1, Lcom/beizi/fusion/f/a;->c:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/nativead/i;->b(Lcom/beizi/fusion/work/nativead/i;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/i$3;->c:Lcom/beizi/fusion/work/nativead/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/i;->j(Lcom/beizi/fusion/work/nativead/i;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/i$3;->c:Lcom/beizi/fusion/work/nativead/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/i;->k(Lcom/beizi/fusion/work/nativead/i;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/i$3;->c:Lcom/beizi/fusion/work/nativead/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/i;->l(Lcom/beizi/fusion/work/nativead/i;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/nativead/i$3;->c:Lcom/beizi/fusion/work/nativead/i;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/nativead/i;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->b(Ljava/lang/String;)V

    .line 4
    :cond_0
    iget-boolean v0, p0, Lcom/beizi/fusion/work/nativead/i$3;->a:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/beizi/fusion/work/nativead/i$3;->a:Z

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/i$3;->c:Lcom/beizi/fusion/work/nativead/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/i;->m(Lcom/beizi/fusion/work/nativead/i;)V

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/i$3;->c:Lcom/beizi/fusion/work/nativead/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/i;->n(Lcom/beizi/fusion/work/nativead/i;)V

    .line 8
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/i$3;->c:Lcom/beizi/fusion/work/nativead/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/i;->o(Lcom/beizi/fusion/work/nativead/i;)V

    :cond_1
    return-void
.end method

.method public onDislikeClicked()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/i$3;->c:Lcom/beizi/fusion/work/nativead/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/i;->p(Lcom/beizi/fusion/work/nativead/i;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/i$3;->c:Lcom/beizi/fusion/work/nativead/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/i;->r(Lcom/beizi/fusion/work/nativead/i;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/nativead/i$3;->c:Lcom/beizi/fusion/work/nativead/i;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/nativead/i;->g()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/beizi/fusion/work/nativead/i$3;->c:Lcom/beizi/fusion/work/nativead/i;

    invoke-static {v2}, Lcom/beizi/fusion/work/nativead/i;->q(Lcom/beizi/fusion/work/nativead/i;)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/beizi/fusion/d/e;->b(Ljava/lang/String;Landroid/view/View;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/i$3;->c:Lcom/beizi/fusion/work/nativead/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/i;->s(Lcom/beizi/fusion/work/nativead/i;)V

    return-void
.end method

.method public onDownloadTipsDialogDismiss()V
    .locals 0

    return-void
.end method

.method public onDownloadTipsDialogShow()V
    .locals 0

    return-void
.end method
