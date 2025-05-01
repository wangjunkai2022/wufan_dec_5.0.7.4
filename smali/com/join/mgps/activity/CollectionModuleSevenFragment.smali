.class public Lcom/join/mgps/activity/CollectionModuleSevenFragment;
.super Lcom/join/mgps/fragment/BaseFragment;
.source "CollectionModuleSevenFragment.java"


# annotations
.annotation build Lorg/androidannotations/annotations/EFragment;
    value = 0x7f0c0258
.end annotation


# static fields
.field private static final o:Ljava/lang/String; = "CollectionModuleSeven"


# instance fields
.field private b:Landroid/content/Context;

.field c:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field d:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field e:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field f:Ljava/lang/String;

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CollectionSevenListBean;",
            ">;"
        }
    .end annotation
.end field

.field private h:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

.field private i:Lcom/join/android/app/component/video/g;

.field private j:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/github/snowdream/android/app/downloader/DownloadTask;",
            ">;"
        }
    .end annotation
.end field

.field private k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            ">;"
        }
    .end annotation
.end field

.field private l:I

.field private m:I

.field private n:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/fragment/BaseFragment;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->g:Ljava/util/List;

    .line 3
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->j:Ljava/util/Map;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->k:Ljava/util/List;

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->n:Z

    return-void
.end method

