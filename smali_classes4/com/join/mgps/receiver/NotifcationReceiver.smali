.class public Lcom/join/mgps/receiver/NotifcationReceiver;
.super Landroid/content/BroadcastReceiver;
.source "NotifcationReceiver.java"


# static fields
.field public static final a:Ljava/lang/String; = "_task_id"

.field public static final b:Ljava/lang/String; = "_game_down_status"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 4

    .line 1
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/join/mgps/activity/MGMainActivity_;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v1, 0x14000000

    .line 2
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 3
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "MainPos"

    const/4 v3, 0x2

    .line 4
    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 5
    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 6
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private b(Landroid/content/Intent;)V
    .locals 1

    const-string v0, "_task_id"

    .line 1
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2
    invoke-static {}, Lcom/join/android/app/common/servcie/i;->e()Lcom/join/android/app/common/servcie/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/android/app/common/servcie/i;->f(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    if-nez v0, :cond_0

    .line 3
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    :cond_0
    if-eqz v0, :cond_1

    const/4 p1, 0x1

    .line 4
    invoke-virtual {v0, p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setHasDeleteNotify(Z)V

    :cond_1
    return-void
.end method

.method private c(Landroid/content/Intent;)Z
    .locals 1

    const-string v0, "_task_id"

    .line 1
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    .line 3
    invoke-static {p1}, Lcom/join/android/app/common/utils/APKUtils;->G(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result p1

    return p1
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 1
    sget-object v0, Lcom/MApplication;->x:Lcom/MApplication;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/MApplication;->G(Z)V

    .line 2
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v2, "com.wufun.down.notify.del"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-direct {p0, p2}, Lcom/join/mgps/receiver/NotifcationReceiver;->b(Landroid/content/Intent;)V

    goto/16 :goto_2

    .line 4
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v2, "com.wufun.down.notify.start.modmain"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/high16 v2, 0x20000000

    if-eqz v0, :cond_3

    .line 5
    sget-boolean v0, Lcom/MApplication;->C1:Z

    if-eqz v0, :cond_1

    .line 6
    invoke-direct {p0, p1}, Lcom/join/mgps/receiver/NotifcationReceiver;->a(Landroid/content/Context;)V

    goto :goto_0

    .line 7
    :cond_1
    sget-object v0, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {v0}, Lcom/MApplication;->getActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 8
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/event/o;

    const-class v3, Lcom/join/mgps/activity/AppDownFinishDialogActivity;

    invoke-direct {v1, v3}, Lcom/join/mgps/event/o;-><init>(Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    .line 9
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 10
    new-instance v1, Landroid/content/Intent;

    const-class v3, Lcom/join/mgps/activity/ModGameIndexActivity_;

    invoke-direct {v1, p1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 11
    invoke-virtual {v1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 12
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 13
    invoke-virtual {p1, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 14
    :cond_2
    invoke-direct {p0, p1}, Lcom/join/mgps/receiver/NotifcationReceiver;->a(Landroid/content/Context;)V

    .line 15
    :goto_0
    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object v0, Lcom/papa/sim/statistic/Event;->onclickNotbarDownloaded:Lcom/papa/sim/statistic/Event;

    new-instance v1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-direct {p0, p2}, Lcom/join/mgps/receiver/NotifcationReceiver;->c(Landroid/content/Intent;)Z

    move-result p2

    invoke-virtual {v1, p2}, Lcom/papa/sim/statistic/Ext;->setGameFlag(I)Lcom/papa/sim/statistic/Ext;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto :goto_2

    .line 16
    :cond_3
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v3, "com.wufun.down.notify.start.gamemanager"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 17
    sget-boolean v0, Lcom/MApplication;->C1:Z

    if-eqz v0, :cond_4

    .line 18
    invoke-direct {p0, p1}, Lcom/join/mgps/receiver/NotifcationReceiver;->a(Landroid/content/Context;)V

    goto :goto_1

    .line 19
    :cond_4
    sget-object v0, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {v0}, Lcom/MApplication;->getActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 20
    new-instance v0, Landroid/content/Intent;

    sget-object v3, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {v3}, Lcom/MApplication;->getActivity()Landroid/app/Activity;

    move-result-object v3

    const-class v4, Lcom/join/mgps/activity/MyGameManagerActivity_;

    invoke-direct {v0, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 21
    invoke-virtual {v0, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 22
    sget-object v2, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {v2}, Lcom/MApplication;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto :goto_1

    .line 23
    :cond_5
    invoke-direct {p0, p1}, Lcom/join/mgps/receiver/NotifcationReceiver;->a(Landroid/content/Context;)V

    :goto_1
    const/4 v0, 0x0

    const-string v2, "_game_down_status"

    .line 24
    invoke-virtual {p2, v2, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    if-ne v0, v1, :cond_6

    .line 25
    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object v0, Lcom/papa/sim/statistic/Event;->onclickNotbarDownloaded:Lcom/papa/sim/statistic/Event;

    new-instance v1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-direct {p0, p2}, Lcom/join/mgps/receiver/NotifcationReceiver;->c(Landroid/content/Intent;)Z

    move-result p2

    invoke-virtual {v1, p2}, Lcom/papa/sim/statistic/Ext;->setGameFlag(I)Lcom/papa/sim/statistic/Ext;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto :goto_2

    .line 26
    :cond_6
    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object v0, Lcom/papa/sim/statistic/Event;->onclickNotbarDownloading:Lcom/papa/sim/statistic/Event;

    new-instance v1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-direct {p0, p2}, Lcom/join/mgps/receiver/NotifcationReceiver;->c(Landroid/content/Intent;)Z

    move-result p2

    invoke-virtual {v1, p2}, Lcom/papa/sim/statistic/Ext;->setGameFlag(I)Lcom/papa/sim/statistic/Ext;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    :cond_7
    :goto_2
    return-void
.end method
