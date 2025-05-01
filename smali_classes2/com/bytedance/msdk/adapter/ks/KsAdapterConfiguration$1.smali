.class Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;->realInitAdn(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/content/Context;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

.field final synthetic f:Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;


# direct methods
.method constructor <init>(Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration$1;->f:Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;

    iput-object p2, p0, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration$1;->b:Landroid/content/Context;

    iput-object p3, p0, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration$1;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration$1;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration$1;->e:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration$1;->b:Landroid/content/Context;

    new-instance v1, Lcom/kwad/sdk/api/SdkConfig$Builder;

    invoke-direct {v1}, Lcom/kwad/sdk/api/SdkConfig$Builder;-><init>()V

    iget-object v2, p0, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration$1;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/kwad/sdk/api/SdkConfig$Builder;->appId(Ljava/lang/String;)Lcom/kwad/sdk/api/SdkConfig$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration$1;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/kwad/sdk/api/SdkConfig$Builder;->appName(Ljava/lang/String;)Lcom/kwad/sdk/api/SdkConfig$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration$1;->f:Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;

    invoke-static {v2}, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;->a(Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;)Lcom/kwad/sdk/api/KsCustomController;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/kwad/sdk/api/SdkConfig$Builder;->customController(Lcom/kwad/sdk/api/KsCustomController;)Lcom/kwad/sdk/api/SdkConfig$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kwad/sdk/api/SdkConfig$Builder;->build()Lcom/kwad/sdk/api/SdkConfig;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/api/KsAdSDK;->init(Landroid/content/Context;Lcom/kwad/sdk/api/SdkConfig;)Z

    const-string v0, "3.3.61"

    invoke-static {v0}, Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/n;->k(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/kwad/sdk/api/KsAdSDK;->start()V

    :cond_0
    iget-object v0, p0, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration$1;->e:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;->isLimitPersonalAds()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/kwad/sdk/api/KsAdSDK;->setPersonalRecommend(Z)V

    iget-object v0, p0, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration$1;->e:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;->isProgrammaticRecommend()Z

    move-result v0

    invoke-static {v0}, Lcom/kwad/sdk/api/KsAdSDK;->setProgrammaticRecommend(Z)V

    iget-object v0, p0, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration$1;->f:Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;

    invoke-static {v0, v1}, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;->b(Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;Z)Z

    iget-object v0, p0, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration$1;->f:Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;->notifySuccess()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    iget-object v0, p0, Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration$1;->f:Lcom/bytedance/msdk/adapter/ks/KsAdapterConfiguration;

    const-string v1, "ks init fail in other thread"

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitImpl;->notifyFail(Ljava/lang/String;)V

    :goto_1
    return-void
.end method
