.class public final Lcom/kwad/sdk/core/b/a/fl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/kwad/sdk/core/d<",
        "Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;",
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

.method private static a(Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;Lorg/json/JSONObject;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string v0, "status"

    .line 2
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->status:I

    const-string v0, "type"

    .line 3
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->type:I

    const-string v0, "load_data_duration_ms"

    .line 4
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->loadDataTime:J

    const-string v0, "render_duration_ms"

    .line 5
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->renderDuration:J

    const-string v0, "render_type"

    .line 6
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->renderType:I

    const-string v0, "expected_render_type"

    .line 7
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->expectedRenderType:I

    const-string v0, "material_type"

    .line 8
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->materialType:I

    const-string v0, "download_duration_ms"

    .line 9
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->downloadDuration:J

    const-string v0, "download_type"

    .line 10
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->downloadType:I

    const-string v0, "download_size"

    .line 11
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->downloadSize:J

    const-string v0, "creative_id"

    .line 12
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->creativeId:J

    const-string v0, "video_url"

    .line 13
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->videoUrl:Ljava/lang/String;

    .line 14
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->videoUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_1

    .line 15
    iput-object v1, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->videoUrl:Ljava/lang/String;

    :cond_1
    const-string v0, "video_duration_ms"

    .line 16
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->videoDuration:J

    const-string v0, "play_started_duration_ms"

    .line 17
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->playStartedDuration:J

    const-string v0, "ab_params"

    .line 18
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->abParams:Ljava/lang/String;

    .line 19
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->abParams:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 20
    iput-object v1, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->abParams:Ljava/lang/String;

    :cond_2
    const-string v0, "action_type"

    .line 21
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->actionType:J

    const-string v0, "callback_type"

    .line 22
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->callbackType:J

    const-string v0, "click_scene_type"

    .line 23
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->clickSceneType:J

    const-string v0, "item_click_type"

    .line 24
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->itemClickType:J

    const-string v0, "visible_percent"

    .line 25
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->visiblePercent:D

    return-void
.end method

.method private static b(Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 6

    if-nez p1, :cond_0

    .line 2
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 3
    :cond_0
    iget v0, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->status:I

    if-eqz v0, :cond_1

    const-string v1, "status"

    .line 4
    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 5
    :cond_1
    iget v0, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->type:I

    if-eqz v0, :cond_2

    const-string v1, "type"

    .line 6
    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 7
    :cond_2
    iget-wide v0, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->loadDataTime:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_3

    const-string v4, "load_data_duration_ms"

    .line 8
    invoke-static {p1, v4, v0, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 9
    :cond_3
    iget-wide v0, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->renderDuration:J

    cmp-long v4, v0, v2

    if-eqz v4, :cond_4

    const-string v4, "render_duration_ms"

    .line 10
    invoke-static {p1, v4, v0, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 11
    :cond_4
    iget v0, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->renderType:I

    if-eqz v0, :cond_5

    const-string v1, "render_type"

    .line 12
    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 13
    :cond_5
    iget v0, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->expectedRenderType:I

    if-eqz v0, :cond_6

    const-string v1, "expected_render_type"

    .line 14
    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 15
    :cond_6
    iget v0, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->materialType:I

    if-eqz v0, :cond_7

    const-string v1, "material_type"

    .line 16
    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 17
    :cond_7
    iget-wide v0, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->downloadDuration:J

    cmp-long v4, v0, v2

    if-eqz v4, :cond_8

    const-string v4, "download_duration_ms"

    .line 18
    invoke-static {p1, v4, v0, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 19
    :cond_8
    iget v0, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->downloadType:I

    if-eqz v0, :cond_9

    const-string v1, "download_type"

    .line 20
    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 21
    :cond_9
    iget-wide v0, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->downloadSize:J

    cmp-long v4, v0, v2

    if-eqz v4, :cond_a

    const-string v4, "download_size"

    .line 22
    invoke-static {p1, v4, v0, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 23
    :cond_a
    iget-wide v0, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->creativeId:J

    cmp-long v4, v0, v2

    if-eqz v4, :cond_b

    const-string v4, "creative_id"

    .line 24
    invoke-static {p1, v4, v0, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 25
    :cond_b
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->videoUrl:Ljava/lang/String;

    const-string v1, ""

    if-eqz v0, :cond_c

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    .line 26
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->videoUrl:Ljava/lang/String;

    const-string v4, "video_url"

    invoke-static {p1, v4, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    :cond_c
    iget-wide v4, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->videoDuration:J

    cmp-long v0, v4, v2

    if-eqz v0, :cond_d

    const-string v0, "video_duration_ms"

    .line 28
    invoke-static {p1, v0, v4, v5}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 29
    :cond_d
    iget-wide v4, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->playStartedDuration:J

    cmp-long v0, v4, v2

    if-eqz v0, :cond_e

    const-string v0, "play_started_duration_ms"

    .line 30
    invoke-static {p1, v0, v4, v5}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 31
    :cond_e
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->abParams:Ljava/lang/String;

    if-eqz v0, :cond_f

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    .line 32
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->abParams:Ljava/lang/String;

    const-string v1, "ab_params"

    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    :cond_f
    iget-wide v0, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->actionType:J

    cmp-long v4, v0, v2

    if-eqz v4, :cond_10

    const-string v4, "action_type"

    .line 34
    invoke-static {p1, v4, v0, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 35
    :cond_10
    iget-wide v0, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->callbackType:J

    cmp-long v4, v0, v2

    if-eqz v4, :cond_11

    const-string v4, "callback_type"

    .line 36
    invoke-static {p1, v4, v0, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 37
    :cond_11
    iget-wide v0, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->clickSceneType:J

    cmp-long v4, v0, v2

    if-eqz v4, :cond_12

    const-string v4, "click_scene_type"

    .line 38
    invoke-static {p1, v4, v0, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 39
    :cond_12
    iget-wide v0, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->itemClickType:J

    cmp-long v4, v0, v2

    if-eqz v4, :cond_13

    const-string v2, "item_click_type"

    .line 40
    invoke-static {p1, v2, v0, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 41
    :cond_13
    iget-wide v0, p0, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;->visiblePercent:D

    const-wide/16 v2, 0x0

    cmpl-double p0, v0, v2

    if-eqz p0, :cond_14

    const-string p0, "visible_percent"

    .line 42
    invoke-static {p1, p0, v0, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;D)V

    :cond_14
    return-object p1
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/kwad/sdk/core/b;Lorg/json/JSONObject;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;

    invoke-static {p1, p2}, Lcom/kwad/sdk/core/b/a/fl;->a(Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final bridge synthetic b(Lcom/kwad/sdk/core/b;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 0

    .line 1
    check-cast p1, Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;

    invoke-static {p1, p2}, Lcom/kwad/sdk/core/b/a/fl;->b(Lcom/kwad/components/ad/interstitial/report/InterstitialReportInfo;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method
