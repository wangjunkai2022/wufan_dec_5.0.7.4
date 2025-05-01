.class public final Lcom/kwad/components/ad/j/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private HJ:Landroid/view/View;

.field private HK:Ljava/lang/Runnable;

.field private HL:Z

.field private hG:Landroid/animation/Animator;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private yb:Landroid/view/View;

.field private yc:Landroid/widget/Button;

.field private yd:Landroid/widget/Button;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/ad/j/a;->HL:Z

    .line 3
    iput-object p1, p0, Lcom/kwad/components/ad/j/a;->HJ:Landroid/view/View;

    .line 4
    invoke-direct {p0}, Lcom/kwad/components/ad/j/a;->initView()V

    return-void
.end method

.method private static a(Landroid/view/View;FFJ)Landroid/animation/Animator;
    .locals 3

    div-float/2addr p1, p2

    const/4 v0, 0x2

    new-array v0, v0, [F

    const/4 v1, 0x0

    const/4 v2, 0x0

    aput v2, v0, v1

    const/4 v1, 0x1

    aput p2, v0, v1

    .line 12
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    .line 13
    invoke-virtual {v0, p3, p4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    const p3, 0x3f147ae1    # 0.58f

    const/high16 p4, 0x3f800000    # 1.0f

    .line 14
    invoke-static {v2, v2, p3, p4}, Landroidx/core/view/animation/PathInterpolatorCompat;->create(FFFF)Landroid/view/animation/Interpolator;

    move-result-object p3

    .line 15
    invoke-virtual {v0, p3}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget p4, Lcom/kwad/sdk/R$dimen;->ksad_reward_apk_info_card_actionbar_text_size:I

    .line 17
    invoke-virtual {p3, p4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p3

    .line 18
    new-instance p4, Lcom/kwad/components/ad/j/a$3;

    invoke-direct {p4, p1, p2, p3, p0}, Lcom/kwad/components/ad/j/a$3;-><init>(FFFLandroid/view/View;)V

    invoke-virtual {v0, p4}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    return-object v0
.end method

.method private static a(Landroid/view/View;Landroid/view/View;IIJJ)Landroid/animation/Animator;
    .locals 4

    const-wide/16 p4, 0xc8

    .line 3
    invoke-static {p0, p4, p5}, Lcom/kwad/components/ad/j/a;->d(Landroid/view/View;J)Landroid/animation/Animator;

    move-result-object p6

    int-to-float p2, p2

    int-to-float p3, p3

    .line 4
    invoke-static {p1, p2, p3, p4, p5}, Lcom/kwad/components/ad/j/a;->a(Landroid/view/View;FFJ)Landroid/animation/Animator;

    move-result-object p7

    .line 5
    new-instance v0, Lcom/kwad/components/ad/j/a$2;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/j/a$2;-><init>(Landroid/view/View;)V

    invoke-virtual {p7, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    const/4 v0, 0x2

    new-array v1, v0, [F

    .line 6
    fill-array-data v1, :array_0

    const-string v2, "scaleX"

    invoke-static {p1, v2, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    const-wide/16 v2, 0x640

    .line 7
    invoke-virtual {v1, v2, v3}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    .line 8
    invoke-static {p1, p4, p5}, Lcom/kwad/components/ad/j/a;->d(Landroid/view/View;J)Landroid/animation/Animator;

    move-result-object p1

    .line 9
    invoke-static {p0, p2, p3, p4, p5}, Lcom/kwad/components/ad/j/a;->a(Landroid/view/View;FFJ)Landroid/animation/Animator;

    move-result-object p0

    .line 10
    new-instance p2, Landroid/animation/AnimatorSet;

    invoke-direct {p2}, Landroid/animation/AnimatorSet;-><init>()V

    const/4 p3, 0x5

    new-array p3, p3, [Landroid/animation/Animator;

    const/4 p4, 0x0

    aput-object p6, p3, p4

    const/4 p4, 0x1

    aput-object p7, p3, p4

    aput-object v1, p3, v0

    const/4 p4, 0x3

    aput-object p1, p3, p4

    const/4 p1, 0x4

    aput-object p0, p3, p1

    .line 11
    invoke-virtual {p2, p3}, Landroid/animation/AnimatorSet;->playSequentially([Landroid/animation/Animator;)V

    return-object p2

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method static synthetic a(Lcom/kwad/components/ad/j/a;Ljava/lang/Runnable;)Ljava/lang/Runnable;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/j/a;->HK:Ljava/lang/Runnable;

    return-object p1
.end method

.method static synthetic a(Lcom/kwad/components/ad/j/a;)Z
    .locals 0

    .line 2
    iget-boolean p0, p0, Lcom/kwad/components/ad/j/a;->HL:Z

    return p0
.end method

.method static synthetic b(Lcom/kwad/components/ad/j/a;)Ljava/lang/Runnable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/j/a;->HK:Ljava/lang/Runnable;

    return-object p0
.end method

.method private static d(Landroid/view/View;J)Landroid/animation/Animator;
    .locals 2

    const/4 v0, 0x2

    new-array v0, v0, [F

    .line 1
    fill-array-data v0, :array_0

    const-string v1, "alpha"

    invoke-static {p0, v1, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p0

    .line 2
    invoke-virtual {p0, p1, p2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    const/4 p1, 0x0

    const p2, 0x3f147ae1    # 0.58f

    const/high16 v0, 0x3f800000    # 1.0f

    .line 3
    invoke-static {p1, p1, p2, v0}, Landroidx/core/view/animation/PathInterpolatorCompat;->create(FFFF)Landroid/view/animation/Interpolator;

    move-result-object p1

    .line 4
    invoke-virtual {p0, p1}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    return-object p0

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method private initView()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/j/a;->HJ:Landroid/view/View;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_reward_apk_info_install_action:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/kwad/components/ad/j/a;->yc:Landroid/widget/Button;

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/j/a;->HJ:Landroid/view/View;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_reward_apk_info_install_start:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/kwad/components/ad/j/a;->yd:Landroid/widget/Button;

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/j/a;->HJ:Landroid/view/View;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_reward_apk_info_install_container:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/j/a;->yb:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final hU()V
    .locals 10

    const-string v0, "ApkInstallAnimHelper"

    const-string v1, "startAnimation"

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v1, p0, Lcom/kwad/components/ad/j/a;->yb:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v5

    .line 3
    iget-object v1, p0, Lcom/kwad/components/ad/j/a;->yb:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v4

    if-eqz v5, :cond_3

    if-nez v4, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iget-object v1, p0, Lcom/kwad/components/ad/j/a;->hG:Landroid/animation/Animator;

    if-nez v1, :cond_1

    .line 5
    iget-object v2, p0, Lcom/kwad/components/ad/j/a;->yd:Landroid/widget/Button;

    iget-object v3, p0, Lcom/kwad/components/ad/j/a;->yc:Landroid/widget/Button;

    const-wide/16 v6, 0x640

    const-wide/16 v8, 0xc8

    invoke-static/range {v2 .. v9}, Lcom/kwad/components/ad/j/a;->a(Landroid/view/View;Landroid/view/View;IIJJ)Landroid/animation/Animator;

    move-result-object v1

    iput-object v1, p0, Lcom/kwad/components/ad/j/a;->hG:Landroid/animation/Animator;

    .line 6
    new-instance v2, Lcom/kwad/components/ad/j/a$1;

    invoke-direct {v2, p0}, Lcom/kwad/components/ad/j/a$1;-><init>(Lcom/kwad/components/ad/j/a;)V

    invoke-virtual {v1, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 7
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "mAnimator isStarted: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/kwad/components/ad/j/a;->hG:Landroid/animation/Animator;

    invoke-virtual {v2}, Landroid/animation/Animator;->isStarted()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    iget-object v1, p0, Lcom/kwad/components/ad/j/a;->hG:Landroid/animation/Animator;

    invoke-virtual {v1}, Landroid/animation/Animator;->isStarted()Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "mAnimator.start()"

    .line 9
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    iget-object v0, p0, Lcom/kwad/components/ad/j/a;->hG:Landroid/animation/Animator;

    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    :cond_2
    const/4 v0, 0x0

    .line 11
    iput-boolean v0, p0, Lcom/kwad/components/ad/j/a;->HL:Z

    :cond_3
    :goto_0
    return-void
.end method

.method public final jQ()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/ad/j/a;->mB()V

    return-void
.end method

.method public final mB()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/j/a;->hG:Landroid/animation/Animator;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/j/a;->hG:Landroid/animation/Animator;

    invoke-virtual {v0}, Landroid/animation/Animator;->removeAllListeners()V

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/kwad/components/ad/j/a;->HL:Z

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/j/a;->HK:Ljava/lang/Runnable;

    if-eqz v0, :cond_1

    .line 6
    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->c(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lcom/kwad/components/ad/j/a;->HK:Ljava/lang/Runnable;

    :cond_1
    return-void
.end method

.method public final mC()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/kwad/components/ad/j/a;->HL:Z

    return-void
.end method
