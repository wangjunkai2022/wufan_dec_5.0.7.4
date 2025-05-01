.class public Lcom/ss/android/socialbase/downloader/qv/p;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/socialbase/downloader/qv/u;
.implements Ljava/lang/Runnable;


# static fields
.field private static final vv:Ljava/lang/String;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Z

.field private c:Z

.field private volatile cq:Lcom/ss/android/socialbase/downloader/u/b;

.field private d:Lcom/ss/android/socialbase/downloader/downloader/qv;

.field private final f:Lcom/ss/android/socialbase/downloader/n/vv;

.field private ff:Lcom/ss/android/socialbase/downloader/depend/g;

.field private final g:Lcom/ss/android/socialbase/downloader/downloader/qv;

.field private volatile i:Z

.field private j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

.field private jh:Z

.field private k:Z

.field private l:Lcom/ss/android/socialbase/downloader/network/wv;

.field private la:Lcom/ss/android/socialbase/downloader/downloader/n;

.field private m:Ljava/util/concurrent/Future;

.field private volatile n:Lcom/ss/android/socialbase/downloader/downloader/o;

.field private ns:Lcom/ss/android/socialbase/downloader/network/n;

.field private o:Ljava/util/concurrent/atomic/AtomicInteger;

.field private ot:I

.field private final p:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

.field private pd:Z

.field private pj:J

.field private final q:Lcom/ss/android/socialbase/downloader/downloader/k;

.field private qv:Z

.field private final r:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private volatile t:Lcom/ss/android/socialbase/downloader/constants/qv;

.field private volatile td:I

.field private final u:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/ss/android/socialbase/downloader/qv/m;",
            ">;"
        }
    .end annotation
.end field

.field private final v:Lcom/ss/android/socialbase/downloader/downloader/u;

.field private vu:Lcom/ss/android/socialbase/downloader/depend/ya;

.field private w:Z

.field private wv:Z

.field private final x:Lcom/ss/android/socialbase/downloader/downloader/n;

.field private y:Lcom/ss/android/socialbase/downloader/downloader/la;

.field private volatile ya:Lcom/ss/android/socialbase/downloader/exception/BaseException;

