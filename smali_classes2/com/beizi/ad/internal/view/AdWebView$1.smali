.class Lcom/beizi/ad/internal/view/AdWebView$1;
.super Lcom/beizi/ad/internal/utilities/HTTPGet;
.source "AdWebView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/view/AdWebView;->a(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/beizi/ad/internal/view/AdWebView;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/view/AdWebView;ZZLjava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/view/AdWebView$1;->b:Lcom/beizi/ad/internal/view/AdWebView;

    iput-object p4, p0, Lcom/beizi/ad/internal/view/AdWebView$1;->a:Ljava/lang/String;

    invoke-direct {p0, p2, p3}, Lcom/beizi/ad/internal/utilities/HTTPGet;-><init>(ZZ)V

    return-void
.end method


# virtual methods
.method protected getUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView$1;->a:Ljava/lang/String;

    return-object v0
.end method

.method protected onPostExecute(Lcom/beizi/ad/internal/utilities/HTTPResponse;)V
    .locals 7

    .line 2
    invoke-virtual {p1}, Lcom/beizi/ad/internal/utilities/HTTPResponse;->getSucceeded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView$1;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/utilities/HTTPResponse;->getResponseBody()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/beizi/ad/internal/view/AdWebView;->a(Lcom/beizi/ad/internal/view/AdWebView;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 4
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView$1;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-static {v0, p1}, Lcom/beizi/ad/internal/view/AdWebView;->b(Lcom/beizi/ad/internal/view/AdWebView;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 5
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView$1;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-static {v0, p1}, Lcom/beizi/ad/internal/view/AdWebView;->c(Lcom/beizi/ad/internal/view/AdWebView;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 6
    iget-object v1, p0, Lcom/beizi/ad/internal/view/AdWebView$1;->b:Lcom/beizi/ad/internal/view/AdWebView;

    const/4 v2, 0x0

    const/4 v6, 0x0

    const-string v4, "text/html"

    const-string v5, "UTF-8"

    invoke-virtual/range {v1 .. v6}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdWebView$1;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/AdWebView;->fireMRAIDEnabled()V

    :cond_0
    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/beizi/ad/internal/utilities/HTTPResponse;

    invoke-virtual {p0, p1}, Lcom/beizi/ad/internal/view/AdWebView$1;->onPostExecute(Lcom/beizi/ad/internal/utilities/HTTPResponse;)V

    return-void
.end method
