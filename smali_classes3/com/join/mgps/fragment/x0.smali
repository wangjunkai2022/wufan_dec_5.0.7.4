.class public final synthetic Lcom/join/mgps/fragment/x0;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/join/mgps/fragment/FriendMsgRequestFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/fragment/FriendMsgRequestFragment;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/fragment/x0;->b:Lcom/join/mgps/fragment/FriendMsgRequestFragment;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/join/mgps/fragment/x0;->b:Lcom/join/mgps/fragment/FriendMsgRequestFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->W(Lcom/join/mgps/fragment/FriendMsgRequestFragment;)V

    return-void
.end method
