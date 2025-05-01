.class public Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;
.super Landroid/view/ViewGroup;
.source "ConsecutiveScrollerLayout.java"

# interfaces
.implements Landroidx/core/view/ScrollingView;
.implements Landroidx/core/view/NestedScrollingParent2;
.implements Landroidx/core/view/NestedScrollingChild2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$e;,
        Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$g;,
        Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$f;,
        Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$LayoutParams;
    }
.end annotation


# static fields
.field public static final A1:I = 0x0

.field public static final B1:I = 0x1

.field public static final C1:I = 0x2

.field static final D1:Landroid/view/animation/Interpolator;

.field private static final W:I = 0x0

.field private static final p0:I = 0x1

.field private static final p1:I = 0x2

.field private static final v1:I = 0x3e8


# instance fields
.field private A:I

.field private B:I

.field private C:I

.field private D:Landroid/widget/EdgeEffect;

.field private E:Landroid/widget/EdgeEffect;

.field private F:I

.field private G:Z

.field private H:Z

.field private I:Z

.field private J:I

.field private K:I

.field private L:Landroid/view/View;

.field private final M:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private final N:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private O:I

.field private final P:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private Q:I

.field private R:Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$g;

.field private S:Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$e;

.field private T:I

.field private U:Z

.field private V:Z

.field private b:I

.field c:I

.field private d:Landroid/widget/OverScroller;

.field private e:Landroid/view/VelocityTracker;

.field private f:Landroid/view/VelocityTracker;

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:I

.field private l:I

.field private m:I

