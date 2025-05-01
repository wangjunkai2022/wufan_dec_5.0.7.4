.class public Lcom/beizi/ad/internal/view/AdWebView;
.super Landroid/webkit/WebView;
.source "AdWebView.java"

# interfaces
.implements Lcom/beizi/ad/internal/view/c;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/ad/internal/view/AdWebView$c;,
        Lcom/beizi/ad/internal/view/AdWebView$b;,
        Lcom/beizi/ad/internal/view/AdWebView$a;
    }
.end annotation


# instance fields
.field private A:Z

.field private B:Z

.field private C:Z

.field private D:Z

.field private E:I

.field private F:J

.field private G:F

.field private H:F

.field private I:Z

.field private J:Ljava/net/HttpURLConnection;

.field private K:Ljava/io/InputStream;

.field private final L:Ljava/lang/Runnable;

.field a:Z

.field public ad:Lcom/beizi/ad/internal/network/ServerResponse;

.field public adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

.field protected b:Ljava/lang/String;

.field c:Z

.field private d:Z

.field private e:Z

.field private f:Lcom/beizi/ad/internal/view/f;

.field private g:I

.field public gestureDetector:Landroid/view/GestureDetector;

.field private h:I

.field private i:Z

.field private j:I

.field private k:I

.field private l:I

.field private m:I

.field public mAdVideoView:Lcom/beizi/ad/internal/video/AdVideoView;

.field private n:I

.field private o:Z

.field private p:Z

.field private q:Landroid/os/Handler;

.field private r:Z

.field private s:I

.field private t:Landroid/app/ProgressDialog;

.field private u:Z

.field private v:Z

.field private w:I

.field private x:I

.field private y:I

.field private z:Z


