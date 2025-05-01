.class Lcom/join/mgps/activity/CollectionModuleSevenActivity$a;
.super Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
.source "CollectionModuleSevenActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/CollectionModuleSevenActivity;->afterviews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/CollectionModuleSevenActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/CollectionModuleSevenActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/CollectionModuleSevenActivity$a;->a:Lcom/join/mgps/activity/CollectionModuleSevenActivity;

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
    iget-object p1, p0, Lcom/join/mgps/activity/CollectionModuleSevenActivity$a;->a:Lcom/join/mgps/activity/CollectionModuleSevenActivity;

    invoke-virtual {p1}, Lcom/join/mgps/activity/CollectionModuleSevenActivity;->autoPlay()V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/CollectionModuleSevenActivity$a;->a:Lcom/join/mgps/activity/CollectionModuleSevenActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/CollectionModuleSevenActivity;->h0(Lcom/join/mgps/activity/CollectionModuleSevenActivity;)V

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
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    if-eqz p1, :cond_0

    .line 3
    iget-object p2, p0, Lcom/join/mgps/activity/CollectionModuleSevenActivity$a;->a:Lcom/join/mgps/activity/CollectionModuleSevenActivity;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    move-result p3

    invoke-static {p2, p3}, Lcom/join/mgps/activity/CollectionModuleSevenActivity;->i0(Lcom/join/mgps/activity/CollectionModuleSevenActivity;I)I

    .line 4
    iget-object p2, p0, Lcom/join/mgps/activity/CollectionModuleSevenActivity$a;->a:Lcom/join/mgps/activity/CollectionModuleSevenActivity;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    move-result p1

    invoke-static {p2, p1}, Lcom/join/mgps/activity/CollectionModuleSevenActivity;->j0(Lcom/join/mgps/activity/CollectionModuleSevenActivity;I)I

    :cond_0
    return-void
.end method
