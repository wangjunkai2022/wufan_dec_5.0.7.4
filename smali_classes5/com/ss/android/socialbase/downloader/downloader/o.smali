.class public Lcom/ss/android/socialbase/downloader/downloader/o;
.super Ljava/lang/Object;


# static fields
.field private static m:Ljava/lang/String; = "ResponseHandler"


# instance fields
.field private volatile a:J

.field private b:Lcom/ss/android/socialbase/downloader/exception/BaseException;

.field private volatile c:J

.field private volatile d:J

.field private ff:J

.field private volatile g:J

.field private final i:Ljava/lang/String;

.field private j:J

.field private volatile jh:Z

.field private k:Lcom/ss/android/socialbase/downloader/model/o;

.field private final l:J

.field private final la:Z

.field private n:Lcom/ss/android/socialbase/downloader/downloader/k;

.field private final ns:Z

.field private final o:Lcom/ss/android/socialbase/downloader/model/m;

.field private final p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

.field private pd:J

.field private q:J

.field private qv:Lcom/ss/android/socialbase/downloader/impls/b;

.field private volatile r:Z

.field private final t:Lcom/ss/android/socialbase/downloader/qv/u;

.field private td:J

.field private final u:Lcom/ss/android/socialbase/downloader/network/wv;

.field private final v:Z

.field private vu:Z

.field vv:Z

.field private w:J

.field private wv:Lcom/ss/android/socialbase/downloader/downloader/x;

.field private final x:Lcom/ss/android/socialbase/downloader/n/vv;

.field private final y:Lcom/ss/android/socialbase/downloader/vv/vv;

