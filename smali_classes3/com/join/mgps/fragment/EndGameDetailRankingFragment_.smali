.class public final Lcom/join/mgps/fragment/EndGameDetailRankingFragment_;
.super Lcom/join/mgps/fragment/EndGameDetailRankingFragment;
.source "EndGameDetailRankingFragment_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/EndGameDetailRankingFragment_$f;
    }
.end annotation


# static fields
.field public static final s:Ljava/lang/String; = "detailBean"


# instance fields
.field private final p:La4/c;

.field private q:Landroid/view/View;

.field private final r:Ljava/util/Map;
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
    invoke-direct {p0}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment_;->p:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment_;->r:Ljava/util/Map;

    return-void
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment_;->p0()V

    return-void
.end method

.method static synthetic j0(Lcom/join/mgps/fragment/EndGameDetailRankingFragment_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->updateUi(Ljava/util/List;)V

    return-void
.end method

.method static synthetic k0(Lcom/join/mgps/fragment/EndGameDetailRankingFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->showTost(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic l0(Lcom/join/mgps/fragment/EndGameDetailRankingFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->i0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic m0(Lcom/join/mgps/fragment/EndGameDetailRankingFragment_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->d0(I)V

    return-void
.end method

.method static synthetic n0(Lcom/join/mgps/fragment/EndGameDetailRankingFragment_;Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->e0(Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;)V

    return-void
.end method

.method public static o0()Lcom/join/mgps/fragment/EndGameDetailRankingFragment_$f;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment_$f;

    invoke-direct {v0}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment_$f;-><init>()V

    return-object v0
.end method

.method private p0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "detailBean"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/EndGameDetailBean;

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->k:Lcom/join/mgps/dto/EndGameDetailBean;

    :cond_0
    return-void
.end method


# virtual methods
.method d0(I)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/fragment/EndGameDetailRankingFragment_$d;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment_$d;-><init>(Lcom/join/mgps/fragment/EndGameDetailRankingFragment_;Ljava/lang/String;JLjava/lang/String;I)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method e0(Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/fragment/EndGameDetailRankingFragment_$e;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment_$e;-><init>(Lcom/join/mgps/fragment/EndGameDetailRankingFragment_;Ljava/lang/String;JLjava/lang/String;Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment_;->r:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method i0(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment_$c;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment_$c;-><init>(Lcom/join/mgps/fragment/EndGameDetailRankingFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment_;->q:Landroid/view/View;

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
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment_;->p:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment_;->init_(Landroid/os/Bundle;)V

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

    iput-object p3, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment_;->q:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c0261

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment_;->q:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment_;->q:Landroid/view/View;

    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment_;->q:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->b:Landroid/widget/TextView;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->c:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->d:Landroid/widget/TextView;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->e:Landroid/widget/TextView;

    .line 7
    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->f:Landroid/widget/TextView;

    .line 8
    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->g:Landroid/widget/ImageView;

    .line 9
    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->i:Landroid/widget/RelativeLayout;

    .line 11
    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->j:Landroid/widget/ImageView;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 1

    const v0, 0x7f09154e

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->b:Landroid/widget/TextView;

    const v0, 0x7f0908d5

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->c:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f091587

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->d:Landroid/widget/TextView;

    const v0, 0x7f091561

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->e:Landroid/widget/TextView;

    const v0, 0x7f09154f

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->f:Landroid/widget/TextView;

    const v0, 0x7f0908fd

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->g:Landroid/widget/ImageView;

    const v0, 0x7f0911c7

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->h:Landroidx/recyclerview/widget/RecyclerView;

    const v0, 0x7f0910ab

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->i:Landroid/widget/RelativeLayout;

    const v0, 0x7f0908f7

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->j:Landroid/widget/ImageView;

    .line 10
    invoke-virtual {p0}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->b0()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment_;->p:La4/c;

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
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment_;->r:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method showTost(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment_$b;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment_$b;-><init>(Lcom/join/mgps/fragment/EndGameDetailRankingFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method updateUi(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment_$a;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment_$a;-><init>(Lcom/join/mgps/fragment/EndGameDetailRankingFragment_;Ljava/util/List;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
