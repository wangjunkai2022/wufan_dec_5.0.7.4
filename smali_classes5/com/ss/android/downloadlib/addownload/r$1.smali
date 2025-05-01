.class final Lcom/ss/android/downloadlib/addownload/r$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/downloadlib/addownload/vv/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/addownload/r;->vv(Lcom/ss/android/downloadad/api/vv/m;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;ILcom/ss/android/downloadlib/addownload/i/qv;ZLcom/ss/android/downloadlib/addownload/vv/p;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic i:Lcom/ss/android/downloadlib/addownload/i/qv;

.field final synthetic m:Z

.field final synthetic p:Lcom/ss/android/downloadad/api/vv/m;

.field final synthetic vv:I


# direct methods
.method constructor <init>(IZLcom/ss/android/downloadad/api/vv/m;Lcom/ss/android/downloadlib/addownload/i/qv;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/ss/android/downloadlib/addownload/r$1;->vv:I

    iput-boolean p2, p0, Lcom/ss/android/downloadlib/addownload/r$1;->m:Z

    iput-object p3, p0, Lcom/ss/android/downloadlib/addownload/r$1;->p:Lcom/ss/android/downloadad/api/vv/m;

    iput-object p4, p0, Lcom/ss/android/downloadlib/addownload/r$1;->i:Lcom/ss/android/downloadlib/addownload/i/qv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public m()V
    .locals 3

    const/4 v0, 0x0

    .line 1
    invoke-static {v0}, Lcom/ss/android/downloadlib/addownload/r;->vv(Lcom/ss/android/downloadlib/addownload/vv/i;)V

    .line 2
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object v0

    iget v1, p0, Lcom/ss/android/downloadlib/addownload/r$1;->vv:I

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getDownloadInfo(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->stopPauseReserveOnWifi()V

    .line 4
    :cond_0
    iget-boolean v0, p0, Lcom/ss/android/downloadlib/addownload/r$1;->m:Z

    if-eqz v0, :cond_1

    .line 5
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object v0

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/r$1;->p:Lcom/ss/android/downloadad/api/vv/m;

    const-string v2, "cancel_pause_reserve_wifi_cancel"

    invoke-virtual {v0, v2, v1}, Lcom/ss/android/downloadlib/i/vv;->vv(Ljava/lang/String;Lcom/ss/android/downloadad/api/vv/vv;)V

    goto :goto_0

    .line 6
    :cond_1
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object v0

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/r$1;->p:Lcom/ss/android/downloadad/api/vv/m;

    const-string v2, "pause_reserve_wifi_cancel"

    invoke-virtual {v0, v2, v1}, Lcom/ss/android/downloadlib/i/vv;->m(Ljava/lang/String;Lcom/ss/android/downloadad/api/vv/vv;)V

    .line 7
    :goto_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/r$1;->i:Lcom/ss/android/downloadlib/addownload/i/qv;

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/r$1;->p:Lcom/ss/android/downloadad/api/vv/m;

    invoke-interface {v0, v1}, Lcom/ss/android/downloadlib/addownload/i/qv;->vv(Lcom/ss/android/downloadad/api/vv/m;)V

    return-void
.end method

.method public vv()V
    .locals 3

    const/4 v0, 0x0

    .line 1
    invoke-static {v0}, Lcom/ss/android/downloadlib/addownload/r;->vv(Lcom/ss/android/downloadlib/addownload/vv/i;)V

    .line 2
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object v0

    iget v1, p0, Lcom/ss/android/downloadlib/addownload/r$1;->vv:I

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getDownloadInfo(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->startPauseReserveOnWifi()V

    .line 4
    invoke-static {}, Lcom/ss/android/socialbase/downloader/impls/g;->vv()Lcom/ss/android/socialbase/downloader/impls/g;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ss/android/socialbase/downloader/impls/g;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 5
    iget-boolean v0, p0, Lcom/ss/android/downloadlib/addownload/r$1;->m:Z

    if-eqz v0, :cond_0

    .line 6
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object v0

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/r$1;->p:Lcom/ss/android/downloadad/api/vv/m;

    const-string v2, "cancel_pause_reserve_wifi_confirm"

    invoke-virtual {v0, v2, v1}, Lcom/ss/android/downloadlib/i/vv;->vv(Ljava/lang/String;Lcom/ss/android/downloadad/api/vv/vv;)V

    goto :goto_0

    .line 7
    :cond_0
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object v0

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/r$1;->p:Lcom/ss/android/downloadad/api/vv/m;

    const-string v2, "pause_reserve_wifi_confirm"

    invoke-virtual {v0, v2, v1}, Lcom/ss/android/downloadlib/i/vv;->m(Ljava/lang/String;Lcom/ss/android/downloadad/api/vv/vv;)V

    .line 8
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/r$1;->i:Lcom/ss/android/downloadlib/addownload/i/qv;

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/r$1;->p:Lcom/ss/android/downloadad/api/vv/m;

    invoke-interface {v0, v1}, Lcom/ss/android/downloadlib/addownload/i/qv;->vv(Lcom/ss/android/downloadad/api/vv/m;)V

    return-void
.end method
