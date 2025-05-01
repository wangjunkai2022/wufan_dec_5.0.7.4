.class Lcom/bytedance/sdk/openadsdk/api/vv$p$7;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/api/vv$p;->call(Lcom/bytedance/sdk/openadsdk/api/vv$m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:I

.field final synthetic p:Lcom/bytedance/sdk/openadsdk/api/vv$p;

.field final synthetic vv:Lcom/bytedance/sdk/openadsdk/api/vv$m;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/api/vv$p;Lcom/bytedance/sdk/openadsdk/api/vv$m;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p$7;->p:Lcom/bytedance/sdk/openadsdk/api/vv$p;

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p$7;->vv:Lcom/bytedance/sdk/openadsdk/api/vv$m;

    iput p3, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p$7;->m:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    const-string v0, "_tt_ad_sdk_"

    .line 1
    :try_start_0
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p$7;->p:Lcom/bytedance/sdk/openadsdk/api/vv$p;

    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/api/vv$p;->vv(Lcom/bytedance/sdk/openadsdk/api/vv$p;)Lcom/bykv/vk/openvk/api/proto/Manager;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 2
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p$7;->vv:Lcom/bytedance/sdk/openadsdk/api/vv$m;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p$7;->p:Lcom/bytedance/sdk/openadsdk/api/vv$p;

    invoke-static {v2}, Lcom/bytedance/sdk/openadsdk/api/vv$p;->vv(Lcom/bytedance/sdk/openadsdk/api/vv$p;)Lcom/bykv/vk/openvk/api/proto/Manager;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/bytedance/sdk/openadsdk/api/vv$m;->vv(Ljava/lang/Object;)V

    return-void

    .line 3
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Not ready, no manager: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p$7;->m:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/api/p;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v1

    .line 4
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unexpected manager call error: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/bytedance/sdk/openadsdk/api/p;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv$p$7;->p:Lcom/bytedance/sdk/openadsdk/api/vv$p;

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/api/vv$p;->vv(Ljava/lang/Throwable;)V

    return-void
.end method
