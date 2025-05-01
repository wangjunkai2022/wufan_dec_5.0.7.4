.class public final Lcom/kwad/components/ad/feed/monitor/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(IILcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 3

    .line 96
    new-instance v0, Lcom/kwad/components/ad/feed/monitor/FeedErrorInfo;

    invoke-direct {v0}, Lcom/kwad/components/ad/feed/monitor/FeedErrorInfo;-><init>()V

    int-to-long v1, p0

    .line 97
    invoke-virtual {v0, v1, v2}, Lcom/kwad/components/ad/feed/monitor/FeedErrorInfo;->setMaterialType(J)Lcom/kwad/components/ad/feed/monitor/FeedErrorInfo;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/kwad/components/ad/feed/monitor/FeedErrorInfo;->setFeedType(I)Lcom/kwad/components/ad/feed/monitor/FeedErrorInfo;

    move-result-object p0

    invoke-virtual {p0, p2}, Lcom/kwad/sdk/commercial/c/a;->setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/c/a;

    move-result-object p0

    check-cast p0, Lcom/kwad/components/ad/feed/monitor/FeedErrorInfo;

    const-string p1, "ad_sdk_feed_showType_monitor"

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 98
    invoke-static {p1, p0, v0, v1}, Lcom/kwad/components/ad/feed/monitor/b;->a(Ljava/lang/String;Lcom/kwad/components/ad/feed/monitor/FeedErrorInfo;D)V

    return-void
.end method

.method public static a(IILcom/kwad/sdk/core/response/model/AdTemplate;I)V
    .locals 3

    .line 102
    new-instance v0, Lcom/kwad/components/ad/feed/monitor/FeedErrorInfo;

    invoke-direct {v0}, Lcom/kwad/components/ad/feed/monitor/FeedErrorInfo;-><init>()V

    int-to-long v1, p1

    .line 103
    invoke-virtual {v0, v1, v2}, Lcom/kwad/components/ad/feed/monitor/FeedErrorInfo;->setMaterialType(J)Lcom/kwad/components/ad/feed/monitor/FeedErrorInfo;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/kwad/components/ad/feed/monitor/FeedErrorInfo;->setErrorType(I)Lcom/kwad/components/ad/feed/monitor/FeedErrorInfo;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/kwad/sdk/commercial/c/a;->setErrorCode(I)Lcom/kwad/sdk/commercial/c/a;

    move-result-object p0

    invoke-virtual {p0, p2}, Lcom/kwad/sdk/commercial/c/a;->setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/c/a;

    move-result-object p0

    check-cast p0, Lcom/kwad/components/ad/feed/monitor/FeedErrorInfo;

    const-string p1, "ad_sdk_feed_h5_monitor"

    const-wide/high16 p2, 0x3ff0000000000000L    # 1.0

    .line 104
    invoke-static {p1, p0, p2, p3}, Lcom/kwad/components/ad/feed/monitor/b;->a(Ljava/lang/String;Lcom/kwad/components/ad/feed/monitor/FeedErrorInfo;D)V

    return-void
.end method

.method public static a(IJ)V
    .locals 3

    .line 25
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 26
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->Ce()I

    move-result v1

    const-string v2, "feedLoadOptimizeType"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 27
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->Ch()I

    move-result v1

    const-string v2, "feedLoadOptimizeExternalEnable"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 28
    invoke-static {}, Lcom/kwad/sdk/l;->zJ()Lcom/kwad/sdk/l;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kwad/sdk/l;->yV()Z

    move-result v1

    const-string v2, "isExternal"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Z)V

    .line 29
    new-instance v1, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    invoke-direct {v1}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;-><init>()V

    const/4 v2, 0x6

    .line 30
    invoke-virtual {v1, v2}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setStatus(I)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object v1

    .line 31
    invoke-virtual {v1, p0}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setAdNum(I)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object p0

    .line 32
    invoke-virtual {p0, p1, p2}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setLoadDataDuration(J)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object p0

    .line 33
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setAbParams(Ljava/lang/String;)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object p0

    .line 34
    invoke-static {p0}, Lcom/kwad/components/ad/feed/monitor/b;->a(Lcom/kwad/sdk/commercial/c/a;)V

    return-void
