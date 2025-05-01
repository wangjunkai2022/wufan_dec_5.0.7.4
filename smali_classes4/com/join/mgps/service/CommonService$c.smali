.class Lcom/join/mgps/service/CommonService$c;
.super Ljava/lang/Object;
.source "CommonService.java"

# interfaces
.implements Lcom/join/mgps/socket/fight/arena/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/service/CommonService;->r()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/service/CommonService;


# direct methods
.method constructor <init>(Lcom/join/mgps/service/CommonService;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/service/CommonService$c;->a:Lcom/join/mgps/service/CommonService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/service/CommonService$c;->a:Lcom/join/mgps/service/CommonService;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/join/mgps/service/CommonService;->m(Lcom/join/mgps/service/CommonService;Z)Z

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/service/CommonService$c;->a:Lcom/join/mgps/service/CommonService;

    invoke-static {v0}, Lcom/join/mgps/service/CommonService;->o(Lcom/join/mgps/service/CommonService;)Lcom/join/mgps/socket/fight/arena/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/service/CommonService$c;->a:Lcom/join/mgps/service/CommonService;

    invoke-static {v1}, Lcom/join/mgps/service/CommonService;->n(Lcom/join/mgps/service/CommonService;)Lapp/mgsim/arena/SocketListener$NotifyObserver;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/socket/fight/arena/ArenaService;->A(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 3
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public b(Z)V
    .locals 0

    return-void
.end method

.method public c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/service/CommonService$c;->a:Lcom/join/mgps/service/CommonService;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/join/mgps/service/CommonService;->m(Lcom/join/mgps/service/CommonService;Z)Z

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/service/CommonService$c;->a:Lcom/join/mgps/service/CommonService;

    invoke-static {v0}, Lcom/join/mgps/service/CommonService;->o(Lcom/join/mgps/service/CommonService;)Lcom/join/mgps/socket/fight/arena/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/service/CommonService$c;->a:Lcom/join/mgps/service/CommonService;

    invoke-static {v1}, Lcom/join/mgps/service/CommonService;->n(Lcom/join/mgps/service/CommonService;)Lapp/mgsim/arena/SocketListener$NotifyObserver;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/socket/fight/arena/ArenaService;->z(Lapp/mgsim/arena/SocketListener$NotifyObserver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 3
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method
