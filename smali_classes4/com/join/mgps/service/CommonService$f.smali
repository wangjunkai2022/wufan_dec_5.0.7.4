.class Lcom/join/mgps/service/CommonService$f;
.super Ljava/lang/Object;
.source "CommonService.java"

# interfaces
.implements Lw1/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/service/CommonService;->h1(Lcom/join/mgps/dto/DownloadGameArgsBean;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lw1/k<",
        "Lcom/join/mgps/dto/ResponseModel<",
        "Lcom/join/mgps/activity/mygame/data/DataGameListBean;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/dto/DownloadGameArgsBean;

.field final synthetic b:I

.field final synthetic c:Lcom/join/mgps/service/CommonService;


# direct methods
.method constructor <init>(Lcom/join/mgps/service/CommonService;Lcom/join/mgps/dto/DownloadGameArgsBean;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/service/CommonService$f;->c:Lcom/join/mgps/service/CommonService;

    iput-object p2, p0, Lcom/join/mgps/service/CommonService$f;->a:Lcom/join/mgps/dto/DownloadGameArgsBean;

    iput p3, p0, Lcom/join/mgps/service/CommonService$f;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/join/mgps/service/CommonService$f;->c:Lcom/join/mgps/service/CommonService;

    iget-object v0, p0, Lcom/join/mgps/service/CommonService$f;->a:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getGameId()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x31

    invoke-static {p1, v0, v1}, Lcom/join/mgps/service/CommonService;->i(Lcom/join/mgps/service/CommonService;Ljava/lang/String;I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/service/CommonService$f;->c:Lcom/join/mgps/service/CommonService;

    const-string v0, "\u83b7\u53d6\u6e38\u620f\u4fe1\u606f\u5931\u8d25"

    invoke-virtual {p1, v0}, Lcom/join/mgps/service/CommonService;->H1(Ljava/lang/String;)V

    return-void
.end method

.method public b(Lcom/join/mgps/dto/ResponseModel;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/activity/mygame/data/DataGameListBean;",
            ">;)V"
        }
    .end annotation

    const-string v0, "\u83b7\u53d6\u6e38\u620f\u4fe1\u606f\u5931\u8d25"

    const/16 v1, 0x31

    if-eqz p1, :cond_14

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v2

    const/16 v3, 0x258

    if-ne v2, v3, :cond_14

    .line 2
    iget-object v2, p0, Lcom/join/mgps/service/CommonService$f;->c:Lcom/join/mgps/service/CommonService;

    iget-object v3, p0, Lcom/join/mgps/service/CommonService$f;->a:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getGameId()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x32

    invoke-static {v2, v3, v4}, Lcom/join/mgps/service/CommonService;->i(Lcom/join/mgps/service/CommonService;Ljava/lang/String;I)V

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/mygame/data/DataGameListBean;

    if-eqz p1, :cond_15

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/activity/mygame/data/DataGameListBean;->getGameList()Ljava/util/List;

    move-result-object v2

    .line 5
    invoke-virtual {p1}, Lcom/join/mgps/activity/mygame/data/DataGameListBean;->getPdInfo()Lcom/join/mgps/dto/DomainInfoBean;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 6
    iget-object v3, p0, Lcom/join/mgps/service/CommonService$f;->a:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getGameId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/join/mgps/dto/DomainInfoBean;->setGameId(Ljava/lang/String;)V

    .line 7
    iget-object v3, p0, Lcom/join/mgps/service/CommonService$f;->a:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-virtual {v3, p1}, Lcom/join/mgps/dto/DownloadGameArgsBean;->setPdInfo(Lcom/join/mgps/dto/DomainInfoBean;)V

    .line 8
    :cond_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_15

    const/4 p1, 0x0

    .line 9
    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/CollectionBeanSub;

    .line 10
    iget v3, p0, Lcom/join/mgps/service/CommonService$f;->b:I

    const/4 v4, 0x5

    const/4 v5, 0x1

    if-ne v3, v5, :cond_4

    .line 11
    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionBeanSub;->getDownloadtaskDown()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    .line 12
    iget-object v2, p0, Lcom/join/mgps/service/CommonService$f;->a:Lcom/join/mgps/dto/DownloadGameArgsBean;

    if-eqz v2, :cond_2

    .line 13
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v2

    iget-object v3, p0, Lcom/join/mgps/service/CommonService$f;->a:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getGameId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 14
    invoke-static {p1, v2}, Lcom/join/mgps/Util/UtilsMy;->y4(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 15
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getId()I

    move-result v2

    invoke-virtual {p1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setId(I)V

    .line 16
    :cond_1
    iget-object v2, p0, Lcom/join/mgps/service/CommonService$f;->a:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getKeyWord()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setKeyword(Ljava/lang/String;)V

    .line 17
    iget-object v2, p0, Lcom/join/mgps/service/CommonService$f;->a:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getFrom()I

    move-result v2

    invoke-virtual {p1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->set_from(I)V

    .line 18
    iget-object v2, p0, Lcom/join/mgps/service/CommonService$f;->a:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getFromType()I

    move-result v2

    invoke-virtual {p1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->set_from_type(I)V

    .line 19
    iget-object v2, p0, Lcom/join/mgps/service/CommonService$f;->a:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getExt()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setExt(Ljava/lang/String;)V

    .line 20
    iget-object v2, p0, Lcom/join/mgps/service/CommonService$f;->a:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getExt1()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setExt1(Ljava/lang/String;)V

    .line 21
    :cond_2
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getDown_status()I

    move-result v2

    if-ne v2, v4, :cond_3

    .line 22
    iget-object v2, p0, Lcom/join/mgps/service/CommonService$f;->c:Lcom/join/mgps/service/CommonService;

    invoke-static {v2}, Lcom/join/mgps/service/CommonService;->h(Lcom/join/mgps/service/CommonService;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, p1}, Lcom/join/mgps/Util/UtilsMy;->l1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void

    .line 23
    :cond_3
    iget-object v2, p0, Lcom/join/mgps/service/CommonService$f;->c:Lcom/join/mgps/service/CommonService;

    invoke-static {v2}, Lcom/join/mgps/service/CommonService;->h(Lcom/join/mgps/service/CommonService;)Landroid/content/Context;

    move-result-object v2

    invoke-static {p1, v2}, Lcom/php25/PDownload/d;->c(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto/16 :goto_0

    :cond_4
    const/4 v6, 0x2

    if-ne v3, v6, :cond_a

    .line 24
    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionBeanSub;->getDownloadtaskDown()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v3

    .line 25
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v6

    iget-object v7, p0, Lcom/join/mgps/service/CommonService$f;->a:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-virtual {v7}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getGameId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v6

    .line 26
    iget-object v7, p0, Lcom/join/mgps/service/CommonService$f;->a:Lcom/join/mgps/dto/DownloadGameArgsBean;

    if-eqz v7, :cond_6

    if-eqz v6, :cond_5

    .line 27
    invoke-static {v3, v6}, Lcom/join/mgps/Util/UtilsMy;->y4(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 28
    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getId()I

    move-result v6

    invoke-virtual {v3, v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setId(I)V

    .line 29
    :cond_5
    iget-object v6, p0, Lcom/join/mgps/service/CommonService$f;->a:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-virtual {v6}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getKeyWord()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setKeyword(Ljava/lang/String;)V

    .line 30
    iget-object v6, p0, Lcom/join/mgps/service/CommonService$f;->a:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-virtual {v6}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getFrom()I

    move-result v6

    invoke-virtual {v3, v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->set_from(I)V

    .line 31
    iget-object v6, p0, Lcom/join/mgps/service/CommonService$f;->a:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-virtual {v6}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getFromType()I

    move-result v6

    invoke-virtual {v3, v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->set_from_type(I)V

    .line 32
    iget-object v6, p0, Lcom/join/mgps/service/CommonService$f;->a:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-virtual {v6}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getExt()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setExt(Ljava/lang/String;)V

    .line 33
    iget-object v6, p0, Lcom/join/mgps/service/CommonService$f;->a:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-virtual {v6}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getExt1()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setExt1(Ljava/lang/String;)V

    .line 34
    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionBeanSub;->getVer()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setVer(Ljava/lang/String;)V

    .line 35
    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionBeanSub;->getVer_name()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setVer_name(Ljava/lang/String;)V

    .line 36
    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionBeanSub;->getDown_url_remote()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setUrl(Ljava/lang/String;)V

    .line 37
    :cond_6
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getDown_status()I

    move-result v2

    if-ne v2, v4, :cond_7

    .line 38
    iget-object p1, p0, Lcom/join/mgps/service/CommonService$f;->c:Lcom/join/mgps/service/CommonService;

    invoke-static {p1}, Lcom/join/mgps/service/CommonService;->h(Lcom/join/mgps/service/CommonService;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v3}, Lcom/join/mgps/Util/UtilsMy;->l1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void

    :cond_7
    const/4 v2, 0x0

    .line 39
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4, v5}, Ljava/util/HashMap;-><init>(I)V

    const-string v5, "crc_sign_id"

    .line 40
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    invoke-static {}, Lb2/q;->o()Lb2/q;

    move-result-object v5

    invoke-virtual {v5, v4}, Lp1/b;->h(Ljava/util/Map;)Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_8

    .line 42
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    if-lez v5, :cond_8

    .line 43
    invoke-interface {v4, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lcom/join/mgps/db/tables/EMUUpdateTable;

    :cond_8
    if-eqz v2, :cond_15

    .line 44
    invoke-virtual {v2}, Lcom/join/mgps/db/tables/EMUUpdateTable;->getVer()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setVer(Ljava/lang/String;)V

    .line 45
    invoke-virtual {v2}, Lcom/join/mgps/db/tables/EMUUpdateTable;->getVer_name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setVer_name(Ljava/lang/String;)V

    .line 46
    invoke-virtual {v2}, Lcom/join/mgps/db/tables/EMUUpdateTable;->getDown_url_remote()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setUrl(Ljava/lang/String;)V

    .line 47
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p1

    invoke-virtual {p1, v3}, Lp1/b;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    invoke-static {v3}, Lcom/join/mgps/Util/UtilsMy;->L0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 49
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPay_game_amount()I

    move-result p1

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lcom/join/mgps/Util/UtilsMy;->x0(ILjava/lang/String;)I

    move-result p1

    if-lez p1, :cond_9

    .line 50
    iget-object p1, p0, Lcom/join/mgps/service/CommonService$f;->c:Lcom/join/mgps/service/CommonService;

    invoke-static {p1}, Lcom/join/mgps/service/CommonService;->h(Lcom/join/mgps/service/CommonService;)Landroid/content/Context;

    move-result-object p1

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lcom/join/mgps/Util/UtilsMy;->d4(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 51
    :cond_9
    iget-object p1, p0, Lcom/join/mgps/service/CommonService$f;->c:Lcom/join/mgps/service/CommonService;

    invoke-static {p1}, Lcom/join/mgps/service/CommonService;->h(Lcom/join/mgps/service/CommonService;)Landroid/content/Context;

    move-result-object p1

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTp_down_url()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getOther_down_switch()I

    move-result v4

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCdn_down_switch()I

    move-result v5

    invoke-static {p1, v3, v2, v4, v5}, Lcom/join/mgps/Util/UtilsMy;->R0(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/util/List;II)V

    goto/16 :goto_0

    .line 52
    :cond_a
    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionBeanSub;->getDownloadtaskDown()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v3

    .line 53
    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionBeanSub;->getTag_info()Ljava/util/ArrayList;

    move-result-object v4

    invoke-static {v4}, Lcom/join/mgps/Util/q1;->e(Ljava/util/ArrayList;)Z

    move-result v4

    .line 54
    invoke-static {}, Lcom/join/mgps/Util/q1;->q()Z

    move-result v6

    if-nez v6, :cond_b

    invoke-static {}, Lcom/join/mgps/Util/q1;->s()Z

    move-result v6

    if-nez v6, :cond_b

    invoke-static {}, Lcom/join/mgps/Util/q1;->m()Z

    move-result v6

    if-nez v6, :cond_b

    invoke-static {}, Lcom/join/mgps/Util/q1;->n()Z

    move-result v6

    if-eqz v6, :cond_c

    :cond_b
    const/4 p1, 0x1

    :cond_c
    if-eqz p1, :cond_12

    .line 55
    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionBeanSub;->getWeb_disk_info()Lcom/join/mgps/dto/WebDiskInfo;

    move-result-object p1

    if-eqz p1, :cond_12

    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionBeanSub;->isCpsGame()Z

    move-result p1

    if-nez p1, :cond_12

    const/high16 p1, 0x10000000

    if-eqz v4, :cond_e

    .line 56
    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionBeanSub;->getWeb_disk_info()Lcom/join/mgps/dto/WebDiskInfo;

    move-result-object v3

    if-nez v3, :cond_d

    .line 57
    new-instance v3, Lcom/join/mgps/dto/WebDiskInfo;

    invoke-direct {v3}, Lcom/join/mgps/dto/WebDiskInfo;-><init>()V

    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/CollectionBeanSub;->setWeb_disk_info(Lcom/join/mgps/dto/WebDiskInfo;)V

    .line 58
    :cond_d
    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionBeanSub;->getWeb_disk_info()Lcom/join/mgps/dto/WebDiskInfo;

    move-result-object v3

    iget-object v4, p0, Lcom/join/mgps/service/CommonService$f;->a:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getGameId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/join/mgps/dto/WebDiskInfo;->setGameId(Ljava/lang/String;)V

    .line 59
    iget-object v3, p0, Lcom/join/mgps/service/CommonService$f;->c:Lcom/join/mgps/service/CommonService;

    invoke-static {v3}, Lcom/join/mgps/service/CommonService;->h(Lcom/join/mgps/service/CommonService;)Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/activity/QuarkDownGameActivity_;->i0(Landroid/content/Context;)Lcom/join/mgps/activity/QuarkDownGameActivity_$a;

    move-result-object v3

    invoke-virtual {v3, p1}, Lorg/androidannotations/api/builder/e;->flags(I)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/QuarkDownGameActivity_$a;

    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionBeanSub;->getWeb_disk_info()Lcom/join/mgps/dto/WebDiskInfo;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/join/mgps/activity/QuarkDownGameActivity_$a;->e(Lcom/join/mgps/dto/WebDiskInfo;)Lcom/join/mgps/activity/QuarkDownGameActivity_$a;

    move-result-object p1

    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionBeanSub;->getExt_info()Lcom/join/mgps/dto/ExtInfoBean;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/join/mgps/activity/QuarkDownGameActivity_$a;->a(Lcom/join/mgps/dto/ExtInfoBean;)Lcom/join/mgps/activity/QuarkDownGameActivity_$a;

    move-result-object p1

    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_id()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/join/mgps/activity/QuarkDownGameActivity_$a;->c(Ljava/lang/String;)Lcom/join/mgps/activity/QuarkDownGameActivity_$a;

    move-result-object p1

    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/join/mgps/activity/QuarkDownGameActivity_$a;->d(Ljava/lang/String;)Lcom/join/mgps/activity/QuarkDownGameActivity_$a;

    move-result-object p1

    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionBeanSub;->getIco_remote()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/join/mgps/activity/QuarkDownGameActivity_$a;->b(Ljava/lang/String;)Lcom/join/mgps/activity/QuarkDownGameActivity_$a;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_0

    .line 60
    :cond_e
    invoke-static {}, Lcom/join/mgps/Util/q1;->g()Z

    move-result v4

    if-eqz v4, :cond_11

    invoke-static {}, Lcom/join/mgps/Util/q1;->q()Z

    move-result v4

    if-eqz v4, :cond_f

    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionBeanSub;->getTag_info()Ljava/util/ArrayList;

    move-result-object v4

    invoke-static {v4}, Lcom/join/mgps/Util/UtilsMy;->o2(Ljava/util/List;)Z

    move-result v4

    if-nez v4, :cond_10

    :cond_f
    invoke-static {}, Lcom/join/mgps/Util/q1;->n()Z

    move-result v4

    if-eqz v4, :cond_11

    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionBeanSub;->getPlugin_num()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Lcom/join/mgps/Util/UtilsMy;->m2(I)Z

    move-result v4

    if-eqz v4, :cond_11

    .line 61
    :cond_10
    new-instance v4, Lcom/join/mgps/dto/DownloadArgs;

    invoke-direct {v4}, Lcom/join/mgps/dto/DownloadArgs;-><init>()V

    .line 62
    iget-object v5, p0, Lcom/join/mgps/service/CommonService$f;->a:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getExt()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/join/mgps/dto/DownloadPointBase;->setExt(Ljava/lang/String;)V

    .line 63
    invoke-virtual {v4, v3}, Lcom/join/mgps/dto/DownloadArgs;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 64
    invoke-virtual {v4, v2}, Lcom/join/mgps/dto/DownloadArgs;->setGameInfo(Lcom/join/mgps/dto/CollectionBeanSub;)V

    .line 65
    iget-object v3, p0, Lcom/join/mgps/service/CommonService$f;->c:Lcom/join/mgps/service/CommonService;

    invoke-static {v3}, Lcom/join/mgps/service/CommonService;->h(Lcom/join/mgps/service/CommonService;)Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/activity/QuarkPromptActivity_;->n0(Landroid/content/Context;)Lcom/join/mgps/activity/QuarkPromptActivity_$d;

    move-result-object v3

    invoke-virtual {v3, p1}, Lorg/androidannotations/api/builder/e;->flags(I)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/QuarkPromptActivity_$d;

    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/join/mgps/activity/QuarkPromptActivity_$d;->b(Ljava/lang/String;)Lcom/join/mgps/activity/QuarkPromptActivity_$d;

    move-result-object p1

    .line 66
    invoke-virtual {p1, v4}, Lcom/join/mgps/activity/QuarkPromptActivity_$d;->a(Lcom/join/mgps/dto/DownloadArgs;)Lcom/join/mgps/activity/QuarkPromptActivity_$d;

    move-result-object p1

    .line 67
    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto :goto_0

    .line 68
    :cond_11
    iget-object p1, p0, Lcom/join/mgps/service/CommonService$f;->c:Lcom/join/mgps/service/CommonService;

    iget-object v4, p0, Lcom/join/mgps/service/CommonService$f;->a:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-static {p1, v4, v2, v3}, Lcom/join/mgps/service/CommonService;->j(Lcom/join/mgps/service/CommonService;Lcom/join/mgps/dto/DownloadGameArgsBean;Lcom/join/mgps/dto/CollectionBeanSub;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    :cond_12
    if-eqz v4, :cond_13

    .line 69
    sget-object p1, Lcom/join/mgps/enums/Dtype;->android:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setFileType(Ljava/lang/String;)V

    .line 70
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRomType(Ljava/lang/String;)V

    .line 71
    :cond_13
    iget-object p1, p0, Lcom/join/mgps/service/CommonService$f;->c:Lcom/join/mgps/service/CommonService;

    iget-object v4, p0, Lcom/join/mgps/service/CommonService$f;->a:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-static {p1, v4, v2, v3}, Lcom/join/mgps/service/CommonService;->j(Lcom/join/mgps/service/CommonService;Lcom/join/mgps/dto/DownloadGameArgsBean;Lcom/join/mgps/dto/CollectionBeanSub;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 72
    :cond_14
    iget-object p1, p0, Lcom/join/mgps/service/CommonService$f;->c:Lcom/join/mgps/service/CommonService;

    iget-object v2, p0, Lcom/join/mgps/service/CommonService$f;->a:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getGameId()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2, v1}, Lcom/join/mgps/service/CommonService;->i(Lcom/join/mgps/service/CommonService;Ljava/lang/String;I)V

    .line 73
    iget-object p1, p0, Lcom/join/mgps/service/CommonService$f;->c:Lcom/join/mgps/service/CommonService;

    invoke-virtual {p1, v0}, Lcom/join/mgps/service/CommonService;->H1(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 74
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 75
    iget-object p1, p0, Lcom/join/mgps/service/CommonService$f;->c:Lcom/join/mgps/service/CommonService;

    iget-object v2, p0, Lcom/join/mgps/service/CommonService$f;->a:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getGameId()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2, v1}, Lcom/join/mgps/service/CommonService;->i(Lcom/join/mgps/service/CommonService;Ljava/lang/String;I)V

    .line 76
    iget-object p1, p0, Lcom/join/mgps/service/CommonService$f;->c:Lcom/join/mgps/service/CommonService;

    invoke-virtual {p1, v0}, Lcom/join/mgps/service/CommonService;->H1(Ljava/lang/String;)V

    :cond_15
    :goto_0
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/join/mgps/dto/ResponseModel;

    invoke-virtual {p0, p1}, Lcom/join/mgps/service/CommonService$f;->b(Lcom/join/mgps/dto/ResponseModel;)V

    return-void
.end method
