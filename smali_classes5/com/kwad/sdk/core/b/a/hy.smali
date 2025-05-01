.class public final Lcom/kwad/sdk/core/b/a/hy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/kwad/sdk/core/d<",
        "Lcom/kwad/sdk/core/report/n;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Lcom/kwad/sdk/core/report/n;Lorg/json/JSONObject;)V
    .locals 5

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string v0, "timestamp"

    .line 2
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/core/report/n;->timestamp:J

    const-string v0, "sessionId"

    .line 3
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->sessionId:Ljava/lang/String;

    .line 4
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/sdk/core/report/n;->sessionId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_1

    .line 5
    iput-object v1, p0, Lcom/kwad/sdk/core/report/n;->sessionId:Ljava/lang/String;

    :cond_1
    const-string v0, "seq"

    .line 6
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/sdk/core/report/n;->Jg:J

    const-string v0, "listId"

    .line 7
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/sdk/core/report/n;->ayV:J

    const-string v0, "actionType"

    .line 8
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/sdk/core/report/n;->actionType:J

    const-string v0, "payload"

    .line 9
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->Lh:Ljava/lang/String;

    .line 10
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/sdk/core/report/n;->Lh:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 11
    iput-object v1, p0, Lcom/kwad/sdk/core/report/n;->Lh:Ljava/lang/String;

    :cond_2
    const-string v0, "llsid"

    .line 12
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/sdk/core/report/n;->llsid:J

    const-string v0, "extra"

    .line 13
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->ayW:Lorg/json/JSONObject;

    const-string v0, "impAdExtra"

    .line 14
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->ayX:Lorg/json/JSONObject;

    const-string v0, "posId"

    .line 15
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/sdk/core/report/n;->posId:J

    const-string v0, "contentType"

    .line 16
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/report/n;->contentType:I

    const-string v0, "realShowType"

    .line 17
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/report/n;->realShowType:I

    const-string v0, "photoId"

    .line 18
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/sdk/core/report/n;->photoId:J

    const-string v0, "position"

    .line 19
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/sdk/core/report/n;->position:J

    const-string v0, "serverPosition"

    .line 20
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/sdk/core/report/n;->ayY:J

    const-string v0, "photoDuration"

    .line 21
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/sdk/core/report/n;->ayZ:J

    const-string v0, "effectivePlayDuration"

    .line 22
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/sdk/core/report/n;->aza:J

    const-string v0, "playDuration"

    .line 23
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/sdk/core/report/n;->WF:J

    const-string v0, "blockDuration"

    .line 24
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/sdk/core/report/n;->blockDuration:J

    const-string v0, "intervalDuration"

    .line 25
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/sdk/core/report/n;->azb:J

    const-string v0, "allIntervalDuration"

    .line 26
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/sdk/core/report/n;->azc:J

    const-string v0, "flowSdk"

    .line 27
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/sdk/core/report/n;->azd:J

    const-string v0, "blockTimes"

    .line 28
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/sdk/core/report/n;->aze:J

    .line 29
    new-instance v0, Ljava/lang/Integer;

    const-string v2, "0"

    invoke-direct {v0, v2}, Ljava/lang/Integer;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const-string v3, "contentSourceType"

    invoke-virtual {p1, v3, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/report/n;->contentSourceType:I

    const-string v0, "adAggPageSource"

    .line 30
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/report/n;->are:I

    const-string v0, "entryPageSource"

    .line 31
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->entryPageSource:Ljava/lang/String;

    .line 32
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lcom/kwad/sdk/core/report/n;->entryPageSource:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 33
    iput-object v1, p0, Lcom/kwad/sdk/core/report/n;->entryPageSource:Ljava/lang/String;

    .line 34
    :cond_3
    new-instance v0, Lcom/kwad/sdk/core/scene/URLPackage;

    invoke-direct {v0}, Lcom/kwad/sdk/core/scene/URLPackage;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->urlPackage:Lcom/kwad/sdk/core/scene/URLPackage;

    const-string v3, "urlPackage"

    .line 35
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/kwad/sdk/core/response/a/a;->parseJson(Lorg/json/JSONObject;)V

    .line 36
    new-instance v0, Lcom/kwad/sdk/core/scene/URLPackage;

    invoke-direct {v0}, Lcom/kwad/sdk/core/scene/URLPackage;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->azf:Lcom/kwad/sdk/core/scene/URLPackage;

    const-string v3, "referURLPackage"

    .line 37
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/kwad/sdk/core/response/a/a;->parseJson(Lorg/json/JSONObject;)V

    const-string v0, "authorId"

    .line 38
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v3

    iput-wide v3, p0, Lcom/kwad/sdk/core/report/n;->SK:J

    const-string v0, "photoSize"

    .line 39
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->azg:Ljava/lang/String;

    .line 40
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lcom/kwad/sdk/core/report/n;->azg:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 41
    iput-object v1, p0, Lcom/kwad/sdk/core/report/n;->azg:Ljava/lang/String;

    :cond_4
    const-string v0, "appInstalled"

    .line 42
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->azh:Lorg/json/JSONArray;

    const-string v0, "appUninstalled"

    .line 43
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->azi:Lorg/json/JSONArray;

    .line 44
    new-instance v0, Lcom/kwad/sdk/core/report/n$a;

    invoke-direct {v0}, Lcom/kwad/sdk/core/report/n$a;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->azj:Lcom/kwad/sdk/core/report/n$a;

    const-string v3, "clientExt"

    .line 45
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/kwad/sdk/core/response/a/a;->parseJson(Lorg/json/JSONObject;)V

    const-string v0, "playerType"

    .line 46
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/report/n;->azk:I

    const-string v0, "uiType"

    .line 47
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/report/n;->azl:I

    .line 48
    new-instance v0, Ljava/lang/Integer;

    invoke-direct {v0, v2}, Ljava/lang/Integer;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const-string v3, "isLeftSlipStatus"

    invoke-virtual {p1, v3, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/report/n;->azm:I

    const-string v0, "refreshType"

    .line 49
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/report/n;->Ye:I

    .line 50
    new-instance v0, Ljava/lang/Integer;

    invoke-direct {v0, v2}, Ljava/lang/Integer;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const-string v3, "photoResponseType"

    invoke-virtual {p1, v3, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/report/n;->azn:I

    const-string v0, "failUrl"

    .line 51
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->azo:Ljava/lang/String;

    .line 52
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lcom/kwad/sdk/core/report/n;->azo:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 53
    iput-object v1, p0, Lcom/kwad/sdk/core/report/n;->azo:Ljava/lang/String;

    :cond_5
    const-string v0, "errorMsg"

    .line 54
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->errorMsg:Ljava/lang/String;

    .line 55
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lcom/kwad/sdk/core/report/n;->errorMsg:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 56
    iput-object v1, p0, Lcom/kwad/sdk/core/report/n;->errorMsg:Ljava/lang/String;

    .line 57
    :cond_6
    new-instance v0, Ljava/lang/Integer;

    invoke-direct {v0, v2}, Ljava/lang/Integer;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const-string v3, "errorCode"

    invoke-virtual {p1, v3, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/report/n;->errorCode:I

    const-string v0, "creativeId"

    .line 58
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v3

    iput-wide v3, p0, Lcom/kwad/sdk/core/report/n;->creativeId:J

    const-string v0, "cacheFailedReason"

    .line 59
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->azr:Ljava/lang/String;

    .line 60
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lcom/kwad/sdk/core/report/n;->azr:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 61
    iput-object v1, p0, Lcom/kwad/sdk/core/report/n;->azr:Ljava/lang/String;

    :cond_7
    const-string v0, "appExt"

    .line 62
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->azs:Lorg/json/JSONObject;

    const-string v0, "appRunningInfoList"

    .line 63
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->azt:Lorg/json/JSONArray;

    const-string v0, "downloadDuration"

    .line 64
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v3

    iput-wide v3, p0, Lcom/kwad/sdk/core/report/n;->downloadDuration:J

    .line 65
    new-instance v0, Ljava/lang/Integer;

    invoke-direct {v0, v2}, Ljava/lang/Integer;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const-string v3, "pageType"

    invoke-virtual {p1, v3, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/report/n;->pageType:I

    const-string v0, "speedLimitStatus"

    .line 66
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/report/n;->azu:I

    const-string v0, "speedLimitThreshold"

    .line 67
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/report/n;->azv:I

    const-string v0, "currentRealDownloadSpeed"

    .line 68
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/report/n;->azw:I

    const-string v0, "sdkPlatform"

    .line 69
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->azy:Lorg/json/JSONArray;

    const-string v0, "isKsUnion"

    .line 70
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/kwad/sdk/core/report/n;->azz:Z

    const-string v0, "trackMethodName"

    .line 71
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->azA:Ljava/lang/String;

    .line 72
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lcom/kwad/sdk/core/report/n;->azA:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 73
    iput-object v1, p0, Lcom/kwad/sdk/core/report/n;->azA:Ljava/lang/String;

    .line 74
    :cond_8
    new-instance v0, Ljava/lang/Integer;

    invoke-direct {v0, v2}, Ljava/lang/Integer;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const-string v2, "viewModeType"

    invoke-virtual {p1, v2, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/report/n;->azB:I

    const-string v0, "clickTime"

    .line 75
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/sdk/core/report/n;->clickTime:J

    const-string v0, "frameRenderTime"

    .line 76
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/sdk/core/report/n;->azD:J

    const-string v0, "playerEnterAction"

    .line 77
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/report/n;->azE:I

    const-string v0, "requestUrl"

    .line 78
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->azF:Ljava/lang/String;

    .line 79
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/sdk/core/report/n;->azF:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 80
    iput-object v1, p0, Lcom/kwad/sdk/core/report/n;->azF:Ljava/lang/String;

    :cond_9
    const-string v0, "requestTotalTime"

    .line 81
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/sdk/core/report/n;->azG:J

    const-string v0, "requestResponseTime"

    .line 82
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/sdk/core/report/n;->azH:J

    const-string v0, "requestParseDataTime"

    .line 83
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/sdk/core/report/n;->azI:J

    const-string v0, "requestCallbackTime"

    .line 84
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/sdk/core/report/n;->azJ:J

    const-string v0, "requestFailReason"

    .line 85
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->azK:Ljava/lang/String;

    .line 86
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/sdk/core/report/n;->azK:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 87
    iput-object v1, p0, Lcom/kwad/sdk/core/report/n;->azK:Ljava/lang/String;

    :cond_a
    const-string v0, "pageName"

    .line 88
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->RH:Ljava/lang/String;

    .line 89
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/sdk/core/report/n;->RH:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 90
    iput-object v1, p0, Lcom/kwad/sdk/core/report/n;->RH:Ljava/lang/String;

    :cond_b
    const-string v0, "pageCreateTime"

    .line 91
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/sdk/core/report/n;->RP:J

    const-string v0, "pageResumeTime"

    .line 92
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/sdk/core/report/n;->RQ:J

    const-string v0, "trackUrlType"

    .line 93
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/report/n;->azL:I

    const-string v0, "trackUrlList"

    .line 94
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->azM:Lorg/json/JSONArray;

    const-string v0, "pageLaunchTime"

    .line 95
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/sdk/core/report/n;->RO:J

    const-string v0, "appAuthorityInfoList"

    .line 96
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->azP:Lorg/json/JSONArray;

    const-string v0, "tkVersion"

    .line 97
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->azQ:Ljava/lang/String;

    .line 98
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/sdk/core/report/n;->azQ:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 99
    iput-object v1, p0, Lcom/kwad/sdk/core/report/n;->azQ:Ljava/lang/String;

    :cond_c
    const-string v0, "jsVersion"

    .line 100
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->azR:Ljava/lang/String;

    .line 101
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/sdk/core/report/n;->azR:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 102
    iput-object v1, p0, Lcom/kwad/sdk/core/report/n;->azR:Ljava/lang/String;

    :cond_d
    const-string v0, "jsFileName"

    .line 103
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->azS:Ljava/lang/String;

    .line 104
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/sdk/core/report/n;->azS:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 105
    iput-object v1, p0, Lcom/kwad/sdk/core/report/n;->azS:Ljava/lang/String;

    :cond_e
    const-string v0, "jsErrorMsg"

    .line 106
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->azT:Ljava/lang/String;

    .line 107
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/sdk/core/report/n;->azT:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 108
    iput-object v1, p0, Lcom/kwad/sdk/core/report/n;->azT:Ljava/lang/String;

    :cond_f
    const-string v0, "jsConfig"

    .line 109
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->azU:Ljava/lang/String;

    .line 110
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/sdk/core/report/n;->azU:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 111
    iput-object v1, p0, Lcom/kwad/sdk/core/report/n;->azU:Ljava/lang/String;

    :cond_10
    const-string v0, "adBizType"

    .line 112
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/report/n;->azV:I

    const-string v0, "customKey"

    .line 113
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->azW:Ljava/lang/String;

    .line 114
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/sdk/core/report/n;->azW:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 115
    iput-object v1, p0, Lcom/kwad/sdk/core/report/n;->azW:Ljava/lang/String;

    :cond_11
    const-string v0, "customValue"

    .line 116
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->azX:Ljava/lang/String;

    .line 117
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/sdk/core/report/n;->azX:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 118
    iput-object v1, p0, Lcom/kwad/sdk/core/report/n;->azX:Ljava/lang/String;

    :cond_12
    const-string v0, "trace"

    .line 119
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->trace:Ljava/lang/String;

    .line 120
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/sdk/core/report/n;->trace:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 121
    iput-object v1, p0, Lcom/kwad/sdk/core/report/n;->trace:Ljava/lang/String;

    :cond_13
    const-string v0, "filterCode"

    .line 122
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/report/n;->azY:I

    const-string v0, "sdkVersionCode"

    .line 123
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/report/n;->azZ:I

    const-string v0, "sdkVersion"

    .line 124
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->sdkVersion:Ljava/lang/String;

    .line 125
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/sdk/core/report/n;->sdkVersion:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 126
    iput-object v1, p0, Lcom/kwad/sdk/core/report/n;->sdkVersion:Ljava/lang/String;

    :cond_14
    const-string v0, "adSdkVersion"

    .line 127
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->aAa:Ljava/lang/String;

    .line 128
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/sdk/core/report/n;->aAa:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_15

    .line 129
    iput-object v1, p0, Lcom/kwad/sdk/core/report/n;->aAa:Ljava/lang/String;

    :cond_15
    const-string v0, "sdkApiVersion"

    .line 130
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->XB:Ljava/lang/String;

    .line 131
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/sdk/core/report/n;->XB:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_16

    .line 132
    iput-object v1, p0, Lcom/kwad/sdk/core/report/n;->XB:Ljava/lang/String;

    :cond_16
    const-string v0, "sdkType"

    .line 133
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/report/n;->sdkType:I

    const-string v0, "appUseDuration"

    .line 134
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/sdk/core/report/n;->aAb:J

    const-string v0, "appStartType"

    .line 135
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/sdk/core/report/n;->aAc:J

    const-string v0, "sequenceNumber"

    .line 136
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/sdk/core/report/n;->avo:J

    const-string v0, "appColdStart"

    .line 137
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->Jd:Ljava/lang/String;

    .line 138
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/sdk/core/report/n;->Jd:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_17

    .line 139
    iput-object v1, p0, Lcom/kwad/sdk/core/report/n;->Jd:Ljava/lang/String;

    :cond_17
    const-string v0, "appStart"

    .line 140
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/core/report/n;->Je:Ljava/lang/String;

    .line 141
    sget-object p1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->Je:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_18

    .line 142
    iput-object v1, p0, Lcom/kwad/sdk/core/report/n;->Je:Ljava/lang/String;

    :cond_18
    return-void
.end method

.method private static b(Lcom/kwad/sdk/core/report/n;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 6

    if-nez p1, :cond_0

    .line 2
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 3
    :cond_0
    iget-wide v0, p0, Lcom/kwad/sdk/core/report/n;->timestamp:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    const-string v4, "timestamp"

    .line 4
    invoke-static {p1, v4, v0, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->sessionId:Ljava/lang/String;

    const-string v1, ""

    if-eqz v0, :cond_2

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 6
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->sessionId:Ljava/lang/String;

    const-string v4, "sessionId"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    :cond_2
    iget-wide v4, p0, Lcom/kwad/sdk/core/report/n;->Jg:J

    cmp-long v0, v4, v2

    if-eqz v0, :cond_3

    const-string v0, "seq"

    .line 8
    invoke-static {p1, v0, v4, v5}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 9
    :cond_3
    iget-wide v4, p0, Lcom/kwad/sdk/core/report/n;->ayV:J

    cmp-long v0, v4, v2

    if-eqz v0, :cond_4

    const-string v0, "listId"

    .line 10
    invoke-static {p1, v0, v4, v5}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 11
    :cond_4
    iget-wide v4, p0, Lcom/kwad/sdk/core/report/n;->actionType:J

    cmp-long v0, v4, v2

    if-eqz v0, :cond_5

    const-string v0, "actionType"

    .line 12
    invoke-static {p1, v0, v4, v5}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 13
    :cond_5
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->Lh:Ljava/lang/String;

    if-eqz v0, :cond_6

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 14
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->Lh:Ljava/lang/String;

    const-string v4, "payload"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    :cond_6
    iget-wide v4, p0, Lcom/kwad/sdk/core/report/n;->llsid:J

    cmp-long v0, v4, v2

    if-eqz v0, :cond_7

    const-string v0, "llsid"

    .line 16
    invoke-static {p1, v0, v4, v5}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 17
    :cond_7
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->ayW:Lorg/json/JSONObject;

    const-string v4, "extra"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 18
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->ayX:Lorg/json/JSONObject;

    const-string v4, "impAdExtra"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 19
    iget-wide v4, p0, Lcom/kwad/sdk/core/report/n;->posId:J

    cmp-long v0, v4, v2

    if-eqz v0, :cond_8

    const-string v0, "posId"

    .line 20
    invoke-static {p1, v0, v4, v5}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 21
    :cond_8
    iget v0, p0, Lcom/kwad/sdk/core/report/n;->contentType:I

    if-eqz v0, :cond_9

    const-string v4, "contentType"

    .line 22
    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 23
    :cond_9
    iget v0, p0, Lcom/kwad/sdk/core/report/n;->realShowType:I

    if-eqz v0, :cond_a

    const-string v4, "realShowType"

    .line 24
    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 25
    :cond_a
    iget-wide v4, p0, Lcom/kwad/sdk/core/report/n;->photoId:J

    cmp-long v0, v4, v2

    if-eqz v0, :cond_b

    const-string v0, "photoId"

    .line 26
    invoke-static {p1, v0, v4, v5}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 27
    :cond_b
    iget-wide v4, p0, Lcom/kwad/sdk/core/report/n;->position:J

    cmp-long v0, v4, v2

    if-eqz v0, :cond_c

    const-string v0, "position"

    .line 28
    invoke-static {p1, v0, v4, v5}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 29
    :cond_c
    iget-wide v4, p0, Lcom/kwad/sdk/core/report/n;->ayY:J

    cmp-long v0, v4, v2

    if-eqz v0, :cond_d

    const-string v0, "serverPosition"

    .line 30
    invoke-static {p1, v0, v4, v5}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 31
    :cond_d
    iget-wide v4, p0, Lcom/kwad/sdk/core/report/n;->ayZ:J

    cmp-long v0, v4, v2

    if-eqz v0, :cond_e

    const-string v0, "photoDuration"

    .line 32
    invoke-static {p1, v0, v4, v5}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 33
    :cond_e
    iget-wide v4, p0, Lcom/kwad/sdk/core/report/n;->aza:J

    cmp-long v0, v4, v2

    if-eqz v0, :cond_f

    const-string v0, "effectivePlayDuration"

    .line 34
    invoke-static {p1, v0, v4, v5}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 35
    :cond_f
    iget-wide v4, p0, Lcom/kwad/sdk/core/report/n;->WF:J

    cmp-long v0, v4, v2

    if-eqz v0, :cond_10

    const-string v0, "playDuration"

    .line 36
    invoke-static {p1, v0, v4, v5}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 37
    :cond_10
    iget-wide v4, p0, Lcom/kwad/sdk/core/report/n;->blockDuration:J

    cmp-long v0, v4, v2

    if-eqz v0, :cond_11

    const-string v0, "blockDuration"

    .line 38
    invoke-static {p1, v0, v4, v5}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 39
    :cond_11
    iget-wide v4, p0, Lcom/kwad/sdk/core/report/n;->azb:J

    cmp-long v0, v4, v2

    if-eqz v0, :cond_12

    const-string v0, "intervalDuration"

    .line 40
    invoke-static {p1, v0, v4, v5}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 41
    :cond_12
    iget-wide v4, p0, Lcom/kwad/sdk/core/report/n;->azc:J

    cmp-long v0, v4, v2

    if-eqz v0, :cond_13

    const-string v0, "allIntervalDuration"

    .line 42
    invoke-static {p1, v0, v4, v5}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 43
    :cond_13
    iget-wide v4, p0, Lcom/kwad/sdk/core/report/n;->azd:J

    cmp-long v0, v4, v2

    if-eqz v0, :cond_14

    const-string v0, "flowSdk"

    .line 44
    invoke-static {p1, v0, v4, v5}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 45
    :cond_14
    iget-wide v4, p0, Lcom/kwad/sdk/core/report/n;->aze:J

    cmp-long v0, v4, v2

    if-eqz v0, :cond_15

    const-string v0, "blockTimes"

    .line 46
    invoke-static {p1, v0, v4, v5}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 47
    :cond_15
    iget v0, p0, Lcom/kwad/sdk/core/report/n;->contentSourceType:I

    const-string v4, "contentSourceType"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 48
    iget v0, p0, Lcom/kwad/sdk/core/report/n;->are:I

    if-eqz v0, :cond_16

    const-string v4, "adAggPageSource"

    .line 49
    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 50
    :cond_16
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->entryPageSource:Ljava/lang/String;

    if-eqz v0, :cond_17

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    .line 51
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->entryPageSource:Ljava/lang/String;

    const-string v4, "entryPageSource"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    :cond_17
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->urlPackage:Lcom/kwad/sdk/core/scene/URLPackage;

    const-string v4, "urlPackage"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->a(Lorg/json/JSONObject;Ljava/lang/String;Lcom/kwad/sdk/core/b;)V

    .line 53
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->azf:Lcom/kwad/sdk/core/scene/URLPackage;

    const-string v4, "referURLPackage"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->a(Lorg/json/JSONObject;Ljava/lang/String;Lcom/kwad/sdk/core/b;)V

    .line 54
    iget-wide v4, p0, Lcom/kwad/sdk/core/report/n;->SK:J

    cmp-long v0, v4, v2

    if-eqz v0, :cond_18

    const-string v0, "authorId"

    .line 55
    invoke-static {p1, v0, v4, v5}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 56
    :cond_18
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->azg:Ljava/lang/String;

    if-eqz v0, :cond_19

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    .line 57
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->azg:Ljava/lang/String;

    const-string v4, "photoSize"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    :cond_19
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->azh:Lorg/json/JSONArray;

    const-string v4, "appInstalled"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONArray;)V

    .line 59
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->azi:Lorg/json/JSONArray;

    const-string v4, "appUninstalled"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONArray;)V

    .line 60
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->azj:Lcom/kwad/sdk/core/report/n$a;

    const-string v4, "clientExt"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->a(Lorg/json/JSONObject;Ljava/lang/String;Lcom/kwad/sdk/core/b;)V

    .line 61
    iget v0, p0, Lcom/kwad/sdk/core/report/n;->azk:I

    if-eqz v0, :cond_1a

    const-string v4, "playerType"

    .line 62
    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 63
    :cond_1a
    iget v0, p0, Lcom/kwad/sdk/core/report/n;->azl:I

    if-eqz v0, :cond_1b

    const-string v4, "uiType"

    .line 64
    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 65
    :cond_1b
    iget v0, p0, Lcom/kwad/sdk/core/report/n;->azm:I

    const-string v4, "isLeftSlipStatus"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 66
    iget v0, p0, Lcom/kwad/sdk/core/report/n;->Ye:I

    if-eqz v0, :cond_1c

    const-string v4, "refreshType"

    .line 67
    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 68
    :cond_1c
    iget v0, p0, Lcom/kwad/sdk/core/report/n;->azn:I

    const-string v4, "photoResponseType"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 69
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->azo:Ljava/lang/String;

    if-eqz v0, :cond_1d

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1d

    .line 70
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->azo:Ljava/lang/String;

    const-string v4, "failUrl"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    :cond_1d
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->errorMsg:Ljava/lang/String;

    if-eqz v0, :cond_1e

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1e

    .line 72
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->errorMsg:Ljava/lang/String;

    const-string v4, "errorMsg"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    :cond_1e
    iget v0, p0, Lcom/kwad/sdk/core/report/n;->errorCode:I

    const-string v4, "errorCode"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 74
    iget-wide v4, p0, Lcom/kwad/sdk/core/report/n;->creativeId:J

    cmp-long v0, v4, v2

    if-eqz v0, :cond_1f

    const-string v0, "creativeId"

    .line 75
    invoke-static {p1, v0, v4, v5}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 76
    :cond_1f
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->azr:Ljava/lang/String;

    if-eqz v0, :cond_20

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_20

    .line 77
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->azr:Ljava/lang/String;

    const-string v4, "cacheFailedReason"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    :cond_20
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->azs:Lorg/json/JSONObject;

    const-string v4, "appExt"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 79
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->azt:Lorg/json/JSONArray;

    const-string v4, "appRunningInfoList"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONArray;)V

    .line 80
    iget-wide v4, p0, Lcom/kwad/sdk/core/report/n;->downloadDuration:J

    cmp-long v0, v4, v2

    if-eqz v0, :cond_21

    const-string v0, "downloadDuration"

    .line 81
    invoke-static {p1, v0, v4, v5}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 82
    :cond_21
    iget v0, p0, Lcom/kwad/sdk/core/report/n;->pageType:I

    const-string v4, "pageType"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 83
    iget v0, p0, Lcom/kwad/sdk/core/report/n;->azu:I

    if-eqz v0, :cond_22

    const-string v4, "speedLimitStatus"

    .line 84
    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 85
    :cond_22
    iget v0, p0, Lcom/kwad/sdk/core/report/n;->azv:I

    if-eqz v0, :cond_23

    const-string v4, "speedLimitThreshold"

    .line 86
    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 87
    :cond_23
    iget v0, p0, Lcom/kwad/sdk/core/report/n;->azw:I

    if-eqz v0, :cond_24

    const-string v4, "currentRealDownloadSpeed"

    .line 88
    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 89
    :cond_24
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->azy:Lorg/json/JSONArray;

    const-string v4, "sdkPlatform"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONArray;)V

    .line 90
    iget-boolean v0, p0, Lcom/kwad/sdk/core/report/n;->azz:Z

    if-eqz v0, :cond_25

    const-string v4, "isKsUnion"

    .line 91
    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Z)V

    .line 92
    :cond_25
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->azA:Ljava/lang/String;

    if-eqz v0, :cond_26

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_26

    .line 93
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->azA:Ljava/lang/String;

    const-string v4, "trackMethodName"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    :cond_26
    iget v0, p0, Lcom/kwad/sdk/core/report/n;->azB:I

    const-string v4, "viewModeType"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 95
    iget-wide v4, p0, Lcom/kwad/sdk/core/report/n;->clickTime:J

    cmp-long v0, v4, v2

    if-eqz v0, :cond_27

    const-string v0, "clickTime"

    .line 96
    invoke-static {p1, v0, v4, v5}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 97
    :cond_27
    iget-wide v4, p0, Lcom/kwad/sdk/core/report/n;->azD:J

    cmp-long v0, v4, v2

    if-eqz v0, :cond_28

    const-string v0, "frameRenderTime"

    .line 98
    invoke-static {p1, v0, v4, v5}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 99
    :cond_28
    iget v0, p0, Lcom/kwad/sdk/core/report/n;->azE:I

    if-eqz v0, :cond_29

    const-string v4, "playerEnterAction"

    .line 100
    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 101
    :cond_29
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->azF:Ljava/lang/String;

    if-eqz v0, :cond_2a

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2a

    .line 102
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->azF:Ljava/lang/String;

    const-string v4, "requestUrl"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    :cond_2a
    iget-wide v4, p0, Lcom/kwad/sdk/core/report/n;->azG:J

    cmp-long v0, v4, v2

    if-eqz v0, :cond_2b

    const-string v0, "requestTotalTime"

    .line 104
    invoke-static {p1, v0, v4, v5}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 105
    :cond_2b
    iget-wide v4, p0, Lcom/kwad/sdk/core/report/n;->azH:J

    cmp-long v0, v4, v2

    if-eqz v0, :cond_2c

    const-string v0, "requestResponseTime"

    .line 106
    invoke-static {p1, v0, v4, v5}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 107
    :cond_2c
    iget-wide v4, p0, Lcom/kwad/sdk/core/report/n;->azI:J

    cmp-long v0, v4, v2

    if-eqz v0, :cond_2d

    const-string v0, "requestParseDataTime"

    .line 108
    invoke-static {p1, v0, v4, v5}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 109
    :cond_2d
    iget-wide v4, p0, Lcom/kwad/sdk/core/report/n;->azJ:J

    cmp-long v0, v4, v2

    if-eqz v0, :cond_2e

    const-string v0, "requestCallbackTime"

    .line 110
    invoke-static {p1, v0, v4, v5}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 111
    :cond_2e
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->azK:Ljava/lang/String;

    if-eqz v0, :cond_2f

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2f

    .line 112
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->azK:Ljava/lang/String;

    const-string v4, "requestFailReason"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    :cond_2f
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->RH:Ljava/lang/String;

    if-eqz v0, :cond_30

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_30

    .line 114
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->RH:Ljava/lang/String;

    const-string v4, "pageName"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    :cond_30
    iget-wide v4, p0, Lcom/kwad/sdk/core/report/n;->RP:J

    cmp-long v0, v4, v2

    if-eqz v0, :cond_31

    const-string v0, "pageCreateTime"

    .line 116
    invoke-static {p1, v0, v4, v5}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 117
    :cond_31
    iget-wide v4, p0, Lcom/kwad/sdk/core/report/n;->RQ:J

    cmp-long v0, v4, v2

    if-eqz v0, :cond_32

    const-string v0, "pageResumeTime"

    .line 118
    invoke-static {p1, v0, v4, v5}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 119
    :cond_32
    iget v0, p0, Lcom/kwad/sdk/core/report/n;->azL:I

    if-eqz v0, :cond_33

    const-string v4, "trackUrlType"

    .line 120
    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 121
    :cond_33
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->azM:Lorg/json/JSONArray;

    const-string v4, "trackUrlList"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONArray;)V

    .line 122
    iget-wide v4, p0, Lcom/kwad/sdk/core/report/n;->RO:J

    cmp-long v0, v4, v2

    if-eqz v0, :cond_34

    const-string v0, "pageLaunchTime"

    .line 123
    invoke-static {p1, v0, v4, v5}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 124
    :cond_34
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->azP:Lorg/json/JSONArray;

    const-string v4, "appAuthorityInfoList"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONArray;)V

    .line 125
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->azQ:Ljava/lang/String;

    if-eqz v0, :cond_35

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_35

    .line 126
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->azQ:Ljava/lang/String;

    const-string v4, "tkVersion"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    :cond_35
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->azR:Ljava/lang/String;

    if-eqz v0, :cond_36

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_36

    .line 128
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->azR:Ljava/lang/String;

    const-string v4, "jsVersion"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    :cond_36
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->azS:Ljava/lang/String;

    if-eqz v0, :cond_37

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_37

    .line 130
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->azS:Ljava/lang/String;

    const-string v4, "jsFileName"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    :cond_37
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->azT:Ljava/lang/String;

    if-eqz v0, :cond_38

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_38

    .line 132
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->azT:Ljava/lang/String;

    const-string v4, "jsErrorMsg"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    :cond_38
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->azU:Ljava/lang/String;

    if-eqz v0, :cond_39

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_39

    .line 134
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->azU:Ljava/lang/String;

    const-string v4, "jsConfig"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    :cond_39
    iget v0, p0, Lcom/kwad/sdk/core/report/n;->azV:I

    if-eqz v0, :cond_3a

    const-string v4, "adBizType"

    .line 136
    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 137
    :cond_3a
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->azW:Ljava/lang/String;

    if-eqz v0, :cond_3b

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3b

    .line 138
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->azW:Ljava/lang/String;

    const-string v4, "customKey"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    :cond_3b
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->azX:Ljava/lang/String;

    if-eqz v0, :cond_3c

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3c

    .line 140
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->azX:Ljava/lang/String;

    const-string v4, "customValue"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    :cond_3c
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->trace:Ljava/lang/String;

    if-eqz v0, :cond_3d

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3d

    .line 142
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->trace:Ljava/lang/String;

    const-string v4, "trace"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    :cond_3d
    iget v0, p0, Lcom/kwad/sdk/core/report/n;->azY:I

    if-eqz v0, :cond_3e

    const-string v4, "filterCode"

    .line 144
    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 145
    :cond_3e
    iget v0, p0, Lcom/kwad/sdk/core/report/n;->azZ:I

    if-eqz v0, :cond_3f

    const-string v4, "sdkVersionCode"

    .line 146
    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 147
    :cond_3f
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->sdkVersion:Ljava/lang/String;

    if-eqz v0, :cond_40

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_40

    .line 148
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->sdkVersion:Ljava/lang/String;

    const-string v4, "sdkVersion"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    :cond_40
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->aAa:Ljava/lang/String;

    if-eqz v0, :cond_41

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_41

    .line 150
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->aAa:Ljava/lang/String;

    const-string v4, "adSdkVersion"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    :cond_41
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->XB:Ljava/lang/String;

    if-eqz v0, :cond_42

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_42

    .line 152
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->XB:Ljava/lang/String;

    const-string v4, "sdkApiVersion"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    :cond_42
    iget v0, p0, Lcom/kwad/sdk/core/report/n;->sdkType:I

    if-eqz v0, :cond_43

    const-string v4, "sdkType"

    .line 154
    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 155
    :cond_43
    iget-wide v4, p0, Lcom/kwad/sdk/core/report/n;->aAb:J

    cmp-long v0, v4, v2

    if-eqz v0, :cond_44

    const-string v0, "appUseDuration"

    .line 156
    invoke-static {p1, v0, v4, v5}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 157
    :cond_44
    iget-wide v4, p0, Lcom/kwad/sdk/core/report/n;->aAc:J

    cmp-long v0, v4, v2

    if-eqz v0, :cond_45

    const-string v0, "appStartType"

    .line 158
    invoke-static {p1, v0, v4, v5}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 159
    :cond_45
    iget-wide v4, p0, Lcom/kwad/sdk/core/report/n;->avo:J

    cmp-long v0, v4, v2

    if-eqz v0, :cond_46

    const-string v0, "sequenceNumber"

    .line 160
    invoke-static {p1, v0, v4, v5}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 161
    :cond_46
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->Jd:Ljava/lang/String;

    if-eqz v0, :cond_47

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_47

    .line 162
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->Jd:Ljava/lang/String;

    const-string v2, "appColdStart"

    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    :cond_47
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->Je:Ljava/lang/String;

    if-eqz v0, :cond_48

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_48

    .line 164
    iget-object p0, p0, Lcom/kwad/sdk/core/report/n;->Je:Ljava/lang/String;

    const-string v0, "appStart"

    invoke-static {p1, v0, p0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    :cond_48
    return-object p1
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/kwad/sdk/core/b;Lorg/json/JSONObject;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/kwad/sdk/core/report/n;

    invoke-static {p1, p2}, Lcom/kwad/sdk/core/b/a/hy;->a(Lcom/kwad/sdk/core/report/n;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final bridge synthetic b(Lcom/kwad/sdk/core/b;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 0

    .line 1
    check-cast p1, Lcom/kwad/sdk/core/report/n;

    invoke-static {p1, p2}, Lcom/kwad/sdk/core/b/a/hy;->b(Lcom/kwad/sdk/core/report/n;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method
