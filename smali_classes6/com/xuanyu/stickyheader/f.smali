.class public Lcom/xuanyu/stickyheader/f;
.super Ljava/lang/Object;
.source "StickyHeaderHelper.java"


# static fields
.field private static a:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Landroidx/recyclerview/widget/RecyclerView;",
            "Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Lcom/xuanyu/stickyheader/f;->a:Ljava/util/WeakHashMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a()Ljava/util/WeakHashMap;
    .locals 1

    .line 1
    sget-object v0, Lcom/xuanyu/stickyheader/f;->a:Ljava/util/WeakHashMap;

    return-object v0
.end method

.method public static b(Landroidx/recyclerview/widget/RecyclerView;ILandroid/view/ViewGroup;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/recyclerview/widget/RecyclerView;",
            "I",
            "Landroid/view/ViewGroup;",
            ")V"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/xuanyu/stickyheader/f;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;

    invoke-direct {v0, p0, p2, p1}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;-><init>(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/ViewGroup;I)V

    .line 3
    sget-object p1, Lcom/xuanyu/stickyheader/f;->a:Ljava/util/WeakHashMap;

    invoke-virtual {p1, p0, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

    :cond_0
    return-void
.end method

.method public static c(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/ViewGroup;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/recyclerview/widget/RecyclerView;",
            "Landroid/view/ViewGroup;",
            "I)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/xuanyu/stickyheader/f;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/xuanyu/stickyheader/f$a;

    invoke-direct {v0, p1, p0, p2}, Lcom/xuanyu/stickyheader/f$a;-><init>(Landroid/view/ViewGroup;Landroidx/recyclerview/widget/RecyclerView;I)V

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public static d(Lcom/xuanyu/stickyheader/e;I)Lcom/xuanyu/stickyheader/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/xuanyu/stickyheader/e<",
            "TT;>;I)",
            "Lcom/xuanyu/stickyheader/a<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-interface {p0, p1}, Lcom/xuanyu/stickyheader/e;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 2
    invoke-interface {p0, p1}, Lcom/xuanyu/stickyheader/e;->a(I)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0}, Lcom/xuanyu/stickyheader/i;->c(Ljava/lang/Class;)Z

    .line 4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0}, Lcom/xuanyu/stickyheader/i;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p0

    if-nez p0, :cond_1

    return-object v1

    .line 5
    :cond_1
    invoke-static {p0}, Lcom/xuanyu/stickyheader/g;->a(Ljava/lang/Class;)Lcom/xuanyu/stickyheader/a;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 6
    invoke-virtual {p0, v0}, Lcom/xuanyu/stickyheader/a;->setRecyclerViewItemModel(Ljava/lang/Object;)V

    :cond_2
    return-object p0

    :cond_3
    :goto_0
    return-object v1
.end method

.method public static e(ZLandroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/xuanyu/stickyheader/f;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p1, p0}, Lcom/xuanyu/stickyheader/StickyHeaderOnScrollListener;->x(Z)V

    return-void
.end method
