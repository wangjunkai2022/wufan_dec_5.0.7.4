.class public Lcom/kwad/sdk/core/webview/KsAdWebView;
.super Lcom/kwad/sdk/core/webview/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/sdk/core/webview/KsAdWebView$c;,
        Lcom/kwad/sdk/core/webview/KsAdWebView$a;,
        Lcom/kwad/sdk/core/webview/KsAdWebView$b;,
        Lcom/kwad/sdk/core/webview/KsAdWebView$d;,
        Lcom/kwad/sdk/core/webview/KsAdWebView$e;
    }
.end annotation


# instance fields
.field private Ih:Lcom/kwad/sdk/core/webview/a/c$a;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private aFd:Lcom/kwad/sdk/core/webview/a/c;

.field private aFe:Ljava/lang/String;

.field private aFf:J

.field private aFg:Lcom/kwad/sdk/core/webview/d;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mUniqueId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/sdk/core/webview/c;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/kwad/sdk/core/webview/KsAdWebView;->init(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/kwad/sdk/core/webview/c;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    invoke-direct {p0, p1}, Lcom/kwad/sdk/core/webview/KsAdWebView;->init(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2, p3}, Lcom/kwad/sdk/core/webview/c;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    invoke-direct {p0, p1}, Lcom/kwad/sdk/core/webview/KsAdWebView;->init(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IZ)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/kwad/sdk/core/webview/c;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IZ)V

    .line 8
    invoke-direct {p0, p1}, Lcom/kwad/sdk/core/webview/KsAdWebView;->init(Landroid/content/Context;)V

    return-void
.end method

.method private Hy()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "KSADSDK_V3.3.63_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    invoke-virtual {p0}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/utils/k;->cd(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic e(Lcom/kwad/sdk/core/webview/KsAdWebView;)Lcom/kwad/sdk/core/webview/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/core/webview/KsAdWebView;->aFg:Lcom/kwad/sdk/core/webview/d;

    return-object p0
.end method

.method static synthetic f(Lcom/kwad/sdk/core/webview/KsAdWebView;)Lcom/kwad/sdk/core/webview/a/c$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/core/webview/KsAdWebView;->Ih:Lcom/kwad/sdk/core/webview/a/c$a;

    return-object p0
.end method

.method static synthetic g(Lcom/kwad/sdk/core/webview/KsAdWebView;)Lcom/kwad/sdk/core/webview/a/c$a;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/webview/KsAdWebView;->getReadyClientConfig()Lcom/kwad/sdk/core/webview/a/c$a;

    move-result-object p0

    return-object p0
.end method

.method private getReadyClientConfig()Lcom/kwad/sdk/core/webview/a/c$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/webview/KsAdWebView;->aFd:Lcom/kwad/sdk/core/webview/a/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/kwad/sdk/core/webview/a/c;->getClientConfig()Lcom/kwad/sdk/core/webview/a/c$a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/core/webview/KsAdWebView;->aFd:Lcom/kwad/sdk/core/webview/a/c;

    invoke-virtual {v0}, Lcom/kwad/sdk/core/webview/a/c;->getClientConfig()Lcom/kwad/sdk/core/webview/a/c$a;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private init(Landroid/content/Context;)V
    .locals 3

    const-string v0, "KsAdWebView"

    const-string v1, "init"

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/kwad/sdk/core/webview/KsAdWebView;->setAccessibilityStateDisable(Landroid/content/Context;)V

    .line 3
    invoke-static {p0}, Lcom/kwad/sdk/utils/bt;->a(Landroid/webkit/WebView;)Landroid/webkit/WebSettings;

    move-result-object p1

    const/4 v0, 0x1

    .line 4
    invoke-virtual {p1, v0}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 5
    invoke-virtual {p1, v0}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0}, Landroid/webkit/WebView;->setVerticalScrollBarEnabled(Z)V

    .line 7
    new-instance v1, Lcom/kwad/sdk/core/webview/KsAdWebView$1;

    invoke-direct {v1, p0}, Lcom/kwad/sdk/core/webview/KsAdWebView$1;-><init>(Lcom/kwad/sdk/core/webview/KsAdWebView;)V

    iput-object v1, p0, Lcom/kwad/sdk/core/webview/KsAdWebView;->aFd:Lcom/kwad/sdk/core/webview/a/c;

    .line 8
    iget-object v2, p0, Lcom/kwad/sdk/core/webview/KsAdWebView;->mUniqueId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/kwad/sdk/core/webview/a/c;->L(Ljava/lang/String;)V

    .line 9
    iget-object v1, p0, Lcom/kwad/sdk/core/webview/KsAdWebView;->aFd:Lcom/kwad/sdk/core/webview/a/c;

    invoke-virtual {p0, v1}, Lcom/kwad/sdk/core/webview/KsAdWebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 10
    new-instance v1, Lcom/kwad/sdk/core/webview/a/b;

    invoke-direct {v1}, Lcom/kwad/sdk/core/webview/a/b;-><init>()V

    invoke-virtual {p0, v1}, Lcom/kwad/sdk/core/webview/KsAdWebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 11
    new-instance v1, Lcom/kwad/sdk/core/webview/KsAdWebView$a;

    invoke-direct {v1, p0, v0}, Lcom/kwad/sdk/core/webview/KsAdWebView$a;-><init>(Lcom/kwad/sdk/core/webview/KsAdWebView;B)V

    invoke-virtual {p0, v1}, Landroid/webkit/WebView;->setDownloadListener(Landroid/webkit/DownloadListener;)V

    .line 12
    invoke-virtual {p1}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;

    move-result-object v0

    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lcom/kwad/sdk/core/webview/KsAdWebView;->Hy()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    .line 14
    new-instance p1, Lcom/kwad/sdk/core/webview/a/c$a;

    invoke-virtual {p0}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/kwad/sdk/core/webview/a/c$a;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/kwad/sdk/core/webview/KsAdWebView;->Ih:Lcom/kwad/sdk/core/webview/a/c$a;

    return-void
