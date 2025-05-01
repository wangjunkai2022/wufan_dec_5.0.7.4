.class public final Lcom/kwad/sdk/commercial/d/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(IILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 21
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/commercial/c;->Br()Lcom/kwad/sdk/commercial/c;

    move-result-object v0

    const-string v1, "ad_client_error_log"

    .line 22
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/c;->cz(Ljava/lang/String;)Lcom/kwad/sdk/commercial/c;

    move-result-object v0

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    .line 23
    invoke-virtual {v0, v1, v2}, Lcom/kwad/sdk/commercial/c;->i(D)Lcom/kwad/sdk/commercial/c;

    move-result-object v0

    .line 24
    invoke-static {p0}, Lcom/kwad/sdk/commercial/d;->ca(I)Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/kwad/sdk/commercial/c;->a(Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;)Lcom/kwad/sdk/commercial/c;

    move-result-object p0

    const-string v0, "ad_convert_method_call"

    const-string v1, "method_name"

    .line 25
    invoke-virtual {p0, v0, v1}, Lcom/kwad/sdk/commercial/c;->N(Ljava/lang/String;Ljava/lang/String;)Lcom/kwad/sdk/commercial/c;

    move-result-object p0

    .line 26
    invoke-static {}, Lcom/kwad/sdk/commercial/d/b;->Bu()Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    const-string v1, "requestError"

    .line 27
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/d/b;->cD(Ljava/lang/String;)Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    .line 28
    invoke-virtual {v0, p3}, Lcom/kwad/sdk/commercial/d/b;->cE(Ljava/lang/String;)Lcom/kwad/sdk/commercial/d/b;

    move-result-object p3

    .line 29
    invoke-static {p1}, Lcom/kwad/sdk/commercial/d;->cb(I)I

    move-result p1

    invoke-virtual {p3, p1}, Lcom/kwad/sdk/commercial/c/a;->setErrorCode(I)Lcom/kwad/sdk/commercial/c/a;

    move-result-object p1

    .line 30
    invoke-virtual {p1, p2}, Lcom/kwad/sdk/commercial/c/a;->setErrorMsg(Ljava/lang/String;)Lcom/kwad/sdk/commercial/c/a;

    move-result-object p1

    .line 31
    invoke-virtual {p0, p1}, Lcom/kwad/sdk/commercial/c;->t(Lcom/kwad/sdk/commercial/c/a;)Lcom/kwad/sdk/commercial/c;

    move-result-object p0

    .line 32
    invoke-static {p0}, Lcom/kwad/sdk/commercial/b;->d(Lcom/kwad/sdk/commercial/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 33
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static a(Lcom/kwad/sdk/internal/api/SceneImpl;I)V
    .locals 2

    .line 16
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/commercial/d/b;->Bu()Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    const-string v1, "dataReady"

    .line 17
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/d/b;->cD(Ljava/lang/String;)Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    .line 18
    invoke-virtual {v0, p1}, Lcom/kwad/sdk/commercial/d/b;->ci(I)Lcom/kwad/sdk/commercial/d/b;

    move-result-object p1

    .line 19
    invoke-static {p0, p1}, Lcom/kwad/sdk/commercial/d/d;->a(Lcom/kwad/sdk/internal/api/SceneImpl;Lcom/kwad/sdk/commercial/c/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 20
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method private static a(Lcom/kwad/sdk/internal/api/SceneImpl;Lcom/kwad/sdk/commercial/c/a;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/kwad/sdk/commercial/c;->Br()Lcom/kwad/sdk/commercial/c;

    move-result-object v0

    const-string v1, "ad_client_apm_log"

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/c;->cz(Ljava/lang/String;)Lcom/kwad/sdk/commercial/c;

    move-result-object v0

    const-wide v1, 0x3f50624dd2f1a9fcL    # 0.001

    .line 3
    invoke-virtual {v0, v1, v2}, Lcom/kwad/sdk/commercial/c;->i(D)Lcom/kwad/sdk/commercial/c;

    move-result-object v0

    .line 4
    invoke-virtual {p0}, Lcom/kwad/sdk/internal/api/SceneImpl;->getAdStyle()I

    move-result p0

    invoke-static {p0}, Lcom/kwad/sdk/commercial/d;->ca(I)Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/kwad/sdk/commercial/c;->a(Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;)Lcom/kwad/sdk/commercial/c;

    move-result-object p0

    const-string v0, "ad_convert_method_call"

    const-string v1, "method_name"

    .line 5
    invoke-virtual {p0, v0, v1}, Lcom/kwad/sdk/commercial/c;->N(Ljava/lang/String;Ljava/lang/String;)Lcom/kwad/sdk/commercial/c;

    move-result-object p0

    .line 6
    invoke-virtual {p0, p1}, Lcom/kwad/sdk/commercial/c;->t(Lcom/kwad/sdk/commercial/c/a;)Lcom/kwad/sdk/commercial/c;

    move-result-object p0

    .line 7
    invoke-static {p0}, Lcom/kwad/sdk/commercial/b;->d(Lcom/kwad/sdk/commercial/c;)V

    return-void
.end method

.method public static a(Lcom/kwad/sdk/internal/api/SceneImpl;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 8
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/commercial/d/b;->Bu()Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    const-string v1, "requestFinish"

    .line 9
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/d/b;->cD(Ljava/lang/String;)Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    .line 10
    invoke-virtual {p0}, Lcom/kwad/sdk/internal/api/SceneImpl;->getAdNum()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/d/b;->ci(I)Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    .line 11
    invoke-virtual {v0, p1}, Lcom/kwad/sdk/commercial/d/b;->cE(Ljava/lang/String;)Lcom/kwad/sdk/commercial/d/b;

    move-result-object p1

    .line 12
    invoke-virtual {p1, p2}, Lcom/kwad/sdk/commercial/d/b;->cF(Ljava/lang/String;)Lcom/kwad/sdk/commercial/d/b;

    move-result-object p1

    .line 13
    invoke-virtual {p0}, Lcom/kwad/sdk/internal/api/SceneImpl;->getPosId()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/kwad/sdk/commercial/c/a;->setPosId(J)Lcom/kwad/sdk/commercial/c/a;

    move-result-object p1

    .line 14
    invoke-static {p0, p1}, Lcom/kwad/sdk/commercial/d/d;->a(Lcom/kwad/sdk/internal/api/SceneImpl;Lcom/kwad/sdk/commercial/c/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 15
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static b(Lcom/kwad/sdk/internal/api/SceneImpl;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/commercial/d/b;->Bu()Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    const-string v1, "loadRequest"

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/d/b;->cD(Ljava/lang/String;)Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    .line 3
    invoke-virtual {p0}, Lcom/kwad/sdk/internal/api/SceneImpl;->getAdNum()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/d/b;->ci(I)Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    .line 4
    invoke-virtual {p0}, Lcom/kwad/sdk/internal/api/SceneImpl;->getPosId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/kwad/sdk/commercial/c/a;->setPosId(J)Lcom/kwad/sdk/commercial/c/a;

    move-result-object v0

    .line 5
    invoke-static {p0, v0}, Lcom/kwad/sdk/commercial/d/d;->a(Lcom/kwad/sdk/internal/api/SceneImpl;Lcom/kwad/sdk/commercial/c/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 6
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static b(Lcom/kwad/sdk/internal/api/SceneImpl;Ljava/lang/String;)V
    .locals 2

    .line 7
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/commercial/d/b;->Bu()Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    const-string v1, "requestStart"

    .line 8
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/d/b;->cD(Ljava/lang/String;)Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    .line 9
    invoke-virtual {p0}, Lcom/kwad/sdk/internal/api/SceneImpl;->getAdNum()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/d/b;->ci(I)Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Lcom/kwad/sdk/commercial/d/b;->cE(Ljava/lang/String;)Lcom/kwad/sdk/commercial/d/b;

    move-result-object p1

    .line 11
    invoke-virtual {p0}, Lcom/kwad/sdk/internal/api/SceneImpl;->getPosId()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/kwad/sdk/commercial/c/a;->setPosId(J)Lcom/kwad/sdk/commercial/c/a;

    move-result-object p1

    .line 12
    invoke-static {p0, p1}, Lcom/kwad/sdk/commercial/d/d;->a(Lcom/kwad/sdk/internal/api/SceneImpl;Lcom/kwad/sdk/commercial/c/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 13
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method
