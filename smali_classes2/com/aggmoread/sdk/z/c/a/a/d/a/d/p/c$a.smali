.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$j;)Lcom/baidu/mobads/sdk/api/ExpressInterstitialListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$j;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$j;)V
    .locals 0

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    if-eqz p2, :cond_b

    :try_start_0
    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$j;

    if-eqz p1, :cond_b

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p1

    const-string p2, "onAdClick"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$j;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$j;->onAdClick()V

    goto/16 :goto_0

    :cond_0
    const-string p2, "onADLoaded"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$j;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$j;->f()V

    goto/16 :goto_0

    :cond_1
    const-string p2, "onAdClose"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$j;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$j;->g()V

    goto/16 :goto_0

    :cond_2
    const-string p2, "onAdFailed"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p2, :cond_3

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$j;

    aget-object p2, p3, v1

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    aget-object p3, p3, v0

    check-cast p3, Ljava/lang/String;

    invoke-interface {p1, p2, p3}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$j;->b(ILjava/lang/String;)V

    goto/16 :goto_0

    :cond_3
    const-string p2, "onNoAd"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$j;

    aget-object p2, p3, v1

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    aget-object p3, p3, v0

    check-cast p3, Ljava/lang/String;

    invoke-interface {p1, p2, p3}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$j;->a(ILjava/lang/String;)V

    goto :goto_0

    :cond_4
    const-string p2, "onAdCacheSuccess"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$j;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$j;->e()V

    goto :goto_0

    :cond_5
    const-string p2, "onAdCacheFailed"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_6

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$j;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$j;->b()V

    goto :goto_0

    :cond_6
    const-string p2, "onADExposed"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_7

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$j;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$j;->onADExposed()V

    goto :goto_0

    :cond_7
    const-string p2, "onADExposureFailed"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_8

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$j;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$j;->h()V

    goto :goto_0

    :cond_8
    const-string p2, "onVideoDownloadSuccess"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_9

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$j;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$j;->onVideoDownloadSuccess()V

    goto :goto_0

    :cond_9
    const-string p2, "onVideoDownloadFailed"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_a

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$j;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$j;->onVideoDownloadFailed()V

    goto :goto_0

    :cond_a
    const-string p2, "onLpClosed"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$j;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$j;->c()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_b
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method
