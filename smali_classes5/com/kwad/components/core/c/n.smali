.class public final Lcom/kwad/components/core/c/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/c/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/kwad/components/core/request/model/a;Lcom/kwad/components/core/c/j;)V
    .locals 2
    .param p1    # Lcom/kwad/components/core/c/j;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    new-instance v0, Lcom/kwad/components/core/c/n$1;

    iget-object v1, p0, Lcom/kwad/components/core/request/model/a;->MX:Lcom/kwad/components/core/request/model/ImpInfo;

    invoke-direct {v0, v1, p0}, Lcom/kwad/components/core/c/n$1;-><init>(Lcom/kwad/components/core/request/model/ImpInfo;Lcom/kwad/components/core/request/model/a;)V

    .line 2
    invoke-virtual {v0, p1}, Lcom/kwad/sdk/core/network/l;->request(Lcom/kwad/sdk/core/network/g;)V

    return-void
.end method


# virtual methods
.method public final c(Lcom/kwad/components/core/request/model/a;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/core/c/j;

    invoke-direct {v0, p1}, Lcom/kwad/components/core/c/j;-><init>(Lcom/kwad/components/core/request/model/a;)V

    invoke-static {p1, v0}, Lcom/kwad/components/core/c/n;->a(Lcom/kwad/components/core/request/model/a;Lcom/kwad/components/core/c/j;)V

    return-void
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "StrategyNetworkOnlyFetcher"

    return-object v0
.end method
