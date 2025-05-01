.class public Lcom/ss/android/socialbase/downloader/downloader/i;
.super Ljava/lang/Object;


# static fields
.field private static volatile vv:Lcom/ss/android/socialbase/downloader/downloader/i;


# instance fields
.field private volatile i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/depend/td;",
            ">;"
        }
    .end annotation
.end field

.field private volatile m:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private p:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/i;->m:Landroid/util/SparseArray;

    .line 3
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/i;->p:Landroid/os/Handler;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/i;->i:Ljava/util/List;

    return-void
.end method

.method private m(Lcom/ss/android/socialbase/downloader/model/DownloadTask;)Lcom/ss/android/socialbase/downloader/downloader/r;
    .locals 6

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 15
    :cond_0
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getDownloadInfo()Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v1

    if-nez v1, :cond_1

    return-object v0

    .line 16
    :cond_1
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isNeedIndependentProcess()Z

    move-result v0

    .line 17
    invoke-static {}, Lcom/ss/android/socialbase/downloader/wv/u;->p()Z

    move-result v2

    const/4 v3, 0x1

    if-nez v2, :cond_2

    invoke-static {}, Lcom/ss/android/socialbase/downloader/wv/u;->vv()Z

    move-result v2

    if-nez v2, :cond_3

    :cond_2
    const/4 v0, 0x1

    .line 18
    :cond_3
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v2

    invoke-virtual {p0, v2}, Lcom/ss/android/socialbase/downloader/downloader/i;->vv(I)I

    move-result v2

    const/4 v4, 0x0

    if-ltz v2, :cond_7

    if-eq v2, v0, :cond_7

    if-ne v2, v3, :cond_5

    .line 19
    :try_start_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/wv/u;->vv()Z

    move-result p1

    if-eqz p1, :cond_7

    .line 20
    invoke-static {v3}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object p1

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v2

    invoke-interface {p1, v2}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv(I)V

    .line 21
    invoke-static {v3}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object p1

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v2

    invoke-interface {p1, v2}, Lcom/ss/android/socialbase/downloader/downloader/r;->qv(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 22
    invoke-static {v4}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v2

    invoke-interface {v2, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->m(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 23
    :cond_4
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getChunkCount()I

    move-result p1

    if-le p1, v3, :cond_7

    .line 24
    invoke-static {v3}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object p1

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v2

    invoke-interface {p1, v2}, Lcom/ss/android/socialbase/downloader/downloader/r;->wv(I)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 25
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/wv/u;->vv(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 26
    invoke-static {v4}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v2

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v5

    invoke-interface {v2, v5, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv(ILjava/util/List;)V

    goto :goto_0

    .line 27
    :cond_5
    invoke-static {}, Lcom/ss/android/socialbase/downloader/wv/u;->vv()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 28
    invoke-static {v4}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object p1

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v2

    invoke-interface {p1, v2}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv(I)V

    .line 29
    invoke-static {v4}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object p1

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v2

    invoke-interface {p1, v2}, Lcom/ss/android/socialbase/downloader/downloader/r;->wv(I)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 30
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/wv/u;->vv(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 31
    invoke-static {v3}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v2

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v5

    invoke-interface {v2, v5, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv(ILjava/util/List;)V

    goto :goto_0

    .line 32
    :cond_6
    invoke-virtual {p1, v3}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->setNeedDelayForCacheSync(Z)V

    .line 33
    invoke-static {v3}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object p1

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v2

    invoke-interface {p1, v3, v2}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    nop

    .line 34
    :cond_7
    :goto_0
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result p1

    if-ne v0, v3, :cond_8

    const/4 v1, 0x1

    goto :goto_1

    :cond_8
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {p0, p1, v1}, Lcom/ss/android/socialbase/downloader/downloader/i;->vv(IZ)V

    if-ne v0, v3, :cond_9

    goto :goto_2

    :cond_9
    const/4 v3, 0x0

    .line 35
    :goto_2
    invoke-static {v3}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object p1

    return-object p1
.end method

.method public static vv()Lcom/ss/android/socialbase/downloader/downloader/i;
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/i;->vv:Lcom/ss/android/socialbase/downloader/downloader/i;

    if-nez v0, :cond_0

    .line 2
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/i;

    monitor-enter v0

    .line 3
    :try_start_0
    new-instance v1, Lcom/ss/android/socialbase/downloader/downloader/i;

    invoke-direct {v1}, Lcom/ss/android/socialbase/downloader/downloader/i;-><init>()V

    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/i;->vv:Lcom/ss/android/socialbase/downloader/downloader/i;

    .line 4
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 5
    :cond_0
    :goto_0
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/i;->vv:Lcom/ss/android/socialbase/downloader/downloader/i;

    return-object v0
.end method

.method private vv(Ljava/util/List;Ljava/util/List;Landroid/util/SparseArray;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/DownloadInfo;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/DownloadInfo;",
            ">;",
            "Landroid/util/SparseArray<",
            "Lcom/ss/android/socialbase/downloader/model/DownloadInfo;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/DownloadInfo;",
            ">;"
        }
    .end annotation

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_1

    .line 33
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    if-eqz v1, :cond_0

    .line 34
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v2

    invoke-virtual {p3, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    .line 35
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v2

    invoke-virtual {p3, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_3

    .line 36
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    if-eqz p2, :cond_2

    .line 37
    invoke-virtual {p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v1

    invoke-virtual {p3, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_2

    .line 38
    invoke-virtual {p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v1

    invoke-virtual {p3, v1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    .line 39
    :goto_2
    invoke-virtual {p3}, Landroid/util/SparseArray;->size()I

    move-result p2

    if-ge p1, p2, :cond_4

    .line 40
    invoke-virtual {p3, p1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result p2

    .line 41
    invoke-virtual {p3, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 42
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 p1, p1, 0x1

    goto :goto_2

    :cond_4
    return-object v0
.end method


# virtual methods
.method public b(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/i;->p(I)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 2
    :cond_0
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->qv(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1

    return-object p1
.end method

.method public d(I)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/ss/android/socialbase/downloader/downloader/i;->m(IZ)V

    .line 2
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object p1

    if-nez p1, :cond_1

    return-void

    .line 3
    :cond_1
    invoke-interface {p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->startService()V

    return-void
.end method

.method public g(I)Lcom/ss/android/socialbase/downloader/depend/IDownloadFileUriProvider;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/i;->p(I)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 2
    :cond_0
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->la(I)Lcom/ss/android/socialbase/downloader/depend/IDownloadFileUriProvider;

    move-result-object p1

    return-object p1
.end method

.method public i(Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/DownloadInfo;",
            ">;"
        }
    .end annotation

    .line 6
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    const/4 v1, 0x0

    .line 7
    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 8
    invoke-interface {v1, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->i(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    const/4 v3, 0x1

    .line 9
    invoke-static {v3}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 10
    invoke-interface {v3, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->i(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 11
    :cond_1
    invoke-direct {p0, v1, v2, v0}, Lcom/ss/android/socialbase/downloader/downloader/i;->vv(Ljava/util/List;Ljava/util/List;Landroid/util/SparseArray;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public i(I)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/i;->p(I)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv(I)V

    return-void
.end method

.method public i(IZ)V
    .locals 1

    .line 3
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/i;->p(I)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 4
    :cond_0
    invoke-interface {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/r;->m(IZ)V

    return-void
.end method

.method public i()Z
    .locals 1

    .line 5
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->s()Z

    move-result v0

    return v0
.end method

.method public j(I)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->b(I)V

    :cond_0
    const/4 v0, 0x1

    .line 3
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->b(I)V

    :cond_1
    return-void
.end method

.method public jh(I)Lcom/ss/android/socialbase/downloader/depend/vu;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/i;->p(I)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 2
    :cond_0
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->d(I)Lcom/ss/android/socialbase/downloader/depend/vu;

    move-result-object p1

    return-object p1
.end method

.method public k(I)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/i;->p(I)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->n(I)Z

    move-result p1

    return p1
.end method

.method public declared-synchronized m(I)I
    .locals 1

    monitor-enter p0

    .line 12
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/i;->m:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    const/4 p1, -0x1

    .line 13
    monitor-exit p0

    return p1

    .line 14
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/i;->m:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    monitor-exit p0

    return p1

    :cond_1
    const/4 p1, 0x0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public m(Ljava/lang/String;Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 0

    .line 36
    invoke-virtual {p0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/i;->vv(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    .line 37
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/i;->p(I)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 38
    :cond_0
    invoke-interface {p2, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->qv(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1

    return-object p1
.end method

.method public m(Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/DownloadInfo;",
            ">;"
        }
    .end annotation

    .line 39
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    const/4 v1, 0x0

    .line 40
    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 41
    invoke-interface {v1, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->m(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    const/4 v3, 0x1

    .line 42
    invoke-static {v3}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 43
    invoke-interface {v3, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->m(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 44
    :cond_1
    invoke-direct {p0, v1, v2, v0}, Lcom/ss/android/socialbase/downloader/downloader/i;->vv(Ljava/util/List;Ljava/util/List;Landroid/util/SparseArray;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public m()V
    .locals 3

    .line 5
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/i;->i:Ljava/util/List;

    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/i;->i:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 7
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 8
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_0

    .line 9
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    throw v1

    :goto_2
    goto :goto_1
.end method

.method public m(ILcom/ss/android/socialbase/downloader/depend/IDownloadListener;Lcom/ss/android/socialbase/downloader/constants/u;Z)V
    .locals 6

    .line 49
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/i;->p(I)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 50
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    move v1, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-interface/range {v0 .. v5}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv(IILcom/ss/android/socialbase/downloader/depend/IDownloadListener;Lcom/ss/android/socialbase/downloader/constants/u;Z)V

    return-void
.end method

.method public declared-synchronized m(IZ)V
    .locals 1

    monitor-enter p0

    .line 10
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/i;->m:Landroid/util/SparseArray;

    if-eqz p2, :cond_0

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_0

    :cond_0
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_0
    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public m(Lcom/ss/android/socialbase/downloader/depend/b;)V
    .locals 0

    .line 51
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/downloader/p;->m(Lcom/ss/android/socialbase/downloader/depend/b;)V

    return-void
.end method

.method public m(Lcom/ss/android/socialbase/downloader/depend/td;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/i;->i:Ljava/util/List;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/i;->i:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 3
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/i;->i:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 4
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public m(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 45
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 46
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->m(Ljava/util/List;)V

    :cond_0
    const/4 v0, 0x1

    .line 47
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 48
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->m(Ljava/util/List;)V

    :cond_1
    return-void
.end method

.method public n(I)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/i;->p(I)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->i(I)V

    return-void
.end method

.method public o()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/DownloadInfo;",
            ">;"
        }
    .end annotation

    .line 9
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    const/4 v1, 0x0

    .line 10
    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 11
    invoke-interface {v1}, Lcom/ss/android/socialbase/downloader/downloader/r;->i()Ljava/util/List;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    const/4 v3, 0x1

    .line 12
    invoke-static {v3}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 13
    invoke-interface {v3}, Lcom/ss/android/socialbase/downloader/downloader/r;->i()Ljava/util/List;

    move-result-object v2

    .line 14
    :cond_1
    invoke-direct {p0, v1, v2, v0}, Lcom/ss/android/socialbase/downloader/downloader/i;->vv(Ljava/util/List;Ljava/util/List;Landroid/util/SparseArray;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public o(Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/DownloadInfo;",
            ">;"
        }
    .end annotation

    .line 3
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    const/4 v1, 0x0

    .line 4
    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 5
    invoke-interface {v1, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->o(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    const/4 v3, 0x1

    .line 6
    invoke-static {v3}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 7
    invoke-interface {v3, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->o(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 8
    :cond_1
    invoke-direct {p0, v1, v2, v0}, Lcom/ss/android/socialbase/downloader/downloader/i;->vv(Ljava/util/List;Ljava/util/List;Landroid/util/SparseArray;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public o(I)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/i;->p(I)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->m(I)Z

    move-result p1

    return p1
.end method

.method public p(I)Lcom/ss/android/socialbase/downloader/downloader/r;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/i;->vv(I)I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    invoke-static {}, Lcom/ss/android/socialbase/downloader/wv/u;->p()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object p1

    return-object p1
.end method

.method public p(Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/DownloadInfo;",
            ">;"
        }
    .end annotation

    .line 19
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    const/4 v1, 0x0

    .line 20
    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 21
    invoke-interface {v1, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->p(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    const/4 v3, 0x1

    .line 22
    invoke-static {v3}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 23
    invoke-interface {v3, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->p(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 24
    :cond_1
    invoke-direct {p0, v1, v2, v0}, Lcom/ss/android/socialbase/downloader/downloader/i;->vv(Ljava/util/List;Ljava/util/List;Landroid/util/SparseArray;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public p()V
    .locals 1

    const/4 v0, 0x0

    .line 15
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 16
    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv()V

    :cond_0
    const/4 v0, 0x1

    .line 17
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 18
    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv()V

    :cond_1
    return-void
.end method

.method public p(IZ)V
    .locals 3

    .line 2
    invoke-static {}, Lcom/ss/android/socialbase/downloader/wv/u;->vv()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_5

    const/high16 v0, 0x800000

    .line 3
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/wv/vv;->vv(I)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    .line 4
    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    invoke-interface {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv(IZ)V

    .line 6
    :cond_0
    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 7
    invoke-interface {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv(IZ)V

    :cond_1
    return-void

    .line 8
    :cond_2
    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 9
    invoke-interface {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv(IZ)V

    .line 10
    :cond_3
    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 11
    invoke-interface {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv(IZ)V

    :cond_4
    return-void

    .line 12
    :cond_5
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/i;->p(I)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 13
    invoke-interface {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv(IZ)V

    .line 14
    :cond_6
    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object p2

    const/4 v0, 0x2

    invoke-interface {p2, v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv(II)V

    return-void
.end method

.method public q(I)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/i;->p(I)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->jh(I)Z

    move-result p1

    return p1
.end method

.method public qv(I)J
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/i;->p(I)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 2
    :cond_0
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->o(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public r(I)Lcom/ss/android/socialbase/downloader/depend/a;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/i;->p(I)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 2
    :cond_0
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->g(I)Lcom/ss/android/socialbase/downloader/depend/a;

    move-result-object p1

    return-object p1
.end method

.method public t(I)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/i;->p(I)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->k(I)V

    return-void
.end method

.method public u(I)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/i;->p(I)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->p(I)V

    return-void
.end method

.method public u()Z
    .locals 2

    const/4 v0, 0x0

    .line 3
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 4
    invoke-interface {v1}, Lcom/ss/android/socialbase/downloader/downloader/r;->o()Z

    move-result v0

    :cond_0
    return v0
.end method

.method public vv(I)I
    .locals 2

    .line 21
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->e()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    .line 22
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/wv/u;->p()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v1

    invoke-interface {v1}, Lcom/ss/android/socialbase/downloader/downloader/r;->n()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 23
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->r(I)I

    move-result p1

    return p1

    .line 24
    :cond_1
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/i;->m(I)I

    move-result p1

    return p1
.end method

.method public vv(Ljava/lang/String;Ljava/lang/String;)I
    .locals 0

    .line 25
    invoke-static {p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/p;->vv(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public vv(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/DownloadInfo;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 26
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    .line 27
    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    .line 28
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 29
    invoke-interface {v1, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object v1

    :cond_1
    if-eqz v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method

.method public vv(IJ)V
    .locals 1

    .line 59
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/i;->p(I)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 60
    :cond_0
    invoke-interface {v0, p1, p2, p3}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv(IJ)V

    return-void
.end method

.method public vv(ILcom/ss/android/socialbase/downloader/depend/IDownloadListener;Lcom/ss/android/socialbase/downloader/constants/u;Z)V
    .locals 6

    .line 47
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/i;->p(I)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p2, :cond_1

    const/4 v1, 0x0

    const/4 v2, 0x0

    goto :goto_0

    .line 48
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    move v2, v1

    :goto_0
    move v1, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-interface/range {v0 .. v5}, Lcom/ss/android/socialbase/downloader/downloader/r;->m(IILcom/ss/android/socialbase/downloader/depend/IDownloadListener;Lcom/ss/android/socialbase/downloader/constants/u;Z)V

    return-void
.end method

.method public vv(ILcom/ss/android/socialbase/downloader/depend/IDownloadListener;Lcom/ss/android/socialbase/downloader/constants/u;ZZ)V
    .locals 7

    .line 49
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/i;->p(I)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 50
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    move v1, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    invoke-interface/range {v0 .. v6}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv(IILcom/ss/android/socialbase/downloader/depend/IDownloadListener;Lcom/ss/android/socialbase/downloader/constants/u;ZZ)V

    return-void
.end method

.method public vv(ILcom/ss/android/socialbase/downloader/depend/vu;)V
    .locals 1

    .line 30
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/i;->p(I)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 31
    :cond_0
    invoke-interface {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv(ILcom/ss/android/socialbase/downloader/depend/vu;)V

    return-void
.end method

.method public vv(IZ)V
    .locals 2

    .line 12
    invoke-virtual {p0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/i;->m(IZ)V

    .line 13
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/ss/android/socialbase/downloader/wv/u;->p()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v1

    invoke-interface {v1}, Lcom/ss/android/socialbase/downloader/downloader/r;->n()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 14
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/r;->p(IZ)V

    .line 15
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->p()Z

    move-result p2

    if-nez p2, :cond_1

    invoke-static {}, Lcom/ss/android/socialbase/downloader/wv/u;->p()Z

    move-result p2

    if-nez p2, :cond_1

    invoke-static {}, Lcom/ss/android/socialbase/downloader/wv/u;->vv()Z

    move-result p2

    if-nez p2, :cond_1

    .line 16
    :try_start_0
    new-instance p2, Landroid/content/Intent;

    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->ky()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/ss/android/socialbase/downloader/impls/DownloadHandleService;

    invoke-direct {p2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v0, "com.ss.android.downloader.action.PROCESS_NOTIFY"

    .line 17
    invoke-virtual {p2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "extra_download_id"

    .line 18
    invoke-virtual {p2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 19
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->ky()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 20
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    return-void
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/depend/b;)V
    .locals 0

    .line 58
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/downloader/p;->vv(Lcom/ss/android/socialbase/downloader/depend/b;)V

    return-void
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/depend/td;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 6
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/wv/u;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    const/4 v0, 0x1

    .line 7
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    .line 8
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/i;->i:Ljava/util/List;

    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/i;->i:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 10
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/i;->i:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/model/DownloadTask;)V
    .locals 5

    .line 53
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/i;->m(Lcom/ss/android/socialbase/downloader/model/DownloadTask;)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-nez v0, :cond_2

    if-eqz p1, :cond_1

    .line 54
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getMonitorDepend()Lcom/ss/android/socialbase/downloader/depend/l;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getDownloadInfo()Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v1

    new-instance v2, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const/16 v3, 0x3eb

    const-string v4, "tryDownload but getDownloadHandler failed"

    invoke-direct {v2, v3, v4}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getDownloadInfo()Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getDownloadInfo()Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {v0, v1, v2, p1}, Lcom/ss/android/socialbase/downloader/i/vv;->vv(Lcom/ss/android/socialbase/downloader/depend/l;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/exception/BaseException;I)V

    :cond_1
    return-void

    .line 55
    :cond_2
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->isNeedDelayForCacheSync()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 56
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/i;->p:Landroid/os/Handler;

    new-instance v2, Lcom/ss/android/socialbase/downloader/downloader/i$1;

    invoke-direct {v2, p0, v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/i$1;-><init>(Lcom/ss/android/socialbase/downloader/downloader/i;Lcom/ss/android/socialbase/downloader/downloader/r;Lcom/ss/android/socialbase/downloader/model/DownloadTask;)V

    const-wide/16 v3, 0x1f4

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    .line 57
    :cond_3
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadTask;)V

    return-void
.end method

.method public vv(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 43
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 44
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv(Ljava/util/List;)V

    :cond_0
    const/4 v0, 0x1

    .line 45
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 46
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv(Ljava/util/List;)V

    :cond_1
    return-void
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 51
    :cond_0
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/ss/android/socialbase/downloader/downloader/i;->p(I)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v1

    if-nez v1, :cond_1

    return v0

    .line 52
    :cond_1
    invoke-interface {v1, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    move-result p1

    return p1
.end method

.method public wv(I)I
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/i;->p(I)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->u(I)I

    move-result p1

    return p1
.end method
