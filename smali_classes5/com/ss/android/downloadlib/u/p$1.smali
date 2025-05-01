.class Lcom/ss/android/downloadlib/u/p$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/socialbase/appdownloader/p/wv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/u/p;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;ILcom/ss/android/socialbase/appdownloader/p/wv;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic i:Lcom/ss/android/downloadlib/u/p;

.field final synthetic m:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

.field final synthetic p:Lcom/ss/android/socialbase/appdownloader/p/wv;

.field final synthetic vv:I


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/u/p;ILcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/appdownloader/p/wv;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/u/p$1;->i:Lcom/ss/android/downloadlib/u/p;

    iput p2, p0, Lcom/ss/android/downloadlib/u/p$1;->vv:I

    iput-object p3, p0, Lcom/ss/android/downloadlib/u/p$1;->m:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    iput-object p4, p0, Lcom/ss/android/downloadlib/u/p$1;->p:Lcom/ss/android/socialbase/appdownloader/p/wv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public vv()V
    .locals 4

    .line 1
    iget v0, p0, Lcom/ss/android/downloadlib/u/p$1;->vv:I

    add-int/lit8 v0, v0, 0x1

    .line 2
    iget-object v1, p0, Lcom/ss/android/downloadlib/u/p$1;->i:Lcom/ss/android/downloadlib/u/p;

    iget-object v2, p0, Lcom/ss/android/downloadlib/u/p$1;->m:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    iget-object v3, p0, Lcom/ss/android/downloadlib/u/p$1;->p:Lcom/ss/android/socialbase/appdownloader/p/wv;

    invoke-static {v1, v2, v0, v3}, Lcom/ss/android/downloadlib/u/p;->vv(Lcom/ss/android/downloadlib/u/p;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;ILcom/ss/android/socialbase/appdownloader/p/wv;)V

    return-void
.end method