# direct methods
.method public constructor <init>(Lcom/beizi/ad/internal/view/AdViewImpl;)V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/MutableContextWrapper;

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/MutableContextWrapper;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->d:Z

    const/4 v1, 0x0

    .line 3
    iput-object v1, p0, Lcom/beizi/ad/internal/view/AdWebView;->ad:Lcom/beizi/ad/internal/network/ServerResponse;

    .line 4
    iput-object v1, p0, Lcom/beizi/ad/internal/view/AdWebView;->mAdVideoView:Lcom/beizi/ad/internal/video/AdVideoView;

    .line 5
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->a:Z

    .line 6
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->o:Z

    .line 7
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->p:Z

    .line 8
    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    iput-object v2, p0, Lcom/beizi/ad/internal/view/AdWebView;->q:Landroid/os/Handler;

    .line 9
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->r:Z

    .line 10
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->u:Z

    .line 11
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->v:Z

    const/4 v2, -0x1

    .line 12
    iput v2, p0, Lcom/beizi/ad/internal/view/AdWebView;->y:I

    .line 13
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->z:Z

    .line 14
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->A:Z

    .line 15
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->B:Z

    .line 16
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->C:Z

    .line 17
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->D:Z

    .line 18
    iput v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->E:I

    .line 19
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->c:Z

    .line 20
    iput-object v1, p0, Lcom/beizi/ad/internal/view/AdWebView;->J:Ljava/net/HttpURLConnection;

    .line 21
    iput-object v1, p0, Lcom/beizi/ad/internal/view/AdWebView;->K:Ljava/io/InputStream;

    .line 22
    new-instance v1, Lcom/beizi/ad/internal/view/AdWebView$5;

    invoke-direct {v1, p0}, Lcom/beizi/ad/internal/view/AdWebView$5;-><init>(Lcom/beizi/ad/internal/view/AdWebView;)V

    iput-object v1, p0, Lcom/beizi/ad/internal/view/AdWebView;->L:Ljava/lang/Runnable;

    .line 23
    invoke-virtual {p0, v0}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    .line 24
    iput-object p1, p0, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    .line 25
    sget-object p1, Lcom/beizi/ad/internal/view/f;->a:[Ljava/lang/String;

    sget-object v0, Lcom/beizi/ad/internal/view/f$b;->a:Lcom/beizi/ad/internal/view/f$b;

    .line 26
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget-object p1, p1, v0

    iput-object p1, p0, Lcom/beizi/ad/internal/view/AdWebView;->b:Ljava/lang/String;

    .line 27
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/AdWebView;->a()V

    .line 28
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/AdWebView;->b()V

    const/4 p1, 0x4

    .line 29
    invoke-virtual {p0, p1}, Landroid/webkit/WebView;->setVisibility(I)V

    return-void
.end method

.method private static a(F)F
    .locals 1

    .line 55
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/ad/internal/g;->k()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr p0, v0

    return p0
.end method

.method private static a(FFFF)F
    .locals 0

    sub-float/2addr p0, p2

    sub-float/2addr p1, p3

    mul-float p0, p0, p0

    mul-float p1, p1, p1

    add-float/2addr p0, p1

    float-to-double p0, p0

    .line 53
    invoke-static {p0, p1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p0

    double-to-float p0, p0

    .line 54
    invoke-static {p0}, Lcom/beizi/ad/internal/view/AdWebView;->a(F)F

    move-result p0

    return p0
.end method

.method private a(Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;
    .locals 5

    const/4 v0, 0x0

    .line 56
    :try_start_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-ge v1, v2, :cond_0

    return-object v0

    .line 57
    :cond_0
    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->getRequestHeaders()Ljava/util/Map;

    move-result-object v1

    const-string v2, "*/*"
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v3, "Accept"

    if-eqz v1, :cond_1

    .line 58
    :try_start_1
    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v4

    if-lez v4, :cond_1

    invoke-interface {v1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 59
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    .line 60
    :cond_1
    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object v1

    if-nez v1, :cond_2

    return-object v0

    .line 61
    :cond_2
    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v4, "http"

    .line 62
    invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_3

    return-object v0

    .line 63
    :cond_3
    new-instance v4, Ljava/net/URL;

    invoke-direct {v4, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 64
    invoke-virtual {v4}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v1

    check-cast v1, Ljava/net/HttpURLConnection;

    iput-object v1, p0, Lcom/beizi/ad/internal/view/AdWebView;->J:Ljava/net/HttpURLConnection;

    .line 65
    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->getMethod()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 66
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdWebView;->J:Ljava/net/HttpURLConnection;

    const-string v1, "X-Requested-With"

    const-string v4, ""

    invoke-virtual {p1, v1, v4}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdWebView;->J:Ljava/net/HttpURLConnection;

    invoke-virtual {p1, v3, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdWebView;->J:Ljava/net/HttpURLConnection;

    const-string v1, "User-Agent"

    .line 69
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v3

    iget-object v3, v3, Lcom/beizi/ad/internal/g;->d:Ljava/lang/String;

    .line 70
    invoke-virtual {p1, v1, v3}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdWebView;->J:Ljava/net/HttpURLConnection;

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p1

    iput-object p1, p0, Lcom/beizi/ad/internal/view/AdWebView;->K:Ljava/io/InputStream;

    .line 72
    new-instance p1, Landroid/webkit/WebResourceResponse;

    const-string v1, "UTF-8"

    iget-object v3, p0, Lcom/beizi/ad/internal/view/AdWebView;->K:Ljava/io/InputStream;

    invoke-direct {p1, v2, v1, v3}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 73
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    return-object v0
.end method

.method static synthetic a(Lcom/beizi/ad/internal/view/AdWebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/beizi/ad/internal/view/AdWebView;->a(Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;

    move-result-object p0

    return-object p0
.end method

.method static synthetic a(Lcom/beizi/ad/internal/view/AdWebView;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/beizi/ad/internal/view/AdWebView;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private a(II)V
    .locals 0

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    .line 89
    invoke-static {p0}, Lcom/beizi/ad/internal/utilities/WebviewUtil;->onResume(Landroid/webkit/WebView;)V

    const/4 p1, 0x1

    .line 90
    iput-boolean p1, p0, Lcom/beizi/ad/internal/view/AdWebView;->p:Z

    .line 91
    iget-boolean p1, p0, Lcom/beizi/ad/internal/view/AdWebView;->e:Z

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lcom/beizi/ad/internal/view/AdWebView;->i:Z

    if-eqz p1, :cond_1

    .line 92
    invoke-direct {p0}, Lcom/beizi/ad/internal/view/AdWebView;->i()V

    goto :goto_0

    .line 93
    :cond_0
    invoke-static {p0}, Lcom/beizi/ad/internal/utilities/WebviewUtil;->onPause(Landroid/webkit/WebView;)V

    const/4 p1, 0x0

    .line 94
    iput-boolean p1, p0, Lcom/beizi/ad/internal/view/AdWebView;->p:Z

    .line 95
    invoke-direct {p0}, Lcom/beizi/ad/internal/view/AdWebView;->j()V

    .line 96
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdWebView;->f:Lcom/beizi/ad/internal/view/f;

    if-eqz p1, :cond_2

    .line 97
    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/f;->b()V

    :cond_2
    return-void
.end method

.method private a(Landroid/webkit/WebView;)V
    .locals 5

    .line 74
    invoke-static {}, Lcom/beizi/ad/AdActivity;->a()Ljava/lang/Class;

    move-result-object v0

    .line 75
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {v2}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v2, 0x10000000

    .line 76
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    const-string v2, "ACTIVITY_TYPE"

    const-string v3, "BROWSER"

    .line 77
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 78
    sget-object v2, Lcom/beizi/ad/internal/activity/a;->a:Ljava/util/LinkedList;

    invoke-virtual {v2, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 79
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/AdViewImpl;->getBrowserStyle()Lcom/beizi/ad/internal/view/AdViewImpl$c;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 80
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v2, "bridgeid"

    .line 81
    invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 82
    sget-object v2, Lcom/beizi/ad/internal/view/AdViewImpl$c;->a:Ljava/util/ArrayList;

    new-instance v3, Landroid/util/Pair;

    iget-object v4, p0, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    .line 83
    invoke-virtual {v4}, Lcom/beizi/ad/internal/view/AdViewImpl;->getBrowserStyle()Lcom/beizi/ad/internal/view/AdViewImpl$c;

    move-result-object v4

    invoke-direct {v3, p1, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 84
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    :cond_0
    :try_start_0
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 86
    invoke-direct {p0}, Lcom/beizi/ad/internal/view/AdWebView;->k()V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 87
    :catch_0
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->adactivity_missing:I

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    sget-object p1, Lcom/beizi/ad/internal/activity/a;->a:Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method private a(Landroid/widget/FrameLayout$LayoutParams;)V
    .locals 2

    .line 42
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    instance-of v1, v0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    if-eqz v1, :cond_1

    .line 43
    check-cast v0, Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->getResizeAdToFitContainer()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 44
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v0, 0x11

    const/4 v1, -0x1

    invoke-direct {p1, v1, v1, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 45
    invoke-virtual {p0, p1}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 46
    :cond_0
    invoke-virtual {p0, p1}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {p0, p1}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/beizi/ad/internal/view/AdWebView;Landroid/webkit/WebView;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/beizi/ad/internal/view/AdWebView;->a(Landroid/webkit/WebView;)V

    return-void
.end method

.method private a(Ljava/util/HashMap;)V
    .locals 2

    .line 48
    invoke-virtual {p1}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "MRAID"

    .line 49
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 50
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lcom/beizi/ad/internal/view/AdWebView;->e:Z

    :cond_1
    return-void
.end method

.method static synthetic a(Lcom/beizi/ad/internal/view/AdWebView;)Z
    .locals 0

    .line 4
    iget-boolean p0, p0, Lcom/beizi/ad/internal/view/AdWebView;->e:Z

    return p0
.end method

.method static synthetic a(Lcom/beizi/ad/internal/view/AdWebView;Z)Z
    .locals 0

    .line 5
    iput-boolean p1, p0, Lcom/beizi/ad/internal/view/AdWebView;->i:Z

    return p1
.end method

.method static synthetic b(Lcom/beizi/ad/internal/view/AdWebView;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/beizi/ad/internal/view/AdWebView;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic b(Lcom/beizi/ad/internal/view/AdWebView;)Z
    .locals 0

    .line 2
    iget-boolean p0, p0, Lcom/beizi/ad/internal/view/AdWebView;->v:Z

    return p0
.end method

.method static synthetic c(Lcom/beizi/ad/internal/view/AdWebView;)Lcom/beizi/ad/internal/view/f;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/ad/internal/view/AdWebView;->f:Lcom/beizi/ad/internal/view/f;

    return-object p0
.end method

.method static synthetic c(Lcom/beizi/ad/internal/view/AdWebView;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/beizi/ad/internal/view/AdWebView;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private d(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 3
    invoke-static {p1}, Lcom/beizi/ad/internal/utilities/StringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    const-string v0, "<html>"

    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "<html><body style=\'padding:0;margin:0;\'>"

    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "</body></html>"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method static synthetic d(Lcom/beizi/ad/internal/view/AdWebView;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/beizi/ad/internal/view/AdWebView;->i:Z

    return p0
.end method

.method static synthetic d(Lcom/beizi/ad/internal/view/AdWebView;Ljava/lang/String;)Z
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/beizi/ad/internal/view/AdWebView;->h(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private e(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 2
    invoke-static {p1}, Lcom/beizi/ad/internal/utilities/StringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 3
    invoke-virtual {p0}, Landroid/webkit/WebView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "<html><head><script>"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz v0, :cond_1

    .line 5
    sget-object v0, Lcom/beizi/ad/internal/utilities/StringUtil;->adscopeJSStr:Ljava/lang/String;

    .line 6
    invoke-static {v1, v0}, Lcom/beizi/ad/internal/utilities/StringUtil;->appendLocalStr(Ljava/lang/StringBuilder;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/beizi/ad/internal/utilities/StringUtil;->adscopeStr:Ljava/lang/String;

    .line 7
    invoke-static {v1, v0}, Lcom/beizi/ad/internal/utilities/StringUtil;->appendLocalStr(Ljava/lang/StringBuilder;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 8
    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/StringUtil;->appendRes(Ljava/lang/StringBuilder;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "</script></head>"

    .line 9
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/regex/Matcher;->quoteReplacement(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "<html>"

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    .line 11
    :cond_1
    :goto_0
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    const-string v1, "Error reading SDK\'s raw resources."

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_1
    return-object p1
.end method

.method static synthetic e(Lcom/beizi/ad/internal/view/AdWebView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/beizi/ad/internal/view/AdWebView;->i()V

    return-void
.end method

.method private f(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 2
    invoke-static {p1}, Lcom/beizi/ad/internal/utilities/StringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "<head><meta name=\"viewport\" content=\"width=device-width,initial-scale=1.0,user-scalable=no\"/>"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/regex/Matcher;->quoteReplacement(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "<head>"

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method static synthetic f(Lcom/beizi/ad/internal/view/AdWebView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/beizi/ad/internal/view/AdWebView;->h()V

    return-void
.end method

.method static synthetic g(Lcom/beizi/ad/internal/view/AdWebView;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/beizi/ad/internal/view/AdWebView;->r:Z

    return p0
.end method

.method private g(Ljava/lang/String;)Z
    .locals 3

    .line 2
    new-instance v0, Landroid/content/Intent;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const/high16 v1, 0x10000000

    .line 3
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    nop

    .line 5
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->opening_url_failed:I

    .line 6
    invoke-static {v1, p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 7
    invoke-static {v0, p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    iget-boolean p1, p0, Lcom/beizi/ad/internal/view/AdWebView;->e:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 9
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v1, Lcom/beizi/ad/R$string;->action_cant_be_completed:I

    invoke-static {p1, v1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p1

    .line 10
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :cond_0
    return v0
.end method

.method static synthetic h(Lcom/beizi/ad/internal/view/AdWebView;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/ad/internal/view/AdWebView;->q:Landroid/os/Handler;

    return-object p0
.end method

.method private h()V
    .locals 1

    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->d:Z

    return-void
.end method

.method private h(Ljava/lang/String;)Z
    .locals 2

    const-string v0, "aHR0cDovL2Fib3V0OmJsYW5r"

    .line 2
    invoke-static {v0}, Lcom/beizi/ad/lance/a/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "http"

    .line 3
    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->opening_app_store:I

    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0, p1}, Lcom/beizi/ad/internal/view/AdWebView;->g(Ljava/lang/String;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method static synthetic i(Lcom/beizi/ad/internal/view/AdWebView;)Landroid/app/ProgressDialog;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/ad/internal/view/AdWebView;->t:Landroid/app/ProgressDialog;

    return-object p0
.end method

.method private i()V
    .locals 2

    .line 2
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->p:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->r:Z

    .line 4
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->q:Landroid/os/Handler;

    iget-object v1, p0, Lcom/beizi/ad/internal/view/AdWebView;->L:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 5
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->q:Landroid/os/Handler;

    iget-object v1, p0, Lcom/beizi/ad/internal/view/AdWebView;->L:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private j()V
    .locals 2

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->r:Z

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->q:Landroid/os/Handler;

    iget-object v1, p0, Lcom/beizi/ad/internal/view/AdWebView;->L:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic j(Lcom/beizi/ad/internal/view/AdWebView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/beizi/ad/internal/view/AdWebView;->k()V

    return-void
.end method

.method private k()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->g()V

    :cond_0
    return-void
.end method

.method private setCreativeHeight(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/ad/internal/view/AdWebView;->m:I

    return-void
.end method

.method private setCreativeWidth(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/ad/internal/view/AdWebView;->l:I

    return-void
.end method


# virtual methods
.method public IsVideoWifiOnly()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->D:Z

    return v0
.end method

.method protected a()V
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetJavaScriptEnabled"
        }
    .end annotation

    .line 6
    :try_start_0
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;

    move-result-object v0

    .line 7
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v1

    iget-object v1, v1, Lcom/beizi/ad/internal/g;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 8
    invoke-virtual {p0}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "userAgent"

    invoke-static {v1, v2, v0}, Lcom/beizi/ad/internal/utilities/SPUtils;->put(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    :cond_0
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v1

    iput-object v0, v1, Lcom/beizi/ad/internal/g;->d:Ljava/lang/String;

    .line 10
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 11
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    .line 12
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 13
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setEnableSmoothTransition(Z)V

    .line 14
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setLightTouchEnabled(Z)V

    .line 15
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    sget-object v3, Landroid/webkit/WebSettings$PluginState;->ON:Landroid/webkit/WebSettings$PluginState;

    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setPluginState(Landroid/webkit/WebSettings$PluginState;)V

    .line 16
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setLoadsImagesAutomatically(Z)V

    .line 17
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    .line 18
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V

    .line 19
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 20
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x11

    if-lt v0, v3, :cond_1

    .line 21
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/webkit/WebSettings;->setMediaPlaybackRequiresUserGesture(Z)V

    :cond_1
    const/16 v3, 0x15

    if-lt v0, v3, :cond_2

    .line 22
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    :cond_2
    const/16 v4, 0x13

    if-lt v0, v4, :cond_3

    .line 23
    invoke-static {v2}, Landroid/webkit/WebView;->setWebContentsDebuggingEnabled(Z)V

    :cond_3
    const/16 v5, 0xb

    if-lt v0, v5, :cond_4

    if-ge v0, v4, :cond_4

    const-string v4, "searchBoxJavaBridge_"

    .line 24
    invoke-virtual {p0, v4}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    const-string v4, "accessibility"

    .line 25
    invoke-virtual {p0, v4}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    const-string v4, "accessibilityTraversal"

    .line 26
    invoke-virtual {p0, v4}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    .line 27
    :cond_4
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 28
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroid/webkit/WebSettings;->setAllowContentAccess(Z)V

    const/16 v4, 0x10

    if-lt v0, v4, :cond_5

    .line 29
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroid/webkit/WebSettings;->setAllowFileAccessFromFileURLs(Z)V

    .line 30
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroid/webkit/WebSettings;->setAllowUniversalAccessFromFileURLs(Z)V

    :cond_5
    if-lt v0, v3, :cond_7

    .line 31
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 32
    invoke-virtual {v0, p0, v1}, Landroid/webkit/CookieManager;->setAcceptThirdPartyCookies(Landroid/webkit/WebView;Z)V

    goto :goto_0

    .line 33
    :cond_6
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    const-string v1, "Failed to set Webview to accept 3rd party cookie"

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    :cond_7
    :goto_0
    invoke-virtual {p0, v2}, Landroid/webkit/WebView;->setHorizontalScrollbarOverlay(Z)V

    .line 35
    invoke-virtual {p0, v2}, Landroid/webkit/WebView;->setHorizontalScrollBarEnabled(Z)V

    .line 36
    invoke-virtual {p0, v2}, Landroid/webkit/WebView;->setVerticalScrollbarOverlay(Z)V

    .line 37
    invoke-virtual {p0, v2}, Landroid/webkit/WebView;->setVerticalScrollBarEnabled(Z)V

    .line 38
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->B:Z

    if-eqz v0, :cond_8

    .line 39
    invoke-virtual {p0, v2}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    .line 40
    :cond_8
    invoke-virtual {p0, v2}, Landroid/webkit/WebView;->setScrollBarStyle(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    .line 41
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_1
    return-void
.end method

.method a(IIZLcom/beizi/ad/internal/view/f;ZLcom/beizi/ad/AdActivity$b;)V
    .locals 14

    move-object v0, p0

    move v1, p1

    move/from16 v2, p2

    .line 98
    new-instance v3, Landroid/util/DisplayMetrics;

    invoke-direct {v3}, Landroid/util/DisplayMetrics;-><init>()V

    .line 99
    invoke-virtual {p0}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v4

    const-string v5, "window"

    invoke-virtual {v4, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/WindowManager;

    .line 100
    invoke-interface {v4}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 101
    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    .line 102
    invoke-virtual {p0}, Landroid/webkit/WebView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    invoke-direct {v4, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 103
    iget-object v5, v0, Lcom/beizi/ad/internal/view/AdWebView;->f:Lcom/beizi/ad/internal/view/f;

    iget-boolean v5, v5, Lcom/beizi/ad/internal/view/f;->d:Z

    if-nez v5, :cond_0

    .line 104
    iget v5, v4, Landroid/widget/FrameLayout$LayoutParams;->width:I

    iput v5, v0, Lcom/beizi/ad/internal/view/AdWebView;->g:I

    .line 105
    iget v5, v4, Landroid/widget/FrameLayout$LayoutParams;->height:I

    iput v5, v0, Lcom/beizi/ad/internal/view/AdWebView;->h:I

    :cond_0
    const/4 v5, -0x1

    if-ne v2, v5, :cond_1

    if-ne v1, v5, :cond_1

    .line 106
    iget-object v6, v0, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    if-eqz v6, :cond_1

    const/4 v6, 0x1

    .line 107
    iput-boolean v6, v0, Lcom/beizi/ad/internal/view/AdWebView;->a:Z

    :cond_1
    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    if-eq v2, v5, :cond_2

    int-to-float v2, v2

    .line 108
    iget v8, v3, Landroid/util/DisplayMetrics;->density:F

    mul-float v2, v2, v8

    float-to-double v8, v2

    invoke-static {v8, v9}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v8, v6

    double-to-int v2, v8

    :cond_2
    move v10, v2

    if-eq v1, v5, :cond_3

    int-to-float v1, v1

    .line 109
    iget v2, v3, Landroid/util/DisplayMetrics;->density:F

    mul-float v1, v1, v2

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v1, v6

    double-to-int v1, v1

    :cond_3
    move v9, v1

    .line 110
    iput v10, v4, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 111
    iput v9, v4, Landroid/widget/FrameLayout$LayoutParams;->width:I

    const/16 v1, 0x11

    .line 112
    iput v1, v4, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    const/4 v1, 0x0

    .line 113
    iget-boolean v2, v0, Lcom/beizi/ad/internal/view/AdWebView;->a:Z

    if-eqz v2, :cond_4

    .line 114
    new-instance v1, Lcom/beizi/ad/internal/view/AdWebView$4;

    move-object/from16 v2, p4

    move/from16 v3, p5

    move-object/from16 v5, p6

    invoke-direct {v1, p0, v2, v3, v5}, Lcom/beizi/ad/internal/view/AdWebView$4;-><init>(Lcom/beizi/ad/internal/view/AdWebView;Lcom/beizi/ad/internal/view/f;ZLcom/beizi/ad/AdActivity$b;)V

    goto :goto_0

    :cond_4
    move-object/from16 v2, p4

    :goto_0
    move-object v13, v1

    .line 115
    iget-object v8, v0, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    if-eqz v8, :cond_5

    move/from16 v11, p3

    move-object/from16 v12, p4

    .line 116
    invoke-virtual/range {v8 .. v13}, Lcom/beizi/ad/internal/view/AdViewImpl;->a(IIZLcom/beizi/ad/internal/view/f;Lcom/beizi/ad/internal/view/AdWebView$b;)V

    .line 117
    iget-object v1, v0, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {v1}, Lcom/beizi/ad/internal/view/AdViewImpl;->f()V

    .line 118
    :cond_5
    invoke-virtual {p0, v4}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method protected a(Landroid/app/Activity;ZLcom/beizi/ad/AdActivity$b;)V
    .locals 1

    .line 119
    sget-object v0, Lcom/beizi/ad/AdActivity$b;->c:Lcom/beizi/ad/AdActivity$b;

    if-eq p3, v0, :cond_0

    .line 120
    invoke-static {p1, p3}, Lcom/beizi/ad/AdActivity;->a(Landroid/app/Activity;Lcom/beizi/ad/AdActivity$b;)V

    :cond_0
    if-eqz p2, :cond_1

    .line 121
    invoke-static {p1}, Lcom/beizi/ad/AdActivity;->b(Landroid/app/Activity;)V

    goto :goto_0

    :cond_1
    if-ne p3, v0, :cond_2

    .line 122
    invoke-static {p1}, Lcom/beizi/ad/AdActivity;->a(Landroid/app/Activity;)V

    :cond_2
    :goto_0
    return-void
.end method

.method protected a(Ljava/lang/String;)V
    .locals 3

    .line 51
    new-instance v0, Lcom/beizi/ad/internal/view/AdWebView$1;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, p0, v1, v2, p1}, Lcom/beizi/ad/internal/view/AdWebView$1;-><init>(Lcom/beizi/ad/internal/view/AdWebView;ZZLjava/lang/String;)V

    new-array p1, v1, [Ljava/lang/Void;

    .line 52
    invoke-virtual {v0, p1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method protected b()V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetJavaScriptEnabled"
        }
    .end annotation

    .line 3
    new-instance v0, Lcom/beizi/ad/internal/view/f;

    invoke-direct {v0, p0}, Lcom/beizi/ad/internal/view/f;-><init>(Lcom/beizi/ad/internal/view/AdWebView;)V

    iput-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->f:Lcom/beizi/ad/internal/view/f;

    .line 4
    new-instance v0, Lcom/beizi/ad/internal/view/h;

    invoke-direct {v0, p0}, Lcom/beizi/ad/internal/view/h;-><init>(Lcom/beizi/ad/internal/view/AdWebView;)V

    invoke-virtual {p0, v0}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 5
    new-instance v0, Lcom/beizi/ad/internal/view/AdWebView$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/beizi/ad/internal/view/AdWebView$a;-><init>(Lcom/beizi/ad/internal/view/AdWebView;Lcom/beizi/ad/internal/view/AdWebView$1;)V

    invoke-virtual {p0, v0}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    return-void
.end method

.method b(Ljava/lang/String;)V
    .locals 3

    .line 6
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getOpensNativeBrowser()Z

    move-result v0

    if-nez v0, :cond_2

    .line 7
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->opening_inapp:I

    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0, p1}, Lcom/beizi/ad/internal/view/AdWebView;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 9
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getLoadsInBackground()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 10
    new-instance v0, Lcom/beizi/ad/internal/view/AdWebView$c;

    invoke-virtual {p0}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/beizi/ad/internal/view/AdWebView$c;-><init>(Lcom/beizi/ad/internal/view/AdWebView;Landroid/content/Context;)V

    .line 11
    invoke-static {}, Lcom/beizi/ad/lance/a/i;->a()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;Ljava/util/Map;)V

    const/16 p1, 0x8

    .line 12
    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 13
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 14
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/AdViewImpl;->getShowLoadingIndicator()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 15
    new-instance p1, Landroid/app/ProgressDialog;

    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/AdWebView;->getContextFromMutableContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p1, v1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/beizi/ad/internal/view/AdWebView;->t:Landroid/app/ProgressDialog;

    const/4 v1, 0x1

    .line 16
    invoke-virtual {p1, v1}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 17
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdWebView;->t:Landroid/app/ProgressDialog;

    new-instance v1, Lcom/beizi/ad/internal/view/AdWebView$2;

    invoke-direct {v1, p0, v0}, Lcom/beizi/ad/internal/view/AdWebView$2;-><init>(Lcom/beizi/ad/internal/view/AdWebView;Landroid/webkit/WebView;)V

    invoke-virtual {p1, v1}, Landroid/app/ProgressDialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 18
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdWebView;->t:Landroid/app/ProgressDialog;

    invoke-virtual {p0}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/beizi/ad/R$string;->loading:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 19
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdWebView;->t:Landroid/app/ProgressDialog;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/app/ProgressDialog;->setProgressStyle(I)V

    .line 20
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdWebView;->t:Landroid/app/ProgressDialog;

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->show()V

    goto :goto_0

    .line 21
    :cond_1
    new-instance v0, Landroid/webkit/WebView;

    new-instance v1, Landroid/content/MutableContextWrapper;

    invoke-virtual {p0}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/content/MutableContextWrapper;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, v1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 22
    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/WebviewUtil;->setWebViewSettings(Landroid/webkit/WebView;)V

    .line 23
    invoke-static {}, Lcom/beizi/ad/lance/a/i;->a()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;Ljava/util/Map;)V

    .line 24
    invoke-direct {p0, v0}, Lcom/beizi/ad/internal/view/AdWebView;->a(Landroid/webkit/WebView;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 25
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception initializing the redirect webview: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 26
    :cond_2
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->opening_native:I

    .line 27
    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 28
    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    invoke-direct {p0, p1}, Lcom/beizi/ad/internal/view/AdWebView;->g(Ljava/lang/String;)Z

    .line 30
    invoke-direct {p0}, Lcom/beizi/ad/internal/view/AdWebView;->k()V

    :cond_3
    :goto_0
    return-void
.end method

.method c()V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->f()V

    :cond_0
    return-void
.end method

.method protected c(Ljava/lang/String;)V
    .locals 2

    .line 5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, p1, v0}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    goto :goto_0

    .line 7
    :cond_0
    invoke-static {}, Lcom/beizi/ad/lance/a/i;->a()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;Ljava/util/Map;)V

    :goto_0
    return-void
.end method

.method public closeWebResourceRequestConnection()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->K:Ljava/io/InputStream;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->J:Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_0
    return-void
.end method

.method d()V
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    if-eqz v0, :cond_0

    .line 9
    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->c()V

    :cond_0
    return-void
.end method

.method public destroy()V
    .locals 1

    const/4 v0, 0x4

    .line 1
    invoke-virtual {p0, v0}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 2
    invoke-static {p0}, Lcom/beizi/ad/internal/utilities/ViewUtil;->removeChildFromParent(Landroid/view/View;)V

    .line 3
    invoke-super {p0}, Landroid/webkit/WebView;->destroy()V

    .line 4
    invoke-virtual {p0}, Landroid/webkit/WebView;->removeAllViews()V

    .line 5
    invoke-direct {p0}, Lcom/beizi/ad/internal/view/AdWebView;->j()V

    return-void
.end method

.method e()V
    .locals 4

    .line 12
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    if-eqz v0, :cond_0

    .line 13
    iget v1, p0, Lcom/beizi/ad/internal/view/AdWebView;->g:I

    iget v2, p0, Lcom/beizi/ad/internal/view/AdWebView;->h:I

    iget-object v3, p0, Lcom/beizi/ad/internal/view/AdWebView;->f:Lcom/beizi/ad/internal/view/f;

    invoke-virtual {v0, v1, v2, v3}, Lcom/beizi/ad/internal/view/AdViewImpl;->a(IILcom/beizi/ad/internal/view/f;)V

    :cond_0
    return-void
.end method

.method protected f()V
    .locals 7

    .line 5
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/AdWebView;->getContextFromMutableContext()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Landroid/app/Activity;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 6
    invoke-virtual {p0, v0}, Landroid/webkit/WebView;->getLocationOnScreen([I)V

    const/4 v1, 0x0

    .line 7
    aget v2, v0, v1

    .line 8
    aget v3, v0, v1

    invoke-virtual {p0}, Landroid/webkit/WebView;->getWidth()I

    move-result v4

    add-int/2addr v3, v4

    const/4 v4, 0x1

    .line 9
    aget v5, v0, v4

    .line 10
    aget v0, v0, v4

    invoke-virtual {p0}, Landroid/webkit/WebView;->getHeight()I

    move-result v6

    add-int/2addr v0, v6

    .line 11
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/AdWebView;->getContextFromMutableContext()Landroid/content/Context;

    move-result-object v6

    check-cast v6, Landroid/app/Activity;

    invoke-static {v6}, Lcom/beizi/ad/internal/utilities/ViewUtil;->getScreenSizeAsPixels(Landroid/app/Activity;)[I

    move-result-object v6

    if-lez v3, :cond_1

    .line 12
    aget v3, v6, v1

    if-ge v2, v3, :cond_1

    if-lez v0, :cond_1

    aget v0, v6, v4

    if-ge v5, v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    iput-boolean v1, p0, Lcom/beizi/ad/internal/view/AdWebView;->o:Z

    .line 13
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->f:Lcom/beizi/ad/internal/view/f;

    if-eqz v0, :cond_2

    .line 14
    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/f;->b()V

    .line 15
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->f:Lcom/beizi/ad/internal/view/f;

    invoke-virtual {p0}, Landroid/webkit/WebView;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/webkit/WebView;->getHeight()I

    move-result v3

    invoke-virtual {v0, v2, v5, v1, v3}, Lcom/beizi/ad/internal/view/f;->a(IIII)V

    .line 16
    invoke-virtual {p0}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    .line 17
    iget-object v1, p0, Lcom/beizi/ad/internal/view/AdWebView;->f:Lcom/beizi/ad/internal/view/f;

    invoke-virtual {v1, v0}, Lcom/beizi/ad/internal/view/f;->a(I)V

    :cond_2
    return-void
.end method

.method public failed()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->d:Z

    return v0
.end method

.method public fireMRAIDEnabled()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->e:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->e:Z

    .line 3
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->i:Z

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->f:Lcom/beizi/ad/internal/view/f;

    iget-object v1, p0, Lcom/beizi/ad/internal/view/AdWebView;->b:Ljava/lang/String;

    invoke-virtual {v0, p0, v1}, Lcom/beizi/ad/internal/view/f;->a(Lcom/beizi/ad/internal/view/AdWebView;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Lcom/beizi/ad/internal/view/AdWebView;->i()V

    :cond_1
    return-void
.end method

.method g()Z
    .locals 1

    .line 11
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->o:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->p:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getAdExtras()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->ad:Lcom/beizi/ad/internal/network/ServerResponse;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/beizi/ad/internal/network/ServerResponse;->getExtras()Ljava/util/HashMap;

    move-result-object v0

    return-object v0
.end method

.method public getAutoCloseTime()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->x:I

    return v0
.end method

.method public getContextFromMutableContext()Landroid/content/Context;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Landroid/content/MutableContextWrapper;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/content/MutableContextWrapper;

    invoke-virtual {v0}, Landroid/content/MutableContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public getCreativeHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->m:I

    return v0
.end method

.method public getCreativeLeft()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->j:I

    return v0
.end method

.method public getCreativeTop()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->k:I

    return v0
.end method

.method public getCreativeWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->l:I

    return v0
.end method

.method protected getMRAIDImplementation()Lcom/beizi/ad/internal/view/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->f:Lcom/beizi/ad/internal/view/f;

    return-object v0
.end method

.method public getOrientation()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->s:I

    return v0
.end method

.method public getRealDisplayable()Lcom/beizi/ad/internal/view/c;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->C:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->mAdVideoView:Lcom/beizi/ad/internal/video/AdVideoView;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    return-object p0
.end method

.method public getRefreshInterval()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->n:I

    return v0
.end method

.method public getShowCloseBtnTime()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->w:I

    return v0
.end method

.method getUserInteraction()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->v:Z

    return v0
.end method

.method public getView()Landroid/view/View;
    .locals 0

    return-object p0
.end method

.method public handleClickView(Landroid/view/MotionEvent;JJ)V
    .locals 13

    move-object v10, p0

    .line 1
    iget-object v0, v10, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdDispatcher()Lcom/beizi/ad/internal/b;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, v10, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->isRewardedVideo()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    iget v0, v10, Lcom/beizi/ad/internal/view/AdWebView;->E:I

    const/4 v11, 0x1

    add-int/2addr v0, v11

    iput v0, v10, Lcom/beizi/ad/internal/view/AdWebView;->E:I

    .line 3
    iget-object v0, v10, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdDispatcher()Lcom/beizi/ad/internal/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/beizi/ad/internal/b;->d()V

    .line 4
    iget-object v0, v10, Lcom/beizi/ad/internal/view/AdWebView;->ad:Lcom/beizi/ad/internal/network/ServerResponse;

    iget-object v1, v10, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {v1}, Lcom/beizi/ad/internal/view/AdViewImpl;->getOpensNativeBrowser()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/beizi/ad/internal/network/ServerResponse;->setOpenInNativeBrowser(Z)V

    .line 5
    iget-object v0, v10, Lcom/beizi/ad/internal/view/AdWebView;->ad:Lcom/beizi/ad/internal/network/ServerResponse;

    iget-object v1, v10, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {v1}, Lcom/beizi/ad/internal/view/AdViewImpl;->isCloseMarketDialog()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/beizi/ad/internal/network/ServerResponse;->setCloseMarketDialog(Z)V

    if-nez p1, :cond_0

    .line 6
    iget-object v0, v10, Lcom/beizi/ad/internal/view/AdWebView;->ad:Lcom/beizi/ad/internal/network/ServerResponse;

    invoke-static/range {p2 .. p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    .line 7
    invoke-static/range {p4 .. p5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v7

    iget-boolean v8, v10, Lcom/beizi/ad/internal/view/AdWebView;->c:Z

    iget-object v1, v10, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {v1}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdParameters()Lcom/beizi/ad/internal/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beizi/ad/internal/d;->a()Ljava/lang/String;

    move-result-object v9

    const-string v2, "100"

    const-string v3, "200"

    const-string v4, "105"

    const-string v5, "206"

    move-object v1, p0

    .line 8
    invoke-virtual/range {v0 .. v9}, Lcom/beizi/ad/internal/network/ServerResponse;->handleClick(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    goto/16 :goto_0

    .line 9
    :cond_0
    iget-object v0, v10, Lcom/beizi/ad/internal/view/AdWebView;->ad:Lcom/beizi/ad/internal/network/ServerResponse;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static/range {p2 .. p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v7

    invoke-static/range {p4 .. p5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v8

    iget-boolean v9, v10, Lcom/beizi/ad/internal/view/AdWebView;->c:Z

    iget-object v1, v10, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {v1}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdParameters()Lcom/beizi/ad/internal/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beizi/ad/internal/d;->a()Ljava/lang/String;

    move-result-object v12

    move-object v1, p0

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move v8, v9

    move-object v9, v12

    invoke-virtual/range {v0 .. v9}, Lcom/beizi/ad/internal/network/ServerResponse;->handleClick(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 10
    :goto_0
    iput-boolean v11, v10, Lcom/beizi/ad/internal/view/AdWebView;->c:Z

    :cond_1
    return-void
.end method

.method public handleClickView(Lcom/beizi/ad/c/c;JJI)V
    .locals 10

    move-object v8, p0

    .line 11
    iget-object v0, v8, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdDispatcher()Lcom/beizi/ad/internal/b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, v8, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->isRewardedVideo()Z

    move-result v0

    if-nez v0, :cond_0

    .line 12
    iget v0, v8, Lcom/beizi/ad/internal/view/AdWebView;->E:I

    const/4 v9, 0x1

    add-int/2addr v0, v9

    iput v0, v8, Lcom/beizi/ad/internal/view/AdWebView;->E:I

    .line 13
    iget-object v0, v8, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdDispatcher()Lcom/beizi/ad/internal/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/beizi/ad/internal/b;->d()V

    .line 14
    iget-object v0, v8, Lcom/beizi/ad/internal/view/AdWebView;->ad:Lcom/beizi/ad/internal/network/ServerResponse;

    iget-object v1, v8, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {v1}, Lcom/beizi/ad/internal/view/AdViewImpl;->getOpensNativeBrowser()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/beizi/ad/internal/network/ServerResponse;->setOpenInNativeBrowser(Z)V

    .line 15
    iget-object v0, v8, Lcom/beizi/ad/internal/view/AdWebView;->ad:Lcom/beizi/ad/internal/network/ServerResponse;

    iget-object v1, v8, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {v1}, Lcom/beizi/ad/internal/view/AdViewImpl;->isCloseMarketDialog()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/beizi/ad/internal/network/ServerResponse;->setCloseMarketDialog(Z)V

    .line 16
    iget-object v0, v8, Lcom/beizi/ad/internal/view/AdWebView;->ad:Lcom/beizi/ad/internal/network/ServerResponse;

    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {p4, p5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    iget-boolean v5, v8, Lcom/beizi/ad/internal/view/AdWebView;->c:Z

    iget-object v1, v8, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {v1}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdParameters()Lcom/beizi/ad/internal/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beizi/ad/internal/d;->a()Ljava/lang/String;

    move-result-object v6

    move-object v1, p0

    move-object v2, p1

    move/from16 v7, p6

    invoke-virtual/range {v0 .. v7}, Lcom/beizi/ad/internal/network/ServerResponse;->handleClick(Landroid/view/View;Lcom/beizi/ad/c/c;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;I)V

    .line 17
    iput-boolean v9, v8, Lcom/beizi/ad/internal/view/AdWebView;->c:Z

    :cond_0
    return-void
.end method

.method public isAutoPlay()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->z:Z

    return v0
.end method

.method public isMRAIDUseCustomClose()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->u:Z

    return v0
.end method

.method public isMuted()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->A:Z

    return v0
.end method

.method public isVideoFullScreen()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->B:Z

    return v0
.end method

.method public loadAd(Lcom/beizi/ad/internal/network/ServerResponse;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    iput-object p1, p0, Lcom/beizi/ad/internal/view/AdWebView;->ad:Lcom/beizi/ad/internal/network/ServerResponse;

    .line 2
    invoke-virtual {p1}, Lcom/beizi/ad/internal/network/ServerResponse;->getHeight()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/beizi/ad/internal/view/AdWebView;->setCreativeHeight(I)V

    .line 3
    invoke-virtual {p1}, Lcom/beizi/ad/internal/network/ServerResponse;->getWidth()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/beizi/ad/internal/view/AdWebView;->setCreativeWidth(I)V

    .line 4
    invoke-virtual {p1}, Lcom/beizi/ad/internal/network/ServerResponse;->getLeft()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/beizi/ad/internal/view/AdWebView;->setCreativeLeft(I)V

    .line 5
    invoke-virtual {p1}, Lcom/beizi/ad/internal/network/ServerResponse;->getTop()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/beizi/ad/internal/view/AdWebView;->setCreativeTop(I)V

    .line 6
    invoke-virtual {p1}, Lcom/beizi/ad/internal/network/ServerResponse;->getRefreshInterval()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/beizi/ad/internal/view/AdWebView;->setRefreshInterval(I)V

    .line 7
    invoke-virtual {p1}, Lcom/beizi/ad/internal/network/ServerResponse;->isManualClose()Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_1

    .line 8
    invoke-virtual {p1}, Lcom/beizi/ad/internal/network/ServerResponse;->getMinTimer()I

    move-result v0

    iput v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->w:I

    goto :goto_0

    .line 9
    :cond_1
    iput v1, p0, Lcom/beizi/ad/internal/view/AdWebView;->w:I

    .line 10
    :goto_0
    invoke-virtual {p1}, Lcom/beizi/ad/internal/network/ServerResponse;->isAutoClose()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/beizi/ad/internal/network/ServerResponse;->getMaxTimer()I

    move-result v0

    if-eqz v0, :cond_2

    .line 11
    invoke-virtual {p1}, Lcom/beizi/ad/internal/network/ServerResponse;->getMaxTimer()I

    move-result v0

    iput v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->x:I

    goto :goto_1

    .line 12
    :cond_2
    iput v1, p0, Lcom/beizi/ad/internal/view/AdWebView;->x:I

    .line 13
    :goto_1
    iget v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->w:I

    const/4 v2, 0x0

    if-ne v0, v1, :cond_3

    iget v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->x:I

    if-ne v0, v1, :cond_3

    invoke-virtual {p1}, Lcom/beizi/ad/internal/network/ServerResponse;->getAdType()Lcom/beizi/ad/c/e$a;

    move-result-object v0

    sget-object v3, Lcom/beizi/ad/c/e$a;->b:Lcom/beizi/ad/c/e$a;

    if-eq v0, v3, :cond_3

    .line 14
    iput v2, p0, Lcom/beizi/ad/internal/view/AdWebView;->w:I

    goto :goto_2

    .line 15
    :cond_3
    iget v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->w:I

    if-eq v0, v1, :cond_4

    iget v3, p0, Lcom/beizi/ad/internal/view/AdWebView;->x:I

    if-eq v3, v1, :cond_4

    if-le v0, v3, :cond_4

    .line 16
    iput v3, p0, Lcom/beizi/ad/internal/view/AdWebView;->w:I

    .line 17
    :cond_4
    :goto_2
    invoke-virtual {p1}, Lcom/beizi/ad/internal/network/ServerResponse;->isAutoPlay()Z

    move-result v0

    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->z:Z

    .line 18
    invoke-virtual {p1}, Lcom/beizi/ad/internal/network/ServerResponse;->isMuted()Z

    move-result v0

    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->A:Z

    .line 19
    invoke-virtual {p1}, Lcom/beizi/ad/internal/network/ServerResponse;->isFullScreen()Z

    move-result v0

    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->B:Z

    .line 20
    invoke-virtual {p1}, Lcom/beizi/ad/internal/network/ServerResponse;->getAdOrientation()I

    move-result v0

    iput v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->s:I

    .line 21
    invoke-virtual {p1}, Lcom/beizi/ad/internal/network/ServerResponse;->isWifiOnly()Z

    move-result p1

    iput-boolean p1, p0, Lcom/beizi/ad/internal/view/AdWebView;->D:Z

    .line 22
    iput v1, p0, Lcom/beizi/ad/internal/view/AdWebView;->y:I

    .line 23
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object p1

    .line 24
    invoke-virtual {p1}, Lcom/beizi/ad/internal/g;->j()F

    move-result p1

    const/high16 v0, 0x42c80000    # 100.0f

    mul-float p1, p1, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p1, v0

    float-to-int p1, p1

    invoke-virtual {p0, p1}, Landroid/webkit/WebView;->setInitialScale(I)V

    .line 25
    invoke-virtual {p0, v2}, Lcom/beizi/ad/internal/view/AdWebView;->loadAdAt(I)Z

    return-void
.end method

.method public loadAdAt(I)Z
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->ad:Lcom/beizi/ad/internal/network/ServerResponse;

    const/4 v1, 0x0

    if-eqz v0, :cond_c

    iget v2, p0, Lcom/beizi/ad/internal/view/AdWebView;->y:I

    if-ne v2, p1, :cond_0

    goto/16 :goto_4

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/beizi/ad/internal/network/ServerResponse;->getCreatives()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_b

    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->ad:Lcom/beizi/ad/internal/network/ServerResponse;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/network/ServerResponse;->getCreatives()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gt v0, p1, :cond_1

    goto/16 :goto_3

    .line 3
    :cond_1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->ad:Lcom/beizi/ad/internal/network/ServerResponse;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/network/ServerResponse;->getCreatives()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Pair;

    .line 4
    iget-object v2, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lcom/beizi/ad/internal/utilities/StringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 5
    invoke-direct {p0}, Lcom/beizi/ad/internal/view/AdWebView;->h()V

    return v1

    .line 6
    :cond_2
    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    sget-object v3, Lcom/beizi/ad/internal/i;->a:Lcom/beizi/ad/internal/i;

    const/4 v4, 0x1

    if-ne v2, v3, :cond_4

    .line 7
    iget-object v1, p0, Lcom/beizi/ad/internal/view/AdWebView;->mAdVideoView:Lcom/beizi/ad/internal/video/AdVideoView;

    if-nez v1, :cond_3

    .line 8
    new-instance v1, Lcom/beizi/ad/internal/video/AdVideoView;

    invoke-direct {v1, p0}, Lcom/beizi/ad/internal/video/AdVideoView;-><init>(Lcom/beizi/ad/internal/view/AdWebView;)V

    iput-object v1, p0, Lcom/beizi/ad/internal/view/AdWebView;->mAdVideoView:Lcom/beizi/ad/internal/video/AdVideoView;

    .line 9
    :cond_3
    iget-object v1, p0, Lcom/beizi/ad/internal/view/AdWebView;->mAdVideoView:Lcom/beizi/ad/internal/video/AdVideoView;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, p0, v0}, Lcom/beizi/ad/internal/video/AdVideoView;->transferAd(Lcom/beizi/ad/internal/view/AdWebView;Ljava/lang/String;)V

    .line 10
    iput-boolean v4, p0, Lcom/beizi/ad/internal/view/AdWebView;->C:Z

    const-string v0, "aHR0cDovL2Fib3V0OmJsYW5r"

    .line 11
    invoke-static {v0}, Lcom/beizi/ad/lance/a/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 12
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_a

    .line 13
    invoke-static {}, Lcom/beizi/ad/lance/a/i;->a()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;Ljava/util/Map;)V

    goto/16 :goto_2

    .line 14
    :cond_4
    sget-object v2, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    sget v3, Lcom/beizi/ad/R$string;->webview_loading:I

    iget-object v5, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    invoke-static {v3, v5}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/beizi/ad/internal/utilities/HaoboLog;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    iget-object v2, p0, Lcom/beizi/ad/internal/view/AdWebView;->ad:Lcom/beizi/ad/internal/network/ServerResponse;

    invoke-virtual {v2}, Lcom/beizi/ad/internal/network/ServerResponse;->getExtras()Ljava/util/HashMap;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/beizi/ad/internal/view/AdWebView;->a(Ljava/util/HashMap;)V

    .line 16
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/beizi/ad/internal/view/AdWebView;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 17
    invoke-direct {p0, v0}, Lcom/beizi/ad/internal/view/AdWebView;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 18
    invoke-direct {p0, v0}, Lcom/beizi/ad/internal/view/AdWebView;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 19
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/ad/internal/g;->h()F

    move-result v0

    .line 20
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v2

    invoke-virtual {v2}, Lcom/beizi/ad/internal/g;->i()F

    move-result v2

    .line 21
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v3

    invoke-virtual {v3}, Lcom/beizi/ad/internal/g;->j()F

    move-result v3

    .line 22
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/AdWebView;->getCreativeWidth()I

    move-result v5

    const/high16 v6, 0x3f000000    # 0.5f

    const/4 v8, -0x1

    if-ne v5, v8, :cond_5

    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/AdWebView;->getCreativeHeight()I

    move-result v5

    if-ne v5, v8, :cond_5

    const/4 v3, -0x1

    const/4 v5, -0x1

    goto :goto_0

    .line 23
    :cond_5
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/AdWebView;->getCreativeHeight()I

    move-result v5

    int-to-float v5, v5

    mul-float v5, v5, v3

    add-float/2addr v5, v6

    float-to-int v5, v5

    .line 24
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/AdWebView;->getCreativeWidth()I

    move-result v9

    int-to-float v9, v9

    mul-float v9, v9, v3

    add-float/2addr v9, v6

    float-to-int v3, v9

    .line 25
    :goto_0
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/AdWebView;->getCreativeLeft()I

    move-result v9

    const/16 v10, 0x11

    if-nez v9, :cond_8

    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/AdWebView;->getCreativeTop()I

    move-result v9

    if-nez v9, :cond_8

    .line 26
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v0, v3, v5, v10}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 27
    iget-object v2, p0, Lcom/beizi/ad/internal/view/AdWebView;->ad:Lcom/beizi/ad/internal/network/ServerResponse;

    iget-object v2, v2, Lcom/beizi/ad/internal/network/ServerResponse;->mMediaType:Lcom/beizi/ad/internal/j;

    sget-object v3, Lcom/beizi/ad/internal/j;->a:Lcom/beizi/ad/internal/j;

    if-ne v2, v3, :cond_6

    .line 28
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v0, v8, v8, v10}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 29
    invoke-virtual {p0, v0}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_1

    .line 30
    :cond_6
    sget-object v3, Lcom/beizi/ad/internal/j;->b:Lcom/beizi/ad/internal/j;

    if-ne v2, v3, :cond_7

    .line 31
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v2, -0x2

    invoke-direct {v0, v2, v8, v10}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 32
    invoke-direct {p0, v0}, Lcom/beizi/ad/internal/view/AdWebView;->a(Landroid/widget/FrameLayout$LayoutParams;)V

    goto :goto_1

    .line 33
    :cond_7
    invoke-direct {p0, v0}, Lcom/beizi/ad/internal/view/AdWebView;->a(Landroid/widget/FrameLayout$LayoutParams;)V

    goto :goto_1

    .line 34
    :cond_8
    new-instance v9, Landroid/widget/FrameLayout$LayoutParams;

    const v11, 0x800033

    invoke-direct {v9, v3, v5, v11}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 35
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/AdWebView;->getCreativeTop()I

    move-result v3

    int-to-float v3, v3

    mul-float v3, v3, v2

    add-float/2addr v3, v6

    float-to-int v2, v3

    .line 36
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/AdWebView;->getCreativeLeft()I

    move-result v3

    int-to-float v3, v3

    mul-float v3, v3, v0

    add-float/2addr v3, v6

    float-to-int v0, v3

    .line 37
    invoke-virtual {v9, v0, v2, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;->setMargins(IIII)V

    .line 38
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->ad:Lcom/beizi/ad/internal/network/ServerResponse;

    iget-object v0, v0, Lcom/beizi/ad/internal/network/ServerResponse;->mMediaType:Lcom/beizi/ad/internal/j;

    sget-object v2, Lcom/beizi/ad/internal/j;->a:Lcom/beizi/ad/internal/j;

    if-ne v0, v2, :cond_9

    .line 39
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v0, v8, v8, v10}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 40
    invoke-virtual {p0, v0}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_1

    .line 41
    :cond_9
    invoke-direct {p0, v9}, Lcom/beizi/ad/internal/view/AdWebView;->a(Landroid/widget/FrameLayout$LayoutParams;)V

    :goto_1
    const/4 v6, 0x0

    const/4 v10, 0x0

    const-string v8, "text/html"

    const-string v9, "UTF-8"

    move-object v5, p0

    .line 42
    invoke-virtual/range {v5 .. v10}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    iput-boolean v1, p0, Lcom/beizi/ad/internal/view/AdWebView;->C:Z

    .line 44
    :cond_a
    :goto_2
    iput p1, p0, Lcom/beizi/ad/internal/view/AdWebView;->y:I

    return v4

    .line 45
    :cond_b
    :goto_3
    invoke-direct {p0}, Lcom/beizi/ad/internal/view/AdWebView;->h()V

    :cond_c
    :goto_4
    return v1
.end method

.method public loadAdBy(I)Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->y:I

    add-int/2addr v0, p1

    invoke-virtual {p0, v0}, Lcom/beizi/ad/internal/view/AdWebView;->loadAdAt(I)Z

    move-result p1

    return p1
.end method

.method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/webkit/WebView;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/AdWebView;->f()V

    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/AdWebView;->destroy()V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/webkit/WebView;->onDetachedFromWindow()V

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->t:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->t:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    :cond_0
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/webkit/WebView;->onDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/webkit/WebView;->onMeasure(II)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 9

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->v:Z

    .line 2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    if-eqz v1, :cond_2

    if-eq v1, v0, :cond_1

    const/4 v0, 0x2

    if-eq v1, v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->I:Z

    if-eqz v0, :cond_3

    iget v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->G:F

    iget v1, p0, Lcom/beizi/ad/internal/view/AdWebView;->H:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lcom/beizi/ad/internal/view/AdWebView;->a(FFFF)F

    move-result v0

    const/high16 v1, 0x41700000    # 15.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_3

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->I:Z

    goto :goto_0

    .line 5
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 6
    iget-wide v3, p0, Lcom/beizi/ad/internal/view/AdWebView;->F:J

    sub-long v0, v5, v3

    const-wide/16 v7, 0x3e8

    cmp-long v2, v0, v7

    if-gez v2, :cond_3

    .line 7
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->I:Z

    if-eqz v0, :cond_3

    move-object v1, p0

    move-object v2, p1

    .line 8
    invoke-virtual/range {v1 .. v6}, Lcom/beizi/ad/internal/view/AdWebView;->handleClickView(Landroid/view/MotionEvent;JJ)V

    goto :goto_0

    .line 9
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/beizi/ad/internal/view/AdWebView;->F:J

    .line 10
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iput v1, p0, Lcom/beizi/ad/internal/view/AdWebView;->G:F

    .line 11
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iput v1, p0, Lcom/beizi/ad/internal/view/AdWebView;->H:F

    .line 12
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->I:Z

    .line 13
    :cond_3
    :goto_0
    invoke-super {p0, p1}, Landroid/webkit/WebView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public onVisibilityChanged(Landroid/view/View;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/webkit/WebView;->onVisibilityChanged(Landroid/view/View;I)V

    .line 2
    invoke-virtual {p0}, Landroid/webkit/WebView;->getWindowVisibility()I

    move-result p1

    invoke-direct {p0, p1, p2}, Lcom/beizi/ad/internal/view/AdWebView;->a(II)V

    return-void
.end method

.method protected onWindowVisibilityChanged(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/webkit/WebView;->onWindowVisibilityChanged(I)V

    .line 2
    invoke-virtual {p0}, Landroid/webkit/WebView;->getVisibility()I

    move-result v0

    invoke-direct {p0, p1, v0}, Lcom/beizi/ad/internal/view/AdWebView;->a(II)V

    return-void
.end method

.method public resize(IIIILcom/beizi/ad/internal/view/f$a;Z)V
    .locals 12

    move-object v0, p0

    .line 1
    new-instance v1, Landroid/util/DisplayMetrics;

    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    .line 2
    invoke-virtual {p0}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "window"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/WindowManager;

    .line 3
    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 4
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 5
    invoke-virtual {p0}, Landroid/webkit/WebView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 6
    iget-object v11, v0, Lcom/beizi/ad/internal/view/AdWebView;->f:Lcom/beizi/ad/internal/view/f;

    iget-boolean v3, v11, Lcom/beizi/ad/internal/view/f;->d:Z

    if-nez v3, :cond_0

    .line 7
    iget v3, v2, Landroid/widget/FrameLayout$LayoutParams;->width:I

    iput v3, v0, Lcom/beizi/ad/internal/view/AdWebView;->g:I

    .line 8
    iget v3, v2, Landroid/widget/FrameLayout$LayoutParams;->height:I

    iput v3, v0, Lcom/beizi/ad/internal/view/AdWebView;->h:I

    :cond_0
    move v3, p2

    int-to-float v3, v3

    .line 9
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    mul-float v3, v3, v1

    float-to-double v3, v3

    const-wide/high16 v5, 0x3fe0000000000000L    # 0.5

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v3, v5

    double-to-int v3, v3

    move v4, p1

    int-to-float v4, v4

    mul-float v4, v4, v1

    float-to-double v7, v4

    .line 10
    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v7, v5

    double-to-int v5, v7

    .line 11
    iput v3, v2, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 12
    iput v5, v2, Landroid/widget/FrameLayout$LayoutParams;->width:I

    const/16 v1, 0x11

    .line 13
    iput v1, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 14
    iget-object v4, v0, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    if-eqz v4, :cond_1

    move v6, v3

    move v7, p3

    move/from16 v8, p4

    move-object/from16 v9, p5

    move/from16 v10, p6

    .line 15
    invoke-virtual/range {v4 .. v11}, Lcom/beizi/ad/internal/view/AdViewImpl;->a(IIIILcom/beizi/ad/internal/view/f$a;ZLcom/beizi/ad/internal/view/f;)V

    .line 16
    :cond_1
    iget-object v1, v0, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    if-eqz v1, :cond_2

    .line 17
    invoke-virtual {v1}, Lcom/beizi/ad/internal/view/AdViewImpl;->f()V

    .line 18
    :cond_2
    invoke-virtual {p0, v2}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public scrollTo(II)V
    .locals 0

    const/4 p1, 0x0

    .line 1
    invoke-super {p0, p1, p1}, Landroid/webkit/WebView;->scrollTo(II)V

    return-void
.end method

.method public setCreativeLeft(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/ad/internal/view/AdWebView;->j:I

    return-void
.end method

.method public setCreativeTop(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/ad/internal/view/AdWebView;->k:I

    return-void
.end method

.method public setMRAIDUseCustomClose(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/beizi/ad/internal/view/AdWebView;->u:Z

    return-void
.end method

.method public setRefreshInterval(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/ad/internal/view/AdWebView;->n:I

    return-void
.end method

.method public shouldDisplayButton()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->ad:Lcom/beizi/ad/internal/network/ServerResponse;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/network/ServerResponse;->getAdType()Lcom/beizi/ad/c/e$a;

    move-result-object v0

    sget-object v1, Lcom/beizi/ad/c/e$a;->e:Lcom/beizi/ad/c/e$a;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    return v2

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->ad:Lcom/beizi/ad/internal/network/ServerResponse;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/network/ServerResponse;->getAdType()Lcom/beizi/ad/c/e$a;

    move-result-object v0

    sget-object v1, Lcom/beizi/ad/c/e$a;->b:Lcom/beizi/ad/c/e$a;

    const/4 v3, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->ad:Lcom/beizi/ad/internal/network/ServerResponse;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/network/ServerResponse;->getCreatives()Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/beizi/ad/internal/view/AdWebView;->y:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Pair;

    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    sget-object v1, Lcom/beizi/ad/internal/i;->a:Lcom/beizi/ad/internal/i;

    if-ne v0, v1, :cond_2

    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->y:I

    if-nez v0, :cond_2

    :goto_0
    const/4 v2, 0x1

    :cond_2
    return v2
.end method

.method public visible()V
    .locals 7

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 2
    iget-object v1, p0, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {v1, p0}, Lcom/beizi/ad/internal/view/AdViewImpl;->showAdLogo(Landroid/view/View;)V

    .line 3
    iget-object v1, p0, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {v1, p0}, Lcom/beizi/ad/internal/view/AdViewImpl;->addDownloadTextView(Landroid/view/View;)V

    .line 4
    sget-object v1, Lcom/beizi/ad/internal/j;->b:Lcom/beizi/ad/internal/j;

    iget-object v2, p0, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-interface {v2}, Lcom/beizi/ad/internal/a;->getMediaType()Lcom/beizi/ad/internal/j;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 5
    iget-object v2, p0, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {v2, v2}, Lcom/beizi/ad/internal/view/AdViewImpl;->showBannerCloseBtn(Landroid/view/View;)V

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/AdWebView;->shouldDisplayButton()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 7
    iget-object v2, p0, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    if-eqz v2, :cond_3

    .line 8
    invoke-interface {v2}, Lcom/beizi/ad/internal/a;->getMediaType()Lcom/beizi/ad/internal/j;

    move-result-object v2

    sget-object v3, Lcom/beizi/ad/internal/j;->c:Lcom/beizi/ad/internal/j;

    if-ne v2, v3, :cond_2

    .line 9
    iget-object v2, p0, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/AdWebView;->getShowCloseBtnTime()I

    move-result v3

    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/AdWebView;->getAutoCloseTime()I

    move-result v4

    iget-object v5, p0, Lcom/beizi/ad/internal/view/AdWebView;->ad:Lcom/beizi/ad/internal/network/ServerResponse;

    invoke-virtual {v5}, Lcom/beizi/ad/internal/network/ServerResponse;->getAdType()Lcom/beizi/ad/c/e$a;

    move-result-object v5

    sget-object v6, Lcom/beizi/ad/c/e$a;->b:Lcom/beizi/ad/c/e$a;

    if-ne v5, v6, :cond_1

    const/4 v0, 0x1

    :cond_1
    invoke-virtual {v2, v3, v4, p0, v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->addInterstitialCloseButton(IILandroid/view/View;Z)V

    goto :goto_0

    .line 10
    :cond_2
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {v0, p0}, Lcom/beizi/ad/internal/view/AdViewImpl;->isLoadToShow(Lcom/beizi/ad/internal/view/AdWebView;)V

    .line 11
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdDispatcher()Lcom/beizi/ad/internal/b;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 12
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->adViewImpl:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-interface {v0}, Lcom/beizi/ad/internal/a;->getMediaType()Lcom/beizi/ad/internal/j;

    move-result-object v0

    if-ne v0, v1, :cond_4

    .line 13
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView;->q:Landroid/os/Handler;

    if-eqz v0, :cond_4

    .line 14
    new-instance v1, Lcom/beizi/ad/internal/view/AdWebView$3;

    invoke-direct {v1, p0}, Lcom/beizi/ad/internal/view/AdWebView$3;-><init>(Lcom/beizi/ad/internal/view/AdWebView;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_4
    return-void
.end method
