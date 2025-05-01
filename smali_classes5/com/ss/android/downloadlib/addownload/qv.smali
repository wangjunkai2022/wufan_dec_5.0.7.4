.class public Lcom/ss/android/downloadlib/addownload/qv;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/downloadlib/n/r$vv;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ss/android/downloadlib/addownload/qv$m;,
        Lcom/ss/android/downloadlib/addownload/qv$vv;
    }
.end annotation


# instance fields
.field private i:Lcom/ss/android/downloadlib/addownload/o;

.field private m:J

.field private o:Lcom/ss/android/downloadlib/addownload/qv$m;

.field private p:Z

.field public vv:Lcom/ss/android/downloadlib/addownload/m/o;


# direct methods
.method public constructor <init>(Lcom/ss/android/downloadlib/addownload/o;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/ss/android/downloadlib/addownload/qv;->p:Z

    .line 3
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/qv;->i:Lcom/ss/android/downloadlib/addownload/o;

    return-void
.end method

.method private i()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v0, v0, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v0, v0, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    .line 3
    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getDownloadUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static m(Ljava/util/Map;)Ljava/util/List;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ss/android/download/api/download/vv;",
            ">;"
        }
    .end annotation

    .line 17
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p0, :cond_4

    .line 18
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 19
    :cond_0
    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 20
    instance-of v2, v1, Lcom/ss/android/download/api/download/vv;

    if-eqz v2, :cond_2

    .line 21
    check-cast v1, Lcom/ss/android/download/api/download/vv;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 22
    :cond_2
    instance-of v2, v1, Ljava/lang/ref/SoftReference;

    if-eqz v2, :cond_3

    move-object v2, v1

    check-cast v2, Ljava/lang/ref/SoftReference;

    invoke-virtual {v2}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v3

    instance-of v3, v3, Lcom/ss/android/download/api/download/vv;

    if-eqz v3, :cond_3

    .line 23
    invoke-virtual {v2}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ss/android/download/api/download/vv;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 24
    :cond_3
    instance-of v2, v1, Ljava/lang/ref/WeakReference;

    if-eqz v2, :cond_1

    check-cast v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Lcom/ss/android/download/api/download/vv;

    if-eqz v2, :cond_1

    .line 25
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ss/android/download/api/download/vv;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    :goto_1
    return-object v0
.end method

