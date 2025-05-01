.class public Lcom/ss/android/downloadlib/addownload/i/b;
.super Ljava/lang/Object;


# static fields
.field private static vv:Lcom/ss/android/downloadlib/addownload/i/b;


# instance fields
.field private m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ss/android/downloadlib/addownload/i/wv;",
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

    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/i/b;->m:Ljava/util/List;

    .line 3
    new-instance v1, Lcom/ss/android/downloadlib/addownload/i/k;

    invoke-direct {v1}, Lcom/ss/android/downloadlib/addownload/i/k;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/i/b;->m:Ljava/util/List;

    new-instance v1, Lcom/ss/android/downloadlib/addownload/i/jh;

    invoke-direct {v1}, Lcom/ss/android/downloadlib/addownload/i/jh;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/i/b;->m:Ljava/util/List;

    new-instance v1, Lcom/ss/android/downloadlib/addownload/i/u;

    invoke-direct {v1}, Lcom/ss/android/downloadlib/addownload/i/u;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/i/b;->m:Ljava/util/List;

    new-instance v1, Lcom/ss/android/downloadlib/addownload/i/vv;

    invoke-direct {v1}, Lcom/ss/android/downloadlib/addownload/i/vv;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static vv()Lcom/ss/android/downloadlib/addownload/i/b;
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/downloadlib/addownload/i/b;->vv:Lcom/ss/android/downloadlib/addownload/i/b;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/ss/android/downloadlib/addownload/i/b;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/ss/android/downloadlib/addownload/i/b;->vv:Lcom/ss/android/downloadlib/addownload/i/b;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/ss/android/downloadlib/addownload/i/b;

    invoke-direct {v1}, Lcom/ss/android/downloadlib/addownload/i/b;-><init>()V

    sput-object v1, Lcom/ss/android/downloadlib/addownload/i/b;->vv:Lcom/ss/android/downloadlib/addownload/i/b;

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
    sget-object v0, Lcom/ss/android/downloadlib/addownload/i/b;->vv:Lcom/ss/android/downloadlib/addownload/i/b;

    return-object v0
.end method


# virtual methods
.method public vv(Lcom/ss/android/downloadad/api/vv/m;ILcom/ss/android/downloadlib/addownload/i/qv;)V
    .locals 4

    .line 7
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/i/b;->m:Ljava/util/List;

    if-eqz v0, :cond_8

    .line 8
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_8

    if-nez p1, :cond_0

    goto :goto_3

    .line 9
    :cond_0
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/vv/m;->fn()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_1

    .line 10
    invoke-static {v2}, Lcom/ss/android/downloadlib/qv;->vv(Landroid/content/Context;)Lcom/ss/android/downloadlib/qv;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/vv/m;->fn()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v2, v1}, Lcom/ss/android/downloadlib/qv;->vv(Ljava/lang/String;Ljava/lang/String;Z)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v0

    goto :goto_0

    .line 11
    :cond_1
    invoke-static {v2}, Lcom/ss/android/downloadlib/qv;->vv(Landroid/content/Context;)Lcom/ss/android/downloadlib/qv;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/vv/m;->vv()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/ss/android/downloadlib/qv;->m(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_7

    .line 12
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getMimeType()Ljava/lang/String;

    move-result-object v0

    const-string v2, "application/vnd.android.package-archive"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    .line 13
    :cond_2
    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/vv/m;->la()I

    move-result v0

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(I)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v0

    const-string v2, "pause_optimise_switch"

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result v0

    if-ne v0, v1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    .line 14
    :goto_1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/i/b;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ss/android/downloadlib/addownload/i/wv;

    if-nez v1, :cond_5

    .line 15
    instance-of v3, v2, Lcom/ss/android/downloadlib/addownload/i/jh;

    if-eqz v3, :cond_4

    .line 16
    :cond_5
    invoke-interface {v2, p1, p2, p3}, Lcom/ss/android/downloadlib/addownload/i/wv;->vv(Lcom/ss/android/downloadad/api/vv/m;ILcom/ss/android/downloadlib/addownload/i/qv;)Z

    move-result v2

    if-eqz v2, :cond_4

    return-void

    .line 17
    :cond_6
    invoke-interface {p3, p1}, Lcom/ss/android/downloadlib/addownload/i/qv;->vv(Lcom/ss/android/downloadad/api/vv/m;)V

    return-void

    .line 18
    :cond_7
    :goto_2
    invoke-interface {p3, p1}, Lcom/ss/android/downloadlib/addownload/i/qv;->vv(Lcom/ss/android/downloadad/api/vv/m;)V

    return-void

    .line 19
    :cond_8
    :goto_3
    invoke-interface {p3, p1}, Lcom/ss/android/downloadlib/addownload/i/qv;->vv(Lcom/ss/android/downloadad/api/vv/m;)V

    return-void
.end method
