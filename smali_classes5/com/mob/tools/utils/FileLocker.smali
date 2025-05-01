.class public Lcom/mob/tools/utils/FileLocker;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/mob/tools/proguard/PublicMemberKeeper;


# instance fields
.field private a:Ljava/io/FileOutputStream;

.field private b:Ljava/nio/channels/FileLock;

.field private c:Ljava/nio/channels/FileChannel;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Z)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/mob/tools/utils/FileLocker;->c:Ljava/nio/channels/FileChannel;

    invoke-virtual {p1}, Ljava/nio/channels/FileChannel;->lock()Ljava/nio/channels/FileLock;

    move-result-object p1

    iput-object p1, p0, Lcom/mob/tools/utils/FileLocker;->b:Ljava/nio/channels/FileLock;

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/mob/tools/utils/FileLocker;->c:Ljava/nio/channels/FileChannel;

    invoke-virtual {p1}, Ljava/nio/channels/FileChannel;->tryLock()Ljava/nio/channels/FileLock;

    move-result-object p1

    iput-object p1, p0, Lcom/mob/tools/utils/FileLocker;->b:Ljava/nio/channels/FileLock;

    .line 3
    :goto_0
    iget-object p1, p0, Lcom/mob/tools/utils/FileLocker;->b:Ljava/nio/channels/FileLock;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1
.end method


