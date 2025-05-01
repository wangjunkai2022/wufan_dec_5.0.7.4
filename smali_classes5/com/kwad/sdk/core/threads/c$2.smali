.class final Lcom/kwad/sdk/core/threads/c$2;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/sdk/core/threads/c;->a(Lcom/kwad/sdk/core/threads/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic aCf:Landroid/os/Handler;


# direct methods
.method constructor <init>(Landroid/os/Handler;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/core/threads/c$2;->aCf:Landroid/os/Handler;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 5

    .line 1
    invoke-static {}, Lcom/kwad/sdk/core/threads/GlobalThreadPools;->Gw()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 2
    invoke-static {}, Lcom/kwad/sdk/core/threads/c;->GA()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsValue(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 3
    invoke-static {v1}, Lcom/kwad/sdk/core/threads/GlobalThreadPools;->eD(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 4
    instance-of v3, v2, Ljava/util/concurrent/ThreadPoolExecutor;

    if-eqz v3, :cond_0

    .line 5
    invoke-static {}, Lcom/kwad/sdk/core/threads/c;->GB()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 6
    check-cast v2, Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-static {v2, v1}, Lcom/kwad/sdk/core/threads/c;->a(Ljava/util/concurrent/ThreadPoolExecutor;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 7
    invoke-static {}, Lcom/kwad/sdk/core/threads/c;->GA()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 8
    invoke-static {}, Lcom/kwad/sdk/core/threads/c;->GA()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 9
    invoke-virtual {v2}, Ljava/util/concurrent/ThreadPoolExecutor;->getPoolSize()I

    move-result v4

    add-int/2addr v0, v4

    .line 10
    invoke-static {v2, v3}, Lcom/kwad/sdk/core/threads/c;->b(Ljava/util/concurrent/ThreadPoolExecutor;Ljava/lang/String;)Lcom/kwad/sdk/core/threads/b;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 11
    invoke-static {v2}, Lcom/kwad/sdk/commercial/b;->q(Lcom/kwad/sdk/commercial/c/a;)V

    goto :goto_1

    .line 12
    :cond_3
    new-instance v1, Lcom/kwad/sdk/core/threads/b;

    invoke-direct {v1}, Lcom/kwad/sdk/core/threads/b;-><init>()V

    const-string v2, "total"

    .line 13
    iput-object v2, v1, Lcom/kwad/sdk/core/threads/b;->aBP:Ljava/lang/String;

    .line 14
    iput v0, v1, Lcom/kwad/sdk/core/threads/b;->aBS:I

    .line 15
    invoke-static {v1}, Lcom/kwad/sdk/commercial/b;->q(Lcom/kwad/sdk/commercial/c/a;)V

    .line 16
    invoke-static {}, Lcom/kwad/sdk/core/threads/c;->GC()I

    .line 17
    invoke-static {}, Lcom/kwad/sdk/core/threads/c;->GD()I

    move-result v0

    invoke-static {}, Lcom/kwad/sdk/core/threads/c;->GE()I

    move-result v1

    if-ge v0, v1, :cond_4

    .line 18
    iget-object v0, p0, Lcom/kwad/sdk/core/threads/c$2;->aCf:Landroid/os/Handler;

    invoke-static {}, Lcom/kwad/sdk/core/threads/c;->GF()J

    move-result-wide v1

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_4
    return-void
.end method
