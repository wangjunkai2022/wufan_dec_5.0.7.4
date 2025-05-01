.class public Lcom/ss/android/socialbase/downloader/o/vv;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/socialbase/downloader/o/m;


# instance fields
.field private b:Lcom/ss/android/socialbase/downloader/u/vv;

.field private final d:Ljava/lang/Runnable;

.field private final i:Ljava/lang/Object;

.field private j:I

.field private volatile jh:Z

.field private k:Lcom/ss/android/socialbase/downloader/u/vv;

.field private final m:I

.field private n:Lcom/ss/android/socialbase/downloader/u/vv;

.field private final o:Ljava/lang/Object;

.field private final p:I

.field private volatile q:Ljava/util/concurrent/Future;

.field private qv:Lcom/ss/android/socialbase/downloader/u/vv;

.field private volatile r:Z

.field private volatile t:Ljava/lang/Throwable;

.field private u:Lcom/ss/android/socialbase/downloader/u/vv;

.field private final vv:Ljava/io/InputStream;

.field private wv:Lcom/ss/android/socialbase/downloader/u/vv;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/o/vv;->i:Ljava/lang/Object;

    .line 3
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/o/vv;->o:Ljava/lang/Object;

    .line 4
    new-instance v0, Lcom/ss/android/socialbase/downloader/o/vv$1;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/o/vv$1;-><init>(Lcom/ss/android/socialbase/downloader/o/vv;)V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/o/vv;->d:Ljava/lang/Runnable;

    .line 5
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/o/vv;->vv:Ljava/io/InputStream;

    .line 6
    iput p2, p0, Lcom/ss/android/socialbase/downloader/o/vv;->m:I

    const/16 p1, 0x40

    if-gtz p3, :cond_0

    const/4 p3, 0x1

    goto :goto_0

    :cond_0
    if-le p3, p1, :cond_1

    const/16 p3, 0x40

    .line 7
    :cond_1
    :goto_0
    iput p3, p0, Lcom/ss/android/socialbase/downloader/o/vv;->p:I

    .line 8
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/o/vv;->p()V

    return-void
.end method

.method private i()Lcom/ss/android/socialbase/downloader/u/vv;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/u/j;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/o/vv;->qv:Lcom/ss/android/socialbase/downloader/u/vv;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 2
    iget-boolean v2, p0, Lcom/ss/android/socialbase/downloader/o/vv;->jh:Z

    if-nez v2, :cond_0

    .line 3
    iget-object v2, v0, Lcom/ss/android/socialbase/downloader/u/vv;->i:Lcom/ss/android/socialbase/downloader/u/vv;

    iput-object v2, p0, Lcom/ss/android/socialbase/downloader/o/vv;->qv:Lcom/ss/android/socialbase/downloader/u/vv;

    .line 4
    iput-object v1, v0, Lcom/ss/android/socialbase/downloader/u/vv;->i:Lcom/ss/android/socialbase/downloader/u/vv;

    return-object v0

    .line 5
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/u/j;

    const-string v1, ""

    invoke-direct {v0, v1}, Lcom/ss/android/socialbase/downloader/u/j;-><init>(Ljava/lang/String;)V

    throw v0

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/o/vv;->i:Ljava/lang/Object;

    monitor-enter v0

    .line 7
    :try_start_0
    iget-boolean v2, p0, Lcom/ss/android/socialbase/downloader/o/vv;->jh:Z

    if-nez v2, :cond_5

    .line 8
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/o/vv;->u:Lcom/ss/android/socialbase/downloader/u/vv;

    if-nez v2, :cond_2

    .line 9
    iget v3, p0, Lcom/ss/android/socialbase/downloader/o/vv;->j:I

    iget v4, p0, Lcom/ss/android/socialbase/downloader/o/vv;->p:I

    if-ge v3, v4, :cond_2

    add-int/lit8 v3, v3, 0x1

    .line 10
    iput v3, p0, Lcom/ss/android/socialbase/downloader/o/vv;->j:I

    .line 11
    new-instance v1, Lcom/ss/android/socialbase/downloader/u/vv;

    iget v2, p0, Lcom/ss/android/socialbase/downloader/o/vv;->m:I

    invoke-direct {v1, v2}, Lcom/ss/android/socialbase/downloader/u/vv;-><init>(I)V

    .line 12
    monitor-exit v0

    return-object v1

    :cond_2
    :goto_0
    if-nez v2, :cond_4

    .line 13
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/o/vv;->i:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->wait()V

    .line 14
    iget-boolean v2, p0, Lcom/ss/android/socialbase/downloader/o/vv;->jh:Z

    if-nez v2, :cond_3

    .line 15
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/o/vv;->u:Lcom/ss/android/socialbase/downloader/u/vv;

    goto :goto_0

    .line 16
    :cond_3
    new-instance v1, Lcom/ss/android/socialbase/downloader/u/j;

    const-string v2, ""

    invoke-direct {v1, v2}, Lcom/ss/android/socialbase/downloader/u/j;-><init>(Ljava/lang/String;)V

    throw v1

    .line 17
    :cond_4
    iget-object v3, v2, Lcom/ss/android/socialbase/downloader/u/vv;->i:Lcom/ss/android/socialbase/downloader/u/vv;

    iput-object v3, p0, Lcom/ss/android/socialbase/downloader/o/vv;->qv:Lcom/ss/android/socialbase/downloader/u/vv;

    .line 18
    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/o/vv;->n:Lcom/ss/android/socialbase/downloader/u/vv;

    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/o/vv;->u:Lcom/ss/android/socialbase/downloader/u/vv;

    .line 19
    iput-object v1, v2, Lcom/ss/android/socialbase/downloader/u/vv;->i:Lcom/ss/android/socialbase/downloader/u/vv;

    .line 20
    monitor-exit v0

    return-object v2

    .line 21
    :cond_5
    new-instance v1, Lcom/ss/android/socialbase/downloader/u/j;

    const-string v2, ""

    invoke-direct {v1, v2}, Lcom/ss/android/socialbase/downloader/u/j;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 22
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    throw v1

    :goto_2
    goto :goto_1
