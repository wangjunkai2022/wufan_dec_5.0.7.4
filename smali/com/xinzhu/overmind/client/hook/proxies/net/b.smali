.class public Lcom/xinzhu/overmind/client/hook/proxies/net/b;
.super Lcom/xinzhu/overmind/client/hook/BinderInvocationStub;
.source "NetworkManagementStub.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xinzhu/overmind/client/hook/proxies/net/b$b;,
        Lcom/xinzhu/overmind/client/hook/proxies/net/b$c;,
        Lcom/xinzhu/overmind/client/hook/proxies/net/b$d;,
        Lcom/xinzhu/overmind/client/hook/proxies/net/b$a;
    }
.end annotation


# static fields
.field static final b:Ljava/lang/String; = "network_management"


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "network_management"

    .line 1
    invoke-static {v0}, Lcom/xinzhu/haunted/android/os/s;->i(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/xinzhu/overmind/client/hook/BinderInvocationStub;-><init>(Landroid/os/IBinder;)V

    return-void
.end method

.method static synthetic c([Ljava/lang/Object;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/xinzhu/overmind/client/hook/proxies/net/b;->d([Ljava/lang/Object;I)V

    return-void
.end method

.method private static d([Ljava/lang/Object;I)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    .line 1
    :cond_0
    aget-object v0, p0, p1

    instance-of v0, v0, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    .line 2
    aget-object v0, p0, p1

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {}, Lcom/xinzhu/overmind/client/e;->getVUid()I

    move-result v1

    if-eq v0, v1, :cond_1

    aget-object v0, p0, p1

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {}, Lcom/xinzhu/overmind/client/e;->getBaseVUid()I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 3
    :cond_1
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getHostUid()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p0, p1

    :cond_2
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected getWho()Ljava/lang/Object;
    .locals 1

    const-string v0, "network_management"

    .line 1
    invoke-static {v0}, Lcom/xinzhu/haunted/android/os/s;->i(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/xinzhu/haunted/android/os/i$a;->a(Landroid/os/IBinder;)Landroid/os/IInterface;

    move-result-object v0

    return-object v0
.end method

.method protected inject(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    const-string p1, "network_management"

    .line 1
    invoke-virtual {p0, p1}, Lcom/xinzhu/overmind/client/hook/BinderInvocationStub;->replaceSystemService(Ljava/lang/String;)V

    return-void
.end method

.method protected onBindMethod()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/xinzhu/overmind/client/hook/BinderInvocationStub;->onBindMethod()V

    .line 2
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/net/b$b;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/net/b$b;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 3
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/net/b$c;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/net/b$c;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 4
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/net/b$d;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/net/b$d;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 5
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/net/b$a;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/net/b$a;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    return-void
.end method
