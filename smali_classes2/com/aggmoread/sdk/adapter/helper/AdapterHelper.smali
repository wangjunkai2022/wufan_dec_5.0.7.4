.class public Lcom/aggmoread/sdk/adapter/helper/AdapterHelper;
.super Ljava/lang/Object;
.source "AdapterHelper.java"


# static fields
.field public static final ERROR_HANDLE_CODE:I = -0x7a120

.field public static final ERROR_VIDEO_CODD:I = 0x7a129

.field public static final NO_AD_CODD:I = 0x7a125


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getLocalCustomController(Ljava/util/Map;)Lcom/aggmoread/sdk/client/AMCustomController;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/aggmoread/sdk/client/AMCustomController;"
        }
    .end annotation

    if-eqz p0, :cond_0

    const-string v0, "AM_key_init_privacy_control"

    .line 1
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "KEY_AM_INIT_PRIVACY_CONTROL "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/aggmoread/sdk/adapter/helper/LogHelper;->log(Ljava/lang/String;)V

    .line 3
    instance-of v0, p0, Lcom/aggmoread/sdk/client/AMCustomController;

    if-eqz v0, :cond_0

    .line 4
    check-cast p0, Lcom/aggmoread/sdk/client/AMCustomController;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getNativeAdLogoParams(Lcom/bytedance/sdk/openadsdk/AdSlot;)Landroid/widget/FrameLayout$LayoutParams;
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 1
    :cond_0
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getMediationAdSlot()Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationAdSlot;

    move-result-object v1

    if-nez v1, :cond_1

    return-object v0

    .line 2
    :cond_1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getMediationAdSlot()Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationAdSlot;

    move-result-object p0

    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationAdSlot;->getExtraObject()Ljava/util/Map;

    move-result-object p0

    if-eqz p0, :cond_2

    const-string v1, "AM_key_native_logo_params"

    .line 3
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "KEY_AM_NATIVE_LOGO_PARAMS "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/aggmoread/sdk/adapter/helper/LogHelper;->log(Ljava/lang/String;)V

    .line 5
    instance-of v1, p0, Landroid/widget/FrameLayout$LayoutParams;

    if-eqz v1, :cond_2

    .line 6
    check-cast p0, Landroid/widget/FrameLayout$LayoutParams;

    return-object p0

    :cond_2
    return-object v0
.end method

