.class public final Lcom/kwad/components/ad/splashscreen/widget/d;
.super Landroid/graphics/drawable/AnimationDrawable;
.source "SourceFile"


# instance fields
.field private GO:Landroid/graphics/Bitmap;

.field private GP:Landroid/graphics/Bitmap;

.field private GQ:Landroid/graphics/Bitmap;

.field private GR:Landroid/graphics/Bitmap;

.field private GS:Landroid/graphics/Bitmap;

.field private GT:Landroid/graphics/Bitmap;

.field private GU:I

.field private GV:Landroid/graphics/RectF;

.field private GW:Landroid/graphics/Paint;

.field private GX:Landroid/graphics/Paint;

.field private GY:Landroid/graphics/PorterDuffXfermode;

.field private final GZ:I

.field private final Ha:I

.field private Hb:F

.field private Hc:F

.field private Hd:Landroid/graphics/RectF;

.field private He:Landroid/graphics/Paint;

.field private Hf:I

.field private Hg:I

.field private Hh:Landroid/animation/ValueAnimator;

.field private final Hi:F

.field private final Hj:F

.field private Hk:F

.field private Hl:F

.field private Hm:I

.field private mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/AnimationDrawable;-><init>()V

    const/high16 v0, 0x40c00000    # 6.0f

    .line 2
    iput v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hi:F

    const/high16 v0, 0x41300000    # 11.0f

    .line 3
    iput v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hj:F

    .line 4
    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->mContext:Landroid/content/Context;

    const/high16 v0, 0x424c0000    # 51.0f

    .line 5
    invoke-static {p1, v0}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GZ:I

    const/high16 v0, 0x42740000    # 61.0f

    .line 6
    invoke-static {p1, v0}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result p1

    iput p1, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Ha:I

    .line 7
    iput p2, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hm:I

    .line 8
    invoke-direct {p0}, Lcom/kwad/components/ad/splashscreen/widget/d;->init()V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/splashscreen/widget/d;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hk:F

    return p0
.end method

.method static synthetic a(Lcom/kwad/components/ad/splashscreen/widget/d;F)F
    .locals 0

    .line 2
    iput p1, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hk:F

    return p1
.end method

.method static synthetic b(Lcom/kwad/components/ad/splashscreen/widget/d;F)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/splashscreen/widget/d;->e(F)V

    return-void
.end method

.method private e(F)V
    .locals 5

    const/high16 v0, 0x40c00000    # 6.0f

    cmpg-float v1, p1, v0

    if-gtz v1, :cond_3

    div-float/2addr p1, v0

    .line 1
    iget v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hm:I

    const/high16 v1, 0x3f800000    # 1.0f

    const/high16 v2, 0x41f00000    # 30.0f

    if-eqz v0, :cond_2

    const/4 v3, 0x1

    if-eq v0, v3, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hd:Landroid/graphics/RectF;

    iget v1, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hf:I

    int-to-float v1, v1

    mul-float v1, v1, p1

    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 3
    iget-object v3, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GV:Landroid/graphics/RectF;

    iget v4, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hc:F

    add-float/2addr v1, v4

    iget v0, v0, Landroid/graphics/RectF;->top:F

    iget v4, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hb:F

    add-float/2addr v0, v4

    invoke-virtual {v3, v1, v0}, Landroid/graphics/RectF;->offsetTo(FF)V

    const/high16 v0, 0x43a50000    # 330.0f

    mul-float p1, p1, v2

    add-float/2addr p1, v0

    .line 4
    iput p1, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hl:F

    return-void

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hd:Landroid/graphics/RectF;

    iget v3, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hf:I

    int-to-float v3, v3

    sub-float/2addr v1, p1

    mul-float v3, v3, v1

    iput v3, v0, Landroid/graphics/RectF;->left:F

    .line 6
    iget-object p1, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GV:Landroid/graphics/RectF;

    iget v4, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hc:F

    add-float/2addr v3, v4

    iget v0, v0, Landroid/graphics/RectF;->top:F

    iget v4, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hb:F

    add-float/2addr v0, v4

    invoke-virtual {p1, v3, v0}, Landroid/graphics/RectF;->offsetTo(FF)V

    mul-float v1, v1, v2

    .line 7
    iput v1, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hl:F

    return-void

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hd:Landroid/graphics/RectF;

    iget v3, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hg:I

    int-to-float v3, v3

    sub-float/2addr v1, p1

    mul-float v3, v3, v1

    iput v3, v0, Landroid/graphics/RectF;->top:F

    .line 9
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GV:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    iget v4, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hc:F

    add-float/2addr v0, v4

    iget v4, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hb:F

    add-float/2addr v3, v4

    invoke-virtual {v1, v0, v3}, Landroid/graphics/RectF;->offsetTo(FF)V

    const/high16 v0, 0x43910000    # 290.0f

    mul-float p1, p1, v2

    add-float/2addr p1, v0

    .line 10
    iput p1, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hl:F

    :cond_3
    :goto_0
    return-void
