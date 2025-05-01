.class public Lcom/ss/android/downloadlib/qv;
.super Ljava/lang/Object;


# static fields
.field private static volatile vv:Lcom/ss/android/downloadlib/qv;


# instance fields
.field private final i:Lcom/ss/android/downloadad/api/vv;

.field private final m:Lcom/ss/android/download/api/vv;

.field private o:Lcom/ss/android/downloadad/api/m;

.field private final p:Lcom/ss/android/downloadlib/n;

.field private u:J


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {}, Lcom/ss/android/downloadlib/n;->vv()Lcom/ss/android/downloadlib/n;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/downloadlib/qv;->p:Lcom/ss/android/downloadlib/n;

    .line 4
    new-instance v0, Lcom/ss/android/downloadlib/o;

    invoke-direct {v0}, Lcom/ss/android/downloadlib/o;-><init>()V

    iput-object v0, p0, Lcom/ss/android/downloadlib/qv;->m:Lcom/ss/android/download/api/vv;

    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ss/android/downloadlib/qv;->u:J

    .line 6
    invoke-direct {p0, p1}, Lcom/ss/android/downloadlib/qv;->m(Landroid/content/Context;)V

    .line 7
    invoke-static {}, Lcom/ss/android/downloadlib/vv;->vv()Lcom/ss/android/downloadlib/vv;

    move-result-object p1

    iput-object p1, p0, Lcom/ss/android/downloadlib/qv;->i:Lcom/ss/android/downloadad/api/vv;

    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;Lcom/ss/android/downloadlib/qv$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/ss/android/downloadlib/qv;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic m(Lcom/ss/android/downloadlib/qv;)Lcom/ss/android/downloadlib/n;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ss/android/downloadlib/qv;->qv()Lcom/ss/android/downloadlib/n;

    move-result-object p0

    return-object p0
.end method

.method private m(Landroid/content/Context;)V
    .locals 7

    .line 2
    invoke-static {p1}, Lcom/ss/android/downloadlib/addownload/b;->vv(Landroid/content/Context;)V

    .line 3
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    .line 4
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/m/u;->vv()Lcom/ss/android/downloadlib/addownload/m/u;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/downloadlib/addownload/m/u;->m()V

    .line 5
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/i;->k()Lcom/ss/android/socialbase/appdownloader/i;

    move-result-object v1

    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v2

    new-instance v4, Lcom/ss/android/downloadlib/p/n;

    invoke-direct {v4}, Lcom/ss/android/downloadlib/p/n;-><init>()V

    new-instance v5, Lcom/ss/android/downloadlib/p/u;

    invoke-direct {v5, p1}, Lcom/ss/android/downloadlib/p/u;-><init>(Landroid/content/Context;)V

    new-instance v6, Lcom/ss/android/downloadlib/p;

    invoke-direct {v6}, Lcom/ss/android/downloadlib/p;-><init>()V

    const-string v3, "misc_config"

    invoke-virtual/range {v1 .. v6}, Lcom/ss/android/socialbase/appdownloader/i;->vv(Landroid/content/Context;Ljava/lang/String;Lcom/ss/android/socialbase/appdownloader/p/p;Lcom/ss/android/socialbase/appdownloader/p/i;Lcom/ss/android/socialbase/appdownloader/p/qv;)V

    .line 6
    new-instance v0, Lcom/ss/android/downloadlib/p/i;

    invoke-direct {v0}, Lcom/ss/android/downloadlib/p/i;-><init>()V

    .line 7
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/i;->k()Lcom/ss/android/socialbase/appdownloader/i;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ss/android/socialbase/appdownloader/i;->vv(Lcom/ss/android/socialbase/appdownloader/p/n;)V

    .line 8
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->registerDownloadCacheSyncListener(Lcom/ss/android/socialbase/downloader/depend/b;)V

    .line 9
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/i;->k()Lcom/ss/android/socialbase/appdownloader/i;

    move-result-object p1

    new-instance v0, Lcom/ss/android/downloadlib/addownload/jh;

    invoke-direct {v0}, Lcom/ss/android/downloadlib/addownload/jh;-><init>()V

    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/appdownloader/i;->vv(Lcom/ss/android/socialbase/downloader/downloader/g;)V

    .line 10
    new-instance p1, Lcom/ss/android/downloadlib/p/o;

    invoke-direct {p1}, Lcom/ss/android/downloadlib/p/o;-><init>()V

    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/downloader/p;->vv(Lcom/ss/android/socialbase/downloader/i/p;)V

    .line 11
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/i;->k()Lcom/ss/android/socialbase/appdownloader/i;

    move-result-object p1

    invoke-static {}, Lcom/ss/android/downloadlib/u/p;->vv()Lcom/ss/android/downloadlib/u/p;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/appdownloader/i;->vv(Lcom/ss/android/socialbase/appdownloader/p/k;)V

    return-void
