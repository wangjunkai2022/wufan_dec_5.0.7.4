.class Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$2;
.super Ljava/lang/Object;
.source "AMAdapterCustomSplashLoader.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader;->load(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/mediation/custom/MediationCustomServiceConfig;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader;

.field final synthetic val$context:Landroid/content/Context;

.field final synthetic val$mediationCustomServiceConfig:Lcom/bytedance/sdk/openadsdk/mediation/custom/MediationCustomServiceConfig;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader;Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/mediation/custom/MediationCustomServiceConfig;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$2;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader;

    iput-object p2, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$2;->val$context:Landroid/content/Context;

    iput-object p3, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$2;->val$mediationCustomServiceConfig:Lcom/bytedance/sdk/openadsdk/mediation/custom/MediationCustomServiceConfig;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$2;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader;

    iget-object v1, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$2;->val$context:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader;->access$102(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader;Landroid/content/Context;)Landroid/content/Context;

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$2;->val$mediationCustomServiceConfig:Lcom/bytedance/sdk/openadsdk/mediation/custom/MediationCustomServiceConfig;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/custom/MediationCustomServiceConfig;->getADNNetworkSlotId()Ljava/lang/String;

    move-result-object v0

    .line 3
    new-instance v1, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;

    invoke-direct {v1}, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;-><init>()V

    .line 4
    invoke-virtual {v1, v0}, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->setSlotId(Ljava/lang/String;)Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;

    move-result-object v0

    const/4 v1, 0x1

    .line 5
    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->setAdCount(I)Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;

    move-result-object v0

    const/16 v1, 0xbb8

    .line 6
    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->setFetchTimeOut(I)Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->build()Lcom/aggmoread/sdk/client/AMAdLoadSlot;

    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/aggmoread/sdk/client/AMSdk;->makeAdLoader(Lcom/aggmoread/sdk/client/AMAdLoadSlot;)Lcom/aggmoread/sdk/client/AMAdLoader;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 8
    iget-object v1, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$2;->val$context:Landroid/content/Context;

    new-instance v2, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$2$1;

    invoke-direct {v2, p0}, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$2$1;-><init>(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$2;)V

    invoke-virtual {v0, v1, v2}, Lcom/aggmoread/sdk/client/AMAdLoader;->loadSplashAd(Landroid/content/Context;Lcom/aggmoread/sdk/client/splash/AMSplashAdListener;)V

    goto :goto_0

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$2;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader;

    const v1, -0x7a120

    const-string v2, "\u5e7f\u544a\u52a0\u8f7d\u5668\u6784\u5efa\u5931\u8d25!"

    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/custom/MediationCustomAdBaseLoader;->callLoadFail(ILjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "splash err "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/aggmoread/sdk/adapter/helper/LogHelper;->log(Ljava/lang/String;)V

    :goto_0
    return-void
.end method
