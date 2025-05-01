.class public final Lcom/kwad/components/ad/reward/presenter/platdetail/b;
.super Lcom/kwad/components/ad/reward/presenter/b;
.source "SourceFile"


# instance fields
.field private gO:Lcom/kwad/components/core/video/l;

.field private final ua:J

.field private final ub:J

.field private final uc:J

.field private ud:Landroid/view/View;

.field private ue:Landroid/view/View;

.field private uf:Landroid/view/View;

.field private ug:Landroid/view/View;

.field private uh:Z

.field private ui:Z

.field private uj:Landroid/animation/Animator;

.field private uk:Landroid/animation/Animator;

.field private ul:Landroid/animation/Animator;

.field private um:Landroid/animation/Animator;

.field private un:J

.field private uo:Lcom/kwad/sdk/utils/be;

.field private up:Lcom/kwad/sdk/utils/be;

.field private uq:Landroid/view/animation/Interpolator;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/b;-><init>()V

    const-wide/16 v0, 0x640

    .line 2
    iput-wide v0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->ua:J

    const-wide/16 v0, 0xbb8

    .line 3
    iput-wide v0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->ub:J

    const-wide/16 v2, 0x1388

    .line 4
    iput-wide v2, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->uc:J

    const/4 v2, 0x0

    .line 5
    iput-boolean v2, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->uh:Z

    .line 6
    iput-boolean v2, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->ui:Z

    const/4 v2, 0x0

    .line 7
    iput-object v2, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->um:Landroid/animation/Animator;

    .line 8
    iput-wide v0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->un:J

    const/4 v0, 0x0

    const v1, 0x3f147ae1    # 0.58f

    const/high16 v2, 0x3f800000    # 1.0f

    .line 9
    invoke-static {v0, v0, v1, v2}, Landroidx/core/view/animation/PathInterpolatorCompat;->create(FFFF)Landroid/view/animation/Interpolator;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->uq:Landroid/view/animation/Interpolator;

    .line 10
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/platdetail/b$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/presenter/platdetail/b$1;-><init>(Lcom/kwad/components/ad/reward/presenter/platdetail/b;)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->gO:Lcom/kwad/components/core/video/l;

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/reward/presenter/platdetail/b;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->un:J

    return-wide v0
.end method

