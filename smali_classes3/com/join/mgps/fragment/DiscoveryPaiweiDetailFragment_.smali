.class public final Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_;
.super Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;
.source "DiscoveryPaiweiDetailFragment_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_$k;
    }
.end annotation


# static fields
.field public static final A:Ljava/lang/String; = "maxBattleCount"

.field public static final z:Ljava/lang/String; = "gameId"


# instance fields
.field private final w:La4/c;

.field private x:Landroid/view/View;

.field private final y:Ljava/util/Map;
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
    invoke-direct {p0}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_;->w:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_;->y:Ljava/util/Map;

    return-void
.end method

.method static synthetic c0(Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->b0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic d0(Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->showMessage(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic e0(Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->showLoding()V

    return-void
.end method

.method static synthetic f0(Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->showLodingFailed()V

    return-void
.end method

.method static synthetic g0(Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->showEmpty()V

    return-void
.end method

.method static synthetic h0(Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->showMain()V

    return-void
.end method

.method static synthetic i0(Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->Z()V

    return-void
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_;->k0()V

    return-void
.end method

.method public static j0()Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_$k;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_$k;

    invoke-direct {v0}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_$k;-><init>()V

    return-object v0
.end method

.method private k0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

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

    iput-object v1, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->n:Ljava/lang/String;

    :cond_0
    const-string v1, "maxBattleCount"

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->o:I

    :cond_1
    return-void
.end method


# virtual methods
.method Z()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_$a;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_$a;-><init>(Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method b0(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_$e;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_$e;-><init>(Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_;Ljava/lang/String;)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_;->y:Ljava/util/Map;

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
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_;->x:Landroid/view/View;

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
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_;->w:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_;->init_(Landroid/os/Bundle;)V

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

    iput-object p3, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_;->x:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c04eb

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_;->x:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_;->x:Landroid/view/View;

    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_;->x:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->d:Landroidx/cardview/widget/CardView;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->e:Landroid/widget/TextView;

    .line 7
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->f:Landroid/widget/TextView;

    .line 8
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->g:Landroidx/constraintlayout/widget/Group;

    .line 9
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->h:Landroid/widget/LinearLayout;

    .line 10
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->i:Landroid/widget/LinearLayout;

    .line 11
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->j:Landroid/widget/LinearLayout;

    .line 12
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->k:Landroid/widget/TextView;

    .line 13
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->l:Landroidx/cardview/widget/CardView;

    .line 14
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->m:Landroid/widget/TextView;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 2

    const v0, 0x7f090818

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f0911c7

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->c:Landroidx/recyclerview/widget/RecyclerView;

    const v0, 0x7f0905a3

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/cardview/widget/CardView;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->d:Landroidx/cardview/widget/CardView;

    const v0, 0x7f091536

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->e:Landroid/widget/TextView;

    const v0, 0x7f0914fd

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->f:Landroid/widget/TextView;

    const v0, 0x7f090dbd

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/Group;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->g:Landroidx/constraintlayout/widget/Group;

    const v0, 0x7f090d82

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->h:Landroid/widget/LinearLayout;

    const v0, 0x7f090d7f

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->i:Landroid/widget/LinearLayout;

    const v0, 0x7f090cec

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->j:Landroid/widget/LinearLayout;

    const v0, 0x7f091568

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->k:Landroid/widget/TextView;

    const v0, 0x7f090220

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/cardview/widget/CardView;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->l:Landroidx/cardview/widget/CardView;

    const v0, 0x7f0904c6

    .line 12
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->m:Landroid/widget/TextView;

    const v0, 0x7f091261

    .line 13
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f09110c

    .line 14
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz v0, :cond_0

    .line 15
    new-instance v1, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_$b;-><init>(Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz p1, :cond_1

    .line 16
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_$c;-><init>(Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->l:Landroidx/cardview/widget/CardView;

    if-eqz p1, :cond_2

    .line 18
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_$d;-><init>(Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_;)V

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;->V()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_;->w:La4/c;

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
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_;->y:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method showEmpty()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_$i;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_$i;-><init>(Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLoding()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_$g;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_$g;-><init>(Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLodingFailed()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_$h;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_$h;-><init>(Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showMain()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_$j;-><init>(Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showMessage(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_$f;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_$f;-><init>(Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
