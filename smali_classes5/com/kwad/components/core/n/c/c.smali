.class public final Lcom/kwad/components/core/n/c/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static a(Lcom/kwad/components/core/n/c/d;Z)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/kwad/sdk/commercial/c;->Br()Lcom/kwad/sdk/commercial/c;

    move-result-object v0

    if-eqz p1, :cond_0

    const-string v1, "ad_client_error_log"

    goto :goto_0

    :cond_0
    const-string v1, "ad_client_apm_log"

    .line 2
    :goto_0
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/c;->cz(Ljava/lang/String;)Lcom/kwad/sdk/commercial/c;

    move-result-object v0

    if-eqz p1, :cond_1

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    goto :goto_1

    :cond_1
    const-wide v1, 0x3f847ae147ae147bL    # 0.01

    .line 3
    :goto_1
    invoke-virtual {v0, v1, v2}, Lcom/kwad/sdk/commercial/c;->i(D)Lcom/kwad/sdk/commercial/c;

    move-result-object p1

    const-string v0, "ad_sdk_offline_component_update"

    const-string v1, "load_status"

    .line 4
    invoke-virtual {p1, v0, v1}, Lcom/kwad/sdk/commercial/c;->N(Ljava/lang/String;Ljava/lang/String;)Lcom/kwad/sdk/commercial/c;

    move-result-object p1

    .line 5
    invoke-virtual {p1, p0}, Lcom/kwad/sdk/commercial/c;->t(Lcom/kwad/sdk/commercial/c/a;)Lcom/kwad/sdk/commercial/c;

    move-result-object p0

    sget-object p1, Lcom/kwai/adclient/kscommerciallogger/model/a;->aUS:Lcom/kwai/adclient/kscommerciallogger/model/d;

    .line 6
    invoke-virtual {p0, p1}, Lcom/kwad/sdk/commercial/c;->a(Lcom/kwai/adclient/kscommerciallogger/model/d;)Lcom/kwad/sdk/commercial/c;

    move-result-object p0

    .line 7
    invoke-static {p0}, Lcom/kwad/sdk/commercial/b;->d(Lcom/kwad/sdk/commercial/c;)V

    return-void
.end method

.method public static a(Ljava/lang/String;JJLjava/lang/String;)V
    .locals 1

    .line 8
    :try_start_0
    new-instance v0, Lcom/kwad/components/core/n/c/d;

    invoke-direct {v0}, Lcom/kwad/components/core/n/c/d;-><init>()V

    .line 9
    invoke-virtual {v0, p0}, Lcom/kwad/components/core/n/c/d;->aq(Ljava/lang/String;)Lcom/kwad/components/core/n/c/d;

    move-result-object p0

    .line 10
    invoke-virtual {p0, p1, p2}, Lcom/kwad/components/core/n/c/d;->D(J)Lcom/kwad/components/core/n/c/d;

    move-result-object p0

    .line 11
    invoke-virtual {p0, p3, p4}, Lcom/kwad/components/core/n/c/d;->E(J)Lcom/kwad/components/core/n/c/d;

    move-result-object p0

    .line 12
    invoke-virtual {p0, p5}, Lcom/kwad/components/core/n/c/d;->as(Ljava/lang/String;)Lcom/kwad/components/core/n/c/d;

    move-result-object p0

    const-wide/16 p1, 0x3

    .line 13
    invoke-virtual {p0, p1, p2}, Lcom/kwad/components/core/n/c/d;->C(J)Lcom/kwad/components/core/n/c/d;

    move-result-object p0

    const/4 p1, 0x0

    .line 14
    invoke-static {p0, p1}, Lcom/kwad/components/core/n/c/c;->a(Lcom/kwad/components/core/n/c/d;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 15
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static b(Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Lcom/kwad/components/core/n/c/d;

    invoke-direct {v0}, Lcom/kwad/components/core/n/c/d;-><init>()V

    .line 2
    invoke-virtual {v0, p0}, Lcom/kwad/components/core/n/c/d;->aq(Ljava/lang/String;)Lcom/kwad/components/core/n/c/d;

    move-result-object p0

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/kwad/components/core/n/c/d;->D(J)Lcom/kwad/components/core/n/c/d;

    move-result-object p0

    .line 4
    invoke-virtual {p0, p3}, Lcom/kwad/components/core/n/c/d;->ay(I)Lcom/kwad/components/core/n/c/d;

    move-result-object p0

    .line 5
    invoke-virtual {p0, p4}, Lcom/kwad/components/core/n/c/d;->as(Ljava/lang/String;)Lcom/kwad/components/core/n/c/d;

    move-result-object p0

    .line 6
    invoke-virtual {p0, p5}, Lcom/kwad/components/core/n/c/d;->ar(Ljava/lang/String;)Lcom/kwad/components/core/n/c/d;

    move-result-object p0

    const-wide/16 p1, 0x2

    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/kwad/components/core/n/c/d;->C(J)Lcom/kwad/components/core/n/c/d;

    move-result-object p0

    const/4 p1, 0x1

    .line 8
    invoke-static {p0, p1}, Lcom/kwad/components/core/n/c/c;->a(Lcom/kwad/components/core/n/c/d;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 9
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static d(Ljava/lang/String;JLjava/lang/String;)V
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Lcom/kwad/components/core/n/c/d;

    invoke-direct {v0}, Lcom/kwad/components/core/n/c/d;-><init>()V

    .line 2
    invoke-virtual {v0, p0}, Lcom/kwad/components/core/n/c/d;->aq(Ljava/lang/String;)Lcom/kwad/components/core/n/c/d;

    move-result-object p0

    .line 3
    invoke-virtual {p0, p3}, Lcom/kwad/components/core/n/c/d;->as(Ljava/lang/String;)Lcom/kwad/components/core/n/c/d;

    move-result-object p0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/kwad/components/core/n/c/d;->D(J)Lcom/kwad/components/core/n/c/d;

    move-result-object p0

    const-wide/16 p1, 0x1

    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kwad/components/core/n/c/d;->C(J)Lcom/kwad/components/core/n/c/d;

    move-result-object p0

    const/4 p1, 0x0

    .line 6
    invoke-static {p0, p1}, Lcom/kwad/components/core/n/c/c;->a(Lcom/kwad/components/core/n/c/d;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 7
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method
