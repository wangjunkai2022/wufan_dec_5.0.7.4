.class public Lcom/xinzhu/overmind/client/frameworks/b;
.super Ljava/lang/Object;
.source "MindContentManager.java"


# static fields
.field private static b:Lcom/xinzhu/overmind/client/frameworks/b;


# instance fields
.field private a:Lcom/xinzhu/overmind/server/content/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/xinzhu/overmind/client/frameworks/b;

    invoke-direct {v0}, Lcom/xinzhu/overmind/client/frameworks/b;-><init>()V

    sput-object v0, Lcom/xinzhu/overmind/client/frameworks/b;->b:Lcom/xinzhu/overmind/client/frameworks/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/xinzhu/overmind/client/frameworks/b;
    .locals 1

    .line 1
    sget-object v0, Lcom/xinzhu/overmind/client/frameworks/b;->b:Lcom/xinzhu/overmind/client/frameworks/b;

    return-object v0
.end method

.method private b()Lcom/xinzhu/overmind/server/content/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xinzhu/overmind/client/frameworks/b;->a:Lcom/xinzhu/overmind/server/content/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-interface {v0}, Landroid/os/IBinder;->isBinderAlive()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xinzhu/overmind/client/frameworks/b;->a:Lcom/xinzhu/overmind/server/content/a;

    return-object v0

    .line 3
    :cond_0
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    move-result-object v0

    const-string v1, "content_manager"

    invoke-virtual {v0, v1}, Lcom/xinzhu/overmind/Overmind;->getService(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/xinzhu/overmind/server/content/a$b;->asInterface(Landroid/os/IBinder;)Lcom/xinzhu/overmind/server/content/a;

    move-result-object v0

    iput-object v0, p0, Lcom/xinzhu/overmind/client/frameworks/b;->a:Lcom/xinzhu/overmind/server/content/a;

    .line 4
    invoke-direct {p0}, Lcom/xinzhu/overmind/client/frameworks/b;->b()Lcom/xinzhu/overmind/server/content/a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public c(Landroid/net/Uri;Landroid/database/IContentObserver;ZZII)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/xinzhu/overmind/client/frameworks/b;->b()Lcom/xinzhu/overmind/server/content/a;

    move-result-object v0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-interface/range {v0 .. v6}, Lcom/xinzhu/overmind/server/content/a;->notifyChange(Landroid/net/Uri;Landroid/database/IContentObserver;ZZII)V

    return-void
.end method

.method public d(Landroid/net/Uri;ZLandroid/database/IContentObserver;II)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/xinzhu/overmind/client/frameworks/b;->b()Lcom/xinzhu/overmind/server/content/a;

    move-result-object v0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    invoke-interface/range {v0 .. v5}, Lcom/xinzhu/overmind/server/content/a;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/IContentObserver;II)V

    return-void
.end method

.method public e(Landroid/database/IContentObserver;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/xinzhu/overmind/client/frameworks/b;->b()Lcom/xinzhu/overmind/server/content/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/xinzhu/overmind/server/content/a;->unregisterContentObserver(Landroid/database/IContentObserver;)V

    return-void
.end method
