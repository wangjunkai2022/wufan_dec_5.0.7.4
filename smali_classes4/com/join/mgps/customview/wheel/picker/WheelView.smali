.class public Lcom/join/mgps/customview/wheel/picker/WheelView;
.super Landroid/view/View;
.source "WheelView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/customview/wheel/picker/WheelView$d;,
        Lcom/join/mgps/customview/wheel/picker/WheelView$j;,
        Lcom/join/mgps/customview/wheel/picker/WheelView$f;,
        Lcom/join/mgps/customview/wheel/picker/WheelView$i;,
        Lcom/join/mgps/customview/wheel/picker/WheelView$h;,
        Lcom/join/mgps/customview/wheel/picker/WheelView$g;,
        Lcom/join/mgps/customview/wheel/picker/WheelView$StringItem;,
        Lcom/join/mgps/customview/wheel/picker/WheelView$e;,
        Lcom/join/mgps/customview/wheel/picker/WheelView$c;
    }
.end annotation


# static fields
.field public static final A1:F = 2.0f

.field public static final B1:I = 0x3

.field private static final C1:F = 13.0f

.field private static final D1:I = 0x1

.field private static final E1:I = 0x2

.field private static final F1:I = 0x3

.field private static final G1:I = 0x5

.field private static final H1:F = 0.8f

.field public static final T:F = 2.0f

.field public static final U:I = -0x1

.field public static final V:I = 0x10

.field public static final W:I = -0xfd7732

.field public static final p0:I = -0x444445

.field public static final p1:I = -0x7c321a

.field public static final v1:I = 0xdc


# instance fields
.field private A:F

.field private B:F

.field private C:I

.field private D:I

.field private E:I

.field private F:I

.field private G:I

.field private H:I

.field private I:I

.field private J:I

.field private K:F

.field private L:J

.field private M:I

.field private N:I

.field private O:I

.field private P:I

.field private Q:F

.field private R:Z

.field private S:Z

.field private b:Lcom/join/mgps/customview/wheel/picker/WheelView$f;

.field private c:Landroid/view/GestureDetector;

.field private d:Lcom/join/mgps/customview/wheel/picker/WheelView$g;

.field private e:Lcom/join/mgps/customview/wheel/picker/WheelView$h;

.field private f:Z

.field private g:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field private h:Landroid/graphics/Paint;

.field private i:Landroid/graphics/Paint;

.field private j:Landroid/graphics/Paint;

.field private k:Landroid/graphics/Paint;

.field private l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/customview/wheel/picker/entity/WheelItem;",
            ">;"
        }
    .end annotation
.end field

.field private m:Ljava/lang/String;

.field private n:I

.field private o:I

.field private p:I

.field private q:I

.field private r:F

.field private s:Landroid/graphics/Typeface;

.field private t:I

.field private u:I

.field private v:Lcom/join/mgps/customview/wheel/picker/WheelView$c;

.field private w:F

.field private x:I

.field private y:Z

.field private z:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/join/mgps/customview/wheel/picker/WheelView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .line 2
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x1

    .line 3
    iput-boolean p2, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->f:Z

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->l:Ljava/util/List;

    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->p:I

    const/16 v1, 0x10

    .line 6
    iput v1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->q:I

    .line 7
    sget-object v1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    iput-object v1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->s:Landroid/graphics/Typeface;

    const v1, -0x444445

    .line 8
    iput v1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->t:I

    const v1, -0xfd7732

    .line 9
    iput v1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->u:I

    .line 10
    new-instance v1, Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    invoke-direct {v1}, Lcom/join/mgps/customview/wheel/picker/WheelView$c;-><init>()V

    iput-object v1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->v:Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    const/high16 v1, 0x40000000    # 2.0f

    .line 11
    iput v1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->w:F

    const/4 v2, -0x1

    .line 12
    iput v2, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->x:I

    .line 13
    iput-boolean p2, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->y:Z

    const/4 v3, 0x0

    .line 14
    iput v3, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->B:F

    .line 15
    iput v2, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->C:I

    const/4 v2, 0x7

    .line 16
    iput v2, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->F:I

    .line 17
    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->J:I

    .line 18
    iput v3, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->K:F

    const-wide/16 v2, 0x0

    .line 19
    iput-wide v2, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->L:J

    const/16 v2, 0x11

    .line 20
    iput v2, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->N:I

    .line 21
    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->O:I

    .line 22
    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->P:I

    .line 23
    iput-boolean v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->R:Z

    .line 24
    iput-boolean p2, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->S:Z

    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v2, p2, v0

    if-gez v2, :cond_0

    const p2, 0x4019999a    # 2.4f

    .line 26
    iput p2, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->Q:F

    goto :goto_0

    :cond_0
    cmpg-float v2, v0, p2

    if-gtz v2, :cond_1

    cmpg-float v2, p2, v1

    if-gez v2, :cond_1

    const p2, 0x40666666    # 3.6f

    .line 27
    iput p2, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->Q:F

    goto :goto_0

    :cond_1
    cmpg-float v0, v0, p2

    if-gtz v0, :cond_2

    cmpg-float v0, p2, v1

    if-gez v0, :cond_2

    const/high16 p2, 0x40900000    # 4.5f

    .line 28
    iput p2, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->Q:F

    goto :goto_0

    :cond_2
    const/high16 v0, 0x40400000    # 3.0f

    cmpg-float v1, v1, p2

    if-gtz v1, :cond_3

    cmpg-float v1, p2, v0

    if-gez v1, :cond_3

    const/high16 p2, 0x40c00000    # 6.0f

    .line 29
    iput p2, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->Q:F

    goto :goto_0

    :cond_3
    cmpl-float v0, p2, v0

    if-ltz v0, :cond_4

    const/high16 v0, 0x40200000    # 2.5f

    mul-float p2, p2, v0

    .line 30
    iput p2, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->Q:F

    .line 31
    :cond_4
    :goto_0
    invoke-direct {p0}, Lcom/join/mgps/customview/wheel/picker/WheelView;->u()V

    .line 32
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/wheel/picker/WheelView;->s(Landroid/content/Context;)V

    return-void
