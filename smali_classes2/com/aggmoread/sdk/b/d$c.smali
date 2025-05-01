.class Lcom/aggmoread/sdk/b/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/c/a/a/c/s/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/b/d;->b()Lcom/aggmoread/sdk/z/c/a/a/c/s/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/b/d;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/b/d;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/b/d$c;->a:Lcom/aggmoread/sdk/b/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/aggmoread/sdk/z/c/a/a/c/d;)V
    .locals 2

    sget-object v0, Lcom/aggmoread/sdk/t;->SDK_TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onAdError , "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/c/d;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", msg "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/c/d;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/aggmoread/sdk/b/d$c;->a:Lcom/aggmoread/sdk/b/d;

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/b/d;->a(Lcom/aggmoread/sdk/b/d;Lcom/aggmoread/sdk/z/c/a/a/c/d;)V

    return-void
.end method

.method public onAdLoaded(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/aggmoread/sdk/z/c/a/a/c/s/a;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/aggmoread/sdk/t;->SDK_TAG:Ljava/lang/String;

    iget-object v0, p0, Lcom/aggmoread/sdk/b/d$c;->a:Lcom/aggmoread/sdk/b/d;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/b/d;->a(Lcom/aggmoread/sdk/b/d;Z)Z

    iget-object v0, p0, Lcom/aggmoread/sdk/b/d$c;->a:Lcom/aggmoread/sdk/b/d;

    invoke-static {v0}, Lcom/aggmoread/sdk/b/d;->a(Lcom/aggmoread/sdk/b/d;)Lcom/aggmoread/sdk/client/IAMAdLoadListener;

    move-result-object v0

    instance-of v0, v0, Lcom/aggmoread/sdk/client/splash/AMSplashAdListener;

    if-eqz v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/aggmoread/sdk/z/c/a/a/c/s/a;

    new-instance v2, Lcom/aggmoread/sdk/b/n;

    iget-object v3, p0, Lcom/aggmoread/sdk/b/d$c;->a:Lcom/aggmoread/sdk/b/d;

    invoke-direct {v2, v3, v1}, Lcom/aggmoread/sdk/b/n;-><init>(Lcom/aggmoread/sdk/b/d;Lcom/aggmoread/sdk/z/c/a/a/c/s/a;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/aggmoread/sdk/b/d$c;->a:Lcom/aggmoread/sdk/b/d;

    invoke-static {p1}, Lcom/aggmoread/sdk/b/d;->a(Lcom/aggmoread/sdk/b/d;)Lcom/aggmoread/sdk/client/IAMAdLoadListener;

    move-result-object p1

    check-cast p1, Lcom/aggmoread/sdk/client/splash/AMSplashAdListener;

    invoke-interface {p1, v0}, Lcom/aggmoread/sdk/client/IAMAdLoadListener;->onAdLoaded(Ljava/util/List;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/b/d$c;->a:Lcom/aggmoread/sdk/b/d;

    invoke-static {p1}, Lcom/aggmoread/sdk/b/d;->b(Lcom/aggmoread/sdk/b/d;)Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/aggmoread/sdk/b/d$c;->a:Lcom/aggmoread/sdk/b/d;

    invoke-static {p1}, Lcom/aggmoread/sdk/b/d;->c(Lcom/aggmoread/sdk/b/d;)Lcom/aggmoread/sdk/client/IAMAdInteractionListener;

    move-result-object p1

    instance-of p1, p1, Lcom/aggmoread/sdk/client/splash/AMSplashInteractionListener;

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/aggmoread/sdk/client/splash/AMSplashAd;

    iget-object v0, p0, Lcom/aggmoread/sdk/b/d$c;->a:Lcom/aggmoread/sdk/b/d;

    invoke-static {v0}, Lcom/aggmoread/sdk/b/d;->c(Lcom/aggmoread/sdk/b/d;)Lcom/aggmoread/sdk/client/IAMAdInteractionListener;

    move-result-object v0

    check-cast v0, Lcom/aggmoread/sdk/client/splash/AMSplashInteractionListener;

    invoke-interface {p1, v0}, Lcom/aggmoread/sdk/client/splash/AMSplashAd;->show(Lcom/aggmoread/sdk/client/splash/AMSplashInteractionListener;)V

    :cond_1
    return-void
.end method
