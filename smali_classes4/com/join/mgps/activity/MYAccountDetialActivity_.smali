.class public final Lcom/join/mgps/activity/MYAccountDetialActivity_;
.super Lcom/join/mgps/activity/MYAccountDetialActivity;
.source "MYAccountDetialActivity_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/MYAccountDetialActivity_$a0;
    }
.end annotation


# instance fields
.field private final J:La4/c;

.field private final K:Ljava/util/Map;
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
    invoke-direct {p0}, Lcom/join/mgps/activity/MYAccountDetialActivity;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/MYAccountDetialActivity_;->J:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/MYAccountDetialActivity_;->K:Ljava/util/Map;

    return-void
.end method

.method static synthetic H0(Lcom/join/mgps/activity/MYAccountDetialActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MYAccountDetialActivity;->E0()V

    return-void
.end method

.method static synthetic I0(Lcom/join/mgps/activity/MYAccountDetialActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MYAccountDetialActivity;->o0()V

    return-void
.end method

.method static synthetic J0(Lcom/join/mgps/activity/MYAccountDetialActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MYAccountDetialActivity;->error(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic K0(Lcom/join/mgps/activity/MYAccountDetialActivity_;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/MYAccountDetialActivity;->k0(Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic L0(Lcom/join/mgps/activity/MYAccountDetialActivity_;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/MYAccountDetialActivity;->t0(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic M0(Lcom/join/mgps/activity/MYAccountDetialActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MYAccountDetialActivity;->showToast(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic N0(Lcom/join/mgps/activity/MYAccountDetialActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MYAccountDetialActivity;->s0()V

    return-void
.end method

.method static synthetic O0(Lcom/join/mgps/activity/MYAccountDetialActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MYAccountDetialActivity;->showLodingDismis()V

    return-void
.end method

.method static synthetic P0(Lcom/join/mgps/activity/MYAccountDetialActivity_;Lcom/wufan/user/service/protobuf/n0;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MYAccountDetialActivity;->p0(Lcom/wufan/user/service/protobuf/n0;)V

    return-void
.end method

.method static synthetic Q0(Lcom/join/mgps/activity/MYAccountDetialActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MYAccountDetialActivity;->showMessage(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic R0(Lcom/join/mgps/activity/MYAccountDetialActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MYAccountDetialActivity;->x0()V

    return-void
.end method

.method static synthetic S0(Lcom/join/mgps/activity/MYAccountDetialActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MYAccountDetialActivity;->F0()V

    return-void
.end method

.method public static T0(Landroid/content/Context;)Lcom/join/mgps/activity/MYAccountDetialActivity_$a0;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MYAccountDetialActivity_$a0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MYAccountDetialActivity_$a0;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static U0(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/MYAccountDetialActivity_$a0;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MYAccountDetialActivity_$a0;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MYAccountDetialActivity_$a0;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    new-instance p1, Lcom/join/mgps/pref/PrefDef_;

    invoke-direct {p1, p0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/join/mgps/activity/MYAccountDetialActivity;->r:Lcom/join/mgps/pref/PrefDef_;

    .line 2
    invoke-static {p0}, La4/c;->b(La4/b;)V

    return-void
.end method


# virtual methods
.method E0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MYAccountDetialActivity_$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MYAccountDetialActivity_$f;-><init>(Lcom/join/mgps/activity/MYAccountDetialActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method F0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/MYAccountDetialActivity_$p;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/MYAccountDetialActivity_$p;-><init>(Lcom/join/mgps/activity/MYAccountDetialActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method error(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MYAccountDetialActivity_$g;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MYAccountDetialActivity_$g;-><init>(Lcom/join/mgps/activity/MYAccountDetialActivity_;Ljava/lang/String;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/MYAccountDetialActivity_;->K:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
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

.method k0(Ljava/lang/String;I)V
    .locals 9

    .line 1
    new-instance v8, Lcom/join/mgps/activity/MYAccountDetialActivity_$r;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v8

    move-object v1, p0

    move-object v6, p1

    move v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/join/mgps/activity/MYAccountDetialActivity_$r;-><init>(Lcom/join/mgps/activity/MYAccountDetialActivity_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;I)V

    invoke-static {v8}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method o0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/MYAccountDetialActivity_$q;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/MYAccountDetialActivity_$q;-><init>(Lcom/join/mgps/activity/MYAccountDetialActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MYAccountDetialActivity_;->J:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/MYAccountDetialActivity_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c066f

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/MYAccountDetialActivity_;->setContentView(I)V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 14

    const v0, 0x7f091489

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MYAccountDetialActivity;->e:Landroid/widget/TextView;

    const v0, 0x7f090c64

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MYAccountDetialActivity;->f:Landroid/widget/TextView;

    const v0, 0x7f090ea1

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MYAccountDetialActivity;->g:Landroid/widget/TextView;

    const v0, 0x7f090f8c

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MYAccountDetialActivity;->h:Landroid/widget/TextView;

    const v0, 0x7f091824

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MYAccountDetialActivity;->i:Landroid/widget/TextView;

    const v0, 0x7f090517

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MYAccountDetialActivity;->j:Landroid/widget/TextView;

    const v0, 0x7f090795

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/join/mgps/activity/MYAccountDetialActivity;->k:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f090067

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MYAccountDetialActivity;->l:Landroid/widget/TextView;

    const v0, 0x7f090ffe

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MYAccountDetialActivity;->m:Landroid/widget/TextView;

    const v0, 0x7f090fd2

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MYAccountDetialActivity;->n:Landroid/widget/TextView;

    const v0, 0x7f09073c

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MYAccountDetialActivity;->o:Landroid/widget/TextView;

    const v0, 0x7f09073b

    .line 12
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MYAccountDetialActivity;->p:Landroid/widget/TextView;

    const v0, 0x7f09073a

    .line 13
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MYAccountDetialActivity;->q:Landroid/widget/TextView;

    const v0, 0x7f091667

    .line 14
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MYAccountDetialActivity;->t:Landroid/widget/TextView;

    const v0, 0x7f090796

    .line 15
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f090066

    .line 16
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f090f8e

    .line 17
    invoke-interface {p1, v2}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v2

    const v3, 0x7f091825

    .line 18
    invoke-interface {p1, v3}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v3

    const v4, 0x7f090ea5

    .line 19
    invoke-interface {p1, v4}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v4

    const v5, 0x7f090fd0

    .line 20
    invoke-interface {p1, v5}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v5

    const v6, 0x7f090ff8

    .line 21
    invoke-interface {p1, v6}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v6

    const v7, 0x7f090c62

    .line 22
    invoke-interface {p1, v7}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v7

    const v8, 0x7f091724

    .line 23
    invoke-interface {p1, v8}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v8

    const v9, 0x7f090514

    .line 24
    invoke-interface {p1, v9}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v9

    const v10, 0x7f090146

    .line 25
    invoke-interface {p1, v10}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v10

    const v11, 0x7f0901c8

    .line 26
    invoke-interface {p1, v11}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v11

    const v12, 0x7f0901c9

    .line 27
    invoke-interface {p1, v12}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v12

    const v13, 0x7f0901c7

    .line 28
    invoke-interface {p1, v13}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz v0, :cond_0

    .line 29
    new-instance v13, Lcom/join/mgps/activity/MYAccountDetialActivity_$k;

    invoke-direct {v13, p0}, Lcom/join/mgps/activity/MYAccountDetialActivity_$k;-><init>(Lcom/join/mgps/activity/MYAccountDetialActivity_;)V

    invoke-virtual {v0, v13}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz v1, :cond_1

    .line 30
    new-instance v0, Lcom/join/mgps/activity/MYAccountDetialActivity_$s;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MYAccountDetialActivity_$s;-><init>(Lcom/join/mgps/activity/MYAccountDetialActivity_;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    if-eqz v2, :cond_2

    .line 31
    new-instance v0, Lcom/join/mgps/activity/MYAccountDetialActivity_$t;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MYAccountDetialActivity_$t;-><init>(Lcom/join/mgps/activity/MYAccountDetialActivity_;)V

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    if-eqz v3, :cond_3

    .line 32
    new-instance v0, Lcom/join/mgps/activity/MYAccountDetialActivity_$u;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MYAccountDetialActivity_$u;-><init>(Lcom/join/mgps/activity/MYAccountDetialActivity_;)V

    invoke-virtual {v3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    if-eqz v4, :cond_4

    .line 33
    new-instance v0, Lcom/join/mgps/activity/MYAccountDetialActivity_$v;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MYAccountDetialActivity_$v;-><init>(Lcom/join/mgps/activity/MYAccountDetialActivity_;)V

    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_4
    if-eqz v5, :cond_5

    .line 34
    new-instance v0, Lcom/join/mgps/activity/MYAccountDetialActivity_$w;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MYAccountDetialActivity_$w;-><init>(Lcom/join/mgps/activity/MYAccountDetialActivity_;)V

    invoke-virtual {v5, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_5
    if-eqz v6, :cond_6

    .line 35
    new-instance v0, Lcom/join/mgps/activity/MYAccountDetialActivity_$x;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MYAccountDetialActivity_$x;-><init>(Lcom/join/mgps/activity/MYAccountDetialActivity_;)V

    invoke-virtual {v6, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_6
    if-eqz v7, :cond_7

    .line 36
    new-instance v0, Lcom/join/mgps/activity/MYAccountDetialActivity_$y;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MYAccountDetialActivity_$y;-><init>(Lcom/join/mgps/activity/MYAccountDetialActivity_;)V

    invoke-virtual {v7, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_7
    if-eqz v8, :cond_8

    .line 37
    new-instance v0, Lcom/join/mgps/activity/MYAccountDetialActivity_$z;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MYAccountDetialActivity_$z;-><init>(Lcom/join/mgps/activity/MYAccountDetialActivity_;)V

    invoke-virtual {v8, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_8
    if-eqz v9, :cond_9

    .line 38
    new-instance v0, Lcom/join/mgps/activity/MYAccountDetialActivity_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MYAccountDetialActivity_$a;-><init>(Lcom/join/mgps/activity/MYAccountDetialActivity_;)V

    invoke-virtual {v9, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_9
    if-eqz v10, :cond_a

    .line 39
    new-instance v0, Lcom/join/mgps/activity/MYAccountDetialActivity_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MYAccountDetialActivity_$b;-><init>(Lcom/join/mgps/activity/MYAccountDetialActivity_;)V

    invoke-virtual {v10, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_a
    if-eqz v11, :cond_b

    .line 40
    new-instance v0, Lcom/join/mgps/activity/MYAccountDetialActivity_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MYAccountDetialActivity_$c;-><init>(Lcom/join/mgps/activity/MYAccountDetialActivity_;)V

    invoke-virtual {v11, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_b
    if-eqz v12, :cond_c

    .line 41
    new-instance v0, Lcom/join/mgps/activity/MYAccountDetialActivity_$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MYAccountDetialActivity_$d;-><init>(Lcom/join/mgps/activity/MYAccountDetialActivity_;)V

    invoke-virtual {v12, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_c
    if-eqz p1, :cond_d

    .line 42
    new-instance v0, Lcom/join/mgps/activity/MYAccountDetialActivity_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MYAccountDetialActivity_$e;-><init>(Lcom/join/mgps/activity/MYAccountDetialActivity_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 43
    :cond_d
    invoke-virtual {p0}, Lcom/join/mgps/activity/MYAccountDetialActivity;->afterview()V

    return-void
.end method

.method p0(Lcom/wufan/user/service/protobuf/n0;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MYAccountDetialActivity_$m;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MYAccountDetialActivity_$m;-><init>(Lcom/join/mgps/activity/MYAccountDetialActivity_;Lcom/wufan/user/service/protobuf/n0;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/MYAccountDetialActivity_;->K:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method s0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MYAccountDetialActivity_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MYAccountDetialActivity_$j;-><init>(Lcom/join/mgps/activity/MYAccountDetialActivity_;)V

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
    iget-object p1, p0, Lcom/join/mgps/activity/MYAccountDetialActivity_;->J:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/BaseActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/MYAccountDetialActivity_;->J:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/activity/ComponentActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/MYAccountDetialActivity_;->J:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method showLodingDismis()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MYAccountDetialActivity_$l;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MYAccountDetialActivity_$l;-><init>(Lcom/join/mgps/activity/MYAccountDetialActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showMessage(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MYAccountDetialActivity_$n;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MYAccountDetialActivity_$n;-><init>(Lcom/join/mgps/activity/MYAccountDetialActivity_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showToast(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MYAccountDetialActivity_$i;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MYAccountDetialActivity_$i;-><init>(Lcom/join/mgps/activity/MYAccountDetialActivity_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method t0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MYAccountDetialActivity_$h;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/activity/MYAccountDetialActivity_$h;-><init>(Lcom/join/mgps/activity/MYAccountDetialActivity_;Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method x0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/MYAccountDetialActivity_$o;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/MYAccountDetialActivity_$o;-><init>(Lcom/join/mgps/activity/MYAccountDetialActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method
