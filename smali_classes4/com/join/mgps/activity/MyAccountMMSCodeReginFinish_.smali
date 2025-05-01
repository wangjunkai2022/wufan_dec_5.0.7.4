.class public final Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_;
.super Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish;
.source "MyAccountMMSCodeReginFinish_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_$m;
    }
.end annotation


# static fields
.field public static final t:Ljava/lang/String; = "accountReginBean"


# instance fields
.field private final r:La4/c;

.field private final s:Ljava/util/Map;
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
    invoke-direct {p0}, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_;->r:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_;->s:Ljava/util/Map;

    return-void
.end method

.method public static A0(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_$m;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_$m;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_$m;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_;->injectExtras_()V

    return-void
.end method

.method private injectExtras_()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "accountReginBean"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/AccountReginBean;

    iput-object v0, p0, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish;->n:Lcom/join/mgps/dto/AccountReginBean;

    :cond_0
    return-void
.end method

.method static synthetic q0(Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish;->showLoding()V

    return-void
.end method

.method static synthetic r0(Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish;->showLodingDismis()V

    return-void
.end method

.method static synthetic s0(Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish;->h0()V

    return-void
.end method

.method static synthetic t0(Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish;->error(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic u0(Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_;Lcom/join/mgps/dto/AccountBean;Lcom/join/mgps/dto/RewardBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish;->k0(Lcom/join/mgps/dto/AccountBean;Lcom/join/mgps/dto/RewardBean;)V

    return-void
.end method

.method static synthetic v0(Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish;->o0()V

    return-void
.end method

.method static synthetic w0(Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish;->m0()V

    return-void
.end method

.method static synthetic x0(Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_;Lcom/join/mgps/dto/AccountReginBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish;->i0(Lcom/join/mgps/dto/AccountReginBean;)V

    return-void
.end method

.method static synthetic y0(Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish;->j0(Ljava/lang/String;)V

    return-void
.end method

.method public static z0(Landroid/content/Context;)Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_$m;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_$m;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_$m;-><init>(Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method error(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_$j;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_$j;-><init>(Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_;Ljava/lang/String;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_;->s:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method h0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_$i;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_$i;-><init>(Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method i0(Lcom/join/mgps/dto/AccountReginBean;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_$b;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_$b;-><init>(Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_;Ljava/lang/String;JLjava/lang/String;Lcom/join/mgps/dto/AccountReginBean;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

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

.method j0(Ljava/lang/String;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_$c;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_$c;-><init>(Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method k0(Lcom/join/mgps/dto/AccountBean;Lcom/join/mgps/dto/RewardBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_$k;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_$k;-><init>(Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_;Lcom/join/mgps/dto/AccountBean;Lcom/join/mgps/dto/RewardBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method m0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_$a;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_$a;-><init>(Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method o0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_$l;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_$l;-><init>(Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_;->r:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c0674

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_;->setContentView(I)V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 1

    const v0, 0x7f090e2f

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish;->e:Landroid/widget/EditText;

    const v0, 0x7f09111c

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish;->f:Landroid/widget/TextView;

    const v0, 0x7f090ffb

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish;->g:Landroid/widget/TextView;

    const v0, 0x7f091479

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish;->h:Landroid/widget/TextView;

    const v0, 0x7f091255

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish;->j:Landroid/widget/Button;

    const v0, 0x7f090139

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 7
    new-instance v0, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_$d;-><init>(Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish;->j:Landroid/widget/Button;

    if-eqz p1, :cond_1

    .line 9
    new-instance v0, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_$e;-><init>(Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish;->f:Landroid/widget/TextView;

    if-eqz p1, :cond_2

    .line 11
    new-instance v0, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_$f;-><init>(Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish;->afterview()V

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
    iget-object v0, p0, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_;->s:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/BaseActivity;->setContentView(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_;->r:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/BaseActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_;->r:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/activity/ComponentActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_;->r:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_;->injectExtras_()V

    return-void
.end method

.method showLoding()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_$g;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_$g;-><init>(Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLodingDismis()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_$h;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_$h;-><init>(Lcom/join/mgps/activity/MyAccountMMSCodeReginFinish_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
