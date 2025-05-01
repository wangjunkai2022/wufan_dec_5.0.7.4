.class public Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomRewardLoader;
.super Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/reward/MediationCustomRewardVideoLoader;
.source "AMAdapterCustomRewardLoader.java"


# instance fields
.field private amRewardAd:Lcom/aggmoread/sdk/client/reward/AMRewardAd;

.field private mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/reward/MediationCustomRewardVideoLoader;-><init>()V

    return-void
.end method

.method static synthetic access$002(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomRewardLoader;Landroid/content/Context;)Landroid/content/Context;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomRewardLoader;->mContext:Landroid/content/Context;

    return-object p1
.end method

.method static synthetic access$100(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomRewardLoader;Lcom/bytedance/sdk/openadsdk/AdSlot;)Lcom/aggmoread/sdk/client/AMVideoConfigs;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomRewardLoader;->getVideoOptions(Lcom/bytedance/sdk/openadsdk/AdSlot;)Lcom/aggmoread/sdk/client/AMVideoConfigs;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$200(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomRewardLoader;)Lcom/aggmoread/sdk/client/reward/AMRewardAd;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomRewardLoader;->amRewardAd:Lcom/aggmoread/sdk/client/reward/AMRewardAd;

    return-object p0
.end method

.method static synthetic access$202(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomRewardLoader;Lcom/aggmoread/sdk/client/reward/AMRewardAd;)Lcom/aggmoread/sdk/client/reward/AMRewardAd;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomRewardLoader;->amRewardAd:Lcom/aggmoread/sdk/client/reward/AMRewardAd;

    return-object p1
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

    const-string v0, "AMAdapterCustomRewardLoader load Ad enter "

    .line 1
    invoke-static {v0}, Lcom/aggmoread/sdk/adapter/helper/LogHelper;->log(Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomRewardLoader$2;

    invoke-direct {v0, p0, p1, p3, p2}, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomRewardLoader$2;-><init>(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomRewardLoader;Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/mediation/custom/MediationCustomServiceConfig;Lcom/bytedance/sdk/openadsdk/AdSlot;)V

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
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomRewardLoader;->amRewardAd:Lcom/aggmoread/sdk/client/reward/AMRewardAd;

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
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomRewardLoader;->amRewardAd:Lcom/aggmoread/sdk/client/reward/AMRewardAd;

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomRewardLoader$1;

    invoke-direct {v1, p0}, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomRewardLoader$1;-><init>(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomRewardLoader;)V

    invoke-interface {v0, p1, v1}, Lcom/aggmoread/sdk/client/reward/AMRewardAd;->show(Landroid/app/Activity;Lcom/aggmoread/sdk/client/reward/AMRewardInteractionListener;)V

    :cond_0
    return-void
.end method
