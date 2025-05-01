.class Lcom/aggmoread/sdk/b/k$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/c/a/a/c/t/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/b/k;->bindMediaAdToView(Lcom/aggmoread/sdk/client/AMAdMediaView;Lcom/aggmoread/sdk/client/AMAdMediaListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/client/AMAdMediaListener;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/b/k;Lcom/aggmoread/sdk/client/AMAdMediaListener;)V
    .locals 0

    iput-object p2, p0, Lcom/aggmoread/sdk/b/k$b;->a:Lcom/aggmoread/sdk/client/AMAdMediaListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/aggmoread/sdk/z/c/a/a/c/d;)V
    .locals 3

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k$b;->a:Lcom/aggmoread/sdk/client/AMAdMediaListener;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/aggmoread/sdk/client/AMError;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/c/d;->a()I

    move-result v2

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/c/d;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Lcom/aggmoread/sdk/client/AMError;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/aggmoread/sdk/client/AMAdMediaListener;->onVideoError(Lcom/aggmoread/sdk/client/AMError;)V

    :cond_0
    return-void
.end method

.method public onVideoClicked()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k$b;->a:Lcom/aggmoread/sdk/client/AMAdMediaListener;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aggmoread/sdk/client/AMAdMediaListener;->onVideoClicked()V

    :cond_0
    return-void
.end method

.method public onVideoCompleted()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k$b;->a:Lcom/aggmoread/sdk/client/AMAdMediaListener;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aggmoread/sdk/client/AMAdMediaListener;->onVideoCompleted()V

    :cond_0
    return-void
.end method

.method public onVideoInit()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k$b;->a:Lcom/aggmoread/sdk/client/AMAdMediaListener;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aggmoread/sdk/client/AMAdMediaListener;->onVideoInit()V

    :cond_0
    return-void
.end method

.method public onVideoLoaded(I)V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k$b;->a:Lcom/aggmoread/sdk/client/AMAdMediaListener;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/aggmoread/sdk/client/AMAdMediaListener;->onVideoLoaded(I)V

    :cond_0
    return-void
.end method

.method public onVideoLoading()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k$b;->a:Lcom/aggmoread/sdk/client/AMAdMediaListener;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aggmoread/sdk/client/AMAdMediaListener;->onVideoLoading()V

    :cond_0
    return-void
.end method

.method public onVideoPause()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k$b;->a:Lcom/aggmoread/sdk/client/AMAdMediaListener;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aggmoread/sdk/client/AMAdMediaListener;->onVideoPause()V

    :cond_0
    return-void
.end method

.method public onVideoReady()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k$b;->a:Lcom/aggmoread/sdk/client/AMAdMediaListener;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aggmoread/sdk/client/AMAdMediaListener;->onVideoReady()V

    :cond_0
    return-void
.end method

.method public onVideoResume()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k$b;->a:Lcom/aggmoread/sdk/client/AMAdMediaListener;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aggmoread/sdk/client/AMAdMediaListener;->onVideoResume()V

    :cond_0
    return-void
.end method

.method public onVideoStart()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k$b;->a:Lcom/aggmoread/sdk/client/AMAdMediaListener;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aggmoread/sdk/client/AMAdMediaListener;->onVideoStart()V

    :cond_0
    return-void
.end method

.method public onVideoStop()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k$b;->a:Lcom/aggmoread/sdk/client/AMAdMediaListener;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aggmoread/sdk/client/AMAdMediaListener;->onVideoStop()V

    :cond_0
    return-void
.end method
