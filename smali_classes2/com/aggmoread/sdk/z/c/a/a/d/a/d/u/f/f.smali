.class public Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/f$a;
    }
.end annotation


# instance fields
.field private a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/f$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/f$a;)Lcom/kwad/sdk/api/KsNativeAd$VideoPlayListener;
    .locals 3

    const-class v0, Lcom/kwad/sdk/api/KsNativeAd$VideoPlayListener;

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/f;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/f$a;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    invoke-static {p1, v1, p0}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/kwad/sdk/api/KsNativeAd$VideoPlayListener;

    return-object p1
.end method

.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const/4 p1, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/f;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/f$a;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    const-string v0, "onVideoPlayReady"

    :try_start_1
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/f;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/f$a;

    invoke-interface {p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/f$a;->b()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :cond_1
    const-string v0, "onVideoPlayStart"

    :try_start_2
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/f;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/f$a;

    invoke-interface {p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/f$a;->onVideoPlayStart()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :cond_2
    const-string v0, "onVideoPlayComplete"

    :try_start_3
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/f;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/f$a;

    invoke-interface {p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/f$a;->a()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_0

    :cond_3
    const-string v0, "onVideoPlayError"

    :try_start_4
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/f;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/f$a;

    const/4 v0, 0x0

    aget-object v0, p3, v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    aget-object p3, p3, v1

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-interface {p2, v0, p3}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/f$a;->onVideoPlayError(II)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_0

    :cond_4
    const-string p3, "onVideoPlayPause"

    :try_start_5
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_5

    iget-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/f;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/f$a;

    invoke-interface {p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/f$a;->c()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    goto :goto_0

    :cond_5
    const-string p3, "onVideoPlayResume"

    :try_start_6
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_6

    iget-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/f;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/f$a;

    invoke-interface {p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/f$a;->d()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    :catch_0
    :cond_6
    :goto_0
    return-object p1
.end method
