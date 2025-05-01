.class Lcom/join/mgps/fragment/FriendAddFragment_$e;
.super Ljava/lang/Object;
.source "FriendAddFragment_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/FriendAddFragment_;->g0(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/join/mgps/fragment/FriendAddFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/FriendAddFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/FriendAddFragment_$e;->c:Lcom/join/mgps/fragment/FriendAddFragment_;

    iput-object p2, p0, Lcom/join/mgps/fragment/FriendAddFragment_$e;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendAddFragment_$e;->c:Lcom/join/mgps/fragment/FriendAddFragment_;

    iget-object v1, p0, Lcom/join/mgps/fragment/FriendAddFragment_$e;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/join/mgps/fragment/FriendAddFragment_;->j0(Lcom/join/mgps/fragment/FriendAddFragment_;Ljava/lang/String;)V

    return-void
.end method
