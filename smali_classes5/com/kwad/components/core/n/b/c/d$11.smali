.class final Lcom/kwad/components/core/n/b/c/d$11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/video/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/n/b/c/d;->a(Lcom/kwad/components/offline/api/core/video/listener/OfflineVideoPlayStateListener;)Lcom/kwad/components/core/video/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Oq:Lcom/kwad/components/offline/api/core/video/listener/OfflineVideoPlayStateListener;


# direct methods
.method constructor <init>(Lcom/kwad/components/offline/api/core/video/listener/OfflineVideoPlayStateListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/n/b/c/d$11;->Oq:Lcom/kwad/components/offline/api/core/video/listener/OfflineVideoPlayStateListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onMediaPlayCompleted()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/c/d$11;->Oq:Lcom/kwad/components/offline/api/core/video/listener/OfflineVideoPlayStateListener;

    invoke-interface {v0}, Lcom/kwad/components/offline/api/core/video/listener/OfflineMediaPlayStateListener;->onMediaPlayCompleted()V

    return-void
.end method

.method public final onMediaPlayError(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/c/d$11;->Oq:Lcom/kwad/components/offline/api/core/video/listener/OfflineVideoPlayStateListener;

    invoke-interface {v0, p1, p2}, Lcom/kwad/components/offline/api/core/video/listener/OfflineMediaPlayStateListener;->onMediaPlayError(II)V

    return-void
.end method

.method public final onMediaPlayPaused()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/c/d$11;->Oq:Lcom/kwad/components/offline/api/core/video/listener/OfflineVideoPlayStateListener;

    invoke-interface {v0}, Lcom/kwad/components/offline/api/core/video/listener/OfflineMediaPlayStateListener;->onMediaPlayPaused()V

    return-void
.end method

.method public final onMediaPlayProgress(JJ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/c/d$11;->Oq:Lcom/kwad/components/offline/api/core/video/listener/OfflineVideoPlayStateListener;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/kwad/components/offline/api/core/video/listener/OfflineMediaPlayStateListener;->onMediaPlayProgress(JJ)V

    return-void
.end method

.method public final onMediaPlayStart()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/c/d$11;->Oq:Lcom/kwad/components/offline/api/core/video/listener/OfflineVideoPlayStateListener;

    invoke-interface {v0}, Lcom/kwad/components/offline/api/core/video/listener/OfflineMediaPlayStateListener;->onMediaPlayStart()V

    return-void
.end method

.method public final onMediaPlaying()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/c/d$11;->Oq:Lcom/kwad/components/offline/api/core/video/listener/OfflineVideoPlayStateListener;

    invoke-interface {v0}, Lcom/kwad/components/offline/api/core/video/listener/OfflineMediaPlayStateListener;->onMediaPlaying()V

    return-void
.end method

.method public final onMediaPrepared()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/c/d$11;->Oq:Lcom/kwad/components/offline/api/core/video/listener/OfflineVideoPlayStateListener;

    invoke-interface {v0}, Lcom/kwad/components/offline/api/core/video/listener/OfflineMediaPlayStateListener;->onMediaPrepared()V

    return-void
.end method

.method public final onMediaPreparing()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/c/d$11;->Oq:Lcom/kwad/components/offline/api/core/video/listener/OfflineVideoPlayStateListener;

    invoke-interface {v0}, Lcom/kwad/components/offline/api/core/video/listener/OfflineMediaPlayStateListener;->onMediaPreparing()V

    return-void
.end method

.method public final onVideoPlayBufferingPaused()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/c/d$11;->Oq:Lcom/kwad/components/offline/api/core/video/listener/OfflineVideoPlayStateListener;

    invoke-interface {v0}, Lcom/kwad/components/offline/api/core/video/listener/OfflineVideoPlayStateListener;->onVideoPlayBufferingPaused()V

    return-void
.end method

.method public final onVideoPlayBufferingPlaying()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/c/d$11;->Oq:Lcom/kwad/components/offline/api/core/video/listener/OfflineVideoPlayStateListener;

    invoke-interface {v0}, Lcom/kwad/components/offline/api/core/video/listener/OfflineVideoPlayStateListener;->onVideoPlayBufferingPlaying()V

    return-void
.end method
