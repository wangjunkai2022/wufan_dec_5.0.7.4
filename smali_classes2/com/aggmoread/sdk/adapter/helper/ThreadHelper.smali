.class public Lcom/aggmoread/sdk/adapter/helper/ThreadHelper;
.super Ljava/lang/Object;
.source "ThreadHelper.java"


# static fields
.field private static final CORE_POOL_SIZE:I

.field private static final CPU_COUNT:I

.field private static final KEEP_ALIVE:I = 0x1

.field private static final MAXIMUM_POOL_SIZE:I

.field static final THREAD_POOL_CACHED_EXECUTOR:Ljava/util/concurrent/Executor;

.field static final THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

.field public static sMainThreadHandler:Landroid/os/Handler;

.field private static final sPoolWorkQueue:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private static final sThreadFactory:Ljava/util/concurrent/ThreadFactory;

.field private static final sThreadFactory2:Ljava/util/concurrent/ThreadFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    sput v0, Lcom/aggmoread/sdk/adapter/helper/ThreadHelper;->CPU_COUNT:I

    const/4 v1, 0x1

    const/4 v2, 0x4

    if-lt v0, v2, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x1

    .line 2
    :goto_0
    sput v4, Lcom/aggmoread/sdk/adapter/helper/ThreadHelper;->CORE_POOL_SIZE:I

    if-lt v0, v2, :cond_1

    const/4 v5, 0x4

    goto :goto_1

    :cond_1
    const/4 v5, 0x1

    .line 3
    :goto_1
    sput v5, Lcom/aggmoread/sdk/adapter/helper/ThreadHelper;->MAXIMUM_POOL_SIZE:I

    .line 4
    new-instance v10, Lcom/aggmoread/sdk/adapter/helper/ThreadHelper$1;

    invoke-direct {v10}, Lcom/aggmoread/sdk/adapter/helper/ThreadHelper$1;-><init>()V

    sput-object v10, Lcom/aggmoread/sdk/adapter/helper/ThreadHelper;->sThreadFactory:Ljava/util/concurrent/ThreadFactory;

    .line 5
    new-instance v0, Lcom/aggmoread/sdk/adapter/helper/ThreadHelper$2;

    invoke-direct {v0}, Lcom/aggmoread/sdk/adapter/helper/ThreadHelper$2;-><init>()V

    sput-object v0, Lcom/aggmoread/sdk/adapter/helper/ThreadHelper;->sThreadFactory2:Ljava/util/concurrent/ThreadFactory;

    .line 6
    new-instance v9, Ljava/util/concurrent/LinkedBlockingQueue;

    const/16 v1, 0x80

    invoke-direct {v9, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    sput-object v9, Lcom/aggmoread/sdk/adapter/helper/ThreadHelper;->sPoolWorkQueue:Ljava/util/concurrent/BlockingQueue;

    .line 7
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    const-wide/16 v6, 0x1

    sget-object v8, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v11, Lcom/aggmoread/sdk/adapter/helper/ThreadHelper$3;

    invoke-direct {v11}, Lcom/aggmoread/sdk/adapter/helper/ThreadHelper$3;-><init>()V

    move-object v3, v1

    invoke-direct/range {v3 .. v11}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;Ljava/util/concurrent/RejectedExecutionHandler;)V

    sput-object v1, Lcom/aggmoread/sdk/adapter/helper/ThreadHelper;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    .line 8
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newCachedThreadPool(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/aggmoread/sdk/adapter/helper/ThreadHelper;->THREAD_POOL_CACHED_EXECUTOR:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static delayRunInMainThread(Ljava/lang/Runnable;J)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/aggmoread/sdk/adapter/helper/ThreadHelper;->getMainThreadHandler()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public static getMainThreadHandler()Landroid/os/Handler;
    .locals 3

    .line 1
    sget-object v0, Lcom/aggmoread/sdk/adapter/helper/ThreadHelper;->sMainThreadHandler:Landroid/os/Handler;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/aggmoread/sdk/adapter/helper/ThreadHelper;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/aggmoread/sdk/adapter/helper/ThreadHelper;->sMainThreadHandler:Landroid/os/Handler;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v1, Lcom/aggmoread/sdk/adapter/helper/ThreadHelper;->sMainThreadHandler:Landroid/os/Handler;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_0
    sget-object v0, Lcom/aggmoread/sdk/adapter/helper/ThreadHelper;->sMainThreadHandler:Landroid/os/Handler;

    return-object v0
.end method

.method public static runInMainThread(Ljava/lang/Runnable;)Z
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 2
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    const/4 p0, 0x0

    return p0

    .line 3
    :cond_0
    invoke-static {}, Lcom/aggmoread/sdk/adapter/helper/ThreadHelper;->getMainThreadHandler()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    const/4 p0, 0x1

    return p0
.end method

.method public static runInWorkerThread(Ljava/lang/Runnable;)Z
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Lcom/aggmoread/sdk/adapter/helper/ThreadHelper$4;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/adapter/helper/ThreadHelper$4;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v0}, Lcom/aggmoread/sdk/adapter/helper/ThreadHelper;->runInMainThread(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InternalError; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x1

    return p0

    :catch_0
    move-exception p0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "internal  err "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/InternalError;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/aggmoread/sdk/adapter/helper/LogHelper;->log(Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception p0

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ooe err "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/OutOfMemoryError;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/aggmoread/sdk/adapter/helper/LogHelper;->log(Ljava/lang/String;)V

    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static runOnUIThreadByThreadPool(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    :try_start_0
    sget-object v0, Lcom/aggmoread/sdk/adapter/helper/ThreadHelper;->THREAD_POOL_CACHED_EXECUTOR:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/aggmoread/sdk/adapter/helper/ThreadHelper$5;

    invoke-direct {v1, p0}, Lcom/aggmoread/sdk/adapter/helper/ThreadHelper$5;-><init>(Ljava/lang/Runnable;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
