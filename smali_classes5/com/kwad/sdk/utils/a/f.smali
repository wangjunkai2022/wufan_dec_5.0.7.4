.class public final Lcom/kwad/sdk/utils/a/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field private aTj:Ljava/lang/Runnable;

.field private aTk:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/kwad/sdk/utils/a/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/utils/a/f;->scheduleNext()V

    return-void
.end method

.method private d(Ljava/lang/Runnable;)Ljava/lang/Runnable;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/sdk/utils/a/f$1;

    invoke-direct {v0, p0, p1}, Lcom/kwad/sdk/utils/a/f$1;-><init>(Lcom/kwad/sdk/utils/a/f;Ljava/lang/Runnable;)V

    return-object v0
.end method

.method private declared-synchronized scheduleNext()V
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/kwad/sdk/utils/a/f;->aTk:Ljava/lang/Runnable;

    iput-object v0, p0, Lcom/kwad/sdk/utils/a/f;->aTj:Ljava/lang/Runnable;

    const/4 v1, 0x0

    .line 2
    iput-object v1, p0, Lcom/kwad/sdk/utils/a/f;->aTk:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 3
    invoke-static {}, Lcom/kwad/sdk/utils/a/d;->getExecutor()Ljava/util/concurrent/Executor;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/sdk/utils/a/f;->aTj:Ljava/lang/Runnable;

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public final declared-synchronized execute(Ljava/lang/Runnable;)V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/kwad/sdk/utils/a/f;->aTj:Ljava/lang/Runnable;

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0, p1}, Lcom/kwad/sdk/utils/a/f;->d(Ljava/lang/Runnable;)Ljava/lang/Runnable;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/utils/a/f;->aTj:Ljava/lang/Runnable;

    .line 3
    invoke-static {}, Lcom/kwad/sdk/utils/a/d;->getExecutor()Ljava/util/concurrent/Executor;

    move-result-object p1

    iget-object v0, p0, Lcom/kwad/sdk/utils/a/f;->aTj:Ljava/lang/Runnable;

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    .line 4
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/kwad/sdk/utils/a/f;->aTk:Ljava/lang/Runnable;

    if-nez v0, :cond_1

    .line 5
    invoke-direct {p0, p1}, Lcom/kwad/sdk/utils/a/f;->d(Ljava/lang/Runnable;)Ljava/lang/Runnable;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/utils/a/f;->aTk:Ljava/lang/Runnable;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 6
    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
