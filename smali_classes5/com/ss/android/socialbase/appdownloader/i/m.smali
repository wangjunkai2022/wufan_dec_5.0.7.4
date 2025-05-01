.class public Lcom/ss/android/socialbase/appdownloader/i/m;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/socialbase/downloader/downloader/jh;


# instance fields
.field private m:Landroid/content/BroadcastReceiver;

.field private vv:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic m(Lcom/ss/android/socialbase/appdownloader/i/m;)Landroid/content/BroadcastReceiver;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/appdownloader/i/m;->m:Landroid/content/BroadcastReceiver;

    return-object p0
.end method

.method private m(Ljava/util/List;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/DownloadInfo;",
            ">;I)V"
        }
    .end annotation

    if-eqz p1, :cond_3

    .line 2
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/i;->k()Lcom/ss/android/socialbase/appdownloader/i;

    .line 4
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->ky()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    .line 5
    :cond_1
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/wv/u;->m(Landroid/content/Context;)Z

    move-result v1

    .line 6
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 7
    invoke-direct {p0, v0, v2, v1, p2}, Lcom/ss/android/socialbase/appdownloader/i/m;->vv(Landroid/content/Context;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;ZI)V

    goto :goto_0

    .line 8
    :cond_2
    iget-object p1, p0, Lcom/ss/android/socialbase/appdownloader/i/m;->vv:Ljava/util/List;

    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_3

    .line 9
    iget-object p1, p0, Lcom/ss/android/socialbase/appdownloader/i/m;->m:Landroid/content/BroadcastReceiver;

    if-nez p1, :cond_3

    .line 10
    new-instance p1, Lcom/ss/android/socialbase/appdownloader/i/m$2;

    invoke-direct {p1, p0}, Lcom/ss/android/socialbase/appdownloader/i/m$2;-><init>(Lcom/ss/android/socialbase/appdownloader/i/m;)V

    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/i/m;->m:Landroid/content/BroadcastReceiver;

    .line 11
    :try_start_0
    new-instance p1, Landroid/content/IntentFilter;

    invoke-direct {p1}, Landroid/content/IntentFilter;-><init>()V

    const-string p2, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 12
    invoke-virtual {p1, p2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 13
    iget-object p2, p0, Lcom/ss/android/socialbase/appdownloader/i/m;->m:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, p2, p1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 14
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 p1, 0x0

    .line 15
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/i/m;->m:Landroid/content/BroadcastReceiver;

    :cond_3
    :goto_1
    return-void
.end method

.method static synthetic vv(Lcom/ss/android/socialbase/appdownloader/i/m;Landroid/content/BroadcastReceiver;)Landroid/content/BroadcastReceiver;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/i/m;->m:Landroid/content/BroadcastReceiver;

    return-object p1
.end method

.method static synthetic vv(Lcom/ss/android/socialbase/appdownloader/i/m;)Ljava/util/List;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/ss/android/socialbase/appdownloader/i/m;->vv:Ljava/util/List;

    return-object p0
.end method

.method private vv(Landroid/content/Context;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;ZI)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p4

    if-eqz v1, :cond_19

    .line 10
    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isShowNotification()Z

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_9

    .line 11
    :cond_0
    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getRealStatus()I

    move-result v3

    const/4 v4, -0x5

    const-string v6, ", canShowNotification = "

    const-string v7, "LaunchResume"

    const-wide/high16 v8, 0x4028000000000000L    # 12.0

    const-wide/high16 v10, 0x4052000000000000L    # 72.0

    const-wide v12, 0x414b774000000000L    # 3600000.0

    const/4 v14, 0x0

    if-ne v3, v4, :cond_d

    .line 12
    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getMimeType()Ljava/lang/String;

    move-result-object v4

    const-string v5, "application/ttpatch"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isDownloaded()Z

    move-result v4

    if-nez v4, :cond_d

    .line 13
    :cond_1
    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v3

    invoke-static {v3}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(I)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v3

    const-string v4, "failed_resume_max_count"

    .line 14
    invoke-virtual {v3, v4, v14}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result v4

    const-string v5, "failed_resume_max_hours"

    .line 15
    invoke-virtual {v3, v5, v10, v11}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;D)D

    move-result-wide v10

    const-string v5, "failed_resume_min_hours"

    .line 16
    invoke-virtual {v3, v5, v8, v9}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;D)D

    move-result-wide v8

    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    .line 18
    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getFailedResumeCount()I

    move-result v5

    if-ge v5, v4, :cond_2

    .line 19
    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getLastDownloadTime()J

    move-result-wide v4

    sub-long v4, v14, v4

    long-to-double v4, v4

    mul-double v10, v10, v12

    cmpg-double v16, v4, v10

    if-gez v16, :cond_2

    .line 20
    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getLastFailedResumeTime()J

    move-result-wide v4

    sub-long v4, v14, v4

    long-to-double v4, v4

    mul-double v8, v8, v12

    cmpl-double v10, v4, v8

    if-lez v10, :cond_2

    const/4 v5, 0x1

    goto :goto_0

    :cond_2
    const/4 v5, 0x0

    .line 21
    :goto_0
    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isPauseReserveOnWifi()Z

    move-result v4

    if-eqz v4, :cond_3

    if-eqz p3, :cond_3

    const/4 v4, 0x1

    goto :goto_1

    :cond_3
    move v4, v5

    :goto_1
    if-eqz v4, :cond_b

    const-string v5, "failed_resume_need_wifi"

    const/4 v8, 0x1

    .line 22
    invoke-virtual {v3, v5, v8}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result v5

    if-ne v5, v8, :cond_4

    const/4 v9, 0x1

    goto :goto_2

    :cond_4
    const/4 v9, 0x0

    :goto_2
    const-string v5, "failed_resume_need_wait_wifi"

    const/4 v10, 0x0

    .line 23
    invoke-virtual {v3, v5, v10}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result v3

    if-ne v3, v8, :cond_5

    const/4 v3, 0x1

    goto :goto_3

    :cond_5
    const/4 v3, 0x0

    :goto_3
    if-nez p3, :cond_9

    if-eqz v9, :cond_9

    if-nez v3, :cond_6

    goto :goto_4

    .line 24
    :cond_6
    iget-object v2, v0, Lcom/ss/android/socialbase/appdownloader/i/m;->vv:Ljava/util/List;

    if-nez v2, :cond_7

    .line 25
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, Lcom/ss/android/socialbase/appdownloader/i/m;->vv:Ljava/util/List;

    .line 26
    :cond_7
    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v2

    .line 27
    iget-object v3, v0, Lcom/ss/android/socialbase/appdownloader/i/m;->vv:Ljava/util/List;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v3, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    .line 28
    iget-object v3, v0, Lcom/ss/android/socialbase/appdownloader/i/m;->vv:Ljava/util/List;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_8
    const/4 v3, 0x1

    .line 29
    invoke-virtual {v1, v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setOnlyWifi(Z)V

    .line 30
    invoke-static {}, Lcom/ss/android/socialbase/downloader/impls/g;->vv()Lcom/ss/android/socialbase/downloader/impls/g;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/ss/android/socialbase/downloader/impls/g;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    goto :goto_5

    :cond_9
    :goto_4
    const/4 v3, 0x1

    .line 31
    invoke-static {v1, v3, v9}, Lcom/ss/android/socialbase/appdownloader/p;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;ZZ)V

    .line 32
    invoke-virtual {v1, v14, v15}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setLastFailedResumeTime(J)V

    .line 33
    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getFailedResumeCount()I

    move-result v5

    add-int/2addr v5, v3

    invoke-virtual {v1, v5}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setFailedResumeCount(I)V

    .line 34
    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->updateSpData()V

    .line 35
    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isPauseReserveOnWifi()Z

    move-result v5

    if-eqz v5, :cond_a

    if-eqz p3, :cond_a

    .line 36
    invoke-virtual {v1, v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setDownloadFromReserveWifi(Z)V

    .line 37
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/i;->k()Lcom/ss/android/socialbase/appdownloader/i;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ss/android/socialbase/appdownloader/i;->q()Lcom/ss/android/socialbase/downloader/downloader/g;

    move-result-object v3

    if-eqz v3, :cond_a

    const/4 v5, 0x5

    .line 38
    invoke-interface {v3, v1, v5, v2}, Lcom/ss/android/socialbase/downloader/downloader/g;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;II)V

    :cond_a
    const/4 v14, 0x1

    goto :goto_6

    :cond_b
    :goto_5
    const/4 v14, 0x0

    .line 39
    :goto_6
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "launchResume, name = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, ", downloadResumed = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v7, v2}, Lcom/ss/android/socialbase/downloader/p/vv;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/i;->k()Lcom/ss/android/socialbase/appdownloader/i;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ss/android/socialbase/appdownloader/i;->t()Lcom/ss/android/socialbase/appdownloader/p/n;

    move-result-object v2

    if-eqz v2, :cond_c

    .line 41
    invoke-interface {v2, v1, v14}, Lcom/ss/android/socialbase/appdownloader/p/n;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Z)V

    :cond_c
    return-void

    :cond_d
    const/4 v4, -0x3

    if-ne v3, v4, :cond_12

    .line 42
    invoke-direct {v0, v1}, Lcom/ss/android/socialbase/appdownloader/i/m;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    move-result v4

    if-eqz v4, :cond_12

    .line 43
    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v2

    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(I)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v2

    .line 44
    invoke-static/range {p1 .. p2}, Lcom/ss/android/socialbase/appdownloader/p;->vv(Landroid/content/Context;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    move-result v3

    if-eqz v3, :cond_e

    return-void

    :cond_e
    const-string v3, "uninstall_resume_max_count"

    const/4 v4, 0x0

    .line 45
    invoke-virtual {v2, v3, v4}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result v3

    const-string v4, "uninstall_resume_max_hours"

    .line 46
    invoke-virtual {v2, v4, v10, v11}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;D)D

    move-result-wide v10

    const-string v4, "uninstall_resume_min_hours"

    .line 47
    invoke-virtual {v2, v4, v8, v9}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;D)D

    move-result-wide v8

    .line 48
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    .line 49
    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getUninstallResumeCount()I

    move-result v2

    if-ge v2, v3, :cond_f

    .line 50
    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getLastDownloadTime()J

    move-result-wide v2

    sub-long v2, v14, v2

    long-to-double v2, v2

    mul-double v10, v10, v12

    cmpg-double v4, v2, v10

    if-gez v4, :cond_f

    .line 51
    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getLastUninstallResumeTime()J

    move-result-wide v2

    sub-long v2, v14, v2

    long-to-double v2, v2

    mul-double v8, v8, v12

    cmpl-double v4, v2, v8

    if-lez v4, :cond_f

    const/4 v2, 0x1

    goto :goto_7

    :cond_f
    const/4 v2, 0x0

    .line 52
    :goto_7
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "uninstallResume, name = "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v7, v3}, Lcom/ss/android/socialbase/downloader/p/vv;->p(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v2, :cond_11

    .line 53
    invoke-static {}, Lcom/ss/android/socialbase/downloader/notification/m;->vv()Lcom/ss/android/socialbase/downloader/notification/m;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/ss/android/socialbase/downloader/notification/m;->o(I)Lcom/ss/android/socialbase/downloader/notification/vv;

    move-result-object v2

    if-nez v2, :cond_10

    .line 54
    new-instance v2, Lcom/ss/android/socialbase/appdownloader/o/vv;

    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v8

    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTitle()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getExtra()Ljava/lang/String;

    move-result-object v12

    move-object v6, v2

    move-object/from16 v7, p1

    invoke-direct/range {v6 .. v12}, Lcom/ss/android/socialbase/appdownloader/o/vv;-><init>(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    invoke-static {}, Lcom/ss/android/socialbase/downloader/notification/m;->vv()Lcom/ss/android/socialbase/downloader/notification/m;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/ss/android/socialbase/downloader/notification/m;->vv(Lcom/ss/android/socialbase/downloader/notification/vv;)V

    goto :goto_8

    .line 56
    :cond_10
    invoke-virtual {v2, v1}, Lcom/ss/android/socialbase/downloader/notification/vv;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 57
    :goto_8
    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/ss/android/socialbase/downloader/notification/vv;->m(J)V

    .line 58
    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/ss/android/socialbase/downloader/notification/vv;->vv(J)V

    .line 59
    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual {v2, v3, v4, v5, v5}, Lcom/ss/android/socialbase/downloader/notification/vv;->vv(ILcom/ss/android/socialbase/downloader/exception/BaseException;ZZ)V

    .line 60
    invoke-virtual {v1, v14, v15}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setLastUninstallResumeTime(J)V

    .line 61
    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getUninstallResumeCount()I

    move-result v2

    const/4 v3, 0x1

    add-int/2addr v2, v3

    invoke-virtual {v1, v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setUninstallResumeCount(I)V

    .line 62
    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->updateSpData()V

    :cond_11
    return-void

    :cond_12
    const/4 v4, -0x2

    if-ne v3, v4, :cond_19

    .line 63
    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isPauseReserveOnWifi()Z

    move-result v3

    if-eqz v3, :cond_18

    if-eqz p3, :cond_15

    const/4 v3, 0x1

    .line 64
    invoke-static {v1, v3, v3}, Lcom/ss/android/socialbase/appdownloader/p;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;ZZ)V

    .line 65
    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->updateSpData()V

    .line 66
    invoke-virtual {v1, v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setDownloadFromReserveWifi(Z)V

    .line 67
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/i;->k()Lcom/ss/android/socialbase/appdownloader/i;

    move-result-object v4

    invoke-virtual {v4}, Lcom/ss/android/socialbase/appdownloader/i;->t()Lcom/ss/android/socialbase/appdownloader/p/n;

    move-result-object v4

    if-eqz v4, :cond_13

    .line 68
    invoke-interface {v4, v1, v3}, Lcom/ss/android/socialbase/appdownloader/p/n;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Z)V

    .line 69
    :cond_13
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/i;->k()Lcom/ss/android/socialbase/appdownloader/i;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ss/android/socialbase/appdownloader/i;->q()Lcom/ss/android/socialbase/downloader/downloader/g;

    move-result-object v3

    if-eqz v3, :cond_14

    const/4 v4, 0x5

    .line 70
    invoke-interface {v3, v1, v4, v2}, Lcom/ss/android/socialbase/downloader/downloader/g;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;II)V

    :cond_14
    return-void

    .line 71
    :cond_15
    iget-object v2, v0, Lcom/ss/android/socialbase/appdownloader/i/m;->vv:Ljava/util/List;

    if-nez v2, :cond_16

    .line 72
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, Lcom/ss/android/socialbase/appdownloader/i/m;->vv:Ljava/util/List;

    .line 73
    :cond_16
    invoke-virtual/range {p2 .. p2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v2

    .line 74
    iget-object v3, v0, Lcom/ss/android/socialbase/appdownloader/i/m;->vv:Ljava/util/List;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_17

    .line 75
    iget-object v3, v0, Lcom/ss/android/socialbase/appdownloader/i/m;->vv:Ljava/util/List;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    :cond_17
    invoke-static {}, Lcom/ss/android/socialbase/downloader/impls/g;->vv()Lcom/ss/android/socialbase/downloader/impls/g;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/ss/android/socialbase/downloader/impls/g;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    :cond_18
    move-object/from16 v2, p1

    .line 77
    invoke-direct {v0, v1, v2}, Lcom/ss/android/socialbase/appdownloader/i/m;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Landroid/content/Context;)V

    :cond_19
    :goto_9
    return-void
.end method

.method static synthetic vv(Lcom/ss/android/socialbase/appdownloader/i/m;Landroid/content/Context;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;ZI)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ss/android/socialbase/appdownloader/i/m;->vv(Landroid/content/Context;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;ZI)V

    return-void
.end method

.method static synthetic vv(Lcom/ss/android/socialbase/appdownloader/i/m;Ljava/util/List;I)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2}, Lcom/ss/android/socialbase/appdownloader/i/m;->m(Ljava/util/List;I)V

    return-void
