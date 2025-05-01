.class Lcom/join/mgps/fragment/SearchGameListFragment$a;
.super Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
.source "SearchGameListFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/SearchGameListFragment;->afterViews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/fragment/SearchGameListFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/SearchGameListFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment$a;->a:Lcom/join/mgps/fragment/SearchGameListFragment;

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

    if-nez p2, :cond_1

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment$a;->a:Lcom/join/mgps/fragment/SearchGameListFragment;

    iget-object p1, p1, Lcom/join/mgps/fragment/SearchGameListFragment;->j:Lcom/join/android/app/component/video/g;

    if-eqz p1, :cond_0

    const/4 p2, 0x2

    .line 3
    invoke-virtual {p1, p2}, Lcom/join/android/app/component/video/g;->g(I)V

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment$a;->a:Lcom/join/mgps/fragment/SearchGameListFragment;

    invoke-static {p1}, Lcom/join/mgps/fragment/SearchGameListFragment;->Z(Lcom/join/mgps/fragment/SearchGameListFragment;)V

    :cond_1
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
    iget-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment$a;->a:Lcom/join/mgps/fragment/SearchGameListFragment;

    iget-object p2, p1, Lcom/join/mgps/fragment/SearchGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    invoke-virtual {p2}, Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;->getLastVisiblePosition()I

    move-result p2

    invoke-static {p1, p2}, Lcom/join/mgps/fragment/SearchGameListFragment;->W(Lcom/join/mgps/fragment/SearchGameListFragment;I)I

    .line 3
    iget-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment$a;->a:Lcom/join/mgps/fragment/SearchGameListFragment;

    iget-object p2, p1, Lcom/join/mgps/fragment/SearchGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    invoke-virtual {p2}, Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;->getFirstVisiblePosition()I

    move-result p2

    invoke-static {p1, p2}, Lcom/join/mgps/fragment/SearchGameListFragment;->X(Lcom/join/mgps/fragment/SearchGameListFragment;I)I

    return-void
.end method
