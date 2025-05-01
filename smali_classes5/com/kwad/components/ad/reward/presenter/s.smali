.class public final Lcom/kwad/components/ad/reward/presenter/s;
.super Lcom/kwad/components/ad/reward/presenter/b;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/ad/reward/e/g;
.implements Lcom/kwad/components/core/i/a$a;
.implements Lcom/kwad/components/core/webview/jshandler/w$b;


# instance fields
.field private cR:Lcom/kwad/sdk/core/webview/d/a/a;

.field private gO:Lcom/kwad/components/core/video/l;

.field private oQ:Lcom/kwad/components/ad/reward/d;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private sd:Landroid/widget/ImageView;

.field private showTime:J

.field private td:I
    .annotation build Lcom/kwad/components/ad/reward/presenter/RewardPreEndCardPresenter$PreEndPageStatus;
    .end annotation
.end field

.field private te:Landroid/view/View;

.field private tf:Lcom/kwad/components/core/widget/KsLogoView;

.field private tg:Lcom/kwad/components/core/video/DetailVideoView;

.field private th:I

.field private ti:Landroid/view/View;

.field private tj:Landroid/widget/FrameLayout;

.field private tk:Landroid/animation/Animator;

.field private tl:Landroid/animation/Animator;

.field private tm:Landroid/animation/Animator;

.field private tn:Lcom/kwad/sdk/core/response/model/AdTemplate;

.field private to:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/components/core/i/c;",
            ">;"
        }
    .end annotation
.end field

.field private tp:J

.field private tq:J

.field private tr:F

.field private ts:F

.field private tt:F

.field private tu:Z

.field private tv:J

.field private tw:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/b;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->td:I

    const-wide/16 v0, 0x1f4

    .line 3
    iput-wide v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->tp:J

    const-wide/16 v0, 0x32

    .line 4
    iput-wide v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->tq:J

    const v0, 0x3f9cdcdd

    .line 5
    iput v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->tr:F

    const v0, 0x3f4e0233

    .line 6
    iput v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->ts:F

    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->tt:F

    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->tu:Z

    const-wide/16 v0, -0x1

    .line 9
    iput-wide v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->showTime:J

    .line 10
    iput-wide v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->tv:J

    .line 11
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/s$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/presenter/s$1;-><init>(Lcom/kwad/components/ad/reward/presenter/s;)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->gO:Lcom/kwad/components/core/video/l;

    .line 12
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/s$5;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/presenter/s$5;-><init>(Lcom/kwad/components/ad/reward/presenter/s;)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->cR:Lcom/kwad/sdk/core/webview/d/a/a;

    return-void
.end method

.method private I(Z)Z
    .locals 8

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/s;->hI()F

    move-result v0

    invoke-direct {p0, v0}, Lcom/kwad/components/ad/reward/presenter/s;->b(F)I

    move-result v0

    .line 2
    invoke-direct {p0, v0}, Lcom/kwad/components/ad/reward/presenter/s;->N(I)V

    .line 3
    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/s;->oQ:Lcom/kwad/components/ad/reward/d;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {v1}, Lcom/kwad/components/ad/l/b;->ar()Z

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 5
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "webLoadSuccess: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "RewardPreEndCardPresenter"

    invoke-static {v4, v3}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-nez v1, :cond_1

    return v2

    .line 6
    :cond_1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/s;->hI()F

    move-result v1

    .line 7
    invoke-direct {p0, v1}, Lcom/kwad/components/ad/reward/presenter/s;->a(F)I

    move-result v5

    neg-int v0, v0

    int-to-float v4, v0

    .line 8
    iput v4, p0, Lcom/kwad/components/ad/reward/presenter/s;->tt:F

    const/4 v3, 0x1

    const/4 v6, 0x1

    move-object v2, p0

    move v7, p1

    .line 9
    invoke-direct/range {v2 .. v7}, Lcom/kwad/components/ad/reward/presenter/s;->a(ZFIZZ)Landroid/animation/Animator;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/ad/reward/presenter/s;->tk:Landroid/animation/Animator;

    .line 10
    invoke-virtual {p1}, Landroid/animation/Animator;->start()V

    .line 11
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/s;->hH()Landroid/animation/Animator;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/ad/reward/presenter/s;->tm:Landroid/animation/Animator;

    .line 12
    invoke-virtual {p1}, Landroid/animation/Animator;->start()V

    const/4 p1, 0x2

    .line 13
    iput p1, p0, Lcom/kwad/components/ad/reward/presenter/s;->td:I

    const/4 p1, 0x1

    return p1
