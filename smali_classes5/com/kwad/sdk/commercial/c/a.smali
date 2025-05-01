.class public abstract Lcom/kwad/sdk/commercial/c/a;
.super Lcom/kwad/sdk/core/response/a/a;
.source "SourceFile"


# annotations
.annotation build Lcom/ksad/json/annotation/KsJson;
.end annotation


# instance fields
.field public adOperationType:I

.field public campaignType:I

.field public creativeId:J

.field public errorCode:I

.field public errorMsg:Ljava/lang/String;

.field public industryFirstLevelId:I

.field public llsid:J

.field public ocpcActionType:I

.field public posId:J

.field public templateId:Ljava/lang/String;

.field public templateVersion:Ljava/lang/String;

.field public tkPublishType:I

.field public webUriSourceType:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/response/a/a;-><init>()V

    return-void
.end method


# virtual methods
.method public setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/c/a;
    .locals 2

    if-nez p1, :cond_0

    return-object p0

    .line 1
    :cond_0
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->ec(Lcom/kwad/sdk/core/response/model/AdTemplate;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/commercial/c/a;->creativeId:J

    .line 2
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dP(Lcom/kwad/sdk/core/response/model/AdTemplate;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/commercial/c/a;->llsid:J

    .line 3
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dL(Lcom/kwad/sdk/core/response/model/AdTemplate;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/commercial/c/a;->posId:J

    .line 4
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->dh(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v1

    iput v1, p0, Lcom/kwad/sdk/commercial/c/a;->campaignType:I

    .line 6
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->di(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v1

    iput v1, p0, Lcom/kwad/sdk/commercial/c/a;->ocpcActionType:I

    .line 7
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->dj(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v1

    iput v1, p0, Lcom/kwad/sdk/commercial/c/a;->industryFirstLevelId:I

    .line 8
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->aP(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v1

    iput v1, p0, Lcom/kwad/sdk/commercial/c/a;->adOperationType:I

    .line 9
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->dk(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/commercial/c/a;->webUriSourceType:I

    .line 10
    invoke-static {p1}, Lcom/kwad/sdk/commercial/d;->aU(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdMatrixInfo$MatrixTemplate;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 11
    iget-object v0, p1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$BaseMatrixTemplate;->templateId:Ljava/lang/String;

    iput-object v0, p0, Lcom/kwad/sdk/commercial/c/a;->templateId:Ljava/lang/String;

    .line 12
    iget-object v0, p1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$MatrixTemplate;->templateVersion:Ljava/lang/String;

    iput-object v0, p0, Lcom/kwad/sdk/commercial/c/a;->templateVersion:Ljava/lang/String;

    .line 13
    iget p1, p1, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$MatrixTemplate;->publishType:I

    iput p1, p0, Lcom/kwad/sdk/commercial/c/a;->tkPublishType:I

    :cond_1
    return-object p0
.end method

.method public setErrorCode(I)Lcom/kwad/sdk/commercial/c/a;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/commercial/c/a;->errorCode:I

    return-object p0
.end method

.method public setErrorMsg(Ljava/lang/String;)Lcom/kwad/sdk/commercial/c/a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/commercial/c/a;->errorMsg:Ljava/lang/String;

    return-object p0
.end method

.method public setLlsid(J)Lcom/kwad/sdk/commercial/c/a;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/kwad/sdk/commercial/c/a;->llsid:J

    return-object p0
.end method

.method public setPosId(J)Lcom/kwad/sdk/commercial/c/a;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/kwad/sdk/commercial/c/a;->posId:J

    return-object p0
.end method
