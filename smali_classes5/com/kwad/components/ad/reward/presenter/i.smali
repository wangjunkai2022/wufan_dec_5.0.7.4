.class public final Lcom/kwad/components/ad/reward/presenter/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static x(Lcom/kwad/components/ad/reward/g;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v1

    .line 3
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->bI(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    iget-object p0, p0, Lcom/kwad/components/ad/reward/g;->oM:Lcom/kwad/components/core/playable/a;

    if-eqz p0, :cond_0

    .line 4
    invoke-virtual {p0}, Lcom/kwad/components/core/playable/a;->qF()Z

    move-result p0

    if-eqz p0, :cond_0

    return v3

    .line 5
    :cond_0
    invoke-static {v1}, Lcom/kwad/components/ad/reward/a/b;->k(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p0

    if-eqz p0, :cond_1

    return v3

    .line 6
    :cond_1
    iget-boolean p0, v0, Lcom/kwad/sdk/core/response/model/AdTemplate;->mXiaomiAppStoreDetailViewOpen:Z

    if-eqz p0, :cond_2

    return v3

    .line 7
    :cond_2
    invoke-static {}, Lcom/kwad/components/ad/reward/a/b;->gC()Z

    move-result p0

    const/4 v0, 0x1

    if-eqz p0, :cond_3

    return v0

    .line 8
    :cond_3
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->aE(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->as(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p0

    if-eqz p0, :cond_4

    return v0

    :cond_4
    return v3
.end method
