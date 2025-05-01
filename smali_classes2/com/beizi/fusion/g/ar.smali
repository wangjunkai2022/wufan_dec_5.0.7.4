.class public Lcom/beizi/fusion/g/ar;
.super Ljava/lang/Object;
.source "ShakeUtil.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/fusion/g/ar$a;
    }
.end annotation


# static fields
.field private static b:Landroid/hardware/SensorManager;


# instance fields
.field a:Lcom/beizi/fusion/widget/ShakeView;

.field private c:Landroid/content/Context;

.field private d:D

.field private e:D

.field private f:D

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:I

.field private l:I

.field private m:F

.field private n:F

.field private o:F

.field private p:I

.field private q:Lcom/beizi/fusion/g/ar$a;

.field private r:Z

.field private s:I

.field private t:J

.field private u:Lcom/beizi/fusion/update/ShakeArcView;

.field private v:I

.field private final w:Landroid/hardware/SensorEventListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/beizi/fusion/g/ar;->k:I

    .line 3
    iput v0, p0, Lcom/beizi/fusion/g/ar;->l:I

    const/high16 v1, -0x3d380000    # -100.0f

    .line 4
    iput v1, p0, Lcom/beizi/fusion/g/ar;->m:F

    iput v1, p0, Lcom/beizi/fusion/g/ar;->n:F

    iput v1, p0, Lcom/beizi/fusion/g/ar;->o:F

    .line 5
    iput v0, p0, Lcom/beizi/fusion/g/ar;->p:I

    const/4 v1, 0x0

    .line 6
    iput-object v1, p0, Lcom/beizi/fusion/g/ar;->q:Lcom/beizi/fusion/g/ar$a;

    .line 7
    iput-boolean v0, p0, Lcom/beizi/fusion/g/ar;->r:Z

    const/16 v2, 0xc8

    .line 8
    iput v2, p0, Lcom/beizi/fusion/g/ar;->s:I

    const-wide/16 v2, 0x0

    .line 9
    iput-wide v2, p0, Lcom/beizi/fusion/g/ar;->t:J

    .line 10
    iput-object v1, p0, Lcom/beizi/fusion/g/ar;->u:Lcom/beizi/fusion/update/ShakeArcView;

    .line 11
    iput v0, p0, Lcom/beizi/fusion/g/ar;->v:I

    .line 12
    new-instance v0, Lcom/beizi/fusion/g/ar$1;

    invoke-direct {v0, p0}, Lcom/beizi/fusion/g/ar$1;-><init>(Lcom/beizi/fusion/g/ar;)V

    iput-object v0, p0, Lcom/beizi/fusion/g/ar;->w:Landroid/hardware/SensorEventListener;

    .line 13
    iput-object p1, p0, Lcom/beizi/fusion/g/ar;->c:Landroid/content/Context;

    .line 14
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "sensor"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/hardware/SensorManager;

    sput-object p1, Lcom/beizi/fusion/g/ar;->b:Landroid/hardware/SensorManager;

    return-void
.end method

