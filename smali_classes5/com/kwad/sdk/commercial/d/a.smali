.class public final Lcom/kwad/sdk/commercial/d/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/c/a;)V
    .locals 3

    .line 1
    invoke-virtual {p1, p0}, Lcom/kwad/sdk/commercial/c/a;->setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/c/a;

    .line 2
    invoke-static {}, Lcom/kwad/sdk/commercial/c;->Br()Lcom/kwad/sdk/commercial/c;

    move-result-object v0

    const-string v1, "ad_client_apm_log"

    .line 3
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/c;->cz(Ljava/lang/String;)Lcom/kwad/sdk/commercial/c;

    move-result-object v0

    const-wide v1, 0x3f50624dd2f1a9fcL    # 0.001

    .line 4
    invoke-virtual {v0, v1, v2}, Lcom/kwad/sdk/commercial/c;->i(D)Lcom/kwad/sdk/commercial/c;

    move-result-object v0

    .line 5
    invoke-static {p0}, Lcom/kwad/sdk/commercial/d;->aT(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/kwad/sdk/commercial/c;->a(Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;)Lcom/kwad/sdk/commercial/c;

    move-result-object p0

    const-string v0, "ad_convert_method_call"

    const-string v1, "method_name"

    .line 6
    invoke-virtual {p0, v0, v1}, Lcom/kwad/sdk/commercial/c;->N(Ljava/lang/String;Ljava/lang/String;)Lcom/kwad/sdk/commercial/c;

    move-result-object p0

    .line 7
    invoke-virtual {p0, p1}, Lcom/kwad/sdk/commercial/c;->t(Lcom/kwad/sdk/commercial/c/a;)Lcom/kwad/sdk/commercial/c;

    move-result-object p0

    .line 8
    invoke-static {p0}, Lcom/kwad/sdk/commercial/b;->d(Lcom/kwad/sdk/commercial/c;)V

    return-void
.end method

.method public static bd(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/commercial/d/b;->Bu()Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    const-string v1, "adClick"

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/d/b;->cD(Ljava/lang/String;)Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    .line 3
    invoke-static {p0, v0}, Lcom/kwad/sdk/commercial/d/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/c/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 4
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static be(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/commercial/d/b;->Bu()Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    const-string v1, "startH5Page"

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/d/b;->cD(Ljava/lang/String;)Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    .line 3
    invoke-static {p0, v0}, Lcom/kwad/sdk/commercial/d/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/c/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 4
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static bf(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/commercial/d/b;->Bu()Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    const-string v1, "dplinkStart"

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/d/b;->cD(Ljava/lang/String;)Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    .line 3
    invoke-static {p0, v0}, Lcom/kwad/sdk/commercial/d/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/c/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 4
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static bg(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/commercial/d/b;->Bu()Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    const-string v1, "smallAppSuccess"

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/d/b;->cD(Ljava/lang/String;)Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    .line 3
    invoke-static {p0, v0}, Lcom/kwad/sdk/commercial/d/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/c/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 4
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static bh(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/commercial/d/b;->Bu()Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    const-string v1, "appstoreStart"

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/d/b;->cD(Ljava/lang/String;)Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    .line 3
    invoke-static {p0, v0}, Lcom/kwad/sdk/commercial/d/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/c/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 4
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static bi(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/commercial/d/b;->Bu()Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    const-string v1, "disableClick"

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/d/b;->cD(Ljava/lang/String;)Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    .line 3
    invoke-static {p0, v0}, Lcom/kwad/sdk/commercial/d/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/c/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 4
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static bj(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/commercial/d/b;->Bu()Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    const-string v1, "toVideoH5Web"

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/d/b;->cD(Ljava/lang/String;)Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    .line 3
    invoke-static {p0, v0}, Lcom/kwad/sdk/commercial/d/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/c/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 4
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static bk(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/commercial/d/b;->Bu()Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    const-string v1, "toDownload"

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/d/b;->cD(Ljava/lang/String;)Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    .line 3
    invoke-static {p0, v0}, Lcom/kwad/sdk/commercial/d/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/c/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 4
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static bl(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/commercial/d/b;->Bu()Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    const-string v1, "toOpenApp"

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/d/b;->cD(Ljava/lang/String;)Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    .line 3
    invoke-static {p0, v0}, Lcom/kwad/sdk/commercial/d/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/c/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 4
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static bm(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/commercial/d/b;->Bu()Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    const-string v1, "toInstallApp"

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/d/b;->cD(Ljava/lang/String;)Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    .line 3
    invoke-static {p0, v0}, Lcom/kwad/sdk/commercial/d/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/c/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 4
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static bn(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/commercial/d/b;->Bu()Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    const-string v1, "toDownloadDialog"

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/d/b;->cD(Ljava/lang/String;)Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    .line 3
    invoke-static {p0, v0}, Lcom/kwad/sdk/commercial/d/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/c/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 4
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static bo(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/commercial/d/b;->Bu()Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    const-string v1, "toDownloadThirdDialog"

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/d/b;->cD(Ljava/lang/String;)Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    .line 3
    invoke-static {p0, v0}, Lcom/kwad/sdk/commercial/d/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/c/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 4
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static bp(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/commercial/d/b;->Bu()Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    const-string v1, "toDownloadPage"

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/d/b;->cD(Ljava/lang/String;)Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    .line 3
    invoke-static {p0, v0}, Lcom/kwad/sdk/commercial/d/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/c/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 4
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static bq(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/commercial/d/b;->Bu()Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    const-string v1, "toDownloadPause"

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/d/b;->cD(Ljava/lang/String;)Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    .line 3
    invoke-static {p0, v0}, Lcom/kwad/sdk/commercial/d/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/c/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 4
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static br(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/commercial/d/b;->Bu()Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    const-string v1, "toDownloadResume"

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/d/b;->cD(Ljava/lang/String;)Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    .line 3
    invoke-static {p0, v0}, Lcom/kwad/sdk/commercial/d/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/c/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 4
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static bs(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/commercial/d/b;->Bu()Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    const-string v1, "toDownloadNoNet"

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/d/b;->cD(Ljava/lang/String;)Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    .line 3
    invoke-static {p0, v0}, Lcom/kwad/sdk/commercial/d/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/c/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 4
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static bt(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/commercial/d/b;->Bu()Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    const-string v1, "toDoNoting"

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/d/b;->cD(Ljava/lang/String;)Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    .line 3
    invoke-static {p0, v0}, Lcom/kwad/sdk/commercial/d/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/c/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 4
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static bu(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/commercial/d/b;->Bu()Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    const-string v1, "toOpenAppDialog"

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/d/b;->cD(Ljava/lang/String;)Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    .line 3
    invoke-static {p0, v0}, Lcom/kwad/sdk/commercial/d/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/c/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 4
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static bv(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/commercial/d/b;->Bu()Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    const-string v1, "toOpenDeeplinkDialog"

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/d/b;->cD(Ljava/lang/String;)Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    .line 3
    invoke-static {p0, v0}, Lcom/kwad/sdk/commercial/d/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/c/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 4
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static bw(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/commercial/d/b;->Bu()Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    const-string v1, "toH5PageDialog"

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/d/b;->cD(Ljava/lang/String;)Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    .line 3
    invoke-static {p0, v0}, Lcom/kwad/sdk/commercial/d/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/c/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 4
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static bx(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/commercial/d/b;->Bu()Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    const-string v1, "toMiddlePageDialog"

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/d/b;->cD(Ljava/lang/String;)Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    .line 3
    invoke-static {p0, v0}, Lcom/kwad/sdk/commercial/d/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/c/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 4
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static by(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/commercial/d/b;->Bu()Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    const-string v1, "toSmallAppDialog"

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/d/b;->cD(Ljava/lang/String;)Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    .line 3
    invoke-static {p0, v0}, Lcom/kwad/sdk/commercial/d/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/c/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 4
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static f(Lcom/kwad/sdk/core/response/model/AdTemplate;Z)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/commercial/d/b;->Bu()Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    const-string v1, "adUserClick"

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/d/b;->cD(Ljava/lang/String;)Lcom/kwad/sdk/commercial/d/b;

    move-result-object v0

    .line 3
    invoke-virtual {v0, p1}, Lcom/kwad/sdk/commercial/d/b;->bk(Z)Lcom/kwad/sdk/commercial/d/b;

    move-result-object p1

    .line 4
    invoke-static {p0, p1}, Lcom/kwad/sdk/commercial/d/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/c/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 5
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method
