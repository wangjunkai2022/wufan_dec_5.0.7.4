.class public final Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_;
.super Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish;
.source "MyAccountMMSCodeGetpassbackFinish_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_$j;
    }
.end annotation


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
    invoke-direct {p0}, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_;->r:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_;->s:Ljava/util/Map;

    return-void
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    return-void
.end method

.method static synthetic q0(Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish;->showLoding()V

    return-void
.end method

.method static synthetic r0(Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish;->showLodingDismis()V

    return-void
.end method

.method static synthetic s0(Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish;->o0()V

    return-void
.end method

.method static synthetic t0(Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish;->j0()V

    return-void
.end method

.method static synthetic u0(Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish;->error(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic v0(Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish;->k0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic w0(Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish;->m0()V

    return-void
.end method

.method public static x0(Landroid/content/Context;)Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_$j;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_$j;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static y0(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_$j;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_$j;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method


# virtual methods
.method error(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_$g;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_$g;-><init>(Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_;Ljava/lang/String;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_;->s:Ljava/util/Map;

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

.method j0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_$f;-><init>(Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method k0(Ljava/lang/String;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_$h;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_$h;-><init>(Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method m0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_$i;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_$i;-><init>(Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method o0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_$e;-><init>(Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_;->r:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c0674

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_;->setContentView(I)V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 1

    const v0, 0x7f090e2f

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish;->g:Landroid/widget/EditText;

    const v0, 0x7f090ffb

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish;->h:Landroid/widget/TextView;

    const v0, 0x7f09111c

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish;->j:Landroid/widget/TextView;

    const v0, 0x7f091255

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish;->k:Landroid/widget/Button;

    if-eqz p1, :cond_0

    .line 5
    new-instance v0, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_$a;-><init>(Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish;->j:Landroid/widget/TextView;

    if-eqz p1, :cond_1

    .line 7
    new-instance v0, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_$b;-><init>(Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish;->afterview()V

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
    iget-object v0, p0, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_;->s:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/BaseAccountActivity;->setContentView(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_;->r:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/BaseActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_;->r:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/activity/ComponentActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_;->r:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method showLoding()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_$c;-><init>(Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLodingDismis()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_$d;-><init>(Lcom/join/mgps/activity/MyAccountMMSCodeGetpassbackFinish_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
