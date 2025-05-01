.class public final Lcom/join/mgps/activity/posting/PostingActivity_;
.super Lcom/join/mgps/activity/posting/PostingActivity;
.source "PostingActivity_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/posting/PostingActivity_$v;
    }
.end annotation


# static fields
.field public static final K1:Ljava/lang/String; = "fromType"

.field public static final L1:Ljava/lang/String; = "gameTag"

.field public static final M1:Ljava/lang/String; = "postingType"

.field public static final N1:Ljava/lang/String; = "postingGroup"

.field public static final O1:Ljava/lang/String; = "tag_id"

.field public static final P1:Ljava/lang/String; = "tag_name"

.field public static final Q1:Ljava/lang/String; = "fid"

.field public static final R1:Ljava/lang/String; = "game_id"

.field public static final S1:Ljava/lang/String; = "label"


# instance fields
.field private final I1:La4/c;

.field private final J1:Ljava/util/Map;
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
    invoke-direct {p0}, Lcom/join/mgps/activity/posting/PostingActivity;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/posting/PostingActivity_;->I1:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/posting/PostingActivity_;->J1:Ljava/util/Map;

    return-void
.end method

.method static synthetic h1(Lcom/join/mgps/activity/posting/PostingActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/posting/PostingActivity;->O0()V

    return-void
.end method

.method static synthetic i1(Lcom/join/mgps/activity/posting/PostingActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/posting/PostingActivity;->W0()V

    return-void
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 2
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/posting/PostingActivity;->c:Lcom/join/mgps/Util/b;

    .line 3
    invoke-direct {p0}, Lcom/join/mgps/activity/posting/PostingActivity_;->injectExtras_()V

    return-void
.end method

.method private injectExtras_()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_8

    const-string v1, "fromType"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/join/mgps/activity/posting/PostingActivity;->b:I

    :cond_0
    const-string v1, "gameTag"

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    iput-object v1, p0, Lcom/join/mgps/activity/posting/PostingActivity;->d:Ljava/util/ArrayList;

    :cond_1
    const-string v1, "postingType"

    .line 6
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 7
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/join/mgps/activity/posting/PostingActivity;->e:I

    :cond_2
    const-string v1, "postingGroup"

    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 9
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/posting/PostingActivity;->f:Ljava/lang/String;

    :cond_3
    const-string v1, "tag_id"

    .line 10
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 11
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/posting/PostingActivity;->g:Ljava/lang/String;

    :cond_4
    const-string v1, "tag_name"

    .line 12
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 13
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/posting/PostingActivity;->h:Ljava/lang/String;

    :cond_5
    const-string v1, "fid"

    .line 14
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 15
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/join/mgps/activity/posting/PostingActivity;->i:I

    :cond_6
    const-string v1, "game_id"

    .line 16
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 17
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/posting/PostingActivity;->j:Ljava/lang/String;

    :cond_7
    const-string v1, "label"

    .line 18
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 19
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/posting/PostingActivity;->k:Ljava/lang/String;

    :cond_8
    return-void
.end method

.method static synthetic j1(Lcom/join/mgps/activity/posting/PostingActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/posting/PostingActivity;->M0()V

    return-void
.end method

.method static synthetic k1(Lcom/join/mgps/activity/posting/PostingActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/posting/PostingActivity;->u0()V

    return-void
.end method

.method static synthetic l1(Lcom/join/mgps/activity/posting/PostingActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/posting/PostingActivity;->F0()V

    return-void
.end method

.method static synthetic m1(Lcom/join/mgps/activity/posting/PostingActivity_;Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/posting/PostingActivity;->A0(Z)V

    return-void
.end method

.method static synthetic n1(Lcom/join/mgps/activity/posting/PostingActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/posting/PostingActivity;->G0()V

    return-void
.end method

.method static synthetic o1(Lcom/join/mgps/activity/posting/PostingActivity_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/posting/PostingActivity;->a1(I)V

    return-void
.end method

.method static synthetic p1(Lcom/join/mgps/activity/posting/PostingActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/posting/PostingActivity;->showLoading()V

    return-void
.end method

.method static synthetic q1(Lcom/join/mgps/activity/posting/PostingActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/posting/PostingActivity;->X0()V

    return-void
.end method

.method static synthetic r1(Lcom/join/mgps/activity/posting/PostingActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/posting/PostingActivity;->N0()V

    return-void
.end method

.method static synthetic s1(Lcom/join/mgps/activity/posting/PostingActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/posting/PostingActivity;->V0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic t1(Lcom/join/mgps/activity/posting/PostingActivity_;Lcom/join/mgps/dto/GroupListBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/posting/PostingActivity;->Q0(Lcom/join/mgps/dto/GroupListBean;)V

    return-void
.end method

.method static synthetic u1(Lcom/join/mgps/activity/posting/PostingActivity_;Lcom/join/mgps/dto/GroupListBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/posting/PostingActivity;->Z0(Lcom/join/mgps/dto/GroupListBean;)V

    return-void
.end method

.method static synthetic v1(Lcom/join/mgps/activity/posting/PostingActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/posting/PostingActivity;->showToast(Ljava/lang/String;)V

    return-void
.end method

.method public static w1(Landroid/content/Context;)Lcom/join/mgps/activity/posting/PostingActivity_$v;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/posting/PostingActivity_$v;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/posting/PostingActivity_$v;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static x1(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/posting/PostingActivity_$v;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/posting/PostingActivity_$v;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/posting/PostingActivity_$v;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method


# virtual methods
.method A0(Z)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/posting/PostingActivity_$l;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/posting/PostingActivity_$l;-><init>(Lcom/join/mgps/activity/posting/PostingActivity_;Ljava/lang/String;JLjava/lang/String;Z)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method F0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/posting/PostingActivity_$j;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/posting/PostingActivity_$j;-><init>(Lcom/join/mgps/activity/posting/PostingActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method G0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/posting/PostingActivity_$m;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/posting/PostingActivity_$m;-><init>(Lcom/join/mgps/activity/posting/PostingActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method M0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/posting/PostingActivity_$t;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/posting/PostingActivity_$t;-><init>(Lcom/join/mgps/activity/posting/PostingActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method N0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/posting/PostingActivity_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/posting/PostingActivity_$c;-><init>(Lcom/join/mgps/activity/posting/PostingActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method O0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/posting/PostingActivity_$s;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/posting/PostingActivity_$s;-><init>(Lcom/join/mgps/activity/posting/PostingActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method Q0(Lcom/join/mgps/dto/GroupListBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/posting/PostingActivity_$e;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/posting/PostingActivity_$e;-><init>(Lcom/join/mgps/activity/posting/PostingActivity_;Lcom/join/mgps/dto/GroupListBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method V0(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/posting/PostingActivity_$d;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/posting/PostingActivity_$d;-><init>(Lcom/join/mgps/activity/posting/PostingActivity_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method W0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/posting/PostingActivity_$h;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/posting/PostingActivity_$h;-><init>(Lcom/join/mgps/activity/posting/PostingActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method X0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/posting/PostingActivity_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/posting/PostingActivity_$b;-><init>(Lcom/join/mgps/activity/posting/PostingActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method Z0(Lcom/join/mgps/dto/GroupListBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/posting/PostingActivity_$f;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/posting/PostingActivity_$f;-><init>(Lcom/join/mgps/activity/posting/PostingActivity_;Lcom/join/mgps/dto/GroupListBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method a1(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/posting/PostingActivity_$u;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/posting/PostingActivity_$u;-><init>(Lcom/join/mgps/activity/posting/PostingActivity_;I)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/posting/PostingActivity_;->J1:Ljava/util/Map;

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

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/posting/PostingActivity_;->I1:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/posting/PostingActivity_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/BaseFragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c0084

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/posting/PostingActivity_;->setContentView(I)V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 4

    const v0, 0x7f091032

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/CustomEdittext;

    iput-object v0, p0, Lcom/join/mgps/activity/posting/PostingActivity;->m:Lcom/join/mgps/customview/CustomEdittext;

    const v0, 0x7f091031

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/CustomEdittext;

    iput-object v0, p0, Lcom/join/mgps/activity/posting/PostingActivity;->n:Lcom/join/mgps/customview/CustomEdittext;

    const v0, 0x7f091030

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/posting/PostingActivity;->o:Landroid/view/View;

    const v0, 0x7f09102e

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/join/mgps/activity/posting/PostingActivity;->p:Landroid/widget/EditText;

    const v0, 0x7f09102f

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lit/sephiroth/android/library/widget/HListView;

    iput-object v0, p0, Lcom/join/mgps/activity/posting/PostingActivity;->q:Lit/sephiroth/android/library/widget/HListView;

    const v0, 0x7f0905b7

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/posting/PostingActivity;->r:Landroid/widget/FrameLayout;

    const v0, 0x7f090cfb

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/posting/PostingActivity;->s:Landroid/widget/LinearLayout;

    const v0, 0x7f0915ac

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/posting/PostingActivity;->t:Landroid/widget/TextView;

    const v0, 0x7f090265

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/join/mgps/activity/posting/PostingActivity;->u:Landroid/widget/Button;

    const v0, 0x7f090d1b

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/posting/PostingActivity;->v:Landroid/widget/RelativeLayout;

    const v0, 0x7f091669

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/posting/PostingActivity;->w:Landroid/widget/TextView;

    const v0, 0x7f090266

    .line 12
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/join/mgps/activity/posting/PostingActivity;->x:Landroid/widget/Button;

    const v0, 0x7f090146

    .line 13
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/posting/PostingActivity;->y:Landroid/widget/ImageView;

    const v0, 0x7f09095b

    .line 14
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/posting/PostingActivity;->z:Landroid/widget/ImageView;

    const v0, 0x7f09165b

    .line 15
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/posting/PostingActivity;->A:Landroid/widget/TextView;

    const v0, 0x7f09095c

    .line 16
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/posting/PostingActivity;->B:Landroid/widget/ImageView;

    const v0, 0x7f090222

    .line 17
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/join/mgps/activity/posting/PostingActivity;->C:Landroid/widget/Button;

    const v0, 0x7f090cd9

    .line 18
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/posting/PostingActivity;->D:Landroid/widget/LinearLayout;

    const v0, 0x7f091178

    .line 19
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/posting/PostingActivity;->E:Landroid/widget/RelativeLayout;

    const v0, 0x7f090d7f

    .line 20
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/posting/PostingActivity;->F:Landroid/widget/LinearLayout;

    const v0, 0x7f090d82

    .line 21
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/posting/PostingActivity;->G:Landroid/widget/LinearLayout;

    const v0, 0x7f0905b3

    .line 22
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/posting/PostingActivity;->Q:Landroid/widget/FrameLayout;

    const v0, 0x7f090d3f

    .line 23
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/posting/PostingActivity;->S:Landroid/widget/LinearLayout;

    const v0, 0x7f09110c

    .line 24
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f091261

    .line 25
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f0905b4

    .line 26
    invoke-interface {p1, v2}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    .line 27
    iget-object v2, p0, Lcom/join/mgps/activity/posting/PostingActivity;->C:Landroid/widget/Button;

    if-eqz v2, :cond_0

    .line 28
    new-instance v3, Lcom/join/mgps/activity/posting/PostingActivity_$k;

    invoke-direct {v3, p0}, Lcom/join/mgps/activity/posting/PostingActivity_$k;-><init>(Lcom/join/mgps/activity/posting/PostingActivity_;)V

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz v0, :cond_1

    .line 29
    new-instance v2, Lcom/join/mgps/activity/posting/PostingActivity_$n;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/posting/PostingActivity_$n;-><init>(Lcom/join/mgps/activity/posting/PostingActivity_;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    if-eqz v1, :cond_2

    .line 30
    new-instance v0, Lcom/join/mgps/activity/posting/PostingActivity_$o;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/posting/PostingActivity_$o;-><init>(Lcom/join/mgps/activity/posting/PostingActivity_;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 31
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/posting/PostingActivity;->y:Landroid/widget/ImageView;

    if-eqz v0, :cond_3

    .line 32
    new-instance v1, Lcom/join/mgps/activity/posting/PostingActivity_$p;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/posting/PostingActivity_$p;-><init>(Lcom/join/mgps/activity/posting/PostingActivity_;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 33
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/activity/posting/PostingActivity;->Q:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_4

    .line 34
    new-instance v1, Lcom/join/mgps/activity/posting/PostingActivity_$q;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/posting/PostingActivity_$q;-><init>(Lcom/join/mgps/activity/posting/PostingActivity_;)V

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_4
    if-eqz p1, :cond_5

    .line 35
    new-instance v0, Lcom/join/mgps/activity/posting/PostingActivity_$r;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/posting/PostingActivity_$r;-><init>(Lcom/join/mgps/activity/posting/PostingActivity_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 36
    :cond_5
    invoke-virtual {p0}, Lcom/join/mgps/activity/posting/PostingActivity;->afterViews()V

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
    iget-object v0, p0, Lcom/join/mgps/activity/posting/PostingActivity_;->J1:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/BaseFragmentActivity;->setContentView(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/posting/PostingActivity_;->I1:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/BaseFragmentActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/posting/PostingActivity_;->I1:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/activity/ComponentActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/posting/PostingActivity_;->I1:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/posting/PostingActivity_;->injectExtras_()V

    return-void
.end method

.method showLoading()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/posting/PostingActivity_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/posting/PostingActivity_$a;-><init>(Lcom/join/mgps/activity/posting/PostingActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showToast(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/posting/PostingActivity_$g;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/posting/PostingActivity_$g;-><init>(Lcom/join/mgps/activity/posting/PostingActivity_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method u0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/posting/PostingActivity_$i;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/posting/PostingActivity_$i;-><init>(Lcom/join/mgps/activity/posting/PostingActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method
