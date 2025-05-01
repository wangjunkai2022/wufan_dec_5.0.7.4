.class public Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c$a;
    }
.end annotation


# instance fields
.field private a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c$a;


# direct methods
.method public constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c$a;

    return-void
.end method


# virtual methods
.method public a()Lcom/qq/e/ads/interstitial2/UnifiedInterstitialMediaListener;
    .locals 4

    const-class v0, Lcom/qq/e/ads/interstitial2/UnifiedInterstitialMediaListener;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-static {v1, v2, p0}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qq/e/ads/interstitial2/UnifiedInterstitialMediaListener;

    return-object v0
.end method

.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c$a;

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return-object v0

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "name = "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v1, "INTERSTITIALTAG"

    invoke-static {v1, p2}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "onVideoInit"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c$a;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c$a;->onVideoInit()V

    goto/16 :goto_0

    :cond_1
    const-string p2, "onVideoLoading"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c$a;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c$a;->onVideoLoading()V

    goto/16 :goto_0

    :cond_2
    const-string p2, "onVideoReady"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    const/4 v1, 0x0

    if-eqz p2, :cond_3

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c$a;

    aget-object p2, p3, v1

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide p2

    invoke-interface {p1, p2, p3}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c$a;->a(J)V

    goto :goto_0

    :cond_3
    const-string p2, "onVideoStart"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c$a;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c$a;->onVideoStart()V

    goto :goto_0

    :cond_4
    const-string p2, "onVideoPause"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c$a;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c$a;->onVideoPause()V

    goto :goto_0

    :cond_5
    const-string p2, "onVideoComplete"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_6

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c$a;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c$a;->onVideoComplete()V

    goto :goto_0

    :cond_6
    const-string p2, "onVideoError"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_7

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c$a;

    aget-object p2, p3, v1

    check-cast p2, Lcom/qq/e/comm/util/AdError;

    invoke-interface {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c$a;->onVideoError(Lcom/qq/e/comm/util/AdError;)V

    goto :goto_0

    :cond_7
    const-string p2, "onVideoPageOpen"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_8

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c$a;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c$a;->c()V

    goto :goto_0

    :cond_8
    const-string p2, "onVideoPageClose"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c$a;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c$a;->b()V

    :cond_9
    :goto_0
    return-object v0
.end method
