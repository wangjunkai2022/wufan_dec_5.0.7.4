.class public final Lcom/kwad/sdk/utils/bf;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static NA()V
    .locals 3

    const-string v0, "ksadsdk_pref"

    const-string v1, "interstitial_aggregate_transfer"

    const/4 v2, 0x1

    .line 1
    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/utils/y;->l(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public static NB()Z
    .locals 3

    const-string v0, "ksadsdk_pref"

    const-string v1, "interstitial_aggregate_transfer"

    const/4 v2, 0x0

    .line 1
    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/utils/y;->m(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static Nu()Z
    .locals 3

    const-string v0, "ksadsdk_pref"

    const-string v1, "config_data_transfer"

    const/4 v2, 0x0

    .line 1
    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/utils/y;->m(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method private static Nv()V
    .locals 3

    const-string v0, "ksadsdk_pref"

    const-string v1, "config_data_transfer"

    const/4 v2, 0x1

    .line 1
    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/utils/y;->l(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public static Nw()V
    .locals 3

    const-string v0, "ksadsdk_pref"

    const-string v1, "splash_daily_transfer"

    const/4 v2, 0x1

    .line 1
    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/utils/y;->l(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public static Nx()Z
    .locals 3

    const-string v0, "ksadsdk_pref"

    const-string v1, "splash_daily_transfer"

    const/4 v2, 0x0

    .line 1
    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/utils/y;->m(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static Ny()V
    .locals 3

    const-string v0, "ksadsdk_pref"

    const-string v1, "reward_auto_transfer"

    const/4 v2, 0x1

    .line 1
    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/utils/y;->l(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public static Nz()Z
    .locals 3

    const-string v0, "ksadsdk_pref"

    const-string v1, "reward_auto_transfer"

    const/4 v2, 0x0

    .line 1
    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/utils/y;->m(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static au(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    const-string v0, ""

    if-nez p0, :cond_0

    return-object v0

    .line 1
    :cond_0
    new-instance v1, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p0

    invoke-direct {v1, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p0

    if-nez p0, :cond_1

    return-object v0

    .line 3
    :cond_1
    :try_start_0
    invoke-static {v1}, Lcom/kwad/sdk/crash/utils/h;->I(Ljava/io/File;)Ljava/lang/String;

    move-result-object p0

    .line 4
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_2

    return-object v0

    :cond_2
    return-object p0

    :catchall_0
    return-object v0
.end method

.method public static i(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/sdk/utils/bf$1;

    invoke-direct {v0, p0, p1, p2}, Lcom/kwad/sdk/utils/bf$1;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/kwad/sdk/utils/g;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static j(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    if-eqz p0, :cond_0

    .line 1
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p0

    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    invoke-static {p0, p2, p1}, Lcom/kwad/sdk/crash/utils/h;->k(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3
    invoke-static {}, Lcom/kwad/sdk/utils/bf;->Nv()V

    :cond_0
    return-void
.end method
