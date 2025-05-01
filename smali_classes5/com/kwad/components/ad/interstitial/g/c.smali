.class public final Lcom/kwad/components/ad/interstitial/g/c;
.super Lcom/kwad/components/ad/interstitial/g/a;
.source "SourceFile"


# instance fields
.field private dU:Lcom/kwad/sdk/api/KsAdVideoPlayConfig;

.field protected ie:Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;

.field private io:Lcom/kwad/components/ad/interstitial/d;

.field protected jK:Lcom/kwad/components/ad/interstitial/e/c;

.field private jO:Z

.field private jP:Lcom/kwad/components/ad/interstitial/e/c$a;

.field private jR:Lcom/kwad/components/core/webview/tachikoma/e/e;

.field private jZ:I

.field protected lB:Lcom/kwad/components/ad/interstitial/e/b;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private lC:Z

.field protected lD:Landroid/view/ViewGroup;

.field protected mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

.field protected mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field protected mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/kwad/components/ad/interstitial/g/c;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    const/4 p2, 0x0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/kwad/components/ad/interstitial/g/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, -0x1

    .line 3
    iput p2, p0, Lcom/kwad/components/ad/interstitial/g/c;->jZ:I

    .line 4
    new-instance p2, Lcom/kwad/components/ad/interstitial/g/c$1;

    invoke-direct {p2, p0}, Lcom/kwad/components/ad/interstitial/g/c$1;-><init>(Lcom/kwad/components/ad/interstitial/g/c;)V

    iput-object p2, p0, Lcom/kwad/components/ad/interstitial/g/c;->jR:Lcom/kwad/components/core/webview/tachikoma/e/e;

    .line 5
    invoke-virtual {p0}, Lcom/kwad/components/ad/interstitial/g/c;->getLayoutId()I

    move-result p2

    invoke-static {p1, p2, p0}, Lcom/kwad/sdk/n/l;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/g/c;->lD:Landroid/view/ViewGroup;

    return-void
.end method

