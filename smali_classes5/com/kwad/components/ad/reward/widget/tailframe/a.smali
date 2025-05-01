.class public abstract Lcom/kwad/components/ad/reward/widget/tailframe/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/widget/c;


# instance fields
.field protected BD:Landroid/view/View;

.field protected BE:Landroid/widget/ImageView;

.field private BF:Lcom/kwad/components/ad/widget/tailframe/appbar/a;

.field private BG:Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameBarH5View;

.field private BH:Lcom/kwad/components/ad/reward/widget/tailframe/b;

.field private BI:Lcom/kwad/components/core/page/widget/TextProgressBar;

.field private BJ:Landroid/view/View;

.field private BK:I

.field private dM:Landroid/widget/TextView;

.field protected mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

.field protected mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

.field private mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

.field protected mLogoView:Lcom/kwad/components/core/widget/KsLogoView;

.field private mReportExtData:Lorg/json/JSONObject;

.field private qp:Lcom/kwad/components/ad/reward/g;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BK:I

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/reward/widget/tailframe/a;)Lcom/kwad/components/ad/widget/tailframe/appbar/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BF:Lcom/kwad/components/ad/widget/tailframe/appbar/a;

    return-object p0
.end method

.method static synthetic b(Lcom/kwad/components/ad/reward/widget/tailframe/a;)Lcom/kwad/components/core/page/widget/TextProgressBar;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BI:Lcom/kwad/components/core/page/widget/TextProgressBar;

    return-object p0
.end method

