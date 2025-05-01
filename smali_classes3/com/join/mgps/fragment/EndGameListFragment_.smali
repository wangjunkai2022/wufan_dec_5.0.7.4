.class public final Lcom/join/mgps/fragment/EndGameListFragment_;
.super Lcom/join/mgps/fragment/EndGameListFragment;
.source "EndGameListFragment_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/EndGameListFragment_$m;
    }
.end annotation


# static fields
.field public static final w:Ljava/lang/String; = "gameId"

.field public static final x:Ljava/lang/String; = "type"

.field public static final y:Ljava/lang/String; = "rules"

.field public static final z:Ljava/lang/String; = "ext"


# instance fields
.field private final t:La4/c;

.field private u:Landroid/view/View;

.field private final v:Ljava/util/Map;
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
    invoke-direct {p0}, Lcom/join/mgps/fragment/EndGameListFragment;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment_;->t:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment_;->v:Ljava/util/Map;

    return-void
.end method

.method public static A0()Lcom/join/mgps/fragment/EndGameListFragment_$m;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/EndGameListFragment_$m;

    invoke-direct {v0}, Lcom/join/mgps/fragment/EndGameListFragment_$m;-><init>()V

    return-object v0
.end method

.method private B0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

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

    iput-object v1, p0, Lcom/join/mgps/fragment/EndGameListFragment;->f:Ljava/lang/String;

    :cond_0
    const-string/jumbo v1, "type"

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/join/mgps/fragment/EndGameListFragment;->g:I

    :cond_1
    const-string v1, "rules"

    .line 6
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 7
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/fragment/EndGameListFragment;->h:Ljava/lang/String;

    :cond_2
    const-string v1, "ext"

    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 9
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->i:Ljava/lang/String;

    :cond_3
    return-void
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/fragment/EndGameListFragment_;->B0()V

    return-void
.end method

.method static synthetic q0(Lcom/join/mgps/fragment/EndGameListFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/EndGameListFragment;->j0()V

    return-void
.end method

.method static synthetic r0(Lcom/join/mgps/fragment/EndGameListFragment_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/EndGameListFragment;->o0(Ljava/util/List;)V

    return-void
.end method

.method static synthetic s0(Lcom/join/mgps/fragment/EndGameListFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/EndGameListFragment;->showTost(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic t0(Lcom/join/mgps/fragment/EndGameListFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/EndGameListFragment;->k0()V

    return-void
.end method

.method static synthetic u0(Lcom/join/mgps/fragment/EndGameListFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/EndGameListFragment;->g0()V

    return-void
.end method

.method static synthetic v0(Lcom/join/mgps/fragment/EndGameListFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/EndGameListFragment;->showLoding()V

    return-void
.end method

.method static synthetic w0(Lcom/join/mgps/fragment/EndGameListFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/EndGameListFragment;->showLodingFailed()V

    return-void
.end method

.method static synthetic x0(Lcom/join/mgps/fragment/EndGameListFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/EndGameListFragment;->showMain()V

    return-void
.end method

.method static synthetic y0(Lcom/join/mgps/fragment/EndGameListFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/EndGameListFragment;->showEmpty()V

    return-void
.end method

.method static synthetic z0(Lcom/join/mgps/fragment/EndGameListFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/EndGameListFragment;->i0()V

    return-void
.end method


# virtual methods
.method g0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/EndGameListFragment_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/EndGameListFragment_$j;-><init>(Lcom/join/mgps/fragment/EndGameListFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

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
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment_;->v:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method i0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/EndGameListFragment_$c;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/EndGameListFragment_$c;-><init>(Lcom/join/mgps/fragment/EndGameListFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment_;->u:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method j0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/EndGameListFragment_$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/EndGameListFragment_$f;-><init>(Lcom/join/mgps/fragment/EndGameListFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method k0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/EndGameListFragment_$i;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/EndGameListFragment_$i;-><init>(Lcom/join/mgps/fragment/EndGameListFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x1f4

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method o0(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/EndGameBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/EndGameListFragment_$g;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/EndGameListFragment_$g;-><init>(Lcom/join/mgps/fragment/EndGameListFragment_;Ljava/util/List;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment_;->t:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/EndGameListFragment_;->init_(Landroid/os/Bundle;)V

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

    iput-object p3, p0, Lcom/join/mgps/fragment/EndGameListFragment_;->u:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c0263

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/EndGameListFragment_;->u:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/EndGameListFragment_;->u:Landroid/view/View;

    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment_;->u:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->c:Landroid/widget/LinearLayout;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->d:Landroid/widget/LinearLayout;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->e:Landroid/widget/LinearLayout;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 2

    const v0, 0x7f0910e9

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    const v0, 0x7f090d82

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->c:Landroid/widget/LinearLayout;

    const v0, 0x7f090d7f

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->d:Landroid/widget/LinearLayout;

    const v0, 0x7f090cec

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment;->e:Landroid/widget/LinearLayout;

    const v0, 0x7f091261

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f09110c

    .line 6
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz v0, :cond_0

    .line 7
    new-instance v1, Lcom/join/mgps/fragment/EndGameListFragment_$d;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/EndGameListFragment_$d;-><init>(Lcom/join/mgps/fragment/EndGameListFragment_;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz p1, :cond_1

    .line 8
    new-instance v0, Lcom/join/mgps/fragment/EndGameListFragment_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/EndGameListFragment_$e;-><init>(Lcom/join/mgps/fragment/EndGameListFragment_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/EndGameListFragment;->f0()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/EndGameListFragment_;->t:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment_;->v:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method showEmpty()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/EndGameListFragment_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/EndGameListFragment_$b;-><init>(Lcom/join/mgps/fragment/EndGameListFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLoding()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/EndGameListFragment_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/EndGameListFragment_$k;-><init>(Lcom/join/mgps/fragment/EndGameListFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLodingFailed()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/EndGameListFragment_$l;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/EndGameListFragment_$l;-><init>(Lcom/join/mgps/fragment/EndGameListFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showMain()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/EndGameListFragment_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/EndGameListFragment_$a;-><init>(Lcom/join/mgps/fragment/EndGameListFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showTost(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/EndGameListFragment_$h;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/EndGameListFragment_$h;-><init>(Lcom/join/mgps/fragment/EndGameListFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
