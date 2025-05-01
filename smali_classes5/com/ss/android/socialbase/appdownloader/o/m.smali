.class public Lcom/ss/android/socialbase/appdownloader/o/m;
.super Lcom/ss/android/socialbase/downloader/depend/i;


# instance fields
.field private i:Ljava/lang/String;

.field private m:I

.field private n:Lcom/ss/android/socialbase/downloader/notification/vv;

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;

.field private u:Ljava/lang/String;

.field private vv:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/depend/i;-><init>()V

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/o/m;->vv:Landroid/content/Context;

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->ky()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/o/m;->vv:Landroid/content/Context;

    .line 4
    :goto_0
    iput p2, p0, Lcom/ss/android/socialbase/appdownloader/o/m;->m:I

    .line 5
    iput-object p3, p0, Lcom/ss/android/socialbase/appdownloader/o/m;->p:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/ss/android/socialbase/appdownloader/o/m;->i:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/ss/android/socialbase/appdownloader/o/m;->o:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/ss/android/socialbase/appdownloader/o/m;->u:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/ss/android/socialbase/downloader/notification/vv;)V
    .locals 1

    .line 9
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/depend/i;-><init>()V

    .line 10
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->ky()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/socialbase/appdownloader/o/m;->vv:Landroid/content/Context;

    .line 11
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/o/m;->n:Lcom/ss/android/socialbase/downloader/notification/vv;

    return-void
.end method


# virtual methods
.method public onFailed(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/exception/BaseException;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/o/m;->vv:Landroid/content/Context;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->canShowNotification()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isAutoInstallWithoutNotification()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/ss/android/socialbase/downloader/depend/i;->onFailed(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/exception/BaseException;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onPause(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 1
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isAutoInstallWithoutNotification()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/depend/i;->onPause(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onPrepare(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 1
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isAutoInstallWithoutNotification()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/depend/i;->onPrepare(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onProgress(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 1
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isAutoInstallWithoutNotification()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/depend/i;->onProgress(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onStart(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 1
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isAutoInstallWithoutNotification()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/depend/i;->onStart(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onSuccessed(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 1

    if-eqz p1, :cond_3

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/o/m;->vv:Landroid/content/Context;

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->canShowNotification()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isAutoInstallWithoutNotification()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isAutoInstall()Z

    move-result v0

    if-nez v0, :cond_2

    .line 3
    :cond_1
    invoke-super {p0, p1}, Lcom/ss/android/socialbase/downloader/depend/i;->onSuccessed(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 4
    :cond_2
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isAutoInstall()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 5
    invoke-static {p1}, Lcom/ss/android/socialbase/appdownloader/u/m;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public vv()Lcom/ss/android/socialbase/downloader/notification/vv;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/o/m;->n:Lcom/ss/android/socialbase/downloader/notification/vv;

    if-nez v0, :cond_0

    iget-object v2, p0, Lcom/ss/android/socialbase/appdownloader/o/m;->vv:Landroid/content/Context;

    if-eqz v2, :cond_0

    .line 2
    new-instance v0, Lcom/ss/android/socialbase/appdownloader/o/vv;

    iget v3, p0, Lcom/ss/android/socialbase/appdownloader/o/m;->m:I

    iget-object v4, p0, Lcom/ss/android/socialbase/appdownloader/o/m;->p:Ljava/lang/String;

    iget-object v5, p0, Lcom/ss/android/socialbase/appdownloader/o/m;->i:Ljava/lang/String;

    iget-object v6, p0, Lcom/ss/android/socialbase/appdownloader/o/m;->o:Ljava/lang/String;

    iget-object v7, p0, Lcom/ss/android/socialbase/appdownloader/o/m;->u:Ljava/lang/String;

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lcom/ss/android/socialbase/appdownloader/o/vv;-><init>(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method
