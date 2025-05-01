.class Lcom/mob/tools/b/d$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mob/tools/b/d;->a(Ljava/lang/String;)Ljava/util/concurrent/CountDownLatch;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/util/concurrent/CountDownLatch;

.field final synthetic c:Lcom/mob/tools/b/d;


# direct methods
.method constructor <init>(Lcom/mob/tools/b/d;Ljava/lang/String;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    iput-object p2, p0, Lcom/mob/tools/b/d$1;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/mob/tools/b/d$1;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 16

    move-object/from16 v1, p0

    .line 1
    iget-object v2, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {v2}, Lcom/mob/tools/b/d;->a(Lcom/mob/tools/b/d;)[B

    move-result-object v2

    monitor-enter v2

    .line 2
    :try_start_0
    sget-object v3, Lcom/mob/tools/c/a;->c:Ljava/lang/ThreadLocal;

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v3, v4}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    const/16 v5, 0xb

    const/4 v6, 0x3

    const-wide/16 v7, 0xdac

    const/16 v9, 0x10

    const/4 v10, 0x0

    .line 4
    :try_start_1
    invoke-static {}, Lcom/mob/tools/MobLog;->getInstance()Lcom/mob/tools/log/NLog;

    move-result-object v11

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "dhs stch: "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v13, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    iget-object v14, v1, Lcom/mob/tools/b/d$1;->a:Ljava/lang/String;

    invoke-static {v13, v14}, Lcom/mob/tools/b/d;->a(Lcom/mob/tools/b/d;Ljava/lang/String;)Z

    move-result v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    new-array v13, v10, [Ljava/lang/Object;

    invoke-virtual {v11, v12, v13}, Lcom/mob/tools/log/NLog;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 5
    new-instance v11, Ljava/io/File;

    invoke-static {}, Lcom/mob/MobSDK;->getContext()Landroid/content/Context;

    move-result-object v12

    invoke-virtual {v12}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v12

    const-string v13, "003PcbcbTg"

    invoke-static {v13}, Lcom/mob/commons/r;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-direct {v11, v12, v13}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 6
    iget-object v12, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    iget-object v13, v1, Lcom/mob/tools/b/d$1;->a:Ljava/lang/String;

    invoke-static {v12, v13}, Lcom/mob/tools/b/d;->a(Lcom/mob/tools/b/d;Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_1

    .line 7
    invoke-static {v10}, Lcom/mob/tools/b/d;->a(Z)Z

    .line 8
    invoke-static {v11}, Lcom/mob/tools/utils/ResHelper;->deleteFileAndFolder(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 9
    :try_start_2
    iget-object v11, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    sub-long/2addr v12, v3

    invoke-static {v11, v12, v13}, Lcom/mob/tools/b/d;->a(Lcom/mob/tools/b/d;J)J

    .line 10
    invoke-static {}, Lcom/mob/tools/MobLog;->getInstance()Lcom/mob/tools/log/NLog;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "dhs ctd: "

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v11, v1, Lcom/mob/tools/b/d$1;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-array v11, v10, [Ljava/lang/Object;

    invoke-virtual {v3, v4, v11}, Lcom/mob/tools/log/NLog;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 11
    iget-object v3, v1, Lcom/mob/tools/b/d$1;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v3}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 12
    iget-object v3, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {v3}, Lcom/mob/tools/b/d;->e(Lcom/mob/tools/b/d;)Ljava/util/concurrent/ConcurrentLinkedQueue;

    move-result-object v3

    iget-object v4, v1, Lcom/mob/tools/b/d$1;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v3, v4}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    .line 13
    invoke-static {}, Lcom/mob/tools/MobLog;->getInstance()Lcom/mob/tools/log/NLog;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "dhs tt "

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v11, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {v11}, Lcom/mob/tools/b/d;->f(Lcom/mob/tools/b/d;)J

    move-result-wide v11

    invoke-virtual {v4, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-array v10, v10, [Ljava/lang/Object;

    invoke-virtual {v3, v4, v10}, Lcom/mob/tools/log/NLog;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 14
    iget-object v3, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {v3}, Lcom/mob/tools/b/d;->f(Lcom/mob/tools/b/d;)J

    move-result-wide v3

    cmp-long v10, v3, v7

    if-lez v10, :cond_0

    iget-object v3, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-virtual {v3}, Lcom/mob/tools/b/d;->b()I

    move-result v3

    if-ne v3, v9, :cond_0

    .line 15
    new-instance v3, Ljava/lang/StringBuilder;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "-t-"

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {v7}, Lcom/mob/tools/b/d;->f(Lcom/mob/tools/b/d;)J

    move-result-wide v7

    invoke-virtual {v4, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v4, "-d-"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    .line 16
    invoke-static {v4}, Lcom/mob/tools/b/d;->h(Lcom/mob/tools/b/d;)J

    move-result-wide v7

    invoke-virtual {v3, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, "-l-"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {v4}, Lcom/mob/tools/b/d;->g(Lcom/mob/tools/b/d;)J

    move-result-wide v7

    invoke-virtual {v3, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    invoke-static {}, Lcom/mob/commons/g;->a()Lcom/mob/commons/g;

    move-result-object v4

    new-instance v7, Ljava/lang/Throwable;

    .line 18
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v7, v3}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, ""

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v8, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {v8}, Lcom/mob/tools/b/d;->c(Lcom/mob/tools/b/d;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 19
    invoke-virtual {v4, v6, v5, v7, v3}, Lcom/mob/commons/g;->a(IILjava/lang/Throwable;Ljava/lang/String;)V

    .line 20
    :cond_0
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    return-void

    .line 21
    :cond_1
    :try_start_3
    iget-object v12, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-virtual {v12, v10}, Lcom/mob/tools/b/d;->a(I)V

    .line 22
    iget-object v12, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    iget-object v13, v1, Lcom/mob/tools/b/d$1;->a:Ljava/lang/String;

    invoke-static {v12, v13}, Lcom/mob/tools/b/d;->b(Lcom/mob/tools/b/d;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 23
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v13

    if-eqz v13, :cond_3

    .line 24
    invoke-static {v10}, Lcom/mob/tools/b/d;->a(Z)Z

    .line 25
    invoke-static {}, Lcom/mob/commons/g;->a()Lcom/mob/commons/g;

    move-result-object v11

    const/4 v12, -0x1

    const/4 v13, 0x4

    const-string v14, ""

    const-string v15, ""

    invoke-virtual {v11, v12, v13, v14, v15}, Lcom/mob/commons/g;->a(IILjava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 26
    :try_start_4
    iget-object v11, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    sub-long/2addr v12, v3

    invoke-static {v11, v12, v13}, Lcom/mob/tools/b/d;->a(Lcom/mob/tools/b/d;J)J

    .line 27
    invoke-static {}, Lcom/mob/tools/MobLog;->getInstance()Lcom/mob/tools/log/NLog;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "dhs ctd: "

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v11, v1, Lcom/mob/tools/b/d$1;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-array v11, v10, [Ljava/lang/Object;

    invoke-virtual {v3, v4, v11}, Lcom/mob/tools/log/NLog;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 28
    iget-object v3, v1, Lcom/mob/tools/b/d$1;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v3}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 29
    iget-object v3, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {v3}, Lcom/mob/tools/b/d;->e(Lcom/mob/tools/b/d;)Ljava/util/concurrent/ConcurrentLinkedQueue;

    move-result-object v3

    iget-object v4, v1, Lcom/mob/tools/b/d$1;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v3, v4}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    .line 30
    invoke-static {}, Lcom/mob/tools/MobLog;->getInstance()Lcom/mob/tools/log/NLog;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "dhs tt "

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v11, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {v11}, Lcom/mob/tools/b/d;->f(Lcom/mob/tools/b/d;)J

    move-result-wide v11

    invoke-virtual {v4, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-array v10, v10, [Ljava/lang/Object;

    invoke-virtual {v3, v4, v10}, Lcom/mob/tools/log/NLog;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 31
    iget-object v3, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {v3}, Lcom/mob/tools/b/d;->f(Lcom/mob/tools/b/d;)J

    move-result-wide v3

    cmp-long v10, v3, v7

    if-lez v10, :cond_2

    iget-object v3, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-virtual {v3}, Lcom/mob/tools/b/d;->b()I

    move-result v3

    if-ne v3, v9, :cond_2

    .line 32
    new-instance v3, Ljava/lang/StringBuilder;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "-t-"

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {v7}, Lcom/mob/tools/b/d;->f(Lcom/mob/tools/b/d;)J

    move-result-wide v7

    invoke-virtual {v4, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v4, "-d-"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    .line 33
    invoke-static {v4}, Lcom/mob/tools/b/d;->h(Lcom/mob/tools/b/d;)J

    move-result-wide v7

    invoke-virtual {v3, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, "-l-"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {v4}, Lcom/mob/tools/b/d;->g(Lcom/mob/tools/b/d;)J

    move-result-wide v7

    invoke-virtual {v3, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    invoke-static {}, Lcom/mob/commons/g;->a()Lcom/mob/commons/g;

    move-result-object v4

    new-instance v7, Ljava/lang/Throwable;

    .line 35
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v7, v3}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, ""

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v8, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {v8}, Lcom/mob/tools/b/d;->c(Lcom/mob/tools/b/d;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 36
    invoke-virtual {v4, v6, v5, v7, v3}, Lcom/mob/commons/g;->a(IILjava/lang/Throwable;Ljava/lang/String;)V

    .line 37
    :cond_2
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    return-void

    .line 38
    :cond_3
    :try_start_5
    invoke-static {}, Lcom/mob/tools/utils/DH$SyncMtd;->isInMainProcess()Z

    move-result v13

    if-nez v13, :cond_5

    .line 39
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/mob/tools/utils/DH$SyncMtd;->getCurrentProcessName()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v14, ""

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 40
    invoke-static {}, Lcom/mob/tools/utils/DH$SyncMtd;->getPackageName()Ljava/lang/String;

    move-result-object v14

    .line 41
    invoke-virtual {v13, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v15

    if-eqz v15, :cond_4

    const-string v15, ""

    .line 42
    invoke-virtual {v13, v14, v15}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v13

    :cond_4
    const-string v14, ":"

    const-string v15, ""

    .line 43
    invoke-virtual {v13, v14, v15}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v13

    .line 44
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v15, "_"

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 45
    :try_start_6
    invoke-static {}, Lcom/mob/tools/MobLog;->getInstance()Lcom/mob/tools/log/NLog;

    move-result-object v14

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "dhs cld nm "

    invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-array v15, v10, [Ljava/lang/Object;

    invoke-virtual {v14, v5, v15}, Lcom/mob/tools/log/NLog;->d(Ljava/lang/Object;[Ljava/lang/Object;)I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_0

    :catchall_0
    :cond_5
    move-object v13, v12

    .line 46
    :catchall_1
    :goto_0
    :try_start_7
    iget-object v5, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {v5, v11, v13}, Lcom/mob/tools/b/d;->a(Lcom/mob/tools/b/d;Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v5

    const/4 v11, 0x1

    if-eqz v5, :cond_6

    .line 47
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v13

    if-eqz v13, :cond_6

    invoke-virtual {v5}, Ljava/io/File;->isFile()Z

    move-result v13

    if-eqz v13, :cond_6

    const/4 v13, 0x1

    goto :goto_1

    :cond_6
    const/4 v13, 0x0

    .line 48
    :goto_1
    invoke-static {}, Lcom/mob/tools/MobLog;->getInstance()Lcom/mob/tools/log/NLog;

    move-result-object v14

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "dhs cac: "

    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-array v15, v10, [Ljava/lang/Object;

    invoke-virtual {v14, v6, v15}, Lcom/mob/tools/log/NLog;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 49
    invoke-static {v5}, Lcom/mob/tools/utils/Data;->MD5(Ljava/io/File;)Ljava/lang/String;

    move-result-object v6

    if-eqz v13, :cond_9

    .line 50
    iget-object v13, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    const/4 v14, 0x5

    invoke-virtual {v13, v14}, Lcom/mob/tools/b/d;->a(I)V

    .line 51
    invoke-virtual {v12, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    .line 52
    invoke-static {}, Lcom/mob/tools/MobLog;->getInstance()Lcom/mob/tools/log/NLog;

    move-result-object v14

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "dhs m5: "

    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    new-array v8, v10, [Ljava/lang/Object;

    invoke-virtual {v14, v7, v8}, Lcom/mob/tools/log/NLog;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    if-nez v13, :cond_7

    .line 53
    iget-object v6, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    const/4 v7, 0x6

    invoke-virtual {v6, v7}, Lcom/mob/tools/b/d;->a(I)V

    .line 54
    iget-object v6, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    iget-object v7, v1, Lcom/mob/tools/b/d$1;->a:Ljava/lang/String;

    invoke-static {v6, v7}, Lcom/mob/tools/b/d;->c(Lcom/mob/tools/b/d;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7, v5, v12}, Lcom/mob/tools/b/d;->a(Lcom/mob/tools/b/d;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    goto :goto_2

    .line 55
    :cond_7
    invoke-static {}, Lcom/mob/tools/MobLog;->getInstance()Lcom/mob/tools/log/NLog;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "dhs tbm: "

    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v12, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {v12}, Lcom/mob/tools/b/d;->b(Lcom/mob/tools/b/d;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v12

    invoke-virtual {v12}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v12

    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    new-array v12, v10, [Ljava/lang/Object;

    invoke-virtual {v7, v8, v12}, Lcom/mob/tools/log/NLog;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 56
    iget-object v7, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    .line 57
    invoke-static {v7}, Lcom/mob/tools/b/d;->b(Lcom/mob/tools/b/d;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v7

    .line 58
    invoke-virtual {v7, v10, v11}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v7

    if-eqz v7, :cond_8

    goto :goto_2

    :cond_8
    const-string v6, ""

    goto :goto_2

    .line 59
    :cond_9
    iget-object v6, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    const/16 v7, 0x8

    invoke-virtual {v6, v7}, Lcom/mob/tools/b/d;->a(I)V

    .line 60
    iget-object v6, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    iget-object v7, v1, Lcom/mob/tools/b/d$1;->a:Ljava/lang/String;

    invoke-static {v6, v7}, Lcom/mob/tools/b/d;->c(Lcom/mob/tools/b/d;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7, v5, v12}, Lcom/mob/tools/b/d;->a(Lcom/mob/tools/b/d;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 61
    :goto_2
    invoke-static {}, Lcom/mob/tools/MobLog;->getInstance()Lcom/mob/tools/log/NLog;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "dhs cl:  tm5: "

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, ", cm5: "

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v11, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {v11}, Lcom/mob/tools/b/d;->c(Lcom/mob/tools/b/d;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    new-array v11, v10, [Ljava/lang/Object;

    invoke-virtual {v7, v8, v11}, Lcom/mob/tools/log/NLog;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 62
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_c

    iget-object v7, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {v7}, Lcom/mob/tools/b/d;->c(Lcom/mob/tools/b/d;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_c

    .line 63
    iget-object v7, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {v7, v5}, Lcom/mob/tools/b/d;->a(Lcom/mob/tools/b/d;Ljava/io/File;)V

    .line 64
    iget-object v7, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {v7, v5, v6}, Lcom/mob/tools/b/d;->b(Lcom/mob/tools/b/d;Ljava/io/File;Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v6

    if-eqz v6, :cond_a

    .line 65
    invoke-virtual {v6}, Ljava/util/HashMap;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_a

    .line 66
    invoke-static {}, Lcom/mob/tools/MobLog;->getInstance()Lcom/mob/tools/log/NLog;

    move-result-object v7

    const-string v8, "dhs l succ"

    new-array v11, v10, [Ljava/lang/Object;

    invoke-virtual {v7, v8, v11}, Lcom/mob/tools/log/NLog;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 67
    new-instance v7, Lcom/mob/tools/b/f;

    invoke-direct {v7, v6}, Lcom/mob/tools/b/f;-><init>(Ljava/util/HashMap;)V

    .line 68
    iget-object v6, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {v5}, Lcom/mob/tools/utils/Data;->MD5(Ljava/io/File;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v6, v5}, Lcom/mob/tools/b/d;->d(Lcom/mob/tools/b/d;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    iget-object v5, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {v5}, Lcom/mob/tools/b/d;->d(Lcom/mob/tools/b/d;)Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, Lcom/mob/tools/b/c;->a(Landroid/content/Context;)Lcom/mob/tools/b/c;

    move-result-object v5

    invoke-virtual {v5, v7}, Lcom/mob/tools/b/c;->a(Lcom/mob/tools/b/a;)Z

    move-result v5

    invoke-static {v5}, Lcom/mob/tools/b/d;->a(Z)Z

    .line 70
    iget-object v5, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-virtual {v5, v9}, Lcom/mob/tools/b/d;->a(I)V

    .line 71
    invoke-static {}, Lcom/mob/tools/MobLog;->getInstance()Lcom/mob/tools/log/NLog;

    move-result-object v5

    const-string v6, "dhs fin"

    new-array v7, v10, [Ljava/lang/Object;

    invoke-virtual {v5, v6, v7}, Lcom/mob/tools/log/NLog;->d(Ljava/lang/Object;[Ljava/lang/Object;)I
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_3

    .line 72
    :cond_a
    :try_start_8
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v6

    if-eqz v6, :cond_b

    .line 73
    invoke-virtual {v5}, Ljava/io/File;->delete()Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 74
    :catchall_2
    :cond_b
    :try_start_9
    invoke-static {}, Lcom/mob/tools/MobLog;->getInstance()Lcom/mob/tools/log/NLog;

    move-result-object v5

    const-string v6, "dhs l fail"

    new-array v7, v10, [Ljava/lang/Object;

    invoke-virtual {v5, v6, v7}, Lcom/mob/tools/log/NLog;->d(Ljava/lang/Object;[Ljava/lang/Object;)I
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 75
    :cond_c
    :goto_3
    :try_start_a
    iget-object v5, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sub-long/2addr v6, v3

    invoke-static {v5, v6, v7}, Lcom/mob/tools/b/d;->a(Lcom/mob/tools/b/d;J)J

    .line 76
    invoke-static {}, Lcom/mob/tools/MobLog;->getInstance()Lcom/mob/tools/log/NLog;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "dhs ctd: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v1, Lcom/mob/tools/b/d$1;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-array v5, v10, [Ljava/lang/Object;

    invoke-virtual {v3, v4, v5}, Lcom/mob/tools/log/NLog;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 77
    iget-object v3, v1, Lcom/mob/tools/b/d$1;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v3}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 78
    iget-object v3, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {v3}, Lcom/mob/tools/b/d;->e(Lcom/mob/tools/b/d;)Ljava/util/concurrent/ConcurrentLinkedQueue;

    move-result-object v3

    iget-object v4, v1, Lcom/mob/tools/b/d$1;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v3, v4}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    .line 79
    invoke-static {}, Lcom/mob/tools/MobLog;->getInstance()Lcom/mob/tools/log/NLog;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "dhs tt "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {v5}, Lcom/mob/tools/b/d;->f(Lcom/mob/tools/b/d;)J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-array v5, v10, [Ljava/lang/Object;

    invoke-virtual {v3, v4, v5}, Lcom/mob/tools/log/NLog;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 80
    iget-object v3, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {v3}, Lcom/mob/tools/b/d;->f(Lcom/mob/tools/b/d;)J

    move-result-wide v3

    const-wide/16 v5, 0xdac

    cmp-long v7, v3, v5

    if-lez v7, :cond_d

    iget-object v3, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-virtual {v3}, Lcom/mob/tools/b/d;->b()I

    move-result v3

    if-ne v3, v9, :cond_d

    .line 81
    new-instance v3, Ljava/lang/StringBuilder;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "-t-"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {v5}, Lcom/mob/tools/b/d;->f(Lcom/mob/tools/b/d;)J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v4, "-d-"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    .line 82
    invoke-static {v4}, Lcom/mob/tools/b/d;->h(Lcom/mob/tools/b/d;)J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, "-l-"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {v4}, Lcom/mob/tools/b/d;->g(Lcom/mob/tools/b/d;)J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    invoke-static {}, Lcom/mob/commons/g;->a()Lcom/mob/commons/g;

    move-result-object v4

    new-instance v5, Ljava/lang/Throwable;

    .line 84
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v5, v3}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, ""

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {v6}, Lcom/mob/tools/b/d;->c(Lcom/mob/tools/b/d;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v6, 0xb

    const/4 v7, 0x3

    .line 85
    :goto_4
    invoke-virtual {v4, v7, v6, v5, v3}, Lcom/mob/commons/g;->a(IILjava/lang/Throwable;Ljava/lang/String;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    goto/16 :goto_5

    :catchall_3
    move-exception v0

    move-object v5, v0

    .line 86
    :try_start_b
    invoke-static {}, Lcom/mob/tools/MobLog;->getInstance()Lcom/mob/tools/log/NLog;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "dhs oops: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    new-array v8, v10, [Ljava/lang/Object;

    invoke-virtual {v6, v7, v8}, Lcom/mob/tools/log/NLog;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 87
    invoke-static {}, Lcom/mob/tools/MobLog;->getInstance()Lcom/mob/tools/log/NLog;

    move-result-object v6

    invoke-virtual {v6, v5}, Lcom/mob/tools/log/NLog;->d(Ljava/lang/Throwable;)I
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 88
    :try_start_c
    iget-object v5, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sub-long/2addr v6, v3

    invoke-static {v5, v6, v7}, Lcom/mob/tools/b/d;->a(Lcom/mob/tools/b/d;J)J

    .line 89
    invoke-static {}, Lcom/mob/tools/MobLog;->getInstance()Lcom/mob/tools/log/NLog;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "dhs ctd: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v1, Lcom/mob/tools/b/d$1;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-array v5, v10, [Ljava/lang/Object;

    invoke-virtual {v3, v4, v5}, Lcom/mob/tools/log/NLog;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 90
    iget-object v3, v1, Lcom/mob/tools/b/d$1;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v3}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 91
    iget-object v3, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {v3}, Lcom/mob/tools/b/d;->e(Lcom/mob/tools/b/d;)Ljava/util/concurrent/ConcurrentLinkedQueue;

    move-result-object v3

    iget-object v4, v1, Lcom/mob/tools/b/d$1;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v3, v4}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    .line 92
    invoke-static {}, Lcom/mob/tools/MobLog;->getInstance()Lcom/mob/tools/log/NLog;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "dhs tt "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {v5}, Lcom/mob/tools/b/d;->f(Lcom/mob/tools/b/d;)J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-array v5, v10, [Ljava/lang/Object;

    invoke-virtual {v3, v4, v5}, Lcom/mob/tools/log/NLog;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 93
    iget-object v3, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {v3}, Lcom/mob/tools/b/d;->f(Lcom/mob/tools/b/d;)J

    move-result-wide v3

    const-wide/16 v5, 0xdac

    cmp-long v7, v3, v5

    if-lez v7, :cond_d

    iget-object v3, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-virtual {v3}, Lcom/mob/tools/b/d;->b()I

    move-result v3

    if-ne v3, v9, :cond_d

    .line 94
    new-instance v3, Ljava/lang/StringBuilder;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "-t-"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {v5}, Lcom/mob/tools/b/d;->f(Lcom/mob/tools/b/d;)J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v4, "-d-"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    .line 95
    invoke-static {v4}, Lcom/mob/tools/b/d;->h(Lcom/mob/tools/b/d;)J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, "-l-"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {v4}, Lcom/mob/tools/b/d;->g(Lcom/mob/tools/b/d;)J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    invoke-static {}, Lcom/mob/commons/g;->a()Lcom/mob/commons/g;

    move-result-object v4

    new-instance v5, Ljava/lang/Throwable;

    .line 97
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v5, v3}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, ""

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {v6}, Lcom/mob/tools/b/d;->c(Lcom/mob/tools/b/d;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v6, 0xb

    const/4 v7, 0x3

    goto/16 :goto_4

    .line 98
    :cond_d
    :goto_5
    sget-object v3, Lcom/mob/tools/c/a;->c:Ljava/lang/ThreadLocal;

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v3, v4}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 99
    monitor-exit v2

    return-void

    :catchall_4
    move-exception v0

    move-object v5, v0

    .line 100
    iget-object v6, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    sub-long/2addr v7, v3

    invoke-static {v6, v7, v8}, Lcom/mob/tools/b/d;->a(Lcom/mob/tools/b/d;J)J

    .line 101
    invoke-static {}, Lcom/mob/tools/MobLog;->getInstance()Lcom/mob/tools/log/NLog;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "dhs ctd: "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v1, Lcom/mob/tools/b/d$1;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-array v6, v10, [Ljava/lang/Object;

    invoke-virtual {v3, v4, v6}, Lcom/mob/tools/log/NLog;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 102
    iget-object v3, v1, Lcom/mob/tools/b/d$1;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v3}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 103
    iget-object v3, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {v3}, Lcom/mob/tools/b/d;->e(Lcom/mob/tools/b/d;)Ljava/util/concurrent/ConcurrentLinkedQueue;

    move-result-object v3

    iget-object v4, v1, Lcom/mob/tools/b/d$1;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v3, v4}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    .line 104
    invoke-static {}, Lcom/mob/tools/MobLog;->getInstance()Lcom/mob/tools/log/NLog;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "dhs tt "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {v6}, Lcom/mob/tools/b/d;->f(Lcom/mob/tools/b/d;)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-array v6, v10, [Ljava/lang/Object;

    invoke-virtual {v3, v4, v6}, Lcom/mob/tools/log/NLog;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 105
    iget-object v3, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {v3}, Lcom/mob/tools/b/d;->f(Lcom/mob/tools/b/d;)J

    move-result-wide v3

    const-wide/16 v6, 0xdac

    cmp-long v8, v3, v6

    if-lez v8, :cond_e

    iget-object v3, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-virtual {v3}, Lcom/mob/tools/b/d;->b()I

    move-result v3

    if-ne v3, v9, :cond_e

    .line 106
    new-instance v3, Ljava/lang/StringBuilder;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "-t-"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {v6}, Lcom/mob/tools/b/d;->f(Lcom/mob/tools/b/d;)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v4, "-d-"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    .line 107
    invoke-static {v4}, Lcom/mob/tools/b/d;->h(Lcom/mob/tools/b/d;)J

    move-result-wide v6

    invoke-virtual {v3, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, "-l-"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {v4}, Lcom/mob/tools/b/d;->g(Lcom/mob/tools/b/d;)J

    move-result-wide v6

    invoke-virtual {v3, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    invoke-static {}, Lcom/mob/commons/g;->a()Lcom/mob/commons/g;

    move-result-object v4

    new-instance v6, Ljava/lang/Throwable;

    .line 109
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v6, v3}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, ""

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, v1, Lcom/mob/tools/b/d$1;->c:Lcom/mob/tools/b/d;

    invoke-static {v7}, Lcom/mob/tools/b/d;->c(Lcom/mob/tools/b/d;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v7, 0xb

    const/4 v8, 0x3

    .line 110
    invoke-virtual {v4, v8, v7, v6, v3}, Lcom/mob/commons/g;->a(IILjava/lang/Throwable;Ljava/lang/String;)V

    .line 111
    :cond_e
    throw v5

    :catchall_5
    move-exception v0

    move-object v3, v0

    .line 112
    monitor-exit v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    goto :goto_7

    :goto_6
    throw v3

    :goto_7
    goto :goto_6
.end method
