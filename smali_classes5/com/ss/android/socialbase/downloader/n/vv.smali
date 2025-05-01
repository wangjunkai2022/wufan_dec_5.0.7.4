.class public Lcom/ss/android/socialbase/downloader/n/vv;
.super Ljava/lang/Object;


# static fields
.field private static i:Lorg/json/JSONObject;

.field private static final m:Lcom/ss/android/socialbase/downloader/n/vv;

.field private static n:Lcom/ss/android/socialbase/downloader/n/vv;

.field private static o:Ljava/lang/Boolean;

.field private static p:Lorg/json/JSONObject;

.field private static u:Z

.field private static final vv:Lcom/ss/android/socialbase/downloader/wv/qv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ss/android/socialbase/downloader/wv/qv<",
            "Ljava/lang/Integer;",
            "Lcom/ss/android/socialbase/downloader/n/vv;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private b:I

.field private final k:Ljava/lang/Boolean;

.field private final qv:Lorg/json/JSONObject;

.field private final wv:Lorg/json/JSONObject;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/ss/android/socialbase/downloader/wv/qv;

    const/16 v1, 0x10

    invoke-direct {v0, v1, v1}, Lcom/ss/android/socialbase/downloader/wv/qv;-><init>(II)V

    sput-object v0, Lcom/ss/android/socialbase/downloader/n/vv;->vv:Lcom/ss/android/socialbase/downloader/wv/qv;

    .line 2
    new-instance v0, Lcom/ss/android/socialbase/downloader/n/vv;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ss/android/socialbase/downloader/n/vv;-><init>(Lorg/json/JSONObject;)V

    sput-object v0, Lcom/ss/android/socialbase/downloader/n/vv;->m:Lcom/ss/android/socialbase/downloader/n/vv;

    .line 3
    invoke-static {}, Lcom/ss/android/socialbase/downloader/n/vv;->vv()V

    return-void
.end method

