.class public final Lcom/kwad/sdk/commercial/smallApp/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/c/a;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, v0, p1}, Lcom/kwad/sdk/commercial/smallApp/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;ZLcom/kwad/sdk/commercial/c/a;)V

    return-void
.end method

.method public static a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/smallApp/JumpFrom;Lcom/kwad/sdk/core/response/model/AdInfo$SmallAppJumpInfo;)V
    .locals 1

    if-eqz p0, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    .line 10
    :cond_0
    :try_start_0
    invoke-static {p1}, Lcom/kwad/sdk/commercial/smallApp/b;->a(Lcom/kwad/sdk/commercial/smallApp/JumpFrom;)Lcom/kwad/sdk/commercial/smallApp/b;

    move-result-object p1

    const/4 v0, 0x1

    .line 11
    invoke-virtual {p1, v0}, Lcom/kwad/sdk/commercial/smallApp/b;->cm(I)Lcom/kwad/sdk/commercial/smallApp/b;

    move-result-object p1

    iget-object v0, p2, Lcom/kwad/sdk/core/response/model/AdInfo$SmallAppJumpInfo;->mediaSmallAppId:Ljava/lang/String;

    .line 12
    invoke-virtual {p1, v0}, Lcom/kwad/sdk/commercial/smallApp/b;->cT(Ljava/lang/String;)Lcom/kwad/sdk/commercial/smallApp/b;

    move-result-object p1

    iget-object v0, p2, Lcom/kwad/sdk/core/response/model/AdInfo$SmallAppJumpInfo;->originId:Ljava/lang/String;

    .line 13
    invoke-virtual {p1, v0}, Lcom/kwad/sdk/commercial/smallApp/b;->cS(Ljava/lang/String;)Lcom/kwad/sdk/commercial/smallApp/b;

    move-result-object p1

    iget-object p2, p2, Lcom/kwad/sdk/core/response/model/AdInfo$SmallAppJumpInfo;->smallAppJumpUrl:Ljava/lang/String;

    .line 14
    invoke-virtual {p1, p2}, Lcom/kwad/sdk/commercial/smallApp/b;->cR(Ljava/lang/String;)Lcom/kwad/sdk/commercial/smallApp/b;

    move-result-object p1

    .line 15
    invoke-static {p0, p1}, Lcom/kwad/sdk/commercial/smallApp/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/c/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 16
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/smallApp/JumpFrom;Lcom/kwad/sdk/core/response/model/AdInfo$SmallAppJumpInfo;Ljava/lang/String;)V
    .locals 3
    .param p2    # Lcom/kwad/sdk/core/response/model/AdInfo$SmallAppJumpInfo;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 24
    :try_start_0
    invoke-static {p1}, Lcom/kwad/sdk/commercial/smallApp/b;->a(Lcom/kwad/sdk/commercial/smallApp/JumpFrom;)Lcom/kwad/sdk/commercial/smallApp/b;

    move-result-object p1

    const/4 v1, 0x4

    .line 25
    invoke-virtual {p1, v1}, Lcom/kwad/sdk/commercial/smallApp/b;->cm(I)Lcom/kwad/sdk/commercial/smallApp/b;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v1, ""

    if-nez p2, :cond_1

    move-object v2, v1

    goto :goto_0

    .line 26
    :cond_1
    :try_start_1
    iget-object v2, p2, Lcom/kwad/sdk/core/response/model/AdInfo$SmallAppJumpInfo;->mediaSmallAppId:Ljava/lang/String;

    :goto_0
    invoke-virtual {p1, v2}, Lcom/kwad/sdk/commercial/smallApp/b;->cT(Ljava/lang/String;)Lcom/kwad/sdk/commercial/smallApp/b;

    move-result-object p1

    if-nez p2, :cond_2

    move-object v2, v1

    goto :goto_1

    .line 27
    :cond_2
    iget-object v2, p2, Lcom/kwad/sdk/core/response/model/AdInfo$SmallAppJumpInfo;->originId:Ljava/lang/String;

    :goto_1
    invoke-virtual {p1, v2}, Lcom/kwad/sdk/commercial/smallApp/b;->cS(Ljava/lang/String;)Lcom/kwad/sdk/commercial/smallApp/b;

    move-result-object p1

    if-nez p2, :cond_3

    goto :goto_2

    .line 28
    :cond_3
    iget-object v1, p2, Lcom/kwad/sdk/core/response/model/AdInfo$SmallAppJumpInfo;->smallAppJumpUrl:Ljava/lang/String;

    :goto_2
    invoke-virtual {p1, v1}, Lcom/kwad/sdk/commercial/smallApp/b;->cR(Ljava/lang/String;)Lcom/kwad/sdk/commercial/smallApp/b;

    move-result-object p1

    const p2, 0x186a8

    .line 29
    invoke-virtual {p1, p2}, Lcom/kwad/sdk/commercial/c/a;->setErrorCode(I)Lcom/kwad/sdk/commercial/c/a;

    move-result-object p1

    .line 30
    invoke-virtual {p1, p3}, Lcom/kwad/sdk/commercial/c/a;->setErrorMsg(Ljava/lang/String;)Lcom/kwad/sdk/commercial/c/a;

    move-result-object p1

    .line 31
    invoke-static {p0, v0, p1}, Lcom/kwad/sdk/commercial/smallApp/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;ZLcom/kwad/sdk/commercial/c/a;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 32
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/smallApp/JumpFrom;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 17
    :try_start_0
    invoke-static {p1}, Lcom/kwad/sdk/commercial/smallApp/b;->a(Lcom/kwad/sdk/commercial/smallApp/JumpFrom;)Lcom/kwad/sdk/commercial/smallApp/b;

    move-result-object p1

    const/4 v0, 0x3

    .line 18
    invoke-virtual {p1, v0}, Lcom/kwad/sdk/commercial/smallApp/b;->cm(I)Lcom/kwad/sdk/commercial/smallApp/b;

    move-result-object p1

    .line 19
    invoke-virtual {p1, p2}, Lcom/kwad/sdk/commercial/smallApp/b;->cT(Ljava/lang/String;)Lcom/kwad/sdk/commercial/smallApp/b;

    move-result-object p1

    .line 20
    invoke-virtual {p1, p3}, Lcom/kwad/sdk/commercial/smallApp/b;->cS(Ljava/lang/String;)Lcom/kwad/sdk/commercial/smallApp/b;

    move-result-object p1

    .line 21
    invoke-virtual {p1, p4}, Lcom/kwad/sdk/commercial/smallApp/b;->cR(Ljava/lang/String;)Lcom/kwad/sdk/commercial/smallApp/b;

    move-result-object p1

    .line 22
    invoke-static {p0, p1}, Lcom/kwad/sdk/commercial/smallApp/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/c/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 23
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method private static a(Lcom/kwad/sdk/core/response/model/AdTemplate;ZLcom/kwad/sdk/commercial/c/a;)V
    .locals 3

    .line 2
    invoke-virtual {p2, p0}, Lcom/kwad/sdk/commercial/c/a;->setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/c/a;

    .line 3
    invoke-static {}, Lcom/kwad/sdk/commercial/c;->Br()Lcom/kwad/sdk/commercial/c;

    move-result-object v0

    const-string v1, "ad_client_apm_log"

    .line 4
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/c;->cz(Ljava/lang/String;)Lcom/kwad/sdk/commercial/c;

    move-result-object v0

    if-eqz p1, :cond_0

    const-wide v1, 0x3fb999999999999aL    # 0.1

    goto :goto_0

    :cond_0
    const-wide v1, 0x3f847ae147ae147bL    # 0.01

    .line 5
    :goto_0
    invoke-virtual {v0, v1, v2}, Lcom/kwad/sdk/commercial/c;->i(D)Lcom/kwad/sdk/commercial/c;

    move-result-object p1

    .line 6
    invoke-static {p0}, Lcom/kwad/sdk/commercial/d;->aT(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/kwad/sdk/commercial/c;->a(Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;)Lcom/kwad/sdk/commercial/c;

    move-result-object p0

    const-string p1, "ad_sdk_small_app_performance"

    const-string v0, "status"

    .line 7
    invoke-virtual {p0, p1, v0}, Lcom/kwad/sdk/commercial/c;->N(Ljava/lang/String;Ljava/lang/String;)Lcom/kwad/sdk/commercial/c;

    move-result-object p0

    .line 8
    invoke-virtual {p0, p2}, Lcom/kwad/sdk/commercial/c;->t(Lcom/kwad/sdk/commercial/c/a;)Lcom/kwad/sdk/commercial/c;

    move-result-object p0

    .line 9
    invoke-static {p0}, Lcom/kwad/sdk/commercial/b;->d(Lcom/kwad/sdk/commercial/c;)V

    return-void
.end method

.method public static b(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/smallApp/JumpFrom;Lcom/kwad/sdk/core/response/model/AdInfo$SmallAppJumpInfo;)V
    .locals 1

    if-eqz p0, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    :try_start_0
    invoke-static {p1}, Lcom/kwad/sdk/commercial/smallApp/b;->a(Lcom/kwad/sdk/commercial/smallApp/JumpFrom;)Lcom/kwad/sdk/commercial/smallApp/b;

    move-result-object p1

    const/4 v0, 0x2

    .line 2
    invoke-virtual {p1, v0}, Lcom/kwad/sdk/commercial/smallApp/b;->cm(I)Lcom/kwad/sdk/commercial/smallApp/b;

    move-result-object p1

    iget-object v0, p2, Lcom/kwad/sdk/core/response/model/AdInfo$SmallAppJumpInfo;->mediaSmallAppId:Ljava/lang/String;

    .line 3
    invoke-virtual {p1, v0}, Lcom/kwad/sdk/commercial/smallApp/b;->cT(Ljava/lang/String;)Lcom/kwad/sdk/commercial/smallApp/b;

    move-result-object p1

    iget-object v0, p2, Lcom/kwad/sdk/core/response/model/AdInfo$SmallAppJumpInfo;->originId:Ljava/lang/String;

    .line 4
    invoke-virtual {p1, v0}, Lcom/kwad/sdk/commercial/smallApp/b;->cS(Ljava/lang/String;)Lcom/kwad/sdk/commercial/smallApp/b;

    move-result-object p1

    iget-object p2, p2, Lcom/kwad/sdk/core/response/model/AdInfo$SmallAppJumpInfo;->smallAppJumpUrl:Ljava/lang/String;

    .line 5
    invoke-virtual {p1, p2}, Lcom/kwad/sdk/commercial/smallApp/b;->cR(Ljava/lang/String;)Lcom/kwad/sdk/commercial/smallApp/b;

    move-result-object p1

    .line 6
    invoke-static {p0, p1}, Lcom/kwad/sdk/commercial/smallApp/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/c/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 7
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-void
.end method
