.class public final Lcom/kwad/components/core/page/c/e;
.super Lcom/kwad/components/core/page/c/c;
.source "SourceFile"


# instance fields
.field private mPlayModule:Lcom/kwad/components/core/page/d/a;

.field private mVideoPlayStateListener:Lcom/kwad/components/core/video/k;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/page/c/c;-><init>()V

    .line 2
    new-instance v0, Lcom/kwad/components/core/page/c/e$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/page/c/e$1;-><init>(Lcom/kwad/components/core/page/c/e;)V

    iput-object v0, p0, Lcom/kwad/components/core/page/c/e;->mVideoPlayStateListener:Lcom/kwad/components/core/video/k;

    return-void
.end method


# virtual methods
.method public final aj()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/page/c/c;->aj()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/page/c/c;->Pe:Lcom/kwad/components/core/page/c/d;

    iget-object v0, v0, Lcom/kwad/components/core/page/c/d;->mPlayModule:Lcom/kwad/components/core/page/d/a;

    iput-object v0, p0, Lcom/kwad/components/core/page/c/e;->mPlayModule:Lcom/kwad/components/core/page/d/a;

    .line 3
    iget-object v1, p0, Lcom/kwad/components/core/page/c/e;->mVideoPlayStateListener:Lcom/kwad/components/core/video/k;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/page/d/a;->a(Lcom/kwad/components/core/video/k;)V

    return-void
.end method

.method public final onUnbind()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onUnbind()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/page/c/e;->mPlayModule:Lcom/kwad/components/core/page/d/a;

    iget-object v1, p0, Lcom/kwad/components/core/page/c/e;->mVideoPlayStateListener:Lcom/kwad/components/core/video/k;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/page/d/a;->b(Lcom/kwad/components/core/video/k;)V

    return-void
.end method
