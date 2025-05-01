.class Lcom/join/mgps/activity/RewardAdDialogActivity$c;
.super Lcom/join/mgps/ad/t;
.source "RewardAdDialogActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/RewardAdDialogActivity;->s0()V
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
    iput-object p1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity$c;->a:Lcom/join/mgps/activity/RewardAdDialogActivity;

    invoke-direct {p0}, Lcom/join/mgps/ad/t;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/ad/t;->b(Z)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity$c;->a:Lcom/join/mgps/activity/RewardAdDialogActivity;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/join/mgps/activity/RewardAdDialogActivity;->p0(Lcom/join/mgps/activity/RewardAdDialogActivity;Z)Z

    return-void
.end method

.method public onADClose()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/join/mgps/ad/t;->onADClose()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity$c;->a:Lcom/join/mgps/activity/RewardAdDialogActivity;

    invoke-virtual {v0}, Lcom/join/mgps/base/dialog/BaseDialogActivity;->finish()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity$c;->a:Lcom/join/mgps/activity/RewardAdDialogActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/RewardAdDialogActivity;->q0(Lcom/join/mgps/activity/RewardAdDialogActivity;)Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;

    move-result-object v0

    instance-of v0, v0, Ls1/b;

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity$c;->a:Lcom/join/mgps/activity/RewardAdDialogActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/RewardAdDialogActivity;->r0(Lcom/join/mgps/activity/RewardAdDialogActivity;)Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;

    move-result-object v0

    check-cast v0, Ls1/b;

    .line 5
    invoke-interface {v0}, Ls1/b;->onAdClose()V

    :cond_0
    return-void
.end method

.method public onError(ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/ad/t;->onError(ILjava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity$c;->a:Lcom/join/mgps/activity/RewardAdDialogActivity;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lcom/join/mgps/activity/RewardAdDialogActivity;->p0(Lcom/join/mgps/activity/RewardAdDialogActivity;Z)Z

    return-void
.end method

.method public onVideoCached()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/join/mgps/ad/t;->onVideoCached()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity$c;->a:Lcom/join/mgps/activity/RewardAdDialogActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/join/mgps/activity/RewardAdDialogActivity;->p0(Lcom/join/mgps/activity/RewardAdDialogActivity;Z)Z

    return-void
.end method

.method public onVideoComplete()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/join/mgps/ad/t;->onVideoComplete()V

    .line 2
    new-instance v0, Lcom/papa91/wrapper/UserPrefs;

    iget-object v1, p0, Lcom/join/mgps/activity/RewardAdDialogActivity$c;->a:Lcom/join/mgps/activity/RewardAdDialogActivity;

    invoke-direct {v0, v1}, Lcom/papa91/wrapper/UserPrefs;-><init>(Landroid/content/Context;)V

    .line 3
    invoke-virtual {v0}, Lcom/papa91/wrapper/UserPrefs;->getAdGamesHasSeeCount()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lcom/papa91/wrapper/UserPrefs;->setAdGamesHasSeeCount(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity$c;->a:Lcom/join/mgps/activity/RewardAdDialogActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/RewardAdDialogActivity;->h0(Lcom/join/mgps/activity/RewardAdDialogActivity;)Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;

    move-result-object v0

    instance-of v0, v0, Ls1/b;

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity$c;->a:Lcom/join/mgps/activity/RewardAdDialogActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/RewardAdDialogActivity;->i0(Lcom/join/mgps/activity/RewardAdDialogActivity;)Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;

    move-result-object v0

    check-cast v0, Ls1/b;

    .line 6
    invoke-interface {v0}, Ls1/b;->onAdShow()V

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/RewardAdDialogActivity$c;->a:Lcom/join/mgps/activity/RewardAdDialogActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/RewardAdDialogActivity;->j0(Lcom/join/mgps/activity/RewardAdDialogActivity;)V

    return-void
.end method
