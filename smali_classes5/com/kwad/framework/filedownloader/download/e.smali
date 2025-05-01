.class public final Lcom/kwad/framework/filedownloader/download/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/framework/filedownloader/download/e$a;
    }
.end annotation


# instance fields
.field private final Wx:Ljava/lang/String;

.field private final agE:J

.field agF:J

.field private final agG:J

.field private final agL:Lcom/kwad/framework/filedownloader/b/a;

.field private final agT:Z

.field private final agw:I

.field private final ahL:Lcom/kwad/framework/filedownloader/download/c;

.field private final ahM:Lcom/kwad/framework/filedownloader/a/b;

.field private ahN:Lcom/kwad/framework/filedownloader/e/a;

.field private volatile ahO:J

.field private volatile ahP:J

.field private final aht:Lcom/kwad/framework/filedownloader/download/f;

.field private final ahv:I

.field private final contentLength:J

.field private volatile kH:Z


# direct methods
.method private constructor <init>(Lcom/kwad/framework/filedownloader/a/b;Lcom/kwad/framework/filedownloader/download/a;Lcom/kwad/framework/filedownloader/download/c;IIZLcom/kwad/framework/filedownloader/download/f;Ljava/lang/String;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 3
    iput-wide v0, p0, Lcom/kwad/framework/filedownloader/download/e;->ahO:J

    .line 4
    iput-wide v0, p0, Lcom/kwad/framework/filedownloader/download/e;->ahP:J

    .line 5
    iput-object p7, p0, Lcom/kwad/framework/filedownloader/download/e;->aht:Lcom/kwad/framework/filedownloader/download/f;

    .line 6
    iput-object p8, p0, Lcom/kwad/framework/filedownloader/download/e;->Wx:Ljava/lang/String;

    .line 7
    iput-object p1, p0, Lcom/kwad/framework/filedownloader/download/e;->ahM:Lcom/kwad/framework/filedownloader/a/b;

    .line 8
    iput-boolean p6, p0, Lcom/kwad/framework/filedownloader/download/e;->agT:Z

    .line 9
    iput-object p3, p0, Lcom/kwad/framework/filedownloader/download/e;->ahL:Lcom/kwad/framework/filedownloader/download/c;

    .line 10
    iput p5, p0, Lcom/kwad/framework/filedownloader/download/e;->ahv:I

    .line 11
    iput p4, p0, Lcom/kwad/framework/filedownloader/download/e;->agw:I

    .line 12
    invoke-static {}, Lcom/kwad/framework/filedownloader/download/b;->vS()Lcom/kwad/framework/filedownloader/download/b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/kwad/framework/filedownloader/download/b;->vU()Lcom/kwad/framework/filedownloader/b/a;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/framework/filedownloader/download/e;->agL:Lcom/kwad/framework/filedownloader/b/a;

    .line 13
    iget-wide p3, p2, Lcom/kwad/framework/filedownloader/download/a;->agE:J

    iput-wide p3, p0, Lcom/kwad/framework/filedownloader/download/e;->agE:J

    .line 14
    iget-wide p3, p2, Lcom/kwad/framework/filedownloader/download/a;->agG:J

    iput-wide p3, p0, Lcom/kwad/framework/filedownloader/download/e;->agG:J

    .line 15
    iget-wide p3, p2, Lcom/kwad/framework/filedownloader/download/a;->agF:J

    iput-wide p3, p0, Lcom/kwad/framework/filedownloader/download/e;->agF:J

    .line 16
    iget-wide p1, p2, Lcom/kwad/framework/filedownloader/download/a;->contentLength:J

    iput-wide p1, p0, Lcom/kwad/framework/filedownloader/download/e;->contentLength:J

    return-void
.end method

.method synthetic constructor <init>(Lcom/kwad/framework/filedownloader/a/b;Lcom/kwad/framework/filedownloader/download/a;Lcom/kwad/framework/filedownloader/download/c;IIZLcom/kwad/framework/filedownloader/download/f;Ljava/lang/String;B)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p8}, Lcom/kwad/framework/filedownloader/download/e;-><init>(Lcom/kwad/framework/filedownloader/a/b;Lcom/kwad/framework/filedownloader/download/a;Lcom/kwad/framework/filedownloader/download/c;IIZLcom/kwad/framework/filedownloader/download/f;Ljava/lang/String;)V

    return-void
