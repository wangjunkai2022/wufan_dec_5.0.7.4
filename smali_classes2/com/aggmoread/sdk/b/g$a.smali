.class Lcom/aggmoread/sdk/b/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/c/a/a/c/n/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/b/g;-><init>(Lcom/aggmoread/sdk/z/c/a/a/c/n/a;Lcom/aggmoread/sdk/b/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/b/g;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/b/g;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/b/g$a;->a:Lcom/aggmoread/sdk/b/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public a(Lcom/aggmoread/sdk/z/c/a/a/c/d;)V
    .locals 0

    return-void
.end method

.method public onADCloseOverlay()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/g$a;->a:Lcom/aggmoread/sdk/b/g;

    iget-object v0, v0, Lcom/aggmoread/sdk/b/g;->c:Lcom/aggmoread/sdk/client/draw/AMDrawAdInteractionListener;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aggmoread/sdk/client/draw/AMDrawAdInteractionListener;->onADCloseOverlay()V

    :cond_0
    return-void
.end method

.method public onADLeftApplication()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/g$a;->a:Lcom/aggmoread/sdk/b/g;

    iget-object v0, v0, Lcom/aggmoread/sdk/b/g;->c:Lcom/aggmoread/sdk/client/draw/AMDrawAdInteractionListener;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aggmoread/sdk/client/draw/AMDrawAdInteractionListener;->onADLeftApplication()V

    :cond_0
    return-void
.end method

.method public onADOpenOverlay()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/g$a;->a:Lcom/aggmoread/sdk/b/g;

    iget-object v0, v0, Lcom/aggmoread/sdk/b/g;->c:Lcom/aggmoread/sdk/client/draw/AMDrawAdInteractionListener;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aggmoread/sdk/client/draw/AMDrawAdInteractionListener;->onADOpenOverlay()V

    :cond_0
    return-void
.end method

.method public onAdClicked()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/g$a;->a:Lcom/aggmoread/sdk/b/g;

    iget-object v0, v0, Lcom/aggmoread/sdk/b/g;->c:Lcom/aggmoread/sdk/client/draw/AMDrawAdInteractionListener;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aggmoread/sdk/client/draw/AMDrawAdInteractionListener;->onAdClicked()V

    :cond_0
    return-void
.end method

.method public onAdExposed()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/g$a;->a:Lcom/aggmoread/sdk/b/g;

    iget-object v0, v0, Lcom/aggmoread/sdk/b/g;->c:Lcom/aggmoread/sdk/client/draw/AMDrawAdInteractionListener;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aggmoread/sdk/client/draw/AMDrawAdInteractionListener;->onAdExposed()V

    :cond_0
    return-void
.end method

.method public onRenderFail()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/g$a;->a:Lcom/aggmoread/sdk/b/g;

    iget-object v0, v0, Lcom/aggmoread/sdk/b/g;->c:Lcom/aggmoread/sdk/client/draw/AMDrawAdInteractionListener;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aggmoread/sdk/client/draw/AMDrawAdInteractionListener;->onRenderFail()V

    :cond_0
    return-void
.end method

.method public onRenderSuccess()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/g$a;->a:Lcom/aggmoread/sdk/b/g;

    iget-object v0, v0, Lcom/aggmoread/sdk/b/g;->c:Lcom/aggmoread/sdk/client/draw/AMDrawAdInteractionListener;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aggmoread/sdk/client/draw/AMDrawAdInteractionListener;->onRenderSuccess()V

    :cond_0
    return-void
.end method
