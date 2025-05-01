.class public Lcom/beizi/fusion/widget/CircleProgressView;
.super Landroid/view/View;
.source "CircleProgressView.java"


# instance fields
.field private a:Landroid/graphics/Paint;

.field private b:Landroid/graphics/Paint;

.field private c:Landroid/graphics/Paint;

.field private d:Landroid/graphics/Paint;

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:F

.field private j:F

.field private k:F

.field private l:I

.field private m:I

.field private n:F

.field private o:F

.field private p:I

.field private q:I

.field private r:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/beizi/fusion/widget/CircleProgressView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 v0, 0x64

    .line 3
    iput v0, p0, Lcom/beizi/fusion/widget/CircleProgressView;->p:I

    .line 4
    invoke-direct {p0, p1, p2}, Lcom/beizi/fusion/widget/CircleProgressView;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 5
    invoke-direct {p0}, Lcom/beizi/fusion/widget/CircleProgressView;->a()V

    return-void
.end method

.method private a()V
    .locals 4

    .line 14
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/beizi/fusion/widget/CircleProgressView;->a:Landroid/graphics/Paint;

    const/4 v1, 0x1

    .line 15
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 16
    iget-object v0, p0, Lcom/beizi/fusion/widget/CircleProgressView;->a:Landroid/graphics/Paint;

    iget v2, p0, Lcom/beizi/fusion/widget/CircleProgressView;->e:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 17
    iget-object v0, p0, Lcom/beizi/fusion/widget/CircleProgressView;->a:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 18
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/beizi/fusion/widget/CircleProgressView;->c:Landroid/graphics/Paint;

    .line 19
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 20
    iget-object v0, p0, Lcom/beizi/fusion/widget/CircleProgressView;->c:Landroid/graphics/Paint;

    iget v2, p0, Lcom/beizi/fusion/widget/CircleProgressView;->h:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 21
    iget-object v0, p0, Lcom/beizi/fusion/widget/CircleProgressView;->c:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 22
    iget-object v0, p0, Lcom/beizi/fusion/widget/CircleProgressView;->c:Landroid/graphics/Paint;

    iget v2, p0, Lcom/beizi/fusion/widget/CircleProgressView;->k:F

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 23
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/beizi/fusion/widget/CircleProgressView;->b:Landroid/graphics/Paint;

    .line 24
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 25
    iget-object v0, p0, Lcom/beizi/fusion/widget/CircleProgressView;->b:Landroid/graphics/Paint;

    iget v2, p0, Lcom/beizi/fusion/widget/CircleProgressView;->f:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 26
    iget-object v0, p0, Lcom/beizi/fusion/widget/CircleProgressView;->b:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 27
    iget-object v0, p0, Lcom/beizi/fusion/widget/CircleProgressView;->b:Landroid/graphics/Paint;

    iget v2, p0, Lcom/beizi/fusion/widget/CircleProgressView;->k:F

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 28
    iget-object v0, p0, Lcom/beizi/fusion/widget/CircleProgressView;->b:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 29
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/beizi/fusion/widget/CircleProgressView;->d:Landroid/graphics/Paint;

    .line 30
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 31
    iget-object v0, p0, Lcom/beizi/fusion/widget/CircleProgressView;->d:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 32
    iget-object v0, p0, Lcom/beizi/fusion/widget/CircleProgressView;->d:Landroid/graphics/Paint;

    iget v1, p0, Lcom/beizi/fusion/widget/CircleProgressView;->g:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 33
    iget-object v0, p0, Lcom/beizi/fusion/widget/CircleProgressView;->d:Landroid/graphics/Paint;

    iget v1, p0, Lcom/beizi/fusion/widget/CircleProgressView;->i:F

    const/high16 v2, 0x40400000    # 3.0f

    mul-float v1, v1, v2

    const/high16 v2, 0x40a00000    # 5.0f

    div-float/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 34
    iget-object v0, p0, Lcom/beizi/fusion/widget/CircleProgressView;->d:Landroid/graphics/Paint;

    const-string v1, "#000000"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v0, v2, v3, v3, v1}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 35
    iget-object v0, p0, Lcom/beizi/fusion/widget/CircleProgressView;->d:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v0

    .line 36
    iget v1, v0, Landroid/graphics/Paint$FontMetrics;->descent:F

    iget v0, v0, Landroid/graphics/Paint$FontMetrics;->ascent:F

    sub-float/2addr v1, v0

    float-to-double v0, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    int-to-float v0, v0

    iput v0, p0, Lcom/beizi/fusion/widget/CircleProgressView;->o:F

    return-void
