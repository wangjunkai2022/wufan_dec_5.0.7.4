.class public final Lcom/join/mgps/fragment/DiscoveryFragmentV2_;
.super Lcom/join/mgps/fragment/DiscoveryFragmentV2;
.source "DiscoveryFragmentV2_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/DiscoveryFragmentV2_$k;
    }
.end annotation


# instance fields
.field private final D:La4/c;

.field private E:Landroid/view/View;

.field private final F:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final G:Landroid/content/IntentFilter;

.field private final H:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV2;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2_;->D:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2_;->F:Ljava/util/Map;

    .line 4
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2_;->G:Landroid/content/IntentFilter;

    .line 5
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryFragmentV2_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV2_$b;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV2_;)V

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2_;->H:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic i0(Lcom/join/mgps/fragment/DiscoveryFragmentV2_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->d0()V

    return-void
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->s:Lcom/join/mgps/Util/b;

    .line 3
    iget-object p1, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2_;->G:Landroid/content/IntentFilter;

    const-string v0, "com.join.update.position"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic j0(Lcom/join/mgps/fragment/DiscoveryFragmentV2_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->h0(Ljava/util/List;)V

    return-void
.end method

.method static synthetic k0(Lcom/join/mgps/fragment/DiscoveryFragmentV2_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->f0()V

    return-void
.end method

.method static synthetic l0(Lcom/join/mgps/fragment/DiscoveryFragmentV2_;Lcom/join/mgps/dto/DiscoveryMainDataBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->g0(Lcom/join/mgps/dto/DiscoveryMainDataBean;)V

    return-void
.end method

.method static synthetic m0(Lcom/join/mgps/fragment/DiscoveryFragmentV2_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->b0()V

    return-void
.end method

.method static synthetic n0(Lcom/join/mgps/fragment/DiscoveryFragmentV2_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->loadData()V

    return-void
.end method

.method public static o0()Lcom/join/mgps/fragment/DiscoveryFragmentV2_$k;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryFragmentV2_$k;

    invoke-direct {v0}, Lcom/join/mgps/fragment/DiscoveryFragmentV2_$k;-><init>()V

    return-object v0
.end method


# virtual methods
.method b0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/DiscoveryFragmentV2_$j;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/DiscoveryFragmentV2_$j;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV2_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method d0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryFragmentV2_$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV2_$f;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV2_;)V

    const-string v1, ""

    const-wide/16 v2, 0x3e8

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method f0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryFragmentV2_$h;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV2_$h;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV2_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method g0(Lcom/join/mgps/dto/DiscoveryMainDataBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryFragmentV2_$i;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/DiscoveryFragmentV2_$i;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV2_;Lcom/join/mgps/dto/DiscoveryMainDataBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public getBean(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2_;->F:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method h0(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/DIscoverTypeBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryFragmentV2_$g;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/DiscoveryFragmentV2_$g;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV2_;Ljava/util/List;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public internalFindViewById(I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2_;->E:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method loadData()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/DiscoveryFragmentV2_$a;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/DiscoveryFragmentV2_$a;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV2_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2_;->D:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/DiscoveryFragmentV2_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2_;->H:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2_;->G:Landroid/content/IntentFilter;

    invoke-virtual {p1, v1, v2}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 5
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p3

    iput-object p3, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2_;->E:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c020f

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2_;->E:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2_;->E:Landroid/view/View;

    return-object p1
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2_;->H:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 2
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    return-void
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2_;->E:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->b:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->c:Landroid/widget/LinearLayout;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->d:Landroid/widget/LinearLayout;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->e:Lcom/join/mgps/customview/ViewPagerSlide;

    .line 7
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->f:Landroidx/appcompat/widget/Toolbar;

    .line 8
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->g:Lcom/flyco/tablayout/SlidingTabLayout;

    .line 9
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->h:Lcom/google/android/material/appbar/AppBarLayout;

    .line 10
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->i:Landroid/widget/RelativeLayout;

    .line 11
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->j:Landroid/widget/GridView;

    .line 12
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->k:Lit/sephiroth/android/library/widget/HListView;

    .line 13
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->l:Landroid/widget/TextView;

    .line 14
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->m:Landroidx/core/widget/NestedScrollView;

    .line 15
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->n:Landroid/widget/LinearLayout;

    .line 16
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->o:Landroid/widget/TextView;

    .line 17
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->p:Landroid/widget/TextView;

    .line 18
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->q:Landroid/widget/TextView;

    .line 19
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->r:Landroid/widget/TextView;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 3

    const v0, 0x7f090db3

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->b:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    const v0, 0x7f090d82

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->c:Landroid/widget/LinearLayout;

    const v0, 0x7f090d7f

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->d:Landroid/widget/LinearLayout;

    const v0, 0x7f0917c8

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/ViewPagerSlide;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->e:Lcom/join/mgps/customview/ViewPagerSlide;

    const v0, 0x7f0914a2

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->f:Landroidx/appcompat/widget/Toolbar;

    const v0, 0x7f091361

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/flyco/tablayout/SlidingTabLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->g:Lcom/flyco/tablayout/SlidingTabLayout;

    const v0, 0x7f0900ff

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/appbar/AppBarLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->h:Lcom/google/android/material/appbar/AppBarLayout;

    const v0, 0x7f090442

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->i:Landroid/widget/RelativeLayout;

    const v0, 0x7f090441

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/GridView;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->j:Landroid/widget/GridView;

    const v0, 0x7f09043b

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lit/sephiroth/android/library/widget/HListView;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->k:Lit/sephiroth/android/library/widget/HListView;

    const v0, 0x7f091494

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->l:Landroid/widget/TextView;

    const v0, 0x7f0901d8

    .line 12
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/core/widget/NestedScrollView;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->m:Landroidx/core/widget/NestedScrollView;

    const v0, 0x7f091492

    .line 13
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->n:Landroid/widget/LinearLayout;

    const v0, 0x7f091493

    .line 14
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->o:Landroid/widget/TextView;

    const v0, 0x7f090f41

    .line 15
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->p:Landroid/widget/TextView;

    const v0, 0x7f090f3c

    .line 16
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->q:Landroid/widget/TextView;

    const v0, 0x7f0914a6

    .line 17
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->r:Landroid/widget/TextView;

    const v0, 0x7f09110c

    .line 18
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f091261

    .line 19
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    .line 20
    iget-object v1, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->q:Landroid/widget/TextView;

    if-eqz v1, :cond_0

    .line 21
    new-instance v2, Lcom/join/mgps/fragment/DiscoveryFragmentV2_$c;

    invoke-direct {v2, p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV2_$c;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV2_;)V

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz v0, :cond_1

    .line 22
    new-instance v1, Lcom/join/mgps/fragment/DiscoveryFragmentV2_$d;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV2_$d;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV2_;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    if-eqz p1, :cond_2

    .line 23
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryFragmentV2_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV2_$e;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV2_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 24
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV2;->afterView()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2_;->D:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public putBean(Ljava/lang/Class;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;TT;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV2_;->F:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
