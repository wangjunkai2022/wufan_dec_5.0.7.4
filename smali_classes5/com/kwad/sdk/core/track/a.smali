.class public final Lcom/kwad/sdk/core/track/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static a(ILcom/kwad/sdk/core/adlog/c/a;Ljava/util/List;Lcom/kwad/sdk/core/response/model/AdInfo;Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/kwad/sdk/core/adlog/c/a;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/kwad/sdk/core/response/model/AdInfo;",
            "Ljava/util/List<",
            "Lcom/kwad/sdk/core/response/model/AdInfo$AdTrackInfo;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/16 v0, 0x192

    if-ne p0, v0, :cond_3

    .line 9
    invoke-static {p3}, Lcom/kwad/sdk/core/response/b/a;->bm(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p0

    if-eqz p0, :cond_3

    .line 10
    :try_start_0
    iget-object p0, p1, Lcom/kwad/sdk/core/adlog/c/a;->Lh:Ljava/lang/String;

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_0

    .line 11
    new-instance p0, Lorg/json/JSONObject;

    iget-object p1, p1, Lcom/kwad/sdk/core/adlog/c/a;->Lh:Ljava/lang/String;

    invoke-direct {p0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "photoPlaySecond"

    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p0

    goto :goto_0

    .line 12
    :cond_0
    iget p0, p1, Lcom/kwad/sdk/core/adlog/c/a;->aqO:I

    .line 13
    :goto_0
    new-instance p1, Lorg/json/JSONObject;

    iget-object p3, p3, Lcom/kwad/sdk/core/response/model/AdInfo;->adBaseInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdBaseInfo;

    iget-object p3, p3, Lcom/kwad/sdk/core/response/model/AdInfo$AdBaseInfo;->videoPlayedNSConfig:Ljava/lang/String;

    invoke-direct {p1, p3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 14
    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_2

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/kwad/sdk/core/response/model/AdInfo$AdTrackInfo;

    .line 15
    iget v0, p4, Lcom/kwad/sdk/core/response/model/AdInfo$AdTrackInfo;->type:I

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    if-ne v0, v1, :cond_1

    iget-object p4, p4, Lcom/kwad/sdk/core/response/model/AdInfo$AdTrackInfo;->urls:Ljava/util/List;

    if-eqz p4, :cond_1

    .line 16
    invoke-interface {p2, p4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_2
    return-object p2

    :cond_3
    const/4 p0, 0x0

    return-object p0
.end method

.method private static a(Lcom/kwad/sdk/core/response/model/AdTemplate;ILcom/kwad/sdk/core/adlog/c/a;)Ljava/util/List;
    .locals 3
    .param p2    # Lcom/kwad/sdk/core/adlog/c/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kwad/sdk/core/response/model/AdTemplate;",
            "I",
            "Lcom/kwad/sdk/core/adlog/c/a;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p0

    .line 3
    iget-object v1, p0, Lcom/kwad/sdk/core/response/model/AdInfo;->adTrackInfoList:Ljava/util/List;

    .line 4
    invoke-static {v1}, Lcom/kwad/sdk/utils/ai;->I(Ljava/util/List;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v0

    .line 5
    :cond_0
    invoke-static {p1, p2, v0, p0, v1}, Lcom/kwad/sdk/core/track/a;->a(ILcom/kwad/sdk/core/adlog/c/a;Ljava/util/List;Lcom/kwad/sdk/core/response/model/AdInfo;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_1

    return-object p0

    .line 6
    :cond_1
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/kwad/sdk/core/response/model/AdInfo$AdTrackInfo;

    .line 7
    iget v1, p2, Lcom/kwad/sdk/core/response/model/AdInfo$AdTrackInfo;->type:I

    if-ne v1, p1, :cond_2

    iget-object p2, p2, Lcom/kwad/sdk/core/response/model/AdInfo$AdTrackInfo;->urls:Ljava/util/List;

    if-eqz p2, :cond_2

    .line 8
    invoke-interface {v0, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_3
    return-object v0
.end method

.method public static d(Lcom/kwad/sdk/core/adlog/c/a;)V
    .locals 10
    .param p0    # Lcom/kwad/sdk/core/adlog/c/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v7, p0, Lcom/kwad/sdk/core/adlog/c/a;->adTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 2
    iget v8, p0, Lcom/kwad/sdk/core/adlog/c/a;->apT:I

    .line 3
    invoke-static {v7, v8, p0}, Lcom/kwad/sdk/core/track/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;ILcom/kwad/sdk/core/adlog/c/a;)Ljava/util/List;

    move-result-object v0

    .line 4
    invoke-static {v0}, Lcom/kwad/sdk/utils/ai;->I(Ljava/util/List;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 5
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 6
    invoke-static {v7, v8, v2}, Lcom/kwad/sdk/commercial/j/a;->o(Lcom/kwad/sdk/core/response/model/AdTemplate;ILjava/lang/String;)V

    .line 7
    invoke-virtual {v7}, Lcom/kwad/sdk/core/response/model/AdTemplate;->isCheatingFlow()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 8
    invoke-static {v7, v8, v2}, Lcom/kwad/sdk/commercial/j/a;->n(Lcom/kwad/sdk/core/response/model/AdTemplate;ILjava/lang/String;)V

    return-void

    .line 9
    :cond_1
    invoke-static {v2}, Lcom/kwad/sdk/utils/bo;->hk(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const v4, 0x186a1

    const/4 v6, 0x0

    const-string v3, ""

    const-string v5, ""

    move-object v0, v7

    move v1, v8

    .line 10
    invoke-static/range {v0 .. v6}, Lcom/kwad/sdk/commercial/j/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V

    return-void

    :cond_2
    const/4 v0, 0x2

    const/4 v1, 0x0

    if-ne v8, v0, :cond_3

    .line 11
    iget-object v3, p0, Lcom/kwad/sdk/core/adlog/c/a;->kn:Lcom/kwad/sdk/utils/ac$a;

    goto :goto_1

    :cond_3
    move-object v3, v1

    .line 12
    :goto_1
    invoke-static {v7}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v4

    invoke-static {v4}, Lcom/kwad/sdk/core/response/b/a;->aA(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v4

    .line 13
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v2, v3, v4}, Lcom/kwad/sdk/utils/ab;->a(Landroid/content/Context;Ljava/lang/String;Lcom/kwad/sdk/utils/ac$a;Z)Ljava/lang/String;

    move-result-object v3

    .line 14
    invoke-static {v7, v2, v3}, Lcom/kwad/sdk/utils/ab;->f(Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    invoke-static {}, Lcom/kwad/sdk/g;->yy()Lcom/kwad/sdk/export/proxy/AdHttpProxy;

    move-result-object v4

    .line 16
    instance-of v5, v4, Lcom/kwad/sdk/core/network/c/a;

    if-eqz v5, :cond_4

    const/4 v6, 0x2

    goto :goto_2

    :cond_4
    const/4 v0, 0x1

    const/4 v6, 0x1

    .line 17
    :goto_2
    invoke-interface {v4, v3, v1}, Lcom/kwad/sdk/export/proxy/AdHttpProxy;->doGetWithoutResponse(Ljava/lang/String;Ljava/util/Map;)Lcom/kwad/sdk/core/network/c;

    move-result-object v0

    .line 18
    iget v1, v0, Lcom/kwad/sdk/core/network/c;->code:I

    invoke-static {v1}, Lcom/kwad/sdk/core/track/a;->dp(I)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "trackUrl request success actionType: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "AdTrackUtil"

    invoke-static {v3, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    iget v0, v0, Lcom/kwad/sdk/core/network/c;->code:I

    invoke-static {v7, v8, v2, v0, v6}, Lcom/kwad/sdk/commercial/j/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;ILjava/lang/String;II)V

    goto :goto_0

    .line 21
    :cond_5
    iget v1, v0, Lcom/kwad/sdk/core/network/c;->code:I

    .line 22
    invoke-static {v1}, Lcom/kwad/sdk/commercial/d;->cb(I)I

    move-result v4

    iget-object v5, v0, Lcom/kwad/sdk/core/network/c;->awE:Ljava/lang/String;

    move-object v0, v7

    move v1, v8

    .line 23
    invoke-static/range {v0 .. v6}, Lcom/kwad/sdk/commercial/j/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V

    goto/16 :goto_0

    :cond_6
    return-void
.end method

.method private static dp(I)Z
    .locals 1

    const/16 v0, 0xc8

    if-lt p0, v0, :cond_0

    const/16 v0, 0x12c

    if-ge p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
