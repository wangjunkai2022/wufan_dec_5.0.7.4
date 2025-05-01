.class public Lcom/beizi/fusion/g/al;
.super Ljava/lang/Object;
.source "RandomUtils.java"


# direct methods
.method private static a(DDDDDD)D
    .locals 0

    sub-double/2addr p4, p0

    const-wide/high16 p0, 0x4000000000000000L    # 2.0

    .line 5
    invoke-static {p4, p5, p0, p1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p4

    .line 6
    invoke-static {p8, p9, p0, p1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p8

    div-double/2addr p4, p8

    sub-double/2addr p6, p2

    .line 7
    invoke-static {p6, p7, p0, p1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p2

    .line 8
    invoke-static {p10, p11, p0, p1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p0

    div-double/2addr p2, p0

    add-double/2addr p4, p2

    return-wide p4
.end method

.method public static a(I)Z
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double v0, v0, v2

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    add-double/2addr v0, v2

    double-to-int v0, v0

    if-gt v0, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static a(II)[I
    .locals 22

    move/from16 v0, p0

    move/from16 v1, p1

    const/4 v2, 0x2

    new-array v2, v2, [I

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-nez v5, :cond_1

    mul-int/lit8 v6, v0, 0x2

    int-to-double v6, v6

    const-wide v8, 0x3fee666666666666L    # 0.95

    .line 2
    invoke-static {v6, v7}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v6, v6, v8

    double-to-int v6, v6

    invoke-static {v4, v6}, Lcom/beizi/fusion/g/al;->b(II)I

    move-result v6

    int-to-double v6, v6

    invoke-static {v6, v7}, Ljava/lang/Math;->rint(D)D

    move-result-wide v6

    mul-int/lit8 v10, v1, 0x2

    int-to-double v10, v10

    .line 3
    invoke-static {v10, v11}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v10, v10, v8

    double-to-int v8, v10

    invoke-static {v4, v8}, Lcom/beizi/fusion/g/al;->b(II)I

    move-result v8

    int-to-double v8, v8

    invoke-static {v8, v9}, Ljava/lang/Math;->rint(D)D

    move-result-wide v8

    int-to-double v10, v0

    int-to-double v12, v1

    const-wide v14, 0x3feccccccccccccdL    # 0.9

    .line 4
    invoke-static {v10, v11}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v18, v10, v14

    invoke-static {v12, v13}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v20, v12, v14

    move-wide v14, v6

    move-wide/from16 v16, v8

    invoke-static/range {v10 .. v21}, Lcom/beizi/fusion/g/al;->a(DDDDDD)D

    move-result-wide v10

    const-wide/high16 v12, 0x3ff0000000000000L    # 1.0

    cmpl-double v14, v10, v12

    if-lez v14, :cond_0

    goto :goto_0

    :cond_0
    double-to-int v5, v6

    aput v5, v2, v4

    double-to-int v5, v8

    aput v5, v2, v3

    const/4 v5, 0x1

    goto :goto_0

    :cond_1
    return-object v2
.end method

.method public static b(I)I
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    int-to-double v2, p0

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v2

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    add-double/2addr v0, v2

    double-to-int p0, v0

    return p0
.end method

.method private static b(II)I
    .locals 4

    .line 2
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    sub-int/2addr p1, p0

    int-to-double v2, p1

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v2

    int-to-double p0, p0

    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v0, p0

    double-to-int p0, v0

    return p0
.end method
