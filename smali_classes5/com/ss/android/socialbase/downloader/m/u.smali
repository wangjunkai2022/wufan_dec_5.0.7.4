.class public Lcom/ss/android/socialbase/downloader/m/u;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/ServiceConnection;
.implements Lcom/ss/android/socialbase/downloader/downloader/x;


# static fields
.field private static i:J

.field private static m:Z

.field private static p:I


# instance fields
.field private k:Ljava/util/concurrent/CountDownLatch;

.field private n:Lcom/ss/android/socialbase/downloader/downloader/p$vv$vv;

.field private o:Landroid/os/Handler;

.field private qv:Ljava/lang/Runnable;

.field private u:Lcom/ss/android/socialbase/downloader/m/m;

.field private vv:Lcom/ss/android/socialbase/downloader/m/p;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private wv:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "*>;"
        }
    .end annotation
.end field


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
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->o:Landroid/os/Handler;

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->u:Lcom/ss/android/socialbase/downloader/m/m;

    .line 4
    new-instance v0, Lcom/ss/android/socialbase/downloader/m/u$1;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/m/u$1;-><init>(Lcom/ss/android/socialbase/downloader/m/u;)V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->qv:Ljava/lang/Runnable;

    .line 5
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->k:Ljava/util/concurrent/CountDownLatch;

    .line 6
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->ky()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p0}, Lcom/ss/android/socialbase/downloader/downloader/SqlDownloadCacheService;->vv(Landroid/content/Context;Landroid/content/ServiceConnection;)V

    return-void
.end method

.method static synthetic i(Lcom/ss/android/socialbase/downloader/m/u;)Ljava/util/concurrent/CountDownLatch;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/downloader/m/u;->k:Ljava/util/concurrent/CountDownLatch;

    return-object p0
.end method

.method static synthetic m(Lcom/ss/android/socialbase/downloader/m/u;)Lcom/ss/android/socialbase/downloader/m/m;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/downloader/m/u;->u:Lcom/ss/android/socialbase/downloader/m/m;

    return-object p0
.end method

