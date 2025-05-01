.class Lcom/join/mgps/activity/arena/GameRoomListActivity_$n;
.super Ljava/lang/Object;
.source "GameRoomListActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/arena/GameRoomListActivity_;->Z1(ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Z

.field final synthetic c:Z

.field final synthetic d:Lcom/join/mgps/activity/arena/GameRoomListActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/arena/GameRoomListActivity_;ZZ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/arena/GameRoomListActivity_$n;->d:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    iput-boolean p2, p0, Lcom/join/mgps/activity/arena/GameRoomListActivity_$n;->b:Z

    iput-boolean p3, p0, Lcom/join/mgps/activity/arena/GameRoomListActivity_$n;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/arena/GameRoomListActivity_$n;->d:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    iget-boolean v1, p0, Lcom/join/mgps/activity/arena/GameRoomListActivity_$n;->b:Z

    iget-boolean v2, p0, Lcom/join/mgps/activity/arena/GameRoomListActivity_$n;->c:Z

    invoke-static {v0, v1, v2}, Lcom/join/mgps/activity/arena/GameRoomListActivity_;->u3(Lcom/join/mgps/activity/arena/GameRoomListActivity_;ZZ)V

    return-void
.end method
