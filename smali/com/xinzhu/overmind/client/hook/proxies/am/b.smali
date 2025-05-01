.class public Lcom/xinzhu/overmind/client/hook/proxies/am/b;
.super Lcom/xinzhu/overmind/client/hook/BinderInvocationStub;
.source "ActivityManagerStub.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xinzhu/overmind/client/hook/proxies/am/b$k;,
        Lcom/xinzhu/overmind/client/hook/proxies/am/b$z;,
        Lcom/xinzhu/overmind/client/hook/proxies/am/b$a0;,
        Lcom/xinzhu/overmind/client/hook/proxies/am/b$b0;,
        Lcom/xinzhu/overmind/client/hook/proxies/am/b$d;,
        Lcom/xinzhu/overmind/client/hook/proxies/am/b$c;,
        Lcom/xinzhu/overmind/client/hook/proxies/am/b$c0;,
        Lcom/xinzhu/overmind/client/hook/proxies/am/b$p;,
        Lcom/xinzhu/overmind/client/hook/proxies/am/b$o;,
        Lcom/xinzhu/overmind/client/hook/proxies/am/b$q;,
        Lcom/xinzhu/overmind/client/hook/proxies/am/b$n;,
        Lcom/xinzhu/overmind/client/hook/proxies/am/b$v;,
        Lcom/xinzhu/overmind/client/hook/proxies/am/b$u;,
        Lcom/xinzhu/overmind/client/hook/proxies/am/b$y;,
        Lcom/xinzhu/overmind/client/hook/proxies/am/b$f;,
        Lcom/xinzhu/overmind/client/hook/proxies/am/b$g;,
        Lcom/xinzhu/overmind/client/hook/proxies/am/b$w;,
        Lcom/xinzhu/overmind/client/hook/proxies/am/b$x;,
        Lcom/xinzhu/overmind/client/hook/proxies/am/b$r;,
        Lcom/xinzhu/overmind/client/hook/proxies/am/b$j;,
        Lcom/xinzhu/overmind/client/hook/proxies/am/b$h;,
        Lcom/xinzhu/overmind/client/hook/proxies/am/b$i;,
        Lcom/xinzhu/overmind/client/hook/proxies/am/b$t;,
        Lcom/xinzhu/overmind/client/hook/proxies/am/b$l;,
        Lcom/xinzhu/overmind/client/hook/proxies/am/b$b;,
        Lcom/xinzhu/overmind/client/hook/proxies/am/b$s;,
        Lcom/xinzhu/overmind/client/hook/proxies/am/b$m;,
        Lcom/xinzhu/overmind/client/hook/proxies/am/b$e;
    }
.end annotation


# static fields
.field public static final b:Ljava/lang/String; = "ActivityManagerStub"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/xinzhu/haunted/android/app/d;->c()Landroid/os/IInterface;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Landroid/os/IInterface;

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/xinzhu/overmind/client/hook/BinderInvocationStub;-><init>(Landroid/os/IBinder;)V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 2

    .line 1
    invoke-static {}, Lcom/xinzhu/haunted/android/app/d;->c()Landroid/os/IInterface;

    move-result-object v0

    invoke-virtual {p0}, Lcom/xinzhu/overmind/client/hook/b;->getProxyInvocation()Ljava/lang/Object;

    move-result-object v1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected getWho()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Lcom/xinzhu/haunted/android/app/d;->c()Landroid/os/IInterface;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Landroid/os/IInterface;

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/xinzhu/haunted/android/app/m$b;->a(Landroid/os/IBinder;)Landroid/os/IInterface;

    move-result-object v0

    return-object v0
.end method

.method protected inject(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/xinzhu/overmind/utils/e;->w()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-static {}, Lcom/xinzhu/haunted/android/app/e;->d()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {}, Lcom/xinzhu/overmind/utils/e;->a()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 4
    invoke-static {}, Lcom/xinzhu/haunted/android/app/d;->d()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 5
    :goto_0
    new-instance v0, Lcom/xinzhu/haunted/android/util/b;

    invoke-direct {v0, p1}, Lcom/xinzhu/haunted/android/util/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p2}, Lcom/xinzhu/haunted/android/util/b;->e(Ljava/lang/Object;)Z

    const-string p1, "activity"

    .line 6
    invoke-virtual {p0, p1}, Lcom/xinzhu/overmind/client/hook/BinderInvocationStub;->replaceSystemService(Ljava/lang/String;)V

    return-void
.end method

