.class public final Lcom/join/mgps/fragment/ForumIndexFragment_;
.super Lcom/join/mgps/fragment/ForumIndexFragment;
.source "ForumIndexFragment_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/ForumIndexFragment_$c0;
    }
.end annotation


# instance fields
.field private final A1:Landroid/content/BroadcastReceiver;

.field private final X:La4/c;

.field private Y:Landroid/view/View;

.field private final Z:Ljava/util/Map;
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

.field private final p0:Landroid/content/IntentFilter;

.field private final p1:Landroid/content/BroadcastReceiver;

.field private final v1:Landroid/content/IntentFilter;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment_;->X:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment_;->Z:Ljava/util/Map;

    .line 4
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment_;->p0:Landroid/content/IntentFilter;

    .line 5
    new-instance v0, Lcom/join/mgps/fragment/ForumIndexFragment_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/ForumIndexFragment_$k;-><init>(Lcom/join/mgps/fragment/ForumIndexFragment_;)V

    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment_;->p1:Landroid/content/BroadcastReceiver;

    .line 6
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment_;->v1:Landroid/content/IntentFilter;

    .line 7
    new-instance v0, Lcom/join/mgps/fragment/ForumIndexFragment_$u;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/ForumIndexFragment_$u;-><init>(Lcom/join/mgps/fragment/ForumIndexFragment_;)V

    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment_;->A1:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic T0(Lcom/join/mgps/fragment/ForumIndexFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->M0()V

    return-void
.end method

.method static synthetic U0(Lcom/join/mgps/fragment/ForumIndexFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->L0()V

    return-void
.end method

.method static synthetic V0(Lcom/join/mgps/fragment/ForumIndexFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->G0()V

    return-void
.end method

.method static synthetic W0(Lcom/join/mgps/fragment/ForumIndexFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/ForumIndexFragment;->T(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic X0(Lcom/join/mgps/fragment/ForumIndexFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->E0()V

    return-void
.end method

.method static synthetic Y0(Lcom/join/mgps/fragment/ForumIndexFragment_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/ForumIndexFragment;->R0(I)V

    return-void
.end method

.method static synthetic Z0(Lcom/join/mgps/fragment/ForumIndexFragment_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/ForumIndexFragment;->P0(I)V

    return-void
.end method

.method static synthetic a1(Lcom/join/mgps/fragment/ForumIndexFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->S0()V

    return-void
.end method

.method static synthetic b1(Lcom/join/mgps/fragment/ForumIndexFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->Q0()V

    return-void
.end method

.method static synthetic c1(Lcom/join/mgps/fragment/ForumIndexFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->u0()V

    return-void
.end method

.method static synthetic d1(Lcom/join/mgps/fragment/ForumIndexFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->n0()V

    return-void
.end method

.method static synthetic e1(Lcom/join/mgps/fragment/ForumIndexFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/ForumIndexFragment;->B0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic f1(Lcom/join/mgps/fragment/ForumIndexFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->l0()V

    return-void
.end method

.method static synthetic g1(Lcom/join/mgps/fragment/ForumIndexFragment_;ZLjava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/fragment/ForumIndexFragment;->H0(ZLjava/util/List;)V

    return-void
.end method

.method static synthetic h1(Lcom/join/mgps/fragment/ForumIndexFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->j0()V

    return-void
.end method

.method static synthetic i1(Lcom/join/mgps/fragment/ForumIndexFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->O0()V

    return-void
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->M:Lcom/join/mgps/pref/PrefDef_;

    .line 2
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment_;->p0:Landroid/content/IntentFilter;

    const-string v0, "com.join.android.app.mgsim.wufun.broadcast.account_status_uidchange"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment_;->v1:Landroid/content/IntentFilter;

    const-string v0, "com.join.android.app.mgsim.wufun.broadcast.backup_game_finish"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic j1(Lcom/join/mgps/fragment/ForumIndexFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->f0()V

    return-void
.end method

.method static synthetic k1(Lcom/join/mgps/fragment/ForumIndexFragment_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/ForumIndexFragment;->y0(Ljava/util/List;)V

    return-void
.end method

.method static synthetic l1(Lcom/join/mgps/fragment/ForumIndexFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->I0()V

    return-void
.end method

.method static synthetic m1(Lcom/join/mgps/fragment/ForumIndexFragment_;Lcom/join/mgps/dto/ForumData$HomepageRecommendGroup;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/ForumIndexFragment;->F0(Lcom/join/mgps/dto/ForumData$HomepageRecommendGroup;)V

    return-void
.end method

.method static synthetic n1(Lcom/join/mgps/fragment/ForumIndexFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->p0()V

    return-void
.end method

.method static synthetic o1(Lcom/join/mgps/fragment/ForumIndexFragment_;Lcom/join/mgps/dto/ForumBannerBean$ForumBannerDataBannerBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/ForumIndexFragment;->D0(Lcom/join/mgps/dto/ForumBannerBean$ForumBannerDataBannerBean;)V

    return-void
.end method

.method static synthetic p1(Lcom/join/mgps/fragment/ForumIndexFragment_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/ForumIndexFragment;->e0(I)V

    return-void
.end method

.method static synthetic q1(Lcom/join/mgps/fragment/ForumIndexFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->z0()V

    return-void
.end method

.method public static r1()Lcom/join/mgps/fragment/ForumIndexFragment_$c0;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/ForumIndexFragment_$c0;

    invoke-direct {v0}, Lcom/join/mgps/fragment/ForumIndexFragment_$c0;-><init>()V

    return-object v0
.end method


# virtual methods
.method B0(Ljava/lang/String;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/fragment/ForumIndexFragment_$p;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/fragment/ForumIndexFragment_$p;-><init>(Lcom/join/mgps/fragment/ForumIndexFragment_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method D0(Lcom/join/mgps/dto/ForumBannerBean$ForumBannerDataBannerBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/ForumIndexFragment_$c;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/ForumIndexFragment_$c;-><init>(Lcom/join/mgps/fragment/ForumIndexFragment_;Lcom/join/mgps/dto/ForumBannerBean$ForumBannerDataBannerBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method E0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/ForumIndexFragment_$h;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/ForumIndexFragment_$h;-><init>(Lcom/join/mgps/fragment/ForumIndexFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method F0(Lcom/join/mgps/dto/ForumData$HomepageRecommendGroup;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/ForumIndexFragment_$a;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/ForumIndexFragment_$a;-><init>(Lcom/join/mgps/fragment/ForumIndexFragment_;Lcom/join/mgps/dto/ForumData$HomepageRecommendGroup;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method G0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/ForumIndexFragment_$y;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/ForumIndexFragment_$y;-><init>(Lcom/join/mgps/fragment/ForumIndexFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method H0(ZLjava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/RecommendLabelTag;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/ForumIndexFragment_$z;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/fragment/ForumIndexFragment_$z;-><init>(Lcom/join/mgps/fragment/ForumIndexFragment_;ZLjava/util/List;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method I0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/ForumIndexFragment_$b0;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/ForumIndexFragment_$b0;-><init>(Lcom/join/mgps/fragment/ForumIndexFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method L0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/ForumIndexFragment_$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/ForumIndexFragment_$f;-><init>(Lcom/join/mgps/fragment/ForumIndexFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method M0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/ForumIndexFragment_$x;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/ForumIndexFragment_$x;-><init>(Lcom/join/mgps/fragment/ForumIndexFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method O0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/ForumIndexFragment_$s;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/ForumIndexFragment_$s;-><init>(Lcom/join/mgps/fragment/ForumIndexFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method P0(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/ForumIndexFragment_$j;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/ForumIndexFragment_$j;-><init>(Lcom/join/mgps/fragment/ForumIndexFragment_;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method Q0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/ForumIndexFragment_$m;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/ForumIndexFragment_$m;-><init>(Lcom/join/mgps/fragment/ForumIndexFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method R0(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/ForumIndexFragment_$i;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/ForumIndexFragment_$i;-><init>(Lcom/join/mgps/fragment/ForumIndexFragment_;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method S0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/ForumIndexFragment_$l;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/ForumIndexFragment_$l;-><init>(Lcom/join/mgps/fragment/ForumIndexFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method T(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/ForumIndexFragment_$g;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/ForumIndexFragment_$g;-><init>(Lcom/join/mgps/fragment/ForumIndexFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method e0(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/ForumIndexFragment_$d;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/ForumIndexFragment_$d;-><init>(Lcom/join/mgps/fragment/ForumIndexFragment_;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method f0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/ForumIndexFragment_$t;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/ForumIndexFragment_$t;-><init>(Lcom/join/mgps/fragment/ForumIndexFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment_;->Z:Ljava/util/Map;

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
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment_;->Y:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method j0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/ForumIndexFragment_$r;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/ForumIndexFragment_$r;-><init>(Lcom/join/mgps/fragment/ForumIndexFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method l0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/ForumIndexFragment_$q;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/ForumIndexFragment_$q;-><init>(Lcom/join/mgps/fragment/ForumIndexFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method n0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/ForumIndexFragment_$o;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/ForumIndexFragment_$o;-><init>(Lcom/join/mgps/fragment/ForumIndexFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment_;->X:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/ForumIndexFragment_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment_;->p1:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lcom/join/mgps/fragment/ForumIndexFragment_;->p0:Landroid/content/IntentFilter;

    invoke-virtual {p1, v1, v2}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment_;->A1:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lcom/join/mgps/fragment/ForumIndexFragment_;->v1:Landroid/content/IntentFilter;

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

    iput-object p3, p0, Lcom/join/mgps/fragment/ForumIndexFragment_;->Y:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c05b5

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment_;->Y:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment_;->Y:Landroid/view/View;

    return-object p1
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment_;->p1:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment_;->A1:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 3
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    return-void
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment_;->Y:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->c:Landroid/view/View;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->d:Landroid/widget/ImageView;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->e:Landroid/view/View;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->f:Landroid/widget/TextView;

    .line 7
    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->g:Lcom/join/mgps/customview/ForumLoadingView;

    .line 8
    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->h:Lru/noties/scrollable/ScrollableLayout;

    .line 9
    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->i:Lcom/join/mgps/customview/ForumIndexHeaderView;

    .line 10
    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->j:Lcom/join/mgps/customview/SlidingTabLayout4;

    .line 11
    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->k:Landroidx/viewpager/widget/ViewPager;

    .line 12
    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->l:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    .line 13
    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->m:Landroid/widget/RelativeLayout;

    .line 14
    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->A:Landroid/widget/RelativeLayout;

    .line 15
    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->C:Landroid/widget/TextView;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 1

    const v0, 0x7f09006f

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->c:Landroid/view/View;

    const v0, 0x7f090146

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->d:Landroid/widget/ImageView;

    const v0, 0x7f090039

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->e:Landroid/view/View;

    const v0, 0x7f09060b

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->f:Landroid/widget/TextView;

    const v0, 0x7f090d57

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/ForumLoadingView;

    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->g:Lcom/join/mgps/customview/ForumLoadingView;

    const v0, 0x7f091201

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lru/noties/scrollable/ScrollableLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->h:Lru/noties/scrollable/ScrollableLayout;

    const v0, 0x7f090740

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/ForumIndexHeaderView;

    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->i:Lcom/join/mgps/customview/ForumIndexHeaderView;

    const v0, 0x7f091364

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/SlidingTabLayout4;

    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->j:Lcom/join/mgps/customview/SlidingTabLayout4;

    const v0, 0x7f0917b0

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/viewpager/widget/ViewPager;

    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->k:Landroidx/viewpager/widget/ViewPager;

    const v0, 0x7f090db3

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->l:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    const v0, 0x7f091211

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->m:Landroid/widget/RelativeLayout;

    const v0, 0x7f090c43

    .line 12
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->A:Landroid/widget/RelativeLayout;

    const v0, 0x7f0901c5

    .line 13
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->C:Landroid/widget/TextView;

    .line 14
    iget-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->e:Landroid/view/View;

    if-eqz p1, :cond_0

    .line 15
    new-instance v0, Lcom/join/mgps/fragment/ForumIndexFragment_$v;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/ForumIndexFragment_$v;-><init>(Lcom/join/mgps/fragment/ForumIndexFragment_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 16
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->d:Landroid/widget/ImageView;

    if-eqz p1, :cond_1

    .line 17
    new-instance v0, Lcom/join/mgps/fragment/ForumIndexFragment_$w;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/ForumIndexFragment_$w;-><init>(Lcom/join/mgps/fragment/ForumIndexFragment_;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 18
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->afterViews()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment_;->X:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method p0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/ForumIndexFragment_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/ForumIndexFragment_$b;-><init>(Lcom/join/mgps/fragment/ForumIndexFragment_;)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment_;->Z:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method u0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/ForumIndexFragment_$n;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/ForumIndexFragment_$n;-><init>(Lcom/join/mgps/fragment/ForumIndexFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method y0(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/RecommenGroupClassify;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/ForumIndexFragment_$a0;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/ForumIndexFragment_$a0;-><init>(Lcom/join/mgps/fragment/ForumIndexFragment_;Ljava/util/List;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method z0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/ForumIndexFragment_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/ForumIndexFragment_$e;-><init>(Lcom/join/mgps/fragment/ForumIndexFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
