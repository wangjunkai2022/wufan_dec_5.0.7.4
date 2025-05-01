.class public final Lcom/kwad/sdk/core/b/a/ck;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static Ej()V
    .locals 3
    .annotation build Lcom/ksad/annotation/invoker/InvokeBy;
        invokerClass = Lcom/kwad/sdk/core/b/a/fr;
        methodId = "registerHolder"
    .end annotation

    .line 1
    invoke-static {}, Lcom/kwad/sdk/core/b/a/fr;->Ek()Ljava/util/Map;

    move-result-object v0

    const-class v1, Lcom/kwad/components/ad/splashscreen/monitor/SplashMonitorInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/jd;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/jd;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-static {}, Lcom/kwad/sdk/core/b/a/fr;->Ek()Ljava/util/Map;

    move-result-object v0

    const-class v1, Lcom/kwad/components/ad/splashscreen/local/a;

    new-instance v2, Lcom/kwad/sdk/core/b/a/jc;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/jc;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    invoke-static {}, Lcom/kwad/sdk/core/b/a/fr;->Ek()Ljava/util/Map;

    move-result-object v0

    const-class v1, Lcom/kwad/components/ad/splashscreen/SplashPreloadManager$PreLoadItem;

    new-instance v2, Lcom/kwad/sdk/core/b/a/hv;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/hv;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    invoke-static {}, Lcom/kwad/sdk/core/b/a/fr;->Ek()Ljava/util/Map;

    move-result-object v0

    const-class v1, Lcom/kwad/components/ad/splashscreen/monitor/SplashWebMonitorInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/jk;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/jk;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    invoke-static {}, Lcom/kwad/sdk/core/b/a/fr;->Ek()Ljava/util/Map;

    move-result-object v0

    const-class v1, Lcom/kwad/components/ad/splashscreen/local/SplashSkipViewModel;

    new-instance v2, Lcom/kwad/sdk/core/b/a/jh;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/jh;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
