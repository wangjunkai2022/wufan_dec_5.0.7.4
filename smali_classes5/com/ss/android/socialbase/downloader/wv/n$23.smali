.class final Lcom/ss/android/socialbase/downloader/wv/n$23;
.super Lcom/ss/android/socialbase/downloader/depend/ns$vv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/wv/n;->vv(Lcom/ss/android/socialbase/downloader/depend/vu;)Lcom/ss/android/socialbase/downloader/depend/ns;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic vv:Lcom/ss/android/socialbase/downloader/depend/vu;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/depend/vu;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/wv/n$23;->vv:Lcom/ss/android/socialbase/downloader/depend/vu;

    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/depend/ns$vv;-><init>()V

    return-void
.end method


# virtual methods
.method public vv()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/wv/n$23;->vv:Lcom/ss/android/socialbase/downloader/depend/vu;

    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/depend/vu;->vv()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public vv(ILcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/wv/n$23;->vv:Lcom/ss/android/socialbase/downloader/depend/vu;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/ss/android/socialbase/downloader/depend/vu;->vv(ILcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public vv(Z)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/wv/n$23;->vv:Lcom/ss/android/socialbase/downloader/depend/vu;

    invoke-interface {v0, p1}, Lcom/ss/android/socialbase/downloader/depend/vu;->vv(Z)Z

    move-result p1

    return p1
.end method
