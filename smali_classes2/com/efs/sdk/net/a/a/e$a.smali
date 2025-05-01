.class final Lcom/efs/sdk/net/a/a/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/efs/sdk/net/a/a/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/io/InputStream;

.field private final b:Ljava/io/OutputStream;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/efs/sdk/net/a/a/e$a;->a:Ljava/io/InputStream;

    .line 3
    iput-object p2, p0, Lcom/efs/sdk/net/a/a/e$a;->b:Ljava/io/OutputStream;

    return-void
.end method

.method private a()Ljava/lang/Void;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/zip/GZIPInputStream;

    iget-object v1, p0, Lcom/efs/sdk/net/a/a/e$a;->a:Ljava/io/InputStream;

    invoke-direct {v0, v1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/efs/sdk/net/a/a/e$a;->b:Ljava/io/OutputStream;

    const/16 v2, 0x400

    new-array v2, v2, [B

    invoke-static {v0, v1, v2}, Lcom/efs/sdk/net/a/a/i;->a(Ljava/io/InputStream;Ljava/io/OutputStream;[B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    invoke-virtual {v0}, Ljava/util/zip/GZIPInputStream;->close()V

    .line 4
    iget-object v0, p0, Lcom/efs/sdk/net/a/a/e$a;->b:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    const/4 v0, 0x0

    return-object v0

    :catchall_0
    move-exception v1

    .line 5
    invoke-virtual {v0}, Ljava/util/zip/GZIPInputStream;->close()V

    .line 6
    iget-object v0, p0, Lcom/efs/sdk/net/a/a/e$a;->b:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 7
    throw v1
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/efs/sdk/net/a/a/e$a;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
