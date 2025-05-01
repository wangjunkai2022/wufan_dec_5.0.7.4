.class public Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;
.super Landroidx/fragment/app/Fragment;
.source "SimulatorLaunchAchievementFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;,
        Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$g;,
        Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;,
        Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$c;,
        Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$d;,
        Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$b;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EFragment;
    value = 0x7f0c029f
.end annotation


# static fields
.field public static final j:I = 0x1

.field public static final k:I = 0x2

.field public static final l:I = 0x3


# instance fields
.field b:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field c:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field d:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field e:Landroidx/core/widget/NestedScrollView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field f:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private g:Ljava/lang/String;

.field private h:Lcom/join/mgps/rpc/k;

.field private i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/join/mgps/dto/UnlockBean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    return-void
.end method

.method static synthetic V(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->Z(I)V

    return-void
.end method

.method private Z(I)V
    .locals 2

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$a;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$a;-><init>(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;Landroid/content/Context;)V

    .line 2
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$SmoothScroller;->setTargetPosition(I)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->f:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->startSmoothScroll(Landroidx/recyclerview/widget/RecyclerView$SmoothScroller;)V

    return-void
.end method


# virtual methods
.method W()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "gameId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->g:Ljava/lang/String;

    .line 3
    :cond_0
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->h:Lcom/join/mgps/rpc/k;

    return-void
.end method

.method X()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2
    new-instance v0, Lcom/join/mgps/dto/RequestSimulatorAchievementListArgs;

    invoke-direct {v0}, Lcom/join/mgps/dto/RequestSimulatorAchievementListArgs;-><init>()V

    .line 3
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v1

    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v2

    iget-object v3, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->g:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v2

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lb2/p;->n(Ljava/lang/String;)Lcom/join/mgps/db/tables/EMUApkTable;

    move-result-object v1

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/join/mgps/dto/RequestSimulatorAchievementListArgs;->setUid(Ljava/lang/String;)V

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {v1}, Lcom/join/mgps/db/tables/EMUApkTable;->getVerCode()I

    move-result v1

    :goto_0
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestSimulatorAchievementListArgs;->setPlugVersion(Ljava/lang/String;)V

    .line 6
    iget-object v1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestSimulatorAchievementListArgs;->setGameId(Ljava/lang/String;)V

    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestSimulatorAchievementListArgs;->setToken(Ljava/lang/String;)V

    .line 8
    new-instance v1, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v1}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 9
    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 11
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->h:Lcom/join/mgps/rpc/k;

    invoke-virtual {v1}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/join/mgps/rpc/k;->f0(Lcom/join/mgps/dto/RequestModel;)Lcom/join/mgps/dto/ResponseModel;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 12
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 13
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/SimulatorAchievementBean;

    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->a0(Lcom/join/mgps/dto/SimulatorAchievementBean;)V

    goto :goto_1

    .line 14
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->showLodingFailed()V

    goto :goto_1

    .line 15
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->showLodingFailed()V

    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f100299

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->showTost(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 18
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->showLodingFailed()V

    :goto_1
    return-void
.end method

.method a0(Lcom/join/mgps/dto/SimulatorAchievementBean;)V
    .locals 8
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    if-eqz p1, :cond_8

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/SimulatorAchievementBean;->getTarget()I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_7

    .line 2
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->showMain()V

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->i:Ljava/util/ArrayList;

    .line 4
    new-instance v1, Lcom/join/mgps/dto/UnlockBean;

    const/4 v2, 0x3

    invoke-direct {v1, v2, p1}, Lcom/join/mgps/dto/UnlockBean;-><init>(ILcom/join/mgps/dto/SimulatorAchievementBean;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 5
    invoke-virtual {p1}, Lcom/join/mgps/dto/SimulatorAchievementBean;->getHistory_unlock_achievements()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lcom/join/mgps/dto/SimulatorAchievementBean;->getHistory_unlock_achievements()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 6
    invoke-virtual {p1}, Lcom/join/mgps/dto/SimulatorAchievementBean;->getHistory_unlock_achievements()Ljava/util/List;

    .line 7
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->i:Ljava/util/ArrayList;

    new-instance v4, Lcom/join/mgps/dto/UnlockBean;

    const-string/jumbo v5, "\u5df2\u89e3\u9501"

    invoke-direct {v4, v1, v5, v2}, Lcom/join/mgps/dto/UnlockBean;-><init>(ILjava/lang/String;Z)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    .line 8
    :goto_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/SimulatorAchievementBean;->getHistory_unlock_achievements()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v0, v4, :cond_4

    .line 9
    invoke-virtual {p1}, Lcom/join/mgps/dto/SimulatorAchievementBean;->getHistory_unlock_achievements()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/SimulatorAchievementBean$HistoryUnlockAchievementBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/SimulatorAchievementBean$HistoryUnlockAchievementBean;->getUnlockAchievements()Ljava/util/List;

    move-result-object v4

    const/4 v5, 0x0

    .line 10
    :goto_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_3

    .line 11
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;

    .line 12
    new-instance v7, Lcom/join/mgps/dto/UnlockBean;

    invoke-direct {v7, v3, v6, v2}, Lcom/join/mgps/dto/UnlockBean;-><init>(ILcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;Z)V

    if-nez v0, :cond_1

    if-nez v5, :cond_1

    const/4 v6, 0x1

    goto :goto_2

    :cond_1
    const/4 v6, 0x0

    .line 13
    :goto_2
    invoke-virtual {v7, v6}, Lcom/join/mgps/dto/UnlockBean;->setFirst(Z)V

    .line 14
    invoke-virtual {p1}, Lcom/join/mgps/dto/SimulatorAchievementBean;->getHistory_unlock_achievements()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    sub-int/2addr v6, v3

    if-lt v0, v6, :cond_2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    sub-int/2addr v6, v3

    if-lt v5, v6, :cond_2

    const/4 v6, 0x1

    goto :goto_3

    :cond_2
    const/4 v6, 0x0

    :goto_3
    invoke-virtual {v7, v6}, Lcom/join/mgps/dto/UnlockBean;->setLast(Z)V

    .line 15
    iget-object v6, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->i:Ljava/util/ArrayList;

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 16
    :cond_4
    invoke-virtual {p1}, Lcom/join/mgps/dto/SimulatorAchievementBean;->getAll_lock_achievements()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Lcom/join/mgps/dto/SimulatorAchievementBean;->getAll_lock_achievements()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_7

    .line 17
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->i:Ljava/util/ArrayList;

    new-instance v4, Lcom/join/mgps/dto/UnlockBean;

    const-string/jumbo v5, "\u672a\u89e3\u9501"

    invoke-direct {v4, v1, v5, v3}, Lcom/join/mgps/dto/UnlockBean;-><init>(ILjava/lang/String;Z)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    .line 18
    :goto_4
    invoke-virtual {p1}, Lcom/join/mgps/dto/SimulatorAchievementBean;->getAll_lock_achievements()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_7

    .line 19
    invoke-virtual {p1}, Lcom/join/mgps/dto/SimulatorAchievementBean;->getAll_lock_achievements()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;

    .line 20
    new-instance v4, Lcom/join/mgps/dto/UnlockBean;

    invoke-direct {v4, v3, v1, v3}, Lcom/join/mgps/dto/UnlockBean;-><init>(ILcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;Z)V

    if-nez v0, :cond_5

    const/4 v1, 0x1

    goto :goto_5

    :cond_5
    const/4 v1, 0x0

    .line 21
    :goto_5
    invoke-virtual {v4, v1}, Lcom/join/mgps/dto/UnlockBean;->setFirst(Z)V

    .line 22
    invoke-virtual {p1}, Lcom/join/mgps/dto/SimulatorAchievementBean;->getAll_lock_achievements()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v1, v3

    if-lt v0, v1, :cond_6

    const/4 v1, 0x1

    goto :goto_6

    :cond_6
    const/4 v1, 0x0

    :goto_6
    invoke-virtual {v4, v1}, Lcom/join/mgps/dto/UnlockBean;->setLast(Z)V

    .line 23
    iget-object v1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->i:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 24
    :cond_7
    iget-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->f:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 25
    iget-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->f:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$d;

    iget-object v1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->i:Ljava/util/ArrayList;

    invoke-direct {v0, p0, v1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$d;-><init>(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;Ljava/util/List;)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    return-void

    .line 26
    :cond_8
    :goto_7
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->showEmpty()V

    .line 27
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/GameMainActivity4_;

    invoke-virtual {p1}, Lcom/join/mgps/activity/GameMainActivity4;->V1()V

    return-void
.end method

.method public onResume()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->showLoding()V

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->X()V

    return-void
.end method

.method relodingimag()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->showLoding()V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->X()V

    return-void
.end method

.method setNetwork()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->w3(Landroid/content/Context;)V

    return-void
.end method

.method showEmpty()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->e:Landroidx/core/widget/NestedScrollView;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->c:Landroid/widget/LinearLayout;

    const/16 v2, 0x8

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->b:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->f:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_3

    .line 8
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 9
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->d:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_4

    .line 10
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_4
    return-void
.end method

.method showLoding()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const-string/jumbo v0, "\u663e\u793a\u52a0\u8f7d\u4e2d"

    .line 1
    invoke-static {v0}, Lcom/join/mgps/Util/v0;->c(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->e:Landroidx/core/widget/NestedScrollView;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->b:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->c:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->f:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_3

    .line 9
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 10
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->d:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_4

    .line 11
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_4
    return-void
.end method

.method showLodingFailed()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->e:Landroidx/core/widget/NestedScrollView;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->c:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->b:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->f:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_3

    .line 8
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 9
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->d:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_4

    .line 10
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_4
    return-void
.end method

.method showMain()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const-string/jumbo v0, "\u663e\u793a\u4e3b\u754c\u9762main"

    .line 1
    invoke-static {v0}, Lcom/join/mgps/Util/v0;->c(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->e:Landroidx/core/widget/NestedScrollView;

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->c:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->b:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->f:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_3

    const/4 v2, 0x0

    .line 9
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 10
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->d:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_4

    .line 11
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_4
    return-void
.end method

.method showTost(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method
