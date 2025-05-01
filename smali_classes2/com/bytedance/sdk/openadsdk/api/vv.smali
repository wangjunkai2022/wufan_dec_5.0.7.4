.class public abstract Lcom/bytedance/sdk/openadsdk/api/vv;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/api/vv$vv;,
        Lcom/bytedance/sdk/openadsdk/api/vv$m;,
        Lcom/bytedance/sdk/openadsdk/api/vv$o;,
        Lcom/bytedance/sdk/openadsdk/api/vv$p;,
        Lcom/bytedance/sdk/openadsdk/api/vv$i;
    }
.end annotation


# instance fields
.field private vv:Lcom/bytedance/sdk/openadsdk/TTAdSdk$InitCallback;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract m()Lcom/bytedance/sdk/openadsdk/api/vv$p;
.end method

.method public abstract m(Landroid/content/Context;Lcom/bykv/vv/vv/vv/vv/a;)V
.end method

.method protected m(Lcom/bykv/vk/openvk/api/proto/Result;)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/api/vv;->vv(Lcom/bykv/vk/openvk/api/proto/Result;)V

    .line 2
    invoke-interface {p1}, Lcom/bykv/vk/openvk/api/proto/Result;->isSuccess()Z

    move-result v0

    const-string v1, "_tt_ad_sdk_"

    if-eqz v0, :cond_0

    const-string p1, "init sdk success "

    .line 3
    invoke-static {v1, p1}, Lcom/bytedance/sdk/openadsdk/api/p;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/vv;->vv:Lcom/bytedance/sdk/openadsdk/TTAdSdk$InitCallback;

    if-eqz p1, :cond_2

    .line 5
    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/TTAdSdk$InitCallback;->success()V

    goto :goto_1

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "int sdk failed, code: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Lcom/bykv/vk/openvk/api/proto/Result;->code()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", message: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Lcom/bykv/vk/openvk/api/proto/Result;->message()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/bytedance/sdk/openadsdk/api/p;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv;->vv:Lcom/bytedance/sdk/openadsdk/TTAdSdk$InitCallback;

    if-eqz v0, :cond_2

    .line 8
    invoke-interface {p1}, Lcom/bykv/vk/openvk/api/proto/Result;->code()I

    move-result v1

    invoke-interface {p1}, Lcom/bykv/vk/openvk/api/proto/Result;->message()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Lcom/bykv/vk/openvk/api/proto/Result;->message()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    const-string p1, ""

    :goto_0
    invoke-interface {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/TTAdSdk$InitCallback;->fail(ILjava/lang/String;)V

    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/vv;->vv:Lcom/bytedance/sdk/openadsdk/TTAdSdk$InitCallback;

    return-void
.end method

.method protected m(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/AdConfig;Lcom/bytedance/sdk/openadsdk/TTAdSdk$InitCallback;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method protected abstract p()Lcom/bytedance/sdk/openadsdk/vv/m;
.end method

.method public vv(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/AdConfig;Lcom/bytedance/sdk/openadsdk/TTAdSdk$InitCallback;)V
    .locals 4

    .line 1
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/vv/p;->vv()Lcom/bytedance/sdk/openadsdk/vv/p;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv;->p()Lcom/bytedance/sdk/openadsdk/vv/m;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/vv/p;->vv(Lcom/bytedance/sdk/openadsdk/vv/m;)V

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/api/vv;->m(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/AdConfig;Lcom/bytedance/sdk/openadsdk/TTAdSdk$InitCallback;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/api/vv;->vv:Lcom/bytedance/sdk/openadsdk/TTAdSdk$InitCallback;

    .line 4
    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/p/vv/p/vv;->vv(Lcom/bytedance/sdk/openadsdk/AdConfig;)Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p3

    invoke-static {p3}, Lcom/bykv/vv/vv/vv/vv/a;->k(Lcom/bykv/vk/openvk/api/proto/ValueSet;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object p3

    .line 5
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-virtual {p3, v2, v0, v1}, Lcom/bykv/vv/vv/vv/vv/a;->g(IJ)Lcom/bykv/vv/vv/vv/vv/a;

    const/4 v0, 0x5

    const-string v1, "main"

    .line 6
    invoke-virtual {p3, v0, v1}, Lcom/bykv/vv/vv/vv/vv/a;->i(ILjava/lang/String;)Lcom/bykv/vv/vv/vv/vv/a;

    const/4 v0, 0x4

    .line 7
    invoke-virtual {p3, v0, v2}, Lcom/bykv/vv/vv/vv/vv/a;->j(IZ)Lcom/bykv/vv/vv/vv/vv/a;

    const/4 v0, 0x6

    const/16 v1, 0x3e7

    .line 8
    invoke-virtual {p3, v0, v1}, Lcom/bykv/vv/vv/vv/vv/a;->f(II)Lcom/bykv/vv/vv/vv/vv/a;

    const/16 v0, 0xa

    const/16 v1, 0x1849

    .line 9
    invoke-virtual {p3, v0, v1}, Lcom/bykv/vv/vv/vv/vv/a;->f(II)Lcom/bykv/vv/vv/vv/vv/a;

    const/16 v0, 0xb

    const-string v1, "6.2.1.7"

    .line 10
    invoke-virtual {p3, v0, v1}, Lcom/bykv/vv/vv/vv/vv/a;->i(ILjava/lang/String;)Lcom/bykv/vv/vv/vv/vv/a;

    const/16 v0, 0xc

    const-string v1, "com.byted.pangle"

    .line 11
    invoke-virtual {p3, v0, v1}, Lcom/bykv/vv/vv/vv/vv/a;->i(ILjava/lang/String;)Lcom/bykv/vv/vv/vv/vv/a;

    const/16 v0, 0xe

    const/4 v1, 0x0

    .line 12
    invoke-virtual {p3, v0, v1}, Lcom/bykv/vv/vv/vv/vv/a;->j(IZ)Lcom/bykv/vv/vv/vv/vv/a;

    const/16 v0, 0x10

    .line 13
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/vv/p;->vv()Lcom/bytedance/sdk/openadsdk/vv/p;

    move-result-object v1

    invoke-virtual {p3, v0, v1}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    .line 14
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x2

    .line 16
    invoke-virtual {p3, v3, v1}, Lcom/bykv/vv/vv/vv/vv/a;->i(ILjava/lang/String;)Lcom/bykv/vv/vv/vv/vv/a;

    .line 17
    invoke-virtual {v0}, Ljava/lang/Thread;->getPriority()I

    move-result v0

    const/4 v1, 0x3

    .line 18
    invoke-virtual {p3, v1, v0}, Lcom/bykv/vv/vv/vv/vv/a;->f(II)Lcom/bykv/vv/vv/vv/vv/a;

    const/16 v0, 0xf

    .line 19
    new-instance v1, Lcom/bytedance/sdk/openadsdk/api/vv$i;

    const/4 v3, 0x0

    invoke-direct {v1, p0, v3}, Lcom/bytedance/sdk/openadsdk/api/vv$i;-><init>(Lcom/bytedance/sdk/openadsdk/api/vv;Lcom/bytedance/sdk/openadsdk/api/vv$1;)V

    invoke-virtual {p3, v0, v1}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    const/16 v0, 0x206d

    .line 20
    new-instance v1, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitCLassLoader;

    invoke-direct {v1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/init/MediationInitCLassLoader;-><init>()V

    invoke-virtual {p3, v0, v1}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    .line 21
    instance-of v0, p2, Lcom/bytedance/sdk/openadsdk/TTAdConfig;

    if-eqz v0, :cond_1

    .line 22
    move-object v0, p2

    check-cast v0, Lcom/bytedance/sdk/openadsdk/TTAdConfig;

    const/16 v1, 0x207e

    .line 23
    new-instance v3, Lcom/bytedance/sdk/openadsdk/mediation/MediationTTLiveTokenInjectionAuthImpl;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/TTAdConfig;->getInjectionAuth()Lcom/bytedance/sdk/openadsdk/live/ITTLiveTokenInjectionAuth;

    move-result-object v0

    invoke-direct {v3, v0}, Lcom/bytedance/sdk/openadsdk/mediation/MediationTTLiveTokenInjectionAuthImpl;-><init>(Lcom/bytedance/sdk/openadsdk/live/ITTLiveTokenInjectionAuth;)V

    invoke-virtual {p3, v1, v3}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    :cond_1
    if-eqz p2, :cond_2

    .line 24
    invoke-interface {p2}, Lcom/bytedance/sdk/openadsdk/AdConfig;->isDebug()Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/mediation/MediationApiLog;->setDebug(Ljava/lang/Boolean;)V

    .line 25
    :cond_2
    invoke-virtual {p0, p1, p3}, Lcom/bytedance/sdk/openadsdk/api/vv;->vv(Landroid/content/Context;Lcom/bykv/vv/vv/vv/vv/a;)Z

    move-result p2

    if-nez p2, :cond_3

    .line 26
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/o/vv;->vv()Lcom/bytedance/sdk/openadsdk/o/vv;

    move-result-object p2

    new-instance v0, Lcom/bytedance/sdk/openadsdk/api/vv$1;

    invoke-direct {v0, p0, p1, p3}, Lcom/bytedance/sdk/openadsdk/api/vv$1;-><init>(Lcom/bytedance/sdk/openadsdk/api/vv;Landroid/content/Context;Lcom/bykv/vv/vv/vv/vv/a;)V

    invoke-virtual {p2, v0}, Lcom/bytedance/sdk/openadsdk/o/vv;->vv(Ljava/lang/Runnable;)V

    .line 27
    :cond_3
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv;->m()Lcom/bytedance/sdk/openadsdk/api/vv$p;

    move-result-object p1

    .line 28
    invoke-virtual {p1, v2}, Lcom/bytedance/sdk/openadsdk/api/vv$p;->vv(Z)V

    return-void
.end method

.method protected vv(Lcom/bykv/vk/openvk/api/proto/Manager;)V
    .locals 2

    const-string v0, "_tt_ad_sdk_"

    const-string v1, "update manager"

    .line 29
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/api/p;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv;->m()Lcom/bytedance/sdk/openadsdk/api/vv$p;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/bytedance/sdk/openadsdk/api/vv$p;->vv(Lcom/bytedance/sdk/openadsdk/api/vv$p;Lcom/bykv/vk/openvk/api/proto/Manager;)V

    .line 31
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv;->m()Lcom/bytedance/sdk/openadsdk/api/vv$p;

    move-result-object p1

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/vv/p;->vv()Lcom/bytedance/sdk/openadsdk/vv/p;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/api/vv$p;->register(Ljava/lang/Object;)V

    return-void
.end method

.method protected vv(Lcom/bykv/vk/openvk/api/proto/Result;)V
    .locals 0

    return-void
.end method

.method public abstract vv()Z
.end method

.method public abstract vv(Landroid/content/Context;Lcom/bykv/vv/vv/vv/vv/a;)Z
.end method
