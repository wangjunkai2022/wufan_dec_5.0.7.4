.class public Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;
.super Landroidx/fragment/app/Fragment;
.source "SimulatorLaunchMomentFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;,
        Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$h;,
        Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;,
        Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$f;,
        Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$c;,
        Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EFragment;
    value = 0x7f0c02a0
.end annotation


# static fields
.field public static final p:I = 0x1

.field public static final q:I = 0x2

.field public static final r:I = 0x3


# instance fields
.field b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;
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

.field e:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field f:Landroidx/core/widget/NestedScrollView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private g:Ljava/lang/String;

.field private h:Lcom/join/mgps/rpc/k;

.field private i:Z

.field private j:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;

.field private k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;",
            ">;"
        }
    .end annotation
.end field

.field private l:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private m:I

.field private n:J

.field private o:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->k:Ljava/util/ArrayList;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->l:Ljava/util/ArrayList;

    const/4 v0, 0x1

    .line 4
    iput v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->m:I

    .line 5
    iput v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->o:I

    return-void
.end method

.method static synthetic V(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->m:I

    return p0
.end method

.method static synthetic W(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->m:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->m:I

    return v0
.end method

.method static synthetic X(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->k:Ljava/util/ArrayList;

    return-object p0
.end method


# virtual methods
.method Z()V
    .locals 3
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

    iput-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->g:Ljava/lang/String;

    .line 3
    :cond_0
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->h:Lcom/join/mgps/rpc/k;

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 5
    new-instance v0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;

    iget-object v1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->k:Ljava/util/ArrayList;

    invoke-direct {v0, p0, v1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;-><init>(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;Ljava/util/List;)V

    iput-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->j:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;

    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->setHasStableIds(Z)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    iget-object v1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->j:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;

    invoke-virtual {v0, v1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    new-instance v1, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$a;-><init>(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;)V

    invoke-virtual {v0, v1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setLoadingListener(Lcom/join/android/app/component/xrecyclerview/XRecyclerView$f;)V

    return-void
.end method

.method a0(I)V
    .locals 6
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    :try_start_0
    iget-boolean v2, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->i:Z

    if-nez v2, :cond_3

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 2
    iput-boolean v1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->i:Z

    .line 3
    new-instance v2, Lcom/join/mgps/dto/RequestSimulatorMomentListArgs;

    invoke-direct {v2}, Lcom/join/mgps/dto/RequestSimulatorMomentListArgs;-><init>()V

    .line 4
    invoke-static {}, Lb2/p;->o()Lb2/p;

    move-result-object v3

    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v4

    iget-object v5, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->g:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v4

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lb2/p;->n(Ljava/lang/String;)Lcom/join/mgps/db/tables/EMUApkTable;

    move-result-object v3

    .line 5
    invoke-virtual {v2, p1}, Lcom/join/mgps/dto/RequestSimulatorMomentListArgs;->setPage(I)V

    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/join/mgps/dto/RequestSimulatorMomentListArgs;->setUid(Ljava/lang/String;)V

    .line 7
    iget v4, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->o:I

    invoke-virtual {v2, v4}, Lcom/join/mgps/dto/RequestSimulatorMomentListArgs;->setSelectCondition(I)V

    .line 8
    iget-object v4, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->g:Ljava/lang/String;

    invoke-virtual {v2, v4}, Lcom/join/mgps/dto/RequestSimulatorMomentListArgs;->setGameId(Ljava/lang/String;)V

    if-nez v3, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {v3}, Lcom/join/mgps/db/tables/EMUApkTable;->getVerCode()I

    move-result v3

    :goto_0
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/RequestSimulatorMomentListArgs;->setPlugVersion(Ljava/lang/String;)V

    .line 10
    new-instance v3, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v3}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 11
    invoke-virtual {v3, v2}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 12
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 13
    iget-object v2, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->h:Lcom/join/mgps/rpc/k;

    invoke-virtual {v3}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/join/mgps/rpc/k;->i(Lcom/join/mgps/dto/RequestModel;)Lcom/join/mgps/dto/ResponseModel;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 14
    invoke-virtual {v2}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 15
    invoke-virtual {v2}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/SimulatorMomentBean;

    invoke-virtual {p0, v2, p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->h0(Lcom/join/mgps/dto/SimulatorMomentBean;I)V

    goto :goto_1

    :cond_1
    if-ne p1, v1, :cond_2

    .line 16
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->showLodingFailed()V

    .line 17
    :cond_2
    :goto_1
    iput-boolean v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->i:Z

    goto :goto_2

    :cond_3
    if-ne p1, v1, :cond_4

    .line 18
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->showLodingFailed()V

    .line 19
    :cond_4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f100299

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->showTost(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception v2

    .line 20
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    .line 21
    iput-boolean v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->i:Z

    if-ne p1, v1, :cond_5

    .line 22
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->showLodingFailed()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    :cond_5
    :goto_2
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->g0()V

    return-void

    :goto_3
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->g0()V

    .line 24
    throw p1
.end method

.method public b0()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->o:I

    return v0
.end method

.method c0(I)V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->n:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->n:J

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;->d()Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;

    move-result-object v1

    .line 6
    new-instance v2, Lcom/join/mgps/dto/RequestSimulatorMomentLikeArgs;

    invoke-direct {v2}, Lcom/join/mgps/dto/RequestSimulatorMomentLikeArgs;-><init>()V

    .line 7
    invoke-virtual {v1}, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->getDateStr()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/RequestSimulatorMomentLikeArgs;->setDs(Ljava/lang/String;)V

    .line 8
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/RequestSimulatorMomentLikeArgs;->setUid(Ljava/lang/String;)V

    .line 9
    invoke-virtual {v1}, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->getUid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/RequestSimulatorMomentLikeArgs;->setRuid(Ljava/lang/String;)V

    .line 10
    iget-object v3, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->g:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/RequestSimulatorMomentLikeArgs;->setGameId(Ljava/lang/String;)V

    .line 11
    new-instance v3, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v3}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 12
    invoke-virtual {v3, v2}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 14
    iget-object v2, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->h:Lcom/join/mgps/rpc/k;

    invoke-virtual {v3}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/join/mgps/rpc/k;->p0(Lcom/join/mgps/dto/RequestModel;)Lcom/join/mgps/dto/ResponseModel;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 15
    invoke-virtual {v2}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    const/4 v2, 0x1

    .line 16
    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->setPraised(Z)V

    .line 17
    invoke-virtual {v1}, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->getPraiseCount()I

    move-result v3

    add-int/2addr v3, v2

    invoke-virtual {v1, v3}, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->setPraiseCount(I)V

    .line 18
    invoke-virtual {v0, v1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;->l(Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;)V

    .line 19
    iget-object v1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->k:Ljava/util/ArrayList;

    invoke-virtual {v1, p1, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 20
    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->e0(I)V

    goto :goto_0

    .line 21
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f100299

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->showTost(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 22
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_2
    :goto_0
    return-void
.end method

.method d0(I)V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->n:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->n:J

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;->d()Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;

    move-result-object v1

    .line 6
    new-instance v2, Lcom/join/mgps/dto/RequestSimulatorMomentLikeArgs;

    invoke-direct {v2}, Lcom/join/mgps/dto/RequestSimulatorMomentLikeArgs;-><init>()V

    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/RequestSimulatorMomentLikeArgs;->setUid(Ljava/lang/String;)V

    .line 8
    invoke-virtual {v1}, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->getPraiseId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/RequestSimulatorMomentLikeArgs;->setPraiseId(Ljava/lang/String;)V

    .line 9
    invoke-virtual {v1}, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->getUid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/RequestSimulatorMomentLikeArgs;->setRuid(Ljava/lang/String;)V

    .line 10
    iget-object v3, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->g:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/RequestSimulatorMomentLikeArgs;->setGameId(Ljava/lang/String;)V

    .line 11
    invoke-virtual {v1}, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->getDateStr()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/RequestSimulatorMomentLikeArgs;->setDs(Ljava/lang/String;)V

    .line 12
    new-instance v3, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v3}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 13
    invoke-virtual {v3, v2}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 15
    iget-object v2, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->h:Lcom/join/mgps/rpc/k;

    invoke-virtual {v3}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/join/mgps/rpc/k;->u(Lcom/join/mgps/dto/RequestModel;)Lcom/join/mgps/dto/ResponseModel;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 16
    invoke-virtual {v2}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    const/4 v2, 0x0

    .line 17
    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->setPraised(Z)V

    .line 18
    invoke-virtual {v1}, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->getPraiseCount()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->setPraiseCount(I)V

    .line 19
    invoke-virtual {v0, v1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;->l(Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;)V

    .line 20
    iget-object v1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->k:Ljava/util/ArrayList;

    invoke-virtual {v1, p1, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 21
    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->e0(I)V

    goto :goto_0

    .line 22
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f100299

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->showTost(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 23
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_2
    :goto_0
    return-void
.end method

.method e0(I)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->j:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    :cond_0
    return-void
.end method

.method public f0(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->o:I

    if-ne v0, p1, :cond_0

    return-void

    .line 2
    :cond_0
    iput p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->o:I

    .line 3
    iget-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {p1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->reset()V

    const/4 p1, 0x1

    .line 4
    iput p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->m:I

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->a0(I)V

    return-void
.end method

.method g0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->stopRefresh()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {v0}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->stopLoadMore()V

    :cond_0
    return-void
.end method

.method h0(Lcom/join/mgps/dto/SimulatorMomentBean;I)V
    .locals 11
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 v7, 0x1

    if-ne p2, v7, :cond_2

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/SimulatorMomentBean;->getUpdatesInfos()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/join/mgps/dto/SimulatorMomentBean;->getUpdatesInfos()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_2

    .line 2
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->showEmpty()V

    return-void

    .line 3
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->showMain()V

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/dto/SimulatorMomentBean;->getUpdatesInfos()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lcom/join/mgps/dto/SimulatorMomentBean;->getUpdatesInfos()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_4

    .line 5
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {v0}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setNoMore()V

    .line 6
    :cond_4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    instance-of v0, v0, Lcom/join/mgps/activity/GameMainActivity4_;

    if-eqz v0, :cond_5

    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/activity/GameMainActivity4_;

    invoke-virtual {p1}, Lcom/join/mgps/dto/SimulatorMomentBean;->getBasicInfos()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/GameMainActivity4;->Z1(Ljava/util/List;)V

    :cond_5
    if-ne p2, v7, :cond_6

    .line 8
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 10
    iget-object v8, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->k:Ljava/util/ArrayList;

    new-instance v9, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;

    const/4 v2, 0x1

    invoke-virtual {p1}, Lcom/join/mgps/dto/SimulatorMomentBean;->getBasicInfos()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v9

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;-><init>(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;ILjava/util/List;Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;Ljava/lang/String;)V

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    :cond_6
    invoke-virtual {p1}, Lcom/join/mgps/dto/SimulatorMomentBean;->getUpdatesInfos()Ljava/util/List;

    move-result-object v0

    const/4 v8, 0x0

    if-eqz v0, :cond_a

    invoke-virtual {p1}, Lcom/join/mgps/dto/SimulatorMomentBean;->getUpdatesInfos()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_a

    if-ne p2, v7, :cond_7

    .line 12
    invoke-virtual {p1}, Lcom/join/mgps/dto/SimulatorMomentBean;->getUpdatesInfos()Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$b;-><init>(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;)V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_7
    const/4 v6, 0x0

    .line 13
    :goto_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/SimulatorMomentBean;->getUpdatesInfos()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_a

    .line 14
    invoke-virtual {p1}, Lcom/join/mgps/dto/SimulatorMomentBean;->getUpdatesInfos()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;

    .line 15
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->l:Ljava/util/ArrayList;

    invoke-virtual {v9}, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->getFeDate()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 16
    new-instance v10, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;

    const/4 v2, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v9}, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->getFeDate()Ljava/lang/String;

    move-result-object v5

    move-object v0, v10

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;-><init>(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;ILjava/util/List;Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;Ljava/lang/String;)V

    if-nez v6, :cond_8

    const/4 v0, 0x1

    goto :goto_1

    :cond_8
    const/4 v0, 0x0

    .line 17
    :goto_1
    invoke-virtual {v10, v0}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;->h(Z)V

    .line 18
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->l:Ljava/util/ArrayList;

    invoke-virtual {v9}, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->getFeDate()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 20
    :cond_9
    new-instance v10, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v0, v10

    move-object v1, p0

    move-object v4, v9

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;-><init>(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;ILjava/util/List;Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;Ljava/lang/String;)V

    .line 21
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 22
    :cond_a
    invoke-virtual {p1}, Lcom/join/mgps/dto/SimulatorMomentBean;->getUpdatesInfos()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-virtual {p1}, Lcom/join/mgps/dto/SimulatorMomentBean;->getUpdatesInfos()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_e

    .line 23
    :cond_b
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int/2addr v0, v7

    const/4 v1, 0x0

    :goto_2
    if-ltz v0, :cond_e

    .line 24
    iget-object v2, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->k:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;

    invoke-static {v2}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;->a(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;)I

    move-result v2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_c

    if-nez v1, :cond_c

    .line 25
    iget-object v2, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->k:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;

    invoke-virtual {v2, v7}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;->i(Z)V

    goto :goto_3

    .line 26
    :cond_c
    iget-object v2, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->k:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;

    invoke-static {v2}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;->a(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;)I

    move-result v2

    const/4 v3, 0x3

    if-ne v2, v3, :cond_d

    if-nez v1, :cond_d

    .line 27
    iget-object v1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->k:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;

    invoke-virtual {v1, v7}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;->i(Z)V

    const/4 v1, 0x1

    goto :goto_3

    .line 28
    :cond_d
    iget-object v2, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->k:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;

    invoke-virtual {v2, v8}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;->i(Z)V

    :goto_3
    add-int/lit8 v0, v0, -0x1

    goto :goto_2

    .line 29
    :cond_e
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->j:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method

.method public onResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->m:I

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {v0}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->reset()V

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->showLoding()V

    .line 5
    iget v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->m:I

    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->a0(I)V

    return-void
.end method

.method relodingimag()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->showLoding()V

    .line 2
    iget v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->m:I

    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->a0(I)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->f:Landroidx/core/widget/NestedScrollView;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->d:Landroid/widget/LinearLayout;

    const/16 v2, 0x8

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->c:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    if-eqz v0, :cond_3

    .line 8
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 9
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->e:Landroid/widget/LinearLayout;

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
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->f:Landroidx/core/widget/NestedScrollView;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->c:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->d:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    if-eqz v0, :cond_3

    .line 9
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 10
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->e:Landroid/widget/LinearLayout;

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
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->f:Landroidx/core/widget/NestedScrollView;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->d:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->c:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    if-eqz v0, :cond_3

    .line 8
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 9
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->e:Landroid/widget/LinearLayout;

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
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->f:Landroidx/core/widget/NestedScrollView;

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->d:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->c:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    if-eqz v0, :cond_3

    const/4 v2, 0x0

    .line 9
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 10
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->e:Landroid/widget/LinearLayout;

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
