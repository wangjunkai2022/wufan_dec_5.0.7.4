.class public Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader;
.super Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/splash/MediationCustomSplashLoader;
.source "AMAdapterCustomSplashLoader.java"


# instance fields
.field private amSplashAd:Lcom/aggmoread/sdk/client/splash/AMSplashAd;

.field private mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/splash/MediationCustomSplashLoader;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader;)Lcom/aggmoread/sdk/client/splash/AMSplashAd;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader;->amSplashAd:Lcom/aggmoread/sdk/client/splash/AMSplashAd;

    return-object p0
.end method

.method static synthetic access$002(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader;Lcom/aggmoread/sdk/client/splash/AMSplashAd;)Lcom/aggmoread/sdk/client/splash/AMSplashAd;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader;->amSplashAd:Lcom/aggmoread/sdk/client/splash/AMSplashAd;

    return-object p1
.end method

.method static synthetic access$102(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader;Landroid/content/Context;)Landroid/content/Context;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader;->mContext:Landroid/content/Context;

    return-object p1
.end method


# virtual methods
.method public load(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/mediation/custom/MediationCustomServiceConfig;)V
    .locals 0

    const-string p2, "AdapterCustomSplashLoader load Ad enter "

    .line 1
    invoke-static {p2}, Lcom/aggmoread/sdk/adapter/helper/LogHelper;->log(Ljava/lang/String;)V

    .line 2
    new-instance p2, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$2;

    invoke-direct {p2, p0, p1, p3}, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$2;-><init>(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader;Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/mediation/custom/MediationCustomServiceConfig;)V

    invoke-static {p2}, Lcom/aggmoread/sdk/adapter/helper/ThreadHelper;->runInWorkerThread(Ljava/lang/Runnable;)Z

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
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader;->amSplashAd:Lcom/aggmoread/sdk/client/splash/AMSplashAd;

    invoke-static {v0, p1, p2, p3, p4}, Lcom/aggmoread/sdk/adapter/helper/AdapterHelper;->notifyBidResult(Lcom/aggmoread/sdk/client/AMAdInterface;ZDI)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-super/range {p0 .. p5}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/MediationCustomAdBaseLoader;->receiveBidResult(ZDILjava/util/Map;)V

    :cond_0
    return-void
.end method

.method public showAd(Landroid/view/ViewGroup;)V
    .locals 1

    const-string v0, "AdapterCustomSplashLoader show Ad enter "

    .line 1
    invoke-static {v0}, Lcom/aggmoread/sdk/adapter/helper/LogHelper;->log(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 2
    new-instance v0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$1;

    invoke-direct {v0, p0, p1}, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$1;-><init>(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader;Landroid/view/ViewGroup;)V

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method
