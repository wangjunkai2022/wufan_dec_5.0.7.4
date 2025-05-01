.class public final Lcom/join/mgps/activity/CleanSpaceActivity_;
.super Lcom/join/mgps/activity/CleanSpaceActivity;
.source "CleanSpaceActivity_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/CleanSpaceActivity_$q;
    }
.end annotation


# instance fields
.field private final H:La4/c;

.field private final I:Ljava/util/Map;
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
    invoke-direct {p0}, Lcom/join/mgps/activity/CleanSpaceActivity;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/CleanSpaceActivity_;->H:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/CleanSpaceActivity_;->I:Ljava/util/Map;

    return-void
.end method

.method static synthetic G0(Lcom/join/mgps/activity/CleanSpaceActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/CleanSpaceActivity;->F0()V

    return-void
.end method

.method static synthetic H0(Lcom/join/mgps/activity/CleanSpaceActivity_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/CleanSpaceActivity;->t0(I)V

    return-void
.end method

.method static synthetic I0(Lcom/join/mgps/activity/CleanSpaceActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/CleanSpaceActivity;->w0()V

    return-void
.end method

.method static synthetic J0(Lcom/join/mgps/activity/CleanSpaceActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/CleanSpaceActivity;->k0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic K0(Lcom/join/mgps/activity/CleanSpaceActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/CleanSpaceActivity;->A0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic L0(Lcom/join/mgps/activity/CleanSpaceActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/CleanSpaceActivity;->o0()V

    return-void
.end method

.method static synthetic M0(Lcom/join/mgps/activity/CleanSpaceActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/CleanSpaceActivity;->showLoding()V

    return-void
.end method

.method static synthetic N0(Lcom/join/mgps/activity/CleanSpaceActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/CleanSpaceActivity;->showLodingFailed()V

    return-void
.end method

.method static synthetic O0(Lcom/join/mgps/activity/CleanSpaceActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/CleanSpaceActivity;->C0()V

    return-void
.end method

.method static synthetic P0(Lcom/join/mgps/activity/CleanSpaceActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/CleanSpaceActivity;->D0()V

    return-void
.end method

.method static synthetic Q0(Lcom/join/mgps/activity/CleanSpaceActivity_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/CleanSpaceActivity;->v0(Ljava/util/List;)V

    return-void
.end method

.method public static R0(Landroid/content/Context;)Lcom/join/mgps/activity/CleanSpaceActivity_$q;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CleanSpaceActivity_$q;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CleanSpaceActivity_$q;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static S0(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/CleanSpaceActivity_$q;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CleanSpaceActivity_$q;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CleanSpaceActivity_$q;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    return-void
.end method


# virtual methods
.method A0(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CleanSpaceActivity_$p;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/CleanSpaceActivity_$p;-><init>(Lcom/join/mgps/activity/CleanSpaceActivity_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method C0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CleanSpaceActivity_$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CleanSpaceActivity_$d;-><init>(Lcom/join/mgps/activity/CleanSpaceActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method D0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CleanSpaceActivity_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CleanSpaceActivity_$e;-><init>(Lcom/join/mgps/activity/CleanSpaceActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method F0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CleanSpaceActivity_$m;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CleanSpaceActivity_$m;-><init>(Lcom/join/mgps/activity/CleanSpaceActivity_;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/CleanSpaceActivity_;->I:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
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

.method k0(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CleanSpaceActivity_$o;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/CleanSpaceActivity_$o;-><init>(Lcom/join/mgps/activity/CleanSpaceActivity_;Ljava/lang/String;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method o0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CleanSpaceActivity_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CleanSpaceActivity_$a;-><init>(Lcom/join/mgps/activity/CleanSpaceActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CleanSpaceActivity_;->H:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/CleanSpaceActivity_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/join/mgps/activity/CleanSpaceActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c002a

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/CleanSpaceActivity_;->setContentView(I)V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 4

    const v0, 0x7f09156b

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/CleanSpaceActivity;->b:Landroid/widget/TextView;

    const v0, 0x7f0902e9

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/CleanSpaceActivity;->c:Landroid/widget/ImageView;

    const v0, 0x7f091579

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/CleanSpaceActivity;->d:Landroid/widget/TextView;

    const v0, 0x7f0911c5

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/join/mgps/activity/CleanSpaceActivity;->e:Landroidx/recyclerview/widget/RecyclerView;

    const v0, 0x7f090718

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/Group;

    iput-object v0, p0, Lcom/join/mgps/activity/CleanSpaceActivity;->f:Landroidx/constraintlayout/widget/Group;

    const v0, 0x7f090715

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/Group;

    iput-object v0, p0, Lcom/join/mgps/activity/CleanSpaceActivity;->g:Landroidx/constraintlayout/widget/Group;

    const v0, 0x7f09157b

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/CleanSpaceActivity;->h:Landroid/widget/TextView;

    const v0, 0x7f0911cc

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/join/mgps/activity/CleanSpaceActivity;->i:Landroidx/recyclerview/widget/RecyclerView;

    const v0, 0x7f09071b

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/Group;

    iput-object v0, p0, Lcom/join/mgps/activity/CleanSpaceActivity;->j:Landroidx/constraintlayout/widget/Group;

    const v0, 0x7f09059e

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/CleanSpaceActivity;->k:Landroid/widget/FrameLayout;

    const v0, 0x7f09157e

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/CleanSpaceActivity;->l:Landroid/widget/TextView;

    const v0, 0x7f0914ff

    .line 12
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/CleanSpaceActivity;->m:Landroid/widget/TextView;

    const v0, 0x7f090d82

    .line 13
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/CleanSpaceActivity;->n:Landroid/widget/LinearLayout;

    const v0, 0x7f090d7f

    .line 14
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/CleanSpaceActivity;->o:Landroid/widget/LinearLayout;

    const v0, 0x7f0904e0

    .line 15
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/CleanSpaceActivity;->p:Landroid/widget/LinearLayout;

    const v0, 0x7f090146

    .line 16
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f09029e

    .line 17
    invoke-interface {p1, v1}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f09110c

    .line 18
    invoke-interface {p1, v2}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v2

    const v3, 0x7f091261

    .line 19
    invoke-interface {p1, v3}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz v0, :cond_0

    .line 20
    new-instance v3, Lcom/join/mgps/activity/CleanSpaceActivity_$h;

    invoke-direct {v3, p0}, Lcom/join/mgps/activity/CleanSpaceActivity_$h;-><init>(Lcom/join/mgps/activity/CleanSpaceActivity_;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz v1, :cond_1

    .line 21
    new-instance v0, Lcom/join/mgps/activity/CleanSpaceActivity_$i;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CleanSpaceActivity_$i;-><init>(Lcom/join/mgps/activity/CleanSpaceActivity_;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 22
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/CleanSpaceActivity;->m:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    .line 23
    new-instance v1, Lcom/join/mgps/activity/CleanSpaceActivity_$j;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/CleanSpaceActivity_$j;-><init>(Lcom/join/mgps/activity/CleanSpaceActivity_;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    if-eqz v2, :cond_3

    .line 24
    new-instance v0, Lcom/join/mgps/activity/CleanSpaceActivity_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CleanSpaceActivity_$k;-><init>(Lcom/join/mgps/activity/CleanSpaceActivity_;)V

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    if-eqz p1, :cond_4

    .line 25
    new-instance v0, Lcom/join/mgps/activity/CleanSpaceActivity_$l;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CleanSpaceActivity_$l;-><init>(Lcom/join/mgps/activity/CleanSpaceActivity_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 26
    :cond_4
    invoke-virtual {p0}, Lcom/join/mgps/activity/CleanSpaceActivity;->afterviews()V

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
    iget-object v0, p0, Lcom/join/mgps/activity/CleanSpaceActivity_;->I:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/CleanSpaceActivity_;->H:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/CleanSpaceActivity_;->H:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/CleanSpaceActivity_;->H:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method showLoding()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CleanSpaceActivity_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CleanSpaceActivity_$b;-><init>(Lcom/join/mgps/activity/CleanSpaceActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLodingFailed()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CleanSpaceActivity_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CleanSpaceActivity_$c;-><init>(Lcom/join/mgps/activity/CleanSpaceActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method t0(I)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/CleanSpaceActivity_$g;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/CleanSpaceActivity_$g;-><init>(Lcom/join/mgps/activity/CleanSpaceActivity_;Ljava/lang/String;JLjava/lang/String;I)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method v0(Ljava/util/List;)V
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
    new-instance v7, Lcom/join/mgps/activity/CleanSpaceActivity_$f;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/CleanSpaceActivity_$f;-><init>(Lcom/join/mgps/activity/CleanSpaceActivity_;Ljava/lang/String;JLjava/lang/String;Ljava/util/List;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method w0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/CleanSpaceActivity_$n;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CleanSpaceActivity_$n;-><init>(Lcom/join/mgps/activity/CleanSpaceActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
