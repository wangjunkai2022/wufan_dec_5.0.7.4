.class public Lcom/join/mgps/dto/CommonGameInfoBean;
.super Lcom/join/mgps/dto/DownloadPointBase;
.source "CommonGameInfoBean.java"

# interfaces
.implements Lu1/b;


# instance fields
.field private ad_switch:I

.field private bg_color:Ljava/lang/String;

.field private big_pic:Ljava/lang/String;

.field private description:Ljava/lang/String;

.field private downloadTask:Lcom/github/snowdream/android/app/downloader/DownloadTask;

.field private exp_position:Ljava/lang/String;

.field private g_info:Lcom/join/mgps/dto/GInfoBean;

.field private h_ad_pic:Ljava/lang/String;

.field private h_ad_video_url:Ljava/lang/String;

.field private hasExposure:Z

.field private isAdInfo:Z

.field private isPrivateDomain:Z

.field private isRecommend:Z

.field private is_head:Z

.field private jp_info:Lcom/join/mgps/dto/JpInfoBean;

.field private keyword:Ljava/lang/String;

.field private label:Ljava/lang/String;

.field private main_title:Ljava/lang/String;

.field private pd_info:Lcom/join/mgps/dto/DomainInfoBean;

.field private position:I

.field private quit_switch:I

.field private requestStatus:I

.field private statistics:Lcom/join/mgps/dto/StatisticsBean;

.field private sub_title:Ljava/lang/String;

.field private title:Ljava/lang/String;

.field private tpl_type:I

.field private v_ad_pic:Ljava/lang/String;

.field private v_ad_video_url:Ljava/lang/String;

.field private v_url:Ljava/lang/String;

.field protected viewType:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/dto/DownloadPointBase;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->requestStatus:I

    .line 3
    iput-boolean v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->isAdInfo:Z

    .line 4
    iput-boolean v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->is_head:Z

    .line 5
    iput-boolean v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->isPrivateDomain:Z

    return-void
.end method


# virtual methods
.method public getAd_switch()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->ad_switch:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getBg_color()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->bg_color:Ljava/lang/String;

    return-object v0
.end method

.method public getBig_pic()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->big_pic:Ljava/lang/String;

    return-object v0
.end method

.method public getCoverPicUrl()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/dto/CommonGameInfoBean;->isGame()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/dto/CommonGameInfoBean;->getV_url()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/dto/CommonGameInfoBean;->getBig_pic()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {p0}, Lcom/join/mgps/dto/CommonGameInfoBean;->getBig_pic()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 6
    :cond_0
    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getPic_info()Ljava/util/List;

    move-result-object v0

    const-string v1, ""

    .line 7
    invoke-static {v1}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    const/4 v1, 0x0

    .line 8
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 9
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/dto/CommonGameInfoBean;->getBig_pic()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->downloadTask:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    return-object v0
.end method

.method public getExp_position()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->exp_position:Ljava/lang/String;

    return-object v0
.end method

.method public getG_info()Lcom/join/mgps/dto/GInfoBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->g_info:Lcom/join/mgps/dto/GInfoBean;

    return-object v0
.end method

.method public getH_ad_pic()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->h_ad_pic:Ljava/lang/String;

    return-object v0
.end method

.method public getH_ad_video_url()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->h_ad_video_url:Ljava/lang/String;

    return-object v0
.end method

