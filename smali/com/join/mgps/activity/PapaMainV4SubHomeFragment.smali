.class public Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;
.super Landroidx/fragment/app/Fragment;
.source "PapaMainV4SubHomeFragment.java"

# interfaces
.implements Lcom/join/mgps/adapter/PapaMainV4Adapter$e;


# annotations
.annotation build Lorg/androidannotations/annotations/EFragment;
    value = 0x7f0c0636
.end annotation


# instance fields
.field private A:Z

.field b:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field c:Lcom/join/mgps/ptr/PtrClassicFrameLayout;
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

.field f:Lcom/facebook/drawee/view/SimpleDraweeView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field g:Lcom/join/mgps/pref/PrefDef_;
    .annotation build Lorg/androidannotations/annotations/sharedpreferences/Pref;
    .end annotation
.end field

.field private h:Z

.field private i:Landroid/content/Context;

.field private j:Z

.field private k:Z

.field private l:Z

.field private m:I

.field private n:Z

.field private o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommonMultiItemBean;",
            ">;"
        }
    .end annotation
.end field

.field private p:Lcom/join/mgps/adapter/PapaMainV4Adapter;

.field private q:Ljava/lang/String;

.field private r:I

.field private s:I

.field private t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            ">;"
        }
    .end annotation
.end field

.field private u:I

.field private v:Landroid/os/Handler;

.field w:Ljava/lang/Runnable;

.field private x:Ljava/lang/String;

.field private y:Lcom/join/mgps/dto/RecomDatabean;

.field private z:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->k:Z

    const/4 v1, 0x1

    .line 3
    iput-boolean v1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->l:Z

    .line 4
    iput v1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->m:I

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->o:Ljava/util/List;

    const/4 v1, 0x0

    .line 6
    iput-object v1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->t:Ljava/util/List;

    .line 7
    iput v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->u:I

    .line 8
    new-instance v0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$d;-><init>(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;)V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->w:Ljava/lang/Runnable;

    const-string v0, ""

    .line 9
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->x:Ljava/lang/String;

    return-void
.end method

.method private A0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->t:Ljava/util/List;

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
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->H0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method

.method private B0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->t:Ljava/util/List;

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
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->H0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method

