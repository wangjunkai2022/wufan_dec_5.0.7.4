.class public final Lcom/join/mgps/fragment/UserCenterFragment_;
.super Lcom/join/mgps/fragment/UserCenterFragment;
.source "UserCenterFragment_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/UserCenterFragment_$o;
    }
.end annotation


# instance fields
.field private final A:La4/c;

.field private B:Landroid/view/View;

.field private final C:Ljava/util/Map;
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

.field private final D:Landroid/content/IntentFilter;

.field private final E:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/fragment/UserCenterFragment;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/UserCenterFragment_;->A:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/UserCenterFragment_;->C:Ljava/util/Map;

    .line 4
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/UserCenterFragment_;->D:Landroid/content/IntentFilter;

    .line 5
    new-instance v0, Lcom/join/mgps/fragment/UserCenterFragment_$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/UserCenterFragment_$f;-><init>(Lcom/join/mgps/fragment/UserCenterFragment_;)V

    iput-object v0, p0, Lcom/join/mgps/fragment/UserCenterFragment_;->E:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic b0(Lcom/join/mgps/fragment/UserCenterFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/UserCenterFragment;->refreshViews()V

    return-void
.end method

.method static synthetic c0(Lcom/join/mgps/fragment/UserCenterFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/UserCenterFragment;->getUserInfo()V

    return-void
.end method

.method static synthetic d0(Lcom/join/mgps/fragment/UserCenterFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/UserCenterFragment;->showNotifUi()V

    return-void
.end method

.method static synthetic e0(Lcom/join/mgps/fragment/UserCenterFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/UserCenterFragment;->pullMyProfileInfo()V

    return-void
.end method

.method static synthetic f0(Lcom/join/mgps/fragment/UserCenterFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/UserCenterFragment;->loadViewConfigsFromLocal()V

    return-void
.end method

.method static synthetic g0(Lcom/join/mgps/fragment/UserCenterFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/UserCenterFragment;->hideRedPoint()V

    return-void
.end method

.method static synthetic h0(Lcom/join/mgps/fragment/UserCenterFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/UserCenterFragment;->tokenFailure()V

    return-void
.end method

.method static synthetic i0(Lcom/join/mgps/fragment/UserCenterFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/UserCenterFragment;->showToast(Ljava/lang/String;)V

    return-void
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/join/mgps/fragment/UserCenterFragment;->u:Lcom/join/mgps/pref/PrefDef_;

    .line 2
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/fragment/UserCenterFragment_;->D:Landroid/content/IntentFilter;

    const-string v0, "com.join.android.app.mgsim.wufun.broadcast.account_status_uidchange"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic j0(Lcom/join/mgps/fragment/UserCenterFragment_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/UserCenterFragment;->updateAdapterByNewMsgCount(I)V

    return-void
.end method

.method static synthetic k0(Lcom/join/mgps/fragment/UserCenterFragment_;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/fragment/UserCenterFragment;->changeMgState(Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic l0(Lcom/join/mgps/fragment/UserCenterFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/UserCenterFragment;->touristLogin()V

    return-void
.end method

.method static synthetic m0(Lcom/join/mgps/fragment/UserCenterFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/UserCenterFragment;->getViewConfigs()V

    return-void
.end method

.method public static n0()Lcom/join/mgps/fragment/UserCenterFragment_$o;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/UserCenterFragment_$o;

    invoke-direct {v0}, Lcom/join/mgps/fragment/UserCenterFragment_$o;-><init>()V

    return-object v0
.end method


# virtual methods
.method changeMgState(Ljava/lang/String;I)V
    .locals 9

    .line 1
    new-instance v8, Lcom/join/mgps/fragment/UserCenterFragment_$a;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v8

    move-object v1, p0

    move-object v6, p1

    move v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/join/mgps/fragment/UserCenterFragment_$a;-><init>(Lcom/join/mgps/fragment/UserCenterFragment_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;I)V

    invoke-static {v8}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/UserCenterFragment_;->C:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method getUserInfo()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/UserCenterFragment_$d;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/UserCenterFragment_$d;-><init>(Lcom/join/mgps/fragment/UserCenterFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method getViewConfigs()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/UserCenterFragment_$c;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/UserCenterFragment_$c;-><init>(Lcom/join/mgps/fragment/UserCenterFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method hideRedPoint()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/UserCenterFragment_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/UserCenterFragment_$k;-><init>(Lcom/join/mgps/fragment/UserCenterFragment_;)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/UserCenterFragment_;->B:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method loadViewConfigsFromLocal()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/UserCenterFragment_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/UserCenterFragment_$j;-><init>(Lcom/join/mgps/fragment/UserCenterFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/UserCenterFragment_;->A:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/UserCenterFragment_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/fragment/UserCenterFragment_;->E:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lcom/join/mgps/fragment/UserCenterFragment_;->D:Landroid/content/IntentFilter;

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

    iput-object p3, p0, Lcom/join/mgps/fragment/UserCenterFragment_;->B:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c02a5

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/UserCenterFragment_;->B:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/UserCenterFragment_;->B:Landroid/view/View;

    return-object p1
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/UserCenterFragment_;->E:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 2
    invoke-super {p0}, Lcom/join/mgps/fragment/UserCenterFragment;->onDestroy()V

    return-void
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/fragment/UserCenterFragment_;->B:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/fragment/UserCenterFragment;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/fragment/UserCenterFragment;->c:Landroid/widget/ImageView;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/fragment/UserCenterFragment;->d:Landroid/widget/TextView;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/fragment/UserCenterFragment;->e:Landroid/widget/ImageView;

    .line 7
    iput-object v0, p0, Lcom/join/mgps/fragment/UserCenterFragment;->f:Landroid/widget/TextView;

    .line 8
    iput-object v0, p0, Lcom/join/mgps/fragment/UserCenterFragment;->g:Landroid/widget/TextView;

    .line 9
    iput-object v0, p0, Lcom/join/mgps/fragment/UserCenterFragment;->h:Landroid/widget/TextView;

    .line 10
    iput-object v0, p0, Lcom/join/mgps/fragment/UserCenterFragment;->i:Landroid/widget/TextView;

    .line 11
    iput-object v0, p0, Lcom/join/mgps/fragment/UserCenterFragment;->j:Landroid/widget/TextView;

    .line 12
    iput-object v0, p0, Lcom/join/mgps/fragment/UserCenterFragment;->k:Landroid/widget/LinearLayout;

    .line 13
    iput-object v0, p0, Lcom/join/mgps/fragment/UserCenterFragment;->l:Landroid/widget/LinearLayout;

    .line 14
    iput-object v0, p0, Lcom/join/mgps/fragment/UserCenterFragment;->m:Landroid/widget/LinearLayout;

    .line 15
    iput-object v0, p0, Lcom/join/mgps/fragment/UserCenterFragment;->n:Landroid/widget/GridView;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 1

    const v0, 0x7f090979

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/join/mgps/fragment/UserCenterFragment;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f09090a

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/fragment/UserCenterFragment;->c:Landroid/widget/ImageView;

    const v0, 0x7f0916a8

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/UserCenterFragment;->d:Landroid/widget/TextView;

    const v0, 0x7f09097b

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/fragment/UserCenterFragment;->e:Landroid/widget/ImageView;

    const v0, 0x7f0916a9

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/UserCenterFragment;->f:Landroid/widget/TextView;

    const v0, 0x7f0916a5

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/UserCenterFragment;->g:Landroid/widget/TextView;

    const v0, 0x7f0916a6

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/UserCenterFragment;->h:Landroid/widget/TextView;

    const v0, 0x7f0916a7

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/UserCenterFragment;->i:Landroid/widget/TextView;

    const v0, 0x7f0916aa

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/UserCenterFragment;->j:Landroid/widget/TextView;

    const v0, 0x7f090d43

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/UserCenterFragment;->k:Landroid/widget/LinearLayout;

    const v0, 0x7f090d32

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/UserCenterFragment;->l:Landroid/widget/LinearLayout;

    const v0, 0x7f090d07

    .line 12
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/UserCenterFragment;->m:Landroid/widget/LinearLayout;

    const v0, 0x7f090da8

    .line 13
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/GridView;

    iput-object v0, p0, Lcom/join/mgps/fragment/UserCenterFragment;->n:Landroid/widget/GridView;

    const v0, 0x7f090ce4

    .line 14
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 15
    new-instance v0, Lcom/join/mgps/fragment/UserCenterFragment_$g;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/UserCenterFragment_$g;-><init>(Lcom/join/mgps/fragment/UserCenterFragment_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 16
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/fragment/UserCenterFragment;->afterViews()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/UserCenterFragment_;->A:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method pullMyProfileInfo()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/UserCenterFragment_$e;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/UserCenterFragment_$e;-><init>(Lcom/join/mgps/fragment/UserCenterFragment_;Ljava/lang/String;JLjava/lang/String;)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/UserCenterFragment_;->C:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method refreshViews()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/UserCenterFragment_$h;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/UserCenterFragment_$h;-><init>(Lcom/join/mgps/fragment/UserCenterFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showNotifUi()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/UserCenterFragment_$i;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/UserCenterFragment_$i;-><init>(Lcom/join/mgps/fragment/UserCenterFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showToast(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/UserCenterFragment_$m;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/UserCenterFragment_$m;-><init>(Lcom/join/mgps/fragment/UserCenterFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method tokenFailure()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/UserCenterFragment_$l;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/UserCenterFragment_$l;-><init>(Lcom/join/mgps/fragment/UserCenterFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method touristLogin()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/UserCenterFragment_$b;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/UserCenterFragment_$b;-><init>(Lcom/join/mgps/fragment/UserCenterFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method updateAdapterByNewMsgCount(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/UserCenterFragment_$n;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/UserCenterFragment_$n;-><init>(Lcom/join/mgps/fragment/UserCenterFragment_;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
