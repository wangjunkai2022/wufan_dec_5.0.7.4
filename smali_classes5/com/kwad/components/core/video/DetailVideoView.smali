.class public Lcom/kwad/components/core/video/DetailVideoView;
.super Lcom/kwad/sdk/widget/KSFrameLayout;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/video/DetailVideoView$a;
    }
.end annotation


# instance fields
.field public UY:Lcom/kwad/components/core/page/widget/b;

.field private UZ:Lcom/kwad/components/core/video/b;

.field private Va:Landroid/graphics/SurfaceTexture;

.field public Vb:Landroid/view/Surface;

.field private Vc:Lcom/kwad/components/core/video/DetailVideoView$a;

.field private Vd:Lcom/kwad/sdk/core/response/model/PhotoInfo$VideoInfo;

.field private final Ve:Landroid/graphics/RectF;

.field private Vf:I

.field private Vg:I

.field private final Vh:Lcom/kwad/components/core/video/d;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private mMatrix:Landroid/graphics/Matrix;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/sdk/widget/KSFrameLayout;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/video/DetailVideoView;->Ve:Landroid/graphics/RectF;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/kwad/components/core/video/DetailVideoView;->Vf:I

    .line 4
    iput v0, p0, Lcom/kwad/components/core/video/DetailVideoView;->Vg:I

    .line 5
    new-instance v0, Lcom/kwad/components/core/video/d;

    invoke-direct {v0}, Lcom/kwad/components/core/video/d;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/video/DetailVideoView;->Vh:Lcom/kwad/components/core/video/d;

    .line 6
    invoke-direct {p0, p1}, Lcom/kwad/components/core/video/DetailVideoView;->A(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2}, Lcom/kwad/sdk/widget/KSFrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 8
    new-instance p2, Landroid/graphics/RectF;

    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    iput-object p2, p0, Lcom/kwad/components/core/video/DetailVideoView;->Ve:Landroid/graphics/RectF;

    const/4 p2, 0x0

    .line 9
    iput p2, p0, Lcom/kwad/components/core/video/DetailVideoView;->Vf:I

    .line 10
    iput p2, p0, Lcom/kwad/components/core/video/DetailVideoView;->Vg:I

    .line 11
    new-instance p2, Lcom/kwad/components/core/video/d;

    invoke-direct {p2}, Lcom/kwad/components/core/video/d;-><init>()V

    iput-object p2, p0, Lcom/kwad/components/core/video/DetailVideoView;->Vh:Lcom/kwad/components/core/video/d;

    .line 12
    invoke-direct {p0, p1}, Lcom/kwad/components/core/video/DetailVideoView;->A(Landroid/content/Context;)V

    return-void
.end method

