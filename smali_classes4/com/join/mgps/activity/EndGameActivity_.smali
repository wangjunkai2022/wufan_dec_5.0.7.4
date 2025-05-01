.class public final Lcom/join/mgps/activity/EndGameActivity_;
.super Lcom/join/mgps/activity/EndGameActivity;
.source "EndGameActivity_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/EndGameActivity_$t;
    }
.end annotation


# static fields
.field public static final G:Ljava/lang/String; = "gameId"

.field public static final H:Ljava/lang/String; = "ext"


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
    invoke-direct {p0}, Lcom/join/mgps/activity/EndGameActivity;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameActivity_;->E:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameActivity_;->F:Ljava/util/Map;

    return-void
.end method

.method static synthetic H0(Lcom/join/mgps/activity/EndGameActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/EndGameActivity;->C0()V

    return-void
.end method

.method static synthetic I0(Lcom/join/mgps/activity/EndGameActivity_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/EndGameActivity;->w0(I)V

    return-void
.end method

.method static synthetic J0(Lcom/join/mgps/activity/EndGameActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/EndGameActivity;->A0()V

    return-void
.end method

.method static synthetic K0(Lcom/join/mgps/activity/EndGameActivity_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/EndGameActivity;->x0(I)V

    return-void
.end method

.method static synthetic L0(Lcom/join/mgps/activity/EndGameActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/EndGameActivity;->u0()V

    return-void
.end method

.method static synthetic M0(Lcom/join/mgps/activity/EndGameActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/EndGameActivity;->B0()V

    return-void
.end method

.method static synthetic N0(Lcom/join/mgps/activity/EndGameActivity_;Ljava/util/List;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/EndGameActivity;->G0(Ljava/util/List;I)V

    return-void
.end method

.method static synthetic O0(Lcom/join/mgps/activity/EndGameActivity_;Lcom/join/mgps/dto/EndGameListBean;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/EndGameActivity;->F0(Lcom/join/mgps/dto/EndGameListBean;I)V

    return-void
.end method

.method static synthetic P0(Lcom/join/mgps/activity/EndGameActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/EndGameActivity;->showLoding()V

    return-void
.end method

.method static synthetic Q0(Lcom/join/mgps/activity/EndGameActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/EndGameActivity;->showLodingFailed()V

    return-void
.end method

.method static synthetic R0(Lcom/join/mgps/activity/EndGameActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/EndGameActivity;->E0()V

    return-void
.end method

.method static synthetic S0(Lcom/join/mgps/activity/EndGameActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/EndGameActivity;->showTost(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic T0(Lcom/join/mgps/activity/EndGameActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/EndGameActivity;->getEndGameConfig()V

    return-void
.end method

.method public static U0(Landroid/content/Context;)Lcom/join/mgps/activity/EndGameActivity_$t;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/EndGameActivity_$t;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/EndGameActivity_$t;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static V0(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/EndGameActivity_$t;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/EndGameActivity_$t;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/EndGameActivity_$t;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    new-instance p1, Lcom/join/mgps/pref/PrefDef_;

    invoke-direct {p1, p0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/join/mgps/activity/EndGameActivity;->o:Lcom/join/mgps/pref/PrefDef_;

    .line 2
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 3
    invoke-direct {p0}, Lcom/join/mgps/activity/EndGameActivity_;->injectExtras_()V

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

    const-string v1, "gameId"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/EndGameActivity;->m:Ljava/lang/String;

    :cond_0
    const-string v1, "ext"

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->n:Ljava/lang/String;

    :cond_1
    return-void
.end method


# virtual methods
.method A0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/EndGameActivity_$r;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/EndGameActivity_$r;-><init>(Lcom/join/mgps/activity/EndGameActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method B0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/EndGameActivity_$s;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/EndGameActivity_$s;-><init>(Lcom/join/mgps/activity/EndGameActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method C0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/EndGameActivity_$q;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/EndGameActivity_$q;-><init>(Lcom/join/mgps/activity/EndGameActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method E0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/EndGameActivity_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/EndGameActivity_$e;-><init>(Lcom/join/mgps/activity/EndGameActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method F0(Lcom/join/mgps/dto/EndGameListBean;I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/EndGameActivity_$b;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/activity/EndGameActivity_$b;-><init>(Lcom/join/mgps/activity/EndGameActivity_;Lcom/join/mgps/dto/EndGameListBean;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method G0(Ljava/util/List;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/EndGameNameListBean;",
            ">;I)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/activity/EndGameActivity_$a;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/activity/EndGameActivity_$a;-><init>(Lcom/join/mgps/activity/EndGameActivity_;Ljava/util/List;I)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity_;->F:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method getEndGameConfig()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/EndGameActivity_$g;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/EndGameActivity_$g;-><init>(Lcom/join/mgps/activity/EndGameActivity_;Ljava/lang/String;JLjava/lang/String;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity_;->E:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/EndGameActivity_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c003e

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/EndGameActivity_;->setContentView(I)V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 3

    const v0, 0x7f0903c6

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->b:Landroid/widget/TextView;

    const v0, 0x7f09132b

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->c:Landroid/view/View;

    const v0, 0x7f0917c8

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/viewpager2/widget/ViewPager2;

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->d:Landroidx/viewpager2/widget/ViewPager2;

    const v0, 0x7f091270    # 1.8219997E38f

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->e:Landroid/view/View;

    const v0, 0x7f090303

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->f:Landroidx/constraintlayout/widget/ConstraintLayout;

    const v0, 0x7f0911bd

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->g:Landroidx/recyclerview/widget/RecyclerView;

    const v0, 0x7f0908e2

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->h:Landroid/widget/ImageView;

    const v0, 0x7f0911be

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->i:Landroidx/recyclerview/widget/RecyclerView;

    const v0, 0x7f0917fc

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/viewpager2/widget/ViewPager2;

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->j:Landroidx/viewpager2/widget/ViewPager2;

    const v0, 0x7f090d82

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->k:Landroid/widget/LinearLayout;

    const v0, 0x7f090d7f

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->l:Landroid/widget/LinearLayout;

    const v0, 0x7f090146

    .line 12
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f09110c

    .line 13
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f091261

    .line 14
    invoke-interface {p1, v2}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz v0, :cond_0

    .line 15
    new-instance v2, Lcom/join/mgps/activity/EndGameActivity_$k;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/EndGameActivity_$k;-><init>(Lcom/join/mgps/activity/EndGameActivity_;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->h:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    .line 17
    new-instance v2, Lcom/join/mgps/activity/EndGameActivity_$l;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/EndGameActivity_$l;-><init>(Lcom/join/mgps/activity/EndGameActivity_;)V

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 18
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->e:Landroid/view/View;

    if-eqz v0, :cond_2

    .line 19
    new-instance v2, Lcom/join/mgps/activity/EndGameActivity_$m;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/EndGameActivity_$m;-><init>(Lcom/join/mgps/activity/EndGameActivity_;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    if-eqz v1, :cond_3

    .line 20
    new-instance v0, Lcom/join/mgps/activity/EndGameActivity_$n;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/EndGameActivity_$n;-><init>(Lcom/join/mgps/activity/EndGameActivity_;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    if-eqz p1, :cond_4

    .line 21
    new-instance v0, Lcom/join/mgps/activity/EndGameActivity_$o;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/EndGameActivity_$o;-><init>(Lcom/join/mgps/activity/EndGameActivity_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 22
    :cond_4
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameActivity;->b:Landroid/widget/TextView;

    if-eqz p1, :cond_5

    .line 23
    new-instance v0, Lcom/join/mgps/activity/EndGameActivity_$p;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/EndGameActivity_$p;-><init>(Lcom/join/mgps/activity/EndGameActivity_;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 24
    :cond_5
    invoke-virtual {p0}, Lcom/join/mgps/activity/EndGameActivity;->afterviews()V

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
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity_;->F:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameActivity_;->E:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameActivity_;->E:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameActivity_;->E:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/EndGameActivity_;->injectExtras_()V

    return-void
.end method

.method showLoding()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/EndGameActivity_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/EndGameActivity_$c;-><init>(Lcom/join/mgps/activity/EndGameActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLodingFailed()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/EndGameActivity_$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/EndGameActivity_$d;-><init>(Lcom/join/mgps/activity/EndGameActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showTost(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/EndGameActivity_$f;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/EndGameActivity_$f;-><init>(Lcom/join/mgps/activity/EndGameActivity_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method u0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/EndGameActivity_$j;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/EndGameActivity_$j;-><init>(Lcom/join/mgps/activity/EndGameActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method w0(I)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/EndGameActivity_$h;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/EndGameActivity_$h;-><init>(Lcom/join/mgps/activity/EndGameActivity_;Ljava/lang/String;JLjava/lang/String;I)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method x0(I)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/EndGameActivity_$i;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/EndGameActivity_$i;-><init>(Lcom/join/mgps/activity/EndGameActivity_;Ljava/lang/String;JLjava/lang/String;I)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method