.method public static getPrice(Lcom/aggmoread/sdk/client/AMAdExtras;)I
    .locals 1

    if-eqz p0, :cond_0

    :try_start_0
    const-string v0, "EXTRA_KEY_ad_ecpm"

    .line 1
    invoke-virtual {p0, v0}, Lcom/aggmoread/sdk/client/AMAdExtras;->getData(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    .line 2
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    :cond_0
    const/4 p0, -0x1

    return p0
.end method

.method public static getVideoOptions(Lcom/bytedance/sdk/openadsdk/AdSlot;)Lcom/aggmoread/sdk/client/AMVideoConfigs;
    .locals 4

    .line 1
    new-instance v0, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;

    invoke-direct {v0}, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;-><init>()V

    if-eqz p0, :cond_3

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getMediationAdSlot()Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationAdSlot;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 3
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getMediationAdSlot()Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationAdSlot;

    move-result-object v1

    invoke-interface {v1}, Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationAdSlot;->isMuted()Z

    move-result v1

    .line 4
    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->setAutoPlayMuted(Z)Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;

    .line 5
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getMediationAdSlot()Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationAdSlot;

    move-result-object p0

    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationAdSlot;->getExtraObject()Ljava/util/Map;

    move-result-object p0

    if-eqz p0, :cond_3

    const-string v1, "AM_key_auto_play_muted"

    .line 6
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "KEY_AM_AUTO_PLAY_MUTED "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/aggmoread/sdk/adapter/helper/LogHelper;->log(Ljava/lang/String;)V

    .line 8
    instance-of v2, v1, Ljava/lang/Boolean;

    if-eqz v2, :cond_0

    .line 9
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->setAutoPlayMuted(Z)Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;

    :cond_0
    const-string v1, "AM_key_detail_page_muted"

    .line 10
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 11
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "KEY_AM_DETAIL_PAGE_MUTED "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/aggmoread/sdk/adapter/helper/LogHelper;->log(Ljava/lang/String;)V

    .line 12
    instance-of v2, v1, Ljava/lang/Boolean;

    if-eqz v2, :cond_1

    .line 13
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->setDetailPageMuted(Z)Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;

    :cond_1
    const-string v1, "AM_key_enable_user_control"

    .line 14
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 15
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "KEY_AM_ENABLE_USER_CONTROL "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/aggmoread/sdk/adapter/helper/LogHelper;->log(Ljava/lang/String;)V

    .line 16
    instance-of v2, v1, Ljava/lang/Boolean;

    if-eqz v2, :cond_2

    .line 17
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->setEnableUserControl(Z)Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;

    :cond_2
    const-string v1, "AM_key_auto_play_policy"

    .line 18
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "KEY_AM_AUTO_PLAY_POLICY "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/aggmoread/sdk/adapter/helper/LogHelper;->log(Ljava/lang/String;)V

    .line 20
    instance-of v1, p0, Ljava/lang/Integer;

    if-eqz v1, :cond_3

    .line 21
    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {v0, p0}, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->setAutoPlayPolicy(I)Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    :catch_0
    :cond_3
    invoke-virtual {v0}, Lcom/aggmoread/sdk/client/AMVideoConfigs$Builder;->build()Lcom/aggmoread/sdk/client/AMVideoConfigs;

    move-result-object p0

    return-object p0
.end method

.method public static notifyBidResult(Lcom/aggmoread/sdk/client/AMAdInterface;ZDI)Z
    .locals 0

    if-eqz p0, :cond_1

    if-eqz p1, :cond_0

    .line 1
    invoke-static {p0}, Lcom/aggmoread/sdk/adapter/helper/AdapterHelper;->sendBidSuccess(Lcom/aggmoread/sdk/client/AMAdInterface;)V

    goto :goto_0

    .line 2
    :cond_0
    invoke-static {p0, p2, p3, p4}, Lcom/aggmoread/sdk/adapter/helper/AdapterHelper;->sendBidFailed(Lcom/aggmoread/sdk/client/AMAdInterface;DI)V

    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static sendBidFailed(Lcom/aggmoread/sdk/client/AMAdInterface;DI)V
    .locals 3

    if-eqz p0, :cond_3

    const/16 v0, 0x2711

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-ne p3, v2, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    if-ne p3, v1, :cond_2

    const/4 v0, 0x2

    goto :goto_0

    :cond_2
    if-ne p3, v0, :cond_0

    :goto_0
    double-to-int p1, p1

    const/4 p2, 0x0

    .line 1
    :try_start_0
    invoke-interface {p0, v0, p1, p2}, Lcom/aggmoread/sdk/client/AMAdInterface;->notifyBidFail(IILjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_3
    return-void
.end method

.method public static sendBidSuccess(Lcom/aggmoread/sdk/client/AMAdInterface;)V
    .locals 2

    if-eqz p0, :cond_0

    .line 1
    invoke-interface {p0}, Lcom/aggmoread/sdk/client/AMAdInterface;->getAdExtras()Lcom/aggmoread/sdk/client/AMAdExtras;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    invoke-interface {p0}, Lcom/aggmoread/sdk/client/AMAdInterface;->getAdExtras()Lcom/aggmoread/sdk/client/AMAdExtras;

    move-result-object v0

    const-string v1, "EXTRA_KEY_ad_ecpm"

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/client/AMAdExtras;->getData(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 4
    invoke-interface {p0, v0}, Lcom/aggmoread/sdk/client/AMAdInterface;->notifyBidSuccess(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method
