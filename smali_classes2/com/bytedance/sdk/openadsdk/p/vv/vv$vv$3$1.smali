.class Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/CSJSplashAd$SplashAdListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;->setSplashInteractionListener(Lcom/bytedance/sdk/openadsdk/TTSplashAd$AdInteractionListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;

.field final synthetic vv:Lcom/bytedance/sdk/openadsdk/TTSplashAd$AdInteractionListener;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;Lcom/bytedance/sdk/openadsdk/TTSplashAd$AdInteractionListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3$1;->m:Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3$1;->vv:Lcom/bytedance/sdk/openadsdk/TTSplashAd$AdInteractionListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSplashAdClick(Lcom/bytedance/sdk/openadsdk/CSJSplashAd;)V
    .locals 2

    if-nez p1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3$1;->vv:Lcom/bytedance/sdk/openadsdk/TTSplashAd$AdInteractionListener;

    const/4 v0, 0x0

    const/4 v1, -0x1

    invoke-interface {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/TTSplashAd$AdInteractionListener;->onAdClicked(Landroid/view/View;I)V

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3$1;->vv:Lcom/bytedance/sdk/openadsdk/TTSplashAd$AdInteractionListener;

    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/CSJSplashAd;->getSplashView()Landroid/view/View;

    move-result-object v1

    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/CSJSplashAd;->getInteractionType()I

    move-result p1

    invoke-interface {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/TTSplashAd$AdInteractionListener;->onAdClicked(Landroid/view/View;I)V

    return-void
.end method

.method public onSplashAdClose(Lcom/bytedance/sdk/openadsdk/CSJSplashAd;I)V
    .locals 0

    const/4 p1, 0x1

    if-ne p2, p1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3$1;->vv:Lcom/bytedance/sdk/openadsdk/TTSplashAd$AdInteractionListener;

    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/TTSplashAd$AdInteractionListener;->onAdSkip()V

    return-void

    :cond_0
    const/4 p1, 0x2

    if-eq p2, p1, :cond_1

    const/4 p1, 0x4

    if-ne p2, p1, :cond_2

    .line 2
    :cond_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3$1;->vv:Lcom/bytedance/sdk/openadsdk/TTSplashAd$AdInteractionListener;

    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/TTSplashAd$AdInteractionListener;->onAdTimeOver()V

    :cond_2
    return-void
.end method

.method public onSplashAdShow(Lcom/bytedance/sdk/openadsdk/CSJSplashAd;)V
    .locals 2

    if-nez p1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3$1;->vv:Lcom/bytedance/sdk/openadsdk/TTSplashAd$AdInteractionListener;

    const/4 v0, 0x0

    const/4 v1, -0x1

    invoke-interface {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/TTSplashAd$AdInteractionListener;->onAdShow(Landroid/view/View;I)V

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3$1;->vv:Lcom/bytedance/sdk/openadsdk/TTSplashAd$AdInteractionListener;

    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/CSJSplashAd;->getSplashView()Landroid/view/View;

    move-result-object v1

    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/CSJSplashAd;->getInteractionType()I

    move-result p1

    invoke-interface {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/TTSplashAd$AdInteractionListener;->onAdShow(Landroid/view/View;I)V

    return-void
.end method
