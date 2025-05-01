.class public Lcom/kwad/sdk/widget/DownloadProgressBar;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private aTA:Landroid/graphics/Rect;

.field private aTB:Landroid/graphics/LinearGradient;

.field private aTC:Landroid/graphics/LinearGradient;

.field private aTD:Landroid/graphics/LinearGradient;

.field private aTE:Ljava/lang/Runnable;

.field aTv:Landroid/graphics/Paint;

.field aTw:Landroid/graphics/Paint;

.field aTx:Landroid/graphics/Paint;

.field private aTy:Ljava/lang/String;

.field private aTz:F

.field private mMatrix:Landroid/graphics/Matrix;

.field private mPath:Landroid/graphics/Path;

.field private mRectF:Landroid/graphics/RectF;

.field private mStartTime:J


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-direct {p0, p1, v0, v1}, Lcom/kwad/sdk/widget/DownloadProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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
    invoke-direct {p0, p1, p2, v0}, Lcom/kwad/sdk/widget/DownloadProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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
    new-instance p2, Lcom/kwad/sdk/widget/DownloadProgressBar$1;

    invoke-direct {p2, p0}, Lcom/kwad/sdk/widget/DownloadProgressBar$1;-><init>(Lcom/kwad/sdk/widget/DownloadProgressBar;)V

    iput-object p2, p0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTE:Ljava/lang/Runnable;

    .line 5
    new-instance p2, Landroid/graphics/Paint;

    const/4 p3, 0x1

    invoke-direct {p2, p3}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p2, p0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTv:Landroid/graphics/Paint;

    .line 6
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2, p3}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p2, p0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTw:Landroid/graphics/Paint;

    .line 7
    new-instance p2, Landroid/graphics/RectF;

    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    iput-object p2, p0, Lcom/kwad/sdk/widget/DownloadProgressBar;->mRectF:Landroid/graphics/RectF;

    .line 8
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2, p3}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p2, p0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTx:Landroid/graphics/Paint;

    const/high16 p3, 0x41800000    # 16.0f

    .line 9
    invoke-static {p1, p3}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 10
    iget-object p1, p0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTx:Landroid/graphics/Paint;

    const/4 p2, -0x1

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 11
    iget-object p1, p0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTx:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 12
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTA:Landroid/graphics/Rect;

    .line 13
    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    iput-object p1, p0, Lcom/kwad/sdk/widget/DownloadProgressBar;->mMatrix:Landroid/graphics/Matrix;

    .line 14
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/kwad/sdk/widget/DownloadProgressBar;->mPath:Landroid/graphics/Path;

    return-void
.end method


