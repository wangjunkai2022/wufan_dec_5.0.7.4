.class Lcom/beizi/ad/internal/view/AdWebView$c$1;
.super Landroid/webkit/WebViewClient;
.source "AdWebView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/view/AdWebView$c;-><init>(Lcom/beizi/ad/internal/view/AdWebView;Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/ad/internal/view/AdWebView;

.field final synthetic b:Lcom/beizi/ad/internal/view/AdWebView$c;

.field private c:Z


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/view/AdWebView$c;Lcom/beizi/ad/internal/view/AdWebView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/view/AdWebView$c$1;->b:Lcom/beizi/ad/internal/view/AdWebView$c;

    iput-object p2, p0, Lcom/beizi/ad/internal/view/AdWebView$c$1;->a:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/beizi/ad/internal/view/AdWebView$c$1;->c:Z

    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->browserLogTag:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Opening URL: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdWebView$c$1;->b:Lcom/beizi/ad/internal/view/AdWebView$c;

    invoke-static {p1}, Lcom/beizi/ad/internal/utilities/ViewUtil;->removeChildFromParent(Landroid/view/View;)V

    .line 3
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdWebView$c$1;->b:Lcom/beizi/ad/internal/view/AdWebView$c;

    iget-object p1, p1, Lcom/beizi/ad/internal/view/AdWebView$c;->a:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-static {p1}, Lcom/beizi/ad/internal/view/AdWebView;->i(Lcom/beizi/ad/internal/view/AdWebView;)Landroid/app/ProgressDialog;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdWebView$c$1;->b:Lcom/beizi/ad/internal/view/AdWebView$c;

    iget-object p1, p1, Lcom/beizi/ad/internal/view/AdWebView$c;->a:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-static {p1}, Lcom/beizi/ad/internal/view/AdWebView;->i(Lcom/beizi/ad/internal/view/AdWebView;)Landroid/app/ProgressDialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 4
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdWebView$c$1;->b:Lcom/beizi/ad/internal/view/AdWebView$c;

    iget-object p1, p1, Lcom/beizi/ad/internal/view/AdWebView$c;->a:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-static {p1}, Lcom/beizi/ad/internal/view/AdWebView;->i(Lcom/beizi/ad/internal/view/AdWebView;)Landroid/app/ProgressDialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->dismiss()V

    .line 5
    :cond_0
    iget-boolean p1, p0, Lcom/beizi/ad/internal/view/AdWebView$c$1;->c:Z

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    .line 6
    iput-boolean p2, p0, Lcom/beizi/ad/internal/view/AdWebView$c$1;->c:Z

    .line 7
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdWebView$c$1;->b:Lcom/beizi/ad/internal/view/AdWebView$c;

    invoke-virtual {p1}, Landroid/webkit/WebView;->destroy()V

    .line 8
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdWebView$c$1;->b:Lcom/beizi/ad/internal/view/AdWebView$c;

    iget-object p1, p1, Lcom/beizi/ad/internal/view/AdWebView$c;->a:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-static {p1}, Lcom/beizi/ad/internal/view/AdWebView;->j(Lcom/beizi/ad/internal/view/AdWebView;)V

    return-void

    .line 9
    :cond_1
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdWebView$c$1;->b:Lcom/beizi/ad/internal/view/AdWebView$c;

    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 10
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdWebView$c$1;->b:Lcom/beizi/ad/internal/view/AdWebView$c;

    iget-object p2, p1, Lcom/beizi/ad/internal/view/AdWebView$c;->a:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-static {p2, p1}, Lcom/beizi/ad/internal/view/AdWebView;->a(Lcom/beizi/ad/internal/view/AdWebView;Landroid/webkit/WebView;)V

    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 2

    .line 1
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->browserLogTag:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Redirecting to URL: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdWebView$c$1;->b:Lcom/beizi/ad/internal/view/AdWebView$c;

    iget-object p1, p1, Lcom/beizi/ad/internal/view/AdWebView$c;->a:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-static {p1, p2}, Lcom/beizi/ad/internal/view/AdWebView;->d(Lcom/beizi/ad/internal/view/AdWebView;Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/beizi/ad/internal/view/AdWebView$c$1;->c:Z

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdWebView$c$1;->b:Lcom/beizi/ad/internal/view/AdWebView$c;

    iget-object p1, p1, Lcom/beizi/ad/internal/view/AdWebView$c;->a:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-static {p1}, Lcom/beizi/ad/internal/view/AdWebView;->i(Lcom/beizi/ad/internal/view/AdWebView;)Landroid/app/ProgressDialog;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdWebView$c$1;->b:Lcom/beizi/ad/internal/view/AdWebView$c;

    iget-object p1, p1, Lcom/beizi/ad/internal/view/AdWebView$c;->a:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-static {p1}, Lcom/beizi/ad/internal/view/AdWebView;->i(Lcom/beizi/ad/internal/view/AdWebView;)Landroid/app/ProgressDialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 4
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdWebView$c$1;->b:Lcom/beizi/ad/internal/view/AdWebView$c;

    iget-object p1, p1, Lcom/beizi/ad/internal/view/AdWebView$c;->a:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-static {p1}, Lcom/beizi/ad/internal/view/AdWebView;->i(Lcom/beizi/ad/internal/view/AdWebView;)Landroid/app/ProgressDialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->dismiss()V

    .line 5
    :cond_0
    iget-boolean p1, p0, Lcom/beizi/ad/internal/view/AdWebView$c$1;->c:Z

    return p1
.end method
