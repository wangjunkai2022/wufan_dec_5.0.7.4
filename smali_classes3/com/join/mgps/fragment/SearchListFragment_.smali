.class public final Lcom/join/mgps/fragment/SearchListFragment_;
.super Lcom/join/mgps/fragment/SearchListFragment;
.source "SearchListFragment_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/SearchListFragment_$p;
    }
.end annotation


# static fields
.field public static final C:Ljava/lang/String; = "currentTab"

.field public static final D:Ljava/lang/String; = "game_id"

.field public static final E:Ljava/lang/String; = "keyword"


# instance fields
.field private A:Landroid/view/View;

.field private final B:Ljava/util/Map;
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

.field private final z:La4/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/fragment/SearchListFragment;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/SearchListFragment_;->z:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/SearchListFragment_;->B:Ljava/util/Map;

    return-void
.end method

.method static synthetic A0(Lcom/join/mgps/fragment/SearchListFragment_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/SearchListFragment;->f0(I)V

    return-void
.end method

.method static synthetic B0(Lcom/join/mgps/fragment/SearchListFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/SearchListFragment;->m0()V

    return-void
.end method

.method static synthetic C0(Lcom/join/mgps/fragment/SearchListFragment_;Lcom/join/mgps/dto/SearchGameFavoriteListBean;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/fragment/SearchListFragment;->n0(Lcom/join/mgps/dto/SearchGameFavoriteListBean;I)V

    return-void
.end method

.method static synthetic D0(Lcom/join/mgps/fragment/SearchListFragment_;Lcom/join/mgps/dto/SearchPostsBean;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/fragment/SearchListFragment;->p0(Lcom/join/mgps/dto/SearchPostsBean;I)V

    return-void
.end method

.method static synthetic E0(Lcom/join/mgps/fragment/SearchListFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/SearchListFragment;->T(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic F0(Lcom/join/mgps/fragment/SearchListFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/SearchListFragment;->showLoadingView()V

    return-void
.end method

.method static synthetic G0(Lcom/join/mgps/fragment/SearchListFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/SearchListFragment;->showLoadFailed(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic H0(Lcom/join/mgps/fragment/SearchListFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/SearchListFragment;->hideLoading()V

    return-void
.end method

.method static synthetic I0(Lcom/join/mgps/fragment/SearchListFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/SearchListFragment;->g0()V

    return-void
.end method

.method static synthetic J0(Lcom/join/mgps/fragment/SearchListFragment_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/SearchListFragment;->d0(I)V

    return-void
.end method

.method public static K0()Lcom/join/mgps/fragment/SearchListFragment_$p;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/SearchListFragment_$p;

    invoke-direct {v0}, Lcom/join/mgps/fragment/SearchListFragment_$p;-><init>()V

    return-object v0
.end method

.method private L0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v1, "currentTab"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/join/mgps/fragment/SearchListFragment;->e:I

    :cond_0
    const-string v1, "game_id"

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/fragment/SearchListFragment;->f:Ljava/lang/String;

    :cond_1
    const-string v1, "keyword"

    .line 6
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 7
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/SearchListFragment;->g:Ljava/lang/String;

    :cond_2
    return-void
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/fragment/SearchListFragment_;->L0()V

    return-void
.end method

.method static synthetic x0(Lcom/join/mgps/fragment/SearchListFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/SearchListFragment;->s0()V

    return-void
.end method

.method static synthetic y0(Lcom/join/mgps/fragment/SearchListFragment_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/SearchListFragment;->e0(I)V

    return-void
.end method

.method static synthetic z0(Lcom/join/mgps/fragment/SearchListFragment_;Lcom/join/mgps/dto/SearchIntegratedBean;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/fragment/SearchListFragment;->o0(Lcom/join/mgps/dto/SearchIntegratedBean;I)V

    return-void
.end method


# virtual methods
.method T(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/SearchListFragment_$m;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/SearchListFragment_$m;-><init>(Lcom/join/mgps/fragment/SearchListFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method d0(I)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/fragment/SearchListFragment_$c;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/fragment/SearchListFragment_$c;-><init>(Lcom/join/mgps/fragment/SearchListFragment_;Ljava/lang/String;JLjava/lang/String;I)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method e0(I)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/fragment/SearchListFragment_$d;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/fragment/SearchListFragment_$d;-><init>(Lcom/join/mgps/fragment/SearchListFragment_;Ljava/lang/String;JLjava/lang/String;I)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method f0(I)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/fragment/SearchListFragment_$e;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/fragment/SearchListFragment_$e;-><init>(Lcom/join/mgps/fragment/SearchListFragment_;Ljava/lang/String;JLjava/lang/String;I)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method g0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/SearchListFragment_$b;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/SearchListFragment_$b;-><init>(Lcom/join/mgps/fragment/SearchListFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchListFragment_;->B:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method hideLoading()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/SearchListFragment_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/SearchListFragment_$a;-><init>(Lcom/join/mgps/fragment/SearchListFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public internalFindViewById(I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchListFragment_;->A:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method m0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/SearchListFragment_$f;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/SearchListFragment_$f;-><init>(Lcom/join/mgps/fragment/SearchListFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method n0(Lcom/join/mgps/dto/SearchGameFavoriteListBean;I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/SearchListFragment_$k;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/fragment/SearchListFragment_$k;-><init>(Lcom/join/mgps/fragment/SearchListFragment_;Lcom/join/mgps/dto/SearchGameFavoriteListBean;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method o0(Lcom/join/mgps/dto/SearchIntegratedBean;I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/SearchListFragment_$j;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/fragment/SearchListFragment_$j;-><init>(Lcom/join/mgps/fragment/SearchListFragment_;Lcom/join/mgps/dto/SearchIntegratedBean;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchListFragment_;->z:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/SearchListFragment_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p3

    iput-object p3, p0, Lcom/join/mgps/fragment/SearchListFragment_;->A:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c029a

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/SearchListFragment_;->A:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/SearchListFragment_;->A:Landroid/view/View;

    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/fragment/SearchListFragment_;->A:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/fragment/SearchListFragment;->b:Lcom/join/mgps/customview/XListView2;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/fragment/SearchListFragment;->p:Landroid/view/View;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/fragment/SearchListFragment;->q:Landroid/view/View;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/fragment/SearchListFragment;->r:Landroid/view/View;

    .line 7
    iput-object v0, p0, Lcom/join/mgps/fragment/SearchListFragment;->s:Landroid/widget/TextView;

    .line 8
    iput-object v0, p0, Lcom/join/mgps/fragment/SearchListFragment;->t:Landroid/widget/TextView;

    .line 9
    iput-object v0, p0, Lcom/join/mgps/fragment/SearchListFragment;->u:Landroid/widget/TextView;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 1

    const v0, 0x7f090c91

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/XListView2;

    iput-object v0, p0, Lcom/join/mgps/fragment/SearchListFragment;->b:Lcom/join/mgps/customview/XListView2;

    const v0, 0x7f090d82

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/SearchListFragment;->p:Landroid/view/View;

    const v0, 0x7f090d7f

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/SearchListFragment;->q:Landroid/view/View;

    const v0, 0x7f09110c

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/SearchListFragment;->r:Landroid/view/View;

    const v0, 0x7f090553

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/SearchListFragment;->s:Landroid/widget/TextView;

    const v0, 0x7f091265

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/SearchListFragment;->t:Landroid/widget/TextView;

    const v0, 0x7f091261

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/fragment/SearchListFragment;->u:Landroid/widget/TextView;

    .line 8
    iget-object p1, p0, Lcom/join/mgps/fragment/SearchListFragment;->r:Landroid/view/View;

    if-eqz p1, :cond_0

    .line 9
    new-instance v0, Lcom/join/mgps/fragment/SearchListFragment_$g;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/SearchListFragment_$g;-><init>(Lcom/join/mgps/fragment/SearchListFragment_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/SearchListFragment;->u:Landroid/widget/TextView;

    if-eqz p1, :cond_1

    .line 11
    new-instance v0, Lcom/join/mgps/fragment/SearchListFragment_$h;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/SearchListFragment_$h;-><init>(Lcom/join/mgps/fragment/SearchListFragment_;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SearchListFragment;->afterViews()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/SearchListFragment_;->z:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method p0(Lcom/join/mgps/dto/SearchPostsBean;I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/SearchListFragment_$l;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/fragment/SearchListFragment_$l;-><init>(Lcom/join/mgps/fragment/SearchListFragment_;Lcom/join/mgps/dto/SearchPostsBean;I)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchListFragment_;->B:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method s0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/SearchListFragment_$i;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/SearchListFragment_$i;-><init>(Lcom/join/mgps/fragment/SearchListFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLoadFailed(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/SearchListFragment_$o;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/SearchListFragment_$o;-><init>(Lcom/join/mgps/fragment/SearchListFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLoadingView()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/SearchListFragment_$n;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/SearchListFragment_$n;-><init>(Lcom/join/mgps/fragment/SearchListFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
