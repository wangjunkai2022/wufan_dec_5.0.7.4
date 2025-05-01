.class public Lcom/papa91/arc/widget/listview/ListViewFinal;
.super Landroid/widget/ListView;
.source "ListViewFinal.java"

# interfaces
.implements Lcom/papa91/arc/widget/listview/OnScrollBottomListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/papa91/arc/widget/listview/ListViewFinal$ListViewOnScrollListener;,
        Lcom/papa91/arc/widget/listview/ListViewFinal$OnMoreViewClickListener;
    }
.end annotation


# instance fields
.field private mAddLoadMoreFooterFlag:Z

.field private mDataObserver:Landroid/database/DataSetObserver;

.field mFirstVisibleItem:I

.field private mHasLoadFail:Z

.field mHasLoadMore:Z

.field private mHasLoadMoreViewShowState:Z

.field private mLoadMoreLock:Z

.field mLoadMoreMode:Lcom/papa91/arc/widget/listview/LoadMoreMode;

.field mLoadMoreView:Lcom/papa91/arc/widget/listview/ILoadMoreView;

.field private mLoadMoreViewBottom:I

.field private mLoadMoreViewLeft:I

.field private mLoadMoreViewRight:I

.field private mLoadMoreViewTop:I

.field private mNoLoadMoreHideView:Z

.field private mOnLoadMoreListener:Lcom/papa91/arc/widget/listview/OnLoadMoreListener;

.field mPreLoad:Z

.field protected mTotalItemCount:I

.field mVisibleItemCount:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    .line 2
    sget-object v0, Lcom/papa91/arc/widget/listview/LoadMoreMode;->SCROLL:Lcom/papa91/arc/widget/listview/LoadMoreMode;

    iput-object v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mLoadMoreMode:Lcom/papa91/arc/widget/listview/LoadMoreMode;

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mHasLoadMore:Z

    .line 4
    iput-boolean v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mPreLoad:Z

    .line 5
    new-instance v0, Lcom/papa91/arc/widget/listview/ListViewFinal$1;

    invoke-direct {v0, p0}, Lcom/papa91/arc/widget/listview/ListViewFinal$1;-><init>(Lcom/papa91/arc/widget/listview/ListViewFinal;)V

    iput-object v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mDataObserver:Landroid/database/DataSetObserver;

    const/4 v0, 0x0

    .line 6
    invoke-direct {p0, p1, v0}, Lcom/papa91/arc/widget/listview/ListViewFinal;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 7
    invoke-direct {p0, p1, p2}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 8
    sget-object v0, Lcom/papa91/arc/widget/listview/LoadMoreMode;->SCROLL:Lcom/papa91/arc/widget/listview/LoadMoreMode;

    iput-object v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mLoadMoreMode:Lcom/papa91/arc/widget/listview/LoadMoreMode;

    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mHasLoadMore:Z

    .line 10
    iput-boolean v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mPreLoad:Z

    .line 11
    new-instance v0, Lcom/papa91/arc/widget/listview/ListViewFinal$1;

    invoke-direct {v0, p0}, Lcom/papa91/arc/widget/listview/ListViewFinal$1;-><init>(Lcom/papa91/arc/widget/listview/ListViewFinal;)V

    iput-object v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mDataObserver:Landroid/database/DataSetObserver;

    .line 12
    invoke-direct {p0, p1, p2}, Lcom/papa91/arc/widget/listview/ListViewFinal;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 13
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 14
    sget-object p3, Lcom/papa91/arc/widget/listview/LoadMoreMode;->SCROLL:Lcom/papa91/arc/widget/listview/LoadMoreMode;

    iput-object p3, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mLoadMoreMode:Lcom/papa91/arc/widget/listview/LoadMoreMode;

    const/4 p3, 0x1

    .line 15
    iput-boolean p3, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mHasLoadMore:Z

    .line 16
    iput-boolean p3, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mPreLoad:Z

    .line 17
    new-instance p3, Lcom/papa91/arc/widget/listview/ListViewFinal$1;

    invoke-direct {p3, p0}, Lcom/papa91/arc/widget/listview/ListViewFinal$1;-><init>(Lcom/papa91/arc/widget/listview/ListViewFinal;)V

    iput-object p3, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mDataObserver:Landroid/database/DataSetObserver;

    .line 18
    invoke-direct {p0, p1, p2}, Lcom/papa91/arc/widget/listview/ListViewFinal;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private hideLoadMoreView()V
    .locals 3

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mHasLoadMoreViewShowState:Z

    .line 2
    iget-object v1, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mLoadMoreView:Lcom/papa91/arc/widget/listview/ILoadMoreView;

    invoke-interface {v1}, Lcom/papa91/arc/widget/listview/ILoadMoreView;->getFooterView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    iput v1, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mLoadMoreViewBottom:I

    .line 3
    iget-object v1, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mLoadMoreView:Lcom/papa91/arc/widget/listview/ILoadMoreView;

    invoke-interface {v1}, Lcom/papa91/arc/widget/listview/ILoadMoreView;->getFooterView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    iput v1, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mLoadMoreViewTop:I

    .line 4
    iget-object v1, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mLoadMoreView:Lcom/papa91/arc/widget/listview/ILoadMoreView;

    invoke-interface {v1}, Lcom/papa91/arc/widget/listview/ILoadMoreView;->getFooterView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    iput v1, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mLoadMoreViewLeft:I

    .line 5
    iget-object v1, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mLoadMoreView:Lcom/papa91/arc/widget/listview/ILoadMoreView;

    invoke-interface {v1}, Lcom/papa91/arc/widget/listview/ILoadMoreView;->getFooterView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    iput v1, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mLoadMoreViewRight:I

    .line 6
    iget-object v1, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mLoadMoreView:Lcom/papa91/arc/widget/listview/ILoadMoreView;

    invoke-interface {v1}, Lcom/papa91/arc/widget/listview/ILoadMoreView;->getFooterView()Landroid/view/View;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 7
    iget-object v1, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mLoadMoreView:Lcom/papa91/arc/widget/listview/ILoadMoreView;

    invoke-interface {v1}, Lcom/papa91/arc/widget/listview/ILoadMoreView;->getFooterView()Landroid/view/View;

    move-result-object v1

    iget-object v2, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mLoadMoreView:Lcom/papa91/arc/widget/listview/ILoadMoreView;

    invoke-interface {v2}, Lcom/papa91/arc/widget/listview/ILoadMoreView;->getFooterView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {v1, v0, v2, v0, v0}, Landroid/view/View;->setPadding(IIII)V

    return-void
