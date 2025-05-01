.class Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$1;
.super Ljava/lang/Object;
.source "AMAdapterCustomSplashLoader.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader;->showAd(Landroid/view/ViewGroup;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader;

.field final synthetic val$viewGroup:Landroid/view/ViewGroup;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader;Landroid/view/ViewGroup;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$1;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader;

    iput-object p2, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$1;->val$viewGroup:Landroid/view/ViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$1;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader;

    invoke-static {v0}, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader;->access$000(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader;)Lcom/aggmoread/sdk/client/splash/AMSplashAd;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$1;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader;

    invoke-static {v0}, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader;->access$000(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader;)Lcom/aggmoread/sdk/client/splash/AMSplashAd;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$1;->val$viewGroup:Landroid/view/ViewGroup;

    new-instance v2, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$1$1;

    invoke-direct {v2, p0}, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$1$1;-><init>(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomSplashLoader$1;)V

    invoke-interface {v0, v1, v2}, Lcom/aggmoread/sdk/client/splash/AMSplashAd;->showViewGroup(Landroid/view/ViewGroup;Lcom/aggmoread/sdk/client/splash/AMSplashInteractionListener;)V

    goto :goto_0

    :cond_0
    const-string v0, "splash show err , ad is null\uff01"

    .line 3
    invoke-static {v0}, Lcom/aggmoread/sdk/adapter/helper/LogHelper;->log(Ljava/lang/String;)V

    :goto_0
    return-void
.end method