.method private b(Landroid/view/View;Z)V
    .locals 5

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->F(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/16 p2, 0x99

    .line 5
    :goto_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v3, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BD:Landroid/view/View;

    .line 6
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    .line 7
    iget-object v4, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BJ:Landroid/view/View;

    if-ne p1, v4, :cond_1

    const/4 v1, 0x1

    .line 8
    :cond_1
    invoke-virtual {v0, v2, v3, p2, v1}, Lcom/kwad/components/ad/reward/g;->a(ILandroid/content/Context;II)V

    return-void

    .line 9
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->aE(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 10
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BI:Lcom/kwad/components/core/page/widget/TextProgressBar;

    if-ne p1, v0, :cond_4

    :goto_1
    const/4 v1, 0x1

    goto :goto_2

    .line 11
    :cond_3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->dM:Landroid/widget/TextView;

    if-ne p1, v0, :cond_4

    goto :goto_1

    .line 12
    :cond_4
    :goto_2
    new-instance v0, Lcom/kwad/components/core/e/d/a$a;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v0, v3}, Lcom/kwad/components/core/e/d/a$a;-><init>(Landroid/content/Context;)V

    iget-object v3, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 13
    invoke-virtual {v0, v3}, Lcom/kwad/components/core/e/d/a$a;->ar(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    iget-object v3, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    .line 14
    invoke-virtual {v0, v3}, Lcom/kwad/components/core/e/d/a$a;->b(Lcom/kwad/components/core/e/d/c;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    const/4 v3, 0x0

    if-ne v1, v2, :cond_5

    const/4 v4, 0x1

    goto :goto_3

    :cond_5
    const/4 v4, 0x0

    .line 15
    :goto_3
    invoke-virtual {v0, v4}, Lcom/kwad/components/core/e/d/a$a;->am(I)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    .line 16
    invoke-virtual {v0, v2}, Lcom/kwad/components/core/e/d/a$a;->al(I)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    iget-object v4, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BI:Lcom/kwad/components/core/page/widget/TextProgressBar;

    if-ne p1, v4, :cond_6

    goto :goto_4

    :cond_6
    const/4 v2, 0x0

    .line 17
    :goto_4
    invoke-virtual {v0, v2}, Lcom/kwad/components/core/e/d/a$a;->ao(Z)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    .line 18
    invoke-virtual {p1, v1}, Lcom/kwad/components/core/e/d/a$a;->an(I)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    new-instance v0, Lcom/kwad/components/ad/reward/widget/tailframe/a$2;

    invoke-direct {v0, p0, p2}, Lcom/kwad/components/ad/reward/widget/tailframe/a$2;-><init>(Lcom/kwad/components/ad/reward/widget/tailframe/a;Z)V

    .line 19
    invoke-virtual {p1, v0}, Lcom/kwad/components/core/e/d/a$a;->a(Lcom/kwad/components/core/e/d/a$b;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    .line 20
    invoke-static {p1}, Lcom/kwad/components/core/e/d/a;->a(Lcom/kwad/components/core/e/d/a$a;)I

    return-void
.end method

.method private bindDownloadListener()V
    .locals 4

    .line 1
    new-instance v0, Lcom/kwad/components/core/e/d/c;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v2, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->mReportExtData:Lorg/json/JSONObject;

    new-instance v3, Lcom/kwad/components/ad/reward/widget/tailframe/a$1;

    invoke-direct {v3, p0}, Lcom/kwad/components/ad/reward/widget/tailframe/a$1;-><init>(Lcom/kwad/components/ad/reward/widget/tailframe/a;)V

    invoke-direct {v0, v1, v2, v3}, Lcom/kwad/components/core/e/d/c;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;Lcom/kwad/sdk/api/KsAppDownloadListener;)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    return-void
.end method

.method static synthetic c(Lcom/kwad/components/ad/reward/widget/tailframe/a;)Lcom/kwad/components/ad/reward/widget/tailframe/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BH:Lcom/kwad/components/ad/reward/widget/tailframe/b;

    return-object p0
.end method

.method private kj()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BD:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2
    iput-object v1, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    return-void
.end method

.method private kl()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->aE(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->F(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BG:Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameBarH5View;

    iget-object v3, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {v0, v3}, Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameBarH5View;->b(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BG:Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameBarH5View;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameBarH5View;->getH5OpenBtn()Landroid/widget/TextView;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->dM:Landroid/widget/TextView;

    .line 5
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setClickable(Z)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BG:Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameBarH5View;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 7
    new-instance v0, Lcom/kwad/sdk/widget/f;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->dM:Landroid/widget/TextView;

    invoke-direct {v0, v1, p0}, Lcom/kwad/sdk/widget/f;-><init>(Landroid/view/View;Lcom/kwad/sdk/widget/c;)V

    return-void

    .line 8
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BF:Lcom/kwad/components/ad/widget/tailframe/appbar/a;

    iget-object v3, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {v0, v3}, Lcom/kwad/components/ad/widget/tailframe/appbar/a;->b(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 9
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BF:Lcom/kwad/components/ad/widget/tailframe/appbar/a;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 10
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BF:Lcom/kwad/components/ad/widget/tailframe/appbar/a;

    invoke-virtual {v0}, Lcom/kwad/components/ad/widget/tailframe/appbar/a;->getTextProgressBar()Lcom/kwad/components/core/page/widget/TextProgressBar;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BI:Lcom/kwad/components/core/page/widget/TextProgressBar;

    .line 11
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->F(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 12
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BI:Lcom/kwad/components/core/page/widget/TextProgressBar;

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setClickable(Z)V

    .line 13
    new-instance v0, Lcom/kwad/sdk/widget/f;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BI:Lcom/kwad/components/core/page/widget/TextProgressBar;

    invoke-direct {v0, v1, p0}, Lcom/kwad/sdk/widget/f;-><init>(Landroid/view/View;Lcom/kwad/sdk/widget/c;)V

    .line 14
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/widget/tailframe/a;->bindDownloadListener()V

    return-void

    .line 15
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BF:Lcom/kwad/components/ad/widget/tailframe/appbar/a;

    invoke-virtual {v0}, Lcom/kwad/components/ad/widget/tailframe/appbar/a;->getBtnInstallContainer()Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BJ:Landroid/view/View;

    .line 16
    invoke-virtual {v0, v2}, Landroid/view/View;->setClickable(Z)V

    .line 17
    new-instance v0, Lcom/kwad/sdk/widget/f;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BJ:Landroid/view/View;

    invoke-direct {v0, v1, p0}, Lcom/kwad/sdk/widget/f;-><init>(Landroid/view/View;Lcom/kwad/sdk/widget/c;)V

    return-void
.end method


# virtual methods
.method public A(Landroid/content/Context;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BK:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v0, v1, v2}, Lcom/kwad/sdk/n/l;->a(Landroid/content/Context;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BD:Landroid/view/View;

    .line 2
    sget v0, Lcom/kwad/sdk/R$id;->ksad_video_thumb_img:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BE:Landroid/widget/ImageView;

    .line 3
    iget-object p1, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BD:Landroid/view/View;

    sget v0, Lcom/kwad/sdk/R$id;->ksad_video_tf_logo:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/kwad/components/core/widget/KsLogoView;

    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->mLogoView:Lcom/kwad/components/core/widget/KsLogoView;

    .line 4
    iget-object p1, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BD:Landroid/view/View;

    sget v0, Lcom/kwad/sdk/R$id;->ksad_video_app_tail_frame:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/kwad/components/ad/widget/tailframe/appbar/a;

    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BF:Lcom/kwad/components/ad/widget/tailframe/appbar/a;

    .line 5
    iget-object p1, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BD:Landroid/view/View;

    sget v0, Lcom/kwad/sdk/R$id;->ksad_video_h5_tail_frame:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameBarH5View;

    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BG:Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameBarH5View;

    return-void
.end method

.method public final a(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x1

    .line 10
    invoke-direct {p0, p1, v0}, Lcom/kwad/components/ad/reward/widget/tailframe/a;->b(Landroid/view/View;Z)V

    return-void
.end method

.method public a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;Lcom/kwad/components/ad/reward/widget/tailframe/b;)V
    .locals 0
    .param p1    # Lcom/kwad/sdk/core/response/model/AdTemplate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 3
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    .line 4
    iput-object p2, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->mReportExtData:Lorg/json/JSONObject;

    .line 5
    iput-object p3, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BH:Lcom/kwad/components/ad/reward/widget/tailframe/b;

    .line 6
    iget-object p1, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->mLogoView:Lcom/kwad/components/core/widget/KsLogoView;

    iget-object p2, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {p1, p2}, Lcom/kwad/components/core/widget/KsLogoView;->aE(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 7
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/widget/tailframe/a;->kl()V

    .line 8
    iget-object p1, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BD:Landroid/view/View;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/view/View;->setClickable(Z)V

    .line 9
    new-instance p1, Lcom/kwad/sdk/widget/f;

    iget-object p2, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BD:Landroid/view/View;

    invoke-direct {p1, p2, p0}, Lcom/kwad/sdk/widget/f;-><init>(Landroid/view/View;Lcom/kwad/sdk/widget/c;)V

    return-void
.end method

.method public final b(Landroid/view/View;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/d;->dH(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, p1, v0}, Lcom/kwad/components/ad/reward/widget/tailframe/a;->b(Landroid/view/View;Z)V

    :cond_0
    return-void
.end method

.method public final destroy()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BF:Lcom/kwad/components/ad/widget/tailframe/appbar/a;

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/ad/widget/tailframe/appbar/a;->kn()V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BF:Lcom/kwad/components/ad/widget/tailframe/appbar/a;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BG:Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameBarH5View;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameBarH5View;->kn()V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BG:Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameBarH5View;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 7
    :cond_1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/widget/tailframe/a;->kj()V

    return-void
.end method

.method public final f(ZZ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BG:Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameBarH5View;

    invoke-virtual {v0, p1, p2}, Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameBarH5View;->g(ZZ)V

    return-void
.end method

.method public final jR()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BF:Lcom/kwad/components/ad/widget/tailframe/appbar/a;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/ad/widget/tailframe/appbar/a;->kn()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BG:Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameBarH5View;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameBarH5View;->kn()V

    :cond_1
    return-void
.end method

.method public final kk()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->BD:Landroid/view/View;

    return-object v0
.end method

.method public final setCallerContext(Lcom/kwad/components/ad/reward/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/tailframe/a;->qp:Lcom/kwad/components/ad/reward/g;

    return-void
.end method
