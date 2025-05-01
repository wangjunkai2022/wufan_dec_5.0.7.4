.class Lcom/xinzhu/overmind/server/e$a;
.super Ljava/lang/Object;
.source "MindProcessManager.java"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xinzhu/overmind/server/e;->a(Lcom/xinzhu/overmind/server/ProcessRecord;Landroid/os/IBinder;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/xinzhu/overmind/server/ProcessRecord;

.field final synthetic c:Landroid/os/IBinder;

.field final synthetic d:Lcom/xinzhu/overmind/server/e;


# direct methods
.method constructor <init>(Lcom/xinzhu/overmind/server/e;Lcom/xinzhu/overmind/server/ProcessRecord;Landroid/os/IBinder;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/xinzhu/overmind/server/e$a;->d:Lcom/xinzhu/overmind/server/e;

    iput-object p2, p0, Lcom/xinzhu/overmind/server/e$a;->b:Lcom/xinzhu/overmind/server/ProcessRecord;

    iput-object p3, p0, Lcom/xinzhu/overmind/server/e$a;->c:Landroid/os/IBinder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public binderDied()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Client Died: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/xinzhu/overmind/server/e$a;->b:Lcom/xinzhu/overmind/server/ProcessRecord;

    iget-object v1, v1, Lcom/xinzhu/overmind/server/ProcessRecord;->processName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-object v0, p0, Lcom/xinzhu/overmind/server/e$a;->c:Landroid/os/IBinder;

    const/4 v1, 0x0

    invoke-interface {v0, p0, v1}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    .line 3
    iget-object v0, p0, Lcom/xinzhu/overmind/server/e$a;->d:Lcom/xinzhu/overmind/server/e;

    iget-object v1, p0, Lcom/xinzhu/overmind/server/e$a;->b:Lcom/xinzhu/overmind/server/ProcessRecord;

    invoke-virtual {v0, v1}, Lcom/xinzhu/overmind/server/e;->m(Lcom/xinzhu/overmind/server/ProcessRecord;)V

    return-void
.end method