.end method

.method private setAccessibilityStateDisable(Landroid/content/Context;)V
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-ne v0, v1, :cond_1

    if-eqz p1, :cond_1

    :try_start_0
    const-string v0, "accessibility"

    .line 2
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/accessibility/AccessibilityManager;

    if-eqz p1, :cond_1

    .line 3
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "setState"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    .line 4
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {p1, v0, v1}, Lcom/kwad/sdk/utils/s;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public getClientConfig()Lcom/kwad/sdk/core/webview/a/c$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/webview/KsAdWebView;->Ih:Lcom/kwad/sdk/core/webview/a/c$a;

    return-object v0
.end method

.method public getLoadTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/kwad/sdk/core/webview/KsAdWebView;->aFf:J

    return-wide v0
.end method

.method public getLoadUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/webview/KsAdWebView;->aFe:Ljava/lang/String;

    return-object v0
.end method

.method public getUniqueId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/webview/KsAdWebView;->mUniqueId:Ljava/lang/String;

    return-object v0
.end method

.method public loadUrl(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/webview/KsAdWebView;->mUniqueId:Ljava/lang/String;

    invoke-static {v0}, Lcom/kwad/sdk/core/webview/b/c/b;->fg(Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Lcom/kwad/sdk/core/webview/KsAdWebView;->aFe:Ljava/lang/String;

    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/core/webview/KsAdWebView;->aFf:J

    .line 4
    invoke-super {p0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    return-void
.end method

.method public final onActivityCreate()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/webview/KsAdWebView;->aFg:Lcom/kwad/sdk/core/webview/d;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lcom/kwad/sdk/core/webview/KsAdWebView;->Ih:Lcom/kwad/sdk/core/webview/a/c$a;

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/webview/d;->a(Lcom/kwad/sdk/core/webview/a/c$a;)V

    :cond_0
    return-void
.end method

.method public final onActivityDestroy()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/core/webview/c;->release()V

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/core/webview/KsAdWebView;->aFg:Lcom/kwad/sdk/core/webview/d;

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p0, Lcom/kwad/sdk/core/webview/KsAdWebView;->Ih:Lcom/kwad/sdk/core/webview/a/c$a;

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/webview/d;->b(Lcom/kwad/sdk/core/webview/a/c$a;)V

    :cond_0
    return-void
.end method

.method protected onScrollChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebView;->onScrollChanged(IIII)V

    .line 2
    iget-object p1, p0, Lcom/kwad/sdk/core/webview/KsAdWebView;->Ih:Lcom/kwad/sdk/core/webview/a/c$a;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/kwad/sdk/core/webview/a/c$a;->qa()Lcom/kwad/sdk/core/webview/KsAdWebView$c;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/kwad/sdk/core/webview/KsAdWebView;->Ih:Lcom/kwad/sdk/core/webview/a/c$a;

    invoke-virtual {p1}, Lcom/kwad/sdk/core/webview/a/c$a;->qa()Lcom/kwad/sdk/core/webview/KsAdWebView$c;

    move-result-object p1

    invoke-interface {p1}, Lcom/kwad/sdk/core/webview/KsAdWebView$c;->qb()V

    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/core/webview/KsAdWebView;->Ih:Lcom/kwad/sdk/core/webview/a/c$a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/kwad/sdk/core/webview/a/c$a;->aC(J)V

    .line 3
    :cond_0
    invoke-super {p0, p1}, Landroid/webkit/WebView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public setClientConfig(Lcom/kwad/sdk/core/webview/a/c$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/webview/KsAdWebView;->aFd:Lcom/kwad/sdk/core/webview/a/c;

    invoke-virtual {v0, p1}, Lcom/kwad/sdk/core/webview/a/c;->setClientConfig(Lcom/kwad/sdk/core/webview/a/c$a;)V

    .line 2
    iget-object p1, p0, Lcom/kwad/sdk/core/webview/KsAdWebView;->Ih:Lcom/kwad/sdk/core/webview/a/c$a;

    invoke-virtual {p1}, Lcom/kwad/sdk/core/webview/a/c$a;->HE()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    new-instance p1, Lcom/kwad/sdk/core/webview/d;

    invoke-direct {p1}, Lcom/kwad/sdk/core/webview/d;-><init>()V

    iput-object p1, p0, Lcom/kwad/sdk/core/webview/KsAdWebView;->aFg:Lcom/kwad/sdk/core/webview/d;

    :cond_0
    return-void
.end method

.method public setWebChromeClient(Landroid/webkit/WebChromeClient;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/framework/a/a;->md:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    instance-of v0, p1, Lcom/kwad/sdk/core/webview/a/b;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "client is not instanceof KSWebChromeClient"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    return-void
.end method

.method public setWebViewClient(Landroid/webkit/WebViewClient;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/framework/a/a;->md:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    instance-of v0, p1, Lcom/kwad/sdk/core/webview/a/a;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Not supported set webViewClient, please check it"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    return-void
.end method
