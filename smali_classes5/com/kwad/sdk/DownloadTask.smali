.class public Lcom/kwad/sdk/DownloadTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/sdk/DownloadTask$DownloadRequest;
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x626e39a66abd7944L


# instance fields
.field public downloadEnablePause:Z

.field private mAllowedNetworkTypes:I

.field protected transient mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

.field private mDestinationDir:Ljava/lang/String;

.field private mDestinationFileName:Ljava/lang/String;

.field private transient mDownloadListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/sdk/a;",
            ">;"
        }
    .end annotation
.end field

.field private mIsCanceled:Z

.field private mNotificationVisibility:I

.field private mRequestHeaders:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mTag:Ljava/io/Serializable;

.field private mUrl:Ljava/lang/String;

.field private mUserPause:Z

.field private mWakeInstallApk:Z

.field private notificationRemoved:Z


# direct methods
.method public constructor <init>(Lcom/kwad/sdk/DownloadTask$DownloadRequest;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mDownloadListeners:Ljava/util/List;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/kwad/sdk/DownloadTask;->mIsCanceled:Z

    .line 4
    iput-boolean v0, p0, Lcom/kwad/sdk/DownloadTask;->downloadEnablePause:Z

    .line 5
    iput-boolean v0, p0, Lcom/kwad/sdk/DownloadTask;->notificationRemoved:Z

    .line 6
    invoke-direct {p0, p1}, Lcom/kwad/sdk/DownloadTask;->initDownloadRequestParams(Lcom/kwad/sdk/DownloadTask$DownloadRequest;)V

    .line 7
    invoke-virtual {p0}, Lcom/kwad/sdk/DownloadTask;->instantiateDownloadTask()V

    .line 8
    invoke-direct {p0}, Lcom/kwad/sdk/DownloadTask;->initDownloadTaskParams()V

    return-void
.end method

.method static synthetic access$1000(Lcom/kwad/sdk/DownloadTask;Lcom/kwad/framework/filedownloader/a;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/kwad/sdk/DownloadTask;->onPending(Lcom/kwad/framework/filedownloader/a;II)V

    return-void
.end method

.method static synthetic access$1100(Lcom/kwad/sdk/DownloadTask;Lcom/kwad/framework/filedownloader/a;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/kwad/sdk/DownloadTask;->onDownloading(Lcom/kwad/framework/filedownloader/a;II)V

    return-void
.end method

.method static synthetic access$1200(Lcom/kwad/sdk/DownloadTask;Lcom/kwad/framework/filedownloader/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/sdk/DownloadTask;->onBlockCompleted(Lcom/kwad/framework/filedownloader/a;)V

    return-void
.end method

.method static synthetic access$1300(Lcom/kwad/sdk/DownloadTask;Lcom/kwad/framework/filedownloader/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/sdk/DownloadTask;->onCompleted(Lcom/kwad/framework/filedownloader/a;)V

    return-void
.end method

.method static synthetic access$1400(Lcom/kwad/sdk/DownloadTask;Lcom/kwad/framework/filedownloader/a;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/kwad/sdk/DownloadTask;->onPause(Lcom/kwad/framework/filedownloader/a;II)V

    return-void
.end method

.method static synthetic access$1500(Lcom/kwad/sdk/DownloadTask;Lcom/kwad/framework/filedownloader/a;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/kwad/sdk/DownloadTask;->onError(Lcom/kwad/framework/filedownloader/a;Ljava/lang/Throwable;)V

    return-void
.end method

.method static synthetic access$1600(Lcom/kwad/sdk/DownloadTask;Lcom/kwad/framework/filedownloader/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/sdk/DownloadTask;->onWarn(Lcom/kwad/framework/filedownloader/a;)V

    return-void
.end method

.method static synthetic access$800(Lcom/kwad/sdk/DownloadTask;Lcom/kwad/framework/filedownloader/a;Ljava/lang/String;ZII)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/kwad/sdk/DownloadTask;->onConnected(Lcom/kwad/framework/filedownloader/a;Ljava/lang/String;ZII)V

    return-void
.end method

.method static synthetic access$900(Lcom/kwad/sdk/DownloadTask;Lcom/kwad/framework/filedownloader/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/sdk/DownloadTask;->onStarted(Lcom/kwad/framework/filedownloader/a;)V

    return-void
.end method

.method private initDownloadRequestParams(Lcom/kwad/sdk/DownloadTask$DownloadRequest;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/kwad/sdk/DownloadTask$DownloadRequest;->access$000(Lcom/kwad/sdk/DownloadTask$DownloadRequest;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/kwad/sdk/DownloadTask;->mWakeInstallApk:Z

    .line 2
    invoke-static {p1}, Lcom/kwad/sdk/DownloadTask$DownloadRequest;->access$100(Lcom/kwad/sdk/DownloadTask$DownloadRequest;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mUrl:Ljava/lang/String;

    .line 3
    invoke-static {p1}, Lcom/kwad/sdk/DownloadTask$DownloadRequest;->access$200(Lcom/kwad/sdk/DownloadTask$DownloadRequest;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/DownloadTask;->mAllowedNetworkTypes:I

    .line 4
    invoke-static {p1}, Lcom/kwad/sdk/DownloadTask$DownloadRequest;->access$300(Lcom/kwad/sdk/DownloadTask$DownloadRequest;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/DownloadTask;->mNotificationVisibility:I

    .line 5
    invoke-static {p1}, Lcom/kwad/sdk/DownloadTask$DownloadRequest;->access$400(Lcom/kwad/sdk/DownloadTask$DownloadRequest;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mDestinationDir:Ljava/lang/String;

    .line 6
    invoke-static {p1}, Lcom/kwad/sdk/DownloadTask$DownloadRequest;->access$500(Lcom/kwad/sdk/DownloadTask$DownloadRequest;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mDestinationFileName:Ljava/lang/String;

    .line 7
    invoke-static {p1}, Lcom/kwad/sdk/DownloadTask$DownloadRequest;->access$600(Lcom/kwad/sdk/DownloadTask$DownloadRequest;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mRequestHeaders:Ljava/util/Map;

    .line 8
    invoke-static {p1}, Lcom/kwad/sdk/DownloadTask$DownloadRequest;->access$700(Lcom/kwad/sdk/DownloadTask$DownloadRequest;)Ljava/io/Serializable;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mTag:Ljava/io/Serializable;

    .line 9
    invoke-virtual {p1}, Lcom/kwad/sdk/DownloadTask$DownloadRequest;->isDownloadEnablePause()Z

    move-result p1

    iput-boolean p1, p0, Lcom/kwad/sdk/DownloadTask;->downloadEnablePause:Z

    return-void
.end method

.method private initDownloadTaskParams()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    iget-object v1, p0, Lcom/kwad/sdk/DownloadTask;->mTag:Ljava/io/Serializable;

    invoke-interface {v0, v1}, Lcom/kwad/framework/filedownloader/a;->e(Ljava/lang/Object;)Lcom/kwad/framework/filedownloader/a;

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    iget v1, p0, Lcom/kwad/sdk/DownloadTask;->mAllowedNetworkTypes:I

    xor-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0, v1}, Lcom/kwad/framework/filedownloader/a;->bc(Z)Lcom/kwad/framework/filedownloader/a;

    .line 3
    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mRequestHeaders:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 4
    iget-object v2, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2, v3}, Lcom/kwad/framework/filedownloader/a;->bd(Ljava/lang/String;)Lcom/kwad/framework/filedownloader/a;

    .line 5
    iget-object v2, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v2, v3, v1}, Lcom/kwad/framework/filedownloader/a;->t(Ljava/lang/String;Ljava/lang/String;)Lcom/kwad/framework/filedownloader/a;

    goto :goto_1

    :cond_1
    return-void
.end method

.method private notify(Lcom/kwad/sdk/DownloadTask;Lcom/kwad/sdk/f/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kwad/sdk/DownloadTask;",
            "Lcom/kwad/sdk/f/a<",
            "Lcom/kwad/sdk/d;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/kwad/sdk/c;->yq()Lcom/kwad/sdk/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/sdk/c;->ys()Lcom/kwad/sdk/d;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p1}, Lcom/kwad/sdk/DownloadTask;->isCanceled()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 3
    invoke-virtual {p1}, Lcom/kwad/sdk/DownloadTask;->getId()I

    move-result p1

    invoke-interface {v0, p1}, Lcom/kwad/sdk/d;->bV(I)V

    return-void

    .line 4
    :cond_1
    invoke-interface {p2, v0}, Lcom/kwad/sdk/f/a;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method private notifyDownloadCanceled()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/kwad/sdk/c;->yq()Lcom/kwad/sdk/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/sdk/c;->ys()Lcom/kwad/sdk/d;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p0}, Lcom/kwad/sdk/DownloadTask;->getId()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/kwad/sdk/d;->bV(I)V

    return-void
.end method

.method private notifyDownloadCompleted(Lcom/kwad/framework/filedownloader/a;)V
    .locals 0

    .line 1
    iget p1, p0, Lcom/kwad/sdk/DownloadTask;->mNotificationVisibility:I

    and-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_0

    .line 2
    new-instance p1, Lcom/kwad/sdk/DownloadTask$3;

    invoke-direct {p1, p0}, Lcom/kwad/sdk/DownloadTask$3;-><init>(Lcom/kwad/sdk/DownloadTask;)V

    invoke-direct {p0, p0, p1}, Lcom/kwad/sdk/DownloadTask;->notify(Lcom/kwad/sdk/DownloadTask;Lcom/kwad/sdk/f/a;)V

    :cond_0
    return-void
.end method

.method private notifyDownloadError(Lcom/kwad/framework/filedownloader/a;)V
    .locals 0

    .line 1
    iget p1, p0, Lcom/kwad/sdk/DownloadTask;->mNotificationVisibility:I

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    .line 2
    new-instance p1, Lcom/kwad/sdk/DownloadTask$5;

    invoke-direct {p1, p0}, Lcom/kwad/sdk/DownloadTask$5;-><init>(Lcom/kwad/sdk/DownloadTask;)V

    invoke-direct {p0, p0, p1}, Lcom/kwad/sdk/DownloadTask;->notify(Lcom/kwad/sdk/DownloadTask;Lcom/kwad/sdk/f/a;)V

    :cond_0
    return-void
.end method

.method private notifyDownloadPending()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/sdk/DownloadTask;->mNotificationVisibility:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/sdk/DownloadTask$2;

    invoke-direct {v0, p0}, Lcom/kwad/sdk/DownloadTask$2;-><init>(Lcom/kwad/sdk/DownloadTask;)V

    invoke-direct {p0, p0, v0}, Lcom/kwad/sdk/DownloadTask;->notify(Lcom/kwad/sdk/DownloadTask;Lcom/kwad/sdk/f/a;)V

    :cond_0
    return-void
.end method

.method private notifyDownloadProgress(Lcom/kwad/framework/filedownloader/a;Z)V
    .locals 1

    .line 1
    invoke-interface {p1}, Lcom/kwad/framework/filedownloader/a;->getSmallFileTotalBytes()I

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Lcom/kwad/framework/filedownloader/a;->getSmallFileSoFarBytes()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-interface {p1}, Lcom/kwad/framework/filedownloader/a;->getFilename()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    .line 3
    :cond_1
    iget p1, p0, Lcom/kwad/sdk/DownloadTask;->mNotificationVisibility:I

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_2

    .line 4
    new-instance p1, Lcom/kwad/sdk/DownloadTask$4;

    invoke-direct {p1, p0, p2}, Lcom/kwad/sdk/DownloadTask$4;-><init>(Lcom/kwad/sdk/DownloadTask;Z)V

    invoke-direct {p0, p0, p1}, Lcom/kwad/sdk/DownloadTask;->notify(Lcom/kwad/sdk/DownloadTask;Lcom/kwad/sdk/f/a;)V

    :cond_2
    return-void
.end method

.method private onBlockCompleted(Lcom/kwad/framework/filedownloader/a;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object p1, p0, Lcom/kwad/sdk/DownloadTask;->mDownloadListeners:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    .line 2
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    return-void
.end method

.method private onCanceled(Lcom/kwad/framework/filedownloader/a;)V
    .locals 2

    const/4 v0, 0x1

    .line 1
    :try_start_0
    iput-boolean v0, p0, Lcom/kwad/sdk/DownloadTask;->mIsCanceled:Z

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mDownloadListeners:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/sdk/a;

    .line 3
    invoke-virtual {v1, p0}, Lcom/kwad/sdk/a;->d(Lcom/kwad/sdk/DownloadTask;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-interface {p1}, Lcom/kwad/framework/filedownloader/a;->cancel()Z

    .line 5
    invoke-direct {p0}, Lcom/kwad/sdk/DownloadTask;->notifyDownloadCanceled()V

    .line 6
    invoke-static {}, Lcom/kwad/framework/filedownloader/r;->vy()Lcom/kwad/framework/filedownloader/r;

    move-result-object p1

    invoke-virtual {p0}, Lcom/kwad/sdk/DownloadTask;->getId()I

    move-result v0

    iget-object v1, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    invoke-interface {v1}, Lcom/kwad/framework/filedownloader/a;->getTargetFilePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/kwad/framework/filedownloader/r;->p(ILjava/lang/String;)Z

    .line 7
    invoke-direct {p0}, Lcom/kwad/sdk/DownloadTask;->releaseDownloadTask()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    return-void
.end method

.method private onCompleted(Lcom/kwad/framework/filedownloader/a;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mDownloadListeners:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/sdk/a;

    .line 2
    invoke-virtual {v1, p0}, Lcom/kwad/sdk/a;->a(Lcom/kwad/sdk/DownloadTask;)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-direct {p0, p1}, Lcom/kwad/sdk/DownloadTask;->notifyDownloadCompleted(Lcom/kwad/framework/filedownloader/a;)V

    .line 4
    iget-boolean p1, p0, Lcom/kwad/sdk/DownloadTask;->mWakeInstallApk:Z

    if-eqz p1, :cond_1

    .line 5
    invoke-virtual {p0}, Lcom/kwad/sdk/DownloadTask;->installApk()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-void

    :catch_0
    move-exception p1

    .line 6
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    return-void
.end method

.method private onConnected(Lcom/kwad/framework/filedownloader/a;Ljava/lang/String;ZII)V
    .locals 1

    int-to-long p2, p5

    .line 1
    :try_start_0
    new-instance p4, Ljava/io/File;

    iget-object p5, p0, Lcom/kwad/sdk/DownloadTask;->mDestinationDir:Ljava/lang/String;

    invoke-direct {p4, p5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4}, Ljava/io/File;->exists()Z

    move-result p4

    if-eqz p4, :cond_0

    .line 2
    iget-object p4, p0, Lcom/kwad/sdk/DownloadTask;->mDestinationDir:Ljava/lang/String;

    invoke-static {p4}, Lcom/kwad/sdk/crash/utils/h;->getAvailableBytes(Ljava/lang/String;)J

    move-result-wide p4

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object p4

    invoke-virtual {p4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Lcom/kwad/sdk/crash/utils/h;->getAvailableBytes(Ljava/lang/String;)J

    move-result-wide p4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p4

    .line 4
    invoke-virtual {p4}, Ljava/lang/Exception;->printStackTrace()V

    move-wide p4, p2

    :goto_0
    cmp-long v0, p4, p2

    if-gez v0, :cond_1

    .line 5
    invoke-static {}, Lcom/kwad/sdk/c;->yq()Lcom/kwad/sdk/c;

    move-result-object p2

    invoke-interface {p1}, Lcom/kwad/framework/filedownloader/a;->getId()I

    move-result p3

    invoke-virtual {p2, p3}, Lcom/kwad/sdk/c;->cancel(I)V

    .line 6
    invoke-direct {p0}, Lcom/kwad/sdk/DownloadTask;->notifyDownloadCanceled()V

    .line 7
    invoke-direct {p0, p1}, Lcom/kwad/sdk/DownloadTask;->onLowStorage(Lcom/kwad/framework/filedownloader/a;)V

    return-void

    .line 8
    :cond_1
    :try_start_1
    iget-object p2, p0, Lcom/kwad/sdk/DownloadTask;->mDownloadListeners:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_1

    :cond_2
    const/4 p2, 0x0

    .line 9
    invoke-direct {p0, p1, p2}, Lcom/kwad/sdk/DownloadTask;->notifyDownloadProgress(Lcom/kwad/framework/filedownloader/a;Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    move-exception p1

    .line 10
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    return-void
.end method

.method private onDownloading(Lcom/kwad/framework/filedownloader/a;II)V
    .locals 1

    .line 1
    :try_start_0
    iget-object p1, p0, Lcom/kwad/sdk/DownloadTask;->mDownloadListeners:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/a;

    .line 2
    invoke-virtual {v0, p0, p2, p3}, Lcom/kwad/sdk/a;->a(Lcom/kwad/sdk/DownloadTask;II)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lcom/kwad/sdk/DownloadTask;->notifyDownloadProgress(Lcom/kwad/framework/filedownloader/a;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    return-void
.end method

.method private onError(Lcom/kwad/framework/filedownloader/a;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mDownloadListeners:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/sdk/a;

    .line 2
    invoke-virtual {v1, p0, p2}, Lcom/kwad/sdk/a;->a(Lcom/kwad/sdk/DownloadTask;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-direct {p0, p1}, Lcom/kwad/sdk/DownloadTask;->notifyDownloadError(Lcom/kwad/framework/filedownloader/a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    return-void
.end method

.method private onLowStorage(Lcom/kwad/framework/filedownloader/a;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object p1, p0, Lcom/kwad/sdk/DownloadTask;->mDownloadListeners:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/a;

    .line 2
    invoke-virtual {v0, p0}, Lcom/kwad/sdk/a;->f(Lcom/kwad/sdk/DownloadTask;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    .line 3
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    return-void
.end method

.method private onPause(Lcom/kwad/framework/filedownloader/a;II)V
    .locals 0

    .line 1
    :try_start_0
    iget-object p2, p0, Lcom/kwad/sdk/DownloadTask;->mDownloadListeners:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/kwad/sdk/a;

    .line 2
    invoke-virtual {p3, p0}, Lcom/kwad/sdk/a;->c(Lcom/kwad/sdk/DownloadTask;)V

    goto :goto_0

    :cond_0
    const/4 p2, 0x1

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/kwad/sdk/DownloadTask;->notifyDownloadProgress(Lcom/kwad/framework/filedownloader/a;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    return-void
.end method

.method private onPending(Lcom/kwad/framework/filedownloader/a;II)V
    .locals 0

    .line 1
    :try_start_0
    iget-object p1, p0, Lcom/kwad/sdk/DownloadTask;->mDownloadListeners:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_0

    .line 2
    :cond_0
    invoke-direct {p0}, Lcom/kwad/sdk/DownloadTask;->notifyDownloadPending()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 3
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    return-void
.end method

.method private onResume(Lcom/kwad/framework/filedownloader/a;II)V
    .locals 0

    .line 1
    :try_start_0
    iget-object p2, p0, Lcom/kwad/sdk/DownloadTask;->mDownloadListeners:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/kwad/sdk/a;

    .line 2
    invoke-virtual {p3, p0}, Lcom/kwad/sdk/a;->e(Lcom/kwad/sdk/DownloadTask;)V

    goto :goto_0

    :cond_0
    const/4 p2, 0x1

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/kwad/sdk/DownloadTask;->notifyDownloadProgress(Lcom/kwad/framework/filedownloader/a;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    return-void
.end method

.method private onStarted(Lcom/kwad/framework/filedownloader/a;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object p1, p0, Lcom/kwad/sdk/DownloadTask;->mDownloadListeners:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/a;

    .line 2
    invoke-virtual {v0, p0}, Lcom/kwad/sdk/a;->b(Lcom/kwad/sdk/DownloadTask;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    .line 3
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    return-void
.end method

.method private onWarn(Lcom/kwad/framework/filedownloader/a;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object p1, p0, Lcom/kwad/sdk/DownloadTask;->mDownloadListeners:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    .line 2
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/kwad/sdk/DownloadTask;->mDownloadListeners:Ljava/util/List;

    return-void
.end method

.method private releaseDownloadTask()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/kwad/framework/filedownloader/a;->a(Lcom/kwad/framework/filedownloader/i;)Lcom/kwad/framework/filedownloader/a;

    .line 2
    invoke-virtual {p0}, Lcom/kwad/sdk/DownloadTask;->clearListener()V

    return-void
.end method


# virtual methods
.method public addListener(Lcom/kwad/sdk/a;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mDownloadListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mDownloadListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method cancel()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    invoke-direct {p0, v0}, Lcom/kwad/sdk/DownloadTask;->onCanceled(Lcom/kwad/framework/filedownloader/a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    return-void
.end method

.method public clearListener()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mDownloadListeners:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method downLoadProgress()I
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->getSmallFileTotalBytes()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    cmp-long v5, v0, v3

    if-eqz v5, :cond_0

    const/high16 v3, 0x42c80000    # 100.0f

    .line 2
    iget-object v4, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    invoke-interface {v4}, Lcom/kwad/framework/filedownloader/a;->getSmallFileSoFarBytes()I

    move-result v4

    int-to-float v4, v4

    mul-float v4, v4, v3

    long-to-float v0, v0

    div-float/2addr v4, v0

    float-to-int v0, v4

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x64

    if-ne v0, v1, :cond_1

    .line 3
    new-instance v1, Ljava/io/File;

    iget-object v3, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    .line 4
    invoke-interface {v3}, Lcom/kwad/framework/filedownloader/a;->getTargetFilePath()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lcom/kwad/sdk/utils/q;->M(Ljava/io/File;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    move v2, v0

    :goto_1
    return v2
.end method

.method public getAllowedNetworkTypes()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/sdk/DownloadTask;->mAllowedNetworkTypes:I

    return v0
.end method

.method public getDestinationDir()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mDestinationDir:Ljava/lang/String;

    return-object v0
.end method

.method public getFilename()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->getFilename()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->getId()I

    move-result v0

    return v0
.end method

.method public getNotificationVisibility()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/sdk/DownloadTask;->mNotificationVisibility:I

    return v0
.end method

.method public getPath()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->getPath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSmallFileSoFarBytes()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->getSmallFileSoFarBytes()I

    move-result v0

    return v0
.end method

.method public getSmallFileTotalBytes()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->getSmallFileTotalBytes()I

    move-result v0

    return v0
.end method

.method public getSpeed()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->getSpeed()I

    move-result v0

    return v0
.end method

.method public getStatus()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->uz()B

    move-result v0

    return v0
.end method

.method public getStatusUpdateTime()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->getStatusUpdateTime()J

    move-result-wide v0

    return-wide v0
.end method

.method public getTag()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->getTag()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getTargetFilePath()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->getTargetFilePath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mUrl:Ljava/lang/String;

    return-object v0
.end method

.method installApk()V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/c;->yq()Lcom/kwad/sdk/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/kwad/sdk/c;->g(Lcom/kwad/sdk/DownloadTask;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    return-void
.end method

.method instantiateDownloadTask()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/kwad/framework/filedownloader/r;->vy()Lcom/kwad/framework/filedownloader/r;

    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mUrl:Ljava/lang/String;

    .line 2
    invoke-static {v0}, Lcom/kwad/framework/filedownloader/r;->bf(Ljava/lang/String;)Lcom/kwad/framework/filedownloader/a;

    move-result-object v0

    const/4 v1, 0x1

    .line 3
    invoke-interface {v0, v1}, Lcom/kwad/framework/filedownloader/a;->ba(Z)Lcom/kwad/framework/filedownloader/a;

    move-result-object v0

    const/4 v1, 0x3

    .line 4
    invoke-interface {v0, v1}, Lcom/kwad/framework/filedownloader/a;->aX(I)Lcom/kwad/framework/filedownloader/a;

    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/kwad/sdk/DownloadTask;->mDestinationFileName:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 6
    iget-object v1, p0, Lcom/kwad/sdk/DownloadTask;->mDestinationDir:Ljava/lang/String;

    goto :goto_0

    .line 7
    :cond_0
    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/kwad/sdk/DownloadTask;->mDestinationDir:Ljava/lang/String;

    iget-object v3, p0, Lcom/kwad/sdk/DownloadTask;->mDestinationFileName:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    :goto_0
    iget-object v2, p0, Lcom/kwad/sdk/DownloadTask;->mDestinationFileName:Ljava/lang/String;

    .line 8
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    .line 9
    invoke-interface {v0, v1, v2}, Lcom/kwad/framework/filedownloader/a;->c(Ljava/lang/String;Z)Lcom/kwad/framework/filedownloader/a;

    move-result-object v0

    new-instance v1, Lcom/kwad/sdk/DownloadTask$1;

    invoke-direct {v1, p0}, Lcom/kwad/sdk/DownloadTask$1;-><init>(Lcom/kwad/sdk/DownloadTask;)V

    .line 10
    invoke-interface {v0, v1}, Lcom/kwad/framework/filedownloader/a;->a(Lcom/kwad/framework/filedownloader/i;)Lcom/kwad/framework/filedownloader/a;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    return-void
.end method

.method public isCanceled()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/sdk/DownloadTask;->mIsCanceled:Z

    return v0
.end method

.method public isCompleted()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->uz()B

    move-result v0

    const/4 v1, -0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isError()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->uz()B

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isErrorBecauseWifiRequired()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->uG()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/kwad/sdk/DownloadTask;->isError()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    .line 2
    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->uB()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Lcom/kwad/framework/filedownloader/exception/FileDownloadNetworkPolicyException;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isInvalid()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->uz()B

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isNotificationRemoved()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/sdk/DownloadTask;->notificationRemoved:Z

    return v0
.end method

.method public isPaused()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->uz()B

    move-result v0

    const/4 v1, -0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isRunning()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->isRunning()Z

    move-result v0

    return v0
.end method

.method isUserPause()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/sdk/DownloadTask;->mUserPause:Z

    return v0
.end method

.method pause()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->pause()Z

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/kwad/sdk/DownloadTask;->notifyDownloadProgress(Lcom/kwad/framework/filedownloader/a;Z)V

    return-void
.end method

.method public removeListener(Lcom/kwad/sdk/a;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mDownloadListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method resume(Lcom/kwad/sdk/DownloadTask$DownloadRequest;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/kwad/sdk/c;->yq()Lcom/kwad/sdk/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/sdk/c;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/utils/ah;->isNetworkConnected(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    .line 2
    invoke-direct {p0, p1}, Lcom/kwad/sdk/DownloadTask;->initDownloadRequestParams(Lcom/kwad/sdk/DownloadTask$DownloadRequest;)V

    .line 3
    invoke-direct {p0}, Lcom/kwad/sdk/DownloadTask;->initDownloadTaskParams()V

    :cond_1
    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lcom/kwad/sdk/DownloadTask;->mUserPause:Z

    .line 5
    iget-object p1, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    invoke-interface {p1}, Lcom/kwad/framework/filedownloader/a;->isRunning()Z

    move-result p1

    if-nez p1, :cond_3

    .line 6
    :try_start_0
    iget-object p1, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    invoke-interface {p1}, Lcom/kwad/framework/filedownloader/a;->uz()B

    move-result p1

    invoke-static {p1}, Lcom/kwad/framework/filedownloader/d/d;->bF(I)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 7
    iget-object p1, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    invoke-interface {p1}, Lcom/kwad/framework/filedownloader/a;->ur()Z

    .line 8
    :cond_2
    invoke-virtual {p0}, Lcom/kwad/sdk/DownloadTask;->submit()V

    .line 9
    iget-object p1, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    invoke-interface {p1}, Lcom/kwad/framework/filedownloader/a;->getSmallFileSoFarBytes()I

    move-result v0

    iget-object v1, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    .line 10
    invoke-interface {v1}, Lcom/kwad/framework/filedownloader/a;->getSmallFileTotalBytes()I

    move-result v1

    .line 11
    invoke-direct {p0, p1, v0, v1}, Lcom/kwad/sdk/DownloadTask;->onResume(Lcom/kwad/framework/filedownloader/a;II)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    return-void

    .line 13
    :cond_3
    iget-object p1, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    invoke-interface {p1}, Lcom/kwad/framework/filedownloader/a;->getSmallFileSoFarBytes()I

    move-result v0

    iget-object v1, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    .line 14
    invoke-interface {v1}, Lcom/kwad/framework/filedownloader/a;->getSmallFileTotalBytes()I

    move-result v1

    .line 15
    invoke-direct {p0, p1, v0, v1}, Lcom/kwad/sdk/DownloadTask;->onResume(Lcom/kwad/framework/filedownloader/a;II)V

    return-void
.end method

.method public setAllowedNetworkTypes(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/kwad/sdk/DownloadTask;->mAllowedNetworkTypes:I

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    xor-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-interface {v0, p1}, Lcom/kwad/framework/filedownloader/a;->bc(Z)Lcom/kwad/framework/filedownloader/a;

    return-void
.end method

.method public setNotificationRemoved(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/sdk/DownloadTask;->notificationRemoved:Z

    return-void
.end method

.method public submit()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->isRunning()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/a;->start()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    return-void

    :catchall_0
    move-exception v0

    .line 3
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method unwrap()Lcom/kwad/framework/filedownloader/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/DownloadTask;->mBaseDownloadTask:Lcom/kwad/framework/filedownloader/a;

    return-object v0
.end method

.method userPause()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/kwad/sdk/DownloadTask;->mUserPause:Z

    .line 2
    invoke-virtual {p0}, Lcom/kwad/sdk/DownloadTask;->pause()V

    return-void
.end method
