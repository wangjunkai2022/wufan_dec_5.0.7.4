.class public Lcom/ss/android/socialbase/downloader/network/vv/p;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/socialbase/downloader/network/n;


# static fields
.field private static final o:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private b:Lcom/ss/android/socialbase/downloader/network/n;

.field protected final i:Ljava/lang/Object;

.field private k:Z

.field protected final m:J

.field private n:I

.field protected p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/p;",
            ">;"
        }
    .end annotation
.end field

.field private qv:J

.field private u:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field protected final vv:Ljava/lang/String;

.field private wv:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 2
    sput-object v0, Lcom/ss/android/socialbase/downloader/network/vv/p;->o:Ljava/util/ArrayList;

    const-string v1, "Content-Length"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "Content-Range"

    .line 3
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "Transfer-Encoding"

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "Accept-Ranges"

    .line 5
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "Etag"

    .line 6
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "Content-Disposition"

    .line 7
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;J)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/p;",
            ">;J)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->u:Ljava/util/Map;

    .line 3
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->i:Ljava/lang/Object;

    .line 4
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->vv:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->p:Ljava/util/List;

    .line 6
    iput-wide p3, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->m:J

    return-void
.end method

.method private vv(Lcom/ss/android/socialbase/downloader/network/n;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ss/android/socialbase/downloader/network/n;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_1

    .line 24
    :cond_0
    sget-object v0, Lcom/ss/android/socialbase/downloader/network/vv/p;->o:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 25
    invoke-interface {p1, v1}, Lcom/ss/android/socialbase/downloader/network/n;->vv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 26
    invoke-interface {p2, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method


# virtual methods
.method public i()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->i:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-boolean v1, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->k:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->u:Ljava/util/Map;

    if-nez v1, :cond_0

    .line 3
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->i:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V

    .line 4
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public m()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->n:I

    return v0
.end method

.method public n()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->k:Z

    return v0
.end method

.method public o()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->wv:Z

    return v0
.end method

.method public p()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->b:Lcom/ss/android/socialbase/downloader/network/n;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/network/n;->p()V

    :cond_0
    return-void
.end method

.method public qv()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/p;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->p:Ljava/util/List;

    return-object v0
.end method

.method public u()Z
    .locals 5

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->qv:J

    sub-long/2addr v0, v2

    sget-wide v2, Lcom/ss/android/socialbase/downloader/network/vv/m;->m:J

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public vv(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->u:Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 28
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    .line 29
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->b:Lcom/ss/android/socialbase/downloader/network/n;

    if-eqz v0, :cond_1

    .line 30
    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/network/n;->vv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public vv()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->u:Ljava/util/Map;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 2
    :try_start_0
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->k:Z

    .line 3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->vv:Ljava/lang/String;

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->p:Ljava/util/List;

    invoke-static {v0, v2}, Lcom/ss/android/socialbase/downloader/downloader/p;->vv(Ljava/lang/String;Ljava/util/List;)Lcom/ss/android/socialbase/downloader/network/n;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->b:Lcom/ss/android/socialbase/downloader/network/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->i:Ljava/lang/Object;

    monitor-enter v0

    .line 5
    :try_start_1
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->b:Lcom/ss/android/socialbase/downloader/network/n;

    if-eqz v2, :cond_1

    .line 6
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->u:Ljava/util/Map;

    .line 7
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->b:Lcom/ss/android/socialbase/downloader/network/n;

    invoke-direct {p0, v3, v2}, Lcom/ss/android/socialbase/downloader/network/vv/p;->vv(Lcom/ss/android/socialbase/downloader/network/n;Ljava/util/Map;)V

    .line 8
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->b:Lcom/ss/android/socialbase/downloader/network/n;

    invoke-interface {v2}, Lcom/ss/android/socialbase/downloader/network/n;->m()I

    move-result v2

    iput v2, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->n:I

    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->qv:J

    .line 10
    iget v2, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->n:I

    invoke-virtual {p0, v2}, Lcom/ss/android/socialbase/downloader/network/vv/p;->vv(I)Z

    move-result v2

    iput-boolean v2, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->wv:Z

    .line 11
    :cond_1
    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->k:Z

    .line 12
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->i:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 13
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    :catchall_1
    move-exception v0

    .line 14
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->i:Ljava/lang/Object;

    monitor-enter v2

    .line 15
    :try_start_2
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->b:Lcom/ss/android/socialbase/downloader/network/n;

    if-eqz v3, :cond_2

    .line 16
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    iput-object v3, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->u:Ljava/util/Map;

    .line 17
    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->b:Lcom/ss/android/socialbase/downloader/network/n;

    invoke-direct {p0, v4, v3}, Lcom/ss/android/socialbase/downloader/network/vv/p;->vv(Lcom/ss/android/socialbase/downloader/network/n;Ljava/util/Map;)V

    .line 18
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->b:Lcom/ss/android/socialbase/downloader/network/n;

    invoke-interface {v3}, Lcom/ss/android/socialbase/downloader/network/n;->m()I

    move-result v3

    iput v3, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->n:I

    .line 19
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iput-wide v3, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->qv:J

    .line 20
    iget v3, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->n:I

    invoke-virtual {p0, v3}, Lcom/ss/android/socialbase/downloader/network/vv/p;->vv(I)Z

    move-result v3

    iput-boolean v3, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->wv:Z

    .line 21
    :cond_2
    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->k:Z

    .line 22
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->i:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 23
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    throw v0

    :catchall_2
    move-exception v0

    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw v0
.end method

.method public vv(I)Z
    .locals 1

    const/16 v0, 0xc8

    if-lt p1, v0, :cond_0

    const/16 v0, 0x12c

    if-ge p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public wv()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/network/vv/p;->u:Ljava/util/Map;

    return-object v0
.end method
