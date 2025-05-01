.class public Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;
.super Landroid/widget/ImageView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView$a;
    }
.end annotation


# instance fields
.field private Ho:Landroid/graphics/Path;

.field private Hp:Landroid/graphics/Paint;

.field private Hq:F

.field private Hr:F

.field private Hs:F

.field private Ht:F

.field private Hu:I

.field private Hv:Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView$a;

.field private Hw:Landroid/view/GestureDetector;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    const-string p1, "#66ffffff"

    .line 2
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;->Hu:I

    .line 3
    invoke-direct {p0}, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 4
    invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const-string p1, "#66ffffff"

    .line 5
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;->Hu:I

    .line 6
    invoke-direct {p0}, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;->init()V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;)Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;->Hv:Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView$a;

    return-object p0
.end method

.method private b(Landroid/view/MotionEvent;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;->Hw:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    if-eqz v0, :cond_4

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 3
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    invoke-direct {p0, v0, p1}, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;->c(FF)V

    .line 4
    invoke-virtual {p0}, Landroid/widget/ImageView;->invalidate()V

    return-void

    .line 5
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;->Ho:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 6
    invoke-virtual {p0}, Landroid/widget/ImageView;->invalidate()V

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;->Hv:Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView$a;

    if-eqz v0, :cond_3

    .line 8
    iget v1, p0, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;->Hq:F

    iget v2, p0, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;->Hr:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    invoke-interface {v0, v1, v2, v3, p1}, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView$a;->a(FFFF)V

    :cond_3
    :goto_0
    return-void

    .line 9
    :cond_4
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;->Ho:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 10
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;->Hq:F

    .line 11
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iput p1, p0, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;->Hr:F

    .line 12
    iget v0, p0, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;->Hq:F

    iput v0, p0, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;->Hs:F

    .line 13
    iput p1, p0, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;->Ht:F

    .line 14
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;->Ho:Landroid/graphics/Path;

    invoke-virtual {v1, v0, p1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 15
    invoke-virtual {p0}, Landroid/widget/ImageView;->invalidate()V

    return-void
.end method

.method private c(FF)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;->Hs:F

    sub-float v0, p1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    .line 2
    iget v1, p0, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;->Ht:F

    sub-float v1, p2, v1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    const/high16 v2, 0x40400000    # 3.0f

    cmpl-float v0, v0, v2

    if-gez v0, :cond_0

    cmpl-float v0, v1, v2

    if-ltz v0, :cond_1

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;->Ho:Landroid/graphics/Path;

    iget v1, p0, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;->Hs:F

    iget v2, p0, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;->Ht:F

    add-float v3, p1, v1

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    add-float v5, p2, v2

    div-float/2addr v5, v4

    invoke-virtual {v0, v1, v2, v3, v5}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 4
    iput p1, p0, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;->Hs:F

    .line 5
    iput p2, p0, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;->Ht:F

    :cond_1
    return-void
.end method

.method private init()V
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;->Ho:Landroid/graphics/Path;

    .line 2
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;->Hp:Landroid/graphics/Paint;

    .line 3
    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;->Hp:Landroid/graphics/Paint;

    invoke-virtual {p0}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x41700000    # 15.0f

    invoke-static {v1, v2}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;->Hp:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;->Hp:Landroid/graphics/Paint;

    iget v1, p0, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;->Hu:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;->Hp:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 8
    new-instance v0, Landroid/view/GestureDetector;

    new-instance v1, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView$1;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView$1;-><init>(Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;)V

    invoke-direct {v0, v1}, Landroid/view/GestureDetector;-><init>(Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;->Hw:Landroid/view/GestureDetector;

    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;->Ho:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;->Hp:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;->b(Landroid/view/MotionEvent;)V

    const/4 p1, 0x1

    return p1
.end method

.method public setOnSlideTouchListener(Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView;->Hv:Lcom/kwad/components/ad/splashscreen/widget/KsSplashSlidePathView$a;

    return-void
.end method
