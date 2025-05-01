.class public Lcom/xinzhu/overmind/client/frameworks/c;
.super Ljava/lang/Object;
.source "MindDeviceManager.java"


# static fields
.field private static b:Lcom/xinzhu/overmind/client/frameworks/c;


# instance fields
.field private a:Lcom/xinzhu/overmind/server/os/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/xinzhu/overmind/client/frameworks/c;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/frameworks/c;-><init>()V

    sput-object v0, Lcom/xinzhu/overmind/client/frameworks/c;->b:Lcom/xinzhu/overmind/client/frameworks/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/xinzhu/overmind/client/frameworks/c;
    .locals 1

    .line 1
    sget-object v0, Lcom/xinzhu/overmind/client/frameworks/c;->b:Lcom/xinzhu/overmind/client/frameworks/c;

    return-object v0
.end method

.method private c()Lcom/xinzhu/overmind/server/os/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xinzhu/overmind/client/frameworks/c;->a:Lcom/xinzhu/overmind/server/os/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-interface {v0}, Landroid/os/IBinder;->isBinderAlive()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xinzhu/overmind/client/frameworks/c;->a:Lcom/xinzhu/overmind/server/os/a;

    return-object v0

    .line 3
    :cond_0
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    move-result-object v0

    const-string v1, "device_manager"

    invoke-virtual {v0, v1}, Lcom/xinzhu/overmind/Overmind;->getService(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/xinzhu/overmind/server/os/a$b;->asInterface(Landroid/os/IBinder;)Lcom/xinzhu/overmind/server/os/a;

    move-result-object v0

    iput-object v0, p0, Lcom/xinzhu/overmind/client/frameworks/c;->a:Lcom/xinzhu/overmind/server/os/a;

    .line 4
    invoke-direct {p0}, Lcom/xinzhu/overmind/client/frameworks/c;->c()Lcom/xinzhu/overmind/server/os/a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public b(I)Lcom/xinzhu/overmind/server/os/MindDeviceInfo;
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xinzhu/overmind/Overmind;->isVirtualProcess()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/xinzhu/overmind/client/e;->getVPackageName()Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {}, Lcom/xinzhu/overmind/client/e;->getUserId()I

    move-result v1

    if-eqz v0, :cond_1

    .line 4
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Lcom/xinzhu/overmind/Overmind;->ifDisableVirtualDeviceForPackage(Ljava/lang/String;I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 5
    invoke-direct {p0}, Lcom/xinzhu/overmind/client/frameworks/c;->c()Lcom/xinzhu/overmind/server/os/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/xinzhu/overmind/server/os/a;->getDeviceInfo(I)Lcom/xinzhu/overmind/server/os/MindDeviceInfo;

    move-result-object p1

    return-object p1

    .line 6
    :cond_0
    invoke-direct {p0}, Lcom/xinzhu/overmind/client/frameworks/c;->c()Lcom/xinzhu/overmind/server/os/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/xinzhu/overmind/server/os/a;->getDeviceInfo(I)Lcom/xinzhu/overmind/server/os/MindDeviceInfo;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public d(Z)V
    .locals 1

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/xinzhu/overmind/client/frameworks/c;->c()Lcom/xinzhu/overmind/server/os/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/xinzhu/overmind/server/os/a;->setVirtualDeviceStatus(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 2
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public e(ILcom/xinzhu/overmind/server/os/MindDeviceInfo;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/xinzhu/overmind/client/frameworks/c;->c()Lcom/xinzhu/overmind/server/os/a;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/xinzhu/overmind/server/os/a;->updateMindDeviceInfo(ILcom/xinzhu/overmind/server/os/MindDeviceInfo;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 2
    invoke-virtual {p1}, Landroid/os/RemoteException;->printStackTrace()V

    :goto_0
    return-void
.end method
