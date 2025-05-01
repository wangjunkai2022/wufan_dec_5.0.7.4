.class public final Lcom/kwad/components/offline/api/tk/TkLoggerReporter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/offline/api/tk/TkLoggerReporter$Holder;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/kwad/components/offline/api/tk/TkLoggerReporter$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/offline/api/tk/TkLoggerReporter;-><init>()V

    return-void
.end method

.method public static get()Lcom/kwad/components/offline/api/tk/TkLoggerReporter;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/components/offline/api/tk/TkLoggerReporter$Holder;->access$100()Lcom/kwad/components/offline/api/tk/TkLoggerReporter;

    move-result-object v0

    return-object v0
.end method

.method private reportEvent(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lcom/kwad/sdk/commercial/c;)V
    .locals 0

    .line 1
    invoke-static {}, Lcom/kwad/components/offline/api/OfflineHostProvider;->getApi()Lcom/kwad/components/offline/api/core/IOfflineHostApi;

    move-result-object p1

    invoke-interface {p1}, Lcom/kwad/components/offline/api/core/IOfflineHostApi;->loggerReporter()Lcom/kwad/components/offline/api/core/api/ILoggerReporter;

    move-result-object p1

    .line 2
    invoke-interface {p1, p4}, Lcom/kwad/components/offline/api/core/api/ILoggerReporter;->reportEvent(Lcom/kwad/sdk/commercial/c;)V

    return-void
.end method


