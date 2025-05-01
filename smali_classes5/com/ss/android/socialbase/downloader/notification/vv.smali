.class public abstract Lcom/ss/android/socialbase/downloader/notification/vv;
.super Ljava/lang/Object;


# instance fields
.field private i:J

.field private m:I

.field private n:J

.field private o:Ljava/lang/String;

.field private p:J

.field private qv:I

.field private u:I

.field protected vv:Landroid/app/Notification;

.field private wv:Z


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/ss/android/socialbase/downloader/notification/vv;->u:I

    .line 3
    iput p1, p0, Lcom/ss/android/socialbase/downloader/notification/vv;->m:I

    .line 4
    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/notification/vv;->o:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public i()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/notification/vv;->o:Ljava/lang/String;

    return-object v0
.end method

.method public m()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/notification/vv;->p:J

    return-wide v0
.end method

.method public m(J)V
    .locals 0

    .line 2
    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/notification/vv;->i:J

    return-void
.end method

.method public declared-synchronized n()V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget v0, p0, Lcom/ss/android/socialbase/downloader/notification/vv;->qv:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/ss/android/socialbase/downloader/notification/vv;->qv:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public o()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/ss/android/socialbase/downloader/notification/vv;->u:I

    return v0
.end method

.method public p()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/notification/vv;->i:J

    return-wide v0
.end method

.method public qv()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/ss/android/socialbase/downloader/notification/vv;->wv:Z

    return v0
.end method

.method public u()J
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/notification/vv;->n:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    .line 2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ss/android/socialbase/downloader/notification/vv;->n:J

    .line 3
    :cond_0
    iget-wide v0, p0, Lcom/ss/android/socialbase/downloader/notification/vv;->n:J

    return-wide v0
.end method

.method public vv()I
    .locals 1

    .line 3
    iget v0, p0, Lcom/ss/android/socialbase/downloader/notification/vv;->m:I

    return v0
.end method

.method public vv(ILcom/ss/android/socialbase/downloader/exception/BaseException;Z)V
    .locals 1

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/ss/android/socialbase/downloader/notification/vv;->vv(ILcom/ss/android/socialbase/downloader/exception/BaseException;ZZ)V

    return-void
.end method

.method public vv(ILcom/ss/android/socialbase/downloader/exception/BaseException;ZZ)V
    .locals 0

    if-nez p4, :cond_0

    .line 6
    iget p4, p0, Lcom/ss/android/socialbase/downloader/notification/vv;->u:I

    if-ne p4, p1, :cond_0

    return-void

    .line 7
    :cond_0
    iput p1, p0, Lcom/ss/android/socialbase/downloader/notification/vv;->u:I

    .line 8
    invoke-virtual {p0, p2, p3}, Lcom/ss/android/socialbase/downloader/notification/vv;->vv(Lcom/ss/android/socialbase/downloader/exception/BaseException;Z)V

    return-void
.end method

.method public vv(J)V
    .locals 0

    .line 4
    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/notification/vv;->p:J

    return-void
.end method

.method public vv(JJ)V
    .locals 0

    .line 9
    iput-wide p1, p0, Lcom/ss/android/socialbase/downloader/notification/vv;->p:J

    .line 10
    iput-wide p3, p0, Lcom/ss/android/socialbase/downloader/notification/vv;->i:J

    const/4 p1, 0x4

    .line 11
    iput p1, p0, Lcom/ss/android/socialbase/downloader/notification/vv;->u:I

    const/4 p1, 0x0

    const/4 p2, 0x0

    .line 12
    invoke-virtual {p0, p1, p2}, Lcom/ss/android/socialbase/downloader/notification/vv;->vv(Lcom/ss/android/socialbase/downloader/exception/BaseException;Z)V

    return-void
.end method

.method public vv(Landroid/app/Notification;)V
    .locals 3

    .line 13
    iget v0, p0, Lcom/ss/android/socialbase/downloader/notification/vv;->m:I

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    .line 14
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/notification/m;->vv()Lcom/ss/android/socialbase/downloader/notification/m;

    move-result-object v0

    iget v1, p0, Lcom/ss/android/socialbase/downloader/notification/vv;->m:I

    iget v2, p0, Lcom/ss/android/socialbase/downloader/notification/vv;->u:I

    invoke-virtual {v0, v1, v2, p1}, Lcom/ss/android/socialbase/downloader/notification/m;->vv(IILandroid/app/Notification;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public abstract vv(Lcom/ss/android/socialbase/downloader/exception/BaseException;Z)V
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v0

    iput v0, p0, Lcom/ss/android/socialbase/downloader/notification/vv;->m:I

    .line 2
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTitle()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/notification/vv;->o:Ljava/lang/String;

    return-void
.end method
