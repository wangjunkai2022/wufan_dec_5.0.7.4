.class Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$g;
.super Ljava/lang/Object;
.source "StandardEliteRoomFragment.java"

# interfaces
.implements Lcom/join/android/app/component/xrecyclerview/XRecyclerView$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->afterViews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$g;->b:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadMore()V
    .locals 0

    return-void
.end method

.method public onRefresh()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$g;->b:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;

    iget-object v0, v0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->j:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$g;->b:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;

    const-string/jumbo v1, "\u5f53\u524d\u7f51\u7edc\u4e0d\u53ef\u7528!"

    invoke-virtual {v0, v1}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->showToast(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$g;->b:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;

    iget-object v0, v0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->h:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {v0}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->stopRefresh()V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$g;->b:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;

    iget-object v1, v0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->j:Lcom/join/mgps/activity/arena/GameRoomListActivity_;

    invoke-static {v0}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->c0(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;)Z

    move-result v0

    invoke-virtual {v1, v0}, Lcom/join/mgps/activity/arena/GameRoomListActivity;->K2(Z)Z

    :goto_0
    return-void
.end method
