.class public final Lcom/kwad/sdk/core/adlog/b/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lcom/kwad/sdk/core/adlog/a/a;Lcom/kwad/sdk/core/adlog/a/c;I)V
    .locals 2

    .line 16
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/core/adlog/b/b;->BX()Lcom/kwad/sdk/core/adlog/b/b;

    move-result-object v0

    const/4 v1, 0x1

    .line 17
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/adlog/b/b;->cs(I)Lcom/kwad/sdk/core/adlog/b/b;

    move-result-object v0

    .line 18
    invoke-virtual {v0, p2}, Lcom/kwad/sdk/core/adlog/b/b;->cx(I)Lcom/kwad/sdk/core/adlog/b/b;

    move-result-object p2

    .line 19
    invoke-static {p0, p1, p2}, Lcom/kwad/sdk/core/adlog/b/a;->a(Lcom/kwad/sdk/core/adlog/a/a;Lcom/kwad/sdk/core/adlog/a/c;Lcom/kwad/sdk/core/adlog/b/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 20
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static a(Lcom/kwad/sdk/core/adlog/a/a;Lcom/kwad/sdk/core/adlog/a/c;IJ)V
    .locals 2

    .line 21
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/core/adlog/b/b;->BX()Lcom/kwad/sdk/core/adlog/b/b;

    move-result-object v0

    const/4 v1, 0x5

    .line 22
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/adlog/b/b;->cs(I)Lcom/kwad/sdk/core/adlog/b/b;

    move-result-object v0

    .line 23
    invoke-virtual {v0, p2}, Lcom/kwad/sdk/core/adlog/b/b;->cx(I)Lcom/kwad/sdk/core/adlog/b/b;

    move-result-object p2

    .line 24
    invoke-virtual {p2, p3, p4}, Lcom/kwad/sdk/core/adlog/b/b;->al(J)Lcom/kwad/sdk/core/adlog/b/b;

    move-result-object p2

    .line 25
    invoke-static {p0, p1, p2}, Lcom/kwad/sdk/core/adlog/b/a;->a(Lcom/kwad/sdk/core/adlog/a/a;Lcom/kwad/sdk/core/adlog/a/c;Lcom/kwad/sdk/core/adlog/b/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 26
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method private static a(Lcom/kwad/sdk/core/adlog/a/a;Lcom/kwad/sdk/core/adlog/a/c;Lcom/kwad/sdk/core/adlog/b/b;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, p1, v0, p2}, Lcom/kwad/sdk/core/adlog/b/a;->a(Lcom/kwad/sdk/core/adlog/a/a;Lcom/kwad/sdk/core/adlog/a/c;ZLcom/kwad/sdk/core/adlog/b/b;)V

    return-void
.end method

.method private static a(Lcom/kwad/sdk/core/adlog/a/a;Lcom/kwad/sdk/core/adlog/a/c;ZLcom/kwad/sdk/core/adlog/b/b;)V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/a/a;->aqx:Lcom/kwad/sdk/core/adlog/c/a;

    iget-object v1, v0, Lcom/kwad/sdk/core/adlog/c/a;->adTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 3
    iget v0, v0, Lcom/kwad/sdk/core/adlog/c/a;->apT:I

    invoke-virtual {p3, v0}, Lcom/kwad/sdk/core/adlog/b/b;->ct(I)Lcom/kwad/sdk/core/adlog/b/b;

    move-result-object v0

    iget v2, p0, Lcom/kwad/sdk/core/adlog/a/a;->retryCount:I

    .line 4
    invoke-virtual {v0, v2}, Lcom/kwad/sdk/core/adlog/b/b;->cu(I)Lcom/kwad/sdk/core/adlog/b/b;

    move-result-object v0

    iget v2, p0, Lcom/kwad/sdk/core/adlog/a/a;->aqz:I

    .line 5
    invoke-virtual {v0, v2}, Lcom/kwad/sdk/core/adlog/b/b;->cv(I)Lcom/kwad/sdk/core/adlog/b/b;

    move-result-object v0

    iget-object p0, p0, Lcom/kwad/sdk/core/adlog/a/a;->aqA:Ljava/lang/String;

    .line 6
    invoke-virtual {v0, p0}, Lcom/kwad/sdk/core/adlog/b/b;->di(Ljava/lang/String;)Lcom/kwad/sdk/core/adlog/b/b;

    move-result-object p0

    iget p1, p1, Lcom/kwad/sdk/core/adlog/a/c;->aqI:I

    .line 7
    invoke-virtual {p0, p1}, Lcom/kwad/sdk/core/adlog/b/b;->cw(I)Lcom/kwad/sdk/core/adlog/b/b;

    move-result-object p0

    .line 8
    invoke-virtual {p0, v1}, Lcom/kwad/sdk/core/adlog/b/b;->bU(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/adlog/b/b;

    .line 9
    invoke-static {}, Lcom/kwad/sdk/commercial/c;->Br()Lcom/kwad/sdk/commercial/c;

    move-result-object p0

    const-string p1, "ad_client_apm_log"

    .line 10
    invoke-virtual {p0, p1}, Lcom/kwad/sdk/commercial/c;->cz(Ljava/lang/String;)Lcom/kwad/sdk/commercial/c;

    move-result-object p0

    if-eqz p2, :cond_0

    const-wide/high16 p1, 0x3ff0000000000000L    # 1.0

    goto :goto_0

    :cond_0
    const-wide p1, 0x3fb999999999999aL    # 0.1

    .line 11
    :goto_0
    invoke-virtual {p0, p1, p2}, Lcom/kwad/sdk/commercial/c;->i(D)Lcom/kwad/sdk/commercial/c;

    move-result-object p0

    .line 12
    invoke-static {v1}, Lcom/kwad/sdk/commercial/d;->aT(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/kwad/sdk/commercial/c;->a(Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;)Lcom/kwad/sdk/commercial/c;

    move-result-object p0

    const-string p1, "ad_sdk_adlog_retry"

    const-string p2, "status"

    .line 13
    invoke-virtual {p0, p1, p2}, Lcom/kwad/sdk/commercial/c;->N(Ljava/lang/String;Ljava/lang/String;)Lcom/kwad/sdk/commercial/c;

    move-result-object p0

    .line 14
    invoke-virtual {p0, p3}, Lcom/kwad/sdk/commercial/c;->t(Lcom/kwad/sdk/commercial/c/a;)Lcom/kwad/sdk/commercial/c;

    move-result-object p0

    .line 15
    invoke-static {p0}, Lcom/kwad/sdk/commercial/b;->d(Lcom/kwad/sdk/commercial/c;)V

    return-void
.end method

.method public static b(Lcom/kwad/sdk/core/adlog/a/a;Lcom/kwad/sdk/core/adlog/a/c;I)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/core/adlog/b/b;->BX()Lcom/kwad/sdk/core/adlog/b/b;

    move-result-object v0

    const/4 v1, 0x2

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/adlog/b/b;->cs(I)Lcom/kwad/sdk/core/adlog/b/b;

    move-result-object v0

    .line 3
    invoke-virtual {v0, p2}, Lcom/kwad/sdk/core/adlog/b/b;->cx(I)Lcom/kwad/sdk/core/adlog/b/b;

    move-result-object p2

    .line 4
    invoke-static {p0, p1, p2}, Lcom/kwad/sdk/core/adlog/b/a;->a(Lcom/kwad/sdk/core/adlog/a/a;Lcom/kwad/sdk/core/adlog/a/c;Lcom/kwad/sdk/core/adlog/b/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 5
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static b(Lcom/kwad/sdk/core/adlog/a/a;Lcom/kwad/sdk/core/adlog/a/c;IJ)V
    .locals 3

    const/4 v0, 0x1

    .line 6
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/core/adlog/b/b;->BX()Lcom/kwad/sdk/core/adlog/b/b;

    move-result-object v1

    const/4 v2, 0x6

    .line 7
    invoke-virtual {v1, v2}, Lcom/kwad/sdk/core/adlog/b/b;->cs(I)Lcom/kwad/sdk/core/adlog/b/b;

    move-result-object v1

    .line 8
    invoke-virtual {v1, p2}, Lcom/kwad/sdk/core/adlog/b/b;->cx(I)Lcom/kwad/sdk/core/adlog/b/b;

    move-result-object p2

    .line 9
    invoke-virtual {p2, p3, p4}, Lcom/kwad/sdk/core/adlog/b/b;->al(J)Lcom/kwad/sdk/core/adlog/b/b;

    move-result-object p2

    .line 10
    invoke-static {p0, p1, v0, p2}, Lcom/kwad/sdk/core/adlog/b/a;->a(Lcom/kwad/sdk/core/adlog/a/a;Lcom/kwad/sdk/core/adlog/a/c;ZLcom/kwad/sdk/core/adlog/b/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 11
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static c(Lcom/kwad/sdk/core/adlog/a/a;Lcom/kwad/sdk/core/adlog/a/c;I)V
    .locals 3

    const/4 v0, 0x1

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/core/adlog/b/b;->BX()Lcom/kwad/sdk/core/adlog/b/b;

    move-result-object v1

    const/4 v2, 0x3

    .line 2
    invoke-virtual {v1, v2}, Lcom/kwad/sdk/core/adlog/b/b;->cs(I)Lcom/kwad/sdk/core/adlog/b/b;

    move-result-object v1

    .line 3
    invoke-virtual {v1, p2}, Lcom/kwad/sdk/core/adlog/b/b;->cx(I)Lcom/kwad/sdk/core/adlog/b/b;

    move-result-object p2

    .line 4
    invoke-static {p0, p1, v0, p2}, Lcom/kwad/sdk/core/adlog/b/a;->a(Lcom/kwad/sdk/core/adlog/a/a;Lcom/kwad/sdk/core/adlog/a/c;ZLcom/kwad/sdk/core/adlog/b/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 5
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static d(Lcom/kwad/sdk/core/adlog/a/a;Lcom/kwad/sdk/core/adlog/a/c;I)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/core/adlog/b/b;->BX()Lcom/kwad/sdk/core/adlog/b/b;

    move-result-object v0

    const/4 v1, 0x4

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/adlog/b/b;->cs(I)Lcom/kwad/sdk/core/adlog/b/b;

    move-result-object v0

    .line 3
    invoke-virtual {v0, p2}, Lcom/kwad/sdk/core/adlog/b/b;->cx(I)Lcom/kwad/sdk/core/adlog/b/b;

    move-result-object p2

    .line 4
    invoke-static {p0, p1, p2}, Lcom/kwad/sdk/core/adlog/b/a;->a(Lcom/kwad/sdk/core/adlog/a/a;Lcom/kwad/sdk/core/adlog/a/c;Lcom/kwad/sdk/core/adlog/b/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 5
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static e(Lcom/kwad/sdk/core/adlog/a/a;Lcom/kwad/sdk/core/adlog/a/c;I)V
    .locals 3

    const/4 v0, 0x1

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/core/adlog/b/b;->BX()Lcom/kwad/sdk/core/adlog/b/b;

    move-result-object v1

    const/4 v2, 0x7

    .line 2
    invoke-virtual {v1, v2}, Lcom/kwad/sdk/core/adlog/b/b;->cs(I)Lcom/kwad/sdk/core/adlog/b/b;

    move-result-object v1

    .line 3
    invoke-virtual {v1, p2}, Lcom/kwad/sdk/core/adlog/b/b;->cx(I)Lcom/kwad/sdk/core/adlog/b/b;

    move-result-object p2

    .line 4
    invoke-static {p0, p1, v0, p2}, Lcom/kwad/sdk/core/adlog/b/a;->a(Lcom/kwad/sdk/core/adlog/a/a;Lcom/kwad/sdk/core/adlog/a/c;ZLcom/kwad/sdk/core/adlog/b/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 5
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method