.method private m(Lcom/ss/android/download/api/config/x;)V
    .locals 3

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 4
    invoke-static {v0}, Lcom/ss/android/downloadlib/n/k;->m(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    .line 5
    invoke-interface {p1}, Lcom/ss/android/download/api/config/x;->vv()V

    :cond_0
    return-void

    .line 6
    :cond_1
    invoke-static {}, Lcom/ss/android/downloadlib/n/jh;->vv()Z

    move-result v0

    const-string v1, "android.permission.READ_MEDIA_IMAGES"

    if-eqz v0, :cond_4

    .line 7
    invoke-static {v1}, Lcom/ss/android/downloadlib/n/k;->m(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "android.permission.READ_MEDIA_AUDIO"

    .line 8
    invoke-static {v0}, Lcom/ss/android/downloadlib/n/k;->m(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "android.permission.READ_MEDIA_VIDEO"

    .line 9
    invoke-static {v0}, Lcom/ss/android/downloadlib/n/k;->m(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_2
    if-eqz p1, :cond_3

    .line 10
    invoke-interface {p1}, Lcom/ss/android/download/api/config/x;->vv()V

    :cond_3
    return-void

    :cond_4
    const-string v1, "android.permission.READ_EXTERNAL_STORAGE"

    :cond_5
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 11
    new-instance v1, Lcom/ss/android/downloadlib/addownload/qv$2;

    invoke-direct {v1, p0, p1}, Lcom/ss/android/downloadlib/addownload/qv$2;-><init>(Lcom/ss/android/downloadlib/addownload/qv;Lcom/ss/android/download/api/config/x;)V

    invoke-static {v0, v1}, Lcom/ss/android/downloadlib/n/k;->vv([Ljava/lang/String;Lcom/ss/android/downloadlib/n/k$vv;)V

    return-void
.end method

.method private o()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v0, v0, Lcom/ss/android/downloadlib/addownload/m/o;->i:Lcom/ss/android/download/api/download/DownloadController;

    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadController;->isAddToDownloadManage()Z

    move-result v0

    return v0
.end method

.method private o(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v0, v0, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-static {v0}, Lcom/ss/android/downloadlib/n/jh;->vv(Lcom/ss/android/download/api/download/DownloadModel;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lcom/ss/android/downloadlib/addownload/qv;->u(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private p()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/qv;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/qv;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private u()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v0, v0, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-static {v0}, Lcom/ss/android/downloadlib/n/jh;->vv(Lcom/ss/android/download/api/download/DownloadModel;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v0, v0, Lcom/ss/android/downloadlib/addownload/m/o;->i:Lcom/ss/android/download/api/download/DownloadController;

    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadController;->getLinkMode()I

    move-result v0

    invoke-static {v0}, Lcom/ss/android/downloadlib/addownload/wv;->vv(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private u(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z
    .locals 2

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v0

    const/4 v1, -0x3

    if-ne v0, v1, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/ss/android/socialbase/downloader/wv/u;->i(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method static synthetic vv(Lcom/ss/android/downloadlib/addownload/qv;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/ss/android/downloadlib/addownload/qv;->m:J

    return-wide v0
.end method

.method private vv(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/p;
    .locals 2

    const-string v0, "clickid"

    .line 215
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 216
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 217
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 218
    new-instance v1, Lcom/ss/android/socialbase/downloader/model/p;

    invoke-direct {v1, v0, p1}, Lcom/ss/android/socialbase/downloader/model/p;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception p1

    .line 219
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->x()Lcom/ss/android/download/api/m/vv;

    move-result-object v0

    const-string v1, "parseLogExtra Error"

    invoke-interface {v0, p1, v1}, Lcom/ss/android/download/api/m/vv;->vv(Ljava/lang/Throwable;Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private vv(Lcom/ss/android/socialbase/downloader/n/vv;)Ljava/lang/String;
    .locals 8

    .line 139
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v0, v0, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getFilePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 140
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object p1, p1, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getFilePath()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 141
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/i;->k()Lcom/ss/android/socialbase/appdownloader/i;

    move-result-object v0

    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v2, v2, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v2}, Lcom/ss/android/download/api/download/DownloadModel;->getDownloadUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/ss/android/socialbase/appdownloader/i;->vv(Landroid/content/Context;Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v0

    .line 142
    invoke-static {}, Lcom/ss/android/downloadlib/n/jh;->vv()Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 143
    invoke-static {v1}, Lcom/ss/android/downloadlib/n/k;->m(Ljava/lang/String;)Z

    move-result v1

    goto :goto_1

    :cond_1
    const-string v1, "android.permission.READ_MEDIA_IMAGES"

    .line 144
    invoke-static {v1}, Lcom/ss/android/downloadlib/n/k;->m(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "android.permission.READ_MEDIA_AUDIO"

    .line 145
    invoke-static {v1}, Lcom/ss/android/downloadlib/n/k;->m(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "android.permission.READ_MEDIA_VIDEO"

    invoke-static {v1}, Lcom/ss/android/downloadlib/n/k;->m(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v1, 0x1

    .line 146
    :goto_1
    invoke-virtual {p0}, Lcom/ss/android/downloadlib/addownload/qv;->m()Ljava/lang/String;

    move-result-object v3

    if-eqz v0, :cond_7

    .line 147
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_7

    .line 148
    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    move-result-object v4

    if-eqz v1, :cond_4

    return-object v4

    .line 149
    :cond_4
    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v5

    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_5

    return-object v4

    .line 150
    :cond_5
    :try_start_0
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_6

    invoke-virtual {v4, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v5, :cond_6

    return-object v4

    :catch_0
    move-exception v4

    .line 151
    invoke-virtual {v4}, Ljava/lang/Exception;->printStackTrace()V

    .line 152
    :cond_6
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->ky()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object v4

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->cancel(I)V

    .line 153
    :cond_7
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const/4 v4, 0x2

    :try_start_1
    const-string v5, "ttdownloader_code"

    if-eqz v1, :cond_8

    const/4 v6, 0x1

    goto :goto_2

    :cond_8
    const/4 v6, 0x2

    .line 154
    :goto_2
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-exception v5

    .line 155
    invoke-virtual {v5}, Lorg/json/JSONException;->printStackTrace()V

    .line 156
    :goto_3
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object v5

    iget-object v6, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    const-string v7, "label_external_permission"

    invoke-virtual {v5, v7, v0, v6}, Lcom/ss/android/downloadlib/i/vv;->vv(Ljava/lang/String;Lorg/json/JSONObject;Lcom/ss/android/downloadad/api/vv/vv;)V

    const/4 v0, 0x0

    .line 157
    :try_start_2
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/p;->m()Ljava/lang/String;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_4

    :catch_2
    nop

    .line 158
    :goto_4
    invoke-static {p1}, Lcom/ss/android/downloadlib/n/o;->vv(Lcom/ss/android/socialbase/downloader/n/vv;)I

    move-result p1

    if-eqz p1, :cond_d

    const/4 v5, 0x4

    if-eq p1, v5, :cond_b

    if-nez v1, :cond_9

    if-ne p1, v4, :cond_9

    goto :goto_5

    :cond_9
    const/4 v4, 0x3

    if-eq p1, v4, :cond_a

    if-nez v1, :cond_d

    if-ne p1, v2, :cond_d

    .line 159
    :cond_a
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_d

    goto :goto_6

    .line 160
    :cond_b
    :goto_5
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p1

    .line 161
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_c

    .line 162
    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    .line 163
    :cond_c
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_d

    .line 164
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    move-object v3, p1

    goto :goto_6

    :cond_d
    move-object v3, v0

    :goto_6
    return-object v3
.end method

.method public static vv(Ljava/util/Map;)Ljava/util/List;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ss/android/download/api/download/DownloadStatusChangeListener;",
            ">;"
        }
    .end annotation

    .line 206
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p0, :cond_4

    .line 207
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 208
    :cond_0
    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 209
    instance-of v2, v1, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;

    if-eqz v2, :cond_2

    .line 210
    check-cast v1, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 211
    :cond_2
    instance-of v2, v1, Ljava/lang/ref/SoftReference;

    if-eqz v2, :cond_3

    move-object v2, v1

    check-cast v2, Ljava/lang/ref/SoftReference;

    invoke-virtual {v2}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v3

    instance-of v3, v3, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;

    if-eqz v3, :cond_3

    .line 212
    invoke-virtual {v2}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 213
    :cond_3
    instance-of v2, v1, Ljava/lang/ref/WeakReference;

    if-eqz v2, :cond_1

    check-cast v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;

    if-eqz v2, :cond_1

    .line 214
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    :goto_1
    return-object v0
.end method


# virtual methods
.method i(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z
    .locals 1

    .line 4
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/qv;->u()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0, p1}, Lcom/ss/android/downloadlib/addownload/qv;->o(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public m()Ljava/lang/String;
    .locals 2
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 12
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 13
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    .line 14
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 16
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public m(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 1
    .param p1    # Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/qv;->o:Lcom/ss/android/downloadlib/addownload/qv$m;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lcom/ss/android/downloadlib/addownload/qv$m;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/qv;->o:Lcom/ss/android/downloadlib/addownload/qv$m;

    :cond_0
    return-void
.end method

.method p(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v0, v0, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-static {v0}, Lcom/ss/android/downloadlib/addownload/wv;->vv(Lcom/ss/android/download/api/download/DownloadModel;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    iget-boolean v0, p0, Lcom/ss/android/downloadlib/addownload/qv;->p:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTargetFilePath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/ss/android/downloadlib/n/jh;->m(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    .line 5
    :goto_0
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object v1

    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    const-string v3, "file_status"

    invoke-virtual {v1, v3, p1, v2}, Lcom/ss/android/downloadlib/i/vv;->vv(Ljava/lang/String;ILcom/ss/android/downloadlib/addownload/m/o;)V

    .line 6
    iput-boolean v0, p0, Lcom/ss/android/downloadlib/addownload/qv;->p:Z

    :cond_1
    return-void
.end method

.method vv(Landroid/content/Context;Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;)I
    .locals 11

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 65
    :cond_0
    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v1, v1, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v1}, Lcom/ss/android/download/api/download/DownloadModel;->getHeaders()Ljava/util/Map;

    move-result-object v1

    .line 66
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 67
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->wv()Lorg/json/JSONObject;

    move-result-object v3

    const-string v4, "enable_send_click_id_in_apk"

    const/4 v5, 0x1

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v3

    if-ne v3, v5, :cond_1

    .line 68
    iget-object v3, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v3, v3, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v3}, Lcom/ss/android/download/api/download/DownloadModel;->getLogExtra()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 69
    iget-object v3, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v3, v3, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v3}, Lcom/ss/android/download/api/download/DownloadModel;->getLogExtra()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/ss/android/downloadlib/addownload/qv;->vv(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/p;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 70
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    if-eqz v1, :cond_3

    .line 71
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    if-eqz v3, :cond_2

    .line 72
    new-instance v4, Lcom/ss/android/socialbase/downloader/model/p;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-direct {v4, v6, v3}, Lcom/ss/android/socialbase/downloader/model/p;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 73
    :cond_3
    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v1, v1, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    .line 74
    invoke-interface {v1}, Lcom/ss/android/download/api/download/DownloadModel;->getId()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v3, v3, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    .line 75
    invoke-interface {v3}, Lcom/ss/android/download/api/download/DownloadModel;->getNotificationJumpUrl()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v4, v4, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    .line 76
    invoke-interface {v4}, Lcom/ss/android/download/api/download/DownloadModel;->isShowToast()Z

    move-result v4

    iget-object v6, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v6, v6, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    .line 77
    invoke-interface {v6}, Lcom/ss/android/download/api/download/DownloadModel;->getModelType()I

    move-result v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    .line 78
    invoke-static {v1, v3, v4, v6}, Lcom/ss/android/downloadlib/n/i;->vv(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 79
    iget-object v3, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v3, v3, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-static {v3}, Lcom/ss/android/downloadlib/n/o;->m(Lcom/ss/android/download/api/download/DownloadModel;)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v3

    .line 80
    iget-object v4, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v4, v4, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-static {v4}, Lcom/ss/android/downloadlib/n/o;->vv(Lcom/ss/android/download/api/download/DownloadModel;)Lorg/json/JSONObject;

    move-result-object v4

    .line 81
    iget-object v6, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v6, v6, Lcom/ss/android/downloadlib/addownload/m/o;->i:Lcom/ss/android/download/api/download/DownloadController;

    invoke-interface {v6}, Lcom/ss/android/download/api/download/DownloadController;->enableAH()Z

    move-result v6

    if-nez v6, :cond_4

    .line 82
    invoke-static {v4}, Lcom/ss/android/downloadlib/n/jh;->vv(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v4

    .line 83
    new-instance v6, Lorg/json/JSONArray;

    invoke-direct {v6}, Lorg/json/JSONArray;-><init>()V

    const-string v7, "ah_plans"

    invoke-static {v4, v7, v6}, Lcom/ss/android/downloadlib/n/jh;->vv(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 84
    :cond_4
    iget-object v6, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v6, v6, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v6}, Lcom/ss/android/download/api/download/DownloadModel;->getExecutorGroup()I

    move-result v6

    .line 85
    iget-object v7, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v7, v7, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v7}, Lcom/ss/android/download/api/download/DownloadModel;->isAd()Z

    move-result v7

    if-nez v7, :cond_5

    iget-object v7, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v7, v7, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-static {v7}, Lcom/ss/android/downloadlib/addownload/wv;->m(Lcom/ss/android/download/api/download/DownloadModel;)Z

    move-result v7

    if-eqz v7, :cond_6

    :cond_5
    const/4 v6, 0x4

    .line 86
    :cond_6
    invoke-direct {p0, v3}, Lcom/ss/android/downloadlib/addownload/qv;->vv(Lcom/ss/android/socialbase/downloader/n/vv;)Ljava/lang/String;

    move-result-object v7

    .line 87
    iget-object v8, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v8, v8, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v8}, Lcom/ss/android/download/api/download/DownloadModel;->getDownloadUrl()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v7}, Lcom/ss/android/socialbase/downloader/downloader/p;->vv(Ljava/lang/String;Ljava/lang/String;)I

    move-result v8

    .line 88
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v9

    invoke-static {v9}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object v9

    invoke-virtual {v9, v8}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getDownloadInfo(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object v8

    if-eqz v8, :cond_7

    const/4 v9, 0x3

    .line 89
    iget-object v10, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v10, v10, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v10}, Lcom/ss/android/download/api/download/DownloadModel;->getModelType()I

    move-result v10

    if-ne v9, v10, :cond_7

    .line 90
    invoke-virtual {v8, v5}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setFirstDownload(Z)V

    .line 91
    :cond_7
    new-instance v8, Lcom/ss/android/socialbase/appdownloader/u;

    iget-object v9, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v9, v9, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v9}, Lcom/ss/android/download/api/download/DownloadModel;->getDownloadUrl()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, p1, v9}, Lcom/ss/android/socialbase/appdownloader/u;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object p1, p1, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    .line 92
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getBackupUrls()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v8, p1}, Lcom/ss/android/socialbase/appdownloader/u;->m(Ljava/util/List;)Lcom/ss/android/socialbase/appdownloader/u;

    move-result-object p1

    iget-object v8, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v8, v8, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    .line 93
    invoke-interface {v8}, Lcom/ss/android/download/api/download/DownloadModel;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1, v8}, Lcom/ss/android/socialbase/appdownloader/u;->vv(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/u;

    move-result-object p1

    .line 94
    invoke-virtual {p1, v1}, Lcom/ss/android/socialbase/appdownloader/u;->o(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/u;

    move-result-object p1

    .line 95
    invoke-virtual {p1, v2}, Lcom/ss/android/socialbase/appdownloader/u;->vv(Ljava/util/List;)Lcom/ss/android/socialbase/appdownloader/u;

    move-result-object p1

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v1, v1, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    .line 96
    invoke-interface {v1}, Lcom/ss/android/download/api/download/DownloadModel;->isShowNotification()Z

    move-result v1

    invoke-virtual {p1, v1}, Lcom/ss/android/socialbase/appdownloader/u;->vv(Z)Lcom/ss/android/socialbase/appdownloader/u;

    move-result-object p1

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v1, v1, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    .line 97
    invoke-interface {v1}, Lcom/ss/android/download/api/download/DownloadModel;->isNeedWifi()Z

    move-result v1

    invoke-virtual {p1, v1}, Lcom/ss/android/socialbase/appdownloader/u;->p(Z)Lcom/ss/android/socialbase/appdownloader/u;

    move-result-object p1

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v1, v1, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    .line 98
    invoke-interface {v1}, Lcom/ss/android/download/api/download/DownloadModel;->getFileName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/ss/android/socialbase/appdownloader/u;->m(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/u;

    move-result-object p1

    .line 99
    invoke-virtual {p1, v7}, Lcom/ss/android/socialbase/appdownloader/u;->p(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/u;

    move-result-object p1

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v1, v1, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    .line 100
    invoke-interface {v1}, Lcom/ss/android/download/api/download/DownloadModel;->getAppIcon()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/ss/android/socialbase/appdownloader/u;->b(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/u;

    move-result-object p1

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v1, v1, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    .line 101
    invoke-interface {v1}, Lcom/ss/android/download/api/download/DownloadModel;->getMd5()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/ss/android/socialbase/appdownloader/u;->qv(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/u;

    move-result-object p1

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v1, v1, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    .line 102
    invoke-interface {v1}, Lcom/ss/android/download/api/download/DownloadModel;->getSdkMonitorScene()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/ss/android/socialbase/appdownloader/u;->k(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/u;

    move-result-object p1

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v1, v1, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    .line 103
    invoke-interface {v1}, Lcom/ss/android/download/api/download/DownloadModel;->getExpectFileLength()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Lcom/ss/android/socialbase/appdownloader/u;->vv(J)Lcom/ss/android/socialbase/appdownloader/u;

    move-result-object p1

    .line 104
    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/u;->vv(Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;)Lcom/ss/android/socialbase/appdownloader/u;

    move-result-object p1

    iget-object p2, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object p2, p2, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    .line 105
    invoke-interface {p2}, Lcom/ss/android/download/api/download/DownloadModel;->needIndependentProcess()Z

    move-result p2

    if-nez p2, :cond_9

    const-string p2, "need_independent_process"

    invoke-virtual {v3, p2, v0}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result p2

    if-ne p2, v5, :cond_8

    goto :goto_1

    :cond_8
    const/4 p2, 0x0

    goto :goto_2

    :cond_9
    :goto_1
    const/4 p2, 0x1

    :goto_2
    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/u;->jh(Z)Lcom/ss/android/socialbase/appdownloader/u;

    move-result-object p1

    iget-object p2, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object p2, p2, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    .line 106
    invoke-interface {p2}, Lcom/ss/android/download/api/download/DownloadModel;->getDownloadFileUriProvider()Lcom/ss/android/socialbase/downloader/depend/IDownloadFileUriProvider;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/u;->vv(Lcom/ss/android/socialbase/downloader/depend/IDownloadFileUriProvider;)Lcom/ss/android/socialbase/appdownloader/u;

    move-result-object p1

    iget-object p2, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object p2, p2, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    .line 107
    invoke-interface {p2}, Lcom/ss/android/download/api/download/DownloadModel;->autoInstallWithoutNotification()Z

    move-result p2

    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/u;->m(Z)Lcom/ss/android/socialbase/appdownloader/u;

    move-result-object p1

    iget-object p2, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object p2, p2, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    .line 108
    invoke-interface {p2}, Lcom/ss/android/download/api/download/DownloadModel;->getPackageName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/u;->n(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/u;

    move-result-object p1

    const/16 p2, 0x3e8

    .line 109
    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/u;->i(I)Lcom/ss/android/socialbase/appdownloader/u;

    move-result-object p1

    const/16 p2, 0x64

    .line 110
    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/u;->o(I)Lcom/ss/android/socialbase/appdownloader/u;

    move-result-object p1

    .line 111
    invoke-virtual {p1, v4}, Lcom/ss/android/socialbase/appdownloader/u;->vv(Lorg/json/JSONObject;)Lcom/ss/android/socialbase/appdownloader/u;

    move-result-object p1

    .line 112
    invoke-virtual {p1, v5}, Lcom/ss/android/socialbase/appdownloader/u;->wv(Z)Lcom/ss/android/socialbase/appdownloader/u;

    move-result-object p1

    .line 113
    invoke-virtual {p1, v5}, Lcom/ss/android/socialbase/appdownloader/u;->k(Z)Lcom/ss/android/socialbase/appdownloader/u;

    move-result-object p1

    const/4 p2, 0x5

    const-string v1, "retry_count"

    .line 114
    invoke-virtual {v3, v1, p2}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/u;->m(I)Lcom/ss/android/socialbase/appdownloader/u;

    move-result-object p1

    const-string p2, "backup_url_retry_count"

    .line 115
    invoke-virtual {v3, p2, v0}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/u;->p(I)Lcom/ss/android/socialbase/appdownloader/u;

    move-result-object p1

    .line 116
    invoke-virtual {p1, v5}, Lcom/ss/android/socialbase/appdownloader/u;->k(Z)Lcom/ss/android/socialbase/appdownloader/u;

    move-result-object p1

    const-string p2, "need_head_connection"

    .line 117
    invoke-virtual {v3, p2, v0}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result p2

    if-ne p2, v5, :cond_a

    const/4 p2, 0x1

    goto :goto_3

    :cond_a
    const/4 p2, 0x0

    :goto_3
    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/u;->r(Z)Lcom/ss/android/socialbase/appdownloader/u;

    move-result-object p1

    const-string p2, "need_https_to_http_retry"

    .line 118
    invoke-virtual {v3, p2, v0}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result p2

    if-ne p2, v5, :cond_b

    const/4 p2, 0x1

    goto :goto_4

    :cond_b
    const/4 p2, 0x0

    :goto_4
    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/u;->i(Z)Lcom/ss/android/socialbase/appdownloader/u;

    move-result-object p1

    const-string p2, "need_chunk_downgrade_retry"

    .line 119
    invoke-virtual {v3, p2, v5}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result p2

    if-ne p2, v5, :cond_c

    const/4 p2, 0x1

    goto :goto_5

    :cond_c
    const/4 p2, 0x0

    :goto_5
    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/u;->qv(Z)Lcom/ss/android/socialbase/appdownloader/u;

    move-result-object p1

    const-string p2, "need_retry_delay"

    .line 120
    invoke-virtual {v3, p2, v0}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result p2

    if-ne p2, v5, :cond_d

    const/4 p2, 0x1

    goto :goto_6

    :cond_d
    const/4 p2, 0x0

    :goto_6
    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/u;->n(Z)Lcom/ss/android/socialbase/appdownloader/u;

    move-result-object p1

    const-string p2, "retry_delay_time_array"

    .line 121
    invoke-virtual {v3, p2}, Lcom/ss/android/socialbase/downloader/n/vv;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/u;->wv(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/u;

    move-result-object p1

    const-string p2, "need_reuse_runnable"

    .line 122
    invoke-virtual {v3, p2, v0}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result p2

    if-ne p2, v5, :cond_e

    const/4 p2, 0x1

    goto :goto_7

    :cond_e
    const/4 p2, 0x0

    :goto_7
    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/u;->b(Z)Lcom/ss/android/socialbase/appdownloader/u;

    move-result-object p1

    .line 123
    invoke-virtual {p1, v6}, Lcom/ss/android/socialbase/appdownloader/u;->u(I)Lcom/ss/android/socialbase/appdownloader/u;

    move-result-object p1

    iget-object p2, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object p2, p2, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    .line 124
    invoke-interface {p2}, Lcom/ss/android/download/api/download/DownloadModel;->isAutoInstall()Z

    move-result p2

    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/u;->j(Z)Lcom/ss/android/socialbase/appdownloader/u;

    move-result-object p1

    iget-object p2, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object p2, p2, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    .line 125
    invoke-interface {p2}, Lcom/ss/android/download/api/download/DownloadModel;->distinctDir()Z

    move-result p2

    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/u;->q(Z)Lcom/ss/android/socialbase/appdownloader/u;

    move-result-object p1

    .line 126
    iget-object p2, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object p2, p2, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {p2}, Lcom/ss/android/download/api/download/DownloadModel;->getMimeType()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_f

    .line 127
    iget-object p2, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object p2, p2, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {p2}, Lcom/ss/android/download/api/download/DownloadModel;->getMimeType()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/u;->u(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/u;

    goto :goto_8

    :cond_f
    const-string p2, "application/vnd.android.package-archive"

    .line 128
    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/u;->u(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/u;

    :goto_8
    const-string p2, "notification_opt_2"

    .line 129
    invoke-virtual {v3, p2, v0}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result p2

    if-ne p2, v5, :cond_10

    .line 130
    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/appdownloader/u;->vv(Z)Lcom/ss/android/socialbase/appdownloader/u;

    .line 131
    invoke-virtual {p1, v5}, Lcom/ss/android/socialbase/appdownloader/u;->m(Z)Lcom/ss/android/socialbase/appdownloader/u;

    :cond_10
    const/4 p2, 0x0

    const-string v1, "clear_space_use_disk_handler"

    .line 132
    invoke-virtual {v3, v1, v0}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result v0

    if-ne v0, v5, :cond_11

    .line 133
    new-instance p2, Lcom/ss/android/downloadlib/addownload/p/vv;

    invoke-direct {p2}, Lcom/ss/android/downloadlib/addownload/p/vv;-><init>()V

    .line 134
    invoke-virtual {p1, p2}, Lcom/ss/android/socialbase/appdownloader/u;->vv(Lcom/ss/android/socialbase/downloader/depend/g;)Lcom/ss/android/socialbase/appdownloader/u;

    .line 135
    :cond_11
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v0, v0, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    instance-of v1, v0, Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    if-eqz v1, :cond_12

    check-cast v0, Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getTaskKey()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_12

    .line 136
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v0, v0, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    check-cast v0, Lcom/ss/android/downloadad/api/download/AdDownloadModel;

    invoke-virtual {v0}, Lcom/ss/android/downloadad/api/download/AdDownloadModel;->getTaskKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ss/android/socialbase/appdownloader/u;->i(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/u;

    .line 137
    :cond_12
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/qv;->p()Z

    move-result v1

    invoke-static {v0, v1, p1}, Lcom/ss/android/downloadlib/addownload/wv;->vv(Lcom/ss/android/downloadlib/addownload/m/o;ZLcom/ss/android/socialbase/appdownloader/u;)I

    move-result p1

    if-eqz p2, :cond_13

    .line 138
    invoke-virtual {p2, p1}, Lcom/ss/android/downloadlib/addownload/p/vv;->vv(I)V

    :cond_13
    return p1
.end method

.method vv()V
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/qv;->o:Lcom/ss/android/downloadlib/addownload/qv$m;

    if-nez v0, :cond_0

    .line 64
    new-instance v0, Lcom/ss/android/downloadlib/addownload/qv$3;

    invoke-direct {v0, p0}, Lcom/ss/android/downloadlib/addownload/qv$3;-><init>(Lcom/ss/android/downloadlib/addownload/qv;)V

    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/qv;->o:Lcom/ss/android/downloadlib/addownload/qv$m;

    :cond_0
    return-void
.end method

.method public vv(J)V
    .locals 1

    .line 2
    iput-wide p1, p0, Lcom/ss/android/downloadlib/addownload/qv;->m:J

    .line 3
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/m/u;->vv()Lcom/ss/android/downloadlib/addownload/m/u;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/ss/android/downloadlib/addownload/m/u;->o(J)Lcom/ss/android/downloadlib/addownload/m/o;

    move-result-object p1

    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    .line 4
    invoke-virtual {p1}, Lcom/ss/android/downloadlib/addownload/m/o;->l()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 5
    invoke-static {}, Lcom/ss/android/downloadlib/o/p;->vv()Lcom/ss/android/downloadlib/o/p;

    move-result-object p1

    const-string p2, "setAdId ModelBox notValid"

    invoke-virtual {p1, p2}, Lcom/ss/android/downloadlib/o/p;->vv(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public vv(Landroid/os/Message;)V
    .locals 0

    return-void
.end method

.method vv(Landroid/os/Message;Lcom/ss/android/download/api/model/DownloadShortInfo;Ljava/util/Map;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Message;",
            "Lcom/ss/android/download/api/model/DownloadShortInfo;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    if-eqz v1, :cond_e

    .line 32
    iget v3, v1, Landroid/os/Message;->what:I

    const/4 v4, 0x3

    if-eq v3, v4, :cond_0

    goto/16 :goto_2

    .line 33
    :cond_0
    iget-object v3, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v3, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 34
    iget v1, v1, Landroid/os/Message;->arg1:I

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v1, v7, :cond_2

    const/4 v8, 0x6

    if-eq v1, v8, :cond_2

    if-ne v1, v5, :cond_2

    .line 35
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getIsFirstDownload()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 36
    invoke-static {}, Lcom/ss/android/downloadlib/n;->vv()Lcom/ss/android/downloadlib/n;

    move-result-object v1

    iget-object v8, v0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v9, v8, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    iget-object v10, v8, Lcom/ss/android/downloadlib/addownload/m/o;->i:Lcom/ss/android/download/api/download/DownloadController;

    iget-object v8, v8, Lcom/ss/android/downloadlib/addownload/m/o;->p:Lcom/ss/android/download/api/download/DownloadEventConfig;

    invoke-virtual {v1, v9, v10, v8}, Lcom/ss/android/downloadlib/n;->vv(Lcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadController;Lcom/ss/android/download/api/download/DownloadEventConfig;)V

    .line 37
    invoke-virtual {v3, v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setFirstDownload(Z)V

    .line 38
    :cond_1
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/ss/android/downloadlib/i/vv;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 39
    :cond_2
    invoke-virtual {v2, v3}, Lcom/ss/android/download/api/model/DownloadShortInfo;->updateFromNewDownloadInfo(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 40
    invoke-static/range {p2 .. p2}, Lcom/ss/android/downloadlib/addownload/k;->vv(Lcom/ss/android/download/api/model/DownloadShortInfo;)Lcom/ss/android/download/api/model/DownloadShortInfo;

    .line 41
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v1

    invoke-static {v1}, Lcom/ss/android/socialbase/appdownloader/p;->vv(I)I

    move-result v1

    .line 42
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v8

    const-wide/16 v10, 0x0

    cmp-long v12, v8, v10

    if-lez v12, :cond_3

    .line 43
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v12

    const-wide/16 v14, 0x64

    mul-long v12, v12, v14

    div-long/2addr v12, v8

    long-to-int v6, v12

    :cond_3
    cmp-long v12, v8, v10

    if-gtz v12, :cond_4

    .line 44
    invoke-static {}, Lcom/ss/android/socialbase/downloader/n/vv;->p()Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v8

    const-string v9, "fix_click_start"

    invoke-virtual {v8, v9}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_5

    .line 45
    :cond_4
    iget-object v8, v0, Lcom/ss/android/downloadlib/addownload/qv;->o:Lcom/ss/android/downloadlib/addownload/qv$m;

    if-eqz v8, :cond_5

    .line 46
    invoke-interface {v8, v3}, Lcom/ss/android/downloadlib/addownload/qv$m;->vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    const/4 v8, 0x0

    .line 47
    iput-object v8, v0, Lcom/ss/android/downloadlib/addownload/qv;->o:Lcom/ss/android/downloadlib/addownload/qv$m;

    .line 48
    :cond_5
    invoke-static/range {p3 .. p3}, Lcom/ss/android/downloadlib/addownload/qv;->vv(Ljava/util/Map;)Ljava/util/List;

    move-result-object v8

    .line 49
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_6
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_e

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;

    if-eq v1, v7, :cond_c

    if-eq v1, v5, :cond_b

    if-eq v1, v4, :cond_7

    goto :goto_0

    .line 50
    :cond_7
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v10

    const/4 v11, -0x4

    if-ne v10, v11, :cond_8

    .line 51
    invoke-interface {v9}, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;->onIdle()V

    goto :goto_0

    .line 52
    :cond_8
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v10

    const/4 v11, -0x1

    if-ne v10, v11, :cond_9

    .line 53
    invoke-interface {v9, v2}, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;->onDownloadFailed(Lcom/ss/android/download/api/model/DownloadShortInfo;)V

    goto :goto_0

    .line 54
    :cond_9
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v10

    const/4 v11, -0x3

    if-ne v10, v11, :cond_6

    .line 55
    iget-object v10, v0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v10, v10, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-static {v10}, Lcom/ss/android/downloadlib/n/jh;->vv(Lcom/ss/android/download/api/download/DownloadModel;)Z

    move-result v10

    if-eqz v10, :cond_a

    .line 56
    invoke-interface {v9, v2}, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;->onInstalled(Lcom/ss/android/download/api/model/DownloadShortInfo;)V

    goto :goto_0

    .line 57
    :cond_a
    invoke-interface {v9, v2}, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;->onDownloadFinished(Lcom/ss/android/download/api/model/DownloadShortInfo;)V

    goto :goto_0

    .line 58
    :cond_b
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v10

    invoke-static {v10, v6}, Lcom/ss/android/downloadlib/addownload/k;->vv(II)I

    move-result v10

    invoke-interface {v9, v2, v10}, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;->onDownloadPaused(Lcom/ss/android/download/api/model/DownloadShortInfo;I)V

    goto :goto_0

    .line 59
    :cond_c
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v10

    const/16 v11, 0xb

    if-eq v10, v11, :cond_d

    .line 60
    invoke-virtual {v3}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v10

    invoke-static {v10, v6}, Lcom/ss/android/downloadlib/addownload/k;->vv(II)I

    move-result v10

    invoke-interface {v9, v2, v10}, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;->onDownloadActive(Lcom/ss/android/download/api/model/DownloadShortInfo;I)V

    goto :goto_0

    .line 61
    :cond_d
    invoke-static/range {p3 .. p3}, Lcom/ss/android/downloadlib/addownload/qv;->m(Ljava/util/Map;)Ljava/util/List;

    move-result-object v9

    .line 62
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_1

    :cond_e
    :goto_2
    return-void
.end method

.method vv(Lcom/ss/android/download/api/config/x;)V
    .locals 2
    .param p1    # Lcom/ss/android/download/api/config/x;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 25
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v0, v0, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getFilePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 26
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v0, v0, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadModel;->getFilePath()Ljava/lang/String;

    move-result-object v0

    .line 27
    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 28
    invoke-interface {p1}, Lcom/ss/android/download/api/config/x;->vv()V

    return-void

    .line 29
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 30
    invoke-interface {p1}, Lcom/ss/android/download/api/config/x;->vv()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 31
    :catch_0
    :cond_1
    new-instance v0, Lcom/ss/android/downloadlib/addownload/qv$1;

    invoke-direct {v0, p0, p1}, Lcom/ss/android/downloadlib/addownload/qv$1;-><init>(Lcom/ss/android/downloadlib/addownload/qv;Lcom/ss/android/download/api/config/x;)V

    invoke-direct {p0, v0}, Lcom/ss/android/downloadlib/addownload/qv;->m(Lcom/ss/android/download/api/config/x;)V

    return-void
.end method

.method public vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V
    .locals 1

    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lcom/ss/android/downloadlib/addownload/qv;->p:Z

    .line 7
    invoke-virtual {p0, p1}, Lcom/ss/android/downloadlib/addownload/qv;->m(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    return-void
.end method

.method vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Lcom/ss/android/download/api/model/DownloadShortInfo;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ss/android/socialbase/downloader/model/DownloadInfo;",
            "Lcom/ss/android/download/api/model/DownloadShortInfo;",
            "Ljava/util/List<",
            "Lcom/ss/android/download/api/download/DownloadStatusChangeListener;",
            ">;)V"
        }
    .end annotation

    .line 184
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_8

    if-nez p2, :cond_1

    goto/16 :goto_3

    :cond_1
    const/4 v0, 0x0

    .line 185
    :try_start_0
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_2

    .line 186
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v1

    const-wide/16 v3, 0x64

    mul-long v1, v1, v3

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTotalBytes()J

    move-result-wide v3

    div-long/2addr v1, v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    long-to-int v2, v1

    goto :goto_0

    :catch_0
    move-exception v1

    .line 187
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_2
    const/4 v2, 0x0

    :goto_0
    if-gez v2, :cond_3

    goto :goto_1

    :cond_3
    move v0, v2

    .line 188
    :goto_1
    invoke-virtual {p2, p1}, Lcom/ss/android/download/api/model/DownloadShortInfo;->updateFromNewDownloadInfo(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    .line 189
    invoke-static {p2}, Lcom/ss/android/downloadlib/addownload/k;->vv(Lcom/ss/android/download/api/model/DownloadShortInfo;)Lcom/ss/android/download/api/model/DownloadShortInfo;

    .line 190
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_4
    :goto_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;

    .line 191
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    :pswitch_0
    goto :goto_2

    .line 192
    :pswitch_1
    instance-of v2, v1, Lcom/ss/android/download/api/download/vv;

    if-nez v2, :cond_4

    .line 193
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v2

    invoke-static {v2, v0}, Lcom/ss/android/downloadlib/addownload/k;->vv(II)I

    move-result v2

    invoke-interface {v1, p2, v2}, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;->onDownloadActive(Lcom/ss/android/download/api/model/DownloadShortInfo;I)V

    goto :goto_2

    .line 194
    :pswitch_2
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v2

    invoke-static {v2, v0}, Lcom/ss/android/downloadlib/addownload/k;->vv(II)I

    move-result v2

    invoke-interface {v1, p2, v2}, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;->onDownloadActive(Lcom/ss/android/download/api/model/DownloadShortInfo;I)V

    goto :goto_2

    .line 195
    :pswitch_3
    invoke-interface {v1, p2}, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;->onDownloadFailed(Lcom/ss/android/download/api/model/DownloadShortInfo;)V

    goto :goto_2

    .line 196
    :pswitch_4
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v2

    invoke-static {v2, v0}, Lcom/ss/android/downloadlib/addownload/k;->vv(II)I

    move-result v2

    invoke-interface {v1, p2, v2}, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;->onDownloadPaused(Lcom/ss/android/download/api/model/DownloadShortInfo;I)V

    goto :goto_2

    .line 197
    :pswitch_5
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v2, v2, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-static {v2}, Lcom/ss/android/downloadlib/n/jh;->vv(Lcom/ss/android/download/api/download/DownloadModel;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 198
    invoke-interface {v1, p2}, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;->onInstalled(Lcom/ss/android/download/api/model/DownloadShortInfo;)V

    goto :goto_2

    .line 199
    :cond_5
    invoke-interface {v1, p2}, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;->onDownloadFinished(Lcom/ss/android/download/api/model/DownloadShortInfo;)V

    goto :goto_2

    .line 200
    :pswitch_6
    iget-object v2, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v2, v2, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-static {v2}, Lcom/ss/android/downloadlib/n/jh;->vv(Lcom/ss/android/download/api/download/DownloadModel;)Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v2, -0x3

    .line 201
    iput v2, p2, Lcom/ss/android/download/api/model/DownloadShortInfo;->status:I

    .line 202
    invoke-interface {v1, p2}, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;->onInstalled(Lcom/ss/android/download/api/model/DownloadShortInfo;)V

    goto :goto_2

    .line 203
    :cond_6
    invoke-interface {v1}, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;->onIdle()V

    goto :goto_2

    :cond_7
    return-void

    .line 204
    :cond_8
    :goto_3
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;

    .line 205
    invoke-interface {p2}, Lcom/ss/android/download/api/download/DownloadStatusChangeListener;->onIdle()V

    goto :goto_4

    :cond_9
    return-void

    nop

    :pswitch_data_0
    .packed-switch -0x4
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_6
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;Z)V
    .locals 5

    .line 165
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v0, v0, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    if-eqz v0, :cond_6

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_2

    .line 166
    :cond_0
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, -0x4

    if-ne v0, v1, :cond_1

    goto :goto_0

    .line 167
    :cond_1
    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v1, v1, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-static {v1}, Lcom/ss/android/downloadlib/addownload/wv;->vv(Lcom/ss/android/download/api/download/DownloadModel;)Z

    move-result v1

    if-nez v1, :cond_2

    if-eqz p2, :cond_4

    .line 168
    invoke-static {}, Lcom/ss/android/downloadlib/i/p;->vv()Lcom/ss/android/downloadlib/i/p;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ss/android/downloadlib/i/p;->p()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, -0x2

    if-eq v0, v1, :cond_2

    const/4 v1, -0x3

    if-ne v0, v1, :cond_4

    .line 169
    :cond_2
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object v1

    iget-wide v3, p0, Lcom/ss/android/downloadlib/addownload/qv;->m:J

    invoke-virtual {v1, v3, v4, v2}, Lcom/ss/android/downloadlib/i/vv;->vv(JI)V

    goto :goto_1

    .line 170
    :cond_3
    :goto_0
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object v1

    iget-wide v3, p0, Lcom/ss/android/downloadlib/addownload/qv;->m:J

    invoke-virtual {v1, v3, v4, v2}, Lcom/ss/android/downloadlib/i/vv;->vv(JI)V

    :cond_4
    :goto_1
    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto/16 :goto_2

    .line 171
    :pswitch_1
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object p2

    iget-wide v0, p0, Lcom/ss/android/downloadlib/addownload/qv;->m:J

    const/4 v2, 0x3

    invoke-virtual {p2, v0, v1, v2, p1}, Lcom/ss/android/downloadlib/i/vv;->vv(JILcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    return-void

    .line 172
    :pswitch_2
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object v0

    iget-wide v3, p0, Lcom/ss/android/downloadlib/addownload/qv;->m:J

    const/4 v1, 0x4

    invoke-virtual {v0, v3, v4, v1, p1}, Lcom/ss/android/downloadlib/i/vv;->vv(JILcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    if-eqz p2, :cond_6

    .line 173
    invoke-static {}, Lcom/ss/android/downloadlib/i/p;->vv()Lcom/ss/android/downloadlib/i/p;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ss/android/downloadlib/i/p;->m()Z

    move-result p1

    if-eqz p1, :cond_6

    .line 174
    invoke-static {}, Lcom/ss/android/downloadlib/i/p;->vv()Lcom/ss/android/downloadlib/i/p;

    move-result-object p1

    iget-wide v0, p0, Lcom/ss/android/downloadlib/addownload/qv;->m:J

    iget-object p2, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object p2, p2, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {p2}, Lcom/ss/android/download/api/download/DownloadModel;->getLogExtra()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v0, v1, p2}, Lcom/ss/android/downloadlib/i/p;->m(JLjava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_6

    .line 175
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object p1

    iget-wide v0, p0, Lcom/ss/android/downloadlib/addownload/qv;->m:J

    invoke-virtual {p1, v0, v1, v2}, Lcom/ss/android/downloadlib/i/vv;->vv(JI)V

    return-void

    .line 176
    :pswitch_3
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v0, v0, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-static {v0}, Lcom/ss/android/downloadlib/n/jh;->vv(Lcom/ss/android/download/api/download/DownloadModel;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 177
    invoke-static {}, Lcom/ss/android/downloadlib/o/p;->vv()Lcom/ss/android/downloadlib/o/p;

    move-result-object p1

    const-string p2, "SUCCESSED isInstalledApp"

    invoke-virtual {p1, p2}, Lcom/ss/android/downloadlib/o/p;->m(Ljava/lang/String;)V

    return-void

    .line 178
    :cond_5
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object v0

    iget-wide v3, p0, Lcom/ss/android/downloadlib/addownload/qv;->m:J

    const/4 v1, 0x5

    invoke-virtual {v0, v3, v4, v1, p1}, Lcom/ss/android/downloadlib/i/vv;->vv(JILcom/ss/android/socialbase/downloader/model/DownloadInfo;)V

    if-eqz p2, :cond_6

    .line 179
    invoke-static {}, Lcom/ss/android/downloadlib/i/p;->vv()Lcom/ss/android/downloadlib/i/p;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ss/android/downloadlib/i/p;->m()Z

    move-result p1

    if-eqz p1, :cond_6

    .line 180
    invoke-static {}, Lcom/ss/android/downloadlib/i/p;->vv()Lcom/ss/android/downloadlib/i/p;

    move-result-object p1

    iget-wide v0, p0, Lcom/ss/android/downloadlib/addownload/qv;->m:J

    iget-object p2, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object p2, p2, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-interface {p2}, Lcom/ss/android/download/api/download/DownloadModel;->getLogExtra()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v0, v1, p2}, Lcom/ss/android/downloadlib/i/p;->m(JLjava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_6

    .line 181
    invoke-static {}, Lcom/ss/android/downloadlib/i/vv;->vv()Lcom/ss/android/downloadlib/i/vv;

    move-result-object p1

    iget-wide v0, p0, Lcom/ss/android/downloadlib/addownload/qv;->m:J

    invoke-virtual {p1, v0, v1, v2}, Lcom/ss/android/downloadlib/i/vv;->vv(JI)V

    goto :goto_2

    .line 182
    :pswitch_4
    invoke-virtual {p0}, Lcom/ss/android/downloadlib/addownload/qv;->vv()V

    .line 183
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/m/u;->vv()Lcom/ss/android/downloadlib/addownload/m/u;

    move-result-object p2

    new-instance v0, Lcom/ss/android/downloadad/api/vv/m;

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v2, v1, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    iget-object v3, v1, Lcom/ss/android/downloadlib/addownload/m/o;->p:Lcom/ss/android/download/api/download/DownloadEventConfig;

    iget-object v1, v1, Lcom/ss/android/downloadlib/addownload/m/o;->i:Lcom/ss/android/download/api/download/DownloadController;

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result p1

    invoke-direct {v0, v2, v3, v1, p1}, Lcom/ss/android/downloadad/api/vv/m;-><init>(Lcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadEventConfig;Lcom/ss/android/download/api/download/DownloadController;I)V

    invoke-virtual {p2, v0}, Lcom/ss/android/downloadlib/addownload/m/u;->vv(Lcom/ss/android/downloadad/api/vv/m;)V

    :cond_6
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch -0x4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public vv(I)Z
    .locals 4

    .line 20
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v0, v0, Lcom/ss/android/downloadlib/addownload/m/o;->i:Lcom/ss/android/download/api/download/DownloadController;

    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadController;->getDownloadMode()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    if-ne p1, v1, :cond_0

    return v2

    .line 21
    :cond_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object v0, v0, Lcom/ss/android/downloadlib/addownload/m/o;->i:Lcom/ss/android/download/api/download/DownloadController;

    invoke-interface {v0}, Lcom/ss/android/download/api/download/DownloadController;->getDownloadMode()I

    move-result v0

    const/4 v3, 0x0

    if-ne v0, v1, :cond_1

    if-ne p1, v2, :cond_1

    .line 22
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->wv()Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "disable_lp_if_market"

    invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p1

    if-ne p1, v2, :cond_1

    return v2

    :cond_1
    return v3
.end method

.method public vv(ILcom/ss/android/download/api/download/DownloadModel;)Z
    .locals 1

    .line 23
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/u/o;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/ss/android/downloadlib/addownload/qv;->vv(I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {p2}, Lcom/ss/android/downloadlib/n/jh;->vv(Lcom/ss/android/download/api/download/DownloadModel;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method vv(Landroid/content/Context;IZ)Z
    .locals 3

    .line 8
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object p1, p1, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    invoke-static {p1}, Lcom/ss/android/downloadlib/n/jh;->vv(Lcom/ss/android/download/api/download/DownloadModel;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 9
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/m/u;->vv()Lcom/ss/android/downloadlib/addownload/m/u;

    move-result-object p1

    iget-object p2, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-wide p2, p2, Lcom/ss/android/downloadlib/addownload/m/o;->vv:J

    invoke-virtual {p1, p2, p3}, Lcom/ss/android/downloadlib/addownload/m/u;->i(J)Lcom/ss/android/downloadad/api/vv/m;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 10
    invoke-static {}, Lcom/ss/android/socialbase/downloader/notification/m;->vv()Lcom/ss/android/socialbase/downloader/notification/m;

    move-result-object p2

    invoke-virtual {p1}, Lcom/ss/android/downloadad/api/vv/m;->la()I

    move-result p1

    invoke-virtual {p2, p1}, Lcom/ss/android/socialbase/downloader/notification/m;->u(I)V

    .line 11
    :cond_0
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    invoke-static {p1}, Lcom/ss/android/downloadlib/m/vv;->vv(Lcom/ss/android/downloadlib/addownload/m/o;)Z

    move-result p1

    return p1

    .line 12
    :cond_1
    invoke-virtual {p0, p2}, Lcom/ss/android/downloadlib/addownload/qv;->vv(I)Z

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object p1, p1, Lcom/ss/android/downloadlib/addownload/m/o;->m:Lcom/ss/android/download/api/download/DownloadModel;

    .line 13
    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadModel;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_4

    .line 14
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->wv()Lorg/json/JSONObject;

    move-result-object p1

    const-string v2, "disable_market"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p1

    if-eq p1, v1, :cond_4

    .line 15
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    invoke-static {p1, p2}, Lcom/ss/android/downloadlib/m/vv;->vv(Lcom/ss/android/downloadlib/addownload/m/o;I)Z

    move-result p1

    if-eqz p1, :cond_2

    return v1

    .line 16
    :cond_2
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/qv;->i:Lcom/ss/android/downloadlib/addownload/o;

    invoke-virtual {p1}, Lcom/ss/android/downloadlib/addownload/o;->wv()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/qv;->i:Lcom/ss/android/downloadlib/addownload/o;

    invoke-virtual {p1, v1}, Lcom/ss/android/downloadlib/addownload/o;->i(Z)Z

    move-result p1

    if-eqz p1, :cond_3

    return v1

    :cond_3
    return v0

    :cond_4
    if-eqz p3, :cond_5

    .line 17
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object p1, p1, Lcom/ss/android/downloadlib/addownload/m/o;->i:Lcom/ss/android/download/api/download/DownloadController;

    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadController;->getDownloadMode()I

    move-result p1

    const/4 p2, 0x4

    if-ne p1, p2, :cond_5

    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/qv;->i:Lcom/ss/android/downloadlib/addownload/o;

    .line 18
    invoke-virtual {p1}, Lcom/ss/android/downloadlib/addownload/o;->o()Z

    move-result p1

    if-nez p1, :cond_5

    .line 19
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/qv;->i:Lcom/ss/android/downloadlib/addownload/o;

    invoke-virtual {p1, v1}, Lcom/ss/android/downloadlib/addownload/o;->p(Z)V

    return v1

    :cond_5
    return v0
.end method

.method vv(Z)Z
    .locals 1

    if-nez p1, :cond_0

    .line 24
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/qv;->vv:Lcom/ss/android/downloadlib/addownload/m/o;

    iget-object p1, p1, Lcom/ss/android/downloadlib/addownload/m/o;->i:Lcom/ss/android/download/api/download/DownloadController;

    invoke-interface {p1}, Lcom/ss/android/download/api/download/DownloadController;->getDownloadMode()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
