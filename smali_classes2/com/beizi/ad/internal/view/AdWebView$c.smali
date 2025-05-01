.class Lcom/beizi/ad/internal/view/AdWebView$c;
.super Landroid/webkit/WebView;
.source "AdWebView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/ad/internal/view/AdWebView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/ad/internal/view/AdWebView;


# direct methods
.method public constructor <init>(Lcom/beizi/ad/internal/view/AdWebView;Landroid/content/Context;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetJavaScriptEnabled"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/view/AdWebView$c;->a:Lcom/beizi/ad/internal/view/AdWebView;

    .line 2
    new-instance v0, Landroid/content/MutableContextWrapper;

    invoke-direct {v0, p2}, Landroid/content/MutableContextWrapper;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 3
    invoke-static {p0}, Lcom/beizi/ad/internal/utilities/WebviewUtil;->setWebViewSettings(Landroid/webkit/WebView;)V

    .line 4
    new-instance p2, Lcom/beizi/ad/internal/view/AdWebView$c$1;

    invoke-direct {p2, p0, p1}, Lcom/beizi/ad/internal/view/AdWebView$c$1;-><init>(Lcom/beizi/ad/internal/view/AdWebView$c;Lcom/beizi/ad/internal/view/AdWebView;)V

    invoke-virtual {p0, p2}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    return-void
.end method