.method private a(Landroid/view/View;J)Landroid/animation/Animator;
    .locals 8

    const/4 v0, 0x5

    new-array v0, v0, [F

    .line 20
    fill-array-data v0, :array_0

    const-string v1, "scaleX"

    .line 21
    invoke-static {p1, v1, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    const-string v2, "scaleY"

    .line 22
    invoke-static {p1, v2, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    .line 23
    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 24
    iget-object v2, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->ue:Landroid/view/View;

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x2

    if-eqz v2, :cond_0

    new-array v6, v5, [F

    .line 25
    fill-array-data v6, :array_1

    const-string v7, "alpha"

    .line 26
    invoke-static {v2, v7, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v2

    const/4 v6, 0x3

    new-array v6, v6, [Landroid/animation/Animator;

    aput-object v1, v6, v4

    aput-object p1, v6, v3

    aput-object v2, v6, v5

    .line 27
    invoke-virtual {v0, v6}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    goto :goto_0

    :cond_0
    new-array v2, v5, [Landroid/animation/Animator;

    aput-object v1, v2, v4

    aput-object p1, v2, v3

    .line 28
    invoke-virtual {v0, v2}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 29
    :goto_0
    invoke-virtual {v0, p2, p3}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 30
    iget-object p1, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->uq:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, p1}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    return-object v0

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f8d9168    # 1.106f
        0x3f800000    # 1.0f
        0x3f8d9168    # 1.106f
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x3e4ccccd    # 0.2f
        0x0
    .end array-data
.end method

.method private a(Landroid/view/View;Landroid/view/View;)Landroid/animation/Animator;
    .locals 6

    .line 12
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->o(Landroid/view/View;)Landroid/animation/Animator;

    move-result-object p1

    .line 13
    invoke-direct {p0, p2}, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->o(Landroid/view/View;)Landroid/animation/Animator;

    move-result-object v0

    const/4 v1, 0x1

    new-array v2, v1, [F

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    aput v3, v2, v4

    const-string v3, "scaleX"

    .line 14
    invoke-static {p2, v3, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p2

    const-wide/16 v2, 0x12c

    .line 15
    invoke-virtual {p2, v2, v3}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    .line 16
    new-instance v2, Landroid/animation/AnimatorSet;

    invoke-direct {v2}, Landroid/animation/AnimatorSet;-><init>()V

    const/4 v3, 0x2

    new-array v5, v3, [Landroid/animation/Animator;

    aput-object p2, v5, v4

    aput-object v0, v5, v1

    .line 17
    invoke-virtual {v2, v5}, Landroid/animation/AnimatorSet;->playSequentially([Landroid/animation/Animator;)V

    .line 18
    new-instance p2, Landroid/animation/AnimatorSet;

    invoke-direct {p2}, Landroid/animation/AnimatorSet;-><init>()V

    new-array v0, v3, [Landroid/animation/Animator;

    aput-object p1, v0, v4

    aput-object v2, v0, v1

    .line 19
    invoke-virtual {p2, v0}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    return-object p2
.end method

.method static synthetic a(Lcom/kwad/components/ad/reward/presenter/platdetail/b;Landroid/animation/Animator;)Landroid/animation/Animator;
    .locals 0

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->um:Landroid/animation/Animator;

    return-object p1
.end method

.method private a(ILandroid/view/ViewGroup;)Landroid/view/View;
    .locals 3
    .param p1    # I
        .annotation build Landroidx/annotation/DrawableRes;
        .end annotation
    .end param

    .line 5
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/kwad/sdk/R$layout;->ksad_image_player_sweep:I

    const/4 v2, 0x0

    .line 6
    invoke-virtual {v0, v1, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    .line 7
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 8
    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-object p2
.end method

.method private a(Landroid/animation/Animator;)V
    .locals 1
    .param p1    # Landroid/animation/Animator;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 9
    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->uh:Z

    if-nez v0, :cond_0

    .line 10
    invoke-virtual {p1}, Landroid/animation/Animator;->start()V

    return-void

    .line 11
    :cond_0
    iput-object p1, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->um:Landroid/animation/Animator;

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/reward/presenter/platdetail/b;Landroid/view/View;)V
    .locals 0

    .line 3
    invoke-static {p1}, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->p(Landroid/view/View;)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/reward/presenter/platdetail/b;Z)Z
    .locals 0

    .line 4
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->uh:Z

    return p1
.end method

.method private b(Landroid/view/View;J)Landroid/animation/Animator;
    .locals 5

    const-wide/16 p2, 0x640

    .line 5
    invoke-direct {p0, p1, p2, p3}, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->a(Landroid/view/View;J)Landroid/animation/Animator;

    move-result-object v0

    const/4 v1, 0x1

    new-array v2, v1, [F

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    aput v3, v2, v4

    const-string v3, "alpha"

    .line 6
    invoke-static {p1, v3, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    const-wide/16 v2, 0x1388

    .line 7
    invoke-virtual {p1, v2, v3}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    .line 8
    new-instance v2, Landroid/animation/AnimatorSet;

    invoke-direct {v2}, Landroid/animation/AnimatorSet;-><init>()V

    const/4 v3, 0x2

    new-array v3, v3, [Landroid/animation/Animator;

    aput-object v0, v3, v4

    aput-object p1, v3, v1

    .line 9
    invoke-virtual {v2, v3}, Landroid/animation/AnimatorSet;->playSequentially([Landroid/animation/Animator;)V

    .line 10
    invoke-virtual {v2, p2, p3}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    return-object v2
.end method

.method static synthetic b(Lcom/kwad/components/ad/reward/presenter/platdetail/b;Landroid/view/View;)Landroid/view/View;
    .locals 0

    const/4 p1, 0x0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->ue:Landroid/view/View;

    return-object p1
.end method

.method static synthetic b(Lcom/kwad/components/ad/reward/presenter/platdetail/b;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->hU()V

    return-void
.end method

.method static synthetic b(Lcom/kwad/components/ad/reward/presenter/platdetail/b;Landroid/animation/Animator;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->a(Landroid/animation/Animator;)V

    return-void
.end method

.method static synthetic b(Lcom/kwad/components/ad/reward/presenter/platdetail/b;Z)Z
    .locals 0

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->ui:Z

    return p1
.end method

.method static synthetic c(Lcom/kwad/components/ad/reward/presenter/platdetail/b;)Landroid/animation/Animator;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->um:Landroid/animation/Animator;

    return-object p0
.end method

.method static synthetic c(Lcom/kwad/components/ad/reward/presenter/platdetail/b;Landroid/view/View;)Landroid/view/View;
    .locals 0

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->uf:Landroid/view/View;

    return-object p1
.end method

.method static synthetic d(Lcom/kwad/components/ad/reward/presenter/platdetail/b;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->ue:Landroid/view/View;

    return-object p0
.end method

.method static synthetic d(Lcom/kwad/components/ad/reward/presenter/platdetail/b;Landroid/view/View;)Landroid/view/View;
    .locals 0

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->ug:Landroid/view/View;

    return-object p1
.end method

.method static synthetic e(Lcom/kwad/components/ad/reward/presenter/platdetail/b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->ui:Z

    return p0
.end method

.method static synthetic f(Lcom/kwad/components/ad/reward/presenter/platdetail/b;)Landroid/animation/Animator;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->uk:Landroid/animation/Animator;

    return-object p0
.end method

.method static synthetic g(Lcom/kwad/components/ad/reward/presenter/platdetail/b;)Landroid/animation/Animator;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->ul:Landroid/animation/Animator;

    return-object p0
.end method

.method static synthetic h(Lcom/kwad/components/ad/reward/presenter/platdetail/b;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->uf:Landroid/view/View;

    return-object p0
.end method

.method private hS()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/kwad/sdk/R$dimen;->ksad_image_player_sweep_wave_width_start:I

    .line 2
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 3
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/kwad/sdk/R$dimen;->ksad_image_player_sweep_wave_height_start:I

    .line 4
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 5
    new-instance v2, Lcom/kwad/sdk/utils/be;

    invoke-direct {v2, v0, v1}, Lcom/kwad/sdk/utils/be;-><init>(II)V

    iput-object v2, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->uo:Lcom/kwad/sdk/utils/be;

    .line 6
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/kwad/sdk/R$dimen;->ksad_image_player_sweep_wave_width_end:I

    .line 7
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 8
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/kwad/sdk/R$dimen;->ksad_image_player_sweep_wave_height_end:I

    .line 9
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 10
    new-instance v2, Lcom/kwad/sdk/utils/be;

    invoke-direct {v2, v0, v1}, Lcom/kwad/sdk/utils/be;-><init>(II)V

    iput-object v2, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->up:Lcom/kwad/sdk/utils/be;

    return-void
.end method

.method private hT()Landroid/view/View;
    .locals 2

    .line 1
    new-instance v0, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setClickable(Z)V

    .line 3
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setFocusable(Z)V

    .line 4
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setFocusableInTouchMode(Z)V

    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setLongClickable(Z)V

    const-string v1, "#222222"

    .line 6
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    const v1, 0x3e4ccccd    # 0.2f

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAlpha(F)V

    return-object v0
.end method

.method private hU()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->ud:Landroid/view/View;

    const-wide/16 v1, 0x640

    invoke-direct {p0, v0, v1, v2}, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->a(Landroid/view/View;J)Landroid/animation/Animator;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->uj:Landroid/animation/Animator;

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->uf:Landroid/view/View;

    iget-object v3, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->ug:Landroid/view/View;

    invoke-direct {p0, v0, v3}, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->a(Landroid/view/View;Landroid/view/View;)Landroid/animation/Animator;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->uk:Landroid/animation/Animator;

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->ud:Landroid/view/View;

    invoke-direct {p0, v0, v1, v2}, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->b(Landroid/view/View;J)Landroid/animation/Animator;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->ul:Landroid/animation/Animator;

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->uj:Landroid/animation/Animator;

    new-instance v1, Lcom/kwad/components/ad/reward/presenter/platdetail/b$2;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/reward/presenter/platdetail/b$2;-><init>(Lcom/kwad/components/ad/reward/presenter/platdetail/b;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->uk:Landroid/animation/Animator;

    new-instance v1, Lcom/kwad/components/ad/reward/presenter/platdetail/b$3;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/reward/presenter/platdetail/b$3;-><init>(Lcom/kwad/components/ad/reward/presenter/platdetail/b;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->ul:Landroid/animation/Animator;

    new-instance v1, Lcom/kwad/components/ad/reward/presenter/platdetail/b$4;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/reward/presenter/platdetail/b$4;-><init>(Lcom/kwad/components/ad/reward/presenter/platdetail/b;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->uj:Landroid/animation/Animator;

    invoke-direct {p0, v0}, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->a(Landroid/animation/Animator;)V

    return-void
.end method

.method static synthetic i(Lcom/kwad/components/ad/reward/presenter/platdetail/b;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->ug:Landroid/view/View;

    return-object p0
.end method

.method private o(Landroid/view/View;)Landroid/animation/Animator;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->uo:Lcom/kwad/sdk/utils/be;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->up:Lcom/kwad/sdk/utils/be;

    if-nez v0, :cond_1

    .line 2
    :cond_0
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->hS()V

    .line 3
    :cond_1
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/c/a/a;->getScreenHeight(Landroid/content/Context;)I

    move-result v0

    .line 4
    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->up:Lcom/kwad/sdk/utils/be;

    invoke-virtual {v1}, Lcom/kwad/sdk/utils/be;->getHeight()I

    move-result v1

    iget-object v2, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->uo:Lcom/kwad/sdk/utils/be;

    invoke-virtual {v2}, Lcom/kwad/sdk/utils/be;->getHeight()I

    move-result v2

    add-int/2addr v1, v2

    const/4 v2, 0x2

    div-int/2addr v1, v2

    const/4 v3, 0x1

    new-array v4, v3, [F

    add-int/2addr v0, v1

    neg-int v0, v0

    int-to-float v0, v0

    const/4 v1, 0x0

    aput v0, v4, v1

    const-string v0, "translationY"

    .line 5
    invoke-static {p1, v0, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 6
    iget-object v4, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->up:Lcom/kwad/sdk/utils/be;

    invoke-virtual {v4}, Lcom/kwad/sdk/utils/be;->Ns()F

    move-result v4

    iget-object v5, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->uo:Lcom/kwad/sdk/utils/be;

    invoke-virtual {v5}, Lcom/kwad/sdk/utils/be;->Ns()F

    move-result v5

    div-float/2addr v4, v5

    .line 7
    iget-object v5, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->up:Lcom/kwad/sdk/utils/be;

    invoke-virtual {v5}, Lcom/kwad/sdk/utils/be;->Nt()F

    move-result v5

    iget-object v6, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->uo:Lcom/kwad/sdk/utils/be;

    invoke-virtual {v6}, Lcom/kwad/sdk/utils/be;->Nt()F

    move-result v6

    div-float/2addr v5, v6

    new-array v6, v2, [F

    const/high16 v7, 0x3f800000    # 1.0f

    aput v7, v6, v1

    aput v4, v6, v3

    const-string v4, "scaleX"

    .line 8
    invoke-static {p1, v4, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v4

    new-array v6, v2, [F

    aput v7, v6, v1

    aput v5, v6, v3

    const-string v5, "scaleY"

    .line 9
    invoke-static {p1, v5, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v5

    new-array v6, v2, [F

    .line 10
    fill-array-data v6, :array_0

    const-string v7, "alpha"

    invoke-static {p1, v7, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    .line 11
    new-instance v6, Landroid/animation/AnimatorSet;

    invoke-direct {v6}, Landroid/animation/AnimatorSet;-><init>()V

    const-wide/16 v7, 0xbb8

    .line 12
    invoke-virtual {v6, v7, v8}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    const/4 v7, 0x4

    new-array v7, v7, [Landroid/animation/Animator;

    aput-object v4, v7, v1

    aput-object v5, v7, v3

    aput-object v0, v7, v2

    const/4 v0, 0x3

    aput-object p1, v7, v0

    .line 13
    invoke-virtual {v6, v7}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 14
    iget-object p1, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->uq:Landroid/view/animation/Interpolator;

    invoke-virtual {v6, p1}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    return-object v6

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f4ccccd    # 0.8f
    .end array-data
.end method

.method private static p(Landroid/view/View;)V
    .locals 1

    if-eqz p0, :cond_0

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 3
    invoke-static {p0}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-void
.end method


# virtual methods
.method public final aj()V
    .locals 4

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/reward/presenter/b;->aj()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->oK:Lcom/kwad/components/ad/reward/m/e;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->gO:Lcom/kwad/components/core/video/l;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/m/e;->a(Lcom/kwad/components/core/video/l;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->oK:Lcom/kwad/components/ad/reward/m/e;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/m/e;->jP()Lcom/kwad/components/ad/reward/m/b;

    move-result-object v0

    .line 4
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/m/b;->O(Landroid/content/Context;)Landroid/widget/FrameLayout;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->ud:Landroid/view/View;

    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    return-void

    .line 6
    :cond_0
    sget v0, Lcom/kwad/sdk/R$id;->ksad_reward_play_layout:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 7
    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->ud:Landroid/view/View;

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;II)V

    .line 8
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v2, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0x51

    .line 9
    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 10
    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->uo:Lcom/kwad/sdk/utils/be;

    invoke-virtual {v1}, Lcom/kwad/sdk/utils/be;->getHeight()I

    move-result v1

    neg-int v1, v1

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 11
    sget v1, Lcom/kwad/sdk/R$id;->ksad_root_container:I

    invoke-virtual {p0, v1}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout;

    .line 12
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->hT()Landroid/view/View;

    move-result-object v3

    iput-object v3, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->ue:Landroid/view/View;

    .line 13
    invoke-virtual {v1, v3, v2, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;II)V

    .line 14
    sget v2, Lcom/kwad/sdk/R$drawable;->ksad_image_player_sweep1:I

    invoke-direct {p0, v2, v1}, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->a(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    iput-object v2, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->uf:Landroid/view/View;

    .line 15
    invoke-virtual {v1, v2, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 16
    sget v2, Lcom/kwad/sdk/R$drawable;->ksad_image_player_sweep2:I

    invoke-direct {p0, v2, v1}, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->a(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    iput-object v2, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->ug:Landroid/view/View;

    .line 17
    invoke-virtual {v1, v2, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final onCreate()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onCreate()V

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->hS()V

    return-void
.end method

.method public final onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onDestroy()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->ud:Landroid/view/View;

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->oK:Lcom/kwad/components/ad/reward/m/e;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/m/e;->jP()Lcom/kwad/components/ad/reward/m/b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/m/b;->release()V

    :cond_0
    return-void
.end method

.method public final onUnbind()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onUnbind()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->uh:Z

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->uk:Landroid/animation/Animator;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->uj:Landroid/animation/Animator;

    if-eqz v0, :cond_1

    .line 6
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->ul:Landroid/animation/Animator;

    if-eqz v0, :cond_2

    .line 8
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    .line 9
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->oK:Lcom/kwad/components/ad/reward/m/e;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/b;->gO:Lcom/kwad/components/core/video/l;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/m/e;->b(Lcom/kwad/components/core/video/l;)V

    return-void
.end method
