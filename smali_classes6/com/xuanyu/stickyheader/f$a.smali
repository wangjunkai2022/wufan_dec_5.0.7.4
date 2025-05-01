.class Lcom/xuanyu/stickyheader/f$a;
.super Ljava/lang/Object;
.source "StickyHeaderHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuanyu/stickyheader/f;->c(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/ViewGroup;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/view/ViewGroup;

.field final synthetic c:Landroidx/recyclerview/widget/RecyclerView;

.field final synthetic d:I


# direct methods
.method constructor <init>(Landroid/view/ViewGroup;Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuanyu/stickyheader/f$a;->b:Landroid/view/ViewGroup;

    iput-object p2, p0, Lcom/xuanyu/stickyheader/f$a;->c:Landroidx/recyclerview/widget/RecyclerView;

    iput p3, p0, Lcom/xuanyu/stickyheader/f$a;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuanyu/stickyheader/f$a;->b:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getTop()I

    move-result v0

    .line 2
    new-instance v1, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;

    iget-object v2, p0, Lcom/xuanyu/stickyheader/f$a;->c:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v3, p0, Lcom/xuanyu/stickyheader/f$a;->b:Landroid/view/ViewGroup;

    invoke-direct {v1, v2, v3, v0}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;-><init>(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/ViewGroup;I)V

    .line 3
    iget v0, p0, Lcom/xuanyu/stickyheader/f$a;->d:I

    invoke-virtual {v1, v0}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->s(I)V

    .line 4
    invoke-static {}, Lcom/xuanyu/stickyheader/f;->a()Ljava/util/WeakHashMap;

    move-result-object v0

    iget-object v2, p0, Lcom/xuanyu/stickyheader/f$a;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v2, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    iget-object v0, p0, Lcom/xuanyu/stickyheader/f$a;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

    return-void
.end method
