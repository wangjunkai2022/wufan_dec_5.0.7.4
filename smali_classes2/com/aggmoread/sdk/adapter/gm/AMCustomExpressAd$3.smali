.class Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd$3;
.super Ljava/lang/Object;
.source "AMCustomExpressAd.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd;->render()V
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
    iput-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd$3;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd$3;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd;

    invoke-static {v0}, Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd;->access$100(Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd;)Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd$3;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd;

    invoke-static {v0}, Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd;->access$100(Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd;)Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;

    move-result-object v0

    invoke-interface {v0}, Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;->getView()Landroid/view/View;

    .line 3
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd$3;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd;

    invoke-static {v0}, Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd;->access$100(Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd;)Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;

    move-result-object v0

    invoke-interface {v0}, Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;->render()V

    :cond_0
    return-void
.end method
