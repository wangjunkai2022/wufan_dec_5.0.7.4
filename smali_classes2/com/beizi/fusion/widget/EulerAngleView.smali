.class public Lcom/beizi/fusion/widget/EulerAngleView;
.super Landroid/widget/RelativeLayout;
.source "EulerAngleView.java"


# instance fields
.field private a:Z

.field private b:Landroid/content/Context;

.field private c:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

.field private d:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRenderBean;

.field private e:Landroid/widget/LinearLayout;

.field private f:Landroid/widget/RelativeLayout;

.field private g:Landroid/widget/ImageView;

.field private h:Lcom/beizi/fusion/update/ShakeArcView;

.field private i:Landroid/widget/TextView;

.field private j:Landroid/widget/TextView;

.field private k:F

.field private l:F

.field private m:F

.field private n:I

.field private o:I

.field private p:I

.field private q:D

.field private r:D

.field private s:D

.field private t:Ljava/lang/String;

.field private u:Ljava/lang/String;

.field private v:Ljava/lang/String;

.field private w:Landroid/animation/AnimatorSet;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/beizi/fusion/widget/EulerAngleView;->a:Z

    const/high16 v0, 0x42700000    # 60.0f

    .line 3
    iput v0, p0, Lcom/beizi/fusion/widget/EulerAngleView;->k:F

    .line 4
    iput v0, p0, Lcom/beizi/fusion/widget/EulerAngleView;->l:F

    const/high16 v0, 0x41f00000    # 30.0f

    .line 5
    iput v0, p0, Lcom/beizi/fusion/widget/EulerAngleView;->m:F

    const/16 v0, 0x15e

    .line 6
    iput v0, p0, Lcom/beizi/fusion/widget/EulerAngleView;->n:I

    const-wide/16 v0, 0x0

    .line 7
    iput-wide v0, p0, Lcom/beizi/fusion/widget/EulerAngleView;->q:D

    .line 8
    iput-wide v0, p0, Lcom/beizi/fusion/widget/EulerAngleView;->r:D

    .line 9
    iput-wide v0, p0, Lcom/beizi/fusion/widget/EulerAngleView;->s:D

    .line 10
    invoke-virtual {p0, p1}, Lcom/beizi/fusion/widget/EulerAngleView;->init(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 11
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x0

    .line 12
    iput-boolean p2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->a:Z

    const/high16 p2, 0x42700000    # 60.0f

    .line 13
    iput p2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->k:F

    .line 14
    iput p2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->l:F

    const/high16 p2, 0x41f00000    # 30.0f

    .line 15
    iput p2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->m:F

    const/16 p2, 0x15e

    .line 16
    iput p2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->n:I

    const-wide/16 v0, 0x0

    .line 17
    iput-wide v0, p0, Lcom/beizi/fusion/widget/EulerAngleView;->q:D

    .line 18
    iput-wide v0, p0, Lcom/beizi/fusion/widget/EulerAngleView;->r:D

    .line 19
    iput-wide v0, p0, Lcom/beizi/fusion/widget/EulerAngleView;->s:D

    .line 20
    invoke-virtual {p0, p1}, Lcom/beizi/fusion/widget/EulerAngleView;->init(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 21
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p2, 0x0

    .line 22
    iput-boolean p2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->a:Z

    const/high16 p2, 0x42700000    # 60.0f

    .line 23
    iput p2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->k:F

    .line 24
    iput p2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->l:F

    const/high16 p2, 0x41f00000    # 30.0f

    .line 25
    iput p2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->m:F

    const/16 p2, 0x15e

    .line 26
    iput p2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->n:I

    const-wide/16 p2, 0x0

    .line 27
    iput-wide p2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->q:D

    .line 28
    iput-wide p2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->r:D

    .line 29
    iput-wide p2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->s:D

    .line 30
    invoke-virtual {p0, p1}, Lcom/beizi/fusion/widget/EulerAngleView;->init(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic a(Lcom/beizi/fusion/widget/EulerAngleView;)Landroid/widget/ImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/widget/EulerAngleView;->g:Landroid/widget/ImageView;

    return-object p0
.end method

.method private a(Ljava/util/List;Ljava/lang/String;FF)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/animation/Animator;",
            ">;",
            "Ljava/lang/String;",
            "FF)V"
        }
    .end annotation

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/beizi/fusion/widget/EulerAngleView;->g:Landroid/widget/ImageView;

    const/4 v1, 0x2

    new-array v1, v1, [F

    const/4 v2, 0x0

    aput p3, v1, v2

    const/4 p3, 0x1

    aput p4, v1, p3

    invoke-static {v0, p2, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p2

    .line 3
    iget p3, p0, Lcom/beizi/fusion/widget/EulerAngleView;->n:I

    int-to-long p3, p3

    invoke-virtual {p2, p3, p4}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 4
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/beizi/fusion/widget/EulerAngleView;)Landroid/animation/AnimatorSet;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/widget/EulerAngleView;->w:Landroid/animation/AnimatorSet;

    return-object p0
.end method


# virtual methods
.method public buildEulerAngleView()V
    .locals 9

    const-string v0, "2"

    const-string v1, "1"

    .line 1
    :try_start_0
    iget-object v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->c:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    if-nez v2, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/beizi/fusion/R$layout;->beizi_interaction_euler_angle_view:I

    invoke-static {v2, v3, p0}, Landroid/widget/RelativeLayout;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 3
    sget v2, Lcom/beizi/fusion/R$id;->bz_eav_container_ll:I

    invoke-virtual {p0, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/LinearLayout;

    iput-object v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->e:Landroid/widget/LinearLayout;

    .line 4
    sget v2, Lcom/beizi/fusion/R$id;->bz_eav_img_container_rl:I

    invoke-virtual {p0, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/RelativeLayout;

    iput-object v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->f:Landroid/widget/RelativeLayout;

    .line 5
    sget v2, Lcom/beizi/fusion/R$id;->bz_eav_img_iv:I

    invoke-virtual {p0, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    iput-object v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->g:Landroid/widget/ImageView;

    .line 6
    sget v2, Lcom/beizi/fusion/R$id;->bz_eav_sav_iv:I

    invoke-virtual {p0, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/beizi/fusion/update/ShakeArcView;

    iput-object v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->h:Lcom/beizi/fusion/update/ShakeArcView;

    .line 7
    sget v2, Lcom/beizi/fusion/R$id;->bz_eav_title_tv:I

    invoke-virtual {p0, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->i:Landroid/widget/TextView;

    .line 8
    sget v2, Lcom/beizi/fusion/R$id;->bz_eav_subtitle_tv:I

    invoke-virtual {p0, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->j:Landroid/widget/TextView;

    .line 9
    iget-object v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->f:Landroid/widget/RelativeLayout;

    if-eqz v2, :cond_1

    .line 10
    invoke-virtual {v2}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 11
    iget v3, p0, Lcom/beizi/fusion/widget/EulerAngleView;->o:I

    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 12
    iget v3, p0, Lcom/beizi/fusion/widget/EulerAngleView;->p:I

    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 13
    iget-object v3, p0, Lcom/beizi/fusion/widget/EulerAngleView;->f:Landroid/widget/RelativeLayout;

    invoke-virtual {v3, v2}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 14
    :cond_1
    iget-object v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->g:Landroid/widget/ImageView;

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    .line 15
    invoke-virtual {v2}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 16
    iget v4, p0, Lcom/beizi/fusion/widget/EulerAngleView;->o:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    int-to-double v4, v4

    const-wide v6, 0x3fd6666666666666L    # 0.35

    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v4, v4, v6

    double-to-int v4, v4

    :try_start_1
    iput v4, v2, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 17
    iget v4, p0, Lcom/beizi/fusion/widget/EulerAngleView;->p:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    int-to-double v5, v4

    const-wide/high16 v7, 0x3fe0000000000000L    # 0.5

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v5, v5, v7

    double-to-int v5, v5

    :try_start_2
    iput v5, v2, Landroid/widget/RelativeLayout$LayoutParams;->height:I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    int-to-double v4, v4

    const-wide v6, 0x3fc999999999999aL    # 0.2

    .line 18
    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v4, v4, v6

    double-to-int v4, v4

    :try_start_3
    invoke-virtual {v2, v3, v3, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 19
    iget-object v4, p0, Lcom/beizi/fusion/widget/EulerAngleView;->g:Landroid/widget/ImageView;

    invoke-virtual {v4, v2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 20
    :cond_2
    iget-object v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->h:Lcom/beizi/fusion/update/ShakeArcView;

    const/4 v4, 0x2

    if-eqz v2, :cond_c

    .line 21
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 22
    iget v5, p0, Lcom/beizi/fusion/widget/EulerAngleView;->o:I

    iget v6, p0, Lcom/beizi/fusion/widget/EulerAngleView;->p:I

    .line 23
    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    move-result v5
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    int-to-double v5, v5

    const-wide v7, 0x3fe6666666666666L    # 0.7

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v5, v5, v7

    double-to-int v5, v5

    :try_start_4
    iput v5, v2, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 24
    iget v5, p0, Lcom/beizi/fusion/widget/EulerAngleView;->o:I

    iget v6, p0, Lcom/beizi/fusion/widget/EulerAngleView;->p:I

    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    move-result v5
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    int-to-double v5, v5

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v5, v5, v7

    double-to-int v5, v5

    :try_start_5
    iput v5, v2, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 25
    iget-object v5, p0, Lcom/beizi/fusion/widget/EulerAngleView;->h:Lcom/beizi/fusion/update/ShakeArcView;

    invoke-virtual {v5, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 26
    iget-object v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->t:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 27
    iget-object v0, p0, Lcom/beizi/fusion/widget/EulerAngleView;->h:Lcom/beizi/fusion/update/ShakeArcView;

    invoke-virtual {v0, v3}, Lcom/beizi/fusion/update/ShakeArcView;->setArrowDirection(I)Lcom/beizi/fusion/update/ShakeArcView;

    goto :goto_0

    .line 28
    :cond_3
    iget-object v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->u:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->v:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    :cond_4
    iget-object v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->u:Ljava/lang/String;

    .line 29
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->v:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    :cond_5
    iget-object v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->v:Ljava/lang/String;

    .line 30
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_7

    iget-object v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->u:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 31
    :cond_6
    iget-object v0, p0, Lcom/beizi/fusion/widget/EulerAngleView;->h:Lcom/beizi/fusion/update/ShakeArcView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/update/ShakeArcView;->setArrowDirection(I)Lcom/beizi/fusion/update/ShakeArcView;

    goto :goto_0

    .line 32
    :cond_7
    iget-object v1, p0, Lcom/beizi/fusion/widget/EulerAngleView;->u:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    iget-object v1, p0, Lcom/beizi/fusion/widget/EulerAngleView;->v:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    :cond_8
    iget-object v1, p0, Lcom/beizi/fusion/widget/EulerAngleView;->u:Ljava/lang/String;

    .line 33
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_9

    iget-object v1, p0, Lcom/beizi/fusion/widget/EulerAngleView;->v:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    :cond_9
    iget-object v1, p0, Lcom/beizi/fusion/widget/EulerAngleView;->v:Ljava/lang/String;

    .line 34
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_b

    iget-object v1, p0, Lcom/beizi/fusion/widget/EulerAngleView;->u:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 35
    :cond_a
    iget-object v0, p0, Lcom/beizi/fusion/widget/EulerAngleView;->h:Lcom/beizi/fusion/update/ShakeArcView;

    invoke-virtual {v0, v4}, Lcom/beizi/fusion/update/ShakeArcView;->setArrowDirection(I)Lcom/beizi/fusion/update/ShakeArcView;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    .line 36
    :cond_b
    :goto_0
    :try_start_6
    iget-object v0, p0, Lcom/beizi/fusion/widget/EulerAngleView;->h:Lcom/beizi/fusion/update/ShakeArcView;

    iget v1, p0, Lcom/beizi/fusion/widget/EulerAngleView;->o:I

    iget v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->p:I

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    div-int/lit8 v1, v1, 0x1e

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/update/ShakeArcView;->setLineWidth(I)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 37
    :try_start_7
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_c
    :goto_1
    const-string v0, "#66333333"

    .line 38
    iget-object v1, p0, Lcom/beizi/fusion/widget/EulerAngleView;->d:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRenderBean;

    if-eqz v1, :cond_d

    .line 39
    invoke-virtual {v1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRenderBean;->getColor()Ljava/lang/String;

    move-result-object v0

    .line 40
    :cond_d
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_e

    const-string v1, "#"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_e

    .line 41
    iget-object v1, p0, Lcom/beizi/fusion/widget/EulerAngleView;->f:Landroid/widget/RelativeLayout;

    iget v5, p0, Lcom/beizi/fusion/widget/EulerAngleView;->o:I

    div-int/2addr v5, v4

    invoke-static {v1, v0, v3, v2, v5}, Lcom/beizi/fusion/g/as;->a(Landroid/view/View;Ljava/lang/String;ILjava/lang/String;I)V

    .line 42
    :cond_e
    iget-object v0, p0, Lcom/beizi/fusion/widget/EulerAngleView;->c:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    .line 43
    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;->getStyle()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleStyleBean;

    move-result-object v0

    if-eqz v0, :cond_f

    .line 44
    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleStyleBean;->getImgs()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_f

    .line 45
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    if-lez v4, :cond_f

    .line 46
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    goto :goto_2

    :cond_f
    move-object v1, v2

    .line 47
    :goto_2
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_10

    .line 48
    iget-object v3, p0, Lcom/beizi/fusion/widget/EulerAngleView;->b:Landroid/content/Context;

    invoke-static {v3}, Lcom/beizi/fusion/g/i;->a(Landroid/content/Context;)Lcom/beizi/fusion/g/i;

    move-result-object v3

    new-instance v4, Lcom/beizi/fusion/widget/EulerAngleView$1;

    invoke-direct {v4, p0}, Lcom/beizi/fusion/widget/EulerAngleView$1;-><init>(Lcom/beizi/fusion/widget/EulerAngleView;)V

    invoke-virtual {v3, v1, v4}, Lcom/beizi/fusion/g/i;->b(Ljava/lang/String;Lcom/beizi/fusion/g/i$a;)V

    .line 49
    :cond_10
    iget-object v1, p0, Lcom/beizi/fusion/widget/EulerAngleView;->h:Lcom/beizi/fusion/update/ShakeArcView;

    if-eqz v1, :cond_11

    const-wide/high16 v3, 0x4059000000000000L    # 100.0

    .line 50
    invoke-virtual {v1, v3, v4}, Lcom/beizi/fusion/update/ShakeArcView;->setMaxProgress(D)Lcom/beizi/fusion/update/ShakeArcView;

    :cond_11
    if-eqz v0, :cond_12

    .line 51
    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleStyleBean;->getTitle()Ljava/lang/String;

    move-result-object v2

    .line 52
    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleStyleBean;->getSubTitle()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_12
    move-object v0, v2

    .line 53
    :goto_3
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    const-string v3, "#8C000000"

    const/high16 v4, 0x40a00000    # 5.0f

    const-string v5, "#FFFFFFFF"

    const/high16 v6, 0x40800000    # 4.0f

    if-nez v1, :cond_13

    :try_start_8
    iget-object v1, p0, Lcom/beizi/fusion/widget/EulerAngleView;->i:Landroid/widget/TextView;

    if-eqz v1, :cond_13

    .line 54
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 55
    iget-object v1, p0, Lcom/beizi/fusion/widget/EulerAngleView;->i:Landroid/widget/TextView;

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 56
    iget-object v1, p0, Lcom/beizi/fusion/widget/EulerAngleView;->i:Landroid/widget/TextView;

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v4, v6, v6, v2}, Landroid/widget/TextView;->setShadowLayer(FFFI)V

    .line 57
    :cond_13
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_14

    iget-object v1, p0, Lcom/beizi/fusion/widget/EulerAngleView;->j:Landroid/widget/TextView;

    if-eqz v1, :cond_14

    .line 58
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    iget-object v0, p0, Lcom/beizi/fusion/widget/EulerAngleView;->j:Landroid/widget/TextView;

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 60
    iget-object v0, p0, Lcom/beizi/fusion/widget/EulerAngleView;->j:Landroid/widget/TextView;

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v4, v6, v6, v1}, Landroid/widget/TextView;->setShadowLayer(FFFI)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1

    goto :goto_4

    :catch_1
    move-exception v0

    .line 61
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_14
    :goto_4
    return-void
.end method

.method public init(Landroid/content/Context;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/beizi/fusion/widget/EulerAngleView;->a:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iput-object p1, p0, Lcom/beizi/fusion/widget/EulerAngleView;->b:Landroid/content/Context;

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lcom/beizi/fusion/widget/EulerAngleView;->a:Z

    return-void
.end method

.method public onDestroy()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    :try_start_0
    iput-object v0, p0, Lcom/beizi/fusion/widget/EulerAngleView;->b:Landroid/content/Context;

    .line 2
    iget-object v1, p0, Lcom/beizi/fusion/widget/EulerAngleView;->w:Landroid/animation/AnimatorSet;

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v1}, Landroid/animation/AnimatorSet;->removeAllListeners()V

    .line 4
    :cond_0
    iput-object v0, p0, Lcom/beizi/fusion/widget/EulerAngleView;->w:Landroid/animation/AnimatorSet;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public setAngle(DDD)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/beizi/fusion/widget/EulerAngleView;->q:D

    .line 2
    iput-wide p3, p0, Lcom/beizi/fusion/widget/EulerAngleView;->r:D

    .line 3
    iput-wide p5, p0, Lcom/beizi/fusion/widget/EulerAngleView;->s:D

    return-void
.end method

.method public setAnimationViewWidthAndHeight(II)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/widget/EulerAngleView;->o:I

    .line 2
    iput p2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->p:I

    return-void
.end method

.method public setCurrentProgress(DDD)V
    .locals 15

    move-object v1, p0

    .line 1
    :try_start_0
    iget-object v0, v1, Lcom/beizi/fusion/widget/EulerAngleView;->h:Lcom/beizi/fusion/update/ShakeArcView;

    if-eqz v0, :cond_c

    .line 2
    iget-wide v2, v1, Lcom/beizi/fusion/widget/EulerAngleView;->q:D
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v0, "0"

    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    const-string v6, "1"

    const-string v7, "2"

    const-wide/16 v8, 0x0

    cmpl-double v10, v2, v8

    if-lez v10, :cond_3

    .line 3
    :try_start_1
    iget-object v2, v1, Lcom/beizi/fusion/widget/EulerAngleView;->t:Ljava/lang/String;

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    cmpl-double v2, p1, v8

    if-gtz v2, :cond_2

    :cond_0
    iget-object v2, v1, Lcom/beizi/fusion/widget/EulerAngleView;->t:Ljava/lang/String;

    .line 4
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    cmpg-double v2, p1, v8

    if-ltz v2, :cond_2

    :cond_1
    iget-object v2, v1, Lcom/beizi/fusion/widget/EulerAngleView;->t:Ljava/lang/String;

    .line 5
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 6
    :cond_2
    invoke-static/range {p1 .. p2}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    mul-double v2, v2, v4

    iget-wide v10, v1, Lcom/beizi/fusion/widget/EulerAngleView;->q:D

    div-double/2addr v2, v10

    goto :goto_0

    :cond_3
    move-wide v2, v8

    .line 7
    :goto_0
    iget-wide v10, v1, Lcom/beizi/fusion/widget/EulerAngleView;->r:D

    cmpl-double v12, v10, v8

    if-lez v12, :cond_7

    .line 8
    iget-object v10, v1, Lcom/beizi/fusion/widget/EulerAngleView;->u:Ljava/lang/String;

    invoke-virtual {v7, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    cmpg-double v10, p3, v8

    if-ltz v10, :cond_6

    :cond_4
    iget-object v10, v1, Lcom/beizi/fusion/widget/EulerAngleView;->u:Ljava/lang/String;

    .line 9
    invoke-virtual {v6, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    cmpl-double v10, p3, v8

    if-gtz v10, :cond_6

    :cond_5
    iget-object v10, v1, Lcom/beizi/fusion/widget/EulerAngleView;->u:Ljava/lang/String;

    .line 10
    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    .line 11
    :cond_6
    invoke-static/range {p3 .. p4}, Ljava/lang/Math;->abs(D)D

    move-result-wide v10

    mul-double v10, v10, v4

    iget-wide v12, v1, Lcom/beizi/fusion/widget/EulerAngleView;->r:D

    div-double/2addr v10, v12

    goto :goto_1

    :cond_7
    move-wide v10, v8

    .line 12
    :goto_1
    iget-wide v12, v1, Lcom/beizi/fusion/widget/EulerAngleView;->s:D

    cmpl-double v14, v12, v8

    if-lez v14, :cond_b

    .line 13
    iget-object v12, v1, Lcom/beizi/fusion/widget/EulerAngleView;->v:Ljava/lang/String;

    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    cmpl-double v7, p5, v8

    if-gtz v7, :cond_a

    :cond_8
    iget-object v7, v1, Lcom/beizi/fusion/widget/EulerAngleView;->v:Ljava/lang/String;

    .line 14
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_9

    cmpg-double v6, p5, v8

    if-ltz v6, :cond_a

    :cond_9
    iget-object v6, v1, Lcom/beizi/fusion/widget/EulerAngleView;->v:Ljava/lang/String;

    .line 15
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 16
    :cond_a
    invoke-static/range {p5 .. p6}, Ljava/lang/Math;->abs(D)D

    move-result-wide v6

    mul-double v6, v6, v4

    iget-wide v4, v1, Lcom/beizi/fusion/widget/EulerAngleView;->s:D

    div-double v8, v6, v4

    .line 17
    :cond_b
    invoke-static {v2, v3, v10, v11}, Ljava/lang/Math;->max(DD)D

    move-result-wide v2

    .line 18
    iget-object v0, v1, Lcom/beizi/fusion/widget/EulerAngleView;->h:Lcom/beizi/fusion/update/ShakeArcView;

    invoke-static {v2, v3, v8, v9}, Ljava/lang/Math;->max(DD)D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/beizi/fusion/update/ShakeArcView;->setCurrentProgress(D)Lcom/beizi/fusion/update/ShakeArcView;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_c
    :goto_2
    return-void
.end method

.method public setEulerAngleRenderBean(Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRenderBean;)V
    .locals 4

    .line 1
    :try_start_0
    iput-object p1, p0, Lcom/beizi/fusion/widget/EulerAngleView;->d:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRenderBean;

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/widget/EulerAngleView;->c:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    if-nez p1, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;->getRules()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_6

    .line 4
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 5
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;

    if-nez v0, :cond_3

    goto :goto_0

    .line 6
    :cond_3
    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getDirection()Ljava/lang/String;

    move-result-object v1

    const-string v2, "x"

    .line 7
    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getAxis()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 8
    iput-object v1, p0, Lcom/beizi/fusion/widget/EulerAngleView;->t:Ljava/lang/String;

    goto :goto_0

    :cond_4
    const-string v2, "y"

    .line 9
    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getAxis()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 10
    iput-object v1, p0, Lcom/beizi/fusion/widget/EulerAngleView;->u:Ljava/lang/String;

    goto :goto_0

    :cond_5
    const-string v2, "z"

    .line 11
    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getAxis()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 12
    iput-object v1, p0, Lcom/beizi/fusion/widget/EulerAngleView;->v:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_6
    :goto_1
    return-void

    :catch_0
    move-exception p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_7
    return-void
.end method

.method public setEulerAngleViewRuleBean(Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/widget/EulerAngleView;->c:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    return-void
.end method

.method public startContinuousRotations()V
    .locals 8

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/beizi/fusion/widget/EulerAngleView;->c:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;->getRules()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_e

    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_1

    goto/16 :goto_1

    .line 4
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;

    if-nez v2, :cond_3

    goto :goto_0

    .line 6
    :cond_3
    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getAngle()D

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmpl-double v7, v3, v5

    if-nez v7, :cond_4

    goto :goto_0

    :cond_4
    const-string v3, "x"

    .line 7
    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getAxis()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v4, "1"

    const-string v5, "2"

    const/4 v6, 0x0

    if-eqz v3, :cond_7

    .line 8
    :try_start_1
    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getDirection()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const-string v5, "rotationX"

    if-eqz v3, :cond_5

    .line 9
    :try_start_2
    iget v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->k:F

    neg-float v2, v2

    invoke-direct {p0, v1, v5, v6, v2}, Lcom/beizi/fusion/widget/EulerAngleView;->a(Ljava/util/List;Ljava/lang/String;FF)V

    .line 10
    iget v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->k:F

    neg-float v2, v2

    invoke-direct {p0, v1, v5, v2, v6}, Lcom/beizi/fusion/widget/EulerAngleView;->a(Ljava/util/List;Ljava/lang/String;FF)V

    goto :goto_0

    .line 11
    :cond_5
    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getDirection()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 12
    iget v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->k:F

    invoke-direct {p0, v1, v5, v6, v2}, Lcom/beizi/fusion/widget/EulerAngleView;->a(Ljava/util/List;Ljava/lang/String;FF)V

    .line 13
    iget v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->k:F

    invoke-direct {p0, v1, v5, v2, v6}, Lcom/beizi/fusion/widget/EulerAngleView;->a(Ljava/util/List;Ljava/lang/String;FF)V

    goto :goto_0

    .line 14
    :cond_6
    iget v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->k:F

    invoke-direct {p0, v1, v5, v6, v2}, Lcom/beizi/fusion/widget/EulerAngleView;->a(Ljava/util/List;Ljava/lang/String;FF)V

    .line 15
    iget v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->k:F

    invoke-direct {p0, v1, v5, v2, v6}, Lcom/beizi/fusion/widget/EulerAngleView;->a(Ljava/util/List;Ljava/lang/String;FF)V

    .line 16
    iget v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->k:F

    neg-float v2, v2

    invoke-direct {p0, v1, v5, v6, v2}, Lcom/beizi/fusion/widget/EulerAngleView;->a(Ljava/util/List;Ljava/lang/String;FF)V

    .line 17
    iget v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->k:F

    neg-float v2, v2

    invoke-direct {p0, v1, v5, v2, v6}, Lcom/beizi/fusion/widget/EulerAngleView;->a(Ljava/util/List;Ljava/lang/String;FF)V

    goto :goto_0

    :cond_7
    const-string v3, "y"

    .line 18
    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getAxis()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_a

    .line 19
    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getDirection()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    const-string v5, "rotationY"

    if-eqz v3, :cond_8

    .line 20
    :try_start_3
    iget v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->l:F

    neg-float v2, v2

    invoke-direct {p0, v1, v5, v6, v2}, Lcom/beizi/fusion/widget/EulerAngleView;->a(Ljava/util/List;Ljava/lang/String;FF)V

    .line 21
    iget v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->l:F

    neg-float v2, v2

    invoke-direct {p0, v1, v5, v2, v6}, Lcom/beizi/fusion/widget/EulerAngleView;->a(Ljava/util/List;Ljava/lang/String;FF)V

    goto/16 :goto_0

    .line 22
    :cond_8
    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getDirection()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 23
    iget v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->l:F

    invoke-direct {p0, v1, v5, v6, v2}, Lcom/beizi/fusion/widget/EulerAngleView;->a(Ljava/util/List;Ljava/lang/String;FF)V

    .line 24
    iget v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->l:F

    invoke-direct {p0, v1, v5, v2, v6}, Lcom/beizi/fusion/widget/EulerAngleView;->a(Ljava/util/List;Ljava/lang/String;FF)V

    goto/16 :goto_0

    .line 25
    :cond_9
    iget v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->l:F

    invoke-direct {p0, v1, v5, v6, v2}, Lcom/beizi/fusion/widget/EulerAngleView;->a(Ljava/util/List;Ljava/lang/String;FF)V

    .line 26
    iget v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->l:F

    invoke-direct {p0, v1, v5, v2, v6}, Lcom/beizi/fusion/widget/EulerAngleView;->a(Ljava/util/List;Ljava/lang/String;FF)V

    .line 27
    iget v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->l:F

    neg-float v2, v2

    invoke-direct {p0, v1, v5, v6, v2}, Lcom/beizi/fusion/widget/EulerAngleView;->a(Ljava/util/List;Ljava/lang/String;FF)V

    .line 28
    iget v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->l:F

    neg-float v2, v2

    invoke-direct {p0, v1, v5, v2, v6}, Lcom/beizi/fusion/widget/EulerAngleView;->a(Ljava/util/List;Ljava/lang/String;FF)V

    goto/16 :goto_0

    :cond_a
    const-string v3, "z"

    .line 29
    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getAxis()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 30
    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getDirection()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    const-string v5, "rotation"

    if-eqz v3, :cond_b

    .line 31
    :try_start_4
    iget v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->m:F

    neg-float v2, v2

    invoke-direct {p0, v1, v5, v6, v2}, Lcom/beizi/fusion/widget/EulerAngleView;->a(Ljava/util/List;Ljava/lang/String;FF)V

    .line 32
    iget v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->m:F

    neg-float v2, v2

    invoke-direct {p0, v1, v5, v2, v6}, Lcom/beizi/fusion/widget/EulerAngleView;->a(Ljava/util/List;Ljava/lang/String;FF)V

    goto/16 :goto_0

    .line 33
    :cond_b
    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getDirection()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    .line 34
    iget v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->m:F

    invoke-direct {p0, v1, v5, v6, v2}, Lcom/beizi/fusion/widget/EulerAngleView;->a(Ljava/util/List;Ljava/lang/String;FF)V

    .line 35
    iget v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->m:F

    invoke-direct {p0, v1, v5, v2, v6}, Lcom/beizi/fusion/widget/EulerAngleView;->a(Ljava/util/List;Ljava/lang/String;FF)V

    goto/16 :goto_0

    .line 36
    :cond_c
    iget v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->m:F

    invoke-direct {p0, v1, v5, v6, v2}, Lcom/beizi/fusion/widget/EulerAngleView;->a(Ljava/util/List;Ljava/lang/String;FF)V

    .line 37
    iget v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->m:F

    invoke-direct {p0, v1, v5, v2, v6}, Lcom/beizi/fusion/widget/EulerAngleView;->a(Ljava/util/List;Ljava/lang/String;FF)V

    .line 38
    iget v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->m:F

    neg-float v2, v2

    invoke-direct {p0, v1, v5, v6, v2}, Lcom/beizi/fusion/widget/EulerAngleView;->a(Ljava/util/List;Ljava/lang/String;FF)V

    .line 39
    iget v2, p0, Lcom/beizi/fusion/widget/EulerAngleView;->m:F

    neg-float v2, v2

    invoke-direct {p0, v1, v5, v2, v6}, Lcom/beizi/fusion/widget/EulerAngleView;->a(Ljava/util/List;Ljava/lang/String;FF)V

    goto/16 :goto_0

    .line 40
    :cond_d
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_f

    .line 41
    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v0, p0, Lcom/beizi/fusion/widget/EulerAngleView;->w:Landroid/animation/AnimatorSet;

    .line 42
    new-instance v2, Lcom/beizi/fusion/widget/EulerAngleView$2;

    invoke-direct {v2, p0}, Lcom/beizi/fusion/widget/EulerAngleView$2;-><init>(Lcom/beizi/fusion/widget/EulerAngleView;)V

    invoke-virtual {v0, v2}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 43
    iget-object v0, p0, Lcom/beizi/fusion/widget/EulerAngleView;->w:Landroid/animation/AnimatorSet;

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->playSequentially(Ljava/util/List;)V

    .line 44
    iget-object v0, p0, Lcom/beizi/fusion/widget/EulerAngleView;->w:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_2

    :cond_e
    :goto_1
    return-void

    :catch_0
    move-exception v0

    .line 45
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_f
    :goto_2
    return-void
.end method
