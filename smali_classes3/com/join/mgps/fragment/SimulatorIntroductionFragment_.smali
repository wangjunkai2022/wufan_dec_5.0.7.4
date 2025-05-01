.class public final Lcom/join/mgps/fragment/SimulatorIntroductionFragment_;
.super Lcom/join/mgps/fragment/SimulatorIntroductionFragment;
.source "SimulatorIntroductionFragment_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/SimulatorIntroductionFragment_$j;
    }
.end annotation


# instance fields
.field private final u:La4/c;

.field private v:Landroid/view/View;

.field private final w:Ljava/util/Map;
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
    invoke-direct {p0}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment_;->u:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment_;->w:Ljava/util/Map;

    return-void
.end method

.method static synthetic d0(Lcom/join/mgps/fragment/SimulatorIntroductionFragment_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->showMain(Ljava/util/List;)V

    return-void
.end method

.method static synthetic e0(Lcom/join/mgps/fragment/SimulatorIntroductionFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->showLoadFailed(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic f0(Lcom/join/mgps/fragment/SimulatorIntroductionFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->hideLoading()V

    return-void
.end method

.method static synthetic g0(Lcom/join/mgps/fragment/SimulatorIntroductionFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->showLoadingView()V

    return-void
.end method

.method static synthetic h0(Lcom/join/mgps/fragment/SimulatorIntroductionFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->loadData()V

    return-void
.end method

.method public static i0()Lcom/join/mgps/fragment/SimulatorIntroductionFragment_$j;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment_$j;

    invoke-direct {v0}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment_$j;-><init>()V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment_;->w:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method hideLoading()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment_$g;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment_$g;-><init>(Lcom/join/mgps/fragment/SimulatorIntroductionFragment_;)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment_;->v:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method loadData()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/SimulatorIntroductionFragment_$i;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment_$i;-><init>(Lcom/join/mgps/fragment/SimulatorIntroductionFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment_;->u:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment_;->init_(Landroid/os/Bundle;)V

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

    iput-object p3, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment_;->v:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c029d

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment_;->v:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment_;->v:Landroid/view/View;

    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment_;->v:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->c:Landroidx/viewpager/widget/ViewPager;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->d:Landroid/widget/ImageView;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->e:Landroid/widget/TextView;

    .line 7
    iput-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->f:Landroid/widget/ImageView;

    .line 8
    iput-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->g:Landroid/widget/ImageView;

    .line 9
    iput-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->h:Landroid/widget/RelativeLayout;

    .line 10
    iput-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->i:Landroid/view/View;

    .line 11
    iput-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->l:Landroid/view/View;

    .line 12
    iput-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->m:Landroid/view/View;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 2

    const v0, 0x7f0911d6

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->b:Landroidx/recyclerview/widget/RecyclerView;

    const v0, 0x7f0917bc

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/viewpager/widget/ViewPager;

    iput-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->c:Landroidx/viewpager/widget/ViewPager;

    const v0, 0x7f0908e2

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->d:Landroid/widget/ImageView;

    const v0, 0x7f0915cd

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->e:Landroid/widget/TextView;

    const v0, 0x7f09021e

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->f:Landroid/widget/ImageView;

    const v0, 0x7f0901c2

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->g:Landroid/widget/ImageView;

    const v0, 0x7f09114a

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->h:Landroid/widget/RelativeLayout;

    const v0, 0x7f09044b

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->i:Landroid/view/View;

    const v0, 0x7f090d82

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->l:Landroid/view/View;

    const v0, 0x7f090d7f

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->m:Landroid/view/View;

    const v0, 0x7f091261

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f09110c

    .line 12
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz v0, :cond_0

    .line 13
    new-instance v1, Lcom/join/mgps/fragment/SimulatorIntroductionFragment_$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment_$a;-><init>(Lcom/join/mgps/fragment/SimulatorIntroductionFragment_;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz p1, :cond_1

    .line 14
    new-instance v0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment_$b;-><init>(Lcom/join/mgps/fragment/SimulatorIntroductionFragment_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->d:Landroid/widget/ImageView;

    if-eqz p1, :cond_2

    .line 16
    new-instance v0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment_$c;-><init>(Lcom/join/mgps/fragment/SimulatorIntroductionFragment_;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->e:Landroid/widget/TextView;

    if-eqz p1, :cond_3

    .line 18
    new-instance v0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment_$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment_$d;-><init>(Lcom/join/mgps/fragment/SimulatorIntroductionFragment_;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    :cond_3
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->aftervidew()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment_;->u:La4/c;

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
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment_;->w:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method showLoadFailed(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment_$f;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment_$f;-><init>(Lcom/join/mgps/fragment/SimulatorIntroductionFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLoadingView()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment_$h;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment_$h;-><init>(Lcom/join/mgps/fragment/SimulatorIntroductionFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showMain(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/BbsTagListBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment_$e;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment_$e;-><init>(Lcom/join/mgps/fragment/SimulatorIntroductionFragment_;Ljava/util/List;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
