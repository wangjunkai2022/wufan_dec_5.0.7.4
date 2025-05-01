.class Lcom/bytedance/sdk/openadsdk/api/vv$i;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/bykv/vk/openvk/api/proto/EventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/openadsdk/api/vv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "i"
.end annotation


# instance fields
.field final synthetic vv:Lcom/bytedance/sdk/openadsdk/api/vv;


# direct methods
.method private constructor <init>(Lcom/bytedance/sdk/openadsdk/api/vv;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/vv$i;->vv:Lcom/bytedance/sdk/openadsdk/api/vv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/bytedance/sdk/openadsdk/api/vv;Lcom/bytedance/sdk/openadsdk/api/vv$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/api/vv$i;-><init>(Lcom/bytedance/sdk/openadsdk/api/vv;)V

    return-void
.end method


# virtual methods
.method public onEvent(ILcom/bykv/vk/openvk/api/proto/Result;)Lcom/bykv/vk/openvk/api/proto/ValueSet;
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/vv$i;->vv:Lcom/bytedance/sdk/openadsdk/api/vv;

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/api/vv;->m(Lcom/bykv/vk/openvk/api/proto/Result;)V

    const/4 p1, 0x0

    return-object p1
.end method
