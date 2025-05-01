.class Lcom/join/mgps/activity/MiniGameLoadingActivity$d;
.super Ljava/lang/Object;
.source "MiniGameLoadingActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/MiniGameLoadingActivity;->A0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/MiniGameLoadingActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/MiniGameLoadingActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$d;->b:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public declared-synchronized run()V
    .locals 6

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$d;->b:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->t:Ljava/util/List;

    const-string v1, "copyExtFile"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2
    sget-object v0, Lcom/join/mgps/va/overmind/f;->a:Lcom/join/mgps/va/overmind/f;

    iget-object v1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$d;->b:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    iget-object v1, v1, Lcom/join/mgps/activity/MiniGameLoadingActivity;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/va/overmind/f;->M(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 3
    iget-object v2, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$d;->b:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    invoke-static {v1}, Lcom/papa91/arc/util/FileUtils;->fileSize(Ljava/lang/String;)J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->s0(Lcom/join/mgps/activity/MiniGameLoadingActivity;J)J

    .line 4
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "modPath"

    .line 5
    iget-object v3, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$d;->b:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    iget-object v3, v3, Lcom/join/mgps/activity/MiniGameLoadingActivity;->m:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "gameId"

    .line 6
    iget-object v3, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$d;->b:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    iget-object v3, v3, Lcom/join/mgps/activity/MiniGameLoadingActivity;->c:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "obbSize"

    .line 7
    iget-object v3, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$d;->b:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    invoke-static {v3}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->r0(Lcom/join/mgps/activity/MiniGameLoadingActivity;)J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 8
    iget-object v2, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$d;->b:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    iget-object v3, v2, Lcom/join/mgps/activity/MiniGameLoadingActivity;->l:Ljava/lang/String;

    iget v2, v2, Lcom/join/mgps/activity/MiniGameLoadingActivity;->q:I

    invoke-static {v3, v2, v1}, Lcom/join/mgps/va/overmind/h;->a(Ljava/lang/String;ILandroid/os/Bundle;)V

    .line 9
    iget-object v1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$d;->b:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    invoke-static {v1}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->r0(Lcom/join/mgps/activity/MiniGameLoadingActivity;)J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$d;->b:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->u:Ljava/util/List;

    const-string v1, "copyExtFile"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.join.android.app.mgsim.wufun.soCopyFinish"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    monitor-exit p0

    return-void

    .line 13
    :cond_0
    :try_start_1
    iget-object v1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$d;->b:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    iget-object v1, v1, Lcom/join/mgps/activity/MiniGameLoadingActivity;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/va/overmind/f;->O(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 14
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/join/mgps/va/overmind/d;->h(Ljava/lang/String;)J

    move-result-wide v0

    .line 15
    iget-object v2, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$d;->b:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    invoke-static {v2}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->t0(Lcom/join/mgps/activity/MiniGameLoadingActivity;)V

    .line 16
    iget-object v2, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$d;->b:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    invoke-static {v2}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->r0(Lcom/join/mgps/activity/MiniGameLoadingActivity;)J

    move-result-wide v2

    cmp-long v4, v2, v0

    if-eqz v4, :cond_1

    .line 17
    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$d;->b:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    new-instance v1, Lcom/join/mgps/activity/MiniGameLoadingActivity$d$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/MiniGameLoadingActivity$d$a;-><init>(Lcom/join/mgps/activity/MiniGameLoadingActivity$d;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 18
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$d;->b:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/MiniGameLoadingActivity;->u:Ljava/util/List;

    const-string v1, "copyExtFile"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 19
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.join.android.app.mgsim.wufun.soCopyFinish"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
