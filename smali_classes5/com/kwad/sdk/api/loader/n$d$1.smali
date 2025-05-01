.class final Lcom/kwad/sdk/api/loader/n$d$1;
.super Lcom/kwad/sdk/api/loader/n$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/sdk/api/loader/n$d;->a(Lcom/kwad/sdk/api/loader/v;Lcom/kwad/sdk/api/loader/n$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kwad/sdk/api/loader/n$a<",
        "Lcom/kwad/sdk/api/loader/a$a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic aoe:Lcom/kwad/sdk/api/loader/n$c;

.field final synthetic aof:Lcom/kwad/sdk/api/loader/v;

.field final synthetic aoi:Lcom/kwad/sdk/api/loader/n$d;


# direct methods
.method constructor <init>(Lcom/kwad/sdk/api/loader/n$d;Lcom/kwad/sdk/api/loader/n$c;Lcom/kwad/sdk/api/loader/v;Lcom/kwad/sdk/api/loader/n$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/api/loader/n$d$1;->aoi:Lcom/kwad/sdk/api/loader/n$d;

    iput-object p3, p0, Lcom/kwad/sdk/api/loader/n$d$1;->aof:Lcom/kwad/sdk/api/loader/v;

    iput-object p4, p0, Lcom/kwad/sdk/api/loader/n$d$1;->aoe:Lcom/kwad/sdk/api/loader/n$c;

    invoke-direct {p0, p2}, Lcom/kwad/sdk/api/loader/n$a;-><init>(Lcom/kwad/sdk/api/loader/n$c;)V

    return-void
.end method

.method private c(Lcom/kwad/sdk/api/loader/a$a;)V
    .locals 6
    .param p1    # Lcom/kwad/sdk/api/loader/a$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const/4 v2, 0x0

    .line 2
    :try_start_0
    invoke-static {p1}, Lcom/kwad/sdk/api/loader/k;->a(Lcom/kwad/sdk/api/loader/a$a;)V

    .line 3
    iget-object v3, p0, Lcom/kwad/sdk/api/loader/n$d$1;->aof:Lcom/kwad/sdk/api/loader/v;

    invoke-interface {v3}, Lcom/kwad/sdk/api/loader/v;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, p1, Lcom/kwad/sdk/api/loader/a$a;->sdkVersion:Ljava/lang/String;

    invoke-static {v3, v4}, Lcom/kwad/sdk/api/loader/i;->r(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    .line 4
    iget-object v3, p1, Lcom/kwad/sdk/api/loader/a$a;->amZ:Ljava/lang/String;

    invoke-static {v3, v2}, Lcom/kwad/sdk/api/loader/j;->c(Ljava/lang/String;Ljava/io/File;)V

    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long/2addr v3, v0

    .line 6
    invoke-static {p1, v3, v4}, Lcom/kwad/sdk/api/loader/k;->a(Lcom/kwad/sdk/api/loader/a$a;J)V

    .line 7
    iput-object v2, p1, Lcom/kwad/sdk/api/loader/a$a;->ana:Ljava/io/File;

    .line 8
    iget-object v3, p0, Lcom/kwad/sdk/api/loader/n$d$1;->aoe:Lcom/kwad/sdk/api/loader/n$c;

    invoke-interface {v3, p1}, Lcom/kwad/sdk/api/loader/n$c;->i(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v3

    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v4, v0

    .line 10
    invoke-static {v3}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v4, v5, v0}, Lcom/kwad/sdk/api/loader/k;->a(Lcom/kwad/sdk/api/loader/a$a;JLjava/lang/String;)V

    .line 11
    invoke-static {v2}, Lcom/kwad/sdk/api/loader/i;->j(Ljava/io/File;)V

    return-void
.end method


# virtual methods
.method public final synthetic i(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .line 1
    check-cast p1, Lcom/kwad/sdk/api/loader/a$a;

    invoke-direct {p0, p1}, Lcom/kwad/sdk/api/loader/n$d$1;->c(Lcom/kwad/sdk/api/loader/a$a;)V

    return-void
.end method
