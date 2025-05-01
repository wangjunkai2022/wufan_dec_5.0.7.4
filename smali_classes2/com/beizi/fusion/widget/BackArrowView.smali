.class public Lcom/beizi/fusion/widget/BackArrowView;
.super Landroid/view/View;
.source "BackArrowView.java"


# instance fields
.field private a:I

.field private b:I

.field private c:F

.field private d:F

.field private e:I

.field private f:F

.field private g:I

.field private h:Landroid/graphics/Paint;

.field private i:Landroid/graphics/Path;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/beizi/fusion/widget/BackArrowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/beizi/fusion/widget/BackArrowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    invoke-direct {p0, p1, p2, p3}, Lcom/beizi/fusion/widget/BackArrowView;->a(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private a(I)I
    .locals 3

    .line 8
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 9
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    const/16 v1, 0x96

    const/high16 v2, 0x40000000    # 2.0f

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/high16 v2, -0x80000000

    if-ne v0, v2, :cond_1

    .line 10
    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    goto :goto_0

    :cond_1
    const/16 p1, 0x96

    :goto_0
    return p1
.end method

.method private a(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/beizi/fusion/widget/BackArrowView;->b(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 2
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/beizi/fusion/widget/BackArrowView;->h:Landroid/graphics/Paint;

    .line 3
    iget p2, p0, Lcom/beizi/fusion/widget/BackArrowView;->e:I

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 4
    iget-object p1, p0, Lcom/beizi/fusion/widget/BackArrowView;->h:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 5
    iget-object p1, p0, Lcom/beizi/fusion/widget/BackArrowView;->h:Landroid/graphics/Paint;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 6
    iget-object p1, p0, Lcom/beizi/fusion/widget/BackArrowView;->h:Landroid/graphics/Paint;

    iget p2, p0, Lcom/beizi/fusion/widget/BackArrowView;->f:F

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 7
    iget-object p1, p0, Lcom/beizi/fusion/widget/BackArrowView;->h:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    return-void
.end method

.method private b(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    sget-object v0, Lcom/beizi/fusion/R$styleable;->BeiZi_BackArrowView:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 2
    sget p3, Lcom/beizi/fusion/R$styleable;->BeiZi_BackArrowView_beizi_bav_color:I

    const/16 v0, 0xff

    invoke-static {v0, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    iput p3, p0, Lcom/beizi/fusion/widget/BackArrowView;->e:I

    .line 3
    sget p3, Lcom/beizi/fusion/R$styleable;->BeiZi_BackArrowView_beizi_bav_stroke_width:I

    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {p1, v0}, Lcom/beizi/fusion/widget/BackArrowView;->dip2px(Landroid/content/Context;F)I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p2, p3, p1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p1

    iput p1, p0, Lcom/beizi/fusion/widget/BackArrowView;->f:F

    .line 4
    sget p1, Lcom/beizi/fusion/R$styleable;->BeiZi_BackArrowView_beizi_bav_arrow_style:I

    const/4 p3, 0x1

    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    iput p1, p0, Lcom/beizi/fusion/widget/BackArrowView;->g:I

    .line 5
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public static dip2px(Landroid/content/Context;F)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    mul-float p1, p1, p0

    const/high16 p0, 0x3f000000    # 0.5f

    add-float/2addr p1, p0

    float-to-int p0, p1

    return p0
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    iget v0, p0, Lcom/beizi/fusion/widget/BackArrowView;->a:I

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget v1, p0, Lcom/beizi/fusion/widget/BackArrowView;->c:F

    sub-float/2addr v0, v1

    iget v1, p0, Lcom/beizi/fusion/widget/BackArrowView;->b:I

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    const/high16 v0, 0x42340000    # 45.0f

    .line 3
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->rotate(F)V

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/widget/BackArrowView;->i:Landroid/graphics/Path;

    if-nez v0, :cond_0

    .line 5
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/beizi/fusion/widget/BackArrowView;->i:Landroid/graphics/Path;

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/widget/BackArrowView;->i:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/widget/BackArrowView;->i:Landroid/graphics/Path;

    iget v1, p0, Lcom/beizi/fusion/widget/BackArrowView;->d:F

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 8
    iget-object v0, p0, Lcom/beizi/fusion/widget/BackArrowView;->i:Landroid/graphics/Path;

    invoke-virtual {v0, v2, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 9
    iget-object v0, p0, Lcom/beizi/fusion/widget/BackArrowView;->i:Landroid/graphics/Path;

    iget v1, p0, Lcom/beizi/fusion/widget/BackArrowView;->d:F

    neg-float v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 10
    iget v0, p0, Lcom/beizi/fusion/widget/BackArrowView;->g:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 11
    iget-object v0, p0, Lcom/beizi/fusion/widget/BackArrowView;->i:Landroid/graphics/Path;

    invoke-virtual {v0, v2, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 12
    iget-object v0, p0, Lcom/beizi/fusion/widget/BackArrowView;->i:Landroid/graphics/Path;

    iget v1, p0, Lcom/beizi/fusion/widget/BackArrowView;->d:F

    neg-float v2, v1

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 13
    :cond_1
    iget-object v0, p0, Lcom/beizi/fusion/widget/BackArrowView;->i:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 14
    iget-object v0, p0, Lcom/beizi/fusion/widget/BackArrowView;->i:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/beizi/fusion/widget/BackArrowView;->h:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 2
    invoke-direct {p0, p1}, Lcom/beizi/fusion/widget/BackArrowView;->a(I)I

    move-result p1

    invoke-direct {p0, p2}, Lcom/beizi/fusion/widget/BackArrowView;->a(I)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    iput p1, p0, Lcom/beizi/fusion/widget/BackArrowView;->a:I

    .line 3
    iput p2, p0, Lcom/beizi/fusion/widget/BackArrowView;->b:I

    .line 4
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    int-to-float p1, p1

    const/high16 p2, 0x40000000    # 2.0f

    div-float/2addr p1, p2

    .line 5
    iget p2, p0, Lcom/beizi/fusion/widget/BackArrowView;->g:I

    const/4 p3, 0x1

    if-ne p2, p3, :cond_0

    const/high16 p2, 0x40400000    # 3.0f

    div-float p2, p1, p2

    .line 6
    iput p2, p0, Lcom/beizi/fusion/widget/BackArrowView;->c:F

    goto :goto_0

    :cond_0
    const/4 p3, 0x2

    if-ne p2, p3, :cond_1

    const/high16 p2, 0x40800000    # 4.0f

    div-float p2, p1, p2

    .line 7
    iput p2, p0, Lcom/beizi/fusion/widget/BackArrowView;->c:F

    :cond_1
    :goto_0
    const p2, 0x3f2147ae    # 0.63f

    mul-float p1, p1, p2

    .line 8
    iput p1, p0, Lcom/beizi/fusion/widget/BackArrowView;->d:F

    return-void
.end method

.method public setViewColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/widget/BackArrowView;->h:Landroid/graphics/Paint;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method
