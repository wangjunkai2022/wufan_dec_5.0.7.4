.class public Lcom/join/mgps/ad/v;
.super Lcom/join/mgps/ad/c;
.source "TTInfoStreamVideo.java"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTAdSdk$InitCallback;
.implements Lcom/bytedance/sdk/openadsdk/TTAdNative$NativeExpressAdListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/mgps/ad/c<",
        "Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;",
        ">;",
        "Lcom/bytedance/sdk/openadsdk/TTAdSdk$InitCallback;",
        "Lcom/bytedance/sdk/openadsdk/TTAdNative$NativeExpressAdListener;"
    }
.end annotation


# instance fields
.field private g:Lcom/bytedance/sdk/openadsdk/TTAdNative;

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;",
            ">;"
        }
    .end annotation
.end field

.field private i:Z

.field protected j:Z

.field private k:Lcom/bytedance/sdk/openadsdk/AdSlot;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "TT"

    .line 1
    invoke-direct {p0, v0, p1, p2, p3}, Lcom/join/mgps/ad/c;-><init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/ad/v;->h:Ljava/util/List;

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Lcom/join/mgps/ad/v;->i:Z

    .line 4
    iput-boolean p1, p0, Lcom/join/mgps/ad/v;->j:Z

    return-void
.end method

.method private f(III)V
    .locals 2

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;

    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;-><init>()V

    iget-object v1, p0, Lcom/join/mgps/ad/c;->c:Ljava/lang/String;

    .line 2
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;->setCodeId(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;

    move-result-object v0

    .line 3
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;->setAdCount(I)Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;

    move-result-object p1

    int-to-float p2, p2

    int-to-float p3, p3

    .line 4
    invoke-virtual {p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;->setExpressViewAcceptedSize(FF)Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;

    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;->build()Lcom/bytedance/sdk/openadsdk/AdSlot;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/ad/v;->k:Lcom/bytedance/sdk/openadsdk/AdSlot;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/ad/c;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/join/mgps/ad/c;->b:Ljava/lang/String;

    new-instance v2, Lcom/join/mgps/ad/u;

    invoke-direct {v2, p0}, Lcom/join/mgps/ad/u;-><init>(Lcom/join/mgps/ad/v;)V

    invoke-static {v0, v1, v2}, Lcom/join/mgps/ad/adapter/e;->d(Landroid/content/Context;Ljava/lang/String;Ls1/a;)V

    return-void
.end method

.method public b(III)V
    .locals 3

    const-string v0, "\u5e7f\u544a\u52a0\u8f7d\u9519\u8bef"

    const/4 v1, -0x1

    const/4 v2, 0x0

    .line 1
    :try_start_0
    iput-boolean v2, p0, Lcom/join/mgps/ad/v;->i:Z

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/join/mgps/ad/v;->f(III)V

    .line 3
    iget-boolean p1, p0, Lcom/join/mgps/ad/v;->j:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/join/mgps/ad/v;->j:Z

    .line 5
    iget-object p1, p0, Lcom/join/mgps/ad/v;->g:Lcom/bytedance/sdk/openadsdk/TTAdNative;

    if-nez p1, :cond_1

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/TTAdSdk;->getAdManager()Lcom/bytedance/sdk/openadsdk/TTAdManager;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 6
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/TTAdSdk;->getAdManager()Lcom/bytedance/sdk/openadsdk/TTAdManager;

    move-result-object p1

    iget-object p2, p0, Lcom/join/mgps/ad/c;->a:Landroid/content/Context;

    invoke-interface {p1, p2}, Lcom/bytedance/sdk/openadsdk/TTAdManager;->createAdNative(Landroid/content/Context;)Lcom/bytedance/sdk/openadsdk/TTAdNative;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/ad/v;->g:Lcom/bytedance/sdk/openadsdk/TTAdNative;

    .line 7
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/ad/v;->g:Lcom/bytedance/sdk/openadsdk/TTAdNative;

    if-eqz p1, :cond_2

    .line 8
    iget-object p2, p0, Lcom/join/mgps/ad/v;->k:Lcom/bytedance/sdk/openadsdk/AdSlot;

    invoke-interface {p1, p2, p0}, Lcom/bytedance/sdk/openadsdk/TTAdNative;->loadNativeExpressAd(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/TTAdNative$NativeExpressAdListener;)V

    goto :goto_0

    .line 9
    :cond_2
    invoke-virtual {p0, v1, v0}, Lcom/join/mgps/ad/v;->onError(ILjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 10
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 11
    iput-boolean v2, p0, Lcom/join/mgps/ad/v;->j:Z

    .line 12
    invoke-virtual {p0, v1, v0}, Lcom/join/mgps/ad/v;->onError(ILjava/lang/String;)V

    :goto_0
    return-void
.end method

.method public c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/ad/v;->h:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;

    .line 3
    invoke-interface {v1}, Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;->destroy()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lcom/join/mgps/ad/v;->h:Ljava/util/List;

    return-void
.end method

.method public fail(ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/ad/v;->onError(ILjava/lang/String;)V

    return-void
.end method

.method public onADLoaded(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/ad/o;->onADLoaded(Ljava/util/List;)V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/ad/v;->i:Z

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/join/mgps/ad/v;->j:Z

    .line 4
    iget-object v0, p0, Lcom/join/mgps/ad/v;->h:Ljava/util/List;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    .line 5
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;

    .line 6
    new-instance v2, Lcom/join/mgps/ad/v$a;

    invoke-direct {v2, p0}, Lcom/join/mgps/ad/v$a;-><init>(Lcom/join/mgps/ad/v;)V

    invoke-interface {v1, v2}, Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;->setExpressInteractionListener(Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd$AdInteractionListener;)V

    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/ad/v;->h:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 8
    iget-object v0, p0, Lcom/join/mgps/ad/c;->e:Lcom/join/mgps/ad/c$a;

    if-eqz v0, :cond_1

    .line 9
    invoke-interface {v0, p1}, Lcom/join/mgps/ad/c$a;->onADLoaded(Ljava/util/List;)V

    :cond_1
    return-void
.end method

.method public onError(ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/ad/o;->onError(ILjava/lang/String;)V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/join/mgps/ad/v;->i:Z

    .line 3
    iput-boolean p1, p0, Lcom/join/mgps/ad/v;->j:Z

    return-void
.end method

.method public onNativeExpressAdLoad(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/join/mgps/ad/v;->onADLoaded(Ljava/util/List;)V

    return-void
.end method

.method public success()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/ad/o;->onInitSuccess()V

    return-void
.end method
