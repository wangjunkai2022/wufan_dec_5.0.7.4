.class public Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd;
.super Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/draw/MediationCustomDrawAd;
.source "AMCustomDrawAd.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "AMCustomDrawAd"


# instance fields
.field private height:I

.field private mNativeExpressADView:Lcom/aggmoread/sdk/client/draw/AMDrawAd;

.field private width:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/aggmoread/sdk/client/draw/AMDrawAd;Lcom/bytedance/sdk/openadsdk/AdSlot;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/draw/MediationCustomDrawAd;-><init>()V

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/native_ad/MediationCustomNativeAd;->setExpressAd(Z)V

    .line 3
    iput-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd;->mNativeExpressADView:Lcom/aggmoread/sdk/client/draw/AMDrawAd;

    .line 4
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getImgAcceptedWidth()I

    move-result p1

    iput p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd;->width:I

    .line 5
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getImgAcceptedHeight()I

    move-result p1

    iput p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd;->height:I

    .line 6
    iget-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd;->mNativeExpressADView:Lcom/aggmoread/sdk/client/draw/AMDrawAd;

    new-instance v0, Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd$1;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd$1;-><init>(Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd;)V

    invoke-interface {p1, v0}, Lcom/aggmoread/sdk/client/draw/AMDrawAd;->setVideoListener(Lcom/aggmoread/sdk/client/draw/AMDrawAd$DrawVideoListener;)V

    .line 7
    iget-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd;->mNativeExpressADView:Lcom/aggmoread/sdk/client/draw/AMDrawAd;

    new-instance v0, Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd$2;

    invoke-direct {v0, p0, p2}, Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd$2;-><init>(Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd;Lcom/bytedance/sdk/openadsdk/AdSlot;)V

    invoke-interface {p1, v0}, Lcom/aggmoread/sdk/client/draw/AMDrawAd;->setInteractionListener(Lcom/aggmoread/sdk/client/draw/AMDrawAdInteractionListener;)V

    return-void
.end method

.method static synthetic access$000(Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd;)Lcom/aggmoread/sdk/client/draw/AMDrawAd;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd;->mNativeExpressADView:Lcom/aggmoread/sdk/client/draw/AMDrawAd;

    return-object p0
.end method

.method static synthetic access$002(Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd;Lcom/aggmoread/sdk/client/draw/AMDrawAd;)Lcom/aggmoread/sdk/client/draw/AMDrawAd;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd;->mNativeExpressADView:Lcom/aggmoread/sdk/client/draw/AMDrawAd;

    return-object p1
.end method

.method static synthetic access$100()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd;->TAG:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public getExpressView()Landroid/view/View;
    .locals 1

    const-string v0, "getExpressView"

    .line 1
    invoke-static {v0}, Lcom/aggmoread/sdk/adapter/helper/LogHelper;->log(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd;->mNativeExpressADView:Lcom/aggmoread/sdk/client/draw/AMDrawAd;

    invoke-interface {v0}, Lcom/aggmoread/sdk/client/draw/AMDrawAd;->getView()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public hasDislike()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/native_ad/MediationCustomNativeAd;->onDestroy()V

    .line 2
    new-instance v0, Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd$4;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd$4;-><init>(Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd;)V

    invoke-static {v0}, Lcom/aggmoread/sdk/adapter/helper/ThreadHelper;->runInMainThread(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onPause()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/native_ad/MediationCustomNativeAd;->onPause()V

    return-void
.end method

.method public onResume()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/native_ad/MediationCustomNativeAd;->onResume()V

    return-void
.end method

.method public receiveBidResult(ZDILjava/util/Map;)V
    .locals 1
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
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd;->mNativeExpressADView:Lcom/aggmoread/sdk/client/draw/AMDrawAd;

    invoke-static {v0, p1, p2, p3, p4}, Lcom/aggmoread/sdk/adapter/helper/AdapterHelper;->notifyBidResult(Lcom/aggmoread/sdk/client/AMAdInterface;ZDI)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-super/range {p0 .. p5}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/native_ad/MediationCustomNativeAd;->receiveBidResult(ZDILjava/util/Map;)V

    :cond_0
    return-void
.end method

.method public render()V
    .locals 1

    const-string v0, "render"

    .line 1
    invoke-static {v0}, Lcom/aggmoread/sdk/adapter/helper/LogHelper;->log(Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd$3;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd$3;-><init>(Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd;)V

    invoke-static {v0}, Lcom/aggmoread/sdk/adapter/helper/ThreadHelper;->runOnUIThreadByThreadPool(Ljava/lang/Runnable;)V

    return-void
.end method
