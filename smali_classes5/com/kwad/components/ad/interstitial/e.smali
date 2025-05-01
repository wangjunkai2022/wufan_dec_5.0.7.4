.class public final Lcom/kwad/components/ad/interstitial/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static loadInterstitialAd(Lcom/kwad/sdk/api/KsScene;Lcom/kwad/sdk/api/KsLoadManager$InterstitialAdListener;)V
    .locals 6
    .param p0    # Lcom/kwad/sdk/api/KsScene;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/kwad/sdk/api/KsLoadManager$InterstitialAdListener;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-static {}, Lcom/kwad/sdk/l;->zJ()Lcom/kwad/sdk/l;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/sdk/l;->yY()Z

    move-result v0

    if-nez v0, :cond_0

    const-string p0, "KsAdInterstitialLoadManager"

    const-string v0, "loadInterstitialAd please init sdk first"

    .line 2
    invoke-static {p0, v0}, Lcom/kwad/sdk/core/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    new-instance p0, Lcom/kwad/components/ad/interstitial/e$1;

    invoke-direct {p0, p1}, Lcom/kwad/components/ad/interstitial/e$1;-><init>(Lcom/kwad/sdk/api/KsLoadManager$InterstitialAdListener;)V

    invoke-static {p0}, Lcom/kwad/sdk/utils/bo;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 4
    :cond_0
    invoke-static {p0}, Lcom/kwad/sdk/internal/api/SceneImpl;->covert(Lcom/kwad/sdk/api/KsScene;)Lcom/kwad/sdk/internal/api/SceneImpl;

    move-result-object p0

    .line 5
    invoke-static {p0}, Lcom/kwad/sdk/commercial/d/d;->b(Lcom/kwad/sdk/internal/api/SceneImpl;)V

    .line 6
    invoke-static {}, Lcom/kwad/components/core/s/m;->rI()Lcom/kwad/components/core/s/m;

    move-result-object v0

    const-string v1, "loadInterstitialAd"

    invoke-virtual {v0, p0, v1}, Lcom/kwad/components/core/s/m;->a(Lcom/kwad/sdk/internal/api/SceneImpl;Ljava/lang/String;)Z

    move-result v0

    .line 7
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    const/16 v3, 0xd

    .line 8
    invoke-virtual {p0, v3}, Lcom/kwad/sdk/internal/api/SceneImpl;->setAdStyle(I)V

    .line 9
    invoke-static {}, Lcom/kwad/components/ad/interstitial/report/c;->dR()Lcom/kwad/components/ad/interstitial/report/c;

    move-result-object v3

    invoke-virtual {p0}, Lcom/kwad/sdk/internal/api/SceneImpl;->getPosId()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lcom/kwad/components/ad/interstitial/report/c;->i(J)V

    .line 10
    invoke-static {}, Lcom/kwad/components/ad/KsAdLoadManager;->M()Lcom/kwad/components/ad/KsAdLoadManager;

    new-instance v3, Lcom/kwad/components/core/request/model/a$a;

    invoke-direct {v3}, Lcom/kwad/components/core/request/model/a$a;-><init>()V

    new-instance v4, Lcom/kwad/components/core/request/model/ImpInfo;

    invoke-direct {v4, p0}, Lcom/kwad/components/core/request/model/ImpInfo;-><init>(Lcom/kwad/sdk/internal/api/SceneImpl;)V

    .line 11
    invoke-virtual {v3, v4}, Lcom/kwad/components/core/request/model/a$a;->e(Lcom/kwad/components/core/request/model/ImpInfo;)Lcom/kwad/components/core/request/model/a$a;

    move-result-object v3

    .line 12
    invoke-virtual {v3, v0}, Lcom/kwad/components/core/request/model/a$a;->aJ(Z)Lcom/kwad/components/core/request/model/a$a;

    move-result-object v0

    new-instance v3, Lcom/kwad/components/ad/interstitial/e$2;

    invoke-direct {v3, p0, p1, v1, v2}, Lcom/kwad/components/ad/interstitial/e$2;-><init>(Lcom/kwad/sdk/internal/api/SceneImpl;Lcom/kwad/sdk/api/KsLoadManager$InterstitialAdListener;J)V

    .line 13
    invoke-virtual {v0, v3}, Lcom/kwad/components/core/request/model/a$a;->a(Lcom/kwad/components/core/request/c;)Lcom/kwad/components/core/request/model/a$a;

    move-result-object p0

    .line 14
    invoke-virtual {p0}, Lcom/kwad/components/core/request/model/a$a;->ra()Lcom/kwad/components/core/request/model/a;

    move-result-object p0

    .line 15
    invoke-static {p0}, Lcom/kwad/components/ad/KsAdLoadManager;->a(Lcom/kwad/components/core/request/model/a;)V

    return-void
.end method
