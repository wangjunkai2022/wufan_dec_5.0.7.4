.class public Lcom/beizi/fusion/update/ShakeArcView;
.super Landroid/view/View;
.source "ShakeArcView.java"


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:Landroid/graphics/Paint;

.field private e:Landroid/graphics/Paint;

.field private f:D

.field private g:D

.field private h:I

.field private i:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/beizi/fusion/update/ShakeArcView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

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
    invoke-direct {p0, p1, p2, v0}, Lcom/beizi/fusion/update/ShakeArcView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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

    const-string p1, "#CACCCA"

    .line 4
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/beizi/fusion/update/ShakeArcView;->a:I

    const-string p1, "#FFFFFF"

    .line 5
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/beizi/fusion/update/ShakeArcView;->b:I

    const/4 p1, 0x6

    .line 6
    iput p1, p0, Lcom/beizi/fusion/update/ShakeArcView;->c:I

    const-wide/high16 p1, -0x4010000000000000L    # -1.0

    .line 7
    iput-wide p1, p0, Lcom/beizi/fusion/update/ShakeArcView;->f:D

    .line 8
    iput-wide p1, p0, Lcom/beizi/fusion/update/ShakeArcView;->g:D

    const/4 p1, 0x0

    .line 9
    iput p1, p0, Lcom/beizi/fusion/update/ShakeArcView;->h:I

    const/4 p1, 0x2

    .line 10
    iput p1, p0, Lcom/beizi/fusion/update/ShakeArcView;->i:I

    .line 11
    invoke-direct {p0}, Lcom/beizi/fusion/update/ShakeArcView;->a()V

    .line 12
    invoke-direct {p0}, Lcom/beizi/fusion/update/ShakeArcView;->b()V

    return-void
.end method

.method private a()V
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/beizi/fusion/update/ShakeArcView;->d:Landroid/graphics/Paint;

    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/update/ShakeArcView;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/update/ShakeArcView;->d:Landroid/graphics/Paint;

    iget v1, p0, Lcom/beizi/fusion/update/ShakeArcView;->c:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/update/ShakeArcView;->d:Landroid/graphics/Paint;

    iget v1, p0, Lcom/beizi/fusion/update/ShakeArcView;->a:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/update/ShakeArcView;->d:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/update/ShakeArcView;->d:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    return-void
.end method

