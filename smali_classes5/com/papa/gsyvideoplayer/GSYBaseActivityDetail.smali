.class public abstract Lcom/papa/gsyvideoplayer/GSYBaseActivityDetail;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "GSYBaseActivityDetail.java"

# interfaces
.implements Ls2/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;",
        ">",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "Ls2/h;"
    }
.end annotation


# instance fields
.field protected b:Z

.field protected c:Z

.field protected d:Lcom/papa/gsyvideoplayer/utils/o;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract e0()V
.end method

.method public abstract f0()Z
.end method

.method public abstract g0()Lcom/papa/gsyvideoplayer/builder/a;
.end method

.method public abstract h0()Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public i0()Lcom/papa/gsyvideoplayer/utils/n;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public j0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public k0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public l0()V
    .locals 3

    .line 1
    new-instance v0, Lcom/papa/gsyvideoplayer/utils/o;

    invoke-virtual {p0}, Lcom/papa/gsyvideoplayer/GSYBaseActivityDetail;->h0()Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;

    move-result-object v1

    invoke-virtual {p0}, Lcom/papa/gsyvideoplayer/GSYBaseActivityDetail;->i0()Lcom/papa/gsyvideoplayer/utils/n;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2}, Lcom/papa/gsyvideoplayer/utils/o;-><init>(Landroid/app/Activity;Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;Lcom/papa/gsyvideoplayer/utils/n;)V

    iput-object v0, p0, Lcom/papa/gsyvideoplayer/GSYBaseActivityDetail;->d:Lcom/papa/gsyvideoplayer/utils/o;

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Lcom/papa/gsyvideoplayer/utils/o;->I(Z)V

    .line 3
    invoke-virtual {p0}, Lcom/papa/gsyvideoplayer/GSYBaseActivityDetail;->h0()Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoControlView;->getFullscreenButton()Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {p0}, Lcom/papa/gsyvideoplayer/GSYBaseActivityDetail;->h0()Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoControlView;->getFullscreenButton()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lcom/papa/gsyvideoplayer/GSYBaseActivityDetail$a;

    invoke-direct {v1, p0}, Lcom/papa/gsyvideoplayer/GSYBaseActivityDetail$a;-><init>(Lcom/papa/gsyvideoplayer/GSYBaseActivityDetail;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-void
.end method

.method public m0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/papa/gsyvideoplayer/GSYBaseActivityDetail;->l0()V

    .line 2
    invoke-virtual {p0}, Lcom/papa/gsyvideoplayer/GSYBaseActivityDetail;->g0()Lcom/papa/gsyvideoplayer/builder/a;

    move-result-object v0

    .line 3
    invoke-virtual {v0, p0}, Lcom/papa/gsyvideoplayer/builder/a;->T(Ls2/h;)Lcom/papa/gsyvideoplayer/builder/a;

    move-result-object v0

    .line 4
    invoke-virtual {p0}, Lcom/papa/gsyvideoplayer/GSYBaseActivityDetail;->h0()Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/papa/gsyvideoplayer/builder/a;->b(Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;)V

    return-void
.end method

.method public n0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public o0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/papa/gsyvideoplayer/GSYBaseActivityDetail;->d:Lcom/papa/gsyvideoplayer/utils/o;

    invoke-virtual {v0}, Lcom/papa/gsyvideoplayer/utils/o;->r()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/papa/gsyvideoplayer/GSYBaseActivityDetail;->d:Lcom/papa/gsyvideoplayer/utils/o;

    invoke-virtual {v0}, Lcom/papa/gsyvideoplayer/utils/o;->E()V

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/papa/gsyvideoplayer/GSYBaseActivityDetail;->h0()Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;

    move-result-object v0

    invoke-virtual {p0}, Lcom/papa/gsyvideoplayer/GSYBaseActivityDetail;->j0()Z

    move-result v1

    invoke-virtual {p0}, Lcom/papa/gsyvideoplayer/GSYBaseActivityDetail;->k0()Z

    move-result v2

    invoke-virtual {v0, p0, v1, v2}, Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;->startWindowFullscreen(Landroid/content/Context;ZZ)Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;

    return-void
.end method

.method public varargs onAutoComplete(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/papa/gsyvideoplayer/GSYBaseActivityDetail;->d:Lcom/papa/gsyvideoplayer/utils/o;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/papa/gsyvideoplayer/utils/o;->q()I

    .line 3
    :cond_0
    invoke-static {p0}, Lcom/papa/gsyvideoplayer/d;->c0(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 4
    :cond_1
    invoke-super {p0}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    return-void
.end method

.method public varargs onClickBlank(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public varargs onClickBlankFullscreen(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public varargs onClickResume(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public varargs onClickResumeFullscreen(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public varargs onClickSeekbar(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public varargs onClickSeekbarFullscreen(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public varargs onClickStartError(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public varargs onClickStartIcon(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public varargs onClickStartThumb(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public varargs onClickStop(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public varargs onClickStopFullscreen(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 7

    .line 1
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    iget-boolean v0, p0, Lcom/papa/gsyvideoplayer/GSYBaseActivityDetail;->b:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/papa/gsyvideoplayer/GSYBaseActivityDetail;->c:Z

    if-nez v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/papa/gsyvideoplayer/GSYBaseActivityDetail;->h0()Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;

    move-result-object v1

    iget-object v4, p0, Lcom/papa/gsyvideoplayer/GSYBaseActivityDetail;->d:Lcom/papa/gsyvideoplayer/utils/o;

    invoke-virtual {p0}, Lcom/papa/gsyvideoplayer/GSYBaseActivityDetail;->j0()Z

    move-result v5

    invoke-virtual {p0}, Lcom/papa/gsyvideoplayer/GSYBaseActivityDetail;->k0()Z

    move-result v6

    move-object v2, p0

    move-object v3, p1

    invoke-virtual/range {v1 .. v6}, Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;->onConfigurationChanged(Landroid/app/Activity;Landroid/content/res/Configuration;Lcom/papa/gsyvideoplayer/utils/o;ZZ)V

    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onDestroy()V

    .line 2
    iget-boolean v0, p0, Lcom/papa/gsyvideoplayer/GSYBaseActivityDetail;->b:Z

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/papa/gsyvideoplayer/GSYBaseActivityDetail;->h0()Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;->getCurrentPlayer()Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->release()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/papa/gsyvideoplayer/GSYBaseActivityDetail;->d:Lcom/papa/gsyvideoplayer/utils/o;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0}, Lcom/papa/gsyvideoplayer/utils/o;->D()V

    :cond_1
    return-void
.end method

.method public varargs onEnterFullscreen(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public varargs onEnterSmallWidget(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method protected onPause()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onPause()V

    .line 2
    invoke-virtual {p0}, Lcom/papa/gsyvideoplayer/GSYBaseActivityDetail;->h0()Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;->getCurrentPlayer()Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->onVideoPause()V

    .line 3
    iget-object v0, p0, Lcom/papa/gsyvideoplayer/GSYBaseActivityDetail;->d:Lcom/papa/gsyvideoplayer/utils/o;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, v1}, Lcom/papa/gsyvideoplayer/utils/o;->K(Z)V

    .line 5
    :cond_0
    iput-boolean v1, p0, Lcom/papa/gsyvideoplayer/GSYBaseActivityDetail;->c:Z

    return-void
.end method

.method public varargs onPlayError(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public varargs onPrepared(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/papa/gsyvideoplayer/GSYBaseActivityDetail;->d:Lcom/papa/gsyvideoplayer/utils/o;

    const-string p2, "initVideo() or initVideoBuilderMode() first"

    .line 2
    invoke-static {p1, p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 3
    invoke-virtual {p0}, Lcom/papa/gsyvideoplayer/GSYBaseActivityDetail;->f0()Z

    move-result p2

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lcom/papa/gsyvideoplayer/GSYBaseActivityDetail;->n0()Z

    move-result p2

    if-nez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p1, p2}, Lcom/papa/gsyvideoplayer/utils/o;->I(Z)V

    .line 4
    iput-boolean v0, p0, Lcom/papa/gsyvideoplayer/GSYBaseActivityDetail;->b:Z

    return-void
.end method

.method public varargs onQuitFullscreen(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/papa/gsyvideoplayer/GSYBaseActivityDetail;->d:Lcom/papa/gsyvideoplayer/utils/o;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/papa/gsyvideoplayer/utils/o;->q()I

    :cond_0
    return-void
.end method

.method public varargs onQuitSmallWidget(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method protected onResume()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    .line 2
    invoke-virtual {p0}, Lcom/papa/gsyvideoplayer/GSYBaseActivityDetail;->h0()Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;->getCurrentPlayer()Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->onVideoResume()V

    .line 3
    iget-object v0, p0, Lcom/papa/gsyvideoplayer/GSYBaseActivityDetail;->d:Lcom/papa/gsyvideoplayer/utils/o;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, v1}, Lcom/papa/gsyvideoplayer/utils/o;->K(Z)V

    .line 5
    :cond_0
    iput-boolean v1, p0, Lcom/papa/gsyvideoplayer/GSYBaseActivityDetail;->c:Z

    return-void
.end method

.method public varargs onStartPrepared(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public varargs onTouchScreenSeekLight(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public varargs onTouchScreenSeekPosition(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public varargs onTouchScreenSeekVolume(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    return-void
.end method
