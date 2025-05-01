.class Lcom/beizi/ad/internal/nativead/NativeAdUtil$4;
.super Ljava/lang/Object;
.source "NativeAdUtil.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/nativead/NativeAdUtil;->getOneAdBitmap(Lcom/beizi/ad/NativeAdResponse;Lcom/beizi/ad/internal/utilities/ImageManager$BitmapLoadedListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/concurrent/CountDownLatch;

.field final synthetic b:[Landroid/graphics/Bitmap;

.field final synthetic c:Lcom/beizi/ad/internal/utilities/ImageManager$BitmapLoadedListener;

.field final synthetic d:Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

.field final synthetic e:Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;


# direct methods
.method constructor <init>(Ljava/util/concurrent/CountDownLatch;[Landroid/graphics/Bitmap;Lcom/beizi/ad/internal/utilities/ImageManager$BitmapLoadedListener;Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/nativead/NativeAdUtil$4;->a:Ljava/util/concurrent/CountDownLatch;

    iput-object p2, p0, Lcom/beizi/ad/internal/nativead/NativeAdUtil$4;->b:[Landroid/graphics/Bitmap;

    iput-object p3, p0, Lcom/beizi/ad/internal/nativead/NativeAdUtil$4;->c:Lcom/beizi/ad/internal/utilities/ImageManager$BitmapLoadedListener;

    iput-object p4, p0, Lcom/beizi/ad/internal/nativead/NativeAdUtil$4;->d:Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    iput-object p5, p0, Lcom/beizi/ad/internal/nativead/NativeAdUtil$4;->e:Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/NativeAdUtil$4;->a:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V

    .line 2
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 3
    iget-object v1, p0, Lcom/beizi/ad/internal/nativead/NativeAdUtil$4;->b:[Landroid/graphics/Bitmap;

    const/4 v2, 0x0

    aget-object v3, v1, v2

    if-nez v3, :cond_0

    .line 4
    new-instance v1, Lcom/beizi/ad/internal/nativead/NativeAdUtil$4$1;

    invoke-direct {v1, p0}, Lcom/beizi/ad/internal/nativead/NativeAdUtil$4$1;-><init>(Lcom/beizi/ad/internal/nativead/NativeAdUtil$4;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 5
    :cond_0
    aget-object v1, v1, v2

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    iget-object v3, p0, Lcom/beizi/ad/internal/nativead/NativeAdUtil$4;->b:[Landroid/graphics/Bitmap;

    aget-object v3, v3, v2

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v3, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 6
    new-instance v3, Landroid/graphics/Canvas;

    invoke-direct {v3, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 7
    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    .line 8
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v5

    invoke-virtual {v5}, Lcom/beizi/ad/internal/g;->e()Landroid/content/Context;

    move-result-object v5

    const/high16 v6, 0x41600000    # 14.0f

    invoke-static {v5, v6}, Lcom/beizi/ad/internal/utilities/ViewUtil;->dip2px(Landroid/content/Context;F)I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 9
    iget-object v5, p0, Lcom/beizi/ad/internal/nativead/NativeAdUtil$4;->b:[Landroid/graphics/Bitmap;

    aget-object v5, v5, v2

    const/4 v6, 0x0

    invoke-virtual {v3, v5, v6, v6, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 10
    iget-object v5, p0, Lcom/beizi/ad/internal/nativead/NativeAdUtil$4;->b:[Landroid/graphics/Bitmap;

    const/4 v7, 0x1

    aget-object v8, v5, v7

    const/16 v9, 0x2a

    if-nez v8, :cond_1

    .line 11
    iget-object v5, p0, Lcom/beizi/ad/internal/nativead/NativeAdUtil$4;->d:Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    invoke-virtual {v5}, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->getType()I

    move-result v5

    sget v7, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->TYPE_TEXT:I

    if-ne v5, v7, :cond_2

    .line 12
    new-instance v5, Landroid/graphics/Rect;

    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    .line 13
    iget-object v7, p0, Lcom/beizi/ad/internal/nativead/NativeAdUtil$4;->d:Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    invoke-virtual {v7}, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->getAdurl()Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Lcom/beizi/ad/internal/nativead/NativeAdUtil$4;->d:Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    invoke-virtual {v8}, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->getAdurl()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    invoke-virtual {v4, v7, v2, v8, v5}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 14
    invoke-virtual {v5}, Landroid/graphics/Rect;->width()I

    .line 15
    invoke-virtual {v5}, Landroid/graphics/Rect;->height()I

    move-result v5

    .line 16
    iget-object v7, p0, Lcom/beizi/ad/internal/nativead/NativeAdUtil$4;->d:Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    invoke-virtual {v7}, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->getAdurl()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3}, Landroid/graphics/Canvas;->getHeight()I

    move-result v8

    sub-int/2addr v8, v5

    add-int/lit8 v8, v8, -0x3

    int-to-float v5, v8

    invoke-virtual {v3, v7, v6, v5, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_0

    .line 17
    :cond_1
    aget-object v5, v5, v7

    const/16 v7, 0x55

    invoke-static {v5, v7, v9, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 18
    invoke-virtual {v3}, Landroid/graphics/Canvas;->getHeight()I

    move-result v7

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    sub-int/2addr v7, v8

    int-to-float v7, v7

    invoke-virtual {v3, v5, v6, v7, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 19
    :cond_2
    :goto_0
    iget-object v5, p0, Lcom/beizi/ad/internal/nativead/NativeAdUtil$4;->b:[Landroid/graphics/Bitmap;

    const/4 v6, 0x2

    aget-object v7, v5, v6

    if-nez v7, :cond_3

    .line 20
    iget-object v5, p0, Lcom/beizi/ad/internal/nativead/NativeAdUtil$4;->e:Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    invoke-virtual {v5}, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->getType()I

    move-result v5

    sget v6, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->TYPE_TEXT:I

    if-ne v5, v6, :cond_4

    .line 21
    new-instance v5, Landroid/graphics/Rect;

    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    .line 22
    iget-object v6, p0, Lcom/beizi/ad/internal/nativead/NativeAdUtil$4;->e:Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    invoke-virtual {v6}, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->getAdurl()Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lcom/beizi/ad/internal/nativead/NativeAdUtil$4;->e:Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    invoke-virtual {v7}, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->getAdurl()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    invoke-virtual {v4, v6, v2, v7, v5}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 23
    invoke-virtual {v5}, Landroid/graphics/Rect;->width()I

    move-result v2

    .line 24
    invoke-virtual {v5}, Landroid/graphics/Rect;->height()I

    move-result v5

    .line 25
    iget-object v6, p0, Lcom/beizi/ad/internal/nativead/NativeAdUtil$4;->d:Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    invoke-virtual {v6}, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->getAdurl()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3}, Landroid/graphics/Canvas;->getWidth()I

    move-result v7

    sub-int/2addr v7, v2

    add-int/lit8 v7, v7, -0x3

    int-to-float v2, v7

    invoke-virtual {v3}, Landroid/graphics/Canvas;->getHeight()I

    move-result v7

    sub-int/2addr v7, v5

    add-int/lit8 v7, v7, -0x3

    int-to-float v5, v7

    invoke-virtual {v3, v6, v2, v5, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_1

    .line 26
    :cond_3
    aget-object v5, v5, v6

    invoke-static {v5, v9, v9, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 27
    invoke-virtual {v3}, Landroid/graphics/Canvas;->getWidth()I

    move-result v5

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    sub-int/2addr v5, v6

    int-to-float v5, v5

    invoke-virtual {v3}, Landroid/graphics/Canvas;->getHeight()I

    move-result v6

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    sub-int/2addr v6, v7

    int-to-float v6, v6

    invoke-virtual {v3, v2, v5, v6, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 28
    :cond_4
    :goto_1
    new-instance v2, Lcom/beizi/ad/internal/nativead/NativeAdUtil$4$2;

    invoke-direct {v2, p0, v1}, Lcom/beizi/ad/internal/nativead/NativeAdUtil$4$2;-><init>(Lcom/beizi/ad/internal/nativead/NativeAdUtil$4;Landroid/graphics/Bitmap;)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 29
    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    :goto_2
    return-void
.end method
