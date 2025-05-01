.class public Lcom/ss/android/downloadlib/u/p;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/socialbase/appdownloader/p/k;


# static fields
.field private static volatile vv:Lcom/ss/android/downloadlib/u/p;


# instance fields
.field private m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/appdownloader/p/k;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ss/android/downloadlib/u/p;->m:Ljava/util/List;

    .line 3
    new-instance v1, Lcom/ss/android/downloadlib/u/m;

    invoke-direct {v1}, Lcom/ss/android/downloadlib/u/m;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    iget-object v0, p0, Lcom/ss/android/downloadlib/u/p;->m:Ljava/util/List;

    new-instance v1, Lcom/ss/android/downloadlib/u/vv;

    invoke-direct {v1}, Lcom/ss/android/downloadlib/u/vv;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static vv()Lcom/ss/android/downloadlib/u/p;
    .locals 2

    .line 2
    sget-object v0, Lcom/ss/android/downloadlib/u/p;->vv:Lcom/ss/android/downloadlib/u/p;

    if-nez v0, :cond_1

    .line 3
    const-class v0, Lcom/ss/android/downloadlib/u/p;

    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/ss/android/downloadlib/u/p;->vv:Lcom/ss/android/downloadlib/u/p;

    if-nez v1, :cond_0

    .line 5
    new-instance v1, Lcom/ss/android/downloadlib/u/p;

    invoke-direct {v1}, Lcom/ss/android/downloadlib/u/p;-><init>()V

    sput-object v1, Lcom/ss/android/downloadlib/u/p;->vv:Lcom/ss/android/downloadlib/u/p;

    .line 6
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 7
    :cond_1
    :goto_0
    sget-object v0, Lcom/ss/android/downloadlib/u/p;->vv:Lcom/ss/android/downloadlib/u/p;

    return-object v0
.end method

.method static synthetic vv(Lcom/ss/android/downloadlib/u/p;Lcom/ss/android/socialbase/downloader/model/DownloadInfo;ILcom/ss/android/socialbase/appdownloader/p/wv;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/ss/android/downloadlib/u/p;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;ILcom/ss/android/socialbase/appdownloader/p/wv;)V

    return-void
.end method

.method private vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;ILcom/ss/android/socialbase/appdownloader/p/wv;)V
    .locals 2

    .line 11
    iget-object v0, p0, Lcom/ss/android/downloadlib/u/p;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eq p2, v0, :cond_1

    if-gez p2, :cond_0

    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/u/p;->m:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ss/android/socialbase/appdownloader/p/k;

    .line 13
    new-instance v1, Lcom/ss/android/downloadlib/u/p$1;

    invoke-direct {v1, p0, p2, p1, p3}, Lcom/ss/android/downloadlib/u/p$1;-><init>(Lcom/ss/android/downloadlib/u/p;ILcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/appdownloader/p/wv;)V

    invoke-interface {v0, p1, v1}, Lcom/ss/android/socialbase/appdownloader/p/k;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/appdownloader/p/wv;)V

    return-void

    .line 14
    :cond_1
    :goto_0
    invoke-interface {p3}, Lcom/ss/android/socialbase/appdownloader/p/wv;->vv()V

    return-void
.end method


# virtual methods
.method public vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/socialbase/appdownloader/p/wv;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 8
    iget-object v0, p0, Lcom/ss/android/downloadlib/u/p;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 9
    invoke-direct {p0, p1, v0, p2}, Lcom/ss/android/downloadlib/u/p;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;ILcom/ss/android/socialbase/appdownloader/p/wv;)V

    return-void

    :cond_1
    :goto_0
    if-eqz p2, :cond_2

    .line 10
    invoke-interface {p2}, Lcom/ss/android/socialbase/appdownloader/p/wv;->vv()V

    :cond_2
    return-void
.end method
