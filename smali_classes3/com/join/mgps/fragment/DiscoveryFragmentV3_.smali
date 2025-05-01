.class public final Lcom/join/mgps/fragment/DiscoveryFragmentV3_;
.super Lcom/join/mgps/fragment/DiscoveryFragmentV3;
.source "DiscoveryFragmentV3_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/DiscoveryFragmentV3_$y;
    }
.end annotation


# instance fields
.field private final V:La4/c;

.field private W:Landroid/view/View;

.field private final X:Ljava/util/Map;
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
    invoke-direct {p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV3;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3_;->V:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3_;->X:Ljava/util/Map;

    return-void
.end method

.method static synthetic M0(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->E0()V

    return-void
.end method

.method static synthetic N0(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->F0()V

    return-void
.end method

.method static synthetic O0(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->showMessage(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic P0(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->G0()V

    return-void
.end method

.method static synthetic Q0(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->updateDownloadView()V

    return-void
.end method

.method static synthetic R0(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->z0(I)V

    return-void
.end method

.method static synthetic S0(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->t0()V

    return-void
.end method

.method static synthetic T0(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->loadData()V

    return-void
.end method

.method static synthetic U0(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->u0(I)V

    return-void
.end method

.method static synthetic V0(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->s0()V

    return-void
.end method

.method static synthetic W0(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->getDownloadTaskInfo()V

    return-void
.end method

.method static synthetic X0(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->H0(Ljava/util/List;)V

    return-void
.end method

.method static synthetic Y0(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->x0()V

    return-void
.end method

.method static synthetic Z0(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->v0()V

    return-void
.end method

.method static synthetic a1(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->y0()V

    return-void
.end method

.method static synthetic b1(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;Lcom/join/mgps/dto/EndGameNameBean;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->K0(Lcom/join/mgps/dto/EndGameNameBean;I)V

    return-void
.end method

.method static synthetic c1(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->J0(Ljava/util/List;)V

    return-void
.end method

.method static synthetic d1(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->o0()V

    return-void
.end method

.method static synthetic e1(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;Lcom/join/mgps/dto/DiscoveryMainDataBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->I0(Lcom/join/mgps/dto/DiscoveryMainDataBean;)V

    return-void
.end method

.method public static f1()Lcom/join/mgps/fragment/DiscoveryFragmentV3_$y;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$y;

    invoke-direct {v0}, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$y;-><init>()V

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

    iput-object p1, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->l:Lcom/join/mgps/Util/b;

    return-void
.end method


# virtual methods
.method E0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$u;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$u;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method F0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$g;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$g;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method G0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$h;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$h;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method H0(Ljava/util/List;)V
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
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$w;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$w;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;Ljava/util/List;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method I0(Lcom/join/mgps/dto/DiscoveryMainDataBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$f;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$f;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;Lcom/join/mgps/dto/DiscoveryMainDataBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method J0(Ljava/util/List;)V
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
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$d;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$d;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;Ljava/util/List;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method K0(Lcom/join/mgps/dto/EndGameNameBean;I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$c;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$c;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;Lcom/join/mgps/dto/EndGameNameBean;I)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3_;->X:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method getDownloadTaskInfo()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$p;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$p;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;Ljava/lang/String;JLjava/lang/String;)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3_;->W:Landroid/view/View;

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
    new-instance v6, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$m;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$m;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method o0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$e;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3_;->V:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/DiscoveryFragmentV3_;->init_(Landroid/os/Bundle;)V

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

    iput-object p3, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3_;->W:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c025f

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3_;->W:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3_;->W:Landroid/view/View;

    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3_;->W:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->b:Landroid/widget/RelativeLayout;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->c:Landroid/widget/RelativeLayout;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->d:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->e:Landroid/widget/LinearLayout;

    .line 7
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->f:Landroid/widget/LinearLayout;

    .line 8
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->g:Lcom/join/mgps/customview/XListView2;

    .line 9
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->h:Landroid/widget/ImageView;

    .line 10
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->i:Landroid/widget/TextView;

    .line 11
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->j:Landroid/view/View;

    .line 12
    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->k:Lcom/join/mgps/customview/CustomerDownloadView;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 2

    const v0, 0x7f090024

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->b:Landroid/widget/RelativeLayout;

    const v0, 0x7f09043e

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->c:Landroid/widget/RelativeLayout;

    const v0, 0x7f090db3

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->d:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    const v0, 0x7f090d82

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->e:Landroid/widget/LinearLayout;

    const v0, 0x7f090d7f

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->f:Landroid/widget/LinearLayout;

    const v0, 0x7f090c91

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/XListView2;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->g:Lcom/join/mgps/customview/XListView2;

    const v0, 0x7f09043f

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->h:Landroid/widget/ImageView;

    const v0, 0x7f090440

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->i:Landroid/widget/TextView;

    const v0, 0x7f09132b

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->j:Landroid/view/View;

    const v0, 0x7f090489

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/CustomerDownloadView;

    iput-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->k:Lcom/join/mgps/customview/CustomerDownloadView;

    const v0, 0x7f091261

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    .line 12
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->b:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_0

    .line 13
    new-instance v1, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$k;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$k;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->e:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    .line 15
    new-instance v1, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$q;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$q;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    if-eqz p1, :cond_2

    .line 16
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$r;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$r;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->f:Landroid/widget/LinearLayout;

    if-eqz p1, :cond_3

    .line 18
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$s;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$s;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;)V

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    :cond_3
    iget-object p1, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->k:Lcom/join/mgps/customview/CustomerDownloadView;

    if-eqz p1, :cond_4

    .line 20
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$t;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$t;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;)V

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 21
    :cond_4
    invoke-virtual {p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->afterViews()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3_;->V:La4/c;

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
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3_;->X:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method s0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$o;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$o;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method showMessage(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$v;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$v;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method t0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$l;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$l;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method u0(I)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$n;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$n;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;Ljava/lang/String;JLjava/lang/String;I)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method updateDownloadView()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$i;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$i;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method v0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$a;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method x0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$x;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$x;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method y0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$b;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method z0(I)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$j;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/fragment/DiscoveryFragmentV3_$j;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV3_;Ljava/lang/String;JLjava/lang/String;I)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method
