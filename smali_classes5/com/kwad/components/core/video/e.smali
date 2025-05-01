.class public final Lcom/kwad/components/core/video/e;
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


# instance fields
.field private Vt:Landroid/view/View;

.field private final Vu:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private Vv:Z

.field private Vw:Z

.field private final dU:Lcom/kwad/sdk/api/KsAdVideoPlayConfig;

.field private final hh:Lcom/kwad/sdk/utils/bs;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/core/video/videoview/c;Lcom/kwad/sdk/api/KsAdVideoPlayConfig;)V
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

    iput-object p1, p0, Lcom/kwad/components/core/video/e;->hh:Lcom/kwad/sdk/utils/bs;

    .line 3
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lcom/kwad/components/core/video/e;->Vu:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    iput-boolean p2, p0, Lcom/kwad/components/core/video/e;->Vw:Z

    .line 5
    iput-object p0, p0, Lcom/kwad/components/core/video/e;->Vt:Landroid/view/View;

    .line 6
    iput-object p4, p0, Lcom/kwad/components/core/video/e;->dU:Lcom/kwad/sdk/api/KsAdVideoPlayConfig;

    return-void
.end method

.method private ac()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/e;->Vu:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "FeedVideoPlayerController"

    const-string v1, "onViewAttached"

    .line 2
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/video/e;->hh:Lcom/kwad/sdk/utils/bs;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :cond_0
    return-void
.end method

