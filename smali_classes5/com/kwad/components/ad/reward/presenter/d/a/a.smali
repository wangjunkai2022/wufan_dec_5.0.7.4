.class public final Lcom/kwad/components/ad/reward/presenter/d/a/a;
.super Lcom/kwad/components/ad/reward/presenter/b;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/ad/l/a$b;


# instance fields
.field private cR:Lcom/kwad/sdk/core/webview/d/a/a;

.field private da:Landroid/widget/FrameLayout;

.field private gO:Lcom/kwad/components/core/video/l;

.field private mPlayEndPageListener:Lcom/kwad/components/ad/reward/e/g;

.field private sv:Lcom/kwad/components/core/video/l;

.field private sw:Lcom/kwad/components/core/video/l;

.field private volatile vA:J

.field private volatile vB:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/b;-><init>()V

    const-wide/16 v0, 0x0

    .line 2
    iput-wide v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/a;->vA:J

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/a;->vB:Z

    .line 4
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/d/a/a$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/presenter/d/a/a$1;-><init>(Lcom/kwad/components/ad/reward/presenter/d/a/a;)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/a;->sw:Lcom/kwad/components/core/video/l;

    .line 5
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/d/a/a$2;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/presenter/d/a/a$2;-><init>(Lcom/kwad/components/ad/reward/presenter/d/a/a;)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/a;->gO:Lcom/kwad/components/core/video/l;

    .line 6
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/d/a/a$4;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/presenter/d/a/a$4;-><init>(Lcom/kwad/components/ad/reward/presenter/d/a/a;)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/a;->mPlayEndPageListener:Lcom/kwad/components/ad/reward/e/g;

    .line 7
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/d/a/a$5;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/presenter/d/a/a$5;-><init>(Lcom/kwad/components/ad/reward/presenter/d/a/a;)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/a;->cR:Lcom/kwad/sdk/core/webview/d/a/a;

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/reward/presenter/d/a/a;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/kwad/components/ad/reward/presenter/d/a/a;->vA:J

    return-wide p1
.end method

.method static synthetic a(Lcom/kwad/components/ad/reward/presenter/d/a/a;)Lcom/kwad/components/ad/reward/g;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    return-object p0
.end method

.method static synthetic a(Lcom/kwad/components/ad/reward/presenter/d/a/a;Z)Z
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/presenter/d/a/a;->vB:Z

    return p1
.end method

.method static synthetic b(Lcom/kwad/components/ad/reward/presenter/d/a/a;)Lcom/kwad/components/ad/reward/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    return-object p0
.end method

.method static synthetic c(Lcom/kwad/components/ad/reward/presenter/d/a/a;)Lcom/kwad/components/ad/reward/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    return-object p0
.end method

.method static synthetic d(Lcom/kwad/components/ad/reward/presenter/d/a/a;)Lcom/kwad/components/ad/reward/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    return-object p0
.end method

.method static synthetic e(Lcom/kwad/components/ad/reward/presenter/d/a/a;)Lcom/kwad/components/ad/reward/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    return-object p0
.end method


# virtual methods
.method public final aj()V
    .locals 4

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/reward/presenter/b;->aj()V

    const-wide/16 v0, 0x0

    .line 2
    iput-wide v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/a;->vA:J

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/a;->vB:Z

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v1, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 5
    iget-object v2, v0, Lcom/kwad/components/ad/reward/g;->oP:Lcom/kwad/components/ad/l/a;

    .line 6
    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->oK:Lcom/kwad/components/ad/reward/m/e;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/m/e;->jN()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/a;->sw:Lcom/kwad/components/core/video/l;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/a;->gO:Lcom/kwad/components/core/video/l;

    :goto_0
    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/a;->sv:Lcom/kwad/components/core/video/l;

    if-eqz v2, :cond_1

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    const/4 v3, 0x1

    iput-boolean v3, v0, Lcom/kwad/components/ad/reward/g;->pk:Z

    .line 9
    invoke-virtual {v2, p0}, Lcom/kwad/components/ad/l/a;->a(Lcom/kwad/components/ad/l/a$b;)V

    .line 10
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/a;->cR:Lcom/kwad/sdk/core/webview/d/a/a;

    invoke-virtual {v2, v0}, Lcom/kwad/components/ad/l/a;->a(Lcom/kwad/sdk/core/webview/d/a/a;)V

    .line 11
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/a;->da:Landroid/widget/FrameLayout;

    iget-object v3, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v3, v3, Lcom/kwad/components/ad/reward/g;->mRootContainer:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    invoke-virtual {v2, v0, v3, v1}, Lcom/kwad/components/ad/l/a;->a(Landroid/widget/FrameLayout;Lcom/kwad/sdk/core/view/AdBaseFrameLayout;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 12
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/d/a/a$3;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/presenter/d/a/a$3;-><init>(Lcom/kwad/components/ad/reward/presenter/d/a/a;)V

    invoke-virtual {v2, v0}, Lcom/kwad/components/ad/l/a;->a(Lcom/kwad/components/ad/l/a$a;)V

    .line 13
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    invoke-virtual {v0}, Lcom/kwad/components/core/l/a;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/kwad/components/ad/l/a;->setActivity(Landroid/app/Activity;)V

    .line 14
    invoke-virtual {v2}, Lcom/kwad/components/ad/l/a;->ay()V

    .line 15
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/d/a/a;->mPlayEndPageListener:Lcom/kwad/components/ad/reward/e/g;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/g;->b(Lcom/kwad/components/ad/reward/e/g;)V

    .line 16
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->oK:Lcom/kwad/components/ad/reward/m/e;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/d/a/a;->sv:Lcom/kwad/components/core/video/l;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/m/e;->a(Lcom/kwad/components/core/video/l;)V

    :cond_1
    return-void
.end method

.method public final iw()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/f;->r(Lcom/kwad/components/ad/reward/g;)V

    return-void
.end method

.method public final onCreate()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onCreate()V

    .line 2
    sget v0, Lcom/kwad/sdk/R$id;->ksad_landing_page_container:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/a;->da:Landroid/widget/FrameLayout;

    return-void
.end method

.method public final onUnbind()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onUnbind()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/d/a/a;->mPlayEndPageListener:Lcom/kwad/components/ad/reward/e/g;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/g;->c(Lcom/kwad/components/ad/reward/e/g;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->oK:Lcom/kwad/components/ad/reward/m/e;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/d/a/a;->sv:Lcom/kwad/components/core/video/l;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/m/e;->b(Lcom/kwad/components/core/video/l;)V

    return-void
.end method
