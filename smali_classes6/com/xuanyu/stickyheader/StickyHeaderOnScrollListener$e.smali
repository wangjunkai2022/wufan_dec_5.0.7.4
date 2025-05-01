.class Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$e;
.super Ljava/lang/Object;
.source "StickyHeaderOnScrollListener.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;


# direct methods
.method constructor <init>(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$e;->c:Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;

    iput p2, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$e;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$e;->c:Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;

    invoke-static {v0}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->g(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;)Landroid/view/ViewGroup;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setAlpha(F)V

    .line 2
    iget-object v0, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$e;->c:Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;

    invoke-static {v0}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->g(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;)Landroid/view/ViewGroup;

    move-result-object v0

    iget v1, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$e;->b:I

    iget-object v2, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$e;->c:Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;

    invoke-static {v2}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->h(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;)I

    move-result v2

    add-int/2addr v1, v2

    iget-object v2, p0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener$e;->c:Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;

    invoke-static {v2}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->g(Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;)Landroid/view/ViewGroup;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getTop()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-static {v0, v1}, Landroidx/core/view/ViewCompat;->offsetTopAndBottom(Landroid/view/View;I)V

    return-void
.end method
