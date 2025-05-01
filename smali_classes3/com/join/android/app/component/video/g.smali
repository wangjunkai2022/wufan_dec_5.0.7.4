.class public Lcom/join/android/app/component/video/g;
.super Ljava/lang/Object;
.source "RvListVideoHelper.java"


# static fields
.field private static i:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lcom/join/android/app/component/video/b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field a:Ljava/lang/String;

.field b:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

.field c:I

.field d:I

.field e:I

.field f:Landroidx/recyclerview/widget/RecyclerView;

.field g:I

.field h:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lcom/join/android/app/component/video/g;->i:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    .line 2
    iput-object v0, p0, Lcom/join/android/app/component/video/g;->a:Ljava/lang/String;

    .line 3
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/join/android/app/component/video/g;->h:Landroid/os/Handler;

    .line 4
    iput-object p2, p0, Lcom/join/android/app/component/video/g;->a:Ljava/lang/String;

    .line 5
    iput-object p1, p0, Lcom/join/android/app/component/video/g;->f:Landroidx/recyclerview/widget/RecyclerView;

    return-void
.end method

.method public static B(Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/join/android/app/component/video/g;->i:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic a(Lcom/join/android/app/component/video/MultiStandVideo;)V
    .locals 0

    invoke-static {p0}, Lcom/join/android/app/component/video/g;->r(Lcom/join/android/app/component/video/MultiStandVideo;)V

    return-void
.end method

.method public static synthetic b(Lcom/join/android/app/component/video/MultiStandVideo;)V
    .locals 0

    invoke-static {p0}, Lcom/join/android/app/component/video/g;->q(Lcom/join/android/app/component/video/MultiStandVideo;)V

    return-void
.end method

.method public static synthetic c(Lcom/join/android/app/component/video/MultiStandVideo;)V
    .locals 0

    invoke-static {p0}, Lcom/join/android/app/component/video/g;->s(Lcom/join/android/app/component/video/MultiStandVideo;)V

    return-void
.end method

.method public static h(Ljava/lang/String;)V
    .locals 4

    .line 1
    :try_start_0
    sget-object v0, Lcom/join/android/app/component/video/g;->i:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 3
    sget-object v1, Lcom/join/android/app/component/video/g;->i:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 4
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/android/app/component/video/b;

    invoke-virtual {v3}, Lcom/papa/gsyvideoplayer/c;->o()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 5
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/android/app/component/video/b;

    invoke-virtual {v3}, Lcom/join/android/app/component/video/b;->i0()V

    .line 6
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 7
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p0

    if-lez p0, :cond_2

    .line 8
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 9
    invoke-static {v0}, Lcom/join/android/app/component/video/g;->B(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_2
    return-void
.end method

.method private static i([I)I
    .locals 4

    const/4 v0, 0x0

    .line 1
    aget v1, p0, v0

    .line 2
    array-length v2, p0

    :goto_0
    if-ge v0, v2, :cond_1

    aget v3, p0, v0

    if-le v3, v1, :cond_0

    move v1, v3

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method private static j([I)I
    .locals 4

    const/4 v0, 0x0

    .line 1
    aget v1, p0, v0

    .line 2
    array-length v2, p0

    :goto_0
    if-ge v0, v2, :cond_1

    aget v3, p0, v0

    if-ge v3, v1, :cond_0

    move v1, v3

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public static k(Landroidx/recyclerview/widget/RecyclerView;)I
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 1
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object p0

    .line 2
    instance-of v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;

    if-eqz v0, :cond_1

    .line 3
    check-cast p0, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstCompletelyVisibleItemPosition()I

    move-result p0

    goto :goto_0

    .line 4
    :cond_1
    instance-of v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    if-eqz v0, :cond_2

    .line 5
    check-cast p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->getSpanCount()I

    move-result v0

    new-array v0, v0, [I

    .line 6
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->findFirstCompletelyVisibleItemPositions([I)[I

    .line 7
    invoke-static {v0}, Lcom/join/android/app/component/video/g;->j([I)I

    move-result p0

    goto :goto_0

    .line 8
    :cond_2
    check-cast p0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstCompletelyVisibleItemPosition()I

    move-result p0

    :goto_0
    return p0
.end method

.method public static l(Landroidx/recyclerview/widget/RecyclerView;)I
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 1
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object p0

    .line 2
    instance-of v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;

    if-eqz v0, :cond_1

    .line 3
    check-cast p0, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    move-result p0

    goto :goto_0

    .line 4
    :cond_1
    instance-of v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    if-eqz v0, :cond_2

    .line 5
    check-cast p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->getSpanCount()I

    move-result v0

    new-array v0, v0, [I

    .line 6
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->findFirstVisibleItemPositions([I)[I

    .line 7
    invoke-static {v0}, Lcom/join/android/app/component/video/g;->j([I)I

    move-result p0

    goto :goto_0

    .line 8
    :cond_2
    check-cast p0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    move-result p0

    :goto_0
    return p0
.end method

.method public static m(Landroidx/recyclerview/widget/RecyclerView;)I
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 1
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object p0

    .line 2
    instance-of v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;

    if-eqz v0, :cond_1

    .line 3
    check-cast p0, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastCompletelyVisibleItemPosition()I

    move-result p0

    goto :goto_0

    .line 4
    :cond_1
    instance-of v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    if-eqz v0, :cond_2

    .line 5
    check-cast p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->getSpanCount()I

    move-result v0

    new-array v0, v0, [I

    .line 6
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->findLastCompletelyVisibleItemPositions([I)[I

    .line 7
    invoke-static {v0}, Lcom/join/android/app/component/video/g;->i([I)I

    move-result p0

    goto :goto_0

    .line 8
    :cond_2
    check-cast p0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastCompletelyVisibleItemPosition()I

    move-result p0

    :goto_0
    return p0
.end method

.method public static n(Landroidx/recyclerview/widget/RecyclerView;)I
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 1
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object p0

    .line 2
    instance-of v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;

    if-eqz v0, :cond_1

    .line 3
    check-cast p0, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    move-result p0

    goto :goto_0

    .line 4
    :cond_1
    instance-of v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    if-eqz v0, :cond_2

    .line 5
    check-cast p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->getSpanCount()I

    move-result v0

    new-array v0, v0, [I

    .line 6
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->findLastVisibleItemPositions([I)[I

    .line 7
    invoke-static {v0}, Lcom/join/android/app/component/video/g;->i([I)I

    move-result p0

    goto :goto_0

    .line 8
    :cond_2
    check-cast p0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    move-result p0

    :goto_0
    return p0
.end method

.method public static o(Ljava/lang/String;Ljava/lang/String;IZ)Lcom/join/android/app/component/video/b;
    .locals 8

    .line 1
    sget-object v0, Lcom/join/android/app/component/video/g;->i:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/component/video/b;

    if-nez v0, :cond_0

    if-eqz p3, :cond_0

    .line 2
    new-instance v0, Lcom/join/android/app/component/video/b;

    invoke-direct {v0}, Lcom/join/android/app/component/video/b;-><init>()V

    .line 3
    invoke-virtual {v0, p2}, Lcom/papa/gsyvideoplayer/c;->v(I)V

    .line 4
    invoke-virtual {v0, p1}, Lcom/papa/gsyvideoplayer/c;->j(Ljava/lang/String;)V

    .line 5
    new-instance p1, Lcom/papa/gsyvideoplayer/model/c;

    const/4 p2, 0x4

    const-string p3, "enable-accurate-seek"

    const/4 v1, 0x1

    invoke-direct {p1, p2, p3, v1}, Lcom/papa/gsyvideoplayer/model/c;-><init>(ILjava/lang/String;I)V

    .line 6
    new-instance p3, Lcom/papa/gsyvideoplayer/model/c;

    const-string v2, "analyzeduration"

    invoke-direct {p3, v1, v2, v1}, Lcom/papa/gsyvideoplayer/model/c;-><init>(ILjava/lang/String;I)V

    .line 7
    new-instance v2, Lcom/papa/gsyvideoplayer/model/c;

    const/16 v3, 0x1e

    const-string v4, "analyzemaxduration"

    invoke-direct {v2, v1, v4, v3}, Lcom/papa/gsyvideoplayer/model/c;-><init>(ILjava/lang/String;I)V

    .line 8
    new-instance v3, Lcom/papa/gsyvideoplayer/model/c;

    const/4 v4, 0x2

    const/16 v5, 0x30

    const-string v6, "skip_loop_filter"

    invoke-direct {v3, v4, v6, v5}, Lcom/papa/gsyvideoplayer/model/c;-><init>(ILjava/lang/String;I)V

    .line 9
    new-instance v3, Lcom/papa/gsyvideoplayer/model/c;

    const/4 v4, 0x0

    const-string v5, "packet-buffering"

    invoke-direct {v3, p2, v5, v4}, Lcom/papa/gsyvideoplayer/model/c;-><init>(ILjava/lang/String;I)V

    .line 10
    new-instance v4, Lcom/papa/gsyvideoplayer/model/c;

    const-string v5, "framedrop"

    invoke-direct {v4, p2, v5, v1}, Lcom/papa/gsyvideoplayer/model/c;-><init>(ILjava/lang/String;I)V

    .line 11
    new-instance p2, Lcom/papa/gsyvideoplayer/model/c;

    const-string v5, "dns_cache_clear"

    invoke-direct {p2, v1, v5, v1}, Lcom/papa/gsyvideoplayer/model/c;-><init>(ILjava/lang/String;I)V

    .line 12
    new-instance v5, Lcom/papa/gsyvideoplayer/model/c;

    const-string v6, "protocol_whitelist"

    const-string v7, "crypto,file,http,https,tcp,tls,udp"

    invoke-direct {v5, v1, v6, v7}, Lcom/papa/gsyvideoplayer/model/c;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 13
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    invoke-interface {v1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 18
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 19
    invoke-interface {v1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 20
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    invoke-virtual {v0, v1}, Lcom/papa/gsyvideoplayer/c;->X(Ljava/util/List;)V

    .line 22
    sget-object p1, Lcom/join/android/app/component/video/g;->i:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1, p0, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method private static synthetic q(Lcom/join/android/app/component/video/MultiStandVideo;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/join/android/app/component/video/MultiStandVideo;->startPlayLogic()V

    return-void
.end method

.method private static synthetic r(Lcom/join/android/app/component/video/MultiStandVideo;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/join/android/app/component/video/MultiStandVideo;->startPlayLogic()V

    return-void
.end method

.method private static synthetic s(Lcom/join/android/app/component/video/MultiStandVideo;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/join/android/app/component/video/MultiStandVideo;->startPlayLogic()V

    return-void
.end method

.method public static v(Ljava/lang/String;)V
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, Lcom/join/android/app/component/video/g;->i:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 2
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 3
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 4
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/android/app/component/video/b;

    invoke-virtual {v2}, Lcom/papa/gsyvideoplayer/c;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 5
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/android/app/component/video/b;

    invoke-virtual {v1}, Lcom/join/android/app/component/video/b;->f0()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 6
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    return-void
.end method

.method public static x(Ljava/lang/String;)V
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, Lcom/join/android/app/component/video/g;->i:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 2
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 3
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 4
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/android/app/component/video/b;

    invoke-virtual {v2}, Lcom/papa/gsyvideoplayer/c;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 5
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/android/app/component/video/b;

    invoke-virtual {v1}, Lcom/join/android/app/component/video/b;->g0()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 6
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    return-void
.end method

.method public static y(Ljava/lang/String;Z)V
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, Lcom/join/android/app/component/video/g;->i:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 2
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 3
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 4
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/android/app/component/video/b;

    invoke-virtual {v2}, Lcom/papa/gsyvideoplayer/c;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 5
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/android/app/component/video/b;

    invoke-virtual {v1, p1}, Lcom/join/android/app/component/video/b;->h0(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 6
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    return-void
.end method


# virtual methods
.method public A()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/android/app/component/video/g;->g:I

    invoke-virtual {p0, v0}, Lcom/join/android/app/component/video/g;->g(I)V

    return-void
.end method

.method public d(Z)Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p1, :cond_3

    .line 1
    invoke-static {}, Lcom/MApplication;->j()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/pref/h;->n(Landroid/content/Context;)Lcom/join/mgps/pref/h;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/pref/h;->e()I

    move-result p1

    if-eq p1, v1, :cond_1

    const/4 v2, 0x2

    if-eq p1, v2, :cond_0

    return v1

    :cond_0
    return v0

    .line 2
    :cond_1
    invoke-static {}, Lcom/MApplication;->j()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/gsyvideoplayer/utils/l;->i(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v1

    :cond_2
    return v0

    .line 3
    :cond_3
    invoke-static {}, Lcom/MApplication;->j()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/pref/h;->n(Landroid/content/Context;)Lcom/join/mgps/pref/h;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/pref/h;->z()I

    move-result p1

    if-eqz p1, :cond_6

    if-eq p1, v1, :cond_4

    return v0

    .line 4
    :cond_4
    invoke-static {}, Lcom/MApplication;->j()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/gsyvideoplayer/utils/l;->i(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_5

    return v1

    :cond_5
    return v0

    :cond_6
    return v1
.end method

.method public declared-synchronized e()V
    .locals 14

    monitor-enter p0

    .line 1
    :try_start_0
    new-instance v0, Lcom/join/mgps/pref/PrefDef_;

    invoke-static {}, Lcom/MApplication;->j()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->isHomepagePlayVideo()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 2
    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x2

    .line 3
    :try_start_1
    iput v0, p0, Lcom/join/android/app/component/video/g;->g:I

    .line 4
    iget-object v1, p0, Lcom/join/android/app/component/video/g;->b:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    if-nez v1, :cond_1

    .line 5
    iget-object v1, p0, Lcom/join/android/app/component/video/g;->f:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v1

    iput-object v1, p0, Lcom/join/android/app/component/video/g;->b:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 6
    :cond_1
    iget-object v1, p0, Lcom/join/android/app/component/video/g;->f:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v1}, Lcom/join/android/app/component/video/g;->k(Landroidx/recyclerview/widget/RecyclerView;)I

    move-result v1

    iput v1, p0, Lcom/join/android/app/component/video/g;->c:I

    .line 7
    iget-object v1, p0, Lcom/join/android/app/component/video/g;->f:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v1}, Lcom/join/android/app/component/video/g;->m(Landroidx/recyclerview/widget/RecyclerView;)I

    move-result v1

    iput v1, p0, Lcom/join/android/app/component/video/g;->d:I

    .line 8
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 10
    iget-object v3, p0, Lcom/join/android/app/component/video/g;->f:Landroidx/recyclerview/widget/RecyclerView;

    instance-of v4, v3, Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    const/4 v5, 0x1

    if-eqz v4, :cond_15

    .line 11
    check-cast v3, Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    invoke-virtual {v3}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;->o()Z

    move-result v3

    const/4 v4, 0x5

    const/16 v6, 0x24

    const/16 v7, 0x1d

    const v8, 0x7f09180f

    const/4 v9, 0x0

    if-eqz v3, :cond_b

    .line 12
    iget v3, p0, Lcom/join/android/app/component/video/g;->d:I

    iget-object v10, p0, Lcom/join/android/app/component/video/g;->b:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    invoke-virtual {v10}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    move-result v10

    sub-int/2addr v10, v5

    if-lt v3, v10, :cond_b

    .line 13
    iget v3, p0, Lcom/join/android/app/component/video/g;->d:I

    const/4 v10, 0x0

    :goto_0
    iget v11, p0, Lcom/join/android/app/component/video/g;->c:I

    if-lt v3, v11, :cond_15

    .line 14
    iget v11, p0, Lcom/join/android/app/component/video/g;->g:I

    if-lt v10, v11, :cond_2

    goto/16 :goto_8

    .line 15
    :cond_2
    iget-object v11, p0, Lcom/join/android/app/component/video/g;->b:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    if-eqz v11, :cond_a

    invoke-virtual {v11, v3}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->findViewByPosition(I)Landroid/view/View;

    move-result-object v11

    if-eqz v11, :cond_a

    .line 16
    iget-object v11, p0, Lcom/join/android/app/component/video/g;->b:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    invoke-virtual {v11, v3}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->findViewByPosition(I)Landroid/view/View;

    move-result-object v11

    invoke-virtual {v11, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v11

    if-nez v11, :cond_3

    goto :goto_3

    .line 17
    :cond_3
    iget-object v12, p0, Lcom/join/android/app/component/video/g;->f:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v12}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v12

    if-eqz v12, :cond_6

    .line 18
    iget-object v12, p0, Lcom/join/android/app/component/video/g;->f:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v12}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v12

    invoke-virtual {v12, v3}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemViewType(I)I

    move-result v12

    if-eq v12, v7, :cond_4

    if-ne v12, v6, :cond_6

    :cond_4
    if-lt v10, v5, :cond_5

    goto/16 :goto_8

    :cond_5
    const/4 v12, 0x1

    goto :goto_1

    :cond_6
    const/4 v12, 0x0

    .line 19
    :goto_1
    instance-of v13, v11, Lcom/join/android/app/component/video/MultiStandVideo;

    if-eqz v13, :cond_9

    .line 20
    check-cast v11, Lcom/join/android/app/component/video/MultiStandVideo;

    .line 21
    invoke-virtual {v11}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->getCurrentState()I

    move-result v13

    if-ne v13, v0, :cond_7

    goto :goto_2

    .line 22
    :cond_7
    invoke-virtual {v11}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->getCurrentState()I

    move-result v13

    if-ne v13, v4, :cond_8

    .line 23
    invoke-virtual {v11, v9}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->onVideoResume(Z)V

    goto :goto_2

    .line 24
    :cond_8
    invoke-interface {v1, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_2
    add-int/lit8 v10, v10, 0x1

    .line 25
    invoke-virtual {v11}, Lcom/join/android/app/component/video/MultiStandVideo;->getKey()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v2, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_9
    if-eqz v12, :cond_a

    goto/16 :goto_8

    :cond_a
    :goto_3
    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    .line 26
    :cond_b
    iget v3, p0, Lcom/join/android/app/component/video/g;->c:I

    const/4 v10, 0x0

    :goto_4
    iget v11, p0, Lcom/join/android/app/component/video/g;->d:I

    if-gt v3, v11, :cond_15

    .line 27
    iget v11, p0, Lcom/join/android/app/component/video/g;->g:I

    if-lt v10, v11, :cond_c

    goto :goto_8

    .line 28
    :cond_c
    iget-object v11, p0, Lcom/join/android/app/component/video/g;->b:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    if-eqz v11, :cond_14

    invoke-virtual {v11, v3}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->findViewByPosition(I)Landroid/view/View;

    move-result-object v11

    if-eqz v11, :cond_14

    .line 29
    iget-object v11, p0, Lcom/join/android/app/component/video/g;->b:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    invoke-virtual {v11, v3}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->findViewByPosition(I)Landroid/view/View;

    move-result-object v11

    invoke-virtual {v11, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v11

    if-nez v11, :cond_d

    goto :goto_7

    .line 30
    :cond_d
    iget-object v12, p0, Lcom/join/android/app/component/video/g;->f:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v12}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v12

    if-eqz v12, :cond_10

    .line 31
    iget-object v12, p0, Lcom/join/android/app/component/video/g;->f:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v12}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v12

    invoke-virtual {v12, v3}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemViewType(I)I

    move-result v12

    if-eq v12, v7, :cond_e

    if-ne v12, v6, :cond_10

    :cond_e
    if-lt v10, v5, :cond_f

    goto :goto_8

    :cond_f
    const/4 v12, 0x1

    goto :goto_5

    :cond_10
    const/4 v12, 0x0

    .line 32
    :goto_5
    instance-of v13, v11, Lcom/join/android/app/component/video/MultiStandVideo;

    if-eqz v13, :cond_13

    .line 33
    check-cast v11, Lcom/join/android/app/component/video/MultiStandVideo;

    .line 34
    invoke-virtual {v11}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->getCurrentState()I

    move-result v13

    if-ne v13, v0, :cond_11

    goto :goto_6

    .line 35
    :cond_11
    invoke-virtual {v11}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->getCurrentState()I

    move-result v13

    if-ne v13, v4, :cond_12

    .line 36
    invoke-virtual {v11, v9}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->onVideoResume(Z)V

    goto :goto_6

    .line 37
    :cond_12
    invoke-interface {v1, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_6
    add-int/lit8 v10, v10, 0x1

    .line 38
    invoke-virtual {v11}, Lcom/join/android/app/component/video/MultiStandVideo;->getKey()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v2, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_13
    if-eqz v12, :cond_14

    goto :goto_8

    :cond_14
    :goto_7
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 39
    :cond_15
    :goto_8
    sget-object v0, Lcom/join/android/app/component/video/g;->i:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v0

    if-lez v0, :cond_18

    .line 40
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 41
    sget-object v3, Lcom/join/android/app/component/video/g;->i:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_16
    :goto_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_17

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 42
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/join/android/app/component/video/b;

    .line 43
    invoke-virtual {v6}, Lcom/papa/gsyvideoplayer/c;->o()Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Lcom/join/android/app/component/video/g;->a:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_16

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v2, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_16

    .line 44
    invoke-virtual {v6}, Lcom/join/android/app/component/video/b;->i0()V

    .line 45
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_9

    .line 46
    :cond_17
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_18

    .line 47
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_18

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 48
    invoke-static {v2}, Lcom/join/android/app/component/video/g;->B(Ljava/lang/String;)V

    goto :goto_a

    .line 49
    :cond_18
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_19

    invoke-virtual {p0, v5}, Lcom/join/android/app/component/video/g;->d(Z)Z

    move-result v0

    if-eqz v0, :cond_19

    .line 50
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_19

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/android/app/component/video/MultiStandVideo;

    .line 51
    iget-object v2, p0, Lcom/join/android/app/component/video/g;->h:Landroid/os/Handler;

    new-instance v3, Lcom/join/android/app/component/video/e;

    invoke-direct {v3, v1}, Lcom/join/android/app/component/video/e;-><init>(Lcom/join/android/app/component/video/MultiStandVideo;)V

    const-wide/16 v4, 0x12c

    invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_b

    :catchall_0
    move-exception v0

    goto :goto_c

    :catch_0
    move-exception v0

    .line 52
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 53
    :cond_19
    monitor-exit p0

    return-void

    :goto_c
    monitor-exit p0

    goto :goto_e

    :goto_d
    throw v0

    :goto_e
    goto :goto_d
.end method

.method public declared-synchronized f(I)V
    .locals 7

    monitor-enter p0

    .line 1
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 2
    :try_start_1
    iput p1, p0, Lcom/join/android/app/component/video/g;->g:I

    .line 3
    iget-object v0, p0, Lcom/join/android/app/component/video/g;->b:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    if-nez v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/join/android/app/component/video/g;->f:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v0

    iput-object v0, p0, Lcom/join/android/app/component/video/g;->b:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/join/android/app/component/video/g;->f:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0}, Lcom/join/android/app/component/video/g;->k(Landroidx/recyclerview/widget/RecyclerView;)I

    move-result v0

    iput v0, p0, Lcom/join/android/app/component/video/g;->c:I

    .line 6
    iget-object v0, p0, Lcom/join/android/app/component/video/g;->f:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0}, Lcom/join/android/app/component/video/g;->m(Landroidx/recyclerview/widget/RecyclerView;)I

    move-result v0

    iput v0, p0, Lcom/join/android/app/component/video/g;->d:I

    .line 7
    iget v1, p0, Lcom/join/android/app/component/video/g;->c:I

    add-int/2addr v1, p1

    iput v1, p0, Lcom/join/android/app/component/video/g;->e:I

    .line 8
    iget-object v1, p0, Lcom/join/android/app/component/video/g;->b:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    if-lt v0, v1, :cond_3

    .line 9
    iget-object v0, p0, Lcom/join/android/app/component/video/g;->b:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    instance-of v1, v0, Landroidx/recyclerview/widget/GridLayoutManager;

    if-eqz v1, :cond_2

    .line 10
    check-cast v0, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 11
    invoke-virtual {v0}, Landroidx/recyclerview/widget/GridLayoutManager;->getSpanCount()I

    move-result v0

    .line 12
    iget-object v1, p0, Lcom/join/android/app/component/video/g;->b:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    move-result v1

    div-int/2addr v1, v0

    .line 13
    iget-object v3, p0, Lcom/join/android/app/component/video/g;->b:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    move-result v3

    rem-int/2addr v3, v0

    if-nez v3, :cond_1

    .line 14
    iget-object v0, p0, Lcom/join/android/app/component/video/g;->b:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    move-result v0

    iput v0, p0, Lcom/join/android/app/component/video/g;->e:I

    sub-int/2addr v0, p1

    .line 15
    iput v0, p0, Lcom/join/android/app/component/video/g;->c:I

    goto :goto_0

    :cond_1
    mul-int v1, v1, v0

    .line 16
    iput v1, p0, Lcom/join/android/app/component/video/g;->c:I

    add-int/2addr v1, p1

    .line 17
    iput v1, p0, Lcom/join/android/app/component/video/g;->e:I

    goto :goto_0

    .line 18
    :cond_2
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    move-result v0

    iput v0, p0, Lcom/join/android/app/component/video/g;->e:I

    sub-int/2addr v0, p1

    .line 19
    iput v0, p0, Lcom/join/android/app/component/video/g;->c:I

    .line 20
    :cond_3
    :goto_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    iget v1, p0, Lcom/join/android/app/component/video/g;->c:I

    :goto_1
    iget v3, p0, Lcom/join/android/app/component/video/g;->e:I

    if-ge v1, v3, :cond_9

    .line 23
    iget-object v3, p0, Lcom/join/android/app/component/video/g;->b:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    if-eqz v3, :cond_8

    invoke-virtual {v3, v1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->findViewByPosition(I)Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_8

    .line 24
    iget-object v3, p0, Lcom/join/android/app/component/video/g;->b:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    invoke-virtual {v3, v1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->findViewByPosition(I)Landroid/view/View;

    move-result-object v3

    const v4, 0x7f09180f

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    if-nez v3, :cond_4

    goto :goto_3

    .line 25
    :cond_4
    instance-of v4, v3, Lcom/join/android/app/component/video/MultiStandVideo;

    if-eqz v4, :cond_8

    .line 26
    check-cast v3, Lcom/join/android/app/component/video/MultiStandVideo;

    .line 27
    invoke-virtual {v3}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->getCurrentState()I

    move-result v4

    const/4 v5, 0x2

    if-eq v4, v5, :cond_7

    .line 28
    invoke-virtual {v3}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->getCurrentState()I

    move-result v4

    if-eq v4, v2, :cond_7

    .line 29
    invoke-virtual {v3}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->getCurrentState()I

    move-result v4

    const/4 v5, 0x3

    if-ne v4, v5, :cond_5

    goto :goto_2

    .line 30
    :cond_5
    invoke-virtual {v3}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->getCurrentState()I

    move-result v4

    const/4 v5, 0x5

    if-ne v4, v5, :cond_6

    const/4 v4, 0x0

    .line 31
    invoke-virtual {v3, v4}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->onVideoResume(Z)V

    goto :goto_2

    .line 32
    :cond_6
    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 33
    :cond_7
    :goto_2
    invoke-virtual {v3}, Lcom/join/android/app/component/video/MultiStandVideo;->getKey()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_8
    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 34
    :cond_9
    sget-object v1, Lcom/join/android/app/component/video/g;->i:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v1

    if-lez v1, :cond_c

    .line 35
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 36
    sget-object v2, Lcom/join/android/app/component/video/g;->i:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_a
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 37
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/android/app/component/video/b;

    .line 38
    invoke-virtual {v4}, Lcom/papa/gsyvideoplayer/c;->o()Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/join/android/app/component/video/g;->a:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_a

    .line 39
    invoke-virtual {v4}, Lcom/join/android/app/component/video/b;->i0()V

    .line 40
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 41
    :cond_b
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_c

    .line 42
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 43
    invoke-static {v1}, Lcom/join/android/app/component/video/g;->B(Ljava/lang/String;)V

    goto :goto_5

    .line 44
    :cond_c
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_d

    .line 45
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/component/video/MultiStandVideo;

    .line 46
    iget-object v1, p0, Lcom/join/android/app/component/video/g;->h:Landroid/os/Handler;

    new-instance v2, Lcom/join/android/app/component/video/d;

    invoke-direct {v2, v0}, Lcom/join/android/app/component/video/d;-><init>(Lcom/join/android/app/component/video/MultiStandVideo;)V

    const-wide/16 v3, 0x64

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_6

    .line 47
    :cond_d
    monitor-exit p0

    goto :goto_7

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p1

    goto :goto_8

    :catch_0
    move-exception p1

    .line 48
    :try_start_3
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 49
    :goto_7
    monitor-exit p0

    return-void

    :goto_8
    monitor-exit p0

    goto :goto_a

    :goto_9
    throw p1

    :goto_a
    goto :goto_9
.end method

.method public declared-synchronized g(I)V
    .locals 10

    monitor-enter p0

    .line 1
    :try_start_0
    iput p1, p0, Lcom/join/android/app/component/video/g;->g:I

    .line 2
    iget-object v0, p0, Lcom/join/android/app/component/video/g;->b:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/android/app/component/video/g;->f:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v0

    iput-object v0, p0, Lcom/join/android/app/component/video/g;->b:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/android/app/component/video/g;->f:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0}, Lcom/join/android/app/component/video/g;->k(Landroidx/recyclerview/widget/RecyclerView;)I

    move-result v0

    iput v0, p0, Lcom/join/android/app/component/video/g;->c:I

    .line 5
    iget-object v0, p0, Lcom/join/android/app/component/video/g;->f:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0}, Lcom/join/android/app/component/video/g;->m(Landroidx/recyclerview/widget/RecyclerView;)I

    move-result v0

    iput v0, p0, Lcom/join/android/app/component/video/g;->d:I

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    iget v2, p0, Lcom/join/android/app/component/video/g;->d:I

    iget-object v3, p0, Lcom/join/android/app/component/video/g;->b:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    const/4 v4, 0x5

    const/4 v5, 0x2

    const v6, 0x7f09180f

    const/4 v7, 0x0

    if-lt v2, v3, :cond_6

    .line 9
    iget v2, p0, Lcom/join/android/app/component/video/g;->d:I

    const/4 v3, 0x0

    :goto_0
    iget v8, p0, Lcom/join/android/app/component/video/g;->c:I

    if-lt v2, v8, :cond_c

    if-lt v3, p1, :cond_1

    goto/16 :goto_6

    .line 10
    :cond_1
    iget-object v8, p0, Lcom/join/android/app/component/video/g;->b:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    if-eqz v8, :cond_5

    invoke-virtual {v8, v2}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->findViewByPosition(I)Landroid/view/View;

    move-result-object v8

    if-eqz v8, :cond_5

    .line 11
    iget-object v8, p0, Lcom/join/android/app/component/video/g;->b:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    invoke-virtual {v8, v2}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->findViewByPosition(I)Landroid/view/View;

    move-result-object v8

    invoke-virtual {v8, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    if-nez v8, :cond_2

    goto :goto_2

    .line 12
    :cond_2
    instance-of v9, v8, Lcom/join/android/app/component/video/MultiStandVideo;

    if-eqz v9, :cond_5

    .line 13
    check-cast v8, Lcom/join/android/app/component/video/MultiStandVideo;

    .line 14
    invoke-virtual {v8}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->getCurrentState()I

    move-result v9

    if-ne v9, v5, :cond_3

    goto :goto_1

    .line 15
    :cond_3
    invoke-virtual {v8}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->getCurrentState()I

    move-result v9

    if-ne v9, v4, :cond_4

    .line 16
    invoke-virtual {v8, v7}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->onVideoResume(Z)V

    goto :goto_1

    .line 17
    :cond_4
    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 18
    invoke-virtual {v8}, Lcom/join/android/app/component/video/MultiStandVideo;->getKey()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v1, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    :goto_2
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    .line 19
    :cond_6
    iget v2, p0, Lcom/join/android/app/component/video/g;->c:I

    const/4 v3, 0x0

    :goto_3
    iget v8, p0, Lcom/join/android/app/component/video/g;->d:I

    if-gt v2, v8, :cond_c

    if-lt v3, p1, :cond_7

    goto :goto_6

    .line 20
    :cond_7
    iget-object v8, p0, Lcom/join/android/app/component/video/g;->b:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    if-eqz v8, :cond_b

    invoke-virtual {v8, v2}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->findViewByPosition(I)Landroid/view/View;

    move-result-object v8

    if-eqz v8, :cond_b

    .line 21
    iget-object v8, p0, Lcom/join/android/app/component/video/g;->b:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    invoke-virtual {v8, v2}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->findViewByPosition(I)Landroid/view/View;

    move-result-object v8

    invoke-virtual {v8, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    if-nez v8, :cond_8

    goto :goto_5

    .line 22
    :cond_8
    instance-of v9, v8, Lcom/join/android/app/component/video/MultiStandVideo;

    if-eqz v9, :cond_b

    .line 23
    check-cast v8, Lcom/join/android/app/component/video/MultiStandVideo;

    .line 24
    invoke-virtual {v8}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->getCurrentState()I

    move-result v9

    if-ne v9, v5, :cond_9

    goto :goto_4

    .line 25
    :cond_9
    invoke-virtual {v8}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->getCurrentState()I

    move-result v9

    if-ne v9, v4, :cond_a

    .line 26
    invoke-virtual {v8, v7}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->onVideoResume(Z)V

    goto :goto_4

    .line 27
    :cond_a
    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_4
    add-int/lit8 v3, v3, 0x1

    .line 28
    invoke-virtual {v8}, Lcom/join/android/app/component/video/MultiStandVideo;->getKey()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v1, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_b
    :goto_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 29
    :cond_c
    :goto_6
    sget-object p1, Lcom/join/android/app/component/video/g;->i:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result p1

    if-lez p1, :cond_f

    .line 30
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 31
    sget-object v2, Lcom/join/android/app/component/video/g;->i:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_d
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 32
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/android/app/component/video/b;

    .line 33
    invoke-virtual {v4}, Lcom/papa/gsyvideoplayer/c;->o()Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/join/android/app/component/video/g;->a:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v1, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_d

    .line 34
    invoke-virtual {v4}, Lcom/join/android/app/component/video/b;->i0()V

    .line 35
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 36
    :cond_e
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_f

    .line 37
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 38
    invoke-static {v1}, Lcom/join/android/app/component/video/g;->B(Ljava/lang/String;)V

    goto :goto_8

    .line 39
    :cond_f
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_10

    .line 40
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/component/video/MultiStandVideo;

    .line 41
    iget-object v1, p0, Lcom/join/android/app/component/video/g;->h:Landroid/os/Handler;

    new-instance v2, Lcom/join/android/app/component/video/f;

    invoke-direct {v2, v0}, Lcom/join/android/app/component/video/f;-><init>(Lcom/join/android/app/component/video/MultiStandVideo;)V

    const-wide/16 v3, 0x12c

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_9

    :catchall_0
    move-exception p1

    goto :goto_a

    :catch_0
    move-exception p1

    .line 42
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    :cond_10
    monitor-exit p0

    return-void

    :goto_a
    monitor-exit p0

    goto :goto_c

    :goto_b
    throw p1

    :goto_c
    goto :goto_b
.end method

.method public p()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/android/app/component/video/g;->a:Ljava/lang/String;

    return-object v0
.end method

.method public t()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/android/app/component/video/g;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/join/android/app/component/video/g;->h(Ljava/lang/String;)V

    return-void
.end method

.method public u()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/android/app/component/video/g;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/join/android/app/component/video/g;->v(Ljava/lang/String;)V

    return-void
.end method

.method public w()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/android/app/component/video/g;->g:I

    invoke-virtual {p0, v0}, Lcom/join/android/app/component/video/g;->f(I)V

    return-void
.end method

.method public z()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/join/android/app/component/video/g;->e()V

    return-void
.end method
