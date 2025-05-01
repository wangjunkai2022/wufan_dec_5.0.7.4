.class public final synthetic Lcom/join/mgps/fragment/g0;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/join/mgps/fragment/FriendCardFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/fragment/FriendCardFragment;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/fragment/g0;->b:Lcom/join/mgps/fragment/FriendCardFragment;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/join/mgps/fragment/g0;->b:Lcom/join/mgps/fragment/FriendCardFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/FriendCardFragment;->a0(Lcom/join/mgps/fragment/FriendCardFragment;)V

    return-void
.end method
