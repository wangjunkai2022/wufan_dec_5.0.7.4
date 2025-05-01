.class public Lcom/join/mgps/fragment/EndGameListFragment;
.super Landroidx/fragment/app/Fragment;
.source "EndGameListFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/EndGameListFragment$g;,
        Lcom/join/mgps/fragment/EndGameListFragment$f;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EFragment;
    value = 0x7f0c0263
.end annotation


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

.field f:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/FragmentArg;
    .end annotation
.end field

.field g:I
    .annotation build Lorg/androidannotations/annotations/FragmentArg;
    .end annotation
.end field

.field h:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/FragmentArg;
    .end annotation
.end field

.field i:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/FragmentArg;
    .end annotation
.end field

.field private j:Ljava/lang/String;

.field private k:I

.field private l:Lcom/join/mgps/rpc/k;

.field private m:Landroid/content/Context;

.field private n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/EndGameBean;",
            ">;"
        }
    .end annotation
.end field

.field private o:Lcom/join/mgps/fragment/EndGameListFragment$f;

.field private p:Lcom/join/android/app/component/video/c;

.field private q:Z

.field private r:Landroid/os/Handler;

.field s:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    const-string v0, "EndGameListFragment"

    .line 2
    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->j:Ljava/lang/String;

    const/4 v0, 0x1

    .line 3
    iput v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->k:I

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->n:Ljava/util/List;

    .line 5
    new-instance v0, Lcom/join/mgps/fragment/EndGameListFragment$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/EndGameListFragment$e;-><init>(Lcom/join/mgps/fragment/EndGameListFragment;)V

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->s:Ljava/lang/Runnable;

    return-void
.end method

