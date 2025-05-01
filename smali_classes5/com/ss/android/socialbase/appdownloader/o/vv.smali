.class public Lcom/ss/android/socialbase/appdownloader/o/vv;
.super Lcom/ss/android/socialbase/downloader/notification/vv;


# instance fields
.field private i:Ljava/lang/String;

.field private final m:Landroid/content/Context;

.field private o:Ljava/lang/String;

.field private final p:Landroid/content/res/Resources;

.field private u:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3}, Lcom/ss/android/socialbase/downloader/notification/vv;-><init>(ILjava/lang/String;)V

    .line 2
    iput-object p4, p0, Lcom/ss/android/socialbase/appdownloader/o/vv;->o:Ljava/lang/String;

    .line 3
    iput-object p5, p0, Lcom/ss/android/socialbase/appdownloader/o/vv;->i:Ljava/lang/String;

    .line 4
    iput-object p6, p0, Lcom/ss/android/socialbase/appdownloader/o/vv;->u:Ljava/lang/String;

    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/o/vv;->m:Landroid/content/Context;

    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/o/vv;->p:Landroid/content/res/Resources;

    return-void
.end method

.method private k()Landroidx/core/app/NotificationCompat$Builder;
    .locals 3

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/i;->k()Lcom/ss/android/socialbase/appdownloader/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/socialbase/appdownloader/i;->wv()Ljava/lang/String;

    move-result-object v0

    .line 2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-ge v1, v2, :cond_0

    .line 3
    new-instance v0, Landroidx/core/app/NotificationCompat$Builder;

    iget-object v1, p0, Lcom/ss/android/socialbase/appdownloader/o/vv;->m:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 5
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/o/vv;->m:Landroid/content/Context;

    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/p;->m(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 6
    :cond_1
    :try_start_0
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/i;->k()Lcom/ss/android/socialbase/appdownloader/i;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ss/android/socialbase/appdownloader/i;->r()Lcom/ss/android/socialbase/appdownloader/p/r;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 7
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/i;->k()Lcom/ss/android/socialbase/appdownloader/i;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ss/android/socialbase/appdownloader/i;->r()Lcom/ss/android/socialbase/appdownloader/p/r;

    move-result-object v1

    iget-object v2, p0, Lcom/ss/android/socialbase/appdownloader/o/vv;->m:Landroid/content/Context;

    invoke-interface {v1, v2, v0}, Lcom/ss/android/socialbase/appdownloader/p/r;->vv(Landroid/content/Context;Ljava/lang/String;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    goto :goto_0

    .line 8
    :cond_2
    new-instance v1, Landroidx/core/app/NotificationCompat$Builder;

    iget-object v2, p0, Lcom/ss/android/socialbase/appdownloader/o/vv;->m:Landroid/content/Context;

    invoke-direct {v1, v2, v0}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    goto :goto_0

    .line 9
    :catch_0
    new-instance v0, Landroidx/core/app/NotificationCompat$Builder;

    iget-object v1, p0, Lcom/ss/android/socialbase/appdownloader/o/vv;->m:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;)V

    :goto_0
    return-object v0
.end method

.method private m(Lcom/ss/android/socialbase/downloader/exception/BaseException;Z)Landroid/app/Notification;
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/notification/vv;->o()I

    move-result v2

    .line 2
    invoke-static {v2}, Lcom/ss/android/socialbase/appdownloader/p;->vv(I)I

    move-result v3

    if-nez v3, :cond_0

    const/4 v1, 0x0

    return-object v1

    .line 3
    :cond_0
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/appdownloader/o/vv;->k()Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v4

    .line 4
    invoke-virtual/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/notification/vv;->u()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Landroidx/core/app/NotificationCompat$Builder;->setWhen(J)Landroidx/core/app/NotificationCompat$Builder;

    .line 5
    invoke-virtual/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/notification/vv;->vv()I

    move-result v5

    .line 6
    invoke-static {v5}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(I)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v6

    .line 7
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x18

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-lt v7, v8, :cond_1

    const-string v7, "set_notification_group"

    .line 8
    invoke-virtual {v6, v7, v10}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result v7

    if-ne v7, v9, :cond_1

    const-string v7, "com.ss.android.socialbase.APP_DOWNLOADER"

    .line 9
    invoke-virtual {v4, v7}, Landroidx/core/app/NotificationCompat$Builder;->setGroup(Ljava/lang/String;)Landroidx/core/app/NotificationCompat$Builder;

    .line 10
    invoke-virtual {v4, v10}, Landroidx/core/app/NotificationCompat$Builder;->setGroupSummary(Z)Landroidx/core/app/NotificationCompat$Builder;

    .line 11
    :cond_1
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->ya()I

    move-result v7

    if-eqz v7, :cond_2

    .line 12
    invoke-virtual {v4, v7}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    const/4 v7, 0x0

    goto :goto_0

    :cond_2
    const/4 v7, 0x1

    .line 13
    :goto_0
    new-instance v8, Landroidx/core/app/NotificationCompat$DecoratedCustomViewStyle;

    invoke-direct {v8}, Landroidx/core/app/NotificationCompat$DecoratedCustomViewStyle;-><init>()V

    invoke-virtual {v4, v8}, Landroidx/core/app/NotificationCompat$Builder;->setStyle(Landroidx/core/app/NotificationCompat$Style;)Landroidx/core/app/NotificationCompat$Builder;

    .line 14
    invoke-direct {v0, v3, v5}, Lcom/ss/android/socialbase/appdownloader/o/vv;->vv(II)I

    move-result v8

    if-eqz v7, :cond_3

    if-eqz v8, :cond_3

    .line 15
    invoke-virtual {v4, v8}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    :cond_3
    const/4 v7, -0x3

    const/4 v11, -0x4

    const/4 v12, 0x3

    const/4 v13, 0x4

    const-string v14, "android.ss.intent.action.DOWNLOAD_CLICK_CONTENT"

    const/4 v15, -0x1

    const/4 v10, 0x2

    if-eq v3, v9, :cond_8

    if-eq v3, v13, :cond_8

    if-ne v3, v10, :cond_4

    goto :goto_2

    :cond_4
    if-ne v3, v12, :cond_9

    .line 16
    invoke-virtual {v4, v9}, Landroidx/core/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroidx/core/app/NotificationCompat$Builder;

    if-eq v2, v15, :cond_7

    if-ne v2, v11, :cond_5

    goto :goto_1

    :cond_5
    if-ne v2, v7, :cond_6

    const-string v2, "notification_click_install_auto_cancel"

    .line 17
    invoke-virtual {v6, v2, v9}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result v2

    if-nez v2, :cond_6

    const/4 v2, 0x0

    .line 18
    invoke-virtual {v4, v2}, Landroidx/core/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroidx/core/app/NotificationCompat$Builder;

    :cond_6
    const-string v14, "android.ss.intent.action.DOWNLOAD_OPEN"

    .line 19
    :cond_7
    :goto_1
    invoke-direct {v0, v14, v3, v5}, Lcom/ss/android/socialbase/appdownloader/o/vv;->vv(Ljava/lang/String;II)Landroid/app/PendingIntent;

    move-result-object v2

    invoke-virtual {v4, v2}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    const-string v2, "android.ss.intent.action.DOWNLOAD_HIDE"

    .line 20
    invoke-direct {v0, v2, v3, v5}, Lcom/ss/android/socialbase/appdownloader/o/vv;->vv(Ljava/lang/String;II)Landroid/app/PendingIntent;

    move-result-object v2

    invoke-virtual {v4, v2}, Landroidx/core/app/NotificationCompat$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    goto :goto_3

    .line 21
    :cond_8
    :goto_2
    invoke-direct {v0, v14, v3, v5}, Lcom/ss/android/socialbase/appdownloader/o/vv;->vv(Ljava/lang/String;II)Landroid/app/PendingIntent;

    move-result-object v2

    invoke-virtual {v4, v2}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    const/4 v2, 0x0

    .line 22
    invoke-virtual {v4, v2}, Landroidx/core/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroidx/core/app/NotificationCompat$Builder;

    .line 23
    :cond_9
    :goto_3
    invoke-virtual/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/notification/vv;->m()J

    move-result-wide v11

    .line 24
    invoke-virtual/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/notification/vv;->p()J

    move-result-wide v13

    const-wide/16 v18, 0x0

    cmp-long v20, v13, v18

    if-lez v20, :cond_a

    const-wide/16 v18, 0x64

    mul-long v18, v18, v11

    move-wide/from16 v21, v11

    .line 25
    div-long v10, v18, v13

    long-to-int v11, v10

    goto :goto_4

    :cond_a
    move-wide/from16 v21, v11

    const/4 v11, 0x0

    .line 26
    :goto_4
    invoke-virtual/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/notification/vv;->i()Ljava/lang/String;

    move-result-object v10

    .line 27
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-eqz v12, :cond_b

    const-string v10, "tt_appdownloader_download_unknown_title"

    .line 28
    invoke-static {v10}, Lcom/ss/android/socialbase/appdownloader/wv;->m(Ljava/lang/String;)I

    move-result v10

    .line 29
    iget-object v12, v0, Lcom/ss/android/socialbase/appdownloader/o/vv;->p:Landroid/content/res/Resources;

    invoke-virtual {v12, v10}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 30
    :cond_b
    invoke-direct/range {p0 .. p0}, Lcom/ss/android/socialbase/appdownloader/o/vv;->wv()Landroid/widget/RemoteViews;

    move-result-object v12

    .line 31
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->b()I

    move-result v2

    .line 32
    invoke-static {v5}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(I)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v7

    const-string v15, "notification_opt_2"

    invoke-virtual {v7, v15}, Lcom/ss/android/socialbase/downloader/n/vv;->m(Ljava/lang/String;)I

    move-result v7

    if-eq v7, v9, :cond_c

    const-string v7, "android.ss.intent.action.DOWNLOAD_CLICK_BTN"

    .line 33
    invoke-direct {v0, v7, v3, v5}, Lcom/ss/android/socialbase/appdownloader/o/vv;->vv(Ljava/lang/String;II)Landroid/app/PendingIntent;

    move-result-object v7

    invoke-virtual {v12, v2, v7}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 34
    :cond_c
    invoke-static {v5}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(I)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v7

    const-string v9, "enable_notification_ui"

    invoke-virtual {v7, v9}, Lcom/ss/android/socialbase/downloader/n/vv;->m(Ljava/lang/String;)I

    move-result v7

    const-string v1, "setBackgroundResource"

    if-lez v7, :cond_d

    .line 35
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->la()I

    move-result v7

    .line 36
    invoke-virtual {v12, v2, v1, v7}, Landroid/widget/RemoteViews;->setInt(ILjava/lang/String;I)V

    const/4 v7, -0x1

    .line 37
    invoke-virtual {v12, v2, v7}, Landroid/widget/RemoteViews;->setTextColor(II)V

    .line 38
    :cond_d
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->r()I

    move-result v2

    .line 39
    invoke-virtual {v12, v2, v10}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 40
    invoke-direct {v0, v5}, Lcom/ss/android/socialbase/appdownloader/o/vv;->vv(I)I

    move-result v2

    const/4 v7, 0x0

    .line 41
    invoke-virtual {v12, v2, v7}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    const/16 v7, 0x64

    move/from16 v10, p2

    .line 42
    invoke-virtual {v12, v2, v7, v11, v10}, Landroid/widget/RemoteViews;->setProgressBar(IIIZ)V

    .line 43
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->jh()I

    move-result v2

    if-eqz v8, :cond_e

    .line 44
    invoke-virtual {v12, v2, v8}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    .line 45
    :cond_e
    invoke-static {v5}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(I)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v7

    invoke-virtual {v7, v9}, Lcom/ss/android/socialbase/downloader/n/vv;->m(Ljava/lang/String;)I

    move-result v7

    if-lez v7, :cond_10

    .line 46
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o/p;->vv()Lcom/ss/android/socialbase/appdownloader/o/p;

    move-result-object v7

    invoke-virtual {v7, v5}, Lcom/ss/android/socialbase/appdownloader/o/p;->vv(I)Landroid/graphics/Bitmap;

    move-result-object v7

    if-eqz v7, :cond_f

    const-string v1, "setBackgroundColor"

    const/4 v8, 0x0

    .line 47
    invoke-virtual {v12, v2, v1, v8}, Landroid/widget/RemoteViews;->setInt(ILjava/lang/String;I)V

    .line 48
    invoke-virtual {v12, v2, v7}, Landroid/widget/RemoteViews;->setImageViewBitmap(ILandroid/graphics/Bitmap;)V

    goto :goto_5

    .line 49
    :cond_f
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->la()I

    move-result v7

    .line 50
    invoke-virtual {v12, v2, v1, v7}, Landroid/widget/RemoteViews;->setInt(ILjava/lang/String;I)V

    :cond_10
    :goto_5
    const-string v1, ""

    const-string v2, "/"

    const/16 v7, 0x8

    const/4 v8, 0x1

    if-eq v3, v8, :cond_2e

    const/4 v8, 0x4

    if-ne v3, v8, :cond_11

    goto/16 :goto_17

    :cond_11
    const-string v8, "tt_appdownloader_notification_download_resume"

    const/4 v10, 0x2

    if-ne v3, v10, :cond_17

    .line 51
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static/range {v21 .. v22}, Lcom/ss/android/socialbase/appdownloader/p;->vv(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    invoke-static {v13, v14}, Lcom/ss/android/socialbase/appdownloader/p;->vv(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "tt_appdownloader_notification_pausing"

    .line 53
    invoke-static {v3}, Lcom/ss/android/socialbase/appdownloader/wv;->m(Ljava/lang/String;)I

    move-result v3

    .line 54
    iget-object v10, v0, Lcom/ss/android/socialbase/appdownloader/o/vv;->m:Landroid/content/Context;

    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    invoke-virtual {v10, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 55
    invoke-static {v8}, Lcom/ss/android/socialbase/appdownloader/wv;->m(Ljava/lang/String;)I

    move-result v8

    .line 56
    iget-object v10, v0, Lcom/ss/android/socialbase/appdownloader/o/vv;->m:Landroid/content/Context;

    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    invoke-virtual {v10, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 57
    invoke-virtual {v6, v15}, Lcom/ss/android/socialbase/downloader/n/vv;->m(Ljava/lang/String;)I

    move-result v10

    const/4 v15, 0x1

    if-ne v10, v15, :cond_13

    const/16 v10, 0x46

    const-string v15, "noti_progress_show_th"

    .line 58
    invoke-virtual {v6, v15, v10}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result v10

    if-lt v11, v10, :cond_12

    .line 59
    invoke-direct {v0, v5}, Lcom/ss/android/socialbase/appdownloader/o/vv;->vv(I)I

    move-result v5

    const/4 v10, 0x0

    .line 60
    invoke-virtual {v12, v5, v10}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 61
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->k()I

    move-result v5

    .line 62
    invoke-virtual {v12, v5, v10}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    goto :goto_6

    :cond_12
    const/4 v10, 0x0

    .line 63
    invoke-direct {v0, v5}, Lcom/ss/android/socialbase/appdownloader/o/vv;->vv(I)I

    move-result v3

    .line 64
    invoke-virtual {v12, v3, v7}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 65
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->k()I

    move-result v3

    .line 66
    invoke-virtual {v12, v3, v7}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 67
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->wv()I

    move-result v3

    .line 68
    invoke-virtual {v12, v3, v10}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 69
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->q()I

    move-result v3

    .line 70
    invoke-virtual {v12, v3, v7}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    const-string v3, "tt_appdownloader_notification_download_continue"

    .line 71
    invoke-static {v3}, Lcom/ss/android/socialbase/appdownloader/wv;->m(Ljava/lang/String;)I

    move-result v3

    .line 72
    iget-object v5, v0, Lcom/ss/android/socialbase/appdownloader/o/vv;->p:Landroid/content/res/Resources;

    invoke-virtual {v5, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_7

    :cond_13
    const/4 v10, 0x0

    .line 73
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->k()I

    move-result v11

    .line 74
    invoke-virtual {v12, v11, v10}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 75
    invoke-direct {v0, v5}, Lcom/ss/android/socialbase/appdownloader/o/vv;->vv(I)I

    move-result v5

    .line 76
    invoke-virtual {v6, v9}, Lcom/ss/android/socialbase/downloader/n/vv;->m(Ljava/lang/String;)I

    move-result v11

    const/4 v15, 0x2

    if-lt v11, v15, :cond_14

    .line 77
    invoke-virtual {v12, v5, v10}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    goto :goto_6

    .line 78
    :cond_14
    invoke-virtual {v12, v5, v7}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 79
    :goto_6
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->wv()I

    move-result v5

    .line 80
    invoke-virtual {v12, v5, v7}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 81
    :goto_7
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->b()I

    move-result v5

    .line 82
    iget-object v11, v0, Lcom/ss/android/socialbase/appdownloader/o/vv;->u:Ljava/lang/String;

    invoke-static {v11}, Lcom/ss/android/socialbase/appdownloader/p;->vv(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_16

    .line 83
    invoke-virtual {v12, v5, v10}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 84
    invoke-virtual {v6, v9}, Lcom/ss/android/socialbase/downloader/n/vv;->m(Ljava/lang/String;)I

    move-result v5

    const/4 v6, 0x2

    if-lt v5, v6, :cond_15

    .line 85
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move-wide/from16 v5, v21

    invoke-static {v5, v6, v10}, Lcom/ss/android/socialbase/appdownloader/p;->vv(JZ)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    invoke-static {v13, v14, v10}, Lcom/ss/android/socialbase/appdownloader/p;->vv(JZ)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_15
    move-object v2, v3

    move-object/from16 v19, v4

    move-object v3, v8

    goto/16 :goto_1a

    :cond_16
    move-object/from16 v16, v3

    move-object/from16 v19, v4

    move-object/from16 v18, v8

    :goto_8
    const/16 v2, 0x8

    goto/16 :goto_15

    :cond_17
    move-wide/from16 v10, v21

    const/4 v7, 0x3

    if-ne v3, v7, :cond_2d

    .line 87
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->ky()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object v3

    invoke-virtual {v3, v5}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getDownloadInfo(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v3

    .line 88
    invoke-virtual/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/notification/vv;->o()I

    move-result v7

    move-object/from16 v16, v1

    const/4 v1, -0x1

    if-eq v7, v1, :cond_1f

    invoke-virtual/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/notification/vv;->o()I

    move-result v1

    const/4 v7, -0x4

    if-ne v1, v7, :cond_18

    goto/16 :goto_d

    .line 89
    :cond_18
    invoke-virtual/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/notification/vv;->o()I

    move-result v1

    const/4 v7, -0x3

    if-ne v1, v7, :cond_1e

    .line 90
    invoke-static {v13, v14}, Lcom/ss/android/socialbase/appdownloader/p;->vv(J)Ljava/lang/String;

    move-result-object v1

    if-eqz v3, :cond_1a

    .line 91
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getMimeType()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_1a

    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getMimeType()Ljava/lang/String;

    move-result-object v7

    const-string v8, "application/vnd.android.package-archive"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1a

    .line 92
    iget-object v7, v0, Lcom/ss/android/socialbase/appdownloader/o/vv;->m:Landroid/content/Context;

    const/4 v8, 0x0

    invoke-static {v7, v3, v8}, Lcom/ss/android/socialbase/appdownloader/p;->vv(Landroid/content/Context;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Z)Z

    move-result v7

    if-eqz v7, :cond_19

    const-string v7, "tt_appdownloader_notification_install_finished_open"

    .line 93
    invoke-static {v7}, Lcom/ss/android/socialbase/appdownloader/wv;->m(Ljava/lang/String;)I

    move-result v7

    const-string v8, "tt_appdownloader_notification_download_open"

    .line 94
    invoke-static {v8}, Lcom/ss/android/socialbase/appdownloader/wv;->m(Ljava/lang/String;)I

    move-result v8

    goto :goto_9

    :cond_19
    const-string v7, "tt_appdownloader_notification_download_complete_with_install"

    .line 95
    invoke-static {v7}, Lcom/ss/android/socialbase/appdownloader/wv;->m(Ljava/lang/String;)I

    move-result v7

    const-string v8, "tt_appdownloader_notification_download_install"

    .line 96
    invoke-static {v8}, Lcom/ss/android/socialbase/appdownloader/wv;->m(Ljava/lang/String;)I

    move-result v8

    :goto_9
    move-object/from16 v17, v1

    goto :goto_a

    :cond_1a
    const-string v7, "tt_appdownloader_notification_download_complete_without_install"

    .line 97
    invoke-static {v7}, Lcom/ss/android/socialbase/appdownloader/wv;->m(Ljava/lang/String;)I

    move-result v7

    .line 98
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/i;->vv()Lcom/ss/android/socialbase/downloader/downloader/i;

    move-result-object v8

    invoke-virtual {v8, v5}, Lcom/ss/android/socialbase/downloader/downloader/i;->r(I)Lcom/ss/android/socialbase/downloader/depend/a;

    move-result-object v8

    if-eqz v8, :cond_1b

    const-string v7, "tt_appdownloader_notification_download_complete_open"

    .line 99
    invoke-static {v7}, Lcom/ss/android/socialbase/appdownloader/wv;->m(Ljava/lang/String;)I

    move-result v7

    :cond_1b
    move-object/from16 v17, v1

    const/4 v8, 0x0

    .line 100
    :goto_a
    iget-object v1, v0, Lcom/ss/android/socialbase/appdownloader/o/vv;->p:Landroid/content/res/Resources;

    invoke-virtual {v1, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 101
    invoke-virtual {v4, v1}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    if-eqz v8, :cond_1c

    .line 102
    iget-object v7, v0, Lcom/ss/android/socialbase/appdownloader/o/vv;->p:Landroid/content/res/Resources;

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_b

    :cond_1c
    move-object/from16 v7, v16

    .line 103
    :goto_b
    invoke-virtual {v6, v15}, Lcom/ss/android/socialbase/downloader/n/vv;->m(Ljava/lang/String;)I

    move-result v8

    const/4 v15, 0x1

    if-ne v8, v15, :cond_1d

    .line 104
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->b()I

    move-result v8

    .line 105
    invoke-virtual {v12, v8, v7}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 106
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->q()I

    move-result v8

    const/16 v15, 0x8

    .line 107
    invoke-virtual {v12, v8, v15}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    goto :goto_c

    :cond_1d
    const/16 v15, 0x8

    .line 108
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->b()I

    move-result v8

    .line 109
    invoke-virtual {v12, v8, v15}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    :goto_c
    move-object/from16 v16, v1

    move-object/from16 v19, v4

    move-object/from16 v18, v7

    move-object/from16 v1, v17

    const/4 v4, 0x0

    move-object/from16 v7, p1

    goto/16 :goto_14

    :cond_1e
    move-object/from16 v7, p1

    move-object/from16 v19, v4

    move-object/from16 v1, v16

    move-object/from16 v18, v1

    const/4 v4, 0x0

    goto/16 :goto_14

    .line 110
    :cond_1f
    :goto_d
    invoke-virtual {v6, v9}, Lcom/ss/android/socialbase/downloader/n/vv;->m(Ljava/lang/String;)I

    move-result v1

    const/4 v7, 0x2

    if-lt v1, v7, :cond_21

    .line 111
    invoke-virtual/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/notification/vv;->o()I

    move-result v1

    const/4 v7, -0x1

    if-ne v1, v7, :cond_21

    .line 112
    invoke-static/range {p1 .. p1}, Lcom/ss/android/socialbase/downloader/wv/u;->wv(Ljava/lang/Throwable;)Z

    move-result v1

    if-nez v1, :cond_20

    invoke-static/range {p1 .. p1}, Lcom/ss/android/socialbase/downloader/wv/u;->qv(Ljava/lang/Throwable;)Z

    move-result v1

    if-eqz v1, :cond_21

    .line 113
    :cond_20
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v10, v11}, Lcom/ss/android/socialbase/appdownloader/p;->vv(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    invoke-static {v13, v14}, Lcom/ss/android/socialbase/appdownloader/p;->vv(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_e

    :cond_21
    move-object/from16 v1, v16

    .line 115
    :goto_e
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->q()I

    move-result v7

    const/16 v15, 0x8

    .line 116
    invoke-virtual {v12, v7, v15}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    move-object/from16 v7, p1

    if-eqz v7, :cond_22

    .line 117
    invoke-virtual/range {p1 .. p1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;->getErrorCode()I

    move-result v15

    move-object/from16 v16, v1

    const/16 v1, 0x3ee

    if-ne v15, v1, :cond_23

    const-string v1, "tt_appdownloader_notification_download_space_failed"

    .line 118
    invoke-static {v1}, Lcom/ss/android/socialbase/appdownloader/wv;->m(Ljava/lang/String;)I

    move-result v1

    .line 119
    iget-object v15, v0, Lcom/ss/android/socialbase/appdownloader/o/vv;->m:Landroid/content/Context;

    invoke-virtual {v15}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v15

    invoke-virtual {v15, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_11

    :cond_22
    move-object/from16 v16, v1

    .line 120
    :cond_23
    invoke-direct {v0, v7, v6, v3}, Lcom/ss/android/socialbase/appdownloader/o/vv;->vv(Lcom/ss/android/socialbase/downloader/exception/BaseException;Lcom/ss/android/socialbase/downloader/n/vv;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    move-result v1

    if-eqz v1, :cond_26

    if-eqz v3, :cond_24

    .line 121
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isOnlyWifi()Z

    move-result v1

    if-eqz v1, :cond_24

    const/4 v1, 0x1

    goto :goto_f

    :cond_24
    const/4 v1, 0x0

    :goto_f
    if-eqz v1, :cond_25

    const-string v1, "tt_appdownloader_notification_download_waiting_wifi"

    .line 122
    invoke-static {v1}, Lcom/ss/android/socialbase/appdownloader/wv;->m(Ljava/lang/String;)I

    move-result v1

    goto :goto_10

    :cond_25
    const-string v1, "tt_appdownloader_notification_download_waiting_net"

    .line 123
    invoke-static {v1}, Lcom/ss/android/socialbase/appdownloader/wv;->m(Ljava/lang/String;)I

    move-result v1

    .line 124
    :goto_10
    iget-object v15, v0, Lcom/ss/android/socialbase/appdownloader/o/vv;->m:Landroid/content/Context;

    invoke-virtual {v15}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v15

    invoke-virtual {v15, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_11

    :cond_26
    const-string v1, "tt_appdownloader_notification_download_failed"

    .line 125
    invoke-static {v1}, Lcom/ss/android/socialbase/appdownloader/wv;->m(Ljava/lang/String;)I

    move-result v1

    .line 126
    iget-object v15, v0, Lcom/ss/android/socialbase/appdownloader/o/vv;->m:Landroid/content/Context;

    invoke-virtual {v15}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v15

    invoke-virtual {v15, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_11
    const-string v15, "tt_appdownloader_notification_download_restart"

    .line 127
    invoke-static {v15}, Lcom/ss/android/socialbase/appdownloader/wv;->m(Ljava/lang/String;)I

    move-result v15

    move-object/from16 v17, v1

    .line 128
    iget-object v1, v0, Lcom/ss/android/socialbase/appdownloader/o/vv;->m:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v15}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 129
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->b()I

    move-result v15

    move-object/from16 v18, v1

    const/16 v1, 0x8

    .line 130
    invoke-virtual {v12, v15, v1}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 131
    invoke-virtual {v6, v9}, Lcom/ss/android/socialbase/downloader/n/vv;->m(Ljava/lang/String;)I

    move-result v1

    const/4 v15, 0x2

    if-lt v1, v15, :cond_29

    .line 132
    invoke-virtual/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/notification/vv;->o()I

    move-result v1

    const/4 v15, -0x1

    if-ne v1, v15, :cond_29

    .line 133
    invoke-static/range {p1 .. p1}, Lcom/ss/android/socialbase/downloader/wv/u;->wv(Ljava/lang/Throwable;)Z

    move-result v1

    if-eqz v1, :cond_28

    .line 134
    invoke-static {v7, v3}, Lcom/ss/android/socialbase/downloader/wv/u;->m(Lcom/ss/android/socialbase/downloader/exception/BaseException;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    move-result v1

    if-eqz v1, :cond_27

    const-string v1, "tt_appdownloader_notification_no_wifi_and_in_net"

    .line 135
    invoke-static {v1}, Lcom/ss/android/socialbase/appdownloader/wv;->m(Ljava/lang/String;)I

    move-result v1

    .line 136
    iget-object v15, v0, Lcom/ss/android/socialbase/appdownloader/o/vv;->m:Landroid/content/Context;

    invoke-virtual {v15}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v15

    invoke-virtual {v15, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 137
    invoke-static {v8}, Lcom/ss/android/socialbase/appdownloader/wv;->m(Ljava/lang/String;)I

    move-result v8

    .line 138
    iget-object v15, v0, Lcom/ss/android/socialbase/appdownloader/o/vv;->m:Landroid/content/Context;

    invoke-virtual {v15}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v15

    invoke-virtual {v15, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v19, v4

    move-object/from16 v18, v8

    goto :goto_12

    :cond_27
    const-string v1, "tt_appdownloader_notification_no_internet_error"

    .line 139
    invoke-static {v1}, Lcom/ss/android/socialbase/appdownloader/wv;->m(Ljava/lang/String;)I

    move-result v1

    .line 140
    iget-object v8, v0, Lcom/ss/android/socialbase/appdownloader/o/vv;->m:Landroid/content/Context;

    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v19, v4

    :goto_12
    const/4 v4, 0x0

    goto :goto_13

    .line 141
    :cond_28
    invoke-static/range {p1 .. p1}, Lcom/ss/android/socialbase/downloader/wv/u;->qv(Ljava/lang/Throwable;)Z

    move-result v1

    if-eqz v1, :cond_29

    const-string v1, "tt_appdownloader_notification_insufficient_space_error"

    .line 142
    invoke-static {v1}, Lcom/ss/android/socialbase/appdownloader/wv;->m(Ljava/lang/String;)I

    move-result v1

    .line 143
    iget-object v8, v0, Lcom/ss/android/socialbase/appdownloader/o/vv;->m:Landroid/content/Context;

    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    const/4 v15, 0x1

    new-array v15, v15, [Ljava/lang/Object;

    sub-long v21, v13, v10

    invoke-static/range {v21 .. v22}, Lcom/ss/android/socialbase/appdownloader/p;->m(J)Ljava/lang/String;

    move-result-object v17

    move-object/from16 v19, v4

    const/4 v4, 0x0

    aput-object v17, v15, v4

    invoke-virtual {v8, v1, v15}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_13

    :cond_29
    move-object/from16 v19, v4

    const/4 v4, 0x0

    move-object/from16 v1, v17

    :goto_13
    move-object/from16 v23, v16

    move-object/from16 v16, v1

    move-object/from16 v1, v23

    .line 144
    :goto_14
    invoke-direct {v0, v5}, Lcom/ss/android/socialbase/appdownloader/o/vv;->vv(I)I

    move-result v8

    const/16 v15, 0x8

    .line 145
    invoke-virtual {v12, v8, v15}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 146
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->wv()I

    move-result v8

    .line 147
    invoke-virtual {v12, v8, v4}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 148
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->k()I

    move-result v4

    .line 149
    invoke-virtual {v12, v4, v15}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 150
    invoke-virtual {v6, v9}, Lcom/ss/android/socialbase/downloader/n/vv;->m(Ljava/lang/String;)I

    move-result v4

    const/4 v6, 0x2

    if-lt v4, v6, :cond_2c

    .line 151
    invoke-virtual/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/notification/vv;->o()I

    move-result v4

    const/4 v6, -0x1

    if-ne v4, v6, :cond_2c

    .line 152
    invoke-static/range {p1 .. p1}, Lcom/ss/android/socialbase/downloader/wv/u;->wv(Ljava/lang/Throwable;)Z

    move-result v4

    if-nez v4, :cond_2a

    invoke-static/range {p1 .. p1}, Lcom/ss/android/socialbase/downloader/wv/u;->qv(Ljava/lang/Throwable;)Z

    move-result v4

    if-eqz v4, :cond_2c

    .line 153
    :cond_2a
    invoke-direct {v0, v5}, Lcom/ss/android/socialbase/appdownloader/o/vv;->vv(I)I

    move-result v4

    const/4 v5, 0x0

    .line 154
    invoke-virtual {v12, v4, v5}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 155
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->wv()I

    move-result v4

    const/16 v6, 0x8

    .line 156
    invoke-virtual {v12, v4, v6}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 157
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->k()I

    move-result v4

    .line 158
    invoke-virtual {v12, v4, v5}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 159
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->b()I

    move-result v4

    .line 160
    invoke-static {v7, v3}, Lcom/ss/android/socialbase/downloader/wv/u;->m(Lcom/ss/android/socialbase/downloader/exception/BaseException;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    move-result v3

    if-eqz v3, :cond_2b

    .line 161
    invoke-virtual {v12, v4, v5}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 162
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v10, v11, v5}, Lcom/ss/android/socialbase/appdownloader/p;->vv(JZ)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    invoke-static {v13, v14, v5}, Lcom/ss/android/socialbase/appdownloader/p;->vv(JZ)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_16

    :cond_2b
    move v5, v4

    goto/16 :goto_8

    .line 164
    :goto_15
    invoke-virtual {v12, v5, v2}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    :cond_2c
    :goto_16
    move-object/from16 v2, v16

    move-object/from16 v3, v18

    goto/16 :goto_1a

    :cond_2d
    move-object/from16 v16, v1

    move-object/from16 v19, v4

    move-object v2, v1

    move-object v3, v2

    goto/16 :goto_1a

    :cond_2e
    :goto_17
    move-object/from16 v19, v4

    move-wide/from16 v10, v21

    .line 165
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v10, v11}, Lcom/ss/android/socialbase/appdownloader/p;->vv(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    invoke-static {v13, v14}, Lcom/ss/android/socialbase/appdownloader/p;->vv(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    if-ne v3, v2, :cond_30

    .line 167
    invoke-virtual/range {p0 .. p0}, Lcom/ss/android/socialbase/downloader/notification/vv;->o()I

    move-result v2

    const/16 v3, 0xb

    if-ne v2, v3, :cond_2f

    const-string v2, "tt_appdownloader_notification_waiting_download_complete_handler"

    .line 168
    invoke-static {v2}, Lcom/ss/android/socialbase/appdownloader/wv;->m(Ljava/lang/String;)I

    move-result v2

    goto :goto_18

    :cond_2f
    const-string v2, "tt_appdownloader_notification_downloading"

    .line 169
    invoke-static {v2}, Lcom/ss/android/socialbase/appdownloader/wv;->m(Ljava/lang/String;)I

    move-result v2

    goto :goto_18

    :cond_30
    const-string v2, "tt_appdownloader_notification_prepare"

    .line 170
    invoke-static {v2}, Lcom/ss/android/socialbase/appdownloader/wv;->m(Ljava/lang/String;)I

    move-result v2

    .line 171
    :goto_18
    iget-object v3, v0, Lcom/ss/android/socialbase/appdownloader/o/vv;->m:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "tt_appdownloader_notification_download_pause"

    .line 172
    invoke-static {v3}, Lcom/ss/android/socialbase/appdownloader/wv;->m(Ljava/lang/String;)I

    move-result v3

    .line 173
    iget-object v4, v0, Lcom/ss/android/socialbase/appdownloader/o/vv;->m:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 174
    invoke-direct {v0, v5}, Lcom/ss/android/socialbase/appdownloader/o/vv;->vv(I)I

    move-result v4

    const/4 v5, 0x0

    .line 175
    invoke-virtual {v12, v4, v5}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 176
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->wv()I

    move-result v4

    const/16 v7, 0x8

    .line 177
    invoke-virtual {v12, v4, v7}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 178
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->k()I

    move-result v4

    .line 179
    invoke-virtual {v12, v4, v5}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 180
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->b()I

    move-result v4

    .line 181
    iget-object v8, v0, Lcom/ss/android/socialbase/appdownloader/o/vv;->u:Ljava/lang/String;

    invoke-static {v8}, Lcom/ss/android/socialbase/appdownloader/p;->vv(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_31

    .line 182
    invoke-virtual {v12, v4, v7}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    goto :goto_19

    .line 183
    :cond_31
    invoke-virtual {v12, v4, v5}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 184
    :goto_19
    invoke-virtual {v6, v9}, Lcom/ss/android/socialbase/downloader/n/vv;->m(Ljava/lang/String;)I

    move-result v5

    const/4 v6, 0x2

    if-lt v5, v6, :cond_32

    .line 185
    invoke-virtual {v12, v4, v7}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 186
    :cond_32
    :goto_1a
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->t()I

    move-result v4

    .line 187
    invoke-virtual {v12, v4, v1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 188
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->j()I

    move-result v4

    .line 189
    invoke-virtual {v12, v4, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 190
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->q()I

    move-result v4

    .line 191
    invoke-virtual {v12, v4, v1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 192
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->d()I

    move-result v1

    .line 193
    invoke-virtual {v12, v1, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 194
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->b()I

    move-result v1

    .line 195
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_33

    const/16 v2, 0x8

    .line 196
    invoke-virtual {v12, v1, v2}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    goto :goto_1b

    .line 197
    :cond_33
    invoke-virtual {v12, v1, v3}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 198
    :goto_1b
    invoke-virtual/range {v19 .. v19}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v1

    .line 199
    iput-object v12, v1, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    return-object v1
.end method

.method private vv(I)I
    .locals 1

    .line 24
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(I)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object p1

    const-string v0, "enable_notification_ui"

    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/downloader/n/vv;->m(Ljava/lang/String;)I

    move-result p1

    if-lez p1, :cond_0

    .line 25
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->qv()I

    move-result p1

    return p1

    .line 26
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->n()I

    move-result p1

    return p1
.end method

.method private vv(II)I
    .locals 1

    .line 13
    invoke-static {p2}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(I)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object p2

    const-string v0, "notification_opt_2"

    invoke-virtual {p2, v0}, Lcom/ss/android/socialbase/downloader/n/vv;->m(Ljava/lang/String;)I

    move-result p2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 14
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->v()I

    move-result p1

    return p1

    :cond_0
    const/4 p2, 0x0

    if-eq p1, v0, :cond_3

    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    if-ne p1, v0, :cond_2

    .line 15
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->y()I

    move-result p2

    goto :goto_1

    :cond_2
    const/4 v0, 0x3

    if-ne p1, v0, :cond_4

    .line 16
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->v()I

    move-result p2

    goto :goto_1

    .line 17
    :cond_3
    :goto_0
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->x()I

    move-result p2

    :cond_4
    :goto_1
    return p2
.end method

.method private vv(Ljava/lang/String;II)Landroid/app/PendingIntent;
    .locals 3

    .line 18
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ss/android/socialbase/appdownloader/o/vv;->m:Landroid/content/Context;

    const-class v2, Lcom/ss/android/socialbase/appdownloader/DownloadHandlerService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 19
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "extra_click_download_ids"

    .line 20
    invoke-virtual {v0, p1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p1, "extra_click_download_type"

    .line 21
    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p1, "extra_from_notification"

    const/4 p2, 0x1

    .line 22
    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 23
    iget-object p1, p0, Lcom/ss/android/socialbase/appdownloader/o/vv;->m:Landroid/content/Context;

    const/high16 p2, 0xc000000

    invoke-static {p1, p3, v0, p2}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method

.method private vv(Lcom/ss/android/socialbase/downloader/exception/BaseException;Lcom/ss/android/socialbase/downloader/n/vv;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 9
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;->getErrorCode()I

    move-result v1

    const/16 v2, 0x3f5

    if-eq v1, v2, :cond_0

    .line 10
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/exception/BaseException;->getErrorCode()I

    move-result p1

    const/16 v1, 0x419

    if-ne p1, v1, :cond_1

    :cond_0
    if-eqz p3, :cond_1

    .line 11
    invoke-virtual {p3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getMimeType()Ljava/lang/String;

    move-result-object p1

    const-string p3, "application/vnd.android.package-archive"

    invoke-virtual {p3, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "notification_text_opt"

    .line 12
    invoke-virtual {p2, p1, v0}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_1

    return p2

    :cond_1
    return v0
.end method

.method private wv()Landroid/widget/RemoteViews;
    .locals 5

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->vv()I

    move-result v0

    .line 2
    new-instance v1, Landroid/widget/RemoteViews;

    iget-object v2, p0, Lcom/ss/android/socialbase/appdownloader/o/vv;->m:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x14

    if-le v0, v2, :cond_0

    .line 4
    :try_start_0
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/o/vv;->m:Landroid/content/Context;

    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/p;->vv(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->u()I

    move-result v0

    .line 6
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o;->g()I

    move-result v2

    const-string v3, "setBackgroundColor"

    .line 7
    iget-object v4, p0, Lcom/ss/android/socialbase/appdownloader/o/vv;->m:Landroid/content/Context;

    .line 8
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 9
    invoke-virtual {v1, v0, v3, v2}, Landroid/widget/RemoteViews;->setInt(ILjava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-object v1
.end method


# virtual methods
.method public vv(Lcom/ss/android/socialbase/downloader/exception/BaseException;Z)V
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/o/vv;->m:Landroid/content/Context;

    if-nez v0, :cond_0

    return-void

    .line 6
    :cond_0
    :try_start_0
    invoke-direct {p0, p1, p2}, Lcom/ss/android/socialbase/appdownloader/o/vv;->m(Lcom/ss/android/socialbase/downloader/exception/BaseException;Z)Landroid/app/Notification;

    move-result-object p1

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/notification/vv;->vv:Landroid/app/Notification;

    .line 7
    invoke-virtual {p0, p1}, Lcom/ss/android/socialbase/downloader/notification/vv;->vv(Landroid/app/Notification;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    return-void
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/notification/vv;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 2
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/socialbase/appdownloader/o/vv;->o:Ljava/lang/String;

    .line 3
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/socialbase/appdownloader/o/vv;->i:Ljava/lang/String;

    .line 4
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getExtra()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/o/vv;->u:Ljava/lang/String;

    return-void
.end method
