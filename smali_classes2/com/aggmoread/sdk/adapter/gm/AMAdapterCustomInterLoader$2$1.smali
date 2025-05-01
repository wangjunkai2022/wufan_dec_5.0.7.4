.class Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomInterLoader$2$1;
.super Ljava/lang/Object;
.source "AMAdapterCustomInterLoader.java"

# interfaces
.implements Lcom/aggmoread/sdk/client/interstitial/AMInterstitialAdListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomInterLoader$2;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomInterLoader$2;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomInterLoader$2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomInterLoader$2$1;->this$1:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomInterLoader$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdLoadFail(Lcom/aggmoread/sdk/client/AMError;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AMAdapterCustomInterLoader onAdLoadFail "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/aggmoread/sdk/adapter/helper/LogHelper;->log(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onNoAD errorCode = "

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

    .line 3
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomInterLoader$2$1;->this$1:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomInterLoader$2;

    iget-object v0, v0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomInterLoader$2;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomInterLoader;

    iget v1, p1, Lcom/aggmoread/sdk/client/AMError;->code:I

    iget-object p1, p1, Lcom/aggmoread/sdk/client/AMError;->msg:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/MediationCustomAdBaseLoader;->callLoadFail(ILjava/lang/String;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomInterLoader$2$1;->this$1:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomInterLoader$2;

    iget-object p1, p1, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomInterLoader$2;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomInterLoader;

    const v0, 0x7a125

    const-string v1, "no ad"

    invoke-virtual {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/MediationCustomAdBaseLoader;->callLoadFail(ILjava/lang/String;)V

    :goto_0
    return-void
.end method

.method public onAdLoaded(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/aggmoread/sdk/client/interstitial/AMInterstitialAd;",
            ">;)V"
        }
    .end annotation

    const-string v0, "AMAdapterCustomInterLoader onAdLoaded "

    .line 1
    invoke-static {v0}, Lcom/aggmoread/sdk/adapter/helper/LogHelper;->log(Ljava/lang/String;)V

    if-eqz p1, :cond_1

    .line 2
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomInterLoader$2$1;->this$1:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomInterLoader$2;

    iget-object v0, v0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomInterLoader$2;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomInterLoader;

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/aggmoread/sdk/client/interstitial/AMInterstitialAd;

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomInterLoader;->access$102(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomInterLoader;Lcom/aggmoread/sdk/client/interstitial/AMInterstitialAd;)Lcom/aggmoread/sdk/client/interstitial/AMInterstitialAd;

    .line 4
    iget-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomInterLoader$2$1;->this$1:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomInterLoader$2;

    iget-object p1, p1, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomInterLoader$2;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomInterLoader;

    invoke-static {p1}, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomInterLoader;->access$100(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomInterLoader;)Lcom/aggmoread/sdk/client/interstitial/AMInterstitialAd;

    move-result-object p1

    invoke-interface {p1}, Lcom/aggmoread/sdk/client/AMAdInterface;->getAdExtras()Lcom/aggmoread/sdk/client/AMAdExtras;

    move-result-object p1

    invoke-static {p1}, Lcom/aggmoread/sdk/adapter/helper/AdapterHelper;->getPrice(Lcom/aggmoread/sdk/client/AMAdExtras;)I

    move-result p1

    if-lez p1, :cond_0

    .line 5
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomInterLoader$2$1;->this$1:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomInterLoader$2;

    iget-object v0, v0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomInterLoader$2;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomInterLoader;

    int-to-double v1, p1

    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/interstitial/MediationCustomInterstitialLoader;->callLoadSuccess(D)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomInterLoader$2$1;->this$1:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomInterLoader$2;

    iget-object p1, p1, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomInterLoader$2;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomInterLoader;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/interstitial/MediationCustomInterstitialLoader;->callLoadSuccess()V

    goto :goto_0

    .line 7
    :cond_1
    iget-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomInterLoader$2$1;->this$1:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomInterLoader$2;

    iget-object p1, p1, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomInterLoader$2;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomInterLoader;

    const v0, 0x7a125

    const-string v1, "\u5e7f\u544a\u52a0\u8f7d\u5931\u8d25\uff0c\u6ca1\u6709\u5339\u914d\u5230\u5408\u9002\u7684\u5e7f\u544a!"

    invoke-virtual {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/MediationCustomAdBaseLoader;->callLoadFail(ILjava/lang/String;)V

    :goto_0
    return-void
.end method

.method public onAdVideoCached()V
    .locals 0

    return-void
.end method
