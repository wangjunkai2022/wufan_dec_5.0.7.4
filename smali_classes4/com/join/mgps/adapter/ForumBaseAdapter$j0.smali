.class Lcom/join/mgps/adapter/ForumBaseAdapter$j0;
.super Ljava/lang/Object;
.source "ForumBaseAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/ForumBaseAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "j0"
.end annotation


# instance fields
.field private final b:Ljava/lang/Object;

.field final synthetic c:Lcom/join/mgps/adapter/ForumBaseAdapter;


# direct methods
.method public constructor <init>(Lcom/join/mgps/adapter/ForumBaseAdapter;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$j0;->c:Lcom/join/mgps/adapter/ForumBaseAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$j0;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$j0;->b:Ljava/lang/Object;

    check-cast v0, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v0, :cond_15

    .line 3
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getVer()Ljava/lang/String;

    .line 4
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getVer_name()Ljava/lang/String;

    .line 5
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    .line 6
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTipBeans()Ljava/util/ArrayList;

    .line 7
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSource_down_url()Ljava/lang/String;

    .line 8
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTp_down_url()Ljava/util/List;

    move-result-object v1

    .line 9
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getOther_down_switch()I

    move-result v2

    .line 10
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCdn_down_switch()I

    move-result v3

    .line 11
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPay_game_amount()I

    move-result v4

    .line 12
    iget-object v5, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$j0;->b:Ljava/lang/Object;

    instance-of v6, v5, Lcom/join/mgps/business/CollectionBeanSubBusiness;

    const/4 v7, 0x0

    if-eqz v6, :cond_1

    .line 13
    check-cast v5, Lcom/join/mgps/business/CollectionBeanSubBusiness;

    .line 14
    invoke-virtual {v5}, Lcom/join/mgps/business/CollectionBeanSubBusiness;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    .line 15
    invoke-virtual {v5}, Lcom/join/mgps/dto/CollectionBeanSub;->getVer()Ljava/lang/String;

    .line 16
    invoke-virtual {v5}, Lcom/join/mgps/dto/CollectionBeanSub;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v6

    if-eqz v6, :cond_0

    .line 17
    invoke-virtual {v5}, Lcom/join/mgps/dto/CollectionBeanSub;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/PayTagInfo;->getPay_game_amount()I

    move-result v4

    move v6, v4

    goto :goto_0

    :cond_0
    move v6, v4

    const/4 v4, 0x0

    :goto_0
    if-lez v4, :cond_3

    .line 18
    invoke-static {}, Lb2/e0;->o()Lb2/e0;

    move-result-object v4

    invoke-virtual {v5}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lb2/e0;->p(Ljava/lang/String;)Z

    goto :goto_2

    .line 19
    :cond_1
    instance-of v6, v5, Lcom/join/mgps/business/RecomDatabeanBusiness;

    if-eqz v6, :cond_4

    .line 20
    check-cast v5, Lcom/join/mgps/business/RecomDatabeanBusiness;

    .line 21
    invoke-virtual {v5}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/dto/AppBeanMain;

    invoke-virtual {v5}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v5

    .line 22
    invoke-virtual {v5}, Lcom/join/mgps/dto/AppBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v6

    if-eqz v6, :cond_2

    .line 23
    invoke-virtual {v5}, Lcom/join/mgps/dto/AppBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/PayTagInfo;->getPay_game_amount()I

    move-result v4

    move v6, v4

    goto :goto_1

    :cond_2
    move v6, v4

    const/4 v4, 0x0

    :goto_1
    if-lez v4, :cond_3

    .line 24
    invoke-static {}, Lb2/e0;->o()Lb2/e0;

    move-result-object v4

    invoke-virtual {v5}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lb2/e0;->p(Ljava/lang/String;)Z

    :cond_3
    :goto_2
    move v4, v6

    .line 25
    :cond_4
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v8, Lcom/join/mgps/enums/ConstantIntEnum;->H5:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v8}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, ""

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 26
    new-instance v1, Lcom/join/mgps/Util/IntentDateBean;

    invoke-direct {v1}, Lcom/join/mgps/Util/IntentDateBean;-><init>()V

    const/4 v2, 0x4

    .line 27
    invoke-virtual {v1, v2}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type(I)V

    .line 28
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type_val(Ljava/lang/String;)V

    .line 29
    invoke-static {v0, p1}, Lcom/join/mgps/Util/UtilsMy;->T2(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    .line 30
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {v0, p1, v1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    return-void

    .line 31
    :cond_5
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v5

    .line 32
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lcom/join/mgps/Util/UtilsMy;->x0(ILjava/lang/String;)I

    move-result v6

    const/16 v8, 0x2b

    if-lez v6, :cond_6

    const/16 v5, 0x2b

    :cond_6
    const/4 v6, 0x5

    if-eqz v5, :cond_e

    const/16 v9, 0xd

    if-eq v5, v9, :cond_d

    const/4 v9, 0x2

    if-eq v5, v9, :cond_c

    const/4 v9, 0x3

    if-eq v5, v9, :cond_b

    if-eq v5, v6, :cond_a

    const/4 v9, 0x6

    if-eq v5, v9, :cond_b

    const/4 v9, 0x7

    if-eq v5, v9, :cond_e

    const/16 v9, 0x2a

    const-string v10, "\u65e0\u7f51\u7edc\u8fde\u63a5"

    if-eq v5, v9, :cond_8

    if-eq v5, v8, :cond_e

    packed-switch v5, :pswitch_data_0

    goto/16 :goto_3

    .line 33
    :pswitch_0
    invoke-static {v0, p1}, Lcom/join/mgps/Util/UtilsMy;->a4(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto/16 :goto_3

    .line 34
    :pswitch_1
    invoke-static {p1}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_7

    .line 35
    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    invoke-virtual {p1, v10}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void

    .line 36
    :cond_7
    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->I2(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_3

    .line 37
    :cond_8
    invoke-static {p1}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_9

    .line 38
    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    invoke-virtual {p1, v10}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void

    .line 39
    :cond_9
    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->r4(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_3

    .line 40
    :cond_a
    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->T3(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_3

    .line 41
    :cond_b
    invoke-static {v0, p1}, Lcom/php25/PDownload/d;->c(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto :goto_3

    .line 42
    :cond_c
    :pswitch_2
    invoke-static {v0}, Lcom/php25/PDownload/d;->i(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_3

    .line 43
    :cond_d
    invoke-static {p1, v0}, Lcom/php25/PDownload/d;->l(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_3

    .line 44
    :cond_e
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/join/mgps/Util/UtilsMy;->x0(ILjava/lang/String;)I

    move-result v4

    if-lez v4, :cond_f

    .line 45
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->d4(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_3

    .line 46
    :cond_f
    iget-object v4, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$j0;->b:Ljava/lang/Object;

    instance-of v5, v4, Lcom/join/mgps/business/CollectionBeanSubBusiness;

    if-eqz v5, :cond_12

    .line 47
    check-cast v4, Lcom/join/mgps/business/CollectionBeanSubBusiness;

    .line 48
    invoke-static {v0, v4}, Lcom/join/mgps/Util/UtilsMy;->y1(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/CollectionBeanSub;)V

    .line 49
    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->o1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v5

    if-eqz v5, :cond_10

    goto :goto_3

    .line 50
    :cond_10
    invoke-virtual {v4}, Lcom/join/mgps/dto/CollectionBeanSub;->getDown_status()I

    move-result v4

    if-ne v4, v6, :cond_11

    .line 51
    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->l1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_3

    .line 52
    :cond_11
    invoke-static {p1, v0, v1, v2, v3}, Lcom/join/mgps/Util/UtilsMy;->R0(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/util/List;II)V

    goto :goto_3

    .line 53
    :cond_12
    instance-of v5, v4, Lcom/join/mgps/business/RecomDatabeanBusiness;

    if-eqz v5, :cond_15

    .line 54
    check-cast v4, Lcom/join/mgps/business/RecomDatabeanBusiness;

    .line 55
    invoke-virtual {v4}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/AppBeanMain;

    invoke-virtual {v4}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v4

    .line 56
    invoke-static {v0, v4}, Lcom/join/mgps/Util/UtilsMy;->x1(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/AppBean;)V

    .line 57
    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->o1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v5

    if-eqz v5, :cond_13

    goto :goto_3

    .line 58
    :cond_13
    invoke-virtual {v4}, Lcom/join/mgps/dto/AppBean;->getDown_status()I

    move-result v4

    if-ne v4, v6, :cond_14

    .line 59
    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->l1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_3

    .line 60
    :cond_14
    invoke-static {p1, v0, v1, v2, v3}, Lcom/join/mgps/Util/UtilsMy;->R0(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/util/List;II)V

    :cond_15
    :goto_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method
