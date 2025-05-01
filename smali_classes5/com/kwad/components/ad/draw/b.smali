.class public final Lcom/kwad/components/ad/draw/b;
.super Lcom/kwad/sdk/widget/KSFrameLayout;
.source "SourceFile"


# instance fields
.field private bN:Lcom/kwad/sdk/api/KsDrawAd$AdInteractionListener;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private bO:Lcom/kwad/components/ad/draw/a/b;

.field private bP:Lcom/kwad/components/ad/draw/c/a;

.field private bQ:Lcom/kwad/components/core/widget/a/b;

.field private bR:Z

.field private bS:Landroid/widget/ImageView;

.field private bT:Lcom/kwad/sdk/core/h/b;

.field private bU:Landroid/view/View$OnClickListener;

.field private bV:Lcom/kwad/components/core/video/k;

.field private mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

.field private mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private mContext:Landroid/content/Context;

.field private mDetailVideoView:Lcom/kwad/components/core/video/DetailVideoView;

.field private mPresenter:Lcom/kwad/sdk/mvp/Presenter;

.field private mRootContainer:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/sdk/widget/KSFrameLayout;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance v0, Lcom/kwad/components/ad/draw/b$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/draw/b$1;-><init>(Lcom/kwad/components/ad/draw/b;)V

    iput-object v0, p0, Lcom/kwad/components/ad/draw/b;->bU:Landroid/view/View$OnClickListener;

    .line 3
    new-instance v0, Lcom/kwad/components/ad/draw/b$2;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/draw/b$2;-><init>(Lcom/kwad/components/ad/draw/b;)V

    iput-object v0, p0, Lcom/kwad/components/ad/draw/b;->bV:Lcom/kwad/components/core/video/k;

    .line 4
    iput-object p1, p0, Lcom/kwad/components/ad/draw/b;->mContext:Landroid/content/Context;

    .line 5
    invoke-direct {p0}, Lcom/kwad/components/ad/draw/b;->initView()V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/draw/b;)Lcom/kwad/components/ad/draw/a/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/draw/b;->bO:Lcom/kwad/components/ad/draw/a/b;

    return-object p0
.end method

.method private ab()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b;->bP:Lcom/kwad/components/ad/draw/c/a;

    iget-boolean v1, p0, Lcom/kwad/components/ad/draw/b;->bR:Z

    xor-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/draw/c/a;->f(Z)V

    .line 2
    iget-boolean v0, p0, Lcom/kwad/components/ad/draw/b;->bR:Z

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b;->bP:Lcom/kwad/components/ad/draw/c/a;

    invoke-virtual {v0}, Lcom/kwad/components/ad/k/b;->pause()V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b;->bP:Lcom/kwad/components/ad/draw/c/a;

    invoke-virtual {v0}, Lcom/kwad/components/ad/draw/c/a;->resume()V

    .line 5
    :goto_0
    iget-boolean v0, p0, Lcom/kwad/components/ad/draw/b;->bR:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Lcom/kwad/components/ad/draw/b;->bR:Z

    return-void
.end method

