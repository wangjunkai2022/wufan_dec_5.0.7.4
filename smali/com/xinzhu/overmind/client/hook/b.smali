.class public abstract Lcom/xinzhu/overmind/client/hook/b;
.super Ljava/lang/Object;
.source "ClassInvocationStub.java"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;
.implements Lcom/xinzhu/overmind/client/hook/d;


# static fields
.field public static final TAG:Ljava/lang/String;


# instance fields
.field private mBase:Ljava/lang/Object;

.field private mMethodHookMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/xinzhu/overmind/client/hook/e;",
            ">;"
        }
    .end annotation
.end field

.field private mProxyInvocation:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lcom/xinzhu/overmind/client/hook/b;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/xinzhu/overmind/client/hook/b;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/xinzhu/overmind/client/hook/b;->mMethodHookMap:Ljava/util/Map;

    return-void
.end method

.method private log(Ljava/lang/reflect/Method;[Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    return-void
.end method


# virtual methods
.method protected addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xinzhu/overmind/client/hook/b;->mMethodHookMap:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/xinzhu/overmind/client/hook/e;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method protected enableLog()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected getBase()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xinzhu/overmind/client/hook/b;->mBase:Ljava/lang/Object;

    return-object v0
.end method

.method protected getProxyInvocation()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xinzhu/overmind/client/hook/b;->mProxyInvocation:Ljava/lang/Object;

    return-object v0
.end method

.method protected abstract getWho()Ljava/lang/Object;
.end method

.method protected abstract inject(Ljava/lang/Object;Ljava/lang/Object;)V
.end method

.method public injectHook()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/xinzhu/overmind/client/hook/b;->getWho()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/xinzhu/overmind/client/hook/b;->mBase:Ljava/lang/Object;

    if-nez v0, :cond_0

    .line 2
    sget-object v0, Lcom/xinzhu/overmind/client/hook/b;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "injectHook failed "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/xinzhu/overmind/b;->c(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 3
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    iget-object v1, p0, Lcom/xinzhu/overmind/client/hook/b;->mBase:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Lcom/xinzhu/overmind/utils/helpers/g;->a(Ljava/lang/Class;)[Ljava/lang/Class;

    move-result-object v1

    invoke-static {v0, v1, p0}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/xinzhu/overmind/client/hook/b;->mProxyInvocation:Ljava/lang/Object;

    .line 4
    iget-object v1, p0, Lcom/xinzhu/overmind/client/hook/b;->mBase:Ljava/lang/Object;

    invoke-virtual {p0, v1, v0}, Lcom/xinzhu/overmind/client/hook/b;->inject(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 5
    invoke-virtual {p0}, Lcom/xinzhu/overmind/client/hook/b;->onBindMethod()V

    return-void
.end method

.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lcom/xinzhu/overmind/client/hook/b;->mMethodHookMap:Ljava/util/Map;

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/xinzhu/overmind/client/hook/e;

    const-string v0, "afterHook"

    const-string v1, "beforeHook"

    const/4 v2, 0x0

    if-eqz p1, :cond_2

    .line 2
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/xinzhu/overmind/client/hook/e;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-direct {p0, p2, p3, v2, v1}, Lcom/xinzhu/overmind/client/hook/b;->log(Ljava/lang/reflect/Method;[Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    iget-object v1, p0, Lcom/xinzhu/overmind/client/hook/b;->mBase:Ljava/lang/Object;

    invoke-virtual {p1, v1, p2, p3}, Lcom/xinzhu/overmind/client/hook/e;->b(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    return-object v1

    .line 5
    :cond_1
    iget-object v1, p0, Lcom/xinzhu/overmind/client/hook/b;->mBase:Ljava/lang/Object;

    invoke-virtual {p1, v1, p2, p3}, Lcom/xinzhu/overmind/client/hook/e;->d(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 6
    invoke-virtual {p1, v1}, Lcom/xinzhu/overmind/client/hook/e;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 7
    invoke-direct {p0, p2, p3, p1, v0}, Lcom/xinzhu/overmind/client/hook/b;->log(Ljava/lang/reflect/Method;[Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    .line 8
    :cond_2
    :goto_0
    :try_start_0
    invoke-direct {p0, p2, p3, v2, v1}, Lcom/xinzhu/overmind/client/hook/b;->log(Ljava/lang/reflect/Method;[Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    iget-object p1, p0, Lcom/xinzhu/overmind/client/hook/b;->mBase:Ljava/lang/Object;

    invoke-virtual {p2, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 10
    invoke-direct {p0, p2, p3, p1, v0}, Lcom/xinzhu/overmind/client/hook/b;->log(Ljava/lang/reflect/Method;[Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    throw p1
.end method

.method protected abstract onBindMethod()V
.end method
