.class public Lcom/beizi/ad/internal/utilities/ImageManager;
.super Ljava/lang/Object;
.source "ImageManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/ad/internal/utilities/ImageManager$BitmapLoadedListener;,
        Lcom/beizi/ad/internal/utilities/ImageManager$RequestCreatorRunnble;
    }
.end annotation


# static fields
.field private static instance:Lcom/beizi/ad/internal/utilities/ImageManager;

.field private static mContext:Landroid/content/Context;


# instance fields
.field private executorService:Ljava/util/concurrent/ExecutorService;

.field private handler:Landroid/os/Handler;

.field private imageCache:Landroidx/collection/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/LruCache<",
            "Ljava/lang/String;",
            "Landroid/graphics/Bitmap;",
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

    iput-object v0, p0, Lcom/beizi/ad/internal/utilities/ImageManager;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 3
    new-instance v0, Landroidx/collection/LruCache;

    const/high16 v1, 0x400000

    invoke-direct {v0, v1}, Landroidx/collection/LruCache;-><init>(I)V

    iput-object v0, p0, Lcom/beizi/ad/internal/utilities/ImageManager;->imageCache:Landroidx/collection/LruCache;

    .line 4
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/beizi/ad/internal/utilities/ImageManager;->handler:Landroid/os/Handler;

    return-void
.end method

.method static synthetic access$000(Lcom/beizi/ad/internal/utilities/ImageManager;)Landroidx/collection/LruCache;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/ad/internal/utilities/ImageManager;->imageCache:Landroidx/collection/LruCache;

    return-object p0
.end method

.method static synthetic access$100(Lcom/beizi/ad/internal/utilities/ImageManager;)Ljava/util/concurrent/ExecutorService;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/ad/internal/utilities/ImageManager;->executorService:Ljava/util/concurrent/ExecutorService;

    return-object p0
.end method

