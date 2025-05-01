.class Lcom/ss/android/socialbase/appdownloader/i$4;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/socialbase/appdownloader/p/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/appdownloader/i;->vv(Lcom/ss/android/socialbase/appdownloader/u;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic i:Z

.field final synthetic m:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

.field final synthetic o:Lcom/ss/android/socialbase/appdownloader/i;

.field final synthetic p:I

.field final synthetic vv:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/appdownloader/i;Ljava/lang/String;Lcom/ss/android/socialbase/downloader/model/DownloadTask;IZ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/i$4;->o:Lcom/ss/android/socialbase/appdownloader/i;

    iput-object p2, p0, Lcom/ss/android/socialbase/appdownloader/i$4;->vv:Ljava/lang/String;

    iput-object p3, p0, Lcom/ss/android/socialbase/appdownloader/i$4;->m:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    iput p4, p0, Lcom/ss/android/socialbase/appdownloader/i$4;->p:I

    iput-boolean p5, p0, Lcom/ss/android/socialbase/appdownloader/i$4;->i:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public m()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/i;->g()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "notification permission denied, start download :"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/ss/android/socialbase/appdownloader/i$4;->vv:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/i$4;->o:Lcom/ss/android/socialbase/appdownloader/i;

    iget-object v1, p0, Lcom/ss/android/socialbase/appdownloader/i$4;->m:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    iget v2, p0, Lcom/ss/android/socialbase/appdownloader/i$4;->p:I

    iget-boolean v3, p0, Lcom/ss/android/socialbase/appdownloader/i$4;->i:Z

    invoke-static {v0, v1, v2, v3}, Lcom/ss/android/socialbase/appdownloader/i;->vv(Lcom/ss/android/socialbase/appdownloader/i;Lcom/ss/android/socialbase/downloader/model/DownloadTask;IZ)V

    return-void
.end method

.method public vv()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/i;->g()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "notification permission granted, start download :"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/ss/android/socialbase/appdownloader/i$4;->vv:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/i$4;->o:Lcom/ss/android/socialbase/appdownloader/i;

    iget-object v1, p0, Lcom/ss/android/socialbase/appdownloader/i$4;->m:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    iget v2, p0, Lcom/ss/android/socialbase/appdownloader/i$4;->p:I

    iget-boolean v3, p0, Lcom/ss/android/socialbase/appdownloader/i$4;->i:Z

    invoke-static {v0, v1, v2, v3}, Lcom/ss/android/socialbase/appdownloader/i;->vv(Lcom/ss/android/socialbase/appdownloader/i;Lcom/ss/android/socialbase/downloader/model/DownloadTask;IZ)V

    return-void
.end method
