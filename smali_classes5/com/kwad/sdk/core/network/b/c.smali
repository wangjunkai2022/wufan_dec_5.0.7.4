.class public final Lcom/kwad/sdk/core/network/b/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static ET()Lcom/kwad/sdk/core/network/b/b;
    .locals 1

    .line 1
    const-class v0, Lcom/kwad/sdk/service/a/h;

    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/h;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/kwad/sdk/service/a/h;->zp()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Lcom/kwad/sdk/core/network/b/d;

    invoke-direct {v0}, Lcom/kwad/sdk/core/network/b/d;-><init>()V

    return-object v0

    .line 4
    :cond_0
    new-instance v0, Lcom/kwad/sdk/core/network/b/a;

    invoke-direct {v0}, Lcom/kwad/sdk/core/network/b/a;-><init>()V

    return-object v0
.end method
