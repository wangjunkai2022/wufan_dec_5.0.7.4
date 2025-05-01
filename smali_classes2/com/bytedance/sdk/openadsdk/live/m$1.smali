.class Lcom/bytedance/sdk/openadsdk/live/m$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/bytedance/android/live/base/api/MethodChannelService;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/live/m;->m(Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic vv:Lcom/bytedance/sdk/openadsdk/live/m;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/live/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/live/m$1;->vv:Lcom/bytedance/sdk/openadsdk/live/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public identity()Ljava/lang/String;
    .locals 1

    const-string v0, "pangle"

    return-object v0
.end method

.method public invokeMethod(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/live/m$1;->vv:Lcom/bytedance/sdk/openadsdk/live/m;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/live/m;->vv(Lcom/bytedance/sdk/openadsdk/live/m;)Lcom/bykv/vk/openvk/api/proto/Bridge;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/live/m$1;->vv:Lcom/bytedance/sdk/openadsdk/live/m;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/live/m;->vv(Lcom/bytedance/sdk/openadsdk/live/m;)Lcom/bykv/vk/openvk/api/proto/Bridge;

    move-result-object v0

    .line 3
    invoke-static {}, Lcom/bykv/vv/vv/vv/vv/a;->b()Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2, p1}, Lcom/bykv/vv/vv/vv/vv/a;->i(ILjava/lang/String;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object p1

    const/4 v1, 0x1

    .line 4
    invoke-virtual {p1, v1, p2}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bykv/vv/vv/vv/vv/a;->a()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p1

    const-class p2, Ljava/lang/Object;

    .line 5
    invoke-interface {v0, v2, p1, p2}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
