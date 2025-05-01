.class public final Lcom/kwad/sdk/core/threads/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/sdk/core/threads/a$a;
    }
.end annotation


# static fields
.field private static aBH:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/kwad/sdk/core/threads/a$a;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lcom/kwad/sdk/core/threads/a;->aBH:Ljava/util/Map;

    return-void
.end method

.method public static declared-synchronized Gi()Landroid/os/Handler;
    .locals 2

    const-class v0, Lcom/kwad/sdk/core/threads/a;

    monitor-enter v0

    :try_start_0
    const-string v1, "commonHT"

    .line 1
    invoke-static {v1}, Lcom/kwad/sdk/core/threads/a;->eC(Ljava/lang/String;)Lcom/kwad/sdk/core/threads/a$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kwad/sdk/core/threads/a$a;->getHandler()Landroid/os/Handler;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static declared-synchronized Gj()Landroid/os/Handler;
    .locals 2

    const-class v0, Lcom/kwad/sdk/core/threads/a;

    monitor-enter v0

    :try_start_0
    const-string v1, "reportHT"

    .line 1
    invoke-static {v1}, Lcom/kwad/sdk/core/threads/a;->eC(Ljava/lang/String;)Lcom/kwad/sdk/core/threads/a$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kwad/sdk/core/threads/a$a;->getHandler()Landroid/os/Handler;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private static eC(Ljava/lang/String;)Lcom/kwad/sdk/core/threads/a$a;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/kwad/sdk/core/threads/a;->aBH:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/kwad/sdk/core/threads/a$a;

    return-object p0

    .line 4
    :cond_1
    :goto_0
    new-instance v0, Lcom/kwad/sdk/core/threads/a$a;

    invoke-direct {v0, p0}, Lcom/kwad/sdk/core/threads/a$a;-><init>(Ljava/lang/String;)V

    .line 5
    sget-object v1, Lcom/kwad/sdk/core/threads/a;->aBH:Ljava/util/Map;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v1, p0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
