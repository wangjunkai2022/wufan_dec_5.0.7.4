.class Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment$e;
.super Ljava/lang/Object;
.source "PaPaStandAloneV2Fragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment$e;->b:Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/AppBean;

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/AppBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/AppBean;->getPlugin_num()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/join/mgps/enums/ConstantIntEnum;->H5:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v3}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 4
    new-instance v1, Lcom/join/mgps/Util/IntentDateBean;

    invoke-direct {v1}, Lcom/join/mgps/Util/IntentDateBean;-><init>()V

    const/4 v2, 0x4

    .line 5
    invoke-virtual {v1, v2}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type(I)V

    .line 6
    invoke-virtual {p1}, Lcom/join/mgps/dto/AppBean;->getDown_url_remote()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type_val(Ljava/lang/String;)V

    if-nez v0, :cond_1

    .line 7
    invoke-virtual {p1}, Lcom/join/mgps/dto/AppBean;->getDownloadtaskDown()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    .line 8
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment$e;->b:Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;

    invoke-static {p1}, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;->W(Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;)Landroid/app/Activity;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/join/mgps/Util/UtilsMy;->T2(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    .line 9
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment$e;->b:Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;->W(Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p1, v0, v1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    return-void

    :cond_2
    if-nez v0, :cond_6

    .line 10
    invoke-virtual {p1}, Lcom/join/mgps/dto/AppBean;->getTag_info()Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->o0(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 11
    iget-object v0, p0, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment$e;->b:Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;->W(Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment$e;->b:Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;

    invoke-static {v1}, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;->W(Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;)Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {p1}, Lcom/join/mgps/dto/AppBean;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 12
    iget-object v0, p0, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment$e;->b:Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;->W(Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment$e;->b:Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;

    invoke-static {v1}, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;->W(Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;)Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {p1}, Lcom/join/mgps/dto/AppBean;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/join/android/app/common/utils/APKUtils;->l(Landroid/content/Context;Ljava/lang/String;)Lcom/join/android/app/common/utils/APKUtils$a;

    move-result-object v0

    .line 13
    invoke-virtual {p1}, Lcom/join/mgps/dto/AppBean;->getVer()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Lcom/join/android/app/common/utils/APKUtils$a;->d()I

    move-result v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/AppBean;->getVer()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    if-ge v0, v1, :cond_3

    goto :goto_0

    .line 14
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment$e;->b:Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;->W(Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    iget-object v0, p0, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment$e;->b:Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;->W(Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/AppBean;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/join/android/app/common/utils/APKUtils;->a0(Landroid/content/Context;Ljava/lang/String;)Z

    return-void

    .line 15
    :cond_4
    :goto_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/AppBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->y0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_5

    .line 16
    iget-object v0, p0, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment$e;->b:Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;->W(Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/join/mgps/Util/UtilsMy;->d4(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_1

    .line 17
    :cond_5
    iget-object v0, p0, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment$e;->b:Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;->W(Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/join/mgps/Util/UtilsMy;->W0(Landroid/content/Context;Lcom/join/mgps/dto/AppBean;)V

    :goto_1
    return-void

    :cond_6
    const/4 v1, 0x0

    if-eqz v0, :cond_7

    .line 18
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v1

    .line 19
    :cond_7
    invoke-virtual {p1}, Lcom/join/mgps/dto/AppBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v2

    invoke-virtual {p1}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v2

    const/16 v3, 0x2b

    if-lez v2, :cond_8

    const/16 v1, 0x2b

    :cond_8
    const/4 v2, 0x5

    if-eqz v1, :cond_10

    const/16 v4, 0xd

    if-eq v1, v4, :cond_f

    const/4 v4, 0x2

    if-eq v1, v4, :cond_e

    const/4 v4, 0x3

    if-eq v1, v4, :cond_d

    if-eq v1, v2, :cond_c

    const/4 v4, 0x6

    if-eq v1, v4, :cond_d

    const/4 v4, 0x7

    if-eq v1, v4, :cond_10

    const/16 v4, 0x2a

    const-string/jumbo v5, "\u65e0\u7f51\u7edc\u8fde\u63a5"

    if-eq v1, v4, :cond_a

    if-eq v1, v3, :cond_10

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_2

    .line 20
    :pswitch_0
    iget-object p1, p0, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment$e;->b:Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;

    invoke-static {p1}, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;->W(Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;)Landroid/app/Activity;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/join/mgps/Util/UtilsMy;->a4(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto/16 :goto_2

    .line 21
    :pswitch_1
    iget-object p1, p0, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment$e;->b:Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;

    invoke-static {p1}, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;->W(Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;)Landroid/app/Activity;

    move-result-object p1

    invoke-static {p1}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_9

    .line 22
    iget-object p1, p0, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment$e;->b:Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;

    invoke-virtual {p1, v5}, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;->showToast(Ljava/lang/String;)V

    return-void

    .line 23
    :cond_9
    iget-object p1, p0, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment$e;->b:Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;

    invoke-static {p1}, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;->W(Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;)Landroid/app/Activity;

    move-result-object p1

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->I2(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_2

    .line 24
    :cond_a
    iget-object p1, p0, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment$e;->b:Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;

    invoke-static {p1}, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;->W(Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;)Landroid/app/Activity;

    move-result-object p1

    invoke-static {p1}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_b

    .line 25
    iget-object p1, p0, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment$e;->b:Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;

    invoke-virtual {p1, v5}, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;->showToast(Ljava/lang/String;)V

    return-void

    .line 26
    :cond_b
    iget-object p1, p0, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment$e;->b:Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->r4(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    .line 27
    :cond_c
    iget-object p1, p0, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment$e;->b:Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;

    invoke-static {p1}, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;->W(Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;)Landroid/app/Activity;

    move-result-object p1

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->T3(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    .line 28
    :cond_d
    iget-object p1, p0, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment$e;->b:Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;

    invoke-static {p1}, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;->W(Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;)Landroid/app/Activity;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/php25/PDownload/d;->c(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto :goto_2

    .line 29
    :cond_e
    :pswitch_2
    invoke-static {v0}, Lcom/php25/PDownload/d;->i(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    .line 30
    :cond_f
    iget-object p1, p0, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment$e;->b:Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;

    invoke-static {p1}, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;->W(Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;)Landroid/app/Activity;

    move-result-object p1

    invoke-static {p1, v0}, Lcom/php25/PDownload/d;->l(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    .line 31
    :cond_10
    invoke-virtual {p1}, Lcom/join/mgps/dto/AppBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v1

    invoke-virtual {p1}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/join/mgps/Util/UtilsMy;->y0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v1

    if-lez v1, :cond_11

    .line 32
    iget-object v0, p0, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment$e;->b:Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;->W(Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/join/mgps/Util/UtilsMy;->d4(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_2

    .line 33
    :cond_11
    invoke-virtual {p1}, Lcom/join/mgps/dto/AppBean;->getDown_status()I

    move-result v1

    if-ne v1, v2, :cond_12

    .line 34
    iget-object p1, p0, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment$e;->b:Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;

    invoke-static {p1}, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;->W(Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;)Landroid/app/Activity;

    move-result-object p1

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->l1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    .line 35
    :cond_12
    iget-object v1, p0, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment$e;->b:Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;

    invoke-static {v1}, Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;->W(Lcom/join/mgps/fragment/PaPaStandAloneV2Fragment;)Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {p1}, Lcom/join/mgps/dto/AppBean;->getTp_down_url()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p1}, Lcom/join/mgps/dto/AppBean;->getOther_down_switch()I

    move-result v3

    invoke-virtual {p1}, Lcom/join/mgps/dto/AppBean;->getCdn_down_switch()I

    move-result p1

    invoke-static {v1, v0, v2, v3, p1}, Lcom/join/mgps/Util/UtilsMy;->R0(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/util/List;II)V

    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method
