.class public final Lcom/kwad/sdk/a/a/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private final amM:Z

.field private final amN:Z

.field private amO:Landroid/view/View;

.field private amP:Landroid/widget/ImageView;

.field private amQ:Landroid/widget/TextView;

.field private amR:Landroid/widget/Button;

.field private amS:I

.field private amT:I

.field private amU:Z

.field private final mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

.field private final mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mContext:Landroid/content/Context;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private mRootView:Landroid/view/View;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;ZZZ)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/kwad/sdk/core/response/model/AdTemplate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kwad/sdk/a/a/e;->mContext:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lcom/kwad/sdk/a/a/e;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 4
    invoke-static {p2}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/a/a/e;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    .line 5
    iput-boolean p3, p0, Lcom/kwad/sdk/a/a/e;->amM:Z

    .line 6
    iput-boolean p4, p0, Lcom/kwad/sdk/a/a/e;->amN:Z

    .line 7
    invoke-direct {p0}, Lcom/kwad/sdk/a/a/e;->AC()Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/a/a/e;->mRootView:Landroid/view/View;

    .line 8
    iput-boolean p5, p0, Lcom/kwad/sdk/a/a/e;->amU:Z

    .line 9
    invoke-direct {p0}, Lcom/kwad/sdk/a/a/e;->mr()V

    return-void
.end method

.method private AC()Landroid/view/View;
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/kwad/sdk/a/a/e;->amM:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/kwad/sdk/a/a/e;->amN:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/a/a/e;->mContext:Landroid/content/Context;

    sget v2, Lcom/kwad/sdk/R$layout;->ksad_install_tips_bottom:I

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/n/l;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/a/a/e;->mRootView:Landroid/view/View;

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/sdk/a/a/e;->mContext:Landroid/content/Context;

    sget v2, Lcom/kwad/sdk/R$layout;->ksad_install_tips:I

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/n/l;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/a/a/e;->mRootView:Landroid/view/View;

    .line 4
    :goto_0
    iget-object v0, p0, Lcom/kwad/sdk/a/a/e;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/kwad/sdk/R$dimen;->ksad_install_tips_card_elevation:I

    .line 5
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    .line 6
    iget-object v1, p0, Lcom/kwad/sdk/a/a/e;->mRootView:Landroid/view/View;

    invoke-static {v1, v0}, Landroidx/core/view/ViewCompat;->setElevation(Landroid/view/View;F)V

    .line 7
    iget-object v0, p0, Lcom/kwad/sdk/a/a/e;->mRootView:Landroid/view/View;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_install_tips_close:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/a/a/e;->amO:Landroid/view/View;

    .line 8
    iget-object v0, p0, Lcom/kwad/sdk/a/a/e;->mRootView:Landroid/view/View;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_install_tips_icon:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/kwad/sdk/a/a/e;->amP:Landroid/widget/ImageView;

    .line 9
    iget-object v0, p0, Lcom/kwad/sdk/a/a/e;->mRootView:Landroid/view/View;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_install_tips_content:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/sdk/a/a/e;->amQ:Landroid/widget/TextView;

    .line 10
    iget-object v0, p0, Lcom/kwad/sdk/a/a/e;->mRootView:Landroid/view/View;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_install_tips_install:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/kwad/sdk/a/a/e;->amR:Landroid/widget/Button;

    .line 11
    iget-object v0, p0, Lcom/kwad/sdk/a/a/e;->mRootView:Landroid/view/View;

    return-object v0
.end method

