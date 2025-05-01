.class public final Lcom/join/mgps/activity/GameDetialModleFourActivity_;
.super Lcom/join/mgps/activity/GameDetialModleFourActivity;
.source "GameDetialModleFourActivity_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/GameDetialModleFourActivity_$a1;
    }
.end annotation


# instance fields
.field private final a2:La4/c;

.field private b2:Landroid/view/View;

.field private final c2:Ljava/util/Map;
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

.field private final d2:Landroid/content/IntentFilter;

.field private final e2:Landroid/content/BroadcastReceiver;

.field private final f2:Landroid/content/IntentFilter;

.field private final g2:Landroid/content/BroadcastReceiver;

.field private final h2:Landroid/content/IntentFilter;

.field private final i2:Landroid/content/BroadcastReceiver;

.field private final j2:Landroid/content/IntentFilter;

.field private final k2:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->a2:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->c2:Ljava/util/Map;

    .line 4
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->d2:Landroid/content/IntentFilter;

    .line 5
    new-instance v0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$k;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->e2:Landroid/content/BroadcastReceiver;

    .line 6
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->f2:Landroid/content/IntentFilter;

    .line 7
    new-instance v0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$v;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$v;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->g2:Landroid/content/BroadcastReceiver;

    .line 8
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->h2:Landroid/content/IntentFilter;

    .line 9
    new-instance v0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$g0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$g0;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->i2:Landroid/content/BroadcastReceiver;

    .line 10
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->j2:Landroid/content/IntentFilter;

    .line 11
    new-instance v0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$r0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$r0;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->k2:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic A1(Lcom/join/mgps/activity/GameDetialModleFourActivity_;Lcom/join/mgps/dto/GiftPackageDataOperationBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->X0(Lcom/join/mgps/dto/GiftPackageDataOperationBean;)V

    return-void
.end method

.method static synthetic B1(Lcom/join/mgps/activity/GameDetialModleFourActivity_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->i1(I)V

    return-void
.end method

.method static synthetic C1(Lcom/join/mgps/activity/GameDetialModleFourActivity_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->h1(I)V

    return-void
.end method

.method static synthetic D1(Lcom/join/mgps/activity/GameDetialModleFourActivity_;II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->j0(II)V

    return-void
.end method

.method static synthetic E1(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->k1()V

    return-void
.end method

.method static synthetic F1(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Y0()V

    return-void
.end method

.method static synthetic G1(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Z0()V

    return-void
.end method

.method static synthetic H1(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->z0()V

    return-void
.end method

.method static synthetic I1(Lcom/join/mgps/activity/GameDetialModleFourActivity_;Lcom/join/mgps/dto/CommentBaseBean;II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->D0(Lcom/join/mgps/dto/CommentBaseBean;II)V

    return-void
.end method

.method static synthetic J1(Lcom/join/mgps/activity/GameDetialModleFourActivity_;Lcom/join/mgps/dto/CommentBaseBean;II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->F0(Lcom/join/mgps/dto/CommentBaseBean;II)V

    return-void
.end method

.method static synthetic K1(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->x0()V

    return-void
.end method

.method static synthetic L1(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->t0()V

    return-void
.end method

.method static synthetic M1(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->u0()V

    return-void
.end method

.method static synthetic N1(Lcom/join/mgps/activity/GameDetialModleFourActivity_;Lcom/join/mgps/dto/InformationCommentBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->H0(Lcom/join/mgps/dto/InformationCommentBean;)V

    return-void
.end method

.method static synthetic O1(Lcom/join/mgps/activity/GameDetialModleFourActivity_;Ljava/lang/String;ZII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->O0(Ljava/lang/String;ZII)V

    return-void
.end method

.method static synthetic P1(Lcom/join/mgps/activity/GameDetialModleFourActivity_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->changeGameFollow(I)V

    return-void
.end method

.method static synthetic Q1(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->getDownloadTaskInfo()V

    return-void
.end method

.method static synthetic R1(Lcom/join/mgps/activity/GameDetialModleFourActivity_;Lcom/join/mgps/dto/GiftPackageDataInfoBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->v0(Lcom/join/mgps/dto/GiftPackageDataInfoBean;)V

    return-void
.end method

.method static synthetic S1(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->i0()V

    return-void
.end method

.method static synthetic T1(Lcom/join/mgps/activity/GameDetialModleFourActivity_;Lcom/join/mgps/dto/CommentResponse;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->P0(Lcom/join/mgps/dto/CommentResponse;)V

    return-void
.end method

.method static synthetic U1(Lcom/join/mgps/activity/GameDetialModleFourActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->showToast(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic V1(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->showLodingFailed()V

    return-void
.end method

.method static synthetic W1(Lcom/join/mgps/activity/GameDetialModleFourActivity_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->showMain(Ljava/util/List;)V

    return-void
.end method

.method static synthetic X1(Lcom/join/mgps/activity/GameDetialModleFourActivity_;Lcom/join/mgps/dto/GamedetialModleFourBean;Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->o1(Lcom/join/mgps/dto/GamedetialModleFourBean;Z)V

    return-void
.end method

.method static synthetic Y1(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->a1()V

    return-void
.end method

.method public static Z1()Lcom/join/mgps/activity/GameDetialModleFourActivity_$a1;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$a1;

    invoke-direct {v0}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$a1;-><init>()V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->D1:Lcom/join/mgps/pref/PrefDef_;

    .line 2
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->d2:Landroid/content/IntentFilter;

    const-string v0, "com.join.android.app.mgsim.wufun.broadcast.account_status_uidchange"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->f2:Landroid/content/IntentFilter;

    const-string v0, "com.broadcast.bespeak.sussess"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->h2:Landroid/content/IntentFilter;

    const-string v0, "com.join,mgps.sim.sdkgamePayfinish"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->j2:Landroid/content/IntentFilter;

    const-string v0, "com.join.android.app.mgsim.wufun.broadcast.refreshMyGame"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 7
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->j2:Landroid/content/IntentFilter;

    const-string v0, "com.join.android.app.mgsim.wufun.broadcast.paygamefinish"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic q1(Lcom/join/mgps/activity/GameDetialModleFourActivity_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->j1(Ljava/util/List;)V

    return-void
.end method

.method static synthetic r1(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->C0()V

    return-void
.end method

.method static synthetic s1(Lcom/join/mgps/activity/GameDetialModleFourActivity_;Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->l1(Z)V

    return-void
.end method

.method static synthetic t1(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->e1()V

    return-void
.end method

.method static synthetic u1(Lcom/join/mgps/activity/GameDetialModleFourActivity_;Lcom/join/mgps/dto/ResultMainBean;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->updateTitleButn(Lcom/join/mgps/dto/ResultMainBean;I)V

    return-void
.end method

.method static synthetic v1(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->showProgress()V

    return-void
.end method

.method static synthetic w1(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->showInstallButn()V

    return-void
.end method

.method static synthetic x1(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->updateButn()V

    return-void
.end method

.method static synthetic y1(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->updateDownloadView()V

    return-void
.end method

.method static synthetic z1(Lcom/join/mgps/activity/GameDetialModleFourActivity_;Lcom/join/mgps/dto/GiftPackageDataInfoBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->W0(Lcom/join/mgps/dto/GiftPackageDataInfoBean;)V

    return-void
.end method


# virtual methods
.method C0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$t;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$t;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method D0(Lcom/join/mgps/dto/CommentBaseBean;II)V
    .locals 10

    .line 1
    new-instance v9, Lcom/join/mgps/activity/GameDetialModleFourActivity_$k0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v9

    move-object v1, p0

    move-object v6, p1

    move v7, p2

    move v8, p3

    invoke-direct/range {v0 .. v8}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$k0;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;Ljava/lang/String;JLjava/lang/String;Lcom/join/mgps/dto/CommentBaseBean;II)V

    invoke-static {v9}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method F0(Lcom/join/mgps/dto/CommentBaseBean;II)V
    .locals 10

    .line 1
    new-instance v9, Lcom/join/mgps/activity/GameDetialModleFourActivity_$l0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v9

    move-object v1, p0

    move-object v6, p1

    move v7, p2

    move v8, p3

    invoke-direct/range {v0 .. v8}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$l0;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;Ljava/lang/String;JLjava/lang/String;Lcom/join/mgps/dto/CommentBaseBean;II)V

    invoke-static {v9}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method H0(Lcom/join/mgps/dto/InformationCommentBean;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/GameDetialModleFourActivity_$p0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$p0;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;Ljava/lang/String;JLjava/lang/String;Lcom/join/mgps/dto/InformationCommentBean;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method O0(Ljava/lang/String;ZII)V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/GameDetialModleFourActivity_$m;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$m;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;Ljava/lang/String;ZII)V

    const-string p1, ""

    const-wide/16 p2, 0x0

    invoke-static {p1, v6, p2, p3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method P0(Lcom/join/mgps/dto/CommentResponse;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$n;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$n;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;Lcom/join/mgps/dto/CommentResponse;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method W0(Lcom/join/mgps/dto/GiftPackageDataInfoBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$b0;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$b0;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;Lcom/join/mgps/dto/GiftPackageDataInfoBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method X0(Lcom/join/mgps/dto/GiftPackageDataOperationBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$c0;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$c0;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;Lcom/join/mgps/dto/GiftPackageDataOperationBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method Y0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$h0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$h0;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method Z0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$i0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$i0;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method a1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$s;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$s;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0xfa0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method changeGameFollow(I)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/GameDetialModleFourActivity_$q0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$q0;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;Ljava/lang/String;JLjava/lang/String;I)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method e1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$u;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$u;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->c2:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method getDownloadTaskInfo()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/GameDetialModleFourActivity_$s0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$s0;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method h1(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$e0;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$e0;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method i0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/GameDetialModleFourActivity_$u0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$u0;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method i1(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$d0;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$d0;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;I)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->b2:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public j0(II)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$l;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$l;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;II)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method j1(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CollectionBeanSub;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$i;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$i;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;Ljava/util/List;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method k1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$f0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$f0;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method l1(Z)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$j;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$j;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;Z)V

    const-string p1, ""

    const-wide/16 v1, 0x3e8

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method o1(Lcom/join/mgps/dto/GamedetialModleFourBean;Z)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$r;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$r;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;Lcom/join/mgps/dto/GamedetialModleFourBean;Z)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->a2:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->e2:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->d2:Landroid/content/IntentFilter;

    invoke-virtual {p1, v1, v2}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->g2:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->f2:Landroid/content/IntentFilter;

    invoke-virtual {p1, v1, v2}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->i2:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->h2:Landroid/content/IntentFilter;

    invoke-virtual {p1, v1, v2}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->k2:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->j2:Landroid/content/IntentFilter;

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

    iput-object p3, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->b2:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c030b

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->b2:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->b2:Landroid/view/View;

    return-object p1
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->e2:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->g2:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->i2:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->k2:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 5
    invoke-super {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->onDestroy()V

    return-void
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->b2:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->c:Landroid/widget/TextView;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->d:Landroid/widget/TextView;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->e:Landroid/widget/ImageView;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->f:Landroid/widget/ImageView;

    .line 7
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->g:Landroid/widget/ImageView;

    .line 8
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->h:Landroid/widget/ImageView;

    .line 9
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->i:Landroid/widget/ImageView;

    .line 10
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->j:Landroid/widget/TextView;

    .line 11
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->k:Landroid/widget/LinearLayout;

    .line 12
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->l:Landroid/widget/LinearLayout;

    .line 13
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->m:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    .line 14
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->n:Landroid/widget/TextView;

    .line 15
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->o:Landroid/widget/RelativeLayout;

    .line 16
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->p:Landroid/widget/RelativeLayout;

    .line 17
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->q:Landroid/widget/ImageView;

    .line 18
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->r:Landroid/widget/TextView;

    .line 19
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->s:Landroid/widget/ProgressBar;

    .line 20
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->t:Landroid/widget/LinearLayout;

    .line 21
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->u:Landroid/widget/RelativeLayout;

    .line 22
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->v:Landroid/widget/RelativeLayout;

    .line 23
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->w:Landroid/widget/RelativeLayout;

    .line 24
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->x:Landroid/widget/ImageView;

    .line 25
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->y:Landroid/widget/ImageView;

    .line 26
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->z:Landroid/widget/LinearLayout;

    .line 27
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->A:Landroid/widget/LinearLayout;

    .line 28
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->B:Landroid/widget/Button;

    .line 29
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->C:Landroid/widget/RelativeLayout;

    .line 30
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->D:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 31
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->E:Landroid/widget/TextView;

    .line 32
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->F:Landroidx/core/widget/NestedScrollView;

    .line 33
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Q1:Landroid/widget/TextView;

    .line 34
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->R1:Landroid/widget/ImageView;

    .line 35
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->S1:Landroid/widget/ImageView;

    .line 36
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->T1:Landroid/widget/ImageView;

    .line 37
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->U1:Landroid/widget/ImageView;

    .line 38
    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->V1:Lcom/join/mgps/customview/CustomerDownloadView;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 4

    const v0, 0x7f091479

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->c:Landroid/widget/TextView;

    const v0, 0x7f091489

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->d:Landroid/widget/TextView;

    const v0, 0x7f09090f

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->e:Landroid/widget/ImageView;

    const v0, 0x7f091211

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->f:Landroid/widget/ImageView;

    const v0, 0x7f091276    # 1.822001E38f

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->g:Landroid/widget/ImageView;

    const v0, 0x7f090468

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->h:Landroid/widget/ImageView;

    const v0, 0x7f0905c8

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->i:Landroid/widget/ImageView;

    const v0, 0x7f0905c7

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->j:Landroid/widget/TextView;

    const v0, 0x7f0905ca

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->k:Landroid/widget/LinearLayout;

    const v0, 0x7f090c1f

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->l:Landroid/widget/LinearLayout;

    const v0, 0x7f0910e8

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->m:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    const v0, 0x7f090879

    .line 12
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->n:Landroid/widget/TextView;

    const v0, 0x7f09105f

    .line 13
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->o:Landroid/widget/RelativeLayout;

    const v0, 0x7f09087a

    .line 14
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->p:Landroid/widget/RelativeLayout;

    const v0, 0x7f09027e

    .line 15
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->q:Landroid/widget/ImageView;

    const v0, 0x7f090ff0

    .line 16
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->r:Landroid/widget/TextView;

    const v0, 0x7f09027d

    .line 17
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->s:Landroid/widget/ProgressBar;

    const v0, 0x7f09047e

    .line 18
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->t:Landroid/widget/LinearLayout;

    const v0, 0x7f091483

    .line 19
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->u:Landroid/widget/RelativeLayout;

    const v0, 0x7f090483

    .line 20
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->v:Landroid/widget/RelativeLayout;

    const v0, 0x7f09147d

    .line 21
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->w:Landroid/widget/RelativeLayout;

    const v0, 0x7f091223

    .line 22
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->x:Landroid/widget/ImageView;

    const v0, 0x7f09048b

    .line 23
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->y:Landroid/widget/ImageView;

    const v0, 0x7f090d7f

    .line 24
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->z:Landroid/widget/LinearLayout;

    const v0, 0x7f090d82

    .line 25
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->A:Landroid/widget/LinearLayout;

    const v0, 0x7f091261

    .line 26
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->B:Landroid/widget/Button;

    const v0, 0x7f091461

    .line 27
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->C:Landroid/widget/RelativeLayout;

    const v0, 0x7f0906d1

    .line 28
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->D:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f0906cc

    .line 29
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->E:Landroid/widget/TextView;

    const v0, 0x7f090f39

    .line 30
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/core/widget/NestedScrollView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->F:Landroidx/core/widget/NestedScrollView;

    const v0, 0x7f0901c6

    .line 31
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Q1:Landroid/widget/TextView;

    const v0, 0x7f09047f

    .line 32
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->R1:Landroid/widget/ImageView;

    const v0, 0x7f091224

    .line 33
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->S1:Landroid/widget/ImageView;

    const v0, 0x7f091486

    .line 34
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->T1:Landroid/widget/ImageView;

    const v0, 0x7f0907ab

    .line 35
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->U1:Landroid/widget/ImageView;

    const v0, 0x7f091484

    .line 36
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/CustomerDownloadView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->V1:Lcom/join/mgps/customview/CustomerDownloadView;

    const v0, 0x7f09110c

    .line 37
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f090146

    .line 38
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f09105e

    .line 39
    invoke-interface {p1, v2}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v2

    const v3, 0x7f09127d

    .line 40
    invoke-interface {p1, v3}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz v0, :cond_0

    .line 41
    new-instance v3, Lcom/join/mgps/activity/GameDetialModleFourActivity_$v0;

    invoke-direct {v3, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$v0;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 42
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->k:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    .line 43
    new-instance v3, Lcom/join/mgps/activity/GameDetialModleFourActivity_$w0;

    invoke-direct {v3, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$w0;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 44
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->B:Landroid/widget/Button;

    if-eqz v0, :cond_2

    .line 45
    new-instance v3, Lcom/join/mgps/activity/GameDetialModleFourActivity_$x0;

    invoke-direct {v3, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$x0;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 46
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->e:Landroid/widget/ImageView;

    if-eqz v0, :cond_3

    .line 47
    new-instance v3, Lcom/join/mgps/activity/GameDetialModleFourActivity_$y0;

    invoke-direct {v3, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$y0;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    if-eqz v1, :cond_4

    .line 48
    new-instance v0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$z0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$z0;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 49
    :cond_4
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->x:Landroid/widget/ImageView;

    if-eqz v0, :cond_5

    .line 50
    new-instance v1, Lcom/join/mgps/activity/GameDetialModleFourActivity_$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$a;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 51
    :cond_5
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->n:Landroid/widget/TextView;

    if-eqz v0, :cond_6

    .line 52
    new-instance v1, Lcom/join/mgps/activity/GameDetialModleFourActivity_$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$b;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_6
    if-eqz v2, :cond_7

    .line 53
    new-instance v0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$c;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 54
    :cond_7
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->t:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_8

    .line 55
    new-instance v1, Lcom/join/mgps/activity/GameDetialModleFourActivity_$d;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$d;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 56
    :cond_8
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->V1:Lcom/join/mgps/customview/CustomerDownloadView;

    if-eqz v0, :cond_9

    .line 57
    new-instance v1, Lcom/join/mgps/activity/GameDetialModleFourActivity_$e;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$e;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 58
    :cond_9
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->h:Landroid/widget/ImageView;

    if-eqz v0, :cond_a

    .line 59
    new-instance v1, Lcom/join/mgps/activity/GameDetialModleFourActivity_$f;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$f;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 60
    :cond_a
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->g:Landroid/widget/ImageView;

    if-eqz v0, :cond_b

    .line 61
    new-instance v1, Lcom/join/mgps/activity/GameDetialModleFourActivity_$g;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$g;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_b
    if-eqz p1, :cond_c

    .line 62
    new-instance v0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$h;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$h;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 63
    :cond_c
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->afterView()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->a2:La4/c;

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
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->c2:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method showInstallButn()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$y;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$y;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLodingFailed()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$p;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$p;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showMain(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommentBaseBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$q;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$q;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;Ljava/util/List;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showProgress()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$x;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$x;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showToast(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$o;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$o;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method t0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/GameDetialModleFourActivity_$n0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$n0;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method u0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/GameDetialModleFourActivity_$o0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$o0;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method updateButn()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$z;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$z;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method updateDownloadView()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$a0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$a0;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method updateTitleButn(Lcom/join/mgps/dto/ResultMainBean;I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$w;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$w;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;Lcom/join/mgps/dto/ResultMainBean;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method v0(Lcom/join/mgps/dto/GiftPackageDataInfoBean;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/GameDetialModleFourActivity_$t0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$t0;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;Ljava/lang/String;JLjava/lang/String;Lcom/join/mgps/dto/GiftPackageDataInfoBean;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method x0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/GameDetialModleFourActivity_$m0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$m0;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method z0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/GameDetialModleFourActivity_$j0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/GameDetialModleFourActivity_$j0;-><init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method
