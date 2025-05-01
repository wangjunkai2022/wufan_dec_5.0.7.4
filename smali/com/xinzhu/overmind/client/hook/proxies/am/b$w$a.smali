.class Lcom/xinzhu/overmind/client/hook/proxies/am/b$w$a;
.super Ljava/lang/Object;
.source "ActivityManagerStub.java"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xinzhu/overmind/client/hook/proxies/am/b$w;->d(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/os/IBinder;

.field final synthetic c:Lcom/xinzhu/overmind/client/hook/proxies/am/b$w;


# direct methods
.method constructor <init>(Lcom/xinzhu/overmind/client/hook/proxies/am/b$w;Landroid/os/IBinder;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/xinzhu/overmind/client/hook/proxies/am/b$w$a;->c:Lcom/xinzhu/overmind/client/hook/proxies/am/b$w;

    iput-object p2, p0, Lcom/xinzhu/overmind/client/hook/proxies/am/b$w$a;->b:Landroid/os/IBinder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public binderDied()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xinzhu/overmind/client/hook/proxies/am/b$w$a;->b:Landroid/os/IBinder;

    const/4 v1, 0x0

    invoke-interface {v0, p0, v1}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    .line 2
    iget-object v0, p0, Lcom/xinzhu/overmind/client/hook/proxies/am/b$w$a;->c:Lcom/xinzhu/overmind/client/hook/proxies/am/b$w;

    invoke-static {v0}, Lcom/xinzhu/overmind/client/hook/proxies/am/b$w;->f(Lcom/xinzhu/overmind/client/hook/proxies/am/b$w;)Ljava/util/WeakHashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/xinzhu/overmind/client/hook/proxies/am/b$w$a;->b:Landroid/os/IBinder;

    invoke-virtual {v0, v1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
