.class public Lcom/aggmoread/sdk/z/a/n/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/aggmoread/sdk/z/a/n/a;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(IIII)I
    .locals 4

    int-to-double v0, p1

    int-to-double v2, p3

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v0, v2

    int-to-double p1, p2

    int-to-double p3, p4

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {p3, p4}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr p1, p3

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->min(DD)D

    move-result-wide p1

    const/high16 p3, 0x3f800000    # 1.0f

    :goto_0
    const/high16 p4, 0x40000000    # 2.0f

    mul-float p4, p4, p3

    float-to-double v0, p4

    cmpg-double v2, v0, p1

    if-gtz v2, :cond_0

    move p3, p4

    goto :goto_0

    :cond_0
    float-to-int p1, p3

    return p1
.end method

.method private a(IIIILandroid/widget/ImageView$ScaleType;)I
    .locals 4

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    return p3

    :cond_0
    sget-object v0, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    if-ne p5, v0, :cond_2

    if-nez p1, :cond_1

    return p3

    :cond_1
    return p1

    :cond_2
    if-nez p1, :cond_3

    int-to-double p1, p2

    int-to-double p4, p4

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {p4, p5}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr p1, p4

    int-to-double p3, p3

    invoke-static {p3, p4}, Ljava/lang/Double;->isNaN(D)Z

    mul-double p3, p3, p1

    double-to-int p1, p3

    return p1

    :cond_3
    if-nez p2, :cond_4

    return p1

    :cond_4
    int-to-double v0, p4

    int-to-double p3, p3

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {p3, p4}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v0, p3

    sget-object p3, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    if-ne p5, p3, :cond_6

    int-to-double p3, p1

    invoke-static {p3, p4}, Ljava/lang/Double;->isNaN(D)Z

    mul-double p3, p3, v0

    int-to-double v2, p2

    cmpg-double p2, p3, v2

    if-gez p2, :cond_5

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v2, v0

    double-to-int p1, v2

    :cond_5
    return p1

    :cond_6
    int-to-double p3, p1

    invoke-static {p3, p4}, Ljava/lang/Double;->isNaN(D)Z

    mul-double p3, p3, v0

    int-to-double v2, p2

    cmpl-double p2, p3, v2

    if-lez p2, :cond_7

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v2, v0

    double-to-int p1, v2

    :cond_7
    return p1
.end method

.method public static declared-synchronized a()Lcom/aggmoread/sdk/z/a/n/a;
    .locals 2

    const-class v0, Lcom/aggmoread/sdk/z/a/n/a;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/aggmoread/sdk/z/a/n/a;->a:Lcom/aggmoread/sdk/z/a/n/a;

    if-nez v1, :cond_1

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    sget-object v1, Lcom/aggmoread/sdk/z/a/n/a;->a:Lcom/aggmoread/sdk/z/a/n/a;

    if-nez v1, :cond_0

    new-instance v1, Lcom/aggmoread/sdk/z/a/n/a;

    invoke-direct {v1}, Lcom/aggmoread/sdk/z/a/n/a;-><init>()V

    sput-object v1, Lcom/aggmoread/sdk/z/a/n/a;->a:Lcom/aggmoread/sdk/z/a/n/a;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1

    :cond_1
    :goto_0
    sget-object v1, Lcom/aggmoread/sdk/z/a/n/a;->a:Lcom/aggmoread/sdk/z/a/n/a;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    return-object v1

    :catchall_1
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method public a(IILandroid/graphics/Bitmap$Config;Landroid/widget/ImageView$ScaleType;[B)Landroid/graphics/Bitmap;
    .locals 13

    move-object/from16 v0, p5

    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v2, 0x0

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    move-object/from16 v3, p3

    iput-object v3, v1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    array-length v3, v0

    invoke-static {v0, v2, v3, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    move-object v4, p0

    goto :goto_0

    :cond_0
    const/4 v9, 0x1

    iput-boolean v9, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    array-length v3, v0

    invoke-static {v0, v2, v3, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    iget v10, v1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v11, v1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    move-object v3, p0

    move v4, p1

    move v5, p2

    move v6, v10

    move v7, v11

    move-object/from16 v8, p4

    invoke-direct/range {v3 .. v8}, Lcom/aggmoread/sdk/z/a/n/a;->a(IIIILandroid/widget/ImageView$ScaleType;)I

    move-result v12

    move v4, p2

    move v5, p1

    move v6, v11

    move v7, v10

    invoke-direct/range {v3 .. v8}, Lcom/aggmoread/sdk/z/a/n/a;->a(IIIILandroid/widget/ImageView$ScaleType;)I

    move-result v3

    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    move-object v4, p0

    invoke-direct {p0, v10, v11, v12, v3}, Lcom/aggmoread/sdk/z/a/n/a;->a(IIII)I

    move-result v5

    iput v5, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    array-length v5, v0

    invoke-static {v0, v2, v5, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    if-gt v1, v12, :cond_1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    if-le v1, v3, :cond_2

    :cond_1
    invoke-static {v0, v12, v3, v9}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    move-object v0, v1

    :cond_2
    :goto_0
    return-object v0
.end method
