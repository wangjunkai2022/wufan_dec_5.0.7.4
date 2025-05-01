.class Lcom/bytedance/sdk/openadsdk/api/plugin/u$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/vv/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/openadsdk/api/plugin/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic vv:Lcom/bytedance/sdk/openadsdk/api/plugin/u;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/api/plugin/u;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/u$1;->vv:Lcom/bytedance/sdk/openadsdk/api/plugin/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public vv(I)Lcom/bykv/vk/openvk/api/proto/Bridge;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/u$1;->vv:Lcom/bytedance/sdk/openadsdk/api/plugin/u;

    invoke-static {v0, p1}, Lcom/bytedance/sdk/openadsdk/api/plugin/u;->vv(Lcom/bytedance/sdk/openadsdk/api/plugin/u;I)Lcom/bykv/vk/openvk/api/proto/Bridge;

    move-result-object p1

    return-object p1
.end method
