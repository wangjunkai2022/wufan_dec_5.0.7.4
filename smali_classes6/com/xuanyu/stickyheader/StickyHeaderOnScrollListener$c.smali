.class Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$c;
.super Ljava/lang/Object;
.source "StickyHeaderOnScrollListener.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;-><init>(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/ViewGroup;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;


# direct methods
.method constructor <init>(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$c;->b:Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$c;->b:Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;

    invoke-static {v0}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->d(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$c;->b:Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;

    invoke-static {v0}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->b(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;)V

    :cond_0
    return-void
.end method
