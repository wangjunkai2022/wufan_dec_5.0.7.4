.class Lcom/beizi/fusion/sm/a/a/h$1;
.super Ljava/lang/Object;
.source "LenovoImpl.java"

# interfaces
.implements Lcom/beizi/fusion/sm/a/a/m$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/sm/a/a/h;->a(Lcom/beizi/fusion/sm/a/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/sm/a/a/h;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/sm/a/a/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/sm/a/a/h$1;->a:Lcom/beizi/fusion/sm/a/a/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/IBinder;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/beizi/fusion/sm/a/e;,
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/beizi/fusion/sm/repeackage/com/zui/deviceidservice/IDeviceidInterface$Stub;->asInterface(Landroid/os/IBinder;)Lcom/beizi/fusion/sm/repeackage/com/zui/deviceidservice/IDeviceidInterface;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 2
    invoke-interface {p1}, Lcom/beizi/fusion/sm/repeackage/com/zui/deviceidservice/IDeviceidInterface;->isSupport()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {p1}, Lcom/beizi/fusion/sm/repeackage/com/zui/deviceidservice/IDeviceidInterface;->getOAID()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 4
    :cond_0
    new-instance p1, Lcom/beizi/fusion/sm/a/e;

    const-string v0, "IDeviceidInterface#isSupport return false"

    invoke-direct {p1, v0}, Lcom/beizi/fusion/sm/a/e;-><init>(Ljava/lang/String;)V

    throw p1

    .line 5
    :cond_1
    new-instance p1, Lcom/beizi/fusion/sm/a/e;

    const-string v0, "IDeviceidInterface is null"

    invoke-direct {p1, v0}, Lcom/beizi/fusion/sm/a/e;-><init>(Ljava/lang/String;)V

    throw p1
.end method
