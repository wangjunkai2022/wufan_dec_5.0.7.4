.class Lcom/join/mgps/activity/DiscoveryPaiweiActivity$e;
.super Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
.source "DiscoveryPaiweiActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/DiscoveryPaiweiActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/DiscoveryPaiweiActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$e;->a:Lcom/join/mgps/activity/DiscoveryPaiweiActivity;

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
    iget-object p1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$e;->a:Lcom/join/mgps/activity/DiscoveryPaiweiActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->i0(Lcom/join/mgps/activity/DiscoveryPaiweiActivity;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$e;->a:Lcom/join/mgps/activity/DiscoveryPaiweiActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->f0(Lcom/join/mgps/activity/DiscoveryPaiweiActivity;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$e;->a:Lcom/join/mgps/activity/DiscoveryPaiweiActivity;

    iget-object p1, p1, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 4
    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastCompletelyVisibleItemPosition()I

    move-result p1

    .line 5
    iget-object p2, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$e;->a:Lcom/join/mgps/activity/DiscoveryPaiweiActivity;

    invoke-static {p2}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->j0(Lcom/join/mgps/activity/DiscoveryPaiweiActivity;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    add-int/lit8 p2, p2, -0x3

    if-lt p1, p2, :cond_0

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$e;->a:Lcom/join/mgps/activity/DiscoveryPaiweiActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->k0(Lcom/join/mgps/activity/DiscoveryPaiweiActivity;)I

    .line 7
    iget-object p1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$e;->a:Lcom/join/mgps/activity/DiscoveryPaiweiActivity;

    invoke-virtual {p1}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->l0()V

    :cond_0
    return-void
.end method
