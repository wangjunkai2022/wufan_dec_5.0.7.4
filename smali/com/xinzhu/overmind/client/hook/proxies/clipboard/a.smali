.class public Lcom/xinzhu/overmind/client/hook/proxies/clipboard/a;
.super Lcom/xinzhu/overmind/client/hook/BinderInvocationStub;
.source "ClipboardStub.java"


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "clipboard"

    .line 1
    invoke-static {v0}, Lcom/xinzhu/haunted/android/os/s;->i(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/xinzhu/overmind/client/hook/BinderInvocationStub;-><init>(Landroid/os/IBinder;)V

    return-void
.end method

.method private static c()Landroid/os/IInterface;
    .locals 2

    .line 1
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "clipboard"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ClipboardManager;

    .line 2
    new-instance v1, Lcom/xinzhu/haunted/android/content/d;

    invoke-direct {v1, v0}, Lcom/xinzhu/haunted/android/content/d;-><init>(Ljava/lang/Object;)V

    .line 3
    invoke-virtual {v1}, Lcom/xinzhu/haunted/android/content/d;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v1}, Lcom/xinzhu/haunted/android/content/d;->c()Landroid/os/IInterface;

    move-result-object v0

    return-object v0

    .line 5
    :cond_0
    invoke-static {}, Lcom/xinzhu/haunted/android/content/d;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    invoke-static {}, Lcom/xinzhu/haunted/android/content/d;->d()Landroid/os/IInterface;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 4

    .line 1
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "clipboard"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ClipboardManager;

    .line 2
    new-instance v2, Lcom/xinzhu/haunted/android/content/d;

    invoke-direct {v2, v0}, Lcom/xinzhu/haunted/android/content/d;-><init>(Ljava/lang/Object;)V

    .line 3
    invoke-virtual {v2}, Lcom/xinzhu/haunted/android/content/d;->a()Z

    move-result v0

    const/4 v3, 0x1

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v2}, Lcom/xinzhu/haunted/android/content/d;->c()Landroid/os/IInterface;

    move-result-object v0

    invoke-virtual {p0}, Lcom/xinzhu/overmind/client/hook/b;->getProxyInvocation()Ljava/lang/Object;

    move-result-object v2

    if-eq v0, v2, :cond_0

    return v3

    .line 5
    :cond_0
    invoke-static {v1}, Lcom/xinzhu/haunted/android/os/s;->i(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    if-eq v0, p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    return v3
.end method

.method protected getWho()Ljava/lang/Object;
    .locals 1

    const-string v0, "clipboard"

    .line 1
    invoke-static {v0}, Lcom/xinzhu/haunted/android/os/s;->i(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/xinzhu/haunted/android/content/i$a;->a(Landroid/os/IBinder;)Landroid/os/IInterface;

    move-result-object v0

    return-object v0
.end method

.method protected inject(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "clipboard"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/ClipboardManager;

    .line 2
    new-instance v0, Lcom/xinzhu/haunted/android/content/d;

    invoke-direct {v0, p1}, Lcom/xinzhu/haunted/android/content/d;-><init>(Ljava/lang/Object;)V

    .line 3
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/content/d;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {p0}, Lcom/xinzhu/overmind/client/hook/b;->getProxyInvocation()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/IInterface;

    invoke-virtual {v0, p1}, Lcom/xinzhu/haunted/android/content/d;->e(Landroid/os/IInterface;)Z

    goto :goto_0

    .line 5
    :cond_0
    invoke-static {}, Lcom/xinzhu/haunted/android/content/d;->b()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 6
    invoke-virtual {p0}, Lcom/xinzhu/overmind/client/hook/b;->getProxyInvocation()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/IInterface;

    invoke-static {p1}, Lcom/xinzhu/haunted/android/content/d;->f(Landroid/os/IInterface;)Z

    .line 7
    :cond_1
    :goto_0
    invoke-virtual {p0, p2}, Lcom/xinzhu/overmind/client/hook/BinderInvocationStub;->replaceSystemService(Ljava/lang/String;)V

    return-void
.end method

.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/xinzhu/overmind/client/hook/b;->invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected onBindMethod()V
    .locals 10

    .line 1
    invoke-super {p0}, Lcom/xinzhu/overmind/client/hook/BinderInvocationStub;->onBindMethod()V

    .line 2
    invoke-static {}, Lcom/xinzhu/overmind/utils/e;->k()Z

    move-result v0

    const-string v1, "clearPrimaryClip"

    const-string v2, "setPrimaryClip"

    const-string v3, "getPrimaryClip"

    const-string v4, "hasClipboardText"

    const-string v5, "removePrimaryClipChangedListener"

    const-string v6, "getPrimaryClipDescription"

    const-string v7, "addPrimaryClipChangedListener"

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v8, Lcom/xinzhu/overmind/client/hook/common/d;->f:I

    const/4 v9, 0x3

    invoke-direct {v0, v7, v8, v9}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 4
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v7, Lcom/xinzhu/overmind/client/hook/common/d;->f:I

    const/4 v8, 0x2

    invoke-direct {v0, v6, v7, v8}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 5
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v6, Lcom/xinzhu/overmind/client/hook/common/d;->f:I

    invoke-direct {v0, v5, v6, v9}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 6
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v5, Lcom/xinzhu/overmind/client/hook/common/d;->f:I

    invoke-direct {v0, v4, v5, v8}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 7
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v4, Lcom/xinzhu/overmind/client/hook/common/d;->f:I

    invoke-direct {v0, v3, v4, v8}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 8
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v3, Lcom/xinzhu/overmind/client/hook/common/d;->f:I

    invoke-direct {v0, v2, v3, v9}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 9
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v2, Lcom/xinzhu/overmind/client/hook/common/d;->f:I

    invoke-direct {v0, v1, v2, v8}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    goto/16 :goto_7

    .line 10
    :cond_0
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v8, Lcom/xinzhu/overmind/client/hook/common/d;->f:I

    invoke-static {}, Lcom/xinzhu/overmind/utils/e;->f()Z

    move-result v9

    if-eqz v9, :cond_1

    sget v9, Lcom/xinzhu/overmind/client/hook/common/d;->g:I

    goto :goto_0

    :cond_1
    sget v9, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    :goto_0
    invoke-direct {v0, v7, v8, v9}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 11
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v7, Lcom/xinzhu/overmind/client/hook/common/d;->f:I

    invoke-static {}, Lcom/xinzhu/overmind/utils/e;->f()Z

    move-result v8

    if-eqz v8, :cond_2

    sget v8, Lcom/xinzhu/overmind/client/hook/common/d;->g:I

    goto :goto_1

    :cond_2
    sget v8, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    :goto_1
    invoke-direct {v0, v6, v7, v8}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 12
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v6, Lcom/xinzhu/overmind/client/hook/common/d;->f:I

    invoke-static {}, Lcom/xinzhu/overmind/utils/e;->f()Z

    move-result v7

    if-eqz v7, :cond_3

    sget v7, Lcom/xinzhu/overmind/client/hook/common/d;->g:I

    goto :goto_2

    :cond_3
    sget v7, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    :goto_2
    invoke-direct {v0, v5, v6, v7}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 13
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v5, Lcom/xinzhu/overmind/client/hook/common/d;->f:I

    invoke-static {}, Lcom/xinzhu/overmind/utils/e;->f()Z

    move-result v6

    if-eqz v6, :cond_4

    sget v6, Lcom/xinzhu/overmind/client/hook/common/d;->g:I

    goto :goto_3

    :cond_4
    sget v6, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    :goto_3
    invoke-direct {v0, v4, v5, v6}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 14
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v4, Lcom/xinzhu/overmind/client/hook/common/d;->f:I

    invoke-static {}, Lcom/xinzhu/overmind/utils/e;->f()Z

    move-result v5

    if-eqz v5, :cond_5

    sget v5, Lcom/xinzhu/overmind/client/hook/common/d;->g:I

    goto :goto_4

    :cond_5
    sget v5, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    :goto_4
    invoke-direct {v0, v3, v4, v5}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 15
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v3, Lcom/xinzhu/overmind/client/hook/common/d;->f:I

    invoke-static {}, Lcom/xinzhu/overmind/utils/e;->f()Z

    move-result v4

    if-eqz v4, :cond_6

    sget v4, Lcom/xinzhu/overmind/client/hook/common/d;->g:I

    goto :goto_5

    :cond_6
    sget v4, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    :goto_5
    invoke-direct {v0, v2, v3, v4}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 16
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v2, Lcom/xinzhu/overmind/client/hook/common/d;->f:I

    invoke-static {}, Lcom/xinzhu/overmind/utils/e;->f()Z

    move-result v3

    if-eqz v3, :cond_7

    sget v3, Lcom/xinzhu/overmind/client/hook/common/d;->g:I

    goto :goto_6

    :cond_7
    sget v3, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    :goto_6
    invoke-direct {v0, v1, v2, v3}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    :goto_7
    return-void
.end method
