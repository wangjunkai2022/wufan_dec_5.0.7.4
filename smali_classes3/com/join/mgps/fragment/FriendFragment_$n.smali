.class Lcom/join/mgps/fragment/FriendFragment_$n;
.super Ljava/lang/Object;
.source "FriendFragment_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/FriendFragment_;->g1(Lcom/wufan/friend/chat/protocol/x;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/wufan/friend/chat/protocol/x;

.field final synthetic c:Lcom/join/mgps/fragment/FriendFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/FriendFragment_;Lcom/wufan/friend/chat/protocol/x;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/FriendFragment_$n;->c:Lcom/join/mgps/fragment/FriendFragment_;

    iput-object p2, p0, Lcom/join/mgps/fragment/FriendFragment_$n;->b:Lcom/wufan/friend/chat/protocol/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendFragment_$n;->c:Lcom/join/mgps/fragment/FriendFragment_;

    iget-object v1, p0, Lcom/join/mgps/fragment/FriendFragment_$n;->b:Lcom/wufan/friend/chat/protocol/x;

    invoke-static {v0, v1}, Lcom/join/mgps/fragment/FriendFragment_;->o1(Lcom/join/mgps/fragment/FriendFragment_;Lcom/wufan/friend/chat/protocol/x;)V

    return-void
.end method
