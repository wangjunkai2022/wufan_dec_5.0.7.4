.class Lcom/join/mgps/adapter/SearchGameListAdapter$h;
.super Ljava/lang/Object;
.source "SearchGameListAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/SearchGameListAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "h"
.end annotation


# instance fields
.field b:Lcom/join/mgps/dto/CommonGameInfoBean;

.field final synthetic c:Lcom/join/mgps/adapter/SearchGameListAdapter;


# direct methods
.method public constructor <init>(Lcom/join/mgps/adapter/SearchGameListAdapter;Lcom/join/mgps/dto/CommonGameInfoBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$h;->c:Lcom/join/mgps/adapter/SearchGameListAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$h;->b:Lcom/join/mgps/dto/CommonGameInfoBean;

    return-void
.end method

.method public static synthetic a(Lcom/join/mgps/adapter/SearchGameListAdapter$h;Landroid/content/Context;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/SearchGameListAdapter$h;->b(Landroid/content/Context;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private synthetic b(Landroid/content/Context;Landroid/view/View;)Lkotlin/Unit;
    .locals 3

    .line 1
    invoke-static {p1}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 2
    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    const-string p2, "\u7f51\u7edc\u8fde\u63a5\u5f02\u5e38"

    invoke-virtual {p1, p2}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-object v1

    :cond_0
    const v0, 0x7f090fea

    .line 3
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v2, 0x0

    .line 4
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    const v0, 0x7f090e0d

    .line 5
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    if-eqz p2, :cond_2

    const-string v0, ""

    .line 6
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    :cond_2
    iget-object p2, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$h;->b:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-static {p1, p2}, Lcom/join/mgps/Util/UtilsMy;->F2(Landroid/content/Context;Lcom/join/mgps/dto/CommonGameInfoBean;)V

    return-object v1
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$h;->b:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v1

    .line 3
    iget-object v2, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$h;->b:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v2

    if-eqz v2, :cond_13

    .line 4
    invoke-virtual {v2}, Lcom/join/mgps/dto/GInfoBean;->isCpsGame()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {}, Lcom/join/mgps/Util/s0;->c()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Lcom/join/mgps/dto/GInfoBean;->getTag_info()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/Util/s0;->a(Ljava/util/List;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 5
    invoke-static {}, Lcom/join/mgps/Util/s0;->b()V

    return-void

    :cond_0
    const/4 v3, 0x0

    const-string v4, ""

    if-nez v1, :cond_6

    .line 6
    iget-object v1, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$h;->c:Lcom/join/mgps/adapter/SearchGameListAdapter;

    iget-object v2, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$h;->b:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {v1, v2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->t(Lcom/join/mgps/dto/CommonGameInfoBean;)V

    .line 7
    iget-object v1, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$h;->b:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/CommonGameInfoBean;->isGameVm()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$h;->b:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/CommonGameInfoBean;->isMiniGame()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$h;->b:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/CommonGameInfoBean;->is64Bit()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 8
    iget-object v1, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$h;->b:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-static {v0, v1}, Lcom/join/android/app/common/utils/APKUtils;->c(Landroid/content/Context;Lcom/join/mgps/dto/CommonGameInfoBean;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    .line 9
    :cond_1
    new-instance v1, Lcom/join/mgps/adapter/h5;

    invoke-direct {v1, p0, v0, p1}, Lcom/join/mgps/adapter/h5;-><init>(Lcom/join/mgps/adapter/SearchGameListAdapter$h;Landroid/content/Context;Landroid/view/View;)V

    invoke-static {v0, v1}, Lcom/join/android/app/common/utils/APKUtils;->g(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-void

    .line 10
    :cond_2
    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 11
    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    const-string v0, "\u7f51\u7edc\u8fde\u63a5\u5f02\u5e38"

    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void

    :cond_3
    const v1, 0x7f090fea

    .line 12
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 13
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_4
    const v1, 0x7f090e0d

    .line 14
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_5

    .line 15
    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    :cond_5
    iget-object p1, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$h;->b:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-static {v0, p1}, Lcom/join/mgps/Util/UtilsMy;->F2(Landroid/content/Context;Lcom/join/mgps/dto/CommonGameInfoBean;)V

    return-void

    .line 17
    :cond_6
    invoke-virtual {v2}, Lcom/join/mgps/dto/GInfoBean;->getPlugin_num()Ljava/lang/String;

    move-result-object p1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v6, Lcom/join/mgps/enums/ConstantIntEnum;->H5:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v6}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 18
    new-instance p1, Lcom/join/mgps/Util/IntentDateBean;

    invoke-direct {p1}, Lcom/join/mgps/Util/IntentDateBean;-><init>()V

    .line 19
    new-instance v2, Lcom/join/mgps/dto/ExtBean;

    invoke-direct {v2}, Lcom/join/mgps/dto/ExtBean;-><init>()V

    .line 20
    iget-object v3, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$h;->b:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/DownloadPointBase;->getReMarks()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/ExtBean;->setReMarks(Ljava/lang/String;)Lcom/join/mgps/dto/ExtBean;

    .line 21
    invoke-virtual {p1, v2}, Lcom/join/mgps/Util/IntentDateBean;->setExtBean(Lcom/join/mgps/dto/ExtBean;)V

    const/4 v2, 0x4

    .line 22
    invoke-virtual {p1, v2}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type(I)V

    .line 23
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getDown_url_remote()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type_val(Ljava/lang/String;)V

    .line 24
    invoke-static {v1, v0}, Lcom/join/mgps/Util/UtilsMy;->T2(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    .line 25
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v1

    invoke-virtual {v1, v0, p1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    return-void

    :cond_7
    if-eqz v1, :cond_8

    .line 26
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v3

    .line 27
    :cond_8
    invoke-virtual {v2}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object p1

    invoke-virtual {v2}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result p1

    const/16 v2, 0x2b

    if-lez p1, :cond_9

    const/16 v3, 0x2b

    :cond_9
    if-eqz v3, :cond_12

    const/16 p1, 0xd

    if-eq v3, p1, :cond_11

    const/4 p1, 0x2

    if-eq v3, p1, :cond_f

    const/4 p1, 0x3

    if-eq v3, p1, :cond_d

    const/4 p1, 0x5

    if-eq v3, p1, :cond_c

    const/4 p1, 0x6

    if-eq v3, p1, :cond_d

    const/4 p1, 0x7

    if-eq v3, p1, :cond_12

    const/16 p1, 0x2a

    if-eq v3, p1, :cond_b

    if-eq v3, v2, :cond_12

    packed-switch v3, :pswitch_data_0

    goto/16 :goto_0

    .line 28
    :pswitch_0
    invoke-static {v1, v0}, Lcom/join/mgps/Util/UtilsMy;->a4(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto/16 :goto_0

    .line 29
    :pswitch_1
    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_a

    .line 30
    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    const-string v0, "\u65e0\u7f51\u7edc\u8fde\u63a5"

    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void

    .line 31
    :cond_a
    iget-object p1, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$h;->b:Lcom/join/mgps/dto/CommonGameInfoBean;

    iget-object v2, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$h;->c:Lcom/join/mgps/adapter/SearchGameListAdapter;

    invoke-static {v2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->r(Lcom/join/mgps/adapter/SearchGameListAdapter;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->setKeyword(Ljava/lang/String;)V

    .line 32
    iget-object p1, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$h;->c:Lcom/join/mgps/adapter/SearchGameListAdapter;

    iget-object v2, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$h;->b:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {p1, v2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->t(Lcom/join/mgps/dto/CommonGameInfoBean;)V

    .line 33
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$h;->b:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-static {v0, p1, v1}, Lcom/join/mgps/Util/UtilsMy;->H2(Landroid/content/Context;Ljava/lang/String;Lcom/join/mgps/dto/CommonGameInfoBean;)V

    goto/16 :goto_0

    .line 34
    :cond_b
    iget-object p1, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$h;->b:Lcom/join/mgps/dto/CommonGameInfoBean;

    iget-object v1, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$h;->c:Lcom/join/mgps/adapter/SearchGameListAdapter;

    invoke-static {v1}, Lcom/join/mgps/adapter/SearchGameListAdapter;->r(Lcom/join/mgps/adapter/SearchGameListAdapter;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/join/mgps/dto/CommonGameInfoBean;->setKeyword(Ljava/lang/String;)V

    .line 35
    iget-object p1, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$h;->c:Lcom/join/mgps/adapter/SearchGameListAdapter;

    iget-object v1, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$h;->b:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {p1, v1}, Lcom/join/mgps/adapter/SearchGameListAdapter;->t(Lcom/join/mgps/dto/CommonGameInfoBean;)V

    .line 36
    iget-object p1, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$h;->b:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-static {v0, p1}, Lcom/join/mgps/Util/UtilsMy;->s4(Landroid/content/Context;Lcom/join/mgps/dto/CommonGameInfoBean;)V

    goto :goto_0

    .line 37
    :cond_c
    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->T3(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 38
    :cond_d
    iget-object p1, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$h;->b:Lcom/join/mgps/dto/CommonGameInfoBean;

    iget-object v2, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$h;->c:Lcom/join/mgps/adapter/SearchGameListAdapter;

    invoke-static {v2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->r(Lcom/join/mgps/adapter/SearchGameListAdapter;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->setKeyword(Ljava/lang/String;)V

    .line 39
    iget-object p1, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$h;->c:Lcom/join/mgps/adapter/SearchGameListAdapter;

    iget-object v2, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$h;->b:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {p1, v2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->t(Lcom/join/mgps/dto/CommonGameInfoBean;)V

    .line 40
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->isMiniGame()Z

    move-result p1

    if-eqz p1, :cond_e

    .line 41
    invoke-static {v0, v1}, Lcom/join/android/app/common/utils/APKUtils;->U(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 42
    :cond_e
    invoke-static {v1, v0}, Lcom/php25/PDownload/d;->c(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto :goto_0

    .line 43
    :cond_f
    :pswitch_2
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->isMiniGame()Z

    move-result p1

    if-eqz p1, :cond_10

    .line 44
    invoke-static {v0, v1}, Lcom/join/android/app/common/utils/APKUtils;->U(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 45
    :cond_10
    invoke-static {v1}, Lcom/php25/PDownload/d;->i(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 46
    :cond_11
    invoke-static {v0, v1}, Lcom/php25/PDownload/d;->l(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 47
    :cond_12
    iget-object p1, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$h;->b:Lcom/join/mgps/dto/CommonGameInfoBean;

    iget-object v2, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$h;->c:Lcom/join/mgps/adapter/SearchGameListAdapter;

    invoke-static {v2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->r(Lcom/join/mgps/adapter/SearchGameListAdapter;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->setKeyword(Ljava/lang/String;)V

    .line 48
    iget-object p1, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$h;->c:Lcom/join/mgps/adapter/SearchGameListAdapter;

    iget-object v2, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$h;->b:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {p1, v2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->t(Lcom/join/mgps/dto/CommonGameInfoBean;)V

    .line 49
    iget-object p1, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$h;->b:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-static {v0, p1}, Lcom/join/mgps/Util/UtilsMy;->F2(Landroid/content/Context;Lcom/join/mgps/dto/CommonGameInfoBean;)V

    .line 50
    iget-object p1, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$h;->c:Lcom/join/mgps/adapter/SearchGameListAdapter;

    invoke-static {p1}, Lcom/join/mgps/adapter/SearchGameListAdapter;->s(Lcom/join/mgps/adapter/SearchGameListAdapter;)Lcom/join/mgps/adapter/SearchGameListAdapter$f;

    move-result-object p1

    if-eqz p1, :cond_13

    .line 51
    iget-object p1, p0, Lcom/join/mgps/adapter/SearchGameListAdapter$h;->c:Lcom/join/mgps/adapter/SearchGameListAdapter;

    invoke-static {p1}, Lcom/join/mgps/adapter/SearchGameListAdapter;->s(Lcom/join/mgps/adapter/SearchGameListAdapter;)Lcom/join/mgps/adapter/SearchGameListAdapter$f;

    move-result-object p1

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/join/mgps/adapter/SearchGameListAdapter$f;->e(Ljava/lang/String;)V

    :cond_13
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method
