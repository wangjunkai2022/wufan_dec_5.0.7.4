.class Lcom/kwad/sdk/core/videocache/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/sdk/core/videocache/k$a;
    }
.end annotation


# instance fields
.field private final aDC:Lcom/kwad/sdk/core/videocache/m;

.field private final aDD:Lcom/kwad/sdk/core/videocache/a;

.field private final aDE:Ljava/lang/Object;

.field private final aDF:Ljava/lang/Object;

.field private final aDG:Ljava/util/concurrent/atomic/AtomicInteger;

.field private volatile aDH:Ljava/lang/Thread;

.field private volatile aDI:I

.field private volatile kI:Z


# direct methods
.method public constructor <init>(Lcom/kwad/sdk/core/videocache/m;Lcom/kwad/sdk/core/videocache/a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/videocache/k;->aDE:Ljava/lang/Object;

    .line 3
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/videocache/k;->aDF:Ljava/lang/Object;

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Lcom/kwad/sdk/core/videocache/k;->aDI:I

    .line 5
    invoke-static {p1}, Lcom/kwad/sdk/utils/aq;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/kwad/sdk/core/videocache/m;

    iput-object p1, p0, Lcom/kwad/sdk/core/videocache/k;->aDC:Lcom/kwad/sdk/core/videocache/m;

    .line 6
    invoke-static {p2}, Lcom/kwad/sdk/utils/aq;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/kwad/sdk/core/videocache/a;

    iput-object p1, p0, Lcom/kwad/sdk/core/videocache/k;->aDD:Lcom/kwad/sdk/core/videocache/a;

    .line 7
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Lcom/kwad/sdk/core/videocache/k;->aDG:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method private Hk()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/videocache/k;->aDG:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-gtz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v1, p0, Lcom/kwad/sdk/core/videocache/k;->aDG:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 3
    new-instance v1, Lcom/kwad/sdk/core/videocache/ProxyCacheException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Error reading source "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " times"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/kwad/sdk/core/videocache/ProxyCacheException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private declared-synchronized Hl()V
    .locals 4

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/kwad/sdk/core/videocache/k;->aDH:Ljava/lang/Thread;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kwad/sdk/core/videocache/k;->aDH:Ljava/lang/Thread;

    .line 2
    invoke-virtual {v0}, Ljava/lang/Thread;->getState()Ljava/lang/Thread$State;

    move-result-object v0

    sget-object v2, Ljava/lang/Thread$State;->TERMINATED:Ljava/lang/Thread$State;

    if-eq v0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 3
    :goto_0
    iget-boolean v2, p0, Lcom/kwad/sdk/core/videocache/k;->kI:Z

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/kwad/sdk/core/videocache/k;->aDD:Lcom/kwad/sdk/core/videocache/a;

    invoke-interface {v2}, Lcom/kwad/sdk/core/videocache/a;->isCompleted()Z

    move-result v2

    if-nez v2, :cond_1

    if-nez v0, :cond_1

    .line 4
    new-instance v0, Ljava/lang/Thread;

    new-instance v2, Lcom/kwad/sdk/core/videocache/k$a;

    invoke-direct {v2, p0, v1}, Lcom/kwad/sdk/core/videocache/k$a;-><init>(Lcom/kwad/sdk/core/videocache/k;B)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Source reader for "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/kwad/sdk/core/videocache/k;->aDC:Lcom/kwad/sdk/core/videocache/m;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/kwad/sdk/core/videocache/k;->aDH:Ljava/lang/Thread;

    .line 5
    iget-object v0, p0, Lcom/kwad/sdk/core/videocache/k;->aDH:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private Hm()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/videocache/k;->aDE:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/kwad/sdk/core/videocache/k;->aDE:Ljava/lang/Object;

    const-wide/16 v2, 0x3e8

    invoke-virtual {v1, v2, v3}, Ljava/lang/Object;->wait(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    :try_start_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :catch_0
    move-exception v1

    .line 4
    new-instance v2, Lcom/kwad/sdk/core/videocache/ProxyCacheException;

    const-string v3, "Waiting source data is interrupted!"

    invoke-direct {v2, v3, v1}, Lcom/kwad/sdk/core/videocache/ProxyCacheException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    .line 5
    :goto_0
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method private Hn()V
    .locals 8

    const-wide/16 v0, -0x1

    const-wide/16 v2, 0x0

    .line 1
    :try_start_0
    iget-object v4, p0, Lcom/kwad/sdk/core/videocache/k;->aDD:Lcom/kwad/sdk/core/videocache/a;

    invoke-interface {v4}, Lcom/kwad/sdk/core/videocache/a;->GY()J

    move-result-wide v2

    .line 2
    iget-object v4, p0, Lcom/kwad/sdk/core/videocache/k;->aDC:Lcom/kwad/sdk/core/videocache/m;

    invoke-interface {v4, v2, v3}, Lcom/kwad/sdk/core/videocache/m;->aA(J)V

    .line 3
    iget-object v4, p0, Lcom/kwad/sdk/core/videocache/k;->aDC:Lcom/kwad/sdk/core/videocache/m;

    invoke-interface {v4}, Lcom/kwad/sdk/core/videocache/m;->length()J

    move-result-wide v0

    const/16 v4, 0x400

    new-array v4, v4, [B

    .line 4
    :goto_0
    iget-object v5, p0, Lcom/kwad/sdk/core/videocache/k;->aDC:Lcom/kwad/sdk/core/videocache/m;

    invoke-interface {v5, v4}, Lcom/kwad/sdk/core/videocache/m;->read([B)I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_1

    .line 5
    iget-object v6, p0, Lcom/kwad/sdk/core/videocache/k;->aDF:Ljava/lang/Object;

    monitor-enter v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 6
    :try_start_1
    invoke-direct {p0}, Lcom/kwad/sdk/core/videocache/k;->isStopped()Z

    move-result v7

    if-eqz v7, :cond_0

    .line 7
    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    :goto_1
    invoke-direct {p0}, Lcom/kwad/sdk/core/videocache/k;->Hp()V

    .line 9
    invoke-direct {p0, v2, v3, v0, v1}, Lcom/kwad/sdk/core/videocache/k;->j(JJ)V

    return-void

    .line 10
    :cond_0
    :try_start_2
    iget-object v7, p0, Lcom/kwad/sdk/core/videocache/k;->aDD:Lcom/kwad/sdk/core/videocache/a;

    invoke-interface {v7, v4, v5}, Lcom/kwad/sdk/core/videocache/a;->d([BI)V

    .line 11
    monitor-exit v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    int-to-long v5, v5

    add-long/2addr v2, v5

    .line 12
    :try_start_3
    invoke-direct {p0, v2, v3, v0, v1}, Lcom/kwad/sdk/core/videocache/k;->j(JJ)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_0
    move-exception v4

    .line 13
    :try_start_4
    monitor-exit v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw v4

    .line 14
    :cond_1
    invoke-direct {p0}, Lcom/kwad/sdk/core/videocache/k;->tryComplete()V

    .line 15
    invoke-direct {p0}, Lcom/kwad/sdk/core/videocache/k;->Ho()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v4

    .line 16
    :try_start_6
    iget-object v5, p0, Lcom/kwad/sdk/core/videocache/k;->aDG:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 17
    invoke-static {v4}, Lcom/kwad/sdk/core/videocache/k;->onError(Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception v4

    .line 18
    invoke-direct {p0}, Lcom/kwad/sdk/core/videocache/k;->Hp()V

    .line 19
    invoke-direct {p0, v2, v3, v0, v1}, Lcom/kwad/sdk/core/videocache/k;->j(JJ)V

    .line 20
    goto :goto_3

    :goto_2
    throw v4

    :goto_3
    goto :goto_2
.end method

.method private Ho()V
    .locals 1

    const/16 v0, 0x64

    .line 1
    iput v0, p0, Lcom/kwad/sdk/core/videocache/k;->aDI:I

    .line 2
    iget v0, p0, Lcom/kwad/sdk/core/videocache/k;->aDI:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/core/videocache/k;->dr(I)V

    return-void
.end method

.method private Hp()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/kwad/sdk/core/videocache/k;->aDC:Lcom/kwad/sdk/core/videocache/m;

    invoke-interface {v0}, Lcom/kwad/sdk/core/videocache/m;->close()V
    :try_end_0
    .catch Lcom/kwad/sdk/core/videocache/ProxyCacheException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 2
    new-instance v1, Lcom/kwad/sdk/core/videocache/ProxyCacheException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Error closing source "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/kwad/sdk/core/videocache/k;->aDC:Lcom/kwad/sdk/core/videocache/m;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lcom/kwad/sdk/core/videocache/ProxyCacheException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v1}, Lcom/kwad/sdk/core/videocache/k;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/sdk/core/videocache/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/videocache/k;->Hn()V

    return-void
.end method

.method private isStopped()Z
    .locals 1

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/kwad/sdk/core/videocache/k;->kI:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method private j(JJ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/kwad/sdk/core/videocache/k;->k(JJ)V

    .line 2
    iget-object p1, p0, Lcom/kwad/sdk/core/videocache/k;->aDE:Ljava/lang/Object;

    monitor-enter p1

    .line 3
    :try_start_0
    iget-object p2, p0, Lcom/kwad/sdk/core/videocache/k;->aDE:Ljava/lang/Object;

    invoke-virtual {p2}, Ljava/lang/Object;->notifyAll()V

    .line 4
    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method private k(JJ)V
    .locals 5

    const-wide/16 v0, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    cmp-long v4, p3, v0

    if-nez v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_1

    const/16 p1, 0x64

    goto :goto_1

    :cond_1
    long-to-float p1, p1

    long-to-float p2, p3

    div-float/2addr p1, p2

    const/high16 p2, 0x42c80000    # 100.0f

    mul-float p1, p1, p2

    float-to-int p1, p1

    .line 1
    :goto_1
    iget p2, p0, Lcom/kwad/sdk/core/videocache/k;->aDI:I

    if-eq p1, p2, :cond_2

    const/4 p2, 0x1

    goto :goto_2

    :cond_2
    const/4 p2, 0x0

    :goto_2
    cmp-long v4, p3, v0

    if-ltz v4, :cond_3

    goto :goto_3

    :cond_3
    const/4 v2, 0x0

    :goto_3
    if-eqz v2, :cond_4

    if-eqz p2, :cond_4

    .line 2
    invoke-virtual {p0, p1}, Lcom/kwad/sdk/core/videocache/k;->dr(I)V

    .line 3
    :cond_4
    iput p1, p0, Lcom/kwad/sdk/core/videocache/k;->aDI:I

    return-void
.end method

.method private static onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    instance-of p0, p0, Lcom/kwad/sdk/core/videocache/InterruptedProxyCacheException;

    const-string v0, "ProxyCache"

    if-eqz p0, :cond_0

    const-string p0, "ProxyCache is interrupted"

    .line 2
    invoke-static {v0, p0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string p0, "ProxyCache error"

    .line 3
    invoke-static {v0, p0}, Lcom/kwad/sdk/core/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private tryComplete()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/videocache/k;->aDF:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    invoke-direct {p0}, Lcom/kwad/sdk/core/videocache/k;->isStopped()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/kwad/sdk/core/videocache/k;->aDD:Lcom/kwad/sdk/core/videocache/a;

    invoke-interface {v1}, Lcom/kwad/sdk/core/videocache/a;->GY()J

    move-result-wide v1

    iget-object v3, p0, Lcom/kwad/sdk/core/videocache/k;->aDC:Lcom/kwad/sdk/core/videocache/m;

    invoke-interface {v3}, Lcom/kwad/sdk/core/videocache/m;->length()J

    move-result-wide v3

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    .line 3
    iget-object v1, p0, Lcom/kwad/sdk/core/videocache/k;->aDD:Lcom/kwad/sdk/core/videocache/a;

    invoke-interface {v1}, Lcom/kwad/sdk/core/videocache/a;->complete()V

    .line 4
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public final a([BJI)I
    .locals 5

    const/16 p4, 0x400

    .line 2
    invoke-static {p1, p2, p3, p4}, Lcom/kwad/sdk/core/videocache/l;->b([BJI)V

    .line 3
    :goto_0
    iget-object v0, p0, Lcom/kwad/sdk/core/videocache/k;->aDD:Lcom/kwad/sdk/core/videocache/a;

    invoke-interface {v0}, Lcom/kwad/sdk/core/videocache/a;->isCompleted()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/kwad/sdk/core/videocache/k;->aDD:Lcom/kwad/sdk/core/videocache/a;

    invoke-interface {v0}, Lcom/kwad/sdk/core/videocache/a;->GY()J

    move-result-wide v0

    const-wide/16 v2, 0x400

    add-long/2addr v2, p2

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    iget-boolean v0, p0, Lcom/kwad/sdk/core/videocache/k;->kI:Z

    if-nez v0, :cond_0

    .line 4
    invoke-direct {p0}, Lcom/kwad/sdk/core/videocache/k;->Hl()V

    .line 5
    invoke-direct {p0}, Lcom/kwad/sdk/core/videocache/k;->Hm()V

    .line 6
    invoke-direct {p0}, Lcom/kwad/sdk/core/videocache/k;->Hk()V

    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/kwad/sdk/core/videocache/k;->aDD:Lcom/kwad/sdk/core/videocache/a;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/kwad/sdk/core/videocache/a;->a([BJI)I

    move-result p1

    .line 8
    iget-object p2, p0, Lcom/kwad/sdk/core/videocache/k;->aDD:Lcom/kwad/sdk/core/videocache/a;

    invoke-interface {p2}, Lcom/kwad/sdk/core/videocache/a;->isCompleted()Z

    move-result p2

    if-eqz p2, :cond_1

    iget p2, p0, Lcom/kwad/sdk/core/videocache/k;->aDI:I

    const/16 p3, 0x64

    if-eq p2, p3, :cond_1

    .line 9
    iput p3, p0, Lcom/kwad/sdk/core/videocache/k;->aDI:I

    .line 10
    invoke-virtual {p0, p3}, Lcom/kwad/sdk/core/videocache/k;->dr(I)V

    :cond_1
    return p1
.end method

.method protected dr(I)V
    .locals 0

    return-void
.end method

.method public final shutdown()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/videocache/k;->aDF:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    const-string v1, "ProxyCache"

    .line 2
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Shutdown proxy for "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/kwad/sdk/core/videocache/k;->aDC:Lcom/kwad/sdk/core/videocache/m;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x1

    .line 3
    :try_start_1
    iput-boolean v1, p0, Lcom/kwad/sdk/core/videocache/k;->kI:Z

    .line 4
    iget-object v1, p0, Lcom/kwad/sdk/core/videocache/k;->aDH:Ljava/lang/Thread;

    if-eqz v1, :cond_0

    .line 5
    iget-object v1, p0, Lcom/kwad/sdk/core/videocache/k;->aDH:Ljava/lang/Thread;

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 6
    :cond_0
    iget-object v1, p0, Lcom/kwad/sdk/core/videocache/k;->aDD:Lcom/kwad/sdk/core/videocache/a;

    invoke-interface {v1}, Lcom/kwad/sdk/core/videocache/a;->close()V
    :try_end_1
    .catch Lcom/kwad/sdk/core/videocache/ProxyCacheException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 7
    :try_start_2
    invoke-static {v1}, Lcom/kwad/sdk/core/videocache/k;->onError(Ljava/lang/Throwable;)V

    .line 8
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method
