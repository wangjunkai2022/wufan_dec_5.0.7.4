.class final Lcom/kwad/components/core/video/b$2;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/video/b;->onPlayStateChanged(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic UT:Lcom/kwad/components/core/video/b;

.field final synthetic UU:I


# direct methods
.method constructor <init>(Lcom/kwad/components/core/video/b;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/video/b$2;->UT:Lcom/kwad/components/core/video/b;

    iput p2, p0, Lcom/kwad/components/core/video/b$2;->UU:I

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/b$2;->UT:Lcom/kwad/components/core/video/b;

    invoke-static {v0}, Lcom/kwad/components/core/video/b;->i(Lcom/kwad/components/core/video/b;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/components/core/video/k;

    .line 2
    iget v2, p0, Lcom/kwad/components/core/video/b$2;->UU:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    packed-switch v2, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    .line 3
    :pswitch_1
    iget-object v2, p0, Lcom/kwad/components/core/video/b$2;->UT:Lcom/kwad/components/core/video/b;

    invoke-static {v2}, Lcom/kwad/components/core/video/b;->e(Lcom/kwad/components/core/video/b;)Lcom/kwad/sdk/core/video/a/c;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/kwad/components/core/video/b$2;->UT:Lcom/kwad/components/core/video/b;

    invoke-static {v2}, Lcom/kwad/components/core/video/b;->e(Lcom/kwad/components/core/video/b;)Lcom/kwad/sdk/core/video/a/c;

    move-result-object v2

    invoke-interface {v2}, Lcom/kwad/sdk/core/video/a/c;->isLooping()Z

    move-result v2

    if-nez v2, :cond_0

    .line 4
    iget-object v2, p0, Lcom/kwad/components/core/video/b$2;->UT:Lcom/kwad/components/core/video/b;

    invoke-static {v2, v4}, Lcom/kwad/components/core/video/b;->b(Lcom/kwad/components/core/video/b;Z)V

    .line 5
    iget-object v2, p0, Lcom/kwad/components/core/video/b$2;->UT:Lcom/kwad/components/core/video/b;

    invoke-static {v2}, Lcom/kwad/components/core/video/b;->j(Lcom/kwad/components/core/video/b;)V

    .line 6
    :cond_0
    invoke-interface {v1}, Lcom/kwad/components/core/video/h;->onMediaPlayCompleted()V

    goto :goto_0

    .line 7
    :pswitch_2
    invoke-interface {v1}, Lcom/kwad/components/core/video/k;->onVideoPlayBufferingPaused()V

    goto :goto_0

    .line 8
    :pswitch_3
    invoke-interface {v1}, Lcom/kwad/components/core/video/k;->onVideoPlayBufferingPlaying()V

    goto :goto_0

    .line 9
    :pswitch_4
    iget-object v2, p0, Lcom/kwad/components/core/video/b$2;->UT:Lcom/kwad/components/core/video/b;

    invoke-static {v2, v4}, Lcom/kwad/components/core/video/b;->b(Lcom/kwad/components/core/video/b;Z)V

    .line 10
    invoke-interface {v1}, Lcom/kwad/components/core/video/h;->onMediaPlayPaused()V

    goto :goto_0

    .line 11
    :pswitch_5
    iget-object v2, p0, Lcom/kwad/components/core/video/b$2;->UT:Lcom/kwad/components/core/video/b;

    invoke-static {v2, v3}, Lcom/kwad/components/core/video/b;->b(Lcom/kwad/components/core/video/b;Z)V

    .line 12
    invoke-interface {v1}, Lcom/kwad/components/core/video/h;->onMediaPlaying()V

    goto :goto_0

    .line 13
    :pswitch_6
    iget-object v2, p0, Lcom/kwad/components/core/video/b$2;->UT:Lcom/kwad/components/core/video/b;

    invoke-static {v2, v3}, Lcom/kwad/components/core/video/b;->b(Lcom/kwad/components/core/video/b;Z)V

    .line 14
    invoke-interface {v1}, Lcom/kwad/components/core/video/h;->onMediaPlayStart()V

    goto :goto_0

    .line 15
    :pswitch_7
    invoke-interface {v1}, Lcom/kwad/components/core/video/h;->onMediaPrepared()V

    goto :goto_0

    .line 16
    :pswitch_8
    invoke-interface {v1}, Lcom/kwad/components/core/video/h;->onMediaPreparing()V

    goto :goto_0

    .line 17
    :pswitch_9
    iget-object v2, p0, Lcom/kwad/components/core/video/b$2;->UT:Lcom/kwad/components/core/video/b;

    invoke-static {v2, v4}, Lcom/kwad/components/core/video/b;->b(Lcom/kwad/components/core/video/b;Z)V

    .line 18
    iget-object v2, p0, Lcom/kwad/components/core/video/b$2;->UT:Lcom/kwad/components/core/video/b;

    invoke-static {v2}, Lcom/kwad/components/core/video/b;->j(Lcom/kwad/components/core/video/b;)V

    .line 19
    iget-object v2, p0, Lcom/kwad/components/core/video/b$2;->UT:Lcom/kwad/components/core/video/b;

    invoke-static {v2}, Lcom/kwad/components/core/video/b;->k(Lcom/kwad/components/core/video/b;)I

    move-result v2

    iget-object v3, p0, Lcom/kwad/components/core/video/b$2;->UT:Lcom/kwad/components/core/video/b;

    invoke-static {v3}, Lcom/kwad/components/core/video/b;->l(Lcom/kwad/components/core/video/b;)I

    move-result v3

    invoke-interface {v1, v2, v3}, Lcom/kwad/components/core/video/h;->onMediaPlayError(II)V

    goto :goto_0

    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
