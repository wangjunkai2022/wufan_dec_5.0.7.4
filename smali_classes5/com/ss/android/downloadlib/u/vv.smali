.class public Lcom/ss/android/downloadlib/u/vv;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/socialbase/appdownloader/p/k;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private m(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/downloadlib/guide/install/vv;)V
    .locals 2
    .param p2    # Lcom/ss/android/downloadlib/guide/install/vv;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/m/u;->vv()Lcom/ss/android/downloadlib/addownload/m/u;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ss/android/downloadlib/addownload/m/u;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/downloadad/api/vv/m;

    move-result-object p1

    .line 2
    invoke-static {p1}, Lcom/ss/android/downloadlib/m/u;->vv(Lcom/ss/android/downloadad/api/vv/m;)Z

    move-result v0

    .line 3
    invoke-static {p1}, Lcom/ss/android/downloadlib/m/u;->m(Lcom/ss/android/downloadad/api/vv/m;)Z

    move-result v1

    if-eqz v0, :cond_1

    if-nez v1, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, Lcom/ss/android/downloadlib/u/vv$3;

    invoke-direct {v0, p0, p2}, Lcom/ss/android/downloadlib/u/vv$3;-><init>(Lcom/ss/android/downloadlib/u/vv;Lcom/ss/android/downloadlib/guide/install/vv;)V

    invoke-static {p1, v0}, Lcom/ss/android/downloadlib/m/p;->vv(Lcom/ss/android/downloadad/api/vv/m;Lcom/ss/android/downloadlib/guide/install/vv;)V

    return-void

    .line 5
    :cond_1
    :goto_0
    invoke-interface {p2}, Lcom/ss/android/downloadlib/guide/install/vv;->vv()V

    return-void
.end method

.method static synthetic vv(Lcom/ss/android/downloadlib/u/vv;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/downloadlib/guide/install/vv;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/ss/android/downloadlib/u/vv;->m(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/downloadlib/guide/install/vv;)V

    return-void
.end method


# virtual methods
.method public vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/downloadlib/guide/install/vv;)V
    .locals 2
    .param p2    # Lcom/ss/android/downloadlib/guide/install/vv;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 3
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/m/u;->vv()Lcom/ss/android/downloadlib/addownload/m/u;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ss/android/downloadlib/addownload/m/u;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/downloadad/api/vv/m;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    invoke-static {v0}, Lcom/ss/android/downloadlib/m/wv;->vv(Lcom/ss/android/downloadad/api/vv/vv;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 5
    new-instance v1, Lcom/ss/android/downloadlib/u/vv$2;

    invoke-direct {v1, p0, p1, p2}, Lcom/ss/android/downloadlib/u/vv$2;-><init>(Lcom/ss/android/downloadlib/u/vv;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/downloadlib/guide/install/vv;)V

    invoke-static {v0, v1}, Lcom/ss/android/downloadlib/activity/TTDelegateActivity;->vv(Lcom/ss/android/downloadad/api/vv/vv;Lcom/ss/android/downloadlib/guide/install/vv;)V

    return-void

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/ss/android/downloadlib/u/vv;->m(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/downloadlib/guide/install/vv;)V

    return-void
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/appdownloader/p/wv;)V
    .locals 1

    .line 2
    new-instance v0, Lcom/ss/android/downloadlib/u/vv$1;

    invoke-direct {v0, p0, p2}, Lcom/ss/android/downloadlib/u/vv$1;-><init>(Lcom/ss/android/downloadlib/u/vv;Lcom/ss/android/socialbase/appdownloader/p/wv;)V

    invoke-virtual {p0, p1, v0}, Lcom/ss/android/downloadlib/u/vv;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/downloadlib/guide/install/vv;)V

    return-void
.end method
