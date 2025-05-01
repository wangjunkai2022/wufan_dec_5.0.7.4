.class public final Lcom/kwad/sdk/utils/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/sdk/utils/n$c;,
        Lcom/kwad/sdk/utils/n$a;,
        Lcom/kwad/sdk/utils/n$b;,
        Lcom/kwad/sdk/utils/n$e;,
        Lcom/kwad/sdk/utils/n$d;
    }
.end annotation


# static fields
.field public static aPI:Lcom/kwad/sdk/k/a/d;


# direct methods
.method public static declared-synchronized LO()Lcom/kwad/sdk/k/a/d;
    .locals 8
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    const-class v0, Lcom/kwad/sdk/utils/n;

    monitor-enter v0

    .line 1
    :try_start_0
    const-class v1, Lcom/kwad/sdk/service/a/h;

    invoke-static {v1}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/sdk/service/a/h;

    invoke-interface {v1}, Lcom/kwad/sdk/service/a/h;->zj()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    const/4 v1, 0x0

    .line 2
    monitor-exit v0

    return-object v1

    .line 3
    :cond_0
    :try_start_1
    sget-object v1, Lcom/kwad/sdk/utils/n;->aPI:Lcom/kwad/sdk/k/a/d;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_1

    .line 4
    monitor-exit v0

    return-object v1

    .line 5
    :cond_1
    :try_start_2
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    .line 6
    new-instance v2, Lcom/kwad/sdk/k/a/d;

    invoke-direct {v2, v1}, Lcom/kwad/sdk/k/a/d;-><init>(Landroid/content/Context;)V

    .line 7
    new-instance v3, Lcom/kwad/sdk/utils/n$d;

    invoke-direct {v3}, Lcom/kwad/sdk/utils/n$d;-><init>()V

    invoke-virtual {v3, v1}, Lcom/kwad/sdk/k/a/a;->bN(Landroid/content/Context;)Z

    move-result v3

    .line 8
    new-instance v4, Lcom/kwad/sdk/utils/n$e;

    invoke-direct {v4}, Lcom/kwad/sdk/utils/n$e;-><init>()V

    invoke-virtual {v4, v1}, Lcom/kwad/sdk/k/a/a;->bN(Landroid/content/Context;)Z

    move-result v4

    .line 9
    new-instance v5, Lcom/kwad/sdk/utils/n$b;

    invoke-direct {v5}, Lcom/kwad/sdk/utils/n$b;-><init>()V

    invoke-virtual {v5, v1}, Lcom/kwad/sdk/k/a/a;->bN(Landroid/content/Context;)Z

    move-result v5

    .line 10
    new-instance v6, Lcom/kwad/sdk/utils/n$a;

    invoke-direct {v6}, Lcom/kwad/sdk/utils/n$a;-><init>()V

    invoke-virtual {v6, v1}, Lcom/kwad/sdk/k/a/a;->bN(Landroid/content/Context;)Z

    move-result v6

    .line 11
    new-instance v7, Lcom/kwad/sdk/utils/n$c;

    invoke-direct {v7}, Lcom/kwad/sdk/utils/n$c;-><init>()V

    invoke-virtual {v7, v1}, Lcom/kwad/sdk/k/a/a;->bN(Landroid/content/Context;)Z

    move-result v1

    .line 12
    invoke-virtual {v2, v3}, Lcom/kwad/sdk/k/a/d;->bJ(Z)V

    .line 13
    invoke-virtual {v2, v4}, Lcom/kwad/sdk/k/a/d;->bK(Z)V

    .line 14
    invoke-virtual {v2, v5}, Lcom/kwad/sdk/k/a/d;->bL(Z)V

    .line 15
    invoke-virtual {v2, v6}, Lcom/kwad/sdk/k/a/d;->bN(Z)V

    .line 16
    invoke-virtual {v2, v1}, Lcom/kwad/sdk/k/a/d;->bO(Z)V

    .line 17
    sput-object v2, Lcom/kwad/sdk/utils/n;->aPI:Lcom/kwad/sdk/k/a/d;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 18
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static g([Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/Runtime;->exec([Ljava/lang/String;)Ljava/lang/Process;

    move-result-object p0

    .line 2
    invoke-virtual {p0}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object p0

    invoke-static {p0}, Lcom/kwad/sdk/crash/utils/h;->c(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method
