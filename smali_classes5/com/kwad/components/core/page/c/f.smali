.class public final Lcom/kwad/components/core/page/c/f;
.super Lcom/kwad/components/core/page/c/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/page/c/f$a;
    }
.end annotation


# instance fields
.field private OA:Landroid/webkit/WebView;

.field private Pg:I

.field private Ph:Landroid/view/ViewGroup;

.field private final Pi:Lcom/kwad/components/core/page/c/f$a;

.field private cN:Lcom/kwad/components/core/webview/a;

.field private cO:Lcom/kwad/sdk/core/webview/b;

.field private mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

.field private final mIsRewardLandPage:Z


# direct methods
.method public constructor <init>(Lcom/kwad/components/core/page/c/f$a;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/page/c/c;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/kwad/components/core/page/c/f;->Pg:I

    .line 3
    iput-object p1, p0, Lcom/kwad/components/core/page/c/f;->Pi:Lcom/kwad/components/core/page/c/f$a;

    .line 4
    iput-boolean p2, p0, Lcom/kwad/components/core/page/c/f;->mIsRewardLandPage:Z

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/page/c/f;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/components/core/page/c/f;->Pg:I

    return p1
.end method

.method static synthetic a(Lcom/kwad/components/core/page/c/f;)Lcom/kwad/components/core/page/c/f$a;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/kwad/components/core/page/c/f;->Pi:Lcom/kwad/components/core/page/c/f$a;

    return-object p0
.end method

.method private a(Lcom/kwad/components/core/webview/a;)V
    .locals 8

    const-string v0, "LandPageWebViewPresenter"

    const-string v1, "registerWebCardHandler"

    .line 3
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    new-instance v4, Lcom/kwad/components/core/e/d/c;

    iget-object v0, p0, Lcom/kwad/components/core/page/c/c;->Pe:Lcom/kwad/components/core/page/c/d;

    iget-object v0, v0, Lcom/kwad/components/core/page/c/d;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-direct {v4, v0}, Lcom/kwad/components/core/e/d/c;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 5
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/ad;

    iget-object v1, p0, Lcom/kwad/components/core/page/c/f;->cO:Lcom/kwad/sdk/core/webview/b;

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/jshandler/ad;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 6
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/ag;

    iget-object v1, p0, Lcom/kwad/components/core/page/c/f;->cO:Lcom/kwad/sdk/core/webview/b;

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/jshandler/ag;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    .line 7
    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 8
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/az;

    iget-object v1, p0, Lcom/kwad/components/core/page/c/f;->cO:Lcom/kwad/sdk/core/webview/b;

    invoke-direct {v0, v1, v4}, Lcom/kwad/components/core/webview/jshandler/az;-><init>(Lcom/kwad/sdk/core/webview/b;Lcom/kwad/components/core/e/d/c;)V

    .line 9
    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 10
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/ac;

    iget-object v1, p0, Lcom/kwad/components/core/page/c/f;->cO:Lcom/kwad/sdk/core/webview/b;

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/jshandler/ac;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 11
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/aw;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/jshandler/aw;-><init>()V

    .line 12
    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 13
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/aq;

    invoke-direct {p0}, Lcom/kwad/components/core/page/c/f;->pR()Lcom/kwad/components/core/webview/jshandler/aq$b;

    move-result-object v1

    iget-object v2, p0, Lcom/kwad/components/core/page/c/f;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 14
    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/b;->cy(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/kwad/components/core/webview/jshandler/aq;-><init>(Lcom/kwad/components/core/webview/jshandler/aq$b;Ljava/lang/String;)V

    .line 15
    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 16
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/ak;

    iget-object v1, p0, Lcom/kwad/components/core/page/c/f;->cO:Lcom/kwad/sdk/core/webview/b;

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/jshandler/ak;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 17
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/m;

    iget-object v1, p0, Lcom/kwad/components/core/page/c/f;->cO:Lcom/kwad/sdk/core/webview/b;

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/jshandler/m;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->b(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 18
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/l;

    iget-object v1, p0, Lcom/kwad/components/core/page/c/f;->cO:Lcom/kwad/sdk/core/webview/b;

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/jshandler/l;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->b(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 19
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/ao;

    invoke-direct {p0}, Lcom/kwad/components/core/page/c/f;->getOpenNewPageListener()Lcom/kwad/components/core/webview/jshandler/ao$a;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/jshandler/ao;-><init>(Lcom/kwad/components/core/webview/jshandler/ao$a;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 20
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/aa;

    iget-object v1, p0, Lcom/kwad/components/core/page/c/f;->cO:Lcom/kwad/sdk/core/webview/b;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v4, v2, v3}, Lcom/kwad/components/core/webview/jshandler/aa;-><init>(Lcom/kwad/sdk/core/webview/b;Lcom/kwad/components/core/e/d/c;Lcom/kwad/sdk/core/webview/d/a/a;B)V

    .line 21
    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 22
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/x;

    iget-object v3, p0, Lcom/kwad/components/core/page/c/f;->cO:Lcom/kwad/sdk/core/webview/b;

    iget-boolean v7, p0, Lcom/kwad/components/core/page/c/f;->mIsRewardLandPage:Z

    const/4 v5, 0x0

    const/4 v6, 0x2

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Lcom/kwad/components/core/webview/jshandler/x;-><init>(Lcom/kwad/sdk/core/webview/b;Lcom/kwad/components/core/e/d/c;Lcom/kwad/sdk/core/webview/d/a/a;IZ)V

    .line 23
    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    return-void
.end method

.method private aA()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/page/c/f;->cN:Lcom/kwad/components/core/webview/a;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/a;->destroy()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/kwad/components/core/page/c/f;->cN:Lcom/kwad/components/core/webview/a;

    :cond_0
    return-void
.end method

.method private av(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/page/c/f;->az()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/page/c/f;->OA:Landroid/webkit/WebView;

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    return-void
.end method

.method private ax()V
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/webview/b;

    invoke-direct {v0}, Lcom/kwad/sdk/core/webview/b;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/page/c/f;->cO:Lcom/kwad/sdk/core/webview/b;

    .line 2
    iget-object v1, p0, Lcom/kwad/components/core/page/c/f;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/webview/b;->setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/page/c/f;->cO:Lcom/kwad/sdk/core/webview/b;

    iget-object v1, p0, Lcom/kwad/components/core/page/c/f;->Ph:Landroid/view/ViewGroup;

    iput-object v1, v0, Lcom/kwad/sdk/core/webview/b;->Ph:Landroid/view/ViewGroup;

    .line 4
    iget-object v1, p0, Lcom/kwad/components/core/page/c/f;->OA:Landroid/webkit/WebView;

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

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/page/c/f;->aA()V

    .line 2
    new-instance v0, Lcom/kwad/components/core/webview/a;

    iget-object v1, p0, Lcom/kwad/components/core/page/c/f;->OA:Landroid/webkit/WebView;

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/a;-><init>(Landroid/webkit/WebView;)V

    iput-object v0, p0, Lcom/kwad/components/core/page/c/f;->cN:Lcom/kwad/components/core/webview/a;

    .line 3
    invoke-direct {p0, v0}, Lcom/kwad/components/core/page/c/f;->a(Lcom/kwad/components/core/webview/a;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/page/c/f;->OA:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/kwad/components/core/page/c/f;->cN:Lcom/kwad/components/core/webview/a;

    const-string v2, "KwaiAd"

    invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic b(Lcom/kwad/components/core/page/c/f;)Landroid/view/ViewGroup;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/page/c/f;->Ph:Landroid/view/ViewGroup;

    return-object p0
.end method

.method static synthetic c(Lcom/kwad/components/core/page/c/f;)Landroid/webkit/WebView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/page/c/f;->OA:Landroid/webkit/WebView;

    return-object p0
.end method

.method static synthetic d(Lcom/kwad/components/core/page/c/f;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/page/c/f;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method private getOpenNewPageListener()Lcom/kwad/components/core/webview/jshandler/ao$a;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/core/page/c/f$2;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/page/c/f$2;-><init>(Lcom/kwad/components/core/page/c/f;)V

    return-object v0
.end method

.method private pR()Lcom/kwad/components/core/webview/jshandler/aq$b;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/core/page/c/f$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/page/c/f$1;-><init>(Lcom/kwad/components/core/page/c/f;)V

    return-object v0
.end method


# virtual methods
.method public final aj()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/page/c/c;->aj()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/page/c/c;->Pe:Lcom/kwad/components/core/page/c/d;

    iget-object v0, v0, Lcom/kwad/components/core/page/c/d;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iput-object v0, p0, Lcom/kwad/components/core/page/c/f;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 3
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/b;->cy(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 5
    invoke-direct {p0}, Lcom/kwad/components/core/page/c/f;->ax()V

    .line 6
    invoke-direct {p0, v0}, Lcom/kwad/components/core/page/c/f;->av(Ljava/lang/String;)V

    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/page/c/f;->Pi:Lcom/kwad/components/core/page/c/f$a;

    if-eqz v0, :cond_1

    .line 8
    iget v1, p0, Lcom/kwad/components/core/page/c/f;->Pg:I

    invoke-interface {v0, v1}, Lcom/kwad/components/core/page/c/f$a;->aA(I)V

    :cond_1
    return-void
.end method

.method public final onCreate()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onCreate()V

    .line 2
    sget v0, Lcom/kwad/sdk/R$id;->ksad_landing_page_webview:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iput-object v0, p0, Lcom/kwad/components/core/page/c/f;->OA:Landroid/webkit/WebView;

    .line 3
    sget v0, Lcom/kwad/sdk/R$id;->ksad_web_card_container:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/kwad/components/core/page/c/f;->Ph:Landroid/view/ViewGroup;

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/page/c/f;->OA:Landroid/webkit/WebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    return-void
.end method

.method public final onUnbind()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onUnbind()V

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/core/page/c/f;->aA()V

    return-void
.end method
