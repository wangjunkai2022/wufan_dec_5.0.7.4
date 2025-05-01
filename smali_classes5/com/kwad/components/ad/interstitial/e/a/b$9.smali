.class final Lcom/kwad/components/ad/interstitial/e/a/b$9;
.super Lcom/kwad/sdk/core/h/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/ad/interstitial/e/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic li:Lcom/kwad/components/ad/interstitial/e/a/b;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/interstitial/e/a/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/e/a/b$9;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-direct {p0}, Lcom/kwad/sdk/core/h/d;-><init>()V

    return-void
.end method


# virtual methods
.method public final aM()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b$9;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/a/b;->d(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/core/webview/jshandler/aw;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b$9;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/a/b;->e(Lcom/kwad/components/ad/interstitial/e/a/b;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b$9;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {v0, v1}, Lcom/kwad/components/ad/interstitial/e/a/b;->a(Lcom/kwad/components/ad/interstitial/e/a/b;Z)Z

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b$9;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/a/b;->d(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/core/webview/jshandler/aw;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sV()V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b$9;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/a/b;->d(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/core/webview/jshandler/aw;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sW()V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b$9;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/a/b;->d(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/core/webview/jshandler/aw;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b$9;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/a/b;->d(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/core/webview/jshandler/aw;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sZ()V

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b$9;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/a/b;->f(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/h/a/a/b;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b$9;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/a/b;->f(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/h/a/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/ad/h/a/a/b;->eI()V

    .line 9
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b$9;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/a/b;->g(Lcom/kwad/components/ad/interstitial/e/a/b;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 10
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b$9;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/a/b;->h(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->io:Lcom/kwad/components/ad/interstitial/d;

    invoke-virtual {v0}, Lcom/kwad/components/ad/interstitial/d;->getTimerHelper()Lcom/kwad/sdk/utils/bn;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/sdk/utils/bn;->startTiming()V

    .line 11
    :cond_3
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b$9;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/a/b;->g(Lcom/kwad/components/ad/interstitial/e/a/b;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b$9;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/a/b;->i(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v0

    iget-boolean v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->jO:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b$9;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    .line 12
    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/a/b;->j(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->ie:Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;

    if-eqz v0, :cond_4

    .line 13
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b$9;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/a/b;->k(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->ie:Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;

    invoke-interface {v0}, Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;->onAdShow()V

    .line 14
    invoke-static {}, Lcom/kwad/components/ad/interstitial/report/c;->dR()Lcom/kwad/components/ad/interstitial/report/c;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/components/ad/interstitial/e/a/b$9;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {v2}, Lcom/kwad/components/ad/interstitial/e/a/b;->l(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v2

    iget-object v2, v2, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v3, 0x3

    invoke-virtual {v0, v2, v3}, Lcom/kwad/components/ad/interstitial/report/c;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    .line 15
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b$9;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {v0, v1}, Lcom/kwad/components/ad/interstitial/e/a/b;->b(Lcom/kwad/components/ad/interstitial/e/a/b;Z)Z

    :cond_4
    return-void
.end method

.method public final aN()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b$9;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/a/b;->d(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/core/webview/jshandler/aw;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b$9;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/a/b;->d(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/core/webview/jshandler/aw;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->ta()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b$9;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/a/b;->f(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/h/a/a/b;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b$9;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/a/b;->f(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/h/a/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/ad/h/a/a/b;->eH()V

    :cond_1
    return-void
.end method
