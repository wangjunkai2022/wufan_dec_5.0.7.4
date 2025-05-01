.class public final Lcom/kwad/sdk/core/b/a/ae;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/kwad/sdk/core/d<",
        "Lcom/kwad/sdk/core/adlog/c/a;",
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

.method private static a(Lcom/kwad/sdk/core/adlog/c/a;Lorg/json/JSONObject;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-direct {v0}, Lcom/kwad/sdk/core/response/model/AdTemplate;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->adTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const-string v1, "adTemplate"

    .line 3
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/response/a/a;->parseJson(Lorg/json/JSONObject;)V

    const-string v0, "extData"

    .line 4
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->aqN:Lorg/json/JSONObject;

    const-string v0, "adActionType"

    .line 5
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->apT:I

    const-string v0, "photoPlaySecond"

    .line 6
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->aqO:I

    const-string v0, "awardReceiveStage"

    .line 7
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->aqP:I

    const-string v0, "itemClickType"

    .line 8
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->kl:I

    const-string v0, "itemCloseType"

    .line 9
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->aqQ:I

    const-string v0, "elementType"

    .line 10
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->aqR:I

    const-string v0, "adRenderArea"

    .line 11
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->aqS:Ljava/lang/String;

    .line 12
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/sdk/core/adlog/c/a;->aqS:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_1

    .line 13
    iput-object v1, p0, Lcom/kwad/sdk/core/adlog/c/a;->aqS:Ljava/lang/String;

    :cond_1
    const-string v0, "highestLossPrice"

    .line 14
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/sdk/core/adlog/c/a;->aqT:J

    const-string v0, "impFailReason"

    .line 15
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->aqU:I

    const-string v0, "winEcpm"

    .line 16
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/sdk/core/adlog/c/a;->aqV:J

    const-string v0, "adnType"

    .line 17
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->adnType:I

    const-string v0, "adnName"

    .line 18
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->adnName:Ljava/lang/String;

    .line 19
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/sdk/core/adlog/c/a;->adnName:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 20
    iput-object v1, p0, Lcom/kwad/sdk/core/adlog/c/a;->adnName:Ljava/lang/String;

    :cond_2
    const-string v0, "retainCodeType"

    .line 21
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->aqW:I

    const-string v0, "photoSizeStyle"

    .line 22
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->Lj:I

    const-string v0, "payload"

    .line 23
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->Lh:Ljava/lang/String;

    .line 24
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/sdk/core/adlog/c/a;->Lh:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 25
    iput-object v1, p0, Lcom/kwad/sdk/core/adlog/c/a;->Lh:Ljava/lang/String;

    :cond_3
    const-string v0, "deeplinkType"

    .line 26
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->aqX:I

    const-string v0, "deeplinkAppName"

    .line 27
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->aqY:Ljava/lang/String;

    .line 28
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/sdk/core/adlog/c/a;->aqY:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 29
    iput-object v1, p0, Lcom/kwad/sdk/core/adlog/c/a;->aqY:Ljava/lang/String;

    :cond_4
    const-string v0, "deeplinkFailedReason"

    .line 30
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->aqZ:I

    const-string v0, "downloadSource"

    .line 31
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->downloadSource:I

    const-string v0, "isPackageChanged"

    .line 32
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->ara:I

    const-string v0, "installedFrom"

    .line 33
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->arb:Ljava/lang/String;

    .line 34
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/sdk/core/adlog/c/a;->arb:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 35
    iput-object v1, p0, Lcom/kwad/sdk/core/adlog/c/a;->arb:Ljava/lang/String;

    :cond_5
    const-string v0, "downloadFailedReason"

    .line 36
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->arc:Ljava/lang/String;

    .line 37
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/sdk/core/adlog/c/a;->arc:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 38
    iput-object v1, p0, Lcom/kwad/sdk/core/adlog/c/a;->arc:Ljava/lang/String;

    :cond_6
    const-string v0, "isChangedEndcard"

    .line 39
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->ard:I

    const-string v0, "adAggPageSource"

    .line 40
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->are:I

    const-string v0, "serverPackageName"

    .line 41
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->arf:Ljava/lang/String;

    .line 42
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/sdk/core/adlog/c/a;->arf:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 43
    iput-object v1, p0, Lcom/kwad/sdk/core/adlog/c/a;->arf:Ljava/lang/String;

    :cond_7
    const-string v0, "installedPackageName"

    .line 44
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->arg:Ljava/lang/String;

    .line 45
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/sdk/core/adlog/c/a;->arg:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 46
    iput-object v1, p0, Lcom/kwad/sdk/core/adlog/c/a;->arg:Ljava/lang/String;

    :cond_8
    const-string v0, "closeButtonImpressionTime"

    .line 47
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->arh:I

    const-string v0, "closeButtonClickTime"

    .line 48
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->ari:I

    const-string v0, "landingPageLoadedDuration"

    .line 49
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/sdk/core/adlog/c/a;->arj:J

    const-string v0, "leaveTime"

    .line 50
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/sdk/core/adlog/c/a;->LJ:J

    const-string v0, "adItemClickBackDuration"

    .line 51
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/sdk/core/adlog/c/a;->ark:J

    const-string v0, "appStorePageType"

    .line 52
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->arl:I

    const-string v0, "installStatus"

    .line 53
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->arm:I

    const-string v0, "downloadStatus"

    .line 54
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->downloadStatus:I

    const-string v0, "downloadCardType"

    .line 55
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->arn:I

    .line 56
    new-instance v0, Lcom/kwad/sdk/core/adlog/a$a;

    invoke-direct {v0}, Lcom/kwad/sdk/core/adlog/a$a;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->Li:Lcom/kwad/sdk/core/adlog/a$a;

    const-string v2, "clientExtData"

    .line 57
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/kwad/sdk/core/response/a/a;->parseJson(Lorg/json/JSONObject;)V

    const-string v0, "landingPageType"

    .line 58
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->OP:I

    const-string v0, "playedDuration"

    .line 59
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/sdk/core/adlog/c/a;->vA:J

    const-string v0, "playedRate"

    .line 60
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->aro:I

    const-string v0, "adOrder"

    .line 61
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->arp:I

    const-string v0, "adInterstitialSource"

    .line 62
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->Lg:I

    const-string v0, "splashShakeAcceleration"

    .line 63
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/sdk/core/adlog/c/a;->ko:D

    const-string v0, "splashInteractionRotateAngle"

    .line 64
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->arq:Ljava/lang/String;

    .line 65
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/sdk/core/adlog/c/a;->arq:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 66
    iput-object v1, p0, Lcom/kwad/sdk/core/adlog/c/a;->arq:Ljava/lang/String;

    :cond_9
    const-string v0, "downloadInstallType"

    .line 67
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->arr:I

    const-string v0, "businessSceneType"

    .line 68
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->ars:I

    const-string v0, "adxResult"

    .line 69
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->adxResult:I

    const-string v0, "fingerSwipeType"

    .line 70
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->art:I

    const-string v0, "fingerSwipeDistance"

    .line 71
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->aru:I

    const-string v0, "triggerType"

    .line 72
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->Lk:I

    const-string v0, "cardCloseType"

    .line 73
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->arv:I

    const-string v0, "clientPkFailAdInfo"

    .line 74
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/core/adlog/c/a;->arw:Ljava/lang/String;

    .line 75
    sget-object p1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->arw:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    .line 76
    iput-object v1, p0, Lcom/kwad/sdk/core/adlog/c/a;->arw:Ljava/lang/String;

    :cond_a
    return-void
.end method

.method private static b(Lcom/kwad/sdk/core/adlog/c/a;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 6

    if-nez p1, :cond_0

    .line 2
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->adTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const-string v1, "adTemplate"

    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->a(Lorg/json/JSONObject;Ljava/lang/String;Lcom/kwad/sdk/core/b;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->aqN:Lorg/json/JSONObject;

    const-string v1, "extData"

    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 5
    iget v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->apT:I

    if-eqz v0, :cond_1

    const-string v1, "adActionType"

    .line 6
    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 7
    :cond_1
    iget v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->aqO:I

    if-eqz v0, :cond_2

    const-string v1, "photoPlaySecond"

    .line 8
    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 9
    :cond_2
    iget v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->aqP:I

    if-eqz v0, :cond_3

    const-string v1, "awardReceiveStage"

    .line 10
    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 11
    :cond_3
    iget v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->kl:I

    if-eqz v0, :cond_4

    const-string v1, "itemClickType"

    .line 12
    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 13
    :cond_4
    iget v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->aqQ:I

    if-eqz v0, :cond_5

    const-string v1, "itemCloseType"

    .line 14
    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 15
    :cond_5
    iget v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->aqR:I

    if-eqz v0, :cond_6

    const-string v1, "elementType"

    .line 16
    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 17
    :cond_6
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->aqS:Ljava/lang/String;

    const-string v1, ""

    if-eqz v0, :cond_7

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 18
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->aqS:Ljava/lang/String;

    const-string v2, "adRenderArea"

    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    :cond_7
    iget-wide v2, p0, Lcom/kwad/sdk/core/adlog/c/a;->aqT:J

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-eqz v0, :cond_8

    const-string v0, "highestLossPrice"

    .line 20
    invoke-static {p1, v0, v2, v3}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 21
    :cond_8
    iget v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->aqU:I

    if-eqz v0, :cond_9

    const-string v2, "impFailReason"

    .line 22
    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 23
    :cond_9
    iget-wide v2, p0, Lcom/kwad/sdk/core/adlog/c/a;->aqV:J

    cmp-long v0, v2, v4

    if-eqz v0, :cond_a

    const-string v0, "winEcpm"

    .line 24
    invoke-static {p1, v0, v2, v3}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 25
    :cond_a
    iget v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->adnType:I

    if-eqz v0, :cond_b

    const-string v2, "adnType"

    .line 26
    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 27
    :cond_b
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->adnName:Ljava/lang/String;

    if-eqz v0, :cond_c

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    .line 28
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->adnName:Ljava/lang/String;

    const-string v2, "adnName"

    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    :cond_c
    iget v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->aqW:I

    if-eqz v0, :cond_d

    const-string v2, "retainCodeType"

    .line 30
    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 31
    :cond_d
    iget v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->Lj:I

    if-eqz v0, :cond_e

    const-string v2, "photoSizeStyle"

    .line 32
    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 33
    :cond_e
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->Lh:Ljava/lang/String;

    if-eqz v0, :cond_f

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    .line 34
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->Lh:Ljava/lang/String;

    const-string v2, "payload"

    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    :cond_f
    iget v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->aqX:I

    if-eqz v0, :cond_10

    const-string v2, "deeplinkType"

    .line 36
    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 37
    :cond_10
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->aqY:Ljava/lang/String;

    if-eqz v0, :cond_11

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    .line 38
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->aqY:Ljava/lang/String;

    const-string v2, "deeplinkAppName"

    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    :cond_11
    iget v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->aqZ:I

    if-eqz v0, :cond_12

    const-string v2, "deeplinkFailedReason"

    .line 40
    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 41
    :cond_12
    iget v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->downloadSource:I

    if-eqz v0, :cond_13

    const-string v2, "downloadSource"

    .line 42
    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 43
    :cond_13
    iget v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->ara:I

    if-eqz v0, :cond_14

    const-string v2, "isPackageChanged"

    .line 44
    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 45
    :cond_14
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->arb:Ljava/lang/String;

    if-eqz v0, :cond_15

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    .line 46
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->arb:Ljava/lang/String;

    const-string v2, "installedFrom"

    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    :cond_15
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->arc:Ljava/lang/String;

    if-eqz v0, :cond_16

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    .line 48
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->arc:Ljava/lang/String;

    const-string v2, "downloadFailedReason"

    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    :cond_16
    iget v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->ard:I

    if-eqz v0, :cond_17

    const-string v2, "isChangedEndcard"

    .line 50
    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 51
    :cond_17
    iget v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->are:I

    if-eqz v0, :cond_18

    const-string v2, "adAggPageSource"

    .line 52
    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 53
    :cond_18
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->arf:Ljava/lang/String;

    if-eqz v0, :cond_19

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    .line 54
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->arf:Ljava/lang/String;

    const-string v2, "serverPackageName"

    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    :cond_19
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->arg:Ljava/lang/String;

    if-eqz v0, :cond_1a

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1a

    .line 56
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->arg:Ljava/lang/String;

    const-string v2, "installedPackageName"

    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    :cond_1a
    iget v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->arh:I

    if-eqz v0, :cond_1b

    const-string v2, "closeButtonImpressionTime"

    .line 58
    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 59
    :cond_1b
    iget v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->ari:I

    if-eqz v0, :cond_1c

    const-string v2, "closeButtonClickTime"

    .line 60
    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 61
    :cond_1c
    iget-wide v2, p0, Lcom/kwad/sdk/core/adlog/c/a;->arj:J

    cmp-long v0, v2, v4

    if-eqz v0, :cond_1d

    const-string v0, "landingPageLoadedDuration"

    .line 62
    invoke-static {p1, v0, v2, v3}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 63
    :cond_1d
    iget-wide v2, p0, Lcom/kwad/sdk/core/adlog/c/a;->LJ:J

    cmp-long v0, v2, v4

    if-eqz v0, :cond_1e

    const-string v0, "leaveTime"

    .line 64
    invoke-static {p1, v0, v2, v3}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 65
    :cond_1e
    iget-wide v2, p0, Lcom/kwad/sdk/core/adlog/c/a;->ark:J

    cmp-long v0, v2, v4

    if-eqz v0, :cond_1f

    const-string v0, "adItemClickBackDuration"

    .line 66
    invoke-static {p1, v0, v2, v3}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 67
    :cond_1f
    iget v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->arl:I

    if-eqz v0, :cond_20

    const-string v2, "appStorePageType"

    .line 68
    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 69
    :cond_20
    iget v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->arm:I

    if-eqz v0, :cond_21

    const-string v2, "installStatus"

    .line 70
    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 71
    :cond_21
    iget v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->downloadStatus:I

    if-eqz v0, :cond_22

    const-string v2, "downloadStatus"

    .line 72
    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 73
    :cond_22
    iget v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->arn:I

    if-eqz v0, :cond_23

    const-string v2, "downloadCardType"

    .line 74
    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 75
    :cond_23
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->Li:Lcom/kwad/sdk/core/adlog/a$a;

    const-string v2, "clientExtData"

    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->a(Lorg/json/JSONObject;Ljava/lang/String;Lcom/kwad/sdk/core/b;)V

    .line 76
    iget v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->OP:I

    if-eqz v0, :cond_24

    const-string v2, "landingPageType"

    .line 77
    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 78
    :cond_24
    iget-wide v2, p0, Lcom/kwad/sdk/core/adlog/c/a;->vA:J

    cmp-long v0, v2, v4

    if-eqz v0, :cond_25

    const-string v0, "playedDuration"

    .line 79
    invoke-static {p1, v0, v2, v3}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 80
    :cond_25
    iget v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->aro:I

    if-eqz v0, :cond_26

    const-string v2, "playedRate"

    .line 81
    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 82
    :cond_26
    iget v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->arp:I

    if-eqz v0, :cond_27

    const-string v2, "adOrder"

    .line 83
    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 84
    :cond_27
    iget v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->Lg:I

    if-eqz v0, :cond_28

    const-string v2, "adInterstitialSource"

    .line 85
    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 86
    :cond_28
    iget-wide v2, p0, Lcom/kwad/sdk/core/adlog/c/a;->ko:D

    const-wide/16 v4, 0x0

    cmpl-double v0, v2, v4

    if-eqz v0, :cond_29

    const-string v0, "splashShakeAcceleration"

    .line 87
    invoke-static {p1, v0, v2, v3}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;D)V

    .line 88
    :cond_29
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->arq:Ljava/lang/String;

    if-eqz v0, :cond_2a

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2a

    .line 89
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->arq:Ljava/lang/String;

    const-string v2, "splashInteractionRotateAngle"

    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    :cond_2a
    iget v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->arr:I

    if-eqz v0, :cond_2b

    const-string v2, "downloadInstallType"

    .line 91
    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 92
    :cond_2b
    iget v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->ars:I

    if-eqz v0, :cond_2c

    const-string v2, "businessSceneType"

    .line 93
    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 94
    :cond_2c
    iget v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->adxResult:I

    if-eqz v0, :cond_2d

    const-string v2, "adxResult"

    .line 95
    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 96
    :cond_2d
    iget v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->art:I

    if-eqz v0, :cond_2e

    const-string v2, "fingerSwipeType"

    .line 97
    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 98
    :cond_2e
    iget v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->aru:I

    if-eqz v0, :cond_2f

    const-string v2, "fingerSwipeDistance"

    .line 99
    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 100
    :cond_2f
    iget v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->Lk:I

    if-eqz v0, :cond_30

    const-string v2, "triggerType"

    .line 101
    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 102
    :cond_30
    iget v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->arv:I

    if-eqz v0, :cond_31

    const-string v2, "cardCloseType"

    .line 103
    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 104
    :cond_31
    iget-object v0, p0, Lcom/kwad/sdk/core/adlog/c/a;->arw:Ljava/lang/String;

    if-eqz v0, :cond_32

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_32

    .line 105
    iget-object p0, p0, Lcom/kwad/sdk/core/adlog/c/a;->arw:Ljava/lang/String;

    const-string v0, "clientPkFailAdInfo"

    invoke-static {p1, v0, p0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    :cond_32
    return-object p1
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/kwad/sdk/core/b;Lorg/json/JSONObject;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/kwad/sdk/core/adlog/c/a;

    invoke-static {p1, p2}, Lcom/kwad/sdk/core/b/a/ae;->a(Lcom/kwad/sdk/core/adlog/c/a;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final bridge synthetic b(Lcom/kwad/sdk/core/b;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 0

    .line 1
    check-cast p1, Lcom/kwad/sdk/core/adlog/c/a;

    invoke-static {p1, p2}, Lcom/kwad/sdk/core/b/a/ae;->b(Lcom/kwad/sdk/core/adlog/c/a;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method
