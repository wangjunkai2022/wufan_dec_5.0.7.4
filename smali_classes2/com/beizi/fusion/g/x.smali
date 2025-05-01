.class public Lcom/beizi/fusion/g/x;
.super Ljava/lang/Object;
.source "EulerAngleUtil.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/fusion/g/x$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;

.field private static k:Landroid/hardware/SensorManager;


# instance fields
.field private b:Landroid/content/Context;

.field private c:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;

.field private d:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;

.field private e:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

.field private f:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

.field private g:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

.field private h:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRenderBean;

.field private i:F

.field private j:[F

.field private l:Landroid/hardware/Sensor;

.field private m:D

.field private n:D

.field private o:D

.field private p:Ljava/lang/String;

.field private q:Ljava/lang/String;

.field private r:Ljava/lang/String;

.field private s:Z

.field private t:I

.field private u:F

.field private v:Lcom/beizi/fusion/widget/EulerAngleView;

.field private w:Lcom/beizi/fusion/g/x$a;

.field private x:Z

.field private y:Ljava/lang/String;

.field private z:Landroid/hardware/SensorEventListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lcom/beizi/fusion/g/an;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/beizi/fusion/g/x;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x3089705f    # 1.0E-9f

    .line 2
    iput v0, p0, Lcom/beizi/fusion/g/x;->i:F

    const/4 v0, 0x3

    new-array v0, v0, [F

    .line 3
    iput-object v0, p0, Lcom/beizi/fusion/g/x;->j:[F

    const-wide/16 v0, 0x0

    .line 4
    iput-wide v0, p0, Lcom/beizi/fusion/g/x;->m:D

    .line 5
    iput-wide v0, p0, Lcom/beizi/fusion/g/x;->n:D

    .line 6
    iput-wide v0, p0, Lcom/beizi/fusion/g/x;->o:D

    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lcom/beizi/fusion/g/x;->s:Z

    .line 8
    iput v0, p0, Lcom/beizi/fusion/g/x;->t:I

    .line 9
    iput-boolean v0, p0, Lcom/beizi/fusion/g/x;->x:Z

    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lcom/beizi/fusion/g/x;->y:Ljava/lang/String;

    .line 11
    new-instance v0, Lcom/beizi/fusion/g/x$1;

    invoke-direct {v0, p0}, Lcom/beizi/fusion/g/x$1;-><init>(Lcom/beizi/fusion/g/x;)V

    iput-object v0, p0, Lcom/beizi/fusion/g/x;->z:Landroid/hardware/SensorEventListener;

    .line 12
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "sensor"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/SensorManager;

    sput-object v0, Lcom/beizi/fusion/g/x;->k:Landroid/hardware/SensorManager;

    .line 13
    iput-object p1, p0, Lcom/beizi/fusion/g/x;->b:Landroid/content/Context;

    .line 14
    iput-object p3, p0, Lcom/beizi/fusion/g/x;->c:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;

    .line 15
    iput-object p4, p0, Lcom/beizi/fusion/g/x;->d:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;

    .line 16
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "splash_cool_"

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/beizi/fusion/g/x;->y:Ljava/lang/String;

    .line 17
    invoke-direct {p0}, Lcom/beizi/fusion/g/x;->c()V

    .line 18
    invoke-direct {p0}, Lcom/beizi/fusion/g/x;->d()V

    return-void
.end method

.method static synthetic a(Lcom/beizi/fusion/g/x;D)D
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/beizi/fusion/g/x;->m:D

    return-wide p1
.end method

.method static synthetic a(Lcom/beizi/fusion/g/x;F)F
    .locals 0

    .line 2
    iput p1, p0, Lcom/beizi/fusion/g/x;->u:F

    return p1
.end method

.method private a(Landroid/hardware/SensorEvent;)V
    .locals 22

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const-string v2, "%.4f"

    if-eqz v0, :cond_5

    .line 58
    :try_start_0
    iget-boolean v3, v1, Lcom/beizi/fusion/g/x;->x:Z

    if-eqz v3, :cond_0

    goto/16 :goto_1

    .line 59
    :cond_0
    iget-object v3, v0, Landroid/hardware/SensorEvent;->sensor:Landroid/hardware/Sensor;

    .line 60
    iget-object v4, v0, Landroid/hardware/SensorEvent;->values:[F

    .line 61
    invoke-virtual {v3}, Landroid/hardware/Sensor;->getType()I

    move-result v3

    if-eqz v4, :cond_4

    const/4 v5, 0x4

    if-eq v3, v5, :cond_1

    goto/16 :goto_0

    .line 62
    :cond_1
    iget v3, v1, Lcom/beizi/fusion/g/x;->u:F

    const/4 v5, 0x0

    cmpl-float v5, v3, v5

    if-eqz v5, :cond_3

    const/4 v5, 0x0

    .line 63
    aget v6, v4, v5

    const/4 v7, 0x1

    .line 64
    aget v8, v4, v7

    const/4 v9, 0x2

    .line 65
    aget v4, v4, v9

    .line 66
    iget-wide v10, v0, Landroid/hardware/SensorEvent;->timestamp:J

    long-to-float v10, v10

    sub-float/2addr v10, v3

    iget v3, v1, Lcom/beizi/fusion/g/x;->i:F

    mul-float v10, v10, v3

    .line 67
    iget-object v3, v1, Lcom/beizi/fusion/g/x;->j:[F

    aget v11, v3, v5

    float-to-double v11, v11

    mul-float v6, v6, v10

    float-to-double v13, v6

    invoke-static {v13, v14}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v13
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {v11, v12}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v11, v13

    double-to-float v6, v11

    :try_start_1
    aput v6, v3, v5

    .line 68
    iget-object v3, v1, Lcom/beizi/fusion/g/x;->j:[F

    aget v6, v3, v7

    float-to-double v11, v6

    mul-float v8, v8, v10

    float-to-double v13, v8

    invoke-static {v13, v14}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v13
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    invoke-static {v11, v12}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v11, v13

    double-to-float v6, v11

    :try_start_2
    aput v6, v3, v7

    .line 69
    iget-object v3, v1, Lcom/beizi/fusion/g/x;->j:[F

    aget v6, v3, v9

    float-to-double v11, v6

    mul-float v4, v4, v10

    float-to-double v13, v4

    invoke-static {v13, v14}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v13
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    invoke-static {v11, v12}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v11, v13

    double-to-float v4, v11

    :try_start_3
    aput v4, v3, v9

    .line 70
    iget-object v10, v1, Lcom/beizi/fusion/g/x;->v:Lcom/beizi/fusion/widget/EulerAngleView;

    if-eqz v10, :cond_2

    .line 71
    iget-wide v11, v1, Lcom/beizi/fusion/g/x;->m:D

    iget-wide v13, v1, Lcom/beizi/fusion/g/x;->n:D

    iget-wide v3, v1, Lcom/beizi/fusion/g/x;->o:D

    move-wide v15, v3

    invoke-virtual/range {v10 .. v16}, Lcom/beizi/fusion/widget/EulerAngleView;->setAngle(DDD)V

    .line 72
    iget-object v15, v1, Lcom/beizi/fusion/g/x;->v:Lcom/beizi/fusion/widget/EulerAngleView;

    iget-object v3, v1, Lcom/beizi/fusion/g/x;->j:[F

    aget v4, v3, v5

    float-to-double v10, v4

    aget v4, v3, v7

    float-to-double v12, v4

    aget v3, v3, v9

    float-to-double v3, v3

    move-wide/from16 v16, v10

    move-wide/from16 v18, v12

    move-wide/from16 v20, v3

    invoke-virtual/range {v15 .. v21}, Lcom/beizi/fusion/widget/EulerAngleView;->setCurrentProgress(DDD)V

    .line 73
    :cond_2
    sget-object v3, Lcom/beizi/fusion/g/x;->a:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "rotate  x: "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array v6, v7, [Ljava/lang/Object;

    iget-object v8, v1, Lcom/beizi/fusion/g/x;->j:[F

    aget v8, v8, v5

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    aput-object v8, v6, v5

    invoke-static {v2, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ",y: "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array v6, v7, [Ljava/lang/Object;

    iget-object v8, v1, Lcom/beizi/fusion/g/x;->j:[F

    aget v8, v8, v7

    .line 74
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    aput-object v8, v6, v5

    invoke-static {v2, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ",z: "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array v6, v7, [Ljava/lang/Object;

    iget-object v7, v1, Lcom/beizi/fusion/g/x;->j:[F

    aget v7, v7, v9

    .line 75
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    aput-object v7, v6, v5

    invoke-static {v2, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",x : "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v5, v1, Lcom/beizi/fusion/g/x;->m:D

    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v2, ",y : "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v5, v1, Lcom/beizi/fusion/g/x;->n:D

    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v2, ",z : "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v5, v1, Lcom/beizi/fusion/g/x;->o:D

    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 76
    invoke-static {v3, v2}, Lcom/beizi/fusion/g/af;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    invoke-direct/range {p0 .. p0}, Lcom/beizi/fusion/g/x;->e()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 78
    invoke-direct/range {p0 .. p0}, Lcom/beizi/fusion/g/x;->f()V

    .line 79
    :cond_3
    iget-wide v2, v0, Landroid/hardware/SensorEvent;->timestamp:J

    long-to-float v0, v2

    iput v0, v1, Lcom/beizi/fusion/g/x;->u:F
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_1

    :cond_4
    :goto_0
    return-void

    :catch_0
    move-exception v0

    .line 80
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_5
    :goto_1
    return-void
.end method

.method static synthetic a(Lcom/beizi/fusion/g/x;Landroid/hardware/SensorEvent;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/beizi/fusion/g/x;->a(Landroid/hardware/SensorEvent;)V

    return-void
.end method

.method private a(J)Z
    .locals 6

    const/4 v0, 0x0

    .line 6
    :try_start_0
    iget-object v1, p0, Lcom/beizi/fusion/g/x;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/beizi/fusion/g/x;->y:Ljava/lang/String;

    const-wide/16 v3, 0x0

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-static {v1, v2, v5}, Lcom/beizi/fusion/g/at;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sub-long/2addr v3, v1

    cmp-long v1, v3, p1

    if-gez v1, :cond_0

    const/4 p1, 0x1

    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return v0
.end method

.method static synthetic a(Lcom/beizi/fusion/g/x;Z)Z
    .locals 0

    .line 4
    iput-boolean p1, p0, Lcom/beizi/fusion/g/x;->s:Z

    return p1
.end method

.method static synthetic a(Lcom/beizi/fusion/g/x;)[F
    .locals 0

    .line 5
    iget-object p0, p0, Lcom/beizi/fusion/g/x;->j:[F

    return-object p0
.end method

.method static synthetic b(Lcom/beizi/fusion/g/x;D)D
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/beizi/fusion/g/x;->n:D

    return-wide p1
.end method

.method private b(J)Z
    .locals 5

    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/beizi/fusion/g/x;->b:Landroid/content/Context;

    .line 3
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    iget-object v2, p0, Lcom/beizi/fusion/g/x;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    iget-wide v1, v1, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sub-long/2addr v3, v1

    cmp-long v1, v3, p1

    if-gez v1, :cond_0

    const/4 p1, 0x1

    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return v0
.end method

.method static synthetic c(Lcom/beizi/fusion/g/x;D)D
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/beizi/fusion/g/x;->o:D

    return-wide p1
.end method

.method private c()V
    .locals 5

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/beizi/fusion/g/x;->c:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;->getCoolRule()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/fusion/g/x;->g:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/g/x;->d:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;->getNomalRule()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/fusion/g/x;->f:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/g/x;->d:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;

    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;->getRender()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRenderBean;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/fusion/g/x;->h:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRenderBean;

    goto :goto_0

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/beizi/fusion/g/x;->c:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;

    if-eqz v0, :cond_2

    .line 8
    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;->getNomalRule()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/fusion/g/x;->f:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    .line 9
    iget-object v0, p0, Lcom/beizi/fusion/g/x;->c:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;

    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;->getRender()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRenderBean;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/fusion/g/x;->h:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRenderBean;

    .line 10
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/beizi/fusion/g/x;->g:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    const/4 v1, 0x1

    if-nez v0, :cond_3

    .line 11
    iput-boolean v1, p0, Lcom/beizi/fusion/g/x;->s:Z

    .line 12
    iget-object v0, p0, Lcom/beizi/fusion/g/x;->f:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    iput-object v0, p0, Lcom/beizi/fusion/g/x;->e:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    return-void

    .line 13
    :cond_3
    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;->getCoolTime()J

    move-result-wide v2

    invoke-direct {p0, v2, v3}, Lcom/beizi/fusion/g/x;->a(J)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    .line 14
    iput-boolean v2, p0, Lcom/beizi/fusion/g/x;->s:Z

    .line 15
    iget-object v0, p0, Lcom/beizi/fusion/g/x;->g:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    iput-object v0, p0, Lcom/beizi/fusion/g/x;->e:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    return-void

    .line 16
    :cond_4
    iget-object v0, p0, Lcom/beizi/fusion/g/x;->g:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;->getUserProtectTime()J

    move-result-wide v3

    invoke-direct {p0, v3, v4}, Lcom/beizi/fusion/g/x;->b(J)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 17
    iput-boolean v2, p0, Lcom/beizi/fusion/g/x;->s:Z

    .line 18
    iget-object v0, p0, Lcom/beizi/fusion/g/x;->g:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    iput-object v0, p0, Lcom/beizi/fusion/g/x;->e:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    return-void

    .line 19
    :cond_5
    iput-boolean v1, p0, Lcom/beizi/fusion/g/x;->s:Z

    .line 20
    iget-object v0, p0, Lcom/beizi/fusion/g/x;->f:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    iput-object v0, p0, Lcom/beizi/fusion/g/x;->e:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method

.method private d()V
    .locals 13

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/beizi/fusion/g/x;->e:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;->getRules()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_a

    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_1

    goto/16 :goto_4

    .line 4
    :cond_1
    iget-object v1, p0, Lcom/beizi/fusion/g/x;->e:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    invoke-virtual {v1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;->getPassivationTime()I

    move-result v1

    .line 5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-wide/16 v2, 0x0

    move-wide v6, v2

    move-wide v8, v6

    move-wide v10, v8

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;

    if-nez v4, :cond_3

    goto :goto_0

    :cond_3
    const-string v5, "x"

    .line 6
    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getAxis()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v5, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_5

    if-lez v1, :cond_4

    .line 7
    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getPangle()D

    move-result-wide v5

    cmpl-double v7, v5, v2

    if-lez v7, :cond_4

    .line 8
    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getPangle()D

    move-result-wide v5

    iput-wide v5, p0, Lcom/beizi/fusion/g/x;->m:D

    goto :goto_1

    .line 9
    :cond_4
    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getAngle()D

    move-result-wide v5

    iput-wide v5, p0, Lcom/beizi/fusion/g/x;->m:D

    .line 10
    :goto_1
    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getAngle()D

    move-result-wide v6

    .line 11
    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getDirection()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/beizi/fusion/g/x;->p:Ljava/lang/String;

    goto :goto_0

    :cond_5
    const-string v5, "y"

    .line 12
    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getAxis()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v5, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_7

    if-lez v1, :cond_6

    .line 13
    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getPangle()D

    move-result-wide v8

    cmpl-double v5, v8, v2

    if-lez v5, :cond_6

    .line 14
    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getPangle()D

    move-result-wide v8

    iput-wide v8, p0, Lcom/beizi/fusion/g/x;->n:D

    goto :goto_2

    .line 15
    :cond_6
    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getAngle()D

    move-result-wide v8

    iput-wide v8, p0, Lcom/beizi/fusion/g/x;->n:D

    .line 16
    :goto_2
    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getAngle()D

    move-result-wide v8

    .line 17
    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getDirection()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/beizi/fusion/g/x;->q:Ljava/lang/String;

    goto :goto_0

    :cond_7
    const-string v5, "z"

    .line 18
    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getAxis()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v5, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    if-lez v1, :cond_8

    .line 19
    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getPangle()D

    move-result-wide v10

    cmpl-double v5, v10, v2

    if-lez v5, :cond_8

    .line 20
    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getPangle()D

    move-result-wide v10

    iput-wide v10, p0, Lcom/beizi/fusion/g/x;->o:D

    goto :goto_3

    .line 21
    :cond_8
    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getAngle()D

    move-result-wide v10

    iput-wide v10, p0, Lcom/beizi/fusion/g/x;->o:D

    .line 22
    :goto_3
    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getAngle()D

    move-result-wide v10

    .line 23
    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getDirection()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/beizi/fusion/g/x;->r:Ljava/lang/String;

    goto/16 :goto_0

    :cond_9
    if-lez v1, :cond_b

    .line 24
    invoke-static {v1}, Lcom/beizi/fusion/g/al;->b(I)I

    move-result v0

    .line 25
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    new-instance v2, Lcom/beizi/fusion/g/x$2;

    move-object v4, v2

    move-object v5, p0

    invoke-direct/range {v4 .. v11}, Lcom/beizi/fusion/g/x$2;-><init>(Lcom/beizi/fusion/g/x;DDD)V

    int-to-long v3, v0

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :cond_a
    :goto_4
    return-void

    :catch_0
    move-exception v0

    .line 26
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_b
    :goto_5
    return-void
.end method

.method private e()Z
    .locals 13

    const/4 v0, 0x0

    .line 1
    :try_start_0
    iget-wide v1, p0, Lcom/beizi/fusion/g/x;->m:D
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v3, "0"

    const-string v4, "1"

    const-string v5, "2"

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    cmpl-double v10, v1, v6

    if-lez v10, :cond_2

    .line 2
    :try_start_1
    iget-object v1, p0, Lcom/beizi/fusion/g/x;->p:Ljava/lang/String;

    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    iget-object v1, p0, Lcom/beizi/fusion/g/x;->j:[F

    aget v2, v1, v0

    cmpl-float v2, v2, v8

    if-lez v2, :cond_2

    aget v1, v1, v0

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    float-to-double v1, v1

    iget-wide v10, p0, Lcom/beizi/fusion/g/x;->m:D

    cmpl-double v12, v1, v10

    if-ltz v12, :cond_2

    return v9

    .line 4
    :cond_0
    iget-object v1, p0, Lcom/beizi/fusion/g/x;->p:Ljava/lang/String;

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 5
    iget-object v1, p0, Lcom/beizi/fusion/g/x;->j:[F

    aget v2, v1, v0

    cmpg-float v2, v2, v8

    if-gez v2, :cond_2

    aget v1, v1, v0

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    float-to-double v1, v1

    iget-wide v10, p0, Lcom/beizi/fusion/g/x;->m:D

    cmpl-double v12, v1, v10

    if-ltz v12, :cond_2

    return v9

    .line 6
    :cond_1
    iget-object v1, p0, Lcom/beizi/fusion/g/x;->p:Ljava/lang/String;

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 7
    iget-object v1, p0, Lcom/beizi/fusion/g/x;->j:[F

    aget v1, v1, v0

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    float-to-double v1, v1

    iget-wide v10, p0, Lcom/beizi/fusion/g/x;->m:D

    cmpl-double v12, v1, v10

    if-ltz v12, :cond_2

    return v9

    .line 8
    :cond_2
    iget-wide v1, p0, Lcom/beizi/fusion/g/x;->n:D

    cmpl-double v10, v1, v6

    if-lez v10, :cond_5

    .line 9
    iget-object v1, p0, Lcom/beizi/fusion/g/x;->q:Ljava/lang/String;

    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 10
    iget-object v1, p0, Lcom/beizi/fusion/g/x;->j:[F

    aget v2, v1, v9

    cmpg-float v2, v2, v8

    if-gez v2, :cond_5

    aget v1, v1, v9

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    float-to-double v1, v1

    iget-wide v10, p0, Lcom/beizi/fusion/g/x;->n:D

    cmpl-double v12, v1, v10

    if-ltz v12, :cond_5

    return v9

    .line 11
    :cond_3
    iget-object v1, p0, Lcom/beizi/fusion/g/x;->q:Ljava/lang/String;

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 12
    iget-object v1, p0, Lcom/beizi/fusion/g/x;->j:[F

    aget v2, v1, v9

    cmpl-float v2, v2, v8

    if-lez v2, :cond_5

    aget v1, v1, v9

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    float-to-double v1, v1

    iget-wide v10, p0, Lcom/beizi/fusion/g/x;->n:D

    cmpl-double v12, v1, v10

    if-ltz v12, :cond_5

    return v9

    .line 13
    :cond_4
    iget-object v1, p0, Lcom/beizi/fusion/g/x;->q:Ljava/lang/String;

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 14
    iget-object v1, p0, Lcom/beizi/fusion/g/x;->j:[F

    aget v1, v1, v9

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    float-to-double v1, v1

    iget-wide v10, p0, Lcom/beizi/fusion/g/x;->n:D

    cmpl-double v12, v1, v10

    if-ltz v12, :cond_5

    return v9

    .line 15
    :cond_5
    iget-wide v1, p0, Lcom/beizi/fusion/g/x;->o:D

    cmpl-double v10, v1, v6

    if-lez v10, :cond_8

    .line 16
    iget-object v1, p0, Lcom/beizi/fusion/g/x;->r:Ljava/lang/String;

    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x2

    if-eqz v1, :cond_6

    .line 17
    iget-object v1, p0, Lcom/beizi/fusion/g/x;->j:[F

    aget v3, v1, v2

    cmpl-float v3, v3, v8

    if-lez v3, :cond_8

    aget v1, v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    float-to-double v1, v1

    iget-wide v3, p0, Lcom/beizi/fusion/g/x;->o:D

    cmpl-double v5, v1, v3

    if-ltz v5, :cond_8

    return v9

    .line 18
    :cond_6
    iget-object v1, p0, Lcom/beizi/fusion/g/x;->r:Ljava/lang/String;

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 19
    iget-object v1, p0, Lcom/beizi/fusion/g/x;->j:[F

    aget v3, v1, v2

    cmpg-float v3, v3, v8

    if-gez v3, :cond_8

    aget v1, v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    float-to-double v1, v1

    iget-wide v3, p0, Lcom/beizi/fusion/g/x;->o:D

    cmpl-double v5, v1, v3

    if-ltz v5, :cond_8

    return v9

    .line 20
    :cond_7
    iget-object v1, p0, Lcom/beizi/fusion/g/x;->r:Ljava/lang/String;

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 21
    iget-object v1, p0, Lcom/beizi/fusion/g/x;->j:[F

    aget v1, v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    float-to-double v1, v1

    iget-wide v3, p0, Lcom/beizi/fusion/g/x;->o:D
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    cmpl-double v5, v1, v3

    if-ltz v5, :cond_8

    return v9

    :catch_0
    move-exception v1

    .line 22
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_8
    return v0
.end method

.method private f()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/beizi/fusion/g/x;->w:Lcom/beizi/fusion/g/x$a;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-boolean v0, p0, Lcom/beizi/fusion/g/x;->x:Z

    if-eqz v0, :cond_1

    return-void

    .line 3
    :cond_1
    iget-object v0, p0, Lcom/beizi/fusion/g/x;->v:Lcom/beizi/fusion/widget/EulerAngleView;

    invoke-static {v0}, Lcom/beizi/fusion/g/ax;->b(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_2

    return-void

    :cond_2
    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/beizi/fusion/g/x;->x:Z

    .line 5
    iget-boolean v0, p0, Lcom/beizi/fusion/g/x;->s:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/beizi/fusion/g/x;->g:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    if-eqz v0, :cond_3

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/g/x;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/beizi/fusion/g/x;->y:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/beizi/fusion/g/at;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)V

    .line 7
    :cond_3
    iget-object v0, p0, Lcom/beizi/fusion/g/x;->w:Lcom/beizi/fusion/g/x$a;

    invoke-interface {v0}, Lcom/beizi/fusion/g/x$a;->a()V

    .line 8
    invoke-virtual {p0}, Lcom/beizi/fusion/g/x;->b()V

    .line 9
    sget-object v0, Lcom/beizi/fusion/g/x;->a:Ljava/lang/String;

    const-string v1, "onEulerAngleHappened"

    invoke-static {v0, v1}, Lcom/beizi/fusion/g/af;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 9
    :try_start_0
    sget-object v0, Lcom/beizi/fusion/g/x;->k:Landroid/hardware/SensorManager;

    if-eqz v0, :cond_0

    const/4 v1, 0x4

    .line 10
    invoke-virtual {v0, v1}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/fusion/g/x;->l:Landroid/hardware/Sensor;

    if-eqz v0, :cond_0

    .line 11
    sget-object v1, Lcom/beizi/fusion/g/x;->k:Landroid/hardware/SensorManager;

    iget-object v2, p0, Lcom/beizi/fusion/g/x;->z:Landroid/hardware/SensorEventListener;

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v0, v3}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method public a(Landroid/view/ViewGroup;II)V
    .locals 10

    const-string v0, "%"

    .line 13
    :try_start_0
    iget-object v1, p0, Lcom/beizi/fusion/g/x;->b:Landroid/content/Context;

    if-eqz v1, :cond_12

    iget-object v1, p0, Lcom/beizi/fusion/g/x;->h:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRenderBean;

    if-eqz v1, :cond_12

    if-nez p1, :cond_0

    goto/16 :goto_6

    :cond_0
    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 14
    invoke-virtual {v1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRenderBean;->getCenterX()Ljava/lang/String;

    move-result-object v2

    .line 15
    iget-object v1, p0, Lcom/beizi/fusion/g/x;->h:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRenderBean;

    invoke-virtual {v1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRenderBean;->getCenterY()Ljava/lang/String;

    move-result-object v1

    .line 16
    iget-object v3, p0, Lcom/beizi/fusion/g/x;->h:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRenderBean;

    invoke-virtual {v3}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRenderBean;->getWidth()Ljava/lang/String;

    move-result-object v3

    .line 17
    iget-object v4, p0, Lcom/beizi/fusion/g/x;->h:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRenderBean;

    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRenderBean;->getHeight()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_1
    move-object v1, v2

    move-object v3, v1

    move-object v4, v3

    .line 18
    :goto_0
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v6, "0"

    if-nez v5, :cond_2

    :try_start_1
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    :cond_2
    const-string v2, "85%"

    .line 19
    :cond_3
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_4

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    :cond_4
    const-string v1, "50%"

    .line 20
    :cond_5
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    const-string v7, "120"

    if-nez v5, :cond_6

    :try_start_2
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    :cond_6
    move-object v3, v7

    .line 21
    :cond_7
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_8

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    :cond_8
    move-object v4, v7

    .line 22
    :cond_9
    iget-object v5, p0, Lcom/beizi/fusion/g/x;->b:Landroid/content/Context;

    invoke-static {v5}, Lcom/beizi/fusion/g/av;->j(Landroid/content/Context;)F

    move-result v5

    .line 23
    invoke-virtual {v2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    const/16 v7, 0x64

    const/4 v8, 0x0

    if-eqz v6, :cond_a

    .line 24
    invoke-virtual {v2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v2, v8, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    mul-int v2, v2, p2

    div-int/2addr v2, v7

    goto :goto_1

    .line 25
    :cond_a
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    .line 26
    :goto_1
    invoke-virtual {v1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_b

    .line 27
    invoke-virtual {v1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v1, v8, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    mul-int v1, v1, p3

    div-int/2addr v1, v7

    goto :goto_2

    .line 28
    :cond_b
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    .line 29
    :goto_2
    invoke-virtual {v3, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_c

    .line 30
    invoke-virtual {v3, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v3, v8, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    float-to-int v5, v5

    mul-int v5, v5, v3

    .line 31
    div-int/2addr v5, v7

    goto :goto_3

    .line 32
    :cond_c
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    .line 33
    :goto_3
    invoke-virtual {v4, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_d

    .line 34
    invoke-virtual {v4, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v4, v8, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    mul-int v0, v0, v5

    div-int/2addr v0, v7

    goto :goto_4

    .line 35
    :cond_d
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    :goto_4
    if-nez v5, :cond_e

    const/16 v5, 0x64

    :cond_e
    if-nez v0, :cond_f

    goto :goto_5

    :cond_f
    move v7, v0

    :goto_5
    if-nez v1, :cond_10

    .line 36
    iget-object v0, p0, Lcom/beizi/fusion/g/x;->b:Landroid/content/Context;

    int-to-float v1, p3

    invoke-static {v0, v1}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v0

    div-int/lit8 v1, v0, 0x2

    :cond_10
    if-nez v2, :cond_11

    .line 37
    iget-object v0, p0, Lcom/beizi/fusion/g/x;->b:Landroid/content/Context;

    int-to-float v2, p2

    invoke-static {v0, v2}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v0

    div-int/lit8 v2, v0, 0x2

    .line 38
    :cond_11
    iget-object v0, p0, Lcom/beizi/fusion/g/x;->b:Landroid/content/Context;

    int-to-float v3, v5

    invoke-static {v0, v3}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v0

    .line 39
    iget-object v3, p0, Lcom/beizi/fusion/g/x;->b:Landroid/content/Context;

    int-to-float v4, v7

    invoke-static {v3, v4}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v3

    .line 40
    iget-object v4, p0, Lcom/beizi/fusion/g/x;->b:Landroid/content/Context;

    int-to-float v2, v2

    invoke-static {v4, v2}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v2

    .line 41
    iget-object v4, p0, Lcom/beizi/fusion/g/x;->b:Landroid/content/Context;

    int-to-float v1, v1

    invoke-static {v4, v1}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v1

    .line 42
    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v5, -0x2

    invoke-direct {v4, v5, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 43
    new-instance v5, Lcom/beizi/fusion/widget/EulerAngleView;

    iget-object v6, p0, Lcom/beizi/fusion/g/x;->b:Landroid/content/Context;

    invoke-direct {v5, v6}, Lcom/beizi/fusion/widget/EulerAngleView;-><init>(Landroid/content/Context;)V

    iput-object v5, p0, Lcom/beizi/fusion/g/x;->v:Lcom/beizi/fusion/widget/EulerAngleView;

    .line 44
    iget-object v6, p0, Lcom/beizi/fusion/g/x;->e:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    invoke-virtual {v5, v6}, Lcom/beizi/fusion/widget/EulerAngleView;->setEulerAngleViewRuleBean(Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;)V

    .line 45
    iget-object v5, p0, Lcom/beizi/fusion/g/x;->v:Lcom/beizi/fusion/widget/EulerAngleView;

    iget-object v6, p0, Lcom/beizi/fusion/g/x;->h:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRenderBean;

    invoke-virtual {v5, v6}, Lcom/beizi/fusion/widget/EulerAngleView;->setEulerAngleRenderBean(Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRenderBean;)V

    .line 46
    iget-object v5, p0, Lcom/beizi/fusion/g/x;->v:Lcom/beizi/fusion/widget/EulerAngleView;

    invoke-virtual {v5, v0, v3}, Lcom/beizi/fusion/widget/EulerAngleView;->setAnimationViewWidthAndHeight(II)V

    .line 47
    iget-object v5, p0, Lcom/beizi/fusion/g/x;->v:Lcom/beizi/fusion/widget/EulerAngleView;

    invoke-virtual {v5}, Lcom/beizi/fusion/widget/EulerAngleView;->buildEulerAngleView()V

    .line 48
    iget-object v5, p0, Lcom/beizi/fusion/g/x;->v:Lcom/beizi/fusion/widget/EulerAngleView;

    invoke-virtual {v5, v8, v8}, Landroid/widget/RelativeLayout;->measure(II)V

    .line 49
    iget-object v5, p0, Lcom/beizi/fusion/g/x;->v:Lcom/beizi/fusion/widget/EulerAngleView;

    invoke-virtual {v5}, Landroid/widget/RelativeLayout;->getMeasuredWidth()I

    move-result v5

    .line 50
    iget-object v6, p0, Lcom/beizi/fusion/g/x;->v:Lcom/beizi/fusion/widget/EulerAngleView;

    invoke-virtual {v6}, Landroid/widget/RelativeLayout;->getMeasuredHeight()I

    move-result v6

    const-string v7, "BeiZis"

    .line 51
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "centerYInt = "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, ",centerXInt = "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, ",adWidthDp = "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ",adHeightDp = "

    invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ",widthInt = "

    invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ",heightInt = "

    invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ",viewWidth = "

    invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ",viewHeight = "

    invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v7, p2}, Lcom/beizi/fusion/g/af;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    div-int/lit8 v6, v6, 0x2

    sub-int/2addr v1, v6

    iput v1, v4, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 53
    div-int/lit8 v5, v5, 0x2

    sub-int/2addr v2, v5

    iput v2, v4, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 54
    iget-object p2, p0, Lcom/beizi/fusion/g/x;->v:Lcom/beizi/fusion/widget/EulerAngleView;

    invoke-virtual {p1, p2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 55
    iget-object p1, p0, Lcom/beizi/fusion/g/x;->v:Lcom/beizi/fusion/widget/EulerAngleView;

    invoke-virtual {p1}, Lcom/beizi/fusion/widget/EulerAngleView;->startContinuousRotations()V
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_7

    :cond_12
    :goto_6
    return-void

    :catch_0
    move-exception p1

    .line 56
    invoke-virtual {p1}, Ljava/lang/NumberFormatException;->printStackTrace()V

    :goto_7
    return-void
.end method

.method public a(Lcom/beizi/fusion/g/x$a;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lcom/beizi/fusion/g/x;->w:Lcom/beizi/fusion/g/x$a;

    return-void
.end method

.method public b()V
    .locals 2

    :try_start_0
    const-string v0, "BeiZis"

    const-string v1, "enter unRegisterListener"

    .line 6
    invoke-static {v0, v1}, Lcom/beizi/fusion/g/af;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    sget-object v0, Lcom/beizi/fusion/g/x;->k:Landroid/hardware/SensorManager;

    if-eqz v0, :cond_0

    .line 8
    iget-object v1, p0, Lcom/beizi/fusion/g/x;->z:Landroid/hardware/SensorEventListener;

    invoke-virtual {v0, v1}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/g/x;->v:Lcom/beizi/fusion/widget/EulerAngleView;

    if-eqz v0, :cond_1

    .line 10
    invoke-virtual {v0}, Lcom/beizi/fusion/widget/EulerAngleView;->onDestroy()V

    :cond_1
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lcom/beizi/fusion/g/x;->v:Lcom/beizi/fusion/widget/EulerAngleView;

    .line 12
    iput-object v0, p0, Lcom/beizi/fusion/g/x;->b:Landroid/content/Context;

    .line 13
    iput-object v0, p0, Lcom/beizi/fusion/g/x;->w:Lcom/beizi/fusion/g/x$a;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method