.method private constructor <init>(Lorg/json/JSONObject;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/n/vv;->qv:Lorg/json/JSONObject;

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    const-string v1, "bugfix"

    .line 3
    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/n/vv;->u(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 4
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string v1, "default"

    .line 5
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/n/vv;->u(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    const/4 v0, 0x0

    .line 6
    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :cond_1
    move-object v3, v0

    move-object v0, p1

    move-object p1, v3

    goto :goto_0

    :cond_2
    move-object p1, v0

    .line 7
    :goto_0
    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/n/vv;->wv:Lorg/json/JSONObject;

    .line 8
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/n/vv;->k:Ljava/lang/Boolean;

    return-void
.end method

.method private static m(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/socialbase/downloader/n/vv;
    .locals 1

    .line 19
    sget-boolean v0, Lcom/ss/android/socialbase/downloader/n/vv;->u:Z

    if-eqz v0, :cond_0

    .line 20
    sget-object p0, Lcom/ss/android/socialbase/downloader/n/vv;->m:Lcom/ss/android/socialbase/downloader/n/vv;

    return-object p0

    .line 21
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getDownloadSettingString()Ljava/lang/String;

    move-result-object p0

    .line 22
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 23
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 24
    new-instance p0, Lcom/ss/android/socialbase/downloader/n/vv;

    invoke-direct {p0, v0}, Lcom/ss/android/socialbase/downloader/n/vv;-><init>(Lorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 26
    :cond_1
    sget-object p0, Lcom/ss/android/socialbase/downloader/n/vv;->m:Lcom/ss/android/socialbase/downloader/n/vv;

    return-object p0
.end method

.method public static m()Lorg/json/JSONObject;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->c()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static m(I)V
    .locals 1

    .line 13
    sget-object v0, Lcom/ss/android/socialbase/downloader/n/vv;->n:Lcom/ss/android/socialbase/downloader/n/vv;

    if-eqz v0, :cond_0

    .line 14
    iget v0, v0, Lcom/ss/android/socialbase/downloader/n/vv;->b:I

    if-ne v0, p0, :cond_0

    const/4 v0, 0x0

    .line 15
    sput-object v0, Lcom/ss/android/socialbase/downloader/n/vv;->n:Lcom/ss/android/socialbase/downloader/n/vv;

    .line 16
    :cond_0
    sget-object v0, Lcom/ss/android/socialbase/downloader/n/vv;->vv:Lcom/ss/android/socialbase/downloader/wv/qv;

    monitor-enter v0

    .line 17
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static p()Lcom/ss/android/socialbase/downloader/n/vv;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/n/vv;->m:Lcom/ss/android/socialbase/downloader/n/vv;

    return-object v0
.end method

.method private static p(I)Lcom/ss/android/socialbase/downloader/n/vv;
    .locals 1

    .line 3
    sget-boolean v0, Lcom/ss/android/socialbase/downloader/n/vv;->u:Z

    if-eqz v0, :cond_0

    .line 4
    sget-object p0, Lcom/ss/android/socialbase/downloader/n/vv;->m:Lcom/ss/android/socialbase/downloader/n/vv;

    return-object p0

    .line 5
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->ky()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 6
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getInstance(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/downloader/Downloader;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/ss/android/socialbase/downloader/downloader/Downloader;->getDownloadInfo(I)Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 7
    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/n/vv;->m(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object p0

    return-object p0

    .line 8
    :cond_1
    sget-object p0, Lcom/ss/android/socialbase/downloader/n/vv;->m:Lcom/ss/android/socialbase/downloader/n/vv;

    return-object p0
.end method

.method public static u(Ljava/lang/String;)Z
    .locals 2

    .line 1
    sget-object v0, Lcom/ss/android/socialbase/downloader/n/vv;->p:Lorg/json/JSONObject;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    return v0

    :cond_0
    return v1
.end method

.method public static vv(I)Lcom/ss/android/socialbase/downloader/n/vv;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const/4 v0, 0x0

    .line 12
    invoke-static {p0, v0}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(ILcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object p0

    return-object p0
.end method

.method private static vv(ILcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/socialbase/downloader/n/vv;
    .locals 2

    .line 15
    sget-object v0, Lcom/ss/android/socialbase/downloader/n/vv;->n:Lcom/ss/android/socialbase/downloader/n/vv;

    if-eqz v0, :cond_0

    .line 16
    iget v1, v0, Lcom/ss/android/socialbase/downloader/n/vv;->b:I

    if-ne v1, p0, :cond_0

    return-object v0

    .line 17
    :cond_0
    sget-object v0, Lcom/ss/android/socialbase/downloader/n/vv;->vv:Lcom/ss/android/socialbase/downloader/wv/qv;

    monitor-enter v0

    .line 18
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ss/android/socialbase/downloader/n/vv;

    .line 19
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v1, :cond_2

    if-nez p1, :cond_1

    .line 20
    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/n/vv;->p(I)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/n/vv;->m(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object p1

    :goto_0
    move-object v1, p1

    .line 21
    monitor-enter v0

    .line 22
    :try_start_1
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    monitor-exit v0

    goto :goto_1

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0

    .line 24
    :cond_2
    :goto_1
    iput p0, v1, Lcom/ss/android/socialbase/downloader/n/vv;->b:I

    .line 25
    sput-object v1, Lcom/ss/android/socialbase/downloader/n/vv;->n:Lcom/ss/android/socialbase/downloader/n/vv;

    return-object v1

    :catchall_1
    move-exception p0

    .line 26
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p0
.end method

.method public static vv(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/socialbase/downloader/n/vv;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    if-nez p0, :cond_0

    .line 13
    sget-object p0, Lcom/ss/android/socialbase/downloader/n/vv;->m:Lcom/ss/android/socialbase/downloader/n/vv;

    return-object p0

    .line 14
    :cond_0
    invoke-virtual {p0}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v0

    invoke-static {v0, p0}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(ILcom/ss/android/socialbase/downloader/model/DownloadInfo;)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object p0

    return-object p0
.end method

.method public static vv(Lorg/json/JSONObject;)Lcom/ss/android/socialbase/downloader/n/vv;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    if-eqz p0, :cond_4

    .line 40
    invoke-static {}, Lcom/ss/android/socialbase/downloader/n/vv;->m()Lorg/json/JSONObject;

    move-result-object v0

    if-eq p0, v0, :cond_4

    sget-boolean v0, Lcom/ss/android/socialbase/downloader/n/vv;->u:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 41
    :cond_0
    sget-object v0, Lcom/ss/android/socialbase/downloader/n/vv;->n:Lcom/ss/android/socialbase/downloader/n/vv;

    if-eqz v0, :cond_1

    .line 42
    iget-object v1, v0, Lcom/ss/android/socialbase/downloader/n/vv;->qv:Lorg/json/JSONObject;

    if-ne v1, p0, :cond_1

    return-object v0

    .line 43
    :cond_1
    sget-object v0, Lcom/ss/android/socialbase/downloader/n/vv;->vv:Lcom/ss/android/socialbase/downloader/wv/qv;

    monitor-enter v0

    .line 44
    :try_start_0
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ss/android/socialbase/downloader/n/vv;

    .line 45
    iget-object v3, v2, Lcom/ss/android/socialbase/downloader/n/vv;->qv:Lorg/json/JSONObject;

    if-ne v3, p0, :cond_2

    .line 46
    sput-object v2, Lcom/ss/android/socialbase/downloader/n/vv;->n:Lcom/ss/android/socialbase/downloader/n/vv;

    .line 47
    monitor-exit v0

    return-object v2

    .line 48
    :cond_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    new-instance v0, Lcom/ss/android/socialbase/downloader/n/vv;

    invoke-direct {v0, p0}, Lcom/ss/android/socialbase/downloader/n/vv;-><init>(Lorg/json/JSONObject;)V

    .line 50
    sput-object v0, Lcom/ss/android/socialbase/downloader/n/vv;->n:Lcom/ss/android/socialbase/downloader/n/vv;

    return-object v0

    :catchall_0
    move-exception p0

    .line 51
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0

    .line 52
    :cond_4
    :goto_0
    sget-object p0, Lcom/ss/android/socialbase/downloader/n/vv;->m:Lcom/ss/android/socialbase/downloader/n/vv;

    return-object p0
.end method

.method public static vv()V
    .locals 6

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->c()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "disable_task_setting"

    const/4 v2, 0x0

    .line 2
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    sput-boolean v1, Lcom/ss/android/socialbase/downloader/n/vv;->u:Z

    const-string v1, "disabled_task_keys"

    .line 3
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    sput-object v1, Lcom/ss/android/socialbase/downloader/n/vv;->p:Lorg/json/JSONObject;

    const-string v1, "bugfix"

    .line 4
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    const-string v4, "default"

    .line 5
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 6
    invoke-virtual {v0, v4, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    if-ne v1, v3, :cond_1

    const/4 v2, 0x1

    :cond_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 7
    :cond_2
    sput-object v0, Lcom/ss/android/socialbase/downloader/n/vv;->i:Lorg/json/JSONObject;

    .line 8
    sput-object v1, Lcom/ss/android/socialbase/downloader/n/vv;->o:Ljava/lang/Boolean;

    return-void
.end method

.method public static vv(ILorg/json/JSONObject;)V
    .locals 5

    if-eqz p1, :cond_5

    .line 53
    invoke-static {}, Lcom/ss/android/socialbase/downloader/n/vv;->m()Lorg/json/JSONObject;

    move-result-object v0

    if-eq p1, v0, :cond_5

    sget-boolean v0, Lcom/ss/android/socialbase/downloader/n/vv;->u:Z

    if-eqz v0, :cond_0

    goto :goto_1

    .line 54
    :cond_0
    sget-object v0, Lcom/ss/android/socialbase/downloader/n/vv;->vv:Lcom/ss/android/socialbase/downloader/wv/qv;

    monitor-enter v0

    .line 55
    :try_start_0
    sget-object v1, Lcom/ss/android/socialbase/downloader/n/vv;->n:Lcom/ss/android/socialbase/downloader/n/vv;

    if-eqz v1, :cond_1

    .line 56
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/n/vv;->qv:Lorg/json/JSONObject;

    if-ne v2, p1, :cond_1

    .line 57
    iput p0, v1, Lcom/ss/android/socialbase/downloader/n/vv;->b:I

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 58
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ss/android/socialbase/downloader/n/vv;

    .line 59
    iget-object v4, v3, Lcom/ss/android/socialbase/downloader/n/vv;->qv:Lorg/json/JSONObject;

    if-ne v4, p1, :cond_2

    .line 60
    iput p0, v3, Lcom/ss/android/socialbase/downloader/n/vv;->b:I

    move-object v1, v3

    :cond_3
    if-nez v1, :cond_4

    .line 61
    new-instance v1, Lcom/ss/android/socialbase/downloader/n/vv;

    invoke-direct {v1, p1}, Lcom/ss/android/socialbase/downloader/n/vv;-><init>(Lorg/json/JSONObject;)V

    .line 62
    iput p0, v1, Lcom/ss/android/socialbase/downloader/n/vv;->b:I

    .line 63
    :cond_4
    sput-object v1, Lcom/ss/android/socialbase/downloader/n/vv;->n:Lcom/ss/android/socialbase/downloader/n/vv;

    .line 64
    :goto_0
    sget-object p1, Lcom/ss/android/socialbase/downloader/n/vv;->vv:Lcom/ss/android/socialbase/downloader/wv/qv;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p1, p0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_5
    :goto_1
    return-void
.end method

.method public static vv(Ljava/lang/String;Z)V
    .locals 1

    .line 9
    :try_start_0
    sget-object v0, Lcom/ss/android/socialbase/downloader/n/vv;->i:Lorg/json/JSONObject;

    if-nez v0, :cond_0

    .line 10
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    sput-object v0, Lcom/ss/android/socialbase/downloader/n/vv;->i:Lorg/json/JSONObject;

    .line 11
    :cond_0
    sget-object v0, Lcom/ss/android/socialbase/downloader/n/vv;->i:Lorg/json/JSONObject;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method


# virtual methods
.method public i(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/n/vv;->qv:Lorg/json/JSONObject;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/n/vv;->u(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/n/vv;->qv:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/n/vv;->m()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public m(Ljava/lang/String;)I
    .locals 1

    const/4 v0, 0x0

    .line 12
    invoke-virtual {p0, p1, v0}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public m(Ljava/lang/String;Z)Z
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/n/vv;->wv:Lorg/json/JSONObject;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/n/vv;->u(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 3
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/n/vv;->wv:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/n/vv;->wv:Lorg/json/JSONObject;

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p1

    if-ne p1, v2, :cond_0

    return v2

    :cond_0
    return v1

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/n/vv;->k:Ljava/lang/Boolean;

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    .line 7
    :cond_2
    sget-object v0, Lcom/ss/android/socialbase/downloader/n/vv;->i:Lorg/json/JSONObject;

    if-eqz v0, :cond_5

    .line 8
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 9
    sget-object v0, Lcom/ss/android/socialbase/downloader/n/vv;->i:Lorg/json/JSONObject;

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p1

    if-ne p1, v2, :cond_3

    return v2

    :cond_3
    return v1

    .line 10
    :cond_4
    sget-object p1, Lcom/ss/android/socialbase/downloader/n/vv;->o:Ljava/lang/Boolean;

    if-eqz p1, :cond_5

    .line 11
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    :cond_5
    return p2
.end method

.method public o(Ljava/lang/String;)Lorg/json/JSONArray;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/n/vv;->qv:Lorg/json/JSONObject;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/n/vv;->u(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/n/vv;->qv:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/n/vv;->m()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    return-object p1
.end method

.method public p(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, ""

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public vv(Ljava/lang/String;D)D
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/n/vv;->qv:Lorg/json/JSONObject;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/n/vv;->u(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 35
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/n/vv;->qv:Lorg/json/JSONObject;

    invoke-virtual {v0, p1, p2, p3}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide p1

    return-wide p1

    .line 36
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/n/vv;->m()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide p1

    return-wide p1
.end method

.method public vv(Ljava/lang/String;I)I
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/n/vv;->qv:Lorg/json/JSONObject;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/n/vv;->u(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 29
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/n/vv;->qv:Lorg/json/JSONObject;

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p1

    return p1

    .line 30
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/n/vv;->m()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public vv(Ljava/lang/String;J)J
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/n/vv;->qv:Lorg/json/JSONObject;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/n/vv;->u(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 32
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/n/vv;->qv:Lorg/json/JSONObject;

    invoke-virtual {v0, p1, p2, p3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide p1

    return-wide p1

    .line 33
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/n/vv;->m()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public vv(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/n/vv;->qv:Lorg/json/JSONObject;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/n/vv;->u(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 38
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/n/vv;->qv:Lorg/json/JSONObject;

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 39
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/n/vv;->m()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public vv(Ljava/lang/String;)Z
    .locals 1

    const/4 v0, 0x0

    .line 27
    invoke-virtual {p0, p1, v0}, Lcom/ss/android/socialbase/downloader/n/vv;->m(Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method