.method static synthetic access$200(Lcom/beizi/ad/internal/utilities/ImageManager;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/ad/internal/utilities/ImageManager;->handler:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic access$300()Landroid/content/Context;
    .locals 1

    .line 1
    sget-object v0, Lcom/beizi/ad/internal/utilities/ImageManager;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method private static getInstance()Lcom/beizi/ad/internal/utilities/ImageManager;
    .locals 2

    .line 1
    sget-object v0, Lcom/beizi/ad/internal/utilities/ImageManager;->instance:Lcom/beizi/ad/internal/utilities/ImageManager;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/beizi/ad/internal/utilities/ImageManager;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/beizi/ad/internal/utilities/ImageManager;->instance:Lcom/beizi/ad/internal/utilities/ImageManager;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/beizi/ad/internal/utilities/ImageManager;

    invoke-direct {v1}, Lcom/beizi/ad/internal/utilities/ImageManager;-><init>()V

    sput-object v1, Lcom/beizi/ad/internal/utilities/ImageManager;->instance:Lcom/beizi/ad/internal/utilities/ImageManager;

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
    sget-object v0, Lcom/beizi/ad/internal/utilities/ImageManager;->instance:Lcom/beizi/ad/internal/utilities/ImageManager;

    return-object v0
.end method

.method public static with(Landroid/content/Context;)Lcom/beizi/ad/internal/utilities/ImageManager;
    .locals 1

    .line 1
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v0

    iget-object v0, v0, Lcom/beizi/ad/internal/g;->i:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object p0

    iget-object p0, p0, Lcom/beizi/ad/internal/g;->i:Landroid/content/Context;

    sput-object p0, Lcom/beizi/ad/internal/utilities/ImageManager;->mContext:Landroid/content/Context;

    goto :goto_0

    .line 3
    :cond_0
    sput-object p0, Lcom/beizi/ad/internal/utilities/ImageManager;->mContext:Landroid/content/Context;

    .line 4
    :goto_0
    invoke-static {}, Lcom/beizi/ad/internal/utilities/ImageManager;->getInstance()Lcom/beizi/ad/internal/utilities/ImageManager;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getBitmap(Ljava/lang/String;Lcom/beizi/ad/internal/utilities/ImageManager$BitmapLoadedListener;)V
    .locals 7

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/ImageManager;->imageCache:Landroidx/collection/LruCache;

    invoke-virtual {v0, p1}, Landroidx/collection/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 3
    invoke-interface {p2, v0}, Lcom/beizi/ad/internal/utilities/ImageManager$BitmapLoadedListener;->onBitmapLoaded(Landroid/graphics/Bitmap;)V

    return-void

    :cond_1
    const-string v0, "/"

    .line 4
    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 5
    new-instance v2, Ljava/io/File;

    sget-object v3, Lcom/beizi/ad/internal/utilities/ImageManager;->mContext:Landroid/content/Context;

    invoke-static {v3}, Lcom/beizi/ad/lance/a/h;->d(Landroid/content/Context;)Ljava/io/File;

    move-result-object v3

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/HashingFunctions;->md5(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 6
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v0, v3, v5

    if-lez v0, :cond_2

    .line 7
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    :cond_2
    if-eqz v1, :cond_3

    .line 8
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/ImageManager;->imageCache:Landroidx/collection/LruCache;

    invoke-virtual {v0, p1, v1}, Landroidx/collection/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    invoke-interface {p2, v1}, Lcom/beizi/ad/internal/utilities/ImageManager$BitmapLoadedListener;->onBitmapLoaded(Landroid/graphics/Bitmap;)V

    return-void

    .line 10
    :cond_3
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/ImageManager;->executorService:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/beizi/ad/internal/utilities/ImageManager$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/beizi/ad/internal/utilities/ImageManager$1;-><init>(Lcom/beizi/ad/internal/utilities/ImageManager;Ljava/lang/String;Lcom/beizi/ad/internal/utilities/ImageManager$BitmapLoadedListener;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public getCacheBitmap(Ljava/lang/String;Lcom/beizi/ad/internal/utilities/ImageManager$BitmapLoadedListener;)V
    .locals 7

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/ImageManager;->imageCache:Landroidx/collection/LruCache;

    invoke-virtual {v0, p1}, Landroidx/collection/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 3
    invoke-interface {p2, v0}, Lcom/beizi/ad/internal/utilities/ImageManager$BitmapLoadedListener;->onBitmapLoaded(Landroid/graphics/Bitmap;)V

    return-void

    :cond_1
    const-string v0, "/"

    .line 4
    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 5
    new-instance v2, Ljava/io/File;

    sget-object v3, Lcom/beizi/ad/internal/utilities/ImageManager;->mContext:Landroid/content/Context;

    invoke-static {v3}, Lcom/beizi/ad/lance/a/h;->c(Landroid/content/Context;)Ljava/io/File;

    move-result-object v3

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/HashingFunctions;->md5(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 6
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v0, v3, v5

    if-lez v0, :cond_2

    .line 7
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    :cond_2
    if-eqz v1, :cond_3

    .line 8
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/ImageManager;->imageCache:Landroidx/collection/LruCache;

    invoke-virtual {v0, p1, v1}, Landroidx/collection/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    invoke-interface {p2, v1}, Lcom/beizi/ad/internal/utilities/ImageManager$BitmapLoadedListener;->onBitmapLoaded(Landroid/graphics/Bitmap;)V

    return-void

    .line 10
    :cond_3
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/ImageManager;->executorService:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/beizi/ad/internal/utilities/ImageManager$2;

    invoke-direct {v1, p0, p1, p2}, Lcom/beizi/ad/internal/utilities/ImageManager$2;-><init>(Lcom/beizi/ad/internal/utilities/ImageManager;Ljava/lang/String;Lcom/beizi/ad/internal/utilities/ImageManager$BitmapLoadedListener;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public load(Ljava/lang/String;)Lcom/beizi/ad/internal/utilities/ImageManager$RequestCreatorRunnble;
    .locals 1

    .line 1
    new-instance v0, Lcom/beizi/ad/internal/utilities/ImageManager$RequestCreatorRunnble;

    invoke-direct {v0, p0, p1}, Lcom/beizi/ad/internal/utilities/ImageManager$RequestCreatorRunnble;-><init>(Lcom/beizi/ad/internal/utilities/ImageManager;Ljava/lang/String;)V

    return-object v0
.end method
