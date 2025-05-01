.class Lcom/join/mgps/activity/MiniGameLoadingActivity$f;
.super Landroid/content/BroadcastReceiver;
.source "MiniGameLoadingActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/MiniGameLoadingActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "f"
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/MiniGameLoadingActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/MiniGameLoadingActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$f;->a:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string v0, "com.join.android.app.mgsim.wufun.soCopyStart"

    .line 2
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "soName"

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 4
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_0

    return-void

    .line 5
    :cond_0
    iget-object p2, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$f;->a:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    iget-object p2, p2, Lcom/join/mgps/activity/MiniGameLoadingActivity;->t:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_1
    const-string v0, "com.join.android.app.mgsim.wufun.soCopyFinish"

    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    .line 7
    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 8
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 9
    iget-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$f;->a:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    iput-boolean v2, p1, Lcom/join/mgps/activity/MiniGameLoadingActivity;->s:Z

    .line 10
    iget-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$f;->a:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    invoke-virtual {p1}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->z0()V

    return-void

    .line 11
    :cond_2
    iget-object p2, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$f;->a:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    iget-object p2, p2, Lcom/join/mgps/activity/MiniGameLoadingActivity;->u:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12
    iget-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$f;->a:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    iget-boolean p2, p1, Lcom/join/mgps/activity/MiniGameLoadingActivity;->s:Z

    if-eqz p2, :cond_6

    invoke-virtual {p1}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->z0()V

    goto :goto_0

    :cond_3
    const-string p2, "com.join.android.app.mgsim.wufun.loadMod"

    .line 13
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 14
    iget-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$f;->a:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    goto :goto_0

    :cond_4
    const-string p2, "com.join.android.app.mgsim.wufun.soCopyFail"

    .line 15
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 16
    sget p1, Lcom/join/mgps/activity/MiniGameLoadingActivity;->H:I

    add-int/2addr p1, v2

    sput p1, Lcom/join/mgps/activity/MiniGameLoadingActivity;->H:I

    .line 17
    iget-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$f;->a:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    iget-object p1, p1, Lcom/join/mgps/activity/MiniGameLoadingActivity;->m:Ljava/lang/String;

    invoke-static {p1}, Lcom/join/mgps/Util/h0;->i(Ljava/lang/String;)Z

    .line 18
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object p2, Lcom/join/mgps/Util/v;->g:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "mod/"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$f;->a:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    iget-object p2, p2, Lcom/join/mgps/activity/MiniGameLoadingActivity;->k:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "/oat"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/h0;->i(Ljava/lang/String;)Z

    .line 19
    iget-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$f;->a:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->q0(Lcom/join/mgps/activity/MiniGameLoadingActivity;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$f;->a:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    invoke-static {p1}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_5

    sget p1, Lcom/join/mgps/activity/MiniGameLoadingActivity;->H:I

    const/4 p2, 0x2

    if-ge p1, p2, :cond_5

    .line 20
    iget-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$f;->a:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    iget-object p2, p1, Lcom/join/mgps/activity/MiniGameLoadingActivity;->c:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->y0(Ljava/lang/String;)V

    goto :goto_0

    .line 21
    :cond_5
    iget-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$f;->a:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    invoke-virtual {p1}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->N0()V

    :cond_6
    :goto_0
    return-void
.end method
