.class public Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;
.super Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
.source "StickyHeaderOnScrollListener.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;"
    }
.end annotation


# instance fields
.field private a:I

.field private b:Landroid/view/ViewGroup;

.field private c:Landroidx/recyclerview/widget/RecyclerView;

.field private d:Lcom/xuanyu/stickyheader/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/xuanyu/stickyheader/e<",
            "TT;>;"
        }
    .end annotation
.end field

.field private e:Landroid/os/Handler;

.field private f:Lcom/xuanyu/stickyheader/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/xuanyu/stickyheader/h<",
            "TT;>;"
        }
    .end annotation
.end field

.field private g:Z

.field private h:Landroid/content/Context;

.field private i:I

.field private j:I

.field private k:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/ViewGroup;I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;-><init>()V

    .line 2
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->e:Landroid/os/Handler;

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->g:Z

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->i:I

    .line 5
    iput v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->j:I

    .line 6
    new-instance v0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$a;

    invoke-direct {v0, p0}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$a;-><init>(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;)V

    iput-object v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->k:Ljava/lang/Runnable;

    .line 7
    iput p3, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->a:I

    .line 8
    iput-object p2, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->b:Landroid/view/ViewGroup;

    .line 9
    iput-object p1, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->h:Landroid/content/Context;

    .line 11
    iget-object p1, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object p1

    check-cast p1, Lcom/xuanyu/stickyheader/e;

    iput-object p1, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->d:Lcom/xuanyu/stickyheader/e;

    .line 12
    iget-object p1, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object p1

    new-instance p2, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$b;

    invoke-direct {p2, p0}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$b;-><init>(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;)V

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->registerAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;)V

    .line 13
    iget-object p1, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    new-instance p2, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$c;

    invoke-direct {p2, p0}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$c;-><init>(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;)V

    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method static synthetic b(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->p()V

    return-void
.end method

.method static synthetic c(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->c:Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method static synthetic d(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->g:Z

    return p0
.end method

.method static synthetic e(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;)Ljava/lang/Runnable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->k:Ljava/lang/Runnable;

    return-object p0
.end method

.method static synthetic f(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->e:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic g(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;)Landroid/view/ViewGroup;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->b:Landroid/view/ViewGroup;

    return-object p0
.end method

.method static synthetic h(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->a:I

    return p0
.end method

.method private i(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->w(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->b:Landroid/view/ViewGroup;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 3
    :cond_0
    invoke-direct {p0, p1}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->n(Landroid/view/View;)V

    return-void
.end method

.method private k(Landroidx/recyclerview/widget/RecyclerView;)Lcom/xuanyu/stickyheader/a;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView;",
            ")",
            "Lcom/xuanyu/stickyheader/a<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->f:Lcom/xuanyu/stickyheader/h;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 2
    :cond_0
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_5

    .line 3
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 4
    invoke-virtual {p1, v3}, Landroidx/recyclerview/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_1

    goto :goto_1

    .line 5
    :cond_1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v5

    check-cast v5, Lcom/xuanyu/stickyheader/e;

    .line 6
    invoke-interface {v5, v4}, Lcom/xuanyu/stickyheader/e;->a(I)Z

    move-result v6

    if-nez v6, :cond_2

    goto :goto_1

    .line 7
    :cond_2
    invoke-interface {v5, v4}, Lcom/xuanyu/stickyheader/e;->b(I)Lcom/xuanyu/stickyheader/a;

    move-result-object v6

    if-nez v6, :cond_3

    goto :goto_1

    .line 8
    :cond_3
    invoke-virtual {v6, v3}, Lcom/xuanyu/stickyheader/a;->setRecyclerViewItemView(Landroid/view/View;)V

    .line 9
    invoke-interface {v5, v4}, Lcom/xuanyu/stickyheader/e;->getItem(I)Ljava/lang/Object;

    move-result-object v3

    .line 10
    iget-object v4, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->f:Lcom/xuanyu/stickyheader/h;

    invoke-virtual {v4}, Lcom/xuanyu/stickyheader/h;->b()Lcom/xuanyu/stickyheader/a;

    move-result-object v4

    invoke-virtual {v4}, Lcom/xuanyu/stickyheader/a;->getRecyclerViewItemModel()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    return-object v6

    .line 11
    :cond_4
    invoke-static {v6}, Lcom/xuanyu/stickyheader/g;->b(Lcom/xuanyu/stickyheader/a;)V

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    return-object v1
.end method

.method private l(Landroidx/recyclerview/widget/RecyclerView;Z)Lcom/xuanyu/stickyheader/a;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView;",
            "Z)",
            "Lcom/xuanyu/stickyheader/a<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x0

    if-ge v1, v0, :cond_8

    .line 2
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 3
    invoke-virtual {p1, v3}, Landroidx/recyclerview/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_0

    goto :goto_1

    .line 4
    :cond_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v5

    check-cast v5, Lcom/xuanyu/stickyheader/e;

    .line 5
    invoke-interface {v5, v4}, Lcom/xuanyu/stickyheader/e;->a(I)Z

    move-result v6

    if-nez v6, :cond_1

    goto :goto_1

    .line 6
    :cond_1
    invoke-interface {v5, v4}, Lcom/xuanyu/stickyheader/e;->b(I)Lcom/xuanyu/stickyheader/a;

    move-result-object v6

    if-nez v6, :cond_2

    goto :goto_1

    .line 7
    :cond_2
    invoke-virtual {v6, v3}, Lcom/xuanyu/stickyheader/a;->setRecyclerViewItemView(Landroid/view/View;)V

    .line 8
    invoke-interface {v5, v4}, Lcom/xuanyu/stickyheader/e;->getItem(I)Ljava/lang/Object;

    move-result-object v3

    if-eqz p2, :cond_5

    .line 9
    iget-object v2, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->f:Lcom/xuanyu/stickyheader/h;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lcom/xuanyu/stickyheader/h;->b()Lcom/xuanyu/stickyheader/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/xuanyu/stickyheader/a;->getRecyclerViewItemModel()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_2

    .line 10
    :cond_3
    invoke-static {v6}, Lcom/xuanyu/stickyheader/g;->b(Lcom/xuanyu/stickyheader/a;)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    :goto_2
    return-object v6

    .line 11
    :cond_5
    iget-object p1, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->f:Lcom/xuanyu/stickyheader/h;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lcom/xuanyu/stickyheader/h;->b()Lcom/xuanyu/stickyheader/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/xuanyu/stickyheader/a;->getRecyclerViewItemModel()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    goto :goto_3

    :cond_6
    return-object v6

    .line 12
    :cond_7
    :goto_3
    invoke-static {v6}, Lcom/xuanyu/stickyheader/g;->b(Lcom/xuanyu/stickyheader/a;)V

    :cond_8
    return-object v2
.end method

.method private m(Landroid/view/View;)I
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/xuanyu/stickyheader/b;

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Lcom/xuanyu/stickyheader/b;

    invoke-interface {p1}, Lcom/xuanyu/stickyheader/b;->b()I

    move-result p1

    return p1

    .line 3
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p1

    return p1
.end method

.method private n(Landroid/view/View;)V
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    :goto_0
    iget-object v2, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->b:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 2
    iget-object v2, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->b:Landroid/view/ViewGroup;

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    if-ne v2, p1, :cond_0

    .line 3
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    :cond_0
    const/16 v3, 0x8

    .line 4
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private p()V
    .locals 8

    .line 1
    iget-boolean v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->g:Z

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x4

    int-to-float v1, v1

    iget v2, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->a:I

    int-to-float v2, v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->j(Landroidx/recyclerview/widget/RecyclerView;FF)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    .line 3
    :cond_1
    iget-object v1, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_2

    return-void

    .line 4
    :cond_2
    iget-object v3, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->d:Lcom/xuanyu/stickyheader/e;

    check-cast v3, Landroidx/recyclerview/widget/RecyclerView$Adapter;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemCount()I

    const/4 v3, 0x0

    move v4, v1

    move-object v5, v3

    :goto_0
    if-ltz v4, :cond_4

    .line 5
    iget-object v5, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->d:Lcom/xuanyu/stickyheader/e;

    invoke-static {v5, v4}, Lcom/xuanyu/stickyheader/f;->d(Lcom/xuanyu/stickyheader/e;I)Lcom/xuanyu/stickyheader/a;

    move-result-object v5

    if-eqz v5, :cond_3

    goto :goto_1

    :cond_3
    add-int/lit8 v4, v4, -0x1

    goto :goto_0

    .line 6
    :cond_4
    :goto_1
    invoke-direct {p0, v0}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->m(Landroid/view/View;)I

    move-result v4

    iget v6, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->a:I

    if-ne v4, v6, :cond_5

    if-eqz v5, :cond_5

    .line 7
    invoke-static {v5}, Lcom/xuanyu/stickyheader/g;->b(Lcom/xuanyu/stickyheader/a;)V

    return-void

    .line 8
    :cond_5
    iget-object v4, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->f:Lcom/xuanyu/stickyheader/h;

    if-eqz v4, :cond_6

    invoke-virtual {v4}, Lcom/xuanyu/stickyheader/h;->b()Lcom/xuanyu/stickyheader/a;

    move-result-object v4

    if-eqz v4, :cond_6

    if-eqz v5, :cond_6

    .line 9
    iget-object v4, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->f:Lcom/xuanyu/stickyheader/h;

    invoke-virtual {v4}, Lcom/xuanyu/stickyheader/h;->b()Lcom/xuanyu/stickyheader/a;

    move-result-object v4

    invoke-virtual {v4}, Lcom/xuanyu/stickyheader/a;->getRecyclerViewItemModel()Ljava/lang/Object;

    move-result-object v4

    .line 10
    invoke-virtual {v5}, Lcom/xuanyu/stickyheader/a;->getRecyclerViewItemModel()Ljava/lang/Object;

    move-result-object v6

    if-eqz v4, :cond_6

    if-eqz v6, :cond_6

    .line 11
    invoke-virtual {v4, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 12
    invoke-static {v5}, Lcom/xuanyu/stickyheader/g;->b(Lcom/xuanyu/stickyheader/a;)V

    return-void

    .line 13
    :cond_6
    invoke-virtual {p0}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->q()V

    const/16 v4, 0x8

    if-nez v5, :cond_7

    .line 14
    iget-object v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->b:Landroid/view/ViewGroup;

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void

    .line 15
    :cond_7
    iget-object v6, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->b:Landroid/view/ViewGroup;

    invoke-virtual {v6}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v6

    const/4 v7, 0x0

    if-ne v6, v4, :cond_8

    .line 16
    iget-object v4, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->b:Landroid/view/ViewGroup;

    invoke-virtual {v4, v7}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_8
    const/4 v4, 0x0

    .line 17
    :goto_2
    iget-object v6, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v6}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v6

    if-ge v4, v6, :cond_a

    .line 18
    iget-object v6, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v6, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    if-ne v0, v6, :cond_9

    goto :goto_3

    :cond_9
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_a
    const/4 v4, -0x1

    :goto_3
    if-eq v4, v2, :cond_d

    .line 19
    :goto_4
    iget-object v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-ge v4, v0, :cond_d

    .line 20
    iget-object v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 21
    iget-object v6, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v6, v0}, Landroidx/recyclerview/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    move-result v6

    if-ne v6, v2, :cond_b

    goto :goto_5

    .line 22
    :cond_b
    iget-object v3, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->d:Lcom/xuanyu/stickyheader/e;

    invoke-static {v3, v6}, Lcom/xuanyu/stickyheader/f;->d(Lcom/xuanyu/stickyheader/e;I)Lcom/xuanyu/stickyheader/a;

    move-result-object v3

    if-eqz v3, :cond_c

    .line 23
    invoke-virtual {v3, v0}, Lcom/xuanyu/stickyheader/a;->setRecyclerViewItemView(Landroid/view/View;)V

    goto :goto_6

    :cond_c
    :goto_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_d
    :goto_6
    if-nez v3, :cond_e

    .line 24
    iget-object v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->b:Landroid/view/ViewGroup;

    iget v2, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->a:I

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getTop()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-static {v0, v2}, Landroidx/core/view/ViewCompat;->offsetTopAndBottom(Landroid/view/View;I)V

    goto :goto_7

    .line 25
    :cond_e
    invoke-virtual {v3}, Lcom/xuanyu/stickyheader/a;->getRecyclerViewItemView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->m(Landroid/view/View;)I

    move-result v0

    iget v2, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->i:I

    sub-int/2addr v0, v2

    .line 26
    iget v2, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->a:I

    sub-int/2addr v0, v2

    iget-object v2, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->b:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result v2

    sub-int/2addr v0, v2

    .line 27
    iget-object v2, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->b:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result v2

    neg-int v2, v2

    invoke-static {v0, v2, v7}, Lcom/xuanyu/stickyheader/c;->c(III)I

    move-result v0

    .line 28
    iget-object v2, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->b:Landroid/view/ViewGroup;

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->setAlpha(F)V

    .line 29
    iget-object v2, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->b:Landroid/view/ViewGroup;

    new-instance v4, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$e;

    invoke-direct {v4, p0, v0}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$e;-><init>(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;I)V

    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    .line 30
    invoke-static {v3}, Lcom/xuanyu/stickyheader/g;->b(Lcom/xuanyu/stickyheader/a;)V

    .line 31
    :goto_7
    iget-object v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v5, v0, v2}, Lcom/xuanyu/stickyheader/a;->createIfAbsent(Landroidx/recyclerview/widget/RecyclerView;Landroid/content/Context;)Landroid/view/View;

    move-result-object v0

    .line 32
    invoke-direct {p0, v0}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->i(Landroid/view/View;)V

    .line 33
    invoke-virtual {v5}, Lcom/xuanyu/stickyheader/a;->onBindView()V

    .line 34
    invoke-static {v5}, Lcom/xuanyu/stickyheader/g;->b(Lcom/xuanyu/stickyheader/a;)V

    .line 35
    invoke-virtual {p0, v1}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->o(I)V

    return-void
.end method

.method private t(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    if-lez p3, :cond_0

    .line 1
    invoke-direct {p0, p1, p3}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->v(Landroidx/recyclerview/widget/RecyclerView;I)V

    goto :goto_0

    .line 2
    :cond_0
    invoke-direct {p0, p1, p3}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->u(Landroidx/recyclerview/widget/RecyclerView;I)V

    :goto_0
    return-void
.end method

.method private u(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->f:Lcom/xuanyu/stickyheader/h;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->l(Landroidx/recyclerview/widget/RecyclerView;Z)Lcom/xuanyu/stickyheader/a;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 3
    invoke-virtual {v1}, Lcom/xuanyu/stickyheader/a;->getRecyclerViewItemView()Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 4
    invoke-direct {p0, v2}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->m(Landroid/view/View;)I

    move-result v3

    iget v4, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->a:I

    iget v5, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->j:I

    add-int/2addr v4, v5

    if-lt v3, v4, :cond_1

    .line 5
    invoke-direct {p0, v2}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->m(Landroid/view/View;)I

    move-result v3

    iget v4, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->a:I

    iget v5, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->j:I

    add-int/2addr v4, v5

    iget-object v5, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->b:Landroid/view/ViewGroup;

    invoke-virtual {v5}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result v5

    add-int/2addr v4, v5

    sub-int/2addr v4, p2

    if-gt v3, v4, :cond_1

    .line 6
    iget p1, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->a:I

    invoke-direct {p0, v2}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->m(Landroid/view/View;)I

    move-result p2

    iget-object v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->b:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result v0

    sub-int/2addr p2, v0

    iget v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->j:I

    sub-int/2addr p2, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 7
    iget-object p2, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->b:Landroid/view/ViewGroup;

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getTop()I

    move-result v0

    sub-int/2addr p1, v0

    invoke-static {p2, p1}, Landroidx/core/view/ViewCompat;->offsetTopAndBottom(Landroid/view/View;I)V

    .line 8
    invoke-static {v1}, Lcom/xuanyu/stickyheader/g;->b(Lcom/xuanyu/stickyheader/a;)V

    goto/16 :goto_1

    :cond_1
    if-eqz v1, :cond_2

    .line 9
    invoke-static {v1}, Lcom/xuanyu/stickyheader/g;->b(Lcom/xuanyu/stickyheader/a;)V

    .line 10
    :cond_2
    invoke-direct {p0, p1}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->k(Landroidx/recyclerview/widget/RecyclerView;)Lcom/xuanyu/stickyheader/a;

    move-result-object p1

    if-nez p1, :cond_3

    .line 11
    iget-object p1, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->b:Landroid/view/ViewGroup;

    iget p2, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->a:I

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getTop()I

    move-result v0

    sub-int/2addr p2, v0

    invoke-static {p1, p2}, Landroidx/core/view/ViewCompat;->offsetTopAndBottom(Landroid/view/View;I)V

    return-void

    .line 12
    :cond_3
    invoke-virtual {p1}, Lcom/xuanyu/stickyheader/a;->getRecyclerViewItemView()Landroid/view/View;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->m(Landroid/view/View;)I

    move-result p2

    iget v1, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->a:I

    if-lt p2, v1, :cond_5

    .line 13
    iget-object p2, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->f:Lcom/xuanyu/stickyheader/h;

    invoke-virtual {p2}, Lcom/xuanyu/stickyheader/h;->a()Lcom/xuanyu/stickyheader/h;

    move-result-object p2

    if-nez p2, :cond_4

    .line 14
    iget-object p2, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->b:Landroid/view/ViewGroup;

    const/16 v0, 0x8

    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto :goto_0

    .line 15
    :cond_4
    iget-object p2, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->b:Landroid/view/ViewGroup;

    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 16
    iget-object p2, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->f:Lcom/xuanyu/stickyheader/h;

    invoke-virtual {p2}, Lcom/xuanyu/stickyheader/h;->a()Lcom/xuanyu/stickyheader/h;

    move-result-object p2

    invoke-virtual {p2}, Lcom/xuanyu/stickyheader/h;->b()Lcom/xuanyu/stickyheader/a;

    move-result-object p2

    iget-object v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lcom/xuanyu/stickyheader/a;->createIfAbsent(Landroidx/recyclerview/widget/RecyclerView;Landroid/content/Context;)Landroid/view/View;

    move-result-object p2

    .line 17
    invoke-direct {p0, p2}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->i(Landroid/view/View;)V

    .line 18
    iget-object v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->b:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setAlpha(F)V

    .line 19
    new-instance v0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$d;

    invoke-direct {v0, p0}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$d;-><init>(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 20
    iget-object p2, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->f:Lcom/xuanyu/stickyheader/h;

    invoke-virtual {p2}, Lcom/xuanyu/stickyheader/h;->a()Lcom/xuanyu/stickyheader/h;

    move-result-object p2

    invoke-virtual {p2}, Lcom/xuanyu/stickyheader/h;->b()Lcom/xuanyu/stickyheader/a;

    move-result-object p2

    invoke-virtual {p2}, Lcom/xuanyu/stickyheader/a;->onBindView()V

    .line 21
    :goto_0
    iget-object p2, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->f:Lcom/xuanyu/stickyheader/h;

    invoke-virtual {p2}, Lcom/xuanyu/stickyheader/h;->a()Lcom/xuanyu/stickyheader/h;

    move-result-object p2

    .line 22
    iget-object v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->f:Lcom/xuanyu/stickyheader/h;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/xuanyu/stickyheader/h;->c(Lcom/xuanyu/stickyheader/h;)V

    .line 23
    iget-object v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->f:Lcom/xuanyu/stickyheader/h;

    invoke-virtual {v0}, Lcom/xuanyu/stickyheader/h;->b()Lcom/xuanyu/stickyheader/a;

    move-result-object v0

    invoke-static {v0}, Lcom/xuanyu/stickyheader/g;->b(Lcom/xuanyu/stickyheader/a;)V

    .line 24
    iput-object p2, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->f:Lcom/xuanyu/stickyheader/h;

    .line 25
    :cond_5
    invoke-static {p1}, Lcom/xuanyu/stickyheader/g;->b(Lcom/xuanyu/stickyheader/a;)V

    :goto_1
    return-void
.end method

.method private v(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 3

    const/4 p2, 0x1

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->l(Landroidx/recyclerview/widget/RecyclerView;Z)Lcom/xuanyu/stickyheader/a;

    move-result-object p2

    if-nez p2, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p2}, Lcom/xuanyu/stickyheader/a;->getRecyclerViewItemView()Landroid/view/View;

    move-result-object v0

    .line 3
    invoke-direct {p0, v0}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->m(Landroid/view/View;)I

    move-result v1

    iget v2, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->a:I

    if-ge v1, v2, :cond_2

    .line 4
    iget-object v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Lcom/xuanyu/stickyheader/a;->createIfAbsent(Landroidx/recyclerview/widget/RecyclerView;Landroid/content/Context;)Landroid/view/View;

    move-result-object p1

    .line 5
    invoke-direct {p0, p1}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->i(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->f:Lcom/xuanyu/stickyheader/h;

    if-nez p1, :cond_1

    .line 7
    iget-object p1, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->b:Landroid/view/ViewGroup;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto :goto_0

    .line 8
    :cond_1
    iget-object p1, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->b:Landroid/view/ViewGroup;

    iget v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->a:I

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getTop()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-static {p1, v0}, Landroidx/core/view/ViewCompat;->offsetTopAndBottom(Landroid/view/View;I)V

    .line 9
    :goto_0
    invoke-virtual {p2}, Lcom/xuanyu/stickyheader/a;->onBindView()V

    .line 10
    new-instance p1, Lcom/xuanyu/stickyheader/h;

    invoke-direct {p1}, Lcom/xuanyu/stickyheader/h;-><init>()V

    .line 11
    invoke-virtual {p1, p2}, Lcom/xuanyu/stickyheader/h;->d(Lcom/xuanyu/stickyheader/a;)V

    .line 12
    iget-object p2, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->f:Lcom/xuanyu/stickyheader/h;

    invoke-virtual {p1, p2}, Lcom/xuanyu/stickyheader/h;->c(Lcom/xuanyu/stickyheader/h;)V

    .line 13
    iput-object p1, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->f:Lcom/xuanyu/stickyheader/h;

    goto :goto_1

    .line 14
    :cond_2
    invoke-direct {p0, v0}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->m(Landroid/view/View;)I

    move-result p1

    iget v1, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->a:I

    iget-object v2, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->b:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result v2

    add-int/2addr v1, v2

    iget v2, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->i:I

    add-int/2addr v1, v2

    if-gt p1, v1, :cond_3

    .line 15
    invoke-direct {p0, v0}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->m(Landroid/view/View;)I

    move-result p1

    iget-object v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->b:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result v0

    sub-int/2addr p1, v0

    iget v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->i:I

    sub-int/2addr p1, v0

    .line 16
    iget v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->a:I

    iget-object v1, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->b:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result v1

    sub-int/2addr v0, v1

    iget v1, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->a:I

    invoke-static {p1, v0, v1}, Lcom/xuanyu/stickyheader/c;->c(III)I

    move-result p1

    .line 17
    iget-object v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->b:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getTop()I

    move-result v1

    sub-int/2addr p1, v1

    invoke-static {v0, p1}, Landroidx/core/view/ViewCompat;->offsetTopAndBottom(Landroid/view/View;I)V

    .line 18
    invoke-static {p2}, Lcom/xuanyu/stickyheader/g;->b(Lcom/xuanyu/stickyheader/a;)V

    goto :goto_1

    .line 19
    :cond_3
    invoke-static {p2}, Lcom/xuanyu/stickyheader/g;->b(Lcom/xuanyu/stickyheader/a;)V

    .line 20
    invoke-direct {p0}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->p()V

    :goto_1
    return-void
.end method

.method private w(Landroid/view/View;)Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    :goto_0
    iget-object v2, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->b:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 2
    iget-object v2, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->b:Landroid/view/ViewGroup;

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    if-ne v2, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method


# virtual methods
.method public j(Landroidx/recyclerview/widget/RecyclerView;FF)Landroid/view/View;
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 3
    invoke-virtual {v1}, Landroid/view/View;->getTranslationX()F

    move-result v2

    .line 4
    invoke-virtual {v1}, Landroid/view/View;->getTranslationY()F

    move-result v3

    .line 5
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v4

    int-to-float v4, v4

    add-float/2addr v4, v2

    cmpl-float v4, p2, v4

    if-ltz v4, :cond_0

    .line 6
    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    move-result v4

    int-to-float v4, v4

    add-float/2addr v4, v2

    cmpg-float v2, p2, v4

    if-gtz v2, :cond_0

    .line 7
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v2, v3

    cmpl-float v2, p3, v2

    if-ltz v2, :cond_0

    .line 8
    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v2, v3

    cmpg-float v2, p3, v2

    if-gtz v2, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public o(I)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    if-ltz p1, :cond_3

    .line 1
    iget-object v1, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->d:Lcom/xuanyu/stickyheader/e;

    invoke-static {v1, p1}, Lcom/xuanyu/stickyheader/f;->d(Lcom/xuanyu/stickyheader/e;I)Lcom/xuanyu/stickyheader/a;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    new-instance v2, Lcom/xuanyu/stickyheader/h;

    invoke-direct {v2}, Lcom/xuanyu/stickyheader/h;-><init>()V

    .line 3
    invoke-virtual {v2, v1}, Lcom/xuanyu/stickyheader/h;->d(Lcom/xuanyu/stickyheader/a;)V

    .line 4
    iget-object v1, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->f:Lcom/xuanyu/stickyheader/h;

    if-nez v1, :cond_1

    .line 5
    iput-object v2, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->f:Lcom/xuanyu/stickyheader/h;

    :cond_1
    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {v0, v2}, Lcom/xuanyu/stickyheader/h;->c(Lcom/xuanyu/stickyheader/h;)V

    :cond_2
    move-object v0, v2

    :goto_1
    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;->onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V

    if-nez p2, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->p()V

    :cond_0
    return-void
.end method

.method public onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;->onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V

    .line 2
    iget-boolean v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->g:Z

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->t(Landroidx/recyclerview/widget/RecyclerView;II)V

    return-void
.end method

.method public q()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->r()V

    return-void
.end method

.method public r()V
    .locals 3

    .line 1
    :goto_0
    iget-object v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->f:Lcom/xuanyu/stickyheader/h;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuanyu/stickyheader/h;->b()Lcom/xuanyu/stickyheader/a;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->f:Lcom/xuanyu/stickyheader/h;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/xuanyu/stickyheader/h;->d(Lcom/xuanyu/stickyheader/a;)V

    .line 4
    invoke-static {v0}, Lcom/xuanyu/stickyheader/g;->b(Lcom/xuanyu/stickyheader/a;)V

    .line 5
    iget-object v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->f:Lcom/xuanyu/stickyheader/h;

    invoke-virtual {v0}, Lcom/xuanyu/stickyheader/h;->a()Lcom/xuanyu/stickyheader/h;

    move-result-object v0

    .line 6
    iget-object v1, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->f:Lcom/xuanyu/stickyheader/h;

    invoke-virtual {v1, v2}, Lcom/xuanyu/stickyheader/h;->c(Lcom/xuanyu/stickyheader/h;)V

    .line 7
    iput-object v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->f:Lcom/xuanyu/stickyheader/h;

    goto :goto_0

    :cond_0
    return-void
.end method

.method s(I)V
    .locals 1

    int-to-float p1, p1

    .line 1
    iget-object v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->h:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float p1, p1, v0

    float-to-int p1, p1

    iput p1, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->j:I

    iput p1, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->i:I

    return-void
.end method

.method public x(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->g:Z

    if-eqz p1, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->p()V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->q()V

    .line 4
    iget-object p1, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->b:Landroid/view/ViewGroup;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    :goto_0
    return-void
.end method
