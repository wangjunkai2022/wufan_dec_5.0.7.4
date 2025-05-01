.class public Lcom/join/mgps/fragment/FindMiniGameFragment;
.super Landroidx/fragment/app/Fragment;
.source "FindMiniGameFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/FindMiniGameFragment$MiniGameListAdapter;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EFragment;
    value = 0x7f0c0268
.end annotation


# instance fields
.field b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field c:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field d:Lcom/join/mgps/fragment/FindMiniGameFragment$MiniGameListAdapter;

.field e:Landroid/content/Context;

.field f:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field g:Lcom/join/mgps/ptr/PtrClassicFrameLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field h:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field i:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/FragmentArg;
    .end annotation
.end field

.field j:Lcom/join/mgps/rpc/k;

.field k:I

.field l:Lcom/join/android/app/component/video/g;

.field private m:Z

.field private n:Z

.field o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/github/snowdream/android/app/downloader/DownloadTask;",
            ">;"
        }
    .end annotation
.end field

.field p:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/github/snowdream/android/app/downloader/DownloadTask;",
            ">;"
        }
    .end annotation
.end field

.field q:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->k:I

    .line 3
    iput-boolean v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->m:Z

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->n:Z

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->o:Ljava/util/List;

    .line 6
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->p:Ljava/util/Map;

    .line 7
    iput-boolean v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->q:Z

    return-void
.end method

