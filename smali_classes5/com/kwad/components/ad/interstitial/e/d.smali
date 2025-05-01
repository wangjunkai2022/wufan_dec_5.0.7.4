.class public final Lcom/kwad/components/ad/interstitial/e/d;
.super Lcom/kwad/components/ad/interstitial/e/b;
.source "SourceFile"


# static fields
.field private static ks:F = 0.749f

.field private static kt:F = 0.8f

.field private static ku:F = 1.0f


# instance fields
.field private bQ:Lcom/kwad/components/core/widget/a/b;

.field private eN:Lcom/kwad/sdk/core/video/videoview/a;

.field private jH:Lcom/kwad/components/core/widget/KsAutoCloseView;

.field private jK:Lcom/kwad/components/ad/interstitial/e/c;

.field private jP:Lcom/kwad/components/ad/interstitial/e/c$a;

.field private kq:Z

.field private kr:Lcom/kwad/sdk/widget/KSFrameLayout;

.field private kv:Lcom/kwad/sdk/core/h/d;

.field private mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

.field private mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/interstitial/e/b;-><init>()V

    .line 2
    new-instance v0, Lcom/kwad/components/ad/interstitial/e/d$5;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/interstitial/e/d$5;-><init>(Lcom/kwad/components/ad/interstitial/e/d;)V

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d;->kv:Lcom/kwad/sdk/core/h/d;

    return-void
.end method

.method private static B(I)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 1
    sget v0, Lcom/kwad/components/ad/interstitial/e/d;->ks:F

    int-to-float p0, p0

    mul-float p0, p0, v0

    float-to-int p0, p0

    int-to-float v0, p0

    const v1, 0x3f3fbe77    # 0.749f

    div-float/2addr v0, v1

    float-to-int v0, v0

    .line 2
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v1, v0, p0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    return-object v1
.end method

.method static synthetic C(I)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/kwad/components/ad/interstitial/e/d;->B(I)Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    return-object p0
.end method

.method private static a(IZ)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    if-eqz p1, :cond_0

    .line 5
    sget v0, Lcom/kwad/components/ad/interstitial/e/d;->kt:F

    goto :goto_0

    .line 6
    :cond_0
    sget v0, Lcom/kwad/components/ad/interstitial/e/d;->ku:F

    :goto_0
    if-eqz p1, :cond_1

    const p1, 0x3fe38e39

    goto :goto_1

    :cond_1
    const p1, 0x3f3fbe77    # 0.749f

    :goto_1
    int-to-float p0, p0

    mul-float p0, p0, v0

    float-to-int p0, p0

    int-to-float v0, p0

    mul-float v0, v0, p1

    float-to-int p1, v0

    .line 7
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v0, p0, p1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    return-object v0
.end method

.method static synthetic a(Lcom/kwad/components/ad/interstitial/e/d;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/d;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic a(Lcom/kwad/components/ad/interstitial/e/d;Lcom/kwad/sdk/widget/KSFrameLayout;)Lcom/kwad/sdk/widget/KSFrameLayout;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/e/d;->kr:Lcom/kwad/sdk/widget/KSFrameLayout;

    return-object p1
.end method

.method static synthetic a(Lcom/kwad/components/ad/interstitial/e/d;II)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/kwad/components/ad/interstitial/e/d;->e(II)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/interstitial/e/d;Z)V
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/interstitial/e/d;->n(Z)V

    return-void
.end method

.method private static b(ZZ)F
    .locals 0

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    const p0, 0x3fe38e39

    goto :goto_0

    :cond_0
    const p0, 0x3f3fbe77    # 0.749f

    :goto_0
    return p0
.end method

.method static synthetic b(IZ)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/kwad/components/ad/interstitial/e/d;->a(IZ)Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    return-object p0
.end method

.method static synthetic b(Lcom/kwad/components/ad/interstitial/e/d;)Lcom/kwad/sdk/core/video/videoview/a;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/d;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    return-object p0
.end method