.field private n:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private final o:[I

.field private p:Z

.field private q:I

.field protected r:Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$f;

.field private s:I

.field private t:Landroidx/core/view/NestedScrollingParentHelper;

.field private u:Landroidx/core/view/NestedScrollingChildHelper;

.field private final v:[I

.field private final w:[I

.field private x:Landroid/view/View;

.field private y:I

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$a;

    invoke-direct {v0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$a;-><init>()V

    sput-object v0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->D1:Landroid/view/animation/Interpolator;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance p3, Ljava/util/HashMap;

    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    iput-object p3, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->n:Ljava/util/HashMap;

    const/4 p3, 0x2

    new-array v0, p3, [I

    .line 5
    iput-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->o:[I

    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->p:Z

    .line 7
    iput v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->q:I

    const/4 v1, -0x1

    .line 8
    iput v1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->s:I

    new-array v2, p3, [I

    .line 9
    iput-object v2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->v:[I

    new-array v2, p3, [I

    .line 10
    iput-object v2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->w:[I

    .line 11
    iput v1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->z:I

    .line 12
    iput v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->A:I

    .line 13
    iput v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->B:I

    .line 14
    iput v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->C:I

    .line 15
    iput v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->J:I

    .line 16
    iput v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->K:I

    .line 17
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->M:Ljava/util/List;

    .line 18
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->N:Ljava/util/List;

    .line 19
    iput v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->O:I

    .line 20
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->P:Ljava/util/List;

    .line 21
    iput v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->Q:I

    .line 22
    iput v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->T:I

    .line 23
    iput-boolean v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->U:Z

    .line 24
    iput-boolean v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->V:Z

    const/4 v1, 0x0

    .line 25
    :try_start_0
    sget-object v2, Lcom/join/android/app/mgsim/wufun/R$styleable;->ConsecutiveScrollerLayout:[I

    invoke-virtual {p1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v1

    const/4 p2, 0x3

    .line 26
    invoke-virtual {v1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->G:Z

    .line 27
    invoke-virtual {v1, p3, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->H:Z

    const/4 p2, 0x4

    .line 28
    invoke-virtual {v1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result p2

    iput p2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->K:I

    const/4 p2, 0x1

    .line 29
    invoke-virtual {v1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->I:Z

    .line 30
    invoke-virtual {v1, v0, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result p3

    iput p3, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->J:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 32
    new-instance p3, Landroid/widget/OverScroller;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->D1:Landroid/view/animation/Interpolator;

    invoke-direct {p3, v1, v2}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object p3, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->d:Landroid/widget/OverScroller;

    .line 33
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    .line 34
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result p3

    iput p3, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->h:I

    .line 35
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result p1

    iput p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->i:I

    .line 36
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    move-result p1

    iput p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->j:I

    .line 37
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setWillNotDraw(Z)V

    .line 38
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->setVerticalScrollBarEnabled(Z)V

    .line 39
    new-instance p1, Landroidx/core/view/NestedScrollingParentHelper;

    invoke-direct {p1, p0}, Landroidx/core/view/NestedScrollingParentHelper;-><init>(Landroid/view/ViewGroup;)V

    iput-object p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->t:Landroidx/core/view/NestedScrollingParentHelper;

    .line 40
    new-instance p1, Landroidx/core/view/NestedScrollingChildHelper;

    invoke-direct {p1, p0}, Landroidx/core/view/NestedScrollingChildHelper;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->u:Landroidx/core/view/NestedScrollingChildHelper;

    .line 41
    invoke-virtual {p0, p2}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->setNestedScrollingEnabled(Z)V

    .line 42
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->setChildrenDrawingOrderEnabled(Z)V

    .line 43
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setMotionEventSplittingEnabled(Z)V

    return-void

    :catchall_0
    move-exception p1

    if-eqz v1, :cond_0

    .line 44
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 45
    :cond_0
    throw p1
.end method

.method private A()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->f:Landroid/view/VelocityTracker;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->f:Landroid/view/VelocityTracker;

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    :goto_0
    return-void
.end method

.method private B()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->e:Landroid/view/VelocityTracker;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->e:Landroid/view/VelocityTracker;

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    :goto_0
    return-void
.end method

.method private C()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->e:Landroid/view/VelocityTracker;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->e:Landroid/view/VelocityTracker;

    :cond_0
    return-void
.end method

.method private F(II)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->x(II)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    invoke-static {p1}, Lcom/donkingliang/consecutivescroller/c;->t(Landroid/view/View;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private G(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->s:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-ltz v0, :cond_1

    .line 2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v1

    if-lt v0, v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {p0, p1, v0}, Lcom/donkingliang/consecutivescroller/c;->j(Landroid/view/View;Landroid/view/MotionEvent;I)I

    move-result v1

    .line 4
    invoke-static {p0, p1, v0}, Lcom/donkingliang/consecutivescroller/c;->k(Landroid/view/View;Landroid/view/MotionEvent;I)I

    move-result p1

    .line 5
    invoke-direct {p0, v1, p1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->F(II)Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method private H()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->N:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->M:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_2

    .line 2
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->N:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 3
    iget-object v3, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->N:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->M:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    if-eq v3, v4, :cond_0

    return v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    return v2
.end method

.method private N(II)I
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 2
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    if-ne v0, v2, :cond_0

    move p2, v1

    goto :goto_0

    :cond_0
    const/high16 v2, -0x80000000

    if-ne v0, v2, :cond_1

    .line 3
    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 4
    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getSuggestedMinimumWidth()I

    move-result v0

    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    move-result p2

    const/4 v0, 0x0

    .line 5
    invoke-static {p2, p1, v0}, Landroid/view/ViewGroup;->resolveSizeAndState(III)I

    move-result p1

    return p1
.end method

.method private O(II)V
    .locals 9

    .line 1
    iget v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->b:I

    .line 2
    invoke-direct {p0, p1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->j(I)V

    .line 3
    iget v1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->b:I

    sub-int v4, v1, v0

    sub-int v6, p1, v4

    .line 4
    iget-object v2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->u:Landroidx/core/view/NestedScrollingChildHelper;

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    move v8, p2

    invoke-virtual/range {v2 .. v8}, Landroidx/core/view/NestedScrollingChildHelper;->dispatchNestedScroll(IIII[II)Z

    return-void
.end method

.method private P(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->S:Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$e;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$e;->a(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method private Q(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->N:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 3
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    .line 4
    invoke-direct {p0, p1, v0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->w(Ljava/util/List;I)I

    move-result v2

    .line 5
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v3

    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->getStickyY()I

    move-result v4

    add-int/2addr v4, v2

    if-gt v3, v4, :cond_0

    .line 6
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->getStickyY()I

    move-result v3

    add-int/2addr v3, v2

    int-to-float v2, v3

    invoke-virtual {v1, v2}, Landroid/view/View;->setY(F)V

    const/4 v2, 0x1

    .line 7
    invoke-virtual {v1, v2}, Landroid/view/View;->setClickable(Z)V

    .line 8
    iget-object v2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->N:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 9
    :cond_1
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->H()Z

    move-result p1

    if-nez p1, :cond_2

    .line 10
    iget-object p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->M:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 11
    iget-object p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->M:Ljava/util/List;

    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->N:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 12
    iget-object p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->N:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 13
    iget-object p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->M:Ljava/util/List;

    invoke-direct {p0, p1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->P(Ljava/util/List;)V

    :cond_2
    return-void
.end method

.method private R()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->f:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->f:Landroid/view/VelocityTracker;

    :cond_0
    return-void
.end method

.method private S()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->e:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->e:Landroid/view/VelocityTracker;

    :cond_0
    return-void
.end method

.method private T()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->getNonGoneChildren()Ljava/util/List;

    move-result-object v0

    .line 2
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    const/4 v2, 0x0

    .line 3
    invoke-virtual {v1, v2}, Landroid/view/View;->setTranslationY(F)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private U()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->m()Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->x:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v0

    iget-object v1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->x:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->y:I

    :cond_0
    return-void
.end method

.method private V()V
    .locals 8

    .line 1
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->getStickyChildren()Ljava/util/List;

    move-result-object v0

    .line 2
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_7

    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    .line 4
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    const/4 v5, 0x0

    .line 5
    invoke-virtual {v4, v5}, Landroid/view/View;->setTranslationY(F)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 6
    :cond_0
    iget-boolean v3, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->G:Z

    if-eqz v3, :cond_1

    .line 7
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->f()V

    .line 8
    invoke-direct {p0, v0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->Q(Ljava/util/List;)V

    goto :goto_3

    .line 9
    :cond_1
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->g()V

    add-int/lit8 v1, v1, -0x1

    move v3, v1

    :goto_1
    const/4 v4, 0x0

    if-ltz v3, :cond_4

    .line 10
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/View;

    .line 11
    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    move-result v6

    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->getStickyY()I

    move-result v7

    if-gt v6, v7, :cond_3

    if-eq v3, v1, :cond_2

    add-int/lit8 v3, v3, 0x1

    .line 12
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/View;

    :cond_2
    move-object v0, v4

    move-object v4, v5

    goto :goto_2

    :cond_3
    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    :cond_4
    move-object v0, v4

    .line 13
    :goto_2
    iget-object v1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->L:Landroid/view/View;

    if-eqz v4, :cond_6

    if-eqz v0, :cond_5

    .line 14
    invoke-virtual {p0, v4}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->L(Landroid/view/View;)Z

    move-result v3

    if-nez v3, :cond_5

    .line 15
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->getStickyY()I

    move-result v5

    sub-int/2addr v0, v5

    sub-int/2addr v3, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 16
    :cond_5
    invoke-direct {p0, v4, v2}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->j0(Landroid/view/View;I)V

    :cond_6
    if-eq v1, v4, :cond_8

    .line 17
    iput-object v4, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->L:Landroid/view/View;

    .line 18
    invoke-direct {p0, v1, v4}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->i0(Landroid/view/View;Landroid/view/View;)V

    goto :goto_3

    .line 19
    :cond_7
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->f()V

    .line 20
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->g()V

    :cond_8
    :goto_3
    return-void
.end method

.method private W(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->r:Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$f;

    if-eqz v0, :cond_0

    .line 2
    iget v1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->T:I

    invoke-interface {v0, p0, p1, p2, v1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$f;->a(Landroid/view/View;III)V

    :cond_0
    return-void
.end method

.method private X(Landroid/view/View;I)V
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/donkingliang/consecutivescroller/c;->p(Landroid/view/View;)Landroid/view/View;

    move-result-object p1

    .line 2
    instance-of v0, p1, Landroid/widget/AbsListView;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Landroid/widget/AbsListView;

    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_2

    .line 5
    invoke-virtual {p1, p2}, Landroid/widget/AbsListView;->scrollListBy(I)V

    goto :goto_1

    .line 6
    :cond_0
    instance-of v0, p1, Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 7
    move-object v0, p1

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0}, Lcom/donkingliang/consecutivescroller/c;->x(Landroidx/recyclerview/widget/RecyclerView;)Z

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 8
    :goto_0
    invoke-virtual {p1, v1, p2}, Landroid/view/View;->scrollBy(II)V

    if-eqz v0, :cond_2

    .line 9
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    new-instance p2, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$b;

    invoke-direct {p2, p0, p1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$b;-><init>(Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;Landroidx/recyclerview/widget/RecyclerView;)V

    const-wide/16 v0, 0x0

    invoke-virtual {p1, p2, v0, v1}, Landroid/view/ViewGroup;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_2
    :goto_1
    return-void
.end method

.method static synthetic a(Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->d(ZZ)V

    return-void
.end method

.method private a0(I)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->computeVerticalScrollOffset()I

    move-result v0

    .line 2
    :cond_0
    iget v1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->z:I

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-eq v1, v2, :cond_2

    .line 3
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 4
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v4

    iget v5, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->B:I

    sub-int/2addr v4, v5

    .line 5
    invoke-direct {p0, v1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->s(Landroid/view/View;)I

    move-result v1

    sub-int/2addr v4, v1

    .line 6
    iget v1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->z:I

    invoke-direct {p0, v1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->y(I)I

    move-result v1

    .line 7
    iget v5, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->C:I

    const/16 v6, 0x3e8

    if-ge v5, v6, :cond_1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v5

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v6

    add-int/2addr v5, v6

    add-int/2addr v5, v1

    if-le v5, v4, :cond_1

    invoke-virtual {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->K()Z

    move-result v5

    if-eqz v5, :cond_3

    .line 8
    :cond_1
    iput v2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->z:I

    .line 9
    iput v3, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->A:I

    .line 10
    iput v3, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->B:I

    .line 11
    iput v3, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->C:I

    .line 12
    invoke-virtual {p0, v3}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->setScrollState(I)V

    goto/16 :goto_2

    :cond_2
    const/4 v1, 0x0

    const/4 v4, 0x0

    .line 13
    :cond_3
    invoke-virtual {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->K()Z

    move-result v5

    if-nez v5, :cond_8

    .line 14
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v5

    iget v6, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->c:I

    if-ge v5, v6, :cond_4

    .line 15
    invoke-virtual {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->n()Landroid/view/View;

    move-result-object v5

    goto :goto_0

    .line 16
    :cond_4
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->getBottomView()Landroid/view/View;

    move-result-object v5

    :goto_0
    if-eqz v5, :cond_8

    .line 17
    invoke-virtual {p0}, Landroid/view/ViewGroup;->awakenScrollBars()Z

    .line 18
    invoke-static {v5}, Lcom/donkingliang/consecutivescroller/c;->o(Landroid/view/View;)I

    move-result v3

    if-gez v3, :cond_6

    .line 19
    invoke-static {p1, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 20
    iget v6, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->z:I

    if-eq v6, v2, :cond_5

    .line 21
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v6

    add-int/2addr v2, v6

    add-int/2addr v2, v1

    sub-int/2addr v4, v2

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 22
    :cond_5
    invoke-direct {p0, v5, v3}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->X(Landroid/view/View;I)V

    goto :goto_1

    .line 23
    :cond_6
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v3

    .line 24
    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    move-result v5

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v6

    add-int/2addr v5, v6

    sub-int/2addr v5, v3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v6

    sub-int/2addr v5, v6

    .line 25
    invoke-static {p1, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    neg-int v6, v3

    .line 26
    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 27
    iget v6, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->z:I

    if-eq v6, v2, :cond_7

    .line 28
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v6

    add-int/2addr v2, v6

    add-int/2addr v2, v1

    sub-int/2addr v4, v2

    invoke-static {v5, v4}, Ljava/lang/Math;->max(II)I

    move-result v5

    :cond_7
    add-int/2addr v3, v5

    .line 29
    invoke-direct {p0, v3}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->b0(I)V

    move v3, v5

    .line 30
    :goto_1
    iget v1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->b:I

    add-int/2addr v1, v3

    iput v1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->b:I

    sub-int/2addr p1, v3

    :cond_8
    if-gez v3, :cond_9

    if-ltz p1, :cond_0

    .line 31
    :cond_9
    :goto_2
    invoke-virtual {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->computeVerticalScrollOffset()I

    move-result p1

    if-eq v0, p1, :cond_a

    .line 32
    invoke-direct {p0, p1, v0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->W(II)V

    :cond_a
    return-void
.end method

.method private b()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->K()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->J()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private b0(I)V
    .locals 2

    const/4 v0, 0x0

    if-gez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 1
    :cond_0
    iget v1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->c:I

    if-le p1, v1, :cond_1

    move p1, v1

    .line 2
    :cond_1
    :goto_0
    invoke-super {p0, v0, p1}, Landroid/view/ViewGroup;->scrollTo(II)V

    return-void
.end method

.method private d(ZZ)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->b:I

    .line 2
    iget-object v1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->x:Landroid/view/View;

    if-eqz v1, :cond_0

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result p1

    const/4 v1, -0x1

    if-eq p1, v1, :cond_1

    .line 4
    iget-object p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->x:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p1

    iget v1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->y:I

    add-int/2addr p1, v1

    invoke-direct {p0, p1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->b0(I)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result p1

    invoke-direct {p0, p1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->b0(I)V

    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1, p2}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->e(ZZ)V

    .line 7
    iget p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->b:I

    const/4 p2, 0x0

    if-eq v0, p1, :cond_2

    iget-object p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->x:Landroid/view/View;

    invoke-virtual {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->m()Landroid/view/View;

    move-result-object v1

    if-eq p1, v1, :cond_2

    .line 8
    invoke-virtual {p0, p2, v0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->scrollTo(II)V

    :cond_2
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->x:Landroid/view/View;

    .line 10
    iput p2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->y:I

    .line 11
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->T()V

    .line 12
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->V()V

    return-void
.end method

.method private e(ZZ)V
    .locals 7

    if-nez p2, :cond_1

    .line 1
    iget-boolean p2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->p:Z

    if-nez p2, :cond_0

    iget-object p2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->d:Landroid/widget/OverScroller;

    invoke-virtual {p2}, Landroid/widget/OverScroller;->isFinished()Z

    move-result p2

    if-eqz p2, :cond_0

    iget p2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->z:I

    const/4 v0, -0x1

    if-eq p2, v0, :cond_1

    :cond_0
    return-void

    .line 2
    :cond_1
    invoke-virtual {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->computeVerticalScrollOffset()I

    move-result p2

    .line 3
    invoke-virtual {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->m()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_2

    return-void

    .line 4
    :cond_2
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v1

    if-eqz p1, :cond_3

    .line 5
    :goto_0
    invoke-static {v0}, Lcom/donkingliang/consecutivescroller/c;->l(Landroid/view/View;)I

    move-result v2

    .line 6
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v4

    sub-int/2addr v3, v4

    if-lez v2, :cond_3

    if-gez v3, :cond_3

    neg-int v3, v3

    .line 7
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 8
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v3

    sub-int/2addr v3, v2

    invoke-direct {p0, v3}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->b0(I)V

    .line 9
    invoke-direct {p0, v0, v2}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->X(Landroid/view/View;I)V

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    const/4 v2, 0x0

    :goto_1
    const/16 v3, 0x8

    if-ge v2, v1, :cond_7

    .line 10
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 11
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v5

    if-ne v5, v3, :cond_4

    goto :goto_3

    .line 12
    :cond_4
    invoke-static {v4}, Lcom/donkingliang/consecutivescroller/c;->t(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 13
    invoke-static {v4}, Lcom/donkingliang/consecutivescroller/c;->m(Landroid/view/View;)Landroid/view/View;

    move-result-object v3

    .line 14
    instance-of v4, v3, Lcom/donkingliang/consecutivescroller/a;

    if-eqz v4, :cond_5

    .line 15
    check-cast v3, Lcom/donkingliang/consecutivescroller/a;

    invoke-interface {v3}, Lcom/donkingliang/consecutivescroller/a;->getScrolledViews()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_6

    .line 16
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_6

    .line 17
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_2
    if-ge v5, v4, :cond_6

    .line 18
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/View;

    invoke-virtual {p0, v6}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->Y(Landroid/view/View;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 19
    :cond_5
    invoke-virtual {p0, v3}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->Y(Landroid/view/View;)V

    :cond_6
    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_7
    :goto_4
    add-int/lit8 v1, v1, 0x1

    .line 20
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    if-ge v1, v2, :cond_b

    .line 21
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 22
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v4

    if-ne v4, v3, :cond_8

    goto :goto_4

    .line 23
    :cond_8
    invoke-static {v2}, Lcom/donkingliang/consecutivescroller/c;->t(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 24
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    if-ne v1, v4, :cond_9

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v5

    if-ge v4, v5, :cond_9

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v4

    iget v5, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->c:I

    if-lt v4, v5, :cond_9

    goto :goto_4

    .line 25
    :cond_9
    invoke-static {v2}, Lcom/donkingliang/consecutivescroller/c;->m(Landroid/view/View;)Landroid/view/View;

    move-result-object v2

    .line 26
    instance-of v4, v2, Lcom/donkingliang/consecutivescroller/a;

    if-eqz v4, :cond_a

    .line 27
    check-cast v2, Lcom/donkingliang/consecutivescroller/a;

    invoke-interface {v2}, Lcom/donkingliang/consecutivescroller/a;->getScrolledViews()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_7

    .line 28
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_7

    .line 29
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_5
    if-ge v5, v4, :cond_7

    .line 30
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/View;

    invoke-virtual {p0, v6}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->Z(Landroid/view/View;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    .line 31
    :cond_a
    invoke-virtual {p0, v2}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->Z(Landroid/view/View;)V

    goto :goto_4

    .line 32
    :cond_b
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->h()V

    if-eqz p1, :cond_c

    .line 33
    invoke-virtual {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->computeVerticalScrollOffset()I

    move-result p1

    if-eq p2, p1, :cond_c

    .line 34
    invoke-direct {p0, p1, p2}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->W(II)V

    .line 35
    :cond_c
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->V()V

    return-void
.end method

.method private e0(I)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->computeVerticalScrollOffset()I

    move-result v0

    .line 2
    :cond_0
    iget v1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->z:I

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-eq v1, v2, :cond_3

    .line 3
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 4
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v4

    iget v5, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->B:I

    sub-int/2addr v4, v5

    .line 5
    invoke-direct {p0, v1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->s(Landroid/view/View;)I

    move-result v1

    sub-int/2addr v4, v1

    .line 6
    iget v1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->B:I

    if-gez v1, :cond_1

    .line 7
    iget v1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->z:I

    invoke-direct {p0, v1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->y(I)I

    move-result v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 8
    :goto_0
    iget v5, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->C:I

    const/16 v6, 0x3e8

    if-ge v5, v6, :cond_2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v5

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v6

    add-int/2addr v5, v6

    add-int/2addr v5, v1

    if-ge v5, v4, :cond_2

    invoke-virtual {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->J()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 9
    :cond_2
    iput v2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->z:I

    .line 10
    iput v3, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->A:I

    .line 11
    iput v3, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->B:I

    .line 12
    iput v3, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->C:I

    .line 13
    invoke-virtual {p0, v3}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->setScrollState(I)V

    goto/16 :goto_3

    :cond_3
    const/4 v1, 0x0

    const/4 v4, 0x0

    .line 14
    :cond_4
    invoke-virtual {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->J()Z

    move-result v5

    if-nez v5, :cond_9

    .line 15
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v5

    iget v6, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->c:I

    if-ge v5, v6, :cond_5

    .line 16
    invoke-virtual {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->m()Landroid/view/View;

    move-result-object v5

    goto :goto_1

    .line 17
    :cond_5
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->getBottomView()Landroid/view/View;

    move-result-object v5

    :goto_1
    if-eqz v5, :cond_9

    .line 18
    invoke-virtual {p0}, Landroid/view/ViewGroup;->awakenScrollBars()Z

    .line 19
    invoke-static {v5}, Lcom/donkingliang/consecutivescroller/c;->l(Landroid/view/View;)I

    move-result v3

    if-lez v3, :cond_7

    .line 20
    invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 21
    iget v6, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->z:I

    if-eq v6, v2, :cond_6

    .line 22
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v6

    add-int/2addr v2, v6

    add-int/2addr v2, v1

    sub-int/2addr v4, v2

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 23
    :cond_6
    invoke-direct {p0, v5, v3}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->X(Landroid/view/View;I)V

    goto :goto_2

    .line 24
    :cond_7
    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v5

    sub-int/2addr v3, v5

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v5

    sub-int/2addr v3, v5

    .line 25
    invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 26
    iget v5, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->z:I

    if-eq v5, v2, :cond_8

    .line 27
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v5

    add-int/2addr v2, v5

    add-int/2addr v2, v1

    sub-int/2addr v4, v2

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 28
    :cond_8
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v1

    add-int/2addr v1, v3

    invoke-direct {p0, v1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->b0(I)V

    .line 29
    :goto_2
    iget v1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->b:I

    add-int/2addr v1, v3

    iput v1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->b:I

    sub-int/2addr p1, v3

    :cond_9
    if-lez v3, :cond_a

    if-gtz p1, :cond_0

    .line 30
    :cond_a
    :goto_3
    invoke-virtual {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->computeVerticalScrollOffset()I

    move-result p1

    if-eq v0, p1, :cond_b

    .line 31
    invoke-direct {p0, p1, v0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->W(II)V

    :cond_b
    return-void
.end method

.method private f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->L:Landroid/view/View;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    iput-object v1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->L:Landroid/view/View;

    .line 3
    invoke-direct {p0, v0, v1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->i0(Landroid/view/View;Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method private g()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->M:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->M:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 3
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->M:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->P(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method private getAdjustHeight()I
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->getStickyChildren()Ljava/util/List;

    move-result-object v0

    .line 2
    iget v1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->J:I

    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    .line 4
    iget-boolean v3, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->G:Z

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_3

    .line 5
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    .line 6
    invoke-virtual {p0, v4}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->L(Landroid/view/View;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 7
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    add-int/2addr v1, v4

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    add-int/lit8 v2, v2, -0x1

    :goto_1
    if-ltz v2, :cond_3

    .line 8
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    .line 9
    invoke-virtual {p0, v3}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->L(Landroid/view/View;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 10
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    add-int/2addr v1, v0

    goto :goto_2

    :cond_2
    add-int/lit8 v2, v2, -0x1

    goto :goto_1

    :cond_3
    :goto_2
    return v1
.end method

.method private getBottomView()Landroid/view/View;
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->getEffectiveChildren()Ljava/util/List;

    move-result-object v0

    .line 2
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private getEffectiveChildren()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 3
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 4
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v4

    const/16 v5, 0x8

    if-eq v4, v5, :cond_0

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v4

    if-lez v4, :cond_0

    .line 5
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private getNonGoneChildren()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 3
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 4
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v4

    const/16 v5, 0x8

    if-eq v4, v5, :cond_0

    .line 5
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private getScrollRange()I
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->computeVerticalScrollRange()I

    move-result v0

    .line 3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v2, v3

    sub-int/2addr v0, v2

    .line 4
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v1

    :cond_0
    return v1
.end method

.method private getStickyChildren()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 3
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 4
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v4

    const/16 v5, 0x8

    if-eq v4, v5, :cond_0

    invoke-virtual {p0, v3}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->M(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 5
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private getStickyY()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v1

    add-int/2addr v0, v1

    iget v1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->K:I

    add-int/2addr v0, v1

    return v0
.end method

.method private h()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->computeVerticalScrollOffset()I

    move-result v0

    iput v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->b:I

    return-void
.end method

.method private h0()V
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    .line 3
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 4
    invoke-virtual {p0, v4}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->M(Landroid/view/View;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {p0, v4}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->L(Landroid/view/View;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 5
    :cond_0
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    if-ge v2, v1, :cond_4

    .line 6
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 7
    invoke-virtual {p0, v3}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->M(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {p0, v3}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->L(Landroid/view/View;)Z

    move-result v4

    if-nez v4, :cond_3

    .line 8
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 9
    :cond_4
    iget-object v1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->P:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 10
    iget-object v1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->P:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method private i(Landroid/view/View;)V
    .locals 2

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, v0}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    const/4 v1, 0x2

    .line 3
    invoke-virtual {p1, v1}, Landroid/view/View;->setOverScrollMode(I)V

    .line 4
    invoke-static {p1, v0}, Landroidx/core/view/ViewCompat;->setNestedScrollingEnabled(Landroid/view/View;Z)V

    return-void
.end method

.method private i0(Landroid/view/View;Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->R:Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$g;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1, p2}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$g;->a(Landroid/view/View;Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method private j(I)V
    .locals 0

    if-lez p1, :cond_0

    .line 1
    invoke-direct {p0, p1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->e0(I)V

    goto :goto_0

    :cond_0
    if-gez p1, :cond_1

    .line 2
    invoke-direct {p0, p1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->a0(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method private j0(Landroid/view/View;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->getStickyY()I

    move-result v0

    sub-int/2addr v0, p2

    int-to-float p2, v0

    invoke-virtual {p1, p2}, Landroid/view/View;->setY(F)V

    const/4 p2, 0x1

    .line 2
    invoke-virtual {p1, p2}, Landroid/view/View;->setClickable(Z)V

    return-void
.end method

.method private k()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->D:Landroid/widget/EdgeEffect;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 3
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->E:Landroid/widget/EdgeEffect;

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->onRelease()V

    :cond_0
    return-void
.end method

.method private l()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getOverScrollMode()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->D:Landroid/widget/EdgeEffect;

    if-nez v0, :cond_1

    .line 3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 4
    new-instance v1, Landroid/widget/EdgeEffect;

    invoke-direct {v1, v0}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->D:Landroid/widget/EdgeEffect;

    .line 5
    new-instance v1, Landroid/widget/EdgeEffect;

    invoke-direct {v1, v0}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->E:Landroid/widget/EdgeEffect;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->D:Landroid/widget/EdgeEffect;

    .line 7
    iput-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->E:Landroid/widget/EdgeEffect;

    :cond_1
    :goto_0
    return-void
.end method

.method private o(I)V
    .locals 13

    .line 1
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget v1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->i:I

    if-le v0, v1, :cond_3

    int-to-float v0, p1

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, v1, v0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->dispatchNestedPreFling(FF)Z

    move-result v2

    if-nez v2, :cond_3

    const/4 v2, 0x1

    if-gez p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->K()Z

    move-result v3

    if-eqz v3, :cond_1

    :cond_0
    if-lez p1, :cond_2

    invoke-virtual {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->J()Z

    move-result v3

    if-nez v3, :cond_2

    :cond_1
    const/4 v3, 0x1

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    .line 4
    :goto_0
    invoke-virtual {p0, v1, v0, v3}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->dispatchNestedFling(FFZ)Z

    .line 5
    iget-object v4, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->d:Landroid/widget/OverScroller;

    const/4 v5, 0x0

    iget v6, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->b:I

    const/4 v7, 0x1

    const/high16 v9, -0x80000000

    const/high16 v10, -0x80000000

    const/high16 v11, -0x80000000

    const v12, 0x7fffffff

    move v8, p1

    invoke-virtual/range {v4 .. v12}, Landroid/widget/OverScroller;->fling(IIIIIIII)V

    const/4 p1, 0x2

    .line 6
    invoke-virtual {p0, p1, v2}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->startNestedScroll(II)Z

    .line 7
    invoke-virtual {p0, p1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->setScrollState(I)V

    .line 8
    iget p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->b:I

    iput p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->F:I

    .line 9
    invoke-virtual {p0}, Landroid/view/ViewGroup;->invalidate()V

    :cond_3
    return-void
.end method

.method private s(Landroid/view/View;)I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->I:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-ne p1, v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->getAdjustHeight()I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private t(Landroid/view/View;III)I
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$LayoutParams;

    .line 2
    sget-object v1, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$d;->a:[I

    iget-object v2, v0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$LayoutParams;->g:Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$LayoutParams$Align;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    .line 3
    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr p3, p1

    return p3

    .line 4
    :cond_0
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v1, p3

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    sub-int/2addr p2, p1

    sub-int/2addr p2, p3

    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    sub-int/2addr p2, p1

    sub-int/2addr p2, p4

    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int/2addr p2, p1

    div-int/2addr p2, v2

    add-int/2addr v1, p2

    return v1

    .line 5
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    sub-int/2addr p2, p1

    sub-int/2addr p2, p4

    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int/2addr p2, p1

    return p2
.end method

.method private u(Landroid/view/View;)I
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$LayoutParams;

    .line 3
    iget v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v0, v1

    .line 4
    iget p1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v0, p1

    return v0
.end method

.method private w(Ljava/util/List;I)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;I)I"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v0, p2, :cond_1

    .line 1
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    .line 2
    invoke-virtual {p0, v2}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->L(Landroid/view/View;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 3
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    add-int/2addr v1, v2

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method private x(II)Landroid/view/View;
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->getNonGoneChildren()Ljava/util/List;

    move-result-object v0

    .line 2
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    .line 3
    invoke-static {v1, p1, p2}, Lcom/donkingliang/consecutivescroller/c;->w(Landroid/view/View;II)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method private y(I)I
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge p1, v0, :cond_1

    .line 2
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 3
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v3

    const/16 v4, 0x8

    if-eq v3, v4, :cond_0

    invoke-static {v2}, Lcom/donkingliang/consecutivescroller/c;->t(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 4
    invoke-static {v2}, Lcom/donkingliang/consecutivescroller/c;->f(Landroid/view/View;)I

    move-result v2

    add-int/2addr v1, v2

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method private z()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->f:Landroid/view/VelocityTracker;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->f:Landroid/view/VelocityTracker;

    :cond_0
    return-void
.end method


# virtual methods
.method public D()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->I:Z

    return v0
.end method

.method public E()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->H:Z

    return v0
.end method

.method public I()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->G:Z

    return v0
.end method

.method public J()Z
    .locals 7

    .line 1
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->getEffectiveChildren()Ljava/util/List;

    move-result-object v0

    .line 2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-lez v1, :cond_3

    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    sub-int/2addr v3, v2

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    .line 4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v4

    iget v5, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->c:I

    const/4 v6, 0x0

    if-lt v4, v5, :cond_0

    invoke-static {v3, v2}, Lcom/donkingliang/consecutivescroller/c;->d(Landroid/view/View;I)Z

    move-result v3

    if-nez v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_2

    sub-int/2addr v1, v2

    :goto_1
    if-ltz v1, :cond_2

    .line 5
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    .line 6
    invoke-static {v4}, Lcom/donkingliang/consecutivescroller/c;->t(Landroid/view/View;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 7
    invoke-static {v4, v2}, Lcom/donkingliang/consecutivescroller/c;->d(Landroid/view/View;I)Z

    move-result v4

    if-eqz v4, :cond_1

    return v6

    :cond_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    :cond_2
    return v3

    :cond_3
    return v2
.end method

.method public K()Z
    .locals 7

    .line 1
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->getEffectiveChildren()Ljava/util/List;

    move-result-object v0

    .line 2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-lez v1, :cond_3

    const/4 v3, 0x0

    .line 3
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    .line 4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v5

    const/4 v6, -0x1

    if-gtz v5, :cond_0

    invoke-static {v4, v6}, Lcom/donkingliang/consecutivescroller/c;->d(Landroid/view/View;I)Z

    move-result v4

    if-nez v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_2

    sub-int/2addr v1, v2

    :goto_1
    if-ltz v1, :cond_2

    .line 5
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    .line 6
    invoke-static {v2}, Lcom/donkingliang/consecutivescroller/c;->t(Landroid/view/View;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 7
    invoke-static {v2, v6}, Lcom/donkingliang/consecutivescroller/c;->d(Landroid/view/View;I)Z

    move-result v2

    if-eqz v2, :cond_1

    return v3

    :cond_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    :cond_2
    return v4

    :cond_3
    return v2
.end method

.method public L(Landroid/view/View;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    .line 2
    instance-of v0, p1, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$LayoutParams;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$LayoutParams;

    iget-boolean p1, p1, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$LayoutParams;->e:Z

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public M(Landroid/view/View;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    .line 2
    instance-of v0, p1, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$LayoutParams;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$LayoutParams;

    iget-boolean p1, p1, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$LayoutParams;->c:Z

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method Y(Landroid/view/View;)V
    .locals 2

    :cond_0
    const/4 v0, 0x0

    .line 1
    invoke-static {p1}, Lcom/donkingliang/consecutivescroller/c;->l(Landroid/view/View;)I

    move-result v1

    if-lez v1, :cond_1

    .line 2
    invoke-static {p1}, Lcom/donkingliang/consecutivescroller/c;->f(Landroid/view/View;)I

    move-result v0

    .line 3
    invoke-direct {p0, p1, v1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->X(Landroid/view/View;I)V

    .line 4
    invoke-static {p1}, Lcom/donkingliang/consecutivescroller/c;->f(Landroid/view/View;)I

    move-result v1

    sub-int/2addr v0, v1

    :cond_1
    if-nez v0, :cond_0

    return-void
.end method

.method Z(Landroid/view/View;)V
    .locals 2

    :cond_0
    const/4 v0, 0x0

    .line 1
    invoke-static {p1}, Lcom/donkingliang/consecutivescroller/c;->o(Landroid/view/View;)I

    move-result v1

    if-gez v1, :cond_1

    .line 2
    invoke-static {p1}, Lcom/donkingliang/consecutivescroller/c;->f(Landroid/view/View;)I

    move-result v0

    .line 3
    invoke-direct {p0, p1, v1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->X(Landroid/view/View;I)V

    .line 4
    invoke-static {p1}, Lcom/donkingliang/consecutivescroller/c;->f(Landroid/view/View;)I

    move-result v1

    sub-int/2addr v0, v1

    :cond_1
    if-nez v0, :cond_0

    return-void
.end method

.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 3

    .line 1
    instance-of v0, p3, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$LayoutParams;

    if-eqz v0, :cond_0

    .line 2
    move-object v0, p3

    check-cast v0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$LayoutParams;

    invoke-static {v0}, Lcom/donkingliang/consecutivescroller/b;->a(Landroid/view/ViewGroup$MarginLayoutParams;)V

    .line 3
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 4
    invoke-static {p1}, Lcom/donkingliang/consecutivescroller/c;->t(Landroid/view/View;)Z

    move-result p2

    const/4 p3, 0x0

    if-eqz p2, :cond_1

    .line 5
    invoke-static {p1}, Lcom/donkingliang/consecutivescroller/c;->m(Landroid/view/View;)Landroid/view/View;

    move-result-object p2

    .line 6
    invoke-direct {p0, p2}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->i(Landroid/view/View;)V

    .line 7
    instance-of v0, p2, Lcom/donkingliang/consecutivescroller/a;

    if-eqz v0, :cond_1

    .line 8
    check-cast p2, Lcom/donkingliang/consecutivescroller/a;

    invoke-interface {p2}, Lcom/donkingliang/consecutivescroller/a;->getScrolledViews()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 9
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 10
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 11
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-direct {p0, v2}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->i(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 12
    :cond_1
    instance-of p2, p1, Landroid/view/ViewGroup;

    if-eqz p2, :cond_2

    .line 13
    check-cast p1, Landroid/view/ViewGroup;

    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    :cond_2
    return-void
.end method

.method public c()V
    .locals 3

    .line 1
    new-instance v0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$c;

    invoke-direct {v0, p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$c;-><init>(Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;)V

    const-wide/16 v1, 0x14

    invoke-virtual {p0, v0, v1, v2}, Landroid/view/ViewGroup;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public c0(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->d0(Landroid/view/View;I)V

    return-void
.end method

.method public canScrollVertically(I)Z
    .locals 0

    if-lez p1, :cond_0

    .line 1
    invoke-virtual {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->J()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1

    .line 2
    :cond_0
    invoke-virtual {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->K()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public computeHorizontalScrollExtent()I
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->computeHorizontalScrollExtent()I

    move-result v0

    return v0
.end method

.method public computeHorizontalScrollOffset()I
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->computeHorizontalScrollOffset()I

    move-result v0

    return v0
.end method

.method public computeHorizontalScrollRange()I
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->computeHorizontalScrollRange()I

    move-result v0

    return v0
.end method

.method public computeScroll()V
    .locals 12

    .line 1
    iget v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->z:I

    const/4 v1, 0x1

    const/4 v2, -0x1

    if-eq v0, v2, :cond_2

    iget v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->A:I

    if-eqz v0, :cond_2

    if-lez v0, :cond_0

    const/16 v2, 0xc8

    if-ge v0, v2, :cond_0

    add-int/lit8 v0, v0, 0x5

    .line 2
    iput v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->A:I

    .line 3
    :cond_0
    iget v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->A:I

    if-gez v0, :cond_1

    const/16 v2, -0xc8

    if-le v0, v2, :cond_1

    add-int/lit8 v0, v0, -0x5

    .line 4
    iput v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->A:I

    .line 5
    :cond_1
    iget v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->A:I

    invoke-direct {p0, v0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->j(I)V

    .line 6
    iget v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->C:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->C:I

    .line 7
    invoke-virtual {p0}, Landroid/view/ViewGroup;->invalidate()V

    goto/16 :goto_3

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->d:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_d

    .line 9
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->d:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v0

    .line 10
    iget v3, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->F:I

    sub-int v3, v0, v3

    .line 11
    iput v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->F:I

    .line 12
    iget-object v7, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->w:[I

    aput v2, v7, v1

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    move-object v4, p0

    move v6, v3

    .line 13
    invoke-virtual/range {v4 .. v9}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->dispatchNestedPreScroll(II[I[II)Z

    .line 14
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->w:[I

    aget v0, v0, v1

    sub-int/2addr v3, v0

    .line 15
    iget v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->b:I

    .line 16
    invoke-direct {p0, v3}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->j(I)V

    .line 17
    iget v4, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->b:I

    sub-int v7, v4, v0

    sub-int/2addr v3, v7

    if-gez v3, :cond_3

    .line 18
    invoke-virtual {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->K()Z

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    if-lez v3, :cond_5

    invoke-virtual {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->J()Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    const/4 v6, 0x0

    const/4 v8, 0x0

    .line 19
    iget-object v10, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->v:[I

    const/4 v11, 0x1

    move-object v5, p0

    move v9, v3

    invoke-virtual/range {v5 .. v11}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->dispatchNestedScroll(IIII[II)Z

    .line 20
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->v:[I

    aget v0, v0, v1

    add-int/2addr v3, v0

    :cond_5
    if-gez v3, :cond_6

    .line 21
    invoke-virtual {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->K()Z

    move-result v0

    if-nez v0, :cond_7

    :cond_6
    if-lez v3, :cond_c

    invoke-virtual {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->J()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 22
    :cond_7
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getOverScrollMode()I

    move-result v0

    if-eqz v0, :cond_9

    if-ne v0, v1, :cond_8

    .line 23
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->getScrollRange()I

    move-result v0

    if-lez v0, :cond_8

    goto :goto_0

    :cond_8
    const/4 v0, 0x0

    goto :goto_1

    :cond_9
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_b

    .line 24
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->l()V

    if-gez v3, :cond_a

    .line 25
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->D:Landroid/widget/EdgeEffect;

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 26
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->D:Landroid/widget/EdgeEffect;

    iget-object v3, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->d:Landroid/widget/OverScroller;

    invoke-virtual {v3}, Landroid/widget/OverScroller;->getCurrVelocity()F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {v0, v3}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    goto :goto_2

    .line 27
    :cond_a
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->E:Landroid/widget/EdgeEffect;

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 28
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->E:Landroid/widget/EdgeEffect;

    iget-object v3, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->d:Landroid/widget/OverScroller;

    invoke-virtual {v3}, Landroid/widget/OverScroller;->getCurrVelocity()F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {v0, v3}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 29
    :cond_b
    :goto_2
    invoke-virtual {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->k0()V

    .line 30
    :cond_c
    invoke-virtual {p0}, Landroid/view/ViewGroup;->invalidate()V

    .line 31
    :cond_d
    iget v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->T:I

    const/4 v3, 0x2

    if-ne v0, v3, :cond_e

    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->d:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v0

    if-eqz v0, :cond_e

    .line 32
    invoke-virtual {p0, v1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->stopNestedScroll(I)V

    .line 33
    invoke-direct {p0, v2, v2}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->e(ZZ)V

    .line 34
    invoke-virtual {p0, v2}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->setScrollState(I)V

    :cond_e
    :goto_3
    return-void
.end method

.method public computeVerticalScrollExtent()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public computeVerticalScrollOffset()I
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v0

    .line 2
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->getNonGoneChildren()Ljava/util/List;

    move-result-object v1

    .line 3
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    .line 4
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    .line 5
    invoke-static {v4}, Lcom/donkingliang/consecutivescroller/c;->t(Landroid/view/View;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 6
    invoke-static {v4}, Lcom/donkingliang/consecutivescroller/c;->f(Landroid/view/View;)I

    move-result v4

    add-int/2addr v0, v4

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public computeVerticalScrollRange()I
    .locals 7

    .line 1
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->getNonGoneChildren()Ljava/util/List;

    move-result-object v0

    .line 2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    .line 3
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    .line 4
    invoke-static {v4}, Lcom/donkingliang/consecutivescroller/c;->t(Landroid/view/View;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 5
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    move-result v4

    :goto_1
    add-int/2addr v3, v4

    goto :goto_2

    .line 6
    :cond_0
    invoke-static {v4}, Lcom/donkingliang/consecutivescroller/c;->c(Landroid/view/View;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 7
    invoke-static {v4}, Lcom/donkingliang/consecutivescroller/c;->p(Landroid/view/View;)Landroid/view/View;

    move-result-object v4

    .line 8
    invoke-static {v4}, Lcom/donkingliang/consecutivescroller/c;->g(Landroid/view/View;)I

    move-result v5

    invoke-virtual {v4}, Landroid/view/View;->getPaddingTop()I

    move-result v6

    add-int/2addr v5, v6

    invoke-virtual {v4}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    add-int/2addr v5, v4

    add-int/2addr v3, v5

    goto :goto_2

    .line 9
    :cond_1
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    move-result v4

    goto :goto_1

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return v3
.end method

.method public d0(Landroid/view/View;I)V
    .locals 7

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_7

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v2

    sub-int/2addr v2, p2

    .line 3
    invoke-direct {p0, p1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->s(Landroid/view/View;)I

    move-result v3

    sub-int/2addr v2, v3

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ltz p2, :cond_2

    .line 4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v5

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v6

    add-int/2addr v5, v6

    if-le v5, v2, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v5

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v6

    add-int/2addr v5, v6

    if-ge v5, v2, :cond_1

    goto :goto_1

    .line 6
    :cond_1
    invoke-static {p1, v1}, Lcom/donkingliang/consecutivescroller/c;->d(Landroid/view/View;I)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_0

    .line 7
    :cond_2
    invoke-direct {p0, v0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->y(I)I

    move-result p1

    .line 8
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v5

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v6

    add-int/2addr v5, v6

    add-int/2addr v5, p1

    if-le v5, v2, :cond_3

    :goto_0
    const/4 v3, -0x1

    goto :goto_2

    .line 9
    :cond_3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v5

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v6

    add-int/2addr v5, v6

    add-int/2addr v5, p1

    if-ge v5, v2, :cond_4

    :goto_1
    const/4 v3, 0x1

    :cond_4
    :goto_2
    if-eqz v3, :cond_7

    .line 10
    iput v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->z:I

    .line 11
    invoke-virtual {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->k0()V

    .line 12
    iput p2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->B:I

    const/4 p1, 0x2

    .line 13
    invoke-virtual {p0, p1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->setScrollState(I)V

    :cond_5
    if-gez v3, :cond_6

    const/16 p1, -0xc8

    .line 14
    invoke-direct {p0, p1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->j(I)V

    goto :goto_3

    :cond_6
    const/16 p1, 0xc8

    .line 15
    invoke-direct {p0, p1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->j(I)V

    .line 16
    :goto_3
    iget p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->C:I

    add-int/2addr p1, v4

    iput p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->C:I

    .line 17
    iget p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->z:I

    if-ne p1, v1, :cond_5

    :cond_7
    return-void
.end method

.method public dispatchNestedFling(FFZ)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->u:Landroidx/core/view/NestedScrollingChildHelper;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/core/view/NestedScrollingChildHelper;->dispatchNestedFling(FFZ)Z

    move-result p1

    return p1
.end method

.method public dispatchNestedPreFling(FF)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->u:Landroidx/core/view/NestedScrollingChildHelper;

    invoke-virtual {v0, p1, p2}, Landroidx/core/view/NestedScrollingChildHelper;->dispatchNestedPreFling(FF)Z

    move-result p1

    return p1
.end method

.method public dispatchNestedPreScroll(II[I[I)Z
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 1
    invoke-virtual/range {v0 .. v5}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->dispatchNestedPreScroll(II[I[II)Z

    move-result p1

    return p1
.end method

.method public dispatchNestedPreScroll(II[I[II)Z
    .locals 6
    .param p3    # [I
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # [I
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->u:Landroidx/core/view/NestedScrollingChildHelper;

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Landroidx/core/view/NestedScrollingChildHelper;->dispatchNestedPreScroll(II[I[II)Z

    move-result p1

    return p1
.end method

.method public dispatchNestedScroll(IIII[I)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->u:Landroidx/core/view/NestedScrollingChildHelper;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Landroidx/core/view/NestedScrollingChildHelper;->dispatchNestedScroll(IIII[I)Z

    move-result p1

    return p1
.end method

.method public dispatchNestedScroll(IIII[II)Z
    .locals 7
    .param p5    # [I
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->u:Landroidx/core/view/NestedScrollingChildHelper;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Landroidx/core/view/NestedScrollingChildHelper;->dispatchNestedScroll(IIII[II)Z

    move-result p1

    return p1
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 12

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    .line 2
    iget v1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->q:I

    const/4 v2, 0x0

    const/4 v3, -0x1

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-ne v1, v4, :cond_2

    .line 3
    iget v1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->s:I

    if-eq v1, v3, :cond_2

    iget-object v6, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->n:Ljava/util/HashMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 4
    iget v1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->s:I

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v1

    if-ltz v1, :cond_1

    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v6

    if-lt v1, v6, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    iget-object v6, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->n:Ljava/util/HashMap;

    iget v7, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->s:I

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Float;

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v6

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    sub-float/2addr v6, v1

    invoke-virtual {p1, v2, v6}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    goto :goto_1

    :cond_1
    :goto_0
    return v5

    .line 7
    :cond_2
    :goto_1
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v1

    .line 8
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v6

    if-nez v6, :cond_3

    .line 9
    iput v5, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->Q:I

    .line 10
    :cond_3
    iget v6, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->Q:I

    int-to-float v6, v6

    invoke-virtual {v1, v2, v6}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 11
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v6

    const/4 v7, 0x3

    const/4 v8, 0x1

    if-eqz v6, :cond_14

    if-eq v6, v8, :cond_10

    if-eq v6, v4, :cond_8

    if-eq v6, v7, :cond_10

    const/4 v2, 0x5

    if-eq v6, v2, :cond_7

    const/4 v2, 0x6

    if-eq v6, v2, :cond_4

    goto/16 :goto_6

    .line 12
    :cond_4
    iget-object v2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->n:Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    iget v2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->s:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v4

    if-ne v2, v4, :cond_6

    if-nez v0, :cond_5

    const/4 v0, 0x1

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    .line 14
    :goto_2
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v2

    iput v2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->s:I

    .line 15
    iget-object v4, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->n:Ljava/util/HashMap;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-virtual {v4, v2, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v2

    float-to-int v2, v2

    iput v2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->m:I

    .line 17
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v2

    float-to-int v2, v2

    iput v2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->l:I

    .line 18
    iget-object v2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->o:[I

    invoke-static {p0, p1, v0}, Lcom/donkingliang/consecutivescroller/c;->j(Landroid/view/View;Landroid/view/MotionEvent;I)I

    move-result v4

    aput v4, v2, v5

    .line 19
    iget-object v2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->o:[I

    invoke-static {p0, p1, v0}, Lcom/donkingliang/consecutivescroller/c;->k(Landroid/view/View;Landroid/view/MotionEvent;I)I

    move-result v0

    aput v0, v2, v8

    .line 20
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->o:[I

    aget v2, v0, v5

    aget v0, v0, v8

    invoke-static {p0, v2, v0}, Lcom/donkingliang/consecutivescroller/c;->v(Landroid/view/View;II)Z

    move-result v0

    iput-boolean v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->U:Z

    .line 21
    :cond_6
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->z()V

    .line 22
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->f:Landroid/view/VelocityTracker;

    invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    goto/16 :goto_6

    .line 23
    :cond_7
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v2

    iput v2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->s:I

    .line 24
    iget-object v4, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->n:Ljava/util/HashMap;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-virtual {v4, v2, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v2

    float-to-int v2, v2

    iput v2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->m:I

    .line 26
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v2

    float-to-int v2, v2

    iput v2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->l:I

    .line 27
    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    .line 28
    iget-object v2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->o:[I

    invoke-static {p0, p1, v0}, Lcom/donkingliang/consecutivescroller/c;->j(Landroid/view/View;Landroid/view/MotionEvent;I)I

    move-result v4

    aput v4, v2, v5

    .line 29
    iget-object v2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->o:[I

    invoke-static {p0, p1, v0}, Lcom/donkingliang/consecutivescroller/c;->k(Landroid/view/View;Landroid/view/MotionEvent;I)I

    move-result v0

    aput v0, v2, v8

    .line 30
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->o:[I

    aget v2, v0, v5

    aget v0, v0, v8

    invoke-static {p0, v2, v0}, Lcom/donkingliang/consecutivescroller/c;->v(Landroid/view/View;II)Z

    move-result v0

    iput-boolean v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->U:Z

    .line 31
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->z()V

    .line 32
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->f:Landroid/view/VelocityTracker;

    invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    goto/16 :goto_6

    .line 33
    :cond_8
    iget v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->s:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-ltz v0, :cond_f

    .line 34
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v6

    if-lt v0, v6, :cond_9

    goto/16 :goto_4

    .line 35
    :cond_9
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->z()V

    .line 36
    iget-object v6, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->f:Landroid/view/VelocityTracker;

    invoke-virtual {v6, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 37
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v6

    float-to-int v6, v6

    iget v9, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->m:I

    sub-int/2addr v6, v9

    .line 38
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v9

    float-to-int v9, v9

    iget v10, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->l:I

    sub-int/2addr v9, v10

    .line 39
    iget v10, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->q:I

    if-nez v10, :cond_e

    .line 40
    invoke-direct {p0, p1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->G(Landroid/view/MotionEvent;)Z

    move-result v10

    if-nez v10, :cond_a

    iget-object v10, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->o:[I

    aget v11, v10, v5

    aget v10, v10, v8

    invoke-direct {p0, v11, v10}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->F(II)Z

    move-result v10

    if-eqz v10, :cond_e

    .line 41
    :cond_a
    iget-boolean v10, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->H:Z

    if-eqz v10, :cond_b

    .line 42
    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v2

    iget v4, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->j:I

    if-lt v2, v4, :cond_d

    .line 43
    iput v8, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->q:I

    goto :goto_3

    .line 44
    :cond_b
    invoke-static {v9}, Ljava/lang/Math;->abs(I)I

    move-result v10

    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v11

    if-le v10, v11, :cond_c

    .line 45
    invoke-static {v9}, Ljava/lang/Math;->abs(I)I

    move-result v6

    iget v9, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->j:I

    if-lt v6, v9, :cond_d

    .line 46
    iput v4, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->q:I

    .line 47
    iget v4, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->s:I

    if-eq v4, v3, :cond_d

    iget-object v6, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->n:Ljava/util/HashMap;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_d

    .line 48
    iget v4, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->s:I

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v4

    if-ltz v4, :cond_d

    .line 49
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v6

    if-ge v0, v6, :cond_d

    .line 50
    iget-object v6, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->n:Ljava/util/HashMap;

    iget v9, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->s:I

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Float;

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v6

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getY(I)F

    move-result v4

    sub-float/2addr v6, v4

    invoke-virtual {p1, v2, v6}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    goto :goto_3

    .line 51
    :cond_c
    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v2

    iget v4, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->j:I

    if-lt v2, v4, :cond_d

    .line 52
    iput v8, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->q:I

    .line 53
    :cond_d
    :goto_3
    iget v2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->q:I

    if-nez v2, :cond_e

    return v8

    .line 54
    :cond_e
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v2

    float-to-int v2, v2

    iput v2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->m:I

    .line 55
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->l:I

    goto/16 :goto_6

    :cond_f
    :goto_4
    return v5

    .line 56
    :cond_10
    iget-object v2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->f:Landroid/view/VelocityTracker;

    if-eqz v2, :cond_13

    .line 57
    invoke-virtual {v2, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 58
    iget-object v2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->f:Landroid/view/VelocityTracker;

    const/16 v4, 0x3e8

    iget v6, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->h:I

    int-to-float v6, v6

    invoke-virtual {v2, v4, v6}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 59
    iget-object v2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->f:Landroid/view/VelocityTracker;

    invoke-virtual {v2}, Landroid/view/VelocityTracker;->getYVelocity()F

    move-result v2

    float-to-int v2, v2

    .line 60
    iget v4, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->h:I

    neg-int v6, v4

    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    invoke-static {v6, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    iput v4, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->g:I

    .line 61
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->R()V

    .line 62
    invoke-static {p0, p1, v0}, Lcom/donkingliang/consecutivescroller/c;->j(Landroid/view/View;Landroid/view/MotionEvent;I)I

    move-result v4

    .line 63
    invoke-static {p0, p1, v0}, Lcom/donkingliang/consecutivescroller/c;->k(Landroid/view/View;Landroid/view/MotionEvent;I)I

    move-result v0

    .line 64
    invoke-direct {p0, v4, v0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->x(II)Landroid/view/View;

    move-result-object v6

    .line 65
    invoke-static {v6}, Lcom/donkingliang/consecutivescroller/c;->c(Landroid/view/View;)Z

    move-result v6

    .line 66
    invoke-static {p0, v4, v0}, Lcom/donkingliang/consecutivescroller/c;->u(Landroid/view/View;II)Z

    move-result v0

    .line 67
    iget v4, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->q:I

    if-eq v4, v8, :cond_11

    if-eqz v6, :cond_11

    .line 68
    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v4

    iget v6, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->i:I

    if-lt v4, v6, :cond_11

    if-nez v0, :cond_11

    .line 69
    invoke-virtual {p1, v7}, Landroid/view/MotionEvent;->setAction(I)V

    .line 70
    :cond_11
    iget v4, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->q:I

    if-eq v4, v8, :cond_13

    invoke-static {p0}, Lcom/donkingliang/consecutivescroller/c;->s(Landroid/view/View;)Z

    move-result v4

    if-nez v4, :cond_13

    .line 71
    invoke-direct {p0, p1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->G(Landroid/view/MotionEvent;)Z

    move-result v4

    if-eqz v4, :cond_13

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    iget v4, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->i:I

    if-lt v2, v4, :cond_13

    .line 72
    iget v2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->q:I

    if-eqz v2, :cond_12

    if-nez v0, :cond_13

    .line 73
    :cond_12
    iget v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->g:I

    neg-int v0, v0

    invoke-direct {p0, v0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->o(I)V

    .line 74
    :cond_13
    iput v5, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->m:I

    .line 75
    iput v5, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->l:I

    .line 76
    iput-boolean v5, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->p:Z

    .line 77
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->o:[I

    aput v5, v0, v5

    .line 78
    aput v5, v0, v8

    .line 79
    iput-boolean v5, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->U:Z

    goto :goto_6

    .line 80
    :cond_14
    iget v2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->T:I

    if-ne v2, v4, :cond_15

    const/4 v2, 0x1

    goto :goto_5

    :cond_15
    const/4 v2, 0x0

    :goto_5
    iput-boolean v2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->V:Z

    .line 81
    invoke-virtual {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->k0()V

    .line 82
    invoke-direct {p0, v5, v5}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->e(ZZ)V

    .line 83
    iput-boolean v8, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->p:Z

    .line 84
    iput v5, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->q:I

    .line 85
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v2

    iput v2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->s:I

    .line 86
    iget-object v6, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->n:Ljava/util/HashMap;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v9

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    invoke-virtual {v6, v2, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v2

    float-to-int v2, v2

    iput v2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->m:I

    .line 88
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v2

    float-to-int v2, v2

    iput v2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->l:I

    .line 89
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->A()V

    .line 90
    iget-object v2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->f:Landroid/view/VelocityTracker;

    invoke-virtual {v2, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 91
    invoke-virtual {p0, v4, v5}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->startNestedScroll(II)Z

    .line 92
    iget-object v2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->o:[I

    invoke-static {p0, p1, v0}, Lcom/donkingliang/consecutivescroller/c;->j(Landroid/view/View;Landroid/view/MotionEvent;I)I

    move-result v4

    aput v4, v2, v5

    .line 93
    iget-object v2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->o:[I

    invoke-static {p0, p1, v0}, Lcom/donkingliang/consecutivescroller/c;->k(Landroid/view/View;Landroid/view/MotionEvent;I)I

    move-result v0

    aput v0, v2, v8

    .line 94
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->o:[I

    aget v2, v0, v5

    aget v0, v0, v8

    invoke-static {p0, v2, v0}, Lcom/donkingliang/consecutivescroller/c;->v(Landroid/view/View;II)Z

    move-result v0

    iput-boolean v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->U:Z

    .line 95
    :goto_6
    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    .line 96
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    .line 97
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p1

    if-eq p1, v8, :cond_16

    if-eq p1, v7, :cond_16

    goto :goto_7

    .line 98
    :cond_16
    iput v5, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->q:I

    .line 99
    iput v5, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->g:I

    .line 100
    iget-object p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->n:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    .line 101
    iput v3, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->s:I

    .line 102
    iget-object p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->d:Landroid/widget/OverScroller;

    invoke-virtual {p1}, Landroid/widget/OverScroller;->isFinished()Z

    move-result p1

    if-eqz p1, :cond_17

    .line 103
    invoke-virtual {p0, v5}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->setScrollState(I)V

    :cond_17
    :goto_7
    return v0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 9

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->draw(Landroid/graphics/Canvas;)V

    .line 2
    iget v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->O:I

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v0

    iput v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->O:I

    .line 4
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->V()V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->D:Landroid/widget/EdgeEffect;

    if-eqz v0, :cond_a

    .line 6
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v0

    .line 7
    iget-object v1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->D:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x15

    if-nez v1, :cond_5

    .line 8
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v1

    .line 9
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v4

    .line 10
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v5

    .line 11
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v6, v3, :cond_2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getClipToPadding()Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_0

    :cond_1
    const/4 v7, 0x0

    goto :goto_1

    .line 12
    :cond_2
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v7

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v8

    add-int/2addr v7, v8

    sub-int/2addr v4, v7

    .line 13
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v7

    add-int/2addr v7, v2

    :goto_1
    if-lt v6, v3, :cond_3

    .line 14
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getClipToPadding()Z

    move-result v6

    if-eqz v6, :cond_3

    .line 15
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v6

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v8

    add-int/2addr v6, v8

    sub-int/2addr v5, v6

    .line 16
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v6

    add-int/2addr v6, v0

    goto :goto_2

    :cond_3
    move v6, v0

    :goto_2
    int-to-float v7, v7

    int-to-float v6, v6

    .line 17
    invoke-virtual {p1, v7, v6}, Landroid/graphics/Canvas;->translate(FF)V

    .line 18
    iget-object v6, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->D:Landroid/widget/EdgeEffect;

    invoke-virtual {v6, v4, v5}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 19
    iget-object v4, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->D:Landroid/widget/EdgeEffect;

    invoke-virtual {v4, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 20
    invoke-static {p0}, Landroidx/core/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    .line 21
    :cond_4
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 22
    :cond_5
    iget-object v1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->E:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    if-nez v1, :cond_a

    .line 23
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v1

    .line 24
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v4

    .line 25
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v5

    add-int/2addr v0, v5

    .line 26
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v6, v3, :cond_6

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getClipToPadding()Z

    move-result v7

    if-eqz v7, :cond_7

    .line 27
    :cond_6
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v7

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v8

    add-int/2addr v7, v8

    sub-int/2addr v4, v7

    .line 28
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v7

    add-int/2addr v2, v7

    :cond_7
    if-lt v6, v3, :cond_8

    .line 29
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getClipToPadding()Z

    move-result v3

    if-eqz v3, :cond_8

    .line 30
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v6

    add-int/2addr v3, v6

    sub-int/2addr v5, v3

    .line 31
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v0, v3

    :cond_8
    sub-int/2addr v2, v4

    int-to-float v2, v2

    int-to-float v0, v0

    .line 32
    invoke-virtual {p1, v2, v0}, Landroid/graphics/Canvas;->translate(FF)V

    const/high16 v0, 0x43340000    # 180.0f

    int-to-float v2, v4

    const/4 v3, 0x0

    .line 33
    invoke-virtual {p1, v0, v2, v3}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 34
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->E:Landroid/widget/EdgeEffect;

    invoke-virtual {v0, v4, v5}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 35
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->E:Landroid/widget/EdgeEffect;

    invoke-virtual {v0, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 36
    invoke-static {p0}, Landroidx/core/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    .line 37
    :cond_9
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_a
    return-void
.end method

.method public f0(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->g0(Landroid/view/View;I)V

    return-void
.end method

.method public g0(Landroid/view/View;I)V
    .locals 7

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_6

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v2

    sub-int/2addr v2, p2

    .line 3
    invoke-direct {p0, p1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->s(Landroid/view/View;)I

    move-result v3

    sub-int/2addr v2, v3

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ltz p2, :cond_2

    .line 4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v5

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v6

    add-int/2addr v5, v6

    if-le v5, v2, :cond_0

    goto :goto_1

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v5

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v6

    add-int/2addr v5, v6

    if-ge v5, v2, :cond_1

    goto :goto_0

    .line 6
    :cond_1
    invoke-static {p1, v1}, Lcom/donkingliang/consecutivescroller/c;->d(Landroid/view/View;I)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_1

    .line 7
    :cond_2
    invoke-direct {p0, v0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->y(I)I

    move-result p1

    .line 8
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v5

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v6

    add-int/2addr v5, v6

    add-int/2addr v5, p1

    if-le v5, v2, :cond_3

    goto :goto_1

    .line 9
    :cond_3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v5

    add-int/2addr v1, v5

    add-int/2addr v1, p1

    if-ge v1, v2, :cond_4

    :goto_0
    const/4 v1, 0x1

    goto :goto_1

    :cond_4
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_6

    .line 10
    iput v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->z:I

    .line 11
    invoke-virtual {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->k0()V

    .line 12
    iput p2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->B:I

    const/4 p1, 0x2

    .line 13
    invoke-virtual {p0, p1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->setScrollState(I)V

    if-gez v1, :cond_5

    const/16 p1, -0x32

    .line 14
    iput p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->A:I

    goto :goto_2

    :cond_5
    const/16 p1, 0x32

    .line 15
    iput p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->A:I

    .line 16
    :goto_2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->invalidate()V

    :cond_6
    return-void
.end method

.method protected bridge synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->p()Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$LayoutParams;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->q(Landroid/util/AttributeSet;)Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$LayoutParams;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->r(Landroid/view/ViewGroup$LayoutParams;)Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$LayoutParams;

    move-result-object p1

    return-object p1
.end method

.method public getAdjustHeightOffset()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->J:I

    return v0
.end method

.method protected getChildDrawingOrder(II)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->P:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, p2, :cond_0

    .line 2
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->P:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    .line 3
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->getChildDrawingOrder(II)I

    move-result p1

    return p1
.end method

.method public getCurrentStickyView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->L:Landroid/view/View;

    return-object v0
.end method

.method public getCurrentStickyViews()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->M:Ljava/util/List;

    return-object v0
.end method

.method public getNestedScrollAxes()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->t:Landroidx/core/view/NestedScrollingParentHelper;

    invoke-virtual {v0}, Landroidx/core/view/NestedScrollingParentHelper;->getNestedScrollAxes()I

    move-result v0

    return v0
.end method

.method public getOnPermanentStickyChangeListener()Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->S:Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$e;

    return-object v0
.end method

.method public getOnStickyChangeListener()Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$g;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->R:Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$g;

    return-object v0
.end method

.method public getOnVerticalScrollChangeListener()Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$f;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->r:Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$f;

    return-object v0
.end method

.method public getOwnScrollY()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->computeVerticalScrollOffset()I

    move-result v0

    return v0
.end method

.method public getScrollState()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->T:I

    return v0
.end method

.method public getStickyOffset()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->K:I

    return v0
.end method

.method public hasNestedScrollingParent(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->u:Landroidx/core/view/NestedScrollingChildHelper;

    invoke-virtual {v0, p1}, Landroidx/core/view/NestedScrollingChildHelper;->hasNestedScrollingParent(I)Z

    move-result p1

    return p1
.end method

.method public isNestedScrollingEnabled()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->u:Landroidx/core/view/NestedScrollingChildHelper;

    invoke-virtual {v0}, Landroidx/core/view/NestedScrollingChildHelper;->isNestedScrollingEnabled()Z

    move-result v0

    return v0
.end method

.method public k0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->d:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->d:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    const/4 v0, 0x1

    .line 3
    invoke-virtual {p0, v0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->stopNestedScroll(I)V

    .line 4
    iget v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->z:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->setScrollState(I)V

    :cond_0
    return-void
.end method

.method public l0(Landroid/view/View;)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->G:Z

    if-nez v0, :cond_0

    iget-object v1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->L:Landroid/view/View;

    if-eq v1, p1, :cond_1

    :cond_0
    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->M:Ljava/util/List;

    .line 2
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public m()Landroid/view/View;
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v1

    add-int/2addr v0, v1

    .line 2
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->getEffectiveChildren()Ljava/util/List;

    move-result-object v1

    .line 3
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    .line 4
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    .line 5
    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    move-result v5

    if-gt v5, v0, :cond_0

    invoke-virtual {v4}, Landroid/view/View;->getBottom()I

    move-result v5

    if-le v5, v0, :cond_0

    return-object v4

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method protected measureChildWithMargins(Landroid/view/View;IIII)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$LayoutParams;

    invoke-static {v0}, Lcom/donkingliang/consecutivescroller/b;->a(Landroid/view/ViewGroup$MarginLayoutParams;)V

    .line 2
    invoke-super/range {p0 .. p5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    return-void
.end method

.method public n()Landroid/view/View;
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v1

    add-int/2addr v0, v1

    .line 2
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->getEffectiveChildren()Ljava/util/List;

    move-result-object v1

    .line 3
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    .line 4
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    .line 5
    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    move-result v5

    if-ge v5, v0, :cond_0

    invoke-virtual {v4}, Landroid/view/View;->getBottom()I

    move-result v5

    if-lt v5, v0, :cond_0

    return-object v4

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    if-eqz v0, :cond_3

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_2

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    const/4 v3, 0x3

    if-eq v0, v3, :cond_2

    goto :goto_0

    .line 2
    :cond_0
    iget v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->q:I

    if-eq v0, v3, :cond_4

    .line 3
    invoke-direct {p0, p1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->G(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->o:[I

    aget v1, v0, v1

    aget v0, v0, v2

    invoke-direct {p0, v1, v0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->F(II)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_1
    return v2

    .line 4
    :cond_2
    invoke-virtual {p0, v1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->stopNestedScroll(I)V

    .line 5
    iget-boolean v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->V:Z

    if-eqz v0, :cond_4

    iget v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->q:I

    if-nez v0, :cond_4

    return v2

    .line 6
    :cond_3
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->B()V

    .line 7
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->e:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 8
    :cond_4
    :goto_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method protected onLayout(ZIIII)V
    .locals 8

    const/4 p2, 0x0

    .line 1
    iput p2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->c:I

    .line 2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result p3

    .line 3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result p4

    .line 4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result p5

    .line 5
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result v0

    .line 6
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->getNonGoneChildren()Ljava/util/List;

    move-result-object v1

    .line 7
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    .line 8
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    .line 9
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    add-int/2addr v5, p3

    .line 10
    invoke-direct {p0, v4, v0, p4, p5}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->t(Landroid/view/View;III)I

    move-result v6

    .line 11
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    add-int/2addr v7, v6

    invoke-virtual {v4, v6, p3, v7, v5}, Landroid/view/View;->layout(IIII)V

    .line 12
    iget p3, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->c:I

    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    move-result v4

    add-int/2addr p3, v4

    iput p3, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->c:I

    add-int/lit8 v3, v3, 0x1

    move p3, v5

    goto :goto_0

    .line 13
    :cond_0
    iget p3, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->c:I

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result p4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result p5

    sub-int/2addr p4, p5

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result p5

    sub-int/2addr p4, p5

    sub-int/2addr p3, p4

    iput p3, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->c:I

    if-gez p3, :cond_1

    .line 14
    iput p2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->c:I

    .line 15
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->d(ZZ)V

    .line 16
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->h0()V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 12

    .line 1
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->U()V

    .line 2
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->getNonGoneChildren()Ljava/util/List;

    move-result-object v0

    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 4
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/View;

    .line 5
    invoke-direct {p0, v5}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->s(Landroid/view/View;)I

    move-result v11

    const/4 v9, 0x0

    move-object v6, p0

    move-object v7, v5

    move v8, p1

    move v10, p2

    .line 6
    invoke-virtual/range {v6 .. v11}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 7
    invoke-direct {p0, v5}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->u(Landroid/view/View;)I

    move-result v6

    invoke-static {v3, v6}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 8
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    add-int/2addr v4, v5

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v0

    add-int/2addr v3, v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v0

    add-int/2addr v3, v0

    invoke-direct {p0, p1, v3}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->N(II)I

    move-result p1

    .line 10
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v0

    add-int/2addr v4, v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result v0

    add-int/2addr v4, v0

    invoke-direct {p0, p2, v4}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->N(II)I

    move-result p2

    .line 11
    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V

    return-void
.end method

.method public onNestedFling(Landroid/view/View;FFZ)Z
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    if-nez p4, :cond_0

    const/4 p1, 0x0

    const/4 p2, 0x1

    .line 1
    invoke-virtual {p0, p1, p3, p2}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->dispatchNestedFling(FFZ)Z

    float-to-int p1, p3

    .line 2
    invoke-direct {p0, p1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->o(I)V

    return p2

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public onNestedPreFling(Landroid/view/View;FF)Z
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0, p2, p3}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->dispatchNestedPreFling(FF)Z

    move-result p1

    return p1
.end method

.method public onNestedPreScroll(Landroid/view/View;II[I)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    .line 1
    invoke-virtual/range {v0 .. v5}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->onNestedPreScroll(Landroid/view/View;II[II)V

    return-void
.end method

.method public onNestedPreScroll(Landroid/view/View;II[II)V
    .locals 6
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # [I
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v4, 0x0

    move-object v0, p0

    move v1, p2

    move v2, p3

    move-object v3, p4

    move v5, p5

    .line 2
    invoke-virtual/range {v0 .. v5}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->dispatchNestedPreScroll(II[I[II)Z

    return-void
.end method

.method public onNestedScroll(Landroid/view/View;IIII)V
    .locals 0

    const/4 p1, 0x0

    .line 2
    invoke-direct {p0, p5, p1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->O(II)V

    return-void
.end method

.method public onNestedScroll(Landroid/view/View;IIIII)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p5, p6}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->O(II)V

    return-void
.end method

.method public onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V
    .locals 1

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;II)V

    return-void
.end method

.method public onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;II)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->t:Landroidx/core/view/NestedScrollingParentHelper;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/core/view/NestedScrollingParentHelper;->onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;II)V

    const/4 p1, 0x0

    .line 2
    invoke-direct {p0, p1, p1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->e(ZZ)V

    const/4 p1, 0x2

    .line 3
    invoke-virtual {p0, p1, p4}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->startNestedScroll(II)Z

    return-void
.end method

.method public onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z
    .locals 1

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->onStartNestedScroll(Landroid/view/View;Landroid/view/View;II)Z

    move-result p1

    return p1
.end method

.method public onStartNestedScroll(Landroid/view/View;Landroid/view/View;II)Z
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    .line 2
    instance-of p2, p1, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$LayoutParams;

    const/4 p4, 0x0

    if-eqz p2, :cond_0

    .line 3
    check-cast p1, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$LayoutParams;

    iget-boolean p1, p1, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$LayoutParams;->b:Z

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    and-int/lit8 p1, p3, 0x2

    if-eqz p1, :cond_1

    const/4 p4, 0x1

    :cond_1
    return p4
.end method

.method public onStopNestedScroll(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, p1, v0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->onStopNestedScroll(Landroid/view/View;I)V

    return-void
.end method

.method public onStopNestedScroll(Landroid/view/View;I)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->t:Landroidx/core/view/NestedScrollingParentHelper;

    invoke-virtual {v0, p1, p2}, Landroidx/core/view/NestedScrollingParentHelper;->onStopNestedScroll(Landroid/view/View;I)V

    .line 2
    invoke-virtual {p0, p2}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->stopNestedScroll(I)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 16

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    .line 1
    invoke-static/range {p0 .. p0}, Lcom/donkingliang/consecutivescroller/c;->s(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_18

    iget-boolean v0, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->U:Z

    if-eqz v0, :cond_0

    goto/16 :goto_4

    .line 2
    :cond_0
    invoke-static/range {p1 .. p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v9

    .line 3
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v10, 0x0

    if-nez v0, :cond_1

    .line 4
    iput v10, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->Q:I

    .line 5
    :cond_1
    iget v0, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->Q:I

    int-to-float v0, v0

    const/4 v11, 0x0

    invoke-virtual {v9, v11, v0}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 6
    iget v0, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->s:I

    invoke-virtual {v8, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v12

    if-ltz v12, :cond_17

    .line 7
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    if-lt v12, v0, :cond_2

    goto/16 :goto_3

    .line 8
    :cond_2
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x2

    const/4 v13, 0x1

    if-eqz v0, :cond_13

    if-eq v0, v13, :cond_11

    if-eq v0, v1, :cond_4

    const/4 v1, 0x3

    if-eq v0, v1, :cond_3

    const/4 v1, 0x5

    if-eq v0, v1, :cond_14

    const/4 v1, 0x6

    if-eq v0, v1, :cond_14

    goto/16 :goto_2

    .line 9
    :cond_3
    invoke-direct/range {p0 .. p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->k()V

    .line 10
    iput v10, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->k:I

    .line 11
    invoke-direct/range {p0 .. p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->S()V

    .line 12
    invoke-virtual {v7, v10}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->setScrollState(I)V

    goto/16 :goto_2

    .line 13
    :cond_4
    iget v0, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->k:I

    if-nez v0, :cond_5

    .line 14
    invoke-virtual {v8, v12}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->k:I

    return v13

    .line 15
    :cond_5
    iget-object v0, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->w:[I

    aput v10, v0, v13

    .line 16
    invoke-virtual {v8, v12}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    float-to-int v0, v0

    .line 17
    iget v1, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->k:I

    sub-int v6, v1, v0

    .line 18
    iput v0, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->k:I

    const/4 v1, 0x0

    .line 19
    iget-object v3, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->w:[I

    iget-object v4, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->v:[I

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move v2, v6

    invoke-virtual/range {v0 .. v5}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->dispatchNestedPreScroll(II[I[II)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 20
    iget-object v0, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->w:[I

    aget v0, v0, v13

    sub-int/2addr v6, v0

    .line 21
    iget-object v0, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->v:[I

    aget v0, v0, v13

    int-to-float v0, v0

    invoke-virtual {v8, v11, v0}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 22
    iget v0, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->Q:I

    iget-object v1, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->v:[I

    aget v2, v1, v13

    add-int/2addr v0, v2

    iput v0, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->Q:I

    .line 23
    iget v0, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->k:I

    aget v1, v1, v13

    sub-int/2addr v0, v1

    iput v0, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->k:I

    .line 24
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0, v13}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 25
    :cond_6
    iget v14, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->b:I

    .line 26
    iget v0, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->T:I

    if-eq v0, v13, :cond_8

    .line 27
    invoke-direct/range {p0 .. p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->b()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v0

    if-lez v0, :cond_7

    const/4 v0, 0x1

    goto :goto_0

    :cond_7
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_8

    .line 28
    invoke-virtual {v7, v13}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->setScrollState(I)V

    .line 29
    :cond_8
    iget v0, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->T:I

    if-ne v0, v13, :cond_9

    .line 30
    invoke-direct {v7, v6}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->j(I)V

    .line 31
    :cond_9
    iget v0, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->b:I

    sub-int v2, v0, v14

    if-eqz v2, :cond_a

    .line 32
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0, v13}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_a
    sub-int v15, v6, v2

    const/4 v1, 0x0

    const/4 v3, 0x0

    .line 33
    iget-object v5, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->v:[I

    const/4 v6, 0x0

    move-object/from16 v0, p0

    move v4, v15

    invoke-virtual/range {v0 .. v6}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->dispatchNestedScroll(IIII[II)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 34
    iget-object v0, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->v:[I

    aget v1, v0, v13

    add-int/2addr v15, v1

    .line 35
    iget v1, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->k:I

    aget v2, v0, v13

    sub-int/2addr v1, v2

    iput v1, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->k:I

    .line 36
    iget v1, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->Q:I

    aget v2, v0, v13

    add-int/2addr v1, v2

    iput v1, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->Q:I

    .line 37
    aget v0, v0, v13

    int-to-float v0, v0

    invoke-virtual {v8, v11, v0}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 38
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0, v13}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 39
    :cond_b
    invoke-direct/range {p0 .. p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->getScrollRange()I

    move-result v0

    .line 40
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getOverScrollMode()I

    move-result v1

    if-eqz v1, :cond_c

    if-ne v1, v13, :cond_d

    if-lez v0, :cond_d

    :cond_c
    const/4 v10, 0x1

    :cond_d
    if-eqz v10, :cond_15

    .line 41
    invoke-direct/range {p0 .. p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->l()V

    add-int/2addr v14, v15

    if-gez v14, :cond_e

    .line 42
    iget-object v0, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->D:Landroid/widget/EdgeEffect;

    int-to-float v1, v15

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    .line 43
    invoke-virtual {v8, v12}, Landroid/view/MotionEvent;->getX(I)F

    move-result v2

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    .line 44
    invoke-static {v0, v1, v2}, Landroidx/core/widget/EdgeEffectCompat;->onPull(Landroid/widget/EdgeEffect;FF)V

    .line 45
    iget-object v0, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->E:Landroid/widget/EdgeEffect;

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    if-nez v0, :cond_f

    .line 46
    iget-object v0, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->E:Landroid/widget/EdgeEffect;

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->onRelease()V

    goto :goto_1

    :cond_e
    if-le v14, v0, :cond_f

    .line 47
    iget-object v0, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->E:Landroid/widget/EdgeEffect;

    int-to-float v1, v15

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    const/high16 v2, 0x3f800000    # 1.0f

    .line 48
    invoke-virtual {v8, v12}, Landroid/view/MotionEvent;->getX(I)F

    move-result v3

    .line 49
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v3, v4

    sub-float/2addr v2, v3

    .line 50
    invoke-static {v0, v1, v2}, Landroidx/core/widget/EdgeEffectCompat;->onPull(Landroid/widget/EdgeEffect;FF)V

    .line 51
    iget-object v0, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->D:Landroid/widget/EdgeEffect;

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    if-nez v0, :cond_f

    .line 52
    iget-object v0, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->D:Landroid/widget/EdgeEffect;

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 53
    :cond_f
    :goto_1
    iget-object v0, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->D:Landroid/widget/EdgeEffect;

    if-eqz v0, :cond_15

    .line 54
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    if-eqz v0, :cond_10

    iget-object v0, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->E:Landroid/widget/EdgeEffect;

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    if-nez v0, :cond_15

    .line 55
    :cond_10
    invoke-static/range {p0 .. p0}, Landroidx/core/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    goto :goto_2

    .line 56
    :cond_11
    invoke-direct/range {p0 .. p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->k()V

    .line 57
    iput v10, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->k:I

    .line 58
    iget-object v0, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->e:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_15

    .line 59
    invoke-virtual {v0, v9}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 60
    iget-object v0, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->e:Landroid/view/VelocityTracker;

    const/16 v1, 0x3e8

    iget v2, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->h:I

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 61
    iget-object v0, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->e:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->getYVelocity()F

    move-result v0

    float-to-int v0, v0

    .line 62
    iget v1, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->h:I

    neg-int v2, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-nez v0, :cond_12

    .line 63
    iget v1, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->g:I

    if-eqz v1, :cond_12

    move v0, v1

    :cond_12
    neg-int v0, v0

    .line 64
    invoke-direct {v7, v0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->o(I)V

    .line 65
    invoke-direct/range {p0 .. p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->S()V

    goto :goto_2

    .line 66
    :cond_13
    invoke-virtual {v7, v1, v10}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->startNestedScroll(II)Z

    .line 67
    :cond_14
    invoke-virtual {v8, v12}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->k:I

    .line 68
    :cond_15
    :goto_2
    iget-object v0, v7, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->e:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_16

    .line 69
    invoke-virtual {v0, v9}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 70
    :cond_16
    invoke-virtual {v9}, Landroid/view/MotionEvent;->recycle()V

    return v13

    :cond_17
    :goto_3
    return v10

    .line 71
    :cond_18
    :goto_4
    invoke-super/range {p0 .. p1}, Landroid/view/ViewGroup;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method protected p()Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$LayoutParams;
    .locals 2

    .line 1
    new-instance v0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$LayoutParams;-><init>(II)V

    return-object v0
.end method

.method public q(Landroid/util/AttributeSet;)Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$LayoutParams;
    .locals 2

    .line 1
    new-instance v0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$LayoutParams;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method protected r(Landroid/view/ViewGroup$LayoutParams;)Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$LayoutParams;
    .locals 1

    .line 1
    new-instance v0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$LayoutParams;

    invoke-direct {v0, p1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public requestLayout()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->requestLayout()V

    return-void
.end method

.method public scrollBy(II)V
    .locals 0

    .line 1
    iget p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->b:I

    add-int/2addr p1, p2

    const/4 p2, 0x0

    invoke-virtual {p0, p2, p1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->scrollTo(II)V

    return-void
.end method

.method public scrollTo(II)V
    .locals 0

    .line 1
    iget p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->b:I

    sub-int/2addr p2, p1

    invoke-direct {p0, p2}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->j(I)V

    return-void
.end method

.method public setAdjustHeightOffset(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->J:I

    if-eq v0, p1, :cond_0

    .line 2
    iput p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->J:I

    .line 3
    invoke-virtual {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->requestLayout()V

    :cond_0
    return-void
.end method

.method public setAutoAdjustHeightAtBottomView(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->I:Z

    if-eq v0, p1, :cond_0

    .line 2
    iput-boolean p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->I:Z

    .line 3
    invoke-virtual {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->requestLayout()V

    :cond_0
    return-void
.end method

.method public setDisableChildHorizontalScroll(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->H:Z

    return-void
.end method

.method public setNestedScrollingEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->u:Landroidx/core/view/NestedScrollingChildHelper;

    invoke-virtual {v0, p1}, Landroidx/core/view/NestedScrollingChildHelper;->setNestedScrollingEnabled(Z)V

    return-void
.end method

.method public setOnPermanentStickyChangeListener(Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->S:Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$e;

    return-void
.end method

.method public setOnScrollChangeListener(Landroid/view/View$OnScrollChangeListener;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public setOnStickyChangeListener(Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->R:Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$g;

    return-void
.end method

.method public setOnVerticalScrollChangeListener(Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->r:Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$f;

    return-void
.end method

.method public setPermanent(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->G:Z

    if-eq v0, p1, :cond_1

    .line 2
    iput-boolean p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->G:Z

    .line 3
    iget-boolean p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->I:Z

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->requestLayout()V

    goto :goto_0

    .line 5
    :cond_0
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->V()V

    :cond_1
    :goto_0
    return-void
.end method

.method setScrollState(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->T:I

    if-ne p1, v0, :cond_0

    return-void

    .line 2
    :cond_0
    iput p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->T:I

    .line 3
    invoke-virtual {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->computeVerticalScrollOffset()I

    move-result p1

    .line 4
    invoke-direct {p0, p1, p1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->W(II)V

    return-void
.end method

.method public setStickyOffset(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->K:I

    if-eq v0, p1, :cond_0

    .line 2
    iput p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->K:I

    .line 3
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->V()V

    :cond_0
    return-void
.end method

.method public startNestedScroll(II)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->u:Landroidx/core/view/NestedScrollingChildHelper;

    invoke-virtual {v0, p1, p2}, Landroidx/core/view/NestedScrollingChildHelper;->startNestedScroll(II)Z

    move-result p1

    return p1
.end method

.method public stopNestedScroll()V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->stopNestedScroll(I)V

    return-void
.end method

.method public stopNestedScroll(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->u:Landroidx/core/view/NestedScrollingChildHelper;

    invoke-virtual {v0, p1}, Landroidx/core/view/NestedScrollingChildHelper;->stopNestedScroll(I)V

    return-void
.end method

.method v(Landroid/view/View;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->P:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method
