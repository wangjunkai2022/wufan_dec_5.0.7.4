.class public final Lcom/kwad/components/core/page/c/a/g;
.super Lcom/kwad/components/core/page/c/a/a;
.source "SourceFile"


# static fields
.field private static final fS:Landroid/os/Handler;


# instance fields
.field public OV:Lcom/kwad/components/core/page/AdWebViewActivityProxy$a;

.field private PK:Z

.field private PL:Z

.field private PM:Lcom/kwad/components/core/webview/jshandler/aw;

.field private PN:Lcom/kwad/components/core/webview/jshandler/at;

.field private PO:Ljava/lang/String;

.field private PP:Ljava/lang/Runnable;

.field private Po:Lcom/kwad/components/core/webview/jshandler/at$b;

.field private fX:Lcom/kwad/components/core/webview/b;

.field private fY:Lcom/kwad/components/core/webview/c;

.field public mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

.field private mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

.field private final wU:Lcom/kwad/sdk/core/c/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lcom/kwad/components/core/page/c/a/g;->fS:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/page/c/a/a;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/core/page/c/a/g;->PK:Z

    .line 3
    iput-boolean v0, p0, Lcom/kwad/components/core/page/c/a/g;->PL:Z

    .line 4
    new-instance v0, Lcom/kwad/components/core/page/c/a/g$2;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/page/c/a/g$2;-><init>(Lcom/kwad/components/core/page/c/a/g;)V

    iput-object v0, p0, Lcom/kwad/components/core/page/c/a/g;->wU:Lcom/kwad/sdk/core/c/c;

    .line 5
    new-instance v0, Lcom/kwad/components/core/page/c/a/g$3;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/page/c/a/g$3;-><init>(Lcom/kwad/components/core/page/c/a/g;)V

    iput-object v0, p0, Lcom/kwad/components/core/page/c/a/g;->Po:Lcom/kwad/components/core/webview/jshandler/at$b;

    .line 6
    new-instance v0, Lcom/kwad/components/core/page/c/a/g$4;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/page/c/a/g$4;-><init>(Lcom/kwad/components/core/page/c/a/g;)V

    iput-object v0, p0, Lcom/kwad/components/core/page/c/a/g;->fY:Lcom/kwad/components/core/webview/c;

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/page/c/a/g;Lcom/kwad/components/core/webview/jshandler/at;)Lcom/kwad/components/core/webview/jshandler/at;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/page/c/a/g;->PN:Lcom/kwad/components/core/webview/jshandler/at;

    return-object p1
.end method

.method static synthetic a(Lcom/kwad/components/core/page/c/a/g;Lcom/kwad/components/core/webview/jshandler/aw;)Lcom/kwad/components/core/webview/jshandler/aw;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/kwad/components/core/page/c/a/g;->PM:Lcom/kwad/components/core/webview/jshandler/aw;

    return-object p1
.end method

.method static synthetic a(Lcom/kwad/components/core/page/c/a/g;)Lcom/kwad/sdk/core/webview/KsAdWebView;
    .locals 0

    .line 3
    iget-object p0, p0, Lcom/kwad/components/core/page/c/a/g;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    return-object p0
.end method

.method static synthetic a(Lcom/kwad/components/core/page/c/a/g;Lcom/kwad/sdk/core/webview/KsAdWebView;)Lcom/kwad/sdk/core/webview/KsAdWebView;
    .locals 0

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/kwad/components/core/page/c/a/g;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    return-object p1
.end method

.method static synthetic a(Lcom/kwad/components/core/page/c/a/g;Ljava/lang/Runnable;)Ljava/lang/Runnable;
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/kwad/components/core/page/c/a/g;->PP:Ljava/lang/Runnable;

    return-object p1
.end method

