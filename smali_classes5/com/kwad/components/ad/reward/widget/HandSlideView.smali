.class public Lcom/kwad/components/ad/reward/widget/HandSlideView;
.super Lcom/kwad/sdk/widget/KSFrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/ad/reward/widget/HandSlideView$a;
    }
.end annotation


# instance fields
.field private Ab:Landroid/view/View;

.field private Ac:Landroid/animation/AnimatorSet;

.field private Ad:F

.field private Ae:F

.field private Af:F

.field private Ag:J

.field private Ah:J

.field private Ai:I

.field private Aj:I

.field private fi:Landroid/widget/ImageView;

.field private started:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/sdk/widget/KSFrameLayout;-><init>(Landroid/content/Context;)V

    const-wide/16 v0, 0x258

    .line 2
    iput-wide v0, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->Ag:J

    const-wide/16 v0, 0x1f4

    .line 3
    iput-wide v0, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->Ah:J

    const/4 p1, 0x3

    .line 4
    iput p1, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->Ai:I

    const/4 p1, 0x0

    .line 5
    iput p1, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->Aj:I

    .line 6
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->started:Z

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

    .line 7
    invoke-direct {p0, p1, p2}, Lcom/kwad/sdk/widget/KSFrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const-wide/16 p1, 0x258

    .line 8
    iput-wide p1, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->Ag:J

    const-wide/16 p1, 0x1f4

    .line 9
    iput-wide p1, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->Ah:J

    const/4 p1, 0x3

    .line 10
    iput p1, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->Ai:I

    const/4 p1, 0x0

    .line 11
    iput p1, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->Aj:I

    .line 12
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->started:Z

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

    .line 13
    invoke-direct {p0, p1, p2, p3}, Lcom/kwad/sdk/widget/KSFrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const-wide/16 p1, 0x258

    .line 14
    iput-wide p1, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->Ag:J

    const-wide/16 p1, 0x1f4

    .line 15
    iput-wide p1, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->Ah:J

    const/4 p1, 0x3

    .line 16
    iput p1, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->Ai:I

    const/4 p1, 0x0

    .line 17
    iput p1, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->Aj:I

    .line 18
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->started:Z

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/reward/widget/HandSlideView;)Landroid/animation/AnimatorSet;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->Ac:Landroid/animation/AnimatorSet;

    return-object p0
.end method

