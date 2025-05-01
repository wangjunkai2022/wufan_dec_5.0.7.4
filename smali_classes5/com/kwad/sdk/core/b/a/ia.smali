.class public final Lcom/kwad/sdk/core/b/a/ia;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/kwad/sdk/core/d<",
        "Lcom/kwad/components/ad/reward/check/RewardCheckMonitorInfo;",
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

.method private static a(Lcom/kwad/components/ad/reward/check/RewardCheckMonitorInfo;Lorg/json/JSONObject;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string v0, "check_type"

    .line 2
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/components/ad/reward/check/RewardCheckMonitorInfo;->checkType:I

    const-string v0, "request_state"

    .line 3
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/components/ad/reward/check/RewardCheckMonitorInfo;->requestStatus:I

    const-string v0, "code"

    .line 4
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/components/ad/reward/check/RewardCheckMonitorInfo;->code:I

    const-string v0, "creative_id"

    .line 5
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/components/ad/reward/check/RewardCheckMonitorInfo;->creativeId:J

    const-string v0, "data_load_interval_duration_ms"

    .line 6
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/components/ad/reward/check/RewardCheckMonitorInfo;->dataLoadInterval:J

    const-string v0, "pos_Id"

    .line 7
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/components/ad/reward/check/RewardCheckMonitorInfo;->posId:J

    const-string v0, "enviType"

    .line 8
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/kwad/components/ad/reward/check/RewardCheckMonitorInfo;->enviType:I

    return-void
.end method

.method private static b(Lcom/kwad/components/ad/reward/check/RewardCheckMonitorInfo;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 5

    if-nez p1, :cond_0

    .line 2
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 3
    :cond_0
    iget v0, p0, Lcom/kwad/components/ad/reward/check/RewardCheckMonitorInfo;->checkType:I

    if-eqz v0, :cond_1

    const-string v1, "check_type"

    .line 4
    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 5
    :cond_1
    iget v0, p0, Lcom/kwad/components/ad/reward/check/RewardCheckMonitorInfo;->requestStatus:I

    if-eqz v0, :cond_2

    const-string v1, "request_state"

    .line 6
    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 7
    :cond_2
    iget v0, p0, Lcom/kwad/components/ad/reward/check/RewardCheckMonitorInfo;->code:I

    if-eqz v0, :cond_3

    const-string v1, "code"

    .line 8
    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 9
    :cond_3
    iget-wide v0, p0, Lcom/kwad/components/ad/reward/check/RewardCheckMonitorInfo;->creativeId:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_4

    const-string v4, "creative_id"

    .line 10
    invoke-static {p1, v4, v0, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 11
    :cond_4
    iget-wide v0, p0, Lcom/kwad/components/ad/reward/check/RewardCheckMonitorInfo;->dataLoadInterval:J

    cmp-long v4, v0, v2

    if-eqz v4, :cond_5

    const-string v4, "data_load_interval_duration_ms"

    .line 12
    invoke-static {p1, v4, v0, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 13
    :cond_5
    iget-wide v0, p0, Lcom/kwad/components/ad/reward/check/RewardCheckMonitorInfo;->posId:J

    cmp-long v4, v0, v2

    if-eqz v4, :cond_6

    const-string v2, "pos_Id"

    .line 14
    invoke-static {p1, v2, v0, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 15
    :cond_6
    iget p0, p0, Lcom/kwad/components/ad/reward/check/RewardCheckMonitorInfo;->enviType:I

    if-eqz p0, :cond_7

    const-string v0, "enviType"

    .line 16
    invoke-static {p1, v0, p0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    :cond_7
    return-object p1
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/kwad/sdk/core/b;Lorg/json/JSONObject;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/kwad/components/ad/reward/check/RewardCheckMonitorInfo;

    invoke-static {p1, p2}, Lcom/kwad/sdk/core/b/a/ia;->a(Lcom/kwad/components/ad/reward/check/RewardCheckMonitorInfo;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final bridge synthetic b(Lcom/kwad/sdk/core/b;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 0

    .line 1
    check-cast p1, Lcom/kwad/components/ad/reward/check/RewardCheckMonitorInfo;

    invoke-static {p1, p2}, Lcom/kwad/sdk/core/b/a/ia;->b(Lcom/kwad/components/ad/reward/check/RewardCheckMonitorInfo;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method
