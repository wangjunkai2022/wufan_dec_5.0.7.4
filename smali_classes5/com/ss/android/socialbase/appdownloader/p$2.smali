.class final Lcom/ss/android/socialbase/appdownloader/p$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/appdownloader/p;->m(Landroid/content/Context;IZ)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic i:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

.field final synthetic m:I

.field final synthetic o:Ljava/io/File;

.field final synthetic p:Z

.field final synthetic vv:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;IZLcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/io/File;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/p$2;->vv:Landroid/content/Context;

    iput p2, p0, Lcom/ss/android/socialbase/appdownloader/p$2;->m:I

    iput-boolean p3, p0, Lcom/ss/android/socialbase/appdownloader/p$2;->p:Z

    iput-object p4, p0, Lcom/ss/android/socialbase/appdownloader/p$2;->i:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    iput-object p5, p0, Lcom/ss/android/socialbase/appdownloader/p$2;->o:Ljava/io/File;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/i;->k()Lcom/ss/android/socialbase/appdownloader/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/socialbase/appdownloader/i;->b()V

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/p$2;->vv:Landroid/content/Context;

    iget v1, p0, Lcom/ss/android/socialbase/appdownloader/p$2;->m:I

    iget-boolean v2, p0, Lcom/ss/android/socialbase/appdownloader/p$2;->p:Z

    iget-object v3, p0, Lcom/ss/android/socialbase/appdownloader/p$2;->i:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    iget-object v4, p0, Lcom/ss/android/socialbase/appdownloader/p$2;->o:Ljava/io/File;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/ss/android/socialbase/appdownloader/p;->vv(Landroid/content/Context;IZLcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/io/File;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 3
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/i;->k()Lcom/ss/android/socialbase/appdownloader/i;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ss/android/socialbase/appdownloader/i;->d()Lcom/ss/android/socialbase/downloader/depend/c;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 4
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/i;->k()Lcom/ss/android/socialbase/appdownloader/i;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ss/android/socialbase/appdownloader/i;->d()Lcom/ss/android/socialbase/downloader/depend/c;

    move-result-object v1

    iget-object v2, p0, Lcom/ss/android/socialbase/appdownloader/p$2;->i:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Lcom/ss/android/socialbase/downloader/depend/c;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/lang/String;)V

    .line 5
    :cond_0
    iget-object v1, p0, Lcom/ss/android/socialbase/appdownloader/p$2;->i:Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    iget-boolean v2, p0, Lcom/ss/android/socialbase/appdownloader/p$2;->p:Z

    invoke-static {v1, v2, v0}, Lcom/ss/android/socialbase/appdownloader/p;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;ZI)V

    return-void
.end method
