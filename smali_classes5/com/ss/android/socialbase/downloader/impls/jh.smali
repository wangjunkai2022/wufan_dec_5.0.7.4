.class public Lcom/ss/android/socialbase/downloader/impls/jh;
.super Ljava/lang/Object;


# static fields
.field private static volatile m:Lcom/ss/android/socialbase/downloader/downloader/r;

.field private static volatile vv:Lcom/ss/android/socialbase/downloader/downloader/r;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static vv(Z)Lcom/ss/android/socialbase/downloader/downloader/r;
    .locals 1

    .line 1
    const-class v0, Lcom/ss/android/socialbase/downloader/impls/jh;

    if-eqz p0, :cond_2

    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->e()Z

    move-result p0

    if-eqz p0, :cond_2

    .line 2
    sget-object p0, Lcom/ss/android/socialbase/downloader/impls/jh;->m:Lcom/ss/android/socialbase/downloader/downloader/r;

    if-nez p0, :cond_1

    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object p0, Lcom/ss/android/socialbase/downloader/impls/jh;->m:Lcom/ss/android/socialbase/downloader/downloader/r;

    if-nez p0, :cond_0

    .line 5
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->ju()Lcom/ss/android/socialbase/downloader/downloader/p$vv;

    move-result-object p0

    invoke-interface {p0}, Lcom/ss/android/socialbase/downloader/downloader/p$vv;->m()Lcom/ss/android/socialbase/downloader/downloader/r;

    move-result-object p0

    sput-object p0, Lcom/ss/android/socialbase/downloader/impls/jh;->m:Lcom/ss/android/socialbase/downloader/downloader/r;

    .line 6
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 7
    :cond_1
    :goto_0
    sget-object p0, Lcom/ss/android/socialbase/downloader/impls/jh;->m:Lcom/ss/android/socialbase/downloader/downloader/r;

    return-object p0

    .line 8
    :cond_2
    sget-object p0, Lcom/ss/android/socialbase/downloader/impls/jh;->vv:Lcom/ss/android/socialbase/downloader/downloader/r;

    if-nez p0, :cond_4

    .line 9
    monitor-enter v0

    .line 10
    :try_start_1
    sget-object p0, Lcom/ss/android/socialbase/downloader/impls/jh;->vv:Lcom/ss/android/socialbase/downloader/downloader/r;

    if-nez p0, :cond_3

    .line 11
    new-instance p0, Lcom/ss/android/socialbase/downloader/impls/j;

    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/impls/j;-><init>()V

    sput-object p0, Lcom/ss/android/socialbase/downloader/impls/jh;->vv:Lcom/ss/android/socialbase/downloader/downloader/r;

    .line 12
    :cond_3
    monitor-exit v0

    goto :goto_1

    :catchall_1
    move-exception p0

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p0

    .line 13
    :cond_4
    :goto_1
    sget-object p0, Lcom/ss/android/socialbase/downloader/impls/jh;->vv:Lcom/ss/android/socialbase/downloader/downloader/r;

    return-object p0
.end method
