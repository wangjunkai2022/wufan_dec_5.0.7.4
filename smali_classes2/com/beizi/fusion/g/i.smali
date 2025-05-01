.class public Lcom/beizi/fusion/g/i;
.super Ljava/lang/Object;
.source "BeiZiImageUtils.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/fusion/g/i$a;,
        Lcom/beizi/fusion/g/i$b;
    }
.end annotation


# static fields
.field private static a:Landroid/content/Context;

.field private static e:Lcom/beizi/fusion/g/i;


# instance fields
.field private b:Ljava/util/concurrent/ExecutorService;

.field private c:Landroidx/collection/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/LruCache<",
            "Ljava/lang/String;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field private d:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    .line 2
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/fusion/g/i;->b:Ljava/util/concurrent/ExecutorService;

    .line 3
    new-instance v0, Landroidx/collection/LruCache;

    const/high16 v1, 0x400000

    invoke-direct {v0, v1}, Landroidx/collection/LruCache;-><init>(I)V

    iput-object v0, p0, Lcom/beizi/fusion/g/i;->c:Landroidx/collection/LruCache;

    .line 4
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/beizi/fusion/g/i;->d:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a()Landroid/content/Context;
    .locals 1

    .line 1
    sget-object v0, Lcom/beizi/fusion/g/i;->a:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic a(Lcom/beizi/fusion/g/i;)Landroidx/collection/LruCache;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/beizi/fusion/g/i;->c:Landroidx/collection/LruCache;

    return-object p0
.end method

.method public static a(Landroid/content/Context;)Lcom/beizi/fusion/g/i;
    .locals 0

    if-nez p0, :cond_0

    const-string p0, "Illegal Argument: context is null"

    .line 3
    invoke-static {p0}, Lcom/beizi/fusion/g/av;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 4
    :cond_0
    sput-object p0, Lcom/beizi/fusion/g/i;->a:Landroid/content/Context;

    .line 5
    :goto_0
    invoke-static {}, Lcom/beizi/fusion/g/i;->b()Lcom/beizi/fusion/g/i;

    move-result-object p0

    return-object p0
.end method

