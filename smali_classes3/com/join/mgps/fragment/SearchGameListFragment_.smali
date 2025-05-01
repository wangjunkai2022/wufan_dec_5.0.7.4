.class public final Lcom/join/mgps/fragment/SearchGameListFragment_;
.super Lcom/join/mgps/fragment/SearchGameListFragment;
.source "SearchGameListFragment_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/SearchGameListFragment_$p;
    }
.end annotation


# static fields
.field public static final N:Ljava/lang/String; = "currentTab"

.field public static final O:Ljava/lang/String; = "game_id"

.field public static final P:Ljava/lang/String; = "keyword"


# instance fields
.field private final I:La4/c;

.field private J:Landroid/view/View;

.field private final K:Ljava/util/Map;
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

.field private final L:Landroid/content/IntentFilter;

.field private final M:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/fragment/SearchGameListFragment;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment_;->I:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment_;->K:Ljava/util/Map;

    .line 4
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment_;->L:Landroid/content/IntentFilter;

    .line 5
    new-instance v0, Lcom/join/mgps/fragment/SearchGameListFragment_$g;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/SearchGameListFragment_$g;-><init>(Lcom/join/mgps/fragment/SearchGameListFragment_;)V

    iput-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment_;->M:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic C0(Lcom/join/mgps/fragment/SearchGameListFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/SearchGameListFragment;->e0()V

    return-void
.end method

.method static synthetic D0(Lcom/join/mgps/fragment/SearchGameListFragment_;IZ)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/fragment/SearchGameListFragment;->j0(IZ)V

    return-void
.end method

.method static synthetic E0(Lcom/join/mgps/fragment/SearchGameListFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/SearchGameListFragment;->v0()V

    return-void
.end method

.method static synthetic F0(Lcom/join/mgps/fragment/SearchGameListFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/SearchGameListFragment;->q0()V

    return-void
.end method

.method static synthetic G0(Lcom/join/mgps/fragment/SearchGameListFragment_;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/fragment/SearchGameListFragment;->w0(Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic H0(Lcom/join/mgps/fragment/SearchGameListFragment_;Ljava/util/List;ZZ)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/fragment/SearchGameListFragment;->t0(Ljava/util/List;ZZ)V

    return-void
.end method

.method static synthetic I0(Lcom/join/mgps/fragment/SearchGameListFragment_;Lcom/join/mgps/dto/SearchGameListBean;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/fragment/SearchGameListFragment;->s0(Lcom/join/mgps/dto/SearchGameListBean;I)V

    return-void
.end method

.method static synthetic J0(Lcom/join/mgps/fragment/SearchGameListFragment_;ZLcom/join/mgps/dto/DomainInfoBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/fragment/SearchGameListFragment;->u0(ZLcom/join/mgps/dto/DomainInfoBean;)V

    return-void
.end method

.method static synthetic K0(Lcom/join/mgps/fragment/SearchGameListFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/SearchGameListFragment;->T(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic L0(Lcom/join/mgps/fragment/SearchGameListFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/SearchGameListFragment;->showLoadingView()V

    return-void
.end method

.method static synthetic M0(Lcom/join/mgps/fragment/SearchGameListFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/SearchGameListFragment;->showLoadFailed(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic N0(Lcom/join/mgps/fragment/SearchGameListFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/SearchGameListFragment;->hideLoading()V

    return-void
.end method

.method public static O0()Lcom/join/mgps/fragment/SearchGameListFragment_$p;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/SearchGameListFragment_$p;

    invoke-direct {v0}, Lcom/join/mgps/fragment/SearchGameListFragment_$p;-><init>()V

    return-object v0
.end method

.method private P0()V
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

    iput v1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->k:I

    :cond_0
    const-string v1, "game_id"

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->l:Ljava/lang/String;

    :cond_1
    const-string v1, "keyword"

    .line 6
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 7
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->m:Ljava/lang/String;

    :cond_2
    return-void
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/fragment/SearchGameListFragment_;->P0()V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment_;->L:Landroid/content/IntentFilter;

    const-string v0, "com.broadcast.bespeak.sussess"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method T(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/SearchGameListFragment_$a;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/SearchGameListFragment_$a;-><init>(Lcom/join/mgps/fragment/SearchGameListFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method e0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/SearchGameListFragment_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/SearchGameListFragment_$j;-><init>(Lcom/join/mgps/fragment/SearchGameListFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x1f4

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
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment_;->K:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method hideLoading()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/SearchGameListFragment_$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/SearchGameListFragment_$d;-><init>(Lcom/join/mgps/fragment/SearchGameListFragment_;)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment_;->J:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method j0(IZ)V
    .locals 9

    .line 1
    new-instance v8, Lcom/join/mgps/fragment/SearchGameListFragment_$e;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v8

    move-object v1, p0

    move v6, p1

    move v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/join/mgps/fragment/SearchGameListFragment_$e;-><init>(Lcom/join/mgps/fragment/SearchGameListFragment_;Ljava/lang/String;JLjava/lang/String;IZ)V

    invoke-static {v8}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment_;->I:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/SearchGameListFragment_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/fragment/SearchGameListFragment_;->M:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lcom/join/mgps/fragment/SearchGameListFragment_;->L:Landroid/content/IntentFilter;

    invoke-virtual {p1, v1, v2}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 5
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p3

    iput-object p3, p0, Lcom/join/mgps/fragment/SearchGameListFragment_;->J:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c0299

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment_;->J:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment_;->J:Landroid/view/View;

    return-object p1
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/SearchGameListFragment_;->M:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 2
    invoke-super {p0}, Lcom/join/mgps/fragment/SearchGameListFragment;->onDestroy()V

    return-void
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment_;->J:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->c:Landroid/view/View;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->d:Landroid/view/View;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->e:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 7
    iput-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->f:Landroid/widget/ImageView;

    .line 8
    iput-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->g:Landroid/widget/TextView;

    .line 9
    iput-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->y:Landroid/view/View;

    .line 10
    iput-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->z:Landroid/view/View;

    .line 11
    iput-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->A:Landroid/view/View;

    .line 12
    iput-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->B:Landroid/widget/TextView;

    .line 13
    iput-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->C:Landroid/widget/TextView;

    .line 14
    iput-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->D:Landroid/widget/TextView;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 1

    const v0, 0x7f0911d5

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    iput-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView;

    const v0, 0x7f09177b

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->c:Landroid/view/View;

    const v0, 0x7f09177c

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->d:Landroid/view/View;

    const v0, 0x7f09120b

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->e:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f09078d

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->f:Landroid/widget/ImageView;

    const v0, 0x7f090ea1

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->g:Landroid/widget/TextView;

    const v0, 0x7f090d82

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->y:Landroid/view/View;

    const v0, 0x7f090d7f

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->z:Landroid/view/View;

    const v0, 0x7f09110c

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->A:Landroid/view/View;

    const v0, 0x7f090553

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->B:Landroid/widget/TextView;

    const v0, 0x7f091265

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->C:Landroid/widget/TextView;

    const v0, 0x7f091261

    .line 12
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->D:Landroid/widget/TextView;

    .line 13
    iget-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->A:Landroid/view/View;

    if-eqz p1, :cond_0

    .line 14
    new-instance v0, Lcom/join/mgps/fragment/SearchGameListFragment_$h;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/SearchGameListFragment_$h;-><init>(Lcom/join/mgps/fragment/SearchGameListFragment_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment;->D:Landroid/widget/TextView;

    if-eqz p1, :cond_1

    .line 16
    new-instance v0, Lcom/join/mgps/fragment/SearchGameListFragment_$i;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/SearchGameListFragment_$i;-><init>(Lcom/join/mgps/fragment/SearchGameListFragment_;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SearchGameListFragment;->afterViews()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment_;->I:La4/c;

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
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment_;->K:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method q0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/SearchGameListFragment_$f;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/SearchGameListFragment_$f;-><init>(Lcom/join/mgps/fragment/SearchGameListFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method s0(Lcom/join/mgps/dto/SearchGameListBean;I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/SearchGameListFragment_$n;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/fragment/SearchGameListFragment_$n;-><init>(Lcom/join/mgps/fragment/SearchGameListFragment_;Lcom/join/mgps/dto/SearchGameListBean;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLoadFailed(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/SearchGameListFragment_$c;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/SearchGameListFragment_$c;-><init>(Lcom/join/mgps/fragment/SearchGameListFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLoadingView()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/SearchGameListFragment_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/SearchGameListFragment_$b;-><init>(Lcom/join/mgps/fragment/SearchGameListFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method t0(Ljava/util/List;ZZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            ">;ZZ)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/SearchGameListFragment_$m;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/join/mgps/fragment/SearchGameListFragment_$m;-><init>(Lcom/join/mgps/fragment/SearchGameListFragment_;Ljava/util/List;ZZ)V

    const-string p1, ""

    const-wide/16 p2, 0x0

    invoke-static {p1, v0, p2, p3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method u0(ZLcom/join/mgps/dto/DomainInfoBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/SearchGameListFragment_$o;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/fragment/SearchGameListFragment_$o;-><init>(Lcom/join/mgps/fragment/SearchGameListFragment_;ZLcom/join/mgps/dto/DomainInfoBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method v0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/SearchGameListFragment_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/SearchGameListFragment_$k;-><init>(Lcom/join/mgps/fragment/SearchGameListFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method w0(Ljava/lang/String;I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/SearchGameListFragment_$l;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/fragment/SearchGameListFragment_$l;-><init>(Lcom/join/mgps/fragment/SearchGameListFragment_;Ljava/lang/String;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
