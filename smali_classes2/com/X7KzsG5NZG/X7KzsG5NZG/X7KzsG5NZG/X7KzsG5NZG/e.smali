.class public Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e$d;,
        Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e$e;,
        Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e$f;
    }
.end annotation


# instance fields
.field private a:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;

.field private b:Lcom/bykv/vk/openvk/api/proto/Bridge;

.field private c:Landroid/widget/FrameLayout$LayoutParams;

.field private final d:Lcom/bytedance/msdk/adapter/gdt/GdtBannerLoader;

.field private e:Z

.field private final f:Lcom/qq/e/ads/nativ/NativeExpressAD$NativeExpressADListener;

.field private final g:Lcom/qq/e/ads/nativ/NativeADUnifiedListener;


# direct methods
.method public constructor <init>(Lcom/bytedance/msdk/adapter/gdt/GdtBannerLoader;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e$b;

    invoke-direct {v0, p0}, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e$b;-><init>(Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;)V

    iput-object v0, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->f:Lcom/qq/e/ads/nativ/NativeExpressAD$NativeExpressADListener;

    new-instance v0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e$c;

    invoke-direct {v0, p0}, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e$c;-><init>(Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;)V

    iput-object v0, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->g:Lcom/qq/e/ads/nativ/NativeADUnifiedListener;

    iput-object p1, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->d:Lcom/bytedance/msdk/adapter/gdt/GdtBannerLoader;

    return-void
.end method

.method static synthetic a(Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;)Lcom/bytedance/msdk/adapter/gdt/GdtBannerLoader;
    .locals 0

    iget-object p0, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->d:Lcom/bytedance/msdk/adapter/gdt/GdtBannerLoader;

    return-object p0
.end method

.method private b(Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;)Lcom/qq/e/ads/nativ/ADSize;
    .locals 6

    new-instance v0, Lcom/qq/e/ads/nativ/ADSize;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Lcom/qq/e/ads/nativ/ADSize;-><init>(II)V

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;->getExpressWidth()F

    move-result v1

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;->getExpressHeight()F

    move-result v3

    const/4 v4, 0x0

    cmpl-float v5, v1, v4

    if-lez v5, :cond_2

    invoke-static {p1}, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/a;->f(Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;)Z

    move-result p1

    if-nez p1, :cond_1

    cmpl-float p1, v3, v4

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/qq/e/ads/nativ/ADSize;

    float-to-int p1, v1

    float-to-int v1, v3

    invoke-direct {v0, p1, v1}, Lcom/qq/e/ads/nativ/ADSize;-><init>(II)V

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v0, Lcom/qq/e/ads/nativ/ADSize;

    float-to-int p1, v1

    invoke-direct {v0, p1, v2}, Lcom/qq/e/ads/nativ/ADSize;-><init>(II)V

    :cond_2
    :goto_1
    return-object v0
.end method

.method private c(Landroid/content/Context;)V
    .locals 7

    iget-object v0, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->d:Lcom/bytedance/msdk/adapter/gdt/GdtBannerLoader;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationAdLoaderImpl;->isServerBidding()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/qq/e/ads/nativ/NativeExpressAD;

    iget-object v1, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->a:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;

    invoke-direct {p0, v1}, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->b(Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;)Lcom/qq/e/ads/nativ/ADSize;

    move-result-object v3

    iget-object v1, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->d:Lcom/bytedance/msdk/adapter/gdt/GdtBannerLoader;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationAdLoaderImpl;->getAdnId()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->f:Lcom/qq/e/ads/nativ/NativeExpressAD$NativeExpressADListener;

    iget-object v1, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->d:Lcom/bytedance/msdk/adapter/gdt/GdtBannerLoader;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationAdLoaderImpl;->getAdm()Ljava/lang/String;

    move-result-object v6

    move-object v1, v0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/qq/e/ads/nativ/NativeExpressAD;-><init>(Landroid/content/Context;Lcom/qq/e/ads/nativ/ADSize;Ljava/lang/String;Lcom/qq/e/ads/nativ/NativeExpressAD$NativeExpressADListener;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/qq/e/ads/nativ/NativeExpressAD;

    iget-object v1, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->a:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;

    invoke-direct {p0, v1}, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->b(Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;)Lcom/qq/e/ads/nativ/ADSize;

    move-result-object v1

    iget-object v2, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->d:Lcom/bytedance/msdk/adapter/gdt/GdtBannerLoader;

    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationAdLoaderImpl;->getAdnId()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->f:Lcom/qq/e/ads/nativ/NativeExpressAD$NativeExpressADListener;

    invoke-direct {v0, p1, v1, v2, v3}, Lcom/qq/e/ads/nativ/NativeExpressAD;-><init>(Landroid/content/Context;Lcom/qq/e/ads/nativ/ADSize;Ljava/lang/String;Lcom/qq/e/ads/nativ/NativeExpressAD$NativeExpressADListener;)V

    :goto_0
    iget-object p1, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->a:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;->getGdtMaxVideoDuration()I

    move-result p1

    iget-object v1, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->a:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;->getGdtMinVideoDuration()I

    move-result v1

    if-lez v1, :cond_1

    invoke-virtual {v0, v1}, Lcom/qq/e/ads/nativ/NativeExpressAD;->setMinVideoDuration(I)V

    :cond_1
    if-lez p1, :cond_2

    invoke-virtual {v0, p1}, Lcom/qq/e/ads/nativ/NativeExpressAD;->setMaxVideoDuration(I)V

    :cond_2
    iget-object p1, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->a:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;->getGdtVideoOption()Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, Lcom/qq/e/ads/cfg/VideoOption;

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->a:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;->getGdtVideoOption()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/qq/e/ads/cfg/VideoOption;

    goto :goto_1

    :cond_3
    new-instance p1, Lcom/qq/e/ads/cfg/VideoOption$Builder;

    invoke-direct {p1}, Lcom/qq/e/ads/cfg/VideoOption$Builder;-><init>()V

    invoke-virtual {p1}, Lcom/qq/e/ads/cfg/VideoOption$Builder;->build()Lcom/qq/e/ads/cfg/VideoOption;

    move-result-object p1

    :goto_1
    invoke-virtual {v0, p1}, Lcom/qq/e/ads/nativ/NativeExpressAD;->setVideoOption(Lcom/qq/e/ads/cfg/VideoOption;)V

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Lcom/qq/e/ads/nativ/NativeExpressAD;->loadAD(I)V

    return-void
.end method

.method static synthetic e(Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->f(Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;Landroid/content/Context;)V

    return-void
.end method

.method private f(Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;Landroid/content/Context;)V
    .locals 2

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;->getAdSubType()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;->getOriginType()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->c(Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->h(Landroid/content/Context;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->d:Lcom/bytedance/msdk/adapter/gdt/GdtBannerLoader;

    const p2, 0x13881

    const-string v0, "originType is mismatch"

    invoke-virtual {p1, p2, v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationAdLoaderImpl;->notifyAdFailed(ILjava/lang/String;)V

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e$d;

    iget-object v1, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->b:Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-direct {v0, p0, p1, v1}, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e$d;-><init>(Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;Lcom/bykv/vk/openvk/api/proto/Bridge;)V

    invoke-virtual {v0, p2}, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e$d;->b(Landroid/content/Context;)V

    :goto_0
    return-void
.end method

.method static synthetic g(Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;)Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;
    .locals 0

    iget-object p0, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->a:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;

    return-object p0
.end method

.method private h(Landroid/content/Context;)V
    .locals 4

    iget-object v0, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->d:Lcom/bytedance/msdk/adapter/gdt/GdtBannerLoader;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationAdLoaderImpl;->isServerBidding()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/qq/e/ads/nativ/NativeUnifiedAD;

    iget-object v1, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->d:Lcom/bytedance/msdk/adapter/gdt/GdtBannerLoader;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationAdLoaderImpl;->getAdnId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->g:Lcom/qq/e/ads/nativ/NativeADUnifiedListener;

    iget-object v3, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->d:Lcom/bytedance/msdk/adapter/gdt/GdtBannerLoader;

    invoke-virtual {v3}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationAdLoaderImpl;->getAdm()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, p1, v1, v2, v3}, Lcom/qq/e/ads/nativ/NativeUnifiedAD;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/qq/e/ads/nativ/NativeADUnifiedListener;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/qq/e/ads/nativ/NativeUnifiedAD;

    iget-object v1, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->d:Lcom/bytedance/msdk/adapter/gdt/GdtBannerLoader;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationAdLoaderImpl;->getAdnId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->g:Lcom/qq/e/ads/nativ/NativeADUnifiedListener;

    invoke-direct {v0, p1, v1, v2}, Lcom/qq/e/ads/nativ/NativeUnifiedAD;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/qq/e/ads/nativ/NativeADUnifiedListener;)V

    :goto_0
    iget-object p1, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->a:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;->getGdtMaxVideoDuration()I

    move-result p1

    iget-object v1, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->a:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;->getGdtMinVideoDuration()I

    move-result v1

    if-lez v1, :cond_1

    invoke-virtual {v0, v1}, Lcom/qq/e/ads/nativ/NativeUnifiedAD;->setMinVideoDuration(I)V

    :cond_1
    if-lez p1, :cond_2

    invoke-virtual {v0, p1}, Lcom/qq/e/ads/nativ/NativeUnifiedAD;->setMaxVideoDuration(I)V

    :cond_2
    iget-object p1, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->a:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;->getGdtNativeLogoParams()Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Landroid/widget/FrameLayout$LayoutParams;

    if-eqz v1, :cond_3

    check-cast p1, Landroid/widget/FrameLayout$LayoutParams;

    iput-object p1, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->c:Landroid/widget/FrameLayout$LayoutParams;

    :cond_3
    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Lcom/qq/e/ads/nativ/NativeUnifiedAD;->loadData(I)V

    return-void
.end method

.method static synthetic i(Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;)Lcom/bykv/vk/openvk/api/proto/Bridge;
    .locals 0

    iget-object p0, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->b:Lcom/bykv/vk/openvk/api/proto/Bridge;

    return-object p0
.end method

.method static synthetic j(Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->e:Z

    return p0
.end method

.method static synthetic k(Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;)Landroid/widget/FrameLayout$LayoutParams;
    .locals 0

    iget-object p0, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->c:Landroid/widget/FrameLayout$LayoutParams;

    return-object p0
.end method


# virtual methods
.method public d(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;)V
    .locals 1

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    iput-object p2, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->a:Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;

    iget-object v0, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->d:Lcom/bytedance/msdk/adapter/gdt/GdtBannerLoader;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationAdLoaderImpl;->getGMBridge()Lcom/bykv/vk/openvk/api/proto/Bridge;

    move-result-object v0

    iput-object v0, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->b:Lcom/bykv/vk/openvk/api/proto/Bridge;

    iget-object v0, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->d:Lcom/bytedance/msdk/adapter/gdt/GdtBannerLoader;

    invoke-static {v0, p2}, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/a;->e(Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationAdLoaderImpl;Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->e:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e$a;

    invoke-direct {v0, p0, p2, p1}, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e$a;-><init>(Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;Landroid/content/Context;)V

    invoke-static {v0}, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/l;->c(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0, p2, p1}, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->f(Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;Landroid/content/Context;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/e;->d:Lcom/bytedance/msdk/adapter/gdt/GdtBannerLoader;

    const p2, 0x13881

    const-string v0, "context is null or adSlotValueSet is null"

    invoke-virtual {p1, p2, v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationAdLoaderImpl;->notifyAdFailed(ILjava/lang/String;)V

    :goto_0
    return-void
.end method
