.class Lcom/xinzhu/overmind/client/hook/proxies/am/b$d;
.super Lcom/xinzhu/overmind/client/hook/e;
.source "ActivityManagerStub.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xinzhu/overmind/client/hook/proxies/am/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/xinzhu/overmind/client/hook/e;-><init>()V

    return-void
.end method


# virtual methods
.method protected c()Ljava/lang/String;
    .locals 1

    const-string v0, "bindService"

    return-object v0
.end method

.method protected d(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    invoke-static {p3}, Lcom/xinzhu/overmind/utils/helpers/c;->f([Ljava/lang/Object;)V

    const/4 v0, 0x2

    .line 2
    aget-object v1, p3, v0

    check-cast v1, Landroid/content/Intent;

    const/4 v2, 0x3

    .line 3
    aget-object v2, p3, v2

    move-object v5, v2

    check-cast v5, Ljava/lang/String;

    const/4 v2, 0x5

    .line 4
    aget-object v2, p3, v2

    invoke-static {v2}, Lcom/xinzhu/overmind/utils/r;->a(Ljava/lang/Object;)I

    move-result v7

    const/4 v8, 0x4

    .line 5
    aget-object v2, p3, v8

    move-object v9, v2

    check-cast v9, Landroid/app/IServiceConnection;

    .line 6
    invoke-static {p3}, Lcom/xinzhu/overmind/utils/helpers/c;->f([Ljava/lang/Object;)V

    .line 7
    invoke-static {p3}, Lcom/xinzhu/overmind/utils/helpers/c;->e([Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getMindPackageManager()Lcom/xinzhu/overmind/client/frameworks/g;

    move-result-object v2

    invoke-static {}, Lcom/xinzhu/overmind/client/e;->getUserId()I

    move-result v3

    const/4 v10, 0x0

    invoke-virtual {v2, v1, v10, v5, v3}, Lcom/xinzhu/overmind/client/frameworks/g;->C(Landroid/content/Intent;ILjava/lang/String;I)Landroid/content/pm/ResolveInfo;

    move-result-object v11

    if-eqz v11, :cond_3

    .line 9
    invoke-virtual {p0}, Lcom/xinzhu/overmind/client/hook/proxies/am/b$d;->f()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    const/4 v2, 0x6

    .line 10
    aput-object v3, p3, v2

    .line 11
    :cond_0
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getMindActivityManager()Lcom/xinzhu/overmind/client/frameworks/a;

    move-result-object v2

    if-nez v9, :cond_1

    goto :goto_0

    .line 12
    :cond_1
    invoke-interface {v9}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v3

    :goto_0
    move-object v4, v3

    .line 13
    invoke-static {}, Lcom/xinzhu/overmind/client/e;->getUserId()I

    move-result v6

    move-object v3, v1

    .line 14
    invoke-virtual/range {v2 .. v7}, Lcom/xinzhu/overmind/client/frameworks/a;->bindService(Landroid/content/Intent;Landroid/os/IBinder;Ljava/lang/String;II)Landroid/content/Intent;

    move-result-object v2

    if-eqz v9, :cond_2

    .line 15
    new-instance v3, Landroid/content/ComponentName;

    iget-object v4, v11, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    iget-object v5, v4, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    iget-object v4, v4, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    invoke-direct {v3, v5, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v9, v3}, Lcom/xinzhu/overmind/client/hook/delegate/c;->createProxy(Landroid/app/IServiceConnection;Landroid/content/ComponentName;)Landroid/app/IServiceConnection;

    move-result-object v3

    aput-object v3, p3, v8

    :cond_2
    if-eqz v2, :cond_3

    .line 16
    aput-object v2, p3, v0

    .line 17
    invoke-virtual {p2, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 18
    :cond_3
    invoke-virtual {v1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v0

    invoke-static {v0}, Lcom/xinzhu/overmind/client/hook/env/a;->e(Landroid/content/ComponentName;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 19
    invoke-virtual {p2, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 20
    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "bindService failed and skip "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "ActivityManagerStub"

    invoke-static {p2, p1}, Lcom/xinzhu/overmind/b;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method protected f()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
