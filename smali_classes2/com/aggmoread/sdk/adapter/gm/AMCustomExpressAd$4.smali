.class Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd$4;
.super Ljava/lang/Object;
.source "AMCustomExpressAd.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd;->onDestroy()V
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
    iput-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd$4;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd;->access$000()Ljava/lang/String;

    .line 2
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd$4;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd;

    invoke-static {v0}, Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd;->access$100(Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd;)Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd$4;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd;

    invoke-static {v0}, Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd;->access$100(Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd;)Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;

    move-result-object v0

    invoke-interface {v0}, Lcom/aggmoread/sdk/client/AMAdInterface;->destroy()V

    .line 4
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd$4;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd;->access$102(Lcom/aggmoread/sdk/adapter/gm/AMCustomExpressAd;Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;)Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;

    :cond_0
    return-void
.end method