.end method

.method private qv()Lcom/ss/android/downloadlib/n;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/qv;->p:Lcom/ss/android/downloadlib/n;

    return-object v0
.end method

.method public static vv(Landroid/content/Context;)Lcom/ss/android/downloadlib/qv;
    .locals 2

    .line 2
    sget-object v0, Lcom/ss/android/downloadlib/qv;->vv:Lcom/ss/android/downloadlib/qv;

    if-nez v0, :cond_1

    .line 3
    const-class v0, Lcom/ss/android/downloadlib/qv;

    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/ss/android/downloadlib/qv;->vv:Lcom/ss/android/downloadlib/qv;

    if-nez v1, :cond_0

    .line 5
    new-instance v1, Lcom/ss/android/downloadlib/qv$1;

    invoke-direct {v1, p0}, Lcom/ss/android/downloadlib/qv$1;-><init>(Landroid/content/Context;)V

    invoke-static {v1}, Lcom/ss/android/downloadlib/o/m;->vv(Ljava/lang/Runnable;)V

    .line 6
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 7
    :cond_1
    :goto_0
    sget-object p0, Lcom/ss/android/downloadlib/qv;->vv:Lcom/ss/android/downloadlib/qv;

    return-object p0
.end method

.method static synthetic vv(Lcom/ss/android/downloadlib/qv;)Lcom/ss/android/downloadlib/qv;
    .locals 0

    .line 1
    sput-object p0, Lcom/ss/android/downloadlib/qv;->vv:Lcom/ss/android/downloadlib/qv;

    return-object p0
.end method


# virtual methods
.method public i()Lcom/ss/android/downloadad/api/vv;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/qv;->i:Lcom/ss/android/downloadad/api/vv;

    return-object v0
.end method

.method public m()J
    .locals 2

    .line 12
    iget-wide v0, p0, Lcom/ss/android/downloadlib/qv;->u:J

    return-wide v0
.end method

