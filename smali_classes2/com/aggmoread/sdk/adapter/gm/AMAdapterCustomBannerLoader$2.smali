.class Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomBannerLoader$2;
.super Ljava/lang/Object;
.source "AMAdapterCustomBannerLoader.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomBannerLoader;->getAdView()Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomBannerLoader;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomBannerLoader;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomBannerLoader$2;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomBannerLoader;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    const-string v0, "getAdView runner"

    .line 1
    invoke-static {v0}, Lcom/aggmoread/sdk/adapter/helper/LogHelper;->log(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomBannerLoader$2;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomBannerLoader;

    invoke-static {v0}, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomBannerLoader;->access$100(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomBannerLoader;)Lcom/aggmoread/sdk/client/banner/AMBannerAd;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomBannerLoader$2;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomBannerLoader;

    invoke-static {v1}, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomBannerLoader;->access$200(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomBannerLoader;)Landroid/view/ViewGroup;

    move-result-object v1

    new-instance v2, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomBannerLoader$2$1;

    invoke-direct {v2, p0}, Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomBannerLoader$2$1;-><init>(Lcom/aggmoread/sdk/adapter/gm/AMAdapterCustomBannerLoader$2;)V

    invoke-interface {v0, v1, v2}, Lcom/aggmoread/sdk/client/banner/AMBannerAd;->showInContainer(Landroid/view/ViewGroup;Lcom/aggmoread/sdk/client/banner/AMBannerAdInteractionListener;)V

    return-void
.end method
