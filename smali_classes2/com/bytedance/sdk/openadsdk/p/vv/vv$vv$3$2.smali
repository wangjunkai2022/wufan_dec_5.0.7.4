.class Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/CSJSplashAd$SplashClickEyeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;->setSplashClickEyeListener(Lcom/bytedance/sdk/openadsdk/ISplashClickEyeListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;

.field final synthetic vv:Lcom/bytedance/sdk/openadsdk/ISplashClickEyeListener;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;Lcom/bytedance/sdk/openadsdk/ISplashClickEyeListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3$2;->m:Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3$2;->vv:Lcom/bytedance/sdk/openadsdk/ISplashClickEyeListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSplashClickEyeClick()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3$2;->m:Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;

    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;->m:[Lcom/bytedance/sdk/openadsdk/TTSplashAd$AdInteractionListener;

    const/4 v2, 0x0

    aget-object v3, v1, v2

    if-eqz v3, :cond_0

    .line 2
    aget-object v1, v1, v2

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;->vv:Lcom/bytedance/sdk/openadsdk/CSJSplashAd;

    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/CSJSplashAd;->getSplashView()Landroid/view/View;

    move-result-object v0

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3$2;->m:Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;

    iget-object v2, v2, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;->vv:Lcom/bytedance/sdk/openadsdk/CSJSplashAd;

    invoke-interface {v2}, Lcom/bytedance/sdk/openadsdk/CSJSplashAd;->getInteractionType()I

    move-result v2

    invoke-interface {v1, v0, v2}, Lcom/bytedance/sdk/openadsdk/TTSplashAd$AdInteractionListener;->onAdClicked(Landroid/view/View;I)V

    :cond_0
    return-void
.end method

.method public onSplashClickEyeClose()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3$2;->vv:Lcom/bytedance/sdk/openadsdk/ISplashClickEyeListener;

    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/ISplashClickEyeListener;->onSplashClickEyeAnimationFinish()V

    return-void
.end method

.method public onSplashClickEyeReadyToShow(Lcom/bytedance/sdk/openadsdk/CSJSplashAd;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3$2;->vv:Lcom/bytedance/sdk/openadsdk/ISplashClickEyeListener;

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lcom/bytedance/sdk/openadsdk/ISplashClickEyeListener;->isSupportSplashClickEye(Z)Z

    .line 2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3$2;->vv:Lcom/bytedance/sdk/openadsdk/ISplashClickEyeListener;

    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/ISplashClickEyeListener;->onSplashClickEyeAnimationStart()V

    return-void
.end method
