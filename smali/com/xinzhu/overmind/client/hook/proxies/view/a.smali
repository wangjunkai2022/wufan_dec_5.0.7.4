.class public Lcom/xinzhu/overmind/client/hook/proxies/view/a;
.super Lcom/xinzhu/overmind/client/hook/BinderInvocationStub;
.source "AutofillManagerStub.java"


# static fields
.field public static final b:Ljava/lang/String; = "AutofillManagerStub"


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "autofill"

    .line 1
    invoke-static {v0}, Lcom/xinzhu/haunted/android/os/s;->i(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/xinzhu/overmind/client/hook/BinderInvocationStub;-><init>(Landroid/os/IBinder;)V

    return-void
.end method

.method static synthetic c([Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/xinzhu/overmind/client/hook/proxies/view/a;->d([Ljava/lang/Object;)V

    return-void
.end method

.method private static d([Ljava/lang/Object;)V
    .locals 4

    if-eqz p0, :cond_3

    const/4 v0, 0x0

    .line 1
    :goto_0
    array-length v1, p0

    if-ge v0, v1, :cond_3

    .line 2
    aget-object v1, p0, v0

    if-nez v1, :cond_0

    goto :goto_2

    .line 3
    :cond_0
    aget-object v1, p0, v0

    instance-of v1, v1, Landroid/content/ComponentName;

    if-eqz v1, :cond_2

    .line 4
    invoke-static {}, Lcom/xinzhu/overmind/client/e;->getClientConfig()Lcom/xinzhu/overmind/entity/ClientConfig;

    move-result-object v1

    iget-boolean v1, v1, Lcom/xinzhu/overmind/entity/ClientConfig;->j:Z

    if-eqz v1, :cond_1

    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getPluginPkg()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getHostPkg()Ljava/lang/String;

    move-result-object v1

    .line 5
    :goto_1
    new-instance v2, Landroid/content/ComponentName;

    invoke-static {}, Lcom/xinzhu/overmind/client/e;->getVPid()I

    move-result v3

    invoke-static {v3}, Lcom/xinzhu/overmind/client/f;->e(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, p0, v0

    :cond_2
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
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

    const-string v0, "autofill"

    .line 1
    invoke-static {v0}, Lcom/xinzhu/haunted/android/os/s;->i(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/xinzhu/haunted/android/view/a$a;->a(Landroid/os/IBinder;)Landroid/os/IInterface;

    move-result-object v0

    return-object v0
.end method

.method protected inject(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    const-string p1, "autofill"

    .line 1
    invoke-virtual {p0, p1}, Lcom/xinzhu/overmind/client/hook/BinderInvocationStub;->replaceSystemService(Ljava/lang/String;)V

    return-void
.end method

.method protected onBindMethod()V
    .locals 4

    .line 1
    invoke-super {p0}, Lcom/xinzhu/overmind/client/hook/BinderInvocationStub;->onBindMethod()V

    .line 2
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/view/a$a;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    invoke-static {}, Lcom/xinzhu/overmind/utils/e;->f()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x2

    goto :goto_0

    :cond_0
    sget v2, Lcom/xinzhu/overmind/client/hook/common/d;->g:I

    :goto_0
    const-string v3, "addClient"

    invoke-direct {v0, p0, v3, v1, v2}, Lcom/xinzhu/overmind/client/hook/proxies/view/a$a;-><init>(Lcom/xinzhu/overmind/client/hook/proxies/view/a;Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 3
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    sget v2, Lcom/xinzhu/overmind/client/hook/common/d;->g:I

    const-string v3, "removeClient"

    invoke-direct {v0, v3, v1, v2}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 4
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/view/a$b;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    const/4 v2, 0x5

    const-string v3, "startSession"

    invoke-direct {v0, p0, v3, v1, v2}, Lcom/xinzhu/overmind/client/hook/proxies/view/a$b;-><init>(Lcom/xinzhu/overmind/client/hook/proxies/view/a;Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 5
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    sget v2, Lcom/xinzhu/overmind/client/hook/common/d;->g:I

    const-string v3, "updateSession"

    invoke-direct {v0, v3, v1, v2}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 6
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    sget v2, Lcom/xinzhu/overmind/client/hook/common/d;->g:I

    const-string v3, "setAutofillFailure"

    invoke-direct {v0, v3, v1, v2}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 7
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    sget v2, Lcom/xinzhu/overmind/client/hook/common/d;->g:I

    const-string v3, "finishSession"

    invoke-direct {v0, v3, v1, v2}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 8
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    sget v2, Lcom/xinzhu/overmind/client/hook/common/d;->g:I

    const-string v3, "cancelSession"

    invoke-direct {v0, v3, v1, v2}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 9
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    sget v2, Lcom/xinzhu/overmind/client/hook/common/d;->g:I

    const-string v3, "setAuthenticationResult"

    invoke-direct {v0, v3, v1, v2}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 10
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    const/4 v2, 0x1

    const-string v3, "setHasCallback"

    invoke-direct {v0, v3, v1, v2}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 11
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    const-string v2, "disableOwnedAutofillServices"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v1, v3}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 12
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    const-string v2, "isServiceSupported"

    invoke-direct {v0, v2, v1, v3}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 13
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->f:I

    const-string v2, "isServiceEnabled"

    invoke-direct {v0, v2, v1, v3}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    return-void
.end method
