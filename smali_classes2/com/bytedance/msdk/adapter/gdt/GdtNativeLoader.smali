.class public Lcom/bytedance/msdk/adapter/gdt/GdtNativeLoader;
.super Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationAdLoaderImpl;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationAdLoaderImpl;-><init>()V

    return-void
.end method


# virtual methods
.method public realLoader(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;)V
    .locals 1

    if-eqz p1, :cond_0

    new-instance v0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/i;

    invoke-direct {v0, p0}, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/i;-><init>(Lcom/bytedance/msdk/adapter/gdt/GdtNativeLoader;)V

    invoke-virtual {v0, p1, p2}, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/i;->d(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;)V

    :cond_0
    return-void
.end method
