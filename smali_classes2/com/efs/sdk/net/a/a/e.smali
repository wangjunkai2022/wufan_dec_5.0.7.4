.class public final Lcom/efs/sdk/net/a/a/e;
.super Ljava/io/FilterOutputStream;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/efs/sdk/net/a/a/e$a;
    }
.end annotation


# static fields
.field private static final b:Ljava/util/concurrent/ExecutorService;


# instance fields
.field private final a:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/efs/sdk/net/a/a/e;->b:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method private constructor <init>(Ljava/io/OutputStream;Ljava/util/concurrent/Future;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/OutputStream;",
            "Ljava/util/concurrent/Future<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 2
    iput-object p2, p0, Lcom/efs/sdk/net/a/a/e;->a:Ljava/util/concurrent/Future;

    return-void
.end method

.method public static a(Ljava/io/OutputStream;)Lcom/efs/sdk/net/a/a/e;
    .locals 4

    .line 1
    new-instance v0, Ljava/io/PipedInputStream;

    invoke-direct {v0}, Ljava/io/PipedInputStream;-><init>()V

    .line 2
    new-instance v1, Ljava/io/PipedOutputStream;

    invoke-direct {v1, v0}, Ljava/io/PipedOutputStream;-><init>(Ljava/io/PipedInputStream;)V

    .line 3
    sget-object v2, Lcom/efs/sdk/net/a/a/e;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v3, Lcom/efs/sdk/net/a/a/e$a;

    invoke-direct {v3, v0, p0}, Lcom/efs/sdk/net/a/a/e$a;-><init>(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p0

    .line 4
    new-instance v0, Lcom/efs/sdk/net/a/a/e;

    invoke-direct {v0, v1, p0}, Lcom/efs/sdk/net/a/a/e;-><init>(Ljava/io/OutputStream;Ljava/util/concurrent/Future;)V

    return-object v0
.end method

.method private static a(Ljava/util/concurrent/Future;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Future<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 5
    :catch_0
    :try_start_0
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1

    return-object p0

    :catch_1
    move-exception p0

    .line 6
    invoke-virtual {p0}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    .line 7
    const-class v0, Ljava/io/IOException;

    invoke-static {p0, v0}, Lcom/efs/sdk/net/a/a/d;->a(Ljava/lang/Throwable;Ljava/lang/Class;)V

    .line 8
    const-class v0, Ljava/lang/Error;

    invoke-static {p0, v0}, Lcom/efs/sdk/net/a/a/d;->a(Ljava/lang/Throwable;Ljava/lang/Class;)V

    .line 9
    const-class v0, Ljava/lang/RuntimeException;

    invoke-static {p0, v0}, Lcom/efs/sdk/net/a/a/d;->a(Ljava/lang/Throwable;Ljava/lang/Class;)V

    .line 10
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 1
    :try_start_0
    invoke-super {p0}, Ljava/io/FilterOutputStream;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    :try_start_1
    iget-object v0, p0, Lcom/efs/sdk/net/a/a/e;->a:Ljava/util/concurrent/Future;

    invoke-static {v0}, Lcom/efs/sdk/net/a/a/e;->a(Ljava/util/concurrent/Future;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 3
    throw v0

    :catchall_0
    move-exception v0

    .line 4
    :try_start_2
    iget-object v1, p0, Lcom/efs/sdk/net/a/a/e;->a:Ljava/util/concurrent/Future;

    invoke-static {v1}, Lcom/efs/sdk/net/a/a/e;->a(Ljava/util/concurrent/Future;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 5
    :catch_1
    throw v0
.end method
