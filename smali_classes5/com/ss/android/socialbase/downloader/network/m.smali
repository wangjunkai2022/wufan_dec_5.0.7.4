.class public Lcom/ss/android/socialbase/downloader/network/m;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ss/android/socialbase/downloader/network/m$vv;
    }
.end annotation


# static fields
.field private static final m:Ljava/lang/String; = "m"

.field private static n:J = -0x1L

.field private static volatile qv:Lcom/ss/android/socialbase/downloader/network/m;

.field public static volatile vv:Z


# instance fields
.field private final i:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final o:Lcom/ss/android/socialbase/downloader/network/m$vv;

.field private final p:Lcom/ss/android/socialbase/downloader/network/b;

.field private u:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Lcom/ss/android/socialbase/downloader/network/b;->vv()Lcom/ss/android/socialbase/downloader/network/b;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/network/m;->p:Lcom/ss/android/socialbase/downloader/network/b;

    .line 3
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/network/m;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 4
    new-instance v0, Lcom/ss/android/socialbase/downloader/network/m$vv;

    invoke-static {}, Lcom/ss/android/socialbase/downloader/qv/o;->vv()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/ss/android/socialbase/downloader/network/m$vv;-><init>(Lcom/ss/android/socialbase/downloader/network/m;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/network/m;->o:Lcom/ss/android/socialbase/downloader/network/m$vv;

    return-void
.end method

.method public static i()J
    .locals 4

    .line 1
    invoke-static {}, Landroid/net/TrafficStats;->getTotalRxBytes()J

    move-result-wide v0

    invoke-static {}, Landroid/net/TrafficStats;->getMobileRxBytes()J

    move-result-wide v2

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public static o()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->ky()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/wv/u;->m(Landroid/content/Context;)Z

    move-result v0

    sput-boolean v0, Lcom/ss/android/socialbase/downloader/network/m;->vv:Z

    return-void
.end method

.method public static vv()Lcom/ss/android/socialbase/downloader/network/m;
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/network/m;->qv:Lcom/ss/android/socialbase/downloader/network/m;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/ss/android/socialbase/downloader/network/m;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/network/m;->qv:Lcom/ss/android/socialbase/downloader/network/m;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/ss/android/socialbase/downloader/network/m;

    invoke-direct {v1}, Lcom/ss/android/socialbase/downloader/network/m;-><init>()V

    sput-object v1, Lcom/ss/android/socialbase/downloader/network/m;->qv:Lcom/ss/android/socialbase/downloader/network/m;

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
    sget-object v0, Lcom/ss/android/socialbase/downloader/network/m;->qv:Lcom/ss/android/socialbase/downloader/network/m;

    return-object v0
.end method


# virtual methods
.method public m()V
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, Lcom/ss/android/socialbase/downloader/network/m;->m:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "startSampling: mSamplingCounter = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/network/m;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/p/vv;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/network/m;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/network/m;->o:Lcom/ss/android/socialbase/downloader/network/m$vv;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/network/m$vv;->vv()V

    .line 4
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/network/m;->u:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-void
.end method

.method protected n()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/network/m;->u()V

    const-wide/16 v0, -0x1

    .line 2
    sput-wide v0, Lcom/ss/android/socialbase/downloader/network/m;->n:J

    return-void
.end method

.method public p()V
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, Lcom/ss/android/socialbase/downloader/network/m;->m:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "stopSampling: mSamplingCounter = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/network/m;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/p/vv;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/network/m;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/network/m;->o:Lcom/ss/android/socialbase/downloader/network/m$vv;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/network/m$vv;->m()V

    .line 4
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/network/m;->n()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-void
.end method

.method protected u()V
    .locals 9

    .line 1
    :try_start_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/network/m;->o()V

    .line 2
    sget-boolean v0, Lcom/ss/android/socialbase/downloader/network/m;->vv:Z

    if-eqz v0, :cond_0

    .line 3
    invoke-static {}, Lcom/ss/android/socialbase/downloader/network/m;->i()J

    move-result-wide v0

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {}, Landroid/net/TrafficStats;->getMobileRxBytes()J

    move-result-wide v0

    .line 5
    :goto_0
    sget-wide v2, Lcom/ss/android/socialbase/downloader/network/m;->n:J

    sub-long v4, v0, v2

    const-wide/16 v6, 0x0

    cmp-long v8, v2, v6

    if-ltz v8, :cond_1

    .line 6
    monitor-enter p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    :try_start_1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    .line 8
    iget-object v6, p0, Lcom/ss/android/socialbase/downloader/network/m;->p:Lcom/ss/android/socialbase/downloader/network/b;

    iget-wide v7, p0, Lcom/ss/android/socialbase/downloader/network/m;->u:J

    sub-long v7, v2, v7

    invoke-virtual {v6, v4, v5, v7, v8}, Lcom/ss/android/socialbase/downloader/network/b;->vv(JJ)V

    .line 9
    iput-wide v2, p0, Lcom/ss/android/socialbase/downloader/network/m;->u:J

    .line 10
    monitor-exit p0

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0

    .line 11
    :cond_1
    :goto_1
    sput-wide v0, Lcom/ss/android/socialbase/downloader/network/m;->n:J
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    return-void
.end method
