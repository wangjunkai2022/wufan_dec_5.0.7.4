.class Lcom/mob/commons/c$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mob/commons/c;->b(Ljava/lang/String;Ljava/io/File;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Ljava/io/File;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Ljava/lang/String;


# direct methods
.method constructor <init>(ZLjava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/mob/commons/c$2;->a:Z

    iput-object p2, p0, Lcom/mob/commons/c$2;->b:Ljava/io/File;

    iput-object p3, p0, Lcom/mob/commons/c$2;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/mob/commons/c$2;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/mob/commons/c$2;->e:Ljava/lang/String;

    iput-object p6, p0, Lcom/mob/commons/c$2;->f:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 13

    const/4 v0, 0x7

    const/4 v1, 0x5

    const/16 v2, 0xd

    .line 1
    :try_start_0
    iget-boolean v3, p0, Lcom/mob/commons/c$2;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_9

    const/16 v4, 0x3a98

    const v5, 0xea60

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v3, :cond_7

    .line 2
    :try_start_1
    iget-object v2, p0, Lcom/mob/commons/c$2;->b:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/mob/commons/c$2;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/mob/commons/c$2;->b:Ljava/io/File;

    invoke-static {v3}, Lcom/mob/tools/utils/Data;->MD5(Ljava/io/File;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/mob/commons/c$2;->e:Ljava/lang/String;

    iget-object v2, p0, Lcom/mob/commons/c$2;->b:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/mob/commons/c$2;->f:Ljava/lang/String;

    invoke-static {v0, v1, v2, v8, v3}, Lcom/mob/commons/c;->a(Ljava/lang/String;ILjava/lang/String;[BLjava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 4
    iget-object v0, p0, Lcom/mob/commons/c$2;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    goto/16 :goto_5

    :cond_1
    :goto_0
    const/4 v2, 0x6

    .line 5
    :try_start_2
    iget-object v3, p0, Lcom/mob/commons/c$2;->b:Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 6
    iget-object v3, p0, Lcom/mob/commons/c$2;->b:Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->delete()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_9

    :cond_2
    const-wide/16 v9, 0x0

    .line 7
    :try_start_3
    new-instance v3, Ljava/io/FileOutputStream;

    iget-object v11, p0, Lcom/mob/commons/c$2;->b:Ljava/io/File;

    invoke-direct {v3, v11}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 8
    :try_start_4
    new-instance v11, Lcom/mob/tools/network/NetworkHelper$NetworkTimeOut;

    invoke-direct {v11}, Lcom/mob/tools/network/NetworkHelper$NetworkTimeOut;-><init>()V

    .line 9
    iput v5, v11, Lcom/mob/tools/network/NetworkHelper$NetworkTimeOut;->readTimout:I

    .line 10
    iput v4, v11, Lcom/mob/tools/network/NetworkHelper$NetworkTimeOut;->connectionTimeout:I

    .line 11
    new-instance v4, Lcom/mob/tools/network/NetworkHelper;

    invoke-direct {v4}, Lcom/mob/tools/network/NetworkHelper;-><init>()V

    iget-object v5, p0, Lcom/mob/commons/c$2;->d:Ljava/lang/String;

    invoke-virtual {v4, v5, v3, v11}, Lcom/mob/tools/network/NetworkHelper;->download(Ljava/lang/String;Ljava/io/OutputStream;Lcom/mob/tools/network/NetworkHelper$NetworkTimeOut;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    new-array v4, v7, [Ljava/io/Closeable;

    aput-object v3, v4, v6

    .line 12
    invoke-static {v4}, Lcom/mob/commons/v;->a([Ljava/io/Closeable;)V

    .line 13
    iget-object v3, p0, Lcom/mob/commons/c$2;->b:Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->length()J

    move-result-wide v3

    cmp-long v5, v3, v9

    if-lez v5, :cond_3

    iget-object v3, p0, Lcom/mob/commons/c$2;->c:Ljava/lang/String;

    iget-object v4, p0, Lcom/mob/commons/c$2;->b:Ljava/io/File;

    invoke-static {v4}, Lcom/mob/tools/utils/Data;->MD5(Ljava/io/File;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_9

    if-eqz v3, :cond_3

    .line 14
    :try_start_6
    iget-object v2, p0, Lcom/mob/commons/c$2;->e:Ljava/lang/String;

    iget-object v3, p0, Lcom/mob/commons/c$2;->b:Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/mob/commons/c$2;->f:Ljava/lang/String;

    invoke-static {v2, v0, v3, v8, v4}, Lcom/mob/commons/c;->a(Ljava/lang/String;ILjava/lang/String;[BLjava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_9

    .line 15
    iget-object v2, p0, Lcom/mob/commons/c$2;->b:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->delete()Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto/16 :goto_5

    .line 16
    :cond_3
    :try_start_7
    iget-object v0, p0, Lcom/mob/commons/c$2;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 17
    iget-object v0, p0, Lcom/mob/commons/c$2;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    goto/16 :goto_5

    :catchall_0
    move-exception v4

    goto :goto_1

    :catchall_1
    move-exception v4

    move-object v3, v8

    :goto_1
    new-array v5, v7, [Ljava/io/Closeable;

    aput-object v3, v5, v6

    .line 18
    invoke-static {v5}, Lcom/mob/commons/v;->a([Ljava/io/Closeable;)V

    .line 19
    iget-object v3, p0, Lcom/mob/commons/c$2;->b:Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->length()J

    move-result-wide v5

    cmp-long v3, v5, v9

    if-lez v3, :cond_4

    iget-object v3, p0, Lcom/mob/commons/c$2;->c:Ljava/lang/String;

    iget-object v5, p0, Lcom/mob/commons/c$2;->b:Ljava/io/File;

    invoke-static {v5}, Lcom/mob/tools/utils/Data;->MD5(Ljava/io/File;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_9

    if-eqz v3, :cond_4

    .line 20
    :try_start_8
    iget-object v2, p0, Lcom/mob/commons/c$2;->e:Ljava/lang/String;

    iget-object v3, p0, Lcom/mob/commons/c$2;->b:Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    iget-object v5, p0, Lcom/mob/commons/c$2;->f:Ljava/lang/String;

    invoke-static {v2, v0, v3, v8, v5}, Lcom/mob/commons/c;->a(Ljava/lang/String;ILjava/lang/String;[BLjava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 21
    iget-object v2, p0, Lcom/mob/commons/c$2;->b:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->delete()Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v2

    move-object v0, v2

    const/4 v2, 0x7

    goto/16 :goto_4

    .line 22
    :cond_4
    :try_start_9
    iget-object v0, p0, Lcom/mob/commons/c$2;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 23
    iget-object v0, p0, Lcom/mob/commons/c$2;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    :cond_5
    const/4 v0, 0x6

    .line 24
    :cond_6
    :goto_2
    :try_start_a
    throw v4
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    :catchall_3
    move-exception v2

    move-object v12, v2

    move v2, v0

    move-object v0, v12

    goto :goto_4

    :catchall_4
    move-exception v0

    const/4 v2, 0x5

    goto :goto_4

    .line 25
    :cond_7
    :try_start_b
    iget-object v0, p0, Lcom/mob/commons/c$2;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 26
    iget-object v0, p0, Lcom/mob/commons/c$2;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    :cond_8
    const/16 v0, 0x8

    .line 27
    :try_start_c
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    .line 28
    :try_start_d
    new-instance v3, Lcom/mob/tools/network/NetworkHelper$NetworkTimeOut;

    invoke-direct {v3}, Lcom/mob/tools/network/NetworkHelper$NetworkTimeOut;-><init>()V

    .line 29
    iput v5, v3, Lcom/mob/tools/network/NetworkHelper$NetworkTimeOut;->readTimout:I

    .line 30
    iput v4, v3, Lcom/mob/tools/network/NetworkHelper$NetworkTimeOut;->connectionTimeout:I

    .line 31
    new-instance v4, Lcom/mob/tools/network/NetworkHelper;

    invoke-direct {v4}, Lcom/mob/tools/network/NetworkHelper;-><init>()V

    iget-object v5, p0, Lcom/mob/commons/c$2;->d:Ljava/lang/String;

    invoke-virtual {v4, v5, v2, v3}, Lcom/mob/tools/network/NetworkHelper;->download(Ljava/lang/String;Ljava/io/OutputStream;Lcom/mob/tools/network/NetworkHelper$NetworkTimeOut;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    :try_start_e
    new-array v3, v7, [Ljava/io/Closeable;

    aput-object v2, v3, v6

    .line 32
    invoke-static {v3}, Lcom/mob/commons/v;->a([Ljava/io/Closeable;)V

    .line 33
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    .line 34
    array-length v3, v2

    if-lez v3, :cond_9

    iget-object v3, p0, Lcom/mob/commons/c$2;->c:Ljava/lang/String;

    invoke-static {v2}, Lcom/mob/tools/utils/Data;->MD5([B)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    if-eqz v0, :cond_9

    const/16 v0, 0x9

    .line 35
    :try_start_f
    iget-object v3, p0, Lcom/mob/commons/c$2;->e:Ljava/lang/String;

    iget-object v4, p0, Lcom/mob/commons/c$2;->f:Ljava/lang/String;

    invoke-static {v3, v0, v8, v2, v4}, Lcom/mob/commons/c;->a(Ljava/lang/String;ILjava/lang/String;[BLjava/lang/String;)Z
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    goto :goto_5

    :catchall_5
    move-exception v2

    move-object v0, v2

    const/16 v2, 0x9

    goto :goto_4

    :catchall_6
    move-exception v3

    move-object v8, v2

    goto :goto_3

    :catchall_7
    move-exception v3

    :goto_3
    :try_start_10
    new-array v2, v7, [Ljava/io/Closeable;

    aput-object v8, v2, v6

    .line 36
    invoke-static {v2}, Lcom/mob/commons/v;->a([Ljava/io/Closeable;)V

    .line 37
    throw v3
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    :catchall_8
    move-exception v2

    move-object v0, v2

    const/16 v2, 0x8

    goto :goto_4

    :catchall_9
    move-exception v0

    .line 38
    :goto_4
    invoke-static {}, Lcom/mob/commons/g;->a()Lcom/mob/commons/g;

    move-result-object v3

    iget-object v4, p0, Lcom/mob/commons/c$2;->e:Ljava/lang/String;

    invoke-virtual {v3, v1, v2, v0, v4}, Lcom/mob/commons/g;->a(IILjava/lang/Throwable;Ljava/lang/String;)V

    .line 39
    invoke-static {}, Lcom/mob/tools/MobLog;->getInstance()Lcom/mob/tools/log/NLog;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/mob/tools/log/NLog;->d(Ljava/lang/Throwable;)I

    :cond_9
    :goto_5
    return-void
.end method
