.class Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$3;
.super Ljava/lang/Object;
.source "AMCustomNativeAd.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;->onResume()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$3;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;->access$300()Ljava/lang/String;

    .line 2
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$3;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;

    invoke-static {v0}, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;->access$000(Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;)Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd$3;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;

    invoke-static {v0}, Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;->access$000(Lcom/aggmoread/sdk/adapter/gm/AMCustomNativeAd;)Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;

    move-result-object v0

    invoke-interface {v0}, Lcom/aggmoread/sdk/client/feedlist/AMNativeAd;->resume()V

    :cond_0
    return-void
.end method
