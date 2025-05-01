.class public final Lcom/kwad/components/ad/reward/presenter/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static sh:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private static E(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/components/ad/reward/a/b;->k(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    .line 2
    invoke-static {p0, v0}, Lcom/kwad/sdk/core/response/b/e;->k(Lcom/kwad/sdk/core/response/model/AdTemplate;Z)Z

    move-result p0

    return p0
.end method

.method private static F(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/e;->F(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result p0

    return p0
.end method

.method private static M(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p0

    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/a;->aj(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p0

    return p0
.end method

.method private static a(Lcom/kwad/components/ad/reward/g;Lcom/kwad/components/ad/reward/h$b;)V
    .locals 8
    .param p1    # Lcom/kwad/components/ad/reward/h$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 43
    iget-object v3, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 44
    invoke-static {v3}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 45
    iget-object v4, p0, Lcom/kwad/components/ad/reward/g;->mReportExtData:Lorg/json/JSONObject;

    .line 46
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->ac(Lcom/kwad/sdk/core/response/model/AdInfo;)J

    move-result-wide v1

    const-wide/16 v5, 0x0

    cmp-long v7, v1, v5

    if-lez v7, :cond_0

    .line 47
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->L(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v0

    int-to-long v5, v0

    cmp-long v0, v5, v1

    if-lez v0, :cond_0

    .line 48
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v5, "\u89c2\u770b\u89c6\u9891"

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "s\u5373\u53ef\u83b7\u53d6\u5956\u52b1"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "\u89c2\u770b\u5b8c\u6574\u89c6\u9891\u5373\u53ef\u83b7\u53d6\u5956\u52b1"

    .line 49
    :goto_0
    invoke-static {p0, v0}, Lcom/kwad/components/ad/reward/h;->a(Lcom/kwad/components/ad/reward/g;Ljava/lang/String;)Lcom/kwad/components/ad/reward/h$c;

    move-result-object v6

    .line 50
    new-instance v7, Lcom/kwad/components/ad/reward/presenter/f$7;

    move-object v0, v7

    move-object v1, p0

    move-object v2, v6

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/kwad/components/ad/reward/presenter/f$7;-><init>(Lcom/kwad/components/ad/reward/g;Lcom/kwad/components/ad/reward/h$c;Lcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;Lcom/kwad/components/ad/reward/h$b;)V

    invoke-static {p0, v6, v7}, Lcom/kwad/components/ad/reward/g;->a(Lcom/kwad/components/ad/reward/g;Lcom/kwad/components/ad/reward/h$c;Lcom/kwad/components/ad/reward/h$a;)V

    return-void
.end method

.method public static a(Lcom/kwad/components/ad/reward/g;Z)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v1

    .line 3
    iget-boolean v2, p0, Lcom/kwad/components/ad/reward/g;->oZ:Z

    if-nez v2, :cond_0

    .line 4
    invoke-static {p0}, Lcom/kwad/components/ad/reward/presenter/f;->m(Lcom/kwad/components/ad/reward/g;)V

    return-void

    .line 5
    :cond_0
    invoke-static {p0}, Lcom/kwad/components/ad/reward/presenter/f;->o(Lcom/kwad/components/ad/reward/g;)V

    .line 6
    invoke-virtual {p0}, Lcom/kwad/components/ad/reward/g;->fO()Z

    move-result v2

    const/4 v3, 0x1

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 7
    invoke-static {v2}, Lcom/kwad/components/ad/reward/presenter/f;->M(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 8
    :goto_0
    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/f;->E(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v4

    if-nez v4, :cond_9

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/f;->F(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v0

    if-nez v0, :cond_9

    iget-wide v4, p0, Lcom/kwad/components/ad/reward/g;->pw:J

    .line 9
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->af(Lcom/kwad/sdk/core/response/model/AdInfo;)J

    move-result-wide v6

    cmp-long v0, v4, v6

    if-gez v0, :cond_2

    goto :goto_3

    .line 10
    :cond_2
    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/g;->pq:Z

    if-eqz v0, :cond_3

    .line 11
    invoke-virtual {p0}, Lcom/kwad/components/core/l/a;->hq()V

    return-void

    .line 12
    :cond_3
    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/g;->px:Z

    if-nez v0, :cond_6

    iget-wide v4, p0, Lcom/kwad/components/ad/reward/g;->pw:J

    .line 13
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->af(Lcom/kwad/sdk/core/response/model/AdInfo;)J

    move-result-wide v6

    cmp-long v0, v4, v6

    if-ltz v0, :cond_4

    goto :goto_1

    :cond_4
    if-eqz p1, :cond_5

    .line 14
    invoke-virtual {p0}, Lcom/kwad/components/core/l/a;->hq()V

    :cond_5
    return-void

    .line 15
    :cond_6
    :goto_1
    iget-boolean p1, p0, Lcom/kwad/components/ad/reward/g;->px:Z

    if-eqz p1, :cond_7

    const/4 p1, 0x2

    .line 16
    invoke-virtual {p0, p1}, Lcom/kwad/components/ad/reward/g;->L(I)V

    goto :goto_2

    .line 17
    :cond_7
    invoke-virtual {p0, v3}, Lcom/kwad/components/ad/reward/g;->L(I)V

    .line 18
    :goto_2
    invoke-static {p0}, Lcom/kwad/components/ad/reward/presenter/f;->w(Lcom/kwad/components/ad/reward/g;)V

    .line 19
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->bT(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 20
    invoke-static {p0}, Lcom/kwad/components/ad/reward/presenter/f;->n(Lcom/kwad/components/ad/reward/g;)V

    return-void

    .line 21
    :cond_8
    invoke-static {p0}, Lcom/kwad/components/ad/reward/presenter/f;->p(Lcom/kwad/components/ad/reward/g;)V

    .line 22
    invoke-static {p0}, Lcom/kwad/components/ad/reward/k;->h(Lcom/kwad/components/ad/reward/g;)V

    return-void

    :cond_9
    :goto_3
    if-eqz v2, :cond_a

    .line 23
    new-instance p1, Lcom/kwad/components/ad/reward/presenter/f$2;

    invoke-direct {p1, v1, p0}, Lcom/kwad/components/ad/reward/presenter/f$2;-><init>(Lcom/kwad/sdk/core/response/model/AdInfo;Lcom/kwad/components/ad/reward/g;)V

    invoke-static {p0, p1}, Lcom/kwad/components/ad/reward/presenter/f;->a(Lcom/kwad/components/ad/reward/g;Lcom/kwad/components/ad/reward/h$b;)V

    return-void

    .line 24
    :cond_a
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->bT(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p1

    if-eqz p1, :cond_b

    .line 25
    invoke-static {p0}, Lcom/kwad/components/ad/reward/presenter/f;->n(Lcom/kwad/components/ad/reward/g;)V

    return-void

    .line 26
    :cond_b
    invoke-static {p0}, Lcom/kwad/components/ad/reward/presenter/f;->p(Lcom/kwad/components/ad/reward/g;)V

    .line 27
    invoke-static {p0}, Lcom/kwad/components/ad/reward/k;->h(Lcom/kwad/components/ad/reward/g;)V

    return-void
.end method

.method private static a(Lcom/kwad/sdk/core/response/model/AdInfo;Ljava/lang/String;)Z
    .locals 3

    .line 37
    invoke-static {}, Lcom/kwad/components/ad/reward/a/b;->gC()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    const-string p0, "isEnable false"

    .line 38
    invoke-static {p1, p0}, Lcom/kwad/sdk/core/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    .line 39
    :cond_0
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/a;->cR(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_1

    return v1

    .line 40
    :cond_1
    invoke-static {}, Lcom/kwad/components/ad/reward/a/b;->gB()I

    move-result p0

    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "JumpDirectMaxCount "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-gtz p0, :cond_2

    return v1

    .line 42
    :cond_2
    invoke-static {}, Lcom/kwad/components/ad/reward/h/a;->cM()I

    move-result p1

    if-lt p1, p0, :cond_3

    return v1

    :cond_3
    const/4 p0, 0x0

    return p0
.end method

.method private static a(Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/core/response/model/AdInfo;)Z
    .locals 2

    .line 28
    invoke-static {p2}, Lcom/kwad/sdk/core/response/b/a;->bI(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const-string p1, "is playable return"

    .line 29
    invoke-static {p0, p1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    .line 30
    :cond_0
    invoke-static {p2}, Lcom/kwad/sdk/core/response/b/a;->aE(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string p1, "is not Download type"

    .line 31
    invoke-static {p0, p1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    .line 32
    :cond_1
    invoke-static {p2}, Lcom/kwad/components/ad/reward/a/b;->k(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    .line 33
    invoke-static {p1, v0}, Lcom/kwad/sdk/core/response/b/e;->k(Lcom/kwad/sdk/core/response/model/AdTemplate;Z)Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "isRewardLaunchAppTask"

    .line 34
    invoke-static {p0, p1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    .line 35
    :cond_2
    invoke-static {p2}, Lcom/kwad/components/ad/reward/g;->g(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "is Aggregation return"

    .line 36
    invoke-static {p0, p1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_3
    const/4 p0, 0x0

    return p0
.end method

.method static synthetic e(Lcom/kwad/components/ad/reward/g;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/kwad/components/ad/reward/presenter/f;->n(Lcom/kwad/components/ad/reward/g;)V

    return-void
.end method

.method static synthetic f(Lcom/kwad/components/ad/reward/g;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/kwad/components/ad/reward/presenter/f;->q(Lcom/kwad/components/ad/reward/g;)V

    return-void
.end method

.method static synthetic g(Lcom/kwad/components/ad/reward/g;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/kwad/components/ad/reward/presenter/f;->v(Lcom/kwad/components/ad/reward/g;)V

    return-void
.end method

.method private static m(Lcom/kwad/components/ad/reward/g;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->bS(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-static {p0}, Lcom/kwad/components/ad/reward/presenter/f;->n(Lcom/kwad/components/ad/reward/g;)V

    return-void

    .line 4
    :cond_0
    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/g;->pb:Z

    if-eqz v0, :cond_1

    .line 5
    invoke-static {p0}, Lcom/kwad/components/ad/reward/presenter/f;->p(Lcom/kwad/components/ad/reward/g;)V

    return-void

    :cond_1
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/g;->pe:Z

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->oS:Ljava/util/List;

    new-instance v1, Lcom/kwad/components/ad/reward/presenter/f$1;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/reward/presenter/f$1;-><init>(Lcom/kwad/components/ad/reward/g;)V

    invoke-static {v0, v1}, Lcom/kwad/components/ad/reward/g;->a(Ljava/util/List;Lcom/kwad/sdk/f/a;)V

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->oJ:Lcom/kwad/components/ad/reward/e/b;

    const-wide/16 v1, 0x0

    invoke-interface {v0, v1, v2}, Lcom/kwad/components/ad/reward/e/b;->onVideoSkipToEnd(J)V

    .line 9
    iget-object v0, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/g;->mReportExtData:Lorg/json/JSONObject;

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/adlog/c;->h(Lcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;)V

    .line 10
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->oK:Lcom/kwad/components/ad/reward/m/e;

    if-eqz v0, :cond_2

    .line 11
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/m/e;->release()V

    .line 12
    :cond_2
    invoke-virtual {p0}, Lcom/kwad/components/ad/reward/g;->fC()V

    .line 13
    invoke-static {p0}, Lcom/kwad/components/ad/reward/presenter/f;->s(Lcom/kwad/components/ad/reward/g;)V

    return-void
.end method

.method private static n(Lcom/kwad/components/ad/reward/g;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/f$3;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/presenter/f$3;-><init>(Lcom/kwad/components/ad/reward/g;)V

    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static o(Lcom/kwad/components/ad/reward/g;)V
    .locals 9

    .line 1
    iget-wide v0, p0, Lcom/kwad/components/ad/reward/g;->pv:J

    const-wide/16 v2, 0x3e8

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    cmp-long v7, v0, v5

    if-eqz v7, :cond_0

    .line 2
    div-long/2addr v0, v2

    long-to-int v1, v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 3
    :goto_0
    iget-wide v7, p0, Lcom/kwad/components/ad/reward/g;->pw:J

    cmp-long v0, v7, v5

    if-eqz v0, :cond_1

    .line 4
    div-long/2addr v7, v2

    long-to-int v4, v7

    .line 5
    :cond_1
    new-instance v0, Lcom/kwad/sdk/core/adlog/c/b;

    invoke-direct {v0}, Lcom/kwad/sdk/core/adlog/c/b;-><init>()V

    const/16 v2, 0x45

    .line 6
    invoke-virtual {v0, v2}, Lcom/kwad/sdk/core/adlog/c/b;->cM(I)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v0

    .line 7
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/adlog/c/b;->cP(I)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v0

    .line 8
    invoke-virtual {v0, v4}, Lcom/kwad/sdk/core/adlog/c/b;->cQ(I)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object p0, p0, Lcom/kwad/components/ad/reward/g;->mReportExtData:Lorg/json/JSONObject;

    invoke-static {v1, p0, v0}, Lcom/kwad/sdk/core/adlog/c;->e(Lcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;Lcom/kwad/sdk/core/adlog/c/b;)V

    return-void
.end method

.method public static p(Lcom/kwad/components/ad/reward/g;)V
    .locals 3

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/g;->pe:Z

    .line 2
    invoke-virtual {p0}, Lcom/kwad/components/ad/reward/g;->fP()V

    .line 3
    invoke-static {p0}, Lcom/kwad/components/ad/reward/presenter/i;->x(Lcom/kwad/components/ad/reward/g;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/f$4;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/presenter/f$4;-><init>(Lcom/kwad/components/ad/reward/g;)V

    const-wide/16 v1, 0xc8

    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/utils/bo;->runOnUiThreadDelay(Ljava/lang/Runnable;J)V

    return-void

    .line 5
    :cond_0
    invoke-static {p0}, Lcom/kwad/components/ad/reward/presenter/f;->q(Lcom/kwad/components/ad/reward/g;)V

    return-void
.end method

.method private static q(Lcom/kwad/components/ad/reward/g;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->oS:Ljava/util/List;

    new-instance v1, Lcom/kwad/components/ad/reward/presenter/f$5;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/reward/presenter/f$5;-><init>(Lcom/kwad/components/ad/reward/g;)V

    invoke-static {v0, v1}, Lcom/kwad/components/ad/reward/g;->a(Ljava/util/List;Lcom/kwad/sdk/f/a;)V

    .line 2
    iget-object p0, p0, Lcom/kwad/components/ad/reward/g;->oK:Lcom/kwad/components/ad/reward/m/e;

    if-eqz p0, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/kwad/components/ad/reward/m/e;->skipToEnd()V

    :cond_0
    return-void
.end method

.method public static r(Lcom/kwad/components/ad/reward/g;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/kwad/components/ad/reward/presenter/f;->v(Lcom/kwad/components/ad/reward/g;)V

    .line 2
    invoke-virtual {p0}, Lcom/kwad/components/core/l/a;->hq()V

    return-void
.end method

.method public static s(Lcom/kwad/components/ad/reward/g;)V
    .locals 12

    const-string v0, "openAppMarket"

    const-string v1, "tryOpenAppMarket"

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    .line 3
    sget-wide v3, Lcom/kwad/components/ad/reward/presenter/f;->sh:J

    sub-long v3, v1, v3

    const-wide/16 v5, 0x12c

    cmp-long v7, v3, v5

    if-gez v7, :cond_0

    const-string p0, "\u8fde\u7eed\u70b9\u51fb"

    .line 4
    invoke-static {v0, p0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 5
    :cond_0
    sput-wide v1, Lcom/kwad/components/ad/reward/presenter/f;->sh:J

    .line 6
    iget-object v1, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 7
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v2

    .line 8
    invoke-static {v2, v0}, Lcom/kwad/components/ad/reward/presenter/f;->a(Lcom/kwad/sdk/core/response/model/AdInfo;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    return-void

    .line 9
    :cond_1
    iget-object p0, p0, Lcom/kwad/components/core/l/a;->mContext:Landroid/content/Context;

    .line 10
    invoke-static {v0, v1, v2}, Lcom/kwad/components/ad/reward/presenter/f;->a(Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v3

    if-eqz v3, :cond_2

    return-void

    .line 11
    :cond_2
    new-instance v3, Lcom/kwad/sdk/core/adlog/c/b;

    invoke-direct {v3}, Lcom/kwad/sdk/core/adlog/c/b;-><init>()V

    const/16 v4, 0xb6

    .line 12
    invoke-virtual {v3, v4}, Lcom/kwad/sdk/core/adlog/c/b;->cK(I)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v3

    const/16 v4, 0x8

    .line 13
    invoke-virtual {v3, v4}, Lcom/kwad/sdk/core/adlog/c/b;->cW(I)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v3

    .line 14
    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/a;->cO(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v5

    .line 15
    invoke-static {p0, v5}, Lcom/kwad/sdk/core/download/a/b;->E(Landroid/content/Context;Ljava/lang/String;)I

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-ne v5, v7, :cond_3

    const/4 v5, 0x1

    goto :goto_0

    :cond_3
    const/4 v5, 0x0

    .line 16
    :goto_0
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "handleDeepLink dpSuccess: "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v0, v8}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v8, 0x0

    const-string v9, "autoLaunchMarket"

    const-string v10, "native_id"

    if-eqz v5, :cond_4

    .line 17
    invoke-static {v1, v10, v9, v3, v8}, Lcom/kwad/components/ad/reward/j/b;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;Ljava/lang/String;Lcom/kwad/sdk/core/adlog/c/b;Lorg/json/JSONObject;)V

    .line 18
    invoke-static {p0}, Lcom/kwad/components/ad/reward/h/a;->G(Landroid/content/Context;)V

    return-void

    .line 19
    :cond_4
    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/a;->cR(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v2

    .line 20
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v11, "tryOpenMiAppStore url\uff1a"

    invoke-direct {v5, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v5}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    invoke-static {p0, v2, v1}, Lcom/kwad/sdk/utils/d;->a(Landroid/content/Context;Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 22
    invoke-static {v1, v10, v9, v3, v8}, Lcom/kwad/components/ad/reward/j/b;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;Ljava/lang/String;Lcom/kwad/sdk/core/adlog/c/b;Lorg/json/JSONObject;)V

    .line 23
    invoke-static {v1, v7, v4}, Lcom/kwad/sdk/core/adlog/c;->d(Lcom/kwad/sdk/core/response/model/AdTemplate;II)V

    .line 24
    invoke-static {p0}, Lcom/kwad/components/ad/reward/h/a;->G(Landroid/content/Context;)V

    return-void

    .line 25
    :cond_5
    invoke-static {p0, v1}, Lcom/kwad/sdk/utils/d;->h(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 26
    invoke-static {v1, v10, v9, v3, v8}, Lcom/kwad/components/ad/reward/j/b;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;Ljava/lang/String;Lcom/kwad/sdk/core/adlog/c/b;Lorg/json/JSONObject;)V

    .line 27
    invoke-static {v1, v6, v4}, Lcom/kwad/sdk/core/adlog/c;->d(Lcom/kwad/sdk/core/response/model/AdTemplate;II)V

    .line 28
    invoke-static {p0}, Lcom/kwad/components/ad/reward/h/a;->G(Landroid/content/Context;)V

    return-void

    :cond_6
    const-string p0, "tryOpenMiAppStore failed"

    .line 29
    invoke-static {v0, p0}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static t(Lcom/kwad/components/ad/reward/g;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v1

    .line 3
    iget-boolean v2, p0, Lcom/kwad/components/ad/reward/g;->oZ:Z

    if-nez v2, :cond_0

    .line 4
    invoke-static {p0}, Lcom/kwad/components/ad/reward/presenter/f;->v(Lcom/kwad/components/ad/reward/g;)V

    .line 5
    invoke-virtual {p0}, Lcom/kwad/components/core/l/a;->hq()V

    return-void

    .line 6
    :cond_0
    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/f;->E(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v2, :cond_5

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/f;->F(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    .line 7
    :cond_1
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->af(Lcom/kwad/sdk/core/response/model/AdInfo;)J

    move-result-wide v0

    .line 8
    iget-boolean v2, p0, Lcom/kwad/components/ad/reward/g;->px:Z

    if-nez v2, :cond_3

    iget-wide v5, p0, Lcom/kwad/components/ad/reward/g;->pw:J

    cmp-long v2, v5, v0

    if-ltz v2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    :cond_3
    :goto_0
    if-eqz v3, :cond_4

    .line 9
    invoke-static {p0}, Lcom/kwad/components/ad/reward/presenter/f;->w(Lcom/kwad/components/ad/reward/g;)V

    .line 10
    :cond_4
    invoke-static {p0}, Lcom/kwad/components/ad/reward/presenter/f;->v(Lcom/kwad/components/ad/reward/g;)V

    .line 11
    invoke-virtual {p0}, Lcom/kwad/components/core/l/a;->hq()V

    goto :goto_3

    .line 12
    :cond_5
    :goto_1
    invoke-static {p0}, Lcom/kwad/components/ad/reward/presenter/f;->o(Lcom/kwad/components/ad/reward/g;)V

    .line 13
    invoke-virtual {p0}, Lcom/kwad/components/ad/reward/g;->fO()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 14
    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/f;->M(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/g;->pe:Z

    if-nez v0, :cond_6

    goto :goto_2

    :cond_6
    const/4 v3, 0x0

    :goto_2
    if-eqz v3, :cond_7

    .line 15
    invoke-static {p0}, Lcom/kwad/components/ad/reward/presenter/f;->u(Lcom/kwad/components/ad/reward/g;)V

    :goto_3
    return-void

    .line 16
    :cond_7
    invoke-static {p0}, Lcom/kwad/components/ad/reward/presenter/f;->v(Lcom/kwad/components/ad/reward/g;)V

    .line 17
    invoke-virtual {p0}, Lcom/kwad/components/core/l/a;->hq()V

    return-void
.end method

.method private static u(Lcom/kwad/components/ad/reward/g;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v1, 0x0

    .line 2
    invoke-static {p0, v1}, Lcom/kwad/components/ad/reward/h;->a(Lcom/kwad/components/ad/reward/g;Ljava/lang/String;)Lcom/kwad/components/ad/reward/h$c;

    move-result-object v1

    .line 3
    new-instance v2, Lcom/kwad/components/ad/reward/presenter/f$6;

    invoke-direct {v2, p0, v0}, Lcom/kwad/components/ad/reward/presenter/f$6;-><init>(Lcom/kwad/components/ad/reward/g;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    invoke-static {p0, v1, v2}, Lcom/kwad/components/ad/reward/g;->a(Lcom/kwad/components/ad/reward/g;Lcom/kwad/components/ad/reward/h$c;Lcom/kwad/components/ad/reward/h$a;)V

    return-void
.end method

.method private static v(Lcom/kwad/components/ad/reward/g;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/g;->oJ:Lcom/kwad/components/ad/reward/e/b;

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lcom/kwad/components/ad/reward/e/b;->h(Z)V

    return-void
.end method

.method private static w(Lcom/kwad/components/ad/reward/g;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/g;->oJ:Lcom/kwad/components/ad/reward/e/b;

    invoke-interface {p0}, Lcom/kwad/components/ad/reward/e/b;->onRewardVerify()V

    return-void
.end method
