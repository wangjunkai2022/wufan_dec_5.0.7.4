.class public final Lcom/join/mgps/activity/PapaMainFragment_;
.super Lcom/join/mgps/activity/PapaMainFragment;
.source "PapaMainFragment_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/PapaMainFragment_$p0;
    }
.end annotation


# instance fields
.field private final R1:La4/c;

.field private S1:Landroid/view/View;

.field private final T1:Ljava/util/Map;
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

.field private final U1:Landroid/content/IntentFilter;

.field private final V1:Landroid/content/BroadcastReceiver;

.field private final W1:Landroid/content/IntentFilter;

.field private final X1:Landroid/content/BroadcastReceiver;

.field private final Y1:Landroid/content/IntentFilter;

.field private final Z1:Landroid/content/BroadcastReceiver;

.field private final a2:Landroid/content/IntentFilter;

.field private final b2:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/PapaMainFragment;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment_;->R1:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment_;->T1:Ljava/util/Map;

    .line 4
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment_;->U1:Landroid/content/IntentFilter;

    .line 5
    new-instance v0, Lcom/join/mgps/activity/PapaMainFragment_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainFragment_$k;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;)V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment_;->V1:Landroid/content/BroadcastReceiver;

    .line 6
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment_;->W1:Landroid/content/IntentFilter;

    .line 7
    new-instance v0, Lcom/join/mgps/activity/PapaMainFragment_$v;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainFragment_$v;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;)V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment_;->X1:Landroid/content/BroadcastReceiver;

    .line 8
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment_;->Y1:Landroid/content/IntentFilter;

    .line 9
    new-instance v0, Lcom/join/mgps/activity/PapaMainFragment_$g0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainFragment_$g0;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;)V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment_;->Z1:Landroid/content/BroadcastReceiver;

    .line 10
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment_;->a2:Landroid/content/IntentFilter;

    .line 11
    new-instance v0, Lcom/join/mgps/activity/PapaMainFragment_$j0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainFragment_$j0;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;)V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment_;->b2:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic C1(Lcom/join/mgps/activity/PapaMainFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainFragment;->B1()V

    return-void
.end method

.method static synthetic D1(Lcom/join/mgps/activity/PapaMainFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainFragment;->o1()V

    return-void
.end method

.method static synthetic E1(Lcom/join/mgps/activity/PapaMainFragment_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/PapaMainFragment;->p1(Ljava/util/List;)V

    return-void
.end method

.method static synthetic F1(Lcom/join/mgps/activity/PapaMainFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/PapaMainFragment;->showMessage(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic G1(Lcom/join/mgps/activity/PapaMainFragment_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/PapaMainFragment;->t1(Ljava/util/List;)V

    return-void
.end method

.method static synthetic H1(Lcom/join/mgps/activity/PapaMainFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainFragment;->g1()V

    return-void
.end method

.method static synthetic I1(Lcom/join/mgps/activity/PapaMainFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainFragment;->L0()V

    return-void
.end method

.method static synthetic J1(Lcom/join/mgps/activity/PapaMainFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainFragment;->showLoding()V

    return-void
.end method

.method static synthetic K1(Lcom/join/mgps/activity/PapaMainFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainFragment;->showLodingFailed()V

    return-void
.end method

.method static synthetic L1(Lcom/join/mgps/activity/PapaMainFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainFragment;->showMain()V

    return-void
.end method

.method static synthetic M1(Lcom/join/mgps/activity/PapaMainFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainFragment;->A0()V

    return-void
.end method

.method static synthetic N1(Lcom/join/mgps/activity/PapaMainFragment_;Lcom/join/mgps/dto/HomeFloatData;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/PapaMainFragment;->n1(Lcom/join/mgps/dto/HomeFloatData;)V

    return-void
.end method

.method static synthetic O1(Lcom/join/mgps/activity/PapaMainFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainFragment;->y1()V

    return-void
.end method

.method static synthetic P1(Lcom/join/mgps/activity/PapaMainFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/PapaMainFragment;->u1(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic Q1(Lcom/join/mgps/activity/PapaMainFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainFragment;->y0()V

    return-void
.end method

.method static synthetic R1(Lcom/join/mgps/activity/PapaMainFragment_;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/PapaMainFragment;->B0(ILjava/lang/String;)V

    return-void
.end method

.method static synthetic S1(Lcom/join/mgps/activity/PapaMainFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/PapaMainFragment;->p0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic T1(Lcom/join/mgps/activity/PapaMainFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainFragment;->u0()V

    return-void
.end method

.method static synthetic U1(Lcom/join/mgps/activity/PapaMainFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainFragment;->G0()V

    return-void
.end method

.method static synthetic V1(Lcom/join/mgps/activity/PapaMainFragment_;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/PapaMainFragment;->I0(Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic W1(Lcom/join/mgps/activity/PapaMainFragment_;Lcom/join/mgps/dto/PAPAHomeBeanV6;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/PapaMainFragment;->a1(Lcom/join/mgps/dto/PAPAHomeBeanV6;)V

    return-void
.end method

.method static synthetic X1(Lcom/join/mgps/activity/PapaMainFragment_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/PapaMainFragment;->Z0(Ljava/util/List;)V

    return-void
.end method

.method static synthetic Y1(Lcom/join/mgps/activity/PapaMainFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainFragment;->t0()V

    return-void
.end method

.method static synthetic Z1(Lcom/join/mgps/activity/PapaMainFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainFragment;->m1()V

    return-void
.end method

.method static synthetic a2(Lcom/join/mgps/activity/PapaMainFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainFragment;->J0()V

    return-void
.end method

.method static synthetic b2(Lcom/join/mgps/activity/PapaMainFragment_;Lcom/join/mgps/dto/PAPAHomeBeanV6;Ljava/lang/String;IZ)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lcom/join/mgps/activity/PapaMainFragment;->v1(Lcom/join/mgps/dto/PAPAHomeBeanV6;Ljava/lang/String;IZ)V

    return-void
.end method

.method static synthetic c2(Lcom/join/mgps/activity/PapaMainFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainFragment;->H0()V

    return-void
.end method

.method static synthetic d2(Lcom/join/mgps/activity/PapaMainFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainFragment;->M0()V

    return-void
.end method

.method static synthetic e2(Lcom/join/mgps/activity/PapaMainFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainFragment;->O0()V

    return-void
.end method

.method static synthetic f2(Lcom/join/mgps/activity/PapaMainFragment_;Ljava/util/List;Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/PapaMainFragment;->j1(Ljava/util/List;Z)V

    return-void
.end method

.method public static g2()Lcom/join/mgps/activity/PapaMainFragment_$p0;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainFragment_$p0;

    invoke-direct {v0}, Lcom/join/mgps/activity/PapaMainFragment_$p0;-><init>()V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 2
    new-instance v0, Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment;->E:Lcom/join/mgps/pref/PrefDef_;

    .line 3
    invoke-static {p0}, La4/c;->b(La4/b;)V

    const v0, 0x7f10029a

    .line 4
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment;->e:Ljava/lang/String;

    const v0, 0x7f1000b6

    .line 5
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/PapaMainFragment;->f:Ljava/lang/String;

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainFragment_;->U1:Landroid/content/IntentFilter;

    const-string v0, "com.join.android.app.mgsim.wufun.broadcast.account_status_uidchange"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 7
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainFragment_;->W1:Landroid/content/IntentFilter;

    const-string v0, "com.broadcast.bespeak.sussess"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 8
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainFragment_;->Y1:Landroid/content/IntentFilter;

    const-string v0, "com.papa.maintab.clicked"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 9
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainFragment_;->a2:Landroid/content/IntentFilter;

    const-string v0, "com.join.android.app.mgsim.wufun.broadcast.refreshMyGame"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 10
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainFragment_;->a2:Landroid/content/IntentFilter;

    const-string v0, "com.join.android.app.mgsim.wufun.broadcast.paygamefinish"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method A0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainFragment_$w;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainFragment_$w;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x7d0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method B0(ILjava/lang/String;)V
    .locals 9

    .line 1
    new-instance v8, Lcom/join/mgps/activity/PapaMainFragment_$a0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v8

    move-object v1, p0

    move v6, p1

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/join/mgps/activity/PapaMainFragment_$a0;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;Ljava/lang/String;JLjava/lang/String;ILjava/lang/String;)V

    invoke-static {v8}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method B1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainFragment_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainFragment_$c;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method G0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/PapaMainFragment_$d0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/PapaMainFragment_$d0;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method H0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainFragment_$i;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainFragment_$i;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0xbb8

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method I0(Ljava/lang/String;I)V
    .locals 9

    .line 1
    new-instance v8, Lcom/join/mgps/activity/PapaMainFragment_$e0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v8

    move-object v1, p0

    move-object v6, p1

    move v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/join/mgps/activity/PapaMainFragment_$e0;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;I)V

    invoke-static {v8}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method J0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainFragment_$g;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainFragment_$g;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method L0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainFragment_$r;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainFragment_$r;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method M0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainFragment_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainFragment_$j;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method O0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainFragment_$l;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainFragment_$l;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method Z0(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/BannerBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v7, Lcom/join/mgps/activity/PapaMainFragment_$h0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/PapaMainFragment_$h0;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;Ljava/lang/String;JLjava/lang/String;Ljava/util/List;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method a1(Lcom/join/mgps/dto/PAPAHomeBeanV6;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/PapaMainFragment_$f0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/PapaMainFragment_$f0;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;Ljava/lang/String;JLjava/lang/String;Lcom/join/mgps/dto/PAPAHomeBeanV6;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method g1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainFragment_$q;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainFragment_$q;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment_;->T1:Ljava/util/Map;

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
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment_;->S1:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method j1(Ljava/util/List;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/BannerBean;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainFragment_$m;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/activity/PapaMainFragment_$m;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;Ljava/util/List;Z)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method m1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainFragment_$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainFragment_$f;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method n1(Lcom/join/mgps/dto/HomeFloatData;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainFragment_$x;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/PapaMainFragment_$x;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;Lcom/join/mgps/dto/HomeFloatData;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method o1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainFragment_$n;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainFragment_$n;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment_;->R1:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/PapaMainFragment_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainFragment_;->V1:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainFragment_;->U1:Landroid/content/IntentFilter;

    invoke-virtual {p1, v1, v2}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainFragment_;->X1:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainFragment_;->W1:Landroid/content/IntentFilter;

    invoke-virtual {p1, v1, v2}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainFragment_;->Z1:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainFragment_;->Y1:Landroid/content/IntentFilter;

    invoke-virtual {p1, v1, v2}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainFragment_;->b2:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainFragment_;->a2:Landroid/content/IntentFilter;

    invoke-virtual {p1, v1, v2}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 8
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p3

    iput-object p3, p0, Lcom/join/mgps/activity/PapaMainFragment_;->S1:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c0632

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/PapaMainFragment_;->S1:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainFragment_;->S1:Landroid/view/View;

    return-object p1
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainFragment_;->V1:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainFragment_;->X1:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainFragment_;->Z1:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainFragment_;->b2:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 5
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainFragment;->onDestroy()V

    return-void
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment_;->S1:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment;->d:Lcom/join/mgps/customview/XListView2;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment;->h:Landroid/widget/TextView;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment;->i:Landroid/widget/LinearLayout;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment;->j:Landroid/widget/LinearLayout;

    .line 7
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment;->k:Landroid/widget/ImageView;

    .line 8
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment;->l:Landroid/view/View;

    .line 9
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment;->m:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 10
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment;->n:Landroid/widget/ImageView;

    .line 11
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment;->o:Landroid/view/View;

    .line 12
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment;->P:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    .line 13
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment;->Q:Landroid/view/View;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 4

    const v0, 0x7f090c97

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/XListView2;

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment;->d:Lcom/join/mgps/customview/XListView2;

    const v0, 0x7f091739

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment;->h:Landroid/widget/TextView;

    const v0, 0x7f090d82

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment;->i:Landroid/widget/LinearLayout;

    const v0, 0x7f090d7f

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment;->j:Landroid/widget/LinearLayout;

    const v0, 0x7f090e6b

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment;->k:Landroid/widget/ImageView;

    const v0, 0x7f091477

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment;->l:Landroid/view/View;

    const v0, 0x7f0908e3

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment;->m:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f0907ab

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment;->n:Landroid/widget/ImageView;

    const v0, 0x7f09132b

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment;->o:Landroid/view/View;

    const v0, 0x7f090db3

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment;->P:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    const v0, 0x7f091211

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment;->Q:Landroid/view/View;

    const v0, 0x7f09110c

    .line 12
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f091276    # 1.822001E38f

    .line 13
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f091261

    .line 14
    invoke-interface {p1, v2}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    .line 15
    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainFragment;->Q:Landroid/view/View;

    if-eqz v2, :cond_0

    .line 16
    new-instance v3, Lcom/join/mgps/activity/PapaMainFragment_$k0;

    invoke-direct {v3, p0}, Lcom/join/mgps/activity/PapaMainFragment_$k0;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    :cond_0
    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainFragment;->k:Landroid/widget/ImageView;

    if-eqz v2, :cond_1

    .line 18
    new-instance v3, Lcom/join/mgps/activity/PapaMainFragment_$l0;

    invoke-direct {v3, p0}, Lcom/join/mgps/activity/PapaMainFragment_$l0;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;)V

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    :cond_1
    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainFragment;->m:Lcom/facebook/drawee/view/SimpleDraweeView;

    if-eqz v2, :cond_2

    .line 20
    new-instance v3, Lcom/join/mgps/activity/PapaMainFragment_$m0;

    invoke-direct {v3, p0}, Lcom/join/mgps/activity/PapaMainFragment_$m0;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;)V

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    if-eqz v0, :cond_3

    .line 21
    new-instance v2, Lcom/join/mgps/activity/PapaMainFragment_$n0;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/PapaMainFragment_$n0;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    if-eqz v1, :cond_4

    .line 22
    new-instance v0, Lcom/join/mgps/activity/PapaMainFragment_$o0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainFragment_$o0;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_4
    if-eqz p1, :cond_5

    .line 23
    new-instance v0, Lcom/join/mgps/activity/PapaMainFragment_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainFragment_$a;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 24
    :cond_5
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainFragment;->l:Landroid/view/View;

    if-eqz p1, :cond_6

    .line 25
    new-instance v0, Lcom/join/mgps/activity/PapaMainFragment_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainFragment_$b;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 26
    :cond_6
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainFragment;->afterViews()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainFragment_;->R1:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method p0(Ljava/lang/String;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/PapaMainFragment_$b0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/PapaMainFragment_$b0;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method p1(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/VipPopData;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainFragment_$d;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/PapaMainFragment_$d;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;Ljava/util/List;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment_;->T1:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method showLoding()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainFragment_$s;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainFragment_$s;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLodingFailed()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainFragment_$t;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainFragment_$t;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showMain()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainFragment_$u;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainFragment_$u;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showMessage(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainFragment_$o;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/PapaMainFragment_$o;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method t0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/PapaMainFragment_$i0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/PapaMainFragment_$i0;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method t1(Ljava/util/List;)V
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
    new-instance v0, Lcom/join/mgps/activity/PapaMainFragment_$p;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/PapaMainFragment_$p;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;Ljava/util/List;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method u0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/PapaMainFragment_$c0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/PapaMainFragment_$c0;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method u1(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainFragment_$e;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/PapaMainFragment_$e;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method v1(Lcom/join/mgps/dto/PAPAHomeBeanV6;Ljava/lang/String;IZ)V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/PapaMainFragment_$h;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/PapaMainFragment_$h;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;Lcom/join/mgps/dto/PAPAHomeBeanV6;Ljava/lang/String;IZ)V

    const-string p1, ""

    const-wide/16 p2, 0x0

    invoke-static {p1, v6, p2, p3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method y0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/PapaMainFragment_$z;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/PapaMainFragment_$z;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method y1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainFragment_$y;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainFragment_$y;-><init>(Lcom/join/mgps/activity/PapaMainFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
