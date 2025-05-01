.class public final Lcom/join/mgps/fragment/LabelFragment_;
.super Lcom/join/mgps/fragment/LabelFragment;
.source "LabelFragment_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/LabelFragment_$t;
    }
.end annotation


# instance fields
.field private final F:La4/c;

.field private G:Landroid/view/View;

.field private final H:Ljava/util/Map;
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

.field private final I:Landroid/content/IntentFilter;

.field private final J:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/fragment/LabelFragment;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/LabelFragment_;->F:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/LabelFragment_;->H:Ljava/util/Map;

    .line 4
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/LabelFragment_;->I:Landroid/content/IntentFilter;

    .line 5
    new-instance v0, Lcom/join/mgps/fragment/LabelFragment_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/LabelFragment_$k;-><init>(Lcom/join/mgps/fragment/LabelFragment_;)V

    iput-object v0, p0, Lcom/join/mgps/fragment/LabelFragment_;->J:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic J0(Lcom/join/mgps/fragment/LabelFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/LabelFragment;->E0()V

    return-void
.end method

.method static synthetic K0(Lcom/join/mgps/fragment/LabelFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/LabelFragment;->g0()V

    return-void
.end method

.method static synthetic L0(Lcom/join/mgps/fragment/LabelFragment_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/LabelFragment;->G0(Ljava/util/List;)V

    return-void
.end method

.method static synthetic M0(Lcom/join/mgps/fragment/LabelFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/LabelFragment;->y0()V

    return-void
.end method

.method static synthetic N0(Lcom/join/mgps/fragment/LabelFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/LabelFragment;->showMessage(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic O0(Lcom/join/mgps/fragment/LabelFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/LabelFragment;->d0()V

    return-void
.end method

.method static synthetic P0(Lcom/join/mgps/fragment/LabelFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/LabelFragment;->a0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic Q0(Lcom/join/mgps/fragment/LabelFragment_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/LabelFragment;->k0(I)V

    return-void
.end method

.method static synthetic R0(Lcom/join/mgps/fragment/LabelFragment_;Ljava/util/List;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/fragment/LabelFragment;->H0(Ljava/util/List;I)V

    return-void
.end method

.method static synthetic S0(Lcom/join/mgps/fragment/LabelFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/LabelFragment;->C0()V

    return-void
.end method

.method static synthetic T0(Lcom/join/mgps/fragment/LabelFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/LabelFragment;->A0()V

    return-void
.end method

.method static synthetic U0(Lcom/join/mgps/fragment/LabelFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/LabelFragment;->z0()V

    return-void
.end method

.method static synthetic V0(Lcom/join/mgps/fragment/LabelFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/LabelFragment;->hideLoading()V

    return-void
.end method

.method static synthetic W0(Lcom/join/mgps/fragment/LabelFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/LabelFragment;->B0()V

    return-void
.end method

.method static synthetic X0(Lcom/join/mgps/fragment/LabelFragment_;Lcom/join/mgps/dto/DetailResultBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/LabelFragment;->D0(Lcom/join/mgps/dto/DetailResultBean;)V

    return-void
.end method

.method static synthetic Y0(Lcom/join/mgps/fragment/LabelFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/LabelFragment;->showToast(Ljava/lang/String;)V

    return-void
.end method

.method public static Z0()Lcom/join/mgps/fragment/LabelFragment_$t;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/LabelFragment_$t;

    invoke-direct {v0}, Lcom/join/mgps/fragment/LabelFragment_$t;-><init>()V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/LabelFragment_;->I:Landroid/content/IntentFilter;

    const-string v0, "com.join.android.app.mgsim.wufun.broadcast.refreshMyGame"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/fragment/LabelFragment_;->I:Landroid/content/IntentFilter;

    const-string v0, "com.join.android.app.mgsim.wufun.broadcast.paygamefinish"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method A0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/LabelFragment_$r;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/LabelFragment_$r;-><init>(Lcom/join/mgps/fragment/LabelFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method B0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/LabelFragment_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/LabelFragment_$b;-><init>(Lcom/join/mgps/fragment/LabelFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method C0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/LabelFragment_$q;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/LabelFragment_$q;-><init>(Lcom/join/mgps/fragment/LabelFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method D0(Lcom/join/mgps/dto/DetailResultBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/LabelFragment_$c;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/LabelFragment_$c;-><init>(Lcom/join/mgps/fragment/LabelFragment_;Lcom/join/mgps/dto/DetailResultBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method E0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/LabelFragment_$n;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/LabelFragment_$n;-><init>(Lcom/join/mgps/fragment/LabelFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method G0(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/ForumBean$ForumPostsBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/LabelFragment_$o;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/LabelFragment_$o;-><init>(Lcom/join/mgps/fragment/LabelFragment_;Ljava/util/List;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method H0(Ljava/util/List;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/ForumBean$ForumPostsBean;",
            ">;I)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/LabelFragment_$p;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/fragment/LabelFragment_$p;-><init>(Lcom/join/mgps/fragment/LabelFragment_;Ljava/util/List;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method a0(Ljava/lang/String;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/fragment/LabelFragment_$i;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/fragment/LabelFragment_$i;-><init>(Lcom/join/mgps/fragment/LabelFragment_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method d0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/LabelFragment_$h;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/LabelFragment_$h;-><init>(Lcom/join/mgps/fragment/LabelFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method g0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/LabelFragment_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/LabelFragment_$e;-><init>(Lcom/join/mgps/fragment/LabelFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x1f4

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
    iget-object v0, p0, Lcom/join/mgps/fragment/LabelFragment_;->H:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method hideLoading()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/LabelFragment_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/LabelFragment_$a;-><init>(Lcom/join/mgps/fragment/LabelFragment_;)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/LabelFragment_;->G:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method k0(I)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/fragment/LabelFragment_$j;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/fragment/LabelFragment_$j;-><init>(Lcom/join/mgps/fragment/LabelFragment_;Ljava/lang/String;JLjava/lang/String;I)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/LabelFragment_;->F:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/LabelFragment_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/LabelFragment;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/fragment/LabelFragment_;->J:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lcom/join/mgps/fragment/LabelFragment_;->I:Landroid/content/IntentFilter;

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

    iput-object p3, p0, Lcom/join/mgps/fragment/LabelFragment_;->G:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c0274

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/LabelFragment_;->G:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/LabelFragment_;->G:Landroid/view/View;

    return-object p1
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/LabelFragment_;->J:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 2
    invoke-super {p0}, Lcom/join/mgps/fragment/LabelFragment;->onDestroy()V

    return-void
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/fragment/LabelFragment_;->G:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/fragment/LabelFragment;->h:Landroid/widget/LinearLayout;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/fragment/LabelFragment;->i:Landroid/widget/LinearLayout;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/fragment/LabelFragment;->j:Lcom/join/mgps/customview/XListView2;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/fragment/LabelFragment;->k:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    .line 7
    iput-object v0, p0, Lcom/join/mgps/fragment/LabelFragment;->u:Landroid/widget/ImageView;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 2

    const v0, 0x7f090d7f

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/LabelFragment;->h:Landroid/widget/LinearLayout;

    const v0, 0x7f090d82

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/LabelFragment;->i:Landroid/widget/LinearLayout;

    const v0, 0x7f090dad

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/XListView2;

    iput-object v0, p0, Lcom/join/mgps/fragment/LabelFragment;->j:Lcom/join/mgps/customview/XListView2;

    const v0, 0x7f090db3

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/LabelFragment;->k:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    const v0, 0x7f090953

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/fragment/LabelFragment;->u:Landroid/widget/ImageView;

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
    new-instance v1, Lcom/join/mgps/fragment/LabelFragment_$l;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/LabelFragment_$l;-><init>(Lcom/join/mgps/fragment/LabelFragment_;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz p1, :cond_1

    .line 9
    new-instance v0, Lcom/join/mgps/fragment/LabelFragment_$m;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/LabelFragment_$m;-><init>(Lcom/join/mgps/fragment/LabelFragment_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/LabelFragment;->afterViews()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/LabelFragment_;->F:La4/c;

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
    iget-object v0, p0, Lcom/join/mgps/fragment/LabelFragment_;->H:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method showMessage(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/LabelFragment_$g;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/LabelFragment_$g;-><init>(Lcom/join/mgps/fragment/LabelFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showToast(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/LabelFragment_$d;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/LabelFragment_$d;-><init>(Lcom/join/mgps/fragment/LabelFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method y0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/LabelFragment_$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/LabelFragment_$f;-><init>(Lcom/join/mgps/fragment/LabelFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method z0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/LabelFragment_$s;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/LabelFragment_$s;-><init>(Lcom/join/mgps/fragment/LabelFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
