.class public Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/b$a;
    }
.end annotation


# instance fields
.field private a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/b$a;


# direct methods
.method public constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/b$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/b$a;

    return-void
.end method


# virtual methods
.method public a()Lcom/kwad/sdk/api/KsLoadManager$FullScreenVideoAdListener;
    .locals 4

    const-class v0, Lcom/kwad/sdk/api/KsLoadManager$FullScreenVideoAdListener;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-static {v1, v2, p0}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/api/KsLoadManager$FullScreenVideoAdListener;

    return-object v0
.end method

.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/b$a;

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return-object v0

    :cond_0
    const-string p2, "onError"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    const/4 v1, 0x0

    if-eqz p2, :cond_1

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/b$a;

    aget-object p2, p3, v1

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/4 v1, 0x1

    aget-object p3, p3, v1

    check-cast p3, Ljava/lang/String;

    invoke-interface {p1, p2, p3}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/b$a;->onError(ILjava/lang/String;)V

    goto :goto_2

    :cond_1
    const-string p2, "onFullScreenVideoResult"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/b$a;

    aget-object p2, p3, v1

    if-nez p2, :cond_2

    move-object p2, v0

    goto :goto_0

    :cond_2
    aget-object p2, p3, v1

    check-cast p2, Ljava/util/List;

    :goto_0
    invoke-interface {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/b$a;->b(Ljava/util/List;)V

    goto :goto_2

    :cond_3
    const-string p2, "onRequestResult"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/b$a;

    aget-object p2, p3, v1

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/b$a;->onRequestResult(I)V

    goto :goto_2

    :cond_4
    const-string p2, "onFullScreenVideoAdLoad"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/b$a;

    aget-object p2, p3, v1

    if-nez p2, :cond_5

    move-object p2, v0

    goto :goto_1

    :cond_5
    aget-object p2, p3, v1

    check-cast p2, Ljava/util/List;

    :goto_1
    invoke-interface {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/b$a;->a(Ljava/util/List;)V

    :cond_6
    :goto_2
    return-object v0
.end method
