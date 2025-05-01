.class public Lcom/join/mgps/shake/a;
.super Ljava/lang/Object;
.source "ShakeListener.java"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/shake/a$a;
    }
.end annotation


# static fields
.field private static final o:I = 0xbb8

.field private static final p:I = 0x46

.field private static final q:I = 0x0

.field private static final r:I = 0x1

.field private static final s:I = 0x2


# instance fields
.field private b:Landroid/hardware/SensorManager;

.field private c:Landroid/hardware/Sensor;

.field private d:Landroid/hardware/Sensor;

.field private e:Lcom/join/mgps/shake/a$a;

.field private f:Landroid/content/Context;

.field private g:J

.field h:[F

.field i:[F

.field j:[F

.field k:[F

.field private l:I

.field private m:I

.field n:Lcom/join/mgps/dto/FirstScreenAdInteractionBean$ShakeConfBean;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    new-array v1, v0, [F

    .line 2
    iput-object v1, p0, Lcom/join/mgps/shake/a;->h:[F

    const/16 v1, 0x9

    new-array v1, v1, [F

    .line 3
    iput-object v1, p0, Lcom/join/mgps/shake/a;->i:[F

    new-array v1, v0, [F

    .line 4
    iput-object v1, p0, Lcom/join/mgps/shake/a;->j:[F

    new-array v0, v0, [F

    .line 5
    iput-object v0, p0, Lcom/join/mgps/shake/a;->k:[F

    .line 6
    iput-object p1, p0, Lcom/join/mgps/shake/a;->f:Landroid/content/Context;

    .line 7
    invoke-virtual {p0}, Lcom/join/mgps/shake/a;->d()V

    return-void
.end method


# virtual methods
.method public a()[D
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/join/mgps/shake/a;->i:[F

    iget-object v1, p0, Lcom/join/mgps/shake/a;->h:[F

    iget-object v2, p0, Lcom/join/mgps/shake/a;->j:[F

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Landroid/hardware/SensorManager;->getRotationMatrix([F[F[F[F)Z

    move-result v0

    const/4 v1, 0x3

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/shake/a;->i:[F

    iget-object v2, p0, Lcom/join/mgps/shake/a;->k:[F

    invoke-static {v0, v2}, Landroid/hardware/SensorManager;->getOrientation([F[F)[F

    .line 3
    iget-object v0, p0, Lcom/join/mgps/shake/a;->k:[F

    const/4 v2, 0x0

    aget v0, v0, v2

    float-to-double v3, v0

    invoke-static {v3, v4}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v3

    .line 4
    iget-object v0, p0, Lcom/join/mgps/shake/a;->k:[F

    const/4 v5, 0x1

    aget v0, v0, v5

    float-to-double v6, v0

    invoke-static {v6, v7}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v6

    .line 5
    iget-object v0, p0, Lcom/join/mgps/shake/a;->k:[F

    const/4 v8, 0x2

    aget v0, v0, v8

    float-to-double v9, v0

    invoke-static {v9, v10}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v9

    new-array v0, v1, [D

    aput-wide v6, v0, v2

    aput-wide v9, v0, v5

    aput-wide v3, v0, v8

    return-object v0

    :cond_0
    new-array v0, v1, [D

    .line 6
    fill-array-data v0, :array_0

    return-object v0

    :array_0
    .array-data 8
        0x0
        0x0
        0x0
    .end array-data
.end method

.method public b(Lcom/join/mgps/shake/a$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/shake/a;->e:Lcom/join/mgps/shake/a$a;

    return-void
.end method

.method public c(Lcom/join/mgps/dto/FirstScreenAdInteractionBean$ShakeConfBean;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/join/mgps/shake/a;->n:Lcom/join/mgps/dto/FirstScreenAdInteractionBean$ShakeConfBean;

    if-eqz p1, :cond_1

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/FirstScreenAdInteractionBean$ShakeConfBean;->getAcceleration()I

    move-result v0

    iput v0, p0, Lcom/join/mgps/shake/a;->l:I

    const/4 v1, 0x5

    if-ge v0, v1, :cond_0

    const/16 v0, 0xf

    .line 3
    iput v0, p0, Lcom/join/mgps/shake/a;->l:I

    .line 4
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/FirstScreenAdInteractionBean$ShakeConfBean;->getRotation_angle()I

    move-result p1

    iput p1, p0, Lcom/join/mgps/shake/a;->m:I

    :cond_1
    return-void
.end method

.method public d()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/shake/a;->f:Landroid/content/Context;

    const-string v1, "sensor"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/SensorManager;

    iput-object v0, p0, Lcom/join/mgps/shake/a;->b:Landroid/hardware/SensorManager;

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    const/16 v2, 0xa

    .line 2
    invoke-virtual {v0, v2}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/shake/a;->c:Landroid/hardware/Sensor;

    .line 3
    iget-object v0, p0, Lcom/join/mgps/shake/a;->b:Landroid/hardware/SensorManager;

    invoke-virtual {v0, v1}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/shake/a;->d:Landroid/hardware/Sensor;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/shake/a;->c:Landroid/hardware/Sensor;

    if-eqz v0, :cond_1

    .line 5
    iget-object v2, p0, Lcom/join/mgps/shake/a;->b:Landroid/hardware/SensorManager;

    invoke-virtual {v2, p0, v0, v1}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/shake/a;->d:Landroid/hardware/Sensor;

    if-eqz v0, :cond_2

    .line 7
    iget-object v2, p0, Lcom/join/mgps/shake/a;->b:Landroid/hardware/SensorManager;

    invoke-virtual {v2, p0, v0, v1}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    :cond_2
    return-void
.end method

.method public e()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/shake/a;->b:Landroid/hardware/SensorManager;

    invoke-virtual {v0, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    return-void
.end method

.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 10

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 2
    iget-wide v2, p0, Lcom/join/mgps/shake/a;->g:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0x46

    cmp-long v6, v2, v4

    if-gez v6, :cond_0

    return-void

    .line 3
    :cond_0
    iput-wide v0, p0, Lcom/join/mgps/shake/a;->g:J

    .line 4
    iget-object v0, p1, Landroid/hardware/SensorEvent;->sensor:Landroid/hardware/Sensor;

    invoke-virtual {v0}, Landroid/hardware/Sensor;->getType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 5
    iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F

    iput-object v0, p0, Lcom/join/mgps/shake/a;->j:[F

    .line 6
    :cond_1
    iget-object v0, p1, Landroid/hardware/SensorEvent;->sensor:Landroid/hardware/Sensor;

    invoke-virtual {v0}, Landroid/hardware/Sensor;->getType()I

    move-result v0

    const/16 v2, 0xa

    if-ne v0, v2, :cond_3

    .line 7
    iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F

    iput-object v0, p0, Lcom/join/mgps/shake/a;->h:[F

    .line 8
    invoke-virtual {p0}, Lcom/join/mgps/shake/a;->a()[D

    move-result-object v0

    const/4 v2, 0x0

    .line 9
    aget-wide v3, v0, v2

    const/4 v5, 0x1

    .line 10
    aget-wide v6, v0, v5

    .line 11
    aget-wide v8, v0, v1

    .line 12
    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    .line 13
    aget v0, p1, v2

    .line 14
    aget v2, p1, v5

    .line 15
    aget p1, p1, v1

    mul-float v0, v0, v0

    mul-float v2, v2, v2

    add-float/2addr v0, v2

    mul-float p1, p1, p1

    add-float/2addr v0, p1

    float-to-double v0, v0

    .line 16
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    .line 17
    iget p1, p0, Lcom/join/mgps/shake/a;->l:I

    int-to-double v8, p1

    cmpl-double p1, v0, v8

    if-ltz p1, :cond_3

    invoke-static {v3, v4}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    iget p1, p0, Lcom/join/mgps/shake/a;->m:I

    int-to-double v2, p1

    cmpl-double p1, v0, v2

    if-gez p1, :cond_2

    invoke-static {v6, v7}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    iget p1, p0, Lcom/join/mgps/shake/a;->m:I

    int-to-double v2, p1

    cmpl-double p1, v0, v2

    if-ltz p1, :cond_3

    .line 18
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/shake/a;->e:Lcom/join/mgps/shake/a$a;

    invoke-interface {p1}, Lcom/join/mgps/shake/a$a;->a()V

    :cond_3
    return-void
.end method
