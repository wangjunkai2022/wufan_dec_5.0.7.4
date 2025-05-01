.class public final Lcom/join/mgps/fragment/CommonWebviewFragment_;
.super Lcom/join/mgps/fragment/CommonWebviewFragment;
.source "CommonWebviewFragment_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/CommonWebviewFragment_$a0;
    }
.end annotation


# instance fields
.field private final P1:La4/c;

.field private Q1:Landroid/view/View;

.field private final R1:Ljava/util/Map;
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
    invoke-direct {p0}, Lcom/join/mgps/fragment/CommonWebviewFragment;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment_;->P1:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment_;->R1:Ljava/util/Map;

    return-void
.end method

.method static synthetic A1(Lcom/join/mgps/fragment/CommonWebviewFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/CommonWebviewFragment;->getUserInfo()V

    return-void
.end method

.method static synthetic B1(Lcom/join/mgps/fragment/CommonWebviewFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/CommonWebviewFragment;->D0()V

    return-void
.end method

.method static synthetic C1(Lcom/join/mgps/fragment/CommonWebviewFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/CommonWebviewFragment;->showMain()V

    return-void
.end method

.method static synthetic D1(Lcom/join/mgps/fragment/CommonWebviewFragment_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->F0(I)V

    return-void
.end method

.method static synthetic E1(Lcom/join/mgps/fragment/CommonWebviewFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->showTost(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic F1(Lcom/join/mgps/fragment/CommonWebviewFragment_;Lcom/join/mgps/dto/DetailResultBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->g1(Lcom/join/mgps/dto/DetailResultBean;)V

    return-void
.end method

.method static synthetic G1(Lcom/join/mgps/fragment/CommonWebviewFragment_;Lcom/join/mgps/dto/DetailResultBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->i1(Lcom/join/mgps/dto/DetailResultBean;)V

    return-void
.end method

.method static synthetic H1(Lcom/join/mgps/fragment/CommonWebviewFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->Y0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic I1(Lcom/join/mgps/fragment/CommonWebviewFragment_;Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->V0(Z)V

    return-void
.end method

.method static synthetic J1(Lcom/join/mgps/fragment/CommonWebviewFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->J0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic K1(Lcom/join/mgps/fragment/CommonWebviewFragment_;Lapp/mgsim/arena/SocketError;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->Z0(Lapp/mgsim/arena/SocketError;)V

    return-void
.end method

.method public static L1()Lcom/join/mgps/fragment/CommonWebviewFragment_$a0;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CommonWebviewFragment_$a0;

    invoke-direct {v0}, Lcom/join/mgps/fragment/CommonWebviewFragment_$a0;-><init>()V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->t:Lcom/join/mgps/pref/PrefDef_;

    .line 2
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->I:Lcom/join/mgps/Util/b;

    return-void
.end method

.method static synthetic p1(Lcom/join/mgps/fragment/CommonWebviewFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/CommonWebviewFragment;->showLoding()V

    return-void
.end method

.method static synthetic q1(Lcom/join/mgps/fragment/CommonWebviewFragment_;Lcom/papa91/battle/protocol/GameRoom;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->T0(Lcom/papa91/battle/protocol/GameRoom;)V

    return-void
.end method

.method static synthetic r1(Lcom/join/mgps/fragment/CommonWebviewFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/CommonWebviewFragment;->showLodingFailed()V

    return-void
.end method

.method static synthetic s1(Lcom/join/mgps/fragment/CommonWebviewFragment_;Lcom/papa91/battle/protocol/GameRoom;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/fragment/CommonWebviewFragment;->I0(Lcom/papa91/battle/protocol/GameRoom;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic t1(Lcom/join/mgps/fragment/CommonWebviewFragment_;Lcom/papa91/battle/protocol/GameRoom;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->d1(Lcom/papa91/battle/protocol/GameRoom;)V

    return-void
.end method

.method static synthetic u1(Lcom/join/mgps/fragment/CommonWebviewFragment_;Lapp/mgsim/arena/ArenaResponse;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->S0(Lapp/mgsim/arena/ArenaResponse;)V

    return-void
.end method

.method static synthetic v1(Lcom/join/mgps/fragment/CommonWebviewFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/CommonWebviewFragment;->f1()V

    return-void
.end method

.method static synthetic w1(Lcom/join/mgps/fragment/CommonWebviewFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/CommonWebviewFragment;->H0()V

    return-void
.end method

.method static synthetic x1(Lcom/join/mgps/fragment/CommonWebviewFragment_;Lcom/join/mgps/dto/CreateVipData;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/CommonWebviewFragment;->l1(Lcom/join/mgps/dto/CreateVipData;)V

    return-void
.end method

.method static synthetic y1(Lcom/join/mgps/fragment/CommonWebviewFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/CommonWebviewFragment;->G0()V

    return-void
.end method

.method static synthetic z1(Lcom/join/mgps/fragment/CommonWebviewFragment_;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/fragment/CommonWebviewFragment;->L0(Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method D0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/CommonWebviewFragment_$q;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/CommonWebviewFragment_$q;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method F0(I)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/fragment/CommonWebviewFragment_$r;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/fragment/CommonWebviewFragment_$r;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment_;Ljava/lang/String;JLjava/lang/String;I)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method G0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CommonWebviewFragment_$n;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CommonWebviewFragment_$n;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method H0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CommonWebviewFragment_$l;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CommonWebviewFragment_$l;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method I0(Lcom/papa91/battle/protocol/GameRoom;Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CommonWebviewFragment_$g;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/fragment/CommonWebviewFragment_$g;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment_;Lcom/papa91/battle/protocol/GameRoom;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method J0(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CommonWebviewFragment_$d;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/CommonWebviewFragment_$d;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method L0(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 10

    .line 1
    new-instance v9, Lcom/join/mgps/fragment/CommonWebviewFragment_$o;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v9

    move-object v1, p0

    move-object v6, p1

    move-object v7, p2

    move v8, p3

    invoke-direct/range {v0 .. v8}, Lcom/join/mgps/fragment/CommonWebviewFragment_$o;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v9}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method S0(Lapp/mgsim/arena/ArenaResponse;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CommonWebviewFragment_$i;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/CommonWebviewFragment_$i;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment_;Lapp/mgsim/arena/ArenaResponse;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method T0(Lcom/papa91/battle/protocol/GameRoom;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CommonWebviewFragment_$f;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/CommonWebviewFragment_$f;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment_;Lcom/papa91/battle/protocol/GameRoom;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method V0(Z)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CommonWebviewFragment_$c;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/CommonWebviewFragment_$c;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment_;Z)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method Y0(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CommonWebviewFragment_$b;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/CommonWebviewFragment_$b;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method Z0(Lapp/mgsim/arena/SocketError;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CommonWebviewFragment_$e;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/CommonWebviewFragment_$e;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment_;Lapp/mgsim/arena/SocketError;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method d1(Lcom/papa91/battle/protocol/GameRoom;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CommonWebviewFragment_$h;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/CommonWebviewFragment_$h;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment_;Lcom/papa91/battle/protocol/GameRoom;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method f1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CommonWebviewFragment_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CommonWebviewFragment_$j;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method g1(Lcom/join/mgps/dto/DetailResultBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CommonWebviewFragment_$z;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/CommonWebviewFragment_$z;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment_;Lcom/join/mgps/dto/DetailResultBean;)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment_;->R1:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method getUserInfo()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/CommonWebviewFragment_$p;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/CommonWebviewFragment_$p;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method i1(Lcom/join/mgps/dto/DetailResultBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CommonWebviewFragment_$a;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/CommonWebviewFragment_$a;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment_;Lcom/join/mgps/dto/DetailResultBean;)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment_;->Q1:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method l1(Lcom/join/mgps/dto/CreateVipData;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CommonWebviewFragment_$m;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/CommonWebviewFragment_$m;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment_;Lcom/join/mgps/dto/CreateVipData;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment_;->P1:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/CommonWebviewFragment_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/fragment/CommonWebviewFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p3

    iput-object p3, p0, Lcom/join/mgps/fragment/CommonWebviewFragment_;->Q1:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c025b

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment_;->Q1:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment_;->Q1:Landroid/view/View;

    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment_;->Q1:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->e:Landroid/widget/LinearLayout;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->f:Landroid/widget/LinearLayout;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->g:Landroid/widget/TextView;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->h:Landroid/widget/RelativeLayout;

    .line 7
    iput-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 4

    const v0, 0x7f090d82

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->e:Landroid/widget/LinearLayout;

    const v0, 0x7f090d7f

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->f:Landroid/widget/LinearLayout;

    const v0, 0x7f090553

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->g:Landroid/widget/TextView;

    const v0, 0x7f091806

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->h:Landroid/widget/RelativeLayout;

    const v0, 0x7f091803

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/LJNestScrollWebView;

    iput-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->i:Lcom/join/mgps/customview/LJNestScrollWebView;

    const v0, 0x7f091261

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f091211

    .line 7
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f090476

    .line 8
    invoke-interface {p1, v2}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    .line 9
    iget-object v2, p0, Lcom/join/mgps/fragment/CommonWebviewFragment;->f:Landroid/widget/LinearLayout;

    if-eqz v2, :cond_0

    .line 10
    new-instance v3, Lcom/join/mgps/fragment/CommonWebviewFragment_$k;

    invoke-direct {v3, p0}, Lcom/join/mgps/fragment/CommonWebviewFragment_$k;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment_;)V

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz v0, :cond_1

    .line 11
    new-instance v2, Lcom/join/mgps/fragment/CommonWebviewFragment_$s;

    invoke-direct {v2, p0}, Lcom/join/mgps/fragment/CommonWebviewFragment_$s;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment_;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    if-eqz v1, :cond_2

    .line 12
    new-instance v0, Lcom/join/mgps/fragment/CommonWebviewFragment_$t;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CommonWebviewFragment_$t;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment_;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    if-eqz p1, :cond_3

    .line 13
    new-instance v0, Lcom/join/mgps/fragment/CommonWebviewFragment_$u;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CommonWebviewFragment_$u;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    :cond_3
    invoke-virtual {p0}, Lcom/join/mgps/fragment/CommonWebviewFragment;->afterview()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/CommonWebviewFragment_;->P1:La4/c;

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
    iget-object v0, p0, Lcom/join/mgps/fragment/CommonWebviewFragment_;->R1:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method showLoding()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CommonWebviewFragment_$v;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CommonWebviewFragment_$v;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLodingFailed()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CommonWebviewFragment_$w;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CommonWebviewFragment_$w;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showMain()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CommonWebviewFragment_$x;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CommonWebviewFragment_$x;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showTost(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CommonWebviewFragment_$y;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/CommonWebviewFragment_$y;-><init>(Lcom/join/mgps/fragment/CommonWebviewFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