.method private static a([B)Ljava/lang/String;
    .locals 9

    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    array-length v1, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    aget-byte v4, p0, v3

    ushr-int/lit8 v5, v4, 0x4

    and-int/lit8 v5, v5, 0xf

    const/4 v6, 0x0

    :goto_1
    if-ltz v5, :cond_0

    const/16 v7, 0x9

    if-gt v5, v7, :cond_0

    add-int/lit8 v5, v5, 0x30

    goto :goto_2

    :cond_0
    add-int/lit8 v5, v5, -0xa

    add-int/lit8 v5, v5, 0x61

    :goto_2
    int-to-char v5, v5

    .line 19
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    and-int/lit8 v5, v4, 0xf

    add-int/lit8 v7, v6, 0x1

    const/4 v8, 0x1

    if-lt v6, v8, :cond_1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    move v6, v7

    goto :goto_1

    .line 20
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static b()Lcom/beizi/fusion/g/i;
    .locals 2

    .line 3
    sget-object v0, Lcom/beizi/fusion/g/i;->e:Lcom/beizi/fusion/g/i;

    if-nez v0, :cond_1

    .line 4
    const-class v0, Lcom/beizi/fusion/g/i;

    monitor-enter v0

    .line 5
    :try_start_0
    sget-object v1, Lcom/beizi/fusion/g/i;->e:Lcom/beizi/fusion/g/i;

    if-nez v1, :cond_0

    .line 6
    new-instance v1, Lcom/beizi/fusion/g/i;

    invoke-direct {v1}, Lcom/beizi/fusion/g/i;-><init>()V

    sput-object v1, Lcom/beizi/fusion/g/i;->e:Lcom/beizi/fusion/g/i;

    .line 7
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 8
    :cond_1
    :goto_0
    sget-object v0, Lcom/beizi/fusion/g/i;->e:Lcom/beizi/fusion/g/i;

    return-object v0
.end method

.method static synthetic b(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/beizi/fusion/g/i;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic b(Lcom/beizi/fusion/g/i;)Ljava/util/concurrent/ExecutorService;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/beizi/fusion/g/i;->b:Ljava/util/concurrent/ExecutorService;

    return-object p0
.end method

.method static synthetic c(Lcom/beizi/fusion/g/i;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/g/i;->d:Landroid/os/Handler;

    return-object p0
.end method

.method private static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    :try_start_0
    const-string v0, "MD5"

    .line 2
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->update([B)V

    .line 4
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    .line 5
    invoke-static {p0}, Lcom/beizi/fusion/g/i;->a([B)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const-string p0, ""

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/beizi/fusion/g/i$b;
    .locals 1

    .line 6
    new-instance v0, Lcom/beizi/fusion/g/i$b;

    invoke-direct {v0, p0, p1}, Lcom/beizi/fusion/g/i$b;-><init>(Lcom/beizi/fusion/g/i;Ljava/lang/String;)V

    return-object v0
.end method

.method public a(Ljava/lang/String;Lcom/beizi/fusion/g/i$a;)V
    .locals 7

    .line 7
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/g/i;->c:Landroidx/collection/LruCache;

    invoke-virtual {v0, p1}, Landroidx/collection/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 9
    invoke-interface {p2, v0}, Lcom/beizi/fusion/g/i$a;->a(Landroid/graphics/Bitmap;)V

    return-void

    :cond_1
    const-string v0, "/"

    .line 10
    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 11
    new-instance v2, Ljava/io/File;

    sget-object v3, Lcom/beizi/fusion/g/i;->a:Landroid/content/Context;

    invoke-static {v3}, Lcom/beizi/fusion/g/j;->b(Landroid/content/Context;)Ljava/io/File;

    move-result-object v3

    invoke-static {v0}, Lcom/beizi/fusion/g/i;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 12
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v0, v3, v5

    if-lez v0, :cond_2

    .line 13
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    :cond_2
    if-eqz v1, :cond_3

    .line 14
    iget-object v0, p0, Lcom/beizi/fusion/g/i;->c:Landroidx/collection/LruCache;

    invoke-virtual {v0, p1, v1}, Landroidx/collection/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    invoke-interface {p2, v1}, Lcom/beizi/fusion/g/i$a;->a(Landroid/graphics/Bitmap;)V

    return-void

    .line 16
    :cond_3
    iget-object v0, p0, Lcom/beizi/fusion/g/i;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/beizi/fusion/g/i$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/beizi/fusion/g/i$1;-><init>(Lcom/beizi/fusion/g/i;Ljava/lang/String;Lcom/beizi/fusion/g/i$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public b(Ljava/lang/String;Lcom/beizi/fusion/g/i$a;)V
    .locals 7

    .line 9
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/g/i;->c:Landroidx/collection/LruCache;

    invoke-virtual {v0, p1}, Landroidx/collection/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 11
    invoke-interface {p2, v0}, Lcom/beizi/fusion/g/i$a;->a(Landroid/graphics/Bitmap;)V

    return-void

    :cond_1
    const-string v0, "/"

    .line 12
    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 13
    new-instance v2, Ljava/io/File;

    sget-object v3, Lcom/beizi/fusion/g/i;->a:Landroid/content/Context;

    invoke-static {v3}, Lcom/beizi/fusion/g/j;->b(Landroid/content/Context;)Ljava/io/File;

    move-result-object v3

    invoke-static {v0}, Lcom/beizi/fusion/g/i;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 14
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v0, v3, v5

    if-lez v0, :cond_2

    .line 15
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    :cond_2
    if-eqz v1, :cond_3

    .line 16
    iget-object v0, p0, Lcom/beizi/fusion/g/i;->c:Landroidx/collection/LruCache;

    invoke-virtual {v0, p1, v1}, Landroidx/collection/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    invoke-interface {p2, v1}, Lcom/beizi/fusion/g/i$a;->a(Landroid/graphics/Bitmap;)V

    return-void

    .line 18
    :cond_3
    iget-object v0, p0, Lcom/beizi/fusion/g/i;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/beizi/fusion/g/i$2;

    invoke-direct {v1, p0, p1, p2}, Lcom/beizi/fusion/g/i$2;-><init>(Lcom/beizi/fusion/g/i;Ljava/lang/String;Lcom/beizi/fusion/g/i$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method
