.class public Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b$a;
    }
.end annotation


# instance fields
.field private a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b$a;


# direct methods
.method public constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b$a;

    return-void
.end method


# virtual methods
.method public a()Lcom/qq/e/ads/interstitial2/UnifiedInterstitialADListener;
    .locals 4

    const-class v0, Lcom/qq/e/ads/interstitial2/UnifiedInterstitialADListener;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-static {v1, v2, p0}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qq/e/ads/interstitial2/UnifiedInterstitialADListener;

    return-object v0
.end method

.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b$a;

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return-object v0

    :cond_0
    const-string p2, "onADReceive"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b$a;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b$a;->a()V

    goto/16 :goto_0

    :cond_1
    const-string p2, "onVideoCached"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b$a;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b$a;->onVideoCached()V

    goto/16 :goto_0

    :cond_2
    const-string p2, "onNoAD"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b$a;

    const/4 p2, 0x0

    aget-object p2, p3, p2

    check-cast p2, Lcom/qq/e/comm/util/AdError;

    invoke-interface {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b$a;->onNoAD(Lcom/qq/e/comm/util/AdError;)V

    goto :goto_0

    :cond_3
    const-string p2, "onADOpened"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b$a;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b$a;->c()V

    goto :goto_0

    :cond_4
    const-string p2, "onADExposure"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b$a;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b$a;->onADExposure()V

    goto :goto_0

    :cond_5
    const-string p2, "onADClicked"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_6

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b$a;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b$a;->onADClicked()V

    goto :goto_0

    :cond_6
    const-string p2, "onADLeftApplication"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_7

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b$a;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b$a;->onADLeftApplication()V

    goto :goto_0

    :cond_7
    const-string p2, "onADClosed"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_8

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b$a;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b$a;->b()V

    goto :goto_0

    :cond_8
    const-string p2, "onRenderSuccess"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_9

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b$a;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b$a;->onRenderSuccess()V

    goto :goto_0

    :cond_9
    const-string p2, "onRenderFail"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b$a;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b$a;->onRenderFail()V

    :cond_a
    :goto_0
    return-object v0
.end method
