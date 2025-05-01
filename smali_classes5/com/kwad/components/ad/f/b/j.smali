.class public final Lcom/kwad/components/ad/f/b/j;
.super Lcom/kwad/components/ad/f/a/a;
.source "SourceFile"


# instance fields
.field private nk:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/f/a/a;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/f/b/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/f/b/j;->eB()V

    return-void
.end method

.method private eB()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/f/b/j;->nk:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/f/b/j;->nk:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public final aj()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/f/a/a;->aj()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/f/b/j;->nk:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 3
    new-instance v0, Lcom/kwad/components/ad/f/b/j$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/f/b/j$1;-><init>(Lcom/kwad/components/ad/f/b/j;)V

    iput-object v0, p0, Lcom/kwad/components/ad/f/a/a;->mVideoPlayStateListener:Lcom/kwad/components/core/video/k;

    .line 4
    iget-object v1, p0, Lcom/kwad/components/ad/f/a/a;->mN:Lcom/kwad/components/ad/f/a/b;

    iget-object v1, v1, Lcom/kwad/components/ad/f/a/b;->mO:Lcom/kwad/components/ad/f/c/a;

    invoke-virtual {v1, v0}, Lcom/kwad/components/ad/k/b;->a(Lcom/kwad/components/core/video/k;)V

    return-void
.end method

.method public final onCreate()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onCreate()V

    .line 2
    sget v0, Lcom/kwad/sdk/R$id;->ksad_video_error_container:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/f/b/j;->nk:Landroid/view/View;

    return-void
.end method
