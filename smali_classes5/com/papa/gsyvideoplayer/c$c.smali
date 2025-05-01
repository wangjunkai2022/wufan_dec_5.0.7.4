.class Lcom/papa/gsyvideoplayer/c$c;
.super Ljava/lang/Object;
.source "GSYVideoBaseManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/papa/gsyvideoplayer/c;->onBufferingUpdate(Ltv/danmaku/ijk/media/player/IMediaPlayer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/papa/gsyvideoplayer/c;


# direct methods
.method constructor <init>(Lcom/papa/gsyvideoplayer/c;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa/gsyvideoplayer/c$c;->c:Lcom/papa/gsyvideoplayer/c;

    iput p2, p0, Lcom/papa/gsyvideoplayer/c$c;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/papa/gsyvideoplayer/c$c;->c:Lcom/papa/gsyvideoplayer/c;

    invoke-virtual {v0}, Lcom/papa/gsyvideoplayer/c;->w()Ls2/a;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2
    iget v0, p0, Lcom/papa/gsyvideoplayer/c$c;->b:I

    iget-object v1, p0, Lcom/papa/gsyvideoplayer/c$c;->c:Lcom/papa/gsyvideoplayer/c;

    iget v2, v1, Lcom/papa/gsyvideoplayer/c;->o:I

    if-le v0, v2, :cond_0

    .line 3
    invoke-virtual {v1}, Lcom/papa/gsyvideoplayer/c;->w()Ls2/a;

    move-result-object v0

    iget v1, p0, Lcom/papa/gsyvideoplayer/c$c;->b:I

    invoke-interface {v0, v1}, Ls2/a;->onBufferingUpdate(I)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v1}, Lcom/papa/gsyvideoplayer/c;->w()Ls2/a;

    move-result-object v0

    iget-object v1, p0, Lcom/papa/gsyvideoplayer/c$c;->c:Lcom/papa/gsyvideoplayer/c;

    iget v1, v1, Lcom/papa/gsyvideoplayer/c;->o:I

    invoke-interface {v0, v1}, Ls2/a;->onBufferingUpdate(I)V

    :cond_1
    :goto_0
    return-void
.end method
