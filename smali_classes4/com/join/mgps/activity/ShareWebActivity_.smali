.class public final Lcom/join/mgps/activity/ShareWebActivity_;
.super Lcom/join/mgps/activity/ShareWebActivity;
.source "ShareWebActivity_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/ShareWebActivity_$h0;
    }
.end annotation


# static fields
.field public static final k2:Ljava/lang/String; = "intentdate"

.field public static final l2:Ljava/lang/String; = "intentDataMain"

.field public static final m2:Ljava/lang/String; = "supportJavascript"


# instance fields
.field private final g2:La4/c;

.field private final h2:Ljava/util/Map;
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

.field private final i2:Landroid/content/IntentFilter;

.field private final j2:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/ShareWebActivity;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity_;->g2:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity_;->h2:Ljava/util/Map;

    .line 4
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity_;->i2:Landroid/content/IntentFilter;

    .line 5
    new-instance v0, Lcom/join/mgps/activity/ShareWebActivity_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ShareWebActivity_$k;-><init>(Lcom/join/mgps/activity/ShareWebActivity_;)V

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity_;->j2:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic U1(Lcom/join/mgps/activity/ShareWebActivity_;Ljava/lang/String;Lcom/join/mgps/Util/IntentDateBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/ShareWebActivity;->c1(Ljava/lang/String;Lcom/join/mgps/Util/IntentDateBean;)V

    return-void
.end method

.method static synthetic V1(Lcom/join/mgps/activity/ShareWebActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ShareWebActivity;->b1(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic W1(Lcom/join/mgps/activity/ShareWebActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ShareWebActivity;->showLoding()V

    return-void
.end method

.method static synthetic X1(Lcom/join/mgps/activity/ShareWebActivity_;Lapp/mgsim/arena/SocketError;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ShareWebActivity;->z1(Lapp/mgsim/arena/SocketError;)V

    return-void
.end method

.method static synthetic Y1(Lcom/join/mgps/activity/ShareWebActivity_;Lcom/papa91/battle/protocol/GameRoom;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ShareWebActivity;->p1(Lcom/papa91/battle/protocol/GameRoom;)V

    return-void
.end method

.method static synthetic Z1(Lcom/join/mgps/activity/ShareWebActivity_;Lcom/papa91/battle/protocol/GameRoom;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/ShareWebActivity;->a1(Lcom/papa91/battle/protocol/GameRoom;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a2(Lcom/join/mgps/activity/ShareWebActivity_;Lcom/papa91/battle/protocol/GameRoom;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ShareWebActivity;->I1(Lcom/papa91/battle/protocol/GameRoom;)V

    return-void
.end method

.method static synthetic b2(Lcom/join/mgps/activity/ShareWebActivity_;Lapp/mgsim/arena/ArenaResponse;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ShareWebActivity;->handleFailure(Lapp/mgsim/arena/ArenaResponse;)V

    return-void
.end method

.method static synthetic c2(Lcom/join/mgps/activity/ShareWebActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ShareWebActivity;->K1()V

    return-void
.end method

.method static synthetic d2(Lcom/join/mgps/activity/ShareWebActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ShareWebActivity;->dismissLoadingDialog()V

    return-void
.end method

.method static synthetic e2(Lcom/join/mgps/activity/ShareWebActivity_;Lcom/join/mgps/dto/CreateVipData;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ShareWebActivity;->Q1(Lcom/join/mgps/dto/CreateVipData;)V

    return-void
.end method

.method static synthetic f2(Lcom/join/mgps/activity/ShareWebActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ShareWebActivity;->Z0()V

    return-void
.end method

.method static synthetic g2(Lcom/join/mgps/activity/ShareWebActivity_;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/activity/ShareWebActivity;->h1(Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic h2(Lcom/join/mgps/activity/ShareWebActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ShareWebActivity;->showLodingFailed()V

    return-void
.end method

.method static synthetic i2(Lcom/join/mgps/activity/ShareWebActivity_;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/activity/ShareWebActivity;->k1(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/join/mgps/pref/PrefDef_;

    invoke-direct {p1, p0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->K:Lcom/join/mgps/pref/PrefDef_;

    .line 2
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 3
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->Z:Lcom/join/mgps/Util/b;

    .line 4
    invoke-direct {p0}, Lcom/join/mgps/activity/ShareWebActivity_;->injectExtras_()V

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity_;->i2:Landroid/content/IntentFilter;

    const-string v0, "com.wufun.finish.activity"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity_;->j2:Landroid/content/BroadcastReceiver;

    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity_;->i2:Landroid/content/IntentFilter;

    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method private injectExtras_()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v1, "intentdate"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/Util/IntentDateBean;

    iput-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->D:Lcom/join/mgps/Util/IntentDateBean;

    :cond_0
    const-string v1, "intentDataMain"

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/IntentDataMain;

    iput-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity;->E:Lcom/join/mgps/dto/IntentDataMain;

    :cond_1
    const-string v1, "supportJavascript"

    .line 6
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 7
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->F:Z

    :cond_2
    return-void
.end method

.method static synthetic j2(Lcom/join/mgps/activity/ShareWebActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ShareWebActivity;->l1()V

    return-void
.end method

.method static synthetic k2(Lcom/join/mgps/activity/ShareWebActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ShareWebActivity;->checkToken()V

    return-void
.end method

.method static synthetic l2(Lcom/join/mgps/activity/ShareWebActivity_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ShareWebActivity;->Y0(I)V

    return-void
.end method

.method static synthetic m2(Lcom/join/mgps/activity/ShareWebActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/ShareWebActivity;->L1()V

    return-void
.end method

.method static synthetic n2(Lcom/join/mgps/activity/ShareWebActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ShareWebActivity;->showTost(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic o2(Lcom/join/mgps/activity/ShareWebActivity_;Lcom/join/mgps/dto/DetailResultBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ShareWebActivity;->startDown(Lcom/join/mgps/dto/DetailResultBean;)V

    return-void
.end method

.method static synthetic p2(Lcom/join/mgps/activity/ShareWebActivity_;Lcom/join/mgps/dto/DetailResultBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ShareWebActivity;->N1(Lcom/join/mgps/dto/DetailResultBean;)V

    return-void
.end method

.method static synthetic q2(Lcom/join/mgps/activity/ShareWebActivity_;Lcom/join/mgps/dto/DomainInfoBean;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/ShareWebActivity;->G1(Lcom/join/mgps/dto/DomainInfoBean;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic r2(Lcom/join/mgps/activity/ShareWebActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ShareWebActivity;->w1(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic s2(Lcom/join/mgps/activity/ShareWebActivity_;Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ShareWebActivity;->s1(Z)V

    return-void
.end method

.method public static t2(Landroid/content/Context;)Lcom/join/mgps/activity/ShareWebActivity_$h0;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ShareWebActivity_$h0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ShareWebActivity_$h0;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static u2(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/ShareWebActivity_$h0;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ShareWebActivity_$h0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ShareWebActivity_$h0;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method


# virtual methods
.method G1(Lcom/join/mgps/dto/DomainInfoBean;Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ShareWebActivity_$g;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/activity/ShareWebActivity_$g;-><init>(Lcom/join/mgps/activity/ShareWebActivity_;Lcom/join/mgps/dto/DomainInfoBean;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method I1(Lcom/papa91/battle/protocol/GameRoom;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ShareWebActivity_$o;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/ShareWebActivity_$o;-><init>(Lcom/join/mgps/activity/ShareWebActivity_;Lcom/papa91/battle/protocol/GameRoom;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method K1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ShareWebActivity_$q;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ShareWebActivity_$q;-><init>(Lcom/join/mgps/activity/ShareWebActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method L1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ShareWebActivity_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ShareWebActivity_$c;-><init>(Lcom/join/mgps/activity/ShareWebActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method N1(Lcom/join/mgps/dto/DetailResultBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ShareWebActivity_$f;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/ShareWebActivity_$f;-><init>(Lcom/join/mgps/activity/ShareWebActivity_;Lcom/join/mgps/dto/DetailResultBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method Q1(Lcom/join/mgps/dto/CreateVipData;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ShareWebActivity_$s;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/ShareWebActivity_$s;-><init>(Lcom/join/mgps/activity/ShareWebActivity_;Lcom/join/mgps/dto/CreateVipData;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method Y0(I)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/ShareWebActivity_$z;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/ShareWebActivity_$z;-><init>(Lcom/join/mgps/activity/ShareWebActivity_;Ljava/lang/String;JLjava/lang/String;I)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method Z0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ShareWebActivity_$t;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ShareWebActivity_$t;-><init>(Lcom/join/mgps/activity/ShareWebActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method a1(Lcom/papa91/battle/protocol/GameRoom;Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ShareWebActivity_$n;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/activity/ShareWebActivity_$n;-><init>(Lcom/join/mgps/activity/ShareWebActivity_;Lcom/papa91/battle/protocol/GameRoom;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method b1(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ShareWebActivity_$j;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/ShareWebActivity_$j;-><init>(Lcom/join/mgps/activity/ShareWebActivity_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method c1(Ljava/lang/String;Lcom/join/mgps/Util/IntentDateBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ShareWebActivity_$g0;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/activity/ShareWebActivity_$g0;-><init>(Lcom/join/mgps/activity/ShareWebActivity_;Ljava/lang/String;Lcom/join/mgps/Util/IntentDateBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method checkToken()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/ShareWebActivity_$y;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/ShareWebActivity_$y;-><init>(Lcom/join/mgps/activity/ShareWebActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method dismissLoadingDialog()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ShareWebActivity_$r;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ShareWebActivity_$r;-><init>(Lcom/join/mgps/activity/ShareWebActivity_;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity_;->h2:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method h1(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 10

    .line 1
    new-instance v9, Lcom/join/mgps/activity/ShareWebActivity_$u;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v9

    move-object v1, p0

    move-object v6, p1

    move-object v7, p2

    move v8, p3

    invoke-direct/range {v0 .. v8}, Lcom/join/mgps/activity/ShareWebActivity_$u;-><init>(Lcom/join/mgps/activity/ShareWebActivity_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v9}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method handleFailure(Lapp/mgsim/arena/ArenaResponse;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ShareWebActivity_$p;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/ShareWebActivity_$p;-><init>(Lcom/join/mgps/activity/ShareWebActivity_;Lapp/mgsim/arena/ArenaResponse;)V

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

.method k1(ILjava/lang/String;Ljava/lang/String;)V
    .locals 10

    .line 1
    new-instance v9, Lcom/join/mgps/activity/ShareWebActivity_$w;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v9

    move-object v1, p0

    move v6, p1

    move-object v7, p2

    move-object v8, p3

    invoke-direct/range {v0 .. v8}, Lcom/join/mgps/activity/ShareWebActivity_$w;-><init>(Lcom/join/mgps/activity/ShareWebActivity_;Ljava/lang/String;JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    invoke-static {v9}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method l1()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/ShareWebActivity_$x;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/ShareWebActivity_$x;-><init>(Lcom/join/mgps/activity/ShareWebActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity_;->g2:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/ShareWebActivity_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/join/mgps/activity/ShareWebActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c0746

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/ShareWebActivity_;->setContentView(I)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity_;->j2:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 2
    invoke-super {p0}, Lcom/join/mgps/activity/ShareWebActivity;->onDestroy()V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 2

    const v0, 0x7f090d82

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->e:Landroid/widget/LinearLayout;

    const v0, 0x7f090d7f

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->f:Landroid/widget/LinearLayout;

    const v0, 0x7f091461

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->g:Landroid/widget/RelativeLayout;

    const v0, 0x7f091489

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->h:Landroid/widget/TextView;

    const v0, 0x7f090553

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->i:Landroid/widget/TextView;

    const v0, 0x7f090c46

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->j:Landroid/widget/LinearLayout;

    const v0, 0x7f0917a0

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->k:Landroid/widget/FrameLayout;

    const v0, 0x7f091806

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->l:Landroid/widget/RelativeLayout;

    const v0, 0x7f091803

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/LJWebView;

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->m:Lcom/join/mgps/customview/LJWebView;

    const v0, 0x7f0910f5

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->n:Landroid/widget/ImageView;

    const v0, 0x7f091211

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->o:Landroid/widget/ImageView;

    const v0, 0x7f090140

    .line 12
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->p:Landroid/widget/ImageView;

    const v0, 0x7f090145

    .line 13
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->q:Landroid/widget/ImageView;

    const v0, 0x7f090476

    .line 14
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->r:Landroid/widget/ImageView;

    const v0, 0x7f091261

    .line 15
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    .line 16
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->n:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 17
    new-instance v1, Lcom/join/mgps/activity/ShareWebActivity_$v;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/ShareWebActivity_$v;-><init>(Lcom/join/mgps/activity/ShareWebActivity_;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->f:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    .line 19
    new-instance v1, Lcom/join/mgps/activity/ShareWebActivity_$a0;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/ShareWebActivity_$a0;-><init>(Lcom/join/mgps/activity/ShareWebActivity_;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->q:Landroid/widget/ImageView;

    if-eqz v0, :cond_2

    .line 21
    new-instance v1, Lcom/join/mgps/activity/ShareWebActivity_$b0;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/ShareWebActivity_$b0;-><init>(Lcom/join/mgps/activity/ShareWebActivity_;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 22
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity;->p:Landroid/widget/ImageView;

    if-eqz v0, :cond_3

    .line 23
    new-instance v1, Lcom/join/mgps/activity/ShareWebActivity_$c0;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/ShareWebActivity_$c0;-><init>(Lcom/join/mgps/activity/ShareWebActivity_;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    if-eqz p1, :cond_4

    .line 24
    new-instance v0, Lcom/join/mgps/activity/ShareWebActivity_$d0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ShareWebActivity_$d0;-><init>(Lcom/join/mgps/activity/ShareWebActivity_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 25
    :cond_4
    iget-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->o:Landroid/widget/ImageView;

    if-eqz p1, :cond_5

    .line 26
    new-instance v0, Lcom/join/mgps/activity/ShareWebActivity_$e0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ShareWebActivity_$e0;-><init>(Lcom/join/mgps/activity/ShareWebActivity_;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 27
    :cond_5
    iget-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->r:Landroid/widget/ImageView;

    if-eqz p1, :cond_6

    .line 28
    new-instance v0, Lcom/join/mgps/activity/ShareWebActivity_$f0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ShareWebActivity_$f0;-><init>(Lcom/join/mgps/activity/ShareWebActivity_;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 29
    :cond_6
    iget-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->k:Landroid/widget/FrameLayout;

    iput-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity;->s:Landroid/widget/FrameLayout;

    .line 30
    invoke-virtual {p0}, Lcom/join/mgps/activity/ShareWebActivity;->afterview()V

    return-void
.end method

.method p1(Lcom/papa91/battle/protocol/GameRoom;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ShareWebActivity_$m;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/ShareWebActivity_$m;-><init>(Lcom/join/mgps/activity/ShareWebActivity_;Lcom/papa91/battle/protocol/GameRoom;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity_;->h2:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method s1(Z)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ShareWebActivity_$i;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/ShareWebActivity_$i;-><init>(Lcom/join/mgps/activity/ShareWebActivity_;Z)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/BaseFragmentActivity;->setContentView(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity_;->g2:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/BaseFragmentActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity_;->g2:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/activity/ComponentActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity_;->g2:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/ShareWebActivity_;->injectExtras_()V

    return-void
.end method

.method showLoding()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ShareWebActivity_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ShareWebActivity_$a;-><init>(Lcom/join/mgps/activity/ShareWebActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLodingFailed()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ShareWebActivity_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/ShareWebActivity_$b;-><init>(Lcom/join/mgps/activity/ShareWebActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showTost(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ShareWebActivity_$d;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/ShareWebActivity_$d;-><init>(Lcom/join/mgps/activity/ShareWebActivity_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method startDown(Lcom/join/mgps/dto/DetailResultBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ShareWebActivity_$e;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/ShareWebActivity_$e;-><init>(Lcom/join/mgps/activity/ShareWebActivity_;Lcom/join/mgps/dto/DetailResultBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method w1(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ShareWebActivity_$h;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/ShareWebActivity_$h;-><init>(Lcom/join/mgps/activity/ShareWebActivity_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method z1(Lapp/mgsim/arena/SocketError;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/ShareWebActivity_$l;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/ShareWebActivity_$l;-><init>(Lcom/join/mgps/activity/ShareWebActivity_;Lapp/mgsim/arena/SocketError;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
