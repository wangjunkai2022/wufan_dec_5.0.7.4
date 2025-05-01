.class public Lcom/beizi/ad/internal/utilities/ImageService;
.super Ljava/lang/Object;
.source "ImageService.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/ad/internal/utilities/ImageService$ImageServiceListener;,
        Lcom/beizi/ad/internal/utilities/ImageService$ImageReceiver;,
        Lcom/beizi/ad/internal/utilities/ImageService$ImageDownloader;
    }
.end annotation


# static fields
.field static final TIMEOUT:I = 0x2710


# instance fields
.field imageServiceListener:Lcom/beizi/ad/internal/utilities/ImageService$ImageServiceListener;

.field imageUrls:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/beizi/ad/internal/utilities/ImageService$ImageReceiver;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/beizi/ad/internal/utilities/ImageService;->imageUrls:Ljava/util/HashMap;

    return-void
.end method

.method private finish()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/beizi/ad/internal/utilities/ImageService;->imageUrls:Ljava/util/HashMap;

    .line 2
    iput-object v0, p0, Lcom/beizi/ad/internal/utilities/ImageService;->imageServiceListener:Lcom/beizi/ad/internal/utilities/ImageService$ImageServiceListener;

    return-void
.end method


# virtual methods
.method public execute()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/ImageService;->imageServiceListener:Lcom/beizi/ad/internal/utilities/ImageService$ImageServiceListener;

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/beizi/ad/internal/utilities/ImageService;->finish()V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/ImageService;->imageUrls:Ljava/util/HashMap;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/ImageService;->imageUrls:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 5
    new-instance v2, Lcom/beizi/ad/internal/utilities/ImageService$ImageDownloader;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/beizi/ad/internal/utilities/ImageService$ImageReceiver;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-direct {v2, p0, v3, v4, p0}, Lcom/beizi/ad/internal/utilities/ImageService$ImageDownloader;-><init>(Lcom/beizi/ad/internal/utilities/ImageService;Lcom/beizi/ad/internal/utilities/ImageService$ImageReceiver;Ljava/lang/String;Lcom/beizi/ad/internal/utilities/ImageService;)V

    .line 6
    sget-object v3, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Downloading image failFrom url: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    .line 7
    invoke-virtual {v2, v1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/ImageService;->imageServiceListener:Lcom/beizi/ad/internal/utilities/ImageService$ImageServiceListener;

    invoke-interface {v0}, Lcom/beizi/ad/internal/utilities/ImageService$ImageServiceListener;->onAllImageDownloadsFinish()V

    .line 9
    invoke-direct {p0}, Lcom/beizi/ad/internal/utilities/ImageService;->finish()V

    :cond_2
    return-void
.end method

.method public finishDownload(Lcom/beizi/ad/internal/utilities/ImageService$ImageReceiver;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/ImageService;->imageUrls:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/ImageService;->imageUrls:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    iget-object p1, p0, Lcom/beizi/ad/internal/utilities/ImageService;->imageUrls:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->size()I

    move-result p1

    if-nez p1, :cond_0

    .line 5
    iget-object p1, p0, Lcom/beizi/ad/internal/utilities/ImageService;->imageServiceListener:Lcom/beizi/ad/internal/utilities/ImageService$ImageServiceListener;

    invoke-interface {p1}, Lcom/beizi/ad/internal/utilities/ImageService$ImageServiceListener;->onAllImageDownloadsFinish()V

    .line 6
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    const-string v0, "Images downloading finished."

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Lcom/beizi/ad/internal/utilities/ImageService;->finish()V

    :cond_0
    return-void
.end method

.method public registerImageReceiver(Lcom/beizi/ad/internal/utilities/ImageService$ImageReceiver;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p2}, Lcom/beizi/ad/internal/utilities/StringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/ImageService;->imageUrls:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public registerNotification(Lcom/beizi/ad/internal/utilities/ImageService$ImageServiceListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/utilities/ImageService;->imageServiceListener:Lcom/beizi/ad/internal/utilities/ImageService$ImageServiceListener;

    return-void
.end method
