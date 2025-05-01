.class Lcom/beizi/fusion/sm/a/a/b$1;
.super Ljava/lang/Object;
.source "CoolpadImpl.java"

# interfaces
.implements Lcom/beizi/fusion/sm/a/a/m$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/sm/a/a/b;->a(Lcom/beizi/fusion/sm/a/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/sm/a/a/b;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/sm/a/a/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/sm/a/a/b$1;->a:Lcom/beizi/fusion/sm/a/a/b;

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
    invoke-static {p1}, Lcom/beizi/fusion/sm/repeackage/com/coolpad/deviceidsupport/IDeviceIdManager$Stub;->asInterface(Landroid/os/IBinder;)Lcom/beizi/fusion/sm/repeackage/com/coolpad/deviceidsupport/IDeviceIdManager;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/sm/a/a/b$1;->a:Lcom/beizi/fusion/sm/a/a/b;

    invoke-static {v0}, Lcom/beizi/fusion/sm/a/a/b;->a(Lcom/beizi/fusion/sm/a/a/b;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/beizi/fusion/sm/repeackage/com/coolpad/deviceidsupport/IDeviceIdManager;->getOAID(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    new-instance p1, Lcom/beizi/fusion/sm/a/e;

    const-string v0, "IDeviceIdManager is null"

    invoke-direct {p1, v0}, Lcom/beizi/fusion/sm/a/e;-><init>(Ljava/lang/String;)V

    throw p1
.end method
