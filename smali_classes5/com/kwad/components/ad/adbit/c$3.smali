.class final Lcom/kwad/components/ad/adbit/c$3;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/adbit/c;->b(Lcom/kwad/components/core/request/model/a;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic bB:Lcom/kwad/components/core/request/model/a;

.field final synthetic bC:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/request/model/a;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/adbit/c$3;->bB:Lcom/kwad/components/core/request/model/a;

    iput-object p2, p0, Lcom/kwad/components/ad/adbit/c$3;->bC:Ljava/lang/String;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 5

    const-string v0, "server_bid_one"

    const/4 v1, 0x1

    .line 1
    :try_start_0
    iget-object v2, p0, Lcom/kwad/components/ad/adbit/c$3;->bB:Lcom/kwad/components/core/request/model/a;

    invoke-virtual {v2, v0}, Lcom/kwad/components/core/request/model/a;->ay(Ljava/lang/String;)V

    .line 2
    iget-object v2, p0, Lcom/kwad/components/ad/adbit/c$3;->bB:Lcom/kwad/components/core/request/model/a;

    iget-object v3, v2, Lcom/kwad/components/core/request/model/a;->MX:Lcom/kwad/components/core/request/model/ImpInfo;

    iget-object v3, v3, Lcom/kwad/components/core/request/model/ImpInfo;->adScene:Lcom/kwad/sdk/internal/api/SceneImpl;

    .line 3
    invoke-virtual {v2}, Lcom/kwad/components/core/request/model/a;->qZ()Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-static {v3, v2}, Lcom/kwad/sdk/commercial/d/d;->b(Lcom/kwad/sdk/internal/api/SceneImpl;Ljava/lang/String;)V

    .line 5
    new-instance v2, Lorg/json/JSONObject;

    iget-object v3, p0, Lcom/kwad/components/ad/adbit/c$3;->bC:Ljava/lang/String;

    invoke-direct {v2, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 6
    new-instance v3, Lcom/kwad/components/ad/adbit/AdBitResultData;

    iget-object v4, p0, Lcom/kwad/components/ad/adbit/c$3;->bB:Lcom/kwad/components/core/request/model/a;

    iget-object v4, v4, Lcom/kwad/components/core/request/model/a;->MX:Lcom/kwad/components/core/request/model/ImpInfo;

    iget-object v4, v4, Lcom/kwad/components/core/request/model/ImpInfo;->adScene:Lcom/kwad/sdk/internal/api/SceneImpl;

    invoke-direct {v3, v4}, Lcom/kwad/components/ad/adbit/AdBitResultData;-><init>(Lcom/kwad/sdk/internal/api/SceneImpl;)V

    .line 7
    invoke-virtual {v3, v2}, Lcom/kwad/components/ad/adbit/AdBitResultData;->parseJson(Lorg/json/JSONObject;)V

    .line 8
    invoke-static {v3}, Lcom/kwad/components/ad/adbit/c;->b(Lcom/kwad/components/ad/adbit/AdBitResultData;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/kwad/sdk/core/response/model/AdResultData;->setAdTemplateList(Ljava/util/List;)V

    .line 9
    invoke-virtual {v3, v0}, Lcom/kwad/sdk/core/response/model/AdResultData;->setAdSource(Ljava/lang/String;)V

    .line 10
    invoke-virtual {v3}, Lcom/kwad/sdk/core/response/model/AdResultData;->isAdResultDataEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 11
    iget-object v0, p0, Lcom/kwad/components/ad/adbit/c$3;->bB:Lcom/kwad/components/core/request/model/a;

    invoke-static {v0, v3, v1}, Lcom/kwad/components/core/request/model/a;->a(Lcom/kwad/components/core/request/model/a;Lcom/kwad/sdk/core/response/model/AdResultData;Z)V

    return-void

    .line 12
    :cond_0
    invoke-virtual {v3}, Lcom/kwad/sdk/core/response/model/AdResultData;->getAdTemplateList()Ljava/util/List;

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 13
    iget-object v2, p0, Lcom/kwad/components/ad/adbit/c$3;->bB:Lcom/kwad/components/core/request/model/a;

    iget-object v2, v2, Lcom/kwad/components/core/request/model/a;->MX:Lcom/kwad/components/core/request/model/ImpInfo;

    iget-object v2, v2, Lcom/kwad/components/core/request/model/ImpInfo;->adScene:Lcom/kwad/sdk/internal/api/SceneImpl;

    invoke-virtual {v2}, Lcom/kwad/sdk/internal/api/SceneImpl;->getAdStyle()I

    move-result v2

    const/16 v4, 0x2710

    if-eq v2, v4, :cond_1

    .line 14
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dM(Lcom/kwad/sdk/core/response/model/AdTemplate;)I

    move-result v0

    if-eq v2, v0, :cond_1

    .line 15
    iget-object v0, p0, Lcom/kwad/components/ad/adbit/c$3;->bB:Lcom/kwad/components/core/request/model/a;

    sget-object v2, Lcom/kwad/sdk/core/network/e;->awO:Lcom/kwad/sdk/core/network/e;

    iget v3, v2, Lcom/kwad/sdk/core/network/e;->errorCode:I

    iget-object v2, v2, Lcom/kwad/sdk/core/network/e;->msg:Ljava/lang/String;

    invoke-static {v0, v3, v2, v1}, Lcom/kwad/components/core/request/model/a;->a(Lcom/kwad/components/core/request/model/a;ILjava/lang/String;Z)V

    return-void

    .line 16
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/adbit/c$3;->bB:Lcom/kwad/components/core/request/model/a;

    invoke-static {v0, v3, v1}, Lcom/kwad/components/core/request/model/a;->a(Lcom/kwad/components/core/request/model/a;Lcom/kwad/sdk/core/response/model/AdResultData;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 17
    iget-object v2, p0, Lcom/kwad/components/ad/adbit/c$3;->bB:Lcom/kwad/components/core/request/model/a;

    sget-object v3, Lcom/kwad/sdk/core/network/e;->awJ:Lcom/kwad/sdk/core/network/e;

    iget v4, v3, Lcom/kwad/sdk/core/network/e;->errorCode:I

    iget-object v3, v3, Lcom/kwad/sdk/core/network/e;->msg:Ljava/lang/String;

    invoke-static {v2, v4, v3, v1}, Lcom/kwad/components/core/request/model/a;->a(Lcom/kwad/components/core/request/model/a;ILjava/lang/String;Z)V

    .line 18
    invoke-static {v0}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V

    return-void
.end method
