.class public Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/b$a;
    }
.end annotation


# instance fields
.field private a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/b$a;


# direct methods
.method public constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/b$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/b$a;

    return-void
.end method


# virtual methods
.method public a()Lcom/qq/e/ads/nativ/NativeExpressAD$NativeExpressADListener;
    .locals 4

    const-class v0, Lcom/qq/e/ads/nativ/NativeExpressAD$NativeExpressADListener;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-static {v1, v2, p0}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qq/e/ads/nativ/NativeExpressAD$NativeExpressADListener;

    return-object v0
.end method

.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-eqz p2, :cond_9

    :try_start_0
    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/b$a;

    if-eqz p1, :cond_9

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    aget-object p2, p3, p2

    const-string p3, "onADLoaded"

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/b$a;

    check-cast p2, Ljava/util/List;

    invoke-interface {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/b$a;->b(Ljava/util/List;)V

    goto/16 :goto_0

    :cond_0
    const-string p3, "onRenderFail"

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/b$a;

    check-cast p2, Lcom/qq/e/ads/nativ/NativeExpressADView;

    invoke-interface {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/b$a;->f(Lcom/qq/e/ads/nativ/NativeExpressADView;)V

    goto/16 :goto_0

    :cond_1
    const-string p3, "onRenderSuccess"

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/b$a;

    check-cast p2, Lcom/qq/e/ads/nativ/NativeExpressADView;

    invoke-interface {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/b$a;->b(Lcom/qq/e/ads/nativ/NativeExpressADView;)V

    goto/16 :goto_0

    :cond_2
    const-string p3, "onADExposure"

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_3

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/b$a;

    check-cast p2, Lcom/qq/e/ads/nativ/NativeExpressADView;

    invoke-interface {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/b$a;->c(Lcom/qq/e/ads/nativ/NativeExpressADView;)V

    goto :goto_0

    :cond_3
    const-string p3, "onADClicked"

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/b$a;

    check-cast p2, Lcom/qq/e/ads/nativ/NativeExpressADView;

    invoke-interface {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/b$a;->h(Lcom/qq/e/ads/nativ/NativeExpressADView;)V

    goto :goto_0

    :cond_4
    const-string p3, "onADClosed"

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_5

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/b$a;

    check-cast p2, Lcom/qq/e/ads/nativ/NativeExpressADView;

    invoke-interface {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/b$a;->a(Lcom/qq/e/ads/nativ/NativeExpressADView;)V

    goto :goto_0

    :cond_5
    const-string p3, "onADLeftApplication"

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_6

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/b$a;

    check-cast p2, Lcom/qq/e/ads/nativ/NativeExpressADView;

    invoke-interface {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/b$a;->e(Lcom/qq/e/ads/nativ/NativeExpressADView;)V

    goto :goto_0

    :cond_6
    const-string p3, "onADOpenOverlay"

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_7

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/b$a;

    check-cast p2, Lcom/qq/e/ads/nativ/NativeExpressADView;

    invoke-interface {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/b$a;->g(Lcom/qq/e/ads/nativ/NativeExpressADView;)V

    goto :goto_0

    :cond_7
    const-string p3, "onADCloseOverlay"

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_8

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/b$a;

    check-cast p2, Lcom/qq/e/ads/nativ/NativeExpressADView;

    invoke-interface {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/b$a;->d(Lcom/qq/e/ads/nativ/NativeExpressADView;)V

    goto :goto_0

    :cond_8
    const-string p3, "onNoAD"

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/b$a;

    check-cast p2, Lcom/qq/e/comm/util/AdError;

    invoke-interface {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/b$a;->onNoAD(Lcom/qq/e/comm/util/AdError;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_9
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method
