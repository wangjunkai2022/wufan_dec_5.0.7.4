.class public Lcom/ss/android/downloadlib/m/u;
.super Ljava/lang/Object;


# static fields
.field private static vv:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lcom/ss/android/downloadlib/m/u;->vv:Landroid/os/Handler;

    return-void
.end method

.method public static i(Lcom/ss/android/downloadad/api/vv/m;)Z
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/ss/android/downloadlib/n/o;->vv(Lcom/ss/android/downloadad/api/vv/vv;)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object p0

    const-string v0, "app_link_opt_dialog_switch"

    invoke-virtual {p0, v0}, Lcom/ss/android/socialbase/downloader/n/vv;->m(Ljava/lang/String;)I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static k(Lcom/ss/android/downloadad/api/vv/m;)I
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/ss/android/downloadlib/n/o;->vv(Lcom/ss/android/downloadad/api/vv/vv;)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object p0

    const-string v0, "app_link_check_count"

    const/16 v1, 0xa

    invoke-virtual {p0, v0, v1}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result p0

    return p0
.end method

.method private static m(Lcom/ss/android/downloadad/api/vv/m;I)V
    .locals 3
    .param p0    # Lcom/ss/android/downloadad/api/vv/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    if-gtz p1, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-static {p0}, Lcom/ss/android/downloadlib/m/u;->wv(Lcom/ss/android/downloadad/api/vv/m;)I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    .line 2
    invoke-static {}, Lcom/ss/android/downloadlib/i;->vv()Lcom/ss/android/downloadlib/i;

    move-result-object v1

    new-instance v2, Lcom/ss/android/downloadlib/m/u$2;

    invoke-direct {v2, p0, p1}, Lcom/ss/android/downloadlib/m/u$2;-><init>(Lcom/ss/android/downloadad/api/vv/m;I)V

    int-to-long p0, v0

    invoke-virtual {v1, v2, p0, p1}, Lcom/ss/android/downloadlib/i;->vv(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public static m(Lcom/ss/android/downloadad/api/vv/m;)Z
    .locals 1

    .line 3
    invoke-static {p0}, Lcom/ss/android/downloadlib/n/o;->vv(Lcom/ss/android/downloadad/api/vv/vv;)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object p0

    const-string v0, "app_link_opt_install_switch"

    invoke-virtual {p0, v0}, Lcom/ss/android/socialbase/downloader/n/vv;->m(Ljava/lang/String;)I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method static synthetic n(Lcom/ss/android/downloadad/api/vv/m;)I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/ss/android/downloadlib/m/u;->k(Lcom/ss/android/downloadad/api/vv/m;)I

    move-result p0

    return p0
.end method

.method public static o(Lcom/ss/android/downloadad/api/vv/m;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0xbb8

    return-wide v0

    .line 1
    :cond_0
    invoke-static {p0}, Lcom/ss/android/downloadlib/n/o;->vv(Lcom/ss/android/downloadad/api/vv/vv;)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object p0

    const/4 v0, 0x3

    const-string v1, "app_link_opt_back_time_limit"

    invoke-virtual {p0, v1, v0}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result p0

    mul-int/lit16 p0, p0, 0x3e8

    int-to-long v0, p0

    return-wide v0
.end method

.method public static p(Lcom/ss/android/downloadad/api/vv/m;)Z
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/ss/android/downloadlib/n/o;->vv(Lcom/ss/android/downloadad/api/vv/vv;)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object p0

    const-string v0, "app_link_opt_invoke_switch"

    invoke-virtual {p0, v0}, Lcom/ss/android/socialbase/downloader/n/vv;->m(Ljava/lang/String;)I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static qv(Lcom/ss/android/downloadad/api/vv/m;)J
    .locals 3

    .line 1
    invoke-static {p0}, Lcom/ss/android/downloadlib/n/o;->vv(Lcom/ss/android/downloadad/api/vv/vv;)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object p0

    const-string v0, "app_link_check_timeout"

    const-wide/32 v1, 0x493e0

    invoke-virtual {p0, v0, v1, v2}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic u(Lcom/ss/android/downloadad/api/vv/m;)J
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/ss/android/downloadlib/m/u;->qv(Lcom/ss/android/downloadad/api/vv/m;)J

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic vv(Lcom/ss/android/downloadad/api/vv/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/ss/android/downloadlib/m/u;->m(Lcom/ss/android/downloadad/api/vv/m;I)V

    return-void
.end method

.method public static vv(Lcom/ss/android/downloadad/api/vv/m;Lcom/ss/android/downloadlib/m/qv;)V
    .locals 4
    .param p1    # Lcom/ss/android/downloadlib/m/qv;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    invoke-static {}, Lcom/ss/android/socialbase/downloader/vv/vv;->vv()Lcom/ss/android/socialbase/downloader/vv/vv;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/socialbase/downloader/vv/vv;->m()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-lt v1, v2, :cond_0

    .line 4
    invoke-static {}, Lcom/ss/android/downloadlib/n/jh;->p()V

    .line 5
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/vv/vv;->vv()Lcom/ss/android/socialbase/downloader/vv/vv;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/vv/vv;->m()Z

    move-result v1

    if-nez v0, :cond_1

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz p0, :cond_2

    .line 6
    invoke-virtual {p0, v0}, Lcom/ss/android/downloadad/api/vv/m;->jh(Z)V

    .line 7
    :cond_2
    invoke-interface {p1, v0}, Lcom/ss/android/downloadlib/m/qv;->vv(Z)V

    if-nez p0, :cond_3

    return-void

    .line 8
    :cond_3
    invoke-static {p0}, Lcom/ss/android/downloadlib/m/u;->k(Lcom/ss/android/downloadad/api/vv/m;)I

    move-result v0

    invoke-static {p0, v0}, Lcom/ss/android/downloadlib/m/u;->m(Lcom/ss/android/downloadad/api/vv/m;I)V

    if-eqz v1, :cond_4

    return-void

    .line 9
    :cond_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 10
    invoke-static {}, Lcom/ss/android/socialbase/downloader/vv/vv;->vv()Lcom/ss/android/socialbase/downloader/vv/vv;

    move-result-object v2

    new-instance v3, Lcom/ss/android/downloadlib/m/u$1;

    invoke-direct {v3, p0, v0, v1, p1}, Lcom/ss/android/downloadlib/m/u$1;-><init>(Lcom/ss/android/downloadad/api/vv/m;JLcom/ss/android/downloadlib/m/qv;)V

    invoke-virtual {v2, v3}, Lcom/ss/android/socialbase/downloader/vv/vv;->vv(Lcom/ss/android/socialbase/downloader/vv/vv$vv;)V

    return-void
.end method

.method public static vv(Lcom/ss/android/downloadad/api/vv/m;)Z
    .locals 1

    .line 11
    invoke-static {p0}, Lcom/ss/android/downloadlib/n/o;->vv(Lcom/ss/android/downloadad/api/vv/vv;)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object p0

    const-string v0, "app_link_opt_switch"

    .line 12
    invoke-virtual {p0, v0}, Lcom/ss/android/socialbase/downloader/n/vv;->m(Ljava/lang/String;)I

    move-result p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    return v0
.end method

.method private static wv(Lcom/ss/android/downloadad/api/vv/m;)I
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/ss/android/downloadlib/n/o;->vv(Lcom/ss/android/downloadad/api/vv/vv;)Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object p0

    const-string v0, "app_link_check_delay"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/ss/android/socialbase/downloader/n/vv;->vv(Ljava/lang/String;I)I

    move-result p0

    return p0
.end method
