.class public final Lcom/kwad/components/ad/reward/monitor/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/core/webview/tachikoma/TKRenderFailReason;)V
    .locals 3

    .line 2
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/e;->dM(Lcom/kwad/sdk/core/response/model/AdTemplate;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    const-string v1, "ad_sdk_neo_page_native_monitor"

    goto :goto_1

    :cond_1
    const-string v1, "ad_sdk_fullscreen_page_native_monitor"

    .line 3
    :goto_1
    sget-object v2, Lcom/kwad/components/core/webview/tachikoma/TKRenderFailReason;->SWITCH_CLOSE:Lcom/kwad/components/core/webview/tachikoma/TKRenderFailReason;

    invoke-virtual {v2, p1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    if-eqz v0, :cond_2

    const p1, 0x18e73

    goto :goto_2

    :cond_2
    const p1, 0x1925b

    goto :goto_2

    .line 4
    :cond_3
    sget-object v2, Lcom/kwad/components/core/webview/tachikoma/TKRenderFailReason;->TK_FILE_LOAD_ERROR:Lcom/kwad/components/core/webview/tachikoma/TKRenderFailReason;

    invoke-virtual {v2, p1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    if-eqz v0, :cond_4

    const p1, 0x18e74

    goto :goto_2

    :cond_4
    const p1, 0x1925c

    goto :goto_2

    :cond_5
    const p1, 0x18e75

    .line 5
    :goto_2
    invoke-static {v0, v1, p0, p1}, Lcom/kwad/components/ad/reward/monitor/b;->a(ZLjava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    return-void
.end method

.method public static a(ZLcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    if-eqz p0, :cond_0

    const-string v0, "ad_sdk_neo_video_cache_monitor"

    goto :goto_0

    :cond_0
    const-string v0, "ad_sdk_fullscreen_video_cache_monitor"

    :goto_0
    if-eqz p0, :cond_1

    const v1, 0x18e71

    goto :goto_1

    :cond_1
    const v1, 0x19259

    .line 1
    :goto_1
    invoke-static {p0, v0, p1, v1}, Lcom/kwad/components/ad/reward/monitor/b;->a(ZLjava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    return-void
.end method

.method private static a(ZLjava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;I)V
    .locals 3

    if-eqz p2, :cond_0

    .line 6
    invoke-static {p2}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 7
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->J(Lcom/kwad/sdk/core/response/model/AdInfo;)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    .line 8
    :goto_0
    new-instance v2, Lcom/kwad/components/ad/reward/monitor/RewardMonitorInfo;

    invoke-direct {v2}, Lcom/kwad/components/ad/reward/monitor/RewardMonitorInfo;-><init>()V

    .line 9
    invoke-virtual {v2, p3}, Lcom/kwad/components/ad/reward/monitor/RewardMonitorInfo;->setErrorCode(I)Lcom/kwad/components/ad/reward/monitor/RewardMonitorInfo;

    move-result-object p3

    .line 10
    invoke-virtual {p3, v0, v1}, Lcom/kwad/components/ad/reward/monitor/RewardMonitorInfo;->setCreativeId(J)Lcom/kwad/components/ad/reward/monitor/RewardMonitorInfo;

    move-result-object p3

    .line 11
    invoke-virtual {p3, p2}, Lcom/kwad/components/ad/reward/monitor/RewardMonitorInfo;->setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/ad/reward/monitor/RewardMonitorInfo;

    move-result-object p2

    .line 12
    invoke-static {p0, p1, p2}, Lcom/kwad/sdk/commercial/b;->a(ZLjava/lang/String;Lcom/kwad/sdk/commercial/c/a;)V

    return-void
.end method

.method public static b(ZLcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    if-eqz p0, :cond_0

    const-string v0, "ad_sdk_neo_page_enter_monitor"

    goto :goto_0

    :cond_0
    const-string v0, "ad_sdk_fullscreen_page_enter_monitor"

    :goto_0
    if-eqz p0, :cond_1

    const v1, 0x18e72

    goto :goto_1

    :cond_1
    const v1, 0x1925a

    .line 1
    :goto_1
    invoke-static {p0, v0, p1, v1}, Lcom/kwad/components/ad/reward/monitor/b;->a(ZLjava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    return-void
.end method

.method public static c(ZI)V
    .locals 2

    if-eqz p0, :cond_0

    const-string v0, "ad_sdk_neo_request_monitor"

    goto :goto_0

    :cond_0
    const-string v0, "ad_sdk_fullscreen_request_monitor"

    :goto_0
    const/4 v1, 0x0

    .line 1
    invoke-static {p0, v0, v1, p1}, Lcom/kwad/components/ad/reward/monitor/b;->a(ZLjava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    return-void
.end method

.method public static c(ZLcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2

    if-eqz p0, :cond_0

    const-string v0, "ad_sdk_neo_video_play_monitor"

    goto :goto_0

    :cond_0
    const-string v0, "ad_sdk_fullscreen_video_play_monitor"

    :goto_0
    if-eqz p0, :cond_1

    const v1, 0x18e77

    goto :goto_1

    :cond_1
    const v1, 0x1925f

    .line 2
    :goto_1
    invoke-static {p0, v0, p1, v1}, Lcom/kwad/components/ad/reward/monitor/b;->a(ZLjava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    return-void
.end method
