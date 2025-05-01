.class public Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader;
.super Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/fullvideo/MediationCustomFullVideoLoader;
.source "AMAdapterCustomFullVideoLoader.java"


# instance fields
.field private amFullScreenAd:Lcom/aggmoread/sdk/client/fullscreen/AMFullScreenAd;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/fullvideo/MediationCustomFullVideoLoader;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader;)Lcom/aggmoread/sdk/client/AMRewardAdConfig;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader;->getRewardAdConfig()Lcom/aggmoread/sdk/client/AMRewardAdConfig;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$100(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader;Lcom/bytedance/sdk/openadsdk/AdSlot;)Lcom/aggmoread/sdk/client/AMVideoConfigs;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader;->getVideoOptions(Lcom/bytedance/sdk/openadsdk/AdSlot;)Lcom/aggmoread/sdk/client/AMVideoConfigs;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$200(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader;)Lcom/aggmoread/sdk/client/fullscreen/AMFullScreenAd;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader;->amFullScreenAd:Lcom/aggmoread/sdk/client/fullscreen/AMFullScreenAd;

    return-object p0
.end method

.method static synthetic access$202(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader;Lcom/aggmoread/sdk/client/fullscreen/AMFullScreenAd;)Lcom/aggmoread/sdk/client/fullscreen/AMFullScreenAd;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader;->amFullScreenAd:Lcom/aggmoread/sdk/client/fullscreen/AMFullScreenAd;

    return-object p1
.end method

.method private getRewardAdConfig()Lcom/aggmoread/sdk/client/AMRewardAdConfig;
    .locals 2

    .line 1
    new-instance v0, Lcom/aggmoread/sdk/client/AMRewardAdConfig;

    invoke-direct {v0}, Lcom/aggmoread/sdk/client/AMRewardAdConfig;-><init>()V

    .line 2
    new-instance v1, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader$3;

    invoke-direct {v1, p0}, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader$3;-><init>(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader;)V

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/client/AMRewardAdConfig;->setRewardAdListener(Lcom/aggmoread/sdk/client/AMRewardAdConfig$RewardListener;)V

    return-object v0
.end method

.method private getVideoOptions(Lcom/bytedance/sdk/openadsdk/AdSlot;)Lcom/aggmoread/sdk/client/AMVideoConfigs;
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/aggmoread/sdk/adapter/helper/AdapterHelper;->getVideoOptions(Lcom/bytedance/sdk/openadsdk/AdSlot;)Lcom/aggmoread/sdk/client/AMVideoConfigs;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public load(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/mediation/custom/MediationCustomServiceConfig;)V
    .locals 1

    const-string v0, "AMAdapterCustomFullVideoLoader load Ad enter "

    .line 1
    invoke-static {v0}, Lcom/aggmoread/sdk/adapter/helper/LogHelper;->log(Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader$2;

    invoke-direct {v0, p0, p3, p2, p1}, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader$2;-><init>(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader;Lcom/bytedance/sdk/openadsdk/mediation/custom/MediationCustomServiceConfig;Lcom/bytedance/sdk/openadsdk/AdSlot;Landroid/content/Context;)V

    invoke-static {v0}, Lcom/aggmoread/sdk/adapter/helper/ThreadHelper;->runInWorkerThread(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public receiveBidResult(ZDILjava/util/Map;)V
    .locals 1
    .param p5    # Ljava/util/Map;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZDI",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader;->amFullScreenAd:Lcom/aggmoread/sdk/client/fullscreen/AMFullScreenAd;

    invoke-static {v0, p1, p2, p3, p4}, Lcom/aggmoread/sdk/adapter/helper/AdapterHelper;->notifyBidResult(Lcom/aggmoread/sdk/client/AMAdInterface;ZDI)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-super/range {p0 .. p5}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/MediationCustomAdBaseLoader;->receiveBidResult(ZDILjava/util/Map;)V

    :cond_0
    return-void
.end method

.method public showAd(Landroid/app/Activity;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader;->amFullScreenAd:Lcom/aggmoread/sdk/client/fullscreen/AMFullScreenAd;

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader$1;

    invoke-direct {v1, p0}, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader$1;-><init>(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFullVideoLoader;)V

    invoke-interface {v0, p1, v1}, Lcom/aggmoread/sdk/client/fullscreen/AMFullScreenAd;->show(Landroid/app/Activity;Lcom/aggmoread/sdk/client/fullscreen/AMFullScreenAdInteractionListener;)V

    :cond_0
    return-void
.end method
