.class Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFeedLoader$1$1;
.super Ljava/lang/Object;
.source "AMAdapterCustomFeedLoader.java"

# interfaces
.implements Lcom/aggmoread/sdk/client/feedlist/AMNativeAdListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFeedLoader$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFeedLoader$1;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFeedLoader$1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFeedLoader$1$1;->this$1:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFeedLoader$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdLoadFail(Lcom/aggmoread/sdk/client/AMError;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "native onAdLoadFail errorCode = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p1, Lcom/aggmoread/sdk/client/AMError;->code:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " errorMessage = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Lcom/aggmoread/sdk/client/AMError;->msg:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/aggmoread/sdk/adapter/helper/LogHelper;->log(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFeedLoader$1$1;->this$1:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFeedLoader$1;

    iget-object v0, v0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFeedLoader$1;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFeedLoader;

    iget v1, p1, Lcom/aggmoread/sdk/client/AMError;->code:I

    iget-object p1, p1, Lcom/aggmoread/sdk/client/AMError;->msg:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/MediationCustomAdBaseLoader;->callLoadFail(ILjava/lang/String;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFeedLoader$1$1;->this$1:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFeedLoader$1;

    iget-object p1, p1, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFeedLoader$1;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFeedLoader;

    const v0, 0x7a125

    const-string v1, "no ad"

    invoke-virtual {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/MediationCustomAdBaseLoader;->callLoadFail(ILjava/lang/String;)V

    :goto_0
    return-void
.end method

.method public onAdLoaded(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_2

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 3
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 4
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;

    .line 5
    invoke-interface {v3}, Lcom/aggmoread/sdk/client/AMAdInterface;->getAdExtras()Lcom/aggmoread/sdk/client/AMAdExtras;

    move-result-object v4

    invoke-static {v4}, Lcom/aggmoread/sdk/adapter/helper/AdapterHelper;->getPrice(Lcom/aggmoread/sdk/client/AMAdExtras;)I

    move-result v4

    if-gez v4, :cond_0

    const/4 v4, 0x0

    .line 6
    :cond_0
    new-instance v5, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;

    iget-object v6, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFeedLoader$1$1;->this$1:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFeedLoader$1;

    iget-object v7, v6, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFeedLoader$1;->val$context:Landroid/content/Context;

    iget-object v6, v6, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFeedLoader$1;->val$adSlot:Lcom/bytedance/sdk/openadsdk/AdSlot;

    invoke-direct {v5, v7, v3, v6}, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;-><init>(Landroid/content/Context;Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;Lcom/bytedance/sdk/openadsdk/AdSlot;)V

    int-to-double v3, v4

    .line 7
    invoke-virtual {v5, v3, v4}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/native_ad/MediationCustomNativeAd;->setBiddingPrice(D)V

    .line 8
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 9
    :cond_1
    iget-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFeedLoader$1$1;->this$1:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFeedLoader$1;

    iget-object p1, p1, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFeedLoader$1;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFeedLoader;

    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/native_ad/MediationCustomNativeLoader;->callLoadSuccess(Ljava/util/List;)V

    goto :goto_1

    .line 10
    :cond_2
    iget-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFeedLoader$1$1;->this$1:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFeedLoader$1;

    iget-object p1, p1, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFeedLoader$1;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomFeedLoader;

    const v0, 0x7a125

    const-string v1, "\u5e7f\u544a\u52a0\u8f7d\u5931\u8d25\uff0c\u6ca1\u6709\u5339\u914d\u5230\u5408\u9002\u7684\u5e7f\u544a!"

    invoke-virtual {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/MediationCustomAdBaseLoader;->callLoadFail(ILjava/lang/String;)V

    :goto_1
    return-void
.end method
