.class public final Lcom/join/mgps/fragment/EndGameSelectFragment_;
.super Lcom/join/mgps/fragment/EndGameSelectFragment;
.source "EndGameSelectFragment_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/EndGameSelectFragment_$h;
    }
.end annotation


# static fields
.field public static final m:Ljava/lang/String; = "modelType"


# instance fields
.field private final j:La4/c;

.field private k:Landroid/view/View;

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
    invoke-direct {p0}, Lcom/join/mgps/fragment/EndGameSelectFragment;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment_;->j:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment_;->l:Ljava/util/Map;

    return-void
.end method

.method static synthetic f0(Lcom/join/mgps/fragment/EndGameSelectFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/EndGameSelectFragment;->c0()V

    return-void
.end method

.method static synthetic g0(Lcom/join/mgps/fragment/EndGameSelectFragment_;Lcom/join/mgps/dto/EndGameListBean;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/fragment/EndGameSelectFragment;->e0(Lcom/join/mgps/dto/EndGameListBean;I)V

    return-void
.end method

.method static synthetic h0(Lcom/join/mgps/fragment/EndGameSelectFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/EndGameSelectFragment;->showLoding()V

    return-void
.end method

.method static synthetic i0(Lcom/join/mgps/fragment/EndGameSelectFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/EndGameSelectFragment;->showLodingFailed()V

    return-void
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/fragment/EndGameSelectFragment_;->n0()V

    return-void
.end method

.method static synthetic j0(Lcom/join/mgps/fragment/EndGameSelectFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/EndGameSelectFragment;->showMain()V

    return-void
.end method

.method static synthetic k0(Lcom/join/mgps/fragment/EndGameSelectFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/EndGameSelectFragment;->showTost(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic l0(Lcom/join/mgps/fragment/EndGameSelectFragment_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/EndGameSelectFragment;->b0(I)V

    return-void
.end method

.method public static m0()Lcom/join/mgps/fragment/EndGameSelectFragment_$h;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/EndGameSelectFragment_$h;

    invoke-direct {v0}, Lcom/join/mgps/fragment/EndGameSelectFragment_$h;-><init>()V

    return-object v0
.end method

.method private n0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "modelType"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->e:I

    :cond_0
    return-void
.end method


# virtual methods
.method b0(I)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/fragment/EndGameSelectFragment_$g;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/fragment/EndGameSelectFragment_$g;-><init>(Lcom/join/mgps/fragment/EndGameSelectFragment_;Ljava/lang/String;JLjava/lang/String;I)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method c0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/EndGameSelectFragment_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/EndGameSelectFragment_$a;-><init>(Lcom/join/mgps/fragment/EndGameSelectFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method e0(Lcom/join/mgps/dto/EndGameListBean;I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/EndGameSelectFragment_$b;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/fragment/EndGameSelectFragment_$b;-><init>(Lcom/join/mgps/fragment/EndGameSelectFragment_;Lcom/join/mgps/dto/EndGameListBean;I)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment_;->l:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
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
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment_;->k:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment_;->j:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/EndGameSelectFragment_;->init_(Landroid/os/Bundle;)V

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

    iput-object p3, p0, Lcom/join/mgps/fragment/EndGameSelectFragment_;->k:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c0264

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/EndGameSelectFragment_;->k:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/EndGameSelectFragment_;->k:Landroid/view/View;

    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment_;->k:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->c:Landroid/widget/LinearLayout;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->d:Landroid/widget/LinearLayout;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 1

    const v0, 0x7f0911c2

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->b:Landroidx/recyclerview/widget/RecyclerView;

    const v0, 0x7f090d82

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->c:Landroid/widget/LinearLayout;

    const v0, 0x7f090d7f

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->d:Landroid/widget/LinearLayout;

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/fragment/EndGameSelectFragment;->a0()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/EndGameSelectFragment_;->j:La4/c;

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
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment_;->l:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method showLoding()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/EndGameSelectFragment_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/EndGameSelectFragment_$c;-><init>(Lcom/join/mgps/fragment/EndGameSelectFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLodingFailed()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/EndGameSelectFragment_$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/EndGameSelectFragment_$d;-><init>(Lcom/join/mgps/fragment/EndGameSelectFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showMain()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/EndGameSelectFragment_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/EndGameSelectFragment_$e;-><init>(Lcom/join/mgps/fragment/EndGameSelectFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showTost(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/EndGameSelectFragment_$f;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/EndGameSelectFragment_$f;-><init>(Lcom/join/mgps/fragment/EndGameSelectFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
