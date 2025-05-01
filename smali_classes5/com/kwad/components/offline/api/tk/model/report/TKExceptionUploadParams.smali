.class public Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;
.super Lcom/kwad/components/offline/api/core/model/BaseOfflineCompoJsonParse;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kwad/components/offline/api/core/model/BaseOfflineCompoJsonParse<",
        "Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;",
        ">;"
    }
.end annotation


# instance fields
.field public bizExtraInfo:Ljava/lang/String;

.field public bundleId:Ljava/lang/String;

.field public bundleSource:Ljava/lang/String;

.field public bundleType:Ljava/lang/String;

.field public bundleVersionCode:Ljava/lang/String;

.field public businessName:Ljava/lang/String;

.field public clientTimeStamp:J

.field public containerType:I

.field public error:Ljava/lang/String;

.field public errorType:Ljava/lang/String;

.field public key:Ljava/lang/String;

.field public sdkVersion:Ljava/lang/String;

.field public sessionId:Ljava/lang/String;

.field public taskId:Ljava/lang/String;

.field public templateId:Ljava/lang/String;

.field public templateVersionCode:Ljava/lang/String;

.field public v8SoType:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/offline/api/core/model/BaseOfflineCompoJsonParse;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic parseJson(Lcom/kwad/components/offline/api/core/model/IOfflineCompoJsonParse;Lorg/json/JSONObject;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;

    invoke-virtual {p0, p1, p2}, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->parseJson(Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;Lorg/json/JSONObject;)V

    return-void
.end method

.method public parseJson(Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;Lorg/json/JSONObject;)V
    .locals 2

    if-nez p2, :cond_0

    return-void

    :cond_0
    const-string p1, "key"

    .line 2
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->key:Ljava/lang/String;

    .line 3
    sget-object p1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->key:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const-string v0, ""

    if-eqz p1, :cond_1

    .line 4
    iput-object v0, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->key:Ljava/lang/String;

    :cond_1
    const-string p1, "error"

    .line 5
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->error:Ljava/lang/String;

    .line 6
    sget-object p1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->error:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 7
    iput-object v0, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->error:Ljava/lang/String;

    :cond_2
    const-string p1, "v8SoType"

    .line 8
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->v8SoType:I

    const-string p1, "bundleType"

    .line 9
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->bundleType:Ljava/lang/String;

    .line 10
    sget-object p1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->bundleType:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 11
    iput-object v0, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->bundleType:Ljava/lang/String;

    :cond_3
    const-string p1, "bundleSource"

    .line 12
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->bundleSource:Ljava/lang/String;

    .line 13
    sget-object p1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->bundleSource:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 14
    iput-object v0, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->bundleSource:Ljava/lang/String;

    :cond_4
    const-string p1, "bundleId"

    .line 15
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->bundleId:Ljava/lang/String;

    .line 16
    sget-object p1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->bundleId:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 17
    iput-object v0, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->bundleId:Ljava/lang/String;

    :cond_5
    const-string p1, "bundleVersionCode"

    .line 18
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->bundleVersionCode:Ljava/lang/String;

    .line 19
    sget-object p1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->bundleVersionCode:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 20
    iput-object v0, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->bundleVersionCode:Ljava/lang/String;

    :cond_6
    const-string p1, "businessName"

    .line 21
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->businessName:Ljava/lang/String;

    .line 22
    sget-object p1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->businessName:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 23
    iput-object v0, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->businessName:Ljava/lang/String;

    :cond_7
    const-string p1, "taskId"

    .line 24
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->taskId:Ljava/lang/String;

    .line 25
    sget-object p1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->taskId:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 26
    iput-object v0, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->taskId:Ljava/lang/String;

    :cond_8
    const-string p1, "templateId"

    .line 27
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->templateId:Ljava/lang/String;

    .line 28
    sget-object p1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->templateId:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    .line 29
    iput-object v0, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->templateId:Ljava/lang/String;

    :cond_9
    const-string p1, "templateVersionCode"

    .line 30
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->templateVersionCode:Ljava/lang/String;

    .line 31
    sget-object p1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->templateVersionCode:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    .line 32
    iput-object v0, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->templateVersionCode:Ljava/lang/String;

    :cond_a
    const-string p1, "sdkVersion"

    .line 33
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->sdkVersion:Ljava/lang/String;

    .line 34
    sget-object p1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->sdkVersion:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    .line 35
    iput-object v0, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->sdkVersion:Ljava/lang/String;

    :cond_b
    const-string p1, "sessionId"

    .line 36
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->sessionId:Ljava/lang/String;

    .line 37
    sget-object p1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->sessionId:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_c

    .line 38
    iput-object v0, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->sessionId:Ljava/lang/String;

    :cond_c
    const-string p1, "biz_extra_info"

    .line 39
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->bizExtraInfo:Ljava/lang/String;

    .line 40
    sget-object p1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->bizExtraInfo:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_d

    .line 41
    iput-object v0, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->bizExtraInfo:Ljava/lang/String;

    :cond_d
    const-string p1, "errorType"

    .line 42
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->errorType:Ljava/lang/String;

    .line 43
    sget-object p1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->errorType:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_e

    .line 44
    iput-object v0, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->errorType:Ljava/lang/String;

    :cond_e
    const-string p1, "container_type"

    .line 45
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->containerType:I

    const-string p1, "clientTimeStamp"

    .line 46
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->clientTimeStamp:J

    return-void
.end method

.method public bridge synthetic toJson(Lcom/kwad/components/offline/api/core/model/IOfflineCompoJsonParse;)Lorg/json/JSONObject;
    .locals 0

    .line 1
    check-cast p1, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;

    invoke-virtual {p0, p1}, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->toJson(Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic toJson(Lcom/kwad/components/offline/api/core/model/IOfflineCompoJsonParse;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 0

    .line 2
    check-cast p1, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;

    invoke-virtual {p0, p1, p2}, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->toJson(Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;)Lorg/json/JSONObject;
    .locals 1

    const/4 v0, 0x0

    .line 36
    invoke-virtual {p0, p1, v0}, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->toJson(Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 4

    if-nez p2, :cond_0

    .line 3
    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->error:Ljava/lang/String;

    const-string v0, ""

    if-eqz p1, :cond_1

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 5
    iget-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->error:Ljava/lang/String;

    const-string v1, "error"

    invoke-static {p2, v1, p1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    :cond_1
    iget p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->v8SoType:I

    if-eqz p1, :cond_2

    const-string v1, "v8SoType"

    .line 7
    invoke-static {p2, v1, p1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 8
    :cond_2
    iget-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->bundleType:Ljava/lang/String;

    if-eqz p1, :cond_3

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    .line 9
    iget-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->bundleType:Ljava/lang/String;

    const-string v1, "bundleType"

    invoke-static {p2, v1, p1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    :cond_3
    iget-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->bundleSource:Ljava/lang/String;

    if-eqz p1, :cond_4

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    .line 11
    iget-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->bundleSource:Ljava/lang/String;

    const-string v1, "bundleSource"

    invoke-static {p2, v1, p1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    :cond_4
    iget-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->bundleId:Ljava/lang/String;

    if-eqz p1, :cond_5

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    .line 13
    iget-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->bundleId:Ljava/lang/String;

    const-string v1, "bundleId"

    invoke-static {p2, v1, p1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    :cond_5
    iget-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->bundleVersionCode:Ljava/lang/String;

    if-eqz p1, :cond_6

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    .line 15
    iget-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->bundleVersionCode:Ljava/lang/String;

    const-string v1, "bundleVersionCode"

    invoke-static {p2, v1, p1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    :cond_6
    iget-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->businessName:Ljava/lang/String;

    if-eqz p1, :cond_7

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    .line 17
    iget-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->businessName:Ljava/lang/String;

    const-string v1, "businessName"

    invoke-static {p2, v1, p1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    :cond_7
    iget-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->taskId:Ljava/lang/String;

    if-eqz p1, :cond_8

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    .line 19
    iget-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->taskId:Ljava/lang/String;

    const-string v1, "taskId"

    invoke-static {p2, v1, p1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    :cond_8
    iget-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->templateId:Ljava/lang/String;

    if-eqz p1, :cond_9

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    .line 21
    iget-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->templateId:Ljava/lang/String;

    const-string v1, "templateId"

    invoke-static {p2, v1, p1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    :cond_9
    iget-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->templateVersionCode:Ljava/lang/String;

    if-eqz p1, :cond_a

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    .line 23
    iget-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->templateVersionCode:Ljava/lang/String;

    const-string v1, "templateVersionCode"

    invoke-static {p2, v1, p1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    :cond_a
    iget-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->sdkVersion:Ljava/lang/String;

    if-eqz p1, :cond_b

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    .line 25
    iget-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->sdkVersion:Ljava/lang/String;

    const-string v1, "sdkVersion"

    invoke-static {p2, v1, p1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    :cond_b
    iget-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->sessionId:Ljava/lang/String;

    if-eqz p1, :cond_c

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    .line 27
    iget-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->sessionId:Ljava/lang/String;

    const-string v1, "sessionId"

    invoke-static {p2, v1, p1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    :cond_c
    iget-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->bizExtraInfo:Ljava/lang/String;

    if-eqz p1, :cond_d

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    .line 29
    iget-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->bizExtraInfo:Ljava/lang/String;

    const-string v1, "biz_extra_info"

    invoke-static {p2, v1, p1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    :cond_d
    iget-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->errorType:Ljava/lang/String;

    if-eqz p1, :cond_e

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    .line 31
    iget-object p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->errorType:Ljava/lang/String;

    const-string v0, "errorType"

    invoke-static {p2, v0, p1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    :cond_e
    iget p1, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->containerType:I

    if-eqz p1, :cond_f

    const-string v0, "container_type"

    .line 33
    invoke-static {p2, v0, p1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 34
    :cond_f
    iget-wide v0, p0, Lcom/kwad/components/offline/api/tk/model/report/TKExceptionUploadParams;->clientTimeStamp:J

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-eqz p1, :cond_10

    const-string p1, "clientTimeStamp"

    .line 35
    invoke-static {p2, p1, v0, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    :cond_10
    return-object p2
.end method