.end method

.method private sync()V
    .locals 9

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 2
    :try_start_0
    iget-object v4, p0, Lcom/kwad/framework/filedownloader/download/e;->ahN:Lcom/kwad/framework/filedownloader/e/a;

    invoke-interface {v4}, Lcom/kwad/framework/filedownloader/e/a;->xm()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v4, 0x1

    goto :goto_0

    :catch_0
    move-exception v4

    .line 3
    sget-boolean v5, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    if-eqz v5, :cond_0

    new-array v5, v2, [Ljava/lang/Object;

    aput-object v4, v5, v3

    const-string v4, "Because of the system cannot guarantee that all the buffers have been synchronized with physical media, or write to filefailed, we just not flushAndSync process to database too %s"

    .line 4
    invoke-static {p0, v4, v5}, Lcom/kwad/framework/filedownloader/f/d;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_3

    .line 5
    iget-object v4, p0, Lcom/kwad/framework/filedownloader/download/e;->ahL:Lcom/kwad/framework/filedownloader/download/c;

    if-eqz v4, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_2

    .line 6
    iget-object v4, p0, Lcom/kwad/framework/filedownloader/download/e;->agL:Lcom/kwad/framework/filedownloader/b/a;

    iget v5, p0, Lcom/kwad/framework/filedownloader/download/e;->agw:I

    iget v6, p0, Lcom/kwad/framework/filedownloader/download/e;->ahv:I

    iget-wide v7, p0, Lcom/kwad/framework/filedownloader/download/e;->agF:J

    invoke-interface {v4, v5, v6, v7, v8}, Lcom/kwad/framework/filedownloader/b/a;->a(IIJ)V

    goto :goto_2

    .line 7
    :cond_2
    iget-object v4, p0, Lcom/kwad/framework/filedownloader/download/e;->aht:Lcom/kwad/framework/filedownloader/download/f;

    invoke-interface {v4}, Lcom/kwad/framework/filedownloader/download/f;->we()V

    .line 8
    :goto_2
    sget-boolean v4, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    if-eqz v4, :cond_3

    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/Object;

    .line 9
    iget v5, p0, Lcom/kwad/framework/filedownloader/download/e;->agw:I

    .line 10
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v3

    iget v3, p0, Lcom/kwad/framework/filedownloader/download/e;->ahv:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v4, v2

    const/4 v2, 0x2

    iget-wide v5, p0, Lcom/kwad/framework/filedownloader/download/e;->agF:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v4, v2

    const/4 v2, 0x3

    .line 11
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v5

    sub-long/2addr v5, v0

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, v4, v2

    const-string v0, "require flushAndSync id[%d] index[%d] offset[%d], consume[%d]"

    .line 12
    invoke-static {p0, v0, v4}, Lcom/kwad/framework/filedownloader/f/d;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    return-void
.end method

.method private wv()V
    .locals 6

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    .line 2
    iget-wide v2, p0, Lcom/kwad/framework/filedownloader/download/e;->agF:J

    iget-wide v4, p0, Lcom/kwad/framework/filedownloader/download/e;->ahO:J

    sub-long/2addr v2, v4

    .line 3
    iget-wide v4, p0, Lcom/kwad/framework/filedownloader/download/e;->ahP:J

    sub-long v4, v0, v4

    .line 4
    invoke-static {v2, v3, v4, v5}, Lcom/kwad/framework/filedownloader/f/f;->i(JJ)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 5
    invoke-direct {p0}, Lcom/kwad/framework/filedownloader/download/e;->sync()V

    .line 6
    iget-wide v2, p0, Lcom/kwad/framework/filedownloader/download/e;->agF:J

    iput-wide v2, p0, Lcom/kwad/framework/filedownloader/download/e;->ahO:J

    .line 7
    iput-wide v0, p0, Lcom/kwad/framework/filedownloader/download/e;->ahP:J

    :cond_0
    return-void
.end method


# virtual methods
.method public final pause()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/kwad/framework/filedownloader/download/e;->kH:Z

    return-void
.end method

.method public final run()V
    .locals 16

    move-object/from16 v1, p0

    .line 1
    iget-boolean v0, v1, Lcom/kwad/framework/filedownloader/download/e;->kH:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget v0, v1, Lcom/kwad/framework/filedownloader/download/e;->ahv:I

    iget-object v2, v1, Lcom/kwad/framework/filedownloader/download/e;->ahM:Lcom/kwad/framework/filedownloader/a/b;

    invoke-static {v0, v2}, Lcom/kwad/framework/filedownloader/f/f;->b(ILcom/kwad/framework/filedownloader/a/b;)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    const/4 v0, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    cmp-long v8, v2, v4

    if-eqz v8, :cond_e

    .line 3
    iget-wide v8, v1, Lcom/kwad/framework/filedownloader/download/e;->contentLength:J

    const/4 v10, 0x5

    const/4 v11, 0x4

    const/4 v12, 0x3

    cmp-long v13, v8, v4

    if-lez v13, :cond_2

    cmp-long v13, v2, v8

    if-eqz v13, :cond_2

    .line 4
    iget-wide v8, v1, Lcom/kwad/framework/filedownloader/download/e;->agG:J

    cmp-long v13, v8, v4

    if-nez v13, :cond_1

    new-array v4, v6, [Ljava/lang/Object;

    .line 5
    iget-wide v8, v1, Lcom/kwad/framework/filedownloader/download/e;->agF:J

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v7

    const-string v5, "range[%d-)"

    invoke-static {v5, v4}, Lcom/kwad/framework/filedownloader/f/f;->b(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_1
    new-array v4, v0, [Ljava/lang/Object;

    .line 6
    iget-wide v8, v1, Lcom/kwad/framework/filedownloader/download/e;->agF:J

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v7

    iget-wide v8, v1, Lcom/kwad/framework/filedownloader/download/e;->agG:J

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v6

    const-string v5, "range[%d-%d)"

    invoke-static {v5, v4}, Lcom/kwad/framework/filedownloader/f/f;->b(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 7
    :goto_0
    new-instance v5, Lcom/kwad/framework/filedownloader/exception/FileDownloadGiveUpRetryException;

    new-array v8, v10, [Ljava/lang/Object;

    aput-object v4, v8, v7

    iget-wide v9, v1, Lcom/kwad/framework/filedownloader/download/e;->contentLength:J

    .line 8
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v8, v6

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v8, v0

    iget v0, v1, Lcom/kwad/framework/filedownloader/download/e;->agw:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v8, v12

    iget v0, v1, Lcom/kwad/framework/filedownloader/download/e;->ahv:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v8, v11

    const-string v0, "require %s with contentLength(%d), but the backend response contentLength is %d on downloadId[%d]-connectionIndex[%d], please ask your backend dev to fix such problem."

    .line 9
    invoke-static {v0, v8}, Lcom/kwad/framework/filedownloader/f/f;->b(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Lcom/kwad/framework/filedownloader/exception/FileDownloadGiveUpRetryException;-><init>(Ljava/lang/String;)V

    throw v5

    .line 10
    :cond_2
    iget-wide v4, v1, Lcom/kwad/framework/filedownloader/download/e;->agF:J

    const/4 v8, 0x0

    .line 11
    :try_start_0
    invoke-static {}, Lcom/kwad/framework/filedownloader/download/b;->vS()Lcom/kwad/framework/filedownloader/download/b;

    move-result-object v9

    invoke-virtual {v9}, Lcom/kwad/framework/filedownloader/download/b;->vW()Z

    move-result v9

    .line 12
    iget-object v13, v1, Lcom/kwad/framework/filedownloader/download/e;->ahL:Lcom/kwad/framework/filedownloader/download/c;

    if-eqz v13, :cond_4

    if-eqz v9, :cond_3

    goto :goto_1

    .line 13
    :cond_3
    new-instance v0, Ljava/lang/IllegalAccessException;

    const-string v2, "can\'t using multi-download when the output stream can\'t support seek"

    invoke-direct {v0, v2}, Ljava/lang/IllegalAccessException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 14
    :cond_4
    :goto_1
    iget-object v13, v1, Lcom/kwad/framework/filedownloader/download/e;->Wx:Ljava/lang/String;

    invoke-static {v13}, Lcom/kwad/framework/filedownloader/f/f;->bD(Ljava/lang/String;)Lcom/kwad/framework/filedownloader/e/a;

    move-result-object v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iput-object v13, v1, Lcom/kwad/framework/filedownloader/download/e;->ahN:Lcom/kwad/framework/filedownloader/e/a;

    if-eqz v9, :cond_5

    .line 15
    iget-wide v14, v1, Lcom/kwad/framework/filedownloader/download/e;->agF:J

    invoke-interface {v13, v14, v15}, Lcom/kwad/framework/filedownloader/e/a;->seek(J)V

    .line 16
    :cond_5
    sget-boolean v9, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    if-eqz v9, :cond_6

    const-string v9, "start fetch(%d): range [%d, %d), seek to[%d]"

    new-array v14, v11, [Ljava/lang/Object;

    .line 17
    iget v15, v1, Lcom/kwad/framework/filedownloader/download/e;->ahv:I

    .line 18
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    aput-object v15, v14, v7

    iget-wide v10, v1, Lcom/kwad/framework/filedownloader/download/e;->agE:J

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    aput-object v10, v14, v6

    iget-wide v10, v1, Lcom/kwad/framework/filedownloader/download/e;->agG:J

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    aput-object v10, v14, v0

    iget-wide v10, v1, Lcom/kwad/framework/filedownloader/download/e;->agF:J

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    aput-object v10, v14, v12

    .line 19
    invoke-static {v1, v9, v14}, Lcom/kwad/framework/filedownloader/f/d;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 20
    :cond_6
    iget-object v9, v1, Lcom/kwad/framework/filedownloader/download/e;->ahM:Lcom/kwad/framework/filedownloader/a/b;

    invoke-interface {v9}, Lcom/kwad/framework/filedownloader/a/b;->getInputStream()Ljava/io/InputStream;

    move-result-object v8

    const/16 v9, 0x1000

    new-array v9, v9, [B

    .line 21
    iget-boolean v10, v1, Lcom/kwad/framework/filedownloader/download/e;->kH:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v10, :cond_7

    .line 22
    invoke-static {v8}, Lcom/kwad/sdk/crash/utils/b;->closeQuietly(Ljava/io/Closeable;)V

    .line 23
    invoke-static {v13}, Lcom/kwad/sdk/crash/utils/b;->closeQuietly(Ljava/io/Closeable;)V

    return-void

    .line 24
    :cond_7
    :goto_2
    :try_start_2
    invoke-virtual {v8, v9}, Ljava/io/InputStream;->read([B)I

    move-result v10

    const/4 v11, -0x1

    if-eq v10, v11, :cond_a

    .line 25
    invoke-interface {v13, v9, v7, v10}, Lcom/kwad/framework/filedownloader/e/a;->write([BII)V

    .line 26
    iget-wide v6, v1, Lcom/kwad/framework/filedownloader/download/e;->agF:J

    int-to-long v14, v10

    add-long/2addr v6, v14

    iput-wide v6, v1, Lcom/kwad/framework/filedownloader/download/e;->agF:J

    .line 27
    iget-object v6, v1, Lcom/kwad/framework/filedownloader/download/e;->aht:Lcom/kwad/framework/filedownloader/download/f;

    invoke-interface {v6, v14, v15}, Lcom/kwad/framework/filedownloader/download/f;->onProgress(J)V

    .line 28
    invoke-direct/range {p0 .. p0}, Lcom/kwad/framework/filedownloader/download/e;->wv()V

    .line 29
    iget-boolean v6, v1, Lcom/kwad/framework/filedownloader/download/e;->kH:Z

    if-nez v6, :cond_a

    .line 30
    iget-boolean v6, v1, Lcom/kwad/framework/filedownloader/download/e;->agT:Z

    if-eqz v6, :cond_9

    invoke-static {}, Lcom/kwad/framework/filedownloader/f/f;->xw()Z

    move-result v6

    if-nez v6, :cond_8

    goto :goto_3

    .line 31
    :cond_8
    new-instance v0, Lcom/kwad/framework/filedownloader/exception/FileDownloadNetworkPolicyException;

    invoke-direct {v0}, Lcom/kwad/framework/filedownloader/exception/FileDownloadNetworkPolicyException;-><init>()V

    throw v0

    :cond_9
    :goto_3
    const/4 v6, 0x1

    const/4 v7, 0x0

    goto :goto_2

    :cond_a
    if-eqz v13, :cond_b

    .line 32
    invoke-direct/range {p0 .. p0}, Lcom/kwad/framework/filedownloader/download/e;->sync()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 33
    :cond_b
    invoke-static {v8}, Lcom/kwad/sdk/crash/utils/b;->closeQuietly(Ljava/io/Closeable;)V

    .line 34
    invoke-static {v13}, Lcom/kwad/sdk/crash/utils/b;->closeQuietly(Ljava/io/Closeable;)V

    .line 35
    iget-wide v6, v1, Lcom/kwad/framework/filedownloader/download/e;->agF:J

    sub-long/2addr v6, v4

    const-wide/16 v8, -0x1

    cmp-long v10, v2, v8

    if-eqz v10, :cond_d

    cmp-long v8, v2, v6

    if-nez v8, :cond_c

    goto :goto_4

    .line 36
    :cond_c
    new-instance v8, Lcom/kwad/framework/filedownloader/exception/FileDownloadGiveUpRetryException;

    const/4 v9, 0x6

    new-array v9, v9, [Ljava/lang/Object;

    .line 37
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const/4 v7, 0x0

    aput-object v6, v9, v7

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v9, v3

    iget-wide v2, v1, Lcom/kwad/framework/filedownloader/download/e;->agE:J

    .line 38
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v9, v0

    iget-wide v2, v1, Lcom/kwad/framework/filedownloader/download/e;->agG:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, v9, v12

    iget-wide v2, v1, Lcom/kwad/framework/filedownloader/download/e;->agF:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const/4 v2, 0x4

    aput-object v0, v9, v2

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const/4 v2, 0x5

    aput-object v0, v9, v2

    const-string v0, "fetched length[%d] != content length[%d], range[%d, %d) offset[%d] fetch begin offset"

    .line 39
    invoke-static {v0, v9}, Lcom/kwad/framework/filedownloader/f/f;->b(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v8, v0}, Lcom/kwad/framework/filedownloader/exception/FileDownloadGiveUpRetryException;-><init>(Ljava/lang/String;)V

    throw v8

    .line 40
    :cond_d
    :goto_4
    iget-object v2, v1, Lcom/kwad/framework/filedownloader/download/e;->aht:Lcom/kwad/framework/filedownloader/download/f;

    iget-object v3, v1, Lcom/kwad/framework/filedownloader/download/e;->ahL:Lcom/kwad/framework/filedownloader/download/c;

    iget-wide v4, v1, Lcom/kwad/framework/filedownloader/download/e;->agE:J

    iget-wide v6, v1, Lcom/kwad/framework/filedownloader/download/e;->agG:J

    invoke-interface/range {v2 .. v7}, Lcom/kwad/framework/filedownloader/download/f;->a(Lcom/kwad/framework/filedownloader/download/c;JJ)V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_5

    :catchall_1
    move-exception v0

    move-object v13, v8

    .line 41
    :goto_5
    invoke-static {v8}, Lcom/kwad/sdk/crash/utils/b;->closeQuietly(Ljava/io/Closeable;)V

    .line 42
    invoke-static {v13}, Lcom/kwad/sdk/crash/utils/b;->closeQuietly(Ljava/io/Closeable;)V

    .line 43
    throw v0

    .line 44
    :cond_e
    new-instance v2, Lcom/kwad/framework/filedownloader/exception/FileDownloadGiveUpRetryException;

    new-array v0, v0, [Ljava/lang/Object;

    iget v3, v1, Lcom/kwad/framework/filedownloader/download/e;->agw:I

    .line 45
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v0, v4

    iget v3, v1, Lcom/kwad/framework/filedownloader/download/e;->ahv:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v0, v4

    const-string v3, "there isn\'t any content need to download on %d-%d with the content-length is 0"

    .line 46
    invoke-static {v3, v0}, Lcom/kwad/framework/filedownloader/f/f;->b(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/kwad/framework/filedownloader/exception/FileDownloadGiveUpRetryException;-><init>(Ljava/lang/String;)V

    goto :goto_7

    :goto_6
    throw v2

    :goto_7
    goto :goto_6
.end method
