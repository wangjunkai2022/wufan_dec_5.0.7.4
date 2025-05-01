.class public Lcom/ss/android/socialbase/downloader/network/p;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ss/android/socialbase/downloader/network/p$m;,
        Lcom/ss/android/socialbase/downloader/network/p$vv;,
        Lcom/ss/android/socialbase/downloader/network/p$p;
    }
.end annotation


# instance fields
.field private final m:Landroid/os/Handler;

.field private final p:Landroid/os/Handler;

.field private final vv:Lcom/ss/android/socialbase/downloader/wv/qv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ss/android/socialbase/downloader/wv/qv<",
            "Ljava/lang/String;",
            "Lcom/ss/android/socialbase/downloader/network/p$m;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lcom/ss/android/socialbase/downloader/wv/qv;

    const/4 v1, 0x4

    const/16 v2, 0x10

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/ss/android/socialbase/downloader/wv/qv;-><init>(IIZ)V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/network/p;->vv:Lcom/ss/android/socialbase/downloader/wv/qv;

    .line 4
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Lcom/ss/android/socialbase/downloader/network/vv/m;->vv()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/network/p;->m:Landroid/os/Handler;

    .line 5
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Lcom/ss/android/socialbase/downloader/qv/o;->vv()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/network/p;->p:Landroid/os/Handler;

    return-void
.end method

