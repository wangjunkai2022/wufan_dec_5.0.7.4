.class Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd$2;
.super Ljava/lang/Object;
.source "AMCustomDrawAd.java"

# interfaces
.implements Lcom/aggmoread/sdk/client/draw/AMDrawAdInteractionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd;-><init>(Lcom/aggmoread/sdk/client/draw/AMDrawAd;Lcom/bytedance/sdk/openadsdk/AdSlot;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd;

.field final synthetic val$adSlot:Lcom/bytedance/sdk/openadsdk/AdSlot;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd;Lcom/bytedance/sdk/openadsdk/AdSlot;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd$2;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd;

    iput-object p2, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd$2;->val$adSlot:Lcom/bytedance/sdk/openadsdk/AdSlot;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onADCloseOverlay()V
    .locals 0

    return-void
.end method

.method public onADLeftApplication()V
    .locals 0

    return-void
.end method

.method public onADOpenOverlay()V
    .locals 0

    return-void
.end method

.method public onAdClicked()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd$2;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/native_ad/MediationCustomNativeAd;->callAdClick()V

    return-void
.end method

.method public onAdError(Lcom/aggmoread/sdk/client/AMError;)V
    .locals 0

    return-void
.end method

.method public onAdExposed()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd$2;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/native_ad/MediationCustomNativeAd;->callAdShow()V

    return-void
.end method

.method public onRenderFail()V
    .locals 4

    const-string v0, "onRenderFail"

    .line 1
    invoke-static {v0}, Lcom/aggmoread/sdk/adapter/helper/LogHelper;->log(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd$2;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd;

    const/4 v1, 0x0

    const v2, 0x1869f

    const-string v3, "render fail"

    invoke-virtual {v0, v1, v2, v3}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/native_ad/MediationCustomNativeAd;->callRenderFail(Landroid/view/View;ILjava/lang/String;)V

    return-void
.end method

.method public onRenderSuccess()V
    .locals 3

    const-string v0, "onRenderSuccess"

    .line 1
    invoke-static {v0}, Lcom/aggmoread/sdk/adapter/helper/LogHelper;->log(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd$2;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd;

    iget-object v1, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd$2;->val$adSlot:Lcom/bytedance/sdk/openadsdk/AdSlot;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getImgAcceptedWidth()I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd$2;->val$adSlot:Lcom/bytedance/sdk/openadsdk/AdSlot;

    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getImgAcceptedHeight()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/native_ad/MediationCustomNativeAd;->callRenderSuccess(FF)V

    return-void
.end method
