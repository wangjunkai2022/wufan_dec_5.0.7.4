.class Lcom/join/mgps/service/CommonService$m;
.super Ljava/lang/Object;
.source "CommonService.java"

# interfaces
.implements Lretrofit2/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/service/CommonService;->U(Ljava/lang/String;Ljava/lang/String;Z)V
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

.field final synthetic c:Z

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lcom/join/mgps/service/CommonService;


# direct methods
.method constructor <init>(Lcom/join/mgps/service/CommonService;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/service/CommonService$m;->e:Lcom/join/mgps/service/CommonService;

    iput-object p2, p0, Lcom/join/mgps/service/CommonService$m;->b:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/join/mgps/service/CommonService$m;->c:Z

    iput-object p4, p0, Lcom/join/mgps/service/CommonService$m;->d:Ljava/lang/String;

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

    return-void
.end method

.method public onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 5
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

    if-eqz p2, :cond_4

    .line 1
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/ResponseModel;

    if-eqz p1, :cond_4

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_4

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/activity/mygame/data/DataGameListBean;

    invoke-virtual {p2}, Lcom/join/mgps/activity/mygame/data/DataGameListBean;->getGameList()Ljava/util/List;

    move-result-object p2

    const/high16 v0, 0x10000000

    if-eqz p2, :cond_2

    .line 4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_2

    .line 5
    new-instance v1, Lcom/join/mgps/activity/recomend/DownloadCenterTuijianMain;

    invoke-direct {v1}, Lcom/join/mgps/activity/recomend/DownloadCenterTuijianMain;-><init>()V

    .line 6
    iget-object v2, p0, Lcom/join/mgps/service/CommonService$m;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/join/mgps/activity/recomend/DownloadCenterTuijianMain;->setGameid(Ljava/lang/String;)V

    .line 7
    invoke-virtual {v1, p2}, Lcom/join/mgps/activity/recomend/DownloadCenterTuijianMain;->setCollectionList(Ljava/util/List;)V

    .line 8
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/mygame/data/DataGameListBean;

    invoke-virtual {p1}, Lcom/join/mgps/activity/mygame/data/DataGameListBean;->getJumpInfo()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/join/mgps/activity/recomend/DownloadCenterTuijianMain;->setJumpInfo(Lcom/join/mgps/dto/CommonGameInfoBean;)V

    .line 9
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/join/android/app/common/utils/JsonMapper;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 10
    iget-object p2, p0, Lcom/join/mgps/service/CommonService$m;->e:Lcom/join/mgps/service/CommonService;

    iget-object p2, p2, Lcom/join/mgps/service/CommonService;->c:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p2}, Lcom/join/mgps/pref/PrefDef_;->recomDataJson()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object p2

    invoke-virtual {p2, p1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 11
    new-instance p1, Landroid/content/Intent;

    const-string p2, "com.hasget.new.recomdwon,data"

    invoke-direct {p1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 12
    iget-object p2, p0, Lcom/join/mgps/service/CommonService$m;->e:Lcom/join/mgps/service/CommonService;

    invoke-static {p2}, Lcom/join/mgps/service/CommonService;->h(Lcom/join/mgps/service/CommonService;)Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 13
    iget-boolean p1, p0, Lcom/join/mgps/service/CommonService$m;->c:Z

    if-nez p1, :cond_4

    .line 14
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p1

    iget-object p2, p0, Lcom/join/mgps/service/CommonService$m;->b:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 15
    sget-boolean p1, Lcom/join/mgps/service/CommonService;->V:Z

    if-eqz p1, :cond_4

    .line 16
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p1

    iget-object p2, p0, Lcom/join/mgps/service/CommonService$m;->b:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    .line 17
    iget-object p2, p0, Lcom/join/mgps/service/CommonService$m;->e:Lcom/join/mgps/service/CommonService;

    invoke-static {p2}, Lcom/join/mgps/service/CommonService;->h(Lcom/join/mgps/service/CommonService;)Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/join/mgps/pref/h;->n(Landroid/content/Context;)Lcom/join/mgps/pref/h;

    move-result-object p2

    invoke-virtual {p2}, Lcom/join/mgps/pref/h;->x()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 18
    iget-object p1, p0, Lcom/join/mgps/service/CommonService$m;->e:Lcom/join/mgps/service/CommonService;

    invoke-static {p1}, Lcom/join/mgps/service/CommonService;->h(Lcom/join/mgps/service/CommonService;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/activity/recomend/GamedownloadRecomdActivity_;->intent(Landroid/content/Context;)Lcom/join/mgps/activity/recomend/GamedownloadRecomdActivity_$IntentBuilder_;

    move-result-object p1

    invoke-virtual {p1, v0}, Lorg/androidannotations/api/builder/e;->flags(I)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/recomend/GamedownloadRecomdActivity_$IntentBuilder_;

    iget-object p2, p0, Lcom/join/mgps/service/CommonService$m;->d:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/recomend/GamedownloadRecomdActivity_$IntentBuilder_;->gameName(Ljava/lang/String;)Lcom/join/mgps/activity/recomend/GamedownloadRecomdActivity_$IntentBuilder_;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_0

    :cond_0
    if-eqz p1, :cond_4

    .line 19
    new-instance p2, Lcom/join/mgps/pref/PrefDef_;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService$m;->e:Lcom/join/mgps/service/CommonService;

    invoke-static {v1}, Lcom/join/mgps/service/CommonService;->h(Lcom/join/mgps/service/CommonService;)Landroid/content/Context;

    move-result-object v1

    invoke-direct {p2, v1}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2}, Lcom/join/mgps/pref/PrefDef_;->downloadSpeedUpGameSize()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object p2

    invoke-virtual {p2}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    int-to-long v1, p2

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getActual_size()J

    move-result-wide v3

    cmp-long p2, v1, v3

    if-gtz p2, :cond_4

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFileType()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFileType()Ljava/lang/String;

    move-result-object p2

    sget-object v1, Lcom/join/mgps/enums/Dtype;->chajian:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    :cond_1
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->isDisableShowSpeedUpPrompt()Z

    move-result p2

    if-nez p2, :cond_4

    iget-object p2, p0, Lcom/join/mgps/service/CommonService$m;->e:Lcom/join/mgps/service/CommonService;

    invoke-static {p2}, Lcom/join/mgps/service/CommonService;->h(Lcom/join/mgps/service/CommonService;)Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/join/mgps/Util/UtilsMy;->c0(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 20
    iget-object p1, p0, Lcom/join/mgps/service/CommonService$m;->e:Lcom/join/mgps/service/CommonService;

    invoke-static {p1}, Lcom/join/mgps/service/CommonService;->h(Lcom/join/mgps/service/CommonService;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/activity/recomend/GamedownloadRecomdActivity2_;->intent(Landroid/content/Context;)Lcom/join/mgps/activity/recomend/GamedownloadRecomdActivity2_$IntentBuilder_;

    move-result-object p1

    invoke-virtual {p1, v0}, Lorg/androidannotations/api/builder/e;->flags(I)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/recomend/GamedownloadRecomdActivity2_$IntentBuilder_;

    iget-object p2, p0, Lcom/join/mgps/service/CommonService$m;->d:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/recomend/GamedownloadRecomdActivity2_$IntentBuilder_;->gameName(Ljava/lang/String;)Lcom/join/mgps/activity/recomend/GamedownloadRecomdActivity2_$IntentBuilder_;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto/16 :goto_0

    .line 21
    :cond_2
    iget-boolean p1, p0, Lcom/join/mgps/service/CommonService$m;->c:Z

    if-nez p1, :cond_4

    .line 22
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p1

    iget-object p2, p0, Lcom/join/mgps/service/CommonService$m;->b:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 23
    new-instance p2, Lcom/join/mgps/pref/PrefDef_;

    iget-object v1, p0, Lcom/join/mgps/service/CommonService$m;->e:Lcom/join/mgps/service/CommonService;

    invoke-static {v1}, Lcom/join/mgps/service/CommonService;->h(Lcom/join/mgps/service/CommonService;)Landroid/content/Context;

    move-result-object v1

    invoke-direct {p2, v1}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2}, Lcom/join/mgps/pref/PrefDef_;->downloadSpeedUpGameSize()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object p2

    invoke-virtual {p2}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    int-to-long v1, p2

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getActual_size()J

    move-result-wide v3

    cmp-long p2, v1, v3

    if-gtz p2, :cond_4

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFileType()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_3

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFileType()Ljava/lang/String;

    move-result-object p2

    sget-object v1, Lcom/join/mgps/enums/Dtype;->chajian:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    :cond_3
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->isDisableShowSpeedUpPrompt()Z

    move-result p2

    if-nez p2, :cond_4

    iget-object p2, p0, Lcom/join/mgps/service/CommonService$m;->e:Lcom/join/mgps/service/CommonService;

    invoke-static {p2}, Lcom/join/mgps/service/CommonService;->h(Lcom/join/mgps/service/CommonService;)Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/join/mgps/Util/UtilsMy;->c0(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 24
    iget-object p1, p0, Lcom/join/mgps/service/CommonService$m;->e:Lcom/join/mgps/service/CommonService;

    invoke-static {p1}, Lcom/join/mgps/service/CommonService;->h(Lcom/join/mgps/service/CommonService;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/activity/recomend/GamedownloadRecomdActivity2_;->intent(Landroid/content/Context;)Lcom/join/mgps/activity/recomend/GamedownloadRecomdActivity2_$IntentBuilder_;

    move-result-object p1

    invoke-virtual {p1, v0}, Lorg/androidannotations/api/builder/e;->flags(I)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/recomend/GamedownloadRecomdActivity2_$IntentBuilder_;

    iget-object p2, p0, Lcom/join/mgps/service/CommonService$m;->d:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/recomend/GamedownloadRecomdActivity2_$IntentBuilder_;->gameName(Ljava/lang/String;)Lcom/join/mgps/activity/recomend/GamedownloadRecomdActivity2_$IntentBuilder_;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    :cond_4
    :goto_0
    return-void
.end method
