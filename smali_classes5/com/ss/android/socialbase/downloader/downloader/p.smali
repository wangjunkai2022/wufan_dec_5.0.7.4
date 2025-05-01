.class public Lcom/ss/android/socialbase/downloader/downloader/p;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ss/android/socialbase/downloader/downloader/p$vv;
    }
.end annotation


# static fields
.field private static volatile a:Z

.field private static volatile b:Lcom/ss/android/socialbase/downloader/network/qv;

.field private static volatile c:Lokhttp3/OkHttpClient;

.field private static volatile cl:Z

.field private static cq:Z

.field private static volatile d:Ljava/util/concurrent/ExecutorService;

.field private static ds:I

.field private static final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static final ev:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/depend/b;",
            ">;"
        }
    .end annotation
.end field

.field private static volatile f:Lcom/ss/android/socialbase/downloader/downloader/y;

.field private static volatile ff:Lcom/ss/android/socialbase/downloader/downloader/d;

.field private static fo:Z

.field private static volatile g:Ljava/util/concurrent/ExecutorService;

.field private static volatile i:Lcom/ss/android/socialbase/downloader/downloader/qv;

.field private static volatile j:Ljava/util/concurrent/ExecutorService;

.field private static final jb:I

.field private static volatile jh:Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;

.field private static ju:I

.field private static volatile k:Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;

.field private static final ky:I

.field private static volatile l:Lcom/ss/android/socialbase/downloader/downloader/n;

.field private static volatile la:Ljava/util/concurrent/ExecutorService;

.field private static final lb:I

.field private static volatile m:Lcom/ss/android/socialbase/downloader/downloader/k;

.field private static volatile n:Lcom/ss/android/socialbase/downloader/downloader/q;

.field private static nn:Z

.field private static volatile ns:Lcom/ss/android/socialbase/downloader/downloader/DownloadReceiver;

.field private static volatile o:Lcom/ss/android/socialbase/downloader/depend/a;

.field private static final ot:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/depend/r;",
            ">;"
        }
    .end annotation
.end field

.field private static volatile p:Lcom/ss/android/socialbase/downloader/downloader/b;

.field private static volatile pd:Lcom/ss/android/socialbase/downloader/depend/ff;

.field private static volatile pj:Lcom/ss/android/socialbase/downloader/network/u;

.field private static volatile q:Ljava/util/concurrent/ExecutorService;

.field private static qb:Z

.field private static volatile qv:Lcom/ss/android/socialbase/downloader/downloader/q;

.field private static volatile r:Lcom/ss/android/socialbase/downloader/network/qv;

.field private static final s:I

.field private static volatile t:Lcom/ss/android/socialbase/downloader/downloader/jh;

.field private static volatile td:Lcom/ss/android/socialbase/downloader/i/m;

.field private static tf:I

.field private static to:Lcom/ss/android/socialbase/downloader/downloader/g;

.field private static volatile u:Lcom/ss/android/socialbase/downloader/impls/vv;

.field private static volatile v:Ljava/util/concurrent/ExecutorService;

.field private static volatile vu:Lcom/ss/android/socialbase/downloader/downloader/la;

.field private static volatile vv:Landroid/content/Context;

.field private static volatile w:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/depend/ot;",
            ">;"
        }
    .end annotation
.end field

.field private static volatile wv:Lcom/ss/android/socialbase/downloader/downloader/p$vv;

.field private static volatile x:Ljava/util/concurrent/ExecutorService;

.field private static volatile y:Ljava/util/concurrent/ExecutorService;

.field private static volatile ya:Ljava/util/concurrent/ScheduledExecutorService;

.field private static yj:Lcom/ss/android/socialbase/downloader/i/p;

.field private static volatile zn:Lcom/ss/android/socialbase/downloader/network/u;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->w:Ljava/util/List;

    const/4 v0, 0x0

    .line 2
    sput-boolean v0, Lcom/ss/android/socialbase/downloader/downloader/p;->a:Z

    const/4 v1, 0x0

    .line 3
    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->c:Lokhttp3/OkHttpClient;

    .line 4
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->ot:Ljava/util/List;

    .line 5
    sput-boolean v0, Lcom/ss/android/socialbase/downloader/downloader/p;->cq:Z

    .line 6
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v1

    const/4 v2, 0x1

    add-int/2addr v1, v2

    sput v1, Lcom/ss/android/socialbase/downloader/downloader/p;->jb:I

    .line 7
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v3

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v3, v2

    sput v3, Lcom/ss/android/socialbase/downloader/downloader/p;->lb:I

    .line 8
    sput v1, Lcom/ss/android/socialbase/downloader/downloader/p;->ky:I

    .line 9
    sput v1, Lcom/ss/android/socialbase/downloader/downloader/p;->s:I

    const/16 v1, 0x2000

    .line 10
    sput v1, Lcom/ss/android/socialbase/downloader/downloader/p;->ds:I

    .line 11
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->ev:Ljava/util/List;

    .line 12
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->e:Ljava/util/List;

    .line 13
    sput-boolean v2, Lcom/ss/android/socialbase/downloader/downloader/p;->nn:Z

    .line 14
    sput-boolean v0, Lcom/ss/android/socialbase/downloader/downloader/p;->qb:Z

    .line 15
    sput-boolean v0, Lcom/ss/android/socialbase/downloader/downloader/p;->cl:Z

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()I
    .locals 1

    .line 1
    sget v0, Lcom/ss/android/socialbase/downloader/downloader/p;->ju:I

    return v0
.end method

.method public static declared-synchronized b()Lcom/ss/android/socialbase/downloader/downloader/d;
    .locals 2

    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/p;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->ff:Lcom/ss/android/socialbase/downloader/downloader/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static c()Lorg/json/JSONObject;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->pd:Lcom/ss/android/socialbase/downloader/depend/ff;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->pd:Lcom/ss/android/socialbase/downloader/depend/ff;

    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/depend/ff;->vv()Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->pd:Lcom/ss/android/socialbase/downloader/depend/ff;

    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/depend/ff;->vv()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0

    .line 3
    :cond_1
    :goto_0
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/o;->wv:Lorg/json/JSONObject;

    return-object v0
.end method

.method public static cq()Lcom/ss/android/socialbase/downloader/depend/a;
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->o:Lcom/ss/android/socialbase/downloader/depend/a;

    return-object v0
.end method

.method public static d()Ljava/util/concurrent/ExecutorService;
    .locals 11

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->y:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/p;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->y:Ljava/util/concurrent/ExecutorService;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    sget v4, Lcom/ss/android/socialbase/downloader/downloader/p;->lb:I

    const-wide/16 v5, 0xf

    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v8, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v8}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    new-instance v9, Lcom/ss/android/socialbase/downloader/qv/vv;

    const-string v2, "DownloadThreadPool-chunk-fixed"

    const/4 v10, 0x1

    invoke-direct {v9, v2, v10}, Lcom/ss/android/socialbase/downloader/qv/vv;-><init>(Ljava/lang/String;Z)V

    move-object v2, v1

    move v3, v4

    invoke-direct/range {v2 .. v9}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    :try_start_1
    invoke-virtual {v1, v10}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    .line 6
    :try_start_2
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 7
    :goto_0
    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->y:Ljava/util/concurrent/ExecutorService;

    .line 8
    :cond_0
    monitor-exit v0

    goto :goto_1

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1

    .line 9
    :cond_1
    :goto_1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->y:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public static ds()Lcom/ss/android/socialbase/downloader/i/p;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->yj:Lcom/ss/android/socialbase/downloader/i/p;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/ss/android/socialbase/downloader/downloader/p$3;

    invoke-direct {v0}, Lcom/ss/android/socialbase/downloader/downloader/p$3;-><init>()V

    sput-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->yj:Lcom/ss/android/socialbase/downloader/i/p;

    .line 3
    :cond_0
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->yj:Lcom/ss/android/socialbase/downloader/i/p;

    return-object v0
.end method

