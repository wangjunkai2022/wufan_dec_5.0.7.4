.class Lcom/BaseFragmentActivity$p;
.super Landroid/content/BroadcastReceiver;
.source "BaseFragmentActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/BaseFragmentActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "p"
.end annotation


# instance fields
.field final synthetic a:Lcom/BaseFragmentActivity;


# direct methods
.method constructor <init>(Lcom/BaseFragmentActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/BaseFragmentActivity$p;->a:Lcom/BaseFragmentActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    if-eqz p2, :cond_2

    .line 1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string v0, "com.wufun.get.downFinish"

    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "gameid"

    .line 4
    invoke-virtual {p2, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 5
    iget-object p2, p0, Lcom/BaseFragmentActivity$p;->a:Lcom/BaseFragmentActivity;

    invoke-static {p2, p1}, Lcom/BaseFragmentActivity;->access$000(Lcom/BaseFragmentActivity;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string v0, "com.wufun.get.permission"

    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 7
    new-instance p1, Lcom/BaseFragmentActivity$o;

    iget-object v0, p0, Lcom/BaseFragmentActivity$p;->a:Lcom/BaseFragmentActivity;

    invoke-direct {p1, v0}, Lcom/BaseFragmentActivity$o;-><init>(Lcom/BaseFragmentActivity;)V

    const-string v0, "permission"

    .line 8
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/BaseFragmentActivity$o;->a:Ljava/lang/String;

    const-string v0, "filePath"

    .line 9
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p1, Lcom/BaseFragmentActivity$o;->b:Ljava/lang/String;

    .line 10
    new-instance p2, Landroid/os/Message;

    invoke-direct {p2}, Landroid/os/Message;-><init>()V

    const/4 v0, 0x2

    .line 11
    iput v0, p2, Landroid/os/Message;->what:I

    .line 12
    iput-object p1, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 13
    iget-object p1, p0, Lcom/BaseFragmentActivity$p;->a:Lcom/BaseFragmentActivity;

    invoke-static {p1}, Lcom/BaseFragmentActivity;->access$100(Lcom/BaseFragmentActivity;)Landroid/os/Handler;

    move-result-object p1

    const-wide/16 v0, 0x1f4

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    :cond_2
    :goto_0
    return-void
.end method
