.class public Lcom/beizi/ad/internal/utilities/VideoCacheManager;
.super Ljava/lang/Object;
.source "VideoCacheManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/ad/internal/utilities/VideoCacheManager$VideoLoadedListener;
    }
.end annotation


# static fields
.field private static instance:Lcom/beizi/ad/internal/utilities/VideoCacheManager;


# instance fields
.field private executorService:Ljava/util/concurrent/ExecutorService;

.field private handler:Landroid/os/Handler;

.field private videoCache:Landroidx/collection/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/LruCache<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    .line 2
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/utilities/VideoCacheManager;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 3
    new-instance v0, Landroidx/collection/LruCache;

    const/high16 v1, 0x100000

    invoke-direct {v0, v1}, Landroidx/collection/LruCache;-><init>(I)V

    iput-object v0, p0, Lcom/beizi/ad/internal/utilities/VideoCacheManager;->videoCache:Landroidx/collection/LruCache;

    .line 4
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/beizi/ad/internal/utilities/VideoCacheManager;->handler:Landroid/os/Handler;

    return-void
.end method

.method static synthetic access$000(Lcom/beizi/ad/internal/utilities/VideoCacheManager;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/ad/internal/utilities/VideoCacheManager;->handler:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic access$100(Lcom/beizi/ad/internal/utilities/VideoCacheManager;)Landroidx/collection/LruCache;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/ad/internal/utilities/VideoCacheManager;->videoCache:Landroidx/collection/LruCache;

    return-object p0
.end method

.method private static getInstance()Lcom/beizi/ad/internal/utilities/VideoCacheManager;
    .locals 2

    .line 1
    sget-object v0, Lcom/beizi/ad/internal/utilities/VideoCacheManager;->instance:Lcom/beizi/ad/internal/utilities/VideoCacheManager;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/beizi/ad/internal/utilities/VideoCacheManager;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/beizi/ad/internal/utilities/VideoCacheManager;->instance:Lcom/beizi/ad/internal/utilities/VideoCacheManager;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/beizi/ad/internal/utilities/VideoCacheManager;

    invoke-direct {v1}, Lcom/beizi/ad/internal/utilities/VideoCacheManager;-><init>()V

    sput-object v1, Lcom/beizi/ad/internal/utilities/VideoCacheManager;->instance:Lcom/beizi/ad/internal/utilities/VideoCacheManager;

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
    sget-object v0, Lcom/beizi/ad/internal/utilities/VideoCacheManager;->instance:Lcom/beizi/ad/internal/utilities/VideoCacheManager;

    return-object v0
.end method

.method public static with()Lcom/beizi/ad/internal/utilities/VideoCacheManager;
    .locals 1

    .line 1
    invoke-static {}, Lcom/beizi/ad/internal/utilities/VideoCacheManager;->getInstance()Lcom/beizi/ad/internal/utilities/VideoCacheManager;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public getCacheVideo(Landroid/content/Context;Ljava/lang/String;Lcom/beizi/ad/internal/utilities/VideoCacheManager$VideoLoadedListener;)V
    .locals 7

    .line 1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/VideoCacheManager;->videoCache:Landroidx/collection/LruCache;

    invoke-virtual {v0, p2}, Landroidx/collection/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x0

    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 4
    invoke-interface {p3, v0}, Lcom/beizi/ad/internal/utilities/VideoCacheManager$VideoLoadedListener;->onVideoLoaded(Ljava/lang/String;)V

    return-void

    :cond_1
    const-string v0, "/"

    .line 5
    invoke-virtual {p2, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 6
    new-instance v2, Ljava/io/File;

    invoke-static {p1}, Lcom/beizi/ad/lance/a/h;->d(Landroid/content/Context;)Ljava/io/File;

    move-result-object v3

    .line 7
    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/HashingFunctions;->md5(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 8
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v0, v3, v5

    if-lez v0, :cond_2

    .line 9
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    .line 10
    :cond_2
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 11
    iget-object p1, p0, Lcom/beizi/ad/internal/utilities/VideoCacheManager;->videoCache:Landroidx/collection/LruCache;

    invoke-virtual {p1, p2, v1}, Landroidx/collection/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    invoke-interface {p3, v1}, Lcom/beizi/ad/internal/utilities/VideoCacheManager$VideoLoadedListener;->onVideoLoaded(Ljava/lang/String;)V

    return-void

    .line 13
    :cond_3
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/VideoCacheManager;->executorService:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/beizi/ad/internal/utilities/VideoCacheManager$1;

    invoke-direct {v1, p0, p2, p1, p3}, Lcom/beizi/ad/internal/utilities/VideoCacheManager$1;-><init>(Lcom/beizi/ad/internal/utilities/VideoCacheManager;Ljava/lang/String;Landroid/content/Context;Lcom/beizi/ad/internal/utilities/VideoCacheManager$VideoLoadedListener;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method
