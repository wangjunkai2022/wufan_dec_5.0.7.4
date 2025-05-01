.class public final Lcom/kwad/sdk/commercial/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/c/a;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, v0, p1}, Lcom/kwad/sdk/commercial/a/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;ZLcom/kwad/sdk/commercial/c/a;)V

    return-void
.end method

.method private static a(Lcom/kwad/sdk/core/response/model/AdTemplate;ZLcom/kwad/sdk/commercial/c/a;)V
    .locals 3

    .line 2
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/commercial/c;->Br()Lcom/kwad/sdk/commercial/c;

    move-result-object v0

    if-eqz p1, :cond_0

    const-string v1, "ad_client_error_log"

    goto :goto_0

    :cond_0
    const-string v1, "ad_client_apm_log"

    .line 3
    :goto_0
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/c;->cz(Ljava/lang/String;)Lcom/kwad/sdk/commercial/c;

    move-result-object v0

    if-eqz p1, :cond_1

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    goto :goto_1

    :cond_1
    const-wide v1, 0x3fb999999999999aL    # 0.1

    .line 4
    :goto_1
    invoke-virtual {v0, v1, v2}, Lcom/kwad/sdk/commercial/c;->i(D)Lcom/kwad/sdk/commercial/c;

    move-result-object p1

    .line 5
    invoke-static {p0}, Lcom/kwad/sdk/commercial/d;->aT(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/kwad/sdk/commercial/c;->a(Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;)Lcom/kwad/sdk/commercial/c;

    move-result-object p0

    const-string p1, "ad_sdk_download_performance"

    const-string v0, "status"

    .line 6
    invoke-virtual {p0, p1, v0}, Lcom/kwad/sdk/commercial/c;->N(Ljava/lang/String;Ljava/lang/String;)Lcom/kwad/sdk/commercial/c;

    move-result-object p0

    .line 7
    invoke-virtual {p0, p2}, Lcom/kwad/sdk/commercial/c;->t(Lcom/kwad/sdk/commercial/c/a;)Lcom/kwad/sdk/commercial/c;

    move-result-object p0

    .line 8
    invoke-static {p0}, Lcom/kwad/sdk/commercial/b;->d(Lcom/kwad/sdk/commercial/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 9
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static aV(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/kwad/sdk/commercial/a/b;->Bs()Lcom/kwad/sdk/commercial/a/b;

    move-result-object v0

    const/4 v1, 0x3

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/a/b;->cc(I)Lcom/kwad/sdk/commercial/a/b;

    move-result-object v0

    .line 3
    invoke-virtual {v0, p0}, Lcom/kwad/sdk/commercial/a/b;->bc(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/a/b;

    move-result-object v0

    .line 4
    invoke-static {p0, v0}, Lcom/kwad/sdk/commercial/a/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/c/a;)V

    return-void
.end method

.method public static aW(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/kwad/sdk/commercial/a/b;->Bs()Lcom/kwad/sdk/commercial/a/b;

    move-result-object v0

    const/4 v1, 0x4

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/a/b;->cc(I)Lcom/kwad/sdk/commercial/a/b;

    move-result-object v0

    .line 3
    invoke-virtual {v0, p0}, Lcom/kwad/sdk/commercial/a/b;->bc(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/a/b;

    move-result-object v0

    .line 4
    invoke-static {p0, v0}, Lcom/kwad/sdk/commercial/a/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/c/a;)V

    return-void
.end method

.method public static aX(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/kwad/sdk/commercial/a/b;->Bs()Lcom/kwad/sdk/commercial/a/b;

    move-result-object v0

    const/4 v1, 0x5

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/a/b;->cc(I)Lcom/kwad/sdk/commercial/a/b;

    move-result-object v0

    .line 3
    invoke-virtual {v0, p0}, Lcom/kwad/sdk/commercial/a/b;->bc(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/a/b;

    move-result-object v0

    .line 4
    invoke-static {p0, v0}, Lcom/kwad/sdk/commercial/a/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/c/a;)V

    return-void
.end method

.method public static aY(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    const v0, 0x186a2

    const-string v1, ""

    .line 1
    invoke-static {p0, v0, v1}, Lcom/kwad/sdk/commercial/a/a;->h(Lcom/kwad/sdk/core/response/model/AdTemplate;ILjava/lang/String;)V

    return-void
.end method

.method public static aZ(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/kwad/sdk/commercial/a/b;->Bs()Lcom/kwad/sdk/commercial/a/b;

    move-result-object v0

    const/4 v1, 0x7

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/a/b;->cc(I)Lcom/kwad/sdk/commercial/a/b;

    move-result-object v0

    .line 3
    iget-boolean v1, p0, Lcom/kwad/sdk/core/response/model/AdTemplate;->mInstallApkFormUser:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/a/b;->cd(I)Lcom/kwad/sdk/commercial/a/b;

    move-result-object v0

    .line 4
    invoke-virtual {v0, p0}, Lcom/kwad/sdk/commercial/a/b;->bc(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/a/b;

    move-result-object v0

    .line 5
    invoke-static {p0, v0}, Lcom/kwad/sdk/commercial/a/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/c/a;)V

    return-void
.end method

.method public static ba(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 4

    .line 1
    invoke-static {}, Lcom/kwad/sdk/commercial/a/b;->Bs()Lcom/kwad/sdk/commercial/a/b;

    move-result-object v0

    const/16 v1, 0x8

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/a/b;->cc(I)Lcom/kwad/sdk/commercial/a/b;

    move-result-object v0

    .line 3
    iget-boolean v1, p0, Lcom/kwad/sdk/core/response/model/AdTemplate;->mInstallApkFormUser:Z

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/a/b;->cd(I)Lcom/kwad/sdk/commercial/a/b;

    move-result-object v0

    .line 4
    iget-boolean v1, p0, Lcom/kwad/sdk/core/response/model/AdTemplate;->mInstallApkFromSDK:Z

    if-eqz v1, :cond_1

    goto :goto_1

    .line 5
    :cond_1
    iget-boolean v1, p0, Lcom/kwad/sdk/core/response/model/AdTemplate;->mClickOpenAppStore:Z

    if-eqz v1, :cond_2

    const/4 v2, 0x2

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    .line 6
    :goto_1
    invoke-virtual {v0, v2}, Lcom/kwad/sdk/commercial/a/b;->ce(I)Lcom/kwad/sdk/commercial/a/b;

    move-result-object v0

    .line 7
    invoke-virtual {v0, p0}, Lcom/kwad/sdk/commercial/a/b;->bc(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/a/b;

    move-result-object v0

    .line 8
    invoke-static {p0, v0}, Lcom/kwad/sdk/commercial/a/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/c/a;)V

    return-void
.end method

.method public static bb(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/kwad/sdk/commercial/a/b;->Bs()Lcom/kwad/sdk/commercial/a/b;

    move-result-object v0

    const/16 v1, 0xa

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/a/b;->cc(I)Lcom/kwad/sdk/commercial/a/b;

    move-result-object v0

    .line 3
    iget-boolean v1, p0, Lcom/kwad/sdk/core/response/model/AdTemplate;->mInstallApkFromSDK:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    .line 4
    :cond_0
    iget-boolean v1, p0, Lcom/kwad/sdk/core/response/model/AdTemplate;->mClickOpenAppStore:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x2

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 5
    :goto_0
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/a/b;->ce(I)Lcom/kwad/sdk/commercial/a/b;

    move-result-object v0

    .line 6
    invoke-virtual {v0, p0}, Lcom/kwad/sdk/commercial/a/b;->bc(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/a/b;

    move-result-object v0

    .line 7
    invoke-static {p0, v0}, Lcom/kwad/sdk/commercial/a/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/c/a;)V

    return-void
.end method

.method public static h(Lcom/kwad/sdk/core/response/model/AdTemplate;ILjava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/kwad/sdk/commercial/a/b;->Bs()Lcom/kwad/sdk/commercial/a/b;

    move-result-object v0

    const/4 v1, 0x6

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/a/b;->cc(I)Lcom/kwad/sdk/commercial/a/b;

    move-result-object v0

    .line 3
    invoke-virtual {v0, p0}, Lcom/kwad/sdk/commercial/a/b;->bc(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/a/b;

    move-result-object v0

    .line 4
    invoke-virtual {v0, p1}, Lcom/kwad/sdk/commercial/c/a;->setErrorCode(I)Lcom/kwad/sdk/commercial/c/a;

    move-result-object p1

    .line 5
    invoke-virtual {p1, p2}, Lcom/kwad/sdk/commercial/c/a;->setErrorMsg(Ljava/lang/String;)Lcom/kwad/sdk/commercial/c/a;

    move-result-object p1

    const/4 p2, 0x1

    .line 6
    invoke-static {p0, p2, p1}, Lcom/kwad/sdk/commercial/a/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;ZLcom/kwad/sdk/commercial/c/a;)V

    return-void
.end method

.method public static i(Lcom/kwad/sdk/core/response/model/AdTemplate;ILjava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/kwad/sdk/commercial/a/b;->Bs()Lcom/kwad/sdk/commercial/a/b;

    move-result-object p1

    const/16 v0, 0x9

    .line 2
    invoke-virtual {p1, v0}, Lcom/kwad/sdk/commercial/a/b;->cc(I)Lcom/kwad/sdk/commercial/a/b;

    move-result-object p1

    .line 3
    iget-boolean v0, p0, Lcom/kwad/sdk/core/response/model/AdTemplate;->mInstallApkFormUser:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    invoke-virtual {p1, v0}, Lcom/kwad/sdk/commercial/a/b;->cd(I)Lcom/kwad/sdk/commercial/a/b;

    move-result-object p1

    .line 4
    invoke-virtual {p1, p0}, Lcom/kwad/sdk/commercial/a/b;->bc(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/a/b;

    move-result-object p1

    const v0, 0x186a3

    .line 5
    invoke-virtual {p1, v0}, Lcom/kwad/sdk/commercial/c/a;->setErrorCode(I)Lcom/kwad/sdk/commercial/c/a;

    move-result-object p1

    .line 6
    invoke-virtual {p1, p2}, Lcom/kwad/sdk/commercial/c/a;->setErrorMsg(Ljava/lang/String;)Lcom/kwad/sdk/commercial/c/a;

    move-result-object p1

    .line 7
    invoke-static {p0, v1, p1}, Lcom/kwad/sdk/commercial/a/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;ZLcom/kwad/sdk/commercial/c/a;)V

    return-void
.end method

.method public static j(Lcom/kwad/sdk/core/response/model/AdTemplate;J)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/kwad/sdk/commercial/a/b;->Bs()Lcom/kwad/sdk/commercial/a/b;

    move-result-object v0

    const/4 v1, 0x2

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/a/b;->cc(I)Lcom/kwad/sdk/commercial/a/b;

    move-result-object v0

    .line 3
    invoke-virtual {v0, p1, p2}, Lcom/kwad/sdk/commercial/a/b;->aj(J)Lcom/kwad/sdk/commercial/a/b;

    move-result-object p1

    .line 4
    invoke-virtual {p1, p0}, Lcom/kwad/sdk/commercial/a/b;->bc(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/a/b;

    move-result-object p1

    .line 5
    invoke-static {p0, p1}, Lcom/kwad/sdk/commercial/a/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/c/a;)V

    return-void
.end method

.method public static o(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/kwad/sdk/commercial/a/b;->Bs()Lcom/kwad/sdk/commercial/a/b;

    move-result-object v0

    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/a/b;->cc(I)Lcom/kwad/sdk/commercial/a/b;

    move-result-object v0

    .line 3
    invoke-virtual {v0, p0}, Lcom/kwad/sdk/commercial/a/b;->bc(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/a/b;

    move-result-object v0

    .line 4
    invoke-static {p0, v0}, Lcom/kwad/sdk/commercial/a/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/c/a;)V

    return-void
.end method
