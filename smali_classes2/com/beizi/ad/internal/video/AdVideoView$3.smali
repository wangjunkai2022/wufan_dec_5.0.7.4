.class Lcom/beizi/ad/internal/video/AdVideoView$3;
.super Ljava/lang/Object;
.source "AdVideoView.java"

# interfaces
.implements Landroid/media/MediaPlayer$OnPreparedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/video/AdVideoView;->transferAd(Lcom/beizi/ad/internal/view/AdWebView;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/ad/internal/video/AdVideoView;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/video/AdVideoView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/video/AdVideoView$3;->a:Lcom/beizi/ad/internal/video/AdVideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPrepared(Landroid/media/MediaPlayer;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/video/AdVideoView$3;->a:Lcom/beizi/ad/internal/video/AdVideoView;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getDuration()I

    move-result p1

    div-int/lit16 p1, p1, 0x3e8

    invoke-static {v0, p1}, Lcom/beizi/ad/internal/video/AdVideoView;->a(Lcom/beizi/ad/internal/video/AdVideoView;I)I

    .line 2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "mPlayTime:"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/beizi/ad/internal/video/AdVideoView$3;->a:Lcom/beizi/ad/internal/video/AdVideoView;

    invoke-static {v0}, Lcom/beizi/ad/internal/video/AdVideoView;->b(Lcom/beizi/ad/internal/video/AdVideoView;)I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 3
    iget-object p1, p0, Lcom/beizi/ad/internal/video/AdVideoView$3;->a:Lcom/beizi/ad/internal/video/AdVideoView;

    invoke-static {p1}, Lcom/beizi/ad/internal/video/AdVideoView;->c(Lcom/beizi/ad/internal/video/AdVideoView;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 4
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    const-string v0, "Video start called!"

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    iget-object p1, p0, Lcom/beizi/ad/internal/video/AdVideoView$3;->a:Lcom/beizi/ad/internal/video/AdVideoView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/beizi/ad/internal/video/AdVideoView;->start(I)V

    .line 6
    iget-object p1, p0, Lcom/beizi/ad/internal/video/AdVideoView$3;->a:Lcom/beizi/ad/internal/video/AdVideoView;

    sget-object v0, Lcom/beizi/ad/internal/video/AdVideoView$a;->b:Lcom/beizi/ad/internal/video/AdVideoView$a;

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/video/AdVideoView;->a(Lcom/beizi/ad/internal/video/AdVideoView;Lcom/beizi/ad/internal/video/AdVideoView$a;)Lcom/beizi/ad/internal/video/AdVideoView$a;

    goto :goto_0

    .line 7
    :cond_0
    iget-object p1, p0, Lcom/beizi/ad/internal/video/AdVideoView$3;->a:Lcom/beizi/ad/internal/video/AdVideoView;

    sget-object v0, Lcom/beizi/ad/internal/video/AdVideoView$a;->c:Lcom/beizi/ad/internal/video/AdVideoView$a;

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/video/AdVideoView;->a(Lcom/beizi/ad/internal/video/AdVideoView;Lcom/beizi/ad/internal/video/AdVideoView$a;)Lcom/beizi/ad/internal/video/AdVideoView$a;

    :goto_0
    return-void
.end method
