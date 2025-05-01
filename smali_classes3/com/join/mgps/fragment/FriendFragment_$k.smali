.class Lcom/join/mgps/fragment/FriendFragment_$k;
.super Landroid/content/BroadcastReceiver;
.source "FriendFragment_.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/fragment/FriendFragment_;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/fragment/FriendFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/FriendFragment_;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/FriendFragment_$k;->a:Lcom/join/mgps/fragment/FriendFragment_;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/fragment/FriendFragment_$k;->a:Lcom/join/mgps/fragment/FriendFragment_;

    invoke-virtual {p1}, Lcom/join/mgps/fragment/FriendFragment;->j0()V

    return-void
.end method
