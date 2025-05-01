.class Lcom/beizi/fusion/g/an$1;
.super Ljava/lang/Object;
.source "RollUtil.java"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/g/an;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/g/an;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/g/an;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 25

    move-object/from16 v1, p0

    .line 1
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->a(Lcom/beizi/fusion/g/an;)J

    move-result-wide v4

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x50

    cmp-long v0, v2, v4

    if-gez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Lcom/beizi/fusion/g/an;->a(Lcom/beizi/fusion/g/an;J)J

    move-object/from16 v0, p1

    .line 3
    iget-object v0, v0, Landroid/hardware/SensorEvent;->values:[F

    const/4 v2, 0x0

    .line 4
    aget v3, v0, v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    float-to-double v3, v3

    const-wide v5, 0x402399999999999aL    # 9.8

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v3, v5

    const/4 v7, 0x1

    .line 5
    :try_start_1
    aget v8, v0, v7
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    float-to-double v8, v8

    invoke-static {v8, v9}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v8, v5

    const/4 v10, 0x2

    .line 6
    :try_start_2
    aget v0, v0, v10
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    float-to-double v11, v0

    invoke-static {v11, v12}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v11, v5

    .line 7
    :try_start_3
    invoke-static {v3, v4, v8, v9}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v5

    const-wide/16 v13, 0x0

    const-wide v15, 0x4066800000000000L    # 180.0

    cmpg-double v0, v5, v13

    if-gtz v0, :cond_1

    neg-double v5, v5

    sub-double/2addr v5, v15

    goto :goto_0

    :cond_1
    sub-double v5, v15, v5

    .line 8
    :goto_0
    invoke-static {v3, v4, v11, v12}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v17

    move-wide/from16 v19, v11

    invoke-static/range {v17 .. v18}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v10

    cmpg-double v0, v10, v13

    if-gtz v0, :cond_2

    neg-double v10, v10

    sub-double/2addr v10, v15

    goto :goto_1

    :cond_2
    sub-double v10, v15, v10

    :goto_1
    mul-double v3, v3, v3

    mul-double v17, v8, v8

    add-double v3, v3, v17

    .line 9
    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v3

    move-wide/from16 v13, v19

    invoke-static {v13, v14, v3, v4}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v3

    const-wide v12, 0x4056800000000000L    # 90.0

    add-double/2addr v3, v12

    const-wide v12, -0x3f70c80000000000L    # -999.0

    const-wide v19, 0x4046800000000000L    # 45.0

    const-wide v21, 0x4076800000000000L    # 360.0

    cmpg-double v0, v3, v19

    if-lez v0, :cond_d

    const-wide v23, 0x4060e00000000000L    # 135.0

    cmpl-double v0, v3, v23

    if-gez v0, :cond_d

    .line 10
    invoke-static {v8, v9}, Ljava/lang/Math;->sin(D)D

    move-result-wide v3

    const-wide v8, 0x400921fb54442d18L    # Math.PI

    div-double/2addr v3, v8

    mul-double v3, v3, v15

    invoke-static {v3, v4}, Ljava/lang/Math;->abs(D)D

    move-result-wide v3

    cmpg-double v0, v3, v19

    if-gez v0, :cond_3

    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->b(Lcom/beizi/fusion/g/an;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto/16 :goto_3

    .line 11
    :cond_3
    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->h(Lcom/beizi/fusion/g/an;)D

    move-result-wide v3

    cmpl-double v0, v3, v12

    if-eqz v0, :cond_c

    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->i(Lcom/beizi/fusion/g/an;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_2

    .line 12
    :cond_4
    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->h(Lcom/beizi/fusion/g/an;)D

    move-result-wide v2

    cmpl-double v0, v5, v2

    if-ltz v0, :cond_5

    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->h(Lcom/beizi/fusion/g/an;)D

    move-result-wide v2

    sub-double v2, v5, v2

    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->d(Lcom/beizi/fusion/g/an;)D

    move-result-wide v8

    cmpl-double v0, v2, v8

    if-lez v0, :cond_5

    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->h(Lcom/beizi/fusion/g/an;)D

    move-result-wide v2

    sub-double v2, v5, v2

    cmpg-double v0, v2, v15

    if-lez v0, :cond_6

    :cond_5
    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->h(Lcom/beizi/fusion/g/an;)D

    move-result-wide v2

    cmpg-double v0, v5, v2

    if-gez v0, :cond_7

    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->h(Lcom/beizi/fusion/g/an;)D

    move-result-wide v2

    const-wide/16 v8, 0x0

    cmpl-double v0, v2, v8

    if-lez v0, :cond_7

    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->h(Lcom/beizi/fusion/g/an;)D

    move-result-wide v2

    sub-double v2, v21, v2

    add-double/2addr v2, v5

    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->d(Lcom/beizi/fusion/g/an;)D

    move-result-wide v8

    cmpl-double v0, v2, v8

    if-lez v0, :cond_7

    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->h(Lcom/beizi/fusion/g/an;)D

    move-result-wide v2

    sub-double v2, v21, v2

    add-double/2addr v2, v5

    cmpg-double v0, v2, v15

    if-gtz v0, :cond_7

    .line 13
    :cond_6
    invoke-static {}, Lcom/beizi/fusion/g/an;->d()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "11111\u53d1\u751f\u5782\u76f4\u72b6\u6001\u6eda\u52a8 rollStatus:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v3}, Lcom/beizi/fusion/g/an;->e(Lcom/beizi/fusion/g/an;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/beizi/fusion/g/af;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0, v7}, Lcom/beizi/fusion/g/an;->a(Lcom/beizi/fusion/g/an;I)I

    .line 15
    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->f(Lcom/beizi/fusion/g/an;)V

    goto/16 :goto_5

    .line 16
    :cond_7
    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->h(Lcom/beizi/fusion/g/an;)D

    move-result-wide v2

    cmpl-double v0, v5, v2

    if-ltz v0, :cond_9

    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->h(Lcom/beizi/fusion/g/an;)D

    move-result-wide v2

    sub-double v2, v5, v2

    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->g(Lcom/beizi/fusion/g/an;)D

    move-result-wide v8

    cmpg-double v0, v2, v8

    if-gez v0, :cond_8

    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->h(Lcom/beizi/fusion/g/an;)D

    move-result-wide v2

    sub-double v2, v5, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    cmpg-double v0, v2, v15

    if-lez v0, :cond_b

    :cond_8
    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->h(Lcom/beizi/fusion/g/an;)D

    move-result-wide v2

    sub-double v2, v5, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    cmpl-double v0, v2, v15

    if-ltz v0, :cond_9

    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->h(Lcom/beizi/fusion/g/an;)D

    move-result-wide v2

    sub-double v2, v5, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    sub-double v2, v21, v2

    neg-double v2, v2

    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->g(Lcom/beizi/fusion/g/an;)D

    move-result-wide v8

    cmpg-double v0, v2, v8

    if-ltz v0, :cond_b

    :cond_9
    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->h(Lcom/beizi/fusion/g/an;)D

    move-result-wide v2

    cmpg-double v0, v5, v2

    if-gez v0, :cond_17

    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->h(Lcom/beizi/fusion/g/an;)D

    move-result-wide v2

    sub-double v2, v5, v2

    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->g(Lcom/beizi/fusion/g/an;)D

    move-result-wide v8

    cmpg-double v0, v2, v8

    if-gez v0, :cond_a

    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->h(Lcom/beizi/fusion/g/an;)D

    move-result-wide v2

    sub-double v2, v5, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    cmpg-double v0, v2, v15

    if-lez v0, :cond_b

    :cond_a
    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->h(Lcom/beizi/fusion/g/an;)D

    move-result-wide v2

    sub-double v2, v5, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    cmpl-double v0, v2, v15

    if-ltz v0, :cond_17

    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->h(Lcom/beizi/fusion/g/an;)D

    move-result-wide v2

    sub-double/2addr v5, v2

    invoke-static {v5, v6}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    sub-double v21, v21, v2

    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->g(Lcom/beizi/fusion/g/an;)D

    move-result-wide v2

    cmpg-double v0, v21, v2

    if-gez v0, :cond_17

    .line 17
    :cond_b
    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->e(Lcom/beizi/fusion/g/an;)I

    move-result v0

    if-ne v0, v7, :cond_17

    .line 18
    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    const/4 v2, 0x2

    invoke-static {v0, v2}, Lcom/beizi/fusion/g/an;->a(Lcom/beizi/fusion/g/an;I)I

    .line 19
    invoke-static {}, Lcom/beizi/fusion/g/an;->d()Ljava/lang/String;

    move-result-object v0

    const-string v2, "\u53d1\u751f\u5782\u76f4\u72b6\u6001\u56de\u6eda"

    invoke-static {v0, v2}, Lcom/beizi/fusion/g/af;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->f(Lcom/beizi/fusion/g/an;)V

    goto/16 :goto_5

    .line 21
    :cond_c
    :goto_2
    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0, v5, v6}, Lcom/beizi/fusion/g/an;->b(Lcom/beizi/fusion/g/an;D)D

    .line 22
    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0, v7}, Lcom/beizi/fusion/g/an;->b(Lcom/beizi/fusion/g/an;Z)Z

    .line 23
    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0, v2}, Lcom/beizi/fusion/g/an;->a(Lcom/beizi/fusion/g/an;Z)Z

    return-void

    .line 24
    :cond_d
    :goto_3
    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->c(Lcom/beizi/fusion/g/an;)D

    move-result-wide v3

    cmpl-double v0, v3, v12

    if-eqz v0, :cond_16

    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->b(Lcom/beizi/fusion/g/an;)Z

    move-result v0

    if-nez v0, :cond_e

    goto/16 :goto_4

    .line 25
    :cond_e
    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->c(Lcom/beizi/fusion/g/an;)D

    move-result-wide v2

    cmpl-double v0, v10, v2

    if-ltz v0, :cond_f

    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->c(Lcom/beizi/fusion/g/an;)D

    move-result-wide v2

    sub-double v2, v10, v2

    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->d(Lcom/beizi/fusion/g/an;)D

    move-result-wide v4

    cmpl-double v0, v2, v4

    if-lez v0, :cond_f

    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->c(Lcom/beizi/fusion/g/an;)D

    move-result-wide v2

    sub-double v2, v10, v2

    cmpg-double v0, v2, v15

    if-lez v0, :cond_10

    :cond_f
    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->c(Lcom/beizi/fusion/g/an;)D

    move-result-wide v2

    cmpg-double v0, v10, v2

    if-gez v0, :cond_11

    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->c(Lcom/beizi/fusion/g/an;)D

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmpl-double v0, v2, v4

    if-lez v0, :cond_11

    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->c(Lcom/beizi/fusion/g/an;)D

    move-result-wide v2

    sub-double v2, v21, v2

    add-double/2addr v2, v10

    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->d(Lcom/beizi/fusion/g/an;)D

    move-result-wide v4

    cmpl-double v0, v2, v4

    if-lez v0, :cond_11

    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->c(Lcom/beizi/fusion/g/an;)D

    move-result-wide v2

    sub-double v2, v21, v2

    add-double/2addr v2, v10

    cmpg-double v0, v2, v15

    if-gtz v0, :cond_11

    .line 26
    :cond_10
    invoke-static {}, Lcom/beizi/fusion/g/an;->d()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "11111\u53d1\u751f\u6c34\u5e73\u72b6\u6001\u6eda\u52a8 rollStatus:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v3}, Lcom/beizi/fusion/g/an;->e(Lcom/beizi/fusion/g/an;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/beizi/fusion/g/af;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0, v7}, Lcom/beizi/fusion/g/an;->a(Lcom/beizi/fusion/g/an;I)I

    .line 28
    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->f(Lcom/beizi/fusion/g/an;)V

    goto/16 :goto_5

    .line 29
    :cond_11
    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->c(Lcom/beizi/fusion/g/an;)D

    move-result-wide v2

    cmpl-double v0, v10, v2

    if-ltz v0, :cond_13

    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->c(Lcom/beizi/fusion/g/an;)D

    move-result-wide v2

    sub-double v2, v10, v2

    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->g(Lcom/beizi/fusion/g/an;)D

    move-result-wide v4

    cmpg-double v0, v2, v4

    if-gez v0, :cond_12

    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->c(Lcom/beizi/fusion/g/an;)D

    move-result-wide v2

    sub-double v2, v10, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    cmpg-double v0, v2, v15

    if-lez v0, :cond_15

    :cond_12
    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->c(Lcom/beizi/fusion/g/an;)D

    move-result-wide v2

    sub-double v2, v10, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    cmpl-double v0, v2, v15

    if-ltz v0, :cond_13

    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->c(Lcom/beizi/fusion/g/an;)D

    move-result-wide v2

    sub-double v2, v10, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    sub-double v2, v21, v2

    neg-double v2, v2

    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->g(Lcom/beizi/fusion/g/an;)D

    move-result-wide v4

    cmpg-double v0, v2, v4

    if-ltz v0, :cond_15

    :cond_13
    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->c(Lcom/beizi/fusion/g/an;)D

    move-result-wide v2

    cmpg-double v0, v10, v2

    if-gez v0, :cond_17

    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->c(Lcom/beizi/fusion/g/an;)D

    move-result-wide v2

    sub-double v2, v10, v2

    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->g(Lcom/beizi/fusion/g/an;)D

    move-result-wide v4

    cmpg-double v0, v2, v4

    if-gez v0, :cond_14

    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->c(Lcom/beizi/fusion/g/an;)D

    move-result-wide v2

    sub-double v2, v10, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    cmpg-double v0, v2, v15

    if-lez v0, :cond_15

    :cond_14
    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->c(Lcom/beizi/fusion/g/an;)D

    move-result-wide v2

    sub-double v2, v10, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    cmpl-double v0, v2, v15

    if-ltz v0, :cond_17

    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->c(Lcom/beizi/fusion/g/an;)D

    move-result-wide v2

    sub-double/2addr v10, v2

    invoke-static {v10, v11}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    sub-double v21, v21, v2

    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->g(Lcom/beizi/fusion/g/an;)D

    move-result-wide v2

    cmpg-double v0, v21, v2

    if-gez v0, :cond_17

    .line 30
    :cond_15
    invoke-static {}, Lcom/beizi/fusion/g/an;->d()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "2222\u53d1\u751f\u6c34\u5e73\u72b6\u6001\u56de\u6eda rollStatus:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v3}, Lcom/beizi/fusion/g/an;->e(Lcom/beizi/fusion/g/an;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/beizi/fusion/g/af;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->e(Lcom/beizi/fusion/g/an;)I

    move-result v0

    if-ne v0, v7, :cond_17

    .line 32
    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    const/4 v2, 0x2

    invoke-static {v0, v2}, Lcom/beizi/fusion/g/an;->a(Lcom/beizi/fusion/g/an;I)I

    .line 33
    invoke-static {}, Lcom/beizi/fusion/g/an;->d()Ljava/lang/String;

    move-result-object v0

    const-string v2, "\u53d1\u751f\u6c34\u5e73\u72b6\u6001\u56de\u6eda"

    invoke-static {v0, v2}, Lcom/beizi/fusion/g/af;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0}, Lcom/beizi/fusion/g/an;->f(Lcom/beizi/fusion/g/an;)V

    goto :goto_5

    .line 35
    :cond_16
    :goto_4
    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0, v10, v11}, Lcom/beizi/fusion/g/an;->a(Lcom/beizi/fusion/g/an;D)D

    .line 36
    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0, v7}, Lcom/beizi/fusion/g/an;->a(Lcom/beizi/fusion/g/an;Z)Z

    .line 37
    iget-object v0, v1, Lcom/beizi/fusion/g/an$1;->a:Lcom/beizi/fusion/g/an;

    invoke-static {v0, v2}, Lcom/beizi/fusion/g/an;->b(Lcom/beizi/fusion/g/an;Z)Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 38
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_17
    :goto_5
    return-void
.end method
