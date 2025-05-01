.class public final Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;
.super Lcom/join/mgps/activity/GamedetialModleBtFragemnt;
.source "GamedetialModleBtFragemnt_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$z0;
    }
.end annotation


# instance fields
.field private final K2:La4/c;

.field private L2:Landroid/view/View;

.field private final M2:Ljava/util/Map;
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

.field private final N2:Landroid/content/IntentFilter;

.field private final O2:Landroid/content/BroadcastReceiver;

.field private final P2:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;->K2:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;->M2:Ljava/util/Map;

    .line 4
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;->N2:Landroid/content/IntentFilter;

    .line 5
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$k;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;->O2:Landroid/content/BroadcastReceiver;

    .line 6
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$v;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$v;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;->P2:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic A1(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->i1(I)V

    return-void
.end method

.method static synthetic B1(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->h1(I)V

    return-void
.end method

.method static synthetic C1(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->k1()V

    return-void
.end method

.method static synthetic D1(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;Lcom/join/mgps/dto/GamedetialModleFourBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->o1(Lcom/join/mgps/dto/GamedetialModleFourBean;)V

    return-void
.end method

.method static synthetic E1(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->updateDownloadView()V

    return-void
.end method

.method static synthetic F1(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->m1(Z)V

    return-void
.end method

.method static synthetic G1(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;Lcom/join/mgps/dto/ResultMainBean;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->updateTitleButn(Lcom/join/mgps/dto/ResultMainBean;I)V

    return-void
.end method

.method static synthetic H1(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->g1(Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic I1(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->t0()V

    return-void
.end method

.method static synthetic J1(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->u0()V

    return-void
.end method

.method static synthetic K1(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->c0()V

    return-void
.end method

.method static synthetic L1(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;Ljava/lang/String;Ljava/lang/String;Lcom/join/mgps/activity/GamedetialModleBtFragemnt$b0;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->d0(Ljava/lang/String;Ljava/lang/String;Lcom/join/mgps/activity/GamedetialModleBtFragemnt$b0;)V

    return-void
.end method

.method static synthetic M1(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->n0()V

    return-void
.end method

.method static synthetic N1(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->getDownloadTaskInfo()V

    return-void
.end method

.method static synthetic O1(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->f0()V

    return-void
.end method

.method static synthetic P1(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->changeGameFollow(I)V

    return-void
.end method

.method static synthetic Q1(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->N0()V

    return-void
.end method

.method static synthetic R1(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->j1()V

    return-void
.end method

.method static synthetic S1(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->f1()V

    return-void
.end method

.method static synthetic T1(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->B0()V

    return-void
.end method

.method static synthetic U1(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->Z0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic V1(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;Lcom/join/mgps/dto/GameFromPopoWinBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->l0(Lcom/join/mgps/dto/GameFromPopoWinBean;)V

    return-void
.end method

.method static synthetic W1(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->o0()V

    return-void
.end method

.method public static X1()Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$z0;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$z0;

    invoke-direct {v0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$z0;-><init>()V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->Z:Lcom/join/mgps/pref/PrefDef_;

    .line 2
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;->N2:Landroid/content/IntentFilter;

    const-string v0, "com.broadcast.bespeak.sussess"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic q1(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->b1()V

    return-void
.end method

.method static synthetic r1(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->showToast(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic s1(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->showLoding()V

    return-void
.end method

.method static synthetic t1(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->D0()V

    return-void
.end method

.method static synthetic u1(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;Lcom/join/mgps/activity/GamedetialModleBtFragemnt$b0;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->V0(Lcom/join/mgps/activity/GamedetialModleBtFragemnt$b0;)V

    return-void
.end method

.method static synthetic v1(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->showLodingFailed()V

    return-void
.end method

.method static synthetic w1(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->showProgress()V

    return-void
.end method

.method static synthetic x1(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->showInstallButn()V

    return-void
.end method

.method static synthetic y1(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->updateButn()V

    return-void
.end method

.method static synthetic z1(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->setCommentNumber(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method B0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$q;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$q;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method D0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$w;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$w;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method N0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$t0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$t0;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method V0(Lcom/join/mgps/activity/GamedetialModleBtFragemnt$b0;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$x;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$x;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;Lcom/join/mgps/activity/GamedetialModleBtFragemnt$b0;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method Z0(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$r;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$r;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method b1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$j;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V

    const-string v1, ""

    const-wide/16 v2, 0xfa0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method c0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$n0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$n0;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method changeGameFollow(I)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$s0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$s0;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;Ljava/lang/String;JLjava/lang/String;I)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method d0(Ljava/lang/String;Ljava/lang/String;Lcom/join/mgps/activity/GamedetialModleBtFragemnt$b0;)V
    .locals 10

    .line 1
    new-instance v9, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$o0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v9

    move-object v1, p0

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    invoke-direct/range {v0 .. v8}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$o0;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/join/mgps/activity/GamedetialModleBtFragemnt$b0;)V

    invoke-static {v9}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method f0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$n;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$n;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method f1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$p;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$p;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method g1(Ljava/lang/String;I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$k0;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$k0;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;Ljava/lang/String;I)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;->M2:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method getDownloadTaskInfo()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$q0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$q0;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method h1(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$e0;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$e0;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method i1(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$d0;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$d0;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;I)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;->L2:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method j1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$o;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$o;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method k1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$f0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$f0;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method l0(Lcom/join/mgps/dto/GameFromPopoWinBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$s;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$s;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;Lcom/join/mgps/dto/GameFromPopoWinBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method m1(Z)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$i0;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$i0;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;Z)V

    const-string p1, ""

    const-wide/16 v1, 0x3e8

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method n0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$p0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$p0;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method o0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$t;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$t;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method o1(Lcom/join/mgps/dto/GamedetialModleFourBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$m;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$m;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;Lcom/join/mgps/dto/GamedetialModleFourBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;->K2:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;->O2:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;->N2:Landroid/content/IntentFilter;

    invoke-virtual {p1, v1, v2}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;->P2:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;->N2:Landroid/content/IntentFilter;

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

    iput-object p3, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;->L2:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c0308

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;->L2:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;->L2:Landroid/view/View;

    return-object p1
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;->O2:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;->P2:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 3
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->onDestroy()V

    return-void
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;->L2:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->f:Landroid/widget/RelativeLayout;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->g:Landroid/view/View;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->h:Lcom/join/android/app/component/video/StandardVideoView;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->i:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 7
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->j:Lcom/flyco/tablayout/SlidingTabLayout;

    .line 8
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->k:Landroidx/viewpager/widget/ViewPager;

    .line 9
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->l:Lcom/join/mgps/customview/SlidingTabLayoutGameDetailImage;

    .line 10
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->m:Landroid/view/View;

    .line 11
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->n:Landroidx/viewpager/widget/ViewPager;

    .line 12
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->o:Landroid/view/View;

    .line 13
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->p:Lcom/google/android/material/appbar/AppBarLayout;

    .line 14
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->q:Landroid/widget/RelativeLayout;

    .line 15
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->r:Landroid/widget/RelativeLayout;

    .line 16
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->s:Landroid/widget/RelativeLayout;

    .line 17
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->t:Landroid/widget/TextView;

    .line 18
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->u:Landroid/widget/RelativeLayout;

    .line 19
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->v:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 20
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->w:Landroid/widget/ImageView;

    .line 21
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->x:Landroid/widget/TextView;

    .line 22
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->y:Landroid/widget/ProgressBar;

    .line 23
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->z:Landroid/widget/LinearLayout;

    .line 24
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->A:Landroid/widget/ImageView;

    .line 25
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->B:Landroid/widget/ImageView;

    .line 26
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->C:Lcom/join/mgps/customview/CustomerDownloadView;

    .line 27
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->D:Landroid/widget/ImageView;

    .line 28
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->E:Landroid/widget/TextView;

    .line 29
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->F:Landroid/widget/TextView;

    .line 30
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->G:Lcom/join/mgps/customview/CoordinatorLayout;

    .line 31
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->H:Landroid/view/View;

    .line 32
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->I:Landroid/view/View;

    .line 33
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->J:Landroid/view/View;

    .line 34
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->K:Landroid/view/View;

    .line 35
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->L:Landroid/widget/LinearLayout;

    .line 36
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->M:Landroid/widget/LinearLayout;

    .line 37
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->N:Landroid/view/View;

    .line 38
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->O:Landroid/view/View;

    .line 39
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->P:Lcom/flipboard/bottomsheet/BottomSheetLayout;

    .line 40
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->Q:Landroid/view/View;

    .line 41
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->R:Landroid/widget/LinearLayout;

    .line 42
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->S:Landroid/widget/TextView;

    .line 43
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->T:Lcom/join/kotlin/domain/widget/CornersLinearLayout;

    .line 44
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->U:Landroid/widget/RelativeLayout;

    .line 45
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->V:Landroid/widget/RelativeLayout;

    .line 46
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->W:Landroid/widget/RelativeLayout;

    .line 47
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->X:Landroid/widget/ImageView;

    .line 48
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->Y:Landroid/widget/RelativeLayout;

    .line 49
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->s2:Landroid/widget/TextView;

    .line 50
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->t2:Landroid/widget/ImageView;

    .line 51
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->u2:Landroid/widget/ImageView;

    .line 52
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->v2:Landroid/widget/ImageView;

    .line 53
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->w2:Landroid/widget/ImageView;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 9

    const v0, 0x7f0917a1

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->f:Landroid/widget/RelativeLayout;

    const v0, 0x7f090f3b

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->g:Landroid/view/View;

    const v0, 0x7f091799

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/component/video/StandardVideoView;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->h:Lcom/join/android/app/component/video/StandardVideoView;

    const v0, 0x7f090915

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->i:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f091363

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/flyco/tablayout/SlidingTabLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->j:Lcom/flyco/tablayout/SlidingTabLayout;

    const v0, 0x7f0917b0

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/viewpager/widget/ViewPager;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->k:Landroidx/viewpager/widget/ViewPager;

    const v0, 0x7f091357

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/SlidingTabLayoutGameDetailImage;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->l:Lcom/join/mgps/customview/SlidingTabLayoutGameDetailImage;

    const v0, 0x7f0901d6

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->m:Landroid/view/View;

    const v0, 0x7f0917b1

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/viewpager/widget/ViewPager;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->n:Landroidx/viewpager/widget/ViewPager;

    const v0, 0x7f091336

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->o:Landroid/view/View;

    const v0, 0x7f0900d6

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/appbar/AppBarLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->p:Lcom/google/android/material/appbar/AppBarLayout;

    const v0, 0x7f091483

    .line 12
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->q:Landroid/widget/RelativeLayout;

    const v0, 0x7f090483

    .line 13
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->r:Landroid/widget/RelativeLayout;

    const v0, 0x7f09147d

    .line 14
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->s:Landroid/widget/RelativeLayout;

    const v0, 0x7f090879

    .line 15
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->t:Landroid/widget/TextView;

    const v0, 0x7f09105f

    .line 16
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->u:Landroid/widget/RelativeLayout;

    const v0, 0x7f09087a

    .line 17
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->v:Landroidx/constraintlayout/widget/ConstraintLayout;

    const v0, 0x7f09027e

    .line 18
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->w:Landroid/widget/ImageView;

    const v0, 0x7f090ff0

    .line 19
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->x:Landroid/widget/TextView;

    const v0, 0x7f09027d

    .line 20
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->y:Landroid/widget/ProgressBar;

    const v0, 0x7f09047e

    .line 21
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->z:Landroid/widget/LinearLayout;

    const v0, 0x7f091223

    .line 22
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->A:Landroid/widget/ImageView;

    const v0, 0x7f09048b

    .line 23
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->B:Landroid/widget/ImageView;

    const v0, 0x7f091484

    .line 24
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/CustomerDownloadView;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->C:Lcom/join/mgps/customview/CustomerDownloadView;

    const v0, 0x7f0905c8

    .line 25
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->D:Landroid/widget/ImageView;

    const v0, 0x7f0905c7

    .line 26
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->E:Landroid/widget/TextView;

    const v0, 0x7f091489

    .line 27
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->F:Landroid/widget/TextView;

    const v0, 0x7f090dc7

    .line 28
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/CoordinatorLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->G:Lcom/join/mgps/customview/CoordinatorLayout;

    const v0, 0x7f090d82

    .line 29
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->H:Landroid/view/View;

    const v0, 0x7f090d7f

    .line 30
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->I:Landroid/view/View;

    const v0, 0x7f090910

    .line 31
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->J:Landroid/view/View;

    const v0, 0x7f091261

    .line 32
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->K:Landroid/view/View;

    const v0, 0x7f0901fb

    .line 33
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->L:Landroid/widget/LinearLayout;

    const v0, 0x7f09145e

    .line 34
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->M:Landroid/widget/LinearLayout;

    const v0, 0x7f0903c2

    .line 35
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->N:Landroid/view/View;

    const v0, 0x7f091329

    .line 36
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->O:Landroid/view/View;

    const v0, 0x7f091286

    .line 37
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/flipboard/bottomsheet/BottomSheetLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->P:Lcom/flipboard/bottomsheet/BottomSheetLayout;

    const v0, 0x7f091779

    .line 38
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->Q:Landroid/view/View;

    const v0, 0x7f090d14

    .line 39
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->R:Landroid/widget/LinearLayout;

    const v0, 0x7f091644

    .line 40
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->S:Landroid/widget/TextView;

    const v0, 0x7f09032a

    .line 41
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/domain/widget/CornersLinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->T:Lcom/join/kotlin/domain/widget/CornersLinearLayout;

    const v0, 0x7f091193

    .line 42
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->U:Landroid/widget/RelativeLayout;

    const v0, 0x7f090d41

    .line 43
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->V:Landroid/widget/RelativeLayout;

    const v0, 0x7f09118f

    .line 44
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->W:Landroid/widget/RelativeLayout;

    const v0, 0x7f0908e7

    .line 45
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->X:Landroid/widget/ImageView;

    const v0, 0x7f09114e

    .line 46
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->Y:Landroid/widget/RelativeLayout;

    const v0, 0x7f0901c6

    .line 47
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->s2:Landroid/widget/TextView;

    const v0, 0x7f09047f

    .line 48
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->t2:Landroid/widget/ImageView;

    const v0, 0x7f091224

    .line 49
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->u2:Landroid/widget/ImageView;

    const v0, 0x7f091486

    .line 50
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->v2:Landroid/widget/ImageView;

    const v0, 0x7f0907ab

    .line 51
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->w2:Landroid/widget/ImageView;

    const v0, 0x7f09110c

    .line 52
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f090014

    .line 53
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f09090f

    .line 54
    invoke-interface {p1, v2}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v2

    const v3, 0x7f090146

    .line 55
    invoke-interface {p1, v3}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v3

    const v4, 0x7f09105e

    .line 56
    invoke-interface {p1, v4}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v4

    const v5, 0x7f090468

    .line 57
    invoke-interface {p1, v5}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v5

    const v6, 0x7f091276    # 1.822001E38f

    .line 58
    invoke-interface {p1, v6}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v6

    const v7, 0x7f09127d

    .line 59
    invoke-interface {p1, v7}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v7

    const v8, 0x7f0905ca

    .line 60
    invoke-interface {p1, v8}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz v0, :cond_0

    .line 61
    new-instance v8, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$g0;

    invoke-direct {v8, p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$g0;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V

    invoke-virtual {v0, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz v1, :cond_1

    .line 62
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$r0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$r0;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 63
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->K:Landroid/view/View;

    if-eqz v0, :cond_2

    .line 64
    new-instance v1, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$u0;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$u0;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 65
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->R:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_3

    .line 66
    new-instance v1, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$v0;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$v0;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 67
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->X:Landroid/widget/ImageView;

    if-eqz v0, :cond_4

    .line 68
    new-instance v1, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$w0;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$w0;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_4
    if-eqz v2, :cond_5

    .line 69
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$x0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$x0;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_5
    if-eqz v3, :cond_6

    .line 70
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$y0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$y0;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V

    invoke-virtual {v3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_6
    if-eqz v4, :cond_7

    .line 71
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$a;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V

    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 72
    :cond_7
    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->J:Landroid/view/View;

    if-eqz v0, :cond_8

    .line 73
    new-instance v1, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$b;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 74
    :cond_8
    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->t:Landroid/widget/TextView;

    if-eqz v0, :cond_9

    .line 75
    new-instance v1, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$c;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$c;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 76
    :cond_9
    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->z:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_a

    .line 77
    new-instance v1, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$d;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$d;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 78
    :cond_a
    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->C:Lcom/join/mgps/customview/CustomerDownloadView;

    if-eqz v0, :cond_b

    .line 79
    new-instance v1, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$e;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$e;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_b
    if-eqz v5, :cond_c

    .line 80
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$f;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V

    invoke-virtual {v5, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_c
    if-eqz v6, :cond_d

    .line 81
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$g;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$g;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V

    invoke-virtual {v6, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_d
    if-eqz v7, :cond_e

    .line 82
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$h;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$h;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V

    invoke-virtual {v7, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_e
    if-eqz p1, :cond_f

    .line 83
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$i;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$i;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 84
    :cond_f
    invoke-virtual {p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->afterView()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;->K2:La4/c;

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
    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;->M2:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setCommentNumber(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$c0;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$c0;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showInstallButn()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$a0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$a0;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLoding()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$l;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$l;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLodingFailed()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$y;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$y;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showProgress()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$z;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$z;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showToast(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$u;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$u;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method t0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$l0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$l0;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method u0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$m0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$m0;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method updateButn()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$b0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$b0;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method updateDownloadView()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$h0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$h0;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method updateTitleButn(Lcom/join/mgps/dto/ResultMainBean;I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$j0;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt_$j0;-><init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt_;Lcom/join/mgps/dto/ResultMainBean;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
