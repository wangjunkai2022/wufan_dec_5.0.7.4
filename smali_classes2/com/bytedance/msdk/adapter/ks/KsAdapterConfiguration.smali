.class public Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;
.super Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;


# instance fields
.field private volatile b:Z

.field private final c:Lcom/kwad/sdk/api/KsCustomController;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;->b:Z

    new-instance v0, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration$2;

    invoke-direct {v0, p0}, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration$2;-><init>(Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;)V

    iput-object v0, p0, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;->c:Lcom/kwad/sdk/api/KsCustomController;

    return-void
.end method

.method static synthetic a(Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;)Lcom/kwad/sdk/api/KsCustomController;
    .locals 0

    iget-object p0, p0, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;->c:Lcom/kwad/sdk/api/KsCustomController;

    return-object p0
.end method

.method static synthetic b(Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;->b:Z

    return p1
.end method


# virtual methods
.method public callFunction(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0
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

    const/16 p3, 0x1fa5

    if-ne p1, p3, :cond_0

    const-string p1, "3.3.63.2"

    return-object p1

    :cond_0
    const/16 p3, 0x1fa8

    if-ne p1, p3, :cond_1

    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/api/KsAdSDK;->getSDKVersion()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    const-string p1, "0.0"

    return-object p1

    :cond_1
    const/16 p3, 0x1fa9

    if-ne p1, p3, :cond_2

    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;->mInitConfig:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;->getGromoreVersion()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    const/16 p3, 0x1fbc

    if-ne p1, p3, :cond_3

    const/16 p1, 0x2145

    const-class p3, Lcom/bykv/vk/openvk/api/proto/ValueSet;

    invoke-interface {p2, p1, p3}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bykv/vk/openvk/api/proto/ValueSet;

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;->mInitConfig:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

    invoke-virtual {p2, p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;->setMediationCustomControllerValueSet(Lcom/bykv/vk/openvk/api/proto/ValueSet;)V

    invoke-virtual {p0}, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;->setPrivacyConfig()V

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public realInitAdn(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;)V
    .locals 9

    const-class v0, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;->b:Z

    if-nez v1, :cond_2

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;->getAppId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;->getAppName()Ljava/lang/String;

    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz p1, :cond_1

    if-nez v5, :cond_0

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance v1, Ljava/lang/Thread;

    new-instance v8, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration$1;

    move-object v2, v8

    move-object v3, p0

    move-object v4, p1

    move-object v7, p2

    invoke-direct/range {v2 .. v7}, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration$1;-><init>(Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;)V

    invoke-direct {v1, v8}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    const-string p1, "ks-init-thread"

    invoke-virtual {v1, p1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    goto :goto_1

    :cond_1
    :goto_0
    const-string p1, "context or appId is empty"

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;->notifyFail(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    const-string p1, "ks init fail"

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;->notifyFail(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;->notifySuccess()V

    :goto_1
    monitor-exit v0

    return-void

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method

.method public setPrivacyConfig()V
    .locals 1

    :try_start_0
    iget-boolean v0, p0, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;->b:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;->mInitConfig:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;->isLimitPersonalAds()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/kwad/sdk/api/KsAdSDK;->setPersonalRecommend(Z)V

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;->mInitConfig:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;->isProgrammaticRecommend()Z

    move-result v0

    invoke-static {v0}, Lcom/kwad/sdk/api/KsAdSDK;->setProgrammaticRecommend(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    :goto_1
    return-void
.end method
