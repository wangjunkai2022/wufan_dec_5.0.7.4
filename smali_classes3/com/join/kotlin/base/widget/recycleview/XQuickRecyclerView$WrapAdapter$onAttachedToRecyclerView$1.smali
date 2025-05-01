.class public final Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$WrapAdapter$onAttachedToRecyclerView$1;
.super Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;
.source "XQuickRecyclerView.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$WrapAdapter;->onAttachedToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $gridManager:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

.field final synthetic this$0:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$WrapAdapter;


# direct methods
.method constructor <init>(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$WrapAdapter;Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$WrapAdapter$onAttachedToRecyclerView$1;->this$0:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$WrapAdapter;

    iput-object p2, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$WrapAdapter$onAttachedToRecyclerView$1;->$gridManager:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;-><init>()V

    return-void
.end method


# virtual methods
.method public getSpanSize(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$WrapAdapter$onAttachedToRecyclerView$1;->this$0:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$WrapAdapter;

    invoke-virtual {v0, p1}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$WrapAdapter;->isHeader(I)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$WrapAdapter$onAttachedToRecyclerView$1;->this$0:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$WrapAdapter;

    invoke-virtual {v0, p1}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$WrapAdapter;->isFooter(I)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$WrapAdapter$onAttachedToRecyclerView$1;->this$0:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$WrapAdapter;

    invoke-virtual {v0, p1}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$WrapAdapter;->isRefreshHeader(I)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    goto :goto_1

    .line 2
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$WrapAdapter$onAttachedToRecyclerView$1;->$gridManager:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    check-cast p1, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager;->getSpanCount()I

    move-result p1

    :goto_1
    return p1
.end method
