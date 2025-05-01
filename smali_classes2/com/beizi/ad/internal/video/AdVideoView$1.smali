.class Lcom/beizi/ad/internal/video/AdVideoView$1;
.super Ljava/lang/Object;
.source "AdVideoView.java"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/video/AdVideoView;->transferAd(Lcom/beizi/ad/internal/view/AdWebView;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/ad/internal/view/AdWebView;

.field final synthetic b:Lcom/beizi/ad/internal/video/AdVideoView;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/video/AdVideoView;Lcom/beizi/ad/internal/view/AdWebView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/video/AdVideoView$1;->b:Lcom/beizi/ad/internal/video/AdVideoView;

    iput-object p2, p0, Lcom/beizi/ad/internal/video/AdVideoView$1;->a:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/beizi/ad/internal/video/AdVideoView$1;->b:Lcom/beizi/ad/internal/video/AdVideoView;

    iget-object p1, p1, Lcom/beizi/ad/internal/video/AdVideoView;->mAdWebView:Lcom/beizi/ad/internal/view/AdWebView;

    iget-object p1, p1, Lcom/beizi/ad/internal/view/AdWebView;->ad:Lcom/beizi/ad/internal/network/ServerResponse;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/network/ServerResponse;->handleOnCompletion()V

    .line 2
    iget-object p1, p0, Lcom/beizi/ad/internal/video/AdVideoView$1;->b:Lcom/beizi/ad/internal/video/AdVideoView;

    invoke-static {p1}, Lcom/beizi/ad/internal/video/AdVideoView;->a(Lcom/beizi/ad/internal/video/AdVideoView;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/beizi/ad/internal/video/AdVideoView$1;->b:Lcom/beizi/ad/internal/video/AdVideoView;

    iget-object p1, p1, Lcom/beizi/ad/internal/video/AdVideoView;->mAdWebView:Lcom/beizi/ad/internal/view/AdWebView;

    iget-object p1, p1, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdDispatcher()Lcom/beizi/ad/internal/b;

    move-result-object p1

    iget-object v0, p0, Lcom/beizi/ad/internal/video/AdVideoView$1;->b:Lcom/beizi/ad/internal/video/AdVideoView;

    invoke-static {v0}, Lcom/beizi/ad/internal/video/AdVideoView;->a(Lcom/beizi/ad/internal/video/AdVideoView;)Landroid/util/Pair;

    move-result-object v0

    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/beizi/ad/internal/video/AdVideoView$1;->b:Lcom/beizi/ad/internal/video/AdVideoView;

    invoke-static {v1}, Lcom/beizi/ad/internal/video/AdVideoView;->a(Lcom/beizi/ad/internal/video/AdVideoView;)Landroid/util/Pair;

    move-result-object v1

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {p1, v0, v1}, Lcom/beizi/ad/internal/b;->a(Ljava/lang/String;I)V

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/beizi/ad/internal/video/AdVideoView$1;->b:Lcom/beizi/ad/internal/video/AdVideoView;

    iget-object p1, p1, Lcom/beizi/ad/internal/video/AdVideoView;->mAdWebView:Lcom/beizi/ad/internal/view/AdWebView;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/beizi/ad/internal/view/AdWebView;->loadAdBy(I)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    .line 5
    :cond_1
    iget-object p1, p0, Lcom/beizi/ad/internal/video/AdVideoView$1;->a:Lcom/beizi/ad/internal/view/AdWebView;

    iget-object p1, p1, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    instance-of v0, p1, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    if-eqz v0, :cond_2

    .line 6
    check-cast p1, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->getAdImplementation()Lcom/beizi/ad/AdActivity$a;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 7
    iget-object p1, p0, Lcom/beizi/ad/internal/video/AdVideoView$1;->a:Lcom/beizi/ad/internal/view/AdWebView;

    iget-object p1, p1, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    check-cast p1, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->getAdImplementation()Lcom/beizi/ad/AdActivity$a;

    move-result-object p1

    check-cast p1, Lcom/beizi/ad/internal/activity/b;

    .line 8
    invoke-virtual {p1}, Lcom/beizi/ad/internal/activity/b;->g()V

    :cond_2
    :goto_0
    return-void
.end method
