.class public final Lcom/kwad/components/ad/splashscreen/monitor/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;JILjava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;

    invoke-direct {v0}, Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;-><init>()V

    const-string v1, "webview_timeout"

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;->setEvent(Ljava/lang/String;)Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;

    move-result-object v0

    const-string v1, "ad_splash"

    .line 3
    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;->setSceneId(Ljava/lang/String;)Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;

    move-result-object v0

    .line 4
    invoke-virtual {v0, p2, p3}, Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;->setDurationMs(J)Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;

    move-result-object p2

    .line 5
    invoke-virtual {p2, p4}, Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;->setTimeType(I)Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;

    move-result-object p2

    .line 6
    invoke-virtual {p2, p1}, Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;->setUrl(Ljava/lang/String;)Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;

    move-result-object p1

    .line 7
    invoke-virtual {p1, p5}, Lcom/kwad/sdk/commercial/c/a;->setErrorMsg(Ljava/lang/String;)Lcom/kwad/sdk/commercial/c/a;

    move-result-object p1

    .line 8
    invoke-virtual {p1, p0}, Lcom/kwad/sdk/commercial/c/a;->setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/c/a;

    move-result-object p0

    .line 9
    invoke-static {p0}, Lcom/kwad/sdk/commercial/b;->f(Lcom/kwad/sdk/commercial/c/a;)V

    return-void
.end method

.method public static ag(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;

    invoke-direct {v0}, Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;-><init>()V

    const-string v1, "ad_show"

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;->setEvent(Ljava/lang/String;)Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;

    move-result-object v0

    const-string v1, "ad_splash"

    .line 3
    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;->setSceneId(Ljava/lang/String;)Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;

    move-result-object v0

    .line 4
    invoke-virtual {v0, p0}, Lcom/kwad/sdk/commercial/c/a;->setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/c/a;

    move-result-object p0

    .line 5
    invoke-static {p0}, Lcom/kwad/sdk/commercial/b;->f(Lcom/kwad/sdk/commercial/c/a;)V

    return-void
.end method

.method public static ah(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;

    invoke-direct {v0}, Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;-><init>()V

    const-string v1, "webview_init"

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;->setEvent(Ljava/lang/String;)Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;

    move-result-object v0

    const-string v1, "ad_splash"

    .line 3
    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;->setSceneId(Ljava/lang/String;)Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;

    move-result-object v0

    .line 4
    invoke-virtual {v0, p0}, Lcom/kwad/sdk/commercial/c/a;->setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/c/a;

    move-result-object p0

    .line 5
    invoke-static {p0}, Lcom/kwad/sdk/commercial/b;->f(Lcom/kwad/sdk/commercial/c/a;)V

    return-void
.end method

.method public static b(Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;J)V
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;

    invoke-direct {v0}, Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;-><init>()V

    const-string v1, "webview_load_finish"

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;->setEvent(Ljava/lang/String;)Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;

    move-result-object v0

    const-string v1, "ad_splash"

    .line 3
    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;->setSceneId(Ljava/lang/String;)Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;

    move-result-object v0

    .line 4
    invoke-virtual {v0, p2, p3}, Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;->setDurationMs(J)Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;

    move-result-object p2

    .line 5
    invoke-virtual {p2, p1}, Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;->setUrl(Ljava/lang/String;)Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;

    move-result-object p1

    .line 6
    invoke-virtual {p1, p0}, Lcom/kwad/sdk/commercial/c/a;->setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/c/a;

    move-result-object p0

    .line 7
    invoke-static {p0}, Lcom/kwad/sdk/commercial/b;->f(Lcom/kwad/sdk/commercial/c/a;)V

    return-void
.end method

.method public static d(Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;

    invoke-direct {v0}, Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;-><init>()V

    const-string v1, "webview_load_url"

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;->setEvent(Ljava/lang/String;)Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;

    move-result-object v0

    const-string v1, "ad_splash"

    .line 3
    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;->setSceneId(Ljava/lang/String;)Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;

    move-result-object v0

    .line 4
    invoke-virtual {v0, p0}, Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;->setUrl(Ljava/lang/String;)Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;

    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lcom/kwad/sdk/commercial/c/a;->setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/c/a;

    move-result-object p0

    .line 6
    invoke-static {p0}, Lcom/kwad/sdk/commercial/b;->f(Lcom/kwad/sdk/commercial/c/a;)V

    return-void
.end method
