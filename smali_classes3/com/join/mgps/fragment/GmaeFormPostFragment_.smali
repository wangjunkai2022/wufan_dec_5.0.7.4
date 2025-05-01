.class public final Lcom/join/mgps/fragment/GmaeFormPostFragment_;
.super Lcom/join/mgps/fragment/GmaeFormPostFragment;
.source "GmaeFormPostFragment_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/GmaeFormPostFragment_$a0;
    }
.end annotation


# instance fields
.field private final N1:La4/c;

.field private O1:Landroid/view/View;

.field private final P1:Ljava/util/Map;
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

.field private final Q1:Landroid/content/IntentFilter;

.field private final R1:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/fragment/GmaeFormPostFragment;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment_;->N1:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment_;->P1:Ljava/util/Map;

    .line 4
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment_;->Q1:Landroid/content/IntentFilter;

    .line 5
    new-instance v0, Lcom/join/mgps/fragment/GmaeFormPostFragment_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/GmaeFormPostFragment_$k;-><init>(Lcom/join/mgps/fragment/GmaeFormPostFragment_;)V

    iput-object v0, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment_;->R1:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic B1(Lcom/join/mgps/fragment/GmaeFormPostFragment_;Lcom/join/mgps/dto/ResultMainBean;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/fragment/GmaeFormPostFragment;->w1(Lcom/join/mgps/dto/ResultMainBean;ILjava/lang/String;)V

    return-void
.end method

.method static synthetic C1(Lcom/join/mgps/fragment/GmaeFormPostFragment_;Landroid/widget/AbsListView;III)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lcom/join/mgps/fragment/GmaeFormPostFragment;->z1(Landroid/widget/AbsListView;III)V

    return-void
.end method

.method static synthetic D1(Lcom/join/mgps/fragment/GmaeFormPostFragment_;Ljava/util/List;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/fragment/GmaeFormPostFragment;->P0(Ljava/util/List;I)V

    return-void
.end method

.method static synthetic E1(Lcom/join/mgps/fragment/GmaeFormPostFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/GmaeFormPostFragment;->j1()V

    return-void
.end method

.method static synthetic F1(Lcom/join/mgps/fragment/GmaeFormPostFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/GmaeFormPostFragment;->showMessage(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic G1(Lcom/join/mgps/fragment/GmaeFormPostFragment_;Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/fragment/GmaeFormPostFragment;->v1(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    return-void
.end method

.method static synthetic H1(Lcom/join/mgps/fragment/GmaeFormPostFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/GmaeFormPostFragment;->updateDownloadView()V

    return-void
.end method

.method static synthetic I1(Lcom/join/mgps/fragment/GmaeFormPostFragment_;Lcom/join/mgps/dto/DetailResultBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/GmaeFormPostFragment;->o1(Lcom/join/mgps/dto/DetailResultBean;)V

    return-void
.end method

.method static synthetic J1(Lcom/join/mgps/fragment/GmaeFormPostFragment_;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/fragment/GmaeFormPostFragment;->i0(ILjava/lang/String;)V

    return-void
.end method

.method static synthetic K1(Lcom/join/mgps/fragment/GmaeFormPostFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/GmaeFormPostFragment;->y0()V

    return-void
.end method

.method static synthetic L1(Lcom/join/mgps/fragment/GmaeFormPostFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/GmaeFormPostFragment;->z0()V

    return-void
.end method

.method static synthetic M1(Lcom/join/mgps/fragment/GmaeFormPostFragment_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/GmaeFormPostFragment;->A0(I)V

    return-void
.end method

.method static synthetic N1(Lcom/join/mgps/fragment/GmaeFormPostFragment_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/GmaeFormPostFragment;->N0(I)V

    return-void
.end method

.method static synthetic O1(Lcom/join/mgps/fragment/GmaeFormPostFragment_;IZ)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/fragment/GmaeFormPostFragment;->E0(IZ)V

    return-void
.end method

.method static synthetic P1(Lcom/join/mgps/fragment/GmaeFormPostFragment_;Landroid/content/Context;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/fragment/GmaeFormPostFragment;->m0(Landroid/content/Context;I)V

    return-void
.end method

.method static synthetic Q1(Lcom/join/mgps/fragment/GmaeFormPostFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/GmaeFormPostFragment;->getDownloadTaskInfo()V

    return-void
.end method

.method static synthetic R1(Lcom/join/mgps/fragment/GmaeFormPostFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/GmaeFormPostFragment;->o0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic S1(Lcom/join/mgps/fragment/GmaeFormPostFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/GmaeFormPostFragment;->q1()V

    return-void
.end method

.method static synthetic T1(Lcom/join/mgps/fragment/GmaeFormPostFragment_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/GmaeFormPostFragment;->j0(I)V

    return-void
.end method

.method static synthetic U1(Lcom/join/mgps/fragment/GmaeFormPostFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/GmaeFormPostFragment;->C0()V

    return-void
.end method

.method static synthetic V1(Lcom/join/mgps/fragment/GmaeFormPostFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/GmaeFormPostFragment;->h1()V

    return-void
.end method

.method static synthetic W1(Lcom/join/mgps/fragment/GmaeFormPostFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/GmaeFormPostFragment;->showToast(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic X1(Lcom/join/mgps/fragment/GmaeFormPostFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/GmaeFormPostFragment;->k1()V

    return-void
.end method

.method static synthetic Y1(Lcom/join/mgps/fragment/GmaeFormPostFragment_;Landroid/widget/AbsListView;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/fragment/GmaeFormPostFragment;->A1(Landroid/widget/AbsListView;I)V

    return-void
.end method

.method public static Z1()Lcom/join/mgps/fragment/GmaeFormPostFragment_$a0;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/GmaeFormPostFragment_$a0;

    invoke-direct {v0}, Lcom/join/mgps/fragment/GmaeFormPostFragment_$a0;-><init>()V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment_;->Q1:Landroid/content/IntentFilter;

    const-string v0, "com.join.android.app.mgsim.wufun.broadcast.refreshMyGame"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment_;->Q1:Landroid/content/IntentFilter;

    const-string v0, "com.join.android.app.mgsim.wufun.broadcast.paygamefinish"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method A0(I)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/fragment/GmaeFormPostFragment_$n;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/fragment/GmaeFormPostFragment_$n;-><init>(Lcom/join/mgps/fragment/GmaeFormPostFragment_;Ljava/lang/String;JLjava/lang/String;I)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method A1(Landroid/widget/AbsListView;I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/GmaeFormPostFragment_$c;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/fragment/GmaeFormPostFragment_$c;-><init>(Lcom/join/mgps/fragment/GmaeFormPostFragment_;Landroid/widget/AbsListView;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method C0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/GmaeFormPostFragment_$y;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/GmaeFormPostFragment_$y;-><init>(Lcom/join/mgps/fragment/GmaeFormPostFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method E0(IZ)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/GmaeFormPostFragment_$v;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/fragment/GmaeFormPostFragment_$v;-><init>(Lcom/join/mgps/fragment/GmaeFormPostFragment_;IZ)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method N0(I)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/fragment/GmaeFormPostFragment_$o;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/fragment/GmaeFormPostFragment_$o;-><init>(Lcom/join/mgps/fragment/GmaeFormPostFragment_;Ljava/lang/String;JLjava/lang/String;I)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method P0(Ljava/util/List;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/ForumData$ForumUserFavoritesData;",
            ">;I)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/GmaeFormPostFragment_$u;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/fragment/GmaeFormPostFragment_$u;-><init>(Lcom/join/mgps/fragment/GmaeFormPostFragment_;Ljava/util/List;I)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment_;->P1:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method getDownloadTaskInfo()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/GmaeFormPostFragment_$q;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/GmaeFormPostFragment_$q;-><init>(Lcom/join/mgps/fragment/GmaeFormPostFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method h1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/GmaeFormPostFragment_$z;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/GmaeFormPostFragment_$z;-><init>(Lcom/join/mgps/fragment/GmaeFormPostFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method i0(ILjava/lang/String;)V
    .locals 9

    .line 1
    new-instance v8, Lcom/join/mgps/fragment/GmaeFormPostFragment_$j;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v8

    move-object v1, p0

    move v6, p1

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/join/mgps/fragment/GmaeFormPostFragment_$j;-><init>(Lcom/join/mgps/fragment/GmaeFormPostFragment_;Ljava/lang/String;JLjava/lang/String;ILjava/lang/String;)V

    invoke-static {v8}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment_;->O1:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method j0(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/GmaeFormPostFragment_$x;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/GmaeFormPostFragment_$x;-><init>(Lcom/join/mgps/fragment/GmaeFormPostFragment_;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method j1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/GmaeFormPostFragment_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/GmaeFormPostFragment_$e;-><init>(Lcom/join/mgps/fragment/GmaeFormPostFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method k1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/GmaeFormPostFragment_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/GmaeFormPostFragment_$b;-><init>(Lcom/join/mgps/fragment/GmaeFormPostFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method m0(Landroid/content/Context;I)V
    .locals 9

    .line 1
    new-instance v8, Lcom/join/mgps/fragment/GmaeFormPostFragment_$p;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v8

    move-object v1, p0

    move-object v6, p1

    move v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/join/mgps/fragment/GmaeFormPostFragment_$p;-><init>(Lcom/join/mgps/fragment/GmaeFormPostFragment_;Ljava/lang/String;JLjava/lang/String;Landroid/content/Context;I)V

    invoke-static {v8}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method o0(Ljava/lang/String;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/fragment/GmaeFormPostFragment_$r;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/fragment/GmaeFormPostFragment_$r;-><init>(Lcom/join/mgps/fragment/GmaeFormPostFragment_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method o1(Lcom/join/mgps/dto/DetailResultBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/GmaeFormPostFragment_$i;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/GmaeFormPostFragment_$i;-><init>(Lcom/join/mgps/fragment/GmaeFormPostFragment_;Lcom/join/mgps/dto/DetailResultBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment_;->N1:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/GmaeFormPostFragment_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment_;->R1:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment_;->Q1:Landroid/content/IntentFilter;

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

    iput-object p3, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment_;->O1:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c05d9

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment_;->O1:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment_;->O1:Landroid/view/View;

    return-object p1
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment_;->R1:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 2
    invoke-super {p0}, Lcom/join/mgps/fragment/GmaeFormPostFragment;->onDestroy()V

    return-void
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment_;->O1:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment;->b:Landroid/widget/RelativeLayout;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment;->c:Landroid/widget/ImageView;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment;->d:Landroid/widget/TextView;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment;->e:Lcom/join/mgps/customview/ForumLoadingView;

    .line 7
    iput-object v0, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment;->i:Lcom/join/mgps/customview/XListView2;

    .line 8
    iput-object v0, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment;->j:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    .line 9
    iput-object v0, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment;->I:Landroid/widget/FrameLayout;

    .line 10
    iput-object v0, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment;->J:Landroid/widget/RelativeLayout;

    .line 11
    sput-object v0, Lcom/join/mgps/fragment/GmaeFormPostFragment;->L1:Lcom/join/android/app/component/video/MyVideoView;

    .line 12
    iput-object v0, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment;->K:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 13
    iput-object v0, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment;->L:Landroid/widget/ImageView;

    .line 14
    iput-object v0, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment;->M:Landroid/widget/LinearLayout;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 1

    const v0, 0x7f090089

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment;->b:Landroid/widget/RelativeLayout;

    const v0, 0x7f090146

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment;->c:Landroid/widget/ImageView;

    const v0, 0x7f090c48

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment;->d:Landroid/widget/TextView;

    const v0, 0x7f090d57

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/ForumLoadingView;

    iput-object v0, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment;->e:Lcom/join/mgps/customview/ForumLoadingView;

    const v0, 0x7f090604

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/XListView2;

    iput-object v0, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment;->i:Lcom/join/mgps/customview/XListView2;

    const v0, 0x7f090db3

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment;->j:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    const v0, 0x7f091791

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment;->I:Landroid/widget/FrameLayout;

    const v0, 0x7f091793

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment;->J:Landroid/widget/RelativeLayout;

    const v0, 0x7f09178e

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/component/video/MyVideoView;

    sput-object v0, Lcom/join/mgps/fragment/GmaeFormPostFragment;->L1:Lcom/join/android/app/component/video/MyVideoView;

    const v0, 0x7f0903c2

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment;->K:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f09100b

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment;->L:Landroid/widget/ImageView;

    const v0, 0x7f090d54

    .line 12
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment;->M:Landroid/widget/LinearLayout;

    .line 13
    iget-object p1, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment;->c:Landroid/widget/ImageView;

    if-eqz p1, :cond_0

    .line 14
    new-instance v0, Lcom/join/mgps/fragment/GmaeFormPostFragment_$s;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/GmaeFormPostFragment_$s;-><init>(Lcom/join/mgps/fragment/GmaeFormPostFragment_;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/fragment/GmaeFormPostFragment;->afterViews()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment_;->N1:La4/c;

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
    iget-object v0, p0, Lcom/join/mgps/fragment/GmaeFormPostFragment_;->P1:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method q1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/GmaeFormPostFragment_$w;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/GmaeFormPostFragment_$w;-><init>(Lcom/join/mgps/fragment/GmaeFormPostFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showMessage(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/GmaeFormPostFragment_$f;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/GmaeFormPostFragment_$f;-><init>(Lcom/join/mgps/fragment/GmaeFormPostFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showToast(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/GmaeFormPostFragment_$a;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/GmaeFormPostFragment_$a;-><init>(Lcom/join/mgps/fragment/GmaeFormPostFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method updateDownloadView()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/GmaeFormPostFragment_$h;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/GmaeFormPostFragment_$h;-><init>(Lcom/join/mgps/fragment/GmaeFormPostFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method v1(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/GmaeFormPostFragment_$g;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/fragment/GmaeFormPostFragment_$g;-><init>(Lcom/join/mgps/fragment/GmaeFormPostFragment_;Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method w1(Lcom/join/mgps/dto/ResultMainBean;ILjava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/GmaeFormPostFragment_$t;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/join/mgps/fragment/GmaeFormPostFragment_$t;-><init>(Lcom/join/mgps/fragment/GmaeFormPostFragment_;Lcom/join/mgps/dto/ResultMainBean;ILjava/lang/String;)V

    const-string p1, ""

    const-wide/16 p2, 0x0

    invoke-static {p1, v0, p2, p3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method y0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/GmaeFormPostFragment_$l;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/GmaeFormPostFragment_$l;-><init>(Lcom/join/mgps/fragment/GmaeFormPostFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method z0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/GmaeFormPostFragment_$m;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/GmaeFormPostFragment_$m;-><init>(Lcom/join/mgps/fragment/GmaeFormPostFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method z1(Landroid/widget/AbsListView;III)V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/GmaeFormPostFragment_$d;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/GmaeFormPostFragment_$d;-><init>(Lcom/join/mgps/fragment/GmaeFormPostFragment_;Landroid/widget/AbsListView;III)V

    const-string p1, ""

    const-wide/16 p2, 0x0

    invoke-static {p1, v6, p2, p3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
