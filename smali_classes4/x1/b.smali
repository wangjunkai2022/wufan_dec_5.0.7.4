.class public Lx1/b;
.super Ljava/lang/Object;
.source "DownloadNormalCallbackImpl.java"

# interfaces
.implements Lw1/e;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lcom/join/mgps/dto/PayTagInfo;

.field private c:I

.field private d:Lcom/join/mgps/dto/ModInfoBean;

.field private e:Ljava/lang/String;

.field private f:Lcom/github/snowdream/android/app/downloader/DownloadTask;

.field private g:Lcom/join/mgps/dto/CollectionBeanSub;

.field private h:I

.field private i:I

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:Lcom/papa/sim/statistic/Ext;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/CollectionBeanSub;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lx1/b;->h:I

    .line 3
    iput v0, p0, Lx1/b;->i:I

    const-string v0, ""

    .line 4
    iput-object v0, p0, Lx1/b;->j:Ljava/lang/String;

    .line 5
    iput-object v0, p0, Lx1/b;->k:Ljava/lang/String;

    .line 6
    iput-object v0, p0, Lx1/b;->l:Ljava/lang/String;

    .line 7
    iput-object p1, p0, Lx1/b;->a:Landroid/content/Context;

    .line 8
    iput-object p3, p0, Lx1/b;->g:Lcom/join/mgps/dto/CollectionBeanSub;

    .line 9
    invoke-virtual {p3}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_id()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lx1/b;->e:Ljava/lang/String;

    .line 10
    invoke-virtual {p3}, Lcom/join/mgps/dto/CollectionBeanSub;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object p1

    iput-object p1, p0, Lx1/b;->b:Lcom/join/mgps/dto/PayTagInfo;

    .line 11
    iput-object p2, p0, Lx1/b;->f:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 12
    invoke-virtual {p3}, Lcom/join/mgps/dto/CollectionBeanSub;->getDown_status()I

    move-result p1

    iput p1, p0, Lx1/b;->c:I

    .line 13
    invoke-virtual {p3}, Lcom/join/mgps/dto/DownloadPointBase;->get_from()I

    move-result p1

    iput p1, p0, Lx1/b;->h:I

    .line 14
    invoke-virtual {p3}, Lcom/join/mgps/dto/DownloadPointBase;->get_from_type()I

    move-result p1

    iput p1, p0, Lx1/b;->i:I

    .line 15
    invoke-virtual {p3}, Lcom/join/mgps/dto/DownloadPointBase;->getRecPosition()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lx1/b;->j:Ljava/lang/String;

    .line 16
    invoke-virtual {p3}, Lcom/join/mgps/dto/DownloadPointBase;->getReMarks()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lx1/b;->k:Ljava/lang/String;

    .line 17
    invoke-virtual {p3}, Lcom/join/mgps/dto/DownloadPointBase;->getNodeId()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lx1/b;->l:Ljava/lang/String;

    .line 18
    invoke-virtual {p3}, Lcom/join/mgps/dto/CollectionBeanSub;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object p1

    iput-object p1, p0, Lx1/b;->d:Lcom/join/mgps/dto/ModInfoBean;

    return-void
.end method

