.class Lcom/beizi/fusion/widget/LandingView$3;
.super Landroid/webkit/WebViewClient;
.source "LandingView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/widget/LandingView;->init()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/widget/LandingView;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/widget/LandingView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/widget/LandingView$3;->a:Lcom/beizi/fusion/widget/LandingView;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lcom/beizi/fusion/g/h;->b()Lcom/beizi/fusion/g/h;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beizi/fusion/g/h;->e()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    new-instance p2, Lcom/beizi/fusion/widget/LandingView$3$1;

    invoke-direct {p2, p0}, Lcom/beizi/fusion/widget/LandingView$3$1;-><init>(Lcom/beizi/fusion/widget/LandingView$3;)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/widget/LandingView$3;->a:Lcom/beizi/fusion/widget/LandingView;

    invoke-static {p1}, Lcom/beizi/fusion/widget/LandingView;->e(Lcom/beizi/fusion/widget/LandingView;)Landroid/os/Handler;

    move-result-object p1

    iget-object p2, p0, Lcom/beizi/fusion/widget/LandingView$3;->a:Lcom/beizi/fusion/widget/LandingView;

    invoke-static {p2}, Lcom/beizi/fusion/widget/LandingView;->c(Lcom/beizi/fusion/widget/LandingView;)Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;

    move-result-object p2

    invoke-virtual {p2}, Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;->getShowTime()J

    move-result-wide v0

    const/4 p2, 0x1

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/widget/LandingView$3;->a:Lcom/beizi/fusion/widget/LandingView;

    invoke-static {p1}, Lcom/beizi/fusion/widget/LandingView;->f(Lcom/beizi/fusion/widget/LandingView;)V

    return-void
.end method

.method public onReceivedHttpError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedHttpError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/widget/LandingView$3;->a:Lcom/beizi/fusion/widget/LandingView;

    invoke-static {p1}, Lcom/beizi/fusion/widget/LandingView;->f(Lcom/beizi/fusion/widget/LandingView;)V

    return-void
.end method

.method public onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/widget/LandingView$3;->a:Lcom/beizi/fusion/widget/LandingView;

    invoke-static {p1}, Lcom/beizi/fusion/widget/LandingView;->f(Lcom/beizi/fusion/widget/LandingView;)V

    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method