.method static synthetic X(Lcom/join/mgps/fragment/FindMiniGameFragment;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->m:Z

    return p1
.end method

.method static synthetic Z(Lcom/join/mgps/fragment/FindMiniGameFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/fragment/FindMiniGameFragment;->j0()V

    return-void
.end method

.method private e0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 2
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 3
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 4
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 5
    iget-object v2, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->p:Ljava/util/Map;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 7
    iget-object v1, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->d:Lcom/join/mgps/fragment/FindMiniGameFragment$MiniGameListAdapter;

    invoke-virtual {v1}, Lcom/join/mgps/base/BaseQuickAdapter;->getData()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 8
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->isGame()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 9
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 10
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->isModGameVm()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_5

    .line 11
    iget-object v4, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->p:Ljava/util/Map;

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getMod_id()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 12
    iget-object v6, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->p:Ljava/util/Map;

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-nez v4, :cond_2

    if-nez v6, :cond_2

    .line 13
    invoke-virtual {v2, v5}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    :cond_2
    if-eqz v4, :cond_3

    .line 14
    invoke-virtual {v2, v4}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    :cond_3
    if-eqz v6, :cond_4

    .line 15
    invoke-virtual {v2, v6}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 16
    :cond_4
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 17
    invoke-virtual {v2, v5}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 18
    :cond_5
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 19
    invoke-virtual {v2, v5}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 20
    :cond_6
    iget-object p1, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->d:Lcom/join/mgps/fragment/FindMiniGameFragment$MiniGameListAdapter;

    if-eqz p1, :cond_7

    .line 21
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_7
    return-void
.end method

.method private f0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/FindMiniGameFragment;->d0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method

.method private g0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->p:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->o:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->p:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/FindMiniGameFragment;->o0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method

.method private h0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->p:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->o:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->p:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    :cond_0
    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/FindMiniGameFragment;->d0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method

.method private j0()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->d:Lcom/join/mgps/fragment/FindMiniGameFragment$MiniGameListAdapter;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/join/mgps/base/BaseQuickAdapter;->getItemCount()I

    move-result v0

    if-lez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    invoke-virtual {v0}, Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;->getFirstCompletelyVisiblePosition()I

    move-result v0

    .line 3
    iget-object v1, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    invoke-virtual {v1}, Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;->getLastCompletelyVisiblePosition()I

    move-result v1

    :goto_0
    if-gt v0, v1, :cond_1

    .line 4
    iget-object v2, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->d:Lcom/join/mgps/fragment/FindMiniGameFragment$MiniGameListAdapter;

    invoke-virtual {v2, v0}, Lcom/join/mgps/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/CommonGameInfoBean;

    if-eqz v2, :cond_0

    .line 5
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->isMiniGame()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->isHasExposure()Z

    move-result v3

    if-nez v3, :cond_0

    .line 6
    new-instance v3, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v3}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string v4, ""

    .line 7
    invoke-virtual {v3, v4}, Lcom/papa/sim/statistic/Ext;->setPage(Ljava/lang/String;)V

    const-string v4, "104"

    .line 8
    invoke-virtual {v3, v4}, Lcom/papa/sim/statistic/Ext;->setFrom(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 9
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    const/4 v4, 0x1

    .line 10
    invoke-virtual {v2, v4}, Lcom/join/mgps/dto/CommonGameInfoBean;->setHasExposure(Z)V

    .line 11
    iget-object v4, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->e:Landroid/content/Context;

    invoke-static {v4}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v4

    sget-object v5, Lcom/papa/sim/statistic/Event;->expSmallGameAdPage:Lcom/papa/sim/statistic/Event;

    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v5, v3, v2}, Lcom/papa/sim/statistic/p;->k0(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;Ljava/lang/String;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private n0(Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->o:Ljava/util/List;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 4
    iget-object v2, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->o:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/CommonGameInfoBean;->isModGameVm()Z

    move-result v4

    if-eqz v4, :cond_9

    .line 6
    iget-object v4, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->p:Ljava/util/Map;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/4 v5, 0x1

    const/4 v6, 0x5

    const/4 v7, 0x0

    if-eqz v4, :cond_3

    .line 7
    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v4

    if-ne v4, v6, :cond_3

    const/4 v4, 0x1

    goto :goto_1

    :cond_3
    const/4 v4, 0x0

    .line 8
    :goto_1
    iget-object v8, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->p:Ljava/util/Map;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GInfoBean;->getMod_id()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v8, :cond_4

    .line 9
    invoke-virtual {v8}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v8

    if-ne v8, v6, :cond_4

    goto :goto_2

    :cond_4
    const/4 v5, 0x0

    :goto_2
    if-eqz v5, :cond_5

    if-eqz v4, :cond_5

    .line 10
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 11
    invoke-virtual {v0, v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    :cond_5
    if-eqz v5, :cond_6

    .line 12
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/join/mgps/dto/GInfoBean;->getMod_id()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 13
    invoke-virtual {v0, v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    :cond_6
    if-eqz v4, :cond_7

    .line 14
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 15
    invoke-virtual {v0, v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 16
    :cond_7
    iget-object v4, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->p:Ljava/util/Map;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GInfoBean;->getMod_id()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-nez v4, :cond_8

    .line 17
    iget-object v4, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->p:Ljava/util/Map;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    :cond_8
    if-eqz v4, :cond_2

    .line 18
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 19
    invoke-virtual {v0, v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_0

    .line 20
    :cond_9
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 21
    invoke-virtual {v0, v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_0

    :cond_a
    return-void
.end method

.method private o0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    :goto_0
    :try_start_0
    iget-object v2, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->d:Lcom/join/mgps/fragment/FindMiniGameFragment$MiniGameListAdapter;

    invoke-virtual {v2}, Lcom/join/mgps/base/BaseQuickAdapter;->getItemCount()I

    move-result v2

    if-ge v1, v2, :cond_8

    .line 2
    iget-object v2, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->d:Lcom/join/mgps/fragment/FindMiniGameFragment$MiniGameListAdapter;

    invoke-virtual {v2, v1}, Lcom/join/mgps/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 3
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v3

    if-eqz v3, :cond_7

    .line 4
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->isModGameVm()Z

    move-result v4

    if-eqz v4, :cond_6

    .line 5
    invoke-static {}, Lcom/join/android/app/common/servcie/i;->e()Lcom/join/android/app/common/servcie/i;

    move-result-object v4

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/join/android/app/common/servcie/i;->f(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v4

    const/4 v5, 0x5

    const/4 v6, 0x1

    if-eqz v4, :cond_0

    .line 6
    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v4

    if-ne v4, v5, :cond_0

    const/4 v4, 0x1

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    .line 7
    :goto_1
    invoke-static {}, Lcom/join/android/app/common/servcie/i;->e()Lcom/join/android/app/common/servcie/i;

    move-result-object v7

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getMod_id()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/join/android/app/common/servcie/i;->f(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v7

    if-eqz v7, :cond_1

    .line 8
    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v7

    if-ne v7, v5, :cond_1

    goto :goto_2

    :cond_1
    const/4 v6, 0x0

    :goto_2
    if-eqz v6, :cond_2

    if-eqz v4, :cond_2

    .line 9
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 10
    invoke-virtual {v2, p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_3

    :cond_2
    if-eqz v6, :cond_3

    .line 11
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getMod_id()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 12
    invoke-virtual {v2, p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_3

    :cond_3
    if-eqz v4, :cond_4

    .line 13
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 14
    invoke-virtual {v2, p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_3

    .line 15
    :cond_4
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v4

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getMod_id()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v4

    if-nez v4, :cond_5

    .line 16
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v4

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v4

    :cond_5
    if-eqz v4, :cond_7

    .line 17
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 18
    invoke-virtual {v2, p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_3

    .line 19
    :cond_6
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 20
    invoke-virtual {v2, p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_7
    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :catch_0
    move-exception p1

    .line 21
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_8
    return-void
.end method

.method private p0(Ljava/lang/String;I)V
    .locals 4

    .line 1
    invoke-static {p1}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->d:Lcom/join/mgps/fragment/FindMiniGameFragment$MiniGameListAdapter;

    invoke-virtual {v1}, Lcom/join/mgps/base/BaseQuickAdapter;->getItemCount()I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 3
    iget-object v1, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->d:Lcom/join/mgps/fragment/FindMiniGameFragment$MiniGameListAdapter;

    invoke-virtual {v1, v0}, Lcom/join/mgps/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 4
    invoke-virtual {v1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 5
    invoke-virtual {v2}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v2}, Lcom/join/mgps/dto/GInfoBean;->getMod_id()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 6
    :cond_1
    invoke-virtual {v1, p2}, Lcom/join/mgps/dto/CommonGameInfoBean;->setRequestStatus(I)V

    .line 7
    iget-object p1, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->d:Lcom/join/mgps/fragment/FindMiniGameFragment$MiniGameListAdapter;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    goto :goto_1

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method V()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->e:Landroid/content/Context;

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/d0;->d(Ljava/lang/Object;)V

    .line 3
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->j:Lcom/join/mgps/rpc/k;

    .line 4
    new-instance v0, Lcom/join/mgps/fragment/FindMiniGameFragment$MiniGameListAdapter;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/FindMiniGameFragment$MiniGameListAdapter;-><init>(Lcom/join/mgps/fragment/FindMiniGameFragment;)V

    iput-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->d:Lcom/join/mgps/fragment/FindMiniGameFragment$MiniGameListAdapter;

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    iget-object v2, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->e:Landroid/content/Context;

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    iget-object v1, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->d:Lcom/join/mgps/fragment/FindMiniGameFragment$MiniGameListAdapter;

    invoke-virtual {v0, v1}, Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;->setPreLoadCount(I)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    iget-object v1, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->g:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    invoke-virtual {v0, v1}, Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;->setPtrFrameLayout(Lcom/join/mgps/ptr/PtrFrameLayout;)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setItemViewCacheSize(I)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 11
    new-instance v0, Lcom/join/android/app/component/video/g;

    iget-object v2, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    const-string v3, "FindMiniGameFragmentVideoHelper"

    invoke-direct {v0, v2, v3}, Lcom/join/android/app/component/video/g;-><init>(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->l:Lcom/join/android/app/component/video/g;

    .line 12
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    new-instance v2, Lcom/join/mgps/fragment/FindMiniGameFragment$a;

    invoke-direct {v2, p0}, Lcom/join/mgps/fragment/FindMiniGameFragment$a;-><init>(Lcom/join/mgps/fragment/FindMiniGameFragment;)V

    invoke-virtual {v0, v2}, Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;->setLoadingListener(Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView$g;)V

    .line 13
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getItemAnimator()Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;

    move-result-object v0

    .line 14
    instance-of v2, v0, Landroidx/recyclerview/widget/SimpleItemAnimator;

    if-eqz v2, :cond_0

    .line 15
    check-cast v0, Landroidx/recyclerview/widget/SimpleItemAnimator;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/SimpleItemAnimator;->setSupportsChangeAnimations(Z)V

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    new-instance v2, Lcom/join/mgps/fragment/FindMiniGameFragment$b;

    invoke-direct {v2, p0}, Lcom/join/mgps/fragment/FindMiniGameFragment$b;-><init>(Lcom/join/mgps/fragment/FindMiniGameFragment;)V

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 17
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    new-instance v2, Lcom/join/mgps/fragment/FindMiniGameFragment$c;

    invoke-direct {v2, p0}, Lcom/join/mgps/fragment/FindMiniGameFragment$c;-><init>(Lcom/join/mgps/fragment/FindMiniGameFragment;)V

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

    .line 18
    invoke-virtual {p0}, Lcom/join/mgps/fragment/FindMiniGameFragment;->i0()V

    .line 19
    invoke-virtual {p0, v1}, Lcom/join/mgps/fragment/FindMiniGameFragment;->b0(I)V

    return-void
.end method

.method W()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->c:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/fragment/FindMiniGameFragment;->c0()V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    if-eqz v0, :cond_1

    const/16 v1, 0x8

    .line 5
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method a0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
        delay = 0x1f4L
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->n:Z

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->l:Lcom/join/android/app/component/video/g;

    if-eqz v0, :cond_0

    const/4 v1, 0x2

    .line 3
    invoke-virtual {v0, v1}, Lcom/join/android/app/component/video/g;->f(I)V

    .line 4
    :cond_0
    invoke-direct {p0}, Lcom/join/mgps/fragment/FindMiniGameFragment;->j0()V

    :cond_1
    return-void
.end method

.method b0(I)V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 2
    iget-boolean v1, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->m:Z

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/fragment/FindMiniGameFragment;->showLoding()V

    .line 4
    :cond_0
    new-instance v1, Lcom/join/mgps/dto/RequestModel;

    iget-object v2, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->e:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/join/mgps/dto/RequestModel;-><init>(Landroid/content/Context;)V

    .line 5
    new-instance v2, Lcom/join/mgps/dto/RequestMiniGameArgs;

    invoke-direct {v2}, Lcom/join/mgps/dto/RequestMiniGameArgs;-><init>()V

    .line 6
    invoke-virtual {v2, p1}, Lcom/join/mgps/dto/RequestMiniGameArgs;->setPage(I)V

    const/16 v3, 0x14

    .line 7
    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/RequestMiniGameArgs;->setPageSize(I)V

    .line 8
    iget-object v3, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->e:Landroid/content/Context;

    invoke-static {v3}, Lcom/join/mgps/Util/j0;->o0(Landroid/content/Context;)I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/RequestMiniGameArgs;->setUid(I)V

    .line 9
    iget-object v3, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->i:Ljava/lang/String;

    if-eqz v3, :cond_1

    .line 10
    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/RequestMiniGameArgs;->setGameId(Ljava/lang/String;)V

    .line 11
    :cond_1
    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 12
    iget-object v2, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->j:Lcom/join/mgps/rpc/k;

    invoke-virtual {v1}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object v1

    invoke-interface {v2, v1}, Lcom/join/mgps/rpc/k;->E(Lcom/join/mgps/dto/RequestModel;)Lcom/join/mgps/dto/ResponseModel;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 13
    invoke-virtual {v1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_2

    .line 14
    invoke-virtual {p0}, Lcom/join/mgps/fragment/FindMiniGameFragment;->c0()V

    .line 15
    invoke-virtual {p0}, Lcom/join/mgps/fragment/FindMiniGameFragment;->m0()V

    .line 16
    invoke-virtual {v1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/FindMiniGameFragment;->l0(Ljava/util/List;)V

    goto :goto_0

    :cond_2
    if-ne p1, v0, :cond_3

    .line 17
    invoke-virtual {p0}, Lcom/join/mgps/fragment/FindMiniGameFragment;->W()V

    goto :goto_0

    .line 18
    :cond_3
    invoke-virtual {p0}, Lcom/join/mgps/fragment/FindMiniGameFragment;->k0()V

    goto :goto_0

    .line 19
    :cond_4
    invoke-virtual {p0}, Lcom/join/mgps/fragment/FindMiniGameFragment;->showLodingFailed()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 20
    invoke-virtual {p0}, Lcom/join/mgps/fragment/FindMiniGameFragment;->showLodingFailed()V

    .line 21
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method c0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->f:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->h:Landroid/widget/LinearLayout;

    if-eqz v1, :cond_0

    const/16 v1, 0x8

    .line 2
    :try_start_0
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->h:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method d0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    if-eqz p1, :cond_2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->d:Lcom/join/mgps/fragment/FindMiniGameFragment$MiniGameListAdapter;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/join/mgps/base/BaseQuickAdapter;->getItemCount()I

    move-result v0

    if-lez v0, :cond_2

    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->d:Lcom/join/mgps/fragment/FindMiniGameFragment$MiniGameListAdapter;

    invoke-virtual {v1}, Lcom/join/mgps/base/BaseQuickAdapter;->getItemCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 3
    iget-object v1, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->d:Lcom/join/mgps/fragment/FindMiniGameFragment$MiniGameListAdapter;

    invoke-virtual {v1, v0}, Lcom/join/mgps/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 4
    invoke-virtual {v1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {v1}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 6
    iget-object v1, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->d:Lcom/join/mgps/fragment/FindMiniGameFragment$MiniGameListAdapter;

    invoke-virtual {v1, v0}, Lcom/join/mgps/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {v0, p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->setDownloadTask(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 7
    :cond_1
    :goto_1
    iget-object p1, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->d:Lcom/join/mgps/fragment/FindMiniGameFragment$MiniGameListAdapter;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_2
    return-void
.end method

.method i0()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v0}, Lp1/f;->d()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->o:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 4
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 5
    iget-object v2, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->p:Ljava/util/Map;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method

.method k0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;->setNoMore()V

    :cond_0
    return-void
.end method

.method l0(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            ">;)V"
        }
    .end annotation

    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/FindMiniGameFragment;->c0()V

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->d:Lcom/join/mgps/fragment/FindMiniGameFragment$MiniGameListAdapter;

    if-eqz v0, :cond_2

    .line 3
    iget v1, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->k:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    .line 4
    invoke-virtual {v0, p1}, Lcom/join/mgps/base/BaseQuickAdapter;->setNewData(Ljava/util/List;)V

    .line 5
    invoke-virtual {p0}, Lcom/join/mgps/fragment/FindMiniGameFragment;->a0()V

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {v0, p1}, Lcom/join/mgps/base/BaseQuickAdapter;->addData(Ljava/util/Collection;)V

    .line 7
    :goto_0
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/FindMiniGameFragment;->n0(Ljava/util/List;)V

    .line 8
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    if-eqz p1, :cond_3

    .line 9
    invoke-virtual {p1}, Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;->loadMoreComplete()V

    .line 10
    :cond_3
    iget-boolean p1, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->q:Z

    if-eqz p1, :cond_4

    .line 11
    invoke-virtual {p0}, Lcom/join/mgps/fragment/FindMiniGameFragment;->k0()V

    :cond_4
    return-void
.end method

.method m0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->c:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    const/16 v1, 0x8

    .line 4
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_1
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

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->l:Lcom/join/android/app/component/video/g;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/join/android/app/component/video/g;->t()V

    :cond_0
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

    move-result v1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_4

    const/4 v3, 0x3

    if-eq v1, v3, :cond_3

    const/4 v2, 0x5

    if-eq v1, v2, :cond_2

    const/4 v4, 0x6

    if-eq v1, v4, :cond_1

    const/4 v4, 0x7

    if-eq v1, v4, :cond_0

    packed-switch v1, :pswitch_data_0

    packed-switch v1, :pswitch_data_1

    goto :goto_0

    .line 3
    :pswitch_0
    invoke-virtual {p1}, Lcom/join/mgps/event/n;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/event/n;->c()I

    move-result p1

    invoke-direct {p0, v0, p1}, Lcom/join/mgps/fragment/FindMiniGameFragment;->p0(Ljava/lang/String;I)V

    goto :goto_0

    :pswitch_1
    const/16 p1, 0x9

    .line 4
    invoke-virtual {p0, v0, p1}, Lcom/join/mgps/fragment/FindMiniGameFragment;->q0(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    :pswitch_2
    const/16 p1, 0x8

    .line 5
    invoke-virtual {p0, v0, p1}, Lcom/join/mgps/fragment/FindMiniGameFragment;->q0(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 6
    :pswitch_3
    invoke-virtual {p0, v0, v4}, Lcom/join/mgps/fragment/FindMiniGameFragment;->q0(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p0, v0, v3}, Lcom/join/mgps/fragment/FindMiniGameFragment;->q0(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {p0, v0, v4}, Lcom/join/mgps/fragment/FindMiniGameFragment;->q0(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 9
    :cond_2
    :pswitch_4
    invoke-virtual {p0, v0, v2}, Lcom/join/mgps/fragment/FindMiniGameFragment;->q0(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    .line 10
    :cond_3
    invoke-virtual {p0, v0, v2}, Lcom/join/mgps/fragment/FindMiniGameFragment;->q0(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    goto :goto_0

    :cond_4
    const/4 p1, 0x1

    .line 11
    invoke-virtual {p0, v0, p1}, Lcom/join/mgps/fragment/FindMiniGameFragment;->q0(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x30
        :pswitch_4
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public onPause()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onPause()V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/fragment/FindMiniGameFragment;->r0()V

    return-void
.end method

.method public onResume()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/fragment/FindMiniGameFragment;->s0()V

    return-void
.end method

.method q0(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V
    .locals 0

    if-eqz p1, :cond_0

    packed-switch p2, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    .line 1
    :pswitch_1
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/FindMiniGameFragment;->f0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 2
    :pswitch_2
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/FindMiniGameFragment;->h0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 3
    :pswitch_3
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/FindMiniGameFragment;->e0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_0

    .line 4
    :pswitch_4
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/FindMiniGameFragment;->g0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

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

.method public r0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->l:Lcom/join/android/app/component/video/g;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/join/android/app/component/video/g;->u()V

    :cond_0
    return-void
.end method

.method relodingimag()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/FindMiniGameFragment;->showLoding()V

    .line 2
    iget v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->k:I

    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/FindMiniGameFragment;->b0(I)V

    return-void
.end method

.method public s0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->l:Lcom/join/android/app/component/video/g;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/join/android/app/component/video/g;->w()V

    :cond_0
    return-void
.end method

.method setNetwork()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->w3(Landroid/content/Context;)V

    return-void
.end method

.method public setUserVisibleHint(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->setUserVisibleHint(Z)V

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->n:Z

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/fragment/FindMiniGameFragment;->s0()V

    .line 4
    invoke-direct {p0}, Lcom/join/mgps/fragment/FindMiniGameFragment;->j0()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->n:Z

    .line 6
    invoke-virtual {p0}, Lcom/join/mgps/fragment/FindMiniGameFragment;->r0()V

    :goto_0
    return-void
.end method

.method showLoding()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->f:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->h:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    const/16 v1, 0x8

    .line 4
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 5
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
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->h:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->f:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    const/16 v1, 0x8

    .line 4
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_1
    return-void
.end method
