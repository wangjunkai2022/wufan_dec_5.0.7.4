.class public final Lcom/aggmoread/sdk/b/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/b/a$a;
    }
.end annotation


# static fields
.field private static a:Ljava/lang/Object;


# direct methods
.method public static a()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lcom/aggmoread/sdk/b/a;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public static a([Ljava/lang/Class;Landroid/content/Context;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lcom/aggmoread/sdk/b/a;->a:Ljava/lang/Object;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lcom/aggmoread/sdk/b/a$a;

    invoke-direct {v0}, Lcom/aggmoread/sdk/b/a$a;-><init>()V

    new-instance v1, Lcom/aggmoread/sdk/b/e;

    invoke-direct {v1, p1}, Lcom/aggmoread/sdk/b/e;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, Lcom/aggmoread/sdk/b/a$a;->a:Lcom/aggmoread/sdk/b/e;

    const-class p1, Lcom/aggmoread/sdk/b/a$a;

    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    invoke-static {p1, p0, v0}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p0

    sput-object p0, Lcom/aggmoread/sdk/b/a;->a:Ljava/lang/Object;

    return-object p0
.end method
