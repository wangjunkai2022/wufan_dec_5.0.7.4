.class public final Lcom/join/mgps/activity/arena/GameRoomActivity_;
.super Lcom/join/mgps/activity/arena/GameRoomActivity;
.source "GameRoomActivity_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/arena/GameRoomActivity_$a0;
    }
.end annotation


# static fields
.field public static final l3:Ljava/lang/String; = "battleChallengeConfig"

.field public static final m3:Ljava/lang/String; = "roomLive"

.field public static final n3:Ljava/lang/String; = "mGameRoom"

.field public static final o3:Ljava/lang/String; = "joinSpectatorReason"

.field public static final p3:Ljava/lang/String; = "gameName"

.field public static final q3:Ljava/lang/String; = "isFastJoinRoom"

.field public static final r3:Ljava/lang/String; = "isCreateRoom"

.field public static final s3:Ljava/lang/String; = "isAllowPcJoin"

.field public static final t3:Ljava/lang/String; = "from"

.field public static final u3:Ljava/lang/String; = "password"

.field public static final v3:Ljava/lang/String; = "position"

.field public static final w3:Ljava/lang/String; = "copper"


# instance fields
.field private final j3:La4/c;

.field private final k3:Ljava/util/Map;
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
    invoke-direct {p0}, Lcom/join/mgps/activity/arena/GameRoomActivity;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/arena/GameRoomActivity_;->j3:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/arena/GameRoomActivity_;->k3:Ljava/util/Map;

    return-void
.end method

