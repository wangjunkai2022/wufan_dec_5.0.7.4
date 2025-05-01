.class Lcom/aggmoread/sdk/b/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/c/a/a/c/n/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/b/g;->setVideoListener(Lcom/aggmoread/sdk/client/draw/AMDrawAd$DrawVideoListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/client/draw/AMDrawAd$DrawVideoListener;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/b/g;Lcom/aggmoread/sdk/client/draw/AMDrawAd$DrawVideoListener;)V
    .locals 0

    iput-object p2, p0, Lcom/aggmoread/sdk/b/g$b;->a:Lcom/aggmoread/sdk/client/draw/AMDrawAd$DrawVideoListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 0

    return-void
.end method

.method public a(Lcom/aggmoread/sdk/z/c/a/a/c/d;)V
    .locals 3

    iget-object v0, p0, Lcom/aggmoread/sdk/b/g$b;->a:Lcom/aggmoread/sdk/client/draw/AMDrawAd$DrawVideoListener;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/aggmoread/sdk/client/AMError;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/c/d;->a()I

    move-result v2

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/c/d;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Lcom/aggmoread/sdk/client/AMError;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/aggmoread/sdk/client/draw/AMDrawAd$DrawVideoListener;->onVideoError(Lcom/aggmoread/sdk/client/AMError;)V

    :cond_0
    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method public onVideoCached()V
    .locals 0

    return-void
.end method

.method public onVideoComplete()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/g$b;->a:Lcom/aggmoread/sdk/client/draw/AMDrawAd$DrawVideoListener;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aggmoread/sdk/client/draw/AMDrawAd$DrawVideoListener;->onVideoComplete()V

    :cond_0
    return-void
.end method

.method public onVideoInit()V
    .locals 0

    return-void
.end method

.method public onVideoLoading()V
    .locals 0

    return-void
.end method

.method public onVideoPause()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/g$b;->a:Lcom/aggmoread/sdk/client/draw/AMDrawAd$DrawVideoListener;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aggmoread/sdk/client/draw/AMDrawAd$DrawVideoListener;->onVideoPause()V

    :cond_0
    return-void
.end method

.method public onVideoStart()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/g$b;->a:Lcom/aggmoread/sdk/client/draw/AMDrawAd$DrawVideoListener;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aggmoread/sdk/client/draw/AMDrawAd$DrawVideoListener;->onVideoStart()V

    :cond_0
    return-void
.end method
