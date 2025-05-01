.class public final Lcom/join/mgps/activity/EndGameDetailActivity_;
.super Lcom/join/mgps/activity/EndGameDetailActivity;
.source "EndGameDetailActivity_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/EndGameDetailActivity_$o;
    }
.end annotation


# static fields
.field public static final O:Ljava/lang/String; = "gameId"

.field public static final P:Ljava/lang/String; = "endGameId"

.field public static final Q:Ljava/lang/String; = "rules"

.field public static final R:Ljava/lang/String; = "isFromVideo"


# instance fields
.field private final M:La4/c;

.field private final N:Ljava/util/Map;
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
    invoke-direct {p0}, Lcom/join/mgps/activity/EndGameDetailActivity;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity_;->M:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity_;->N:Ljava/util/Map;

    return-void
.end method

.method static synthetic A0(Lcom/join/mgps/activity/EndGameDetailActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/EndGameDetailActivity;->getEndGameConfig()V

    return-void
.end method

.method static synthetic B0(Lcom/join/mgps/activity/EndGameDetailActivity_;Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/EndGameDetailActivity;->getData(Z)V

    return-void
.end method

.method public static C0(Landroid/content/Context;)Lcom/join/mgps/activity/EndGameDetailActivity_$o;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/EndGameDetailActivity_$o;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/EndGameDetailActivity_$o;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static D0(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/EndGameDetailActivity_$o;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/EndGameDetailActivity_$o;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/EndGameDetailActivity_$o;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    new-instance p1, Lcom/join/mgps/pref/PrefDef_;

    invoke-direct {p1, p0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->E:Lcom/join/mgps/pref/PrefDef_;

    .line 2
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 3
    invoke-direct {p0}, Lcom/join/mgps/activity/EndGameDetailActivity_;->injectExtras_()V

    return-void
.end method

.method private injectExtras_()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_3

    const-string v1, "gameId"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->A:Ljava/lang/String;

    :cond_0
    const-string v1, "endGameId"

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->B:Ljava/lang/String;

    :cond_1
    const-string v1, "rules"

    .line 6
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 7
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->C:Ljava/lang/String;

    :cond_2
    const-string v1, "isFromVideo"

    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 9
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->D:Z

    :cond_3
    return-void
.end method

.method static synthetic v0(Lcom/join/mgps/activity/EndGameDetailActivity_;Lcom/join/mgps/dto/EndGameDetailBean;Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/EndGameDetailActivity;->u0(Lcom/join/mgps/dto/EndGameDetailBean;Z)V

    return-void
.end method

.method static synthetic w0(Lcom/join/mgps/activity/EndGameDetailActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/EndGameDetailActivity;->showLoding()V

    return-void
.end method

.method static synthetic x0(Lcom/join/mgps/activity/EndGameDetailActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/EndGameDetailActivity;->showLodingFailed()V

    return-void
.end method

.method static synthetic y0(Lcom/join/mgps/activity/EndGameDetailActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/EndGameDetailActivity;->t0()V

    return-void
.end method

.method static synthetic z0(Lcom/join/mgps/activity/EndGameDetailActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/EndGameDetailActivity;->showTost(Ljava/lang/String;)V

    return-void
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
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity_;->N:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method getData(Z)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/EndGameDetailActivity_$e;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/EndGameDetailActivity_$e;-><init>(Lcom/join/mgps/activity/EndGameDetailActivity_;Ljava/lang/String;JLjava/lang/String;Z)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method getEndGameConfig()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/EndGameDetailActivity_$d;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/EndGameDetailActivity_$d;-><init>(Lcom/join/mgps/activity/EndGameDetailActivity_;Ljava/lang/String;JLjava/lang/String;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity_;->M:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/EndGameDetailActivity_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c003f

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/EndGameDetailActivity_;->setContentView(I)V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 5

    const v0, 0x7f0900ff

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/appbar/AppBarLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->b:Lcom/google/android/material/appbar/AppBarLayout;

    const v0, 0x7f090342

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->c:Lcom/google/android/material/appbar/CollapsingToolbarLayout;

    const v0, 0x7f090f3b

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->d:Landroid/view/View;

    const v0, 0x7f090915

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->e:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f091799

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/component/video/StandardVideoView;

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->f:Lcom/join/android/app/component/video/StandardVideoView;

    const v0, 0x7f091573

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->g:Landroid/widget/TextView;

    const v0, 0x7f09152d

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->h:Landroid/widget/TextView;

    const v0, 0x7f0908d4

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->i:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f0914f5

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->j:Landroid/widget/TextView;

    const v0, 0x7f091543

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->k:Landroid/widget/TextView;

    const v0, 0x7f0914f8

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->l:Landroid/widget/TextView;

    const v0, 0x7f09135d

    .line 12
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/flyco/tablayout/SlidingTabLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->m:Lcom/flyco/tablayout/SlidingTabLayout;

    const v0, 0x7f0917c8

    .line 13
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/viewpager/widget/ViewPager;

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->n:Landroidx/viewpager/widget/ViewPager;

    const v0, 0x7f090cc9

    .line 14
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->o:Landroid/widget/LinearLayout;

    const v0, 0x7f090220

    .line 15
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->p:Landroid/widget/TextView;

    const v0, 0x7f0908d6

    .line 16
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->q:Landroid/widget/ImageView;

    const v0, 0x7f0908ee

    .line 17
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->r:Landroid/widget/ImageView;

    const v0, 0x7f09157d

    .line 18
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->s:Landroid/widget/TextView;

    const v0, 0x7f090ccc

    .line 19
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->t:Landroid/widget/LinearLayout;

    const v0, 0x7f0902ff

    .line 20
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->u:Landroidx/constraintlayout/widget/ConstraintLayout;

    const v0, 0x7f090d82

    .line 21
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->v:Landroid/widget/LinearLayout;

    const v0, 0x7f090d7f

    .line 22
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->w:Landroid/widget/LinearLayout;

    const v0, 0x7f0903b0

    .line 23
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->x:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    const v0, 0x7f09136e

    .line 24
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->y:Landroid/widget/ImageView;

    const v0, 0x7f0908e4

    .line 25
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->z:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f0902fe

    .line 26
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f090308

    .line 27
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f091261

    .line 28
    invoke-interface {p1, v2}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v2

    const v3, 0x7f09110c

    .line 29
    invoke-interface {p1, v3}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    .line 30
    iget-object v3, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->q:Landroid/widget/ImageView;

    if-eqz v3, :cond_0

    .line 31
    new-instance v4, Lcom/join/mgps/activity/EndGameDetailActivity_$f;

    invoke-direct {v4, p0}, Lcom/join/mgps/activity/EndGameDetailActivity_$f;-><init>(Lcom/join/mgps/activity/EndGameDetailActivity_;)V

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 32
    :cond_0
    iget-object v3, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->r:Landroid/widget/ImageView;

    if-eqz v3, :cond_1

    .line 33
    new-instance v4, Lcom/join/mgps/activity/EndGameDetailActivity_$g;

    invoke-direct {v4, p0}, Lcom/join/mgps/activity/EndGameDetailActivity_$g;-><init>(Lcom/join/mgps/activity/EndGameDetailActivity_;)V

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    if-eqz v0, :cond_2

    .line 34
    new-instance v3, Lcom/join/mgps/activity/EndGameDetailActivity_$h;

    invoke-direct {v3, p0}, Lcom/join/mgps/activity/EndGameDetailActivity_$h;-><init>(Lcom/join/mgps/activity/EndGameDetailActivity_;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    if-eqz v1, :cond_3

    .line 35
    new-instance v0, Lcom/join/mgps/activity/EndGameDetailActivity_$i;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/EndGameDetailActivity_$i;-><init>(Lcom/join/mgps/activity/EndGameDetailActivity_;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    if-eqz v2, :cond_4

    .line 36
    new-instance v0, Lcom/join/mgps/activity/EndGameDetailActivity_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/EndGameDetailActivity_$j;-><init>(Lcom/join/mgps/activity/EndGameDetailActivity_;)V

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_4
    if-eqz p1, :cond_5

    .line 37
    new-instance v0, Lcom/join/mgps/activity/EndGameDetailActivity_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/EndGameDetailActivity_$k;-><init>(Lcom/join/mgps/activity/EndGameDetailActivity_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 38
    :cond_5
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->p:Landroid/widget/TextView;

    if-eqz p1, :cond_6

    .line 39
    new-instance v0, Lcom/join/mgps/activity/EndGameDetailActivity_$l;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/EndGameDetailActivity_$l;-><init>(Lcom/join/mgps/activity/EndGameDetailActivity_;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 40
    :cond_6
    invoke-virtual {p0}, Lcom/join/mgps/activity/EndGameDetailActivity;->afterviews()V

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
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity_;->N:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameDetailActivity_;->M:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameDetailActivity_;->M:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameDetailActivity_;->M:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/EndGameDetailActivity_;->injectExtras_()V

    return-void
.end method

.method showLoding()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/EndGameDetailActivity_$n;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/EndGameDetailActivity_$n;-><init>(Lcom/join/mgps/activity/EndGameDetailActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLodingFailed()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/EndGameDetailActivity_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/EndGameDetailActivity_$a;-><init>(Lcom/join/mgps/activity/EndGameDetailActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showTost(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/EndGameDetailActivity_$c;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/EndGameDetailActivity_$c;-><init>(Lcom/join/mgps/activity/EndGameDetailActivity_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method t0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/EndGameDetailActivity_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/EndGameDetailActivity_$b;-><init>(Lcom/join/mgps/activity/EndGameDetailActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method u0(Lcom/join/mgps/dto/EndGameDetailBean;Z)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/EndGameDetailActivity_$m;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/activity/EndGameDetailActivity_$m;-><init>(Lcom/join/mgps/activity/EndGameDetailActivity_;Lcom/join/mgps/dto/EndGameDetailBean;Z)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
