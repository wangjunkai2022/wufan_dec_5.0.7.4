.class public Lcom/kwad/components/ad/interstitial/e/b;
.super Lcom/kwad/sdk/mvp/Presenter;
.source "SourceFile"


# instance fields
.field public jK:Lcom/kwad/components/ad/interstitial/e/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/mvp/Presenter;-><init>()V

    return-void
.end method


# virtual methods
.method public aj()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->aj()V

    .line 2
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->Kf()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/ad/interstitial/e/c;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-void
.end method

.method public cP()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->Ke()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/sdk/mvp/Presenter;

    .line 3
    instance-of v2, v1, Lcom/kwad/components/ad/interstitial/e/b;

    if-eqz v2, :cond_1

    .line 4
    check-cast v1, Lcom/kwad/components/ad/interstitial/e/b;

    .line 5
    invoke-virtual {v1}, Lcom/kwad/components/ad/interstitial/e/b;->cP()V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public cQ()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->Ke()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/sdk/mvp/Presenter;

    .line 3
    instance-of v2, v1, Lcom/kwad/components/ad/interstitial/e/b;

    if-eqz v2, :cond_1

    .line 4
    check-cast v1, Lcom/kwad/components/ad/interstitial/e/b;

    .line 5
    invoke-virtual {v1}, Lcom/kwad/components/ad/interstitial/e/b;->cQ()V

    goto :goto_0

    :cond_2
    return-void
.end method
