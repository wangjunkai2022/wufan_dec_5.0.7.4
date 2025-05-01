.class Lcom/join/mgps/activity/arena/ArenaGameListActivity$b;
.super Ljava/lang/Object;
.source "ArenaGameListActivity.java"

# interfaces
.implements Lcom/join/mgps/customview/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/arena/ArenaGameListActivity;->afterViews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/arena/ArenaGameListActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/arena/ArenaGameListActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity$b;->b:Lcom/join/mgps/activity/arena/ArenaGameListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadMore()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity$b;->b:Lcom/join/mgps/activity/arena/ArenaGameListActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->g0(Lcom/join/mgps/activity/arena/ArenaGameListActivity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity$b;->b:Lcom/join/mgps/activity/arena/ArenaGameListActivity;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity$b;->b:Lcom/join/mgps/activity/arena/ArenaGameListActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->f:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView2;->u()V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity$b;->b:Lcom/join/mgps/activity/arena/ArenaGameListActivity;

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity$b;->b:Lcom/join/mgps/activity/arena/ArenaGameListActivity;

    const v2, 0x7f100299

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity$b;->b:Lcom/join/mgps/activity/arena/ArenaGameListActivity;

    invoke-virtual {v0}, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->o0()V

    :cond_1
    return-void
.end method