.method private D0(Lcom/join/mgps/dto/PapaHomeBeanV9;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->getFragments()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 2
    instance-of v2, v1, Lcom/join/mgps/activity/PapaMainV4Fragment_;

    if-eqz v2, :cond_0

    .line 3
    check-cast v1, Lcom/join/mgps/activity/PapaMainV4Fragment_;

    invoke-virtual {v1, p1}, Lcom/join/mgps/activity/PapaMainV4Fragment;->Z(Lcom/join/mgps/dto/PapaHomeBeanV9;)V

    :cond_1
    return-void
.end method

.method private E0(Lcom/join/mgps/dto/CommonGameInfoBean;)V
    .locals 5

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->o0(Lcom/join/mgps/dto/CommonGameInfoBean;)Ljava/lang/String;

    move-result-object v0

    .line 2
    new-instance v1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string v2, "home"

    .line 3
    invoke-virtual {v1, v2}, Lcom/papa/sim/statistic/Ext;->setPage(Ljava/lang/String;)V

    .line 4
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadPointBase;->get_from()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/papa/sim/statistic/Ext;->setFrom(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 5
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getExp_position()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 6
    new-instance v2, Lcom/papa/sim/statistic/Data;

    invoke-direct {v2}, Lcom/papa/sim/statistic/Data;-><init>()V

    .line 7
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/papa/sim/statistic/Data;->setWhere(Ljava/lang/String;)Lcom/papa/sim/statistic/Data;

    .line 8
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 9
    :try_start_0
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/papa/sim/statistic/Data;->setGameId(J)Lcom/papa/sim/statistic/Data;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    .line 10
    :cond_0
    :goto_0
    iget-object v3, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-static {v3}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v3

    sget-object v4, Lcom/papa/sim/statistic/Event;->expGameAdPage:Lcom/papa/sim/statistic/Event;

    invoke-virtual {v3, v4, v1, v2}, Lcom/papa/sim/statistic/p;->T1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;Lcom/papa/sim/statistic/Data;)V

    .line 11
    invoke-static {p1}, Lcom/join/mgps/Util/UtilsMy;->g2(Lcom/join/mgps/dto/CommonGameInfoBean;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 12
    :try_start_1
    new-instance p1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {p1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string v1, "discount_game"

    .line 13
    invoke-virtual {p1, v1}, Lcom/papa/sim/statistic/Ext;->setResultCode(Ljava/lang/String;)V

    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/papa/sim/statistic/Ext;->setScenesCode(Ljava/lang/String;)V

    .line 15
    new-instance v1, Lcom/papa/sim/statistic/Data;

    invoke-direct {v1}, Lcom/papa/sim/statistic/Data;-><init>()V

    .line 16
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/papa/sim/statistic/Data;->setGameId(J)Lcom/papa/sim/statistic/Data;

    .line 17
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-static {v0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    invoke-virtual {v0, v4, p1, v1}, Lcom/papa/sim/statistic/p;->Y(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;Lcom/papa/sim/statistic/Data;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_1
    return-void
.end method

.method private F0(Lcom/join/mgps/dto/GameFromPopoWinBeanV2$DataBean;I)V
    .locals 0

    return-void
.end method

.method private H0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 16

    move-object/from16 v1, p0

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    iget v2, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->s:I

    if-ltz v2, :cond_3c

    .line 2
    :goto_0
    iget v3, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->r:I

    const/4 v4, 0x1

    add-int/2addr v3, v4

    iget-object v5, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->p:Lcom/join/mgps/adapter/PapaMainV4Adapter;

    invoke-virtual {v5}, Lcom/join/mgps/base/BaseQuickAdapter;->getItemCount()I

    move-result v5

    sub-int/2addr v5, v4

    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v3

    if-gt v2, v3, :cond_3c

    .line 3
    iget-object v3, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->p:Lcom/join/mgps/adapter/PapaMainV4Adapter;

    invoke-virtual {v3, v2}, Lcom/join/mgps/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/CommonMultiItemBean;

    if-nez v3, :cond_1

    goto/16 :goto_5

    .line 4
    :cond_1
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonMultiItemBean;->getItemType()I

    move-result v5

    const/4 v6, 0x5

    const-string v10, "\u6682\u505c"

    const-string v11, "\u66f4\u65b0"

    const-string v12, "\u542f\u52a8"

    const-string v14, "\u83b7\u53d6"

    const v7, 0x7f060031

    const v4, 0x7f080c48

    const-string v15, "/"

    const v13, 0x7f080c43

    const v8, 0x7f06002b

    if-eq v5, v6, :cond_2e

    const/4 v6, 0x7

    if-eq v5, v6, :cond_21

    const/16 v6, 0x9

    if-eq v5, v6, :cond_f

    const/16 v6, 0xb

    if-eq v5, v6, :cond_2

    goto/16 :goto_5

    .line 5
    :cond_2
    :try_start_0
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonMultiItemBean;->getData()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 6
    iget-object v5, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->b:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-virtual {v5, v2}, Landroidx/recyclerview/widget/RecyclerView;->findViewHolderForAdapterPosition(I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object v5

    .line 7
    instance-of v6, v5, Lcom/join/mgps/base/BaseViewHolder;

    if-eqz v6, :cond_3b

    .line 8
    check-cast v5, Lcom/join/mgps/base/BaseViewHolder;

    if-eqz v3, :cond_3b

    .line 9
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v6

    if-eqz v6, :cond_3b

    .line 10
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v6

    .line 11
    invoke-virtual/range {p1 .. p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v15

    invoke-static {v9, v15}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_3

    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v9

    if-eqz v9, :cond_3b

    invoke-virtual/range {p1 .. p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v15

    invoke-virtual {v15}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v15

    invoke-static {v9, v15}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_3b

    .line 12
    :cond_3
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v3

    const v9, 0x7f09049a

    if-nez v3, :cond_7

    .line 13
    invoke-virtual {v5, v9, v14}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    invoke-virtual {v3, v9, v13}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v10, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    invoke-virtual {v10, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v8

    invoke-virtual {v3, v9, v8}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 14
    invoke-virtual {v6}, Lcom/join/mgps/dto/GInfoBean;->getTag_info()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/Util/UtilsMy;->o0(Ljava/util/List;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 15
    iget-object v3, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-static {v3}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v3

    iget-object v8, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v6}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3, v8, v10}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 16
    invoke-virtual {v6}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v3

    invoke-virtual {v6}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-static {v3, v8}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v3

    if-nez v3, :cond_5

    .line 17
    iget-object v3, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-static {v3}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v3

    iget-object v8, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v6}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3, v8, v10}, Lcom/join/android/app/common/utils/APKUtils;->l(Landroid/content/Context;Ljava/lang/String;)Lcom/join/android/app/common/utils/APKUtils$a;

    move-result-object v3

    .line 18
    invoke-virtual {v6}, Lcom/join/mgps/dto/GInfoBean;->getVer()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-virtual {v3}, Lcom/join/android/app/common/utils/APKUtils$a;->d()I

    move-result v3

    invoke-virtual {v6}, Lcom/join/mgps/dto/GInfoBean;->getVer()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    if-ge v3, v6, :cond_4

    .line 19
    invoke-virtual {v5, v9, v11}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    invoke-virtual {v3, v9, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v9, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    .line 20
    :cond_4
    invoke-virtual {v5, v9, v12}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c4f

    invoke-virtual {v3, v9, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f060034

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v9, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    .line 21
    :cond_5
    invoke-virtual {v6}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v3

    invoke-virtual {v6}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    goto/16 :goto_5

    .line 22
    :cond_6
    invoke-virtual {v6}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v3

    invoke-virtual {v6}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    goto/16 :goto_5

    .line 23
    :cond_7
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v15

    .line 24
    invoke-virtual {v6}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v13

    invoke-virtual {v6}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v13, v7}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v7

    if-lez v7, :cond_8

    const/16 v15, 0x2b

    :cond_8
    if-eqz v15, :cond_e

    const/16 v7, 0x1b

    if-eq v15, v7, :cond_d

    const/16 v7, 0x30

    if-eq v15, v7, :cond_c

    const/4 v7, 0x2

    if-eq v15, v7, :cond_b

    const/4 v3, 0x3

    if-eq v15, v3, :cond_a

    const/4 v3, 0x5

    if-eq v15, v3, :cond_9

    const/4 v3, 0x6

    if-eq v15, v3, :cond_a

    const/4 v3, 0x7

    if-eq v15, v3, :cond_e

    const/16 v3, 0x2a

    if-eq v15, v3, :cond_9

    const/16 v3, 0x2b

    if-eq v15, v3, :cond_e

    packed-switch v15, :pswitch_data_0

    goto/16 :goto_5

    :pswitch_0
    const-string v3, "\u89e3\u538b"

    .line 25
    invoke-virtual {v5, v9, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c5c

    invoke-virtual {v3, v9, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v9, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    :pswitch_1
    const-string v3, "\u89e3\u538b\u4e2d"

    .line 26
    invoke-virtual {v5, v9, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f08043a

    invoke-virtual {v3, v9, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f060032

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v9, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    :pswitch_2
    const-string v3, "\u5b89\u88c5"

    .line 27
    invoke-virtual {v5, v9, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    invoke-virtual {v3, v9, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f060031

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v9, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    :pswitch_3
    const-string v3, "\u7b49\u5f85"

    .line 28
    invoke-virtual {v5, v9, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c43

    invoke-virtual {v3, v9, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v9, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    .line 29
    :pswitch_4
    invoke-virtual {v5, v9, v11}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    invoke-virtual {v3, v9, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f060031

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v9, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    .line 30
    :cond_9
    invoke-virtual {v5, v9, v12}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c4f

    invoke-virtual {v3, v9, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f060034

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v9, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    goto/16 :goto_5

    :cond_a
    :try_start_1
    const-string v3, "\u7ee7\u7eed"

    .line 31
    invoke-virtual {v5, v9, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c43

    invoke-virtual {v3, v9, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v9, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_5

    :catch_0
    move-exception v0

    move-object v3, v0

    .line 32
    :try_start_2
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_5

    .line 33
    :cond_b
    invoke-static {v3}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 34
    :try_start_3
    invoke-virtual {v5, v9, v10}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c43

    invoke-virtual {v3, v9, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v9, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto/16 :goto_5

    :catch_1
    move-exception v0

    move-object v3, v0

    .line 35
    :try_start_4
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_5

    :cond_c
    const-string v3, "\u5b89\u88c5\u4e2d"

    .line 36
    invoke-virtual {v5, v9, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c43

    invoke-virtual {v3, v9, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v9, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    .line 37
    :cond_d
    invoke-virtual {v5, v9, v10}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c43

    invoke-virtual {v3, v9, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v9, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    .line 38
    :cond_e
    invoke-virtual {v5, v9, v14}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c43

    invoke-virtual {v3, v9, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v9, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 39
    invoke-virtual {v6}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v3

    invoke-virtual {v6}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 40
    invoke-virtual {v5, v9}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const v4, 0x7f09109f

    invoke-virtual {v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    invoke-static {v3, v4, v6}, Lcom/join/mgps/Util/UtilsMy;->g3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/GInfoBean;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    goto/16 :goto_5

    :catch_2
    move-exception v0

    move-object v3, v0

    .line 41
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_5

    .line 42
    :cond_f
    :try_start_5
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonMultiItemBean;->getData()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/HomeRankingListBean;

    const/4 v5, -0x1

    const/4 v6, -0x1

    if-eqz v3, :cond_3b

    .line 43
    invoke-virtual {v3}, Lcom/join/mgps/dto/HomeRankingListBean;->getList()Ljava/util/List;

    move-result-object v7

    if-eqz v7, :cond_3b

    const/4 v7, 0x0

    .line 44
    :goto_1
    invoke-virtual {v3}, Lcom/join/mgps/dto/HomeRankingListBean;->getList()Ljava/util/List;

    move-result-object v13

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v13

    if-ge v7, v13, :cond_13

    .line 45
    invoke-virtual {v3}, Lcom/join/mgps/dto/HomeRankingListBean;->getList()Ljava/util/List;

    move-result-object v13

    invoke-interface {v13, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/List;

    if-eqz v13, :cond_12

    const/4 v4, 0x0

    .line 46
    :goto_2
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v8

    if-ge v4, v8, :cond_12

    .line 47
    invoke-interface {v13, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_11

    invoke-interface {v13, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {v8}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v8

    if-eqz v8, :cond_11

    .line 48
    invoke-interface {v13, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {v8}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v8

    .line 49
    invoke-virtual/range {p1 .. p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-static {v9, v8}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_10

    invoke-interface {v13, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {v8}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v8

    if-eqz v8, :cond_11

    invoke-virtual/range {p1 .. p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v13, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {v9}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v9

    invoke-virtual {v9}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_11

    :cond_10
    move v6, v4

    move v5, v7

    :cond_11
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_12
    add-int/lit8 v7, v7, 0x1

    const v4, 0x7f080c48

    const v8, 0x7f06002b

    goto :goto_1

    :cond_13
    if-ltz v5, :cond_3b

    if-gez v6, :cond_14

    goto/16 :goto_5

    .line 50
    :cond_14
    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->b:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v4

    if-eqz v4, :cond_3b

    .line 51
    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->b:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->findViewByPosition(I)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_3b

    const v7, 0x7f0917c8

    .line 52
    invoke-virtual {v4, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroidx/viewpager2/widget/ViewPager2;

    if-eqz v4, :cond_3b

    const/4 v7, 0x0

    .line 53
    invoke-virtual {v4, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v4, :cond_3b

    .line 54
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v7

    if-eqz v7, :cond_3b

    .line 55
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v7

    check-cast v7, Lcom/join/mgps/adapter/PapaMainHomeRankAdapter;

    if-eqz v7, :cond_3b

    .line 56
    invoke-virtual {v7}, Lcom/join/mgps/base/BaseQuickAdapter;->getItemCount()I

    move-result v8

    if-ge v5, v8, :cond_3b

    .line 57
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v4

    invoke-virtual {v4, v5}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->findViewByPosition(I)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_3b

    const v8, 0x7f0910e9

    .line 58
    invoke-virtual {v4, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v4, :cond_3b

    .line 59
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v8

    if-eqz v8, :cond_3b

    .line 60
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v8

    check-cast v8, Lcom/join/mgps/adapter/RankingItemV4Adapter;

    if-eqz v8, :cond_3b

    .line 61
    invoke-virtual {v7}, Lcom/join/mgps/base/BaseQuickAdapter;->getItemCount()I

    move-result v7

    if-ge v6, v7, :cond_3b

    .line 62
    invoke-virtual {v4, v6}, Landroidx/recyclerview/widget/RecyclerView;->findViewHolderForAdapterPosition(I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object v4

    .line 63
    instance-of v7, v4, Lcom/join/mgps/base/BaseViewHolder;

    if-eqz v7, :cond_3b

    .line 64
    invoke-virtual {v3}, Lcom/join/mgps/dto/HomeRankingListBean;->getList()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 65
    check-cast v4, Lcom/join/mgps/base/BaseViewHolder;

    if-eqz v3, :cond_3b

    .line 66
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v5

    if-eqz v5, :cond_3b

    .line 67
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v5

    .line 68
    invoke-virtual/range {p1 .. p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_15

    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v6

    if-eqz v6, :cond_3b

    invoke-virtual/range {p1 .. p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v7

    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_3b

    .line 69
    :cond_15
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v3

    if-nez v3, :cond_19

    const/4 v6, 0x1

    const/4 v7, 0x0

    .line 70
    invoke-direct {v1, v4, v6, v7}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->K0(Lcom/join/mgps/base/BaseViewHolder;ZZ)V

    const v3, 0x7f090e0d

    .line 71
    invoke-virtual {v4, v3, v14}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v6

    const v7, 0x7f080c43

    invoke-virtual {v6, v3, v7}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v6

    iget-object v7, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f06002b

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v7

    invoke-virtual {v6, v3, v7}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 72
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getTag_info()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/Util/UtilsMy;->o0(Ljava/util/List;)Z

    move-result v3

    if-eqz v3, :cond_18

    .line 73
    iget-object v3, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-static {v3}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v3

    iget-object v6, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v6, v7}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_17

    .line 74
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v3

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v3

    if-nez v3, :cond_17

    .line 75
    iget-object v3, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-static {v3}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v3

    iget-object v6, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v6, v7}, Lcom/join/android/app/common/utils/APKUtils;->l(Landroid/content/Context;Ljava/lang/String;)Lcom/join/android/app/common/utils/APKUtils$a;

    move-result-object v3

    .line 76
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getVer()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_16

    invoke-virtual {v3}, Lcom/join/android/app/common/utils/APKUtils$a;->d()I

    move-result v3

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getVer()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    if-ge v3, v5, :cond_16

    const v3, 0x7f090e0d

    .line 77
    invoke-virtual {v4, v3, v11}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    const v5, 0x7f080c48

    invoke-virtual {v4, v3, v5}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    iget-object v5, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f060031

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v4, v3, v5}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    :cond_16
    const v3, 0x7f090e0d

    .line 78
    invoke-virtual {v4, v3, v12}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    const v5, 0x7f080c4f

    invoke-virtual {v4, v3, v5}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    iget-object v5, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f060034

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v4, v3, v5}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    .line 79
    :cond_17
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v3

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    const v3, 0x7f090e0d

    .line 80
    invoke-virtual {v4, v3}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const v6, 0x7f09109f

    invoke-virtual {v4, v6}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    invoke-static {v3, v4, v5}, Lcom/join/mgps/Util/UtilsMy;->g3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/GInfoBean;)V

    goto/16 :goto_5

    .line 81
    :cond_18
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v3

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    const v3, 0x7f090e0d

    .line 82
    invoke-virtual {v4, v3}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const v6, 0x7f09109f

    invoke-virtual {v4, v6}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    invoke-static {v3, v4, v5}, Lcom/join/mgps/Util/UtilsMy;->g3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/GInfoBean;)V

    goto/16 :goto_5

    .line 83
    :cond_19
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v6

    .line 84
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v7

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v7

    if-lez v7, :cond_1a

    const/16 v6, 0x2b

    :cond_1a
    if-eqz v6, :cond_20

    const/16 v7, 0x1b

    if-eq v6, v7, :cond_1f

    const/16 v7, 0x30

    if-eq v6, v7, :cond_1e

    const/4 v7, 0x2

    if-eq v6, v7, :cond_1d

    const/4 v7, 0x3

    if-eq v6, v7, :cond_1b

    const/4 v7, 0x5

    if-eq v6, v7, :cond_1c

    const/4 v7, 0x6

    if-eq v6, v7, :cond_1b

    const/4 v7, 0x7

    if-eq v6, v7, :cond_20

    const/16 v7, 0x2a

    if-eq v6, v7, :cond_1c

    const/16 v7, 0x2b

    if-eq v6, v7, :cond_20

    packed-switch v6, :pswitch_data_1

    goto/16 :goto_5

    :pswitch_5
    const/4 v5, 0x1

    const/4 v6, 0x0

    .line 85
    invoke-direct {v1, v4, v6, v5}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->K0(Lcom/join/mgps/base/BaseViewHolder;ZZ)V

    .line 86
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v6

    invoke-static {v6, v7}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v6

    invoke-static {v6, v7}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const v6, 0x7f0900f1

    invoke-virtual {v4, v6, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    const-string v5, "\u70b9\u51fb\u91cd\u65b0\u89e3\u538b"

    const v6, 0x7f090d81

    invoke-virtual {v4, v6, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v5

    long-to-int v3, v5

    const v5, 0x7f091051

    invoke-virtual {v4, v5, v3}, Lcom/join/mgps/base/BaseViewHolder;->setProgress(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const-string v4, "\u89e3\u538b"

    const v5, 0x7f090e0d

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c5c

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v6, 0x7f06002b

    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    :pswitch_6
    const/4 v5, 0x1

    const/4 v6, 0x0

    .line 87
    invoke-direct {v1, v4, v6, v5}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->K0(Lcom/join/mgps/base/BaseViewHolder;ZZ)V

    .line 88
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v6

    invoke-static {v6, v7}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v6

    invoke-static {v6, v7}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const v6, 0x7f0900f1

    invoke-virtual {v4, v6, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    const-string v5, "\u89e3\u538b\u4e2d.."

    const v6, 0x7f090d81

    invoke-virtual {v4, v6, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v5

    long-to-int v3, v5

    const v5, 0x7f091051

    invoke-virtual {v4, v5, v3}, Lcom/join/mgps/base/BaseViewHolder;->setProgress(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const-string v4, "\u89e3\u538b\u4e2d"

    const v5, 0x7f090e0d

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f08043a

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v6, 0x7f060032

    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    :pswitch_7
    const-string v3, "\u5b89\u88c5"

    const v5, 0x7f090e0d

    .line 89
    invoke-virtual {v4, v5, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v6, 0x7f080c48

    invoke-virtual {v3, v5, v6}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v6, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x7f060031

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v6

    invoke-virtual {v3, v5, v6}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    const/4 v3, 0x1

    const/4 v5, 0x0

    .line 90
    invoke-direct {v1, v4, v3, v5}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->K0(Lcom/join/mgps/base/BaseViewHolder;ZZ)V

    goto/16 :goto_5

    :pswitch_8
    const/4 v5, 0x0

    .line 91
    invoke-direct {v1, v4, v5, v5}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->K0(Lcom/join/mgps/base/BaseViewHolder;ZZ)V

    const-string v5, "\u7b49\u5f85"

    const v6, 0x7f090e0d

    .line 92
    invoke-virtual {v4, v6, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v6

    invoke-static {v6, v7}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v6

    invoke-static {v6, v7}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const v6, 0x7f0900f1

    invoke-virtual {v4, v6, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v5

    long-to-int v3, v5

    const v5, 0x7f09104a

    invoke-virtual {v4, v5, v3}, Lcom/join/mgps/base/BaseViewHolder;->setProgress(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const-string v4, "\u7b49\u5f85\u4e2d"

    const v5, 0x7f090d81

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c43

    const v5, 0x7f090e0d

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v6, 0x7f06002b

    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    :pswitch_9
    const v3, 0x7f090e0d

    .line 93
    invoke-virtual {v4, v3, v11}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v5

    const v6, 0x7f080c48

    invoke-virtual {v5, v3, v6}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v5

    iget-object v6, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x7f060031

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v6

    invoke-virtual {v5, v3, v6}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    const/4 v3, 0x1

    const/4 v5, 0x0

    .line 94
    invoke-direct {v1, v4, v3, v5}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->K0(Lcom/join/mgps/base/BaseViewHolder;ZZ)V

    goto/16 :goto_5

    :cond_1b
    const/4 v5, 0x0

    goto :goto_3

    :cond_1c
    const v3, 0x7f090e0d

    .line 95
    invoke-virtual {v4, v3, v12}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v5

    const v6, 0x7f080c4f

    invoke-virtual {v5, v3, v6}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v5

    iget-object v6, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x7f060034

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v6

    invoke-virtual {v5, v3, v6}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    const/4 v3, 0x1

    const/4 v5, 0x0

    .line 96
    invoke-direct {v1, v4, v3, v5}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->K0(Lcom/join/mgps/base/BaseViewHolder;ZZ)V

    goto/16 :goto_5

    .line 97
    :goto_3
    invoke-direct {v1, v4, v5, v5}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->K0(Lcom/join/mgps/base/BaseViewHolder;ZZ)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    :try_start_6
    const-string v5, "\u7ee7\u7eed"

    const v6, 0x7f090e0d

    .line 98
    invoke-virtual {v4, v6, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v6

    invoke-static {v6, v7}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v6

    invoke-static {v6, v7}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const v6, 0x7f0900f1

    invoke-virtual {v4, v6, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v5

    long-to-int v3, v5

    const v5, 0x7f09104a

    invoke-virtual {v4, v5, v3}, Lcom/join/mgps/base/BaseViewHolder;->setProgress(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const-string v4, "\u6682\u505c\u4e2d"

    const v5, 0x7f090d81

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c43

    const v5, 0x7f090e0d

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v6, 0x7f06002b

    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    goto/16 :goto_5

    :catch_3
    move-exception v0

    move-object v3, v0

    .line 99
    :try_start_7
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_5

    .line 100
    :cond_1d
    invoke-static {v3}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    const/4 v5, 0x0

    .line 101
    invoke-direct {v1, v4, v5, v5}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->K0(Lcom/join/mgps/base/BaseViewHolder;ZZ)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5

    const v5, 0x7f090e0d

    .line 102
    :try_start_8
    invoke-virtual {v4, v5, v10}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v6

    invoke-static {v6, v7}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v6

    invoke-static {v6, v7}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const v6, 0x7f0900f1

    invoke-virtual {v4, v6, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v5

    long-to-int v6, v5

    const v5, 0x7f09104a

    invoke-virtual {v4, v5, v6}, Lcom/join/mgps/base/BaseViewHolder;->setProgress(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSpeed()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/S"

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const v5, 0x7f090d81

    invoke-virtual {v4, v5, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c43

    const v5, 0x7f090e0d

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v6, 0x7f06002b

    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_4

    goto/16 :goto_5

    :catch_4
    move-exception v0

    move-object v3, v0

    .line 103
    :try_start_9
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_5

    :cond_1e
    const-string v3, "\u5b89\u88c5\u4e2d"

    const v5, 0x7f090e0d

    .line 104
    invoke-virtual {v4, v5, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v6, 0x7f080c43

    invoke-virtual {v3, v5, v6}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v6, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x7f06002b

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v6

    invoke-virtual {v3, v5, v6}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    const/4 v3, 0x1

    const/4 v5, 0x0

    .line 105
    invoke-direct {v1, v4, v3, v5}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->K0(Lcom/join/mgps/base/BaseViewHolder;ZZ)V

    goto/16 :goto_5

    :cond_1f
    const v3, 0x7f090e0d

    .line 106
    invoke-virtual {v4, v3, v10}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    const v5, 0x7f080c43

    invoke-virtual {v4, v3, v5}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    iget-object v5, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f06002b

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v4, v3, v5}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    :cond_20
    const v3, 0x7f090e0d

    .line 107
    invoke-virtual {v4, v3, v14}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v6

    const v7, 0x7f080c43

    invoke-virtual {v6, v3, v7}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v6

    iget-object v7, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f06002b

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v7

    invoke-virtual {v6, v3, v7}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 108
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v6

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 109
    invoke-virtual {v4, v3}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const v6, 0x7f09109f

    invoke-virtual {v4, v6}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v6

    invoke-static {v3, v6, v5}, Lcom/join/mgps/Util/UtilsMy;->g3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/GInfoBean;)V

    const/4 v3, 0x1

    const/4 v5, 0x0

    .line 110
    invoke-direct {v1, v4, v3, v5}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->K0(Lcom/join/mgps/base/BaseViewHolder;ZZ)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_5

    goto/16 :goto_5

    :catch_5
    move-exception v0

    move-object v3, v0

    .line 111
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_5

    .line 112
    :cond_21
    :try_start_a
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonMultiItemBean;->getData()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 113
    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->b:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-virtual {v4, v2}, Landroidx/recyclerview/widget/RecyclerView;->findViewHolderForAdapterPosition(I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object v4

    .line 114
    instance-of v5, v4, Lcom/join/mgps/base/BaseViewHolder;

    if-eqz v5, :cond_3b

    .line 115
    check-cast v4, Lcom/join/mgps/base/BaseViewHolder;

    if-eqz v3, :cond_3b

    .line 116
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v5

    if-eqz v5, :cond_3b

    .line 117
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v5

    .line 118
    invoke-virtual/range {p1 .. p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_22

    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v6

    if-eqz v6, :cond_3b

    invoke-virtual/range {p1 .. p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v7

    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_3b

    .line 119
    :cond_22
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v3

    const v6, 0x7f0908a9

    if-nez v3, :cond_26

    .line 120
    invoke-virtual {v4, v6, v14}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v7, 0x7f080c43

    invoke-virtual {v3, v6, v7}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v7, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f06002b

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v7

    invoke-virtual {v3, v6, v7}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 121
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getTag_info()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/Util/UtilsMy;->o0(Ljava/util/List;)Z

    move-result v3

    if-eqz v3, :cond_25

    .line 122
    iget-object v3, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-static {v3}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v3

    iget-object v7, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v7, v8}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_24

    .line 123
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v3

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v3, v7}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v3

    if-nez v3, :cond_24

    .line 124
    iget-object v3, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-static {v3}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v3

    iget-object v7, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v7, v8}, Lcom/join/android/app/common/utils/APKUtils;->l(Landroid/content/Context;Ljava/lang/String;)Lcom/join/android/app/common/utils/APKUtils$a;

    move-result-object v3

    .line 125
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getVer()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_23

    invoke-virtual {v3}, Lcom/join/android/app/common/utils/APKUtils$a;->d()I

    move-result v3

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getVer()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    if-ge v3, v5, :cond_23

    .line 126
    invoke-virtual {v4, v6, v11}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c48

    invoke-virtual {v3, v6, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f060031

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v6, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    .line 127
    :cond_23
    invoke-virtual {v4, v6, v12}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c4f

    invoke-virtual {v3, v6, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f060034

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v6, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    .line 128
    :cond_24
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v3

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v3, v7}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 129
    invoke-virtual {v4, v6}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const v6, 0x7f09109f

    invoke-virtual {v4, v6}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    invoke-static {v3, v4, v5}, Lcom/join/mgps/Util/UtilsMy;->g3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/GInfoBean;)V

    goto/16 :goto_5

    .line 130
    :cond_25
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v3

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v3, v7}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 131
    invoke-virtual {v4, v6}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const v6, 0x7f09109f

    invoke-virtual {v4, v6}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    invoke-static {v3, v4, v5}, Lcom/join/mgps/Util/UtilsMy;->g3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/GInfoBean;)V

    goto/16 :goto_5

    .line 132
    :cond_26
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v7

    .line 133
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v8

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v8

    if-lez v8, :cond_27

    const/16 v7, 0x2b

    :cond_27
    if-eqz v7, :cond_2d

    const/16 v8, 0x1b

    if-eq v7, v8, :cond_2c

    const/16 v8, 0x30

    if-eq v7, v8, :cond_2b

    const/4 v8, 0x2

    if-eq v7, v8, :cond_2a

    const/4 v8, 0x3

    if-eq v7, v8, :cond_29

    const/4 v8, 0x5

    if-eq v7, v8, :cond_28

    const/4 v8, 0x6

    if-eq v7, v8, :cond_29

    const/4 v8, 0x7

    if-eq v7, v8, :cond_2d

    const/16 v8, 0x2a

    if-eq v7, v8, :cond_28

    const/16 v8, 0x2b

    if-eq v7, v8, :cond_2d

    packed-switch v7, :pswitch_data_2

    goto/16 :goto_5

    .line 134
    :pswitch_a
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v7

    invoke-static {v7, v8}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v7

    invoke-static {v7, v8}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const v7, 0x7f0900f1

    invoke-virtual {v4, v7, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    const-string v5, "\u70b9\u51fb\u91cd\u65b0\u89e3\u538b"

    const v7, 0x7f090d81

    invoke-virtual {v4, v7, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v7

    long-to-int v3, v7

    const v5, 0x7f091051

    invoke-virtual {v4, v5, v3}, Lcom/join/mgps/base/BaseViewHolder;->setProgress(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const-string v4, "\u89e3\u538b"

    invoke-virtual {v3, v6, v4}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c5c

    invoke-virtual {v3, v6, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f06002b

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v6, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    .line 135
    :pswitch_b
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v7

    invoke-static {v7, v8}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v7

    invoke-static {v7, v8}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const v7, 0x7f0900f1

    invoke-virtual {v4, v7, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    const-string v5, "\u89e3\u538b\u4e2d.."

    const v7, 0x7f090d81

    invoke-virtual {v4, v7, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v7

    long-to-int v3, v7

    const v5, 0x7f091051

    invoke-virtual {v4, v5, v3}, Lcom/join/mgps/base/BaseViewHolder;->setProgress(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const-string v4, "\u89e3\u538b\u4e2d"

    invoke-virtual {v3, v6, v4}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f08043a

    invoke-virtual {v3, v6, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f060032

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v6, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    :pswitch_c
    const-string v3, "\u5b89\u88c5"

    .line 136
    invoke-virtual {v4, v6, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c48

    invoke-virtual {v3, v6, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f060031

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v6, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    :pswitch_d
    const-string v5, "\u7b49\u5f85"

    .line 137
    invoke-virtual {v4, v6, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v7

    invoke-static {v7, v8}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v7

    invoke-static {v7, v8}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const v7, 0x7f0900f1

    invoke-virtual {v4, v7, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v7

    long-to-int v3, v7

    const v5, 0x7f09104a

    invoke-virtual {v4, v5, v3}, Lcom/join/mgps/base/BaseViewHolder;->setProgress(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const-string v4, "\u7b49\u5f85\u4e2d"

    const v5, 0x7f090d81

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c43

    invoke-virtual {v3, v6, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f06002b

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v6, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    .line 138
    :pswitch_e
    invoke-virtual {v4, v6, v11}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c48

    invoke-virtual {v3, v6, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f060031

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v6, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    .line 139
    :cond_28
    invoke-virtual {v4, v6, v12}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c4f

    invoke-virtual {v3, v6, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f060034

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v6, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_8

    goto/16 :goto_5

    :cond_29
    :try_start_b
    const-string v5, "\u7ee7\u7eed"

    .line 140
    invoke-virtual {v4, v6, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v7

    invoke-static {v7, v8}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v7

    invoke-static {v7, v8}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const v7, 0x7f0900f1

    invoke-virtual {v4, v7, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v7

    long-to-int v3, v7

    const v5, 0x7f09104a

    invoke-virtual {v4, v5, v3}, Lcom/join/mgps/base/BaseViewHolder;->setProgress(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const-string v4, "\u6682\u505c\u4e2d"

    const v5, 0x7f090d81

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c43

    invoke-virtual {v3, v6, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f06002b

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v6, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_6

    goto/16 :goto_5

    :catch_6
    move-exception v0

    move-object v3, v0

    .line 141
    :try_start_c
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_5

    .line 142
    :cond_2a
    invoke-static {v3}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_8

    .line 143
    :try_start_d
    invoke-virtual {v4, v6, v10}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v7

    invoke-static {v7, v8}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v7

    invoke-static {v7, v8}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const v7, 0x7f0900f1

    invoke-virtual {v4, v7, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v7

    long-to-int v5, v7

    const v7, 0x7f09104a

    invoke-virtual {v4, v7, v5}, Lcom/join/mgps/base/BaseViewHolder;->setProgress(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSpeed()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/S"

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const v5, 0x7f090d81

    invoke-virtual {v4, v5, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c43

    invoke-virtual {v3, v6, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f06002b

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v6, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_7

    goto/16 :goto_5

    :catch_7
    move-exception v0

    move-object v3, v0

    .line 144
    :try_start_e
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_5

    :cond_2b
    const-string v3, "\u5b89\u88c5\u4e2d"

    .line 145
    invoke-virtual {v4, v6, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c43

    invoke-virtual {v3, v6, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f06002b

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v6, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    .line 146
    :cond_2c
    invoke-virtual {v4, v6, v10}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c43

    invoke-virtual {v3, v6, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f06002b

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v6, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    .line 147
    :cond_2d
    invoke-virtual {v4, v6, v14}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v7, 0x7f080c43

    invoke-virtual {v3, v6, v7}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v7, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f06002b

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v7

    invoke-virtual {v3, v6, v7}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 148
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v3

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v3, v7}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 149
    invoke-virtual {v4, v6}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const v6, 0x7f09109f

    invoke-virtual {v4, v6}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    invoke-static {v3, v4, v5}, Lcom/join/mgps/Util/UtilsMy;->g3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/GInfoBean;)V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_8

    goto/16 :goto_5

    :catch_8
    move-exception v0

    move-object v3, v0

    .line 150
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_5

    .line 151
    :cond_2e
    :try_start_f
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonMultiItemBean;->getData()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 152
    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->b:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-virtual {v4, v2}, Landroidx/recyclerview/widget/RecyclerView;->findViewHolderForAdapterPosition(I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object v4

    .line 153
    instance-of v5, v4, Lcom/join/mgps/base/BaseViewHolder;

    if-eqz v5, :cond_3b

    .line 154
    check-cast v4, Lcom/join/mgps/base/BaseViewHolder;

    if-eqz v3, :cond_3b

    .line 155
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v5

    if-eqz v5, :cond_3b

    .line 156
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v5

    .line 157
    invoke-virtual/range {p1 .. p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_2f

    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v6

    if-eqz v6, :cond_3b

    invoke-virtual/range {p1 .. p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v7

    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_3b

    .line 158
    :cond_2f
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v3

    if-nez v3, :cond_33

    const/4 v6, 0x1

    const/4 v7, 0x0

    .line 159
    invoke-direct {v1, v4, v6, v7}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->K0(Lcom/join/mgps/base/BaseViewHolder;ZZ)V

    const v3, 0x7f090e0d

    .line 160
    invoke-virtual {v4, v3, v14}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v6

    const v7, 0x7f080c43

    invoke-virtual {v6, v3, v7}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v6

    iget-object v7, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f06002b

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v7

    invoke-virtual {v6, v3, v7}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 161
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getTag_info()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/Util/UtilsMy;->o0(Ljava/util/List;)Z

    move-result v3

    if-eqz v3, :cond_32

    .line 162
    iget-object v3, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-static {v3}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v3

    iget-object v6, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v6, v7}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_31

    .line 163
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v3

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v3

    if-nez v3, :cond_31

    .line 164
    iget-object v3, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-static {v3}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v3

    iget-object v6, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v6, v7}, Lcom/join/android/app/common/utils/APKUtils;->l(Landroid/content/Context;Ljava/lang/String;)Lcom/join/android/app/common/utils/APKUtils$a;

    move-result-object v3

    .line 165
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getVer()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_30

    invoke-virtual {v3}, Lcom/join/android/app/common/utils/APKUtils$a;->d()I

    move-result v3

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getVer()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    if-ge v3, v5, :cond_30

    const v3, 0x7f090e0d

    .line 166
    invoke-virtual {v4, v3, v11}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    const v5, 0x7f080c48

    invoke-virtual {v4, v3, v5}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    iget-object v5, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f060031

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v4, v3, v5}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    :cond_30
    const v3, 0x7f090e0d

    .line 167
    invoke-virtual {v4, v3, v12}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    const v5, 0x7f080c4f

    invoke-virtual {v4, v3, v5}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    iget-object v5, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f060034

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v4, v3, v5}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    .line 168
    :cond_31
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v3

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    const v3, 0x7f090e0d

    .line 169
    invoke-virtual {v4, v3}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const v6, 0x7f09109f

    invoke-virtual {v4, v6}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    invoke-static {v3, v4, v5}, Lcom/join/mgps/Util/UtilsMy;->g3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/GInfoBean;)V

    goto/16 :goto_5

    .line 170
    :cond_32
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v3

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    const v3, 0x7f090e0d

    .line 171
    invoke-virtual {v4, v3}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const v6, 0x7f09109f

    invoke-virtual {v4, v6}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    invoke-static {v3, v4, v5}, Lcom/join/mgps/Util/UtilsMy;->g3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/GInfoBean;)V

    goto/16 :goto_5

    .line 172
    :cond_33
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v6

    .line 173
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v7

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v7

    if-lez v7, :cond_34

    const/16 v6, 0x2b

    :cond_34
    if-eqz v6, :cond_3a

    const/16 v7, 0x1b

    if-eq v6, v7, :cond_39

    const/16 v7, 0x30

    if-eq v6, v7, :cond_38

    const/4 v7, 0x2

    if-eq v6, v7, :cond_37

    const/4 v7, 0x3

    if-eq v6, v7, :cond_35

    const/4 v7, 0x5

    if-eq v6, v7, :cond_36

    const/4 v7, 0x6

    if-eq v6, v7, :cond_35

    const/4 v7, 0x7

    if-eq v6, v7, :cond_3a

    const/16 v7, 0x2a

    if-eq v6, v7, :cond_36

    const/16 v7, 0x2b

    if-eq v6, v7, :cond_3a

    packed-switch v6, :pswitch_data_3

    goto/16 :goto_5

    :pswitch_f
    const/4 v5, 0x1

    const/4 v6, 0x0

    .line 174
    invoke-direct {v1, v4, v6, v5}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->K0(Lcom/join/mgps/base/BaseViewHolder;ZZ)V

    .line 175
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v6

    invoke-static {v6, v7}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v6

    invoke-static {v6, v7}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const v6, 0x7f0900f1

    invoke-virtual {v4, v6, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    const-string v5, "\u70b9\u51fb\u91cd\u65b0\u89e3\u538b"

    const v6, 0x7f090d81

    invoke-virtual {v4, v6, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v5

    long-to-int v3, v5

    const v5, 0x7f091051

    invoke-virtual {v4, v5, v3}, Lcom/join/mgps/base/BaseViewHolder;->setProgress(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const-string v4, "\u89e3\u538b"

    const v5, 0x7f090e0d

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c5c

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v6, 0x7f06002b

    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    :pswitch_10
    const/4 v5, 0x1

    const/4 v6, 0x0

    .line 176
    invoke-direct {v1, v4, v6, v5}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->K0(Lcom/join/mgps/base/BaseViewHolder;ZZ)V

    .line 177
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v6

    invoke-static {v6, v7}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v6

    invoke-static {v6, v7}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const v6, 0x7f0900f1

    invoke-virtual {v4, v6, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    const-string v5, "\u89e3\u538b\u4e2d.."

    const v6, 0x7f090d81

    invoke-virtual {v4, v6, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v5

    long-to-int v3, v5

    const v5, 0x7f091051

    invoke-virtual {v4, v5, v3}, Lcom/join/mgps/base/BaseViewHolder;->setProgress(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const-string v4, "\u89e3\u538b\u4e2d"

    const v5, 0x7f090e0d

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f08043a

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v6, 0x7f060032

    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    :pswitch_11
    const-string v3, "\u5b89\u88c5"

    const v5, 0x7f090e0d

    .line 178
    invoke-virtual {v4, v5, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v6, 0x7f080c48

    invoke-virtual {v3, v5, v6}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v6, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x7f060031

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v6

    invoke-virtual {v3, v5, v6}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    const/4 v3, 0x1

    const/4 v5, 0x0

    .line 179
    invoke-direct {v1, v4, v3, v5}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->K0(Lcom/join/mgps/base/BaseViewHolder;ZZ)V

    goto/16 :goto_5

    :pswitch_12
    const/4 v5, 0x0

    .line 180
    invoke-direct {v1, v4, v5, v5}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->K0(Lcom/join/mgps/base/BaseViewHolder;ZZ)V

    const-string v5, "\u7b49\u5f85"

    const v6, 0x7f090e0d

    .line 181
    invoke-virtual {v4, v6, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v6

    invoke-static {v6, v7}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v6

    invoke-static {v6, v7}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const v6, 0x7f0900f1

    invoke-virtual {v4, v6, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v5

    long-to-int v3, v5

    const v5, 0x7f09104a

    invoke-virtual {v4, v5, v3}, Lcom/join/mgps/base/BaseViewHolder;->setProgress(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const-string v4, "\u7b49\u5f85\u4e2d"

    const v5, 0x7f090d81

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c43

    const v5, 0x7f090e0d

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v6, 0x7f06002b

    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    :pswitch_13
    const v3, 0x7f090e0d

    .line 182
    invoke-virtual {v4, v3, v11}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v5

    const v6, 0x7f080c48

    invoke-virtual {v5, v3, v6}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v5

    iget-object v6, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x7f060031

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v6

    invoke-virtual {v5, v3, v6}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    const/4 v3, 0x1

    const/4 v5, 0x0

    .line 183
    invoke-direct {v1, v4, v3, v5}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->K0(Lcom/join/mgps/base/BaseViewHolder;ZZ)V

    goto/16 :goto_5

    :cond_35
    const/4 v5, 0x0

    goto :goto_4

    :cond_36
    const v3, 0x7f090e0d

    .line 184
    invoke-virtual {v4, v3, v12}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v5

    const v6, 0x7f080c4f

    invoke-virtual {v5, v3, v6}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v5

    iget-object v6, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x7f060034

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v6

    invoke-virtual {v5, v3, v6}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    const/4 v3, 0x1

    const/4 v5, 0x0

    .line 185
    invoke-direct {v1, v4, v3, v5}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->K0(Lcom/join/mgps/base/BaseViewHolder;ZZ)V

    goto/16 :goto_5

    .line 186
    :goto_4
    invoke-direct {v1, v4, v5, v5}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->K0(Lcom/join/mgps/base/BaseViewHolder;ZZ)V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_b

    :try_start_10
    const-string v5, "\u7ee7\u7eed"

    const v6, 0x7f090e0d

    .line 187
    invoke-virtual {v4, v6, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v6

    invoke-static {v6, v7}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v6

    invoke-static {v6, v7}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const v6, 0x7f0900f1

    invoke-virtual {v4, v6, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v5

    long-to-int v3, v5

    const v5, 0x7f09104a

    invoke-virtual {v4, v5, v3}, Lcom/join/mgps/base/BaseViewHolder;->setProgress(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const-string v4, "\u6682\u505c\u4e2d"

    const v5, 0x7f090d81

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c43

    const v5, 0x7f090e0d

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v6, 0x7f06002b

    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_9

    goto/16 :goto_5

    :catch_9
    move-exception v0

    move-object v3, v0

    .line 188
    :try_start_11
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_5

    .line 189
    :cond_37
    invoke-static {v3}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    const/4 v5, 0x0

    .line 190
    invoke-direct {v1, v4, v5, v5}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->K0(Lcom/join/mgps/base/BaseViewHolder;ZZ)V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_b

    const v5, 0x7f090e0d

    .line 191
    :try_start_12
    invoke-virtual {v4, v5, v10}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v6

    invoke-static {v6, v7}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v6

    invoke-static {v6, v7}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const v6, 0x7f0900f1

    invoke-virtual {v4, v6, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v5

    long-to-int v6, v5

    const v5, 0x7f09104a

    invoke-virtual {v4, v5, v6}, Lcom/join/mgps/base/BaseViewHolder;->setProgress(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSpeed()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/S"

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const v5, 0x7f090d81

    invoke-virtual {v4, v5, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c43

    const v5, 0x7f090e0d

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v6, 0x7f06002b

    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_a

    goto/16 :goto_5

    :catch_a
    move-exception v0

    move-object v3, v0

    .line 192
    :try_start_13
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_5

    :cond_38
    const-string v3, "\u5b89\u88c5\u4e2d"

    const v5, 0x7f090e0d

    .line 193
    invoke-virtual {v4, v5, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v6, 0x7f080c43

    invoke-virtual {v3, v5, v6}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v6, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x7f06002b

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v6

    invoke-virtual {v3, v5, v6}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    const/4 v3, 0x1

    const/4 v5, 0x0

    .line 194
    invoke-direct {v1, v4, v3, v5}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->K0(Lcom/join/mgps/base/BaseViewHolder;ZZ)V

    goto :goto_5

    :cond_39
    const v3, 0x7f090e0d

    .line 195
    invoke-virtual {v4, v3, v10}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    const v5, 0x7f080c43

    invoke-virtual {v4, v3, v5}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    iget-object v5, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f06002b

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v4, v3, v5}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_5

    :cond_3a
    const v3, 0x7f090e0d

    .line 196
    invoke-virtual {v4, v3, v14}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v6

    const v7, 0x7f080c43

    invoke-virtual {v6, v3, v7}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v6

    iget-object v7, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f06002b

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v7

    invoke-virtual {v6, v3, v7}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 197
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v6

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 198
    invoke-virtual {v4, v3}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const v6, 0x7f09109f

    invoke-virtual {v4, v6}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v6

    invoke-static {v3, v6, v5}, Lcom/join/mgps/Util/UtilsMy;->g3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/GInfoBean;)V

    const/4 v3, 0x1

    const/4 v5, 0x0

    .line 199
    invoke-direct {v1, v4, v3, v5}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->K0(Lcom/join/mgps/base/BaseViewHolder;ZZ)V
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_b

    goto :goto_5

    :catch_b
    move-exception v0

    move-object v3, v0

    .line 200
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    :cond_3b
    :goto_5
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_3c
    return-void

    nop

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

    :pswitch_data_2
    .packed-switch 0x9
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x9
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
    .end packed-switch
.end method

.method private K0(Lcom/join/mgps/base/BaseViewHolder;ZZ)V
    .locals 4

    const v0, 0x7f090e0b

    .line 1
    invoke-virtual {p1, v0, p2}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p1

    const v0, 0x7f09145e

    invoke-virtual {p1, v0, p2}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p1

    xor-int/lit8 v0, p2, 0x1

    const v1, 0x7f090c7d

    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p1

    const v0, 0x7f091051

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez p2, :cond_0

    if-eqz p3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {p1, v0, v3}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p1

    const v0, 0x7f09104a

    if-nez p2, :cond_1

    if-nez p3, :cond_1

    const/4 v1, 0x1

    :cond_1
    invoke-virtual {p1, v0, v1}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    return-void
.end method

.method private L0()V
    .locals 23

    move-object/from16 v1, p0

    .line 1
    iget v0, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->s:I

    if-ltz v0, :cond_a

    move v2, v0

    .line 2
    :goto_0
    iget v0, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->r:I

    add-int/lit8 v0, v0, 0x1

    iget-object v3, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->p:Lcom/join/mgps/adapter/PapaMainV4Adapter;

    invoke-virtual {v3}, Lcom/join/mgps/base/BaseQuickAdapter;->getItemCount()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-gt v2, v0, :cond_a

    .line 3
    iget-object v0, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->p:Lcom/join/mgps/adapter/PapaMainV4Adapter;

    invoke-virtual {v0, v2}, Lcom/join/mgps/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/CommonMultiItemBean;

    if-nez v0, :cond_0

    goto/16 :goto_6

    .line 4
    :cond_0
    invoke-virtual {v0}, Lcom/join/mgps/dto/CommonMultiItemBean;->getItemType()I

    move-result v3

    const/4 v4, 0x5

    const-string v5, "/S"

    const-string v11, "/"

    if-eq v3, v4, :cond_7

    const/4 v4, 0x7

    if-eq v3, v4, :cond_6

    const/16 v4, 0x9

    if-eq v3, v4, :cond_1

    goto/16 :goto_6

    .line 5
    :cond_1
    :try_start_0
    invoke-virtual {v0}, Lcom/join/mgps/dto/CommonMultiItemBean;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/HomeRankingListBean;

    .line 6
    iget-object v3, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->b:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v3

    if-eqz v3, :cond_9

    .line 7
    invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->findViewByPosition(I)Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_9

    const v4, 0x7f0917c8

    .line 8
    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroidx/viewpager2/widget/ViewPager2;

    const/4 v4, 0x0

    .line 9
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v3, :cond_9

    .line 10
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v15

    if-eqz v15, :cond_9

    .line 11
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v15

    check-cast v15, Lcom/join/mgps/adapter/PapaMainHomeRankAdapter;

    if-eqz v15, :cond_9

    .line 12
    invoke-virtual {v15}, Lcom/join/mgps/base/BaseQuickAdapter;->getItemCount()I

    move-result v4

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v4, :cond_9

    .line 13
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v7

    invoke-virtual {v7, v6}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->findViewByPosition(I)Landroid/view/View;

    move-result-object v7

    if-eqz v7, :cond_5

    const v9, 0x7f0910e9

    .line 14
    invoke-virtual {v7, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v7, :cond_5

    .line 15
    invoke-virtual {v7}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v9

    if-eqz v9, :cond_5

    .line 16
    invoke-virtual {v7}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v9

    check-cast v9, Lcom/join/mgps/adapter/RankingItemV4Adapter;

    if-eqz v9, :cond_5

    .line 17
    invoke-virtual {v15}, Lcom/join/mgps/base/BaseQuickAdapter;->getItemCount()I

    move-result v9

    const/4 v8, 0x0

    :goto_2
    if-ge v8, v9, :cond_5

    .line 18
    invoke-virtual {v7, v8}, Landroidx/recyclerview/widget/RecyclerView;->findViewHolderForAdapterPosition(I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object v10

    .line 19
    instance-of v12, v10, Lcom/join/mgps/base/BaseViewHolder;

    if-eqz v12, :cond_3

    .line 20
    invoke-virtual {v0}, Lcom/join/mgps/dto/HomeRankingListBean;->getList()Ljava/util/List;

    move-result-object v12

    invoke-interface {v12, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/List;

    invoke-interface {v12, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 21
    check-cast v10, Lcom/join/mgps/base/BaseViewHolder;

    if-eqz v12, :cond_3

    .line 22
    invoke-virtual {v12}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v16

    if-eqz v16, :cond_3

    .line 23
    invoke-virtual {v12}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v12

    .line 24
    invoke-static {}, Lcom/join/android/app/common/servcie/i;->e()Lcom/join/android/app/common/servcie/i;

    move-result-object v13

    invoke-virtual {v12}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Lcom/join/android/app/common/servcie/i;->f(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v13

    if-eqz v13, :cond_3

    .line 25
    invoke-virtual {v13}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getShowSize()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v18

    const-wide/high16 v16, 0x4090000000000000L    # 1024.0

    mul-double v18, v18, v16

    move-object v14, v3

    move/from16 v20, v4

    mul-double v3, v18, v16

    double-to-long v3, v3

    move-object/from16 v18, v0

    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v21

    move-object/from16 v19, v7

    invoke-static/range {v21 .. v22}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v3, v4}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const v3, 0x7f0900f1

    invoke-virtual {v10, v3, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 27
    invoke-virtual {v12}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    const/16 v3, 0xc

    if-ne v0, v3, :cond_2

    .line 28
    invoke-virtual {v13}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v3

    long-to-int v0, v3

    const v3, 0x7f091051

    invoke-virtual {v10, v3, v0}, Lcom/join/mgps/base/BaseViewHolder;->setProgress(II)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_3

    .line 29
    :cond_2
    invoke-virtual {v13}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v3

    long-to-int v0, v3

    const v3, 0x7f09104a

    invoke-virtual {v10, v3, v0}, Lcom/join/mgps/base/BaseViewHolder;->setProgress(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 30
    :goto_3
    invoke-virtual {v12}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    const/4 v3, 0x2

    if-ne v0, v3, :cond_4

    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSpeed()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const v3, 0x7f090d81

    invoke-virtual {v10, v3, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :cond_3
    move-object/from16 v18, v0

    move-object v14, v3

    move/from16 v20, v4

    move-object/from16 v19, v7

    :cond_4
    :goto_4
    add-int/lit8 v8, v8, 0x1

    move-object v3, v14

    move-object/from16 v0, v18

    move-object/from16 v7, v19

    move/from16 v4, v20

    goto/16 :goto_2

    :cond_5
    move-object/from16 v18, v0

    move-object v14, v3

    move/from16 v20, v4

    add-int/lit8 v6, v6, 0x1

    move-object v3, v14

    move-object/from16 v0, v18

    move/from16 v4, v20

    goto/16 :goto_1

    :catch_0
    move-exception v0

    .line 32
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_6

    .line 33
    :cond_6
    :try_start_1
    invoke-virtual {v0}, Lcom/join/mgps/dto/CommonMultiItemBean;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 34
    iget-object v3, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->b:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/RecyclerView;->findViewHolderForAdapterPosition(I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object v3

    .line 35
    instance-of v4, v3, Lcom/join/mgps/base/BaseViewHolder;

    if-eqz v4, :cond_9

    .line 36
    check-cast v3, Lcom/join/mgps/base/BaseViewHolder;

    if-eqz v0, :cond_9

    .line 37
    invoke-virtual {v0}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v4

    if-eqz v4, :cond_9

    .line 38
    invoke-virtual {v0}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    .line 39
    invoke-static {}, Lcom/join/android/app/common/servcie/i;->e()Lcom/join/android/app/common/servcie/i;

    move-result-object v4

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/join/android/app/common/servcie/i;->f(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 40
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getShowSize()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v4

    const-wide/high16 v6, 0x4090000000000000L    # 1024.0

    mul-double v4, v4, v6

    mul-double v4, v4, v6

    double-to-long v4, v4

    .line 41
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v7

    invoke-static {v7, v8}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4, v5}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const v4, 0x7f0900f1

    invoke-virtual {v3, v4, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_6

    :catch_1
    move-exception v0

    .line 42
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_6

    .line 43
    :cond_7
    :try_start_2
    invoke-virtual {v0}, Lcom/join/mgps/dto/CommonMultiItemBean;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 44
    iget-object v3, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->b:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/RecyclerView;->findViewHolderForAdapterPosition(I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object v3

    .line 45
    instance-of v4, v3, Lcom/join/mgps/base/BaseViewHolder;

    if-eqz v4, :cond_9

    .line 46
    check-cast v3, Lcom/join/mgps/base/BaseViewHolder;

    if-eqz v0, :cond_9

    .line 47
    invoke-virtual {v0}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v4

    if-eqz v4, :cond_9

    .line 48
    invoke-virtual {v0}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    .line 49
    invoke-static {}, Lcom/join/android/app/common/servcie/i;->e()Lcom/join/android/app/common/servcie/i;

    move-result-object v4

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/join/android/app/common/servcie/i;->f(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v4

    if-eqz v4, :cond_9

    .line 50
    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getShowSize()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v6

    const-wide/high16 v8, 0x4090000000000000L    # 1024.0

    mul-double v6, v6, v8

    mul-double v6, v6, v8

    double-to-long v6, v6

    .line 51
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v9

    invoke-static {v9, v10}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v6, v7}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const v7, 0x7f0900f1

    invoke-virtual {v3, v7, v6}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 52
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v6

    const/16 v7, 0xc

    if-ne v6, v7, :cond_8

    .line 53
    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v6

    long-to-int v7, v6

    const v6, 0x7f091051

    invoke-virtual {v3, v6, v7}, Lcom/join/mgps/base/BaseViewHolder;->setProgress(II)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_5

    .line 54
    :cond_8
    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v6

    long-to-int v7, v6

    const v6, 0x7f09104a

    invoke-virtual {v3, v6, v7}, Lcom/join/mgps/base/BaseViewHolder;->setProgress(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 55
    :goto_5
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    const/4 v6, 0x2

    if-ne v0, v6, :cond_9

    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSpeed()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const v4, 0x7f090d81

    invoke-virtual {v3, v4, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_6

    :catch_2
    move-exception v0

    .line 57
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_9
    :goto_6
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_a
    return-void
.end method

.method private N0(Lcom/join/mgps/dto/CommonGameInfoBean;)Lcom/join/mgps/dto/CommonGameInfoBean;
    .locals 5

    if-eqz p1, :cond_3

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v0

    .line 3
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v1

    invoke-virtual {v1}, Lp1/f;->d()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getMod_id()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 5
    invoke-virtual {p1, v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_1

    .line 6
    :cond_2
    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 7
    invoke-virtual {p1, v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    :cond_3
    :goto_1
    return-object p1
.end method

.method private O0(Lcom/join/mgps/dto/HomeRankingListBean;)Lcom/join/mgps/dto/HomeRankingListBean;
    .locals 10

    if-eqz p1, :cond_8

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/HomeRankingListBean;->getList()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {p1}, Lcom/join/mgps/dto/HomeRankingListBean;->getList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_0

    goto/16 :goto_4

    .line 2
    :cond_0
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v0}, Lp1/f;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 3
    :goto_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/HomeRankingListBean;->getList()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_1

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/dto/HomeRankingListBean;->getList()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    if-eqz v4, :cond_7

    const/4 v5, 0x0

    .line 5
    :goto_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_7

    .line 6
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/join/mgps/dto/CommonGameInfoBean;

    if-nez v3, :cond_2

    const/16 v7, 0x5015

    .line 7
    invoke-virtual {v6, v7}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 8
    invoke-virtual {v6, v7}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    .line 9
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "22-15-"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v8, v5, 0x1

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/join/mgps/dto/CommonGameInfoBean;->setExp_position(Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    const/4 v7, 0x1

    if-ne v3, v7, :cond_3

    const/16 v7, 0x5016

    .line 10
    invoke-virtual {v6, v7}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 11
    invoke-virtual {v6, v7}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    .line 12
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "22-16-"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v8, v5, 0x1

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/join/mgps/dto/CommonGameInfoBean;->setExp_position(Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    const/4 v7, 0x2

    if-ne v3, v7, :cond_4

    const/16 v7, 0x5017

    .line 13
    invoke-virtual {v6, v7}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 14
    invoke-virtual {v6, v7}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    .line 15
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "22-17-"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v8, v5, 0x1

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/join/mgps/dto/CommonGameInfoBean;->setExp_position(Ljava/lang/String;)V

    :cond_4
    :goto_2
    if-eqz v6, :cond_6

    .line 16
    invoke-virtual {v6}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v7

    if-eqz v7, :cond_6

    .line 17
    invoke-virtual {v6}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v7

    .line 18
    invoke-virtual {v7}, Lcom/join/mgps/dto/GInfoBean;->getMod_id()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_5

    .line 19
    invoke-virtual {v6, v1}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_3

    .line 20
    :cond_5
    invoke-virtual {v7}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_6

    .line 21
    invoke-virtual {v6, v1}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    :cond_6
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_1

    :cond_7
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_8
    :goto_4
    return-object p1
.end method

.method public static synthetic V(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;)V
    .locals 0

    invoke-direct {p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->u0()V

    return-void
.end method

.method static synthetic X(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;)Lcom/join/mgps/adapter/PapaMainV4Adapter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->p:Lcom/join/mgps/adapter/PapaMainV4Adapter;

    return-object p0
.end method

.method static synthetic Z(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->m:I

    return p0
.end method

.method static synthetic a0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->z:Z

    return p1
.end method

.method static synthetic b0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->m:I

    return p1
.end method

.method static synthetic c0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->A:Z

    return p1
.end method

.method static synthetic d0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->r:I

    return p0
.end method

.method static synthetic e0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->r:I

    return p1
.end method

.method static synthetic f0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->s:I

    return p1
.end method

.method static synthetic g0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->m0()V

    return-void
.end method

.method static synthetic h0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->l:Z

    return p0
.end method

.method static synthetic i0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->n:Z

    return p0
.end method

.method static synthetic j0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->o:Ljava/util/List;

    return-object p0
.end method

.method static synthetic k0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;Lcom/join/mgps/dto/CommonGameInfoBean;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->E0(Lcom/join/mgps/dto/CommonGameInfoBean;)V

    return-void
.end method

.method static synthetic l0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;Lcom/join/mgps/dto/GameFromPopoWinBeanV2$DataBean;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->F0(Lcom/join/mgps/dto/GameFromPopoWinBeanV2$DataBean;I)V

    return-void
.end method

.method private m0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->v:Landroid/os/Handler;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->v:Landroid/os/Handler;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->v:Landroid/os/Handler;

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->w:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private o0(Lcom/join/mgps/dto/CommonGameInfoBean;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 1
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v1

    if-nez v1, :cond_1

    return-object v0

    .line 2
    :cond_1
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "0"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 4
    :cond_2
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/GInfoBean;->getMod_id()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private synthetic u0()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->f:Lcom/facebook/drawee/view/SimpleDraweeView;

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->z:Z

    if-nez v1, :cond_1

    iget-boolean v1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->A:Z

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->f:Lcom/facebook/drawee/view/SimpleDraweeView;

    const/4 v1, 0x2

    new-array v1, v1, [F

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0710fd

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    aput v3, v1, v2

    const/4 v2, 0x1

    const/4 v3, 0x0

    aput v3, v1, v2

    const-string v2, "translationX"

    invoke-static {v0, v2, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const-wide/16 v1, 0x96

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 3
    new-instance v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$f;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$f;-><init>(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;)V

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 4
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    :cond_1
    :goto_0
    return-void
.end method

.method private y0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->t:Ljava/util/List;

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
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->H0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method

.method private z0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->t:Ljava/util/List;

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
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->H0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method


# virtual methods
.method public B(Lcom/join/mgps/dto/CommonGameInfoBean;)V
    .locals 5

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v0

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v1

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getPlugin_num()Ljava/lang/String;

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

    .line 4
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    return-void

    :cond_1
    if-nez v1, :cond_7

    if-eqz v0, :cond_5

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getTag_info()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/UtilsMy;->o0(Ljava/util/List;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 6
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->isModGameVm()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 7
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 8
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/join/android/app/common/utils/APKUtils;->l(Landroid/content/Context;Ljava/lang/String;)Lcom/join/android/app/common/utils/APKUtils$a;

    move-result-object v1

    .line 9
    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getVer()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Lcom/join/android/app/common/utils/APKUtils$a;->d()I

    move-result v1

    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getVer()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    if-ge v1, v2, :cond_2

    goto :goto_0

    .line 10
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/join/android/app/common/utils/APKUtils;->a0(Landroid/content/Context;Ljava/lang/String;)Z

    return-void

    .line 11
    :cond_3
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    .line 12
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v2

    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/mgps/va/overmind/d;->F(Ljava/lang/String;)Z

    move-result v2

    if-nez v1, :cond_4

    if-eqz v2, :cond_5

    .line 13
    :cond_4
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getMod_id()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lcom/join/android/app/common/utils/APKUtils;->Y(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 14
    :cond_5
    :goto_0
    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v1

    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/join/mgps/Util/UtilsMy;->y0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v1

    if-lez v1, :cond_6

    .line 15
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->d4(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_1

    .line 16
    :cond_6
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/join/mgps/Util/UtilsMy;->F2(Landroid/content/Context;Lcom/join/mgps/dto/CommonGameInfoBean;)V

    :goto_1
    return-void

    :cond_7
    const/4 v2, 0x0

    if-eqz v1, :cond_8

    .line 17
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v2

    .line 18
    :cond_8
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadPointBase;->get_from()I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->set_from(I)V

    .line 19
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadPointBase;->get_from_type()I

    move-result p1

    invoke-virtual {v1, p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->set_from_type(I)V

    const/16 p1, 0x2b

    if-eqz v0, :cond_9

    .line 20
    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v3

    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v3

    if-lez v3, :cond_9

    const/16 v2, 0x2b

    :cond_9
    const/4 v3, 0x5

    if-eqz v2, :cond_10

    const/16 v4, 0xd

    if-eq v2, v4, :cond_f

    const/4 v4, 0x2

    if-eq v2, v4, :cond_e

    const/4 v4, 0x3

    if-eq v2, v4, :cond_d

    if-eq v2, v3, :cond_c

    const/4 v4, 0x6

    if-eq v2, v4, :cond_d

    const/4 v4, 0x7

    if-eq v2, v4, :cond_10

    const/16 v4, 0x2a

    if-eq v2, v4, :cond_b

    if-eq v2, p1, :cond_10

    packed-switch v2, :pswitch_data_0

    goto/16 :goto_2

    .line 21
    :pswitch_0
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-static {v1, p1}, Lcom/join/mgps/Util/UtilsMy;->a4(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto/16 :goto_2

    .line 22
    :pswitch_1
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_a

    .line 23
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    const-string v0, "\u65e0\u7f51\u7edc\u8fde\u63a5"

    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void

    .line 24
    :cond_a
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-static {p1, v1}, Lcom/join/mgps/Util/UtilsMy;->I2(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    .line 25
    :cond_b
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-static {p1, v1}, Lcom/join/mgps/Util/UtilsMy;->r4(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    .line 26
    :cond_c
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-static {p1, v1}, Lcom/join/mgps/Util/UtilsMy;->T3(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    .line 27
    :cond_d
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-static {v1, p1}, Lcom/php25/PDownload/d;->c(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto :goto_2

    .line 28
    :cond_e
    :pswitch_2
    invoke-static {v1}, Lcom/php25/PDownload/d;->i(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    .line 29
    :cond_f
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-static {p1, v1}, Lcom/php25/PDownload/d;->l(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    :cond_10
    if-eqz v0, :cond_14

    .line 30
    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object p1

    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lcom/join/mgps/Util/UtilsMy;->y0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result p1

    if-lez p1, :cond_11

    .line 31
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->d4(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_2

    .line 32
    :cond_11
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-static {p1, v1}, Lcom/join/mgps/Util/UtilsMy;->o1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result p1

    if-eqz p1, :cond_12

    goto :goto_2

    .line 33
    :cond_12
    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getDown_state()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ne p1, v3, :cond_13

    .line 34
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-static {p1, v1}, Lcom/join/mgps/Util/UtilsMy;->l1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    .line 35
    :cond_13
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTp_down_url()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getOther_down_switch()I

    move-result v2

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCdn_down_switch()I

    move-result v3

    invoke-static {p1, v1, v0, v2, v3}, Lcom/join/mgps/Util/UtilsMy;->R0(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/util/List;II)V

    :cond_14
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method C0(Lcom/join/mgps/dto/PapaHomeBeanV9;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->g:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->homeAllDataV3()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-static {p1}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    return-void
.end method

.method public D(Lcom/join/mgps/dto/CommonGameInfoBean;)V
    .locals 0

    return-void
.end method

.method G0(Lcom/join/mgps/dto/HomeFloatData;)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/HomeFloatData;->getPendant()Ljava/util/List;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->f:Lcom/facebook/drawee/view/SimpleDraweeView;

    if-eqz v0, :cond_3

    const/16 v0, 0x8

    if-eqz p1, :cond_2

    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_2

    const/4 v1, 0x0

    .line 4
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/RecomDatabean;

    iput-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->y:Lcom/join/mgps/dto/RecomDatabean;

    if-eqz p1, :cond_1

    .line 5
    invoke-virtual {p1}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/ModleBean;->getAd_switch()I

    move-result p1

    const/4 v2, 0x1

    if-ne p1, v2, :cond_1

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->f:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 7
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->y:Lcom/join/mgps/dto/RecomDatabean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/ModleBean;->getPic_remote()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 8
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->x:Ljava/lang/String;

    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->y:Lcom/join/mgps/dto/RecomDatabean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/ModleBean;->getPic_remote()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    .line 9
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->y:Lcom/join/mgps/dto/RecomDatabean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/ModleBean;->getPic_remote()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->x:Ljava/lang/String;

    .line 10
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->f:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f080f05

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->y:Lcom/join/mgps/dto/RecomDatabean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/ModleBean;->getPic_remote()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/join/android/app/common/utils/MyImageLoader;->d(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;)V

    goto :goto_0

    .line 11
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->f:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 12
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->f:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 13
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->f:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 14
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_3
    :goto_0
    return-void
.end method

.method I0(Lcom/join/mgps/dto/PapaHomeBeanV9;IZ)V
    .locals 16
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    move-object/from16 v1, p0

    move/from16 v0, p2

    if-eqz p1, :cond_17

    const/4 v2, 0x7

    const/4 v3, 0x2

    const/4 v4, 0x5

    const v5, 0x7f071220

    const v6, 0x7f0712bb

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/16 v9, 0xc

    const/4 v10, 0x1

    if-ne v0, v10, :cond_b

    .line 1
    :try_start_0
    iget-object v11, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->o:Ljava/util/List;

    invoke-interface {v11}, Ljava/util/List;->clear()V

    move/from16 v11, p3

    .line 2
    iput-boolean v11, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->n:Z

    .line 3
    invoke-direct/range {p0 .. p1}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->D0(Lcom/join/mgps/dto/PapaHomeBeanV9;)V

    .line 4
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getBanner()Ljava/util/List;

    move-result-object v11

    if-eqz v11, :cond_1

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getBanner()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v11

    if-lez v11, :cond_1

    const/4 v11, 0x0

    .line 5
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getBanner()Ljava/util/List;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v12

    if-ge v11, v12, :cond_0

    .line 6
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getBanner()Ljava/util/List;

    move-result-object v12

    invoke-interface {v12, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 7
    invoke-virtual {v12, v11}, Lcom/join/mgps/dto/CommonGameInfoBean;->setPosition(I)V

    const/16 v13, 0x4e21

    .line 8
    invoke-virtual {v12, v13}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 9
    invoke-virtual {v12, v13}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    .line 10
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "22-19-"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v11, v11, 0x1

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Lcom/join/mgps/dto/CommonGameInfoBean;->setExp_position(Ljava/lang/String;)V

    goto :goto_0

    .line 11
    :cond_0
    new-instance v11, Lcom/join/mgps/dto/CommonMultiItemBean;

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getBanner()Ljava/util/List;

    move-result-object v12

    invoke-direct {v11, v10, v12}, Lcom/join/mgps/dto/CommonMultiItemBean;-><init>(ILjava/lang/Object;)V

    .line 12
    iget-object v12, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->o:Ljava/util/List;

    invoke-interface {v12, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 13
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getFast_entry()Ljava/util/List;

    move-result-object v11

    if-eqz v11, :cond_2

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getFast_entry()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v11

    if-lez v11, :cond_2

    const/4 v11, 0x0

    .line 14
    :goto_1
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getFast_entry()Ljava/util/List;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v12

    if-ge v11, v12, :cond_2

    .line 15
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getFast_entry()Ljava/util/List;

    move-result-object v12

    invoke-interface {v12, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 16
    invoke-virtual {v12, v11}, Lcom/join/mgps/dto/CommonGameInfoBean;->setPosition(I)V

    .line 17
    new-instance v13, Lcom/join/mgps/dto/CommonMultiItemBean;

    invoke-direct {v13, v3, v12}, Lcom/join/mgps/dto/CommonMultiItemBean;-><init>(ILjava/lang/Object;)V

    .line 18
    iget-object v12, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->o:Ljava/util/List;

    invoke-interface {v12, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 19
    :cond_2
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getTop_channel()Lcom/join/mgps/dto/HomeTopChannelBean;

    move-result-object v11

    if-eqz v11, :cond_3

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getTop_channel()Lcom/join/mgps/dto/HomeTopChannelBean;

    move-result-object v11

    invoke-virtual {v11}, Lcom/join/mgps/dto/HomeTopChannelBean;->getDiscover()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v11

    if-eqz v11, :cond_3

    .line 20
    new-instance v11, Lcom/join/mgps/dto/CommonMultiItemBean;

    const/4 v12, 0x3

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getTop_channel()Lcom/join/mgps/dto/HomeTopChannelBean;

    move-result-object v13

    invoke-virtual {v13}, Lcom/join/mgps/dto/HomeTopChannelBean;->getDiscover()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v13

    invoke-direct {v11, v12, v13}, Lcom/join/mgps/dto/CommonMultiItemBean;-><init>(ILjava/lang/Object;)V

    .line 21
    iget-object v12, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->o:Ljava/util/List;

    invoke-interface {v12, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    :cond_3
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getEo_playing()Ljava/util/List;

    move-result-object v11

    if-eqz v11, :cond_4

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getEo_playing()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v11

    if-lez v11, :cond_4

    .line 23
    iget-object v11, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->o:Ljava/util/List;

    new-instance v12, Lcom/join/mgps/dto/CommonMultiItemBean;

    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v13

    const v14, 0x7f071279

    invoke-virtual {v13, v14}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v13

    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v13

    invoke-direct {v12, v9, v13}, Lcom/join/mgps/dto/CommonMultiItemBean;-><init>(ILjava/lang/Object;)V

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 24
    new-instance v11, Lcom/join/mgps/dto/CommonMultiItemBean;

    const-string v12, "\u5927\u5bb6\u90fd\u5728\u73a9"

    invoke-direct {v11, v7, v12}, Lcom/join/mgps/dto/CommonMultiItemBean;-><init>(ILjava/lang/Object;)V

    .line 25
    iget-object v12, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->o:Ljava/util/List;

    invoke-interface {v12, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v11, 0x0

    .line 26
    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getEo_playing()Ljava/util/List;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v12

    if-ge v11, v12, :cond_4

    .line 27
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getEo_playing()Ljava/util/List;

    move-result-object v12

    invoke-interface {v12, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 28
    invoke-direct {v1, v12}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->N0(Lcom/join/mgps/dto/CommonGameInfoBean;)Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v12

    const/16 v13, 0xc9

    .line 29
    invoke-virtual {v12, v13}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 30
    invoke-virtual {v12, v13}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    .line 31
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "22-4-"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v11, v11, 0x1

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Lcom/join/mgps/dto/CommonGameInfoBean;->setExp_position(Ljava/lang/String;)V

    .line 32
    new-instance v13, Lcom/join/mgps/dto/CommonMultiItemBean;

    invoke-direct {v13, v4, v12}, Lcom/join/mgps/dto/CommonMultiItemBean;-><init>(ILjava/lang/Object;)V

    .line 33
    iget-object v14, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->t:Ljava/util/List;

    invoke-interface {v14, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 34
    iget-object v12, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->o:Ljava/util/List;

    invoke-interface {v12, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 35
    :cond_4
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getTop_channel()Lcom/join/mgps/dto/HomeTopChannelBean;

    move-result-object v11

    if-eqz v11, :cond_5

    .line 36
    iget-object v11, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->o:Ljava/util/List;

    new-instance v12, Lcom/join/mgps/dto/CommonMultiItemBean;

    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v13

    invoke-virtual {v13, v6}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v13

    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v13

    invoke-direct {v12, v9, v13}, Lcom/join/mgps/dto/CommonMultiItemBean;-><init>(ILjava/lang/Object;)V

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 37
    new-instance v11, Lcom/join/mgps/dto/CommonMultiItemBean;

    const-string v12, "\u609f\u996d\u4e13\u680f"

    invoke-direct {v11, v7, v12}, Lcom/join/mgps/dto/CommonMultiItemBean;-><init>(ILjava/lang/Object;)V

    .line 38
    iget-object v12, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->o:Ljava/util/List;

    invoke-interface {v12, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 39
    iget-object v11, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->o:Ljava/util/List;

    new-instance v12, Lcom/join/mgps/dto/CommonMultiItemBean;

    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v13

    invoke-virtual {v13, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v13

    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v13

    invoke-direct {v12, v9, v13}, Lcom/join/mgps/dto/CommonMultiItemBean;-><init>(ILjava/lang/Object;)V

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    new-instance v11, Lcom/join/mgps/dto/CommonMultiItemBean;

    const/4 v12, 0x6

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getTop_channel()Lcom/join/mgps/dto/HomeTopChannelBean;

    move-result-object v13

    invoke-direct {v11, v12, v13}, Lcom/join/mgps/dto/CommonMultiItemBean;-><init>(ILjava/lang/Object;)V

    .line 41
    iget-object v12, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->o:Ljava/util/List;

    invoke-interface {v12, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 42
    :cond_5
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getNew_online_game()Lcom/join/mgps/dto/HomeDynamicListBean;

    move-result-object v11

    if-eqz v11, :cond_8

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getNew_online_game()Lcom/join/mgps/dto/HomeDynamicListBean;

    move-result-object v11

    invoke-virtual {v11}, Lcom/join/mgps/dto/HomeDynamicListBean;->getMiddle()Ljava/util/List;

    move-result-object v11

    if-eqz v11, :cond_8

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getNew_online_game()Lcom/join/mgps/dto/HomeDynamicListBean;

    move-result-object v11

    invoke-virtual {v11}, Lcom/join/mgps/dto/HomeDynamicListBean;->getMiddle()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v11

    if-lez v11, :cond_8

    .line 43
    iget-object v11, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->o:Ljava/util/List;

    new-instance v12, Lcom/join/mgps/dto/CommonMultiItemBean;

    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v13

    invoke-virtual {v13, v6}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v13

    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v13

    invoke-direct {v12, v9, v13}, Lcom/join/mgps/dto/CommonMultiItemBean;-><init>(ILjava/lang/Object;)V

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getNew_online_game()Lcom/join/mgps/dto/HomeDynamicListBean;

    move-result-object v11

    invoke-virtual {v11}, Lcom/join/mgps/dto/HomeDynamicListBean;->getTop()Ljava/util/List;

    move-result-object v11

    if-eqz v11, :cond_6

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getNew_online_game()Lcom/join/mgps/dto/HomeDynamicListBean;

    move-result-object v11

    invoke-virtual {v11}, Lcom/join/mgps/dto/HomeDynamicListBean;->getTop()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    if-eqz v11, :cond_6

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getNew_online_game()Lcom/join/mgps/dto/HomeDynamicListBean;

    move-result-object v11

    invoke-virtual {v11}, Lcom/join/mgps/dto/HomeDynamicListBean;->getTop()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {v11}, Lcom/join/mgps/dto/CommonGameInfoBean;->getMain_title()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_6

    .line 45
    new-instance v11, Lcom/join/mgps/dto/CommonMultiItemBean;

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getNew_online_game()Lcom/join/mgps/dto/HomeDynamicListBean;

    move-result-object v12

    invoke-virtual {v12}, Lcom/join/mgps/dto/HomeDynamicListBean;->getTop()Ljava/util/List;

    move-result-object v12

    invoke-interface {v12, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {v12}, Lcom/join/mgps/dto/CommonGameInfoBean;->getMain_title()Ljava/lang/String;

    move-result-object v12

    invoke-direct {v11, v7, v12}, Lcom/join/mgps/dto/CommonMultiItemBean;-><init>(ILjava/lang/Object;)V

    .line 46
    iget-object v12, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->o:Ljava/util/List;

    invoke-interface {v12, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 47
    :cond_6
    new-instance v11, Lcom/join/mgps/dto/CommonMultiItemBean;

    const-string v12, "\u70ed\u95e8\u6e38\u620f\u63a8\u8350"

    invoke-direct {v11, v7, v12}, Lcom/join/mgps/dto/CommonMultiItemBean;-><init>(ILjava/lang/Object;)V

    .line 48
    iget-object v12, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->o:Ljava/util/List;

    invoke-interface {v12, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    :goto_3
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getNew_online_game()Lcom/join/mgps/dto/HomeDynamicListBean;

    move-result-object v11

    invoke-virtual {v11}, Lcom/join/mgps/dto/HomeDynamicListBean;->getMiddle()Ljava/util/List;

    move-result-object v11

    if-eqz v11, :cond_8

    .line 50
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getNew_online_game()Lcom/join/mgps/dto/HomeDynamicListBean;

    move-result-object v11

    invoke-virtual {v11}, Lcom/join/mgps/dto/HomeDynamicListBean;->getMiddle()Ljava/util/List;

    move-result-object v11

    const/4 v12, 0x0

    .line 51
    :goto_4
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v13

    if-ge v12, v13, :cond_8

    .line 52
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-direct {v1, v13}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->N0(Lcom/join/mgps/dto/CommonGameInfoBean;)Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v13

    const/16 v14, 0x4e22

    .line 53
    invoke-virtual {v13, v14}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 54
    invoke-virtual {v13, v14}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    .line 55
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "22-20-"

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v15, v12, 0x1

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Lcom/join/mgps/dto/CommonGameInfoBean;->setExp_position(Ljava/lang/String;)V

    if-nez v12, :cond_7

    .line 56
    iget-object v12, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->o:Ljava/util/List;

    new-instance v14, Lcom/join/mgps/dto/CommonMultiItemBean;

    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-direct {v14, v9, v3}, Lcom/join/mgps/dto/CommonMultiItemBean;-><init>(ILjava/lang/Object;)V

    invoke-interface {v12, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 57
    new-instance v3, Lcom/join/mgps/dto/CommonMultiItemBean;

    invoke-direct {v3, v2, v13}, Lcom/join/mgps/dto/CommonMultiItemBean;-><init>(ILjava/lang/Object;)V

    .line 58
    iget-object v12, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->o:Ljava/util/List;

    invoke-interface {v12, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    iget-object v3, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->t:Ljava/util/List;

    invoke-interface {v3, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 60
    :cond_7
    new-instance v3, Lcom/join/mgps/dto/CommonMultiItemBean;

    invoke-direct {v3, v4, v13}, Lcom/join/mgps/dto/CommonMultiItemBean;-><init>(ILjava/lang/Object;)V

    .line 61
    iget-object v12, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->o:Ljava/util/List;

    invoke-interface {v12, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 62
    iget-object v3, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->t:Ljava/util/List;

    invoke-interface {v3, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_5
    move v12, v15

    const/4 v3, 0x2

    goto :goto_4

    .line 63
    :cond_8
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getRanking_list()Lcom/join/mgps/dto/HomeRankingListBean;

    move-result-object v3

    if-eqz v3, :cond_a

    .line 64
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getRanking_list()Lcom/join/mgps/dto/HomeRankingListBean;

    move-result-object v3

    invoke-direct {v1, v3}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->O0(Lcom/join/mgps/dto/HomeRankingListBean;)Lcom/join/mgps/dto/HomeRankingListBean;

    move-result-object v3

    .line 65
    iget-object v11, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->o:Ljava/util/List;

    new-instance v12, Lcom/join/mgps/dto/CommonMultiItemBean;

    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v13

    invoke-virtual {v13, v6}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v13

    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v13

    invoke-direct {v12, v9, v13}, Lcom/join/mgps/dto/CommonMultiItemBean;-><init>(ILjava/lang/Object;)V

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    new-instance v11, Lcom/join/mgps/dto/CommonMultiItemBean;

    const/16 v12, 0x9

    invoke-direct {v11, v12, v3}, Lcom/join/mgps/dto/CommonMultiItemBean;-><init>(ILjava/lang/Object;)V

    .line 67
    iget-object v12, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->o:Ljava/util/List;

    invoke-interface {v12, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 68
    invoke-virtual {v3}, Lcom/join/mgps/dto/HomeRankingListBean;->getList()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_a

    .line 69
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getRanking_list()Lcom/join/mgps/dto/HomeRankingListBean;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/HomeRankingListBean;->getList()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_9
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/List;

    if-eqz v11, :cond_9

    .line 70
    iget-object v12, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->t:Ljava/util/List;

    invoke-interface {v12, v11}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_6

    .line 71
    :cond_a
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getHot_game_fav()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_b

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getHot_game_fav()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_b

    .line 72
    iget-object v3, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->o:Ljava/util/List;

    new-instance v11, Lcom/join/mgps/dto/CommonMultiItemBean;

    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v12

    invoke-virtual {v12, v6}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v12

    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    invoke-direct {v11, v9, v12}, Lcom/join/mgps/dto/CommonMultiItemBean;-><init>(ILjava/lang/Object;)V

    invoke-interface {v3, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 73
    new-instance v3, Lcom/join/mgps/dto/CommonMultiItemBean;

    const-string v11, "\u70ed\u95e8\u6e38\u620f\u5355"

    invoke-direct {v3, v7, v11}, Lcom/join/mgps/dto/CommonMultiItemBean;-><init>(ILjava/lang/Object;)V

    .line 74
    iget-object v11, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->o:Ljava/util/List;

    invoke-interface {v11, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 75
    iget-object v3, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->o:Ljava/util/List;

    new-instance v11, Lcom/join/mgps/dto/CommonMultiItemBean;

    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v12

    invoke-virtual {v12, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v12

    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    invoke-direct {v11, v9, v12}, Lcom/join/mgps/dto/CommonMultiItemBean;-><init>(ILjava/lang/Object;)V

    invoke-interface {v3, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    new-instance v3, Lcom/join/mgps/dto/CommonMultiItemBean;

    const/16 v11, 0xa

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getHot_game_fav()Ljava/util/List;

    move-result-object v12

    invoke-direct {v3, v11, v12}, Lcom/join/mgps/dto/CommonMultiItemBean;-><init>(ILjava/lang/Object;)V

    .line 77
    iget-object v11, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->o:Ljava/util/List;

    invoke-interface {v11, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 78
    :cond_b
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getDynamic_module()Ljava/util/List;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v11, "22-18-"

    const/16 v12, 0xce

    if-eqz v3, :cond_15

    :try_start_1
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getDynamic_module()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_15

    .line 79
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getDynamic_module()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_15

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/join/mgps/dto/HomeDynamicListBean;

    .line 80
    invoke-virtual {v13}, Lcom/join/mgps/dto/HomeDynamicListBean;->getTop()Ljava/util/List;

    move-result-object v14

    if-eqz v14, :cond_c

    invoke-virtual {v13}, Lcom/join/mgps/dto/HomeDynamicListBean;->getTop()Ljava/util/List;

    move-result-object v14

    invoke-interface {v14, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    if-eqz v14, :cond_c

    invoke-virtual {v13}, Lcom/join/mgps/dto/HomeDynamicListBean;->getTop()Ljava/util/List;

    move-result-object v14

    invoke-interface {v14, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {v14}, Lcom/join/mgps/dto/CommonGameInfoBean;->getMain_title()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v14

    if-nez v14, :cond_c

    .line 81
    iget-object v14, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->o:Ljava/util/List;

    new-instance v15, Lcom/join/mgps/dto/CommonMultiItemBean;

    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-direct {v15, v9, v4}, Lcom/join/mgps/dto/CommonMultiItemBean;-><init>(ILjava/lang/Object;)V

    invoke-interface {v14, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    new-instance v4, Lcom/join/mgps/dto/CommonMultiItemBean;

    invoke-virtual {v13}, Lcom/join/mgps/dto/HomeDynamicListBean;->getTop()Ljava/util/List;

    move-result-object v14

    invoke-interface {v14, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {v14}, Lcom/join/mgps/dto/CommonGameInfoBean;->getMain_title()Ljava/lang/String;

    move-result-object v14

    invoke-direct {v4, v7, v14}, Lcom/join/mgps/dto/CommonMultiItemBean;-><init>(ILjava/lang/Object;)V

    .line 83
    iget-object v14, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->o:Ljava/util/List;

    invoke-interface {v14, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 84
    :cond_c
    invoke-virtual {v13}, Lcom/join/mgps/dto/HomeDynamicListBean;->getMiddle()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_e

    invoke-virtual {v13}, Lcom/join/mgps/dto/HomeDynamicListBean;->getMiddle()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-lez v4, :cond_e

    .line 85
    invoke-virtual {v13}, Lcom/join/mgps/dto/HomeDynamicListBean;->getMiddle()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_e

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 86
    invoke-virtual {v14}, Lcom/join/mgps/dto/CommonGameInfoBean;->getMain_title()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v15

    if-eqz v15, :cond_d

    .line 87
    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->o:Ljava/util/List;

    new-instance v15, Lcom/join/mgps/dto/CommonMultiItemBean;

    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8, v6}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v8

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-direct {v15, v9, v8}, Lcom/join/mgps/dto/CommonMultiItemBean;-><init>(ILjava/lang/Object;)V

    invoke-interface {v4, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 88
    new-instance v4, Lcom/join/mgps/dto/CommonMultiItemBean;

    invoke-virtual {v14}, Lcom/join/mgps/dto/CommonGameInfoBean;->getMain_title()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v4, v7, v8}, Lcom/join/mgps/dto/CommonMultiItemBean;-><init>(ILjava/lang/Object;)V

    .line 89
    iget-object v8, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->o:Ljava/util/List;

    invoke-interface {v8, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 90
    :cond_e
    :goto_8
    invoke-virtual {v13}, Lcom/join/mgps/dto/HomeDynamicListBean;->getMiddle()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_13

    .line 91
    invoke-virtual {v13}, Lcom/join/mgps/dto/HomeDynamicListBean;->getMiddle()Ljava/util/List;

    move-result-object v4

    .line 92
    invoke-virtual {v13}, Lcom/join/mgps/dto/HomeDynamicListBean;->getDynamic_module_tpl_type()I

    move-result v8

    if-eq v8, v10, :cond_11

    const/4 v13, 0x2

    if-eq v8, v13, :cond_f

    goto/16 :goto_c

    .line 93
    :cond_f
    iget-object v8, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->o:Ljava/util/List;

    new-instance v14, Lcom/join/mgps/dto/CommonMultiItemBean;

    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v15

    invoke-virtual {v15, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v15

    invoke-static {v15}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v15

    invoke-direct {v14, v9, v15}, Lcom/join/mgps/dto/CommonMultiItemBean;-><init>(ILjava/lang/Object;)V

    invoke-interface {v8, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 94
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_9
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_10

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 95
    invoke-direct {v1, v14}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->N0(Lcom/join/mgps/dto/CommonGameInfoBean;)Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v14

    .line 96
    invoke-virtual {v14, v12}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 97
    invoke-virtual {v14, v12}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    .line 98
    iget v15, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->u:I

    add-int/2addr v15, v10

    iput v15, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->u:I

    .line 99
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->u:I

    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v14, v6}, Lcom/join/mgps/dto/CommonGameInfoBean;->setExp_position(Ljava/lang/String;)V

    const v6, 0x7f0712bb

    goto :goto_9

    .line 100
    :cond_10
    new-instance v6, Lcom/join/mgps/dto/CommonMultiItemBean;

    const/16 v8, 0x8

    invoke-direct {v6, v8, v4}, Lcom/join/mgps/dto/CommonMultiItemBean;-><init>(ILjava/lang/Object;)V

    .line 101
    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->o:Ljava/util/List;

    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :cond_11
    const/4 v13, 0x2

    const/4 v6, 0x0

    .line 102
    :goto_a
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v8

    if-ge v6, v8, :cond_14

    .line 103
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-direct {v1, v8}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->N0(Lcom/join/mgps/dto/CommonGameInfoBean;)Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v8

    .line 104
    invoke-virtual {v8, v12}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 105
    invoke-virtual {v8, v12}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    .line 106
    iget v14, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->u:I

    add-int/2addr v14, v10

    iput v14, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->u:I

    .line 107
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v15, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->u:I

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v8, v14}, Lcom/join/mgps/dto/CommonGameInfoBean;->setExp_position(Ljava/lang/String;)V

    if-nez v6, :cond_12

    .line 108
    iget-object v14, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->o:Ljava/util/List;

    new-instance v15, Lcom/join/mgps/dto/CommonMultiItemBean;

    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v7

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    invoke-direct {v15, v9, v7}, Lcom/join/mgps/dto/CommonMultiItemBean;-><init>(ILjava/lang/Object;)V

    invoke-interface {v14, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 109
    new-instance v7, Lcom/join/mgps/dto/CommonMultiItemBean;

    invoke-direct {v7, v2, v8}, Lcom/join/mgps/dto/CommonMultiItemBean;-><init>(ILjava/lang/Object;)V

    .line 110
    iget-object v14, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->o:Ljava/util/List;

    invoke-interface {v14, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 111
    iget-object v7, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->t:Ljava/util/List;

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v14, 0x5

    goto :goto_b

    .line 112
    :cond_12
    new-instance v7, Lcom/join/mgps/dto/CommonMultiItemBean;

    const/4 v14, 0x5

    invoke-direct {v7, v14, v8}, Lcom/join/mgps/dto/CommonMultiItemBean;-><init>(ILjava/lang/Object;)V

    .line 113
    iget-object v15, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->o:Ljava/util/List;

    invoke-interface {v15, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 114
    iget-object v7, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->t:Ljava/util/List;

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_b
    add-int/lit8 v6, v6, 0x1

    const/4 v7, 0x4

    goto :goto_a

    :cond_13
    const/4 v13, 0x2

    :cond_14
    :goto_c
    const/4 v14, 0x5

    const/4 v4, 0x5

    const v6, 0x7f0712bb

    const/4 v7, 0x4

    const/4 v8, 0x0

    goto/16 :goto_7

    .line 115
    :cond_15
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getGuess_you_like()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_16

    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getGuess_you_like()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_16

    .line 116
    invoke-virtual/range {p1 .. p1}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getGuess_you_like()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_16

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 117
    invoke-direct {v1, v3}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->N0(Lcom/join/mgps/dto/CommonGameInfoBean;)Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v3

    .line 118
    invoke-virtual {v3, v12}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 119
    invoke-virtual {v3, v12}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    .line 120
    iget v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->u:I

    add-int/2addr v4, v10

    iput v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->u:I

    .line 121
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v5, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->u:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/join/mgps/dto/CommonGameInfoBean;->setExp_position(Ljava/lang/String;)V

    .line 122
    new-instance v4, Lcom/join/mgps/dto/CommonMultiItemBean;

    const/16 v5, 0xb

    invoke-direct {v4, v5, v3}, Lcom/join/mgps/dto/CommonMultiItemBean;-><init>(ILjava/lang/Object;)V

    .line 123
    iget-object v5, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->o:Ljava/util/List;

    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 124
    iget-object v4, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->t:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_d

    .line 125
    :cond_16
    iget-object v2, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->p:Lcom/join/mgps/adapter/PapaMainV4Adapter;

    iget-object v3, v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->o:Ljava/util/List;

    invoke-virtual {v2, v3}, Lcom/join/mgps/base/BaseQuickAdapter;->setNewData(Ljava/util/List;)V

    if-ne v0, v10, :cond_17

    .line 126
    invoke-direct/range {p0 .. p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->m0()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_e

    :catch_0
    move-exception v0

    .line 127
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_17
    :goto_e
    return-void
.end method

.method J0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->b:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->stopRefresh()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->b:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-virtual {v0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->stopLoadMore()V

    :cond_0
    return-void
.end method

.method M0(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V
    .locals 0

    if-eqz p1, :cond_0

    packed-switch p2, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    .line 1
    :pswitch_1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->z0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 2
    :pswitch_2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->B0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 3
    :pswitch_3
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->y0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 4
    :pswitch_4
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->A0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

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

.method W()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.account_status_uidchange"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->k:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->m:I

    .line 3
    iput-boolean v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->l:Z

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->b:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-virtual {v0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->reset()V

    .line 5
    iget v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->m:I

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->w0(I)V

    :cond_0
    return-void
.end method

.method afterViews()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/d0;->d(Ljava/lang/Object;)V

    .line 3
    new-instance v0, Lcom/join/mgps/adapter/PapaMainV4Adapter;

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-direct {v0, v1, p0}, Lcom/join/mgps/adapter/PapaMainV4Adapter;-><init>(Landroid/content/Context;Lcom/join/mgps/adapter/PapaMainV4Adapter$e;)V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->p:Lcom/join/mgps/adapter/PapaMainV4Adapter;

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->b:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-virtual {v1, v0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 5
    new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager;

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 6
    new-instance v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$a;-><init>(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/GridLayoutManager;->setSpanSizeLookup(Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;)V

    .line 7
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->b:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->b:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->c:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    invoke-virtual {v0, v1}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->setPtrFrameLayout(Lcom/join/mgps/ptr/PtrFrameLayout;)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->b:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    new-instance v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$b;-><init>(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;)V

    invoke-virtual {v0, v1}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->setLoadingListener(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$LoadingListener;)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->b:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-virtual {v0, v2}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->setPreLoadCount(I)V

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->b:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    new-instance v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$c;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$c;-><init>(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

    .line 12
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->t:Ljava/util/List;

    .line 13
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->v0()V

    .line 14
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->n0()V

    return-void
.end method

.method n0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->p0()Lcom/join/mgps/dto/CommonRequestBean;

    move-result-object v0

    .line 3
    invoke-static {}, Lcom/join/mgps/rpc/impl/d;->P1()Lcom/join/mgps/rpc/impl/d;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/join/mgps/rpc/impl/d;->K0(Lcom/join/mgps/dto/CommonRequestBean;)Lcom/join/mgps/dto/RecomDataAllBean;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/dto/RecomDataAllBean;->getMessages()Lcom/join/mgps/dto/RecomDataMessageBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/RecomDataMessageBean;->getData()Lcom/join/mgps/dto/HomeFloatData;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->G0(Lcom/join/mgps/dto/HomeFloatData;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 6
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 7
    :goto_0
    throw v0

    :cond_0
    :goto_1
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/d0;->e(Ljava/lang/Object;)V

    return-void
.end method

.method public onEventMainThread(Lcom/join/mgps/event/n;)V
    .locals 5
    .annotation runtime Lorg/greenrobot/eventbus/Subscribe;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/event/n;->a()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/event/n;->c()I

    move-result p1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_5

    const/4 v2, 0x3

    if-eq p1, v2, :cond_4

    const/4 v1, 0x5

    if-eq p1, v1, :cond_3

    const/4 v3, 0x6

    if-eq p1, v3, :cond_2

    const/4 v3, 0x7

    if-eq p1, v3, :cond_1

    const/16 v2, 0x8

    if-eq p1, v2, :cond_0

    const/16 v4, 0x30

    if-eq p1, v4, :cond_3

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/16 p1, 0x9

    .line 3
    invoke-virtual {p0, v0, p1}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->M0(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 4
    :pswitch_1
    invoke-virtual {p0, v0, v2}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->M0(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 5
    :pswitch_2
    invoke-virtual {p0, v0, v3}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->M0(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-direct {p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->L0()V

    goto :goto_0

    .line 7
    :cond_1
    invoke-virtual {p0, v0, v2}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->M0(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 8
    :cond_2
    invoke-virtual {p0, v0, v3}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->M0(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 9
    :cond_3
    :pswitch_3
    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->M0(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 10
    :cond_4
    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->M0(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    :cond_5
    const/4 p1, 0x1

    .line 11
    invoke-virtual {p0, v0, p1}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->M0(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public p(Ljava/util/List;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            ">;I)V"
        }
    .end annotation

    return-void
.end method

.method public p0()Lcom/join/mgps/dto/CommonRequestBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/RequestBeanUtil;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/RequestBeanUtil;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/RequestBeanUtil;->getFloatadRequestBean()Lcom/join/mgps/dto/CommonRequestBean;

    move-result-object v0

    return-object v0
.end method

.method q0()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->q:Ljava/lang/String;

    return-object v0
.end method

.method r0()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->v:Landroid/os/Handler;

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->v:Landroid/os/Handler;

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->v:Landroid/os/Handler;

    new-instance v1, Lcom/join/mgps/activity/q2;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/q2;-><init>(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method relodingimag()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->showLoding()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->m:I

    .line 3
    iput-boolean v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->l:Z

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->b:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-virtual {v0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->reset()V

    .line 5
    iget v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->m:I

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->w0(I)V

    return-void
.end method

.method public s(Lcom/join/mgps/dto/CommonGameInfoBean;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->isHasExposure()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->E0(Lcom/join/mgps/dto/CommonGameInfoBean;)V

    const/4 v0, 0x1

    .line 3
    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/CommonGameInfoBean;->setHasExposure(Z)V

    :cond_0
    return-void
.end method

.method s0()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->f:Lcom/facebook/drawee/view/SimpleDraweeView;

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->z:Z

    if-nez v1, :cond_1

    iget-boolean v1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->A:Z

    if-nez v1, :cond_1

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->f:Lcom/facebook/drawee/view/SimpleDraweeView;

    const/4 v1, 0x2

    new-array v1, v1, [F

    const/4 v2, 0x0

    const/4 v3, 0x0

    aput v3, v1, v2

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0710fd

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    aput v3, v1, v2

    const-string v2, "translationX"

    invoke-static {v0, v2, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const-wide/16 v1, 0xfa

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 3
    new-instance v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$e;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$e;-><init>(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;)V

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 4
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    :cond_1
    :goto_0
    return-void
.end method

.method setNetwork()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->w3(Landroid/content/Context;)V

    return-void
.end method

.method showLoding()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const-string v0, "\u663e\u793a\u52a0\u8f7d\u4e2d"

    .line 1
    invoke-static {v0}, Lcom/join/mgps/Util/v0;->c(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->d:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->e:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->b:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    if-eqz v0, :cond_2

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_2
    return-void
.end method

.method showLodingFailed()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->e:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->d:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->b:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    if-eqz v0, :cond_2

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_2
    return-void
.end method

.method showMain()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const-string v0, "\u663e\u793a\u4e3b\u754c\u9762main"

    .line 1
    invoke-static {v0}, Lcom/join/mgps/Util/v0;->c(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->e:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->d:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->b:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_2
    return-void
.end method

.method t0()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->y:Lcom/join/mgps/dto/RecomDatabean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/ModleBean;->getPic_remote()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->y:Lcom/join/mgps/dto/RecomDatabean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/AppBeanMain;

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/AppBeanMain;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object v0

    .line 4
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v1, v2, v0}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method v0()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->g:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->homeAllDataV4()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 2
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v1

    const-class v2, Lcom/join/mgps/dto/PapaHomeBeanV9;

    invoke-virtual {v1, v0, v2}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/PapaHomeBeanV9;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x1

    if-eqz v0, :cond_1

    const/4 v2, 0x0

    .line 4
    invoke-virtual {p0, v0, v1, v2}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->I0(Lcom/join/mgps/dto/PapaHomeBeanV9;IZ)V

    .line 5
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->showMain()V

    .line 6
    iput-boolean v2, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->h:Z

    goto :goto_1

    .line 7
    :cond_1
    iput-boolean v1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->h:Z

    .line 8
    :goto_1
    iget v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->m:I

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->w0(I)V

    return-void
.end method

.method w0(I)V
    .locals 8
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_f

    .line 3
    iget-boolean v1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->j:Z

    const-string v2, "0"

    const/4 v3, 0x1

    if-nez v1, :cond_c

    iget-boolean v1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->k:Z

    if-nez v1, :cond_c

    if-eqz v0, :cond_c

    invoke-static {v0, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_c

    .line 4
    iput-boolean v3, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->k:Z

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 5
    :try_start_0
    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-static {v2}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v2

    .line 6
    new-instance v4, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v4}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 7
    iget-object v5, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i:Landroid/content/Context;

    invoke-virtual {v4, v5}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 8
    new-instance v5, Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;

    invoke-direct {v5}, Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;-><init>()V

    .line 9
    invoke-virtual {v5, p1}, Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;->setPage(I)V

    .line 10
    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    invoke-virtual {v5, v2}, Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;->setUid(I)V

    .line 11
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const-string v6, "HOME_FAST_ENTRY_FOR_PC"

    .line 12
    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 13
    invoke-virtual {v5, v2}, Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;->setPositionMark(Ljava/util/List;)V

    .line 14
    invoke-virtual {v4, v5}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 15
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/rpc/impl/i;->B0()Le2/i;

    move-result-object v2

    invoke-virtual {v4}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object v4

    invoke-interface {v2, v4}, Le2/i;->w1(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;

    move-result-object v2

    invoke-interface {v2}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    move-result-object v2

    invoke-virtual {v2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/ResponseModel;

    if-eqz v2, :cond_2

    .line 16
    invoke-virtual {v2}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v4

    const/16 v5, 0xc8

    if-ne v4, v5, :cond_2

    invoke-virtual {v2}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 17
    invoke-virtual {v2}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/PapaHomeBeanV9;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    :try_start_1
    invoke-virtual {v2}, Lcom/join/mgps/dto/PapaHomeBeanV9;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 19
    iput-boolean v1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->l:Z

    .line 20
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->x0()V

    goto :goto_0

    .line 21
    :cond_0
    iput-boolean v3, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->l:Z

    add-int/lit8 v0, p1, 0x1

    .line 22
    iput v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->m:I

    :goto_0
    if-ne p1, v3, :cond_1

    .line 23
    invoke-virtual {p0, v2}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->C0(Lcom/join/mgps/dto/PapaHomeBeanV9;)V

    .line 24
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->showMain()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v0, v2

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_3

    .line 25
    :cond_2
    :try_start_2
    iput-boolean v1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->l:Z

    .line 26
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->x0()V

    .line 27
    iget-boolean v2, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->h:Z

    if-eqz v2, :cond_3

    if-ne p1, v3, :cond_3

    .line 28
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->showLodingFailed()V

    goto :goto_1

    .line 29
    :cond_3
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->showMain()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 30
    :goto_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->J0()V

    .line 31
    iput-boolean v1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->k:Z

    if-eqz v0, :cond_10

    .line 32
    invoke-virtual {p0, v0, p1, v3}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->I0(Lcom/join/mgps/dto/PapaHomeBeanV9;IZ)V

    .line 33
    invoke-virtual {v0}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getGame_section_id()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_4

    .line 34
    invoke-virtual {v0}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getGame_section_id()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->q:Ljava/lang/String;

    .line 35
    :cond_4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->getFragments()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 36
    instance-of v2, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment_;

    if-eqz v2, :cond_5

    .line 37
    check-cast v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment_;

    invoke-virtual {v0}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getGame_section_id()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->n0(Ljava/lang/String;)V

    goto :goto_2

    :catchall_0
    move-exception v2

    move-object v7, v2

    move-object v2, v0

    move-object v0, v7

    goto :goto_5

    :catch_1
    move-exception v2

    move-object v7, v2

    move-object v2, v0

    move-object v0, v7

    .line 38
    :goto_3
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 39
    iput-boolean v1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->l:Z

    .line 40
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->x0()V

    .line 41
    iget-boolean v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->h:Z

    if-eqz v0, :cond_6

    if-ne p1, v3, :cond_6

    .line 42
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->showLodingFailed()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 43
    :cond_6
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->J0()V

    .line 44
    iput-boolean v1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->k:Z

    if-eqz v2, :cond_10

    .line 45
    invoke-virtual {p0, v2, p1, v3}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->I0(Lcom/join/mgps/dto/PapaHomeBeanV9;IZ)V

    .line 46
    invoke-virtual {v2}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getGame_section_id()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_7

    .line 47
    invoke-virtual {v2}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getGame_section_id()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->q:Ljava/lang/String;

    .line 48
    :cond_7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->getFragments()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_8
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 49
    instance-of v1, v0, Lcom/join/mgps/activity/CollectionModuleSevenFragment_;

    if-eqz v1, :cond_8

    .line 50
    check-cast v0, Lcom/join/mgps/activity/CollectionModuleSevenFragment_;

    invoke-virtual {v2}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getGame_section_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->n0(Ljava/lang/String;)V

    goto :goto_4

    :catchall_1
    move-exception v0

    .line 51
    :goto_5
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->J0()V

    .line 52
    iput-boolean v1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->k:Z

    if-eqz v2, :cond_b

    .line 53
    invoke-virtual {p0, v2, p1, v3}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->I0(Lcom/join/mgps/dto/PapaHomeBeanV9;IZ)V

    .line 54
    invoke-virtual {v2}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getGame_section_id()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_9

    .line 55
    invoke-virtual {v2}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getGame_section_id()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->q:Ljava/lang/String;

    .line 56
    :cond_9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->getFragments()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_a
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 57
    instance-of v3, v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment_;

    if-eqz v3, :cond_a

    .line 58
    check-cast v1, Lcom/join/mgps/activity/CollectionModuleSevenFragment_;

    invoke-virtual {v2}, Lcom/join/mgps/dto/PapaHomeBeanV9;->getGame_section_id()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/join/mgps/activity/CollectionModuleSevenFragment;->n0(Ljava/lang/String;)V

    goto :goto_6

    .line 59
    :cond_b
    throw v0

    .line 60
    :cond_c
    invoke-static {v0, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 61
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->showLoding()V

    goto :goto_7

    .line 62
    :cond_d
    iget-boolean v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->h:Z

    if-eqz v0, :cond_e

    if-ne p1, v3, :cond_e

    iget-boolean p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->k:Z

    if-nez p1, :cond_e

    iget-boolean p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->j:Z

    if-nez p1, :cond_e

    .line 63
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->showLodingFailed()V

    .line 64
    :cond_e
    :goto_7
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->J0()V

    goto :goto_8

    .line 65
    :cond_f
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->showLodingFailed()V

    .line 66
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->J0()V

    :cond_10
    :goto_8
    return-void
.end method

.method x0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->b:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->setNoMore()V

    .line 2
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->r0()V

    return-void
.end method

.method public y(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/dto/CommonGameInfoBean;->isHasExposure()Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    invoke-direct {p0, v0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->E0(Lcom/join/mgps/dto/CommonGameInfoBean;)V

    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/CommonGameInfoBean;->setHasExposure(Z)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public z(Ljava/util/List;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/GameFromPopoWinBeanV2$DataBean;",
            ">;I)V"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    if-gt v0, p2, :cond_1

    .line 1
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/GameFromPopoWinBeanV2$DataBean;

    .line 2
    invoke-virtual {v1}, Lcom/join/mgps/dto/GameFromPopoWinBeanV2$DataBean;->isHasExposure()Z

    move-result v2

    if-nez v2, :cond_0

    .line 3
    invoke-direct {p0, v1, v0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->F0(Lcom/join/mgps/dto/GameFromPopoWinBeanV2$DataBean;I)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