.end method

.method private J(Z)V
    .locals 8

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/s;->hI()F

    move-result v0

    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/s;->hJ()F

    move-result v1

    sub-float/2addr v0, v1

    .line 2
    iget v1, p0, Lcom/kwad/components/ad/reward/presenter/s;->tt:F

    add-float v4, v0, v1

    .line 3
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/s;->hJ()F

    move-result v0

    invoke-direct {p0, v0}, Lcom/kwad/components/ad/reward/presenter/s;->a(F)I

    move-result v5

    const/4 v3, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    move v7, p1

    .line 4
    invoke-direct/range {v2 .. v7}, Lcom/kwad/components/ad/reward/presenter/s;->a(ZFIZZ)Landroid/animation/Animator;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/ad/reward/presenter/s;->tl:Landroid/animation/Animator;

    .line 5
    invoke-virtual {p1}, Landroid/animation/Animator;->start()V

    .line 6
    invoke-static {}, Lcom/kwad/sdk/core/d/a;->Ep()Lcom/kwad/sdk/core/d/a;

    iget-object p1, p0, Lcom/kwad/components/ad/reward/presenter/s;->tn:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {p1}, Lcom/kwad/sdk/core/d/a;->bW(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    const/4 p1, 0x3

    .line 7
    iput p1, p0, Lcom/kwad/components/ad/reward/presenter/s;->td:I

    .line 8
    iget-object p1, p0, Lcom/kwad/components/ad/reward/presenter/s;->oQ:Lcom/kwad/components/ad/reward/d;

    if-eqz p1, :cond_0

    .line 9
    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/d;->fm()V

    :cond_0
    return-void
.end method

.method private N(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->te:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 2
    instance-of v1, v0, Landroid/widget/FrameLayout$LayoutParams;

    if-eqz v1, :cond_0

    .line 3
    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 4
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->height:I

    neg-int p1, p1

    .line 5
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    return-void

    .line 6
    :cond_0
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, p1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 7
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->height:I

    neg-int p1, p1

    .line 8
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 9
    iget-object p1, p0, Lcom/kwad/components/ad/reward/presenter/s;->te:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private a(F)I
    .locals 1

    .line 21
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/c/a/a;->e(Landroid/app/Activity;)I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr v0, p1

    float-to-int p1, v0

    return p1
.end method

.method private a(Lcom/kwad/components/ad/reward/e/g;)I
    .locals 1

    .line 22
    invoke-virtual {p0}, Lcom/kwad/components/ad/reward/presenter/s;->getPriority()I

    move-result v0

    invoke-interface {p1}, Lcom/kwad/components/ad/reward/e/g;->getPriority()I

    move-result p1

    sub-int/2addr v0, p1

    return v0
.end method

.method private a(ZFIZZ)Landroid/animation/Animator;
    .locals 7

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "getUpAnimator: translationY0: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", videoTargetHeight: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "RewardPreEndCardPresenter"

    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    .line 4
    iget-object p1, p0, Lcom/kwad/components/ad/reward/presenter/s;->te:Landroid/view/View;

    new-array v3, v1, [F

    aput p2, v3, v2

    const-string p2, "translationY"

    invoke-static {p1, p2, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/ad/reward/presenter/s;->te:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    .line 6
    iget-object v3, p0, Lcom/kwad/components/ad/reward/presenter/s;->te:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    new-array v4, v0, [F

    int-to-float p1, p1

    aput p1, v4, v2

    .line 7
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p1

    aput p1, v4, v1

    invoke-static {v4}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p1

    .line 8
    new-instance p2, Lcom/kwad/components/ad/reward/presenter/s$3;

    invoke-direct {p2, p0, v3}, Lcom/kwad/components/ad/reward/presenter/s$3;-><init>(Lcom/kwad/components/ad/reward/presenter/s;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p1, p2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    :goto_0
    const/4 p2, 0x0

    if-eqz p4, :cond_1

    .line 9
    iget-object p2, p0, Lcom/kwad/components/ad/reward/presenter/s;->tf:Lcom/kwad/components/core/widget/KsLogoView;

    new-array p4, v0, [F

    fill-array-data p4, :array_0

    const-string v3, "alpha"

    invoke-static {p2, v3, p4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p2

    .line 10
    :cond_1
    iget-object p4, p0, Lcom/kwad/components/ad/reward/presenter/s;->sd:Landroid/widget/ImageView;

    invoke-virtual {p4}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p4

    .line 11
    iget-object v3, p0, Lcom/kwad/components/ad/reward/presenter/s;->tg:Lcom/kwad/components/core/video/DetailVideoView;

    iget-object v4, p0, Lcom/kwad/components/ad/reward/presenter/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    new-instance v5, Lcom/kwad/components/ad/reward/presenter/s$4;

    invoke-direct {v5, p0, p4}, Lcom/kwad/components/ad/reward/presenter/s$4;-><init>(Lcom/kwad/components/ad/reward/presenter/s;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v3, v4, p3, v5}, Lcom/kwad/components/core/video/DetailVideoView;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;ILandroid/animation/ValueAnimator$AnimatorUpdateListener;)Landroid/animation/ValueAnimator;

    move-result-object p3

    if-eqz p5, :cond_2

    .line 12
    iget-wide v3, p0, Lcom/kwad/components/ad/reward/presenter/s;->tp:J

    goto :goto_1

    :cond_2
    iget-wide v3, p0, Lcom/kwad/components/ad/reward/presenter/s;->tq:J

    :goto_1
    const p4, 0x3f147ae1    # 0.58f

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    .line 13
    invoke-static {v6, v6, p4, v5}, Landroidx/core/view/animation/PathInterpolatorCompat;->create(FFFF)Landroid/view/animation/Interpolator;

    move-result-object p4

    .line 14
    new-instance v5, Landroid/animation/AnimatorSet;

    invoke-direct {v5}, Landroid/animation/AnimatorSet;-><init>()V

    .line 15
    invoke-virtual {v5, v3, v4}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 16
    invoke-virtual {v5, p4}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    if-eqz p2, :cond_4

    if-eqz p5, :cond_3

    const/4 p4, 0x3

    new-array p4, p4, [Landroid/animation/Animator;

    aput-object p1, p4, v2

    aput-object p2, p4, v1

    aput-object p3, p4, v0

    .line 17
    invoke-virtual {v5, p4}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    goto :goto_2

    :cond_3
    new-array p3, v0, [Landroid/animation/Animator;

    aput-object p1, p3, v2

    aput-object p2, p3, v1

    .line 18
    invoke-virtual {v5, p3}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    goto :goto_2

    :cond_4
    if-eqz p5, :cond_5

    new-array p2, v0, [Landroid/animation/Animator;

    aput-object p1, p2, v2

    aput-object p3, p2, v1

    .line 19
    invoke-virtual {v5, p2}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    goto :goto_2

    :cond_5
    new-array p2, v1, [Landroid/animation/Animator;

    aput-object p1, p2, v2

    .line 20
    invoke-virtual {v5, p2}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    :goto_2
    return-object v5

    :array_0
    .array-data 4
        0x0
        0x437f0000    # 255.0f
    .end array-data
.end method

.method static synthetic a(Lcom/kwad/components/ad/reward/presenter/s;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/s;->te:Landroid/view/View;

    return-object p0
.end method

.method static synthetic a(Lcom/kwad/components/ad/reward/presenter/s;J)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/kwad/components/ad/reward/presenter/s;->g(J)V

    return-void
.end method

.method private b(F)I
    .locals 3

    .line 2
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/kwad/sdk/R$dimen;->ksad_reward_middle_end_card_logo_view_height:I

    .line 3
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 4
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/kwad/sdk/R$dimen;->ksad_reward_middle_end_card_logo_view_margin_bottom:I

    .line 5
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    int-to-float v0, v0

    add-float/2addr p1, v0

    int-to-float v0, v1

    add-float/2addr p1, v0

    float-to-int p1, p1

    return p1
.end method

.method static synthetic b(Lcom/kwad/components/ad/reward/presenter/s;)Landroid/widget/ImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/s;->sd:Landroid/widget/ImageView;

    return-object p0
.end method

.method static synthetic c(Lcom/kwad/components/ad/reward/presenter/s;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/s;->to:Ljava/util/List;

    return-object p0
.end method

.method private f(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kwad/sdk/core/response/model/AdTemplate;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/kwad/components/ad/reward/d;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v1, v1, Lcom/kwad/components/ad/reward/g;->mReportExtData:Lorg/json/JSONObject;

    invoke-direct {v0, p1, v1, p0}, Lcom/kwad/components/ad/reward/d;-><init>(Ljava/util/List;Lorg/json/JSONObject;Lcom/kwad/components/core/webview/jshandler/w$b;)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->oQ:Lcom/kwad/components/ad/reward/d;

    .line 2
    iget-object p1, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iput-object v0, p1, Lcom/kwad/components/ad/reward/g;->oQ:Lcom/kwad/components/ad/reward/d;

    .line 3
    iget-object p1, p0, Lcom/kwad/components/ad/reward/presenter/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 4
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/b;->cv(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/kwad/components/ad/reward/d;->setShowLandingPage(Z)V

    .line 5
    iget-object p1, p0, Lcom/kwad/components/ad/reward/presenter/s;->oQ:Lcom/kwad/components/ad/reward/d;

    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->cR:Lcom/kwad/sdk/core/webview/d/a/a;

    invoke-virtual {p1, v0}, Lcom/kwad/components/ad/l/b;->a(Lcom/kwad/sdk/core/webview/d/a/a;)V

    .line 6
    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/s;->oQ:Lcom/kwad/components/ad/reward/d;

    iget-object v2, p0, Lcom/kwad/components/ad/reward/presenter/s;->tj:Landroid/widget/FrameLayout;

    iget-object p1, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v3, p1, Lcom/kwad/components/ad/reward/g;->mRootContainer:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    iget-object v4, p0, Lcom/kwad/components/ad/reward/presenter/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v5, p1, Lcom/kwad/components/ad/reward/g;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    iget v6, p1, Lcom/kwad/components/ad/reward/g;->mScreenOrientation:I

    invoke-virtual/range {v1 .. v6}, Lcom/kwad/components/ad/reward/d;->a(Landroid/widget/FrameLayout;Lcom/kwad/sdk/core/view/AdBaseFrameLayout;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/core/e/d/c;I)V

    const-string p1, "RewardPreEndCardPresenter"

    const-string v0, "startPreloadWebView"

    .line 7
    invoke-static {p1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    iget-object p1, p0, Lcom/kwad/components/ad/reward/presenter/s;->oQ:Lcom/kwad/components/ad/reward/d;

    new-instance v0, Lcom/kwad/components/ad/reward/presenter/s$2;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/presenter/s$2;-><init>(Lcom/kwad/components/ad/reward/presenter/s;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/ad/l/b;->a(Lcom/kwad/components/ad/l/b$b;)V

    return-void
.end method

.method private g(J)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->tn:Lcom/kwad/sdk/core/response/model/AdTemplate;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-boolean v1, p0, Lcom/kwad/components/ad/reward/presenter/s;->tw:Z

    if-eqz v1, :cond_1

    return-void

    .line 3
    :cond_1
    iget-wide v1, p0, Lcom/kwad/components/ad/reward/presenter/s;->showTime:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-gtz v5, :cond_2

    .line 4
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/b;->cs(Lcom/kwad/sdk/core/response/model/AdTemplate;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->showTime:J

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->tn:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/b;->cr(Lcom/kwad/sdk/core/response/model/AdTemplate;)J

    move-result-wide v0

    .line 6
    iget-wide v5, p0, Lcom/kwad/components/ad/reward/presenter/s;->showTime:J

    add-long/2addr v0, v5

    iput-wide v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->tv:J

    .line 7
    :cond_2
    iget-wide v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->showTime:J

    const/4 v2, 0x1

    cmp-long v5, v0, v3

    if-lez v5, :cond_4

    iget-boolean v5, p0, Lcom/kwad/components/ad/reward/presenter/s;->tu:Z

    if-nez v5, :cond_4

    cmp-long v5, p1, v0

    if-lez v5, :cond_4

    .line 8
    invoke-direct {p0, v2}, Lcom/kwad/components/ad/reward/presenter/s;->I(Z)Z

    move-result v0

    xor-int/2addr v0, v2

    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->tw:Z

    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "showError: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Lcom/kwad/components/ad/reward/presenter/s;->tw:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "RewardPreEndCardPresenter"

    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->tw:Z

    if-eqz v0, :cond_3

    return-void

    .line 11
    :cond_3
    iput-boolean v2, p0, Lcom/kwad/components/ad/reward/presenter/s;->tu:Z

    .line 12
    :cond_4
    iget v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->td:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_5

    const/4 v0, 0x1

    goto :goto_0

    :cond_5
    const/4 v0, 0x0

    .line 13
    :goto_0
    iget-wide v5, p0, Lcom/kwad/components/ad/reward/presenter/s;->tv:J

    cmp-long v1, v5, v3

    if-lez v1, :cond_6

    if-nez v0, :cond_6

    cmp-long v0, p1, v5

    if-lez v0, :cond_6

    .line 14
    invoke-direct {p0, v2}, Lcom/kwad/components/ad/reward/presenter/s;->J(Z)V

    :cond_6
    return-void
.end method

.method private hH()Landroid/animation/Animator;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->ti:Landroid/view/View;

    const/4 v1, 0x2

    new-array v1, v1, [F

    fill-array-data v1, :array_0

    const-string v2, "alpha"

    invoke-static {v0, v2, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const/high16 v1, 0x3e800000    # 0.25f

    const v2, 0x3dcccccd    # 0.1f

    const/high16 v3, 0x3f800000    # 1.0f

    .line 2
    invoke-static {v1, v2, v1, v3}, Landroidx/core/view/animation/PathInterpolatorCompat;->create(FFFF)Landroid/view/animation/Interpolator;

    move-result-object v1

    .line 3
    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    const-wide/16 v1, 0xc8

    .line 4
    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    return-object v0

    :array_0
    .array-data 4
        0x437f0000    # 255.0f
        0x0
    .end array-data
.end method

.method private hI()F
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/c/a/a;->d(Landroid/app/Activity;)I

    move-result v0

    int-to-float v0, v0

    .line 2
    iget v1, p0, Lcom/kwad/components/ad/reward/presenter/s;->tr:F

    div-float/2addr v0, v1

    return v0
.end method

.method private hJ()F
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/c/a/a;->d(Landroid/app/Activity;)I

    move-result v0

    int-to-float v0, v0

    .line 2
    iget v1, p0, Lcom/kwad/components/ad/reward/presenter/s;->ts:F

    div-float/2addr v0, v1

    return v0
.end method


# virtual methods
.method public final N(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    .line 10
    new-instance v0, Lcom/kwad/components/core/i/c;

    sget v1, Lcom/kwad/components/core/i/e;->AGGREGATION:I

    invoke-direct {v0, p1, v1}, Lcom/kwad/components/core/i/c;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    .line 11
    iget-object p1, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    if-eqz p1, :cond_0

    .line 12
    invoke-virtual {p1, v0}, Lcom/kwad/components/ad/reward/g;->b(Lcom/kwad/components/core/i/c;)V

    :cond_0
    return-void
.end method

.method public final aj()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/reward/presenter/b;->aj()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->oK:Lcom/kwad/components/ad/reward/m/e;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/s;->gO:Lcom/kwad/components/core/video/l;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/m/e;->a(Lcom/kwad/components/core/video/l;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    invoke-virtual {v0, p0}, Lcom/kwad/components/ad/reward/g;->b(Lcom/kwad/components/ad/reward/e/g;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    invoke-virtual {v0, p0}, Lcom/kwad/components/ad/reward/g;->a(Lcom/kwad/components/core/i/a$a;)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->tg:Lcom/kwad/components/core/video/DetailVideoView;

    invoke-static {v0}, Lcom/kwad/sdk/c/a/a;->F(Landroid/view/View;)I

    move-result v0

    iput v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->th:I

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->tg:Lcom/kwad/components/core/video/DetailVideoView;

    const/16 v1, 0x31

    invoke-static {v0, v1}, Lcom/kwad/sdk/c/a/a;->n(Landroid/view/View;I)V

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->tf:Lcom/kwad/components/core/widget/KsLogoView;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/widget/KsLogoView;->aE(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void
.end method

.method public final bL()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->tn:Lcom/kwad/sdk/core/response/model/AdTemplate;

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->td:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/kwad/components/ad/reward/presenter/s;->I(Z)Z

    .line 3
    invoke-direct {p0, v0}, Lcom/kwad/components/ad/reward/presenter/s;->J(Z)V

    return-void

    :cond_1
    const/4 v2, 0x2

    if-ne v0, v2, :cond_2

    .line 4
    invoke-direct {p0, v1}, Lcom/kwad/components/ad/reward/presenter/s;->J(Z)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/kwad/components/ad/reward/e/g;

    invoke-direct {p0, p1}, Lcom/kwad/components/ad/reward/presenter/s;->a(Lcom/kwad/components/ad/reward/e/g;)I

    move-result p1

    return p1
.end method

.method public final e(Ljava/util/List;)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kwad/components/core/i/c;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "onInnerAdLoad: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "RewardPreEndCardPresenter"

    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_1

    .line 2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 3
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/core/i/c;

    invoke-virtual {v0}, Lcom/kwad/components/core/i/c;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->tn:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 4
    iput-object p1, p0, Lcom/kwad/components/ad/reward/presenter/s;->to:Ljava/util/List;

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7
    invoke-static {p1}, Lcom/kwad/components/core/i/c;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 8
    invoke-direct {p0, v0}, Lcom/kwad/components/ad/reward/presenter/s;->f(Ljava/util/List;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final getPriority()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final onCreate()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onCreate()V

    .line 2
    sget v0, Lcom/kwad/sdk/R$id;->ksad_middle_end_card:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->te:Landroid/view/View;

    .line 3
    sget v0, Lcom/kwad/sdk/R$id;->ksad_video_player:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/core/video/DetailVideoView;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->tg:Lcom/kwad/components/core/video/DetailVideoView;

    .line 4
    sget v0, Lcom/kwad/sdk/R$id;->ksad_splash_logo_container:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/core/widget/KsLogoView;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->tf:Lcom/kwad/components/core/widget/KsLogoView;

    .line 5
    sget v0, Lcom/kwad/sdk/R$id;->ksad_blur_video_cover:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->sd:Landroid/widget/ImageView;

    .line 6
    sget v0, Lcom/kwad/sdk/R$id;->ksad_play_web_card_webView:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->ti:Landroid/view/View;

    .line 7
    sget v0, Lcom/kwad/sdk/R$id;->ksad_middle_end_card_webview_container:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->tj:Landroid/widget/FrameLayout;

    return-void
.end method

.method public final onError(ILjava/lang/String;)V
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "onError : msg "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "RewardPreEndCardPresenter"

    invoke-static {p2, p1}, Lcom/kwad/sdk/core/e/c;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final onRequestResult(I)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "onRequestResult : adNumber "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "RewardPreEndCardPresenter"

    invoke-static {v0, p1}, Lcom/kwad/sdk/core/e/c;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final onUnbind()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onUnbind()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/kwad/components/ad/reward/g;->pq:Z

    .line 3
    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->oK:Lcom/kwad/components/ad/reward/m/e;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/s;->gO:Lcom/kwad/components/core/video/l;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/m/e;->b(Lcom/kwad/components/core/video/l;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    invoke-virtual {v0, p0}, Lcom/kwad/components/ad/reward/g;->c(Lcom/kwad/components/ad/reward/e/g;)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    invoke-virtual {v0, p0}, Lcom/kwad/components/ad/reward/g;->b(Lcom/kwad/components/core/i/a$a;)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->oQ:Lcom/kwad/components/ad/reward/d;

    if-eqz v0, :cond_0

    .line 7
    invoke-virtual {v0}, Lcom/kwad/components/ad/l/b;->mw()V

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->tm:Landroid/animation/Animator;

    if-eqz v0, :cond_1

    .line 9
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    .line 10
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->tg:Lcom/kwad/components/core/video/DetailVideoView;

    if-eqz v0, :cond_2

    .line 11
    iget v1, p0, Lcom/kwad/components/ad/reward/presenter/s;->th:I

    invoke-static {v0, v1}, Lcom/kwad/sdk/c/a/a;->n(Landroid/view/View;I)V

    .line 12
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->tk:Landroid/animation/Animator;

    if-eqz v0, :cond_3

    .line 13
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    :cond_3
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->tm:Landroid/animation/Animator;

    .line 15
    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/s;->tk:Landroid/animation/Animator;

    return-void
.end method
