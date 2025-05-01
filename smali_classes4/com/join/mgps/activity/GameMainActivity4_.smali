.class public final Lcom/join/mgps/activity/GameMainActivity4_;
.super Lcom/join/mgps/activity/GameMainActivity4;
.source "GameMainActivity4_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/GameMainActivity4_$i0;
    }
.end annotation


# static fields
.field public static final L2:Ljava/lang/String; = "gameId"

.field public static final M2:Ljava/lang/String; = "from"


# instance fields
.field private final J2:La4/c;

.field private final K2:Ljava/util/Map;
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
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainActivity4;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4_;->J2:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4_;->K2:Ljava/util/Map;

    return-void
.end method

.method static synthetic A2(Lcom/join/mgps/activity/GameMainActivity4_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameMainActivity4;->getData()V

    return-void
.end method

.method static synthetic B2(Lcom/join/mgps/activity/GameMainActivity4_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameMainActivity4;->H1()V

    return-void
.end method

.method static synthetic C2(Lcom/join/mgps/activity/GameMainActivity4_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameMainActivity4;->B1()V

    return-void
.end method

.method static synthetic D2(Lcom/join/mgps/activity/GameMainActivity4_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GameMainActivity4;->G1(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic E2(Lcom/join/mgps/activity/GameMainActivity4_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameMainActivity4;->D1()V

    return-void
.end method

.method static synthetic F2(Lcom/join/mgps/activity/GameMainActivity4_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameMainActivity4;->F1()V

    return-void
.end method

.method static synthetic G2(Lcom/join/mgps/activity/GameMainActivity4_;Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GameMainActivity4;->Y1(Z)V

    return-void
.end method

.method static synthetic H2(Lcom/join/mgps/activity/GameMainActivity4_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameMainActivity4;->w1()V

    return-void
.end method

.method static synthetic I2(Lcom/join/mgps/activity/GameMainActivity4_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameMainActivity4;->J1()V

    return-void
.end method

.method static synthetic J2(Lcom/join/mgps/activity/GameMainActivity4_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameMainActivity4;->I1()V

    return-void
.end method

.method static synthetic K2(Lcom/join/mgps/activity/GameMainActivity4_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameMainActivity4;->z1()V

    return-void
.end method

.method static synthetic L2(Lcom/join/mgps/activity/GameMainActivity4_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameMainActivity4;->W1()V

    return-void
.end method

.method static synthetic M2(Lcom/join/mgps/activity/GameMainActivity4_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameMainActivity4;->X1()V

    return-void
.end method

.method static synthetic N2(Lcom/join/mgps/activity/GameMainActivity4_;Lcom/join/mgps/dto/GameMainV4DataBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GameMainActivity4;->f2(Lcom/join/mgps/dto/GameMainV4DataBean;)V

    return-void
.end method

.method static synthetic O2(Lcom/join/mgps/activity/GameMainActivity4_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameMainActivity4;->x1()V

    return-void
.end method

.method static synthetic P2(Lcom/join/mgps/activity/GameMainActivity4_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameMainActivity4;->N1()V

    return-void
.end method

.method static synthetic Q2(Lcom/join/mgps/activity/GameMainActivity4_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameMainActivity4;->h2()V

    return-void
.end method

.method static synthetic R2(Lcom/join/mgps/activity/GameMainActivity4_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameMainActivity4;->p1()V

    return-void
.end method

.method public static S2(Landroid/content/Context;)Lcom/join/mgps/activity/GameMainActivity4_$i0;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameMainActivity4_$i0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameMainActivity4_$i0;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static T2(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/GameMainActivity4_$i0;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameMainActivity4_$i0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameMainActivity4_$i0;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/join/mgps/pref/PrefDef_;

    invoke-direct {p1, p0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/join/mgps/activity/GameMainActivity4;->s2:Lcom/join/mgps/pref/PrefDef_;

    .line 2
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 v0, 0x400

    invoke-virtual {p1, v0, v0}, Landroid/view/Window;->setFlags(II)V

    .line 4
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainActivity4_;->injectExtras_()V

    const/4 p1, 0x1

    .line 5
    invoke-virtual {p0, p1}, Landroid/app/Activity;->requestWindowFeature(I)Z

    return-void
.end method

.method private injectExtras_()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "gameId"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/GameMainActivity4;->N:Ljava/lang/String;

    :cond_0
    const-string v1, "from"

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->O:Ljava/lang/String;

    :cond_1
    return-void
.end method

.method static synthetic t2(Lcom/join/mgps/activity/GameMainActivity4_;Lcom/join/mgps/dto/GameMainV4DataBean;Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/GameMainActivity4;->r2(Lcom/join/mgps/dto/GameMainV4DataBean;Z)V

    return-void
.end method

.method static synthetic u2(Lcom/join/mgps/activity/GameMainActivity4_;Lapp/mgsim/arena/ArenaResponse;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GameMainActivity4;->handleFailure(Lapp/mgsim/arena/ArenaResponse;)V

    return-void
.end method

.method static synthetic v2(Lcom/join/mgps/activity/GameMainActivity4_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameMainActivity4;->m2()V

    return-void
.end method

.method static synthetic w2(Lcom/join/mgps/activity/GameMainActivity4_;Lcom/join/mgps/dto/OnlineCouponConfigBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GameMainActivity4;->g2(Lcom/join/mgps/dto/OnlineCouponConfigBean;)V

    return-void
.end method

.method static synthetic x2(Lcom/join/mgps/activity/GameMainActivity4_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GameMainActivity4;->p2(I)V

    return-void
.end method

.method static synthetic y2(Lcom/join/mgps/activity/GameMainActivity4_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameMainActivity4;->K1()V

    return-void
.end method

.method static synthetic z2(Lcom/join/mgps/activity/GameMainActivity4_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/GameMainActivity4;->C1()V

    return-void
.end method


# virtual methods
.method B1()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/GameMainActivity4_$s;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/GameMainActivity4_$s;-><init>(Lcom/join/mgps/activity/GameMainActivity4_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method C1()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/GameMainActivity4_$p;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/GameMainActivity4_$p;-><init>(Lcom/join/mgps/activity/GameMainActivity4_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method D1()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/GameMainActivity4_$u;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/GameMainActivity4_$u;-><init>(Lcom/join/mgps/activity/GameMainActivity4_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method F1()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/GameMainActivity4_$w;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/GameMainActivity4_$w;-><init>(Lcom/join/mgps/activity/GameMainActivity4_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method G1(Ljava/lang/String;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/GameMainActivity4_$t;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/GameMainActivity4_$t;-><init>(Lcom/join/mgps/activity/GameMainActivity4_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method H1()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/GameMainActivity4_$r;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/GameMainActivity4_$r;-><init>(Lcom/join/mgps/activity/GameMainActivity4_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method I1()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/GameMainActivity4_$z;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/GameMainActivity4_$z;-><init>(Lcom/join/mgps/activity/GameMainActivity4_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method J1()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/GameMainActivity4_$y;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/GameMainActivity4_$y;-><init>(Lcom/join/mgps/activity/GameMainActivity4_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method K1()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/GameMainActivity4_$o;

    const-string v2, ""

    const-wide/16 v3, 0x5dc

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/GameMainActivity4_$o;-><init>(Lcom/join/mgps/activity/GameMainActivity4_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method N1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameMainActivity4_$h;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameMainActivity4_$h;-><init>(Lcom/join/mgps/activity/GameMainActivity4_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method W1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameMainActivity4_$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameMainActivity4_$d;-><init>(Lcom/join/mgps/activity/GameMainActivity4_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method X1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameMainActivity4_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameMainActivity4_$e;-><init>(Lcom/join/mgps/activity/GameMainActivity4_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method Y1(Z)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameMainActivity4_$c;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/GameMainActivity4_$c;-><init>(Lcom/join/mgps/activity/GameMainActivity4_;Z)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method f2(Lcom/join/mgps/dto/GameMainV4DataBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameMainActivity4_$f;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/GameMainActivity4_$f;-><init>(Lcom/join/mgps/activity/GameMainActivity4_;Lcom/join/mgps/dto/GameMainV4DataBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method g2(Lcom/join/mgps/dto/OnlineCouponConfigBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameMainActivity4_$m;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/GameMainActivity4_$m;-><init>(Lcom/join/mgps/activity/GameMainActivity4_;Lcom/join/mgps/dto/OnlineCouponConfigBean;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4_;->K2:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method getData()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/GameMainActivity4_$q;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/GameMainActivity4_$q;-><init>(Lcom/join/mgps/activity/GameMainActivity4_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method h2()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameMainActivity4_$i;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameMainActivity4_$i;-><init>(Lcom/join/mgps/activity/GameMainActivity4_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method handleFailure(Lapp/mgsim/arena/ArenaResponse;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameMainActivity4_$l;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/GameMainActivity4_$l;-><init>(Lcom/join/mgps/activity/GameMainActivity4_;Lapp/mgsim/arena/ArenaResponse;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public internalFindViewById(I)Landroid/view/View;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method m2()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameMainActivity4_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameMainActivity4_$b;-><init>(Lcom/join/mgps/activity/GameMainActivity4_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4_;->J2:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/GameMainActivity4_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/join/mgps/activity/GameMainActivity4;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c0054

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/GameMainActivity4_;->setContentView(I)V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 5

    const v0, 0x7f090d03

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->P:Landroid/view/View;

    const v0, 0x7f090664

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->Q:Landroid/widget/TextView;

    const v0, 0x7f09119d

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->R:Landroid/widget/TextView;

    const v0, 0x7f09015b

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->S:Landroid/view/View;

    const v0, 0x7f090658

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/GridView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->U:Landroid/widget/GridView;

    const v0, 0x7f090642

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->V:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f090c56

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->W:Landroid/view/View;

    const v0, 0x7f091356

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/tabs/TabLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->X:Lcom/google/android/material/tabs/TabLayout;

    const v0, 0x7f0917b0

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/viewpager/widget/ViewPager;

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->Y:Landroidx/viewpager/widget/ViewPager;

    const v0, 0x7f0917de

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->Z:Landroid/widget/TextView;

    const v0, 0x7f0917d0

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/WrapContentGridView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->p0:Lcom/join/mgps/customview/WrapContentGridView;

    const v0, 0x7f090dd1

    .line 12
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->p1:Landroid/view/View;

    const v0, 0x7f090519

    .line 13
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->v1:Landroid/widget/FrameLayout;

    const v0, 0x7f090902

    .line 14
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->A1:Landroid/widget/ImageView;

    const v0, 0x7f0908dc

    .line 15
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->B1:Landroid/widget/ImageView;

    const v0, 0x7f09061e

    .line 16
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->C1:Landroid/widget/FrameLayout;

    const v0, 0x7f090284

    .line 17
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0904ea

    .line 18
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f090134

    .line 19
    invoke-interface {p1, v2}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v2

    const v3, 0x7f09131b

    .line 20
    invoke-interface {p1, v3}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v3

    const v4, 0x7f0914f6

    .line 21
    invoke-interface {p1, v4}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz v0, :cond_0

    .line 22
    new-instance v4, Lcom/join/mgps/activity/GameMainActivity4_$k;

    invoke-direct {v4, p0}, Lcom/join/mgps/activity/GameMainActivity4_$k;-><init>(Lcom/join/mgps/activity/GameMainActivity4_;)V

    invoke-virtual {v0, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz v1, :cond_1

    .line 23
    new-instance v0, Lcom/join/mgps/activity/GameMainActivity4_$v;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameMainActivity4_$v;-><init>(Lcom/join/mgps/activity/GameMainActivity4_;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    if-eqz v2, :cond_2

    .line 24
    new-instance v0, Lcom/join/mgps/activity/GameMainActivity4_$b0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameMainActivity4_$b0;-><init>(Lcom/join/mgps/activity/GameMainActivity4_;)V

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 25
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->S:Landroid/view/View;

    if-eqz v0, :cond_3

    .line 26
    new-instance v1, Lcom/join/mgps/activity/GameMainActivity4_$c0;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/GameMainActivity4_$c0;-><init>(Lcom/join/mgps/activity/GameMainActivity4_;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    if-eqz v3, :cond_4

    .line 27
    new-instance v0, Lcom/join/mgps/activity/GameMainActivity4_$d0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameMainActivity4_$d0;-><init>(Lcom/join/mgps/activity/GameMainActivity4_;)V

    invoke-virtual {v3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 28
    :cond_4
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->A1:Landroid/widget/ImageView;

    if-eqz v0, :cond_5

    .line 29
    new-instance v1, Lcom/join/mgps/activity/GameMainActivity4_$e0;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/GameMainActivity4_$e0;-><init>(Lcom/join/mgps/activity/GameMainActivity4_;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 30
    :cond_5
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->B1:Landroid/widget/ImageView;

    if-eqz v0, :cond_6

    .line 31
    new-instance v1, Lcom/join/mgps/activity/GameMainActivity4_$f0;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/GameMainActivity4_$f0;-><init>(Lcom/join/mgps/activity/GameMainActivity4_;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 32
    :cond_6
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4;->p1:Landroid/view/View;

    if-eqz v0, :cond_7

    .line 33
    new-instance v1, Lcom/join/mgps/activity/GameMainActivity4_$g0;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/GameMainActivity4_$g0;-><init>(Lcom/join/mgps/activity/GameMainActivity4_;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_7
    if-eqz p1, :cond_8

    .line 34
    new-instance v0, Lcom/join/mgps/activity/GameMainActivity4_$h0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameMainActivity4_$h0;-><init>(Lcom/join/mgps/activity/GameMainActivity4_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 35
    :cond_8
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameMainActivity4;->afterViews()V

    return-void
.end method

.method p1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameMainActivity4_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameMainActivity4_$j;-><init>(Lcom/join/mgps/activity/GameMainActivity4_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method p2(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameMainActivity4_$n;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/GameMainActivity4_$n;-><init>(Lcom/join/mgps/activity/GameMainActivity4_;I)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4_;->K2:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method r2(Lcom/join/mgps/dto/GameMainV4DataBean;Z)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameMainActivity4_$a;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/activity/GameMainActivity4_$a;-><init>(Lcom/join/mgps/activity/GameMainActivity4_;Lcom/join/mgps/dto/GameMainV4DataBean;Z)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/BaseActivity;->setContentView(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainActivity4_;->J2:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/join/mgps/activity/FriendActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainActivity4_;->J2:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/activity/ComponentActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainActivity4_;->J2:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/GameMainActivity4_;->injectExtras_()V

    return-void
.end method

.method w1()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/GameMainActivity4_$x;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/GameMainActivity4_$x;-><init>(Lcom/join/mgps/activity/GameMainActivity4_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method x1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameMainActivity4_$g;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameMainActivity4_$g;-><init>(Lcom/join/mgps/activity/GameMainActivity4_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method z1()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/GameMainActivity4_$a0;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/GameMainActivity4_$a0;-><init>(Lcom/join/mgps/activity/GameMainActivity4_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method
