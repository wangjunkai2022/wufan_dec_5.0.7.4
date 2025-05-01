.class public Lcom/ss/android/downloadlib/m/p;
.super Ljava/lang/Object;


# direct methods
.method public static vv(Lcom/ss/android/downloadad/api/vv/m;Lcom/ss/android/downloadlib/guide/install/vv;)V
    .locals 3
    .param p1    # Lcom/ss/android/downloadlib/guide/install/vv;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/downloader/vv/vv;->vv()Lcom/ss/android/socialbase/downloader/vv/vv;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/vv/vv;->m()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-lt v1, v2, :cond_0

    .line 3
    invoke-static {}, Lcom/ss/android/downloadlib/n/jh;->p()V

    .line 4
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/vv/vv;->vv()Lcom/ss/android/socialbase/downloader/vv/vv;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/vv/vv;->m()Z

    move-result v1

    if-nez v0, :cond_1

    if-eqz v1, :cond_1

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    .line 5
    invoke-virtual {p0, v0}, Lcom/ss/android/downloadad/api/vv/m;->jh(Z)V

    .line 6
    :cond_1
    invoke-interface {p1}, Lcom/ss/android/downloadlib/guide/install/vv;->vv()V

    .line 7
    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v0

    const-string v2, "AppInstallOptimiseHelper-->isAppForegroundSecond:::"

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "AppInstallOptimiseHelper"

    invoke-static {v2, v0}, Lcom/ss/android/socialbase/downloader/p/vv;->m(Ljava/lang/String;Ljava/lang/String;)V

    if-nez v1, :cond_2

    .line 8
    invoke-static {}, Lcom/ss/android/socialbase/downloader/vv/vv;->vv()Lcom/ss/android/socialbase/downloader/vv/vv;

    move-result-object v0

    new-instance v1, Lcom/ss/android/downloadlib/m/p$1;

    invoke-direct {v1, p0, p1}, Lcom/ss/android/downloadlib/m/p$1;-><init>(Lcom/ss/android/downloadad/api/vv/m;Lcom/ss/android/downloadlib/guide/install/vv;)V

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/vv/vv;->vv(Lcom/ss/android/socialbase/downloader/vv/vv$vv;)V

    :cond_2
    return-void
.end method
