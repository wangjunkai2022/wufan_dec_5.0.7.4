.class public Lcom/beizi/ad/a/a/a;
.super Ljava/lang/Object;
.source "EulerAngleUtil.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/ad/a/a/a$a;
    }
.end annotation


# static fields
.field private static final g:Ljava/lang/String; = "a"

.field private static q:Landroid/hardware/SensorManager;


# instance fields
.field private A:F

.field private B:Lcom/beizi/ad/a/a/a$a;

.field private C:Z

.field private D:Z

.field private E:Ljava/lang/String;

.field private F:I

.field private G:F

.field private H:F

.field private I:F

.field private J:Landroid/animation/AnimatorSet;

.field private K:Z

.field private L:Landroid/hardware/SensorEventListener;

.field a:Ljava/lang/String;

.field b:Ljava/lang/String;

.field c:Ljava/lang/String;

.field d:Ljava/lang/String;

.field e:Ljava/lang/String;

.field f:Ljava/lang/String;

.field private h:Landroid/content/Context;

.field private i:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;

.field private j:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;

.field private k:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

.field private l:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

.field private m:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

.field private n:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRenderBean;

.field private o:F

.field private p:[F

.field private r:Landroid/hardware/Sensor;

.field private s:D

.field private t:D

.field private u:D

.field private v:Ljava/lang/String;

.field private w:Ljava/lang/String;

.field private x:Ljava/lang/String;

.field private y:Z

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x3089705f    # 1.0E-9f

    .line 2
    iput v0, p0, Lcom/beizi/ad/a/a/a;->o:F

    const/4 v0, 0x3

    new-array v0, v0, [F

    .line 3
    iput-object v0, p0, Lcom/beizi/ad/a/a/a;->p:[F

    const-wide/16 v0, 0x0

    .line 4
    iput-wide v0, p0, Lcom/beizi/ad/a/a/a;->s:D

    .line 5
    iput-wide v0, p0, Lcom/beizi/ad/a/a/a;->t:D

    .line 6
    iput-wide v0, p0, Lcom/beizi/ad/a/a/a;->u:D

    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lcom/beizi/ad/a/a/a;->y:Z

    .line 8
    iput v0, p0, Lcom/beizi/ad/a/a/a;->z:I

    const/4 v1, 0x1

    .line 9
    iput-boolean v1, p0, Lcom/beizi/ad/a/a/a;->C:Z

    .line 10
    iput-boolean v0, p0, Lcom/beizi/ad/a/a/a;->D:Z

    const/4 v2, 0x0

    .line 11
    iput-object v2, p0, Lcom/beizi/ad/a/a/a;->E:Ljava/lang/String;

    const-string v2, "x"

    .line 12
    iput-object v2, p0, Lcom/beizi/ad/a/a/a;->a:Ljava/lang/String;

    const-string v2, "y"

    .line 13
    iput-object v2, p0, Lcom/beizi/ad/a/a/a;->b:Ljava/lang/String;

    const-string v2, "z"

    .line 14
    iput-object v2, p0, Lcom/beizi/ad/a/a/a;->c:Ljava/lang/String;

    const-string v2, "0"

    .line 15
    iput-object v2, p0, Lcom/beizi/ad/a/a/a;->d:Ljava/lang/String;

    const-string v2, "1"

    .line 16
    iput-object v2, p0, Lcom/beizi/ad/a/a/a;->e:Ljava/lang/String;

    const-string v2, "2"

    .line 17
    iput-object v2, p0, Lcom/beizi/ad/a/a/a;->f:Ljava/lang/String;

    const/16 v2, 0x15e

    .line 18
    iput v2, p0, Lcom/beizi/ad/a/a/a;->F:I

    const/high16 v2, 0x42700000    # 60.0f

    .line 19
    iput v2, p0, Lcom/beizi/ad/a/a/a;->G:F

    .line 20
    iput v2, p0, Lcom/beizi/ad/a/a/a;->H:F

    const/high16 v2, 0x41f00000    # 30.0f

    .line 21
    iput v2, p0, Lcom/beizi/ad/a/a/a;->I:F

    .line 22
    iput-boolean v0, p0, Lcom/beizi/ad/a/a/a;->K:Z

    .line 23
    new-instance v2, Lcom/beizi/ad/a/a/a$4;

    invoke-direct {v2, p0}, Lcom/beizi/ad/a/a/a$4;-><init>(Lcom/beizi/ad/a/a/a;)V

    iput-object v2, p0, Lcom/beizi/ad/a/a/a;->L:Landroid/hardware/SensorEventListener;

    .line 24
    iput-object p1, p0, Lcom/beizi/ad/a/a/a;->h:Landroid/content/Context;

    .line 25
    iput-object p2, p0, Lcom/beizi/ad/a/a/a;->i:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;

    .line 26
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "beizi_cool_"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/beizi/ad/a/a/a;->E:Ljava/lang/String;

    .line 27
    iget-object p1, p0, Lcom/beizi/ad/a/a/a;->i:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;

    .line 28
    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;->getOrderData()Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1, p4}, Lcom/beizi/ad/a/a/a;->a(Ljava/util/List;Ljava/lang/String;)Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$OrderDataEulerAngleViewBean;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 29
    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$OrderDataEulerAngleViewBean;->getEulerAngleRule()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 30
    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$OrderDataEulerAngleViewBean;->getEulerAngleRule()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;

    move-result-object p1

    iput-object p1, p0, Lcom/beizi/ad/a/a/a;->j:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;

    .line 31
    :cond_0
    iget-object p1, p0, Lcom/beizi/ad/a/a/a;->i:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;

    if-eqz p1, :cond_1

    .line 32
    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;->getCoolRule()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    move-result-object p1

    iput-object p1, p0, Lcom/beizi/ad/a/a/a;->m:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    .line 33
    :cond_1
    iget-object p1, p0, Lcom/beizi/ad/a/a/a;->j:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;

    if-eqz p1, :cond_2

    .line 34
    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;->getNomalRule()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    move-result-object p1

    iput-object p1, p0, Lcom/beizi/ad/a/a/a;->l:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    .line 35
    iget-object p1, p0, Lcom/beizi/ad/a/a/a;->j:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;

    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;->getRender()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRenderBean;

    move-result-object p1

    iput-object p1, p0, Lcom/beizi/ad/a/a/a;->n:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRenderBean;

    goto :goto_0

    .line 36
    :cond_2
    iget-object p1, p0, Lcom/beizi/ad/a/a/a;->i:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;

    if-eqz p1, :cond_3

    .line 37
    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;->getNomalRule()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    move-result-object p1

    iput-object p1, p0, Lcom/beizi/ad/a/a/a;->l:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    .line 38
    iget-object p1, p0, Lcom/beizi/ad/a/a/a;->i:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;

    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;->getRender()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRenderBean;

    move-result-object p1

    iput-object p1, p0, Lcom/beizi/ad/a/a/a;->n:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRenderBean;

    .line 39
    :cond_3
    :goto_0
    invoke-direct {p0}, Lcom/beizi/ad/a/a/a;->d()Z

    move-result p1

    if-nez p1, :cond_4

    .line 40
    iput-boolean v0, p0, Lcom/beizi/ad/a/a/a;->K:Z

    return-void

    .line 41
    :cond_4
    iput-boolean v1, p0, Lcom/beizi/ad/a/a/a;->K:Z

    .line 42
    invoke-direct {p0}, Lcom/beizi/ad/a/a/a;->e()V

    .line 43
    invoke-direct {p0}, Lcom/beizi/ad/a/a/a;->k()V

    return-void
.end method

.method static synthetic a(Lcom/beizi/ad/a/a/a;D)D
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/beizi/ad/a/a/a;->s:D

    return-wide p1
.end method

.method static synthetic a(Lcom/beizi/ad/a/a/a;F)F
    .locals 0

    .line 2
    iput p1, p0, Lcom/beizi/ad/a/a/a;->A:F

    return p1
.end method

.method private a(Ljava/util/List;Ljava/lang/String;)Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$OrderDataEulerAngleViewBean;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$OrderDataEulerAngleViewBean;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$OrderDataEulerAngleViewBean;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    if-nez p2, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$OrderDataEulerAngleViewBean;

    .line 6
    invoke-virtual {v1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$OrderDataEulerAngleViewBean;->getOrderList()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 7
    invoke-interface {v2, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    return-object v1

    :cond_2
    :goto_0
    return-object v0
.end method

.method private a(Landroid/hardware/SensorEvent;)V
    .locals 13

    const-string v0, "%.4f"

    if-eqz p1, :cond_4

    .line 109
    :try_start_0
    iget-boolean v1, p0, Lcom/beizi/ad/a/a/a;->C:Z

    if-nez v1, :cond_0

    goto/16 :goto_1

    .line 110
    :cond_0
    iget-object v1, p1, Landroid/hardware/SensorEvent;->sensor:Landroid/hardware/Sensor;

    .line 111
    iget-object v2, p1, Landroid/hardware/SensorEvent;->values:[F

    .line 112
    invoke-virtual {v1}, Landroid/hardware/Sensor;->getType()I

    move-result v1

    if-eqz v2, :cond_3

    const/4 v3, 0x4

    if-eq v1, v3, :cond_1

    goto/16 :goto_0

    .line 113
    :cond_1
    iget v1, p0, Lcom/beizi/ad/a/a/a;->A:F

    const/4 v3, 0x0

    cmpl-float v3, v1, v3

    if-eqz v3, :cond_2

    const/4 v3, 0x0

    .line 114
    aget v4, v2, v3

    const/4 v5, 0x1

    .line 115
    aget v6, v2, v5

    const/4 v7, 0x2

    .line 116
    aget v2, v2, v7

    .line 117
    iget-wide v8, p1, Landroid/hardware/SensorEvent;->timestamp:J

    long-to-float v8, v8

    sub-float/2addr v8, v1

    iget v1, p0, Lcom/beizi/ad/a/a/a;->o:F

    mul-float v8, v8, v1

    .line 118
    iget-object v1, p0, Lcom/beizi/ad/a/a/a;->p:[F

    aget v9, v1, v3

    float-to-double v9, v9

    mul-float v4, v4, v8

    float-to-double v11, v4

    invoke-static {v11, v12}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v11
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {v9, v10}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v9, v11

    double-to-float v4, v9

    :try_start_1
    aput v4, v1, v3

    .line 119
    iget-object v1, p0, Lcom/beizi/ad/a/a/a;->p:[F

    aget v4, v1, v5

    float-to-double v9, v4

    mul-float v6, v6, v8

    float-to-double v11, v6

    invoke-static {v11, v12}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v11
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    invoke-static {v9, v10}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v9, v11

    double-to-float v4, v9

    :try_start_2
    aput v4, v1, v5

    .line 120
    iget-object v1, p0, Lcom/beizi/ad/a/a/a;->p:[F

    aget v4, v1, v7

    float-to-double v9, v4

    mul-float v2, v2, v8

    float-to-double v11, v2

    invoke-static {v11, v12}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v11
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    invoke-static {v9, v10}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v9, v11

    double-to-float v2, v9

    :try_start_3
    aput v2, v1, v7

    .line 121
    sget-object v1, Lcom/beizi/ad/a/a/a;->g:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "rotate  x: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array v4, v5, [Ljava/lang/Object;

    iget-object v6, p0, Lcom/beizi/ad/a/a/a;->p:[F

    aget v6, v6, v3

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    aput-object v6, v4, v3

    invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ",y: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array v4, v5, [Ljava/lang/Object;

    iget-object v6, p0, Lcom/beizi/ad/a/a/a;->p:[F

    aget v6, v6, v5

    .line 122
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    aput-object v6, v4, v3

    invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ",z: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array v4, v5, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/beizi/ad/a/a/a;->p:[F

    aget v5, v5, v7

    .line 123
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    aput-object v5, v4, v3

    invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ",x : "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v3, p0, Lcom/beizi/ad/a/a/a;->s:D

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ",y : "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v3, p0, Lcom/beizi/ad/a/a/a;->t:D

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ",z : "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v3, p0, Lcom/beizi/ad/a/a/a;->u:D

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 124
    invoke-static {v1, v0}, Lcom/beizi/ad/lance/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    invoke-direct {p0}, Lcom/beizi/ad/a/a/a;->m()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 126
    invoke-direct {p0}, Lcom/beizi/ad/a/a/a;->n()V

    .line 127
    :cond_2
    iget-wide v0, p1, Landroid/hardware/SensorEvent;->timestamp:J

    long-to-float p1, v0

    iput p1, p0, Lcom/beizi/ad/a/a/a;->A:F
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_1

    :cond_3
    :goto_0
    return-void

    :catch_0
    move-exception p1

    .line 128
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_4
    :goto_1
    return-void
.end method

.method private a(Landroid/widget/ImageView;)V
    .locals 7

    .line 63
    :try_start_0
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 64
    iget-object v0, p0, Lcom/beizi/ad/a/a/a;->v:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 65
    iget-object v0, p0, Lcom/beizi/ad/a/a/a;->f:Ljava/lang/String;

    iget-object v1, p0, Lcom/beizi/ad/a/a/a;->v:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v3, "rotationX"

    const/4 v4, 0x0

    .line 66
    iget v0, p0, Lcom/beizi/ad/a/a/a;->G:F

    neg-float v5, v0

    move-object v0, p0

    move-object v1, p1

    move-object v2, v6

    invoke-direct/range {v0 .. v5}, Lcom/beizi/ad/a/a/a;->a(Landroid/widget/ImageView;Ljava/util/List;Ljava/lang/String;FF)V

    const-string v3, "rotationX"

    .line 67
    iget v0, p0, Lcom/beizi/ad/a/a/a;->G:F

    neg-float v4, v0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, v6

    invoke-direct/range {v0 .. v5}, Lcom/beizi/ad/a/a/a;->a(Landroid/widget/ImageView;Ljava/util/List;Ljava/lang/String;FF)V

    goto :goto_0

    .line 68
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/a/a/a;->e:Ljava/lang/String;

    iget-object v1, p0, Lcom/beizi/ad/a/a/a;->v:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v3, "rotationX"

    const/4 v4, 0x0

    .line 69
    iget v5, p0, Lcom/beizi/ad/a/a/a;->G:F

    move-object v0, p0

    move-object v1, p1

    move-object v2, v6

    invoke-direct/range {v0 .. v5}, Lcom/beizi/ad/a/a/a;->a(Landroid/widget/ImageView;Ljava/util/List;Ljava/lang/String;FF)V

    const-string v3, "rotationX"

    .line 70
    iget v4, p0, Lcom/beizi/ad/a/a/a;->G:F

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, v6

    invoke-direct/range {v0 .. v5}, Lcom/beizi/ad/a/a/a;->a(Landroid/widget/ImageView;Ljava/util/List;Ljava/lang/String;FF)V

    goto :goto_0

    :cond_1
    const-string v3, "rotationX"

    const/4 v4, 0x0

    .line 71
    iget v5, p0, Lcom/beizi/ad/a/a/a;->G:F

    move-object v0, p0

    move-object v1, p1

    move-object v2, v6

    invoke-direct/range {v0 .. v5}, Lcom/beizi/ad/a/a/a;->a(Landroid/widget/ImageView;Ljava/util/List;Ljava/lang/String;FF)V

    const-string v3, "rotationX"

    .line 72
    iget v4, p0, Lcom/beizi/ad/a/a/a;->G:F

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, v6

    invoke-direct/range {v0 .. v5}, Lcom/beizi/ad/a/a/a;->a(Landroid/widget/ImageView;Ljava/util/List;Ljava/lang/String;FF)V

    const-string v3, "rotationX"

    const/4 v4, 0x0

    .line 73
    iget v0, p0, Lcom/beizi/ad/a/a/a;->G:F

    neg-float v5, v0

    move-object v0, p0

    move-object v1, p1

    move-object v2, v6

    invoke-direct/range {v0 .. v5}, Lcom/beizi/ad/a/a/a;->a(Landroid/widget/ImageView;Ljava/util/List;Ljava/lang/String;FF)V

    const-string v3, "rotationX"

    .line 74
    iget v0, p0, Lcom/beizi/ad/a/a/a;->G:F

    neg-float v4, v0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, v6

    invoke-direct/range {v0 .. v5}, Lcom/beizi/ad/a/a/a;->a(Landroid/widget/ImageView;Ljava/util/List;Ljava/lang/String;FF)V

    .line 75
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/beizi/ad/a/a/a;->w:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 76
    iget-object v0, p0, Lcom/beizi/ad/a/a/a;->f:Ljava/lang/String;

    iget-object v1, p0, Lcom/beizi/ad/a/a/a;->w:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v3, "rotationY"

    const/4 v4, 0x0

    .line 77
    iget v0, p0, Lcom/beizi/ad/a/a/a;->H:F

    neg-float v5, v0

    move-object v0, p0

    move-object v1, p1

    move-object v2, v6

    invoke-direct/range {v0 .. v5}, Lcom/beizi/ad/a/a/a;->a(Landroid/widget/ImageView;Ljava/util/List;Ljava/lang/String;FF)V

    const-string v3, "rotationY"

    .line 78
    iget v0, p0, Lcom/beizi/ad/a/a/a;->H:F

    neg-float v4, v0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, v6

    invoke-direct/range {v0 .. v5}, Lcom/beizi/ad/a/a/a;->a(Landroid/widget/ImageView;Ljava/util/List;Ljava/lang/String;FF)V

    goto :goto_1

    .line 79
    :cond_3
    iget-object v0, p0, Lcom/beizi/ad/a/a/a;->e:Ljava/lang/String;

    iget-object v1, p0, Lcom/beizi/ad/a/a/a;->w:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v3, "rotationY"

    const/4 v4, 0x0

    .line 80
    iget v5, p0, Lcom/beizi/ad/a/a/a;->H:F

    move-object v0, p0

    move-object v1, p1

    move-object v2, v6

    invoke-direct/range {v0 .. v5}, Lcom/beizi/ad/a/a/a;->a(Landroid/widget/ImageView;Ljava/util/List;Ljava/lang/String;FF)V

    const-string v3, "rotationY"

    .line 81
    iget v4, p0, Lcom/beizi/ad/a/a/a;->H:F

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, v6

    invoke-direct/range {v0 .. v5}, Lcom/beizi/ad/a/a/a;->a(Landroid/widget/ImageView;Ljava/util/List;Ljava/lang/String;FF)V

    goto :goto_1

    :cond_4
    const-string v3, "rotationY"

    const/4 v4, 0x0

    .line 82
    iget v5, p0, Lcom/beizi/ad/a/a/a;->H:F

    move-object v0, p0

    move-object v1, p1

    move-object v2, v6

    invoke-direct/range {v0 .. v5}, Lcom/beizi/ad/a/a/a;->a(Landroid/widget/ImageView;Ljava/util/List;Ljava/lang/String;FF)V

    const-string v3, "rotationY"

    .line 83
    iget v4, p0, Lcom/beizi/ad/a/a/a;->H:F

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, v6

    invoke-direct/range {v0 .. v5}, Lcom/beizi/ad/a/a/a;->a(Landroid/widget/ImageView;Ljava/util/List;Ljava/lang/String;FF)V

    const-string v3, "rotationY"

    const/4 v4, 0x0

    .line 84
    iget v0, p0, Lcom/beizi/ad/a/a/a;->H:F

    neg-float v5, v0

    move-object v0, p0

    move-object v1, p1

    move-object v2, v6

    invoke-direct/range {v0 .. v5}, Lcom/beizi/ad/a/a/a;->a(Landroid/widget/ImageView;Ljava/util/List;Ljava/lang/String;FF)V

    const-string v3, "rotationY"

    .line 85
    iget v0, p0, Lcom/beizi/ad/a/a/a;->H:F

    neg-float v4, v0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, v6

    invoke-direct/range {v0 .. v5}, Lcom/beizi/ad/a/a/a;->a(Landroid/widget/ImageView;Ljava/util/List;Ljava/lang/String;FF)V

    .line 86
    :cond_5
    :goto_1
    iget-object v0, p0, Lcom/beizi/ad/a/a/a;->x:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 87
    iget-object v0, p0, Lcom/beizi/ad/a/a/a;->f:Ljava/lang/String;

    iget-object v1, p0, Lcom/beizi/ad/a/a/a;->x:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v3, "rotation"

    const/4 v4, 0x0

    .line 88
    iget v0, p0, Lcom/beizi/ad/a/a/a;->I:F

    neg-float v5, v0

    move-object v0, p0

    move-object v1, p1

    move-object v2, v6

    invoke-direct/range {v0 .. v5}, Lcom/beizi/ad/a/a/a;->a(Landroid/widget/ImageView;Ljava/util/List;Ljava/lang/String;FF)V

    const-string v3, "rotation"

    .line 89
    iget v0, p0, Lcom/beizi/ad/a/a/a;->I:F

    neg-float v4, v0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, v6

    invoke-direct/range {v0 .. v5}, Lcom/beizi/ad/a/a/a;->a(Landroid/widget/ImageView;Ljava/util/List;Ljava/lang/String;FF)V

    goto :goto_2

    .line 90
    :cond_6
    iget-object v0, p0, Lcom/beizi/ad/a/a/a;->e:Ljava/lang/String;

    iget-object v1, p0, Lcom/beizi/ad/a/a/a;->x:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    const-string v3, "rotation"

    const/4 v4, 0x0

    .line 91
    iget v5, p0, Lcom/beizi/ad/a/a/a;->I:F

    move-object v0, p0

    move-object v1, p1

    move-object v2, v6

    invoke-direct/range {v0 .. v5}, Lcom/beizi/ad/a/a/a;->a(Landroid/widget/ImageView;Ljava/util/List;Ljava/lang/String;FF)V

    const-string v3, "rotation"

    .line 92
    iget v4, p0, Lcom/beizi/ad/a/a/a;->I:F

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, v6

    invoke-direct/range {v0 .. v5}, Lcom/beizi/ad/a/a/a;->a(Landroid/widget/ImageView;Ljava/util/List;Ljava/lang/String;FF)V

    goto :goto_2

    :cond_7
    const-string v3, "rotation"

    const/4 v4, 0x0

    .line 93
    iget v5, p0, Lcom/beizi/ad/a/a/a;->I:F

    move-object v0, p0

    move-object v1, p1

    move-object v2, v6

    invoke-direct/range {v0 .. v5}, Lcom/beizi/ad/a/a/a;->a(Landroid/widget/ImageView;Ljava/util/List;Ljava/lang/String;FF)V

    const-string v3, "rotation"

    .line 94
    iget v4, p0, Lcom/beizi/ad/a/a/a;->I:F

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, v6

    invoke-direct/range {v0 .. v5}, Lcom/beizi/ad/a/a/a;->a(Landroid/widget/ImageView;Ljava/util/List;Ljava/lang/String;FF)V

    const-string v3, "rotation"

    const/4 v4, 0x0

    .line 95
    iget v0, p0, Lcom/beizi/ad/a/a/a;->I:F

    neg-float v5, v0

    move-object v0, p0

    move-object v1, p1

    move-object v2, v6

    invoke-direct/range {v0 .. v5}, Lcom/beizi/ad/a/a/a;->a(Landroid/widget/ImageView;Ljava/util/List;Ljava/lang/String;FF)V

    const-string v3, "rotation"

    .line 96
    iget v0, p0, Lcom/beizi/ad/a/a/a;->I:F

    neg-float v4, v0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, v6

    invoke-direct/range {v0 .. v5}, Lcom/beizi/ad/a/a/a;->a(Landroid/widget/ImageView;Ljava/util/List;Ljava/lang/String;FF)V

    .line 97
    :cond_8
    :goto_2
    iget-object p1, p0, Lcom/beizi/ad/a/a/a;->J:Landroid/animation/AnimatorSet;

    if-eqz p1, :cond_9

    const/4 p1, 0x0

    .line 98
    iput-object p1, p0, Lcom/beizi/ad/a/a/a;->J:Landroid/animation/AnimatorSet;

    .line 99
    :cond_9
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_a

    .line 100
    new-instance p1, Landroid/animation/AnimatorSet;

    invoke-direct {p1}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object p1, p0, Lcom/beizi/ad/a/a/a;->J:Landroid/animation/AnimatorSet;

    .line 101
    new-instance v0, Lcom/beizi/ad/a/a/a$3;

    invoke-direct {v0, p0}, Lcom/beizi/ad/a/a/a$3;-><init>(Lcom/beizi/ad/a/a/a;)V

    invoke-virtual {p1, v0}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 102
    iget-object p1, p0, Lcom/beizi/ad/a/a/a;->J:Landroid/animation/AnimatorSet;

    invoke-virtual {p1, v6}, Landroid/animation/AnimatorSet;->playSequentially(Ljava/util/List;)V

    .line 103
    iget-object p1, p0, Lcom/beizi/ad/a/a/a;->J:Landroid/animation/AnimatorSet;

    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->start()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p1

    .line 104
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_a
    :goto_3
    return-void
.end method

.method private a(Landroid/widget/ImageView;Ljava/util/List;Ljava/lang/String;FF)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/ImageView;",
            "Ljava/util/List<",
            "Landroid/animation/Animator;",
            ">;",
            "Ljava/lang/String;",
            "FF)V"
        }
    .end annotation

    const/4 v0, 0x2

    :try_start_0
    new-array v0, v0, [F

    const/4 v1, 0x0

    aput p4, v0, v1

    const/4 p4, 0x1

    aput p5, v0, p4

    .line 105
    invoke-static {p1, p3, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    .line 106
    iget p3, p0, Lcom/beizi/ad/a/a/a;->F:I

    int-to-long p3, p3

    invoke-virtual {p1, p3, p4}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 107
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 108
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/beizi/ad/a/a/a;Landroid/hardware/SensorEvent;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/beizi/ad/a/a/a;->a(Landroid/hardware/SensorEvent;)V

    return-void
.end method

.method static synthetic a(Lcom/beizi/ad/a/a/a;)[F
    .locals 0

    .line 4
    iget-object p0, p0, Lcom/beizi/ad/a/a/a;->p:[F

    return-object p0
.end method

.method static synthetic b(Lcom/beizi/ad/a/a/a;D)D
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/beizi/ad/a/a/a;->t:D

    return-wide p1
.end method

.method static synthetic b(Lcom/beizi/ad/a/a/a;)Landroid/animation/AnimatorSet;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/beizi/ad/a/a/a;->J:Landroid/animation/AnimatorSet;

    return-object p0
.end method

.method private b(Landroid/view/ViewGroup;)[I
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const-string v2, ";"

    const-string v3, "%"

    const/4 v4, 0x4

    new-array v4, v4, [I

    const/4 v8, 0x0

    if-eqz v0, :cond_14

    .line 6
    :try_start_0
    iget-object v9, v1, Lcom/beizi/ad/a/a/a;->n:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRenderBean;

    if-nez v9, :cond_0

    goto/16 :goto_4

    .line 7
    :cond_0
    invoke-virtual {v9}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRenderBean;->getCenterX()Ljava/lang/String;

    move-result-object v9

    .line 8
    iget-object v10, v1, Lcom/beizi/ad/a/a/a;->n:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRenderBean;

    invoke-virtual {v10}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRenderBean;->getCenterY()Ljava/lang/String;

    move-result-object v10

    .line 9
    iget-object v11, v1, Lcom/beizi/ad/a/a/a;->n:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRenderBean;

    invoke-virtual {v11}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRenderBean;->getWidth()Ljava/lang/String;

    move-result-object v11

    .line 10
    iget-object v12, v1, Lcom/beizi/ad/a/a/a;->n:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRenderBean;

    invoke-virtual {v12}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRenderBean;->getHeight()Ljava/lang/String;

    move-result-object v12

    .line 11
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v13
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v14, "10"

    const-string v15, "0"

    if-nez v13, :cond_1

    :try_start_1
    invoke-virtual {v15, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_2

    :cond_1
    move-object v9, v14

    .line 12
    :cond_2
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_3

    invoke-virtual {v15, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_4

    :cond_3
    move-object v10, v14

    .line 13
    :cond_4
    invoke-virtual {v0, v8, v8}, Landroid/view/ViewGroup;->measure(II)V

    .line 14
    iget-object v13, v1, Lcom/beizi/ad/a/a/a;->h:Landroid/content/Context;

    invoke-virtual/range {p1 .. p1}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result v14

    int-to-float v14, v14

    invoke-static {v13, v14}, Lcom/beizi/ad/internal/utilities/ViewUtil;->px2dip(Landroid/content/Context;F)I

    move-result v13

    .line 15
    iget-object v14, v1, Lcom/beizi/ad/a/a/a;->h:Landroid/content/Context;

    invoke-virtual/range {p1 .. p1}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result v5

    int-to-float v5, v5

    invoke-static {v14, v5}, Lcom/beizi/ad/internal/utilities/ViewUtil;->px2dip(Landroid/content/Context;F)I

    move-result v5

    if-gtz v13, :cond_5

    .line 16
    iget-object v13, v1, Lcom/beizi/ad/a/a/a;->h:Landroid/content/Context;

    invoke-static {v13}, Lcom/beizi/ad/lance/a/p;->k(Landroid/content/Context;)I

    move-result v13

    .line 17
    :cond_5
    sget-object v14, Lcom/beizi/ad/a/a/a;->g:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "position containerWidth:"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, ";containerHeight:"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    invoke-virtual/range {p1 .. p1}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    iget v7, v7, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p1 .. p1}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 19
    invoke-static {v14, v0}, Lcom/beizi/ad/lance/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const-string v6, "20"

    if-nez v0, :cond_6

    :try_start_2
    invoke-virtual {v15, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    :cond_6
    move-object v11, v6

    .line 21
    :cond_7
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    invoke-virtual {v15, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    :cond_8
    move-object v12, v6

    .line 22
    :cond_9
    invoke-virtual {v9, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 23
    invoke-virtual {v9, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v9, v8, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    mul-int v0, v0, v13

    div-int/lit8 v0, v0, 0x64

    goto :goto_0

    .line 24
    :cond_a
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_b

    .line 25
    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_b
    const/4 v0, 0x0

    .line 26
    :goto_0
    invoke-virtual {v10, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_c

    .line 27
    invoke-virtual {v10, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v10, v8, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    mul-int v5, v5, v6

    div-int/lit8 v5, v5, 0x64

    goto :goto_1

    .line 28
    :cond_c
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_d

    .line 29
    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    goto :goto_1

    :cond_d
    const/4 v5, 0x0

    .line 30
    :goto_1
    invoke-virtual {v11, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    const/16 v7, 0x14

    if-eqz v6, :cond_e

    .line 31
    invoke-virtual {v11, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v6

    .line 32
    invoke-virtual {v11, v8, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    mul-int v13, v13, v6

    div-int/lit8 v13, v13, 0x64

    goto :goto_2

    .line 33
    :cond_e
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_f

    .line 34
    invoke-static {v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v13

    goto :goto_2

    :cond_f
    const/16 v13, 0x14

    .line 35
    :goto_2
    invoke-virtual {v12, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_10

    .line 36
    invoke-virtual {v12, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v12, v8, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    mul-int v3, v3, v13

    div-int/lit8 v7, v3, 0x64

    goto :goto_3

    .line 37
    :cond_10
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_11

    .line 38
    invoke-static {v12}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    .line 39
    :cond_11
    :goto_3
    iget-object v3, v1, Lcom/beizi/ad/a/a/a;->h:Landroid/content/Context;

    int-to-float v6, v13

    invoke-static {v3, v6}, Lcom/beizi/ad/internal/utilities/ViewUtil;->dip2px(Landroid/content/Context;F)I

    move-result v3

    .line 40
    iget-object v6, v1, Lcom/beizi/ad/a/a/a;->h:Landroid/content/Context;

    int-to-float v7, v7

    invoke-static {v6, v7}, Lcom/beizi/ad/internal/utilities/ViewUtil;->dip2px(Landroid/content/Context;F)I

    move-result v6

    .line 41
    iget-object v7, v1, Lcom/beizi/ad/a/a/a;->h:Landroid/content/Context;

    int-to-float v0, v0

    invoke-static {v7, v0}, Lcom/beizi/ad/internal/utilities/ViewUtil;->dip2px(Landroid/content/Context;F)I

    move-result v0

    .line 42
    iget-object v7, v1, Lcom/beizi/ad/a/a/a;->h:Landroid/content/Context;

    int-to-float v5, v5

    invoke-static {v7, v5}, Lcom/beizi/ad/internal/utilities/ViewUtil;->dip2px(Landroid/content/Context;F)I

    move-result v5

    aput v3, v4, v8

    const/4 v3, 0x1

    aput v6, v4, v3

    if-lez v0, :cond_12

    const/4 v3, 0x2

    aput v0, v4, v3

    :cond_12
    if-lez v5, :cond_13

    const/4 v0, 0x3

    aput v5, v4, v0

    .line 43
    :cond_13
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "position widthInt:"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget v3, v4, v8

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ";heightInt:"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v3, 0x1

    aget v3, v4, v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ";centerX:"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v3, 0x2

    aget v3, v4, v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ";centerY:"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v3, 0x3

    aget v3, v4, v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v14, v0}, Lcom/beizi/ad/lance/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    .line 44
    :cond_14
    :goto_4
    iget-object v0, v1, Lcom/beizi/ad/a/a/a;->h:Landroid/content/Context;

    const/high16 v2, 0x41a00000    # 20.0f

    invoke-static {v0, v2}, Lcom/beizi/ad/internal/utilities/ViewUtil;->dip2px(Landroid/content/Context;F)I

    move-result v0

    .line 45
    iget-object v2, v1, Lcom/beizi/ad/a/a/a;->h:Landroid/content/Context;

    const/high16 v3, 0x41200000    # 10.0f

    invoke-static {v2, v3}, Lcom/beizi/ad/internal/utilities/ViewUtil;->dip2px(Landroid/content/Context;F)I

    move-result v2

    aput v0, v4, v8

    const/4 v3, 0x1

    aput v0, v4, v3

    const/4 v0, 0x2

    aput v2, v4, v0

    const/4 v0, 0x3

    aput v2, v4, v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object v4

    :catch_0
    move-exception v0

    .line 46
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_5
    return-object v4
.end method

.method static synthetic c(Lcom/beizi/ad/a/a/a;D)D
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/beizi/ad/a/a/a;->u:D

    return-wide p1
.end method

.method private d()Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/a/a/a;->l:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;->getRules()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    .line 4
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;

    if-nez v2, :cond_3

    goto :goto_0

    .line 5
    :cond_3
    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getAxis()Ljava/lang/String;

    move-result-object v3

    .line 6
    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getAngle()D

    move-result-wide v4

    .line 7
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    const-wide/16 v2, 0x0

    cmpl-double v6, v4, v2

    if-lez v6, :cond_2

    const/4 v0, 0x1

    return v0

    :cond_4
    :goto_1
    return v1
.end method

.method private e()V
    .locals 2

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/beizi/ad/a/a/a;->i()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/beizi/ad/a/a/a;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iput-boolean v1, p0, Lcom/beizi/ad/a/a/a;->y:Z

    goto :goto_1

    .line 3
    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/beizi/ad/a/a/a;->g()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/beizi/ad/a/a/a;->y:Z

    goto :goto_1

    .line 5
    :cond_2
    iput-boolean v1, p0, Lcom/beizi/ad/a/a/a;->y:Z

    .line 6
    :goto_1
    iget-boolean v0, p0, Lcom/beizi/ad/a/a/a;->y:Z

    if-eqz v0, :cond_3

    .line 7
    iget-object v0, p0, Lcom/beizi/ad/a/a/a;->m:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    iput-object v0, p0, Lcom/beizi/ad/a/a/a;->k:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    .line 8
    invoke-direct {p0}, Lcom/beizi/ad/a/a/a;->f()V

    return-void

    .line 9
    :cond_3
    iget-object v0, p0, Lcom/beizi/ad/a/a/a;->l:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    iput-object v0, p0, Lcom/beizi/ad/a/a/a;->k:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    .line 10
    invoke-direct {p0}, Lcom/beizi/ad/a/a/a;->f()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_2
    return-void
.end method

.method private f()V
    .locals 13

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/beizi/ad/a/a/a;->k:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

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
    iget-object v1, p0, Lcom/beizi/ad/a/a/a;->k:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

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

    .line 6
    :cond_3
    iget-object v5, p0, Lcom/beizi/ad/a/a/a;->a:Ljava/lang/String;

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

    iput-wide v5, p0, Lcom/beizi/ad/a/a/a;->s:D

    goto :goto_1

    .line 9
    :cond_4
    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getAngle()D

    move-result-wide v5

    iput-wide v5, p0, Lcom/beizi/ad/a/a/a;->s:D

    .line 10
    :goto_1
    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getAngle()D

    move-result-wide v6

    .line 11
    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getDirection()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/beizi/ad/a/a/a;->v:Ljava/lang/String;

    goto :goto_0

    .line 12
    :cond_5
    iget-object v5, p0, Lcom/beizi/ad/a/a/a;->b:Ljava/lang/String;

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

    iput-wide v8, p0, Lcom/beizi/ad/a/a/a;->t:D

    goto :goto_2

    .line 15
    :cond_6
    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getAngle()D

    move-result-wide v8

    iput-wide v8, p0, Lcom/beizi/ad/a/a/a;->t:D

    .line 16
    :goto_2
    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getAngle()D

    move-result-wide v8

    .line 17
    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getDirection()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/beizi/ad/a/a/a;->w:Ljava/lang/String;

    goto :goto_0

    .line 18
    :cond_7
    iget-object v5, p0, Lcom/beizi/ad/a/a/a;->c:Ljava/lang/String;

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

    iput-wide v10, p0, Lcom/beizi/ad/a/a/a;->u:D

    goto :goto_3

    .line 21
    :cond_8
    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getAngle()D

    move-result-wide v10

    iput-wide v10, p0, Lcom/beizi/ad/a/a/a;->u:D

    .line 22
    :goto_3
    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getAngle()D

    move-result-wide v10

    .line 23
    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRuleBean;->getDirection()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/beizi/ad/a/a/a;->x:Ljava/lang/String;

    goto/16 :goto_0

    :cond_9
    if-lez v1, :cond_b

    .line 24
    invoke-virtual {p0, v1}, Lcom/beizi/ad/a/a/a;->a(I)I

    move-result v0

    .line 25
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    new-instance v2, Lcom/beizi/ad/a/a/a$1;

    move-object v4, v2

    move-object v5, p0

    invoke-direct/range {v4 .. v11}, Lcom/beizi/ad/a/a/a$1;-><init>(Lcom/beizi/ad/a/a/a;DDD)V

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

.method private g()Z
    .locals 2

    const/4 v0, 0x0

    .line 1
    :try_start_0
    iget-object v1, p0, Lcom/beizi/ad/a/a/a;->m:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    if-nez v1, :cond_0

    return v0

    :cond_0
    if-eqz v1, :cond_1

    .line 2
    invoke-virtual {v1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;->getRules()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/beizi/ad/a/a/a;->m:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    .line 3
    invoke-virtual {v1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;->getRules()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    iget-object v1, p0, Lcom/beizi/ad/a/a/a;->m:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    .line 4
    invoke-virtual {v1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;->getStyle()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleStyleBean;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    return v0

    :catch_0
    move-exception v1

    .line 5
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    return v0
.end method

.method private h()Z
    .locals 8

    const/4 v0, 0x0

    .line 1
    :try_start_0
    iget-object v1, p0, Lcom/beizi/ad/a/a/a;->m:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    if-nez v1, :cond_0

    return v0

    .line 2
    :cond_0
    invoke-virtual {v1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;->getCoolTime()J

    move-result-wide v1

    .line 3
    iget-object v3, p0, Lcom/beizi/ad/a/a/a;->h:Landroid/content/Context;

    iget-object v4, p0, Lcom/beizi/ad/a/a/a;->E:Ljava/lang/String;

    const-wide/16 v5, 0x0

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-static {v3, v4, v7}, Lcom/beizi/ad/internal/utilities/SPUtils;->getFromFusionSdk(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    cmp-long v7, v3, v5

    if-eqz v7, :cond_1

    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sub-long/2addr v5, v3

    cmp-long v3, v5, v1

    if-gez v3, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v1

    .line 5
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_0
    return v0
.end method

.method private i()Z
    .locals 7

    const/4 v0, 0x0

    .line 1
    :try_start_0
    iget-object v1, p0, Lcom/beizi/ad/a/a/a;->m:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    if-nez v1, :cond_0

    return v0

    .line 2
    :cond_0
    invoke-virtual {v1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;->getUserProtectTime()J

    move-result-wide v1

    .line 3
    iget-object v3, p0, Lcom/beizi/ad/a/a/a;->h:Landroid/content/Context;

    .line 4
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    iget-object v4, p0, Lcom/beizi/ad/a/a/a;->h:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v3

    iget-wide v3, v3, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sub-long/2addr v5, v3

    cmp-long v3, v5, v1

    if-gez v3, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v1

    .line 6
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_0
    return v0
.end method

.method private j()V
    .locals 3

    const/4 v0, 0x0

    .line 1
    iput v0, p0, Lcom/beizi/ad/a/a/a;->A:F

    .line 2
    iget-object v1, p0, Lcom/beizi/ad/a/a/a;->p:[F

    const/4 v2, 0x0

    aput v0, v1, v2

    const/4 v2, 0x1

    .line 3
    aput v0, v1, v2

    const/4 v2, 0x2

    .line 4
    aput v0, v1, v2

    return-void
.end method

.method private k()V
    .locals 4

    .line 1
    :try_start_0
    sget-object v0, Lcom/beizi/ad/a/a/a;->q:Landroid/hardware/SensorManager;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/a/a/a;->h:Landroid/content/Context;

    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "sensor"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/SensorManager;

    sput-object v0, Lcom/beizi/ad/a/a/a;->q:Landroid/hardware/SensorManager;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/a/a/a;->r:Landroid/hardware/Sensor;

    if-nez v0, :cond_1

    .line 5
    sget-object v0, Lcom/beizi/ad/a/a/a;->q:Landroid/hardware/SensorManager;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/a/a/a;->r:Landroid/hardware/Sensor;

    .line 6
    :cond_1
    sget-object v0, Lcom/beizi/ad/a/a/a;->q:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lcom/beizi/ad/a/a/a;->L:Landroid/hardware/SensorEventListener;

    iget-object v2, p0, Lcom/beizi/ad/a/a/a;->r:Landroid/hardware/Sensor;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method private l()V
    .locals 2

    .line 1
    :try_start_0
    sget-object v0, Lcom/beizi/ad/a/a/a;->g:Ljava/lang/String;

    const-string v1, "enter unRegisterListener"

    invoke-static {v0, v1}, Lcom/beizi/ad/lance/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lcom/beizi/ad/a/a/a;->q:Landroid/hardware/SensorManager;

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p0, Lcom/beizi/ad/a/a/a;->L:Landroid/hardware/SensorEventListener;

    invoke-virtual {v0, v1}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method private m()Z
    .locals 10

    const/4 v0, 0x0

    .line 1
    :try_start_0
    iget-wide v1, p0, Lcom/beizi/ad/a/a/a;->s:D

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    cmpl-double v7, v1, v3

    if-lez v7, :cond_2

    .line 2
    iget-object v1, p0, Lcom/beizi/ad/a/a/a;->f:Ljava/lang/String;

    iget-object v2, p0, Lcom/beizi/ad/a/a/a;->v:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    iget-object v1, p0, Lcom/beizi/ad/a/a/a;->p:[F

    aget v2, v1, v0

    cmpl-float v2, v2, v5

    if-lez v2, :cond_2

    aget v1, v1, v0

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    float-to-double v1, v1

    iget-wide v7, p0, Lcom/beizi/ad/a/a/a;->s:D

    cmpl-double v9, v1, v7

    if-ltz v9, :cond_2

    return v6

    .line 4
    :cond_0
    iget-object v1, p0, Lcom/beizi/ad/a/a/a;->e:Ljava/lang/String;

    iget-object v2, p0, Lcom/beizi/ad/a/a/a;->v:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 5
    iget-object v1, p0, Lcom/beizi/ad/a/a/a;->p:[F

    aget v2, v1, v0

    cmpg-float v2, v2, v5

    if-gez v2, :cond_2

    aget v1, v1, v0

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    float-to-double v1, v1

    iget-wide v7, p0, Lcom/beizi/ad/a/a/a;->s:D

    cmpl-double v9, v1, v7

    if-ltz v9, :cond_2

    return v6

    .line 6
    :cond_1
    iget-object v1, p0, Lcom/beizi/ad/a/a/a;->d:Ljava/lang/String;

    iget-object v2, p0, Lcom/beizi/ad/a/a/a;->v:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 7
    iget-object v1, p0, Lcom/beizi/ad/a/a/a;->p:[F

    aget v1, v1, v0

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    float-to-double v1, v1

    iget-wide v7, p0, Lcom/beizi/ad/a/a/a;->s:D

    cmpl-double v9, v1, v7

    if-ltz v9, :cond_2

    return v6

    .line 8
    :cond_2
    iget-wide v1, p0, Lcom/beizi/ad/a/a/a;->t:D

    cmpl-double v7, v1, v3

    if-lez v7, :cond_5

    .line 9
    iget-object v1, p0, Lcom/beizi/ad/a/a/a;->f:Ljava/lang/String;

    iget-object v2, p0, Lcom/beizi/ad/a/a/a;->w:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 10
    iget-object v1, p0, Lcom/beizi/ad/a/a/a;->p:[F

    aget v2, v1, v6

    cmpg-float v2, v2, v5

    if-gez v2, :cond_5

    aget v1, v1, v6

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    float-to-double v1, v1

    iget-wide v7, p0, Lcom/beizi/ad/a/a/a;->t:D

    cmpl-double v9, v1, v7

    if-ltz v9, :cond_5

    return v6

    .line 11
    :cond_3
    iget-object v1, p0, Lcom/beizi/ad/a/a/a;->e:Ljava/lang/String;

    iget-object v2, p0, Lcom/beizi/ad/a/a/a;->w:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 12
    iget-object v1, p0, Lcom/beizi/ad/a/a/a;->p:[F

    aget v2, v1, v6

    cmpl-float v2, v2, v5

    if-lez v2, :cond_5

    aget v1, v1, v6

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    float-to-double v1, v1

    iget-wide v7, p0, Lcom/beizi/ad/a/a/a;->t:D

    cmpl-double v9, v1, v7

    if-ltz v9, :cond_5

    return v6

    .line 13
    :cond_4
    iget-object v1, p0, Lcom/beizi/ad/a/a/a;->d:Ljava/lang/String;

    iget-object v2, p0, Lcom/beizi/ad/a/a/a;->w:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 14
    iget-object v1, p0, Lcom/beizi/ad/a/a/a;->p:[F

    aget v1, v1, v6

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    float-to-double v1, v1

    iget-wide v7, p0, Lcom/beizi/ad/a/a/a;->t:D

    cmpl-double v9, v1, v7

    if-ltz v9, :cond_5

    return v6

    .line 15
    :cond_5
    iget-wide v1, p0, Lcom/beizi/ad/a/a/a;->u:D

    cmpl-double v7, v1, v3

    if-lez v7, :cond_8

    .line 16
    iget-object v1, p0, Lcom/beizi/ad/a/a/a;->f:Ljava/lang/String;

    iget-object v2, p0, Lcom/beizi/ad/a/a/a;->x:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x2

    if-eqz v1, :cond_6

    .line 17
    iget-object v1, p0, Lcom/beizi/ad/a/a/a;->p:[F

    aget v3, v1, v2

    cmpl-float v3, v3, v5

    if-lez v3, :cond_8

    aget v1, v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    float-to-double v1, v1

    iget-wide v3, p0, Lcom/beizi/ad/a/a/a;->u:D

    cmpl-double v5, v1, v3

    if-ltz v5, :cond_8

    return v6

    .line 18
    :cond_6
    iget-object v1, p0, Lcom/beizi/ad/a/a/a;->e:Ljava/lang/String;

    iget-object v3, p0, Lcom/beizi/ad/a/a/a;->x:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 19
    iget-object v1, p0, Lcom/beizi/ad/a/a/a;->p:[F

    aget v3, v1, v2

    cmpg-float v3, v3, v5

    if-gez v3, :cond_8

    aget v1, v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    float-to-double v1, v1

    iget-wide v3, p0, Lcom/beizi/ad/a/a/a;->u:D

    cmpl-double v5, v1, v3

    if-ltz v5, :cond_8

    return v6

    .line 20
    :cond_7
    iget-object v1, p0, Lcom/beizi/ad/a/a/a;->d:Ljava/lang/String;

    iget-object v3, p0, Lcom/beizi/ad/a/a/a;->x:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 21
    iget-object v1, p0, Lcom/beizi/ad/a/a/a;->p:[F

    aget v1, v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    float-to-double v1, v1

    iget-wide v3, p0, Lcom/beizi/ad/a/a/a;->u:D
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    cmpl-double v5, v1, v3

    if-ltz v5, :cond_8

    return v6

    :catch_0
    move-exception v1

    .line 22
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_8
    return v0
.end method

.method private n()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/beizi/ad/a/a/a;->B:Lcom/beizi/ad/a/a/a$a;

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/beizi/ad/a/a/a;->C:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    sget-object v0, Lcom/beizi/ad/a/a/a;->g:Ljava/lang/String;

    const-string v1, "onEulerAngleHappened"

    invoke-static {v0, v1}, Lcom/beizi/ad/lance/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0}, Lcom/beizi/ad/a/a/a;->b()V

    .line 4
    iget-boolean v0, p0, Lcom/beizi/ad/a/a/a;->y:Z

    if-nez v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/beizi/ad/a/a/a;->h:Landroid/content/Context;

    iget-object v1, p0, Lcom/beizi/ad/a/a/a;->E:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/beizi/ad/internal/utilities/SPUtils;->putToFusionSdk(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/beizi/ad/a/a/a;->B:Lcom/beizi/ad/a/a/a$a;

    invoke-interface {v0}, Lcom/beizi/ad/a/a/a$a;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_2
    :goto_0
    return-void

    :catch_0
    move-exception v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 4

    .line 8
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    int-to-double v2, p1

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v2

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    add-double/2addr v0, v2

    double-to-int p1, v0

    return p1
.end method

.method public a()V
    .locals 1

    .line 9
    iget-boolean v0, p0, Lcom/beizi/ad/a/a/a;->D:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/beizi/ad/a/a/a;->K:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Lcom/beizi/ad/a/a/a;->C:Z

    .line 11
    invoke-direct {p0}, Lcom/beizi/ad/a/a/a;->j()V

    .line 12
    invoke-direct {p0}, Lcom/beizi/ad/a/a/a;->e()V

    .line 13
    invoke-direct {p0}, Lcom/beizi/ad/a/a/a;->k()V

    :cond_1
    :goto_0
    return-void
.end method

.method public a(Landroid/view/ViewGroup;)V
    .locals 10

    if-eqz p1, :cond_e

    .line 15
    :try_start_0
    iget-object v0, p0, Lcom/beizi/ad/a/a/a;->h:Landroid/content/Context;

    if-eqz v0, :cond_e

    iget-boolean v0, p0, Lcom/beizi/ad/a/a/a;->K:Z

    if-nez v0, :cond_0

    goto/16 :goto_1

    .line 16
    :cond_0
    new-instance v0, Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/beizi/ad/a/a/a;->h:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 18
    sget v2, Lcom/beizi/ad/R$mipmap;->beizi_interaction_icon_euler_angle:I

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    const/4 v2, 0x0

    .line 19
    iget-object v3, p0, Lcom/beizi/ad/a/a/a;->k:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    if-eqz v3, :cond_1

    .line 20
    invoke-virtual {v3}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;->getStyle()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleStyleBean;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 21
    invoke-virtual {v3}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleStyleBean;->getImgs()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 22
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    if-lez v4, :cond_1

    .line 23
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 24
    :cond_1
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 25
    iget-object v3, p0, Lcom/beizi/ad/a/a/a;->h:Landroid/content/Context;

    invoke-static {v3}, Lcom/beizi/ad/internal/utilities/ImageManager;->with(Landroid/content/Context;)Lcom/beizi/ad/internal/utilities/ImageManager;

    move-result-object v3

    new-instance v4, Lcom/beizi/ad/a/a/a$2;

    invoke-direct {v4, p0, v0}, Lcom/beizi/ad/a/a/a$2;-><init>(Lcom/beizi/ad/a/a/a;Landroid/widget/ImageView;)V

    invoke-virtual {v3, v2, v4}, Lcom/beizi/ad/internal/utilities/ImageManager;->getCacheBitmap(Ljava/lang/String;Lcom/beizi/ad/internal/utilities/ImageManager$BitmapLoadedListener;)V

    .line 26
    :cond_2
    invoke-direct {p0, p1}, Lcom/beizi/ad/a/a/a;->b(Landroid/view/ViewGroup;)[I

    move-result-object v2

    .line 27
    instance-of v3, p1, Landroid/widget/RelativeLayout;

    const/16 v4, 0x11

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, -0x2

    const/4 v8, -0x1

    const/4 v9, 0x1

    if-eqz v3, :cond_5

    .line 28
    new-instance v3, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v3, v8, v7}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 29
    aget v7, v2, v1

    if-lez v7, :cond_3

    .line 30
    aget v1, v2, v1

    iput v1, v3, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 31
    :cond_3
    aget v1, v2, v9

    if-lez v1, :cond_4

    .line 32
    aget v1, v2, v9

    iput v1, v3, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 33
    :cond_4
    aget v1, v2, v6

    iput v1, v3, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 34
    aget v1, v2, v5

    iput v1, v3, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 35
    invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 36
    invoke-virtual {p1, v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 37
    :cond_5
    instance-of v3, p1, Landroid/widget/FrameLayout;

    if-eqz v3, :cond_8

    .line 38
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v3, v8, v7, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 39
    aget v4, v2, v1

    if-lez v4, :cond_6

    .line 40
    aget v1, v2, v1

    iput v1, v3, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 41
    :cond_6
    aget v1, v2, v9

    if-lez v1, :cond_7

    .line 42
    aget v1, v2, v9

    iput v1, v3, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 43
    :cond_7
    aget v1, v2, v6

    iput v1, v3, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 44
    aget v1, v2, v5

    iput v1, v3, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 45
    invoke-virtual {p1, v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 46
    :cond_8
    instance-of v3, p1, Landroid/widget/LinearLayout;

    if-eqz v3, :cond_b

    .line 47
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v4, 0x41880000    # 17.0f

    invoke-direct {v3, v8, v7, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 48
    aget v4, v2, v1

    if-lez v4, :cond_9

    .line 49
    aget v1, v2, v1

    iput v1, v3, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 50
    :cond_9
    aget v1, v2, v9

    if-lez v1, :cond_a

    .line 51
    aget v1, v2, v9

    iput v1, v3, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 52
    :cond_a
    aget v1, v2, v6

    iput v1, v3, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 53
    aget v1, v2, v5

    iput v1, v3, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 54
    invoke-virtual {p1, v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 55
    :cond_b
    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v3, v8, v7}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 56
    aget v4, v2, v1

    if-lez v4, :cond_c

    .line 57
    aget v1, v2, v1

    iput v1, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 58
    :cond_c
    aget v1, v2, v9

    if-lez v1, :cond_d

    .line 59
    aget v1, v2, v9

    iput v1, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 60
    :cond_d
    invoke-virtual {p1, v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 61
    :goto_0
    invoke-direct {p0, v0}, Lcom/beizi/ad/a/a/a;->a(Landroid/widget/ImageView;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 62
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_e
    :goto_1
    return-void
.end method

.method public a(Lcom/beizi/ad/a/a/a$a;)V
    .locals 0

    .line 14
    iput-object p1, p0, Lcom/beizi/ad/a/a/a;->B:Lcom/beizi/ad/a/a/a$a;

    return-void
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/beizi/ad/a/a/a;->C:Z

    .line 4
    invoke-direct {p0}, Lcom/beizi/ad/a/a/a;->j()V

    .line 5
    invoke-direct {p0}, Lcom/beizi/ad/a/a/a;->l()V

    return-void
.end method

.method public c()V
    .locals 2

    .line 2
    :try_start_0
    invoke-direct {p0}, Lcom/beizi/ad/a/a/a;->l()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/beizi/ad/a/a/a;->i:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;

    .line 4
    iput-object v0, p0, Lcom/beizi/ad/a/a/a;->j:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewBean;

    .line 5
    iput-object v0, p0, Lcom/beizi/ad/a/a/a;->k:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    .line 6
    iput-object v0, p0, Lcom/beizi/ad/a/a/a;->l:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    .line 7
    iput-object v0, p0, Lcom/beizi/ad/a/a/a;->m:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleViewRuleBean;

    .line 8
    iput-object v0, p0, Lcom/beizi/ad/a/a/a;->n:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$EulerAngleRenderBean;

    .line 9
    iput-object v0, p0, Lcom/beizi/ad/a/a/a;->h:Landroid/content/Context;

    .line 10
    iput-object v0, p0, Lcom/beizi/ad/a/a/a;->B:Lcom/beizi/ad/a/a/a$a;

    .line 11
    sput-object v0, Lcom/beizi/ad/a/a/a;->q:Landroid/hardware/SensorManager;

    .line 12
    iput-object v0, p0, Lcom/beizi/ad/a/a/a;->r:Landroid/hardware/Sensor;

    .line 13
    iget-object v1, p0, Lcom/beizi/ad/a/a/a;->J:Landroid/animation/AnimatorSet;

    if-eqz v1, :cond_0

    .line 14
    invoke-virtual {v1}, Landroid/animation/AnimatorSet;->removeAllListeners()V

    .line 15
    :cond_0
    iput-object v0, p0, Lcom/beizi/ad/a/a/a;->J:Landroid/animation/AnimatorSet;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method
