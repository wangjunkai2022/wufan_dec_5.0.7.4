.class final Lcom/ss/android/socialbase/downloader/wv/n$26;
.super Lcom/ss/android/socialbase/downloader/depend/w$vv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/wv/n;->vv(Lcom/ss/android/socialbase/downloader/depend/a;)Lcom/ss/android/socialbase/downloader/depend/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic vv:Lcom/ss/android/socialbase/downloader/depend/a;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/depend/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/wv/n$26;->vv:Lcom/ss/android/socialbase/downloader/depend/a;

    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/depend/w$vv;-><init>()V

    return-void
.end method


# virtual methods
.method public m(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/wv/n$26;->vv:Lcom/ss/android/socialbase/downloader/depend/a;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/depend/a;->m(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    move-result p1

    return p1
.end method

.method public p(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/wv/n$26;->vv:Lcom/ss/android/socialbase/downloader/depend/a;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/depend/a;->p(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    move-result p1

    return p1
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/wv/n$26;->vv:Lcom/ss/android/socialbase/downloader/depend/a;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/depend/a;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    move-result p1

    return p1
.end method
