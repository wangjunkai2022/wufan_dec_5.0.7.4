.class Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l$b$d;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/kwad/sdk/api/KsLoadManager$SplashScreenAdListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l$b;


# direct methods
.method constructor <init>(Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l$b;)V
    .locals 0

    iput-object p1, p0, Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l$b$d;->b:Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(ILjava/lang/String;)V
    .locals 2

    const-string v0, "TMe"

    const-string v1, "KsSplashLoader load  onError"

    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/MediationApiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l$b$d;->b:Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l$b;

    iget-object v0, v0, Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l$b;->d:Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l;

    invoke-static {v0}, Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l;->d(Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l;)Lcom/bytedance/msdk/adapter/ks/KsSplashLoader;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationAdLoaderImpl;->notifyAdFailed(ILjava/lang/String;)V

    return-void
.end method

.method public onRequestResult(I)V
    .locals 0

    return-void
.end method

.method public onSplashScreenAdLoad(Lcom/kwad/sdk/api/KsSplashScreenAd;)V
    .locals 5
    .param p1    # Lcom/kwad/sdk/api/KsSplashScreenAd;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "KsSplashLoader load  onSplashScreenAdLoad ksSplashScreenAd:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TMe"

    invoke-static {v1, v0}, Lcom/bytedance/sdk/openadsdk/mediation/MediationApiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l$b$d;->b:Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l$b;

    iget-object p1, p1, Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l$b;->d:Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l;

    invoke-static {p1}, Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l;->d(Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l;)Lcom/bytedance/msdk/adapter/ks/KsSplashLoader;

    move-result-object p1

    const v0, 0x13881

    const-string v1, "ksSplashScreenAd is null"

    invoke-virtual {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationAdLoaderImpl;->notifyAdFailed(ILjava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l$b$d;->b:Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l$b;

    invoke-static {v0, p1}, Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l$b;->c(Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l$b;Lcom/kwad/sdk/api/KsSplashScreenAd;)Lcom/kwad/sdk/api/KsSplashScreenAd;

    iget-object v0, p0, Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l$b$d;->b:Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l$b;

    iget-object v0, v0, Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l$b;->d:Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l;

    invoke-static {v0}, Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l;->d(Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l;)Lcom/bytedance/msdk/adapter/ks/KsSplashLoader;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationAdLoaderImpl;->isClientBidding()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Lcom/kwad/sdk/api/KsSplashScreenAd;->getECPM()I

    move-result p1

    int-to-double v0, p1

    iget-object p1, p0, Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l$b$d;->b:Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l$b;

    const-wide/16 v2, 0x0

    cmpl-double v4, v0, v2

    if-lez v4, :cond_1

    goto :goto_0

    :cond_1
    move-wide v0, v2

    :goto_0
    invoke-virtual {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationBaseAdBridge;->setCpm(D)V

    :cond_2
    iget-object p1, p0, Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l$b$d;->b:Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l$b;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationBaseAdBridge;->mGMAd:Lcom/bykv/vk/openvk/api/proto/Bridge;

    if-eqz p1, :cond_3

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;->create()Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;

    move-result-object p1

    const/16 v0, 0x1f7b

    iget-object v1, p0, Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l$b$d;->b:Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l$b;

    invoke-static {v1}, Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l$b;->b(Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l$b;)Lcom/kwad/sdk/api/KsSplashScreenAd;

    move-result-object v1

    invoke-interface {v1}, Lcom/kwad/sdk/api/KsSplashScreenAd;->getInteractionType()I

    move-result v1

    invoke-static {v1}, Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/n;->b(I)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;->add(II)Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;

    iget-object v0, p0, Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l$b$d;->b:Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l$b;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationBaseAdBridge;->mGMAd:Lcom/bykv/vk/openvk/api/proto/Bridge;

    const/16 v1, 0x1fcc

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;->build()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p1

    const-class v2, Ljava/lang/Void;

    invoke-interface {v0, v1, p1, v2}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    :cond_3
    iget-object p1, p0, Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l$b$d;->b:Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l$b;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationBaseAdBridge;->setExpress()V

    const-string p1, "KsRewardLoader"

    const-string v0, "load success"

    invoke-static {p1, v0}, Lcom/bytedance/sdk/openadsdk/mediation/MediationApiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l$b$d;->b:Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l$b;

    iget-object p1, p1, Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l$b;->d:Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l;

    invoke-static {p1}, Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l;->d(Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l;)Lcom/bytedance/msdk/adapter/ks/KsSplashLoader;

    move-result-object p1

    iget-object v0, p0, Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l$b$d;->b:Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/l$b;

    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationBaseAdBridge;->mGMAd:Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-virtual {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationAdLoaderImpl;->notifyAdSuccess(Lcom/bykv/vk/openvk/api/proto/Bridge;Lcom/bykv/vk/openvk/api/proto/Bridge;)V

    return-void
.end method
