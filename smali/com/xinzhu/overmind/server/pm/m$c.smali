.class Lcom/xinzhu/overmind/server/pm/m$c;
.super Landroid/content/BroadcastReceiver;
.source "RegisteredServicesCache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xinzhu/overmind/server/pm/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/xinzhu/overmind/server/pm/m;


# direct methods
.method constructor <init>(Lcom/xinzhu/overmind/server/pm/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xinzhu/overmind/server/pm/m$c;->a:Lcom/xinzhu/overmind/server/pm/m;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    const-string p1, "android.intent.extra.UID"

    const/4 v0, -0x1

    .line 1
    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    if-eq p1, v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xinzhu/overmind/server/pm/m$c;->a:Lcom/xinzhu/overmind/server/pm/m;

    invoke-static {p1}, Lcom/xinzhu/overmind/server/user/MindUserHandle;->k(I)I

    move-result p1

    invoke-static {v0, p2, p1}, Lcom/xinzhu/overmind/server/pm/m;->h(Lcom/xinzhu/overmind/server/pm/m;Landroid/content/Intent;I)V

    :cond_0
    return-void
.end method
