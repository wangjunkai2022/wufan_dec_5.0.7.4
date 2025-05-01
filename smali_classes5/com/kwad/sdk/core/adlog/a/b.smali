.class public final Lcom/kwad/sdk/core/adlog/a/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/sdk/core/adlog/a/b$a;
    }
.end annotation


# instance fields
.field private final aqB:Lcom/kwad/sdk/core/adlog/a/c;

.field private final aqC:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/sdk/core/adlog/a/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/adlog/a/b;->aqC:Ljava/util/List;

    .line 4
    const-class v0, Lcom/kwad/sdk/service/a/h;

    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/h;

    invoke-interface {v0}, Lcom/kwad/sdk/service/a/h;->zE()Ljava/lang/String;

    move-result-object v0

    .line 5
    new-instance v1, Lcom/kwad/sdk/core/adlog/a/b$1;

    invoke-direct {v1, p0}, Lcom/kwad/sdk/core/adlog/a/b$1;-><init>(Lcom/kwad/sdk/core/adlog/a/b;)V

    invoke-static {v0, v1}, Lcom/kwad/sdk/utils/t;->b(Ljava/lang/String;Lcom/kwad/sdk/core/c;)Lcom/kwad/sdk/core/b;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/core/adlog/a/c;

    iput-object v0, p0, Lcom/kwad/sdk/core/adlog/a/b;->aqB:Lcom/kwad/sdk/core/adlog/a/c;

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/adlog/a/b;-><init>()V

    return-void
.end method

.method public static BQ()Lcom/kwad/sdk/core/adlog/a/b;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/core/adlog/a/b$a;->BW()Lcom/kwad/sdk/core/adlog/a/b;

    move-result-object v0

    return-object v0
.end method

