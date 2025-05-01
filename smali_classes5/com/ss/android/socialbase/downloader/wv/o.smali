.class public Lcom/ss/android/socialbase/downloader/wv/o;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ss/android/socialbase/downloader/wv/o$vv;
    }
.end annotation


# instance fields
.field private i:I

.field private m:Lcom/ss/android/socialbase/downloader/wv/o$vv;

.field private p:I

.field private vv:Lcom/ss/android/socialbase/downloader/wv/o$vv;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xa

    .line 2
    iput v0, p0, Lcom/ss/android/socialbase/downloader/wv/o;->i:I

    return-void
.end method

.method private vv()Lcom/ss/android/socialbase/downloader/wv/o$vv;
    .locals 3

    .line 18
    iget v0, p0, Lcom/ss/android/socialbase/downloader/wv/o;->p:I

    iget v1, p0, Lcom/ss/android/socialbase/downloader/wv/o;->i:I

    const/4 v2, 0x0

    if-lt v0, v1, :cond_1

    .line 19
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/wv/o;->m:Lcom/ss/android/socialbase/downloader/wv/o$vv;

    if-eqz v1, :cond_1

    .line 20
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/wv/o$vv;->i:Lcom/ss/android/socialbase/downloader/wv/o$vv;

    .line 21
    iput-object v2, v1, Lcom/ss/android/socialbase/downloader/wv/o$vv;->i:Lcom/ss/android/socialbase/downloader/wv/o$vv;

    .line 22
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/wv/o;->m:Lcom/ss/android/socialbase/downloader/wv/o$vv;

    if-eqz v0, :cond_0

    .line 23
    iput-object v2, v0, Lcom/ss/android/socialbase/downloader/wv/o$vv;->p:Lcom/ss/android/socialbase/downloader/wv/o$vv;

    :cond_0
    return-object v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 24
    iput v0, p0, Lcom/ss/android/socialbase/downloader/wv/o;->p:I

    .line 25
    new-instance v0, Lcom/ss/android/socialbase/downloader/wv/o$vv;

    invoke-direct {v0, v2}, Lcom/ss/android/socialbase/downloader/wv/o$vv;-><init>(Lcom/ss/android/socialbase/downloader/wv/o$1;)V

    return-object v0
.end method

.method private vv(J)Lcom/ss/android/socialbase/downloader/wv/o$vv;
    .locals 7

    .line 26
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/wv/o;->vv:Lcom/ss/android/socialbase/downloader/wv/o$vv;

    const/4 v1, 0x0

    :goto_0
    if-eqz v0, :cond_0

    .line 27
    iget-wide v2, v0, Lcom/ss/android/socialbase/downloader/wv/o$vv;->m:J

    cmp-long v4, v2, p1

    if-lez v4, :cond_0

    .line 28
    iget-object v1, v0, Lcom/ss/android/socialbase/downloader/wv/o$vv;->p:Lcom/ss/android/socialbase/downloader/wv/o$vv;

    move-object v6, v1

    move-object v1, v0

    move-object v0, v6

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    if-eq v0, v1, :cond_1

    .line 29
    iget-wide v2, v0, Lcom/ss/android/socialbase/downloader/wv/o$vv;->m:J

    sub-long v2, p1, v2

    iget-wide v4, v1, Lcom/ss/android/socialbase/downloader/wv/o$vv;->m:J

    sub-long/2addr v4, p1

    cmp-long p1, v2, v4

    if-gez p1, :cond_1

    return-object v0

    :cond_1
    return-object v1
.end method


# virtual methods
.method public m(JJ)J
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/wv/o;->vv:Lcom/ss/android/socialbase/downloader/wv/o$vv;

    const-wide/16 v1, -0x1

    if-nez v0, :cond_0

    .line 3
    monitor-exit p0

    return-wide v1

    .line 4
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/ss/android/socialbase/downloader/wv/o;->vv(J)Lcom/ss/android/socialbase/downloader/wv/o$vv;

    move-result-object p1

    if-nez p1, :cond_1

    .line 5
    monitor-exit p0

    return-wide v1

    .line 6
    :cond_1
    iget-wide v3, v0, Lcom/ss/android/socialbase/downloader/wv/o$vv;->vv:J

    iget-wide v5, p1, Lcom/ss/android/socialbase/downloader/wv/o$vv;->vv:J

    sub-long/2addr v3, v5

    .line 7
    iget-wide p1, p1, Lcom/ss/android/socialbase/downloader/wv/o$vv;->m:J

    sub-long/2addr p3, p1

    const-wide/16 p1, 0x0

    cmp-long v0, v3, p1

    if-ltz v0, :cond_2

    cmp-long v0, p3, p1

    if-lez v0, :cond_2

    .line 8
    div-long/2addr v3, p3

    monitor-exit p0

    return-wide v3

    .line 9
    :cond_2
    monitor-exit p0

    return-wide v1

    :catchall_0
    move-exception p1

    .line 10
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public vv(JJ)Z
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/wv/o;->vv:Lcom/ss/android/socialbase/downloader/wv/o$vv;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    .line 3
    iget-wide v2, v0, Lcom/ss/android/socialbase/downloader/wv/o$vv;->vv:J

    cmp-long v4, p1, v2

    if-ltz v4, :cond_1

    iget-wide v2, v0, Lcom/ss/android/socialbase/downloader/wv/o$vv;->m:J

    cmp-long v4, p3, v2

    if-gez v4, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iget-object v2, v0, Lcom/ss/android/socialbase/downloader/wv/o$vv;->p:Lcom/ss/android/socialbase/downloader/wv/o$vv;

    if-eqz v2, :cond_2

    .line 5
    iget-wide v2, v2, Lcom/ss/android/socialbase/downloader/wv/o$vv;->m:J

    sub-long v2, p3, v2

    const-wide/16 v4, 0x3e8

    cmp-long v6, v2, v4

    if-gez v6, :cond_2

    .line 6
    iput-wide p1, v0, Lcom/ss/android/socialbase/downloader/wv/o$vv;->vv:J

    .line 7
    iput-wide p3, v0, Lcom/ss/android/socialbase/downloader/wv/o$vv;->m:J

    .line 8
    monitor-exit p0

    return v1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 9
    monitor-exit p0

    return p1

    .line 10
    :cond_2
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/wv/o;->vv()Lcom/ss/android/socialbase/downloader/wv/o$vv;

    move-result-object v2

    .line 11
    iput-wide p1, v2, Lcom/ss/android/socialbase/downloader/wv/o$vv;->vv:J

    .line 12
    iput-wide p3, v2, Lcom/ss/android/socialbase/downloader/wv/o$vv;->m:J

    if-eqz v0, :cond_3

    .line 13
    iput-object v0, v2, Lcom/ss/android/socialbase/downloader/wv/o$vv;->p:Lcom/ss/android/socialbase/downloader/wv/o$vv;

    .line 14
    iput-object v2, v0, Lcom/ss/android/socialbase/downloader/wv/o$vv;->i:Lcom/ss/android/socialbase/downloader/wv/o$vv;

    .line 15
    :cond_3
    iput-object v2, p0, Lcom/ss/android/socialbase/downloader/wv/o;->vv:Lcom/ss/android/socialbase/downloader/wv/o$vv;

    .line 16
    monitor-exit p0

    return v1

    :catchall_0
    move-exception p1

    .line 17
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
