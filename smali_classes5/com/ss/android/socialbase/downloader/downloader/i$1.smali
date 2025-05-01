.class Lcom/ss/android/socialbase/downloader/downloader/i$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/downloader/i;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadTask;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

.field final synthetic p:Lcom/ss/android/socialbase/downloader/downloader/i;

.field final synthetic vv:Lcom/ss/android/socialbase/downloader/downloader/r;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/downloader/i;Lcom/ss/android/socialbase/downloader/downloader/r;Lcom/ss/android/socialbase/downloader/model/DownloadTask;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/downloader/i$1;->p:Lcom/ss/android/socialbase/downloader/downloader/i;

    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/downloader/i$1;->vv:Lcom/ss/android/socialbase/downloader/downloader/r;

    iput-object p3, p0, Lcom/ss/android/socialbase/downloader/downloader/i$1;->m:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/downloader/i$1;->vv:Lcom/ss/android/socialbase/downloader/downloader/r;

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/downloader/i$1;->m:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/downloader/r;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadTask;)V

    return-void
.end method
