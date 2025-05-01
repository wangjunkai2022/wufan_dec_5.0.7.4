.class public final enum Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;

.field public static final enum Instance:Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;

.field private static final expiredThresholds:I = 0xdbba0


# instance fields
.field private hasInit:Z

.field private isDebug:Z

.field private lastAutoClearTime:J

.field private mSnapshots:Landroid/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LruCache<",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Lcom/kwai/adclient/kscommerciallogger/snapshot/c;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;

    const-string v1, "Instance"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->Instance:Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;

    aput-object v0, v1, v2

    .line 2
    sput-object v1, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->$VALUES:[Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->isDebug:Z

    .line 3
    iput-boolean p1, p0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->hasInit:Z

    return-void
.end method

.method private autoClear()V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->mSnapshots:Landroid/util/LruCache;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/util/LruCache;->size()I

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->lastAutoClearTime:J

    sub-long/2addr v0, v2

    const-wide/32 v2, 0xdbba0

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    goto :goto_2

    .line 2
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->lastAutoClearTime:J

    .line 3
    iget-object v0, p0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->mSnapshots:Landroid/util/LruCache;

    invoke-virtual {v0}, Landroid/util/LruCache;->snapshot()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 4
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 5
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    if-eqz v1, :cond_1

    .line 6
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .line 7
    iget-object v6, p0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->mSnapshots:Landroid/util/LruCache;

    invoke-virtual {v6, v4}, Landroid/util/LruCache;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    :cond_2
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    .line 9
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/kwai/adclient/kscommerciallogger/snapshot/c;

    .line 10
    iget-wide v7, p0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->lastAutoClearTime:J

    invoke-virtual {v6}, Lcom/kwai/adclient/kscommerciallogger/snapshot/c;->Pd()J

    move-result-wide v9

    sub-long/2addr v7, v9

    cmp-long v6, v7, v2

    if-ltz v6, :cond_2

    .line 11
    invoke-interface {v5}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    .line 12
    :cond_3
    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v5

    if-lez v5, :cond_1

    .line 13
    iget-object v5, p0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->mSnapshots:Landroid/util/LruCache;

    invoke-virtual {v5, v4, v1}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_4
    :goto_2
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;
    .locals 1

    .line 1
    const-class v0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;

    return-object p0
.end method

.method public static values()[Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->$VALUES:[Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;

    invoke-virtual {v0}, [Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;

    return-object v0
.end method


# virtual methods
.method public final cacheLimit()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->mSnapshots:Landroid/util/LruCache;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Landroid/util/LruCache;->maxSize()I

    move-result v0

    return v0
.end method

.method public final clearBySegment(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->mSnapshots:Landroid/util/LruCache;

    if-nez v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    monitor-enter p0

    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->mSnapshots:Landroid/util/LruCache;

    invoke-virtual {v0}, Landroid/util/LruCache;->snapshot()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 4
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0, v1, p1}, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->clearBySegment(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 5
    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_2
    :goto_1
    return-void
.end method

.method public final clearBySegment(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 6
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->mSnapshots:Landroid/util/LruCache;

    if-nez v0, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    monitor-enter p0

    .line 8
    :try_start_0
    iget-object v0, p0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->mSnapshots:Landroid/util/LruCache;

    invoke-virtual {v0, p1}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    .line 9
    new-instance v1, Lcom/kwai/adclient/kscommerciallogger/snapshot/c;

    invoke-direct {v1, p2}, Lcom/kwai/adclient/kscommerciallogger/snapshot/c;-><init>(Ljava/lang/String;)V

    if-eqz v0, :cond_1

    .line 10
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 11
    iget-object p2, p0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->mSnapshots:Landroid/util/LruCache;

    invoke-virtual {p2, p1}, Landroid/util/LruCache;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 13
    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result p2

    if-lez p2, :cond_1

    .line 14
    iget-object p2, p0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->mSnapshots:Landroid/util/LruCache;

    invoke-virtual {p2, p1, v0}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    :cond_1
    invoke-direct {p0}, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->autoClear()V

    .line 16
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_2
    :goto_0
    return-void
.end method

.method public final clearBySessionId(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->mSnapshots:Landroid/util/LruCache;

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    monitor-enter p0

    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->mSnapshots:Landroid/util/LruCache;

    invoke-virtual {v0, p1}, Landroid/util/LruCache;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    invoke-direct {p0}, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->autoClear()V

    .line 5
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public final declared-synchronized init(IZ)V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->hasInit:Z

    if-nez v0, :cond_1

    .line 2
    iput-boolean p2, p0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->isDebug:Z

    if-lez p1, :cond_0

    .line 3
    new-instance p2, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager$1;

    invoke-direct {p2, p0, p1}, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager$1;-><init>(Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;I)V

    iput-object p2, p0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->mSnapshots:Landroid/util/LruCache;

    :cond_0
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->hasInit:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized isOverThreshold()Z
    .locals 6

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->cacheLimit()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_2

    invoke-virtual {p0}, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->segmentSize()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0}, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->segmentSize()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->cacheLimit()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v0, v2

    float-to-double v2, v0

    invoke-static {v2, v3}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    move-result-object v0

    const/4 v2, 0x2

    sget-object v3, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    invoke-virtual {v0, v2, v3}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Ljava/math/BigDecimal;->doubleValue()D

    move-result-wide v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide v4, 0x3fe6666666666666L    # 0.7

    cmpl-double v0, v2, v4

    if-ltz v0, :cond_1

    const/4 v0, 0x1

    .line 4
    monitor-exit p0

    return v0

    :cond_1
    monitor-exit p0

    return v1

    .line 5
    :cond_2
    :goto_0
    monitor-exit p0

    return v1

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final justLoadInfoBySessionId(Ljava/lang/String;)Lorg/json/JSONArray;
    .locals 3

    .line 1
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->mSnapshots:Landroid/util/LruCache;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/util/LruCache;->size()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    monitor-enter p0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->mSnapshots:Landroid/util/LruCache;

    invoke-virtual {v1, p1}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    if-eqz v1, :cond_1

    .line 5
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/kwai/adclient/kscommerciallogger/snapshot/c;

    .line 6
    invoke-virtual {v2, p1}, Lcom/kwai/adclient/kscommerciallogger/snapshot/c;->hx(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    .line 7
    :cond_1
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_2
    :goto_1
    return-object v0
.end method

.method public final loadInfoBySessionId(Ljava/lang/String;)Lorg/json/JSONArray;
    .locals 3

    .line 1
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->mSnapshots:Landroid/util/LruCache;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/util/LruCache;->size()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    monitor-enter p0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->mSnapshots:Landroid/util/LruCache;

    invoke-virtual {v1, p1}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    if-eqz v1, :cond_2

    .line 5
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/kwai/adclient/kscommerciallogger/snapshot/c;

    .line 6
    invoke-virtual {v2, p1}, Lcom/kwai/adclient/kscommerciallogger/snapshot/c;->hx(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    .line 7
    :cond_1
    iget-object v1, p0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->mSnapshots:Landroid/util/LruCache;

    invoke-virtual {v1, p1}, Landroid/util/LruCache;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    :cond_2
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_3
    :goto_1
    return-object v0
.end method

.method public final loadSegment(Ljava/lang/String;Ljava/lang/String;)Lcom/kwai/adclient/kscommerciallogger/snapshot/c;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/16 v0, 0xa

    .line 20
    invoke-virtual {p0, p1, p2, v0}, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->loadSegment(Ljava/lang/String;Ljava/lang/String;I)Lcom/kwai/adclient/kscommerciallogger/snapshot/c;

    move-result-object p1

    return-object p1
.end method

.method public final loadSegment(Ljava/lang/String;Ljava/lang/String;I)Lcom/kwai/adclient/kscommerciallogger/snapshot/c;
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->mSnapshots:Landroid/util/LruCache;

    if-nez v0, :cond_2

    .line 2
    iget-boolean p1, p0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->hasInit:Z

    if-nez p1, :cond_1

    iget-boolean p1, p0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->isDebug:Z

    if-nez p1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "you need init first"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 4
    :cond_1
    :goto_0
    new-instance p1, Lcom/kwai/adclient/kscommerciallogger/snapshot/a;

    const-string p2, "empty"

    invoke-direct {p1, p2}, Lcom/kwai/adclient/kscommerciallogger/snapshot/a;-><init>(Ljava/lang/String;)V

    return-object p1

    .line 5
    :cond_2
    monitor-enter p0

    .line 6
    :try_start_0
    iget-object v0, p0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->mSnapshots:Landroid/util/LruCache;

    invoke-virtual {v0, p1}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    if-eqz v0, :cond_4

    .line 7
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/kwai/adclient/kscommerciallogger/snapshot/c;

    .line 8
    invoke-virtual {v2}, Lcom/kwai/adclient/kscommerciallogger/snapshot/c;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 9
    monitor-exit p0

    return-object v2

    .line 10
    :cond_4
    new-instance v1, Lcom/kwai/adclient/kscommerciallogger/snapshot/c;

    invoke-direct {v1, p2, p3}, Lcom/kwai/adclient/kscommerciallogger/snapshot/c;-><init>(Ljava/lang/String;I)V

    if-eqz v0, :cond_5

    .line 11
    iget-object p2, p0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->mSnapshots:Landroid/util/LruCache;

    invoke-virtual {p2, p1}, Landroid/util/LruCache;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 13
    iget-object p2, p0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->mSnapshots:Landroid/util/LruCache;

    invoke-virtual {p2, p1, v0}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 14
    :cond_5
    new-instance p2, Ljava/util/LinkedHashSet;

    invoke-direct {p2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 15
    invoke-virtual {p2, v1}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z

    .line 16
    iget-object p3, p0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->mSnapshots:Landroid/util/LruCache;

    invoke-virtual {p3, p1, p2}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    :goto_1
    invoke-direct {p0}, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->autoClear()V

    .line 18
    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception p1

    .line 19
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :goto_2
    throw p1

    :goto_3
    goto :goto_2
.end method

.method public final loadSessionId()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final loadSpan(Ljava/lang/String;Ljava/lang/String;)Lcom/kwai/adclient/kscommerciallogger/snapshot/d;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "span"

    .line 1
    invoke-virtual {p0, p1, p2, v0}, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->loadSpan(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kwai/adclient/kscommerciallogger/snapshot/d;

    move-result-object p1

    return-object p1
.end method

.method public final loadSpan(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kwai/adclient/kscommerciallogger/snapshot/d;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->loadSegment(Ljava/lang/String;Ljava/lang/String;)Lcom/kwai/adclient/kscommerciallogger/snapshot/c;

    move-result-object p1

    .line 3
    invoke-virtual {p1, p3}, Lcom/kwai/adclient/kscommerciallogger/snapshot/c;->hw(Ljava/lang/String;)Lcom/kwai/adclient/kscommerciallogger/snapshot/d;

    move-result-object p1

    return-object p1
.end method

.method public final declared-synchronized mostUsedSegmentInfo()Ljava/util/Map$Entry;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    .line 1
    :try_start_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->mSnapshots:Landroid/util/LruCache;

    invoke-virtual {v1}, Landroid/util/LruCache;->snapshot()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 3
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/kwai/adclient/kscommerciallogger/snapshot/c;

    .line 4
    invoke-virtual {v3}, Lcom/kwai/adclient/kscommerciallogger/snapshot/c;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    const/4 v5, 0x1

    if-nez v4, :cond_1

    .line 5
    invoke-virtual {v3}, Lcom/kwai/adclient/kscommerciallogger/snapshot/c;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {v3}, Lcom/kwai/adclient/kscommerciallogger/snapshot/c;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    add-int/2addr v4, v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 7
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 9
    new-instance v0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager$2;

    invoke-direct {v0, p0}, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager$2;-><init>(Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;)V

    invoke-static {v1, v0}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method

.method public final declared-synchronized segmentSize()I
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->mSnapshots:Landroid/util/LruCache;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 2
    monitor-exit p0

    return v0

    .line 3
    :cond_0
    :try_start_1
    invoke-virtual {v0}, Landroid/util/LruCache;->size()I

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized size()I
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/kwai/adclient/kscommerciallogger/snapshot/SegmentManager;->mSnapshots:Landroid/util/LruCache;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 2
    monitor-exit p0

    return v0

    .line 3
    :cond_0
    :try_start_1
    invoke-virtual {v0}, Landroid/util/LruCache;->snapshot()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
