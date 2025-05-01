.class public final Lcom/kwad/components/ad/interstitial/f/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static d(Lcom/kwad/components/ad/interstitial/e/c;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/c;->io:Lcom/kwad/components/ad/interstitial/d;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-virtual {v0}, Landroid/app/AlertDialog;->getOwnerActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 3
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    .line 4
    :cond_1
    iget-object v2, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v2

    .line 5
    invoke-static {}, Lcom/kwad/components/ad/interstitial/c/b;->cM()I

    move-result v3

    .line 6
    invoke-static {}, Lcom/kwad/components/ad/interstitial/c/b;->cN()I

    move-result v4

    .line 7
    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/a;->co(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v5

    if-le v3, v5, :cond_3

    .line 8
    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/a;->cp(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v3

    if-ge v4, v3, :cond_3

    .line 9
    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/a;->cq(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-ne v3, v4, :cond_2

    .line 10
    invoke-static {p0}, Lcom/kwad/components/ad/interstitial/g/b;->e(Lcom/kwad/components/ad/interstitial/e/c;)V

    return v5

    .line 11
    :cond_2
    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/a;->cq(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v3

    if-ne v3, v5, :cond_3

    .line 12
    new-instance v1, Lcom/kwad/components/core/page/widget/a;

    .line 13
    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/a;->cr(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/kwad/components/ad/interstitial/f/a$1;

    invoke-direct {v3, p0}, Lcom/kwad/components/ad/interstitial/f/a$1;-><init>(Lcom/kwad/components/ad/interstitial/e/c;)V

    invoke-direct {v1, v0, v2, v3}, Lcom/kwad/components/core/page/widget/a;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/kwad/components/core/page/widget/a$a;)V

    .line 14
    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    .line 15
    iget-object p0, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    new-instance v1, Lcom/kwad/sdk/core/adlog/c/b;

    invoke-direct {v1}, Lcom/kwad/sdk/core/adlog/c/b;-><init>()V

    const/16 v2, 0x95

    .line 16
    invoke-virtual {v1, v2}, Lcom/kwad/sdk/core/adlog/c/b;->cM(I)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v1

    const/16 v2, 0x8

    .line 17
    invoke-virtual {v1, v2}, Lcom/kwad/sdk/core/adlog/c/b;->cR(I)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v1

    .line 18
    invoke-static {p0, v0, v1}, Lcom/kwad/sdk/core/adlog/c;->d(Lcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;Lcom/kwad/sdk/core/adlog/c/b;)V

    return v5

    :cond_3
    :goto_0
    return v1
.end method
