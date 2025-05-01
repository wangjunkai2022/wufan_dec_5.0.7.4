.class public final Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;
.super Lcom/join/mgps/activity/GamedetialModleFourFragemnt;
.source "GamedetialModleFourFragemnt_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$u0;
    }
.end annotation


# instance fields
.field private final A2:Landroid/content/IntentFilter;

.field private final B2:Landroid/content/BroadcastReceiver;

.field private final x2:La4/c;

.field private y2:Landroid/view/View;

.field private final z2:Ljava/util/Map;
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
    invoke-direct {p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;->x2:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;->z2:Ljava/util/Map;

    .line 4
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;->A2:Landroid/content/IntentFilter;

    .line 5
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$k;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;->B2:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic T0(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->G0()V

    return-void
.end method

.method static synthetic U0(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->showToast(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic V0(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->showLoding()V

    return-void
.end method

.method static synthetic W0(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->v0()V

    return-void
.end method

.method static synthetic X0(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;Lcom/join/mgps/activity/GamedetialModleFourFragemnt$v;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->C0(Lcom/join/mgps/activity/GamedetialModleFourFragemnt$v;)V

    return-void
.end method

.method static synthetic Y0(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->showLodingFailed()V

    return-void
.end method

.method static synthetic Z0(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->showProgress()V

    return-void
.end method

.method static synthetic a1(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->showInstallButn()V

    return-void
.end method

.method static synthetic b1(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->updateButn()V

    return-void
.end method

.method static synthetic c1(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->setCommentNumber(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic d1(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->M0(I)V

    return-void
.end method

.method static synthetic e1(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->L0(I)V

    return-void
.end method

.method static synthetic f1(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->O0()V

    return-void
.end method

.method static synthetic g1(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;Lcom/join/mgps/dto/GamedetialModleFourBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->R0(Lcom/join/mgps/dto/GamedetialModleFourBean;)V

    return-void
.end method

.method static synthetic h1(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->updateDownloadView()V

    return-void
.end method

.method static synthetic i1(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->P0(Z)V

    return-void
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;->A2:Landroid/content/IntentFilter;

    const-string v0, "com.broadcast.bespeak.sussess"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic j1(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;Lcom/join/mgps/dto/ResultMainBean;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->updateTitleButn(Lcom/join/mgps/dto/ResultMainBean;I)V

    return-void
.end method

.method static synthetic k1(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->m0()V

    return-void
.end method

.method static synthetic l1(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->n0()V

    return-void
.end method

.method static synthetic m1(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->V()V

    return-void
.end method

.method static synthetic n1(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;Ljava/lang/String;Ljava/lang/String;Lcom/join/mgps/activity/GamedetialModleFourFragemnt$v;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->W(Ljava/lang/String;Ljava/lang/String;Lcom/join/mgps/activity/GamedetialModleFourFragemnt$v;)V

    return-void
.end method

.method static synthetic o1(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->h0()V

    return-void
.end method

.method static synthetic p1(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->getDownloadTaskInfo()V

    return-void
.end method

.method static synthetic q1(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->changeGameFollow(I)V

    return-void
.end method

.method static synthetic r1(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->Z()V

    return-void
.end method

.method static synthetic s1(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->N0()V

    return-void
.end method

.method static synthetic t1(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->K0()V

    return-void
.end method

.method static synthetic u1(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->t0()V

    return-void
.end method

.method static synthetic v1(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->F0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic w1(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;Lcom/join/mgps/dto/GameFromPopoWinBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->f0(Lcom/join/mgps/dto/GameFromPopoWinBean;)V

    return-void
.end method

.method static synthetic x1(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->i0()V

    return-void
.end method

.method public static y1()Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$u0;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$u0;

    invoke-direct {v0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$u0;-><init>()V

    return-object v0
.end method


# virtual methods
.method C0(Lcom/join/mgps/activity/GamedetialModleFourFragemnt$v;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$t;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$t;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;Lcom/join/mgps/activity/GamedetialModleFourFragemnt$v;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method F0(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$o;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$o;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method G0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$g;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$g;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V

    const-string v1, ""

    const-wide/16 v2, 0xfa0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method K0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$m;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$m;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method L0(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$b0;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$b0;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method M0(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$a0;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$a0;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method N0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$l;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$l;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method O0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$c0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$c0;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method P0(Z)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$e0;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$e0;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;Z)V

    const-string p1, ""

    const-wide/16 v1, 0x3e8

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method R0(Lcom/join/mgps/dto/GamedetialModleFourBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$i;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$i;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;Lcom/join/mgps/dto/GamedetialModleFourBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method V()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$j0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$j0;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method W(Ljava/lang/String;Ljava/lang/String;Lcom/join/mgps/activity/GamedetialModleFourFragemnt$v;)V
    .locals 10

    .line 1
    new-instance v9, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$k0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v9

    move-object v1, p0

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    invoke-direct/range {v0 .. v8}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$k0;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/join/mgps/activity/GamedetialModleFourFragemnt$v;)V

    invoke-static {v9}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method Z()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$j;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method changeGameFollow(I)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$n0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$n0;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;Ljava/lang/String;JLjava/lang/String;I)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method f0(Lcom/join/mgps/dto/GameFromPopoWinBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$p;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$p;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;Lcom/join/mgps/dto/GameFromPopoWinBean;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;->z2:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method getDownloadTaskInfo()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$m0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$m0;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method h0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$l0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$l0;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method i0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$q;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$q;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;->y2:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method m0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$h0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$h0;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method n0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$i0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$i0;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;->x2:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;->B2:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;->A2:Landroid/content/IntentFilter;

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

    iput-object p3, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;->y2:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c030c

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;->y2:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;->y2:Landroid/view/View;

    return-object p1
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;->B2:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 2
    invoke-super {p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->onDestroy()V

    return-void
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;->y2:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->f:Landroid/widget/RelativeLayout;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->g:Landroid/view/View;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->h:Lcom/join/android/app/component/video/StandardVideoView;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->i:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 7
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->j:Lcom/flyco/tablayout/SlidingTabLayout;

    .line 8
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->k:Landroidx/viewpager/widget/ViewPager;

    .line 9
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->l:Lcom/join/mgps/customview/SlidingTabLayoutGameDetailImage;

    .line 10
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->m:Landroid/view/View;

    .line 11
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->n:Landroidx/viewpager/widget/ViewPager;

    .line 12
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->o:Landroid/view/View;

    .line 13
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->p:Lcom/google/android/material/appbar/AppBarLayout;

    .line 14
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->q:Lcom/google/android/material/appbar/CollapsingToolbarLayout;

    .line 15
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->r:Landroid/widget/RelativeLayout;

    .line 16
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->s:Landroid/widget/RelativeLayout;

    .line 17
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->t:Landroid/widget/RelativeLayout;

    .line 18
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->u:Landroid/widget/TextView;

    .line 19
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->v:Landroid/widget/RelativeLayout;

    .line 20
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->w:Landroid/widget/RelativeLayout;

    .line 21
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->x:Landroid/widget/ImageView;

    .line 22
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->y:Landroid/widget/TextView;

    .line 23
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->z:Landroid/widget/ProgressBar;

    .line 24
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->A:Landroid/widget/LinearLayout;

    .line 25
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->B:Landroid/widget/ImageView;

    .line 26
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->C:Landroid/widget/ImageView;

    .line 27
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->D:Lcom/join/mgps/customview/CustomerDownloadView;

    .line 28
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->E:Landroid/widget/ImageView;

    .line 29
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->F:Landroid/widget/TextView;

    .line 30
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->G:Landroid/widget/TextView;

    .line 31
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->H:Landroidx/appcompat/widget/Toolbar;

    .line 32
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->I:Landroid/view/View;

    .line 33
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->J:Landroid/view/View;

    .line 34
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->K:Landroid/view/View;

    .line 35
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->L:Landroid/view/View;

    .line 36
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->M:Landroid/view/View;

    .line 37
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->N:Landroid/widget/LinearLayout;

    .line 38
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->O:Landroid/widget/LinearLayout;

    .line 39
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->P:Landroid/view/View;

    .line 40
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->Q:Landroid/view/View;

    .line 41
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->f2:Landroid/widget/TextView;

    .line 42
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->g2:Landroid/widget/ImageView;

    .line 43
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->h2:Landroid/widget/ImageView;

    .line 44
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->i2:Landroid/widget/ImageView;

    .line 45
    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->j2:Landroid/widget/ImageView;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 9

    const v0, 0x7f0917a1

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->f:Landroid/widget/RelativeLayout;

    const v0, 0x7f090f3b

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->g:Landroid/view/View;

    const v0, 0x7f091799

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/component/video/StandardVideoView;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->h:Lcom/join/android/app/component/video/StandardVideoView;

    const v0, 0x7f090915

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->i:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f091363

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/flyco/tablayout/SlidingTabLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->j:Lcom/flyco/tablayout/SlidingTabLayout;

    const v0, 0x7f0917b0

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/viewpager/widget/ViewPager;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->k:Landroidx/viewpager/widget/ViewPager;

    const v0, 0x7f091357

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/SlidingTabLayoutGameDetailImage;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->l:Lcom/join/mgps/customview/SlidingTabLayoutGameDetailImage;

    const v0, 0x7f0901d6

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->m:Landroid/view/View;

    const v0, 0x7f0917b1

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/viewpager/widget/ViewPager;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->n:Landroidx/viewpager/widget/ViewPager;

    const v0, 0x7f091336

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->o:Landroid/view/View;

    const v0, 0x7f0900d6

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/appbar/AppBarLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->p:Lcom/google/android/material/appbar/AppBarLayout;

    const v0, 0x7f090342

    .line 12
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->q:Lcom/google/android/material/appbar/CollapsingToolbarLayout;

    const v0, 0x7f091483

    .line 13
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->r:Landroid/widget/RelativeLayout;

    const v0, 0x7f090483

    .line 14
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->s:Landroid/widget/RelativeLayout;

    const v0, 0x7f09147d

    .line 15
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->t:Landroid/widget/RelativeLayout;

    const v0, 0x7f090879

    .line 16
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->u:Landroid/widget/TextView;

    const v0, 0x7f09105f

    .line 17
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->v:Landroid/widget/RelativeLayout;

    const v0, 0x7f09087a

    .line 18
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->w:Landroid/widget/RelativeLayout;

    const v0, 0x7f09027e

    .line 19
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->x:Landroid/widget/ImageView;

    const v0, 0x7f090ff0

    .line 20
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->y:Landroid/widget/TextView;

    const v0, 0x7f09027d

    .line 21
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->z:Landroid/widget/ProgressBar;

    const v0, 0x7f09047e

    .line 22
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->A:Landroid/widget/LinearLayout;

    const v0, 0x7f091223

    .line 23
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->B:Landroid/widget/ImageView;

    const v0, 0x7f09048b

    .line 24
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->C:Landroid/widget/ImageView;

    const v0, 0x7f091484

    .line 25
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/CustomerDownloadView;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->D:Lcom/join/mgps/customview/CustomerDownloadView;

    const v0, 0x7f0905c8

    .line 26
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->E:Landroid/widget/ImageView;

    const v0, 0x7f0905c7

    .line 27
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->F:Landroid/widget/TextView;

    const v0, 0x7f091489

    .line 28
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->G:Landroid/widget/TextView;

    const v0, 0x7f0914a2

    .line 29
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->H:Landroidx/appcompat/widget/Toolbar;

    const v0, 0x7f090dc7

    .line 30
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->I:Landroid/view/View;

    const v0, 0x7f090d82

    .line 31
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->J:Landroid/view/View;

    const v0, 0x7f090d7f

    .line 32
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->K:Landroid/view/View;

    const v0, 0x7f090910

    .line 33
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->L:Landroid/view/View;

    const v0, 0x7f091261

    .line 34
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->M:Landroid/view/View;

    const v0, 0x7f0901fb

    .line 35
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->N:Landroid/widget/LinearLayout;

    const v0, 0x7f09145e

    .line 36
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->O:Landroid/widget/LinearLayout;

    const v0, 0x7f0903c2

    .line 37
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->P:Landroid/view/View;

    const v0, 0x7f091329

    .line 38
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->Q:Landroid/view/View;

    const v0, 0x7f0901c6

    .line 39
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->f2:Landroid/widget/TextView;

    const v0, 0x7f09047f

    .line 40
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->g2:Landroid/widget/ImageView;

    const v0, 0x7f091224

    .line 41
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->h2:Landroid/widget/ImageView;

    const v0, 0x7f091486

    .line 42
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->i2:Landroid/widget/ImageView;

    const v0, 0x7f0907ab

    .line 43
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->j2:Landroid/widget/ImageView;

    const v0, 0x7f09110c

    .line 44
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f090014

    .line 45
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f09090f

    .line 46
    invoke-interface {p1, v2}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v2

    const v3, 0x7f090146

    .line 47
    invoke-interface {p1, v3}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v3

    const v4, 0x7f09105e

    .line 48
    invoke-interface {p1, v4}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v4

    const v5, 0x7f090468

    .line 49
    invoke-interface {p1, v5}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v5

    const v6, 0x7f091276    # 1.822001E38f

    .line 50
    invoke-interface {p1, v6}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v6

    const v7, 0x7f09127d

    .line 51
    invoke-interface {p1, v7}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v7

    const v8, 0x7f0905ca

    .line 52
    invoke-interface {p1, v8}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz v0, :cond_0

    .line 53
    new-instance v8, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$v;

    invoke-direct {v8, p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$v;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V

    invoke-virtual {v0, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz v1, :cond_1

    .line 54
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$g0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$g0;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 55
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->M:Landroid/view/View;

    if-eqz v0, :cond_2

    .line 56
    new-instance v1, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$o0;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$o0;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    if-eqz v2, :cond_3

    .line 57
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$p0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$p0;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    if-eqz v3, :cond_4

    .line 58
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$q0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$q0;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V

    invoke-virtual {v3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_4
    if-eqz v4, :cond_5

    .line 59
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$r0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$r0;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V

    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 60
    :cond_5
    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->L:Landroid/view/View;

    if-eqz v0, :cond_6

    .line 61
    new-instance v1, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$s0;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$s0;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 62
    :cond_6
    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->u:Landroid/widget/TextView;

    if-eqz v0, :cond_7

    .line 63
    new-instance v1, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$t0;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$t0;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 64
    :cond_7
    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->A:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_8

    .line 65
    new-instance v1, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$a;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 66
    :cond_8
    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->D:Lcom/join/mgps/customview/CustomerDownloadView;

    if-eqz v0, :cond_9

    .line 67
    new-instance v1, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$b;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_9
    if-eqz v5, :cond_a

    .line 68
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$c;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V

    invoke-virtual {v5, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_a
    if-eqz v6, :cond_b

    .line 69
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$d;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V

    invoke-virtual {v6, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_b
    if-eqz v7, :cond_c

    .line 70
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$e;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V

    invoke-virtual {v7, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_c
    if-eqz p1, :cond_d

    .line 71
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$f;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 72
    :cond_d
    invoke-virtual {p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->afterView()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;->x2:La4/c;

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
    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;->z2:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setCommentNumber(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$z;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$z;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showInstallButn()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$x;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$x;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLoding()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$h;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$h;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLodingFailed()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$u;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$u;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showProgress()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$w;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$w;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showToast(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$r;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$r;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method t0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$n;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$n;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method updateButn()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$y;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$y;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method updateDownloadView()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$d0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$d0;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method updateTitleButn(Lcom/join/mgps/dto/ResultMainBean;I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$f0;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$f0;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;Lcom/join/mgps/dto/ResultMainBean;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method v0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$s;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$s;-><init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
