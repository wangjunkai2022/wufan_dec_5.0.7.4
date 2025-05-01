.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/qq/e/ads/nativ/NativeADMediaListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;->a(Lcom/qq/e/ads/nativ/MediaView;Lcom/aggmoread/sdk/z/c/a/a/c/t/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/c/a/a/c/t/a;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;Lcom/aggmoread/sdk/z/c/a/a/c/t/a;)V
    .locals 0

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e$b;->a:Lcom/aggmoread/sdk/z/c/a/a/c/t/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onVideoClicked()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e$b;->a:Lcom/aggmoread/sdk/z/c/a/a/c/t/a;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/t/a;->onVideoClicked()V

    return-void
.end method

.method public onVideoCompleted()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e$b;->a:Lcom/aggmoread/sdk/z/c/a/a/c/t/a;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/t/a;->onVideoCompleted()V

    return-void
.end method

.method public onVideoError(Lcom/qq/e/comm/util/AdError;)V
    .locals 2

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    invoke-virtual {p1}, Lcom/qq/e/comm/util/AdError;->getErrorCode()I

    move-result v1

    invoke-virtual {p1}, Lcom/qq/e/comm/util/AdError;->getErrorMsg()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e$b;->a:Lcom/aggmoread/sdk/z/c/a/a/c/t/a;

    invoke-interface {p1, v0}, Lcom/aggmoread/sdk/z/c/a/a/c/t/a;->a(Lcom/aggmoread/sdk/z/c/a/a/c/d;)V

    return-void
.end method

.method public onVideoInit()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e$b;->a:Lcom/aggmoread/sdk/z/c/a/a/c/t/a;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/t/a;->onVideoInit()V

    return-void
.end method

.method public onVideoLoaded(I)V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e$b;->a:Lcom/aggmoread/sdk/z/c/a/a/c/t/a;

    invoke-interface {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/a;->onVideoLoaded(I)V

    return-void
.end method

.method public onVideoLoading()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e$b;->a:Lcom/aggmoread/sdk/z/c/a/a/c/t/a;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/t/a;->onVideoLoading()V

    return-void
.end method

.method public onVideoPause()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e$b;->a:Lcom/aggmoread/sdk/z/c/a/a/c/t/a;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/t/a;->onVideoPause()V

    return-void
.end method

.method public onVideoReady()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e$b;->a:Lcom/aggmoread/sdk/z/c/a/a/c/t/a;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/t/a;->onVideoReady()V

    return-void
.end method

.method public onVideoResume()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e$b;->a:Lcom/aggmoread/sdk/z/c/a/a/c/t/a;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/t/a;->onVideoResume()V

    return-void
.end method

.method public onVideoStart()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e$b;->a:Lcom/aggmoread/sdk/z/c/a/a/c/t/a;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/t/a;->onVideoStart()V

    return-void
.end method

.method public onVideoStop()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e$b;->a:Lcom/aggmoread/sdk/z/c/a/a/c/t/a;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/t/a;->onVideoStop()V

    return-void
.end method
