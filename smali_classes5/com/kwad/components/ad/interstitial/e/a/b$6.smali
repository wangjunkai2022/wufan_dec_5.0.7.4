.class final Lcom/kwad/components/ad/interstitial/e/a/b$6;
.super Lcom/kwad/components/core/webview/jshandler/v;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/interstitial/e/a/b;->dJ()Lcom/kwad/components/core/webview/jshandler/v;
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
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/e/a/b$6;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-direct {p0}, Lcom/kwad/components/core/webview/jshandler/v;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/components/core/webview/tachikoma/b/x;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/components/core/webview/jshandler/v;->a(Lcom/kwad/components/core/webview/tachikoma/b/x;)V

    .line 2
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/e/a/b$6;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {p1}, Lcom/kwad/components/ad/interstitial/e/a/b;->V(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object p1

    iget-boolean p1, p1, Lcom/kwad/components/ad/interstitial/e/c;->jO:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/e/a/b$6;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {p1}, Lcom/kwad/components/ad/interstitial/e/a/b;->W(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object p1

    iget-object p1, p1, Lcom/kwad/components/ad/interstitial/e/c;->ie:Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/e/a/b$6;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {p1}, Lcom/kwad/components/ad/interstitial/e/a/b;->X(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object p1

    iget-object p1, p1, Lcom/kwad/components/ad/interstitial/e/c;->ie:Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;

    invoke-interface {p1}, Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;->onVideoPlayStart()V

    :cond_0
    return-void
.end method

.method public final c(Lcom/kwad/components/core/webview/tachikoma/b/x;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/components/core/webview/jshandler/v;->c(Lcom/kwad/components/core/webview/tachikoma/b/x;)V

    .line 2
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/e/a/b$6;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {p1}, Lcom/kwad/components/ad/interstitial/e/a/b;->Z(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object p1

    iget-boolean p1, p1, Lcom/kwad/components/ad/interstitial/e/c;->jO:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/e/a/b$6;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {p1}, Lcom/kwad/components/ad/interstitial/e/a/b;->aa(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object p1

    iget-object p1, p1, Lcom/kwad/components/ad/interstitial/e/c;->ie:Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/e/a/b$6;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {p1}, Lcom/kwad/components/ad/interstitial/e/a/b;->ab(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object p1

    iget-object p1, p1, Lcom/kwad/components/ad/interstitial/e/c;->ie:Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;

    invoke-interface {p1}, Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;->onVideoPlayEnd()V

    :cond_0
    return-void
.end method

.method public final d(Lcom/kwad/components/core/webview/tachikoma/b/x;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/components/core/webview/jshandler/v;->d(Lcom/kwad/components/core/webview/tachikoma/b/x;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b$6;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/a/b;->Y(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget p1, p1, Lcom/kwad/components/core/webview/tachikoma/b/x;->nF:I

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Lcom/kwad/sdk/core/response/model/AdTemplate;->setmCurPlayTime(J)V

    return-void
.end method
