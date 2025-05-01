.class public final Lcom/join/mgps/activity/DiscoveryPaiweiActivity_;
.super Lcom/join/mgps/activity/DiscoveryPaiweiActivity;
.source "DiscoveryPaiweiActivity_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/DiscoveryPaiweiActivity_$j;
    }
.end annotation


# static fields
.field public static final u:Ljava/lang/String; = "gameId"


# instance fields
.field private final s:La4/c;

.field private final t:Ljava/util/Map;
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
    invoke-direct {p0}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity_;->s:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity_;->t:Ljava/util/Map;

    return-void
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity_;->injectExtras_()V

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

    const-string v1, "gameId"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->h:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method static synthetic p0(Lcom/join/mgps/activity/DiscoveryPaiweiActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->o0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic q0(Lcom/join/mgps/activity/DiscoveryPaiweiActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->showLoding()V

    return-void
.end method

.method static synthetic r0(Lcom/join/mgps/activity/DiscoveryPaiweiActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->showLodingFailed()V

    return-void
.end method

.method static synthetic s0(Lcom/join/mgps/activity/DiscoveryPaiweiActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->n0()V

    return-void
.end method

.method static synthetic t0(Lcom/join/mgps/activity/DiscoveryPaiweiActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->showMessage(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic u0(Lcom/join/mgps/activity/DiscoveryPaiweiActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->l0()V

    return-void
.end method

.method public static v0(Landroid/content/Context;)Lcom/join/mgps/activity/DiscoveryPaiweiActivity_$j;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity_$j;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static w0(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/DiscoveryPaiweiActivity_$j;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity_$j;-><init>(Landroidx/fragment/app/Fragment;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity_;->t:Ljava/util/Map;

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

.method l0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/DiscoveryPaiweiActivity_$i;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity_$i;-><init>(Lcom/join/mgps/activity/DiscoveryPaiweiActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method n0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity_$g;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity_$g;-><init>(Lcom/join/mgps/activity/DiscoveryPaiweiActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method o0(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity_$d;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity_$d;-><init>(Lcom/join/mgps/activity/DiscoveryPaiweiActivity_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity_;->s:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c003b

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity_;->setContentView(I)V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 3

    const v0, 0x7f09132b

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->b:Landroid/view/View;

    const v0, 0x7f0917fd

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/viewpager2/widget/ViewPager2;

    iput-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->c:Landroidx/viewpager2/widget/ViewPager2;

    const v0, 0x7f0911bb

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->d:Landroidx/recyclerview/widget/RecyclerView;

    const v0, 0x7f090dbd

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/Group;

    iput-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->e:Landroidx/constraintlayout/widget/Group;

    const v0, 0x7f090d82

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->f:Landroid/widget/LinearLayout;

    const v0, 0x7f090d7f

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->g:Landroid/widget/LinearLayout;

    const v0, 0x7f090146

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f091261

    .line 8
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f09110c

    .line 9
    invoke-interface {p1, v2}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz v0, :cond_0

    .line 10
    new-instance v2, Lcom/join/mgps/activity/DiscoveryPaiweiActivity_$a;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity_$a;-><init>(Lcom/join/mgps/activity/DiscoveryPaiweiActivity_;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz v1, :cond_1

    .line 11
    new-instance v0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity_$b;-><init>(Lcom/join/mgps/activity/DiscoveryPaiweiActivity_;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    if-eqz p1, :cond_2

    .line 12
    new-instance v0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity_$c;-><init>(Lcom/join/mgps/activity/DiscoveryPaiweiActivity_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 13
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->afterviews()V

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
    iget-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity_;->t:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity_;->s:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity_;->s:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity_;->s:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity_;->injectExtras_()V

    return-void
.end method

.method showLoding()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity_$e;-><init>(Lcom/join/mgps/activity/DiscoveryPaiweiActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLodingFailed()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity_$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity_$f;-><init>(Lcom/join/mgps/activity/DiscoveryPaiweiActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showMessage(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity_$h;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity_$h;-><init>(Lcom/join/mgps/activity/DiscoveryPaiweiActivity_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
