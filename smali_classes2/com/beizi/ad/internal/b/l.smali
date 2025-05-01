.class Lcom/beizi/ad/internal/b/l;
.super Ljava/lang/Object;
.source "ProxyCache.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/ad/internal/b/l$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/beizi/ad/internal/b/o;

.field private final b:Lcom/beizi/ad/internal/b/a;

.field private final c:Ljava/lang/Object;

.field private final d:Ljava/lang/Object;

.field private final e:Ljava/util/concurrent/atomic/AtomicInteger;

.field private volatile f:Ljava/lang/Thread;

.field private volatile g:Z

.field private volatile h:I


# direct methods
.method public constructor <init>(Lcom/beizi/ad/internal/b/o;Lcom/beizi/ad/internal/b/a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/beizi/ad/internal/b/l;->c:Ljava/lang/Object;

    .line 3
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/beizi/ad/internal/b/l;->d:Ljava/lang/Object;

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Lcom/beizi/ad/internal/b/l;->h:I

    .line 5
    invoke-static {p1}, Lcom/beizi/ad/internal/b/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/beizi/ad/internal/b/o;

    iput-object p1, p0, Lcom/beizi/ad/internal/b/l;->a:Lcom/beizi/ad/internal/b/o;

    .line 6
    invoke-static {p2}, Lcom/beizi/ad/internal/b/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/beizi/ad/internal/b/a;

    iput-object p1, p0, Lcom/beizi/ad/internal/b/l;->b:Lcom/beizi/ad/internal/b/a;

    .line 7
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Lcom/beizi/ad/internal/b/l;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method static synthetic a(Lcom/beizi/ad/internal/b/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/beizi/ad/internal/b/l;->e()V

    return-void
.end method

.method private b()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/beizi/ad/internal/b/m;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/b/l;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v1, p0, Lcom/beizi/ad/internal/b/l;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 3
    new-instance v1, Lcom/beizi/ad/internal/b/m;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error reading source "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " times"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/beizi/ad/internal/b/m;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private b(JJ)V
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/beizi/ad/internal/b/l;->a(JJ)V

    .line 5
    iget-object p1, p0, Lcom/beizi/ad/internal/b/l;->c:Ljava/lang/Object;

    monitor-enter p1

    .line 6
    :try_start_0
    iget-object p2, p0, Lcom/beizi/ad/internal/b/l;->c:Ljava/lang/Object;

    invoke-virtual {p2}, Ljava/lang/Object;->notifyAll()V

    .line 7
    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method private declared-synchronized c()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/beizi/ad/internal/b/m;
        }
    .end annotation

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/beizi/ad/internal/b/l;->f:Ljava/lang/Thread;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/ad/internal/b/l;->f:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->getState()Ljava/lang/Thread$State;

    move-result-object v0

    sget-object v1, Ljava/lang/Thread$State;->TERMINATED:Ljava/lang/Thread$State;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-boolean v1, p0, Lcom/beizi/ad/internal/b/l;->g:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/beizi/ad/internal/b/l;->b:Lcom/beizi/ad/internal/b/a;

    invoke-interface {v1}, Lcom/beizi/ad/internal/b/a;->d()Z

    move-result v1

    if-nez v1, :cond_1

    if-nez v0, :cond_1

    .line 3
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/beizi/ad/internal/b/l$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/beizi/ad/internal/b/l$a;-><init>(Lcom/beizi/ad/internal/b/l;Lcom/beizi/ad/internal/b/l$1;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Source reader for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/beizi/ad/internal/b/l;->a:Lcom/beizi/ad/internal/b/o;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/beizi/ad/internal/b/l;->f:Ljava/lang/Thread;

    .line 4
    iget-object v0, p0, Lcom/beizi/ad/internal/b/l;->f:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private d()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/beizi/ad/internal/b/m;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/b/l;->c:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/beizi/ad/internal/b/l;->c:Ljava/lang/Object;

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
    new-instance v2, Lcom/beizi/ad/internal/b/m;

    const-string v3, "Waiting source data is interrupted!"

    invoke-direct {v2, v3, v1}, Lcom/beizi/ad/internal/b/m;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    .line 5
    :goto_0
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method private e()V
    .locals 8

    const/4 v0, -0x1

    const/4 v1, 0x0

    .line 1
    :try_start_0
    iget-object v2, p0, Lcom/beizi/ad/internal/b/l;->b:Lcom/beizi/ad/internal/b/a;

    invoke-interface {v2}, Lcom/beizi/ad/internal/b/a;->a()I

    move-result v1

    .line 2
    iget-object v2, p0, Lcom/beizi/ad/internal/b/l;->a:Lcom/beizi/ad/internal/b/o;

    invoke-interface {v2, v1}, Lcom/beizi/ad/internal/b/o;->a(I)V

    .line 3
    iget-object v2, p0, Lcom/beizi/ad/internal/b/l;->a:Lcom/beizi/ad/internal/b/o;

    invoke-interface {v2}, Lcom/beizi/ad/internal/b/o;->a()I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/16 v3, 0x2000

    :try_start_1
    new-array v3, v3, [B

    .line 4
    :goto_0
    iget-object v4, p0, Lcom/beizi/ad/internal/b/l;->a:Lcom/beizi/ad/internal/b/o;

    invoke-interface {v4, v3}, Lcom/beizi/ad/internal/b/o;->a([B)I

    move-result v4

    if-eq v4, v0, :cond_1

    .line 5
    iget-object v5, p0, Lcom/beizi/ad/internal/b/l;->d:Ljava/lang/Object;

    monitor-enter v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 6
    :try_start_2
    invoke-direct {p0}, Lcom/beizi/ad/internal/b/l;->h()Z

    move-result v6

    if-eqz v6, :cond_0

    .line 7
    monitor-exit v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 8
    invoke-direct {p0}, Lcom/beizi/ad/internal/b/l;->i()V

    int-to-long v0, v1

    int-to-long v2, v2

    .line 9
    invoke-direct {p0, v0, v1, v2, v3}, Lcom/beizi/ad/internal/b/l;->b(JJ)V

    return-void

    .line 10
    :cond_0
    :try_start_3
    iget-object v6, p0, Lcom/beizi/ad/internal/b/l;->b:Lcom/beizi/ad/internal/b/a;

    invoke-interface {v6, v3, v4}, Lcom/beizi/ad/internal/b/a;->a([BI)V

    .line 11
    monitor-exit v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    add-int/2addr v1, v4

    int-to-long v4, v1

    int-to-long v6, v2

    .line 12
    :try_start_4
    invoke-direct {p0, v4, v5, v6, v7}, Lcom/beizi/ad/internal/b/l;->b(JJ)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 13
    :try_start_5
    monitor-exit v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    throw v0

    .line 14
    :cond_1
    invoke-direct {p0}, Lcom/beizi/ad/internal/b/l;->g()V

    .line 15
    invoke-direct {p0}, Lcom/beizi/ad/internal/b/l;->f()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    goto :goto_1

    :catchall_2
    move-exception v2

    move-object v0, v2

    const/4 v2, -0x1

    .line 16
    :goto_1
    :try_start_7
    iget-object v3, p0, Lcom/beizi/ad/internal/b/l;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 17
    invoke-virtual {p0, v0}, Lcom/beizi/ad/internal/b/l;->a(Ljava/lang/Throwable;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 18
    :goto_2
    invoke-direct {p0}, Lcom/beizi/ad/internal/b/l;->i()V

    int-to-long v0, v1

    int-to-long v2, v2

    .line 19
    invoke-direct {p0, v0, v1, v2, v3}, Lcom/beizi/ad/internal/b/l;->b(JJ)V

    return-void

    :catchall_3
    move-exception v0

    .line 20
    invoke-direct {p0}, Lcom/beizi/ad/internal/b/l;->i()V

    int-to-long v3, v1

    int-to-long v1, v2

    .line 21
    invoke-direct {p0, v3, v4, v1, v2}, Lcom/beizi/ad/internal/b/l;->b(JJ)V

    .line 22
    goto :goto_4

    :goto_3
    throw v0

    :goto_4
    goto :goto_3
.end method

.method private f()V
    .locals 1

    const/16 v0, 0x64

    .line 1
    iput v0, p0, Lcom/beizi/ad/internal/b/l;->h:I

    .line 2
    iget v0, p0, Lcom/beizi/ad/internal/b/l;->h:I

    invoke-virtual {p0, v0}, Lcom/beizi/ad/internal/b/l;->a(I)V

    return-void
.end method

.method private g()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/beizi/ad/internal/b/m;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/b/l;->d:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    invoke-direct {p0}, Lcom/beizi/ad/internal/b/l;->h()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/beizi/ad/internal/b/l;->b:Lcom/beizi/ad/internal/b/a;

    invoke-interface {v1}, Lcom/beizi/ad/internal/b/a;->a()I

    move-result v1

    iget-object v2, p0, Lcom/beizi/ad/internal/b/l;->a:Lcom/beizi/ad/internal/b/o;

    invoke-interface {v2}, Lcom/beizi/ad/internal/b/o;->a()I

    move-result v2

    if-ne v1, v2, :cond_0

    .line 3
    iget-object v1, p0, Lcom/beizi/ad/internal/b/l;->b:Lcom/beizi/ad/internal/b/a;

    invoke-interface {v1}, Lcom/beizi/ad/internal/b/a;->c()V

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

.method private h()Z
    .locals 1

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/beizi/ad/internal/b/l;->g:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private i()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/beizi/ad/internal/b/l;->a:Lcom/beizi/ad/internal/b/o;

    invoke-interface {v0}, Lcom/beizi/ad/internal/b/o;->b()V
    :try_end_0
    .catch Lcom/beizi/ad/internal/b/m; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 2
    new-instance v1, Lcom/beizi/ad/internal/b/m;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error closing source "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/beizi/ad/internal/b/l;->a:Lcom/beizi/ad/internal/b/o;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lcom/beizi/ad/internal/b/m;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v1}, Lcom/beizi/ad/internal/b/l;->a(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public a([BJI)I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/beizi/ad/internal/b/m;
        }
    .end annotation

    .line 2
    invoke-static {p1, p2, p3, p4}, Lcom/beizi/ad/internal/b/n;->a([BJI)V

    .line 3
    :goto_0
    iget-object v0, p0, Lcom/beizi/ad/internal/b/l;->b:Lcom/beizi/ad/internal/b/a;

    invoke-interface {v0}, Lcom/beizi/ad/internal/b/a;->d()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/beizi/ad/internal/b/l;->b:Lcom/beizi/ad/internal/b/a;

    invoke-interface {v0}, Lcom/beizi/ad/internal/b/a;->a()I

    move-result v0

    int-to-long v0, v0

    int-to-long v2, p4

    add-long/2addr v2, p2

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    iget-boolean v0, p0, Lcom/beizi/ad/internal/b/l;->g:Z

    if-nez v0, :cond_0

    .line 4
    invoke-direct {p0}, Lcom/beizi/ad/internal/b/l;->c()V

    .line 5
    invoke-direct {p0}, Lcom/beizi/ad/internal/b/l;->d()V

    .line 6
    invoke-direct {p0}, Lcom/beizi/ad/internal/b/l;->b()V

    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/b/l;->b:Lcom/beizi/ad/internal/b/a;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/beizi/ad/internal/b/a;->a([BJI)I

    move-result p1

    .line 8
    iget-object p2, p0, Lcom/beizi/ad/internal/b/l;->b:Lcom/beizi/ad/internal/b/a;

    invoke-interface {p2}, Lcom/beizi/ad/internal/b/a;->d()Z

    move-result p2

    if-eqz p2, :cond_1

    iget p2, p0, Lcom/beizi/ad/internal/b/l;->h:I

    const/16 p3, 0x64

    if-eq p2, p3, :cond_1

    .line 9
    iput p3, p0, Lcom/beizi/ad/internal/b/l;->h:I

    .line 10
    invoke-virtual {p0, p3}, Lcom/beizi/ad/internal/b/l;->a(I)V

    :cond_1
    return p1
.end method

.method public a()V
    .locals 4

    .line 11
    iget-object v0, p0, Lcom/beizi/ad/internal/b/l;->d:Ljava/lang/Object;

    monitor-enter v0

    .line 12
    :try_start_0
    sget-object v1, Lcom/beizi/ad/internal/utilities/HaoboLog;->proxyCacheLogTag:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Shutdown proxy for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/beizi/ad/internal/b/l;->a:Lcom/beizi/ad/internal/b/o;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x1

    .line 13
    :try_start_1
    iput-boolean v1, p0, Lcom/beizi/ad/internal/b/l;->g:Z

    .line 14
    iget-object v1, p0, Lcom/beizi/ad/internal/b/l;->f:Ljava/lang/Thread;

    if-eqz v1, :cond_0

    .line 15
    iget-object v1, p0, Lcom/beizi/ad/internal/b/l;->f:Ljava/lang/Thread;

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 16
    :cond_0
    iget-object v1, p0, Lcom/beizi/ad/internal/b/l;->b:Lcom/beizi/ad/internal/b/a;

    invoke-interface {v1}, Lcom/beizi/ad/internal/b/a;->b()V
    :try_end_1
    .catch Lcom/beizi/ad/internal/b/m; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 17
    :try_start_2
    invoke-virtual {p0, v1}, Lcom/beizi/ad/internal/b/l;->a(Ljava/lang/Throwable;)V

    .line 18
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

.method protected a(I)V
    .locals 0

    return-void
.end method

.method protected a(JJ)V
    .locals 6

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
    const-wide/16 v4, 0x64

    mul-long p1, p1, v4

    .line 19
    div-long/2addr p1, p3

    long-to-int p1, p1

    .line 20
    :goto_1
    iget p2, p0, Lcom/beizi/ad/internal/b/l;->h:I

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

    .line 21
    invoke-virtual {p0, p1}, Lcom/beizi/ad/internal/b/l;->a(I)V

    .line 22
    :cond_4
    iput p1, p0, Lcom/beizi/ad/internal/b/l;->h:I

    return-void
.end method

.method protected final a(Ljava/lang/Throwable;)V
    .locals 2

    .line 23
    instance-of v0, p1, Lcom/beizi/ad/internal/b/i;

    if-eqz v0, :cond_0

    .line 24
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->proxyCacheLogTag:Ljava/lang/String;

    const-string v0, "ProxyCache is interrupted"

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 25
    :cond_0
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->proxyCacheLogTag:Ljava/lang/String;

    const-string v1, "ProxyCache error"

    invoke-static {v0, v1, p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
