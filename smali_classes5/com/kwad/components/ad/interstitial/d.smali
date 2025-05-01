.class public final Lcom/kwad/components/ad/interstitial/d;
.super Lcom/kwad/components/core/proxy/d;
.source "SourceFile"


# instance fields
.field private hZ:Lcom/kwad/components/ad/interstitial/g/a;

.field private ia:Z

.field private ib:Lcom/kwad/components/ad/interstitial/f/b;

.field private final ic:Lcom/kwad/sdk/api/KsAdVideoPlayConfig;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private ie:Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;

.field private final if:Lcom/kwad/components/core/widget/g;

.field private final mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;

.field private final mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

.field private mTimerHelper:Lcom/kwad/sdk/utils/bn;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/kwad/sdk/core/response/model/AdResultData;Lcom/kwad/sdk/api/KsVideoPlayConfig;Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;)V
    .locals 0
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/kwad/sdk/core/response/model/AdResultData;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/components/core/proxy/d;-><init>(Landroid/app/Activity;)V

    .line 2
    new-instance p1, Lcom/kwad/components/ad/interstitial/d$1;

    invoke-direct {p1, p0}, Lcom/kwad/components/ad/interstitial/d$1;-><init>(Lcom/kwad/components/ad/interstitial/d;)V

    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/d;->if:Lcom/kwad/components/core/widget/g;

    .line 3
    iput-object p4, p0, Lcom/kwad/components/ad/interstitial/d;->ie:Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;

    .line 4
    new-instance p1, Lcom/kwad/sdk/api/KsAdVideoPlayConfig$Builder;

    invoke-direct {p1}, Lcom/kwad/sdk/api/KsAdVideoPlayConfig$Builder;-><init>()V

    if-eqz p3, :cond_0

    .line 5
    invoke-interface {p3}, Lcom/kwad/sdk/api/KsVideoPlayConfig;->isVideoSoundEnable()Z

    move-result p3

    if-eqz p3, :cond_0

    const/4 p3, 0x1

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    invoke-virtual {p1, p3}, Lcom/kwad/sdk/api/KsAdVideoPlayConfig$Builder;->videoSoundEnable(Z)Lcom/kwad/sdk/api/KsAdVideoPlayConfig$Builder;

    move-result-object p1

    .line 6
    invoke-static {}, Lcom/kwad/components/ad/interstitial/b/b;->cE()Z

    move-result p3

    invoke-virtual {p1, p3}, Lcom/kwad/sdk/api/KsAdVideoPlayConfig$Builder;->dataFlowAutoStart(Z)Lcom/kwad/sdk/api/KsAdVideoPlayConfig$Builder;

    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lcom/kwad/sdk/api/KsAdVideoPlayConfig$Builder;->build()Lcom/kwad/sdk/api/KsAdVideoPlayConfig;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/d;->ic:Lcom/kwad/sdk/api/KsAdVideoPlayConfig;

    .line 8
    iput-object p2, p0, Lcom/kwad/components/ad/interstitial/d;->mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;

    .line 9
    invoke-static {p2}, Lcom/kwad/sdk/core/response/b/c;->n(Lcom/kwad/sdk/core/response/model/AdResultData;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/d;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/interstitial/d;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/ad/interstitial/d;->ia:Z

    return p0
.end method

.method static synthetic b(Lcom/kwad/components/ad/interstitial/d;)Landroid/app/Activity;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/proxy/d;->mActivity:Landroid/app/Activity;

    return-object p0
.end method

.method static synthetic c(Lcom/kwad/components/ad/interstitial/d;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/d;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method private cl()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/d;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->cs(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-direct {p0}, Lcom/kwad/components/ad/interstitial/d;->cm()Z

    move-result v1

    if-nez v1, :cond_0

    .line 4
    invoke-static {}, Lcom/kwad/components/ad/interstitial/c/a;->cM()I

    move-result v1

    .line 5
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->cv(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v0

    if-ge v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private cm()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/d;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/b;->ci(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-static {}, Lcom/kwad/components/ad/interstitial/d/a;->cO()I

    move-result v0

    sget-object v2, Lcom/kwad/sdk/core/config/c;->asE:Lcom/kwad/sdk/core/config/item/k;

    .line 3
    invoke-static {v2}, Lcom/kwad/sdk/core/config/d;->a(Lcom/kwad/sdk/core/config/item/k;)I

    move-result v2

    if-ge v0, v2, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    return v1
.end method

.method private cn()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/interstitial/d;->cl()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/components/ad/interstitial/aggregate/b;

    iget-object v1, p0, Lcom/kwad/components/core/proxy/d;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/kwad/components/ad/interstitial/aggregate/b;-><init>(Landroid/content/Context;)V

    goto :goto_0

    .line 3
    :cond_0
    new-instance v0, Lcom/kwad/components/ad/interstitial/g/c;

    iget-object v1, p0, Lcom/kwad/components/core/proxy/d;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/kwad/components/ad/interstitial/g/c;-><init>(Landroid/content/Context;)V

    :goto_0
    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/d;->hZ:Lcom/kwad/components/ad/interstitial/g/a;

    .line 4
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/d;->mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;

    iget-object v2, p0, Lcom/kwad/components/ad/interstitial/d;->ic:Lcom/kwad/sdk/api/KsAdVideoPlayConfig;

    iget-object v3, p0, Lcom/kwad/components/ad/interstitial/d;->ie:Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;

    invoke-virtual {v0, v1, p0, v2, v3}, Lcom/kwad/components/ad/interstitial/g/a;->a(Lcom/kwad/sdk/core/response/model/AdResultData;Lcom/kwad/components/ad/interstitial/d;Lcom/kwad/sdk/api/KsAdVideoPlayConfig;Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/core/proxy/d;->zh:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/core/proxy/d;->zh:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/d;->hZ:Lcom/kwad/components/ad/interstitial/g/a;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 7
    invoke-direct {p0}, Lcom/kwad/components/ad/interstitial/d;->co()V

    return-void
.end method

.method private co()V
    .locals 3

    .line 1
    new-instance v0, Lcom/kwad/components/ad/interstitial/f/b;

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/d;->hZ:Lcom/kwad/components/ad/interstitial/g/a;

    const/16 v2, 0x64

    invoke-direct {v0, v1, v2}, Lcom/kwad/components/ad/interstitial/f/b;-><init>(Landroid/view/View;I)V

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/d;->ib:Lcom/kwad/components/ad/interstitial/f/b;

    .line 2
    new-instance v1, Lcom/kwad/components/ad/interstitial/d$2;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/interstitial/d$2;-><init>(Lcom/kwad/components/ad/interstitial/d;)V

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/widget/a/a;->a(Lcom/kwad/sdk/core/h/c;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/d;->ib:Lcom/kwad/components/ad/interstitial/f/b;

    invoke-virtual {v0}, Lcom/kwad/components/core/widget/a/a;->ua()V

    return-void
.end method

.method static synthetic d(Lcom/kwad/components/ad/interstitial/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/interstitial/d;->cn()V

    return-void
.end method


# virtual methods
.method public final cj()F
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ck()Landroid/view/ViewGroup;
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/components/core/widget/f;

    iget-object v1, p0, Lcom/kwad/components/core/proxy/d;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/kwad/components/core/widget/f;-><init>(Landroid/content/Context;)V

    .line 2
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/d;->if:Lcom/kwad/components/core/widget/g;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/widget/f;->setOrientationChangeListener(Lcom/kwad/components/core/widget/g;)V

    return-object v0
.end method

.method public final dismiss()V
    .locals 3

    .line 1
    :try_start_0
    invoke-super {p0}, Lcom/kwad/components/core/proxy/d;->dismiss()V

    .line 2
    invoke-static {}, Lcom/kwad/sdk/a/a/c;->Au()Lcom/kwad/sdk/a/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/sdk/a/a/c;->Ax()V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/d;->ie:Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;

    if-eqz v0, :cond_0

    .line 4
    invoke-interface {v0}, Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;->onPageDismiss()V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/d;->hZ:Lcom/kwad/components/ad/interstitial/g/a;

    instance-of v1, v0, Lcom/kwad/components/ad/interstitial/g/c;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/kwad/components/ad/interstitial/g/c;

    .line 6
    invoke-virtual {v0}, Lcom/kwad/components/ad/interstitial/g/c;->ed()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/d;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 7
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->cN(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/d;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 9
    invoke-virtual {p0}, Lcom/kwad/components/ad/interstitial/d;->getTimerHelper()Lcom/kwad/sdk/utils/bn;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kwad/sdk/utils/bn;->getTime()J

    move-result-wide v1

    long-to-float v1, v1

    const/high16 v2, 0x447a0000    # 1000.0f

    div-float/2addr v1, v2

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-int v1, v1

    .line 10
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/adlog/c;->m(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    .line 11
    :cond_1
    invoke-static {}, Lcom/kwad/components/core/e/a/h;->nL()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 12
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final g(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/app/AlertDialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-static {p1}, Lcom/kwad/components/core/e/a/h;->a(Landroid/view/Window;)V

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/ad/interstitial/d;->cn()V

    .line 3
    invoke-static {}, Lcom/kwad/components/ad/interstitial/report/c;->dR()Lcom/kwad/components/ad/interstitial/report/c;

    move-result-object p1

    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/d;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {p1, v0}, Lcom/kwad/components/ad/interstitial/report/c;->r(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 4
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/d;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {p1}, Lcom/kwad/sdk/commercial/d/c;->bA(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void
.end method

.method public final getLayoutId()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getTimerHelper()Lcom/kwad/sdk/utils/bn;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/d;->mTimerHelper:Lcom/kwad/sdk/utils/bn;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/sdk/utils/bn;

    invoke-direct {v0}, Lcom/kwad/sdk/utils/bn;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/d;->mTimerHelper:Lcom/kwad/sdk/utils/bn;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/d;->mTimerHelper:Lcom/kwad/sdk/utils/bn;

    return-object v0
.end method

.method public final onBackPressed()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/components/ad/interstitial/b/b;->cI()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-super {p0}, Landroid/app/AlertDialog;->onBackPressed()V

    :cond_0
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/AlertDialog;->onDetachedFromWindow()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/d;->ib:Lcom/kwad/components/ad/interstitial/f/b;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/kwad/components/core/widget/a/a;->release()V

    :cond_0
    return-void
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/app/AlertDialog;->onWindowFocusChanged(Z)V

    .line 2
    iput-boolean p1, p0, Lcom/kwad/components/ad/interstitial/d;->ia:Z

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/d;->hZ:Lcom/kwad/components/ad/interstitial/g/a;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/kwad/components/ad/interstitial/g/a;->cr()V

    return-void

    .line 5
    :cond_0
    invoke-virtual {v0}, Lcom/kwad/components/ad/interstitial/g/a;->cs()V

    :cond_1
    return-void
.end method

.method public final setAdInteractionListener(Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/d;->ie:Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/d;->hZ:Lcom/kwad/components/ad/interstitial/g/a;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Lcom/kwad/components/ad/interstitial/g/a;->setAdInteractionListener(Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;)V

    :cond_0
    return-void
.end method
