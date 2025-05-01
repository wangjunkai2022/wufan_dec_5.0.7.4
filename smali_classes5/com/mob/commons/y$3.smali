.class Lcom/mob/commons/y$3;
.super Lcom/mob/tools/utils/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mob/commons/y;->m()Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:[Ljava/lang/String;

.field final synthetic b:Ljava/util/concurrent/CountDownLatch;

.field final synthetic c:Lcom/mob/commons/y;


# direct methods
.method constructor <init>(Lcom/mob/commons/y;[Ljava/lang/String;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/mob/commons/y$3;->c:Lcom/mob/commons/y;

    iput-object p2, p0, Lcom/mob/commons/y$3;->a:[Ljava/lang/String;

    iput-object p3, p0, Lcom/mob/commons/y$3;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-direct {p0}, Lcom/mob/tools/utils/i;-><init>()V

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 15

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-string v2, "061h)fjkgeeiigiiiEg)fgjlik4gdRemeeThCiigj?dgKfgedimemejfkejggjliikgjlieem0j3fkfj2dRfjijggKdWggemelgjfkijedifigif-d%iiigigjljl?d\'iggi"

    .line 2
    invoke-static {v2}, Lcom/mob/commons/a/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 3
    new-instance v3, Ljava/util/UUID;

    const-wide v4, -0x121074568629b532L    # -3.563403477674908E221

    const-wide v6, -0x5c37d8232ae2de13L

    invoke-direct {v3, v4, v5, v6, v7}, Ljava/util/UUID;-><init>(JJ)V

    const/16 v4, 0x1c

    const/4 v5, 0x0

    .line 4
    :try_start_0
    new-instance v13, Landroid/media/MediaDrm;

    invoke-direct {v13, v3}, Landroid/media/MediaDrm;-><init>(Ljava/util/UUID;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    :try_start_1
    invoke-static {}, Lcom/mob/MobSDK;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, Lcom/mob/tools/a/d;->a(Landroid/content/Context;)Lcom/mob/tools/a/d;

    move-result-object v6

    .line 6
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    const-string v5, "012fej]ejeeFgVeigj8gj:ehFk"

    invoke-static {v5}, Lcom/mob/commons/a/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const/4 v5, 0x3

    new-array v10, v5, [Ljava/lang/Class;

    const-class v8, Ljava/lang/Object;

    const/4 v14, 0x0

    aput-object v8, v10, v14

    const-class v8, [B

    const/4 v11, 0x1

    aput-object v8, v10, v11

    const-class v8, Ljava/lang/String;

    const/4 v12, 0x2

    aput-object v8, v10, v12

    new-array v5, v5, [Ljava/lang/Object;

    new-instance v8, Ljava/lang/ref/WeakReference;

    invoke-direct {v8, v13}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    aput-object v8, v5, v14

    iget-object v8, p0, Lcom/mob/commons/y$3;->c:Lcom/mob/commons/y;

    .line 7
    invoke-static {v8, v3}, Lcom/mob/commons/y;->a(Lcom/mob/commons/y;Ljava/util/UUID;)[B

    move-result-object v3

    aput-object v3, v5, v11

    aput-object v2, v5, v12

    const/4 v12, 0x0

    move-object v8, v13

    move-object v11, v5

    .line 8
    invoke-virtual/range {v6 .. v12}, Lcom/mob/tools/a/d;->a(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "014EedPgHeeejYdg5fl=f;ejefehTg$ffed"

    .line 9
    invoke-static {v2}, Lcom/mob/commons/a/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v13, v2}, Landroid/media/MediaDrm;->getPropertyByteArray(Ljava/lang/String;)[B

    move-result-object v2

    .line 10
    iget-object v3, p0, Lcom/mob/commons/y$3;->a:[Ljava/lang/String;

    array-length v5, v2

    invoke-static {v2, v14, v5}, Lcom/mob/tools/utils/Data;->byteToHex([BII)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v3, v14

    .line 11
    invoke-static {}, Lcom/mob/tools/MobLog;->getInstance()Lcom/mob/tools/log/NLog;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "rddd wv c "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    sub-long/2addr v5, v0

    invoke-virtual {v3, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v14, [Ljava/lang/Object;

    invoke-virtual {v2, v0, v1}, Lcom/mob/tools/log/NLog;->d(Ljava/lang/Object;[Ljava/lang/Object;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    :try_start_2
    iget-object v0, p0, Lcom/mob/commons/y$3;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 13
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v4, :cond_0

    .line 14
    invoke-virtual {v13}, Landroid/media/MediaDrm;->close()V

    goto :goto_1

    .line 15
    :cond_0
    invoke-virtual {v13}, Landroid/media/MediaDrm;->release()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v5, v13

    goto :goto_0

    :catchall_1
    move-exception v0

    .line 16
    :goto_0
    :try_start_3
    invoke-static {}, Lcom/mob/tools/MobLog;->getInstance()Lcom/mob/tools/log/NLog;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/mob/tools/log/NLog;->d(Ljava/lang/Throwable;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 17
    :try_start_4
    iget-object v0, p0, Lcom/mob/commons/y$3;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 18
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v4, :cond_1

    if-eqz v5, :cond_2

    .line 19
    invoke-virtual {v5}, Landroid/media/MediaDrm;->close()V

    goto :goto_1

    :cond_1
    if-eqz v5, :cond_2

    .line 20
    invoke-virtual {v5}, Landroid/media/MediaDrm;->release()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception v0

    .line 21
    invoke-static {}, Lcom/mob/tools/MobLog;->getInstance()Lcom/mob/tools/log/NLog;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/mob/tools/log/NLog;->d(Ljava/lang/Throwable;)I

    :cond_2
    :goto_1
    return-void

    :catchall_3
    move-exception v0

    .line 22
    :try_start_5
    iget-object v1, p0, Lcom/mob/commons/y$3;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 23
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v1, v4, :cond_3

    if-eqz v5, :cond_4

    .line 24
    invoke-virtual {v5}, Landroid/media/MediaDrm;->close()V

    goto :goto_2

    :cond_3
    if-eqz v5, :cond_4

    .line 25
    invoke-virtual {v5}, Landroid/media/MediaDrm;->release()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    goto :goto_2

    :catchall_4
    move-exception v1

    .line 26
    invoke-static {}, Lcom/mob/tools/MobLog;->getInstance()Lcom/mob/tools/log/NLog;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/mob/tools/log/NLog;->d(Ljava/lang/Throwable;)I

    .line 27
    :cond_4
    :goto_2
    throw v0
.end method
