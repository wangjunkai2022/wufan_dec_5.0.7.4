.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$k;)Lcom/baidu/mobads/sdk/api/SplashInteractionListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$k;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$k;)V
    .locals 0

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$c;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-eqz p2, :cond_9

    :try_start_0
    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$c;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$k;

    if-eqz p1, :cond_9

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p1

    const-string p2, "onLpClosed"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$c;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$k;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$k;->c()V

    goto/16 :goto_0

    :cond_0
    const-string p2, "onAdPresent"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$c;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$k;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$k;->g()V

    goto/16 :goto_0

    :cond_1
    const-string p2, "onAdExposed"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$c;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$k;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$k;->onAdExposed()V

    goto/16 :goto_0

    :cond_2
    const-string p2, "onAdDismissed"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$c;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$k;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$k;->a()V

    goto :goto_0

    :cond_3
    const-string p2, "onAdSkip"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$c;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$k;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$k;->d()V

    goto :goto_0

    :cond_4
    const-string p2, "onAdClick"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$c;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$k;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$k;->onAdClick()V

    goto :goto_0

    :cond_5
    const-string p2, "onAdCacheSuccess"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_6

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$c;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$k;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$k;->e()V

    goto :goto_0

    :cond_6
    const-string p2, "onAdCacheFailed"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_7

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$c;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$k;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$k;->b()V

    goto :goto_0

    :cond_7
    const-string p2, "onADLoaded"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_8

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$c;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$k;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$k;->f()V

    goto :goto_0

    :cond_8
    const-string p2, "onAdFailed"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$c;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$k;

    const/4 p2, 0x0

    aget-object p2, p3, p2

    check-cast p2, Ljava/lang/String;

    invoke-interface {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$k;->onAdFailed(Ljava/lang/String;)V
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