.method private ae()Lcom/kwad/components/ad/draw/a/b;
    .locals 3

    .line 1
    new-instance v0, Lcom/kwad/components/ad/draw/a/b;

    invoke-direct {v0}, Lcom/kwad/components/ad/draw/a/b;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/kwad/components/ad/draw/b;->bN:Lcom/kwad/sdk/api/KsDrawAd$AdInteractionListener;

    iput-object v1, v0, Lcom/kwad/components/ad/draw/a/b;->bN:Lcom/kwad/sdk/api/KsDrawAd$AdInteractionListener;

    .line 3
    iget-object v1, p0, Lcom/kwad/components/ad/draw/b;->mRootContainer:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    iput-object v1, v0, Lcom/kwad/components/ad/draw/a/b;->mRootContainer:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    .line 4
    iget-object v1, p0, Lcom/kwad/components/ad/draw/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iput-object v1, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 5
    iget-object v1, p0, Lcom/kwad/components/ad/draw/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->aE(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 6
    new-instance v1, Lcom/kwad/components/core/e/d/c;

    iget-object v2, p0, Lcom/kwad/components/ad/draw/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-direct {v1, v2}, Lcom/kwad/components/core/e/d/c;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    iput-object v1, v0, Lcom/kwad/components/ad/draw/a/b;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    .line 7
    :cond_0
    iget-object v1, p0, Lcom/kwad/components/ad/draw/b;->bP:Lcom/kwad/components/ad/draw/c/a;

    iput-object v1, v0, Lcom/kwad/components/ad/draw/a/b;->bP:Lcom/kwad/components/ad/draw/c/a;

    .line 8
    new-instance v1, Lcom/kwad/components/ad/draw/b/b/a;

    iget-object v2, p0, Lcom/kwad/components/ad/draw/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-direct {v1, v2}, Lcom/kwad/components/ad/draw/b/b/a;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    iput-object v1, v0, Lcom/kwad/components/ad/draw/a/b;->ch:Lcom/kwad/components/ad/draw/b/b/a;

    .line 9
    iget-object v1, p0, Lcom/kwad/components/ad/draw/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/b;->cB(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 10
    new-instance v1, Lcom/kwad/components/ad/l/b;

    invoke-direct {v1}, Lcom/kwad/components/ad/l/b;-><init>()V

    iput-object v1, v0, Lcom/kwad/components/ad/draw/a/b;->ci:Lcom/kwad/components/ad/l/b;

    :cond_1
    return-object v0
.end method

.method private af()Lcom/kwad/sdk/mvp/Presenter;
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/sdk/mvp/Presenter;

    invoke-direct {v0}, Lcom/kwad/sdk/mvp/Presenter;-><init>()V

    .line 2
    new-instance v1, Lcom/kwad/components/ad/draw/b/a/a;

    invoke-direct {v1}, Lcom/kwad/components/ad/draw/b/a/a;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    .line 3
    new-instance v1, Lcom/kwad/components/ad/draw/b/b;

    invoke-direct {v1}, Lcom/kwad/components/ad/draw/b/b;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    .line 4
    new-instance v1, Lcom/kwad/components/ad/draw/b/d;

    invoke-direct {v1}, Lcom/kwad/components/ad/draw/b/d;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    .line 5
    new-instance v1, Lcom/kwad/components/ad/draw/b/c;

    invoke-direct {v1}, Lcom/kwad/components/ad/draw/b/c;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    .line 6
    new-instance v1, Lcom/kwad/components/ad/draw/b/b/b;

    invoke-direct {v1}, Lcom/kwad/components/ad/draw/b/b/b;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    .line 7
    iget-object v1, p0, Lcom/kwad/components/ad/draw/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/b;->co(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 8
    new-instance v1, Lcom/kwad/components/ad/draw/b/b/c;

    invoke-direct {v1}, Lcom/kwad/components/ad/draw/b/b/c;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    .line 9
    :cond_0
    new-instance v1, Lcom/kwad/components/ad/draw/b/c/a;

    invoke-direct {v1}, Lcom/kwad/components/ad/draw/b/c/a;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    .line 10
    iget-object v1, p0, Lcom/kwad/components/ad/draw/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/b;->cB(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 11
    new-instance v1, Lcom/kwad/components/ad/draw/b/c/b;

    invoke-direct {v1}, Lcom/kwad/components/ad/draw/b/c/b;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    .line 12
    :cond_1
    iget-object v1, p0, Lcom/kwad/components/ad/draw/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->aO(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 13
    new-instance v1, Lcom/kwad/components/ad/draw/b/a;

    invoke-direct {v1}, Lcom/kwad/components/ad/draw/b/a;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    :cond_2
    return-object v0
.end method

.method static synthetic b(Lcom/kwad/components/ad/draw/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/draw/b;->ab()V

    return-void
.end method

.method static synthetic c(Lcom/kwad/components/ad/draw/b;)Landroid/widget/ImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/draw/b;->bS:Landroid/widget/ImageView;

    return-object p0
.end method

.method private initView()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b;->mContext:Landroid/content/Context;

    sget v1, Lcom/kwad/sdk/R$layout;->ksad_draw_layout:I

    invoke-static {v0, v1, p0}, Lcom/kwad/sdk/n/l;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 2
    sget v0, Lcom/kwad/sdk/R$id;->ksad_root_container:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    iput-object v0, p0, Lcom/kwad/components/ad/draw/b;->mRootContainer:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    .line 3
    sget v1, Lcom/kwad/sdk/R$id;->ksad_video_control_button:I

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/kwad/components/ad/draw/b;->bS:Landroid/widget/ImageView;

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b;->mRootContainer:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_video_player:I

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/core/video/DetailVideoView;

    iput-object v0, p0, Lcom/kwad/components/ad/draw/b;->mDetailVideoView:Lcom/kwad/components/core/video/DetailVideoView;

    .line 5
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->Dm()I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Lcom/kwad/components/core/video/DetailVideoView;->g(ZI)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b;->mDetailVideoView:Lcom/kwad/components/core/video/DetailVideoView;

    iget-object v1, p0, Lcom/kwad/components/ad/draw/b;->bU:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b;->bS:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/kwad/components/ad/draw/b;->bU:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 3
    .param p1    # Lcom/kwad/sdk/core/response/model/AdTemplate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    iput-object p1, p0, Lcom/kwad/components/ad/draw/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 3
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/ad/draw/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    .line 4
    new-instance p1, Lcom/kwad/components/core/widget/a/b;

    const/16 v0, 0x46

    invoke-direct {p1, p0, v0}, Lcom/kwad/components/core/widget/a/b;-><init>(Landroid/view/View;I)V

    iput-object p1, p0, Lcom/kwad/components/ad/draw/b;->bQ:Lcom/kwad/components/core/widget/a/b;

    .line 5
    new-instance v0, Lcom/kwad/components/ad/draw/c/a;

    iget-object v1, p0, Lcom/kwad/components/ad/draw/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v2, p0, Lcom/kwad/components/ad/draw/b;->mDetailVideoView:Lcom/kwad/components/core/video/DetailVideoView;

    invoke-direct {v0, v1, p1, v2}, Lcom/kwad/components/ad/draw/c/a;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/core/widget/a/b;Lcom/kwad/components/core/video/DetailVideoView;)V

    iput-object v0, p0, Lcom/kwad/components/ad/draw/b;->bP:Lcom/kwad/components/ad/draw/c/a;

    return-void
.end method

.method public final ac()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/widget/KSFrameLayout;->ac()V

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/ad/draw/b;->ae()Lcom/kwad/components/ad/draw/a/b;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/draw/b;->bO:Lcom/kwad/components/ad/draw/a/b;

    .line 3
    invoke-direct {p0}, Lcom/kwad/components/ad/draw/b;->af()Lcom/kwad/sdk/mvp/Presenter;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/draw/b;->mPresenter:Lcom/kwad/sdk/mvp/Presenter;

    .line 4
    iget-object v1, p0, Lcom/kwad/components/ad/draw/b;->mRootContainer:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->G(Landroid/view/View;)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b;->mPresenter:Lcom/kwad/sdk/mvp/Presenter;

    iget-object v1, p0, Lcom/kwad/components/ad/draw/b;->bO:Lcom/kwad/components/ad/draw/a/b;

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->k(Ljava/lang/Object;)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b;->bQ:Lcom/kwad/components/core/widget/a/b;

    iget-object v1, p0, Lcom/kwad/components/ad/draw/b;->bT:Lcom/kwad/sdk/core/h/b;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/widget/a/a;->a(Lcom/kwad/sdk/core/h/c;)V

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b;->bQ:Lcom/kwad/components/core/widget/a/b;

    invoke-virtual {v0}, Lcom/kwad/components/core/widget/a/a;->ua()V

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b;->bP:Lcom/kwad/components/ad/draw/c/a;

    invoke-virtual {v0}, Lcom/kwad/components/ad/draw/c/a;->aJ()V

    .line 9
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b;->bP:Lcom/kwad/components/ad/draw/c/a;

    iget-object v1, p0, Lcom/kwad/components/ad/draw/b;->bV:Lcom/kwad/components/core/video/k;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/k/b;->a(Lcom/kwad/components/core/video/k;)V

    return-void
.end method

.method public final ad()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/widget/KSFrameLayout;->ad()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b;->bQ:Lcom/kwad/components/core/widget/a/b;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/kwad/components/core/widget/a/a;->release()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b;->bP:Lcom/kwad/components/ad/draw/c/a;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0}, Lcom/kwad/components/ad/draw/c/a;->aK()V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b;->bP:Lcom/kwad/components/ad/draw/c/a;

    iget-object v1, p0, Lcom/kwad/components/ad/draw/b;->bV:Lcom/kwad/components/core/video/k;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/k/b;->b(Lcom/kwad/components/core/video/k;)V

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b;->bO:Lcom/kwad/components/ad/draw/a/b;

    if-eqz v0, :cond_2

    .line 8
    invoke-virtual {v0}, Lcom/kwad/components/ad/draw/a/b;->release()V

    .line 9
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b;->mPresenter:Lcom/kwad/sdk/mvp/Presenter;

    if-eqz v0, :cond_3

    .line 10
    invoke-virtual {v0}, Lcom/kwad/sdk/mvp/Presenter;->destroy()V

    :cond_3
    return-void
.end method

.method public final setAdInteractionListener(Lcom/kwad/sdk/api/KsDrawAd$AdInteractionListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/draw/b;->bN:Lcom/kwad/sdk/api/KsDrawAd$AdInteractionListener;

    return-void
.end method

.method public final setPageExitListener(Lcom/kwad/sdk/core/h/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/draw/b;->bT:Lcom/kwad/sdk/core/h/b;

    return-void
.end method
