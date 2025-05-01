.class Lcom/join/mgps/activity/UninstallWufunActivity$b;
.super Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
.source "UninstallWufunActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/UninstallWufunActivity;->afterviews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/UninstallWufunActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/UninstallWufunActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/UninstallWufunActivity$b;->a:Lcom/join/mgps/activity/UninstallWufunActivity;

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
    iget-object p1, p0, Lcom/join/mgps/activity/UninstallWufunActivity$b;->a:Lcom/join/mgps/activity/UninstallWufunActivity;

    iget-object p1, p1, Lcom/join/mgps/activity/UninstallWufunActivity;->p:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/UninstallWufunActivity$b;->a:Lcom/join/mgps/activity/UninstallWufunActivity;

    iget-object p1, p1, Lcom/join/mgps/activity/UninstallWufunActivity;->p:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 4
    iget-object p2, p0, Lcom/join/mgps/activity/UninstallWufunActivity$b;->a:Lcom/join/mgps/activity/UninstallWufunActivity;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    move-result p3

    invoke-static {p2, p3}, Lcom/join/mgps/activity/UninstallWufunActivity;->f0(Lcom/join/mgps/activity/UninstallWufunActivity;I)I

    .line 5
    iget-object p2, p0, Lcom/join/mgps/activity/UninstallWufunActivity$b;->a:Lcom/join/mgps/activity/UninstallWufunActivity;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    move-result p1

    invoke-static {p2, p1}, Lcom/join/mgps/activity/UninstallWufunActivity;->g0(Lcom/join/mgps/activity/UninstallWufunActivity;I)I

    :cond_0
    return-void
.end method