.method protected onBindMethod()V
    .locals 8

    .line 1
    const-class v0, Ljava/lang/String;

    new-instance v1, Lcom/xinzhu/overmind/client/hook/proxies/am/b$k;

    invoke-direct {v1}, Lcom/xinzhu/overmind/client/hook/proxies/am/b$k;-><init>()V

    invoke-virtual {p0, v1}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 2
    new-instance v1, Lcom/xinzhu/overmind/client/hook/proxies/am/b$z;

    invoke-direct {v1}, Lcom/xinzhu/overmind/client/hook/proxies/am/b$z;-><init>()V

    invoke-virtual {p0, v1}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 3
    new-instance v1, Lcom/xinzhu/overmind/client/hook/proxies/am/b$a0;

    invoke-direct {v1}, Lcom/xinzhu/overmind/client/hook/proxies/am/b$a0;-><init>()V

    invoke-virtual {p0, v1}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 4
    new-instance v1, Lcom/xinzhu/overmind/client/hook/proxies/am/b$b0;

    invoke-direct {v1}, Lcom/xinzhu/overmind/client/hook/proxies/am/b$b0;-><init>()V

    invoke-virtual {p0, v1}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 5
    new-instance v1, Lcom/xinzhu/overmind/client/hook/proxies/am/b$d;

    invoke-direct {v1}, Lcom/xinzhu/overmind/client/hook/proxies/am/b$d;-><init>()V

    invoke-virtual {p0, v1}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 6
    new-instance v1, Lcom/xinzhu/overmind/client/hook/proxies/am/b$c;

    invoke-direct {v1}, Lcom/xinzhu/overmind/client/hook/proxies/am/b$c;-><init>()V

    invoke-virtual {p0, v1}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 7
    new-instance v1, Lcom/xinzhu/overmind/client/hook/proxies/am/b$c0;

    invoke-direct {v1}, Lcom/xinzhu/overmind/client/hook/proxies/am/b$c0;-><init>()V

    invoke-virtual {p0, v1}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 8
    new-instance v1, Lcom/xinzhu/overmind/client/hook/proxies/am/b$p;

    invoke-direct {v1}, Lcom/xinzhu/overmind/client/hook/proxies/am/b$p;-><init>()V

    invoke-virtual {p0, v1}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 9
    new-instance v1, Lcom/xinzhu/overmind/client/hook/proxies/am/b$o;

    invoke-direct {v1}, Lcom/xinzhu/overmind/client/hook/proxies/am/b$o;-><init>()V

    invoke-virtual {p0, v1}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 10
    new-instance v1, Lcom/xinzhu/overmind/client/hook/proxies/am/b$q;

    invoke-direct {v1}, Lcom/xinzhu/overmind/client/hook/proxies/am/b$q;-><init>()V

    invoke-virtual {p0, v1}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 11
    new-instance v1, Lcom/xinzhu/overmind/client/hook/proxies/am/b$n;

    invoke-direct {v1}, Lcom/xinzhu/overmind/client/hook/proxies/am/b$n;-><init>()V

    invoke-virtual {p0, v1}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 12
    new-instance v1, Lcom/xinzhu/overmind/client/hook/proxies/am/b$v;

    invoke-direct {v1}, Lcom/xinzhu/overmind/client/hook/proxies/am/b$v;-><init>()V

    invoke-virtual {p0, v1}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 13
    new-instance v1, Lcom/xinzhu/overmind/client/hook/proxies/am/b$u;

    invoke-direct {v1}, Lcom/xinzhu/overmind/client/hook/proxies/am/b$u;-><init>()V

    invoke-virtual {p0, v1}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 14
    new-instance v1, Lcom/xinzhu/overmind/client/hook/proxies/am/b$y;

    invoke-direct {v1}, Lcom/xinzhu/overmind/client/hook/proxies/am/b$y;-><init>()V

    invoke-virtual {p0, v1}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 15
    new-instance v1, Lcom/xinzhu/overmind/client/hook/proxies/am/b$f;

    invoke-direct {v1}, Lcom/xinzhu/overmind/client/hook/proxies/am/b$f;-><init>()V

    invoke-virtual {p0, v1}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 16
    new-instance v1, Lcom/xinzhu/overmind/client/hook/proxies/am/b$g;

    invoke-direct {v1}, Lcom/xinzhu/overmind/client/hook/proxies/am/b$g;-><init>()V

    invoke-virtual {p0, v1}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 17
    new-instance v1, Lcom/xinzhu/overmind/client/hook/proxies/am/b$w;

    invoke-direct {v1}, Lcom/xinzhu/overmind/client/hook/proxies/am/b$w;-><init>()V

    invoke-virtual {p0, v1}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 18
    new-instance v1, Lcom/xinzhu/overmind/client/hook/proxies/am/b$x;

    invoke-direct {v1}, Lcom/xinzhu/overmind/client/hook/proxies/am/b$x;-><init>()V

    invoke-virtual {p0, v1}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 19
    invoke-static {}, Lcom/xinzhu/overmind/utils/e;->k()Z

    move-result v1

    const/4 v2, 0x4

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    .line 20
    sget-object v1, Lcom/xinzhu/haunted/android/app/u$a;->b:Ljava/lang/Class;

    const/16 v4, 0xb

    new-array v4, v4, [Ljava/lang/Object;

    const-class v5, Landroid/content/Intent;

    aput-object v5, v4, v3

    const/4 v5, 0x1

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v6, v4, v5

    const/4 v5, 0x2

    aput-object v0, v4, v5

    const/4 v5, 0x3

    const-class v7, Landroid/os/Bundle;

    aput-object v7, v4, v5

    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v5, v4, v2

    const/4 v7, 0x5

    aput-object v5, v4, v7

    const/4 v7, 0x6

    aput-object v5, v4, v7

    const/4 v5, 0x7

    aput-object v6, v4, v5

    const/16 v5, 0x8

    aput-object v6, v4, v5

    const/16 v5, 0x9

    aput-object v0, v4, v5

    const/16 v0, 0xa

    new-instance v5, Lcom/xinzhu/overmind/client/hook/proxies/am/b$a;

    invoke-direct {v5, p0}, Lcom/xinzhu/overmind/client/hook/proxies/am/b$a;-><init>(Lcom/xinzhu/overmind/client/hook/proxies/am/b;)V

    aput-object v5, v4, v0

    const-string v0, "performReceive"

    invoke-static {v1, v0, v4}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 21
    :cond_0
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/am/b$r;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/am/b$r;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 22
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/am/b$j;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/am/b$j;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 23
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/am/b$h;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/am/b$h;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 24
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/am/b$i;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/am/b$i;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 25
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/am/b$t;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/am/b$t;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 26
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/c;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v3, "setServiceForeground"

    invoke-direct {v0, v3, v1}, Lcom/xinzhu/overmind/client/hook/common/c;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 27
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/c;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "getPackageProcessState"

    invoke-direct {v0, v2, v1}, Lcom/xinzhu/overmind/client/hook/common/c;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 28
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->f:I

    sget v2, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    const-string v3, "getHistoricalProcessExitReasons"

    invoke-direct {v0, v3, v1, v2}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 29
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/am/d$o;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/am/d$o;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 30
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/am/d$n;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/am/d$n;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 31
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/am/d$a;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/am/d$a;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 32
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/am/d$b;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/am/d$b;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 33
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/am/d$c;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/am/d$c;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 34
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/am/d$d;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/am/d$d;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 35
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/am/d$f;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/am/d$f;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 36
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/am/d$g;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/am/d$g;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 37
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/am/d$s;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/am/d$s;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 38
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/am/d$p;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/am/d$p;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 39
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/am/d$r;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/am/d$r;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 40
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/am/d$t;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/am/d$t;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 41
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/am/d$q;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/am/d$q;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 42
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/am/d$l;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/am/d$l;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 43
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/am/d$e;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/am/d$e;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 44
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/am/d$k;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/am/d$k;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 45
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/am/d$h;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/am/d$h;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 46
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/am/d$i;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/am/d$i;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 47
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/am/d$j;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/am/d$j;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 48
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/am/d$m;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/am/d$m;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 49
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/am/b$l;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/am/b$l;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 50
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/am/b$b;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/am/b$b;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 51
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/am/b$s;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/am/b$s;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 52
    invoke-static {}, Lcom/xinzhu/overmind/utils/e;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 53
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/am/b$m;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/am/b$m;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 54
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/am/b$e;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/hook/proxies/am/b$e;-><init>()V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 55
    :cond_1
    invoke-static {}, Lcom/xinzhu/overmind/utils/e;->g()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 56
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->f:I

    sget v2, Lcom/xinzhu/overmind/client/hook/common/d;->g:I

    invoke-direct {v0, v3, v1, v2}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    :cond_2
    return-void
.end method
