.class public Lcom/mob/commons/a/g;
.super Lcom/mob/commons/a/c;


# static fields
.field private static c:Lcom/mob/commons/k;

.field private static final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "014MehXf ecdhHdci0diddWfYdhVg[dkej"

    .line 1
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/mob/commons/a/g;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 10

    const-string v0, "002Yffdi"

    .line 1
    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v0, "005<ffdiej1dj"

    invoke-static {v0}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-wide/16 v3, 0x0

    const-wide/16 v6, 0x1e

    const-wide/16 v8, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v9}, Lcom/mob/commons/a/c;-><init>(Ljava/lang/String;JLjava/lang/String;JJ)V

    return-void
.end method

.method private a(JJ)V
    .locals 3

    .line 15
    :try_start_0
    invoke-static {}, Lcom/mob/commons/ab;->a()Lcom/mob/commons/ab;

    move-result-object v0

    sget-object v1, Lcom/mob/commons/a/g;->d:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/mob/commons/ab;->c(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    if-nez v0, :cond_0

    .line 16
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 17
    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    invoke-static {}, Lcom/mob/commons/ab;->a()Lcom/mob/commons/ab;

    move-result-object p1

    invoke-virtual {p1, v1, v0}, Lcom/mob/commons/ab;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 19
    invoke-static {}, Lcom/mob/tools/MobLog;->getInstance()Lcom/mob/tools/log/NLog;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/mob/tools/log/NLog;->w(Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method private b(J)V
    .locals 7

    .line 1
    invoke-static {}, Lcom/mob/commons/l;->a()Lcom/mob/commons/l;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mob/commons/l;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/mob/commons/a/g;

    invoke-direct {v0}, Lcom/mob/commons/a/g;-><init>()V

    const/4 v1, 0x1

    .line 3
    invoke-virtual {v0, v1}, Lcom/mob/commons/a/c;->a(Z)Lcom/mob/commons/a/c;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/mob/commons/a/c;->b(Z)Lcom/mob/commons/a/c;

    move-result-object v2

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Long;

    const-wide/16 v5, 0x3

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    aput-object p1, v4, v1

    invoke-virtual {v2, v4}, Lcom/mob/commons/a/c;->a(Ljava/lang/Object;)Lcom/mob/commons/a/c;

    .line 4
    invoke-static {}, Lcom/mob/commons/a/d;->a()Lcom/mob/commons/a/d;

    move-result-object p1

    invoke-virtual {p0}, Lcom/mob/commons/a/c;->l()J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/mob/commons/a/d;->a(Lcom/mob/commons/a/c;JI)V

    :cond_0
    return-void
.end method

.method private m()V
    .locals 7

    .line 1
    :try_start_0
    invoke-static {}, Lcom/mob/commons/ab;->a()Lcom/mob/commons/ab;

    move-result-object v0

    sget-object v1, Lcom/mob/commons/a/g;->d:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/mob/commons/ab;->c(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 4
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    .line 5
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    sub-long v2, v4, v2

    .line 6
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v6, "005Qdg%eiYdiBg"

    .line 7
    invoke-static {v6}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v1, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "008<djdg eiEdidf=f0fi"

    .line 8
    invoke-static {v4}, Lcom/mob/commons/s;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "BKIOMT"

    .line 9
    invoke-virtual {p0, v2, v1}, Lcom/mob/commons/a/c;->a(Ljava/lang/String;Ljava/util/HashMap;)V

    goto :goto_0

    .line 10
    :cond_0
    invoke-static {}, Lcom/mob/commons/ab;->a()Lcom/mob/commons/ab;

    move-result-object v0

    sget-object v1, Lcom/mob/commons/a/g;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/mob/commons/ab;->b(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    .line 11
    invoke-static {}, Lcom/mob/tools/MobLog;->getInstance()Lcom/mob/tools/log/NLog;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/mob/tools/log/NLog;->w(Ljava/lang/Throwable;)I

    :cond_1
    :goto_1
    return-void
.end method

.method private static declared-synchronized n()Z
    .locals 3

    const-class v0, Lcom/mob/commons/a/g;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-object v1, Lcom/mob/commons/a/g;->c:Lcom/mob/commons/k;

    if-nez v1, :cond_0

    .line 2
    new-instance v1, Lcom/mob/commons/a/g$1;

    invoke-direct {v1}, Lcom/mob/commons/a/g$1;-><init>()V

    sput-object v1, Lcom/mob/commons/a/g;->c:Lcom/mob/commons/k;

    .line 3
    invoke-static {}, Lcom/mob/commons/l;->a()Lcom/mob/commons/l;

    move-result-object v1

    sget-object v2, Lcom/mob/commons/a/g;->c:Lcom/mob/commons/k;

    invoke-virtual {v1, v2}, Lcom/mob/commons/l;->a(Lcom/mob/commons/k;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x1

    .line 4
    monitor-exit v0

    return v1

    :cond_0
    const/4 v1, 0x0

    .line 5
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method protected a()V
    .locals 11

    .line 1
    invoke-virtual {p0}, Lcom/mob/commons/a/c;->g()Z

    move-result v0

    if-nez v0, :cond_4

    .line 2
    iget-object v0, p0, Lcom/mob/commons/a/c;->b:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Long;

    const/4 v1, 0x0

    .line 3
    aget-object v1, v0, v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    const/4 v3, 0x1

    .line 4
    aget-object v3, v0, v3

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    const-wide/16 v5, 0x3

    cmp-long v7, v1, v5

    if-nez v7, :cond_0

    .line 5
    array-length v7, v0

    const/4 v8, 0x3

    if-ge v7, v8, :cond_0

    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    goto :goto_0

    :cond_0
    const/4 v7, 0x2

    .line 7
    aget-object v0, v0, v7

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    :goto_0
    const-wide/16 v9, 0x0

    cmp-long v0, v1, v9

    if-nez v0, :cond_1

    .line 8
    invoke-direct {p0}, Lcom/mob/commons/a/g;->m()V

    .line 9
    invoke-direct {p0, v3, v4, v7, v8}, Lcom/mob/commons/a/g;->a(JJ)V

    .line 10
    invoke-direct {p0, v3, v4}, Lcom/mob/commons/a/g;->b(J)V

    goto :goto_2

    :cond_1
    const-wide/16 v9, 0x1

    cmp-long v0, v1, v9

    if-eqz v0, :cond_3

    cmp-long v0, v1, v5

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    const-wide/16 v5, 0x2

    cmp-long v0, v1, v5

    if-nez v0, :cond_4

    .line 11
    invoke-direct {p0, v3, v4, v7, v8}, Lcom/mob/commons/a/g;->a(JJ)V

    .line 12
    invoke-direct {p0}, Lcom/mob/commons/a/g;->m()V

    goto :goto_2

    .line 13
    :cond_3
    :goto_1
    invoke-direct {p0, v3, v4, v7, v8}, Lcom/mob/commons/a/g;->a(JJ)V

    .line 14
    invoke-direct {p0, v3, v4}, Lcom/mob/commons/a/g;->b(J)V

    :cond_4
    :goto_2
    return-void
.end method

.method protected c()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/mob/commons/a/g;->n()Z

    return-void
.end method
