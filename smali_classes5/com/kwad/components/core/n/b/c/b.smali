.class final Lcom/kwad/components/core/n/b/c/b;
.super Lcom/kwad/components/offline/api/core/video/BaseKsMediaPlayerView;
.source "SourceFile"


# instance fields
.field private Ob:Lcom/kwad/components/core/video/DetailVideoView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/components/offline/api/core/video/BaseKsMediaPlayerView;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final adaptVideoSize(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/c/b;->Ob:Lcom/kwad/components/core/video/DetailVideoView;

    invoke-virtual {v0, p1, p2}, Lcom/kwad/components/core/video/DetailVideoView;->adaptVideoSize(II)V

    return-void
.end method

.method public final b(Lcom/kwad/components/core/video/DetailVideoView;)Lcom/kwad/components/core/n/b/c/b;
    .locals 0
    .param p1    # Lcom/kwad/components/core/video/DetailVideoView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-static {p1}, Lcom/kwad/sdk/utils/aq;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 3
    iput-object p1, p0, Lcom/kwad/components/core/n/b/c/b;->Ob:Lcom/kwad/components/core/video/DetailVideoView;

    return-object p0
.end method

.method public final fixWidth(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/c/b;->Ob:Lcom/kwad/components/core/video/DetailVideoView;

    invoke-virtual {v0, p1}, Lcom/kwad/components/core/video/DetailVideoView;->fixWidth(Z)V

    return-void
.end method

.method public final getTextureViewGravity()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/c/b;->Ob:Lcom/kwad/components/core/video/DetailVideoView;

    invoke-virtual {v0}, Lcom/kwad/components/core/video/DetailVideoView;->getTextureViewGravity()I

    move-result v0

    return v0
.end method

.method public final pw()Lcom/kwad/components/core/video/DetailVideoView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/c/b;->Ob:Lcom/kwad/components/core/video/DetailVideoView;

    return-object v0
.end method

.method public final setAd(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/c/b;->Ob:Lcom/kwad/components/core/video/DetailVideoView;

    invoke-virtual {v0, p1}, Lcom/kwad/components/core/video/DetailVideoView;->setAd(Z)V

    return-void
.end method

.method public final setClickListener(Lcom/kwad/components/offline/api/core/video/IKsMediaPlayerView$VideoViewClickListener;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/c/b;->Ob:Lcom/kwad/components/core/video/DetailVideoView;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 2
    :cond_0
    new-instance v1, Lcom/kwad/components/core/n/b/c/b$1;

    invoke-direct {v1, p0, p1}, Lcom/kwad/components/core/n/b/c/b$1;-><init>(Lcom/kwad/components/core/n/b/c/b;Lcom/kwad/components/offline/api/core/video/IKsMediaPlayerView$VideoViewClickListener;)V

    move-object p1, v1

    .line 3
    :goto_0
    invoke-virtual {v0, p1}, Lcom/kwad/components/core/video/DetailVideoView;->setClickListener(Lcom/kwad/components/core/video/DetailVideoView$a;)V

    return-void
.end method

.method public final setForce(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/c/b;->Ob:Lcom/kwad/components/core/video/DetailVideoView;

    invoke-virtual {v0, p1}, Lcom/kwad/components/core/video/DetailVideoView;->setForce(Z)V

    return-void
.end method

.method public final setHorizontalVideo(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/c/b;->Ob:Lcom/kwad/components/core/video/DetailVideoView;

    invoke-virtual {v0, p1}, Lcom/kwad/components/core/video/DetailVideoView;->setHorizontalVideo(Z)V

    return-void
.end method

.method public final setMediaPlayer(Lcom/kwad/components/offline/api/core/video/IKsMediaPlayer;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/kwad/components/core/n/b/c/a;

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/n/b/c/b;->Ob:Lcom/kwad/components/core/video/DetailVideoView;

    check-cast p1, Lcom/kwad/components/core/n/b/c/a;

    invoke-virtual {p1}, Lcom/kwad/components/core/n/b/c/a;->pu()Lcom/kwad/components/core/video/b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/kwad/components/core/video/DetailVideoView;->setMediaPlayer(Lcom/kwad/components/core/video/b;)V

    return-void

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "mediaPlayer not instanceof KsMediaPlayer"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setRadius(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/c/b;->Ob:Lcom/kwad/components/core/video/DetailVideoView;

    invoke-virtual {v0, p1}, Lcom/kwad/components/core/video/DetailVideoView;->setRadius(F)V

    return-void
.end method

.method public final updateTextureViewGravity(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/c/b;->Ob:Lcom/kwad/components/core/video/DetailVideoView;

    invoke-virtual {v0, p1}, Lcom/kwad/components/core/video/DetailVideoView;->updateTextureViewGravity(I)V

    return-void
.end method
