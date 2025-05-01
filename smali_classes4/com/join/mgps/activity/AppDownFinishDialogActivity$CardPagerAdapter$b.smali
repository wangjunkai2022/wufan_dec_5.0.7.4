.class Lcom/join/mgps/activity/AppDownFinishDialogActivity$CardPagerAdapter$b;
.super Ljava/lang/Object;
.source "AppDownFinishDialogActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/AppDownFinishDialogActivity$CardPagerAdapter;->c(Lcom/join/mgps/activity/AppDownFinishDialogActivity$c;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/AppDownFinishDialogActivity$c;

.field final synthetic c:Lcom/join/mgps/activity/AppDownFinishDialogActivity$CardPagerAdapter;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/AppDownFinishDialogActivity$CardPagerAdapter;Lcom/join/mgps/activity/AppDownFinishDialogActivity$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/AppDownFinishDialogActivity$CardPagerAdapter$b;->c:Lcom/join/mgps/activity/AppDownFinishDialogActivity$CardPagerAdapter;

    iput-object p2, p0, Lcom/join/mgps/activity/AppDownFinishDialogActivity$CardPagerAdapter$b;->b:Lcom/join/mgps/activity/AppDownFinishDialogActivity$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/AppDownFinishDialogActivity$CardPagerAdapter$b;->b:Lcom/join/mgps/activity/AppDownFinishDialogActivity$c;

    iget-object v0, v0, Lcom/join/mgps/activity/AppDownFinishDialogActivity$c;->a:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->isSo()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/AppDownFinishDialogActivity$CardPagerAdapter$b;->b:Lcom/join/mgps/activity/AppDownFinishDialogActivity$c;

    iget-object v0, v0, Lcom/join/mgps/activity/AppDownFinishDialogActivity$c;->a:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->isMod()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object v0, Lcom/papa/sim/statistic/Event;->exitSoGameStart:Lcom/papa/sim/statistic/Event;

    new-instance v2, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v2}, Lcom/papa/sim/statistic/Ext;-><init>()V

    iget-object v3, p0, Lcom/join/mgps/activity/AppDownFinishDialogActivity$CardPagerAdapter$b;->b:Lcom/join/mgps/activity/AppDownFinishDialogActivity$c;

    iget-object v3, v3, Lcom/join/mgps/activity/AppDownFinishDialogActivity$c;->a:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/papa/sim/statistic/Ext;->setGameFlag(I)Lcom/papa/sim/statistic/Ext;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object v0, Lcom/papa/sim/statistic/Event;->exitSoGameStart:Lcom/papa/sim/statistic/Event;

    new-instance v1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    iget-object v2, p0, Lcom/join/mgps/activity/AppDownFinishDialogActivity$CardPagerAdapter$b;->b:Lcom/join/mgps/activity/AppDownFinishDialogActivity$c;

    iget-object v2, v2, Lcom/join/mgps/activity/AppDownFinishDialogActivity$c;->a:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto :goto_0

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/AppDownFinishDialogActivity$CardPagerAdapter$b;->b:Lcom/join/mgps/activity/AppDownFinishDialogActivity$c;

    iget-object v0, v0, Lcom/join/mgps/activity/AppDownFinishDialogActivity$c;->a:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->isMod()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object v0, Lcom/papa/sim/statistic/Event;->exitSinGameStart:Lcom/papa/sim/statistic/Event;

    new-instance v2, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v2}, Lcom/papa/sim/statistic/Ext;-><init>()V

    iget-object v3, p0, Lcom/join/mgps/activity/AppDownFinishDialogActivity$CardPagerAdapter$b;->b:Lcom/join/mgps/activity/AppDownFinishDialogActivity$c;

    iget-object v3, v3, Lcom/join/mgps/activity/AppDownFinishDialogActivity$c;->a:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/papa/sim/statistic/Ext;->setGameFlag(I)Lcom/papa/sim/statistic/Ext;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto :goto_0

    .line 7
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object v0, Lcom/papa/sim/statistic/Event;->exitSinGameStart:Lcom/papa/sim/statistic/Event;

    new-instance v2, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v2}, Lcom/papa/sim/statistic/Ext;-><init>()V

    iget-object v3, p0, Lcom/join/mgps/activity/AppDownFinishDialogActivity$CardPagerAdapter$b;->b:Lcom/join/mgps/activity/AppDownFinishDialogActivity$c;

    iget-object v3, v3, Lcom/join/mgps/activity/AppDownFinishDialogActivity$c;->a:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/papa/sim/statistic/Ext;->setGameFlag(I)Lcom/papa/sim/statistic/Ext;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 8
    :goto_0
    iget-object p1, p0, Lcom/join/mgps/activity/AppDownFinishDialogActivity$CardPagerAdapter$b;->c:Lcom/join/mgps/activity/AppDownFinishDialogActivity$CardPagerAdapter;

    iget-object p1, p1, Lcom/join/mgps/activity/AppDownFinishDialogActivity$CardPagerAdapter;->c:Lcom/join/mgps/activity/AppDownFinishDialogActivity;

    invoke-virtual {p1}, Lcom/join/mgps/base/dialog/BaseDialogActivity;->finish()V

    return-void
.end method
