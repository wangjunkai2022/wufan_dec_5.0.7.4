.class public Lcom/ss/android/downloadlib/m/wv;
.super Ljava/lang/Object;


# direct methods
.method public static vv(Lcom/ss/android/downloadad/api/vv/vv;)Z
    .locals 2
    .param p0    # Lcom/ss/android/downloadad/api/vv/vv;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/u/o;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-ge v0, v1, :cond_0

    .line 2
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->jh()Lcom/ss/android/download/api/config/m;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->jh()Lcom/ss/android/download/api/config/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/ss/android/download/api/config/m;->vv()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-static {p0}, Lcom/ss/android/downloadlib/n/o;->vv(Lcom/ss/android/downloadad/api/vv/vv;)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v0

    const-string v1, "invoke_app_form_background_switch"

    invoke-virtual {v0, v1}, Lcom/ss/android/socialbase/downloader/n/vv;->m(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 5
    invoke-interface {p0}, Lcom/ss/android/downloadad/api/vv/vv;->d()Z

    move-result p0

    if-eqz p0, :cond_0

    return v1

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
