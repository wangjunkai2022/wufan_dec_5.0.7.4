.class Lcom/ss/android/socialbase/downloader/u/m;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/socialbase/downloader/u/i;
.implements Lcom/ss/android/socialbase/downloader/u/o;
.implements Lcom/ss/android/socialbase/downloader/u/p;


# instance fields
.field private b:I

.field private final i:Ljava/lang/Object;

.field private volatile k:Z

.field private final m:I

.field private n:Lcom/ss/android/socialbase/downloader/u/vv;

.field private o:Lcom/ss/android/socialbase/downloader/u/vv;

.field private final p:Ljava/lang/Object;

.field private qv:Lcom/ss/android/socialbase/downloader/u/vv;

.field private u:Lcom/ss/android/socialbase/downloader/u/vv;

.field private final vv:I

.field private wv:Lcom/ss/android/socialbase/downloader/u/vv;


# direct methods
.method constructor <init>(II)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/u/m;->p:Ljava/lang/Object;

    .line 3
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/u/m;->i:Ljava/lang/Object;

    const/16 v0, 0x40

    if-ge p1, v0, :cond_0

    const/16 p1, 0x40

    :cond_0
    const/16 v0, 0x2000

    if-ge p2, v0, :cond_1

    const/16 p2, 0x2000

    .line 4
    :cond_1
    iput p1, p0, Lcom/ss/android/socialbase/downloader/u/m;->vv:I

    .line 5
    iput p2, p0, Lcom/ss/android/socialbase/downloader/u/m;->m:I

    return-void
.end method


# virtual methods
.method public m()Lcom/ss/android/socialbase/downloader/u/vv;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/u/j;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/u/m;->p:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-boolean v1, p0, Lcom/ss/android/socialbase/downloader/u/m;->k:Z

    if-nez v1, :cond_4

    .line 3
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/u/m;->o:Lcom/ss/android/socialbase/downloader/u/vv;

    if-nez v1, :cond_2

    .line 4
    iget v1, p0, Lcom/ss/android/socialbase/downloader/u/m;->b:I

    iget v2, p0, Lcom/ss/android/socialbase/downloader/u/m;->vv:I

    if-ge v1, v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    .line 5
    iput v1, p0, Lcom/ss/android/socialbase/downloader/u/m;->b:I

    .line 6
    new-instance v1, Lcom/ss/android/socialbase/downloader/u/vv;

    iget v2, p0, Lcom/ss/android/socialbase/downloader/u/m;->m:I

    invoke-direct {v1, v2}, Lcom/ss/android/socialbase/downloader/u/vv;-><init>(I)V

    .line 7
    monitor-exit v0

    return-object v1

    .line 8
    :cond_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/u/m;->p:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V

    .line 9
    iget-boolean v1, p0, Lcom/ss/android/socialbase/downloader/u/m;->k:Z

    if-nez v1, :cond_1

    .line 10
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/u/m;->o:Lcom/ss/android/socialbase/downloader/u/vv;

    if-eqz v1, :cond_0

    goto :goto_0

    .line 11
    :cond_1
    new-instance v1, Lcom/ss/android/socialbase/downloader/u/j;

    const-string v2, "obtain"

    invoke-direct {v1, v2}, Lcom/ss/android/socialbase/downloader/u/j;-><init>(Ljava/lang/String;)V

    throw v1

    .line 12
    :cond_2
    :goto_0
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/u/vv;->i:Lcom/ss/android/socialbase/downloader/u/vv;

    iput-object v2, p0, Lcom/ss/android/socialbase/downloader/u/m;->o:Lcom/ss/android/socialbase/downloader/u/vv;

    .line 13
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/u/m;->u:Lcom/ss/android/socialbase/downloader/u/vv;

    const/4 v3, 0x0

    if-ne v1, v2, :cond_3

    .line 14
    iput-object v3, p0, Lcom/ss/android/socialbase/downloader/u/m;->u:Lcom/ss/android/socialbase/downloader/u/vv;

    .line 15
    :cond_3
    iput-object v3, v1, Lcom/ss/android/socialbase/downloader/u/vv;->i:Lcom/ss/android/socialbase/downloader/u/vv;

    .line 16
    monitor-exit v0

    return-object v1

    .line 17
    :cond_4
    new-instance v1, Lcom/ss/android/socialbase/downloader/u/j;

    const-string v2, "obtain"

    invoke-direct {v1, v2}, Lcom/ss/android/socialbase/downloader/u/j;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 18
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    throw v1

    :goto_2
    goto :goto_1
.end method

