.class public abstract Lcom/xuanyu/stickyheader/a;
.super Ljava/lang/Object;
.source "BaseStickyHeaderModel.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private mRecyclerViewItemModel:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private mRecyclerViewItemView:Landroid/view/View;

.field private mStickyView:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method createIfAbsent(Landroidx/recyclerview/widget/RecyclerView;Landroid/content/Context;)Landroid/view/View;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuanyu/stickyheader/a;->mRecyclerViewItemModel:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 2
    invoke-static {p1, v0}, Lcom/xuanyu/stickyheader/i;->b(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/Class;)Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_0

    .line 3
    invoke-virtual {p0, p2}, Lcom/xuanyu/stickyheader/a;->getStickyView(Landroid/content/Context;)Landroid/view/View;

    move-result-object v1

    .line 4
    invoke-static {p1, v0, v1}, Lcom/xuanyu/stickyheader/i;->e(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/Class;Landroid/view/View;)V

    .line 5
    :cond_0
    iput-object v1, p0, Lcom/xuanyu/stickyheader/a;->mStickyView:Landroid/view/View;

    return-object v1
.end method

.method public getRecyclerViewItemModel()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuanyu/stickyheader/a;->mRecyclerViewItemModel:Ljava/lang/Object;

    return-object v0
.end method

.method public getRecyclerViewItemView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuanyu/stickyheader/a;->mRecyclerViewItemView:Landroid/view/View;

    return-object v0
.end method

.method public abstract getStickyView(Landroid/content/Context;)Landroid/view/View;
.end method

.method onBindView()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuanyu/stickyheader/a;->mStickyView:Landroid/view/View;

    instance-of v1, v0, Lcom/xuanyu/stickyheader/b;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Lcom/xuanyu/stickyheader/b;

    invoke-virtual {p0}, Lcom/xuanyu/stickyheader/a;->getRecyclerViewItemModel()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/xuanyu/stickyheader/b;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/xuanyu/stickyheader/a;->getRecyclerViewItemModel()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/xuanyu/stickyheader/a;->onBindView(Landroid/view/View;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public abstract onBindView(Landroid/view/View;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "TT;)V"
        }
    .end annotation
.end method

.method setRecyclerViewItemModel(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/xuanyu/stickyheader/a;->mRecyclerViewItemModel:Ljava/lang/Object;

    return-void
.end method

.method public setRecyclerViewItemView(Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuanyu/stickyheader/a;->mRecyclerViewItemView:Landroid/view/View;

    return-void
.end method
