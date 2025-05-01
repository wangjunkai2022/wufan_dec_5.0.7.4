.class public Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;
.super Landroid/widget/FrameLayout;
.source "ConsecutiveViewPager2.java"

# interfaces
.implements Lcom/donkingliang/consecutivescroller/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2$a;
    }
.end annotation


# static fields
.field private static final e:I = -0x7b


# instance fields
.field protected b:Landroidx/viewpager2/widget/ViewPager2;

.field protected c:Landroidx/recyclerview/widget/RecyclerView;

.field private d:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;->c(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    invoke-direct {p0, p1}, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;->c(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    invoke-direct {p0, p1}, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;->c(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic a(Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;->f(Landroid/view/View;)V

    return-void
.end method

.method private c(Landroid/content/Context;)V
    .locals 1

    .line 1
    new-instance v0, Landroidx/viewpager2/widget/ViewPager2;

    invoke-direct {v0, p1}, Landroidx/viewpager2/widget/ViewPager2;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;->b:Landroidx/viewpager2/widget/ViewPager2;

    const/4 p1, -0x1

    .line 2
    invoke-virtual {p0, v0, p1, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;II)V

    .line 3
    iget-object p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;->b:Landroidx/viewpager2/widget/ViewPager2;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;->c:Landroidx/recyclerview/widget/RecyclerView;

    return-void
.end method

.method private d()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 2
    instance-of v1, v0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 3
    check-cast v0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;

    .line 4
    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v1

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v3, 0x1

    sub-int/2addr v0, v3

    if-ne v1, v0, :cond_0

    const/4 v2, 0x1

    :cond_0
    return v2
.end method

.method private f(Landroid/view/View;)V
    .locals 4

    if-eqz p1, :cond_3

    .line 1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;

    if-eqz v0, :cond_3

    .line 2
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;

    .line 3
    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v1

    .line 4
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ne v1, v2, :cond_0

    .line 5
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v2

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v3

    if-ge v2, v3, :cond_0

    .line 6
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getScrollY()I

    move-result v2

    iget v3, v0, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->c:I

    if-lt v2, v3, :cond_0

    return-void

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->m()Landroid/view/View;

    move-result-object v2

    if-nez v2, :cond_1

    return-void

    .line 8
    :cond_1
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 9
    invoke-virtual {v0, p1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->Y(Landroid/view/View;)V

    goto :goto_0

    :cond_2
    if-le v1, v2, :cond_3

    .line 10
    invoke-virtual {v0, p1}, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;->Z(Landroid/view/View;)V

    :cond_3
    :goto_0
    return-void
.end method

.method private setAttachListener(Landroid/view/View;)V
    .locals 3

    const/16 v0, -0x7b

    .line 1
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2$a;

    .line 3
    iget-object v2, v1, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2$a;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    .line 4
    invoke-virtual {p1, v1}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    const/4 v1, 0x0

    .line 5
    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 6
    :cond_0
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    .line 7
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 8
    instance-of v2, v1, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$LayoutParams;

    if-eqz v2, :cond_1

    .line 9
    check-cast v1, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$LayoutParams;

    iget-boolean v1, v1, Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout$LayoutParams;->a:Z

    if-eqz v1, :cond_1

    .line 10
    new-instance v1, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2$a;

    invoke-direct {v1, p0, p1}, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2$a;-><init>(Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;Landroid/view/View;)V

    .line 11
    invoke-virtual {p1, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 12
    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method protected b(Landroid/view/View;)Landroid/view/View;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v0

    instance-of v0, v0, Landroidx/viewpager2/adapter/FragmentStateAdapter;

    if-eqz v0, :cond_0

    instance-of v0, p1, Landroid/widget/FrameLayout;

    if-eqz v0, :cond_0

    .line 2
    move-object v0, p1

    check-cast v0, Landroid/widget/FrameLayout;

    .line 3
    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getChildCount()I

    move-result v1

    if-lez v1, :cond_0

    const/4 p1, 0x0

    .line 4
    invoke-virtual {v0, p1}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public canScrollHorizontally(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;->b:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0, p1}, Landroidx/viewpager2/widget/ViewPager2;->canScrollHorizontally(I)Z

    move-result p1

    return p1
.end method

.method public canScrollVertically(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;->b:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0, p1}, Landroidx/viewpager2/widget/ViewPager2;->canScrollVertically(I)Z

    move-result p1

    return p1
.end method

.method public e(Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;)V
    .locals 1
    .param p1    # Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;->b:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0, p1}, Landroidx/viewpager2/widget/ViewPager2;->registerOnPageChangeCallback(Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;)V

    return-void
.end method

.method public g(Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;)V
    .locals 1
    .param p1    # Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;->b:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0, p1}, Landroidx/viewpager2/widget/ViewPager2;->unregisterOnPageChangeCallback(Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;)V

    return-void
.end method

.method public getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;->b:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v0

    return-object v0
.end method

.method public getAdjustHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;->d:I

    return v0
.end method

.method public getCurrentItem()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;->b:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    move-result v0

    return v0
.end method

.method public getCurrentScrollerView()Landroid/view/View;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;->getCurrentItem()I

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v1

    .line 3
    iget-object v2, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v2

    if-eqz v1, :cond_0

    if-eqz v2, :cond_0

    if-ltz v0, :cond_0

    .line 4
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemCount()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 5
    invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->findViewByPosition(I)Landroid/view/View;

    move-result-object v0

    .line 6
    invoke-virtual {p0, v0}, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;->b(Landroid/view/View;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 7
    invoke-direct {p0, v0}, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;->setAttachListener(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    if-nez v0, :cond_2

    .line 8
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;->c:Landroidx/recyclerview/widget/RecyclerView;

    :cond_2
    return-object v0
.end method

.method public getOffscreenPageLimit()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;->b:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getOffscreenPageLimit()I

    move-result v0

    return v0
.end method

.method public getOrientation()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;->b:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getOrientation()I

    move-result v0

    return v0
.end method

.method public getScrolledViews()Ljava/util/List;
    .locals 4
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
    iget-object v1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 3
    iget-object v3, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;->b(Landroid/view/View;)Landroid/view/View;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public getViewPager2()Landroidx/viewpager2/widget/ViewPager2;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;->b:Landroidx/viewpager2/widget/ViewPager2;

    return-object v0
.end method

.method protected onMeasure(II)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;->d:I

    if-lez v0, :cond_0

    const/4 v0, 0x0

    .line 2
    invoke-static {v0, p2}, Landroid/widget/FrameLayout;->getDefaultSize(II)I

    move-result v0

    iget v1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;->d:I

    sub-int/2addr v0, v1

    .line 3
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p2

    invoke-static {v0, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 4
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    :goto_0
    return-void
.end method

.method public setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$Adapter;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;->b:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0, p1}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method public setAdjustHeight(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;->d:I

    if-eq v0, p1, :cond_0

    .line 2
    iput p1, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;->d:I

    .line 3
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->requestLayout()V

    :cond_0
    return-void
.end method

.method public setCurrentItem(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;->b:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0, p1}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(I)V

    return-void
.end method

.method public setCurrentItem(IZ)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;->b:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0, p1, p2}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(IZ)V

    return-void
.end method

.method public setOffscreenPageLimit(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;->b:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0, p1}, Landroidx/viewpager2/widget/ViewPager2;->setOffscreenPageLimit(I)V

    return-void
.end method

.method public setOrientation(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/donkingliang/consecutivescroller/ConsecutiveViewPager2;->b:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0, p1}, Landroidx/viewpager2/widget/ViewPager2;->setOrientation(I)V

    return-void
.end method
