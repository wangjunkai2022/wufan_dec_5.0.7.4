.class public final Lcom/join/mgps/activity/UninstallWufunActivity_;
.super Lcom/join/mgps/activity/UninstallWufunActivity;
.source "UninstallWufunActivity_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/UninstallWufunActivity_$r;
    }
.end annotation


# instance fields
.field private final F:La4/c;

.field private final G:Ljava/util/Map;
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
    invoke-direct {p0}, Lcom/join/mgps/activity/UninstallWufunActivity;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunActivity_;->F:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunActivity_;->G:Ljava/util/Map;

    return-void
.end method

.method static synthetic A0(Lcom/join/mgps/activity/UninstallWufunActivity_;Lcom/join/mgps/dto/ResponseModel;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/UninstallWufunActivity;->u0(Lcom/join/mgps/dto/ResponseModel;)V

    return-void
.end method

.method static synthetic B0(Lcom/join/mgps/activity/UninstallWufunActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/UninstallWufunActivity;->o0()V

    return-void
.end method

.method static synthetic C0(Lcom/join/mgps/activity/UninstallWufunActivity_;Lcom/join/mgps/dto/UninstallGuessLikeBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/UninstallWufunActivity;->t0(Lcom/join/mgps/dto/UninstallGuessLikeBean;)V

    return-void
.end method

.method static synthetic D0(Lcom/join/mgps/activity/UninstallWufunActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/UninstallWufunActivity;->p0()V

    return-void
.end method

.method static synthetic E0(Lcom/join/mgps/activity/UninstallWufunActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/UninstallWufunActivity;->showLoding()V

    return-void
.end method

.method static synthetic F0(Lcom/join/mgps/activity/UninstallWufunActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/UninstallWufunActivity;->showLodingFailed()V

    return-void
.end method

.method static synthetic G0(Lcom/join/mgps/activity/UninstallWufunActivity_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/UninstallWufunActivity;->l0(Ljava/util/List;)V

    return-void
.end method

.method static synthetic H0(Lcom/join/mgps/activity/UninstallWufunActivity_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/UninstallWufunActivity;->h0(I)V

    return-void
.end method

.method public static I0(Landroid/content/Context;)Lcom/join/mgps/activity/UninstallWufunActivity_$r;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/UninstallWufunActivity_$r;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UninstallWufunActivity_$r;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static J0(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/UninstallWufunActivity_$r;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/UninstallWufunActivity_$r;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UninstallWufunActivity_$r;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    return-void
.end method

.method static synthetic x0(Lcom/join/mgps/activity/UninstallWufunActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/UninstallWufunActivity;->n0()V

    return-void
.end method

.method static synthetic y0(Lcom/join/mgps/activity/UninstallWufunActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/UninstallWufunActivity;->j0()V

    return-void
.end method

.method static synthetic z0(Lcom/join/mgps/activity/UninstallWufunActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/UninstallWufunActivity;->i0()V

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
    iget-object v0, p0, Lcom/join/mgps/activity/UninstallWufunActivity_;->G:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method h0(I)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/UninstallWufunActivity_$g;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/UninstallWufunActivity_$g;-><init>(Lcom/join/mgps/activity/UninstallWufunActivity_;Ljava/lang/String;JLjava/lang/String;I)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method i0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/UninstallWufunActivity_$p;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UninstallWufunActivity_$p;-><init>(Lcom/join/mgps/activity/UninstallWufunActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public internalFindViewById(I)Landroid/view/View;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method j0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/UninstallWufunActivity_$h;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/UninstallWufunActivity_$h;-><init>(Lcom/join/mgps/activity/UninstallWufunActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method l0(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v7, Lcom/join/mgps/activity/UninstallWufunActivity_$f;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/UninstallWufunActivity_$f;-><init>(Lcom/join/mgps/activity/UninstallWufunActivity_;Ljava/lang/String;JLjava/lang/String;Ljava/util/List;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method n0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/UninstallWufunActivity_$o;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UninstallWufunActivity_$o;-><init>(Lcom/join/mgps/activity/UninstallWufunActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method o0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/UninstallWufunActivity_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UninstallWufunActivity_$a;-><init>(Lcom/join/mgps/activity/UninstallWufunActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/UninstallWufunActivity_;->F:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/UninstallWufunActivity_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c00a4

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/UninstallWufunActivity_;->setContentView(I)V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 3

    const v0, 0x7f09132b

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunActivity;->b:Landroid/view/View;

    const v0, 0x7f090745

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunActivity;->c:Landroid/widget/RelativeLayout;

    const v0, 0x7f091489

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunActivity;->d:Landroid/widget/TextView;

    const v0, 0x7f09029d

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/cardview/widget/CardView;

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunActivity;->e:Landroidx/cardview/widget/CardView;

    const v0, 0x7f091500

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunActivity;->f:Landroid/widget/TextView;

    const v0, 0x7f0914ff

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunActivity;->g:Landroid/widget/TextView;

    const v0, 0x7f090cb6

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunActivity;->h:Landroid/widget/LinearLayout;

    const v0, 0x7f091580

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunActivity;->i:Landroid/widget/TextView;

    const v0, 0x7f09157f

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunActivity;->j:Landroid/widget/TextView;

    const v0, 0x7f0902ab

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/cardview/widget/CardView;

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunActivity;->k:Landroidx/cardview/widget/CardView;

    const v0, 0x7f0905a4

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunActivity;->l:Landroid/widget/FrameLayout;

    const v0, 0x7f090d82

    .line 12
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunActivity;->m:Landroid/view/View;

    const v0, 0x7f090d7f

    .line 13
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunActivity;->n:Landroid/view/View;

    const v0, 0x7f091520

    .line 14
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunActivity;->o:Landroid/widget/TextView;

    const v0, 0x7f0911c8

    .line 15
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunActivity;->p:Landroidx/recyclerview/widget/RecyclerView;

    const v0, 0x7f091519

    .line 16
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunActivity;->q:Landroid/widget/TextView;

    const v0, 0x7f091583

    .line 17
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunActivity;->r:Landroid/widget/TextView;

    const v0, 0x7f09153a

    .line 18
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/UninstallWufunActivity;->s:Landroid/widget/TextView;

    const v0, 0x7f091261

    .line 19
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f09110c

    .line 20
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f090146

    .line 21
    invoke-interface {p1, v2}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz v0, :cond_0

    .line 22
    new-instance v2, Lcom/join/mgps/activity/UninstallWufunActivity_$i;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/UninstallWufunActivity_$i;-><init>(Lcom/join/mgps/activity/UninstallWufunActivity_;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz v1, :cond_1

    .line 23
    new-instance v0, Lcom/join/mgps/activity/UninstallWufunActivity_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UninstallWufunActivity_$j;-><init>(Lcom/join/mgps/activity/UninstallWufunActivity_;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 24
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/UninstallWufunActivity;->g:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    .line 25
    new-instance v1, Lcom/join/mgps/activity/UninstallWufunActivity_$k;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/UninstallWufunActivity_$k;-><init>(Lcom/join/mgps/activity/UninstallWufunActivity_;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 26
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/UninstallWufunActivity;->q:Landroid/widget/TextView;

    if-eqz v0, :cond_3

    .line 27
    new-instance v1, Lcom/join/mgps/activity/UninstallWufunActivity_$l;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/UninstallWufunActivity_$l;-><init>(Lcom/join/mgps/activity/UninstallWufunActivity_;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    if-eqz p1, :cond_4

    .line 28
    new-instance v0, Lcom/join/mgps/activity/UninstallWufunActivity_$m;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UninstallWufunActivity_$m;-><init>(Lcom/join/mgps/activity/UninstallWufunActivity_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 29
    :cond_4
    iget-object p1, p0, Lcom/join/mgps/activity/UninstallWufunActivity;->r:Landroid/widget/TextView;

    if-eqz p1, :cond_5

    .line 30
    new-instance v0, Lcom/join/mgps/activity/UninstallWufunActivity_$n;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UninstallWufunActivity_$n;-><init>(Lcom/join/mgps/activity/UninstallWufunActivity_;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 31
    :cond_5
    invoke-virtual {p0}, Lcom/join/mgps/activity/UninstallWufunActivity;->afterviews()V

    return-void
.end method

.method p0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/UninstallWufunActivity_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UninstallWufunActivity_$c;-><init>(Lcom/join/mgps/activity/UninstallWufunActivity_;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/UninstallWufunActivity_;->G:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/UninstallWufunActivity_;->F:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/UninstallWufunActivity_;->F:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/UninstallWufunActivity_;->F:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method showLoding()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/UninstallWufunActivity_$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UninstallWufunActivity_$d;-><init>(Lcom/join/mgps/activity/UninstallWufunActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLodingFailed()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/UninstallWufunActivity_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UninstallWufunActivity_$e;-><init>(Lcom/join/mgps/activity/UninstallWufunActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method t0(Lcom/join/mgps/dto/UninstallGuessLikeBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/UninstallWufunActivity_$b;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/UninstallWufunActivity_$b;-><init>(Lcom/join/mgps/activity/UninstallWufunActivity_;Lcom/join/mgps/dto/UninstallGuessLikeBean;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method u0(Lcom/join/mgps/dto/ResponseModel;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Lcom/join/mgps/dto/ArchievePathMultiBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/activity/UninstallWufunActivity_$q;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/UninstallWufunActivity_$q;-><init>(Lcom/join/mgps/activity/UninstallWufunActivity_;Lcom/join/mgps/dto/ResponseModel;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