# virtual methods
.method public declared-synchronized lock(Ljava/lang/Runnable;Z)V
    .locals 0

    monitor-enter p0

    .line 20
    :try_start_0
    invoke-virtual {p0, p2}, Lcom/mob/tools/utils/FileLocker;->lock(Z)Z

    move-result p2

    if-eqz p2, :cond_0

    if-eqz p1, :cond_0

    .line 21
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized lock(Z)Z
    .locals 8

    monitor-enter p0

    if-eqz p1, :cond_0

    const-wide/16 v0, 0x3e8

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x1f4

    :goto_0
    move-wide v4, v0

    const-wide/16 v6, 0x10

    move-object v2, p0

    move v3, p1

    .line 1
    :try_start_0
    invoke-virtual/range {v2 .. v7}, Lcom/mob/tools/utils/FileLocker;->lock(ZJJ)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized lock(ZJJ)Z
    .locals 8

    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/mob/tools/utils/FileLocker;->a:Ljava/io/FileOutputStream;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 3
    monitor-exit p0

    return v1

    .line 4
    :cond_0
    :try_start_1
    invoke-direct {p0, p1}, Lcom/mob/tools/utils/FileLocker;->a(Z)Z

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception v0

    const-wide/16 v2, 0x0

    cmp-long v4, p2, v2

    if-lez v4, :cond_6

    .line 5
    :try_start_2
    instance-of v4, v0, Ljava/nio/channels/OverlappingFileLockException;

    if-nez v4, :cond_1

    instance-of v4, v0, Ljava/io/IOException;

    if-eqz v4, :cond_6

    .line 6
    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    add-long/2addr v4, p2

    :cond_2
    :goto_0
    cmp-long v6, p2, v2

    if-lez v6, :cond_5

    .line 7
    :try_start_3
    invoke-static {p4, p5}, Ljava/lang/Thread;->sleep(J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 8
    :catchall_1
    :try_start_4
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p2

    sub-long p2, v4, p2

    .line 9
    invoke-direct {p0, p1}, Lcom/mob/tools/utils/FileLocker;->a(Z)Z

    move-result p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v6

    .line 10
    :try_start_5
    instance-of v7, v6, Ljava/nio/channels/OverlappingFileLockException;

    if-nez v7, :cond_4

    instance-of v6, v6, Ljava/io/IOException;

    if-eqz v6, :cond_3

    goto :goto_1

    .line 11
    :cond_3
    invoke-static {}, Lcom/mob/tools/MobLog;->getInstance()Lcom/mob/tools/log/NLog;

    move-result-object p2

    invoke-virtual {p2, v0}, Lcom/mob/tools/log/NLog;->w(Ljava/lang/Throwable;)I

    const-wide/16 p2, -0x1

    goto :goto_0

    :cond_4
    :goto_1
    cmp-long v6, p2, v2

    if-gtz v6, :cond_2

    .line 12
    invoke-static {}, Lcom/mob/tools/MobLog;->getInstance()Lcom/mob/tools/log/NLog;

    move-result-object v6

    const-string v7, "OverlappingFileLockException or IOExcept timeout"

    invoke-virtual {v6, v7}, Lcom/mob/tools/log/NLog;->w(Ljava/lang/String;)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    goto :goto_0

    :cond_5
    const/4 p1, 0x0

    :goto_2
    cmp-long p4, p2, v2

    if-lez p4, :cond_7

    .line 13
    monitor-exit p0

    return p1

    .line 14
    :cond_6
    :try_start_6
    invoke-static {}, Lcom/mob/tools/MobLog;->getInstance()Lcom/mob/tools/log/NLog;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/mob/tools/log/NLog;->w(Ljava/lang/Throwable;)I

    .line 15
    :cond_7
    iget-object p1, p0, Lcom/mob/tools/utils/FileLocker;->b:Ljava/nio/channels/FileLock;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    if-eqz p1, :cond_8

    .line 16
    :try_start_7
    invoke-virtual {p1}, Ljava/nio/channels/FileLock;->release()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :catchall_3
    const/4 p1, 0x0

    .line 17
    :try_start_8
    iput-object p1, p0, Lcom/mob/tools/utils/FileLocker;->b:Ljava/nio/channels/FileLock;

    :cond_8
    const/4 p1, 0x2

    new-array p1, p1, [Ljava/io/Closeable;

    .line 18
    iget-object p2, p0, Lcom/mob/tools/utils/FileLocker;->c:Ljava/nio/channels/FileChannel;

    aput-object p2, p1, v1

    const/4 p2, 0x1

    iget-object p3, p0, Lcom/mob/tools/utils/FileLocker;->a:Ljava/io/FileOutputStream;

    aput-object p3, p1, p2

    invoke-static {p1}, Lcom/mob/commons/v;->a([Ljava/io/Closeable;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 19
    monitor-exit p0

    return v1

    :catchall_4
    move-exception p1

    monitor-exit p0

    goto :goto_4

    :goto_3
    throw p1

    :goto_4
    goto :goto_3
.end method

.method public declared-synchronized release()V
    .locals 3

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/mob/tools/utils/FileLocker;->a:Ljava/io/FileOutputStream;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 2
    monitor-exit p0

    return-void

    .line 3
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lcom/mob/tools/utils/FileLocker;->unlock()V

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/io/Closeable;

    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lcom/mob/tools/utils/FileLocker;->c:Ljava/nio/channels/FileChannel;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/mob/tools/utils/FileLocker;->a:Ljava/io/FileOutputStream;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/mob/commons/v;->a([Ljava/io/Closeable;)V

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/mob/tools/utils/FileLocker;->c:Ljava/nio/channels/FileChannel;

    .line 6
    iput-object v0, p0, Lcom/mob/tools/utils/FileLocker;->a:Ljava/io/FileOutputStream;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 7
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized setLockFile(Ljava/lang/String;)V
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/mob/tools/utils/FileLocker;->a:Ljava/io/FileOutputStream;

    .line 2
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object p1

    iput-object p1, p0, Lcom/mob/tools/utils/FileLocker;->c:Ljava/nio/channels/FileChannel;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 p1, 0x2

    :try_start_1
    new-array p1, p1, [Ljava/io/Closeable;

    const/4 v0, 0x0

    .line 3
    iget-object v1, p0, Lcom/mob/tools/utils/FileLocker;->c:Ljava/nio/channels/FileChannel;

    aput-object v1, p1, v0

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/mob/tools/utils/FileLocker;->a:Ljava/io/FileOutputStream;

    aput-object v1, p1, v0

    invoke-static {p1}, Lcom/mob/commons/v;->a([Ljava/io/Closeable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 4
    :goto_0
    monitor-exit p0

    return-void

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized unlock()V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/mob/tools/utils/FileLocker;->b:Ljava/nio/channels/FileLock;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v0, :cond_0

    .line 2
    monitor-exit p0

    return-void

    .line 3
    :cond_0
    :try_start_1
    invoke-virtual {v0}, Ljava/nio/channels/FileLock;->release()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    const/4 v0, 0x0

    .line 4
    :try_start_2
    iput-object v0, p0, Lcom/mob/tools/utils/FileLocker;->b:Ljava/nio/channels/FileLock;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 5
    monitor-exit p0

    return-void

    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0
.end method
