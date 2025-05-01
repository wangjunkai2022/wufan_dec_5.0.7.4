.class public Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;
.super Landroid/widget/LinearLayout;
.source "ScrollableLayout.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$OnScrollListener;,
        Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$DIRECTION;
    }
.end annotation


# instance fields
.field private childViewPager:Landroidx/viewpager/widget/ViewPager;

.field private isClickHead:Z

.field private isClickHeadExpand:Z

.field private mCurY:I

.field private mDirection:Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$DIRECTION;

.field private mDisallowIntercept:Z

.field private mDownX:F

.field private mDownY:F

.field private mExpandHeight:I

.field private mHeadHeight:I

.field private mHeadView:Landroid/view/View;

.field private mHelper:Lcom/cpoopc/scrollablelayoutlib/ScrollableHelper;

.field private mLastScrollerY:I

.field private mLastY:F

.field private mMaximumVelocity:I

.field private mMinimumVelocity:I

.field private mScroller:Landroid/widget/Scroller;

.field private mTouchSlop:I

.field private mVelocityTracker:Landroid/view/VelocityTracker;

.field private maxY:I

.field private minY:I

.field private needCheckUpdown:Z

.field private onScrollListener:Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$OnScrollListener;

.field private final tag:Ljava/lang/String;

.field private updown:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const-string v0, "cp:scrollableLayout"

    .line 2
    iput-object v0, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->tag:Ljava/lang/String;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->minY:I

    .line 4
    iput v0, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->maxY:I

    .line 5
    invoke-direct {p0, p1}, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->init(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 6
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const-string p2, "cp:scrollableLayout"

    .line 7
    iput-object p2, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->tag:Ljava/lang/String;

    const/4 p2, 0x0

    .line 8
    iput p2, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->minY:I

    .line 9
    iput p2, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->maxY:I

    .line 10
    invoke-direct {p0, p1}, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->init(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .line 11
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const-string p2, "cp:scrollableLayout"

    .line 12
    iput-object p2, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->tag:Ljava/lang/String;

    const/4 p2, 0x0

    .line 13
    iput p2, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->minY:I

    .line 14
    iput p2, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->maxY:I

    .line 15
    invoke-direct {p0, p1}, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->init(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 16
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const-string p2, "cp:scrollableLayout"

    .line 17
    iput-object p2, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->tag:Ljava/lang/String;

    const/4 p2, 0x0

    .line 18
    iput p2, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->minY:I

    .line 19
    iput p2, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->maxY:I

    .line 20
    invoke-direct {p0, p1}, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->init(Landroid/content/Context;)V

    return-void
.end method

.method private calcDuration(II)I
    .locals 0

    sub-int/2addr p1, p2

    return p1
.end method

.method private checkIsClickHead(III)V
    .locals 0

    add-int/2addr p1, p3

    if-gt p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 1
    :goto_0
    iput-boolean p1, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->isClickHead:Z

    return-void
.end method

.method private checkIsClickHeadExpand(III)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mExpandHeight:I

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    .line 2
    iput-boolean v1, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->isClickHeadExpand:Z

    :cond_0
    add-int/2addr p1, p3

    add-int/2addr p2, v0

    if-gt p1, p2, :cond_1

    const/4 v1, 0x1

    .line 3
    :cond_1
    iput-boolean v1, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->isClickHeadExpand:Z

    return-void
.end method

.method private getScrollerVelocity(II)I
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mScroller:Landroid/widget/Scroller;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xe

    if-lt v1, v2, :cond_1

    .line 3
    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrVelocity()F

    move-result p1

    float-to-int p1, p1

    return p1

    .line 4
    :cond_1
    div-int/2addr p1, p2

    return p1
.end method

.method private init(Landroid/content/Context;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableHelper;

    invoke-direct {v0}, Lcom/cpoopc/scrollablelayoutlib/ScrollableHelper;-><init>()V

    iput-object v0, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mHelper:Lcom/cpoopc/scrollablelayoutlib/ScrollableHelper;

    .line 2
    new-instance v0, Landroid/widget/Scroller;

    invoke-direct {v0, p1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mScroller:Landroid/widget/Scroller;

    .line 3
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    .line 4
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    iput v0, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mTouchSlop:I

    .line 5
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result v0

    iput v0, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mMinimumVelocity:I

    .line 6
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result p1

    iput p1, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mMaximumVelocity:I

    return-void
.end method

.method private initOrResetVelocityTracker()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mVelocityTracker:Landroid/view/VelocityTracker;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mVelocityTracker:Landroid/view/VelocityTracker;

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    :goto_0
    return-void
.end method

.method private initVelocityTrackerIfNotExists()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mVelocityTracker:Landroid/view/VelocityTracker;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mVelocityTracker:Landroid/view/VelocityTracker;

    :cond_0
    return-void
.end method

.method private recycleVelocityTracker()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mVelocityTracker:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mVelocityTracker:Landroid/view/VelocityTracker;

    :cond_0
    return-void
.end method


# virtual methods
.method public canPtr()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->updown:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mCurY:I

    iget v1, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->minY:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mHelper:Lcom/cpoopc/scrollablelayoutlib/ScrollableHelper;

    invoke-virtual {v0}, Lcom/cpoopc/scrollablelayoutlib/ScrollableHelper;->isTop()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public computeScroll()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mScroller:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2
    iget-object v0, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mScroller:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrY()I

    move-result v0

    .line 3
    iget-object v1, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mDirection:Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$DIRECTION;

    sget-object v2, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$DIRECTION;->UP:Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$DIRECTION;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v1, v2, :cond_1

    .line 4
    invoke-virtual {p0}, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->isSticked()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 5
    iget-object v1, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mScroller:Landroid/widget/Scroller;

    invoke-virtual {v1}, Landroid/widget/Scroller;->getFinalY()I

    move-result v1

    sub-int/2addr v1, v0

    .line 6
    iget-object v0, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mScroller:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->getDuration()I

    move-result v0

    iget-object v2, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mScroller:Landroid/widget/Scroller;

    invoke-virtual {v2}, Landroid/widget/Scroller;->timePassed()I

    move-result v2

    invoke-direct {p0, v0, v2}, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->calcDuration(II)I

    move-result v0

    .line 7
    iget-object v2, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mHelper:Lcom/cpoopc/scrollablelayoutlib/ScrollableHelper;

    invoke-direct {p0, v1, v0}, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->getScrollerVelocity(II)I

    move-result v4

    invoke-virtual {v2, v4, v1, v0}, Lcom/cpoopc/scrollablelayoutlib/ScrollableHelper;->smoothScrollBy(III)V

    .line 8
    iget-object v0, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mScroller:Landroid/widget/Scroller;

    invoke-virtual {v0, v3}, Landroid/widget/Scroller;->forceFinished(Z)V

    return-void

    .line 9
    :cond_0
    invoke-virtual {p0, v4, v0}, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->scrollTo(II)V

    goto :goto_0

    .line 10
    :cond_1
    iget-object v1, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mHelper:Lcom/cpoopc/scrollablelayoutlib/ScrollableHelper;

    invoke-virtual {v1}, Lcom/cpoopc/scrollablelayoutlib/ScrollableHelper;->isTop()Z

    move-result v1

    if-nez v1, :cond_2

    iget-boolean v1, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->isClickHeadExpand:Z

    if-eqz v1, :cond_3

    .line 11
    :cond_2
    iget v1, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mLastScrollerY:I

    sub-int v1, v0, v1

    .line 12
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getScrollY()I

    move-result v2

    add-int/2addr v2, v1

    .line 13
    invoke-virtual {p0, v4, v2}, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->scrollTo(II)V

    .line 14
    iget v1, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mCurY:I

    iget v2, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->minY:I

    if-gt v1, v2, :cond_3

    .line 15
    iget-object v0, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mScroller:Landroid/widget/Scroller;

    invoke-virtual {v0, v3}, Landroid/widget/Scroller;->forceFinished(Z)V

    return-void

    .line 16
    :cond_3
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->invalidate()V

    .line 17
    :goto_0
    iput v0, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mLastScrollerY:I

    :cond_4
    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    .line 2
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    .line 3
    iget v4, v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mDownX:F

    sub-float v4, v2, v4

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    float-to-int v4, v4

    .line 4
    iget v5, v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mDownY:F

    sub-float v5, v3, v5

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    float-to-int v5, v5

    .line 5
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v6, :cond_e

    if-eq v6, v8, :cond_7

    const/4 v2, 0x2

    if-eq v6, v2, :cond_0

    goto/16 :goto_3

    .line 6
    :cond_0
    iget-boolean v2, v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mDisallowIntercept:Z

    if-eqz v2, :cond_1

    goto/16 :goto_3

    .line 7
    :cond_1
    invoke-direct/range {p0 .. p0}, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->initVelocityTrackerIfNotExists()V

    .line 8
    iget-object v2, v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mVelocityTracker:Landroid/view/VelocityTracker;

    invoke-virtual {v2, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 9
    iget v2, v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mLastY:F

    sub-float/2addr v2, v3

    .line 10
    iget-boolean v6, v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->needCheckUpdown:Z

    if-eqz v6, :cond_3

    .line 11
    iget v6, v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mTouchSlop:I

    if-le v4, v6, :cond_2

    if-le v4, v5, :cond_2

    .line 12
    iput-boolean v7, v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->needCheckUpdown:Z

    .line 13
    iput-boolean v7, v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->updown:Z

    goto :goto_0

    :cond_2
    if-le v5, v6, :cond_3

    if-le v5, v4, :cond_3

    .line 14
    iput-boolean v7, v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->needCheckUpdown:Z

    .line 15
    iput-boolean v8, v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->updown:Z

    .line 16
    :cond_3
    :goto_0
    iget-boolean v6, v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->updown:Z

    if-eqz v6, :cond_6

    iget v6, v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mTouchSlop:I

    if-le v5, v6, :cond_6

    if-le v5, v4, :cond_6

    .line 17
    invoke-virtual/range {p0 .. p0}, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->isSticked()Z

    move-result v4

    if-eqz v4, :cond_4

    iget-object v4, v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mHelper:Lcom/cpoopc/scrollablelayoutlib/ScrollableHelper;

    invoke-virtual {v4}, Lcom/cpoopc/scrollablelayoutlib/ScrollableHelper;->isTop()Z

    move-result v4

    if-nez v4, :cond_4

    iget-boolean v4, v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->isClickHeadExpand:Z

    if-eqz v4, :cond_6

    .line 18
    :cond_4
    iget-object v4, v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->childViewPager:Landroidx/viewpager/widget/ViewPager;

    if-eqz v4, :cond_5

    .line 19
    invoke-virtual {v4, v8}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    :cond_5
    float-to-double v4, v2

    const-wide/high16 v9, 0x3fe0000000000000L    # 0.5

    .line 20
    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v4, v9

    double-to-int v2, v4

    invoke-virtual {v0, v7, v2}, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->scrollBy(II)V

    .line 21
    :cond_6
    iput v3, v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mLastY:F

    goto/16 :goto_3

    .line 22
    :cond_7
    iget-boolean v2, v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->updown:Z

    if-eqz v2, :cond_f

    if-le v5, v4, :cond_f

    iget v2, v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mTouchSlop:I

    if-le v5, v2, :cond_f

    .line 23
    iget-object v2, v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mVelocityTracker:Landroid/view/VelocityTracker;

    const/16 v3, 0x3e8

    iget v4, v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mMaximumVelocity:I

    int-to-float v4, v4

    invoke-virtual {v2, v3, v4}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 24
    iget-object v2, v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mVelocityTracker:Landroid/view/VelocityTracker;

    invoke-virtual {v2}, Landroid/view/VelocityTracker;->getYVelocity()F

    move-result v2

    neg-float v2, v2

    .line 25
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v3

    iget v4, v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mMinimumVelocity:I

    int-to-float v4, v4

    cmpl-float v3, v3, v4

    if-lez v3, :cond_c

    const/4 v3, 0x0

    cmpl-float v3, v2, v3

    if-lez v3, :cond_8

    .line 26
    sget-object v3, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$DIRECTION;->UP:Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$DIRECTION;

    goto :goto_1

    :cond_8
    sget-object v3, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$DIRECTION;->DOWN:Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$DIRECTION;

    :goto_1
    iput-object v3, v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mDirection:Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$DIRECTION;

    .line 27
    sget-object v4, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$DIRECTION;->UP:Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$DIRECTION;

    if-ne v3, v4, :cond_9

    invoke-virtual/range {p0 .. p0}, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->isSticked()Z

    move-result v3

    if-nez v3, :cond_a

    :cond_9
    invoke-virtual/range {p0 .. p0}, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->isSticked()Z

    move-result v3

    if-nez v3, :cond_b

    invoke-virtual/range {p0 .. p0}, Landroid/widget/LinearLayout;->getScrollY()I

    move-result v3

    if-nez v3, :cond_b

    iget-object v3, v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mDirection:Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$DIRECTION;

    sget-object v4, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$DIRECTION;->DOWN:Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$DIRECTION;

    if-ne v3, v4, :cond_b

    :cond_a
    const/4 v7, 0x1

    goto :goto_2

    .line 28
    :cond_b
    iget-object v9, v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mScroller:Landroid/widget/Scroller;

    const/4 v10, 0x0

    invoke-virtual/range {p0 .. p0}, Landroid/widget/LinearLayout;->getScrollY()I

    move-result v11

    const/4 v12, 0x0

    float-to-int v13, v2

    const/4 v14, 0x0

    const/4 v15, 0x0

    const v16, -0x7fffffff

    const v17, 0x7fffffff

    invoke-virtual/range {v9 .. v17}, Landroid/widget/Scroller;->fling(IIIIIIII)V

    .line 29
    iget-object v2, v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mScroller:Landroid/widget/Scroller;

    invoke-virtual {v2}, Landroid/widget/Scroller;->computeScrollOffset()Z

    .line 30
    invoke-virtual/range {p0 .. p0}, Landroid/widget/LinearLayout;->getScrollY()I

    move-result v2

    iput v2, v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mLastScrollerY:I

    .line 31
    invoke-virtual/range {p0 .. p0}, Landroid/widget/LinearLayout;->invalidate()V

    :cond_c
    :goto_2
    if-nez v7, :cond_f

    .line 32
    iget-boolean v2, v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->isClickHead:Z

    if-nez v2, :cond_d

    invoke-virtual/range {p0 .. p0}, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->isSticked()Z

    move-result v2

    if-nez v2, :cond_f

    .line 33
    :cond_d
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    const/4 v3, 0x3

    .line 34
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->setAction(I)V

    .line 35
    invoke-super/range {p0 .. p1}, Landroid/widget/LinearLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v3

    .line 36
    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->setAction(I)V

    return v3

    .line 37
    :cond_e
    iput-boolean v7, v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mDisallowIntercept:Z

    .line 38
    iput-boolean v8, v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->needCheckUpdown:Z

    .line 39
    iput-boolean v8, v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->updown:Z

    .line 40
    iput v2, v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mDownX:F

    .line 41
    iput v3, v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mDownY:F

    .line 42
    iput v3, v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mLastY:F

    float-to-int v2, v3

    .line 43
    iget v3, v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mHeadHeight:I

    invoke-virtual/range {p0 .. p0}, Landroid/widget/LinearLayout;->getScrollY()I

    move-result v4

    invoke-direct {v0, v2, v3, v4}, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->checkIsClickHead(III)V

    .line 44
    iget v3, v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mHeadHeight:I

    invoke-virtual/range {p0 .. p0}, Landroid/widget/LinearLayout;->getScrollY()I

    move-result v4

    invoke-direct {v0, v2, v3, v4}, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->checkIsClickHeadExpand(III)V

    .line 45
    invoke-direct/range {p0 .. p0}, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->initOrResetVelocityTracker()V

    .line 46
    iget-object v2, v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mVelocityTracker:Landroid/view/VelocityTracker;

    invoke-virtual {v2, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 47
    iget-object v2, v0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mScroller:Landroid/widget/Scroller;

    invoke-virtual {v2, v8}, Landroid/widget/Scroller;->forceFinished(Z)V

    .line 48
    :cond_f
    :goto_3
    invoke-super/range {p0 .. p1}, Landroid/widget/LinearLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    return v8
.end method

.method public getHelper()Lcom/cpoopc/scrollablelayoutlib/ScrollableHelper;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mHelper:Lcom/cpoopc/scrollablelayoutlib/ScrollableHelper;

    return-object v0
.end method

.method public getMaxY()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->maxY:I

    return v0
.end method

.method public isHeadTop()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mCurY:I

    iget v1, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->minY:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isSticked()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mCurY:I

    iget v1, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->maxY:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected onFinishInflate()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mHeadView:Landroid/view/View;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->isClickable()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mHeadView:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 4
    invoke-virtual {p0, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 5
    instance-of v3, v2, Landroidx/viewpager/widget/ViewPager;

    if-eqz v3, :cond_1

    .line 6
    check-cast v2, Landroidx/viewpager/widget/ViewPager;

    iput-object v2, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->childViewPager:Landroidx/viewpager/widget/ViewPager;

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 7
    :cond_2
    invoke-super {p0}, Landroid/widget/LinearLayout;->onFinishInflate()V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 7

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    iput-object v2, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mHeadView:Landroid/view/View;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move v3, p1

    .line 2
    invoke-virtual/range {v1 .. v6}, Landroid/widget/LinearLayout;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 3
    iget-object v0, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mHeadView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    iput v0, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->maxY:I

    .line 4
    iget-object v0, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mHeadView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    iput v0, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mHeadHeight:I

    .line 5
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    iget v0, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->maxY:I

    add-int/2addr p2, v0

    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    return-void
.end method

.method public requestScrollableLayoutDisallowInterceptTouchEvent(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->requestDisallowInterceptTouchEvent(Z)V

    .line 2
    iput-boolean p1, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mDisallowIntercept:Z

    return-void
.end method

.method public scrollBy(II)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getScrollY()I

    move-result v0

    add-int/2addr p2, v0

    .line 2
    iget v1, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->maxY:I

    if-lt p2, v1, :cond_0

    :goto_0
    move p2, v1

    goto :goto_1

    .line 3
    :cond_0
    iget v1, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->minY:I

    if-gt p2, v1, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    sub-int/2addr p2, v0

    .line 4
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->scrollBy(II)V

    return-void
.end method

.method public scrollTo(II)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->maxY:I

    if-lt p2, v0, :cond_0

    move p2, v0

    goto :goto_0

    .line 2
    :cond_0
    iget v1, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->minY:I

    if-gt p2, v1, :cond_1

    move p2, v1

    .line 3
    :cond_1
    :goto_0
    iput p2, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mCurY:I

    .line 4
    iget-object v1, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->onScrollListener:Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$OnScrollListener;

    if-eqz v1, :cond_2

    .line 5
    invoke-interface {v1, p2, v0}, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$OnScrollListener;->onScroll(II)V

    .line 6
    :cond_2
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->scrollTo(II)V

    return-void
.end method

.method public setClickHeadExpand(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->mExpandHeight:I

    return-void
.end method

.method public setOnScrollListener(Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$OnScrollListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout;->onScrollListener:Lcom/cpoopc/scrollablelayoutlib/ScrollableLayout$OnScrollListener;

    return-void
.end method
