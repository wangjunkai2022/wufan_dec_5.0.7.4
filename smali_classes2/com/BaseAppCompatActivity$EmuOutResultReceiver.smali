.class public Lcom/BaseAppCompatActivity$EmuOutResultReceiver;
.super Landroid/content/BroadcastReceiver;
.source "BaseAppCompatActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/BaseAppCompatActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "EmuOutResultReceiver"
.end annotation


# instance fields
.field final synthetic a:Lcom/BaseAppCompatActivity;


# direct methods
.method public constructor <init>(Lcom/BaseAppCompatActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/BaseAppCompatActivity$EmuOutResultReceiver;->a:Lcom/BaseAppCompatActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string p2, "com.join.android.app.mgsim.wufun.broadcast.mod.gameout"

    .line 2
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    sget-object p1, Lcom/MApplication;->x:Lcom/MApplication;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/MApplication;->G(Z)V

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/Thread;

    new-instance p2, Lcom/BaseAppCompatActivity$EmuOutResultReceiver$a;

    invoke-direct {p2, p0}, Lcom/BaseAppCompatActivity$EmuOutResultReceiver$a;-><init>(Lcom/BaseAppCompatActivity$EmuOutResultReceiver;)V

    invoke-direct {p1, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 5
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    return-void
.end method
