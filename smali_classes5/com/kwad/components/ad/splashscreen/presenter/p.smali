.class public final Lcom/kwad/components/ad/splashscreen/presenter/p;
.super Lcom/kwad/components/ad/splashscreen/presenter/e;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/ad/splashscreen/e;
.implements Lcom/kwad/components/ad/splashscreen/g;
.implements Lcom/kwad/sdk/core/h/c;


# instance fields
.field private Ea:Lcom/kwad/components/ad/splashscreen/e/b;

.field private Eb:Z

.field private Ec:Z

.field private Ed:J

.field private Ee:Lcom/kwad/components/core/webview/jshandler/aw;

.field private Ef:Z

.field private Eg:Landroid/view/ViewGroup;

.field private final Eh:Ljava/lang/Runnable;

.field private cL:Lcom/kwad/sdk/core/webview/KsAdWebView;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private cN:Lcom/kwad/components/core/webview/a;

.field private cO:Lcom/kwad/sdk/core/webview/b;

.field private eg:Lcom/kwad/sdk/core/g/d;

.field private eh:Landroid/os/Vibrator;

.field private mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

.field private mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

.field private mStartTime:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/splashscreen/presenter/e;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->Ec:Z

    .line 3
    iput-boolean v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->Ef:Z

    .line 4
    new-instance v0, Lcom/kwad/components/ad/splashscreen/presenter/p$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/splashscreen/presenter/p$1;-><init>(Lcom/kwad/components/ad/splashscreen/presenter/p;)V

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->Eh:Ljava/lang/Runnable;

    return-void
.end method

.method private C(Landroid/content/Context;)Landroid/os/Vibrator;
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "vibrator"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Vibrator;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method static synthetic a(Lcom/kwad/components/ad/splashscreen/presenter/p;Landroid/content/Context;)Landroid/os/Vibrator;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/splashscreen/presenter/p;->C(Landroid/content/Context;)Landroid/os/Vibrator;

    move-result-object p0

    return-object p0
.end method

.method static synthetic a(Lcom/kwad/components/ad/splashscreen/presenter/p;Landroid/os/Vibrator;)Landroid/os/Vibrator;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->eh:Landroid/os/Vibrator;

    return-object p1
.end method

.method static synthetic a(Lcom/kwad/components/ad/splashscreen/presenter/p;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 3
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method private a(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetJavaScriptEnabled",
            "AddJavascriptInterface",
            "JavascriptInterface"
        }
    .end annotation

    .line 18
    invoke-direct {p0}, Lcom/kwad/components/ad/splashscreen/presenter/p;->aA()V

    .line 19
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 20
    new-instance v0, Lcom/kwad/components/core/webview/a;

    invoke-direct {v0, p1}, Lcom/kwad/components/core/webview/a;-><init>(Landroid/webkit/WebView;)V

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->cN:Lcom/kwad/components/core/webview/a;

    .line 21
    invoke-direct {p0, v0, p2}, Lcom/kwad/components/ad/splashscreen/presenter/p;->a(Lcom/kwad/components/core/webview/a;Ljava/lang/String;)V

    .line 22
    iget-object p2, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->cN:Lcom/kwad/components/core/webview/a;

    const-string v0, "KwaiAd"

    invoke-virtual {p1, p2, v0}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/splashscreen/presenter/p;D)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2}, Lcom/kwad/components/ad/splashscreen/presenter/p;->h(D)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/splashscreen/presenter/p;ZIILjava/lang/String;)V
    .locals 0

    const/4 p1, 0x0

    .line 5
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/kwad/components/ad/splashscreen/presenter/p;->a(ZIILjava/lang/String;)V

    return-void
.end method

