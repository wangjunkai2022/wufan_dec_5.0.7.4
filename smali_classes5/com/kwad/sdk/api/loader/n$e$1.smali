.class final Lcom/kwad/sdk/api/loader/n$e$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/api/loader/n$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/sdk/api/loader/n$e;->a(Lcom/kwad/sdk/api/loader/v;Lcom/kwad/sdk/api/loader/n$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/kwad/sdk/api/loader/n$c<",
        "Lcom/kwad/sdk/api/loader/a$a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic aoe:Lcom/kwad/sdk/api/loader/n$c;

.field final synthetic aof:Lcom/kwad/sdk/api/loader/v;

.field final synthetic aoj:Lcom/kwad/sdk/api/loader/n$e;


# direct methods
.method constructor <init>(Lcom/kwad/sdk/api/loader/n$e;Lcom/kwad/sdk/api/loader/v;Lcom/kwad/sdk/api/loader/n$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/api/loader/n$e$1;->aoj:Lcom/kwad/sdk/api/loader/n$e;

    iput-object p2, p0, Lcom/kwad/sdk/api/loader/n$e$1;->aof:Lcom/kwad/sdk/api/loader/v;

    iput-object p3, p0, Lcom/kwad/sdk/api/loader/n$e$1;->aoe:Lcom/kwad/sdk/api/loader/n$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Lcom/kwad/sdk/api/loader/a$a;ILjava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p1, Lcom/kwad/sdk/api/loader/a$a;->ana:Ljava/io/File;

    invoke-static {v0}, Lcom/kwad/sdk/api/loader/i;->j(Ljava/io/File;)V

    .line 2
    invoke-static {p3}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p1, p2, p3}, Lcom/kwad/sdk/api/loader/k;->b(Lcom/kwad/sdk/api/loader/a$a;ILjava/lang/String;)V

    return-void
.end method

.method private c(Lcom/kwad/sdk/api/loader/a$a;)V
    .locals 6
    .param p1    # Lcom/kwad/sdk/api/loader/a$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 2
    :try_start_0
    invoke-static {p1}, Lcom/kwad/sdk/api/loader/k;->b(Lcom/kwad/sdk/api/loader/a$a;)V

    .line 3
    iget-object v2, p0, Lcom/kwad/sdk/api/loader/n$e$1;->aof:Lcom/kwad/sdk/api/loader/v;

    invoke-interface {v2}, Lcom/kwad/sdk/api/loader/v;->getContext()Landroid/content/Context;

    move-result-object v2

    const-class v3, Lcom/kwad/sdk/api/loader/n$e$1;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    iget-object v4, p1, Lcom/kwad/sdk/api/loader/a$a;->ana:Ljava/io/File;

    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p1, Lcom/kwad/sdk/api/loader/a$a;->sdkVersion:Ljava/lang/String;

    invoke-static {v2, v3, v4, v5}, Lcom/kwad/sdk/api/loader/c;->a(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    const/4 v0, 0x1

    .line 4
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Apk pre install fail"

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1, v0, v1}, Lcom/kwad/sdk/api/loader/n$e$1;->a(Lcom/kwad/sdk/api/loader/a$a;ILjava/lang/Throwable;)V

    return-void

    .line 5
    :cond_0
    iget-object v2, p0, Lcom/kwad/sdk/api/loader/n$e$1;->aof:Lcom/kwad/sdk/api/loader/v;

    invoke-interface {v2}, Lcom/kwad/sdk/api/loader/v;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p1, Lcom/kwad/sdk/api/loader/a$a;->sdkVersion:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/kwad/sdk/api/loader/h;->p(Landroid/content/Context;Ljava/lang/String;)V

    .line 6
    iget-object v2, p1, Lcom/kwad/sdk/api/loader/a$a;->ana:Ljava/io/File;

    invoke-static {v2}, Lcom/kwad/sdk/api/loader/i;->j(Ljava/io/File;)V

    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    .line 8
    invoke-static {p1, v2, v3}, Lcom/kwad/sdk/api/loader/k;->b(Lcom/kwad/sdk/api/loader/a$a;J)V

    .line 9
    iget-object v0, p0, Lcom/kwad/sdk/api/loader/n$e$1;->aoe:Lcom/kwad/sdk/api/loader/n$c;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, Lcom/kwad/sdk/api/loader/n$c;->i(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    const/4 v1, 0x2

    .line 10
    invoke-direct {p0, p1, v1, v0}, Lcom/kwad/sdk/api/loader/n$e$1;->a(Lcom/kwad/sdk/api/loader/a$a;ILjava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final synthetic i(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    check-cast p1, Lcom/kwad/sdk/api/loader/a$a;

    invoke-direct {p0, p1}, Lcom/kwad/sdk/api/loader/n$e$1;->c(Lcom/kwad/sdk/api/loader/a$a;)V

    return-void
.end method
