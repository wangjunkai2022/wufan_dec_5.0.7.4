.class Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$1;
.super Ljava/lang/Object;
.source "AMCustomNativeAd.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;->registerView(Landroid/app/Activity;Landroid/view/ViewGroup;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;

.field final synthetic val$activity:Landroid/app/Activity;

.field final synthetic val$clickViews:Ljava/util/List;

.field final synthetic val$container:Landroid/view/ViewGroup;

.field final synthetic val$viewBinder:Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;Landroid/view/ViewGroup;Landroid/app/Activity;Ljava/util/List;Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$1;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;

    iput-object p2, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$1;->val$container:Landroid/view/ViewGroup;

    iput-object p3, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$1;->val$activity:Landroid/app/Activity;

    iput-object p4, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$1;->val$clickViews:Ljava/util/List;

    iput-object p5, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$1;->val$viewBinder:Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$1;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;

    invoke-static {v0}, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;->access$000(Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;)Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$1;->val$container:Landroid/view/ViewGroup;

    instance-of v1, v0, Landroid/widget/FrameLayout;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Landroid/widget/FrameLayout;

    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "registerView #4 nativeAdContainer "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/aggmoread/sdk/adapter/helper/LogHelper;->log(Ljava/lang/String;)V

    .line 4
    iget-object v1, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$1;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;

    invoke-static {v1}, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;->access$000(Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;)Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;

    move-result-object v2

    iget-object v3, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$1;->val$activity:Landroid/app/Activity;

    iget-object v1, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$1;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;

    invoke-static {v1}, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;->access$100(Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;)Lcom/bytedance/sdk/openadsdk/AdSlot;

    move-result-object v1

    invoke-static {v1}, Lcom/aggmoread/sdk/adapter/helper/AdapterHelper;->getNativeAdLogoParams(Lcom/bytedance/sdk/openadsdk/AdSlot;)Landroid/widget/FrameLayout$LayoutParams;

    move-result-object v5

    iget-object v6, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$1;->val$clickViews:Ljava/util/List;

    const/4 v7, 0x0

    new-instance v8, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$1$1;

    invoke-direct {v8, p0}, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$1$1;-><init>(Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$1;)V

    move-object v4, v0

    invoke-interface/range {v2 .. v8}, Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;->bindAdToView(Landroid/content/Context;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;Ljava/util/List;Landroid/view/View;Lcom/aggmoread/sdk/client/feedlist/AMNativeInteractionListener;)Landroid/view/View;

    .line 5
    iget-object v1, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$1;->val$viewBinder:Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;

    iget v1, v1, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;->mediaViewId:I

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    if-eqz v0, :cond_0

    .line 6
    iget-object v1, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$1;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;

    invoke-static {v1}, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;->access$000(Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;)Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;

    move-result-object v1

    invoke-interface {v1}, Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;->isVideoAd()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "registerView media "

    .line 7
    invoke-static {v1}, Lcom/aggmoread/sdk/adapter/helper/LogHelper;->log(Ljava/lang/String;)V

    .line 8
    new-instance v1, Lcom/aggmoread/sdk/client/AMAdMediaView;

    iget-object v2, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$1;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;

    invoke-static {v2}, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;->access$200(Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;)Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/aggmoread/sdk/client/AMAdMediaView;-><init>(Landroid/content/Context;)V

    .line 9
    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    const/4 v2, -0x1

    .line 10
    invoke-virtual {v0, v1, v2, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;II)V

    .line 11
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$1;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;

    invoke-static {v0}, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;->access$000(Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;)Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;

    move-result-object v0

    new-instance v2, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$1$2;

    invoke-direct {v2, p0}, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$1$2;-><init>(Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$1;)V

    invoke-interface {v0, v1, v2}, Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;->bindMediaAdToView(Lcom/aggmoread/sdk/client/AMAdMediaView;Lcom/aggmoread/sdk/client/AMAdMediaListener;)V

    :cond_0
    return-void
.end method
