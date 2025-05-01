.class Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTSplashAd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;->vv(Lcom/bytedance/sdk/openadsdk/CSJSplashAd;)Lcom/bytedance/sdk/openadsdk/TTSplashAd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:[Lcom/bytedance/sdk/openadsdk/TTSplashAd$AdInteractionListener;

.field final synthetic p:Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;

.field final synthetic vv:Lcom/bytedance/sdk/openadsdk/CSJSplashAd;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;Lcom/bytedance/sdk/openadsdk/CSJSplashAd;[Lcom/bytedance/sdk/openadsdk/TTSplashAd$AdInteractionListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;->p:Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;->vv:Lcom/bytedance/sdk/openadsdk/CSJSplashAd;

    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;->m:[Lcom/bytedance/sdk/openadsdk/TTSplashAd$AdInteractionListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getInteractionType()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;->vv:Lcom/bytedance/sdk/openadsdk/CSJSplashAd;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/CSJSplashAd;->getInteractionType()I

    move-result v0

    return v0
.end method

.method public getMediaExtraInfo()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;->vv:Lcom/bytedance/sdk/openadsdk/CSJSplashAd;

    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/CSJSplashAd;->getMediaExtraInfo()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getMediationManager()Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationSplashManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;->vv:Lcom/bytedance/sdk/openadsdk/CSJSplashAd;

    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/CSJSplashAd;->getMediationManager()Lcom/bytedance/sdk/openadsdk/mediation/manager/MediationSplashManager;

    move-result-object v0

    return-object v0
.end method

.method public getSplashClickEyeSizeToDp()[I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;->vv:Lcom/bytedance/sdk/openadsdk/CSJSplashAd;

    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/CSJSplashAd;->getSplashClickEyeSizeToDp()[I

    move-result-object v0

    return-object v0
.end method

.method public getSplashView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;->vv:Lcom/bytedance/sdk/openadsdk/CSJSplashAd;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/CSJSplashAd;->getSplashView()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public loss(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;->vv:Lcom/bytedance/sdk/openadsdk/CSJSplashAd;

    invoke-interface {v0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/TTClientBidding;->loss(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public renderExpressAd(Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd$ExpressAdInteractionListener;)V
    .locals 0

    return-void
.end method

.method public setAdInteractionListener(Lcom/bytedance/sdk/openadsdk/TTAdInteractionListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;->vv:Lcom/bytedance/sdk/openadsdk/CSJSplashAd;

    invoke-interface {v0, p1}, Lcom/bytedance/sdk/openadsdk/TTClientBidding;->setAdInteractionListener(Lcom/bytedance/sdk/openadsdk/TTAdInteractionListener;)V

    return-void
.end method

.method public setDownloadListener(Lcom/bytedance/sdk/openadsdk/TTAppDownloadListener;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;->vv:Lcom/bytedance/sdk/openadsdk/CSJSplashAd;

    invoke-interface {v0, p1}, Lcom/bytedance/sdk/openadsdk/CSJSplashAd;->setDownloadListener(Lcom/bytedance/sdk/openadsdk/TTAppDownloadListener;)V

    return-void
.end method

.method public setNotAllowSdkCountdown()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;->vv:Lcom/bytedance/sdk/openadsdk/CSJSplashAd;

    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/CSJSplashAd;->hideSkipButton()V

    return-void
.end method

.method public setPrice(Ljava/lang/Double;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;->vv:Lcom/bytedance/sdk/openadsdk/CSJSplashAd;

    invoke-interface {v0, p1}, Lcom/bytedance/sdk/openadsdk/TTClientBidding;->setPrice(Ljava/lang/Double;)V

    return-void
.end method

.method public setSplashCardListener(Lcom/bytedance/sdk/openadsdk/ISplashCardListener;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;->vv:Lcom/bytedance/sdk/openadsdk/CSJSplashAd;

    new-instance v1, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3$3;

    invoke-direct {v1, p0, p1}, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3$3;-><init>(Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;Lcom/bytedance/sdk/openadsdk/ISplashCardListener;)V

    invoke-interface {v0, v1}, Lcom/bytedance/sdk/openadsdk/CSJSplashAd;->setSplashCardListener(Lcom/bytedance/sdk/openadsdk/CSJSplashAd$SplashCardListener;)V

    return-void
.end method

.method public setSplashClickEyeListener(Lcom/bytedance/sdk/openadsdk/ISplashClickEyeListener;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;->vv:Lcom/bytedance/sdk/openadsdk/CSJSplashAd;

    new-instance v1, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3$2;

    invoke-direct {v1, p0, p1}, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3$2;-><init>(Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;Lcom/bytedance/sdk/openadsdk/ISplashClickEyeListener;)V

    invoke-interface {v0, v1}, Lcom/bytedance/sdk/openadsdk/CSJSplashAd;->setSplashClickEyeListener(Lcom/bytedance/sdk/openadsdk/CSJSplashAd$SplashClickEyeListener;)V

    return-void
.end method

.method public setSplashInteractionListener(Lcom/bytedance/sdk/openadsdk/TTSplashAd$AdInteractionListener;)V
    .locals 3

    if-eqz p1, :cond_1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;->vv:Lcom/bytedance/sdk/openadsdk/CSJSplashAd;

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;->m:[Lcom/bytedance/sdk/openadsdk/TTSplashAd$AdInteractionListener;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    .line 3
    new-instance v1, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3$1;

    invoke-direct {v1, p0, p1}, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3$1;-><init>(Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;Lcom/bytedance/sdk/openadsdk/TTSplashAd$AdInteractionListener;)V

    invoke-interface {v0, v1}, Lcom/bytedance/sdk/openadsdk/CSJSplashAd;->setSplashAdListener(Lcom/bytedance/sdk/openadsdk/CSJSplashAd$SplashAdListener;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public splashClickEyeAnimationFinish()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;->vv:Lcom/bytedance/sdk/openadsdk/CSJSplashAd;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/bytedance/sdk/openadsdk/CSJSplashAd;->showSplashClickEyeView(Landroid/view/ViewGroup;)V

    return-void
.end method

.method public startClickEye()V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;->vv:Lcom/bytedance/sdk/openadsdk/CSJSplashAd;

    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/CSJSplashAd;->startClickEye()V

    return-void
.end method

.method public startClickEye(Z)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;->vv:Lcom/bytedance/sdk/openadsdk/CSJSplashAd;

    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/CSJSplashAd;->startClickEye()V

    return-void
.end method

.method public win(Ljava/lang/Double;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;->vv:Lcom/bytedance/sdk/openadsdk/CSJSplashAd;

    invoke-interface {v0, p1}, Lcom/bytedance/sdk/openadsdk/TTClientBidding;->win(Ljava/lang/Double;)V

    return-void
.end method
