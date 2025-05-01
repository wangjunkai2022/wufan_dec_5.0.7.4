.class public Lcom/bytedance/sdk/openadsdk/p/vv/m/vv;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/bykv/vk/openvk/api/proto/Bridge;


# instance fields
.field private final m:Lcom/bytedance/sdk/openadsdk/TTAdInteractionListener;

.field private vv:Lcom/bykv/vk/openvk/api/proto/ValueSet;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/TTAdInteractionListener;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/p/vv/m/vv;->m:Lcom/bytedance/sdk/openadsdk/TTAdInteractionListener;

    .line 3
    sget-object p1, Lcom/bykv/vv/vv/vv/vv/a;->c:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/p/vv/m/vv;->vv:Lcom/bykv/vk/openvk/api/proto/ValueSet;

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
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/p/vv/m/vv;->m:Lcom/bytedance/sdk/openadsdk/TTAdInteractionListener;

    const/4 v0, 0x0

    if-nez p3, :cond_0

    return-object v0

    :cond_0
    const p3, 0x18705

    if-eq p1, p3, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 2
    invoke-interface {p2, p1}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->intValue(I)I

    move-result p1

    const/4 p3, 0x1

    .line 3
    const-class v1, Ljava/util/Map;

    invoke-interface {p2, p3, v1}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map;

    .line 4
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/p/vv/m/vv;->m:Lcom/bytedance/sdk/openadsdk/TTAdInteractionListener;

    invoke-interface {p3, p1, p2}, Lcom/bytedance/sdk/openadsdk/TTAdInteractionListener;->onAdEvent(ILjava/util/Map;)V

    :goto_0
    return-object v0
.end method

.method public values()Lcom/bykv/vk/openvk/api/proto/ValueSet;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/m/vv;->vv:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    return-object v0
.end method
