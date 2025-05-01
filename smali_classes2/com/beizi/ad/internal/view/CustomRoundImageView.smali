.class public Lcom/beizi/ad/internal/view/CustomRoundImageView;
.super Landroidx/appcompat/widget/AppCompatImageView;
.source "CustomRoundImageView.java"


# instance fields
.field private final a:Landroid/graphics/RectF;

.field private b:F

.field private c:Ljava/lang/String;

.field private d:I

.field private final e:Landroid/graphics/Paint;

.field private final f:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;)V

    .line 18
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->a:Landroid/graphics/RectF;

    const/4 p1, 0x0

    .line 19
    iput p1, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->b:F

    const/4 p1, 0x0

    .line 20
    iput-object p1, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->c:Ljava/lang/String;

    const/4 p1, 0x0

    .line 21
    iput p1, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->d:I

    .line 22
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->e:Landroid/graphics/Paint;

    .line 23
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->f:Landroid/graphics/Paint;

    .line 24
    invoke-direct {p0}, Lcom/beizi/ad/internal/view/CustomRoundImageView;->a()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 10
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->a:Landroid/graphics/RectF;

    const/4 p1, 0x0

    .line 11
    iput p1, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->b:F

    const/4 p1, 0x0

    .line 12
    iput-object p1, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->c:Ljava/lang/String;

    const/4 p1, 0x0

    .line 13
    iput p1, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->d:I

    .line 14
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->e:Landroid/graphics/Paint;

    .line 15
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->f:Landroid/graphics/Paint;

    .line 16
    invoke-direct {p0}, Lcom/beizi/ad/internal/view/CustomRoundImageView;->a()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 2
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->a:Landroid/graphics/RectF;

    const/4 p1, 0x0

    .line 3
    iput p1, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->b:F

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->c:Ljava/lang/String;

    const/4 p1, 0x0

    .line 5
    iput p1, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->d:I

    .line 6
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->e:Landroid/graphics/Paint;

    .line 7
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->f:Landroid/graphics/Paint;

    .line 8
    invoke-direct {p0}, Lcom/beizi/ad/internal/view/CustomRoundImageView;->a()V

    return-void
.end method

.method private a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->e:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->e:Landroid/graphics/Paint;

    new-instance v2, Landroid/graphics/PorterDuffXfermode;

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v2, v3}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->f:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 4
    iget-object v0, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->f:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->a:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->f:Landroid/graphics/Paint;

    const/16 v2, 0x1f

    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->saveLayer(Landroid/graphics/RectF;Landroid/graphics/Paint;I)I

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->a:Landroid/graphics/RectF;

    iget v1, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->b:F

    iget-object v3, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->f:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v1, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->a:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->e:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->saveLayer(Landroid/graphics/RectF;Landroid/graphics/Paint;I)I

    .line 4
    invoke-super {p0, p1}, Landroid/widget/ImageView;->draw(Landroid/graphics/Canvas;)V

    .line 5
    iget v0, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->d:I

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->c:Ljava/lang/String;

    const-string v1, "#"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 7
    iget-object v1, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->c:Ljava/lang/String;

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 8
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 9
    iget v1, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->d:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    const/4 v1, 0x1

    .line 10
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 11
    iget-object v1, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->a:Landroid/graphics/RectF;

    iget v2, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->b:F

    invoke-virtual {p1, v1, v2, v2, v0}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 12
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/widget/ImageView;->onLayout(ZIIII)V

    .line 2
    invoke-virtual {p0}, Landroid/widget/ImageView;->getWidth()I

    move-result p1

    .line 3
    invoke-virtual {p0}, Landroid/widget/ImageView;->getHeight()I

    move-result p2

    .line 4
    iget-object p3, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->a:Landroid/graphics/RectF;

    int-to-float p1, p1

    int-to-float p2, p2

    const/4 p4, 0x0

    invoke-virtual {p3, p4, p4, p1, p2}, Landroid/graphics/RectF;->set(FFFF)V

    return-void
.end method

.method public setBorderColor(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->c:Ljava/lang/String;

    .line 2
    invoke-virtual {p0}, Landroid/widget/ImageView;->invalidate()V

    return-void
.end method

.method public setBorderWidth(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->d:I

    .line 2
    invoke-virtual {p0}, Landroid/widget/ImageView;->invalidate()V

    return-void
.end method

.method public setRectRadius(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/ad/internal/view/CustomRoundImageView;->b:F

    .line 2
    invoke-virtual {p0}, Landroid/widget/ImageView;->invalidate()V

    return-void
.end method