.end method

.method public static a(ILcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;I)V
    .locals 2

    .line 69
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 70
    new-instance v1, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    invoke-direct {v1}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;-><init>()V

    .line 71
    invoke-virtual {v1, p0}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setCallbackType(I)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object p0

    .line 72
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->bd(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setMaterialType(I)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object p0

    .line 73
    invoke-virtual {p0, p2}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setMaterialUrl(Ljava/lang/String;)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object p0

    .line 74
    invoke-virtual {p0, p3}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setRenderType(I)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object p0

    .line 75
    invoke-virtual {p0, p1}, Lcom/kwad/sdk/commercial/c/a;->setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/c/a;

    move-result-object p0

    .line 76
    invoke-static {p0}, Lcom/kwad/components/ad/feed/monitor/b;->b(Lcom/kwad/sdk/commercial/c/a;)V

    return-void
.end method

.method public static a(JIILcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 1

    .line 99
    new-instance v0, Lcom/kwad/components/ad/feed/monitor/FeedErrorInfo;

    invoke-direct {v0}, Lcom/kwad/components/ad/feed/monitor/FeedErrorInfo;-><init>()V

    .line 100
    invoke-virtual {v0, p0, p1}, Lcom/kwad/components/ad/feed/monitor/FeedErrorInfo;->setWidth(J)Lcom/kwad/components/ad/feed/monitor/FeedErrorInfo;

    move-result-object p0

    int-to-long p1, p2

    invoke-virtual {p0, p1, p2}, Lcom/kwad/components/ad/feed/monitor/FeedErrorInfo;->setMaterialType(J)Lcom/kwad/components/ad/feed/monitor/FeedErrorInfo;

    move-result-object p0

    invoke-virtual {p0, p3}, Lcom/kwad/components/ad/feed/monitor/FeedErrorInfo;->setFeedType(I)Lcom/kwad/components/ad/feed/monitor/FeedErrorInfo;

    move-result-object p0

    invoke-virtual {p0, p4}, Lcom/kwad/sdk/commercial/c/a;->setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/c/a;

    move-result-object p0

    check-cast p0, Lcom/kwad/components/ad/feed/monitor/FeedErrorInfo;

    const-string p1, "ad_sdk_feed_width_monitor"

    const-wide/high16 p2, 0x3ff0000000000000L    # 1.0

    .line 101
    invoke-static {p1, p0, p2, p3}, Lcom/kwad/components/ad/feed/monitor/b;->a(Ljava/lang/String;Lcom/kwad/components/ad/feed/monitor/FeedErrorInfo;D)V

    return-void
.end method

.method public static a(JLjava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "Lcom/kwad/sdk/api/KsFeedAd;",
            ">;)V"
        }
    .end annotation

    if-eqz p2, :cond_0

    .line 77
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v1, v1, Lcom/kwad/components/ad/feed/c;

    if-eqz v1, :cond_0

    .line 78
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/ad/feed/c;

    invoke-virtual {v0}, Lcom/kwad/components/ad/feed/c;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    .line 79
    invoke-static {p2}, Lcom/kwad/components/ad/feed/monitor/b;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    .line 80
    new-instance v1, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    invoke-direct {v1}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;-><init>()V

    const/4 v2, 0x1

    .line 81
    invoke-virtual {v1, v2}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setCallbackType(I)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object v1

    .line 82
    invoke-virtual {v1, p0, p1}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setPosId(J)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object p0

    .line 83
    invoke-virtual {p0, p2}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setMaterialInfoList(Ljava/util/List;)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object p0

    .line 84
    invoke-virtual {p0, v0}, Lcom/kwad/sdk/commercial/c/a;->setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/c/a;

    move-result-object p0

    .line 85
    invoke-static {p0}, Lcom/kwad/components/ad/feed/monitor/b;->b(Lcom/kwad/sdk/commercial/c/a;)V

    :cond_0
    return-void
.end method

.method private static a(Lcom/kwad/sdk/commercial/c/a;)V
    .locals 1

    const/4 v0, 0x0

    .line 59
    invoke-static {p0, v0}, Lcom/kwad/components/ad/feed/monitor/b;->a(Lcom/kwad/sdk/commercial/c/a;Z)V

    return-void
.end method

.method private static a(Lcom/kwad/sdk/commercial/c/a;Z)V
    .locals 3

    .line 60
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/commercial/c;->Br()Lcom/kwad/sdk/commercial/c;

    move-result-object v0

    if-eqz p1, :cond_0

    const-string v1, "ad_client_error_log"

    goto :goto_0

    :cond_0
    const-string v1, "ad_client_apm_log"

    .line 61
    :goto_0
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/c;->cz(Ljava/lang/String;)Lcom/kwad/sdk/commercial/c;

    move-result-object v0

    if-eqz p1, :cond_1

    const-wide v1, 0x3f847ae147ae147bL    # 0.01

    goto :goto_1

    :cond_1
    const-wide v1, 0x3f50624dd2f1a9fcL    # 0.001

    .line 62
    :goto_1
    invoke-virtual {v0, v1, v2}, Lcom/kwad/sdk/commercial/c;->i(D)Lcom/kwad/sdk/commercial/c;

    move-result-object p1

    const-string v0, "ad_sdk_feed_load"

    const-string v1, "status"

    .line 63
    invoke-virtual {p1, v0, v1}, Lcom/kwad/sdk/commercial/c;->N(Ljava/lang/String;Ljava/lang/String;)Lcom/kwad/sdk/commercial/c;

    move-result-object p1

    sget-object v0, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;->AD_FEED:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    .line 64
    invoke-virtual {p1, v0}, Lcom/kwad/sdk/commercial/c;->a(Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;)Lcom/kwad/sdk/commercial/c;

    move-result-object p1

    .line 65
    invoke-virtual {p1, p0}, Lcom/kwad/sdk/commercial/c;->t(Lcom/kwad/sdk/commercial/c/a;)Lcom/kwad/sdk/commercial/c;

    move-result-object p0

    sget-object p1, Lcom/kwai/adclient/kscommerciallogger/model/a;->aUS:Lcom/kwai/adclient/kscommerciallogger/model/d;

    .line 66
    invoke-virtual {p0, p1}, Lcom/kwad/sdk/commercial/c;->a(Lcom/kwai/adclient/kscommerciallogger/model/d;)Lcom/kwad/sdk/commercial/c;

    move-result-object p0

    .line 67
    invoke-static {p0}, Lcom/kwad/sdk/commercial/b;->d(Lcom/kwad/sdk/commercial/c;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 68
    invoke-virtual {p0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "reportFeedPageLineLog"

    invoke-static {p1, p0}, Lcom/kwad/sdk/core/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static a(Lcom/kwad/sdk/core/response/model/AdTemplate;II)V
    .locals 5

    .line 35
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 36
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->Ce()I

    move-result v1

    const-string v2, "feedLoadOptimizeType"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 37
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->Ch()I

    move-result v1

    const-string v2, "feedLoadOptimizeExternalEnable"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 38
    invoke-static {}, Lcom/kwad/sdk/l;->zJ()Lcom/kwad/sdk/l;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kwad/sdk/l;->yV()Z

    move-result v1

    const-string v2, "isExternal"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Z)V

    .line 39
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v1

    .line 40
    new-instance v2, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    invoke-direct {v2}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;-><init>()V

    const/4 v3, 0x7

    .line 41
    invoke-virtual {v2, v3}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setStatus(I)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object v2

    iget v3, p0, Lcom/kwad/sdk/core/response/model/AdTemplate;->type:I

    .line 42
    invoke-virtual {v2, v3}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setType(I)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object v2

    iget v3, p0, Lcom/kwad/sdk/core/response/model/AdTemplate;->loadType:I

    int-to-long v3, v3

    .line 43
    invoke-virtual {v2, v3, v4}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setLoadType(J)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object v2

    .line 44
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->bd(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v1

    invoke-virtual {v2, v1}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setMaterialType(I)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object v1

    .line 45
    invoke-virtual {v1, p1}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setRenderType(I)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object p1

    .line 46
    invoke-virtual {p1, p2}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setExpectedRenderType(I)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object p1

    .line 47
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setAbParams(Ljava/lang/String;)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object p1

    .line 48
    invoke-virtual {p1, p0}, Lcom/kwad/sdk/commercial/c/a;->setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/c/a;

    move-result-object p0

    .line 49
    invoke-static {p0}, Lcom/kwad/components/ad/feed/monitor/b;->a(Lcom/kwad/sdk/commercial/c/a;)V

    return-void
.end method

.method public static a(Lcom/kwad/sdk/core/response/model/AdTemplate;IIJLjava/lang/String;)V
    .locals 3

    .line 13
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 14
    new-instance v1, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    invoke-direct {v1}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;-><init>()V

    const/4 v2, 0x5

    .line 15
    invoke-virtual {v1, v2}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setStatus(I)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object v1

    iget v2, p0, Lcom/kwad/sdk/core/response/model/AdTemplate;->type:I

    .line 16
    invoke-virtual {v1, v2}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setType(I)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object v1

    .line 17
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->bd(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setMaterialType(I)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object v0

    .line 18
    invoke-virtual {v0, p1}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setRenderType(I)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object v0

    iget v1, p0, Lcom/kwad/sdk/core/response/model/AdTemplate;->loadType:I

    int-to-long v1, v1

    .line 19
    invoke-virtual {v0, v1, v2}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setLoadType(J)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object v0

    .line 20
    invoke-virtual {v0, p2}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setExpectedRenderType(I)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object p2

    .line 21
    invoke-virtual {p2, p5}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setErrorMsg(Ljava/lang/String;)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object p2

    .line 22
    invoke-virtual {p2, p3, p4}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setRenderDuration(J)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object p2

    .line 23
    invoke-virtual {p2, p0}, Lcom/kwad/sdk/commercial/c/a;->setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/c/a;

    move-result-object p0

    const/4 p2, 0x2

    if-eq p1, p2, :cond_0

    const/4 p2, 0x3

    if-eq p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 24
    :goto_0
    invoke-static {p0, p1}, Lcom/kwad/components/ad/feed/monitor/b;->a(Lcom/kwad/sdk/commercial/c/a;Z)V

    return-void
.end method

.method public static a(Lcom/kwad/sdk/core/response/model/AdTemplate;IILjava/lang/String;Ljava/lang/String;J)V
    .locals 3

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 1
    iget-boolean v1, p0, Lcom/kwad/sdk/core/response/model/AdTemplate;->mHasReportVideoLoad:Z

    if-eqz v1, :cond_0

    return-void

    :cond_0
    if-ne p2, v0, :cond_1

    .line 2
    iput-boolean v0, p0, Lcom/kwad/sdk/core/response/model/AdTemplate;->mHasReportVideoLoad:Z

    .line 3
    :cond_1
    new-instance v1, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    invoke-direct {v1}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;-><init>()V

    const/4 v2, 0x3

    .line 4
    invoke-virtual {v1, v2}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setStatus(I)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object v1

    iget v2, p0, Lcom/kwad/sdk/core/response/model/AdTemplate;->type:I

    .line 5
    invoke-virtual {v1, v2}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setType(I)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object v1

    .line 6
    invoke-virtual {v1, p1}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setLoadStatus(I)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object v1

    .line 7
    invoke-virtual {v1, p5, p6}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setResourceLoadDuration(J)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object p5

    .line 8
    invoke-virtual {p5, p2}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setMaterialType(I)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object p2

    .line 9
    invoke-virtual {p2, p3}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setMaterialUrl(Ljava/lang/String;)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object p2

    .line 10
    invoke-virtual {p2, p4}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setErrorMsg(Ljava/lang/String;)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object p2

    .line 11
    invoke-virtual {p2, p0}, Lcom/kwad/sdk/commercial/c/a;->setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/c/a;

    move-result-object p0

    const/4 p2, 0x2

    if-ne p1, p2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    .line 12
    :goto_0
    invoke-static {p0, v0}, Lcom/kwad/components/ad/feed/monitor/b;->a(Lcom/kwad/sdk/commercial/c/a;Z)V

    return-void
.end method

.method public static a(Lcom/kwad/sdk/core/response/model/AdTemplate;IJ)V
    .locals 3

    .line 50
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 51
    new-instance v1, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    invoke-direct {v1}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;-><init>()V

    const/16 v2, 0x8

    .line 52
    invoke-virtual {v1, v2}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setStatus(I)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object v1

    iget v2, p0, Lcom/kwad/sdk/core/response/model/AdTemplate;->type:I

    .line 53
    invoke-virtual {v1, v2}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setType(I)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object v1

    .line 54
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->bd(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setMaterialType(I)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object v0

    .line 55
    invoke-virtual {v0, p1}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setRenderType(I)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object p1

    .line 56
    invoke-virtual {p1, p2, p3}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setConvertDuration(J)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object p1

    .line 57
    invoke-virtual {p1, p0}, Lcom/kwad/sdk/commercial/c/a;->setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/c/a;

    move-result-object p0

    .line 58
    invoke-static {p0}, Lcom/kwad/components/ad/feed/monitor/b;->a(Lcom/kwad/sdk/commercial/c/a;)V

    return-void
.end method

.method public static a(Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;)V
    .locals 2

    .line 105
    new-instance v0, Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;

    invoke-direct {v0}, Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;-><init>()V

    const-string v1, "webview_load_url"

    .line 106
    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;->setEvent(Ljava/lang/String;)Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;

    move-result-object v0

    const-string v1, "ad_feed"

    .line 107
    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;->setSceneId(Ljava/lang/String;)Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;

    move-result-object v0

    .line 108
    invoke-virtual {v0, p1}, Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;->setUrl(Ljava/lang/String;)Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;

    move-result-object p1

    .line 109
    invoke-virtual {p1, p0}, Lcom/kwad/sdk/commercial/c/a;->setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/c/a;

    move-result-object p0

    .line 110
    invoke-static {p0}, Lcom/kwad/sdk/commercial/b;->f(Lcom/kwad/sdk/commercial/c/a;)V

    return-void
.end method

.method public static a(Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;J)V
    .locals 2

    .line 119
    new-instance v0, Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;

    invoke-direct {v0}, Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;-><init>()V

    const-string v1, "webview_load_finish"

    .line 120
    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;->setEvent(Ljava/lang/String;)Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;

    move-result-object v0

    const-string v1, "ad_feed"

    .line 121
    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;->setSceneId(Ljava/lang/String;)Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;

    move-result-object v0

    .line 122
    invoke-virtual {v0, p2, p3}, Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;->setDurationMs(J)Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;

    move-result-object p2

    .line 123
    invoke-virtual {p2, p1}, Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;->setUrl(Ljava/lang/String;)Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;

    move-result-object p1

    .line 124
    invoke-virtual {p1, p0}, Lcom/kwad/sdk/commercial/c/a;->setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/c/a;

    move-result-object p0

    .line 125
    invoke-static {p0}, Lcom/kwad/sdk/commercial/b;->f(Lcom/kwad/sdk/commercial/c/a;)V

    return-void
.end method

.method public static a(Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;JI)V
    .locals 2

    .line 111
    new-instance v0, Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;

    invoke-direct {v0}, Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;-><init>()V

    const-string v1, "webview_timeout"

    .line 112
    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;->setEvent(Ljava/lang/String;)Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;

    move-result-object v0

    const-string v1, "ad_feed"

    .line 113
    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;->setSceneId(Ljava/lang/String;)Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;

    move-result-object v0

    .line 114
    invoke-virtual {v0, p4}, Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;->setTimeType(I)Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;

    move-result-object p4

    .line 115
    invoke-virtual {p4, p2, p3}, Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;->setDurationMs(J)Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;

    move-result-object p2

    .line 116
    invoke-virtual {p2, p1}, Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;->setUrl(Ljava/lang/String;)Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;

    move-result-object p1

    .line 117
    invoke-virtual {p1, p0}, Lcom/kwad/sdk/commercial/c/a;->setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/c/a;

    move-result-object p0

    .line 118
    invoke-static {p0}, Lcom/kwad/sdk/commercial/b;->f(Lcom/kwad/sdk/commercial/c/a;)V

    return-void
.end method

.method private static a(Ljava/lang/String;Lcom/kwad/components/ad/feed/monitor/FeedErrorInfo;D)V
    .locals 2

    .line 86
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/commercial/c;->Br()Lcom/kwad/sdk/commercial/c;

    move-result-object v0

    const-string v1, "ad_client_error_log"

    .line 87
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/c;->cz(Ljava/lang/String;)Lcom/kwad/sdk/commercial/c;

    move-result-object v0

    sget-object v1, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;->AD_FEED:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    .line 88
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/c;->a(Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;)Lcom/kwad/sdk/commercial/c;

    move-result-object v0

    const-string v1, "default"

    .line 89
    invoke-virtual {v0, p0, v1}, Lcom/kwad/sdk/commercial/c;->N(Ljava/lang/String;Ljava/lang/String;)Lcom/kwad/sdk/commercial/c;

    move-result-object v0

    .line 90
    invoke-virtual {v0, p0}, Lcom/kwad/sdk/commercial/c;->cA(Ljava/lang/String;)Lcom/kwad/sdk/commercial/c;

    move-result-object p0

    sget-object v0, Lcom/kwai/adclient/kscommerciallogger/model/a;->aUS:Lcom/kwai/adclient/kscommerciallogger/model/d;

    .line 91
    invoke-virtual {p0, v0}, Lcom/kwad/sdk/commercial/c;->a(Lcom/kwai/adclient/kscommerciallogger/model/d;)Lcom/kwad/sdk/commercial/c;

    move-result-object p0

    .line 92
    invoke-virtual {p0, p1}, Lcom/kwad/sdk/commercial/c;->t(Lcom/kwad/sdk/commercial/c/a;)Lcom/kwad/sdk/commercial/c;

    move-result-object p0

    .line 93
    invoke-virtual {p0, p2, p3}, Lcom/kwad/sdk/commercial/c;->i(D)Lcom/kwad/sdk/commercial/c;

    move-result-object p0

    .line 94
    invoke-static {p0}, Lcom/kwad/sdk/commercial/b;->d(Lcom/kwad/sdk/commercial/c;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 95
    invoke-virtual {p0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "reportFeedError"

    invoke-static {p1, p0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static aY()V
    .locals 4

    .line 1
    new-instance v0, Lcom/kwad/components/ad/feed/monitor/FeedErrorInfo;

    invoke-direct {v0}, Lcom/kwad/components/ad/feed/monitor/FeedErrorInfo;-><init>()V

    const-string v1, "ad_sdk_feed_adnum_monitor"

    const-wide v2, 0x3f1a36e2eb1c432dL    # 1.0E-4

    invoke-static {v1, v0, v2, v3}, Lcom/kwad/components/ad/feed/monitor/b;->a(Ljava/lang/String;Lcom/kwad/components/ad/feed/monitor/FeedErrorInfo;D)V

    return-void
.end method

.method public static aZ()V
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;

    invoke-direct {v0}, Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;-><init>()V

    const-string v1, "webview_init"

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;->setEvent(Ljava/lang/String;)Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;

    move-result-object v0

    const-string v1, "ad_feed"

    .line 3
    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;->setSceneId(Ljava/lang/String;)Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;

    move-result-object v0

    .line 4
    invoke-static {v0}, Lcom/kwad/sdk/commercial/b;->f(Lcom/kwad/sdk/commercial/c/a;)V

    return-void
.end method

.method private static b(Lcom/kwad/sdk/commercial/c/a;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/commercial/c;->Br()Lcom/kwad/sdk/commercial/c;

    move-result-object v0

    const-string v1, "ad_client_apm_log"

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/c;->cz(Ljava/lang/String;)Lcom/kwad/sdk/commercial/c;

    move-result-object v0

    const-wide v1, 0x3f847ae147ae147bL    # 0.01

    .line 3
    invoke-virtual {v0, v1, v2}, Lcom/kwad/sdk/commercial/c;->i(D)Lcom/kwad/sdk/commercial/c;

    move-result-object v0

    const-string v1, "ad_sdk_feed_callback"

    const-string v2, "callback_type"

    .line 4
    invoke-virtual {v0, v1, v2}, Lcom/kwad/sdk/commercial/c;->N(Ljava/lang/String;Ljava/lang/String;)Lcom/kwad/sdk/commercial/c;

    move-result-object v0

    sget-object v1, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;->AD_FEED:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    .line 5
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/c;->a(Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;)Lcom/kwad/sdk/commercial/c;

    move-result-object v0

    .line 6
    invoke-virtual {v0, p0}, Lcom/kwad/sdk/commercial/c;->t(Lcom/kwad/sdk/commercial/c/a;)Lcom/kwad/sdk/commercial/c;

    move-result-object p0

    sget-object v0, Lcom/kwai/adclient/kscommerciallogger/model/a;->aUS:Lcom/kwai/adclient/kscommerciallogger/model/d;

    .line 7
    invoke-virtual {p0, v0}, Lcom/kwad/sdk/commercial/c;->a(Lcom/kwai/adclient/kscommerciallogger/model/d;)Lcom/kwad/sdk/commercial/c;

    move-result-object p0

    .line 8
    invoke-static {p0}, Lcom/kwad/sdk/commercial/b;->d(Lcom/kwad/sdk/commercial/c;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "reportFeedCallback"

    invoke-static {v0, p0}, Lcom/kwad/sdk/core/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static c(Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kwad/sdk/api/KsFeedAd;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/kwad/components/ad/feed/monitor/FeedPageInfo$a;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/sdk/api/KsFeedAd;

    .line 3
    instance-of v2, v1, Lcom/kwad/components/ad/feed/c;

    if-eqz v2, :cond_0

    .line 4
    check-cast v1, Lcom/kwad/components/ad/feed/c;

    .line 5
    invoke-virtual {v1}, Lcom/kwad/components/ad/feed/c;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v1

    .line 6
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v1

    .line 7
    new-instance v2, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo$a;

    invoke-direct {v2}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo$a;-><init>()V

    .line 8
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->J(Lcom/kwad/sdk/core/response/model/AdInfo;)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo$a;->d(J)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo$a;

    move-result-object v2

    .line 9
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->bd(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo$a;->u(I)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo$a;

    move-result-object v2

    .line 10
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->ba(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo$a;->o(Ljava/lang/String;)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo$a;

    move-result-object v1

    .line 11
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static d(ILjava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    invoke-direct {v0}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;-><init>()V

    const/16 v1, 0x9

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setStatus(I)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object v0

    .line 3
    invoke-virtual {v0, p0}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setErrorCode(I)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object p0

    .line 4
    invoke-virtual {p0, p1}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setErrorMsg(Ljava/lang/String;)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object p0

    const/4 p1, 0x1

    .line 5
    invoke-static {p0, p1}, Lcom/kwad/components/ad/feed/monitor/b;->a(Lcom/kwad/sdk/commercial/c/a;Z)V

    return-void
.end method

.method public static e(ILjava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    invoke-direct {v0}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;-><init>()V

    const/16 v1, 0xa

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setStatus(I)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object v0

    .line 3
    invoke-virtual {v0, p0}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setLoadStatus(I)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object v0

    .line 4
    invoke-virtual {v0, p1}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setErrorMsg(Ljava/lang/String;)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object p1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    .line 5
    :goto_0
    invoke-static {p1, p0}, Lcom/kwad/components/ad/feed/monitor/b;->a(Lcom/kwad/sdk/commercial/c/a;Z)V

    return-void
.end method

.method public static e(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    .line 6
    new-instance v0, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    invoke-direct {v0}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;-><init>()V

    const/16 v1, 0xb

    .line 7
    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setStatus(I)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object v0

    .line 8
    invoke-virtual {v0, p0}, Lcom/kwad/sdk/commercial/c/a;->setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/c/a;

    move-result-object p0

    .line 9
    invoke-static {p0}, Lcom/kwad/components/ad/feed/monitor/b;->a(Lcom/kwad/sdk/commercial/c/a;)V

    return-void
.end method

.method public static f(ILjava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/components/ad/feed/monitor/FeedErrorInfo;

    invoke-direct {v0}, Lcom/kwad/components/ad/feed/monitor/FeedErrorInfo;-><init>()V

    .line 2
    invoke-virtual {v0, p0}, Lcom/kwad/sdk/commercial/c/a;->setErrorCode(I)Lcom/kwad/sdk/commercial/c/a;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/kwad/sdk/commercial/c/a;->setErrorMsg(Ljava/lang/String;)Lcom/kwad/sdk/commercial/c/a;

    move-result-object p0

    check-cast p0, Lcom/kwad/components/ad/feed/monitor/FeedErrorInfo;

    const-string p1, "ad_sdk_feed_request_monitor"

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 3
    invoke-static {p1, p0, v0, v1}, Lcom/kwad/components/ad/feed/monitor/b;->a(Ljava/lang/String;Lcom/kwad/components/ad/feed/monitor/FeedErrorInfo;D)V

    return-void
.end method

.method public static f(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    .line 4
    new-instance v0, Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;

    invoke-direct {v0}, Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;-><init>()V

    const-string v1, "ad_show"

    .line 5
    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;->setEvent(Ljava/lang/String;)Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;

    move-result-object v0

    const-string v1, "ad_feed"

    .line 6
    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;->setSceneId(Ljava/lang/String;)Lcom/kwad/components/ad/feed/monitor/FeedWebViewInfo;

    move-result-object v0

    .line 7
    invoke-virtual {v0, p0}, Lcom/kwad/sdk/commercial/c/a;->setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/c/a;

    move-result-object p0

    .line 8
    invoke-static {p0}, Lcom/kwad/sdk/commercial/b;->f(Lcom/kwad/sdk/commercial/c/a;)V

    return-void
.end method

.method public static s(I)V
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    invoke-direct {v0}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;-><init>()V

    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setStatus(I)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object v0

    .line 3
    invoke-virtual {v0, p0}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setAdNum(I)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object p0

    .line 4
    invoke-static {p0}, Lcom/kwad/components/ad/feed/monitor/b;->a(Lcom/kwad/sdk/commercial/c/a;)V

    return-void
.end method

.method public static t(I)V
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    invoke-direct {v0}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;-><init>()V

    const/4 v1, 0x2

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setStatus(I)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object v0

    .line 3
    invoke-virtual {v0, p0}, Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;->setAdNum(I)Lcom/kwad/components/ad/feed/monitor/FeedPageInfo;

    move-result-object p0

    .line 4
    invoke-static {p0}, Lcom/kwad/components/ad/feed/monitor/b;->a(Lcom/kwad/sdk/commercial/c/a;)V

    return-void
.end method