.field private zn:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lcom/ss/android/socialbase/downloader/qv/p;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/ss/android/socialbase/downloader/qv/p;->vv:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/ss/android/socialbase/downloader/model/DownloadTask;Landroid/os/Handler;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->i:Z

    .line 3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->u:Ljava/util/ArrayList;

    .line 4
    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/qv;->vv:Lcom/ss/android/socialbase/downloader/constants/qv;

    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    const/4 v1, 0x5

    .line 5
    iput v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->td:I

    .line 6
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->pd:Z

    .line 7
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->w:Z

    .line 8
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->c:Z

    .line 9
    iput v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->ot:I

    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->cq:Lcom/ss/android/socialbase/downloader/u/b;

    .line 11
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->p:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    if-eqz p1, :cond_0

    .line 12
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getDownloadInfo()Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 13
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getChunkStrategy()Lcom/ss/android/socialbase/downloader/downloader/qv;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->d:Lcom/ss/android/socialbase/downloader/downloader/qv;

    .line 14
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getChunkAdjustCalculator()Lcom/ss/android/socialbase/downloader/downloader/n;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->la:Lcom/ss/android/socialbase/downloader/downloader/n;

    .line 15
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getForbiddenHandler()Lcom/ss/android/socialbase/downloader/depend/ya;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->vu:Lcom/ss/android/socialbase/downloader/depend/ya;

    .line 16
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getDiskSpaceHandler()Lcom/ss/android/socialbase/downloader/depend/g;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->ff:Lcom/ss/android/socialbase/downloader/depend/g;

    .line 17
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/qv/p;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadTask;)Lcom/ss/android/socialbase/downloader/downloader/la;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->y:Lcom/ss/android/socialbase/downloader/downloader/la;

    .line 18
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(I)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->f:Lcom/ss/android/socialbase/downloader/n/vv;

    goto :goto_0

    .line 19
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/n/vv;->p()Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->f:Lcom/ss/android/socialbase/downloader/n/vv;

    .line 20
    :goto_0
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/qv/p;->qv()V

    .line 21
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->ns()Lcom/ss/android/socialbase/downloader/downloader/k;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->q:Lcom/ss/android/socialbase/downloader/downloader/k;

    .line 22
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->ot()Lcom/ss/android/socialbase/downloader/downloader/qv;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->g:Lcom/ss/android/socialbase/downloader/downloader/qv;

    .line 23
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->tf()Lcom/ss/android/socialbase/downloader/downloader/n;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->x:Lcom/ss/android/socialbase/downloader/downloader/n;

    .line 24
    new-instance v0, Lcom/ss/android/socialbase/downloader/downloader/u;

    invoke-direct {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/u;-><init>(Lcom/ss/android/socialbase/downloader/model/DownloadTask;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->v:Lcom/ss/android/socialbase/downloader/downloader/u;

    .line 25
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->r:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method private a()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/u;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isOnlyWifi()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->ky()Landroid/content/Context;

    move-result-object v0

    const-string v1, "android.permission.ACCESS_NETWORK_STATE"

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/wv/u;->vv(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/u;

    const/16 v2, 0x3fb

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const-string v1, "download task need permission:%s"

    invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lcom/ss/android/socialbase/downloader/exception/u;-><init>(ILjava/lang/String;)V

    throw v0

    .line 3
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isDownloadWithWifiValid()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isPauseReserveWithWifiValid()Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    .line 5
    :cond_2
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/o;

    invoke-direct {v0}, Lcom/ss/android/socialbase/downloader/exception/o;-><init>()V

    throw v0

    .line 6
    :cond_3
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/p;

    invoke-direct {v0}, Lcom/ss/android/socialbase/downloader/exception/p;-><init>()V

    throw v0
.end method

.method private b()V
    .locals 7

    const/16 v0, 0xa

    .line 1
    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    const-wide/16 v0, 0x0

    .line 2
    :try_start_0
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    if-eqz v2, :cond_0

    iget-wide v3, p0, Lcom/ss/android/socialbase/downloader/qv/p;->pj:J

    cmp-long v5, v3, v0

    if-lez v5, :cond_0

    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v5, p0, Lcom/ss/android/socialbase/downloader/qv/p;->pj:J

    sub-long/2addr v3, v5

    invoke-virtual {v2, v3, v4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->increaseDownloadPrepareTime(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    :catchall_0
    :cond_0
    :try_start_1
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->p:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getInterceptor()Lcom/ss/android/socialbase/downloader/depend/IDownloadInterceptor;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 5
    invoke-interface {v2}, Lcom/ss/android/socialbase/downloader/depend/IDownloadInterceptor;->intercepte()Z

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v2, :cond_1

    .line 6
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->v:Lcom/ss/android/socialbase/downloader/downloader/u;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/downloader/u;->o()V

    return-void

    :catchall_1
    move-exception v2

    .line 7
    :try_start_2
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 8
    :cond_1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/qv/p;->wv()Z

    move-result v2

    if-nez v2, :cond_3

    .line 9
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->p:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getMonitorDepend()Lcom/ss/android/socialbase/downloader/depend/l;

    move-result-object v0

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    new-instance v2, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const/16 v3, 0x3eb

    const-string v4, "task status is invalid"

    invoke-direct {v2, v3, v4}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v3

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    :goto_0
    invoke-static {v0, v1, v2, v3}, Lcom/ss/android/socialbase/downloader/i/vv;->vv(Lcom/ss/android/socialbase/downloader/depend/l;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/exception/BaseException;I)V

    return-void

    .line 10
    :cond_3
    :goto_1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/qv/p;->jh()V

    .line 11
    iget-boolean v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->pd:Z

    if-eqz v2, :cond_7

    .line 12
    iget v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->td:I

    if-lez v2, :cond_4

    .line 13
    iget v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->td:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->td:I

    goto :goto_1

    .line 14
    :cond_4
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v2

    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v4

    cmp-long v6, v2, v4

    if-eqz v6, :cond_5

    .line 15
    sget-object v0, Lcom/ss/android/socialbase/downloader/qv/p;->vv:Ljava/lang/String;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getErrorBytesLog()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->v:Lcom/ss/android/socialbase/downloader/downloader/u;

    new-instance v1, Lcom/ss/android/socialbase/downloader/exception/u;

    const/16 v2, 0x403

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "current bytes is not equals to total bytes, bytes invalid retry status is : "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getByteInvalidRetryStatus()Lcom/ss/android/socialbase/downloader/constants/m;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/ss/android/socialbase/downloader/exception/u;-><init>(ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/u;->vv(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    return-void

    .line 17
    :cond_5
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v2

    cmp-long v4, v2, v0

    if-gtz v4, :cond_6

    .line 18
    sget-object v0, Lcom/ss/android/socialbase/downloader/qv/p;->vv:Ljava/lang/String;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getErrorBytesLog()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->v:Lcom/ss/android/socialbase/downloader/downloader/u;

    new-instance v1, Lcom/ss/android/socialbase/downloader/exception/u;

    const/16 v2, 0x402

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "curBytes is 0, bytes invalid retry status is : "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getByteInvalidRetryStatus()Lcom/ss/android/socialbase/downloader/constants/m;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/ss/android/socialbase/downloader/exception/u;-><init>(ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/u;->vv(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    return-void

    .line 20
    :cond_6
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v2

    cmp-long v4, v2, v0

    if-gtz v4, :cond_3

    .line 21
    sget-object v0, Lcom/ss/android/socialbase/downloader/qv/p;->vv:Ljava/lang/String;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getErrorBytesLog()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->v:Lcom/ss/android/socialbase/downloader/downloader/u;

    new-instance v1, Lcom/ss/android/socialbase/downloader/exception/u;

    const/16 v2, 0x414

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "TotalBytes is 0, bytes invalid retry status is : "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getByteInvalidRetryStatus()Lcom/ss/android/socialbase/downloader/constants/m;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/ss/android/socialbase/downloader/exception/u;-><init>(ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/u;->vv(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    :cond_7
    return-void

    :catchall_2
    move-exception v0

    .line 23
    goto :goto_3

    :goto_2
    throw v0

    :goto_3
    goto :goto_2
.end method

.method private c()V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 3
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_4

    .line 5
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v1

    if-nez v1, :cond_7

    .line 6
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_7

    .line 7
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v2

    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(I)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v2

    const-string v3, "opt_mkdir_failed"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result v2

    const/16 v3, 0x406

    const/4 v5, 0x1

    const-string v6, "download savePath directory can not created:"

    if-ne v2, v5, :cond_3

    :goto_0
    if-nez v1, :cond_0

    add-int/lit8 v2, v4, 0x1

    const/4 v5, 0x3

    if-ge v4, v5, :cond_0

    const-wide/16 v4, 0xa

    .line 8
    :try_start_0
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v1

    move v4, v2

    goto :goto_0

    :catch_0
    nop

    :cond_0
    if-nez v1, :cond_2

    .line 10
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    .line 11
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/wv/u;->i(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v4, 0x4000

    cmp-long v2, v0, v4

    if-gez v2, :cond_1

    .line 12
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const/16 v1, 0x3ee

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 13
    :cond_1
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v3, v1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    throw v0

    :cond_2
    return-void

    .line 14
    :cond_3
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v3, v1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 15
    :cond_4
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-nez v1, :cond_7

    .line 16
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/wv/i;->m(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    move-result v1

    const/16 v2, 0x407

    if-eqz v1, :cond_6

    .line 17
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 18
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v1

    if-nez v1, :cond_7

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_1

    .line 19
    :cond_5
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "download savePath is not directory:path="

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 20
    :cond_6
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "download savePath is not a directory:"

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    throw v0

    :cond_7
    :goto_1
    return-void

    .line 21
    :cond_8
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const/16 v1, 0x405

    const-string v2, "download name can not be empty"

    invoke-direct {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 22
    :cond_9
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const/16 v1, 0x404

    const-string v2, "download savePath can not be empty"

    invoke-direct {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    goto :goto_3

    :goto_2
    throw v0

    :goto_3
    goto :goto_2
.end method

.method private cq()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method private d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->ns:Lcom/ss/android/socialbase/downloader/network/n;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/network/n;->p()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->ns:Lcom/ss/android/socialbase/downloader/network/n;

    :cond_0
    return-void
.end method

.method private f()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->u:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ss/android/socialbase/downloader/qv/m;

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/qv/m;->m()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_1
    return-void

    :catchall_0
    move-exception v0

    .line 4
    sget-object v1, Lcom/ss/android/socialbase/downloader/qv/p;->vv:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "cancelAllChunkRunnable: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/ss/android/socialbase/downloader/p/vv;->p(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private ff()J
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->y:Lcom/ss/android/socialbase/downloader/downloader/la;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurRetryTimeInTotal()I

    move-result v1

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalRetryCount()I

    move-result v2

    invoke-interface {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/downloader/la;->vv(II)J

    move-result-wide v0

    return-wide v0
.end method

.method private g()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->l:Lcom/ss/android/socialbase/downloader/network/wv;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/network/wv;->i()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->l:Lcom/ss/android/socialbase/downloader/network/wv;

    :cond_0
    return-void
.end method

.method private i(Lcom/ss/android/socialbase/downloader/exception/BaseException;)Z
    .locals 6

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->o:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x1

    if-eqz v0, :cond_6

    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/4 v2, 0x0

    if-lez v0, :cond_0

    if-eqz p1, :cond_3

    .line 4
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;->getErrorCode()I

    move-result v0

    const/16 v3, 0x42e

    if-eq v0, v3, :cond_0

    goto :goto_1

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->trySwitchToNextBackupUrl()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->o:Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getBackUpUrlRetryCount()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 7
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->o:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->updateCurRetryTime(I)V

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_5

    .line 8
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;->getErrorCode()I

    move-result v0

    const/16 v3, 0x3f3

    if-eq v0, v3, :cond_2

    .line 9
    invoke-virtual {p1}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz v0, :cond_5

    :cond_2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->canReplaceHttpForRetry()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 10
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->o:Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getRetryCount()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 11
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->o:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->updateCurRetryTime(I)V

    .line 12
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setHttpsToHttpRetryUsed(Z)V

    :goto_0
    const/4 v1, 0x0

    .line 13
    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/qv;->u:Lcom/ss/android/socialbase/downloader/constants/qv;

    if-eq p1, v0, :cond_4

    if-eqz v1, :cond_4

    .line 14
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->o:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->updateCurRetryTime(I)V

    :cond_4
    return v2

    .line 15
    :cond_5
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;->getErrorCode()I

    move-result v3

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/ss/android/socialbase/downloader/qv/p;->o:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v2

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getRetryCount()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v4, v1

    const/4 v2, 0x2

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;->getErrorMessage()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v4, v2

    const-string p1, "retry for exception, but current retry time : %s , retry Time %s all used, last error is %s"

    invoke-static {p1, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v3, p1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/ss/android/socialbase/downloader/qv/p;->m(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    return v1

    .line 16
    :cond_6
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const/16 v2, 0x413

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "retry for exception, but retain retry time is null, last error is :"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;->getErrorMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v2, p1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/ss/android/socialbase/downloader/qv/p;->m(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    return v1
.end method

.method private j()V
    .locals 7

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/qv/p;->vv:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "endDownloadRunnable::runStatus="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/qv;->m:Lcom/ss/android/socialbase/downloader/constants/qv;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/qv;->p:Lcom/ss/android/socialbase/downloader/constants/qv;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 3
    :goto_0
    :try_start_0
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/qv/p;->ya()Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v4, 0x0

    goto :goto_2

    :catch_0
    move-exception v1

    .line 4
    instance-of v4, v1, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    if-eqz v4, :cond_1

    .line 5
    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/qv/p;->v:Lcom/ss/android/socialbase/downloader/downloader/u;

    check-cast v1, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    invoke-virtual {v4, v1}, Lcom/ss/android/socialbase/downloader/downloader/u;->vv(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    goto :goto_1

    .line 6
    :cond_1
    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/qv/p;->v:Lcom/ss/android/socialbase/downloader/downloader/u;

    new-instance v5, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const/16 v6, 0x416

    invoke-direct {v5, v6, v1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/Throwable;)V

    invoke-virtual {v4, v5}, Lcom/ss/android/socialbase/downloader/downloader/u;->vv(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    :goto_1
    const/4 v1, 0x1

    const/4 v4, 0x1

    :goto_2
    if-nez v1, :cond_3

    if-eqz v4, :cond_2

    goto :goto_3

    .line 7
    :cond_2
    iput-boolean v3, p0, Lcom/ss/android/socialbase/downloader/qv/p;->pd:Z

    .line 8
    sget-object v0, Lcom/ss/android/socialbase/downloader/qv/p;->vv:Ljava/lang/String;

    const-string v1, "jump to restart"

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    .line 9
    :cond_3
    :goto_3
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->r:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    if-eqz v0, :cond_6

    .line 10
    :try_start_1
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->w()Lcom/ss/android/socialbase/downloader/impls/vv;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 11
    invoke-virtual {v0, p0}, Lcom/ss/android/socialbase/downloader/impls/vv;->vv(Lcom/ss/android/socialbase/downloader/qv/p;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_4
    return-void

    :catchall_0
    move-exception v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 13
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->p:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getMonitorDepend()Lcom/ss/android/socialbase/downloader/depend/l;

    move-result-object v1

    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    new-instance v4, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const/16 v5, 0x3f6

    const-string v6, "removeDownloadRunnable"

    invoke-static {v0, v6}, Lcom/ss/android/socialbase/downloader/wv/u;->m(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v5, v0}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v2

    :cond_5
    invoke-static {v1, v3, v4, v2}, Lcom/ss/android/socialbase/downloader/i/vv;->vv(Lcom/ss/android/socialbase/downloader/depend/l;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/exception/BaseException;I)V

    :cond_6
    :goto_4
    return-void
.end method

.method private jh()V
    .locals 17

    move-object/from16 v1, p0

    .line 1
    :try_start_0
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/qv;->vv:Lcom/ss/android/socialbase/downloader/constants/qv;

    iput-object v0, v1, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    .line 2
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->updateStartDownloadTime()V

    .line 3
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->resetRealStartDownloadTime()V

    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 5
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    const-wide/16 v4, -0x1

    invoke-virtual {v0, v4, v5}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setFirstSpeedTime(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 6
    :try_start_1
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->k()V
    :try_end_1
    .catch Lcom/ss/android/socialbase/downloader/exception/vv; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v6, v0

    .line 7
    :try_start_2
    sget-object v0, Lcom/ss/android/socialbase/downloader/qv/p;->vv:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "file exist "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/exception/vv;->vv()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v0, v7}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/exception/vv;->vv()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/ss/android/socialbase/downloader/qv/p;->a:Ljava/lang/String;

    const/4 v0, 0x1

    .line 9
    :goto_0
    iget-boolean v6, v1, Lcom/ss/android/socialbase/downloader/qv/p;->pd:Z

    if-nez v6, :cond_0

    .line 10
    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/qv/p;->v:Lcom/ss/android/socialbase/downloader/downloader/u;

    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/downloader/u;->m()V

    .line 11
    :cond_0
    iput-boolean v5, v1, Lcom/ss/android/socialbase/downloader/qv/p;->pd:Z

    .line 12
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->v()Z

    move-result v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    if-eqz v6, :cond_1

    .line 13
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->j()V

    return-void

    .line 14
    :cond_1
    :try_start_3
    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/qv/p;->a:Ljava/lang/String;

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_3

    if-eqz v0, :cond_3

    .line 15
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isExpiredRedownload()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 16
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/wv/u;->i(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    move-result v0

    iput-boolean v0, v1, Lcom/ss/android/socialbase/downloader/qv/p;->c:Z

    .line 17
    :cond_2
    iget-boolean v0, v1, Lcom/ss/android/socialbase/downloader/qv/p;->c:Z

    if-nez v0, :cond_3

    .line 18
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->r()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 19
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->j()V

    return-void

    .line 20
    :cond_3
    :goto_1
    :try_start_4
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->v()Z

    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    if-eqz v0, :cond_4

    .line 21
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->j()V

    return-void

    .line 22
    :cond_4
    :try_start_5
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->c()V

    .line 23
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->td()V

    .line 24
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->a()V

    .line 25
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/qv/p;->q:Lcom/ss/android/socialbase/downloader/downloader/k;

    iget-object v8, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v8

    invoke-interface {v0, v8}, Lcom/ss/android/socialbase/downloader/downloader/k;->p(I)Ljava/util/List;

    move-result-object v0

    .line 26
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->zn()V

    .line 27
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->t()Z

    move-result v8

    if-eqz v8, :cond_5

    .line 28
    sget-object v0, Lcom/ss/android/socialbase/downloader/qv/p;->vv:Ljava/lang/String;

    const-string v8, "downloadSegments return"

    invoke-static {v0, v8}, Lcom/ss/android/socialbase/downloader/p/vv;->p(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catch Lcom/ss/android/socialbase/downloader/exception/vv; {:try_start_5 .. :try_end_5} :catch_3
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Lcom/ss/android/socialbase/downloader/exception/wv; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 29
    :try_start_6
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->la()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 30
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->j()V

    return-void

    .line 31
    :cond_5
    :try_start_7
    iget-object v8, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getConnectionUrl()Ljava/lang/String;

    move-result-object v8

    .line 32
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->v()Z

    move-result v9
    :try_end_7
    .catch Lcom/ss/android/socialbase/downloader/exception/vv; {:try_start_7 .. :try_end_7} :catch_3
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_7 .. :try_end_7} :catch_2
    .catch Lcom/ss/android/socialbase/downloader/exception/wv; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    if-eqz v9, :cond_6

    .line 33
    :try_start_8
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->la()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 34
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->j()V

    return-void

    .line 35
    :cond_6
    :try_start_9
    iget-boolean v9, v1, Lcom/ss/android/socialbase/downloader/qv/p;->wv:Z

    if-eqz v9, :cond_7

    .line 36
    iget-object v9, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-static {v9}, Lcom/ss/android/socialbase/downloader/wv/u;->o(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)J

    move-result-wide v9

    goto :goto_2

    :cond_7
    const-wide/16 v9, 0x0

    .line 37
    :goto_2
    iget-object v11, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-static {v11, v9, v10}, Lcom/ss/android/socialbase/downloader/qv/p;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;J)Lcom/ss/android/socialbase/downloader/model/m;

    move-result-object v11

    .line 38
    invoke-direct {v1, v11}, Lcom/ss/android/socialbase/downloader/qv/p;->vv(Lcom/ss/android/socialbase/downloader/model/m;)Ljava/util/List;

    move-result-object v12

    .line 39
    iget-object v13, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-static {v12, v13}, Lcom/ss/android/socialbase/downloader/wv/u;->vv(Ljava/util/List;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 40
    iget-object v13, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-static {v12, v13}, Lcom/ss/android/socialbase/downloader/wv/u;->m(Ljava/util/List;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 41
    iget-object v13, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v13, v5}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setPreconnectLevel(I)V

    .line 42
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13
    :try_end_9
    .catch Lcom/ss/android/socialbase/downloader/exception/vv; {:try_start_9 .. :try_end_9} :catch_3
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_9 .. :try_end_9} :catch_2
    .catch Lcom/ss/android/socialbase/downloader/exception/wv; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 43
    :try_start_a
    invoke-direct {v1, v8, v12, v9, v10}, Lcom/ss/android/socialbase/downloader/qv/p;->vv(Ljava/lang/String;Ljava/util/List;J)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 44
    :try_start_b
    iget-object v9, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v15

    sub-long v6, v15, v13

    invoke-virtual {v9, v6, v7}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->increaseAllConnectTime(J)V

    .line 45
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->v()Z

    move-result v6
    :try_end_b
    .catch Lcom/ss/android/socialbase/downloader/exception/vv; {:try_start_b .. :try_end_b} :catch_3
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_b .. :try_end_b} :catch_2
    .catch Lcom/ss/android/socialbase/downloader/exception/wv; {:try_start_b .. :try_end_b} :catch_1
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    if-eqz v6, :cond_8

    .line 46
    :try_start_c
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->la()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 47
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->j()V

    return-void

    .line 48
    :cond_8
    :try_start_d
    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v6

    .line 49
    invoke-virtual {v1, v6, v7}, Lcom/ss/android/socialbase/downloader/qv/p;->vv(J)V

    .line 50
    invoke-direct {v1, v6, v7, v0}, Lcom/ss/android/socialbase/downloader/qv/p;->vv(JLjava/util/List;)I

    move-result v9

    .line 51
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->v()Z

    move-result v10
    :try_end_d
    .catch Lcom/ss/android/socialbase/downloader/exception/vv; {:try_start_d .. :try_end_d} :catch_3
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_d .. :try_end_d} :catch_2
    .catch Lcom/ss/android/socialbase/downloader/exception/wv; {:try_start_d .. :try_end_d} :catch_1
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    if-eqz v10, :cond_9

    .line 52
    :try_start_e
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->la()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 53
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->j()V

    return-void

    :cond_9
    if-lez v9, :cond_12

    if-ne v9, v4, :cond_a

    const/4 v10, 0x1

    goto :goto_3

    :cond_a
    const/4 v10, 0x0

    .line 54
    :goto_3
    :try_start_f
    iput-boolean v10, v1, Lcom/ss/android/socialbase/downloader/qv/p;->qv:Z

    if-eqz v10, :cond_d

    .line 55
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/qv/p;->l:Lcom/ss/android/socialbase/downloader/network/wv;
    :try_end_f
    .catch Lcom/ss/android/socialbase/downloader/exception/vv; {:try_start_f .. :try_end_f} :catch_3
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_f .. :try_end_f} :catch_2
    .catch Lcom/ss/android/socialbase/downloader/exception/wv; {:try_start_f .. :try_end_f} :catch_1
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    if-nez v0, :cond_b

    .line 56
    :try_start_10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    .line 57
    invoke-direct {v1, v8, v12}, Lcom/ss/android/socialbase/downloader/qv/p;->vv(Ljava/lang/String;Ljava/util/List;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 58
    :try_start_11
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sub-long/2addr v6, v13

    invoke-virtual {v0, v6, v7}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->increaseAllConnectTime(J)V

    goto :goto_4

    :catchall_0
    move-exception v0

    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    sub-long/2addr v7, v13

    invoke-virtual {v6, v7, v8}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->increaseAllConnectTime(J)V

    throw v0

    .line 59
    :cond_b
    :goto_4
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->v()Z

    move-result v0
    :try_end_11
    .catch Lcom/ss/android/socialbase/downloader/exception/vv; {:try_start_11 .. :try_end_11} :catch_3
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_11 .. :try_end_11} :catch_2
    .catch Lcom/ss/android/socialbase/downloader/exception/wv; {:try_start_11 .. :try_end_11} :catch_1
    .catchall {:try_start_11 .. :try_end_11} :catchall_2

    if-eqz v0, :cond_c

    .line 60
    :try_start_12
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->la()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_4

    .line 61
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->j()V

    return-void

    .line 62
    :cond_c
    :try_start_13
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sub-long/2addr v6, v2

    invoke-virtual {v0, v6, v7}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setFirstSpeedTime(J)V

    .line 63
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->q()V

    .line 64
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/qv/p;->l:Lcom/ss/android/socialbase/downloader/network/wv;

    invoke-direct {v1, v11, v8, v0}, Lcom/ss/android/socialbase/downloader/qv/p;->vv(Lcom/ss/android/socialbase/downloader/model/m;Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/wv;)V

    goto :goto_5

    .line 65
    :cond_d
    iget-object v8, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isNeedReuseFirstConnection()Z

    move-result v8

    if-nez v8, :cond_e

    .line 66
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->g()V

    .line 67
    :cond_e
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->v()Z

    move-result v8
    :try_end_13
    .catch Lcom/ss/android/socialbase/downloader/exception/vv; {:try_start_13 .. :try_end_13} :catch_3
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_13 .. :try_end_13} :catch_2
    .catch Lcom/ss/android/socialbase/downloader/exception/wv; {:try_start_13 .. :try_end_13} :catch_1
    .catchall {:try_start_13 .. :try_end_13} :catchall_2

    if-eqz v8, :cond_f

    .line 68
    :try_start_14
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->la()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_4

    .line 69
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->j()V

    return-void

    .line 70
    :cond_f
    :try_start_15
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->q()V

    .line 71
    iget-object v8, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    sub-long/2addr v10, v2

    invoke-virtual {v8, v10, v11}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setFirstSpeedTime(J)V

    .line 72
    iget-boolean v8, v1, Lcom/ss/android/socialbase/downloader/qv/p;->wv:Z

    if-eqz v8, :cond_10

    .line 73
    invoke-direct {v1, v9, v0}, Lcom/ss/android/socialbase/downloader/qv/p;->vv(ILjava/util/List;)V

    goto :goto_5

    .line 74
    :cond_10
    invoke-direct {v1, v6, v7, v9}, Lcom/ss/android/socialbase/downloader/qv/p;->vv(JI)V
    :try_end_15
    .catch Lcom/ss/android/socialbase/downloader/exception/vv; {:try_start_15 .. :try_end_15} :catch_3
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_15 .. :try_end_15} :catch_2
    .catch Lcom/ss/android/socialbase/downloader/exception/wv; {:try_start_15 .. :try_end_15} :catch_1
    .catchall {:try_start_15 .. :try_end_15} :catchall_2

    .line 75
    :cond_11
    :goto_5
    :try_start_16
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->la()V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_4

    goto/16 :goto_8

    .line 76
    :cond_12
    :try_start_17
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const/16 v6, 0x408

    const-string v7, "chunkCount is 0"

    invoke-direct {v0, v6, v7}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    throw v0

    :catchall_1
    move-exception v0

    move-object v6, v0

    .line 77
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    sub-long/2addr v7, v13

    invoke-virtual {v0, v7, v8}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->increaseAllConnectTime(J)V

    throw v6
    :try_end_17
    .catch Lcom/ss/android/socialbase/downloader/exception/vv; {:try_start_17 .. :try_end_17} :catch_3
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_17 .. :try_end_17} :catch_2
    .catch Lcom/ss/android/socialbase/downloader/exception/wv; {:try_start_17 .. :try_end_17} :catch_1
    .catchall {:try_start_17 .. :try_end_17} :catchall_2

    :catchall_2
    move-exception v0

    .line 78
    :try_start_18
    sget-object v2, Lcom/ss/android/socialbase/downloader/qv/p;->vv:Ljava/lang/String;

    const-string v3, "downloadInner: throwable =  "

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/ss/android/socialbase/downloader/p/vv;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    sget-object v3, Lcom/ss/android/socialbase/downloader/constants/qv;->m:Lcom/ss/android/socialbase/downloader/constants/qv;

    if-eq v2, v3, :cond_11

    .line 80
    new-instance v2, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const/16 v3, 0x415

    invoke-direct {v2, v3, v0}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Lcom/ss/android/socialbase/downloader/qv/p;->m(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    goto :goto_5

    :catch_1
    move-exception v0

    .line 81
    sget-object v6, Lcom/ss/android/socialbase/downloader/qv/p;->vv:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "downloadInner: retry throwable for "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/exception/wv;->vv()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/ss/android/socialbase/downloader/p/vv;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    sget-object v7, Lcom/ss/android/socialbase/downloader/constants/qv;->m:Lcom/ss/android/socialbase/downloader/constants/qv;

    if-eq v6, v7, :cond_11

    .line 83
    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/qv/p;->o:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v7, 0x5

    if-eqz v6, :cond_14

    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v6

    if-lez v6, :cond_14

    .line 84
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/qv/p;->o:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v6

    invoke-virtual {v0, v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->updateCurRetryTime(I)V

    .line 85
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0, v7}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setStatus(I)V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_3

    .line 86
    :cond_13
    :goto_6
    :try_start_19
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->la()V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_4

    goto/16 :goto_1

    .line 87
    :cond_14
    :try_start_1a
    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/qv/p;->o:Ljava/util/concurrent/atomic/AtomicInteger;

    if-eqz v6, :cond_16

    .line 88
    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->trySwitchToNextBackupUrl()Z

    move-result v6

    if-eqz v6, :cond_15

    .line 89
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0, v7}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setStatus(I)V

    .line 90
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/qv/p;->o:Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getRetryCount()I

    move-result v6

    invoke-virtual {v0, v6}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 91
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/qv/p;->o:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v6

    invoke-virtual {v0, v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->updateCurRetryTime(I)V

    goto :goto_6

    .line 92
    :cond_15
    new-instance v2, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const/16 v3, 0x3fa

    const-string v6, "retry for Throwable, but retry Time %s all used, last error is %s"

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    iget-object v8, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getRetryCount()I

    move-result v8

    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v5

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/exception/wv;->vv()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v7, v4

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/ss/android/socialbase/downloader/qv/p;->m(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    goto/16 :goto_5

    .line 93
    :cond_16
    new-instance v2, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const/16 v3, 0x413

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "retry for Throwable, but retain retry time is NULL, last error is"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/exception/wv;->vv()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/ss/android/socialbase/downloader/qv/p;->m(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    goto/16 :goto_5

    :catch_2
    move-exception v0

    .line 94
    sget-object v6, Lcom/ss/android/socialbase/downloader/qv/p;->vv:Ljava/lang/String;

    const-string v7, "downloadInner: baseException = "

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/ss/android/socialbase/downloader/p/vv;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    sget-object v7, Lcom/ss/android/socialbase/downloader/constants/qv;->m:Lcom/ss/android/socialbase/downloader/constants/qv;

    if-eq v6, v7, :cond_11

    .line 96
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/exception/BaseException;->getErrorCode()I

    move-result v6

    const/16 v7, 0x401

    if-eq v6, v7, :cond_1a

    .line 97
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/exception/BaseException;->getErrorCode()I

    move-result v6

    const/16 v7, 0x3f1

    if-ne v6, v7, :cond_17

    goto :goto_7

    .line 98
    :cond_17
    invoke-virtual {v1, v0}, Lcom/ss/android/socialbase/downloader/qv/p;->vv(Lcom/ss/android/socialbase/downloader/exception/BaseException;)Z

    move-result v6

    if-eqz v6, :cond_19

    .line 99
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/wv/u;->vv(Lcom/ss/android/socialbase/downloader/exception/BaseException;)Z

    move-result v6

    if-eqz v6, :cond_18

    .line 100
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->pj()V

    :cond_18
    const-wide/16 v6, 0x0

    .line 101
    invoke-virtual {v1, v0, v6, v7}, Lcom/ss/android/socialbase/downloader/qv/p;->vv(Lcom/ss/android/socialbase/downloader/exception/BaseException;J)Lcom/ss/android/socialbase/downloader/exception/qv;

    move-result-object v0

    .line 102
    sget-object v6, Lcom/ss/android/socialbase/downloader/exception/qv;->vv:Lcom/ss/android/socialbase/downloader/exception/qv;
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_3

    if-ne v0, v6, :cond_13

    .line 103
    :try_start_1b
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->la()V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_4

    .line 104
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->j()V

    return-void

    .line 105
    :cond_19
    :try_start_1c
    invoke-virtual {v1, v0}, Lcom/ss/android/socialbase/downloader/qv/p;->m(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    goto/16 :goto_5

    .line 106
    :cond_1a
    :goto_7
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/qv;->o:Lcom/ss/android/socialbase/downloader/constants/qv;

    iput-object v0, v1, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_3

    .line 107
    :try_start_1d
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->la()V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_4

    .line 108
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->j()V

    return-void

    .line 109
    :catch_3
    :try_start_1e
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->r()V
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_3

    goto/16 :goto_5

    .line 110
    :goto_8
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->j()V

    return-void

    :catchall_3
    move-exception v0

    .line 111
    :try_start_1f
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->la()V

    throw v0
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_4

    :catchall_4
    move-exception v0

    .line 112
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->j()V

    goto :goto_a

    :goto_9
    throw v0

    :goto_a
    goto :goto_9
.end method

.method private k()V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/vv;
        }
    .end annotation

    const-string v0, "fix_file_exist_update_download_info"

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 1
    :try_start_0
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v3

    .line 2
    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/qv/p;->q:Lcom/ss/android/socialbase/downloader/downloader/k;

    if-eqz v4, :cond_7

    const/16 v4, 0x800

    .line 3
    invoke-static {v4}, Lcom/ss/android/socialbase/downloader/wv/vv;->vv(I)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 4
    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/qv/p;->q:Lcom/ss/android/socialbase/downloader/downloader/k;

    invoke-interface {v4}, Lcom/ss/android/socialbase/downloader/downloader/k;->o()Z

    .line 5
    :cond_0
    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/qv/p;->q:Lcom/ss/android/socialbase/downloader/downloader/k;

    invoke-interface {v4, v3}, Lcom/ss/android/socialbase/downloader/downloader/k;->m(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v4

    if-eqz v4, :cond_6

    .line 6
    invoke-virtual {v4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isNewTask()Z

    move-result v5

    if-eqz v5, :cond_1

    goto/16 :goto_2

    .line 7
    :cond_1
    iget-object v5, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v5}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    move-result-object v5

    .line 8
    iget-object v6, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getMd5()Ljava/lang/String;

    move-result-object v6

    .line 9
    iget-object v7, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v7, v4, v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->copyFromCacheData(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Z)V

    const/16 v7, 0x1000

    .line 10
    invoke-static {v7}, Lcom/ss/android/socialbase/downloader/wv/vv;->vv(I)Z

    move-result v7

    if-eqz v7, :cond_2

    iget-object v7, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    :try_end_0
    .catch Lcom/ss/android/socialbase/downloader/exception/vv; {:try_start_0 .. :try_end_0} :catch_6
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    if-eq v4, v7, :cond_2

    const/4 v7, 0x1

    goto :goto_0

    :cond_2
    const/4 v7, 0x0

    .line 11
    :goto_0
    :try_start_1
    invoke-virtual {v4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-static {v4, v1, v6}, Lcom/ss/android/socialbase/downloader/wv/u;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;ZLjava/lang/String;)Z

    move-result v5
    :try_end_1
    .catch Lcom/ss/android/socialbase/downloader/exception/vv; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v5, :cond_3

    goto :goto_1

    .line 12
    :cond_3
    :try_start_2
    new-instance v1, Lcom/ss/android/socialbase/downloader/exception/vv;

    invoke-virtual {v4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Lcom/ss/android/socialbase/downloader/exception/vv;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_2
    .catch Lcom/ss/android/socialbase/downloader/exception/vv; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception v1

    move-object v3, v1

    move v1, v7

    goto :goto_5

    :catch_0
    move-exception v1

    move-object v3, v1

    move v1, v7

    goto/16 :goto_7

    .line 13
    :cond_4
    :goto_1
    :try_start_3
    invoke-static {v4}, Lcom/ss/android/socialbase/downloader/downloader/p;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)I

    move-result v4
    :try_end_3
    .catch Lcom/ss/android/socialbase/downloader/exception/vv; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eq v4, v3, :cond_5

    .line 14
    :try_start_4
    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/qv/p;->q:Lcom/ss/android/socialbase/downloader/downloader/k;

    invoke-interface {v4, v3}, Lcom/ss/android/socialbase/downloader/downloader/k;->u(I)Z
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Lcom/ss/android/socialbase/downloader/exception/vv; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_3

    :catch_1
    move-exception v3

    .line 15
    :try_start_5
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteException;->printStackTrace()V
    :try_end_5
    .catch Lcom/ss/android/socialbase/downloader/exception/vv; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_3

    :cond_5
    move v2, v7

    goto :goto_3

    :catchall_1
    move-exception v2

    move-object v3, v2

    move v1, v7

    goto :goto_4

    :catch_2
    move-exception v2

    move-object v3, v2

    move v1, v7

    goto :goto_6

    .line 16
    :cond_6
    :goto_2
    :try_start_6
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->reset()V
    :try_end_6
    .catch Lcom/ss/android/socialbase/downloader/exception/vv; {:try_start_6 .. :try_end_6} :catch_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_3

    :cond_7
    const/4 v2, 0x0

    .line 17
    :goto_3
    :try_start_7
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/qv/p;->qv()V
    :try_end_7
    .catch Lcom/ss/android/socialbase/downloader/exception/vv; {:try_start_7 .. :try_end_7} :catch_4
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    if-eqz v2, :cond_b

    .line 18
    :try_start_8
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->q:Lcom/ss/android/socialbase/downloader/downloader/k;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/k;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z
    :try_end_8
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_8 .. :try_end_8} :catch_3

    return-void

    :catch_3
    move-exception v0

    .line 19
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteException;->printStackTrace()V

    return-void

    :catchall_2
    move-exception v3

    move v1, v2

    goto :goto_4

    :catch_4
    move-exception v3

    move v1, v2

    goto :goto_6

    :catchall_3
    move-exception v2

    move-object v3, v2

    :goto_4
    const/4 v2, 0x0

    .line 20
    :goto_5
    :try_start_9
    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/qv/p;->p:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    if-eqz v4, :cond_8

    iget-object v5, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    if-eqz v5, :cond_8

    .line 21
    invoke-virtual {v4}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getMonitorDepend()Lcom/ss/android/socialbase/downloader/depend/l;

    move-result-object v4

    iget-object v5, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    new-instance v6, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const/16 v7, 0x3eb

    const-string v8, "checkTaskCache"

    invoke-static {v3, v8}, Lcom/ss/android/socialbase/downloader/wv/u;->m(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v6, v7, v3}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v3

    invoke-static {v4, v5, v6, v3}, Lcom/ss/android/socialbase/downloader/i/vv;->vv(Lcom/ss/android/socialbase/downloader/depend/l;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/exception/BaseException;I)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    :cond_8
    if-eqz v1, :cond_b

    if-eqz v2, :cond_9

    .line 22
    :try_start_a
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->f:Lcom/ss/android/socialbase/downloader/n/vv;

    invoke-virtual {v1, v0}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 23
    :cond_9
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->q:Lcom/ss/android/socialbase/downloader/downloader/k;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/k;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z
    :try_end_a
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_a .. :try_end_a} :catch_5

    :cond_a
    return-void

    :catch_5
    move-exception v0

    .line 24
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteException;->printStackTrace()V

    :cond_b
    return-void

    :catch_6
    move-exception v2

    move-object v3, v2

    :goto_6
    const/4 v2, 0x0

    .line 25
    :goto_7
    :try_start_b
    throw v3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    :catchall_4
    move-exception v3

    if-eqz v1, :cond_d

    if-eqz v2, :cond_c

    .line 26
    :try_start_c
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->f:Lcom/ss/android/socialbase/downloader/n/vv;

    invoke-virtual {v1, v0}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 27
    :cond_c
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->q:Lcom/ss/android/socialbase/downloader/downloader/k;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/k;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z
    :try_end_c
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_c .. :try_end_c} :catch_7

    goto :goto_8

    :catch_7
    move-exception v0

    .line 28
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteException;->printStackTrace()V

    .line 29
    :cond_d
    :goto_8
    throw v3
.end method

.method private l()Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getChunkCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-gt v0, v2, :cond_1

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v0, v3, v5

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v3

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-nez v0, :cond_0

    return v2

    :cond_0
    return v1

    .line 3
    :cond_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->q:Lcom/ss/android/socialbase/downloader/downloader/k;

    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v3

    invoke-interface {v0, v3}, Lcom/ss/android/socialbase/downloader/downloader/k;->p(I)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 4
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-gt v3, v2, :cond_2

    goto :goto_0

    .line 5
    :cond_2
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ss/android/socialbase/downloader/model/m;

    if-eqz v3, :cond_4

    .line 6
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/m;->wv()Z

    move-result v3

    if-nez v3, :cond_3

    :cond_4
    return v1

    :cond_5
    return v2

    :cond_6
    :goto_0
    return v1
.end method

.method private la()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/qv/p;->d()V

    .line 2
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/qv/p;->g()V

    return-void
.end method

.method private m(Ljava/lang/String;Ljava/util/List;J)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/p;",
            ">;J)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;,
            Lcom/ss/android/socialbase/downloader/exception/wv;
        }
    .end annotation

    .line 11
    iget-object p3, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getChunkCount()I

    move-result p3

    const/4 p4, 0x1

    if-ne p3, p4, :cond_0

    .line 12
    invoke-static {}, Lcom/ss/android/socialbase/downloader/network/vv/vv;->vv()Lcom/ss/android/socialbase/downloader/network/vv/vv;

    move-result-object p3

    invoke-virtual {p3, p1, p2}, Lcom/ss/android/socialbase/downloader/network/vv/vv;->vv(Ljava/lang/String;Ljava/util/List;)Lcom/ss/android/socialbase/downloader/network/vv/p;

    move-result-object p3

    if-eqz p3, :cond_0

    .line 13
    iput-object p3, p0, Lcom/ss/android/socialbase/downloader/qv/p;->ns:Lcom/ss/android/socialbase/downloader/network/n;

    .line 14
    iget-object p3, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p3, p4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setPreconnectLevel(I)V

    .line 15
    :cond_0
    iget-object p3, p0, Lcom/ss/android/socialbase/downloader/qv/p;->ns:Lcom/ss/android/socialbase/downloader/network/n;

    if-nez p3, :cond_2

    iget-boolean p3, p0, Lcom/ss/android/socialbase/downloader/qv/p;->w:Z

    if-nez p3, :cond_2

    iget-object p3, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isHeadConnectionAvailable()Z

    move-result p3

    if-eqz p3, :cond_2

    .line 16
    :try_start_0
    iget-object p3, p0, Lcom/ss/android/socialbase/downloader/qv/p;->f:Lcom/ss/android/socialbase/downloader/n/vv;

    const-string v0, "net_lib_strategy"

    .line 17
    invoke-virtual {p3, v0}, Lcom/ss/android/socialbase/downloader/n/vv;->m(Ljava/lang/String;)I

    move-result p3

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->f:Lcom/ss/android/socialbase/downloader/n/vv;

    const-string v1, "monitor_download_connect"

    const/4 v2, 0x0

    .line 18
    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result v0

    if-lez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p4, 0x0

    :goto_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 19
    invoke-static {p1, p2, p3, p4, v0}, Lcom/ss/android/socialbase/downloader/downloader/p;->vv(Ljava/lang/String;Ljava/util/List;IZLcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/socialbase/downloader/network/n;

    move-result-object p1

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->ns:Lcom/ss/android/socialbase/downloader/network/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 20
    iget-object p2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/wv/u;->k(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setHeadConnectionException(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method private ns()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isChunked()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setTotalBytes(J)V

    .line 3
    :cond_0
    sget-object v0, Lcom/ss/android/socialbase/downloader/qv/p;->vv:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "checkCompletedByteValid: downloadInfo.getCurBytes() = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ",  downloadInfo.getTotalBytes() = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/p/vv;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_2

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isIgnoreDataVerify()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v0

    cmp-long v4, v0, v2

    if-lez v4, :cond_2

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v0

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    return v0

    .line 5
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/m;->m:Lcom/ss/android/socialbase/downloader/constants/m;

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setByteInvalidRetryStatus(Lcom/ss/android/socialbase/downloader/constants/m;)V

    .line 6
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->reset()V

    .line 7
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->q:Lcom/ss/android/socialbase/downloader/downloader/k;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/k;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    .line 8
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->q:Lcom/ss/android/socialbase/downloader/downloader/k;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/k;->i(I)V

    .line 9
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->q:Lcom/ss/android/socialbase/downloader/downloader/k;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/k;->r(I)V

    .line 10
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/wv/u;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    const/4 v0, 0x0

    return v0
.end method

.method private ot()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/qv/p;->v()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->w()Lcom/ss/android/socialbase/downloader/impls/vv;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 3
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/impls/vv;->jh(I)Z

    :cond_1
    return-void
.end method

.method private pd()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isExpiredRedownload()Z

    move-result v0

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->wv:Z

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 2
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getChunkCount()I

    move-result v0

    if-le v0, v2, :cond_2

    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isChunkDowngradeRetryUsed()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 3
    :cond_1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->k:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->jh:Z

    if-nez v0, :cond_2

    return v2

    :cond_2
    :goto_0
    return v1
.end method

.method private pj()V
    .locals 3

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/qv/p;->vv:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "clearCurrentDownloadData::"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v2, Ljava/lang/Throwable;

    invoke-direct {v2}, Ljava/lang/Throwable;-><init>()V

    invoke-static {v2}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/p/vv;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->q:Lcom/ss/android/socialbase/downloader/downloader/k;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/k;->i(I)V

    .line 3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->q:Lcom/ss/android/socialbase/downloader/downloader/k;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/k;->r(I)V

    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/wv/u;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->wv:Z

    .line 6
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->resetDataForEtagEndure(Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->q:Lcom/ss/android/socialbase/downloader/downloader/k;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/k;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method private q()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(I)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v0

    const-string v1, "reset_retain_retry_times"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->ot:I

    const/4 v2, 0x3

    if-ge v0, v2, :cond_1

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->o:Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isBackUpUrlUsed()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getBackUpUrlRetryCount()I

    move-result v2

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getRetryCount()I

    move-result v2

    :goto_0
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 3
    iget v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->ot:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->ot:I

    :cond_1
    return-void
.end method

.method private qv()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getRetryCount()I

    move-result v0

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurRetryTime()I

    move-result v1

    sub-int/2addr v0, v1

    if-gez v0, :cond_1

    const/4 v0, 0x0

    .line 3
    :cond_1
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->o:Ljava/util/concurrent/atomic/AtomicInteger;

    if-nez v1, :cond_2

    .line 4
    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->o:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void

    .line 5
    :cond_2
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    return-void
.end method

.method private r()V
    .locals 3

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/qv/p;->vv:Ljava/lang/String;

    const-string v1, "finishWithFileExist"

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lcom/ss/android/socialbase/downloader/n/vv;->p()Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v0

    const-string v1, "fix_end_for_file_exist_error"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/n/vv;->m(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/qv;->o:Lcom/ss/android/socialbase/downloader/constants/qv;

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    return-void

    .line 5
    :cond_0
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/qv;->qv:Lcom/ss/android/socialbase/downloader/constants/qv;

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    return-void

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTargetFilePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 7
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/qv;->o:Lcom/ss/android/socialbase/downloader/constants/qv;

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    return-void

    .line 8
    :cond_2
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/qv;->qv:Lcom/ss/android/socialbase/downloader/constants/qv;

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    return-void
.end method

.method private t()Z
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isExpiredRedownload()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getChunkCount()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_8

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getThrottleNetSpeed()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v0, v3, v5

    if-lez v0, :cond_1

    goto :goto_3

    .line 3
    :cond_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(I)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v0

    const-string v3, "segment_config"

    invoke-virtual {v0, v3}, Lcom/ss/android/socialbase/downloader/n/vv;->i(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 4
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/qv/p;->q:Lcom/ss/android/socialbase/downloader/downloader/k;

    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v4

    invoke-interface {v3, v4}, Lcom/ss/android/socialbase/downloader/downloader/k;->t(I)Ljava/util/List;

    move-result-object v3

    .line 5
    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v7

    cmp-long v4, v7, v5

    if-lez v4, :cond_4

    if-eqz v3, :cond_3

    .line 6
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_0

    :cond_2
    if-nez v0, :cond_4

    .line 7
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    goto :goto_1

    :cond_3
    :goto_0
    return v1

    :cond_4
    :goto_1
    if-nez v0, :cond_5

    return v1

    .line 8
    :cond_5
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/u/t;->vv(Lorg/json/JSONObject;)Lcom/ss/android/socialbase/downloader/u/t;

    move-result-object v0

    .line 9
    new-instance v1, Lcom/ss/android/socialbase/downloader/u/b;

    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-direct {v1, v4, v0, p0}, Lcom/ss/android/socialbase/downloader/u/b;-><init>(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/u/t;Lcom/ss/android/socialbase/downloader/qv/u;)V

    iput-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->cq:Lcom/ss/android/socialbase/downloader/u/b;

    .line 10
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/qv/p;->v()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 11
    sget-object v0, Lcom/ss/android/socialbase/downloader/qv/p;->vv:Ljava/lang/String;

    const-string v1, "downloadSegments: is stopped by user"

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/p/vv;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/qv;->p:Lcom/ss/android/socialbase/downloader/constants/qv;

    if-ne v0, v1, :cond_6

    .line 13
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->cq:Lcom/ss/android/socialbase/downloader/u/b;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/u/b;->vv()V

    goto :goto_2

    .line 14
    :cond_6
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->cq:Lcom/ss/android/socialbase/downloader/u/b;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/u/b;->m()V

    :goto_2
    return v2

    .line 15
    :cond_7
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->cq:Lcom/ss/android/socialbase/downloader/u/b;

    invoke-virtual {v0, v3}, Lcom/ss/android/socialbase/downloader/u/b;->vv(Ljava/util/List;)Z

    move-result v0

    return v0

    :cond_8
    :goto_3
    return v1
.end method

.method private td()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/wv;,
            Lcom/ss/android/socialbase/downloader/exception/BaseException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/downloader/p;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)I

    move-result v1

    .line 3
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isDownloaded()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isExpiredRedownload()Z

    move-result v2

    if-nez v2, :cond_1

    iget-boolean v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->c:Z

    if-eqz v2, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const/16 v1, 0x3f1

    const-string v2, "file has downloaded"

    invoke-direct {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 5
    :cond_1
    :goto_0
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->q:Lcom/ss/android/socialbase/downloader/downloader/k;

    invoke-interface {v2, v1}, Lcom/ss/android/socialbase/downloader/downloader/k;->m(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 6
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->w()Lcom/ss/android/socialbase/downloader/impls/vv;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 7
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v4

    if-eq v4, v0, :cond_4

    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2, v4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->equalsTask(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 8
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/ss/android/socialbase/downloader/impls/vv;->vv(I)Z

    move-result v3

    if-nez v3, :cond_3

    .line 9
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/qv/p;->q:Lcom/ss/android/socialbase/downloader/downloader/k;

    invoke-interface {v3, v1}, Lcom/ss/android/socialbase/downloader/downloader/k;->p(I)Ljava/util/List;

    move-result-object v3

    .line 10
    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-static {v4}, Lcom/ss/android/socialbase/downloader/wv/u;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 11
    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/qv/p;->q:Lcom/ss/android/socialbase/downloader/downloader/k;

    invoke-interface {v4, v1}, Lcom/ss/android/socialbase/downloader/downloader/k;->u(I)Z

    .line 12
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isBreakpointAvailable()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 13
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->copyFromCacheData(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Z)V

    .line 14
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->q:Lcom/ss/android/socialbase/downloader/downloader/k;

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-interface {v1, v2}, Lcom/ss/android/socialbase/downloader/downloader/k;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    if-eqz v3, :cond_2

    .line 15
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ss/android/socialbase/downloader/model/m;

    .line 16
    invoke-virtual {v2, v0}, Lcom/ss/android/socialbase/downloader/model/m;->m(I)V

    .line 17
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/qv/p;->q:Lcom/ss/android/socialbase/downloader/downloader/k;

    invoke-interface {v3, v2}, Lcom/ss/android/socialbase/downloader/downloader/k;->vv(Lcom/ss/android/socialbase/downloader/model/m;)V

    goto :goto_1

    .line 18
    :cond_2
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/wv;

    const-string v1, "retry task because id generator changed"

    invoke-direct {v0, v1}, Lcom/ss/android/socialbase/downloader/exception/wv;-><init>(Ljava/lang/String;)V

    throw v0

    .line 19
    :cond_3
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->q:Lcom/ss/android/socialbase/downloader/downloader/k;

    invoke-interface {v1, v0}, Lcom/ss/android/socialbase/downloader/downloader/k;->u(I)Z

    .line 20
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const/16 v1, 0x401

    const-string v2, "another same task is downloading"

    invoke-direct {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    throw v0

    :cond_4
    return-void
.end method

.method private v()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/qv/p;->y()Z

    move-result v0

    const/4 v1, -0x2

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v0

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    .line 2
    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/qv/p;->y()Z

    move-result v0

    if-nez v0, :cond_3

    .line 3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v0

    if-ne v0, v1, :cond_2

    .line 4
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/qv;->m:Lcom/ss/android/socialbase/downloader/constants/qv;

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    goto :goto_1

    .line 5
    :cond_2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v0

    const/4 v1, -0x4

    if-ne v0, v1, :cond_3

    .line 6
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/qv;->p:Lcom/ss/android/socialbase/downloader/constants/qv;

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    :cond_3
    :goto_1
    const/4 v0, 0x1

    return v0
.end method

.method private vu()V
    .locals 1

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/qv;->vv:Lcom/ss/android/socialbase/downloader/constants/qv;

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    return-void
.end method

.method private vv(JLjava/util/List;)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/m;",
            ">;)I"
        }
    .end annotation

    .line 16
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/qv/p;->pd()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    .line 17
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->wv:Z

    if-eqz v0, :cond_1

    if-eqz p3, :cond_0

    .line 18
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p3

    goto :goto_1

    .line 19
    :cond_0
    iget-object p3, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getChunkCount()I

    move-result p3

    goto :goto_1

    .line 20
    :cond_1
    iget-object p3, p0, Lcom/ss/android/socialbase/downloader/qv/p;->d:Lcom/ss/android/socialbase/downloader/downloader/qv;

    if-eqz p3, :cond_2

    .line 21
    invoke-interface {p3, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/qv;->vv(J)I

    move-result p3

    goto :goto_0

    .line 22
    :cond_2
    iget-object p3, p0, Lcom/ss/android/socialbase/downloader/qv/p;->g:Lcom/ss/android/socialbase/downloader/downloader/qv;

    invoke-interface {p3, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/qv;->vv(J)I

    move-result p3

    .line 23
    :goto_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/network/b;->vv()Lcom/ss/android/socialbase/downloader/network/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/network/b;->m()Lcom/ss/android/socialbase/downloader/network/jh;

    move-result-object v0

    .line 24
    sget-object v3, Lcom/ss/android/socialbase/downloader/qv/p;->vv:Ljava/lang/String;

    new-array v4, v2, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v1

    const-string v5, "NetworkQuality is : %s"

    invoke-static {v5, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setNetworkQuality(Ljava/lang/String;)V

    .line 26
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/qv/p;->la:Lcom/ss/android/socialbase/downloader/downloader/n;

    if-eqz v3, :cond_3

    .line 27
    invoke-interface {v3, p3, v0}, Lcom/ss/android/socialbase/downloader/downloader/n;->vv(ILcom/ss/android/socialbase/downloader/network/jh;)I

    move-result p3

    goto :goto_1

    .line 28
    :cond_3
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/qv/p;->x:Lcom/ss/android/socialbase/downloader/downloader/n;

    invoke-interface {v3, p3, v0}, Lcom/ss/android/socialbase/downloader/downloader/n;->vv(ILcom/ss/android/socialbase/downloader/network/jh;)I

    move-result p3

    :goto_1
    if-gtz p3, :cond_5

    :cond_4
    const/4 p3, 0x1

    .line 29
    :cond_5
    invoke-static {}, Lcom/ss/android/socialbase/downloader/p/vv;->vv()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 30
    sget-object v0, Lcom/ss/android/socialbase/downloader/qv/p;->vv:Ljava/lang/String;

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v1

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getName()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v3, v2

    const/4 v1, 0x2

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v3, v1

    const-string p1, "chunk count : %s for %s contentLen:%s"

    invoke-static {p1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    return p3
.end method

.method private vv(Lcom/ss/android/socialbase/downloader/model/DownloadTask;)Lcom/ss/android/socialbase/downloader/downloader/la;
    .locals 1

    .line 383
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getRetryDelayTimeCalculator()Lcom/ss/android/socialbase/downloader/downloader/la;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 384
    :cond_0
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadTask;->getDownloadInfo()Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 385
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getRetryDelayTimeArray()Ljava/lang/String;

    move-result-object p1

    .line 386
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 387
    new-instance v0, Lcom/ss/android/socialbase/downloader/impls/d;

    invoke-direct {v0, p1}, Lcom/ss/android/socialbase/downloader/impls/d;-><init>(Ljava/lang/String;)V

    return-object v0

    .line 388
    :cond_1
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->jb()Lcom/ss/android/socialbase/downloader/downloader/la;

    move-result-object p1

    return-object p1
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;J)Lcom/ss/android/socialbase/downloader/model/m;
    .locals 3

    .line 67
    new-instance v0, Lcom/ss/android/socialbase/downloader/model/m$vv;

    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v1

    invoke-direct {v0, v1}, Lcom/ss/android/socialbase/downloader/model/m$vv;-><init>(I)V

    const/4 v1, -0x1

    .line 68
    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/m$vv;->vv(I)Lcom/ss/android/socialbase/downloader/model/m$vv;

    move-result-object v0

    const-wide/16 v1, 0x0

    .line 69
    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/model/m$vv;->vv(J)Lcom/ss/android/socialbase/downloader/model/m$vv;

    move-result-object v0

    .line 70
    invoke-virtual {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/model/m$vv;->o(J)Lcom/ss/android/socialbase/downloader/model/m$vv;

    move-result-object v0

    .line 71
    invoke-virtual {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/model/m$vv;->m(J)Lcom/ss/android/socialbase/downloader/model/m$vv;

    move-result-object v0

    .line 72
    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/model/m$vv;->p(J)Lcom/ss/android/socialbase/downloader/model/m$vv;

    move-result-object v0

    .line 73
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v1

    sub-long/2addr v1, p1

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/model/m$vv;->i(J)Lcom/ss/android/socialbase/downloader/model/m$vv;

    move-result-object p0

    .line 74
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/m$vv;->vv()Lcom/ss/android/socialbase/downloader/model/m;

    move-result-object p0

    return-object p0
.end method

.method private vv(Lcom/ss/android/socialbase/downloader/model/m;I)Lcom/ss/android/socialbase/downloader/model/m;
    .locals 8

    .line 365
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/m;->i()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    const/4 v0, 0x1

    .line 366
    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/downloader/model/m;->p(Z)J

    move-result-wide v2

    .line 367
    sget-object v4, Lcom/ss/android/socialbase/downloader/qv/p;->vv:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "reuseChunk retainLen:"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, " chunkIndex:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v4, 0x0

    .line 368
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/m;->u()Z

    move-result v5

    if-nez v5, :cond_1

    sget-wide v5, Lcom/ss/android/socialbase/downloader/constants/o;->u:J

    cmp-long v7, v2, v5

    if-lez v7, :cond_1

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isNeedReuseChunkRunnable()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 369
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getChunkCount()I

    move-result v2

    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v3

    invoke-virtual {p1, v2, v3, v4}, Lcom/ss/android/socialbase/downloader/model/m;->vv(IJ)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 370
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ss/android/socialbase/downloader/model/m;

    .line 371
    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/qv/p;->q:Lcom/ss/android/socialbase/downloader/downloader/k;

    invoke-interface {v4, v3}, Lcom/ss/android/socialbase/downloader/downloader/k;->m(Lcom/ss/android/socialbase/downloader/model/m;)V

    goto :goto_0

    .line 372
    :cond_1
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/m;->u()Z

    move-result v2

    if-eqz v2, :cond_3

    :cond_2
    const/4 v4, 0x1

    :cond_3
    if-eqz v4, :cond_7

    .line 373
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/m;->u()Z

    move-result v2

    if-eqz v2, :cond_7

    const/4 v2, 0x1

    .line 374
    :goto_1
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/m;->n()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_6

    .line 375
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/m;->n()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ss/android/socialbase/downloader/model/m;

    if-eqz v3, :cond_5

    .line 376
    sget-object v4, Lcom/ss/android/socialbase/downloader/qv/p;->vv:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "check can checkUnCompletedChunk -- chunkIndex:"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/m;->la()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, " currentOffset:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/m;->t()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, "  startOffset:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/m;->jh()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, " contentLen:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/m;->d()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 377
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/m;->la()I

    move-result v4

    if-ltz v4, :cond_4

    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/m;->wv()Z

    move-result v4

    if-nez v4, :cond_5

    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/m;->p()Z

    move-result v4

    if-nez v4, :cond_5

    :cond_4
    move-object v1, v3

    goto :goto_2

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_6
    :goto_2
    if-eqz v1, :cond_7

    .line 378
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/m;->t()J

    move-result-wide v2

    .line 379
    sget-object v4, Lcom/ss/android/socialbase/downloader/qv/p;->vv:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "unComplete chunk "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/m;->la()I

    move-result p1

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " curOffset:"

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " reuseChunk chunkIndex:"

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " for subChunk:"

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/m;->la()I

    move-result p1

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 380
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->q:Lcom/ss/android/socialbase/downloader/downloader/k;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/m;->b()I

    move-result v2

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/m;->la()I

    move-result v3

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/m;->m()I

    move-result v4

    invoke-interface {p1, v2, v3, v4, p2}, Lcom/ss/android/socialbase/downloader/downloader/k;->vv(IIII)V

    .line 381
    invoke-virtual {v1, p2}, Lcom/ss/android/socialbase/downloader/model/m;->p(I)V

    .line 382
    invoke-virtual {v1, v0}, Lcom/ss/android/socialbase/downloader/model/m;->vv(Z)V

    :cond_7
    return-object v1
.end method

.method private vv(Lcom/ss/android/socialbase/downloader/model/m;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ss/android/socialbase/downloader/model/m;",
            ")",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/p;",
            ">;"
        }
    .end annotation

    .line 75
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getExtraHeaders()Ljava/util/List;

    move-result-object v0

    .line 76
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->geteTag()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lcom/ss/android/socialbase/downloader/wv/u;->vv(Ljava/util/List;Ljava/lang/String;Lcom/ss/android/socialbase/downloader/model/m;)Ljava/util/List;

    move-result-object p1

    .line 77
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isExpiredRedownload()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getLastModified()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 78
    new-instance v0, Lcom/ss/android/socialbase/downloader/model/p;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getLastModified()Ljava/lang/String;

    move-result-object v1

    const-string v2, "if-modified-since"

    invoke-direct {v0, v2, v1}, Lcom/ss/android/socialbase/downloader/model/p;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 79
    new-instance v0, Lcom/ss/android/socialbase/downloader/model/p;

    const-string v1, "download-tc21-1-15"

    invoke-direct {v0, v1, v1}, Lcom/ss/android/socialbase/downloader/model/p;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 80
    sget-object v0, Lcom/ss/android/socialbase/downloader/qv/p;->vv:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "dcache::add head IF_MODIFIED_SINCE="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getLastModified()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-object p1
.end method

.method private vv(ILjava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/m;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;
        }
    .end annotation

    .line 81
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, p1, :cond_0

    .line 82
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v0

    invoke-direct {p0, p2, v0, v1}, Lcom/ss/android/socialbase/downloader/qv/p;->vv(Ljava/util/List;J)V

    return-void

    .line 83
    :cond_0
    new-instance p1, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const/16 p2, 0x409

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    invoke-direct {p1, p2, v0}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/Throwable;)V

    throw p1
.end method

.method private vv(JI)V
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move/from16 v3, p3

    int-to-long v4, v3

    .line 84
    div-long v4, v1, v4

    .line 85
    iget-object v6, v0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v6

    .line 86
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    move-wide v11, v8

    :goto_0
    if-ge v10, v3, :cond_1

    add-int/lit8 v13, v3, -0x1

    if-ne v10, v13, :cond_0

    move-wide v13, v8

    goto :goto_1

    :cond_0
    add-long v13, v11, v4

    const-wide/16 v15, 0x1

    sub-long/2addr v13, v15

    .line 87
    :goto_1
    new-instance v15, Lcom/ss/android/socialbase/downloader/model/m$vv;

    invoke-direct {v15, v6}, Lcom/ss/android/socialbase/downloader/model/m$vv;-><init>(I)V

    .line 88
    invoke-virtual {v15, v10}, Lcom/ss/android/socialbase/downloader/model/m$vv;->vv(I)Lcom/ss/android/socialbase/downloader/model/m$vv;

    move-result-object v15

    .line 89
    invoke-virtual {v15, v11, v12}, Lcom/ss/android/socialbase/downloader/model/m$vv;->vv(J)Lcom/ss/android/socialbase/downloader/model/m$vv;

    move-result-object v15

    .line 90
    invoke-virtual {v15, v11, v12}, Lcom/ss/android/socialbase/downloader/model/m$vv;->o(J)Lcom/ss/android/socialbase/downloader/model/m$vv;

    move-result-object v15

    .line 91
    invoke-virtual {v15, v11, v12}, Lcom/ss/android/socialbase/downloader/model/m$vv;->m(J)Lcom/ss/android/socialbase/downloader/model/m$vv;

    move-result-object v15

    .line 92
    invoke-virtual {v15, v13, v14}, Lcom/ss/android/socialbase/downloader/model/m$vv;->p(J)Lcom/ss/android/socialbase/downloader/model/m$vv;

    move-result-object v13

    .line 93
    invoke-virtual {v13}, Lcom/ss/android/socialbase/downloader/model/m$vv;->vv()Lcom/ss/android/socialbase/downloader/model/m;

    move-result-object v13

    .line 94
    invoke-interface {v7, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 95
    iget-object v14, v0, Lcom/ss/android/socialbase/downloader/qv/p;->q:Lcom/ss/android/socialbase/downloader/downloader/k;

    invoke-interface {v14, v13}, Lcom/ss/android/socialbase/downloader/downloader/k;->vv(Lcom/ss/android/socialbase/downloader/model/m;)V

    add-long/2addr v11, v4

    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 96
    :cond_1
    iget-object v4, v0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v4, v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setChunkCount(I)V

    .line 97
    iget-object v4, v0, Lcom/ss/android/socialbase/downloader/qv/p;->q:Lcom/ss/android/socialbase/downloader/downloader/k;

    invoke-interface {v4, v6, v3}, Lcom/ss/android/socialbase/downloader/downloader/k;->vv(II)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 98
    invoke-direct {v0, v7, v1, v2}, Lcom/ss/android/socialbase/downloader/qv/p;->vv(Ljava/util/List;J)V

    return-void
.end method

.method private vv(Lcom/ss/android/socialbase/downloader/model/m;Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/wv;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;
        }
    .end annotation

    .line 141
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/m;->t()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-virtual {p1, v0, v1}, Lcom/ss/android/socialbase/downloader/model/m;->vv(J)V

    .line 142
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setChunkCount(I)V

    .line 143
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->q:Lcom/ss/android/socialbase/downloader/downloader/k;

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v2

    invoke-interface {v0, v2, v1}, Lcom/ss/android/socialbase/downloader/downloader/k;->vv(II)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 144
    new-instance v0, Lcom/ss/android/socialbase/downloader/downloader/o;

    iget-object v4, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-object v3, v0

    move-object v5, p2

    move-object v6, p3

    move-object v7, p1

    move-object v8, p0

    invoke-direct/range {v3 .. v8}, Lcom/ss/android/socialbase/downloader/downloader/o;-><init>(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/wv;Lcom/ss/android/socialbase/downloader/model/m;Lcom/ss/android/socialbase/downloader/qv/u;)V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->n:Lcom/ss/android/socialbase/downloader/downloader/o;

    .line 145
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/qv/p;->x()V

    return-void
.end method

.method static synthetic vv(Lcom/ss/android/socialbase/downloader/qv/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/qv/p;->ot()V

    return-void
.end method

.method static synthetic vv(Lcom/ss/android/socialbase/downloader/qv/p;Ljava/util/List;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/qv/p;->vv(Ljava/util/List;)V

    return-void
.end method

.method private vv(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/wv;
        }
    .end annotation

    .line 181
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->q:Lcom/ss/android/socialbase/downloader/downloader/k;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/k;->i(I)V

    .line 182
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->q:Lcom/ss/android/socialbase/downloader/downloader/k;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/k;->r(I)V

    .line 183
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/wv/u;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    const/4 v0, 0x0

    .line 184
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->wv:Z

    .line 185
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->resetDataForEtagEndure(Ljava/lang/String;)V

    .line 186
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->q:Lcom/ss/android/socialbase/downloader/downloader/k;

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-interface {p1, v0}, Lcom/ss/android/socialbase/downloader/downloader/k;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    .line 187
    new-instance p1, Lcom/ss/android/socialbase/downloader/exception/wv;

    invoke-direct {p1, p2}, Lcom/ss/android/socialbase/downloader/exception/wv;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private vv(Ljava/lang/String;Ljava/util/List;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/p;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;,
            Lcom/ss/android/socialbase/downloader/exception/wv;
        }
    .end annotation

    .line 38
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->l:Lcom/ss/android/socialbase/downloader/network/wv;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 39
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getChunkCount()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    .line 40
    invoke-static {}, Lcom/ss/android/socialbase/downloader/network/vv/vv;->vv()Lcom/ss/android/socialbase/downloader/network/vv/vv;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/network/vv/vv;->m(Ljava/lang/String;Ljava/util/List;)Lcom/ss/android/socialbase/downloader/network/vv/i;

    move-result-object v0

    :cond_1
    if-eqz v0, :cond_2

    .line 41
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->l:Lcom/ss/android/socialbase/downloader/network/wv;

    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/qv/p;->vv(Lcom/ss/android/socialbase/downloader/network/n;)V

    .line 42
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    const/4 p2, 0x2

    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setPreconnectLevel(I)V

    .line 43
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->l:Lcom/ss/android/socialbase/downloader/network/wv;

    goto/16 :goto_3

    .line 44
    :cond_2
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isNeedDefaultHttpServiceBackUp()Z

    move-result v3

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 45
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getMaxBytes()I

    move-result v4

    const/4 v6, 0x0

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->f:Lcom/ss/android/socialbase/downloader/n/vv;

    const-string v1, "net_lib_strategy"

    .line 46
    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/n/vv;->m(Ljava/lang/String;)I

    move-result v8

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->f:Lcom/ss/android/socialbase/downloader/n/vv;

    const-string v1, "monitor_download_connect"

    const/4 v5, 0x0

    .line 47
    invoke-virtual {v0, v1, v5}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result v0

    if-lez v0, :cond_3

    const/4 v9, 0x1

    goto :goto_0

    :cond_3
    const/4 v9, 0x0

    :goto_0
    iget-object v10, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-object v5, p1

    move-object v7, p2

    .line 48
    invoke-static/range {v3 .. v10}, Lcom/ss/android/socialbase/downloader/downloader/p;->vv(ZILjava/lang/String;Ljava/lang/String;Ljava/util/List;IZLcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/socialbase/downloader/network/wv;

    move-result-object p1

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->l:Lcom/ss/android/socialbase/downloader/network/wv;
    :try_end_0
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_2

    :catchall_0
    move-exception p1

    .line 49
    :try_start_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isExpiredRedownload()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/wv/u;->n(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {p2}, Lcom/ss/android/socialbase/downloader/wv/u;->p(Ljava/util/List;)Z

    move-result p2

    if-eqz p2, :cond_5

    .line 50
    sget-object p1, Lcom/ss/android/socialbase/downloader/qv/p;->vv:Ljava/lang/String;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "dcache=execepiton responseCode=304 lastModified not changed, use local file.. old cacheControl="

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 51
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCacheControl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 52
    invoke-static {p1, p2}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCacheControl()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/wv/u;->wv(Ljava/lang/String;)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-gtz v2, :cond_4

    .line 54
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result p1

    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(I)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object p1

    const-string p2, "default_304_max_age"

    const/16 v0, 0x12c

    invoke-virtual {p1, p2, v0}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result p1

    int-to-long p1, p1

    .line 55
    :cond_4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    mul-long p1, p1, v3

    add-long/2addr v1, p1

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setCacheExpiredTime(J)V

    .line 56
    new-instance p1, Lcom/ss/android/socialbase/downloader/exception/vv;

    iget-object p2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->a:Ljava/lang/String;

    invoke-direct {p1, p2}, Lcom/ss/android/socialbase/downloader/exception/vv;-><init>(Ljava/lang/String;)V

    throw p1

    .line 57
    :cond_5
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/wv/u;->u(Ljava/lang/Throwable;)Z

    move-result p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const-string v0, ""

    if-eqz p2, :cond_6

    :try_start_2
    const-string p1, "http code 416"

    .line 58
    invoke-direct {p0, v0, p1}, Lcom/ss/android/socialbase/downloader/qv/p;->vv(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 59
    :cond_6
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/wv/u;->o(Ljava/lang/Throwable;)Z

    move-result p2

    if-eqz p2, :cond_7

    const-string p1, "http code 412"

    .line 60
    invoke-direct {p0, v0, p1}, Lcom/ss/android/socialbase/downloader/qv/p;->vv(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_7
    const-string p2, "CreateFirstConnection"

    .line 61
    invoke-static {p1, p2}, Lcom/ss/android/socialbase/downloader/wv/u;->vv(Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 62
    :goto_1
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->l:Lcom/ss/android/socialbase/downloader/network/wv;

    :goto_2
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/qv/p;->vv(Lcom/ss/android/socialbase/downloader/network/n;)V

    .line 63
    :goto_3
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->l:Lcom/ss/android/socialbase/downloader/network/wv;

    if-eqz p1, :cond_8

    return-void

    .line 64
    :cond_8
    new-instance p1, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const/16 p2, 0x3fe

    new-instance v0, Ljava/io/IOException;

    const-string v1, "download can\'t continue, firstConnection is null"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2, v0}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/Throwable;)V

    throw p1

    :catch_0
    move-exception p1

    .line 65
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    .line 66
    iget-object p2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->l:Lcom/ss/android/socialbase/downloader/network/wv;

    invoke-virtual {p0, p2}, Lcom/ss/android/socialbase/downloader/qv/p;->vv(Lcom/ss/android/socialbase/downloader/network/n;)V

    throw p1
.end method

.method private vv(Ljava/lang/String;Ljava/util/List;J)V
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

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;,
            Lcom/ss/android/socialbase/downloader/exception/wv;
        }
    .end annotation

    .line 31
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ss/android/socialbase/downloader/qv/p;->m(Ljava/lang/String;Ljava/util/List;J)V

    .line 32
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->ns:Lcom/ss/android/socialbase/downloader/network/n;

    if-eqz v0, :cond_0

    .line 33
    :try_start_0
    invoke-virtual {p0, p1, v0, p3, p4}, Lcom/ss/android/socialbase/downloader/qv/p;->vv(Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/n;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 v0, 0x1

    .line 34
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->w:Z

    .line 35
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->ns:Lcom/ss/android/socialbase/downloader/network/n;

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->w:Z

    if-eqz v0, :cond_2

    .line 36
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/ss/android/socialbase/downloader/qv/p;->vv(Ljava/lang/String;Ljava/util/List;)V

    .line 37
    iget-object p2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->l:Lcom/ss/android/socialbase/downloader/network/wv;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ss/android/socialbase/downloader/qv/p;->vv(Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/n;J)V

    :cond_2
    return-void
.end method

.method private vv(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_2

    .line 278
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 279
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    sget-object v2, Lcom/ss/android/socialbase/downloader/constants/qv;->n:Lcom/ss/android/socialbase/downloader/constants/qv;

    if-ne v1, v2, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, p1, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setForbiddenBackupUrls(Ljava/util/List;Z)V

    .line 280
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->w()Lcom/ss/android/socialbase/downloader/impls/vv;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 281
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/downloader/impls/vv;->jh(I)Z

    :cond_2
    :goto_1
    return-void
.end method

.method private vv(Ljava/util/List;J)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/m;",
            ">;J)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;
        }
    .end annotation

    .line 99
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ss/android/socialbase/downloader/model/m;

    if-eqz v0, :cond_0

    .line 100
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/m;->j()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_1

    .line 101
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/m;->t()J

    move-result-wide v1

    sub-long v1, p2, v1

    goto :goto_1

    .line 102
    :cond_1
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/m;->j()J

    move-result-wide v1

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/m;->t()J

    move-result-wide v5

    sub-long/2addr v1, v5

    const-wide/16 v5, 0x1

    add-long/2addr v1, v5

    :goto_1
    cmp-long v5, v1, v3

    if-lez v5, :cond_0

    .line 103
    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/model/m;->vv(J)V

    .line 104
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isNeedReuseFirstConnection()Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->l:Lcom/ss/android/socialbase/downloader/network/wv;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isHeadConnectionAvailable()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->w:Z

    if-eqz v1, :cond_4

    .line 105
    :cond_2
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/m;->la()I

    move-result v1

    if-nez v1, :cond_3

    .line 106
    new-instance v1, Lcom/ss/android/socialbase/downloader/qv/m;

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->p:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/qv/p;->l:Lcom/ss/android/socialbase/downloader/network/wv;

    invoke-direct {v1, v0, v2, v3, p0}, Lcom/ss/android/socialbase/downloader/qv/m;-><init>(Lcom/ss/android/socialbase/downloader/model/m;Lcom/ss/android/socialbase/downloader/model/DownloadTask;Lcom/ss/android/socialbase/downloader/network/wv;Lcom/ss/android/socialbase/downloader/qv/u;)V

    .line 107
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->u:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 108
    :cond_3
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/m;->la()I

    move-result v1

    if-lez v1, :cond_0

    .line 109
    new-instance v1, Lcom/ss/android/socialbase/downloader/qv/m;

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->p:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    invoke-direct {v1, v0, v2, p0}, Lcom/ss/android/socialbase/downloader/qv/m;-><init>(Lcom/ss/android/socialbase/downloader/model/m;Lcom/ss/android/socialbase/downloader/model/DownloadTask;Lcom/ss/android/socialbase/downloader/qv/u;)V

    .line 110
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->u:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 111
    :cond_4
    new-instance v1, Lcom/ss/android/socialbase/downloader/qv/m;

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->p:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    invoke-direct {v1, v0, v2, p0}, Lcom/ss/android/socialbase/downloader/qv/m;-><init>(Lcom/ss/android/socialbase/downloader/model/m;Lcom/ss/android/socialbase/downloader/model/DownloadTask;Lcom/ss/android/socialbase/downloader/qv/u;)V

    .line 112
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->u:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    const/16 p1, 0x40

    .line 113
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/wv/vv;->vv(I)Z

    move-result p1

    if-eqz p1, :cond_d

    .line 114
    new-instance p1, Ljava/util/ArrayList;

    iget-object p2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->u:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 115
    iget-object p2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->u:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_8

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ss/android/socialbase/downloader/qv/m;

    .line 116
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/qv;->p:Lcom/ss/android/socialbase/downloader/constants/qv;

    if-ne v0, v1, :cond_6

    .line 117
    invoke-virtual {p3}, Lcom/ss/android/socialbase/downloader/qv/m;->m()V

    goto :goto_2

    .line 118
    :cond_6
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/qv;->m:Lcom/ss/android/socialbase/downloader/constants/qv;

    if-ne v0, v1, :cond_7

    .line 119
    invoke-virtual {p3}, Lcom/ss/android/socialbase/downloader/qv/m;->vv()V

    goto :goto_2

    .line 120
    :cond_7
    invoke-interface {p1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_8
    const/4 p2, 0x0

    .line 121
    invoke-interface {p1, p2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Runnable;

    .line 122
    :try_start_0
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/impls/o;->i(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    :goto_3
    if-eqz p2, :cond_a

    .line 123
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/qv/p;->v()Z

    move-result p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-eqz p3, :cond_9

    return-void

    .line 124
    :cond_9
    :try_start_1
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception p2

    .line 125
    :try_start_2
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 126
    :goto_4
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/impls/o;->o(Ljava/util/List;)Ljava/lang/Runnable;

    move-result-object p2

    goto :goto_3

    :cond_a
    if-eqz p1, :cond_c

    .line 127
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_c

    .line 128
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :catchall_1
    :cond_b
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/concurrent/Future;

    if-eqz p2, :cond_b

    .line 129
    invoke-interface {p2}, Ljava/util/concurrent/Future;->isDone()Z

    move-result p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-nez p3, :cond_b

    .line 130
    :try_start_3
    invoke-interface {p2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_5

    :catchall_2
    :cond_c
    return-void

    .line 131
    :cond_d
    new-instance p1, Ljava/util/ArrayList;

    iget-object p2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->u:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 132
    iget-object p2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->u:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_10

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ss/android/socialbase/downloader/qv/m;

    .line 133
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/qv;->p:Lcom/ss/android/socialbase/downloader/constants/qv;

    if-ne v0, v1, :cond_e

    .line 134
    invoke-virtual {p3}, Lcom/ss/android/socialbase/downloader/qv/m;->m()V

    goto :goto_6

    .line 135
    :cond_e
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/qv;->m:Lcom/ss/android/socialbase/downloader/constants/qv;

    if-ne v0, v1, :cond_f

    .line 136
    invoke-virtual {p3}, Lcom/ss/android/socialbase/downloader/qv/m;->vv()V

    goto :goto_6

    .line 137
    :cond_f
    invoke-static {p3}, Ljava/util/concurrent/Executors;->callable(Ljava/lang/Runnable;)Ljava/util/concurrent/Callable;

    move-result-object p3

    invoke-interface {p1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 138
    :cond_10
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/qv/p;->v()Z

    move-result p2

    if-eqz p2, :cond_11

    return-void

    .line 139
    :cond_11
    :try_start_4
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/impls/o;->p(Ljava/util/List;)V
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 140
    new-instance p2, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const/16 p3, 0x3fc

    invoke-direct {p2, p3, p1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/Throwable;)V

    goto :goto_8

    :goto_7
    throw p2

    :goto_8
    goto :goto_7
.end method

.method private vv(ILjava/lang/String;Ljava/lang/String;)Z
    .locals 3

    const/4 v0, 0x1

    const/16 v1, 0x19c

    if-ne p1, v1, :cond_0

    return v0

    .line 179
    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    iget-boolean p2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->b:Z

    if-nez p2, :cond_1

    iget-boolean p2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->k:Z

    if-eqz p2, :cond_2

    :cond_1
    return v0

    :cond_2
    const/16 p2, 0xc9

    if-eq p1, p2, :cond_3

    const/16 p2, 0x1a0

    if-ne p1, p2, :cond_4

    .line 180
    :cond_3
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide p1

    const-wide/16 v1, 0x0

    cmp-long p3, p1, v1

    if-lez p3, :cond_4

    return v0

    :cond_4
    const/4 p1, 0x0

    return p1
.end method

.method private w()V
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;
        }
    .end annotation

    move-object/from16 v0, p0

    const-wide/16 v1, 0x0

    .line 1
    :try_start_0
    iget-object v3, v0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTempPath()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/ss/android/socialbase/downloader/wv/u;->i(Ljava/lang/String;)J

    move-result-wide v3
    :try_end_0
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-wide v3, v1

    .line 2
    :goto_0
    sget-object v5, Lcom/ss/android/socialbase/downloader/qv/p;->vv:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "checkSpaceOverflowInProgress: available = "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v3, v4}, Lcom/ss/android/socialbase/downloader/wv/u;->vv(J)D

    move-result-wide v7

    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v7, "MB"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/ss/android/socialbase/downloader/p/vv;->p(Ljava/lang/String;Ljava/lang/String;)V

    cmp-long v6, v3, v1

    if-lez v6, :cond_1

    .line 3
    iget-object v6, v0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v8

    iget-object v6, v0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v10

    sub-long/2addr v8, v10

    cmp-long v6, v3, v8

    if-gez v6, :cond_1

    .line 4
    iget-object v6, v0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v6

    invoke-static {v6}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(I)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v6

    const/16 v10, 0x64

    const-string v11, "space_fill_min_keep_mb"

    invoke-virtual {v6, v11, v10}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result v6

    if-lez v6, :cond_1

    int-to-long v10, v6

    const-wide/32 v12, 0x100000

    mul-long v10, v10, v12

    sub-long v10, v3, v10

    .line 5
    new-instance v14, Ljava/lang/StringBuilder;

    const-string v15, "checkSpaceOverflowInProgress: minKeep  = "

    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, "MB, canDownload = "

    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    invoke-static {v10, v11}, Lcom/ss/android/socialbase/downloader/wv/u;->vv(J)D

    move-result-wide v12

    invoke-virtual {v14, v12, v13}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 7
    invoke-static {v5, v6}, Lcom/ss/android/socialbase/downloader/p/vv;->p(Ljava/lang/String;Ljava/lang/String;)V

    cmp-long v5, v10, v1

    if-lez v5, :cond_0

    .line 8
    iget-object v1, v0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v1

    const-wide/32 v3, 0x100000

    add-long/2addr v10, v3

    add-long/2addr v1, v10

    iput-wide v1, v0, Lcom/ss/android/socialbase/downloader/qv/p;->zn:J

    return-void

    .line 9
    :cond_0
    iput-wide v1, v0, Lcom/ss/android/socialbase/downloader/qv/p;->zn:J

    .line 10
    new-instance v1, Lcom/ss/android/socialbase/downloader/exception/i;

    invoke-direct {v1, v3, v4, v8, v9}, Lcom/ss/android/socialbase/downloader/exception/i;-><init>(JJ)V

    throw v1

    .line 11
    :cond_1
    iput-wide v1, v0, Lcom/ss/android/socialbase/downloader/qv/p;->zn:J

    return-void
.end method

.method private wv()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    .line 2
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->canSkipStatusHandler()Z

    move-result v2

    if-nez v2, :cond_1

    const/4 v1, -0x2

    if-eq v0, v1, :cond_0

    const/4 v1, -0x4

    if-eq v0, v1, :cond_0

    .line 3
    new-instance v1, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const/16 v2, 0x3e8

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v3, "The download Task can\'t start, because its status is not prepare:"

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/ss/android/socialbase/downloader/qv/p;->m(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    return v1
.end method

.method private x()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->n:Lcom/ss/android/socialbase/downloader/downloader/o;

    if-eqz v0, :cond_2

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/qv;->p:Lcom/ss/android/socialbase/downloader/constants/qv;

    if-ne v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    const/4 v1, -0x4

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setStatus(I)V

    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->n:Lcom/ss/android/socialbase/downloader/downloader/o;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/downloader/o;->p()V

    return-void

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/qv;->m:Lcom/ss/android/socialbase/downloader/constants/qv;

    if-ne v0, v1, :cond_1

    .line 6
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    const/4 v1, -0x2

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setStatus(I)V

    .line 7
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->n:Lcom/ss/android/socialbase/downloader/downloader/o;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/downloader/o;->m()V

    return-void

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->n:Lcom/ss/android/socialbase/downloader/downloader/o;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/downloader/o;->i()V

    :cond_2
    return-void
.end method

.method private y()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/qv;->p:Lcom/ss/android/socialbase/downloader/constants/qv;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/qv;->m:Lcom/ss/android/socialbase/downloader/constants/qv;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method private ya()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/qv;->i:Lcom/ss/android/socialbase/downloader/constants/qv;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->v:Lcom/ss/android/socialbase/downloader/downloader/u;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->ya:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/u;->vv(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    goto/16 :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/qv;->p:Lcom/ss/android/socialbase/downloader/constants/qv;

    if-ne v0, v1, :cond_1

    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->v:Lcom/ss/android/socialbase/downloader/downloader/u;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/downloader/u;->p()V

    goto/16 :goto_0

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/qv;->m:Lcom/ss/android/socialbase/downloader/constants/qv;

    if-ne v0, v1, :cond_2

    .line 6
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->v:Lcom/ss/android/socialbase/downloader/downloader/u;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/downloader/u;->i()V

    goto/16 :goto_0

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/qv;->o:Lcom/ss/android/socialbase/downloader/constants/qv;

    if-ne v0, v1, :cond_3

    .line 8
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->v:Lcom/ss/android/socialbase/downloader/downloader/u;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/downloader/u;->n()V
    :try_end_0
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    move-exception v0

    .line 9
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->v:Lcom/ss/android/socialbase/downloader/downloader/u;

    invoke-virtual {v1, v0}, Lcom/ss/android/socialbase/downloader/downloader/u;->vv(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    goto :goto_0

    .line 10
    :cond_3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/qv;->qv:Lcom/ss/android/socialbase/downloader/constants/qv;

    if-ne v0, v1, :cond_4

    .line 11
    :try_start_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->v:Lcom/ss/android/socialbase/downloader/downloader/u;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/u;->vv(Ljava/lang/String;)V
    :try_end_1
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    .line 12
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->v:Lcom/ss/android/socialbase/downloader/downloader/u;

    invoke-virtual {v1, v0}, Lcom/ss/android/socialbase/downloader/downloader/u;->vv(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    goto :goto_0

    .line 13
    :cond_4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/qv;->wv:Lcom/ss/android/socialbase/downloader/constants/qv;

    const/4 v3, 0x0

    if-ne v0, v1, :cond_5

    .line 14
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->v:Lcom/ss/android/socialbase/downloader/downloader/u;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->ya:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    invoke-virtual {v0, v1, v3}, Lcom/ss/android/socialbase/downloader/downloader/u;->vv(Lcom/ss/android/socialbase/downloader/exception/BaseException;Z)V

    return v3

    .line 15
    :cond_5
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/qv;->n:Lcom/ss/android/socialbase/downloader/constants/qv;

    if-ne v0, v1, :cond_6

    return v2

    .line 16
    :cond_6
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    sget-object v1, Lcom/ss/android/socialbase/downloader/constants/qv;->u:Lcom/ss/android/socialbase/downloader/constants/qv;

    if-ne v0, v1, :cond_8

    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/qv/p;->l()Z

    move-result v0

    if-nez v0, :cond_8

    .line 17
    sget-object v0, Lcom/ss/android/socialbase/downloader/qv/p;->vv:Ljava/lang/String;

    const-string v4, "doTaskStatusHandle retryDelay"

    invoke-static {v0, v4}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/qv/p;->vu()V

    .line 19
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    if-ne v0, v1, :cond_7

    return v2

    :cond_7
    return v3

    .line 20
    :cond_8
    :try_start_2
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/qv/p;->ns()Z

    move-result v0

    if-nez v0, :cond_9

    return v3

    .line 21
    :cond_9
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->v:Lcom/ss/android/socialbase/downloader/downloader/u;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/downloader/u;->u()V

    .line 22
    invoke-static {}, Lcom/ss/android/socialbase/downloader/impls/g;->vv()Lcom/ss/android/socialbase/downloader/impls/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/impls/g;->i()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 23
    new-instance v1, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const/16 v3, 0x3f0

    const-string v4, "doTaskStatusHandle onComplete"

    invoke-static {v0, v4}, Lcom/ss/android/socialbase/downloader/wv/u;->m(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v3, v0}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/ss/android/socialbase/downloader/qv/p;->m(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    :goto_0
    return v2
.end method

.method private zn()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/wv/u;->u(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)J

    move-result-wide v0

    .line 2
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 3
    sget-object v4, Lcom/ss/android/socialbase/downloader/qv/p;->vv:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "checkTaskCanResume: offset = "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, ", curBytes = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2}, Lcom/ss/android/socialbase/downloader/p/vv;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    :cond_0
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2, v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setCurBytes(J)V

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 5
    :goto_0
    iput-boolean v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->wv:Z

    if-nez v0, :cond_2

    .line 6
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->c:Z

    if-nez v0, :cond_2

    .line 7
    sget-object v0, Lcom/ss/android/socialbase/downloader/qv/p;->vv:Ljava/lang/String;

    const-string v1, "checkTaskCanResume: deleteAllDownloadFiles"

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/p/vv;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->q:Lcom/ss/android/socialbase/downloader/downloader/k;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/k;->i(I)V

    .line 9
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->q:Lcom/ss/android/socialbase/downloader/downloader/k;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/k;->r(I)V

    .line 10
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/wv/u;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public i()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->r:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public m()V
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/qv;->p:Lcom/ss/android/socialbase/downloader/constants/qv;

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    .line 2
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->cq:Lcom/ss/android/socialbase/downloader/u/b;

    if-eqz v1, :cond_0

    .line 3
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->cq:Lcom/ss/android/socialbase/downloader/u/b;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/u/b;->vv()V

    .line 4
    :cond_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->n:Lcom/ss/android/socialbase/downloader/downloader/o;

    if-eqz v1, :cond_1

    .line 5
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->n:Lcom/ss/android/socialbase/downloader/downloader/o;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/downloader/o;->p()V

    .line 6
    :cond_1
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->cq:Lcom/ss/android/socialbase/downloader/u/b;

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->n:Lcom/ss/android/socialbase/downloader/downloader/o;

    if-nez v1, :cond_2

    .line 7
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/qv/p;->la()V

    .line 8
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    .line 9
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/qv/p;->j()V

    .line 10
    :cond_2
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/qv/p;->f()V

    return-void
.end method

.method public m(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V
    .locals 3

    .line 25
    sget-object v0, Lcom/ss/android/socialbase/downloader/qv/p;->vv:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onError:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/qv;->i:Lcom/ss/android/socialbase/downloader/constants/qv;

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    .line 27
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->ya:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 28
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/qv/p;->f()V

    return-void
.end method

.method public m(J)Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;
        }
    .end annotation

    .line 21
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->zn:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 22
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->zn:J

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    .line 23
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/qv/p;->w()V

    .line 24
    :cond_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->v:Lcom/ss/android/socialbase/downloader/downloader/u;

    invoke-virtual {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/u;->vv(J)Z

    move-result p1

    return p1
.end method

.method public n()Ljava/util/concurrent/Future;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->m:Ljava/util/concurrent/Future;

    return-object v0
.end method

.method public o()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public p()Lcom/ss/android/socialbase/downloader/model/DownloadTask;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->p:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    return-object v0
.end method

.method public p(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 3
    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setChunkDowngradeRetryUsed(Z)V

    :cond_0
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, p1, v0}, Lcom/ss/android/socialbase/downloader/qv/p;->vv(Lcom/ss/android/socialbase/downloader/exception/BaseException;Z)V

    return-void
.end method

.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->p:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/p;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadTask;I)V

    .line 2
    :try_start_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/network/m;->vv()Lcom/ss/android/socialbase/downloader/network/m;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/network/m;->m()V

    .line 3
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/qv/p;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    invoke-static {}, Lcom/ss/android/socialbase/downloader/network/m;->vv()Lcom/ss/android/socialbase/downloader/network/m;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/network/m;->p()V

    .line 5
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->p:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/p;->m(Lcom/ss/android/socialbase/downloader/model/DownloadTask;I)V

    return-void

    :catchall_0
    move-exception v0

    .line 6
    invoke-static {}, Lcom/ss/android/socialbase/downloader/network/m;->vv()Lcom/ss/android/socialbase/downloader/network/m;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/network/m;->p()V

    throw v0
.end method

.method public u()V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->pj:J

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->v:Lcom/ss/android/socialbase/downloader/downloader/u;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/downloader/u;->vv()V

    return-void
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/exception/BaseException;J)Lcom/ss/android/socialbase/downloader/exception/qv;
    .locals 7

    .line 298
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->ya:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 299
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    neg-long p2, p2

    invoke-virtual {v0, p2, p3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->increaseCurBytes(J)V

    .line 300
    iget-object p2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->q:Lcom/ss/android/socialbase/downloader/downloader/k;

    iget-object p3, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-interface {p2, p3}, Lcom/ss/android/socialbase/downloader/downloader/k;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    .line 301
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/qv/p;->y()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 302
    sget-object p1, Lcom/ss/android/socialbase/downloader/exception/qv;->vv:Lcom/ss/android/socialbase/downloader/exception/qv;

    return-object p1

    :cond_0
    const/4 p2, 0x1

    const/4 p3, 0x0

    if-eqz p1, :cond_3

    .line 303
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;->getErrorCode()I

    move-result v0

    const/16 v1, 0x417

    if-ne v0, v1, :cond_3

    .line 304
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->vu:Lcom/ss/android/socialbase/downloader/depend/ya;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isForbiddenRetryed()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 305
    :cond_1
    new-instance v0, Lcom/ss/android/socialbase/downloader/qv/p$1;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/qv/p$1;-><init>(Lcom/ss/android/socialbase/downloader/qv/p;)V

    .line 306
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->vu:Lcom/ss/android/socialbase/downloader/depend/ya;

    invoke-interface {v1, v0}, Lcom/ss/android/socialbase/downloader/depend/ya;->vv(Lcom/ss/android/socialbase/downloader/depend/v;)Z

    move-result v1

    .line 307
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setForbiddenRetryed()V

    if-eqz v1, :cond_d

    .line 308
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/depend/m;->vv()Z

    move-result v0

    if-nez v0, :cond_9

    .line 309
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/qv/p;->f()V

    .line 310
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->v:Lcom/ss/android/socialbase/downloader/downloader/u;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/downloader/u;->qv()V

    .line 311
    sget-object p1, Lcom/ss/android/socialbase/downloader/constants/qv;->n:Lcom/ss/android/socialbase/downloader/constants/qv;

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    .line 312
    sget-object p1, Lcom/ss/android/socialbase/downloader/exception/qv;->vv:Lcom/ss/android/socialbase/downloader/exception/qv;

    return-object p1

    .line 313
    :cond_2
    :goto_0
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/qv/p;->i(Lcom/ss/android/socialbase/downloader/exception/BaseException;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 314
    sget-object p1, Lcom/ss/android/socialbase/downloader/exception/qv;->vv:Lcom/ss/android/socialbase/downloader/exception/qv;

    return-object p1

    .line 315
    :cond_3
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/wv/u;->qv(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 316
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->ff:Lcom/ss/android/socialbase/downloader/depend/g;

    if-nez v0, :cond_4

    .line 317
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/qv/p;->m(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    .line 318
    sget-object p1, Lcom/ss/android/socialbase/downloader/exception/qv;->vv:Lcom/ss/android/socialbase/downloader/exception/qv;

    return-object p1

    .line 319
    :cond_4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 320
    new-instance v6, Lcom/ss/android/socialbase/downloader/qv/p$2;

    invoke-direct {v6, p0, v0}, Lcom/ss/android/socialbase/downloader/qv/p$2;-><init>(Lcom/ss/android/socialbase/downloader/qv/p;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 321
    instance-of v1, p1, Lcom/ss/android/socialbase/downloader/exception/i;

    if-eqz v1, :cond_5

    .line 322
    move-object v1, p1

    check-cast v1, Lcom/ss/android/socialbase/downloader/exception/i;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/exception/i;->vv()J

    move-result-wide v2

    .line 323
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/exception/i;->m()J

    move-result-wide v4

    goto :goto_1

    :cond_5
    const-wide/16 v1, -0x1

    .line 324
    iget-object v3, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v3

    move-wide v4, v3

    move-wide v2, v1

    .line 325
    :goto_1
    monitor-enter p0

    .line 326
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->ff:Lcom/ss/android/socialbase/downloader/depend/g;

    invoke-interface/range {v1 .. v6}, Lcom/ss/android/socialbase/downloader/depend/g;->vv(JJLcom/ss/android/socialbase/downloader/depend/d;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 327
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v1

    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(I)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v1

    const-string v2, "not_delete_when_clean_space"

    invoke-virtual {v1, v2, p3}, Lcom/ss/android/socialbase/downloader/n/vv;->m(Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_6

    .line 328
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/qv/p;->ns()Z

    .line 329
    :cond_6
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_8

    .line 330
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    sget-object p2, Lcom/ss/android/socialbase/downloader/constants/qv;->n:Lcom/ss/android/socialbase/downloader/constants/qv;

    if-eq p1, p2, :cond_7

    .line 331
    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    .line 332
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/qv/p;->f()V

    .line 333
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->v:Lcom/ss/android/socialbase/downloader/downloader/u;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/downloader/u;->qv()V

    .line 334
    :cond_7
    sget-object p1, Lcom/ss/android/socialbase/downloader/exception/qv;->vv:Lcom/ss/android/socialbase/downloader/exception/qv;

    monitor-exit p0

    return-object p1

    .line 335
    :cond_8
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 336
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/qv/p;->i(Lcom/ss/android/socialbase/downloader/exception/BaseException;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 337
    sget-object p1, Lcom/ss/android/socialbase/downloader/exception/qv;->vv:Lcom/ss/android/socialbase/downloader/exception/qv;

    return-object p1

    :cond_9
    const/4 v0, 0x1

    goto :goto_2

    .line 338
    :cond_a
    :try_start_1
    iget-object p2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    sget-object p3, Lcom/ss/android/socialbase/downloader/constants/qv;->n:Lcom/ss/android/socialbase/downloader/constants/qv;

    if-ne p2, p3, :cond_b

    .line 339
    sget-object p1, Lcom/ss/android/socialbase/downloader/exception/qv;->vv:Lcom/ss/android/socialbase/downloader/exception/qv;

    monitor-exit p0

    return-object p1

    .line 340
    :cond_b
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/qv/p;->m(Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    .line 341
    sget-object p1, Lcom/ss/android/socialbase/downloader/exception/qv;->vv:Lcom/ss/android/socialbase/downloader/exception/qv;

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    .line 342
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    .line 343
    :cond_c
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/qv/p;->i(Lcom/ss/android/socialbase/downloader/exception/BaseException;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 344
    sget-object p1, Lcom/ss/android/socialbase/downloader/exception/qv;->vv:Lcom/ss/android/socialbase/downloader/exception/qv;

    return-object p1

    :cond_d
    const/4 v0, 0x0

    :goto_2
    if-nez v0, :cond_e

    .line 345
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/qv/p;->cq()Z

    move-result v0

    if-eqz v0, :cond_e

    .line 346
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/qv/p;->f()V

    .line 347
    :cond_e
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->v:Lcom/ss/android/socialbase/downloader/downloader/u;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    sget-object v2, Lcom/ss/android/socialbase/downloader/constants/qv;->u:Lcom/ss/android/socialbase/downloader/constants/qv;

    if-ne v1, v2, :cond_f

    goto :goto_3

    :cond_f
    const/4 p2, 0x0

    :goto_3
    invoke-virtual {v0, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/u;->vv(Lcom/ss/android/socialbase/downloader/exception/BaseException;Z)V

    .line 348
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    if-ne p1, v2, :cond_10

    sget-object p1, Lcom/ss/android/socialbase/downloader/exception/qv;->vv:Lcom/ss/android/socialbase/downloader/exception/qv;

    return-object p1

    :cond_10
    sget-object p1, Lcom/ss/android/socialbase/downloader/exception/qv;->m:Lcom/ss/android/socialbase/downloader/exception/qv;

    return-object p1
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/model/m;Lcom/ss/android/socialbase/downloader/exception/BaseException;J)Lcom/ss/android/socialbase/downloader/exception/qv;
    .locals 2

    .line 282
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/qv/p;->y()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 283
    sget-object p1, Lcom/ss/android/socialbase/downloader/exception/qv;->vv:Lcom/ss/android/socialbase/downloader/exception/qv;

    return-object p1

    :cond_0
    if-eqz p2, :cond_2

    .line 284
    invoke-virtual {p2}, Lcom/ss/android/socialbase/downloader/exception/BaseException;->getErrorCode()I

    move-result v0

    const/16 v1, 0x417

    if-eq v0, v1, :cond_1

    invoke-static {p2}, Lcom/ss/android/socialbase/downloader/wv/u;->qv(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 285
    :cond_1
    invoke-virtual {p0, p2, p3, p4}, Lcom/ss/android/socialbase/downloader/qv/p;->vv(Lcom/ss/android/socialbase/downloader/exception/BaseException;J)Lcom/ss/android/socialbase/downloader/exception/qv;

    move-result-object p1

    return-object p1

    .line 286
    :cond_2
    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->ya:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 287
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    neg-long p3, p3

    invoke-virtual {v0, p3, p4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->increaseCurBytes(J)V

    .line 288
    iget-object p3, p0, Lcom/ss/android/socialbase/downloader/qv/p;->q:Lcom/ss/android/socialbase/downloader/downloader/k;

    iget-object p4, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-interface {p3, p4}, Lcom/ss/android/socialbase/downloader/downloader/k;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    .line 289
    invoke-direct {p0, p2}, Lcom/ss/android/socialbase/downloader/qv/p;->i(Lcom/ss/android/socialbase/downloader/exception/BaseException;)Z

    move-result p3

    if-eqz p3, :cond_3

    .line 290
    sget-object p1, Lcom/ss/android/socialbase/downloader/exception/qv;->vv:Lcom/ss/android/socialbase/downloader/exception/qv;

    return-object p1

    .line 291
    :cond_3
    iget-object p3, p0, Lcom/ss/android/socialbase/downloader/qv/p;->v:Lcom/ss/android/socialbase/downloader/downloader/u;

    iget-object p4, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/qv;->u:Lcom/ss/android/socialbase/downloader/constants/qv;

    if-ne p4, v0, :cond_4

    const/4 p4, 0x1

    goto :goto_0

    :cond_4
    const/4 p4, 0x0

    :goto_0
    invoke-virtual {p3, p1, p2, p4}, Lcom/ss/android/socialbase/downloader/downloader/u;->vv(Lcom/ss/android/socialbase/downloader/model/m;Lcom/ss/android/socialbase/downloader/exception/BaseException;Z)V

    .line 292
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    if-eq p1, v0, :cond_5

    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isNeedRetryDelay()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 293
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/qv/p;->ff()J

    move-result-wide p1

    const-wide/16 p3, 0x0

    cmp-long v0, p1, p3

    if-lez v0, :cond_5

    .line 294
    sget-object p3, Lcom/ss/android/socialbase/downloader/qv/p;->vv:Ljava/lang/String;

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p4

    const-string v0, "onSingleChunkRetry with delay time "

    invoke-virtual {v0, p4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    invoke-static {p3, p4}, Lcom/ss/android/socialbase/downloader/p/vv;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 295
    :try_start_0
    invoke-static {p1, p2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 296
    sget-object p2, Lcom/ss/android/socialbase/downloader/qv/p;->vv:Ljava/lang/String;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "onSingleChunkRetry:"

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/ss/android/socialbase/downloader/p/vv;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 297
    :cond_5
    :goto_1
    sget-object p1, Lcom/ss/android/socialbase/downloader/exception/qv;->m:Lcom/ss/android/socialbase/downloader/exception/qv;

    return-object p1
.end method

.method public declared-synchronized vv(I)Lcom/ss/android/socialbase/downloader/model/m;
    .locals 4

    monitor-enter p0

    .line 349
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getChunkCount()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    .line 350
    monitor-exit p0

    return-object v2

    .line 351
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->q:Lcom/ss/android/socialbase/downloader/downloader/k;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/k;->p(I)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 352
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    .line 353
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_3

    .line 354
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ss/android/socialbase/downloader/model/m;

    if-eqz v3, :cond_2

    .line 355
    invoke-direct {p0, v3, p1}, Lcom/ss/android/socialbase/downloader/qv/p;->vv(Lcom/ss/android/socialbase/downloader/model/m;I)Lcom/ss/android/socialbase/downloader/model/m;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v3, :cond_2

    .line 356
    monitor-exit p0

    return-object v3

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 357
    :cond_3
    monitor-exit p0

    return-object v2

    .line 358
    :cond_4
    :goto_1
    monitor-exit p0

    return-object v2

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_3

    :goto_2
    throw p1

    :goto_3
    goto :goto_2
.end method

.method public vv()V
    .locals 2

    .line 3
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/qv;->m:Lcom/ss/android/socialbase/downloader/constants/qv;

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    .line 4
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->cq:Lcom/ss/android/socialbase/downloader/u/b;

    if-eqz v1, :cond_0

    .line 5
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->cq:Lcom/ss/android/socialbase/downloader/u/b;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/u/b;->m()V

    .line 6
    :cond_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->n:Lcom/ss/android/socialbase/downloader/downloader/o;

    if-eqz v1, :cond_1

    .line 7
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->n:Lcom/ss/android/socialbase/downloader/downloader/o;

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/downloader/o;->m()V

    .line 8
    :cond_1
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->cq:Lcom/ss/android/socialbase/downloader/u/b;

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->n:Lcom/ss/android/socialbase/downloader/downloader/o;

    if-nez v1, :cond_2

    .line 9
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/qv/p;->la()V

    .line 10
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    .line 11
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/qv/p;->j()V

    .line 12
    :cond_2
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->u:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ss/android/socialbase/downloader/qv/m;

    if-eqz v1, :cond_3

    .line 14
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/qv/m;->vv()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_4
    return-void

    :catchall_0
    move-exception v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public vv(J)V
    .locals 23
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;
        }
    .end annotation

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    const-string v0, "MB"

    const-string v4, ", mustSetLength = "

    .line 146
    iget-object v5, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v5}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTempPath()Ljava/lang/String;

    move-result-object v5

    .line 147
    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTempName()Ljava/lang/String;

    move-result-object v6

    .line 148
    invoke-static/range {p1 .. p2}, Lcom/ss/android/socialbase/downloader/wv/u;->m(J)Z

    move-result v7

    if-eqz v7, :cond_0

    return-void

    .line 149
    :cond_0
    iget-object v7, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    const/4 v8, -0x1

    invoke-static {v7, v5, v6, v8}, Lcom/ss/android/socialbase/downloader/wv/u;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/lang/String;Ljava/lang/String;I)Lcom/ss/android/socialbase/downloader/model/o;

    move-result-object v7

    const/4 v8, 0x0

    .line 150
    :try_start_0
    new-instance v10, Ljava/io/File;

    invoke-direct {v10, v5, v6}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v10}, Ljava/io/File;->length()J

    move-result-wide v10

    sub-long v12, v2, v10

    .line 151
    invoke-static {v5}, Lcom/ss/android/socialbase/downloader/wv/u;->i(Ljava/lang/String;)J

    move-result-wide v5

    .line 152
    iget-object v14, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v14}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v14

    invoke-static {v14}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(I)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v14

    const-string v15, "space_fill_part_download"

    .line 153
    invoke-virtual {v14, v15, v8}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result v15
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const-string v8, " 0"

    const-string v16, "="

    const-string v17, "<"

    const-string v9, "availableSpace "

    move-object/from16 v18, v4

    move-wide/from16 v19, v5

    const-wide/16 v4, 0x0

    const/4 v6, 0x1

    if-ne v15, v6, :cond_7

    .line 154
    :try_start_1
    iput-wide v4, v1, Lcom/ss/android/socialbase/downloader/qv/p;->zn:J

    cmp-long v6, v12, v4

    if-gtz v6, :cond_1

    .line 155
    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v12

    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v21

    sub-long v12, v12, v21

    :cond_1
    cmp-long v6, v19, v12

    if-gez v6, :cond_a

    .line 156
    sget-object v6, Lcom/ss/android/socialbase/downloader/qv/p;->vv:Ljava/lang/String;

    new-instance v15, Ljava/lang/StringBuilder;

    const-string v4, "checkSpaceOverflow: contentLength = "

    invoke-direct {v15, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static/range {p1 .. p2}, Lcom/ss/android/socialbase/downloader/wv/u;->vv(J)D

    move-result-wide v4

    invoke-virtual {v15, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v4, "MB, downloaded = "

    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    invoke-static {v10, v11}, Lcom/ss/android/socialbase/downloader/wv/u;->vv(J)D

    move-result-wide v4

    invoke-virtual {v15, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v4, "MB, required = "

    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    invoke-static {v12, v13}, Lcom/ss/android/socialbase/downloader/wv/u;->vv(J)D

    move-result-wide v4

    invoke-virtual {v15, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v4, "MB, available = "

    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    invoke-static/range {v19 .. v20}, Lcom/ss/android/socialbase/downloader/wv/u;->vv(J)D

    move-result-wide v4

    invoke-virtual {v15, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 160
    invoke-static {v6, v4}, Lcom/ss/android/socialbase/downloader/p/vv;->i(Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v4, 0x0

    cmp-long v15, v19, v4

    if-lez v15, :cond_4

    const-string v4, "space_fill_min_keep_mb"

    const/16 v5, 0x64

    .line 161
    invoke-virtual {v14, v4, v5}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result v4

    if-lez v4, :cond_3

    int-to-long v8, v4

    const-wide/32 v14, 0x100000

    mul-long v8, v8, v14

    sub-long v8, v19, v8

    .line 162
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v14, "checkSpaceOverflow: minKeep = "

    invoke-direct {v5, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "MB, canDownload = "

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    invoke-static {v8, v9}, Lcom/ss/android/socialbase/downloader/wv/u;->vv(J)D

    move-result-wide v14

    invoke-virtual {v5, v14, v15}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 164
    invoke-static {v6, v0}, Lcom/ss/android/socialbase/downloader/p/vv;->i(Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v4, 0x0

    cmp-long v0, v8, v4

    if-lez v0, :cond_2

    .line 165
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v4

    add-long/2addr v4, v8

    iput-wide v4, v1, Lcom/ss/android/socialbase/downloader/qv/p;->zn:J

    move-wide v5, v8

    goto :goto_0

    .line 166
    :cond_2
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/i;

    move-wide/from16 v4, v19

    invoke-direct {v0, v4, v5, v12, v13}, Lcom/ss/android/socialbase/downloader/exception/i;-><init>(JJ)V

    throw v0

    :cond_3
    move-wide/from16 v4, v19

    move-wide v5, v4

    :goto_0
    cmp-long v0, v10, v2

    if-gez v0, :cond_a

    add-long/2addr v5, v10

    cmp-long v0, v5, v2

    if-lez v0, :cond_b

    goto :goto_3

    :cond_4
    move-wide/from16 v4, v19

    const-string v0, "download_when_space_negative"

    const/4 v6, 0x0

    .line 167
    invoke-virtual {v14, v0, v6}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result v0

    const/4 v6, 0x1

    if-ne v0, v6, :cond_5

    move-wide v5, v2

    const/4 v4, 0x0

    goto :goto_4

    .line 168
    :cond_5
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-wide/16 v9, 0x0

    cmp-long v3, v4, v9

    if-nez v3, :cond_6

    move-object/from16 v3, v16

    goto :goto_1

    :cond_6
    move-object/from16 v3, v17

    :goto_1
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x41c

    invoke-direct {v0, v3, v2}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    throw v0

    :cond_7
    move-wide v14, v4

    move-wide/from16 v4, v19

    cmp-long v0, v4, v14

    if-gtz v0, :cond_9

    .line 169
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    cmp-long v3, v4, v14

    if-nez v3, :cond_8

    move-object/from16 v3, v16

    goto :goto_2

    :cond_8
    move-object/from16 v3, v17

    :goto_2
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x41c

    invoke-direct {v0, v3, v2}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :cond_9
    cmp-long v0, v4, v12

    if-ltz v0, :cond_f

    :cond_a
    :goto_3
    move-wide v5, v2

    :cond_b
    const/4 v4, 0x1

    .line 170
    :goto_4
    :try_start_2
    invoke-virtual {v7, v2, v3}, Lcom/ss/android/socialbase/downloader/model/o;->m(J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_5
    const/4 v2, 0x1

    goto :goto_6

    :catchall_0
    move-exception v0

    move-object v8, v0

    .line 171
    :try_start_3
    sget-object v0, Lcom/ss/android/socialbase/downloader/qv/p;->vv:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v12, "checkSpaceOverflow: setLength1 e = "

    invoke-direct {v9, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-object/from16 v12, v18

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v0, v9}, Lcom/ss/android/socialbase/downloader/p/vv;->o(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    const/16 v9, 0x410

    cmp-long v0, v5, v2

    if-gez v0, :cond_d

    const-wide/16 v2, 0x0

    cmp-long v0, v5, v2

    if-lez v0, :cond_d

    cmp-long v0, v5, v10

    if-lez v0, :cond_d

    .line 172
    :try_start_4
    invoke-virtual {v7, v5, v6}, Lcom/ss/android/socialbase/downloader/model/o;->m(J)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception v0

    move-object v2, v0

    .line 173
    :try_start_5
    sget-object v0, Lcom/ss/android/socialbase/downloader/qv/p;->vv:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "checkSpaceOverflow: setLength2 ex = "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/ss/android/socialbase/downloader/p/vv;->o(Ljava/lang/String;Ljava/lang/String;)V

    if-nez v4, :cond_c

    goto :goto_5

    .line 174
    :cond_c
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    invoke-direct {v0, v9, v2}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/Throwable;)V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :cond_d
    if-nez v4, :cond_e

    goto :goto_5

    :goto_6
    new-array v0, v2, [Ljava/io/Closeable;

    const/4 v2, 0x0

    aput-object v7, v0, v2

    .line 175
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/wv/u;->vv([Ljava/io/Closeable;)V

    return-void

    .line 176
    :cond_e
    :try_start_6
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    invoke-direct {v0, v9, v8}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/Throwable;)V

    throw v0

    .line 177
    :cond_f
    new-instance v0, Lcom/ss/android/socialbase/downloader/exception/i;

    invoke-direct {v0, v4, v5, v12, v13}, Lcom/ss/android/socialbase/downloader/exception/i;-><init>(JJ)V

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception v0

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/io/Closeable;

    const/4 v3, 0x0

    aput-object v7, v2, v3

    .line 178
    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/wv/u;->vv([Ljava/io/Closeable;)V

    goto :goto_8

    :goto_7
    throw v0

    :goto_8
    goto :goto_7
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/exception/BaseException;Z)V
    .locals 2

    .line 272
    sget-object v0, Lcom/ss/android/socialbase/downloader/qv/p;->vv:Ljava/lang/String;

    const-string v1, "onAllChunkRetryWithReset"

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 273
    sget-object v0, Lcom/ss/android/socialbase/downloader/constants/qv;->wv:Lcom/ss/android/socialbase/downloader/constants/qv;

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->t:Lcom/ss/android/socialbase/downloader/constants/qv;

    .line 274
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->ya:Lcom/ss/android/socialbase/downloader/exception/BaseException;

    .line 275
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/qv/p;->f()V

    if-eqz p2, :cond_0

    .line 276
    invoke-direct {p0, p1}, Lcom/ss/android/socialbase/downloader/qv/p;->i(Lcom/ss/android/socialbase/downloader/exception/BaseException;)Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    .line 277
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/qv/p;->pj()V

    :cond_1
    return-void
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/network/n;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 359
    :try_start_0
    invoke-interface {p1}, Lcom/ss/android/socialbase/downloader/network/n;->m()I

    move-result p1

    .line 360
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setHttpStatusCode(I)V

    .line 361
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/wv/m;->vv(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setHttpStatusMessage(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 362
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    .line 363
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    const/4 v0, -0x1

    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setHttpStatusCode(I)V

    .line 364
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    const-string v0, ""

    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setHttpStatusMessage(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/qv/m;)V
    .locals 1

    .line 261
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->qv:Z

    if-nez v0, :cond_0

    .line 262
    monitor-enter p0

    .line 263
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->u:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 264
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    return-void
.end method

.method public vv(Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/n;J)V
    .locals 19
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ss/android/socialbase/downloader/exception/BaseException;,
            Lcom/ss/android/socialbase/downloader/exception/wv;
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-wide/from16 v3, p3

    const-string v5, " before="

    const-string v6, " cur="

    const-string v7, "dcache=responseCode="

    if-nez v2, :cond_0

    return-void

    .line 188
    :cond_0
    :try_start_0
    new-instance v8, Lcom/ss/android/socialbase/downloader/model/i;

    move-object/from16 v9, p1

    invoke-direct {v8, v9, v2}, Lcom/ss/android/socialbase/downloader/model/i;-><init>(Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/n;)V

    .line 189
    iget v9, v8, Lcom/ss/android/socialbase/downloader/model/i;->p:I

    .line 190
    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/i;->i()Ljava/lang/String;

    move-result-object v10

    .line 191
    iget-object v11, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v11}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getMimeType()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-eqz v11, :cond_1

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_1

    .line 192
    iget-object v11, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v11, v10}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setMimeType(Ljava/lang/String;)V

    .line 193
    :cond_1
    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/i;->m()Z

    move-result v10

    iput-boolean v10, v1, Lcom/ss/android/socialbase/downloader/qv/p;->k:Z

    .line 194
    iget-object v11, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v11, v10}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setSupportPartial(Z)V

    .line 195
    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/i;->vv()Z

    move-result v10

    iput-boolean v10, v1, Lcom/ss/android/socialbase/downloader/qv/p;->b:Z

    .line 196
    iget-object v10, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v10}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->geteTag()Ljava/lang/String;

    move-result-object v10

    .line 197
    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/i;->p()Ljava/lang/String;

    move-result-object v11

    .line 198
    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/i;->u()Ljava/lang/String;

    move-result-object v12

    .line 199
    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/i;->n()Ljava/lang/String;

    move-result-object v13

    .line 200
    sget-object v14, Lcom/ss/android/socialbase/downloader/qv/p;->vv:Ljava/lang/String;

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " last_modified="

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " CACHE_CONTROL="

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " max-age="

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 p1, v10

    move-object v2, v11

    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/i;->b()J

    move-result-wide v10

    invoke-virtual {v15, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v10, " isDeleteCacheIfCheckFailed="

    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v10, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v10}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isDeleteCacheIfCheckFailed()Z

    move-result v10

    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v14, v10}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "dcache=firstOffset="

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v11, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v11}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getLastModified()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v4, v2

    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/i;->k()J

    move-result-wide v2

    invoke-virtual {v10, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v2

    invoke-virtual {v10, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v14, v2}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    const-wide/16 v5, 0x0

    if-nez v2, :cond_2

    .line 203
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2, v13}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setCacheControl(Ljava/lang/String;)V

    .line 204
    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/i;->b()J

    move-result-wide v2

    cmp-long v10, v2, v5

    if-lez v10, :cond_2

    .line 205
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/i;->b()J

    move-result-wide v15

    const-wide/16 v17, 0x3e8

    mul-long v15, v15, v17

    add-long/2addr v10, v15

    invoke-virtual {v2, v10, v11}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setCacheExpiredTime(J)V

    .line 206
    :cond_2
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isExpiredRedownload()Z

    move-result v2

    if-eqz v2, :cond_7

    iget-boolean v2, v1, Lcom/ss/android/socialbase/downloader/qv/p;->c:Z

    if-eqz v2, :cond_7

    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/qv/p;->a:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_7

    const/16 v2, 0x130

    const/4 v10, 0x0

    if-ne v9, v2, :cond_3

    :goto_0
    const/4 v10, 0x1

    goto :goto_1

    .line 207
    :cond_3
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getLastModified()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isDeleteCacheIfCheckFailed()Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_1

    .line 208
    :cond_4
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getLastModified()Ljava/lang/String;

    move-result-object v2

    invoke-static {v12, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_0

    :cond_5
    :goto_1
    if-nez v10, :cond_6

    .line 209
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/wv/u;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    goto :goto_2

    .line 210
    :cond_6
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " lastModified not changed, use local file  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v14, v2}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    new-instance v2, Lcom/ss/android/socialbase/downloader/exception/vv;

    iget-object v3, v1, Lcom/ss/android/socialbase/downloader/qv/p;->a:Ljava/lang/String;

    invoke-direct {v2, v3}, Lcom/ss/android/socialbase/downloader/exception/vv;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_0
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/ss/android/socialbase/downloader/exception/wv; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_7
    :goto_2
    const-string v2, ""

    cmp-long v7, p3, v5

    if-lez v7, :cond_8

    .line 212
    :try_start_1
    iget-object v7, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v7}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isExpiredRedownload()Z

    move-result v7

    if-eqz v7, :cond_8

    .line 213
    iget-object v7, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v7}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getLastModified()Ljava/lang/String;

    move-result-object v7

    invoke-static {v12, v7}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_8

    const-string v7, "dcache cdn file change, so retry"

    .line 214
    invoke-static {v14, v7}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "cdn file changed"

    .line 215
    invoke-direct {v1, v2, v7}, Lcom/ss/android/socialbase/downloader/qv/p;->vv(Ljava/lang/String;Ljava/lang/String;)V

    .line 216
    :cond_8
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_9

    .line 217
    iget-object v7, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v7, v12}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setLastModified(Ljava/lang/String;)V

    :cond_9
    move-object/from16 v7, p1

    .line 218
    invoke-direct {v1, v9, v7, v4}, Lcom/ss/android/socialbase/downloader/qv/p;->vv(ILjava/lang/String;Ljava/lang/String;)Z

    move-result v10

    const/16 v11, 0x3ea

    if-eqz v10, :cond_c

    move-object/from16 v10, p2

    .line 219
    instance-of v12, v10, Lcom/ss/android/socialbase/downloader/network/wv;

    if-eqz v12, :cond_b

    .line 220
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-nez v12, :cond_a

    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    move-object v4, v2

    :cond_a
    const-string v7, "eTag of server file changed"

    .line 221
    invoke-direct {v1, v4, v7}, Lcom/ss/android/socialbase/downloader/qv/p;->vv(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    .line 222
    :cond_b
    new-instance v3, Lcom/ss/android/socialbase/downloader/exception/m;

    invoke-direct {v3, v11, v9, v2}, Lcom/ss/android/socialbase/downloader/exception/m;-><init>(IILjava/lang/String;)V

    throw v3

    :cond_c
    move-object/from16 v10, p2

    .line 223
    :goto_3
    iget-boolean v7, v1, Lcom/ss/android/socialbase/downloader/qv/p;->k:Z

    const/16 v12, 0x3ec

    if-nez v7, :cond_f

    iget-boolean v7, v1, Lcom/ss/android/socialbase/downloader/qv/p;->b:Z

    if-eqz v7, :cond_d

    goto :goto_4

    :cond_d
    const/16 v2, 0x193

    if-ne v9, v2, :cond_e

    .line 224
    new-instance v2, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const/16 v3, 0x417

    const-string v4, "response code error : 403"

    invoke-direct {v2, v3, v4}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    throw v2

    .line 225
    :cond_e
    new-instance v2, Lcom/ss/android/socialbase/downloader/exception/m;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "response code error : "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v12, v9, v3}, Lcom/ss/android/socialbase/downloader/exception/m;-><init>(IILjava/lang/String;)V

    throw v2

    .line 226
    :cond_f
    :goto_4
    iget-boolean v7, v1, Lcom/ss/android/socialbase/downloader/qv/p;->b:Z

    if-eqz v7, :cond_11

    cmp-long v7, p3, v5

    if-lez v7, :cond_11

    .line 227
    instance-of v7, v10, Lcom/ss/android/socialbase/downloader/network/wv;

    if-eqz v7, :cond_10

    const-string v7, "http head request not support"

    .line 228
    invoke-direct {v1, v2, v7}, Lcom/ss/android/socialbase/downloader/qv/p;->vv(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    .line 229
    :cond_10
    new-instance v2, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const-string v3, "isResponseFromBegin but firstOffset > 0"

    invoke-direct {v2, v12, v3}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    throw v2

    :cond_11
    :goto_5
    move-object v7, v4

    .line 230
    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/i;->qv()J

    move-result-wide v3

    .line 231
    instance-of v13, v10, Lcom/ss/android/socialbase/downloader/network/wv;

    if-nez v13, :cond_13

    cmp-long v13, v3, v5

    if-gez v13, :cond_13

    iget-object v13, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 232
    invoke-static {v13}, Lcom/ss/android/socialbase/downloader/wv/i;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    move-result v13

    if-nez v13, :cond_12

    goto :goto_6

    .line 233
    :cond_12
    new-instance v3, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    invoke-direct {v3, v12, v2}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    throw v3

    .line 234
    :cond_13
    :goto_6
    iget-object v13, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v13}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v13

    if-eqz v13, :cond_14

    .line 235
    iget-object v13, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v13}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getUrl()Ljava/lang/String;

    move-result-object v13

    invoke-static {v10, v13}, Lcom/ss/android/socialbase/downloader/wv/u;->vv(Lcom/ss/android/socialbase/downloader/network/n;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    goto :goto_7

    :cond_14
    move-object v13, v2

    .line 236
    :goto_7
    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/i;->wv()Z

    move-result v8

    iput-boolean v8, v1, Lcom/ss/android/socialbase/downloader/qv/p;->jh:Z

    if-nez v8, :cond_16

    cmp-long v15, v3, v5

    if-nez v15, :cond_16

    .line 237
    instance-of v15, v10, Lcom/ss/android/socialbase/downloader/network/wv;

    if-eqz v15, :cond_15

    goto :goto_8

    .line 238
    :cond_15
    new-instance v3, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    invoke-direct {v3, v12, v2}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    throw v3

    :cond_16
    :goto_8
    if-nez v8, :cond_18

    const-string v8, "Content-Range"

    .line 239
    invoke-static {v10, v8}, Lcom/ss/android/socialbase/downloader/wv/u;->m(Lcom/ss/android/socialbase/downloader/network/n;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 240
    new-instance v12, Ljava/lang/StringBuilder;

    const-string v15, "firstConnection: contentRange = "

    invoke-direct {v12, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v14, v12}, Lcom/ss/android/socialbase/downloader/p/vv;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-nez v12, :cond_17

    iget-object v12, v1, Lcom/ss/android/socialbase/downloader/qv/p;->f:Lcom/ss/android/socialbase/downloader/n/vv;

    const-string v15, "fix_get_total_bytes"

    const/4 v11, 0x1

    invoke-virtual {v12, v15, v11}, Lcom/ss/android/socialbase/downloader/n/vv;->m(Ljava/lang/String;Z)Z

    move-result v12

    if-eqz v12, :cond_17

    .line 242
    invoke-static {v8}, Lcom/ss/android/socialbase/downloader/wv/u;->m(Ljava/lang/String;)J

    move-result-wide v3

    .line 243
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v11, "firstConnection: 1 totalLength = "

    invoke-direct {v8, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v14, v8}, Lcom/ss/android/socialbase/downloader/p/vv;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_9

    :cond_17
    add-long v11, p3, v3

    .line 244
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v15, "firstConnection: 2 totalLength = "

    invoke-direct {v8, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v15, ", contentLength = "

    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v14, v3}, Lcom/ss/android/socialbase/downloader/p/vv;->o(Ljava/lang/String;Ljava/lang/String;)V

    move-wide v3, v11

    goto :goto_9

    :cond_18
    const-wide/16 v3, -0x1

    .line 245
    :goto_9
    iget-object v8, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTaskKey()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_1a

    iget-object v8, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 246
    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v11

    cmp-long v8, v11, v5

    if-lez v8, :cond_1a

    iget-object v8, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 247
    invoke-virtual {v8}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v11

    cmp-long v8, v3, v11

    if-eqz v8, :cond_1a

    .line 248
    instance-of v8, v10, Lcom/ss/android/socialbase/downloader/network/wv;

    if-eqz v8, :cond_19

    const-string v8, "file totalLength changed"

    .line 249
    invoke-direct {v1, v2, v8}, Lcom/ss/android/socialbase/downloader/qv/p;->vv(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_a

    .line 250
    :cond_19
    new-instance v3, Lcom/ss/android/socialbase/downloader/exception/m;

    const/16 v4, 0x3ea

    invoke-direct {v3, v4, v9, v2}, Lcom/ss/android/socialbase/downloader/exception/m;-><init>(IILjava/lang/String;)V

    throw v3

    .line 251
    :cond_1a
    :goto_a
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/qv/p;->v()Z

    move-result v2

    if-eqz v2, :cond_1b

    return-void

    .line 252
    :cond_1b
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getExpectFileLength()J

    move-result-wide v8

    cmp-long v2, v8, v5

    if-lez v2, :cond_1d

    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 253
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v2

    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(I)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v2

    const-string v5, "force_check_file_length"

    invoke-virtual {v2, v5}, Lcom/ss/android/socialbase/downloader/n/vv;->m(Ljava/lang/String;)I

    move-result v2

    const/4 v5, 0x1

    if-ne v2, v5, :cond_1d

    .line 254
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getExpectFileLength()J

    move-result-wide v5

    cmp-long v2, v5, v3

    if-nez v2, :cond_1c

    goto :goto_b

    .line 255
    :cond_1c
    new-instance v2, Lcom/ss/android/socialbase/downloader/exception/BaseException;

    const/16 v5, 0x42e

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "expectFileLength = "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v7, v1, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 256
    invoke-virtual {v7}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getExpectFileLength()J

    move-result-wide v7

    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v7, " , totalLength = "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v5, v3}, Lcom/ss/android/socialbase/downloader/exception/BaseException;-><init>(ILjava/lang/String;)V

    throw v2

    .line 257
    :cond_1d
    :goto_b
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/qv/p;->v:Lcom/ss/android/socialbase/downloader/downloader/u;

    invoke-virtual {v2, v3, v4, v7, v13}, Lcom/ss/android/socialbase/downloader/downloader/u;->vv(JLjava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Lcom/ss/android/socialbase/downloader/exception/BaseException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lcom/ss/android/socialbase/downloader/exception/wv; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    move-object v2, v0

    const-string v3, "HandleFirstConnection"

    .line 258
    invoke-static {v2, v3}, Lcom/ss/android/socialbase/downloader/wv/u;->vv(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void

    :catch_0
    move-exception v0

    move-object v2, v0

    .line 259
    throw v2

    :catch_1
    move-exception v0

    move-object v2, v0

    .line 260
    goto :goto_d

    :goto_c
    throw v2

    :goto_d
    goto :goto_c
.end method

.method public vv(Ljava/util/concurrent/Future;)V
    .locals 0

    .line 389
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->m:Ljava/util/concurrent/Future;

    return-void
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/exception/BaseException;)Z
    .locals 4

    .line 265
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->cq:Lcom/ss/android/socialbase/downloader/u/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/wv/u;->wv(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->o:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getRetryCount()I

    move-result v2

    if-ge v0, v2, :cond_0

    return v1

    .line 266
    :cond_0
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/wv/u;->m(Lcom/ss/android/socialbase/downloader/exception/BaseException;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    .line 267
    iget-boolean p1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->qv:Z

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->i:Z

    if-nez p1, :cond_1

    .line 268
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/wv/u;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 269
    iput-boolean v2, p0, Lcom/ss/android/socialbase/downloader/qv/p;->i:Z

    :cond_1
    return v2

    .line 270
    :cond_2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->o:Ljava/util/concurrent/atomic/AtomicInteger;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-gtz v0, :cond_5

    :cond_3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->hasNextBackupUrl()Z

    move-result v0

    if-nez v0, :cond_5

    if-eqz p1, :cond_6

    .line 271
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;->getErrorCode()I

    move-result v0

    const/16 v3, 0x3f3

    if-eq v0, v3, :cond_4

    invoke-virtual {p1}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz v0, :cond_6

    :cond_4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/qv/p;->j:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->canReplaceHttpForRetry()Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_5
    instance-of p1, p1, Lcom/ss/android/socialbase/downloader/exception/u;

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v1
.end method
