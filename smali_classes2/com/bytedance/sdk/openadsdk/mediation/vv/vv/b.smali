.class public Lcom/bytedance/sdk/openadsdk/mediation/vv/vv/b;
.super Lcom/bytedance/sdk/openadsdk/p/vv/vv/k;


# instance fields
.field private vv:Lcom/bykv/vk/openvk/api/proto/Bridge;


# direct methods
.method public constructor <init>(Lcom/bykv/vk/openvk/api/proto/Bridge;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/p/vv/vv/k;-><init>(Lcom/bykv/vk/openvk/api/proto/Bridge;)V

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/vv/vv/b;->vv:Lcom/bykv/vk/openvk/api/proto/Bridge;

    return-void
.end method


# virtual methods
.method public setExpressRenderListener(Lcom/bytedance/sdk/openadsdk/TTNativeAd$ExpressRenderListener;)V
    .locals 4

    const/4 v0, 0x1

    .line 1
    invoke-static {v0}, Lcom/bykv/vv/vv/vv/vv/a;->c(I)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v1

    .line 2
    instance-of v2, p1, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationExpressRenderListener;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    .line 3
    new-instance v2, Lcom/bytedance/sdk/openadsdk/mediation/ad/vv/vv/m/u;

    check-cast p1, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationExpressRenderListener;

    invoke-direct {v2, p1}, Lcom/bytedance/sdk/openadsdk/mediation/ad/vv/vv/m/u;-><init>(Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationExpressRenderListener;)V

    invoke-virtual {v1, v3, v2}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    .line 4
    invoke-virtual {v1, v0, v0}, Lcom/bykv/vv/vv/vv/vv/a;->f(II)Lcom/bykv/vv/vv/vv/vv/a;

    goto :goto_0

    .line 5
    :cond_0
    new-instance v2, Lcom/bytedance/sdk/openadsdk/b/vv/vv/vv/m;

    invoke-direct {v2, p1}, Lcom/bytedance/sdk/openadsdk/b/vv/vv/vv/m;-><init>(Lcom/bytedance/sdk/openadsdk/TTNativeAd$ExpressRenderListener;)V

    invoke-virtual {v1, v3, v2}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    .line 6
    invoke-virtual {v1, v0, v3}, Lcom/bykv/vv/vv/vv/vv/a;->f(II)Lcom/bykv/vv/vv/vv/vv/a;

    .line 7
    :goto_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/vv/vv/b;->vv:Lcom/bykv/vk/openvk/api/proto/Bridge;

    if-eqz p1, :cond_1

    const v0, 0x2234f

    .line 8
    invoke-virtual {v1}, Lcom/bykv/vv/vv/vv/vv/a;->a()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v1

    const-class v2, Ljava/lang/Void;

    invoke-interface {p1, v0, v1, v2}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    :cond_1
    return-void
.end method
