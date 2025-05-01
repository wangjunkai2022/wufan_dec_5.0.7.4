.class public Lcom/bytedance/sdk/openadsdk/p/vv/p/vv;
.super Ljava/lang/Object;


# direct methods
.method public static final vv(Lcom/bytedance/sdk/openadsdk/AdConfig;)Lcom/bykv/vk/openvk/api/proto/ValueSet;
    .locals 4

    .line 1
    invoke-static {}, Lcom/bykv/vv/vv/vv/vv/a;->b()Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    const/4 v1, 0x0

    if-nez p0, :cond_0

    return-object v1

    :cond_0
    const v2, 0x3fb89

    .line 2
    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/AdConfig;->getAppId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/bykv/vv/vv/vv/vv/a;->i(ILjava/lang/String;)Lcom/bykv/vv/vv/vv/vv/a;

    const v2, 0x3fb8a

    .line 3
    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/AdConfig;->getAppName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/bykv/vv/vv/vv/vv/a;->i(ILjava/lang/String;)Lcom/bykv/vv/vv/vv/vv/a;

    const v2, 0x3fb8b

    .line 4
    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/AdConfig;->isPaid()Z

    move-result v3

    invoke-virtual {v0, v2, v3}, Lcom/bykv/vv/vv/vv/vv/a;->j(IZ)Lcom/bykv/vv/vv/vv/vv/a;

    const v2, 0x3fb8c

    .line 5
    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/AdConfig;->getKeywords()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/bykv/vv/vv/vv/vv/a;->i(ILjava/lang/String;)Lcom/bykv/vv/vv/vv/vv/a;

    const v2, 0x3fb8d

    .line 6
    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/AdConfig;->getData()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/bykv/vv/vv/vv/vv/a;->i(ILjava/lang/String;)Lcom/bykv/vv/vv/vv/vv/a;

    const v2, 0x3fb8e

    .line 7
    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/AdConfig;->getTitleBarTheme()I

    move-result v3

    invoke-virtual {v0, v2, v3}, Lcom/bykv/vv/vv/vv/vv/a;->f(II)Lcom/bykv/vv/vv/vv/vv/a;

    const v2, 0x3fb8f

    .line 8
    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/AdConfig;->isAllowShowNotify()Z

    move-result v3

    invoke-virtual {v0, v2, v3}, Lcom/bykv/vv/vv/vv/vv/a;->j(IZ)Lcom/bykv/vv/vv/vv/vv/a;

    const v2, 0x3fb90

    .line 9
    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/AdConfig;->isDebug()Z

    move-result v3

    invoke-virtual {v0, v2, v3}, Lcom/bykv/vv/vv/vv/vv/a;->j(IZ)Lcom/bykv/vv/vv/vv/vv/a;

    const v2, 0x3fb91

    .line 10
    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/AdConfig;->getDirectDownloadNetworkType()[I

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    const v2, 0x3fb93

    .line 11
    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/AdConfig;->isSupportMultiProcess()Z

    move-result v3

    invoke-virtual {v0, v2, v3}, Lcom/bykv/vv/vv/vv/vv/a;->j(IZ)Lcom/bykv/vv/vv/vv/vv/a;

    const v2, 0x3fb94

    .line 12
    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/AdConfig;->getCustomController()Lcom/bytedance/sdk/openadsdk/TTCustomController;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/AdConfig;->getCustomController()Lcom/bytedance/sdk/openadsdk/TTCustomController;

    move-result-object v3

    invoke-static {v3}, Lcom/bytedance/sdk/openadsdk/p/vv/p/i;->vv(Lcom/bytedance/sdk/openadsdk/TTCustomController;)Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v3

    goto :goto_0

    :cond_1
    move-object v3, v1

    :goto_0
    invoke-virtual {v0, v2, v3}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    const v2, 0x3fb95

    .line 13
    new-instance v3, Lcom/bytedance/sdk/openadsdk/p/vv/p/vv$1;

    invoke-direct {v3, p0}, Lcom/bytedance/sdk/openadsdk/p/vv/p/vv$1;-><init>(Lcom/bytedance/sdk/openadsdk/AdConfig;)V

    invoke-virtual {v0, v2, v3}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    const v2, 0x3fb96

    .line 14
    new-instance v3, Lcom/bytedance/sdk/openadsdk/p/vv/p/vv$2;

    invoke-direct {v3, p0}, Lcom/bytedance/sdk/openadsdk/p/vv/p/vv$2;-><init>(Lcom/bytedance/sdk/openadsdk/AdConfig;)V

    invoke-virtual {v0, v2, v3}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    const v2, 0x3fb97

    .line 15
    new-instance v3, Lcom/bytedance/sdk/openadsdk/p/vv/p/vv$3;

    invoke-direct {v3, p0}, Lcom/bytedance/sdk/openadsdk/p/vv/p/vv$3;-><init>(Lcom/bytedance/sdk/openadsdk/AdConfig;)V

    invoke-virtual {v0, v2, v3}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    const v2, 0x3fb98

    .line 16
    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/AdConfig;->getMediationConfig()Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/AdConfig;->getMediationConfig()Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;

    move-result-object v1

    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/mediation/init/vv/vv/vv/vv;->vv(Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;)Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v1

    :cond_2
    invoke-virtual {v0, v2, v1}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    const v1, 0x3fb99

    .line 17
    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/AdConfig;->isUseMediation()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/bykv/vv/vv/vv/vv/a;->j(IZ)Lcom/bykv/vv/vv/vv/vv/a;

    const v1, 0x3fb9a

    .line 18
    new-instance v2, Lcom/bytedance/sdk/openadsdk/p/vv/p/vv$4;

    invoke-direct {v2, p0}, Lcom/bytedance/sdk/openadsdk/p/vv/p/vv$4;-><init>(Lcom/bytedance/sdk/openadsdk/AdConfig;)V

    invoke-virtual {v0, v1, v2}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    .line 19
    invoke-virtual {v0}, Lcom/bykv/vv/vv/vv/vv/a;->a()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p0

    return-object p0
.end method
