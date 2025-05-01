.class Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration$2;
.super Lcom/kwad/sdk/api/KsCustomController;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;


# direct methods
.method constructor <init>(Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration$2;->a:Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;

    invoke-direct {p0}, Lcom/kwad/sdk/api/KsCustomController;-><init>()V

    return-void
.end method


# virtual methods
.method public canReadInstalledPackages()Z
    .locals 1

    iget-object v0, p0, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration$2;->a:Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;->mInitConfig:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;->appList()Z

    move-result v0

    return v0
.end method

.method public canReadLocation()Z
    .locals 1

    iget-object v0, p0, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration$2;->a:Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;->mInitConfig:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;->isCanUseLocation()Z

    move-result v0

    return v0
.end method

.method public canUseMacAddress()Z
    .locals 1

    iget-object v0, p0, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration$2;->a:Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;->mInitConfig:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;->isCanUseMacAddress()Z

    move-result v0

    return v0
.end method

.method public canUseNetworkState()Z
    .locals 1

    iget-object v0, p0, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration$2;->a:Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;->mInitConfig:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;->isCanUseWifiState()Z

    move-result v0

    return v0
.end method

.method public canUseOaid()Z
    .locals 1

    iget-object v0, p0, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration$2;->a:Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;->mInitConfig:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;->isCanUseOaid()Z

    move-result v0

    return v0
.end method

.method public canUsePhoneState()Z
    .locals 1

    iget-object v0, p0, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration$2;->a:Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;->mInitConfig:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;->isCanUsePhoneState()Z

    move-result v0

    return v0
.end method

.method public canUseStoragePermission()Z
    .locals 1

    iget-object v0, p0, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration$2;->a:Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;->mInitConfig:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;->isCanUseWriteExternal()Z

    move-result v0

    return v0
.end method

.method public getAndroidId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration$2;->a:Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;->mInitConfig:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;->getAndroidId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getImei()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration$2;->a:Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;->mInitConfig:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;->getDevImei()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getImeis()[Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration$2;->a:Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;->mInitConfig:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;->getDevImeis()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v2, v1, [Ljava/lang/String;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    aput-object v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v2

    :cond_1
    invoke-super {p0}, Lcom/kwad/sdk/api/KsCustomController;->getImeis()[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getInstalledPackages()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration$2;->a:Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;->mInitConfig:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;->getAppList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getLocation()Landroid/location/Location;
    .locals 4

    iget-object v0, p0, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration$2;->a:Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;->mInitConfig:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;->getLocation()Lcom/bytedance/sdk/openadsdk/mediation/bridge/IMediationLocation;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Landroid/location/Location;

    const-string v2, ""

    invoke-direct {v1, v2}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/IMediationLocation;->getLatitude()D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Landroid/location/Location;->setLatitude(D)V

    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/IMediationLocation;->getLongitude()D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Landroid/location/Location;->setLongitude(D)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getMacAddress()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration$2;->a:Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;->mInitConfig:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;->getMacAddress()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getOaid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration$2;->a:Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;->mInitConfig:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;->getDevOaid()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
