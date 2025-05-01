.class public Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/openadsdk/TTAdConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private m:Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;

.field private vv:Lcom/bytedance/sdk/openadsdk/live/ITTLiveTokenInjectionAuth;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;

    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;-><init>()V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;->m:Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;

    return-void
.end method


# virtual methods
.method public addExtra(Ljava/lang/String;Ljava/lang/Object;)Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;->m:Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;

    invoke-virtual {v0, p1, p2}, Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;->vv(Ljava/lang/String;Ljava/lang/Object;)Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;

    return-object p0
.end method

.method public allowShowNotify(Z)Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;->m:Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;->m(Z)Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;

    return-object p0
.end method

.method public appId(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;->m:Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;->vv(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;

    return-object p0
.end method

.method public appName(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;->m:Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;->m(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;

    return-object p0
.end method

.method public build()Lcom/bytedance/sdk/openadsdk/TTAdConfig;
    .locals 3

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/TTAdConfig;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;->m:Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/TTAdConfig;-><init>(Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;Lcom/bytedance/sdk/openadsdk/TTAdConfig$1;)V

    .line 2
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;->vv:Lcom/bytedance/sdk/openadsdk/live/ITTLiveTokenInjectionAuth;

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/TTAdConfig;->setInjectionAuth(Lcom/bytedance/sdk/openadsdk/live/ITTLiveTokenInjectionAuth;)V

    return-object v0
.end method

.method public customController(Lcom/bytedance/sdk/openadsdk/TTCustomController;)Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;->m:Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;->vv(Lcom/bytedance/sdk/openadsdk/TTCustomController;)Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;

    return-object p0
.end method

.method public data(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;->m:Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;->i(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;

    return-object p0
.end method

.method public debug(Z)Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;->m:Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;->p(Z)Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;

    return-object p0
.end method

.method public varargs directDownloadNetworkType([I)Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;->m:Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;->vv([I)Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;

    return-object p0
.end method

.method public injectionAuth(Lcom/bytedance/sdk/openadsdk/live/ITTLiveTokenInjectionAuth;)Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;->vv:Lcom/bytedance/sdk/openadsdk/live/ITTLiveTokenInjectionAuth;

    return-object p0
.end method

.method public keywords(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;->m:Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;->p(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;

    return-object p0
.end method

.method public paid(Z)Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;->m:Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;->vv(Z)Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;

    return-object p0
.end method

.method public setAgeGroup(I)Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;->m:Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;->i(I)Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;

    return-object p0
.end method

.method public setMediationConfig(Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;)Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;->m:Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;->vv(Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationConfig;)Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;

    return-object p0
.end method

.method public setPluginUpdateConfig(I)Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;->m:Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;->p(I)Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;

    return-object p0
.end method

.method public supportMultiProcess(Z)Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;->m:Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;->i(Z)Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;

    return-object p0
.end method

.method public themeStatus(I)Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;->m:Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;->m(I)Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;

    return-object p0
.end method

.method public titleBarTheme(I)Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;->m:Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;->vv(I)Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;

    return-object p0
.end method

.method public useMediation(Z)Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;->m:Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;->o(Z)Lcom/bytedance/sdk/openadsdk/CSJConfig$vv;

    return-object p0
.end method
