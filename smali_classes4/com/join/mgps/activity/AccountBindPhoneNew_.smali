.class public final Lcom/join/mgps/activity/AccountBindPhoneNew_;
.super Lcom/join/mgps/activity/AccountBindPhoneNew;
.source "AccountBindPhoneNew_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/AccountBindPhoneNew_$t;
    }
.end annotation


# static fields
.field public static final G:Ljava/lang/String; = "thirdRequestbean"

.field public static final H:Ljava/lang/String; = "from"


# instance fields
.field private final E:La4/c;

.field private final F:Ljava/util/Map;
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
    invoke-direct {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew_;->E:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew_;->F:Ljava/util/Map;

    return-void
.end method

.method static synthetic A0(Lcom/join/mgps/activity/AccountBindPhoneNew_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/AccountBindPhoneNew;->o0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic B0(Lcom/join/mgps/activity/AccountBindPhoneNew_;Lcom/wufan/user/service/protobuf/n0;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/AccountBindPhoneNew;->showFinishPage(Lcom/wufan/user/service/protobuf/n0;)V

    return-void
.end method

.method static synthetic C0(Lcom/join/mgps/activity/AccountBindPhoneNew_;Lcom/join/mgps/dto/AccountAnonymousReginRequest;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/AccountBindPhoneNew;->u0(Lcom/join/mgps/dto/AccountAnonymousReginRequest;)V

    return-void
.end method

.method static synthetic D0(Lcom/join/mgps/activity/AccountBindPhoneNew_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->t0()V

    return-void
.end method

.method static synthetic E0(Lcom/join/mgps/activity/AccountBindPhoneNew_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->s0()V

    return-void
.end method

.method static synthetic F0(Lcom/join/mgps/activity/AccountBindPhoneNew_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->k0()V

    return-void
.end method

.method static synthetic G0(Lcom/join/mgps/activity/AccountBindPhoneNew_;Lcom/join/mgps/dto/AccountAnonymousReginRequest;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/AccountBindPhoneNew;->q0(Lcom/join/mgps/dto/AccountAnonymousReginRequest;)V

    return-void
.end method

.method static synthetic H0(Lcom/join/mgps/activity/AccountBindPhoneNew_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->joinDevice()V

    return-void
.end method

.method static synthetic I0(Lcom/join/mgps/activity/AccountBindPhoneNew_;Lcom/join/mgps/dto/AccountAnonymousReginRequest;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/AccountBindPhoneNew;->r0(Lcom/join/mgps/dto/AccountAnonymousReginRequest;)V

    return-void
.end method

.method public static J0(Landroid/content/Context;)Lcom/join/mgps/activity/AccountBindPhoneNew_$t;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/AccountBindPhoneNew_$t;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/AccountBindPhoneNew_$t;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static K0(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/AccountBindPhoneNew_$t;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/AccountBindPhoneNew_$t;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/AccountBindPhoneNew_$t;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew_;->injectExtras_()V

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

    const-string v1, "thirdRequestbean"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/AccountRegisterThirdwaiRequestBean;

    iput-object v1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->d:Lcom/join/mgps/dto/AccountRegisterThirdwaiRequestBean;

    :cond_0
    const-string v1, "from"

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->e:I

    :cond_1
    return-void
.end method

.method static synthetic v0(Lcom/join/mgps/activity/AccountBindPhoneNew_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/AccountBindPhoneNew;->error(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic w0(Lcom/join/mgps/activity/AccountBindPhoneNew_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->phoneRegin()V

    return-void
.end method

.method static synthetic x0(Lcom/join/mgps/activity/AccountBindPhoneNew_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->m0()V

    return-void
.end method

.method static synthetic y0(Lcom/join/mgps/activity/AccountBindPhoneNew_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->thirdRegin()V

    return-void
.end method

.method static synthetic z0(Lcom/join/mgps/activity/AccountBindPhoneNew_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/AccountBindPhoneNew;->n0(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method error(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/AccountBindPhoneNew_$p;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/AccountBindPhoneNew_$p;-><init>(Lcom/join/mgps/activity/AccountBindPhoneNew_;Ljava/lang/String;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew_;->F:Ljava/util/Map;

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

.method joinDevice()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/AccountBindPhoneNew_$e;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/AccountBindPhoneNew_$e;-><init>(Lcom/join/mgps/activity/AccountBindPhoneNew_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method k0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/AccountBindPhoneNew_$c;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/AccountBindPhoneNew_$c;-><init>(Lcom/join/mgps/activity/AccountBindPhoneNew_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method m0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/AccountBindPhoneNew_$q;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/AccountBindPhoneNew_$q;-><init>(Lcom/join/mgps/activity/AccountBindPhoneNew_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method n0(Ljava/lang/String;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/AccountBindPhoneNew_$i;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/AccountBindPhoneNew_$i;-><init>(Lcom/join/mgps/activity/AccountBindPhoneNew_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method o0(Ljava/lang/String;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/AccountBindPhoneNew_$j;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/AccountBindPhoneNew_$j;-><init>(Lcom/join/mgps/activity/AccountBindPhoneNew_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew_;->E:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/AccountBindPhoneNew_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c00df

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/AccountBindPhoneNew_;->setContentView(I)V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 1

    const v0, 0x7f09033c

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->f:Landroid/widget/TextView;

    const v0, 0x7f091744

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->g:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f090750

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->h:Landroid/widget/TextView;

    const v0, 0x7f090ffc

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->i:Landroid/widget/TextView;

    const v0, 0x7f090ffb

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->j:Landroid/widget/EditText;

    const v0, 0x7f090fcf

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->k:Landroid/widget/EditText;

    const v0, 0x7f09033a

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->l:Landroid/widget/EditText;

    const v0, 0x7f090ef4

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->m:Landroid/widget/EditText;

    const v0, 0x7f091263

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->n:Landroid/widget/LinearLayout;

    const v0, 0x7f0904c2

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->o:Landroid/widget/LinearLayout;

    const v0, 0x7f0902cd

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->p:Landroid/widget/LinearLayout;

    const v0, 0x7f090ef2

    .line 12
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->q:Landroid/widget/TextView;

    const v0, 0x7f090ef3

    .line 13
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->r:Landroid/widget/TextView;

    const v0, 0x7f090ef5

    .line 14
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->s:Landroid/widget/TextView;

    .line 15
    iget-object p1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->q:Landroid/widget/TextView;

    if-eqz p1, :cond_0

    .line 16
    new-instance v0, Lcom/join/mgps/activity/AccountBindPhoneNew_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/AccountBindPhoneNew_$k;-><init>(Lcom/join/mgps/activity/AccountBindPhoneNew_;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->f:Landroid/widget/TextView;

    if-eqz p1, :cond_1

    .line 18
    new-instance v0, Lcom/join/mgps/activity/AccountBindPhoneNew_$l;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/AccountBindPhoneNew_$l;-><init>(Lcom/join/mgps/activity/AccountBindPhoneNew_;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->r:Landroid/widget/TextView;

    if-eqz p1, :cond_2

    .line 20
    new-instance v0, Lcom/join/mgps/activity/AccountBindPhoneNew_$m;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/AccountBindPhoneNew_$m;-><init>(Lcom/join/mgps/activity/AccountBindPhoneNew_;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 21
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->g:Lcom/facebook/drawee/view/SimpleDraweeView;

    if-eqz p1, :cond_3

    .line 22
    new-instance v0, Lcom/join/mgps/activity/AccountBindPhoneNew_$n;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/AccountBindPhoneNew_$n;-><init>(Lcom/join/mgps/activity/AccountBindPhoneNew_;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 23
    :cond_3
    iget-object p1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew;->s:Landroid/widget/TextView;

    if-eqz p1, :cond_4

    .line 24
    new-instance v0, Lcom/join/mgps/activity/AccountBindPhoneNew_$o;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/AccountBindPhoneNew_$o;-><init>(Lcom/join/mgps/activity/AccountBindPhoneNew_;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 25
    :cond_4
    invoke-virtual {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew;->afterview()V

    return-void
.end method

.method phoneRegin()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/AccountBindPhoneNew_$g;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/AccountBindPhoneNew_$g;-><init>(Lcom/join/mgps/activity/AccountBindPhoneNew_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/AccountBindPhoneNew_;->F:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method q0(Lcom/join/mgps/dto/AccountAnonymousReginRequest;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/AccountBindPhoneNew_$d;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/AccountBindPhoneNew_$d;-><init>(Lcom/join/mgps/activity/AccountBindPhoneNew_;Ljava/lang/String;JLjava/lang/String;Lcom/join/mgps/dto/AccountAnonymousReginRequest;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method r0(Lcom/join/mgps/dto/AccountAnonymousReginRequest;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/AccountBindPhoneNew_$f;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/AccountBindPhoneNew_$f;-><init>(Lcom/join/mgps/activity/AccountBindPhoneNew_;Ljava/lang/String;JLjava/lang/String;Lcom/join/mgps/dto/AccountAnonymousReginRequest;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method s0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/AccountBindPhoneNew_$b;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/AccountBindPhoneNew_$b;-><init>(Lcom/join/mgps/activity/AccountBindPhoneNew_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/BaseAccountActivity;->setContentView(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew_;->E:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/BaseActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew_;->E:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/activity/ComponentActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/AccountBindPhoneNew_;->E:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/AccountBindPhoneNew_;->injectExtras_()V

    return-void
.end method

.method showFinishPage(Lcom/wufan/user/service/protobuf/n0;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/AccountBindPhoneNew_$r;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/AccountBindPhoneNew_$r;-><init>(Lcom/join/mgps/activity/AccountBindPhoneNew_;Lcom/wufan/user/service/protobuf/n0;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method t0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/AccountBindPhoneNew_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/AccountBindPhoneNew_$a;-><init>(Lcom/join/mgps/activity/AccountBindPhoneNew_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method thirdRegin()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/AccountBindPhoneNew_$h;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/AccountBindPhoneNew_$h;-><init>(Lcom/join/mgps/activity/AccountBindPhoneNew_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method u0(Lcom/join/mgps/dto/AccountAnonymousReginRequest;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/AccountBindPhoneNew_$s;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/AccountBindPhoneNew_$s;-><init>(Lcom/join/mgps/activity/AccountBindPhoneNew_;Lcom/join/mgps/dto/AccountAnonymousReginRequest;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
