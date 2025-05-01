.class public final Lcom/join/mgps/activity/CollectionModuleSevenActivity_;
.super Lcom/join/mgps/activity/CollectionModuleSevenActivity;
.source "CollectionModuleSevenActivity_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/CollectionModuleSevenActivity_$k;
    }
.end annotation


# static fields
.field public static final u:Ljava/lang/String; = "templateId"


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
    invoke-direct {p0}, Lcom/join/mgps/activity/CollectionModuleSevenActivity;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenActivity_;->s:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenActivity_;->t:Ljava/util/Map;

    return-void
.end method

.method public static A0(Landroid/content/Context;)Lcom/join/mgps/activity/CollectionModuleSevenActivity_$k;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CollectionModuleSevenActivity_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CollectionModuleSevenActivity_$k;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static B0(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/CollectionModuleSevenActivity_$k;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CollectionModuleSevenActivity_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CollectionModuleSevenActivity_$k;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/CollectionModuleSevenActivity_;->injectExtras_()V

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

    const-string v1, "templateId"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenActivity;->i:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method static synthetic t0(Lcom/join/mgps/activity/CollectionModuleSevenActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/CollectionModuleSevenActivity;->showMessage(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic u0(Lcom/join/mgps/activity/CollectionModuleSevenActivity_;Lcom/join/mgps/dto/CollectionModuleSevenBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/CollectionModuleSevenActivity;->r0(Lcom/join/mgps/dto/CollectionModuleSevenBean;)V

    return-void
.end method

.method static synthetic v0(Lcom/join/mgps/activity/CollectionModuleSevenActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/CollectionModuleSevenActivity;->autoPlay()V

    return-void
.end method

.method static synthetic w0(Lcom/join/mgps/activity/CollectionModuleSevenActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/CollectionModuleSevenActivity;->showLoding()V

    return-void
.end method

.method static synthetic x0(Lcom/join/mgps/activity/CollectionModuleSevenActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/CollectionModuleSevenActivity;->showLodingFailed()V

    return-void
.end method

.method static synthetic y0(Lcom/join/mgps/activity/CollectionModuleSevenActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/CollectionModuleSevenActivity;->p0()V

    return-void
.end method

.method static synthetic z0(Lcom/join/mgps/activity/CollectionModuleSevenActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/CollectionModuleSevenActivity;->getData()V

    return-void
.end method


# virtual methods
.method autoPlay()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CollectionModuleSevenActivity_$g;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CollectionModuleSevenActivity_$g;-><init>(Lcom/join/mgps/activity/CollectionModuleSevenActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x1f4

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
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenActivity_;->t:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method getData()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/CollectionModuleSevenActivity_$a;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/CollectionModuleSevenActivity_$a;-><init>(Lcom/join/mgps/activity/CollectionModuleSevenActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

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
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenActivity_;->s:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/CollectionModuleSevenActivity_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c002b

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/CollectionModuleSevenActivity_;->setContentView(I)V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 2

    const v0, 0x7f0901f7

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenActivity;->c:Landroidx/recyclerview/widget/RecyclerView;

    const v0, 0x7f091489

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenActivity;->d:Landroid/widget/TextView;

    const v0, 0x7f090d82

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenActivity;->e:Landroid/widget/LinearLayout;

    const v0, 0x7f090d7f

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenActivity;->f:Landroid/widget/LinearLayout;

    const v0, 0x7f09110c

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenActivity;->g:Landroid/widget/ImageView;

    const v0, 0x7f090146

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenActivity;->h:Landroid/widget/ImageView;

    const v0, 0x7f091261

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenActivity;->h:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 9
    new-instance v1, Lcom/join/mgps/activity/CollectionModuleSevenActivity_$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/CollectionModuleSevenActivity_$b;-><init>(Lcom/join/mgps/activity/CollectionModuleSevenActivity_;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenActivity;->g:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    .line 11
    new-instance v1, Lcom/join/mgps/activity/CollectionModuleSevenActivity_$c;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/CollectionModuleSevenActivity_$c;-><init>(Lcom/join/mgps/activity/CollectionModuleSevenActivity_;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    if-eqz p1, :cond_2

    .line 12
    new-instance v0, Lcom/join/mgps/activity/CollectionModuleSevenActivity_$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CollectionModuleSevenActivity_$d;-><init>(Lcom/join/mgps/activity/CollectionModuleSevenActivity_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 13
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/activity/CollectionModuleSevenActivity;->afterviews()V

    return-void
.end method

.method p0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CollectionModuleSevenActivity_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CollectionModuleSevenActivity_$j;-><init>(Lcom/join/mgps/activity/CollectionModuleSevenActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleSevenActivity_;->t:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method r0(Lcom/join/mgps/dto/CollectionModuleSevenBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CollectionModuleSevenActivity_$f;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/CollectionModuleSevenActivity_$f;-><init>(Lcom/join/mgps/activity/CollectionModuleSevenActivity_;Lcom/join/mgps/dto/CollectionModuleSevenBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/CollectionModuleSevenActivity_;->s:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/CollectionModuleSevenActivity_;->s:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/CollectionModuleSevenActivity_;->s:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/CollectionModuleSevenActivity_;->injectExtras_()V

    return-void
.end method

.method showLoding()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CollectionModuleSevenActivity_$h;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CollectionModuleSevenActivity_$h;-><init>(Lcom/join/mgps/activity/CollectionModuleSevenActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLodingFailed()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CollectionModuleSevenActivity_$i;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CollectionModuleSevenActivity_$i;-><init>(Lcom/join/mgps/activity/CollectionModuleSevenActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showMessage(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CollectionModuleSevenActivity_$e;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/CollectionModuleSevenActivity_$e;-><init>(Lcom/join/mgps/activity/CollectionModuleSevenActivity_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