.method static synthetic b(Lcom/kwad/components/ad/interstitial/e/d;Z)Z
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/kwad/components/ad/interstitial/e/d;->kq:Z

    return p1
.end method

.method static synthetic c(Lcom/kwad/components/ad/interstitial/e/d;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/d;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method private static c(Lcom/kwad/sdk/core/response/model/AdInfo;)Z
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/core/response/model/AdInfo;->adInsertScreenInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdInsertScreenInfo;

    iget v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo$AdInsertScreenInfo;->autoCloseTime:I

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    return v1

    .line 3
    :cond_0
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/a;->bI(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p0

    if-eqz p0, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method static synthetic d(Lcom/kwad/components/ad/interstitial/e/d;)Lcom/kwad/components/core/widget/KsAutoCloseView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/d;->jH:Lcom/kwad/components/core/widget/KsAutoCloseView;

    return-object p0
.end method

.method private dc()Lcom/kwad/components/ad/interstitial/e/c$a;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/ad/interstitial/e/d$4;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/interstitial/e/d$4;-><init>(Lcom/kwad/components/ad/interstitial/e/d;)V

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d;->jP:Lcom/kwad/components/ad/interstitial/e/c$a;

    return-object v0
.end method

.method private dd()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->jL:Lcom/kwad/components/ad/interstitial/g/d;

    .line 2
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/d;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/interstitial/g/d;->setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 3
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/d;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->bc(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    .line 4
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/d;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->aT(Lcom/kwad/sdk/core/response/model/AdInfo;)Lcom/kwad/sdk/core/response/model/AdInfo$AdMaterialInfo$MaterialFeature;

    move-result-object v1

    iget-object v1, v1, Lcom/kwad/sdk/core/response/model/AdInfo$AdMaterialInfo$MaterialFeature;->materialUrl:Ljava/lang/String;

    .line 5
    iget-object v4, p0, Lcom/kwad/components/ad/interstitial/e/d;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {v0, v1, v4}, Lcom/kwad/components/ad/interstitial/g/d;->c(Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 6
    invoke-virtual {v0, v3, v3}, Lcom/kwad/components/ad/interstitial/g/d;->c(ZZ)V

    .line 7
    invoke-virtual {v0, v2}, Lcom/kwad/components/ad/interstitial/g/d;->t(Z)V

    goto/16 :goto_1

    .line 8
    :cond_0
    invoke-virtual {v0, v3}, Lcom/kwad/components/ad/interstitial/g/d;->t(Z)V

    .line 9
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/d;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->bs(Lcom/kwad/sdk/core/response/model/AdInfo;)Lcom/kwad/sdk/core/response/model/b;

    move-result-object v1

    .line 10
    invoke-virtual {v1}, Lcom/kwad/sdk/core/response/model/b;->getUrl()Ljava/lang/String;

    move-result-object v1

    .line 11
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 12
    iget-object v4, p0, Lcom/kwad/components/ad/interstitial/e/d;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {v0, v1, v4}, Lcom/kwad/components/ad/interstitial/g/d;->c(Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 13
    invoke-virtual {v0, v3, v2}, Lcom/kwad/components/ad/interstitial/g/d;->c(ZZ)V

    goto :goto_0

    .line 14
    :cond_1
    invoke-virtual {v0, v2, v2}, Lcom/kwad/components/ad/interstitial/g/d;->c(ZZ)V

    .line 15
    :goto_0
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/d;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v1, v1, Lcom/kwad/components/ad/interstitial/e/c;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    iput-object v1, p0, Lcom/kwad/components/ad/interstitial/e/d;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    .line 16
    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 17
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/d;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    iget-object v4, p0, Lcom/kwad/components/ad/interstitial/e/d;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 18
    :cond_2
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/d;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->bb(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 19
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/d;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->aU(Lcom/kwad/sdk/core/response/model/AdInfo;)Lcom/kwad/sdk/core/response/model/AdInfo$AdMaterialInfo$MaterialFeature;

    move-result-object v1

    iget v1, v1, Lcom/kwad/sdk/core/response/model/AdInfo$AdMaterialInfo$MaterialFeature;->height:I

    int-to-float v1, v1

    iget-object v4, p0, Lcom/kwad/components/ad/interstitial/e/d;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    .line 20
    invoke-static {v4}, Lcom/kwad/sdk/core/response/b/a;->aU(Lcom/kwad/sdk/core/response/model/AdInfo;)Lcom/kwad/sdk/core/response/model/AdInfo$AdMaterialInfo$MaterialFeature;

    move-result-object v4

    iget v4, v4, Lcom/kwad/sdk/core/response/model/AdInfo$AdMaterialInfo$MaterialFeature;->width:I

    int-to-float v4, v4

    div-float/2addr v1, v4

    .line 21
    iget-object v4, p0, Lcom/kwad/components/ad/interstitial/e/d;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    invoke-virtual {v0, v1, v4}, Lcom/kwad/components/ad/interstitial/g/d;->a(FLcom/kwad/sdk/core/video/videoview/a;)V

    .line 22
    :cond_3
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/d;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v1, v1, Lcom/kwad/components/ad/interstitial/e/c;->dU:Lcom/kwad/sdk/api/KsAdVideoPlayConfig;

    invoke-interface {v1}, Lcom/kwad/sdk/api/KsAdVideoPlayConfig;->isVideoSoundEnable()Z

    move-result v1

    .line 23
    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/interstitial/g/d;->u(Z)V

    .line 24
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/d;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->L(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v1

    .line 25
    iget-object v4, p0, Lcom/kwad/components/ad/interstitial/e/d;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    new-instance v5, Lcom/kwad/components/ad/interstitial/e/d$6;

    invoke-direct {v5, p0, v1, v0}, Lcom/kwad/components/ad/interstitial/e/d$6;-><init>(Lcom/kwad/components/ad/interstitial/e/d;ILcom/kwad/components/ad/interstitial/g/d;)V

    invoke-virtual {v4, v5}, Lcom/kwad/components/ad/interstitial/e/c;->a(Lcom/kwad/components/core/video/a$c;)V

    .line 26
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/d;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v4, p0, Lcom/kwad/components/ad/interstitial/e/d;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-virtual {v0, v1, v4}, Lcom/kwad/components/ad/interstitial/g/d;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/core/response/model/AdInfo;)V

    .line 27
    invoke-virtual {v0, v3}, Lcom/kwad/components/ad/interstitial/g/d;->t(Z)V

    .line 28
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/d;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v1, v1, Lcom/kwad/components/ad/interstitial/e/c;->jU:Ljava/util/List;

    new-instance v4, Lcom/kwad/components/ad/interstitial/e/d$7;

    invoke-direct {v4, p0, v0}, Lcom/kwad/components/ad/interstitial/e/d$7;-><init>(Lcom/kwad/components/ad/interstitial/e/d;Lcom/kwad/components/ad/interstitial/g/d;)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 29
    :goto_1
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/d;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v4

    iget-object v5, p0, Lcom/kwad/components/ad/interstitial/e/d;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget-object v6, p0, Lcom/kwad/components/ad/interstitial/e/d;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {v0}, Lcom/kwad/components/ad/interstitial/g/d;->getBlurBgView()Landroid/view/View;

    move-result-object v7

    invoke-virtual {v1, v4, v5, v6, v7}, Lcom/kwad/components/ad/interstitial/e/c;->a(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdInfo;Lcom/kwad/sdk/core/response/model/AdTemplate;Landroid/view/View;)V

    .line 30
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/d;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->O(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v1

    .line 31
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 32
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/d;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->W(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v1

    .line 33
    :cond_4
    invoke-virtual {v0}, Lcom/kwad/components/ad/interstitial/g/d;->getTailFrameView()Landroid/widget/ImageView;

    move-result-object v0

    iget-object v4, p0, Lcom/kwad/components/ad/interstitial/e/d;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0, v1, v4}, Lcom/kwad/sdk/core/imageloader/KSImageLoader;->loadImage(Landroid/widget/ImageView;Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 34
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/d;->c(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 35
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d;->jH:Lcom/kwad/components/core/widget/KsAutoCloseView;

    invoke-virtual {v0, v3}, Lcom/kwad/components/core/widget/KsAutoCloseView;->aY(Z)V

    .line 36
    invoke-direct {p0}, Lcom/kwad/components/ad/interstitial/e/d;->de()V

    return-void

    .line 37
    :cond_5
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d;->jH:Lcom/kwad/components/core/widget/KsAutoCloseView;

    invoke-virtual {v0, v2}, Lcom/kwad/components/core/widget/KsAutoCloseView;->aY(Z)V

    return-void
.end method

.method private de()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget-object v1, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->adInsertScreenInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdInsertScreenInfo;

    iget v1, v1, Lcom/kwad/sdk/core/response/model/AdInfo$AdInsertScreenInfo;->autoCloseTime:I

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->bb(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->L(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v0

    .line 4
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->jL:Lcom/kwad/components/ad/interstitial/g/d;

    invoke-virtual {v0}, Lcom/kwad/components/ad/interstitial/g/d;->ef()V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->jL:Lcom/kwad/components/ad/interstitial/g/d;

    invoke-virtual {v0}, Lcom/kwad/components/ad/interstitial/g/d;->eg()V

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d;->jH:Lcom/kwad/components/core/widget/KsAutoCloseView;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/widget/KsAutoCloseView;->U(I)V

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/16 v1, 0xa5

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/core/adlog/c;->b(Lcom/kwad/sdk/core/response/model/AdTemplate;ILorg/json/JSONObject;)V

    return-void
.end method

.method static synthetic e(Lcom/kwad/components/ad/interstitial/e/d;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method private e(II)V
    .locals 2

    .line 2
    new-instance v0, Lcom/kwad/components/ad/interstitial/e/c$b;

    .line 3
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/kwad/components/ad/interstitial/e/c$b;-><init>(Landroid/content/Context;)V

    iget-boolean v1, p0, Lcom/kwad/components/ad/interstitial/e/d;->kq:Z

    .line 4
    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/interstitial/e/c$b;->k(Z)Lcom/kwad/components/ad/interstitial/e/c$b;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/d;->kr:Lcom/kwad/sdk/widget/KSFrameLayout;

    .line 5
    invoke-virtual {v1}, Lcom/kwad/sdk/widget/KSFrameLayout;->getTouchCoords()Lcom/kwad/sdk/utils/ac$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/interstitial/e/c$b;->a(Lcom/kwad/sdk/utils/ac$a;)Lcom/kwad/components/ad/interstitial/e/c$b;

    move-result-object v0

    .line 6
    invoke-virtual {v0, p1}, Lcom/kwad/components/ad/interstitial/e/c$b;->z(I)Lcom/kwad/components/ad/interstitial/e/c$b;

    move-result-object p1

    .line 7
    invoke-virtual {p1, p2}, Lcom/kwad/components/ad/interstitial/e/c$b;->A(I)Lcom/kwad/components/ad/interstitial/e/c$b;

    move-result-object p1

    .line 8
    iget-object p2, p0, Lcom/kwad/components/ad/interstitial/e/d;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    invoke-virtual {p2, p1}, Lcom/kwad/components/ad/interstitial/e/c;->a(Lcom/kwad/components/ad/interstitial/e/c$b;)V

    .line 9
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/e/d;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {p1}, Lcom/kwad/components/ad/interstitial/d/b;->k(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 10
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/e/d;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object p2, p1, Lcom/kwad/components/ad/interstitial/e/c;->io:Lcom/kwad/components/ad/interstitial/d;

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    const/4 v0, -0x1

    .line 11
    iget-object v1, p1, Lcom/kwad/components/ad/interstitial/e/c;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    invoke-virtual {p1, p2, v0, v1}, Lcom/kwad/components/ad/interstitial/e/c;->a(ZILcom/kwad/sdk/core/video/videoview/a;)V

    .line 12
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/e/d;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object p1, p1, Lcom/kwad/components/ad/interstitial/e/c;->io:Lcom/kwad/components/ad/interstitial/d;

    invoke-virtual {p1}, Lcom/kwad/components/ad/interstitial/d;->dismiss()V

    .line 13
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/e/d;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    invoke-virtual {p1}, Lcom/kwad/components/ad/interstitial/e/c;->cR()V

    :cond_0
    return-void
.end method

.method private n(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-boolean v1, v0, Lcom/kwad/components/ad/interstitial/e/c;->jO:Z

    if-nez v1, :cond_0

    if-nez p1, :cond_0

    iget-boolean v1, v0, Lcom/kwad/components/ad/interstitial/e/c;->jM:Z

    if-nez v1, :cond_0

    iget-boolean v1, v0, Lcom/kwad/components/ad/interstitial/e/c;->jN:Z

    if-nez v1, :cond_0

    .line 2
    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/f/a;->d(Lcom/kwad/components/ad/interstitial/e/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/e/d;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lcom/kwad/components/ad/interstitial/e/c;->jN:Z

    .line 4
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/kwad/components/ad/interstitial/c/b;->H(Landroid/content/Context;)V

    return-void

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    const/4 v1, -0x1

    iget-object v2, p0, Lcom/kwad/components/ad/interstitial/e/d;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    invoke-virtual {v0, p1, v1, v2}, Lcom/kwad/components/ad/interstitial/e/c;->a(ZILcom/kwad/sdk/core/video/videoview/a;)V

    .line 6
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/e/d;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object p1, p1, Lcom/kwad/components/ad/interstitial/e/c;->io:Lcom/kwad/components/ad/interstitial/d;

    invoke-virtual {p1}, Lcom/kwad/components/ad/interstitial/d;->dismiss()V

    .line 7
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/e/d;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    if-eqz p1, :cond_1

    .line 8
    invoke-virtual {p1}, Lcom/kwad/sdk/core/video/videoview/a;->release()V

    .line 9
    :cond_1
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/e/d;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    invoke-virtual {p1}, Lcom/kwad/components/ad/interstitial/e/c;->cR()V

    return-void
.end method


# virtual methods
.method public final aj()V
    .locals 5

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/interstitial/e/b;->aj()V

    .line 2
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->Kf()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/ad/interstitial/e/c;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    .line 3
    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 4
    invoke-static {}, Lcom/kwad/components/ad/interstitial/report/c;->dR()Lcom/kwad/components/ad/interstitial/report/c;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/d;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v1, v1, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/interstitial/report/c;->t(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->jS:Lcom/kwad/sdk/widget/KSFrameLayout;

    const-string v1, "#99000000"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->jL:Lcom/kwad/components/ad/interstitial/g/d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->jL:Lcom/kwad/components/ad/interstitial/g/d;

    iget-object v2, p0, Lcom/kwad/components/ad/interstitial/e/d;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {v0, v2}, Lcom/kwad/components/ad/interstitial/g/d;->y(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 9
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    invoke-direct {p0}, Lcom/kwad/components/ad/interstitial/e/d;->dc()Lcom/kwad/components/ad/interstitial/e/c$a;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/kwad/components/ad/interstitial/e/c;->a(Lcom/kwad/components/ad/interstitial/e/c$a;)V

    .line 10
    invoke-direct {p0}, Lcom/kwad/components/ad/interstitial/e/d;->dd()V

    .line 11
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->jL:Lcom/kwad/components/ad/interstitial/g/d;

    new-instance v2, Lcom/kwad/components/ad/interstitial/e/d$2;

    invoke-direct {v2, p0}, Lcom/kwad/components/ad/interstitial/e/d$2;-><init>(Lcom/kwad/components/ad/interstitial/e/d;)V

    invoke-virtual {v0, v2}, Lcom/kwad/components/ad/interstitial/g/d;->setViewListener(Lcom/kwad/components/ad/interstitial/g/e;)V

    .line 12
    new-instance v0, Lcom/kwad/components/core/widget/a/b;

    iget-object v2, p0, Lcom/kwad/components/ad/interstitial/e/d;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v2, v2, Lcom/kwad/components/ad/interstitial/e/c;->jL:Lcom/kwad/components/ad/interstitial/g/d;

    const/16 v3, 0x64

    invoke-direct {v0, v2, v3}, Lcom/kwad/components/core/widget/a/b;-><init>(Landroid/view/View;I)V

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d;->bQ:Lcom/kwad/components/core/widget/a/b;

    .line 13
    iget-object v2, p0, Lcom/kwad/components/ad/interstitial/e/d;->kv:Lcom/kwad/sdk/core/h/d;

    invoke-virtual {v0, v2}, Lcom/kwad/components/core/widget/a/a;->a(Lcom/kwad/sdk/core/h/c;)V

    .line 14
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d;->bQ:Lcom/kwad/components/core/widget/a/b;

    invoke-virtual {v0}, Lcom/kwad/components/core/widget/a/a;->ua()V

    .line 15
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->aV(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    .line 16
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    invoke-static {}, Lcom/kwad/sdk/utils/aj;->ML()Z

    move-result v2

    .line 17
    invoke-static {v2, v0}, Lcom/kwad/components/ad/interstitial/e/d;->b(ZZ)F

    move-result v3

    .line 18
    iget-object v4, p0, Lcom/kwad/components/ad/interstitial/e/d;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v4, v4, Lcom/kwad/components/ad/interstitial/e/c;->jL:Lcom/kwad/components/ad/interstitial/g/d;

    invoke-virtual {v4, v3}, Lcom/kwad/sdk/widget/KSFrameLayout;->setRatio(F)V

    .line 19
    sget v3, Lcom/kwad/sdk/R$id;->ksad_interstitial_native:I

    invoke-virtual {p0, v3}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    .line 20
    invoke-virtual {v3, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 21
    new-instance v1, Lcom/kwad/components/ad/interstitial/e/d$3;

    invoke-direct {v1, p0, v2, v0, v3}, Lcom/kwad/components/ad/interstitial/e/d$3;-><init>(Lcom/kwad/components/ad/interstitial/e/d;ZZLandroid/view/ViewGroup;)V

    invoke-virtual {v3, v1}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onCreate()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onCreate()V

    .line 2
    sget v0, Lcom/kwad/sdk/R$id;->ksad_interstitial_auto_close:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/core/widget/KsAutoCloseView;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d;->jH:Lcom/kwad/components/core/widget/KsAutoCloseView;

    .line 3
    new-instance v1, Lcom/kwad/components/ad/interstitial/e/d$1;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/interstitial/e/d$1;-><init>(Lcom/kwad/components/ad/interstitial/e/d;)V

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/widget/KsAutoCloseView;->setViewListener(Lcom/kwad/components/core/widget/KsAutoCloseView$a;)V

    return-void
.end method

.method public final onUnbind()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onUnbind()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/d;->jP:Lcom/kwad/components/ad/interstitial/e/c$a;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/interstitial/e/c;->b(Lcom/kwad/components/ad/interstitial/e/c$a;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d;->bQ:Lcom/kwad/components/core/widget/a/b;

    if-eqz v0, :cond_0

    .line 4
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/d;->kv:Lcom/kwad/sdk/core/h/d;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/widget/a/a;->b(Lcom/kwad/sdk/core/h/c;)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d;->bQ:Lcom/kwad/components/core/widget/a/b;

    invoke-virtual {v0}, Lcom/kwad/components/core/widget/a/a;->ub()V

    :cond_0
    return-void
.end method
