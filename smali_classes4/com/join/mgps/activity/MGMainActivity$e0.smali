.class Lcom/join/mgps/activity/MGMainActivity$e0;
.super Lcom/join/mgps/ad/l;
.source "MGMainActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/MGMainActivity;->initGrMDownLoadSpeedAd(Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic s:Z

.field final synthetic t:Lcom/join/mgps/activity/MGMainActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/MGMainActivity;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/MGMainActivity$e0;->t:Lcom/join/mgps/activity/MGMainActivity;

    iput-boolean p5, p0, Lcom/join/mgps/activity/MGMainActivity$e0;->s:Z

    invoke-direct {p0, p2, p3, p4}, Lcom/join/mgps/ad/l;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/ad/d;->c(Ljava/lang/String;)V

    .line 2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 3
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v1

    const/16 v2, 0xb

    if-ne v1, v2, :cond_0

    .line 5
    iget-object v1, p0, Lcom/join/mgps/activity/MGMainActivity$e0;->t:Lcom/join/mgps/activity/MGMainActivity;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->a4(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/MGMainActivity$e0;->t:Lcom/join/mgps/activity/MGMainActivity;

    iget-object v1, v0, Lcom/join/mgps/activity/MGMainActivity;->groDownLoadSpeedAd:Lcom/join/mgps/ad/l;

    const/16 v1, 0x15

    invoke-static {v0, v1, p1}, Lcom/join/mgps/ad/d;->k(Landroid/content/Context;ILjava/lang/String;)V

    .line 7
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/activity/MGMainActivity$e0;->t:Lcom/join/mgps/activity/MGMainActivity;

    invoke-virtual {p1}, Lcom/join/mgps/activity/MGMainActivity;->delayChangeAdshow()V

    .line 8
    iget-object p1, p0, Lcom/join/mgps/activity/MGMainActivity$e0;->t:Lcom/join/mgps/activity/MGMainActivity;

    iget-object v0, p1, Lcom/join/mgps/activity/MGMainActivity;->groDownLoadSpeedAd:Lcom/join/mgps/ad/l;

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/MGMainActivity;->delayLoadRewardAd(Lcom/join/mgps/ad/d;)V

    return-void
.end method

.method public onADShow()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/join/mgps/ad/d;->onADShow()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/MGMainActivity$e0;->t:Lcom/join/mgps/activity/MGMainActivity;

    const/4 v1, 0x3

    const/4 v2, 0x7

    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/activity/MGMainActivity;->sendVideoAdWatchLog(II)V

    .line 3
    sget-object v0, Lcom/papa/sim/statistic/Event;->Stopad_GromoreSdk_VideoShow:Lcom/papa/sim/statistic/Event;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/ad/d;->f:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/ad/d;->l(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onInitSuccess()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/join/mgps/ad/d;->onInitSuccess()V

    .line 2
    iget-boolean v0, p0, Lcom/join/mgps/activity/MGMainActivity$e0;->s:Z

    invoke-virtual {p0, v0}, Lcom/join/mgps/ad/l;->h(Z)V

    return-void
.end method

.method public y()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/join/mgps/ad/l;->y()V

    .line 2
    sget-object v0, Lcom/papa/sim/statistic/Event;->Stopad_GromoreSdk_Videoloading:Lcom/papa/sim/statistic/Event;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/ad/d;->f:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/ad/d;->l(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
