.class Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd$3;
.super Ljava/lang/Object;
.source "AMCustomDrawAd.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd;->render()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd$3;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd$3;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd;

    invoke-static {v0}, Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd;->access$000(Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd;)Lcom/aggmoread/sdk/client/draw/AMDrawAd;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v0, "render runner"

    .line 2
    invoke-static {v0}, Lcom/aggmoread/sdk/adapter/helper/LogHelper;->log(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd$3;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd;

    invoke-static {v0}, Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd;->access$000(Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd;)Lcom/aggmoread/sdk/client/draw/AMDrawAd;

    move-result-object v0

    invoke-interface {v0}, Lcom/aggmoread/sdk/client/draw/AMDrawAd;->getView()Landroid/view/View;

    .line 4
    iget-object v0, p0, Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd$3;->this$0:Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd;

    invoke-static {v0}, Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd;->access$000(Lcom/aggmoread/sdk/adapter/gm/AMCustomDrawAd;)Lcom/aggmoread/sdk/client/draw/AMDrawAd;

    move-result-object v0

    invoke-interface {v0}, Lcom/aggmoread/sdk/client/draw/AMDrawAd;->render()V

    :cond_0
    return-void
.end method