.method private a(FFFD)D
    .locals 4

    float-to-double p4, p1

    const-wide v0, 0x402399999999999aL    # 9.8

    .line 59
    invoke-static {p4, p5}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr p4, v0

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    invoke-static {p4, p5, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p4

    float-to-double p1, p2

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr p1, v0

    invoke-static {p1, p2, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p1

    add-double/2addr p4, p1

    float-to-double p1, p3

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr p1, v0

    invoke-static {p1, p2, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p1

    add-double/2addr p4, p1

    invoke-static {p4, p5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p1

    return-wide p1
.end method

.method static synthetic a(Lcom/beizi/fusion/g/ar;FFFD)D
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/beizi/fusion/g/ar;->a(FFFD)D

    move-result-wide p0

    return-wide p0
.end method

.method static synthetic a(Lcom/beizi/fusion/g/ar;F)F
    .locals 0

    .line 2
    iput p1, p0, Lcom/beizi/fusion/g/ar;->m:F

    return p1
.end method

.method static synthetic a(Lcom/beizi/fusion/g/ar;I)I
    .locals 0

    .line 3
    iput p1, p0, Lcom/beizi/fusion/g/ar;->p:I

    return p1
.end method

.method static synthetic a(Lcom/beizi/fusion/g/ar;)J
    .locals 2

    .line 4
    iget-wide v0, p0, Lcom/beizi/fusion/g/ar;->t:J

    return-wide v0
.end method

.method private a(DDDD)V
    .locals 9

    move-object v0, p0

    .line 41
    iget-object v1, v0, Lcom/beizi/fusion/g/ar;->u:Lcom/beizi/fusion/update/ShakeArcView;

    if-nez v1, :cond_0

    return-void

    .line 42
    :cond_0
    iget v2, v0, Lcom/beizi/fusion/g/ar;->v:I

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    .line 43
    iget v2, v0, Lcom/beizi/fusion/g/ar;->k:I

    int-to-double v2, v2

    invoke-virtual {v1, v2, v3}, Lcom/beizi/fusion/update/ShakeArcView;->setCurrentProgress(D)Lcom/beizi/fusion/update/ShakeArcView;

    return-void

    .line 44
    :cond_1
    iget v2, v0, Lcom/beizi/fusion/g/ar;->h:I

    const/4 v4, 0x4

    const-wide/16 v5, 0x0

    if-lez v2, :cond_6

    iget-wide v7, v0, Lcom/beizi/fusion/g/ar;->f:D

    cmpl-double v2, v7, v5

    if-lez v2, :cond_6

    cmpl-double v1, p1, p3

    if-ltz v1, :cond_2

    cmpl-double v1, p1, p5

    if-ltz v1, :cond_2

    move-wide v1, p1

    goto :goto_0

    :cond_2
    cmpl-double v1, p3, p1

    if-ltz v1, :cond_3

    cmpl-double v1, p3, p5

    if-ltz v1, :cond_3

    move-wide v1, p3

    goto :goto_0

    :cond_3
    cmpl-double v1, p5, p1

    if-ltz v1, :cond_4

    cmpl-double v1, p5, p3

    if-ltz v1, :cond_4

    move-wide v1, p5

    goto :goto_0

    :cond_4
    move-wide v1, v5

    .line 45
    :goto_0
    new-instance v7, Ljava/math/BigDecimal;

    invoke-direct {v7, v1, v2}, Ljava/math/BigDecimal;-><init>(D)V

    .line 46
    invoke-virtual {v7, v3, v4}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigDecimal;->doubleValue()D

    move-result-wide v1

    const-wide v3, 0x3fb999999999999aL    # 0.1

    cmpl-double v7, v1, v3

    if-ltz v7, :cond_5

    .line 47
    iget-object v3, v0, Lcom/beizi/fusion/g/ar;->u:Lcom/beizi/fusion/update/ShakeArcView;

    invoke-virtual {v3, v1, v2}, Lcom/beizi/fusion/update/ShakeArcView;->setCurrentProgress(D)Lcom/beizi/fusion/update/ShakeArcView;

    goto :goto_1

    :cond_5
    cmpg-double v7, v1, v3

    if-gez v7, :cond_9

    .line 48
    iget-object v1, v0, Lcom/beizi/fusion/g/ar;->u:Lcom/beizi/fusion/update/ShakeArcView;

    invoke-virtual {v1, v5, v6}, Lcom/beizi/fusion/update/ShakeArcView;->setCurrentProgress(D)Lcom/beizi/fusion/update/ShakeArcView;

    goto :goto_1

    .line 49
    :cond_6
    iget v2, v0, Lcom/beizi/fusion/g/ar;->g:I

    if-lez v2, :cond_7

    iget v7, v0, Lcom/beizi/fusion/g/ar;->k:I

    if-lt v7, v2, :cond_7

    .line 50
    iget-wide v2, v0, Lcom/beizi/fusion/g/ar;->d:D

    invoke-virtual {v1, v2, v3}, Lcom/beizi/fusion/update/ShakeArcView;->setCurrentProgress(D)Lcom/beizi/fusion/update/ShakeArcView;

    return-void

    .line 51
    :cond_7
    new-instance v1, Ljava/math/BigDecimal;

    move-wide/from16 v7, p7

    invoke-direct {v1, v7, v8}, Ljava/math/BigDecimal;-><init>(D)V

    .line 52
    invoke-virtual {v1, v3, v4}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigDecimal;->doubleValue()D

    move-result-wide v1

    const-wide v3, 0x3ff199999999999aL    # 1.1

    cmpl-double v7, v1, v3

    if-ltz v7, :cond_8

    .line 53
    iget-object v3, v0, Lcom/beizi/fusion/g/ar;->u:Lcom/beizi/fusion/update/ShakeArcView;

    invoke-virtual {v3, v1, v2}, Lcom/beizi/fusion/update/ShakeArcView;->setCurrentProgress(D)Lcom/beizi/fusion/update/ShakeArcView;

    goto :goto_1

    :cond_8
    cmpg-double v7, v1, v3

    if-gez v7, :cond_9

    .line 54
    iget-object v1, v0, Lcom/beizi/fusion/g/ar;->u:Lcom/beizi/fusion/update/ShakeArcView;

    invoke-virtual {v1, v5, v6}, Lcom/beizi/fusion/update/ShakeArcView;->setCurrentProgress(D)Lcom/beizi/fusion/update/ShakeArcView;

    :cond_9
    :goto_1
    return-void
.end method

.method static synthetic a(Lcom/beizi/fusion/g/ar;DDDD)V
    .locals 0

    .line 5
    invoke-direct/range {p0 .. p8}, Lcom/beizi/fusion/g/ar;->a(DDDD)V

    return-void
.end method

.method static synthetic b(Lcom/beizi/fusion/g/ar;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/beizi/fusion/g/ar;->m:F

    return p0
.end method

.method static synthetic b(Lcom/beizi/fusion/g/ar;F)F
    .locals 0

    .line 2
    iput p1, p0, Lcom/beizi/fusion/g/ar;->n:F

    return p1
.end method

.method private b(FFFD)Z
    .locals 6

    float-to-double v0, p1

    const-wide v2, 0x402399999999999aL    # 9.8

    .line 6
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v0, v2

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    float-to-double p1, p2

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr p1, v2

    invoke-static {p1, p2, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p1

    add-double/2addr v0, p1

    float-to-double p1, p3

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr p1, v2

    invoke-static {p1, p2, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p1

    add-double/2addr v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p1

    cmpg-double p3, p1, p4

    if-gez p3, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method static synthetic b(Lcom/beizi/fusion/g/ar;FFFD)Z
    .locals 0

    .line 3
    invoke-direct/range {p0 .. p5}, Lcom/beizi/fusion/g/ar;->b(FFFD)Z

    move-result p0

    return p0
.end method

.method static synthetic c(Lcom/beizi/fusion/g/ar;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/beizi/fusion/g/ar;->n:F

    return p0
.end method

.method static synthetic c(Lcom/beizi/fusion/g/ar;F)F
    .locals 0

    .line 2
    iput p1, p0, Lcom/beizi/fusion/g/ar;->o:F

    return p1
.end method

.method static synthetic d(Lcom/beizi/fusion/g/ar;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/beizi/fusion/g/ar;->o:F

    return p0
.end method

.method static synthetic e(Lcom/beizi/fusion/g/ar;)D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/beizi/fusion/g/ar;->f:D

    return-wide v0
.end method

.method private e()V
    .locals 6

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/g/ar;->u:Lcom/beizi/fusion/update/ShakeArcView;

    if-eqz v0, :cond_3

    iget v1, p0, Lcom/beizi/fusion/g/ar;->v:I

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    .line 3
    iget v1, p0, Lcom/beizi/fusion/g/ar;->h:I

    if-lez v1, :cond_1

    iget-wide v1, p0, Lcom/beizi/fusion/g/ar;->f:D

    const-wide/16 v3, 0x0

    cmpl-double v5, v1, v3

    if-lez v5, :cond_1

    .line 4
    invoke-virtual {v0, v1, v2}, Lcom/beizi/fusion/update/ShakeArcView;->setMaxProgress(D)Lcom/beizi/fusion/update/ShakeArcView;

    goto :goto_0

    .line 5
    :cond_1
    iget-wide v1, p0, Lcom/beizi/fusion/g/ar;->d:D

    invoke-virtual {v0, v1, v2}, Lcom/beizi/fusion/update/ShakeArcView;->setMaxProgress(D)Lcom/beizi/fusion/update/ShakeArcView;

    goto :goto_0

    :cond_2
    const/4 v2, 0x2

    if-ne v1, v2, :cond_3

    .line 6
    iget v1, p0, Lcom/beizi/fusion/g/ar;->g:I

    int-to-double v1, v1

    invoke-virtual {v0, v1, v2}, Lcom/beizi/fusion/update/ShakeArcView;->setMaxProgress(D)Lcom/beizi/fusion/update/ShakeArcView;

    :cond_3
    :goto_0
    return-void
.end method

.method static synthetic f(Lcom/beizi/fusion/g/ar;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/beizi/fusion/g/ar;->l:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/beizi/fusion/g/ar;->l:I

    return v0
.end method

.method public static f(I)Landroid/util/Pair;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 7
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double v0, v0, v2

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    add-double/2addr v0, v2

    double-to-int v0, v0

    if-gt v0, p0, :cond_0

    .line 8
    new-instance p0, Landroid/util/Pair;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {p0, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 9
    :cond_0
    new-instance p0, Landroid/util/Pair;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {p0, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    return-object p0
.end method

.method private f()V
    .locals 4

    .line 2
    iget v0, p0, Lcom/beizi/fusion/g/ar;->j:I

    invoke-static {v0}, Lcom/beizi/fusion/g/ar;->f(I)Landroid/util/Pair;

    move-result-object v0

    .line 3
    iget-object v1, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    new-instance v1, Lcom/beizi/fusion/g/ar$2;

    invoke-direct {v1, p0}, Lcom/beizi/fusion/g/ar$2;-><init>(Lcom/beizi/fusion/g/ar;)V

    iget v2, p0, Lcom/beizi/fusion/g/ar;->i:I

    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    .line 5
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    mul-int/lit8 v0, v0, 0xa

    add-int/2addr v2, v0

    int-to-long v2, v2

    .line 6
    invoke-static {v1, v2, v3}, Lcom/beizi/fusion/g/aa;->a(Ljava/lang/Runnable;J)V

    :cond_0
    return-void
.end method

.method static synthetic g(Lcom/beizi/fusion/g/ar;)D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/beizi/fusion/g/ar;->d:D

    return-wide v0
.end method

.method static synthetic h(Lcom/beizi/fusion/g/ar;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/beizi/fusion/g/ar;->p:I

    return p0
.end method

.method static synthetic i(Lcom/beizi/fusion/g/ar;)D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/beizi/fusion/g/ar;->e:D

    return-wide v0
.end method

.method static synthetic j(Lcom/beizi/fusion/g/ar;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/beizi/fusion/g/ar;->k:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/beizi/fusion/g/ar;->k:I

    return v0
.end method

.method static synthetic k(Lcom/beizi/fusion/g/ar;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/beizi/fusion/g/ar;->k:I

    return p0
.end method

.method static synthetic l(Lcom/beizi/fusion/g/ar;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/beizi/fusion/g/ar;->g:I

    return p0
.end method

.method static synthetic m(Lcom/beizi/fusion/g/ar;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/beizi/fusion/g/ar;->l:I

    return p0
.end method

.method static synthetic n(Lcom/beizi/fusion/g/ar;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/beizi/fusion/g/ar;->h:I

    return p0
.end method


# virtual methods
.method public a(IILcom/beizi/fusion/model/AdSpacesBean$BuyerBean$PercentPositionBean;)Landroid/view/View;
    .locals 9

    const-string v0, "BeiZis"

    const-string v1, "enter getShakeView"

    .line 76
    invoke-static {v0, v1}, Lcom/beizi/fusion/g/af;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    iget-object v1, p0, Lcom/beizi/fusion/g/ar;->c:Landroid/content/Context;

    if-eqz v1, :cond_13

    if-nez p3, :cond_0

    goto/16 :goto_5

    .line 78
    :cond_0
    new-instance v1, Lcom/beizi/fusion/widget/ShakeView;

    iget-object v2, p0, Lcom/beizi/fusion/g/ar;->c:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/beizi/fusion/widget/ShakeView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/beizi/fusion/g/ar;->a:Lcom/beizi/fusion/widget/ShakeView;

    .line 79
    invoke-virtual {p3}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$PercentPositionBean;->getCenterX()Ljava/lang/String;

    move-result-object v1

    .line 80
    invoke-virtual {p3}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$PercentPositionBean;->getCenterY()Ljava/lang/String;

    move-result-object v2

    .line 81
    invoke-virtual {p3}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$PercentPositionBean;->getWidth()Ljava/lang/String;

    move-result-object v3

    .line 82
    invoke-virtual {p3}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$PercentPositionBean;->getHeight()Ljava/lang/String;

    move-result-object p3

    .line 83
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    const-string v5, "50%"

    const-string v6, "0"

    if-nez v4, :cond_1

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    :cond_1
    move-object v1, v5

    .line 84
    :cond_2
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_3

    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    :cond_3
    move-object v2, v5

    .line 85
    :cond_4
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    const-string v5, "180"

    if-nez v4, :cond_5

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    :cond_5
    move-object v3, v5

    .line 86
    :cond_6
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_7

    invoke-virtual {v6, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    :cond_7
    move-object p3, v5

    .line 87
    :cond_8
    iget-object v4, p0, Lcom/beizi/fusion/g/ar;->c:Landroid/content/Context;

    invoke-static {v4}, Lcom/beizi/fusion/g/av;->j(Landroid/content/Context;)F

    move-result v4

    const-string v5, "%"

    .line 88
    invoke-virtual {v1, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_9

    .line 89
    invoke-virtual {v1, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v1, v7, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    mul-int v1, v1, p1

    div-int/lit8 v1, v1, 0x64

    goto :goto_0

    .line 90
    :cond_9
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    .line 91
    :goto_0
    invoke-virtual {v2, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_a

    .line 92
    invoke-virtual {v2, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v2, v7, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    mul-int v2, v2, p2

    div-int/lit8 v2, v2, 0x64

    goto :goto_1

    .line 93
    :cond_a
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    .line 94
    :goto_1
    invoke-virtual {v3, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    const/16 v8, 0x190

    if-eqz v6, :cond_c

    .line 95
    invoke-virtual {v3, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v3, v7, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    const/high16 v6, 0x43c80000    # 400.0f

    cmpl-float v6, v4, v6

    if-ltz v6, :cond_b

    mul-int/lit16 v3, v3, 0x190

    .line 96
    div-int/lit8 v3, v3, 0x64

    goto :goto_2

    :cond_b
    float-to-int v4, v4

    mul-int v4, v4, v3

    .line 97
    div-int/lit8 v4, v4, 0x64

    move v8, v4

    goto :goto_3

    .line 98
    :cond_c
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    if-lt v3, v8, :cond_d

    goto :goto_3

    :cond_d
    :goto_2
    move v8, v3

    .line 99
    :goto_3
    invoke-virtual {p3, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_e

    .line 100
    invoke-virtual {p3, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {p3, v7, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p3

    mul-int p3, p3, v8

    div-int/lit8 p3, p3, 0x64

    goto :goto_4

    .line 101
    :cond_e
    invoke-static {p3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p3

    .line 102
    :goto_4
    iget-object v3, p0, Lcom/beizi/fusion/g/ar;->c:Landroid/content/Context;

    int-to-float v4, v8

    invoke-static {v3, v4}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v3

    .line 103
    iget-object v4, p0, Lcom/beizi/fusion/g/ar;->c:Landroid/content/Context;

    int-to-float p3, p3

    invoke-static {v4, p3}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result p3

    .line 104
    iget-object v4, p0, Lcom/beizi/fusion/g/ar;->c:Landroid/content/Context;

    int-to-float v1, v1

    invoke-static {v4, v1}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v1

    .line 105
    iget-object v4, p0, Lcom/beizi/fusion/g/ar;->c:Landroid/content/Context;

    int-to-float v2, v2

    invoke-static {v4, v2}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v2

    .line 106
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "widthInt = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ",heightInt = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lcom/beizi/fusion/g/af;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-nez v3, :cond_f

    const/16 v3, 0xb4

    :cond_f
    if-nez p3, :cond_10

    move p3, v3

    .line 107
    :cond_10
    new-instance v4, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v4, v3, p3}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 108
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "centerYInt = "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, ",centerXInt = "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, ",adWidthDp = "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, ",adHeightDp = "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v6}, Lcom/beizi/fusion/g/af;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-nez v2, :cond_11

    .line 109
    iget-object v2, p0, Lcom/beizi/fusion/g/ar;->c:Landroid/content/Context;

    int-to-float p2, p2

    invoke-static {v2, p2}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result p2

    div-int/lit8 v2, p2, 0x2

    :cond_11
    if-nez v1, :cond_12

    .line 110
    iget-object p2, p0, Lcom/beizi/fusion/g/ar;->c:Landroid/content/Context;

    int-to-float p1, p1

    invoke-static {p2, p1}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result p1

    div-int/lit8 v1, p1, 0x2

    .line 111
    :cond_12
    div-int/lit8 p1, p3, 0x2

    sub-int/2addr v2, p1

    iput v2, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 112
    div-int/lit8 p1, v3, 0x2

    sub-int/2addr v1, p1

    iput v1, v4, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 113
    iget-object p1, p0, Lcom/beizi/fusion/g/ar;->a:Lcom/beizi/fusion/widget/ShakeView;

    invoke-virtual {p1, v4}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 114
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "topMargin = "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ",leftMargin = "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, v4, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ",widthInt = "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/beizi/fusion/g/af;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    iget-object p1, p0, Lcom/beizi/fusion/g/ar;->a:Lcom/beizi/fusion/widget/ShakeView;

    invoke-virtual {p1}, Lcom/beizi/fusion/widget/ShakeView;->startShake()V

    .line 116
    invoke-virtual {p0}, Lcom/beizi/fusion/g/ar;->b()V

    .line 117
    iget-object p1, p0, Lcom/beizi/fusion/g/ar;->a:Lcom/beizi/fusion/widget/ShakeView;

    return-object p1

    :cond_13
    :goto_5
    const/4 p1, 0x0

    return-object p1
.end method

.method protected a()V
    .locals 4

    .line 60
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "enter callBackShakeHappened and mShakeStateListener != null ? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/beizi/fusion/g/ar;->q:Lcom/beizi/fusion/g/ar$a;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",!isCallBack = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/beizi/fusion/g/ar;->r:Z

    xor-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "BeiZis"

    invoke-static {v1, v0}, Lcom/beizi/fusion/g/af;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    iget-object v0, p0, Lcom/beizi/fusion/g/ar;->q:Lcom/beizi/fusion/g/ar$a;

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/beizi/fusion/g/ar;->r:Z

    if-nez v0, :cond_2

    const-string v0, "callback onShakeHappened()"

    .line 62
    invoke-static {v1, v0}, Lcom/beizi/fusion/g/af;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    iget-object v0, p0, Lcom/beizi/fusion/g/ar;->u:Lcom/beizi/fusion/update/ShakeArcView;

    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/beizi/fusion/g/ax;->b(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "ShakeUtil"

    const-string v1, "mShakeCount onShakeHappened mShakeArcView is not show"

    .line 64
    invoke-static {v0, v1}, Lcom/beizi/fusion/g/af;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/high16 v0, -0x3d380000    # -100.0f

    .line 65
    iput v0, p0, Lcom/beizi/fusion/g/ar;->m:F

    .line 66
    iput v0, p0, Lcom/beizi/fusion/g/ar;->n:F

    .line 67
    iput v0, p0, Lcom/beizi/fusion/g/ar;->o:F

    .line 68
    iput v3, p0, Lcom/beizi/fusion/g/ar;->k:I

    .line 69
    iput v3, p0, Lcom/beizi/fusion/g/ar;->l:I

    .line 70
    iput v3, p0, Lcom/beizi/fusion/g/ar;->p:I

    return-void

    .line 71
    :cond_1
    iget-object v0, p0, Lcom/beizi/fusion/g/ar;->q:Lcom/beizi/fusion/g/ar$a;

    invoke-interface {v0}, Lcom/beizi/fusion/g/ar$a;->b()V

    .line 72
    iput-boolean v2, p0, Lcom/beizi/fusion/g/ar;->r:Z

    .line 73
    iget-object v0, p0, Lcom/beizi/fusion/g/ar;->a:Lcom/beizi/fusion/widget/ShakeView;

    if-eqz v0, :cond_2

    .line 74
    invoke-virtual {v0}, Lcom/beizi/fusion/widget/ShakeView;->stopShake()V

    .line 75
    invoke-virtual {p0}, Lcom/beizi/fusion/g/ar;->c()V

    :cond_2
    return-void
.end method

.method public a(D)V
    .locals 0

    .line 56
    iput-wide p1, p0, Lcom/beizi/fusion/g/ar;->d:D

    return-void
.end method

.method public a(I)V
    .locals 0

    .line 55
    iput p1, p0, Lcom/beizi/fusion/g/ar;->v:I

    return-void
.end method

.method public a(Lcom/beizi/fusion/g/ar$a;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lcom/beizi/fusion/g/ar;->q:Lcom/beizi/fusion/g/ar$a;

    return-void
.end method

.method public a(Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$AliaseShakeViewBean;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 30
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setShakeAliaseParams mShakeCount:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$AliaseShakeViewBean;->getShakeCount()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ";mRotateCount:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$AliaseShakeViewBean;->getRotatCount()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ShakeUtil"

    invoke-static {v1, v0}, Lcom/beizi/fusion/g/af;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    :try_start_0
    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$AliaseShakeViewBean;->getShakeCount()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/beizi/fusion/g/ar;->b(I)V

    .line 32
    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$AliaseShakeViewBean;->getShakeStartAmplitude()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/beizi/fusion/g/ar;->a(D)V

    .line 33
    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$AliaseShakeViewBean;->getShakeEndAmplitude()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/beizi/fusion/g/ar;->b(D)V

    .line 34
    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$AliaseShakeViewBean;->getRotatAmplitude()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/beizi/fusion/g/ar;->c(D)V

    .line 35
    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$AliaseShakeViewBean;->getRotatCount()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/beizi/fusion/g/ar;->e(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 36
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public a(Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 23
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setShakeCoolParams mShakeCount:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;->getShakeCount()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ";mRotateCount:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;->getRotatCount()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ShakeUtil"

    invoke-static {v1, v0}, Lcom/beizi/fusion/g/af;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    :try_start_0
    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;->getShakeCount()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/beizi/fusion/g/ar;->b(I)V

    .line 25
    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;->getShakeStartAmplitude()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/beizi/fusion/g/ar;->a(D)V

    .line 26
    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;->getShakeEndAmplitude()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/beizi/fusion/g/ar;->b(D)V

    .line 27
    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;->getRotatAmplitude()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/beizi/fusion/g/ar;->c(D)V

    .line 28
    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;->getRotatCount()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/beizi/fusion/g/ar;->e(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 29
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public a(Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setShakeParams mShakeCount:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->getShakeCount()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ";mRotateCount:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->getRotatCount()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ShakeUtil"

    invoke-static {v1, v0}, Lcom/beizi/fusion/g/af;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/high16 v0, -0x3d380000    # -100.0f

    .line 7
    :try_start_0
    iput v0, p0, Lcom/beizi/fusion/g/ar;->m:F

    .line 8
    iput v0, p0, Lcom/beizi/fusion/g/ar;->n:F

    .line 9
    iput v0, p0, Lcom/beizi/fusion/g/ar;->o:F

    const/4 v0, 0x0

    .line 10
    iput v0, p0, Lcom/beizi/fusion/g/ar;->k:I

    .line 11
    iput v0, p0, Lcom/beizi/fusion/g/ar;->l:I

    .line 12
    iput v0, p0, Lcom/beizi/fusion/g/ar;->p:I

    .line 13
    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->getShakeCount()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/beizi/fusion/g/ar;->b(I)V

    .line 14
    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->getShakeStartAmplitude()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/beizi/fusion/g/ar;->a(D)V

    .line 15
    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->getShakeEndAmplitude()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/beizi/fusion/g/ar;->b(D)V

    .line 16
    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->getRotatAmplitude()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/beizi/fusion/g/ar;->c(D)V

    .line 17
    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->getRotatCount()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/beizi/fusion/g/ar;->e(I)V

    .line 18
    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->getRandomClickTime()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/beizi/fusion/g/ar;->c(I)V

    .line 19
    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->getRandomClickNum()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/beizi/fusion/g/ar;->d(I)V

    .line 20
    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->getAnimationInterval()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/beizi/fusion/g/ar;->g(I)V

    .line 21
    invoke-direct {p0}, Lcom/beizi/fusion/g/ar;->e()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 22
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public a(Lcom/beizi/fusion/update/ShakeArcView;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/beizi/fusion/g/ar;->u:Lcom/beizi/fusion/update/ShakeArcView;

    return-void
.end method

.method public a(Lcom/beizi/fusion/update/ShakeArcView;I)V
    .locals 2

    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setShakeFeedback feedback:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ShakeUtil"

    invoke-static {v1, v0}, Lcom/beizi/fusion/g/af;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    invoke-virtual {p0, p1}, Lcom/beizi/fusion/g/ar;->a(Lcom/beizi/fusion/update/ShakeArcView;)V

    .line 39
    invoke-virtual {p0, p2}, Lcom/beizi/fusion/g/ar;->a(I)V

    .line 40
    invoke-direct {p0}, Lcom/beizi/fusion/g/ar;->e()V

    return-void
.end method

.method public b()V
    .locals 4

    .line 7
    sget-object v0, Lcom/beizi/fusion/g/ar;->b:Landroid/hardware/SensorManager;

    if-eqz v0, :cond_0

    .line 8
    iget-object v1, p0, Lcom/beizi/fusion/g/ar;->w:Landroid/hardware/SensorEventListener;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v2

    const v3, 0x186a0

    invoke-virtual {v0, v1, v2, v3}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    :cond_0
    return-void
.end method

.method public b(D)V
    .locals 0

    .line 4
    iput-wide p1, p0, Lcom/beizi/fusion/g/ar;->e:D

    return-void
.end method

.method public b(I)V
    .locals 0

    .line 5
    iput p1, p0, Lcom/beizi/fusion/g/ar;->g:I

    return-void
.end method

.method public c()V
    .locals 2

    const-string v0, "BeiZis"

    const-string v1, "enter unRegisterShakeListenerAndSetDefault"

    .line 5
    invoke-static {v0, v1}, Lcom/beizi/fusion/g/af;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    sget-object v0, Lcom/beizi/fusion/g/ar;->b:Landroid/hardware/SensorManager;

    if-eqz v0, :cond_0

    .line 7
    iget-object v1, p0, Lcom/beizi/fusion/g/ar;->w:Landroid/hardware/SensorEventListener;

    invoke-virtual {v0, v1}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    .line 8
    :cond_0
    invoke-virtual {p0}, Lcom/beizi/fusion/g/ar;->d()V

    .line 9
    iget-object v0, p0, Lcom/beizi/fusion/g/ar;->a:Lcom/beizi/fusion/widget/ShakeView;

    if-eqz v0, :cond_1

    .line 10
    invoke-virtual {v0}, Lcom/beizi/fusion/widget/ShakeView;->stopShake()V

    :cond_1
    return-void
.end method

.method public c(D)V
    .locals 0

    .line 3
    iput-wide p1, p0, Lcom/beizi/fusion/g/ar;->f:D

    return-void
.end method

.method public c(I)V
    .locals 0

    .line 4
    iput p1, p0, Lcom/beizi/fusion/g/ar;->i:I

    return-void
.end method

.method protected d()V
    .locals 2

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/beizi/fusion/g/ar;->r:Z

    .line 5
    iput v0, p0, Lcom/beizi/fusion/g/ar;->k:I

    .line 6
    iput v0, p0, Lcom/beizi/fusion/g/ar;->l:I

    const/high16 v1, -0x3d380000    # -100.0f

    .line 7
    iput v1, p0, Lcom/beizi/fusion/g/ar;->m:F

    .line 8
    iput v1, p0, Lcom/beizi/fusion/g/ar;->n:F

    .line 9
    iput v1, p0, Lcom/beizi/fusion/g/ar;->o:F

    .line 10
    iput v0, p0, Lcom/beizi/fusion/g/ar;->p:I

    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lcom/beizi/fusion/g/ar;->q:Lcom/beizi/fusion/g/ar$a;

    .line 12
    iput-object v0, p0, Lcom/beizi/fusion/g/ar;->c:Landroid/content/Context;

    .line 13
    iput-object v0, p0, Lcom/beizi/fusion/g/ar;->a:Lcom/beizi/fusion/widget/ShakeView;

    const/16 v1, 0xc8

    .line 14
    iput v1, p0, Lcom/beizi/fusion/g/ar;->s:I

    .line 15
    iput-object v0, p0, Lcom/beizi/fusion/g/ar;->u:Lcom/beizi/fusion/update/ShakeArcView;

    return-void
.end method

.method public d(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/beizi/fusion/g/ar;->j:I

    if-lez p1, :cond_0

    .line 3
    invoke-direct {p0}, Lcom/beizi/fusion/g/ar;->f()V

    :cond_0
    return-void
.end method

.method public e(I)V
    .locals 0

    .line 7
    iput p1, p0, Lcom/beizi/fusion/g/ar;->h:I

    return-void
.end method

.method public g(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/beizi/fusion/g/ar;->s:I

    return-void
.end method
