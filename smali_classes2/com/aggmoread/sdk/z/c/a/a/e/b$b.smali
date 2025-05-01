.class Lcom/aggmoread/sdk/z/c/a/a/e/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/e/b;->a(Lcom/aggmoread/sdk/z/c/a/a/e/b$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/aggmoread/sdk/z/c/a/a/e/b$c;

.field final synthetic c:Lcom/aggmoread/sdk/z/c/a/a/e/b;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/e/b;Lcom/aggmoread/sdk/z/c/a/a/e/b$c;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/e/b$b;->c:Lcom/aggmoread/sdk/z/c/a/a/e/b;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/e/b$b;->b:Lcom/aggmoread/sdk/z/c/a/a/e/b$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/e/b$b;->c:Lcom/aggmoread/sdk/z/c/a/a/e/b;

    monitor-enter v0

    const-string v1, "%s_%s_m"

    const/4 v2, 0x2

    :try_start_0
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/e/c;->l()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    iget-object v5, p0, Lcom/aggmoread/sdk/z/c/a/a/e/b$b;->c:Lcom/aggmoread/sdk/z/c/a/a/e/b;

    invoke-static {v5}, Lcom/aggmoread/sdk/z/c/a/a/e/b;->a(Lcom/aggmoread/sdk/z/c/a/a/e/b;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/io/File;

    sget-object v3, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->q:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v3

    iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    invoke-direct {v2, v3, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    :try_start_1
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-instance v3, Ljava/io/FileInputStream;

    invoke-direct {v3, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    const/16 v2, 0x400

    new-array v5, v2, [B

    :goto_0
    invoke-virtual {v3, v5, v4, v2}, Ljava/io/InputStream;->read([BII)I

    move-result v6

    if-lez v6, :cond_0

    invoke-virtual {v1, v5, v4, v6}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/e/b$b;->c:Lcom/aggmoread/sdk/z/c/a/a/e/b;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    invoke-static {v2, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/b;->a(Lcom/aggmoread/sdk/z/c/a/a/e/b;[B)[B

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/e/b$b;->c:Lcom/aggmoread/sdk/z/c/a/a/e/b;

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/e/b;->a()Lcom/aggmoread/sdk/z/c/a/a/e/h;

    move-result-object v2

    iget-object v4, p0, Lcom/aggmoread/sdk/z/c/a/a/e/b$b;->c:Lcom/aggmoread/sdk/z/c/a/a/e/b;

    invoke-static {v4}, Lcom/aggmoread/sdk/z/c/a/a/e/b;->a(Lcom/aggmoread/sdk/z/c/a/a/e/b;)Ljava/lang/String;

    move-result-object v4

    const-wide/16 v5, 0x0

    invoke-virtual {v2, v4, v5, v6}, Lcom/aggmoread/sdk/z/c/a/a/e/h;->a(Ljava/lang/String;J)J

    move-result-wide v4

    invoke-static {v1, v4, v5}, Lcom/aggmoread/sdk/z/c/a/a/e/b;->a(Lcom/aggmoread/sdk/z/c/a/a/e/b;J)J

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/e/b$b;->c:Lcom/aggmoread/sdk/z/c/a/a/e/b;

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/e/b;->a()Lcom/aggmoread/sdk/z/c/a/a/e/h;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/aggmoread/sdk/z/c/a/a/e/b$b;->c:Lcom/aggmoread/sdk/z/c/a/a/e/b;

    invoke-static {v5}, Lcom/aggmoread/sdk/z/c/a/a/e/b;->a(Lcom/aggmoread/sdk/z/c/a/a/e/b;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "_v"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v2, v4, v5}, Lcom/aggmoread/sdk/z/c/a/a/e/h;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/b;->a(Lcom/aggmoread/sdk/z/c/a/a/e/b;Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    move-exception v1

    :try_start_2
    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_1

    :catch_1
    move-exception v1

    invoke-virtual {v1}, Ljava/io/FileNotFoundException;->printStackTrace()V

    :cond_1
    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/e/b$b;->b:Lcom/aggmoread/sdk/z/c/a/a/e/b$c;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/e/b$b;->c:Lcom/aggmoread/sdk/z/c/a/a/e/b;

    invoke-interface {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/b$c;->a(Lcom/aggmoread/sdk/z/c/a/a/e/b;)V

    return-void

    :catchall_0
    move-exception v1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_3

    :goto_2
    throw v1

    :goto_3
    goto :goto_2
.end method
