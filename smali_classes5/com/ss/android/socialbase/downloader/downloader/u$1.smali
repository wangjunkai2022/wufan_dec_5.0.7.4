.class Lcom/ss/android/socialbase/downloader/downloader/u$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/downloader/u;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic vv:Lcom/ss/android/socialbase/downloader/downloader/u;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/downloader/u;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/u$1;->vv:Lcom/ss/android/socialbase/downloader/downloader/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/u$1;->vv:Lcom/ss/android/socialbase/downloader/downloader/u;

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/u;->m(Lcom/ss/android/socialbase/downloader/downloader/u;)Lcom/ss/android/socialbase/downloader/downloader/k;

    move-result-object v0

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/u$1;->vv:Lcom/ss/android/socialbase/downloader/downloader/u;

    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/downloader/u;->vv(Lcom/ss/android/socialbase/downloader/downloader/u;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/k;->wv(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/u$1;->vv:Lcom/ss/android/socialbase/downloader/downloader/u;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/ss/android/socialbase/downloader/downloader/u;->vv(Lcom/ss/android/socialbase/downloader/downloader/u;ILcom/ss/android/socialbase/downloader/exception/BaseException;)V

    return-void
.end method
