.class Lcom/bytedance/sdk/openadsdk/api/plugin/o$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/bytedance/pangle/ZeusPluginInstallListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/api/plugin/o;->m(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic vv:Lcom/bytedance/sdk/openadsdk/api/plugin/o;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/api/plugin/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/o$3;->vv:Lcom/bytedance/sdk/openadsdk/api/plugin/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPluginInstall(Ljava/lang/String;ILjava/lang/String;)V
    .locals 1

    const/4 p3, 0x7

    if-ne p2, p3, :cond_0

    .line 1
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/o$3;->vv:Lcom/bytedance/sdk/openadsdk/api/plugin/o;

    invoke-static {p3, p1, p2}, Lcom/bytedance/sdk/openadsdk/api/plugin/o;->vv(Lcom/bytedance/sdk/openadsdk/api/plugin/o;Ljava/lang/String;I)V

    return-void

    :cond_0
    const/4 p3, 0x6

    if-ne p2, p3, :cond_2

    .line 2
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/o$3;->vv:Lcom/bytedance/sdk/openadsdk/api/plugin/o;

    invoke-static {p3, p1, p2}, Lcom/bytedance/sdk/openadsdk/api/plugin/o;->vv(Lcom/bytedance/sdk/openadsdk/api/plugin/o;Ljava/lang/String;I)V

    .line 3
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/o$3;->vv:Lcom/bytedance/sdk/openadsdk/api/plugin/o;

    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/api/plugin/o;->m(Lcom/bytedance/sdk/openadsdk/api/plugin/o;)Lcom/bykv/vk/openvk/api/proto/EventListener;

    move-result-object p2

    if-eqz p2, :cond_1

    const-string p2, "com.byted.pangle"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 4
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/o$3;->vv:Lcom/bytedance/sdk/openadsdk/api/plugin/o;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/api/plugin/o;->m(Lcom/bytedance/sdk/openadsdk/api/plugin/o;)Lcom/bykv/vk/openvk/api/proto/EventListener;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {}, Lcom/bykv/vv/vv/vv/vv/b;->b()Lcom/bykv/vv/vv/vv/vv/b;

    move-result-object p3

    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Lcom/bykv/vv/vv/vv/vv/b;->f(Z)Lcom/bykv/vv/vv/vv/vv/b;

    move-result-object p3

    invoke-virtual {p3}, Lcom/bykv/vv/vv/vv/vv/b;->a()Lcom/bykv/vk/openvk/api/proto/Result;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Lcom/bykv/vk/openvk/api/proto/EventListener;->onEvent(ILcom/bykv/vk/openvk/api/proto/Result;)Lcom/bykv/vk/openvk/api/proto/ValueSet;

    return-void

    :cond_1
    const-string p1, "TTPluginManager"

    const-string p2, "no main pl"

    .line 5
    invoke-static {p1, p2}, Lcom/bytedance/sdk/openadsdk/api/p;->m(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method
