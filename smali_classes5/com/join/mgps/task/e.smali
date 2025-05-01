.class public Lcom/join/mgps/task/e;
.super Ljava/lang/Thread;
.source "UNAndroidZIPThread.java"

# interfaces
.implements Lcom/join/mgps/task/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/task/e$a;
    }
.end annotation


# instance fields
.field private b:Landroid/content/Context;

.field private c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

.field public d:Z

.field public e:Z

.field f:Lcom/join/mgps/task/e$a;


# direct methods
.method public constructor <init>(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/task/e;->d:Z

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/join/mgps/task/e;->e:Z

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lcom/join/mgps/task/e;->f:Lcom/join/mgps/task/e$a;

    .line 5
    iput-object p1, p0, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 6
    iput-object p2, p0, Lcom/join/mgps/task/e;->b:Landroid/content/Context;

    return-void
.end method

.method public constructor <init>(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;Z)V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lcom/join/mgps/task/e;->d:Z

    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/join/mgps/task/e;->e:Z

    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lcom/join/mgps/task/e;->f:Lcom/join/mgps/task/e$a;

    .line 11
    iput-object p1, p0, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 12
    iput-object p2, p0, Lcom/join/mgps/task/e;->b:Landroid/content/Context;

    .line 13
    iput-boolean p3, p0, Lcom/join/mgps/task/e;->e:Z

    return-void
.end method

.method static synthetic b(Lcom/join/mgps/task/e;)Lcom/github/snowdream/android/app/downloader/DownloadTask;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    return-object p0
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 16

    const-string v0, "-"

    move-object/from16 v1, p1

    .line 1
    invoke-virtual {v1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 2
    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string v0, ""

    .line 3
    invoke-interface {v1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    const-string v2, "999"

    .line 4
    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_0

    .line 5
    invoke-interface {v1, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    const/4 v11, 0x1

    goto :goto_0

    :cond_0
    const/4 v11, 0x0

    :goto_0
    new-array v2, v4, [Ljava/lang/String;

    .line 6
    invoke-interface {v1, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    .line 7
    array-length v2, v1

    const-string v3, "\u6a21\u5757"

    const-string v6, "\u6700\u65b0\u7f51\u6e38"

    const-string v7, "\u5927\u5bb6\u90fd\u5728\u73a9"

    const-string v8, "home"

    const-string v9, "0"

    const-string v10, "\u7f51\u6e38\u63a8\u8350"

    if-lez v2, :cond_11

    .line 8
    array-length v2, v1

    const-string v12, "4"

    const/4 v13, 0x2

    if-le v2, v13, :cond_4

    aget-object v2, v1, v4

    const-string v14, "22"

    invoke-virtual {v14, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 9
    aget-object v2, v1, v5

    invoke-virtual {v12, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v0, v7

    goto :goto_1

    .line 10
    :cond_1
    aget-object v2, v1, v5

    const-string v3, "13"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    move-object v0, v6

    goto :goto_1

    .line 11
    :cond_2
    aget-object v2, v1, v5

    const-string v3, "99"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const-string v0, "\u641c\u7d22\u9875"

    .line 12
    :cond_3
    :goto_1
    aget-object v1, v1, v13

    :goto_2
    move-object v9, v0

    move-object v10, v1

    goto/16 :goto_6

    .line 13
    :cond_4
    aget-object v2, v1, v4

    invoke-static {v2, v8}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_e

    aget-object v2, v1, v4

    const-string v14, "ranking"

    invoke-static {v2, v14}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_5

    goto/16 :goto_5

    .line 14
    :cond_5
    aget-object v2, v1, v4

    invoke-virtual {v2, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 15
    array-length v0, v1

    if-le v0, v5, :cond_6

    aget-object v0, v1, v5

    move-object v10, v0

    goto :goto_3

    :cond_6
    move-object v10, v9

    :goto_3
    move-object v9, v7

    goto/16 :goto_6

    .line 16
    :cond_7
    aget-object v2, v1, v4

    const-string v7, "7"

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 17
    array-length v0, v1

    if-le v0, v5, :cond_8

    aget-object v0, v1, v5

    move-object v9, v10

    move-object v10, v0

    goto/16 :goto_6

    :cond_8
    move-object v15, v10

    move-object v10, v9

    move-object v9, v15

    goto :goto_6

    .line 18
    :cond_9
    aget-object v2, v1, v4

    const-string v7, "5"

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    .line 19
    array-length v0, v1

    if-le v0, v5, :cond_a

    aget-object v0, v1, v5

    move-object v10, v0

    goto :goto_4

    :cond_a
    move-object v10, v9

    :goto_4
    move-object v9, v6

    goto :goto_6

    .line 20
    :cond_b
    aget-object v2, v1, v4

    invoke-virtual {v2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_11

    .line 21
    array-length v0, v1

    if-le v0, v13, :cond_c

    .line 22
    aget-object v9, v1, v13

    .line 23
    :cond_c
    array-length v0, v1

    const/4 v2, 0x3

    if-le v0, v2, :cond_d

    .line 24
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v3, v1, v5

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 25
    aget-object v1, v1, v2

    goto :goto_2

    :cond_d
    move-object v10, v9

    move-object v9, v3

    goto :goto_6

    .line 26
    :cond_e
    :goto_5
    aget-object v2, v1, v4

    .line 27
    array-length v3, v1

    if-le v3, v5, :cond_f

    .line 28
    aget-object v0, v1, v5

    .line 29
    :cond_f
    array-length v3, v1

    if-le v3, v13, :cond_10

    .line 30
    aget-object v1, v1, v13

    move-object v9, v0

    move-object v10, v1

    move-object v8, v2

    goto :goto_6

    :cond_10
    move-object v8, v2

    :cond_11
    move-object v10, v9

    move-object v9, v0

    .line 31
    :goto_6
    invoke-static {v8}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "volcannoEvent"

    invoke-static {v1, v0}, Lcom/join/mgps/Util/v0;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    new-instance v0, Lcom/psk/eventmodule/StatFactory$VolcanoOther;

    invoke-direct {v0}, Lcom/psk/eventmodule/StatFactory$VolcanoOther;-><init>()V

    .line 34
    invoke-static/range {p3 .. p3}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_12

    .line 35
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v0

    const-class v1, Lcom/psk/eventmodule/StatFactory$VolcanoOther;

    move-object/from16 v2, p3

    invoke-virtual {v0, v2, v1}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/psk/eventmodule/StatFactory$VolcanoOther;

    :cond_12
    move-object v5, v0

    .line 36
    sget-object v0, Lcom/psk/eventmodule/StatFactory;->Companion:Lcom/psk/eventmodule/StatFactory$Companion;

    move-object/from16 v12, p0

    iget-object v1, v12, Lcom/join/mgps/task/e;->b:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/psk/eventmodule/StatFactory$Companion;->getInstance(Landroid/content/Context;)Lcom/psk/eventmodule/StatFactory;

    move-result-object v0

    new-instance v13, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;

    sget-object v2, Lcom/psk/eventmodule/Event;->conversion:Lcom/psk/eventmodule/Event;

    new-instance v4, Lcom/psk/eventmodule/StatFactory$SpmData;

    const-string v7, "wufun"

    move-object v6, v4

    invoke-direct/range {v6 .. v11}, Lcom/psk/eventmodule/StatFactory$SpmData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object v1, v13

    move-object/from16 v3, p2

    move/from16 v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;-><init>(Lcom/psk/eventmodule/Event;Ljava/lang/String;Lcom/psk/eventmodule/StatFactory$SpmData;Lcom/psk/eventmodule/StatFactory$VolcanoOther;Z)V

    invoke-virtual {v0, v13}, Lcom/psk/eventmodule/StatFactory;->sendEvent(Lcom/psk/eventmodule/StatFactory$VolcanoEvent;)V

    goto :goto_7

    :cond_13
    move-object/from16 v12, p0

    :goto_7
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/join/mgps/task/e;->d:Z

    .line 2
    iget-object v1, p0, Lcom/join/mgps/task/e;->f:Lcom/join/mgps/task/e$a;

    invoke-virtual {v1, v0}, Lcom/join/mgps/task/e$a;->a(Z)V

    .line 3
    iget-object v1, p0, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->set_from_type(I)V

    :cond_0
    return-void
.end method

.method public isRunning()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/task/e;->d:Z

    return v0
.end method

.method public run()V
    .locals 23

    move-object/from16 v1, p0

    const-string v2, "]::"

    const-string v3, ",size="

    const-string v4, "zip error[gameId="

    .line 1
    invoke-super/range {p0 .. p0}, Ljava/lang/Thread;->run()V

    const-string v5, "unzipfailedxx"

    const-string v6, "start run"

    .line 2
    invoke-static {v5, v6}, Lcom/join/mgps/Util/v0;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    new-instance v6, Ljava/io/File;

    iget-object v7, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPath()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    iget-object v7, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v7}, Lcom/join/android/app/common/utils/APKUtils;->G(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v7

    const/4 v8, 0x1

    if-eqz v7, :cond_0

    :goto_0
    const/4 v7, 0x1

    goto :goto_1

    .line 5
    :cond_0
    iget-object v7, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v7}, Lcom/join/android/app/common/utils/APKUtils;->L(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_0

    :cond_1
    const/4 v7, 0x0

    .line 6
    :goto_1
    :try_start_0
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v11

    if-eqz v11, :cond_12

    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    .line 8
    iget-object v11, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v11}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->get_from_type()I

    move-result v11
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_a
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eq v11, v8, :cond_2

    .line 9
    :try_start_1
    iget-object v11, v1, Lcom/join/mgps/task/e;->b:Landroid/content/Context;

    invoke-static {v11}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v11

    iget-object v10, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v10}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v10

    iget-object v12, v1, Lcom/join/mgps/task/e;->b:Landroid/content/Context;

    invoke-static {v12}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v12

    invoke-virtual {v12}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v10, v12, v7}, Lcom/papa/sim/statistic/p;->j1(Ljava/lang/String;Ljava/lang/String;I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :catch_0
    move-exception v0

    move-object/from16 v21, v2

    const/4 v10, 0x0

    :goto_2
    move-object v2, v0

    goto/16 :goto_17

    .line 10
    :cond_2
    :goto_3
    :try_start_2
    iget-object v10, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v10}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getRomType()Ljava/lang/String;

    move-result-object v10

    sget-object v11, Lcom/join/mgps/enums/Dtype;->androidobb:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_a
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v10, :cond_5

    .line 11
    :try_start_3
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v10

    iget-object v11, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v11}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFileType()Ljava/lang/String;

    move-result-object v11

    sget-object v12, Lcom/join/mgps/enums/Dtype;->MOD:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v12}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_4

    iget-object v11, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v11}, Lcom/join/android/app/common/utils/APKUtils;->L(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v11

    if-eqz v11, :cond_3

    goto :goto_4

    :cond_3
    const/4 v11, 0x0

    goto :goto_5

    :cond_4
    :goto_4
    const/4 v11, 0x1

    :goto_5
    invoke-virtual {v10, v11}, Lcom/join/mgps/va/overmind/d;->r(Z)Ljava/lang/String;

    move-result-object v10
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 12
    :try_start_4
    new-instance v11, Ljava/io/File;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, "/"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v13, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v13}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-direct {v11, v12}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 13
    invoke-virtual {v11}, Ljava/io/File;->exists()Z

    move-result v12

    if-eqz v12, :cond_c

    .line 14
    invoke-virtual {v11}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v11

    if-eqz v11, :cond_c

    .line 15
    array-length v12, v11

    const/4 v13, 0x0

    :goto_6
    if-ge v13, v12, :cond_c

    aget-object v16, v11, v13

    .line 16
    invoke-virtual/range {v16 .. v16}, Ljava/io/File;->delete()Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    add-int/lit8 v13, v13, 0x1

    goto :goto_6

    :catch_1
    move-exception v0

    move-object/from16 v21, v2

    goto :goto_2

    .line 17
    :cond_5
    :try_start_5
    iget-object v10, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v10}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getRomType()Ljava/lang/String;

    move-result-object v10

    sget-object v11, Lcom/join/mgps/enums/Dtype;->androiddata:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_a
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-eqz v10, :cond_8

    .line 18
    :try_start_6
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v10

    iget-object v11, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v11}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFileType()Ljava/lang/String;

    move-result-object v11

    sget-object v12, Lcom/join/mgps/enums/Dtype;->MOD:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v12}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_7

    iget-object v11, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v11}, Lcom/join/android/app/common/utils/APKUtils;->L(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v11

    if-eqz v11, :cond_6

    goto :goto_7

    :cond_6
    const/4 v11, 0x0

    goto :goto_8

    :cond_7
    :goto_7
    const/4 v11, 0x1

    :goto_8
    invoke-virtual {v10, v11}, Lcom/join/mgps/va/overmind/d;->p(Z)Ljava/lang/String;

    move-result-object v10
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_b

    .line 19
    :cond_8
    :try_start_7
    iget-object v10, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v10}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getRomType()Ljava/lang/String;

    move-result-object v10

    sget-object v11, Lcom/join/mgps/enums/Dtype;->androidobbdata:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_a
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    if-eqz v10, :cond_b

    .line 20
    :try_start_8
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v10

    iget-object v11, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v11}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFileType()Ljava/lang/String;

    move-result-object v11

    sget-object v12, Lcom/join/mgps/enums/Dtype;->MOD:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v12}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_a

    iget-object v11, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v11}, Lcom/join/android/app/common/utils/APKUtils;->L(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v11

    if-eqz v11, :cond_9

    goto :goto_9

    :cond_9
    const/4 v11, 0x0

    goto :goto_a

    :cond_a
    :goto_9
    const/4 v11, 0x1

    :goto_a
    invoke-virtual {v10, v11}, Lcom/join/mgps/va/overmind/d;->q(Z)Ljava/lang/String;

    move-result-object v10
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    goto :goto_b

    :cond_b
    const/4 v10, 0x0

    .line 21
    :cond_c
    :goto_b
    :try_start_9
    new-instance v11, Ljava/io/File;

    invoke-direct {v11, v10}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 22
    invoke-virtual {v11}, Ljava/io/File;->exists()Z

    move-result v12

    if-nez v12, :cond_d

    .line 23
    invoke-virtual {v11}, Ljava/io/File;->mkdirs()Z

    .line 24
    :cond_d
    iget-object v11, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v11}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v11
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    const-wide v17, 0x80000000L

    cmp-long v13, v11, v17

    if-lez v13, :cond_e

    .line 25
    :try_start_a
    invoke-static {v6, v10}, Lcom/join/mgps/Util/t;->c(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_2
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    :goto_c
    const/4 v12, 0x1

    goto :goto_e

    .line 26
    :catch_2
    :try_start_b
    invoke-static {v6, v10}, Lcom/join/mgps/Util/w2;->b(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_1
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    goto :goto_d

    .line 27
    :cond_e
    :try_start_c
    invoke-static {v6, v10}, Lcom/join/mgps/Util/w2;->b(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_3
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    :goto_d
    const/4 v12, 0x0

    goto :goto_e

    .line 28
    :catch_3
    :try_start_d
    invoke-static {v6, v10}, Lcom/join/mgps/Util/t;->c(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    goto :goto_c

    .line 29
    :goto_e
    iget-object v13, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v13}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v17

    const-wide/32 v19, 0x6400000

    cmp-long v13, v17, v19

    if-ltz v13, :cond_f

    .line 30
    new-instance v13, Lcom/join/mgps/task/e$a;

    new-instance v9, Ljava/io/File;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    move-wide/from16 v19, v14

    sget-object v14, Lcom/join/mgps/Util/v;->p:Ljava/lang/String;

    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v14, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v15, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v15}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v9, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v8, Ljava/io/File;

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_1
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    move-object/from16 v21, v2

    :try_start_e
    sget-object v2, Lcom/join/mgps/Util/v;->q:Ljava/lang/String;

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v8, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v11}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v13, v1, v9, v8, v2}, Lcom/join/mgps/task/e$a;-><init>(Lcom/join/mgps/task/e;Ljava/io/File;Ljava/io/File;Ljava/io/File;)V

    iput-object v13, v1, Lcom/join/mgps/task/e;->f:Lcom/join/mgps/task/e$a;

    .line 31
    invoke-virtual {v13}, Ljava/lang/Thread;->start()V

    goto :goto_f

    :cond_f
    move-object/from16 v21, v2

    move-wide/from16 v19, v14

    const/4 v2, 0x1

    .line 32
    iput-boolean v2, v1, Lcom/join/mgps/task/e;->d:Z

    :goto_f
    if-eqz v12, :cond_10

    .line 33
    invoke-static {v1, v6, v10}, Lcom/join/mgps/Util/t;->f(Lcom/join/mgps/task/e;Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_10

    .line 34
    :cond_10
    invoke-static {v1, v6, v10}, Lcom/join/mgps/Util/w2;->e(Lcom/join/mgps/task/e;Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 35
    :goto_10
    invoke-static {v2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_11

    .line 36
    iget-object v8, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v8, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setGameZipPath(Ljava/lang/String;)V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_4
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    :cond_11
    move-wide/from16 v14, v19

    move-object/from16 v22, v10

    move-object v10, v2

    move-object/from16 v2, v22

    goto :goto_11

    :catch_4
    move-exception v0

    goto/16 :goto_2

    :cond_12
    const/4 v2, 0x0

    const/4 v10, 0x0

    const-wide/16 v14, -0x1

    .line 37
    :goto_11
    :try_start_f
    iget-object v3, v1, Lcom/join/mgps/task/e;->f:Lcom/join/mgps/task/e$a;

    if-eqz v3, :cond_13

    const/4 v4, 0x0

    .line 38
    invoke-virtual {v3, v4}, Lcom/join/mgps/task/e$a;->a(Z)V

    .line 39
    :cond_13
    iget-boolean v3, v1, Lcom/join/mgps/task/e;->d:Z
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_9
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    if-nez v3, :cond_14

    .line 40
    :goto_12
    iget-object v2, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->set_from_type(I)V

    return-void

    .line 41
    :cond_14
    :try_start_10
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v10}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    if-eqz v10, :cond_1e

    const-string v4, ""

    .line 42
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1e

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_15

    goto/16 :goto_15

    :cond_15
    const-wide/16 v3, -0x1

    cmp-long v2, v14, v3

    if-eqz v2, :cond_16

    .line 43
    iget-object v2, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v6}, Ljava/io/File;->length()J

    move-result-wide v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    sub-long/2addr v7, v14

    div-long/2addr v3, v7

    invoke-virtual {v2, v3, v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setZipCost(J)V

    .line 44
    :cond_16
    iget-object v2, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v2}, Lcom/join/android/app/common/utils/APKUtils;->G(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v2

    if-nez v2, :cond_17

    iget-object v2, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v2}, Lcom/join/android/app/common/utils/APKUtils;->L(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v2

    if-nez v2, :cond_17

    .line 45
    invoke-static {v6}, Lcom/join/mgps/Util/UtilsMy;->delete(Ljava/io/File;)Z

    .line 46
    :cond_17
    iget-object v2, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2, v10}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setGameZipPath(Ljava/lang/String;)V

    .line 47
    iget-object v2, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->get_from_type()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_1a

    .line 48
    iget-object v2, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getExt()Ljava/lang/String;

    move-result-object v2

    .line 49
    invoke-static {v2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_18

    .line 50
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v3

    const-class v4, Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {v3, v2, v4}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/ExtBean;

    if-eqz v2, :cond_18

    .line 51
    invoke-virtual {v2}, Lcom/join/mgps/dto/ExtBean;->getRecPosition()Ljava/lang/String;

    move-result-object v3

    .line 52
    invoke-static {v3}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_18

    .line 53
    iget-object v4, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lcom/join/mgps/dto/ExtBean;->getVolcanoOther()Ljava/lang/String;

    move-result-object v2

    iget-object v5, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTipBeans()Ljava/util/ArrayList;

    move-result-object v5

    invoke-static {v5}, Lcom/join/mgps/Util/UtilsMy;->k2(Ljava/util/List;)Z

    move-result v5

    invoke-direct {v1, v3, v4, v2, v5}, Lcom/join/mgps/task/e;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 54
    :cond_18
    iget-object v2, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v2, :cond_19

    .line 55
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_19

    iget-object v2, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 56
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    const-string v3, "/Quark/Download"

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_19

    .line 57
    iget-object v2, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getExt()Ljava/lang/String;

    move-result-object v2
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_8
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 58
    :try_start_11
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_19

    .line 59
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v2, "qkPosition"

    const-string v4, "qk"

    .line 60
    invoke-virtual {v3, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_5
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    .line 61
    :catch_5
    :cond_19
    :try_start_12
    iget-object v2, v1, Lcom/join/mgps/task/e;->b:Landroid/content/Context;

    iget-object v3, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    sget-object v4, Lcom/papa/sim/statistic/Event;->gameDownload:Lcom/papa/sim/statistic/Event;

    invoke-static {v2, v3, v4}, Lcom/join/android/app/common/servcie/r;->b(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/papa/sim/statistic/Event;)V

    .line 62
    :cond_1a
    iget-object v2, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const-wide/16 v3, 0x64

    invoke-virtual {v2, v3, v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setProgress(J)V

    .line 63
    iget-object v2, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v2}, Lcom/join/mgps/Util/UtilsMy;->w4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 64
    iget-object v2, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v2}, Lcom/join/android/app/common/utils/APKUtils;->G(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v2

    const/16 v3, 0xb

    if-nez v2, :cond_1b

    iget-object v2, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v2}, Lcom/join/android/app/common/utils/APKUtils;->L(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v2

    if-nez v2, :cond_1b

    .line 65
    iget-object v2, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2, v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_8
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    .line 66
    :cond_1b
    :try_start_13
    iget-object v2, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v4

    iget-object v5, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v4

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getId()I

    move-result v4

    invoke-virtual {v2, v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setId(I)V

    .line 67
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v2

    iget-object v4, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2, v4}, Lp1/b;->update(Ljava/lang/Object;)I
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_6
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    goto :goto_13

    :catch_6
    move-exception v0

    move-object v2, v0

    .line 68
    :try_start_14
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    .line 69
    :goto_13
    iget-object v2, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v2}, Lcom/join/android/app/common/utils/APKUtils;->G(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v2

    if-nez v2, :cond_1c

    iget-object v2, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v2}, Lcom/join/android/app/common/utils/APKUtils;->L(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v2

    if-nez v2, :cond_1c

    .line 70
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v2

    new-instance v4, Lcom/join/mgps/event/n;

    iget-object v5, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {v4, v5, v3}, Lcom/join/mgps/event/n;-><init>(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    invoke-virtual {v2, v4}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    .line 71
    :cond_1c
    iget-boolean v2, v1, Lcom/join/mgps/task/e;->e:Z

    if-nez v2, :cond_1d

    .line 72
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    const-string v3, "com.join.apkinstalldataobb.action.broadcast"

    .line 73
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v3, "apkpath"

    .line 74
    invoke-virtual {v2, v3, v10}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 75
    iget-object v3, v1, Lcom/join/mgps/task/e;->b:Landroid/content/Context;

    invoke-virtual {v3, v2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_14

    .line 76
    :cond_1d
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v2

    new-instance v3, Lcom/join/mgps/event/x;

    const/4 v4, 0x7

    iget-object v5, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lcom/join/mgps/event/x;-><init>(ILjava/lang/String;)V

    invoke-virtual {v2, v3}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    .line 77
    iget-object v2, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/papa/sim/statistic/o;->v(Ljava/lang/String;)V

    .line 78
    :goto_14
    iget-object v2, v1, Lcom/join/mgps/task/e;->b:Landroid/content/Context;

    iget-object v3, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/4 v4, 0x5

    invoke-static {v2, v3, v4}, Lcom/join/mgps/Util/UtilsMy;->G3(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    .line 79
    invoke-static {}, Lcom/join/android/app/common/servcie/i;->e()Lcom/join/android/app/common/servcie/i;

    move-result-object v2

    iget-object v3, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/android/app/common/servcie/i;->k(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 80
    invoke-static {}, Lcom/join/android/app/common/servcie/i;->e()Lcom/join/android/app/common/servcie/i;

    move-result-object v2

    iget-object v3, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/android/app/common/servcie/i;->l(Ljava/lang/String;)V

    goto/16 :goto_1c

    .line 81
    :cond_1e
    :goto_15
    iget-object v3, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/16 v4, 0xd

    invoke-virtual {v3, v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    const-string v3, "failed2"

    .line 82
    invoke-static {v5, v3}, Lcom/join/mgps/Util/v0;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_8
    .catchall {:try_start_14 .. :try_end_14} :catchall_0

    .line 83
    :try_start_15
    new-instance v3, Ljava/io/File;

    iget-object v4, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v2, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_1f

    .line 85
    invoke-virtual {v3}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    .line 86
    array-length v3, v2

    const/4 v4, 0x0

    :goto_16
    if-ge v4, v3, :cond_1f

    aget-object v5, v2, v4

    .line 87
    invoke-static {v5}, Lcom/join/mgps/Util/UtilsMy;->delete(Ljava/io/File;)Z
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_7
    .catchall {:try_start_15 .. :try_end_15} :catchall_0

    add-int/lit8 v4, v4, 0x1

    goto :goto_16

    :catch_7
    move-exception v0

    move-object v2, v0

    .line 88
    :try_start_16
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    .line 89
    :cond_1f
    invoke-static {}, Lcom/join/android/app/common/servcie/i;->e()Lcom/join/android/app/common/servcie/i;

    move-result-object v2

    iget-object v3, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2, v3}, Lcom/join/android/app/common/servcie/i;->o(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_8
    .catchall {:try_start_16 .. :try_end_16} :catchall_0

    goto/16 :goto_12

    :catch_8
    move-exception v0

    move-object v2, v0

    .line 90
    :try_start_17
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_1c

    :catch_9
    move-exception v0

    move-object v2, v0

    goto/16 :goto_1b

    :catchall_0
    move-exception v0

    move-object v2, v0

    const/4 v3, 0x0

    goto/16 :goto_1d

    :catch_a
    move-exception v0

    move-object/from16 v21, v2

    move-object v2, v0

    const/4 v10, 0x0

    .line 91
    :goto_17
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    .line 92
    iget-object v8, v1, Lcom/join/mgps/task/e;->b:Landroid/content/Context;

    invoke-static {v8}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v8

    iget-object v9, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v9}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v9

    iget-object v11, v1, Lcom/join/mgps/task/e;->b:Landroid/content/Context;

    invoke-static {v11}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v11

    invoke-virtual {v11}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v8, v9, v11, v7}, Lcom/papa/sim/statistic/p;->e2(Ljava/lang/String;Ljava/lang/String;I)V
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_9
    .catchall {:try_start_17 .. :try_end_17} :catchall_0

    .line 93
    :try_start_18
    iget-object v7, v1, Lcom/join/mgps/task/e;->b:Landroid/content/Context;

    invoke-static {v7}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v9}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/io/File;->length()J

    move-result-wide v11

    invoke-virtual {v8, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_b
    .catchall {:try_start_18 .. :try_end_18} :catchall_0

    move-object/from16 v9, v21

    :try_start_19
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Lcom/join/mgps/Util/h;->c(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/papa/sim/statistic/p;->L1(Ljava/lang/String;)V
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_c
    .catchall {:try_start_19 .. :try_end_19} :catchall_0

    goto :goto_18

    :catch_b
    move-object/from16 v9, v21

    .line 94
    :catch_c
    :goto_18
    :try_start_1a
    iget-object v7, v1, Lcom/join/mgps/task/e;->f:Lcom/join/mgps/task/e$a;

    if-eqz v7, :cond_20

    const/4 v8, 0x0

    invoke-virtual {v7, v8}, Lcom/join/mgps/task/e$a;->a(Z)V

    .line 95
    :cond_20
    iget-object v7, v1, Lcom/join/mgps/task/e;->b:Landroid/content/Context;

    iget-object v8, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/4 v11, 0x0

    invoke-static {v7, v8, v11}, Lcom/join/mgps/Util/UtilsMy;->p2(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Z)Z

    move-result v7

    if-nez v7, :cond_21

    .line 96
    iget-object v2, v1, Lcom/join/mgps/task/e;->b:Landroid/content/Context;

    invoke-static {v2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "zip...\u7a7a\u95f4\u4e0d\u8db3 gameId="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/papa/sim/statistic/p;->L1(Ljava/lang/String;)V

    .line 97
    iget-object v2, v1, Lcom/join/mgps/task/e;->b:Landroid/content/Context;

    new-instance v3, Landroid/content/Intent;

    const-string v4, "com.join.android.app.mgsim.broadcast.action_insufficient_storage"

    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_9
    .catchall {:try_start_1a .. :try_end_1a} :catchall_0

    goto :goto_19

    .line 98
    :cond_21
    :try_start_1b
    iget-object v7, v1, Lcom/join/mgps/task/e;->b:Landroid/content/Context;

    invoke-static {v7}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/io/File;->length()J

    move-result-wide v3

    invoke-virtual {v8, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Lcom/join/mgps/Util/h;->c(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v2}, Lcom/papa/sim/statistic/p;->L1(Ljava/lang/String;)V
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1b} :catch_d
    .catchall {:try_start_1b .. :try_end_1b} :catchall_0

    :catch_d
    :goto_19
    :try_start_1c
    const-string v2, "failed1"

    .line 99
    invoke-static {v5, v2}, Lcom/join/mgps/Util/v0;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_1c .. :try_end_1c} :catch_9
    .catchall {:try_start_1c .. :try_end_1c} :catchall_0

    .line 100
    :try_start_1d
    new-instance v2, Ljava/io/File;

    iget-object v3, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v10, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_22

    .line 102
    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    .line 103
    array-length v3, v2

    const/4 v4, 0x0

    :goto_1a
    if-ge v4, v3, :cond_22

    aget-object v5, v2, v4

    .line 104
    invoke-static {v5}, Lcom/join/mgps/Util/UtilsMy;->delete(Ljava/io/File;)Z
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_1d} :catch_e
    .catchall {:try_start_1d .. :try_end_1d} :catchall_0

    add-int/lit8 v4, v4, 0x1

    goto :goto_1a

    :catch_e
    move-exception v0

    move-object v2, v0

    .line 105
    :try_start_1e
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    .line 106
    :cond_22
    invoke-static {}, Lcom/join/android/app/common/servcie/i;->e()Lcom/join/android/app/common/servcie/i;

    move-result-object v2

    iget-object v3, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2, v3}, Lcom/join/android/app/common/servcie/i;->o(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    :try_end_1e
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_1e} :catch_9
    .catchall {:try_start_1e .. :try_end_1e} :catchall_0

    goto/16 :goto_12

    .line 107
    :goto_1b
    :try_start_1f
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_1

    .line 108
    :goto_1c
    iget-object v2, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->set_from_type(I)V

    return-void

    :catchall_1
    move-exception v0

    const/4 v3, 0x0

    move-object v2, v0

    :goto_1d
    iget-object v4, v1, Lcom/join/mgps/task/e;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v4, v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->set_from_type(I)V

    .line 109
    goto :goto_1f

    :goto_1e
    throw v2

    :goto_1f
    goto :goto_1e
.end method
