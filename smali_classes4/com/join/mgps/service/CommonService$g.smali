.class Lcom/join/mgps/service/CommonService$g;
.super Ljava/lang/Object;
.source "CommonService.java"

# interfaces
.implements Lretrofit2/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/service/CommonService;->Y(Lcom/join/mgps/dto/DownloadGameArgsBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lretrofit2/Callback<",
        "Lcom/join/mgps/dto/ResponseModel<",
        "Lcom/join/mgps/activity/mygame/data/DataGameListBean;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:I

.field final synthetic f:I

.field final synthetic g:Lcom/join/mgps/dto/DownloadGameArgsBean;

.field final synthetic h:Z

.field final synthetic i:Ljava/lang/String;

.field final synthetic j:Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;

.field final synthetic k:Lcom/join/mgps/service/CommonService;


# direct methods
.method constructor <init>(Lcom/join/mgps/service/CommonService;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILcom/join/mgps/dto/DownloadGameArgsBean;ZLjava/lang/String;Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/service/CommonService$g;->k:Lcom/join/mgps/service/CommonService;

    iput-object p2, p0, Lcom/join/mgps/service/CommonService$g;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/join/mgps/service/CommonService$g;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/join/mgps/service/CommonService$g;->d:Ljava/lang/String;

    iput p5, p0, Lcom/join/mgps/service/CommonService$g;->e:I

    iput p6, p0, Lcom/join/mgps/service/CommonService$g;->f:I

    iput-object p7, p0, Lcom/join/mgps/service/CommonService$g;->g:Lcom/join/mgps/dto/DownloadGameArgsBean;

    iput-boolean p8, p0, Lcom/join/mgps/service/CommonService$g;->h:Z

    iput-object p9, p0, Lcom/join/mgps/service/CommonService$g;->i:Ljava/lang/String;

    iput-object p10, p0, Lcom/join/mgps/service/CommonService$g;->j:Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/activity/mygame/data/DataGameListBean;",
            ">;>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lcom/join/mgps/service/CommonService$g;->k:Lcom/join/mgps/service/CommonService;

    const-string p2, "\u83b7\u53d6\u6e38\u620f\u4fe1\u606f\u5931\u8d25"

    invoke-virtual {p1, p2}, Lcom/join/mgps/service/CommonService;->H1(Ljava/lang/String;)V

    return-void
.end method

.method public onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/Call<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/activity/mygame/data/DataGameListBean;",
            ">;>;",
            "Lretrofit2/Response<",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/activity/mygame/data/DataGameListBean;",
            ">;>;)V"
        }
    .end annotation

    if-eqz p2, :cond_c

    .line 1
    :try_start_0
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_c

    .line 2
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/ResponseModel;

    if-eqz p1, :cond_c

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result p2

    const/16 v0, 0x258

    if-ne p2, v0, :cond_c

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/mygame/data/DataGameListBean;

    if-eqz p1, :cond_c

    .line 5
    invoke-virtual {p1}, Lcom/join/mgps/activity/mygame/data/DataGameListBean;->getGameList()Ljava/util/List;

    move-result-object p2

    .line 6
    invoke-virtual {p1}, Lcom/join/mgps/activity/mygame/data/DataGameListBean;->getPdInfo()Lcom/join/mgps/dto/DomainInfoBean;

    move-result-object p1

    .line 7
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_c

    const/4 v0, 0x0

    .line 8
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/CollectionBeanSub;

    .line 9
    iget-object v1, p0, Lcom/join/mgps/service/CommonService$g;->b:Ljava/lang/String;

    invoke-virtual {p2, v1}, Lcom/join/mgps/dto/DownloadPointBase;->setRecPosition(Ljava/lang/String;)V

    .line 10
    iget-object v1, p0, Lcom/join/mgps/service/CommonService$g;->c:Ljava/lang/String;

    invoke-virtual {p2, v1}, Lcom/join/mgps/dto/DownloadPointBase;->setReMarks(Ljava/lang/String;)V

    .line 11
    iget-object v1, p0, Lcom/join/mgps/service/CommonService$g;->d:Ljava/lang/String;

    invoke-virtual {p2, v1}, Lcom/join/mgps/dto/DownloadPointBase;->setNodeId(Ljava/lang/String;)V

    .line 12
    iget v1, p0, Lcom/join/mgps/service/CommonService$g;->e:I

    invoke-virtual {p2, v1}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 13
    iget v1, p0, Lcom/join/mgps/service/CommonService$g;->f:I

    invoke-virtual {p2, v1}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    .line 14
    iget-object v1, p0, Lcom/join/mgps/service/CommonService$g;->g:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getVolcanoOther()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 15
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/service/CommonService$g;->g:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getVolcanoOther()Ljava/lang/String;

    move-result-object v2

    const-class v3, Lcom/psk/eventmodule/StatFactory$VolcanoOther;

    invoke-virtual {v1, v2, v3}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/psk/eventmodule/StatFactory$VolcanoOther;

    invoke-virtual {p2, v1}, Lcom/join/mgps/dto/DownloadPointBase;->setPosition_path(Lcom/psk/eventmodule/StatFactory$VolcanoOther;)V

    .line 16
    :cond_0
    invoke-virtual {p2}, Lcom/join/mgps/dto/CollectionBeanSub;->getDownloadtaskDown()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v1

    .line 17
    iget v2, p0, Lcom/join/mgps/service/CommonService$g;->e:I

    invoke-virtual {v1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->set_from(I)V

    .line 18
    iget v2, p0, Lcom/join/mgps/service/CommonService$g;->f:I

    invoke-virtual {v1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->set_from_type(I)V

    .line 19
    iget-boolean v2, p0, Lcom/join/mgps/service/CommonService$g;->h:Z

    invoke-virtual {v1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setFromRecomDown(Z)V

    .line 20
    iget-object v2, p0, Lcom/join/mgps/service/CommonService$g;->i:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setKeyword(Ljava/lang/String;)V

    .line 21
    iget-object v2, p0, Lcom/join/mgps/service/CommonService$g;->g:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getPackagePath()Ljava/lang/String;

    move-result-object v2

    .line 22
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 23
    iget-object v2, p0, Lcom/join/mgps/service/CommonService$g;->g:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getPackagePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setGameZipPath(Ljava/lang/String;)V

    .line 24
    iget-object v2, p0, Lcom/join/mgps/service/CommonService$g;->g:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getPackagePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setPath(Ljava/lang/String;)V

    :cond_1
    if-eqz p1, :cond_2

    .line 25
    iget-object v2, p0, Lcom/join/mgps/service/CommonService$g;->g:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getGameId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/join/mgps/dto/DomainInfoBean;->setGameId(Ljava/lang/String;)V

    .line 26
    iget-object v2, p0, Lcom/join/mgps/service/CommonService$g;->g:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-virtual {v2, p1}, Lcom/join/mgps/dto/DownloadGameArgsBean;->setPdInfo(Lcom/join/mgps/dto/DomainInfoBean;)V

    .line 27
    :cond_2
    invoke-virtual {p2}, Lcom/join/mgps/dto/CollectionBeanSub;->getTag_info()Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/q1;->e(Ljava/util/ArrayList;)Z

    move-result p1

    .line 28
    invoke-static {}, Lcom/join/mgps/Util/q1;->q()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-static {}, Lcom/join/mgps/Util/q1;->s()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-static {}, Lcom/join/mgps/Util/q1;->m()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-static {}, Lcom/join/mgps/Util/q1;->n()Z

    move-result v2

    if-eqz v2, :cond_4

    :cond_3
    const/4 v0, 0x1

    :cond_4
    if-eqz v0, :cond_a

    .line 29
    invoke-virtual {p2}, Lcom/join/mgps/dto/CollectionBeanSub;->getWeb_disk_info()Lcom/join/mgps/dto/WebDiskInfo;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {p2}, Lcom/join/mgps/dto/CollectionBeanSub;->isCpsGame()Z

    move-result v0

    if-nez v0, :cond_a

    const/high16 v0, 0x10000000

    if-eqz p1, :cond_6

    .line 30
    invoke-virtual {p2}, Lcom/join/mgps/dto/CollectionBeanSub;->getWeb_disk_info()Lcom/join/mgps/dto/WebDiskInfo;

    move-result-object p1

    if-nez p1, :cond_5

    .line 31
    new-instance p1, Lcom/join/mgps/dto/WebDiskInfo;

    invoke-direct {p1}, Lcom/join/mgps/dto/WebDiskInfo;-><init>()V

    invoke-virtual {p2, p1}, Lcom/join/mgps/dto/CollectionBeanSub;->setWeb_disk_info(Lcom/join/mgps/dto/WebDiskInfo;)V

    .line 32
    :cond_5
    invoke-virtual {p2}, Lcom/join/mgps/dto/CollectionBeanSub;->getWeb_disk_info()Lcom/join/mgps/dto/WebDiskInfo;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/service/CommonService$g;->j:Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;

    invoke-virtual {v1}, Lcom/join/mgps/dto/QueryDownloadInfoRequestArgs;->getGameId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/join/mgps/dto/WebDiskInfo;->setGameId(Ljava/lang/String;)V

    .line 33
    iget-object p1, p0, Lcom/join/mgps/service/CommonService$g;->k:Lcom/join/mgps/service/CommonService;

    invoke-static {p1}, Lcom/join/mgps/service/CommonService;->h(Lcom/join/mgps/service/CommonService;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/activity/QuarkDownGameActivity_;->i0(Landroid/content/Context;)Lcom/join/mgps/activity/QuarkDownGameActivity_$a;

    move-result-object p1

    invoke-virtual {p1, v0}, Lorg/androidannotations/api/builder/e;->flags(I)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/QuarkDownGameActivity_$a;

    invoke-virtual {p2}, Lcom/join/mgps/dto/CollectionBeanSub;->getWeb_disk_info()Lcom/join/mgps/dto/WebDiskInfo;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/QuarkDownGameActivity_$a;->e(Lcom/join/mgps/dto/WebDiskInfo;)Lcom/join/mgps/activity/QuarkDownGameActivity_$a;

    move-result-object p1

    invoke-virtual {p2}, Lcom/join/mgps/dto/CollectionBeanSub;->getExt_info()Lcom/join/mgps/dto/ExtInfoBean;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/QuarkDownGameActivity_$a;->a(Lcom/join/mgps/dto/ExtInfoBean;)Lcom/join/mgps/activity/QuarkDownGameActivity_$a;

    move-result-object p1

    invoke-virtual {p2}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_id()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/QuarkDownGameActivity_$a;->c(Ljava/lang/String;)Lcom/join/mgps/activity/QuarkDownGameActivity_$a;

    move-result-object p1

    invoke-virtual {p2}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/QuarkDownGameActivity_$a;->d(Ljava/lang/String;)Lcom/join/mgps/activity/QuarkDownGameActivity_$a;

    move-result-object p1

    invoke-virtual {p2}, Lcom/join/mgps/dto/CollectionBeanSub;->getIco_remote()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/QuarkDownGameActivity_$a;->b(Ljava/lang/String;)Lcom/join/mgps/activity/QuarkDownGameActivity_$a;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_0

    .line 34
    :cond_6
    invoke-static {}, Lcom/join/mgps/Util/q1;->g()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {}, Lcom/join/mgps/Util/q1;->q()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-virtual {p2}, Lcom/join/mgps/dto/CollectionBeanSub;->getTag_info()Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/UtilsMy;->o2(Ljava/util/List;)Z

    move-result p1

    if-nez p1, :cond_8

    :cond_7
    invoke-static {}, Lcom/join/mgps/Util/q1;->n()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-virtual {p2}, Lcom/join/mgps/dto/CollectionBeanSub;->getPlugin_num()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Lcom/join/mgps/Util/UtilsMy;->m2(I)Z

    move-result p1

    if-eqz p1, :cond_9

    .line 35
    :cond_8
    new-instance p1, Lcom/join/mgps/dto/DownloadArgs;

    invoke-direct {p1}, Lcom/join/mgps/dto/DownloadArgs;-><init>()V

    .line 36
    iget-object v2, p0, Lcom/join/mgps/service/CommonService$g;->g:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getExt()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Lcom/join/mgps/dto/DownloadPointBase;->setExt(Ljava/lang/String;)V

    .line 37
    invoke-static {v1}, Lcom/php25/PDownload/d;->h(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 38
    invoke-virtual {p1, v1}, Lcom/join/mgps/dto/DownloadArgs;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 39
    invoke-virtual {p1, p2}, Lcom/join/mgps/dto/DownloadArgs;->setGameInfo(Lcom/join/mgps/dto/CollectionBeanSub;)V

    .line 40
    iget-object v1, p0, Lcom/join/mgps/service/CommonService$g;->g:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/DownloadGameArgsBean;->getFrom()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/join/mgps/dto/DownloadArgs;->setFrom(I)V

    .line 41
    iget-object v1, p0, Lcom/join/mgps/service/CommonService$g;->k:Lcom/join/mgps/service/CommonService;

    invoke-static {v1}, Lcom/join/mgps/service/CommonService;->h(Lcom/join/mgps/service/CommonService;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/activity/QuarkPromptActivity_;->n0(Landroid/content/Context;)Lcom/join/mgps/activity/QuarkPromptActivity_$d;

    move-result-object v1

    invoke-virtual {v1, v0}, Lorg/androidannotations/api/builder/e;->flags(I)Lorg/androidannotations/api/builder/e;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/activity/QuarkPromptActivity_$d;

    invoke-virtual {p2}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/join/mgps/activity/QuarkPromptActivity_$d;->b(Ljava/lang/String;)Lcom/join/mgps/activity/QuarkPromptActivity_$d;

    move-result-object p2

    .line 42
    invoke-virtual {p2, p1}, Lcom/join/mgps/activity/QuarkPromptActivity_$d;->a(Lcom/join/mgps/dto/DownloadArgs;)Lcom/join/mgps/activity/QuarkPromptActivity_$d;

    move-result-object p1

    .line 43
    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto :goto_0

    .line 44
    :cond_9
    iget-object p1, p0, Lcom/join/mgps/service/CommonService$g;->k:Lcom/join/mgps/service/CommonService;

    iget-object v0, p0, Lcom/join/mgps/service/CommonService$g;->g:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-static {p1, v0, p2, v1}, Lcom/join/mgps/service/CommonService;->j(Lcom/join/mgps/service/CommonService;Lcom/join/mgps/dto/DownloadGameArgsBean;Lcom/join/mgps/dto/CollectionBeanSub;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    :cond_a
    if-eqz p1, :cond_b

    .line 45
    sget-object p1, Lcom/join/mgps/enums/Dtype;->android:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setFileType(Ljava/lang/String;)V

    .line 46
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setRomType(Ljava/lang/String;)V

    .line 47
    :cond_b
    iget-object p1, p0, Lcom/join/mgps/service/CommonService$g;->k:Lcom/join/mgps/service/CommonService;

    iget-object v0, p0, Lcom/join/mgps/service/CommonService$g;->g:Lcom/join/mgps/dto/DownloadGameArgsBean;

    invoke-static {p1, v0, p2, v1}, Lcom/join/mgps/service/CommonService;->j(Lcom/join/mgps/service/CommonService;Lcom/join/mgps/dto/DownloadGameArgsBean;Lcom/join/mgps/dto/CollectionBeanSub;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 48
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 49
    iget-object p1, p0, Lcom/join/mgps/service/CommonService$g;->k:Lcom/join/mgps/service/CommonService;

    const-string p2, "\u83b7\u53d6\u6e38\u620f\u4fe1\u606f\u5931\u8d25"

    invoke-virtual {p1, p2}, Lcom/join/mgps/service/CommonService;->H1(Ljava/lang/String;)V

    :cond_c
    :goto_0
    return-void
.end method