.end method

.method private init(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    .line 1
    sget-object v0, Lorg/ppsspp/ppsspp/R$styleable;->LoadingViewFinal:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 2
    sget v0, Lorg/ppsspp/ppsspp/R$styleable;->LoadingViewFinal_loadMoreMode:I

    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    invoke-static {v0}, Lcom/papa91/arc/widget/listview/LoadMoreMode;->mapIntToValue(I)Lcom/papa91/arc/widget/listview/LoadMoreMode;

    move-result-object v0

    iput-object v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mLoadMoreMode:Lcom/papa91/arc/widget/listview/LoadMoreMode;

    goto :goto_0

    .line 4
    :cond_0
    sget-object v0, Lcom/papa91/arc/widget/listview/LoadMoreMode;->SCROLL:Lcom/papa91/arc/widget/listview/LoadMoreMode;

    iput-object v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mLoadMoreMode:Lcom/papa91/arc/widget/listview/LoadMoreMode;

    .line 5
    :goto_0
    sget v0, Lorg/ppsspp/ppsspp/R$styleable;->LoadingViewFinal_noLoadMoreHideView:I

    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    .line 6
    invoke-virtual {p2, v0, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mNoLoadMoreHideView:Z

    goto :goto_1

    .line 7
    :cond_1
    iput-boolean v3, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mNoLoadMoreHideView:Z

    .line 8
    :goto_1
    sget v0, Lorg/ppsspp/ppsspp/R$styleable;->LoadingViewFinal_loadMoreView:I

    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 9
    :try_start_0
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 10
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    new-array v1, v2, [Ljava/lang/Class;

    .line 11
    const-class v4, Landroid/content/Context;

    aput-object v4, v1, v3

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    new-array v1, v2, [Ljava/lang/Object;

    aput-object p1, v1, v3

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/papa91/arc/widget/listview/ILoadMoreView;

    .line 13
    iput-object v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mLoadMoreView:Lcom/papa91/arc/widget/listview/ILoadMoreView;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 15
    new-instance v0, Lcom/papa91/arc/widget/listview/DefaultLoadMoreView;

    invoke-direct {v0, p1}, Lcom/papa91/arc/widget/listview/DefaultLoadMoreView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mLoadMoreView:Lcom/papa91/arc/widget/listview/ILoadMoreView;

    goto :goto_2

    .line 16
    :cond_2
    new-instance v0, Lcom/papa91/arc/widget/listview/DefaultLoadMoreView;

    invoke-direct {v0, p1}, Lcom/papa91/arc/widget/listview/DefaultLoadMoreView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mLoadMoreView:Lcom/papa91/arc/widget/listview/ILoadMoreView;

    .line 17
    :goto_2
    new-instance p1, Lcom/papa91/arc/widget/listview/ListViewFinal$ListViewOnScrollListener;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lcom/papa91/arc/widget/listview/ListViewFinal$ListViewOnScrollListener;-><init>(Lcom/papa91/arc/widget/listview/ListViewFinal;Lcom/papa91/arc/widget/listview/ListViewFinal$1;)V

    invoke-virtual {p0, p1}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 18
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private showLoadMoreView()V
    .locals 5

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mHasLoadMoreViewShowState:Z

    .line 2
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mLoadMoreView:Lcom/papa91/arc/widget/listview/ILoadMoreView;

    invoke-interface {v0}, Lcom/papa91/arc/widget/listview/ILoadMoreView;->getFooterView()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mLoadMoreView:Lcom/papa91/arc/widget/listview/ILoadMoreView;

    invoke-interface {v0}, Lcom/papa91/arc/widget/listview/ILoadMoreView;->getFooterView()Landroid/view/View;

    move-result-object v0

    iget v1, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mLoadMoreViewLeft:I

    iget v2, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mLoadMoreViewTop:I

    iget v3, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mLoadMoreViewRight:I

    iget v4, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mLoadMoreViewBottom:I

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    return-void
.end method


# virtual methods
.method executeLoadMore()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mLoadMoreLock:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mHasLoadMore:Z

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mOnLoadMoreListener:Lcom/papa91/arc/widget/listview/OnLoadMoreListener;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0}, Lcom/papa91/arc/widget/listview/OnLoadMoreListener;->loadMore()V

    :cond_0
    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mLoadMoreLock:Z

    .line 5
    invoke-virtual {p0}, Lcom/papa91/arc/widget/listview/ListViewFinal;->showLoadingUI()V

    :cond_1
    return-void
.end method

.method protected onFinishInflate()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/widget/ListView;->onFinishInflate()V

    .line 2
    invoke-direct {p0}, Lcom/papa91/arc/widget/listview/ListViewFinal;->hideLoadMoreView()V

    return-void
.end method

.method public onLoadMoreComplete()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mHasLoadFail:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/papa91/arc/widget/listview/ListViewFinal;->showFailUI()V

    goto :goto_0

    .line 3
    :cond_0
    iget-boolean v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mHasLoadMore:Z

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p0}, Lcom/papa91/arc/widget/listview/ListViewFinal;->showNormalUI()V

    :cond_1
    :goto_0
    return-void
.end method

.method public onScorllBootom()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mHasLoadMore:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mLoadMoreMode:Lcom/papa91/arc/widget/listview/LoadMoreMode;

    sget-object v1, Lcom/papa91/arc/widget/listview/LoadMoreMode;->SCROLL:Lcom/papa91/arc/widget/listview/LoadMoreMode;

    if-ne v0, v1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/papa91/arc/widget/listview/ListViewFinal;->executeLoadMore()V

    :cond_0
    return-void
.end method

.method public bridge synthetic setAdapter(Landroid/widget/Adapter;)V
    .locals 0

    .line 1
    check-cast p1, Landroid/widget/ListAdapter;

    invoke-virtual {p0, p1}, Lcom/papa91/arc/widget/listview/ListViewFinal;->setAdapter(Landroid/widget/ListAdapter;)V

    return-void
.end method

.method public setAdapter(Landroid/widget/ListAdapter;)V
    .locals 1

    .line 2
    iget-boolean v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mAddLoadMoreFooterFlag:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mAddLoadMoreFooterFlag:Z

    .line 4
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mLoadMoreView:Lcom/papa91/arc/widget/listview/ILoadMoreView;

    invoke-interface {v0}, Lcom/papa91/arc/widget/listview/ILoadMoreView;->getFooterView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/widget/ListView;->addFooterView(Landroid/view/View;)V

    .line 5
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 6
    instance-of v0, p1, Landroid/widget/BaseAdapter;

    if-eqz v0, :cond_1

    .line 7
    :try_start_0
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mDataObserver:Landroid/database/DataSetObserver;

    invoke-interface {p1, v0}, Landroid/widget/ListAdapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    :catch_0
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mDataObserver:Landroid/database/DataSetObserver;

    invoke-interface {p1, v0}, Landroid/widget/ListAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    :cond_1
    return-void
.end method

.method public setHasLoadMore(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mHasLoadMore:Z

    if-nez p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/papa91/arc/widget/listview/ListViewFinal;->showNoMoreUI()V

    .line 3
    iget-boolean p1, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mNoLoadMoreHideView:Z

    if-eqz p1, :cond_2

    iget-boolean p1, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mHasLoadMoreViewShowState:Z

    if-eqz p1, :cond_2

    .line 4
    invoke-direct {p0}, Lcom/papa91/arc/widget/listview/ListViewFinal;->hideLoadMoreView()V

    goto :goto_0

    .line 5
    :cond_0
    iget-boolean p1, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mHasLoadMoreViewShowState:Z

    if-nez p1, :cond_1

    .line 6
    invoke-direct {p0}, Lcom/papa91/arc/widget/listview/ListViewFinal;->showLoadMoreView()V

    .line 7
    :cond_1
    invoke-virtual {p0}, Lcom/papa91/arc/widget/listview/ListViewFinal;->showNormalUI()V

    .line 8
    :cond_2
    :goto_0
    iget-boolean p1, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mPreLoad:Z

    if-eqz p1, :cond_3

    iget p1, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mFirstVisibleItem:I

    iget v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mVisibleItemCount:I

    add-int/2addr p1, v0

    iget v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mTotalItemCount:I

    if-lt p1, v0, :cond_3

    .line 9
    invoke-virtual {p0}, Lcom/papa91/arc/widget/listview/ListViewFinal;->onScorllBootom()V

    const/4 p1, 0x0

    .line 10
    iput-boolean p1, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mPreLoad:Z

    :cond_3
    return-void
.end method

.method public setLoadMoreMode(Lcom/papa91/arc/widget/listview/LoadMoreMode;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mLoadMoreMode:Lcom/papa91/arc/widget/listview/LoadMoreMode;

    return-void
.end method

.method public setLoadMoreView(Lcom/papa91/arc/widget/listview/ILoadMoreView;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mLoadMoreView:Lcom/papa91/arc/widget/listview/ILoadMoreView;

    .line 2
    invoke-interface {p1}, Lcom/papa91/arc/widget/listview/ILoadMoreView;->getFooterView()Landroid/view/View;

    move-result-object p1

    new-instance v0, Lcom/papa91/arc/widget/listview/ListViewFinal$OnMoreViewClickListener;

    invoke-direct {v0, p0}, Lcom/papa91/arc/widget/listview/ListViewFinal$OnMoreViewClickListener;-><init>(Lcom/papa91/arc/widget/listview/ListViewFinal;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public setNoLoadMoreHideView(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mNoLoadMoreHideView:Z

    return-void
.end method

.method public setOnLoadMoreListener(Lcom/papa91/arc/widget/listview/OnLoadMoreListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mOnLoadMoreListener:Lcom/papa91/arc/widget/listview/OnLoadMoreListener;

    return-void
.end method

.method public setPreLoad(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mPreLoad:Z

    return-void
.end method

.method public showFailUI()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mHasLoadFail:Z

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mLoadMoreLock:Z

    .line 3
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mLoadMoreView:Lcom/papa91/arc/widget/listview/ILoadMoreView;

    invoke-interface {v0}, Lcom/papa91/arc/widget/listview/ILoadMoreView;->showFail()V

    return-void
.end method

.method showLoadingUI()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mHasLoadFail:Z

    .line 2
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mLoadMoreView:Lcom/papa91/arc/widget/listview/ILoadMoreView;

    invoke-interface {v0}, Lcom/papa91/arc/widget/listview/ILoadMoreView;->showLoading()V

    return-void
.end method

.method showNoMoreUI()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mLoadMoreLock:Z

    .line 2
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mLoadMoreView:Lcom/papa91/arc/widget/listview/ILoadMoreView;

    invoke-interface {v0}, Lcom/papa91/arc/widget/listview/ILoadMoreView;->showNoMore()V

    return-void
.end method

.method showNormalUI()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mLoadMoreLock:Z

    .line 2
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal;->mLoadMoreView:Lcom/papa91/arc/widget/listview/ILoadMoreView;

    invoke-interface {v0}, Lcom/papa91/arc/widget/listview/ILoadMoreView;->showNormal()V

    return-void
.end method
