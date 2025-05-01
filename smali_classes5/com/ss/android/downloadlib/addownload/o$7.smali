.class Lcom/ss/android/downloadlib/addownload/o$7;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/downloadlib/addownload/i/qv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/addownload/o;->u(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic i:I

.field final synthetic m:Z

.field final synthetic o:Lcom/ss/android/downloadlib/addownload/o;

.field final synthetic p:Lcom/ss/android/downloadad/api/vv/m;

.field final synthetic vv:I


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/addownload/o;IZLcom/ss/android/downloadad/api/vv/m;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/o$7;->o:Lcom/ss/android/downloadlib/addownload/o;

    iput p2, p0, Lcom/ss/android/downloadlib/addownload/o$7;->vv:I

    iput-boolean p3, p0, Lcom/ss/android/downloadlib/addownload/o$7;->m:Z

    iput-object p4, p0, Lcom/ss/android/downloadlib/addownload/o$7;->p:Lcom/ss/android/downloadad/api/vv/m;

    iput p5, p0, Lcom/ss/android/downloadlib/addownload/o$7;->i:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public vv(Lcom/ss/android/downloadad/api/vv/m;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/o$7;->o:Lcom/ss/android/downloadlib/addownload/o;

    invoke-static {p1}, Lcom/ss/android/downloadlib/addownload/o;->n(Lcom/ss/android/downloadlib/addownload/o;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1

    if-nez p1, :cond_0

    .line 2
    invoke-static {}, Lcom/ss/android/socialbase/downloader/n/vv;->p()Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object p1

    const-string v0, "fix_handle_pause"

    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/o$7;->o:Lcom/ss/android/downloadlib/addownload/o;

    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object v0

    iget v1, p0, Lcom/ss/android/downloadlib/addownload/o$7;->vv:I

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getDownloadInfo(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ss/android/downloadlib/addownload/o;->vv(Lcom/ss/android/downloadlib/addownload/o;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/o$7;->o:Lcom/ss/android/downloadlib/addownload/o;

    invoke-static {p1}, Lcom/ss/android/downloadlib/addownload/o;->m(Lcom/ss/android/downloadlib/addownload/o;)Lcom/ss/android/downloadlib/addownload/qv;

    move-result-object p1

    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o$7;->o:Lcom/ss/android/downloadlib/addownload/o;

    invoke-static {v0}, Lcom/ss/android/downloadlib/addownload/o;->n(Lcom/ss/android/downloadlib/addownload/o;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v0

    iget-boolean v1, p0, Lcom/ss/android/downloadlib/addownload/o$7;->m:Z

    invoke-virtual {p1, v0, v1}, Lcom/ss/android/downloadlib/addownload/qv;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Z)V

    .line 5
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/o$7;->o:Lcom/ss/android/downloadlib/addownload/o;

    invoke-static {p1}, Lcom/ss/android/downloadlib/addownload/o;->n(Lcom/ss/android/downloadlib/addownload/o;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/wv/u;->m(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/o$7;->o:Lcom/ss/android/downloadlib/addownload/o;

    invoke-static {p1}, Lcom/ss/android/downloadlib/addownload/o;->n(Lcom/ss/android/downloadlib/addownload/o;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isPauseReserveOnWifi()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 6
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/o$7;->o:Lcom/ss/android/downloadlib/addownload/o;

    invoke-static {p1}, Lcom/ss/android/downloadlib/addownload/o;->n(Lcom/ss/android/downloadlib/addownload/o;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->stopPauseReserveOnWifi()V

    .line 7
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object p1

    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/o$7;->p:Lcom/ss/android/downloadad/api/vv/m;

    const-string v1, "pause_reserve_wifi_cancel_on_wifi"

    invoke-virtual {p1, v1, v0}, Lcom/ss/android/downloadlib/i/vv;->m(Ljava/lang/String;Lcom/ss/android/downloadad/api/vv/vv;)V

    return-void

    .line 8
    :cond_1
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/o$7;->o:Lcom/ss/android/downloadlib/addownload/o;

    iget v0, p0, Lcom/ss/android/downloadlib/addownload/o$7;->vv:I

    iget v1, p0, Lcom/ss/android/downloadlib/addownload/o$7;->i:I

    invoke-static {p1}, Lcom/ss/android/downloadlib/addownload/o;->n(Lcom/ss/android/downloadlib/addownload/o;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v2

    invoke-static {p1, v0, v1, v2}, Lcom/ss/android/downloadlib/addownload/o;->vv(Lcom/ss/android/downloadlib/addownload/o;IILcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    return-void
.end method