.method static synthetic n(Lcom/ss/android/socialbase/downloader/m/u;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/downloader/m/u;->o:Landroid/os/Handler;

    return-object p0
.end method

.method private n()Z
    .locals 10

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x1a

    if-lt v0, v2, :cond_0

    return v1

    .line 3
    :cond_0
    sget-boolean v0, Lcom/ss/android/socialbase/downloader/m/u;->m:Z

    if-eqz v0, :cond_1

    return v1

    .line 4
    :cond_1
    sget v0, Lcom/ss/android/socialbase/downloader/m/u;->p:I

    const/4 v2, 0x5

    const-string v3, "SqlDownloadCacheAidlWra"

    if-le v0, v2, :cond_2

    const-string v0, "bindMainProcess: bind too many times!!! "

    .line 5
    invoke-static {v3, v0}, Lcom/ss/android/socialbase/downloader/p/vv;->i(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    .line 6
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 7
    sget-wide v6, Lcom/ss/android/socialbase/downloader/m/u;->i:J

    sub-long v6, v4, v6

    const-wide/16 v8, 0x3a98

    cmp-long v0, v6, v8

    if-gez v0, :cond_3

    const-string v0, "bindMainProcess: time too short since last bind!!! "

    .line 8
    invoke-static {v3, v0}, Lcom/ss/android/socialbase/downloader/p/vv;->i(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    .line 9
    :cond_3
    sget v0, Lcom/ss/android/socialbase/downloader/m/u;->p:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    sput v0, Lcom/ss/android/socialbase/downloader/m/u;->p:I

    .line 10
    sput-wide v4, Lcom/ss/android/socialbase/downloader/m/u;->i:J

    .line 11
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->o:Landroid/os/Handler;

    new-instance v2, Lcom/ss/android/socialbase/downloader/m/u$3;

    invoke-direct {v2, p0}, Lcom/ss/android/socialbase/downloader/m/u$3;-><init>(Lcom/ss/android/socialbase/downloader/m/u;)V

    const-wide/16 v3, 0x3e8

    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return v1
.end method

.method static synthetic o(Lcom/ss/android/socialbase/downloader/m/u;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/m/u;->n()Z

    move-result p0

    return p0
.end method

.method static synthetic p(Lcom/ss/android/socialbase/downloader/m/u;)Lcom/ss/android/socialbase/downloader/m/p;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/downloader/m/u;->vv:Lcom/ss/android/socialbase/downloader/m/p;

    return-object p0
.end method

.method static synthetic qv(Lcom/ss/android/socialbase/downloader/m/u;)Ljava/util/concurrent/Future;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/downloader/m/u;->wv:Ljava/util/concurrent/Future;

    return-object p0
.end method

.method static synthetic u(Lcom/ss/android/socialbase/downloader/m/u;)Ljava/lang/Runnable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/downloader/m/u;->qv:Ljava/lang/Runnable;

    return-object p0
.end method

.method static synthetic u()Z
    .locals 1

    .line 2
    sget-boolean v0, Lcom/ss/android/socialbase/downloader/m/u;->m:Z

    return v0
.end method

.method static synthetic vv(Lcom/ss/android/socialbase/downloader/m/u;)Lcom/ss/android/socialbase/downloader/downloader/p$vv$vv;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/downloader/m/u;->n:Lcom/ss/android/socialbase/downloader/downloader/p$vv$vv;

    return-object p0
.end method

.method static synthetic vv(Z)Z
    .locals 0

    .line 2
    sput-boolean p0, Lcom/ss/android/socialbase/downloader/m/u;->m:Z

    return p0
.end method


# virtual methods
.method public i(IJ)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 1

    .line 8
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->vv:Lcom/ss/android/socialbase/downloader/m/p;

    if-eqz v0, :cond_0

    .line 9
    invoke-interface {v0, p1, p2, p3}, Lcom/ss/android/socialbase/downloader/m/p;->i(IJ)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 10
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    :cond_0
    const/4 p1, 0x0

    return-object p1
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
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->vv:Lcom/ss/android/socialbase/downloader/m/p;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/m/p;->i(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public i(I)V
    .locals 1

    .line 5
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->vv:Lcom/ss/android/socialbase/downloader/m/p;

    if-eqz v0, :cond_0

    .line 6
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/m/p;->i(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    .line 7
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    return-void
.end method

.method public i()Z
    .locals 1

    .line 11
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->vv:Lcom/ss/android/socialbase/downloader/m/p;

    if-eqz v0, :cond_0

    .line 12
    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/m/p;->i()Z

    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    .line 13
    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public jh(I)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Lcom/ss/android/socialbase/downloader/u/wv;",
            ">;"
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public k(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->vv:Lcom/ss/android/socialbase/downloader/m/p;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/m/p;->k(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 3
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public m(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 1

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->vv:Lcom/ss/android/socialbase/downloader/m/p;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/m/p;->m(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public m(IJ)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 1

    .line 14
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->vv:Lcom/ss/android/socialbase/downloader/m/p;

    if-eqz v0, :cond_0

    .line 15
    invoke-interface {v0, p1, p2, p3}, Lcom/ss/android/socialbase/downloader/m/p;->m(IJ)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 16
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    :cond_0
    const/4 p1, 0x0

    return-object p1
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

    .line 8
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->vv:Lcom/ss/android/socialbase/downloader/m/p;

    if-eqz v0, :cond_0

    .line 9
    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/m/p;->m()Ljava/util/List;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 10
    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

    :cond_0
    const/4 v0, 0x0

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

    .line 5
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->vv:Lcom/ss/android/socialbase/downloader/m/p;

    if-eqz v0, :cond_0

    .line 6
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/m/p;->m(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 7
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    :cond_0
    const/4 p1, 0x0

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

    .line 20
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->vv:Lcom/ss/android/socialbase/downloader/m/p;

    if-eqz v0, :cond_0

    .line 21
    invoke-interface {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/m/p;->m(ILjava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    .line 22
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    return-void
.end method

.method public m(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 1

    .line 17
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->vv:Lcom/ss/android/socialbase/downloader/m/p;

    if-eqz v0, :cond_0

    .line 18
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/m/p;->m(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    .line 19
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    return-void
.end method

.method public m(Lcom/ss/android/socialbase/downloader/model/m;)V
    .locals 1

    .line 11
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->vv:Lcom/ss/android/socialbase/downloader/m/p;

    if-eqz v0, :cond_0

    .line 12
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/m/p;->m(Lcom/ss/android/socialbase/downloader/model/m;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    .line 13
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    return-void
.end method

.method public n(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 1

    .line 12
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->vv:Lcom/ss/android/socialbase/downloader/m/p;

    if-eqz v0, :cond_0

    .line 13
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/m/p;->n(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 14
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public o()Z
    .locals 1

    .line 5
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->vv:Lcom/ss/android/socialbase/downloader/m/p;

    if-eqz v0, :cond_0

    .line 6
    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/m/p;->o()Z

    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    .line 7
    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public o(I)Z
    .locals 1

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->vv:Lcom/ss/android/socialbase/downloader/m/p;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/m/p;->o(I)Z

    move-result p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1

    const/4 p1, 0x1

    .line 1
    sput-boolean p1, Lcom/ss/android/socialbase/downloader/m/u;->m:Z

    .line 2
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/m/u;->o:Landroid/os/Handler;

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->qv:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 3
    :try_start_0
    invoke-static {p2}, Lcom/ss/android/socialbase/downloader/m/p$vv;->vv(Landroid/os/IBinder;)Lcom/ss/android/socialbase/downloader/m/p;

    move-result-object p1

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/m/u;->vv:Lcom/ss/android/socialbase/downloader/m/p;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 5
    :goto_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->jh()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    new-instance v0, Lcom/ss/android/socialbase/downloader/m/u$2;

    invoke-direct {v0, p0, p2}, Lcom/ss/android/socialbase/downloader/m/u$2;-><init>(Lcom/ss/android/socialbase/downloader/m/u;Landroid/os/IBinder;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p1

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/m/u;->wv:Ljava/util/concurrent/Future;

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0

    const/4 p1, 0x0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/m/u;->vv:Lcom/ss/android/socialbase/downloader/m/p;

    const/4 p1, 0x0

    .line 2
    sput-boolean p1, Lcom/ss/android/socialbase/downloader/m/u;->m:Z

    return-void
.end method

.method public p(IJ)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 1

    .line 11
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->vv:Lcom/ss/android/socialbase/downloader/m/p;

    if-eqz v0, :cond_0

    .line 12
    invoke-interface {v0, p1, p2, p3}, Lcom/ss/android/socialbase/downloader/m/p;->p(IJ)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 13
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    :cond_0
    const/4 p1, 0x0

    return-object p1
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

    .line 5
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->vv:Lcom/ss/android/socialbase/downloader/m/p;

    if-eqz v0, :cond_0

    .line 6
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/m/p;->p(I)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 7
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    :cond_0
    const/4 p1, 0x0

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

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->vv:Lcom/ss/android/socialbase/downloader/m/p;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/m/p;->p(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public p()V
    .locals 1

    .line 8
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->vv:Lcom/ss/android/socialbase/downloader/m/p;

    if-eqz v0, :cond_0

    .line 9
    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/m/p;->p()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception v0

    .line 10
    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

    return-void
.end method

.method public qv(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 1

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->vv:Lcom/ss/android/socialbase/downloader/m/p;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/m/p;->qv(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public r(I)V
    .locals 0

    return-void
.end method

.method public synthetic t(I)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/m/u;->vv(I)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public u(I)Z
    .locals 1

    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->vv:Lcom/ss/android/socialbase/downloader/m/p;

    if-eqz v0, :cond_0

    .line 4
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/m/p;->u(I)Z

    move-result p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 5
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public vv(II)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 1

    .line 29
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->vv:Lcom/ss/android/socialbase/downloader/m/p;

    if-eqz v0, :cond_0

    .line 30
    invoke-interface {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/m/p;->vv(II)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 31
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public vv(IJ)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 1

    .line 38
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->vv:Lcom/ss/android/socialbase/downloader/m/p;

    if-eqz v0, :cond_0

    .line 39
    invoke-interface {v0, p1, p2, p3}, Lcom/ss/android/socialbase/downloader/m/p;->vv(IJ)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 40
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public vv(IJLjava/lang/String;Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 6

    .line 35
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->vv:Lcom/ss/android/socialbase/downloader/m/p;

    if-eqz v0, :cond_0

    move v1, p1

    move-wide v2, p2

    move-object v4, p4

    move-object v5, p5

    .line 36
    invoke-interface/range {v0 .. v5}, Lcom/ss/android/socialbase/downloader/m/p;->vv(IJLjava/lang/String;Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 37
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public vv(I)Ljava/util/ArrayList;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/ArrayList<",
            "Lcom/ss/android/socialbase/downloader/u/wv;",
            ">;"
        }
    .end annotation

    const/4 p1, 0x0

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

    .line 14
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->vv:Lcom/ss/android/socialbase/downloader/m/p;

    if-eqz v0, :cond_0

    .line 15
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/m/p;->vv(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 16
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public vv()V
    .locals 1

    .line 11
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->vv:Lcom/ss/android/socialbase/downloader/m/p;

    if-eqz v0, :cond_0

    .line 12
    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/m/p;->vv()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception v0

    .line 13
    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

    return-void
.end method

.method public vv(IIII)V
    .locals 1

    .line 26
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->vv:Lcom/ss/android/socialbase/downloader/m/p;

    if-eqz v0, :cond_0

    .line 27
    invoke-interface {v0, p1, p2, p3, p4}, Lcom/ss/android/socialbase/downloader/m/p;->vv(IIII)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    .line 28
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    return-void
.end method

.method public vv(IIIJ)V
    .locals 6

    .line 23
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->vv:Lcom/ss/android/socialbase/downloader/m/p;

    if-eqz v0, :cond_0

    move v1, p1

    move v2, p2

    move v3, p3

    move-wide v4, p4

    .line 24
    invoke-interface/range {v0 .. v5}, Lcom/ss/android/socialbase/downloader/m/p;->vv(IIIJ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    .line 25
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    return-void
.end method

.method public vv(IIJ)V
    .locals 1

    .line 20
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->vv:Lcom/ss/android/socialbase/downloader/m/p;

    if-eqz v0, :cond_0

    .line 21
    invoke-interface {v0, p1, p2, p3, p4}, Lcom/ss/android/socialbase/downloader/m/p;->vv(IIJ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    .line 22
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

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

    .line 41
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->vv:Lcom/ss/android/socialbase/downloader/m/p;

    if-eqz v0, :cond_0

    .line 42
    invoke-interface {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/m/p;->vv(ILjava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    .line 43
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    return-void
.end method

.method public vv(Landroid/util/SparseArray;Landroid/util/SparseArray;Lcom/ss/android/socialbase/downloader/m/i;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray<",
            "Lcom/ss/android/socialbase/downloader/model/DownloadInfo;",
            ">;",
            "Landroid/util/SparseArray<",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/m;",
            ">;>;",
            "Lcom/ss/android/socialbase/downloader/m/i;",
            ")V"
        }
    .end annotation

    .line 4
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->jh()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/ss/android/socialbase/downloader/m/u$4;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/ss/android/socialbase/downloader/m/u$4;-><init>(Lcom/ss/android/socialbase/downloader/m/u;Landroid/util/SparseArray;Landroid/util/SparseArray;Lcom/ss/android/socialbase/downloader/m/i;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/downloader/p$vv$vv;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/m/u;->n:Lcom/ss/android/socialbase/downloader/downloader/p$vv$vv;

    return-void
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/m/m;)V
    .locals 1

    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->vv:Lcom/ss/android/socialbase/downloader/m/p;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 7
    :try_start_1
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/m/p;->vv(Lcom/ss/android/socialbase/downloader/m/m;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 8
    :try_start_2
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    goto :goto_0

    .line 9
    :cond_0
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/m/u;->u:Lcom/ss/android/socialbase/downloader/m/m;

    .line 10
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/model/m;)V
    .locals 1

    .line 17
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->vv:Lcom/ss/android/socialbase/downloader/m/p;

    if-eqz v0, :cond_0

    .line 18
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/m/p;->vv(Lcom/ss/android/socialbase/downloader/model/m;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    .line 19
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    return-void
.end method

.method public vv(ILjava/util/Map;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Lcom/ss/android/socialbase/downloader/u/wv;",
            ">;)Z"
        }
    .end annotation

    const/4 p1, 0x0

    return p1
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z
    .locals 1

    .line 32
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->vv:Lcom/ss/android/socialbase/downloader/m/p;

    if-eqz v0, :cond_0

    .line 33
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/m/p;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    move-result p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 34
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public wv(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/m/u;->vv:Lcom/ss/android/socialbase/downloader/m/p;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/m/p;->wv(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 3
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
