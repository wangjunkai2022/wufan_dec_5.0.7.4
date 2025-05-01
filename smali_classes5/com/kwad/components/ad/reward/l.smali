.class public final Lcom/kwad/components/ad/reward/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(ILcom/kwad/components/ad/reward/g;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/components/ad/reward/l$1;

    invoke-direct {v0, p0, p1}, Lcom/kwad/components/ad/reward/l$1;-><init>(ILcom/kwad/components/ad/reward/g;)V

    const/4 v1, 0x1

    if-ne p0, v1, :cond_0

    .line 2
    invoke-static {p1}, Lcom/kwad/components/ad/reward/l;->i(Lcom/kwad/components/ad/reward/g;)Lcom/kwad/sdk/core/network/o;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/kwad/sdk/core/network/l;->request(Lcom/kwad/sdk/core/network/g;)V

    return-void

    :cond_0
    const/4 v1, 0x2

    if-ne p0, v1, :cond_1

    .line 3
    invoke-static {p1}, Lcom/kwad/components/ad/reward/l;->j(Lcom/kwad/components/ad/reward/g;)Lcom/kwad/sdk/core/network/o;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/kwad/sdk/core/network/l;->request(Lcom/kwad/sdk/core/network/g;)V

    :cond_1
    return-void
.end method

.method public static a(Lcom/kwad/components/ad/reward/g;JJJ)V
    .locals 7

    .line 4
    invoke-static {p0}, Lcom/kwad/components/ad/reward/l;->k(Lcom/kwad/components/ad/reward/g;)Z

    move-result v0

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    .line 5
    iget-object v3, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v3}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v3

    invoke-static {v3}, Lcom/kwad/sdk/core/response/b/a;->cZ(Lcom/kwad/sdk/core/response/model/AdInfo;)J

    move-result-wide v3

    goto :goto_0

    :cond_0
    move-wide v3, v1

    .line 6
    :goto_0
    iget-boolean v5, p0, Lcom/kwad/components/ad/reward/g;->pi:Z

    if-nez v5, :cond_2

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/g;->mCheckExposureResult:Z

    if-eqz v0, :cond_2

    const-wide/16 v5, 0x320

    sub-long/2addr p3, v5

    sub-long/2addr p3, p5

    sub-long/2addr p3, v3

    cmp-long p5, p1, p3

    if-lez p5, :cond_2

    cmp-long p1, v3, v1

    if-lez p1, :cond_2

    .line 7
    iget-object p1, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 8
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p1

    .line 9
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->da(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p1

    const/4 p2, 0x1

    if-eqz p1, :cond_1

    .line 10
    iput p2, p0, Lcom/kwad/components/ad/reward/g;->ph:I

    const/4 p1, 0x2

    .line 11
    invoke-static {p1, p0}, Lcom/kwad/components/ad/reward/l;->a(ILcom/kwad/components/ad/reward/g;)V

    goto :goto_1

    .line 12
    :cond_1
    iget-object p1, p0, Lcom/kwad/components/ad/reward/g;->oJ:Lcom/kwad/components/ad/reward/e/b;

    invoke-interface {p1}, Lcom/kwad/components/ad/reward/e/b;->onRewardVerify()V

    .line 13
    :goto_1
    iput-boolean p2, p0, Lcom/kwad/components/ad/reward/g;->pi:Z

    :cond_2
    return-void
.end method

.method private static i(Lcom/kwad/components/ad/reward/g;)Lcom/kwad/sdk/core/network/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kwad/components/ad/reward/g;",
            ")",
            "Lcom/kwad/sdk/core/network/o<",
            "Lcom/kwad/components/core/request/e;",
            "Lcom/kwad/components/ad/reward/model/RewardCallBackRespInfo;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/kwad/components/ad/reward/l$2;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/l$2;-><init>(Lcom/kwad/components/ad/reward/g;)V

    return-object v0
.end method

.method private static j(Lcom/kwad/components/ad/reward/g;)Lcom/kwad/sdk/core/network/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kwad/components/ad/reward/g;",
            ")",
            "Lcom/kwad/sdk/core/network/o<",
            "Lcom/kwad/components/core/request/e;",
            "Lcom/kwad/components/ad/reward/model/RewardCallBackRespInfo;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/kwad/components/ad/reward/l$3;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/l$3;-><init>(Lcom/kwad/components/ad/reward/g;)V

    return-object v0
.end method

.method private static k(Lcom/kwad/components/ad/reward/g;)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/g;->pi:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 2
    :cond_0
    iget-object p0, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 3
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p0

    .line 4
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/a;->db(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    return v1
.end method
