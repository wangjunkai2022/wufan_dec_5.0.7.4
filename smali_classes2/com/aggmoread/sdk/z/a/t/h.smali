.class public Lcom/aggmoread/sdk/z/a/t/h;
.super Landroid/webkit/WebView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/z/a/t/h$c;,
        Lcom/aggmoread/sdk/z/a/t/h$b;,
        Lcom/aggmoread/sdk/z/a/t/h$d;
    }
.end annotation


# instance fields
.field private a:Lcom/aggmoread/sdk/z/a/t/g;

.field private b:Landroid/content/Context;

.field private c:Landroid/widget/TextView;

.field private d:Lcom/aggmoread/sdk/z/a/t/h$d;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    sget-object v0, Lcom/aggmoread/sdk/z/a/t/h$d;->a:Lcom/aggmoread/sdk/z/a/t/h$d;

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/t/h;->d:Lcom/aggmoread/sdk/z/a/t/h$d;

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/t/h;->b:Landroid/content/Context;

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/t/h;->a()V

    return-void
.end method

.method private a(Landroid/content/Context;F)I
    .locals 0

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    mul-float p2, p2, p1

    const/high16 p1, 0x3f000000    # 0.5f

    add-float/2addr p2, p1

    float-to-int p1, p2

    return p1
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/t/h;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/t/h;->c:Landroid/widget/TextView;

    return-object p0
.end method

.method private a()V
    .locals 4

    new-instance v0, Lcom/aggmoread/sdk/z/a/t/g;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/t/h;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/aggmoread/sdk/z/a/t/g;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/t/h;->a:Lcom/aggmoread/sdk/z/a/t/g;

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/t/h;->b:Landroid/content/Context;

    const/high16 v3, 0x40000000    # 2.0f

    invoke-direct {p0, v2, v3}, Lcom/aggmoread/sdk/z/a/t/h;->a(Landroid/content/Context;F)I

    move-result v2

    const/4 v3, -0x1

    invoke-direct {v1, v3, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/t/h;->a:Lcom/aggmoread/sdk/z/a/t/g;

    const v1, -0xffff01

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/a/t/g;->a(I)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/t/h;->a:Lcom/aggmoread/sdk/z/a/t/g;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/a/t/g;->b(I)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/t/h;->a:Lcom/aggmoread/sdk/z/a/t/g;

    invoke-virtual {p0, v0}, Landroid/webkit/WebView;->addView(Landroid/view/View;)V

    :try_start_0
    const-string v0, "searchBoxJavaBridge_"

    invoke-virtual {p0, v0}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    const-string v0, "accessibility"

    invoke-virtual {p0, v0}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    const-string v0, "accessibilityTraversal"

    invoke-virtual {p0, v0}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/t/h;->b()V

    new-instance v0, Lcom/aggmoread/sdk/z/a/t/h$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/aggmoread/sdk/z/a/t/h$b;-><init>(Lcom/aggmoread/sdk/z/a/t/h;Lcom/aggmoread/sdk/z/a/t/h$a;)V

    invoke-virtual {p0, v0}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    new-instance v0, Lcom/aggmoread/sdk/z/a/t/h$c;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/z/a/t/h$c;-><init>(Lcom/aggmoread/sdk/z/a/t/h;)V

    invoke-virtual {p0, v0}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    return-void
.end method

.method static synthetic b(Lcom/aggmoread/sdk/z/a/t/h;)Lcom/aggmoread/sdk/z/a/t/g;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/t/h;->a:Lcom/aggmoread/sdk/z/a/t/g;

    return-object p0
.end method

.method private b()V
    .locals 6

    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v2, 0x0

    const/16 v3, 0x11

    if-lt v1, v3, :cond_0

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setMediaPlaybackRequiresUserGesture(Z)V

    :cond_0
    const/16 v3, 0x1a

    if-lt v1, v3, :cond_1

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setSafeBrowsingEnabled(Z)V

    :cond_1
    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setNeedInitialFocus(Z)V

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    const/16 v4, 0x10

    if-lt v1, v4, :cond_2

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setAllowFileAccessFromFileURLs(Z)V

    :cond_2
    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/t/h;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v4, "jhad_database"

    invoke-virtual {v1, v4, v2}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    :try_start_0
    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setDatabaseEnabled(Z)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setDatabasePath(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setAppCacheEnabled(Z)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setAppCachePath(Ljava/lang/String;)V

    const-wide/32 v4, 0xa00000

    invoke-virtual {v0, v4, v5}, Landroid/webkit/WebSettings;->setAppCacheMaxSize(J)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v4

    invoke-virtual {v4}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    :try_start_2
    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setGeolocationEnabled(Z)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setGeolocationDatabasePath(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_1

    :catch_2
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V

    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x15

    if-lt v1, v4, :cond_3

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v0

    invoke-virtual {v0, p0, v3}, Landroid/webkit/CookieManager;->setAcceptThirdPartyCookies(Landroid/webkit/WebView;Z)V

    goto :goto_2

    :cond_3
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/webkit/CookieManager;->setAcceptCookie(Z)V

    :goto_2
    return-void
.end method

.method static synthetic c(Lcom/aggmoread/sdk/z/a/t/h;)Lcom/aggmoread/sdk/z/a/t/h$d;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/t/h;->d:Lcom/aggmoread/sdk/z/a/t/h$d;

    return-object p0
.end method

.method static synthetic d(Lcom/aggmoread/sdk/z/a/t/h;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/t/h;->b:Landroid/content/Context;

    return-object p0
.end method


# virtual methods
.method public a(Landroid/widget/TextView;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/t/h;->c:Landroid/widget/TextView;

    return-void
.end method

.method public a(Lcom/aggmoread/sdk/z/a/t/h$d;)V
    .locals 0

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/t/h;->d:Lcom/aggmoread/sdk/z/a/t/h$d;

    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/webkit/WebView;->hasFocus()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/webkit/WebView;->requestFocus()Z

    :cond_1
    :goto_0
    invoke-super {p0, p1}, Landroid/webkit/WebView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
