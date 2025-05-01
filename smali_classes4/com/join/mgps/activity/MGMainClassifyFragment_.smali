.class public final Lcom/join/mgps/activity/MGMainClassifyFragment_;
.super Lcom/join/mgps/activity/MGMainClassifyFragment;
.source "MGMainClassifyFragment_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/MGMainClassifyFragment_$o;
    }
.end annotation


# instance fields
.field private final J:La4/c;

.field private K:Landroid/view/View;

.field private final L:Ljava/util/Map;
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
    invoke-direct {p0}, Lcom/join/mgps/activity/MGMainClassifyFragment;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/MGMainClassifyFragment_;->J:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/MGMainClassifyFragment_;->L:Ljava/util/Map;

    return-void
.end method

.method static synthetic A0(Lcom/join/mgps/activity/MGMainClassifyFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MGMainClassifyFragment;->q0()V

    return-void
.end method

.method static synthetic B0(Lcom/join/mgps/activity/MGMainClassifyFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MGMainClassifyFragment;->p0()V

    return-void
.end method

.method static synthetic C0(Lcom/join/mgps/activity/MGMainClassifyFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MGMainClassifyFragment;->f0()V

    return-void
.end method

.method public static D0()Lcom/join/mgps/activity/MGMainClassifyFragment_$o;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MGMainClassifyFragment_$o;

    invoke-direct {v0}, Lcom/join/mgps/activity/MGMainClassifyFragment_$o;-><init>()V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/join/mgps/activity/MGMainClassifyFragment;->E:Lcom/join/mgps/pref/PrefDef_;

    .line 2
    invoke-static {p0}, La4/c;->b(La4/b;)V

    return-void
.end method

.method static synthetic t0(Lcom/join/mgps/activity/MGMainClassifyFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MGMainClassifyFragment;->l0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic u0(Lcom/join/mgps/activity/MGMainClassifyFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MGMainClassifyFragment;->n0()V

    return-void
.end method

.method static synthetic v0(Lcom/join/mgps/activity/MGMainClassifyFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MGMainClassifyFragment;->k0()V

    return-void
.end method

.method static synthetic w0(Lcom/join/mgps/activity/MGMainClassifyFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/MGMainClassifyFragment;->r0()V

    return-void
.end method

.method static synthetic x0(Lcom/join/mgps/activity/MGMainClassifyFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MGMainClassifyFragment;->m0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic y0(Lcom/join/mgps/activity/MGMainClassifyFragment_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MGMainClassifyFragment;->j0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic z0(Lcom/join/mgps/activity/MGMainClassifyFragment_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/MGMainClassifyFragment;->o0(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method f0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/MGMainClassifyFragment_$e;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/MGMainClassifyFragment_$e;-><init>(Lcom/join/mgps/activity/MGMainClassifyFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/MGMainClassifyFragment_;->L:Ljava/util/Map;

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
    iget-object v0, p0, Lcom/join/mgps/activity/MGMainClassifyFragment_;->K:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method j0(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MGMainClassifyFragment_$a;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MGMainClassifyFragment_$a;-><init>(Lcom/join/mgps/activity/MGMainClassifyFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x3e8

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method k0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MGMainClassifyFragment_$l;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MGMainClassifyFragment_$l;-><init>(Lcom/join/mgps/activity/MGMainClassifyFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x3e8

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method l0(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MGMainClassifyFragment_$j;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MGMainClassifyFragment_$j;-><init>(Lcom/join/mgps/activity/MGMainClassifyFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method m0(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MGMainClassifyFragment_$n;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MGMainClassifyFragment_$n;-><init>(Lcom/join/mgps/activity/MGMainClassifyFragment_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x1f4

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method n0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MGMainClassifyFragment_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MGMainClassifyFragment_$k;-><init>(Lcom/join/mgps/activity/MGMainClassifyFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x1f4

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method o0(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CategorySimpleBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MGMainClassifyFragment_$b;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/MGMainClassifyFragment_$b;-><init>(Lcom/join/mgps/activity/MGMainClassifyFragment_;Ljava/util/List;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MGMainClassifyFragment_;->J:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/MGMainClassifyFragment_;->init_(Landroid/os/Bundle;)V

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

    iput-object p3, p0, Lcom/join/mgps/activity/MGMainClassifyFragment_;->K:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c0679

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/MGMainClassifyFragment_;->K:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/MGMainClassifyFragment_;->K:Landroid/view/View;

    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/activity/MGMainClassifyFragment_;->K:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/activity/MGMainClassifyFragment;->s:Landroid/widget/LinearLayout;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/activity/MGMainClassifyFragment;->t:Landroid/widget/LinearLayout;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/activity/MGMainClassifyFragment;->u:Landroid/widget/LinearLayout;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/activity/MGMainClassifyFragment;->v:Lcom/join/mgps/customview/MViewpagerV4;

    .line 7
    iput-object v0, p0, Lcom/join/mgps/activity/MGMainClassifyFragment;->w:Lcom/join/mgps/customview/SlidingTabLayout;

    .line 8
    iput-object v0, p0, Lcom/join/mgps/activity/MGMainClassifyFragment;->x:Landroid/widget/ToggleButton;

    .line 9
    iput-object v0, p0, Lcom/join/mgps/activity/MGMainClassifyFragment;->y:Landroid/widget/TextView;

    .line 10
    iput-object v0, p0, Lcom/join/mgps/activity/MGMainClassifyFragment;->z:Landroid/widget/TextView;

    .line 11
    iput-object v0, p0, Lcom/join/mgps/activity/MGMainClassifyFragment;->A:Landroid/widget/LinearLayout;

    .line 12
    iput-object v0, p0, Lcom/join/mgps/activity/MGMainClassifyFragment;->B:Landroid/widget/ToggleButton;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 3

    const v0, 0x7f090c85

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/MGMainClassifyFragment;->s:Landroid/widget/LinearLayout;

    const v0, 0x7f090d82

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/MGMainClassifyFragment;->t:Landroid/widget/LinearLayout;

    const v0, 0x7f090d7f

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/MGMainClassifyFragment;->u:Landroid/widget/LinearLayout;

    const v0, 0x7f090dbb

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/MViewpagerV4;

    iput-object v0, p0, Lcom/join/mgps/activity/MGMainClassifyFragment;->v:Lcom/join/mgps/customview/MViewpagerV4;

    const v0, 0x7f090db6

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/SlidingTabLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/MGMainClassifyFragment;->w:Lcom/join/mgps/customview/SlidingTabLayout;

    const v0, 0x7f09149b

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ToggleButton;

    iput-object v0, p0, Lcom/join/mgps/activity/MGMainClassifyFragment;->x:Landroid/widget/ToggleButton;

    const v0, 0x7f090141

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MGMainClassifyFragment;->y:Landroid/widget/TextView;

    const v0, 0x7f091199

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/MGMainClassifyFragment;->z:Landroid/widget/TextView;

    const v0, 0x7f091219

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/MGMainClassifyFragment;->A:Landroid/widget/LinearLayout;

    const v0, 0x7f09149c

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ToggleButton;

    iput-object v0, p0, Lcom/join/mgps/activity/MGMainClassifyFragment;->B:Landroid/widget/ToggleButton;

    const v0, 0x7f090146

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f091261

    .line 12
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f09110c

    .line 13
    invoke-interface {p1, v2}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz v0, :cond_0

    .line 14
    new-instance v2, Lcom/join/mgps/activity/MGMainClassifyFragment_$f;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/MGMainClassifyFragment_$f;-><init>(Lcom/join/mgps/activity/MGMainClassifyFragment_;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz v1, :cond_1

    .line 15
    new-instance v0, Lcom/join/mgps/activity/MGMainClassifyFragment_$g;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MGMainClassifyFragment_$g;-><init>(Lcom/join/mgps/activity/MGMainClassifyFragment_;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    if-eqz p1, :cond_2

    .line 16
    new-instance v0, Lcom/join/mgps/activity/MGMainClassifyFragment_$h;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MGMainClassifyFragment_$h;-><init>(Lcom/join/mgps/activity/MGMainClassifyFragment_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/activity/MGMainClassifyFragment;->A:Landroid/widget/LinearLayout;

    if-eqz p1, :cond_3

    .line 18
    new-instance v0, Lcom/join/mgps/activity/MGMainClassifyFragment_$i;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MGMainClassifyFragment_$i;-><init>(Lcom/join/mgps/activity/MGMainClassifyFragment_;)V

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    :cond_3
    invoke-virtual {p0}, Lcom/join/mgps/activity/MGMainClassifyFragment;->afterViews()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/MGMainClassifyFragment_;->J:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method p0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MGMainClassifyFragment_$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MGMainClassifyFragment_$d;-><init>(Lcom/join/mgps/activity/MGMainClassifyFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/MGMainClassifyFragment_;->L:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method q0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MGMainClassifyFragment_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MGMainClassifyFragment_$c;-><init>(Lcom/join/mgps/activity/MGMainClassifyFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method r0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/MGMainClassifyFragment_$m;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/MGMainClassifyFragment_$m;-><init>(Lcom/join/mgps/activity/MGMainClassifyFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
