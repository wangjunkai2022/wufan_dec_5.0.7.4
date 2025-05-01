.class public Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;
.super Lcom/kwad/components/ad/splashscreen/widget/c;
.source "SourceFile"


# static fields
.field private static GA:I = 0xc

.field private static GB:I = 0x19

.field private static Gx:I = 0x32

.field private static Gy:I = -0xc

.field private static Gz:I = -0x19


# instance fields
.field private GC:I
    .annotation build Landroidx/annotation/DrawableRes;
    .end annotation
.end field

.field private Gw:Landroid/widget/ImageView;

.field private fq:Landroid/widget/ImageView;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/splashscreen/widget/c;-><init>(Landroid/content/Context;)V

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

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/kwad/components/ad/splashscreen/widget/c;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

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

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/kwad/components/ad/splashscreen/widget/c;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method protected final a(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    sget-object v0, Lcom/kwad/sdk/R$styleable;->ksad_KsShakeView:[I

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 3
    sget p3, Lcom/kwad/sdk/R$styleable;->ksad_KsShakeView_ksad_shakeIcon:I

    sget v0, Lcom/kwad/sdk/R$drawable;->ksad_ic_rotate_phone:I

    .line 4
    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p3

    iput p3, p0, Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;->GC:I

    .line 5
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 6
    new-instance p2, Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-direct {p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;->Gw:Landroid/widget/ImageView;

    .line 7
    sget p3, Lcom/kwad/sdk/R$drawable;->ksad_ic_rotate_line:I

    invoke-virtual {p2, p3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 8
    new-instance p2, Landroid/widget/FrameLayout$LayoutParams;

    const/4 p3, -0x2

    invoke-direct {p2, p3, p3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v0, 0x31

    .line 9
    iput v0, p2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 10
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;->Gw:Landroid/widget/ImageView;

    invoke-virtual {p0, v0, p2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 11
    new-instance p2, Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;->fq:Landroid/widget/ImageView;

    .line 12
    new-instance p2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {p2, p3, p3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/high16 p3, 0x41b00000    # 22.0f

    .line 13
    invoke-static {p1, p3}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result p1

    iput p1, p2, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    const/4 p1, 0x1

    .line 14
    iput p1, p2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 15
    iget-object p1, p0, Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;->fq:Landroid/widget/ImageView;

    invoke-virtual {p0, p1, p2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method protected getAnimationDelayTime()I
    .locals 1

    const/16 v0, 0x1f4

    return v0
.end method

.method protected getInteractionView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;->fq:Landroid/widget/ImageView;

    return-object v0
.end method

.method protected final mr()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;->fq:Landroid/widget/ImageView;

    iget v1, p0, Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;->GC:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method

.method protected final ms()Landroid/animation/Animator;
    .locals 23

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;->getInteractionView()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    new-instance v1, Landroid/animation/AnimatorSet;

    invoke-direct {v1}, Landroid/animation/AnimatorSet;-><init>()V

    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    invoke-virtual {v0, v2}, Landroid/view/View;->setPivotX(F)V

    .line 4
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v3

    invoke-virtual {v0, v2}, Landroid/view/View;->setPivotY(F)V

    const/4 v2, 0x2

    new-array v3, v2, [F

    const/4 v4, 0x0

    const/4 v5, 0x0

    aput v5, v3, v4

    .line 5
    sget v6, Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;->Gz:I

    int-to-float v6, v6

    const/4 v7, 0x1

    aput v6, v3, v7

    const-string v6, "rotation"

    .line 6
    invoke-static {v0, v6, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v3

    const-wide/16 v8, 0x1f4

    .line 7
    invoke-virtual {v3, v8, v9}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v3

    new-array v10, v2, [F

    .line 8
    fill-array-data v10, :array_0

    const-string v11, "alpha"

    invoke-static {v0, v11, v10}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v10

    const-wide/16 v12, 0x154

    .line 9
    invoke-virtual {v10, v12, v13}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    new-array v14, v2, [F

    .line 10
    sget v15, Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;->Gz:I

    int-to-float v15, v15

    aput v15, v14, v4

    aput v5, v14, v7

    .line 11
    invoke-static {v0, v6, v14}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v14

    sget v15, Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;->Gx:I

    int-to-long v12, v15

    .line 12
    invoke-virtual {v14, v12, v13}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v12

    new-array v13, v2, [F

    aput v5, v13, v4

    .line 13
    sget v14, Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;->GA:I

    int-to-float v14, v14

    aput v14, v13, v7

    .line 14
    invoke-static {v0, v6, v13}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v13

    sget v14, Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;->Gx:I

    int-to-long v14, v14

    .line 15
    invoke-virtual {v13, v14, v15}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v13

    new-array v14, v2, [F

    .line 16
    sget v15, Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;->GA:I

    int-to-float v15, v15

    aput v15, v14, v4

    aput v5, v14, v7

    .line 17
    invoke-static {v0, v6, v14}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v14

    sget v15, Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;->Gx:I

    int-to-long v8, v15

    .line 18
    invoke-virtual {v14, v8, v9}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v8

    new-array v9, v2, [F

    aput v5, v9, v4

    .line 19
    sget v14, Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;->Gy:I

    int-to-float v14, v14

    aput v14, v9, v7

    .line 20
    invoke-static {v0, v6, v9}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v9

    sget v14, Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;->Gx:I

    int-to-long v14, v14

    .line 21
    invoke-virtual {v9, v14, v15}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v9

    new-array v14, v2, [F

    .line 22
    sget v15, Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;->Gy:I

    int-to-float v15, v15

    aput v15, v14, v4

    aput v5, v14, v7

    .line 23
    invoke-static {v0, v6, v14}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v14

    sget v15, Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;->Gx:I

    move-object/from16 v21, v8

    int-to-long v7, v15

    .line 24
    invoke-virtual {v14, v7, v8}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v7

    new-array v8, v2, [F

    .line 25
    fill-array-data v8, :array_1

    .line 26
    invoke-static {v0, v11, v8}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v8

    const-wide/16 v14, 0x1f4

    .line 27
    invoke-virtual {v8, v14, v15}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    new-array v14, v2, [F

    aput v5, v14, v4

    .line 28
    sget v15, Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;->GB:I

    int-to-float v15, v15

    const/16 v20, 0x1

    aput v15, v14, v20

    .line 29
    invoke-static {v0, v6, v14}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v14

    move-object/from16 v22, v6

    const-wide/16 v5, 0x1f4

    .line 30
    invoke-virtual {v14, v5, v6}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v5

    new-array v6, v2, [F

    .line 31
    fill-array-data v6, :array_2

    .line 32
    invoke-static {v0, v11, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v6

    move-object v14, v5

    const-wide/16 v4, 0x154

    .line 33
    invoke-virtual {v10, v4, v5}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    new-array v4, v2, [F

    .line 34
    sget v5, Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;->GB:I

    int-to-float v5, v5

    const/4 v11, 0x0

    aput v5, v4, v11

    const/4 v5, 0x0

    aput v5, v4, v20

    move-object/from16 v15, v22

    .line 35
    invoke-static {v0, v15, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v4

    sget v5, Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;->Gx:I

    move-object/from16 v17, v12

    int-to-long v11, v5

    .line 36
    invoke-virtual {v4, v11, v12}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v4

    new-array v5, v2, [F

    const/4 v11, 0x0

    const/4 v12, 0x0

    aput v11, v5, v12

    move-object v11, v15

    .line 37
    sget v15, Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;->Gy:I

    int-to-float v15, v15

    aput v15, v5, v20

    .line 38
    invoke-static {v0, v11, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v5

    sget v15, Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;->Gx:I

    move-object/from16 v18, v13

    int-to-long v12, v15

    .line 39
    invoke-virtual {v5, v12, v13}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v5

    new-array v12, v2, [F

    .line 40
    sget v13, Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;->Gy:I

    int-to-float v13, v13

    const/16 v19, 0x0

    aput v13, v12, v19

    const/4 v13, 0x0

    aput v13, v12, v20

    .line 41
    invoke-static {v0, v11, v12}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v12

    sget v15, Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;->Gx:I

    move-object/from16 v16, v14

    int-to-long v13, v15

    .line 42
    invoke-virtual {v12, v13, v14}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v12

    new-array v13, v2, [F

    const/4 v14, 0x0

    aput v14, v13, v19

    .line 43
    sget v14, Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;->GA:I

    int-to-float v14, v14

    aput v14, v13, v20

    .line 44
    invoke-static {v0, v11, v13}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v13

    sget v14, Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;->Gx:I

    int-to-long v14, v14

    .line 45
    invoke-virtual {v13, v14, v15}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v13

    new-array v14, v2, [F

    .line 46
    sget v15, Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;->GA:I

    int-to-float v15, v15

    aput v15, v14, v19

    const/4 v15, 0x0

    aput v15, v14, v20

    .line 47
    invoke-static {v0, v11, v14}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    sget v11, Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;->Gx:I

    int-to-long v14, v11

    .line 48
    invoke-virtual {v0, v14, v15}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const/16 v11, 0xf

    new-array v11, v11, [Landroid/animation/Animator;

    aput-object v3, v11, v19

    aput-object v10, v11, v20

    aput-object v17, v11, v2

    const/4 v2, 0x3

    aput-object v18, v11, v2

    const/4 v2, 0x4

    aput-object v21, v11, v2

    const/4 v2, 0x5

    aput-object v9, v11, v2

    const/4 v2, 0x6

    aput-object v7, v11, v2

    const/4 v2, 0x7

    aput-object v8, v11, v2

    const/16 v2, 0x8

    aput-object v16, v11, v2

    const/16 v2, 0x9

    aput-object v6, v11, v2

    const/16 v2, 0xa

    aput-object v4, v11, v2

    const/16 v2, 0xb

    aput-object v5, v11, v2

    const/16 v2, 0xc

    aput-object v12, v11, v2

    const/16 v2, 0xd

    aput-object v13, v11, v2

    const/16 v2, 0xe

    aput-object v0, v11, v2

    .line 49
    invoke-virtual {v1, v11}, Landroid/animation/AnimatorSet;->playSequentially([Landroid/animation/Animator;)V

    return-object v1

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data

    :array_2
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method protected final mt()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;->getInteractionView()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setRotation(F)V

    return-void
.end method
