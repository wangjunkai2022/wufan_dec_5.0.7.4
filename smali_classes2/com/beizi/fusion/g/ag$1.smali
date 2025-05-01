.class Lcom/beizi/fusion/g/ag$1;
.super Ljava/lang/Object;
.source "NativeShakeUtil.java"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/g/ag;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/g/ag;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/g/ag;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 17

    move-object/from16 v0, p0

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-object v3, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v3}, Lcom/beizi/fusion/g/ag;->a(Lcom/beizi/fusion/g/ag;)J

    move-result-wide v3

    sub-long/2addr v1, v3

    const-wide/16 v3, 0xc8

    cmp-long v5, v1, v3

    if-gez v5, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v1, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v1}, Lcom/beizi/fusion/g/ag;->b(Lcom/beizi/fusion/g/ag;)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Lcom/beizi/fusion/g/ax;->a(Landroid/view/View;)Z

    move-result v1

    const-string v2, "ShakeUtil"

    if-nez v1, :cond_1

    const-string v1, "onShakeHappened mContainerView is not show"

    .line 3
    invoke-static {v2, v1}, Lcom/beizi/fusion/g/af;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v1, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-virtual {v1}, Lcom/beizi/fusion/g/ag;->d()V

    return-void

    .line 5
    :cond_1
    iget-object v1, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v1}, Lcom/beizi/fusion/g/ag;->c(Lcom/beizi/fusion/g/ag;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v1}, Lcom/beizi/fusion/g/ag;->d(Lcom/beizi/fusion/g/ag;)Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v1}, Lcom/beizi/fusion/g/ag;->e(Lcom/beizi/fusion/g/ag;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-static {}, Lcom/beizi/fusion/g/aq;->a()Lcom/beizi/fusion/g/aq;

    move-result-object v1

    iget-object v3, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v3}, Lcom/beizi/fusion/g/ag;->e(Lcom/beizi/fusion/g/ag;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/beizi/fusion/g/aq;->b(Ljava/lang/String;)J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v1, v3, v5

    if-lez v1, :cond_2

    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mShakeCount isUserSensitiveScheme:"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v3}, Lcom/beizi/fusion/g/ag;->c(Lcom/beizi/fusion/g/ag;)Z

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, ";coolShakeViewBean:"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v3}, Lcom/beizi/fusion/g/ag;->d(Lcom/beizi/fusion/g/ag;)Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ";coolConfigKey:"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v3}, Lcom/beizi/fusion/g/ag;->e(Lcom/beizi/fusion/g/ag;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ";getCoolTime:"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/beizi/fusion/g/aq;->a()Lcom/beizi/fusion/g/aq;

    move-result-object v3

    iget-object v4, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v4}, Lcom/beizi/fusion/g/ag;->e(Lcom/beizi/fusion/g/ag;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/beizi/fusion/g/aq;->b(Ljava/lang/String;)J

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/beizi/fusion/g/af;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    iget-object v1, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v1}, Lcom/beizi/fusion/g/ag;->d(Lcom/beizi/fusion/g/ag;)Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/beizi/fusion/g/ag;->a(Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;)V

    :cond_2
    move-object/from16 v1, p1

    .line 8
    iget-object v1, v1, Landroid/hardware/SensorEvent;->values:[F

    const/4 v3, 0x0

    .line 9
    aget v3, v1, v3

    const/4 v10, 0x1

    .line 10
    aget v11, v1, v10

    const/4 v12, 0x2

    .line 11
    aget v1, v1, v12

    .line 12
    iget-object v4, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v4}, Lcom/beizi/fusion/g/ag;->f(Lcom/beizi/fusion/g/ag;)F

    move-result v4

    const/high16 v5, -0x3d380000    # -100.0f

    cmpl-float v4, v4, v5

    if-nez v4, :cond_3

    .line 13
    iget-object v4, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v4, v3}, Lcom/beizi/fusion/g/ag;->a(Lcom/beizi/fusion/g/ag;F)F

    .line 14
    :cond_3
    iget-object v4, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v4}, Lcom/beizi/fusion/g/ag;->g(Lcom/beizi/fusion/g/ag;)F

    move-result v4

    cmpl-float v4, v4, v5

    if-nez v4, :cond_4

    .line 15
    iget-object v4, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v4, v11}, Lcom/beizi/fusion/g/ag;->b(Lcom/beizi/fusion/g/ag;F)F

    .line 16
    :cond_4
    iget-object v4, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v4}, Lcom/beizi/fusion/g/ag;->h(Lcom/beizi/fusion/g/ag;)F

    move-result v4

    cmpl-float v4, v4, v5

    if-nez v4, :cond_5

    .line 17
    iget-object v4, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v4, v1}, Lcom/beizi/fusion/g/ag;->c(Lcom/beizi/fusion/g/ag;F)F

    .line 18
    :cond_5
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "x = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v5, ",initialX = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v5}, Lcom/beizi/fusion/g/ag;->f(Lcom/beizi/fusion/g/ag;)F

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v5, ",y = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v5, ",initialY = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    .line 19
    invoke-static {v5}, Lcom/beizi/fusion/g/ag;->g(Lcom/beizi/fusion/g/ag;)F

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v5, ",z = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v5, ",initialZ = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v5}, Lcom/beizi/fusion/g/ag;->h(Lcom/beizi/fusion/g/ag;)F

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 20
    invoke-static {v2, v4}, Lcom/beizi/fusion/g/af;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    iget-object v4, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v4}, Lcom/beizi/fusion/g/ag;->f(Lcom/beizi/fusion/g/ag;)F

    move-result v4

    sub-float v4, v3, v4

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    float-to-double v4, v4

    const-wide v6, 0x402399999999999aL    # 9.8

    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v4, v6

    .line 22
    iget-object v8, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v8}, Lcom/beizi/fusion/g/ag;->g(Lcom/beizi/fusion/g/ag;)F

    move-result v8

    sub-float v8, v11, v8

    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    move-result v8

    float-to-double v8, v8

    invoke-static {v8, v9}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v8, v6

    .line 23
    iget-object v13, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v13}, Lcom/beizi/fusion/g/ag;->h(Lcom/beizi/fusion/g/ag;)F

    move-result v13

    sub-float v13, v1, v13

    invoke-static {v13}, Ljava/lang/Math;->abs(F)F

    move-result v13

    float-to-double v13, v13

    invoke-static {v13, v14}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v13, v6

    .line 24
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "rotateX = "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v7, ",rotateY = "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v7, ",rotateZ = "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v13, v14}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v7, ",rotateAmplitude = "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    move-wide v15, v13

    .line 25
    invoke-static {v7}, Lcom/beizi/fusion/g/ag;->i(Lcom/beizi/fusion/g/ag;)D

    move-result-wide v12

    invoke-virtual {v6, v12, v13}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 26
    invoke-static {v2, v6}, Lcom/beizi/fusion/g/af;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    iget-object v6, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v6}, Lcom/beizi/fusion/g/ag;->i(Lcom/beizi/fusion/g/ag;)D

    move-result-wide v6

    cmpl-double v12, v4, v6

    if-lez v12, :cond_6

    .line 28
    iget-object v4, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v4}, Lcom/beizi/fusion/g/ag;->j(Lcom/beizi/fusion/g/ag;)I

    .line 29
    iget-object v4, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v4, v3}, Lcom/beizi/fusion/g/ag;->a(Lcom/beizi/fusion/g/ag;F)F

    .line 30
    :cond_6
    iget-object v4, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v4}, Lcom/beizi/fusion/g/ag;->i(Lcom/beizi/fusion/g/ag;)D

    move-result-wide v4

    cmpl-double v6, v8, v4

    if-lez v6, :cond_7

    .line 31
    iget-object v4, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v4}, Lcom/beizi/fusion/g/ag;->j(Lcom/beizi/fusion/g/ag;)I

    .line 32
    iget-object v4, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v4, v11}, Lcom/beizi/fusion/g/ag;->b(Lcom/beizi/fusion/g/ag;F)F

    .line 33
    :cond_7
    iget-object v4, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v4}, Lcom/beizi/fusion/g/ag;->i(Lcom/beizi/fusion/g/ag;)D

    move-result-wide v4

    cmpl-double v6, v15, v4

    if-lez v6, :cond_8

    .line 34
    iget-object v4, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v4}, Lcom/beizi/fusion/g/ag;->j(Lcom/beizi/fusion/g/ag;)I

    .line 35
    iget-object v4, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v4, v1}, Lcom/beizi/fusion/g/ag;->c(Lcom/beizi/fusion/g/ag;F)F

    .line 36
    :cond_8
    iget-object v4, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v4}, Lcom/beizi/fusion/g/ag;->k(Lcom/beizi/fusion/g/ag;)D

    move-result-wide v8

    move v5, v3

    move v6, v11

    move v7, v1

    invoke-static/range {v4 .. v9}, Lcom/beizi/fusion/g/ag;->a(Lcom/beizi/fusion/g/ag;FFFD)Z

    move-result v4

    if-eqz v4, :cond_9

    .line 37
    iget-object v4, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v4, v10}, Lcom/beizi/fusion/g/ag;->a(Lcom/beizi/fusion/g/ag;I)I

    .line 38
    :cond_9
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "mRotateCount:"

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v4}, Lcom/beizi/fusion/g/ag;->l(Lcom/beizi/fusion/g/ag;)I

    move-result v4

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ";mShakeCount:"

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v4}, Lcom/beizi/fusion/g/ag;->m(Lcom/beizi/fusion/g/ag;)I

    move-result v4

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ",mShakeState = "

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v4}, Lcom/beizi/fusion/g/ag;->n(Lcom/beizi/fusion/g/ag;)I

    move-result v4

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ",isShakeStart = "

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v4}, Lcom/beizi/fusion/g/ag;->k(Lcom/beizi/fusion/g/ag;)D

    move-result-wide v8

    move v5, v3

    move v6, v11

    move v7, v1

    invoke-static/range {v4 .. v9}, Lcom/beizi/fusion/g/ag;->a(Lcom/beizi/fusion/g/ag;FFFD)Z

    move-result v4

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v4, ",isShakeEnd = "

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    .line 39
    invoke-static {v4}, Lcom/beizi/fusion/g/ag;->o(Lcom/beizi/fusion/g/ag;)D

    move-result-wide v8

    invoke-static/range {v4 .. v9}, Lcom/beizi/fusion/g/ag;->b(Lcom/beizi/fusion/g/ag;FFFD)Z

    move-result v4

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 40
    invoke-static {v2, v4}, Lcom/beizi/fusion/g/af;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    iget-object v4, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v4}, Lcom/beizi/fusion/g/ag;->n(Lcom/beizi/fusion/g/ag;)I

    move-result v4

    if-ne v4, v10, :cond_a

    iget-object v4, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v4}, Lcom/beizi/fusion/g/ag;->o(Lcom/beizi/fusion/g/ag;)D

    move-result-wide v8

    move v5, v3

    move v6, v11

    move v7, v1

    invoke-static/range {v4 .. v9}, Lcom/beizi/fusion/g/ag;->b(Lcom/beizi/fusion/g/ag;FFFD)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 42
    iget-object v1, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    const/4 v3, 0x2

    invoke-static {v1, v3}, Lcom/beizi/fusion/g/ag;->a(Lcom/beizi/fusion/g/ag;I)I

    .line 43
    iget-object v1, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v1}, Lcom/beizi/fusion/g/ag;->p(Lcom/beizi/fusion/g/ag;)I

    .line 44
    :cond_a
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mShakeCount = "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v3}, Lcom/beizi/fusion/g/ag;->m(Lcom/beizi/fusion/g/ag;)I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ",dstShakeCount = "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v3}, Lcom/beizi/fusion/g/ag;->q(Lcom/beizi/fusion/g/ag;)I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ",mRotateCount = "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    .line 45
    invoke-static {v3}, Lcom/beizi/fusion/g/ag;->l(Lcom/beizi/fusion/g/ag;)I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ",dstRotateCount = "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v3}, Lcom/beizi/fusion/g/ag;->r(Lcom/beizi/fusion/g/ag;)I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 46
    invoke-static {v2, v1}, Lcom/beizi/fusion/g/af;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    iget-object v1, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v1}, Lcom/beizi/fusion/g/ag;->q(Lcom/beizi/fusion/g/ag;)I

    move-result v1

    if-lez v1, :cond_b

    iget-object v1, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v1}, Lcom/beizi/fusion/g/ag;->m(Lcom/beizi/fusion/g/ag;)I

    move-result v1

    iget-object v2, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v2}, Lcom/beizi/fusion/g/ag;->q(Lcom/beizi/fusion/g/ag;)I

    move-result v2

    if-ge v1, v2, :cond_c

    :cond_b
    iget-object v1, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v1}, Lcom/beizi/fusion/g/ag;->r(Lcom/beizi/fusion/g/ag;)I

    move-result v1

    if-lez v1, :cond_d

    iget-object v1, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v1}, Lcom/beizi/fusion/g/ag;->l(Lcom/beizi/fusion/g/ag;)I

    move-result v1

    iget-object v2, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {v2}, Lcom/beizi/fusion/g/ag;->r(Lcom/beizi/fusion/g/ag;)I

    move-result v2

    if-lt v1, v2, :cond_d

    .line 48
    :cond_c
    iget-object v1, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-virtual {v1}, Lcom/beizi/fusion/g/ag;->a()V

    .line 49
    :cond_d
    iget-object v1, v0, Lcom/beizi/fusion/g/ag$1;->a:Lcom/beizi/fusion/g/ag;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lcom/beizi/fusion/g/ag;->a(Lcom/beizi/fusion/g/ag;J)J

    return-void
.end method