.method public getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;
    .locals 6

    .line 1
    new-instance v0, Lcom/join/mgps/Util/IntentDateBean;

    invoke-direct {v0}, Lcom/join/mgps/Util/IntentDateBean;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->g_info:Lcom/join/mgps/dto/GInfoBean;

    if-eqz v1, :cond_0

    .line 3
    new-instance v1, Lcom/join/mgps/Util/IntentToDetialBean;

    invoke-direct {v1}, Lcom/join/mgps/Util/IntentToDetialBean;-><init>()V

    .line 4
    iget-object v2, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->g_info:Lcom/join/mgps/dto/GInfoBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/Util/IntentToDetialBean;->f(Ljava/lang/String;)V

    .line 5
    iget-object v2, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->g_info:Lcom/join/mgps/dto/GInfoBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/GInfoBean;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/Util/IntentToDetialBean;->g(Ljava/lang/String;)V

    .line 6
    iget-object v2, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->g_info:Lcom/join/mgps/dto/GInfoBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/GInfoBean;->getIco()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/Util/IntentToDetialBean;->i(Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 7
    invoke-virtual {v1, v2}, Lcom/join/mgps/Util/IntentToDetialBean;->h(I)V

    .line 8
    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setObject(Ljava/lang/Object;)V

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/dto/DownloadPointBase;->getExt1()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setExt1(Ljava/lang/String;)V

    .line 10
    invoke-virtual {p0}, Lcom/join/mgps/dto/DownloadPointBase;->getExt2()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setExt2(Ljava/lang/String;)V

    .line 11
    invoke-virtual {p0}, Lcom/join/mgps/dto/DownloadPointBase;->getExt3()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setExt3(Ljava/lang/String;)V

    .line 12
    invoke-virtual {p0}, Lcom/join/mgps/dto/DownloadPointBase;->getExt4()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setExt4(Ljava/lang/String;)V

    .line 13
    iget-object v1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->jp_info:Lcom/join/mgps/dto/JpInfoBean;

    if-eqz v1, :cond_1

    .line 14
    invoke-virtual {v1}, Lcom/join/mgps/dto/JpInfoBean;->getJump_type()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setJump_type(I)V

    .line 15
    iget-object v1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->jp_info:Lcom/join/mgps/dto/JpInfoBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/JpInfoBean;->getLink_type()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type(I)V

    .line 16
    iget-object v1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->jp_info:Lcom/join/mgps/dto/JpInfoBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/JpInfoBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type_val(Ljava/lang/String;)V

    .line 17
    iget-object v1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->jp_info:Lcom/join/mgps/dto/JpInfoBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/JpInfoBean;->getTpl_type()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setTpl_type(Ljava/lang/String;)V

    .line 18
    iget-object v1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->jp_info:Lcom/join/mgps/dto/JpInfoBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/JpInfoBean;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setCrc_link_type_val(Ljava/lang/String;)V

    .line 19
    :cond_1
    invoke-virtual {v0}, Lcom/join/mgps/Util/IntentDateBean;->getExtBean()Lcom/join/mgps/dto/ExtBean;

    move-result-object v1

    const/4 v2, 0x0

    const-string v3, ""

    if-nez v1, :cond_5

    .line 20
    new-instance v1, Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {p0}, Lcom/join/mgps/dto/DownloadPointBase;->get_from_type()I

    move-result v4

    invoke-direct {v1, v4}, Lcom/join/mgps/dto/ExtBean;-><init>(I)V

    invoke-virtual {p0}, Lcom/join/mgps/dto/DownloadPointBase;->getRecPosition()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/join/mgps/dto/ExtBean;->setRecPosition(Ljava/lang/String;)Lcom/join/mgps/dto/ExtBean;

    move-result-object v1

    invoke-virtual {p0}, Lcom/join/mgps/dto/DownloadPointBase;->getReMarks()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/join/mgps/dto/ExtBean;->setReMarks(Ljava/lang/String;)Lcom/join/mgps/dto/ExtBean;

    move-result-object v1

    iget-object v4, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->g_info:Lcom/join/mgps/dto/GInfoBean;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lcom/join/mgps/dto/GInfoBean;->getPosition_path()Lcom/psk/eventmodule/StatFactory$VolcanoOther;

    move-result-object v4

    if-eqz v4, :cond_2

    iget-object v4, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->g_info:Lcom/join/mgps/dto/GInfoBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/GInfoBean;->getPosition_path()Lcom/psk/eventmodule/StatFactory$VolcanoOther;

    move-result-object v4

    invoke-static {v4}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_2
    move-object v4, v3

    :goto_0
    invoke-virtual {v1, v4}, Lcom/join/mgps/dto/ExtBean;->setVolcanoOther(Ljava/lang/String;)Lcom/join/mgps/dto/ExtBean;

    move-result-object v1

    iget-object v4, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->g_info:Lcom/join/mgps/dto/GInfoBean;

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lcom/join/mgps/dto/GInfoBean;->getTag_info()Ljava/util/List;

    move-result-object v2

    :cond_3
    invoke-static {v2}, Lcom/join/mgps/Util/UtilsMy;->k2(Ljava/util/List;)Z

    move-result v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/ExtBean;->setOnlineGame(Z)Lcom/join/mgps/dto/ExtBean;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->statistics:Lcom/join/mgps/dto/StatisticsBean;

    if-nez v2, :cond_4

    goto :goto_1

    :cond_4
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->statistics:Lcom/join/mgps/dto/StatisticsBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/StatisticsBean;->getMin_game_search_source()Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_1
    invoke-virtual {v1, v3}, Lcom/join/mgps/dto/ExtBean;->setDataFlag(Ljava/lang/String;)Lcom/join/mgps/dto/ExtBean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setExtBean(Lcom/join/mgps/dto/ExtBean;)V

    goto :goto_4

    .line 21
    :cond_5
    invoke-virtual {v0}, Lcom/join/mgps/Util/IntentDateBean;->getExtBean()Lcom/join/mgps/dto/ExtBean;

    move-result-object v1

    invoke-virtual {p0}, Lcom/join/mgps/dto/DownloadPointBase;->get_from()I

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/join/mgps/dto/ExtBean;->setFrom(Ljava/lang/String;)V

    .line 22
    invoke-virtual {v0}, Lcom/join/mgps/Util/IntentDateBean;->getExtBean()Lcom/join/mgps/dto/ExtBean;

    move-result-object v1

    invoke-virtual {p0}, Lcom/join/mgps/dto/DownloadPointBase;->get_from_type()I

    move-result v4

    invoke-virtual {v1, v4}, Lcom/join/mgps/dto/ExtBean;->set_from_type(I)Lcom/join/mgps/dto/ExtBean;

    .line 23
    invoke-virtual {v0}, Lcom/join/mgps/Util/IntentDateBean;->getExtBean()Lcom/join/mgps/dto/ExtBean;

    move-result-object v1

    iget-object v4, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->statistics:Lcom/join/mgps/dto/StatisticsBean;

    if-nez v4, :cond_6

    goto :goto_2

    :cond_6
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->statistics:Lcom/join/mgps/dto/StatisticsBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/StatisticsBean;->getMin_game_search_source()Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_2
    invoke-virtual {v1, v3}, Lcom/join/mgps/dto/ExtBean;->setDataFlag(Ljava/lang/String;)Lcom/join/mgps/dto/ExtBean;

    .line 24
    invoke-virtual {v0}, Lcom/join/mgps/Util/IntentDateBean;->getExtBean()Lcom/join/mgps/dto/ExtBean;

    move-result-object v1

    iget-object v3, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->g_info:Lcom/join/mgps/dto/GInfoBean;

    if-eqz v3, :cond_8

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getPosition_path()Lcom/psk/eventmodule/StatFactory$VolcanoOther;

    move-result-object v3

    if-nez v3, :cond_7

    goto :goto_3

    :cond_7
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v2

    iget-object v3, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->g_info:Lcom/join/mgps/dto/GInfoBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getPosition_path()Lcom/psk/eventmodule/StatFactory$VolcanoOther;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/android/app/common/utils/JsonMapper;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    :cond_8
    :goto_3
    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/ExtBean;->setVolcanoOther(Ljava/lang/String;)Lcom/join/mgps/dto/ExtBean;

    .line 25
    :goto_4
    invoke-virtual {v0}, Lcom/join/mgps/Util/IntentDateBean;->getExtBean()Lcom/join/mgps/dto/ExtBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/ExtBean;->getDataFlag()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-virtual {p0}, Lcom/join/mgps/dto/DownloadPointBase;->getExt()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_9

    .line 26
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v1

    invoke-virtual {p0}, Lcom/join/mgps/dto/DownloadPointBase;->getExt()Ljava/lang/String;

    move-result-object v2

    const-class v3, Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {v1, v2, v3}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/ExtBean;

    if-eqz v1, :cond_9

    .line 27
    invoke-virtual {v1}, Lcom/join/mgps/dto/ExtBean;->getDataFlag()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_9

    .line 28
    invoke-virtual {v0}, Lcom/join/mgps/Util/IntentDateBean;->getExtBean()Lcom/join/mgps/dto/ExtBean;

    move-result-object v2

    invoke-virtual {v1}, Lcom/join/mgps/dto/ExtBean;->getDataFlag()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/join/mgps/dto/ExtBean;->setDataFlag(Ljava/lang/String;)Lcom/join/mgps/dto/ExtBean;

    :cond_9
    return-object v0
.end method

.method public getIntentDataBeanWithFromType(I)Lcom/join/mgps/Util/IntentDateBean;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    .line 2
    invoke-virtual {p0, p1}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/dto/CommonGameInfoBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p1

    return-object p1
.end method

.method public getItemType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->viewType:I

    return v0
.end method

.method public getJp_info()Lcom/join/mgps/dto/JpInfoBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->jp_info:Lcom/join/mgps/dto/JpInfoBean;

    return-object v0
.end method

.method public getKeyword()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->keyword:Ljava/lang/String;

    return-object v0
.end method

.method public getLabel()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->label:Ljava/lang/String;

    return-object v0
.end method

.method public getMain_title()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->main_title:Ljava/lang/String;

    return-object v0
.end method

.method public getOnlineGAmeAdPic()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->v_ad_pic:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->v_ad_pic:Ljava/lang/String;

    return-object v0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->h_ad_pic:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->h_ad_pic:Ljava/lang/String;

    return-object v0

    .line 3
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->big_pic:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->big_pic:Ljava/lang/String;

    return-object v0

    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public getOnlineGameAdVideoUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->v_ad_video_url:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->v_ad_video_url:Ljava/lang/String;

    return-object v0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->h_ad_video_url:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->h_ad_video_url:Ljava/lang/String;

    return-object v0

    .line 3
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->v_url:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->v_url:Ljava/lang/String;

    return-object v0

    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public getPd_info()Lcom/join/mgps/dto/DomainInfoBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->pd_info:Lcom/join/mgps/dto/DomainInfoBean;

    return-object v0
.end method

.method public getPosition()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->position:I

    return v0
.end method

.method public getQuit_switch()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->quit_switch:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getRequestStatus()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->requestStatus:I

    return v0
.end method

.method public getShowName()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/dto/CommonGameInfoBean;->isGame()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 5
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/dto/CommonGameInfoBean;->getTitle()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getShowScore()Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/dto/CommonGameInfoBean;->isGame()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getScore()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmpl-double v5, v1, v3

    if-nez v5, :cond_0

    const-string v0, "0"

    return-object v0

    .line 4
    :cond_0
    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getScore()Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const-string v0, "5.0"

    return-object v0
.end method

.method public getStatistics()Lcom/join/mgps/dto/StatisticsBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->statistics:Lcom/join/mgps/dto/StatisticsBean;

    return-object v0
.end method

.method public getSub_title()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->sub_title:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->title:Ljava/lang/String;

    return-object v0
.end method

.method public getTpl_type()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->tpl_type:I

    return v0
.end method

.method public getV_ad_pic()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->v_ad_pic:Ljava/lang/String;

    return-object v0
.end method

.method public getV_ad_video_url()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->v_ad_video_url:Ljava/lang/String;

    return-object v0
.end method

.method public getV_url()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->v_url:Ljava/lang/String;

    return-object v0
.end method

.method public getViewType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->viewType:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Object;

    .line 1
    iget-object v1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->title:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->sub_title:Ljava/lang/String;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->big_pic:Ljava/lang/String;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->v_url:Ljava/lang/String;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->g_info:Lcom/join/mgps/dto/GInfoBean;

    if-nez v1, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v1

    :goto_0
    const/4 v2, 0x4

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public is64Bit()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->g_info:Lcom/join/mgps/dto/GInfoBean;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getArm64()I

    move-result v0

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public isAdInfo()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->isAdInfo:Z

    return v0
.end method

.method public isBtGame()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->g_info:Lcom/join/mgps/dto/GInfoBean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->isBtGame()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isGame()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->jp_info:Lcom/join/mgps/dto/JpInfoBean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dto/JpInfoBean;->isGame()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isGameVm()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/dto/CommonGameInfoBean;->isModGameVm()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/join/mgps/dto/CommonGameInfoBean;->isSingleGameVm()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/join/mgps/dto/CommonGameInfoBean;->isNetGameVm()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public isHasExposure()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->hasExposure:Z

    return v0
.end method

.method public isIs_head()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->is_head:Z

    return v0
.end method

.method public isMiniGame()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->g_info:Lcom/join/mgps/dto/GInfoBean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->isMiniGame()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isModGameVm()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->g_info:Lcom/join/mgps/dto/GInfoBean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->isModGameVm()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isNetGameVm()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->g_info:Lcom/join/mgps/dto/GInfoBean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->isNetGameVm()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isPrivateDomain()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->isPrivateDomain:Z

    return v0
.end method

.method public isRecommend()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->isRecommend:Z

    return v0
.end method

.method public isSingleGameVm()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->g_info:Lcom/join/mgps/dto/GInfoBean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->isSingleGameVm()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setAdInfo(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->isAdInfo:Z

    return-void
.end method

.method public setAd_switch(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->ad_switch:I

    return-void
.end method

.method public setAd_switch(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->ad_switch:I

    return-void
.end method

.method public setBg_color(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->bg_color:Ljava/lang/String;

    return-void
.end method

.method public setBig_pic(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->big_pic:Ljava/lang/String;

    return-void
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->description:Ljava/lang/String;

    return-void
.end method

.method public setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->downloadTask:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    return-void
.end method

.method public setExp_position(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->exp_position:Ljava/lang/String;

    return-void
.end method

.method public setG_info(Lcom/join/mgps/dto/GInfoBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->g_info:Lcom/join/mgps/dto/GInfoBean;

    return-void
.end method

.method public setH_ad_pic(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->h_ad_pic:Ljava/lang/String;

    return-void
.end method

.method public setH_ad_video_url(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->h_ad_video_url:Ljava/lang/String;

    return-void
.end method

.method public setHasExposure(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->hasExposure:Z

    return-void
.end method

.method public setIsPrivateDomain(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->isPrivateDomain:Z

    return-void
.end method

.method public setIs_head(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->is_head:Z

    return-void
.end method

.method public setJp_info(Lcom/join/mgps/dto/JpInfoBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->jp_info:Lcom/join/mgps/dto/JpInfoBean;

    return-void
.end method

.method public setKeyword(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->keyword:Ljava/lang/String;

    return-void
.end method

.method public setLabel(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->label:Ljava/lang/String;

    return-void
.end method

.method public setMain_title(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->main_title:Ljava/lang/String;

    return-void
.end method

.method public setPd_info(Lcom/join/mgps/dto/DomainInfoBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->pd_info:Lcom/join/mgps/dto/DomainInfoBean;

    return-void
.end method

.method public setPosition(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->position:I

    return-void
.end method

.method public setQuit_switch(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->quit_switch:I

    return-void
.end method

.method public setQuit_switch(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->quit_switch:I

    return-void
.end method

.method public setRecommend(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->isRecommend:Z

    return-void
.end method

.method public setRequestStatus(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->requestStatus:I

    return-void
.end method

.method public setStatistics(Lcom/join/mgps/dto/StatisticsBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->statistics:Lcom/join/mgps/dto/StatisticsBean;

    return-void
.end method

.method public setSub_title(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->sub_title:Ljava/lang/String;

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->title:Ljava/lang/String;

    return-void
.end method

.method public setTpl_type(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->tpl_type:I

    return-void
.end method

.method public setV_ad_pic(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->v_ad_pic:Ljava/lang/String;

    return-void
.end method

.method public setV_ad_video_url(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->v_ad_video_url:Ljava/lang/String;

    return-void
.end method

.method public setV_url(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->v_url:Ljava/lang/String;

    return-void
.end method

.method public setViewType(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/CommonGameInfoBean;->viewType:I

    return-void
.end method
