.class Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$1$1;
.super Ljava/lang/Object;
.source "AMAdapterCustomSplashLoader.java"

# interfaces
.implements Lcom/aggmoread/sdk/client/splash/AMSplashInteractionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$1;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$1$1;->this$1:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdClicked()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$1$1;->this$1:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$1;

    iget-object v0, v0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$1;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/splash/MediationCustomSplashLoader;->callSplashAdClicked()V

    return-void
.end method

.method public onAdClosed()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$1$1;->this$1:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$1;

    iget-object v0, v0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$1;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/splash/MediationCustomSplashLoader;->callSplashAdDismiss()V

    return-void
.end method

.method public onAdError(Lcom/aggmoread/sdk/client/AMError;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "splash show err : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/aggmoread/sdk/adapter/helper/LogHelper;->log(Ljava/lang/String;)V

    return-void
.end method

.method public onAdExposed()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$1$1;->this$1:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$1;

    iget-object v0, v0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$1;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/splash/MediationCustomSplashLoader;->callSplashAdShow()V

    return-void
.end method

.method public onAdTick(J)V
    .locals 0

    return-void
.end method
