.class public Lcom/aggmoread/sdk/z/c/a/a/e/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/z/c/a/a/e/o$c;
    }
.end annotation


# static fields
.field private static e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/aggmoread/sdk/z/c/a/a/e/o;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field private a:Ljava/lang/String;

.field private b:[B

.field private c:I

.field private d:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/aggmoread/sdk/z/c/a/a/e/o;->e:Ljava/util/Map;

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;J)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    new-array v1, v0, [B

    iput-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/e/o;->b:[B

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput v0, p0, Lcom/aggmoread/sdk/z/c/a/a/e/o;->c:I

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/e/o;->a:Ljava/lang/String;

    iput-wide p2, p0, Lcom/aggmoread/sdk/z/c/a/a/e/o;->d:J

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/e/o;->b()V

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/c/a/a/e/o;I)I
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/z/c/a/a/e/o;->c:I

    return p1
.end method

.method public static a(Ljava/lang/String;Lcom/aggmoread/sdk/z/c/a/a/e/o$c;)Lcom/aggmoread/sdk/z/c/a/a/e/o;
    .locals 4

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    iget p0, p1, Lcom/aggmoread/sdk/z/c/a/a/e/o$c;->c:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 v1, 0x1

    aput-object p0, v0, v1

    const-string p0, "%s_%d"

    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/e/o;->e:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/aggmoread/sdk/z/c/a/a/e/o;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_3

    const-class v1, Lcom/aggmoread/sdk/z/c/a/a/e/o;

    monitor-enter v1

    :try_start_0
    sget-object v2, Lcom/aggmoread/sdk/z/c/a/a/e/o;->e:Ljava/util/Map;

    invoke-interface {v2, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/aggmoread/sdk/z/c/a/a/e/o;

    :cond_1
    if-nez v0, :cond_2

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/e/o;

    iget-wide v2, p1, Lcom/aggmoread/sdk/z/c/a/a/e/o$c;->b:J

    invoke-direct {v0, p0, v2, v3}, Lcom/aggmoread/sdk/z/c/a/a/e/o;-><init>(Ljava/lang/String;J)V

    sget-object p1, Lcom/aggmoread/sdk/z/c/a/a/e/o;->e:Ljava/util/Map;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {p1, p0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception p0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_3
    :goto_1
    return-object v0
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/c/a/a/e/o;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/e/o;->a:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/c/a/a/e/o;[B)[B
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/e/o;->b:[B

    return-object p1
.end method

.method static synthetic b(Lcom/aggmoread/sdk/z/c/a/a/e/o;)[B
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/e/o;->b:[B

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 4

    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/e/o;->b:[B

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write([B)V

    new-instance v1, Ljava/io/DataOutputStream;

    invoke-direct {v1, v0}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/io/DataOutputStream;->writeLong(J)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    iput-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/e/o;->b:[B

    iget v0, p0, Lcom/aggmoread/sdk/z/c/a/a/e/o;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/aggmoread/sdk/z/c/a/a/e/o;->c:I

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/e/o;->c()V

    return-void

    :catch_0
    move-exception v0

    :try_start_3
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method

.method public b()V
    .locals 1

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/e/o$a;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/z/c/a/a/e/o$a;-><init>(Lcom/aggmoread/sdk/z/c/a/a/e/o;)V

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/e/n;->b(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public c()V
    .locals 1

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/e/o$b;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/z/c/a/a/e/o$b;-><init>(Lcom/aggmoread/sdk/z/c/a/a/e/o;)V

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/e/n;->b(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public d()I
    .locals 8

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/e/o;->b:[B

    array-length v0, v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    monitor-exit p0

    return v1

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/aggmoread/sdk/z/c/a/a/e/o;->d:J

    sub-long/2addr v2, v4

    new-instance v0, Ljava/io/DataInputStream;

    new-instance v4, Ljava/io/ByteArrayInputStream;

    iget-object v5, p0, Lcom/aggmoread/sdk/z/c/a/a/e/o;->b:[B

    invoke-direct {v4, v5}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {v0, v4}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v4, 0x0

    :goto_0
    :try_start_1
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readLong()J

    move-result-wide v5

    cmp-long v7, v5, v2

    if-gez v7, :cond_1

    iget v5, p0, Lcom/aggmoread/sdk/z/c/a/a/e/o;->c:I

    add-int/lit8 v5, v5, -0x1

    iput v5, p0, Lcom/aggmoread/sdk/z/c/a/a/e/o;->c:I
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :catch_0
    nop

    :cond_1
    if-lez v4, :cond_2

    mul-int/lit8 v0, v4, 0x8

    :try_start_2
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iget-object v3, p0, Lcom/aggmoread/sdk/z/c/a/a/e/o;->b:[B

    array-length v5, v3

    sub-int/2addr v5, v0

    invoke-virtual {v2, v3, v0, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    iput-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/e/o;->b:[B

    :cond_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-lez v4, :cond_3

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/e/o;->c()V

    :cond_3
    iget v0, p0, Lcom/aggmoread/sdk/z/c/a/a/e/o;->c:I

    if-gez v0, :cond_4

    iput v1, p0, Lcom/aggmoread/sdk/z/c/a/a/e/o;->c:I

    :cond_4
    iget v0, p0, Lcom/aggmoread/sdk/z/c/a/a/e/o;->c:I

    return v0

    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method

.method protected e()Ljava/io/File;
    .locals 4

    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/e/c;->l()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/aggmoread/sdk/z/c/a/a/e/o;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/e/o;->a:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget v1, p0, Lcom/aggmoread/sdk/z/c/a/a/e/o;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-wide v1, p0, Lcom/aggmoread/sdk/z/c/a/a/e/o;->d:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "{tsname= %s,tsc= %s,span= %s}"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
