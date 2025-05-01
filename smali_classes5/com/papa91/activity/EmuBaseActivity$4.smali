.class Lcom/papa91/activity/EmuBaseActivity$4;
.super Landroid/os/Handler;
.source "EmuBaseActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/papa91/activity/EmuBaseActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/papa91/activity/EmuBaseActivity;


# direct methods
.method constructor <init>(Lcom/papa91/activity/EmuBaseActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa91/activity/EmuBaseActivity$4;->this$0:Lcom/papa91/activity/EmuBaseActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    if-eqz v0, :cond_5

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x3

    if-eq v0, v1, :cond_3

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/16 v1, 0x64

    if-eq v0, v1, :cond_1

    const/16 v1, 0x65

    if-eq v0, v1, :cond_0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 2
    :pswitch_0
    iget-object v0, p0, Lcom/papa91/activity/EmuBaseActivity$4;->this$0:Lcom/papa91/activity/EmuBaseActivity;

    iget v1, p1, Landroid/os/Message;->arg1:I

    iput v1, v0, Lcom/papa91/activity/EmuBaseActivity;->endGameResult:I

    .line 3
    iget v2, p1, Landroid/os/Message;->arg2:I

    iput v2, v0, Lcom/papa91/activity/EmuBaseActivity;->endGameMills:I

    if-eqz v1, :cond_6

    const/4 v3, 0x0

    .line 4
    invoke-virtual {v0, v1, v2, v3}, Lcom/papa91/activity/EmuBaseActivity;->updateEndGameResultV2(IILjava/lang/String;)V

    goto :goto_0

    .line 5
    :pswitch_1
    invoke-static {}, Lcom/papa91/activity/EmuBaseActivity;->access$600()Lcom/papa91/activity/EmuBaseActivity;

    move-result-object v0

    iget v1, p1, Landroid/os/Message;->arg1:I

    iget v2, p1, Landroid/os/Message;->arg2:I

    invoke-virtual {v0, v1, v2}, Lcom/papa91/activity/EmuBaseActivity;->complainMsg(II)V

    goto :goto_0

    .line 6
    :pswitch_2
    invoke-static {}, Lcom/papa91/activity/EmuBaseActivity;->access$600()Lcom/papa91/activity/EmuBaseActivity;

    move-result-object v0

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v0, v1}, Lcom/papa91/activity/EmuBaseActivity;->raseVipToMgsim(I)V

    goto :goto_0

    .line 7
    :cond_0
    invoke-static {}, Lcom/papa91/activity/EmuBaseActivity;->access$600()Lcom/papa91/activity/EmuBaseActivity;

    move-result-object v0

    iget v1, p1, Landroid/os/Message;->arg1:I

    iget v2, p1, Landroid/os/Message;->arg2:I

    invoke-virtual {v0, v1, v2}, Lcom/papa91/activity/EmuBaseActivity;->startAdActivity(II)V

    goto :goto_0

    .line 8
    :cond_1
    invoke-static {}, Lcom/papa91/activity/EmuBaseActivity;->access$600()Lcom/papa91/activity/EmuBaseActivity;

    move-result-object v0

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v0, v1}, Lcom/papa91/activity/EmuBaseActivity;->startPrefecture(I)V

    goto :goto_0

    .line 9
    :cond_2
    invoke-static {}, Lcom/papa91/activity/EmuBaseActivity;->access$600()Lcom/papa91/activity/EmuBaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/papa91/activity/EmuBaseActivity;->startBBK_GOINEE_sysAPP()V

    goto :goto_0

    .line 10
    :cond_3
    invoke-static {}, Lcom/papa91/activity/EmuBaseActivity;->access$600()Lcom/papa91/activity/EmuBaseActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/papa91/activity/EmuBaseActivity;->access$1000(Lcom/papa91/activity/EmuBaseActivity;)V

    goto :goto_0

    .line 11
    :cond_4
    invoke-static {}, Lcom/papa91/activity/EmuBaseActivity;->access$600()Lcom/papa91/activity/EmuBaseActivity;

    move-result-object v0

    invoke-static {}, Lcom/papa91/activity/EmuBaseActivity;->access$900()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/papa91/activity/EmuBaseActivity;->selectSpAndCheat(I)V

    goto :goto_0

    .line 12
    :cond_5
    invoke-static {}, Lcom/papa91/activity/EmuBaseActivity;->access$600()Lcom/papa91/activity/EmuBaseActivity;

    invoke-static {}, Lcom/papa91/activity/EmuBaseActivity;->startAPPActivity()V

    .line 13
    :cond_6
    :goto_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    return-void

    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
