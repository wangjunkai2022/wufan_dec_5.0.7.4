.class public Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/utils/bs$a;


# instance fields
.field private AC:Landroid/view/ViewGroup;

.field private AE:Lcom/kwad/components/core/widget/KSCornerImageView;

.field private AF:Lcom/kwad/components/core/widget/KSCornerImageView;

.field private AG:Lcom/kwad/components/core/widget/KSCornerImageView;

.field private AH:Landroid/widget/TextView;

.field private AI:Landroid/view/View;

.field private AJ:Landroid/view/View;

.field private AK:Landroid/widget/ImageView;

.field private AL:Landroid/view/View;

.field private AM:Landroid/view/View;

.field private AN:Landroid/view/View;

.field private AO:Landroid/view/View;

.field private final hh:Lcom/kwad/sdk/utils/bs;

.field private zA:Lcom/kwad/components/core/widget/KSCornerImageView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance v0, Lcom/kwad/sdk/utils/bs;

    invoke-direct {v0, p0}, Lcom/kwad/sdk/utils/bs;-><init>(Lcom/kwad/sdk/utils/bs$a;)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->hh:Lcom/kwad/sdk/utils/bs;

    .line 3
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->P(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 4
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 5
    new-instance p2, Lcom/kwad/sdk/utils/bs;

    invoke-direct {p2, p0}, Lcom/kwad/sdk/utils/bs;-><init>(Lcom/kwad/sdk/utils/bs$a;)V

    iput-object p2, p0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->hh:Lcom/kwad/sdk/utils/bs;

    .line 6
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->P(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 7
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 8
    new-instance p2, Lcom/kwad/sdk/utils/bs;

    invoke-direct {p2, p0}, Lcom/kwad/sdk/utils/bs;-><init>(Lcom/kwad/sdk/utils/bs$a;)V

    iput-object p2, p0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->hh:Lcom/kwad/sdk/utils/bs;

    .line 9
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->P(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 10
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 11
    new-instance p2, Lcom/kwad/sdk/utils/bs;

    invoke-direct {p2, p0}, Lcom/kwad/sdk/utils/bs;-><init>(Lcom/kwad/sdk/utils/bs$a;)V

    iput-object p2, p0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->hh:Lcom/kwad/sdk/utils/bs;

    .line 12
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->P(Landroid/content/Context;)V

    return-void
.end method

.method private P(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    sget v0, Lcom/kwad/sdk/R$layout;->ksad_author_icon:I

    invoke-static {p1, v0, p0}, Lcom/kwad/sdk/n/l;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 2
    sget p1, Lcom/kwad/sdk/R$id;->ksad_author_icon_frame:I

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->AC:Landroid/view/ViewGroup;

    .line 3
    sget p1, Lcom/kwad/sdk/R$id;->ksad_author_icon:I

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/kwad/components/core/widget/KSCornerImageView;

    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->zA:Lcom/kwad/components/core/widget/KSCornerImageView;

    .line 4
    sget p1, Lcom/kwad/sdk/R$id;->ksad_author_icon_outer:I

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/kwad/components/core/widget/KSCornerImageView;

    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->AE:Lcom/kwad/components/core/widget/KSCornerImageView;

    .line 5
    sget p1, Lcom/kwad/sdk/R$id;->ksad_author_animator:I

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/kwad/components/core/widget/KSCornerImageView;

    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->AF:Lcom/kwad/components/core/widget/KSCornerImageView;

    .line 6
    sget p1, Lcom/kwad/sdk/R$id;->ksad_author_animator2:I

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/kwad/components/core/widget/KSCornerImageView;

    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->AG:Lcom/kwad/components/core/widget/KSCornerImageView;

    .line 7
    sget p1, Lcom/kwad/sdk/R$id;->ksad_fans_count:I

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->AH:Landroid/widget/TextView;

    .line 8
    sget p1, Lcom/kwad/sdk/R$id;->ksad_fans_hot_icon:I

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->AJ:Landroid/view/View;

    .line 9
    sget p1, Lcom/kwad/sdk/R$id;->ksad_author_btn_follow:I

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->AI:Landroid/view/View;

    .line 10
    sget p1, Lcom/kwad/sdk/R$id;->ksad_author_arrow_down:I

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->AK:Landroid/widget/ImageView;

    .line 11
    sget p1, Lcom/kwad/sdk/R$id;->ksad_origin_live_bottom_layout:I

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->AM:Landroid/view/View;

    .line 12
    sget p1, Lcom/kwad/sdk/R$id;->ksad_top_layout:I

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->AL:Landroid/view/View;

    .line 13
    sget p1, Lcom/kwad/sdk/R$id;->ksad_author_icon_layout:I

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->AO:Landroid/view/View;

    .line 14
    sget p1, Lcom/kwad/sdk/R$id;->ksad_top_flag_layout:I

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->AN:Landroid/view/View;

    return-void
.end method

.method private a(Lcom/kwad/components/core/widget/e;Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 7
    instance-of v0, p2, Landroid/graphics/drawable/GradientDrawable;

    if-eqz v0, :cond_0

    .line 8
    check-cast p2, Landroid/graphics/drawable/GradientDrawable;

    .line 9
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/kwad/sdk/R$dimen;->ksad_reward_author_icon_stroke_width:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 10
    invoke-virtual {p1}, Lcom/kwad/components/core/widget/e;->tX()I

    move-result p1

    invoke-virtual {p2, v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    :cond_0
    return-void
.end method

.method private c(Landroid/view/View;J)Landroid/animation/Animator;
    .locals 7

    if-eqz p1, :cond_1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    .line 4
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/kwad/sdk/R$dimen;->ksad_reward_author_icon_width:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    const/4 v2, 0x2

    new-array v3, v2, [F

    const/4 v4, 0x0

    aput v0, v3, v4

    const/4 v0, 0x1

    aput v1, v3, v0

    .line 5
    invoke-static {v3}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    .line 6
    invoke-static {p1, v4}, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->f(Landroid/view/View;Z)Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-array v3, v2, [F

    .line 7
    fill-array-data v3, :array_0

    const-string v5, "alpha"

    invoke-static {p1, v5, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    const v3, 0x3ed70a3d    # 0.42f

    const/4 v5, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    .line 8
    invoke-static {v3, v5, v6, v6}, Landroidx/core/view/animation/PathInterpolatorCompat;->create(FFFF)Landroid/view/animation/Interpolator;

    move-result-object v3

    .line 9
    new-instance v5, Landroid/animation/AnimatorSet;

    invoke-direct {v5}, Landroid/animation/AnimatorSet;-><init>()V

    .line 10
    invoke-virtual {v5, p2, p3}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 11
    invoke-virtual {v5, v3}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-array p2, v2, [Landroid/animation/Animator;

    aput-object v1, p2, v4

    aput-object p1, p2, v0

    .line 12
    invoke-virtual {v5, p2}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    return-object v5

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method private static e(Landroid/view/View;Z)Landroid/animation/Animator;
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    int-to-float p1, p1

    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    if-gtz v1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const v1, 0x3f666666    # 0.9f

    mul-float v1, v1, p1

    .line 2
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "getIconScaleAnimator size: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v3, ", endSize: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "KsAuthorIconView"

    invoke-static {v3, v2}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x2

    new-array v3, v2, [F

    const/4 v4, 0x0

    aput p1, v3, v4

    const/4 v5, 0x1

    aput v1, v3, v5

    .line 3
    invoke-static {v3}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v3

    .line 4
    invoke-static {p0, v4}, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->f(Landroid/view/View;Z)Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    move-result-object v6

    invoke-virtual {v3, v6}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const v6, 0x3ed70a3d    # 0.42f

    const/high16 v7, 0x3f800000    # 1.0f

    .line 5
    invoke-static {v6, v0, v7, v7}, Landroidx/core/view/animation/PathInterpolatorCompat;->create(FFFF)Landroid/view/animation/Interpolator;

    move-result-object v6

    const-wide/16 v8, 0x1f4

    .line 6
    invoke-virtual {v3, v8, v9}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 7
    invoke-virtual {v3, v6}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-array v6, v2, [F

    aput v1, v6, v4

    aput p1, v6, v5

    .line 8
    invoke-static {v6}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p1

    .line 9
    invoke-static {p0, v4}, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->f(Landroid/view/View;Z)Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const p0, 0x3f147ae1    # 0.58f

    .line 10
    invoke-static {v0, v0, p0, v7}, Landroidx/core/view/animation/PathInterpolatorCompat;->create(FFFF)Landroid/view/animation/Interpolator;

    move-result-object p0

    .line 11
    invoke-virtual {p1, v8, v9}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 12
    invoke-virtual {p1, p0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 13
    new-instance p0, Landroid/animation/AnimatorSet;

    invoke-direct {p0}, Landroid/animation/AnimatorSet;-><init>()V

    new-array v0, v2, [Landroid/animation/Animator;

    aput-object v3, v0, v4

    aput-object p1, v0, v5

    .line 14
    invoke-virtual {p0, v0}, Landroid/animation/AnimatorSet;->playSequentially([Landroid/animation/Animator;)V

    return-object p0
.end method

.method private static f(Landroid/view/View;Z)Landroid/animation/ValueAnimator$AnimatorUpdateListener;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView$1;

    invoke-direct {v0, p0, p1}, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView$1;-><init>(Landroid/view/View;Z)V

    return-object v0
.end method

.method private static i(Landroid/view/View;I)Landroid/animation/Animator;
    .locals 13

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 1
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float p1, p1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr p1, v1

    .line 3
    invoke-virtual {p0, p1}, Landroid/view/View;->setPivotX(F)V

    int-to-float p1, v0

    .line 4
    invoke-virtual {p0, p1}, Landroid/view/View;->setPivotY(F)V

    .line 5
    new-instance p1, Landroid/animation/AnimatorSet;

    invoke-direct {p1}, Landroid/animation/AnimatorSet;-><init>()V

    const v0, 0x3ed70a3d    # 0.42f

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    .line 6
    invoke-static {v0, v1, v2, v2}, Landroidx/core/view/animation/PathInterpolatorCompat;->create(FFFF)Landroid/view/animation/Interpolator;

    move-result-object v0

    const/4 v3, 0x3

    new-array v4, v3, [F

    .line 7
    fill-array-data v4, :array_0

    const-string v5, "scaleX"

    invoke-static {p0, v5, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v4

    new-array v6, v3, [F

    .line 8
    fill-array-data v6, :array_1

    const-string v7, "scaleY"

    invoke-static {p0, v7, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v6

    const/4 v8, 0x2

    new-array v9, v8, [Landroid/animation/Animator;

    const/4 v10, 0x0

    aput-object v4, v9, v10

    const/4 v4, 0x1

    aput-object v6, v9, v4

    .line 9
    invoke-virtual {p1, v9}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 10
    invoke-virtual {p1, v0}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    const-wide/16 v11, 0xfa

    .line 11
    invoke-virtual {p1, v11, v12}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 12
    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    const v6, 0x3f147ae1    # 0.58f

    .line 13
    invoke-static {v1, v1, v6, v2}, Landroidx/core/view/animation/PathInterpolatorCompat;->create(FFFF)Landroid/view/animation/Interpolator;

    move-result-object v1

    new-array v2, v3, [F

    .line 14
    fill-array-data v2, :array_2

    invoke-static {p0, v5, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v2

    new-array v3, v3, [F

    .line 15
    fill-array-data v3, :array_3

    invoke-static {p0, v7, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p0

    new-array v3, v8, [Landroid/animation/Animator;

    aput-object v2, v3, v10

    aput-object p0, v3, v4

    .line 16
    invoke-virtual {v0, v3}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 17
    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 18
    invoke-virtual {v0, v11, v12}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 19
    new-instance p0, Landroid/animation/AnimatorSet;

    invoke-direct {p0}, Landroid/animation/AnimatorSet;-><init>()V

    new-array v1, v8, [Landroid/animation/Animator;

    aput-object p1, v1, v10

    aput-object v0, v1, v4

    .line 20
    invoke-virtual {p0, v1}, Landroid/animation/AnimatorSet;->playSequentially([Landroid/animation/Animator;)V

    const-wide/16 v0, 0x1f4

    .line 21
    invoke-virtual {p0, v0, v1}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    return-object p0

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f8ccccd    # 1.1f
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x3f8ccccd    # 1.1f
        0x3f800000    # 1.0f
    .end array-data

    :array_2
    .array-data 4
        0x3f800000    # 1.0f
        0x3f8ccccd    # 1.1f
        0x3f800000    # 1.0f
    .end array-data

    :array_3
    .array-data 4
        0x3f800000    # 1.0f
        0x3f8ccccd    # 1.1f
        0x3f800000    # 1.0f
    .end array-data
.end method


# virtual methods
.method public final a(Landroid/os/Message;)V
    .locals 9

    .line 11
    iget p1, p1, Landroid/os/Message;->what:I

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "KsAuthorIconView"

    const-string v1, "handleMsg MSG_CHECKING"

    .line 12
    invoke-static {p1, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    iget-object p1, p0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->AF:Lcom/kwad/components/core/widget/KSCornerImageView;

    const-wide/16 v1, 0x384

    invoke-direct {p0, p1, v1, v2}, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->c(Landroid/view/View;J)Landroid/animation/Animator;

    move-result-object v5

    .line 14
    iget-object p1, p0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->AG:Lcom/kwad/components/core/widget/KSCornerImageView;

    const-wide/16 v1, 0x3e8

    invoke-direct {p0, p1, v1, v2}, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->c(Landroid/view/View;J)Landroid/animation/Animator;

    move-result-object v6

    .line 15
    iget-object p1, p0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->zA:Lcom/kwad/components/core/widget/KSCornerImageView;

    const/4 v1, 0x0

    invoke-static {p1, v1}, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->e(Landroid/view/View;Z)Landroid/animation/Animator;

    move-result-object p1

    .line 16
    iget-object v2, p0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->AL:Landroid/view/View;

    const/16 v3, 0x1f4

    invoke-static {v2, v3}, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->i(Landroid/view/View;I)Landroid/animation/Animator;

    move-result-object v8

    if-eqz v8, :cond_1

    if-eqz v5, :cond_1

    if-eqz v6, :cond_1

    if-eqz p1, :cond_1

    .line 17
    new-instance v2, Landroid/animation/AnimatorSet;

    invoke-direct {v2}, Landroid/animation/AnimatorSet;-><init>()V

    const/4 v3, 0x3

    new-array v3, v3, [Landroid/animation/Animator;

    aput-object p1, v3, v1

    aput-object v5, v3, v0

    const/4 v0, 0x2

    aput-object v6, v3, v0

    .line 18
    invoke-virtual {v2, v3}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 19
    invoke-virtual {v2}, Landroid/animation/AnimatorSet;->start()V

    .line 20
    new-instance v0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView$2;

    move-object v3, v0

    move-object v4, p0

    move-object v7, p1

    invoke-direct/range {v3 .. v8}, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView$2;-><init>(Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;Landroid/animation/Animator;Landroid/animation/Animator;Landroid/animation/Animator;Landroid/animation/Animator;)V

    invoke-virtual {p1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    return-void

    .line 21
    :cond_1
    iget-object p1, p0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->hh:Lcom/kwad/sdk/utils/bs;

    const-wide/16 v1, 0x1f4

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :goto_0
    return-void
.end method

.method public final a(Lcom/kwad/components/core/widget/e;)V
    .locals 2

    .line 1
    invoke-static {p1, p0}, Lcom/kwad/components/core/s/i;->a(Lcom/kwad/components/core/widget/e;Landroid/view/ViewGroup;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->AK:Landroid/widget/ImageView;

    sget v1, Lcom/kwad/sdk/R$drawable;->ksad_reward_follow_arrow_down:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->AF:Lcom/kwad/components/core/widget/KSCornerImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->a(Lcom/kwad/components/core/widget/e;Landroid/graphics/drawable/Drawable;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->AE:Lcom/kwad/components/core/widget/KSCornerImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->a(Lcom/kwad/components/core/widget/e;Landroid/graphics/drawable/Drawable;)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->AG:Lcom/kwad/components/core/widget/KSCornerImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->a(Lcom/kwad/components/core/widget/e;Landroid/graphics/drawable/Drawable;)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->AC:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->a(Lcom/kwad/components/core/widget/e;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final b(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->cg(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 4
    iget-object v2, p0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->zA:Lcom/kwad/components/core/widget/KSCornerImageView;

    invoke-static {v2, v1, p1}, Lcom/kwad/sdk/core/imageloader/KSImageLoader;->loadImage(Landroid/widget/ImageView;Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 5
    :cond_0
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->be(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v1

    .line 6
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p1

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->cM(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 7
    iget-object p1, p0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->AH:Landroid/widget/TextView;

    const-string v0, "\u76f4\u64ad\u4e2d"

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    iget-object p1, p0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->AJ:Landroid/view/View;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 9
    iget-object p1, p0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->AI:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    const/4 p1, 0x0

    if-ne v1, v0, :cond_1

    .line 10
    iget-object v1, p0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->AN:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 11
    iget-object v1, p0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->AK:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 12
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->AM:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 13
    :cond_1
    iget-object v1, p0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->AM:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 14
    iget-object v1, p0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->AK:Landroid/widget/ImageView;

    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 15
    iget-object p1, p0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->AM:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 16
    :cond_2
    iget-object p1, p0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->AH:Landroid/widget/TextView;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->cH(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    :goto_0
    iget-object p1, p0, Lcom/kwad/components/ad/reward/widget/KsAuthorIconView;->hh:Lcom/kwad/sdk/utils/bs;

    const/4 v0, 0x1

    const-wide/16 v1, 0x1f4

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageAtTime(IJ)Z

    return-void
.end method