.method private declared-synchronized BS()Lcom/kwad/sdk/core/adlog/a/a;
    .locals 2
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/a/b;->aqC:Ljava/util/List;

    invoke-static {v0}, Lcom/kwad/sdk/utils/ai;->I(Ljava/util/List;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 2
    monitor-exit p0

    return-object v0

    .line 3
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/a/b;->aqC:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/core/adlog/a/a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private BU()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/a/b;->aqB:Lcom/kwad/sdk/core/adlog/a/c;

    if-eqz v0, :cond_1

    iget-boolean v0, v0, Lcom/kwad/sdk/core/adlog/a/c;->aqF:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method private declared-synchronized a(Lcom/kwad/sdk/core/adlog/a/a;)V
    .locals 1

    monitor-enter p0

    .line 17
    :try_start_0
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/a/b;->aqC:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public final BR()V
    .locals 1

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/kwad/sdk/core/adlog/a/b;->BU()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/a/b;->aqC:Ljava/util/List;

    invoke-static {v0}, Lcom/kwad/sdk/utils/ai;->I(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 3
    :cond_1
    new-instance v0, Lcom/kwad/sdk/core/adlog/a/b$2;

    invoke-direct {v0, p0}, Lcom/kwad/sdk/core/adlog/a/b$2;-><init>(Lcom/kwad/sdk/core/adlog/a/b;)V

    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 4
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final BT()Lcom/kwad/sdk/core/adlog/a/a;
    .locals 9
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/adlog/a/b;->BS()Lcom/kwad/sdk/core/adlog/a/a;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 2
    :cond_0
    iget-object v2, p0, Lcom/kwad/sdk/core/adlog/a/b;->aqB:Lcom/kwad/sdk/core/adlog/a/c;

    iget-object v3, p0, Lcom/kwad/sdk/core/adlog/a/b;->aqC:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v0, v2, v3}, Lcom/kwad/sdk/core/adlog/b/a;->d(Lcom/kwad/sdk/core/adlog/a/a;Lcom/kwad/sdk/core/adlog/a/c;I)V

    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, v0, Lcom/kwad/sdk/core/adlog/a/a;->aqy:J

    sub-long/2addr v2, v4

    .line 4
    iget-object v4, p0, Lcom/kwad/sdk/core/adlog/a/b;->aqB:Lcom/kwad/sdk/core/adlog/a/c;

    iget-wide v5, v4, Lcom/kwad/sdk/core/adlog/a/c;->aqH:J

    const-wide/16 v7, 0x3e8

    mul-long v5, v5, v7

    const/4 v7, 0x1

    cmp-long v8, v2, v5

    if-lez v8, :cond_1

    const/4 v5, 0x1

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    :goto_0
    const-string v6, "AdLogCacheManager"

    if-eqz v5, :cond_2

    .line 5
    iget-object v5, p0, Lcom/kwad/sdk/core/adlog/a/b;->aqC:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    invoke-static {v0, v4, v5, v2, v3}, Lcom/kwad/sdk/core/adlog/b/a;->b(Lcom/kwad/sdk/core/adlog/a/a;Lcom/kwad/sdk/core/adlog/a/c;IJ)V

    .line 6
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "getCache fail expired cacheTime: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", adLogCache\uff1a"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    .line 7
    :cond_2
    iget v1, v0, Lcom/kwad/sdk/core/adlog/a/a;->retryCount:I

    add-int/2addr v1, v7

    iput v1, v0, Lcom/kwad/sdk/core/adlog/a/a;->retryCount:I

    .line 8
    iget-object v1, p0, Lcom/kwad/sdk/core/adlog/a/b;->aqC:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v0, v4, v1, v2, v3}, Lcom/kwad/sdk/core/adlog/b/a;->a(Lcom/kwad/sdk/core/adlog/a/a;Lcom/kwad/sdk/core/adlog/a/c;IJ)V

    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "getCache success\uff1a"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v6, v1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final a(Lcom/kwad/sdk/core/adlog/a/a;Ljava/lang/String;Lorg/json/JSONObject;Lcom/kwad/sdk/core/adlog/c/a;ILjava/lang/String;)V
    .locals 1
    .param p1    # Lcom/kwad/sdk/core/adlog/a/a;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/kwad/sdk/core/adlog/a/b;->BU()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    .line 2
    invoke-static {}, Lcom/kwad/sdk/core/adlog/a/a;->BP()Lcom/kwad/sdk/core/adlog/a/a;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/kwad/sdk/core/adlog/a/a;->dg(Ljava/lang/String;)Lcom/kwad/sdk/core/adlog/a/a;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/kwad/sdk/core/adlog/a/a;->i(Lorg/json/JSONObject;)Lcom/kwad/sdk/core/adlog/a/a;

    move-result-object p1

    .line 3
    invoke-virtual {p1, p4}, Lcom/kwad/sdk/core/adlog/a/a;->c(Lcom/kwad/sdk/core/adlog/c/a;)Lcom/kwad/sdk/core/adlog/a/a;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Lcom/kwad/sdk/core/adlog/a/a;->ak(J)Lcom/kwad/sdk/core/adlog/a/a;

    move-result-object p1

    .line 4
    :cond_1
    invoke-virtual {p1, p5}, Lcom/kwad/sdk/core/adlog/a/a;->cr(I)Lcom/kwad/sdk/core/adlog/a/a;

    move-result-object p2

    invoke-virtual {p2, p6}, Lcom/kwad/sdk/core/adlog/a/a;->dh(Ljava/lang/String;)Lcom/kwad/sdk/core/adlog/a/a;

    .line 5
    iget-object p2, p0, Lcom/kwad/sdk/core/adlog/a/b;->aqB:Lcom/kwad/sdk/core/adlog/a/c;

    iget-object p3, p0, Lcom/kwad/sdk/core/adlog/a/b;->aqC:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p3

    invoke-static {p1, p2, p3}, Lcom/kwad/sdk/core/adlog/b/a;->a(Lcom/kwad/sdk/core/adlog/a/a;Lcom/kwad/sdk/core/adlog/a/c;I)V

    .line 6
    iget p2, p1, Lcom/kwad/sdk/core/adlog/a/a;->retryCount:I

    iget-object p3, p0, Lcom/kwad/sdk/core/adlog/a/b;->aqB:Lcom/kwad/sdk/core/adlog/a/c;

    iget p4, p3, Lcom/kwad/sdk/core/adlog/a/c;->aqG:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string p5, ", log: "

    const-string p6, "AdLogCacheManager"

    if-lt p2, p4, :cond_2

    .line 7
    :try_start_1
    iget-object p2, p0, Lcom/kwad/sdk/core/adlog/a/b;->aqC:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    invoke-static {p1, p3, p2}, Lcom/kwad/sdk/core/adlog/b/a;->c(Lcom/kwad/sdk/core/adlog/a/a;Lcom/kwad/sdk/core/adlog/a/c;I)V

    .line 8
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "addCache fail limit retryCount: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p3, p1, Lcom/kwad/sdk/core/adlog/a/a;->retryCount:I

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p6, p1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 9
    :cond_2
    iget-object p2, p0, Lcom/kwad/sdk/core/adlog/a/b;->aqC:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    iget-object p3, p0, Lcom/kwad/sdk/core/adlog/a/b;->aqB:Lcom/kwad/sdk/core/adlog/a/c;

    iget p3, p3, Lcom/kwad/sdk/core/adlog/a/c;->aqI:I

    if-lt p2, p3, :cond_3

    .line 10
    invoke-direct {p0}, Lcom/kwad/sdk/core/adlog/a/b;->BS()Lcom/kwad/sdk/core/adlog/a/a;

    move-result-object p2

    .line 11
    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "addCache limit size: "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p4, p0, Lcom/kwad/sdk/core/adlog/a/b;->aqC:Ljava/util/List;

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p4, ", remove log\uff1a"

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p6, p3}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    iget-object p3, p0, Lcom/kwad/sdk/core/adlog/a/b;->aqB:Lcom/kwad/sdk/core/adlog/a/c;

    iget-object p4, p0, Lcom/kwad/sdk/core/adlog/a/b;->aqC:Ljava/util/List;

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result p4

    invoke-static {p2, p3, p4}, Lcom/kwad/sdk/core/adlog/b/a;->e(Lcom/kwad/sdk/core/adlog/a/a;Lcom/kwad/sdk/core/adlog/a/c;I)V

    .line 13
    :cond_3
    invoke-direct {p0, p1}, Lcom/kwad/sdk/core/adlog/a/b;->a(Lcom/kwad/sdk/core/adlog/a/a;)V

    .line 14
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "addCache success size: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p3, p0, Lcom/kwad/sdk/core/adlog/a/b;->aqC:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p6, p2}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    iget-object p2, p0, Lcom/kwad/sdk/core/adlog/a/b;->aqB:Lcom/kwad/sdk/core/adlog/a/c;

    iget-object p3, p0, Lcom/kwad/sdk/core/adlog/a/b;->aqC:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p3

    invoke-static {p1, p2, p3}, Lcom/kwad/sdk/core/adlog/b/a;->b(Lcom/kwad/sdk/core/adlog/a/a;Lcom/kwad/sdk/core/adlog/a/c;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 16
    invoke-static {p1}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method
