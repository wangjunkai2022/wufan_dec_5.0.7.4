.class public Lcom/ss/android/socialbase/downloader/impls/i;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/socialbase/downloader/downloader/k;


# instance fields
.field private volatile i:Z

.field private m:Lcom/ss/android/socialbase/downloader/downloader/x;

.field private o:Lcom/ss/android/socialbase/downloader/qv/qv$vv;

.field private volatile p:Z

.field private u:Lcom/ss/android/socialbase/downloader/qv/qv;

.field private final vv:Lcom/ss/android/socialbase/downloader/impls/b;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/ss/android/socialbase/downloader/impls/i$1;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/impls/i$1;-><init>(Lcom/ss/android/socialbase/downloader/impls/i;)V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->o:Lcom/ss/android/socialbase/downloader/qv/qv$vv;

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->u:Lcom/ss/android/socialbase/downloader/qv/qv;

    .line 4
    new-instance v0, Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-direct {v0}, Lcom/ss/android/socialbase/downloader/impls/b;-><init>()V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    .line 5
    invoke-static {}, Lcom/ss/android/socialbase/downloader/n/vv;->p()Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v0

    const-string v1, "fix_sigbus_downloader_db"

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 6
    invoke-static {}, Lcom/ss/android/socialbase/downloader/wv/u;->vv()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->e()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->ju()Lcom/ss/android/socialbase/downloader/downloader/p$vv;

    move-result-object v0

    new-instance v1, Lcom/ss/android/socialbase/downloader/impls/i$2;

    invoke-direct {v1, p0}, Lcom/ss/android/socialbase/downloader/impls/i$2;-><init>(Lcom/ss/android/socialbase/downloader/impls/i;)V

    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/p$vv;->vv(Lcom/ss/android/socialbase/downloader/downloader/p$vv$vv;)Lcom/ss/android/socialbase/downloader/downloader/x;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->m:Lcom/ss/android/socialbase/downloader/downloader/x;

    goto :goto_1

    .line 8
    :cond_1
    :goto_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/m/o;

    invoke-direct {v0}, Lcom/ss/android/socialbase/downloader/m/o;-><init>()V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->m:Lcom/ss/android/socialbase/downloader/downloader/x;

    goto :goto_1

    .line 9
    :cond_2
    new-instance v0, Lcom/ss/android/socialbase/downloader/m/o;

    invoke-direct {v0}, Lcom/ss/android/socialbase/downloader/m/o;-><init>()V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->m:Lcom/ss/android/socialbase/downloader/downloader/x;

    :goto_1
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->p:Z

    .line 11
    new-instance v0, Lcom/ss/android/socialbase/downloader/qv/qv;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/impls/i;->o:Lcom/ss/android/socialbase/downloader/qv/qv$vv;

    invoke-direct {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/qv/qv;-><init>(Landroid/os/Looper;Lcom/ss/android/socialbase/downloader/qv/qv$vv;)V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->u:Lcom/ss/android/socialbase/downloader/qv/qv;

    .line 12
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/impls/i;->n()V

    return-void
.end method

.method private k()V
    .locals 1

    .line 1
    monitor-enter p0

    const/4 v0, 0x1

    .line 2
    :try_start_0
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->p:Z

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 4
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic m(Lcom/ss/android/socialbase/downloader/impls/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/impls/i;->k()V

    return-void
.end method

.method private p(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 1

    const/4 v0, 0x1

    .line 10
    invoke-direct {p0, p1, v0}, Lcom/ss/android/socialbase/downloader/impls/i;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Z)V

    return-void
.end method

.method static synthetic vv(Lcom/ss/android/socialbase/downloader/impls/i;Lcom/ss/android/socialbase/downloader/downloader/x;)Lcom/ss/android/socialbase/downloader/downloader/x;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/impls/i;->m:Lcom/ss/android/socialbase/downloader/downloader/x;

    return-object p1
.end method

.method static synthetic vv(Lcom/ss/android/socialbase/downloader/impls/i;)Lcom/ss/android/socialbase/downloader/impls/b;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    return-object p0
.end method

.method private vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Z)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 38
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/wv/u;->m()Z

    move-result v0

    if-eqz v0, :cond_2

    if-eqz p2, :cond_3

    const/4 p2, 0x1

    .line 39
    invoke-static {p2}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 40
    invoke-interface {p2, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->p(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    return-void

    .line 41
    :cond_1
    iget-object p2, p0, Lcom/ss/android/socialbase/downloader/impls/i;->m:Lcom/ss/android/socialbase/downloader/downloader/x;

    invoke-interface {p2, p1}, Lcom/ss/android/socialbase/downloader/downloader/k;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    return-void

    .line 42
    :cond_2
    iget-object p2, p0, Lcom/ss/android/socialbase/downloader/impls/i;->m:Lcom/ss/android/socialbase/downloader/downloader/x;

    invoke-interface {p2, p1}, Lcom/ss/android/socialbase/downloader/downloader/k;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    :cond_3
    return-void
.end method


# virtual methods
.method public i(IJ)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-virtual {v0, p1, p2, p3}, Lcom/ss/android/socialbase/downloader/impls/b;->i(IJ)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p2

    const/4 p3, 0x0

    .line 10
    invoke-virtual {p0, p1, p3}, Lcom/ss/android/socialbase/downloader/impls/i;->m(ILjava/util/List;)V

    return-object p2
.end method

.method public i(Ljava/lang/String;)Ljava/util/List;
    .locals 1
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

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/impls/b;->i(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public i(I)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/impls/b;->i(I)V

    .line 4
    invoke-static {}, Lcom/ss/android/socialbase/downloader/wv/u;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    .line 5
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 6
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->q(I)V

    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->m:Lcom/ss/android/socialbase/downloader/downloader/x;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/k;->i(I)V

    return-void

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->m:Lcom/ss/android/socialbase/downloader/downloader/x;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/k;->i(I)V

    return-void
.end method

.method public i()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->p:Z

    return v0
.end method

.method public jh(I)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Lcom/ss/android/socialbase/downloader/u/wv;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/impls/b;->jh(I)Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->m:Lcom/ss/android/socialbase/downloader/downloader/x;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/k;->jh(I)Ljava/util/Map;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-virtual {v1, p1, v0}, Lcom/ss/android/socialbase/downloader/impls/b;->vv(ILjava/util/Map;)Z

    :cond_1
    return-object v0
.end method

.method public k(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/impls/b;->k(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1

    .line 6
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/impls/i;->p(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    return-object p1
.end method

.method public m(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/impls/b;->m(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1

    return-object p1
.end method

.method public m(IJ)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-virtual {v0, p1, p2, p3}, Lcom/ss/android/socialbase/downloader/impls/b;->m(IJ)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p2

    const/4 p3, 0x0

    .line 11
    invoke-virtual {p0, p1, p3}, Lcom/ss/android/socialbase/downloader/impls/i;->m(ILjava/util/List;)V

    return-object p2
.end method

.method public m()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/DownloadInfo;",
            ">;"
        }
    .end annotation

    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/impls/b;->m()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public m(Ljava/lang/String;)Ljava/util/List;
    .locals 1
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
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/impls/b;->m(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public m(ILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/m;",
            ">;)V"
        }
    .end annotation

    .line 13
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/impls/b;->m(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ss/android/socialbase/downloader/impls/i;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    if-nez p2, :cond_0

    .line 14
    iget-object p2, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-virtual {p2, p1}, Lcom/ss/android/socialbase/downloader/impls/b;->p(I)Ljava/util/List;

    move-result-object p2

    .line 15
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/wv/u;->m()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    .line 16
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 17
    invoke-interface {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/r;->m(ILjava/util/List;)V

    return-void

    .line 18
    :cond_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->m:Lcom/ss/android/socialbase/downloader/downloader/x;

    invoke-interface {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/k;->m(ILjava/util/List;)V

    return-void

    .line 19
    :cond_2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->m:Lcom/ss/android/socialbase/downloader/downloader/x;

    invoke-interface {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/k;->m(ILjava/util/List;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 20
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    return-void
.end method

.method public m(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/impls/b;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    return-void
.end method

.method public m(Lcom/ss/android/socialbase/downloader/model/m;)V
    .locals 1

    .line 5
    invoke-static {}, Lcom/ss/android/socialbase/downloader/wv/u;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    .line 6
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 7
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv(Lcom/ss/android/socialbase/downloader/model/m;)V

    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->m:Lcom/ss/android/socialbase/downloader/downloader/x;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/k;->vv(Lcom/ss/android/socialbase/downloader/model/m;)V

    return-void

    .line 9
    :cond_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->m:Lcom/ss/android/socialbase/downloader/downloader/x;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/k;->vv(Lcom/ss/android/socialbase/downloader/model/m;)V

    return-void
.end method

.method public n(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/impls/b;->n(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1

    .line 2
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/impls/i;->p(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    return-object p1
.end method

.method public n()V
    .locals 8

    .line 3
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/i;->m:Lcom/ss/android/socialbase/downloader/constants/i;

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/p;->vv(Lcom/ss/android/socialbase/downloader/constants/i;)V

    .line 4
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 5
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 6
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    monitor-enter v2

    .line 7
    :try_start_0
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/impls/b;->vv()Landroid/util/SparseArray;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 8
    :goto_0
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v6

    if-ge v5, v6, :cond_1

    .line 9
    invoke-virtual {v3, v5}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v6

    if-eqz v6, :cond_0

    .line 10
    invoke-virtual {v3, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    if-eqz v7, :cond_0

    .line 11
    invoke-virtual {v0, v6, v7}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 12
    :cond_1
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/impls/b;->u()Landroid/util/SparseArray;

    move-result-object v3

    .line 13
    :goto_1
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v5

    if-ge v4, v5, :cond_3

    .line 14
    invoke-virtual {v3, v4}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v5

    if-eqz v5, :cond_2

    .line 15
    invoke-virtual {v3, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    if-eqz v6, :cond_2

    .line 16
    new-instance v7, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v7, v6}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1, v5, v7}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 17
    :cond_3
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/impls/i;->m:Lcom/ss/android/socialbase/downloader/downloader/x;

    new-instance v3, Lcom/ss/android/socialbase/downloader/impls/i$3;

    invoke-direct {v3, p0, v0, v1}, Lcom/ss/android/socialbase/downloader/impls/i$3;-><init>(Lcom/ss/android/socialbase/downloader/impls/i;Landroid/util/SparseArray;Landroid/util/SparseArray;)V

    invoke-interface {v2, v0, v1, v3}, Lcom/ss/android/socialbase/downloader/downloader/x;->vv(Landroid/util/SparseArray;Landroid/util/SparseArray;Lcom/ss/android/socialbase/downloader/m/i;)V

    return-void

    :catchall_0
    move-exception v0

    .line 19
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :goto_2
    throw v0

    :goto_3
    goto :goto_2
.end method

.method public o()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->p:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 2
    :cond_0
    monitor-enter p0

    .line 3
    :try_start_0
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->p:Z

    if-nez v0, :cond_1

    const-string v0, "DefaultDownloadCache"

    const-string v1, "ensureDownloadCacheSyncSuccess: waiting start!!!!"

    .line 4
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/p/vv;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide/16 v0, 0x1388

    .line 5
    :try_start_1
    invoke-virtual {p0, v0, v1}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 6
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    :goto_0
    const-string v0, "DefaultDownloadCache"

    const-string v1, "ensureDownloadCacheSyncSuccess: waiting end!!!!"

    .line 7
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/p/vv;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    :cond_1
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 9
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->p:Z

    return v0

    :catchall_0
    move-exception v0

    .line 10
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method

.method public o(I)Z
    .locals 1

    .line 11
    :try_start_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/wv/u;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    .line 12
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 13
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->t(I)Z

    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->m:Lcom/ss/android/socialbase/downloader/downloader/x;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/k;->o(I)Z

    goto :goto_0

    .line 15
    :cond_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->m:Lcom/ss/android/socialbase/downloader/downloader/x;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/k;->o(I)Z
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 16
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteException;->printStackTrace()V

    .line 17
    :goto_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/impls/b;->o(I)Z

    move-result p1

    return p1
.end method

.method public p(IJ)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-virtual {v0, p1, p2, p3}, Lcom/ss/android/socialbase/downloader/impls/b;->p(IJ)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p2

    const/4 p3, 0x0

    .line 12
    invoke-virtual {p0, p1, p3}, Lcom/ss/android/socialbase/downloader/impls/i;->m(ILjava/util/List;)V

    return-object p2
.end method

.method public p(I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/m;",
            ">;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/impls/b;->p(I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public p(Ljava/lang/String;)Ljava/util/List;
    .locals 1
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

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/impls/b;->p(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public p()V
    .locals 1

    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/impls/b;->p()V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 4
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteException;->printStackTrace()V

    .line 5
    :goto_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/wv/u;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    .line 6
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 7
    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/downloader/r;->u()V

    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->m:Lcom/ss/android/socialbase/downloader/downloader/x;

    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/downloader/k;->p()V

    return-void

    .line 9
    :cond_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->m:Lcom/ss/android/socialbase/downloader/downloader/x;

    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/downloader/k;->p()V

    return-void
.end method

.method public qv(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/impls/b;->qv(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1

    .line 6
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/impls/i;->p(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    return-object p1
.end method

.method public qv()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/downloader/n/vv;->p()Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v0

    const-string v1, "task_resume_delay"

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/16 v0, 0xfa0

    goto :goto_0

    .line 2
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_1

    const-wide/16 v0, 0x3e8

    goto :goto_0

    :cond_1
    const-wide/16 v0, 0x1388

    .line 3
    :goto_0
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/impls/i;->u:Lcom/ss/android/socialbase/downloader/qv/qv;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    .line 4
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/impls/i;->u:Lcom/ss/android/socialbase/downloader/qv/qv;

    invoke-virtual {v3, v2, v0, v1}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method public r(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/impls/b;->r(I)V

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->m:Lcom/ss/android/socialbase/downloader/downloader/x;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/k;->r(I)V

    return-void
.end method

.method public t(I)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/u/wv;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/impls/b;->t(I)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_1

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->m:Lcom/ss/android/socialbase/downloader/downloader/x;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/k;->t(I)Ljava/util/List;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public u()Lcom/ss/android/socialbase/downloader/downloader/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->m:Lcom/ss/android/socialbase/downloader/downloader/x;

    return-object v0
.end method

.method public u(I)Z
    .locals 1

    .line 2
    invoke-static {}, Lcom/ss/android/socialbase/downloader/wv/u;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    .line 3
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->j(I)Z

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->m:Lcom/ss/android/socialbase/downloader/downloader/x;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/k;->u(I)Z

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->m:Lcom/ss/android/socialbase/downloader/downloader/x;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/k;->u(I)Z

    .line 7
    :goto_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/impls/b;->u(I)Z

    move-result p1

    return p1
.end method

.method public vv()Lcom/ss/android/socialbase/downloader/impls/b;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    return-object v0
.end method

.method public vv(II)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-virtual {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/impls/b;->vv(II)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1

    .line 31
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/impls/i;->p(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    return-object p1
.end method

.method public vv(IJ)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-virtual {v0, p1, p2, p3}, Lcom/ss/android/socialbase/downloader/impls/b;->vv(IJ)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1

    const/4 p2, 0x0

    .line 37
    invoke-direct {p0, p1, p2}, Lcom/ss/android/socialbase/downloader/impls/i;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Z)V

    return-object p1
.end method

.method public vv(IJLjava/lang/String;Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 6

    .line 34
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    move v1, p1

    move-wide v2, p2

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/ss/android/socialbase/downloader/impls/b;->vv(IJLjava/lang/String;Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1

    .line 35
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/impls/i;->p(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    return-object p1
.end method

.method public vv(Ljava/lang/String;)Ljava/util/List;
    .locals 1
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

    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/impls/b;->vv(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public vv(IIII)V
    .locals 1

    .line 25
    invoke-static {}, Lcom/ss/android/socialbase/downloader/wv/u;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    .line 26
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 27
    invoke-interface {v0, p1, p2, p3, p4}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv(IIII)V

    return-void

    .line 28
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->m:Lcom/ss/android/socialbase/downloader/downloader/x;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/ss/android/socialbase/downloader/downloader/k;->vv(IIII)V

    return-void

    .line 29
    :cond_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->m:Lcom/ss/android/socialbase/downloader/downloader/x;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/ss/android/socialbase/downloader/downloader/k;->vv(IIII)V

    return-void
.end method

.method public vv(IIIJ)V
    .locals 9

    .line 20
    invoke-static {}, Lcom/ss/android/socialbase/downloader/wv/u;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    .line 21
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v1

    if-eqz v1, :cond_0

    move v2, p1

    move v3, p2

    move v4, p3

    move-wide v5, p4

    .line 22
    invoke-interface/range {v1 .. v6}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv(IIIJ)V

    return-void

    .line 23
    :cond_0
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/impls/i;->m:Lcom/ss/android/socialbase/downloader/downloader/x;

    move v3, p1

    move v4, p2

    move v5, p3

    move-wide v6, p4

    invoke-interface/range {v2 .. v7}, Lcom/ss/android/socialbase/downloader/downloader/k;->vv(IIIJ)V

    return-void

    .line 24
    :cond_1
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/impls/i;->m:Lcom/ss/android/socialbase/downloader/downloader/x;

    move v4, p1

    move v5, p2

    move v6, p3

    move-wide v7, p4

    invoke-interface/range {v3 .. v8}, Lcom/ss/android/socialbase/downloader/downloader/k;->vv(IIIJ)V

    return-void
.end method

.method public vv(IIJ)V
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/ss/android/socialbase/downloader/impls/b;->vv(IIJ)V

    .line 15
    invoke-static {}, Lcom/ss/android/socialbase/downloader/wv/u;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    .line 16
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 17
    invoke-interface {v0, p1, p2, p3, p4}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv(IIJ)V

    return-void

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->m:Lcom/ss/android/socialbase/downloader/downloader/x;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/ss/android/socialbase/downloader/downloader/k;->vv(IIJ)V

    return-void

    .line 19
    :cond_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->m:Lcom/ss/android/socialbase/downloader/downloader/x;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/ss/android/socialbase/downloader/downloader/k;->vv(IIJ)V

    return-void
.end method

.method public vv(ILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/m;",
            ">;)V"
        }
    .end annotation

    if-eqz p2, :cond_1

    .line 43
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 44
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-virtual {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/impls/b;->vv(ILjava/util/List;)V

    .line 45
    invoke-static {}, Lcom/ss/android/socialbase/downloader/wv/u;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 46
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->m:Lcom/ss/android/socialbase/downloader/downloader/x;

    invoke-interface {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/k;->m(ILjava/util/List;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/model/m;)V
    .locals 2

    .line 5
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-virtual {v1, p1}, Lcom/ss/android/socialbase/downloader/impls/b;->vv(Lcom/ss/android/socialbase/downloader/model/m;)V

    .line 7
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    invoke-static {}, Lcom/ss/android/socialbase/downloader/wv/u;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    .line 9
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 10
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv(Lcom/ss/android/socialbase/downloader/model/m;)V

    return-void

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->m:Lcom/ss/android/socialbase/downloader/downloader/x;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/k;->vv(Lcom/ss/android/socialbase/downloader/model/m;)V

    return-void

    .line 12
    :cond_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->m:Lcom/ss/android/socialbase/downloader/downloader/x;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/k;->vv(Lcom/ss/android/socialbase/downloader/model/m;)V

    return-void

    :catchall_0
    move-exception p1

    .line 13
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public vv(ILjava/util/Map;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Lcom/ss/android/socialbase/downloader/u/wv;",
            ">;)Z"
        }
    .end annotation

    .line 47
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-virtual {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/impls/b;->vv(ILjava/util/Map;)Z

    .line 48
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->m:Lcom/ss/android/socialbase/downloader/downloader/x;

    invoke-interface {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/k;->vv(ILjava/util/Map;)Z

    const/4 p1, 0x0

    return p1
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 32
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/impls/b;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    move-result v0

    .line 33
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/impls/i;->p(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    return v0
.end method

.method public wv(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/impls/b;->wv(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1

    .line 36
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/impls/i;->p(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    return-object p1
.end method

.method public wv()V
    .locals 12

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->p:Z

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->i:Z

    if-eqz v0, :cond_1

    const-string v0, "DefaultDownloadCache"

    const-string v1, "resumeUnCompleteTask: has resumed, return!!!"

    .line 3
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/impls/i;->i:Z

    .line 5
    invoke-static {}, Lcom/ss/android/socialbase/downloader/wv/u;->vv()Z

    move-result v1

    if-nez v1, :cond_2

    return-void

    .line 6
    :cond_2
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->l()Lcom/ss/android/socialbase/downloader/downloader/jh;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    .line 7
    invoke-interface {v1}, Lcom/ss/android/socialbase/downloader/downloader/jh;->vv()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 8
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_3

    .line 9
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    goto :goto_0

    :cond_3
    move-object v4, v2

    goto :goto_0

    :cond_4
    move-object v3, v2

    move-object v4, v3

    .line 10
    :goto_0
    new-instance v5, Landroid/util/SparseArray;

    invoke-direct {v5}, Landroid/util/SparseArray;-><init>()V

    .line 11
    monitor-enter p0

    .line 12
    :try_start_0
    iget-object v6, p0, Lcom/ss/android/socialbase/downloader/impls/i;->vv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/impls/b;->vv()Landroid/util/SparseArray;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 13
    :goto_1
    invoke-virtual {v6}, Landroid/util/SparseArray;->size()I

    move-result v9

    if-ge v8, v9, :cond_6

    .line 14
    invoke-virtual {v6, v8}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v9

    if-eqz v9, :cond_5

    .line 15
    invoke-virtual {v6, v9}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    if-eqz v10, :cond_5

    .line 16
    invoke-virtual {v5, v9, v10}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_5
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 17
    :cond_6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    move-result v6

    if-nez v6, :cond_7

    return-void

    :cond_7
    const/4 v6, 0x0

    .line 19
    :goto_2
    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    move-result v8

    if-ge v6, v8, :cond_b

    .line 20
    invoke-virtual {v5, v6}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v8

    if-eqz v8, :cond_a

    .line 21
    invoke-virtual {v5, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    if-eqz v8, :cond_a

    .line 22
    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getRealStatus()I

    move-result v9

    .line 23
    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatusAtDbInit()I

    move-result v10

    if-lez v10, :cond_8

    const/16 v11, 0xb

    if-gt v10, v11, :cond_8

    .line 24
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->n()Lcom/ss/android/socialbase/downloader/i/m;

    move-result-object v10

    const/4 v11, -0x5

    .line 25
    invoke-static {v10, v8, v2, v11}, Lcom/ss/android/socialbase/downloader/i/vv;->vv(Lcom/ss/android/socialbase/downloader/i/m;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/exception/BaseException;I)V

    :cond_8
    if-eqz v3, :cond_a

    if-eqz v4, :cond_a

    .line 26
    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getMimeType()Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_a

    .line 27
    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getMimeType()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v3, v10}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    .line 28
    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v10

    invoke-static {v10}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(I)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v10

    const-string v11, "enable_notification_ui"

    invoke-virtual {v10, v11}, Lcom/ss/android/socialbase/downloader/n/vv;->m(Ljava/lang/String;)I

    move-result v10

    const/4 v11, 0x2

    if-ge v10, v11, :cond_9

    const/4 v10, -0x2

    if-ne v9, v10, :cond_9

    .line 29
    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isPauseReserveOnWifi()Z

    move-result v9

    if-eqz v9, :cond_a

    .line 30
    :cond_9
    invoke-virtual {v8, v7}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setDownloadFromReserveWifi(Z)V

    .line 31
    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_a
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_b
    if-eqz v1, :cond_c

    if-eqz v4, :cond_c

    .line 32
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_c

    .line 33
    invoke-interface {v1, v4, v0}, Lcom/ss/android/socialbase/downloader/downloader/jh;->vv(Ljava/util/List;I)V

    :cond_c
    return-void

    :catchall_0
    move-exception v0

    .line 34
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_4

    :goto_3
    throw v0

    :goto_4
    goto :goto_3
.end method
