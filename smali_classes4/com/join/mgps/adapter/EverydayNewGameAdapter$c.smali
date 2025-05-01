.class Lcom/join/mgps/adapter/EverydayNewGameAdapter$c;
.super Ljava/lang/Object;
.source "EverydayNewGameAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/EverydayNewGameAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field private final b:Ljava/lang/Object;

.field final synthetic c:Lcom/join/mgps/adapter/EverydayNewGameAdapter;


# direct methods
.method public constructor <init>(Lcom/join/mgps/adapter/EverydayNewGameAdapter;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/EverydayNewGameAdapter$c;->c:Lcom/join/mgps/adapter/EverydayNewGameAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lcom/join/mgps/adapter/EverydayNewGameAdapter$c;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 14

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/adapter/EverydayNewGameAdapter$c;->b:Ljava/lang/Object;

    instance-of v1, v0, Lcom/join/mgps/business/CollectionBeanSubBusiness;

    const-string v2, ""

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    .line 3
    check-cast v0, Lcom/join/mgps/business/CollectionBeanSubBusiness;

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/business/CollectionBeanSubBusiness;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v1

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getVer()Ljava/lang/String;

    move-result-object v4

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getVer_name()Ljava/lang/String;

    .line 7
    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getPackage_name()Ljava/lang/String;

    move-result-object v5

    .line 8
    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getDown_url_remote()Ljava/lang/String;

    move-result-object v6

    .line 9
    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getTp_down_url()Ljava/util/List;

    move-result-object v7

    .line 10
    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getOther_down_switch()I

    move-result v8

    .line 11
    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getCdn_down_switch()I

    move-result v9

    .line 12
    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getTag_info()Ljava/util/ArrayList;

    move-result-object v10

    .line 13
    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getPlugin_num()Ljava/lang/String;

    move-result-object v11

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v13, Lcom/join/mgps/enums/ConstantIntEnum;->H5:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v13}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v11, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    .line 14
    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v11

    if-eqz v11, :cond_0

    .line 15
    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v11

    invoke-virtual {v11}, Lcom/join/mgps/dto/PayTagInfo;->getPay_game_amount()I

    move-result v11

    move v12, v11

    goto :goto_0

    :cond_0
    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_0
    if-lez v11, :cond_4

    .line 16
    invoke-static {}, Lb2/e0;->o()Lb2/e0;

    move-result-object v11

    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Lb2/e0;->p(Ljava/lang/String;)Z

    goto/16 :goto_2

    .line 17
    :cond_1
    instance-of v1, v0, Lcom/join/mgps/business/RecomDatabeanBusiness;

    if-eqz v1, :cond_1d

    .line 18
    check-cast v0, Lcom/join/mgps/business/RecomDatabeanBusiness;

    .line 19
    invoke-virtual {v0}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/AppBeanMain;

    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v1

    .line 20
    invoke-virtual {v0}, Lcom/join/mgps/business/RecomDatabeanBusiness;->a()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    .line 21
    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBean;->getVer()Ljava/lang/String;

    move-result-object v4

    .line 22
    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBean;->getVer_name()Ljava/lang/String;

    .line 23
    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBean;->getPackageName()Ljava/lang/String;

    move-result-object v5

    .line 24
    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBean;->getDown_url_remote()Ljava/lang/String;

    move-result-object v6

    .line 25
    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBean;->getTp_down_url()Ljava/util/List;

    move-result-object v7

    .line 26
    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBean;->getOther_down_switch()I

    move-result v8

    .line 27
    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBean;->getCdn_down_switch()I

    move-result v9

    .line 28
    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBean;->getTag_info()Ljava/util/ArrayList;

    move-result-object v10

    .line 29
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v12, Lcom/join/mgps/enums/ConstantIntEnum;->H5:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v12}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBean;->getPlugin_num()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v2, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    .line 30
    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v11

    if-eqz v11, :cond_2

    .line 31
    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v11

    invoke-virtual {v11}, Lcom/join/mgps/dto/PayTagInfo;->getPay_game_amount()I

    move-result v11

    move v12, v11

    goto :goto_1

    :cond_2
    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_1
    if-lez v11, :cond_3

    .line 32
    invoke-static {}, Lb2/e0;->o()Lb2/e0;

    move-result-object v11

    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v11, v1}, Lb2/e0;->p(Ljava/lang/String;)Z

    :cond_3
    move-object v1, v0

    :cond_4
    :goto_2
    if-eqz v2, :cond_5

    .line 33
    new-instance v0, Lcom/join/mgps/Util/IntentDateBean;

    invoke-direct {v0}, Lcom/join/mgps/Util/IntentDateBean;-><init>()V

    const/4 v2, 0x4

    .line 34
    invoke-virtual {v0, v2}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type(I)V

    .line 35
    invoke-virtual {v0, v6}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type_val(Ljava/lang/String;)V

    .line 36
    invoke-static {v1, p1}, Lcom/join/mgps/Util/UtilsMy;->T2(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    .line 37
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    return-void

    :cond_5
    if-nez v1, :cond_c

    .line 38
    invoke-static {v10}, Lcom/join/mgps/Util/UtilsMy;->o0(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 39
    invoke-static {p1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v0

    invoke-virtual {v0, p1, v5}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 40
    invoke-static {p1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v0

    invoke-virtual {v0, p1, v5}, Lcom/join/android/app/common/utils/APKUtils;->l(Landroid/content/Context;Ljava/lang/String;)Lcom/join/android/app/common/utils/APKUtils$a;

    move-result-object v0

    .line 41
    invoke-static {v4}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {v0}, Lcom/join/android/app/common/utils/APKUtils$a;->d()I

    move-result v0

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    if-ge v0, v1, :cond_6

    goto :goto_3

    .line 42
    :cond_6
    invoke-static {p1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    invoke-static {p1, v5}, Lcom/join/android/app/common/utils/APKUtils;->a0(Landroid/content/Context;Ljava/lang/String;)Z

    return-void

    .line 43
    :cond_7
    :goto_3
    iget-object v0, p0, Lcom/join/mgps/adapter/EverydayNewGameAdapter$c;->b:Ljava/lang/Object;

    instance-of v1, v0, Lcom/join/mgps/business/CollectionBeanSubBusiness;

    if-eqz v1, :cond_9

    .line 44
    check-cast v0, Lcom/join/mgps/business/CollectionBeanSubBusiness;

    .line 45
    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v1

    if-nez v1, :cond_8

    .line 46
    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getDownloadtaskDown()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v1

    goto :goto_4

    .line 47
    :cond_8
    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->Y0(Landroid/content/Context;Lcom/join/mgps/dto/CollectionBeanSub;)V

    return-void

    .line 48
    :cond_9
    instance-of v1, v0, Lcom/join/mgps/business/RecomDatabeanBusiness;

    if-eqz v1, :cond_b

    .line 49
    check-cast v0, Lcom/join/mgps/business/RecomDatabeanBusiness;

    .line 50
    invoke-virtual {v0}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/AppBeanMain;

    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v0

    .line 51
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v1

    if-nez v1, :cond_a

    .line 52
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getDownloadtaskDown()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v1

    goto :goto_4

    .line 53
    :cond_a
    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->W0(Landroid/content/Context;Lcom/join/mgps/dto/AppBean;)V

    :cond_b
    return-void

    :cond_c
    :goto_4
    if-eqz v1, :cond_d

    .line 54
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    goto :goto_5

    :cond_d
    const/4 v0, 0x0

    .line 55
    :goto_5
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-static {v12, v2}, Lcom/join/mgps/Util/UtilsMy;->x0(ILjava/lang/String;)I

    move-result v2

    const/16 v4, 0x2b

    if-lez v2, :cond_e

    const/16 v0, 0x2b

    :cond_e
    const/4 v2, 0x5

    if-eqz v0, :cond_16

    const/16 v5, 0xd

    if-eq v0, v5, :cond_15

    const/4 v5, 0x2

    if-eq v0, v5, :cond_14

    const/4 v5, 0x3

    if-eq v0, v5, :cond_13

    if-eq v0, v2, :cond_12

    const/4 v5, 0x6

    if-eq v0, v5, :cond_13

    const/4 v5, 0x7

    if-eq v0, v5, :cond_16

    const/16 v5, 0x2a

    const-string v6, "\u65e0\u7f51\u7edc\u8fde\u63a5"

    if-eq v0, v5, :cond_10

    if-eq v0, v4, :cond_16

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_6

    .line 56
    :pswitch_0
    invoke-static {v1, p1}, Lcom/join/mgps/Util/UtilsMy;->a4(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto/16 :goto_6

    .line 57
    :pswitch_1
    invoke-static {p1}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_f

    .line 58
    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    invoke-virtual {p1, v6}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void

    .line 59
    :cond_f
    invoke-static {p1, v1}, Lcom/join/mgps/Util/UtilsMy;->I2(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_6

    .line 60
    :cond_10
    invoke-static {p1}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_11

    .line 61
    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    invoke-virtual {p1, v6}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void

    .line 62
    :cond_11
    invoke-static {p1, v1}, Lcom/join/mgps/Util/UtilsMy;->r4(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_6

    .line 63
    :cond_12
    invoke-static {p1, v1}, Lcom/join/mgps/Util/UtilsMy;->T3(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_6

    .line 64
    :cond_13
    invoke-static {v1, p1}, Lcom/php25/PDownload/d;->c(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto :goto_6

    .line 65
    :cond_14
    :pswitch_2
    invoke-static {v1}, Lcom/php25/PDownload/d;->i(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_6

    .line 66
    :cond_15
    invoke-static {p1, v1}, Lcom/php25/PDownload/d;->l(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_6

    .line 67
    :cond_16
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    invoke-static {v12, v0}, Lcom/join/mgps/Util/UtilsMy;->x0(ILjava/lang/String;)I

    move-result v0

    if-lez v0, :cond_17

    .line 68
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->d4(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_6

    .line 69
    :cond_17
    iget-object v0, p0, Lcom/join/mgps/adapter/EverydayNewGameAdapter$c;->b:Ljava/lang/Object;

    instance-of v4, v0, Lcom/join/mgps/business/CollectionBeanSubBusiness;

    if-eqz v4, :cond_1a

    .line 70
    check-cast v0, Lcom/join/mgps/business/CollectionBeanSubBusiness;

    .line 71
    invoke-static {v1, v0}, Lcom/join/mgps/Util/UtilsMy;->y1(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/CollectionBeanSub;)V

    .line 72
    invoke-static {p1, v1}, Lcom/join/mgps/Util/UtilsMy;->o1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v3

    if-eqz v3, :cond_18

    goto :goto_6

    .line 73
    :cond_18
    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getDown_status()I

    move-result v0

    if-ne v0, v2, :cond_19

    .line 74
    invoke-static {p1, v1}, Lcom/join/mgps/Util/UtilsMy;->l1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_6

    .line 75
    :cond_19
    invoke-static {p1, v1, v7, v8, v9}, Lcom/join/mgps/Util/UtilsMy;->R0(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/util/List;II)V

    goto :goto_6

    .line 76
    :cond_1a
    instance-of v4, v0, Lcom/join/mgps/business/RecomDatabeanBusiness;

    if-eqz v4, :cond_1d

    .line 77
    check-cast v0, Lcom/join/mgps/business/RecomDatabeanBusiness;

    .line 78
    invoke-virtual {v0}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/AppBeanMain;

    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v0

    .line 79
    invoke-static {v1, v0}, Lcom/join/mgps/Util/UtilsMy;->x1(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/AppBean;)V

    .line 80
    invoke-static {p1, v1}, Lcom/join/mgps/Util/UtilsMy;->o1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v3

    if-eqz v3, :cond_1b

    goto :goto_6

    .line 81
    :cond_1b
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBean;->getDown_status()I

    move-result v0

    if-ne v0, v2, :cond_1c

    .line 82
    invoke-static {p1, v1}, Lcom/join/mgps/Util/UtilsMy;->l1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_6

    .line 83
    :cond_1c
    invoke-static {p1, v1, v7, v8, v9}, Lcom/join/mgps/Util/UtilsMy;->R0(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/util/List;II)V

    :cond_1d
    :goto_6
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method
