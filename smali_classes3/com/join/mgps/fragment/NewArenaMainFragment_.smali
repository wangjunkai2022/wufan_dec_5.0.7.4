.class public final Lcom/join/mgps/fragment/NewArenaMainFragment_;
.super Lcom/join/mgps/fragment/NewArenaMainFragment;
.source "NewArenaMainFragment_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/NewArenaMainFragment_$w;
    }
.end annotation


# instance fields
.field private final B1:La4/c;

.field private C1:Landroid/view/View;

.field private final D1:Ljava/util/Map;
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


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/fragment/NewArenaMainFragment;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment_;->B1:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment_;->D1:Ljava/util/Map;

    return-void
.end method

.method static synthetic U0(Lcom/join/mgps/fragment/NewArenaMainFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/NewArenaMainFragment;->s0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic V0(Lcom/join/mgps/fragment/NewArenaMainFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/NewArenaMainFragment;->C0()V

    return-void
.end method

.method static synthetic W0(Lcom/join/mgps/fragment/NewArenaMainFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/NewArenaMainFragment;->R0()V

    return-void
.end method

.method static synthetic X0(Lcom/join/mgps/fragment/NewArenaMainFragment_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/NewArenaMainFragment;->J0(Ljava/util/List;)V

    return-void
.end method

.method static synthetic Y0(Lcom/join/mgps/fragment/NewArenaMainFragment_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/NewArenaMainFragment;->K0(Ljava/util/List;)V

    return-void
.end method

.method static synthetic Z0(Lcom/join/mgps/fragment/NewArenaMainFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/NewArenaMainFragment;->showLoding()V

    return-void
.end method

.method static synthetic a1(Lcom/join/mgps/fragment/NewArenaMainFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/NewArenaMainFragment;->showLodingFailed()V

    return-void
.end method

.method static synthetic b1(Lcom/join/mgps/fragment/NewArenaMainFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/NewArenaMainFragment;->showToast(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic c1(Lcom/join/mgps/fragment/NewArenaMainFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/NewArenaMainFragment;->p0()V

    return-void
.end method

.method static synthetic d1(Lcom/join/mgps/fragment/NewArenaMainFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/NewArenaMainFragment;->H0()V

    return-void
.end method

.method static synthetic e1(Lcom/join/mgps/fragment/NewArenaMainFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/NewArenaMainFragment;->q0()V

    return-void
.end method

.method static synthetic f1(Lcom/join/mgps/fragment/NewArenaMainFragment_;Lapp/mgsim/arena/ArenaResponse;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/NewArenaMainFragment;->A0(Lapp/mgsim/arena/ArenaResponse;)V

    return-void
.end method

.method static synthetic g1(Lcom/join/mgps/fragment/NewArenaMainFragment_;Lcom/papa91/battle/protocol/GameRoom;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/NewArenaMainFragment;->B0(Lcom/papa91/battle/protocol/GameRoom;)V

    return-void
.end method

.method static synthetic h1(Lcom/join/mgps/fragment/NewArenaMainFragment_;Lcom/papa91/battle/protocol/GameRoom;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/fragment/NewArenaMainFragment;->r0(Lcom/papa91/battle/protocol/GameRoom;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic i1(Lcom/join/mgps/fragment/NewArenaMainFragment_;Lcom/papa91/battle/protocol/GameRoom;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/NewArenaMainFragment;->P0(Lcom/papa91/battle/protocol/GameRoom;)V

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

    iput-object p1, p0, Lcom/join/mgps/fragment/NewArenaMainFragment;->p:Lcom/join/mgps/Util/b;

    return-void
.end method

.method static synthetic j1(Lcom/join/mgps/fragment/NewArenaMainFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/NewArenaMainFragment;->y0()V

    return-void
.end method

.method static synthetic k1(Lcom/join/mgps/fragment/NewArenaMainFragment_;Lcom/join/mgps/dto/GameListBannerBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/NewArenaMainFragment;->L0(Lcom/join/mgps/dto/GameListBannerBean;)V

    return-void
.end method

.method static synthetic l1(Lcom/join/mgps/fragment/NewArenaMainFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/NewArenaMainFragment;->z0()V

    return-void
.end method

.method public static m1()Lcom/join/mgps/fragment/NewArenaMainFragment_$w;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/NewArenaMainFragment_$w;

    invoke-direct {v0}, Lcom/join/mgps/fragment/NewArenaMainFragment_$w;-><init>()V

    return-object v0
.end method


# virtual methods
.method A0(Lapp/mgsim/arena/ArenaResponse;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/NewArenaMainFragment_$u;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/NewArenaMainFragment_$u;-><init>(Lcom/join/mgps/fragment/NewArenaMainFragment_;Lapp/mgsim/arena/ArenaResponse;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method B0(Lcom/papa91/battle/protocol/GameRoom;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/NewArenaMainFragment_$v;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/NewArenaMainFragment_$v;-><init>(Lcom/join/mgps/fragment/NewArenaMainFragment_;Lcom/papa91/battle/protocol/GameRoom;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method C0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/NewArenaMainFragment_$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/NewArenaMainFragment_$f;-><init>(Lcom/join/mgps/fragment/NewArenaMainFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method H0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/NewArenaMainFragment_$n;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/NewArenaMainFragment_$n;-><init>(Lcom/join/mgps/fragment/NewArenaMainFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method J0(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/BannerBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/NewArenaMainFragment_$g;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/NewArenaMainFragment_$g;-><init>(Lcom/join/mgps/fragment/NewArenaMainFragment_;Ljava/util/List;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method K0(Ljava/util/List;)V
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
    new-instance v0, Lcom/join/mgps/fragment/NewArenaMainFragment_$h;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/NewArenaMainFragment_$h;-><init>(Lcom/join/mgps/fragment/NewArenaMainFragment_;Ljava/util/List;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method L0(Lcom/join/mgps/dto/GameListBannerBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/NewArenaMainFragment_$d;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/NewArenaMainFragment_$d;-><init>(Lcom/join/mgps/fragment/NewArenaMainFragment_;Lcom/join/mgps/dto/GameListBannerBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method P0(Lcom/papa91/battle/protocol/GameRoom;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/NewArenaMainFragment_$b;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/NewArenaMainFragment_$b;-><init>(Lcom/join/mgps/fragment/NewArenaMainFragment_;Lcom/papa91/battle/protocol/GameRoom;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method R0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/NewArenaMainFragment_$s;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/NewArenaMainFragment_$s;-><init>(Lcom/join/mgps/fragment/NewArenaMainFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment_;->D1:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
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
    iget-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment_;->C1:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment_;->B1:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/NewArenaMainFragment_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/fragment/NewArenaMainFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p3

    iput-object p3, p0, Lcom/join/mgps/fragment/NewArenaMainFragment_;->C1:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c028e

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/NewArenaMainFragment_;->C1:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/NewArenaMainFragment_;->C1:Landroid/view/View;

    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/NewArenaMainFragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment_;->C1:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment;->e:Landroid/widget/LinearLayout;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment;->f:Landroid/widget/LinearLayout;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment;->g:Landroid/widget/LinearLayout;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment;->h:Landroid/widget/LinearLayout;

    .line 7
    iput-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment;->i:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    .line 8
    iput-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment;->j:Landroid/view/View;

    .line 9
    iput-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment;->k:Landroid/widget/LinearLayout;

    .line 10
    iput-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment;->l:Landroid/widget/FrameLayout;

    .line 11
    iput-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment;->n:Landroid/view/View;

    .line 12
    iput-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment;->o:Landroid/view/View;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 2

    const v0, 0x7f091212

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment;->e:Landroid/widget/LinearLayout;

    const v0, 0x7f090d82

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment;->f:Landroid/widget/LinearLayout;

    const v0, 0x7f090d7f

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment;->g:Landroid/widget/LinearLayout;

    const v0, 0x7f090754

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment;->h:Landroid/widget/LinearLayout;

    const v0, 0x7f090c97

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    iput-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment;->i:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    const v0, 0x7f090e93

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment;->j:Landroid/view/View;

    const v0, 0x7f091251

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment;->k:Landroid/widget/LinearLayout;

    const v0, 0x7f090615

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment;->l:Landroid/widget/FrameLayout;

    const v0, 0x7f090d05

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment;->n:Landroid/view/View;

    const v0, 0x7f0910ed

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment;->o:Landroid/view/View;

    const v0, 0x7f091261

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f09110c

    .line 12
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz v0, :cond_0

    .line 13
    new-instance v1, Lcom/join/mgps/fragment/NewArenaMainFragment_$k;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/NewArenaMainFragment_$k;-><init>(Lcom/join/mgps/fragment/NewArenaMainFragment_;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz p1, :cond_1

    .line 14
    new-instance v0, Lcom/join/mgps/fragment/NewArenaMainFragment_$o;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/NewArenaMainFragment_$o;-><init>(Lcom/join/mgps/fragment/NewArenaMainFragment_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/fragment/NewArenaMainFragment;->j:Landroid/view/View;

    if-eqz p1, :cond_2

    .line 16
    new-instance v0, Lcom/join/mgps/fragment/NewArenaMainFragment_$p;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/NewArenaMainFragment_$p;-><init>(Lcom/join/mgps/fragment/NewArenaMainFragment_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/fragment/NewArenaMainFragment;->e:Landroid/widget/LinearLayout;

    if-eqz p1, :cond_3

    .line 18
    new-instance v0, Lcom/join/mgps/fragment/NewArenaMainFragment_$q;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/NewArenaMainFragment_$q;-><init>(Lcom/join/mgps/fragment/NewArenaMainFragment_;)V

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    :cond_3
    invoke-virtual {p0}, Lcom/join/mgps/fragment/NewArenaMainFragment;->afterViews()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/NewArenaMainFragment_;->B1:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method p0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/NewArenaMainFragment_$m;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/NewArenaMainFragment_$m;-><init>(Lcom/join/mgps/fragment/NewArenaMainFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment_;->D1:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method q0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/NewArenaMainFragment_$t;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/NewArenaMainFragment_$t;-><init>(Lcom/join/mgps/fragment/NewArenaMainFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method r0(Lcom/papa91/battle/protocol/GameRoom;Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/NewArenaMainFragment_$a;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/fragment/NewArenaMainFragment_$a;-><init>(Lcom/join/mgps/fragment/NewArenaMainFragment_;Lcom/papa91/battle/protocol/GameRoom;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method s0(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/NewArenaMainFragment_$r;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/NewArenaMainFragment_$r;-><init>(Lcom/join/mgps/fragment/NewArenaMainFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLoding()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/NewArenaMainFragment_$i;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/NewArenaMainFragment_$i;-><init>(Lcom/join/mgps/fragment/NewArenaMainFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLodingFailed()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/NewArenaMainFragment_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/NewArenaMainFragment_$j;-><init>(Lcom/join/mgps/fragment/NewArenaMainFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showToast(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/NewArenaMainFragment_$l;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/NewArenaMainFragment_$l;-><init>(Lcom/join/mgps/fragment/NewArenaMainFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method y0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/NewArenaMainFragment_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/NewArenaMainFragment_$c;-><init>(Lcom/join/mgps/fragment/NewArenaMainFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x1f4

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method z0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/NewArenaMainFragment_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/NewArenaMainFragment_$e;-><init>(Lcom/join/mgps/fragment/NewArenaMainFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
