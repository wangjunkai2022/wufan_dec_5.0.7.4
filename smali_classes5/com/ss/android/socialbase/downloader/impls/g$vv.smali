.class Lcom/ss/android/socialbase/downloader/impls/g$vv;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ss/android/socialbase/downloader/impls/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "vv"
.end annotation


# instance fields
.field private b:J

.field final i:I

.field private jh:Z

.field private k:Z

.field final m:I

.field final n:[I

.field final o:I

.field final p:I

.field private qv:I

.field final u:Z

.field final vv:I

.field private wv:I


# direct methods
.method constructor <init>(IIIIIZ[I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xbb8

    if-ge p4, v0, :cond_0

    const/16 p4, 0xbb8

    :cond_0
    const/16 v0, 0x1388

    if-ge p5, v0, :cond_1

    const/16 p5, 0x1388

    .line 2
    :cond_1
    iput p1, p0, Lcom/ss/android/socialbase/downloader/impls/g$vv;->vv:I

    .line 3
    iput p2, p0, Lcom/ss/android/socialbase/downloader/impls/g$vv;->m:I

    .line 4
    iput p3, p0, Lcom/ss/android/socialbase/downloader/impls/g$vv;->p:I

    .line 5
    iput p4, p0, Lcom/ss/android/socialbase/downloader/impls/g$vv;->i:I

    .line 6
    iput p5, p0, Lcom/ss/android/socialbase/downloader/impls/g$vv;->o:I

    .line 7
    iput-boolean p6, p0, Lcom/ss/android/socialbase/downloader/impls/g$vv;->u:Z

    .line 8
    iput-object p7, p0, Lcom/ss/android/socialbase/downloader/impls/g$vv;->n:[I

    .line 9
    iput p4, p0, Lcom/ss/android/socialbase/downloader/impls/g$vv;->qv:I

    return-void
.end method

.method static synthetic m(Lcom/ss/android/socialbase/downloader/impls/g$vv;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/ss/android/socialbase/downloader/impls/g$vv;->jh:Z

    return p0
.end method

.method static synthetic m(Lcom/ss/android/socialbase/downloader/impls/g$vv;Z)Z
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/impls/g$vv;->jh:Z

    return p1
.end method

.method static synthetic vv(Lcom/ss/android/socialbase/downloader/impls/g$vv;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/ss/android/socialbase/downloader/impls/g$vv;->wv:I

    return p0
.end method

.method static synthetic vv(Lcom/ss/android/socialbase/downloader/impls/g$vv;Z)Z
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/ss/android/socialbase/downloader/impls/g$vv;->k:Z

    return p1
.end method


# virtual methods
.method i()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ss/android/socialbase/downloader/impls/g$vv;->qv:I

    return v0
.end method

.method declared-synchronized m()V
    .locals 1

    monitor-enter p0

    .line 3
    :try_start_0
    iget v0, p0, Lcom/ss/android/socialbase/downloader/impls/g$vv;->wv:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/ss/android/socialbase/downloader/impls/g$vv;->wv:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method p()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/ss/android/socialbase/downloader/impls/g$vv;->i:I

    iput v0, p0, Lcom/ss/android/socialbase/downloader/impls/g$vv;->qv:I

    return-void
.end method

.method declared-synchronized vv()V
    .locals 2

    monitor-enter p0

    .line 9
    :try_start_0
    iget v0, p0, Lcom/ss/android/socialbase/downloader/impls/g$vv;->qv:I

    iget v1, p0, Lcom/ss/android/socialbase/downloader/impls/g$vv;->o:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/ss/android/socialbase/downloader/impls/g$vv;->qv:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized vv(J)V
    .locals 0

    monitor-enter p0

    .line 11
    :try_start_0
    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/impls/g$vv;->b:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method vv(JIIZ)Z
    .locals 2

    .line 3
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/impls/g$vv;->jh:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string p1, "RetryScheduler"

    const-string p2, "canRetry: mIsWaitingRetry is false, return false!!!"

    .line 4
    invoke-static {p1, p2}, Lcom/ss/android/socialbase/downloader/p/vv;->p(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    .line 5
    :cond_0
    iget v0, p0, Lcom/ss/android/socialbase/downloader/impls/g$vv;->m:I

    if-ge v0, p3, :cond_1

    return v1

    .line 6
    :cond_1
    iget p3, p0, Lcom/ss/android/socialbase/downloader/impls/g$vv;->wv:I

    iget v0, p0, Lcom/ss/android/socialbase/downloader/impls/g$vv;->p:I

    if-lt p3, v0, :cond_2

    return v1

    .line 7
    :cond_2
    iget-boolean p3, p0, Lcom/ss/android/socialbase/downloader/impls/g$vv;->k:Z

    if-eqz p3, :cond_3

    const/4 p3, 0x2

    if-eq p4, p3, :cond_3

    return v1

    :cond_3
    if-nez p5, :cond_4

    .line 8
    iget-wide p3, p0, Lcom/ss/android/socialbase/downloader/impls/g$vv;->b:J

    sub-long/2addr p1, p3

    iget p3, p0, Lcom/ss/android/socialbase/downloader/impls/g$vv;->i:I

    int-to-long p3, p3

    cmp-long p5, p1, p3

    if-gez p5, :cond_4

    return v1

    :cond_4
    const/4 p1, 0x1

    return p1
.end method
