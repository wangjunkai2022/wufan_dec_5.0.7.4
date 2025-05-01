.class Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$1$1;
.super Ljava/lang/Object;
.source "AMCustomNativeAd.java"

# interfaces
.implements Lcom/aggmoread/sdk/client/feedlist/AMNativeInteractionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$1;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$1$1;->this$1:Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onADStatusChanged(I)V
    .locals 0

    return-void
.end method

.method public onAdClicked()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$1$1;->this$1:Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$1;

    iget-object v0, v0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$1;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;

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
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$1$1;->this$1:Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$1;

    iget-object v0, v0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$1;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/native_ad/MediationCustomNativeAd;->callAdShow()V

    return-void
.end method

.method public onLoadApkProgress(I)V
    .locals 0

    return-void
.end method