.end method

.method private init()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/kwad/sdk/R$drawable;->ksad_splash_hand:I

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GO:Landroid/graphics/Bitmap;

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/kwad/sdk/R$drawable;->ksad_splash_hand_lt:I

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GP:Landroid/graphics/Bitmap;

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/kwad/sdk/R$drawable;->ksad_splash_hand_lb:I

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GQ:Landroid/graphics/Bitmap;

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/kwad/sdk/R$drawable;->ksad_splash_hand_rt:I

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GR:Landroid/graphics/Bitmap;

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/kwad/sdk/R$drawable;->ksad_splash_hand_rb:I

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GS:Landroid/graphics/Bitmap;

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/kwad/sdk/R$drawable;->ksad_splash_side_bg:I

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 7
    iget v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hm:I

    const/4 v1, 0x2

    const/4 v9, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v9, :cond_1

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 8
    :cond_0
    new-instance v7, Landroid/graphics/Matrix;

    invoke-direct {v7}, Landroid/graphics/Matrix;-><init>()V

    const/high16 v0, 0x42b40000    # 90.0f

    .line 9
    invoke-virtual {v7, v0}, Landroid/graphics/Matrix;->postRotate(F)Z

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 10
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    const/4 v8, 0x1

    invoke-static/range {v2 .. v8}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GT:Landroid/graphics/Bitmap;

    goto :goto_0

    .line 11
    :cond_1
    new-instance v7, Landroid/graphics/Matrix;

    invoke-direct {v7}, Landroid/graphics/Matrix;-><init>()V

    const/high16 v0, 0x43870000    # 270.0f

    .line 12
    invoke-virtual {v7, v0}, Landroid/graphics/Matrix;->postRotate(F)Z

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 13
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    const/4 v8, 0x1

    invoke-static/range {v2 .. v8}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GT:Landroid/graphics/Bitmap;

    goto :goto_0

    .line 14
    :cond_2
    iput-object v2, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GT:Landroid/graphics/Bitmap;

    .line 15
    :goto_0
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->mContext:Landroid/content/Context;

    const/high16 v2, 0x41200000    # 10.0f

    invoke-static {v0, v2}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GU:I

    .line 16
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v9}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->He:Landroid/graphics/Paint;

    .line 17
    iget v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hm:I

    if-eqz v0, :cond_5

    const v2, 0x3db851ec    # 0.09f

    if-eq v0, v9, :cond_4

    if-eq v0, v1, :cond_3

    goto/16 :goto_1

    .line 18
    :cond_3
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/kwad/sdk/R$dimen;->ksad_splash_hand_bgw:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hg:I

    .line 19
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/kwad/sdk/R$dimen;->ksad_splash_hand_bgh:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hf:I

    .line 20
    iget v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hg:I

    int-to-float v0, v0

    mul-float v0, v0, v2

    iput v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hb:F

    .line 21
    iget v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GZ:I

    neg-int v0, v0

    int-to-float v0, v0

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float v0, v0, v1

    iput v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hc:F

    goto :goto_1

    .line 22
    :cond_4
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/kwad/sdk/R$dimen;->ksad_splash_hand_bgw:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hg:I

    .line 23
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/kwad/sdk/R$dimen;->ksad_splash_hand_bgh:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hf:I

    .line 24
    iget v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hg:I

    int-to-float v0, v0

    mul-float v0, v0, v2

    iput v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hb:F

    .line 25
    iget v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GZ:I

    neg-int v0, v0

    int-to-float v0, v0

    const v1, 0x3e4ccccd    # 0.2f

    mul-float v0, v0, v1

    iput v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hc:F

    goto :goto_1

    .line 26
    :cond_5
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/kwad/sdk/R$dimen;->ksad_splash_hand_bgh:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hg:I

    .line 27
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/kwad/sdk/R$dimen;->ksad_splash_hand_bgw:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hf:I

    .line 28
    iget v1, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Ha:I

    neg-int v1, v1

    int-to-float v1, v1

    const v2, 0x3e6147ae    # 0.22f

    mul-float v1, v1, v2

    iput v1, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hb:F

    int-to-float v0, v0

    const v1, 0x3da3d70a    # 0.08f

    mul-float v0, v0, v1

    .line 29
    iput v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hc:F

    .line 30
    :goto_1
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hf:I

    int-to-float v1, v1

    iget v2, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hg:I

    int-to-float v2, v2

    const/4 v3, 0x0

    invoke-direct {v0, v3, v3, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hd:Landroid/graphics/RectF;

    .line 31
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GW:Landroid/graphics/Paint;

    .line 32
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GX:Landroid/graphics/Paint;

    .line 33
    invoke-virtual {v0, v9}, Landroid/graphics/Paint;->setDither(Z)V

    .line 34
    new-instance v0, Landroid/graphics/RectF;

    iget-object v2, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hd:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->right:F

    iget v4, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GZ:I

    int-to-float v4, v4

    sub-float v4, v2, v4

    iget v5, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Ha:I

    int-to-float v5, v5

    invoke-direct {v0, v4, v3, v2, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GV:Landroid/graphics/RectF;

    .line 35
    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->DST_OUT:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GY:Landroid/graphics/PorterDuffXfermode;

    new-array v0, v1, [F

    .line 36
    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hh:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0x44c

    .line 37
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 38
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hh:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/kwad/components/ad/splashscreen/widget/d$1;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/splashscreen/widget/d$1;-><init>(Lcom/kwad/components/ad/splashscreen/widget/d;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 39
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hh:Landroid/animation/ValueAnimator;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    return-void

    :array_0
    .array-data 4
        0x0
        0x40c00000    # 6.0f
        0x41300000    # 11.0f
    .end array-data
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 6
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hd:Landroid/graphics/RectF;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 3
    invoke-virtual {p0}, Lcom/kwad/components/ad/splashscreen/widget/d;->getIntrinsicWidth()I

    move-result v0

    iget v1, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hf:I

    sub-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    invoke-virtual {p0}, Lcom/kwad/components/ad/splashscreen/widget/d;->getIntrinsicHeight()I

    move-result v1

    iget v2, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hg:I

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 4
    iget v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hk:F

    const/high16 v1, 0x437f0000    # 255.0f

    const/high16 v2, 0x40c00000    # 6.0f

    cmpg-float v3, v0, v2

    if-gtz v3, :cond_1

    .line 5
    iget-object v3, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->He:Landroid/graphics/Paint;

    mul-float v0, v0, v1

    div-float/2addr v0, v2

    float-to-int v0, v0

    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GX:Landroid/graphics/Paint;

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    goto :goto_0

    :cond_1
    const/high16 v3, 0x3f800000    # 1.0f

    sub-float/2addr v0, v2

    const/high16 v2, 0x40a00000    # 5.0f

    div-float/2addr v0, v2

    sub-float/2addr v3, v0

    mul-float v3, v3, v1

    float-to-int v0, v3

    .line 7
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->He:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 8
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GX:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 9
    :goto_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v0

    .line 10
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hd:Landroid/graphics/RectF;

    iget-object v2, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->He:Landroid/graphics/Paint;

    const/16 v3, 0x1f

    invoke-virtual {p1, v1, v2, v3}, Landroid/graphics/Canvas;->saveLayer(Landroid/graphics/RectF;Landroid/graphics/Paint;I)I

    move-result v1

    const/4 v2, 0x0

    .line 11
    :try_start_0
    iget-object v3, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GT:Landroid/graphics/Bitmap;

    iget-object v4, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hd:Landroid/graphics/RectF;

    iget-object v5, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->He:Landroid/graphics/Paint;

    invoke-virtual {p1, v3, v2, v4, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    :catchall_0
    iget v3, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hl:F

    iget-object v4, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GV:Landroid/graphics/RectF;

    invoke-virtual {v4}, Landroid/graphics/RectF;->centerX()F

    move-result v4

    iget-object v5, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GV:Landroid/graphics/RectF;

    invoke-virtual {v5}, Landroid/graphics/RectF;->centerY()F

    move-result v5

    invoke-virtual {p1, v3, v4, v5}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 13
    iget-object v3, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GW:Landroid/graphics/Paint;

    iget-object v4, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GY:Landroid/graphics/PorterDuffXfermode;

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 14
    iget v3, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hm:I

    if-eqz v3, :cond_3

    const/4 v4, 0x1

    if-eq v3, v4, :cond_2

    goto :goto_1

    .line 15
    :cond_2
    iget-object v3, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GP:Landroid/graphics/Bitmap;

    iget-object v4, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GV:Landroid/graphics/RectF;

    iget-object v5, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GW:Landroid/graphics/Paint;

    invoke-virtual {p1, v3, v2, v4, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 16
    iget-object v3, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GQ:Landroid/graphics/Bitmap;

    iget-object v4, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GV:Landroid/graphics/RectF;

    iget-object v5, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GW:Landroid/graphics/Paint;

    invoke-virtual {p1, v3, v2, v4, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    goto :goto_1

    .line 17
    :cond_3
    iget-object v3, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GR:Landroid/graphics/Bitmap;

    iget-object v4, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GV:Landroid/graphics/RectF;

    iget-object v5, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GW:Landroid/graphics/Paint;

    invoke-virtual {p1, v3, v2, v4, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 18
    iget-object v3, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GS:Landroid/graphics/Bitmap;

    iget-object v4, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GV:Landroid/graphics/RectF;

    iget-object v5, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GW:Landroid/graphics/Paint;

    invoke-virtual {p1, v3, v2, v4, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 19
    :goto_1
    iget-object v3, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GO:Landroid/graphics/Bitmap;

    iget-object v4, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GV:Landroid/graphics/RectF;

    iget-object v5, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GW:Landroid/graphics/Paint;

    invoke-virtual {p1, v3, v2, v4, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 20
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 21
    iget v1, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hl:F

    iget-object v3, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GV:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->centerX()F

    move-result v3

    iget-object v4, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GV:Landroid/graphics/RectF;

    invoke-virtual {v4}, Landroid/graphics/RectF;->centerY()F

    move-result v4

    invoke-virtual {p1, v1, v3, v4}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 22
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GO:Landroid/graphics/Bitmap;

    iget-object v3, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GV:Landroid/graphics/RectF;

    iget-object v4, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GX:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 23
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 24
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public final getIntrinsicHeight()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hg:I

    iget v1, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Ha:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GU:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final getIntrinsicWidth()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hf:I

    iget v1, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->GZ:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final getOpacity()I
    .locals 1

    const/4 v0, -0x2

    return v0
.end method

.method public final isRunning()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hh:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final start()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hh:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    :cond_0
    return-void
.end method

.method public final stop()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/widget/d;->Hh:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_0
    return-void
.end method
