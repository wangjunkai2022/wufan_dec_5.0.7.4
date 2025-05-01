.class Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader$2;
.super Ljava/lang/Object;
.source "AMAdapterCustomFullVideoLoader.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader;->load(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/mediation/custom/MediationCustomServiceConfig;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader;

.field final synthetic val$adSlot:Lcom/bytedance/sdk/openadsdk/AdSlot;

.field final synthetic val$context:Landroid/content/Context;

.field final synthetic val$mediationCustomServiceConfig:Lcom/bytedance/sdk/openadsdk/mediation/custom/MediationCustomServiceConfig;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader;Lcom/bytedance/sdk/openadsdk/mediation/custom/MediationCustomServiceConfig;Lcom/bytedance/sdk/openadsdk/AdSlot;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader$2;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader;

    iput-object p2, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader$2;->val$mediationCustomServiceConfig:Lcom/bytedance/sdk/openadsdk/mediation/custom/MediationCustomServiceConfig;

    iput-object p3, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader$2;->val$adSlot:Lcom/bytedance/sdk/openadsdk/AdSlot;

    iput-object p4, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader$2;->val$context:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader$2;->val$mediationCustomServiceConfig:Lcom/bytedance/sdk/openadsdk/mediation/custom/MediationCustomServiceConfig;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/custom/MediationCustomServiceConfig;->getADNNetworkSlotId()Ljava/lang/String;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader$2;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader;

    invoke-static {v1}, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader;->access$000(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader;)Lcom/aggmoread/sdk/client/AMRewardAdConfig;

    move-result-object v1

    .line 3
    new-instance v2, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;

    invoke-direct {v2}, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;-><init>()V

    .line 4
    invoke-virtual {v2, v0}, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->setSlotId(Ljava/lang/String;)Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;

    move-result-object v0

    const/4 v2, 0x1

    .line 5
    invoke-virtual {v0, v2}, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->setAdCount(I)Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;

    move-result-object v0

    .line 6
    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->setRewardConfig(Lcom/aggmoread/sdk/client/AMRewardAdConfig;)Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader$2;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader;

    iget-object v2, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader$2;->val$adSlot:Lcom/bytedance/sdk/openadsdk/AdSlot;

    .line 7
    invoke-static {v1, v2}, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader;->access$100(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader;Lcom/bytedance/sdk/openadsdk/AdSlot;)Lcom/aggmoread/sdk/client/AMVideoConfigs;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->setVideoConfig(Lcom/aggmoread/sdk/client/AMVideoConfigs;)Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->build()Lcom/aggmoread/sdk/client/AMAdLoadSlot;

    move-result-object v0

    .line 8
    invoke-static {v0}, Lcom/aggmoread/sdk/client/AMSdk;->makeAdLoader(Lcom/aggmoread/sdk/client/AMAdLoadSlot;)Lcom/aggmoread/sdk/client/AMAdLoader;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 9
    iget-object v1, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader$2;->val$context:Landroid/content/Context;

    new-instance v2, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader$2$1;

    invoke-direct {v2, p0}, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader$2$1;-><init>(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader$2;)V

    invoke-virtual {v0, v1, v2}, Lcom/aggmoread/sdk/client/AMAdLoader;->loadFullScreenAd(Landroid/content/Context;Lcom/aggmoread/sdk/client/fullscreen/AMFullScreenAdListener;)V

    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader$2;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader;

    const v1, -0x7a120

    const-string v2, "\u5e7f\u544a\u52a0\u8f7d\u5668\u6784\u5efa\u5931\u8d25!"

    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/MediationCustomAdBaseLoader;->callLoadFail(ILjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "reward err "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/aggmoread/sdk/adapter/helper/LogHelper;->log(Ljava/lang/String;)V

    :goto_0
    return-void
.end method
