.class final Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$a;
.super Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;
.source "QuickGridLayoutManager.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private a:Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field final synthetic b:Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager;


# direct methods
.method public constructor <init>(Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$a;->b:Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager;

    invoke-direct {p0}, Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$a;->a:Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;

    return-object v0
.end method

.method public final b(Landroidx/recyclerview/widget/RecyclerView$Adapter;I)I
    .locals 2
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$Adapter;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
            "*>;I)I"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lx/a;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$a;->b:Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager;->getSpanCount()I

    move-result v1

    goto :goto_0

    .line 3
    :cond_0
    instance-of v0, p1, Lcom/chad/library/adapter/base/BaseQuickAdapter;

    if-eqz v0, :cond_2

    .line 4
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemViewType(I)I

    move-result v0

    .line 5
    check-cast p1, Lcom/chad/library/adapter/base/BaseQuickAdapter;

    invoke-virtual {p1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->isFullSpanItem(I)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 6
    iget-object p1, p0, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$a;->b:Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager;->getSpanCount()I

    move-result v1

    goto :goto_0

    .line 7
    :cond_1
    iget-object p1, p0, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$a;->a:Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;

    if-eqz p1, :cond_3

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;->getSpanSize(I)I

    move-result v1

    goto :goto_0

    .line 8
    :cond_2
    iget-object p1, p0, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$a;->a:Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;

    if-eqz p1, :cond_3

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;->getSpanSize(I)I

    move-result v1

    :cond_3
    :goto_0
    return v1
.end method

.method public final c(Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;)V
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$a;->a:Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;

    return-void
.end method

.method public getSpanSize(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$a;->b:Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager;

    invoke-static {v0}, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager;->a(Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager;)Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 2
    :cond_0
    instance-of v1, v0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$WrapAdapter;

    if-eqz v1, :cond_1

    .line 3
    check-cast v0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$WrapAdapter;

    invoke-virtual {v0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$WrapAdapter;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$a;->b(Landroidx/recyclerview/widget/RecyclerView$Adapter;I)I

    move-result p1

    goto :goto_0

    .line 4
    :cond_1
    invoke-virtual {p0, v0, p1}, Lcom/chad/library/adapter/base/layoutmanager/QuickGridLayoutManager$a;->b(Landroidx/recyclerview/widget/RecyclerView$Adapter;I)I

    move-result p1

    :goto_0
    return p1
.end method