.method public m(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 2

    .line 13
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 14
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/i;->k()Lcom/ss/android/socialbase/appdownloader/i;

    move-result-object v0

    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/ss/android/socialbase/appdownloader/i;->vv(Landroid/content/Context;Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1

    return-object p1
.end method

.method public n()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ss/android/downloadlib/i;->vv()Lcom/ss/android/downloadlib/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/downloadlib/i;->o()V

    return-void
.end method

.method public o()Lcom/ss/android/downloadad/api/m;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/qv;->o:Lcom/ss/android/downloadad/api/m;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Lcom/ss/android/downloadlib/m;->vv()Lcom/ss/android/downloadlib/m;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/downloadlib/qv;->o:Lcom/ss/android/downloadad/api/m;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/qv;->o:Lcom/ss/android/downloadad/api/m;

    return-object v0
.end method

.method public p()V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ss/android/downloadlib/qv;->u:J

    return-void
.end method

.method public u()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->t()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public vv()Lcom/ss/android/download/api/vv;
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/ss/android/downloadlib/qv;->m:Lcom/ss/android/download/api/vv;

    return-object v0
.end method

.method public vv(Ljava/lang/String;)Lcom/ss/android/download/api/vv;
    .locals 2

    .line 9
    invoke-static {}, Lcom/ss/android/downloadlib/u;->vv()Lcom/ss/android/downloadlib/u;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/downloadlib/u;->m()Lcom/ss/android/download/api/config/u;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 10
    invoke-interface {v0, p1}, Lcom/ss/android/download/api/config/u;->vv(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 11
    invoke-interface {v0, p1}, Lcom/ss/android/download/api/config/u;->m(Ljava/lang/String;)Lcom/ss/android/download/api/vv;

    move-result-object p1

    return-object p1

    .line 12
    :cond_0
    iget-object p1, p0, Lcom/ss/android/downloadlib/qv;->m:Lcom/ss/android/download/api/vv;

    return-object p1
.end method

.method public vv(Ljava/lang/String;Ljava/lang/String;Z)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
    .locals 1

    .line 20
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p3, :cond_0

    .line 21
    invoke-virtual {p0, p1}, Lcom/ss/android/downloadlib/qv;->m(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1

    return-object p1

    .line 22
    :cond_0
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object p3

    invoke-virtual {p3, p1, p2}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getDownloadInfo(Ljava/lang/String;Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1

    return-object p1
.end method

.method public vv(Landroid/content/Context;ILcom/ss/android/download/api/download/DownloadStatusChangeListener;Lcom/ss/android/download/api/download/DownloadModel;)V
    .locals 7
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 13
    new-instance v6, Lcom/ss/android/downloadlib/qv$4;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/ss/android/downloadlib/qv$4;-><init>(Lcom/ss/android/downloadlib/qv;Landroid/content/Context;ILcom/ss/android/download/api/download/DownloadStatusChangeListener;Lcom/ss/android/download/api/download/DownloadModel;)V

    invoke-static {v6}, Lcom/ss/android/downloadlib/o/m;->vv(Ljava/lang/Runnable;)V

    return-void
.end method

.method public vv(Lcom/ss/android/download/api/download/vv/vv;)V
    .locals 1

    .line 19
    invoke-direct {p0}, Lcom/ss/android/downloadlib/qv;->qv()Lcom/ss/android/downloadlib/n;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ss/android/downloadlib/n;->vv(Lcom/ss/android/download/api/download/vv/vv;)V

    return-void
.end method

.method public vv(Ljava/lang/String;I)V
    .locals 1
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 17
    new-instance v0, Lcom/ss/android/downloadlib/qv$2;

    invoke-direct {v0, p0, p1, p2}, Lcom/ss/android/downloadlib/qv$2;-><init>(Lcom/ss/android/downloadlib/qv;Ljava/lang/String;I)V

    invoke-static {v0}, Lcom/ss/android/downloadlib/o/m;->vv(Ljava/lang/Runnable;)V

    return-void
.end method

.method public vv(Ljava/lang/String;JILcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;)V
    .locals 9
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 15
    new-instance v8, Lcom/ss/android/downloadlib/qv$6;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    move v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/ss/android/downloadlib/qv$6;-><init>(Lcom/ss/android/downloadlib/qv;Ljava/lang/String;JILcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;)V

    invoke-static {v8}, Lcom/ss/android/downloadlib/o/m;->vv(Ljava/lang/Runnable;)V

    return-void
.end method

.method public vv(Ljava/lang/String;JILcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;Lcom/ss/android/download/api/config/IDownloadButtonClickListener;)V
    .locals 10
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 16
    new-instance v9, Lcom/ss/android/downloadlib/qv$7;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    move v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/ss/android/downloadlib/qv$7;-><init>(Lcom/ss/android/downloadlib/qv;Ljava/lang/String;JILcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;Lcom/ss/android/download/api/config/IDownloadButtonClickListener;)V

    invoke-static {v9}, Lcom/ss/android/downloadlib/o/m;->vv(Ljava/lang/Runnable;)V

    return-void
.end method

.method public vv(Ljava/lang/String;JILcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;Lcom/ss/android/download/api/config/OnItemClickListener;Lcom/ss/android/download/api/config/IDownloadButtonClickListener;)V
    .locals 11
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 14
    new-instance v10, Lcom/ss/android/downloadlib/qv$5;

    move-object v0, v10

    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    move v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Lcom/ss/android/downloadlib/qv$5;-><init>(Lcom/ss/android/downloadlib/qv;Ljava/lang/String;JILcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;Lcom/ss/android/download/api/config/OnItemClickListener;Lcom/ss/android/download/api/config/IDownloadButtonClickListener;)V

    invoke-static {v10}, Lcom/ss/android/downloadlib/o/m;->vv(Ljava/lang/Runnable;)V

    return-void
.end method

.method public vv(Ljava/lang/String;Z)V
    .locals 1
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 18
    new-instance v0, Lcom/ss/android/downloadlib/qv$3;

    invoke-direct {v0, p0, p1, p2}, Lcom/ss/android/downloadlib/qv$3;-><init>(Lcom/ss/android/downloadlib/qv;Ljava/lang/String;Z)V

    invoke-static {v0}, Lcom/ss/android/downloadlib/o/m;->vv(Ljava/lang/Runnable;)V

    return-void
.end method