.end method

.method static synthetic m(Lcom/ss/android/socialbase/downloader/o/vv;)Ljava/io/InputStream;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/downloader/o/vv;->vv:Ljava/io/InputStream;

    return-object p0
.end method

.method private m(Lcom/ss/android/socialbase/downloader/u/vv;)V
    .locals 2

    .line 10
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/o/vv;->i:Ljava/lang/Object;

    monitor-enter v0

    .line 11
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/o/vv;->n:Lcom/ss/android/socialbase/downloader/u/vv;

    if-nez v1, :cond_0

    .line 12
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/o/vv;->n:Lcom/ss/android/socialbase/downloader/u/vv;

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/o/vv;->u:Lcom/ss/android/socialbase/downloader/u/vv;

    .line 13
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/o/vv;->i:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->notify()V

    goto :goto_0

    .line 14
    :cond_0
    iput-object p1, v1, Lcom/ss/android/socialbase/downloader/u/vv;->i:Lcom/ss/android/socialbase/downloader/u/vv;

    .line 15
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/o/vv;->n:Lcom/ss/android/socialbase/downloader/u/vv;

    .line 16
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private o()Lcom/ss/android/socialbase/downloader/u/vv;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/o/vv;->b:Lcom/ss/android/socialbase/downloader/u/vv;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    iget-object v2, v0, Lcom/ss/android/socialbase/downloader/u/vv;->i:Lcom/ss/android/socialbase/downloader/u/vv;

    iput-object v2, p0, Lcom/ss/android/socialbase/downloader/o/vv;->b:Lcom/ss/android/socialbase/downloader/u/vv;

    .line 3
    iput-object v1, v0, Lcom/ss/android/socialbase/downloader/u/vv;->i:Lcom/ss/android/socialbase/downloader/u/vv;

    return-object v0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/o/vv;->o:Ljava/lang/Object;

    monitor-enter v0

    .line 5
    :try_start_0
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/o/vv;->wv:Lcom/ss/android/socialbase/downloader/u/vv;

    if-nez v2, :cond_3

    .line 6
    :cond_1
    iget-boolean v2, p0, Lcom/ss/android/socialbase/downloader/o/vv;->r:Z

    if-eqz v2, :cond_2

    .line 7
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/o/vv;->u()V

    .line 8
    :cond_2
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/o/vv;->o:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->wait()V

    .line 9
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/o/vv;->wv:Lcom/ss/android/socialbase/downloader/u/vv;

    if-eqz v2, :cond_1

    .line 10
    :cond_3
    iget-object v3, v2, Lcom/ss/android/socialbase/downloader/u/vv;->i:Lcom/ss/android/socialbase/downloader/u/vv;

    iput-object v3, p0, Lcom/ss/android/socialbase/downloader/o/vv;->b:Lcom/ss/android/socialbase/downloader/u/vv;

    .line 11
    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/o/vv;->k:Lcom/ss/android/socialbase/downloader/u/vv;

    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/o/vv;->wv:Lcom/ss/android/socialbase/downloader/u/vv;

    .line 12
    iput-object v1, v2, Lcom/ss/android/socialbase/downloader/u/vv;->i:Lcom/ss/android/socialbase/downloader/u/vv;

    .line 13
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v1

    .line 14
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :goto_0
    throw v1

    :goto_1
    goto :goto_0