.method private a(Lcom/kwad/components/core/webview/a;Ljava/lang/String;)V
    .locals 3

    .line 23
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/az;

    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->cO:Lcom/kwad/sdk/core/webview/b;

    iget-object v2, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v2, v2, Lcom/kwad/components/ad/splashscreen/h;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    invoke-direct {v0, v1, v2}, Lcom/kwad/components/core/webview/jshandler/az;-><init>(Lcom/kwad/sdk/core/webview/b;Lcom/kwad/components/core/e/d/c;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 24
    invoke-direct {p0}, Lcom/kwad/components/ad/splashscreen/presenter/p;->lA()Lcom/kwad/components/core/webview/jshandler/aa;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 25
    invoke-direct {p0}, Lcom/kwad/components/ad/splashscreen/presenter/p;->lz()Lcom/kwad/components/core/webview/jshandler/x;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 26
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/ad;

    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->cO:Lcom/kwad/sdk/core/webview/b;

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/jshandler/ad;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 27
    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/a/f;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/tachikoma/a/f;-><init>()V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 28
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/aq;

    new-instance v1, Lcom/kwad/components/ad/splashscreen/presenter/p$4;

    invoke-direct {v1, p0, p2}, Lcom/kwad/components/ad/splashscreen/presenter/p$4;-><init>(Lcom/kwad/components/ad/splashscreen/presenter/p;Ljava/lang/String;)V

    invoke-direct {v0, v1, p2}, Lcom/kwad/components/core/webview/jshandler/aq;-><init>(Lcom/kwad/components/core/webview/jshandler/aq$b;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 29
    new-instance p2, Lcom/kwad/components/core/webview/jshandler/ay;

    new-instance v0, Lcom/kwad/components/ad/splashscreen/presenter/p$5;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/splashscreen/presenter/p$5;-><init>(Lcom/kwad/components/ad/splashscreen/presenter/p;)V

    invoke-direct {p2, v0}, Lcom/kwad/components/core/webview/jshandler/ay;-><init>(Lcom/kwad/components/core/webview/jshandler/ay$a;)V

    .line 30
    invoke-virtual {p1, p2}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 31
    new-instance p2, Lcom/kwad/components/core/webview/jshandler/ak;

    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->cO:Lcom/kwad/sdk/core/webview/b;

    invoke-direct {p2, v0}, Lcom/kwad/components/core/webview/jshandler/ak;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    invoke-virtual {p1, p2}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 32
    new-instance p2, Lcom/kwad/components/core/webview/jshandler/m;

    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->cO:Lcom/kwad/sdk/core/webview/b;

    invoke-direct {p2, v0}, Lcom/kwad/components/core/webview/jshandler/m;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    invoke-virtual {p1, p2}, Lcom/kwad/components/core/webview/a;->b(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 33
    new-instance p2, Lcom/kwad/components/core/webview/jshandler/l;

    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->cO:Lcom/kwad/sdk/core/webview/b;

    invoke-direct {p2, v0}, Lcom/kwad/components/core/webview/jshandler/l;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    invoke-virtual {p1, p2}, Lcom/kwad/components/core/webview/a;->b(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 34
    new-instance p2, Lcom/kwad/components/core/webview/jshandler/aw;

    invoke-direct {p2}, Lcom/kwad/components/core/webview/jshandler/aw;-><init>()V

    iput-object p2, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->Ee:Lcom/kwad/components/core/webview/jshandler/aw;

    .line 35
    invoke-virtual {p1, p2}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    return-void
.end method

.method private a(Lcom/kwad/sdk/core/webview/KsAdWebView;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    .line 7
    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    .line 8
    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 9
    invoke-direct {p0}, Lcom/kwad/components/ad/splashscreen/presenter/p;->ax()V

    .line 10
    invoke-direct {p0, p1, p2}, Lcom/kwad/components/ad/splashscreen/presenter/p;->a(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 11
    invoke-virtual {p1}, Lcom/kwad/sdk/core/webview/KsAdWebView;->getClientConfig()Lcom/kwad/sdk/core/webview/a/c$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v1, v1, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 12
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/webview/a/c$a;->ek(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/webview/a/c$a;

    move-result-object v0

    new-instance v1, Lcom/kwad/components/ad/splashscreen/presenter/p$3;

    invoke-direct {v1, p0, p2}, Lcom/kwad/components/ad/splashscreen/presenter/p$3;-><init>(Lcom/kwad/components/ad/splashscreen/presenter/p;Ljava/lang/String;)V

    .line 13
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/webview/a/c$a;->b(Lcom/kwad/sdk/core/webview/KsAdWebView$e;)Lcom/kwad/sdk/core/webview/a/c$a;

    move-result-object v0

    .line 14
    invoke-virtual {p1, v0}, Lcom/kwad/sdk/core/webview/KsAdWebView;->setClientConfig(Lcom/kwad/sdk/core/webview/a/c$a;)V

    .line 15
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {p2, v0}, Lcom/kwad/components/ad/splashscreen/monitor/c;->d(Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 16
    :try_start_0
    invoke-virtual {p1, p2}, Lcom/kwad/sdk/core/webview/KsAdWebView;->loadUrl(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 17
    :catchall_0
    invoke-direct {p0}, Lcom/kwad/components/ad/splashscreen/presenter/p;->lx()V

    return-void
.end method

.method private a(ZIILjava/lang/String;)V
    .locals 9

    .line 36
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    invoke-virtual {v0}, Lcom/kwad/components/ad/splashscreen/h;->kC()V

    .line 37
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const/4 v2, 0x0

    if-ne p2, v1, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-nez v0, :cond_4

    .line 38
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 39
    :try_start_0
    iget-object v5, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    if-eqz v5, :cond_4

    .line 40
    iget-object v5, v5, Lcom/kwad/components/ad/splashscreen/h;->Cr:Lcom/kwad/components/ad/splashscreen/d/a;

    if-eqz v5, :cond_1

    const-string v6, "duration"

    .line 41
    invoke-virtual {v5}, Lcom/kwad/components/ad/splashscreen/d/a;->getCurrentPosition()J

    move-result-wide v7

    invoke-virtual {v4, v6, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    :cond_1
    if-eqz p1, :cond_2

    const/16 v2, 0x99

    goto :goto_1

    :cond_2
    if-eqz v3, :cond_3

    const/16 v2, 0x84

    .line 42
    :cond_3
    :goto_1
    :try_start_1
    new-instance p1, Lcom/kwad/sdk/core/adlog/c/b;

    invoke-direct {p1}, Lcom/kwad/sdk/core/adlog/c/b;-><init>()V

    .line 43
    invoke-virtual {p1, v2}, Lcom/kwad/sdk/core/adlog/c/b;->cK(I)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object p1

    .line 44
    iget-object v5, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v5, v5, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v5, p1, v4}, Lcom/kwad/sdk/core/adlog/c;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/core/adlog/c/b;Lorg/json/JSONObject;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :catch_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    move v2, p3

    .line 45
    :goto_2
    invoke-static {p1}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_4
    move v2, p3

    .line 46
    :goto_3
    new-instance p1, Lcom/kwad/components/core/e/d/a$a;

    iget-object v4, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v4, v4, Lcom/kwad/components/ad/splashscreen/h;->mRootContainer:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    .line 47
    invoke-virtual {v4}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {p1, v4}, Lcom/kwad/components/core/e/d/a$a;-><init>(Landroid/content/Context;)V

    iget-object v4, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v4, v4, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 48
    invoke-virtual {p1, v4}, Lcom/kwad/components/core/e/d/a$a;->ar(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    iget-object v4, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v4, v4, Lcom/kwad/components/ad/splashscreen/h;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    .line 49
    invoke-virtual {p1, v4}, Lcom/kwad/components/core/e/d/a$a;->b(Lcom/kwad/components/core/e/d/c;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    .line 50
    invoke-virtual {p1, v3}, Lcom/kwad/components/core/e/d/a$a;->ao(Z)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    .line 51
    invoke-virtual {p1, p2}, Lcom/kwad/components/core/e/d/a$a;->an(I)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    if-eqz v0, :cond_5

    goto :goto_4

    :cond_5
    move p3, v2

    .line 52
    :goto_4
    invoke-virtual {p1, p3}, Lcom/kwad/components/core/e/d/a$a;->am(I)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    .line 53
    invoke-virtual {p1, p4}, Lcom/kwad/components/core/e/d/a$a;->ah(Ljava/lang/String;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    .line 54
    invoke-virtual {p1, v1}, Lcom/kwad/components/core/e/d/a$a;->al(I)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    .line 55
    invoke-virtual {p1, v0}, Lcom/kwad/components/core/e/d/a$a;->aq(Z)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    new-instance p2, Lcom/kwad/components/ad/splashscreen/presenter/p$2;

    invoke-direct {p2, p0}, Lcom/kwad/components/ad/splashscreen/presenter/p$2;-><init>(Lcom/kwad/components/ad/splashscreen/presenter/p;)V

    .line 56
    invoke-virtual {p1, p2}, Lcom/kwad/components/core/e/d/a$a;->a(Lcom/kwad/components/core/e/d/a$b;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    .line 57
    invoke-static {p1}, Lcom/kwad/components/core/e/d/a;->a(Lcom/kwad/components/core/e/d/a$a;)I

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/splashscreen/presenter/p;Z)Z
    .locals 0

    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->Ef:Z

    return p1
.end method

.method private aA()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->cN:Lcom/kwad/components/core/webview/a;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/a;->destroy()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->cN:Lcom/kwad/components/core/webview/a;

    :cond_0
    return-void
.end method

.method private ax()V
    .locals 3

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/webview/b;

    invoke-direct {v0}, Lcom/kwad/sdk/core/webview/b;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->cO:Lcom/kwad/sdk/core/webview/b;

    .line 2
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/webview/b;->setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->cO:Lcom/kwad/sdk/core/webview/b;

    const/4 v1, 0x0

    iput v1, v0, Lcom/kwad/sdk/core/webview/b;->mScreenOrientation:I

    .line 4
    iget-object v2, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v2, v2, Lcom/kwad/components/ad/splashscreen/h;->mRootContainer:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    iput-object v2, v0, Lcom/kwad/sdk/core/webview/b;->aEW:Lcom/kwad/sdk/widget/e;

    .line 5
    iput-object v2, v0, Lcom/kwad/sdk/core/webview/b;->Ph:Landroid/view/ViewGroup;

    .line 6
    iget-object v2, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    iput-object v2, v0, Lcom/kwad/sdk/core/webview/b;->OA:Landroid/webkit/WebView;

    const/4 v2, 0x0

    .line 7
    iput-object v2, v0, Lcom/kwad/sdk/core/webview/b;->mReportExtData:Lorg/json/JSONObject;

    .line 8
    iput-boolean v1, v0, Lcom/kwad/sdk/core/webview/b;->aEY:Z

    .line 9
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v1}, Lcom/kwad/components/ad/splashscreen/h;->n(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v1

    iput-boolean v1, v0, Lcom/kwad/sdk/core/webview/b;->aEZ:Z

    return-void
.end method

.method static synthetic b(Lcom/kwad/components/ad/splashscreen/presenter/p;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->Ed:J

    return-wide v0
.end method

.method private bu()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->eg:Lcom/kwad/sdk/core/g/d;

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->Ec:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/b;->cV(Lcom/kwad/sdk/core/response/model/AdTemplate;)F

    move-result v0

    .line 3
    new-instance v1, Lcom/kwad/sdk/core/g/d;

    invoke-direct {v1, v0}, Lcom/kwad/sdk/core/g/d;-><init>(F)V

    iput-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->eg:Lcom/kwad/sdk/core/g/d;

    .line 4
    new-instance v0, Lcom/kwad/components/ad/splashscreen/presenter/p$6;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/splashscreen/presenter/p$6;-><init>(Lcom/kwad/components/ad/splashscreen/presenter/p;)V

    invoke-virtual {v1, v0}, Lcom/kwad/sdk/core/g/d;->a(Lcom/kwad/sdk/core/g/b;)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->eg:Lcom/kwad/sdk/core/g/d;

    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/g/d;->bv(Landroid/content/Context;)V

    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic c(Lcom/kwad/components/ad/splashscreen/presenter/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/splashscreen/presenter/p;->lx()V

    return-void
.end method

.method static synthetic d(Lcom/kwad/components/ad/splashscreen/presenter/p;)Ljava/lang/Runnable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->Eh:Ljava/lang/Runnable;

    return-object p0
.end method

.method static synthetic e(Lcom/kwad/components/ad/splashscreen/presenter/p;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->mStartTime:J

    return-wide v0
.end method

.method static synthetic f(Lcom/kwad/components/ad/splashscreen/presenter/p;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->Ef:Z

    return p0
.end method

.method static synthetic g(Lcom/kwad/components/ad/splashscreen/presenter/p;)Lcom/kwad/components/core/webview/jshandler/aw;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->Ee:Lcom/kwad/components/core/webview/jshandler/aw;

    return-object p0
.end method

.method static synthetic h(Lcom/kwad/components/ad/splashscreen/presenter/p;)Lcom/kwad/sdk/core/response/model/AdInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    return-object p0
.end method

.method private h(D)V
    .locals 6

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 3
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v2

    const/16 v3, 0x9d

    const/4 v4, 0x2

    new-instance v5, Lcom/kwad/components/ad/splashscreen/presenter/p$7;

    invoke-direct {v5, p0, p1, p2}, Lcom/kwad/components/ad/splashscreen/presenter/p$7;-><init>(Lcom/kwad/components/ad/splashscreen/presenter/p;D)V

    invoke-virtual/range {v0 .. v5}, Lcom/kwad/components/ad/splashscreen/h;->a(ILandroid/content/Context;IILcom/kwad/components/ad/splashscreen/h$a;)V

    :cond_0
    return-void
.end method

.method static synthetic i(Lcom/kwad/components/ad/splashscreen/presenter/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/splashscreen/presenter/p;->bu()V

    return-void
.end method

.method static synthetic j(Lcom/kwad/components/ad/splashscreen/presenter/p;)Landroid/os/Vibrator;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->eh:Landroid/os/Vibrator;

    return-object p0
.end method

.method static synthetic k(Lcom/kwad/components/ad/splashscreen/presenter/p;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method static synthetic l(Lcom/kwad/components/ad/splashscreen/presenter/p;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method private lA()Lcom/kwad/components/core/webview/jshandler/aa;
    .locals 5

    .line 1
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/aa;

    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->cO:Lcom/kwad/sdk/core/webview/b;

    iget-object v2, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v2, v2, Lcom/kwad/components/ad/splashscreen/h;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    new-instance v3, Lcom/kwad/components/ad/splashscreen/presenter/p$10;

    invoke-direct {v3, p0}, Lcom/kwad/components/ad/splashscreen/presenter/p$10;-><init>(Lcom/kwad/components/ad/splashscreen/presenter/p;)V

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/kwad/components/core/webview/jshandler/aa;-><init>(Lcom/kwad/sdk/core/webview/b;Lcom/kwad/components/core/e/d/c;Lcom/kwad/sdk/core/webview/d/a/a;B)V

    return-object v0
.end method

.method private lx()V
    .locals 2

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->Ec:Z

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->Eg:Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-direct {p0, v0}, Lcom/kwad/components/ad/splashscreen/presenter/p;->y(Lcom/kwad/sdk/core/response/model/AdInfo;)Lcom/kwad/sdk/mvp/Presenter;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 7
    new-instance v1, Lcom/kwad/components/ad/splashscreen/presenter/p$8;

    invoke-direct {v1, p0, v0}, Lcom/kwad/components/ad/splashscreen/presenter/p$8;-><init>(Lcom/kwad/components/ad/splashscreen/presenter/p;Lcom/kwad/sdk/mvp/Presenter;)V

    invoke-static {v1}, Lcom/kwad/sdk/utils/bo;->postOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 8
    :cond_2
    invoke-direct {p0}, Lcom/kwad/components/ad/splashscreen/presenter/p;->ly()V

    return-void
.end method

.method private ly()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/ad/splashscreen/presenter/p;->lw()V

    .line 2
    sget v0, Lcom/kwad/sdk/R$id;->ksad_splash_actionbar_native_stub:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    .line 3
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/d;->dH(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v1

    .line 4
    new-instance v2, Lcom/kwad/components/ad/splashscreen/e/b;

    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getRootView()Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    iget-object v4, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v4, v4, Lcom/kwad/components/ad/splashscreen/h;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    invoke-direct {v2, v3, v0, v1, v4}, Lcom/kwad/components/ad/splashscreen/e/b;-><init>(Landroid/view/ViewGroup;Landroid/view/ViewStub;ZLcom/kwad/components/core/e/d/c;)V

    iput-object v2, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->Ea:Lcom/kwad/components/ad/splashscreen/e/b;

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {v2, v0}, Lcom/kwad/components/ad/splashscreen/e/b;->ai(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->Ea:Lcom/kwad/components/ad/splashscreen/e/b;

    invoke-virtual {v0, p0}, Lcom/kwad/components/ad/splashscreen/e/b;->a(Lcom/kwad/components/ad/splashscreen/e;)V

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->Ea:Lcom/kwad/components/ad/splashscreen/e/b;

    invoke-virtual {v0}, Lcom/kwad/components/ad/splashscreen/e/b;->lx()V

    return-void
.end method

.method private lz()Lcom/kwad/components/core/webview/jshandler/x;
    .locals 4

    .line 1
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/x;

    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->cO:Lcom/kwad/sdk/core/webview/b;

    iget-object v2, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v2, v2, Lcom/kwad/components/ad/splashscreen/h;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    new-instance v3, Lcom/kwad/components/ad/splashscreen/presenter/p$9;

    invoke-direct {v3, p0}, Lcom/kwad/components/ad/splashscreen/presenter/p$9;-><init>(Lcom/kwad/components/ad/splashscreen/presenter/p;)V

    invoke-direct {v0, v1, v2, v3}, Lcom/kwad/components/core/webview/jshandler/x;-><init>(Lcom/kwad/sdk/core/webview/b;Lcom/kwad/components/core/e/d/c;Lcom/kwad/sdk/core/webview/d/a/a;)V

    return-object v0
.end method

.method static synthetic m(Lcom/kwad/components/ad/splashscreen/presenter/p;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method static synthetic n(Lcom/kwad/components/ad/splashscreen/presenter/p;)Lcom/kwad/sdk/core/g/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->eg:Lcom/kwad/sdk/core/g/d;

    return-object p0
.end method

.method private y(Lcom/kwad/sdk/core/response/model/AdInfo;)Lcom/kwad/sdk/mvp/Presenter;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->dg(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 3
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/b;->dG(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 4
    new-instance v1, Lcom/kwad/components/ad/splashscreen/presenter/l;

    invoke-direct {v1}, Lcom/kwad/components/ad/splashscreen/presenter/l;-><init>()V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/b;->dE(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 6
    new-instance v1, Lcom/kwad/components/ad/splashscreen/presenter/m;

    invoke-direct {v1}, Lcom/kwad/components/ad/splashscreen/presenter/m;-><init>()V

    goto :goto_0

    .line 7
    :cond_1
    iget-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/b;->dG(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 8
    new-instance v1, Lcom/kwad/components/ad/splashscreen/presenter/l;

    invoke-direct {v1}, Lcom/kwad/components/ad/splashscreen/presenter/l;-><init>()V

    goto :goto_0

    .line 9
    :cond_2
    iget-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/b;->dJ(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 10
    new-instance v1, Lcom/kwad/components/ad/splashscreen/presenter/n;

    invoke-direct {v1}, Lcom/kwad/components/ad/splashscreen/presenter/n;-><init>()V

    :cond_3
    :goto_0
    return-object v1
.end method


# virtual methods
.method public final W(I)V
    .locals 0

    return-void
.end method

.method public final aM()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->eg:Lcom/kwad/sdk/core/g/d;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/g/d;->bv(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method public final aN()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->eg:Lcom/kwad/sdk/core/g/d;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/g/d;->bw(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method public final aj()V
    .locals 4

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/splashscreen/presenter/e;->aj()V

    .line 2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->mStartTime:J

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v0, v0, Lcom/kwad/components/ad/splashscreen/h;->Ct:Lcom/kwad/sdk/core/h/a;

    invoke-interface {v0, p0}, Lcom/kwad/sdk/core/h/a;->a(Lcom/kwad/sdk/core/h/c;)V

    .line 4
    sget v0, Lcom/kwad/sdk/R$id;->ksad_splash_webview_container:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->Eg:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    .line 5
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 6
    :try_start_0
    new-instance v0, Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/kwad/sdk/core/webview/KsAdWebView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    .line 7
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v0, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 8
    iget-object v2, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-virtual {v2, v0}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 9
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->Eg:Landroid/view/ViewGroup;

    iget-object v2, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    nop

    .line 10
    :goto_0
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 11
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    .line 12
    iput-boolean v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->Eb:Z

    .line 13
    iput-boolean v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->Ec:Z

    .line 14
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/b;->ck(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object v0

    .line 15
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    if-eqz v1, :cond_0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-boolean v1, v1, Lcom/kwad/components/ad/splashscreen/h;->Cy:Z

    if-nez v1, :cond_0

    .line 16
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->Ed:J

    .line 17
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v1}, Lcom/kwad/components/ad/splashscreen/monitor/c;->ah(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 18
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-direct {p0, v1, v0}, Lcom/kwad/components/ad/splashscreen/presenter/p;->a(Lcom/kwad/sdk/core/webview/KsAdWebView;Ljava/lang/String;)V

    .line 19
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->Eh:Ljava/lang/Runnable;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    .line 20
    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/b;->dN(Lcom/kwad/sdk/core/response/model/AdInfo;)J

    move-result-wide v2

    .line 21
    invoke-static {v0, v1, v2, v3}, Lcom/kwad/sdk/utils/bo;->a(Ljava/lang/Runnable;Ljava/lang/Object;J)V

    goto :goto_1

    .line 22
    :cond_0
    invoke-direct {p0}, Lcom/kwad/components/ad/splashscreen/presenter/p;->lx()V

    .line 23
    :goto_1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    invoke-virtual {v0, p0}, Lcom/kwad/components/ad/splashscreen/h;->a(Lcom/kwad/components/ad/splashscreen/g;)V

    return-void
.end method

.method public final h(ZZ)V
    .locals 2

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "isClick: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isActionBar: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SplashWebViewPresenter"

    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    xor-int/2addr p1, v0

    const/16 v0, 0x84

    const/4 v1, 0x0

    .line 5
    invoke-direct {p0, p1, p2, v0, v1}, Lcom/kwad/components/ad/splashscreen/presenter/p;->a(ZIILjava/lang/String;)V

    return-void
.end method

.method public final kB()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->eg:Lcom/kwad/sdk/core/g/d;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/g/d;->bw(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method public final lw()V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->Eb:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->Eb:Z

    .line 3
    new-instance v0, Lcom/kwad/sdk/core/adlog/a$a;

    invoke-direct {v0}, Lcom/kwad/sdk/core/adlog/a$a;-><init>()V

    .line 4
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v1}, Lcom/kwad/components/ad/splashscreen/local/b;->s(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v1

    iput v1, v0, Lcom/kwad/sdk/core/adlog/a$a;->aqh:I

    .line 5
    new-instance v1, Lcom/kwad/sdk/core/adlog/c/b;

    invoke-direct {v1}, Lcom/kwad/sdk/core/adlog/c/b;-><init>()V

    const/16 v2, 0x7b

    .line 6
    invoke-virtual {v1, v2}, Lcom/kwad/sdk/core/adlog/c/b;->cM(I)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v1

    .line 7
    invoke-virtual {v1, v0}, Lcom/kwad/sdk/core/adlog/c/b;->b(Lcom/kwad/sdk/core/adlog/a$a;)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v0

    .line 8
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v1, v1, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v3, 0x0

    invoke-static {v1, v3, v0}, Lcom/kwad/sdk/core/adlog/c;->d(Lcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;Lcom/kwad/sdk/core/adlog/c/b;)V

    .line 9
    invoke-static {}, Lcom/kwad/components/core/webview/tachikoma/d/a;->tC()Lcom/kwad/components/core/webview/tachikoma/d/a;

    move-result-object v0

    .line 10
    invoke-virtual {v0, v2}, Lcom/kwad/components/core/webview/tachikoma/d/a;->aW(I)V

    return-void
.end method

.method public final onUnbind()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onUnbind()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->Ea:Lcom/kwad/components/ad/splashscreen/e/b;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/kwad/components/ad/splashscreen/e/b;->onUnbind()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->eg:Lcom/kwad/sdk/core/g/d;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/g/d;->bw(Landroid/content/Context;)V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->Ee:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sX()V

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p;->Ee:Lcom/kwad/components/core/webview/jshandler/aw;

    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sY()V

    .line 9
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    if-eqz v0, :cond_3

    iget-object v0, v0, Lcom/kwad/components/ad/splashscreen/h;->Ct:Lcom/kwad/sdk/core/h/a;

    if-eqz v0, :cond_3

    .line 10
    invoke-interface {v0, p0}, Lcom/kwad/sdk/core/h/a;->b(Lcom/kwad/sdk/core/h/c;)V

    .line 11
    :cond_3
    invoke-direct {p0}, Lcom/kwad/components/ad/splashscreen/presenter/p;->aA()V

    return-void
.end method
