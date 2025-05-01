.class public final Lcom/join/mgps/activity/MyGamePapaLocalFragment_;
.super Lcom/join/mgps/activity/MyGamePapaLocalFragment;
.source "MyGamePapaLocalFragment_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/MyGamePapaLocalFragment_$v;
    }
.end annotation


# instance fields
.field private final J:La4/c;

.field private K:Landroid/view/View;

.field private final L:Ljava/util/Map;
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

.field private final M:Landroid/content/IntentFilter;

.field private final N:Landroid/content/BroadcastReceiver;

.field private final O:Landroid/content/IntentFilter;

.field private final P:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/MyGamePapaLocalFragment;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_;->J:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_;->L:Ljava/util/Map;

    .line 4
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_;->M:Landroid/content/IntentFilter;

    .line 5
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$k;-><init>(Lcom/join/mgps/activity/MyGamePapaLocalFragment_;)V

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_;->N:Landroid/content/BroadcastReceiver;

    .line 6
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_;->O:Landroid/content/IntentFilter;

    .line 7
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$n;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$n;-><init>(Lcom/join/mgps/activity/MyGamePapaLocalFragment_;)V

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_;->P:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic g1(Lcom/join/mgps/activity/MyGamePapaLocalFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->X0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic h1(Lcom/join/mgps/activity/MyGamePapaLocalFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->P0()V

    return-void
.end method

.method static synthetic i1(Lcom/join/mgps/activity/MyGamePapaLocalFragment_;Ljava/util/HashMap;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->C0(Ljava/util/HashMap;)V

    return-void
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->q:Lcom/join/mgps/pref/PrefDef_;

    .line 2
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_;->M:Landroid/content/IntentFilter;

    const-string v0, "com.join.android.app.mgsim.wufun.broadcast.action_unread_notify"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_;->O:Landroid/content/IntentFilter;

    const-string v0, "com.join.android.app.mgsim.wufun.broadcast.refreshMyGame"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic j1(Lcom/join/mgps/activity/MyGamePapaLocalFragment_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->Q0(Ljava/util/List;)V

    return-void
.end method

.method static synthetic k1(Lcom/join/mgps/activity/MyGamePapaLocalFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->o0()V

    return-void
.end method

.method static synthetic l1(Lcom/join/mgps/activity/MyGamePapaLocalFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->r0()V

    return-void
.end method

.method static synthetic m1(Lcom/join/mgps/activity/MyGamePapaLocalFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->N0()V

    return-void
.end method

.method static synthetic n1(Lcom/join/mgps/activity/MyGamePapaLocalFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->Z0()V

    return-void
.end method

.method static synthetic o1(Lcom/join/mgps/activity/MyGamePapaLocalFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->a1()V

    return-void
.end method

.method static synthetic p1(Lcom/join/mgps/activity/MyGamePapaLocalFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->A0()V

    return-void
.end method

.method static synthetic q1(Lcom/join/mgps/activity/MyGamePapaLocalFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->s0()V

    return-void
.end method

.method static synthetic r1(Lcom/join/mgps/activity/MyGamePapaLocalFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->F0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic s1(Lcom/join/mgps/activity/MyGamePapaLocalFragment_;Lcom/join/mgps/dto/SNKGameInfoBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->V0(Lcom/join/mgps/dto/SNKGameInfoBean;)V

    return-void
.end method

.method static synthetic t1(Lcom/join/mgps/activity/MyGamePapaLocalFragment_;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->e1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method

.method static synthetic u1(Lcom/join/mgps/activity/MyGamePapaLocalFragment_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->Y0(Ljava/util/List;)V

    return-void
.end method

.method public static v1()Lcom/join/mgps/activity/MyGamePapaLocalFragment_$v;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$v;

    invoke-direct {v0}, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$v;-><init>()V

    return-object v0
.end method


# virtual methods
.method A0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$b;-><init>(Lcom/join/mgps/activity/MyGamePapaLocalFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method C0(Ljava/util/HashMap;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$t;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$t;-><init>(Lcom/join/mgps/activity/MyGamePapaLocalFragment_;Ljava/util/HashMap;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method F0(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$d;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$d;-><init>(Lcom/join/mgps/activity/MyGamePapaLocalFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x64

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method N0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$m;

    const-string v2, ""

    const-wide/16 v3, 0x3e8

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$m;-><init>(Lcom/join/mgps/activity/MyGamePapaLocalFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method P0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$h;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$h;-><init>(Lcom/join/mgps/activity/MyGamePapaLocalFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method Q0(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/github/snowdream/android/app/downloader/DownloadTask;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v7, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$i;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$i;-><init>(Lcom/join/mgps/activity/MyGamePapaLocalFragment_;Ljava/lang/String;JLjava/lang/String;Ljava/util/List;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method V0(Lcom/join/mgps/dto/SNKGameInfoBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$e;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$e;-><init>(Lcom/join/mgps/activity/MyGamePapaLocalFragment_;Lcom/join/mgps/dto/SNKGameInfoBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method X0(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$s;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$s;-><init>(Lcom/join/mgps/activity/MyGamePapaLocalFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x1f4

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method Y0(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/activity/recomend/GamedownRecomendItemBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$g;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$g;-><init>(Lcom/join/mgps/activity/MyGamePapaLocalFragment_;Ljava/util/List;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method Z0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$u;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$u;-><init>(Lcom/join/mgps/activity/MyGamePapaLocalFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method a1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$a;-><init>(Lcom/join/mgps/activity/MyGamePapaLocalFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method e1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$f;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$f;-><init>(Lcom/join/mgps/activity/MyGamePapaLocalFragment_;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_;->L:Ljava/util/Map;

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
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_;->K:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method o0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$j;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$j;-><init>(Lcom/join/mgps/activity/MyGamePapaLocalFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_;->J:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/MyGamePapaLocalFragment_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_;->N:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_;->M:Landroid/content/IntentFilter;

    invoke-virtual {p1, v1, v2}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_;->P:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_;->O:Landroid/content/IntentFilter;

    invoke-virtual {p1, v1, v2}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 6
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p3

    iput-object p3, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_;->K:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c0291

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_;->K:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_;->K:Landroid/view/View;

    return-object p1
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_;->N:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_;->P:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 3
    invoke-super {p0}, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->onDestroy()V

    return-void
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_;->K:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->b:Lcom/join/mgps/customview/XListView2;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->c:Landroid/view/View;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->d:Landroid/view/View;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->e:Lcom/join/mgps/customview/WrapContentGridView;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 4

    const v0, 0x7f090c91

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/XListView2;

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->b:Lcom/join/mgps/customview/XListView2;

    const v0, 0x7f090f00

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->c:Landroid/view/View;

    const v0, 0x7f0911a2

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->d:Landroid/view/View;

    const v0, 0x7f090f01

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/WrapContentGridView;

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->e:Lcom/join/mgps/customview/WrapContentGridView;

    const v0, 0x7f090134

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f091211

    .line 6
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f091018

    .line 7
    invoke-interface {p1, v2}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v2

    const v3, 0x7f090ed0

    .line 8
    invoke-interface {p1, v3}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz v0, :cond_0

    .line 9
    new-instance v3, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$o;

    invoke-direct {v3, p0}, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$o;-><init>(Lcom/join/mgps/activity/MyGamePapaLocalFragment_;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz v1, :cond_1

    .line 10
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$p;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$p;-><init>(Lcom/join/mgps/activity/MyGamePapaLocalFragment_;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    if-eqz v2, :cond_2

    .line 11
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$q;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$q;-><init>(Lcom/join/mgps/activity/MyGamePapaLocalFragment_;)V

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    if-eqz p1, :cond_3

    .line 12
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$r;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$r;-><init>(Lcom/join/mgps/activity/MyGamePapaLocalFragment_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 13
    :cond_3
    invoke-virtual {p0}, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->f0()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_;->J:La4/c;

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
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_;->L:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method r0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$l;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$l;-><init>(Lcom/join/mgps/activity/MyGamePapaLocalFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method s0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyGamePapaLocalFragment_$c;-><init>(Lcom/join/mgps/activity/MyGamePapaLocalFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
