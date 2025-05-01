.class public Lcom/ss/android/downloadlib/p/qv;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ss/android/downloadlib/p/qv$vv;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ss/android/downloadlib/p/qv$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ss/android/downloadlib/p/qv;-><init>()V

    return-void
.end method

.method private m(Lcom/ss/android/downloadad/api/vv/m;J)V
    .locals 5
    .param p1    # Lcom/ss/android/downloadad/api/vv/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/vv/m;->la()I

    move-result v0

    .line 3
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(I)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v1

    const-string v2, "notification_opt_2"

    invoke-virtual {v1, v2}, Lcom/ss/android/socialbase/downloader/n/vv;->m(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    return-void

    .line 4
    :cond_0
    invoke-virtual {p0, v0}, Lcom/ss/android/downloadlib/p/qv;->vv(I)V

    .line 5
    invoke-static {}, Lcom/ss/android/downloadlib/i;->vv()Lcom/ss/android/downloadlib/i;

    move-result-object v1

    new-instance v2, Lcom/ss/android/downloadlib/p/qv$1;

    invoke-direct {v2, p0, v0, p1}, Lcom/ss/android/downloadlib/p/qv$1;-><init>(Lcom/ss/android/downloadlib/p/qv;ILcom/ss/android/downloadad/api/vv/m;)V

    const-wide/16 v3, 0x3e8

    mul-long p2, p2, v3

    invoke-virtual {v1, v2, p2, p3}, Lcom/ss/android/downloadlib/i;->vv(Ljava/lang/Runnable;J)V

    return-void
.end method

.method private p(Lcom/ss/android/downloadad/api/vv/m;J)V
    .locals 5
    .param p1    # Lcom/ss/android/downloadad/api/vv/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/vv/m;->la()I

    move-result v0

    .line 3
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(I)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v1

    const-string v2, "notification_opt_2"

    invoke-virtual {v1, v2}, Lcom/ss/android/socialbase/downloader/n/vv;->m(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    return-void

    .line 4
    :cond_0
    invoke-virtual {p0, v0}, Lcom/ss/android/downloadlib/p/qv;->vv(I)V

    .line 5
    invoke-static {}, Lcom/ss/android/downloadlib/i;->vv()Lcom/ss/android/downloadlib/i;

    move-result-object v1

    new-instance v2, Lcom/ss/android/downloadlib/p/qv$2;

    invoke-direct {v2, p0, v0, p1}, Lcom/ss/android/downloadlib/p/qv$2;-><init>(Lcom/ss/android/downloadlib/p/qv;ILcom/ss/android/downloadad/api/vv/m;)V

    const-wide/16 v3, 0x3e8

    mul-long p2, p2, v3

    invoke-virtual {v1, v2, p2, p3}, Lcom/ss/android/downloadlib/i;->vv(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public static vv()Lcom/ss/android/downloadlib/p/qv;
    .locals 1

    .line 2
    invoke-static {}, Lcom/ss/android/downloadlib/p/qv$vv;->vv()Lcom/ss/android/downloadlib/p/qv;

    move-result-object v0

    return-object v0
.end method

.method private vv(ILcom/ss/android/downloadad/api/vv/m;Lorg/json/JSONObject;)V
    .locals 9

    .line 8
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o/i;->vv()Z

    move-result v0

    const-string v1, "error_code"

    if-nez v0, :cond_0

    const/16 p1, 0x3ec

    .line 9
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p3, v1, p1}, Lcom/ss/android/downloadlib/n/jh;->vv(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 10
    :cond_0
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getDownloadInfo(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v0

    if-nez v0, :cond_1

    const/16 p1, 0x3ed

    .line 11
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p3, v1, p1}, Lcom/ss/android/downloadlib/n/jh;->vv(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 12
    :cond_1
    invoke-static {}, Lcom/ss/android/socialbase/downloader/notification/m;->vv()Lcom/ss/android/socialbase/downloader/notification/m;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/ss/android/socialbase/downloader/notification/m;->o(I)Lcom/ss/android/socialbase/downloader/notification/vv;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 13
    invoke-static {}, Lcom/ss/android/socialbase/downloader/notification/m;->vv()Lcom/ss/android/socialbase/downloader/notification/m;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/ss/android/socialbase/downloader/notification/m;->u(I)V

    .line 14
    :cond_2
    new-instance v1, Lcom/ss/android/socialbase/appdownloader/o/vv;

    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getExtra()Ljava/lang/String;

    move-result-object v8

    move-object v2, v1

    move v4, p1

    invoke-direct/range {v2 .. v8}, Lcom/ss/android/socialbase/appdownloader/o/vv;-><init>(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/ss/android/socialbase/downloader/notification/vv;->vv(J)V

    .line 16
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/ss/android/socialbase/downloader/notification/vv;->m(J)V

    .line 17
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result p1

    const/4 v0, 0x0

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v0, v2, v2}, Lcom/ss/android/socialbase/downloader/notification/vv;->vv(ILcom/ss/android/socialbase/downloader/exception/BaseException;ZZ)V

    .line 18
    invoke-static {}, Lcom/ss/android/socialbase/downloader/notification/m;->vv()Lcom/ss/android/socialbase/downloader/notification/m;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/ss/android/socialbase/downloader/notification/m;->vv(Lcom/ss/android/socialbase/downloader/notification/vv;)V

    .line 19
    invoke-virtual {v1, v0, v2}, Lcom/ss/android/socialbase/downloader/notification/vv;->vv(Lcom/ss/android/socialbase/downloader/exception/BaseException;Z)V

    .line 20
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object p1

    const-string v0, "download_notification_show"

    invoke-virtual {p1, v0, p3, p2}, Lcom/ss/android/downloadlib/i/vv;->m(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V

    return-void
.end method

.method static synthetic vv(Lcom/ss/android/downloadlib/p/qv;ILcom/ss/android/downloadad/api/vv/m;Lorg/json/JSONObject;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/ss/android/downloadlib/p/qv;->vv(ILcom/ss/android/downloadad/api/vv/m;Lorg/json/JSONObject;)V

    return-void
.end method


# virtual methods
.method public i(Lcom/ss/android/downloadad/api/vv/m;)V
    .locals 3
    .param p1    # Lcom/ss/android/downloadad/api/vv/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/vv/m;->la()I

    move-result v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(I)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v0

    const-string v1, "noti_install_delay_secs"

    const/4 v2, 0x5

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result v0

    int-to-long v0, v0

    invoke-direct {p0, p1, v0, v1}, Lcom/ss/android/downloadlib/p/qv;->p(Lcom/ss/android/downloadad/api/vv/m;J)V

    return-void
.end method

.method public m(Lcom/ss/android/downloadad/api/vv/m;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/vv/m;->la()I

    move-result v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(I)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v0

    const/4 v1, 0x5

    const-string v2, "noti_continue_delay_secs"

    invoke-virtual {v0, v2, v1}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result v0

    int-to-long v0, v0

    invoke-direct {p0, p1, v0, v1}, Lcom/ss/android/downloadlib/p/qv;->m(Lcom/ss/android/downloadad/api/vv/m;J)V

    return-void
.end method

.method public o(Lcom/ss/android/downloadad/api/vv/m;)V
    .locals 2
    .param p1    # Lcom/ss/android/downloadad/api/vv/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-wide/16 v0, 0x5

    .line 1
    invoke-virtual {p0, p1, v0, v1}, Lcom/ss/android/downloadlib/p/qv;->vv(Lcom/ss/android/downloadad/api/vv/m;J)V

    return-void
.end method

.method public p(Lcom/ss/android/downloadad/api/vv/m;)V
    .locals 2
    .param p1    # Lcom/ss/android/downloadad/api/vv/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-wide/16 v0, 0x5

    .line 1
    invoke-direct {p0, p1, v0, v1}, Lcom/ss/android/downloadlib/p/qv;->p(Lcom/ss/android/downloadad/api/vv/m;J)V

    return-void
.end method

.method public u(Lcom/ss/android/downloadad/api/vv/m;)V
    .locals 3
    .param p1    # Lcom/ss/android/downloadad/api/vv/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/vv/m;->la()I

    move-result v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(I)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v0

    const-string v1, "noti_open_delay_secs"

    const/4 v2, 0x5

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p0, p1, v0, v1}, Lcom/ss/android/downloadlib/p/qv;->vv(Lcom/ss/android/downloadad/api/vv/m;J)V

    return-void
.end method

.method public vv(I)V
    .locals 2

    .line 21
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o/p;->vv()Lcom/ss/android/socialbase/appdownloader/o/p;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/appdownloader/o/p;->vv(I)Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_0

    .line 22
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getDownloadInfo(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 23
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/o/p;->vv()Lcom/ss/android/socialbase/appdownloader/o/p;

    move-result-object v1

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getIconUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, p1, v0}, Lcom/ss/android/socialbase/appdownloader/o/p;->vv(ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public vv(Lcom/ss/android/downloadad/api/vv/m;)V
    .locals 2

    const-wide/16 v0, 0x5

    .line 3
    invoke-direct {p0, p1, v0, v1}, Lcom/ss/android/downloadlib/p/qv;->m(Lcom/ss/android/downloadad/api/vv/m;J)V

    return-void
.end method

.method public vv(Lcom/ss/android/downloadad/api/vv/m;J)V
    .locals 5
    .param p1    # Lcom/ss/android/downloadad/api/vv/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 4
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/vv/m;->la()I

    move-result v0

    .line 5
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(I)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v1

    const-string v2, "notification_opt_2"

    invoke-virtual {v1, v2}, Lcom/ss/android/socialbase/downloader/n/vv;->m(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    return-void

    .line 6
    :cond_0
    invoke-virtual {p0, v0}, Lcom/ss/android/downloadlib/p/qv;->vv(I)V

    .line 7
    invoke-static {}, Lcom/ss/android/downloadlib/i;->vv()Lcom/ss/android/downloadlib/i;

    move-result-object v1

    new-instance v2, Lcom/ss/android/downloadlib/p/qv$3;

    invoke-direct {v2, p0, v0, p1}, Lcom/ss/android/downloadlib/p/qv$3;-><init>(Lcom/ss/android/downloadlib/p/qv;ILcom/ss/android/downloadad/api/vv/m;)V

    const-wide/16 v3, 0x3e8

    mul-long p2, p2, v3

    invoke-virtual {v1, v2, p2, p3}, Lcom/ss/android/downloadlib/i;->vv(Ljava/lang/Runnable;J)V

    return-void
.end method
