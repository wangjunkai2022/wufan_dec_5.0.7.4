.class public final Lcom/kwad/components/core/i/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private MG:Ljava/lang/Object;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kwad/components/core/i/d;->MG:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c(Lcom/kwad/components/core/i/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/i/d;->MG:Ljava/lang/Object;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/kwad/components/core/i/c;->getHost()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Lcom/kwad/components/core/i/c;->getHost()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/kwad/sdk/api/KsInnerAd;

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/i/d;->MG:Ljava/lang/Object;

    check-cast v0, Lcom/kwad/sdk/api/KsInnerAd$KsInnerAdInteractionListener;

    invoke-interface {v0, p1}, Lcom/kwad/sdk/api/KsInnerAd$KsInnerAdInteractionListener;->onAdClicked(Lcom/kwad/sdk/api/KsInnerAd;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public final d(Lcom/kwad/components/core/i/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/i/d;->MG:Ljava/lang/Object;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/kwad/components/core/i/c;->getHost()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Lcom/kwad/components/core/i/c;->getHost()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/kwad/sdk/api/KsInnerAd;

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/i/d;->MG:Ljava/lang/Object;

    check-cast v0, Lcom/kwad/sdk/api/KsInnerAd$KsInnerAdInteractionListener;

    invoke-interface {v0, p1}, Lcom/kwad/sdk/api/KsInnerAd$KsInnerAdInteractionListener;->onAdShow(Lcom/kwad/sdk/api/KsInnerAd;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public final destroy()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/kwad/components/core/i/d;->MG:Ljava/lang/Object;

    return-void
.end method
