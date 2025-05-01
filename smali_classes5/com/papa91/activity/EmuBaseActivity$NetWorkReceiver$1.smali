.class Lcom/papa91/activity/EmuBaseActivity$NetWorkReceiver$1;
.super Ljava/util/TimerTask;
.source "EmuBaseActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/papa91/activity/EmuBaseActivity$NetWorkReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field count:I

.field final synthetic this$1:Lcom/papa91/activity/EmuBaseActivity$NetWorkReceiver;

.field final synthetic val$achieves:Ljava/util/ArrayList;

.field final synthetic val$timer:Ljava/util/Timer;


# direct methods
.method constructor <init>(Lcom/papa91/activity/EmuBaseActivity$NetWorkReceiver;Ljava/util/ArrayList;Ljava/util/Timer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa91/activity/EmuBaseActivity$NetWorkReceiver$1;->this$1:Lcom/papa91/activity/EmuBaseActivity$NetWorkReceiver;

    iput-object p2, p0, Lcom/papa91/activity/EmuBaseActivity$NetWorkReceiver$1;->val$achieves:Ljava/util/ArrayList;

    iput-object p3, p0, Lcom/papa91/activity/EmuBaseActivity$NetWorkReceiver$1;->val$timer:Ljava/util/Timer;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lcom/papa91/activity/EmuBaseActivity$NetWorkReceiver$1;->count:I

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/papa91/activity/EmuBaseActivity$NetWorkReceiver$1;->count:I

    iget-object v1, p0, Lcom/papa91/activity/EmuBaseActivity$NetWorkReceiver$1;->val$achieves:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lt v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/papa91/activity/EmuBaseActivity$NetWorkReceiver$1;->val$timer:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/papa91/activity/EmuBaseActivity$NetWorkReceiver$1;->val$achieves:Ljava/util/ArrayList;

    iget v1, p0, Lcom/papa91/activity/EmuBaseActivity$NetWorkReceiver$1;->count:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    sget-boolean v1, Lcom/papa91/activity/EmuBaseActivity;->tourist:Z

    invoke-static {v0, v1}, Lcom/papa91/activity/EmuBaseActivity;->access$800(Ljava/lang/String;Z)V

    .line 4
    iget v0, p0, Lcom/papa91/activity/EmuBaseActivity$NetWorkReceiver$1;->count:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/papa91/activity/EmuBaseActivity$NetWorkReceiver$1;->count:I

    :goto_0
    return-void
.end method
