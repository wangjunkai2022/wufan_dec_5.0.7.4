.class public Lcom/cpoopc/scrollablelayoutlib/ScrollableHelper;
.super Ljava/lang/Object;
.source "ScrollableHelper.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/cpoopc/scrollablelayoutlib/ScrollableHelper$ScrollableContainer;
    }
.end annotation


# instance fields
.field private mCurrentScrollableCainer:Lcom/cpoopc/scrollablelayoutlib/ScrollableHelper$ScrollableContainer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private getScrollableView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableHelper;->mCurrentScrollableCainer:Lcom/cpoopc/scrollablelayoutlib/ScrollableHelper$ScrollableContainer;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    invoke-interface {v0}, Lcom/cpoopc/scrollablelayoutlib/ScrollableHelper$ScrollableContainer;->getScrollableView()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method private static isAdapterViewTop(Landroid/widget/AdapterView;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    .line 1
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result v1

    .line 2
    invoke-virtual {p0, v0}, Landroid/widget/AdapterView;->getChildAt(I)Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_0

    if-nez v1, :cond_1

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result p0

    if-nez p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    return v0
.end method

.method private static isRecyclerViewTop(Landroidx/recyclerview/widget/RecyclerView;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v1

    .line 2
    instance-of v2, v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    if-eqz v2, :cond_1

    .line 3
    move-object v2, v1

    check-cast v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    move-result v2

    .line 4
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_0

    if-nez v2, :cond_1

    .line 5
    invoke-virtual {v1, p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getDecoratedTop(Landroid/view/View;)I

    move-result p0

    if-nez p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    return v0
.end method

.method private static isScrollViewTop(Landroid/widget/ScrollView;)Z
    .locals 1

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    .line 1
    invoke-virtual {p0}, Landroid/widget/ScrollView;->getScrollY()I

    move-result p0

    if-gtz p0, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method private static isWebViewTop(Landroid/webkit/WebView;)Z
    .locals 1

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    .line 1
    invoke-virtual {p0}, Landroid/webkit/WebView;->getScrollY()I

    move-result p0

    if-gtz p0, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method


# virtual methods
.method public isTop()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/cpoopc/scrollablelayoutlib/ScrollableHelper;->getScrollableView()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 2
    :cond_0
    instance-of v1, v0, Landroid/widget/AdapterView;

    if-eqz v1, :cond_1

    .line 3
    check-cast v0, Landroid/widget/AdapterView;

    invoke-static {v0}, Lcom/cpoopc/scrollablelayoutlib/ScrollableHelper;->isAdapterViewTop(Landroid/widget/AdapterView;)Z

    move-result v0

    return v0

    .line 4
    :cond_1
    instance-of v1, v0, Landroid/widget/ScrollView;

    if-eqz v1, :cond_2

    .line 5
    check-cast v0, Landroid/widget/ScrollView;

    invoke-static {v0}, Lcom/cpoopc/scrollablelayoutlib/ScrollableHelper;->isScrollViewTop(Landroid/widget/ScrollView;)Z

    move-result v0

    return v0

    .line 6
    :cond_2
    instance-of v1, v0, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v1, :cond_3

    .line 7
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0}, Lcom/cpoopc/scrollablelayoutlib/ScrollableHelper;->isRecyclerViewTop(Landroidx/recyclerview/widget/RecyclerView;)Z

    move-result v0

    return v0

    .line 8
    :cond_3
    instance-of v1, v0, Landroid/webkit/WebView;

    if-eqz v1, :cond_4

    .line 9
    check-cast v0, Landroid/webkit/WebView;

    invoke-static {v0}, Lcom/cpoopc/scrollablelayoutlib/ScrollableHelper;->isWebViewTop(Landroid/webkit/WebView;)Z

    move-result v0

    return v0

    .line 10
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "scrollableView must be a instance of AdapterView|ScrollView|RecyclerView"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public setCurrentScrollableContainer(Lcom/cpoopc/scrollablelayoutlib/ScrollableHelper$ScrollableContainer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/cpoopc/scrollablelayoutlib/ScrollableHelper;->mCurrentScrollableCainer:Lcom/cpoopc/scrollablelayoutlib/ScrollableHelper$ScrollableContainer;

    return-void
.end method

.method public smoothScrollBy(III)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/cpoopc/scrollablelayoutlib/ScrollableHelper;->getScrollableView()Landroid/view/View;

    move-result-object v0

    .line 2
    instance-of v1, v0, Landroid/widget/AbsListView;

    if-eqz v1, :cond_1

    .line 3
    check-cast v0, Landroid/widget/AbsListView;

    .line 4
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v1, v2, :cond_0

    .line 5
    invoke-virtual {v0, p1}, Landroid/widget/AbsListView;->fling(I)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0, p2, p3}, Landroid/widget/AbsListView;->smoothScrollBy(II)V

    goto :goto_0

    .line 7
    :cond_1
    instance-of p2, v0, Landroid/widget/ScrollView;

    if-eqz p2, :cond_2

    .line 8
    check-cast v0, Landroid/widget/ScrollView;

    invoke-virtual {v0, p1}, Landroid/widget/ScrollView;->fling(I)V

    goto :goto_0

    .line 9
    :cond_2
    instance-of p2, v0, Landroidx/recyclerview/widget/RecyclerView;

    const/4 p3, 0x0

    if-eqz p2, :cond_3

    .line 10
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p3, p1}, Landroidx/recyclerview/widget/RecyclerView;->fling(II)Z

    goto :goto_0

    .line 11
    :cond_3
    instance-of p2, v0, Landroid/webkit/WebView;

    if-eqz p2, :cond_4

    .line 12
    check-cast v0, Landroid/webkit/WebView;

    invoke-virtual {v0, p3, p1}, Landroid/webkit/WebView;->flingScroll(II)V

    :cond_4
    :goto_0
    return-void
.end method
