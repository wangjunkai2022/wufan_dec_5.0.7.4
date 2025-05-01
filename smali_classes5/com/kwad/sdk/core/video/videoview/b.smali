.class public abstract Lcom/kwad/sdk/core/video/videoview/b;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# instance fields
.field private UC:Ljava/lang/Runnable;

.field protected final aCR:Lcom/kwad/sdk/core/video/videoview/c;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/kwad/sdk/core/video/videoview/c;)V
    .locals 0
    .param p2    # Lcom/kwad/sdk/core/video/videoview/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 2
    iput-object p2, p0, Lcom/kwad/sdk/core/video/videoview/b;->aCR:Lcom/kwad/sdk/core/video/videoview/c;

    return-void
.end method

.method static synthetic a(Lcom/kwad/sdk/core/video/videoview/b;)Ljava/lang/Runnable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/core/video/videoview/b;->UC:Ljava/lang/Runnable;

    return-object p0
.end method


# virtual methods
.method public n(II)V
    .locals 0

    return-void
.end method

.method protected abstract onPlayStateChanged(I)V
.end method

.method protected abstract rU()V
.end method

.method protected abstract reset()V
.end method

.method protected final sa()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/core/video/videoview/b;->sb()V

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/b;->UC:Ljava/lang/Runnable;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Lcom/kwad/sdk/core/video/videoview/b$1;

    invoke-direct {v0, p0}, Lcom/kwad/sdk/core/video/videoview/b$1;-><init>(Lcom/kwad/sdk/core/video/videoview/b;)V

    iput-object v0, p0, Lcom/kwad/sdk/core/video/videoview/b;->UC:Ljava/lang/Runnable;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/b;->UC:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/widget/RelativeLayout;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method protected final sb()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/video/videoview/b;->UC:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0, v0}, Landroid/widget/RelativeLayout;->removeCallbacks(Ljava/lang/Runnable;)Z

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/kwad/sdk/core/video/videoview/b;->UC:Ljava/lang/Runnable;

    :cond_0
    return-void
.end method
