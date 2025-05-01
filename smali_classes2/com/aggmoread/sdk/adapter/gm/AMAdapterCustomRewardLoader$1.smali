.class Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomRewardLoader$1;
.super Ljava/lang/Object;
.source "AMAdapterCustomRewardLoader.java"

# interfaces
.implements Lcom/aggmoread/sdk/client/reward/AMRewardInteractionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomRewardLoader;->showAd(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomRewardLoader;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomRewardLoader;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomRewardLoader$1;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomRewardLoader;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdClicked()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomRewardLoader$1;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomRewardLoader;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/reward/MediationCustomRewardVideoLoader;->callRewardVideoAdClick()V

    return-void
.end method

.method public onAdClosed()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomRewardLoader$1;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomRewardLoader;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/reward/MediationCustomRewardVideoLoader;->callRewardVideoAdClosed()V

    return-void
.end method

.method public onAdError(Lcom/aggmoread/sdk/client/AMError;)V
    .locals 0

    return-void
.end method

.method public onAdExposed()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomRewardLoader$1;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomRewardLoader;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/reward/MediationCustomRewardVideoLoader;->callRewardVideoAdShow()V

    return-void
.end method

.method public onReward(Ljava/util/Map;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomRewardLoader$1;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomRewardLoader;

    new-instance v1, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomRewardLoader$1$1;

    invoke-direct {v1, p0, p1}, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomRewardLoader$1$1;-><init>(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomRewardLoader$1;Ljava/util/Map;)V

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/reward/MediationCustomRewardVideoLoader;->callRewardVideoRewardVerify(Lcom/bytedance/sdk/openadsdk/mediation/custom/MediationRewardItem;)V

    return-void
.end method

.method public onVideoComplete()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomRewardLoader$1;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomRewardLoader;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/reward/MediationCustomRewardVideoLoader;->callRewardVideoComplete()V

    return-void
.end method
