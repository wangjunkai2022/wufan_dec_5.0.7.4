.class public Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/sdk/core/view/ScaleAnimSeekBar$a;
    }
.end annotation


# instance fields
.field private aEA:Landroid/graphics/Rect;

.field private aEB:Landroid/graphics/drawable/Drawable;

.field private aEC:Z

.field private aED:Z

.field private aEE:Z

.field private aEF:Z

.field private aEG:Z

.field private aEH:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/kwad/sdk/core/view/ScaleAnimSeekBar$a;",
            ">;"
        }
    .end annotation
.end field

.field private aEI:Z

.field private aEJ:Z

.field private aEK:Landroid/animation/ValueAnimator;

.field private aEL:Landroid/animation/ValueAnimator;

.field private aEM:Landroid/animation/ValueAnimator;

.field private aEN:F

.field private aEO:F

.field private aEP:F

.field private aEQ:F

.field private aER:I

.field private aES:Z

.field private aEd:Landroid/graphics/Paint;

.field private aEe:I

.field private aEf:I

.field private aEg:I

.field private aEh:I

.field private aEi:I

.field private aEj:I

.field private aEk:I

.field private aEl:I

.field private aEm:Z

.field private aEn:I

.field private aEo:I

.field private aEp:I

.field private aEq:I

.field private aEr:I

.field private aEs:I

.field private aEt:I

.field private aEu:Landroid/graphics/drawable/GradientDrawable;

.field private aEv:Landroid/graphics/drawable/GradientDrawable;

.field private aEw:Landroid/graphics/drawable/GradientDrawable;

.field private aEx:Landroid/graphics/Rect;

.field private aEy:Landroid/graphics/Rect;

.field private aEz:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 p3, 0x64

    .line 4
    iput p3, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEj:I

    const/4 p3, 0x0

    .line 5
    iput-boolean p3, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEm:Z

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEB:Landroid/graphics/drawable/Drawable;

    .line 7
    iput-boolean p3, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEC:Z

    .line 8
    iput-boolean p3, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aED:Z

    .line 9
    iput-boolean p3, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEE:Z

    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEF:Z

    .line 11
    iput-boolean v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEI:Z

    .line 12
    iput-boolean p3, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEJ:Z

    const/high16 p3, 0x3f800000    # 1.0f

    .line 13
    iput p3, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEN:F

    const v0, 0x3fab851f    # 1.34f

    .line 14
    iput v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEO:F

    .line 15
    iput p3, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEP:F

    const/high16 p3, 0x40000000    # 2.0f

    .line 16
    iput p3, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEQ:F

    .line 17
    invoke-direct {p0, p1, p2}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEp:I

    return p1
.end method

.method private a(IZZ)V
    .locals 1

    .line 13
    iget v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEi:I

    if-gt p1, v0, :cond_0

    :goto_0
    move p1, v0

    goto :goto_1

    .line 14
    :cond_0
    iget v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEj:I

    if-lt p1, v0, :cond_1

    goto :goto_0

    .line 15
    :cond_1
    :goto_1
    invoke-direct {p0, p2, p1}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->i(ZI)V

    .line 16
    invoke-direct {p0}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->getOnSeekBarChangedListener()Lcom/kwad/sdk/core/view/ScaleAnimSeekBar$a;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 17
    iget p2, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEq:I

    iget v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEp:I

    if-eq p2, v0, :cond_2

    .line 18
    iput-boolean p3, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEE:Z

    .line 19
    invoke-interface {p1, p0, p3}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar$a;->a(Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;Z)V

    const/4 p1, 0x0

    .line 20
    iput-boolean p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEE:Z

    .line 21
    :cond_2
    iget p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEp:I

    iput p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEq:I

    return-void
.end method

