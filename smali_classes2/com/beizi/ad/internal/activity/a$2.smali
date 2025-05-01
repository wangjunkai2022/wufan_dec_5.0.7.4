.class Lcom/beizi/ad/internal/activity/a$2;
.super Landroid/webkit/WebViewClient;
.source "BrowserAdActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/activity/a;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/ad/internal/activity/a;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/activity/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/activity/a$2;->a:Lcom/beizi/ad/internal/activity/a;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {}, Landroid/webkit/CookieSyncManager;->getInstance()Landroid/webkit/CookieSyncManager;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Landroid/webkit/CookieSyncManager;->sync()V

    :cond_0
    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z
    .locals 4

    const/4 v0, 0x1

    .line 1
    :try_start_0
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "http"

    .line 3
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 4
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/a$2;->a:Lcom/beizi/ad/internal/activity/a;

    invoke-static {p1}, Lcom/beizi/ad/internal/activity/a;->a(Lcom/beizi/ad/internal/activity/a;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 5
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/a$2;->a:Lcom/beizi/ad/internal/activity/a;

    invoke-static {p1, v1}, Lcom/beizi/ad/internal/activity/a;->a(Lcom/beizi/ad/internal/activity/a;Ljava/lang/String;)V

    :cond_1
    return v0

    .line 6
    :cond_2
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getRequestHeaders()Ljava/util/Map;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 7
    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v2

    if-nez v2, :cond_4

    .line 8
    :cond_3
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    :cond_4
    const-string v2, "X-Requested-With"

    const-string v3, ""

    .line 9
    invoke-interface {p2, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    invoke-virtual {p1, v1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    return v0
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 1

    .line 12
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->browserLogTag:Ljava/lang/String;

    sget v0, Lcom/beizi/ad/R$string;->opening_url:I

    .line 13
    invoke-static {v0, p2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 14
    invoke-static {p1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->v(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "http"

    .line 15
    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 16
    :cond_0
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/a$2;->a:Lcom/beizi/ad/internal/activity/a;

    invoke-static {p1}, Lcom/beizi/ad/internal/activity/a;->a(Lcom/beizi/ad/internal/activity/a;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 17
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/a$2;->a:Lcom/beizi/ad/internal/activity/a;

    invoke-static {p1, p2}, Lcom/beizi/ad/internal/activity/a;->a(Lcom/beizi/ad/internal/activity/a;Ljava/lang/String;)V

    :cond_1
    const/4 p1, 0x1

    return p1
.end method
