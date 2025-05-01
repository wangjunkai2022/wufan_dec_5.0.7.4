.class Lcom/beizi/fusion/g/ar$1;
.super Ljava/lang/Object;
.source "ShakeUtil.java"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/g/ar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/g/ar;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/g/ar;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 22

    move-object/from16 v0, p0

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-object v3, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    invoke-static {v3}, Lcom/beizi/fusion/g/ar;->a(Lcom/beizi/fusion/g/ar;)J

    move-result-wide v3

    sub-long/2addr v1, v3

    const-wide/16 v3, 0xc8

    cmp-long v5, v1, v3

    if-gez v5, :cond_0

    return-void

    :cond_0
    move-object/from16 v1, p1

    .line 2
    iget-object v1, v1, Landroid/hardware/SensorEvent;->values:[F

    const/4 v2, 0x0

    .line 3
    aget v2, v1, v2

    const/4 v9, 0x1

    .line 4
    aget v10, v1, v9

    const/4 v11, 0x2

    .line 5
    aget v1, v1, v11

    .line 6
    iget-object v3, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    invoke-static {v3}, Lcom/beizi/fusion/g/ar;->b(Lcom/beizi/fusion/g/ar;)F

    move-result v3

    const/high16 v4, -0x3d380000    # -100.0f

    cmpl-float v3, v3, v4

    if-nez v3, :cond_1

    .line 7
    iget-object v3, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    invoke-static {v3, v2}, Lcom/beizi/fusion/g/ar;->a(Lcom/beizi/fusion/g/ar;F)F

    .line 8
    :cond_1
    iget-object v3, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    invoke-static {v3}, Lcom/beizi/fusion/g/ar;->c(Lcom/beizi/fusion/g/ar;)F

    move-result v3

    cmpl-float v3, v3, v4

    if-nez v3, :cond_2

    .line 9
    iget-object v3, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    invoke-static {v3, v10}, Lcom/beizi/fusion/g/ar;->b(Lcom/beizi/fusion/g/ar;F)F

    .line 10
    :cond_2
    iget-object v3, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    invoke-static {v3}, Lcom/beizi/fusion/g/ar;->d(Lcom/beizi/fusion/g/ar;)F

    move-result v3

    cmpl-float v3, v3, v4

    if-nez v3, :cond_3

    .line 11
    iget-object v3, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    invoke-static {v3, v1}, Lcom/beizi/fusion/g/ar;->c(Lcom/beizi/fusion/g/ar;F)F

    .line 12
    :cond_3
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "x = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v4, ",initialX = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    invoke-static {v4}, Lcom/beizi/fusion/g/ar;->b(Lcom/beizi/fusion/g/ar;)F

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v4, ",y = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v4, ",initialY = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    .line 13
    invoke-static {v4}, Lcom/beizi/fusion/g/ar;->c(Lcom/beizi/fusion/g/ar;)F

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v4, ",z = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v4, ",initialZ = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    invoke-static {v4}, Lcom/beizi/fusion/g/ar;->d(Lcom/beizi/fusion/g/ar;)F

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v12, "ShakeUtil"

    .line 14
    invoke-static {v12, v3}, Lcom/beizi/fusion/g/af;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    iget-object v3, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    invoke-static {v3}, Lcom/beizi/fusion/g/ar;->b(Lcom/beizi/fusion/g/ar;)F

    move-result v3

    sub-float v3, v2, v3

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    float-to-double v3, v3

    const-wide v5, 0x402399999999999aL    # 9.8

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    div-double v14, v3, v5

    .line 16
    iget-object v3, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    invoke-static {v3}, Lcom/beizi/fusion/g/ar;->c(Lcom/beizi/fusion/g/ar;)F

    move-result v3

    sub-float v3, v10, v3

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    div-double v7, v3, v5

    .line 17
    iget-object v3, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    invoke-static {v3}, Lcom/beizi/fusion/g/ar;->d(Lcom/beizi/fusion/g/ar;)F

    move-result v3

    sub-float v3, v1, v3

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    div-double v5, v3, v5

    .line 18
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "rotateX = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14, v15}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v4, ",rotateY = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v4, ",rotateZ = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5, v6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v4, ",rotateAmplitude = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    move v13, v10

    .line 19
    invoke-static {v4}, Lcom/beizi/fusion/g/ar;->e(Lcom/beizi/fusion/g/ar;)D

    move-result-wide v9

    invoke-virtual {v3, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 20
    invoke-static {v12, v3}, Lcom/beizi/fusion/g/af;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    iget-object v3, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    invoke-static {v3}, Lcom/beizi/fusion/g/ar;->e(Lcom/beizi/fusion/g/ar;)D

    move-result-wide v3

    cmpl-double v9, v14, v3

    if-lez v9, :cond_4

    .line 22
    iget-object v3, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    invoke-static {v3}, Lcom/beizi/fusion/g/ar;->f(Lcom/beizi/fusion/g/ar;)I

    .line 23
    iget-object v3, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    invoke-static {v3, v2}, Lcom/beizi/fusion/g/ar;->a(Lcom/beizi/fusion/g/ar;F)F

    .line 24
    :cond_4
    iget-object v3, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    invoke-static {v3}, Lcom/beizi/fusion/g/ar;->e(Lcom/beizi/fusion/g/ar;)D

    move-result-wide v3

    cmpl-double v9, v7, v3

    if-lez v9, :cond_5

    .line 25
    iget-object v3, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    invoke-static {v3}, Lcom/beizi/fusion/g/ar;->f(Lcom/beizi/fusion/g/ar;)I

    .line 26
    iget-object v3, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    invoke-static {v3, v13}, Lcom/beizi/fusion/g/ar;->b(Lcom/beizi/fusion/g/ar;F)F

    .line 27
    :cond_5
    iget-object v3, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    invoke-static {v3}, Lcom/beizi/fusion/g/ar;->e(Lcom/beizi/fusion/g/ar;)D

    move-result-wide v3

    cmpl-double v9, v5, v3

    if-lez v9, :cond_6

    .line 28
    iget-object v3, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    invoke-static {v3}, Lcom/beizi/fusion/g/ar;->f(Lcom/beizi/fusion/g/ar;)I

    .line 29
    iget-object v3, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    invoke-static {v3, v1}, Lcom/beizi/fusion/g/ar;->c(Lcom/beizi/fusion/g/ar;F)F

    .line 30
    :cond_6
    iget-object v3, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    invoke-static {v3}, Lcom/beizi/fusion/g/ar;->g(Lcom/beizi/fusion/g/ar;)D

    move-result-wide v9

    move v4, v2

    move-wide/from16 v18, v5

    move v5, v13

    move v6, v1

    move-wide/from16 v16, v7

    move-wide v7, v9

    invoke-static/range {v3 .. v8}, Lcom/beizi/fusion/g/ar;->a(Lcom/beizi/fusion/g/ar;FFFD)D

    move-result-wide v9

    .line 31
    iget-object v3, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    invoke-static {v3}, Lcom/beizi/fusion/g/ar;->g(Lcom/beizi/fusion/g/ar;)D

    move-result-wide v3

    cmpl-double v5, v9, v3

    if-lez v5, :cond_7

    .line 32
    iget-object v3, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    const/4 v4, 0x1

    invoke-static {v3, v4}, Lcom/beizi/fusion/g/ar;->a(Lcom/beizi/fusion/g/ar;I)I

    .line 33
    :cond_7
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startSatisfy:"

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v3, ";mShakeState = "

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    invoke-static {v3}, Lcom/beizi/fusion/g/ar;->h(Lcom/beizi/fusion/g/ar;)I

    move-result v3

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ",isShakeStart = "

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    invoke-static {v3}, Lcom/beizi/fusion/g/ar;->g(Lcom/beizi/fusion/g/ar;)D

    move-result-wide v20

    move v4, v2

    move v5, v13

    move v6, v1

    move-object v11, v7

    move-wide/from16 v7, v20

    invoke-static/range {v3 .. v8}, Lcom/beizi/fusion/g/ar;->a(Lcom/beizi/fusion/g/ar;FFFD)D

    move-result-wide v3

    invoke-virtual {v11, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v3, ",isShakeEnd = "

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    .line 34
    invoke-static {v3}, Lcom/beizi/fusion/g/ar;->i(Lcom/beizi/fusion/g/ar;)D

    move-result-wide v7

    move v4, v2

    invoke-static/range {v3 .. v8}, Lcom/beizi/fusion/g/ar;->b(Lcom/beizi/fusion/g/ar;FFFD)Z

    move-result v3

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 35
    invoke-static {v12, v3}, Lcom/beizi/fusion/g/af;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    iget-object v3, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    invoke-static {v3}, Lcom/beizi/fusion/g/ar;->h(Lcom/beizi/fusion/g/ar;)I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_8

    iget-object v3, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    invoke-static {v3}, Lcom/beizi/fusion/g/ar;->i(Lcom/beizi/fusion/g/ar;)D

    move-result-wide v7

    move v4, v2

    move v5, v13

    move v6, v1

    invoke-static/range {v3 .. v8}, Lcom/beizi/fusion/g/ar;->b(Lcom/beizi/fusion/g/ar;FFFD)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 37
    iget-object v1, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    const/4 v2, 0x2

    invoke-static {v1, v2}, Lcom/beizi/fusion/g/ar;->a(Lcom/beizi/fusion/g/ar;I)I

    .line 38
    iget-object v1, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    invoke-static {v1}, Lcom/beizi/fusion/g/ar;->j(Lcom/beizi/fusion/g/ar;)I

    .line 39
    :cond_8
    iget-object v13, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    move-wide/from16 v20, v9

    invoke-static/range {v13 .. v21}, Lcom/beizi/fusion/g/ar;->a(Lcom/beizi/fusion/g/ar;DDDD)V

    .line 40
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mShakeCount = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    invoke-static {v2}, Lcom/beizi/fusion/g/ar;->k(Lcom/beizi/fusion/g/ar;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",dstShakeCount = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    invoke-static {v2}, Lcom/beizi/fusion/g/ar;->l(Lcom/beizi/fusion/g/ar;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",mRotateCount = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    .line 41
    invoke-static {v2}, Lcom/beizi/fusion/g/ar;->m(Lcom/beizi/fusion/g/ar;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",dstRotateCount = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    invoke-static {v2}, Lcom/beizi/fusion/g/ar;->n(Lcom/beizi/fusion/g/ar;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 42
    invoke-static {v12, v1}, Lcom/beizi/fusion/g/af;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    iget-object v1, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    invoke-static {v1}, Lcom/beizi/fusion/g/ar;->l(Lcom/beizi/fusion/g/ar;)I

    move-result v1

    if-lez v1, :cond_9

    iget-object v1, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    invoke-static {v1}, Lcom/beizi/fusion/g/ar;->k(Lcom/beizi/fusion/g/ar;)I

    move-result v1

    iget-object v2, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    invoke-static {v2}, Lcom/beizi/fusion/g/ar;->l(Lcom/beizi/fusion/g/ar;)I

    move-result v2

    if-ge v1, v2, :cond_a

    :cond_9
    iget-object v1, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    invoke-static {v1}, Lcom/beizi/fusion/g/ar;->n(Lcom/beizi/fusion/g/ar;)I

    move-result v1

    if-lez v1, :cond_b

    iget-object v1, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    invoke-static {v1}, Lcom/beizi/fusion/g/ar;->m(Lcom/beizi/fusion/g/ar;)I

    move-result v1

    iget-object v2, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    invoke-static {v2}, Lcom/beizi/fusion/g/ar;->n(Lcom/beizi/fusion/g/ar;)I

    move-result v2

    if-lt v1, v2, :cond_b

    .line 44
    :cond_a
    iget-object v1, v0, Lcom/beizi/fusion/g/ar$1;->a:Lcom/beizi/fusion/g/ar;

    invoke-virtual {v1}, Lcom/beizi/fusion/g/ar;->a()V

    :cond_b
    return-void
.end method
