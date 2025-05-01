.class public final Lcom/join/mgps/fragment/DiscoveryFragmentV4_;
.super Lcom/join/mgps/fragment/DiscoveryFragmentV4;
.source "DiscoveryFragmentV4_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/DiscoveryFragmentV4_$u;
    }
.end annotation


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


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV4;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4_;->I:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4_;->K:Ljava/util/Map;

    return-void
.end method

.method static synthetic A0(Lcom/join/mgps/fragment/DiscoveryFragmentV4_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->k0()V

    return-void
.end method

.method static synthetic B0(Lcom/join/mgps/fragment/DiscoveryFragmentV4_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->showMessage(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic C0(Lcom/join/mgps/fragment/DiscoveryFragmentV4_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->j0()V

    return-void
.end method

.method static synthetic D0(Lcom/join/mgps/fragment/DiscoveryFragmentV4_;Lcom/join/mgps/dto/DiscoveryHeaderMenuBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->p0(Lcom/join/mgps/dto/DiscoveryHeaderMenuBean;)V

    return-void
.end method

.method static synthetic E0(Lcom/join/mgps/fragment/DiscoveryFragmentV4_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->loadData()V

    return-void
.end method

.method static synthetic F0(Lcom/join/mgps/fragment/DiscoveryFragmentV4_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->getDownloadTaskInfo()V

    return-void
.end method

.method static synthetic G0(Lcom/join/mgps/fragment/DiscoveryFragmentV4_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->x0(Ljava/util/List;)V

    return-void
.end method

.method static synthetic H0(Lcom/join/mgps/fragment/DiscoveryFragmentV4_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->v0(Ljava/util/List;)V

    return-void
.end method

.method static synthetic I0(Lcom/join/mgps/fragment/DiscoveryFragmentV4_;Lcom/join/mgps/dto/DiscoveryMainDataBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->w0(Lcom/join/mgps/dto/DiscoveryMainDataBean;)V

    return-void
.end method

.method static synthetic J0(Lcom/join/mgps/fragment/DiscoveryFragmentV4_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->showMain()V

    return-void
.end method

.method static synthetic K0(Lcom/join/mgps/fragment/DiscoveryFragmentV4_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->t0()V

    return-void
.end method

.method static synthetic L0(Lcom/join/mgps/fragment/DiscoveryFragmentV4_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->u0()V

    return-void
.end method

.method static synthetic M0(Lcom/join/mgps/fragment/DiscoveryFragmentV4_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->updateDownloadView()V

    return-void
.end method

.method static synthetic N0(Lcom/join/mgps/fragment/DiscoveryFragmentV4_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->m0(I)V

    return-void
.end method

.method public static O0()Lcom/join/mgps/fragment/DiscoveryFragmentV4_$u;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$u;

    invoke-direct {v0}, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$u;-><init>()V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->l:Lcom/join/mgps/Util/b;

    return-void
.end method

.method static synthetic z0(Lcom/join/mgps/fragment/DiscoveryFragmentV4_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->s0()V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4_;->K:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method getDownloadTaskInfo()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$l;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$l;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV4_;Ljava/lang/String;JLjava/lang/String;)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4_;->J:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method j0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$h;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$h;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV4_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method k0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$g;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$g;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV4_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method loadData()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$j;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$j;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV4_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method m0(I)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$f;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$f;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV4_;Ljava/lang/String;JLjava/lang/String;I)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4_;->I:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/DiscoveryFragmentV4_;->init_(Landroid/os/Bundle;)V

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

    iput-object p3, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4_;->J:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c025f

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4_;->J:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4_;->J:Landroid/view/View;

    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4_;->J:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->b:Landroid/widget/RelativeLayout;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->c:Landroid/widget/RelativeLayout;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->d:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->e:Landroid/widget/LinearLayout;

    .line 7
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->f:Landroid/widget/LinearLayout;

    .line 8
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->g:Lcom/join/mgps/customview/XListView2;

    .line 9
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->h:Landroid/widget/ImageView;

    .line 10
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->i:Landroid/widget/TextView;

    .line 11
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->j:Landroid/view/View;

    .line 12
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->k:Lcom/join/mgps/customview/CustomerDownloadView;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 2

    const v0, 0x7f090024

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->b:Landroid/widget/RelativeLayout;

    const v0, 0x7f09043e

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->c:Landroid/widget/RelativeLayout;

    const v0, 0x7f090db3

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->d:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    const v0, 0x7f090d82

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->e:Landroid/widget/LinearLayout;

    const v0, 0x7f090d7f

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->f:Landroid/widget/LinearLayout;

    const v0, 0x7f090c91

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/XListView2;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->g:Lcom/join/mgps/customview/XListView2;

    const v0, 0x7f09043f

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->h:Landroid/widget/ImageView;

    const v0, 0x7f090440

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->i:Landroid/widget/TextView;

    const v0, 0x7f09132b

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->j:Landroid/view/View;

    const v0, 0x7f090489

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/CustomerDownloadView;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->k:Lcom/join/mgps/customview/CustomerDownloadView;

    const v0, 0x7f091261

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    .line 12
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->b:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_0

    .line 13
    new-instance v1, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$k;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$k;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV4_;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->e:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    .line 15
    new-instance v1, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$m;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$m;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV4_;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    if-eqz p1, :cond_2

    .line 16
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$n;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$n;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV4_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->f:Landroid/widget/LinearLayout;

    if-eqz p1, :cond_3

    .line 18
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$o;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$o;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV4_;)V

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    :cond_3
    iget-object p1, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->k:Lcom/join/mgps/customview/CustomerDownloadView;

    if-eqz p1, :cond_4

    .line 20
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$p;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$p;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV4_;)V

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 21
    :cond_4
    invoke-virtual {p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV4;->afterViews()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4_;->I:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method p0(Lcom/join/mgps/dto/DiscoveryHeaderMenuBean;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$i;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$i;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV4_;Ljava/lang/String;JLjava/lang/String;Lcom/join/mgps/dto/DiscoveryHeaderMenuBean;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4_;->K:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method s0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$q;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$q;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV4_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showMain()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$b;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV4_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showMessage(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$r;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$r;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV4_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method t0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$c;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV4_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method u0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$d;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV4_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method updateDownloadView()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$e;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV4_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method v0(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/ForumBean$ForumPostsBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$t;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$t;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV4_;Ljava/util/List;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method w0(Lcom/join/mgps/dto/DiscoveryMainDataBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$a;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$a;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV4_;Lcom/join/mgps/dto/DiscoveryMainDataBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method x0(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/DiscoveryHeaderMenuBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$s;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/DiscoveryFragmentV4_$s;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV4_;Ljava/util/List;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
