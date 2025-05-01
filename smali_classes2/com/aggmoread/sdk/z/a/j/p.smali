.class public Lcom/aggmoread/sdk/z/a/j/p;
.super Ljava/lang/Thread;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/a/p/c;


# instance fields
.field private b:Lcom/aggmoread/sdk/z/a/j/n;

.field private c:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private d:I

.field private final e:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final f:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final g:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private h:Lcom/aggmoread/sdk/z/a/p/d;

.field private i:J


# direct methods
.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/j/p;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x3

    iput v0, p0, Lcom/aggmoread/sdk/z/a/j/p;->d:I

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/j/p;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/j/p;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/j/p;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/aggmoread/sdk/z/a/j/p;->i:J

    const-string v0, "AdSdk-api-downtask"

    invoke-virtual {p0, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    return-void
.end method

.method public static b()Lcom/aggmoread/sdk/z/a/j/p;
    .locals 3

    new-instance v0, Lcom/aggmoread/sdk/z/a/j/p;

    invoke-direct {v0}, Lcom/aggmoread/sdk/z/a/j/p;-><init>()V

    iget-object v1, v0, Lcom/aggmoread/sdk/z/a/j/p;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-object v0
.end method

.method public static b(Z)Lcom/aggmoread/sdk/z/a/j/p;
    .locals 2

    new-instance v0, Lcom/aggmoread/sdk/z/a/j/p;

    invoke-direct {v0}, Lcom/aggmoread/sdk/z/a/j/p;-><init>()V

    iget-object v1, v0, Lcom/aggmoread/sdk/z/a/j/p;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-object v0
.end method


# virtual methods
.method public a(Lcom/aggmoread/sdk/z/a/j/n;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "startDownload enter , isStarted = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/p;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "DownloadTask"

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/p;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/j/p;->b:Lcom/aggmoread/sdk/z/a/j/n;

    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    :cond_0
    return-void
.end method

.method public a(Z)V
    .locals 6

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/p;->h:Lcom/aggmoread/sdk/z/a/p/d;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/aggmoread/sdk/z/a/j/p;->i:J

    sub-long/2addr v0, v2

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ConnectivityMonitor onConnectivityChanged, restart , intervalTime = "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " , startMonitorTime = "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lcom/aggmoread/sdk/z/a/j/p;->i:J

    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v2, "DownloadTask"

    invoke-static {v2, p1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-wide v2, p0, Lcom/aggmoread/sdk/z/a/j/p;->i:J

    const-wide/16 v4, 0x0

    cmp-long p1, v2, v4

    if-eqz p1, :cond_0

    const-wide/32 v2, 0x927c0

    cmp-long p1, v0, v2

    if-ltz p1, :cond_0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/j/p;->b:Lcom/aggmoread/sdk/z/a/j/n;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/j/n;->d()Lcom/aggmoread/sdk/z/a/j/i;

    move-result-object p1

    const/16 v0, -0x3f9

    const-string v1, "\u65e0\u7f51\u7edc\u8d85\u8fc710\u5206\u949f\u4e0d\u5728\u91cd\u8bd5\u4e0b\u8f7d!"

    invoke-virtual {p1, v0, v1}, Lcom/aggmoread/sdk/z/a/j/i;->a(ILjava/lang/String;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/j/p;->h:Lcom/aggmoread/sdk/z/a/p/d;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/p/d;->c()V

    const/4 p1, 0x0

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/j/p;->b(Z)Lcom/aggmoread/sdk/z/a/j/p;

    move-result-object p1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/p;->b:Lcom/aggmoread/sdk/z/a/j/n;

    invoke-virtual {p1, v0}, Lcom/aggmoread/sdk/z/a/j/p;->a(Lcom/aggmoread/sdk/z/a/j/n;)V

    :cond_1
    return-void
.end method

.method public a()Z
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/p;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public run()V
    .locals 6

    const/4 v0, 0x0

    move-object v1, v0

    :goto_0
    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/j/p;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    iget v3, p0, Lcom/aggmoread/sdk/z/a/j/p;->d:I

    const-string v4, "DownloadTask"

    if-ge v2, v3, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "currentRetryTimes = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/j/p;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    new-instance v1, Lcom/aggmoread/sdk/z/a/j/j;

    invoke-direct {v1}, Lcom/aggmoread/sdk/z/a/j/j;-><init>()V

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/j/p;->b:Lcom/aggmoread/sdk/z/a/j/n;

    invoke-virtual {v1, v2}, Lcom/aggmoread/sdk/z/a/j/j;->a(Lcom/aggmoread/sdk/z/a/j/n;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "download file = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/j/p;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    const-wide/16 v2, 0x1388

    :try_start_1
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    invoke-virtual {v2}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_1
    const/4 v1, 0x1

    :try_start_2
    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/j/p;->b:Lcom/aggmoread/sdk/z/a/j/n;

    invoke-virtual {v2}, Lcom/aggmoread/sdk/z/a/j/n;->b()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/aggmoread/sdk/z/a/p/e;->f(Landroid/content/Context;)Z

    move-result v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    :catch_1
    const/4 v2, 0x1

    :goto_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "download task end , isNetworkAvailable = "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v5, " , rerun = "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/aggmoread/sdk/z/a/j/p;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v5, " , isSupportNetworkStateMonitor = "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/aggmoread/sdk/z/a/j/p;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v5, " , downloadThrowable = "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v0, :cond_3

    iget-object v3, p0, Lcom/aggmoread/sdk/z/a/j/p;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v3

    if-eqz v3, :cond_1

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/j/p;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v0, "start ConnectivityMonitor"

    invoke-static {v4, v0}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/aggmoread/sdk/z/a/j/p;->i:J

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/p;->b:Lcom/aggmoread/sdk/z/a/j/n;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/j/n;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p0}, Lcom/aggmoread/sdk/z/a/p/d;->a(Landroid/content/Context;Lcom/aggmoread/sdk/z/a/p/c;)Lcom/aggmoread/sdk/z/a/p/d;

    move-result-object v0

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/j/p;->h:Lcom/aggmoread/sdk/z/a/p/d;

    return-void

    :cond_1
    instance-of v1, v0, Lcom/aggmoread/sdk/z/a/j/h;

    if-eqz v1, :cond_2

    check-cast v0, Lcom/aggmoread/sdk/z/a/j/h;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/p;->b:Lcom/aggmoread/sdk/z/a/j/n;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/a/j/n;->d()Lcom/aggmoread/sdk/z/a/j/i;

    move-result-object v1

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/j/h;->a()I

    move-result v2

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_2
    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/p;->b:Lcom/aggmoread/sdk/z/a/j/n;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/a/j/n;->d()Lcom/aggmoread/sdk/z/a/j/i;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/16 v2, -0x3e7

    :goto_3
    invoke-virtual {v1, v2, v0}, Lcom/aggmoread/sdk/z/a/j/i;->a(ILjava/lang/String;)V

    :cond_3
    return-void
.end method
