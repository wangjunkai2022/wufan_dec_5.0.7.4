.class public Lcom/xinzhu/overmind/client/hook/proxies/pm/c;
.super Lcom/xinzhu/overmind/client/hook/BinderInvocationStub;
.source "PackageManagerStub.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xinzhu/overmind/client/hook/proxies/pm/c$y;,
        Lcom/xinzhu/overmind/client/hook/proxies/pm/c$h;,
        Lcom/xinzhu/overmind/client/hook/proxies/pm/c$b0;,
        Lcom/xinzhu/overmind/client/hook/proxies/pm/c$k;,
        Lcom/xinzhu/overmind/client/hook/proxies/pm/c$o;,
        Lcom/xinzhu/overmind/client/hook/proxies/pm/c$q;,
        Lcom/xinzhu/overmind/client/hook/proxies/pm/c$e;,
        Lcom/xinzhu/overmind/client/hook/proxies/pm/c$p;,
        Lcom/xinzhu/overmind/client/hook/proxies/pm/c$i;,
        Lcom/xinzhu/overmind/client/hook/proxies/pm/c$j;,
        Lcom/xinzhu/overmind/client/hook/proxies/pm/c$g;,
        Lcom/xinzhu/overmind/client/hook/proxies/pm/c$s;,
        Lcom/xinzhu/overmind/client/hook/proxies/pm/c$z;,
        Lcom/xinzhu/overmind/client/hook/proxies/pm/c$x;,
        Lcom/xinzhu/overmind/client/hook/proxies/pm/c$b;,
        Lcom/xinzhu/overmind/client/hook/proxies/pm/c$m;,
        Lcom/xinzhu/overmind/client/hook/proxies/pm/c$n;,
        Lcom/xinzhu/overmind/client/hook/proxies/pm/c$f;,
        Lcom/xinzhu/overmind/client/hook/proxies/pm/c$a0;,
        Lcom/xinzhu/overmind/client/hook/proxies/pm/c$t;,
        Lcom/xinzhu/overmind/client/hook/proxies/pm/c$w;,
        Lcom/xinzhu/overmind/client/hook/proxies/pm/c$v;,
        Lcom/xinzhu/overmind/client/hook/proxies/pm/c$u;,
        Lcom/xinzhu/overmind/client/hook/proxies/pm/c$d;,
        Lcom/xinzhu/overmind/client/hook/proxies/pm/c$c;,
        Lcom/xinzhu/overmind/client/hook/proxies/pm/c$r;,
        Lcom/xinzhu/overmind/client/hook/proxies/pm/c$l;
    }
.end annotation


# static fields
.field public static final b:Ljava/lang/String; = "PackageManagerStub"

.field private static final c:I = 0x400000

.field private static final d:I = 0x200000


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/xinzhu/haunted/android/app/g;->b0()Landroid/os/IInterface;

    move-result-object v0

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/xinzhu/overmind/client/hook/BinderInvocationStub;-><init>(Landroid/os/IBinder;)V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 4

    .line 1
    new-instance v0, Lcom/xinzhu/haunted/android/app/g;

    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->mainThread()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/xinzhu/haunted/android/app/g;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/app/g;->R()Ljava/lang/Object;

    move-result-object v0

    .line 2
    new-instance v1, Lcom/xinzhu/haunted/android/app/l;

    invoke-direct {v1, v0}, Lcom/xinzhu/haunted/android/app/l;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/xinzhu/haunted/android/app/l;->n()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    :try_start_0
    const-string v2, "android.app.ApplicationPackageManager"

    .line 3
    invoke-static {v2}, Lcom/xinzhu/overmind/utils/t;->n(Ljava/lang/String;)Lcom/xinzhu/overmind/utils/t;

    move-result-object v2

    const-string v3, "mPM"

    .line 4
    invoke-virtual {v2, v3}, Lcom/xinzhu/overmind/utils/t;->f(Ljava/lang/String;)Lcom/xinzhu/overmind/utils/t;

    move-result-object v2

    .line 5
    invoke-virtual {v2, v0}, Lcom/xinzhu/overmind/utils/t;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, Lcom/xinzhu/overmind/client/hook/b;->getProxyInvocation()Ljava/lang/Object;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eq v0, v2, :cond_0

    return v1

    :catch_0
    move-exception v0

    .line 6
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 7
    :cond_0
    invoke-virtual {p0}, Lcom/xinzhu/overmind/client/hook/b;->getProxyInvocation()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lcom/xinzhu/haunted/android/app/g;->b0()Landroid/os/IInterface;

    move-result-object v2

    if-eq v0, v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method protected getWho()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Lcom/xinzhu/haunted/android/app/g;->b0()Landroid/os/IInterface;

    move-result-object v0

    return-object v0
.end method

