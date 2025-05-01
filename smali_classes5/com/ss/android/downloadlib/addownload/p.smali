.class public Lcom/ss/android/downloadlib/addownload/p;
.super Ljava/lang/Object;


# static fields
.field private static volatile m:Lcom/ss/android/downloadlib/addownload/p; = null

.field private static vv:Ljava/lang/String; = "p"


# instance fields
.field private p:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Long;",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/p;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 3
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/p;->p:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public static vv()Lcom/ss/android/downloadlib/addownload/p;
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/p;->m:Lcom/ss/android/downloadlib/addownload/p;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/ss/android/downloadlib/addownload/p;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/ss/android/downloadlib/addownload/p;->m:Lcom/ss/android/downloadlib/addownload/p;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/ss/android/downloadlib/addownload/p;

    invoke-direct {v1}, Lcom/ss/android/downloadlib/addownload/p;-><init>()V

    sput-object v1, Lcom/ss/android/downloadlib/addownload/p;->m:Lcom/ss/android/downloadlib/addownload/p;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_0
    sget-object v0, Lcom/ss/android/downloadlib/addownload/p;->m:Lcom/ss/android/downloadlib/addownload/p;

    return-object v0
.end method

.method private vv(JZI)V
    .locals 1

    .line 21
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/ss/android/downloadlib/i/vv;->vv(JZI)V

    if-eqz p3, :cond_0

    .line 22
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->y()Lcom/ss/android/download/api/config/la;

    :cond_0
    return-void
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z
    .locals 1

    if-eqz p0, :cond_1

    .line 26
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result p0

    const/4 v0, -0x4

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public m()J
    .locals 4

    .line 1
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->wv()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "quick_app_check_internal"

    const-wide/16 v2, 0x4b0

    .line 2
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public vv(Lcom/ss/android/downloadlib/addownload/o;ILcom/ss/android/download/api/download/DownloadModel;)V
    .locals 2

    .line 23
    invoke-static {}, Lcom/ss/android/downloadlib/m/o;->vv()Lcom/ss/android/downloadlib/m/o;

    move-result-object v0

    new-instance v1, Lcom/ss/android/downloadlib/addownload/p$1;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/ss/android/downloadlib/addownload/p$1;-><init>(Lcom/ss/android/downloadlib/addownload/p;Lcom/ss/android/downloadlib/addownload/o;ILcom/ss/android/download/api/download/DownloadModel;)V

    .line 24
    invoke-virtual {p0}, Lcom/ss/android/downloadlib/addownload/p;->m()J

    move-result-wide p1

    .line 25
    invoke-virtual {v0, v1, p1, p2}, Lcom/ss/android/downloadlib/m/o;->vv(Lcom/ss/android/downloadlib/m/i;J)V

    return-void
.end method

.method public vv(Lcom/ss/android/downloadlib/addownload/o;ZILcom/ss/android/download/api/download/DownloadModel;)V
    .locals 4

    .line 7
    instance-of v0, p4, Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-eqz v0, :cond_0

    .line 8
    move-object v0, p4

    check-cast v0, Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->setFunnelType(I)Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    .line 9
    :cond_0
    invoke-interface {p4}, Lcom/ss/android/download/api/download/DownloadModel;->getId()J

    move-result-wide v0

    const/4 p4, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq p3, p4, :cond_6

    const/4 p4, 0x5

    if-eq p3, p4, :cond_4

    const/4 p1, 0x7

    if-eq p3, p1, :cond_1

    goto :goto_0

    .line 10
    :cond_1
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/p;->p:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Runnable;

    if-eqz p2, :cond_2

    .line 11
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object p1

    invoke-virtual {p1, v0, v1, v3}, Lcom/ss/android/downloadlib/i/vv;->vv(JI)V

    .line 12
    invoke-direct {p0, v0, v1, v3, v3}, Lcom/ss/android/downloadlib/addownload/p;->vv(JZI)V

    return-void

    :cond_2
    if-eqz p1, :cond_3

    .line 13
    invoke-static {}, Lcom/ss/android/downloadlib/n;->vv()Lcom/ss/android/downloadlib/n;

    move-result-object p2

    invoke-virtual {p2}, Lcom/ss/android/downloadlib/n;->m()Landroid/os/Handler;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 14
    :cond_3
    invoke-direct {p0, v0, v1, v2, v3}, Lcom/ss/android/downloadlib/addownload/p;->vv(JZI)V

    :goto_0
    return-void

    :cond_4
    if-nez p2, :cond_5

    .line 15
    invoke-direct {p0, v0, v1, v2, v3}, Lcom/ss/android/downloadlib/addownload/p;->vv(JZI)V

    .line 16
    invoke-virtual {p1, v2}, Lcom/ss/android/downloadlib/addownload/o;->p(Z)V

    return-void

    .line 17
    :cond_5
    invoke-direct {p0, v0, v1, v3, v3}, Lcom/ss/android/downloadlib/addownload/p;->vv(JZI)V

    return-void

    :cond_6
    const/4 p3, 0x2

    if-nez p2, :cond_7

    .line 18
    invoke-direct {p0, v0, v1, v2, p3}, Lcom/ss/android/downloadlib/addownload/p;->vv(JZI)V

    .line 19
    invoke-virtual {p1, v2}, Lcom/ss/android/downloadlib/addownload/o;->m(Z)V

    return-void

    .line 20
    :cond_7
    invoke-direct {p0, v0, v1, v3, p3}, Lcom/ss/android/downloadlib/addownload/p;->vv(JZI)V

    return-void
.end method
