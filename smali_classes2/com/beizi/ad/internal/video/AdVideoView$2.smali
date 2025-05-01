.class Lcom/beizi/ad/internal/video/AdVideoView$2;
.super Ljava/lang/Object;
.source "AdVideoView.java"

# interfaces
.implements Landroid/media/MediaPlayer$OnInfoListener;


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
    iput-object p1, p0, Lcom/beizi/ad/internal/video/AdVideoView$2;->a:Lcom/beizi/ad/internal/video/AdVideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInfo(Landroid/media/MediaPlayer;II)Z
    .locals 0

    const/4 p1, 0x3

    if-ne p2, p1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/beizi/ad/internal/video/AdVideoView$2;->a:Lcom/beizi/ad/internal/video/AdVideoView;

    iget-object p1, p1, Lcom/beizi/ad/internal/video/AdVideoView;->mAdWebView:Lcom/beizi/ad/internal/view/AdWebView;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdDispatcher()Lcom/beizi/ad/internal/b;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/beizi/ad/internal/video/AdVideoView$2;->a:Lcom/beizi/ad/internal/video/AdVideoView;

    iget-object p1, p1, Lcom/beizi/ad/internal/video/AdVideoView;->mAdWebView:Lcom/beizi/ad/internal/view/AdWebView;

    iget-object p1, p1, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdDispatcher()Lcom/beizi/ad/internal/b;

    move-result-object p1

    invoke-interface {p1}, Lcom/beizi/ad/internal/b;->f()V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
