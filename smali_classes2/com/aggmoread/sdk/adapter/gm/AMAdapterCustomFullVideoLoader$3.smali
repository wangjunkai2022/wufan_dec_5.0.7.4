.class Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader$3;
.super Ljava/lang/Object;
.source "AMAdapterCustomFullVideoLoader.java"

# interfaces
.implements Lcom/aggmoread/sdk/client/AMRewardAdConfig$RewardListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader;->getRewardAdConfig()Lcom/aggmoread/sdk/client/AMRewardAdConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader$3;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onReward(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader$3;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader;

    new-instance v1, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader$3$1;

    invoke-direct {v1, p0, p1}, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader$3$1;-><init>(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader$3;Ljava/util/Map;)V

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/fullvideo/MediationCustomFullVideoLoader;->callFullVideoRewardVerify(Lcom/bytedance/sdk/openadsdk/mediation/custom/MediationRewardItem;)V

    return-void
.end method