.method public static synthetic V(Lcom/join/mgps/activity/CollectionModuleSevenFragment;Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->h0(Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method

.method public static synthetic W(Lcom/join/mgps/activity/CollectionModuleSevenFragment;Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->g0(Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method

.method static synthetic X(Lcom/join/mgps/activity/CollectionModuleSevenFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->expDiscountGame()V

    return-void
.end method

.method static synthetic Z(Lcom/join/mgps/activity/CollectionModuleSevenFragment;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->l:I

    return p1
.end method

.method static synthetic a0(Lcom/join/mgps/activity/CollectionModuleSevenFragment;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->m:I

    return p1
.end method

.method private d0(Lcom/join/mgps/dto/CommonGameInfoBean;)V
    .locals 5

    if-eqz p1, :cond_f

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_2

    .line 2
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v1

    .line 4
    invoke-virtual {v1}, Lcom/join/mgps/dto/GInfoBean;->getPlugin_num()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/join/mgps/enums/ConstantIntEnum;->H5:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v4}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p1

    .line 6
    iget-object v1, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->T2(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    .line 7
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-virtual {v0, v1, p1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    return-void

    :cond_1
    if-nez v0, :cond_5

    .line 8
    invoke-virtual {v1}, Lcom/join/mgps/dto/GInfoBean;->getTag_info()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->o0(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v0

    iget-object v2, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v0

    iget-object v2, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/join/android/app/common/utils/APKUtils;->l(Landroid/content/Context;Ljava/lang/String;)Lcom/join/android/app/common/utils/APKUtils$a;

    move-result-object v0

    .line 11
    invoke-virtual {v1}, Lcom/join/mgps/dto/GInfoBean;->getVer()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Lcom/join/android/app/common/utils/APKUtils$a;->d()I

    move-result v0

    invoke-virtual {v1}, Lcom/join/mgps/dto/GInfoBean;->getVer()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    if-ge v0, v2, :cond_2

    goto :goto_0

    .line 12
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    iget-object p1, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/join/android/app/common/utils/APKUtils;->a0(Landroid/content/Context;Ljava/lang/String;)Z

    return-void

    .line 13
    :cond_3
    :goto_0
    invoke-virtual {v1}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    invoke-virtual {v1}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/join/mgps/Util/UtilsMy;->y0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_4

    .line 14
    iget-object p1, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->d4(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_1

    .line 15
    :cond_4
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/join/mgps/Util/UtilsMy;->F2(Landroid/content/Context;Lcom/join/mgps/dto/CommonGameInfoBean;)V

    :goto_1
    return-void

    :cond_5
    const/4 v2, 0x0

    if-eqz v0, :cond_6

    .line 16
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v2

    .line 17
    :cond_6
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadPointBase;->get_from()I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->set_from(I)V

    .line 18
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadPointBase;->get_from_type()I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->set_from_type(I)V

    .line 19
    invoke-virtual {v1}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v3

    invoke-virtual {v1}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v1

    const/16 v3, 0x2b

    if-lez v1, :cond_7

    const/16 v2, 0x2b

    :cond_7
    if-eqz v2, :cond_e

    const/16 v1, 0xd

    if-eq v2, v1, :cond_d

    const/4 v1, 0x2

    if-eq v2, v1, :cond_c

    const/4 v1, 0x3

    if-eq v2, v1, :cond_b

    const/4 v1, 0x5

    if-eq v2, v1, :cond_a

    const/4 v1, 0x6

    if-eq v2, v1, :cond_b

    const/4 v1, 0x7

    if-eq v2, v1, :cond_e

    const/16 v1, 0x2a

    if-eq v2, v1, :cond_9

    if-eq v2, v3, :cond_e

    packed-switch v2, :pswitch_data_0

    goto :goto_2

    .line 20
    :pswitch_0
    iget-object p1, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/join/mgps/Util/UtilsMy;->a4(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto :goto_2

    .line 21
    :pswitch_1
    iget-object p1, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_8

    .line 22
    iget-object p1, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    const-string v0, "\u65e0\u7f51\u7edc\u8fde\u63a5"

    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void

    .line 23
    :cond_8
    iget-object p1, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->I2(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    .line 24
    :cond_9
    iget-object p1, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->r4(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    .line 25
    :cond_a
    iget-object p1, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->T3(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    .line 26
    :cond_b
    iget-object p1, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/php25/PDownload/d;->c(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto :goto_2

    .line 27
    :cond_c
    :pswitch_2
    invoke-static {v0}, Lcom/php25/PDownload/d;->i(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    .line 28
    :cond_d
    iget-object p1, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-static {p1, v0}, Lcom/php25/PDownload/d;->l(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    .line 29
    :cond_e
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/join/mgps/Util/UtilsMy;->F2(Landroid/content/Context;Lcom/join/mgps/dto/CommonGameInfoBean;)V

    :cond_f
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method private expDiscountGame()V
    .locals 9

    const/4 v0, 0x0

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isAdded()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->n:Z

    if-nez v1, :cond_2

    const/4 v1, 0x1

    .line 2
    iput-boolean v1, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->n:Z

    .line 3
    iget-object v2, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    if-eqz v2, :cond_2

    .line 4
    invoke-virtual {v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-gt v3, v2, :cond_2

    .line 5
    iget-object v4, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->g:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/CollectionSevenListBean;

    .line 6
    invoke-virtual {v4}, Lcom/join/mgps/dto/CollectionSevenListBean;->isHasExposure()Z

    move-result v5

    if-nez v5, :cond_1

    .line 7
    invoke-virtual {v4, v1}, Lcom/join/mgps/dto/CollectionSevenListBean;->setHasExposure(Z)V

    .line 8
    invoke-virtual {v4}, Lcom/join/mgps/dto/CollectionSevenListBean;->getItemType()I

    move-result v5

    const/4 v6, 0x2

    if-eq v5, v6, :cond_0

    const/4 v6, 0x3

    if-eq v5, v6, :cond_0

    goto :goto_1

    .line 9
    :cond_0
    invoke-virtual {v4}, Lcom/join/mgps/dto/CollectionSevenListBean;->getItem()Ljava/lang/Object;

    move-result-object v5

    instance-of v5, v5, Lcom/join/mgps/dto/CommonGameInfoBean;

    if-eqz v5, :cond_1

    .line 10
    invoke-virtual {v4}, Lcom/join/mgps/dto/CollectionSevenListBean;->getItem()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 11
    invoke-static {v4}, Lcom/join/mgps/Util/UtilsMy;->g2(Lcom/join/mgps/dto/CommonGameInfoBean;)Z

    move-result v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v5, :cond_1

    .line 12
    :try_start_1
    new-instance v5, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v5}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string v6, "discount_game"

    .line 13
    invoke-virtual {v5, v6}, Lcom/papa/sim/statistic/Ext;->setResultCode(Ljava/lang/String;)V

    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/papa/sim/statistic/Ext;->setScenesCode(Ljava/lang/String;)V

    .line 15
    new-instance v6, Lcom/papa/sim/statistic/Data;

    invoke-direct {v6}, Lcom/papa/sim/statistic/Data;-><init>()V

    .line 16
    invoke-virtual {v4}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v7

    invoke-virtual {v6, v7, v8}, Lcom/papa/sim/statistic/Data;->setGameId(J)Lcom/papa/sim/statistic/Data;

    .line 17
    iget-object v4, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-static {v4}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v4

    sget-object v7, Lcom/papa/sim/statistic/Event;->expGameAdPage:Lcom/papa/sim/statistic/Event;

    invoke-virtual {v4, v7, v5, v6}, Lcom/papa/sim/statistic/p;->Y(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;Lcom/papa/sim/statistic/Data;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    move-exception v4

    .line 18
    :try_start_2
    invoke-virtual {v4}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 19
    iput-boolean v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->n:Z

    .line 20
    throw v1

    .line 21
    :catch_1
    :cond_2
    iput-boolean v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->n:Z

    return-void
.end method

.method private f0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->getFragments()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 2
    instance-of v2, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;

    if-eqz v2, :cond_0

    .line 3
    check-cast v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;

    invoke-virtual {v1}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->q0()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->f:Ljava/lang/String;

    goto :goto_0

    :cond_1
    return-void
.end method

.method private synthetic g0(Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->g:Ljava/util/List;

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/CollectionSevenListBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionSevenListBean;->getItem()Ljava/lang/Object;

    move-result-object p1

    .line 2
    instance-of p2, p1, Lcom/join/mgps/dto/CommonGameInfoBean;

    if-eqz p2, :cond_0

    .line 3
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    iget-object p3, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    check-cast p1, Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    :cond_0
    return-void
.end method

.method private synthetic h0(Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->g:Ljava/util/List;

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/CollectionSevenListBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionSevenListBean;->getItem()Ljava/lang/Object;

    move-result-object p1

    .line 2
    instance-of p2, p1, Lcom/join/mgps/dto/CommonGameInfoBean;

    if-eqz p2, :cond_1

    check-cast p1, Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getJp_info()Lcom/join/mgps/dto/JpInfoBean;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getJp_info()Lcom/join/mgps/dto/JpInfoBean;

    move-result-object p2

    invoke-virtual {p2}, Lcom/join/mgps/dto/JpInfoBean;->getLink_type()Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/4 p3, 0x1

    if-eq p2, p3, :cond_0

    .line 4
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    iget-object p3, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->d0(Lcom/join/mgps/dto/CommonGameInfoBean;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private i0()V
    .locals 0

    return-void
.end method

.method private j0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 2
    invoke-virtual {v1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/GInfoBean;->getMod_id()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_1
    const/4 v2, 0x0

    .line 4
    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 5
    :cond_2
    invoke-direct {p0}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->i0()V

    .line 6
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->o0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method

.method private k0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 2
    invoke-virtual {v1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/GInfoBean;->getMod_id()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 4
    :cond_1
    invoke-virtual {v1, p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 5
    :cond_2
    invoke-direct {p0}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->i0()V

    .line 6
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->o0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method

.method private l0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 2
    invoke-virtual {v1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/GInfoBean;->getMod_id()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 4
    :cond_1
    invoke-virtual {v1, p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 5
    :cond_2
    invoke-direct {p0}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->i0()V

    .line 6
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->o0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method

.method private m0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 2
    invoke-virtual {v1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/GInfoBean;->getMod_id()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 4
    :cond_1
    invoke-virtual {v1, p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 5
    :cond_2
    invoke-direct {p0}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->i0()V

    .line 6
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->o0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method

.method private o0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 18

    move-object/from16 v1, p0

    .line 1
    iget v2, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->m:I

    if-ltz v2, :cond_28

    .line 2
    :goto_0
    iget v3, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->l:I

    const/4 v4, 0x1

    add-int/2addr v3, v4

    iget-object v5, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->h:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    invoke-virtual {v5}, Lcom/join/mgps/base/BaseQuickAdapter;->getItemCount()I

    move-result v5

    sub-int/2addr v5, v4

    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v3

    if-gt v2, v3, :cond_28

    .line 3
    iget-object v3, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->h:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    invoke-virtual {v3, v2}, Lcom/join/mgps/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/CollectionSevenListBean;

    if-nez v3, :cond_0

    goto/16 :goto_e

    .line 4
    :cond_0
    invoke-virtual {v3}, Lcom/join/mgps/dto/CollectionSevenListBean;->getItemType()I

    move-result v5

    const-string v6, ""

    const/4 v7, 0x3

    const-string v8, "\u66f4\u65b0"

    const-string v9, "\u542f\u52a8"

    const/4 v14, 0x2

    const v13, 0x7f090488

    const/4 v15, 0x0

    if-eq v5, v14, :cond_17

    if-eq v5, v7, :cond_4

    const/4 v4, 0x4

    if-eq v5, v4, :cond_1

    goto/16 :goto_e

    .line 5
    :cond_1
    :try_start_0
    invoke-virtual {v3}, Lcom/join/mgps/dto/CollectionSevenListBean;->getItem()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 6
    iget-object v4, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->c:Landroidx/recyclerview/widget/RecyclerView;

    iget v5, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->m:I

    sub-int v5, v2, v5

    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 7
    iget-object v5, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v5, v4}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolder(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object v4

    .line 8
    instance-of v5, v4, Lcom/join/mgps/base/BaseViewHolder;

    if-eqz v5, :cond_27

    .line 9
    check-cast v4, Lcom/join/mgps/base/BaseViewHolder;

    if-eqz v3, :cond_27

    const v5, 0x7f0910e9

    .line 10
    invoke-virtual {v4, v5}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v5

    if-eqz v5, :cond_27

    const v5, 0x7f0910e9

    .line 11
    invoke-virtual {v4, v5}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroidx/recyclerview/widget/RecyclerView;

    .line 12
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/adapter/CollectionModuleSevenHorizontalAdapter;

    if-eqz v4, :cond_27

    .line 13
    invoke-virtual {v4}, Lcom/join/mgps/base/BaseQuickAdapter;->getData()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_27

    .line 14
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/join/mgps/dto/CommonGameInfoBean;

    if-eqz v6, :cond_2

    .line 15
    invoke-virtual {v6}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v7

    if-eqz v7, :cond_2

    invoke-virtual/range {p1 .. p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v8

    invoke-virtual {v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 16
    invoke-virtual {v6}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v7

    .line 17
    invoke-static {}, Lcom/join/android/app/common/servcie/i;->e()Lcom/join/android/app/common/servcie/i;

    move-result-object v8

    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v8, v7}, Lcom/join/android/app/common/servcie/i;->f(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v7

    if-eqz v7, :cond_2

    .line 18
    invoke-virtual {v6, v7}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_1

    .line 19
    :cond_3
    invoke-virtual {v4, v3}, Lcom/join/mgps/base/BaseQuickAdapter;->setNewData(Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_e

    :catch_0
    move-exception v0

    move-object v3, v0

    .line 20
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_e

    .line 21
    :cond_4
    :try_start_1
    invoke-virtual {v3}, Lcom/join/mgps/dto/CollectionSevenListBean;->getItem()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 22
    iget-object v5, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->c:Landroidx/recyclerview/widget/RecyclerView;

    iget v7, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->m:I

    sub-int v7, v2, v7

    invoke-virtual {v5, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    if-nez v5, :cond_5

    goto/16 :goto_e

    .line 23
    :cond_5
    iget-object v7, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v7, v5}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolder(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object v5

    .line 24
    instance-of v7, v5, Lcom/join/mgps/base/BaseViewHolder;

    if-eqz v7, :cond_27

    .line 25
    check-cast v5, Lcom/join/mgps/base/BaseViewHolder;

    if-eqz v3, :cond_27

    .line 26
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v7

    if-eqz v7, :cond_27

    .line 27
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v7

    invoke-virtual {v7}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v7

    .line 28
    invoke-virtual/range {p1 .. p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v7}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_6

    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v7

    if-eqz v7, :cond_27

    invoke-virtual/range {p1 .. p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v12

    invoke-virtual {v12}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v12

    invoke-static {v7, v12}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_27

    .line 29
    :cond_6
    iget-object v7, v5, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v7, v15}, Landroid/view/View;->setVisibility(I)V

    .line 30
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v7

    if-eqz v7, :cond_27

    .line 31
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v7

    .line 32
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v3

    const v12, 0x7f09063c

    .line 33
    invoke-virtual {v5, v12}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v12

    check-cast v12, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getGif_ico()Ljava/lang/String;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v16

    if-eqz v16, :cond_7

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getIco()Ljava/lang/String;

    move-result-object v16

    goto :goto_2

    :cond_7
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getGif_ico()Ljava/lang/String;

    move-result-object v16

    :goto_2
    move-object/from16 v10, v16

    invoke-static {v12, v10}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    const v10, 0x7f09151e

    .line 34
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v5, v10, v11}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    new-array v10, v4, [I

    aput v13, v10, v15

    .line 35
    invoke-virtual {v5, v10}, Lcom/join/mgps/base/BaseViewHolder;->addOnClickListener([I)Lcom/join/mgps/base/BaseViewHolder;

    .line 36
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getTag_info()Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    move-object v12, v6

    const/4 v11, 0x0

    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_b

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Lcom/join/mgps/dto/TipBean;

    if-lt v11, v14, :cond_8

    goto/16 :goto_5

    .line 37
    :cond_8
    invoke-virtual/range {v16 .. v16}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v17

    invoke-static/range {v17 .. v17}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v17

    if-nez v17, :cond_a

    invoke-virtual/range {v16 .. v16}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v13

    const-string v4, "44"

    invoke-virtual {v13, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    invoke-virtual/range {v16 .. v16}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v4

    const-string v13, "45"

    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    invoke-virtual/range {v16 .. v16}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v4

    const-string v13, "47"

    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    invoke-virtual/range {v16 .. v16}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v4

    const-string v13, "48"

    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    invoke-virtual/range {v16 .. v16}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v4

    const-string v13, "25"

    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    invoke-virtual/range {v16 .. v16}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v4

    const-string v13, "154"

    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    invoke-virtual/range {v16 .. v16}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v4

    const-string v13, "7"

    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v4

    if-eqz v4, :cond_9

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/TipNew;->getModel()Lcom/join/mgps/dto/TipBean;

    move-result-object v4

    if-eqz v4, :cond_9

    invoke-virtual/range {v16 .. v16}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v13

    invoke-virtual {v13}, Lcom/join/mgps/dto/TipNew;->getModel()Lcom/join/mgps/dto/TipBean;

    move-result-object v13

    invoke-virtual {v13}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v13

    invoke-static {v4, v13}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_9

    goto :goto_4

    .line 38
    :cond_9
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {v16 .. v16}, Lcom/join/mgps/dto/TipBean;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, " \u00b7 "

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    add-int/lit8 v11, v11, 0x1

    :cond_a
    :goto_4
    const/4 v4, 0x1

    const v13, 0x7f090488

    goto/16 :goto_3

    .line 39
    :cond_b
    :goto_5
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v4

    sub-int/2addr v4, v14

    invoke-static {v15, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-virtual {v12, v15, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 40
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getApp_size()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v10

    const-wide/high16 v12, 0x4090000000000000L    # 1024.0

    mul-double v10, v10, v12

    mul-double v10, v10, v12

    double-to-long v10, v10

    .line 41
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "| "

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v10, v11}, Lcom/join/mgps/Util/UtilsMy;->J2(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const v12, 0x7f09156c

    .line 42
    invoke-virtual {v5, v12, v4}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 43
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getInfo()Ljava/lang/String;

    move-result-object v4

    const v12, 0x7f090663

    invoke-virtual {v5, v12, v4}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 44
    sget-object v4, Lcom/join/mgps/enums/ConstantIntEnum;->H5:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v4}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getPlugin_num()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v4, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const v12, 0x7f090c7d

    const v13, 0x7f091051

    const v14, 0x7f09104a

    if-eqz v4, :cond_c

    const v4, 0x7f09156c

    .line 45
    invoke-virtual {v5, v4, v15}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f090663

    const/4 v5, 0x1

    invoke-virtual {v3, v4, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    invoke-virtual {v3, v12, v15}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    invoke-virtual {v3, v13, v15}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    invoke-virtual {v3, v14, v15}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_e

    :cond_c
    if-nez v7, :cond_10

    const v4, 0x7f09156c

    const/4 v14, 0x1

    .line 46
    invoke-virtual {v5, v4, v14}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    const v6, 0x7f090663

    invoke-virtual {v4, v6, v14}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    invoke-virtual {v4, v12, v15}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    invoke-virtual {v4, v13, v15}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    const v6, 0x7f09104a

    invoke-virtual {v4, v6, v15}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 47
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getTag_info()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lcom/join/mgps/Util/UtilsMy;->o0(Ljava/util/List;)Z

    move-result v4

    if-eqz v4, :cond_f

    .line 48
    iget-object v4, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-static {v4}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v4

    iget-object v6, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v6, v7}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_e

    .line 49
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v4

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v4

    if-nez v4, :cond_e

    .line 50
    iget-object v4, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-static {v4}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v4

    iget-object v6, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v6, v7}, Lcom/join/android/app/common/utils/APKUtils;->l(Landroid/content/Context;Ljava/lang/String;)Lcom/join/android/app/common/utils/APKUtils$a;

    move-result-object v4

    .line 51
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getVer()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-virtual {v4}, Lcom/join/android/app/common/utils/APKUtils$a;->d()I

    move-result v4

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getVer()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    if-ge v4, v3, :cond_d

    const v3, 0x7f0914f9

    .line 52
    invoke-virtual {v5, v3, v8}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    const v5, 0x7f080c49

    const v6, 0x7f090488

    invoke-virtual {v4, v6, v5}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    iget-object v5, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f060031

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v4, v3, v5}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_e

    :cond_d
    const v3, 0x7f0914f9

    .line 53
    invoke-virtual {v5, v3, v9}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    const v3, 0x7f080c50

    const v5, 0x7f090488

    invoke-virtual {v4, v5, v3}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f060034

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    const v5, 0x7f0914f9

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_e

    .line 54
    :cond_e
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v4

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    const v4, 0x7f0914f9

    .line 55
    invoke-virtual {v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    const v4, 0x7f090488

    invoke-virtual {v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v7

    invoke-static {v6, v7, v3}, Lcom/join/mgps/Util/UtilsMy;->g3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/GInfoBean;)V

    const v3, 0x7f080c44

    .line 56
    invoke-virtual {v5, v4, v3}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f06002b

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    const v5, 0x7f0914f9

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_e

    .line 57
    :cond_f
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v4

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    const v4, 0x7f0914f9

    .line 58
    invoke-virtual {v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    const v4, 0x7f090488

    invoke-virtual {v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v7

    invoke-static {v6, v7, v3}, Lcom/join/mgps/Util/UtilsMy;->g3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/GInfoBean;)V

    const v3, 0x7f080c44

    .line 59
    invoke-virtual {v5, v4, v3}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f06002b

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    const v5, 0x7f0914f9

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_e

    .line 60
    :cond_10
    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    if-eqz v3, :cond_11

    const/16 v4, 0x2a

    if-eq v3, v4, :cond_13

    const/16 v4, 0x30

    if-eq v3, v4, :cond_16

    const-string v4, "/"

    const/4 v14, 0x2

    if-eq v3, v14, :cond_15

    const/4 v14, 0x3

    if-eq v3, v14, :cond_12

    const/4 v14, 0x5

    if-eq v3, v14, :cond_13

    const/4 v9, 0x6

    if-eq v3, v9, :cond_12

    const/4 v6, 0x7

    if-eq v3, v6, :cond_11

    packed-switch v3, :pswitch_data_0

    goto/16 :goto_e

    :pswitch_0
    const v3, 0x7f09156c

    .line 61
    :try_start_2
    invoke-virtual {v5, v3, v15}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v6, 0x7f090663

    invoke-virtual {v3, v6, v15}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const/4 v6, 0x1

    invoke-virtual {v3, v12, v6}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    invoke-virtual {v3, v13, v6}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v6, 0x7f09104a

    invoke-virtual {v3, v6, v15}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 62
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v10, v11}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v10, v11}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 63
    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v6

    long-to-int v4, v6

    const v6, 0x7f0900f1

    .line 64
    invoke-virtual {v5, v6, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const-string v5, "\u70b9\u51fb\u91cd\u65b0\u89e3\u538b"

    const v6, 0x7f090d81

    invoke-virtual {v3, v6, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    invoke-virtual {v3, v13, v4}, Lcom/join/mgps/base/BaseViewHolder;->setProgress(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const-string v4, "\u89e3\u538b"

    const v5, 0x7f0914f9

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_e

    :pswitch_1
    const v3, 0x7f09156c

    .line 65
    invoke-virtual {v5, v3, v15}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v6, 0x7f090663

    invoke-virtual {v3, v6, v15}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const/4 v6, 0x1

    invoke-virtual {v3, v12, v6}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    invoke-virtual {v3, v13, v6}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v6, 0x7f09104a

    invoke-virtual {v3, v6, v15}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 66
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v10, v11}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v10, v11}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 67
    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v6

    long-to-int v4, v6

    const v6, 0x7f0900f1

    .line 68
    invoke-virtual {v5, v6, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const-string v5, "\u89e3\u538b\u4e2d"

    const v6, 0x7f090d81

    invoke-virtual {v3, v6, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    invoke-virtual {v3, v13, v4}, Lcom/join/mgps/base/BaseViewHolder;->setProgress(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const-string v4, "\u89e3\u538b\u4e2d"

    const v5, 0x7f0914f9

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_e

    :pswitch_2
    const v3, 0x7f09156c

    const/4 v4, 0x1

    .line 69
    invoke-virtual {v5, v3, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v5, 0x7f090663

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    invoke-virtual {v3, v12, v15}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    invoke-virtual {v3, v13, v15}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f09104a

    invoke-virtual {v3, v4, v15}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c49

    const v5, 0x7f090488

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f060031

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    const v5, 0x7f0914f9

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const-string v4, "\u5b89\u88c5"

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_e

    :pswitch_3
    const v3, 0x7f09156c

    .line 70
    invoke-virtual {v5, v3, v15}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v6, 0x7f090663

    invoke-virtual {v3, v6, v15}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const/4 v6, 0x1

    invoke-virtual {v3, v12, v6}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    invoke-virtual {v3, v13, v15}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v8, 0x7f09104a

    invoke-virtual {v3, v8, v6}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 71
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v8

    invoke-static {v8, v9}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v10, v11}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 72
    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v6

    long-to-int v4, v6

    const v6, 0x7f0900f1

    .line 73
    invoke-virtual {v5, v6, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const-string v5, "\u7b49\u5f85\u4e2d"

    const v6, 0x7f090d81

    invoke-virtual {v3, v6, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v5, 0x7f09104a

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setProgress(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const-string v4, "\u7b49\u5f85"

    const v5, 0x7f0914f9

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_e

    :pswitch_4
    const v3, 0x7f09156c

    const/4 v4, 0x1

    .line 74
    invoke-virtual {v5, v3, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v5, 0x7f090663

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    invoke-virtual {v3, v12, v15}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    invoke-virtual {v3, v13, v15}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f09104a

    invoke-virtual {v3, v4, v15}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c49

    const v5, 0x7f090488

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f060031

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    const v5, 0x7f0914f9

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    invoke-virtual {v3, v5, v8}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_e

    :cond_11
    const v3, 0x7f09156c

    const/4 v4, 0x1

    goto/16 :goto_a

    :cond_12
    const v3, 0x7f09156c

    goto :goto_6

    :cond_13
    const v3, 0x7f09156c

    const/4 v4, 0x1

    goto/16 :goto_9

    .line 75
    :goto_6
    invoke-virtual {v5, v3, v15}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v8, 0x7f090663

    invoke-virtual {v3, v8, v15}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const/4 v8, 0x1

    invoke-virtual {v3, v12, v8}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    invoke-virtual {v3, v13, v15}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v9, 0x7f09104a

    invoke-virtual {v3, v9, v8}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v8, 0x7f080c44

    const v9, 0x7f090488

    invoke-virtual {v3, v9, v8}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v8, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    const v9, 0x7f06002b

    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getColor(I)I

    move-result v8

    const v9, 0x7f0914f9

    invoke-virtual {v3, v9, v8}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const-string v8, "\u7ee7\u7eed"

    invoke-virtual {v3, v9, v8}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 76
    :try_start_3
    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v8

    const-wide/16 v12, 0x0

    cmp-long v3, v8, v12

    if-nez v3, :cond_14

    .line 77
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v8

    invoke-static {v8, v9}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v10, v11}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_7

    .line 78
    :cond_14
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v8

    invoke-static {v8, v9}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v10, v11}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_7
    move-object v6, v3

    .line 79
    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v3
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    long-to-int v15, v3

    goto :goto_8

    :catch_1
    move-exception v0

    move-object v3, v0

    .line 80
    :try_start_4
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    :goto_8
    const v3, 0x7f0900f1

    .line 81
    invoke-virtual {v5, v3, v6}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const-string v4, "\u6682\u505c\u4e2d"

    const v5, 0x7f090d81

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f09104a

    invoke-virtual {v3, v4, v15}, Lcom/join/mgps/base/BaseViewHolder;->setProgress(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_e

    :cond_15
    const v3, 0x7f09156c

    .line 82
    invoke-virtual {v5, v3, v15}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v6, 0x7f090663

    invoke-virtual {v3, v6, v15}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const/4 v6, 0x1

    invoke-virtual {v3, v12, v6}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    invoke-virtual {v3, v13, v15}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v6, 0x7f080c44

    const v8, 0x7f090488

    invoke-virtual {v3, v8, v6}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v6, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v8, 0x7f06002b

    invoke-virtual {v6, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v6

    const v8, 0x7f0914f9

    invoke-virtual {v3, v8, v6}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v6, 0x7f09104a

    const/4 v8, 0x1

    invoke-virtual {v3, v6, v8}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 83
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v8

    invoke-static {v8, v9}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v10, v11}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 84
    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v8

    long-to-int v4, v8

    const v6, 0x7f0900f1

    .line 85
    invoke-virtual {v5, v6, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSpeed()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "/S"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const v6, 0x7f090d81

    invoke-virtual {v3, v6, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v5, 0x7f09104a

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setProgress(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const-string v4, "\u6682\u505c"

    const v5, 0x7f0914f9

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_e

    :cond_16
    const v3, 0x7f09156c

    const/4 v4, 0x1

    .line 86
    invoke-virtual {v5, v3, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v5, 0x7f090663

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    invoke-virtual {v3, v12, v15}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    invoke-virtual {v3, v13, v15}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f09104a

    invoke-virtual {v3, v4, v15}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c44

    const v5, 0x7f090488

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f06002b

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    const v5, 0x7f0914f9

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const-string v4, "\u5b89\u88c5\u4e2d"

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_e

    .line 87
    :goto_9
    invoke-virtual {v5, v3, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v5, 0x7f090663

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    invoke-virtual {v3, v12, v15}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    invoke-virtual {v3, v13, v15}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f09104a

    invoke-virtual {v3, v4, v15}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c44

    const v5, 0x7f090488

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f06002b

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    const v5, 0x7f0914f9

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    invoke-virtual {v3, v5, v9}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_e

    .line 88
    :goto_a
    invoke-virtual {v5, v3, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v5, 0x7f090663

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    invoke-virtual {v3, v12, v15}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    invoke-virtual {v3, v13, v15}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f09104a

    invoke-virtual {v3, v4, v15}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c44

    const v5, 0x7f090488

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f06002b

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    const v5, 0x7f0914f9

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const-string v4, "\u83b7\u53d6"

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    goto/16 :goto_e

    :catch_2
    move-exception v0

    move-object v3, v0

    .line 89
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_e

    .line 90
    :cond_17
    :try_start_5
    invoke-virtual {v3}, Lcom/join/mgps/dto/CollectionSevenListBean;->getItem()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 91
    iget-object v4, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->c:Landroidx/recyclerview/widget/RecyclerView;

    iget v5, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->m:I

    sub-int v5, v2, v5

    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 92
    iget-object v5, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v5, v4}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolder(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object v4

    .line 93
    instance-of v5, v4, Lcom/join/mgps/base/BaseViewHolder;

    if-eqz v5, :cond_27

    .line 94
    check-cast v4, Lcom/join/mgps/base/BaseViewHolder;

    if-eqz v3, :cond_27

    .line 95
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v5

    if-eqz v5, :cond_27

    .line 96
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v5

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v5

    .line 97
    invoke-virtual/range {p1 .. p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_18

    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v5

    if-eqz v5, :cond_27

    invoke-virtual/range {p1 .. p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v7

    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_27

    .line 98
    :cond_18
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v5

    if-eqz v5, :cond_27

    .line 99
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v5

    .line 100
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v3

    const v7, 0x7f09078d

    .line 101
    invoke-virtual {v4, v7}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getGif_ico()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_19

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getIco()Ljava/lang/String;

    move-result-object v10

    goto :goto_b

    :cond_19
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getGif_ico()Ljava/lang/String;

    move-result-object v10

    :goto_b
    invoke-static {v7, v10}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    const v7, 0x7f090664

    .line 102
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v7, v10}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const/4 v7, 0x1

    new-array v7, v7, [I

    const v10, 0x7f090488

    aput v10, v7, v15

    .line 103
    invoke-virtual {v4, v7}, Lcom/join/mgps/base/BaseViewHolder;->addOnClickListener([I)Lcom/join/mgps/base/BaseViewHolder;

    .line 104
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getTag_info()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    const/4 v10, 0x0

    :cond_1a
    :goto_c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_1d

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/join/mgps/dto/TipBean;

    const/4 v12, 0x2

    if-lt v10, v12, :cond_1b

    goto/16 :goto_d

    .line 105
    :cond_1b
    invoke-virtual {v11}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-nez v12, :cond_1a

    invoke-virtual {v11}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v12

    const-string v13, "44"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1a

    invoke-virtual {v11}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v12

    const-string v13, "45"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1a

    invoke-virtual {v11}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v12

    const-string v13, "47"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1a

    invoke-virtual {v11}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v12

    const-string v13, "48"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1a

    invoke-virtual {v11}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v12

    const-string v13, "25"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1a

    invoke-virtual {v11}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v12

    const-string v13, "154"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1a

    invoke-virtual {v11}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v12

    const-string v13, "7"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1a

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v12

    if-eqz v12, :cond_1c

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v12

    invoke-virtual {v12}, Lcom/join/mgps/dto/TipNew;->getModel()Lcom/join/mgps/dto/TipBean;

    move-result-object v12

    if-eqz v12, :cond_1c

    invoke-virtual {v11}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v13

    invoke-virtual {v13}, Lcom/join/mgps/dto/TipNew;->getModel()Lcom/join/mgps/dto/TipBean;

    move-result-object v13

    invoke-virtual {v13}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v12

    if-eqz v12, :cond_1c

    goto/16 :goto_c

    .line 106
    :cond_1c
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Lcom/join/mgps/dto/TipBean;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " \u00b7 "

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_c

    .line 107
    :cond_1d
    :goto_d
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    const/4 v10, 0x2

    sub-int/2addr v7, v10

    invoke-static {v15, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    invoke-virtual {v6, v15, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 108
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getApp_size()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v10

    const-wide/high16 v12, 0x4090000000000000L    # 1024.0

    mul-double v10, v10, v12

    mul-double v10, v10, v12

    double-to-long v10, v10

    .line 109
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "| "

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v10, v11}, Lcom/join/mgps/Util/UtilsMy;->J2(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const v7, 0x7f09156c

    .line 110
    invoke-virtual {v4, v7, v6}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 111
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getInfo()Ljava/lang/String;

    move-result-object v6

    const v7, 0x7f090663

    invoke-virtual {v4, v7, v6}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    if-nez v5, :cond_21

    .line 112
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getTag_info()Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Lcom/join/mgps/Util/UtilsMy;->o0(Ljava/util/List;)Z

    move-result v5

    if-eqz v5, :cond_20

    .line 113
    iget-object v5, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-static {v5}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v5

    iget-object v6, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1f

    .line 114
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v5

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v5

    if-nez v5, :cond_1f

    .line 115
    iget-object v5, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-static {v5}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v5

    iget-object v6, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lcom/join/android/app/common/utils/APKUtils;->l(Landroid/content/Context;Ljava/lang/String;)Lcom/join/android/app/common/utils/APKUtils$a;

    move-result-object v5

    .line 116
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getVer()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1e

    invoke-virtual {v5}, Lcom/join/android/app/common/utils/APKUtils$a;->d()I

    move-result v5

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getVer()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    if-ge v5, v3, :cond_1e

    const v3, 0x7f0914f9

    .line 117
    invoke-virtual {v4, v3, v8}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    const v5, 0x7f080c49

    const v6, 0x7f090488

    invoke-virtual {v4, v6, v5}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    iget-object v5, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f060031

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v4, v3, v5}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_e

    :cond_1e
    const v3, 0x7f0914f9

    .line 118
    invoke-virtual {v4, v3, v9}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    const v3, 0x7f080c50

    const v5, 0x7f090488

    invoke-virtual {v4, v5, v3}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f060034

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    const v5, 0x7f0914f9

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_e

    .line 119
    :cond_1f
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v5

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    const v5, 0x7f0914f9

    .line 120
    invoke-virtual {v4, v5}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    const v5, 0x7f090488

    invoke-virtual {v4, v5}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v7

    invoke-static {v6, v7, v3}, Lcom/join/mgps/Util/UtilsMy;->g3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/GInfoBean;)V

    const v3, 0x7f080c44

    .line 121
    invoke-virtual {v4, v5, v3}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f06002b

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    const v5, 0x7f0914f9

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_e

    .line 122
    :cond_20
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v5

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    const v5, 0x7f0914f9

    .line 123
    invoke-virtual {v4, v5}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    const v5, 0x7f090488

    invoke-virtual {v4, v5}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v7

    invoke-static {v6, v7, v3}, Lcom/join/mgps/Util/UtilsMy;->g3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/GInfoBean;)V

    const v3, 0x7f080c44

    .line 124
    invoke-virtual {v4, v5, v3}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f06002b

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    const v5, 0x7f0914f9

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_e

    .line 125
    :cond_21
    invoke-virtual {v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v3

    if-eqz v3, :cond_26

    const/16 v5, 0x2a

    if-eq v3, v5, :cond_25

    const/16 v5, 0x30

    if-eq v3, v5, :cond_24

    const/4 v5, 0x2

    if-eq v3, v5, :cond_23

    const/4 v5, 0x3

    if-eq v3, v5, :cond_22

    const/4 v5, 0x5

    if-eq v3, v5, :cond_25

    const/4 v5, 0x6

    if-eq v3, v5, :cond_22

    const/4 v5, 0x7

    if-eq v3, v5, :cond_26

    packed-switch v3, :pswitch_data_1

    goto/16 :goto_e

    :pswitch_5
    const-string v3, "\u89e3\u538b"

    const v5, 0x7f0914f9

    .line 126
    invoke-virtual {v4, v5, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_e

    :pswitch_6
    const v5, 0x7f0914f9

    const-string v3, "\u89e3\u538b\u4e2d"

    .line 127
    invoke-virtual {v4, v5, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_e

    :pswitch_7
    const v5, 0x7f0914f9

    const-string v3, "\u5b89\u88c5"

    .line 128
    invoke-virtual {v4, v5, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c49

    const v6, 0x7f090488

    invoke-virtual {v3, v6, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v6, 0x7f060031

    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_e

    :pswitch_8
    const-string v3, "\u7b49\u5f85"

    const v5, 0x7f0914f9

    .line 129
    invoke-virtual {v4, v5, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_e

    :pswitch_9
    const v5, 0x7f0914f9

    .line 130
    invoke-virtual {v4, v5, v8}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c49

    const v6, 0x7f090488

    invoke-virtual {v3, v6, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v6, 0x7f060031

    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_e

    :cond_22
    const-string v3, "\u7ee7\u7eed"

    const v5, 0x7f0914f9

    .line 131
    invoke-virtual {v4, v5, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c44

    const v6, 0x7f090488

    invoke-virtual {v3, v6, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v6, 0x7f06002b

    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_e

    :cond_23
    const-string v3, "\u6682\u505c"

    const v5, 0x7f0914f9

    .line 132
    invoke-virtual {v4, v5, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c44

    const v6, 0x7f090488

    invoke-virtual {v3, v6, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v6, 0x7f06002b

    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_e

    :cond_24
    const-string v3, "\u5b89\u88c5\u4e2d"

    const v5, 0x7f0914f9

    .line 133
    invoke-virtual {v4, v5, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c44

    const v6, 0x7f090488

    invoke-virtual {v3, v6, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v6, 0x7f06002b

    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_e

    :cond_25
    const v3, 0x7f0914f9

    .line 134
    invoke-virtual {v4, v3, v9}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    const v3, 0x7f080c50

    const v5, 0x7f090488

    invoke-virtual {v4, v5, v3}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f060034

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    const v5, 0x7f0914f9

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_e

    :cond_26
    const-string v3, "\u83b7\u53d6"

    const v5, 0x7f0914f9

    .line 135
    invoke-virtual {v4, v5, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c44

    const v6, 0x7f090488

    invoke-virtual {v3, v6, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v6, 0x7f06002b

    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_e

    :catch_3
    move-exception v0

    move-object v3, v0

    .line 136
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    :cond_27
    :goto_e
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_28
    return-void

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x9
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
    .end packed-switch
.end method

.method private q0()V
    .locals 13

    .line 1
    iget v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->m:I

    if-ltz v0, :cond_5

    .line 2
    :goto_0
    iget v1, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->l:I

    add-int/lit8 v1, v1, 0x1

    iget-object v2, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->h:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    invoke-virtual {v2}, Lcom/join/mgps/base/BaseQuickAdapter;->getItemCount()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    if-gt v0, v1, :cond_5

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->h:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    invoke-virtual {v1, v0}, Lcom/join/mgps/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/CollectionSevenListBean;

    if-nez v1, :cond_0

    goto/16 :goto_3

    .line 4
    :cond_0
    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionSevenListBean;->getItemType()I

    move-result v2

    const/4 v3, 0x3

    if-eq v2, v3, :cond_1

    goto/16 :goto_3

    .line 5
    :cond_1
    :try_start_0
    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionSevenListBean;->getItem()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 6
    iget-object v2, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->c:Landroidx/recyclerview/widget/RecyclerView;

    iget v3, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->m:I

    sub-int v3, v0, v3

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 7
    iget-object v3, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolder(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object v2

    .line 8
    instance-of v3, v2, Lcom/join/mgps/base/BaseViewHolder;

    if-eqz v3, :cond_4

    .line 9
    check-cast v2, Lcom/join/mgps/base/BaseViewHolder;

    if-eqz v1, :cond_4

    .line 10
    invoke-virtual {v1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 11
    invoke-virtual {v1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v1

    .line 12
    invoke-static {}, Lcom/join/android/app/common/servcie/i;->e()Lcom/join/android/app/common/servcie/i;

    move-result-object v3

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/join/android/app/common/servcie/i;->f(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 13
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getShowSize()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v4

    const-wide/high16 v6, 0x4090000000000000L    # 1024.0

    mul-double v4, v4, v6

    mul-double v4, v4, v6

    double-to-long v4, v4

    .line 14
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-wide/16 v8, 0x0

    const-string v10, "/"

    const v11, 0x7f0900f1

    cmp-long v12, v6, v8

    if-nez v12, :cond_2

    .line 15
    :try_start_1
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v7

    invoke-static {v7, v8}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4, v5}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v11, v4}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_1

    .line 16
    :cond_2
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v7

    invoke-static {v7, v8}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4, v5}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v11, v4}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 17
    :goto_1
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v4

    const/16 v5, 0xc

    if-ne v4, v5, :cond_3

    const v4, 0x7f091051

    .line 18
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v5

    long-to-int v6, v5

    invoke-virtual {v2, v4, v6}, Lcom/join/mgps/base/BaseViewHolder;->setProgress(II)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_2

    :cond_3
    const v4, 0x7f09104a

    .line 19
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v5

    long-to-int v6, v5

    invoke-virtual {v2, v4, v6}, Lcom/join/mgps/base/BaseViewHolder;->setProgress(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 20
    :goto_2
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v1

    const/4 v4, 0x2

    if-ne v1, v4, :cond_4

    const v1, 0x7f090d81

    .line 21
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSpeed()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/S"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :catch_0
    move-exception v1

    .line 22
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_4
    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    :cond_5
    return-void
.end method

.method private s0(Lcom/join/mgps/dto/CommonGameInfoBean;)Lcom/join/mgps/dto/CommonGameInfoBean;
    .locals 5

    if-nez p1, :cond_0

    return-object p1

    .line 1
    :cond_0
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v0}, Lp1/f;->d()Ljava/util/List;

    move-result-object v0

    .line 2
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/16 v2, 0xd2

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/GInfoBean;->getMod_id()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 4
    invoke-virtual {v1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->set_from(I)V

    .line 5
    invoke-virtual {v1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->set_from_type(I)V

    .line 6
    invoke-virtual {p1, v1}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_1

    .line 7
    :cond_2
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 8
    invoke-virtual {v1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->set_from(I)V

    .line 9
    invoke-virtual {v1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->set_from_type(I)V

    .line 10
    invoke-virtual {p1, v1}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 11
    :cond_3
    :goto_1
    invoke-virtual {p1, v2}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 12
    invoke-virtual {p1, v2}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    return-object p1
.end method


# virtual methods
.method b0()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/d0;->d(Ljava/lang/Object;)V

    .line 3
    new-instance v0, Lcom/join/android/app/component/video/g;

    iget-object v1, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->c:Landroidx/recyclerview/widget/RecyclerView;

    const-string v2, "PapaMainV3Fragment"

    invoke-direct {v0, v1, v2}, Lcom/join/android/app/component/video/g;-><init>(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->i:Lcom/join/android/app/component/video/g;

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->c:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v2, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 5
    new-instance v0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    iget-object v1, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->g:Ljava/util/List;

    iget-object v2, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->i:Lcom/join/android/app/component/video/g;

    invoke-direct {v0, v1, v2}, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;-><init>(Ljava/util/List;Lcom/join/android/app/component/video/g;)V

    iput-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->h:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    .line 6
    iget-object v1, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->h:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    new-instance v1, Lcom/join/mgps/activity/g;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/g;-><init>(Lcom/join/mgps/activity/CollectionModuleSevenFragment;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/base/BaseQuickAdapter;->setOnItemClickListener(Lcom/join/mgps/base/BaseQuickAdapter$j;)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->h:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    new-instance v1, Lcom/join/mgps/activity/f;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/f;-><init>(Lcom/join/mgps/activity/CollectionModuleSevenFragment;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/base/BaseQuickAdapter;->setOnItemChildClickListener(Lcom/join/mgps/base/BaseQuickAdapter$h;)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->c:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/CollectionModuleSevenFragment$a;-><init>(Lcom/join/mgps/activity/CollectionModuleSevenFragment;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

    return-void
.end method

.method c0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
        delay = 0x1f4L
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->i:Lcom/join/android/app/component/video/g;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, v1}, Lcom/join/android/app/component/video/g;->g(I)V

    :cond_0
    return-void
.end method

.method e0()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->showLoding()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->f:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-direct {p0}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->f0()V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->f:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "\u4e13\u533aid\u4e0d\u5b58\u5728"

    .line 6
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->showMessage(Ljava/lang/String;)V

    .line 7
    invoke-virtual {p0}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->showLodingFailed()V

    return-void

    .line 8
    :cond_1
    new-instance v0, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v0}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 9
    iget-object v1, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 10
    new-instance v1, Lcom/join/mgps/dto/CollectionModuleSevenArgs;

    invoke-direct {v1}, Lcom/join/mgps/dto/CollectionModuleSevenArgs;-><init>()V

    .line 11
    iget-object v2, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->f:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/CollectionModuleSevenArgs;->setTemplateId(Ljava/lang/String;)V

    .line 12
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 13
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/rpc/impl/i;->B0()Le2/i;

    move-result-object v1

    invoke-virtual {v0}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object v0

    invoke-interface {v1, v0}, Le2/i;->o0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;

    move-result-object v0

    invoke-interface {v0}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    move-result-object v0

    invoke-virtual {v0}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ResponseModel;

    if-eqz v0, :cond_2

    .line 14
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v1

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_2

    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 15
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/CollectionModuleSevenBean;

    .line 16
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->p0(Lcom/join/mgps/dto/CollectionModuleSevenBean;)V

    goto :goto_0

    .line 17
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->showLodingFailed()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 19
    invoke-virtual {p0}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->showLodingFailed()V

    goto :goto_0

    :cond_3
    const-string v0, "\u5f53\u524d\u7f51\u7edc\u4e0d\u53ef\u7528"

    .line 20
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->showMessage(Ljava/lang/String;)V

    .line 21
    invoke-virtual {p0}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->showLodingFailed()V

    :goto_0
    return-void
.end method

.method protected lazyLoad()V
    .locals 0

    return-void
.end method

.method n0(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->f:Ljava/lang/String;

    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/d0;->e(Ljava/lang/Object;)V

    .line 2
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->i:Lcom/join/android/app/component/video/g;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/android/app/component/video/g;->t()V

    :cond_0
    return-void
.end method

.method public onEventMainThread(Lcom/join/mgps/event/n;)V
    .locals 6
    .annotation runtime Lorg/greenrobot/eventbus/Subscribe;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/event/n;->a()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/event/n;->c()I

    move-result v1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_5

    const/4 v3, 0x3

    if-eq v1, v3, :cond_4

    const/4 v2, 0x5

    if-eq v1, v2, :cond_3

    const/4 v4, 0x6

    if-eq v1, v4, :cond_2

    const/4 v4, 0x7

    if-eq v1, v4, :cond_1

    const/16 v3, 0x8

    if-eq v1, v3, :cond_0

    const/16 v5, 0x30

    if-eq v1, v5, :cond_3

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/16 v1, 0x9

    .line 3
    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->r0(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 4
    :pswitch_1
    invoke-virtual {p0, v0, v3}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->r0(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 5
    :pswitch_2
    invoke-virtual {p0, v0, v4}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->r0(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->j:Ljava/util/Map;

    if-eqz v0, :cond_6

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    .line 7
    invoke-direct {p0}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->q0()V

    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {p0, v0, v3}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->r0(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 9
    :cond_2
    invoke-virtual {p0, v0, v4}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->r0(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 10
    :cond_3
    :pswitch_3
    invoke-virtual {p0, v0, v2}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->r0(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 11
    :cond_4
    invoke-virtual {p0, v0, v2}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->r0(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    :cond_5
    const/4 v1, 0x1

    .line 12
    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->r0(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    .line 13
    :cond_6
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "receiveStart: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/join/mgps/event/n;->c()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onPause()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onPause()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->i:Lcom/join/android/app/component/video/g;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/android/app/component/video/g;->u()V

    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->e0()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->i:Lcom/join/android/app/component/video/g;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/join/android/app/component/video/g;->A()V

    .line 5
    :cond_1
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v0}, Lp1/f;->d()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 6
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_2

    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 8
    iget-object v2, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->j:Ljava/util/Map;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    return-void
.end method

.method p0(Lcom/join/mgps/dto/CollectionModuleSevenBean;)V
    .locals 6
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->showMain()V

    if-eqz p1, :cond_14

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionModuleSevenBean;->getTemplate_items()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_14

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionModuleSevenBean;->getTemplate_items()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/CollectionModuleSevenSubBean;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionModuleSevenSubBean;->getModel_val()Lcom/join/mgps/dto/CollectionModuleSevenItemBean;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 5
    :cond_1
    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionModuleSevenSubBean;->getModel_type()I

    move-result v1

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionModuleSevenSubBean;->getModel_val()Lcom/join/mgps/dto/CollectionModuleSevenItemBean;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    .line 7
    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionModuleSevenItemBean;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_3

    .line 8
    new-instance v4, Lcom/join/mgps/dto/CollectionSevenListBean;

    invoke-direct {v4}, Lcom/join/mgps/dto/CollectionSevenListBean;-><init>()V

    .line 9
    invoke-virtual {v4, v3}, Lcom/join/mgps/dto/CollectionSevenListBean;->setType(I)V

    .line 10
    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionModuleSevenSubBean;->getModel_val()Lcom/join/mgps/dto/CollectionModuleSevenItemBean;

    move-result-object v5

    if-eqz v5, :cond_2

    .line 11
    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionModuleSevenSubBean;->getModel_val()Lcom/join/mgps/dto/CollectionModuleSevenItemBean;

    move-result-object v5

    invoke-virtual {v5}, Lcom/join/mgps/dto/CollectionModuleSevenItemBean;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/join/mgps/dto/CollectionSevenListBean;->setTitle(Ljava/lang/String;)V

    .line 12
    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionModuleSevenSubBean;->getModel_val()Lcom/join/mgps/dto/CollectionModuleSevenItemBean;

    move-result-object v5

    invoke-virtual {v5}, Lcom/join/mgps/dto/CollectionModuleSevenItemBean;->getSub_title()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/join/mgps/dto/CollectionSevenListBean;->setSubTitle(Ljava/lang/String;)V

    .line 13
    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionModuleSevenSubBean;->getModel_val()Lcom/join/mgps/dto/CollectionModuleSevenItemBean;

    move-result-object v5

    invoke-virtual {v5}, Lcom/join/mgps/dto/CollectionModuleSevenItemBean;->getCollection_id()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/join/mgps/dto/CollectionSevenListBean;->setCollection_id(Ljava/lang/String;)V

    .line 14
    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionModuleSevenSubBean;->getModel_val()Lcom/join/mgps/dto/CollectionModuleSevenItemBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionModuleSevenItemBean;->getTpl_type()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/join/mgps/dto/CollectionSevenListBean;->setTpl_type(Ljava/lang/String;)V

    goto :goto_1

    .line 15
    :cond_2
    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionModuleSevenSubBean;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/join/mgps/dto/CollectionSevenListBean;->setTitle(Ljava/lang/String;)V

    .line 16
    :goto_1
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->g:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    const/4 v0, 0x2

    if-ne v1, v3, :cond_6

    if-eqz v2, :cond_0

    .line 17
    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionModuleSevenItemBean;->getGame_info()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 18
    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionModuleSevenItemBean;->getGame_info()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v1

    .line 19
    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionModuleSevenItemBean;->getCover_url()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_4

    .line 20
    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionModuleSevenItemBean;->getCover_url()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->setBig_pic(Ljava/lang/String;)V

    .line 21
    :cond_4
    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionModuleSevenItemBean;->getVideo_url()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_5

    .line 22
    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionModuleSevenItemBean;->getVideo_url()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->setV_url(Ljava/lang/String;)V

    .line 23
    :cond_5
    iget-object v3, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->g:Ljava/util/List;

    new-instance v4, Lcom/join/mgps/dto/CollectionSevenListBean;

    invoke-direct {p0, v1}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->s0(Lcom/join/mgps/dto/CommonGameInfoBean;)Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v1

    invoke-direct {v4, v0, v1}, Lcom/join/mgps/dto/CollectionSevenListBean;-><init>(ILjava/lang/Object;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 24
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->k:Ljava/util/List;

    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionModuleSevenItemBean;->getGame_info()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_6
    const/4 v3, 0x4

    const/4 v4, 0x3

    if-ne v1, v0, :cond_9

    if-eqz v2, :cond_8

    .line 25
    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionModuleSevenItemBean;->getCollection_list()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 26
    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionModuleSevenItemBean;->getCollection_list()Ljava/util/List;

    move-result-object v0

    .line 27
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 28
    invoke-direct {p0, v5}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->s0(Lcom/join/mgps/dto/CommonGameInfoBean;)Lcom/join/mgps/dto/CommonGameInfoBean;

    goto :goto_2

    .line 29
    :cond_7
    iget-object v1, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->g:Ljava/util/List;

    new-instance v5, Lcom/join/mgps/dto/CollectionSevenListBean;

    invoke-direct {v5, v3, v0}, Lcom/join/mgps/dto/CollectionSevenListBean;-><init>(ILjava/lang/Object;)V

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 30
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->k:Ljava/util/List;

    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionModuleSevenItemBean;->getCollection_list()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_8
    if-eqz v2, :cond_0

    .line 31
    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionModuleSevenItemBean;->getGame_list()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 32
    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionModuleSevenItemBean;->getGame_list()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 33
    iget-object v2, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->g:Ljava/util/List;

    new-instance v3, Lcom/join/mgps/dto/CollectionSevenListBean;

    invoke-direct {p0, v1}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->s0(Lcom/join/mgps/dto/CommonGameInfoBean;)Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lcom/join/mgps/dto/CollectionSevenListBean;-><init>(ILjava/lang/Object;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 34
    iget-object v2, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->k:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_9
    if-ne v1, v4, :cond_d

    if-eqz v2, :cond_c

    .line 35
    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionModuleSevenItemBean;->getGame_big()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v1

    if-eqz v1, :cond_c

    .line 36
    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionModuleSevenItemBean;->getGame_big()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v1

    .line 37
    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionModuleSevenItemBean;->getCover_url()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_a

    .line 38
    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionModuleSevenItemBean;->getCover_url()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->setBig_pic(Ljava/lang/String;)V

    .line 39
    :cond_a
    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionModuleSevenItemBean;->getVideo_url()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_b

    .line 40
    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionModuleSevenItemBean;->getVideo_url()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->setV_url(Ljava/lang/String;)V

    .line 41
    :cond_b
    iget-object v3, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->g:Ljava/util/List;

    new-instance v5, Lcom/join/mgps/dto/CollectionSevenListBean;

    invoke-direct {p0, v1}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->s0(Lcom/join/mgps/dto/CommonGameInfoBean;)Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v1

    invoke-direct {v5, v0, v1}, Lcom/join/mgps/dto/CollectionSevenListBean;-><init>(ILjava/lang/Object;)V

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 42
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->k:Ljava/util/List;

    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionModuleSevenItemBean;->getGame_big()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_c
    if-eqz v2, :cond_0

    .line 43
    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionModuleSevenItemBean;->getGame_list()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 44
    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionModuleSevenItemBean;->getGame_list()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 45
    iget-object v2, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->g:Ljava/util/List;

    new-instance v3, Lcom/join/mgps/dto/CollectionSevenListBean;

    invoke-direct {p0, v1}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->s0(Lcom/join/mgps/dto/CommonGameInfoBean;)Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lcom/join/mgps/dto/CollectionSevenListBean;-><init>(ILjava/lang/Object;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    iget-object v2, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->k:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_d
    if-ne v1, v3, :cond_e

    if-eqz v2, :cond_0

    .line 47
    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionModuleSevenItemBean;->getGame_big_list()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 48
    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionModuleSevenItemBean;->getGame_big_list()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 49
    iget-object v3, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->g:Ljava/util/List;

    new-instance v4, Lcom/join/mgps/dto/CollectionSevenListBean;

    invoke-direct {p0, v2}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->s0(Lcom/join/mgps/dto/CommonGameInfoBean;)Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v5

    invoke-direct {v4, v0, v5}, Lcom/join/mgps/dto/CollectionSevenListBean;-><init>(ILjava/lang/Object;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 50
    iget-object v3, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->k:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_e
    const/4 v0, 0x5

    if-ne v1, v0, :cond_f

    if-eqz v2, :cond_0

    .line 51
    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionModuleSevenItemBean;->getGame_list()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 52
    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionModuleSevenItemBean;->getGame_list()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 53
    iget-object v2, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->g:Ljava/util/List;

    new-instance v3, Lcom/join/mgps/dto/CollectionSevenListBean;

    invoke-direct {p0, v1}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->s0(Lcom/join/mgps/dto/CommonGameInfoBean;)Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lcom/join/mgps/dto/CollectionSevenListBean;-><init>(ILjava/lang/Object;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 54
    iget-object v2, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->k:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_f
    const/4 v4, 0x6

    if-ne v1, v4, :cond_11

    if-eqz v2, :cond_0

    .line 55
    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionModuleSevenItemBean;->getCollection_list()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 56
    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionModuleSevenItemBean;->getCollection_list()Ljava/util/List;

    move-result-object v0

    .line 57
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_10

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 58
    invoke-direct {p0, v4}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->s0(Lcom/join/mgps/dto/CommonGameInfoBean;)Lcom/join/mgps/dto/CommonGameInfoBean;

    goto :goto_7

    .line 59
    :cond_10
    iget-object v1, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->g:Ljava/util/List;

    new-instance v4, Lcom/join/mgps/dto/CollectionSevenListBean;

    invoke-direct {v4, v3, v0}, Lcom/join/mgps/dto/CollectionSevenListBean;-><init>(ILjava/lang/Object;)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->k:Ljava/util/List;

    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionModuleSevenItemBean;->getCollection_list()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto/16 :goto_0

    :cond_11
    const/4 v3, 0x7

    if-ne v1, v3, :cond_0

    if-eqz v2, :cond_0

    .line 61
    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionModuleSevenItemBean;->getAdvert_list()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 62
    iget-object v1, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->g:Ljava/util/List;

    new-instance v3, Lcom/join/mgps/dto/CollectionSevenListBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionModuleSevenItemBean;->getAdvert_list()Ljava/util/List;

    move-result-object v2

    invoke-direct {v3, v0, v2}, Lcom/join/mgps/dto/CollectionSevenListBean;-><init>(ILjava/lang/Object;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 63
    :cond_12
    iget-object p1, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->h:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    if-eqz p1, :cond_13

    .line 64
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->g:Ljava/util/List;

    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseQuickAdapter;->replaceData(Ljava/util/Collection;)V

    .line 65
    :cond_13
    invoke-virtual {p0}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->c0()V

    .line 66
    invoke-direct {p0}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->expDiscountGame()V

    goto :goto_8

    .line 67
    :cond_14
    invoke-virtual {p0}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->showLodingFailed()V

    :goto_8
    return-void
.end method

.method r0(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V
    .locals 0

    if-eqz p1, :cond_0

    packed-switch p2, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    .line 1
    :pswitch_1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->k0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 2
    :pswitch_2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->m0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 3
    :pswitch_3
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->j0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 4
    :pswitch_4
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->l0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    :cond_0
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method

.method relodingimag()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->e0()V

    return-void
.end method

.method setNetwork()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->w3(Landroid/content/Context;)V

    return-void
.end method

.method showLoding()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->d:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->e:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 3
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_0
    return-void
.end method

.method showLodingFailed()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->e:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->d:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method showMain()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->e:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->d:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method showMessage(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method
