.class public Lcom/join/mgps/activity/SearchHintActivity$o;
.super Ljava/lang/Object;
.source "SearchHintActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/SearchHintActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "o"
.end annotation


# instance fields
.field b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

.field c:Landroid/content/Context;

.field d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/join/mgps/business/CollectionBeanSubBusiness;Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    .line 3
    iput-object p2, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->c:Landroid/content/Context;

    .line 4
    iput-object p3, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method a(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    new-instance v0, Lcom/join/mgps/dto/ExtBean;

    invoke-direct {v0}, Lcom/join/mgps/dto/ExtBean;-><init>()V

    const-string v1, "103"

    .line 2
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ExtBean;->setFrom(Ljava/lang/String;)V

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ExtBean;->setLocation(Ljava/lang/String;)V

    .line 4
    invoke-static {v0}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-virtual {p1, v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setExt(Ljava/lang/String;)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {p1}, Lcom/join/mgps/business/CollectionBeanSubBusiness;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    const/4 v0, 0x6

    const/4 v1, 0x1

    if-nez p1, :cond_9

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->isCpsGame()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/join/mgps/Util/s0;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getTag_info()Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/s0;->a(Ljava/util/List;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-static {}, Lcom/join/mgps/Util/s0;->b()V

    return-void

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object p1

    if-nez p1, :cond_5

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getTag_info()Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/UtilsMy;->o0(Ljava/util/List;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object p1

    if-nez p1, :cond_2

    .line 7
    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->c:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object p1

    iget-object v2, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->c:Landroid/content/Context;

    iget-object v3, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v3}, Lcom/join/mgps/dto/CollectionBeanSub;->getPackage_name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v2, v3}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 8
    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->c:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object p1

    iget-object v2, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->c:Landroid/content/Context;

    iget-object v3, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v3}, Lcom/join/mgps/dto/CollectionBeanSub;->getPackage_name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v2, v3}, Lcom/join/android/app/common/utils/APKUtils;->l(Landroid/content/Context;Ljava/lang/String;)Lcom/join/android/app/common/utils/APKUtils$a;

    move-result-object p1

    .line 9
    iget-object v2, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionBeanSub;->getVer()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p1}, Lcom/join/android/app/common/utils/APKUtils$a;->d()I

    move-result p1

    iget-object v2, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionBeanSub;->getVer()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    if-ge p1, v2, :cond_1

    goto :goto_0

    .line 10
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->c:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->c:Landroid/content/Context;

    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getPackage_name()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/join/android/app/common/utils/APKUtils;->a0(Landroid/content/Context;Ljava/lang/String;)Z

    return-void

    .line 11
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->c:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->c:Landroid/content/Context;

    iget-object v1, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getPackage_name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    .line 12
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getPackage_name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/va/overmind/d;->F(Ljava/lang/String;)Z

    move-result v0

    if-nez p1, :cond_3

    if-eqz v0, :cond_4

    .line 13
    :cond_3
    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->c:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->c:Landroid/content/Context;

    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/join/android/app/common/utils/APKUtils;->V(Landroid/content/Context;Lcom/join/mgps/dto/ModInfoBean;)V

    :cond_4
    return-void

    .line 14
    :cond_5
    :goto_0
    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getBespeak_switch()I

    move-result p1

    if-ne p1, v1, :cond_8

    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getDown_status()I

    move-result p1

    if-ne p1, v0, :cond_8

    .line 15
    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object p1

    if-eqz p1, :cond_6

    .line 16
    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/ModInfoBean;->getMod_game_id()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    .line 17
    :cond_6
    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_id()Ljava/lang/String;

    move-result-object p1

    .line 18
    :goto_1
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_book()I

    move-result v0

    if-nez v0, :cond_7

    .line 19
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/service/CommonService_;->S2(Landroid/content/Context;)Lcom/join/mgps/service/CommonService_$h2;

    move-result-object v0

    const-string v1, "onClickGamebeSpeakGameId"

    invoke-virtual {v0, v1, p1}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Ljava/lang/String;)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/service/CommonService_$h2;

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/g;->a()Landroid/content/ComponentName;

    return-void

    .line 20
    :cond_7
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_book()I

    move-result v0

    if-ne v0, v1, :cond_8

    .line 21
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/service/CommonService_;->S2(Landroid/content/Context;)Lcom/join/mgps/service/CommonService_$h2;

    move-result-object v0

    const-string v1, "onClickUnGamebeSpeakGameId"

    invoke-virtual {v0, v1, p1}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Ljava/lang/String;)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/service/CommonService_$h2;

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/g;->a()Landroid/content/ComponentName;

    return-void

    .line 22
    :cond_8
    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/DownloadPointBase;->setWhere(Ljava/lang/String;)V

    .line 23
    new-instance p1, Lcom/join/mgps/dto/ExtBean;

    invoke-direct {p1}, Lcom/join/mgps/dto/ExtBean;-><init>()V

    .line 24
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v0}, Lcom/join/mgps/dto/DownloadPointBase;->getReMarks()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/ExtBean;->setReMarks(Ljava/lang/String;)Lcom/join/mgps/dto/ExtBean;

    const/16 v0, 0x70

    .line 25
    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/ExtBean;->set_from_type(I)Lcom/join/mgps/dto/ExtBean;

    const-string v0, "103"

    .line 26
    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/ExtBean;->setFrom(Ljava/lang/String;)V

    .line 27
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/ExtBean;->setWhere(Ljava/lang/String;)V

    .line 28
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/ExtBean;->setKeyword(Ljava/lang/String;)V

    .line 29
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v1, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/join/mgps/dto/DownloadPointBase;->setExt(Ljava/lang/String;)V

    .line 30
    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->c:Landroid/content/Context;

    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->Y0(Landroid/content/Context;Lcom/join/mgps/dto/CollectionBeanSub;)V

    return-void

    :cond_9
    if-eqz p1, :cond_a

    .line 31
    iget-object v2, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->d:Ljava/lang/String;

    invoke-virtual {p1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setKeyword(Ljava/lang/String;)V

    .line 32
    invoke-virtual {p1, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->set_from(I)V

    .line 33
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/SearchHintActivity$o;->a(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 34
    :cond_a
    iget-object v1, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getPlugin_num()Ljava/lang/String;

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

    if-eqz v1, :cond_b

    .line 35
    new-instance v0, Lcom/join/mgps/Util/IntentDateBean;

    invoke-direct {v0}, Lcom/join/mgps/Util/IntentDateBean;-><init>()V

    const/4 v1, 0x4

    .line 36
    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type(I)V

    .line 37
    iget-object v1, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getDown_url_remote()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type_val(Ljava/lang/String;)V

    .line 38
    iget-object v1, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->c:Landroid/content/Context;

    invoke-static {p1, v1}, Lcom/join/mgps/Util/UtilsMy;->T2(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    .line 39
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->c:Landroid/content/Context;

    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    return-void

    :cond_b
    const/4 v1, 0x0

    if-eqz p1, :cond_c

    .line 40
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v1

    .line 41
    :cond_c
    iget-object v2, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionBeanSub;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v2

    iget-object v3, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v3}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v2

    const/16 v3, 0x2b

    if-lez v2, :cond_d

    const/16 v1, 0x2b

    :cond_d
    const/4 v2, 0x5

    if-eqz v1, :cond_15

    const/16 v4, 0xd

    if-eq v1, v4, :cond_14

    const/4 v4, 0x2

    if-eq v1, v4, :cond_13

    const/4 v4, 0x3

    if-eq v1, v4, :cond_12

    if-eq v1, v2, :cond_11

    if-eq v1, v0, :cond_12

    const/4 v0, 0x7

    if-eq v1, v0, :cond_15

    const/16 v0, 0x2a

    const-string v4, "\u65e0\u7f51\u7edc\u8fde\u63a5"

    if-eq v1, v0, :cond_f

    if-eq v1, v3, :cond_15

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_2

    .line 42
    :pswitch_0
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->c:Landroid/content/Context;

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->a4(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto/16 :goto_2

    .line 43
    :pswitch_1
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_e

    .line 44
    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->c:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    invoke-virtual {p1, v4}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void

    .line 45
    :cond_e
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->c:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/join/mgps/Util/UtilsMy;->r4(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_2

    .line 46
    :cond_f
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_10

    .line 47
    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->c:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    invoke-virtual {p1, v4}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void

    .line 48
    :cond_10
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->c:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/join/mgps/Util/UtilsMy;->I2(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_2

    .line 49
    :cond_11
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->c:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/join/mgps/Util/UtilsMy;->T3(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_2

    .line 50
    :cond_12
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->c:Landroid/content/Context;

    invoke-static {p1, v0}, Lcom/php25/PDownload/d;->c(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto/16 :goto_2

    .line 51
    :cond_13
    :pswitch_2
    invoke-static {p1}, Lcom/php25/PDownload/d;->i(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_2

    .line 52
    :cond_14
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->c:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/php25/PDownload/d;->l(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    .line 53
    :cond_15
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    if-eqz v0, :cond_19

    .line 54
    new-instance v0, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v0}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string v1, "searchSuggest"

    .line 55
    invoke-virtual {v0, v1}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 56
    iget-object v1, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 57
    iget-object v1, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->c:Landroid/content/Context;

    invoke-static {v1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v1

    sget-object v3, Lcom/papa/sim/statistic/Event;->downloadFromSearchResult:Lcom/papa/sim/statistic/Event;

    invoke-virtual {v1, v3, v0}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 58
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->y0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_16

    .line 59
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->c:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/join/mgps/Util/UtilsMy;->d4(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_2

    .line 60
    :cond_16
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->y1(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/CollectionBeanSub;)V

    .line 61
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->c:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/join/mgps/Util/UtilsMy;->o1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v0

    if-eqz v0, :cond_17

    goto :goto_2

    .line 62
    :cond_17
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getDown_status()I

    move-result v0

    if-ne v0, v2, :cond_18

    .line 63
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->c:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/join/mgps/Util/UtilsMy;->l1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    .line 64
    :cond_18
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->c:Landroid/content/Context;

    iget-object v1, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getTp_down_url()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionBeanSub;->getOther_down_switch()I

    move-result v2

    iget-object v3, p0, Lcom/join/mgps/activity/SearchHintActivity$o;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v3}, Lcom/join/mgps/dto/CollectionBeanSub;->getCdn_down_switch()I

    move-result v3

    invoke-static {v0, p1, v1, v2, v3}, Lcom/join/mgps/Util/UtilsMy;->R0(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/util/List;II)V

    :cond_19
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method
