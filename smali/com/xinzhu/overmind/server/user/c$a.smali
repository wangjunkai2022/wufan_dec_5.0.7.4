.class Lcom/xinzhu/overmind/server/user/c$a;
.super Ljava/lang/Object;
.source "MindUserManagerService.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xinzhu/overmind/server/user/c;->createUserLocked(I)Lcom/xinzhu/overmind/server/user/MindUserInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/xinzhu/overmind/server/user/c;


# direct methods
.method constructor <init>(Lcom/xinzhu/overmind/server/user/c;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/xinzhu/overmind/server/user/c$a;->c:Lcom/xinzhu/overmind/server/user/c;

    iput p2, p0, Lcom/xinzhu/overmind/server/user/c$a;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/xinzhu/overmind/client/hook/env/a;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 2
    invoke-static {}, Lcom/xinzhu/overmind/server/pm/i;->get()Lcom/xinzhu/overmind/server/pm/i;

    move-result-object v2

    iget v3, p0, Lcom/xinzhu/overmind/server/user/c$a;->b:I

    invoke-virtual {v2, v1, v3}, Lcom/xinzhu/overmind/server/pm/i;->isInstalled(Ljava/lang/String;I)Z

    move-result v2

    if-nez v2, :cond_0

    .line 3
    invoke-static {}, Lcom/xinzhu/overmind/server/pm/i;->get()Lcom/xinzhu/overmind/server/pm/i;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3}, Lcom/xinzhu/overmind/server/pm/i;->isInstalled(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 4
    invoke-static {}, Lcom/xinzhu/overmind/server/pm/i;->get()Lcom/xinzhu/overmind/server/pm/i;

    move-result-object v2

    iget v3, p0, Lcom/xinzhu/overmind/server/user/c$a;->b:I

    invoke-virtual {v2, v1, v3}, Lcom/xinzhu/overmind/server/pm/i;->installPackageAsExist(Ljava/lang/String;I)Lcom/xinzhu/overmind/entity/pm/InstallResult;

    goto :goto_0

    :cond_1
    return-void
.end method
