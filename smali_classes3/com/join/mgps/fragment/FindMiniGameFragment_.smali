.class public final Lcom/join/mgps/fragment/FindMiniGameFragment_;
.super Lcom/join/mgps/fragment/FindMiniGameFragment;
.source "FindMiniGameFragment_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/FindMiniGameFragment_$n;
    }
.end annotation


# static fields
.field public static final u:Ljava/lang/String; = "gameId"


# instance fields
.field private final r:La4/c;

.field private s:Landroid/view/View;

.field private final t:Ljava/util/Map;
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
    invoke-direct {p0}, Lcom/join/mgps/fragment/FindMiniGameFragment;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment_;->r:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment_;->t:Ljava/util/Map;

    return-void
.end method

.method static synthetic A0(Lcom/join/mgps/fragment/FindMiniGameFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/FindMiniGameFragment;->showLoding()V

    return-void
.end method

.method static synthetic B0(Lcom/join/mgps/fragment/FindMiniGameFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/FindMiniGameFragment;->c0()V

    return-void
.end method

.method static synthetic C0(Lcom/join/mgps/fragment/FindMiniGameFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/FindMiniGameFragment;->showLodingFailed()V

    return-void
.end method

.method static synthetic D0(Lcom/join/mgps/fragment/FindMiniGameFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/FindMiniGameFragment;->i0()V

    return-void
.end method

.method public static E0()Lcom/join/mgps/fragment/FindMiniGameFragment_$n;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/FindMiniGameFragment_$n;

    invoke-direct {v0}, Lcom/join/mgps/fragment/FindMiniGameFragment_$n;-><init>()V

    return-object v0
.end method

.method private F0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "gameId"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->i:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/fragment/FindMiniGameFragment_;->F0()V

    return-void
.end method

.method static synthetic t0(Lcom/join/mgps/fragment/FindMiniGameFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/FindMiniGameFragment;->a0()V

    return-void
.end method

.method static synthetic u0(Lcom/join/mgps/fragment/FindMiniGameFragment_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/FindMiniGameFragment;->b0(I)V

    return-void
.end method

.method static synthetic v0(Lcom/join/mgps/fragment/FindMiniGameFragment_;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/FindMiniGameFragment;->d0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method

.method static synthetic w0(Lcom/join/mgps/fragment/FindMiniGameFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/FindMiniGameFragment;->W()V

    return-void
.end method

.method static synthetic x0(Lcom/join/mgps/fragment/FindMiniGameFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/FindMiniGameFragment;->k0()V

    return-void
.end method

.method static synthetic y0(Lcom/join/mgps/fragment/FindMiniGameFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/FindMiniGameFragment;->m0()V

    return-void
.end method

.method static synthetic z0(Lcom/join/mgps/fragment/FindMiniGameFragment_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/FindMiniGameFragment;->l0(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method W()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/FindMiniGameFragment_$i;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/FindMiniGameFragment_$i;-><init>(Lcom/join/mgps/fragment/FindMiniGameFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method a0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/FindMiniGameFragment_$g;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/FindMiniGameFragment_$g;-><init>(Lcom/join/mgps/fragment/FindMiniGameFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x1f4

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method b0(I)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/fragment/FindMiniGameFragment_$d;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/fragment/FindMiniGameFragment_$d;-><init>(Lcom/join/mgps/fragment/FindMiniGameFragment_;Ljava/lang/String;JLjava/lang/String;I)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method c0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/FindMiniGameFragment_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/FindMiniGameFragment_$a;-><init>(Lcom/join/mgps/fragment/FindMiniGameFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method d0(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/FindMiniGameFragment_$h;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/FindMiniGameFragment_$h;-><init>(Lcom/join/mgps/fragment/FindMiniGameFragment_;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment_;->t:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method i0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/FindMiniGameFragment_$c;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/FindMiniGameFragment_$c;-><init>(Lcom/join/mgps/fragment/FindMiniGameFragment_;Ljava/lang/String;JLjava/lang/String;)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment_;->s:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method k0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/FindMiniGameFragment_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/FindMiniGameFragment_$j;-><init>(Lcom/join/mgps/fragment/FindMiniGameFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method l0(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/FindMiniGameFragment_$l;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/FindMiniGameFragment_$l;-><init>(Lcom/join/mgps/fragment/FindMiniGameFragment_;Ljava/util/List;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method m0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/FindMiniGameFragment_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/FindMiniGameFragment_$k;-><init>(Lcom/join/mgps/fragment/FindMiniGameFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment_;->r:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/FindMiniGameFragment_;->init_(Landroid/os/Bundle;)V

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

    iput-object p3, p0, Lcom/join/mgps/fragment/FindMiniGameFragment_;->s:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c0268

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/FindMiniGameFragment_;->s:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/FindMiniGameFragment_;->s:Landroid/view/View;

    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment_;->s:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->c:Landroid/widget/LinearLayout;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->f:Landroid/widget/LinearLayout;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->g:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    .line 7
    iput-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->h:Landroid/widget/LinearLayout;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 2

    const v0, 0x7f091831

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    iput-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    const v0, 0x7f090954

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->c:Landroid/widget/LinearLayout;

    const v0, 0x7f090d82

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->f:Landroid/widget/LinearLayout;

    const v0, 0x7f090db3

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->g:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    const v0, 0x7f090d7f

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment;->h:Landroid/widget/LinearLayout;

    const v0, 0x7f09110c

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f091261

    .line 7
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz v0, :cond_0

    .line 8
    new-instance v1, Lcom/join/mgps/fragment/FindMiniGameFragment_$e;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/FindMiniGameFragment_$e;-><init>(Lcom/join/mgps/fragment/FindMiniGameFragment_;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz p1, :cond_1

    .line 9
    new-instance v0, Lcom/join/mgps/fragment/FindMiniGameFragment_$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/FindMiniGameFragment_$f;-><init>(Lcom/join/mgps/fragment/FindMiniGameFragment_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/FindMiniGameFragment;->V()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/FindMiniGameFragment_;->r:La4/c;

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
    iget-object v0, p0, Lcom/join/mgps/fragment/FindMiniGameFragment_;->t:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method showLoding()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/FindMiniGameFragment_$m;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/FindMiniGameFragment_$m;-><init>(Lcom/join/mgps/fragment/FindMiniGameFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLodingFailed()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/FindMiniGameFragment_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/FindMiniGameFragment_$b;-><init>(Lcom/join/mgps/fragment/FindMiniGameFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