.method static synthetic V(Lcom/join/mgps/fragment/EndGameListFragment;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/fragment/EndGameListFragment;->k:I

    return p1
.end method

.method static synthetic W(Lcom/join/mgps/fragment/EndGameListFragment;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->k:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/join/mgps/fragment/EndGameListFragment;->k:I

    return v0
.end method

.method static synthetic X(Lcom/join/mgps/fragment/EndGameListFragment;)Lcom/join/android/app/component/video/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->p:Lcom/join/android/app/component/video/c;

    return-object p0
.end method

.method static synthetic Z(Lcom/join/mgps/fragment/EndGameListFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/EndGameListFragment;->m0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a0(Lcom/join/mgps/fragment/EndGameListFragment;Lcom/join/mgps/dto/EndGameBean;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/EndGameListFragment;->n0(Lcom/join/mgps/dto/EndGameBean;)V

    return-void
.end method

.method static synthetic b0(Lcom/join/mgps/fragment/EndGameListFragment;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->q:Z

    return p0
.end method

.method static synthetic c0(Lcom/join/mgps/fragment/EndGameListFragment;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->m:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic d0(Lcom/join/mgps/fragment/EndGameListFragment;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->n:Ljava/util/List;

    return-object p0
.end method

.method static synthetic e0(Lcom/join/mgps/fragment/EndGameListFragment;I)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/EndGameListFragment;->h0(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private h0(I)Ljava/lang/String;
    .locals 6

    const/16 v0, 0x2710

    if-ge p1, v0, :cond_0

    .line 1
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v1, Ljava/text/DecimalFormat;

    const-string v2, "##0.0"

    invoke-direct {v1, v2}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    int-to-double v2, p1

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v2, v2, v4

    const-wide v4, 0x40c3880000000000L    # 10000.0

    div-double/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo p1, "\u4e07"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private l0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->r:Landroid/os/Handler;

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->r:Landroid/os/Handler;

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->r:Landroid/os/Handler;

    iget-object v1, p0, Lcom/join/mgps/fragment/EndGameListFragment;->s:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->r:Landroid/os/Handler;

    iget-object v1, p0, Lcom/join/mgps/fragment/EndGameListFragment;->s:Ljava/lang/Runnable;

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private m0(Ljava/lang/String;)V
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v0}, Lcom/papa/sim/statistic/Ext;-><init>()V

    .line 2
    invoke-virtual {v0, p1}, Lcom/papa/sim/statistic/Ext;->setEndId(Ljava/lang/String;)V

    .line 3
    new-instance p1, Lcom/papa/sim/statistic/Data;

    invoke-direct {p1}, Lcom/papa/sim/statistic/Data;-><init>()V

    .line 4
    iget-object v1, p0, Lcom/join/mgps/fragment/EndGameListFragment;->f:Ljava/lang/String;

    if-nez v1, :cond_0

    const-wide/16 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    :goto_0
    invoke-virtual {p1, v1, v2}, Lcom/papa/sim/statistic/Data;->setGameId(J)Lcom/papa/sim/statistic/Data;

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v1

    sget-object v2, Lcom/papa/sim/statistic/Event;->clickEndGameDetail:Lcom/papa/sim/statistic/Event;

    invoke-virtual {v1, v2, v0, p1}, Lcom/papa/sim/statistic/p;->i0(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;Lcom/papa/sim/statistic/Data;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 6
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method

.method private n0(Lcom/join/mgps/dto/EndGameBean;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->m:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->isTourist()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->m:Landroid/content/Context;

    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/IntentUtil;->goLogin(Landroid/content/Context;)Z

    return-void

    :cond_0
    if-nez p1, :cond_1

    return-void

    .line 3
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/activity/EndGameLaunchActivity_;->G0(Landroid/content/Context;)Lcom/join/mgps/activity/EndGameLaunchActivity_$f;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/EndGameBean;->getGameId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/EndGameLaunchActivity_$f;->b(Ljava/lang/String;)Lcom/join/mgps/activity/EndGameLaunchActivity_$f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/activity/EndGameLaunchActivity_$f;->a(Lcom/join/mgps/dto/EndGameBean;)Lcom/join/mgps/activity/EndGameLaunchActivity_$f;

    move-result-object v0

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/EndGameLaunchActivity_$f;->d(I)Lcom/join/mgps/activity/EndGameLaunchActivity_$f;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    .line 4
    :try_start_0
    new-instance v0, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v0}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string v1, "1"

    .line 5
    invoke-virtual {v0, v1}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 6
    invoke-virtual {p1}, Lcom/join/mgps/dto/EndGameBean;->getEndgameId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/papa/sim/statistic/Ext;->setEndId(Ljava/lang/String;)V

    .line 7
    new-instance v1, Lcom/papa/sim/statistic/Data;

    invoke-direct {v1}, Lcom/papa/sim/statistic/Data;-><init>()V

    .line 8
    invoke-virtual {p1}, Lcom/join/mgps/dto/EndGameBean;->getGameId()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/papa/sim/statistic/Data;->setGameId(J)Lcom/papa/sim/statistic/Data;

    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object v2, Lcom/papa/sim/statistic/Event;->gameStartVS:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p1, v2, v0, v1}, Lcom/papa/sim/statistic/p;->i0(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;Lcom/papa/sim/statistic/Data;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 10
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method


# virtual methods
.method f0()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->m:Landroid/content/Context;

    .line 2
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->l:Lcom/join/mgps/rpc/k;

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v2, p0, Lcom/join/mgps/fragment/EndGameListFragment;->m:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 4
    new-instance v0, Lcom/join/mgps/fragment/EndGameListFragment$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/EndGameListFragment$f;-><init>(Lcom/join/mgps/fragment/EndGameListFragment;)V

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->o:Lcom/join/mgps/fragment/EndGameListFragment$f;

    .line 5
    new-instance v0, Lcom/join/android/app/component/video/c;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "EndGameListFragmentVideoHelper"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/join/mgps/fragment/EndGameListFragment;->f:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Lcom/join/mgps/fragment/EndGameListFragment;->g:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/join/android/app/component/video/c;-><init>(Landroid/content/Context;Ljava/lang/String;Z)V

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->p:Lcom/join/android/app/component/video/c;

    .line 6
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    iget-object v1, p0, Lcom/join/mgps/fragment/EndGameListFragment;->o:Lcom/join/mgps/fragment/EndGameListFragment$f;

    invoke-virtual {v0, v1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    new-instance v1, Lcom/join/mgps/fragment/EndGameListFragment$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/EndGameListFragment$a;-><init>(Lcom/join/mgps/fragment/EndGameListFragment;)V

    invoke-virtual {v0, v1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setLoadingListener(Lcom/join/android/app/component/xrecyclerview/XRecyclerView$f;)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    new-instance v1, Lcom/join/mgps/fragment/EndGameListFragment$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/EndGameListFragment$b;-><init>(Lcom/join/mgps/fragment/EndGameListFragment;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

    .line 9
    invoke-virtual {p0}, Lcom/join/mgps/fragment/EndGameListFragment;->showLoding()V

    .line 10
    invoke-virtual {p0}, Lcom/join/mgps/fragment/EndGameListFragment;->i0()V

    return-void
.end method

.method g0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->p:Lcom/join/android/app/component/video/c;

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lcom/join/mgps/fragment/EndGameListFragment;->q:Z

    if-eqz v1, :cond_0

    .line 2
    iget-object v1, p0, Lcom/join/mgps/fragment/EndGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {v0, v1}, Lcom/join/android/app/component/video/c;->o(Landroidx/recyclerview/widget/RecyclerView;)V

    :cond_0
    return-void
.end method

.method i0()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->m:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2
    new-instance v0, Lcom/join/mgps/dto/RequestEndGameListArgs;

    invoke-direct {v0}, Lcom/join/mgps/dto/RequestEndGameListArgs;-><init>()V

    .line 3
    iget-object v1, p0, Lcom/join/mgps/fragment/EndGameListFragment;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestEndGameListArgs;->setGameId(Ljava/lang/String;)V

    .line 4
    iget-object v1, p0, Lcom/join/mgps/fragment/EndGameListFragment;->m:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestEndGameListArgs;->setUid(Ljava/lang/String;)V

    .line 5
    iget v1, p0, Lcom/join/mgps/fragment/EndGameListFragment;->g:I

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestEndGameListArgs;->setType(I)V

    .line 6
    iget v1, p0, Lcom/join/mgps/fragment/EndGameListFragment;->k:I

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestEndGameListArgs;->setPage(I)V

    .line 7
    iget-object v1, p0, Lcom/join/mgps/fragment/EndGameListFragment;->i:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 8
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestEndGameListArgs;->setExt(Ljava/lang/String;)V

    .line 9
    :cond_0
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v1

    invoke-virtual {v1}, Lp1/f;->A()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestEndGameListArgs;->setDownloadGameIdList(Ljava/util/List;)V

    .line 10
    new-instance v1, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v1}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 11
    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 12
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->m:Landroid/content/Context;

    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 13
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->l:Lcom/join/mgps/rpc/k;

    invoke-virtual {v1}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/join/mgps/rpc/k;->O(Lcom/join/mgps/dto/RequestModel;)Lcom/join/mgps/dto/ResponseModel;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_4

    .line 14
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v2

    const/16 v3, 0xc8

    if-ne v2, v3, :cond_4

    .line 15
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-gtz v2, :cond_1

    goto :goto_0

    .line 16
    :cond_1
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/EndGameListFragment;->o0(Ljava/util/List;)V

    goto :goto_1

    .line 17
    :cond_2
    :goto_0
    iget v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->k:I

    if-ne v0, v1, :cond_3

    invoke-virtual {p0}, Lcom/join/mgps/fragment/EndGameListFragment;->showEmpty()V

    .line 18
    :cond_3
    invoke-virtual {p0}, Lcom/join/mgps/fragment/EndGameListFragment;->j0()V

    goto :goto_1

    .line 19
    :cond_4
    iget v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->k:I

    if-ne v0, v1, :cond_6

    invoke-virtual {p0}, Lcom/join/mgps/fragment/EndGameListFragment;->showLodingFailed()V

    goto :goto_1

    .line 20
    :cond_5
    invoke-virtual {p0}, Lcom/join/mgps/fragment/EndGameListFragment;->showLodingFailed()V

    .line 21
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f100299

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/EndGameListFragment;->showTost(Ljava/lang/String;)V

    :cond_6
    :goto_1
    return-void
.end method

.method j0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setNoMore()V

    :cond_0
    return-void
.end method

.method k0()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/UiThread;
        delay = 0x1f4L
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->q:Z

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onResume: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/fragment/EndGameListFragment;->p0()V

    .line 4
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/join/mgps/fragment/EndGameListFragment$d;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/EndGameListFragment$d;-><init>(Lcom/join/mgps/fragment/EndGameListFragment;)V

    const-wide/16 v2, 0x2bc

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method o0(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/EndGameBean;",
            ">;)V"
        }
    .end annotation

    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->loadMoreComplete()V

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/fragment/EndGameListFragment;->showMain()V

    .line 4
    iget v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->k:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->n:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 7
    iget-object p1, p0, Lcom/join/mgps/fragment/EndGameListFragment;->o:Lcom/join/mgps/fragment/EndGameListFragment$f;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 8
    invoke-virtual {p0}, Lcom/join/mgps/fragment/EndGameListFragment;->g0()V

    .line 9
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    new-instance v0, Lcom/join/mgps/fragment/EndGameListFragment$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/EndGameListFragment$c;-><init>(Lcom/join/mgps/fragment/EndGameListFragment;)V

    const-wide/16 v1, 0x3e8

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

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
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->p:Lcom/join/android/app/component/video/c;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/join/android/app/component/video/c;->G()V

    :cond_0
    return-void
.end method

.method public onPause()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onPause()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->p:Lcom/join/android/app/component/video/c;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/join/android/app/component/video/c;->H()V

    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/fragment/EndGameListFragment;->k0()V

    return-void
.end method

.method public p0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->p:Lcom/join/android/app/component/video/c;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lcom/join/mgps/fragment/EndGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {v0, v1}, Lcom/join/android/app/component/video/c;->o(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->p:Lcom/join/android/app/component/video/c;

    invoke-virtual {v0}, Lcom/join/android/app/component/video/c;->I()V

    :cond_0
    return-void
.end method

.method relodingimag()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/EndGameListFragment;->showLoding()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->k:I

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/fragment/EndGameListFragment;->i0()V

    return-void
.end method

.method setNetwork()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->m:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->w3(Landroid/content/Context;)V

    return-void
.end method

.method public setUserVisibleHint(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->setUserVisibleHint(Z)V

    .line 2
    iput-boolean p1, p0, Lcom/join/mgps/fragment/EndGameListFragment;->q:Z

    if-eqz p1, :cond_0

    .line 3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onresume: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/fragment/EndGameListFragment;->p0()V

    .line 5
    invoke-direct {p0}, Lcom/join/mgps/fragment/EndGameListFragment;->l0()V

    goto :goto_0

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onpause: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 7
    iget-object p1, p0, Lcom/join/mgps/fragment/EndGameListFragment;->p:Lcom/join/android/app/component/video/c;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/join/android/app/component/video/c;->H()V

    :cond_1
    :goto_0
    return-void
.end method

.method showEmpty()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->d:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->c:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->e:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_3

    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_3
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
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->c:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 3
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->d:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->e:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_3

    .line 9
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_3
    return-void
.end method

.method showLodingFailed()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->d:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->c:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->e:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_3

    .line 8
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_3
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
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->d:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->c:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    if-eqz v0, :cond_2

    const/4 v2, 0x0

    .line 7
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->e:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_3

    .line 9
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_3
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