.end method

.method private A()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->l:Ljava/util/List;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-direct {p0}, Lcom/join/mgps/customview/wheel/picker/WheelView;->v()V

    .line 3
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->r:F

    iget v1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->F:I

    add-int/lit8 v1, v1, -0x1

    int-to-float v1, v1

    mul-float v0, v0, v1

    float-to-int v0, v0

    mul-int/lit8 v1, v0, 0x2

    int-to-double v1, v1

    const-wide v3, 0x400921fb54442d18L    # Math.PI

    .line 4
    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v1, v3

    double-to-int v1, v1

    iput v1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->G:I

    int-to-double v0, v0

    .line 5
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v0, v3

    double-to-int v0, v0

    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->I:I

    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 7
    iget-boolean v1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->R:Z

    if-eqz v1, :cond_1

    .line 8
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->M:I

    invoke-static {v0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->H:I

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    .line 9
    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    if-lez v0, :cond_2

    .line 10
    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->H:I

    goto :goto_0

    .line 11
    :cond_2
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->n:I

    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->H:I

    .line 12
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->x:I

    if-gez v0, :cond_3

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41500000    # 13.0f

    invoke-static {v0, v1}, La2/a;->H(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->x:I

    .line 14
    :cond_3
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->H:I

    iget v1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->x:I

    mul-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->H:I

    .line 15
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->m:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 16
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->H:I

    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->i:Landroid/graphics/Paint;

    iget-object v2, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->m:Ljava/lang/String;

    invoke-direct {p0, v1, v2}, Lcom/join/mgps/customview/wheel/picker/WheelView;->z(Landroid/graphics/Paint;Ljava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->H:I

    .line 17
    :cond_4
    :goto_0
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->G:I

    int-to-float v1, v0

    iget v2, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->r:F

    sub-float/2addr v1, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v1, v3

    iput v1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->z:F

    int-to-float v0, v0

    add-float/2addr v0, v2

    div-float/2addr v0, v3

    .line 18
    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->A:F

    .line 19
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->C:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_6

    .line 20
    iget-boolean v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->y:Z

    if-eqz v0, :cond_5

    .line 21
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    div-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->C:I

    goto :goto_1

    :cond_5
    const/4 v0, 0x0

    .line 22
    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->C:I

    .line 23
    :cond_6
    :goto_1
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->C:I

    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->E:I

    return-void
.end method

.method private B(Ljava/lang/String;)V
    .locals 5

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->i:Landroid/graphics/Paint;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v1, p1, v3, v2, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 3
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v1

    .line 4
    iget v2, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->q:I

    .line 5
    :goto_0
    iget v4, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->H:I

    if-le v1, v4, :cond_0

    add-int/lit8 v2, v2, -0x1

    .line 6
    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->i:Landroid/graphics/Paint;

    int-to-float v4, v2

    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 7
    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->i:Landroid/graphics/Paint;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v1, p1, v3, v4, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 8
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v1

    goto :goto_0

    .line 9
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->h:Landroid/graphics/Paint;

    int-to-float v0, v2

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    return-void
.end method

.method private C(F)V
    .locals 7

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/customview/wheel/picker/WheelView;->o()V

    .line 2
    new-instance v1, Lcom/join/mgps/customview/wheel/picker/WheelView$d;

    invoke-direct {v1, p0, p1}, Lcom/join/mgps/customview/wheel/picker/WheelView$d;-><init>(Lcom/join/mgps/customview/wheel/picker/WheelView;F)V

    .line 3
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x5

    .line 4
    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->g:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method private D(I)V
    .locals 7

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/customview/wheel/picker/WheelView;->o()V

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    .line 2
    :cond_0
    iget p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->B:F

    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->r:F

    rem-float/2addr p1, v0

    add-float/2addr p1, v0

    rem-float/2addr p1, v0

    float-to-int p1, p1

    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->J:I

    int-to-float v1, p1

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, v0, v2

    cmpl-float v1, v1, v2

    if-lez v1, :cond_1

    int-to-float p1, p1

    sub-float/2addr v0, p1

    float-to-int p1, v0

    .line 3
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->J:I

    goto :goto_0

    :cond_1
    neg-int p1, p1

    .line 4
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->J:I

    .line 5
    :cond_2
    :goto_0
    new-instance v1, Lcom/join/mgps/customview/wheel/picker/WheelView$j;

    iget p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->J:I

    invoke-direct {v1, p0, p1}, Lcom/join/mgps/customview/wheel/picker/WheelView$j;-><init>(Lcom/join/mgps/customview/wheel/picker/WheelView;I)V

    .line 6
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0xa

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 7
    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->g:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method static synthetic a(Lcom/join/mgps/customview/wheel/picker/WheelView;F)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/wheel/picker/WheelView;->C(F)V

    return-void
.end method

.method static synthetic b(Lcom/join/mgps/customview/wheel/picker/WheelView;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->B:F

    return p0
.end method

.method static synthetic c(Lcom/join/mgps/customview/wheel/picker/WheelView;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->B:F

    return p1
.end method

.method static synthetic d(Lcom/join/mgps/customview/wheel/picker/WheelView;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->y:Z

    return p0
.end method

.method static synthetic e(Lcom/join/mgps/customview/wheel/picker/WheelView;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->r:F

    return p0
.end method

.method static synthetic f(Lcom/join/mgps/customview/wheel/picker/WheelView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->C:I

    return p0
.end method

.method static synthetic g(Lcom/join/mgps/customview/wheel/picker/WheelView;)Lcom/join/mgps/customview/wheel/picker/WheelView$g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->d:Lcom/join/mgps/customview/wheel/picker/WheelView$g;

    return-object p0
.end method

.method static synthetic h(Lcom/join/mgps/customview/wheel/picker/WheelView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->D:I

    return p0
.end method

.method static synthetic i(Lcom/join/mgps/customview/wheel/picker/WheelView;)Lcom/join/mgps/customview/wheel/picker/WheelView$h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->e:Lcom/join/mgps/customview/wheel/picker/WheelView$h;

    return-object p0
.end method

.method static synthetic j(Lcom/join/mgps/customview/wheel/picker/WheelView;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->l:Ljava/util/List;

    return-object p0
.end method

.method static synthetic k(Lcom/join/mgps/customview/wheel/picker/WheelView;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/wheel/picker/WheelView;->D(I)V

    return-void
.end method

.method static synthetic l(Lcom/join/mgps/customview/wheel/picker/WheelView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/customview/wheel/picker/WheelView;->t()V

    return-void
.end method

.method static synthetic m(Lcom/join/mgps/customview/wheel/picker/WheelView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/customview/wheel/picker/WheelView;->o()V

    return-void
.end method

.method static synthetic n(Lcom/join/mgps/customview/wheel/picker/WheelView;)Lcom/join/mgps/customview/wheel/picker/WheelView$f;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->b:Lcom/join/mgps/customview/wheel/picker/WheelView$f;

    return-object p0
.end method

.method private o()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->g:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledFuture;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->g:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->g:Ljava/util/concurrent/ScheduledFuture;

    :cond_0
    return-void
.end method

.method private p(I)I
    .locals 1

    if-gez p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/2addr p1, v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/wheel/picker/WheelView;->p(I)I

    move-result p1

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-le p1, v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr p1, v0

    .line 5
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/wheel/picker/WheelView;->p(I)I

    move-result p1

    :cond_1
    :goto_0
    return p1
.end method

.method private q()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "\u674e\u7389\u6c5f"

    const-string v1, "\u7537"

    const-string v2, "\u8d35\u5dde"

    const-string v3, "\u7a7f\u9752\u4eba"

    .line 2
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setItems([Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private r()V
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->h:Landroid/graphics/Paint;

    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->h:Landroid/graphics/Paint;

    iget v2, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->t:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->h:Landroid/graphics/Paint;

    iget-object v2, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->s:Landroid/graphics/Typeface;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 5
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->h:Landroid/graphics/Paint;

    iget v2, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->q:I

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 6
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->i:Landroid/graphics/Paint;

    .line 7
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->i:Landroid/graphics/Paint;

    iget v2, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->u:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->i:Landroid/graphics/Paint;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextScaleX(F)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->i:Landroid/graphics/Paint;

    iget-object v2, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->s:Landroid/graphics/Typeface;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 11
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->i:Landroid/graphics/Paint;

    iget v2, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->q:I

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 12
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->j:Landroid/graphics/Paint;

    .line 13
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 14
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->j:Landroid/graphics/Paint;

    iget-object v2, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->v:Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    iget v2, v2, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->c:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 15
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->j:Landroid/graphics/Paint;

    iget-object v2, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->v:Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    iget v2, v2, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->h:F

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 16
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->j:Landroid/graphics/Paint;

    iget-object v2, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->v:Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    iget v2, v2, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->f:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 17
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->k:Landroid/graphics/Paint;

    .line 18
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 19
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->k:Landroid/graphics/Paint;

    iget-object v2, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->v:Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    iget v2, v2, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->d:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 20
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->k:Landroid/graphics/Paint;

    iget-object v2, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->v:Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    iget v2, v2, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->e:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    const/4 v0, 0x0

    .line 21
    invoke-virtual {p0, v1, v0}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    return-void
.end method

.method private s(Landroid/content/Context;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/join/mgps/customview/wheel/picker/WheelView$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/customview/wheel/picker/WheelView$f;-><init>(Lcom/join/mgps/customview/wheel/picker/WheelView;)V

    iput-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->b:Lcom/join/mgps/customview/wheel/picker/WheelView$f;

    .line 2
    new-instance v0, Landroid/view/GestureDetector;

    new-instance v1, Lcom/join/mgps/customview/wheel/picker/WheelView$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/customview/wheel/picker/WheelView$a;-><init>(Lcom/join/mgps/customview/wheel/picker/WheelView;)V

    invoke-direct {v0, p1, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->c:Landroid/view/GestureDetector;

    const/4 p1, 0x0

    .line 3
    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->setIsLongpressEnabled(Z)V

    .line 4
    invoke-direct {p0}, Lcom/join/mgps/customview/wheel/picker/WheelView;->r()V

    .line 5
    invoke-direct {p0}, Lcom/join/mgps/customview/wheel/picker/WheelView;->q()V

    return-void
.end method

.method private t()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->d:Lcom/join/mgps/customview/wheel/picker/WheelView$g;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->e:Lcom/join/mgps/customview/wheel/picker/WheelView$h;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Lcom/join/mgps/customview/wheel/picker/WheelView$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/customview/wheel/picker/WheelView$b;-><init>(Lcom/join/mgps/customview/wheel/picker/WheelView;)V

    const-wide/16 v1, 0xc8

    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private u()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->w:F

    const/high16 v1, 0x3fc00000    # 1.5f

    cmpg-float v2, v0, v1

    if-gez v2, :cond_0

    .line 2
    iput v1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->w:F

    goto :goto_0

    :cond_0
    const/high16 v1, 0x40800000    # 4.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 3
    iput v1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->w:F

    :cond_1
    :goto_0
    return-void
.end method

.method private v()V
    .locals 6

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 2
    :goto_0
    iget-object v3, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->l:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 3
    iget-object v3, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->l:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/join/mgps/customview/wheel/picker/WheelView;->y(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 4
    iget-object v4, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->i:Landroid/graphics/Paint;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    invoke-virtual {v4, v3, v1, v5, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 5
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v3

    .line 6
    iget v4, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->n:I

    if-le v3, v4, :cond_0

    .line 7
    iput v3, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->n:I

    .line 8
    :cond_0
    iget-object v3, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->i:Landroid/graphics/Paint;

    const-string v4, "\u6d4b\u8bd5"

    const/4 v5, 0x2

    invoke-virtual {v3, v4, v1, v5, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 9
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v3

    add-int/2addr v3, v5

    iput v3, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->o:I

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 10
    :cond_1
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->w:F

    iget v1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->o:I

    int-to-float v1, v1

    mul-float v0, v0, v1

    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->r:F

    return-void
.end method

.method private w(Ljava/lang/String;)V
    .locals 4

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->i:Landroid/graphics/Paint;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v1, p1, v3, v2, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 3
    iget p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->N:I

    const/4 v1, 0x3

    if-eq p1, v1, :cond_2

    const/4 v1, 0x5

    if-eq p1, v1, :cond_1

    const/16 v1, 0x11

    if-eq p1, v1, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iget p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->H:I

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    sub-int/2addr p1, v0

    int-to-double v0, p1

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v2

    double-to-int p1, v0

    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->O:I

    goto :goto_0

    .line 5
    :cond_1
    iget p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->H:I

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    sub-int/2addr p1, v0

    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->Q:F

    float-to-int v0, v0

    sub-int/2addr p1, v0

    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->O:I

    goto :goto_0

    .line 6
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const/high16 v0, 0x41000000    # 8.0f

    invoke-static {p1, v0}, La2/a;->H(Landroid/content/Context;F)I

    move-result p1

    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->O:I

    :goto_0
    return-void
.end method

.method private x(Ljava/lang/String;)V
    .locals 4

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->h:Landroid/graphics/Paint;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v1, p1, v3, v2, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 3
    iget p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->N:I

    const/4 v1, 0x3

    if-eq p1, v1, :cond_2

    const/4 v1, 0x5

    if-eq p1, v1, :cond_1

    const/16 v1, 0x11

    if-eq p1, v1, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iget p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->H:I

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    sub-int/2addr p1, v0

    int-to-double v0, p1

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v2

    double-to-int p1, v0

    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->P:I

    goto :goto_0

    .line 5
    :cond_1
    iget p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->H:I

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    sub-int/2addr p1, v0

    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->Q:F

    float-to-int v0, v0

    sub-int/2addr p1, v0

    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->P:I

    goto :goto_0

    .line 6
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const/high16 v0, 0x41000000    # 8.0f

    invoke-static {p1, v0}, La2/a;->H(Landroid/content/Context;F)I

    move-result p1

    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->P:I

    :goto_0
    return-void
.end method

.method private y(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    if-nez p1, :cond_0

    const-string p1, ""

    return-object p1

    .line 1
    :cond_0
    instance-of v0, p1, Lcom/join/mgps/customview/wheel/picker/entity/WheelItem;

    if-eqz v0, :cond_1

    .line 2
    check-cast p1, Lcom/join/mgps/customview/wheel/picker/entity/WheelItem;

    invoke-interface {p1}, Lcom/join/mgps/customview/wheel/picker/entity/WheelItem;->getName()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 3
    :cond_1
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    .line 4
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v1, v2

    const-string p1, "%02d"

    invoke-static {v0, p1, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 5
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private z(Landroid/graphics/Paint;Ljava/lang/String;)I
    .locals 5

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    .line 1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_1

    .line 2
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    .line 3
    new-array v2, v1, [F

    .line 4
    invoke-virtual {p1, p2, v2}, Landroid/graphics/Paint;->getTextWidths(Ljava/lang/String;[F)I

    const/4 p1, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    .line 5
    aget p2, v2, v0

    float-to-double v3, p2

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-int p2, v3

    add-int/2addr p1, p2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    move v0, p1

    :cond_1
    return v0
.end method


# virtual methods
.method protected getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->l:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final getSelectedIndex()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->D:I

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    .line 1
    iget-object v1, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->l:Ljava/util/List;

    if-eqz v1, :cond_18

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_e

    .line 2
    :cond_0
    iget v1, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->F:I

    new-array v8, v1, [Ljava/lang/String;

    .line 3
    iget v1, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->B:F

    iget v2, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->r:F

    div-float/2addr v1, v2

    float-to-int v1, v1

    .line 4
    iget v2, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->C:I

    iget-object v3, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->l:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    rem-int/2addr v1, v3

    add-int/2addr v2, v1

    iput v2, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->E:I

    .line 5
    iget-boolean v1, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->y:Z

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-nez v1, :cond_2

    if-gez v2, :cond_1

    .line 6
    iput v9, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->E:I

    .line 7
    :cond_1
    iget v1, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->E:I

    iget-object v2, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->l:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v2, v10

    if-le v1, v2, :cond_4

    .line 8
    iget-object v1, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->l:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v1, v10

    iput v1, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->E:I

    goto :goto_0

    :cond_2
    if-gez v2, :cond_3

    .line 9
    iget-object v1, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->l:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget v2, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->E:I

    add-int/2addr v1, v2

    iput v1, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->E:I

    .line 10
    :cond_3
    iget v1, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->E:I

    iget-object v2, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->l:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v2, v10

    if-le v1, v2, :cond_4

    .line 11
    iget v1, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->E:I

    iget-object v2, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->l:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->E:I

    .line 12
    :cond_4
    :goto_0
    iget v1, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->B:F

    iget v2, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->r:F

    rem-float v11, v1, v2

    const/4 v1, 0x0

    .line 13
    :goto_1
    iget v2, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->F:I

    if-ge v1, v2, :cond_8

    .line 14
    iget v3, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->E:I

    div-int/lit8 v2, v2, 0x2

    sub-int/2addr v2, v1

    sub-int/2addr v3, v2

    .line 15
    iget-boolean v2, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->y:Z

    if-eqz v2, :cond_5

    .line 16
    invoke-direct {v0, v3}, Lcom/join/mgps/customview/wheel/picker/WheelView;->p(I)I

    move-result v2

    .line 17
    iget-object v3, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->l:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/customview/wheel/picker/entity/WheelItem;

    invoke-interface {v2}, Lcom/join/mgps/customview/wheel/picker/entity/WheelItem;->getName()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v8, v1

    goto :goto_2

    :cond_5
    const-string v2, ""

    if-gez v3, :cond_6

    .line 18
    aput-object v2, v8, v1

    goto :goto_2

    .line 19
    :cond_6
    iget-object v4, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->l:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    sub-int/2addr v4, v10

    if-le v3, v4, :cond_7

    .line 20
    aput-object v2, v8, v1

    goto :goto_2

    .line 21
    :cond_7
    iget-object v2, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->l:Ljava/util/List;

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/customview/wheel/picker/entity/WheelItem;

    invoke-interface {v2}, Lcom/join/mgps/customview/wheel/picker/entity/WheelItem;->getName()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v8, v1

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 22
    :cond_8
    iget-object v1, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->v:Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    iget-boolean v2, v1, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->a:Z

    const/high16 v12, 0x3f800000    # 1.0f

    if-eqz v2, :cond_9

    .line 23
    iget v13, v1, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->g:F

    .line 24
    iget v1, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->H:I

    int-to-float v2, v1

    mul-float v2, v2, v13

    iget v5, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->z:F

    int-to-float v1, v1

    sub-float v14, v12, v13

    mul-float v4, v1, v14

    iget-object v6, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->j:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move v3, v5

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 25
    iget v1, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->H:I

    int-to-float v2, v1

    mul-float v2, v2, v13

    iget v5, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->A:F

    int-to-float v1, v1

    mul-float v4, v1, v14

    iget-object v6, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->j:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move v3, v5

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 26
    :cond_9
    iget-object v1, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->v:Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    iget-boolean v2, v1, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->b:Z

    if-eqz v2, :cond_a

    .line 27
    iget-object v2, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->k:Landroid/graphics/Paint;

    iget v1, v1, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->d:I

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 28
    iget-object v1, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->k:Landroid/graphics/Paint;

    iget-object v2, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->v:Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    iget v2, v2, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->e:I

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    const/4 v2, 0x0

    .line 29
    iget v3, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->z:F

    iget v1, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->H:I

    int-to-float v4, v1

    iget v5, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->A:F

    iget-object v6, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->k:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_a
    const/4 v1, 0x0

    .line 30
    :goto_3
    iget v2, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->F:I

    if-ge v1, v2, :cond_18

    .line 31
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    .line 32
    iget v2, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->r:F

    int-to-float v3, v1

    mul-float v2, v2, v3

    sub-float/2addr v2, v11

    iget v3, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->I:I

    int-to-float v3, v3

    div-float/2addr v2, v3

    float-to-double v2, v2

    const-wide v4, 0x4056800000000000L    # 90.0

    const-wide v13, 0x400921fb54442d18L    # Math.PI

    .line 33
    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    div-double v13, v2, v13

    const-wide v15, 0x4066800000000000L    # 180.0

    mul-double v13, v13, v15

    sub-double/2addr v4, v13

    double-to-float v4, v4

    const/high16 v5, 0x42b40000    # 90.0f

    cmpl-float v6, v4, v5

    if-gez v6, :cond_17

    const/high16 v6, -0x3d4c0000    # -90.0f

    cmpg-float v6, v4, v6

    if-gtz v6, :cond_b

    goto/16 :goto_c

    .line 34
    :cond_b
    aget-object v6, v8, v1

    invoke-direct {v0, v6}, Lcom/join/mgps/customview/wheel/picker/WheelView;->y(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 35
    iget-boolean v13, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->f:Z

    if-nez v13, :cond_c

    iget-object v13, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->m:Ljava/lang/String;

    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_c

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_c

    .line 36
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v14, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->m:Ljava/lang/String;

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    goto :goto_4

    :cond_c
    move-object v13, v6

    .line 37
    :goto_4
    iget-boolean v14, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->S:Z

    if-eqz v14, :cond_d

    .line 38
    invoke-direct {v0, v13}, Lcom/join/mgps/customview/wheel/picker/WheelView;->B(Ljava/lang/String;)V

    const/16 v14, 0x11

    .line 39
    iput v14, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->N:I

    goto :goto_5

    :cond_d
    const v14, 0x800003

    .line 40
    iput v14, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->N:I

    .line 41
    :goto_5
    invoke-direct {v0, v13}, Lcom/join/mgps/customview/wheel/picker/WheelView;->w(Ljava/lang/String;)V

    .line 42
    invoke-direct {v0, v13}, Lcom/join/mgps/customview/wheel/picker/WheelView;->x(Ljava/lang/String;)V

    .line 43
    iget v14, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->I:I

    int-to-double v14, v14

    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v16

    iget v10, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->I:I

    move-object/from16 v18, v6

    int-to-double v5, v10

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v16, v16, v5

    invoke-static {v14, v15}, Ljava/lang/Double;->isNaN(D)Z

    sub-double v14, v14, v16

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v5

    iget v10, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->o:I

    int-to-double v9, v10

    invoke-static {v9, v10}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v5, v5, v9

    const-wide/high16 v9, 0x4000000000000000L    # 2.0

    div-double/2addr v5, v9

    sub-double/2addr v14, v5

    double-to-float v5, v14

    const/4 v6, 0x0

    .line 44
    invoke-virtual {v7, v6, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 45
    iget v9, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->z:F

    const v10, 0x3f4ccccd    # 0.8f

    cmpg-float v14, v5, v9

    if-gtz v14, :cond_e

    iget v14, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->o:I

    int-to-float v14, v14

    add-float/2addr v14, v5

    cmpl-float v14, v14, v9

    if-ltz v14, :cond_e

    .line 46
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    .line 47
    iget v4, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->H:I

    int-to-float v4, v4

    iget v9, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->z:F

    sub-float/2addr v9, v5

    invoke-virtual {v7, v6, v6, v4, v9}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 48
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v14

    double-to-float v4, v14

    mul-float v4, v4, v10

    invoke-virtual {v7, v12, v4}, Landroid/graphics/Canvas;->scale(FF)V

    .line 49
    iget v4, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->P:I

    int-to-float v4, v4

    iget v9, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->o:I

    int-to-float v9, v9

    iget-object v10, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->h:Landroid/graphics/Paint;

    invoke-virtual {v7, v13, v4, v9, v10}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 50
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    .line 51
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    .line 52
    iget v4, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->z:F

    sub-float/2addr v4, v5

    iget v5, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->H:I

    int-to-float v5, v5

    iget v9, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->r:F

    float-to-int v9, v9

    int-to-float v9, v9

    invoke-virtual {v7, v6, v4, v5, v9}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 53
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float v2, v2, v12

    invoke-virtual {v7, v12, v2}, Landroid/graphics/Canvas;->scale(FF)V

    .line 54
    iget v2, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->O:I

    int-to-float v2, v2

    iget v3, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->o:I

    int-to-float v3, v3

    iget v4, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->Q:F

    sub-float/2addr v3, v4

    iget-object v4, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->i:Landroid/graphics/Paint;

    invoke-virtual {v7, v13, v2, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 55
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    :goto_6
    const/4 v5, 0x0

    goto/16 :goto_b

    .line 56
    :cond_e
    iget v14, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->A:F

    cmpg-float v15, v5, v14

    if-gtz v15, :cond_f

    iget v15, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->o:I

    int-to-float v15, v15

    add-float/2addr v15, v5

    cmpl-float v15, v15, v14

    if-ltz v15, :cond_f

    .line 57
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    .line 58
    iget v4, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->H:I

    int-to-float v4, v4

    iget v9, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->A:F

    sub-float/2addr v9, v5

    invoke-virtual {v7, v6, v6, v4, v9}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 59
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v14

    double-to-float v4, v14

    mul-float v4, v4, v12

    invoke-virtual {v7, v12, v4}, Landroid/graphics/Canvas;->scale(FF)V

    .line 60
    iget v4, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->O:I

    int-to-float v4, v4

    iget v9, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->o:I

    int-to-float v9, v9

    iget v14, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->Q:F

    sub-float/2addr v9, v14

    iget-object v14, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->i:Landroid/graphics/Paint;

    invoke-virtual {v7, v13, v4, v9, v14}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 61
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    .line 62
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    .line 63
    iget v4, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->A:F

    sub-float/2addr v4, v5

    iget v5, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->H:I

    int-to-float v5, v5

    iget v9, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->r:F

    float-to-int v9, v9

    int-to-float v9, v9

    invoke-virtual {v7, v6, v4, v5, v9}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 64
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float v2, v2, v10

    invoke-virtual {v7, v12, v2}, Landroid/graphics/Canvas;->scale(FF)V

    .line 65
    iget v2, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->P:I

    int-to-float v2, v2

    iget v3, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->o:I

    int-to-float v3, v3

    iget-object v4, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->h:Landroid/graphics/Paint;

    invoke-virtual {v7, v13, v2, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 66
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    goto :goto_6

    :cond_f
    cmpl-float v9, v5, v9

    if-ltz v9, :cond_13

    .line 67
    iget v9, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->o:I

    int-to-float v15, v9

    add-float/2addr v15, v5

    cmpg-float v5, v15, v14

    if-gtz v5, :cond_13

    .line 68
    iget v2, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->H:I

    const/4 v5, 0x0

    invoke-virtual {v7, v5, v5, v2, v9}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    .line 69
    iget v2, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->o:I

    int-to-float v2, v2

    iget v3, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->Q:F

    sub-float/2addr v2, v3

    .line 70
    iget-object v3, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->l:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/join/mgps/customview/wheel/picker/entity/WheelItem;

    .line 71
    invoke-interface {v6}, Lcom/join/mgps/customview/wheel/picker/entity/WheelItem;->getName()Ljava/lang/String;

    move-result-object v6

    move-object/from16 v9, v18

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_10

    .line 72
    iput v4, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->D:I

    goto :goto_8

    :cond_10
    add-int/lit8 v4, v4, 0x1

    move-object/from16 v18, v9

    goto :goto_7

    .line 73
    :cond_11
    :goto_8
    iget-boolean v3, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->f:Z

    if-eqz v3, :cond_12

    iget-object v3, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->m:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_12

    .line 74
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->m:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 75
    :cond_12
    iget v3, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->O:I

    int-to-float v3, v3

    iget-object v4, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->i:Landroid/graphics/Paint;

    invoke-virtual {v7, v13, v3, v2, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_b

    :cond_13
    const/4 v5, 0x0

    .line 76
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    .line 77
    iget v9, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->H:I

    int-to-float v9, v9

    iget v14, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->r:F

    invoke-virtual {v7, v6, v6, v9, v14}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 78
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float v2, v2, v10

    invoke-virtual {v7, v12, v2}, Landroid/graphics/Canvas;->scale(FF)V

    .line 79
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v2

    const/high16 v3, 0x42b40000    # 90.0f

    div-float/2addr v2, v3

    float-to-double v2, v2

    const-wide v9, 0x400199999999999aL    # 2.2

    invoke-static {v2, v3, v9, v10}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    double-to-float v2, v2

    .line 80
    iget v3, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->p:I

    if-eqz v3, :cond_16

    .line 81
    iget-object v9, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->h:Landroid/graphics/Paint;

    const/4 v10, -0x1

    if-lez v3, :cond_14

    const/4 v3, 0x1

    goto :goto_9

    :cond_14
    const/4 v3, -0x1

    :goto_9
    cmpl-float v4, v4, v6

    if-lez v4, :cond_15

    goto :goto_a

    :cond_15
    const/4 v10, 0x1

    :goto_a
    mul-int v3, v3, v10

    int-to-float v3, v3

    const/high16 v4, 0x3f000000    # 0.5f

    mul-float v3, v3, v4

    mul-float v3, v3, v2

    invoke-virtual {v9, v3}, Landroid/graphics/Paint;->setTextSkewX(F)V

    .line 82
    iget-object v3, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->h:Landroid/graphics/Paint;

    sub-float v4, v12, v2

    const/high16 v6, 0x437f0000    # 255.0f

    mul-float v4, v4, v6

    float-to-int v4, v4

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 83
    :cond_16
    iget v3, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->P:I

    int-to-float v3, v3

    iget v4, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->p:I

    int-to-float v4, v4

    mul-float v4, v4, v2

    add-float/2addr v3, v4

    iget v2, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->o:I

    int-to-float v2, v2

    iget-object v4, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->h:Landroid/graphics/Paint;

    invoke-virtual {v7, v13, v3, v2, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 84
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    .line 85
    :goto_b
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    .line 86
    iget-object v2, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->i:Landroid/graphics/Paint;

    iget v3, v0, Lcom/join/mgps/customview/wheel/picker/WheelView;->q:I

    int-to-float v3, v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    goto :goto_d

    :cond_17
    :goto_c
    const/4 v5, 0x0

    .line 87
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    :goto_d
    add-int/lit8 v1, v1, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x1

    goto/16 :goto_3

    :cond_18
    :goto_e
    return-void
.end method

.method protected onMeasure(II)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->M:I

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/customview/wheel/picker/WheelView;->A()V

    .line 3
    iget p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->H:I

    iget p2, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->G:I

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->c:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    .line 3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_6

    const/4 v4, 0x2

    if-eq v2, v4, :cond_2

    if-nez v0, :cond_1

    .line 4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    .line 5
    iget v2, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->I:I

    int-to-float v5, v2

    sub-float/2addr v5, v0

    int-to-float v0, v2

    div-float/2addr v5, v0

    float-to-double v5, v5

    invoke-static {v5, v6}, Ljava/lang/Math;->acos(D)D

    move-result-wide v5

    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->I:I

    int-to-double v7, v0

    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v5, v5, v7

    .line 6
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->r:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, v0, v2

    float-to-double v7, v2

    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v5, v7

    float-to-double v7, v0

    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v5, v7

    double-to-int v2, v5

    .line 7
    iget v5, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->B:F

    rem-float/2addr v5, v0

    add-float/2addr v5, v0

    rem-float/2addr v5, v0

    .line 8
    iget v6, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->F:I

    div-int/2addr v6, v4

    sub-int/2addr v2, v6

    int-to-float v2, v2

    mul-float v2, v2, v0

    sub-float/2addr v2, v5

    float-to-int v0, v2

    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->J:I

    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->L:J

    sub-long/2addr v4, v6

    const-wide/16 v6, 0x78

    cmp-long v0, v4, v6

    if-lez v0, :cond_0

    const/4 v0, 0x3

    .line 10
    invoke-direct {p0, v0}, Lcom/join/mgps/customview/wheel/picker/WheelView;->D(I)V

    goto :goto_0

    .line 11
    :cond_0
    invoke-direct {p0, v3}, Lcom/join/mgps/customview/wheel/picker/WheelView;->D(I)V

    :cond_1
    :goto_0
    if-eqz v1, :cond_7

    const/4 v0, 0x0

    .line 12
    invoke-interface {v1, v0}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    goto/16 :goto_2

    .line 13
    :cond_2
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->K:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v1

    sub-float/2addr v0, v1

    .line 14
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v1

    iput v1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->K:F

    .line 15
    iget v1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->B:F

    add-float/2addr v1, v0

    iput v1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->B:F

    .line 16
    iget-boolean v1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->y:Z

    if-nez v1, :cond_7

    .line 17
    iget v1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->C:I

    neg-int v1, v1

    int-to-float v1, v1

    iget v2, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->r:F

    mul-float v1, v1, v2

    .line 18
    iget-object v2, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->l:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v2, v3

    iget v4, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->C:I

    sub-int/2addr v2, v4

    int-to-float v2, v2

    iget v4, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->r:F

    mul-float v2, v2, v4

    .line 19
    iget v5, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->B:F

    float-to-double v6, v5

    float-to-double v8, v4

    const-wide/high16 v10, 0x3fd0000000000000L    # 0.25

    invoke-static {v8, v9}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v8, v8, v10

    invoke-static {v6, v7}, Ljava/lang/Double;->isNaN(D)Z

    sub-double/2addr v6, v8

    float-to-double v8, v1

    cmpg-double v12, v6, v8

    if-gez v12, :cond_3

    sub-float v1, v5, v0

    goto :goto_1

    :cond_3
    float-to-double v6, v5

    float-to-double v8, v4

    .line 20
    invoke-static {v8, v9}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v8, v8, v10

    invoke-static {v6, v7}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v6, v8

    float-to-double v8, v2

    cmpl-double v4, v6, v8

    if-lez v4, :cond_4

    sub-float v2, v5, v0

    :cond_4
    :goto_1
    cmpg-float v0, v5, v1

    if-gez v0, :cond_5

    float-to-int v0, v1

    int-to-float v0, v0

    .line 21
    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->B:F

    goto :goto_2

    :cond_5
    cmpl-float v0, v5, v2

    if-lez v0, :cond_7

    float-to-int v0, v2

    int-to-float v0, v0

    .line 22
    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->B:F

    goto :goto_2

    .line 23
    :cond_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->L:J

    .line 24
    invoke-direct {p0}, Lcom/join/mgps/customview/wheel/picker/WheelView;->o()V

    .line 25
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->K:F

    if-eqz v1, :cond_7

    .line 26
    invoke-interface {v1, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 27
    :cond_7
    :goto_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    if-eqz p1, :cond_8

    .line 28
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_8
    return v3
.end method

.method public final setCycleDisable(Z)V
    .locals 0

    xor-int/lit8 p1, p1, 0x1

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->y:Z

    return-void
.end method

.method public setDividerColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->v:Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    invoke-virtual {v0, p1}, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->b(I)Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    .line 2
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->j:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public setDividerConfig(Lcom/join/mgps/customview/wheel/picker/WheelView$c;)V
    .locals 2

    if-nez p1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->v:Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->h(Z)Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    .line 2
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->v:Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->f(Z)Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    return-void

    .line 3
    :cond_0
    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->v:Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    .line 4
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->j:Landroid/graphics/Paint;

    iget v1, p1, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->c:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->j:Landroid/graphics/Paint;

    iget v1, p1, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->h:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->j:Landroid/graphics/Paint;

    iget v1, p1, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->f:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->k:Landroid/graphics/Paint;

    iget v1, p1, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->d:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->k:Landroid/graphics/Paint;

    iget p1, p1, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->e:I

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    return-void
.end method

.method public final setGravity(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->N:I

    return-void
.end method

.method public final setItems(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "*>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 3
    instance-of v1, v0, Lcom/join/mgps/customview/wheel/picker/entity/WheelItem;

    if-eqz v1, :cond_0

    .line 4
    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->l:Ljava/util/List;

    check-cast v0, Lcom/join/mgps/customview/wheel/picker/entity/WheelItem;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 5
    :cond_0
    instance-of v1, v0, Ljava/lang/CharSequence;

    if-nez v1, :cond_2

    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_1

    goto :goto_1

    .line 6
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "please implements "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v1, Lcom/join/mgps/customview/wheel/picker/entity/WheelItem;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 7
    :cond_2
    :goto_1
    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->l:Ljava/util/List;

    new-instance v2, Lcom/join/mgps/customview/wheel/picker/WheelView$StringItem;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lcom/join/mgps/customview/wheel/picker/WheelView$StringItem;-><init>(Ljava/lang/String;Lcom/join/mgps/customview/wheel/picker/WheelView$a;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 8
    :cond_3
    invoke-direct {p0}, Lcom/join/mgps/customview/wheel/picker/WheelView;->A()V

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setItems(Ljava/util/List;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "*>;I)V"
        }
    .end annotation

    .line 10
    invoke-virtual {p0, p1}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setItems(Ljava/util/List;)V

    .line 11
    invoke-virtual {p0, p2}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setSelectedIndex(I)V

    return-void
.end method

.method public final setItems(Ljava/util/List;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 13
    invoke-interface {p1, p2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p2

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    const/4 p2, 0x0

    .line 14
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setItems(Ljava/util/List;I)V

    return-void
.end method

.method public final setItems([Ljava/lang/String;)V
    .locals 0

    .line 12
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setItems(Ljava/util/List;)V

    return-void
.end method

.method public final setItems([Ljava/lang/String;I)V
    .locals 0

    .line 15
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setItems(Ljava/util/List;I)V

    return-void
.end method

.method public final setItems([Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 16
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setItems(Ljava/util/List;Ljava/lang/String;)V

    return-void
.end method

.method public final setLabel(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    .line 3
    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setLabel(Ljava/lang/String;Z)V

    return-void
.end method

.method public final setLabel(Ljava/lang/String;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->m:Ljava/lang/String;

    .line 2
    iput-boolean p2, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->f:Z

    return-void
.end method

.method public setLineConfig(Lcom/join/mgps/customview/wheel/picker/WheelView$c;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setDividerConfig(Lcom/join/mgps/customview/wheel/picker/WheelView$c;)V

    return-void
.end method

.method public final setLineSpaceMultiplier(F)V
    .locals 0
    .param p1    # F
        .annotation build Landroidx/annotation/FloatRange;
            from = 2.0
            to = 4.0
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->w:F

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/customview/wheel/picker/WheelView;->u()V

    return-void
.end method

.method public final setOffset(I)V
    .locals 3
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x1L
            to = 0x5L
        .end annotation
    .end param

    const/4 v0, 0x1

    if-lt p1, v0, :cond_1

    const/4 v1, 0x5

    if-gt p1, v1, :cond_1

    mul-int/lit8 v1, p1, 0x2

    add-int/2addr v1, v0

    .line 1
    rem-int/lit8 v2, p1, 0x2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    sub-int/2addr p1, v0

    :goto_0
    add-int/2addr v1, p1

    .line 2
    invoke-virtual {p0, v1}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setVisibleItemCount(I)V

    return-void

    .line 3
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "must between 1 and 5"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setOnItemSelectListener(Lcom/join/mgps/customview/wheel/picker/WheelView$g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->d:Lcom/join/mgps/customview/wheel/picker/WheelView$g;

    return-void
.end method

.method public final setOnWheelListener(Lcom/join/mgps/customview/wheel/picker/WheelView$h;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->e:Lcom/join/mgps/customview/wheel/picker/WheelView$h;

    return-void
.end method

.method public setPadding(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setTextPadding(I)V

    return-void
.end method

.method public final setSelectedIndex(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->l:Ljava/util/List;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz p1, :cond_1

    if-lez p1, :cond_2

    if-ge p1, v0, :cond_2

    .line 3
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->D:I

    if-eq p1, v0, :cond_2

    .line 4
    :cond_1
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->C:I

    const/4 p1, 0x0

    .line 5
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->B:F

    const/4 p1, 0x0

    .line 6
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->J:I

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_2
    :goto_0
    return-void
.end method

.method public setTextColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 5
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->t:I

    .line 6
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->u:I

    .line 7
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->h:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->i:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public setTextColor(II)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->t:I

    .line 2
    iput p2, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->u:I

    .line 3
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->h:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->i:Landroid/graphics/Paint;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public setTextPadding(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    int-to-float p1, p1

    invoke-static {v0, p1}, La2/a;->H(Landroid/content/Context;F)I

    move-result p1

    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->x:I

    return-void
.end method

.method public final setTextSize(F)V
    .locals 1

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float v0, v0, p1

    float-to-int p1, v0

    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->q:I

    .line 2
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->h:Landroid/graphics/Paint;

    int-to-float p1, p1

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->i:Landroid/graphics/Paint;

    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->q:I

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    :cond_0
    return-void
.end method

.method public setTextSizeAutoFit(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->S:Z

    return-void
.end method

.method public setTextSkewXOffset(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->p:I

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->i:Landroid/graphics/Paint;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextScaleX(F)V

    :cond_0
    return-void
.end method

.method public final setTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->s:Landroid/graphics/Typeface;

    .line 2
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->h:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 3
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->i:Landroid/graphics/Paint;

    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->s:Landroid/graphics/Typeface;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    return-void
.end method

.method public setUseWeight(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->R:Z

    return-void
.end method

.method public final setVisibleItemCount(I)V
    .locals 1

    .line 1
    rem-int/lit8 v0, p1, 0x2

    if-eqz v0, :cond_1

    .line 2
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->F:I

    if-eq p1, v0, :cond_0

    .line 3
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView;->F:I

    :cond_0
    return-void

    .line 4
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "must be odd"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
