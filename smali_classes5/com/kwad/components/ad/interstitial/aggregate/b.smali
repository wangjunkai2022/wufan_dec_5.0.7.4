.class public final Lcom/kwad/components/ad/interstitial/aggregate/b;
.super Lcom/kwad/components/ad/interstitial/g/a;
.source "SourceFile"


# instance fields
.field private bQ:Lcom/kwad/components/core/widget/a/b;

.field private final df:Lcom/kwad/sdk/core/h/c;

.field private iA:Landroid/animation/ValueAnimator;

.field private iB:Z

.field private iC:Lcom/kwad/components/ad/interstitial/aggregate/InterstitialAggregateManualTipsView;

.field private iD:Z

.field private iE:Z

.field private final iF:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

.field protected ie:Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;

.field private final im:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/sdk/core/response/model/AdResultData;",
            ">;"
        }
    .end annotation
.end field

.field private iq:Z

.field private iv:Lcom/kwad/components/ad/interstitial/aggregate/TransViewPager;

.field private iw:Lcom/kwad/components/ad/interstitial/aggregate/a;

.field private ix:Lcom/kwad/components/ad/interstitial/aggregate/ViewPagerIndicator;

.field private iy:Lcom/kwad/components/ad/interstitial/aggregate/SlideTipsView;

.field private iz:Lcom/kwad/components/ad/interstitial/aggregate/SlideTipsView;

.field protected mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

.field protected mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field protected mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mRootView:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/kwad/components/ad/interstitial/aggregate/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

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

    .line 3
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->im:Ljava/util/List;

    .line 4
    new-instance p2, Lcom/kwad/components/ad/interstitial/aggregate/b$2;

    invoke-direct {p2, p0}, Lcom/kwad/components/ad/interstitial/aggregate/b$2;-><init>(Lcom/kwad/components/ad/interstitial/aggregate/b;)V

    iput-object p2, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->df:Lcom/kwad/sdk/core/h/c;

    .line 5
    new-instance p2, Lcom/kwad/components/ad/interstitial/aggregate/b$3;

    invoke-direct {p2, p0}, Lcom/kwad/components/ad/interstitial/aggregate/b$3;-><init>(Lcom/kwad/components/ad/interstitial/aggregate/b;)V

    iput-object p2, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->iF:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    .line 6
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/g/a;->mContext:Landroid/content/Context;

    .line 7
    sget p2, Lcom/kwad/sdk/R$layout;->ksad_interstitial_multi_ad:I

    invoke-static {p1, p2, p0}, Lcom/kwad/sdk/n/l;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->mRootView:Landroid/view/View;

    .line 8
    invoke-direct {p0}, Lcom/kwad/components/ad/interstitial/aggregate/b;->initView()V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/interstitial/aggregate/b;FF)Landroid/view/animation/AnimationSet;
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lcom/kwad/components/ad/interstitial/aggregate/b;->b(FF)Landroid/view/animation/AnimationSet;

    move-result-object p0

    return-object p0
.end method

.method static synthetic a(Lcom/kwad/components/ad/interstitial/aggregate/b;)Lcom/kwad/components/ad/interstitial/aggregate/TransViewPager;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->iv:Lcom/kwad/components/ad/interstitial/aggregate/TransViewPager;

    return-object p0
.end method

.method static synthetic a(Lcom/kwad/components/ad/interstitial/aggregate/b;Z)Z
    .locals 0

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->iE:Z

    return p1
.end method

.method private static b(FF)Landroid/view/animation/AnimationSet;
    .locals 10

    .line 3
    new-instance v9, Landroid/view/animation/TranslateAnimation;

    const/4 v1, 0x1

    const/4 v3, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    move-object v0, v9

    move v2, p0

    move v4, p1

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    .line 4
    new-instance p0, Landroid/view/animation/AlphaAnimation;

    const/4 p1, 0x0

    const v0, 0x3f4ccccd    # 0.8f

    invoke-direct {p0, p1, v0}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 5
    new-instance p1, Landroid/view/animation/AnimationSet;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    .line 6
    invoke-virtual {p1, v9}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 7
    invoke-virtual {p1, p0}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    const-wide/16 v1, 0x320

    .line 8
    invoke-virtual {p1, v1, v2}, Landroid/view/animation/AnimationSet;->setDuration(J)V

    .line 9
    invoke-virtual {p1, v0}, Landroid/view/animation/AnimationSet;->setFillAfter(Z)V

    return-object p1
.end method

