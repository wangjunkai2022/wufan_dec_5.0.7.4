.class Lcom/ss/android/downloadlib/o;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/download/api/vv;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public vv(Lcom/ss/android/download/api/config/d;)Lcom/ss/android/download/api/vv;
    .locals 0

    .line 15
    invoke-static {p1}, Lcom/ss/android/downloadlib/addownload/b;->vv(Lcom/ss/android/download/api/config/d;)V

    return-object p0
.end method

.method public vv(Lcom/ss/android/download/api/config/jh;)Lcom/ss/android/download/api/vv;
    .locals 0
    .param p1    # Lcom/ss/android/download/api/config/jh;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 3
    invoke-static {p1}, Lcom/ss/android/downloadlib/addownload/b;->vv(Lcom/ss/android/download/api/config/jh;)V

    return-object p0
.end method

.method public vv(Lcom/ss/android/download/api/config/k;)Lcom/ss/android/download/api/vv;
    .locals 0
    .param p1    # Lcom/ss/android/download/api/config/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 5
    invoke-static {p1}, Lcom/ss/android/downloadlib/addownload/b;->vv(Lcom/ss/android/download/api/config/k;)V

    return-object p0
.end method

.method public vv(Lcom/ss/android/download/api/config/m;)Lcom/ss/android/download/api/vv;
    .locals 2
    .param p1    # Lcom/ss/android/download/api/config/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 8
    invoke-static {p1}, Lcom/ss/android/downloadlib/addownload/b;->vv(Lcom/ss/android/download/api/config/m;)V

    .line 9
    invoke-static {}, Lcom/ss/android/socialbase/downloader/vv/vv;->vv()Lcom/ss/android/socialbase/downloader/vv/vv;

    move-result-object v0

    new-instance v1, Lcom/ss/android/downloadlib/o$1;

    invoke-direct {v1, p0, p1}, Lcom/ss/android/downloadlib/o$1;-><init>(Lcom/ss/android/downloadlib/o;Lcom/ss/android/download/api/config/m;)V

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/vv/vv;->vv(Lcom/ss/android/socialbase/downloader/vv/vv$p;)V

    return-object p0
.end method

.method public vv(Lcom/ss/android/download/api/config/n;)Lcom/ss/android/download/api/vv;
    .locals 0
    .param p1    # Lcom/ss/android/download/api/config/n;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    invoke-static {p1}, Lcom/ss/android/downloadlib/addownload/b;->vv(Lcom/ss/android/download/api/config/n;)V

    return-object p0
.end method

.method public vv(Lcom/ss/android/download/api/config/qv;)Lcom/ss/android/download/api/vv;
    .locals 0
    .param p1    # Lcom/ss/android/download/api/config/qv;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 4
    invoke-static {p1}, Lcom/ss/android/downloadlib/addownload/b;->vv(Lcom/ss/android/download/api/config/qv;)V

    return-object p0
.end method

.method public vv(Lcom/ss/android/download/api/config/wv;)Lcom/ss/android/download/api/vv;
    .locals 0
    .param p1    # Lcom/ss/android/download/api/config/wv;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-static {p1}, Lcom/ss/android/downloadlib/addownload/b;->vv(Lcom/ss/android/download/api/config/wv;)V

    return-object p0
.end method

.method public vv(Lcom/ss/android/download/api/model/vv;)Lcom/ss/android/download/api/vv;
    .locals 0
    .param p1    # Lcom/ss/android/download/api/model/vv;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 6
    invoke-static {p1}, Lcom/ss/android/downloadlib/addownload/b;->vv(Lcom/ss/android/download/api/model/vv;)V

    return-object p0
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;)Lcom/ss/android/download/api/vv;
    .locals 1

    .line 10
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->getNotificationClickCallback()Lcom/ss/android/socialbase/downloader/depend/a;

    move-result-object v0

    if-nez v0, :cond_0

    .line 11
    new-instance v0, Lcom/ss/android/downloadlib/o$2;

    invoke-direct {v0, p0}, Lcom/ss/android/downloadlib/o$2;-><init>(Lcom/ss/android/downloadlib/o;)V

    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->notificationClickCallback(Lcom/ss/android/socialbase/downloader/depend/a;)Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;

    .line 12
    :cond_0
    new-instance v0, Lcom/ss/android/downloadlib/p/p;

    invoke-direct {v0}, Lcom/ss/android/downloadlib/p/p;-><init>()V

    .line 13
    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;->addDownloadCompleteHandler(Lcom/ss/android/socialbase/downloader/depend/r;)Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;

    const/4 v0, 0x1

    .line 14
    invoke-static {p1, v0}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->initOrCover(Lcom/ss/android/socialbase/downloader/downloader/DownloaderBuilder;Z)V

    return-object p0
.end method

.method public vv(Ljava/lang/String;)Lcom/ss/android/download/api/vv;
    .locals 0

    .line 7
    invoke-static {p1}, Lcom/ss/android/downloadlib/addownload/b;->vv(Ljava/lang/String;)V

    return-object p0
.end method

.method public vv()V
    .locals 2

    .line 16
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->ya()Z

    move-result v0

    if-nez v0, :cond_0

    .line 17
    invoke-static {}, Lcom/ss/android/downloadlib/o/p;->vv()Lcom/ss/android/downloadlib/o/p;

    move-result-object v0

    const-string v1, "ttdownloader init error"

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/o/p;->vv(Ljava/lang/String;)V

    .line 18
    :cond_0
    invoke-static {}, Lcom/ss/android/downloadlib/o/p;->vv()Lcom/ss/android/downloadlib/o/p;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/downloadlib/addownload/b;->vv(Lcom/ss/android/download/api/m/vv;)V

    .line 19
    :try_start_0
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/i;->k()Lcom/ss/android/socialbase/appdownloader/i;

    move-result-object v0

    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->v()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/appdownloader/i;->m(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 21
    :goto_0
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/i;->k()Lcom/ss/android/socialbase/appdownloader/i;

    move-result-object v0

    invoke-static {}, Lcom/ss/android/downloadlib/vv;->vv()Lcom/ss/android/downloadlib/vv;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/appdownloader/i;->vv(Lcom/ss/android/socialbase/downloader/depend/c;)V

    .line 22
    invoke-static {}, Lcom/ss/android/downloadlib/i;->vv()Lcom/ss/android/downloadlib/i;

    move-result-object v0

    new-instance v1, Lcom/ss/android/downloadlib/o$3;

    invoke-direct {v1, p0}, Lcom/ss/android/downloadlib/o$3;-><init>(Lcom/ss/android/downloadlib/o;)V

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/i;->m(Ljava/lang/Runnable;)V

    return-void
.end method
