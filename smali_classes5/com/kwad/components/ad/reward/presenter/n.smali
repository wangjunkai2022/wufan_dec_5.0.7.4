.class public final Lcom/kwad/components/ad/reward/presenter/n;
.super Lcom/kwad/components/ad/reward/presenter/b;
.source "SourceFile"


# instance fields
.field private gO:Lcom/kwad/components/core/video/l;

.field private final gP:Lcom/kwad/components/ad/reward/e/m;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/b;-><init>()V

    .line 2
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/n$2;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/presenter/n$2;-><init>(Lcom/kwad/components/ad/reward/presenter/n;)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/n;->gO:Lcom/kwad/components/core/video/l;

    .line 3
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/n$3;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/presenter/n$3;-><init>(Lcom/kwad/components/ad/reward/presenter/n;)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/n;->gP:Lcom/kwad/components/ad/reward/e/m;

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/reward/presenter/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/n;->hx()V

    return-void
.end method

.method private hx()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v1, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-boolean v0, v0, Lcom/kwad/components/ad/reward/g;->pe:Z

    invoke-static {v1, v0}, Lcom/kwad/components/core/s/j;->d(Lcom/kwad/sdk/core/response/model/AdTemplate;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v1, v0, Lcom/kwad/components/core/l/a;->mContext:Landroid/content/Context;

    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v1, v0}, Lcom/kwad/components/core/s/j;->e(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/i;->x(Lcom/kwad/components/ad/reward/g;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v1, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-boolean v0, v0, Lcom/kwad/components/ad/reward/g;->pe:Z

    .line 4
    invoke-static {v1, v0}, Lcom/kwad/components/core/s/j;->d(Lcom/kwad/sdk/core/response/model/AdTemplate;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/g;->fC()V

    return-void

    .line 6
    :cond_2
    :goto_0
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/n$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/presenter/n$1;-><init>(Lcom/kwad/components/ad/reward/presenter/n;)V

    const-wide/16 v1, 0xc8

    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/utils/bo;->runOnUiThreadDelay(Ljava/lang/Runnable;J)V

    return-void
.end method


# virtual methods
.method public final aj()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/reward/presenter/b;->aj()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->oK:Lcom/kwad/components/ad/reward/m/e;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/n;->gO:Lcom/kwad/components/core/video/l;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/m/e;->a(Lcom/kwad/components/core/video/l;)V

    .line 3
    invoke-static {}, Lcom/kwad/components/ad/reward/c;->ff()Lcom/kwad/components/ad/reward/c;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/n;->gP:Lcom/kwad/components/ad/reward/e/m;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/c;->a(Lcom/kwad/components/ad/reward/e/m;)V

    return-void
.end method

.method public final onUnbind()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onUnbind()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->oK:Lcom/kwad/components/ad/reward/m/e;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/n;->gO:Lcom/kwad/components/core/video/l;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/m/e;->b(Lcom/kwad/components/core/video/l;)V

    .line 3
    invoke-static {}, Lcom/kwad/components/ad/reward/c;->ff()Lcom/kwad/components/ad/reward/c;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/n;->gP:Lcom/kwad/components/ad/reward/e/m;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/c;->b(Lcom/kwad/components/ad/reward/e/m;)V

    return-void
.end method
