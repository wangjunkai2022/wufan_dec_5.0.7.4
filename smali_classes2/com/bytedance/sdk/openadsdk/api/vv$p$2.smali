.class Lcom/bytedance/sdk/openadsdk/api/vv$p$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/api/vv$m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/api/vv$p;->register(Ljava/lang/Object;)V
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
.field final synthetic m:Lcom/bytedance/sdk/openadsdk/api/vv$p;

.field final synthetic vv:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/api/vv$p;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p$2;->m:Lcom/bytedance/sdk/openadsdk/api/vv$p;

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p$2;->vv:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public vv(Lcom/bykv/vk/openvk/api/proto/Manager;)V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p$2;->m:Lcom/bytedance/sdk/openadsdk/api/vv$p;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p$2;->vv:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/api/vv$p;->vv(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    .line 3
    invoke-static {v1}, Lcom/bykv/vv/vv/vv/vv/a;->c(I)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v2

    const/16 v3, 0x8

    invoke-virtual {v2, v3, v0}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bykv/vv/vv/vv/vv/a;->a()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v0

    .line 4
    invoke-interface {p1, v1}, Lcom/bykv/vk/openvk/api/proto/Manager;->getBridge(I)Lcom/bykv/vk/openvk/api/proto/Bridge;

    move-result-object p1

    const-class v1, Ljava/lang/Void;

    const/4 v2, 0x4

    invoke-interface {p1, v2, v0, v1}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic vv(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/bykv/vk/openvk/api/proto/Manager;

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/api/vv$p$2;->vv(Lcom/bykv/vk/openvk/api/proto/Manager;)V

    return-void
.end method
