.class Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$c;
.super Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
.source "PapaMainV4SubHomeFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->afterViews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$c;->a:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;-><init>()V

    return-void
.end method


# virtual methods
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
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$c;->a:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;

    invoke-virtual {p1}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->r0()V

    :cond_0
    return-void
.end method

.method public onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;->onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$c;->a:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;

    iget-object p2, p1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->b:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-virtual {p2}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->getLastVisiblePosition()I

    move-result p2

    invoke-static {p1, p2}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->e0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;I)I

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$c;->a:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;

    iget-object p2, p1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->b:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-virtual {p2}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->getFirstVisiblePosition()I

    move-result p2

    invoke-static {p1, p2}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->f0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;I)I

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$c;->a:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;

    invoke-static {p1}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->g0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;)V

    .line 5
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    move-result p1

    if-lez p1, :cond_1

    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$c;->a:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;

    iget-object p1, p1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->b:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-virtual {p1}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->getLastCompletelyVisiblePosition()I

    move-result p1

    iget-object p2, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$c;->a:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;

    invoke-static {p2}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->X(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;)Lcom/join/mgps/adapter/PapaMainV4Adapter;

    move-result-object p2

    invoke-virtual {p2}, Lcom/join/mgps/base/BaseQuickAdapter;->getData()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    if-lt p1, p2, :cond_0

    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$c;->a:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;

    invoke-static {p1}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->h0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 6
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$c;->a:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;

    invoke-virtual {p1}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->s0()V

    :cond_1
    return-void
.end method