.method public m(Lcom/ss/android/socialbase/downloader/u/vv;)V
    .locals 2
    .param p1    # Lcom/ss/android/socialbase/downloader/u/vv;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 19
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/u/m;->i:Ljava/lang/Object;

    monitor-enter v0

    .line 20
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/u/m;->qv:Lcom/ss/android/socialbase/downloader/u/vv;

    if-nez v1, :cond_0

    .line 21
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/u/m;->qv:Lcom/ss/android/socialbase/downloader/u/vv;

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/u/m;->n:Lcom/ss/android/socialbase/downloader/u/vv;

    .line 22
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/u/m;->i:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->notify()V

    goto :goto_0

    .line 23
    :cond_0
    iput-object p1, v1, Lcom/ss/android/socialbase/downloader/u/vv;->i:Lcom/ss/android/socialbase/downloader/u/vv;

    .line 24
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/u/m;->qv:Lcom/ss/android/socialbase/downloader/u/vv;

    .line 25
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public p()V
    .locals 2

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/u/m;->k:Z

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/u/m;->p:Ljava/lang/Object;

    monitor-enter v0

    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/u/m;->p:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 4
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/u/m;->i:Ljava/lang/Object;

    monitor-enter v1

    .line 6
    :try_start_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/u/m;->i:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 7
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :catchall_1
    move-exception v1

    .line 8
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1
.end method

.method public vv()Lcom/ss/android/socialbase/downloader/u/vv;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/u/j;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/u/m;->wv:Lcom/ss/android/socialbase/downloader/u/vv;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    iget-object v2, v0, Lcom/ss/android/socialbase/downloader/u/vv;->i:Lcom/ss/android/socialbase/downloader/u/vv;

    iput-object v2, p0, Lcom/ss/android/socialbase/downloader/u/m;->wv:Lcom/ss/android/socialbase/downloader/u/vv;

    .line 3
    iput-object v1, v0, Lcom/ss/android/socialbase/downloader/u/vv;->i:Lcom/ss/android/socialbase/downloader/u/vv;

    return-object v0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/u/m;->i:Ljava/lang/Object;

    monitor-enter v0

    .line 5
    :try_start_0
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/u/m;->n:Lcom/ss/android/socialbase/downloader/u/vv;

    :goto_0
    if-nez v2, :cond_2

    .line 6
    iget-boolean v2, p0, Lcom/ss/android/socialbase/downloader/u/m;->k:Z

    if-nez v2, :cond_1

    .line 7
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/u/m;->i:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->wait()V

    .line 8
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/u/m;->n:Lcom/ss/android/socialbase/downloader/u/vv;

    goto :goto_0

    .line 9
    :cond_1
    new-instance v1, Lcom/ss/android/socialbase/downloader/u/j;

    const-string v2, "read"

    invoke-direct {v1, v2}, Lcom/ss/android/socialbase/downloader/u/j;-><init>(Ljava/lang/String;)V

    throw v1

    .line 10
    :cond_2
    iget-object v3, v2, Lcom/ss/android/socialbase/downloader/u/vv;->i:Lcom/ss/android/socialbase/downloader/u/vv;

    iput-object v3, p0, Lcom/ss/android/socialbase/downloader/u/m;->wv:Lcom/ss/android/socialbase/downloader/u/vv;

    .line 11
    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/u/m;->qv:Lcom/ss/android/socialbase/downloader/u/vv;

    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/u/m;->n:Lcom/ss/android/socialbase/downloader/u/vv;

    .line 12
    iput-object v1, v2, Lcom/ss/android/socialbase/downloader/u/vv;->i:Lcom/ss/android/socialbase/downloader/u/vv;

    .line 13
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v1

    .line 14
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    throw v1

    :goto_2
    goto :goto_1
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/u/vv;)V
    .locals 2
    .param p1    # Lcom/ss/android/socialbase/downloader/u/vv;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 15
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/u/m;->p:Ljava/lang/Object;

    monitor-enter v0

    .line 16
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/u/m;->u:Lcom/ss/android/socialbase/downloader/u/vv;

    if-nez v1, :cond_0

    .line 17
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/u/m;->u:Lcom/ss/android/socialbase/downloader/u/vv;

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/u/m;->o:Lcom/ss/android/socialbase/downloader/u/vv;

    goto :goto_0

    .line 18
    :cond_0
    iput-object p1, v1, Lcom/ss/android/socialbase/downloader/u/vv;->i:Lcom/ss/android/socialbase/downloader/u/vv;

    .line 19
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/u/m;->u:Lcom/ss/android/socialbase/downloader/u/vv;

    .line 20
    :goto_0
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/u/m;->p:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->notify()V

    .line 21
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
