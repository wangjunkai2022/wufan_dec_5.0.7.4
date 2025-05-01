.class public final Lcom/kwad/components/core/e/c/e;
.super Lcom/kwad/components/core/e/c/c;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public KF:Lcom/kwad/components/core/e/c/b;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public KG:Lcom/kwad/components/core/e/c/b$b;

.field private KO:Ljava/lang/Runnable;

.field private KP:Z

.field private cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

.field private cN:Lcom/kwad/components/core/webview/a;

.field private cO:Lcom/kwad/sdk/core/webview/b;

.field private cQ:Lcom/kwad/components/core/webview/jshandler/aw;

.field private cR:Lcom/kwad/sdk/core/webview/d/a/a;

.field private cS:Lcom/kwad/components/core/webview/jshandler/aj$b;

.field private cT:Lcom/kwad/components/core/webview/jshandler/ai$b;

.field private cU:Lcom/kwad/components/core/webview/jshandler/aq$b;

.field private mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

.field private mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/e/c/c;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/core/e/c/e;->KP:Z

    .line 3
    new-instance v0, Lcom/kwad/components/core/e/c/e$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/e/c/e$1;-><init>(Lcom/kwad/components/core/e/c/e;)V

    iput-object v0, p0, Lcom/kwad/components/core/e/c/e;->cR:Lcom/kwad/sdk/core/webview/d/a/a;

    .line 4
    new-instance v0, Lcom/kwad/components/core/e/c/e$4;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/e/c/e$4;-><init>(Lcom/kwad/components/core/e/c/e;)V

    iput-object v0, p0, Lcom/kwad/components/core/e/c/e;->cS:Lcom/kwad/components/core/webview/jshandler/aj$b;

    .line 5
    new-instance v0, Lcom/kwad/components/core/e/c/e$5;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/e/c/e$5;-><init>(Lcom/kwad/components/core/e/c/e;)V

    iput-object v0, p0, Lcom/kwad/components/core/e/c/e;->cT:Lcom/kwad/components/core/webview/jshandler/ai$b;

    .line 6
    new-instance v0, Lcom/kwad/components/core/e/c/e$6;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/e/c/e$6;-><init>(Lcom/kwad/components/core/e/c/e;)V

    iput-object v0, p0, Lcom/kwad/components/core/e/c/e;->cU:Lcom/kwad/components/core/webview/jshandler/aq$b;

    return-void
.end method

