.class Lcom/join/mgps/activity/MGGameDetailActivity$p;
.super Ljava/lang/Object;
.source "MGGameDetailActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/MGGameDetailActivity;->T1(Lcom/join/mgps/dto/GiftPackageDataInfoBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/MGGameDetailActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/MGGameDetailActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/MGGameDetailActivity$p;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/MGGameDetailActivity$p;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/MGGameDetailActivity;->o0(Lcom/join/mgps/activity/MGGameDetailActivity;)Landroid/app/Dialog;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/join/mgps/activity/MGGameDetailActivity$p;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/MGGameDetailActivity;->o0(Lcom/join/mgps/activity/MGGameDetailActivity;)Landroid/app/Dialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->isShowing()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/MGGameDetailActivity$p;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/MGGameDetailActivity;->o0(Lcom/join/mgps/activity/MGGameDetailActivity;)Landroid/app/Dialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    const/4 p1, 0x0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/MGGameDetailActivity$p;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/MGGameDetailActivity;->p0(Lcom/join/mgps/activity/MGGameDetailActivity;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/join/mgps/activity/MGGameDetailActivity$p;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/MGGameDetailActivity;->p0(Lcom/join/mgps/activity/MGGameDetailActivity;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result p1

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/MGGameDetailActivity$p;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/MGGameDetailActivity;->q0(Lcom/join/mgps/activity/MGGameDetailActivity;)Lcom/join/mgps/dto/DetailResultBeanV3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/DetailResultBeanV3;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/MGGameDetailActivity$p;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    invoke-static {v1}, Lcom/join/mgps/activity/MGGameDetailActivity;->q0(Lcom/join/mgps/activity/MGGameDetailActivity;)Lcom/join/mgps/dto/DetailResultBeanV3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/DetailResultBeanV3;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x2b

    if-lez v0, :cond_2

    const/16 p1, 0x2b

    :cond_2
    const/4 v0, 0x5

    if-eqz p1, :cond_4

    if-eq p1, v0, :cond_3

    const/16 v2, 0x9

    if-eq p1, v2, :cond_4

    if-eq p1, v1, :cond_4

    goto/16 :goto_2

    .line 5
    :cond_3
    iget-object p1, p0, Lcom/join/mgps/activity/MGGameDetailActivity$p;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/MGGameDetailActivity;->k0(Lcom/join/mgps/activity/MGGameDetailActivity;)Landroid/app/Activity;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/MGGameDetailActivity$p;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/MGGameDetailActivity;->p0(Lcom/join/mgps/activity/MGGameDetailActivity;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    const-string v1, "2"

    invoke-static {p1, v0, v1}, Lcom/join/mgps/Util/UtilsMy;->W3(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 6
    :cond_4
    iget-object p1, p0, Lcom/join/mgps/activity/MGGameDetailActivity$p;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/MGGameDetailActivity;->p0(Lcom/join/mgps/activity/MGGameDetailActivity;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    sget-object v1, Lcom/papa/sim/statistic/Where;->detail:Lcom/papa/sim/statistic/Where;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setKeyword(Ljava/lang/String;)V

    .line 7
    iget-object p1, p0, Lcom/join/mgps/activity/MGGameDetailActivity$p;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/MGGameDetailActivity;->p0(Lcom/join/mgps/activity/MGGameDetailActivity;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 8
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/activity/MGGameDetailActivity$p;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    invoke-static {v1}, Lcom/join/mgps/activity/MGGameDetailActivity;->p0(Lcom/join/mgps/activity/MGGameDetailActivity;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v1

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 9
    iget-object v1, p0, Lcom/join/mgps/activity/MGGameDetailActivity$p;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    invoke-static {v1}, Lcom/join/mgps/activity/MGGameDetailActivity;->p0(Lcom/join/mgps/activity/MGGameDetailActivity;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v1

    invoke-static {v1, p1}, Lcom/join/mgps/Util/UtilsMy;->y4(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 10
    :cond_5
    iget-object p1, p0, Lcom/join/mgps/activity/MGGameDetailActivity$p;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/MGGameDetailActivity;->p0(Lcom/join/mgps/activity/MGGameDetailActivity;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/join/mgps/activity/MGGameDetailActivity;->t0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 11
    iget-object p1, p0, Lcom/join/mgps/activity/MGGameDetailActivity$p;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/MGGameDetailActivity;->q0(Lcom/join/mgps/activity/MGGameDetailActivity;)Lcom/join/mgps/dto/DetailResultBeanV3;

    move-result-object p1

    if-eqz p1, :cond_a

    .line 12
    iget-object p1, p0, Lcom/join/mgps/activity/MGGameDetailActivity$p;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/MGGameDetailActivity;->q0(Lcom/join/mgps/activity/MGGameDetailActivity;)Lcom/join/mgps/dto/DetailResultBeanV3;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBeanV3;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/activity/MGGameDetailActivity$p;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    invoke-static {v1}, Lcom/join/mgps/activity/MGGameDetailActivity;->q0(Lcom/join/mgps/activity/MGGameDetailActivity;)Lcom/join/mgps/dto/DetailResultBeanV3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/DetailResultBeanV3;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/join/mgps/Util/UtilsMy;->y0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result p1

    if-lez p1, :cond_7

    .line 13
    iget-object p1, p0, Lcom/join/mgps/activity/MGGameDetailActivity$p;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    iget-object p1, p1, Lcom/join/mgps/activity/MGGameDetailActivity;->I:Lcom/join/mgps/dto/ExtBean;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lcom/join/mgps/dto/ExtBean;->getFrom()Ljava/lang/String;

    move-result-object p1

    const-string v0, "checkgame"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 14
    iget-object p1, p0, Lcom/join/mgps/activity/MGGameDetailActivity$p;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/MGGameDetailActivity;->k0(Lcom/join/mgps/activity/MGGameDetailActivity;)Landroid/app/Activity;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/MGGameDetailActivity$p;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/MGGameDetailActivity;->q0(Lcom/join/mgps/activity/MGGameDetailActivity;)Lcom/join/mgps/dto/DetailResultBeanV3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/DetailResultBeanV3;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/MGGameDetailActivity$p;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    iget-object v1, v1, Lcom/join/mgps/activity/MGGameDetailActivity;->I:Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ExtBean;->getFrom_id()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/join/mgps/Util/UtilsMy;->e4(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 15
    :cond_6
    iget-object p1, p0, Lcom/join/mgps/activity/MGGameDetailActivity$p;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/MGGameDetailActivity;->k0(Lcom/join/mgps/activity/MGGameDetailActivity;)Landroid/app/Activity;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/MGGameDetailActivity$p;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/MGGameDetailActivity;->q0(Lcom/join/mgps/activity/MGGameDetailActivity;)Lcom/join/mgps/dto/DetailResultBeanV3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/DetailResultBeanV3;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->d4(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_1

    .line 16
    :cond_7
    iget-object p1, p0, Lcom/join/mgps/activity/MGGameDetailActivity$p;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/MGGameDetailActivity;->p0(Lcom/join/mgps/activity/MGGameDetailActivity;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/activity/MGGameDetailActivity$p;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    invoke-static {v1}, Lcom/join/mgps/activity/MGGameDetailActivity;->q0(Lcom/join/mgps/activity/MGGameDetailActivity;)Lcom/join/mgps/dto/DetailResultBeanV3;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/join/mgps/Util/UtilsMy;->A1(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/DetailResultBeanV3;)V

    .line 17
    iget-object p1, p0, Lcom/join/mgps/activity/MGGameDetailActivity$p;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/MGGameDetailActivity;->k0(Lcom/join/mgps/activity/MGGameDetailActivity;)Landroid/app/Activity;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/activity/MGGameDetailActivity$p;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    invoke-static {v1}, Lcom/join/mgps/activity/MGGameDetailActivity;->p0(Lcom/join/mgps/activity/MGGameDetailActivity;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/join/mgps/Util/UtilsMy;->o1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result p1

    if-eqz p1, :cond_8

    goto :goto_0

    .line 18
    :cond_8
    iget-object p1, p0, Lcom/join/mgps/activity/MGGameDetailActivity$p;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/MGGameDetailActivity;->q0(Lcom/join/mgps/activity/MGGameDetailActivity;)Lcom/join/mgps/dto/DetailResultBeanV3;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBeanV3;->getDown_status()I

    move-result p1

    if-ne p1, v0, :cond_9

    .line 19
    iget-object p1, p0, Lcom/join/mgps/activity/MGGameDetailActivity$p;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/MGGameDetailActivity;->k0(Lcom/join/mgps/activity/MGGameDetailActivity;)Landroid/app/Activity;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/MGGameDetailActivity$p;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/MGGameDetailActivity;->p0(Lcom/join/mgps/activity/MGGameDetailActivity;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->l1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 20
    :cond_9
    iget-object p1, p0, Lcom/join/mgps/activity/MGGameDetailActivity$p;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/MGGameDetailActivity;->k0(Lcom/join/mgps/activity/MGGameDetailActivity;)Landroid/app/Activity;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/MGGameDetailActivity$p;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/MGGameDetailActivity;->p0(Lcom/join/mgps/activity/MGGameDetailActivity;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/MGGameDetailActivity$p;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    invoke-static {v1}, Lcom/join/mgps/activity/MGGameDetailActivity;->q0(Lcom/join/mgps/activity/MGGameDetailActivity;)Lcom/join/mgps/dto/DetailResultBeanV3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/DetailResultBeanV3;->getTp_down_url()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/MGGameDetailActivity$p;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    invoke-static {v2}, Lcom/join/mgps/activity/MGGameDetailActivity;->q0(Lcom/join/mgps/activity/MGGameDetailActivity;)Lcom/join/mgps/dto/DetailResultBeanV3;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/DetailResultBeanV3;->getOther_down_switch()I

    move-result v2

    iget-object v3, p0, Lcom/join/mgps/activity/MGGameDetailActivity$p;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    invoke-static {v3}, Lcom/join/mgps/activity/MGGameDetailActivity;->q0(Lcom/join/mgps/activity/MGGameDetailActivity;)Lcom/join/mgps/dto/DetailResultBeanV3;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/DetailResultBeanV3;->getCdn_down_switch()I

    move-result v3

    invoke-static {p1, v0, v1, v2, v3}, Lcom/join/mgps/Util/UtilsMy;->R0(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/util/List;II)V

    .line 21
    :goto_0
    iget-object p1, p0, Lcom/join/mgps/activity/MGGameDetailActivity$p;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    invoke-virtual {p1}, Lcom/join/mgps/activity/MGGameDetailActivity;->V0()V

    .line 22
    :cond_a
    :goto_1
    iget-object p1, p0, Lcom/join/mgps/activity/MGGameDetailActivity$p;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/MGGameDetailActivity;->p0(Lcom/join/mgps/activity/MGGameDetailActivity;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    :goto_2
    return-void
.end method