.method static synthetic b(Lcom/kwad/components/ad/interstitial/aggregate/b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->iE:Z

    return p0
.end method

.method static synthetic b(Lcom/kwad/components/ad/interstitial/aggregate/b;Z)Z
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->iB:Z

    return p1
.end method

.method static synthetic c(Lcom/kwad/components/ad/interstitial/aggregate/b;)Landroid/animation/ValueAnimator;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->iA:Landroid/animation/ValueAnimator;

    return-object p0
.end method

.method private cq()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdTemplate;->mAdScene:Lcom/kwad/sdk/internal/api/SceneImpl;

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/kwad/components/ad/interstitial/aggregate/c;->cx()Lcom/kwad/components/ad/interstitial/aggregate/c;

    move-result-object v0

    const/16 v1, 0x10

    .line 3
    invoke-static {}, Lcom/kwad/components/ad/interstitial/b/b;->cJ()I

    move-result v2

    iget-object v3, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v3, v3, Lcom/kwad/sdk/core/response/model/AdTemplate;->mAdScene:Lcom/kwad/sdk/internal/api/SceneImpl;

    new-instance v4, Lcom/kwad/components/ad/interstitial/aggregate/b$6;

    invoke-direct {v4, p0}, Lcom/kwad/components/ad/interstitial/aggregate/b$6;-><init>(Lcom/kwad/components/ad/interstitial/aggregate/b;)V

    .line 4
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/kwad/components/ad/interstitial/aggregate/c;->a(IILcom/kwad/sdk/internal/api/SceneImpl;Lcom/kwad/components/ad/interstitial/aggregate/c$b;)V

    :cond_0
    return-void
.end method

.method private ct()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->ix:Lcom/kwad/components/ad/interstitial/aggregate/ViewPagerIndicator;

    new-instance v1, Lcom/kwad/components/ad/interstitial/aggregate/b$7;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/interstitial/aggregate/b$7;-><init>(Lcom/kwad/components/ad/interstitial/aggregate/b;)V

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/interstitial/aggregate/ViewPagerIndicator;->setPlayProgressListener(Lcom/kwad/components/ad/interstitial/aggregate/ViewPagerIndicator$a;)V

    return-void
.end method

.method private cu()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->iD:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->iC:Lcom/kwad/components/ad/interstitial/aggregate/InterstitialAggregateManualTipsView;

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v2, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->iv:Lcom/kwad/components/ad/interstitial/aggregate/TransViewPager;

    invoke-virtual {v0, v1, v2}, Lcom/kwad/components/ad/interstitial/aggregate/InterstitialAggregateManualTipsView;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/ad/interstitial/aggregate/TransViewPager;)V

    :cond_0
    const/4 v0, 0x3

    new-array v0, v0, [I

    .line 3
    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->iA:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0x4b0

    .line 4
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->iA:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/kwad/components/ad/interstitial/aggregate/b$8;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/interstitial/aggregate/b$8;-><init>(Lcom/kwad/components/ad/interstitial/aggregate/b;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->iA:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/kwad/components/ad/interstitial/aggregate/b$9;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/interstitial/aggregate/b$9;-><init>(Lcom/kwad/components/ad/interstitial/aggregate/b;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->iA:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void

    :array_0
    .array-data 4
        0x0
        0x78
        0x0
    .end array-data
.end method

.method private cv()V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [I

    const/4 v1, 0x0

    aput v1, v0, v1

    .line 1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v1

    const/4 v2, 0x1

    aput v1, v0, v2

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->iA:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0x320

    .line 2
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->iA:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/kwad/components/ad/interstitial/aggregate/b$10;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/interstitial/aggregate/b$10;-><init>(Lcom/kwad/components/ad/interstitial/aggregate/b;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->iA:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/kwad/components/ad/interstitial/aggregate/b$11;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/interstitial/aggregate/b$11;-><init>(Lcom/kwad/components/ad/interstitial/aggregate/b;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->iA:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method static synthetic d(Lcom/kwad/components/ad/interstitial/aggregate/b;)Lcom/kwad/components/ad/interstitial/aggregate/ViewPagerIndicator;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->ix:Lcom/kwad/components/ad/interstitial/aggregate/ViewPagerIndicator;

    return-object p0
.end method

.method static synthetic e(Lcom/kwad/components/ad/interstitial/aggregate/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/interstitial/aggregate/b;->cq()V

    return-void
.end method

.method static synthetic f(Lcom/kwad/components/ad/interstitial/aggregate/b;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->im:Ljava/util/List;

    return-object p0
.end method

.method static synthetic g(Lcom/kwad/components/ad/interstitial/aggregate/b;)Lcom/kwad/components/ad/interstitial/aggregate/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->iw:Lcom/kwad/components/ad/interstitial/aggregate/a;

    return-object p0
.end method

.method static synthetic h(Lcom/kwad/components/ad/interstitial/aggregate/b;)Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->iF:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    return-object p0
.end method

.method static synthetic i(Lcom/kwad/components/ad/interstitial/aggregate/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/interstitial/aggregate/b;->ct()V

    return-void
.end method

.method private initView()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->mRootView:Landroid/view/View;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_multi_ad_container:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/ad/interstitial/aggregate/TransViewPager;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->iv:Lcom/kwad/components/ad/interstitial/aggregate/TransViewPager;

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->mRootView:Landroid/view/View;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_multi_ad_indicator:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/ad/interstitial/aggregate/ViewPagerIndicator;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->ix:Lcom/kwad/components/ad/interstitial/aggregate/ViewPagerIndicator;

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->mRootView:Landroid/view/View;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_left_slide:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/ad/interstitial/aggregate/SlideTipsView;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->iy:Lcom/kwad/components/ad/interstitial/aggregate/SlideTipsView;

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->mRootView:Landroid/view/View;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_right_slide:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/ad/interstitial/aggregate/SlideTipsView;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->iz:Lcom/kwad/components/ad/interstitial/aggregate/SlideTipsView;

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->mRootView:Landroid/view/View;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_manual_tips_view:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/ad/interstitial/aggregate/InterstitialAggregateManualTipsView;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->iC:Lcom/kwad/components/ad/interstitial/aggregate/InterstitialAggregateManualTipsView;

    .line 6
    new-instance v0, Lcom/kwad/components/core/widget/a/b;

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->mRootView:Landroid/view/View;

    const/16 v2, 0x64

    invoke-direct {v0, v1, v2}, Lcom/kwad/components/core/widget/a/b;-><init>(Landroid/view/View;I)V

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->bQ:Lcom/kwad/components/core/widget/a/b;

    return-void
.end method

.method static synthetic j(Lcom/kwad/components/ad/interstitial/aggregate/b;)Lcom/kwad/sdk/core/h/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->df:Lcom/kwad/sdk/core/h/c;

    return-object p0
.end method

.method static synthetic k(Lcom/kwad/components/ad/interstitial/aggregate/b;)Lcom/kwad/components/core/widget/a/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->bQ:Lcom/kwad/components/core/widget/a/b;

    return-object p0
.end method

.method static synthetic l(Lcom/kwad/components/ad/interstitial/aggregate/b;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/g/a;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic m(Lcom/kwad/components/ad/interstitial/aggregate/b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->iq:Z

    return p0
.end method

.method static synthetic n(Lcom/kwad/components/ad/interstitial/aggregate/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/interstitial/aggregate/b;->cv()V

    return-void
.end method

.method static synthetic o(Lcom/kwad/components/ad/interstitial/aggregate/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/interstitial/aggregate/b;->cu()V

    return-void
.end method

.method static synthetic p(Lcom/kwad/components/ad/interstitial/aggregate/b;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/g/a;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic q(Lcom/kwad/components/ad/interstitial/aggregate/b;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/g/a;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic r(Lcom/kwad/components/ad/interstitial/aggregate/b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->iD:Z

    return p0
.end method

.method static synthetic s(Lcom/kwad/components/ad/interstitial/aggregate/b;)Lcom/kwad/components/ad/interstitial/aggregate/InterstitialAggregateManualTipsView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->iC:Lcom/kwad/components/ad/interstitial/aggregate/InterstitialAggregateManualTipsView;

    return-object p0
.end method

.method static synthetic t(Lcom/kwad/components/ad/interstitial/aggregate/b;)Lcom/kwad/components/ad/interstitial/aggregate/SlideTipsView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->iy:Lcom/kwad/components/ad/interstitial/aggregate/SlideTipsView;

    return-object p0
.end method

.method static synthetic u(Lcom/kwad/components/ad/interstitial/aggregate/b;)Lcom/kwad/components/ad/interstitial/aggregate/SlideTipsView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->iz:Lcom/kwad/components/ad/interstitial/aggregate/SlideTipsView;

    return-object p0
.end method

.method static synthetic v(Lcom/kwad/components/ad/interstitial/aggregate/b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->iB:Z

    return p0
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

    .line 4
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;

    .line 5
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/c;->n(Lcom/kwad/sdk/core/response/model/AdResultData;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 6
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    .line 7
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->ct(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->iq:Z

    .line 8
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->im:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 9
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->im:Ljava/util/List;

    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    iput-object p4, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->ie:Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;

    .line 11
    new-instance p1, Lcom/kwad/components/ad/interstitial/aggregate/a;

    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;

    invoke-direct {p1, v0, p2, p3, p4}, Lcom/kwad/components/ad/interstitial/aggregate/a;-><init>(Lcom/kwad/sdk/core/response/model/AdResultData;Lcom/kwad/components/ad/interstitial/d;Lcom/kwad/sdk/api/KsAdVideoPlayConfig;Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;)V

    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->iw:Lcom/kwad/components/ad/interstitial/aggregate/a;

    .line 12
    new-instance p2, Lcom/kwad/components/ad/interstitial/aggregate/b$1;

    invoke-direct {p2, p0}, Lcom/kwad/components/ad/interstitial/aggregate/b$1;-><init>(Lcom/kwad/components/ad/interstitial/aggregate/b;)V

    invoke-virtual {p1, p2}, Lcom/kwad/components/ad/interstitial/aggregate/a;->a(Lcom/kwad/components/ad/interstitial/aggregate/a$b;)V

    .line 13
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->iw:Lcom/kwad/components/ad/interstitial/aggregate/a;

    new-instance p2, Lcom/kwad/components/ad/interstitial/aggregate/b$4;

    invoke-direct {p2, p0}, Lcom/kwad/components/ad/interstitial/aggregate/b$4;-><init>(Lcom/kwad/components/ad/interstitial/aggregate/b;)V

    invoke-virtual {p1, p2}, Lcom/kwad/components/ad/interstitial/aggregate/a;->a(Lcom/kwad/components/ad/interstitial/aggregate/a$a;)V

    .line 14
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->iv:Lcom/kwad/components/ad/interstitial/aggregate/TransViewPager;

    iget-object p2, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->iw:Lcom/kwad/components/ad/interstitial/aggregate/a;

    invoke-virtual {p1, p2}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 15
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->iw:Lcom/kwad/components/ad/interstitial/aggregate/a;

    iget-object p2, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->im:Ljava/util/List;

    invoke-virtual {p1, p2}, Lcom/kwad/components/ad/interstitial/aggregate/a;->d(Ljava/util/List;)V

    .line 16
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->iw:Lcom/kwad/components/ad/interstitial/aggregate/a;

    invoke-virtual {p1}, Landroidx/viewpager/widget/PagerAdapter;->notifyDataSetChanged()V

    .line 17
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->bQ:Lcom/kwad/components/core/widget/a/b;

    invoke-virtual {p1}, Lcom/kwad/components/core/widget/a/a;->ua()V

    .line 18
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->ix:Lcom/kwad/components/ad/interstitial/aggregate/ViewPagerIndicator;

    if-nez p1, :cond_1

    return-void

    .line 19
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz p1, :cond_4

    .line 20
    invoke-static {}, Lcom/kwad/sdk/utils/aj;->ML()Z

    move-result p2

    iput-boolean p2, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->iD:Z

    .line 21
    iget-object p3, p0, Lcom/kwad/components/ad/interstitial/g/a;->mContext:Landroid/content/Context;

    if-eqz p2, :cond_3

    .line 22
    iget-boolean p2, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->iq:Z

    if-eqz p2, :cond_2

    const/16 p2, 0xc

    goto :goto_1

    :cond_2
    const/4 p2, 0x4

    :goto_1
    int-to-float p2, p2

    goto :goto_2

    :cond_3
    const/high16 p2, 0x40c00000    # 6.0f

    .line 23
    :goto_2
    invoke-static {p3, p2}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result p2

    iput p2, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 24
    iget-object p2, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->ix:Lcom/kwad/components/ad/interstitial/aggregate/ViewPagerIndicator;

    invoke-virtual {p2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 25
    :cond_4
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->ix:Lcom/kwad/components/ad/interstitial/aggregate/ViewPagerIndicator;

    iget-object p2, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {p2}, Lcom/kwad/sdk/core/response/b/a;->cu(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/kwad/components/ad/interstitial/aggregate/ViewPagerIndicator;->setFirstAdShowTime(I)V

    .line 26
    new-instance p1, Lcom/kwad/components/ad/interstitial/aggregate/b$5;

    invoke-direct {p1, p0}, Lcom/kwad/components/ad/interstitial/aggregate/b$5;-><init>(Lcom/kwad/components/ad/interstitial/aggregate/b;)V

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final cr()V
    .locals 0

    return-void
.end method

.method public final cs()V
    .locals 0

    return-void
.end method

.method protected final onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->bQ:Lcom/kwad/components/core/widget/a/b;

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->df:Lcom/kwad/sdk/core/h/c;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/widget/a/a;->b(Lcom/kwad/sdk/core/h/c;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->bQ:Lcom/kwad/components/core/widget/a/b;

    invoke-virtual {v0}, Lcom/kwad/components/core/widget/a/a;->ub()V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->im:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->iv:Lcom/kwad/components/ad/interstitial/aggregate/TransViewPager;

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->clearOnPageChangeListeners()V

    .line 6
    invoke-static {}, Lcom/kwad/components/ad/interstitial/aggregate/c;->cx()Lcom/kwad/components/ad/interstitial/aggregate/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/ad/interstitial/aggregate/c;->release()V

    return-void
.end method

.method public final setAdInteractionListener(Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/aggregate/b;->ie:Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;

    return-void
.end method
