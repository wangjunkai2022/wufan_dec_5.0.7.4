.class Lcom/aggmoread/sdk/z/c/a/a/e/o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/e/o;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/aggmoread/sdk/z/c/a/a/e/o;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/e/o;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/e/o$a;->b:Lcom/aggmoread/sdk/z/c/a/a/e/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/e/o$a;->b:Lcom/aggmoread/sdk/z/c/a/a/e/o;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/e/o;->a(Lcom/aggmoread/sdk/z/c/a/a/e/o;)Ljava/lang/String;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/e/o$a;->b:Lcom/aggmoread/sdk/z/c/a/a/e/o;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/c/a/a/e/o;->e()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :cond_0
    :try_start_2
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-instance v3, Ljava/io/FileInputStream;

    invoke-direct {v3, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    const/16 v1, 0x400

    new-array v4, v1, [B

    :goto_0
    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5, v1}, Ljava/io/InputStream;->read([BII)I

    move-result v6

    if-lez v6, :cond_1

    invoke-virtual {v2, v4, v5, v6}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/e/o$a;->b:Lcom/aggmoread/sdk/z/c/a/a/e/o;

    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/o;->a(Lcom/aggmoread/sdk/z/c/a/a/e/o;[B)[B

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/e/o$a;->b:Lcom/aggmoread/sdk/z/c/a/a/e/o;

    invoke-static {v1}, Lcom/aggmoread/sdk/z/c/a/a/e/o;->b(Lcom/aggmoread/sdk/z/c/a/a/e/o;)[B

    move-result-object v2

    array-length v2, v2

    div-int/lit8 v2, v2, 0x8

    invoke-static {v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/o;->a(Lcom/aggmoread/sdk/z/c/a/a/e/o;I)I

    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :catch_0
    move-exception v1

    :try_start_3
    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_1

    :catch_1
    move-exception v1

    invoke-virtual {v1}, Ljava/io/FileNotFoundException;->printStackTrace()V

    :goto_1
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/e/o$a;->b:Lcom/aggmoread/sdk/z/c/a/a/e/o;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/e/o;->d()I

    return-void

    :goto_2
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_4

    :goto_3
    throw v1

    :goto_4
    goto :goto_3
.end method