.method private a(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdInfo;Lcom/kwad/components/ad/interstitial/e/c;)Lcom/kwad/components/ad/interstitial/g/d;
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/a;->mContext:Landroid/content/Context;

    invoke-static {v0, p2}, Lcom/kwad/components/ad/interstitial/e/c;->a(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    .line 3
    new-instance v1, Lcom/kwad/components/ad/interstitial/g/d$a;

    invoke-direct {v1}, Lcom/kwad/components/ad/interstitial/g/d$a;-><init>()V

    .line 4
    invoke-virtual {v1, v0}, Lcom/kwad/components/ad/interstitial/g/d$a;->v(Z)V

    .line 5
    invoke-virtual {p3, p1}, Lcom/kwad/components/ad/interstitial/e/c;->J(Landroid/content/Context;)Z

    move-result p3

    const/4 v0, 0x1

    const/4 v2, 0x0

    if-nez p3, :cond_0

    .line 6
    invoke-static {}, Lcom/kwad/components/ad/interstitial/b/b;->cF()Z

    move-result p3

    if-eqz p3, :cond_0

    const/4 p3, 0x1

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    invoke-virtual {v1, p3}, Lcom/kwad/components/ad/interstitial/g/d$a;->w(Z)V

    .line 7
    invoke-static {}, Lcom/kwad/components/ad/interstitial/b/b;->cG()I

    move-result p3

    invoke-virtual {v1, p3}, Lcom/kwad/components/ad/interstitial/g/d$a;->F(I)V

    .line 8
    invoke-static {p2}, Lcom/kwad/sdk/core/response/b/a;->aV(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 9
    invoke-static {}, Lcom/kwad/sdk/utils/aj;->ML()Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    .line 10
    :cond_2
    :goto_1
    invoke-virtual {v1, v0}, Lcom/kwad/components/ad/interstitial/g/d$a;->x(Z)V

    .line 11
    new-instance p2, Lcom/kwad/components/ad/interstitial/g/d;

    invoke-direct {p2, p1, v1}, Lcom/kwad/components/ad/interstitial/g/d;-><init>(Landroid/content/Context;Lcom/kwad/components/ad/interstitial/g/d$a;)V

    return-object p2
.end method

.method static synthetic a(Lcom/kwad/components/ad/interstitial/g/c;Z)Z
    .locals 0

    const/4 p1, 0x0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/ad/interstitial/g/c;->lC:Z

    return p1
.end method

.method private dY()Lcom/kwad/components/ad/interstitial/e/c;
    .locals 4

    .line 1
    new-instance v0, Lcom/kwad/components/ad/interstitial/e/c;

    invoke-direct {v0}, Lcom/kwad/components/ad/interstitial/e/c;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/g/c;->mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/interstitial/e/c;->d(Lcom/kwad/sdk/core/response/model/AdResultData;)V

    .line 3
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/g/c;->ie:Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;

    iput-object v1, v0, Lcom/kwad/components/ad/interstitial/e/c;->ie:Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;

    .line 4
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/g/c;->io:Lcom/kwad/components/ad/interstitial/d;

    iput-object v1, v0, Lcom/kwad/components/ad/interstitial/e/c;->io:Lcom/kwad/components/ad/interstitial/d;

    .line 5
    new-instance v1, Lcom/kwad/components/core/e/d/c;

    iget-object v2, p0, Lcom/kwad/components/ad/interstitial/g/c;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-direct {v1, v2}, Lcom/kwad/components/core/e/d/c;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    iput-object v1, v0, Lcom/kwad/components/ad/interstitial/e/c;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    .line 6
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/g/c;->dU:Lcom/kwad/sdk/api/KsAdVideoPlayConfig;

    iput-object v1, v0, Lcom/kwad/components/ad/interstitial/e/c;->dU:Lcom/kwad/sdk/api/KsAdVideoPlayConfig;

    .line 7
    new-instance v1, Lcom/kwad/sdk/core/video/videoview/a;

    iget-object v2, p0, Lcom/kwad/components/ad/interstitial/g/a;->mContext:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/kwad/sdk/core/video/videoview/a;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, Lcom/kwad/components/ad/interstitial/e/c;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    .line 8
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/g/c;->lD:Landroid/view/ViewGroup;

    sget v2, Lcom/kwad/sdk/R$id;->ksad_container:I

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/kwad/sdk/widget/KSFrameLayout;

    iput-object v1, v0, Lcom/kwad/components/ad/interstitial/e/c;->jS:Lcom/kwad/sdk/widget/KSFrameLayout;

    .line 9
    new-instance v2, Lcom/kwad/components/ad/interstitial/f/b;

    .line 10
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->Cp()I

    move-result v3

    invoke-direct {v2, v1, v3}, Lcom/kwad/components/ad/interstitial/f/b;-><init>(Landroid/view/View;I)V

    iput-object v2, v0, Lcom/kwad/components/ad/interstitial/e/c;->ib:Lcom/kwad/components/ad/interstitial/f/b;

    .line 11
    invoke-virtual {v2}, Lcom/kwad/components/core/widget/a/a;->ua()V

    .line 12
    iget v1, p0, Lcom/kwad/components/ad/interstitial/g/c;->jZ:I

    iput v1, v0, Lcom/kwad/components/ad/interstitial/e/c;->jZ:I

    .line 13
    iget-boolean v1, p0, Lcom/kwad/components/ad/interstitial/g/c;->jO:Z

    iput-boolean v1, v0, Lcom/kwad/components/ad/interstitial/e/c;->jO:Z

    .line 14
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/g/c;->jP:Lcom/kwad/components/ad/interstitial/e/c$a;

    iput-object v1, v0, Lcom/kwad/components/ad/interstitial/e/c;->jP:Lcom/kwad/components/ad/interstitial/e/c$a;

    .line 15
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/g/c;->jR:Lcom/kwad/components/core/webview/tachikoma/e/e;

    iput-object v1, v0, Lcom/kwad/components/ad/interstitial/e/c;->jR:Lcom/kwad/components/core/webview/tachikoma/e/e;

    .line 16
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/g/c;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v1

    .line 17
    iget-object v2, p0, Lcom/kwad/components/ad/interstitial/g/a;->mContext:Landroid/content/Context;

    .line 18
    invoke-direct {p0, v2, v1, v0}, Lcom/kwad/components/ad/interstitial/g/c;->a(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdInfo;Lcom/kwad/components/ad/interstitial/e/c;)Lcom/kwad/components/ad/interstitial/g/d;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/components/ad/interstitial/e/c;->jL:Lcom/kwad/components/ad/interstitial/g/d;

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/kwad/sdk/core/response/model/AdResultData;Lcom/kwad/components/ad/interstitial/d;Lcom/kwad/sdk/api/KsAdVideoPlayConfig;Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;)V
    .locals 1
    .param p1    # Lcom/kwad/sdk/core/response/model/AdResultData;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/kwad/sdk/api/KsAdVideoPlayConfig;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 12
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/g/c;->mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;

    .line 13
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/c;->n(Lcom/kwad/sdk/core/response/model/AdResultData;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/g/c;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 14
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/g/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    .line 15
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/c;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v0, 0x2

    iput v0, p1, Lcom/kwad/sdk/core/response/model/AdTemplate;->realShowType:I

    .line 16
    iput-object p3, p0, Lcom/kwad/components/ad/interstitial/g/c;->dU:Lcom/kwad/sdk/api/KsAdVideoPlayConfig;

    .line 17
    iput-object p2, p0, Lcom/kwad/components/ad/interstitial/g/c;->io:Lcom/kwad/components/ad/interstitial/d;

    .line 18
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/b;->cU(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/kwad/components/ad/interstitial/g/c;->lC:Z

    .line 19
    iput-object p4, p0, Lcom/kwad/components/ad/interstitial/g/c;->ie:Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;

    .line 20
    invoke-direct {p0}, Lcom/kwad/components/ad/interstitial/g/c;->dY()Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/g/c;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    .line 21
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/c;->lB:Lcom/kwad/components/ad/interstitial/e/b;

    if-nez p1, :cond_0

    .line 22
    invoke-virtual {p0}, Lcom/kwad/components/ad/interstitial/g/c;->dZ()Lcom/kwad/components/ad/interstitial/e/b;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/g/c;->lB:Lcom/kwad/components/ad/interstitial/e/b;

    .line 23
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/c;->lB:Lcom/kwad/components/ad/interstitial/e/b;

    iget-object p2, p0, Lcom/kwad/components/ad/interstitial/g/c;->lD:Landroid/view/ViewGroup;

    invoke-virtual {p1, p2}, Lcom/kwad/sdk/mvp/Presenter;->G(Landroid/view/View;)V

    .line 24
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/c;->lB:Lcom/kwad/components/ad/interstitial/e/b;

    iget-object p2, p0, Lcom/kwad/components/ad/interstitial/g/c;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    invoke-virtual {p1, p2}, Lcom/kwad/sdk/mvp/Presenter;->k(Ljava/lang/Object;)V

    return-void
.end method

.method public final cr()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/c;->lB:Lcom/kwad/components/ad/interstitial/e/b;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/ad/interstitial/e/b;->cP()V

    :cond_0
    return-void
.end method

.method public final cs()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/c;->lB:Lcom/kwad/components/ad/interstitial/e/b;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/ad/interstitial/e/b;->cQ()V

    :cond_0
    return-void
.end method

.method public final dZ()Lcom/kwad/components/ad/interstitial/e/b;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    new-instance v0, Lcom/kwad/components/ad/interstitial/e/b;

    invoke-direct {v0}, Lcom/kwad/components/ad/interstitial/e/b;-><init>()V

    .line 2
    iget-boolean v1, p0, Lcom/kwad/components/ad/interstitial/g/c;->lC:Z

    if-eqz v1, :cond_0

    .line 3
    new-instance v1, Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-direct {v1}, Lcom/kwad/components/ad/interstitial/e/a/b;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/g/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->bb(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 5
    new-instance v1, Lcom/kwad/components/ad/interstitial/e/f;

    invoke-direct {v1}, Lcom/kwad/components/ad/interstitial/e/f;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    .line 6
    :cond_1
    new-instance v1, Lcom/kwad/components/ad/interstitial/e/g;

    invoke-direct {v1}, Lcom/kwad/components/ad/interstitial/e/g;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    .line 7
    new-instance v1, Lcom/kwad/components/ad/interstitial/e/d;

    invoke-direct {v1}, Lcom/kwad/components/ad/interstitial/e/d;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    .line 8
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/g/c;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->aO(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 9
    new-instance v1, Lcom/kwad/components/ad/interstitial/e/a;

    invoke-direct {v1}, Lcom/kwad/components/ad/interstitial/e/a;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    .line 10
    :cond_2
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/g/c;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/kwad/components/ad/interstitial/e/c;->J(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 11
    new-instance v1, Lcom/kwad/components/ad/interstitial/e/e;

    invoke-direct {v1}, Lcom/kwad/components/ad/interstitial/e/e;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    :cond_3
    :goto_0
    return-object v0
.end method

.method public final ea()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/c;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    if-eqz v0, :cond_0

    iget-boolean v1, v0, Lcom/kwad/components/ad/interstitial/e/c;->jX:Z

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/ad/interstitial/e/c;->cS()V

    :cond_0
    return-void
.end method

.method public final eb()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/c;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    if-eqz v0, :cond_1

    .line 2
    iget-boolean v1, p0, Lcom/kwad/components/ad/interstitial/g/c;->lC:Z

    if-nez v1, :cond_0

    iget-boolean v1, v0, Lcom/kwad/components/ad/interstitial/e/c;->jX:Z

    if-eqz v1, :cond_1

    .line 3
    :cond_0
    invoke-virtual {v0}, Lcom/kwad/components/ad/interstitial/e/c;->cT()V

    :cond_1
    return-void
.end method

.method public final ec()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/c;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/components/ad/interstitial/e/c$b;

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/g/a;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/kwad/components/ad/interstitial/e/c$b;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    .line 3
    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/interstitial/e/c$b;->k(Z)Lcom/kwad/components/ad/interstitial/e/c$b;

    move-result-object v0

    .line 4
    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/interstitial/e/c$b;->A(I)Lcom/kwad/components/ad/interstitial/e/c$b;

    move-result-object v0

    .line 5
    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/interstitial/e/c$b;->m(Z)Lcom/kwad/components/ad/interstitial/e/c$b;

    move-result-object v0

    const/4 v1, 0x2

    .line 6
    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/interstitial/e/c$b;->z(I)Lcom/kwad/components/ad/interstitial/e/c$b;

    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/g/c;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    invoke-virtual {v1, v0}, Lcom/kwad/components/ad/interstitial/e/c;->a(Lcom/kwad/components/ad/interstitial/e/c$b;)V

    :cond_0
    return-void
.end method

.method public final ed()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/c;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    if-eqz v0, :cond_0

    .line 2
    iget-boolean v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->jY:Z

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method protected final getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/kwad/sdk/R$layout;->ksad_interstitial:I

    return v0
.end method

.method protected final onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/c;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/kwad/components/ad/interstitial/e/c;->release()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/c;->lB:Lcom/kwad/components/ad/interstitial/e/b;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0}, Lcom/kwad/sdk/mvp/Presenter;->destroy()V

    :cond_1
    return-void
.end method

.method public final setAdConvertListener(Lcom/kwad/components/ad/interstitial/e/c$a;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/g/c;->jP:Lcom/kwad/components/ad/interstitial/e/c$a;

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/c;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    if-eqz v0, :cond_0

    .line 3
    iput-object p1, v0, Lcom/kwad/components/ad/interstitial/e/c;->jP:Lcom/kwad/components/ad/interstitial/e/c$a;

    :cond_0
    return-void
.end method

.method public final setAdInteractionListener(Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/g/c;->ie:Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/c;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    if-eqz v0, :cond_0

    .line 3
    iput-object p1, v0, Lcom/kwad/components/ad/interstitial/e/c;->ie:Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;

    :cond_0
    return-void
.end method

.method public final setAggregateAdView(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/ad/interstitial/g/c;->jO:Z

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/c;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    if-eqz v0, :cond_0

    .line 3
    iput-boolean p1, v0, Lcom/kwad/components/ad/interstitial/e/c;->jO:Z

    :cond_0
    return-void
.end method

.method public final setAggregateShowTriggerType(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/kwad/components/ad/interstitial/g/c;->jZ:I

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/c;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    if-eqz v0, :cond_0

    .line 3
    iput p1, v0, Lcom/kwad/components/ad/interstitial/e/c;->jZ:I

    :cond_0
    return-void
.end method
