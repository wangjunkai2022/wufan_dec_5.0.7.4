.class public Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver;
.super Landroid/content/BroadcastReceiver;
.source "EmuBaseActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/papa91/activity/EmuBaseActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "AdResultReceiver"
.end annotation


# instance fields
.field private hasReward:Z

.field final synthetic this$0:Lcom/papa91/activity/EmuBaseActivity;


# direct methods
.method public constructor <init>(Lcom/papa91/activity/EmuBaseActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver;->this$0:Lcom/papa91/activity/EmuBaseActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 26

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    const-string v3, "adAction"

    const/4 v4, 0x1

    .line 1
    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    .line 2
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "adAction\uff1a"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/4 v5, 0x7

    if-ne v3, v5, :cond_0

    .line 3
    new-instance v0, Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver$1;

    invoke-direct {v0, v1}, Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver$1;-><init>(Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver;)V

    invoke-static {v0}, Lcom/papa91/activity/EmuBaseActivity;->runOnUiThread1(Ljava/lang/Runnable;)V

    .line 4
    :try_start_0
    invoke-static {v4}, Lcom/papa91/activity/EmuBaseActivity;->setAdResult(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    goto/16 :goto_2

    :cond_0
    const/16 v5, 0x8

    if-ne v3, v5, :cond_1

    goto/16 :goto_2

    :cond_1
    const/4 v6, 0x6

    if-ne v3, v6, :cond_2

    .line 5
    iput-boolean v4, v1, Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver;->hasReward:Z

    goto/16 :goto_2

    :cond_2
    const-string v6, ""

    const/4 v7, 0x0

    if-ne v3, v4, :cond_3

    .line 6
    iput-boolean v7, v1, Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver;->hasReward:Z

    .line 7
    iget-object v0, v1, Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver;->this$0:Lcom/papa91/activity/EmuBaseActivity;

    const-string v2, "expGameVSAdVideo"

    invoke-virtual {v0, v2, v6}, Lcom/papa91/activity/EmuBaseActivity;->senCommonEvent(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_3
    const/4 v8, 0x3

    if-ne v3, v8, :cond_4

    .line 8
    new-instance v0, Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver$2;

    invoke-direct {v0, v1}, Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver$2;-><init>(Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver;)V

    invoke-static {v0}, Lcom/papa91/activity/EmuBaseActivity;->runOnUiThread1(Ljava/lang/Runnable;)V

    .line 9
    :try_start_1
    invoke-static {v4}, Lcom/papa91/activity/EmuBaseActivity;->setAdResult(I)V

    .line 10
    sget v0, Lcom/papa91/activity/EmuBaseActivity;->startMode:I

    const/16 v2, 0x10

    if-ne v0, v2, :cond_14

    .line 11
    iget-object v0, v1, Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver;->this$0:Lcom/papa91/activity/EmuBaseActivity;

    sget v2, Lcom/papa91/activity/EmuBaseActivity;->scenario:I

    invoke-virtual {v0, v2, v4}, Lcom/papa91/activity/EmuBaseActivity;->getVideoAward(IZ)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    goto/16 :goto_2

    :cond_4
    const/16 v8, 0x62

    const-string v9, "gameId"

    const-string v10, "adSdkType"

    const-string v11, "howTimes"

    const-string v12, "adCount"

    if-ne v3, v8, :cond_6

    .line 12
    new-instance v0, Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver$3;

    invoke-direct {v0, v1}, Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver$3;-><init>(Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver;)V

    invoke-static {v0}, Lcom/papa91/activity/EmuBaseActivity;->runOnUiThread1(Ljava/lang/Runnable;)V

    const-string v0, "url"

    .line 13
    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "time"

    .line 14
    invoke-virtual {v2, v3, v7}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    const-string v5, "V_switch"

    .line 15
    invoke-virtual {v2, v5, v7}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5

    if-nez v5, :cond_5

    .line 16
    invoke-virtual {v2, v11, v7}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 17
    invoke-virtual {v2, v12, v7}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    .line 18
    invoke-virtual {v2, v10, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v4

    .line 19
    invoke-virtual {v2, v9}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 20
    new-instance v5, Landroid/content/Intent;

    const-string v6, "com.tools.AdBroadcast"

    invoke-direct {v5, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v6, "action"

    .line 21
    invoke-virtual {v5, v6, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 22
    invoke-virtual {v5, v11, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 23
    invoke-virtual {v5, v10, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 24
    invoke-virtual {v5, v12, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 25
    invoke-virtual {v5, v9, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 26
    invoke-static {v5}, Lcom/papa91/activity/EmuBaseActivity;->send(Landroid/content/Intent;)V

    goto/16 :goto_2

    .line 27
    :cond_5
    iget-object v2, v1, Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver;->this$0:Lcom/papa91/activity/EmuBaseActivity;

    invoke-static {v2, v0, v3}, Lcom/papa91/activity/EmuBaseActivity;->access$200(Lcom/papa91/activity/EmuBaseActivity;Ljava/lang/String;I)V

    goto/16 :goto_2

    :cond_6
    const/16 v8, 0x63

    const-string v13, "times"

    if-ne v3, v8, :cond_7

    const-string v0, "content"

    .line 28
    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    const-string v0, "dialogUrl"

    .line 29
    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    const-string v0, "pic"

    .line 30
    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    const-string v0, "ad_id"

    .line 31
    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    const-string v0, "btn_l"

    .line 32
    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    const-string v0, "btn_r"

    .line 33
    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    const-string v0, "btn_url"

    .line 34
    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v21

    .line 35
    invoke-virtual {v2, v13, v7}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v22

    .line 36
    invoke-virtual {v2, v12, v7}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v25

    .line 37
    invoke-virtual {v2, v11, v7}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v23

    .line 38
    invoke-virtual {v2, v10, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v24

    .line 39
    iget-object v0, v1, Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver;->this$0:Lcom/papa91/activity/EmuBaseActivity;

    invoke-static {v0, v7}, Lcom/papa91/activity/EmuBaseActivity;->access$302(Lcom/papa91/activity/EmuBaseActivity;Z)Z

    .line 40
    iget-object v14, v1, Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver;->this$0:Lcom/papa91/activity/EmuBaseActivity;

    invoke-static/range {v14 .. v25}, Lcom/papa91/activity/EmuBaseActivity;->access$400(Lcom/papa91/activity/EmuBaseActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIII)V

    goto/16 :goto_2

    :cond_7
    const/16 v8, 0xd

    if-ne v3, v8, :cond_8

    goto/16 :goto_2

    :cond_8
    const/16 v8, 0x11

    if-ne v3, v8, :cond_f

    .line 41
    invoke-virtual {v2, v9}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 42
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_e

    sget-object v3, Lcom/papa91/activity/EmuBaseActivity;->GameID:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_e

    sget-object v3, Lcom/papa91/activity/EmuBaseActivity;->GameID:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_1

    :cond_9
    const-string v0, "result"

    .line 43
    invoke-virtual {v2, v0, v7}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    const-string v3, "amount"

    .line 44
    invoke-virtual {v2, v3, v7}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    .line 45
    invoke-virtual {v2, v13, v7}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v8

    const-string v9, "total_reward_amount"

    .line 46
    invoke-virtual {v2, v9, v7}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    if-nez v0, :cond_c

    .line 47
    sget v9, Lcom/papa91/activity/EmuBaseActivity;->received_times:I

    add-int/2addr v9, v4

    sput v9, Lcom/papa91/activity/EmuBaseActivity;->received_times:I

    .line 48
    sget v9, Lcom/papa91/activity/EmuBaseActivity;->reward_left_count:I

    sub-int/2addr v9, v4

    sput v9, Lcom/papa91/activity/EmuBaseActivity;->reward_left_count:I

    .line 49
    sput v7, Lcom/papa91/activity/EmuBaseActivity;->reward_amount:I

    .line 50
    sput v7, Lcom/papa91/activity/EmuBaseActivity;->reward_times:I

    .line 51
    sput-object v6, Lcom/papa91/activity/EmuBaseActivity;->unique_id:Ljava/lang/String;

    .line 52
    sget v6, Lcom/papa91/activity/EmuBaseActivity;->total_reward_amount:I

    add-int/2addr v6, v3

    sput v6, Lcom/papa91/activity/EmuBaseActivity;->total_reward_amount:I

    .line 53
    sget-object v6, Lcom/papa91/activity/EmuBaseActivity;->progressView:Lcom/papa91/view/DragProgressView;

    if-eqz v6, :cond_c

    .line 54
    invoke-virtual {v6}, Lcom/papa91/view/DragProgressView;->getSignal()I

    move-result v9

    sub-int/2addr v9, v4

    invoke-virtual {v6, v9}, Lcom/papa91/view/DragProgressView;->setSignal(I)V

    .line 55
    sget v6, Lcom/papa91/activity/EmuBaseActivity;->left_play_reward_count:I

    sget v9, Lcom/papa91/activity/EmuBaseActivity;->received_times:I

    sub-int/2addr v6, v9

    if-ge v6, v4, :cond_a

    .line 56
    sget-object v6, Lcom/papa91/activity/EmuBaseActivity;->progressView:Lcom/papa91/view/DragProgressView;

    invoke-virtual {v6, v5}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 57
    :cond_a
    sget v5, Lcom/papa91/activity/EmuBaseActivity;->reward_left_count:I

    if-ge v5, v4, :cond_b

    sget-object v5, Lcom/papa91/activity/EmuBaseActivity;->progressView:Lcom/papa91/view/DragProgressView;

    invoke-virtual {v5}, Lcom/papa91/view/DragProgressView;->getSignal()I

    move-result v5

    if-ge v5, v4, :cond_b

    .line 58
    sget-object v0, Lcom/papa91/activity/EmuBaseActivity;->progressView:Lcom/papa91/view/DragProgressView;

    invoke-virtual {v0}, Lcom/papa91/view/DragProgressView;->stop()V

    return-void

    .line 59
    :cond_b
    sget-object v5, Lcom/papa91/activity/EmuBaseActivity;->progressView:Lcom/papa91/view/DragProgressView;

    sget v6, Lcom/papa91/activity/EmuBaseActivity;->reward_left_count:I

    invoke-virtual {v5, v6}, Lcom/papa91/view/DragProgressView;->setSignalMax(I)V

    .line 60
    sget-object v5, Lcom/papa91/activity/EmuBaseActivity;->progressView:Lcom/papa91/view/DragProgressView;

    invoke-virtual {v5}, Lcom/papa91/view/DragProgressView;->resume()V

    .line 61
    :cond_c
    :try_start_2
    iget-object v5, v1, Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver;->this$0:Lcom/papa91/activity/EmuBaseActivity;

    if-nez v0, :cond_d

    goto :goto_0

    :cond_d
    const/4 v4, 0x0

    :goto_0
    invoke-virtual {v5, v4, v3, v8, v2}, Lcom/papa91/activity/EmuBaseActivity;->setRewardResult1(IIII)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 62
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_2

    :cond_e
    :goto_1
    return-void

    :cond_f
    const/16 v5, 0x64

    if-ne v3, v5, :cond_11

    const-string v0, "exit"

    .line 63
    invoke-virtual {v2, v0, v7}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 64
    iget-object v2, v1, Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver;->this$0:Lcom/papa91/activity/EmuBaseActivity;

    invoke-virtual {v2}, Lcom/papa91/activity/EmuBaseActivity;->onHandleEmuExit()V

    .line 65
    invoke-static {v0}, Lcom/papa91/activity/EmuBaseActivity;->exitDlgBack(I)V

    const/4 v2, 0x2

    if-ne v0, v4, :cond_10

    .line 66
    invoke-static {v2}, Lcom/papa91/activity/EmuBaseActivity;->sendGamePlay(I)V

    .line 67
    iget-object v0, v1, Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver;->this$0:Lcom/papa91/activity/EmuBaseActivity;

    invoke-static {v0, v4}, Lcom/papa91/activity/EmuBaseActivity;->access$502(Lcom/papa91/activity/EmuBaseActivity;Z)Z

    goto :goto_2

    :cond_10
    if-ne v0, v2, :cond_14

    .line 68
    invoke-static {v2}, Lcom/papa91/activity/EmuBaseActivity;->sendGamePlay(I)V

    .line 69
    invoke-static {v7}, Ljava/lang/System;->exit(I)V

    .line 70
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    goto :goto_2

    :cond_11
    const/4 v5, 0x5

    if-ne v3, v5, :cond_12

    .line 71
    iget-object v3, v1, Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver;->this$0:Lcom/papa91/activity/EmuBaseActivity;

    invoke-static {v3, v4}, Lcom/papa91/activity/EmuBaseActivity;->access$302(Lcom/papa91/activity/EmuBaseActivity;Z)Z

    .line 72
    :try_start_3
    invoke-static {}, Lcom/papa91/activity/EmuBaseActivity;->access$600()Lcom/papa91/activity/EmuBaseActivity;

    move-result-object v3

    new-instance v4, Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver$4;

    invoke-direct {v4, v1}, Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver$4;-><init>(Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver;)V

    invoke-virtual {v3, v4}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 73
    :catch_1
    iget-object v3, v1, Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver;->this$0:Lcom/papa91/activity/EmuBaseActivity;

    invoke-virtual {v3, v0, v2}, Lcom/papa91/activity/EmuBaseActivity;->handleAdError(Landroid/content/Context;Landroid/content/Intent;)V

    goto :goto_2

    :cond_12
    const/16 v4, 0x9

    if-ne v3, v4, :cond_13

    .line 74
    iget-object v0, v1, Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver;->this$0:Lcom/papa91/activity/EmuBaseActivity;

    invoke-static {v0, v7}, Lcom/papa91/activity/EmuBaseActivity;->access$302(Lcom/papa91/activity/EmuBaseActivity;Z)Z

    goto :goto_2

    .line 75
    :cond_13
    iget-object v3, v1, Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver;->this$0:Lcom/papa91/activity/EmuBaseActivity;

    invoke-virtual {v3, v0, v2}, Lcom/papa91/activity/EmuBaseActivity;->handleAdResult(Landroid/content/Context;Landroid/content/Intent;)V

    :catch_2
    :cond_14
    :goto_2
    return-void
.end method
