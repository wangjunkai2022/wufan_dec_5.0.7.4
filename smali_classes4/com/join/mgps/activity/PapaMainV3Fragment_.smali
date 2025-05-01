.class public final Lcom/join/mgps/activity/PapaMainV3Fragment_;
.super Lcom/join/mgps/activity/PapaMainV3Fragment;
.source "PapaMainV3Fragment_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/PapaMainV3Fragment_$y0;
    }
.end annotation


# static fields
.field public static final q2:Ljava/lang/String; = "gameId"


# instance fields
.field private final d2:La4/c;

.field private e2:Landroid/view/View;

.field private final f2:Ljava/util/Map;
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

.field private final g2:Landroid/content/IntentFilter;

.field private final h2:Landroid/content/BroadcastReceiver;

.field private final i2:Landroid/content/IntentFilter;

.field private final j2:Landroid/content/BroadcastReceiver;

.field private final k2:Landroid/content/IntentFilter;

.field private final l2:Landroid/content/BroadcastReceiver;

.field private final m2:Landroid/content/IntentFilter;

.field private final n2:Landroid/content/BroadcastReceiver;

.field private final o2:Landroid/content/IntentFilter;

.field private final p2:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->d2:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->f2:Ljava/util/Map;

    .line 4
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->g2:Landroid/content/IntentFilter;

    .line 5
    new-instance v0, Lcom/join/mgps/activity/PapaMainV3Fragment_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment_$k;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->h2:Landroid/content/BroadcastReceiver;

    .line 6
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->i2:Landroid/content/IntentFilter;

    .line 7
    new-instance v0, Lcom/join/mgps/activity/PapaMainV3Fragment_$v;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment_$v;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->j2:Landroid/content/BroadcastReceiver;

    .line 8
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->k2:Landroid/content/IntentFilter;

    .line 9
    new-instance v0, Lcom/join/mgps/activity/PapaMainV3Fragment_$g0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment_$g0;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->l2:Landroid/content/BroadcastReceiver;

    .line 10
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->m2:Landroid/content/IntentFilter;

    .line 11
    new-instance v0, Lcom/join/mgps/activity/PapaMainV3Fragment_$r0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment_$r0;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->n2:Landroid/content/BroadcastReceiver;

    .line 12
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->o2:Landroid/content/IntentFilter;

    .line 13
    new-instance v0, Lcom/join/mgps/activity/PapaMainV3Fragment_$t0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment_$t0;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->p2:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic A2(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->showMain()V

    return-void
.end method

.method static synthetic B2(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->Y0()V

    return-void
.end method

.method static synthetic C2(Lcom/join/mgps/activity/PapaMainV3Fragment_;Lcom/join/mgps/dto/HomeFloatData;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/PapaMainV3Fragment;->Y1(Lcom/join/mgps/dto/HomeFloatData;)V

    return-void
.end method

.method static synthetic D2(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->i2()V

    return-void
.end method

.method static synthetic E2(Lcom/join/mgps/activity/PapaMainV3Fragment_;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/PapaMainV3Fragment;->F1(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    return-void
.end method

.method static synthetic F2(Lcom/join/mgps/activity/PapaMainV3Fragment_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/PapaMainV3Fragment;->a2(Ljava/util/List;)V

    return-void
.end method

.method static synthetic G2(Lcom/join/mgps/activity/PapaMainV3Fragment_;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/PapaMainV3Fragment;->E0(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    return-void
.end method

.method static synthetic H2(Lcom/join/mgps/activity/PapaMainV3Fragment_;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/PapaMainV3Fragment;->J0(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    return-void
.end method

.method static synthetic I2(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->e1()V

    return-void
.end method

.method static synthetic J2(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->d1()V

    return-void
.end method

.method static synthetic K2(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->W0()V

    return-void
.end method

.method static synthetic L2(Lcom/join/mgps/activity/PapaMainV3Fragment_;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/PapaMainV3Fragment;->Z0(ILjava/lang/String;)V

    return-void
.end method

.method static synthetic M2(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->I0()V

    return-void
.end method

.method static synthetic N2(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->T1()V

    return-void
.end method

.method static synthetic O2(Lcom/join/mgps/activity/PapaMainV3Fragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/PapaMainV3Fragment;->F0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic P2(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->R0()V

    return-void
.end method

.method static synthetic Q2(Lcom/join/mgps/activity/PapaMainV3Fragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/PapaMainV3Fragment;->d2(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic R2(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->k1()V

    return-void
.end method

.method static synthetic S2(Lcom/join/mgps/activity/PapaMainV3Fragment_;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/PapaMainV3Fragment;->l1(Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic T2(Lcom/join/mgps/activity/PapaMainV3Fragment_;Lcom/join/mgps/dto/PAPAHomeBeanV7;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/PapaMainV3Fragment;->H1(Lcom/join/mgps/dto/PAPAHomeBeanV7;)V

    return-void
.end method

.method static synthetic U2(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->Q0()V

    return-void
.end method

.method static synthetic V2(Lcom/join/mgps/activity/PapaMainV3Fragment_;Ljava/lang/String;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/PapaMainV3Fragment;->P0(Ljava/lang/String;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    return-void
.end method

.method static synthetic W2(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->X1()V

    return-void
.end method

.method static synthetic X2(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->m1()V

    return-void
.end method

.method static synthetic Y2(Lcom/join/mgps/activity/PapaMainV3Fragment_;Lcom/join/mgps/dto/PAPAHomeBeanV7;Ljava/lang/String;IZ)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lcom/join/mgps/activity/PapaMainV3Fragment;->f2(Lcom/join/mgps/dto/PAPAHomeBeanV7;Ljava/lang/String;IZ)V

    return-void
.end method

.method static synthetic Z2(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->q1()V

    return-void
.end method

.method static synthetic a3(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->G1()V

    return-void
.end method

.method static synthetic b3(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->s1()V

    return-void
.end method

.method public static c3()Lcom/join/mgps/activity/PapaMainV3Fragment_$y0;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainV3Fragment_$y0;

    invoke-direct {v0}, Lcom/join/mgps/activity/PapaMainV3Fragment_$y0;-><init>()V

    return-object v0
.end method

.method private d3()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "gameId"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->t:Ljava/lang/String;

    :cond_0
    return-void
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

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->z:Lcom/join/mgps/pref/PrefDef_;

    .line 3
    invoke-static {p0}, La4/c;->b(La4/b;)V

    const v0, 0x7f10029a

    .line 4
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->e:Ljava/lang/String;

    const v0, 0x7f1000b6

    .line 5
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->f:Ljava/lang/String;

    .line 6
    invoke-direct {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment_;->d3()V

    .line 7
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->g2:Landroid/content/IntentFilter;

    const-string v0, "com.join.android.app.mgsim.wufun.broadcast.account_status_uidchange"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 8
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->i2:Landroid/content/IntentFilter;

    const-string v0, "android.net.wifi.STATE_CHANGE"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 9
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->i2:Landroid/content/IntentFilter;

    const-string v0, "android.net.wifi.WIFI_STATE_CHANGED"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 10
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->i2:Landroid/content/IntentFilter;

    const-string v0, "android.net.wifi.SCAN_RESULTS"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 11
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->i2:Landroid/content/IntentFilter;

    const-string v0, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 12
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->k2:Landroid/content/IntentFilter;

    const-string v0, "com.broadcast.bespeak.sussess"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 13
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->m2:Landroid/content/IntentFilter;

    const-string v0, "com.papa.maintab.clicked"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 14
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->o2:Landroid/content/IntentFilter;

    const-string v0, "com.join.android.app.mgsim.wufun.broadcast.refreshMyGame"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 15
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->o2:Landroid/content/IntentFilter;

    const-string v0, "com.join.android.app.mgsim.wufun.broadcast.paygamefinish"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic s2(Lcom/join/mgps/activity/PapaMainV3Fragment_;Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/PapaMainV3Fragment;->t1(Landroid/content/Intent;)V

    return-void
.end method

.method static synthetic t2(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->Z1()V

    return-void
.end method

.method static synthetic u2(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->m2()V

    return-void
.end method

.method static synthetic v2(Lcom/join/mgps/activity/PapaMainV3Fragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/PapaMainV3Fragment;->showMessage(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic w2(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->Q1()V

    return-void
.end method

.method static synthetic x2(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->p1()V

    return-void
.end method

.method static synthetic y2(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->showLoding()V

    return-void
.end method

.method static synthetic z2(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->showLodingFailed()V

    return-void
.end method


# virtual methods
.method E0(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainV3Fragment_$c0;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/PapaMainV3Fragment_$c0;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method F0(Ljava/lang/String;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/PapaMainV3Fragment_$l0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/PapaMainV3Fragment_$l0;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method F1(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainV3Fragment_$b0;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/PapaMainV3Fragment_$b0;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method G1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainV3Fragment_$o;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment_$o;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method H1(Lcom/join/mgps/dto/PAPAHomeBeanV7;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/PapaMainV3Fragment_$p0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/PapaMainV3Fragment_$p0;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;Ljava/lang/String;JLjava/lang/String;Lcom/join/mgps/dto/PAPAHomeBeanV7;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method I0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/PapaMainV3Fragment_$j0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/PapaMainV3Fragment_$j0;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method J0(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainV3Fragment_$d0;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/PapaMainV3Fragment_$d0;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method P0(Ljava/lang/String;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V
    .locals 9

    .line 1
    new-instance v8, Lcom/join/mgps/activity/PapaMainV3Fragment_$s0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v8

    move-object v1, p0

    move-object v6, p1

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/join/mgps/activity/PapaMainV3Fragment_$s0;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    invoke-static {v8}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method Q0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/PapaMainV3Fragment_$q0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/PapaMainV3Fragment_$q0;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method Q1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainV3Fragment_$s;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment_$s;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method R0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/PapaMainV3Fragment_$m0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/PapaMainV3Fragment_$m0;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method T1()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/PapaMainV3Fragment_$k0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/PapaMainV3Fragment_$k0;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method W0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/PapaMainV3Fragment_$h0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/PapaMainV3Fragment_$h0;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method X1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainV3Fragment_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment_$j;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method Y0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainV3Fragment_$y;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment_$y;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x7d0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method Y1(Lcom/join/mgps/dto/HomeFloatData;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainV3Fragment_$z;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/PapaMainV3Fragment_$z;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;Lcom/join/mgps/dto/HomeFloatData;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method Z0(ILjava/lang/String;)V
    .locals 9

    .line 1
    new-instance v8, Lcom/join/mgps/activity/PapaMainV3Fragment_$i0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v8

    move-object v1, p0

    move v6, p1

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/join/mgps/activity/PapaMainV3Fragment_$i0;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;Ljava/lang/String;JLjava/lang/String;ILjava/lang/String;)V

    invoke-static {v8}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method Z1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainV3Fragment_$q;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment_$q;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method a2(Ljava/util/List;)V
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
    new-instance v0, Lcom/join/mgps/activity/PapaMainV3Fragment_$h;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/PapaMainV3Fragment_$h;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;Ljava/util/List;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method d1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainV3Fragment_$f0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment_$f0;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method d2(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainV3Fragment_$i;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/PapaMainV3Fragment_$i;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method e1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainV3Fragment_$e0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment_$e0;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method f2(Lcom/join/mgps/dto/PAPAHomeBeanV7;Ljava/lang/String;IZ)V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/PapaMainV3Fragment_$m;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/PapaMainV3Fragment_$m;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;Lcom/join/mgps/dto/PAPAHomeBeanV7;Ljava/lang/String;IZ)V

    const-string p1, ""

    const-wide/16 p2, 0x0

    invoke-static {p1, v6, p2, p3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->f2:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method i2()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainV3Fragment_$a0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment_$a0;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->e2:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method k1()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/PapaMainV3Fragment_$n0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/PapaMainV3Fragment_$n0;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method l1(Ljava/lang/String;I)V
    .locals 9

    .line 1
    new-instance v8, Lcom/join/mgps/activity/PapaMainV3Fragment_$o0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v8

    move-object v1, p0

    move-object v6, p1

    move v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/join/mgps/activity/PapaMainV3Fragment_$o0;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;I)V

    invoke-static {v8}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method m1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainV3Fragment_$l;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment_$l;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method m2()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainV3Fragment_$g;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment_$g;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->d2:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/PapaMainV3Fragment_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->h2:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->g2:Landroid/content/IntentFilter;

    invoke-virtual {p1, v1, v2}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->j2:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->i2:Landroid/content/IntentFilter;

    invoke-virtual {p1, v1, v2}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->l2:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->k2:Landroid/content/IntentFilter;

    invoke-virtual {p1, v1, v2}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->n2:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->m2:Landroid/content/IntentFilter;

    invoke-virtual {p1, v1, v2}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 8
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->p2:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->o2:Landroid/content/IntentFilter;

    invoke-virtual {p1, v1, v2}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 9
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p3

    iput-object p3, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->e2:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c0634

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->e2:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->e2:Landroid/view/View;

    return-object p1
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->h2:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->j2:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->l2:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->n2:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->p2:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 6
    invoke-super {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->onDestroy()V

    return-void
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->e2:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->h:Landroid/widget/TextView;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->i:Landroid/widget/LinearLayout;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->j:Landroid/widget/LinearLayout;

    .line 7
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->k:Landroid/widget/ImageView;

    .line 8
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->l:Landroid/view/View;

    .line 9
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->m:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 10
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->n:Landroid/widget/ImageView;

    .line 11
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->o:Landroid/view/View;

    .line 12
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->p:Landroid/widget/FrameLayout;

    .line 13
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->q:Landroid/widget/ViewFlipper;

    .line 14
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->r:Landroid/widget/ImageView;

    .line 15
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->s:Lcom/google/android/material/appbar/AppBarLayout;

    .line 16
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->J:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    .line 17
    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->K:Landroid/view/View;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 4

    const v0, 0x7f090c97

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    const v0, 0x7f091739

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->h:Landroid/widget/TextView;

    const v0, 0x7f090d82

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->i:Landroid/widget/LinearLayout;

    const v0, 0x7f090d7f

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->j:Landroid/widget/LinearLayout;

    const v0, 0x7f090e6b

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->k:Landroid/widget/ImageView;

    const v0, 0x7f091477

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->l:Landroid/view/View;

    const v0, 0x7f0908e3

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->m:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f0907ab

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->n:Landroid/widget/ImageView;

    const v0, 0x7f09132b

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->o:Landroid/view/View;

    const v0, 0x7f0905aa

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->p:Landroid/widget/FrameLayout;

    const v0, 0x7f091563

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ViewFlipper;

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->q:Landroid/widget/ViewFlipper;

    const v0, 0x7f090900

    .line 12
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->r:Landroid/widget/ImageView;

    const v0, 0x7f0900ff

    .line 13
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/appbar/AppBarLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->s:Lcom/google/android/material/appbar/AppBarLayout;

    const v0, 0x7f090db3

    .line 14
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->J:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    const v0, 0x7f091211

    .line 15
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->K:Landroid/view/View;

    const v0, 0x7f09110c

    .line 16
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f091276    # 1.822001E38f

    .line 17
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f091261

    .line 18
    invoke-interface {p1, v2}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    .line 19
    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->K:Landroid/view/View;

    if-eqz v2, :cond_0

    .line 20
    new-instance v3, Lcom/join/mgps/activity/PapaMainV3Fragment_$u0;

    invoke-direct {v3, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment_$u0;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 21
    :cond_0
    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->k:Landroid/widget/ImageView;

    if-eqz v2, :cond_1

    .line 22
    new-instance v3, Lcom/join/mgps/activity/PapaMainV3Fragment_$v0;

    invoke-direct {v3, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment_$v0;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 23
    :cond_1
    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->m:Lcom/facebook/drawee/view/SimpleDraweeView;

    if-eqz v2, :cond_2

    .line 24
    new-instance v3, Lcom/join/mgps/activity/PapaMainV3Fragment_$w0;

    invoke-direct {v3, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment_$w0;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    if-eqz v0, :cond_3

    .line 25
    new-instance v2, Lcom/join/mgps/activity/PapaMainV3Fragment_$x0;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment_$x0;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    if-eqz v1, :cond_4

    .line 26
    new-instance v0, Lcom/join/mgps/activity/PapaMainV3Fragment_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment_$a;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_4
    if-eqz p1, :cond_5

    .line 27
    new-instance v0, Lcom/join/mgps/activity/PapaMainV3Fragment_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment_$b;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 28
    :cond_5
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->l:Landroid/view/View;

    if-eqz p1, :cond_6

    .line 29
    new-instance v0, Lcom/join/mgps/activity/PapaMainV3Fragment_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment_$c;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 30
    :cond_6
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->p:Landroid/widget/FrameLayout;

    if-eqz p1, :cond_7

    .line 31
    new-instance v0, Lcom/join/mgps/activity/PapaMainV3Fragment_$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment_$d;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 32
    :cond_7
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment;->r:Landroid/widget/ImageView;

    if-eqz p1, :cond_8

    .line 33
    new-instance v0, Lcom/join/mgps/activity/PapaMainV3Fragment_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment_$e;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 34
    :cond_8
    invoke-virtual {p0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->afterViews()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->d2:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method p1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainV3Fragment_$t;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment_$t;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment_;->f2:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method q1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainV3Fragment_$n;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment_$n;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method s1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainV3Fragment_$p;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment_$p;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLoding()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainV3Fragment_$u;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment_$u;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLodingFailed()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainV3Fragment_$w;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment_$w;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showMain()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainV3Fragment_$x;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/PapaMainV3Fragment_$x;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showMessage(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainV3Fragment_$r;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/PapaMainV3Fragment_$r;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method t1(Landroid/content/Intent;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/PapaMainV3Fragment_$f;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/PapaMainV3Fragment_$f;-><init>(Lcom/join/mgps/activity/PapaMainV3Fragment_;Landroid/content/Intent;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