.method private sn()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/e;->dU:Lcom/kwad/sdk/api/KsAdVideoPlayConfig;

    instance-of v1, v0, Lcom/kwad/components/core/internal/api/KSAdVideoPlayConfigImpl;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    .line 2
    check-cast v0, Lcom/kwad/components/core/internal/api/KSAdVideoPlayConfigImpl;

    .line 3
    invoke-virtual {v0}, Lcom/kwad/components/core/internal/api/KSAdVideoPlayConfigImpl;->getVideoAutoPlayType()I

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/kwad/sdk/utils/ah;->isNetworkConnected(Landroid/content/Context;)Z

    move-result v0

    return v0

    .line 5
    :cond_0
    invoke-virtual {v0}, Lcom/kwad/components/core/internal/api/KSAdVideoPlayConfigImpl;->getVideoAutoPlayType()I

    move-result v1

    const/4 v3, 0x2

    if-ne v1, v3, :cond_1

    .line 6
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/kwad/sdk/utils/ah;->isWifiConnected(Landroid/content/Context;)Z

    move-result v0

    return v0

    .line 7
    :cond_1
    invoke-virtual {v0}, Lcom/kwad/components/core/internal/api/KSAdVideoPlayConfigImpl;->getVideoAutoPlayType()I

    move-result v1

    const/4 v3, 0x3

    if-ne v1, v3, :cond_2

    return v2

    .line 8
    :cond_2
    invoke-virtual {v0}, Lcom/kwad/components/core/internal/api/KSAdVideoPlayConfigImpl;->getDataFlowAutoStartValue()I

    move-result v1

    if-eqz v1, :cond_4

    .line 9
    invoke-virtual {v0}, Lcom/kwad/components/core/internal/api/KSAdVideoPlayConfigImpl;->isDataFlowAutoStart()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 10
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/kwad/sdk/utils/ah;->isNetworkConnected(Landroid/content/Context;)Z

    move-result v0

    return v0

    .line 11
    :cond_3
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/kwad/sdk/utils/ah;->isWifiConnected(Landroid/content/Context;)Z

    move-result v0

    return v0

    .line 12
    :cond_4
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->bV(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 13
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/kwad/sdk/utils/ah;->isNetworkConnected(Landroid/content/Context;)Z

    move-result v0

    return v0

    .line 14
    :cond_5
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->bW(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 15
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/kwad/sdk/utils/ah;->isWifiConnected(Landroid/content/Context;)Z

    move-result v0

    return v0

    :cond_6
    return v2
.end method


# virtual methods
.method public final a(Landroid/os/Message;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/video/a;->Uf:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget p1, p1, Landroid/os/Message;->what:I

    const/4 v0, 0x1

    if-ne p1, v0, :cond_3

    .line 3
    iget-object p1, p0, Lcom/kwad/components/core/video/e;->Vt:Landroid/view/View;

    const/16 v1, 0x1e

    invoke-static {p1, v1}, Lcom/kwad/sdk/utils/br;->o(Landroid/view/View;I)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 4
    iget-boolean p1, p0, Lcom/kwad/components/core/video/e;->Vv:Z

    if-nez p1, :cond_2

    .line 5
    invoke-virtual {p0}, Lcom/kwad/components/core/video/e;->rR()V

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {p0}, Lcom/kwad/components/core/video/a;->rT()V

    .line 7
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/kwad/components/core/video/e;->hh:Lcom/kwad/sdk/utils/bs;

    const-wide/16 v1, 0x1f4

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_3
    return-void
.end method

.method public final ad()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/e;->Vu:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "FeedVideoPlayerController"

    const-string v1, "onViewDetached"

    .line 2
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/video/e;->hh:Lcom/kwad/sdk/utils/bs;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 4
    iget-boolean v0, p0, Lcom/kwad/components/core/video/e;->Vw:Z

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {p0}, Lcom/kwad/components/core/video/a;->release()V

    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/b;->aCR:Lcom/kwad/sdk/core/video/videoview/c;

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/videoview/c;->pause()V

    :cond_1
    return-void
.end method

.method protected final onAttachedToWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/widget/RelativeLayout;->onAttachedToWindow()V

    const-string v0, "FeedVideoPlayerController"

    const-string v1, "onAttachedToWindow"

    .line 2
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Lcom/kwad/components/core/video/e;->ac()V

    return-void
.end method

.method protected final onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/widget/RelativeLayout;->onDetachedFromWindow()V

    const-string v0, "FeedVideoPlayerController"

    const-string v1, "onDetachedFromWindow"

    .line 2
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0}, Lcom/kwad/components/core/video/e;->ad()V

    return-void
.end method

.method public final onFinishTemporaryDetach()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/widget/RelativeLayout;->onFinishTemporaryDetach()V

    const-string v0, "FeedVideoPlayerController"

    const-string v1, "onFinishTemporaryDetach"

    .line 2
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Lcom/kwad/components/core/video/e;->ac()V

    return-void
.end method

.method public final onStartTemporaryDetach()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/widget/RelativeLayout;->onStartTemporaryDetach()V

    const-string v0, "FeedVideoPlayerController"

    const-string v1, "onStartTemporaryDetach"

    .line 2
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0}, Lcom/kwad/components/core/video/e;->ad()V

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

.method protected final rR()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/b;->aCR:Lcom/kwad/sdk/core/video/videoview/c;

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/videoview/c;->isIdle()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->Ut:Lcom/kwad/components/core/video/a/a;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0}, Lcom/kwad/components/core/video/a/c;->onStart()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/video/a;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/kwad/sdk/utils/ah;->isNetworkConnected(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 5
    invoke-virtual {p0}, Lcom/kwad/components/core/video/a;->rN()V

    return-void

    .line 6
    :cond_1
    invoke-virtual {p0}, Lcom/kwad/components/core/video/a;->rO()V

    .line 7
    iget-boolean v0, p0, Lcom/kwad/components/core/video/a;->Uf:Z

    if-eqz v0, :cond_2

    .line 8
    invoke-virtual {p0}, Lcom/kwad/components/core/video/a;->rS()V

    .line 9
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/b;->aCR:Lcom/kwad/sdk/core/video/videoview/c;

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/videoview/c;->start()V

    return-void

    .line 10
    :cond_2
    invoke-direct {p0}, Lcom/kwad/components/core/video/e;->sn()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 11
    invoke-virtual {p0}, Lcom/kwad/components/core/video/a;->rS()V

    .line 12
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/b;->aCR:Lcom/kwad/sdk/core/video/videoview/c;

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/videoview/c;->start()V

    return-void

    .line 13
    :cond_3
    iget-boolean v0, p0, Lcom/kwad/components/core/video/a;->Ud:Z

    if-eqz v0, :cond_4

    .line 14
    invoke-virtual {p0}, Lcom/kwad/components/core/video/a;->rS()V

    .line 15
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/b;->aCR:Lcom/kwad/sdk/core/video/videoview/c;

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/videoview/c;->start()V

    return-void

    .line 16
    :cond_4
    invoke-virtual {p0}, Lcom/kwad/components/core/video/a;->rP()V

    return-void

    .line 17
    :cond_5
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/b;->aCR:Lcom/kwad/sdk/core/video/videoview/c;

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/videoview/c;->isPaused()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/b;->aCR:Lcom/kwad/sdk/core/video/videoview/c;

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/videoview/c;->GT()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 18
    :cond_6
    invoke-virtual {p0}, Lcom/kwad/components/core/video/a;->rS()V

    .line 19
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/b;->aCR:Lcom/kwad/sdk/core/video/videoview/c;

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/videoview/c;->restart()V

    :cond_7
    return-void
.end method

.method public final setAutoRelease(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/core/video/e;->Vw:Z

    return-void
.end method

.method public final sm()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/e;->hh:Lcom/kwad/sdk/utils/bs;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 2
    iget-boolean v0, p0, Lcom/kwad/components/core/video/e;->Vw:Z

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/kwad/components/core/video/a;->release()V

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/b;->aCR:Lcom/kwad/sdk/core/video/videoview/c;

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/videoview/c;->pause()V

    return-void
.end method

.method public final so()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/b;->aCR:Lcom/kwad/sdk/core/video/videoview/c;

    invoke-interface {v0}, Lcom/kwad/sdk/core/video/videoview/c;->pause()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/core/video/e;->Vv:Z

    return-void
.end method

.method public final sp()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/core/video/e;->rR()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/core/video/e;->Vv:Z

    return-void
.end method

.method public final sq()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/kwad/components/core/video/e;->Vv:Z

    return-void
.end method
