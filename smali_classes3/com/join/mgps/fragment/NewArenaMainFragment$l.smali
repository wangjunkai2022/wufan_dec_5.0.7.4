.class Lcom/join/mgps/fragment/NewArenaMainFragment$l;
.super Lcom/join/mgps/socket/fight/arena/a$b0;
.source "NewArenaMainFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/NewArenaMainFragment;->onAttach(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/NewArenaMainFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/NewArenaMainFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/NewArenaMainFragment$l;->b:Lcom/join/mgps/fragment/NewArenaMainFragment;

    invoke-direct {p0}, Lcom/join/mgps/socket/fight/arena/a$b0;-><init>()V

    return-void
.end method


# virtual methods
.method public W(IILjava/lang/Object;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/socket/fight/arena/a$b0;->W(IILjava/lang/Object;)V

    const/16 p3, 0x65

    if-ne p1, p3, :cond_2

    const/4 p1, 0x7

    if-eq p2, p1, :cond_1

    const/16 p1, 0x8

    if-eq p2, p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/NewArenaMainFragment$l;->b:Lcom/join/mgps/fragment/NewArenaMainFragment;

    invoke-static {p1}, Lcom/join/mgps/fragment/NewArenaMainFragment;->h0(Lcom/join/mgps/fragment/NewArenaMainFragment;)V

    goto :goto_0

    .line 3
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/fragment/NewArenaMainFragment$l;->b:Lcom/join/mgps/fragment/NewArenaMainFragment;

    invoke-static {p1}, Lcom/join/mgps/fragment/NewArenaMainFragment;->g0(Lcom/join/mgps/fragment/NewArenaMainFragment;)Lcom/papa91/battle/protocol/GameRoom;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/join/mgps/fragment/NewArenaMainFragment;->P0(Lcom/papa91/battle/protocol/GameRoom;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public q()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/join/mgps/socket/fight/arena/a$b0;->q()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment$l;->b:Lcom/join/mgps/fragment/NewArenaMainFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/NewArenaMainFragment;->e0(Lcom/join/mgps/fragment/NewArenaMainFragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void
.end method
