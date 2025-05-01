.class public Lcom/join/mgps/customview/LoadMoreRecyclerView;
.super Landroidx/recyclerview/widget/RecyclerView;
.source "LoadMoreRecyclerView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/customview/LoadMoreRecyclerView$AutoLoadAdapter;,
        Lcom/join/mgps/customview/LoadMoreRecyclerView$b;
    }
.end annotation


# static fields
.field public static final i:I = 0x0

.field public static final j:I = 0x3e7

.field public static final k:I = 0x3

.field public static final l:I = 0x4


# instance fields
.field private b:Z

.field private c:Z

.field private d:Lcom/join/mgps/customview/LoadMoreRecyclerView$AutoLoadAdapter;

.field private e:Z

.field private f:I

.field private g:Lcom/join/mgps/customview/LoadMoreRecyclerView$b;

.field private h:Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/join/mgps/customview/LoadMoreRecyclerView;->b:Z

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Lcom/join/mgps/customview/LoadMoreRecyclerView;->c:Z

    .line 4
    invoke-direct {p0}, Lcom/join/mgps/customview/LoadMoreRecyclerView;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lcom/join/mgps/customview/LoadMoreRecyclerView;->b:Z

    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Lcom/join/mgps/customview/LoadMoreRecyclerView;->c:Z

    .line 8
    invoke-direct {p0}, Lcom/join/mgps/customview/LoadMoreRecyclerView;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lcom/join/mgps/customview/LoadMoreRecyclerView;->b:Z

    const/4 p1, 0x0

    .line 11
    iput-boolean p1, p0, Lcom/join/mgps/customview/LoadMoreRecyclerView;->c:Z

    .line 12
    invoke-direct {p0}, Lcom/join/mgps/customview/LoadMoreRecyclerView;->init()V

    return-void
.end method

.method static synthetic b(Lcom/join/mgps/customview/LoadMoreRecyclerView;)Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/customview/LoadMoreRecyclerView;->h:Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;

    return-object p0
.end method

.method static synthetic c(Lcom/join/mgps/customview/LoadMoreRecyclerView;)Lcom/join/mgps/customview/LoadMoreRecyclerView$b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/customview/LoadMoreRecyclerView;->g:Lcom/join/mgps/customview/LoadMoreRecyclerView$b;

    return-object p0
.end method

.method static synthetic d(Lcom/join/mgps/customview/LoadMoreRecyclerView;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/customview/LoadMoreRecyclerView;->b:Z

    return p0
.end method

.method static synthetic e(Lcom/join/mgps/customview/LoadMoreRecyclerView;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/customview/LoadMoreRecyclerView;->e:Z

    return p0
.end method

.method static synthetic f(Lcom/join/mgps/customview/LoadMoreRecyclerView;)I
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/customview/LoadMoreRecyclerView;->getLastVisiblePosition()I

    move-result p0

    return p0
.end method

.method static synthetic g(Lcom/join/mgps/customview/LoadMoreRecyclerView;)Lcom/join/mgps/customview/LoadMoreRecyclerView$AutoLoadAdapter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/customview/LoadMoreRecyclerView;->d:Lcom/join/mgps/customview/LoadMoreRecyclerView$AutoLoadAdapter;

    return-object p0
.end method

.method private getLastVisiblePosition()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v0

    instance-of v0, v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    move-result v0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v0

    instance-of v0, v0, Landroidx/recyclerview/widget/GridLayoutManager;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    move-result v0

    goto :goto_0

    .line 5
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v0

    instance-of v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 7
    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->getSpanCount()I

    move-result v1

    new-array v1, v1, [I

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->findLastVisibleItemPositions([I)[I

    move-result-object v0

    .line 8
    invoke-direct {p0, v0}, Lcom/join/mgps/customview/LoadMoreRecyclerView;->j([I)I

    move-result v0

    goto :goto_0

    .line 9
    :cond_2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    return v0
.end method

.method static synthetic h(Lcom/join/mgps/customview/LoadMoreRecyclerView;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/LoadMoreRecyclerView;->f:I

    return p1
.end method

.method static synthetic i(Lcom/join/mgps/customview/LoadMoreRecyclerView;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/customview/LoadMoreRecyclerView;->c:Z

    return p0
.end method

.method private init()V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/customview/LoadMoreRecyclerView$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/customview/LoadMoreRecyclerView$a;-><init>(Lcom/join/mgps/customview/LoadMoreRecyclerView;)V

    invoke-super {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

    return-void
.end method

.method private j([I)I
    .locals 4

    .line 1
    array-length v0, p1

    const/high16 v1, -0x80000000

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 2
    aget v3, p1, v2

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v1
.end method


# virtual methods
.method public a(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/customview/LoadMoreRecyclerView;->c:Z

    return-void
.end method

.method public addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/LoadMoreRecyclerView;->h:Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;

    return-void
.end method

.method public k(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lcom/join/mgps/customview/LoadMoreRecyclerView;->setAutoLoadMoreEnable(Z)V

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v0

    iget v1, p0, Lcom/join/mgps/customview/LoadMoreRecyclerView;->f:I

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemRemoved(I)V

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/join/mgps/customview/LoadMoreRecyclerView;->e:Z

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/customview/LoadMoreRecyclerView;->a(Z)V

    return-void
.end method

.method public setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    new-instance v0, Lcom/join/mgps/customview/LoadMoreRecyclerView$AutoLoadAdapter;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/customview/LoadMoreRecyclerView$AutoLoadAdapter;-><init>(Lcom/join/mgps/customview/LoadMoreRecyclerView;Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    iput-object v0, p0, Lcom/join/mgps/customview/LoadMoreRecyclerView;->d:Lcom/join/mgps/customview/LoadMoreRecyclerView$AutoLoadAdapter;

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/customview/LoadMoreRecyclerView;->d:Lcom/join/mgps/customview/LoadMoreRecyclerView$AutoLoadAdapter;

    const/4 v0, 0x1

    invoke-super {p0, p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->swapAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;Z)V

    return-void
.end method

.method public setAutoLoadMoreEnable(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/customview/LoadMoreRecyclerView;->b:Z

    return-void
.end method

.method public setLoadMoreListener(Lcom/join/mgps/customview/LoadMoreRecyclerView$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/LoadMoreRecyclerView;->g:Lcom/join/mgps/customview/LoadMoreRecyclerView$b;

    return-void
.end method

.method public setLoadingMore(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/customview/LoadMoreRecyclerView;->e:Z

    return-void
.end method
