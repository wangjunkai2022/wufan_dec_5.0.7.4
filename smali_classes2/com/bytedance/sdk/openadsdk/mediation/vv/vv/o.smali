.class public Lcom/bytedance/sdk/openadsdk/mediation/vv/vv/o;
.super Lcom/bytedance/sdk/openadsdk/mediation/ad/vv/vv/m/vv;


# instance fields
.field private vv:Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationAdSlot;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationAdSlot;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/mediation/ad/vv/vv/m/vv;-><init>(Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationAdSlot;)V

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/vv/vv/o;->vv:Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationAdSlot;

    return-void
.end method


# virtual methods
.method public call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
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
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/vv/vv/o;->vv:Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationAdSlot;

    if-nez v0, :cond_0

    .line 2
    invoke-static {p3}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationValueUtil;->checkClassType(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    const v0, 0x40f75

    const/4 v1, 0x0

    if-ne p1, v0, :cond_1

    .line 3
    const-class p2, Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationNativeToBannerListener;

    .line 4
    invoke-super {p0, p1, v1, p2}, Lcom/bytedance/sdk/openadsdk/mediation/ad/vv/vv/m/vv;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationNativeToBannerListener;

    .line 5
    new-instance p2, Lcom/bytedance/sdk/openadsdk/mediation/ad/vv/vv/m/p;

    invoke-direct {p2, p1}, Lcom/bytedance/sdk/openadsdk/mediation/ad/vv/vv/m/p;-><init>(Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationNativeToBannerListener;)V

    return-object p2

    :cond_1
    const v0, 0x40f76

    if-ne p1, v0, :cond_3

    .line 6
    const-class p2, Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationSplashRequestInfo;

    .line 7
    invoke-super {p0, p1, v1, p2}, Lcom/bytedance/sdk/openadsdk/mediation/ad/vv/vv/m/vv;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationSplashRequestInfo;

    if-eqz p1, :cond_2

    .line 8
    new-instance p2, Lcom/bytedance/sdk/openadsdk/mediation/vv/vv/wv;

    invoke-direct {p2, p1}, Lcom/bytedance/sdk/openadsdk/mediation/vv/vv/wv;-><init>(Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationSplashRequestInfo;)V

    return-object p2

    :cond_2
    return-object v1

    .line 9
    :cond_3
    invoke-super {p0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/mediation/ad/vv/vv/m/vv;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
