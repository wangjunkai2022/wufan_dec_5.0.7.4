.class public Lcom/kwad/components/ad/reward/widget/KsShadowImageView;
.super Landroid/widget/ImageView;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "AppCompatCustomView"
    }
.end annotation


# instance fields
.field private AV:Landroid/graphics/Paint;

.field private AW:Landroid/graphics/BlurMaskFilter;

.field private AX:I

.field private AY:Z

.field private AZ:Z

.field private Ba:Z

.field private Bb:Z

.field private Bc:Landroid/graphics/Rect;

.field private Bd:I
    .annotation build Landroidx/annotation/ColorInt;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/widget/KsShadowImageView;->Bb:Z

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, p1, v0, v1}, Lcom/kwad/components/ad/reward/widget/KsShadowImageView;->a(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 4
    invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/widget/KsShadowImageView;->Bb:Z

    const/4 v0, 0x0

    .line 6
    invoke-direct {p0, p1, p2, v0}, Lcom/kwad/components/ad/reward/widget/KsShadowImageView;->a(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 7
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/widget/KsShadowImageView;->Bb:Z

    .line 9
    invoke-direct {p0, p1, p2, p3}, Lcom/kwad/components/ad/reward/widget/KsShadowImageView;->a(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 10
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const/4 p4, 0x1

    .line 11
    iput-boolean p4, p0, Lcom/kwad/components/ad/reward/widget/KsShadowImageView;->Bb:Z

    .line 12
    invoke-direct {p0, p1, p2, p3}, Lcom/kwad/components/ad/reward/widget/KsShadowImageView;->a(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private a(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/widget/KsShadowImageView;->AV:Landroid/graphics/Paint;

    .line 2
    new-instance v0, Landroid/graphics/BlurMaskFilter;

    sget-object v1, Landroid/graphics/BlurMaskFilter$Blur;->OUTER:Landroid/graphics/BlurMaskFilter$Blur;

    const/high16 v2, 0x42480000    # 50.0f

    invoke-direct {v0, v2, v1}, Landroid/graphics/BlurMaskFilter;-><init>(FLandroid/graphics/BlurMaskFilter$Blur;)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/widget/KsShadowImageView;->AW:Landroid/graphics/BlurMaskFilter;

    .line 3
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/widget/KsShadowImageView;->Bc:Landroid/graphics/Rect;

    .line 4
    sget-object v0, Lcom/kwad/sdk/R$styleable;->ksad_KsShadowImageView:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 5
    sget p2, Lcom/kwad/sdk/R$styleable;->ksad_KsShadowImageView_ksad_shadowSize:I

    const/16 p3, 0x14

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/kwad/components/ad/reward/widget/KsShadowImageView;->AX:I

    .line 6
    sget p2, Lcom/kwad/sdk/R$styleable;->ksad_KsShadowImageView_ksad_shadowColor:I

    const-string p3, "#33000000"

    .line 7
    invoke-static {p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p3

    .line 8
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/kwad/components/ad/reward/widget/KsShadowImageView;->Bd:I

    .line 9
    sget p2, Lcom/kwad/sdk/R$styleable;->ksad_KsShadowImageView_ksad_enableLeftShadow:I

    const/4 p3, 0x1

    .line 10
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/kwad/components/ad/reward/widget/KsShadowImageView;->AY:Z

    .line 11
    sget p2, Lcom/kwad/sdk/R$styleable;->ksad_KsShadowImageView_ksad_enableRightShadow:I

    .line 12
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/kwad/components/ad/reward/widget/KsShadowImageView;->AZ:Z

    .line 13
    sget p2, Lcom/kwad/sdk/R$styleable;->ksad_KsShadowImageView_ksad_enableTopShadow:I

    .line 14
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/kwad/components/ad/reward/widget/KsShadowImageView;->Ba:Z

    .line 15
    sget p2, Lcom/kwad/sdk/R$styleable;->ksad_KsShadowImageView_ksad_enableBottomShadow:I

    .line 16
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/kwad/components/ad/reward/widget/KsShadowImageView;->Bb:Z

    .line 17
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/KsShadowImageView;->AV:Landroid/graphics/Paint;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/widget/KsShadowImageView;->AW:Landroid/graphics/BlurMaskFilter;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setMaskFilter(Landroid/graphics/MaskFilter;)Landroid/graphics/MaskFilter;

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/KsShadowImageView;->AV:Landroid/graphics/Paint;

    iget v1, p0, Lcom/kwad/components/ad/reward/widget/KsShadowImageView;->Bd:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/KsShadowImageView;->AV:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 5
    invoke-virtual {p0}, Landroid/widget/ImageView;->getMeasuredWidth()I

    move-result v0

    .line 6
    invoke-virtual {p0}, Landroid/widget/ImageView;->getMeasuredHeight()I

    move-result v1

    .line 7
    iget-object v2, p0, Lcom/kwad/components/ad/reward/widget/KsShadowImageView;->Bc:Landroid/graphics/Rect;

    iget-boolean v3, p0, Lcom/kwad/components/ad/reward/widget/KsShadowImageView;->AY:Z

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    iget v3, p0, Lcom/kwad/components/ad/reward/widget/KsShadowImageView;->AX:I

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iput v3, v2, Landroid/graphics/Rect;->left:I

    .line 8
    iget-boolean v3, p0, Lcom/kwad/components/ad/reward/widget/KsShadowImageView;->Ba:Z

    if-eqz v3, :cond_1

    iget v3, p0, Lcom/kwad/components/ad/reward/widget/KsShadowImageView;->AX:I

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    iput v3, v2, Landroid/graphics/Rect;->top:I

    .line 9
    iget-boolean v3, p0, Lcom/kwad/components/ad/reward/widget/KsShadowImageView;->AZ:Z

    if-eqz v3, :cond_2

    iget v3, p0, Lcom/kwad/components/ad/reward/widget/KsShadowImageView;->AX:I

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_2
    sub-int/2addr v0, v3

    iput v0, v2, Landroid/graphics/Rect;->right:I

    .line 10
    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/widget/KsShadowImageView;->Bb:Z

    if-eqz v0, :cond_3

    iget v4, p0, Lcom/kwad/components/ad/reward/widget/KsShadowImageView;->AX:I

    :cond_3
    sub-int/2addr v1, v4

    iput v1, v2, Landroid/graphics/Rect;->bottom:I

    .line 11
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/KsShadowImageView;->AV:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v0}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    return-void
.end method