.method public static e()Z
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "supportMultiProc::="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->wv:Lcom/ss/android/socialbase/downloader/downloader/p$vv;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "wjd"

    invoke-static {v1, v0}, Lcom/ss/android/socialbase/downloader/p/vv;->vv(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->wv:Lcom/ss/android/socialbase/downloader/downloader/p$vv;

    if-eqz v0, :cond_1

    return v2

    :cond_1
    return v3
.end method

.method public static ev()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/ss/android/socialbase/downloader/downloader/p;->cl:Z

    return v0
.end method

.method public static declared-synchronized f()I
    .locals 2

    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/p;

    monitor-enter v0

    .line 1
    :try_start_0
    sget v1, Lcom/ss/android/socialbase/downloader/downloader/p;->ds:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static ff()Lcom/ss/android/socialbase/downloader/downloader/q;
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->qv:Lcom/ss/android/socialbase/downloader/downloader/q;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/p;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->qv:Lcom/ss/android/socialbase/downloader/downloader/q;

    if-nez v1, :cond_0

    .line 4
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->wv:Lcom/ss/android/socialbase/downloader/downloader/p$vv;

    invoke-interface {v1}, Lcom/ss/android/socialbase/downloader/downloader/p$vv;->vv()Lcom/ss/android/socialbase/downloader/downloader/q;

    move-result-object v1

    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->qv:Lcom/ss/android/socialbase/downloader/downloader/q;

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
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->qv:Lcom/ss/android/socialbase/downloader/downloader/q;

    return-object v0
.end method

.method public static fo()Lcom/ss/android/socialbase/downloader/downloader/g;
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->to:Lcom/ss/android/socialbase/downloader/downloader/g;

    return-object v0
.end method

.method public static g()Ljava/util/concurrent/ExecutorService;
    .locals 11

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->x:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/p;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->x:Ljava/util/concurrent/ExecutorService;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    sget v4, Lcom/ss/android/socialbase/downloader/downloader/p;->s:I

    const-wide/16 v5, 0xf

    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v8, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v8}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    new-instance v9, Lcom/ss/android/socialbase/downloader/qv/vv;

    const-string v2, "DownloadThreadPool-db-fixed"

    const/4 v10, 0x1

    invoke-direct {v9, v2, v10}, Lcom/ss/android/socialbase/downloader/qv/vv;-><init>(Ljava/lang/String;Z)V

    move-object v2, v1

    move v3, v4

    invoke-direct/range {v2 .. v9}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    :try_start_1
    invoke-virtual {v1, v10}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    .line 6
    :try_start_2
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 7
    :goto_0
    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->x:Ljava/util/concurrent/ExecutorService;

    .line 8
    :cond_0
    monitor-exit v0

    goto :goto_1

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1

    .line 9
    :cond_1
    :goto_1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->x:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public static i()Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->k:Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;

    return-object v0
.end method

.method private static i(Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 2
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->j:Ljava/util/concurrent/ExecutorService;

    :cond_0
    return-void
.end method

.method public static j()Ljava/util/concurrent/ExecutorService;
    .locals 11

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->d:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/p;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->d:Ljava/util/concurrent/ExecutorService;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    sget v4, Lcom/ss/android/socialbase/downloader/downloader/p;->ky:I

    const-wide/16 v5, 0xf

    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v8, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v8}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    new-instance v9, Lcom/ss/android/socialbase/downloader/qv/vv;

    const-string v2, "DownloadThreadPool-mix-fixed"

    const/4 v10, 0x1

    invoke-direct {v9, v2, v10}, Lcom/ss/android/socialbase/downloader/qv/vv;-><init>(Ljava/lang/String;Z)V

    move-object v2, v1

    move v3, v4

    invoke-direct/range {v2 .. v9}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    :try_start_1
    invoke-virtual {v1, v10}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    .line 6
    :try_start_2
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 7
    :goto_0
    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->d:Ljava/util/concurrent/ExecutorService;

    .line 8
    :cond_0
    monitor-exit v0

    goto :goto_1

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1

    .line 9
    :cond_1
    :goto_1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->d:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public static jb()Lcom/ss/android/socialbase/downloader/downloader/la;
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->vu:Lcom/ss/android/socialbase/downloader/downloader/la;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/p;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->vu:Lcom/ss/android/socialbase/downloader/downloader/la;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/ss/android/socialbase/downloader/impls/k;

    invoke-direct {v1}, Lcom/ss/android/socialbase/downloader/impls/k;-><init>()V

    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->vu:Lcom/ss/android/socialbase/downloader/downloader/la;

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
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->vu:Lcom/ss/android/socialbase/downloader/downloader/la;

    return-object v0
.end method

.method public static jh()Ljava/util/concurrent/ExecutorService;
    .locals 11

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->q:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/p;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->q:Ljava/util/concurrent/ExecutorService;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    sget v4, Lcom/ss/android/socialbase/downloader/downloader/p;->jb:I

    const-wide/16 v5, 0xf

    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v8, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v8}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    new-instance v9, Lcom/ss/android/socialbase/downloader/qv/vv;

    const-string v2, "DownloadThreadPool-cpu-fixed"

    const/4 v10, 0x1

    invoke-direct {v9, v2, v10}, Lcom/ss/android/socialbase/downloader/qv/vv;-><init>(Ljava/lang/String;Z)V

    move-object v2, v1

    move v3, v4

    invoke-direct/range {v2 .. v9}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    :try_start_1
    invoke-virtual {v1, v10}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    .line 6
    :try_start_2
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 7
    :goto_0
    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->q:Ljava/util/concurrent/ExecutorService;

    .line 8
    :cond_0
    monitor-exit v0

    goto :goto_1

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1

    .line 9
    :cond_1
    :goto_1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->q:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public static ju()Lcom/ss/android/socialbase/downloader/downloader/p$vv;
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->wv:Lcom/ss/android/socialbase/downloader/downloader/p$vv;

    return-object v0
.end method

.method public static k()Z
    .locals 3

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/downloader/n/vv;->p()Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v0

    sget-boolean v1, Lcom/ss/android/socialbase/downloader/downloader/p;->qb:Z

    const-string v2, "switch_not_auto_boot_service"

    invoke-virtual {v0, v2, v1}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static declared-synchronized ky()Landroid/content/Context;
    .locals 2

    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/p;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->vv:Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static declared-synchronized l()Lcom/ss/android/socialbase/downloader/downloader/jh;
    .locals 2

    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/p;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->t:Lcom/ss/android/socialbase/downloader/downloader/jh;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static la()Lokhttp3/OkHttpClient;
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->c:Lokhttp3/OkHttpClient;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/p;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->c:Lokhttp3/OkHttpClient;

    if-nez v1, :cond_0

    .line 4
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->y()Lokhttp3/OkHttpClient$Builder;

    move-result-object v1

    .line 5
    invoke-virtual {v1}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object v1

    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->c:Lokhttp3/OkHttpClient;

    .line 6
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 7
    :cond_1
    :goto_0
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->c:Lokhttp3/OkHttpClient;

    return-object v0
.end method

.method public static lb()Lcom/ss/android/socialbase/downloader/downloader/y;
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->f:Lcom/ss/android/socialbase/downloader/downloader/y;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/p;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->f:Lcom/ss/android/socialbase/downloader/downloader/y;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/ss/android/socialbase/downloader/downloader/y$vv;

    invoke-direct {v1}, Lcom/ss/android/socialbase/downloader/downloader/y$vv;-><init>()V

    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->f:Lcom/ss/android/socialbase/downloader/downloader/y;

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
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->f:Lcom/ss/android/socialbase/downloader/downloader/y;

    return-object v0
.end method