.method private A(Landroid/content/Context;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/video/DetailVideoView;->mMatrix:Landroid/graphics/Matrix;

    .line 2
    new-instance v0, Lcom/kwad/components/core/page/widget/b;

    invoke-direct {v0, p1}, Lcom/kwad/components/core/page/widget/b;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/kwad/components/core/video/DetailVideoView;->UY:Lcom/kwad/components/core/page/widget/b;

    .line 3
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v0, -0x1

    const/16 v1, 0x11

    invoke-direct {p1, v0, v0, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/video/DetailVideoView;->UY:Lcom/kwad/components/core/page/widget/b;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 5
    invoke-direct {p0}, Lcom/kwad/components/core/video/DetailVideoView;->sd()V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/video/DetailVideoView;Landroid/graphics/SurfaceTexture;)Landroid/graphics/SurfaceTexture;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/video/DetailVideoView;->Va:Landroid/graphics/SurfaceTexture;

    return-object p1
.end method

.method private a(Landroid/view/View;JJ)V
    .locals 3

    if-eqz p1, :cond_6

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-eqz v2, :cond_6

    cmp-long v2, p4, v0

    if-nez v2, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    return-void

    .line 3
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    .line 4
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    if-eqz v1, :cond_6

    if-nez v0, :cond_2

    goto :goto_1

    .line 5
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    long-to-float p2, p2

    long-to-float p3, p4

    div-float/2addr p2, p3

    int-to-float p3, v0

    mul-float p3, p3, p2

    int-to-float p4, v1

    cmpl-float p5, p3, p4

    if-lez p5, :cond_3

    div-float/2addr p4, p2

    float-to-int v0, p4

    goto :goto_0

    :cond_3
    float-to-int v1, p3

    :goto_0
    const/4 p2, -0x1

    if-eqz v1, :cond_4

    if-nez v0, :cond_5

    :cond_4
    const/4 v0, -0x1

    const/4 v1, -0x1

    .line 6
    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    .line 7
    iput v1, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 8
    iput v0, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 9
    iget-object p2, p0, Lcom/kwad/components/core/video/DetailVideoView;->UY:Lcom/kwad/components/core/page/widget/b;

    invoke-virtual {p2, p1}, Landroid/view/TextureView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_6
    :goto_1
    return-void
.end method

.method static synthetic c(Lcom/kwad/components/core/video/DetailVideoView;)Landroid/graphics/SurfaceTexture;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/video/DetailVideoView;->Va:Landroid/graphics/SurfaceTexture;

    return-object p0
.end method

.method static synthetic d(Lcom/kwad/components/core/video/DetailVideoView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/video/DetailVideoView;->se()V

    return-void
.end method

.method static synthetic e(Lcom/kwad/components/core/video/DetailVideoView;)Lcom/kwad/components/core/video/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/video/DetailVideoView;->UZ:Lcom/kwad/components/core/video/b;

    return-object p0
.end method

.method private sd()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/DetailVideoView;->UY:Lcom/kwad/components/core/page/widget/b;

    new-instance v1, Lcom/kwad/components/core/video/DetailVideoView$1;

    invoke-direct {v1, p0}, Lcom/kwad/components/core/video/DetailVideoView$1;-><init>(Lcom/kwad/components/core/video/DetailVideoView;)V

    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    return-void
.end method

.method private se()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/DetailVideoView;->Vb:Landroid/view/Surface;

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    invoke-virtual {v0}, Landroid/view/Surface;->release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 3
    invoke-static {v0}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    :goto_0
    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lcom/kwad/components/core/video/DetailVideoView;->Vb:Landroid/view/Surface;

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/sdk/core/response/model/AdTemplate;ILandroid/animation/ValueAnimator$AnimatorUpdateListener;)Landroid/animation/ValueAnimator;
    .locals 8

    .line 10
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v0

    int-to-float v0, v0

    .line 11
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v1

    int-to-float v1, v1

    div-float v5, v0, v1

    .line 12
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p1

    .line 13
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->V(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v4

    .line 14
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    const/4 p1, 0x2

    new-array p1, p1, [I

    float-to-int v0, v0

    const/4 v1, 0x0

    aput v0, p1, v1

    const/4 v0, 0x1

    aput p2, p1, v0

    .line 15
    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object p1

    .line 16
    new-instance p2, Lcom/kwad/components/core/video/DetailVideoView$2;

    move-object v2, p2

    move-object v3, p0

    move-object v7, p3

    invoke-direct/range {v2 .. v7}, Lcom/kwad/components/core/video/DetailVideoView$2;-><init>(Lcom/kwad/components/core/video/DetailVideoView;ZFLandroid/view/ViewGroup$LayoutParams;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    invoke-virtual {p1, p2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const/4 p2, 0x0

    const p3, 0x3f147ae1    # 0.58f

    const/high16 v0, 0x3f800000    # 1.0f

    .line 17
    invoke-static {p2, p2, p3, v0}, Landroidx/core/view/animation/PathInterpolatorCompat;->create(FFFF)Landroid/view/animation/Interpolator;

    move-result-object p2

    const-wide/16 v0, 0x1f4

    .line 18
    invoke-virtual {p1, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 19
    invoke-virtual {p1, p2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    return-object p1
.end method

.method public final adaptVideoSize(II)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/DetailVideoView;->UY:Lcom/kwad/components/core/page/widget/b;

    if-nez v0, :cond_0

    const-string p1, "DetailVideoView"

    const-string p2, "adaptVideoSize mTextureView is null"

    .line 2
    invoke-static {p1, p2}, Lcom/kwad/sdk/core/e/c;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    iput p2, p0, Lcom/kwad/components/core/video/DetailVideoView;->Vg:I

    .line 4
    iput p1, p0, Lcom/kwad/components/core/video/DetailVideoView;->Vf:I

    .line 5
    iget-object v0, p0, Lcom/kwad/components/core/video/DetailVideoView;->Vh:Lcom/kwad/components/core/video/d;

    invoke-virtual {v0}, Lcom/kwad/components/core/video/d;->sf()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 6
    iget-object v0, p0, Lcom/kwad/components/core/video/DetailVideoView;->Vh:Lcom/kwad/components/core/video/d;

    invoke-virtual {v0}, Lcom/kwad/components/core/video/d;->sg()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    goto :goto_0

    .line 7
    :cond_1
    new-instance v1, Lcom/kwad/components/core/video/VideoAdapters$b;

    invoke-direct {v1}, Lcom/kwad/components/core/video/VideoAdapters$b;-><init>()V

    goto :goto_0

    .line 8
    :cond_2
    new-instance v1, Lcom/kwad/components/core/video/VideoAdapters$c;

    invoke-direct {v1}, Lcom/kwad/components/core/video/VideoAdapters$c;-><init>()V

    :goto_0
    if-eqz v1, :cond_3

    .line 9
    iget-object v0, p0, Lcom/kwad/components/core/video/DetailVideoView;->UY:Lcom/kwad/components/core/page/widget/b;

    .line 10
    invoke-virtual {v0}, Landroid/view/TextureView;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    .line 11
    invoke-interface {v1, v0, v2, p1, p2}, Lcom/kwad/components/core/video/c;->a(Landroid/view/View;Landroid/view/View;II)V

    :cond_3
    return-void

    .line 12
    :cond_4
    iget-object v0, p0, Lcom/kwad/components/core/video/DetailVideoView;->Vh:Lcom/kwad/components/core/video/d;

    invoke-virtual {v0}, Lcom/kwad/components/core/video/d;->sl()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 13
    iget-object p1, p0, Lcom/kwad/components/core/video/DetailVideoView;->UY:Lcom/kwad/components/core/page/widget/b;

    invoke-static {p1}, Lcom/kwad/sdk/c/a/a;->D(Landroid/view/View;)V

    return-void

    .line 14
    :cond_5
    iget-object v0, p0, Lcom/kwad/components/core/video/DetailVideoView;->Vh:Lcom/kwad/components/core/video/d;

    invoke-virtual {v0}, Lcom/kwad/components/core/video/d;->sh()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 15
    iget-object v0, p0, Lcom/kwad/components/core/video/DetailVideoView;->UY:Lcom/kwad/components/core/page/widget/b;

    invoke-static {v0, p1, p2}, Lcom/kwad/sdk/c/a/a;->e(Landroid/view/View;II)V

    return-void

    .line 16
    :cond_6
    iget-object v0, p0, Lcom/kwad/components/core/video/DetailVideoView;->Vh:Lcom/kwad/components/core/video/d;

    invoke-virtual {v0}, Lcom/kwad/components/core/video/d;->sj()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 17
    iget-object v0, p0, Lcom/kwad/components/core/video/DetailVideoView;->UY:Lcom/kwad/components/core/page/widget/b;

    invoke-static {v0, p1, p2}, Lcom/kwad/sdk/c/a/a;->f(Landroid/view/View;II)V

    return-void

    .line 18
    :cond_7
    iget-object v0, p0, Lcom/kwad/components/core/video/DetailVideoView;->Vh:Lcom/kwad/components/core/video/d;

    invoke-virtual {v0}, Lcom/kwad/components/core/video/d;->si()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 19
    iget-object v0, p0, Lcom/kwad/components/core/video/DetailVideoView;->UY:Lcom/kwad/components/core/page/widget/b;

    invoke-static {v0, p1, p2}, Lcom/kwad/sdk/c/a/a;->d(Landroid/view/View;II)V

    return-void

    .line 20
    :cond_8
    iget-object v0, p0, Lcom/kwad/components/core/video/DetailVideoView;->Vh:Lcom/kwad/components/core/video/d;

    invoke-virtual {v0}, Lcom/kwad/components/core/video/d;->sk()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 21
    iget-object v2, p0, Lcom/kwad/components/core/video/DetailVideoView;->UY:Lcom/kwad/components/core/page/widget/b;

    int-to-long v3, p1

    int-to-long v5, p2

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lcom/kwad/components/core/video/DetailVideoView;->a(Landroid/view/View;JJ)V

    return-void

    .line 22
    :cond_9
    iget-object v0, p0, Lcom/kwad/components/core/video/DetailVideoView;->UY:Lcom/kwad/components/core/page/widget/b;

    invoke-virtual {v0}, Landroid/view/TextureView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_a

    return-void

    .line 23
    :cond_a
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    .line 24
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    if-eqz v1, :cond_d

    if-nez v0, :cond_b

    goto :goto_2

    .line 25
    :cond_b
    iget-object v2, p0, Lcom/kwad/components/core/video/DetailVideoView;->Vd:Lcom/kwad/sdk/core/response/model/PhotoInfo$VideoInfo;

    if-eqz v2, :cond_c

    iget-object v3, p0, Lcom/kwad/components/core/video/DetailVideoView;->mMatrix:Landroid/graphics/Matrix;

    .line 26
    invoke-static {v3, v1, v0, v2}, Lcom/kwad/sdk/core/response/b/h;->a(Landroid/graphics/Matrix;IILcom/kwad/sdk/core/response/model/PhotoInfo$VideoInfo;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 27
    iget-object p1, p0, Lcom/kwad/components/core/video/DetailVideoView;->UY:Lcom/kwad/components/core/page/widget/b;

    invoke-virtual {p1}, Landroid/view/TextureView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    const/4 p2, -0x1

    .line 28
    iput p2, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 29
    iput p2, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 30
    iget-object p2, p0, Lcom/kwad/components/core/video/DetailVideoView;->UY:Lcom/kwad/components/core/page/widget/b;

    iget-object v0, p0, Lcom/kwad/components/core/video/DetailVideoView;->mMatrix:Landroid/graphics/Matrix;

    invoke-virtual {p2, v0}, Landroid/view/TextureView;->setTransform(Landroid/graphics/Matrix;)V

    .line 31
    iget-object p2, p0, Lcom/kwad/components/core/video/DetailVideoView;->UY:Lcom/kwad/components/core/page/widget/b;

    invoke-virtual {p2, p1}, Landroid/view/TextureView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_1

    .line 32
    :cond_c
    iget-object v0, p0, Lcom/kwad/components/core/video/DetailVideoView;->UY:Lcom/kwad/components/core/page/widget/b;

    invoke-virtual {v0}, Landroid/view/TextureView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 33
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    int-to-float p2, p2

    int-to-float p1, p1

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float p1, p1, v2

    div-float/2addr p2, p1

    int-to-float p1, v1

    mul-float p2, p2, p1

    float-to-int p1, p2

    .line 34
    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 35
    iget-object p1, p0, Lcom/kwad/components/core/video/DetailVideoView;->mMatrix:Landroid/graphics/Matrix;

    invoke-virtual {p1}, Landroid/graphics/Matrix;->reset()V

    .line 36
    iget-object p1, p0, Lcom/kwad/components/core/video/DetailVideoView;->UY:Lcom/kwad/components/core/page/widget/b;

    iget-object p2, p0, Lcom/kwad/components/core/video/DetailVideoView;->mMatrix:Landroid/graphics/Matrix;

    invoke-virtual {p1, p2}, Landroid/view/TextureView;->setTransform(Landroid/graphics/Matrix;)V

    .line 37
    iget-object p1, p0, Lcom/kwad/components/core/video/DetailVideoView;->UY:Lcom/kwad/components/core/page/widget/b;

    invoke-virtual {p1, v0}, Landroid/view/TextureView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 38
    :goto_1
    iget-object p1, p0, Lcom/kwad/components/core/video/DetailVideoView;->Ve:Landroid/graphics/RectF;

    iget-object p2, p0, Lcom/kwad/components/core/video/DetailVideoView;->UY:Lcom/kwad/components/core/page/widget/b;

    invoke-virtual {p2}, Landroid/view/TextureView;->getLeft()I

    move-result p2

    int-to-float p2, p2

    iget-object v0, p0, Lcom/kwad/components/core/video/DetailVideoView;->UY:Lcom/kwad/components/core/page/widget/b;

    invoke-virtual {v0}, Landroid/view/TextureView;->getTop()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lcom/kwad/components/core/video/DetailVideoView;->UY:Lcom/kwad/components/core/page/widget/b;

    invoke-virtual {v1}, Landroid/view/TextureView;->getRight()I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Lcom/kwad/components/core/video/DetailVideoView;->UY:Lcom/kwad/components/core/page/widget/b;

    .line 39
    invoke-virtual {v2}, Landroid/view/TextureView;->getBottom()I

    move-result v2

    int-to-float v2, v2

    .line 40
    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/graphics/RectF;->set(FFFF)V

    :cond_d
    :goto_2
    return-void
.end method

.method public final fixWidth(Z)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/DetailVideoView;->Vh:Lcom/kwad/components/core/video/d;

    invoke-virtual {v0, p1}, Lcom/kwad/components/core/video/d;->aR(Z)V

    return-void
.end method

.method public final g(ZI)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/kwad/components/core/video/DetailVideoView;->Vh:Lcom/kwad/components/core/video/d;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/video/d;->setAd(Z)V

    .line 2
    iget-object p1, p0, Lcom/kwad/components/core/video/DetailVideoView;->Vh:Lcom/kwad/components/core/video/d;

    invoke-virtual {p1, p2}, Lcom/kwad/components/core/video/d;->aN(I)V

    return-void
.end method

.method public getTextureViewGravity()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/DetailVideoView;->UY:Lcom/kwad/components/core/page/widget/b;

    const/16 v1, 0x11

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-virtual {v0}, Landroid/view/TextureView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 3
    instance-of v2, v0, Landroid/widget/FrameLayout$LayoutParams;

    if-eqz v2, :cond_1

    .line 4
    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 5
    iget v0, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    return v0

    :cond_1
    return v1
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/DetailVideoView;->UY:Lcom/kwad/components/core/page/widget/b;

    if-ne p1, v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/kwad/components/core/video/DetailVideoView;->Vc:Lcom/kwad/components/core/video/DetailVideoView$a;

    if-eqz p1, :cond_1

    .line 3
    invoke-interface {p1}, Lcom/kwad/components/core/video/DetailVideoView$a;->onClickVideoView()V

    return-void

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/core/video/DetailVideoView;->Vc:Lcom/kwad/components/core/video/DetailVideoView$a;

    if-eqz p1, :cond_1

    .line 5
    invoke-interface {p1}, Lcom/kwad/components/core/video/DetailVideoView$a;->onClickRootView()V

    :cond_1
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/widget/KSFrameLayout;->onDetachedFromWindow()V

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/core/video/DetailVideoView;->se()V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/video/DetailVideoView;->Va:Landroid/graphics/SurfaceTexture;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->release()V

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/kwad/components/core/video/DetailVideoView;->Va:Landroid/graphics/SurfaceTexture;

    :cond_0
    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lcom/kwad/sdk/widget/KSFrameLayout;->onSizeChanged(IIII)V

    .line 2
    iget p1, p0, Lcom/kwad/components/core/video/DetailVideoView;->Vf:I

    if-lez p1, :cond_0

    iget p2, p0, Lcom/kwad/components/core/video/DetailVideoView;->Vg:I

    if-lez p2, :cond_0

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/kwad/components/core/video/DetailVideoView;->adaptVideoSize(II)V

    :cond_0
    return-void
.end method

.method public setAd(Z)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/DetailVideoView;->Vh:Lcom/kwad/components/core/video/d;

    invoke-virtual {v0, p1}, Lcom/kwad/components/core/video/d;->setAd(Z)V

    return-void
.end method

.method public setClickListener(Lcom/kwad/components/core/video/DetailVideoView$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/video/DetailVideoView;->Vc:Lcom/kwad/components/core/video/DetailVideoView$a;

    .line 2
    invoke-virtual {p0, p0}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public setFillXY(Z)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/DetailVideoView;->Vh:Lcom/kwad/components/core/video/d;

    invoke-virtual {v0, p1}, Lcom/kwad/components/core/video/d;->setFillXY(Z)V

    return-void
.end method

.method public setForce(Z)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/DetailVideoView;->Vh:Lcom/kwad/components/core/video/d;

    invoke-virtual {v0, p1}, Lcom/kwad/components/core/video/d;->setForce(Z)V

    return-void
.end method

.method public setHorizontalVideo(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/DetailVideoView;->Vh:Lcom/kwad/components/core/video/d;

    invoke-virtual {v0, p1}, Lcom/kwad/components/core/video/d;->setHorizontalVideo(Z)V

    return-void
.end method

.method public setMediaPlayer(Lcom/kwad/components/core/video/b;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/video/DetailVideoView;->UZ:Lcom/kwad/components/core/video/b;

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/video/DetailVideoView;->Vb:Landroid/view/Surface;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1, v0}, Lcom/kwad/components/core/video/b;->setSurface(Landroid/view/Surface;)V

    :cond_0
    return-void
.end method

.method public setRadius(F)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 2
    invoke-static {p0, p1}, Lcom/kwad/components/core/widget/h;->b(Landroid/view/View;F)V

    :cond_0
    return-void
.end method

.method public setVideoInfo(Lcom/kwad/sdk/core/response/model/PhotoInfo$VideoInfo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/video/DetailVideoView;->Vd:Lcom/kwad/sdk/core/response/model/PhotoInfo$VideoInfo;

    return-void
.end method

.method public final updateTextureViewGravity(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/DetailVideoView;->UY:Lcom/kwad/components/core/page/widget/b;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Landroid/view/TextureView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 3
    instance-of v1, v0, Landroid/widget/FrameLayout$LayoutParams;

    if-eqz v1, :cond_1

    .line 4
    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 5
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 6
    iget-object p1, p0, Lcom/kwad/components/core/video/DetailVideoView;->UY:Lcom/kwad/components/core/page/widget/b;

    invoke-virtual {p1}, Landroid/view/TextureView;->requestLayout()V

    :cond_1
    return-void
.end method
