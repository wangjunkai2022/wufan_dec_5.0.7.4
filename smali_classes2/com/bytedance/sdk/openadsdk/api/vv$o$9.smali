.class Lcom/bytedance/sdk/openadsdk/api/vv$o$9;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/api/vv$m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/api/vv$o;->n(Lcom/bykv/vk/openvk/api/proto/ValueSet;Lcom/bykv/vk/openvk/api/proto/Bridge;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bytedance/sdk/openadsdk/api/vv$m<",
        "Lcom/bykv/vk/openvk/api/proto/Loader;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic m:Lcom/bykv/vk/openvk/api/proto/Bridge;

.field final synthetic p:Lcom/bytedance/sdk/openadsdk/api/vv$o;

.field final synthetic vv:Lcom/bykv/vk/openvk/api/proto/ValueSet;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/api/vv$o;Lcom/bykv/vk/openvk/api/proto/ValueSet;Lcom/bykv/vk/openvk/api/proto/Bridge;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/vv$o$9;->p:Lcom/bytedance/sdk/openadsdk/api/vv$o;

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/api/vv$o$9;->vv:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/api/vv$o$9;->m:Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public vv(Lcom/bykv/vk/openvk/api/proto/Loader;)V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv$o$9;->vv:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    invoke-static {v0}, Lcom/bykv/vv/vv/vv/vv/a;->k(Lcom/bykv/vk/openvk/api/proto/ValueSet;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/bykv/vv/vv/vv/vv/a;->j(IZ)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/api/vv$o$9;->m:Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-virtual {v0, v2, v1}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bykv/vv/vv/vv/vv/a;->a()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v0

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-interface {p1, v1, v0, v2}, Lcom/bykv/vk/openvk/api/proto/Loader;->load(ILcom/bykv/vk/openvk/api/proto/ValueSet;Lcom/bykv/vk/openvk/api/proto/EventListener;)V

    return-void
.end method

.method public bridge synthetic vv(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/bykv/vk/openvk/api/proto/Loader;

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/api/vv$o$9;->vv(Lcom/bykv/vk/openvk/api/proto/Loader;)V

    return-void
.end method
