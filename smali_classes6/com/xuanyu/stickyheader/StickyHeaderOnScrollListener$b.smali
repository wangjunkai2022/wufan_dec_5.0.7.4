.class Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$b;
.super Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;
.source "StickyHeaderOnScrollListener.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;-><init>(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/ViewGroup;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;


# direct methods
.method constructor <init>(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$b;->a:Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;->onChanged()V

    return-void
.end method

.method public onItemRangeChanged(II)V
    .locals 5

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;->onItemRangeChanged(II)V

    .line 2
    iget-object p1, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$b;->a:Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;

    invoke-static {p1}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->c(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getItemAnimator()Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;

    move-result-object p1

    .line 3
    iget-object p2, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$b;->a:Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;

    invoke-static {p2}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->d(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;)Z

    move-result p2

    if-eqz p2, :cond_0

    if-eqz p1, :cond_0

    .line 4
    iget-object p2, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$b;->a:Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;

    invoke-static {p2}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->f(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;)Landroid/os/Handler;

    move-result-object p2

    iget-object v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$b;->a:Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;

    invoke-static {v0}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->e(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;)Ljava/lang/Runnable;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;->getChangeDuration()J

    move-result-wide v1

    const-wide/16 v3, 0x64

    add-long/2addr v1, v3

    invoke-virtual {p2, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public onItemRangeChanged(IILjava/lang/Object;)V
    .locals 4
    .param p3    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 5
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;->onItemRangeChanged(IILjava/lang/Object;)V

    .line 6
    iget-object p1, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$b;->a:Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;

    invoke-static {p1}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->c(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getItemAnimator()Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;

    move-result-object p1

    .line 7
    iget-object p2, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$b;->a:Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;

    invoke-static {p2}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->d(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;)Z

    move-result p2

    if-eqz p2, :cond_0

    if-eqz p1, :cond_0

    .line 8
    iget-object p2, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$b;->a:Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;

    invoke-static {p2}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->f(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;)Landroid/os/Handler;

    move-result-object p2

    iget-object p3, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$b;->a:Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;

    invoke-static {p3}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->e(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;)Ljava/lang/Runnable;

    move-result-object p3

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;->getChangeDuration()J

    move-result-wide v0

    const-wide/16 v2, 0x64

    add-long/2addr v0, v2

    invoke-virtual {p2, p3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public onItemRangeInserted(II)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$b;->a:Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;

    invoke-static {v0}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->c(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getItemAnimator()Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$b;->a:Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;

    invoke-static {v1}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->d(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;)Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$b;->a:Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;

    invoke-static {v1}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->f(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;)Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$b;->a:Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;

    invoke-static {v2}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->e(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;)Ljava/lang/Runnable;

    move-result-object v2

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;->getAddDuration()J

    move-result-wide v3

    const-wide/16 v5, 0x64

    add-long/2addr v3, v5

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 4
    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;->onItemRangeInserted(II)V

    return-void
.end method

.method public onItemRangeMoved(III)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$b;->a:Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;

    invoke-static {v0}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->c(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getItemAnimator()Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$b;->a:Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;

    invoke-static {v1}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->d(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;)Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$b;->a:Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;

    invoke-static {v1}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->f(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;)Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$b;->a:Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;

    invoke-static {v2}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->e(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;)Ljava/lang/Runnable;

    move-result-object v2

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;->getMoveDuration()J

    move-result-wide v3

    const-wide/16 v5, 0x64

    add-long/2addr v3, v5

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 4
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;->onItemRangeMoved(III)V

    return-void
.end method

.method public onItemRangeRemoved(II)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$b;->a:Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;

    invoke-static {v0}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->c(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getItemAnimator()Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$b;->a:Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;

    invoke-static {v1}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->d(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;)Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$b;->a:Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;

    invoke-static {v1}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->f(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;)Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$b;->a:Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;

    invoke-static {v2}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->e(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;)Ljava/lang/Runnable;

    move-result-object v2

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;->getRemoveDuration()J

    move-result-wide v3

    const-wide/16 v5, 0x12c

    add-long/2addr v3, v5

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 4
    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;->onItemRangeRemoved(II)V

    return-void
.end method
