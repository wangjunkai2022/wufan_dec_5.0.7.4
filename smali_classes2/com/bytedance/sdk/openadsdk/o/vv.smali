.class public final Lcom/bytedance/sdk/openadsdk/o/vv;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/o/vv$vv;
    }
.end annotation


# static fields
.field private static volatile vv:Lcom/bytedance/sdk/openadsdk/o/vv;


# instance fields
.field private volatile i:Ljava/util/concurrent/ThreadPoolExecutor;

.field private volatile m:Ljava/util/concurrent/ExecutorService;

.field private volatile p:Ljava/util/concurrent/ThreadPoolExecutor;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private m()Ljava/util/concurrent/ExecutorService;
    .locals 9

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/o/vv;->p:Ljava/util/concurrent/ThreadPoolExecutor;

    if-nez v0, :cond_0

    .line 4
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v2, 0x1

    const/4 v3, 0x1

    const-wide/16 v4, 0x0

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v7}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    new-instance v8, Lcom/bytedance/sdk/openadsdk/o/vv$vv;

    const-string v1, "init"

    invoke-direct {v8, v1}, Lcom/bytedance/sdk/openadsdk/o/vv$vv;-><init>(Ljava/lang/String;)V

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/o/vv;->p:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/o/vv;->p:Ljava/util/concurrent/ThreadPoolExecutor;

    return-object v0
.end method

.method static synthetic m(Lcom/bytedance/sdk/openadsdk/o/vv;)Ljava/util/concurrent/ThreadPoolExecutor;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/o/vv;->i:Ljava/util/concurrent/ThreadPoolExecutor;

    return-object p0
.end method

.method static synthetic m(Lcom/bytedance/sdk/openadsdk/o/vv;Ljava/util/concurrent/ThreadPoolExecutor;)Ljava/util/concurrent/ThreadPoolExecutor;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/o/vv;->p:Ljava/util/concurrent/ThreadPoolExecutor;

    return-object p1
.end method

.method private m(Ljava/util/concurrent/ExecutorService;)V
    .locals 1

    .line 8
    new-instance v0, Lcom/bytedance/sdk/openadsdk/o/vv$1;

    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/o/vv$1;-><init>(Lcom/bytedance/sdk/openadsdk/o/vv;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private p()Ljava/util/concurrent/ExecutorService;
    .locals 9

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/o/vv;->i:Ljava/util/concurrent/ThreadPoolExecutor;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v2, 0x2

    const/4 v3, 0x5

    const-wide/16 v4, 0x0

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v7}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    new-instance v8, Lcom/bytedance/sdk/openadsdk/o/vv$vv;

    invoke-direct {v8}, Lcom/bytedance/sdk/openadsdk/o/vv$vv;-><init>()V

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/o/vv;->i:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/o/vv;->i:Ljava/util/concurrent/ThreadPoolExecutor;

    return-object v0
.end method

.method static synthetic p(Lcom/bytedance/sdk/openadsdk/o/vv;Ljava/util/concurrent/ThreadPoolExecutor;)Ljava/util/concurrent/ThreadPoolExecutor;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/o/vv;->i:Ljava/util/concurrent/ThreadPoolExecutor;

    return-object p1
.end method

.method public static vv()Lcom/bytedance/sdk/openadsdk/o/vv;
    .locals 2

    .line 3
    sget-object v0, Lcom/bytedance/sdk/openadsdk/o/vv;->vv:Lcom/bytedance/sdk/openadsdk/o/vv;

    if-nez v0, :cond_0

    .line 4
    const-class v0, Lcom/bytedance/sdk/openadsdk/o/vv;

    monitor-enter v0

    .line 5
    :try_start_0
    new-instance v1, Lcom/bytedance/sdk/openadsdk/o/vv;

    invoke-direct {v1}, Lcom/bytedance/sdk/openadsdk/o/vv;-><init>()V

    sput-object v1, Lcom/bytedance/sdk/openadsdk/o/vv;->vv:Lcom/bytedance/sdk/openadsdk/o/vv;

    .line 6
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 7
    :cond_0
    :goto_0
    sget-object v0, Lcom/bytedance/sdk/openadsdk/o/vv;->vv:Lcom/bytedance/sdk/openadsdk/o/vv;

    return-object v0
.end method

.method private vv(Z)Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/o/vv;->m:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    .line 11
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/o/vv;->m()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/o/vv;->p()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    return-object p1

    .line 12
    :cond_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/o/vv;->m:Ljava/util/concurrent/ExecutorService;

    return-object p1
.end method

.method static synthetic vv(Lcom/bytedance/sdk/openadsdk/o/vv;)Ljava/util/concurrent/ThreadPoolExecutor;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/o/vv;->p:Ljava/util/concurrent/ThreadPoolExecutor;

    return-object p0
.end method

.method static synthetic vv(Lcom/bytedance/sdk/openadsdk/o/vv;Ljava/util/concurrent/ThreadPoolExecutor;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/o/vv;->vv(Ljava/util/concurrent/ThreadPoolExecutor;)V

    return-void
.end method

.method private vv(Ljava/util/concurrent/ThreadPoolExecutor;)V
    .locals 3

    .line 16
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {p1, v1, v2, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->setKeepAliveTime(JLjava/util/concurrent/TimeUnit;)V

    const/4 v0, 0x1

    .line 17
    invoke-virtual {p1, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    :cond_0
    const-wide/16 v0, 0x64

    .line 18
    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    .line 19
    :goto_0
    invoke-virtual {p1}, Ljava/util/concurrent/ThreadPoolExecutor;->getQueue()Ljava/util/concurrent/BlockingQueue;

    move-result-object v0

    .line 20
    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->size()I

    move-result v0

    if-gtz v0, :cond_0

    .line 21
    invoke-virtual {p1}, Ljava/util/concurrent/ThreadPoolExecutor;->getActiveCount()I

    move-result v0

    if-nez v0, :cond_0

    .line 22
    invoke-virtual {p1}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    return-void
.end method


# virtual methods
.method public m(Ljava/lang/Runnable;)V
    .locals 1

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 6
    :try_start_0
    invoke-direct {p0, v0}, Lcom/bytedance/sdk/openadsdk/o/vv;->vv(Z)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method public vv(Ljava/lang/Runnable;)V
    .locals 1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    .line 8
    :try_start_0
    invoke-direct {p0, v0}, Lcom/bytedance/sdk/openadsdk/o/vv;->vv(Z)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method public vv(Ljava/util/concurrent/ExecutorService;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 13
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/o/vv;->m:Ljava/util/concurrent/ExecutorService;

    .line 14
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/o/vv;->i:Ljava/util/concurrent/ThreadPoolExecutor;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/o/vv;->p:Ljava/util/concurrent/ThreadPoolExecutor;

    if-eqz v0, :cond_1

    .line 15
    :cond_0
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/o/vv;->m(Ljava/util/concurrent/ExecutorService;)V

    :cond_1
    return-void
.end method
