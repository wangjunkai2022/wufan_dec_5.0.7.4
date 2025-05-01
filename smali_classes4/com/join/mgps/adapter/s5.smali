.class public final synthetic Lcom/join/mgps/adapter/s5;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;

.field public final synthetic c:Lcom/join/mgps/dto/FriendBackGameRspBean$FriendInfo;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;Lcom/join/mgps/dto/FriendBackGameRspBean$FriendInfo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/adapter/s5;->b:Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;

    iput-object p2, p0, Lcom/join/mgps/adapter/s5;->c:Lcom/join/mgps/dto/FriendBackGameRspBean$FriendInfo;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/join/mgps/adapter/s5;->b:Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;

    iget-object v1, p0, Lcom/join/mgps/adapter/s5;->c:Lcom/join/mgps/dto/FriendBackGameRspBean$FriendInfo;

    invoke-static {v0, v1, p1}, Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;->k(Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;Lcom/join/mgps/dto/FriendBackGameRspBean$FriendInfo;Landroid/view/View;)V

    return-void
.end method
