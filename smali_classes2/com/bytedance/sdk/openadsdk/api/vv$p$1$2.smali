.class Lcom/bytedance/sdk/openadsdk/api/vv$p$1$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/api/vv$m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/api/vv$p$1;->vv(Lcom/bytedance/sdk/openadsdk/api/vv$m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bytedance/sdk/openadsdk/api/vv$m<",
        "Lcom/bykv/vk/openvk/api/proto/Manager;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic m:Lcom/bytedance/sdk/openadsdk/api/vv$p$1;

.field final synthetic vv:Lcom/bytedance/sdk/openadsdk/api/vv$m;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/api/vv$p$1;Lcom/bytedance/sdk/openadsdk/api/vv$m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p$1$2;->m:Lcom/bytedance/sdk/openadsdk/api/vv$p$1;

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p$1$2;->vv:Lcom/bytedance/sdk/openadsdk/api/vv$m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public vv(Lcom/bykv/vk/openvk/api/proto/Manager;)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p$1$2;->m:Lcom/bytedance/sdk/openadsdk/api/vv$p$1;

    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/api/vv$p$1;->i:Lcom/bytedance/sdk/openadsdk/api/vv$p;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/api/vv$p$1;->m:Lcom/bytedance/sdk/openadsdk/api/vv$m;

    invoke-static {v1, v0}, Lcom/bytedance/sdk/openadsdk/api/vv$p;->vv(Lcom/bytedance/sdk/openadsdk/api/vv$p;Lcom/bytedance/sdk/openadsdk/api/vv$m;)V

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p$1$2;->m:Lcom/bytedance/sdk/openadsdk/api/vv$p$1;

    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/api/vv$p$1;->p:Ljava/lang/ref/SoftReference;

    invoke-virtual {v1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-interface {p1, v1}, Lcom/bykv/vk/openvk/api/proto/Manager;->createLoader(Landroid/content/Context;)Lcom/bykv/vk/openvk/api/proto/Loader;

    move-result-object p1

    iput-object p1, v0, Lcom/bytedance/sdk/openadsdk/api/vv$p$1;->vv:Lcom/bykv/vk/openvk/api/proto/Loader;

    .line 4
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p$1$2;->vv:Lcom/bytedance/sdk/openadsdk/api/vv$m;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p$1$2;->m:Lcom/bytedance/sdk/openadsdk/api/vv$p$1;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/api/vv$p$1;->vv:Lcom/bykv/vk/openvk/api/proto/Loader;

    invoke-interface {p1, v0}, Lcom/bytedance/sdk/openadsdk/api/vv$m;->vv(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic vv(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/bykv/vk/openvk/api/proto/Manager;

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/api/vv$p$1$2;->vv(Lcom/bykv/vk/openvk/api/proto/Manager;)V

    return-void
.end method
