.class Lcom/join/mgps/activity/UninstallWufunGameActivity$d;
.super Ljava/lang/Object;
.source "UninstallWufunGameActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/UninstallWufunGameActivity;->apkInstalRecver(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/content/Intent;

.field final synthetic c:Lcom/join/mgps/activity/UninstallWufunGameActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/UninstallWufunGameActivity;Landroid/content/Intent;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity$d;->c:Lcom/join/mgps/activity/UninstallWufunGameActivity;

    iput-object p2, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity$d;->b:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity$d;->b:Landroid/content/Intent;

    const-string v1, "packageName"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity$d;->b:Landroid/content/Intent;

    const-string v2, "actionFrom"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "android.intent.action.PACKAGE_REMOVED"

    .line 3
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity$d;->c:Lcom/join/mgps/activity/UninstallWufunGameActivity;

    invoke-static {v1}, Lcom/join/mgps/activity/UninstallWufunGameActivity;->i0(Lcom/join/mgps/activity/UninstallWufunGameActivity;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity$d;->c:Lcom/join/mgps/activity/UninstallWufunGameActivity;

    invoke-static {v1}, Lcom/join/mgps/activity/UninstallWufunGameActivity;->i0(Lcom/join/mgps/activity/UninstallWufunGameActivity;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v1

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 5
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity$d;->c:Lcom/join/mgps/activity/UninstallWufunGameActivity;

    iget-object v1, v1, Lcom/join/mgps/activity/UninstallWufunGameActivity;->y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 6
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    const/4 v1, 0x7

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity$d;->c:Lcom/join/mgps/activity/UninstallWufunGameActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/UninstallWufunGameActivity;->k0(Lcom/join/mgps/activity/UninstallWufunGameActivity;)I

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity$d;->c:Lcom/join/mgps/activity/UninstallWufunGameActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/UninstallWufunGameActivity;->j0(Lcom/join/mgps/activity/UninstallWufunGameActivity;)I

    move-result v0

    const/4 v1, 0x3

    if-gt v0, v1, :cond_2

    .line 9
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    const-wide/16 v1, 0x3e8

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_1

    .line 10
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity$d;->c:Lcom/join/mgps/activity/UninstallWufunGameActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/UninstallWufunGameActivity;->o:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity$d;->c:Lcom/join/mgps/activity/UninstallWufunGameActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/UninstallWufunGameActivity;->p:Landroid/widget/ImageView;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 12
    iget-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity$d;->c:Lcom/join/mgps/activity/UninstallWufunGameActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/UninstallWufunGameActivity;->p:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 13
    iget-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity$d;->c:Lcom/join/mgps/activity/UninstallWufunGameActivity;

    invoke-virtual {v0}, Lcom/join/mgps/activity/UninstallWufunGameActivity;->v0()V

    .line 14
    iget-object v0, p0, Lcom/join/mgps/activity/UninstallWufunGameActivity$d;->c:Lcom/join/mgps/activity/UninstallWufunGameActivity;

    invoke-virtual {v0}, Lcom/join/mgps/activity/UninstallWufunGameActivity;->w0()V

    :cond_2
    :goto_1
    return-void
.end method