.method private g(Lcom/join/mgps/customview/DownloadNormalView;Lcom/join/mgps/dto/TipNew;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 2

    const/4 v0, 0x0

    const-string v1, ""

    if-eqz p3, :cond_0

    .line 1
    :try_start_0
    invoke-virtual {p3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result p3

    if-eqz p3, :cond_0

    .line 2
    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/customview/DownloadNormalView;->a(Ljava/lang/String;Z)V

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    .line 3
    invoke-virtual {p2}, Lcom/join/mgps/dto/TipNew;->getCoin()Lcom/join/mgps/dto/TipBean;

    move-result-object p3

    if-eqz p3, :cond_1

    .line 4
    invoke-virtual {p2}, Lcom/join/mgps/dto/TipNew;->getCoin()Lcom/join/mgps/dto/TipBean;

    move-result-object p2

    invoke-virtual {p2}, Lcom/join/mgps/dto/TipBean;->getName()Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x1

    invoke-virtual {p1, p2, p3}, Lcom/join/mgps/customview/DownloadNormalView;->a(Ljava/lang/String;Z)V

    goto :goto_1

    .line 5
    :cond_1
    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/customview/DownloadNormalView;->a(Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 6
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method


# virtual methods
.method public a(Lcom/join/mgps/customview/DownloadNormalView;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/b;->f:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p0, p1, v0}, Lx1/b;->e(Lcom/join/mgps/customview/DownloadNormalView;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c(Lcom/join/mgps/customview/DownloadNormalView;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lx1/b;->f:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p0, p1, v0}, Lx1/b;->h(Lcom/join/mgps/customview/DownloadNormalView;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 2
    iget-object v0, p0, Lx1/b;->g:Lcom/join/mgps/dto/CollectionBeanSub;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v0

    iget-object v1, p0, Lx1/b;->f:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-direct {p0, p1, v0, v1}, Lx1/b;->g(Lcom/join/mgps/customview/DownloadNormalView;Lcom/join/mgps/dto/TipNew;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method

.method public d(ILjava/lang/String;)I
    .locals 1

    if-lez p1, :cond_0

    .line 1
    invoke-static {}, Lb2/e0;->o()Lb2/e0;

    move-result-object v0

    invoke-virtual {v0, p2}, Lb2/e0;->p(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_0

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public e(Lcom/join/mgps/customview/DownloadNormalView;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    .line 1
    iget-object v2, v0, Lx1/b;->m:Lcom/papa/sim/statistic/Ext;

    if-eqz v2, :cond_0

    .line 2
    iget-object v2, v0, Lx1/b;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v2

    sget-object v3, Lcom/papa/sim/statistic/Event;->clickAdvDownButton:Lcom/papa/sim/statistic/Event;

    iget-object v4, v0, Lx1/b;->m:Lcom/papa/sim/statistic/Ext;

    invoke-virtual {v2, v3, v4}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    :cond_0
    const-string v2, ""

    if-eqz v1, :cond_1

    .line 3
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v5, Lcom/join/mgps/enums/ConstantIntEnum;->H5:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v5}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 4
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v3

    iget-object v4, v0, Lx1/b;->a:Landroid/content/Context;

    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPortraitURL()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/join/mgps/Util/IntentUtil;->goShareWebActivity(Landroid/content/Context;Ljava/lang/String;)V

    .line 5
    iget-object v3, v0, Lx1/b;->a:Landroid/content/Context;

    invoke-static {v1, v3}, Lcom/join/mgps/Util/UtilsMy;->T2(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    :cond_1
    const/4 v3, 0x0

    if-eqz v1, :cond_2

    .line 6
    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v4

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    :goto_0
    const/16 v5, 0x2b

    if-eqz v1, :cond_3

    .line 7
    iget-object v6, v0, Lx1/b;->b:Lcom/join/mgps/dto/PayTagInfo;

    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v6

    if-lez v6, :cond_3

    const/16 v4, 0x2b

    :cond_3
    if-nez v1, :cond_6

    .line 8
    iget-object v1, v0, Lx1/b;->g:Lcom/join/mgps/dto/CollectionBeanSub;

    if-eqz v1, :cond_4

    .line 9
    iget-object v2, v0, Lx1/b;->a:Landroid/content/Context;

    invoke-static {v2, v1}, Lcom/join/mgps/Util/UtilsMy;->Y0(Landroid/content/Context;Lcom/join/mgps/dto/CollectionBeanSub;)V

    goto :goto_1

    .line 10
    :cond_4
    iget-object v2, v0, Lx1/b;->d:Lcom/join/mgps/dto/ModInfoBean;

    if-nez v2, :cond_5

    .line 11
    iget-object v3, v0, Lx1/b;->a:Landroid/content/Context;

    iget-object v4, v0, Lx1/b;->e:Ljava/lang/String;

    iget v6, v0, Lx1/b;->h:I

    iget v7, v0, Lx1/b;->i:I

    iget-object v8, v0, Lx1/b;->j:Ljava/lang/String;

    iget-object v9, v0, Lx1/b;->k:Ljava/lang/String;

    iget-object v10, v0, Lx1/b;->l:Ljava/lang/String;

    invoke-virtual {v1}, Lcom/join/mgps/dto/DownloadPointBase;->getPosition_path()Lcom/psk/eventmodule/StatFactory$VolcanoOther;

    move-result-object v11

    const/4 v12, 0x0

    const-string v5, ""

    invoke-static/range {v3 .. v12}, Lcom/join/mgps/Util/UtilsMy;->d1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/psk/eventmodule/StatFactory$VolcanoOther;Z)V

    goto :goto_1

    .line 12
    :cond_5
    iget-object v13, v0, Lx1/b;->a:Landroid/content/Context;

    invoke-virtual {v2}, Lcom/join/mgps/dto/ModInfoBean;->getMod_game_id()Ljava/lang/String;

    move-result-object v14

    iget v1, v0, Lx1/b;->h:I

    iget v2, v0, Lx1/b;->i:I

    iget-object v3, v0, Lx1/b;->j:Ljava/lang/String;

    iget-object v4, v0, Lx1/b;->k:Ljava/lang/String;

    iget-object v5, v0, Lx1/b;->l:Ljava/lang/String;

    iget-object v6, v0, Lx1/b;->g:Lcom/join/mgps/dto/CollectionBeanSub;

    invoke-virtual {v6}, Lcom/join/mgps/dto/DownloadPointBase;->getPosition_path()Lcom/psk/eventmodule/StatFactory$VolcanoOther;

    move-result-object v21

    const/16 v22, 0x0

    const-string v15, ""

    move/from16 v16, v1

    move/from16 v17, v2

    move-object/from16 v18, v3

    move-object/from16 v19, v4

    move-object/from16 v20, v5

    invoke-static/range {v13 .. v22}, Lcom/join/mgps/Util/UtilsMy;->d1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/psk/eventmodule/StatFactory$VolcanoOther;Z)V

    :goto_1
    return-void

    :cond_6
    const/4 v6, 0x2

    if-eq v4, v6, :cond_1c

    const/16 v6, 0xa

    if-ne v4, v6, :cond_7

    goto/16 :goto_6

    :cond_7
    const/4 v6, 0x3

    if-eq v4, v6, :cond_1b

    const/4 v6, 0x6

    if-ne v4, v6, :cond_8

    goto/16 :goto_5

    :cond_8
    const/16 v6, 0xc

    if-eq v4, v6, :cond_1a

    const/16 v6, 0x1b

    if-ne v4, v6, :cond_9

    goto/16 :goto_4

    :cond_9
    const/16 v6, 0xd

    if-ne v4, v6, :cond_a

    .line 13
    iget-object v2, v0, Lx1/b;->a:Landroid/content/Context;

    invoke-static {v2, v1}, Lcom/php25/PDownload/d;->l(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void

    :cond_a
    const/4 v6, 0x5

    if-ne v4, v6, :cond_b

    .line 14
    iget-object v2, v0, Lx1/b;->a:Landroid/content/Context;

    invoke-static {v2, v1}, Lcom/join/mgps/Util/UtilsMy;->T3(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_7

    :cond_b
    const/16 v7, 0x9

    if-ne v4, v7, :cond_10

    .line 15
    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_f

    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_2

    .line 16
    :cond_c
    iget-object v2, v0, Lx1/b;->a:Landroid/content/Context;

    invoke-static {v2, v1}, Lcom/join/mgps/Util/UtilsMy;->o1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v2

    if-eqz v2, :cond_d

    return-void

    .line 17
    :cond_d
    iget v2, v0, Lx1/b;->c:I

    if-ne v2, v6, :cond_e

    .line 18
    iget-object v2, v0, Lx1/b;->a:Landroid/content/Context;

    invoke-static {v2, v1}, Lcom/join/mgps/Util/UtilsMy;->l1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void

    .line 19
    :cond_e
    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/join/mgps/Util/UtilsMy;->z4(Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/lang/String;)V

    .line 20
    invoke-static/range {p2 .. p2}, Lcom/php25/PDownload/d;->b(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 21
    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getVer()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setVer(Ljava/lang/String;)V

    .line 22
    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getVer_name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setVer_name(Ljava/lang/String;)V

    .line 23
    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setUrl(Ljava/lang/String;)V

    .line 24
    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCfg_ver()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setCfg_ver(Ljava/lang/String;)V

    .line 25
    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCfg_ver_name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setCfg_ver_name(Ljava/lang/String;)V

    .line 26
    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCfg_down_url()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setCfg_down_url(Ljava/lang/String;)V

    .line 27
    iget-object v2, v0, Lx1/b;->a:Landroid/content/Context;

    invoke-static {v1, v2}, Lcom/php25/PDownload/d;->c(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto/16 :goto_7

    :cond_f
    :goto_2
    return-void

    :cond_10
    const/16 v7, 0x2a

    if-ne v4, v7, :cond_13

    .line 28
    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_12

    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_11

    goto :goto_3

    .line 29
    :cond_11
    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/join/mgps/Util/UtilsMy;->z4(Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/lang/String;)V

    .line 30
    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getVer()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setVer(Ljava/lang/String;)V

    .line 31
    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getVer_name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setVer_name(Ljava/lang/String;)V

    .line 32
    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setUrl(Ljava/lang/String;)V

    .line 33
    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCfg_ver()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setCfg_ver(Ljava/lang/String;)V

    .line 34
    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCfg_ver_name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setCfg_ver_name(Ljava/lang/String;)V

    .line 35
    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCfg_down_url()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setCfg_down_url(Ljava/lang/String;)V

    .line 36
    iget-object v2, v0, Lx1/b;->a:Landroid/content/Context;

    invoke-static {v2, v1}, Lcom/join/mgps/Util/UtilsMy;->r4(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_7

    :cond_12
    :goto_3
    return-void

    :cond_13
    const/16 v2, 0xb

    if-ne v2, v4, :cond_14

    .line 37
    iget-object v2, v0, Lx1/b;->a:Landroid/content/Context;

    invoke-static {v1, v2}, Lcom/join/mgps/Util/UtilsMy;->a4(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto :goto_7

    :cond_14
    if-ne v5, v4, :cond_17

    .line 38
    iget-object v2, v0, Lx1/b;->b:Lcom/join/mgps/dto/PayTagInfo;

    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/join/mgps/Util/UtilsMy;->y0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v2

    if-lez v2, :cond_15

    .line 39
    iget-object v2, v0, Lx1/b;->a:Landroid/content/Context;

    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/join/mgps/Util/UtilsMy;->d4(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_7

    .line 40
    :cond_15
    iget v2, v0, Lx1/b;->c:I

    if-ne v2, v6, :cond_16

    .line 41
    iget-object v2, v0, Lx1/b;->a:Landroid/content/Context;

    invoke-static {v2, v1}, Lcom/join/mgps/Util/UtilsMy;->l1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_7

    .line 42
    :cond_16
    iget-object v2, v0, Lx1/b;->a:Landroid/content/Context;

    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTp_down_url()Ljava/util/List;

    move-result-object v4

    invoke-static {v2, v1, v4, v3, v3}, Lcom/join/mgps/Util/UtilsMy;->R0(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/util/List;II)V

    goto :goto_7

    .line 43
    :cond_17
    iget-object v2, v0, Lx1/b;->b:Lcom/join/mgps/dto/PayTagInfo;

    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/join/mgps/Util/UtilsMy;->y0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v2

    if-lez v2, :cond_18

    .line 44
    iget-object v2, v0, Lx1/b;->a:Landroid/content/Context;

    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/join/mgps/Util/UtilsMy;->d4(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_7

    .line 45
    :cond_18
    iget v2, v0, Lx1/b;->c:I

    if-ne v2, v6, :cond_19

    .line 46
    iget-object v2, v0, Lx1/b;->a:Landroid/content/Context;

    invoke-static {v2, v1}, Lcom/join/mgps/Util/UtilsMy;->l1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_7

    .line 47
    :cond_19
    iget-object v2, v0, Lx1/b;->a:Landroid/content/Context;

    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTp_down_url()Ljava/util/List;

    move-result-object v4

    invoke-static {v2, v1, v4, v3, v3}, Lcom/join/mgps/Util/UtilsMy;->R0(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/util/List;II)V

    goto :goto_7

    :cond_1a
    :goto_4
    return-void

    .line 48
    :cond_1b
    :goto_5
    iget-object v2, v0, Lx1/b;->a:Landroid/content/Context;

    invoke-static {v1, v2}, Lcom/php25/PDownload/d;->c(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto :goto_7

    .line 49
    :cond_1c
    :goto_6
    invoke-static/range {p2 .. p2}, Lcom/php25/PDownload/d;->i(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 50
    :goto_7
    invoke-virtual/range {p0 .. p2}, Lx1/b;->h(Lcom/join/mgps/customview/DownloadNormalView;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method

.method public f(Lcom/papa/sim/statistic/Ext;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx1/b;->m:Lcom/papa/sim/statistic/Ext;

    return-void
.end method

.method public h(Lcom/join/mgps/customview/DownloadNormalView;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 11

    const v0, 0x7f100305

    const/4 v1, 0x6

    const/4 v2, 0x3

    const/4 v3, 0x2

    const-string v4, ""

    const/4 v5, 0x1

    const/16 v6, 0x2b

    const/4 v7, 0x0

    if-nez p2, :cond_6

    .line 1
    iget-object p2, p0, Lx1/b;->b:Lcom/join/mgps/dto/PayTagInfo;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/join/mgps/dto/PayTagInfo;->getPay_game_amount()I

    move-result p2

    .line 2
    :goto_0
    iget-object v8, p0, Lx1/b;->e:Ljava/lang/String;

    invoke-virtual {p0, p2, v8}, Lx1/b;->d(ILjava/lang/String;)I

    move-result v8

    if-lez v8, :cond_1

    const/4 v8, 0x1

    goto :goto_1

    :cond_1
    const/4 v8, 0x0

    .line 3
    :goto_1
    iget v9, p0, Lx1/b;->c:I

    if-ne v9, v2, :cond_2

    if-nez v8, :cond_2

    const/16 p2, 0x29

    .line 4
    iget-object v0, p0, Lx1/b;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f1000e4

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lcom/join/mgps/customview/DownloadNormalView;->c(ILjava/lang/String;)V

    goto :goto_2

    :cond_2
    if-ne v9, v3, :cond_3

    if-nez v8, :cond_3

    const/16 p2, 0x28

    .line 5
    iget-object v0, p0, Lx1/b;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f1000de

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lcom/join/mgps/customview/DownloadNormalView;->c(ILjava/lang/String;)V

    goto :goto_2

    :cond_3
    if-ne v9, v1, :cond_4

    if-nez v8, :cond_4

    const/16 p2, 0x27

    .line 6
    iget-object v0, p0, Lx1/b;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f1000e5

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lcom/join/mgps/customview/DownloadNormalView;->c(ILjava/lang/String;)V

    goto :goto_2

    :cond_4
    if-lez p2, :cond_5

    .line 7
    iget-object p2, p0, Lx1/b;->a:Landroid/content/Context;

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    new-array v1, v5, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lx1/b;->b:Lcom/join/mgps/dto/PayTagInfo;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v7

    invoke-virtual {p2, v0, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v6, p2}, Lcom/join/mgps/customview/DownloadNormalView;->c(ILjava/lang/String;)V

    goto :goto_2

    .line 8
    :cond_5
    invoke-virtual {p1, v7}, Lcom/join/mgps/customview/DownloadNormalView;->b(I)V

    :goto_2
    return-void

    .line 9
    :cond_6
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_7

    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v10, Lcom/join/mgps/enums/ConstantIntEnum;->H5:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v10}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 10
    invoke-virtual {p1, v7}, Lcom/join/mgps/customview/DownloadNormalView;->b(I)V

    return-void

    .line 11
    :cond_7
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v4

    .line 12
    iget-object v8, p0, Lx1/b;->b:Lcom/join/mgps/dto/PayTagInfo;

    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v8

    if-lez v8, :cond_8

    const/16 v4, 0x2b

    :cond_8
    if-eq v4, v3, :cond_c

    if-eq v4, v2, :cond_c

    if-eq v4, v1, :cond_c

    const/16 v1, 0x1b

    if-ne v4, v1, :cond_9

    goto :goto_3

    :cond_9
    if-ne v4, v6, :cond_b

    .line 13
    iget-object p2, p0, Lx1/b;->b:Lcom/join/mgps/dto/PayTagInfo;

    if-eqz p2, :cond_a

    invoke-virtual {p2}, Lcom/join/mgps/dto/PayTagInfo;->getAmount_check()I

    move-result p2

    if-lez p2, :cond_a

    .line 14
    iget-object p2, p0, Lx1/b;->a:Landroid/content/Context;

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    new-array v1, v5, [Ljava/lang/Object;

    iget-object v2, p0, Lx1/b;->b:Lcom/join/mgps/dto/PayTagInfo;

    invoke-virtual {v2}, Lcom/join/mgps/dto/PayTagInfo;->getPayGameAmount()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v7

    invoke-virtual {p2, v0, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v6, p2}, Lcom/join/mgps/customview/DownloadNormalView;->c(ILjava/lang/String;)V

    goto :goto_4

    .line 15
    :cond_a
    invoke-virtual {p1, v6}, Lcom/join/mgps/customview/DownloadNormalView;->b(I)V

    goto :goto_4

    .line 16
    :cond_b
    invoke-virtual {p1, v4}, Lcom/join/mgps/customview/DownloadNormalView;->b(I)V

    goto :goto_4

    .line 17
    :cond_c
    :goto_3
    invoke-static {p2}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 18
    invoke-virtual {p1, v4}, Lcom/join/mgps/customview/DownloadNormalView;->b(I)V

    :goto_4
    return-void
.end method
