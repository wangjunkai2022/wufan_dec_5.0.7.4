.class public Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;
.super Landroid/widget/TextView;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/widget/d;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "AppCompatCustomView"
    }
.end annotation


# instance fields
.field private AA:Landroid/graphics/Path;

.field private AB:Z

.field private final An:Landroid/graphics/Rect;

.field private final Ao:Landroid/graphics/RectF;

.field private final Ar:Landroid/graphics/RectF;

.field private At:F

.field private Au:F

.field private Av:F

.field private final Aw:Landroid/graphics/RectF;

.field private final Ax:Landroid/graphics/RectF;

.field private final Ay:Landroid/graphics/Path;

.field private Az:Landroid/graphics/Path;

.field private final mPaint:Landroid/graphics/Paint;

.field private strokeColor:I
    .annotation build Landroidx/annotation/ColorInt;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->mPaint:Landroid/graphics/Paint;

    .line 3
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->An:Landroid/graphics/Rect;

    .line 4
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Ao:Landroid/graphics/RectF;

    .line 5
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Aw:Landroid/graphics/RectF;

    .line 6
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Ax:Landroid/graphics/RectF;

    .line 7
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Ay:Landroid/graphics/Path;

    .line 8
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Ar:Landroid/graphics/RectF;

    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->AB:Z

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 10
    invoke-direct {p0, p1, v0, v1}, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->a(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 11
    invoke-direct {p0, p1, p2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 12
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->mPaint:Landroid/graphics/Paint;

    .line 13
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->An:Landroid/graphics/Rect;

    .line 14
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Ao:Landroid/graphics/RectF;

    .line 15
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Aw:Landroid/graphics/RectF;

    .line 16
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Ax:Landroid/graphics/RectF;

    .line 17
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Ay:Landroid/graphics/Path;

    .line 18
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Ar:Landroid/graphics/RectF;

    const/4 v0, 0x1

    .line 19
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->AB:Z

    const/4 v0, 0x0

    .line 20
    invoke-direct {p0, p1, p2, v0}, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->a(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 21
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 22
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->mPaint:Landroid/graphics/Paint;

    .line 23
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->An:Landroid/graphics/Rect;

    .line 24
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Ao:Landroid/graphics/RectF;

    .line 25
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Aw:Landroid/graphics/RectF;

    .line 26
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Ax:Landroid/graphics/RectF;

    .line 27
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Ay:Landroid/graphics/Path;

    .line 28
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Ar:Landroid/graphics/RectF;

    const/4 v0, 0x1

    .line 29
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->AB:Z

    .line 30
    invoke-direct {p0, p1, p2, p3}, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->a(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private a(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CustomViewStyleable"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/kwad/sdk/R$styleable;->ksad_KSCouponLabelTextView:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p3, Lcom/kwad/sdk/R$color;->ksad_reward_main_color:I

    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    .line 3
    sget p3, Lcom/kwad/sdk/R$styleable;->ksad_KSCouponLabelTextView_ksad_labelRadius:I

    const/high16 v0, 0x41000000    # 8.0f

    .line 4
    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p3

    iput p3, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->At:F

    .line 5
    sget p3, Lcom/kwad/sdk/R$styleable;->ksad_KSCouponLabelTextView_ksad_strokeSize:I

    const/high16 v0, 0x40000000    # 2.0f

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p3

    iput p3, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Au:F

    .line 6
    sget p3, Lcom/kwad/sdk/R$styleable;->ksad_KSCouponLabelTextView_ksad_strokeColor:I

    invoke-virtual {p2, p3, p1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->strokeColor:I

    .line 7
    sget p1, Lcom/kwad/sdk/R$styleable;->ksad_KSCouponLabelTextView_ksad_sideRadius:I

    const/high16 p3, 0x41800000    # 16.0f

    .line 8
    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p1

    iput p1, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Av:F

    .line 9
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 10
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->ke()V

    return-void
.end method

.method private a(Landroid/graphics/Path;Landroid/graphics/Path;Landroid/graphics/Path;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;)V
    .locals 2
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x13
    .end annotation

    .line 11
    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    .line 12
    iget v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->At:F

    sget-object v1, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {p1, p4, v0, v0, v1}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    const/high16 p4, 0x42b40000    # 90.0f

    const/high16 v0, -0x3ccc0000    # -180.0f

    .line 13
    invoke-virtual {p2, p5, p4, v0}, Landroid/graphics/Path;->addArc(Landroid/graphics/RectF;FF)V

    const/high16 p2, 0x43340000    # 180.0f

    .line 14
    invoke-virtual {p3, p6, p4, p2}, Landroid/graphics/Path;->addArc(Landroid/graphics/RectF;FF)V

    .line 15
    iget-object p2, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Az:Landroid/graphics/Path;

    sget-object p3, Landroid/graphics/Path$Op;->DIFFERENCE:Landroid/graphics/Path$Op;

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 16
    iget-object p2, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->AA:Landroid/graphics/Path;

    sget-object p3, Landroid/graphics/Path$Op;->DIFFERENCE:Landroid/graphics/Path$Op;

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    return-void
.end method

.method private a(Landroid/graphics/RectF;Landroid/graphics/RectF;)V
    .locals 3

    .line 17
    invoke-virtual {p2, p1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 18
    iget v0, p2, Landroid/graphics/RectF;->left:F

    iget v1, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Av:F

    sub-float/2addr v0, v1

    iput v0, p2, Landroid/graphics/RectF;->left:F

    const/high16 v2, 0x40000000    # 2.0f

    mul-float v1, v1, v2

    add-float/2addr v0, v1

    .line 19
    iput v0, p2, Landroid/graphics/RectF;->right:F

    .line 20
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result p1

    .line 21
    iget v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Av:F

    mul-float v1, v0, v2

    sub-float/2addr p1, v1

    div-float/2addr p1, v2

    .line 22
    iget v1, p2, Landroid/graphics/RectF;->top:F

    add-float/2addr v1, p1

    iput v1, p2, Landroid/graphics/RectF;->top:F

    mul-float v0, v0, v2

    add-float/2addr v1, v0

    .line 23
    iput v1, p2, Landroid/graphics/RectF;->bottom:F

    return-void
.end method

.method private b(Landroid/graphics/Path;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    .line 2
    iget v0, p2, Landroid/graphics/RectF;->left:F

    iget v1, p2, Landroid/graphics/RectF;->top:F

    iget v2, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->At:F

    add-float/2addr v1, v2

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Ar:Landroid/graphics/RectF;

    invoke-virtual {v0, p2}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Ar:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->top:F

    iget v2, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->At:F

    const/high16 v3, 0x40000000    # 2.0f

    mul-float v4, v2, v3

    add-float/2addr v1, v4

    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 5
    iget v1, v0, Landroid/graphics/RectF;->left:F

    mul-float v2, v2, v3

    add-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/RectF;->right:F

    const/high16 v1, 0x43340000    # 180.0f

    const/high16 v2, 0x42b40000    # 90.0f

    .line 6
    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    .line 7
    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    move-result v0

    iget v1, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->At:F

    sub-float/2addr v0, v1

    iget v1, p2, Landroid/graphics/RectF;->top:F

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Ar:Landroid/graphics/RectF;

    invoke-virtual {v0, p2}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 9
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Ar:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->right:F

    iget v4, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->At:F

    mul-float v5, v4, v3

    sub-float/2addr v1, v5

    iput v1, v0, Landroid/graphics/RectF;->left:F

    .line 10
    iget v1, v0, Landroid/graphics/RectF;->top:F

    mul-float v4, v4, v3

    add-float/2addr v1, v4

    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    const/high16 v1, 0x43870000    # 270.0f

    .line 11
    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    .line 12
    iget v0, p2, Landroid/graphics/RectF;->right:F

    iget v4, p4, Landroid/graphics/RectF;->top:F

    invoke-virtual {p1, v0, v4}, Landroid/graphics/Path;->lineTo(FF)V

    const/high16 v0, -0x3ccc0000    # -180.0f

    .line 13
    invoke-virtual {p1, p4, v1, v0}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    .line 14
    iget p4, p2, Landroid/graphics/RectF;->right:F

    iget v1, p2, Landroid/graphics/RectF;->bottom:F

    iget v4, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->At:F

    sub-float/2addr v1, v4

    invoke-virtual {p1, p4, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 15
    iget-object p4, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Ar:Landroid/graphics/RectF;

    invoke-virtual {p4, p2}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 16
    iget-object p4, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Ar:Landroid/graphics/RectF;

    iget v1, p4, Landroid/graphics/RectF;->right:F

    iget v4, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->At:F

    mul-float v5, v4, v3

    sub-float/2addr v1, v5

    iput v1, p4, Landroid/graphics/RectF;->left:F

    .line 17
    iget v1, p4, Landroid/graphics/RectF;->bottom:F

    mul-float v4, v4, v3

    sub-float/2addr v1, v4

    iput v1, p4, Landroid/graphics/RectF;->top:F

    const/4 v1, 0x0

    .line 18
    invoke-virtual {p1, p4, v1, v2}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    .line 19
    iget p4, p2, Landroid/graphics/RectF;->left:F

    iget v1, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->At:F

    add-float/2addr p4, v1

    iget v1, p2, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p1, p4, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 20
    iget-object p4, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Ar:Landroid/graphics/RectF;

    invoke-virtual {p4, p2}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 21
    iget-object p4, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Ar:Landroid/graphics/RectF;

    iget v1, p4, Landroid/graphics/RectF;->left:F

    iget v4, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->At:F

    mul-float v5, v4, v3

    add-float/2addr v1, v5

    iput v1, p4, Landroid/graphics/RectF;->right:F

    .line 22
    iget v1, p4, Landroid/graphics/RectF;->bottom:F

    mul-float v4, v4, v3

    sub-float/2addr v1, v4

    iput v1, p4, Landroid/graphics/RectF;->top:F

    .line 23
    invoke-virtual {p1, p4, v2, v2}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    .line 24
    iget p2, p2, Landroid/graphics/RectF;->left:F

    iget p4, p3, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p1, p2, p4}, Landroid/graphics/Path;->lineTo(FF)V

    .line 25
    invoke-virtual {p1, p3, v2, v0}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    .line 26
    invoke-virtual {p1}, Landroid/graphics/Path;->close()V

    return-void
.end method

.method private b(Landroid/graphics/RectF;Landroid/graphics/RectF;)V
    .locals 3

    .line 27
    invoke-virtual {p2, p1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 28
    iget v0, p2, Landroid/graphics/RectF;->right:F

    iget v1, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Av:F

    add-float/2addr v0, v1

    iput v0, p2, Landroid/graphics/RectF;->right:F

    const/high16 v2, 0x40000000    # 2.0f

    mul-float v1, v1, v2

    sub-float/2addr v0, v1

    .line 29
    iput v0, p2, Landroid/graphics/RectF;->left:F

    .line 30
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result p1

    .line 31
    iget v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Av:F

    mul-float v1, v0, v2

    sub-float/2addr p1, v1

    div-float/2addr p1, v2

    .line 32
    iget v1, p2, Landroid/graphics/RectF;->top:F

    add-float/2addr v1, p1

    iput v1, p2, Landroid/graphics/RectF;->top:F

    mul-float v0, v0, v2

    add-float/2addr v1, v0

    .line 33
    iput v1, p2, Landroid/graphics/RectF;->bottom:F

    return-void
.end method

.method private ke()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->mPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->strokeColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->mPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Au:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->mPaint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->mPaint:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/components/core/widget/e;)V
    .locals 1

    .line 24
    invoke-virtual {p0}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lcom/kwad/sdk/R$color;->ksad_reward_main_color:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    iput p1, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->strokeColor:I

    .line 25
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 26
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->ke()V

    .line 27
    invoke-virtual {p0}, Landroid/widget/TextView;->invalidate()V

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 8

    .line 1
    invoke-super {p0, p1}, Landroid/widget/TextView;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->An:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->An:Landroid/graphics/Rect;

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 4
    iget v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Au:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    .line 5
    iget-object v1, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Ao:Landroid/graphics/RectF;

    iget-object v2, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->An:Landroid/graphics/Rect;

    invoke-virtual {v1, v2}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 6
    iget-object v1, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Ao:Landroid/graphics/RectF;

    iget v2, v1, Landroid/graphics/RectF;->left:F

    add-float/2addr v2, v0

    iput v2, v1, Landroid/graphics/RectF;->left:F

    .line 7
    iget v2, v1, Landroid/graphics/RectF;->top:F

    add-float/2addr v2, v0

    iput v2, v1, Landroid/graphics/RectF;->top:F

    .line 8
    iget v2, v1, Landroid/graphics/RectF;->right:F

    sub-float/2addr v2, v0

    iput v2, v1, Landroid/graphics/RectF;->right:F

    .line 9
    iget v2, v1, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v2, v0

    iput v2, v1, Landroid/graphics/RectF;->bottom:F

    .line 10
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Aw:Landroid/graphics/RectF;

    invoke-direct {p0, v1, v0}, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->a(Landroid/graphics/RectF;Landroid/graphics/RectF;)V

    .line 11
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Ao:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Ax:Landroid/graphics/RectF;

    invoke-direct {p0, v0, v1}, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->b(Landroid/graphics/RectF;Landroid/graphics/RectF;)V

    .line 12
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_2

    .line 13
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Az:Landroid/graphics/Path;

    if-nez v0, :cond_0

    .line 14
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Az:Landroid/graphics/Path;

    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 16
    :goto_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->AA:Landroid/graphics/Path;

    if-nez v0, :cond_1

    .line 17
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->AA:Landroid/graphics/Path;

    goto :goto_1

    .line 18
    :cond_1
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 19
    :goto_1
    iget-object v2, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Ay:Landroid/graphics/Path;

    iget-object v3, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Az:Landroid/graphics/Path;

    iget-object v4, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->AA:Landroid/graphics/Path;

    iget-object v5, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Ao:Landroid/graphics/RectF;

    iget-object v6, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Aw:Landroid/graphics/RectF;

    iget-object v7, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Ax:Landroid/graphics/RectF;

    move-object v1, p0

    invoke-direct/range {v1 .. v7}, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->a(Landroid/graphics/Path;Landroid/graphics/Path;Landroid/graphics/Path;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;)V

    .line 20
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Ay:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void

    .line 21
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Ay:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Ao:Landroid/graphics/RectF;

    iget-object v2, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Aw:Landroid/graphics/RectF;

    iget-object v3, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Ax:Landroid/graphics/RectF;

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->b(Landroid/graphics/Path;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;)V

    .line 22
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->Ay:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->onMeasure(II)V

    .line 2
    iget-boolean p1, p0, Lcom/kwad/components/ad/reward/widget/KSCouponLabelTextView;->AB:Z

    if-eqz p1, :cond_1

    .line 3
    invoke-virtual {p0}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result p1

    .line 4
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object p2

    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result p2

    .line 5
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingLeft()I

    move-result v0

    .line 6
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingRight()I

    move-result v1

    add-int/2addr v0, v1

    int-to-float v0, v0

    add-float/2addr v0, p2

    int-to-float p1, p1

    cmpg-float p1, v0, p1

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    const/16 p1, 0x8

    .line 7
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_1
    return-void
.end method
