.class public final Lcom/join/mgps/activity/MyGamePapaFragment_;
.super Lcom/join/mgps/activity/MyGamePapaFragment;
.source "MyGamePapaFragment_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/MyGamePapaFragment_$b0;
    }
.end annotation


# instance fields
.field private final A1:La4/c;

.field private B1:Landroid/view/View;

.field private final C1:Ljava/util/Map;
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

.field private final D1:Landroid/content/IntentFilter;

.field private final E1:Landroid/content/BroadcastReceiver;

.field private final F1:Landroid/content/IntentFilter;

.field private final G1:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/MyGamePapaFragment;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment_;->A1:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment_;->C1:Ljava/util/Map;

    .line 4
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment_;->D1:Landroid/content/IntentFilter;

    .line 5
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFragment_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyGamePapaFragment_$k;-><init>(Lcom/join/mgps/activity/MyGamePapaFragment_;)V

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment_;->E1:Landroid/content/BroadcastReceiver;

    .line 6
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment_;->F1:Landroid/content/IntentFilter;

    .line 7
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFragment_$t;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyGamePapaFragment_$t;-><init>(Lcom/join/mgps/activity/MyGamePapaFragment_;)V

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment_;->G1:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic J1(Lcom/join/mgps/activity/MyGamePapaFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MyGamePapaFragment;->y1(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic K1(Lcom/join/mgps/activity/MyGamePapaFragment_;Lcom/join/mgps/dto/OnlineCouponConfigBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MyGamePapaFragment;->u1(Lcom/join/mgps/dto/OnlineCouponConfigBean;)V

    return-void
.end method

.method static synthetic L1(Lcom/join/mgps/activity/MyGamePapaFragment_;Ljava/util/HashMap;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MyGamePapaFragment;->Z0(Ljava/util/HashMap;)V

    return-void
.end method

.method static synthetic M1(Lcom/join/mgps/activity/MyGamePapaFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyGamePapaFragment;->n1()V

    return-void
.end method

.method static synthetic N1(Lcom/join/mgps/activity/MyGamePapaFragment_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MyGamePapaFragment;->o1(Ljava/util/List;)V

    return-void
.end method

.method static synthetic O1(Lcom/join/mgps/activity/MyGamePapaFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyGamePapaFragment;->D0()V

    return-void
.end method

.method static synthetic P1(Lcom/join/mgps/activity/MyGamePapaFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyGamePapaFragment;->H0()V

    return-void
.end method

.method static synthetic Q1(Lcom/join/mgps/activity/MyGamePapaFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyGamePapaFragment;->l1()V

    return-void
.end method

.method static synthetic R1(Lcom/join/mgps/activity/MyGamePapaFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyGamePapaFragment;->A1()V

    return-void
.end method

.method static synthetic S1(Lcom/join/mgps/activity/MyGamePapaFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyGamePapaFragment;->C1()V

    return-void
.end method

.method static synthetic T1(Lcom/join/mgps/activity/MyGamePapaFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyGamePapaFragment;->X0()V

    return-void
.end method

.method static synthetic U1(Lcom/join/mgps/activity/MyGamePapaFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyGamePapaFragment;->I0()V

    return-void
.end method

.method static synthetic V1(Lcom/join/mgps/activity/MyGamePapaFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MyGamePapaFragment;->c1(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic W1(Lcom/join/mgps/activity/MyGamePapaFragment_;Lcom/join/mgps/dto/SNKGameInfoBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MyGamePapaFragment;->v1(Lcom/join/mgps/dto/SNKGameInfoBean;)V

    return-void
.end method

.method static synthetic X1(Lcom/join/mgps/activity/MyGamePapaFragment_;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MyGamePapaFragment;->H1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method

.method static synthetic Y1(Lcom/join/mgps/activity/MyGamePapaFragment_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MyGamePapaFragment;->z1(Ljava/util/List;)V

    return-void
.end method

.method public static Z1()Lcom/join/mgps/activity/MyGamePapaFragment_$b0;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFragment_$b0;

    invoke-direct {v0}, Lcom/join/mgps/activity/MyGamePapaFragment_$b0;-><init>()V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->J:Lcom/join/mgps/pref/PrefDef_;

    .line 2
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFragment_;->D1:Landroid/content/IntentFilter;

    const-string v0, "com.join.android.app.mgsim.wufun.broadcast.action_unread_notify"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFragment_;->F1:Landroid/content/IntentFilter;

    const-string v0, "com.join.android.app.mgsim.wufun.broadcast.refreshMyGame"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method A1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFragment_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyGamePapaFragment_$e;-><init>(Lcom/join/mgps/activity/MyGamePapaFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method C1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFragment_$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyGamePapaFragment_$f;-><init>(Lcom/join/mgps/activity/MyGamePapaFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method D0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/MyGamePapaFragment_$q;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/MyGamePapaFragment_$q;-><init>(Lcom/join/mgps/activity/MyGamePapaFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method H0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/MyGamePapaFragment_$r;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/MyGamePapaFragment_$r;-><init>(Lcom/join/mgps/activity/MyGamePapaFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method H1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFragment_$l;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MyGamePapaFragment_$l;-><init>(Lcom/join/mgps/activity/MyGamePapaFragment_;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method I0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFragment_$h;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyGamePapaFragment_$h;-><init>(Lcom/join/mgps/activity/MyGamePapaFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method X0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFragment_$g;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyGamePapaFragment_$g;-><init>(Lcom/join/mgps/activity/MyGamePapaFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method Z0(Ljava/util/HashMap;)V
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
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFragment_$d;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MyGamePapaFragment_$d;-><init>(Lcom/join/mgps/activity/MyGamePapaFragment_;Ljava/util/HashMap;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method c1(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFragment_$i;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MyGamePapaFragment_$i;-><init>(Lcom/join/mgps/activity/MyGamePapaFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x64

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
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment_;->C1:Ljava/util/Map;

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
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment_;->B1:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method l1()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/MyGamePapaFragment_$s;

    const-string v2, ""

    const-wide/16 v3, 0x3e8

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/MyGamePapaFragment_$s;-><init>(Lcom/join/mgps/activity/MyGamePapaFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method n1()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/MyGamePapaFragment_$o;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/MyGamePapaFragment_$o;-><init>(Lcom/join/mgps/activity/MyGamePapaFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method o1(Ljava/util/List;)V
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
    new-instance v7, Lcom/join/mgps/activity/MyGamePapaFragment_$p;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/MyGamePapaFragment_$p;-><init>(Lcom/join/mgps/activity/MyGamePapaFragment_;Ljava/lang/String;JLjava/lang/String;Ljava/util/List;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment_;->A1:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/MyGamePapaFragment_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaFragment_;->E1:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lcom/join/mgps/activity/MyGamePapaFragment_;->D1:Landroid/content/IntentFilter;

    invoke-virtual {p1, v1, v2}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaFragment_;->G1:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lcom/join/mgps/activity/MyGamePapaFragment_;->F1:Landroid/content/IntentFilter;

    invoke-virtual {p1, v1, v2}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 6
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/basefragment/BaseLoadingFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p3

    iput-object p3, p0, Lcom/join/mgps/activity/MyGamePapaFragment_;->B1:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c028c

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFragment_;->B1:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFragment_;->B1:Landroid/view/View;

    return-object p1
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaFragment_;->E1:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaFragment_;->G1:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 3
    invoke-super {p0}, Lcom/join/mgps/activity/MyGamePapaFragment;->onDestroy()V

    return-void
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment_;->B1:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->d:Landroid/view/View;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->e:Lcom/join/mgps/customview/XListView2;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->f:Landroid/view/View;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->g:Landroid/widget/TextView;

    .line 7
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->h:Landroid/widget/TextView;

    .line 8
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->i:Landroid/view/View;

    .line 9
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->j:Landroid/view/View;

    .line 10
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->k:Landroid/widget/TextView;

    .line 11
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->l:Landroid/widget/TextView;

    .line 12
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->m:Landroid/widget/TextView;

    .line 13
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->n:Landroid/view/View;

    .line 14
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->o:Landroid/view/View;

    .line 15
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->p:Landroid/view/View;

    .line 16
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->q:Landroid/view/View;

    .line 17
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->r:Landroid/view/View;

    .line 18
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->s:Lcom/join/mgps/customview/WrapContentGridView;

    .line 19
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->t:Landroid/widget/LinearLayout;

    .line 20
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->u:Landroid/widget/TextView;

    .line 21
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->v:Landroid/widget/ImageView;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 3

    const v0, 0x7f0900ff

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->d:Landroid/view/View;

    const v0, 0x7f090c91

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/XListView2;

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->e:Lcom/join/mgps/customview/XListView2;

    const v0, 0x7f091019

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->f:Landroid/view/View;

    const v0, 0x7f091016

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->g:Landroid/widget/TextView;

    const v0, 0x7f091013

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->h:Landroid/widget/TextView;

    const v0, 0x7f090586

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->i:Landroid/view/View;

    const v0, 0x7f090f00

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->j:Landroid/view/View;

    const v0, 0x7f09058a

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->k:Landroid/widget/TextView;

    const v0, 0x7f091461

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->l:Landroid/widget/TextView;

    const v0, 0x7f0903b5

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->m:Landroid/widget/TextView;

    const v0, 0x7f0911a2

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->n:Landroid/view/View;

    const v0, 0x7f090ed0

    .line 12
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->o:Landroid/view/View;

    const v0, 0x7f091211

    .line 13
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->p:Landroid/view/View;

    const v0, 0x7f090134

    .line 14
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->q:Landroid/view/View;

    const v0, 0x7f09132b

    .line 15
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->r:Landroid/view/View;

    const v0, 0x7f090f01

    .line 16
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/WrapContentGridView;

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->s:Lcom/join/mgps/customview/WrapContentGridView;

    const v0, 0x7f090cbc

    .line 17
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->t:Landroid/widget/LinearLayout;

    const v0, 0x7f09153e

    .line 18
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->u:Landroid/widget/TextView;

    const v0, 0x7f0908f0

    .line 19
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->v:Landroid/widget/ImageView;

    const v0, 0x7f091261

    .line 20
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f091018

    .line 21
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f09126c

    .line 22
    invoke-interface {p1, v2}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz v0, :cond_0

    .line 23
    new-instance v2, Lcom/join/mgps/activity/MyGamePapaFragment_$u;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/MyGamePapaFragment_$u;-><init>(Lcom/join/mgps/activity/MyGamePapaFragment_;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 24
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->v:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    .line 25
    new-instance v2, Lcom/join/mgps/activity/MyGamePapaFragment_$v;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/MyGamePapaFragment_$v;-><init>(Lcom/join/mgps/activity/MyGamePapaFragment_;)V

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 26
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->t:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_2

    .line 27
    new-instance v2, Lcom/join/mgps/activity/MyGamePapaFragment_$w;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/MyGamePapaFragment_$w;-><init>(Lcom/join/mgps/activity/MyGamePapaFragment_;)V

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 28
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->q:Landroid/view/View;

    if-eqz v0, :cond_3

    .line 29
    new-instance v2, Lcom/join/mgps/activity/MyGamePapaFragment_$x;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/MyGamePapaFragment_$x;-><init>(Lcom/join/mgps/activity/MyGamePapaFragment_;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 30
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->p:Landroid/view/View;

    if-eqz v0, :cond_4

    .line 31
    new-instance v2, Lcom/join/mgps/activity/MyGamePapaFragment_$y;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/MyGamePapaFragment_$y;-><init>(Lcom/join/mgps/activity/MyGamePapaFragment_;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_4
    if-eqz v1, :cond_5

    .line 32
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFragment_$z;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyGamePapaFragment_$z;-><init>(Lcom/join/mgps/activity/MyGamePapaFragment_;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 33
    :cond_5
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->o:Landroid/view/View;

    if-eqz v0, :cond_6

    .line 34
    new-instance v1, Lcom/join/mgps/activity/MyGamePapaFragment_$a0;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/MyGamePapaFragment_$a0;-><init>(Lcom/join/mgps/activity/MyGamePapaFragment_;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 35
    :cond_6
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment;->i:Landroid/view/View;

    if-eqz v0, :cond_7

    .line 36
    new-instance v1, Lcom/join/mgps/activity/MyGamePapaFragment_$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/MyGamePapaFragment_$a;-><init>(Lcom/join/mgps/activity/MyGamePapaFragment_;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_7
    if-eqz p1, :cond_8

    .line 37
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFragment_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyGamePapaFragment_$b;-><init>(Lcom/join/mgps/activity/MyGamePapaFragment_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 38
    :cond_8
    invoke-virtual {p0}, Lcom/join/mgps/activity/MyGamePapaFragment;->afterViews()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFragment_;->A1:La4/c;

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
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment_;->C1:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public u1(Lcom/join/mgps/dto/OnlineCouponConfigBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFragment_$n;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MyGamePapaFragment_$n;-><init>(Lcom/join/mgps/activity/MyGamePapaFragment_;Lcom/join/mgps/dto/OnlineCouponConfigBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method v1(Lcom/join/mgps/dto/SNKGameInfoBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFragment_$j;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MyGamePapaFragment_$j;-><init>(Lcom/join/mgps/activity/MyGamePapaFragment_;Lcom/join/mgps/dto/SNKGameInfoBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method y1(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFragment_$c;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MyGamePapaFragment_$c;-><init>(Lcom/join/mgps/activity/MyGamePapaFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x1f4

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method z1(Ljava/util/List;)V
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
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFragment_$m;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MyGamePapaFragment_$m;-><init>(Lcom/join/mgps/activity/MyGamePapaFragment_;Ljava/util/List;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
