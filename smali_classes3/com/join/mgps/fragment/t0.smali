.class public final synthetic Lcom/join/mgps/fragment/t0;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/join/mgps/fragment/FriendMessageFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/fragment/FriendMessageFragment;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/fragment/t0;->b:Lcom/join/mgps/fragment/FriendMessageFragment;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/join/mgps/fragment/t0;->b:Lcom/join/mgps/fragment/FriendMessageFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/FriendMessageFragment;->V(Lcom/join/mgps/fragment/FriendMessageFragment;)V

    return-void
.end method
