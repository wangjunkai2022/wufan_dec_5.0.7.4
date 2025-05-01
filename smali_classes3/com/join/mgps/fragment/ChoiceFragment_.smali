.class public final Lcom/join/mgps/fragment/ChoiceFragment_;
.super Lcom/join/mgps/fragment/ChoiceFragment;
.source "ChoiceFragment_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/ChoiceFragment_$i;
    }
.end annotation


# instance fields
.field private final s:La4/c;

.field private t:Landroid/view/View;

.field private final u:Ljava/util/Map;
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
    invoke-direct {p0}, Lcom/join/mgps/fragment/ChoiceFragment;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/ChoiceFragment_;->s:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/ChoiceFragment_;->u:Ljava/util/Map;

    return-void
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/join/mgps/fragment/ChoiceFragment;->g:Lcom/join/mgps/pref/PrefDef_;

    .line 2
    invoke-static {p0}, La4/c;->b(La4/b;)V

    return-void
.end method

.method static synthetic n0(Lcom/join/mgps/fragment/ChoiceFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/ChoiceFragment;->showMessage(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic o0(Lcom/join/mgps/fragment/ChoiceFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/ChoiceFragment;->m0()V

    return-void
.end method

.method static synthetic p0(Lcom/join/mgps/fragment/ChoiceFragment_;Lcom/join/mgps/dto/HomeGameCarefullyBean;II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/fragment/ChoiceFragment;->k0(Lcom/join/mgps/dto/HomeGameCarefullyBean;II)V

    return-void
.end method

.method static synthetic q0(Lcom/join/mgps/fragment/ChoiceFragment_;Lcom/join/mgps/dto/HomeGameCarefullyBean;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/fragment/ChoiceFragment;->j0(Lcom/join/mgps/dto/HomeGameCarefullyBean;I)V

    return-void
.end method

.method static synthetic r0(Lcom/join/mgps/fragment/ChoiceFragment_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/ChoiceFragment;->Z(I)V

    return-void
.end method

.method static synthetic s0(Lcom/join/mgps/fragment/ChoiceFragment_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/ChoiceFragment;->f0(I)V

    return-void
.end method

.method static synthetic t0(Lcom/join/mgps/fragment/ChoiceFragment_;Lcom/join/mgps/dto/HomeGameCarefullyBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/ChoiceFragment;->g0(Lcom/join/mgps/dto/HomeGameCarefullyBean;)V

    return-void
.end method

.method public static u0()Lcom/join/mgps/fragment/ChoiceFragment_$i;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/ChoiceFragment_$i;

    invoke-direct {v0}, Lcom/join/mgps/fragment/ChoiceFragment_$i;-><init>()V

    return-object v0
.end method


# virtual methods
.method Z(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/ChoiceFragment_$f;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/ChoiceFragment_$f;-><init>(Lcom/join/mgps/fragment/ChoiceFragment_;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method f0(I)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/fragment/ChoiceFragment_$g;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/fragment/ChoiceFragment_$g;-><init>(Lcom/join/mgps/fragment/ChoiceFragment_;Ljava/lang/String;JLjava/lang/String;I)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method g0(Lcom/join/mgps/dto/HomeGameCarefullyBean;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/fragment/ChoiceFragment_$h;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/fragment/ChoiceFragment_$h;-><init>(Lcom/join/mgps/fragment/ChoiceFragment_;Ljava/lang/String;JLjava/lang/String;Lcom/join/mgps/dto/HomeGameCarefullyBean;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/ChoiceFragment_;->u:Ljava/util/Map;

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
    iget-object v0, p0, Lcom/join/mgps/fragment/ChoiceFragment_;->t:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method j0(Lcom/join/mgps/dto/HomeGameCarefullyBean;I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/ChoiceFragment_$e;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/fragment/ChoiceFragment_$e;-><init>(Lcom/join/mgps/fragment/ChoiceFragment_;Lcom/join/mgps/dto/HomeGameCarefullyBean;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method k0(Lcom/join/mgps/dto/HomeGameCarefullyBean;II)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/ChoiceFragment_$d;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/join/mgps/fragment/ChoiceFragment_$d;-><init>(Lcom/join/mgps/fragment/ChoiceFragment_;Lcom/join/mgps/dto/HomeGameCarefullyBean;II)V

    const-string p1, ""

    const-wide/16 p2, 0x0

    invoke-static {p1, v0, p2, p3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method m0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/ChoiceFragment_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/ChoiceFragment_$c;-><init>(Lcom/join/mgps/fragment/ChoiceFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ChoiceFragment_;->s:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/ChoiceFragment_;->init_(Landroid/os/Bundle;)V

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

    iput-object p3, p0, Lcom/join/mgps/fragment/ChoiceFragment_;->t:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c010b

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/ChoiceFragment_;->t:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/ChoiceFragment_;->t:Landroid/view/View;

    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/fragment/ChoiceFragment_;->t:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/fragment/ChoiceFragment;->b:Landroid/widget/TextView;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/fragment/ChoiceFragment;->c:Landroid/widget/TextView;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/fragment/ChoiceFragment;->d:Lcom/join/mgps/customview/ForumLoadingView;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/fragment/ChoiceFragment;->n:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 1

    const v0, 0x7f091212

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/ChoiceFragment;->b:Landroid/widget/TextView;

    const v0, 0x7f091215

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/ChoiceFragment;->c:Landroid/widget/TextView;

    const v0, 0x7f090d57

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/ForumLoadingView;

    iput-object v0, p0, Lcom/join/mgps/fragment/ChoiceFragment;->d:Lcom/join/mgps/customview/ForumLoadingView;

    const v0, 0x7f0910e9

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    iput-object p1, p0, Lcom/join/mgps/fragment/ChoiceFragment;->n:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    .line 5
    iget-object p1, p0, Lcom/join/mgps/fragment/ChoiceFragment;->b:Landroid/widget/TextView;

    if-eqz p1, :cond_0

    .line 6
    new-instance v0, Lcom/join/mgps/fragment/ChoiceFragment_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/ChoiceFragment_$a;-><init>(Lcom/join/mgps/fragment/ChoiceFragment_;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 7
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ChoiceFragment;->afterViews()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/ChoiceFragment_;->s:La4/c;

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
    iget-object v0, p0, Lcom/join/mgps/fragment/ChoiceFragment_;->u:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method showMessage(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/ChoiceFragment_$b;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/ChoiceFragment_$b;-><init>(Lcom/join/mgps/fragment/ChoiceFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
