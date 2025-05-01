.class public final Lcom/kwad/sdk/core/b/a/ci;
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

    const-class v1, Lcom/kwad/components/ad/interstitial/c/a;

    new-instance v2, Lcom/kwad/sdk/core/b/a/fg;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/fg;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-static {}, Lcom/kwad/sdk/core/b/a/fr;->Ek()Ljava/util/Map;

    move-result-object v0

    const-class v1, Lcom/kwad/components/ad/interstitial/c/b;

    new-instance v2, Lcom/kwad/sdk/core/b/a/fj;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/fj;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    invoke-static {}, Lcom/kwad/sdk/core/b/a/fr;->Ek()Ljava/util/Map;

    move-result-object v0

    const-class v1, Lcom/kwad/components/ad/interstitial/d/a;

    new-instance v2, Lcom/kwad/sdk/core/b/a/fh;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/fh;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    invoke-static {}, Lcom/kwad/sdk/core/b/a/fr;->Ek()Ljava/util/Map;

    move-result-object v0

    const-class v1, Lcom/kwad/components/ad/h/a/a/b$a;

    new-instance v2, Lcom/kwad/sdk/core/b/a/kc;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/kc;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    invoke-static {}, Lcom/kwad/sdk/core/b/a/fr;->Ek()Ljava/util/Map;

    move-result-object v0

    const-class v1, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/fl;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/fl;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    invoke-static {}, Lcom/kwad/sdk/core/b/a/fr;->Ek()Ljava/util/Map;

    move-result-object v0

    const-class v1, Lcom/kwad/components/ad/interstitial/report/realtime/model/InterstitialRealTimeInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/fk;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/fk;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
