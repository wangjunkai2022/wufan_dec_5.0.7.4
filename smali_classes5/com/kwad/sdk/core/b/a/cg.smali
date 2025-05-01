.class public final Lcom/kwad/sdk/core/b/a/cg;
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

    const-class v1, Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/dv;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/dv;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-static {}, Lcom/kwad/sdk/core/b/a/fr;->Ek()Ljava/util/Map;

    move-result-object v0

    const-class v1, Lcom/kwad/components/ad/feed/monitor/FeedErrorInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/dr;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/dr;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    invoke-static {}, Lcom/kwad/sdk/core/b/a/fr;->Ek()Ljava/util/Map;

    move-result-object v0

    const-class v1, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/dt;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/dt;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    invoke-static {}, Lcom/kwad/sdk/core/b/a/fr;->Ek()Ljava/util/Map;

    move-result-object v0

    const-class v1, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo$a;

    new-instance v2, Lcom/kwad/sdk/core/b/a/gf;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/gf;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
