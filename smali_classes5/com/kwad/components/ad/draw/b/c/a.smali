.class public final Lcom/kwad/components/ad/draw/b/c/a;
.super Lcom/kwad/components/ad/draw/a/a;
.source "SourceFile"


# instance fields
.field private cY:Lcom/kwad/components/ad/draw/view/playend/DrawVideoTailFrame;

.field private ci:Lcom/kwad/components/ad/l/b;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mVideoPlayStateListener:Lcom/kwad/components/core/video/k;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/draw/a/a;-><init>()V

    .line 2
    new-instance v0, Lcom/kwad/components/ad/draw/b/c/a$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/draw/b/c/a$1;-><init>(Lcom/kwad/components/ad/draw/b/c/a;)V

    iput-object v0, p0, Lcom/kwad/components/ad/draw/b/c/a;->mVideoPlayStateListener:Lcom/kwad/components/core/video/k;

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/draw/b/c/a;)Lcom/kwad/components/ad/l/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/draw/b/c/a;->ci:Lcom/kwad/components/ad/l/b;

    return-object p0
.end method

.method private aI()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/c/a;->cY:Lcom/kwad/components/ad/draw/view/playend/DrawVideoTailFrame;

    invoke-virtual {v0}, Lcom/kwad/components/ad/draw/view/playend/DrawVideoTailFrame;->aR()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/c/a;->cY:Lcom/kwad/components/ad/draw/view/playend/DrawVideoTailFrame;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    return-void
.end method

.method static synthetic b(Lcom/kwad/components/ad/draw/b/c/a;)Lcom/kwad/components/ad/draw/view/playend/DrawVideoTailFrame;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/draw/b/c/a;->cY:Lcom/kwad/components/ad/draw/view/playend/DrawVideoTailFrame;

    return-object p0
.end method

.method static synthetic c(Lcom/kwad/components/ad/draw/b/c/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/draw/b/c/a;->aI()V

    return-void
.end method


# virtual methods
.method public final aj()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/draw/a/a;->aj()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/draw/a/a;->bO:Lcom/kwad/components/ad/draw/a/b;

    iget-object v1, v0, Lcom/kwad/components/ad/draw/a/b;->ci:Lcom/kwad/components/ad/l/b;

    iput-object v1, p0, Lcom/kwad/components/ad/draw/b/c/a;->ci:Lcom/kwad/components/ad/l/b;

    .line 3
    iget-object v1, p0, Lcom/kwad/components/ad/draw/b/c/a;->cY:Lcom/kwad/components/ad/draw/view/playend/DrawVideoTailFrame;

    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {v1, v0}, Lcom/kwad/components/ad/draw/view/playend/DrawVideoTailFrame;->b(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/c/a;->cY:Lcom/kwad/components/ad/draw/view/playend/DrawVideoTailFrame;

    iget-object v1, p0, Lcom/kwad/components/ad/draw/a/a;->bO:Lcom/kwad/components/ad/draw/a/b;

    iget-object v1, v1, Lcom/kwad/components/ad/draw/a/b;->mRootContainer:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/draw/view/playend/DrawVideoTailFrame;->setAdBaseFrameLayout(Lcom/kwad/sdk/core/view/AdBaseFrameLayout;)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/c/a;->cY:Lcom/kwad/components/ad/draw/view/playend/DrawVideoTailFrame;

    iget-object v1, p0, Lcom/kwad/components/ad/draw/a/a;->bO:Lcom/kwad/components/ad/draw/a/b;

    iget-object v1, v1, Lcom/kwad/components/ad/draw/a/b;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/draw/view/playend/DrawVideoTailFrame;->setApkDownloadHelper(Lcom/kwad/components/core/e/d/c;)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/c/a;->cY:Lcom/kwad/components/ad/draw/view/playend/DrawVideoTailFrame;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/c/a;->cY:Lcom/kwad/components/ad/draw/view/playend/DrawVideoTailFrame;

    iget-object v1, p0, Lcom/kwad/components/ad/draw/a/a;->bO:Lcom/kwad/components/ad/draw/a/b;

    iget-object v1, v1, Lcom/kwad/components/ad/draw/a/b;->bN:Lcom/kwad/sdk/api/KsDrawAd$AdInteractionListener;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/draw/view/playend/DrawVideoTailFrame;->setAdInteractionListener(Lcom/kwad/sdk/api/KsDrawAd$AdInteractionListener;)V

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/draw/a/a;->bO:Lcom/kwad/components/ad/draw/a/b;

    iget-object v0, v0, Lcom/kwad/components/ad/draw/a/b;->bP:Lcom/kwad/components/ad/draw/c/a;

    iget-object v1, p0, Lcom/kwad/components/ad/draw/b/c/a;->mVideoPlayStateListener:Lcom/kwad/components/core/video/k;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/k/b;->a(Lcom/kwad/components/core/video/k;)V

    return-void
.end method

.method public final onCreate()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onCreate()V

    .line 2
    sget v0, Lcom/kwad/sdk/R$id;->ksad_video_tail_frame:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/ad/draw/view/playend/DrawVideoTailFrame;

    iput-object v0, p0, Lcom/kwad/components/ad/draw/b/c/a;->cY:Lcom/kwad/components/ad/draw/view/playend/DrawVideoTailFrame;

    return-void
.end method

.method public final onUnbind()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onUnbind()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/draw/a/a;->bO:Lcom/kwad/components/ad/draw/a/b;

    iget-object v0, v0, Lcom/kwad/components/ad/draw/a/b;->bP:Lcom/kwad/components/ad/draw/c/a;

    iget-object v1, p0, Lcom/kwad/components/ad/draw/b/c/a;->mVideoPlayStateListener:Lcom/kwad/components/core/video/k;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/k/b;->b(Lcom/kwad/components/core/video/k;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/c/a;->cY:Lcom/kwad/components/ad/draw/view/playend/DrawVideoTailFrame;

    invoke-virtual {v0}, Lcom/kwad/components/ad/draw/view/playend/DrawVideoTailFrame;->release()V

    return-void
.end method
