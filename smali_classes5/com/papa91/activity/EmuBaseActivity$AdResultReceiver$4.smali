.class Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver$4;
.super Ljava/lang/Object;
.source "EmuBaseActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver;


# direct methods
.method constructor <init>(Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver$4;->this$1:Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver$4;->this$1:Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver;

    iget-object v0, v0, Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver;->this$0:Lcom/papa91/activity/EmuBaseActivity;

    iget-object v0, v0, Lcom/papa91/activity/EmuBaseActivity;->allowBean:Lcom/papa91/arc/bean/EndGameAllowBean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/papa91/arc/bean/EndGameAllowBean;->isUnlimited()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver$4;->this$1:Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver;

    iget-object v0, v0, Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver;->this$0:Lcom/papa91/activity/EmuBaseActivity;

    iget-object v0, v0, Lcom/papa91/activity/EmuBaseActivity;->allowBean:Lcom/papa91/arc/bean/EndGameAllowBean;

    invoke-virtual {v0}, Lcom/papa91/arc/bean/EndGameAllowBean;->getCards()I

    move-result v0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "\u5e7f\u544a\u83b7\u53d6\u5931\u8d25"

    .line 2
    invoke-static {v0}, Lcom/papa91/activity/EmuBaseActivity;->showToast(Ljava/lang/String;)V

    .line 3
    :cond_1
    :goto_0
    sget v0, Lcom/papa91/activity/EmuBaseActivity;->scenario:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 4
    iget-object v0, p0, Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver$4;->this$1:Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver;

    iget-object v0, v0, Lcom/papa91/activity/EmuBaseActivity$AdResultReceiver;->this$0:Lcom/papa91/activity/EmuBaseActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1}, Lcom/papa91/activity/EmuBaseActivity;->endGameAllow(ZI)V

    :cond_2
    return-void
.end method