.end method

.method static synthetic p(Lcom/ss/android/socialbase/downloader/o/vv;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/downloader/o/vv;->o:Ljava/lang/Object;

    return-object p0
.end method

.method private p()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 2
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->d()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/o/vv;->d:Ljava/lang/Runnable;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/o/vv;->q:Ljava/util/concurrent/Future;

    return-void
.end method

.method private p(Lcom/ss/android/socialbase/downloader/u/vv;)V
    .locals 2

    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/o/vv;->o:Ljava/lang/Object;

    monitor-enter v0

    .line 5
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/o/vv;->k:Lcom/ss/android/socialbase/downloader/u/vv;

    if-nez v1, :cond_0

    .line 6
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/o/vv;->k:Lcom/ss/android/socialbase/downloader/u/vv;

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/o/vv;->wv:Lcom/ss/android/socialbase/downloader/u/vv;

    .line 7
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/o/vv;->o:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->notify()V

    goto :goto_0

    .line 8
    :cond_0
    iput-object p1, v1, Lcom/ss/android/socialbase/downloader/u/vv;->i:Lcom/ss/android/socialbase/downloader/u/vv;

    .line 9
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/o/vv;->k:Lcom/ss/android/socialbase/downloader/u/vv;

    .line 10
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private u()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/o/vv;->t:Ljava/lang/Throwable;

    if-eqz v0, :cond_1

    .line 2
    instance-of v1, v0, Lcom/ss/android/socialbase/downloader/u/j;

    if-eqz v1, :cond_0

    .line 3
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const/16 v1, 0x42c

    const-string v2, "async reader closed!"

    invoke-direct {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    throw v0

    :cond_0
    const-string v1, "async_read"

    .line 4
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/wv/u;->vv(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 5
    :cond_1
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const/16 v1, 0x42d

    const-string v2, "async reader terminated!"

    invoke-direct {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    throw v0
.end method

.method static synthetic vv(Lcom/ss/android/socialbase/downloader/o/vv;)Lcom/ss/android/socialbase/downloader/u/vv;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/u/j;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/o/vv;->i()Lcom/ss/android/socialbase/downloader/u/vv;

    move-result-object p0

    return-object p0
.end method

.method static synthetic vv(Lcom/ss/android/socialbase/downloader/o/vv;Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/o/vv;->t:Ljava/lang/Throwable;

    return-object p1
.end method

.method static synthetic vv(Lcom/ss/android/socialbase/downloader/o/vv;Lcom/ss/android/socialbase/downloader/u/vv;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/o/vv;->p(Lcom/ss/android/socialbase/downloader/u/vv;)V

    return-void
.end method

.method static synthetic vv(Lcom/ss/android/socialbase/downloader/o/vv;Z)Z
    .locals 0

    .line 4
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/o/vv;->r:Z

    return p1
.end method


# virtual methods
.method public m()V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/o/vv;->i:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    .line 3
    :try_start_0
    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/o/vv;->jh:Z

    .line 4
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/o/vv;->i:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->notify()V

    .line 5
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 6
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/o/vv;->q:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_0

    .line 7
    :try_start_1
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/o/vv;->q:Ljava/util/concurrent/Future;

    :cond_0
    return-void

    :catchall_1
    move-exception v1

    .line 9
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1
.end method

.method public vv()Lcom/ss/android/socialbase/downloader/u/vv;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 5
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/o/vv;->o()Lcom/ss/android/socialbase/downloader/u/vv;

    move-result-object v0

    return-object v0
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/u/vv;)V
    .locals 0

    .line 6
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/o/vv;->m(Lcom/ss/android/socialbase/downloader/u/vv;)V

    return-void
.end method