# virtual methods
.method public final reportTKDownload(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/kwad/components/offline/api/OfflineHostProvider;->getApi()Lcom/kwad/components/offline/api/core/IOfflineHostApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/kwad/components/offline/api/core/IOfflineHostApi;->loggerReporter()Lcom/kwad/components/offline/api/core/api/ILoggerReporter;

    move-result-object v0

    invoke-static {}, Lcom/kwad/sdk/commercial/c;->Br()Lcom/kwad/sdk/commercial/c;

    move-result-object v1

    .line 2
    invoke-virtual {v1, p1}, Lcom/kwad/sdk/commercial/c;->cz(Ljava/lang/String;)Lcom/kwad/sdk/commercial/c;

    move-result-object p1

    const-wide v1, 0x3fb999999999999aL    # 0.1

    .line 3
    invoke-virtual {p1, v1, v2}, Lcom/kwad/sdk/commercial/c;->i(D)Lcom/kwad/sdk/commercial/c;

    move-result-object p1

    const-string v1, "ad_tk_download_performance"

    const-string v2, "download_state"

    .line 4
    invoke-virtual {p1, v1, v2}, Lcom/kwad/sdk/commercial/c;->N(Ljava/lang/String;Ljava/lang/String;)Lcom/kwad/sdk/commercial/c;

    move-result-object p1

    .line 5
    invoke-virtual {p1, p2}, Lcom/kwad/sdk/commercial/c;->h(Lorg/json/JSONObject;)Lcom/kwad/sdk/commercial/c;

    move-result-object p1

    .line 6
    invoke-interface {v0, p1}, Lcom/kwad/components/offline/api/core/api/ILoggerReporter;->reportEvent(Lcom/kwad/sdk/commercial/c;)V

    return-void
.end method

.method public final reportTKPerform(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/kwad/components/offline/api/OfflineHostProvider;->getApi()Lcom/kwad/components/offline/api/core/IOfflineHostApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/kwad/components/offline/api/core/IOfflineHostApi;->loggerReporter()Lcom/kwad/components/offline/api/core/api/ILoggerReporter;

    move-result-object v0

    invoke-static {}, Lcom/kwad/sdk/commercial/c;->Br()Lcom/kwad/sdk/commercial/c;

    move-result-object v1

    .line 2
    invoke-virtual {v1, p1}, Lcom/kwad/sdk/commercial/c;->cz(Ljava/lang/String;)Lcom/kwad/sdk/commercial/c;

    move-result-object p1

    const-wide v1, 0x3fb999999999999aL    # 0.1

    .line 3
    invoke-virtual {p1, v1, v2}, Lcom/kwad/sdk/commercial/c;->i(D)Lcom/kwad/sdk/commercial/c;

    move-result-object p1

    const-wide v1, 0x3f50624dd2f1a9fcL    # 0.001

    .line 4
    invoke-virtual {p1, v1, v2}, Lcom/kwad/sdk/commercial/c;->k(D)Lcom/kwad/sdk/commercial/c;

    move-result-object p1

    const-string v1, "ad_tk_render_performance"

    const-string v2, "render_state"

    .line 5
    invoke-virtual {p1, v1, v2}, Lcom/kwad/sdk/commercial/c;->N(Ljava/lang/String;Ljava/lang/String;)Lcom/kwad/sdk/commercial/c;

    move-result-object p1

    .line 6
    invoke-virtual {p1, p2}, Lcom/kwad/sdk/commercial/c;->h(Lorg/json/JSONObject;)Lcom/kwad/sdk/commercial/c;

    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Lcom/kwad/components/offline/api/core/api/ILoggerReporter;->reportEvent(Lcom/kwad/sdk/commercial/c;)V

    return-void
.end method

.method public final reportTKSODownload(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/kwad/components/offline/api/OfflineHostProvider;->getApi()Lcom/kwad/components/offline/api/core/IOfflineHostApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/kwad/components/offline/api/core/IOfflineHostApi;->loggerReporter()Lcom/kwad/components/offline/api/core/api/ILoggerReporter;

    move-result-object v0

    invoke-static {}, Lcom/kwad/sdk/commercial/c;->Br()Lcom/kwad/sdk/commercial/c;

    move-result-object v1

    .line 2
    invoke-virtual {v1, p1}, Lcom/kwad/sdk/commercial/c;->cz(Ljava/lang/String;)Lcom/kwad/sdk/commercial/c;

    move-result-object p1

    const-wide v1, 0x3fb999999999999aL    # 0.1

    .line 3
    invoke-virtual {p1, v1, v2}, Lcom/kwad/sdk/commercial/c;->i(D)Lcom/kwad/sdk/commercial/c;

    move-result-object p1

    const-string v1, "ad_tk_so_download_event"

    const-string v2, "download_state"

    .line 4
    invoke-virtual {p1, v1, v2}, Lcom/kwad/sdk/commercial/c;->N(Ljava/lang/String;Ljava/lang/String;)Lcom/kwad/sdk/commercial/c;

    move-result-object p1

    .line 5
    invoke-virtual {p1, p2}, Lcom/kwad/sdk/commercial/c;->h(Lorg/json/JSONObject;)Lcom/kwad/sdk/commercial/c;

    move-result-object p1

    .line 6
    invoke-interface {v0, p1}, Lcom/kwad/components/offline/api/core/api/ILoggerReporter;->reportEvent(Lcom/kwad/sdk/commercial/c;)V

    return-void
.end method

.method public final reportTKSOLoad(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/kwad/components/offline/api/OfflineHostProvider;->getApi()Lcom/kwad/components/offline/api/core/IOfflineHostApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/kwad/components/offline/api/core/IOfflineHostApi;->loggerReporter()Lcom/kwad/components/offline/api/core/api/ILoggerReporter;

    move-result-object v0

    invoke-static {}, Lcom/kwad/sdk/commercial/c;->Br()Lcom/kwad/sdk/commercial/c;

    move-result-object v1

    .line 2
    invoke-virtual {v1, p1}, Lcom/kwad/sdk/commercial/c;->cz(Ljava/lang/String;)Lcom/kwad/sdk/commercial/c;

    move-result-object p1

    const-wide v1, 0x3fb999999999999aL    # 0.1

    .line 3
    invoke-virtual {p1, v1, v2}, Lcom/kwad/sdk/commercial/c;->i(D)Lcom/kwad/sdk/commercial/c;

    move-result-object p1

    const-string v1, "ad_tk_so_load_performence"

    const-string v2, "download_state"

    .line 4
    invoke-virtual {p1, v1, v2}, Lcom/kwad/sdk/commercial/c;->N(Ljava/lang/String;Ljava/lang/String;)Lcom/kwad/sdk/commercial/c;

    move-result-object p1

    .line 5
    invoke-virtual {p1, p2}, Lcom/kwad/sdk/commercial/c;->h(Lorg/json/JSONObject;)Lcom/kwad/sdk/commercial/c;

    move-result-object p1

    .line 6
    invoke-interface {v0, p1}, Lcom/kwad/components/offline/api/core/api/ILoggerReporter;->reportEvent(Lcom/kwad/sdk/commercial/c;)V

    return-void
.end method
