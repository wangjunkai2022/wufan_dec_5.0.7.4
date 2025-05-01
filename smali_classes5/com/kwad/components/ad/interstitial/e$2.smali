.class final Lcom/kwad/components/ad/interstitial/e$2;
.super Lcom/kwad/components/core/request/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/interstitial/e;->loadInterstitialAd(Lcom/kwad/sdk/api/KsScene;Lcom/kwad/sdk/api/KsLoadManager$InterstitialAdListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic em:Lcom/kwad/sdk/internal/api/SceneImpl;

.field final synthetic ih:Lcom/kwad/sdk/api/KsLoadManager$InterstitialAdListener;

.field final synthetic ij:J


# direct methods
.method constructor <init>(Lcom/kwad/sdk/internal/api/SceneImpl;Lcom/kwad/sdk/api/KsLoadManager$InterstitialAdListener;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/e$2;->em:Lcom/kwad/sdk/internal/api/SceneImpl;

    iput-object p2, p0, Lcom/kwad/components/ad/interstitial/e$2;->ih:Lcom/kwad/sdk/api/KsLoadManager$InterstitialAdListener;

    iput-wide p3, p0, Lcom/kwad/components/ad/interstitial/e$2;->ij:J

    invoke-direct {p0}, Lcom/kwad/components/core/request/d;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/sdk/core/response/model/AdResultData;Z)V
    .locals 9
    .param p1    # Lcom/kwad/sdk/core/response/model/AdResultData;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    const-class v0, Lcom/kwad/components/core/n/a/b/a;

    invoke-virtual {p1}, Lcom/kwad/sdk/core/response/model/AdResultData;->getAdTemplateList()Ljava/util/List;

    move-result-object v1

    .line 2
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    const-string v3, "onInterstitialAdCacheFailed"

    const-string v4, "insertAd_"

    if-eqz v2, :cond_1

    .line 3
    sget-object p2, Lcom/kwad/sdk/core/network/e;->awK:Lcom/kwad/sdk/core/network/e;

    iget p2, p2, Lcom/kwad/sdk/core/network/e;->errorCode:I

    .line 4
    iget-object v0, p1, Lcom/kwad/sdk/core/response/model/BaseResultData;->testErrorMsg:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lcom/kwad/sdk/core/network/e;->awK:Lcom/kwad/sdk/core/network/e;

    iget-object p1, p1, Lcom/kwad/sdk/core/network/e;->msg:Ljava/lang/String;

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p1, Lcom/kwad/sdk/core/response/model/BaseResultData;->testErrorMsg:Ljava/lang/String;

    .line 6
    :goto_0
    invoke-virtual {p0, p2, p1}, Lcom/kwad/components/ad/interstitial/e$2;->onError(ILjava/lang/String;)V

    .line 7
    invoke-static {v4, v3}, Lcom/kwad/sdk/utils/i;->ao(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 8
    :cond_1
    new-instance v2, Lcom/kwad/components/ad/interstitial/e$2$2;

    invoke-direct {v2, p0, v1}, Lcom/kwad/components/ad/interstitial/e$2$2;-><init>(Lcom/kwad/components/ad/interstitial/e$2;Ljava/util/List;)V

    invoke-static {v2}, Lcom/kwad/sdk/utils/bo;->runOnUiThread(Ljava/lang/Runnable;)V

    const/4 v2, 0x0

    .line 9
    :try_start_0
    invoke-static {v0}, Lcom/kwad/sdk/components/c;->f(Ljava/lang/Class;)Lcom/kwad/sdk/components/a;

    move-result-object v5

    if-eqz v5, :cond_2

    .line 10
    invoke-static {v0}, Lcom/kwad/sdk/components/c;->f(Ljava/lang/Class;)Lcom/kwad/sdk/components/a;

    .line 11
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    :catch_0
    :cond_2
    invoke-static {}, Lcom/kwad/components/ad/interstitial/report/c;->dR()Lcom/kwad/components/ad/interstitial/report/c;

    move-result-object v0

    .line 14
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {v0, v5, p2}, Lcom/kwad/components/ad/interstitial/report/c;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Z)V

    .line 15
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e$2;->em:Lcom/kwad/sdk/internal/api/SceneImpl;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    invoke-static {v0, v5}, Lcom/kwad/sdk/commercial/d/d;->a(Lcom/kwad/sdk/internal/api/SceneImpl;I)V

    .line 16
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 17
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 18
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_3
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/kwad/sdk/core/response/model/AdTemplate;

    if-eqz v6, :cond_3

    .line 19
    iget-object v7, v6, Lcom/kwad/sdk/core/response/model/AdTemplate;->mAdScene:Lcom/kwad/sdk/internal/api/SceneImpl;

    if-nez v7, :cond_4

    .line 20
    iget-object v7, p0, Lcom/kwad/components/ad/interstitial/e$2;->em:Lcom/kwad/sdk/internal/api/SceneImpl;

    iput-object v7, v6, Lcom/kwad/sdk/core/response/model/AdTemplate;->mAdScene:Lcom/kwad/sdk/internal/api/SceneImpl;

    .line 21
    :cond_4
    invoke-static {v6}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v7

    .line 22
    invoke-static {v7}, Lcom/kwad/sdk/core/response/b/a;->K(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v7

    .line 23
    invoke-static {v6}, Lcom/kwad/sdk/core/response/b/b;->cU(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v8

    if-nez v8, :cond_5

    .line 24
    invoke-static {}, Lcom/kwad/components/ad/interstitial/report/realtime/a;->dV()Lcom/kwad/components/ad/interstitial/report/realtime/a;

    invoke-static {v6}, Lcom/kwad/components/ad/interstitial/report/realtime/a;->w(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 25
    :cond_5
    invoke-static {p1, v6}, Lcom/kwad/sdk/core/response/b/c;->a(Lcom/kwad/sdk/core/response/model/AdResultData;Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdResultData;

    move-result-object v8

    .line 26
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_7

    .line 27
    invoke-static {v6}, Lcom/kwad/components/ad/interstitial/a/a;->j(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v6

    .line 28
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->Ci()Z

    move-result v7

    if-nez v7, :cond_6

    if-eqz v6, :cond_3

    .line 29
    :cond_6
    new-instance v6, Lcom/kwad/components/ad/interstitial/b;

    iget-object v7, p0, Lcom/kwad/components/ad/interstitial/e$2;->em:Lcom/kwad/sdk/internal/api/SceneImpl;

    invoke-direct {v6, v7, v8}, Lcom/kwad/components/ad/interstitial/b;-><init>(Lcom/kwad/sdk/api/KsScene;Lcom/kwad/sdk/core/response/model/AdResultData;)V

    .line 30
    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 31
    :cond_7
    new-instance v6, Lcom/kwad/components/ad/interstitial/b;

    iget-object v7, p0, Lcom/kwad/components/ad/interstitial/e$2;->em:Lcom/kwad/sdk/internal/api/SceneImpl;

    invoke-direct {v6, v7, v8}, Lcom/kwad/components/ad/interstitial/b;-><init>(Lcom/kwad/sdk/api/KsScene;Lcom/kwad/sdk/core/response/model/AdResultData;)V

    .line 32
    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 33
    :cond_8
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    if-nez v5, :cond_a

    .line 34
    sget-object p2, Lcom/kwad/sdk/core/network/e;->awK:Lcom/kwad/sdk/core/network/e;

    iget p2, p2, Lcom/kwad/sdk/core/network/e;->errorCode:I

    .line 35
    iget-object v0, p1, Lcom/kwad/sdk/core/response/model/BaseResultData;->testErrorMsg:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 36
    sget-object p1, Lcom/kwad/sdk/core/network/e;->awK:Lcom/kwad/sdk/core/network/e;

    iget-object p1, p1, Lcom/kwad/sdk/core/network/e;->msg:Ljava/lang/String;

    goto :goto_2

    :cond_9
    iget-object p1, p1, Lcom/kwad/sdk/core/response/model/BaseResultData;->testErrorMsg:Ljava/lang/String;

    .line 37
    :goto_2
    invoke-virtual {p0, p2, p1}, Lcom/kwad/components/ad/interstitial/e$2;->onError(ILjava/lang/String;)V

    .line 38
    invoke-static {}, Lcom/kwad/components/ad/interstitial/report/realtime/a;->dV()Lcom/kwad/components/ad/interstitial/report/realtime/a;

    sget-object p1, Lcom/kwad/sdk/core/network/e;->awK:Lcom/kwad/sdk/core/network/e;

    .line 39
    invoke-static {p1}, Lcom/kwad/components/ad/interstitial/report/realtime/a;->a(Lcom/kwad/sdk/core/network/e;)V

    .line 40
    invoke-static {v4, v3}, Lcom/kwad/sdk/utils/i;->ao(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 41
    :cond_a
    invoke-static {}, Lcom/kwad/components/ad/interstitial/report/c;->dR()Lcom/kwad/components/ad/interstitial/report/c;

    move-result-object p1

    .line 42
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {p1, v1, p2}, Lcom/kwad/components/ad/interstitial/report/c;->b(Lcom/kwad/sdk/core/response/model/AdTemplate;Z)V

    .line 43
    new-instance p1, Lcom/kwad/components/ad/interstitial/e$2$3;

    invoke-direct {p1, p0, v0}, Lcom/kwad/components/ad/interstitial/e$2$3;-><init>(Lcom/kwad/components/ad/interstitial/e$2;Ljava/util/List;)V

    invoke-static {p1}, Lcom/kwad/sdk/utils/bo;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final onError(ILjava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/kwad/components/ad/interstitial/report/c;->dR()Lcom/kwad/components/ad/interstitial/report/c;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e$2;->em:Lcom/kwad/sdk/internal/api/SceneImpl;

    invoke-virtual {v1}, Lcom/kwad/sdk/internal/api/SceneImpl;->getPosId()J

    move-result-wide v1

    invoke-virtual {v0, p1, p2, v1, v2}, Lcom/kwad/components/ad/interstitial/report/c;->a(ILjava/lang/String;J)V

    .line 2
    new-instance v0, Lcom/kwad/components/ad/interstitial/e$2$1;

    invoke-direct {v0, p0, p1, p2}, Lcom/kwad/components/ad/interstitial/e$2$1;-><init>(Lcom/kwad/components/ad/interstitial/e$2;ILjava/lang/String;)V

    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method
