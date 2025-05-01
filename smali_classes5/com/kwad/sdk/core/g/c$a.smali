.class final Lcom/kwad/sdk/core/g/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/sdk/core/g/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic aBx:Lcom/kwad/sdk/core/g/c;


# direct methods
.method private constructor <init>(Lcom/kwad/sdk/core/g/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/core/g/c$a;->aBx:Lcom/kwad/sdk/core/g/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/kwad/sdk/core/g/c;B)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/kwad/sdk/core/g/c$a;-><init>(Lcom/kwad/sdk/core/g/c;)V

    return-void
.end method


# virtual methods
.method public final onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    return-void
.end method

.method public final onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 13

    .line 1
    iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F

    const/4 v1, 0x0

    aget v2, v0, v1

    const/4 v3, 0x1

    .line 2
    aget v4, v0, v3

    const/4 v5, 0x2

    .line 3
    aget v0, v0, v5

    .line 4
    iget-object v6, p0, Lcom/kwad/sdk/core/g/c$a;->aBx:Lcom/kwad/sdk/core/g/c;

    invoke-static {v6}, Lcom/kwad/sdk/core/g/c;->b(Lcom/kwad/sdk/core/g/c;)J

    move-result-wide v6

    const-wide/16 v8, 0x0

    cmp-long v10, v6, v8

    if-eqz v10, :cond_0

    .line 5
    iget-wide v6, p1, Landroid/hardware/SensorEvent;->timestamp:J

    iget-object v8, p0, Lcom/kwad/sdk/core/g/c$a;->aBx:Lcom/kwad/sdk/core/g/c;

    invoke-static {v8}, Lcom/kwad/sdk/core/g/c;->b(Lcom/kwad/sdk/core/g/c;)J

    move-result-wide v8

    sub-long/2addr v6, v8

    long-to-double v6, v6

    iget-object v8, p0, Lcom/kwad/sdk/core/g/c$a;->aBx:Lcom/kwad/sdk/core/g/c;

    invoke-static {v8}, Lcom/kwad/sdk/core/g/c;->c(Lcom/kwad/sdk/core/g/c;)D

    move-result-wide v8

    invoke-static {v6, v7}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v6, v6, v8

    .line 6
    iget-object v8, p0, Lcom/kwad/sdk/core/g/c$a;->aBx:Lcom/kwad/sdk/core/g/c;

    invoke-static {v8}, Lcom/kwad/sdk/core/g/c;->d(Lcom/kwad/sdk/core/g/c;)[D

    move-result-object v8

    aget-wide v9, v8, v1

    float-to-double v11, v2

    invoke-static {v11, v12}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v11, v11, v6

    invoke-static {v11, v12}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v11

    add-double/2addr v9, v11

    aput-wide v9, v8, v1

    .line 7
    iget-object v1, p0, Lcom/kwad/sdk/core/g/c$a;->aBx:Lcom/kwad/sdk/core/g/c;

    invoke-static {v1}, Lcom/kwad/sdk/core/g/c;->d(Lcom/kwad/sdk/core/g/c;)[D

    move-result-object v1

    aget-wide v8, v1, v3

    float-to-double v10, v4

    invoke-static {v10, v11}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v10, v10, v6

    invoke-static {v10, v11}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v10

    add-double/2addr v8, v10

    aput-wide v8, v1, v3

    .line 8
    iget-object v1, p0, Lcom/kwad/sdk/core/g/c$a;->aBx:Lcom/kwad/sdk/core/g/c;

    invoke-static {v1}, Lcom/kwad/sdk/core/g/c;->d(Lcom/kwad/sdk/core/g/c;)[D

    move-result-object v1

    aget-wide v2, v1, v5

    float-to-double v8, v0

    invoke-static {v8, v9}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v8, v8, v6

    invoke-static {v8, v9}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v6

    add-double/2addr v2, v6

    aput-wide v2, v1, v5

    .line 9
    iget-object v0, p0, Lcom/kwad/sdk/core/g/c$a;->aBx:Lcom/kwad/sdk/core/g/c;

    invoke-static {v0}, Lcom/kwad/sdk/core/g/c;->e(Lcom/kwad/sdk/core/g/c;)V

    .line 10
    iget-object v0, p0, Lcom/kwad/sdk/core/g/c$a;->aBx:Lcom/kwad/sdk/core/g/c;

    invoke-static {v0}, Lcom/kwad/sdk/core/g/c;->f(Lcom/kwad/sdk/core/g/c;)V

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/kwad/sdk/core/g/c$a;->aBx:Lcom/kwad/sdk/core/g/c;

    iget-wide v1, p1, Landroid/hardware/SensorEvent;->timestamp:J

    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/core/g/c;->a(Lcom/kwad/sdk/core/g/c;J)J

    return-void
.end method