.field private final ya:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/wv;Lcom/ss/android/socialbase/downloader/model/m;Lcom/ss/android/socialbase/downloader/qv/u;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->vv:Z

    const-wide/16 v1, 0x0

    .line 3
    iput-wide v1, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->a:J

    .line 4
    iput-wide v1, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->c:J

    .line 5
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 6
    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->i:Ljava/lang/String;

    .line 7
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->ns()Lcom/ss/android/socialbase/downloader/downloader/k;

    move-result-object p2

    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->n:Lcom/ss/android/socialbase/downloader/downloader/k;

    .line 8
    instance-of v3, p2, Lcom/ss/android/socialbase/downloader/impls/i;

    if-eqz v3, :cond_0

    .line 9
    check-cast p2, Lcom/ss/android/socialbase/downloader/impls/i;

    .line 10
    invoke-virtual {p2}, Lcom/ss/android/socialbase/downloader/impls/i;->vv()Lcom/ss/android/socialbase/downloader/impls/b;

    move-result-object v3

    iput-object v3, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->qv:Lcom/ss/android/socialbase/downloader/impls/b;

    .line 11
    invoke-virtual {p2}, Lcom/ss/android/socialbase/downloader/impls/i;->u()Lcom/ss/android/socialbase/downloader/downloader/x;

    move-result-object p2

    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->wv:Lcom/ss/android/socialbase/downloader/downloader/x;

    .line 12
    :cond_0
    iput-object p3, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->u:Lcom/ss/android/socialbase/downloader/network/wv;

    .line 13
    iput-object p4, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->o:Lcom/ss/android/socialbase/downloader/model/m;

    .line 14
    iput-object p5, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->t:Lcom/ss/android/socialbase/downloader/qv/u;

    .line 15
    invoke-virtual {p4}, Lcom/ss/android/socialbase/downloader/model/m;->t()J

    move-result-wide p2

    iput-wide p2, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->q:J

    .line 16
    iput-wide p2, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->j:J

    .line 17
    invoke-virtual {p4}, Lcom/ss/android/socialbase/downloader/model/m;->i()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 18
    invoke-virtual {p4}, Lcom/ss/android/socialbase/downloader/model/m;->d()J

    move-result-wide p2

    iput-wide p2, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->g:J

    goto :goto_0

    .line 19
    :cond_1
    invoke-virtual {p4, v0}, Lcom/ss/android/socialbase/downloader/model/m;->p(Z)J

    move-result-wide p2

    iput-wide p2, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->g:J

    .line 20
    :goto_0
    invoke-virtual {p4}, Lcom/ss/android/socialbase/downloader/model/m;->j()J

    move-result-wide p2

    iput-wide p2, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->d:J

    .line 21
    invoke-static {}, Lcom/ss/android/socialbase/downloader/vv/vv;->vv()Lcom/ss/android/socialbase/downloader/vv/vv;

    move-result-object p2

    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->y:Lcom/ss/android/socialbase/downloader/vv/vv;

    .line 22
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result p1

    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(I)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object p1

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->x:Lcom/ss/android/socialbase/downloader/n/vv;

    const-string p2, "sync_strategy"

    .line 23
    invoke-virtual {p1, p2, v0}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result p2

    const/4 p3, 0x1

    if-ne p2, p3, :cond_2

    const/4 p2, 0x1

    goto :goto_1

    :cond_2
    const/4 p2, 0x0

    :goto_1
    iput-boolean p2, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->v:Z

    if-eqz p2, :cond_3

    const/16 p2, 0x1388

    const-string p4, "sync_interval_ms_fg"

    .line 24
    invoke-virtual {p1, p4, p2}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result p2

    int-to-long p4, p2

    const/16 p2, 0x3e8

    const-string v1, "sync_interval_ms_bg"

    .line 25
    invoke-virtual {p1, v1, p2}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result p2

    int-to-long v1, p2

    const-wide/16 v3, 0x1f4

    .line 26
    invoke-static {p4, p5, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p4

    iput-wide p4, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->ya:J

    .line 27
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p4

    iput-wide p4, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->l:J

    goto :goto_2

    .line 28
    :cond_3
    iput-wide v1, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->ya:J

    .line 29
    iput-wide v1, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->l:J

    :goto_2
    const-string p2, "monitor_rw"

    .line 30
    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/downloader/n/vv;->m(Ljava/lang/String;)I

    move-result p1

    if-ne p1, p3, :cond_4

    const/4 v0, 0x1

    :cond_4
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->ns:Z

    const/high16 p1, 0x10000

    .line 31
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/wv/vv;->vv(I)Z

    move-result p1

    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->la:Z

    return-void
.end method

.method private m(JJ)Z
    .locals 3

    const-wide/32 v0, 0x10000

    cmp-long v2, p1, v0

    if-lez v2, :cond_0

    const-wide/16 p1, 0x1f4

    cmp-long v0, p3, p1

    if-lez v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private n()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->u:Lcom/ss/android/socialbase/downloader/network/wv;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->jh()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 3
    new-instance v1, Lcom/ss/android/socialbase/downloader/downloader/o$1;

    invoke-direct {v1, p0}, Lcom/ss/android/socialbase/downloader/downloader/o$1;-><init>(Lcom/ss/android/socialbase/downloader/downloader/o;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method private qv()V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->ns:Z

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 2
    :try_start_0
    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->k:Lcom/ss/android/socialbase/downloader/model/o;

    invoke-virtual {v4}, Lcom/ss/android/socialbase/downloader/model/o;->vv()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v4, 0x1

    goto :goto_1

    :catch_0
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_5

    .line 3
    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v4, v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->updateRealDownloadTime(Z)V

    .line 4
    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getChunkCount()I

    move-result v4

    if-le v4, v3, :cond_1

    const/4 v2, 0x1

    .line 5
    :cond_1
    invoke-static {}, Lcom/ss/android/socialbase/downloader/wv/u;->m()Z

    move-result v3

    invoke-static {v3}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v3

    if-eqz v2, :cond_3

    .line 6
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->wv:Lcom/ss/android/socialbase/downloader/downloader/x;

    invoke-direct {p0, v2}, Lcom/ss/android/socialbase/downloader/downloader/o;->vv(Lcom/ss/android/socialbase/downloader/downloader/k;)V

    if-eqz v3, :cond_2

    .line 7
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-interface {v3, v2}, Lcom/ss/android/socialbase/downloader/downloader/r;->p(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    goto :goto_2

    .line 8
    :cond_2
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->wv:Lcom/ss/android/socialbase/downloader/downloader/x;

    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v3

    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v4

    invoke-interface {v2, v3, v4, v5}, Lcom/ss/android/socialbase/downloader/downloader/k;->vv(IJ)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    goto :goto_2

    :cond_3
    if-eqz v3, :cond_4

    .line 9
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-interface {v3, v2}, Lcom/ss/android/socialbase/downloader/downloader/r;->p(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    goto :goto_2

    .line 10
    :cond_4
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->wv:Lcom/ss/android/socialbase/downloader/downloader/x;

    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->o:Lcom/ss/android/socialbase/downloader/model/m;

    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/m;->b()I

    move-result v3

    iget-wide v4, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->q:J

    invoke-interface {v2, v3, v4, v5}, Lcom/ss/android/socialbase/downloader/downloader/k;->vv(IJ)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 11
    :goto_2
    iget-wide v2, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->q:J

    iput-wide v2, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->a:J

    .line 12
    :cond_5
    iget-boolean v2, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->ns:Z

    if-eqz v2, :cond_6

    .line 13
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    sub-long/2addr v2, v0

    .line 14
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->pd:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->pd:J

    :cond_6
    return-void
.end method

.method private u()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->jh:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->r:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic vv(Lcom/ss/android/socialbase/downloader/downloader/o;)Lcom/ss/android/socialbase/downloader/network/wv;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->u:Lcom/ss/android/socialbase/downloader/network/wv;

    return-object p0
.end method

.method private vv(Ljava/io/InputStream;)Lcom/ss/android/socialbase/downloader/o/m;
    .locals 8

    .line 9
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->f()I

    move-result v0

    .line 10
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->x:Lcom/ss/android/socialbase/downloader/n/vv;

    const-string v2, "rw_concurrent"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 11
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getChunkCount()I

    move-result v1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 12
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v4

    const-wide/32 v6, 0x1400000

    cmp-long v1, v4, v6

    if-lez v1, :cond_0

    .line 13
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->x:Lcom/ss/android/socialbase/downloader/n/vv;

    const/4 v4, 0x4

    const-string v5, "rw_concurrent_max_buffer_count"

    invoke-virtual {v1, v5, v4}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result v1

    .line 14
    :try_start_0
    new-instance v4, Lcom/ss/android/socialbase/downloader/o/vv;

    invoke-direct {v4, p1, v0, v1}, Lcom/ss/android/socialbase/downloader/o/vv;-><init>(Ljava/io/InputStream;II)V

    .line 15
    iput-boolean v2, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->vu:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v4

    :catchall_0
    move-exception v1

    .line 16
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 17
    :cond_0
    new-instance v1, Lcom/ss/android/socialbase/downloader/o/p;

    invoke-direct {v1, p1, v0}, Lcom/ss/android/socialbase/downloader/o/p;-><init>(Ljava/io/InputStream;I)V

    .line 18
    iput-boolean v3, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->vu:Z

    return-object v1
.end method

.method private vv(Lcom/ss/android/socialbase/downloader/downloader/k;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    if-nez v7, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 27
    instance-of v8, v7, Lcom/ss/android/socialbase/downloader/m/o;

    if-eqz v8, :cond_1

    .line 28
    invoke-static {}, Lcom/ss/android/socialbase/downloader/wv/u;->m()Z

    move-result v1

    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/impls/jh;->vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    move-object v15, v1

    .line 29
    iget-object v1, v0, Lcom/ss/android/socialbase/downloader/downloader/o;->o:Lcom/ss/android/socialbase/downloader/model/m;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/m;->i()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 30
    iget-object v1, v0, Lcom/ss/android/socialbase/downloader/downloader/o;->o:Lcom/ss/android/socialbase/downloader/model/m;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/m;->o()Lcom/ss/android/socialbase/downloader/model/m;

    move-result-object v1

    goto :goto_0

    .line 31
    :cond_2
    iget-object v1, v0, Lcom/ss/android/socialbase/downloader/downloader/o;->o:Lcom/ss/android/socialbase/downloader/model/m;

    :goto_0
    move-object v5, v1

    if-eqz v5, :cond_8

    .line 32
    iget-wide v1, v0, Lcom/ss/android/socialbase/downloader/downloader/o;->q:J

    invoke-virtual {v5, v1, v2}, Lcom/ss/android/socialbase/downloader/model/m;->m(J)V

    if-eqz v8, :cond_3

    if-eqz v15, :cond_3

    .line 33
    invoke-virtual {v5}, Lcom/ss/android/socialbase/downloader/model/m;->b()I

    move-result v10

    invoke-virtual {v5}, Lcom/ss/android/socialbase/downloader/model/m;->la()I

    move-result v11

    invoke-virtual {v5}, Lcom/ss/android/socialbase/downloader/model/m;->m()I

    move-result v12

    iget-wide v13, v0, Lcom/ss/android/socialbase/downloader/downloader/o;->q:J

    move-object v9, v15

    invoke-interface/range {v9 .. v14}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv(IIIJ)V

    move-object v11, v5

    goto :goto_1

    .line 34
    :cond_3
    invoke-virtual {v5}, Lcom/ss/android/socialbase/downloader/model/m;->b()I

    move-result v2

    invoke-virtual {v5}, Lcom/ss/android/socialbase/downloader/model/m;->la()I

    move-result v3

    invoke-virtual {v5}, Lcom/ss/android/socialbase/downloader/model/m;->m()I

    move-result v4

    iget-wide v9, v0, Lcom/ss/android/socialbase/downloader/downloader/o;->q:J

    move-object/from16 v1, p1

    move-object v11, v5

    move-wide v5, v9

    invoke-interface/range {v1 .. v6}, Lcom/ss/android/socialbase/downloader/downloader/k;->vv(IIIJ)V

    .line 35
    :goto_1
    invoke-virtual {v11}, Lcom/ss/android/socialbase/downloader/model/m;->qv()Z

    move-result v1

    if-eqz v1, :cond_a

    const/4 v1, 0x0

    .line 36
    invoke-virtual {v11}, Lcom/ss/android/socialbase/downloader/model/m;->wv()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 37
    invoke-virtual {v11}, Lcom/ss/android/socialbase/downloader/model/m;->k()J

    move-result-wide v2

    .line 38
    iget-wide v4, v0, Lcom/ss/android/socialbase/downloader/downloader/o;->q:J

    cmp-long v6, v2, v4

    if-lez v6, :cond_5

    if-eqz v8, :cond_4

    if-eqz v15, :cond_4

    .line 39
    invoke-virtual {v11}, Lcom/ss/android/socialbase/downloader/model/m;->b()I

    move-result v1

    invoke-virtual {v11}, Lcom/ss/android/socialbase/downloader/model/m;->m()I

    move-result v4

    invoke-interface {v15, v1, v4, v2, v3}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv(IIJ)V

    goto :goto_2

    .line 40
    :cond_4
    invoke-virtual {v11}, Lcom/ss/android/socialbase/downloader/model/m;->b()I

    move-result v1

    invoke-virtual {v11}, Lcom/ss/android/socialbase/downloader/model/m;->m()I

    move-result v4

    invoke-interface {v7, v1, v4, v2, v3}, Lcom/ss/android/socialbase/downloader/downloader/k;->vv(IIJ)V

    :goto_2
    const/4 v1, 0x1

    :cond_5
    if-nez v1, :cond_7

    if-eqz v8, :cond_6

    if-eqz v15, :cond_6

    .line 41
    invoke-virtual {v11}, Lcom/ss/android/socialbase/downloader/model/m;->b()I

    move-result v1

    invoke-virtual {v11}, Lcom/ss/android/socialbase/downloader/model/m;->m()I

    move-result v2

    iget-wide v3, v0, Lcom/ss/android/socialbase/downloader/downloader/o;->q:J

    invoke-interface {v15, v1, v2, v3, v4}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv(IIJ)V

    return-void

    .line 42
    :cond_6
    invoke-virtual {v11}, Lcom/ss/android/socialbase/downloader/model/m;->b()I

    move-result v1

    invoke-virtual {v11}, Lcom/ss/android/socialbase/downloader/model/m;->m()I

    move-result v2

    iget-wide v3, v0, Lcom/ss/android/socialbase/downloader/downloader/o;->q:J

    invoke-interface {v7, v1, v2, v3, v4}, Lcom/ss/android/socialbase/downloader/downloader/k;->vv(IIJ)V

    :cond_7
    return-void

    .line 43
    :cond_8
    iget-object v1, v0, Lcom/ss/android/socialbase/downloader/downloader/o;->o:Lcom/ss/android/socialbase/downloader/model/m;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/m;->i()Z

    move-result v1

    if-eqz v1, :cond_a

    if-eqz v8, :cond_9

    if-eqz v15, :cond_9

    .line 44
    iget-object v1, v0, Lcom/ss/android/socialbase/downloader/downloader/o;->o:Lcom/ss/android/socialbase/downloader/model/m;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/m;->b()I

    move-result v1

    iget-object v2, v0, Lcom/ss/android/socialbase/downloader/downloader/o;->o:Lcom/ss/android/socialbase/downloader/model/m;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/m;->la()I

    move-result v2

    iget-wide v3, v0, Lcom/ss/android/socialbase/downloader/downloader/o;->q:J

    invoke-interface {v15, v1, v2, v3, v4}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv(IIJ)V

    return-void

    .line 45
    :cond_9
    iget-object v1, v0, Lcom/ss/android/socialbase/downloader/downloader/o;->o:Lcom/ss/android/socialbase/downloader/model/m;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/m;->b()I

    move-result v1

    iget-object v2, v0, Lcom/ss/android/socialbase/downloader/downloader/o;->o:Lcom/ss/android/socialbase/downloader/model/m;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/m;->la()I

    move-result v2

    iget-wide v3, v0, Lcom/ss/android/socialbase/downloader/downloader/o;->q:J

    invoke-interface {v7, v1, v2, v3, v4}, Lcom/ss/android/socialbase/downloader/downloader/k;->vv(IIJ)V

    :cond_a
    return-void
.end method

.method private vv(Z)V
    .locals 8

    .line 19
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    .line 20
    iget-wide v2, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->c:J

    sub-long v2, v0, v2

    .line 21
    iget-boolean v4, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->v:Z

    if-eqz v4, :cond_1

    .line 22
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->y:Lcom/ss/android/socialbase/downloader/vv/vv;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/vv/vv;->m()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-wide v4, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->ya:J

    goto :goto_0

    :cond_0
    iget-wide v4, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->l:J

    :goto_0
    cmp-long p1, v2, v4

    if-lez p1, :cond_3

    goto :goto_1

    .line 23
    :cond_1
    iget-wide v4, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->q:J

    iget-wide v6, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->a:J

    sub-long/2addr v4, v6

    if-nez p1, :cond_2

    .line 24
    invoke-direct {p0, v4, v5, v2, v3}, Lcom/ss/android/socialbase/downloader/downloader/o;->m(JJ)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 25
    :cond_2
    :goto_1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/downloader/o;->qv()V

    .line 26
    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->c:J

    :cond_3
    return-void
.end method


# virtual methods
.method public i()V
    .locals 31
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;
        }
    .end annotation

    move-object/from16 v1, p0

    .line 1
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/downloader/o;->u()Z

    move-result v0

    if-nez v0, :cond_37

    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->o:Lcom/ss/android/socialbase/downloader/model/m;

    if-nez v0, :cond_0

    goto/16 :goto_17

    .line 2
    :cond_0
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->u:Lcom/ss/android/socialbase/downloader/network/wv;

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/wv/u;->vv(Lcom/ss/android/socialbase/downloader/network/n;)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-eqz v0, :cond_36

    .line 3
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->o:Lcom/ss/android/socialbase/downloader/model/m;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/m;->jh()J

    move-result-wide v6

    .line 4
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v8

    .line 5
    iget-boolean v15, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->ns:Z

    const/4 v14, 0x1

    const/4 v13, 0x0

    .line 6
    :try_start_0
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTempPath()Ljava/lang/String;

    move-result-object v11

    iget-object v12, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v12}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTempName()Ljava/lang/String;

    move-result-object v12

    iget-object v10, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->x:Lcom/ss/android/socialbase/downloader/n/vv;

    const-string v4, "flush_buffer_size_byte"

    const/4 v5, -0x1

    .line 7
    invoke-virtual {v10, v4, v5}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result v4

    .line 8
    invoke-static {v0, v11, v12, v4}, Lcom/ss/android/socialbase/downloader/wv/u;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/lang/String;Ljava/lang/String;I)Lcom/ss/android/socialbase/downloader/model/o;

    move-result-object v0

    iput-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->k:Lcom/ss/android/socialbase/downloader/model/o;
    :try_end_0
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_0 .. :try_end_0} :catch_c
    .catchall {:try_start_0 .. :try_end_0} :catchall_e

    .line 9
    :try_start_1
    iget-wide v10, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->q:J

    invoke-virtual {v0, v10, v11}, Lcom/ss/android/socialbase/downloader/model/o;->vv(J)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_9
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_1 .. :try_end_1} :catch_c
    .catchall {:try_start_1 .. :try_end_1} :catchall_e

    .line 10
    :try_start_2
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->u:Lcom/ss/android/socialbase/downloader/network/wv;

    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/network/wv;->vv()Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_1a

    .line 11
    iget-object v4, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->updateRealStartDownloadTime()V

    .line 12
    invoke-direct {v1, v0}, Lcom/ss/android/socialbase/downloader/downloader/o;->vv(Ljava/io/InputStream;)Lcom/ss/android/socialbase/downloader/o/m;

    move-result-object v10
    :try_end_2
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_2 .. :try_end_2} :catch_c
    .catchall {:try_start_2 .. :try_end_2} :catchall_e

    .line 13
    :try_start_3
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    iget-boolean v4, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->vu:Z

    invoke-virtual {v0, v4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setIsRwConcurrent(Z)V

    .line 14
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getOpenLimitSpeed()Z

    move-result v0

    iput-boolean v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->vv:Z

    .line 15
    sget-wide v11, Lcom/ss/android/socialbase/downloader/constants/o;->i:J

    .line 16
    sget-wide v16, Lcom/ss/android/socialbase/downloader/constants/o;->o:J

    const-wide/16 v18, 0x3e8

    .line 17
    div-long v18, v18, v16

    div-long v11, v11, v18

    .line 18
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v18

    const-wide/16 v20, 0x0

    const-wide/16 v22, 0x0

    .line 19
    :goto_0
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/downloader/o;->u()Z

    move-result v0
    :try_end_3
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_3 .. :try_end_3} :catch_8
    .catchall {:try_start_3 .. :try_end_3} :catchall_c

    if-eqz v0, :cond_6

    .line 20
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->u:Lcom/ss/android/socialbase/downloader/network/wv;

    if-eqz v0, :cond_1

    .line 21
    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/network/wv;->i()V

    :cond_1
    if-eqz v10, :cond_2

    .line 22
    invoke-interface {v10}, Lcom/ss/android/socialbase/downloader/o/m;->m()V

    .line 23
    :cond_2
    :try_start_4
    iget-boolean v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->la:Z

    if-eqz v0, :cond_4

    .line 24
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->t:Lcom/ss/android/socialbase/downloader/qv/u;

    monitor-enter v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 25
    :try_start_5
    iget-boolean v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->r:Z

    if-nez v0, :cond_3

    .line 26
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->qv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-direct {v1, v0}, Lcom/ss/android/socialbase/downloader/downloader/o;->vv(Lcom/ss/android/socialbase/downloader/downloader/k;)V

    .line 27
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->k:Lcom/ss/android/socialbase/downloader/model/o;

    if-eqz v0, :cond_3

    .line 28
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/downloader/o;->qv()V

    .line 29
    :cond_3
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    throw v0

    .line 30
    :cond_4
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->qv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-direct {v1, v0}, Lcom/ss/android/socialbase/downloader/downloader/o;->vv(Lcom/ss/android/socialbase/downloader/downloader/k;)V

    .line 31
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->k:Lcom/ss/android/socialbase/downloader/model/o;

    if-eqz v0, :cond_5

    .line 32
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/downloader/o;->qv()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :cond_5
    :goto_1
    new-array v0, v14, [Ljava/io/Closeable;

    .line 33
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->k:Lcom/ss/android/socialbase/downloader/model/o;

    aput-object v2, v0, v13

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/wv/u;->vv([Ljava/io/Closeable;)V

    .line 34
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    sub-long/2addr v2, v8

    iput-wide v2, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->w:J

    .line 35
    iget-object v10, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->x:Lcom/ss/android/socialbase/downloader/n/vv;

    iget-object v11, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    iget-object v12, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->i:Ljava/lang/String;

    iget-object v13, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->u:Lcom/ss/android/socialbase/downloader/network/wv;

    iget-boolean v14, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->jh:Z

    iget-boolean v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->r:Z

    move v4, v15

    move v15, v0

    :goto_2
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->b:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    move-object/from16 v16, v0

    iget-wide v2, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->q:J

    iget-wide v5, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->j:J

    sub-long v17, v2, v5

    iget-wide v2, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->w:J

    move-wide/from16 v19, v2

    iget-wide v2, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->ff:J

    move-wide/from16 v22, v2

    iget-wide v2, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->td:J

    move-wide/from16 v24, v2

    iget-wide v2, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->pd:J

    move-wide/from16 v26, v2

    const/16 v28, 0x0

    move/from16 v21, v4

    invoke-static/range {v10 .. v28}, Lcom/ss/android/socialbase/downloader/i/vv;->vv(Lcom/ss/android/socialbase/downloader/n/vv;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/wv;ZZLcom/ss/android/socialbase/downloader/exception/BaseException;JJZJJJLorg/json/JSONObject;)V

    return-void

    :catchall_1
    move-exception v0

    new-array v2, v14, [Ljava/io/Closeable;

    .line 36
    iget-object v3, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->k:Lcom/ss/android/socialbase/downloader/model/o;

    aput-object v3, v2, v13

    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/wv/u;->vv([Ljava/io/Closeable;)V

    throw v0

    :cond_6
    move v4, v15

    if-eqz v4, :cond_7

    .line 37
    :try_start_7
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v20
    :try_end_7
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v0

    move-wide/from16 v29, v6

    move-wide/from16 v25, v8

    goto/16 :goto_d

    :catch_0
    move-exception v0

    move-wide/from16 v25, v8

    goto/16 :goto_14

    .line 38
    :cond_7
    :goto_3
    :try_start_8
    invoke-interface {v10}, Lcom/ss/android/socialbase/downloader/o/m;->vv()Lcom/ss/android/socialbase/downloader/u/vv;

    move-result-object v0
    :try_end_8
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_8 .. :try_end_8} :catch_7
    .catchall {:try_start_8 .. :try_end_8} :catchall_b

    if-eqz v4, :cond_8

    .line 39
    :try_start_9
    iget-wide v14, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->ff:J

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v25

    sub-long v25, v25, v20

    add-long v14, v14, v25

    iput-wide v14, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->ff:J
    :try_end_9
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 40
    :cond_8
    :try_start_a
    iget v14, v0, Lcom/ss/android/socialbase/downloader/u/vv;->p:I

    if-eq v14, v5, :cond_14

    .line 41
    iget-object v15, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v15}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isIgnoreDataVerify()Z

    move-result v15
    :try_end_a
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_a .. :try_end_a} :catch_7
    .catchall {:try_start_a .. :try_end_a} :catchall_b

    if-nez v15, :cond_9

    move-wide/from16 v29, v6

    :try_start_b
    iget-wide v5, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->g:J
    :try_end_b
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_b .. :try_end_b} :catch_2
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    move-wide/from16 v25, v8

    :try_start_c
    iget-wide v7, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->q:J
    :try_end_c
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_c .. :try_end_c} :catch_1
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    move-object v15, v10

    :try_start_d
    iget-wide v9, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->j:J

    sub-long/2addr v7, v9

    cmp-long v9, v5, v7

    if-lez v9, :cond_a

    iget-wide v5, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->g:J

    iget-wide v7, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->q:J

    iget-wide v9, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->j:J

    sub-long/2addr v7, v9

    int-to-long v9, v14

    add-long/2addr v7, v9

    cmp-long v9, v5, v7

    if-gez v9, :cond_a

    .line 42
    iget-wide v5, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->g:J

    iget-wide v7, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->q:J

    iget-wide v9, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->j:J

    sub-long/2addr v7, v9

    sub-long/2addr v5, v7

    long-to-int v14, v5

    goto :goto_6

    :catchall_3
    move-exception v0

    goto :goto_4

    :catch_1
    move-exception v0

    goto :goto_5

    :catchall_4
    move-exception v0

    move-wide/from16 v25, v8

    :goto_4
    move-object v15, v10

    goto/16 :goto_d

    :catch_2
    move-exception v0

    move-wide/from16 v25, v8

    :goto_5
    move-object v15, v10

    goto/16 :goto_14

    :cond_9
    move-wide/from16 v29, v6

    move-wide/from16 v25, v8

    move-object v15, v10

    :cond_a
    :goto_6
    if-eqz v4, :cond_b

    .line 43
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v5
    :try_end_d
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_d .. :try_end_d} :catch_3
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    move-wide/from16 v20, v5

    goto :goto_7

    :catchall_5
    move-exception v0

    move-object v10, v15

    goto/16 :goto_d

    :catch_3
    move-exception v0

    move-object v10, v15

    goto/16 :goto_14

    .line 44
    :cond_b
    :goto_7
    :try_start_e
    iget-object v5, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->k:Lcom/ss/android/socialbase/downloader/model/o;

    iget-object v6, v0, Lcom/ss/android/socialbase/downloader/u/vv;->vv:[B

    invoke-virtual {v5, v6, v13, v14}, Lcom/ss/android/socialbase/downloader/model/o;->vv([BII)V
    :try_end_e
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_e .. :try_end_e} :catch_6
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    if-eqz v4, :cond_c

    .line 45
    :try_start_f
    iget-wide v5, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->td:J

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v7

    sub-long v7, v7, v20

    add-long/2addr v5, v7

    iput-wide v5, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->td:J
    :try_end_f
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_f .. :try_end_f} :catch_3
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    :cond_c
    move-object v5, v15

    .line 46
    :try_start_10
    invoke-interface {v5, v0}, Lcom/ss/android/socialbase/downloader/o/m;->vv(Lcom/ss/android/socialbase/downloader/u/vv;)V

    .line 47
    iget-wide v6, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->q:J

    int-to-long v8, v14

    add-long/2addr v6, v8

    iput-wide v6, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->q:J

    add-long v22, v22, v8

    .line 48
    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->t:Lcom/ss/android/socialbase/downloader/qv/u;

    monitor-enter v6
    :try_end_10
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_10 .. :try_end_10} :catch_5
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    .line 49
    :try_start_11
    iget-boolean v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->la:Z

    if-eqz v0, :cond_d

    .line 50
    iget-boolean v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->r:Z

    if-nez v0, :cond_e

    .line 51
    :cond_d
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->t:Lcom/ss/android/socialbase/downloader/qv/u;

    invoke-interface {v0, v8, v9}, Lcom/ss/android/socialbase/downloader/qv/u;->m(J)Z

    move-result v0

    .line 52
    iget-object v7, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->qv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-direct {v1, v7}, Lcom/ss/android/socialbase/downloader/downloader/o;->vv(Lcom/ss/android/socialbase/downloader/downloader/k;)V

    .line 53
    invoke-direct {v1, v0}, Lcom/ss/android/socialbase/downloader/downloader/o;->vv(Z)V

    .line 54
    :cond_e
    monitor-exit v6
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_6

    .line 55
    :try_start_12
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isDownloadWithWifiValid()Z

    move-result v0

    if-eqz v0, :cond_13

    .line 56
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isPauseReserveWithWifiValid()Z

    move-result v0

    if-eqz v0, :cond_12

    .line 57
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isIgnoreDataVerify()Z

    move-result v0

    if-nez v0, :cond_f

    iget-wide v6, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->g:J

    const-wide/16 v8, 0x0

    cmp-long v0, v6, v8

    if-ltz v0, :cond_f

    iget-wide v6, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->g:J

    iget-wide v8, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->q:J

    iget-wide v14, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->j:J

    sub-long/2addr v8, v14

    cmp-long v0, v6, v8

    if-lez v0, :cond_15

    .line 58
    :cond_f
    iget-boolean v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->vv:Z

    if-eqz v0, :cond_11

    cmp-long v0, v22, v11

    if-lez v0, :cond_11

    .line 59
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6
    :try_end_12
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_12 .. :try_end_12} :catch_5
    .catchall {:try_start_12 .. :try_end_12} :catchall_7

    sub-long v6, v6, v18

    cmp-long v0, v6, v16

    if-gez v0, :cond_10

    sub-long v6, v16, v6

    .line 60
    :try_start_13
    invoke-static {v6, v7}, Ljava/lang/Thread;->sleep(J)V
    :try_end_13
    .catch Ljava/lang/InterruptedException; {:try_start_13 .. :try_end_13} :catch_4
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_13 .. :try_end_13} :catch_5
    .catchall {:try_start_13 .. :try_end_13} :catchall_7

    goto :goto_8

    :catch_4
    move-exception v0

    move-object v6, v0

    .line 61
    :try_start_14
    invoke-virtual {v6}, Ljava/lang/InterruptedException;->printStackTrace()V

    .line 62
    :cond_10
    :goto_8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    move-wide/from16 v18, v6

    const-wide/16 v22, 0x0

    :cond_11
    move v15, v4

    move-object v10, v5

    move-wide/from16 v8, v25

    move-wide/from16 v6, v29

    const/4 v5, -0x1

    const/4 v14, 0x1

    goto/16 :goto_0

    .line 63
    :cond_12
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/o;

    invoke-direct {v0}, Lcom/ss/android/socialbase/downloader/exception/o;-><init>()V

    throw v0

    .line 64
    :cond_13
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/p;

    invoke-direct {v0}, Lcom/ss/android/socialbase/downloader/exception/p;-><init>()V

    throw v0
    :try_end_14
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_14 .. :try_end_14} :catch_5
    .catchall {:try_start_14 .. :try_end_14} :catchall_7

    :catchall_6
    move-exception v0

    .line 65
    :try_start_15
    monitor-exit v6
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_6

    :try_start_16
    throw v0
    :try_end_16
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_16 .. :try_end_16} :catch_5
    .catchall {:try_start_16 .. :try_end_16} :catchall_7

    :catchall_7
    move-exception v0

    goto :goto_9

    :catch_5
    move-exception v0

    goto :goto_a

    :catchall_8
    move-exception v0

    move-object v5, v15

    :goto_9
    move-object v10, v5

    goto/16 :goto_d

    :catch_6
    move-exception v0

    move-object v5, v15

    :goto_a
    move-object v10, v5

    goto/16 :goto_14

    :cond_14
    move-wide/from16 v29, v6

    move-wide/from16 v25, v8

    move-object v5, v10

    .line 66
    :cond_15
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->u:Lcom/ss/android/socialbase/downloader/network/wv;

    if-eqz v0, :cond_16

    .line 67
    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/network/wv;->i()V

    .line 68
    :cond_16
    invoke-interface {v5}, Lcom/ss/android/socialbase/downloader/o/m;->m()V

    .line 69
    :try_start_17
    iget-boolean v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->la:Z

    if-eqz v0, :cond_18

    .line 70
    iget-object v5, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->t:Lcom/ss/android/socialbase/downloader/qv/u;

    monitor-enter v5
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_a

    .line 71
    :try_start_18
    iget-boolean v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->r:Z

    if-nez v0, :cond_17

    .line 72
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->qv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-direct {v1, v0}, Lcom/ss/android/socialbase/downloader/downloader/o;->vv(Lcom/ss/android/socialbase/downloader/downloader/k;)V

    .line 73
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->k:Lcom/ss/android/socialbase/downloader/model/o;

    if-eqz v0, :cond_17

    .line 74
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/downloader/o;->qv()V

    .line 75
    :cond_17
    monitor-exit v5

    goto :goto_b

    :catchall_9
    move-exception v0

    monitor-exit v5
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_9

    :try_start_19
    throw v0

    .line 76
    :cond_18
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->qv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-direct {v1, v0}, Lcom/ss/android/socialbase/downloader/downloader/o;->vv(Lcom/ss/android/socialbase/downloader/downloader/k;)V

    .line 77
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->k:Lcom/ss/android/socialbase/downloader/model/o;

    if-eqz v0, :cond_19

    .line 78
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/downloader/o;->qv()V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_a

    :cond_19
    :goto_b
    const/4 v5, 0x1

    new-array v0, v5, [Ljava/io/Closeable;

    .line 79
    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->k:Lcom/ss/android/socialbase/downloader/model/o;

    aput-object v6, v0, v13

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/wv/u;->vv([Ljava/io/Closeable;)V

    .line 80
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v6

    sub-long v6, v6, v25

    iput-wide v6, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->w:J

    .line 81
    iget-object v10, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->x:Lcom/ss/android/socialbase/downloader/n/vv;

    iget-object v11, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    iget-object v12, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->i:Ljava/lang/String;

    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->u:Lcom/ss/android/socialbase/downloader/network/wv;

    const/4 v6, 0x0

    move-object v13, v0

    iget-boolean v14, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->jh:Z

    const/4 v7, 0x1

    iget-boolean v15, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->r:Z

    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->b:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    move-object/from16 v16, v0

    iget-wide v8, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->q:J

    iget-wide v6, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->j:J

    sub-long v17, v8, v6

    goto/16 :goto_11

    :catchall_a
    move-exception v0

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/io/Closeable;

    .line 82
    iget-object v3, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->k:Lcom/ss/android/socialbase/downloader/model/o;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/wv/u;->vv([Ljava/io/Closeable;)V

    throw v0

    :catchall_b
    move-exception v0

    move-wide/from16 v29, v6

    move-wide/from16 v25, v8

    move-object v5, v10

    goto :goto_d

    :catch_7
    move-exception v0

    move-wide/from16 v25, v8

    move-object v5, v10

    goto/16 :goto_14

    :catchall_c
    move-exception v0

    move-wide/from16 v29, v6

    move-wide/from16 v25, v8

    move-object v5, v10

    move v4, v15

    goto :goto_d

    :catch_8
    move-exception v0

    move-wide/from16 v25, v8

    move-object v5, v10

    move v4, v15

    goto/16 :goto_14

    :cond_1a
    move-wide/from16 v29, v6

    move-wide/from16 v25, v8

    move v4, v15

    .line 83
    :try_start_1a
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const/16 v5, 0x412

    new-instance v6, Ljava/io/IOException;

    const-string v7, "inputStream is null"

    invoke-direct {v6, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v5, v6}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/Throwable;)V

    throw v0

    :catch_9
    move-exception v0

    move-wide/from16 v29, v6

    move-wide/from16 v25, v8

    move v4, v15

    .line 84
    new-instance v5, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const/16 v6, 0x41e

    invoke-direct {v5, v6, v0}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/Throwable;)V

    throw v5
    :try_end_1a
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_1a .. :try_end_1a} :catch_a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_d

    :catchall_d
    move-exception v0

    goto :goto_c

    :catch_a
    move-exception v0

    goto/16 :goto_13

    :catchall_e
    move-exception v0

    move-wide/from16 v29, v6

    move-wide/from16 v25, v8

    move v4, v15

    :goto_c
    const/4 v10, 0x0

    .line 85
    :goto_d
    :try_start_1b
    sget-object v5, Lcom/ss/android/socialbase/downloader/downloader/o;->m:Ljava/lang/String;

    const-string v6, "handleResponse: e = "

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/ss/android/socialbase/downloader/p/vv;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/downloader/o;->u()Z

    move-result v5
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_15

    if-eqz v5, :cond_20

    .line 87
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->u:Lcom/ss/android/socialbase/downloader/network/wv;

    if-eqz v0, :cond_1b

    .line 88
    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/network/wv;->i()V

    :cond_1b
    if-eqz v10, :cond_1c

    .line 89
    invoke-interface {v10}, Lcom/ss/android/socialbase/downloader/o/m;->m()V

    .line 90
    :cond_1c
    :try_start_1c
    iget-boolean v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->la:Z

    if-eqz v0, :cond_1e

    .line 91
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->t:Lcom/ss/android/socialbase/downloader/qv/u;

    monitor-enter v2
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_10

    .line 92
    :try_start_1d
    iget-boolean v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->r:Z

    if-nez v0, :cond_1d

    .line 93
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->qv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-direct {v1, v0}, Lcom/ss/android/socialbase/downloader/downloader/o;->vv(Lcom/ss/android/socialbase/downloader/downloader/k;)V

    .line 94
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->k:Lcom/ss/android/socialbase/downloader/model/o;

    if-eqz v0, :cond_1d

    .line 95
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/downloader/o;->qv()V

    .line 96
    :cond_1d
    monitor-exit v2

    goto :goto_e

    :catchall_f
    move-exception v0

    monitor-exit v2
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_f

    :try_start_1e
    throw v0

    .line 97
    :cond_1e
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->qv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-direct {v1, v0}, Lcom/ss/android/socialbase/downloader/downloader/o;->vv(Lcom/ss/android/socialbase/downloader/downloader/k;)V

    .line 98
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->k:Lcom/ss/android/socialbase/downloader/model/o;

    if-eqz v0, :cond_1f

    .line 99
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/downloader/o;->qv()V
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_10

    :cond_1f
    :goto_e
    const/4 v2, 0x1

    new-array v0, v2, [Ljava/io/Closeable;

    .line 100
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->k:Lcom/ss/android/socialbase/downloader/model/o;

    const/4 v3, 0x0

    aput-object v2, v0, v3

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/wv/u;->vv([Ljava/io/Closeable;)V

    .line 101
    :goto_f
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    sub-long v2, v2, v25

    iput-wide v2, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->w:J

    .line 102
    iget-object v10, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->x:Lcom/ss/android/socialbase/downloader/n/vv;

    iget-object v11, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    iget-object v12, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->i:Ljava/lang/String;

    iget-object v13, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->u:Lcom/ss/android/socialbase/downloader/network/wv;

    iget-boolean v14, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->jh:Z

    iget-boolean v15, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->r:Z

    goto/16 :goto_2

    :catchall_10
    move-exception v0

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/io/Closeable;

    .line 103
    iget-object v3, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->k:Lcom/ss/android/socialbase/downloader/model/o;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/wv/u;->vv([Ljava/io/Closeable;)V

    throw v0

    .line 104
    :cond_20
    :try_start_1f
    invoke-static {}, Lcom/ss/android/socialbase/downloader/p/vv;->vv()Z

    move-result v5

    if-eqz v5, :cond_21

    .line 105
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_15

    :cond_21
    :try_start_20
    const-string v5, "ResponseHandler"

    .line 106
    invoke-static {v0, v5}, Lcom/ss/android/socialbase/downloader/wv/u;->vv(Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_20
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_20 .. :try_end_20} :catch_b
    .catchall {:try_start_20 .. :try_end_20} :catchall_15

    .line 107
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->u:Lcom/ss/android/socialbase/downloader/network/wv;

    if-eqz v0, :cond_22

    .line 108
    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/network/wv;->i()V

    :cond_22
    if-eqz v10, :cond_23

    .line 109
    invoke-interface {v10}, Lcom/ss/android/socialbase/downloader/o/m;->m()V

    .line 110
    :cond_23
    :try_start_21
    iget-boolean v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->la:Z

    if-eqz v0, :cond_25

    .line 111
    iget-object v5, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->t:Lcom/ss/android/socialbase/downloader/qv/u;

    monitor-enter v5
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_12

    .line 112
    :try_start_22
    iget-boolean v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->r:Z

    if-nez v0, :cond_24

    .line 113
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->qv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-direct {v1, v0}, Lcom/ss/android/socialbase/downloader/downloader/o;->vv(Lcom/ss/android/socialbase/downloader/downloader/k;)V

    .line 114
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->k:Lcom/ss/android/socialbase/downloader/model/o;

    if-eqz v0, :cond_24

    .line 115
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/downloader/o;->qv()V

    .line 116
    :cond_24
    monitor-exit v5

    goto :goto_10

    :catchall_11
    move-exception v0

    monitor-exit v5
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_11

    :try_start_23
    throw v0

    .line 117
    :cond_25
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->qv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-direct {v1, v0}, Lcom/ss/android/socialbase/downloader/downloader/o;->vv(Lcom/ss/android/socialbase/downloader/downloader/k;)V

    .line 118
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->k:Lcom/ss/android/socialbase/downloader/model/o;

    if-eqz v0, :cond_26

    .line 119
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/downloader/o;->qv()V
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_12

    :cond_26
    :goto_10
    const/4 v5, 0x1

    new-array v0, v5, [Ljava/io/Closeable;

    .line 120
    iget-object v5, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->k:Lcom/ss/android/socialbase/downloader/model/o;

    const/4 v6, 0x0

    aput-object v5, v0, v6

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/wv/u;->vv([Ljava/io/Closeable;)V

    .line 121
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v5

    sub-long v5, v5, v25

    iput-wide v5, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->w:J

    .line 122
    iget-object v10, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->x:Lcom/ss/android/socialbase/downloader/n/vv;

    iget-object v11, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    iget-object v12, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->i:Ljava/lang/String;

    iget-object v13, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->u:Lcom/ss/android/socialbase/downloader/network/wv;

    iget-boolean v14, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->jh:Z

    iget-boolean v15, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->r:Z

    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->b:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    move-object/from16 v16, v0

    iget-wide v5, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->q:J

    iget-wide v7, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->j:J

    sub-long v17, v5, v7

    :goto_11
    iget-wide v5, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->w:J

    move-wide/from16 v19, v5

    iget-wide v5, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->ff:J

    move-wide/from16 v22, v5

    iget-wide v5, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->td:J

    move-wide/from16 v24, v5

    iget-wide v5, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->pd:J

    move-wide/from16 v26, v5

    const/16 v28, 0x0

    move/from16 v21, v4

    invoke-static/range {v10 .. v28}, Lcom/ss/android/socialbase/downloader/i/vv;->vv(Lcom/ss/android/socialbase/downloader/n/vv;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/wv;ZZLcom/ss/android/socialbase/downloader/exception/BaseException;JJZJJJLorg/json/JSONObject;)V

    .line 123
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isIgnoreDataVerify()Z

    move-result v0

    if-eqz v0, :cond_27

    return-void

    .line 124
    :cond_27
    iget-wide v4, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->q:J

    iget-wide v6, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->j:J

    sub-long/2addr v4, v6

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-ltz v0, :cond_29

    .line 125
    iget-wide v8, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->g:J

    cmp-long v0, v8, v6

    if-ltz v0, :cond_29

    iget-wide v6, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->g:J

    cmp-long v0, v6, v4

    if-nez v0, :cond_28

    goto :goto_12

    .line 126
    :cond_28
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const/16 v6, 0x41b

    const-string v7, "handle data length[%d] != content length[%d] downloadChunkContentLen[%d], range[%d, %d) , current offset[%d] , handle start from %d"

    const/4 v8, 0x7

    new-array v8, v8, [Ljava/lang/Object;

    .line 127
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v8, v5

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v8, v3

    const/4 v2, 0x2

    iget-wide v3, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->g:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v8, v2

    const/4 v2, 0x3

    .line 128
    invoke-static/range {v29 .. v30}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v8, v2

    const/4 v2, 0x4

    iget-wide v3, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->d:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v8, v2

    const/4 v2, 0x5

    iget-wide v3, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->q:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v8, v2

    const/4 v2, 0x6

    iget-wide v3, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->j:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v8, v2

    .line 129
    invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v6, v2}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    throw v0

    :cond_29
    :goto_12
    return-void

    :catchall_12
    move-exception v0

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/io/Closeable;

    .line 130
    iget-object v3, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->k:Lcom/ss/android/socialbase/downloader/model/o;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/wv/u;->vv([Ljava/io/Closeable;)V

    throw v0

    :catch_b
    move-exception v0

    .line 131
    :try_start_24
    iput-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->b:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 132
    throw v0

    :catch_c
    move-exception v0

    move-wide/from16 v25, v8

    move v4, v15

    :goto_13
    const/4 v10, 0x0

    .line 133
    :goto_14
    sget-object v2, Lcom/ss/android/socialbase/downloader/downloader/o;->m:Ljava/lang/String;

    const-string v3, "handleResponse: BaseException e = "

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/ss/android/socialbase/downloader/p/vv;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->x:Lcom/ss/android/socialbase/downloader/n/vv;

    const-string v3, "ignore_base_ex_on_stop_status"

    invoke-virtual {v2, v3}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2f

    .line 135
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/downloader/o;->u()Z

    move-result v2
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_15

    if-eqz v2, :cond_2f

    .line 136
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->u:Lcom/ss/android/socialbase/downloader/network/wv;

    if-eqz v0, :cond_2a

    .line 137
    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/network/wv;->i()V

    :cond_2a
    if-eqz v10, :cond_2b

    .line 138
    invoke-interface {v10}, Lcom/ss/android/socialbase/downloader/o/m;->m()V

    .line 139
    :cond_2b
    :try_start_25
    iget-boolean v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->la:Z

    if-eqz v0, :cond_2d

    .line 140
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->t:Lcom/ss/android/socialbase/downloader/qv/u;

    monitor-enter v2
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_14

    .line 141
    :try_start_26
    iget-boolean v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->r:Z

    if-nez v0, :cond_2c

    .line 142
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->qv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-direct {v1, v0}, Lcom/ss/android/socialbase/downloader/downloader/o;->vv(Lcom/ss/android/socialbase/downloader/downloader/k;)V

    .line 143
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->k:Lcom/ss/android/socialbase/downloader/model/o;

    if-eqz v0, :cond_2c

    .line 144
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/downloader/o;->qv()V

    .line 145
    :cond_2c
    monitor-exit v2

    goto :goto_15

    :catchall_13
    move-exception v0

    monitor-exit v2
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_13

    :try_start_27
    throw v0

    .line 146
    :cond_2d
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->qv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-direct {v1, v0}, Lcom/ss/android/socialbase/downloader/downloader/o;->vv(Lcom/ss/android/socialbase/downloader/downloader/k;)V

    .line 147
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->k:Lcom/ss/android/socialbase/downloader/model/o;

    if-eqz v0, :cond_2e

    .line 148
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/downloader/o;->qv()V
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_14

    :cond_2e
    :goto_15
    const/4 v2, 0x1

    new-array v0, v2, [Ljava/io/Closeable;

    .line 149
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->k:Lcom/ss/android/socialbase/downloader/model/o;

    const/4 v3, 0x0

    aput-object v2, v0, v3

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/wv/u;->vv([Ljava/io/Closeable;)V

    goto/16 :goto_f

    :catchall_14
    move-exception v0

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/io/Closeable;

    iget-object v3, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->k:Lcom/ss/android/socialbase/downloader/model/o;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/wv/u;->vv([Ljava/io/Closeable;)V

    throw v0

    .line 150
    :cond_2f
    :try_start_28
    invoke-static {}, Lcom/ss/android/socialbase/downloader/p/vv;->vv()Z

    move-result v2

    if-eqz v2, :cond_30

    .line 151
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 152
    :cond_30
    iput-object v0, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->b:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 153
    throw v0
    :try_end_28
    .catchall {:try_start_28 .. :try_end_28} :catchall_15

    :catchall_15
    move-exception v0

    .line 154
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->u:Lcom/ss/android/socialbase/downloader/network/wv;

    if-eqz v2, :cond_31

    .line 155
    invoke-interface {v2}, Lcom/ss/android/socialbase/downloader/network/wv;->i()V

    :cond_31
    if-eqz v10, :cond_32

    .line 156
    invoke-interface {v10}, Lcom/ss/android/socialbase/downloader/o/m;->m()V

    .line 157
    :cond_32
    :try_start_29
    iget-boolean v2, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->la:Z

    if-eqz v2, :cond_34

    .line 158
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->t:Lcom/ss/android/socialbase/downloader/qv/u;

    monitor-enter v2
    :try_end_29
    .catchall {:try_start_29 .. :try_end_29} :catchall_17

    .line 159
    :try_start_2a
    iget-boolean v3, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->r:Z

    if-nez v3, :cond_33

    .line 160
    iget-object v3, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->qv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-direct {v1, v3}, Lcom/ss/android/socialbase/downloader/downloader/o;->vv(Lcom/ss/android/socialbase/downloader/downloader/k;)V

    .line 161
    iget-object v3, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->k:Lcom/ss/android/socialbase/downloader/model/o;

    if-eqz v3, :cond_33

    .line 162
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/downloader/o;->qv()V

    .line 163
    :cond_33
    monitor-exit v2

    goto :goto_16

    :catchall_16
    move-exception v0

    monitor-exit v2
    :try_end_2a
    .catchall {:try_start_2a .. :try_end_2a} :catchall_16

    :try_start_2b
    throw v0

    .line 164
    :cond_34
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->qv:Lcom/ss/android/socialbase/downloader/impls/b;

    invoke-direct {v1, v2}, Lcom/ss/android/socialbase/downloader/downloader/o;->vv(Lcom/ss/android/socialbase/downloader/downloader/k;)V

    .line 165
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->k:Lcom/ss/android/socialbase/downloader/model/o;

    if-eqz v2, :cond_35

    .line 166
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/downloader/o;->qv()V
    :try_end_2b
    .catchall {:try_start_2b .. :try_end_2b} :catchall_17

    :cond_35
    :goto_16
    const/4 v2, 0x1

    new-array v2, v2, [Ljava/io/Closeable;

    .line 167
    iget-object v3, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->k:Lcom/ss/android/socialbase/downloader/model/o;

    const/4 v5, 0x0

    aput-object v3, v2, v5

    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/wv/u;->vv([Ljava/io/Closeable;)V

    .line 168
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    sub-long v2, v2, v25

    iput-wide v2, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->w:J

    .line 169
    iget-object v10, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->x:Lcom/ss/android/socialbase/downloader/n/vv;

    iget-object v11, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->p:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    iget-object v12, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->i:Ljava/lang/String;

    iget-object v13, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->u:Lcom/ss/android/socialbase/downloader/network/wv;

    iget-boolean v14, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->jh:Z

    iget-boolean v15, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->r:Z

    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->b:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    move-object/from16 v16, v2

    iget-wide v2, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->q:J

    iget-wide v5, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->j:J

    sub-long v17, v2, v5

    iget-wide v2, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->w:J

    move-wide/from16 v19, v2

    iget-wide v2, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->ff:J

    move-wide/from16 v22, v2

    iget-wide v2, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->td:J

    move-wide/from16 v24, v2

    iget-wide v2, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->pd:J

    move-wide/from16 v26, v2

    const/16 v28, 0x0

    move/from16 v21, v4

    invoke-static/range {v10 .. v28}, Lcom/ss/android/socialbase/downloader/i/vv;->vv(Lcom/ss/android/socialbase/downloader/n/vv;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/wv;ZZLcom/ss/android/socialbase/downloader/exception/BaseException;JJZJJJLorg/json/JSONObject;)V

    throw v0

    :catchall_17
    move-exception v0

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/io/Closeable;

    .line 170
    iget-object v3, v1, Lcom/ss/android/socialbase/downloader/downloader/o;->k:Lcom/ss/android/socialbase/downloader/model/o;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/wv/u;->vv([Ljava/io/Closeable;)V

    throw v0

    .line 171
    :cond_36
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/u;

    const/16 v2, 0x3ec

    const-string v3, "the content-length is 0"

    invoke-direct {v0, v2, v3}, Lcom/ss/android/socialbase/downloader/exception/u;-><init>(ILjava/lang/String;)V

    throw v0

    :cond_37
    :goto_17
    return-void
.end method

.method public m()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->jh:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->jh:Z

    .line 3
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/downloader/o;->n()V

    return-void
.end method

.method public o()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->a:J

    return-wide v0
.end method

.method public p()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->r:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->t:Lcom/ss/android/socialbase/downloader/qv/u;

    monitor-enter v0

    const/4 v1, 0x1

    .line 3
    :try_start_0
    iput-boolean v1, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->r:Z

    .line 4
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/downloader/o;->n()V

    return-void

    :catchall_0
    move-exception v1

    .line 6
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public vv()J
    .locals 2

    .line 2
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->q:J

    return-wide v0
.end method

.method public vv(JJ)V
    .locals 0

    .line 7
    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->d:J

    .line 8
    iput-wide p3, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->g:J

    return-void
.end method

.method public vv(JJJ)V
    .locals 0

    .line 3
    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->q:J

    .line 4
    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->j:J

    .line 5
    iput-wide p3, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->d:J

    .line 6
    iput-wide p5, p0, Lcom/ss/android/socialbase/downloader/downloader/o;->g:J

    return-void
.end method
