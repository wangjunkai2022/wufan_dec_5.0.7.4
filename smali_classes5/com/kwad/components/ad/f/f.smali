.class public final Lcom/kwad/components/ad/f/f;
.super Lcom/kwad/sdk/widget/KSFrameLayout;
.source "SourceFile"


# instance fields
.field private bQ:Lcom/kwad/components/core/widget/a/b;

.field private cD:Lcom/kwad/sdk/widget/j;

.field private mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

.field private mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

.field private mDetailVideoView:Lcom/kwad/components/core/video/DetailVideoView;

.field private mI:Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;

.field private mN:Lcom/kwad/components/ad/f/a/b;

.field public mO:Lcom/kwad/components/ad/f/c/a;

.field private mP:Lcom/kwad/sdk/api/KsAdVideoPlayConfig;

.field private mPresenter:Lcom/kwad/sdk/mvp/Presenter;

.field private mr:Lcom/kwad/sdk/api/KsNativeAd$VideoPlayListener;

.field private mw:Lcom/kwad/components/ad/f/d$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/kwad/components/ad/f/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    const/4 p2, 0x0

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/kwad/components/ad/f/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    const/4 p3, 0x0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/kwad/sdk/widget/KSFrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance p2, Lcom/kwad/components/ad/f/f$1;

    invoke-direct {p2, p0}, Lcom/kwad/components/ad/f/f$1;-><init>(Lcom/kwad/components/ad/f/f;)V

    iput-object p2, p0, Lcom/kwad/components/ad/f/f;->cD:Lcom/kwad/sdk/widget/j;

    .line 5
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/f/f;->A(Landroid/content/Context;)V

    return-void
.end method

