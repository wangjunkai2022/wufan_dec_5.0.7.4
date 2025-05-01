.class public final Lcom/kwad/components/core/video/f;
.super Lcom/kwad/components/core/video/a;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/utils/bs$a;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/video/f$a;
    }
.end annotation


# instance fields
.field private Es:Z

.field private Vt:Landroid/view/View;

.field private final Vu:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private Vx:Z

.field private Vy:Z

.field private final hh:Lcom/kwad/sdk/utils/bs;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/core/video/videoview/c;)V
    .locals 0
    .param p3    # Lcom/kwad/sdk/core/video/videoview/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/kwad/components/core/video/a;-><init>(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/core/video/videoview/c;)V

    .line 2
    new-instance p1, Lcom/kwad/sdk/utils/bs;

    invoke-direct {p1, p0}, Lcom/kwad/sdk/utils/bs;-><init>(Lcom/kwad/sdk/utils/bs$a;)V

    iput-object p1, p0, Lcom/kwad/components/core/video/f;->hh:Lcom/kwad/sdk/utils/bs;

    .line 3
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lcom/kwad/components/core/video/f;->Vu:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lcom/kwad/components/core/video/f;->Es:Z

    .line 5
    iput-boolean p1, p0, Lcom/kwad/components/core/video/f;->Vx:Z

    .line 6
    iput-boolean p1, p0, Lcom/kwad/components/core/video/f;->Vy:Z

    .line 7
    iput-object p0, p0, Lcom/kwad/components/core/video/f;->Vt:Landroid/view/View;

    return-void
.end method

.method private ac()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/f;->Vu:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "InterstitialVideoPlayerController"

    const-string v1, "onViewAttached"

    .line 2
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/video/f;->hh:Lcom/kwad/sdk/utils/bs;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :cond_0
    return-void
.end method

.method private ad()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/f;->Vu:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "InterstitialVideoPlayerController"

    const-string v1, "onViewDetached"

    .line 2
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/video/f;->hh:Lcom/kwad/sdk/utils/bs;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 4
    invoke-virtual {p0}, Lcom/kwad/components/core/video/f;->release()V

    :cond_0
    return-void
.end method

.method private sr()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/kwad/components/core/video/f;->Es:Z

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Message;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/video/f;->Es:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget p1, p1, Landroid/os/Message;->what:I

    const/4 v0, 0x1

    if-ne p1, v0, :cond_3

    .line 3
    iget-boolean p1, p0, Lcom/kwad/components/core/video/f;->Vy:Z

    const-wide/16 v1, 0x1f4

    if-eqz p1, :cond_1

    .line 4
    iget-object p1, p0, Lcom/kwad/components/core/video/f;->hh:Lcom/kwad/sdk/utils/bs;

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void

    .line 5
    :cond_1
    iget-object p1, p0, Lcom/kwad/components/core/video/f;->Vt:Landroid/view/View;

    const/16 v3, 0x46

    invoke-static {p1, v3}, Lcom/kwad/sdk/utils/br;->o(Landroid/view/View;I)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 6
    invoke-virtual {p0}, Lcom/kwad/components/core/video/f;->rR()V

    goto :goto_0

    .line 7
    :cond_2
    invoke-virtual {p0}, Lcom/kwad/components/core/video/f;->rT()V

    .line 8
    :goto_0
    iget-object p1, p0, Lcom/kwad/components/core/video/f;->hh:Lcom/kwad/sdk/utils/bs;

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_3
    return-void
.end method

.method protected final ey()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/video/f;->Vx:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-super {p0}, Lcom/kwad/components/core/video/a;->ey()V

    :cond_0
    return-void
.end method

.method protected final onAttachedToWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/widget/RelativeLayout;->onAttachedToWindow()V

    const-string v0, "InterstitialVideoPlayerController"

    const-string v1, "onAttachedToWindow"

    .line 2
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Lcom/kwad/components/core/video/f;->sr()V

    .line 4
    invoke-direct {p0}, Lcom/kwad/components/core/video/f;->ac()V

    return-void
.end method

.method protected final onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/widget/RelativeLayout;->onDetachedFromWindow()V

    const-string v0, "InterstitialVideoPlayerController"

    const-string v1, "onDetachedFromWindow"

    .line 2
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Lcom/kwad/components/core/video/f;->ad()V

    return-void
.end method

.method public final onFinishTemporaryDetach()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/widget/RelativeLayout;->onFinishTemporaryDetach()V

    const-string v0, "InterstitialVideoPlayerController"

    const-string v1, "onFinishTemporaryDetach"

    .line 2
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Lcom/kwad/components/core/video/f;->ac()V

    return-void
.end method

.method public final onStartTemporaryDetach()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/widget/RelativeLayout;->onStartTemporaryDetach()V

    const-string v0, "InterstitialVideoPlayerController"

    const-string v1, "onStartTemporaryDetach"

    .line 2
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Lcom/kwad/components/core/video/f;->ad()V

    return-void
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->onWindowFocusChanged(Z)V

    return-void
.end method

.method protected final onWindowVisibilityChanged(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->onWindowVisibilityChanged(I)V

    return-void
.end method

.method protected final rL()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/video/a;->rL()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->mS:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 3
    sget v1, Lcom/kwad/sdk/R$drawable;->ksad_interstitial_video_play:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->mT:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    const/16 v1, 0x8

    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method public final rR()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/video/a;->rR()V

    return-void
.end method

.method public final rT()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/video/a;->rT()V

    return-void
.end method

.method public final release()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/video/a;->release()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/core/video/f;->Es:Z

    return-void
.end method

.method public final setShowLandingPage(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/core/video/f;->Vy:Z

    return-void
.end method
