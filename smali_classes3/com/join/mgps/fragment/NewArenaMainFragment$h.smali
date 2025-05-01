.class Lcom/join/mgps/fragment/NewArenaMainFragment$h;
.super Ljava/lang/Object;
.source "NewArenaMainFragment.java"

# interfaces
.implements Lcom/join/mgps/customview/input/InputNumView$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/NewArenaMainFragment;->O0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/customview/input/a;

.field final synthetic b:Lcom/join/mgps/fragment/NewArenaMainFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/NewArenaMainFragment;Lcom/join/mgps/customview/input/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/NewArenaMainFragment$h;->b:Lcom/join/mgps/fragment/NewArenaMainFragment;

    iput-object p2, p0, Lcom/join/mgps/fragment/NewArenaMainFragment$h;->a:Lcom/join/mgps/customview/input/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment$h;->a:Lcom/join/mgps/customview/input/a;

    invoke-virtual {v0}, Lcom/join/mgps/customview/input/a;->c()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment$h;->b:Lcom/join/mgps/fragment/NewArenaMainFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/NewArenaMainFragment;->V(Lcom/join/mgps/fragment/NewArenaMainFragment;)Lcom/join/mgps/socket/fight/arena/b;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment$h;->b:Lcom/join/mgps/fragment/NewArenaMainFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/NewArenaMainFragment;->V(Lcom/join/mgps/fragment/NewArenaMainFragment;)Lcom/join/mgps/socket/fight/arena/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/NewArenaMainFragment$h;->b:Lcom/join/mgps/fragment/NewArenaMainFragment;

    invoke-static {v1}, Lcom/join/mgps/fragment/NewArenaMainFragment;->W(Lcom/join/mgps/fragment/NewArenaMainFragment;)Lapp/mgsim/arena/SocketListener$NotifyObserver;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/socket/fight/arena/ArenaService;->z(Lapp/mgsim/arena/SocketListener$NotifyObserver;)V

    .line 4
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment$h;->b:Lcom/join/mgps/fragment/NewArenaMainFragment;

    invoke-static {v0, p1}, Lcom/join/mgps/fragment/NewArenaMainFragment;->d0(Lcom/join/mgps/fragment/NewArenaMainFragment;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    iget-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment$h;->b:Lcom/join/mgps/fragment/NewArenaMainFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/NewArenaMainFragment;->e0(Lcom/join/mgps/fragment/NewArenaMainFragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 7
    iget-object p1, p0, Lcom/join/mgps/fragment/NewArenaMainFragment$h;->b:Lcom/join/mgps/fragment/NewArenaMainFragment;

    const-string/jumbo v0, "\u5f53\u524d\u7f51\u7edc\u4e0d\u53ef\u7528\uff0c\u8bf7\u68c0\u67e5\u7f51\u7edc!"

    invoke-virtual {p1, v0}, Lcom/join/mgps/fragment/NewArenaMainFragment;->showToast(Ljava/lang/String;)V

    goto :goto_0

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment$h;->b:Lcom/join/mgps/fragment/NewArenaMainFragment;

    const-string/jumbo v1, "\u6b63\u5728\u83b7\u53d6\u623f\u95f4..."

    invoke-static {v0, v1}, Lcom/join/mgps/fragment/NewArenaMainFragment;->f0(Lcom/join/mgps/fragment/NewArenaMainFragment;Ljava/lang/String;)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment$h;->b:Lcom/join/mgps/fragment/NewArenaMainFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/NewArenaMainFragment;->V(Lcom/join/mgps/fragment/NewArenaMainFragment;)Lcom/join/mgps/socket/fight/arena/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/b;->d()Lcom/join/mgps/socket/fight/arena/ArenaService_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/socket/fight/arena/ArenaService;->s()Z

    move-result v0

    if-nez v0, :cond_3

    .line 10
    iget-object p1, p0, Lcom/join/mgps/fragment/NewArenaMainFragment$h;->b:Lcom/join/mgps/fragment/NewArenaMainFragment;

    invoke-static {p1}, Lcom/join/mgps/fragment/NewArenaMainFragment;->V(Lcom/join/mgps/fragment/NewArenaMainFragment;)Lcom/join/mgps/socket/fight/arena/b;

    move-result-object p1

    const-string v0, "register_type_NewArenaMainFragment"

    invoke-static {v0}, Lapp/mgsim/arena/ArenaRequestFactory;->login(Ljava/lang/String;)Lapp/mgsim/arena/ArenaRequest;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/socket/fight/arena/b;->f(Lapp/mgsim/arena/ArenaRequest;)V

    goto :goto_0

    .line 11
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment$h;->b:Lcom/join/mgps/fragment/NewArenaMainFragment;

    invoke-virtual {v0, p1}, Lcom/join/mgps/fragment/NewArenaMainFragment;->s0(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public hide()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment$h;->a:Lcom/join/mgps/customview/input/a;

    invoke-virtual {v0}, Lcom/join/mgps/customview/input/a;->c()V

    return-void
.end method