.method static synthetic A2(Lcom/join/mgps/activity/arena/GameRoomActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/arena/GameRoomActivity;->o2()V

    return-void
.end method

.method static synthetic B2(Lcom/join/mgps/activity/arena/GameRoomActivity_;Lcom/papa91/battle/protocol/BattleServerAddr;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/arena/GameRoomActivity;->p2(Lcom/papa91/battle/protocol/BattleServerAddr;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic C2(Lcom/join/mgps/activity/arena/GameRoomActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/arena/GameRoomActivity;->s2()V

    return-void
.end method

.method static synthetic D2(Lcom/join/mgps/activity/arena/GameRoomActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/arena/GameRoomActivity;->N1()V

    return-void
.end method

.method static synthetic E2(Lcom/join/mgps/activity/arena/GameRoomActivity_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/arena/GameRoomActivity;->b2(I)V

    return-void
.end method

.method static synthetic F2(Lcom/join/mgps/activity/arena/GameRoomActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/arena/GameRoomActivity;->Z1()V

    return-void
.end method

.method static synthetic G2(Lcom/join/mgps/activity/arena/GameRoomActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/arena/GameRoomActivity;->a2()V

    return-void
.end method

.method static synthetic H2(Lcom/join/mgps/activity/arena/GameRoomActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/arena/GameRoomActivity;->t2()V

    return-void
.end method

.method static synthetic I2(Lcom/join/mgps/activity/arena/GameRoomActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/arena/GameRoomActivity;->L1()V

    return-void
.end method

.method static synthetic J2(Lcom/join/mgps/activity/arena/GameRoomActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/arena/GameRoomActivity;->g2()V

    return-void
.end method

.method static synthetic K2(Lcom/join/mgps/activity/arena/GameRoomActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/arena/GameRoomActivity;->c2()V

    return-void
.end method

.method static synthetic L2(Lcom/join/mgps/activity/arena/GameRoomActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/arena/GameRoomActivity;->M1(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic M2(Lcom/join/mgps/activity/arena/GameRoomActivity_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/arena/GameRoomActivity;->K1(I)V

    return-void
.end method

.method static synthetic N2(Lcom/join/mgps/activity/arena/GameRoomActivity_;Lcom/papa91/battle/protocol/GameRoom;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/arena/GameRoomActivity;->Y1(Lcom/papa91/battle/protocol/GameRoom;)V

    return-void
.end method

.method static synthetic O2(Lcom/join/mgps/activity/arena/GameRoomActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/arena/GameRoomActivity;->j2()V

    return-void
.end method

.method static synthetic P2(Lcom/join/mgps/activity/arena/GameRoomActivity_;Lcom/papa91/battle/protocol/KickInfo;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/arena/GameRoomActivity;->P1(Lcom/papa91/battle/protocol/KickInfo;)V

    return-void
.end method

.method static synthetic Q2(Lcom/join/mgps/activity/arena/GameRoomActivity_;Lapp/mgsim/arena/ArenaResponse;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/arena/GameRoomActivity;->O1(Lapp/mgsim/arena/ArenaResponse;)V

    return-void
.end method

.method static synthetic R2(Lcom/join/mgps/activity/arena/GameRoomActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/arena/GameRoomActivity;->J1()V

    return-void
.end method

.method static synthetic S2(Lcom/join/mgps/activity/arena/GameRoomActivity_;Lcom/papa91/battle/protocol/GameRoom;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/arena/GameRoomActivity;->v2(Lcom/papa91/battle/protocol/GameRoom;)V

    return-void
.end method

.method static synthetic T2(Lcom/join/mgps/activity/arena/GameRoomActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/arena/GameRoomActivity;->Q1()V

    return-void
.end method

.method static synthetic U2(Lcom/join/mgps/activity/arena/GameRoomActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/arena/GameRoomActivity;->D1()V

    return-void
.end method

.method public static V2(Landroid/content/Context;)Lcom/join/mgps/activity/arena/GameRoomActivity_$a0;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/arena/GameRoomActivity_$a0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/arena/GameRoomActivity_$a0;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static W2(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/arena/GameRoomActivity_$a0;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/arena/GameRoomActivity_$a0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/arena/GameRoomActivity_$a0;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 2
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->O:Lcom/join/mgps/Util/b;

    .line 3
    invoke-direct {p0}, Lcom/join/mgps/activity/arena/GameRoomActivity_;->injectExtras_()V

    return-void
.end method

.method private injectExtras_()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_b

    const-string v1, "battleChallengeConfig"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/BattleChallengeConfig;

    iput-object v1, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->N:Lcom/join/mgps/dto/BattleChallengeConfig;

    :cond_0
    const-string v1, "roomLive"

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->P:I

    :cond_1
    const-string v1, "mGameRoom"

    .line 6
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 7
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Lcom/papa91/battle/protocol/GameRoom;

    iput-object v1, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->Q:Lcom/papa91/battle/protocol/GameRoom;

    :cond_2
    const-string v1, "joinSpectatorReason"

    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 9
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->R:Ljava/lang/String;

    :cond_3
    const-string v1, "gameName"

    .line 10
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 11
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->S:Ljava/lang/String;

    :cond_4
    const-string v1, "isFastJoinRoom"

    .line 12
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 13
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->T:Z

    :cond_5
    const-string v1, "isCreateRoom"

    .line 14
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 15
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->U:Z

    :cond_6
    const-string v1, "isAllowPcJoin"

    .line 16
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 17
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->V:I

    :cond_7
    const-string v1, "from"

    .line 18
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 19
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->W:Ljava/lang/String;

    :cond_8
    const-string v1, "password"

    .line 20
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 21
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->X:Ljava/lang/String;

    :cond_9
    const-string v1, "position"

    .line 22
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_a

    .line 23
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->Y:I

    :cond_a
    const-string v1, "copper"

    .line 24
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_b

    .line 25
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->Z:I

    :cond_b
    return-void
.end method

.method static synthetic w2(Lcom/join/mgps/activity/arena/GameRoomActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/arena/GameRoomActivity;->e2(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic x2(Lcom/join/mgps/activity/arena/GameRoomActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/arena/GameRoomActivity;->i2()V

    return-void
.end method

.method static synthetic y2(Lcom/join/mgps/activity/arena/GameRoomActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/arena/GameRoomActivity;->k2()V

    return-void
.end method

.method static synthetic z2(Lcom/join/mgps/activity/arena/GameRoomActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/arena/GameRoomActivity;->showToast(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method D1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/arena/GameRoomActivity_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/arena/GameRoomActivity_$b;-><init>(Lcom/join/mgps/activity/arena/GameRoomActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method J1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/arena/GameRoomActivity_$y;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/arena/GameRoomActivity_$y;-><init>(Lcom/join/mgps/activity/arena/GameRoomActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method K1(I)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/arena/GameRoomActivity_$q;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/arena/GameRoomActivity_$q;-><init>(Lcom/join/mgps/activity/arena/GameRoomActivity_;Ljava/lang/String;JLjava/lang/String;I)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method L1()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/arena/GameRoomActivity_$n;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/arena/GameRoomActivity_$n;-><init>(Lcom/join/mgps/activity/arena/GameRoomActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method M1(Ljava/lang/String;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/arena/GameRoomActivity_$p;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/arena/GameRoomActivity_$p;-><init>(Lcom/join/mgps/activity/arena/GameRoomActivity_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method N1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/arena/GameRoomActivity_$h;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/arena/GameRoomActivity_$h;-><init>(Lcom/join/mgps/activity/arena/GameRoomActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method O1(Lapp/mgsim/arena/ArenaResponse;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/arena/GameRoomActivity_$x;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/arena/GameRoomActivity_$x;-><init>(Lcom/join/mgps/activity/arena/GameRoomActivity_;Lapp/mgsim/arena/ArenaResponse;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method P1(Lcom/papa91/battle/protocol/KickInfo;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/arena/GameRoomActivity_$w;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/arena/GameRoomActivity_$w;-><init>(Lcom/join/mgps/activity/arena/GameRoomActivity_;Lcom/papa91/battle/protocol/KickInfo;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method Q1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/arena/GameRoomActivity_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/arena/GameRoomActivity_$a;-><init>(Lcom/join/mgps/activity/arena/GameRoomActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method Y1(Lcom/papa91/battle/protocol/GameRoom;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/arena/GameRoomActivity_$r;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/arena/GameRoomActivity_$r;-><init>(Lcom/join/mgps/activity/arena/GameRoomActivity_;Ljava/lang/String;JLjava/lang/String;Lcom/papa91/battle/protocol/GameRoom;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method Z1()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/arena/GameRoomActivity_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/arena/GameRoomActivity_$j;-><init>(Lcom/join/mgps/activity/arena/GameRoomActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method a2()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/arena/GameRoomActivity_$l;

    const-string v2, ""

    const-wide/16 v3, 0xbb8

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/arena/GameRoomActivity_$l;-><init>(Lcom/join/mgps/activity/arena/GameRoomActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method b2(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/arena/GameRoomActivity_$i;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/arena/GameRoomActivity_$i;-><init>(Lcom/join/mgps/activity/arena/GameRoomActivity_;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method c2()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/arena/GameRoomActivity_$o;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/arena/GameRoomActivity_$o;-><init>(Lcom/join/mgps/activity/arena/GameRoomActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method e2(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/arena/GameRoomActivity_$s;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/arena/GameRoomActivity_$s;-><init>(Lcom/join/mgps/activity/arena/GameRoomActivity_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method g2()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/arena/GameRoomActivity_$u;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/arena/GameRoomActivity_$u;-><init>(Lcom/join/mgps/activity/arena/GameRoomActivity_;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/arena/GameRoomActivity_;->k3:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method i2()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/arena/GameRoomActivity_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/arena/GameRoomActivity_$c;-><init>(Lcom/join/mgps/activity/arena/GameRoomActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

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

.method j2()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/arena/GameRoomActivity_$v;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/arena/GameRoomActivity_$v;-><init>(Lcom/join/mgps/activity/arena/GameRoomActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method k2()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/arena/GameRoomActivity_$t;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/arena/GameRoomActivity_$t;-><init>(Lcom/join/mgps/activity/arena/GameRoomActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method o2()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/arena/GameRoomActivity_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/arena/GameRoomActivity_$e;-><init>(Lcom/join/mgps/activity/arena/GameRoomActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/arena/GameRoomActivity_;->j3:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/arena/GameRoomActivity_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/join/mgps/activity/arena/GameRoomActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c0058

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/arena/GameRoomActivity_;->setContentView(I)V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 1

    const v0, 0x7f0916c8

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->p0:Landroid/widget/TextView;

    const v0, 0x7f09129a

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->p1:Landroid/widget/TextView;

    const v0, 0x7f0916c6

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->v1:Landroid/widget/TextView;

    const v0, 0x7f090ca8

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->A1:Landroid/widget/LinearLayout;

    const v0, 0x7f0915eb

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->B1:Landroid/widget/TextView;

    const v0, 0x7f0915de

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->C1:Landroid/widget/TextView;

    const v0, 0x7f091670

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->D1:Landroid/widget/TextView;

    const v0, 0x7f0915e3

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->E1:Landroid/widget/TextView;

    const v0, 0x7f090d29

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->F1:Landroid/widget/LinearLayout;

    const v0, 0x7f0915b1

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->G1:Landroid/widget/TextView;

    const v0, 0x7f09092a

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->H1:Landroid/widget/ImageView;

    const v0, 0x7f090918

    .line 12
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->I1:Landroid/widget/ImageView;

    const v0, 0x7f090974

    .line 13
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->J1:Landroid/widget/ImageView;

    const v0, 0x7f091150

    .line 14
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->K1:Landroid/view/View;

    const v0, 0x7f09155f

    .line 15
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->L1:Landroid/widget/TextView;

    const v0, 0x7f09117c

    .line 16
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->M1:Landroid/widget/RelativeLayout;

    const v0, 0x7f091596

    .line 17
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->N1:Landroid/widget/TextView;

    const v0, 0x7f09090c

    .line 18
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->O1:Landroid/widget/ImageView;

    const v0, 0x7f09115f

    .line 19
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->P1:Landroid/widget/LinearLayout;

    const v0, 0x7f091160

    .line 20
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->Q1:Landroid/widget/RelativeLayout;

    const v0, 0x7f090c8a

    .line 21
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->R1:Landroid/view/View;

    const v0, 0x7f091598

    .line 22
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->S1:Landroid/widget/TextView;

    const v0, 0x7f09090e

    .line 23
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->T1:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f090cc2

    .line 24
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->U1:Landroid/widget/LinearLayout;

    const v0, 0x7f0908f5

    .line 25
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->V1:Landroid/widget/RadioButton;

    const v0, 0x7f0910a7

    .line 26
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioGroup;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->W1:Landroid/widget/RadioGroup;

    const v0, 0x7f0908f6

    .line 27
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->X1:Landroid/view/View;

    const v0, 0x7f0915fb

    .line 28
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->Y1:Landroid/widget/TextView;

    const v0, 0x7f090205

    .line 29
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->a2:Landroid/view/View;

    const v0, 0x7f090206

    .line 30
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->b2:Landroid/widget/ImageView;

    const v0, 0x7f090207

    .line 31
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->c2:Landroid/widget/TextView;

    const v0, 0x7f091601

    .line 32
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->d2:Landroid/widget/TextView;

    const v0, 0x7f091599

    .line 33
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/GameRoomActivity;->z2:Landroid/widget/TextView;

    const v0, 0x7f09090f

    .line 34
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 35
    new-instance v0, Lcom/join/mgps/activity/arena/GameRoomActivity_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/arena/GameRoomActivity_$k;-><init>(Lcom/join/mgps/activity/arena/GameRoomActivity_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 36
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/arena/GameRoomActivity;->afterViews()V

    return-void
.end method

.method p2(Lcom/papa91/battle/protocol/BattleServerAddr;Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/arena/GameRoomActivity_$f;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/activity/arena/GameRoomActivity_$f;-><init>(Lcom/join/mgps/activity/arena/GameRoomActivity_;Lcom/papa91/battle/protocol/BattleServerAddr;Ljava/lang/String;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/arena/GameRoomActivity_;->k3:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method s2()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/arena/GameRoomActivity_$g;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/arena/GameRoomActivity_$g;-><init>(Lcom/join/mgps/activity/arena/GameRoomActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/BaseActivity;->setContentView(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/arena/GameRoomActivity_;->j3:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/join/mgps/activity/FriendActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/arena/GameRoomActivity_;->j3:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/activity/ComponentActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/arena/GameRoomActivity_;->j3:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/arena/GameRoomActivity_;->injectExtras_()V

    return-void
.end method

.method showToast(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/arena/GameRoomActivity_$d;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/arena/GameRoomActivity_$d;-><init>(Lcom/join/mgps/activity/arena/GameRoomActivity_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method t2()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/arena/GameRoomActivity_$m;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/arena/GameRoomActivity_$m;-><init>(Lcom/join/mgps/activity/arena/GameRoomActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method v2(Lcom/papa91/battle/protocol/GameRoom;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/arena/GameRoomActivity_$z;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/arena/GameRoomActivity_$z;-><init>(Lcom/join/mgps/activity/arena/GameRoomActivity_;Lcom/papa91/battle/protocol/GameRoom;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