.method private A(Landroid/content/Context;)V
    .locals 1

    .line 1
    sget v0, Lcom/kwad/sdk/R$layout;->ksad_native_video_layout:I

    invoke-static {p1, v0, p0}, Lcom/kwad/sdk/n/l;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 2
    sget p1, Lcom/kwad/sdk/R$id;->ksad_root_container:I

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;

    iput-object p1, p0, Lcom/kwad/components/ad/f/f;->mI:Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;

    .line 3
    sget v0, Lcom/kwad/sdk/R$id;->ksad_video_player:I

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/kwad/components/core/video/DetailVideoView;

    iput-object p1, p0, Lcom/kwad/components/ad/f/f;->mDetailVideoView:Lcom/kwad/components/core/video/DetailVideoView;

    const/4 v0, 0x1

    .line 4
    invoke-virtual {p1, v0}, Lcom/kwad/components/core/video/DetailVideoView;->setAd(Z)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/f/f;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/f/f;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method private af()Lcom/kwad/sdk/mvp/Presenter;
    .locals 3

    .line 1
    new-instance v0, Lcom/kwad/sdk/mvp/Presenter;

    invoke-direct {v0}, Lcom/kwad/sdk/mvp/Presenter;-><init>()V

    .line 2
    new-instance v1, Lcom/kwad/components/ad/f/b/e;

    invoke-direct {v1}, Lcom/kwad/components/ad/f/b/e;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    .line 3
    new-instance v1, Lcom/kwad/components/ad/f/b/c;

    invoke-direct {v1}, Lcom/kwad/components/ad/f/b/c;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    .line 4
    new-instance v1, Lcom/kwad/components/ad/f/b/i;

    invoke-direct {v1}, Lcom/kwad/components/ad/f/b/i;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    .line 5
    new-instance v1, Lcom/kwad/components/ad/f/b/j;

    invoke-direct {v1}, Lcom/kwad/components/ad/f/b/j;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    .line 6
    new-instance v1, Lcom/kwad/components/ad/f/b/d;

    invoke-direct {v1}, Lcom/kwad/components/ad/f/b/d;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    .line 7
    new-instance v1, Lcom/kwad/components/ad/f/b/b;

    invoke-direct {v1}, Lcom/kwad/components/ad/f/b/b;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    .line 8
    new-instance v1, Lcom/kwad/components/ad/f/b/k;

    invoke-direct {v1}, Lcom/kwad/components/ad/f/b/k;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    .line 9
    new-instance v1, Lcom/kwad/components/ad/f/b/a;

    iget-object v2, p0, Lcom/kwad/components/ad/f/f;->mP:Lcom/kwad/sdk/api/KsAdVideoPlayConfig;

    invoke-direct {v1, v2}, Lcom/kwad/components/ad/f/b/a;-><init>(Lcom/kwad/sdk/api/KsAdVideoPlayConfig;)V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    .line 10
    new-instance v1, Lcom/kwad/components/ad/f/b/g;

    invoke-direct {v1}, Lcom/kwad/components/ad/f/b/g;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    .line 11
    iget-object v1, p0, Lcom/kwad/components/ad/f/f;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->aE(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 12
    new-instance v1, Lcom/kwad/components/ad/f/b/f;

    invoke-direct {v1}, Lcom/kwad/components/ad/f/b/f;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    goto :goto_0

    .line 13
    :cond_0
    new-instance v1, Lcom/kwad/components/ad/f/b/h;

    invoke-direct {v1}, Lcom/kwad/components/ad/f/b/h;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    :goto_0
    return-object v0
.end method

.method static synthetic b(Lcom/kwad/components/ad/f/f;)Lcom/kwad/components/core/widget/a/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/f/f;->bQ:Lcom/kwad/components/core/widget/a/b;

    return-object p0
.end method

.method static synthetic c(Lcom/kwad/components/ad/f/f;)Lcom/kwad/components/ad/f/a/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/f/f;->mN:Lcom/kwad/components/ad/f/a/b;

    return-object p0
.end method

.method static synthetic d(Lcom/kwad/components/ad/f/f;)Lcom/kwad/sdk/mvp/Presenter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/f/f;->mPresenter:Lcom/kwad/sdk/mvp/Presenter;

    return-object p0
.end method

.method private ev()Lcom/kwad/components/ad/f/a/b;
    .locals 3

    .line 1
    new-instance v0, Lcom/kwad/components/ad/f/a/b;

    invoke-direct {v0}, Lcom/kwad/components/ad/f/a/b;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/kwad/components/ad/f/f;->mI:Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;

    iput-object v1, v0, Lcom/kwad/components/ad/f/a/b;->mI:Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;

    .line 3
    iget-object v1, p0, Lcom/kwad/components/ad/f/f;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iput-object v1, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 4
    iget-object v2, p0, Lcom/kwad/components/ad/f/f;->mw:Lcom/kwad/components/ad/f/d$a;

    iput-object v2, v0, Lcom/kwad/components/ad/f/a/b;->mw:Lcom/kwad/components/ad/f/d$a;

    .line 5
    iget-object v2, p0, Lcom/kwad/components/ad/f/f;->mr:Lcom/kwad/sdk/api/KsNativeAd$VideoPlayListener;

    iput-object v2, v0, Lcom/kwad/components/ad/f/a/b;->mr:Lcom/kwad/sdk/api/KsNativeAd$VideoPlayListener;

    .line 6
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->aE(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 7
    iget-object v1, p0, Lcom/kwad/components/ad/f/f;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    if-nez v1, :cond_0

    .line 8
    new-instance v1, Lcom/kwad/components/core/e/d/c;

    iget-object v2, p0, Lcom/kwad/components/ad/f/f;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-direct {v1, v2}, Lcom/kwad/components/core/e/d/c;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    iput-object v1, v0, Lcom/kwad/components/ad/f/a/b;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {v1}, Lcom/kwad/components/core/e/d/c;->ot()V

    .line 10
    iget-object v1, p0, Lcom/kwad/components/ad/f/f;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    iput-object v1, v0, Lcom/kwad/components/ad/f/a/b;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    .line 11
    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/kwad/components/ad/f/f;->mO:Lcom/kwad/components/ad/f/c/a;

    iput-object v1, v0, Lcom/kwad/components/ad/f/a/b;->mO:Lcom/kwad/components/ad/f/c/a;

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/core/e/d/c;Lcom/kwad/sdk/api/KsAdVideoPlayConfig;)V
    .locals 0
    .param p1    # Lcom/kwad/sdk/core/response/model/AdTemplate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/kwad/components/core/e/d/c;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/kwad/sdk/api/KsAdVideoPlayConfig;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 2
    iput-object p1, p0, Lcom/kwad/components/ad/f/f;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 3
    iput-object p2, p0, Lcom/kwad/components/ad/f/f;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    .line 4
    iput-object p3, p0, Lcom/kwad/components/ad/f/f;->mP:Lcom/kwad/sdk/api/KsAdVideoPlayConfig;

    .line 5
    iget-object p1, p0, Lcom/kwad/components/ad/f/f;->mI:Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;

    iget-object p2, p0, Lcom/kwad/components/ad/f/f;->cD:Lcom/kwad/sdk/widget/j;

    invoke-virtual {p1, p2}, Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;->setVisibleListener(Lcom/kwad/sdk/widget/j;)V

    .line 6
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-nez p1, :cond_0

    move-object p1, p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    .line 7
    :goto_0
    new-instance p2, Lcom/kwad/components/core/widget/a/b;

    const/16 p3, 0x1e

    invoke-direct {p2, p1, p3}, Lcom/kwad/components/core/widget/a/b;-><init>(Landroid/view/View;I)V

    iput-object p2, p0, Lcom/kwad/components/ad/f/f;->bQ:Lcom/kwad/components/core/widget/a/b;

    return-void
.end method

.method public final ac()V
    .locals 5

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/widget/KSFrameLayout;->ac()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/f/f;->mO:Lcom/kwad/components/ad/f/c/a;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Lcom/kwad/components/ad/f/c/a;

    iget-object v1, p0, Lcom/kwad/components/ad/f/f;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v2, p0, Lcom/kwad/components/ad/f/f;->bQ:Lcom/kwad/components/core/widget/a/b;

    iget-object v3, p0, Lcom/kwad/components/ad/f/f;->mDetailVideoView:Lcom/kwad/components/core/video/DetailVideoView;

    iget-object v4, p0, Lcom/kwad/components/ad/f/f;->mP:Lcom/kwad/sdk/api/KsAdVideoPlayConfig;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/kwad/components/ad/f/c/a;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/core/widget/a/b;Lcom/kwad/components/core/video/DetailVideoView;Lcom/kwad/sdk/api/KsAdVideoPlayConfig;)V

    iput-object v0, p0, Lcom/kwad/components/ad/f/f;->mO:Lcom/kwad/components/ad/f/c/a;

    .line 4
    :cond_0
    invoke-direct {p0}, Lcom/kwad/components/ad/f/f;->ev()Lcom/kwad/components/ad/f/a/b;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/f/f;->mN:Lcom/kwad/components/ad/f/a/b;

    .line 5
    invoke-direct {p0}, Lcom/kwad/components/ad/f/f;->af()Lcom/kwad/sdk/mvp/Presenter;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/f/f;->mPresenter:Lcom/kwad/sdk/mvp/Presenter;

    .line 6
    iget-object v1, p0, Lcom/kwad/components/ad/f/f;->mI:Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->G(Landroid/view/View;)V

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/f/f;->mPresenter:Lcom/kwad/sdk/mvp/Presenter;

    iget-object v1, p0, Lcom/kwad/components/ad/f/f;->mN:Lcom/kwad/components/ad/f/a/b;

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->k(Ljava/lang/Object;)V

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/f/f;->bQ:Lcom/kwad/components/core/widget/a/b;

    invoke-virtual {v0}, Lcom/kwad/components/core/widget/a/a;->ua()V

    .line 9
    iget-object v0, p0, Lcom/kwad/components/ad/f/f;->mO:Lcom/kwad/components/ad/f/c/a;

    invoke-virtual {v0}, Lcom/kwad/components/ad/f/c/a;->aJ()V

    return-void
.end method

.method public final ad()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/widget/KSFrameLayout;->ad()V

    .line 2
    new-instance v0, Lcom/kwad/components/ad/f/f$2;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/f/f$2;-><init>(Lcom/kwad/components/ad/f/f;)V

    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final setInnerAdInteractionListener(Lcom/kwad/components/ad/f/d$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/f/f;->mw:Lcom/kwad/components/ad/f/d$a;

    return-void
.end method

.method public final setVideoPlayListener(Lcom/kwad/sdk/api/KsNativeAd$VideoPlayListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/f/f;->mr:Lcom/kwad/sdk/api/KsNativeAd$VideoPlayListener;

    return-void
.end method
