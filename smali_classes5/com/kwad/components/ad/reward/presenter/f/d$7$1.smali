.class final Lcom/kwad/components/ad/reward/presenter/f/d$7$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/reward/presenter/f/d$7;->bL()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic ww:Lcom/kwad/components/ad/reward/presenter/f/d$7;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/reward/presenter/f/d$7;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/presenter/f/d$7$1;->ww:Lcom/kwad/components/ad/reward/presenter/f/d$7;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/b/o;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/tachikoma/b/o;-><init>()V

    const/4 v1, 0x1

    .line 2
    iput v1, v0, Lcom/kwad/components/core/webview/tachikoma/b/o;->scene:I

    .line 3
    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/f/d$7$1;->ww:Lcom/kwad/components/ad/reward/presenter/f/d$7;

    iget-object v1, v1, Lcom/kwad/components/ad/reward/presenter/f/d$7;->wv:Lcom/kwad/components/ad/reward/presenter/f/d;

    invoke-static {v1}, Lcom/kwad/components/ad/reward/presenter/f/d;->N(Lcom/kwad/components/ad/reward/presenter/f/d;)Lcom/kwad/components/ad/reward/k/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/kwad/components/ad/reward/k/j;->a(Lcom/kwad/components/core/webview/tachikoma/b/o;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/d$7$1;->ww:Lcom/kwad/components/ad/reward/presenter/f/d$7;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/presenter/f/d$7;->wv:Lcom/kwad/components/ad/reward/presenter/f/d;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/f/d;->O(Lcom/kwad/components/ad/reward/presenter/f/d;)Lcom/kwad/components/core/webview/tachikoma/a/h;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/d$7$1;->ww:Lcom/kwad/components/ad/reward/presenter/f/d$7;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/presenter/f/d$7;->wv:Lcom/kwad/components/ad/reward/presenter/f/d;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/f/d;->P(Lcom/kwad/components/ad/reward/presenter/f/d;)Lcom/kwad/components/ad/reward/g;

    move-result-object v0

    iget-boolean v0, v0, Lcom/kwad/components/ad/reward/g;->pB:Z

    .line 6
    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/f/d$7$1;->ww:Lcom/kwad/components/ad/reward/presenter/f/d$7;

    iget-object v1, v1, Lcom/kwad/components/ad/reward/presenter/f/d$7;->wv:Lcom/kwad/components/ad/reward/presenter/f/d;

    invoke-static {v1}, Lcom/kwad/components/ad/reward/presenter/f/d;->O(Lcom/kwad/components/ad/reward/presenter/f/d;)Lcom/kwad/components/core/webview/tachikoma/a/h;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/kwad/components/core/webview/tachikoma/a/h;->aV(Z)V

    :cond_0
    return-void
.end method