.method private a(Landroid/graphics/Canvas;Landroid/graphics/Rect;Landroid/graphics/drawable/GradientDrawable;)V
    .locals 3

    .line 3
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 4
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 5
    iget v1, p2, Landroid/graphics/Rect;->top:I

    int-to-float v1, v1

    iget v2, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEP:F

    mul-float v1, v1, v2

    float-to-int v1, v1

    iput v1, v0, Landroid/graphics/Rect;->top:I

    .line 6
    iget v1, p2, Landroid/graphics/Rect;->bottom:I

    int-to-float v1, v1

    mul-float v1, v1, v2

    float-to-int v1, v1

    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 7
    iget v1, p2, Landroid/graphics/Rect;->left:I

    iput v1, v0, Landroid/graphics/Rect;->left:I

    .line 8
    iget p2, p2, Landroid/graphics/Rect;->right:I

    iput p2, v0, Landroid/graphics/Rect;->right:I

    .line 9
    invoke-virtual {p3, v0}, Landroid/graphics/drawable/GradientDrawable;->setBounds(Landroid/graphics/Rect;)V

    .line 10
    iget p2, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEk:I

    int-to-float p2, p2

    iget v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEP:F

    mul-float p2, p2, v0

    invoke-virtual {p3, p2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 11
    invoke-virtual {p3, p1}, Landroid/graphics/drawable/GradientDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 12
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method static synthetic a(Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;F)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->i(F)V

    return-void
.end method

.method static synthetic b(Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEN:F

    return p1
.end method

.method static synthetic b(Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;I)I
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->dw(I)I

    move-result p0

    return p0
.end method

.method private bp(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEI:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    const/4 p1, 0x1

    .line 2
    invoke-direct {p0, p1}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->bq(Z)V

    .line 3
    invoke-direct {p0, p1}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->br(Z)V

    return-void

    :cond_1
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->bq(Z)V

    .line 5
    invoke-direct {p0, p1}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->br(Z)V

    return-void
.end method

.method private bq(Z)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEN:F

    if-eqz p1, :cond_0

    .line 2
    iget p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEO:F

    goto :goto_0

    :cond_0
    const/high16 p1, 0x3f800000    # 1.0f

    .line 3
    :goto_0
    iget-object v1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEK:Landroid/animation/ValueAnimator;

    if-nez v1, :cond_1

    .line 4
    new-instance v1, Landroid/animation/ValueAnimator;

    invoke-direct {v1}, Landroid/animation/ValueAnimator;-><init>()V

    iput-object v1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEK:Landroid/animation/ValueAnimator;

    const-wide/16 v2, 0xfa

    .line 5
    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 6
    iget-object v1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEK:Landroid/animation/ValueAnimator;

    new-instance v2, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v2}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 7
    iget-object v1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEK:Landroid/animation/ValueAnimator;

    new-instance v2, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar$3;

    invoke-direct {v2, p0}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar$3;-><init>(Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;)V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    goto :goto_1

    .line 8
    :cond_1
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 9
    :goto_1
    iget-object v1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEK:Landroid/animation/ValueAnimator;

    const/4 v2, 0x2

    new-array v2, v2, [F

    const/4 v3, 0x0

    aput v0, v2, v3

    const/4 v0, 0x1

    aput p1, v2, v0

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 10
    iget-object p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEK:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method private br(Z)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEP:F

    if-eqz p1, :cond_0

    .line 2
    iget p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEQ:F

    goto :goto_0

    :cond_0
    const/high16 p1, 0x3f800000    # 1.0f

    .line 3
    :goto_0
    iget-object v1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEL:Landroid/animation/ValueAnimator;

    if-nez v1, :cond_1

    .line 4
    new-instance v1, Landroid/animation/ValueAnimator;

    invoke-direct {v1}, Landroid/animation/ValueAnimator;-><init>()V

    iput-object v1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEL:Landroid/animation/ValueAnimator;

    const-wide/16 v2, 0xfa

    .line 5
    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 6
    iget-object v1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEL:Landroid/animation/ValueAnimator;

    new-instance v2, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v2}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 7
    iget-object v1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEL:Landroid/animation/ValueAnimator;

    new-instance v2, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar$4;

    invoke-direct {v2, p0}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar$4;-><init>(Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;)V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    goto :goto_1

    .line 8
    :cond_1
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 9
    :goto_1
    iget-object v1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEL:Landroid/animation/ValueAnimator;

    const/4 v2, 0x2

    new-array v2, v2, [F

    const/4 v3, 0x0

    aput v0, v2, v3

    const/4 v0, 0x1

    aput p1, v2, v0

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 10
    iget-object p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEL:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method private bz(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEI:Z

    const/high16 v0, 0x41200000    # 10.0f

    .line 2
    invoke-static {p1, v0}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aER:I

    const/high16 v0, 0x40400000    # 3.0f

    .line 3
    invoke-static {p1, v0}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEh:I

    const/high16 v0, 0x41a00000    # 20.0f

    .line 4
    invoke-static {p1, v0}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEo:I

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEB:Landroid/graphics/drawable/Drawable;

    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEJ:Z

    const/high16 v1, 0x3f000000    # 0.5f

    .line 7
    invoke-static {p1, v1}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result v1

    iput v1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEl:I

    const/high16 v1, 0x3f800000    # 1.0f

    .line 8
    invoke-static {p1, v1}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result p1

    iput p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEk:I

    const p1, 0x26ffffff

    .line 9
    iput p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEe:I

    const/4 p1, -0x1

    .line 10
    iput p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEf:I

    const p1, 0x40ffffff    # 7.9999995f

    .line 11
    iput p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEg:I

    .line 12
    iput v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEi:I

    const/16 p1, 0x64

    .line 13
    iput p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEj:I

    .line 14
    iput-boolean v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEm:Z

    return-void
.end method

.method static synthetic c(Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEP:F

    return p1
.end method

.method private c(Landroid/graphics/Canvas;)V
    .locals 4

    .line 2
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 3
    iget-object v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEB:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 4
    iget-object v1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEA:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 5
    iget-object v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEB:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEd:Landroid/graphics/Paint;

    iget v1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEf:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 7
    iget-object v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEA:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEA:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->centerY()I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEA:Landroid/graphics/Rect;

    .line 8
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-float v2, v2

    iget v3, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEN:F

    mul-float v2, v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    iget-object v3, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEd:Landroid/graphics/Paint;

    .line 9
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 10
    :goto_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method private d(FF)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEA:Landroid/graphics/Rect;

    iget v1, v0, Landroid/graphics/Rect;->left:I

    iget v2, v0, Landroid/graphics/Rect;->right:I

    if-ge v1, v2, :cond_0

    iget v3, v0, Landroid/graphics/Rect;->top:I

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    if-ge v3, v0, :cond_0

    int-to-float v1, v1

    iget v4, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEN:F

    mul-float v1, v1, v4

    iget v5, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEo:I

    int-to-float v6, v5

    sub-float/2addr v1, v6

    cmpl-float v1, p1, v1

    if-ltz v1, :cond_0

    int-to-float v1, v2

    mul-float v1, v1, v4

    int-to-float v2, v5

    add-float/2addr v1, v2

    cmpg-float p1, p1, v1

    if-gtz p1, :cond_0

    int-to-float p1, v3

    mul-float p1, p1, v4

    int-to-float v1, v5

    sub-float/2addr p1, v1

    cmpl-float p1, p2, p1

    if-ltz p1, :cond_0

    int-to-float p1, v0

    mul-float p1, p1, v4

    int-to-float v0, v5

    add-float/2addr p1, v0

    cmpg-float p1, p2, p1

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private dv(I)F
    .locals 3

    .line 1
    iget v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEn:I

    int-to-float v1, v0

    iget v2, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEi:I

    sub-int/2addr p1, v2

    int-to-float p1, p1

    mul-float v1, v1, p1

    iget p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEj:I

    sub-int/2addr p1, v2

    int-to-float p1, p1

    div-float/2addr v1, p1

    int-to-float p1, v0

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p1, v0

    sub-float/2addr v1, p1

    return v1
.end method

.method private dw(I)I
    .locals 3

    .line 1
    iget v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEn:I

    div-int/lit8 v1, v0, 0x2

    if-le p1, v1, :cond_0

    .line 2
    iget p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEj:I

    return p1

    :cond_0
    neg-int v1, v0

    .line 3
    div-int/lit8 v1, v1, 0x2

    if-ge p1, v1, :cond_1

    .line 4
    iget p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEi:I

    return p1

    :cond_1
    int-to-float p1, p1

    int-to-float v1, v0

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float/2addr p1, v1

    .line 5
    iget v1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEj:I

    iget v2, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEi:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    mul-float p1, p1, v1

    int-to-float v0, v0

    div-float/2addr p1, v0

    .line 6
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    iget v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEi:I

    add-int/2addr p1, v0

    return p1
.end method

.method private e(FF)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEx:Landroid/graphics/Rect;

    iget v1, v0, Landroid/graphics/Rect;->left:I

    iget v2, v0, Landroid/graphics/Rect;->right:I

    if-ge v1, v2, :cond_0

    iget v3, v0, Landroid/graphics/Rect;->top:I

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    if-ge v3, v0, :cond_0

    int-to-float v1, v1

    iget v4, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEP:F

    mul-float v1, v1, v4

    iget v5, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEo:I

    int-to-float v6, v5

    sub-float/2addr v1, v6

    cmpl-float v1, p1, v1

    if-ltz v1, :cond_0

    int-to-float v1, v2

    mul-float v1, v1, v4

    int-to-float v2, v5

    add-float/2addr v1, v2

    cmpg-float p1, p1, v1

    if-gtz p1, :cond_0

    int-to-float p1, v3

    mul-float p1, p1, v4

    int-to-float v1, v5

    sub-float/2addr p1, v1

    cmpl-float p1, p2, p1

    if-ltz p1, :cond_0

    int-to-float p1, v0

    mul-float p1, p1, v4

    int-to-float v0, v5

    add-float/2addr p1, v0

    cmpg-float p1, p2, p1

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private getOnSeekBarChangedListener()Lcom/kwad/sdk/core/view/ScaleAnimSeekBar$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEH:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar$a;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private i(F)V
    .locals 3

    .line 14
    iget-object v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEA:Landroid/graphics/Rect;

    iget v1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEh:I

    int-to-float v2, v1

    sub-float v2, p1, v2

    float-to-int v2, v2

    iput v2, v0, Landroid/graphics/Rect;->left:I

    int-to-float v1, v1

    add-float/2addr v1, p1

    float-to-int v1, v1

    .line 15
    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 16
    iget-object v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEy:Landroid/graphics/Rect;

    float-to-int p1, p1

    iput p1, v0, Landroid/graphics/Rect;->right:I

    .line 17
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method private i(ZI)V
    .locals 3

    if-eqz p1, :cond_1

    .line 1
    iget p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEp:I

    invoke-direct {p0, p1}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->dv(I)F

    move-result p1

    invoke-direct {p0, p1}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->j(F)F

    move-result p1

    .line 2
    invoke-direct {p0, p2}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->dv(I)F

    move-result p2

    invoke-direct {p0, p2}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->j(F)F

    move-result p2

    .line 3
    iget-object v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEM:Landroid/animation/ValueAnimator;

    if-nez v0, :cond_0

    .line 4
    new-instance v0, Landroid/animation/ValueAnimator;

    invoke-direct {v0}, Landroid/animation/ValueAnimator;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEM:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0x12c

    .line 5
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 6
    iget-object v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEM:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar$1;

    invoke-direct {v1, p0}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar$1;-><init>(Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 7
    iget-object v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEM:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar$2;

    invoke-direct {v1, p0}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar$2;-><init>(Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 9
    :goto_0
    iget-object v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEM:Landroid/animation/ValueAnimator;

    const/4 v1, 0x2

    new-array v1, v1, [F

    const/4 v2, 0x0

    aput p1, v1, v2

    const/4 p1, 0x1

    aput p2, v1, p1

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 10
    iget-object p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEM:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    return-void

    .line 11
    :cond_1
    iput p2, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEp:I

    .line 12
    invoke-direct {p0, p2}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->dv(I)F

    move-result p1

    invoke-direct {p0, p1}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->j(F)F

    move-result p1

    .line 13
    invoke-direct {p0, p1}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->i(F)V

    return-void
.end method

.method private init(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    if-eqz p2, :cond_0

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->bz(Landroid/content/Context;)V

    .line 2
    :cond_0
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEd:Landroid/graphics/Paint;

    .line 3
    sget-object p2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 4
    iget-object p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEd:Landroid/graphics/Paint;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 5
    new-instance p1, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {p1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iput-object p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEu:Landroid/graphics/drawable/GradientDrawable;

    const/4 p2, 0x0

    .line 6
    invoke-virtual {p1, p2}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 7
    iget-object p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEu:Landroid/graphics/drawable/GradientDrawable;

    iget v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEe:I

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 8
    new-instance p1, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {p1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iput-object p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEv:Landroid/graphics/drawable/GradientDrawable;

    .line 9
    invoke-virtual {p1, p2}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 10
    iget-object p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEv:Landroid/graphics/drawable/GradientDrawable;

    iget v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEf:I

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 11
    new-instance p1, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {p1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iput-object p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEw:Landroid/graphics/drawable/GradientDrawable;

    .line 12
    invoke-virtual {p1, p2}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 13
    iget-object p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEw:Landroid/graphics/drawable/GradientDrawable;

    iget p2, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEg:I

    invoke-virtual {p1, p2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 14
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEx:Landroid/graphics/Rect;

    .line 15
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEy:Landroid/graphics/Rect;

    .line 16
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEA:Landroid/graphics/Rect;

    .line 17
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEz:Landroid/graphics/Rect;

    .line 18
    iget p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEi:I

    iput p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEp:I

    return-void
.end method

.method private j(F)F
    .locals 2

    .line 1
    iget v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEn:I

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    cmpl-float v1, p1, v0

    if-lez v1, :cond_0

    return v0

    :cond_0
    neg-float v0, v0

    cmpg-float v1, p1, v0

    if-gez v1, :cond_1

    return v0

    :cond_1
    return p1
.end method

.method private x(II)V
    .locals 4

    if-lez p1, :cond_6

    if-gtz p2, :cond_0

    goto/16 :goto_5

    .line 1
    :cond_0
    iget-boolean p2, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEI:Z

    if-eqz p2, :cond_1

    int-to-float p2, p1

    .line 2
    iget v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aER:I

    mul-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    iget v1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEO:F

    iget v2, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEN:F

    sub-float/2addr v1, v2

    mul-float v0, v0, v1

    sub-float/2addr p2, v0

    float-to-int p2, p2

    iput p2, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEn:I

    goto :goto_0

    .line 3
    :cond_1
    iget p2, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aER:I

    mul-int/lit8 p2, p2, 0x2

    sub-int p2, p1, p2

    iput p2, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEn:I

    .line 4
    :goto_0
    iget-object p2, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEx:Landroid/graphics/Rect;

    iget v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEl:I

    neg-int v1, v0

    iput v1, p2, Landroid/graphics/Rect;->top:I

    neg-int v1, v1

    .line 5
    iput v1, p2, Landroid/graphics/Rect;->bottom:I

    .line 6
    iget-boolean v1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEm:Z

    if-eqz v1, :cond_2

    neg-int v2, p1

    goto :goto_1

    :cond_2
    iget v2, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEn:I

    neg-int v2, v2

    :goto_1
    div-int/lit8 v2, v2, 0x2

    iput v2, p2, Landroid/graphics/Rect;->left:I

    if-eqz v1, :cond_3

    .line 7
    div-int/lit8 v2, p1, 0x2

    goto :goto_2

    :cond_3
    iget v2, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEn:I

    div-int/lit8 v2, v2, 0x2

    :goto_2
    iput v2, p2, Landroid/graphics/Rect;->right:I

    .line 8
    iget-object p2, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEy:Landroid/graphics/Rect;

    neg-int v2, v0

    iput v2, p2, Landroid/graphics/Rect;->top:I

    neg-int v2, v2

    .line 9
    iput v2, p2, Landroid/graphics/Rect;->bottom:I

    if-eqz v1, :cond_4

    neg-int v2, p1

    goto :goto_3

    .line 10
    :cond_4
    iget v2, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEn:I

    neg-int v2, v2

    :goto_3
    div-int/lit8 v2, v2, 0x2

    iput v2, p2, Landroid/graphics/Rect;->left:I

    .line 11
    iget v2, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEn:I

    neg-int v3, v2

    div-int/lit8 v3, v3, 0x2

    iput v3, p2, Landroid/graphics/Rect;->right:I

    .line 12
    iget-object v3, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEz:Landroid/graphics/Rect;

    neg-int v0, v0

    iput v0, v3, Landroid/graphics/Rect;->top:I

    .line 13
    iget p2, p2, Landroid/graphics/Rect;->top:I

    neg-int p2, p2

    iput p2, v3, Landroid/graphics/Rect;->bottom:I

    if-eqz v1, :cond_5

    neg-int p1, p1

    goto :goto_4

    :cond_5
    neg-int p1, v2

    .line 14
    :goto_4
    div-int/lit8 p1, p1, 0x2

    iput p1, v3, Landroid/graphics/Rect;->left:I

    neg-int p1, v2

    .line 15
    div-int/lit8 p1, p1, 0x2

    iput p1, v3, Landroid/graphics/Rect;->right:I

    .line 16
    iget-object p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEA:Landroid/graphics/Rect;

    iget p2, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEh:I

    neg-int v0, p2

    iput v0, p1, Landroid/graphics/Rect;->top:I

    .line 17
    iput p2, p1, Landroid/graphics/Rect;->bottom:I

    neg-int v0, v2

    .line 18
    div-int/lit8 v0, v0, 0x2

    sub-int/2addr v0, p2

    iput v0, p1, Landroid/graphics/Rect;->left:I

    neg-int v0, v2

    .line 19
    div-int/lit8 v0, v0, 0x2

    add-int/2addr v0, p2

    iput v0, p1, Landroid/graphics/Rect;->right:I

    .line 20
    iget-object p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEB:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, p1}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->setThumbDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 21
    iget p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEp:I

    invoke-virtual {p0, p1}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->setProgress(I)V

    .line 22
    iget p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEr:I

    invoke-virtual {p0, p1}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->setSecondaryProgress(I)V

    :cond_6
    :goto_5
    return-void
.end method


# virtual methods
.method public final bo(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aES:Z

    .line 2
    invoke-direct {p0, p1}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->bp(Z)V

    return-void
.end method

.method public getMaxProgress()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEj:I

    return v0
.end method

.method public getProgress()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEp:I

    return v0
.end method

.method public getProgressLength()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEn:I

    return v0
.end method

.method public getProgressX()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getX()F

    move-result v0

    iget v1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEh:I

    int-to-float v1, v1

    iget v2, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEO:F

    mul-float v1, v1, v2

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public getSecondaryProgress()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEr:I

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 3
    iget v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEt:I

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    iget v1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEs:I

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 4
    iget-object v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEx:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEu:Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {p0, p1, v0, v1}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->a(Landroid/graphics/Canvas;Landroid/graphics/Rect;Landroid/graphics/drawable/GradientDrawable;)V

    .line 5
    iget-object v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEz:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEw:Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {p0, p1, v0, v1}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->a(Landroid/graphics/Canvas;Landroid/graphics/Rect;Landroid/graphics/drawable/GradientDrawable;)V

    .line 6
    iget-object v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEy:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEv:Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {p0, p1, v0, v1}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->a(Landroid/graphics/Canvas;Landroid/graphics/Rect;Landroid/graphics/drawable/GradientDrawable;)V

    .line 7
    iget-boolean v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aES:Z

    if-eqz v0, :cond_0

    .line 8
    invoke-direct {p0, p1}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->c(Landroid/graphics/Canvas;)V

    .line 9
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 2
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    .line 3
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    .line 4
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    const/high16 v2, 0x40000000    # 2.0f

    if-ne v0, v2, :cond_0

    .line 5
    iput p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEt:I

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    iput p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEt:I

    :goto_0
    if-ne v1, v2, :cond_1

    .line 7
    iput p2, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEs:I

    goto :goto_1

    .line 8
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p1

    iput p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEs:I

    .line 9
    :goto_1
    iget p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEt:I

    iget p2, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEs:I

    invoke-direct {p0, p1, p2}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->x(II)V

    .line 10
    iget p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEt:I

    iget p2, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEs:I

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 7

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget v1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEt:I

    const/4 v2, 0x2

    div-int/2addr v1, v2

    int-to-float v1, v1

    sub-float/2addr v0, v1

    .line 2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iget v3, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEs:I

    div-int/2addr v3, v2

    int-to-float v3, v3

    sub-float/2addr v1, v3

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    .line 4
    invoke-direct {p0}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->getOnSeekBarChangedListener()Lcom/kwad/sdk/core/view/ScaleAnimSeekBar$a;

    move-result-object v4

    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v5

    const/4 v6, 0x1

    if-eqz v5, :cond_5

    const/4 p1, 0x0

    if-eq v5, v6, :cond_2

    if-eq v5, v2, :cond_0

    goto/16 :goto_0

    .line 6
    :cond_0
    iget-boolean v1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEC:Z

    if-nez v1, :cond_1

    iget-boolean v1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aED:Z

    if-eqz v1, :cond_a

    :cond_1
    float-to-int v0, v0

    .line 7
    invoke-direct {p0, v0}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->dw(I)I

    move-result v0

    invoke-direct {p0, v0, p1, v6}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->a(IZZ)V

    goto :goto_0

    .line 8
    :cond_2
    iput-boolean p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEG:Z

    .line 9
    iget-boolean v1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aED:Z

    if-nez v1, :cond_3

    iget-boolean v1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEC:Z

    if-eqz v1, :cond_4

    .line 10
    :cond_3
    iput-boolean p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aED:Z

    .line 11
    iput-boolean p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEC:Z

    float-to-int v0, v0

    .line 12
    invoke-direct {p0, v0}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->dw(I)I

    move-result v0

    iget-boolean v1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEJ:Z

    invoke-direct {p0, v0, v1, v6}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->a(IZZ)V

    if-eqz v4, :cond_4

    .line 13
    invoke-interface {v4, p0}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar$a;->a(Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;)V

    :cond_4
    if-eqz v3, :cond_a

    .line 14
    invoke-interface {v3, p1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    goto :goto_0

    .line 15
    :cond_5
    iget-boolean v2, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEF:Z

    if-nez v2, :cond_6

    .line 16
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    .line 17
    :cond_6
    invoke-direct {p0, v0, v1}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->d(FF)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 18
    invoke-direct {p0, v6}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->bp(Z)V

    .line 19
    iput-boolean v6, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEC:Z

    .line 20
    iput-boolean v6, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEG:Z

    if-eqz v4, :cond_7

    .line 21
    invoke-interface {v4}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar$a;->tV()V

    :cond_7
    if-eqz v3, :cond_a

    .line 22
    invoke-interface {v3, v6}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    goto :goto_0

    .line 23
    :cond_8
    invoke-direct {p0, v0, v1}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->e(FF)Z

    move-result p1

    if-eqz p1, :cond_a

    .line 24
    invoke-direct {p0, v6}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->bp(Z)V

    .line 25
    iput-boolean v6, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aED:Z

    if-eqz v4, :cond_9

    .line 26
    invoke-interface {v4}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar$a;->tV()V

    :cond_9
    if-eqz v3, :cond_a

    .line 27
    invoke-interface {v3, v6}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_a
    :goto_0
    return v6
.end method

.method public setMaxProgress(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEj:I

    return-void
.end method

.method public setMinProgress(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEi:I

    .line 2
    iget v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEp:I

    if-ge v0, p1, :cond_0

    .line 3
    iput p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEp:I

    :cond_0
    return-void
.end method

.method public setOnSeekBarChangeListener(Lcom/kwad/sdk/core/view/ScaleAnimSeekBar$a;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEH:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public setProgress(I)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0, v0}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->a(IZZ)V

    return-void
.end method

.method public setProgressBackgroundColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEe:I

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEu:Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    return-void
.end method

.method public setProgressColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEf:I

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEv:Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    return-void
.end method

.method public setSecondaryProgress(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEi:I

    if-gt p1, v0, :cond_0

    :goto_0
    move p1, v0

    goto :goto_1

    .line 2
    :cond_0
    iget v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEj:I

    if-lt p1, v0, :cond_1

    goto :goto_0

    .line 3
    :cond_1
    :goto_1
    iput p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEr:I

    .line 4
    invoke-direct {p0, p1}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->dv(I)F

    move-result p1

    invoke-direct {p0, p1}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->j(F)F

    move-result p1

    .line 5
    iget-object v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEz:Landroid/graphics/Rect;

    float-to-int p1, p1

    iput p1, v0, Landroid/graphics/Rect;->right:I

    .line 6
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setSecondaryProgressColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEg:I

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEw:Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    return-void
.end method

.method public setThumbDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    iput-object p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEB:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public setThumbEnable(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEF:Z

    return-void
.end method

.method public setThumbScale(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEN:F

    return-void
.end method

.method public setThumbTouchOffset(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->aEo:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method
