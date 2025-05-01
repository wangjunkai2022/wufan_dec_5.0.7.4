.class Lcom/ss/android/downloadlib/p/i$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/p/i;->vv()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic vv:Lcom/ss/android/downloadlib/p/i;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/p/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/downloadlib/p/i$1;->vv:Lcom/ss/android/downloadlib/p/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 1
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/m/u;->vv()Lcom/ss/android/downloadlib/addownload/m/u;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/downloadlib/addownload/m/u;->m()V

    .line 2
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/m/u;->vv()Lcom/ss/android/downloadlib/addownload/m/u;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/downloadlib/addownload/m/u;->p()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ss/android/downloadad/api/vv/m;

    .line 4
    invoke-virtual {v1}, Lcom/ss/android/downloadad/api/vv/m;->la()I

    move-result v2

    if-eqz v2, :cond_0

    .line 5
    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(I)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v3

    const-string v4, "notification_opt_2"

    .line 6
    invoke-virtual {v3, v4}, Lcom/ss/android/socialbase/downloader/n/vv;->m(Ljava/lang/String;)I

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_0

    .line 7
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object v4

    invoke-virtual {v4, v2}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getDownloadInfo(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 8
    invoke-static {v1}, Lcom/ss/android/downloadlib/n/jh;->m(Lcom/ss/android/downloadad/api/vv/m;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v1}, Lcom/ss/android/downloadad/api/vv/m;->o()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/ss/android/downloadlib/n/jh;->p(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    const-string v4, "restart_notify_open_app_count"

    .line 9
    invoke-virtual {v2, v4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSpIntVal(Ljava/lang/String;)I

    move-result v6

    const-string v7, "noti_open_restart_times"

    .line 10
    invoke-virtual {v3, v7, v5}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result v3

    if-ge v6, v3, :cond_0

    .line 11
    invoke-static {}, Lcom/ss/android/downloadlib/p/qv;->vv()Lcom/ss/android/downloadlib/p/qv;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/ss/android/downloadlib/p/qv;->o(Lcom/ss/android/downloadad/api/vv/m;)V

    add-int/lit8 v6, v6, 0x1

    .line 12
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v4, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setSpValue(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 13
    :cond_1
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getRealStatus()I

    move-result v4

    const/4 v6, -0x2

    if-ne v4, v6, :cond_2

    const-string v4, "restart_notify_continue_count"

    .line 14
    invoke-virtual {v2, v4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSpIntVal(Ljava/lang/String;)I

    move-result v6

    const-string v7, "noti_continue_restart_times"

    .line 15
    invoke-virtual {v3, v7, v5}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result v3

    if-ge v6, v3, :cond_0

    .line 16
    invoke-static {}, Lcom/ss/android/downloadlib/p/qv;->vv()Lcom/ss/android/downloadlib/p/qv;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/ss/android/downloadlib/p/qv;->vv(Lcom/ss/android/downloadad/api/vv/m;)V

    add-int/lit8 v6, v6, 0x1

    .line 17
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v4, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setSpValue(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 18
    :cond_2
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getRealStatus()I

    move-result v4

    const/4 v6, -0x3

    if-ne v4, v6, :cond_0

    invoke-static {v2}, Lcom/ss/android/socialbase/downloader/wv/u;->p(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {v1}, Lcom/ss/android/downloadlib/n/jh;->m(Lcom/ss/android/downloadad/api/vv/m;)Z

    move-result v4

    if-nez v4, :cond_0

    const-string v4, "restart_notify_install_count"

    .line 19
    invoke-virtual {v2, v4}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSpIntVal(Ljava/lang/String;)I

    move-result v6

    const-string v7, "noti_install_restart_times"

    .line 20
    invoke-virtual {v3, v7, v5}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result v3

    if-ge v6, v3, :cond_0

    .line 21
    invoke-static {}, Lcom/ss/android/downloadlib/p/qv;->vv()Lcom/ss/android/downloadlib/p/qv;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/ss/android/downloadlib/p/qv;->p(Lcom/ss/android/downloadad/api/vv/m;)V

    add-int/lit8 v6, v6, 0x1

    .line 22
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v4, v1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setSpValue(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_3
    return-void
.end method
