.class Lcom/aggmoread/sdk/adapter/gm/AMAdapterInit$1;
.super Ljava/lang/Object;
.source "AMAdapterInit.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/adapter/gm/AMAdapterInit;->initializeADN(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/mediation/custom/MediationCustomInitConfig;Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterInit;

.field final synthetic val$context:Landroid/content/Context;

.field final synthetic val$map:Ljava/util/Map;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/adapter/gm/AMAdapterInit;Ljava/util/Map;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterInit$1;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterInit;

    iput-object p2, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterInit$1;->val$map:Ljava/util/Map;

    iput-object p3, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterInit$1;->val$context:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    new-instance v0, Lcom/aggmoread/sdk/client/AMAdConfig$Builder;

    invoke-direct {v0}, Lcom/aggmoread/sdk/client/AMAdConfig$Builder;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterInit$1;->val$map:Ljava/util/Map;

    invoke-static {v1}, Lcom/aggmoread/sdk/adapter/helper/AdapterHelper;->getLocalCustomController(Ljava/util/Map;)Lcom/aggmoread/sdk/client/AMCustomController;

    move-result-object v1

    .line 3
    new-instance v2, Lcom/aggmoread/sdk/adapter/gm/AMAdapterInit$1$1;

    invoke-direct {v2, p0, v1}, Lcom/aggmoread/sdk/adapter/gm/AMAdapterInit$1$1;-><init>(Lcom/aggmoread/sdk/adapter/gm/AMAdapterInit$1;Lcom/aggmoread/sdk/client/AMCustomController;)V

    invoke-virtual {v0, v2}, Lcom/aggmoread/sdk/client/AMAdConfig$Builder;->setCustomController(Lcom/aggmoread/sdk/client/AMCustomController;)Lcom/aggmoread/sdk/client/AMAdConfig$Builder;

    const-string v1, "initializeADN amSdk init "

    .line 4
    invoke-static {v1}, Lcom/aggmoread/sdk/adapter/helper/LogHelper;->log(Ljava/lang/String;)V

    .line 5
    iget-object v1, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterInit$1;->val$context:Landroid/content/Context;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/client/AMAdConfig$Builder;->build()Lcom/aggmoread/sdk/client/AMAdConfig;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/client/AMSdk;->init(Landroid/content/Context;Lcom/aggmoread/sdk/client/AMAdConfig;)V

    return-void
.end method