.end method

.method private a(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    sget-object v0, Lcom/beizi/fusion/R$styleable;->CircleProgressViewStyle:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, v1, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    const/4 v0, 0x1

    const/high16 v2, 0x41900000    # 18.0f

    .line 3
    invoke-static {v0, v2, p2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v2

    const/high16 v3, 0x40800000    # 4.0f

    .line 4
    invoke-static {v0, v3, p2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v3

    const/high16 v4, 0x42480000    # 50.0f

    .line 5
    invoke-static {v0, v4, p2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p2

    iput p2, p0, Lcom/beizi/fusion/widget/CircleProgressView;->r:F

    .line 6
    sget p2, Lcom/beizi/fusion/R$styleable;->CircleProgressViewStyle_adScopeRadius:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    iput p2, p0, Lcom/beizi/fusion/widget/CircleProgressView;->i:F

    .line 7
    sget p2, Lcom/beizi/fusion/R$styleable;->CircleProgressViewStyle_adScopeStrokeWidth:I

    invoke-virtual {p1, p2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    iput p2, p0, Lcom/beizi/fusion/widget/CircleProgressView;->k:F

    .line 8
    sget p2, Lcom/beizi/fusion/R$styleable;->CircleProgressViewStyle_adScopeCircleColor:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/beizi/fusion/widget/CircleProgressView;->e:I

    .line 9
    sget p2, Lcom/beizi/fusion/R$styleable;->CircleProgressViewStyle_adScopeRingColor:I

    const v0, -0xa100

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/beizi/fusion/widget/CircleProgressView;->f:I

    .line 10
    sget p2, Lcom/beizi/fusion/R$styleable;->CircleProgressViewStyle_adScopeTextColor:I

    const/4 v0, -0x1

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/beizi/fusion/widget/CircleProgressView;->g:I

    .line 11
    sget p2, Lcom/beizi/fusion/R$styleable;->CircleProgressViewStyle_adScopeRingBgColor:I

    const v0, 0x5ebcbcbc    # 6.7999758E18f

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/beizi/fusion/widget/CircleProgressView;->h:I

    .line 12
    iget p2, p0, Lcom/beizi/fusion/widget/CircleProgressView;->i:F

    iget v0, p0, Lcom/beizi/fusion/widget/CircleProgressView;->k:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    add-float/2addr p2, v0

    iput p2, p0, Lcom/beizi/fusion/widget/CircleProgressView;->j:F

    .line 13
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 11

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    const/4 v1, 0x2

    div-int/2addr v0, v1

    iput v0, p0, Lcom/beizi/fusion/widget/CircleProgressView;->l:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    div-int/2addr v0, v1

    iput v0, p0, Lcom/beizi/fusion/widget/CircleProgressView;->m:I

    .line 3
    iget v2, p0, Lcom/beizi/fusion/widget/CircleProgressView;->l:I

    int-to-float v2, v2

    int-to-float v0, v0

    iget v3, p0, Lcom/beizi/fusion/widget/CircleProgressView;->i:F

    iget-object v4, p0, Lcom/beizi/fusion/widget/CircleProgressView;->a:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v0, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 4
    new-instance v6, Landroid/graphics/RectF;

    invoke-direct {v6}, Landroid/graphics/RectF;-><init>()V

    .line 5
    iget v0, p0, Lcom/beizi/fusion/widget/CircleProgressView;->l:I

    int-to-float v2, v0

    iget v3, p0, Lcom/beizi/fusion/widget/CircleProgressView;->j:F

    sub-float/2addr v2, v3

    iput v2, v6, Landroid/graphics/RectF;->left:F

    .line 6
    iget v2, p0, Lcom/beizi/fusion/widget/CircleProgressView;->m:I

    int-to-float v4, v2

    sub-float/2addr v4, v3

    iput v4, v6, Landroid/graphics/RectF;->top:F

    const/high16 v4, 0x40000000    # 2.0f

    mul-float v5, v3, v4

    int-to-float v0, v0

    sub-float/2addr v0, v3

    add-float/2addr v5, v0

    .line 7
    iput v5, v6, Landroid/graphics/RectF;->right:F

    mul-float v0, v3, v4

    int-to-float v2, v2

    sub-float/2addr v2, v3

    add-float/2addr v0, v2

    .line 8
    iput v0, v6, Landroid/graphics/RectF;->bottom:F

    .line 9
    iget-object v10, p0, Lcom/beizi/fusion/widget/CircleProgressView;->c:Landroid/graphics/Paint;

    const/4 v7, 0x0

    const/high16 v8, 0x43b40000    # 360.0f

    const/4 v9, 0x0

    move-object v5, p1

    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 10
    iget v0, p0, Lcom/beizi/fusion/widget/CircleProgressView;->q:I

    if-lez v0, :cond_0

    .line 11
    new-instance v6, Landroid/graphics/RectF;

    invoke-direct {v6}, Landroid/graphics/RectF;-><init>()V

    .line 12
    iget v0, p0, Lcom/beizi/fusion/widget/CircleProgressView;->l:I

    int-to-float v2, v0

    iget v3, p0, Lcom/beizi/fusion/widget/CircleProgressView;->j:F

    sub-float/2addr v2, v3

    iput v2, v6, Landroid/graphics/RectF;->left:F

    .line 13
    iget v2, p0, Lcom/beizi/fusion/widget/CircleProgressView;->m:I

    int-to-float v5, v2

    sub-float/2addr v5, v3

    iput v5, v6, Landroid/graphics/RectF;->top:F

    mul-float v5, v3, v4

    int-to-float v0, v0

    sub-float/2addr v0, v3

    add-float/2addr v5, v0

    .line 14
    iput v5, v6, Landroid/graphics/RectF;->right:F

    mul-float v0, v3, v4

    int-to-float v2, v2

    sub-float/2addr v2, v3

    add-float/2addr v0, v2

    .line 15
    iput v0, v6, Landroid/graphics/RectF;->bottom:F

    const/high16 v7, -0x3d4c0000    # -90.0f

    .line 16
    iget v0, p0, Lcom/beizi/fusion/widget/CircleProgressView;->q:I

    int-to-float v0, v0

    iget v2, p0, Lcom/beizi/fusion/widget/CircleProgressView;->p:I

    int-to-float v2, v2

    div-float/2addr v0, v2

    const/high16 v2, 0x43b40000    # 360.0f

    mul-float v8, v0, v2

    const/4 v9, 0x0

    iget-object v10, p0, Lcom/beizi/fusion/widget/CircleProgressView;->b:Landroid/graphics/Paint;

    move-object v5, p1

    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    const-string v0, "\u8df3\u8fc7"

    .line 17
    iget-object v2, p0, Lcom/beizi/fusion/widget/CircleProgressView;->d:Landroid/graphics/Paint;

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v3, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v1

    iput v1, p0, Lcom/beizi/fusion/widget/CircleProgressView;->n:F

    .line 18
    iget v2, p0, Lcom/beizi/fusion/widget/CircleProgressView;->l:I

    int-to-float v2, v2

    div-float/2addr v1, v4

    sub-float/2addr v2, v1

    iget v1, p0, Lcom/beizi/fusion/widget/CircleProgressView;->m:I

    int-to-float v1, v1

    iget v3, p0, Lcom/beizi/fusion/widget/CircleProgressView;->o:F

    const/high16 v4, 0x40800000    # 4.0f

    div-float/2addr v3, v4

    add-float/2addr v1, v3

    iget-object v3, p0, Lcom/beizi/fusion/widget/CircleProgressView;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_0
    return-void
.end method

.method protected onMeasure(II)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 2
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 3
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    .line 4
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    .line 5
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    const/high16 v2, 0x40000000    # 2.0f

    if-ne v0, v2, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    iget p1, p0, Lcom/beizi/fusion/widget/CircleProgressView;->r:F

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    int-to-float v0, v0

    add-float/2addr v0, p1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p1

    int-to-float p1, p1

    add-float/2addr v0, p1

    float-to-int p1, v0

    :goto_0
    if-ne v1, v2, :cond_1

    goto :goto_1

    .line 8
    :cond_1
    iget p2, p0, Lcom/beizi/fusion/widget/CircleProgressView;->r:F

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    int-to-float v0, v0

    add-float/2addr v0, p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p2

    int-to-float p2, p2

    add-float/2addr v0, p2

    float-to-int p2, v0

    .line 10
    :goto_1
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public setProgress(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/widget/CircleProgressView;->q:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    return-void
.end method
