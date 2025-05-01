.class Lcom/bytedance/sdk/openadsdk/api/vv$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/api/vv;->vv(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/AdConfig;Lcom/bytedance/sdk/openadsdk/TTAdSdk$InitCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/bykv/vv/vv/vv/vv/a;

.field final synthetic p:Lcom/bytedance/sdk/openadsdk/api/vv;

.field final synthetic vv:Landroid/content/Context;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/api/vv;Landroid/content/Context;Lcom/bykv/vv/vv/vv/vv/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/vv$1;->p:Lcom/bytedance/sdk/openadsdk/api/vv;

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/api/vv$1;->vv:Landroid/content/Context;

    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/api/vv$1;->m:Lcom/bykv/vv/vv/vv/vv/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv$1;->p:Lcom/bytedance/sdk/openadsdk/api/vv;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/api/vv$1;->vv:Landroid/content/Context;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/api/vv$1;->m:Lcom/bykv/vv/vv/vv/vv/a;

    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/api/vv;->m(Landroid/content/Context;Lcom/bykv/vv/vv/vv/vv/a;)V

    return-void
.end method
