.class public Lcom/kwad/components/core/page/recycle/b;
.super Lcom/kwad/components/core/page/recycle/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/page/recycle/b$a;
    }
.end annotation


# instance fields
.field private PY:Landroid/graphics/Rect;

.field private PZ:I

.field private Qa:I

.field private Qb:Z

.field private Qc:I

.field private Qd:Lcom/kwad/components/core/page/recycle/b$a;

.field private Qe:Z

.field private Qf:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/kwad/components/core/page/recycle/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/kwad/components/core/page/recycle/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/kwad/components/core/page/recycle/g;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/high16 p1, -0x80000000

    .line 4
    iput p1, p0, Lcom/kwad/components/core/page/recycle/b;->Qc:I

    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lcom/kwad/components/core/page/recycle/b;->Qf:Z

    return-void
.end method

.method private a(III)V
    .locals 5

    .line 1
    :goto_0
    iget v0, p0, Lcom/kwad/components/core/page/recycle/b;->Qc:I

    const/high16 v1, -0x80000000

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-ne v0, v1, :cond_0

    new-array v0, v3, [I

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getLocationOnScreen([I)V

    .line 3
    aget v0, v0, v2

    iput v0, p0, Lcom/kwad/components/core/page/recycle/b;->Qc:I

    .line 4
    :cond_0
    invoke-static {p0}, Lcom/kwad/components/core/page/recycle/f;->b(Landroidx/recyclerview/widget/RecyclerView;)Lcom/kwad/components/core/page/recycle/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/core/page/recycle/f;->findFirstVisibleItemPosition()I

    move-result v0

    .line 5
    invoke-static {p0}, Lcom/kwad/components/core/page/recycle/f;->b(Landroidx/recyclerview/widget/RecyclerView;)Lcom/kwad/components/core/page/recycle/f;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kwad/components/core/page/recycle/f;->findLastVisibleItemPosition()I

    move-result v1

    const/4 v4, -0x1

    if-eq v0, v4, :cond_5

    if-ne v1, v4, :cond_1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    if-lt p1, v0, :cond_3

    if-gt p1, v1, :cond_3

    sub-int/2addr p1, v0

    .line 6
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    if-le p2, p1, :cond_2

    .line 7
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    new-array p2, v3, [I

    .line 8
    invoke-virtual {p1, p2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 9
    aget p1, p2, v2

    iget p2, p0, Lcom/kwad/components/core/page/recycle/b;->Qc:I

    sub-int/2addr p1, p2

    sub-int/2addr p1, p3

    invoke-virtual {p0, v4, p1}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    :cond_2
    return-void

    :cond_3
    if-le p1, v1, :cond_4

    .line 10
    invoke-virtual {p0, v4, p2}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    .line 11
    invoke-direct {p0, p1, p2, p3}, Lcom/kwad/components/core/page/recycle/b;->a(III)V

    return-void

    :cond_4
    neg-int v0, p2

    .line 12
    invoke-virtual {p0, v4, v0}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    goto :goto_0

    :cond_5
    :goto_1
    return-void
.end method

.method private qo()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/page/recycle/b;->PY:Landroid/graphics/Rect;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/page/recycle/b;->PY:Landroid/graphics/Rect;

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    .line 4
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_2

    .line 5
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 6
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-nez v3, :cond_1

    .line 7
    iget-object v3, p0, Lcom/kwad/components/core/page/recycle/b;->PY:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v4

    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v5

    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    move-result v6

    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    move-result v2

    invoke-virtual {v3, v4, v5, v6, v2}, Landroid/graphics/Rect;->union(IIII)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method private qp()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v0

    .line 2
    instance-of v1, v0, Lcom/kwad/components/core/page/recycle/d;

    if-eqz v1, :cond_0

    .line 3
    check-cast v0, Lcom/kwad/components/core/page/recycle/d;

    invoke-virtual {v0}, Lcom/kwad/components/core/page/recycle/d;->qt()V

    :cond_0
    return-void
.end method

.method private scrollToPositionWithOffset(II)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result p2

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/kwad/components/core/page/recycle/b;->a(III)V

    return-void
.end method


# virtual methods
.method protected onDetachedFromWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/recyclerview/widget/RecyclerView;->onDetachedFromWindow()V

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/core/page/recycle/b;->qp()V

    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/components/core/page/recycle/b;->PZ:I

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/core/page/recycle/b;->qo()V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/page/recycle/b;->PY:Landroid/graphics/Rect;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 5
    iget-object v0, p0, Lcom/kwad/components/core/page/recycle/b;->PY:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/Rect;)Z

    .line 6
    iget v0, p0, Lcom/kwad/components/core/page/recycle/b;->PZ:I

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 7
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 8
    :cond_0
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->onDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/page/recycle/b;->Qe:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/kwad/components/core/page/recycle/b;->Qf:Z

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->stopScroll()V

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/core/page/recycle/b;->Qd:Lcom/kwad/components/core/page/recycle/b$a;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lcom/kwad/components/core/page/recycle/b$a;->qq()Z

    move-result v0

    if-eqz v0, :cond_2

    return v1

    .line 5
    :cond_2
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method protected onMeasure(II)V
    .locals 2

    .line 1
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 2
    iget v1, p0, Lcom/kwad/components/core/page/recycle/b;->Qa:I

    if-lez v1, :cond_0

    if-ge v1, v0, :cond_0

    .line 3
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p2

    .line 4
    iget v0, p0, Lcom/kwad/components/core/page/recycle/b;->Qa:I

    invoke-static {v0, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 5
    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->onMeasure(II)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/page/recycle/b;->Qe:Z

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public scrollToPosition(I)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/page/recycle/b;->Qb:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/kwad/components/core/page/recycle/b;->scrollToPositionWithOffset(II)V

    return-void

    .line 3
    :cond_0
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    return-void
.end method

.method public setDisableScroll(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/core/page/recycle/b;->Qe:Z

    return-void
.end method

.method public setDownStop(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/core/page/recycle/b;->Qf:Z

    return-void
.end method

.method public setIgnoreTouchSwipeHandler(Lcom/kwad/components/core/page/recycle/b$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/page/recycle/b;->Qd:Lcom/kwad/components/core/page/recycle/b$a;

    return-void
.end method

.method public setUnderneathColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/components/core/page/recycle/b;->PZ:I

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/core/page/recycle/b;->qo()V

    .line 3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->invalidate()V

    return-void
.end method

.method public setUseCustomScrollToPosition(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/core/page/recycle/b;->Qb:Z

    return-void
.end method
