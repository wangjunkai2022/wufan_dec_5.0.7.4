.class public final Lcom/join/mgps/activity/MyAccountForgetPassActivity_;
.super Lcom/join/mgps/activity/MyAccountForgetPassActivity;
.source "MyAccountForgetPassActivity_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/MyAccountForgetPassActivity_$h;
    }
.end annotation


# instance fields
.field private final k:La4/c;

.field private final l:Ljava/util/Map;
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
    invoke-direct {p0}, Lcom/join/mgps/activity/MyAccountForgetPassActivity;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/MyAccountForgetPassActivity_;->k:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/MyAccountForgetPassActivity_;->l:Ljava/util/Map;

    return-void
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    return-void
.end method

.method static synthetic m0(Lcom/join/mgps/activity/MyAccountForgetPassActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyAccountForgetPassActivity;->showLoding()V

    return-void
.end method

.method static synthetic n0(Lcom/join/mgps/activity/MyAccountForgetPassActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyAccountForgetPassActivity;->showLodingDismis()V

    return-void
.end method

.method static synthetic o0(Lcom/join/mgps/activity/MyAccountForgetPassActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MyAccountForgetPassActivity;->error(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic p0(Lcom/join/mgps/activity/MyAccountForgetPassActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyAccountForgetPassActivity;->k0()V

    return-void
.end method

.method static synthetic q0(Lcom/join/mgps/activity/MyAccountForgetPassActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyAccountForgetPassActivity;->l0()V

    return-void
.end method

.method public static r0(Landroid/content/Context;)Lcom/join/mgps/activity/MyAccountForgetPassActivity_$h;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyAccountForgetPassActivity_$h;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyAccountForgetPassActivity_$h;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static s0(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/MyAccountForgetPassActivity_$h;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyAccountForgetPassActivity_$h;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyAccountForgetPassActivity_$h;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method


# virtual methods
.method error(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyAccountForgetPassActivity_$e;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MyAccountForgetPassActivity_$e;-><init>(Lcom/join/mgps/activity/MyAccountForgetPassActivity_;Ljava/lang/String;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/MyAccountForgetPassActivity_;->l:Ljava/util/Map;

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

.method k0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyAccountForgetPassActivity_$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyAccountForgetPassActivity_$f;-><init>(Lcom/join/mgps/activity/MyAccountForgetPassActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method l0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/MyAccountForgetPassActivity_$g;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/MyAccountForgetPassActivity_$g;-><init>(Lcom/join/mgps/activity/MyAccountForgetPassActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MyAccountForgetPassActivity_;->k:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/MyAccountForgetPassActivity_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c0670

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/MyAccountForgetPassActivity_;->setContentView(I)V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 2

    const v0, 0x7f090ffd

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/join/mgps/activity/MyAccountForgetPassActivity;->e:Landroid/widget/EditText;

    const v0, 0x7f0906c7

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/join/mgps/activity/MyAccountForgetPassActivity;->h:Landroid/widget/Button;

    const v0, 0x7f090139

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/MyAccountForgetPassActivity;->h:Landroid/widget/Button;

    if-eqz v0, :cond_0

    .line 5
    new-instance v1, Lcom/join/mgps/activity/MyAccountForgetPassActivity_$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/MyAccountForgetPassActivity_$a;-><init>(Lcom/join/mgps/activity/MyAccountForgetPassActivity_;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz p1, :cond_1

    .line 6
    new-instance v0, Lcom/join/mgps/activity/MyAccountForgetPassActivity_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyAccountForgetPassActivity_$b;-><init>(Lcom/join/mgps/activity/MyAccountForgetPassActivity_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 7
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/MyAccountForgetPassActivity;->afterview()V

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
    iget-object v0, p0, Lcom/join/mgps/activity/MyAccountForgetPassActivity_;->l:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/BaseAccountActivity;->setContentView(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/MyAccountForgetPassActivity_;->k:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/BaseActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/MyAccountForgetPassActivity_;->k:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/activity/ComponentActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/MyAccountForgetPassActivity_;->k:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method showLoding()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyAccountForgetPassActivity_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyAccountForgetPassActivity_$c;-><init>(Lcom/join/mgps/activity/MyAccountForgetPassActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLodingDismis()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyAccountForgetPassActivity_$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyAccountForgetPassActivity_$d;-><init>(Lcom/join/mgps/activity/MyAccountForgetPassActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
