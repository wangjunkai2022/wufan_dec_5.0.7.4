.class public Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTAdNative;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/openadsdk/p/vv/vv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "vv"
.end annotation


# instance fields
.field private final vv:Lcom/bytedance/sdk/openadsdk/p/vv/vv;


# direct methods
.method protected constructor <init>(Lcom/bytedance/sdk/openadsdk/p/vv/vv;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;->vv:Lcom/bytedance/sdk/openadsdk/p/vv/vv;

    return-void
.end method

.method private vv(Lcom/bytedance/sdk/openadsdk/AdSlot;)Lcom/bykv/vk/openvk/api/proto/ValueSet;
    .locals 4

    .line 1
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/p/vv/p/m;->m(Lcom/bytedance/sdk/openadsdk/AdSlot;)Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v0

    invoke-static {v0}, Lcom/bykv/vv/vv/vv/vv/a;->k(Lcom/bykv/vk/openvk/api/proto/ValueSet;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 2
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationAdClassLoader;->getInstance()Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationAdClassLoader;

    move-result-object v1

    const/16 v2, 0x206e

    invoke-virtual {v0, v2, v1}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    .line 3
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getMediationAdSlot()Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationAdSlot;

    move-result-object v1

    if-eqz v1, :cond_0

    const v1, 0x7e09bc

    .line 4
    new-instance v2, Lcom/bytedance/sdk/openadsdk/mediation/vv/vv/o;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getMediationAdSlot()Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationAdSlot;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/bytedance/sdk/openadsdk/mediation/vv/vv/o;-><init>(Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationAdSlot;)V

    invoke-virtual {v0, v1, v2}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    const v1, 0x3f7bb

    .line 5
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getMediationAdSlot()Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationAdSlot;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    .line 6
    :cond_0
    invoke-virtual {v0}, Lcom/bykv/vv/vv/vv/vv/a;->a()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p1

    return-object p1
.end method

.method private vv(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/TTAdNative$SplashAdListener;I)V
    .locals 1

    .line 7
    new-instance v0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$2;

    invoke-direct {v0, p0, p2}, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$2;-><init>(Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;Lcom/bytedance/sdk/openadsdk/TTAdNative$SplashAdListener;)V

    invoke-virtual {p0, p1, v0, p3}, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;->loadSplashAd(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/TTAdNative$CSJSplashAdListener;I)V

    return-void
.end method


# virtual methods
.method public loadBannerExpressAd(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/TTAdNative$NativeExpressAdListener;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;->vv:Lcom/bytedance/sdk/openadsdk/p/vv/vv;

    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;->vv(Lcom/bytedance/sdk/openadsdk/AdSlot;)Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p1

    new-instance v1, Lcom/bytedance/sdk/openadsdk/n/vv/vv/vv/o;

    invoke-direct {v1, p2}, Lcom/bytedance/sdk/openadsdk/n/vv/vv/vv/o;-><init>(Lcom/bytedance/sdk/openadsdk/TTAdNative$NativeExpressAdListener;)V

    invoke-virtual {v0, p1, v1}, Lcom/bytedance/sdk/openadsdk/p/vv/vv;->wv(Lcom/bykv/vk/openvk/api/proto/ValueSet;Lcom/bykv/vk/openvk/api/proto/Bridge;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    if-eqz p2, :cond_0

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;->vv:Lcom/bytedance/sdk/openadsdk/p/vv/vv;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/p/vv/vv;->vv(Ljava/lang/Exception;)Landroid/util/Pair;

    move-result-object p1

    .line 3
    iget-object v0, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-interface {p2, v0, p1}, Lcom/bytedance/sdk/openadsdk/TTAdNative$NativeExpressAdListener;->onError(ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public loadDrawFeedAd(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/TTAdNative$DrawFeedAdListener;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;->vv:Lcom/bytedance/sdk/openadsdk/p/vv/vv;

    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;->vv(Lcom/bytedance/sdk/openadsdk/AdSlot;)Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p1

    new-instance v1, Lcom/bytedance/sdk/openadsdk/mediation/vv/vv/m;

    invoke-direct {v1, p2}, Lcom/bytedance/sdk/openadsdk/mediation/vv/vv/m;-><init>(Lcom/bytedance/sdk/openadsdk/TTAdNative$DrawFeedAdListener;)V

    invoke-virtual {v0, p1, v1}, Lcom/bytedance/sdk/openadsdk/p/vv/vv;->p(Lcom/bykv/vk/openvk/api/proto/ValueSet;Lcom/bykv/vk/openvk/api/proto/Bridge;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    if-eqz p2, :cond_0

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;->vv:Lcom/bytedance/sdk/openadsdk/p/vv/vv;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/p/vv/vv;->vv(Ljava/lang/Exception;)Landroid/util/Pair;

    move-result-object p1

    .line 3
    iget-object v0, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-interface {p2, v0, p1}, Lcom/bytedance/sdk/openadsdk/TTAdNative$DrawFeedAdListener;->onError(ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public loadExpressDrawFeedAd(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/TTAdNative$NativeExpressAdListener;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;->vv:Lcom/bytedance/sdk/openadsdk/p/vv/vv;

    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;->vv(Lcom/bytedance/sdk/openadsdk/AdSlot;)Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p1

    new-instance v1, Lcom/bytedance/sdk/openadsdk/n/vv/vv/vv/o;

    invoke-direct {v1, p2}, Lcom/bytedance/sdk/openadsdk/n/vv/vv/vv/o;-><init>(Lcom/bytedance/sdk/openadsdk/TTAdNative$NativeExpressAdListener;)V

    invoke-virtual {v0, p1, v1}, Lcom/bytedance/sdk/openadsdk/p/vv/vv;->qv(Lcom/bykv/vk/openvk/api/proto/ValueSet;Lcom/bykv/vk/openvk/api/proto/Bridge;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    if-eqz p2, :cond_0

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;->vv:Lcom/bytedance/sdk/openadsdk/p/vv/vv;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/p/vv/vv;->vv(Ljava/lang/Exception;)Landroid/util/Pair;

    move-result-object p1

    .line 3
    iget-object v0, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-interface {p2, v0, p1}, Lcom/bytedance/sdk/openadsdk/TTAdNative$NativeExpressAdListener;->onError(ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public loadFeedAd(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/TTAdNative$FeedAdListener;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;->vv:Lcom/bytedance/sdk/openadsdk/p/vv/vv;

    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;->vv(Lcom/bytedance/sdk/openadsdk/AdSlot;)Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p1

    new-instance v1, Lcom/bytedance/sdk/openadsdk/mediation/vv/vv/p;

    invoke-direct {v1, p2}, Lcom/bytedance/sdk/openadsdk/mediation/vv/vv/p;-><init>(Lcom/bytedance/sdk/openadsdk/TTAdNative$FeedAdListener;)V

    invoke-virtual {v0, p1, v1}, Lcom/bytedance/sdk/openadsdk/p/vv/vv;->vv(Lcom/bykv/vk/openvk/api/proto/ValueSet;Lcom/bykv/vk/openvk/api/proto/Bridge;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    if-eqz p2, :cond_0

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;->vv:Lcom/bytedance/sdk/openadsdk/p/vv/vv;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/p/vv/vv;->vv(Ljava/lang/Exception;)Landroid/util/Pair;

    move-result-object p1

    .line 3
    iget-object v0, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-interface {p2, v0, p1}, Lcom/bytedance/sdk/openadsdk/TTAdNative$FeedAdListener;->onError(ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public loadFullScreenVideoAd(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;->vv:Lcom/bytedance/sdk/openadsdk/p/vv/vv;

    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;->vv(Lcom/bytedance/sdk/openadsdk/AdSlot;)Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p1

    new-instance v1, Lcom/bytedance/sdk/openadsdk/mediation/vv/vv/i;

    invoke-direct {v1, p2}, Lcom/bytedance/sdk/openadsdk/mediation/vv/vv/i;-><init>(Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;)V

    invoke-virtual {v0, p1, v1}, Lcom/bytedance/sdk/openadsdk/p/vv/vv;->u(Lcom/bykv/vk/openvk/api/proto/ValueSet;Lcom/bykv/vk/openvk/api/proto/Bridge;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    if-eqz p2, :cond_0

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;->vv:Lcom/bytedance/sdk/openadsdk/p/vv/vv;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/p/vv/vv;->vv(Ljava/lang/Exception;)Landroid/util/Pair;

    move-result-object p1

    .line 3
    iget-object v0, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-interface {p2, v0, p1}, Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;->onError(ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public loadInteractionExpressAd(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/TTAdNative$NativeExpressAdListener;)V
    .locals 0

    return-void
.end method

.method public loadNativeAd(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/TTAdNative$NativeAdListener;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;->vv:Lcom/bytedance/sdk/openadsdk/p/vv/vv;

    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;->vv(Lcom/bytedance/sdk/openadsdk/AdSlot;)Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p1

    new-instance v1, Lcom/bytedance/sdk/openadsdk/n/vv/vv/vv/i;

    invoke-direct {v1, p2}, Lcom/bytedance/sdk/openadsdk/n/vv/vv/vv/i;-><init>(Lcom/bytedance/sdk/openadsdk/TTAdNative$NativeAdListener;)V

    invoke-virtual {v0, p1, v1}, Lcom/bytedance/sdk/openadsdk/p/vv/vv;->i(Lcom/bykv/vk/openvk/api/proto/ValueSet;Lcom/bykv/vk/openvk/api/proto/Bridge;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    if-eqz p2, :cond_0

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;->vv:Lcom/bytedance/sdk/openadsdk/p/vv/vv;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/p/vv/vv;->vv(Ljava/lang/Exception;)Landroid/util/Pair;

    move-result-object p1

    .line 3
    iget-object v0, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-interface {p2, v0, p1}, Lcom/bytedance/sdk/openadsdk/TTAdNative$NativeAdListener;->onError(ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public loadNativeExpressAd(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/TTAdNative$NativeExpressAdListener;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;->vv:Lcom/bytedance/sdk/openadsdk/p/vv/vv;

    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;->vv(Lcom/bytedance/sdk/openadsdk/AdSlot;)Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p1

    new-instance v1, Lcom/bytedance/sdk/openadsdk/n/vv/vv/vv/o;

    invoke-direct {v1, p2}, Lcom/bytedance/sdk/openadsdk/n/vv/vv/vv/o;-><init>(Lcom/bytedance/sdk/openadsdk/TTAdNative$NativeExpressAdListener;)V

    invoke-virtual {v0, p1, v1}, Lcom/bytedance/sdk/openadsdk/p/vv/vv;->n(Lcom/bykv/vk/openvk/api/proto/ValueSet;Lcom/bykv/vk/openvk/api/proto/Bridge;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    if-eqz p2, :cond_0

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;->vv:Lcom/bytedance/sdk/openadsdk/p/vv/vv;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/p/vv/vv;->vv(Ljava/lang/Exception;)Landroid/util/Pair;

    move-result-object p1

    .line 3
    iget-object v0, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-interface {p2, v0, p1}, Lcom/bytedance/sdk/openadsdk/TTAdNative$NativeExpressAdListener;->onError(ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public loadRewardVideoAd(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/TTAdNative$RewardVideoAdListener;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;->vv:Lcom/bytedance/sdk/openadsdk/p/vv/vv;

    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;->vv(Lcom/bytedance/sdk/openadsdk/AdSlot;)Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p1

    new-instance v1, Lcom/bytedance/sdk/openadsdk/n/vv/vv/vv/u;

    invoke-direct {v1, p2}, Lcom/bytedance/sdk/openadsdk/n/vv/vv/vv/u;-><init>(Lcom/bytedance/sdk/openadsdk/TTAdNative$RewardVideoAdListener;)V

    invoke-virtual {v0, p1, v1}, Lcom/bytedance/sdk/openadsdk/p/vv/vv;->o(Lcom/bykv/vk/openvk/api/proto/ValueSet;Lcom/bykv/vk/openvk/api/proto/Bridge;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    if-eqz p2, :cond_0

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;->vv:Lcom/bytedance/sdk/openadsdk/p/vv/vv;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/p/vv/vv;->vv(Ljava/lang/Exception;)Landroid/util/Pair;

    move-result-object p1

    .line 3
    iget-object v0, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-interface {p2, v0, p1}, Lcom/bytedance/sdk/openadsdk/TTAdNative$RewardVideoAdListener;->onError(ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public loadSplashAd(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/TTAdNative$CSJSplashAdListener;I)V
    .locals 2

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;->vv:Lcom/bytedance/sdk/openadsdk/p/vv/vv;

    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;->vv(Lcom/bytedance/sdk/openadsdk/AdSlot;)Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p1

    new-instance v1, Lcom/bytedance/sdk/openadsdk/p/vv/m;

    invoke-direct {v1, p2}, Lcom/bytedance/sdk/openadsdk/p/vv/m;-><init>(Lcom/bytedance/sdk/openadsdk/TTAdNative$CSJSplashAdListener;)V

    invoke-virtual {v0, p1, v1, p3}, Lcom/bytedance/sdk/openadsdk/p/vv/vv;->vv(Lcom/bykv/vk/openvk/api/proto/ValueSet;Lcom/bykv/vk/openvk/api/proto/Bridge;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    if-eqz p2, :cond_0

    .line 3
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;->vv:Lcom/bytedance/sdk/openadsdk/p/vv/vv;

    invoke-virtual {p3, p1}, Lcom/bytedance/sdk/openadsdk/p/vv/vv;->vv(Ljava/lang/Exception;)Landroid/util/Pair;

    move-result-object p1

    .line 4
    new-instance p3, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$1;

    invoke-direct {p3, p0, p1}, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$1;-><init>(Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;Landroid/util/Pair;)V

    invoke-interface {p2, p3}, Lcom/bytedance/sdk/openadsdk/TTAdNative$CSJSplashAdListener;->onSplashLoadFail(Lcom/bytedance/sdk/openadsdk/CSJAdError;)V

    :cond_0
    return-void
.end method

.method public loadSplashAd(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/TTAdNative$SplashAdListener;)V
    .locals 1

    const/4 v0, -0x1

    .line 5
    invoke-direct {p0, p1, p2, v0}, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;->vv(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/TTAdNative$SplashAdListener;I)V

    return-void
.end method

.method public loadSplashAd(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/TTAdNative$SplashAdListener;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;->vv(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/TTAdNative$SplashAdListener;I)V

    return-void
.end method

.method public loadStream(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/TTAdNative$FeedAdListener;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;->vv:Lcom/bytedance/sdk/openadsdk/p/vv/vv;

    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;->vv(Lcom/bytedance/sdk/openadsdk/AdSlot;)Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p1

    new-instance v1, Lcom/bytedance/sdk/openadsdk/mediation/vv/vv/p;

    invoke-direct {v1, p2}, Lcom/bytedance/sdk/openadsdk/mediation/vv/vv/p;-><init>(Lcom/bytedance/sdk/openadsdk/TTAdNative$FeedAdListener;)V

    invoke-virtual {v0, p1, v1}, Lcom/bytedance/sdk/openadsdk/p/vv/vv;->m(Lcom/bykv/vk/openvk/api/proto/ValueSet;Lcom/bykv/vk/openvk/api/proto/Bridge;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    if-eqz p2, :cond_0

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;->vv:Lcom/bytedance/sdk/openadsdk/p/vv/vv;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/p/vv/vv;->vv(Ljava/lang/Exception;)Landroid/util/Pair;

    move-result-object p1

    .line 3
    iget-object v0, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-interface {p2, v0, p1}, Lcom/bytedance/sdk/openadsdk/TTAdNative$FeedAdListener;->onError(ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public vv(Lcom/bytedance/sdk/openadsdk/CSJSplashAd;)Lcom/bytedance/sdk/openadsdk/TTSplashAd;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [Lcom/bytedance/sdk/openadsdk/TTSplashAd$AdInteractionListener;

    .line 8
    new-instance v1, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;

    invoke-direct {v1, p0, p1, v0}, Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv$3;-><init>(Lcom/bytedance/sdk/openadsdk/p/vv/vv$vv;Lcom/bytedance/sdk/openadsdk/CSJSplashAd;[Lcom/bytedance/sdk/openadsdk/TTSplashAd$AdInteractionListener;)V

    return-object v1
.end method
