.class public final Lcom/kwad/components/ad/f/e;
.super Lcom/kwad/sdk/widget/KSRelativeLayout;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/h/c;


# instance fields
.field private bQ:Lcom/kwad/components/core/widget/a/b;

.field private cB:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private cN:Lcom/kwad/components/core/webview/a;

.field private cO:Lcom/kwad/sdk/core/webview/b;

.field private cP:I

.field private cU:Lcom/kwad/components/core/webview/jshandler/aq$b;

.field private eL:Lcom/kwad/sdk/widget/KSRelativeLayout;

.field private eQ:Z

.field private eT:Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;

.field private eU:Lcom/kwad/components/core/n/a/a/a;

.field public eV:Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;

.field private eY:Lcom/kwad/components/core/j/a$b;

.field private final eZ:Lcom/kwad/components/offline/api/core/adlive/listener/AdLivePlayStateListener;

.field private fC:Lcom/kwad/components/core/webview/jshandler/ba;

.field private fD:Lcom/kwad/components/core/webview/jshandler/aw;

.field private fE:Lcom/kwad/components/core/webview/jshandler/WebCardRegisterLiveMessageListener;

.field private fF:Lcom/kwad/components/core/webview/jshandler/WebCardRegisterLiveShopListener;

.field private fJ:Lcom/kwad/components/core/webview/jshandler/ax$b;

.field private fK:Lcom/kwad/components/core/webview/jshandler/ax$a;

.field private fa:Lcom/kwad/components/offline/api/core/api/OfflineOnAudioConflictListener;

.field private ga:Lcom/kwad/components/offline/api/core/adlive/IAdLiveEndRequest;

.field private mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

.field private mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

.field private mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

.field private mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

.field private mContext:Landroid/content/Context;

.field private mG:Landroid/widget/ImageView;

.field private mH:Landroid/widget/RelativeLayout;

.field private mI:Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;

.field private mIsAudioEnable:Z

.field private mJ:Lcom/kwad/components/core/internal/api/KSAdVideoPlayConfigImpl;

.field private final mNetworking:Lcom/kwad/sdk/core/network/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/kwad/sdk/core/network/l<",
            "Lcom/kwad/components/core/liveEnd/a;",
            "Lcom/kwad/components/core/liveEnd/AdLiveEndCommonResultData;",
            ">;"
        }
    .end annotation
.end field

.field private mr:Lcom/kwad/sdk/api/KsNativeAd$VideoPlayListener;

.field private mt:I

.field private mu:I

.field private mw:Lcom/kwad/components/ad/f/d$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/sdk/widget/KSRelativeLayout;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lcom/kwad/components/ad/f/e;->mt:I

    .line 3
    iput p1, p0, Lcom/kwad/components/ad/f/e;->mu:I

    .line 4
    new-instance p1, Lcom/kwad/components/ad/f/e$10;

    invoke-direct {p1, p0}, Lcom/kwad/components/ad/f/e$10;-><init>(Lcom/kwad/components/ad/f/e;)V

    iput-object p1, p0, Lcom/kwad/components/ad/f/e;->cU:Lcom/kwad/components/core/webview/jshandler/aq$b;

    .line 5
    new-instance p1, Lcom/kwad/components/ad/f/e$12;

    invoke-direct {p1, p0}, Lcom/kwad/components/ad/f/e$12;-><init>(Lcom/kwad/components/ad/f/e;)V

    iput-object p1, p0, Lcom/kwad/components/ad/f/e;->mNetworking:Lcom/kwad/sdk/core/network/l;

    .line 6
    new-instance p1, Lcom/kwad/components/ad/f/e$2;

    invoke-direct {p1, p0}, Lcom/kwad/components/ad/f/e$2;-><init>(Lcom/kwad/components/ad/f/e;)V

    iput-object p1, p0, Lcom/kwad/components/ad/f/e;->eZ:Lcom/kwad/components/offline/api/core/adlive/listener/AdLivePlayStateListener;

    .line 7
    new-instance p1, Lcom/kwad/components/ad/f/e$3;

    invoke-direct {p1, p0}, Lcom/kwad/components/ad/f/e$3;-><init>(Lcom/kwad/components/ad/f/e;)V

    iput-object p1, p0, Lcom/kwad/components/ad/f/e;->fa:Lcom/kwad/components/offline/api/core/api/OfflineOnAudioConflictListener;

    .line 8
    invoke-direct {p0}, Lcom/kwad/components/ad/f/e;->initView()V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/f/e;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/components/ad/f/e;->cP:I

    return p1
.end method

.method static synthetic a(Lcom/kwad/components/ad/f/e;)Lcom/kwad/components/core/webview/jshandler/WebCardRegisterLiveMessageListener;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/kwad/components/ad/f/e;->fE:Lcom/kwad/components/core/webview/jshandler/WebCardRegisterLiveMessageListener;

    return-object p0
.end method

