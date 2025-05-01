.class public Lcom/xinzhu/overmind/client/hook/proxies/net/wifi/a;
.super Lcom/xinzhu/overmind/client/hook/BinderInvocationStub;
.source "WifiManagerStub.java"


# static fields
.field static final b:Ljava/lang/String; = "wifi"


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "wifi"

    .line 1
    invoke-static {v0}, Lcom/xinzhu/haunted/android/os/s;->i(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/xinzhu/overmind/client/hook/BinderInvocationStub;-><init>(Landroid/os/IBinder;)V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 5

    const-string v0, "wifi"

    .line 1
    invoke-static {}, Lcom/xinzhu/overmind/utils/e;->k()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return v2

    :cond_0
    const/4 v1, 0x1

    .line 2
    :try_start_0
    new-instance v3, Lcom/xinzhu/haunted/com/android/net/wifi/a;

    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/xinzhu/haunted/com/android/net/wifi/a;-><init>(Ljava/lang/Object;)V

    .line 3
    invoke-virtual {v3}, Lcom/xinzhu/haunted/com/android/net/wifi/a;->b()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0}, Lcom/xinzhu/overmind/client/hook/b;->getProxyInvocation()Ljava/lang/Object;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eq v3, v4, :cond_1

    return v1

    :catchall_0
    move-exception v3

    .line 4
    invoke-virtual {v3}, Ljava/lang/Throwable;->printStackTrace()V

    .line 5
    :cond_1
    invoke-static {v0}, Lcom/xinzhu/haunted/android/os/s;->i(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    if-eq v0, p0, :cond_2

    const/4 v2, 0x1

    :cond_2
    return v2
.end method

.method protected getWho()Ljava/lang/Object;
    .locals 1

    const-string v0, "wifi"

    .line 1
    invoke-static {v0}, Lcom/xinzhu/haunted/android/os/s;->i(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/xinzhu/haunted/android/net/wifi/a$a;->a(Landroid/os/IBinder;)Landroid/os/IInterface;

    move-result-object v0

    return-object v0
.end method

.method protected inject(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    const-string p1, "wifi"

    .line 1
    invoke-static {}, Lcom/xinzhu/overmind/utils/e;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    :try_start_0
    new-instance v0, Lcom/xinzhu/haunted/com/android/net/wifi/a;

    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/xinzhu/haunted/com/android/net/wifi/a;-><init>(Ljava/lang/Object;)V

    .line 3
    invoke-virtual {v0, p2}, Lcom/xinzhu/haunted/com/android/net/wifi/a;->c(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    .line 4
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 5
    :goto_0
    invoke-virtual {p0, p1}, Lcom/xinzhu/overmind/client/hook/BinderInvocationStub;->replaceSystemService(Ljava/lang/String;)V

    return-void
.end method

.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    invoke-static {p3}, Lcom/xinzhu/overmind/utils/helpers/c;->c([Ljava/lang/Object;)V

    if-eqz p3, :cond_1

    const/4 v0, 0x0

    .line 2
    :goto_0
    array-length v1, p3

    if-ge v0, v1, :cond_1

    .line 3
    aget-object v1, p3, v0

    if-eqz v1, :cond_0

    .line 4
    aget-object v1, p3, v0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Landroid/os/WorkSource;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x0

    .line 5
    aput-object v1, p3, v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 6
    :cond_1
    invoke-super {p0, p1, p2, p3}, Lcom/xinzhu/overmind/client/hook/b;->invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected onBindMethod()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/xinzhu/overmind/client/hook/BinderInvocationStub;->onBindMethod()V

    return-void
.end method
