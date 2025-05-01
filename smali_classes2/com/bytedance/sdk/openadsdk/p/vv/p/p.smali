.class public Lcom/bytedance/sdk/openadsdk/p/vv/p/p;
.super Ljava/lang/Object;


# direct methods
.method public static final vv(Lcom/bytedance/sdk/openadsdk/LocationProvider;)Lcom/bykv/vk/openvk/api/proto/ValueSet;
    .locals 4

    .line 1
    invoke-static {}, Lcom/bykv/vv/vv/vv/vv/a;->b()Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const v1, 0x3ff71

    .line 2
    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/LocationProvider;->getLatitude()D

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/bykv/vv/vv/vv/vv/a;->d(ID)Lcom/bykv/vv/vv/vv/vv/a;

    const v1, 0x3ff72

    .line 3
    invoke-interface {p0}, Lcom/bytedance/sdk/openadsdk/LocationProvider;->getLongitude()D

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/bykv/vv/vv/vv/vv/a;->d(ID)Lcom/bykv/vv/vv/vv/vv/a;

    .line 4
    invoke-virtual {v0}, Lcom/bykv/vv/vv/vv/vv/a;->a()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p0

    return-object p0
.end method
