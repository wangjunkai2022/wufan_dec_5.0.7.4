.class Lcom/join/mgps/activity/RewardAdDialogActivity$a;
.super Ljava/lang/Object;
.source "RewardAdDialogActivity.java"

# interfaces
.implements Lcom/join/mgps/broadcast/NetBroadcastReceiver$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/RewardAdDialogActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/RewardAdDialogActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/RewardAdDialogActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity$a;->a:Lcom/join/mgps/activity/RewardAdDialogActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 4

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity$a;->a:Lcom/join/mgps/activity/RewardAdDialogActivity;

    iget-boolean v1, p1, Lcom/join/mgps/activity/RewardAdDialogActivity;->t:Z

    if-eqz v1, :cond_0

    .line 2
    iput-boolean v0, p1, Lcom/join/mgps/activity/RewardAdDialogActivity;->t:Z

    .line 3
    invoke-static {p1}, Lcom/join/mgps/activity/RewardAdDialogActivity;->f0(Lcom/join/mgps/activity/RewardAdDialogActivity;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity$a;->a:Lcom/join/mgps/activity/RewardAdDialogActivity;

    invoke-static {p1}, Lcom/join/mgps/ad/a;->g(Landroid/content/Context;)Lcom/join/mgps/ad/a;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity$a;->a:Lcom/join/mgps/activity/RewardAdDialogActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/RewardAdDialogActivity;->g0(Lcom/join/mgps/activity/RewardAdDialogActivity;)I

    move-result v0

    iget-object v1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity$a;->a:Lcom/join/mgps/activity/RewardAdDialogActivity;

    invoke-static {v1}, Lcom/join/mgps/activity/RewardAdDialogActivity;->k0(Lcom/join/mgps/activity/RewardAdDialogActivity;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/RewardAdDialogActivity$a;->a:Lcom/join/mgps/activity/RewardAdDialogActivity;

    invoke-static {v2}, Lcom/join/mgps/activity/RewardAdDialogActivity;->l0(Lcom/join/mgps/activity/RewardAdDialogActivity;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/join/mgps/activity/RewardAdDialogActivity$a;->a:Lcom/join/mgps/activity/RewardAdDialogActivity;

    iget-object v3, v3, Lcom/join/mgps/activity/RewardAdDialogActivity;->r:Lcom/join/mgps/ad/n;

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/join/mgps/ad/a;->h(ILjava/lang/String;Ljava/lang/String;Lcom/join/mgps/ad/n;)V

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity$a;->a:Lcom/join/mgps/activity/RewardAdDialogActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/RewardAdDialogActivity;->m0(Lcom/join/mgps/activity/RewardAdDialogActivity;)V

    return-void
.end method
