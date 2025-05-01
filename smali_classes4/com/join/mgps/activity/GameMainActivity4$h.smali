.class Lcom/join/mgps/activity/GameMainActivity4$h;
.super Lcom/join/mgps/socket/fight/arena/b$c;
.source "GameMainActivity4.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/GameMainActivity4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/GameMainActivity4;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GameMainActivity4;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GameMainActivity4$h;->a:Lcom/join/mgps/activity/GameMainActivity4;

    invoke-direct {p0}, Lcom/join/mgps/socket/fight/arena/b$c;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/socket/fight/arena/b$c;->a()V

    return-void
.end method

.method public c()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/join/mgps/socket/fight/arena/b$c;->c()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4$h;->a:Lcom/join/mgps/activity/GameMainActivity4;

    invoke-static {v0}, Lcom/join/mgps/activity/GameMainActivity4;->g1(Lcom/join/mgps/activity/GameMainActivity4;)Lcom/join/mgps/socket/fight/arena/b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4$h;->a:Lcom/join/mgps/activity/GameMainActivity4;

    invoke-static {v0}, Lcom/join/mgps/activity/GameMainActivity4;->g1(Lcom/join/mgps/activity/GameMainActivity4;)Lcom/join/mgps/socket/fight/arena/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4$h;->a:Lcom/join/mgps/activity/GameMainActivity4;

    invoke-static {v0}, Lcom/join/mgps/activity/GameMainActivity4;->g1(Lcom/join/mgps/activity/GameMainActivity4;)Lcom/join/mgps/socket/fight/arena/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4$h;->a:Lcom/join/mgps/activity/GameMainActivity4;

    invoke-static {v1}, Lcom/join/mgps/activity/GameMainActivity4;->h1(Lcom/join/mgps/activity/GameMainActivity4;)Lapp/mgsim/arena/SocketListener$NotifyObserver;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/socket/fight/arena/ArenaService;->z(Lapp/mgsim/arena/SocketListener$NotifyObserver;)V

    :cond_0
    return-void
.end method
