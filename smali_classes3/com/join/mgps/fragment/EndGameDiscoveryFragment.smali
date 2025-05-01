.class public Lcom/join/mgps/fragment/EndGameDiscoveryFragment;
.super Landroidx/fragment/app/Fragment;
.source "EndGameDiscoveryFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/EndGameDiscoveryFragment$c;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EFragment;
    value = 0x7f0c0262
.end annotation


# instance fields
.field b:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field c:I
    .annotation build Lorg/androidannotations/annotations/FragmentArg;
    .end annotation
.end field

.field d:Lcom/join/mgps/dto/EndGameNameListBean;
    .annotation build Lorg/androidannotations/annotations/FragmentArg;
    .end annotation
.end field

.field private e:Lcom/join/android/app/component/video/c;

.field private f:Lcom/join/mgps/fragment/EndGameDiscoveryFragment$c;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    return-void
.end method

.method static synthetic V(Lcom/join/mgps/fragment/EndGameDiscoveryFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/EndGameDiscoveryFragment;->a0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic W(Lcom/join/mgps/fragment/EndGameDiscoveryFragment;)Lcom/join/android/app/component/video/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/EndGameDiscoveryFragment;->e:Lcom/join/android/app/component/video/c;

    return-object p0
.end method

.method private a0(Ljava/lang/String;)V
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
    iget-object v1, p0, Lcom/join/mgps/fragment/EndGameDiscoveryFragment;->d:Lcom/join/mgps/dto/EndGameNameListBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/EndGameNameListBean;->getGameId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

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

    goto :goto_0

    :catch_0
    move-exception p1

    .line 6
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method


# virtual methods
.method X()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    new-instance v0, Lcom/join/android/app/component/video/c;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "EndGameDiscoveryFragment"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Lcom/join/mgps/fragment/EndGameDiscoveryFragment;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/join/android/app/component/video/c;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameDiscoveryFragment;->e:Lcom/join/android/app/component/video/c;

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameDiscoveryFragment;->b:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 3
    new-instance v0, Lcom/join/mgps/fragment/EndGameDiscoveryFragment$c;

    iget-object v1, p0, Lcom/join/mgps/fragment/EndGameDiscoveryFragment;->d:Lcom/join/mgps/dto/EndGameNameListBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/EndGameNameListBean;->getGameEndgameVo()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/join/mgps/fragment/EndGameDiscoveryFragment$c;-><init>(Lcom/join/mgps/fragment/EndGameDiscoveryFragment;Ljava/util/List;)V

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameDiscoveryFragment;->f:Lcom/join/mgps/fragment/EndGameDiscoveryFragment$c;

    .line 4
    iget-object v1, p0, Lcom/join/mgps/fragment/EndGameDiscoveryFragment;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameDiscoveryFragment;->b:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameDiscoveryFragment;->f:Lcom/join/mgps/fragment/EndGameDiscoveryFragment$c;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    const v3, 0x7f0c0221

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/base/BaseQuickAdapter;->setEmptyView(Landroid/view/View;)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameDiscoveryFragment;->f:Lcom/join/mgps/fragment/EndGameDiscoveryFragment$c;

    new-instance v1, Lcom/join/mgps/fragment/EndGameDiscoveryFragment$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/EndGameDiscoveryFragment$a;-><init>(Lcom/join/mgps/fragment/EndGameDiscoveryFragment;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/base/BaseQuickAdapter;->setOnItemClickListener(Lcom/join/mgps/base/BaseQuickAdapter$j;)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameDiscoveryFragment;->b:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Lcom/join/mgps/fragment/EndGameDiscoveryFragment$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/EndGameDiscoveryFragment$b;-><init>(Lcom/join/mgps/fragment/EndGameDiscoveryFragment;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

    .line 9
    invoke-virtual {p0}, Lcom/join/mgps/fragment/EndGameDiscoveryFragment;->Z()V

    return-void
.end method

.method Z()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/UiThread;
        delay = 0x1f4L
    .end annotation

    return-void
.end method

.method public b0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameDiscoveryFragment;->e:Lcom/join/android/app/component/video/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/android/app/component/video/c;->I()V

    :cond_0
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
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameDiscoveryFragment;->e:Lcom/join/android/app/component/video/c;

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
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameDiscoveryFragment;->e:Lcom/join/android/app/component/video/c;

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
    invoke-virtual {p0}, Lcom/join/mgps/fragment/EndGameDiscoveryFragment;->b0()V

    return-void
.end method

.method public setUserVisibleHint(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->setUserVisibleHint(Z)V

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/fragment/EndGameDiscoveryFragment;->b0()V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/EndGameDiscoveryFragment;->e:Lcom/join/android/app/component/video/c;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/join/android/app/component/video/c;->H()V

    :cond_1
    :goto_0
    return-void
.end method

.method showTost(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method
