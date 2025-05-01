.class public Lcom/join/mgps/task/h;
.super Ljava/lang/Thread;
.source "UNZIPThread.java"

# interfaces
.implements Lcom/join/mgps/task/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/task/h$a;
    }
.end annotation


# instance fields
.field private b:Landroid/content/Context;

.field private c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

.field public d:Z

.field e:Lcom/join/mgps/task/h$a;

.field private f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/task/h;->d:Z

    const/4 v1, 0x0

    .line 3
    iput-object v1, p0, Lcom/join/mgps/task/h;->e:Lcom/join/mgps/task/h$a;

    .line 4
    iput-object p1, p0, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 5
    iput-object p2, p0, Lcom/join/mgps/task/h;->b:Landroid/content/Context;

    if-eqz p1, :cond_0

    .line 6
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPath()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 7
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getExt()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 8
    :try_start_0
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object p2

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getExt()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {p2, v1, v2}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/ExtBean;

    if-eqz p2, :cond_0

    .line 9
    invoke-virtual {p2}, Lcom/join/mgps/dto/ExtBean;->getDown_from()I

    move-result p2

    if-ne p2, v0, :cond_0

    .line 10
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v0, Lcom/join/mgps/Util/v;->g:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getRomType()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "/roms/"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/task/h;->f:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method public constructor <init>(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p0, Lcom/join/mgps/task/h;->d:Z

    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lcom/join/mgps/task/h;->e:Lcom/join/mgps/task/h$a;

    .line 15
    iput-object p1, p0, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 16
    iput-object p2, p0, Lcom/join/mgps/task/h;->b:Landroid/content/Context;

    .line 17
    iput-object p3, p0, Lcom/join/mgps/task/h;->f:Ljava/lang/String;

    return-void
.end method

.method static synthetic b(Lcom/join/mgps/task/h;)Lcom/github/snowdream/android/app/downloader/DownloadTask;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    return-object p0
.end method

.method static synthetic c(Lcom/join/mgps/task/h;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/task/h;->f:Ljava/lang/String;

    return-object p0
.end method

.method private e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
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

    iget-object v1, v12, Lcom/join/mgps/task/h;->b:Landroid/content/Context;

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
    iput-boolean v0, p0, Lcom/join/mgps/task/h;->d:Z

    .line 2
    iget-object v1, p0, Lcom/join/mgps/task/h;->e:Lcom/join/mgps/task/h$a;

    invoke-virtual {v1, v0}, Lcom/join/mgps/task/h$a;->a(Z)V

    .line 3
    iget-object v1, p0, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->set_from_type(I)V

    :cond_0
    return-void
.end method

.method d()Z
    .locals 3

    const/4 v0, 0x0

    .line 1
    :try_start_0
    iget-object v1, p0, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v1, :cond_2

    .line 2
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getResource_url_remote()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getResource_path()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 3
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getResource_path()Ljava/lang/String;

    move-result-object v1

    const-string v2, ".zip"

    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getResource_path()Ljava/lang/String;

    move-result-object v1

    const-string v2, ".zip/"

    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 4
    :cond_0
    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getResource_path()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0

    :catch_0
    move-exception v1

    .line 6
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_2
    return v0
.end method

.method public interrupt()V
    .locals 2

    .line 1
    invoke-super {p0}, Ljava/lang/Thread;->interrupt()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->set_from_type(I)V

    :cond_0
    return-void
.end method

.method public isRunning()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/task/h;->d:Z

    return v0
.end method

.method public run()V
    .locals 23

    move-object/from16 v1, p0

    const-string v2, "]::"

    const-string v3, ",model="

    const-string v4, ",brand="

    const-string v5, ",size="

    const-string v6, "zip error[gameId="

    .line 1
    invoke-super/range {p0 .. p0}, Ljava/lang/Thread;->run()V

    .line 2
    iget-object v7, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v7}, Lcom/join/android/app/common/utils/APKUtils;->G(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v7

    const/4 v9, 0x1

    if-eqz v7, :cond_0

    const/4 v7, 0x1

    goto :goto_0

    .line 3
    :cond_0
    iget-object v7, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v7}, Lcom/join/android/app/common/utils/APKUtils;->L(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x2

    goto :goto_0

    :cond_1
    const/4 v7, 0x0

    .line 4
    :goto_0
    :try_start_0
    new-instance v11, Ljava/io/File;

    iget-object v12, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v12}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPath()Ljava/lang/String;

    move-result-object v12

    invoke-direct {v11, v12}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_7
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 5
    :try_start_1
    invoke-virtual {v11}, Ljava/io/File;->exists()Z

    move-result v12
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const-string v13, ""

    const/16 v16, 0x0

    if-eqz v12, :cond_b

    .line 6
    :try_start_2
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "zip len="

    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/io/File;->length()J

    move-result-wide v14

    invoke-virtual {v12, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    .line 8
    iget-object v12, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v12}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->get_from_type()I

    move-result v12

    if-eq v12, v9, :cond_2

    .line 9
    iget-object v12, v1, Lcom/join/mgps/task/h;->b:Landroid/content/Context;

    invoke-static {v12}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v12

    iget-object v8, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v8

    iget-object v10, v1, Lcom/join/mgps/task/h;->b:Landroid/content/Context;

    invoke-static {v10}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v10

    invoke-virtual {v10}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v12, v8, v10, v7}, Lcom/papa/sim/statistic/p;->j1(Ljava/lang/String;Ljava/lang/String;I)V

    .line 10
    :cond_2
    iget-object v8, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v17

    const-wide/32 v19, 0x6400000

    const-wide v21, 0x80000000L

    cmp-long v8, v17, v19

    if-ltz v8, :cond_4

    .line 11
    iget-object v8, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v17

    cmp-long v8, v17, v21

    if-lez v8, :cond_3

    .line 12
    invoke-virtual {v11}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v8

    iget-object v10, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v10}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v11, v8, v10}, Lcom/join/mgps/Util/t;->d(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    goto :goto_1

    .line 13
    :cond_3
    invoke-virtual {v11}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v8

    iget-object v10, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v10}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v11, v8, v10}, Lcom/join/mgps/Util/w2;->c(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 14
    :goto_1
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "get rom path"

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    new-instance v10, Lcom/join/mgps/task/h$a;

    new-instance v12, Ljava/io/File;

    invoke-direct {v12, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v8

    invoke-direct {v10, v1, v8}, Lcom/join/mgps/task/h$a;-><init>(Lcom/join/mgps/task/h;Ljava/io/File;)V

    iput-object v10, v1, Lcom/join/mgps/task/h;->e:Lcom/join/mgps/task/h$a;

    .line 16
    invoke-virtual {v10}, Ljava/lang/Thread;->start()V

    goto :goto_2

    .line 17
    :cond_4
    iput-boolean v9, v1, Lcom/join/mgps/task/h;->d:Z

    .line 18
    :goto_2
    iget-object v8, v1, Lcom/join/mgps/task/h;->f:Ljava/lang/String;

    invoke-static {v8}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_7

    .line 19
    new-instance v8, Ljava/io/File;

    iget-object v10, v1, Lcom/join/mgps/task/h;->f:Ljava/lang/String;

    invoke-direct {v8, v10}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 20
    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    move-result v10

    if-nez v10, :cond_5

    .line 21
    invoke-virtual {v8}, Ljava/io/File;->mkdirs()Z

    .line 22
    :cond_5
    iget-object v8, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v17

    cmp-long v8, v17, v21

    if-lez v8, :cond_6

    .line 23
    iget-object v8, v1, Lcom/join/mgps/task/h;->f:Ljava/lang/String;

    iget-object v10, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v10}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v1, v11, v8, v10}, Lcom/join/mgps/Util/t;->g(Lcom/join/mgps/task/h;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Lcom/join/mgps/dto/UNZipPathBackBean;

    move-result-object v8

    goto :goto_3

    .line 24
    :cond_6
    iget-object v8, v1, Lcom/join/mgps/task/h;->f:Ljava/lang/String;

    iget-object v10, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v10}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v1, v11, v8, v10}, Lcom/join/mgps/Util/w2;->h(Lcom/join/mgps/task/h;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Lcom/join/mgps/dto/UNZipPathBackBean;

    move-result-object v8

    goto :goto_3

    .line 25
    :cond_7
    iget-object v8, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v17

    cmp-long v8, v17, v21

    if-lez v8, :cond_8

    .line 26
    invoke-virtual {v11}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v8

    iget-object v10, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v10}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v1, v11, v8, v10}, Lcom/join/mgps/Util/t;->g(Lcom/join/mgps/task/h;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Lcom/join/mgps/dto/UNZipPathBackBean;

    move-result-object v8

    goto :goto_3

    .line 27
    :cond_8
    invoke-virtual {v11}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v8

    iget-object v10, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v10}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v1, v11, v8, v10}, Lcom/join/mgps/Util/w2;->h(Lcom/join/mgps/task/h;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Lcom/join/mgps/dto/UNZipPathBackBean;

    move-result-object v8

    .line 28
    :goto_3
    invoke-virtual/range {p0 .. p0}, Lcom/join/mgps/task/h;->d()Z

    move-result v10

    if-eqz v10, :cond_a

    .line 29
    new-instance v10, Ljava/io/File;

    iget-object v12, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v12}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getResource_path()Ljava/lang/String;

    move-result-object v12

    invoke-direct {v10, v12}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 30
    invoke-virtual {v10}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v12

    .line 31
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v18, Lcom/join/mgps/enums/ConstantIntEnum;->N3DS:Lcom/join/mgps/enums/ConstantIntEnum;

    move-object/from16 v19, v12

    invoke-virtual/range {v18 .. v18}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v12

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    iget-object v12, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v12}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v12

    invoke-static {v9, v12}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 32
    iget-object v12, v1, Lcom/join/mgps/task/h;->f:Ljava/lang/String;

    goto :goto_4

    :cond_9
    move-object/from16 v12, v19

    .line 33
    :goto_4
    iget-object v9, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v9}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v10, v12, v9}, Lcom/join/mgps/Util/w2;->f(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_5

    :cond_a
    move-object/from16 v10, v16

    .line 34
    :goto_5
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "romsPath-"

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Lcom/join/mgps/dto/UNZipPathBackBean;->getGameZipPath()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_6

    :cond_b
    move-object/from16 v8, v16

    move-object v10, v8

    const-wide/16 v14, -0x1

    .line 35
    :goto_6
    :try_start_3
    iget-boolean v2, v1, Lcom/join/mgps/task/h;->d:Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_7
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-nez v2, :cond_c

    .line 36
    :goto_7
    iget-object v2, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->set_from_type(I)V

    return-void

    :cond_c
    const/4 v3, 0x0

    .line 37
    :try_start_4
    iget-object v2, v1, Lcom/join/mgps/task/h;->e:Lcom/join/mgps/task/h$a;

    if-eqz v2, :cond_d

    .line 38
    invoke-virtual {v2, v3}, Lcom/join/mgps/task/h$a;->a(Z)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_7
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_d
    if-eqz v8, :cond_e

    .line 39
    :try_start_5
    invoke-virtual {v8}, Lcom/join/mgps/dto/UNZipPathBackBean;->getGameZipPath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_e

    .line 40
    new-instance v2, Ljava/io/File;

    invoke-virtual {v8}, Lcom/join/mgps/dto/UNZipPathBackBean;->getGameZipPath()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    move-object/from16 v16, v2

    :cond_e
    if-eqz v8, :cond_21

    .line 41
    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_21

    if-eqz v16, :cond_21

    invoke-virtual/range {v16 .. v16}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_f

    goto/16 :goto_c

    .line 42
    :cond_f
    iget-object v2, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const-wide/16 v3, 0x64

    invoke-virtual {v2, v3, v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setProgress(J)V

    .line 43
    iget-object v2, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v2}, Lcom/join/mgps/Util/UtilsMy;->w4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 44
    iget-object v2, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getDownloadType()I

    move-result v2

    const/4 v5, 0x2

    if-eq v2, v5, :cond_10

    .line 45
    iget-object v2, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v8}, Lcom/join/mgps/dto/UNZipPathBackBean;->getGameZipPath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setGameZipPath(Ljava/lang/String;)V

    .line 46
    iget-object v2, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v8}, Lcom/join/mgps/dto/UNZipPathBackBean;->getSoucePath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setSource_down_path(Ljava/lang/String;)V

    .line 47
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "romsPath3-"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getGameZipPath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_10
    const-wide/16 v5, -0x1

    cmp-long v2, v14, v5

    if-eqz v2, :cond_11

    .line 48
    iget-object v2, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v11}, Ljava/io/File;->length()J

    move-result-wide v5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    sub-long/2addr v7, v14

    div-long/2addr v5, v7

    invoke-virtual {v2, v5, v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setZipCost(J)V

    .line 49
    :cond_11
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "romsPath4-"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getGameZipPath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "file-"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    invoke-static {v11}, Lcom/join/mgps/Util/UtilsMy;->delete(Ljava/io/File;)Z

    if-eqz v10, :cond_12

    .line 52
    invoke-static {v10}, Lcom/join/mgps/Util/UtilsMy;->delete(Ljava/io/File;)Z

    .line 53
    :cond_12
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "romsPath5-"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getGameZipPath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    iget-object v2, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->get_from_type()I

    move-result v2

    const/4 v5, 0x1

    if-eq v2, v5, :cond_14

    .line 55
    iget-object v2, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v2, :cond_13

    .line 56
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_13

    iget-object v2, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 57
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    const-string v5, "/Quark/Download"

    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_13

    .line 58
    iget-object v2, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getExt()Ljava/lang/String;

    move-result-object v2
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_7
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 59
    :try_start_6
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_13

    .line 60
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v2, "qkPosition"

    const-string v6, "qk"

    .line 61
    invoke-virtual {v5, v2, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 62
    :catch_0
    :cond_13
    :try_start_7
    iget-object v2, v1, Lcom/join/mgps/task/h;->b:Landroid/content/Context;

    iget-object v5, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    sget-object v6, Lcom/papa/sim/statistic/Event;->gameDownload:Lcom/papa/sim/statistic/Event;

    invoke-static {v2, v5, v6}, Lcom/join/android/app/common/servcie/r;->b(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/papa/sim/statistic/Event;)V

    .line 63
    iget-object v2, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getExt()Ljava/lang/String;

    move-result-object v2

    .line 64
    invoke-static {v2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_14

    .line 65
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v5

    const-class v6, Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {v5, v2, v6}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/ExtBean;

    if-eqz v2, :cond_14

    .line 66
    invoke-virtual {v2}, Lcom/join/mgps/dto/ExtBean;->getRecPosition()Ljava/lang/String;

    move-result-object v5

    .line 67
    invoke-static {v5}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_14

    .line 68
    iget-object v6, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Lcom/join/mgps/dto/ExtBean;->getVolcanoOther()Ljava/lang/String;

    move-result-object v2

    iget-object v7, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTipBeans()Ljava/util/ArrayList;

    move-result-object v7

    invoke-static {v7}, Lcom/join/mgps/Util/UtilsMy;->k2(Ljava/util/List;)Z

    move-result v7

    invoke-direct {v1, v5, v6, v2, v7}, Lcom/join/mgps/task/h;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 69
    :cond_14
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "romsPath6-"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getGameZipPath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    iget-object v2, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getDownloadType()I

    move-result v2
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    const-string v5, "crc_sign_id"

    const/4 v6, 0x5

    if-eqz v2, :cond_18

    const/4 v7, 0x1

    if-eq v2, v7, :cond_18

    const/4 v7, 0x2

    if-eq v2, v7, :cond_15

    .line 71
    :try_start_8
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v2

    iget-object v5, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2, v5}, Lp1/b;->update(Ljava/lang/Object;)I
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    goto/16 :goto_8

    :catch_1
    move-exception v0

    move-object v2, v0

    .line 72
    :try_start_9
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_8

    .line 73
    :cond_15
    invoke-static {}, Lb2/n;->o()Lb2/n;

    move-result-object v2

    iget-object v7, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Lb2/n;->n(Ljava/lang/String;)Lcom/join/mgps/db/tables/DownlodTaskCopyTable;

    move-result-object v2

    .line 74
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v7

    if-eqz v2, :cond_1a

    .line 75
    invoke-virtual {v2}, Lcom/join/mgps/db/tables/DownlodTaskCopyTable;->getDownloadTask()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_1a

    .line 76
    invoke-virtual {v2}, Lcom/join/mgps/db/tables/DownlodTaskCopyTable;->getDownloadTask()Ljava/lang/String;

    move-result-object v8

    const-class v9, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v7, v8, v9}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 77
    iget-object v9, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v9}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTips()Ljava/lang/String;

    move-result-object v9

    const-class v10, Ljava/util/ArrayList;

    const/4 v11, 0x1

    new-array v12, v11, [Ljava/lang/Class;

    const-class v11, Lcom/join/mgps/dto/TipBean;

    const/4 v13, 0x0

    aput-object v11, v12, v13

    invoke-virtual {v7, v10, v12}, Lcom/join/android/app/common/utils/JsonMapper;->createCollectionType(Ljava/lang/Class;[Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v10

    invoke-virtual {v7, v9, v10}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JavaType;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/ArrayList;

    .line 78
    invoke-virtual {v8, v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setTipBeans(Ljava/util/ArrayList;)V

    .line 79
    iget-object v7, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getId()I

    move-result v7

    if-eqz v7, :cond_16

    .line 80
    iget-object v7, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getId()I

    move-result v7

    invoke-virtual {v8, v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setId(I)V

    .line 81
    :cond_16
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 82
    iget-object v9, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v9}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v7, v5, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    invoke-static {}, Lb2/q;->o()Lb2/q;

    move-result-object v5

    invoke-virtual {v5, v7}, Lp1/b;->h(Ljava/util/Map;)Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_17

    .line 84
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v7

    if-lez v7, :cond_17

    const/4 v7, 0x0

    .line 85
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/db/tables/EMUUpdateTable;

    .line 86
    invoke-virtual {v5}, Lcom/join/mgps/db/tables/EMUUpdateTable;->getCfg_ver()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v8, v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setCfg_ver(Ljava/lang/String;)V

    .line 87
    invoke-virtual {v5}, Lcom/join/mgps/db/tables/EMUUpdateTable;->getCfg_ver_name()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v8, v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setCfg_ver_name(Ljava/lang/String;)V

    .line 88
    invoke-virtual {v5}, Lcom/join/mgps/db/tables/EMUUpdateTable;->getCfg_down_url()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v8, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setCfg_down_url(Ljava/lang/String;)V

    :cond_17
    const/4 v5, 0x1

    .line 89
    invoke-virtual {v8, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setDownloadType(I)V

    .line 90
    invoke-virtual {v8, v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    .line 91
    invoke-static {}, Lb2/n;->o()Lb2/n;

    move-result-object v5

    invoke-virtual {v5, v2}, Lp1/b;->delete(Ljava/lang/Object;)I

    .line 92
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v2

    invoke-virtual {v2, v8}, Lp1/b;->m(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_8

    .line 93
    :cond_18
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 94
    iget-object v7, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v2, v5, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    invoke-static {}, Lb2/q;->o()Lb2/q;

    move-result-object v5

    invoke-virtual {v5, v2}, Lp1/b;->h(Ljava/util/Map;)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_19

    .line 96
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    if-lez v5, :cond_19

    const/4 v5, 0x0

    .line 97
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/db/tables/EMUUpdateTable;

    .line 98
    iget-object v5, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/join/mgps/db/tables/EMUUpdateTable;->getCfg_ver()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setCfg_ver(Ljava/lang/String;)V

    .line 99
    iget-object v5, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/join/mgps/db/tables/EMUUpdateTable;->getCfg_ver_name()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setCfg_ver_name(Ljava/lang/String;)V

    .line 100
    iget-object v5, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/join/mgps/db/tables/EMUUpdateTable;->getCfg_down_url()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setCfg_down_url(Ljava/lang/String;)V

    .line 101
    :cond_19
    iget-object v2, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2, v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_7
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 102
    :try_start_a
    iget-object v2, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v5

    iget-object v7, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v5

    invoke-virtual {v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getId()I

    move-result v5

    invoke-virtual {v2, v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setId(I)V

    .line 103
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v2

    iget-object v5, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2, v5}, Lp1/b;->update(Ljava/lang/Object;)I

    .line 104
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "mDownloadTask.romwpath="

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getGameZipPath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_2
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    goto :goto_8

    :catch_2
    move-exception v0

    move-object v2, v0

    .line 105
    :try_start_b
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    .line 106
    :cond_1a
    :goto_8
    iget-object v2, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2, v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    .line 107
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v2

    iget-object v5, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2, v5, v6, v3, v4}, Lp1/f;->k0(Lcom/github/snowdream/android/app/downloader/DownloadTask;IJ)V

    .line 108
    sget-object v2, Lcom/MApplication;->x:Lcom/MApplication;

    iget-object v3, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v2, v3, v6}, Lcom/join/mgps/Util/UtilsMy;->G3(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    .line 109
    iget-object v2, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getRomType()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1c

    iget-object v2, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFileType()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/join/mgps/enums/Dtype;->chajian:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1c

    .line 110
    invoke-static {}, Lb2/k;->n()Lb2/k;

    move-result-object v2

    iget-object v3, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lb2/k;->p(Ljava/lang/String;)Lcom/join/mgps/db/tables/DownloadHistoryTable;

    move-result-object v2

    if-eqz v2, :cond_1b

    .line 111
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/join/mgps/db/tables/DownloadHistoryTable;->setCreate_time(J)V

    goto :goto_9

    .line 112
    :cond_1b
    new-instance v2, Lcom/join/mgps/db/tables/DownloadHistoryTable;

    invoke-direct {v2}, Lcom/join/mgps/db/tables/DownloadHistoryTable;-><init>()V

    .line 113
    iget-object v3, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/mgps/db/tables/DownloadHistoryTable;->setCrc_link_type_val(Ljava/lang/String;)V

    .line 114
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/join/mgps/db/tables/DownloadHistoryTable;->setCreate_time(J)V

    .line 115
    :goto_9
    invoke-static {}, Lb2/k;->n()Lb2/k;

    move-result-object v3

    invoke-virtual {v3, v2}, Lp1/b;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    :cond_1c
    iget-object v2, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v2, :cond_1d

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getGameZipPath()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1d

    .line 117
    new-instance v2, Ljava/io/File;

    iget-object v3, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getGameZipPath()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_7
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    :try_start_c
    const-string v3, ".downloadTask"

    .line 118
    invoke-virtual {v2}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v4

    iget-object v5, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v4, v5}, Lcom/join/android/app/common/utils/JsonMapper;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v2, v4}, Lcom/join/mgps/Util/g0;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_3
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_7
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    goto :goto_a

    :catch_3
    move-exception v0

    move-object v2, v0

    .line 119
    :try_start_d
    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V

    .line 120
    :cond_1d
    :goto_a
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    const-string v3, "gameId"

    .line 121
    iget-object v4, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v3, "com.join.android.app.mgsim.wufun.broadcast.down_and_unzip_success"

    .line 122
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 123
    iget-object v3, v1, Lcom/join/mgps/task/h;->b:Landroid/content/Context;

    invoke-virtual {v3, v2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 124
    invoke-static {}, Lcom/join/android/app/common/servcie/i;->e()Lcom/join/android/app/common/servcie/i;

    move-result-object v2

    iget-object v3, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/android/app/common/servcie/i;->l(Ljava/lang/String;)V

    .line 125
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v2

    new-instance v3, Lcom/join/mgps/event/l;

    iget-object v4, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0x26

    invoke-direct {v3, v4, v5}, Lcom/join/mgps/event/l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v2, v3}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    .line 126
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v2

    new-instance v3, Lcom/join/mgps/event/n;

    iget-object v4, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {v3, v4, v6}, Lcom/join/mgps/event/n;-><init>(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    invoke-virtual {v2, v3}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    .line 127
    iget-object v2, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/papa/sim/statistic/o;->v(Ljava/lang/String;)V

    .line 128
    iget-object v2, v1, Lcom/join/mgps/task/h;->f:Ljava/lang/String;

    invoke-static {v2}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1e

    .line 129
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v2

    new-instance v3, Lcom/join/mgps/event/x;

    const/16 v4, 0x9

    iget-object v5, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lcom/join/mgps/event/x;-><init>(ILjava/lang/String;)V

    invoke-virtual {v2, v3}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    .line 130
    :cond_1e
    iget-object v2, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->get_from()I

    move-result v2

    const/16 v3, 0x78

    if-eq v2, v3, :cond_20

    .line 131
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v2

    iget-object v3, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Lp1/f;->Z(I)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v2

    if-eqz v2, :cond_1f

    .line 132
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getDown_type()I

    move-result v2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1f

    .line 133
    iget-object v2, v1, Lcom/join/mgps/task/h;->b:Landroid/content/Context;

    iget-object v3, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/join/mgps/Util/UtilsMy;->N2(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_b

    .line 134
    :cond_1f
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v2

    iget-object v3, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lb2/p;->n(Ljava/lang/String;)Lcom/join/mgps/db/tables/EMUApkTable;

    move-result-object v2

    .line 135
    iget-object v3, v1, Lcom/join/mgps/task/h;->b:Landroid/content/Context;

    invoke-static {v3}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/task/h;->b:Landroid/content/Context;

    invoke-virtual {v2}, Lcom/join/mgps/db/tables/EMUApkTable;->getPackage_name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v4, v2}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_20

    .line 136
    iget-object v2, v1, Lcom/join/mgps/task/h;->b:Landroid/content/Context;

    iget-object v3, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/join/mgps/Util/UtilsMy;->N2(Landroid/content/Context;Ljava/lang/String;)V

    .line 137
    :cond_20
    :goto_b
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mDownloadTask.fina="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getGameZipPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_f

    .line 138
    :cond_21
    :goto_c
    iget-object v2, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/16 v3, 0xd

    invoke-virtual {v2, v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    .line 139
    invoke-static {}, Lcom/join/android/app/common/servcie/i;->e()Lcom/join/android/app/common/servcie/i;

    move-result-object v2

    iget-object v3, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2, v3}, Lcom/join/android/app/common/servcie/i;->o(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_7
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    goto/16 :goto_7

    :catchall_0
    move-exception v0

    goto/16 :goto_10

    :catchall_1
    move-exception v0

    move-object v2, v0

    goto/16 :goto_e

    :catch_4
    move-exception v0

    move-object v8, v0

    .line 140
    :try_start_e
    invoke-virtual {v8}, Ljava/lang/Exception;->printStackTrace()V

    .line 141
    iget-object v9, v1, Lcom/join/mgps/task/h;->b:Landroid/content/Context;

    invoke-static {v9}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v9

    iget-object v10, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v10}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v10

    iget-object v12, v1, Lcom/join/mgps/task/h;->b:Landroid/content/Context;

    invoke-static {v12}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v12

    invoke-virtual {v12}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v9, v10, v12, v7}, Lcom/papa/sim/statistic/p;->e2(Ljava/lang/String;Ljava/lang/String;I)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    .line 142
    :try_start_f
    iget-object v7, v1, Lcom/join/mgps/task/h;->b:Landroid/content/Context;

    invoke-static {v7}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v7

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v10, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v10}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/io/File;->length()J

    move-result-wide v12

    invoke-virtual {v9, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v10, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v10, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v8}, Lcom/join/mgps/Util/h;->c(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Lcom/papa/sim/statistic/p;->L1(Ljava/lang/String;)V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_5
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    .line 143
    :catch_5
    :try_start_10
    iget-object v7, v1, Lcom/join/mgps/task/h;->e:Lcom/join/mgps/task/h$a;

    const/4 v9, 0x0

    if-eqz v7, :cond_22

    invoke-virtual {v7, v9}, Lcom/join/mgps/task/h$a;->a(Z)V

    .line 144
    :cond_22
    iget-object v7, v1, Lcom/join/mgps/task/h;->b:Landroid/content/Context;

    iget-object v10, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v7, v10, v9}, Lcom/join/mgps/Util/UtilsMy;->p2(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Z)Z

    move-result v7

    if-nez v7, :cond_23

    .line 145
    iget-object v2, v1, Lcom/join/mgps/task/h;->b:Landroid/content/Context;

    new-instance v3, Landroid/content/Intent;

    const-string v4, "com.join.android.app.mgsim.broadcast.action_insufficient_storage"

    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 146
    iget-object v2, v1, Lcom/join/mgps/task/h;->b:Landroid/content/Context;

    invoke-static {v2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "zip...insufficient storage. gameId="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/papa/sim/statistic/p;->L1(Ljava/lang/String;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    goto :goto_d

    .line 147
    :cond_23
    :try_start_11
    iget-object v7, v1, Lcom/join/mgps/task/h;->b:Landroid/content/Context;

    invoke-static {v7}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v7

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/io/File;->length()J

    move-result-wide v5

    invoke-virtual {v9, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v4, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v8}, Lcom/join/mgps/Util/h;->c(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v2}, Lcom/papa/sim/statistic/p;->L1(Ljava/lang/String;)V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_6
    .catchall {:try_start_11 .. :try_end_11} :catchall_1

    .line 148
    :catch_6
    :goto_d
    :try_start_12
    invoke-static {}, Lcom/join/android/app/common/servcie/i;->e()Lcom/join/android/app/common/servcie/i;

    move-result-object v2

    iget-object v3, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2, v3}, Lcom/join/android/app/common/servcie/i;->o(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_1

    goto/16 :goto_7

    .line 149
    :goto_e
    :try_start_13
    throw v2
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_7
    .catchall {:try_start_13 .. :try_end_13} :catchall_2

    :catchall_2
    move-exception v0

    move-object v2, v0

    const/4 v3, 0x0

    goto :goto_11

    :catch_7
    move-exception v0

    move-object v2, v0

    .line 150
    :try_start_14
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_3

    .line 151
    :goto_f
    iget-object v2, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->set_from_type(I)V

    return-void

    :catchall_3
    move-exception v0

    const/4 v3, 0x0

    :goto_10
    move-object v2, v0

    :goto_11
    iget-object v4, v1, Lcom/join/mgps/task/h;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v4, v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->set_from_type(I)V

    .line 152
    goto :goto_13

    :goto_12
    throw v2

    :goto_13
    goto :goto_12
.end method