# virtual methods
.method protected onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTE:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    .line 1
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    iget-object v1, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->mPath:Landroid/graphics/Path;

    invoke-virtual {v7, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 3
    iget-object v1, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTv:Landroid/graphics/Paint;

    iget-object v2, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTB:Landroid/graphics/LinearGradient;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 4
    iget-object v1, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->mRectF:Landroid/graphics/RectF;

    iget-object v2, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTv:Landroid/graphics/Paint;

    invoke-virtual {v7, v1, v2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 5
    iget-object v1, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTv:Landroid/graphics/Paint;

    iget-object v2, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTC:Landroid/graphics/LinearGradient;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 6
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    iget v2, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTz:F

    mul-float v1, v1, v2

    const/high16 v8, 0x42c80000    # 100.0f

    div-float v4, v1, v8

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v5, v1

    iget-object v6, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTv:Landroid/graphics/Paint;

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 7
    iget v1, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTz:F

    const/4 v9, 0x0

    cmpl-float v2, v1, v9

    if-lez v2, :cond_3

    cmpg-float v1, v1, v8

    if-gez v1, :cond_3

    .line 8
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    iget-wide v3, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->mStartTime:J

    sub-long/2addr v1, v3

    const-wide/16 v3, 0x9c4

    rem-long v10, v1, v3

    const-wide/16 v12, 0x5dc

    cmp-long v1, v10, v12

    if-ltz v1, :cond_0

    const/4 v14, 0x0

    goto :goto_0

    :cond_0
    long-to-float v1, v10

    const v2, 0x44bb8000    # 1500.0f

    div-float/2addr v1, v2

    move v14, v1

    .line 9
    :goto_0
    iget-object v1, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->mMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v1}, Landroid/graphics/Matrix;->reset()V

    .line 10
    iget-object v1, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->mMatrix:Landroid/graphics/Matrix;

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-virtual {v1, v15, v14}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 11
    iget-object v1, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTD:Landroid/graphics/LinearGradient;

    iget-object v2, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->mMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v1, v2}, Landroid/graphics/LinearGradient;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 12
    iget-object v1, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTw:Landroid/graphics/Paint;

    iget-object v2, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTD:Landroid/graphics/LinearGradient;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 13
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    iget v2, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTz:F

    mul-float v1, v1, v2

    div-float/2addr v1, v8

    mul-float v4, v1, v14

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 14
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v5, v1

    iget-object v6, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTw:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    const-wide/16 v1, 0x1f4

    cmp-long v3, v10, v1

    if-lez v3, :cond_2

    cmp-long v3, v10, v12

    if-lez v3, :cond_1

    goto :goto_1

    :cond_1
    sub-long/2addr v10, v1

    long-to-float v1, v10

    const/high16 v2, 0x447a0000    # 1000.0f

    div-float v9, v1, v2

    .line 15
    :cond_2
    :goto_1
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    iget v2, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTz:F

    mul-float v1, v1, v2

    div-float/2addr v1, v8

    mul-float v4, v1, v9

    .line 16
    iget-object v1, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->mMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v1}, Landroid/graphics/Matrix;->reset()V

    .line 17
    iget-object v1, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->mMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v1, v15, v14}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 18
    iget-object v1, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTD:Landroid/graphics/LinearGradient;

    iget-object v2, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->mMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v1, v2}, Landroid/graphics/LinearGradient;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 19
    iget-object v1, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTw:Landroid/graphics/Paint;

    iget-object v2, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTD:Landroid/graphics/LinearGradient;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 20
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v5, v1

    iget-object v6, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTw:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 21
    :cond_3
    iget-object v1, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTy:Ljava/lang/String;

    if-eqz v1, :cond_4

    .line 22
    iget-object v2, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTx:Landroid/graphics/Paint;

    const/4 v3, 0x0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    iget-object v5, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTA:Landroid/graphics/Rect;

    invoke-virtual {v2, v1, v3, v4, v5}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 23
    iget-object v1, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTA:Landroid/graphics/Rect;

    iget v2, v1, Landroid/graphics/Rect;->top:I

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v2, v1

    int-to-float v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    .line 24
    iget-object v3, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTy:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v4, v2

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v5, v2

    sub-float/2addr v5, v1

    iget-object v1, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTx:Landroid/graphics/Paint;

    invoke-virtual {v7, v3, v4, v5, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_4
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 19

    move-object/from16 v0, p0

    .line 1
    invoke-super/range {p0 .. p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    new-instance v9, Landroid/graphics/LinearGradient;

    .line 3
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    int-to-float v4, v1

    const/4 v10, 0x2

    new-array v6, v10, [I

    fill-array-data v6, :array_0

    new-array v7, v10, [F

    fill-array-data v7, :array_1

    sget-object v8, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v1, v9

    invoke-direct/range {v1 .. v8}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    iput-object v9, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTB:Landroid/graphics/LinearGradient;

    .line 4
    new-instance v1, Landroid/graphics/LinearGradient;

    .line 5
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    int-to-float v14, v2

    new-array v2, v10, [I

    fill-array-data v2, :array_2

    new-array v3, v10, [F

    fill-array-data v3, :array_3

    sget-object v18, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    move-object v11, v1

    move-object/from16 v16, v2

    move-object/from16 v17, v3

    invoke-direct/range {v11 .. v18}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    iput-object v1, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTC:Landroid/graphics/LinearGradient;

    .line 6
    iget-object v1, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTv:Landroid/graphics/Paint;

    iget-object v2, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTB:Landroid/graphics/LinearGradient;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 7
    new-instance v1, Landroid/graphics/LinearGradient;

    .line 8
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    int-to-float v14, v2

    new-array v2, v10, [I

    fill-array-data v2, :array_4

    new-array v3, v10, [F

    fill-array-data v3, :array_5

    sget-object v18, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    move-object v11, v1

    move-object/from16 v16, v2

    move-object/from16 v17, v3

    invoke-direct/range {v11 .. v18}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    iput-object v1, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTD:Landroid/graphics/LinearGradient;

    .line 9
    iget-object v2, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTw:Landroid/graphics/Paint;

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 10
    iget-object v1, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->mRectF:Landroid/graphics/RectF;

    move/from16 v2, p1

    int-to-float v2, v2

    move/from16 v3, p2

    int-to-float v3, v3

    const/4 v4, 0x0

    invoke-virtual {v1, v4, v4, v2, v3}, Landroid/graphics/RectF;->set(FFFF)V

    .line 11
    iget-object v1, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->mPath:Landroid/graphics/Path;

    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    .line 12
    iget-object v1, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->mPath:Landroid/graphics/Path;

    iget-object v3, v0, Lcom/kwad/sdk/widget/DownloadProgressBar;->mRectF:Landroid/graphics/RectF;

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v2, v4

    sget-object v4, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v1, v3, v2, v2, v4}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    return-void

    nop

    :array_0
    .array-data 4
        0x4cfb1e52    # 1.31658384E8f
        0x4cfbc90c
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_2
    .array-data 4
        -0x4e1ae
        -0x436f4
    .end array-data

    :array_3
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_4
    .array-data 4
        0xfbc90c
        -0x436f4
    .end array-data

    :array_5
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method protected onVisibilityChanged(Landroid/view/View;I)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onVisibilityChanged(Landroid/view/View;I)V

    return-void
.end method

.method protected onWindowVisibilityChanged(I)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onWindowVisibilityChanged(I)V

    if-nez p1, :cond_0

    .line 2
    iget p1, p0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTz:F

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_1

    const/high16 v0, 0x42c80000    # 100.0f

    cmpg-float p1, p1, v0

    if-gez p1, :cond_1

    .line 3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/widget/DownloadProgressBar;->mStartTime:J

    .line 4
    iget-object p1, p0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTE:Ljava/lang/Runnable;

    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTE:Ljava/lang/Runnable;

    invoke-virtual {p0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_1
    return-void
.end method

.method public setProgress(F)V
    .locals 4

    .line 1
    iput p1, p0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTz:F

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_2

    const/high16 v0, 0x42c80000    # 100.0f

    cmpl-float p1, p1, v0

    if-nez p1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWindowVisibility()I

    move-result p1

    if-nez p1, :cond_1

    iget-wide v0, p0, Lcom/kwad/sdk/widget/DownloadProgressBar;->mStartTime:J

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-nez p1, :cond_1

    .line 4
    iget-object p1, p0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTE:Ljava/lang/Runnable;

    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void

    .line 5
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTE:Ljava/lang/Runnable;

    invoke-virtual {p0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public setText(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/widget/DownloadProgressBar;->aTy:Ljava/lang/String;

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method
