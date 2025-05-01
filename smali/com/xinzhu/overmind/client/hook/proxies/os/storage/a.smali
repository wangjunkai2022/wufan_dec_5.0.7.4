.class public Lcom/xinzhu/overmind/client/hook/proxies/os/storage/a;
.super Lcom/xinzhu/overmind/client/hook/BinderInvocationStub;
.source "StorageManagerStub.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xinzhu/overmind/client/hook/proxies/os/storage/a$f;,
        Lcom/xinzhu/overmind/client/hook/proxies/os/storage/a$d;,
        Lcom/xinzhu/overmind/client/hook/proxies/os/storage/a$b;,
        Lcom/xinzhu/overmind/client/hook/proxies/os/storage/a$g;,
        Lcom/xinzhu/overmind/client/hook/proxies/os/storage/a$e;,
        Lcom/xinzhu/overmind/client/hook/proxies/os/storage/a$a;,
        Lcom/xinzhu/overmind/client/hook/proxies/os/storage/a$c;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "mount"

    .line 1
    invoke-static {v0}, Lcom/xinzhu/haunted/android/os/s;->i(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/xinzhu/overmind/client/hook/BinderInvocationStub;-><init>(Landroid/os/IBinder;)V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const-string v0, "mount"

    .line 1
    invoke-static {v0}, Lcom/xinzhu/haunted/android/os/s;->i(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected getWho()Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {}, Lcom/xinzhu/overmind/utils/e;->w()Z

    move-result v0

    const-string v1, "mount"

    if-eqz v0, :cond_0

    .line 2
    invoke-static {v1}, Lcom/xinzhu/haunted/android/os/s;->i(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/xinzhu/haunted/android/os/storage/b$a;->a(Landroid/os/IBinder;)Landroid/os/IInterface;

    move-result-object v0

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {v1}, Lcom/xinzhu/haunted/android/os/s;->i(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/xinzhu/haunted/android/os/storage/a$a;->a(Landroid/os/IBinder;)Landroid/os/IInterface;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method protected inject(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    const-string p1, "mount"

    .line 1
    invoke-virtual {p0, p1}, Lcom/xinzhu/overmind/client/hook/BinderInvocationStub;->replaceSystemService(Ljava/lang/String;)V

    .line 2
    :try_start_0
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "storage"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/storage/StorageManager;

    .line 3
    new-instance v0, Lcom/xinzhu/haunted/android/os/storage/c;

    invoke-direct {v0, p1}, Lcom/xinzhu/haunted/android/os/storage/c;-><init>(Ljava/lang/Object;)V

    .line 4
    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/os/storage/c;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 5
    move-object p1, p2

    check-cast p1, Landroid/os/IInterface;

    invoke-virtual {v0, p1}, Lcom/xinzhu/haunted/android/os/storage/c;->k(Landroid/os/IInterface;)Z

    .line 6
    :cond_0
    invoke-static {}, Lcom/xinzhu/haunted/android/os/storage/c;->b()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 7
    check-cast p2, Landroid/os/IInterface;

    invoke-static {p2}, Lcom/xinzhu/haunted/android/os/storage/c;->l(Landroid/os/IInterface;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    :goto_0
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
    invoke-static {p3}, Lcom/xinzhu/overmind/utils/helpers/c;->c([Ljava/lang/Object;)V

    .line 2
    invoke-super {p0, p1, p2, p3}, Lcom/xinzhu/overmind/client/hook/b;->invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected onBindMethod()V
    .locals 5

    .line 1
    invoke-super {p0}, Lcom/xinzhu/overmind/client/hook/BinderInvocationStub;->onBindMethod()V

    .line 2
    invoke-static {}, Lcom/xinzhu/overmind/utils/e;->j()Z

    move-result v0

    const-string v1, "getVolumeList"

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    invoke-direct {v0, v1, v2, v3}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/e;

    invoke-direct {v0, v1, v3}, Lcom/xinzhu/overmind/client/hook/common/e;-><init>(Ljava/lang/String;I)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 5
    :goto_0
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    const-string v4, "createUserKey"

    invoke-direct {v0, v4, v1, v3}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 6
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    const-string v4, "destroyUserKey"

    invoke-direct {v0, v4, v1, v3}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 7
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    const-string v4, "unlockUserKey"

    invoke-direct {v0, v4, v1, v3}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 8
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    const-string v4, "lockUserKey"

    invoke-direct {v0, v4, v1, v3}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 9
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    const-string v4, "isUserKeyUnlocked"

    invoke-direct {v0, v4, v1, v3}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 10
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    const-string v4, "prepareUserStorage"

    invoke-direct {v0, v4, v1, v2}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 11
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    const-string v4, "destroyUserStorage"

    invoke-direct {v0, v4, v1, v2}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 12
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    const-string v2, "addUserKeyAuth"

    invoke-direct {v0, v2, v1, v3}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 13
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    const-string v2, "fixateNewestUserKeyAuth"

    invoke-direct {v0, v2, v1, v3}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 14
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    const-string v2, "clearUserKeyAuth"

    invoke-direct {v0, v2, v1, v3}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 15
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/os/storage/a$f;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/os/storage/a$f;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 16
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/os/storage/a$d;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/os/storage/a$d;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 17
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/os/storage/a$b;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/os/storage/a$b;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 18
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/os/storage/a$g;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/os/storage/a$g;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 19
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/os/storage/a$e;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/os/storage/a$e;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 20
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/os/storage/a$a;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/os/storage/a$a;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    return-void
.end method
