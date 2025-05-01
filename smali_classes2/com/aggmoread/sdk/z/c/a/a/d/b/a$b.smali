.class Lcom/aggmoread/sdk/z/c/a/a/d/b/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/a$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/aggmoread/sdk/z/c/a/a/d/b/a$c;

.field final synthetic c:Lcom/aggmoread/sdk/z/c/a/a/d/b/a;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/a;Lcom/aggmoread/sdk/z/c/a/a/d/b/a$c;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a$b;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/a;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a$b;->b:Lcom/aggmoread/sdk/z/c/a/a/d/b/a$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    const-wide/16 v0, 0x1f4

    const/4 v2, 0x0

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a$b;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/a;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->j()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/a$b$a;

    invoke-direct {v1, p0, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/a$b$a;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/a$b;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/aggmoread/sdk/z/c/a/a/e/n;->a(Ljava/lang/Runnable;)Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    const-string v1, "XXXXX"

    :try_start_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "title info err "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a$b$a;

    invoke-direct {v0, p0, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/a$b$a;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/a$b;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/e/n;->a(Ljava/lang/Runnable;)Z

    :goto_0
    return-void

    :goto_1
    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/a$b$a;

    invoke-direct {v1, p0, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/a$b$a;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/a$b;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/aggmoread/sdk/z/c/a/a/e/n;->a(Ljava/lang/Runnable;)Z

    throw v0
.end method
