.class public Lcom/xinzhu/overmind/client/hook/proxies/app/d;
.super Lcom/xinzhu/overmind/client/hook/BinderInvocationStub;
.source "NotificationManagerStub.java"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/xinzhu/haunted/android/app/v;->c()Landroid/os/IInterface;

    move-result-object v0

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/xinzhu/overmind/client/hook/BinderInvocationStub;-><init>(Landroid/os/IBinder;)V

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

    .line 1
    invoke-static {}, Lcom/xinzhu/haunted/android/app/v;->c()Landroid/os/IInterface;

    move-result-object v0

    return-object v0
.end method

.method protected inject(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/xinzhu/overmind/client/hook/b;->getProxyInvocation()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/IInterface;

    invoke-static {p1}, Lcom/xinzhu/haunted/android/app/v;->e(Landroid/os/IInterface;)Z

    const-string p1, "notification"

    .line 2
    invoke-virtual {p0, p1}, Lcom/xinzhu/overmind/client/hook/BinderInvocationStub;->replaceSystemService(Ljava/lang/String;)V

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
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/app/d$a;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    sget v2, Lcom/xinzhu/overmind/client/hook/common/d;->g:I

    const-string v3, "cancelAllNotifications"

    invoke-direct {v0, p0, v3, v1, v2}, Lcom/xinzhu/overmind/client/hook/proxies/app/d$a;-><init>(Lcom/xinzhu/overmind/client/hook/proxies/app/d;Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 3
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/app/d$b;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    sget v2, Lcom/xinzhu/overmind/client/hook/common/d;->g:I

    const-string v3, "enqueueNotificationWithTag"

    invoke-direct {v0, p0, v3, v1, v2}, Lcom/xinzhu/overmind/client/hook/proxies/app/d$b;-><init>(Lcom/xinzhu/overmind/client/hook/proxies/app/d;Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 4
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/app/d$c;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    sget v2, Lcom/xinzhu/overmind/client/hook/common/d;->g:I

    const-string v3, "cancelNotificationWithTag"

    invoke-direct {v0, p0, v3, v1, v2}, Lcom/xinzhu/overmind/client/hook/proxies/app/d$c;-><init>(Lcom/xinzhu/overmind/client/hook/proxies/app/d;Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 5
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/app/d$d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->f:I

    sget v2, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    const-string v3, "deleteNotificationChannel"

    invoke-direct {v0, p0, v3, v1, v2}, Lcom/xinzhu/overmind/client/hook/proxies/app/d$d;-><init>(Lcom/xinzhu/overmind/client/hook/proxies/app/d;Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 6
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    invoke-static {}, Lcom/xinzhu/overmind/utils/e;->f()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    sget v2, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    :goto_0
    const-string v4, "getNotificationChannel"

    invoke-direct {v0, v4, v1, v2}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 7
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    const-string v2, "getConversationNotificationChannel"

    invoke-direct {v0, v2, v1, v3}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 8
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    invoke-static {}, Lcom/xinzhu/overmind/utils/e;->f()Z

    move-result v2

    if-eqz v2, :cond_1

    sget v2, Lcom/xinzhu/overmind/client/hook/common/d;->g:I

    goto :goto_1

    :cond_1
    sget v2, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    :goto_1
    const-string v4, "getNotificationChannels"

    invoke-direct {v0, v4, v1, v2}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 9
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    sget v2, Lcom/xinzhu/overmind/client/hook/common/d;->g:I

    const-string v4, "getBlockedAppCount"

    invoke-direct {v0, v4, v1, v2}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 10
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    sget v2, Lcom/xinzhu/overmind/client/hook/common/d;->g:I

    const-string v4, "getNotificationChannelsBypassingDnd"

    invoke-direct {v0, v4, v1, v2}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 11
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    sget v2, Lcom/xinzhu/overmind/client/hook/common/d;->g:I

    const-string v4, "registerListener"

    invoke-direct {v0, v4, v1, v2}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 12
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    sget v2, Lcom/xinzhu/overmind/client/hook/common/d;->g:I

    const-string v4, "unregisterListener"

    invoke-direct {v0, v4, v1, v2}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 13
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    sget v2, Lcom/xinzhu/overmind/client/hook/common/d;->g:I

    const-string v4, "isNotificationListenerAccessGrantedForUser"

    invoke-direct {v0, v4, v1, v2}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 14
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    const-string v2, "setNotificationListenerAccessGrantedForUser"

    invoke-direct {v0, v2, v1, v3}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 15
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    const-string v2, "setNotificationAssistantAccessGrantedForUser"

    invoke-direct {v0, v2, v1, v3}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 16
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    sget v2, Lcom/xinzhu/overmind/client/hook/common/d;->g:I

    const-string v4, "getEnabledNotificationListeners"

    invoke-direct {v0, v4, v1, v2}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 17
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    sget v2, Lcom/xinzhu/overmind/client/hook/common/d;->g:I

    const-string v4, "getAllowedNotificationAssistantForUser"

    invoke-direct {v0, v4, v1, v2}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 18
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    const-string v2, "setNotificationPolicyAccessGrantedForUser"

    invoke-direct {v0, v2, v1, v3}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 19
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    sget v2, Lcom/xinzhu/overmind/client/hook/common/d;->g:I

    const-string v3, "getAppActiveNotifications"

    invoke-direct {v0, v3, v1, v2}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 20
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    sget v2, Lcom/xinzhu/overmind/client/hook/common/d;->g:I

    const-string v3, "canNotifyAsPackage"

    invoke-direct {v0, v3, v1, v2}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 21
    new-instance v0, Lcom/xinzhu/overmind/client/hook/common/d;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->e:I

    sget v2, Lcom/xinzhu/overmind/client/hook/common/d;->g:I

    const-string v3, "removeEdgeNotification"

    invoke-direct {v0, v3, v1, v2}, Lcom/xinzhu/overmind/client/hook/common/d;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    .line 22
    new-instance v0, Lcom/xinzhu/overmind/client/hook/proxies/app/d$e;

    sget v1, Lcom/xinzhu/overmind/client/hook/common/d;->g:I

    const-string v2, "hasPackageBeenManaged"

    invoke-direct {v0, p0, v2, v1}, Lcom/xinzhu/overmind/client/hook/proxies/app/d$e;-><init>(Lcom/xinzhu/overmind/client/hook/proxies/app/d;Ljava/lang/String;I)V

    invoke-virtual {p0, v0}, Lcom/xinzhu/overmind/client/hook/b;->addMethodHook(Lcom/xinzhu/overmind/client/hook/e;)V

    return-void
.end method
