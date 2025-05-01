.class Lcom/join/mgps/activity/ModGameIndexActivity$e;
.super Ljava/lang/Object;
.source "ModGameIndexActivity.java"

# interfaces
.implements Lcom/join/mgps/dialog/l1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/ModGameIndexActivity;->C1(Lcom/github/snowdream/android/app/downloader/DownloadTask;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

.field final synthetic c:I

.field final synthetic d:Lcom/join/mgps/dto/DomainInfoBean;

.field final synthetic e:Lcom/join/mgps/activity/ModGameIndexActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/ModGameIndexActivity;ILcom/github/snowdream/android/app/downloader/DownloadTask;ILcom/join/mgps/dto/DomainInfoBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/ModGameIndexActivity$e;->e:Lcom/join/mgps/activity/ModGameIndexActivity;

    iput p2, p0, Lcom/join/mgps/activity/ModGameIndexActivity$e;->a:I

    iput-object p3, p0, Lcom/join/mgps/activity/ModGameIndexActivity$e;->b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iput p4, p0, Lcom/join/mgps/activity/ModGameIndexActivity$e;->c:I

    iput-object p5, p0, Lcom/join/mgps/activity/ModGameIndexActivity$e;->d:Lcom/join/mgps/dto/DomainInfoBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity$e;->e:Lcom/join/mgps/activity/ModGameIndexActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/ModGameIndexActivity;->z0(Lcom/join/mgps/activity/ModGameIndexActivity;)Lcom/join/mgps/dialog/l1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dialog/p;->dismiss()V

    .line 2
    iget v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity$e;->a:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity$e;->e:Lcom/join/mgps/activity/ModGameIndexActivity;

    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity$e;->b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget v2, p0, Lcom/join/mgps/activity/ModGameIndexActivity$e;->c:I

    invoke-static {v0, v1, v2}, Lcom/join/mgps/activity/ModGameIndexActivity;->A0(Lcom/join/mgps/activity/ModGameIndexActivity;Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity$e;->e:Lcom/join/mgps/activity/ModGameIndexActivity;

    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity$e;->b:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0, v1}, Lcom/join/mgps/activity/ModGameIndexActivity;->B0(Lcom/join/mgps/activity/ModGameIndexActivity;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public b()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity$e;->e:Lcom/join/mgps/activity/ModGameIndexActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/ModGameIndexActivity;->t0(Lcom/join/mgps/activity/ModGameIndexActivity;)Landroid/app/Activity;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/ModGameIndexActivity$e;->d:Lcom/join/mgps/dto/DomainInfoBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/DomainInfoBean;->getInfo()Ljava/lang/String;

    move-result-object v1

    const-string v2, "single_game_start"

    invoke-static {v0, v1, v2}, Lcom/join/mgps/Util/UtilsMy;->h4(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/ModGameIndexActivity$e;->e:Lcom/join/mgps/activity/ModGameIndexActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/ModGameIndexActivity;->t0(Lcom/join/mgps/activity/ModGameIndexActivity;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v1, Lcom/papa/sim/statistic/Event;->pdSingleStartClick:Lcom/papa/sim/statistic/Event;

    new-instance v2, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v2}, Lcom/papa/sim/statistic/Ext;-><init>()V

    iget-object v3, p0, Lcom/join/mgps/activity/ModGameIndexActivity$e;->e:Lcom/join/mgps/activity/ModGameIndexActivity;

    iget-object v3, v3, Lcom/join/mgps/activity/ModGameIndexActivity;->I:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v2

    iget-object v3, p0, Lcom/join/mgps/activity/ModGameIndexActivity$e;->d:Lcom/join/mgps/dto/DomainInfoBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/DomainInfoBean;->getIs_join()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/papa/sim/statistic/Ext;->setIsJoin(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v2

    iget-object v3, p0, Lcom/join/mgps/activity/ModGameIndexActivity$e;->d:Lcom/join/mgps/dto/DomainInfoBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/DomainInfoBean;->getAb_test_number()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/papa/sim/statistic/Ext;->setTestAbNumber(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    return-void
.end method
