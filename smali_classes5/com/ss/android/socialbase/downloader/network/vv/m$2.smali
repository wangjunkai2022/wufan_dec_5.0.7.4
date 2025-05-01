.class final Lcom/ss/android/socialbase/downloader/network/vv/m$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/network/vv/m;->vv(Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/ss/android/socialbase/downloader/network/k;

.field final synthetic vv:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/network/vv/m$2;->vv:Ljava/lang/String;

    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/network/vv/m$2;->m:Lcom/ss/android/socialbase/downloader/network/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/network/vv/m$2;->vv:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/network/vv/m$2;->m:Lcom/ss/android/socialbase/downloader/network/k;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0, v1}, Lcom/ss/android/socialbase/downloader/network/k;->vv(Ljava/util/Map;)V

    :cond_0
    return-void

    :cond_1
    const-wide/16 v2, 0x0

    .line 4
    :try_start_0
    invoke-static {v2, v3, v1, v1}, Lcom/ss/android/socialbase/downloader/network/vv/m;->vv(JLcom/ss/android/socialbase/downloader/model/DownloadInfo;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 5
    invoke-static {}, Lcom/ss/android/socialbase/downloader/network/vv/vv;->vv()Lcom/ss/android/socialbase/downloader/network/vv/vv;

    move-result-object v4

    iget-object v5, p0, Lcom/ss/android/socialbase/downloader/network/vv/m$2;->vv:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/ss/android/socialbase/downloader/network/vv/vv;->vv(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 6
    invoke-static {}, Lcom/ss/android/socialbase/downloader/network/vv/vv;->vv()Lcom/ss/android/socialbase/downloader/network/vv/vv;

    move-result-object v4

    iget-object v5, p0, Lcom/ss/android/socialbase/downloader/network/vv/m$2;->vv:Ljava/lang/String;

    invoke-virtual {v4, v5, v0}, Lcom/ss/android/socialbase/downloader/network/vv/vv;->vv(Ljava/lang/String;Ljava/util/List;)Lcom/ss/android/socialbase/downloader/network/vv/p;

    move-result-object v1

    :cond_2
    if-nez v1, :cond_4

    .line 7
    new-instance v4, Lcom/ss/android/socialbase/downloader/network/vv/p;

    iget-object v5, p0, Lcom/ss/android/socialbase/downloader/network/vv/m$2;->vv:Ljava/lang/String;

    invoke-direct {v4, v5, v0, v2, v3}, Lcom/ss/android/socialbase/downloader/network/vv/p;-><init>(Ljava/lang/String;Ljava/util/List;J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 8
    :try_start_1
    invoke-virtual {v4}, Lcom/ss/android/socialbase/downloader/network/vv/p;->vv()V

    .line 9
    invoke-virtual {v4}, Lcom/ss/android/socialbase/downloader/network/vv/p;->o()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 10
    invoke-static {}, Lcom/ss/android/socialbase/downloader/network/vv/vv;->vv()Lcom/ss/android/socialbase/downloader/network/vv/vv;

    move-result-object v0

    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/network/vv/m$2;->vv:Ljava/lang/String;

    invoke-virtual {v0, v1, v4}, Lcom/ss/android/socialbase/downloader/network/vv/vv;->vv(Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/vv/p;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_3
    move-object v1, v4

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v1, v4

    goto :goto_2

    :catch_0
    move-exception v0

    move-object v1, v4

    goto :goto_1

    .line 11
    :cond_4
    :goto_0
    :try_start_2
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/network/vv/p;->wv()Ljava/util/Map;

    move-result-object v0

    .line 12
    iget-object v2, p0, Lcom/ss/android/socialbase/downloader/network/vv/m$2;->m:Lcom/ss/android/socialbase/downloader/network/k;

    if-eqz v2, :cond_5

    .line 13
    invoke-interface {v2, v0}, Lcom/ss/android/socialbase/downloader/network/k;->vv(Ljava/util/Map;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 14
    :cond_5
    :try_start_3
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/network/vv/p;->p()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    return-void

    :catchall_2
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    .line 15
    :goto_1
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 16
    :try_start_5
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/network/vv/p;->p()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :catchall_3
    return-void

    :goto_2
    :try_start_6
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/network/vv/p;->p()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 17
    :catchall_4
    throw v0
.end method
