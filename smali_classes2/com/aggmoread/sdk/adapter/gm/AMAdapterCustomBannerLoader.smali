.class public Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomBannerLoader;
.super Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/banner/MediationCustomBannerLoader;
.source "AMAdapterCustomBannerLoader.java"


# instance fields
.field private amBannerAd:Lcom/aggmoread/sdk/client/banner/AMBannerAd;

.field private amBannerContainer:Landroid/view/ViewGroup;

.field private mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/banner/MediationCustomBannerLoader;-><init>()V

    return-void
.end method

.method static synthetic access$002(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomBannerLoader;Landroid/content/Context;)Landroid/content/Context;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomBannerLoader;->mContext:Landroid/content/Context;

    return-object p1
.end method

.method static synthetic access$100(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomBannerLoader;)Lcom/aggmoread/sdk/client/banner/AMBannerAd;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomBannerLoader;->amBannerAd:Lcom/aggmoread/sdk/client/banner/AMBannerAd;

    return-object p0
.end method

.method static synthetic access$102(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomBannerLoader;Lcom/aggmoread/sdk/client/banner/AMBannerAd;)Lcom/aggmoread/sdk/client/banner/AMBannerAd;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomBannerLoader;->amBannerAd:Lcom/aggmoread/sdk/client/banner/AMBannerAd;

    return-object p1
.end method

.method static synthetic access$200(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomBannerLoader;)Landroid/view/ViewGroup;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomBannerLoader;->amBannerContainer:Landroid/view/ViewGroup;

    return-object p0
.end method


# virtual methods
.method public getAdView()Landroid/view/View;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomBannerLoader;->amBannerContainer:Landroid/view/ViewGroup;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomBannerLoader;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomBannerLoader;->amBannerContainer:Landroid/view/ViewGroup;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomBannerLoader;->amBannerContainer:Landroid/view/ViewGroup;

    new-instance v1, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomBannerLoader$2;

    invoke-direct {v1, p0}, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomBannerLoader$2;-><init>(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomBannerLoader;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    .line 4
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomBannerLoader;->amBannerContainer:Landroid/view/ViewGroup;

    return-object v0
.end method

.method public load(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/mediation/custom/MediationCustomServiceConfig;)V
    .locals 0

    const-string p2, "AMAdapterCustomFullVideoLoader load Ad enter "

    .line 1
    invoke-static {p2}, Lcom/aggmoread/sdk/adapter/helper/LogHelper;->log(Ljava/lang/String;)V

    .line 2
    new-instance p2, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomBannerLoader$1;

    invoke-direct {p2, p0, p1, p3}, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomBannerLoader$1;-><init>(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomBannerLoader;Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/mediation/custom/MediationCustomServiceConfig;)V

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
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomBannerLoader;->amBannerAd:Lcom/aggmoread/sdk/client/banner/AMBannerAd;

    invoke-static {v0, p1, p2, p3, p4}, Lcom/aggmoread/sdk/adapter/helper/AdapterHelper;->notifyBidResult(Lcom/aggmoread/sdk/client/AMAdInterface;ZDI)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-super/range {p0 .. p5}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/MediationCustomAdBaseLoader;->receiveBidResult(ZDILjava/util/Map;)V

    :cond_0
    return-void
.end method
