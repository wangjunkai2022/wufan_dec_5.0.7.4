.class Lcom/ss/android/socialbase/appdownloader/i$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/socialbase/downloader/depend/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/appdownloader/i;->vv(Lcom/ss/android/socialbase/appdownloader/u;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic vv:Lcom/ss/android/socialbase/appdownloader/i;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/appdownloader/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/i$3;->vv:Lcom/ss/android/socialbase/appdownloader/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/exception/BaseException;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/i$3;->vv:Lcom/ss/android/socialbase/appdownloader/i;

    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/i;->m(Lcom/ss/android/socialbase/appdownloader/i;)Lcom/ss/android/socialbase/appdownloader/p/qv;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/i$3;->vv:Lcom/ss/android/socialbase/appdownloader/i;

    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/i;->m(Lcom/ss/android/socialbase/appdownloader/i;)Lcom/ss/android/socialbase/appdownloader/p/qv;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lcom/ss/android/socialbase/appdownloader/p/qv;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/downloader/exception/BaseException;I)V

    :cond_0
    return-void
.end method
