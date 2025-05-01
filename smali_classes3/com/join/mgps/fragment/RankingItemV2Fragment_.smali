.class public final Lcom/join/mgps/fragment/RankingItemV2Fragment_;
.super Lcom/join/mgps/fragment/RankingItemV2Fragment;
.source "RankingItemV2Fragment_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/RankingItemV2Fragment_$o;
    }
.end annotation


# instance fields
.field private final H:La4/c;

.field private I:Landroid/view/View;

.field private final J:Ljava/util/Map;
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

.field private final K:Landroid/content/IntentFilter;

.field private final L:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/fragment/RankingItemV2Fragment;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/RankingItemV2Fragment_;->H:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/RankingItemV2Fragment_;->J:Ljava/util/Map;

    .line 4
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/RankingItemV2Fragment_;->K:Landroid/content/IntentFilter;

    .line 5
    new-instance v0, Lcom/join/mgps/fragment/RankingItemV2Fragment_$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/RankingItemV2Fragment_$f;-><init>(Lcom/join/mgps/fragment/RankingItemV2Fragment_;)V

    iput-object v0, p0, Lcom/join/mgps/fragment/RankingItemV2Fragment_;->L:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic A0(Lcom/join/mgps/fragment/RankingItemV2Fragment_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/RankingItemV2Fragment;->showMain(Ljava/util/List;)V

    return-void
.end method

.method static synthetic B0(Lcom/join/mgps/fragment/RankingItemV2Fragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/RankingItemV2Fragment;->X()V

    return-void
.end method

.method static synthetic C0(Lcom/join/mgps/fragment/RankingItemV2Fragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/RankingItemV2Fragment;->showToast(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic D0(Lcom/join/mgps/fragment/RankingItemV2Fragment_;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/RankingItemV2Fragment;->q0(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    return-void
.end method

.method static synthetic E0(Lcom/join/mgps/fragment/RankingItemV2Fragment_;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/fragment/RankingItemV2Fragment;->c0(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic F0(Lcom/join/mgps/fragment/RankingItemV2Fragment_;Ljava/lang/String;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/fragment/RankingItemV2Fragment;->b0(Ljava/lang/String;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    return-void
.end method

.method public static G0()Lcom/join/mgps/fragment/RankingItemV2Fragment_$o;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/RankingItemV2Fragment_$o;

    invoke-direct {v0}, Lcom/join/mgps/fragment/RankingItemV2Fragment_$o;-><init>()V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/RankingItemV2Fragment_;->K:Landroid/content/IntentFilter;

    const-string v0, "com.join.android.app.mgsim.wufun.broadcast.refreshMyGame"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/fragment/RankingItemV2Fragment_;->K:Landroid/content/IntentFilter;

    const-string v0, "com.join.android.app.mgsim.wufun.broadcast.paygamefinish"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic y0(Lcom/join/mgps/fragment/RankingItemV2Fragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/RankingItemV2Fragment;->showLoding()V

    return-void
.end method

.method static synthetic z0(Lcom/join/mgps/fragment/RankingItemV2Fragment_;Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/RankingItemV2Fragment;->t0(Z)V

    return-void
.end method


# virtual methods
.method X()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/RankingItemV2Fragment_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/RankingItemV2Fragment_$a;-><init>(Lcom/join/mgps/fragment/RankingItemV2Fragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x190

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method b0(Ljava/lang/String;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V
    .locals 9

    .line 1
    new-instance v8, Lcom/join/mgps/fragment/RankingItemV2Fragment_$e;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v8

    move-object v1, p0

    move-object v6, p1

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/join/mgps/fragment/RankingItemV2Fragment_$e;-><init>(Lcom/join/mgps/fragment/RankingItemV2Fragment_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    invoke-static {v8}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method c0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    .line 1
    new-instance v8, Lcom/join/mgps/fragment/RankingItemV2Fragment_$d;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v8

    move-object v1, p0

    move-object v6, p1

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/join/mgps/fragment/RankingItemV2Fragment_$d;-><init>(Lcom/join/mgps/fragment/RankingItemV2Fragment_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v8}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/RankingItemV2Fragment_;->J:Ljava/util/Map;

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
    iget-object v0, p0, Lcom/join/mgps/fragment/RankingItemV2Fragment_;->I:Landroid/view/View;

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
    iget-object v0, p0, Lcom/join/mgps/fragment/RankingItemV2Fragment_;->H:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/RankingItemV2Fragment_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/fragment/RankingItemV2Fragment_;->L:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lcom/join/mgps/fragment/RankingItemV2Fragment_;->K:Landroid/content/IntentFilter;

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

    iput-object p3, p0, Lcom/join/mgps/fragment/RankingItemV2Fragment_;->I:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c0296

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/RankingItemV2Fragment_;->I:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/RankingItemV2Fragment_;->I:Landroid/view/View;

    return-object p1
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/RankingItemV2Fragment_;->L:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 2
    invoke-super {p0}, Lcom/join/mgps/fragment/RankingItemV2Fragment;->onDestroy()V

    return-void
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/fragment/RankingItemV2Fragment_;->I:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/fragment/RankingItemV2Fragment;->e:Landroid/widget/RelativeLayout;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/fragment/RankingItemV2Fragment;->f:Lcom/join/mgps/customview/XListView2;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/fragment/RankingItemV2Fragment;->g:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/fragment/RankingItemV2Fragment;->h:Landroid/widget/LinearLayout;

    .line 7
    iput-object v0, p0, Lcom/join/mgps/fragment/RankingItemV2Fragment;->i:Landroid/widget/LinearLayout;

    .line 8
    iput-object v0, p0, Lcom/join/mgps/fragment/RankingItemV2Fragment;->j:Landroid/widget/LinearLayout;

    .line 9
    iput-object v0, p0, Lcom/join/mgps/fragment/RankingItemV2Fragment;->k:Landroid/widget/ImageView;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 5

    const v0, 0x7f0911a6

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/RankingItemV2Fragment;->e:Landroid/widget/RelativeLayout;

    const v0, 0x7f090316

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/XListView2;

    iput-object v0, p0, Lcom/join/mgps/fragment/RankingItemV2Fragment;->f:Lcom/join/mgps/customview/XListView2;

    const v0, 0x7f090db3

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/RankingItemV2Fragment;->g:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    const v0, 0x7f090d82

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/RankingItemV2Fragment;->h:Landroid/widget/LinearLayout;

    const v0, 0x7f090d7f

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/RankingItemV2Fragment;->i:Landroid/widget/LinearLayout;

    const v0, 0x7f090d5a

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/RankingItemV2Fragment;->j:Landroid/widget/LinearLayout;

    const v0, 0x7f09110c

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/fragment/RankingItemV2Fragment;->k:Landroid/widget/ImageView;

    const v0, 0x7f090f11

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f090e20

    .line 9
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f091260

    .line 10
    invoke-interface {p1, v2}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v2

    const v3, 0x7f091261

    .line 11
    invoke-interface {p1, v3}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    .line 12
    iget-object v3, p0, Lcom/join/mgps/fragment/RankingItemV2Fragment;->k:Landroid/widget/ImageView;

    if-eqz v3, :cond_0

    .line 13
    new-instance v4, Lcom/join/mgps/fragment/RankingItemV2Fragment_$g;

    invoke-direct {v4, p0}, Lcom/join/mgps/fragment/RankingItemV2Fragment_$g;-><init>(Lcom/join/mgps/fragment/RankingItemV2Fragment_;)V

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz v0, :cond_1

    .line 14
    new-instance v3, Lcom/join/mgps/fragment/RankingItemV2Fragment_$h;

    invoke-direct {v3, p0}, Lcom/join/mgps/fragment/RankingItemV2Fragment_$h;-><init>(Lcom/join/mgps/fragment/RankingItemV2Fragment_;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    if-eqz v1, :cond_2

    .line 15
    new-instance v0, Lcom/join/mgps/fragment/RankingItemV2Fragment_$i;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/RankingItemV2Fragment_$i;-><init>(Lcom/join/mgps/fragment/RankingItemV2Fragment_;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    if-eqz v2, :cond_3

    .line 16
    new-instance v0, Lcom/join/mgps/fragment/RankingItemV2Fragment_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/RankingItemV2Fragment_$j;-><init>(Lcom/join/mgps/fragment/RankingItemV2Fragment_;)V

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    if-eqz p1, :cond_4

    .line 17
    new-instance v0, Lcom/join/mgps/fragment/RankingItemV2Fragment_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/RankingItemV2Fragment_$k;-><init>(Lcom/join/mgps/fragment/RankingItemV2Fragment_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 18
    :cond_4
    invoke-virtual {p0}, Lcom/join/mgps/fragment/RankingItemV2Fragment;->afterViews()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/RankingItemV2Fragment_;->H:La4/c;

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
    iget-object v0, p0, Lcom/join/mgps/fragment/RankingItemV2Fragment_;->J:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method q0(Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/RankingItemV2Fragment_$c;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/RankingItemV2Fragment_$c;-><init>(Lcom/join/mgps/fragment/RankingItemV2Fragment_;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLoding()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/RankingItemV2Fragment_$l;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/RankingItemV2Fragment_$l;-><init>(Lcom/join/mgps/fragment/RankingItemV2Fragment_;)V

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
            "Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/RankingItemV2Fragment_$n;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/RankingItemV2Fragment_$n;-><init>(Lcom/join/mgps/fragment/RankingItemV2Fragment_;Ljava/util/List;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showToast(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/RankingItemV2Fragment_$b;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/RankingItemV2Fragment_$b;-><init>(Lcom/join/mgps/fragment/RankingItemV2Fragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method t0(Z)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/RankingItemV2Fragment_$m;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/RankingItemV2Fragment_$m;-><init>(Lcom/join/mgps/fragment/RankingItemV2Fragment_;Z)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
