.class public Lcom/bytedance/sdk/openadsdk/b/vv/vv/vv/m;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/bykv/vk/openvk/api/proto/Bridge;


# instance fields
.field private final m:Lcom/bytedance/sdk/openadsdk/TTNativeAd$ExpressRenderListener;

.field private vv:Lcom/bykv/vk/openvk/api/proto/ValueSet;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/TTNativeAd$ExpressRenderListener;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/b/vv/vv/vv/m;->m:Lcom/bytedance/sdk/openadsdk/TTNativeAd$ExpressRenderListener;

    .line 3
    sget-object p1, Lcom/bykv/vv/vv/vv/vv/a;->c:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/b/vv/vv/vv/m;->vv:Lcom/bykv/vk/openvk/api/proto/ValueSet;

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
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/b/vv/vv/vv/m;->m:Lcom/bytedance/sdk/openadsdk/TTNativeAd$ExpressRenderListener;

    const/4 v0, 0x0

    if-nez p3, :cond_0

    return-object v0

    :cond_0
    const p3, 0x22b15

    if-eq p1, p3, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 2
    const-class p3, Landroid/view/View;

    invoke-interface {p2, p1, p3}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    const/4 p3, 0x1

    .line 3
    invoke-interface {p2, p3}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->floatValue(I)F

    move-result p3

    const/4 v1, 0x2

    .line 4
    invoke-interface {p2, v1}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->floatValue(I)F

    move-result v1

    const/4 v2, 0x3

    .line 5
    invoke-interface {p2, v2}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->booleanValue(I)Z

    move-result p2

    .line 6
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/b/vv/vv/vv/m;->m:Lcom/bytedance/sdk/openadsdk/TTNativeAd$ExpressRenderListener;

    invoke-interface {v2, p1, p3, v1, p2}, Lcom/bytedance/sdk/openadsdk/TTNativeAd$ExpressRenderListener;->onRenderSuccess(Landroid/view/View;FFZ)V

    :goto_0
    return-object v0
.end method

.method public values()Lcom/bykv/vk/openvk/api/proto/ValueSet;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/b/vv/vv/vv/m;->vv:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    return-object v0
.end method