.method private static m(Ljava/lang/String;Ljava/util/List;IZLcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/socialbase/downloader/network/n;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/p;",
            ">;IZ",
            "Lcom/ss/android/socialbase/downloader/model/DownloadInfo;",
            ")",
            "Lcom/ss/android/socialbase/downloader/network/n;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;,
            Ljava/io/IOException;
        }
    .end annotation

    move v7, p2

    const/4 v0, 0x1

    if-ne v7, v0, :cond_0

    .line 26
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->u()Lcom/ss/android/socialbase/downloader/network/qv;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->wv()Lcom/ss/android/socialbase/downloader/network/qv;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_4

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    if-eqz p3, :cond_1

    .line 27
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v5, p0

    goto :goto_2

    :catch_0
    move-exception v0

    move-object v5, p0

    goto :goto_3

    :cond_1
    :goto_1
    move-object v5, p0

    move-object v6, p1

    .line 28
    :try_start_1
    invoke-interface {v0, p0, p1}, Lcom/ss/android/socialbase/downloader/network/qv;->vv(Ljava/lang/String;Ljava/util/List;)Lcom/ss/android/socialbase/downloader/network/n;

    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz p3, :cond_2

    const/4 v6, 0x0

    .line 29
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sub-long v8, v1, v3

    const/4 v10, 0x0

    const-string v11, "head"

    move-object v1, v0

    move-object v2, p0

    move-object v3, v6

    move-wide v4, v8

    move-object v6, v11

    move v7, p2

    move-object v8, v10

    move-object/from16 v9, p4

    invoke-static/range {v1 .. v9}, Lcom/ss/android/socialbase/downloader/i/vv;->vv(Lcom/ss/android/socialbase/downloader/network/n;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ILjava/io/IOException;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    :cond_2
    return-object v0

    :catchall_1
    move-exception v0

    :goto_2
    move-object v8, v2

    goto :goto_4

    :catch_1
    move-exception v0

    :goto_3
    move-object v2, v0

    .line 30
    :try_start_2
    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_4
    if-eqz p3, :cond_3

    const/4 v6, 0x0

    .line 31
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    sub-long/2addr v9, v3

    const-string v11, "head"

    move-object v2, p0

    move-object v3, v6

    move-wide v4, v9

    move-object v6, v11

    move v7, p2

    move-object/from16 v9, p4

    invoke-static/range {v1 .. v9}, Lcom/ss/android/socialbase/downloader/i/vv;->vv(Lcom/ss/android/socialbase/downloader/network/n;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ILjava/io/IOException;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    :cond_3
    throw v0

    .line 32
    :cond_4
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const/16 v1, 0x3fe

    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "httpService not exist, netLib = "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/Throwable;)V

    throw v0
.end method

.method public static declared-synchronized m()V
    .locals 5

    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/p;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-boolean v1, Lcom/ss/android/socialbase/downloader/downloader/p;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_0

    .line 4
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 5
    :try_start_1
    sput-boolean v1, Lcom/ss/android/socialbase/downloader/downloader/p;->a:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 6
    :try_start_2
    new-instance v2, Landroid/content/Intent;

    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->ky()Landroid/content/Context;

    move-result-object v3

    const-class v4, Lcom/ss/android/socialbase/downloader/impls/DownloadHandleService;

    invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v3, "com.ss.android.downloader.action.MULTI_PROCESS_NOTIFY"

    .line 7
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 8
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->ky()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 9
    invoke-static {}, Lcom/ss/android/socialbase/downloader/wv/u;->p()Z

    move-result v2

    if-nez v2, :cond_1

    .line 10
    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v1

    invoke-interface {v1}, Lcom/ss/android/socialbase/downloader/downloader/r;->startService()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 11
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    const/4 v2, 0x0

    .line 12
    :try_start_3
    sput-boolean v2, Lcom/ss/android/socialbase/downloader/downloader/p;->a:Z

    .line 13
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 14
    monitor-exit v0

    return-void

    :catchall_1
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private static m(I)V
    .locals 0

    if-lez p0, :cond_0

    .line 38
    sput p0, Lcom/ss/android/socialbase/downloader/downloader/p;->tf:I

    :cond_0
    return-void
.end method

.method public static m(Lcom/ss/android/socialbase/downloader/depend/b;)V
    .locals 2

    .line 15
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->ev:Ljava/util/List;

    monitor-enter v0

    if-eqz p0, :cond_1

    .line 16
    :try_start_0
    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {v0, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 18
    monitor-exit v0

    return-void

    .line 19
    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    .line 20
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method static declared-synchronized m(Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;)V
    .locals 1

    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/p;

    monitor-enter v0

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/downloader/p;->p(Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static m(Lcom/ss/android/socialbase/downloader/model/DownloadTask;I)V
    .locals 1

    .line 21
    sget-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->e:Ljava/util/List;

    monitor-enter p0

    .line 22
    :try_start_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 23
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 24
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_0

    .line 25
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public static m(Ljava/lang/Runnable;)V
    .locals 1

    const/4 v0, 0x0

    .line 34
    invoke-static {p0, v0}, Lcom/ss/android/socialbase/downloader/downloader/p;->m(Ljava/lang/Runnable;Z)V

    return-void
.end method

.method public static m(Ljava/lang/Runnable;Z)V
    .locals 0

    if-nez p0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    .line 35
    invoke-static {}, Lcom/ss/android/socialbase/downloader/wv/u;->i()Z

    move-result p1

    if-nez p1, :cond_1

    .line 36
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void

    .line 37
    :cond_1
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->r()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    invoke-interface {p1, p0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static m(Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 33
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->v:Ljava/util/concurrent/ExecutorService;

    :cond_0
    return-void
.end method

.method private static m(Z)V
    .locals 0

    .line 39
    sput-boolean p0, Lcom/ss/android/socialbase/downloader/downloader/p;->nn:Z

    return-void
.end method

.method public static n()Lcom/ss/android/socialbase/downloader/i/m;
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->td:Lcom/ss/android/socialbase/downloader/i/m;

    return-object v0
.end method

.method private static n(Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 2
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->la:Ljava/util/concurrent/ExecutorService;

    :cond_0
    return-void
.end method

.method private static nn()V
    .locals 3

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->ns:Lcom/ss/android/socialbase/downloader/downloader/DownloadReceiver;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/ss/android/socialbase/downloader/downloader/DownloadReceiver;

    invoke-direct {v0}, Lcom/ss/android/socialbase/downloader/downloader/DownloadReceiver;-><init>()V

    sput-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->ns:Lcom/ss/android/socialbase/downloader/downloader/DownloadReceiver;

    .line 3
    :cond_0
    sget-boolean v0, Lcom/ss/android/socialbase/downloader/downloader/p;->cq:Z

    if-eqz v0, :cond_1

    return-void

    .line 4
    :cond_1
    :try_start_0
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 5
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 6
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->vv:Landroid/content/Context;

    sget-object v2, Lcom/ss/android/socialbase/downloader/downloader/p;->ns:Lcom/ss/android/socialbase/downloader/downloader/DownloadReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    const/4 v0, 0x1

    .line 7
    sput-boolean v0, Lcom/ss/android/socialbase/downloader/downloader/p;->cq:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public static ns()Lcom/ss/android/socialbase/downloader/downloader/k;
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->m:Lcom/ss/android/socialbase/downloader/downloader/k;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/p;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->m:Lcom/ss/android/socialbase/downloader/downloader/k;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/ss/android/socialbase/downloader/impls/i;

    invoke-direct {v1}, Lcom/ss/android/socialbase/downloader/impls/i;-><init>()V

    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->m:Lcom/ss/android/socialbase/downloader/downloader/k;

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
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->m:Lcom/ss/android/socialbase/downloader/downloader/k;

    return-object v0
.end method

.method public static o()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/depend/ot;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->w:Ljava/util/List;

    monitor-enter v0

    .line 2
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->w:Ljava/util/List;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private static o(Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 4
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->d:Ljava/util/concurrent/ExecutorService;

    :cond_0
    return-void
.end method

.method public static ot()Lcom/ss/android/socialbase/downloader/downloader/qv;
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->i:Lcom/ss/android/socialbase/downloader/downloader/qv;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/p;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->i:Lcom/ss/android/socialbase/downloader/downloader/qv;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/ss/android/socialbase/downloader/impls/p;

    invoke-direct {v1}, Lcom/ss/android/socialbase/downloader/impls/p;-><init>()V

    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->i:Lcom/ss/android/socialbase/downloader/downloader/qv;

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
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->i:Lcom/ss/android/socialbase/downloader/downloader/qv;

    return-object v0
.end method

.method private static p(Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;)V
    .locals 2

    if-eqz p0, :cond_1b

    .line 1
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/p;->vv(Landroid/content/Context;)V

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getDownloadCache()Lcom/ss/android/socialbase/downloader/downloader/k;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getDownloadCache()Lcom/ss/android/socialbase/downloader/downloader/k;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/p;->vv(Lcom/ss/android/socialbase/downloader/downloader/k;)V

    .line 5
    :cond_1
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getIdGenerator()Lcom/ss/android/socialbase/downloader/downloader/b;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getIdGenerator()Lcom/ss/android/socialbase/downloader/downloader/b;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/p;->vv(Lcom/ss/android/socialbase/downloader/downloader/b;)V

    .line 7
    :cond_2
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getChunkCntCalculator()Lcom/ss/android/socialbase/downloader/downloader/qv;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 8
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getChunkCntCalculator()Lcom/ss/android/socialbase/downloader/downloader/qv;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/p;->vv(Lcom/ss/android/socialbase/downloader/downloader/qv;)V

    .line 9
    :cond_3
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getNotificationClickCallback()Lcom/ss/android/socialbase/downloader/depend/a;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 10
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getNotificationClickCallback()Lcom/ss/android/socialbase/downloader/depend/a;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/p;->vv(Lcom/ss/android/socialbase/downloader/depend/a;)V

    .line 11
    :cond_4
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getMaxDownloadPoolSize()I

    move-result v0

    if-eqz v0, :cond_5

    .line 12
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getMaxDownloadPoolSize()I

    move-result v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/p;->m(I)V

    .line 13
    :cond_5
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getHttpService()Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 14
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getHttpService()Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/p;->vv(Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;)V

    .line 15
    :cond_6
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getHeadHttpService()Lcom/ss/android/socialbase/downloader/network/qv;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 16
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getHeadHttpService()Lcom/ss/android/socialbase/downloader/network/qv;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/p;->vv(Lcom/ss/android/socialbase/downloader/network/qv;)V

    .line 17
    :cond_7
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getDownloadLaunchHandler()Lcom/ss/android/socialbase/downloader/downloader/jh;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 18
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getDownloadLaunchHandler()Lcom/ss/android/socialbase/downloader/downloader/jh;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/p;->vv(Lcom/ss/android/socialbase/downloader/downloader/jh;)V

    .line 19
    :cond_8
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getCPUThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 20
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getCPUThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/p;->p(Ljava/util/concurrent/ExecutorService;)V

    .line 21
    :cond_9
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getIOThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    if-eqz v0, :cond_a

    .line 22
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getIOThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/p;->i(Ljava/util/concurrent/ExecutorService;)V

    .line 23
    :cond_a
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getMixDefaultDownloadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    if-eqz v0, :cond_b

    .line 24
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getMixDefaultDownloadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/p;->o(Ljava/util/concurrent/ExecutorService;)V

    .line 25
    :cond_b
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getMixFrequentDownloadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    if-eqz v0, :cond_c

    .line 26
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getMixFrequentDownloadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/p;->u(Ljava/util/concurrent/ExecutorService;)V

    .line 27
    :cond_c
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getMixApkDownloadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    if-eqz v0, :cond_d

    .line 28
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getMixApkDownloadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/p;->n(Ljava/util/concurrent/ExecutorService;)V

    .line 29
    :cond_d
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getDBThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    if-eqz v0, :cond_e

    .line 30
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getDBThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/p;->qv(Ljava/util/concurrent/ExecutorService;)V

    .line 31
    :cond_e
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getChunkThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    if-eqz v0, :cond_f

    .line 32
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getChunkThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/p;->vv(Ljava/util/concurrent/ExecutorService;)V

    .line 33
    :cond_f
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getOkHttpDispatcherExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    if-eqz v0, :cond_10

    .line 34
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getOkHttpDispatcherExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/p;->m(Ljava/util/concurrent/ExecutorService;)V

    .line 35
    :cond_10
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getDownloadCompleteHandlers()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_11

    .line 36
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getDownloadCompleteHandlers()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/p;->vv(Ljava/util/List;)V

    .line 37
    :cond_11
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getMonitorConfig()Lcom/ss/android/socialbase/downloader/downloader/d;

    move-result-object v0

    if-eqz v0, :cond_12

    .line 38
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getMonitorConfig()Lcom/ss/android/socialbase/downloader/downloader/d;

    move-result-object v0

    sput-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->ff:Lcom/ss/android/socialbase/downloader/downloader/d;

    .line 39
    :cond_12
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getWriteBufferSize()I

    move-result v0

    const/16 v1, 0x400

    if-le v0, v1, :cond_13

    .line 40
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getWriteBufferSize()I

    move-result v0

    sput v0, Lcom/ss/android/socialbase/downloader/downloader/p;->ds:I

    .line 41
    :cond_13
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getChunkAdjustCalculator()Lcom/ss/android/socialbase/downloader/downloader/n;

    move-result-object v0

    if-eqz v0, :cond_14

    .line 42
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getChunkAdjustCalculator()Lcom/ss/android/socialbase/downloader/downloader/n;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/p;->vv(Lcom/ss/android/socialbase/downloader/downloader/n;)V

    .line 43
    :cond_14
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->isDownloadInMultiProcess()Z

    move-result v0

    if-eqz v0, :cond_15

    const/4 v0, 0x1

    .line 44
    sput-boolean v0, Lcom/ss/android/socialbase/downloader/downloader/p;->a:Z

    .line 45
    :cond_15
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getDownloadExpSwitch()I

    move-result v0

    if-eqz v0, :cond_16

    .line 46
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getDownloadExpSwitch()I

    move-result v0

    sput v0, Lcom/ss/android/socialbase/downloader/downloader/p;->ju:I

    .line 47
    :cond_16
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getDownloadSetting()Lcom/ss/android/socialbase/downloader/depend/ff;

    move-result-object v0

    if-eqz v0, :cond_17

    .line 48
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getDownloadSetting()Lcom/ss/android/socialbase/downloader/depend/ff;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/p;->vv(Lcom/ss/android/socialbase/downloader/depend/ff;)V

    .line 49
    :cond_17
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getDownloadDns()Lcom/ss/android/socialbase/downloader/network/u;

    move-result-object v0

    if-eqz v0, :cond_18

    .line 50
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getDownloadDns()Lcom/ss/android/socialbase/downloader/network/u;

    move-result-object v0

    sput-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->zn:Lcom/ss/android/socialbase/downloader/network/u;

    .line 51
    :cond_18
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getTTNetHandler()Lcom/ss/android/socialbase/downloader/downloader/y;

    move-result-object v0

    if-eqz v0, :cond_1a

    .line 52
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getTTNetHandler()Lcom/ss/android/socialbase/downloader/downloader/y;

    move-result-object v0

    .line 53
    sput-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->f:Lcom/ss/android/socialbase/downloader/downloader/y;

    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/downloader/y;->vv()Z

    move-result v0

    if-eqz v0, :cond_19

    .line 54
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->f:Lcom/ss/android/socialbase/downloader/downloader/y;

    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/downloader/y;->m()Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/p;->vv(Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;)V

    .line 55
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->f:Lcom/ss/android/socialbase/downloader/downloader/y;

    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/downloader/y;->p()Lcom/ss/android/socialbase/downloader/network/qv;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/p;->vv(Lcom/ss/android/socialbase/downloader/network/qv;)V

    goto :goto_0

    .line 56
    :cond_19
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->qv()Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/p;->vv(Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;)V

    .line 57
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->wv()Lcom/ss/android/socialbase/downloader/network/qv;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/p;->vv(Lcom/ss/android/socialbase/downloader/network/qv;)V

    .line 58
    :cond_1a
    :goto_0
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->needAutoRefreshUnSuccessTask()Z

    move-result v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/p;->m(Z)V

    .line 59
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getDownloadMonitorListener()Lcom/ss/android/socialbase/downloader/i/m;

    move-result-object v0

    if-eqz v0, :cond_1b

    .line 60
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getDownloadMonitorListener()Lcom/ss/android/socialbase/downloader/i/m;

    move-result-object p0

    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/downloader/p;->vv(Lcom/ss/android/socialbase/downloader/i/m;)V

    :cond_1b
    return-void
.end method

.method public static p(Ljava/lang/Runnable;)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    .line 63
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/wv/u;->i()Z

    move-result v0

    if-nez v0, :cond_1

    .line 64
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void

    .line 65
    :cond_1
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->g()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static p(Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 62
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->q:Ljava/util/concurrent/ExecutorService;

    :cond_0
    return-void
.end method

.method public static declared-synchronized p()Z
    .locals 2

    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/p;

    monitor-enter v0

    .line 61
    :try_start_0
    sget-boolean v1, Lcom/ss/android/socialbase/downloader/downloader/p;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static pd()Lcom/ss/android/socialbase/downloader/downloader/b;
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->p:Lcom/ss/android/socialbase/downloader/downloader/b;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/p;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->p:Lcom/ss/android/socialbase/downloader/downloader/b;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/ss/android/socialbase/downloader/impls/wv;

    invoke-direct {v1}, Lcom/ss/android/socialbase/downloader/impls/wv;-><init>()V

    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->p:Lcom/ss/android/socialbase/downloader/downloader/b;

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
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->p:Lcom/ss/android/socialbase/downloader/downloader/b;

    return-object v0
.end method

.method public static pj()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/ss/android/socialbase/downloader/downloader/p;->nn:Z

    return v0
.end method

.method public static q()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->la:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->la:Ljava/util/concurrent/ExecutorService;

    return-object v0

    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->j()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public static qv()Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->jh:Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/p;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->jh:Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/ss/android/socialbase/downloader/impls/n;

    invoke-direct {v1}, Lcom/ss/android/socialbase/downloader/impls/n;-><init>()V

    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->jh:Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;

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
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->jh:Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;

    return-object v0
.end method

.method private static qv(Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 7
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->x:Ljava/util/concurrent/ExecutorService;

    :cond_0
    return-void
.end method

.method public static r()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->j:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->j:Ljava/util/concurrent/ExecutorService;

    return-object v0

    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->jh()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public static declared-synchronized s()Z
    .locals 2

    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/p;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-boolean v1, Lcom/ss/android/socialbase/downloader/downloader/p;->fo:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static t()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->g:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->g:Ljava/util/concurrent/ExecutorService;

    return-object v0

    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->j()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public static td()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/depend/r;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->ot:Ljava/util/List;

    return-object v0
.end method

.method public static tf()Lcom/ss/android/socialbase/downloader/downloader/n;
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->l:Lcom/ss/android/socialbase/downloader/downloader/n;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/p;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->l:Lcom/ss/android/socialbase/downloader/downloader/n;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/ss/android/socialbase/downloader/impls/m;

    invoke-direct {v1}, Lcom/ss/android/socialbase/downloader/impls/m;-><init>()V

    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->l:Lcom/ss/android/socialbase/downloader/downloader/n;

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
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->l:Lcom/ss/android/socialbase/downloader/downloader/n;

    return-object v0
.end method

.method public static u()Lcom/ss/android/socialbase/downloader/network/qv;
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->b:Lcom/ss/android/socialbase/downloader/network/qv;

    return-object v0
.end method

.method private static u(Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 2
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->g:Ljava/util/concurrent/ExecutorService;

    :cond_0
    return-void
.end method

.method public static v()Lcom/ss/android/socialbase/downloader/network/u;
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->zn:Lcom/ss/android/socialbase/downloader/network/u;

    return-object v0
.end method

.method public static vu()Lcom/ss/android/socialbase/downloader/downloader/q;
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->n:Lcom/ss/android/socialbase/downloader/downloader/q;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/p;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->n:Lcom/ss/android/socialbase/downloader/downloader/q;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/ss/android/socialbase/downloader/impls/qv;

    invoke-direct {v1}, Lcom/ss/android/socialbase/downloader/impls/qv;-><init>()V

    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->n:Lcom/ss/android/socialbase/downloader/downloader/q;

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
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->n:Lcom/ss/android/socialbase/downloader/downloader/q;

    return-object v0
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)I
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 122
    :cond_0
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTaskKey()Ljava/lang/String;

    move-result-object v0

    .line 123
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getUrl()Ljava/lang/String;

    move-result-object v0

    :cond_1
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lcom/ss/android/socialbase/downloader/downloader/p;->vv(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static vv(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .line 124
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->pd()Lcom/ss/android/socialbase/downloader/downloader/b;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 125
    :cond_0
    invoke-interface {v0, p0, p1}, Lcom/ss/android/socialbase/downloader/downloader/b;->vv(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static vv(Ljava/lang/String;Ljava/util/List;)Lcom/ss/android/socialbase/downloader/network/n;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/p;",
            ">;)",
            "Lcom/ss/android/socialbase/downloader/network/n;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 84
    invoke-static {p0, p1, v0, v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/p;->vv(Ljava/lang/String;Ljava/util/List;IZLcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/socialbase/downloader/network/n;

    move-result-object p0

    return-object p0
.end method

.method public static vv(Ljava/lang/String;Ljava/util/List;IZLcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/socialbase/downloader/network/n;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/p;",
            ">;IZ",
            "Lcom/ss/android/socialbase/downloader/model/DownloadInfo;",
            ")",
            "Lcom/ss/android/socialbase/downloader/network/n;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 85
    invoke-static {p2}, Lcom/ss/android/socialbase/downloader/downloader/p;->vv(I)[I

    move-result-object p2

    .line 86
    array-length v0, p2

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v3, v1

    :goto_0
    if-ge v2, v0, :cond_1

    aget v4, p2, v2

    .line 87
    :try_start_0
    invoke-static {p0, p1, v4, p3, p4}, Lcom/ss/android/socialbase/downloader/downloader/p;->m(Ljava/lang/String;Ljava/util/List;IZLcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/socialbase/downloader/network/n;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v4, :cond_0

    return-object v4

    :catch_0
    move-exception v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    if-nez v3, :cond_2

    return-object v1

    .line 88
    :cond_2
    goto :goto_2

    :goto_1
    throw v3

    :goto_2
    goto :goto_1
.end method

.method private static vv(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;IZLcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/socialbase/downloader/network/wv;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/p;",
            ">;IZ",
            "Lcom/ss/android/socialbase/downloader/model/DownloadInfo;",
            ")",
            "Lcom/ss/android/socialbase/downloader/network/wv;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;,
            Ljava/io/IOException;
        }
    .end annotation

    move/from16 v7, p4

    const/4 v0, 0x1

    if-ne v7, v0, :cond_0

    .line 77
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->i()Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->qv()Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_4

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    if-eqz p5, :cond_1

    .line 78
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v6, p1

    goto :goto_2

    :catch_0
    move-exception v0

    move-object v6, p1

    goto :goto_3

    :cond_1
    :goto_1
    move v5, p0

    move-object v6, p1

    move-object v8, p3

    .line 79
    :try_start_1
    invoke-interface {v0, p0, p1, p3}, Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;->downloadWithConnection(ILjava/lang/String;Ljava/util/List;)Lcom/ss/android/socialbase/downloader/network/wv;

    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz p5, :cond_2

    .line 80
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sub-long v8, v1, v3

    const/4 v10, 0x0

    const-string v11, "get"

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-wide v4, v8

    move-object v6, v11

    move/from16 v7, p4

    move-object v8, v10

    move-object/from16 v9, p6

    invoke-static/range {v1 .. v9}, Lcom/ss/android/socialbase/downloader/i/vv;->vv(Lcom/ss/android/socialbase/downloader/network/n;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ILjava/io/IOException;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    :cond_2
    return-object v0

    :catchall_1
    move-exception v0

    :goto_2
    move-object v8, v2

    goto :goto_4

    :catch_1
    move-exception v0

    :goto_3
    move-object v2, v0

    .line 81
    :try_start_2
    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_4
    if-eqz p5, :cond_3

    .line 82
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    sub-long/2addr v9, v3

    const-string v11, "get"

    move-object v2, p1

    move-object v3, p2

    move-wide v4, v9

    move-object v6, v11

    move/from16 v7, p4

    move-object/from16 v9, p6

    invoke-static/range {v1 .. v9}, Lcom/ss/android/socialbase/downloader/i/vv;->vv(Lcom/ss/android/socialbase/downloader/network/n;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ILjava/io/IOException;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    :cond_3
    throw v0

    .line 83
    :cond_4
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const/16 v1, 0x3fe

    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "httpService not exist, netLib = "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/Throwable;)V

    throw v0
.end method

.method public static vv(ZILjava/lang/String;Ljava/lang/String;Ljava/util/List;IZLcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/socialbase/downloader/network/wv;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZI",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/p;",
            ">;IZ",
            "Lcom/ss/android/socialbase/downloader/model/DownloadInfo;",
            ")",
            "Lcom/ss/android/socialbase/downloader/network/wv;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 67
    invoke-static/range {p3 .. p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    if-nez p4, :cond_0

    .line 68
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    goto :goto_0

    :cond_0
    move-object/from16 v0, p4

    .line 69
    :goto_0
    new-instance v1, Lcom/ss/android/socialbase/downloader/model/p;

    const-string v2, "ss_d_request_host_ip_114"

    move-object/from16 v10, p3

    invoke-direct {v1, v2, v10}, Lcom/ss/android/socialbase/downloader/model/p;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x1

    move-object v1, v0

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    move-object/from16 v10, p3

    if-nez p0, :cond_2

    const/4 v0, 0x2

    move-object/from16 v1, p4

    goto :goto_1

    :cond_2
    move-object/from16 v1, p4

    move/from16 v0, p5

    .line 70
    :goto_1
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/p;->vv(I)[I

    move-result-object v2

    .line 71
    array-length v11, v2

    const/4 v0, 0x0

    const/4 v12, 0x0

    move-object v0, v12

    const/4 v13, 0x0

    :goto_2
    if-ge v13, v11, :cond_6

    aget v7, v2, v13

    move v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object v6, v1

    move/from16 v8, p6

    move-object/from16 v9, p7

    .line 72
    :try_start_0
    invoke-static/range {v3 .. v9}, Lcom/ss/android/socialbase/downloader/downloader/p;->vv(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;IZLcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/socialbase/downloader/network/wv;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v3, :cond_5

    return-object v3

    :catch_0
    move-exception v0

    move-object v3, v0

    .line 73
    invoke-virtual/range {p7 .. p7}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isExpiredRedownload()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {v3}, Lcom/ss/android/socialbase/downloader/wv/u;->n(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/wv/u;->p(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_3

    .line 74
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "dcach::http exception 304, throw excepiton, not retry "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/p/vv;->vv(Ljava/lang/String;)V

    .line 75
    throw v3

    :cond_4
    :goto_3
    move-object v0, v3

    :cond_5
    add-int/lit8 v13, v13, 0x1

    goto :goto_2

    :cond_6
    if-nez v0, :cond_7

    return-object v12

    .line 76
    :cond_7
    goto :goto_5

    :goto_4
    throw v0

    :goto_5
    goto :goto_4
.end method

.method public static vv(ZILjava/lang/String;Ljava/util/List;)Lcom/ss/android/socialbase/downloader/network/wv;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZI",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/p;",
            ">;)",
            "Lcom/ss/android/socialbase/downloader/network/wv;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v0, p0

    move v1, p1

    move-object v2, p2

    move-object v4, p3

    .line 66
    invoke-static/range {v0 .. v7}, Lcom/ss/android/socialbase/downloader/downloader/p;->vv(ZILjava/lang/String;Ljava/lang/String;Ljava/util/List;IZLcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/socialbase/downloader/network/wv;

    move-result-object p0

    return-object p0
.end method

.method public static vv(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/Future;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 106
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->x()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    invoke-interface {v0, p0, p1, p2, p3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p0

    return-object p0
.end method

.method static declared-synchronized vv()V
    .locals 3

    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/p;

    monitor-enter v0

    .line 36
    :try_start_0
    sget-boolean v1, Lcom/ss/android/socialbase/downloader/downloader/p;->cq:Z

    if-eqz v1, :cond_0

    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->ns:Lcom/ss/android/socialbase/downloader/downloader/DownloadReceiver;

    if-eqz v1, :cond_0

    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->vv:Landroid/content/Context;

    if-eqz v1, :cond_0

    .line 37
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->vv:Landroid/content/Context;

    sget-object v2, Lcom/ss/android/socialbase/downloader/downloader/p;->ns:Lcom/ss/android/socialbase/downloader/downloader/DownloadReceiver;

    invoke-virtual {v1, v2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const/4 v1, 0x0

    .line 38
    sput-boolean v1, Lcom/ss/android/socialbase/downloader/downloader/p;->cq:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :catch_0
    move-exception v1

    .line 40
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0

    throw v1
.end method

.method public static declared-synchronized vv(Landroid/content/Context;)V
    .locals 2

    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/p;

    monitor-enter v0

    if-eqz p0, :cond_0

    .line 118
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->vv:Landroid/content/Context;

    if-nez v1, :cond_0

    .line 119
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->vv:Landroid/content/Context;

    .line 120
    invoke-static {}, Lcom/ss/android/socialbase/downloader/vv/vv;->vv()Lcom/ss/android/socialbase/downloader/vv/vv;

    move-result-object p0

    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->vv:Landroid/content/Context;

    invoke-virtual {p0, v1}, Lcom/ss/android/socialbase/downloader/vv/vv;->vv(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0

    .line 121
    :cond_0
    :goto_0
    monitor-exit v0

    return-void
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/constants/i;)V
    .locals 4

    .line 51
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->ev:Ljava/util/List;

    monitor-enter v0

    .line 52
    :try_start_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 53
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 54
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ss/android/socialbase/downloader/depend/b;

    if-eqz v2, :cond_0

    .line 55
    sget-object v3, Lcom/ss/android/socialbase/downloader/constants/i;->m:Lcom/ss/android/socialbase/downloader/constants/i;

    if-eq p0, v3, :cond_0

    .line 56
    sget-object v3, Lcom/ss/android/socialbase/downloader/constants/i;->p:Lcom/ss/android/socialbase/downloader/constants/i;

    if-ne p0, v3, :cond_0

    .line 57
    invoke-interface {v2}, Lcom/ss/android/socialbase/downloader/depend/b;->vv()V

    goto :goto_0

    .line 58
    :cond_1
    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/i;->p:Lcom/ss/android/socialbase/downloader/constants/i;

    if-ne p0, v1, :cond_2

    .line 59
    sget-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->ev:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->clear()V

    .line 60
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    throw p0

    :goto_2
    goto :goto_1
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/depend/a;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 116
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->o:Lcom/ss/android/socialbase/downloader/depend/a;

    :cond_0
    return-void
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/depend/b;)V
    .locals 2

    .line 45
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->ev:Ljava/util/List;

    monitor-enter v0

    if-eqz p0, :cond_1

    .line 46
    :try_start_0
    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 47
    :cond_0
    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 48
    monitor-exit v0

    return-void

    .line 49
    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    .line 50
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/depend/ff;)V
    .locals 0

    .line 113
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->pd:Lcom/ss/android/socialbase/downloader/depend/ff;

    .line 114
    invoke-static {}, Lcom/ss/android/socialbase/downloader/n/vv;->vv()V

    return-void
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/depend/ot;)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    .line 42
    :cond_0
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->w:Ljava/util/List;

    monitor-enter v0

    .line 43
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->w:Ljava/util/List;

    invoke-interface {v1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method static declared-synchronized vv(Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;)V
    .locals 3

    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/p;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-boolean v1, Lcom/ss/android/socialbase/downloader/downloader/p;->cl:Z

    if-eqz v1, :cond_0

    const-string p0, "DownloadComponentManager"

    const-string v1, "component has init"

    .line 2
    invoke-static {p0, v1}, Lcom/ss/android/socialbase/downloader/p/vv;->o(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    monitor-exit v0

    return-void

    .line 4
    :cond_0
    :try_start_1
    sget-boolean v1, Lcom/ss/android/socialbase/downloader/downloader/p;->a:Z

    .line 5
    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/downloader/p;->p(Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;)V

    .line 6
    sget-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->m:Lcom/ss/android/socialbase/downloader/downloader/k;

    if-nez p0, :cond_1

    .line 7
    new-instance p0, Lcom/ss/android/socialbase/downloader/impls/i;

    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/impls/i;-><init>()V

    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->m:Lcom/ss/android/socialbase/downloader/downloader/k;

    .line 8
    :cond_1
    sget-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->n:Lcom/ss/android/socialbase/downloader/downloader/q;

    if-nez p0, :cond_2

    .line 9
    new-instance p0, Lcom/ss/android/socialbase/downloader/impls/qv;

    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/impls/qv;-><init>()V

    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->n:Lcom/ss/android/socialbase/downloader/downloader/q;

    .line 10
    :cond_2
    sget-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->qv:Lcom/ss/android/socialbase/downloader/downloader/q;

    if-nez p0, :cond_3

    .line 11
    sget-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->wv:Lcom/ss/android/socialbase/downloader/downloader/p$vv;

    if-eqz p0, :cond_3

    .line 12
    sget-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->wv:Lcom/ss/android/socialbase/downloader/downloader/p$vv;

    invoke-interface {p0}, Lcom/ss/android/socialbase/downloader/downloader/p$vv;->vv()Lcom/ss/android/socialbase/downloader/downloader/q;

    move-result-object p0

    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->qv:Lcom/ss/android/socialbase/downloader/downloader/q;

    .line 13
    :cond_3
    sget-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->p:Lcom/ss/android/socialbase/downloader/downloader/b;

    if-nez p0, :cond_4

    .line 14
    new-instance p0, Lcom/ss/android/socialbase/downloader/impls/wv;

    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/impls/wv;-><init>()V

    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->p:Lcom/ss/android/socialbase/downloader/downloader/b;

    .line 15
    :cond_4
    sget-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->u:Lcom/ss/android/socialbase/downloader/impls/vv;

    if-nez p0, :cond_5

    .line 16
    new-instance p0, Lcom/ss/android/socialbase/downloader/impls/o;

    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/impls/o;-><init>()V

    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->u:Lcom/ss/android/socialbase/downloader/impls/vv;

    .line 17
    :cond_5
    sget-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->i:Lcom/ss/android/socialbase/downloader/downloader/qv;

    if-nez p0, :cond_6

    .line 18
    new-instance p0, Lcom/ss/android/socialbase/downloader/impls/p;

    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/impls/p;-><init>()V

    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->i:Lcom/ss/android/socialbase/downloader/downloader/qv;

    .line 19
    :cond_6
    sget-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->l:Lcom/ss/android/socialbase/downloader/downloader/n;

    if-nez p0, :cond_7

    .line 20
    new-instance p0, Lcom/ss/android/socialbase/downloader/impls/m;

    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/impls/m;-><init>()V

    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->l:Lcom/ss/android/socialbase/downloader/downloader/n;

    .line 21
    :cond_7
    sget-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->vu:Lcom/ss/android/socialbase/downloader/downloader/la;

    if-nez p0, :cond_8

    .line 22
    new-instance p0, Lcom/ss/android/socialbase/downloader/impls/k;

    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/impls/k;-><init>()V

    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->vu:Lcom/ss/android/socialbase/downloader/downloader/la;

    .line 23
    :cond_8
    sget p0, Lcom/ss/android/socialbase/downloader/downloader/p;->tf:I

    if-lez p0, :cond_9

    sget v2, Lcom/ss/android/socialbase/downloader/downloader/p;->jb:I

    if-le p0, v2, :cond_a

    .line 24
    :cond_9
    sget p0, Lcom/ss/android/socialbase/downloader/downloader/p;->jb:I

    sput p0, Lcom/ss/android/socialbase/downloader/downloader/p;->tf:I

    .line 25
    :cond_a
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->nn()V

    .line 26
    sget-boolean p0, Lcom/ss/android/socialbase/downloader/downloader/p;->a:Z

    const/4 v2, 0x1

    if-eqz p0, :cond_b

    if-nez v1, :cond_b

    invoke-static {}, Lcom/ss/android/socialbase/downloader/wv/u;->p()Z

    move-result p0

    if-nez p0, :cond_b

    .line 27
    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object p0

    invoke-interface {p0}, Lcom/ss/android/socialbase/downloader/downloader/r;->startService()V

    goto :goto_0

    .line 28
    :cond_b
    invoke-static {}, Lcom/ss/android/socialbase/downloader/wv/u;->i()Z

    move-result p0

    if-eqz p0, :cond_c

    .line 29
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->r()Ljava/util/concurrent/ExecutorService;

    move-result-object p0

    if-eqz p0, :cond_d

    .line 30
    new-instance v1, Lcom/ss/android/socialbase/downloader/downloader/p$1;

    invoke-direct {v1}, Lcom/ss/android/socialbase/downloader/downloader/p$1;-><init>()V

    invoke-interface {p0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 31
    :cond_c
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->ky()Landroid/content/Context;

    move-result-object p0

    if-eqz p0, :cond_d

    .line 32
    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/wv/u;->i(Landroid/content/Context;)Ljava/lang/String;

    .line 33
    :cond_d
    :goto_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->zn()V

    .line 34
    sput-boolean v2, Lcom/ss/android/socialbase/downloader/downloader/p;->cl:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method private static vv(Lcom/ss/android/socialbase/downloader/downloader/b;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 111
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->p:Lcom/ss/android/socialbase/downloader/downloader/b;

    :cond_0
    return-void
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/downloader/g;)V
    .locals 0

    return-void
.end method

.method public static declared-synchronized vv(Lcom/ss/android/socialbase/downloader/downloader/jh;)V
    .locals 1

    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/p;

    monitor-enter v0

    if-eqz p0, :cond_0

    .line 91
    :try_start_0
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->t:Lcom/ss/android/socialbase/downloader/downloader/jh;

    .line 92
    sget-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->m:Lcom/ss/android/socialbase/downloader/downloader/k;

    instance-of p0, p0, Lcom/ss/android/socialbase/downloader/impls/i;

    if-eqz p0, :cond_0

    .line 93
    sget-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->m:Lcom/ss/android/socialbase/downloader/downloader/k;

    check-cast p0, Lcom/ss/android/socialbase/downloader/impls/i;

    .line 94
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/impls/i;->qv()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0

    .line 95
    :cond_0
    :goto_0
    monitor-exit v0

    return-void
.end method

.method private static vv(Lcom/ss/android/socialbase/downloader/downloader/k;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 110
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->m:Lcom/ss/android/socialbase/downloader/downloader/k;

    :cond_0
    return-void
.end method

.method private static vv(Lcom/ss/android/socialbase/downloader/downloader/n;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 117
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->l:Lcom/ss/android/socialbase/downloader/downloader/n;

    :cond_0
    return-void
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/downloader/p$vv;)V
    .locals 2

    .line 127
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "setIndependentServiceCreator::creator="

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "wjd"

    invoke-static {v1, v0}, Lcom/ss/android/socialbase/downloader/p/vv;->vv(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->wv:Lcom/ss/android/socialbase/downloader/downloader/p$vv;

    return-void
.end method

.method private static vv(Lcom/ss/android/socialbase/downloader/downloader/qv;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 115
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->i:Lcom/ss/android/socialbase/downloader/downloader/qv;

    :cond_0
    return-void
.end method

.method private static vv(Lcom/ss/android/socialbase/downloader/i/m;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 112
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->td:Lcom/ss/android/socialbase/downloader/i/m;

    :cond_0
    return-void
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/i/p;)V
    .locals 0

    .line 126
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->yj:Lcom/ss/android/socialbase/downloader/i/p;

    return-void
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/model/DownloadTask;I)V
    .locals 1

    .line 61
    sget-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->e:Ljava/util/List;

    monitor-enter p0

    .line 62
    :try_start_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 63
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 64
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_0

    .line 65
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 107
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->k:Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;

    .line 108
    :cond_0
    sget-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->k:Lcom/ss/android/socialbase/downloader/network/IDownloadHttpService;

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    sput-boolean p0, Lcom/ss/android/socialbase/downloader/downloader/p;->fo:Z

    return-void
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/network/qv;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 109
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->b:Lcom/ss/android/socialbase/downloader/network/qv;

    :cond_0
    return-void
.end method

.method public static vv(Ljava/lang/Runnable;)V
    .locals 1

    const/4 v0, 0x0

    .line 102
    invoke-static {p0, v0}, Lcom/ss/android/socialbase/downloader/downloader/p;->vv(Ljava/lang/Runnable;Z)V

    return-void
.end method

.method public static vv(Ljava/lang/Runnable;Z)V
    .locals 0

    if-nez p0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    .line 103
    invoke-static {}, Lcom/ss/android/socialbase/downloader/wv/u;->i()Z

    move-result p1

    if-nez p1, :cond_1

    .line 104
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void

    .line 105
    :cond_1
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->jh()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    invoke-interface {p1, p0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static vv(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/depend/r;",
            ">;)V"
        }
    .end annotation

    .line 97
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->ot:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 98
    monitor-enter v0

    .line 99
    :try_start_0
    invoke-interface {v0, p0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 100
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_0
    return-void
.end method

.method public static vv(Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 96
    sput-object p0, Lcom/ss/android/socialbase/downloader/downloader/p;->y:Ljava/util/concurrent/ExecutorService;

    :cond_0
    return-void
.end method

.method public static vv(Z)V
    .locals 0

    .line 101
    sput-boolean p0, Lcom/ss/android/socialbase/downloader/downloader/p;->qb:Z

    return-void
.end method

.method private static vv(I)[I
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p0, v1, :cond_2

    const/4 v2, 0x2

    if-eq p0, v2, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    new-array p0, v2, [I

    .line 89
    fill-array-data p0, :array_0

    return-object p0

    :cond_0
    new-array p0, v2, [I

    .line 90
    fill-array-data p0, :array_1

    return-object p0

    :cond_1
    new-array p0, v1, [I

    aput v1, p0, v0

    return-object p0

    :cond_2
    new-array p0, v1, [I

    aput v0, p0, v0

    return-object p0

    :array_0
    .array-data 4
        0x1
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x1
    .end array-data
.end method

.method public static w()Lcom/ss/android/socialbase/downloader/impls/vv;
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->u:Lcom/ss/android/socialbase/downloader/impls/vv;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/p;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->u:Lcom/ss/android/socialbase/downloader/impls/vv;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/ss/android/socialbase/downloader/impls/o;

    invoke-direct {v1}, Lcom/ss/android/socialbase/downloader/impls/o;-><init>()V

    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->u:Lcom/ss/android/socialbase/downloader/impls/vv;

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
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->u:Lcom/ss/android/socialbase/downloader/impls/vv;

    return-object v0
.end method

.method public static wv()Lcom/ss/android/socialbase/downloader/network/qv;
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->r:Lcom/ss/android/socialbase/downloader/network/qv;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/p;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->r:Lcom/ss/android/socialbase/downloader/network/qv;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/ss/android/socialbase/downloader/impls/u;

    invoke-direct {v1}, Lcom/ss/android/socialbase/downloader/impls/u;-><init>()V

    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->r:Lcom/ss/android/socialbase/downloader/network/qv;

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
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->r:Lcom/ss/android/socialbase/downloader/network/qv;

    return-object v0
.end method

.method public static x()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 5

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->ya:Ljava/util/concurrent/ScheduledExecutorService;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/p;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->ya:Ljava/util/concurrent/ScheduledExecutorService;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    new-instance v2, Lcom/ss/android/socialbase/downloader/qv/vv;

    const-string v3, "DownloadThreadPool-Schedule"

    const/4 v4, 0x1

    invoke-direct {v2, v3, v4}, Lcom/ss/android/socialbase/downloader/qv/vv;-><init>(Ljava/lang/String;Z)V

    invoke-direct {v1, v4, v2}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->ya:Ljava/util/concurrent/ScheduledExecutorService;

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
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->ya:Ljava/util/concurrent/ScheduledExecutorService;

    return-object v0
.end method

.method public static y()Lokhttp3/OkHttpClient$Builder;
    .locals 5

    .line 1
    new-instance v0, Lokhttp3/OkHttpClient$Builder;

    invoke-direct {v0}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    .line 2
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x7530

    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v4

    .line 3
    invoke-virtual {v4, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->readTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v4

    .line 4
    invoke-virtual {v4, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->writeTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v1

    const/4 v2, 0x1

    .line 5
    invoke-virtual {v1, v2}, Lokhttp3/OkHttpClient$Builder;->retryOnConnectionFailure(Z)Lokhttp3/OkHttpClient$Builder;

    move-result-object v1

    .line 6
    invoke-virtual {v1, v2}, Lokhttp3/OkHttpClient$Builder;->followRedirects(Z)Lokhttp3/OkHttpClient$Builder;

    move-result-object v1

    sget-object v2, Lokhttp3/Protocol;->HTTP_1_1:Lokhttp3/Protocol;

    .line 7
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Lokhttp3/OkHttpClient$Builder;->protocols(Ljava/util/List;)Lokhttp3/OkHttpClient$Builder;

    .line 8
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->v:Ljava/util/concurrent/ExecutorService;

    if-eqz v1, :cond_0

    .line 9
    new-instance v1, Lokhttp3/Dispatcher;

    sget-object v2, Lcom/ss/android/socialbase/downloader/downloader/p;->v:Ljava/util/concurrent/ExecutorService;

    invoke-direct {v1, v2}, Lokhttp3/Dispatcher;-><init>(Ljava/util/concurrent/ExecutorService;)V

    invoke-virtual {v0, v1}, Lokhttp3/OkHttpClient$Builder;->dispatcher(Lokhttp3/Dispatcher;)Lokhttp3/OkHttpClient$Builder;

    :cond_0
    return-object v0
.end method

.method public static ya()Lcom/ss/android/socialbase/downloader/network/u;
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->pj:Lcom/ss/android/socialbase/downloader/network/u;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/ss/android/socialbase/downloader/downloader/p;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->pj:Lcom/ss/android/socialbase/downloader/network/u;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/ss/android/socialbase/downloader/downloader/p$2;

    invoke-direct {v1}, Lcom/ss/android/socialbase/downloader/downloader/p$2;-><init>()V

    sput-object v1, Lcom/ss/android/socialbase/downloader/downloader/p;->pj:Lcom/ss/android/socialbase/downloader/network/u;

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
    sget-object v0, Lcom/ss/android/socialbase/downloader/downloader/p;->pj:Lcom/ss/android/socialbase/downloader/network/u;

    return-object v0
.end method

.method public static zn()V
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/o;->p:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "oppo"

    .line 2
    sput-object v0, Lcom/ss/android/socialbase/downloader/constants/o;->p:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/ss/android/socialbase/downloader/constants/o;->m:Ljava/lang/String;

    :cond_0
    return-void
.end method
