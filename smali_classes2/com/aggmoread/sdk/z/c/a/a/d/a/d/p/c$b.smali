.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$g;)Lcom/baidu/mobads/sdk/api/ExpressResponse$ExpressDislikeListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$g;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$g;)V
    .locals 0

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-eqz p2, :cond_2

    :try_start_0
    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$g;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_2

    const-string p1, "onDislikeWindowShow"

    :try_start_1
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$g;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$g;->a()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :cond_0
    const-string p1, "onDislikeItemClick"

    :try_start_2
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$g;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$g;->c()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :cond_1
    const-string p1, "onDislikeWindowClose"

    :try_start_3
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$g;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$g;->b()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    :catch_0
    :cond_2
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method
