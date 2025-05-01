.class final Lcom/kwad/sdk/core/g/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/sdk/core/g/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic aBD:Lcom/kwad/sdk/core/g/d;

.field private final aBE:[F

.field private aBF:Z

.field private final aBG:[F

.field private axO:Ljava/util/Random;


# direct methods
.method public constructor <init>(Lcom/kwad/sdk/core/g/d;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/core/g/d$a;->aBD:Lcom/kwad/sdk/core/g/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x3

    new-array v0, p1, [F

    .line 2
    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/kwad/sdk/core/g/d$a;->aBE:[F

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/kwad/sdk/core/g/d$a;->aBF:Z

    new-array p1, p1, [F

    .line 4
    fill-array-data p1, :array_1

    iput-object p1, p0, Lcom/kwad/sdk/core/g/d$a;->aBG:[F

    .line 5
    const-class p1, Lcom/kwad/sdk/components/DevelopMangerComponents;

    .line 6
    invoke-static {p1}, Lcom/kwad/sdk/components/c;->f(Ljava/lang/Class;)Lcom/kwad/sdk/components/a;

    move-result-object p1

    check-cast p1, Lcom/kwad/sdk/components/DevelopMangerComponents;

    if-eqz p1, :cond_0

    .line 7
    iput-boolean v0, p0, Lcom/kwad/sdk/core/g/d$a;->aBF:Z

    :cond_0
    return-void

    :array_0
    .array-data 4
        0x0
        0x0
        0x411ccccd    # 9.8f
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x0
        0x0
    .end array-data
.end method

.method private Gh()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/g/d$a;->axO:Ljava/util/Random;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/g/d$a;->axO:Ljava/util/Random;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/sdk/core/g/d$a;->axO:Ljava/util/Random;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 4
    iget-object v0, p0, Lcom/kwad/sdk/core/g/d$a;->aBE:[F

    invoke-direct {p0, v0}, Lcom/kwad/sdk/core/g/d$a;->a([F)V

    :cond_1
    return-void
.end method

.method private a([F)V
    .locals 5

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/sdk/core/g/d$a;->c([F)V

    const/4 v0, 0x0

    .line 2
    aget v1, p1, v0

    const/4 v2, 0x1

    .line 3
    aget v2, p1, v2

    const/4 v3, 0x2

    .line 4
    aget v3, p1, v3

    mul-float v1, v1, v1

    mul-float v2, v2, v2

    add-float/2addr v1, v2

    mul-float v3, v3, v3

    add-float/2addr v1, v3

    float-to-double v1, v1

    .line 5
    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Math;->abs(D)D

    move-result-wide v1

    .line 6
    invoke-static {p1}, Lcom/kwad/sdk/core/g/d$a;->b([F)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 7
    invoke-static {}, Lcom/kwad/sdk/core/g/d;->Gf()F

    move-result p1

    float-to-double v3, p1

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    sub-double/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->abs(D)D

    move-result-wide v1

    .line 8
    :cond_0
    iget-object p1, p0, Lcom/kwad/sdk/core/g/d$a;->aBD:Lcom/kwad/sdk/core/g/d;

    invoke-static {p1}, Lcom/kwad/sdk/core/g/d;->b(Lcom/kwad/sdk/core/g/d;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/kwad/sdk/core/g/d$a;->aBD:Lcom/kwad/sdk/core/g/d;

    .line 9
    invoke-static {p1}, Lcom/kwad/sdk/core/g/d;->c(Lcom/kwad/sdk/core/g/d;)F

    move-result p1

    float-to-double v3, p1

    cmpl-double p1, v1, v3

    if-ltz p1, :cond_1

    iget-object p1, p0, Lcom/kwad/sdk/core/g/d$a;->aBD:Lcom/kwad/sdk/core/g/d;

    .line 10
    invoke-static {p1}, Lcom/kwad/sdk/core/g/d;->a(Lcom/kwad/sdk/core/g/d;)Lcom/kwad/sdk/core/g/b;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 11
    iget-object p1, p0, Lcom/kwad/sdk/core/g/d$a;->aBD:Lcom/kwad/sdk/core/g/d;

    invoke-static {p1, v0}, Lcom/kwad/sdk/core/g/d;->a(Lcom/kwad/sdk/core/g/d;Z)Z

    .line 12
    iget-object p1, p0, Lcom/kwad/sdk/core/g/d$a;->aBD:Lcom/kwad/sdk/core/g/d;

    invoke-static {p1}, Lcom/kwad/sdk/core/g/d;->a(Lcom/kwad/sdk/core/g/d;)Lcom/kwad/sdk/core/g/b;

    move-result-object p1

    invoke-interface {p1, v1, v2}, Lcom/kwad/sdk/core/g/b;->a(D)V

    :cond_1
    return-void
.end method

.method private static b([F)Z
    .locals 7

    const/4 v0, 0x0

    .line 1
    aget v1, p0, v0

    aget v2, p0, v0

    mul-float v1, v1, v2

    const/4 v2, 0x1

    aget v3, p0, v2

    aget v4, p0, v2

    mul-float v3, v3, v4

    add-float/2addr v1, v3

    const/4 v3, 0x2

    aget v4, p0, v3

    aget p0, p0, v3

    mul-float v4, v4, p0

    add-float/2addr v1, v4

    float-to-double v3, v1

    .line 2
    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Math;->abs(D)D

    move-result-wide v3

    .line 3
    invoke-static {}, Lcom/kwad/sdk/core/g/d;->Gf()F

    move-result p0

    float-to-double v5, p0

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    sub-double/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Math;->abs(D)D

    move-result-wide v3

    invoke-static {}, Lcom/kwad/sdk/core/g/d;->Gg()D

    move-result-wide v5

    cmpg-double p0, v3, v5

    if-gtz p0, :cond_0

    return v2

    :cond_0
    return v0
.end method

.method private c([F)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/g/d$a;->aBG:[F

    const/4 v1, 0x0

    aget v2, v0, v1

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x1

    cmpl-float v2, v2, v4

    if-nez v2, :cond_0

    aget v2, v0, v6

    cmpl-float v2, v2, v4

    if-nez v2, :cond_0

    aget v2, v0, v5

    cmpl-float v2, v2, v4

    if-nez v2, :cond_0

    const/high16 v2, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    const v2, 0x3f19999a    # 0.6f

    .line 2
    :goto_0
    aget v4, p1, v1

    mul-float v4, v4, v2

    sub-float/2addr v3, v2

    aget v7, v0, v1

    mul-float v7, v7, v3

    add-float/2addr v4, v7

    aput v4, p1, v1

    .line 3
    aget v4, p1, v6

    mul-float v4, v4, v2

    aget v7, v0, v6

    mul-float v7, v7, v3

    add-float/2addr v4, v7

    aput v4, p1, v6

    .line 4
    aget v4, p1, v5

    mul-float v2, v2, v4

    aget v4, v0, v5

    mul-float v3, v3, v4

    add-float/2addr v2, v3

    aput v2, p1, v5

    const/4 v2, 0x3

    .line 5
    invoke-static {p1, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method


# virtual methods
.method public final onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    return-void
.end method

.method public final onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 0

    .line 1
    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    invoke-direct {p0, p1}, Lcom/kwad/sdk/core/g/d$a;->a([F)V

    .line 2
    iget-boolean p1, p0, Lcom/kwad/sdk/core/g/d$a;->aBF:Z

    if-eqz p1, :cond_0

    .line 3
    invoke-direct {p0}, Lcom/kwad/sdk/core/g/d$a;->Gh()V

    :cond_0
    return-void
.end method
