.class public Lcom/bytedance/sdk/openadsdk/r/vv/vv/vv/m;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/bykv/vk/openvk/api/proto/Bridge;


# instance fields
.field private final m:Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd$RewardAdPlayAgainController;

.field private vv:Lcom/bykv/vk/openvk/api/proto/ValueSet;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd$RewardAdPlayAgainController;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/r/vv/vv/vv/m;->m:Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd$RewardAdPlayAgainController;

    .line 3
    sget-object p1, Lcom/bykv/vv/vv/vv/vv/a;->c:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/r/vv/vv/vv/m;->vv:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    return-void
.end method


# virtual methods
.method public call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 3
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

    .line 1
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/r/vv/vv/vv/m;->m:Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd$RewardAdPlayAgainController;

    const/4 v0, 0x0

    if-nez p3, :cond_0

    return-object v0

    :cond_0
    const p3, 0x1dcf5

    if-eq p1, p3, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 2
    invoke-interface {p2, p1}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->intValue(I)I

    move-result p1

    .line 3
    new-instance p3, Lcom/bytedance/sdk/openadsdk/i/vv/vv/vv/vv/vv;

    const/4 v1, 0x1

    const-class v2, Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-interface {p2, v1, v2}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-direct {p3, p2}, Lcom/bytedance/sdk/openadsdk/i/vv/vv/vv/vv/vv;-><init>(Lcom/bykv/vk/openvk/api/proto/Bridge;)V

    .line 4
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/r/vv/vv/vv/m;->m:Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd$RewardAdPlayAgainController;

    invoke-interface {p2, p1, p3}, Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd$RewardAdPlayAgainController;->getPlayAgainCondition(ILcom/bytedance/sdk/openadsdk/TTRewardVideoAd$RewardAdPlayAgainController$Callback;)V

    :goto_0
    return-object v0
.end method

.method public values()Lcom/bykv/vk/openvk/api/proto/ValueSet;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/r/vv/vv/vv/m;->vv:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    return-object v0
.end method
