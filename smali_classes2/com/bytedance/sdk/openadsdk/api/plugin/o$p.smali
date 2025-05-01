.class final Lcom/bytedance/sdk/openadsdk/api/plugin/o$p;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/bykv/vk/openvk/api/proto/EventListener;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/openadsdk/api/plugin/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "p"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private vv(Lcom/bytedance/sdk/openadsdk/api/plugin/o$vv;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p1, Lcom/bytedance/pangle/download/PluginDownloadBean;->mPackageName:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p1, p1, Lcom/bytedance/pangle/download/PluginDownloadBean;->mPackageName:Ljava/lang/String;

    const-string v0, "com.byted.pangle"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/TTAppContextHolder;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/api/plugin/o;->vv(Landroid/content/Context;)Lcom/bytedance/sdk/openadsdk/api/plugin/o;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/api/plugin/o;->m()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method


# virtual methods
.method public onEvent(ILcom/bykv/vk/openvk/api/proto/Result;)Lcom/bykv/vk/openvk/api/proto/ValueSet;
    .locals 7

    .line 1
    invoke-static {}, Lcom/bykv/vv/vv/vv/vv/a;->b()Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    const/4 v1, 0x1

    if-ne p1, v1, :cond_5

    const-string p1, "plugin_download"

    const-string v2, "plugin update start"

    .line 2
    invoke-static {p1, v2}, Lcom/bytedance/sdk/openadsdk/api/plugin/m;->vv(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-interface {p2}, Lcom/bykv/vk/openvk/api/proto/Result;->values()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    const-string p2, "valueSet empty"

    .line 4
    invoke-static {p1, p2}, Lcom/bytedance/sdk/openadsdk/api/plugin/m;->vv(Ljava/lang/String;Ljava/lang/String;)V

    return-object v3

    :cond_0
    const/4 v4, 0x3

    .line 5
    invoke-interface {v2, v4}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->stringValue(I)Ljava/lang/String;

    move-result-object v4

    .line 6
    invoke-interface {p2}, Lcom/bykv/vk/openvk/api/proto/Result;->code()I

    move-result v5

    .line 7
    invoke-interface {p2}, Lcom/bykv/vk/openvk/api/proto/Result;->isSuccess()Z

    move-result p2

    const-string v6, "TTPluginManager"

    if-nez p2, :cond_1

    const-string p2, "plugin update received failed"

    .line 8
    invoke-static {p1, p2}, Lcom/bytedance/sdk/openadsdk/api/plugin/m;->vv(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    invoke-static {v6, p2}, Lcom/bytedance/sdk/openadsdk/api/p;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    invoke-static {v4, v5}, Lcom/bytedance/sdk/openadsdk/api/plugin/o;->vv(Ljava/lang/String;I)V

    return-object v3

    :cond_1
    const/4 p2, 0x2

    .line 11
    invoke-interface {v2, p2}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->stringValue(I)Ljava/lang/String;

    move-result-object p2

    .line 12
    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/api/plugin/o;->m(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/api/plugin/o$vv;

    move-result-object p2

    if-eqz p2, :cond_4

    .line 13
    iget-object v2, p2, Lcom/bytedance/pangle/download/PluginDownloadBean;->mPackageName:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    .line 14
    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "plugin update received: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p2, Lcom/bytedance/pangle/download/PluginDownloadBean;->mPackageName:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lcom/bytedance/sdk/openadsdk/api/plugin/m;->vv(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p2, Lcom/bytedance/pangle/download/PluginDownloadBean;->mPackageName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v6, v2}, Lcom/bytedance/sdk/openadsdk/api/p;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    invoke-virtual {p2}, Lcom/bytedance/pangle/download/PluginDownloadBean;->isRevert()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "plugin revert "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p2, Lcom/bytedance/pangle/download/PluginDownloadBean;->mPackageName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/bytedance/sdk/openadsdk/api/plugin/m;->vv(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    iget-object p1, p2, Lcom/bytedance/pangle/download/PluginDownloadBean;->mPackageName:Ljava/lang/String;

    invoke-static {p1}, Lcom/bytedance/pangle/Zeus;->unInstallPlugin(Ljava/lang/String;)V

    goto :goto_1

    .line 19
    :cond_3
    invoke-direct {p0, p2}, Lcom/bytedance/sdk/openadsdk/api/plugin/o$p;->vv(Lcom/bytedance/sdk/openadsdk/api/plugin/o$vv;)V

    const-string v2, "plugin install"

    .line 20
    invoke-static {p1, v2}, Lcom/bytedance/sdk/openadsdk/api/plugin/m;->vv(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/api/plugin/o;->vv(Lcom/bytedance/sdk/openadsdk/api/plugin/o$vv;)Z

    move-result p1

    if-eqz p1, :cond_5

    const/4 p1, 0x4

    .line 22
    invoke-virtual {v0, p1, v1}, Lcom/bykv/vv/vv/vv/vv/a;->j(IZ)Lcom/bykv/vv/vv/vv/vv/a;

    goto :goto_1

    :cond_4
    :goto_0
    const-string p2, "plugin update received with invalid config"

    .line 23
    invoke-static {p1, p2}, Lcom/bytedance/sdk/openadsdk/api/plugin/m;->vv(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    invoke-static {v6, p2}, Lcom/bytedance/sdk/openadsdk/api/p;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-object v3

    .line 25
    :cond_5
    :goto_1
    invoke-virtual {v0}, Lcom/bykv/vv/vv/vv/vv/a;->a()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p1

    return-object p1
.end method
