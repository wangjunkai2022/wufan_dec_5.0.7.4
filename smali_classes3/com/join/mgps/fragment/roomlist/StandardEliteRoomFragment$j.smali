.class Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$j;
.super Ljava/lang/Object;
.source "StandardEliteRoomFragment.java"

# interfaces
.implements Lcom/join/mgps/customview/input/InputNumView$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->Q0(Lcom/papa91/battle/protocol/SimpleRoom;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/customview/input/a;

.field final synthetic b:Lcom/papa91/battle/protocol/SimpleRoom;

.field final synthetic c:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;Lcom/join/mgps/customview/input/a;Lcom/papa91/battle/protocol/SimpleRoom;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$j;->c:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;

    iput-object p2, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$j;->a:Lcom/join/mgps/customview/input/a;

    iput-object p3, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$j;->b:Lcom/papa91/battle/protocol/SimpleRoom;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$j;->a:Lcom/join/mgps/customview/input/a;

    invoke-virtual {v0}, Lcom/join/mgps/customview/input/a;->c()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$j;->c:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;

    iget-object v0, v0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->j:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    iget-object v1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$j;->b:Lcom/papa91/battle/protocol/SimpleRoom;

    invoke-virtual {v1}, Lcom/papa91/battle/protocol/SimpleRoom;->getRoomId()I

    move-result v1

    iget-object v2, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$j;->c:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;

    invoke-static {v2}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->c0(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;)Z

    move-result v2

    invoke-virtual {v0, v1, p1, v2}, Lcom/join/mgps/activity/arena/GameRoomListActivity;->C2(ILjava/lang/String;Z)V

    return-void
.end method

.method public hide()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$j;->a:Lcom/join/mgps/customview/input/a;

    invoke-virtual {v0}, Lcom/join/mgps/customview/input/a;->c()V

    return-void
.end method
