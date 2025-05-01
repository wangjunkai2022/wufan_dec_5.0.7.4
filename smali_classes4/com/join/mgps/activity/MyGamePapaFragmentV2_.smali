.class public final Lcom/join/mgps/activity/MyGamePapaFragmentV2_;
.super Lcom/join/mgps/activity/MyGamePapaFragmentV2;
.source "MyGamePapaFragmentV2_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/MyGamePapaFragmentV2_$b0;
    }
.end annotation


# instance fields
.field private final D1:La4/c;

.field private E1:Landroid/view/View;

.field private final F1:Ljava/util/Map;
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

.field private final G1:Landroid/content/IntentFilter;

.field private final H1:Landroid/content/BroadcastReceiver;

.field private final I1:Landroid/content/IntentFilter;

.field private final J1:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/MyGamePapaFragmentV2;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_;->D1:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_;->F1:Ljava/util/Map;

    .line 4
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_;->G1:Landroid/content/IntentFilter;

    .line 5
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$k;-><init>(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;)V

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_;->H1:Landroid/content/BroadcastReceiver;

    .line 6
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_;->I1:Landroid/content/IntentFilter;

    .line 7
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$t;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$t;-><init>(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;)V

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_;->J1:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic L1(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->A1(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic M1(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;Lcom/join/mgps/dto/OnlineCouponConfigBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->w1(Lcom/join/mgps/dto/OnlineCouponConfigBean;)V

    return-void
.end method

.method static synthetic N1(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;Ljava/util/HashMap;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->a1(Ljava/util/HashMap;)V

    return-void
.end method

.method static synthetic O1(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->o1()V

    return-void
.end method

.method static synthetic P1(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->p1(Ljava/util/List;)V

    return-void
.end method

.method static synthetic Q1(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->E0()V

    return-void
.end method

.method static synthetic R1(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->I0()V

    return-void
.end method

.method static synthetic S1(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->m1()V

    return-void
.end method

.method static synthetic T1(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->C1()V

    return-void
.end method

.method static synthetic U1(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->E1()V

    return-void
.end method

.method static synthetic V1(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->Y0()V

    return-void
.end method

.method static synthetic W1(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->J0()V

    return-void
.end method

.method static synthetic X1(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->d1(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic Y1(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;Lcom/join/mgps/dto/SNKGameInfoBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->x1(Lcom/join/mgps/dto/SNKGameInfoBean;)V

    return-void
.end method

.method static synthetic Z1(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->J1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method

.method static synthetic a2(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->B1(Ljava/util/List;)V

    return-void
.end method

.method public static b2()Lcom/join/mgps/activity/MyGamePapaFragmentV2_$b0;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$b0;

    invoke-direct {v0}, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$b0;-><init>()V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->L:Lcom/join/mgps/pref/PrefDef_;

    .line 2
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_;->G1:Landroid/content/IntentFilter;

    const-string v0, "com.join.android.app.mgsim.wufun.broadcast.action_unread_notify"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_;->I1:Landroid/content/IntentFilter;

    const-string v0, "com.join.android.app.mgsim.wufun.broadcast.refreshMyGame"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method A1(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$c;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$c;-><init>(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x1f4

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method B1(Ljava/util/List;)V
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
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$m;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$m;-><init>(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;Ljava/util/List;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method C1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$e;-><init>(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method E0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$q;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$q;-><init>(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method E1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$f;-><init>(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method I0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$r;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$r;-><init>(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method J0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$h;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$h;-><init>(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method J1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$l;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$l;-><init>(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method Y0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$g;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$g;-><init>(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method a1(Ljava/util/HashMap;)V
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
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$d;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$d;-><init>(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;Ljava/util/HashMap;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method d1(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$i;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$i;-><init>(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;Ljava/lang/String;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_;->F1:Ljava/util/Map;

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
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_;->E1:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method m1()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$s;

    const-string v2, ""

    const-wide/16 v3, 0x3e8

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$s;-><init>(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method o1()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$o;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$o;-><init>(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_;->D1:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/MyGamePapaFragmentV2_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_;->H1:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_;->G1:Landroid/content/IntentFilter;

    invoke-virtual {p1, v1, v2}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_;->J1:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_;->I1:Landroid/content/IntentFilter;

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

    iput-object p3, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_;->E1:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c027e

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_;->E1:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_;->E1:Landroid/view/View;

    return-object p1
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_;->H1:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_;->J1:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 3
    invoke-super {p0}, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->onDestroy()V

    return-void
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_;->E1:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->d:Landroid/view/View;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->e:Lcom/join/mgps/customview/XListView2;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->f:Landroid/view/View;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->g:Landroid/widget/TextView;

    .line 7
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->h:Landroid/widget/TextView;

    .line 8
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->i:Landroid/view/View;

    .line 9
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->j:Landroid/view/View;

    .line 10
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->k:Landroid/widget/TextView;

    .line 11
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->l:Landroid/widget/TextView;

    .line 12
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->m:Landroid/widget/TextView;

    .line 13
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->n:Landroid/view/View;

    .line 14
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->o:Landroid/view/View;

    .line 15
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->p:Landroid/view/View;

    .line 16
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->q:Landroid/view/View;

    .line 17
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->r:Landroid/view/View;

    .line 18
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->s:Lcom/join/mgps/customview/WrapContentGridView;

    .line 19
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->t:Landroid/widget/LinearLayout;

    .line 20
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->u:Landroid/widget/TextView;

    .line 21
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->v:Landroid/widget/ImageView;

    .line 22
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->w:Landroidx/viewpager2/widget/ViewPager2;

    .line 23
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->x:Lcom/google/android/material/tabs/TabLayout;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 3

    const v0, 0x7f0900ff

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->d:Landroid/view/View;

    const v0, 0x7f090c91

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/XListView2;

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->e:Lcom/join/mgps/customview/XListView2;

    const v0, 0x7f091019

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->f:Landroid/view/View;

    const v0, 0x7f091016

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->g:Landroid/widget/TextView;

    const v0, 0x7f091013

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->h:Landroid/widget/TextView;

    const v0, 0x7f090586

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->i:Landroid/view/View;

    const v0, 0x7f090f00

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->j:Landroid/view/View;

    const v0, 0x7f09058a

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->k:Landroid/widget/TextView;

    const v0, 0x7f091461

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->l:Landroid/widget/TextView;

    const v0, 0x7f0903b5

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->m:Landroid/widget/TextView;

    const v0, 0x7f0911a2

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->n:Landroid/view/View;

    const v0, 0x7f090ed0

    .line 12
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->o:Landroid/view/View;

    const v0, 0x7f091211

    .line 13
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->p:Landroid/view/View;

    const v0, 0x7f090134

    .line 14
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->q:Landroid/view/View;

    const v0, 0x7f09132b

    .line 15
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->r:Landroid/view/View;

    const v0, 0x7f090f01

    .line 16
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/WrapContentGridView;

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->s:Lcom/join/mgps/customview/WrapContentGridView;

    const v0, 0x7f090cbc

    .line 17
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->t:Landroid/widget/LinearLayout;

    const v0, 0x7f09153e

    .line 18
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->u:Landroid/widget/TextView;

    const v0, 0x7f0908f0

    .line 19
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->v:Landroid/widget/ImageView;

    const v0, 0x7f0917fa

    .line 20
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/viewpager2/widget/ViewPager2;

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->w:Landroidx/viewpager2/widget/ViewPager2;

    const v0, 0x7f091363

    .line 21
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/tabs/TabLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->x:Lcom/google/android/material/tabs/TabLayout;

    const v0, 0x7f091261

    .line 22
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f091018

    .line 23
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f09126c

    .line 24
    invoke-interface {p1, v2}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz v0, :cond_0

    .line 25
    new-instance v2, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$u;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$u;-><init>(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 26
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->v:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    .line 27
    new-instance v2, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$v;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$v;-><init>(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;)V

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 28
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->t:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_2

    .line 29
    new-instance v2, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$w;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$w;-><init>(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;)V

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 30
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->q:Landroid/view/View;

    if-eqz v0, :cond_3

    .line 31
    new-instance v2, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$x;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$x;-><init>(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 32
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->p:Landroid/view/View;

    if-eqz v0, :cond_4

    .line 33
    new-instance v2, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$y;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$y;-><init>(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_4
    if-eqz v1, :cond_5

    .line 34
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$z;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$z;-><init>(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 35
    :cond_5
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->o:Landroid/view/View;

    if-eqz v0, :cond_6

    .line 36
    new-instance v1, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$a0;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$a0;-><init>(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 37
    :cond_6
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->i:Landroid/view/View;

    if-eqz v0, :cond_7

    .line 38
    new-instance v1, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$a;-><init>(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_7
    if-eqz p1, :cond_8

    .line 39
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$b;-><init>(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 40
    :cond_8
    invoke-virtual {p0}, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->afterViews()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_;->D1:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method p1(Ljava/util/List;)V
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
    new-instance v7, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$p;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$p;-><init>(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;Ljava/lang/String;JLjava/lang/String;Ljava/util/List;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_;->F1:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public w1(Lcom/join/mgps/dto/OnlineCouponConfigBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$n;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$n;-><init>(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;Lcom/join/mgps/dto/OnlineCouponConfigBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method x1(Lcom/join/mgps/dto/SNKGameInfoBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$j;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$j;-><init>(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;Lcom/join/mgps/dto/SNKGameInfoBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