.method private B(Landroid/view/View;)Landroid/animation/Animator;
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/kwad/sdk/a/a/e;->amM:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/kwad/sdk/a/a/e;->amN:Z

    if-eqz v0, :cond_0

    .line 2
    sget-object v0, Landroid/view/View;->TRANSLATION_X:Landroid/util/Property;

    new-array v3, v3, [F

    aput v4, v3, v2

    iget v2, p0, Lcom/kwad/sdk/a/a/e;->amT:I

    int-to-float v2, v2

    aput v2, v3, v1

    invoke-static {p1, v0, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    goto :goto_0

    .line 3
    :cond_0
    sget-object v0, Landroid/view/View;->TRANSLATION_Y:Landroid/util/Property;

    new-array v3, v3, [F

    aput v4, v3, v2

    iget v2, p0, Lcom/kwad/sdk/a/a/e;->amS:I

    neg-int v2, v2

    int-to-float v2, v2

    aput v2, v3, v1

    invoke-static {p1, v0, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    :goto_0
    const v0, 0x3ed70a3d    # 0.42f

    const v1, 0x3f59999a    # 0.85f

    const v2, 0x3f23d70a    # 0.64f

    .line 4
    invoke-static {v4, v0, v1, v2}, Landroidx/core/view/animation/PathInterpolatorCompat;->create(FFFF)Landroid/view/animation/Interpolator;

    move-result-object v0

    .line 5
    invoke-virtual {p1, v0}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    const-wide/16 v0, 0x104

    .line 6
    invoke-virtual {p1, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    return-object p1
.end method

.method static synthetic a(Lcom/kwad/sdk/a/a/e;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/a/a/e;->mRootView:Landroid/view/View;

    return-object p0
.end method

.method static synthetic b(Lcom/kwad/sdk/a/a/e;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/a/a/e;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method private c(Landroid/widget/FrameLayout;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/a/a/e;->mContext:Landroid/content/Context;

    .line 2
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/kwad/sdk/R$dimen;->ksad_install_tips_card_height:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 3
    iget-object v1, p0, Lcom/kwad/sdk/a/a/e;->mContext:Landroid/content/Context;

    .line 4
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/kwad/sdk/R$dimen;->ksad_install_tips_card_margin:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    add-int v2, v0, v1

    .line 5
    iput v2, p0, Lcom/kwad/sdk/a/a/e;->amS:I

    .line 6
    iget-object v2, p0, Lcom/kwad/sdk/a/a/e;->mRootView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    .line 7
    instance-of v3, v2, Landroid/widget/FrameLayout$LayoutParams;

    if-eqz v3, :cond_0

    .line 8
    check-cast v2, Landroid/widget/FrameLayout$LayoutParams;

    goto :goto_0

    .line 9
    :cond_0
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v3, -0x1

    invoke-direct {v2, v3, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    :goto_0
    const/16 v0, 0x30

    .line 10
    iput v0, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 11
    iput v1, v2, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 12
    iput v1, v2, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 13
    iput v1, v2, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 14
    iget-object v0, p0, Lcom/kwad/sdk/a/a/e;->mRootView:Landroid/view/View;

    iget v1, p0, Lcom/kwad/sdk/a/a/e;->amS:I

    neg-int v1, v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationY(F)V

    .line 15
    iget-object v0, p0, Lcom/kwad/sdk/a/a/e;->mRootView:Landroid/view/View;

    invoke-virtual {p1, v0, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 16
    invoke-direct {p0}, Lcom/kwad/sdk/a/a/e;->show()V

    return-void
.end method

.method private d(Landroid/widget/FrameLayout;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/a/a/e;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/kwad/sdk/utils/bj;->getScreenWidth(Landroid/content/Context;)I

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/kwad/sdk/a/a/e;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/kwad/sdk/R$dimen;->ksad_install_tips_bottom_margin_left:I

    .line 3
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 4
    iget-object v2, p0, Lcom/kwad/sdk/a/a/e;->mContext:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/kwad/sdk/R$dimen;->ksad_install_tips_bottom_margin_bottom:I

    .line 5
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    .line 6
    iget-object v3, p0, Lcom/kwad/sdk/a/a/e;->mContext:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/kwad/sdk/R$dimen;->ksad_install_tips_bottom_height:I

    .line 7
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v3

    sub-int/2addr v0, v1

    .line 8
    iput v0, p0, Lcom/kwad/sdk/a/a/e;->amT:I

    .line 9
    iget-object v0, p0, Lcom/kwad/sdk/a/a/e;->mRootView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 10
    instance-of v4, v0, Landroid/widget/FrameLayout$LayoutParams;

    if-eqz v4, :cond_0

    .line 11
    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    goto :goto_0

    .line 12
    :cond_0
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v4, -0x1

    invoke-direct {v0, v4, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    :goto_0
    const/16 v3, 0x50

    .line 13
    iput v3, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 14
    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    const/4 v1, 0x0

    .line 15
    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 16
    iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 17
    iget-object v1, p0, Lcom/kwad/sdk/a/a/e;->mRootView:Landroid/view/View;

    iget v2, p0, Lcom/kwad/sdk/a/a/e;->amT:I

    int-to-float v2, v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setTranslationX(F)V

    .line 18
    iget-object v1, p0, Lcom/kwad/sdk/a/a/e;->mRootView:Landroid/view/View;

    invoke-virtual {p1, v1, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 19
    invoke-direct {p0}, Lcom/kwad/sdk/a/a/e;->show()V

    return-void
.end method

.method private mr()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/a/a/e;->amR:Landroid/widget/Button;

    iget-boolean v1, p0, Lcom/kwad/sdk/a/a/e;->amM:Z

    if-eqz v1, :cond_0

    const-string v1, "\u5b89\u88c5"

    goto :goto_0

    :cond_0
    const-string v1, "\u6253\u5f00"

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/a/a/e;->amO:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/sdk/a/a/e;->amR:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/sdk/a/a/e;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->cg(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/kwad/sdk/a/a/e;->amP:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/kwad/sdk/a/a/e;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/16 v3, 0x8

    invoke-static {v1, v0, v2, v3}, Lcom/kwad/sdk/core/imageloader/KSImageLoader;->loadAppIcon(Landroid/widget/ImageView;Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    .line 6
    iget-object v0, p0, Lcom/kwad/sdk/a/a/e;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->au(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    if-lt v1, v3, :cond_1

    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v3, 0x7

    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "..."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 9
    :cond_1
    iget-object v1, p0, Lcom/kwad/sdk/a/a/e;->mContext:Landroid/content/Context;

    .line 10
    iget-boolean v3, p0, Lcom/kwad/sdk/a/a/e;->amM:Z

    if-eqz v3, :cond_2

    sget v3, Lcom/kwad/sdk/R$string;->ksad_install_tips:I

    goto :goto_1

    :cond_2
    sget v3, Lcom/kwad/sdk/R$string;->ksad_launch_tips:I

    :goto_1
    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v0, v4, v2

    .line 11
    invoke-virtual {v1, v3, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 12
    iget-object v1, p0, Lcom/kwad/sdk/a/a/e;->amQ:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private show()V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lcom/kwad/sdk/a/a/e;->amM:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x2

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/kwad/sdk/a/a/e;->amN:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/a/a/e;->mRootView:Landroid/view/View;

    sget-object v5, Landroid/view/View;->TRANSLATION_X:Landroid/util/Property;

    new-array v4, v4, [F

    iget v6, p0, Lcom/kwad/sdk/a/a/e;->amT:I

    int-to-float v6, v6

    aput v6, v4, v3

    aput v1, v4, v2

    invoke-static {v0, v5, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/sdk/a/a/e;->mRootView:Landroid/view/View;

    sget-object v5, Landroid/view/View;->TRANSLATION_Y:Landroid/util/Property;

    new-array v4, v4, [F

    iget v6, p0, Lcom/kwad/sdk/a/a/e;->amS:I

    neg-int v6, v6

    int-to-float v6, v6

    aput v6, v4, v3

    aput v1, v4, v2

    invoke-static {v0, v5, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    :goto_0
    const/high16 v1, 0x3e800000    # 0.25f

    const v2, 0x3dcccccd    # 0.1f

    const v3, 0x3e8a3d71    # 0.27f

    const v4, 0x3f5eb852    # 0.87f

    .line 4
    invoke-static {v1, v2, v3, v4}, Landroidx/core/view/animation/PathInterpolatorCompat;->create(FFFF)Landroid/view/animation/Interpolator;

    move-result-object v1

    .line 5
    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    const-wide/16 v1, 0x12c

    .line 6
    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 7
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    return-void
.end method


# virtual methods
.method public final b(Landroid/widget/FrameLayout;)V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/a/a/e;->mRootView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    return-void

    .line 3
    :cond_0
    iget-boolean v0, p0, Lcom/kwad/sdk/a/a/e;->amM:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/kwad/sdk/a/a/e;->amN:Z

    if-eqz v0, :cond_1

    .line 4
    invoke-direct {p0, p1}, Lcom/kwad/sdk/a/a/e;->d(Landroid/widget/FrameLayout;)V

    goto :goto_0

    .line 5
    :cond_1
    invoke-direct {p0, p1}, Lcom/kwad/sdk/a/a/e;->c(Landroid/widget/FrameLayout;)V

    .line 6
    :goto_0
    iget-object p1, p0, Lcom/kwad/sdk/a/a/e;->mRootView:Landroid/view/View;

    new-instance v0, Lcom/kwad/sdk/a/a/e$1;

    invoke-direct {v0, p0}, Lcom/kwad/sdk/a/a/e$1;-><init>(Lcom/kwad/sdk/a/a/e;)V

    const-wide/16 v1, 0x2710

    invoke-virtual {p1, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final dismiss()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/a/a/e;->mRootView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/sdk/a/a/e;->mRootView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 3
    iget-object v1, p0, Lcom/kwad/sdk/a/a/e;->mRootView:Landroid/view/View;

    invoke-direct {p0, v1}, Lcom/kwad/sdk/a/a/e;->B(Landroid/view/View;)Landroid/animation/Animator;

    move-result-object v1

    .line 4
    new-instance v2, Lcom/kwad/sdk/a/a/e$2;

    invoke-direct {v2, p0, v0}, Lcom/kwad/sdk/a/a/e$2;-><init>(Lcom/kwad/sdk/a/a/e;Landroid/view/ViewGroup;)V

    invoke-virtual {v1, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 5
    invoke-virtual {v1}, Landroid/animation/Animator;->start()V

    .line 6
    invoke-static {}, Lcom/kwad/sdk/a/a/c;->Au()Lcom/kwad/sdk/a/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/sdk/a/a/c;->Az()V

    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/a/a/e;->dismiss()V

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/kwad/sdk/R$id;->ksad_install_tips_install:I

    const/4 v2, 0x0

    const/16 v3, 0x17

    if-ne v0, v1, :cond_3

    .line 3
    iget-boolean p1, p0, Lcom/kwad/sdk/a/a/e;->amM:Z

    if-eqz p1, :cond_1

    .line 4
    iget-boolean p1, p0, Lcom/kwad/sdk/a/a/e;->amU:Z

    if-eqz p1, :cond_0

    .line 5
    new-instance p1, Lcom/kwad/sdk/core/adlog/c/b;

    invoke-direct {p1}, Lcom/kwad/sdk/core/adlog/c/b;-><init>()V

    const/16 v0, 0x1d

    .line 6
    invoke-virtual {p1, v0}, Lcom/kwad/sdk/core/adlog/c/b;->cM(I)Lcom/kwad/sdk/core/adlog/c/b;

    .line 7
    invoke-virtual {p1, v3}, Lcom/kwad/sdk/core/adlog/c/b;->cT(I)Lcom/kwad/sdk/core/adlog/c/b;

    .line 8
    iget-object v0, p0, Lcom/kwad/sdk/a/a/e;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0, v2, p1}, Lcom/kwad/sdk/core/adlog/c;->e(Lcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;Lcom/kwad/sdk/core/adlog/c/b;)V

    goto :goto_0

    .line 9
    :cond_0
    iget-object p1, p0, Lcom/kwad/sdk/a/a/e;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/16 v0, 0x2d

    .line 10
    invoke-static {p1, v0}, Lcom/kwad/sdk/core/adlog/c;->o(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    .line 11
    :goto_0
    iget-object p1, p0, Lcom/kwad/sdk/a/a/e;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->H(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lcom/kwad/sdk/a/a/e$3;

    invoke-direct {v0, p0}, Lcom/kwad/sdk/a/a/e$3;-><init>(Lcom/kwad/sdk/a/a/e;)V

    invoke-static {p1, v0}, Lcom/kwad/sdk/utils/al;->a(Ljava/lang/String;Lcom/kwad/sdk/utils/al$a;)Z

    return-void

    .line 12
    :cond_1
    iget-object p1, p0, Lcom/kwad/sdk/a/a/e;->mContext:Landroid/content/Context;

    iget-object v0, p0, Lcom/kwad/sdk/a/a/e;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->ax(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/kwad/sdk/utils/al;->ap(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 13
    iget-object p1, p0, Lcom/kwad/sdk/a/a/e;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {p1}, Lcom/kwad/sdk/core/adlog/c;->bJ(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 14
    :cond_2
    iget-object p1, p0, Lcom/kwad/sdk/a/a/e;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/16 v0, 0x2f

    invoke-static {p1, v0}, Lcom/kwad/sdk/core/adlog/c;->n(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    return-void

    .line 15
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    sget v0, Lcom/kwad/sdk/R$id;->ksad_install_tips_close:I

    if-ne p1, v0, :cond_6

    .line 16
    iget-boolean p1, p0, Lcom/kwad/sdk/a/a/e;->amM:Z

    if-eqz p1, :cond_5

    .line 17
    iget-boolean p1, p0, Lcom/kwad/sdk/a/a/e;->amU:Z

    if-eqz p1, :cond_4

    .line 18
    new-instance p1, Lcom/kwad/sdk/core/adlog/c/b;

    invoke-direct {p1}, Lcom/kwad/sdk/core/adlog/c/b;-><init>()V

    const/16 v0, 0x45

    .line 19
    invoke-virtual {p1, v0}, Lcom/kwad/sdk/core/adlog/c/b;->cM(I)Lcom/kwad/sdk/core/adlog/c/b;

    .line 20
    invoke-virtual {p1, v3}, Lcom/kwad/sdk/core/adlog/c/b;->cT(I)Lcom/kwad/sdk/core/adlog/c/b;

    const/4 v0, 0x1

    .line 21
    invoke-virtual {p1, v0}, Lcom/kwad/sdk/core/adlog/c/b;->cX(I)Lcom/kwad/sdk/core/adlog/c/b;

    .line 22
    iget-object v0, p0, Lcom/kwad/sdk/a/a/e;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0, v2, p1}, Lcom/kwad/sdk/core/adlog/c;->e(Lcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;Lcom/kwad/sdk/core/adlog/c/b;)V

    return-void

    .line 23
    :cond_4
    iget-object p1, p0, Lcom/kwad/sdk/a/a/e;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/16 v0, 0x2e

    invoke-static {p1, v0}, Lcom/kwad/sdk/core/adlog/c;->o(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    return-void

    .line 24
    :cond_5
    iget-object p1, p0, Lcom/kwad/sdk/a/a/e;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/16 v0, 0x30

    invoke-static {p1, v0}, Lcom/kwad/sdk/core/adlog/c;->n(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    :cond_6
    return-void
.end method
