.class public Lcom/bytedance/msdk/adapter/gdt/GdtRewardLoader;
.super Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationAdLoaderImpl;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationAdLoaderImpl;-><init>()V

    return-void
.end method


# virtual methods
.method public realLoader(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;)V
    .locals 2

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    new-instance v0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/j;

    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationAdLoaderImpl;->getGMBridge()Lcom/bykv/vk/openvk/api/proto/Bridge;

    move-result-object v1

    invoke-direct {v0, p2, v1, p0}, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/j;-><init>(Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;Lcom/bykv/vk/openvk/api/proto/Bridge;Lcom/bytedance/msdk/adapter/gdt/GdtRewardLoader;)V

    invoke-virtual {v0, p1}, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/j;->d(Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    const p1, 0x13881

    const-string p2, "context is null or adSlotValueSet is null"

    invoke-virtual {p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationAdLoaderImpl;->notifyAdFailed(ILjava/lang/String;)V

    :goto_0
    return-void
.end method
