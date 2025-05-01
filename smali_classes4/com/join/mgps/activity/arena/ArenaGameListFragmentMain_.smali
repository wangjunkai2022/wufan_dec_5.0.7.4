.class public final Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_;
.super Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;
.source "ArenaGameListFragmentMain_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_$l;
    }
.end annotation


# instance fields
.field private A:Landroid/view/View;

.field private final B:Ljava/util/Map;
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

.field private final z:La4/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_;->z:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_;->B:Ljava/util/Map;

    return-void
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;->m:Lcom/join/mgps/Util/b;

    return-void
.end method

.method static synthetic k0(Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;->j0(Ljava/util/List;)V

    return-void
.end method

.method static synthetic l0(Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_;Lcom/join/mgps/dto/ResultResMainBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;->c0(Lcom/join/mgps/dto/ResultResMainBean;)V

    return-void
.end method

.method static synthetic m0(Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;->i0()V

    return-void
.end method

.method static synthetic n0(Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;->h0()V

    return-void
.end method

.method static synthetic o0(Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;->hideLoading()V

    return-void
.end method

.method static synthetic p0(Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;->e0()V

    return-void
.end method

.method static synthetic q0(Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;->g0()V

    return-void
.end method

.method static synthetic r0(Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;->f0()V

    return-void
.end method

.method public static s0()Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_$l;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_$l;

    invoke-direct {v0}, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_$l;-><init>()V

    return-object v0
.end method


# virtual methods
.method c0(Lcom/join/mgps/dto/ResultResMainBean;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/ResultResMainBean<",
            "Lcom/join/mgps/dto/NewArenaGameListBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_$g;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_$g;-><init>(Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_;Lcom/join/mgps/dto/ResultResMainBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method e0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_$k;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_$k;-><init>(Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method f0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_$b;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_$b;-><init>(Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method g0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_$a;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_$a;-><init>(Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_;->B:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method h0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_$i;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_$i;-><init>(Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method hideLoading()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_$j;-><init>(Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_;)V

    const-string v1, ""

    const-wide/16 v2, 0xc8

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method i0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_$h;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_$h;-><init>(Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_;->A:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method j0(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/GameInfoBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_$f;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_$f;-><init>(Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_;Ljava/util/List;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_;->z:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p3

    iput-object p3, p0, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_;->A:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c0024

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_;->A:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_;->A:Landroid/view/View;

    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_;->A:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;->d:Landroid/widget/LinearLayout;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;->e:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;->h:Landroid/widget/LinearLayout;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;->i:Landroid/widget/RelativeLayout;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 3

    const v0, 0x7f090d82

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;->d:Landroid/widget/LinearLayout;

    const v0, 0x7f090c97

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;->e:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    const v0, 0x7f090d7f

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;->h:Landroid/widget/LinearLayout;

    const v0, 0x7f090c44

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;->i:Landroid/widget/RelativeLayout;

    const v0, 0x7f090146

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f09110c

    .line 6
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f091261

    .line 7
    invoke-interface {p1, v2}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz v0, :cond_0

    .line 8
    new-instance v2, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_$c;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_$c;-><init>(Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz v1, :cond_1

    .line 9
    new-instance v0, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_$d;-><init>(Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    if-eqz p1, :cond_2

    .line 10
    new-instance v0, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_$e;-><init>(Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 11
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;->afterViews()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_;->z:La4/c;

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
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain_;->B:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
