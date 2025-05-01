.class Lcom/aggmoread/sdk/b/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/c/a/a/c/o/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/b/h;-><init>(Lcom/aggmoread/sdk/z/c/a/a/c/o/c;Lcom/aggmoread/sdk/b/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/b/h;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/b/h;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/b/h$a;->a:Lcom/aggmoread/sdk/b/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/b/h$a;->a:Lcom/aggmoread/sdk/b/h;

    iget-object v1, v0, Lcom/aggmoread/sdk/b/h;->c:Lcom/aggmoread/sdk/client/feedlist/AMExpressInteractionListener;

    if-eqz v1, :cond_0

    invoke-interface {v1, v0}, Lcom/aggmoread/sdk/client/feedlist/AMExpressInteractionListener;->onAdClosed(Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/aggmoread/sdk/z/c/a/a/c/d;)V
    .locals 0

    return-void
.end method

.method public onADCloseOverlay()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/b/h$a;->a:Lcom/aggmoread/sdk/b/h;

    iget-object v1, v0, Lcom/aggmoread/sdk/b/h;->c:Lcom/aggmoread/sdk/client/feedlist/AMExpressInteractionListener;

    if-eqz v1, :cond_0

    invoke-interface {v1, v0}, Lcom/aggmoread/sdk/client/feedlist/AMExpressInteractionListener;->onADCloseOverlay(Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;)V

    :cond_0
    return-void
.end method

.method public onADLeftApplication()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/b/h$a;->a:Lcom/aggmoread/sdk/b/h;

    iget-object v1, v0, Lcom/aggmoread/sdk/b/h;->c:Lcom/aggmoread/sdk/client/feedlist/AMExpressInteractionListener;

    if-eqz v1, :cond_0

    invoke-interface {v1, v0}, Lcom/aggmoread/sdk/client/feedlist/AMExpressInteractionListener;->onADLeftApplication(Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;)V

    :cond_0
    return-void
.end method

.method public onADOpenOverlay()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/b/h$a;->a:Lcom/aggmoread/sdk/b/h;

    iget-object v1, v0, Lcom/aggmoread/sdk/b/h;->c:Lcom/aggmoread/sdk/client/feedlist/AMExpressInteractionListener;

    if-eqz v1, :cond_0

    invoke-interface {v1, v0}, Lcom/aggmoread/sdk/client/feedlist/AMExpressInteractionListener;->onADOpenOverlay(Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;)V

    :cond_0
    return-void
.end method

.method public onAdClicked()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/b/h$a;->a:Lcom/aggmoread/sdk/b/h;

    iget-object v1, v0, Lcom/aggmoread/sdk/b/h;->c:Lcom/aggmoread/sdk/client/feedlist/AMExpressInteractionListener;

    if-eqz v1, :cond_0

    invoke-interface {v1, v0}, Lcom/aggmoread/sdk/client/feedlist/AMExpressInteractionListener;->onAdClicked(Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;)V

    :cond_0
    return-void
.end method

.method public onAdExposed()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/b/h$a;->a:Lcom/aggmoread/sdk/b/h;

    iget-object v1, v0, Lcom/aggmoread/sdk/b/h;->c:Lcom/aggmoread/sdk/client/feedlist/AMExpressInteractionListener;

    if-eqz v1, :cond_0

    invoke-interface {v1, v0}, Lcom/aggmoread/sdk/client/feedlist/AMExpressInteractionListener;->onAdExposed(Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;)V

    :cond_0
    return-void
.end method

.method public onRenderFail()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/b/h$a;->a:Lcom/aggmoread/sdk/b/h;

    iget-object v1, v0, Lcom/aggmoread/sdk/b/h;->c:Lcom/aggmoread/sdk/client/feedlist/AMExpressInteractionListener;

    if-eqz v1, :cond_0

    invoke-interface {v1, v0}, Lcom/aggmoread/sdk/client/feedlist/AMExpressInteractionListener;->onRenderFail(Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;)V

    :cond_0
    return-void
.end method

.method public onRenderSuccess()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/b/h$a;->a:Lcom/aggmoread/sdk/b/h;

    iget-object v1, v0, Lcom/aggmoread/sdk/b/h;->c:Lcom/aggmoread/sdk/client/feedlist/AMExpressInteractionListener;

    if-eqz v1, :cond_0

    invoke-interface {v1, v0}, Lcom/aggmoread/sdk/client/feedlist/AMExpressInteractionListener;->onRenderSuccess(Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;)V

    :cond_0
    return-void
.end method
