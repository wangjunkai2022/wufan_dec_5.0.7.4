.class public Lcom/join/mgps/customview/NestedWebView;
.super Landroid/webkit/WebView;
.source "NestedWebView.java"

# interfaces
.implements Landroidx/core/view/NestedScrollingChild3;


# static fields
.field private static final o:Ljava/lang/String; = "NestedWebView"

.field private static final p:I = -0x1


# instance fields
.field private final b:[I

.field private final c:[I

.field private d:I

.field private e:Landroidx/core/view/NestedScrollingChildHelper;

.field private f:Z

.field private g:Landroid/view/VelocityTracker;

.field private h:I

.field private i:I

.field private j:I

.field private k:Landroid/widget/OverScroller;

.field private l:I

.field private m:I

.field private n:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/join/mgps/customview/NestedWebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x1010085

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/join/mgps/customview/NestedWebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x2

    new-array p2, p1, [I

    .line 4
    iput-object p2, p0, Lcom/join/mgps/customview/NestedWebView;->b:[I

    new-array p2, p1, [I

    .line 5
    iput-object p2, p0, Lcom/join/mgps/customview/NestedWebView;->c:[I

    const/4 p2, 0x0

    .line 6
    iput-boolean p2, p0, Lcom/join/mgps/customview/NestedWebView;->f:Z

    const/4 p2, -0x1

    .line 7
    iput p2, p0, Lcom/join/mgps/customview/NestedWebView;->i:I

    .line 8
    invoke-virtual {p0, p1}, Landroid/webkit/WebView;->setOverScrollMode(I)V

    .line 9
    invoke-direct {p0}, Lcom/join/mgps/customview/NestedWebView;->e()V

    .line 10
    new-instance p1, Landroidx/core/view/NestedScrollingChildHelper;

    invoke-direct {p1, p0}, Landroidx/core/view/NestedScrollingChildHelper;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lcom/join/mgps/customview/NestedWebView;->e:Landroidx/core/view/NestedScrollingChildHelper;

    const/4 p1, 0x1

    .line 11
    invoke-virtual {p0, p1}, Lcom/join/mgps/customview/NestedWebView;->setNestedScrollingEnabled(Z)V

    return-void
.end method

.method private a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/NestedWebView;->k:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lcom/join/mgps/customview/NestedWebView;->stopNestedScroll(I)V

    return-void
.end method

.method private b()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/join/mgps/customview/NestedWebView;->f:Z

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/customview/NestedWebView;->i()V

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/customview/NestedWebView;->stopNestedScroll()V

    return-void
.end method

.method private c(I)V
    .locals 12

    .line 1
    invoke-virtual {p0}, Landroid/webkit/WebView;->getHeight()I

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/join/mgps/customview/NestedWebView;->k:Landroid/widget/OverScroller;

    invoke-virtual {p0}, Landroid/webkit/WebView;->getScrollX()I

    move-result v2

    invoke-virtual {p0}, Landroid/webkit/WebView;->getScrollY()I

    move-result v3

    div-int/lit8 v11, v0, 0x2

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/high16 v8, -0x80000000

    const v9, 0x7fffffff

    const/4 v10, 0x0

    move v5, p1

    invoke-virtual/range {v1 .. v11}, Landroid/widget/OverScroller;->fling(IIIIIIIIII)V

    const/4 p1, 0x1

    .line 3
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/NestedWebView;->j(Z)V

    return-void
.end method

.method private d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/NestedWebView;->g:Landroid/view/VelocityTracker;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/customview/NestedWebView;->g:Landroid/view/VelocityTracker;

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    :goto_0
    return-void
.end method

.method private e()V
    .locals 2

    .line 1
    new-instance v0, Landroid/widget/OverScroller;

    invoke-virtual {p0}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/customview/NestedWebView;->k:Landroid/widget/OverScroller;

    .line 2
    invoke-virtual {p0}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v1

    iput v1, p0, Lcom/join/mgps/customview/NestedWebView;->h:I

    .line 4
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result v1

    iput v1, p0, Lcom/join/mgps/customview/NestedWebView;->l:I

    .line 5
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result v0

    iput v0, p0, Lcom/join/mgps/customview/NestedWebView;->m:I

    return-void
.end method

.method private f()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/NestedWebView;->g:Landroid/view/VelocityTracker;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/customview/NestedWebView;->g:Landroid/view/VelocityTracker;

    :cond_0
    return-void
.end method

.method private g(Landroid/view/MotionEvent;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const v1, 0xff00

    and-int/2addr v0, v1

    shr-int/lit8 v0, v0, 0x8

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    .line 3
    iget v2, p0, Lcom/join/mgps/customview/NestedWebView;->i:I

    if-ne v1, v2, :cond_1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 4
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    float-to-int v1, v1

    iput v1, p0, Lcom/join/mgps/customview/NestedWebView;->d:I

    .line 5
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Lcom/join/mgps/customview/NestedWebView;->i:I

    .line 6
    iget-object p1, p0, Lcom/join/mgps/customview/NestedWebView;->g:Landroid/view/VelocityTracker;

    if-eqz p1, :cond_1

    .line 7
    invoke-virtual {p1}, Landroid/view/VelocityTracker;->clear()V

    :cond_1
    return-void
.end method

.method private h(IIIIIIIIZ)Z
    .locals 12

    move-object v0, p0

    .line 1
    invoke-virtual {p0}, Landroid/webkit/WebView;->getOverScrollMode()I

    move-result v1

    .line 2
    invoke-virtual {p0}, Landroid/webkit/WebView;->computeHorizontalScrollRange()I

    move-result v2

    invoke-virtual {p0}, Landroid/webkit/WebView;->computeHorizontalScrollExtent()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-le v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 3
    :goto_0
    invoke-virtual {p0}, Landroid/webkit/WebView;->computeVerticalScrollRange()I

    move-result v3

    invoke-virtual {p0}, Landroid/webkit/WebView;->computeVerticalScrollExtent()I

    move-result v6

    if-le v3, v6, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-eqz v1, :cond_3

    if-ne v1, v5, :cond_2

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v2, 0x1

    :goto_3
    if-eqz v1, :cond_5

    if-ne v1, v5, :cond_4

    if-eqz v3, :cond_4

    goto :goto_4

    :cond_4
    const/4 v1, 0x0

    goto :goto_5

    :cond_5
    :goto_4
    const/4 v1, 0x1

    :goto_5
    add-int v3, p3, p1

    if-nez v2, :cond_6

    const/4 v2, 0x0

    goto :goto_6

    :cond_6
    move/from16 v2, p7

    :goto_6
    add-int v6, p4, p2

    if-nez v1, :cond_7

    const/4 v1, 0x0

    goto :goto_7

    :cond_7
    move/from16 v1, p8

    :goto_7
    neg-int v7, v2

    add-int v2, v2, p5

    neg-int v8, v1

    add-int v1, v1, p6

    if-le v3, v2, :cond_8

    move v3, v2

    :goto_8
    const/4 v2, 0x1

    goto :goto_9

    :cond_8
    if-ge v3, v7, :cond_9

    move v3, v7

    goto :goto_8

    :cond_9
    const/4 v2, 0x0

    :goto_9
    if-le v6, v1, :cond_a

    move v6, v1

    :goto_a
    const/4 v1, 0x1

    goto :goto_b

    :cond_a
    if-ge v6, v8, :cond_b

    move v6, v8

    goto :goto_a

    :cond_b
    const/4 v1, 0x0

    :goto_b
    if-eqz v1, :cond_c

    .line 4
    invoke-virtual {p0, v5}, Lcom/join/mgps/customview/NestedWebView;->hasNestedScrollingParent(I)Z

    move-result v7

    if-nez v7, :cond_c

    .line 5
    iget-object v7, v0, Lcom/join/mgps/customview/NestedWebView;->k:Landroid/widget/OverScroller;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-virtual {p0}, Lcom/join/mgps/customview/NestedWebView;->getScrollRange()I

    move-result v11

    move-object p1, v7

    move p2, v3

    move p3, v6

    move/from16 p4, v8

    move/from16 p5, v9

    move/from16 p6, v10

    move/from16 p7, v11

    invoke-virtual/range {p1 .. p7}, Landroid/widget/OverScroller;->springBack(IIIIII)Z

    .line 6
    :cond_c
    invoke-virtual {p0, v3, v6, v2, v1}, Landroid/webkit/WebView;->onOverScrolled(IIZZ)V

    if-nez v2, :cond_d

    if-eqz v1, :cond_e

    :cond_d
    const/4 v4, 0x1

    :cond_e
    return v4
.end method

.method private i()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/NestedWebView;->g:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/join/mgps/customview/NestedWebView;->g:Landroid/view/VelocityTracker;

    :cond_0
    return-void
.end method

.method private j(Z)V
    .locals 1

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/customview/NestedWebView;->startNestedScroll(II)Z

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0, v0}, Lcom/join/mgps/customview/NestedWebView;->stopNestedScroll(I)V

    .line 3
    :goto_0
    invoke-virtual {p0}, Landroid/webkit/WebView;->getScrollY()I

    move-result p1

    iput p1, p0, Lcom/join/mgps/customview/NestedWebView;->n:I

    .line 4
    invoke-static {p0}, Landroidx/core/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public computeScroll()V
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/NestedWebView;->k:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/customview/NestedWebView;->k:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    .line 3
    iget-object v0, p0, Lcom/join/mgps/customview/NestedWebView;->k:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v0

    .line 4
    iget v1, p0, Lcom/join/mgps/customview/NestedWebView;->n:I

    sub-int v6, v0, v1

    .line 5
    iput v0, p0, Lcom/join/mgps/customview/NestedWebView;->n:I

    .line 6
    iget-object v3, p0, Lcom/join/mgps/customview/NestedWebView;->c:[I

    const/4 v10, 0x1

    const/4 v11, 0x0

    aput v11, v3, v10

    const/4 v1, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    move-object v0, p0

    move v2, v6

    .line 7
    invoke-virtual/range {v0 .. v5}, Lcom/join/mgps/customview/NestedWebView;->dispatchNestedPreScroll(II[I[II)Z

    .line 8
    iget-object v0, p0, Lcom/join/mgps/customview/NestedWebView;->c:[I

    aget v0, v0, v10

    sub-int v12, v6, v0

    if-eqz v12, :cond_1

    .line 9
    invoke-virtual {p0}, Landroid/webkit/WebView;->getScrollY()I

    move-result v13

    const/4 v1, 0x0

    .line 10
    invoke-virtual {p0}, Landroid/webkit/WebView;->getScrollX()I

    move-result v3

    const/4 v5, 0x0

    invoke-virtual {p0}, Lcom/join/mgps/customview/NestedWebView;->getScrollRange()I

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    move v2, v12

    move v4, v13

    invoke-direct/range {v0 .. v9}, Lcom/join/mgps/customview/NestedWebView;->h(IIIIIIIIZ)Z

    .line 11
    invoke-virtual {p0}, Landroid/webkit/WebView;->getScrollY()I

    move-result v0

    sub-int/2addr v0, v13

    sub-int/2addr v12, v0

    .line 12
    iget-object v7, p0, Lcom/join/mgps/customview/NestedWebView;->c:[I

    aput v11, v7, v10

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 13
    iget-object v5, p0, Lcom/join/mgps/customview/NestedWebView;->b:[I

    const/4 v6, 0x1

    move-object v0, p0

    move v4, v12

    invoke-virtual/range {v0 .. v7}, Lcom/join/mgps/customview/NestedWebView;->dispatchNestedScroll(IIII[II[I)V

    .line 14
    iget-object v0, p0, Lcom/join/mgps/customview/NestedWebView;->c:[I

    aget v0, v0, v10

    sub-int/2addr v12, v0

    :cond_1
    if-eqz v12, :cond_2

    .line 15
    invoke-direct {p0}, Lcom/join/mgps/customview/NestedWebView;->a()V

    .line 16
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/customview/NestedWebView;->k:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_3

    .line 17
    invoke-static {p0}, Landroidx/core/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    :cond_3
    return-void
.end method

.method public dispatchNestedFling(FFZ)Z
    .locals 1

    .line 1
    iget-object p3, p0, Lcom/join/mgps/customview/NestedWebView;->e:Landroidx/core/view/NestedScrollingChildHelper;

    const/4 v0, 0x0

    invoke-virtual {p3, p1, p2, v0}, Landroidx/core/view/NestedScrollingChildHelper;->dispatchNestedFling(FFZ)Z

    move-result p1

    return p1
.end method

.method public dispatchNestedPreFling(FF)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/NestedWebView;->e:Landroidx/core/view/NestedScrollingChildHelper;

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
    invoke-virtual/range {v0 .. v5}, Lcom/join/mgps/customview/NestedWebView;->dispatchNestedPreScroll(II[I[II)Z

    move-result p1

    return p1
.end method

.method public dispatchNestedPreScroll(II[I[II)Z
    .locals 6

    .line 2
    iget-object v0, p0, Lcom/join/mgps/customview/NestedWebView;->e:Landroidx/core/view/NestedScrollingChildHelper;

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Landroidx/core/view/NestedScrollingChildHelper;->dispatchNestedPreScroll(II[I[II)Z

    move-result p1

    return p1
.end method

.method public dispatchNestedScroll(IIII[II[I)V
    .locals 8
    .param p5    # [I
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p7    # [I
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 3
    iget-object v0, p0, Lcom/join/mgps/customview/NestedWebView;->e:Landroidx/core/view/NestedScrollingChildHelper;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    move v6, p6

    move-object v7, p7

    invoke-virtual/range {v0 .. v7}, Landroidx/core/view/NestedScrollingChildHelper;->dispatchNestedScroll(IIII[II[I)V

    return-void
.end method

.method public dispatchNestedScroll(IIII[I)Z
    .locals 7

    const/4 v6, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    .line 1
    invoke-virtual/range {v0 .. v6}, Lcom/join/mgps/customview/NestedWebView;->dispatchNestedScroll(IIII[II)Z

    move-result p1

    return p1
.end method

.method public dispatchNestedScroll(IIII[II)Z
    .locals 7

    .line 2
    iget-object v0, p0, Lcom/join/mgps/customview/NestedWebView;->e:Landroidx/core/view/NestedScrollingChildHelper;

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

.method public getNestedScrollAxes()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method getScrollRange()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/webkit/WebView;->computeVerticalScrollRange()I

    move-result v0

    return v0
.end method

.method public hasNestedScrollingParent()Z
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/join/mgps/customview/NestedWebView;->hasNestedScrollingParent(I)Z

    move-result v0

    return v0
.end method

.method public hasNestedScrollingParent(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/NestedWebView;->e:Landroidx/core/view/NestedScrollingChildHelper;

    invoke-virtual {v0, p1}, Landroidx/core/view/NestedScrollingChildHelper;->hasNestedScrollingParent(I)Z

    move-result p1

    return p1
.end method

.method public isNestedScrollingEnabled()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/NestedWebView;->e:Landroidx/core/view/NestedScrollingChildHelper;

    invoke-virtual {v0}, Landroidx/core/view/NestedScrollingChildHelper;->isNestedScrollingEnabled()Z

    move-result v0

    return v0
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 10

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    .line 2
    iget-boolean v3, p0, Lcom/join/mgps/customview/NestedWebView;->f:Z

    if-eqz v3, :cond_0

    return v2

    :cond_0
    and-int/lit16 v0, v0, 0xff

    const/4 v3, 0x0

    if-eqz v0, :cond_7

    const/4 v4, -0x1

    if-eq v0, v2, :cond_5

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_5

    const/4 v1, 0x6

    if-eq v0, v1, :cond_1

    goto/16 :goto_0

    .line 3
    :cond_1
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/NestedWebView;->g(Landroid/view/MotionEvent;)V

    goto/16 :goto_0

    .line 4
    :cond_2
    iget v0, p0, Lcom/join/mgps/customview/NestedWebView;->i:I

    if-ne v0, v4, :cond_3

    goto/16 :goto_0

    .line 5
    :cond_3
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v5

    if-ne v5, v4, :cond_4

    .line 6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid pointerId="

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " in onInterceptTouchEvent"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    .line 7
    :cond_4
    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    float-to-int v0, v0

    .line 8
    iget v4, p0, Lcom/join/mgps/customview/NestedWebView;->d:I

    sub-int v4, v0, v4

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v4

    .line 9
    iget v5, p0, Lcom/join/mgps/customview/NestedWebView;->h:I

    if-le v4, v5, :cond_8

    .line 10
    invoke-virtual {p0}, Lcom/join/mgps/customview/NestedWebView;->getNestedScrollAxes()I

    move-result v4

    and-int/2addr v1, v4

    if-nez v1, :cond_8

    .line 11
    iput-boolean v2, p0, Lcom/join/mgps/customview/NestedWebView;->f:Z

    .line 12
    iput v0, p0, Lcom/join/mgps/customview/NestedWebView;->d:I

    .line 13
    invoke-direct {p0}, Lcom/join/mgps/customview/NestedWebView;->f()V

    .line 14
    iget-object v0, p0, Lcom/join/mgps/customview/NestedWebView;->g:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 15
    iput v3, p0, Lcom/join/mgps/customview/NestedWebView;->j:I

    .line 16
    invoke-virtual {p0}, Landroid/webkit/WebView;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-eqz p1, :cond_8

    .line 17
    invoke-interface {p1, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    goto :goto_0

    .line 18
    :cond_5
    iput-boolean v3, p0, Lcom/join/mgps/customview/NestedWebView;->f:Z

    .line 19
    iput v4, p0, Lcom/join/mgps/customview/NestedWebView;->i:I

    .line 20
    invoke-direct {p0}, Lcom/join/mgps/customview/NestedWebView;->i()V

    .line 21
    iget-object v3, p0, Lcom/join/mgps/customview/NestedWebView;->k:Landroid/widget/OverScroller;

    invoke-virtual {p0}, Landroid/webkit/WebView;->getScrollX()I

    move-result v4

    invoke-virtual {p0}, Landroid/webkit/WebView;->getScrollY()I

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual {p0}, Lcom/join/mgps/customview/NestedWebView;->getScrollRange()I

    move-result v9

    invoke-virtual/range {v3 .. v9}, Landroid/widget/OverScroller;->springBack(IIIIII)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 22
    invoke-static {p0}, Landroidx/core/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    .line 23
    :cond_6
    invoke-virtual {p0}, Lcom/join/mgps/customview/NestedWebView;->stopNestedScroll()V

    goto :goto_0

    .line 24
    :cond_7
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/join/mgps/customview/NestedWebView;->d:I

    .line 25
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/customview/NestedWebView;->i:I

    .line 26
    invoke-direct {p0}, Lcom/join/mgps/customview/NestedWebView;->d()V

    .line 27
    iget-object v0, p0, Lcom/join/mgps/customview/NestedWebView;->g:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 28
    iget-object p1, p0, Lcom/join/mgps/customview/NestedWebView;->k:Landroid/widget/OverScroller;

    invoke-virtual {p1}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    .line 29
    iget-object p1, p0, Lcom/join/mgps/customview/NestedWebView;->k:Landroid/widget/OverScroller;

    invoke-virtual {p1}, Landroid/widget/OverScroller;->isFinished()Z

    move-result p1

    xor-int/2addr p1, v2

    iput-boolean p1, p0, Lcom/join/mgps/customview/NestedWebView;->f:Z

    .line 30
    invoke-virtual {p0, v1}, Lcom/join/mgps/customview/NestedWebView;->startNestedScroll(I)Z

    .line 31
    :cond_8
    :goto_0
    iget-boolean p1, p0, Lcom/join/mgps/customview/NestedWebView;->f:Z

    return p1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 22
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    move-object/from16 v10, p0

    move-object/from16 v11, p1

    .line 1
    invoke-direct/range {p0 .. p0}, Lcom/join/mgps/customview/NestedWebView;->f()V

    .line 2
    invoke-static/range {p1 .. p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v12

    .line 3
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v13, 0x0

    if-nez v0, :cond_0

    .line 4
    iput v13, v10, Lcom/join/mgps/customview/NestedWebView;->j:I

    .line 5
    :cond_0
    iget v1, v10, Lcom/join/mgps/customview/NestedWebView;->j:I

    int-to-float v1, v1

    const/4 v2, 0x0

    invoke-virtual {v12, v2, v1}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    const/4 v1, 0x2

    const/4 v14, 0x1

    if-eqz v0, :cond_f

    const/4 v3, -0x1

    if-eq v0, v14, :cond_c

    if-eq v0, v1, :cond_5

    const/4 v1, 0x3

    if-eq v0, v1, :cond_3

    const/4 v1, 0x5

    if-eq v0, v1, :cond_2

    const/4 v1, 0x6

    if-eq v0, v1, :cond_1

    goto/16 :goto_2

    .line 6
    :cond_1
    invoke-direct/range {p0 .. p1}, Lcom/join/mgps/customview/NestedWebView;->g(Landroid/view/MotionEvent;)V

    .line 7
    iget v0, v10, Lcom/join/mgps/customview/NestedWebView;->i:I

    invoke-virtual {v11, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    invoke-virtual {v11, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, v10, Lcom/join/mgps/customview/NestedWebView;->d:I

    goto/16 :goto_2

    .line 8
    :cond_2
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    .line 9
    invoke-virtual {v11, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    float-to-int v1, v1

    iput v1, v10, Lcom/join/mgps/customview/NestedWebView;->d:I

    .line 10
    invoke-virtual {v11, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, v10, Lcom/join/mgps/customview/NestedWebView;->i:I

    goto/16 :goto_2

    .line 11
    :cond_3
    iget-boolean v0, v10, Lcom/join/mgps/customview/NestedWebView;->f:Z

    if-eqz v0, :cond_4

    .line 12
    iget-object v13, v10, Lcom/join/mgps/customview/NestedWebView;->k:Landroid/widget/OverScroller;

    invoke-virtual/range {p0 .. p0}, Landroid/webkit/WebView;->getScrollX()I

    move-result v14

    invoke-virtual/range {p0 .. p0}, Landroid/webkit/WebView;->getScrollY()I

    move-result v15

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    .line 13
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/customview/NestedWebView;->getScrollRange()I

    move-result v19

    .line 14
    invoke-virtual/range {v13 .. v19}, Landroid/widget/OverScroller;->springBack(IIIIII)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 15
    invoke-static/range {p0 .. p0}, Landroidx/core/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    .line 16
    :cond_4
    iput v3, v10, Lcom/join/mgps/customview/NestedWebView;->i:I

    .line 17
    invoke-direct/range {p0 .. p0}, Lcom/join/mgps/customview/NestedWebView;->b()V

    goto/16 :goto_2

    .line 18
    :cond_5
    iget v0, v10, Lcom/join/mgps/customview/NestedWebView;->i:I

    invoke-virtual {v11, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-ne v0, v3, :cond_6

    .line 19
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid pointerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, v10, Lcom/join/mgps/customview/NestedWebView;->i:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " in onTouchEvent"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_2

    .line 20
    :cond_6
    invoke-virtual {v11, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    float-to-int v6, v0

    .line 21
    iget v0, v10, Lcom/join/mgps/customview/NestedWebView;->d:I

    sub-int v7, v0, v6

    const/4 v1, 0x0

    .line 22
    iget-object v3, v10, Lcom/join/mgps/customview/NestedWebView;->c:[I

    iget-object v4, v10, Lcom/join/mgps/customview/NestedWebView;->b:[I

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move v2, v7

    invoke-virtual/range {v0 .. v5}, Lcom/join/mgps/customview/NestedWebView;->dispatchNestedPreScroll(II[I[II)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 23
    iget-object v0, v10, Lcom/join/mgps/customview/NestedWebView;->c:[I

    aget v0, v0, v14

    sub-int/2addr v7, v0

    .line 24
    iget v0, v10, Lcom/join/mgps/customview/NestedWebView;->j:I

    iget-object v1, v10, Lcom/join/mgps/customview/NestedWebView;->b:[I

    aget v1, v1, v14

    add-int/2addr v0, v1

    iput v0, v10, Lcom/join/mgps/customview/NestedWebView;->j:I

    .line 25
    :cond_7
    iget-boolean v0, v10, Lcom/join/mgps/customview/NestedWebView;->f:Z

    if-nez v0, :cond_a

    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget v1, v10, Lcom/join/mgps/customview/NestedWebView;->h:I

    if-le v0, v1, :cond_a

    .line 26
    invoke-virtual/range {p0 .. p0}, Landroid/webkit/WebView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 27
    invoke-interface {v0, v14}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 28
    :cond_8
    iput-boolean v14, v10, Lcom/join/mgps/customview/NestedWebView;->f:Z

    if-lez v7, :cond_9

    .line 29
    iget v0, v10, Lcom/join/mgps/customview/NestedWebView;->h:I

    sub-int/2addr v7, v0

    goto :goto_0

    .line 30
    :cond_9
    iget v0, v10, Lcom/join/mgps/customview/NestedWebView;->h:I

    add-int/2addr v7, v0

    :cond_a
    :goto_0
    move v15, v7

    .line 31
    iget-boolean v0, v10, Lcom/join/mgps/customview/NestedWebView;->f:Z

    if-eqz v0, :cond_12

    .line 32
    iget-object v0, v10, Lcom/join/mgps/customview/NestedWebView;->b:[I

    aget v0, v0, v14

    sub-int/2addr v6, v0

    iput v6, v10, Lcom/join/mgps/customview/NestedWebView;->d:I

    .line 33
    invoke-virtual/range {p0 .. p0}, Landroid/webkit/WebView;->getScrollY()I

    move-result v16

    .line 34
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/customview/NestedWebView;->getScrollRange()I

    move-result v6

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    move-object/from16 v0, p0

    move v2, v15

    move/from16 v4, v16

    .line 35
    invoke-direct/range {v0 .. v9}, Lcom/join/mgps/customview/NestedWebView;->h(IIIIIIIIZ)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 36
    invoke-virtual {v10, v13}, Lcom/join/mgps/customview/NestedWebView;->hasNestedScrollingParent(I)Z

    move-result v0

    if-nez v0, :cond_b

    .line 37
    iget-object v0, v10, Lcom/join/mgps/customview/NestedWebView;->g:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    .line 38
    :cond_b
    invoke-virtual/range {p0 .. p0}, Landroid/webkit/WebView;->getScrollY()I

    move-result v0

    sub-int v2, v0, v16

    sub-int v4, v15, v2

    .line 39
    iget-object v7, v10, Lcom/join/mgps/customview/NestedWebView;->c:[I

    aput v13, v7, v14

    const/4 v1, 0x0

    const/4 v3, 0x0

    .line 40
    iget-object v5, v10, Lcom/join/mgps/customview/NestedWebView;->b:[I

    const/4 v6, 0x0

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v7}, Lcom/join/mgps/customview/NestedWebView;->dispatchNestedScroll(IIII[II[I)V

    .line 41
    iget v0, v10, Lcom/join/mgps/customview/NestedWebView;->d:I

    iget-object v1, v10, Lcom/join/mgps/customview/NestedWebView;->b:[I

    aget v2, v1, v14

    sub-int/2addr v0, v2

    iput v0, v10, Lcom/join/mgps/customview/NestedWebView;->d:I

    .line 42
    iget v0, v10, Lcom/join/mgps/customview/NestedWebView;->j:I

    aget v1, v1, v14

    add-int/2addr v0, v1

    iput v0, v10, Lcom/join/mgps/customview/NestedWebView;->j:I

    goto/16 :goto_2

    .line 43
    :cond_c
    iget-object v0, v10, Lcom/join/mgps/customview/NestedWebView;->g:Landroid/view/VelocityTracker;

    const/16 v1, 0x3e8

    .line 44
    iget v4, v10, Lcom/join/mgps/customview/NestedWebView;->m:I

    int-to-float v4, v4

    invoke-virtual {v0, v1, v4}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 45
    iget v1, v10, Lcom/join/mgps/customview/NestedWebView;->i:I

    invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    move-result v0

    float-to-int v0, v0

    .line 46
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v1

    iget v4, v10, Lcom/join/mgps/customview/NestedWebView;->l:I

    if-le v1, v4, :cond_d

    neg-int v0, v0

    int-to-float v1, v0

    .line 47
    invoke-virtual {v10, v2, v1}, Lcom/join/mgps/customview/NestedWebView;->dispatchNestedPreFling(FF)Z

    move-result v4

    if-nez v4, :cond_e

    .line 48
    invoke-virtual {v10, v2, v1, v14}, Lcom/join/mgps/customview/NestedWebView;->dispatchNestedFling(FFZ)Z

    .line 49
    invoke-direct {v10, v0}, Lcom/join/mgps/customview/NestedWebView;->c(I)V

    goto :goto_1

    .line 50
    :cond_d
    iget-object v15, v10, Lcom/join/mgps/customview/NestedWebView;->k:Landroid/widget/OverScroller;

    invoke-virtual/range {p0 .. p0}, Landroid/webkit/WebView;->getScrollX()I

    move-result v16

    invoke-virtual/range {p0 .. p0}, Landroid/webkit/WebView;->getScrollY()I

    move-result v17

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    .line 51
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/customview/NestedWebView;->getScrollRange()I

    move-result v21

    .line 52
    invoke-virtual/range {v15 .. v21}, Landroid/widget/OverScroller;->springBack(IIIIII)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 53
    invoke-static/range {p0 .. p0}, Landroidx/core/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    .line 54
    :cond_e
    :goto_1
    iput v3, v10, Lcom/join/mgps/customview/NestedWebView;->i:I

    .line 55
    invoke-direct/range {p0 .. p0}, Lcom/join/mgps/customview/NestedWebView;->b()V

    goto :goto_2

    .line 56
    :cond_f
    iget-object v0, v10, Lcom/join/mgps/customview/NestedWebView;->k:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v0

    xor-int/2addr v0, v14

    iput-boolean v0, v10, Lcom/join/mgps/customview/NestedWebView;->f:Z

    if-eqz v0, :cond_10

    .line 57
    invoke-virtual/range {p0 .. p0}, Landroid/webkit/WebView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_10

    .line 58
    invoke-interface {v0, v14}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 59
    :cond_10
    iget-object v0, v10, Lcom/join/mgps/customview/NestedWebView;->k:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_11

    .line 60
    invoke-direct/range {p0 .. p0}, Lcom/join/mgps/customview/NestedWebView;->a()V

    .line 61
    :cond_11
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v0, v0

    iput v0, v10, Lcom/join/mgps/customview/NestedWebView;->d:I

    .line 62
    invoke-virtual {v11, v13}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, v10, Lcom/join/mgps/customview/NestedWebView;->i:I

    .line 63
    invoke-virtual {v10, v1, v13}, Lcom/join/mgps/customview/NestedWebView;->startNestedScroll(II)Z

    .line 64
    :cond_12
    :goto_2
    iget-object v0, v10, Lcom/join/mgps/customview/NestedWebView;->g:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_13

    .line 65
    invoke-virtual {v0, v12}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 66
    :cond_13
    invoke-virtual {v12}, Landroid/view/MotionEvent;->recycle()V

    .line 67
    invoke-super/range {p0 .. p1}, Landroid/webkit/WebView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method protected overScrollBy(IIIIIIIIZ)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/customview/NestedWebView;->f:Z

    if-nez v0, :cond_0

    .line 2
    invoke-direct/range {p0 .. p9}, Lcom/join/mgps/customview/NestedWebView;->h(IIIIIIIIZ)Z

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public requestDisallowInterceptTouchEvent(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/customview/NestedWebView;->i()V

    .line 2
    :cond_0
    invoke-super {p0, p1}, Landroid/webkit/WebView;->requestDisallowInterceptTouchEvent(Z)V

    return-void
.end method

.method public setNestedScrollingEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/NestedWebView;->e:Landroidx/core/view/NestedScrollingChildHelper;

    invoke-virtual {v0, p1}, Landroidx/core/view/NestedScrollingChildHelper;->setNestedScrollingEnabled(Z)V

    return-void
.end method

.method public startNestedScroll(I)Z
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/customview/NestedWebView;->startNestedScroll(II)Z

    move-result p1

    return p1
.end method

.method public startNestedScroll(II)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/NestedWebView;->e:Landroidx/core/view/NestedScrollingChildHelper;

    invoke-virtual {v0, p1, p2}, Landroidx/core/view/NestedScrollingChildHelper;->startNestedScroll(II)Z

    move-result p1

    return p1
.end method

.method public stopNestedScroll()V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/join/mgps/customview/NestedWebView;->stopNestedScroll(I)V

    return-void
.end method

.method public stopNestedScroll(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/NestedWebView;->e:Landroidx/core/view/NestedScrollingChildHelper;

    invoke-virtual {v0, p1}, Landroidx/core/view/NestedScrollingChildHelper;->stopNestedScroll(I)V

    return-void
.end method
