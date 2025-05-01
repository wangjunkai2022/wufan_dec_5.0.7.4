.class public Lcom/bytedance/sdk/openadsdk/mediation/vv/vv/i;
.super Lcom/bytedance/sdk/openadsdk/n/vv/vv/vv/p;


# instance fields
.field private vv:Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/n/vv/vv/vv/p;-><init>(Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;)V

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/vv/vv/i;->vv:Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;

    return-void
.end method


# virtual methods
.method public call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 4
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
    const-class v0, Lcom/bykv/vk/openvk/api/proto/Bridge;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0x20406

    if-ne p1, v3, :cond_0

    .line 2
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/mediation/vv/vv/i;->vv:Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;

    if-eqz v3, :cond_1

    .line 3
    new-instance p1, Lcom/bytedance/sdk/openadsdk/mediation/vv/vv/r;

    invoke-interface {p2, v2, v0}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-direct {p1, p2}, Lcom/bytedance/sdk/openadsdk/mediation/vv/vv/r;-><init>(Lcom/bykv/vk/openvk/api/proto/Bridge;)V

    .line 4
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/mediation/vv/vv/i;->vv:Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;

    invoke-interface {p2, p1}, Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;->onFullScreenVideoAdLoad(Lcom/bytedance/sdk/openadsdk/TTFullScreenVideoAd;)V

    return-object v1

    :cond_0
    const v3, 0x20407

    if-ne p1, v3, :cond_1

    .line 5
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/mediation/vv/vv/i;->vv:Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;

    if-eqz v3, :cond_1

    .line 6
    new-instance p1, Lcom/bytedance/sdk/openadsdk/mediation/vv/vv/r;

    invoke-interface {p2, v2, v0}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-direct {p1, p2}, Lcom/bytedance/sdk/openadsdk/mediation/vv/vv/r;-><init>(Lcom/bykv/vk/openvk/api/proto/Bridge;)V

    .line 7
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/mediation/vv/vv/i;->vv:Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;

    invoke-interface {p2, p1}, Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;->onFullScreenVideoCached(Lcom/bytedance/sdk/openadsdk/TTFullScreenVideoAd;)V

    return-object v1

    .line 8
    :cond_1
    invoke-super {p0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/n/vv/vv/vv/p;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