.method private a(Lcom/kwad/components/core/webview/a;)V
    .locals 5

    .line 3
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/aa;

    iget-object v1, p0, Lcom/kwad/components/core/e/c/e;->cO:Lcom/kwad/sdk/core/webview/b;

    iget-object v2, p0, Lcom/kwad/components/core/e/c/e;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    iget-object v3, p0, Lcom/kwad/components/core/e/c/e;->cR:Lcom/kwad/sdk/core/webview/d/a/a;

    invoke-direct {v0, v1, v2, v3}, Lcom/kwad/components/core/webview/jshandler/aa;-><init>(Lcom/kwad/sdk/core/webview/b;Lcom/kwad/components/core/e/d/c;Lcom/kwad/sdk/core/webview/d/a/a;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 4
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/x;

    iget-object v1, p0, Lcom/kwad/components/core/e/c/e;->cO:Lcom/kwad/sdk/core/webview/b;

    iget-object v2, p0, Lcom/kwad/components/core/e/c/e;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    iget-object v3, p0, Lcom/kwad/components/core/e/c/e;->cR:Lcom/kwad/sdk/core/webview/d/a/a;

    const/4 v4, 0x1

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/kwad/components/core/webview/jshandler/x;-><init>(Lcom/kwad/sdk/core/webview/b;Lcom/kwad/components/core/e/d/c;Lcom/kwad/sdk/core/webview/d/a/a;I)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 5
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/ad;

    iget-object v1, p0, Lcom/kwad/components/core/e/c/e;->cO:Lcom/kwad/sdk/core/webview/b;

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/jshandler/ad;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 6
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/ag;

    iget-object v1, p0, Lcom/kwad/components/core/e/c/e;->cO:Lcom/kwad/sdk/core/webview/b;

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/jshandler/ag;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    .line 7
    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 8
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/ac;

    iget-object v1, p0, Lcom/kwad/components/core/e/c/e;->cO:Lcom/kwad/sdk/core/webview/b;

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/jshandler/ac;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 9
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/aj;

    iget-object v1, p0, Lcom/kwad/components/core/e/c/e;->cO:Lcom/kwad/sdk/core/webview/b;

    iget-object v2, p0, Lcom/kwad/components/core/e/c/e;->cS:Lcom/kwad/components/core/webview/jshandler/aj$b;

    invoke-direct {v0, v1, v2}, Lcom/kwad/components/core/webview/jshandler/aj;-><init>(Lcom/kwad/sdk/core/webview/b;Lcom/kwad/components/core/webview/jshandler/aj$b;)V

    .line 10
    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 11
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/aq;

    iget-object v1, p0, Lcom/kwad/components/core/e/c/e;->cU:Lcom/kwad/components/core/webview/jshandler/aq$b;

    iget-object v2, p0, Lcom/kwad/components/core/e/c/e;->KG:Lcom/kwad/components/core/e/c/b$b;

    iget-object v2, v2, Lcom/kwad/components/core/e/c/b$b;->url:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lcom/kwad/components/core/webview/jshandler/aq;-><init>(Lcom/kwad/components/core/webview/jshandler/aq$b;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 12
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/aw;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/jshandler/aw;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/e/c/e;->cQ:Lcom/kwad/components/core/webview/jshandler/aw;

    .line 13
    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 14
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/az;

    iget-object v1, p0, Lcom/kwad/components/core/e/c/e;->cO:Lcom/kwad/sdk/core/webview/b;

    iget-object v2, p0, Lcom/kwad/components/core/e/c/e;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    new-instance v3, Lcom/kwad/components/core/e/c/e$3;

    invoke-direct {v3, p0}, Lcom/kwad/components/core/e/c/e$3;-><init>(Lcom/kwad/components/core/e/c/e;)V

    invoke-direct {v0, v1, v2, v3}, Lcom/kwad/components/core/webview/jshandler/az;-><init>(Lcom/kwad/sdk/core/webview/b;Lcom/kwad/components/core/e/d/c;Lcom/kwad/sdk/api/KsAppDownloadListener;)V

    .line 15
    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 16
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/ai;

    iget-object v1, p0, Lcom/kwad/components/core/e/c/e;->cT:Lcom/kwad/components/core/webview/jshandler/ai$b;

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/jshandler/ai;-><init>(Lcom/kwad/components/core/webview/jshandler/ai$b;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 17
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/ak;

    iget-object v1, p0, Lcom/kwad/components/core/e/c/e;->cO:Lcom/kwad/sdk/core/webview/b;

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/jshandler/ak;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 18
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/m;

    iget-object v1, p0, Lcom/kwad/components/core/e/c/e;->cO:Lcom/kwad/sdk/core/webview/b;

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/jshandler/m;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->b(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 19
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/l;

    iget-object v1, p0, Lcom/kwad/components/core/e/c/e;->cO:Lcom/kwad/sdk/core/webview/b;

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/jshandler/l;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->b(Lcom/kwad/sdk/core/webview/c/a;)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/e/c/e;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/core/e/c/e;->KP:Z

    return p0
.end method

.method static synthetic a(Lcom/kwad/components/core/e/c/e;Z)Z
    .locals 0

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/kwad/components/core/e/c/e;->KP:Z

    return p1
.end method

.method private aA()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/e/c/e;->cN:Lcom/kwad/components/core/webview/a;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/a;->destroy()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/kwad/components/core/e/c/e;->cN:Lcom/kwad/components/core/webview/a;

    :cond_0
    return-void
.end method

.method private aF()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "hideWithOutAnimation  convertBridgeClicked: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Lcom/kwad/components/core/e/c/e;->KP:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "DownloadTipsDialogWebCardPresenter"

    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/e/c/e;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/e/c/e;->cQ:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sX()V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/core/e/c/e;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/core/e/c/e;->cQ:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sY()V

    .line 8
    :cond_2
    iget-boolean v0, p0, Lcom/kwad/components/core/e/c/e;->KP:Z

    if-eqz v0, :cond_3

    .line 9
    iget-object v0, p0, Lcom/kwad/components/core/e/c/e;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/adlog/c;->bQ(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 10
    :cond_3
    iget-object v0, p0, Lcom/kwad/components/core/e/c/e;->KF:Lcom/kwad/components/core/e/c/b;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/kwad/components/core/e/c/b;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 11
    iget-object v0, p0, Lcom/kwad/components/core/e/c/e;->KF:Lcom/kwad/components/core/e/c/b;

    iget-boolean v1, p0, Lcom/kwad/components/core/e/c/e;->KP:Z

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/c/b;->aj(Z)V

    :cond_4
    return-void
.end method

.method private ax()V
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/webview/b;

    invoke-direct {v0}, Lcom/kwad/sdk/core/webview/b;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/e/c/e;->cO:Lcom/kwad/sdk/core/webview/b;

    .line 2
    iget-object v1, p0, Lcom/kwad/components/core/e/c/c;->KH:Lcom/kwad/components/core/e/c/d;

    iget-object v1, v1, Lcom/kwad/components/core/e/c/d;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/webview/b;->setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/e/c/e;->cO:Lcom/kwad/sdk/core/webview/b;

    iget-object v1, p0, Lcom/kwad/components/core/e/c/c;->KH:Lcom/kwad/components/core/e/c/d;

    iget-object v1, v1, Lcom/kwad/components/core/e/c/d;->mRootContainer:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    iput-object v1, v0, Lcom/kwad/sdk/core/webview/b;->aEW:Lcom/kwad/sdk/widget/e;

    .line 4
    iput-object v1, v0, Lcom/kwad/sdk/core/webview/b;->Ph:Landroid/view/ViewGroup;

    .line 5
    iget-object v1, p0, Lcom/kwad/components/core/e/c/e;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    iput-object v1, v0, Lcom/kwad/sdk/core/webview/b;->OA:Landroid/webkit/WebView;

    return-void
.end method

.method private az()V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetJavaScriptEnabled",
            "AddJavascriptInterface",
            "JavascriptInterface"
        }
    .end annotation

    const-string v0, "DownloadTipsDialogWebCardPresenter"

    const-string v1, "setupJsBridge"

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/core/e/c/e;->aA()V

    .line 3
    new-instance v0, Lcom/kwad/components/core/webview/a;

    iget-object v1, p0, Lcom/kwad/components/core/e/c/e;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/a;-><init>(Landroid/webkit/WebView;)V

    iput-object v0, p0, Lcom/kwad/components/core/e/c/e;->cN:Lcom/kwad/components/core/webview/a;

    .line 4
    invoke-direct {p0, v0}, Lcom/kwad/components/core/e/c/e;->a(Lcom/kwad/components/core/webview/a;)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/core/e/c/e;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    iget-object v1, p0, Lcom/kwad/components/core/e/c/e;->cN:Lcom/kwad/components/core/webview/a;

    const-string v2, "KwaiAd"

    invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic b(Lcom/kwad/components/core/e/c/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/e/c/e;->aF()V

    return-void
.end method

.method static synthetic c(Lcom/kwad/components/core/e/c/e;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method static synthetic d(Lcom/kwad/components/core/e/c/e;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method static synthetic e(Lcom/kwad/components/core/e/c/e;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method static synthetic f(Lcom/kwad/components/core/e/c/e;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/e/c/e;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method static synthetic g(Lcom/kwad/components/core/e/c/e;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method static synthetic h(Lcom/kwad/components/core/e/c/e;)Lcom/kwad/sdk/core/webview/KsAdWebView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/e/c/e;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    return-object p0
.end method

.method static synthetic i(Lcom/kwad/components/core/e/c/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/e/c/e;->nW()V

    return-void
.end method

.method static synthetic j(Lcom/kwad/components/core/e/c/e;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method static synthetic k(Lcom/kwad/components/core/e/c/e;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method static synthetic l(Lcom/kwad/components/core/e/c/e;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method private nU()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/e/c/e;->az()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/e/c/e;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    iget-object v1, p0, Lcom/kwad/components/core/e/c/e;->KG:Lcom/kwad/components/core/e/c/b$b;

    iget-object v1, v1, Lcom/kwad/components/core/e/c/b$b;->url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/webview/KsAdWebView;->loadUrl(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/e/c/e;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-direct {p0}, Lcom/kwad/components/core/e/c/e;->nV()Ljava/lang/Runnable;

    move-result-object v1

    const-wide/16 v2, 0x5dc

    invoke-virtual {v0, v1, v2, v3}, Landroid/webkit/WebView;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/e/c/e;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/core/e/c/e;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/core/e/c/e;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    return-void
.end method

.method private nV()Ljava/lang/Runnable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/e/c/e;->KO:Ljava/lang/Runnable;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/components/core/e/c/e$2;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/e/c/e$2;-><init>(Lcom/kwad/components/core/e/c/e;)V

    iput-object v0, p0, Lcom/kwad/components/core/e/c/e;->KO:Ljava/lang/Runnable;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/e/c/e;->KO:Ljava/lang/Runnable;

    return-object v0
.end method

.method private nW()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/e/c/e;->KO:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lcom/kwad/components/core/e/c/e;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-virtual {v1, v0}, Landroid/webkit/WebView;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method private release()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/e/c/e;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/e/c/e;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-virtual {v0}, Lcom/kwad/sdk/core/webview/c;->release()V

    .line 3
    invoke-direct {p0}, Lcom/kwad/components/core/e/c/e;->aA()V

    return-void
.end method


# virtual methods
.method public final aj()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/e/c/c;->aj()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/e/c/c;->KH:Lcom/kwad/components/core/e/c/d;

    iget-object v1, v0, Lcom/kwad/components/core/e/c/d;->KF:Lcom/kwad/components/core/e/c/b;

    iput-object v1, p0, Lcom/kwad/components/core/e/c/e;->KF:Lcom/kwad/components/core/e/c/b;

    .line 3
    iget-object v1, v0, Lcom/kwad/components/core/e/c/d;->KG:Lcom/kwad/components/core/e/c/b$b;

    iput-object v1, p0, Lcom/kwad/components/core/e/c/e;->KG:Lcom/kwad/components/core/e/c/b$b;

    .line 4
    iget-object v1, v0, Lcom/kwad/components/core/e/c/d;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iput-object v1, p0, Lcom/kwad/components/core/e/c/e;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 5
    iget-object v0, v0, Lcom/kwad/components/core/e/c/d;->mRootContainer:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    invoke-virtual {v0, p0}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/core/e/c/c;->KH:Lcom/kwad/components/core/e/c/d;

    iget-object v0, v0, Lcom/kwad/components/core/e/c/d;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    iput-object v0, p0, Lcom/kwad/components/core/e/c/e;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    .line 7
    invoke-direct {p0}, Lcom/kwad/components/core/e/c/e;->ax()V

    .line 8
    invoke-direct {p0}, Lcom/kwad/components/core/e/c/e;->nU()V

    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/kwad/components/core/e/c/e;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {p1}, Lcom/kwad/sdk/core/adlog/c;->bQ(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 2
    iget-object p1, p0, Lcom/kwad/components/core/e/c/e;->KF:Lcom/kwad/components/core/e/c/b;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/kwad/components/core/e/c/b;->dismiss()V

    :cond_0
    return-void
.end method

.method public final onCreate()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onCreate()V

    .line 2
    sget v0, Lcom/kwad/sdk/R$id;->ksad_download_tips_web_card_webView:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/core/webview/KsAdWebView;

    iput-object v0, p0, Lcom/kwad/components/core/e/c/e;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    return-void
.end method

.method public final onDestroy()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onDestroy()V

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/core/e/c/e;->release()V

    return-void
.end method

.method public final onUnbind()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onUnbind()V

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/core/e/c/e;->nW()V

    return-void
.end method