.method private a(Landroid/graphics/Canvas;ZFFFFFFI)V
    .locals 2

    .line 8
    :try_start_0
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    const/4 v1, 0x1

    .line 9
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 10
    invoke-virtual {v0, p9}, Landroid/graphics/Paint;->setColor(I)V

    if-eqz p2, :cond_0

    .line 11
    sget-object p2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    goto :goto_0

    .line 12
    :cond_0
    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 13
    :goto_0
    new-instance p2, Landroid/graphics/Path;

    invoke-direct {p2}, Landroid/graphics/Path;-><init>()V

    .line 14
    invoke-virtual {p2, p3, p4}, Landroid/graphics/Path;->moveTo(FF)V

    .line 15
    invoke-virtual {p2, p5, p6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 16
    invoke-virtual {p2, p7, p8}, Landroid/graphics/Path;->lineTo(FF)V

    .line 17
    invoke-virtual {p2, p3, p4}, Landroid/graphics/Path;->lineTo(FF)V

    .line 18
    invoke-virtual {p2}, Landroid/graphics/Path;->close()V

    .line 19
    invoke-virtual {p1, p2, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 20
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method

.method private b()V
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/beizi/fusion/update/ShakeArcView;->e:Landroid/graphics/Paint;

    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/update/ShakeArcView;->e:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/update/ShakeArcView;->e:Landroid/graphics/Paint;

    iget v1, p0, Lcom/beizi/fusion/update/ShakeArcView;->c:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/update/ShakeArcView;->e:Landroid/graphics/Paint;

    iget v1, p0, Lcom/beizi/fusion/update/ShakeArcView;->b:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/update/ShakeArcView;->e:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/update/ShakeArcView;->e:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 21

    move-object/from16 v11, p0

    .line 1
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    :try_start_0
    new-instance v0, Landroid/graphics/RectF;

    iget v1, v11, Lcom/beizi/fusion/update/ShakeArcView;->c:I

    div-int/lit8 v2, v1, 0x2

    int-to-float v2, v2

    const/4 v12, 0x2

    div-int/2addr v1, v12

    int-to-float v1, v1

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v3

    iget v4, v11, Lcom/beizi/fusion/update/ShakeArcView;->c:I

    div-int/2addr v4, v12

    sub-int/2addr v3, v4

    int-to-float v3, v3

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v4

    iget v5, v11, Lcom/beizi/fusion/update/ShakeArcView;->c:I

    div-int/2addr v5, v12

    sub-int/2addr v4, v5

    int-to-float v4, v4

    invoke-direct {v0, v2, v1, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    const/high16 v3, 0x43570000    # 215.0f

    const/high16 v4, 0x42dc0000    # 110.0f

    const/4 v5, 0x0

    .line 3
    iget-object v6, v11, Lcom/beizi/fusion/update/ShakeArcView;->d:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move-object v2, v0

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 4
    iget-wide v1, v11, Lcom/beizi/fusion/update/ShakeArcView;->g:D

    const/4 v7, 0x1

    const-wide/16 v3, 0x0

    cmpl-double v5, v1, v3

    if-ltz v5, :cond_3

    iget-wide v5, v11, Lcom/beizi/fusion/update/ShakeArcView;->f:D

    cmpl-double v8, v5, v3

    if-lez v8, :cond_3

    cmpl-double v3, v1, v5

    if-ltz v3, :cond_0

    .line 5
    iput-wide v5, v11, Lcom/beizi/fusion/update/ShakeArcView;->g:D

    .line 6
    :cond_0
    iget-wide v1, v11, Lcom/beizi/fusion/update/ShakeArcView;->g:D
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    double-to-float v1, v1

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v1, v5

    double-to-float v8, v1

    :try_start_1
    const-string v1, "sweepAngle"

    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sweepAngle:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v3, ",mMaxProgress:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v3, v11, Lcom/beizi/fusion/update/ShakeArcView;->f:D

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v3, ",mCurrentProgress:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v3, v11, Lcom/beizi/fusion/update/ShakeArcView;->g:D

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/beizi/fusion/g/af;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    iget v1, v11, Lcom/beizi/fusion/update/ShakeArcView;->h:I

    const/high16 v2, 0x42dc0000    # 110.0f

    if-ne v1, v7, :cond_1

    const/high16 v3, 0x43570000    # 215.0f

    mul-float v4, v8, v2

    const/4 v5, 0x0

    .line 9
    iget-object v6, v11, Lcom/beizi/fusion/update/ShakeArcView;->e:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move-object v2, v0

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    goto :goto_0

    :cond_1
    if-ne v1, v12, :cond_2

    const v3, 0x43a28000    # 325.0f

    neg-float v1, v8

    mul-float v4, v1, v2

    const/4 v5, 0x0

    .line 10
    iget-object v6, v11, Lcom/beizi/fusion/update/ShakeArcView;->e:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move-object v2, v0

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    goto :goto_0

    :cond_2
    const/high16 v3, 0x43870000    # 270.0f

    neg-float v1, v8

    const/high16 v9, 0x425c0000    # 55.0f

    mul-float v4, v1, v9

    const/4 v5, 0x0

    .line 11
    iget-object v6, v11, Lcom/beizi/fusion/update/ShakeArcView;->e:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move-object v2, v0

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    const/high16 v3, 0x43870000    # 270.0f

    mul-float v4, v8, v9

    const/4 v5, 0x0

    .line 12
    iget-object v6, v11, Lcom/beizi/fusion/update/ShakeArcView;->e:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move-object v2, v0

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    :cond_3
    :goto_0
    const-string v0, "#CACCCA"

    .line 13
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    .line 14
    iget-wide v1, v11, Lcom/beizi/fusion/update/ShakeArcView;->g:D

    iget-wide v3, v11, Lcom/beizi/fusion/update/ShakeArcView;->f:D

    cmpl-double v5, v1, v3

    if-nez v5, :cond_4

    const-string v0, "#FFFFFF"

    .line 15
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    .line 16
    :cond_4
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v1

    .line 17
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v2

    .line 18
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v3

    div-int/2addr v3, v12

    iget v4, v11, Lcom/beizi/fusion/update/ShakeArcView;->c:I

    iget v5, v11, Lcom/beizi/fusion/update/ShakeArcView;->i:I

    mul-int v4, v4, v5

    add-int/2addr v3, v4

    .line 19
    div-int/lit8 v13, v1, 0x2

    .line 20
    div-int/lit8 v14, v2, 0x2

    const-wide v1, 0x4046800000000000L    # 45.0

    .line 21
    invoke-static {v1, v2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    move-result-wide v1

    double-to-float v1, v1

    .line 22
    iget v2, v11, Lcom/beizi/fusion/update/ShakeArcView;->h:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const-wide/high16 v15, 0x3ff8000000000000L    # 1.5

    const-wide v4, 0x3fc999999999999aL    # 0.2

    const-wide v8, 0x3fd999999999999aL    # 0.4

    if-ne v2, v7, :cond_5

    int-to-double v6, v13

    .line 23
    invoke-static {v6, v7}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v6, v6, v15

    int-to-float v2, v3

    mul-float v1, v1, v2

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v8, v8, v1

    add-double/2addr v8, v6

    double-to-float v8, v8

    .line 24
    :try_start_2
    div-int/lit8 v3, v14, 0x2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    int-to-double v9, v3

    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v1, v1, v4

    invoke-static {v9, v10}, Ljava/lang/Double;->isNaN(D)Z

    sub-double/2addr v9, v1

    double-to-float v5, v9

    add-double/2addr v6, v1

    double-to-float v6, v6

    .line 25
    :try_start_3
    div-int/2addr v14, v12

    int-to-float v9, v14

    const/4 v3, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move v4, v8

    move v7, v9

    move v10, v0

    .line 26
    invoke-direct/range {v1 .. v10}, Lcom/beizi/fusion/update/ShakeArcView;->a(Landroid/graphics/Canvas;ZFFFFFFI)V

    goto/16 :goto_1

    :cond_5
    if-ne v2, v12, :cond_6

    .line 27
    div-int/lit8 v2, v13, 0x2
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    int-to-double v6, v2

    int-to-float v2, v3

    mul-float v1, v1, v2

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v8, v8, v1

    invoke-static {v6, v7}, Ljava/lang/Double;->isNaN(D)Z

    sub-double/2addr v6, v8

    double-to-float v8, v6

    .line 28
    :try_start_4
    div-int/lit8 v3, v14, 0x2
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    int-to-double v6, v3

    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v1, v1, v4

    invoke-static {v6, v7}, Ljava/lang/Double;->isNaN(D)Z

    sub-double/2addr v6, v1

    double-to-float v5, v6

    .line 29
    :try_start_5
    div-int/2addr v13, v12
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    int-to-double v3, v13

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    sub-double/2addr v3, v1

    double-to-float v6, v3

    .line 30
    :try_start_6
    div-int/2addr v14, v12

    int-to-float v9, v14

    const/4 v3, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move v4, v8

    move v7, v9

    move v10, v0

    .line 31
    invoke-direct/range {v1 .. v10}, Lcom/beizi/fusion/update/ShakeArcView;->a(Landroid/graphics/Canvas;ZFFFFFFI)V

    goto :goto_1

    .line 32
    :cond_6
    div-int/lit8 v2, v13, 0x2
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    int-to-double v6, v2

    int-to-float v2, v3

    mul-float v1, v1, v2

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v17, v1, v8

    invoke-static {v6, v7}, Ljava/lang/Double;->isNaN(D)Z

    sub-double v6, v6, v17

    double-to-float v8, v6

    .line 33
    :try_start_7
    div-int/lit8 v3, v14, 0x2
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    int-to-double v6, v3

    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v19, v1, v4

    invoke-static {v6, v7}, Ljava/lang/Double;->isNaN(D)Z

    sub-double v6, v6, v19

    double-to-float v5, v6

    .line 34
    :try_start_8
    div-int/lit8 v1, v13, 0x2
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    int-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    sub-double v1, v1, v19

    double-to-float v6, v1

    .line 35
    :try_start_9
    div-int/lit8 v1, v14, 0x2

    int-to-float v9, v1

    const/4 v3, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move v4, v8

    move v7, v9

    move v10, v0

    .line 36
    invoke-direct/range {v1 .. v10}, Lcom/beizi/fusion/update/ShakeArcView;->a(Landroid/graphics/Canvas;ZFFFFFFI)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0

    int-to-double v1, v13

    .line 37
    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v1, v1, v15

    add-double v3, v1, v17

    double-to-float v8, v3

    .line 38
    :try_start_a
    div-int/lit8 v3, v14, 0x2
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_0

    int-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    sub-double v3, v3, v19

    double-to-float v5, v3

    add-double v1, v1, v19

    double-to-float v6, v1

    .line 39
    :try_start_b
    div-int/2addr v14, v12

    int-to-float v9, v14

    const/4 v3, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move v4, v8

    move v7, v9

    move v10, v0

    .line 40
    invoke-direct/range {v1 .. v10}, Lcom/beizi/fusion/update/ShakeArcView;->a(Landroid/graphics/Canvas;ZFFFFFFI)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 41
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method

.method protected onMeasure(II)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 2
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    iget v0, p0, Lcom/beizi/fusion/update/ShakeArcView;->c:I

    mul-int/lit8 v0, v0, 0x2

    add-int/2addr p1, v0

    .line 3
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    iget v0, p0, Lcom/beizi/fusion/update/ShakeArcView;->c:I

    mul-int/lit8 v0, v0, 0x2

    add-int/2addr p2, v0

    .line 4
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public setArrowDirection(I)Lcom/beizi/fusion/update/ShakeArcView;
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/update/ShakeArcView;->h:I

    return-object p0
.end method

.method public setCurrentProgress(D)Lcom/beizi/fusion/update/ShakeArcView;
    .locals 2

    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    mul-double p1, p1, v0

    .line 1
    iput-wide p1, p0, Lcom/beizi/fusion/update/ShakeArcView;->g:D

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-object p0
.end method

.method public setLineRadius(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/update/ShakeArcView;->i:I

    return-void
.end method

.method public setLineWidth(I)V
    .locals 1

    .line 1
    :try_start_0
    iput p1, p0, Lcom/beizi/fusion/update/ShakeArcView;->c:I

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/update/ShakeArcView;->d:Landroid/graphics/Paint;

    if-eqz v0, :cond_0

    int-to-float p1, p1

    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/update/ShakeArcView;->e:Landroid/graphics/Paint;

    if-eqz p1, :cond_1

    .line 5
    iget v0, p0, Lcom/beizi/fusion/update/ShakeArcView;->c:I

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 6
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_0
    return-void
.end method

.method public setMaxProgress(D)Lcom/beizi/fusion/update/ShakeArcView;
    .locals 2

    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    mul-double p1, p1, v0

    .line 1
    iput-wide p1, p0, Lcom/beizi/fusion/update/ShakeArcView;->f:D

    return-object p0
.end method