.method protected inject(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    move-object p1, p2

    check-cast p1, Landroid/os/IInterface;

    invoke-static {p1}, Lcom/xinzhu/haunted/android/app/g;->s0(Landroid/os/IInterface;)Z

    const-string p1, "package"

    .line 2
    invoke-virtual {p0, p1}, Lcom/xinzhu/overmind/client/hook/BinderInvocationStub;->replaceSystemService(Ljava/lang/String;)V

    .line 3
    new-instance p1, Lcom/xinzhu/haunted/android/app/g;

    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->mainThread()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/xinzhu/haunted/android/app/g;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/xinzhu/haunted/android/app/g;->R()Ljava/lang/Object;

    move-result-object p1

    .line 4
    new-instance v0, Lcom/xinzhu/haunted/android/app/l;

    invoke-direct {v0, p1}, Lcom/xinzhu/haunted/android/app/l;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/app/l;->n()Landroid/content/pm/PackageManager;

    move-result-object p1

    if-eqz p1, :cond_0

    :try_start_0
    const-string v0, "android.app.ApplicationPackageManager"

    .line 5
    invoke-static {v0}, Lcom/xinzhu/overmind/utils/t;->n(Ljava/lang/String;)Lcom/xinzhu/overmind/utils/t;

    move-result-object v0

    const-string v1, "mPM"

    .line 6
    invoke-virtual {v0, v1}, Lcom/xinzhu/overmind/utils/t;->f(Ljava/lang/String;)Lcom/xinzhu/overmind/utils/t;

    move-result-object v0

    .line 7
    invoke-virtual {v0, p1, p2}, Lcom/xinzhu/overmind/utils/t;->r(Ljava/lang/Object;Ljava/lang/Object;)Lcom/xinzhu/overmind/utils/t;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 9
    :cond_0
    :goto_0
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/xinzhu/overmind/client/hook/fixer/ContextFixer;->fix(Landroid/content/Context;)V

    :try_start_1
    const-string p1, "huawei.android.app.HwApiCacheMangerEx"

    .line 10
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 11
    invoke-static {}, Lcom/xinzhu/haunted/app/a;->c()Lcom/xinzhu/haunted/app/a;

    move-result-object p1

    .line 12
    invoke-virtual {p1}, Lcom/xinzhu/haunted/app/a;->a()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 13
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/xinzhu/haunted/app/a;->e(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    :cond_1
    return-void
.end method

.method protected onBindMethod()V
    .locals 5

    .line 1
    invoke-super {p0}, Lcom/xinzhu/overmind/client/hook/BinderInvocationStub;->onBindMethod()V

    .line 2
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$y;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$y;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 3
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$h;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$h;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 4
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$b0;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$b0;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 5
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$k;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$k;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 6
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$o;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$o;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 7
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$q;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$q;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 8
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$e;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$e;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 9
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$p;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$p;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 10
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$i;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$i;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 11
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$j;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$j;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 12
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$g;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$g;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 13
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$s;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$s;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 14
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$z;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$z;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 15
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$x;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$x;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 16
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$b;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$b;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 17
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$m;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$m;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 18
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$n;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$n;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 19
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$f;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$f;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 20
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$a0;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$a0;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 21
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$a;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->g:I

    const-string v2, "checkPermission"

    const/4 v3, 0x1

    invoke-direct {v0, p0, v2, v3, v1}, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$a;-><init>(Lcom/xinzhu/overmind/client/hook/proxies/pm/c;Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 22
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$t;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$t;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 23
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$w;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$w;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 24
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$v;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$v;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 25
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$u;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$u;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 26
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/c;

    const-string v1, "getInstallerPackageName"

    const-string v2, "com.android.vending"

    invoke-direct {v0, v1, v2}, Lcom/xinzhu/overmind/client/hook/common/c;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 27
    invoke-static {}, Lcom/xinzhu/overmind/utils/e;->w()Z

    move-result v0

    const/4 v1, 0x0

    .line 28
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v0, :cond_0

    .line 29
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/c;

    const-string v2, "notifyDexLoad"

    invoke-direct {v0, v2, v1}, Lcom/xinzhu/overmind/client/hook/common/c;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 30
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/c;

    const-string v2, "notifyPackageUse"

    invoke-direct {v0, v2, v1}, Lcom/xinzhu/overmind/client/hook/common/c;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 31
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/c;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-string v3, "setInstantAppCookie"

    invoke-direct {v0, v3, v2}, Lcom/xinzhu/overmind/client/hook/common/c;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 32
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/c;

    const-string v3, "isInstantApp"

    invoke-direct {v0, v3, v2}, Lcom/xinzhu/overmind/client/hook/common/c;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 33
    :cond_0
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/c;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v3, "performDexOpt"

    invoke-direct {v0, v3, v2}, Lcom/xinzhu/overmind/client/hook/common/c;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 34
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/c;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-string v4, "performDexOptIfNeeded"

    invoke-direct {v0, v4, v3}, Lcom/xinzhu/overmind/client/hook/common/c;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 35
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/c;

    const-string v3, "performDexOptSecondary"

    invoke-direct {v0, v3, v2}, Lcom/xinzhu/overmind/client/hook/common/c;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 36
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/c;

    const-string v3, "addOnPermissionsChangeListener"

    invoke-direct {v0, v3, v1}, Lcom/xinzhu/overmind/client/hook/common/c;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 37
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/c;

    const-string v3, "removeOnPermissionsChangeListener"

    invoke-direct {v0, v3, v1}, Lcom/xinzhu/overmind/client/hook/common/c;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 38
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/c;

    const-string v1, "addPermissionAsync"

    invoke-direct {v0, v1, v2}, Lcom/xinzhu/overmind/client/hook/common/c;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 39
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/c;

    const-string v1, "addPermission"

    invoke-direct {v0, v1, v2}, Lcom/xinzhu/overmind/client/hook/common/c;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 40
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$d;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$d;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 41
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$c;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$c;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 42
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$r;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$r;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 43
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$l;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/pm/c$l;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 44
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->f:I

    sget v2, Lcom/xinzhu/overmind/client/hook/common/d;->g:I

    const-string v3, "shouldShowRequestPermissionRationale"

    invoke-direct {v0, v3, v1, v2}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    return-void
.end method