.method static synthetic a(Lcom/kwad/components/ad/f/e;Lcom/kwad/components/core/webview/jshandler/ax$a;)Lcom/kwad/components/core/webview/jshandler/ax$a;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/kwad/components/ad/f/e;->fK:Lcom/kwad/components/core/webview/jshandler/ax$a;

    return-object p1
.end method

.method static synthetic a(Lcom/kwad/components/ad/f/e;Lcom/kwad/components/core/webview/jshandler/ax$b;)Lcom/kwad/components/core/webview/jshandler/ax$b;
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/kwad/components/ad/f/e;->fJ:Lcom/kwad/components/core/webview/jshandler/ax$b;

    return-object p1
.end method

.method static synthetic a(Lcom/kwad/components/ad/f/e;Lcom/kwad/components/offline/api/core/adlive/IAdLiveEndRequest;)Lcom/kwad/components/offline/api/core/adlive/IAdLiveEndRequest;
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/kwad/components/ad/f/e;->ga:Lcom/kwad/components/offline/api/core/adlive/IAdLiveEndRequest;

    return-object p1
.end method

.method static synthetic a(Lcom/kwad/components/ad/f/e;J)V
    .locals 0

    .line 6
    invoke-direct {p0, p1, p2}, Lcom/kwad/components/ad/f/e;->c(J)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/f/e;Landroid/view/View;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/f/e;->c(Landroid/view/View;)V

    return-void
.end method

