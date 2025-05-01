.class public Lcom/bytedance/sdk/openadsdk/mediation/ad/vv/vv/m/p;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/bykv/vk/openvk/api/proto/Bridge;


# instance fields
.field private final m:Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationNativeToBannerListener;

.field private vv:Lcom/bykv/vk/openvk/api/proto/ValueSet;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationNativeToBannerListener;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/vv/vv/m/p;->m:Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationNativeToBannerListener;

    .line 3
    sget-object p1, Lcom/bykv/vv/vv/vv/vv/a;->c:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/vv/vv/m/p;->vv:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    return-void
.end method


# virtual methods
.method public call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
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
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/vv/vv/m/p;->m:Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationNativeToBannerListener;

    const/4 v0, 0x0

    if-nez p3, :cond_0

    return-object v0

    :cond_0
    const p3, 0x40f1d

    if-eq p1, p3, :cond_1

    return-object v0

    .line 2
    :cond_1
    new-instance p1, Lcom/bytedance/sdk/openadsdk/mediation/ad/vv/vv/vv/vv;

    const/4 p3, 0x0

    const-class v0, Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-interface {p2, p3, v0}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-direct {p1, p2}, Lcom/bytedance/sdk/openadsdk/mediation/ad/vv/vv/vv/vv;-><init>(Lcom/bykv/vk/openvk/api/proto/Bridge;)V

    .line 3
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/vv/vv/m/p;->m:Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationNativeToBannerListener;

    invoke-interface {p2, p1}, Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationNativeToBannerListener;->getMediationBannerViewFromNativeAd(Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationNativeAdInfo;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public values()Lcom/bykv/vk/openvk/api/proto/ValueSet;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/vv/vv/m/p;->vv:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    return-object v0
.end method
