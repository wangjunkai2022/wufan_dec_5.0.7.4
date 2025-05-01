.class Lcom/bytedance/sdk/openadsdk/api/vv$p$4;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/api/vv$m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/api/vv$p;->getExtra(Ljava/lang/Class;Landroid/os/Bundle;)Ljava/lang/Object;
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
.field final synthetic m:Landroid/os/Bundle;

.field final synthetic p:Lcom/bytedance/sdk/openadsdk/api/vv$p;

.field final synthetic vv:Ljava/lang/Class;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/api/vv$p;Ljava/lang/Class;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p$4;->p:Lcom/bytedance/sdk/openadsdk/api/vv$p;

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p$4;->vv:Ljava/lang/Class;

    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p$4;->m:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public vv(Lcom/bykv/vk/openvk/api/proto/Manager;)V
    .locals 2

    .line 2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p$4;->p:Lcom/bytedance/sdk/openadsdk/api/vv$p;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/api/vv$p;->vv(Lcom/bytedance/sdk/openadsdk/api/vv$p;)Lcom/bykv/vk/openvk/api/proto/Manager;

    move-result-object p1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p$4;->vv:Ljava/lang/Class;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p$4;->m:Landroid/os/Bundle;

    invoke-static {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/api/vv$p;->vv(Lcom/bykv/vk/openvk/api/proto/Manager;Ljava/lang/Class;Landroid/os/Bundle;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic vv(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/bykv/vk/openvk/api/proto/Manager;

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/api/vv$p$4;->vv(Lcom/bykv/vk/openvk/api/proto/Manager;)V

    return-void
.end method
