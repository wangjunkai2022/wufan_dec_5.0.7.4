.class public final Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;
.super Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;
.source "PapaMainV4SubHomeFragment_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$r;
    }
.end annotation


# instance fields
.field private final B:La4/c;

.field private C:Landroid/view/View;

.field private final D:Ljava/util/Map;
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

.field private final E:Landroid/content/IntentFilter;

.field private final F:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;->B:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;->D:Ljava/util/Map;

    .line 4
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;->E:Landroid/content/IntentFilter;

    .line 5
    new-instance v0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$i;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$i;-><init>(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;)V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;->F:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic P0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;Lcom/join/mgps/dto/PapaHomeBeanV9;IZ)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->I0(Lcom/join/mgps/dto/PapaHomeBeanV9;IZ)V

    return-void
.end method

.method static synthetic Q0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->w0(I)V

    return-void
.end method

.method static synthetic R0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->x0()V

    return-void
.end method

.method static synthetic S0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;Lcom/join/mgps/dto/PapaHomeBeanV9;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->C0(Lcom/join/mgps/dto/PapaHomeBeanV9;)V

    return-void
.end method

.method static synthetic T0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->n0()V

    return-void
.end method

.method static synthetic U0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->J0()V

    return-void
.end method

.method static synthetic V0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->showLoding()V

    return-void
.end method

.method static synthetic W0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->showLodingFailed()V

    return-void
.end method

.method static synthetic X0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->showMain()V

    return-void
.end method

.method static synthetic Y0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;Lcom/join/mgps/dto/HomeFloatData;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->G0(Lcom/join/mgps/dto/HomeFloatData;)V

    return-void
.end method

.method static synthetic Z0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->s0()V

    return-void
.end method

.method static synthetic a1(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->r0()V

    return-void
.end method

.method static synthetic b1(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->v0()V

    return-void
.end method

.method public static c1()Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$r;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$r;

    invoke-direct {v0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$r;-><init>()V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->g:Lcom/join/mgps/pref/PrefDef_;

    .line 2
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;->E:Landroid/content/IntentFilter;

    const-string v0, "com.join.android.app.mgsim.wufun.broadcast.account_status_uidchange"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method C0(Lcom/join/mgps/dto/PapaHomeBeanV9;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$g;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$g;-><init>(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;Ljava/lang/String;JLjava/lang/String;Lcom/join/mgps/dto/PapaHomeBeanV9;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method G0(Lcom/join/mgps/dto/HomeFloatData;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$b;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$b;-><init>(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;Lcom/join/mgps/dto/HomeFloatData;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method I0(Lcom/join/mgps/dto/PapaHomeBeanV9;IZ)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$m;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$m;-><init>(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;Lcom/join/mgps/dto/PapaHomeBeanV9;IZ)V

    const-string p1, ""

    const-wide/16 p2, 0x0

    invoke-static {p1, v0, p2, p3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method J0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$o;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$o;-><init>(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;->D:Ljava/util/Map;

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
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;->C:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method n0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$h;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$h;-><init>(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;->B:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;->F:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;->E:Landroid/content/IntentFilter;

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

    iput-object p3, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;->C:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c0636

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;->C:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;->C:Landroid/view/View;

    return-object p1
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;->F:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 2
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->onDestroy()V

    return-void
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;->C:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->b:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->c:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->d:Landroid/widget/LinearLayout;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->e:Landroid/widget/LinearLayout;

    .line 7
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->f:Lcom/facebook/drawee/view/SimpleDraweeView;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 2

    const v0, 0x7f0910e9

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->b:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    const v0, 0x7f091068

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->c:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    const v0, 0x7f090d82

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->d:Landroid/widget/LinearLayout;

    const v0, 0x7f090d7f

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->e:Landroid/widget/LinearLayout;

    const v0, 0x7f0908e3

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->f:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f09110c

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f091261

    .line 7
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz v0, :cond_0

    .line 8
    new-instance v1, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$j;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$j;-><init>(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz p1, :cond_1

    .line 9
    new-instance v0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$k;-><init>(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->f:Lcom/facebook/drawee/view/SimpleDraweeView;

    if-eqz p1, :cond_2

    .line 11
    new-instance v0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$l;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$l;-><init>(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->afterViews()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;->B:La4/c;

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
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;->D:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method r0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$d;-><init>(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method s0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$c;-><init>(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLoding()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$p;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$p;-><init>(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLodingFailed()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$q;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$q;-><init>(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showMain()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$a;-><init>(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method v0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$e;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$e;-><init>(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method w0(I)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$f;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$f;-><init>(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;Ljava/lang/String;JLjava/lang/String;I)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method x0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$n;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_$n;-><init>(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
