.class Lcom/ss/android/downloadlib/addownload/qv$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/downloadlib/addownload/qv$m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/addownload/qv;->vv()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic vv:Lcom/ss/android/downloadlib/addownload/qv;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/addownload/qv;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/qv$3;->vv:Lcom/ss/android/downloadlib/addownload/qv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 4

    .line 1
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object v0

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/qv$3;->vv:Lcom/ss/android/downloadlib/addownload/qv;

    invoke-static {v1}, Lcom/ss/android/downloadlib/addownload/qv;->vv(Lcom/ss/android/downloadlib/addownload/qv;)J

    move-result-wide v1

    const/4 v3, 0x2

    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/ss/android/downloadlib/i/vv;->vv(JILcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    return-void
.end method
