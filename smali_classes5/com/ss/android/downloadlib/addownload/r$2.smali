.class final Lcom/ss/android/downloadlib/addownload/r$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/downloadlib/addownload/vv/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/addownload/r;->vv(Lcom/ss/android/downloadad/api/vv/m;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;ILcom/ss/android/downloadlib/addownload/i/qv;ZLcom/ss/android/downloadlib/addownload/vv/p;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/ss/android/downloadlib/addownload/vv/p;

.field final synthetic vv:Lcom/ss/android/downloadad/api/vv/m;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadad/api/vv/m;Lcom/ss/android/downloadlib/addownload/vv/p;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/r$2;->vv:Lcom/ss/android/downloadad/api/vv/m;

    iput-object p2, p0, Lcom/ss/android/downloadlib/addownload/r$2;->m:Lcom/ss/android/downloadlib/addownload/vv/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public delete()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object v0

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/r$2;->vv:Lcom/ss/android/downloadad/api/vv/m;

    const-string v2, "cancel_pause_reserve_wifi_delete"

    invoke-virtual {v0, v2, v1}, Lcom/ss/android/downloadlib/i/vv;->vv(Ljava/lang/String;Lcom/ss/android/downloadad/api/vv/vv;)V

    .line 2
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/r$2;->m:Lcom/ss/android/downloadlib/addownload/vv/p;

    invoke-interface {v0}, Lcom/ss/android/downloadlib/addownload/vv/p;->delete()V

    return-void
.end method