.end method

.method private vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Landroid/content/Context;)V
    .locals 13

    .line 78
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(I)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v0

    const-string v1, "paused_resume_max_count"

    const/4 v2, 0x0

    .line 79
    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result v1

    const-string v3, "paused_resume_max_hours"

    const-wide/high16 v4, 0x4052000000000000L    # 72.0

    .line 80
    invoke-virtual {v0, v3, v4, v5}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;D)D

    move-result-wide v3

    .line 81
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getPausedResumeCount()I

    move-result v0

    const/4 v5, 0x1

    if-ge v0, v1, :cond_0

    .line 82
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getLastDownloadTime()J

    move-result-wide v8

    sub-long/2addr v6, v8

    long-to-double v6, v6

    const-wide v8, 0x414b774000000000L    # 3600000.0

    mul-double v3, v3, v8

    cmpg-double v1, v6, v3

    if-gez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    .line 83
    invoke-static {}, Lcom/ss/android/socialbase/downloader/notification/m;->vv()Lcom/ss/android/socialbase/downloader/notification/m;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/ss/android/socialbase/downloader/notification/m;->o(I)Lcom/ss/android/socialbase/downloader/notification/vv;

    move-result-object v1

    if-nez v1, :cond_1

    .line 84
    new-instance v1, Lcom/ss/android/socialbase/appdownloader/o/vv;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v8

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTitle()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getExtra()Ljava/lang/String;

    move-result-object v12

    move-object v6, v1

    move-object v7, p2

    invoke-direct/range {v6 .. v12}, Lcom/ss/android/socialbase/appdownloader/o/vv;-><init>(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    invoke-static {}, Lcom/ss/android/socialbase/downloader/notification/m;->vv()Lcom/ss/android/socialbase/downloader/notification/m;

    move-result-object p2

    invoke-virtual {p2, v1}, Lcom/ss/android/socialbase/downloader/notification/m;->vv(Lcom/ss/android/socialbase/downloader/notification/vv;)V

    goto :goto_1

    .line 86
    :cond_1
    invoke-virtual {v1, p1}, Lcom/ss/android/socialbase/downloader/notification/vv;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 87
    :goto_1
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Lcom/ss/android/socialbase/downloader/notification/vv;->m(J)V

    .line 88
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Lcom/ss/android/socialbase/downloader/notification/vv;->vv(J)V

    .line 89
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result p2

    const/4 v3, 0x0

    invoke-virtual {v1, p2, v3, v2, v2}, Lcom/ss/android/socialbase/downloader/notification/vv;->vv(ILcom/ss/android/socialbase/downloader/exception/BaseException;ZZ)V

    add-int/2addr v0, v5

    .line 90
    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setPausedResumeCount(I)V

    .line 91
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->updateSpData()V

    :cond_2
    return-void
.end method

.method private vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z
    .locals 3

    .line 92
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(I)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v0

    const-string v1, "uninstall_can_not_resume_for_force_task"

    const/4 v2, 0x0

    .line 93
    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/n/vv;->m(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 94
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getMd5()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v2, v0}, Lcom/ss/android/socialbase/downloader/wv/u;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;ZLjava/lang/String;)Z

    move-result p1

    return p1

    .line 95
    :cond_0
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isDownloaded()Z

    move-result p1

    return p1
.end method


# virtual methods
.method public vv()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 5
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/p;->p()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public vv(Ljava/util/List;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/DownloadInfo;",
            ">;I)V"
        }
    .end annotation

    .line 6
    invoke-static {}, Lcom/ss/android/socialbase/downloader/wv/u;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->jh()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    .line 8
    new-instance v1, Lcom/ss/android/socialbase/appdownloader/i/m$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/ss/android/socialbase/appdownloader/i/m$1;-><init>(Lcom/ss/android/socialbase/appdownloader/i/m;Ljava/util/List;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void

    .line 9
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/ss/android/socialbase/appdownloader/i/m;->m(Ljava/util/List;I)V

    return-void
.end method