.method synthetic constructor <init>(Lcom/ss/android/socialbase/downloader/network/p$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/network/p;-><init>()V

    return-void
.end method

.method private m(Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/p$vv;J)V
    .locals 7

    .line 1
    :try_start_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/network/p;->vv:Lcom/ss/android/socialbase/downloader/wv/qv;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 4
    :try_start_1
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/network/p;->vv:Lcom/ss/android/socialbase/downloader/wv/qv;

    invoke-virtual {v2, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ss/android/socialbase/downloader/network/p$m;

    .line 5
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    if-eqz v2, :cond_1

    .line 6
    :try_start_2
    invoke-static {}, Lcom/ss/android/socialbase/downloader/n/vv;->p()Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v1

    const-string v3, "dns_expire_min"

    const/16 v4, 0xa

    invoke-virtual {v1, v3, v4}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result v1

    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v5, v2, Lcom/ss/android/socialbase/downloader/network/p$m;->m:J

    sub-long/2addr v3, v5

    mul-int/lit8 v1, v1, 0x3c

    mul-int/lit16 v1, v1, 0x3e8

    int-to-long v5, v1

    cmp-long v1, v3, v5

    if-gez v1, :cond_1

    if-eqz p2, :cond_0

    .line 8
    iget-object p3, v2, Lcom/ss/android/socialbase/downloader/network/p$m;->vv:Ljava/util/List;

    invoke-interface {p2, p1, p3}, Lcom/ss/android/socialbase/downloader/network/p$vv;->vv(Ljava/lang/String;Ljava/util/List;)V

    :cond_0
    return-void

    .line 9
    :cond_1
    new-instance v1, Lcom/ss/android/socialbase/downloader/network/p$2;

    invoke-direct {v1, p0, p2, p1, v2}, Lcom/ss/android/socialbase/downloader/network/p$2;-><init>(Lcom/ss/android/socialbase/downloader/network/p;Lcom/ss/android/socialbase/downloader/network/p$vv;Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/p$m;)V

    .line 10
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/network/p;->p:Landroid/os/Handler;

    invoke-virtual {v3, v1, p3, p4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    const/4 p3, 0x0

    .line 11
    invoke-static {}, Lcom/ss/android/socialbase/downloader/n/vv;->p()Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object p4

    const-string v3, "use_host_dns"

    const/4 v4, 0x1

    invoke-virtual {p4, v3, v4}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result p4

    if-ne p4, v4, :cond_2

    .line 12
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->v()Lcom/ss/android/socialbase/downloader/network/u;

    move-result-object p4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    if-eqz p4, :cond_2

    .line 13
    :try_start_3
    invoke-interface {p4, v0}, Lcom/ss/android/socialbase/downloader/network/u;->vv(Ljava/lang/String;)Ljava/util/List;

    move-result-object p3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p4

    .line 14
    :try_start_4
    invoke-virtual {p4}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_2
    :goto_0
    if-eqz p3, :cond_3

    .line 15
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p4

    if-eqz p4, :cond_4

    .line 16
    :cond_3
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->ya()Lcom/ss/android/socialbase/downloader/network/u;

    move-result-object p4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 17
    :try_start_5
    invoke-interface {p4, v0}, Lcom/ss/android/socialbase/downloader/network/u;->vv(Ljava/lang/String;)Ljava/util/List;

    move-result-object p3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p4

    .line 18
    :try_start_6
    invoke-virtual {p4}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_4
    :goto_1
    if-eqz p3, :cond_6

    .line 19
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p4

    if-eqz p4, :cond_5

    goto :goto_2

    .line 20
    :cond_5
    invoke-direct {p0, v0, p3}, Lcom/ss/android/socialbase/downloader/network/p;->vv(Ljava/lang/String;Ljava/util/List;)V

    goto :goto_3

    :cond_6
    :goto_2
    if-eqz v2, :cond_7

    .line 21
    iget-object p3, v2, Lcom/ss/android/socialbase/downloader/network/p$m;->vv:Ljava/util/List;

    .line 22
    :cond_7
    :goto_3
    iget-object p4, p0, Lcom/ss/android/socialbase/downloader/network/p;->p:Landroid/os/Handler;

    invoke-virtual {p4, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    if-eqz p2, :cond_8

    .line 23
    invoke-interface {p2, p1, p3}, Lcom/ss/android/socialbase/downloader/network/p$vv;->vv(Ljava/lang/String;Ljava/util/List;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :cond_8
    return-void

    :catchall_2
    move-exception p1

    .line 24
    :try_start_7
    monitor-exit v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :try_start_8
    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :catchall_3
    move-exception p1

    .line 25
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public static vv()Lcom/ss/android/socialbase/downloader/network/p;
    .locals 1

    .line 2
    invoke-static {}, Lcom/ss/android/socialbase/downloader/network/p$p;->vv()Lcom/ss/android/socialbase/downloader/network/p;

    move-result-object v0

    return-object v0
.end method

.method static synthetic vv(Lcom/ss/android/socialbase/downloader/network/p;Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/p$vv;J)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ss/android/socialbase/downloader/network/p;->m(Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/p$vv;J)V

    return-void
.end method

.method private vv(Ljava/lang/String;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/net/InetAddress;",
            ">;)V"
        }
    .end annotation

    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/network/p;->vv:Lcom/ss/android/socialbase/downloader/wv/qv;

    monitor-enter v0

    .line 5
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/network/p;->vv:Lcom/ss/android/socialbase/downloader/wv/qv;

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ss/android/socialbase/downloader/network/p$m;

    if-nez v1, :cond_0

    .line 6
    new-instance v1, Lcom/ss/android/socialbase/downloader/network/p$m;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/ss/android/socialbase/downloader/network/p$m;-><init>(Lcom/ss/android/socialbase/downloader/network/p$1;)V

    .line 7
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/network/p;->vv:Lcom/ss/android/socialbase/downloader/wv/qv;

    invoke-virtual {v2, p1, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    :cond_0
    iput-object p2, v1, Lcom/ss/android/socialbase/downloader/network/p$m;->vv:Ljava/util/List;

    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, v1, Lcom/ss/android/socialbase/downloader/network/p$m;->m:J

    .line 10
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method


# virtual methods
.method public vv(Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/p$vv;J)V
    .locals 8

    .line 3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/network/p;->m:Landroid/os/Handler;

    new-instance v7, Lcom/ss/android/socialbase/downloader/network/p$1;

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-wide v5, p3

    invoke-direct/range {v1 .. v6}, Lcom/ss/android/socialbase/downloader/network/p$1;-><init>(Lcom/ss/android/socialbase/downloader/network/p;Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/p$vv;J)V

    invoke-virtual {v0, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
