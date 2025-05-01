.class public final Lcom/kwad/sdk/core/b/a/ch;
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

    const-class v1, Lcom/kwad/components/ad/fullscreen/b/b;

    new-instance v2, Lcom/kwad/sdk/core/b/a/ga;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/ga;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
