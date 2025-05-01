.class public final Lcom/kwad/components/core/internal/api/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lcom/kwad/sdk/api/KsVideoPlayConfig;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 1
    :cond_0
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "showScene"

    .line 2
    invoke-interface {p0}, Lcom/kwad/sdk/api/KsVideoPlayConfig;->getShowScene()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "showLandscape"

    .line 3
    invoke-interface {p0}, Lcom/kwad/sdk/api/KsVideoPlayConfig;->isShowLandscape()Z

    move-result v3

    invoke-static {v1, v2, v3}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Z)V

    const-string v2, "skipThirtySecond"

    .line 4
    invoke-interface {p0}, Lcom/kwad/sdk/api/KsVideoPlayConfig;->isSkipThirtySecond()Z

    move-result v3

    invoke-static {v1, v2, v3}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Z)V

    const-string v2, "videoSoundEnable"

    .line 5
    invoke-interface {p0}, Lcom/kwad/sdk/api/KsVideoPlayConfig;->isVideoSoundEnable()Z

    move-result p0

    invoke-static {v1, v2, p0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Z)V

    .line 6
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    return-object v0
.end method

.method public static b(Ljava/lang/String;Z)Lcom/kwad/sdk/api/KsVideoPlayConfig;
    .locals 2

    .line 1
    :try_start_0
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 2
    new-instance p0, Lcom/kwad/components/core/internal/api/VideoPlayConfigImpl;

    invoke-direct {p0}, Lcom/kwad/components/core/internal/api/VideoPlayConfigImpl;-><init>()V

    const-string v0, "showScene"

    const/4 v1, 0x0

    .line 3
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/kwad/components/core/internal/api/VideoPlayConfigImpl;->setShowScene(Ljava/lang/String;)V

    const-string v0, "showLandscape"

    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/kwad/components/core/internal/api/VideoPlayConfigImpl;->setShowLandscape(Z)V

    const-string v0, "skipThirtySecond"

    .line 5
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/kwad/components/core/internal/api/VideoPlayConfigImpl;->setSkipThirtySecond(Z)V

    const-string v0, "videoSoundEnable"

    const/4 v1, 0x1

    .line 6
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/kwad/components/core/internal/api/VideoPlayConfigImpl;->setVideoSoundEnable(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 7
    :catch_0
    new-instance p0, Lcom/kwad/components/core/internal/api/VideoPlayConfigImpl;

    invoke-direct {p0}, Lcom/kwad/components/core/internal/api/VideoPlayConfigImpl;-><init>()V

    return-object p0
.end method
