.class Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd$1;
.super Ljava/lang/Object;
.source "AMCustomExpressAd.java"

# interfaces
.implements Lcom/aggmoread/sdk/client/feedlist/AMExpressAd$ExpressMediaListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd;-><init>(Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;Lcom/bytedance/sdk/openadsdk/AdSlot;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd$1;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onVideoCached(Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;)V
    .locals 0

    return-void
.end method

.method public onVideoComplete(Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd$1;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/native_ad/MediationCustomNativeAd;->callVideoCompleted()V

    return-void
.end method

.method public onVideoError(Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;Lcom/aggmoread/sdk/client/AMError;)V
    .locals 1

    if-eqz p2, :cond_0

    .line 1
    invoke-static {}, Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd;->access$000()Ljava/lang/String;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onVideoError errorCode = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p2, Lcom/aggmoread/sdk/client/AMError;->code:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " errorMessage = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p2, Lcom/aggmoread/sdk/client/AMError;->msg:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd$1;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd;

    iget v0, p2, Lcom/aggmoread/sdk/client/AMError;->code:I

    iget-object p2, p2, Lcom/aggmoread/sdk/client/AMError;->msg:Ljava/lang/String;

    invoke-virtual {p1, v0, p2}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/native_ad/MediationCustomNativeAd;->callVideoError(ILjava/lang/String;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd$1;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd;

    const p2, 0x7a129

    const-string v0, "video error"

    invoke-virtual {p1, p2, v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/native_ad/MediationCustomNativeAd;->callVideoError(ILjava/lang/String;)V

    :goto_0
    return-void
.end method

.method public onVideoInit(Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;)V
    .locals 0

    return-void
.end method

.method public onVideoLoading(Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;)V
    .locals 0

    return-void
.end method

.method public onVideoPageClose(Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;)V
    .locals 0

    return-void
.end method

.method public onVideoPageOpen(Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;)V
    .locals 0

    return-void
.end method

.method public onVideoPause(Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd$1;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/native_ad/MediationCustomNativeAd;->callVideoPause()V

    return-void
.end method

.method public onVideoReady(Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;J)V
    .locals 0

    return-void
.end method

.method public onVideoStart(Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd$1;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/native_ad/MediationCustomNativeAd;->callVideoStart()V

    return-void
.end method
