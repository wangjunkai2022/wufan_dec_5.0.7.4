.class public final Lcom/join/mgps/fragment/CollectionThreeSubFragment_;
.super Lcom/join/mgps/fragment/CollectionThreeSubFragment;
.source "CollectionThreeSubFragment_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/CollectionThreeSubFragment_$h;
    }
.end annotation


# instance fields
.field private final q:La4/c;

.field private r:Landroid/view/View;

.field private final s:Ljava/util/Map;
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

.field private final t:Landroid/content/IntentFilter;

.field private final u:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/fragment/CollectionThreeSubFragment;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/CollectionThreeSubFragment_;->q:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/CollectionThreeSubFragment_;->s:Ljava/util/Map;

    .line 4
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/CollectionThreeSubFragment_;->t:Landroid/content/IntentFilter;

    .line 5
    new-instance v0, Lcom/join/mgps/fragment/CollectionThreeSubFragment_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CollectionThreeSubFragment_$a;-><init>(Lcom/join/mgps/fragment/CollectionThreeSubFragment_;)V

    iput-object v0, p0, Lcom/join/mgps/fragment/CollectionThreeSubFragment_;->u:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic a0(Lcom/join/mgps/fragment/CollectionThreeSubFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/CollectionThreeSubFragment;->Z()V

    return-void
.end method

.method static synthetic b0(Lcom/join/mgps/fragment/CollectionThreeSubFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/CollectionThreeSubFragment;->showProgress()V

    return-void
.end method

.method static synthetic c0(Lcom/join/mgps/fragment/CollectionThreeSubFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/CollectionThreeSubFragment;->showInstallButn()V

    return-void
.end method

.method static synthetic d0(Lcom/join/mgps/fragment/CollectionThreeSubFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/CollectionThreeSubFragment;->updateButn()V

    return-void
.end method

.method public static e0()Lcom/join/mgps/fragment/CollectionThreeSubFragment_$h;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CollectionThreeSubFragment_$h;

    invoke-direct {v0}, Lcom/join/mgps/fragment/CollectionThreeSubFragment_$h;-><init>()V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/CollectionThreeSubFragment_;->t:Landroid/content/IntentFilter;

    const-string v0, "com.join.android.app.mgsim.wufun.broadcast.refreshMyGame"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/fragment/CollectionThreeSubFragment_;->t:Landroid/content/IntentFilter;

    const-string v0, "com.join.android.app.mgsim.wufun.broadcast.paygamefinish"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method Z()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CollectionThreeSubFragment_$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CollectionThreeSubFragment_$d;-><init>(Lcom/join/mgps/fragment/CollectionThreeSubFragment_;)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/CollectionThreeSubFragment_;->s:Ljava/util/Map;

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
    iget-object v0, p0, Lcom/join/mgps/fragment/CollectionThreeSubFragment_;->r:Landroid/view/View;

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
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CollectionThreeSubFragment_;->q:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/CollectionThreeSubFragment_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/fragment/CollectionThreeSubFragment_;->u:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lcom/join/mgps/fragment/CollectionThreeSubFragment_;->t:Landroid/content/IntentFilter;

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

    iput-object p3, p0, Lcom/join/mgps/fragment/CollectionThreeSubFragment_;->r:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c013f

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/CollectionThreeSubFragment_;->r:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/CollectionThreeSubFragment_;->r:Landroid/view/View;

    return-object p1
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/CollectionThreeSubFragment_;->u:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 2
    invoke-super {p0}, Lcom/join/mgps/fragment/CollectionThreeSubFragment;->onDestroy()V

    return-void
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/fragment/CollectionThreeSubFragment_;->r:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/fragment/CollectionThreeSubFragment;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/fragment/CollectionThreeSubFragment;->c:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/fragment/CollectionThreeSubFragment;->d:Landroid/widget/TextView;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/fragment/CollectionThreeSubFragment;->e:Landroid/widget/TextView;

    .line 7
    iput-object v0, p0, Lcom/join/mgps/fragment/CollectionThreeSubFragment;->f:Landroid/widget/Button;

    .line 8
    iput-object v0, p0, Lcom/join/mgps/fragment/CollectionThreeSubFragment;->g:Landroid/widget/RelativeLayout;

    .line 9
    iput-object v0, p0, Lcom/join/mgps/fragment/CollectionThreeSubFragment;->h:Landroid/widget/LinearLayout;

    .line 10
    iput-object v0, p0, Lcom/join/mgps/fragment/CollectionThreeSubFragment;->i:Landroid/widget/ImageView;

    .line 11
    iput-object v0, p0, Lcom/join/mgps/fragment/CollectionThreeSubFragment;->j:Landroid/widget/TextView;

    .line 12
    iput-object v0, p0, Lcom/join/mgps/fragment/CollectionThreeSubFragment;->k:Landroid/widget/ProgressBar;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 1

    const v0, 0x7f090816

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/join/mgps/fragment/CollectionThreeSubFragment;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f090819

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/join/mgps/fragment/CollectionThreeSubFragment;->c:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f09151d

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/CollectionThreeSubFragment;->d:Landroid/widget/TextView;

    const v0, 0x7f091522

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/CollectionThreeSubFragment;->e:Landroid/widget/TextView;

    const v0, 0x7f090879

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/join/mgps/fragment/CollectionThreeSubFragment;->f:Landroid/widget/Button;

    const v0, 0x7f09105f

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/CollectionThreeSubFragment;->g:Landroid/widget/RelativeLayout;

    const v0, 0x7f09087a

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/CollectionThreeSubFragment;->h:Landroid/widget/LinearLayout;

    const v0, 0x7f09027e

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/fragment/CollectionThreeSubFragment;->i:Landroid/widget/ImageView;

    const v0, 0x7f090ff0

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/CollectionThreeSubFragment;->j:Landroid/widget/TextView;

    const v0, 0x7f09027d

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/join/mgps/fragment/CollectionThreeSubFragment;->k:Landroid/widget/ProgressBar;

    const v0, 0x7f09105e

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 12
    new-instance v0, Lcom/join/mgps/fragment/CollectionThreeSubFragment_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CollectionThreeSubFragment_$b;-><init>(Lcom/join/mgps/fragment/CollectionThreeSubFragment_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 13
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/CollectionThreeSubFragment;->f:Landroid/widget/Button;

    if-eqz p1, :cond_1

    .line 14
    new-instance v0, Lcom/join/mgps/fragment/CollectionThreeSubFragment_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CollectionThreeSubFragment_$c;-><init>(Lcom/join/mgps/fragment/CollectionThreeSubFragment_;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/CollectionThreeSubFragment;->afterViews()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/CollectionThreeSubFragment_;->q:La4/c;

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
    iget-object v0, p0, Lcom/join/mgps/fragment/CollectionThreeSubFragment_;->s:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method showInstallButn()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CollectionThreeSubFragment_$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CollectionThreeSubFragment_$f;-><init>(Lcom/join/mgps/fragment/CollectionThreeSubFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showProgress()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CollectionThreeSubFragment_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CollectionThreeSubFragment_$e;-><init>(Lcom/join/mgps/fragment/CollectionThreeSubFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method updateButn()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/CollectionThreeSubFragment_$g;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CollectionThreeSubFragment_$g;-><init>(Lcom/join/mgps/fragment/CollectionThreeSubFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
