.class Lcom/bytedance/sdk/openadsdk/api/vv$p$1;
.super Lcom/bytedance/sdk/openadsdk/api/vv$vv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/api/vv$p;->createAdNative(Landroid/content/Context;)Lcom/bytedance/sdk/openadsdk/TTAdNative;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bytedance/sdk/openadsdk/api/vv$vv<",
        "Lcom/bykv/vk/openvk/api/proto/Loader;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic i:Lcom/bytedance/sdk/openadsdk/api/vv$p;

.field final m:Lcom/bytedance/sdk/openadsdk/api/vv$m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bytedance/sdk/openadsdk/api/vv$m<",
            "Lcom/bykv/vk/openvk/api/proto/Manager;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic p:Ljava/lang/ref/SoftReference;

.field vv:Lcom/bykv/vk/openvk/api/proto/Loader;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/api/vv$p;Ljava/lang/ref/SoftReference;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p$1;->i:Lcom/bytedance/sdk/openadsdk/api/vv$p;

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p$1;->p:Ljava/lang/ref/SoftReference;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/api/vv$vv;-><init>(Lcom/bytedance/sdk/openadsdk/api/vv$1;)V

    .line 2
    new-instance p1, Lcom/bytedance/sdk/openadsdk/api/vv$p$1$1;

    invoke-direct {p1, p0}, Lcom/bytedance/sdk/openadsdk/api/vv$p$1$1;-><init>(Lcom/bytedance/sdk/openadsdk/api/vv$p$1;)V

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p$1;->m:Lcom/bytedance/sdk/openadsdk/api/vv$m;

    return-void
.end method


# virtual methods
.method public vv(Lcom/bytedance/sdk/openadsdk/api/vv$m;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bytedance/sdk/openadsdk/api/vv$m<",
            "Lcom/bykv/vk/openvk/api/proto/Loader;",
            ">;I)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p$1;->vv:Lcom/bykv/vk/openvk/api/proto/Loader;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {p1, v0}, Lcom/bytedance/sdk/openadsdk/api/vv$m;->vv(Ljava/lang/Object;)V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p$1;->i:Lcom/bytedance/sdk/openadsdk/api/vv$p;

    new-instance v1, Lcom/bytedance/sdk/openadsdk/api/vv$p$1$2;

    invoke-direct {v1, p0, p1}, Lcom/bytedance/sdk/openadsdk/api/vv$p$1$2;-><init>(Lcom/bytedance/sdk/openadsdk/api/vv$p$1;Lcom/bytedance/sdk/openadsdk/api/vv$m;)V

    add-int/lit16 p2, p2, 0x2710

    invoke-static {v0, v1, p2}, Lcom/bytedance/sdk/openadsdk/api/vv$p;->vv(Lcom/bytedance/sdk/openadsdk/api/vv$p;Lcom/bytedance/sdk/openadsdk/api/vv$m;I)V

    return-void
.end method
