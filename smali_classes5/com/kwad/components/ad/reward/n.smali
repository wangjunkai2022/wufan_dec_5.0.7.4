.class public final Lcom/kwad/components/ad/reward/n;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(IILcom/kwad/components/ad/reward/g;Lcom/kwad/components/ad/reward/model/c;)V
    .locals 2

    const/4 v0, 0x1

    if-eqz p0, :cond_7

    if-eq p0, v0, :cond_3

    const/4 v1, 0x2

    if-eq p0, v1, :cond_0

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    .line 1
    iget-object p0, p2, Lcom/kwad/components/ad/reward/g;->pr:Lcom/kwad/components/ad/reward/l/b/a;

    invoke-virtual {p0}, Lcom/kwad/components/ad/reward/l/b/a;->jC()Z

    move-result p0

    if-eqz p0, :cond_4

    .line 2
    invoke-virtual {p3}, Lcom/kwad/components/ad/reward/model/c;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p0

    invoke-static {p0, v0}, Lcom/kwad/sdk/core/adlog/c;->l(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    return-void

    .line 3
    :cond_1
    iget-object p0, p2, Lcom/kwad/components/ad/reward/g;->pr:Lcom/kwad/components/ad/reward/l/b/a;

    invoke-virtual {p0}, Lcom/kwad/components/ad/reward/l/b/a;->jC()Z

    move-result p0

    if-eqz p0, :cond_2

    .line 4
    invoke-virtual {p3}, Lcom/kwad/components/ad/reward/model/c;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p0

    const/4 p1, 0x3

    invoke-static {p0, p1}, Lcom/kwad/sdk/core/adlog/c;->l(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    return-void

    .line 5
    :cond_2
    invoke-virtual {p3}, Lcom/kwad/components/ad/reward/model/c;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p0

    invoke-static {p0, v1}, Lcom/kwad/sdk/core/adlog/c;->l(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    goto :goto_0

    :cond_3
    if-nez p1, :cond_5

    .line 6
    iget-object p0, p2, Lcom/kwad/components/ad/reward/g;->ps:Lcom/kwad/components/ad/reward/l/a/a;

    invoke-virtual {p0}, Lcom/kwad/components/ad/reward/l/a/a;->jC()Z

    move-result p0

    if-eqz p0, :cond_4

    .line 7
    invoke-virtual {p3}, Lcom/kwad/components/ad/reward/model/c;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p0

    invoke-static {p0, v0}, Lcom/kwad/sdk/core/adlog/c;->l(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    :cond_4
    :goto_0
    return-void

    .line 8
    :cond_5
    iget-object p0, p2, Lcom/kwad/components/ad/reward/g;->ps:Lcom/kwad/components/ad/reward/l/a/a;

    invoke-virtual {p0}, Lcom/kwad/components/ad/reward/l/a/a;->jC()Z

    move-result p0

    if-eqz p0, :cond_6

    .line 9
    invoke-virtual {p3}, Lcom/kwad/components/ad/reward/model/c;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p0

    const/4 p1, 0x5

    invoke-static {p0, p1}, Lcom/kwad/sdk/core/adlog/c;->l(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    return-void

    .line 10
    :cond_6
    invoke-virtual {p3}, Lcom/kwad/components/ad/reward/model/c;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p0

    const/4 p1, 0x4

    invoke-static {p0, p1}, Lcom/kwad/sdk/core/adlog/c;->l(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    return-void

    .line 11
    :cond_7
    invoke-virtual {p3}, Lcom/kwad/components/ad/reward/model/c;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p0

    invoke-static {p0, v0}, Lcom/kwad/sdk/core/adlog/c;->l(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    return-void
.end method
