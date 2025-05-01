.class public final Lcom/join/mgps/fragment/CommentAllListFragment_;
.super Lcom/join/mgps/fragment/CommentAllListFragment;
.source "CommentAllListFragment_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/CommentAllListFragment_$q;
    }
.end annotation


# instance fields
.field private final G:La4/c;

.field private H:Landroid/view/View;

.field private final I:Ljava/util/Map;
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
    invoke-direct {p0}, Lcom/join/mgps/fragment/CommentAllListFragment;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/CommentAllListFragment_;->G:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/CommentAllListFragment_;->I:Ljava/util/Map;

    return-void
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/join/mgps/fragment/CommentAllListFragment;->k:Lcom/join/mgps/pref/PrefDef_;

    .line 2
    invoke-static {p0}, La4/c;->b(La4/b;)V

    return-void
.end method

.method static synthetic j0(Lcom/join/mgps/fragment/CommentAllListFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/CommentAllListFragment;->showLoding()V

    return-void
.end method

.method static synthetic k0(Lcom/join/mgps/fragment/CommentAllListFragment_;Lcom/join/mgps/dto/CommentBaseBean;II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/fragment/CommentAllListFragment;->c(Lcom/join/mgps/dto/CommentBaseBean;II)V

    return-void
.end method

.method static synthetic l0(Lcom/join/mgps/fragment/CommentAllListFragment_;Ljava/util/List;Lcom/join/mgps/dto/CommentAllListBean$ScoringDetailsBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/fragment/CommentAllListFragment;->g0(Ljava/util/List;Lcom/join/mgps/dto/CommentAllListBean$ScoringDetailsBean;)V

    return-void
.end method

.method static synthetic m0(Lcom/join/mgps/fragment/CommentAllListFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/CommentAllListFragment;->b0()V

    return-void
.end method

.method static synthetic n0(Lcom/join/mgps/fragment/CommentAllListFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/CommentAllListFragment;->showLodingFailed()V

    return-void
.end method

.method static synthetic o0(Lcom/join/mgps/fragment/CommentAllListFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/CommentAllListFragment;->i0()V

    return-void
.end method

.method static synthetic p0(Lcom/join/mgps/fragment/CommentAllListFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/CommentAllListFragment;->showMessage(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic q0(Lcom/join/mgps/fragment/CommentAllListFragment_;II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/fragment/CommentAllListFragment;->W(II)V

    return-void
.end method

.method static synthetic r0(Lcom/join/mgps/fragment/CommentAllListFragment_;Ljava/lang/String;ZII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lcom/join/mgps/fragment/CommentAllListFragment;->d0(Ljava/lang/String;ZII)V

    return-void
.end method

.method static synthetic s0(Lcom/join/mgps/fragment/CommentAllListFragment_;Lcom/join/mgps/dto/CommentResponse;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/CommentAllListFragment;->e0(Lcom/join/mgps/dto/CommentResponse;)V

    return-void
.end method

.method static synthetic t0(Lcom/join/mgps/fragment/CommentAllListFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/CommentAllListFragment;->X()V

    return-void
.end method

.method static synthetic u0(Lcom/join/mgps/fragment/CommentAllListFragment_;Lcom/join/mgps/dto/CommentBaseBean;II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/fragment/CommentAllListFragment;->b(Lcom/join/mgps/dto/CommentBaseBean;II)V

    return-void
.end method

.method public static v0()Lcom/join/mgps/fragment/CommentAllListFragment_$q;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CommentAllListFragment_$q;

    invoke-direct {v0}, Lcom/join/mgps/fragment/CommentAllListFragment_$q;-><init>()V

    return-object v0
.end method


# virtual methods
.method public W(II)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CommentAllListFragment_$a;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/fragment/CommentAllListFragment_$a;-><init>(Lcom/join/mgps/fragment/CommentAllListFragment_;II)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method X()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/CommentAllListFragment_$d;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/CommentAllListFragment_$d;-><init>(Lcom/join/mgps/fragment/CommentAllListFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method public b(Lcom/join/mgps/dto/CommentBaseBean;II)V
    .locals 10

    .line 1
    new-instance v9, Lcom/join/mgps/fragment/CommentAllListFragment_$e;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v9

    move-object v1, p0

    move-object v6, p1

    move v7, p2

    move v8, p3

    invoke-direct/range {v0 .. v8}, Lcom/join/mgps/fragment/CommentAllListFragment_$e;-><init>(Lcom/join/mgps/fragment/CommentAllListFragment_;Ljava/lang/String;JLjava/lang/String;Lcom/join/mgps/dto/CommentBaseBean;II)V

    invoke-static {v9}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method b0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/CommentAllListFragment_$g;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/CommentAllListFragment_$g;-><init>(Lcom/join/mgps/fragment/CommentAllListFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method public c(Lcom/join/mgps/dto/CommentBaseBean;II)V
    .locals 10

    .line 1
    new-instance v9, Lcom/join/mgps/fragment/CommentAllListFragment_$f;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v9

    move-object v1, p0

    move-object v6, p1

    move v7, p2

    move v8, p3

    invoke-direct/range {v0 .. v8}, Lcom/join/mgps/fragment/CommentAllListFragment_$f;-><init>(Lcom/join/mgps/fragment/CommentAllListFragment_;Ljava/lang/String;JLjava/lang/String;Lcom/join/mgps/dto/CommentBaseBean;II)V

    invoke-static {v9}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method d0(Ljava/lang/String;ZII)V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/CommentAllListFragment_$b;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/CommentAllListFragment_$b;-><init>(Lcom/join/mgps/fragment/CommentAllListFragment_;Ljava/lang/String;ZII)V

    const-string p1, ""

    const-wide/16 p2, 0x0

    invoke-static {p1, v6, p2, p3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method e0(Lcom/join/mgps/dto/CommentResponse;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CommentAllListFragment_$c;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/CommentAllListFragment_$c;-><init>(Lcom/join/mgps/fragment/CommentAllListFragment_;Lcom/join/mgps/dto/CommentResponse;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method g0(Ljava/util/List;Lcom/join/mgps/dto/CommentAllListBean$ScoringDetailsBean;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommentBaseBean;",
            ">;",
            "Lcom/join/mgps/dto/CommentAllListBean$ScoringDetailsBean;",
            ")V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CommentAllListFragment_$m;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/fragment/CommentAllListFragment_$m;-><init>(Lcom/join/mgps/fragment/CommentAllListFragment_;Ljava/util/List;Lcom/join/mgps/dto/CommentAllListBean$ScoringDetailsBean;)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/CommentAllListFragment_;->I:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method i0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CommentAllListFragment_$o;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CommentAllListFragment_$o;-><init>(Lcom/join/mgps/fragment/CommentAllListFragment_;)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/CommentAllListFragment_;->H:Landroid/view/View;

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
    iget-object v0, p0, Lcom/join/mgps/fragment/CommentAllListFragment_;->G:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/CommentAllListFragment_;->init_(Landroid/os/Bundle;)V

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

    iput-object p3, p0, Lcom/join/mgps/fragment/CommentAllListFragment_;->H:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c0142

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/CommentAllListFragment_;->H:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/CommentAllListFragment_;->H:Landroid/view/View;

    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/fragment/CommentAllListFragment_;->H:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/fragment/CommentAllListFragment;->c:Landroid/widget/ImageView;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/fragment/CommentAllListFragment;->d:Landroid/widget/TextView;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/fragment/CommentAllListFragment;->e:Landroid/widget/TextView;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/fragment/CommentAllListFragment;->f:Lcom/join/mgps/customview/LoadMoreRecyclerView;

    .line 7
    iput-object v0, p0, Lcom/join/mgps/fragment/CommentAllListFragment;->g:Landroid/widget/LinearLayout;

    .line 8
    iput-object v0, p0, Lcom/join/mgps/fragment/CommentAllListFragment;->h:Landroid/widget/LinearLayout;

    .line 9
    iput-object v0, p0, Lcom/join/mgps/fragment/CommentAllListFragment;->i:Landroidx/core/widget/NestedScrollView;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 3

    const v0, 0x7f090146

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/fragment/CommentAllListFragment;->c:Landroid/widget/ImageView;

    const v0, 0x7f091489

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/CommentAllListFragment;->d:Landroid/widget/TextView;

    const v0, 0x7f0913a9

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/CommentAllListFragment;->e:Landroid/widget/TextView;

    const v0, 0x7f09034f

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/LoadMoreRecyclerView;

    iput-object v0, p0, Lcom/join/mgps/fragment/CommentAllListFragment;->f:Lcom/join/mgps/customview/LoadMoreRecyclerView;

    const v0, 0x7f090d82

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/CommentAllListFragment;->g:Landroid/widget/LinearLayout;

    const v0, 0x7f090d7f

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/CommentAllListFragment;->h:Landroid/widget/LinearLayout;

    const v0, 0x7f090efe

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/core/widget/NestedScrollView;

    iput-object v0, p0, Lcom/join/mgps/fragment/CommentAllListFragment;->i:Landroidx/core/widget/NestedScrollView;

    const v0, 0x7f09110c

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f091261

    .line 9
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f0906ee

    .line 10
    invoke-interface {p1, v2}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz v0, :cond_0

    .line 11
    new-instance v2, Lcom/join/mgps/fragment/CommentAllListFragment_$h;

    invoke-direct {v2, p0}, Lcom/join/mgps/fragment/CommentAllListFragment_$h;-><init>(Lcom/join/mgps/fragment/CommentAllListFragment_;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz v1, :cond_1

    .line 12
    new-instance v0, Lcom/join/mgps/fragment/CommentAllListFragment_$i;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CommentAllListFragment_$i;-><init>(Lcom/join/mgps/fragment/CommentAllListFragment_;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 13
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/CommentAllListFragment;->e:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    .line 14
    new-instance v1, Lcom/join/mgps/fragment/CommentAllListFragment_$j;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/CommentAllListFragment_$j;-><init>(Lcom/join/mgps/fragment/CommentAllListFragment_;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    if-eqz p1, :cond_3

    .line 15
    new-instance v0, Lcom/join/mgps/fragment/CommentAllListFragment_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CommentAllListFragment_$k;-><init>(Lcom/join/mgps/fragment/CommentAllListFragment_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 16
    :cond_3
    invoke-virtual {p0}, Lcom/join/mgps/fragment/CommentAllListFragment;->afterView()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/CommentAllListFragment_;->G:La4/c;

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
    iget-object v0, p0, Lcom/join/mgps/fragment/CommentAllListFragment_;->I:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method showLoding()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CommentAllListFragment_$l;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CommentAllListFragment_$l;-><init>(Lcom/join/mgps/fragment/CommentAllListFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLodingFailed()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CommentAllListFragment_$n;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CommentAllListFragment_$n;-><init>(Lcom/join/mgps/fragment/CommentAllListFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showMessage(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CommentAllListFragment_$p;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/CommentAllListFragment_$p;-><init>(Lcom/join/mgps/fragment/CommentAllListFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
