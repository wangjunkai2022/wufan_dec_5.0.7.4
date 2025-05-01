.class Lcom/join/mgps/wrapper/SystemUiHider/d$a;
.super Landroid/widget/TabHost;
.source "TabbedHelpViewFactory.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/wrapper/SystemUiHider/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final b:Landroid/webkit/WebView;


# direct methods
.method public constructor <init>(Landroid/content/Context;[[Ljava/lang/String;)V
    .locals 9

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/TabHost;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance v0, Landroid/webkit/WebView;

    invoke-direct {v0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/wrapper/SystemUiHider/d$a;->b:Landroid/webkit/WebView;

    .line 3
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setNeedInitialFocus(Z)V

    .line 4
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x1

    .line 5
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 6
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 7
    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 8
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x15

    if-lt v3, v4, :cond_0

    .line 9
    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    :cond_0
    const/16 v0, 0x13

    if-lt v3, v0, :cond_1

    :try_start_0
    const-string v0, "android.webkit.WebView"

    .line 10
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v3, "setWebContentsDebuggingEnabled"

    new-array v4, v1, [Ljava/lang/Class;

    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v5, v4, v2

    .line 11
    invoke-virtual {v0, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    const/4 v3, 0x0

    new-array v4, v1, [Ljava/lang/Object;

    .line 13
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    aput-object v5, v4, v2

    invoke-virtual {v0, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    :catch_0
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/wrapper/SystemUiHider/d$a;->b:Landroid/webkit/WebView;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setFocusable(Z)V

    .line 15
    iget-object v0, p0, Lcom/join/mgps/wrapper/SystemUiHider/d$a;->b:Landroid/webkit/WebView;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setDrawingCacheEnabled(Z)V

    .line 16
    iget-object v0, p0, Lcom/join/mgps/wrapper/SystemUiHider/d$a;->b:Landroid/webkit/WebView;

    invoke-virtual {v0, v2}, Landroid/webkit/WebView;->setScrollBarStyle(I)V

    .line 17
    iget-object v0, p0, Lcom/join/mgps/wrapper/SystemUiHider/d$a;->b:Landroid/webkit/WebView;

    new-instance v3, Lcom/join/mgps/wrapper/SystemUiHider/d$a$a;

    invoke-direct {v3, p0}, Lcom/join/mgps/wrapper/SystemUiHider/d$a$a;-><init>(Lcom/join/mgps/wrapper/SystemUiHider/d$a;)V

    invoke-virtual {v0, v3}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 18
    iget-object v0, p0, Lcom/join/mgps/wrapper/SystemUiHider/d$a;->b:Landroid/webkit/WebView;

    new-instance v3, Lcom/join/mgps/wrapper/SystemUiHider/d$a$b;

    invoke-direct {v3, p0}, Lcom/join/mgps/wrapper/SystemUiHider/d$a$b;-><init>(Lcom/join/mgps/wrapper/SystemUiHider/d$a;)V

    invoke-virtual {v0, v3}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 19
    new-instance v0, Lcom/join/mgps/wrapper/SystemUiHider/d$a$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/wrapper/SystemUiHider/d$a$c;-><init>(Lcom/join/mgps/wrapper/SystemUiHider/d$a;)V

    .line 20
    new-instance v3, Lcom/join/mgps/wrapper/SystemUiHider/d$a$d;

    invoke-direct {v3, p0}, Lcom/join/mgps/wrapper/SystemUiHider/d$a$d;-><init>(Lcom/join/mgps/wrapper/SystemUiHider/d$a;)V

    .line 21
    new-instance v4, Landroid/widget/LinearLayout;

    invoke-direct {v4, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 22
    invoke-virtual {v4, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 23
    new-instance v5, Landroid/widget/TabWidget;

    invoke-direct {v5, p1}, Landroid/widget/TabWidget;-><init>(Landroid/content/Context;)V

    const v6, 0x1020013

    .line 24
    invoke-virtual {v5, v6}, Landroid/widget/TabWidget;->setId(I)V

    .line 25
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v7, -0x2

    const/4 v8, -0x1

    invoke-direct {v6, v8, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v4, v5, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 26
    new-instance v5, Landroid/widget/FrameLayout;

    invoke-direct {v5, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const p1, 0x1020011

    .line 27
    invoke-virtual {v5, p1}, Landroid/widget/FrameLayout;->setId(I)V

    .line 28
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {p1, v8, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v4, v5, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 29
    invoke-virtual {p0, v4}, Landroid/widget/TabHost;->addView(Landroid/view/View;)V

    .line 30
    invoke-virtual {p0, v3}, Landroid/widget/TabHost;->setOnTabChangedListener(Landroid/widget/TabHost$OnTabChangeListener;)V

    .line 31
    invoke-virtual {p0}, Landroid/widget/TabHost;->setup()V

    .line 32
    array-length p1, p2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, p1, :cond_2

    aget-object v4, p2, v3

    .line 33
    aget-object v5, v4, v2

    invoke-virtual {p0, v5}, Landroid/widget/TabHost;->newTabSpec(Ljava/lang/String;)Landroid/widget/TabHost$TabSpec;

    move-result-object v5

    aget-object v4, v4, v1

    invoke-virtual {v5, v4}, Landroid/widget/TabHost$TabSpec;->setIndicator(Ljava/lang/CharSequence;)Landroid/widget/TabHost$TabSpec;

    move-result-object v4

    invoke-virtual {v4, v0}, Landroid/widget/TabHost$TabSpec;->setContent(Landroid/widget/TabHost$TabContentFactory;)Landroid/widget/TabHost$TabSpec;

    move-result-object v4

    invoke-virtual {p0, v4}, Landroid/widget/TabHost;->addTab(Landroid/widget/TabHost$TabSpec;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method static synthetic a(Lcom/join/mgps/wrapper/SystemUiHider/d$a;)Landroid/webkit/WebView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/wrapper/SystemUiHider/d$a;->b:Landroid/webkit/WebView;

    return-object p0
.end method
