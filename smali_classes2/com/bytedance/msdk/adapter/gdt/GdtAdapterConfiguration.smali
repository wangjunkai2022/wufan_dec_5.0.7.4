.class public Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration;
.super Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;


# instance fields
.field private volatile b:Z

.field private c:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration;->b:Z

    return-void
.end method

.method static synthetic a(Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration;)Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;
    .locals 0

    iget-object p0, p0, Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration;->c:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

    return-object p0
.end method

.method private b(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    :try_start_0
    const-string v1, "4.561.1431"

    invoke-static {v1}, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/a;->g(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p1, p2}, Lcom/qq/e/comm/managers/GDTAdSdk;->initWithoutStart(Landroid/content/Context;Ljava/lang/String;)V

    new-instance p1, Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration$1;

    invoke-direct {p1, p0}, Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration$1;-><init>(Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration;)V

    invoke-static {p1}, Lcom/qq/e/comm/managers/GDTAdSdk;->start(Lcom/qq/e/comm/managers/GDTAdSdk$OnStartListener;)V

    goto :goto_0

    :cond_1
    invoke-static {p1, p2}, Lcom/qq/e/comm/managers/GDTAdSdk;->init(Landroid/content/Context;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p0}, Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration;->setPrivacyConfig()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    return p1

    :catchall_0
    :cond_2
    :goto_1
    return v0
.end method


# virtual methods
.method public callFunction(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I",
            "Lcom/bykv/vk/openvk/api/proto/ValueSet;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    const/16 v0, 0x1fa5

    if-ne p1, v0, :cond_0

    const-string p1, "4.575.1445.1"

    return-object p1

    :cond_0
    const/16 v0, 0x1fa7

    if-ne p1, v0, :cond_2

    const/16 p1, 0x1f46

    const-class p3, Ljava/util/Map;

    invoke-interface {p2, p1, p3}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    :try_start_0
    new-instance p3, Ljava/util/HashMap;

    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    const-string v0, "slot_id"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {}, Lcom/qq/e/comm/managers/GDTAdSdk;->getGDTAdManger()Lcom/qq/e/comm/managers/IGDTAdManager;

    move-result-object v0

    invoke-interface {v0, p2}, Lcom/qq/e/comm/managers/IGDTAdManager;->getBuyerId(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/qq/e/comm/managers/GDTAdSdk;->getGDTAdManger()Lcom/qq/e/comm/managers/IGDTAdManager;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/qq/e/comm/managers/IGDTAdManager;->getSDKInfo(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "buyerId"

    invoke-interface {p3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "sdkInfo"

    invoke-interface {p3, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p3

    :catchall_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    return-object p2

    :cond_2
    const/16 v0, 0x1fa8

    if-ne p1, v0, :cond_3

    :try_start_1
    invoke-static {}, Lcom/qq/e/comm/managers/status/SDKStatus;->getIntegrationSDKVersion()Ljava/lang/String;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    return-object p1

    :catchall_1
    const-string p1, "0.0"

    return-object p1

    :cond_3
    const/16 v0, 0x1fa9

    if-ne p1, v0, :cond_4

    iget-object p1, p0, Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration;->c:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;->getGromoreVersion()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_4
    const/16 v0, 0x1fbc

    if-ne p1, v0, :cond_5

    const/16 p1, 0x2145

    const-class v0, Lcom/bykv/vk/openvk/api/proto/ValueSet;

    invoke-interface {p2, p1, v0}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bykv/vk/openvk/api/proto/ValueSet;

    iget-object p2, p0, Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration;->c:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

    invoke-virtual {p2, p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;->setMediationCustomControllerValueSet(Lcom/bykv/vk/openvk/api/proto/ValueSet;)V

    :try_start_2
    invoke-virtual {p0}, Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration;->setPrivacyConfig()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0

    :cond_5
    const/16 p2, 0x1fbe

    if-ne p1, p2, :cond_6

    invoke-virtual {p0}, Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration;->showOpenOrInstallAppDialog()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_6
    :goto_0
    invoke-static {p3}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationValueUtil;->checkClassType(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public realInitAdn(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;)V
    .locals 2

    iput-object p2, p0, Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration;->c:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

    const-class v0, Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration;->b:Z

    if-nez v1, :cond_0

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;->getAppId()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration;->b:Z

    :cond_0
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;->notifySuccess()V

    goto :goto_0

    :cond_1
    const-string p1, "gdt init fail"

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;->notifyFail(Ljava/lang/String;)V

    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public setPrivacyConfig()V
    .locals 6

    iget-object v0, p0, Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration;->c:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

    invoke-static {v0}, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/a;->d(Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;)V

    iget-object v0, p0, Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration;->c:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;->isLimitPersonalAds()Z

    move-result v0

    iget-object v1, p0, Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration;->c:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;->isCanUseMacAddress()Z

    move-result v1

    iget-object v2, p0, Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration;->c:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;->isCanUsePhoneState()Z

    move-result v2

    iget-object v3, p0, Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration;->c:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

    invoke-virtual {v3}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;->isCanUseAndroidId()Z

    move-result v3

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v5, "mac_address"

    invoke-interface {v4, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v3, "android_id"

    invoke-interface {v4, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "device_id"

    invoke-interface {v4, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v4}, Lcom/qq/e/comm/managers/setting/GlobalSetting;->setAgreeReadPrivacyInfo(Ljava/util/Map;)V

    invoke-static {v0}, Lcom/qq/e/comm/managers/setting/GlobalSetting;->setPersonalizedState(I)V

    return-void
.end method

.method public showOpenOrInstallAppDialog()I
    .locals 2

    :try_start_0
    invoke-static {}, Lcom/qq/e/comm/managers/GDTAdSdk;->getGDTAdManger()Lcom/qq/e/comm/managers/IGDTAdManager;

    move-result-object v0

    new-instance v1, Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration$2;

    invoke-direct {v1, p0}, Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration$2;-><init>(Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration;)V

    invoke-interface {v0, v1}, Lcom/qq/e/comm/managers/IGDTAdManager;->showOpenOrInstallAppDialog(Lcom/qq/e/ads/dfa/GDTAppDialogClickListener;)I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v0

    :catchall_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 v0, 0x0

    return v0
.end method
