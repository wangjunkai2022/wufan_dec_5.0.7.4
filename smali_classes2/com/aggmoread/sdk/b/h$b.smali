.class Lcom/aggmoread/sdk/b/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/c/a/a/c/o/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/b/h;->setMediaListener(Lcom/aggmoread/sdk/client/feedlist/AMExpressAd$ExpressMediaListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/client/feedlist/AMExpressAd$ExpressMediaListener;

.field final synthetic b:Lcom/aggmoread/sdk/b/h;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/b/h;Lcom/aggmoread/sdk/client/feedlist/AMExpressAd$ExpressMediaListener;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/b/h$b;->b:Lcom/aggmoread/sdk/b/h;

    iput-object p2, p0, Lcom/aggmoread/sdk/b/h$b;->a:Lcom/aggmoread/sdk/client/feedlist/AMExpressAd$ExpressMediaListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/aggmoread/sdk/z/c/a/a/c/o/c;)V
    .locals 1

    iget-object p1, p0, Lcom/aggmoread/sdk/b/h$b;->a:Lcom/aggmoread/sdk/client/feedlist/AMExpressAd$ExpressMediaListener;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/b/h$b;->b:Lcom/aggmoread/sdk/b/h;

    invoke-interface {p1, v0}, Lcom/aggmoread/sdk/client/feedlist/AMExpressAd$ExpressMediaListener;->onVideoLoading(Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/aggmoread/sdk/z/c/a/a/c/o/c;J)V
    .locals 1

    iget-object p1, p0, Lcom/aggmoread/sdk/b/h$b;->a:Lcom/aggmoread/sdk/client/feedlist/AMExpressAd$ExpressMediaListener;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/b/h$b;->b:Lcom/aggmoread/sdk/b/h;

    invoke-interface {p1, v0, p2, p3}, Lcom/aggmoread/sdk/client/feedlist/AMExpressAd$ExpressMediaListener;->onVideoReady(Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;J)V

    :cond_0
    return-void
.end method

.method public a(Lcom/aggmoread/sdk/z/c/a/a/c/o/c;Lcom/aggmoread/sdk/z/c/a/a/c/d;)V
    .locals 3

    iget-object p1, p0, Lcom/aggmoread/sdk/b/h$b;->a:Lcom/aggmoread/sdk/client/feedlist/AMExpressAd$ExpressMediaListener;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/b/h$b;->b:Lcom/aggmoread/sdk/b/h;

    new-instance v1, Lcom/aggmoread/sdk/client/AMError;

    invoke-interface {p2}, Lcom/aggmoread/sdk/z/c/a/a/c/d;->a()I

    move-result v2

    invoke-interface {p2}, Lcom/aggmoread/sdk/z/c/a/a/c/d;->b()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v1, v2, p2}, Lcom/aggmoread/sdk/client/AMError;-><init>(ILjava/lang/String;)V

    invoke-interface {p1, v0, v1}, Lcom/aggmoread/sdk/client/feedlist/AMExpressAd$ExpressMediaListener;->onVideoError(Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;Lcom/aggmoread/sdk/client/AMError;)V

    :cond_0
    return-void
.end method

.method public b(Lcom/aggmoread/sdk/z/c/a/a/c/o/c;)V
    .locals 1

    iget-object p1, p0, Lcom/aggmoread/sdk/b/h$b;->a:Lcom/aggmoread/sdk/client/feedlist/AMExpressAd$ExpressMediaListener;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/b/h$b;->b:Lcom/aggmoread/sdk/b/h;

    invoke-interface {p1, v0}, Lcom/aggmoread/sdk/client/feedlist/AMExpressAd$ExpressMediaListener;->onVideoCached(Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;)V

    :cond_0
    return-void
.end method

.method public c(Lcom/aggmoread/sdk/z/c/a/a/c/o/c;)V
    .locals 1

    iget-object p1, p0, Lcom/aggmoread/sdk/b/h$b;->a:Lcom/aggmoread/sdk/client/feedlist/AMExpressAd$ExpressMediaListener;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/b/h$b;->b:Lcom/aggmoread/sdk/b/h;

    invoke-interface {p1, v0}, Lcom/aggmoread/sdk/client/feedlist/AMExpressAd$ExpressMediaListener;->onVideoPageOpen(Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;)V

    :cond_0
    return-void
.end method

.method public d(Lcom/aggmoread/sdk/z/c/a/a/c/o/c;)V
    .locals 1

    iget-object p1, p0, Lcom/aggmoread/sdk/b/h$b;->a:Lcom/aggmoread/sdk/client/feedlist/AMExpressAd$ExpressMediaListener;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/b/h$b;->b:Lcom/aggmoread/sdk/b/h;

    invoke-interface {p1, v0}, Lcom/aggmoread/sdk/client/feedlist/AMExpressAd$ExpressMediaListener;->onVideoPause(Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;)V

    :cond_0
    return-void
.end method

.method public e(Lcom/aggmoread/sdk/z/c/a/a/c/o/c;)V
    .locals 1

    iget-object p1, p0, Lcom/aggmoread/sdk/b/h$b;->a:Lcom/aggmoread/sdk/client/feedlist/AMExpressAd$ExpressMediaListener;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/b/h$b;->b:Lcom/aggmoread/sdk/b/h;

    invoke-interface {p1, v0}, Lcom/aggmoread/sdk/client/feedlist/AMExpressAd$ExpressMediaListener;->onVideoInit(Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;)V

    :cond_0
    return-void
.end method

.method public f(Lcom/aggmoread/sdk/z/c/a/a/c/o/c;)V
    .locals 1

    iget-object p1, p0, Lcom/aggmoread/sdk/b/h$b;->a:Lcom/aggmoread/sdk/client/feedlist/AMExpressAd$ExpressMediaListener;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/b/h$b;->b:Lcom/aggmoread/sdk/b/h;

    invoke-interface {p1, v0}, Lcom/aggmoread/sdk/client/feedlist/AMExpressAd$ExpressMediaListener;->onVideoStart(Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;)V

    :cond_0
    return-void
.end method

.method public g(Lcom/aggmoread/sdk/z/c/a/a/c/o/c;)V
    .locals 1

    iget-object p1, p0, Lcom/aggmoread/sdk/b/h$b;->a:Lcom/aggmoread/sdk/client/feedlist/AMExpressAd$ExpressMediaListener;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/b/h$b;->b:Lcom/aggmoread/sdk/b/h;

    invoke-interface {p1, v0}, Lcom/aggmoread/sdk/client/feedlist/AMExpressAd$ExpressMediaListener;->onVideoPageClose(Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;)V

    :cond_0
    return-void
.end method

.method public h(Lcom/aggmoread/sdk/z/c/a/a/c/o/c;)V
    .locals 1

    iget-object p1, p0, Lcom/aggmoread/sdk/b/h$b;->a:Lcom/aggmoread/sdk/client/feedlist/AMExpressAd$ExpressMediaListener;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/b/h$b;->b:Lcom/aggmoread/sdk/b/h;

    invoke-interface {p1, v0}, Lcom/aggmoread/sdk/client/feedlist/AMExpressAd$ExpressMediaListener;->onVideoComplete(Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;)V

    :cond_0
    return-void
.end method
