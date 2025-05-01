.class public final Lcom/join/mgps/activity/MyAccountLoginActivity_;
.super Lcom/join/mgps/activity/MyAccountLoginActivity;
.source "MyAccountLoginActivity_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/MyAccountLoginActivity_$x;
    }
.end annotation


# static fields
.field public static final K:Ljava/lang/String; = "intentFrom"

.field public static final L:Ljava/lang/String; = "fromIndex"


# instance fields
.field private final I:La4/c;

.field private final J:Ljava/util/Map;
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
    invoke-direct {p0}, Lcom/join/mgps/activity/MyAccountLoginActivity;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/MyAccountLoginActivity_;->I:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/MyAccountLoginActivity_;->J:Ljava/util/Map;

    return-void
.end method

.method static synthetic A0(Lcom/join/mgps/activity/MyAccountLoginActivity_;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Lcom/join/mgps/activity/MyAccountLoginActivity;->login(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method static synthetic B0(Lcom/join/mgps/activity/MyAccountLoginActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MyAccountLoginActivity;->error(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic C0(Lcom/join/mgps/activity/MyAccountLoginActivity_;Lcom/wufan/user/service/protobuf/n0;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MyAccountLoginActivity;->loginSuccess(Lcom/wufan/user/service/protobuf/n0;)V

    return-void
.end method

.method static synthetic D0(Lcom/join/mgps/activity/MyAccountLoginActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MyAccountLoginActivity;->showToast(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic E0(Lcom/join/mgps/activity/MyAccountLoginActivity_;Lcom/join/mgps/dto/AccountRegisterThirdwaiRequestBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MyAccountLoginActivity;->goRegin(Lcom/join/mgps/dto/AccountRegisterThirdwaiRequestBean;)V

    return-void
.end method

.method static synthetic F0(Lcom/join/mgps/activity/MyAccountLoginActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MyAccountLoginActivity;->showMessage(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic G0(Lcom/join/mgps/activity/MyAccountLoginActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyAccountLoginActivity;->t0()V

    return-void
.end method

.method static synthetic H0(Lcom/join/mgps/activity/MyAccountLoginActivity_;Lcom/wufan/user/service/protobuf/n0;Lcom/join/mgps/dto/RewardBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/MyAccountLoginActivity;->loginSuccess(Lcom/wufan/user/service/protobuf/n0;Lcom/join/mgps/dto/RewardBean;)V

    return-void
.end method

.method static synthetic I0(Lcom/join/mgps/activity/MyAccountLoginActivity_;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/MyAccountLoginActivity;->getLogin(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static J0(Landroid/content/Context;)Lcom/join/mgps/activity/MyAccountLoginActivity_$x;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyAccountLoginActivity_$x;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyAccountLoginActivity_$x;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static K0(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/MyAccountLoginActivity_$x;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyAccountLoginActivity_$x;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyAccountLoginActivity_$x;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 2
    new-instance v0, Lcom/join/mgps/pref/PrefDef_;

    invoke-direct {v0, p0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/activity/MyAccountLoginActivity;->y:Lcom/join/mgps/pref/PrefDef_;

    .line 3
    invoke-static {p0}, La4/c;->b(La4/b;)V

    const v0, 0x7f10029a

    .line 4
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/MyAccountLoginActivity;->g:Ljava/lang/String;

    const v0, 0x7f1000b6

    .line 5
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/MyAccountLoginActivity;->h:Ljava/lang/String;

    .line 6
    invoke-direct {p0}, Lcom/join/mgps/activity/MyAccountLoginActivity_;->injectExtras_()V

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

    const-string v1, "intentFrom"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/join/mgps/activity/MyAccountLoginActivity;->s:I

    :cond_0
    const-string v1, "fromIndex"

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/activity/MyAccountLoginActivity;->x:I

    :cond_1
    return-void
.end method

.method static synthetic w0(Lcom/join/mgps/activity/MyAccountLoginActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyAccountLoginActivity;->showLoding()V

    return-void
.end method

.method static synthetic x0(Lcom/join/mgps/activity/MyAccountLoginActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyAccountLoginActivity;->joinDevice()V

    return-void
.end method

.method static synthetic y0(Lcom/join/mgps/activity/MyAccountLoginActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyAccountLoginActivity;->showLodingDismis()V

    return-void
.end method

.method static synthetic z0(Lcom/join/mgps/activity/MyAccountLoginActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyAccountLoginActivity;->v0()V

    return-void
.end method


# virtual methods
.method error(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyAccountLoginActivity_$d;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MyAccountLoginActivity_$d;-><init>(Lcom/join/mgps/activity/MyAccountLoginActivity_;Ljava/lang/String;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/MyAccountLoginActivity_;->J:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method getLogin(Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    .line 1
    new-instance v8, Lcom/join/mgps/activity/MyAccountLoginActivity_$l;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v8

    move-object v1, p0

    move-object v6, p1

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/join/mgps/activity/MyAccountLoginActivity_$l;-><init>(Lcom/join/mgps/activity/MyAccountLoginActivity_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v8}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method goRegin(Lcom/join/mgps/dto/AccountRegisterThirdwaiRequestBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyAccountLoginActivity_$g;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MyAccountLoginActivity_$g;-><init>(Lcom/join/mgps/activity/MyAccountLoginActivity_;Lcom/join/mgps/dto/AccountRegisterThirdwaiRequestBean;)V

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

.method joinDevice()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/MyAccountLoginActivity_$m;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/MyAccountLoginActivity_$m;-><init>(Lcom/join/mgps/activity/MyAccountLoginActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method login(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    .locals 12

    .line 1
    new-instance v11, Lcom/join/mgps/activity/MyAccountLoginActivity_$o;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v11

    move-object v1, p0

    move v6, p1

    move-object v7, p2

    move-object v8, p3

    move/from16 v9, p4

    move-object/from16 v10, p5

    invoke-direct/range {v0 .. v10}, Lcom/join/mgps/activity/MyAccountLoginActivity_$o;-><init>(Lcom/join/mgps/activity/MyAccountLoginActivity_;Ljava/lang/String;JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    invoke-static {v11}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method loginSuccess(Lcom/wufan/user/service/protobuf/n0;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyAccountLoginActivity_$e;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MyAccountLoginActivity_$e;-><init>(Lcom/join/mgps/activity/MyAccountLoginActivity_;Lcom/wufan/user/service/protobuf/n0;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method loginSuccess(Lcom/wufan/user/service/protobuf/n0;Lcom/join/mgps/dto/RewardBean;)V
    .locals 3

    .line 2
    new-instance v0, Lcom/join/mgps/activity/MyAccountLoginActivity_$j;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/activity/MyAccountLoginActivity_$j;-><init>(Lcom/join/mgps/activity/MyAccountLoginActivity_;Lcom/wufan/user/service/protobuf/n0;Lcom/join/mgps/dto/RewardBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MyAccountLoginActivity_;->I:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/MyAccountLoginActivity_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c0672

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/MyAccountLoginActivity_;->setContentView(I)V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 8

    const v0, 0x7f091761

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/join/mgps/activity/MyAccountLoginActivity;->i:Landroid/widget/EditText;

    const v0, 0x7f090fd1

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MyAccountLoginActivity;->j:Landroid/widget/TextView;

    const v0, 0x7f091754

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MyAccountLoginActivity;->k:Landroid/widget/TextView;

    const v0, 0x7f090fcf

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/join/mgps/activity/MyAccountLoginActivity;->l:Landroid/widget/EditText;

    const v0, 0x7f0902d8

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/join/mgps/activity/MyAccountLoginActivity;->m:Landroid/widget/CheckBox;

    const v0, 0x7f090d8c

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MyAccountLoginActivity;->n:Landroid/widget/TextView;

    const v0, 0x7f091823

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MyAccountLoginActivity;->o:Landroid/widget/TextView;

    const v0, 0x7f0912a4

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f090567

    .line 9
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f090d86

    .line 10
    invoke-interface {p1, v2}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v2

    const v3, 0x7f090d88

    .line 11
    invoke-interface {p1, v3}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v3

    const v4, 0x7f090d8a

    .line 12
    invoke-interface {p1, v4}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v4

    const v5, 0x7f090d84

    .line 13
    invoke-interface {p1, v5}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v5

    const v6, 0x7f090146

    .line 14
    invoke-interface {p1, v6}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v6

    const v7, 0x7f091289

    .line 15
    invoke-interface {p1, v7}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz v0, :cond_0

    .line 16
    new-instance v7, Lcom/join/mgps/activity/MyAccountLoginActivity_$k;

    invoke-direct {v7, p0}, Lcom/join/mgps/activity/MyAccountLoginActivity_$k;-><init>(Lcom/join/mgps/activity/MyAccountLoginActivity_;)V

    invoke-virtual {v0, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/MyAccountLoginActivity;->n:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 18
    new-instance v7, Lcom/join/mgps/activity/MyAccountLoginActivity_$p;

    invoke-direct {v7, p0}, Lcom/join/mgps/activity/MyAccountLoginActivity_$p;-><init>(Lcom/join/mgps/activity/MyAccountLoginActivity_;)V

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    if-eqz v1, :cond_2

    .line 19
    new-instance v0, Lcom/join/mgps/activity/MyAccountLoginActivity_$q;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyAccountLoginActivity_$q;-><init>(Lcom/join/mgps/activity/MyAccountLoginActivity_;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    if-eqz v2, :cond_3

    .line 20
    new-instance v0, Lcom/join/mgps/activity/MyAccountLoginActivity_$r;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyAccountLoginActivity_$r;-><init>(Lcom/join/mgps/activity/MyAccountLoginActivity_;)V

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    if-eqz v3, :cond_4

    .line 21
    new-instance v0, Lcom/join/mgps/activity/MyAccountLoginActivity_$s;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyAccountLoginActivity_$s;-><init>(Lcom/join/mgps/activity/MyAccountLoginActivity_;)V

    invoke-virtual {v3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_4
    if-eqz v4, :cond_5

    .line 22
    new-instance v0, Lcom/join/mgps/activity/MyAccountLoginActivity_$t;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyAccountLoginActivity_$t;-><init>(Lcom/join/mgps/activity/MyAccountLoginActivity_;)V

    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_5
    if-eqz v5, :cond_6

    .line 23
    new-instance v0, Lcom/join/mgps/activity/MyAccountLoginActivity_$u;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyAccountLoginActivity_$u;-><init>(Lcom/join/mgps/activity/MyAccountLoginActivity_;)V

    invoke-virtual {v5, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_6
    if-eqz v6, :cond_7

    .line 24
    new-instance v0, Lcom/join/mgps/activity/MyAccountLoginActivity_$v;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyAccountLoginActivity_$v;-><init>(Lcom/join/mgps/activity/MyAccountLoginActivity_;)V

    invoke-virtual {v6, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_7
    if-eqz p1, :cond_8

    .line 25
    new-instance v0, Lcom/join/mgps/activity/MyAccountLoginActivity_$w;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyAccountLoginActivity_$w;-><init>(Lcom/join/mgps/activity/MyAccountLoginActivity_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 26
    :cond_8
    iget-object p1, p0, Lcom/join/mgps/activity/MyAccountLoginActivity;->o:Landroid/widget/TextView;

    if-eqz p1, :cond_9

    .line 27
    new-instance v0, Lcom/join/mgps/activity/MyAccountLoginActivity_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyAccountLoginActivity_$a;-><init>(Lcom/join/mgps/activity/MyAccountLoginActivity_;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 28
    :cond_9
    invoke-virtual {p0}, Lcom/join/mgps/activity/MyAccountLoginActivity;->afterView()V

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
    iget-object v0, p0, Lcom/join/mgps/activity/MyAccountLoginActivity_;->J:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/BaseAccountActivity;->setContentView(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/MyAccountLoginActivity_;->I:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/BaseActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/MyAccountLoginActivity_;->I:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/activity/ComponentActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/MyAccountLoginActivity_;->I:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/MyAccountLoginActivity_;->injectExtras_()V

    return-void
.end method

.method showLoding()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyAccountLoginActivity_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyAccountLoginActivity_$b;-><init>(Lcom/join/mgps/activity/MyAccountLoginActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLodingDismis()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyAccountLoginActivity_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyAccountLoginActivity_$c;-><init>(Lcom/join/mgps/activity/MyAccountLoginActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showMessage(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyAccountLoginActivity_$h;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MyAccountLoginActivity_$h;-><init>(Lcom/join/mgps/activity/MyAccountLoginActivity_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showToast(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyAccountLoginActivity_$f;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MyAccountLoginActivity_$f;-><init>(Lcom/join/mgps/activity/MyAccountLoginActivity_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method t0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyAccountLoginActivity_$i;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyAccountLoginActivity_$i;-><init>(Lcom/join/mgps/activity/MyAccountLoginActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method v0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/MyAccountLoginActivity_$n;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/MyAccountLoginActivity_$n;-><init>(Lcom/join/mgps/activity/MyAccountLoginActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method