.method static synthetic a(Lcom/kwad/components/core/page/c/a/g;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 6
    iput-object p1, p0, Lcom/kwad/components/core/page/c/a/g;->PO:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic a(Lcom/kwad/components/core/page/c/a/g;Z)Z
    .locals 0

    .line 7
    iput-boolean p1, p0, Lcom/kwad/components/core/page/c/a/g;->PK:Z

    return p1
.end method

.method static synthetic b(Lcom/kwad/components/core/page/c/a/g;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/page/c/a/g;->PO:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic b(Lcom/kwad/components/core/page/c/a/g;Z)Z
    .locals 0

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/kwad/components/core/page/c/a/g;->PL:Z

    return p1
.end method

.method static synthetic c(Lcom/kwad/components/core/page/c/a/g;)Ljava/lang/Runnable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/page/c/a/g;->PP:Ljava/lang/Runnable;

    return-object p0
.end method

.method static synthetic d(Lcom/kwad/components/core/page/c/a/g;)Lcom/kwad/components/core/webview/jshandler/at;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/page/c/a/g;->PN:Lcom/kwad/components/core/webview/jshandler/at;

    return-object p0
.end method

.method static synthetic e(Lcom/kwad/components/core/page/c/a/g;)Lcom/kwad/components/core/webview/jshandler/at$b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/page/c/a/g;->Po:Lcom/kwad/components/core/webview/jshandler/at$b;

    return-object p0
.end method

.method private et()V
    .locals 3

    .line 1
    new-instance v0, Lcom/kwad/components/core/webview/b;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/b;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/page/c/a/g;->fX:Lcom/kwad/components/core/webview/b;

    .line 2
    new-instance v0, Lcom/kwad/components/core/webview/b$a;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/b$a;-><init>()V

    iget-object v1, p0, Lcom/kwad/components/core/page/c/a/a;->Pk:Lcom/kwad/components/core/page/c/a/b;

    iget-object v1, v1, Lcom/kwad/components/core/page/c/a/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 3
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/b$a;->aA(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/core/webview/b$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/page/c/a/a;->Pk:Lcom/kwad/components/core/page/c/a/b;

    iget-object v1, v1, Lcom/kwad/components/core/page/c/a/b;->mPageUrl:Ljava/lang/String;

    .line 4
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/b$a;->aH(Ljava/lang/String;)Lcom/kwad/components/core/webview/b$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/page/c/a/g;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    .line 5
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/b$a;->d(Lcom/kwad/sdk/core/webview/KsAdWebView;)Lcom/kwad/components/core/webview/b$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/page/c/a/a;->Pk:Lcom/kwad/components/core/page/c/a/b;

    iget-object v1, v1, Lcom/kwad/components/core/page/c/a/b;->gS:Landroid/view/ViewGroup;

    .line 6
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/b$a;->k(Landroid/view/ViewGroup;)Lcom/kwad/components/core/webview/b$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/page/c/a/g;->fY:Lcom/kwad/components/core/webview/c;

    .line 7
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/b$a;->a(Lcom/kwad/components/core/webview/c;)Lcom/kwad/components/core/webview/b$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/page/c/a/a;->Pk:Lcom/kwad/components/core/page/c/a/b;

    iget-object v1, v1, Lcom/kwad/components/core/page/c/a/b;->Pm:Lcom/kwad/sdk/core/webview/KsAdWebView$c;

    .line 8
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/b$a;->b(Lcom/kwad/sdk/core/webview/KsAdWebView$c;)Lcom/kwad/components/core/webview/b$a;

    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/kwad/components/core/page/c/a/g;->fX:Lcom/kwad/components/core/webview/b;

    invoke-virtual {v1, v0}, Lcom/kwad/components/core/webview/b;->a(Lcom/kwad/components/core/webview/b$a;)V

    .line 10
    invoke-direct {p0}, Lcom/kwad/components/core/page/c/a/g;->qd()V

    .line 11
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/g;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v1, p0, Lcom/kwad/components/core/page/c/a/g;->OV:Lcom/kwad/components/core/page/AdWebViewActivityProxy$a;

    invoke-virtual {v1}, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a;->pG()I

    move-result v1

    iget-object v2, p0, Lcom/kwad/components/core/page/c/a/g;->OV:Lcom/kwad/components/core/page/AdWebViewActivityProxy$a;

    .line 12
    invoke-virtual {v2}, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a;->pF()Ljava/lang/String;

    move-result-object v2

    .line 13
    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/commercial/g/a;->l(Lcom/kwad/sdk/core/response/model/AdTemplate;ILjava/lang/String;)V

    .line 14
    new-instance v0, Lcom/kwad/components/core/page/c/a/g$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/page/c/a/g$1;-><init>(Lcom/kwad/components/core/page/c/a/g;)V

    .line 15
    iget-object v1, p0, Lcom/kwad/components/core/page/c/a/g;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-virtual {v1}, Lcom/kwad/sdk/core/webview/KsAdWebView;->getClientConfig()Lcom/kwad/sdk/core/webview/a/c$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/webview/a/c;->setClientConfig(Lcom/kwad/sdk/core/webview/a/c$a;)V

    .line 16
    iget-object v1, p0, Lcom/kwad/components/core/page/c/a/g;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-virtual {v1, v0}, Lcom/kwad/sdk/core/webview/KsAdWebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 17
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/g;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    iget-object v1, p0, Lcom/kwad/components/core/page/c/a/a;->Pk:Lcom/kwad/components/core/page/c/a/b;

    iget-object v1, v1, Lcom/kwad/components/core/page/c/a/b;->mPageUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/webview/KsAdWebView;->loadUrl(Ljava/lang/String;)V

    .line 18
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/g;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-virtual {v0}, Lcom/kwad/sdk/core/webview/KsAdWebView;->onActivityCreate()V

    return-void
.end method

.method static synthetic f(Lcom/kwad/components/core/page/c/a/g;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/core/page/c/a/g;->PL:Z

    return p0
.end method

.method private qd()V
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/g;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    .line 2
    invoke-virtual {v0}, Lcom/kwad/sdk/core/webview/KsAdWebView;->getClientConfig()Lcom/kwad/sdk/core/webview/a/c$a;

    move-result-object v0

    const/4 v1, 0x1

    .line 3
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/webview/a/c$a;->bw(Z)Lcom/kwad/sdk/core/webview/a/c$a;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/components/core/page/c/a/a;->Pk:Lcom/kwad/components/core/page/c/a/b;

    iget-object v2, v2, Lcom/kwad/components/core/page/c/a/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 4
    invoke-virtual {v0, v2}, Lcom/kwad/sdk/core/webview/a/c$a;->ek(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/webview/a/c$a;

    move-result-object v0

    const/4 v2, 0x0

    .line 5
    invoke-virtual {v0, v2}, Lcom/kwad/sdk/core/webview/a/c$a;->bu(Z)Lcom/kwad/sdk/core/webview/a/c$a;

    move-result-object v0

    .line 6
    iget-object v2, p0, Lcom/kwad/components/core/page/c/a/g;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-virtual {v2, v0}, Lcom/kwad/sdk/core/webview/KsAdWebView;->setClientConfig(Lcom/kwad/sdk/core/webview/a/c$a;)V

    .line 7
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/a;->Pk:Lcom/kwad/components/core/page/c/a/b;

    iget-object v0, v0, Lcom/kwad/components/core/page/c/a/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 8
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 9
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->bJ(Lcom/kwad/sdk/core/response/model/AdInfo;)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-lez v0, :cond_0

    .line 10
    new-instance v0, Lcom/kwad/components/core/page/c/a/g$5;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/page/c/a/g$5;-><init>(Lcom/kwad/components/core/page/c/a/g;)V

    iget-object v1, p0, Lcom/kwad/components/core/page/c/a/a;->Pk:Lcom/kwad/components/core/page/c/a/b;

    iget-object v1, v1, Lcom/kwad/components/core/page/c/a/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 11
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v1

    .line 12
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->bJ(Lcom/kwad/sdk/core/response/model/AdInfo;)J

    move-result-wide v1

    .line 13
    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/utils/bo;->runOnUiThreadDelay(Ljava/lang/Runnable;J)V

    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/a;->Pk:Lcom/kwad/components/core/page/c/a/b;

    iget-object v0, v0, Lcom/kwad/components/core/page/c/a/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 15
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 16
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->bJ(Lcom/kwad/sdk/core/response/model/AdInfo;)J

    move-result-wide v2

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    .line 17
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/g;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    if-eqz v0, :cond_1

    .line 18
    invoke-virtual {v0}, Lcom/kwad/sdk/core/webview/KsAdWebView;->getClientConfig()Lcom/kwad/sdk/core/webview/a/c$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/webview/a/c$a;->bu(Z)Lcom/kwad/sdk/core/webview/a/c$a;

    .line 19
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/g;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    new-instance v1, Lcom/kwad/components/core/page/c/a/g$6;

    invoke-direct {v1, p0}, Lcom/kwad/components/core/page/c/a/g$6;-><init>(Lcom/kwad/components/core/page/c/a/g;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method static synthetic qe()Landroid/os/Handler;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/components/core/page/c/a/g;->fS:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public final aj()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/page/c/a/a;->aj()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/a;->Pk:Lcom/kwad/components/core/page/c/a/b;

    iget-object v1, v0, Lcom/kwad/components/core/page/c/a/b;->OV:Lcom/kwad/components/core/page/AdWebViewActivityProxy$a;

    iput-object v1, p0, Lcom/kwad/components/core/page/c/a/g;->OV:Lcom/kwad/components/core/page/AdWebViewActivityProxy$a;

    .line 3
    iget-object v0, v0, Lcom/kwad/components/core/page/c/a/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iput-object v0, p0, Lcom/kwad/components/core/page/c/a/g;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 4
    invoke-direct {p0}, Lcom/kwad/components/core/page/c/a/g;->et()V

    .line 5
    invoke-static {}, Lcom/kwad/sdk/core/c/b;->En()Lcom/kwad/sdk/core/c/b;

    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/g;->wU:Lcom/kwad/sdk/core/c/c;

    invoke-static {v0}, Lcom/kwad/sdk/core/c/b;->a(Lcom/kwad/sdk/core/c/c;)V

    return-void
.end method

.method public final hide()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/g;->PM:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sX()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/a;->Pk:Lcom/kwad/components/core/page/c/a/b;

    iget-object v0, v0, Lcom/kwad/components/core/page/c/a/b;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    if-eqz v0, :cond_1

    const/16 v1, 0x8

    .line 4
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/g;->PM:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sY()V

    :cond_2
    return-void
.end method

.method public final onCreate()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onCreate()V

    .line 2
    sget v0, Lcom/kwad/sdk/R$id;->ksad_video_webview:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/core/webview/KsAdWebView;

    iput-object v0, p0, Lcom/kwad/components/core/page/c/a/g;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    return-void
.end method

.method public final onUnbind()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onUnbind()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/g;->fX:Lcom/kwad/components/core/webview/b;

    invoke-virtual {v0}, Lcom/kwad/components/core/webview/b;->jq()V

    .line 3
    invoke-static {}, Lcom/kwad/sdk/core/c/b;->En()Lcom/kwad/sdk/core/c/b;

    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/g;->wU:Lcom/kwad/sdk/core/c/c;

    invoke-static {v0}, Lcom/kwad/sdk/core/c/b;->b(Lcom/kwad/sdk/core/c/c;)V

    return-void
.end method

.method public final show()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/page/c/a/g;->PK:Z

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/g;->PM:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sV()V

    .line 4
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/a;->Pk:Lcom/kwad/components/core/page/c/a/b;

    iget-object v0, v0, Lcom/kwad/components/core/page/c/a/b;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    .line 5
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 6
    invoke-static {v0}, Lcom/kwad/components/core/d/a;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    .line 7
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/g;->PM:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_3

    .line 8
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sW()V

    :cond_3
    return-void
.end method
