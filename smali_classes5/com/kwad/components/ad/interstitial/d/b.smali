.class public final Lcom/kwad/components/ad/interstitial/d/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static k(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/b;->cj(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdMatrixInfo$InterstitialCardInfo;

    move-result-object p0

    iget-boolean p0, p0, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$InterstitialCardInfo;->closeAfterClick:Z

    if-nez p0, :cond_1

    .line 2
    invoke-static {}, Lcom/kwad/components/ad/interstitial/b/b;->cK()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method