.method private a(Lcom/kwad/components/core/webview/a;)V
    .locals 5

    .line 22
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/ba;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/jshandler/ba;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/f/e;->fC:Lcom/kwad/components/core/webview/jshandler/ba;

    .line 23
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/aw;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/jshandler/aw;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/f/e;->fD:Lcom/kwad/components/core/webview/jshandler/aw;

    .line 24
    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 25
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/aa;

    iget-object v1, p0, Lcom/kwad/components/ad/f/e;->cO:Lcom/kwad/sdk/core/webview/b;

    iget-object v2, p0, Lcom/kwad/components/ad/f/e;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    .line 26
    invoke-direct {p0}, Lcom/kwad/components/ad/f/e;->getClickListener()Lcom/kwad/sdk/core/webview/d/a/a;

    move-result-object v3

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/kwad/components/core/webview/jshandler/aa;-><init>(Lcom/kwad/sdk/core/webview/b;Lcom/kwad/components/core/e/d/c;Lcom/kwad/sdk/core/webview/d/a/a;B)V

    .line 27
    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 28
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/x;

    iget-object v1, p0, Lcom/kwad/components/ad/f/e;->cO:Lcom/kwad/sdk/core/webview/b;

    iget-object v2, p0, Lcom/kwad/components/ad/f/e;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    .line 29
    invoke-direct {p0}, Lcom/kwad/components/ad/f/e;->getClickListener()Lcom/kwad/sdk/core/webview/d/a/a;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/kwad/components/core/webview/jshandler/x;-><init>(Lcom/kwad/sdk/core/webview/b;Lcom/kwad/components/core/e/d/c;Lcom/kwad/sdk/core/webview/d/a/a;)V

    .line 30
    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 31
    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/a/f;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/tachikoma/a/f;-><init>()V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 32
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/ad;

    iget-object v1, p0, Lcom/kwad/components/ad/f/e;->cO:Lcom/kwad/sdk/core/webview/b;

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/jshandler/ad;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 33
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/ag;

    iget-object v1, p0, Lcom/kwad/components/ad/f/e;->cO:Lcom/kwad/sdk/core/webview/b;

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/jshandler/ag;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 34
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/ac;

    iget-object v1, p0, Lcom/kwad/components/ad/f/e;->cO:Lcom/kwad/sdk/core/webview/b;

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/jshandler/ac;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 35
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/aq;

    iget-object v1, p0, Lcom/kwad/components/ad/f/e;->cU:Lcom/kwad/components/core/webview/jshandler/aq$b;

    iget-object v2, p0, Lcom/kwad/components/ad/f/e;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 36
    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/b;->cI(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/kwad/components/core/webview/jshandler/aq;-><init>(Lcom/kwad/components/core/webview/jshandler/aq$b;Ljava/lang/String;)V

    .line 37
    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 38
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/az;

    iget-object v1, p0, Lcom/kwad/components/ad/f/e;->cO:Lcom/kwad/sdk/core/webview/b;

    iget-object v2, p0, Lcom/kwad/components/ad/f/e;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    invoke-direct {v0, v1, v2}, Lcom/kwad/components/core/webview/jshandler/az;-><init>(Lcom/kwad/sdk/core/webview/b;Lcom/kwad/components/core/e/d/c;)V

    .line 39
    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 40
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/ak;

    iget-object v1, p0, Lcom/kwad/components/ad/f/e;->cO:Lcom/kwad/sdk/core/webview/b;

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/jshandler/ak;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 41
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/m;

    iget-object v1, p0, Lcom/kwad/components/ad/f/e;->cO:Lcom/kwad/sdk/core/webview/b;

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/jshandler/m;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->b(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 42
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/l;

    iget-object v1, p0, Lcom/kwad/components/ad/f/e;->cO:Lcom/kwad/sdk/core/webview/b;

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/jshandler/l;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->b(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 43
    iget-object v0, p0, Lcom/kwad/components/ad/f/e;->fC:Lcom/kwad/components/core/webview/jshandler/ba;

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 44
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/ao;

    invoke-direct {p0}, Lcom/kwad/components/ad/f/e;->getOpenNewPageListener()Lcom/kwad/components/core/webview/jshandler/ao$a;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/jshandler/ao;-><init>(Lcom/kwad/components/core/webview/jshandler/ao$a;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 45
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/e;

    iget v1, p0, Lcom/kwad/components/ad/f/e;->mt:I

    iget v2, p0, Lcom/kwad/components/ad/f/e;->mu:I

    invoke-direct {v0, v1, v2}, Lcom/kwad/components/core/webview/jshandler/e;-><init>(II)V

    .line 46
    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 47
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/WebCardRegisterLiveShopListener;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/jshandler/WebCardRegisterLiveShopListener;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/f/e;->fF:Lcom/kwad/components/core/webview/jshandler/WebCardRegisterLiveShopListener;

    .line 48
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/WebCardRegisterLiveMessageListener;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/jshandler/WebCardRegisterLiveMessageListener;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/f/e;->fE:Lcom/kwad/components/core/webview/jshandler/WebCardRegisterLiveMessageListener;

    .line 49
    iget-object v0, p0, Lcom/kwad/components/ad/f/e;->fF:Lcom/kwad/components/core/webview/jshandler/WebCardRegisterLiveShopListener;

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 50
    iget-object v0, p0, Lcom/kwad/components/ad/f/e;->fE:Lcom/kwad/components/core/webview/jshandler/WebCardRegisterLiveMessageListener;

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 51
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/ax;

    invoke-direct {p0}, Lcom/kwad/components/ad/f/e;->getRegisterLiveListener()Lcom/kwad/components/core/webview/jshandler/ax$c;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/jshandler/ax;-><init>(Lcom/kwad/components/core/webview/jshandler/ax$c;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/f/e;Z)Z
    .locals 0

    .line 8
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/f/e;->g(Z)Z

    move-result p0

    return p0
.end method

.method private aA()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/f/e;->cN:Lcom/kwad/components/core/webview/a;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/a;->destroy()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/kwad/components/ad/f/e;->cN:Lcom/kwad/components/core/webview/a;

    :cond_0
    return-void
.end method

.method private ax()V
    .locals 4

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/webview/b;

    invoke-direct {v0}, Lcom/kwad/sdk/core/webview/b;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/f/e;->cO:Lcom/kwad/sdk/core/webview/b;

    .line 2
    iget-object v1, p0, Lcom/kwad/components/ad/f/e;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/webview/b;->setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/f/e;->cO:Lcom/kwad/sdk/core/webview/b;

    const/4 v1, 0x0

    iput v1, v0, Lcom/kwad/sdk/core/webview/b;->mScreenOrientation:I

    const/4 v2, 0x0

    .line 4
    iput-object v2, v0, Lcom/kwad/sdk/core/webview/b;->aEW:Lcom/kwad/sdk/widget/e;

    .line 5
    iget-object v3, p0, Lcom/kwad/components/ad/f/e;->mI:Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;

    iput-object v3, v0, Lcom/kwad/sdk/core/webview/b;->Ph:Landroid/view/ViewGroup;

    .line 6
    iget-object v3, p0, Lcom/kwad/components/ad/f/e;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    iput-object v3, v0, Lcom/kwad/sdk/core/webview/b;->OA:Landroid/webkit/WebView;

    .line 7
    iput-object v2, v0, Lcom/kwad/sdk/core/webview/b;->mReportExtData:Lorg/json/JSONObject;

    .line 8
    iput-boolean v1, v0, Lcom/kwad/sdk/core/webview/b;->aEY:Z

    return-void
.end method

.method private ay()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/f/e;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/b;->cS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-direct {p0}, Lcom/kwad/components/ad/f/e;->eu()V

    return-void
.end method

.method static synthetic b(Lcom/kwad/components/ad/f/e;)Lcom/kwad/components/core/webview/jshandler/WebCardRegisterLiveShopListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/f/e;->fF:Lcom/kwad/components/core/webview/jshandler/WebCardRegisterLiveShopListener;

    return-object p0
.end method

.method private bi()Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;
    .locals 10

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/f/e;->bj()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/f/e;->eU:Lcom/kwad/components/core/n/a/a/a;

    iget-object v1, p0, Lcom/kwad/components/ad/f/e;->mContext:Landroid/content/Context;

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lcom/kwad/components/ad/j/b;->a(Lcom/kwad/components/core/n/a/a/a;Landroid/content/Context;I)Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;

    move-result-object v4

    iput-object v4, p0, Lcom/kwad/components/ad/f/e;->eT:Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;

    if-nez v4, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 3
    :cond_0
    iget-object v3, p0, Lcom/kwad/components/ad/f/e;->eU:Lcom/kwad/components/core/n/a/a/a;

    .line 4
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->Lx()Lcom/kwad/sdk/api/SdkConfig;

    move-result-object v0

    iget-object v5, v0, Lcom/kwad/sdk/api/SdkConfig;->appId:Ljava/lang/String;

    iget-object v0, p0, Lcom/kwad/components/ad/f/e;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    .line 5
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->ch(Lcom/kwad/sdk/core/response/model/AdInfo;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    iget-object v0, p0, Lcom/kwad/components/ad/f/e;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    .line 6
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->ci(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v7

    iget-object v0, p0, Lcom/kwad/components/ad/f/e;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    .line 7
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->cj(Lcom/kwad/sdk/core/response/model/AdInfo;)J

    move-result-wide v8

    .line 8
    invoke-interface/range {v3 .. v9}, Lcom/kwad/components/core/n/a/a/a;->getAdLivePlayModule(Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;

    move-result-object v0

    .line 9
    iget-boolean v1, p0, Lcom/kwad/components/ad/f/e;->mIsAudioEnable:Z

    invoke-direct {p0, v1}, Lcom/kwad/components/ad/f/e;->g(Z)Z

    move-result v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;->setAudioEnabled(ZZ)V

    .line 10
    iget-object v1, p0, Lcom/kwad/components/ad/f/e;->eZ:Lcom/kwad/components/offline/api/core/adlive/listener/AdLivePlayStateListener;

    invoke-interface {v0, v1}, Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;->registerAdLivePlayStateListener(Lcom/kwad/components/offline/api/core/adlive/listener/AdLivePlayStateListener;)V

    .line 11
    iget-object v1, p0, Lcom/kwad/components/ad/f/e;->eT:Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;

    invoke-interface {v1}, Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;->getView()Landroid/view/View;

    move-result-object v1

    .line 12
    iget-object v2, p0, Lcom/kwad/components/ad/f/e;->mH:Landroid/widget/RelativeLayout;

    invoke-virtual {v2}, Landroid/widget/RelativeLayout;->removeAllViews()V

    .line 13
    iget-object v2, p0, Lcom/kwad/components/ad/f/e;->mH:Landroid/widget/RelativeLayout;

    invoke-virtual {v2, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 14
    new-instance v2, Lcom/kwad/components/ad/f/e$1;

    invoke-direct {v2, p0, v1}, Lcom/kwad/components/ad/f/e$1;-><init>(Lcom/kwad/components/ad/f/e;Landroid/view/View;)V

    invoke-static {v2}, Lcom/kwad/sdk/utils/bo;->postOnUiThread(Ljava/lang/Runnable;)V

    .line 15
    invoke-direct {p0}, Lcom/kwad/components/ad/f/e;->by()V

    .line 16
    iget-boolean v1, p0, Lcom/kwad/components/ad/f/e;->mIsAudioEnable:Z

    if-eqz v1, :cond_1

    .line 17
    iget-object v1, p0, Lcom/kwad/components/ad/f/e;->mContext:Landroid/content/Context;

    invoke-static {v1}, Lcom/kwad/components/core/s/a;->as(Landroid/content/Context;)Lcom/kwad/components/core/s/a;

    move-result-object v1

    iget-object v2, p0, Lcom/kwad/components/ad/f/e;->fa:Lcom/kwad/components/offline/api/core/api/OfflineOnAudioConflictListener;

    invoke-virtual {v1, v2}, Lcom/kwad/components/core/s/a;->a(Lcom/kwad/components/offline/api/core/api/OfflineOnAudioConflictListener;)V

    :cond_1
    return-object v0
.end method

.method private bj()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/f/e;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->bs(Lcom/kwad/sdk/core/response/model/AdInfo;)Lcom/kwad/sdk/core/response/model/b;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/sdk/core/response/model/b;->getUrl()Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 4
    iget-object v1, p0, Lcom/kwad/components/ad/f/e;->mG:Landroid/widget/ImageView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 5
    iget-object v1, p0, Lcom/kwad/components/ad/f/e;->mG:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/kwad/components/ad/f/e;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    new-instance v3, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;

    invoke-direct {v3}, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;-><init>()V

    const/16 v4, 0x32

    .line 6
    invoke-virtual {v3, v4}, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->setBlurRadius(I)Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;

    move-result-object v3

    invoke-virtual {v3}, Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat$Builder;->build()Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;

    move-result-object v3

    new-instance v4, Lcom/kwad/components/ad/f/e$5;

    invoke-direct {v4, p0}, Lcom/kwad/components/ad/f/e$5;-><init>(Lcom/kwad/components/ad/f/e;)V

    .line 7
    invoke-static {v1, v0, v2, v3, v4}, Lcom/kwad/sdk/core/imageloader/KSImageLoader;->loadImage(Landroid/widget/ImageView;Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;Lcom/kwad/sdk/core/imageloader/core/listener/ImageLoadingListener;)V

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/f/e;->mG:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/f/e;->mG:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method private bx()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/kwad/components/ad/f/e;->cP:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private by()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/f/e;->eT:Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;

    new-instance v1, Lcom/kwad/components/ad/f/e$6;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/f/e$6;-><init>(Lcom/kwad/components/ad/f/e;)V

    invoke-interface {v0, v1}, Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;->registerLiveMessageListener(Lcom/kwad/components/offline/api/core/adlive/listener/AdLiveMessageListener;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/f/e;->eT:Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;

    new-instance v1, Lcom/kwad/components/ad/f/e$7;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/f/e$7;-><init>(Lcom/kwad/components/ad/f/e;)V

    invoke-interface {v0, v1}, Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;->registerLiveShopListener(Lcom/kwad/components/offline/api/core/adlive/listener/AdLiveShopListener;)V

    return-void
.end method

.method static synthetic c(Lcom/kwad/components/ad/f/e;)Lcom/kwad/components/core/webview/jshandler/ax$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/f/e;->fK:Lcom/kwad/components/core/webview/jshandler/ax$a;

    return-object p0
.end method

.method private c(J)V
    .locals 2

    long-to-float p1, p1

    const/high16 p2, 0x447a0000    # 1000.0f

    div-float/2addr p1, p2

    float-to-double p1, p1

    .line 7
    invoke-static {p1, p2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide p1

    double-to-int p1, p1

    .line 8
    iget-object p2, p0, Lcom/kwad/components/ad/f/e;->cB:Ljava/util/List;

    if-eqz p2, :cond_2

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    .line 9
    :cond_0
    iget-object p2, p0, Lcom/kwad/components/ad/f/e;->cB:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    .line 10
    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 11
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 12
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 13
    iget-object v0, p0, Lcom/kwad/components/ad/f/e;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lcom/kwad/sdk/core/adlog/c;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;ILorg/json/JSONObject;)V

    .line 14
    invoke-interface {p2}, Ljava/util/Iterator;->remove()V

    :cond_2
    :goto_0
    return-void
.end method

.method private c(Landroid/view/View;)V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/f/e;->eL:Lcom/kwad/sdk/widget/KSRelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result v0

    .line 3
    iget-object v1, p0, Lcom/kwad/components/ad/f/e;->eL:Lcom/kwad/sdk/widget/KSRelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result v1

    if-eqz v0, :cond_1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/high16 v0, 0x3f100000    # 0.5625f

    int-to-float v2, v1

    mul-float v2, v2, v0

    float-to-int v0, v2

    .line 4
    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v2, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v0, 0xd

    const/4 v1, -0x1

    .line 5
    invoke-virtual {v2, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 6
    invoke-virtual {p1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic d(Lcom/kwad/components/ad/f/e;)Lcom/kwad/components/core/webview/jshandler/ax$b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/f/e;->fJ:Lcom/kwad/components/core/webview/jshandler/ax$b;

    return-object p0
.end method

.method static synthetic e(Lcom/kwad/components/ad/f/e;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/f/e;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method private ep()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/kwad/components/ad/f/e;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdTemplate;->mAdScene:Lcom/kwad/sdk/internal/api/SceneImpl;

    iget-object v0, v0, Lcom/kwad/sdk/internal/api/SceneImpl;->nativeAdExtraData:Lcom/kwad/sdk/internal/api/NativeAdExtraDataImpl;

    iget v1, v0, Lcom/kwad/sdk/internal/api/NativeAdExtraDataImpl;->showLiveStatus:I

    iput v1, p0, Lcom/kwad/components/ad/f/e;->mt:I

    .line 2
    iget v0, v0, Lcom/kwad/sdk/internal/api/NativeAdExtraDataImpl;->showLiveStyle:I

    iput v0, p0, Lcom/kwad/components/ad/f/e;->mu:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method private et()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/f/e;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/ad/f/e;->ax()V

    .line 3
    invoke-direct {p0}, Lcom/kwad/components/ad/f/e;->bx()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/f/e;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->reload()V

    return-void

    .line 5
    :cond_0
    invoke-direct {p0}, Lcom/kwad/components/ad/f/e;->ay()V

    return-void
.end method

.method private eu()V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetJavaScriptEnabled",
            "AddJavascriptInterface",
            "JavascriptInterface"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/f/e;->aA()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/f/e;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-virtual {v0}, Lcom/kwad/sdk/core/webview/KsAdWebView;->getClientConfig()Lcom/kwad/sdk/core/webview/a/c$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/f/e;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 3
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/webview/a/c$a;->ek(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/webview/a/c$a;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lcom/kwad/components/ad/f/e;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-virtual {v1, v0}, Lcom/kwad/sdk/core/webview/KsAdWebView;->setClientConfig(Lcom/kwad/sdk/core/webview/a/c$a;)V

    .line 5
    new-instance v0, Lcom/kwad/components/core/webview/a;

    iget-object v1, p0, Lcom/kwad/components/ad/f/e;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/a;-><init>(Landroid/webkit/WebView;)V

    iput-object v0, p0, Lcom/kwad/components/ad/f/e;->cN:Lcom/kwad/components/core/webview/a;

    .line 6
    invoke-direct {p0, v0}, Lcom/kwad/components/ad/f/e;->a(Lcom/kwad/components/core/webview/a;)V

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/f/e;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    iget-object v1, p0, Lcom/kwad/components/ad/f/e;->cN:Lcom/kwad/components/core/webview/a;

    const-string v2, "KwaiAd"

    invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/f/e;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    iget-object v1, p0, Lcom/kwad/components/ad/f/e;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/b;->cK(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/webview/KsAdWebView;->loadUrl(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic f(Lcom/kwad/components/ad/f/e;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/f/e;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic g(Lcom/kwad/components/ad/f/e;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kwad/components/ad/f/e;->cP:I

    return p0
.end method

.method private g(Z)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/ad/f/e;->eY:Lcom/kwad/components/core/j/a$b;

    if-eqz p1, :cond_1

    invoke-static {}, Lcom/kwad/components/core/j/a;->pf()Lcom/kwad/components/core/j/a;

    iget-object p1, p0, Lcom/kwad/components/ad/f/e;->eY:Lcom/kwad/components/core/j/a$b;

    invoke-static {p1}, Lcom/kwad/components/core/j/a;->b(Lcom/kwad/components/core/j/a$b;)Z

    move-result p1

    if-nez p1, :cond_1

    return v0

    .line 3
    :cond_1
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->gt()Z

    move-result p1

    const/4 v1, 0x1

    if-nez p1, :cond_4

    .line 4
    iget-object p1, p0, Lcom/kwad/components/ad/f/e;->mContext:Landroid/content/Context;

    invoke-static {p1}, Lcom/kwad/components/core/s/a;->as(Landroid/content/Context;)Lcom/kwad/components/core/s/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/kwad/components/core/s/a;->rB()Z

    move-result p1

    if-nez p1, :cond_2

    .line 5
    iget-object p1, p0, Lcom/kwad/components/ad/f/e;->mContext:Landroid/content/Context;

    invoke-static {p1}, Lcom/kwad/components/core/s/a;->as(Landroid/content/Context;)Lcom/kwad/components/core/s/a;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/s/a;->aN(Z)Z

    move-result p1

    return p1

    .line 6
    :cond_2
    iget-object p1, p0, Lcom/kwad/components/ad/f/e;->mContext:Landroid/content/Context;

    invoke-static {p1}, Lcom/kwad/components/core/s/a;->as(Landroid/content/Context;)Lcom/kwad/components/core/s/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/kwad/components/core/s/a;->rA()Z

    move-result p1

    if-nez p1, :cond_3

    return v1

    :cond_3
    return v0

    .line 7
    :cond_4
    iget-boolean p1, p0, Lcom/kwad/components/ad/f/e;->eQ:Z

    if-nez p1, :cond_5

    .line 8
    iget-object p1, p0, Lcom/kwad/components/ad/f/e;->mContext:Landroid/content/Context;

    invoke-static {p1}, Lcom/kwad/components/core/s/a;->as(Landroid/content/Context;)Lcom/kwad/components/core/s/a;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/kwad/components/core/s/a;->aN(Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/kwad/components/ad/f/e;->eQ:Z

    .line 9
    :cond_5
    iget-boolean p1, p0, Lcom/kwad/components/ad/f/e;->eQ:Z

    return p1
.end method

.method private getClickListener()Lcom/kwad/sdk/core/webview/d/a/a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    new-instance v0, Lcom/kwad/components/ad/f/e$11;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/f/e$11;-><init>(Lcom/kwad/components/ad/f/e;)V

    return-object v0
.end method

.method private getCurrentVoiceItem()Lcom/kwad/components/core/j/a$b;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/f/e;->eY:Lcom/kwad/components/core/j/a$b;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/components/core/j/a$b;

    new-instance v1, Lcom/kwad/components/ad/f/e$4;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/f/e$4;-><init>(Lcom/kwad/components/ad/f/e;)V

    invoke-direct {v0, v1}, Lcom/kwad/components/core/j/a$b;-><init>(Lcom/kwad/components/core/j/a$c;)V

    iput-object v0, p0, Lcom/kwad/components/ad/f/e;->eY:Lcom/kwad/components/core/j/a$b;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/f/e;->eY:Lcom/kwad/components/core/j/a$b;

    return-object v0
.end method

.method private getOpenNewPageListener()Lcom/kwad/components/core/webview/jshandler/ao$a;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/ad/f/e$9;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/f/e$9;-><init>(Lcom/kwad/components/ad/f/e;)V

    return-object v0
.end method

.method private getRegisterLiveListener()Lcom/kwad/components/core/webview/jshandler/ax$c;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/ad/f/e$8;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/f/e$8;-><init>(Lcom/kwad/components/ad/f/e;)V

    return-object v0
.end method

.method static synthetic h(Lcom/kwad/components/ad/f/e;)Lcom/kwad/sdk/core/webview/KsAdWebView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/f/e;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    return-object p0
.end method

.method static synthetic i(Lcom/kwad/components/ad/f/e;)Lcom/kwad/sdk/core/response/model/AdInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/f/e;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    return-object p0
.end method

.method private initView()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/kwad/sdk/R$layout;->ksad_native_live_layout:I

    invoke-static {v0, v1, p0}, Lcom/kwad/sdk/n/l;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 2
    sget v0, Lcom/kwad/sdk/R$id;->ksad_root_container:I

    invoke-virtual {p0, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;

    iput-object v0, p0, Lcom/kwad/components/ad/f/e;->mI:Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;

    .line 3
    sget v1, Lcom/kwad/sdk/R$id;->ksad_live_bg_img:I

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/kwad/components/ad/f/e;->mG:Landroid/widget/ImageView;

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/f/e;->mI:Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_live_container:I

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/widget/KSRelativeLayout;

    iput-object v0, p0, Lcom/kwad/components/ad/f/e;->eL:Lcom/kwad/sdk/widget/KSRelativeLayout;

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/f/e;->mI:Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_live_video_container:I

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/kwad/components/ad/f/e;->mH:Landroid/widget/RelativeLayout;

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/f/e;->mI:Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_web_card_webView:I

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/core/webview/KsAdWebView;

    iput-object v0, p0, Lcom/kwad/components/ad/f/e;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    .line 8
    const-class v0, Lcom/kwad/components/core/n/a/a/a;

    invoke-static {v0}, Lcom/kwad/sdk/components/c;->f(Ljava/lang/Class;)Lcom/kwad/sdk/components/a;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/core/n/a/a/a;

    iput-object v0, p0, Lcom/kwad/components/ad/f/e;->eU:Lcom/kwad/components/core/n/a/a/a;

    return-void
.end method

.method static synthetic j(Lcom/kwad/components/ad/f/e;)Lcom/kwad/components/ad/f/d$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/f/e;->mw:Lcom/kwad/components/ad/f/d$a;

    return-object p0
.end method

.method static synthetic k(Lcom/kwad/components/ad/f/e;)Lcom/kwad/components/core/e/d/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/f/e;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    return-object p0
.end method

.method static synthetic l(Lcom/kwad/components/ad/f/e;)Lcom/kwad/components/offline/api/core/adlive/IAdLiveEndRequest;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/f/e;->ga:Lcom/kwad/components/offline/api/core/adlive/IAdLiveEndRequest;

    return-object p0
.end method

.method static synthetic m(Lcom/kwad/components/ad/f/e;)Lcom/kwad/sdk/api/KsNativeAd$VideoPlayListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/f/e;->mr:Lcom/kwad/sdk/api/KsNativeAd$VideoPlayListener;

    return-object p0
.end method

.method static synthetic n(Lcom/kwad/components/ad/f/e;)Lcom/kwad/sdk/core/network/l;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/f/e;->mNetworking:Lcom/kwad/sdk/core/network/l;

    return-object p0
.end method

.method static synthetic o(Lcom/kwad/components/ad/f/e;)Lcom/kwad/components/core/j/a$b;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/f/e;->getCurrentVoiceItem()Lcom/kwad/components/core/j/a$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic p(Lcom/kwad/components/ad/f/e;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/ad/f/e;->mIsAudioEnable:Z

    return p0
.end method

.method static synthetic q(Lcom/kwad/components/ad/f/e;)Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/f/e;->bi()Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/core/e/d/c;Lcom/kwad/components/core/internal/api/KSAdVideoPlayConfigImpl;)V
    .locals 0
    .param p3    # Lcom/kwad/components/core/e/d/c;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/kwad/components/core/internal/api/KSAdVideoPlayConfigImpl;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 9
    iput-object p2, p0, Lcom/kwad/components/ad/f/e;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 10
    invoke-static {p2}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p2

    iput-object p2, p0, Lcom/kwad/components/ad/f/e;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    .line 11
    iput-object p1, p0, Lcom/kwad/components/ad/f/e;->mContext:Landroid/content/Context;

    .line 12
    iput-object p4, p0, Lcom/kwad/components/ad/f/e;->mJ:Lcom/kwad/components/core/internal/api/KSAdVideoPlayConfigImpl;

    .line 13
    iput-object p3, p0, Lcom/kwad/components/ad/f/e;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    .line 14
    invoke-static {p2}, Lcom/kwad/sdk/core/response/b/a;->bn(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/ad/f/e;->cB:Ljava/util/List;

    .line 15
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-nez p1, :cond_0

    move-object p1, p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    .line 16
    :goto_0
    new-instance p2, Lcom/kwad/components/core/widget/a/b;

    const/16 p3, 0x1e

    invoke-direct {p2, p1, p3}, Lcom/kwad/components/core/widget/a/b;-><init>(Landroid/view/View;I)V

    iput-object p2, p0, Lcom/kwad/components/ad/f/e;->bQ:Lcom/kwad/components/core/widget/a/b;

    .line 17
    iget-object p1, p0, Lcom/kwad/components/ad/f/e;->mJ:Lcom/kwad/components/core/internal/api/KSAdVideoPlayConfigImpl;

    invoke-virtual {p1}, Lcom/kwad/components/core/internal/api/KSAdVideoPlayConfigImpl;->getVideoSoundValue()I

    move-result p1

    if-eqz p1, :cond_1

    .line 18
    iget-object p1, p0, Lcom/kwad/components/ad/f/e;->mJ:Lcom/kwad/components/core/internal/api/KSAdVideoPlayConfigImpl;

    invoke-virtual {p1}, Lcom/kwad/components/core/internal/api/KSAdVideoPlayConfigImpl;->isVideoSoundEnable()Z

    move-result p1

    iput-boolean p1, p0, Lcom/kwad/components/ad/f/e;->mIsAudioEnable:Z

    goto :goto_1

    .line 19
    :cond_1
    iget-object p1, p0, Lcom/kwad/components/ad/f/e;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->bU(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/kwad/components/ad/f/e;->mIsAudioEnable:Z

    .line 20
    :goto_1
    invoke-direct {p0}, Lcom/kwad/components/ad/f/e;->ep()V

    .line 21
    invoke-direct {p0}, Lcom/kwad/components/ad/f/e;->et()V

    return-void
.end method

.method public final aM()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/kwad/components/core/j/a;->pf()Lcom/kwad/components/core/j/a;

    move-result-object v0

    invoke-direct {p0}, Lcom/kwad/components/ad/f/e;->getCurrentVoiceItem()Lcom/kwad/components/core/j/a$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/j/a;->a(Lcom/kwad/components/core/j/a$b;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/f/e;->eV:Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;

    if-nez v0, :cond_0

    .line 3
    invoke-direct {p0}, Lcom/kwad/components/ad/f/e;->bi()Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/f/e;->eV:Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;

    return-void

    .line 4
    :cond_0
    invoke-interface {v0}, Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;->onResume()V

    return-void
.end method

.method public final aN()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/f/e;->eV:Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;->onPause()V

    .line 3
    :cond_0
    invoke-static {}, Lcom/kwad/components/core/j/a;->pf()Lcom/kwad/components/core/j/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/f/e;->eY:Lcom/kwad/components/core/j/a$b;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/j/a;->c(Lcom/kwad/components/core/j/a$b;)V

    return-void
.end method

.method public final ac()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/widget/KSRelativeLayout;->ac()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/f/e;->bQ:Lcom/kwad/components/core/widget/a/b;

    invoke-virtual {v0}, Lcom/kwad/components/core/widget/a/a;->ua()V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/f/e;->bQ:Lcom/kwad/components/core/widget/a/b;

    invoke-virtual {v0, p0}, Lcom/kwad/components/core/widget/a/a;->a(Lcom/kwad/sdk/core/h/c;)V

    return-void
.end method

.method public final ad()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/widget/KSRelativeLayout;->ad()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/f/e;->bQ:Lcom/kwad/components/core/widget/a/b;

    invoke-virtual {v0}, Lcom/kwad/components/core/widget/a/a;->ua()V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/f/e;->bQ:Lcom/kwad/components/core/widget/a/b;

    invoke-virtual {v0, p0}, Lcom/kwad/components/core/widget/a/a;->b(Lcom/kwad/sdk/core/h/c;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/f/e;->eV:Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 5
    invoke-interface {v0}, Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;->onDestroy()V

    .line 6
    iput-object v1, p0, Lcom/kwad/components/ad/f/e;->eV:Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;

    .line 7
    :cond_0
    invoke-static {}, Lcom/kwad/components/core/j/a;->pf()Lcom/kwad/components/core/j/a;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/components/ad/f/e;->eY:Lcom/kwad/components/core/j/a$b;

    invoke-virtual {v0, v2}, Lcom/kwad/components/core/j/a;->c(Lcom/kwad/components/core/j/a$b;)V

    .line 8
    iput-object v1, p0, Lcom/kwad/components/ad/f/e;->fK:Lcom/kwad/components/core/webview/jshandler/ax$a;

    .line 9
    iput-object v1, p0, Lcom/kwad/components/ad/f/e;->fJ:Lcom/kwad/components/core/webview/jshandler/ax$b;

    .line 10
    iget-object v0, p0, Lcom/kwad/components/ad/f/e;->eT:Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;

    if-eqz v0, :cond_1

    .line 11
    invoke-interface {v0}, Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;->onDestroy()V

    .line 12
    iput-object v1, p0, Lcom/kwad/components/ad/f/e;->eT:Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;

    :cond_1
    return-void
.end method

.method public final setInnerAdInteractionListener(Lcom/kwad/components/ad/f/d$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/f/e;->mw:Lcom/kwad/components/ad/f/d$a;

    return-void
.end method

.method public final setVideoPlayListener(Lcom/kwad/sdk/api/KsNativeAd$VideoPlayListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/f/e;->mr:Lcom/kwad/sdk/api/KsNativeAd$VideoPlayListener;

    return-void
.end method
