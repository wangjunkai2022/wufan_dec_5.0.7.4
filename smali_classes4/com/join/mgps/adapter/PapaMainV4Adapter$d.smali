.class Lcom/join/mgps/adapter/PapaMainV4Adapter$d;
.super Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
.source "PapaMainV4Adapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/PapaMainV4Adapter;->B(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CommonMultiItemBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/recyclerview/widget/RecyclerView;

.field final synthetic b:Ljava/util/List;

.field final synthetic c:Lcom/join/mgps/adapter/PapaMainV4Adapter;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/PapaMainV4Adapter;Landroidx/recyclerview/widget/RecyclerView;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter$d;->c:Lcom/join/mgps/adapter/PapaMainV4Adapter;

    iput-object p2, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter$d;->a:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p3, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter$d;->b:Ljava/util/List;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;->onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter$d;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastCompletelyVisibleItemPosition()I

    move-result p1

    .line 4
    iget-object p2, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter$d;->c:Lcom/join/mgps/adapter/PapaMainV4Adapter;

    invoke-static {p2}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->v(Lcom/join/mgps/adapter/PapaMainV4Adapter;)Lcom/join/mgps/adapter/PapaMainV4Adapter$e;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 5
    iget-object p2, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter$d;->c:Lcom/join/mgps/adapter/PapaMainV4Adapter;

    invoke-static {p2}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->v(Lcom/join/mgps/adapter/PapaMainV4Adapter;)Lcom/join/mgps/adapter/PapaMainV4Adapter$e;

    move-result-object p2

    iget-object v0, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter$d;->b:Ljava/util/List;

    invoke-interface {p2, v0, p1}, Lcom/join/mgps/adapter/PapaMainV4Adapter$e;->z(Ljava/util/List;I)V

    :cond_0
    return-void
.end method
