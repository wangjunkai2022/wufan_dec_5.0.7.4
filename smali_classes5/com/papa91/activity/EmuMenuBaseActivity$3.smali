.class Lcom/papa91/activity/EmuMenuBaseActivity$3;
.super Ljava/lang/Object;
.source "EmuMenuBaseActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/papa91/activity/EmuMenuBaseActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/papa91/activity/EmuMenuBaseActivity;


# direct methods
.method constructor <init>(Lcom/papa91/activity/EmuMenuBaseActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa91/activity/EmuMenuBaseActivity$3;->this$0:Lcom/papa91/activity/EmuMenuBaseActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1
    :try_start_0
    invoke-static {}, Lcom/papa91/activity/EmuBaseActivity;->getGameTime()I

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/papa91/activity/EmuMenuBaseActivity$3;->this$0:Lcom/papa91/activity/EmuMenuBaseActivity;

    invoke-static {v1}, Lcom/papa91/activity/EmuMenuBaseActivity;->access$100(Lcom/papa91/activity/EmuMenuBaseActivity;)I

    move-result v1

    sub-int v1, v0, v1

    if-lez v1, :cond_0

    .line 3
    iget-object v2, p0, Lcom/papa91/activity/EmuMenuBaseActivity$3;->this$0:Lcom/papa91/activity/EmuMenuBaseActivity;

    invoke-static {v2, v0}, Lcom/papa91/activity/EmuMenuBaseActivity;->access$102(Lcom/papa91/activity/EmuMenuBaseActivity;I)I

    .line 4
    new-instance v0, Landroid/content/Intent;

    const-string v2, "com.join.android.app.mgsim.wufun.broadcast.emu.gamePlayTimes"

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "gameId"

    .line 5
    sget-object v3, Lcom/papa91/activity/EmuBaseActivity;->GameID:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "liveTime"

    int-to-long v3, v1

    const-wide/16 v5, 0x3e8

    .line 6
    div-long/2addr v3, v5

    invoke-virtual {v0, v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 7
    iget-object v1, p0, Lcom/papa91/activity/EmuMenuBaseActivity$3;->this$0:Lcom/papa91/activity/EmuMenuBaseActivity;

    invoke-virtual {v1, v0}, Landroid/app/Activity;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 9
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/papa91/activity/EmuMenuBaseActivity$3;->this$0:Lcom/papa91/activity/EmuMenuBaseActivity;

    iget-object v1, v0, Lcom/papa91/activity/EmuBaseActivity;->handler:Landroid/os/Handler;

    if-nez v1, :cond_1

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    iput-object v1, v0, Lcom/papa91/activity/EmuBaseActivity;->handler:Landroid/os/Handler;

    .line 10
    :cond_1
    iget-object v0, p0, Lcom/papa91/activity/EmuMenuBaseActivity$3;->this$0:Lcom/papa91/activity/EmuMenuBaseActivity;

    iget-object v0, v0, Lcom/papa91/activity/EmuBaseActivity;->handler:Landroid/os/Handler;

    const-wide/32 v1, 0xea60

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
