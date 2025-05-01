.class final Lcom/kwad/components/core/n/b/a/i$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/n/b/a/i$1;->a(Lcom/kwad/sdk/core/NetworkMonitor$NetworkState;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Nr:Lcom/kwad/components/core/n/b/a/i$1;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/n/b/a/i$1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/n/b/a/i$1$1;->Nr:Lcom/kwad/components/core/n/b/a/i$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/i$1$1;->Nr:Lcom/kwad/components/core/n/b/a/i$1;

    iget-object v1, v0, Lcom/kwad/components/core/n/b/a/i$1;->Nq:Lcom/kwad/components/core/n/b/a/i;

    iget-object v0, v0, Lcom/kwad/components/core/n/b/a/i$1;->gq:Landroid/content/Context;

    invoke-virtual {v1, v0}, Lcom/kwad/components/core/n/b/a/i;->getNetworkType(Landroid/content/Context;)I

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/kwad/components/core/n/b/a/i$1$1;->Nr:Lcom/kwad/components/core/n/b/a/i$1;

    iget-object v1, v1, Lcom/kwad/components/core/n/b/a/i$1;->Nq:Lcom/kwad/components/core/n/b/a/i;

    invoke-static {v1}, Lcom/kwad/components/core/n/b/a/i;->a(Lcom/kwad/components/core/n/b/a/i;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/kwad/components/offline/api/core/network/INetworkChangeListener;

    .line 3
    invoke-interface {v2, v0}, Lcom/kwad/components/offline/api/core/network/INetworkChangeListener;->networkChange(I)V

    goto :goto_0

    :cond_0
    return-void
.end method