.method static synthetic b(Lcom/kwad/components/ad/reward/widget/HandSlideView;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->Aj:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->Aj:I

    return v0
.end method

.method private b(Landroid/view/View;Landroid/view/View;)Landroid/animation/AnimatorSet;
    .locals 13

    const/4 v0, 0x2

    new-array v1, v0, [F

    const/4 v2, 0x0

    const/4 v3, 0x0

    aput v3, v1, v2

    .line 2
    iget v4, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->Ad:F

    neg-float v4, v4

    const/4 v5, 0x1

    aput v4, v1, v5

    const-string v4, "translationY"

    invoke-static {p1, v4, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    new-array v4, v5, [F

    const/high16 v6, 0x41f00000    # 30.0f

    aput v6, v4, v2

    const-string v6, "rotation"

    .line 3
    invoke-static {p1, v6, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v4

    new-array v6, v0, [F

    .line 4
    fill-array-data v6, :array_0

    const-string v7, "alpha"

    invoke-static {p1, v7, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v6

    const-wide/16 v8, 0xa

    .line 5
    invoke-virtual {v6, v8, v9}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    new-array v8, v0, [F

    .line 6
    iget v9, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->Ae:F

    aput v9, v8, v2

    iget v9, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->Af:F

    aput v9, v8, v5

    .line 7
    invoke-static {v8}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v8

    .line 8
    invoke-static {p2}, Lcom/kwad/components/ad/reward/widget/HandSlideView;->s(Landroid/view/View;)Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-array v9, v0, [F

    .line 9
    fill-array-data v9, :array_1

    invoke-static {p2, v7, v9}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v9

    .line 10
    new-instance v10, Landroid/animation/AnimatorSet;

    invoke-direct {v10}, Landroid/animation/AnimatorSet;-><init>()V

    .line 11
    iget-wide v11, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->Ag:J

    invoke-virtual {v10, v11, v12}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    const/4 v11, 0x5

    new-array v11, v11, [Landroid/animation/Animator;

    aput-object v1, v11, v2

    aput-object v4, v11, v5

    aput-object v6, v11, v0

    const/4 v1, 0x3

    aput-object v8, v11, v1

    const/4 v1, 0x4

    aput-object v9, v11, v1

    .line 12
    invoke-virtual {v10, v11}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    const v1, 0x3e4ccccd    # 0.2f

    const/high16 v4, 0x3f800000    # 1.0f

    .line 13
    invoke-static {v3, v3, v1, v4}, Landroidx/core/view/animation/PathInterpolatorCompat;->create(FFFF)Landroid/view/animation/Interpolator;

    move-result-object v6

    invoke-virtual {v10, v6}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 14
    new-instance v6, Landroid/animation/AnimatorSet;

    invoke-direct {v6}, Landroid/animation/AnimatorSet;-><init>()V

    new-array v8, v0, [F

    .line 15
    fill-array-data v8, :array_2

    invoke-static {p2, v7, v8}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p2

    new-array v8, v0, [F

    .line 16
    fill-array-data v8, :array_3

    invoke-static {p1, v7, v8}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    new-array v7, v0, [Landroid/animation/Animator;

    aput-object p1, v7, v2

    aput-object p2, v7, v5

    .line 17
    invoke-virtual {v6, v7}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 18
    iget-wide p1, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->Ah:J

    invoke-virtual {v6, p1, p2}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 19
    invoke-static {v3, v3, v1, v4}, Landroidx/core/view/animation/PathInterpolatorCompat;->create(FFFF)Landroid/view/animation/Interpolator;

    move-result-object p1

    invoke-virtual {v6, p1}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 20
    new-instance p1, Landroid/animation/AnimatorSet;

    invoke-direct {p1}, Landroid/animation/AnimatorSet;-><init>()V

    new-array p2, v0, [Landroid/animation/Animator;

    aput-object v10, p2, v2

    aput-object v6, p2, v5

    .line 21
    invoke-virtual {p1, p2}, Landroid/animation/AnimatorSet;->playSequentially([Landroid/animation/Animator;)V

    return-object p1

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_2
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    :array_3
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method static synthetic c(Lcom/kwad/components/ad/reward/widget/HandSlideView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->Aj:I

    return p0
.end method

.method static synthetic d(Lcom/kwad/components/ad/reward/widget/HandSlideView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->Ai:I

    return p0
.end method

.method private static s(Landroid/view/View;)Landroid/animation/ValueAnimator$AnimatorUpdateListener;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/ad/reward/widget/HandSlideView$2;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/widget/HandSlideView$2;-><init>(Landroid/view/View;)V

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/kwad/components/ad/reward/widget/HandSlideView$a;)V
    .locals 2
    .param p1    # Lcom/kwad/components/ad/reward/widget/HandSlideView$a;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->started:Z

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->fi:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->Ab:Landroid/view/View;

    invoke-direct {p0, v0, v1}, Lcom/kwad/components/ad/reward/widget/HandSlideView;->b(Landroid/view/View;Landroid/view/View;)Landroid/animation/AnimatorSet;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->Ac:Landroid/animation/AnimatorSet;

    .line 4
    new-instance v1, Lcom/kwad/components/ad/reward/widget/HandSlideView$1;

    invoke-direct {v1, p0, p1}, Lcom/kwad/components/ad/reward/widget/HandSlideView$1;-><init>(Lcom/kwad/components/ad/reward/widget/HandSlideView;Lcom/kwad/components/ad/reward/widget/HandSlideView$a;)V

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 5
    iget-object p1, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->Ac:Landroid/animation/AnimatorSet;

    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->start()V

    return-void
.end method

.method public final destroy()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->started:Z

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->Ac:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->removeAllListeners()V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->Ac:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->Ac:Landroid/animation/AnimatorSet;

    :cond_0
    return-void
.end method

.method public final init(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1, p2}, Lcom/kwad/sdk/widget/KSFrameLayout;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p1

    sget p2, Lcom/kwad/sdk/R$layout;->ksad_hand_slide:I

    invoke-static {p1, p2, p0}, Landroid/widget/FrameLayout;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 3
    sget p1, Lcom/kwad/sdk/R$id;->ksad_hand_slide_hand:I

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->fi:Landroid/widget/ImageView;

    .line 4
    sget p1, Lcom/kwad/sdk/R$id;->ksad_hand_slide_tail:I

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->Ab:Landroid/view/View;

    .line 5
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, Lcom/kwad/sdk/R$dimen;->ksad_hand_slide_up:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    iput p1, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->Ad:F

    .line 6
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, Lcom/kwad/sdk/R$dimen;->ksad_hand_slide_tail_height_start:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    iput p1, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->Ae:F

    .line 7
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, Lcom/kwad/sdk/R$dimen;->ksad_hand_slide_tail_height_end:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    iput p1, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->Af:F

    return-void
.end method

.method public final isStarted()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/widget/HandSlideView;->started:Z

    return v0
.end method
