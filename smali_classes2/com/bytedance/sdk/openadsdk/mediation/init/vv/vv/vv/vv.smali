.class public Lcom/bytedance/sdk/openadsdk/mediation/init/vv/vv/vv/vv;
.super Ljava/lang/Object;


# direct methods
.method public static final vv(Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;)Lcom/bykv/vk/openvk/api/proto/ValueSet;
    .locals 4

    .line 1
    invoke-static {}, Lcom/bykv/vv/vv/vv/vv/a;->b()Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    const/4 v1, 0x0

    if-nez p0, :cond_0

    return-object v1

    :cond_0
    const v2, 0x407a5

    .line 2
    new-instance v3, Lcom/bytedance/sdk/openadsdk/mediation/init/vv/vv/vv/vv$1;

    invoke-direct {v3, p0}, Lcom/bytedance/sdk/openadsdk/mediation/init/vv/vv/vv/vv$1;-><init>(Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;)V

    invoke-virtual {v0, v2, v3}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    const v2, 0x407a6

    .line 3
    new-instance v3, Lcom/bytedance/sdk/openadsdk/mediation/init/vv/vv/vv/vv$3;

    invoke-direct {v3, p0}, Lcom/bytedance/sdk/openadsdk/mediation/init/vv/vv/vv/vv$3;-><init>(Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;)V

    invoke-virtual {v0, v2, v3}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    const v2, 0x407a7

    .line 4
    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;->getMediationConfigUserInfoForSegment()Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfigUserInfoForSegment;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;->getMediationConfigUserInfoForSegment()Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfigUserInfoForSegment;

    move-result-object v1

    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/mediation/init/vv/vv/vv/p;->vv(Lcom/bytedance/sdk/openadsdk/mediation/init/MediationConfigUserInfoForSegment;)Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v1

    :cond_1
    invoke-virtual {v0, v2, v1}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    const v1, 0x407a8

    .line 5
    new-instance v2, Lcom/bytedance/sdk/openadsdk/mediation/init/vv/vv/vv/vv$4;

    invoke-direct {v2, p0}, Lcom/bytedance/sdk/openadsdk/mediation/init/vv/vv/vv/vv$4;-><init>(Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;)V

    invoke-virtual {v0, v1, v2}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    const v1, 0x407a9

    .line 6
    new-instance v2, Lcom/bytedance/sdk/openadsdk/mediation/init/vv/vv/vv/vv$5;

    invoke-direct {v2, p0}, Lcom/bytedance/sdk/openadsdk/mediation/init/vv/vv/vv/vv$5;-><init>(Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;)V

    invoke-virtual {v0, v1, v2}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    const v1, 0x407aa

    .line 7
    new-instance v2, Lcom/bytedance/sdk/openadsdk/mediation/init/vv/vv/vv/vv$6;

    invoke-direct {v2, p0}, Lcom/bytedance/sdk/openadsdk/mediation/init/vv/vv/vv/vv$6;-><init>(Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;)V

    invoke-virtual {v0, v1, v2}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    const v1, 0x407ab

    .line 8
    new-instance v2, Lcom/bytedance/sdk/openadsdk/mediation/init/vv/vv/vv/vv$7;

    invoke-direct {v2, p0}, Lcom/bytedance/sdk/openadsdk/mediation/init/vv/vv/vv/vv$7;-><init>(Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;)V

    invoke-virtual {v0, v1, v2}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    const v1, 0x407ac

    .line 9
    new-instance v2, Lcom/bytedance/sdk/openadsdk/mediation/init/vv/vv/vv/vv$8;

    invoke-direct {v2, p0}, Lcom/bytedance/sdk/openadsdk/mediation/init/vv/vv/vv/vv$8;-><init>(Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;)V

    invoke-virtual {v0, v1, v2}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    const v1, 0x407ad

    .line 10
    new-instance v2, Lcom/bytedance/sdk/openadsdk/mediation/init/vv/vv/vv/vv$9;

    invoke-direct {v2, p0}, Lcom/bytedance/sdk/openadsdk/mediation/init/vv/vv/vv/vv$9;-><init>(Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;)V

    invoke-virtual {v0, v1, v2}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    const v1, 0x407ae

    .line 11
    new-instance v2, Lcom/bytedance/sdk/openadsdk/mediation/init/vv/vv/vv/vv$10;

    invoke-direct {v2, p0}, Lcom/bytedance/sdk/openadsdk/mediation/init/vv/vv/vv/vv$10;-><init>(Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;)V

    invoke-virtual {v0, v1, v2}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    const v1, 0x407af

    .line 12
    new-instance v2, Lcom/bytedance/sdk/openadsdk/mediation/init/vv/vv/vv/vv$2;

    invoke-direct {v2, p0}, Lcom/bytedance/sdk/openadsdk/mediation/init/vv/vv/vv/vv$2;-><init>(Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;)V

    invoke-virtual {v0, v1, v2}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    .line 13
    invoke-virtual {v0}, Lcom/bykv/vv/vv/vv/vv/a;->a()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p0

    return-object p0
.end method
