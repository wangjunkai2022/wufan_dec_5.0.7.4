.class Lcom/ss/android/downloadlib/p$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/socialbase/downloader/vv/vv$vv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/p;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/downloadad/api/vv/m;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic i:D

.field final synthetic m:J

.field final synthetic o:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

.field final synthetic p:J

.field final synthetic u:Lcom/ss/android/downloadlib/p;

.field final synthetic vv:Lcom/ss/android/downloadad/api/vv/m;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/p;Lcom/ss/android/downloadad/api/vv/m;JJDLcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/p$3;->u:Lcom/ss/android/downloadlib/p;

    iput-object p2, p0, Lcom/ss/android/downloadlib/p$3;->vv:Lcom/ss/android/downloadad/api/vv/m;

    iput-wide p3, p0, Lcom/ss/android/downloadlib/p$3;->m:J

    iput-wide p5, p0, Lcom/ss/android/downloadlib/p$3;->p:J

    iput-wide p7, p0, Lcom/ss/android/downloadlib/p$3;->i:D

    iput-object p9, p0, Lcom/ss/android/downloadlib/p$3;->o:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public m()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/p$3;->vv:Lcom/ss/android/downloadad/api/vv/m;

    invoke-static {v0}, Lcom/ss/android/downloadlib/n/jh;->m(Lcom/ss/android/downloadad/api/vv/m;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    iget-wide v0, p0, Lcom/ss/android/downloadlib/p$3;->m:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-lez v4, :cond_2

    iget-wide v4, p0, Lcom/ss/android/downloadlib/p$3;->p:J

    cmp-long v6, v4, v2

    if-lez v6, :cond_2

    long-to-double v0, v0

    iget-wide v2, p0, Lcom/ss/android/downloadlib/p$3;->i:D

    cmpg-double v4, v0, v2

    if-gez v4, :cond_2

    .line 3
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object v0

    const-string v1, "install_no_enough_space"

    invoke-static {v1}, Lcom/ss/android/downloadlib/addownload/i;->vv(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    iget-object v2, p0, Lcom/ss/android/downloadlib/p$3;->vv:Lcom/ss/android/downloadad/api/vv/m;

    const-string v3, "clean_space_install"

    invoke-virtual {v0, v3, v1, v2}, Lcom/ss/android/downloadlib/i/vv;->vv(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V

    .line 4
    iget-object v0, p0, Lcom/ss/android/downloadlib/p$3;->o:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    iget-wide v1, p0, Lcom/ss/android/downloadlib/p$3;->i:D

    double-to-long v1, v1

    iget-wide v3, p0, Lcom/ss/android/downloadlib/p$3;->m:J

    sub-long/2addr v1, v3

    invoke-static {v0, v1, v2}, Lcom/ss/android/downloadlib/addownload/i;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;J)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    invoke-static {}, Lcom/ss/android/socialbase/downloader/vv/vv;->vv()Lcom/ss/android/socialbase/downloader/vv/vv;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/ss/android/socialbase/downloader/vv/vv;->m(Lcom/ss/android/socialbase/downloader/vv/vv$vv;)V

    .line 6
    iget-object v0, p0, Lcom/ss/android/downloadlib/p$3;->vv:Lcom/ss/android/downloadad/api/vv/m;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/vv/m;->n(Z)V

    :cond_0
    return-void

    .line 7
    :cond_1
    invoke-static {}, Lcom/ss/android/socialbase/downloader/vv/vv;->vv()Lcom/ss/android/socialbase/downloader/vv/vv;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/ss/android/socialbase/downloader/vv/vv;->m(Lcom/ss/android/socialbase/downloader/vv/vv$vv;)V

    :cond_2
    return-void
.end method

.method public p()V
    .locals 0

    return-void
.end method
