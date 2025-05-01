.class public Lcom/join/mgps/activity/GameMainActivity3$EmuOutResultReceiver;
.super Landroid/content/BroadcastReceiver;
.source "GameMainActivity3.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/GameMainActivity3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "EmuOutResultReceiver"
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/GameMainActivity3;


# direct methods
.method public constructor <init>(Lcom/join/mgps/activity/GameMainActivity3;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GameMainActivity3$EmuOutResultReceiver;->a:Lcom/join/mgps/activity/GameMainActivity3;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string v0, "com.join.android.app.mgsim.wufun.broadcast.emu.gameout.ad"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "eventType"

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    const-string v1, "eventFlag"

    .line 3
    invoke-virtual {p2, v1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    const-string v1, "packageName"

    .line 4
    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 5
    new-instance p2, Lcom/join/mgps/event/a;

    invoke-direct {p2, p1}, Lcom/join/mgps/event/a;-><init>(I)V

    .line 6
    invoke-virtual {p2, v0}, Lcom/join/mgps/event/a;->e(I)V

    .line 7
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainActivity3$EmuOutResultReceiver;->a:Lcom/join/mgps/activity/GameMainActivity3;

    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/GameMainActivity3;->onADEvent(Lcom/join/mgps/event/a;)V

    :cond_0
    return-void
.end method
