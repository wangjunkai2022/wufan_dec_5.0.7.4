.class public final Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity_;
.super Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;
.source "HideAppCalculatorActivity_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity_$e;
    }
.end annotation


# static fields
.field public static final p:Ljava/lang/String; = "isFromBackground"


# instance fields
.field private final n:La4/c;

.field private final o:Ljava/util/Map;
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
    invoke-direct {p0}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity_;->n:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity_;->o:Ljava/util/Map;

    return-void
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    new-instance p1, Lcom/join/mgps/pref/PrefDef_;

    invoke-direct {p1, p0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->f:Lcom/join/mgps/pref/PrefDef_;

    .line 2
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 3
    invoke-direct {p0}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity_;->injectExtras_()V

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

    const-string v1, "isFromBackground"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->g:Z

    :cond_0
    return-void
.end method

.method static synthetic q0(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->n0()V

    return-void
.end method

.method static synthetic r0(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity_;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->p0(Ljava/lang/String;Z)V

    return-void
.end method

.method static synthetic s0(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->showMessage(Ljava/lang/String;)V

    return-void
.end method

.method public static t0(Landroid/content/Context;)Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity_$e;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity_$e;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static u0(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity_$e;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity_$e;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method


# virtual methods
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
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity_;->o:Ljava/util/Map;

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
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method n0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity_$b;-><init>(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity_;->n:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c0061

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity_;->setContentView(I)V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 1

    const v0, 0x7f09132b

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->b:Landroid/view/View;

    const v0, 0x7f0914fb

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->c:Landroid/widget/TextView;

    const v0, 0x7f0911c1

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->d:Landroidx/recyclerview/widget/RecyclerView;

    const v0, 0x7f09074c

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->e:Landroid/widget/LinearLayout;

    const v0, 0x7f090146

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 6
    new-instance v0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity_$a;-><init>(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 7
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->afterviews()V

    return-void
.end method

.method p0(Ljava/lang/String;Z)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity_$c;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity_$c;-><init>(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity_;Ljava/lang/String;Z)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity_;->o:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity_;->n:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity_;->n:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity_;->n:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity_;->injectExtras_()V

    return-void
.end method

.method showMessage(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity_$d;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity_$d;-><init>(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
