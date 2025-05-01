.class public final Lcom/join/mgps/activity/SimulatorFastEntryActivity_;
.super Lcom/join/mgps/activity/a3;
.source "SimulatorFastEntryActivity_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/SimulatorFastEntryActivity_$k;
    }
.end annotation


# instance fields
.field private final l:La4/c;

.field private final m:Ljava/util/Map;
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
    invoke-direct {p0}, Lcom/join/mgps/activity/a3;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/SimulatorFastEntryActivity_;->l:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/SimulatorFastEntryActivity_;->m:Ljava/util/Map;

    return-void
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    return-void
.end method

.method static synthetic j0(Lcom/join/mgps/activity/SimulatorFastEntryActivity_;Lcom/join/mgps/dto/SimulatorFastEntryBean;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/a3;->g0(Lcom/join/mgps/dto/SimulatorFastEntryBean;)V

    return-void
.end method

.method static synthetic k0(Lcom/join/mgps/activity/SimulatorFastEntryActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/a3;->showLoding()V

    return-void
.end method

.method static synthetic l0(Lcom/join/mgps/activity/SimulatorFastEntryActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/a3;->showLodingFailed()V

    return-void
.end method

.method static synthetic m0(Lcom/join/mgps/activity/SimulatorFastEntryActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/a3;->i0()V

    return-void
.end method

.method static synthetic n0(Lcom/join/mgps/activity/SimulatorFastEntryActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/a3;->h0()V

    return-void
.end method

.method static synthetic o0(Lcom/join/mgps/activity/SimulatorFastEntryActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/a3;->getData()V

    return-void
.end method

.method public static p0(Landroid/content/Context;)Lcom/join/mgps/activity/SimulatorFastEntryActivity_$k;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/SimulatorFastEntryActivity_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/SimulatorFastEntryActivity_$k;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static q0(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/SimulatorFastEntryActivity_$k;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/SimulatorFastEntryActivity_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/SimulatorFastEntryActivity_$k;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method


# virtual methods
.method g0(Lcom/join/mgps/dto/SimulatorFastEntryBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/SimulatorFastEntryActivity_$f;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/SimulatorFastEntryActivity_$f;-><init>(Lcom/join/mgps/activity/SimulatorFastEntryActivity_;Lcom/join/mgps/dto/SimulatorFastEntryBean;)V

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
    iget-object v0, p0, Lcom/join/mgps/activity/SimulatorFastEntryActivity_;->m:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method getData()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/SimulatorFastEntryActivity_$a;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/SimulatorFastEntryActivity_$a;-><init>(Lcom/join/mgps/activity/SimulatorFastEntryActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method h0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/SimulatorFastEntryActivity_$j;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/SimulatorFastEntryActivity_$j;-><init>(Lcom/join/mgps/activity/SimulatorFastEntryActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method i0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/SimulatorFastEntryActivity_$i;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/SimulatorFastEntryActivity_$i;-><init>(Lcom/join/mgps/activity/SimulatorFastEntryActivity_;)V

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

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/SimulatorFastEntryActivity_;->l:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/SimulatorFastEntryActivity_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c0098

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/SimulatorFastEntryActivity_;->setContentView(I)V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 3

    const v0, 0x7f090745

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/a3;->b:Landroid/widget/RelativeLayout;

    const v0, 0x7f090146

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/a3;->c:Landroid/widget/ImageView;

    const v0, 0x7f091489

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/a3;->d:Landroid/widget/TextView;

    const v0, 0x7f0911fe

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/ScrollTextViewLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/a3;->e:Lcom/join/mgps/customview/ScrollTextViewLayout;

    const v0, 0x7f091562

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/a3;->f:Landroid/widget/TextView;

    const v0, 0x7f090900

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/a3;->g:Landroid/widget/ImageView;

    const v0, 0x7f0910ec

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/join/mgps/activity/a3;->h:Landroidx/recyclerview/widget/RecyclerView;

    const v0, 0x7f090d82

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/a3;->i:Landroid/widget/LinearLayout;

    const v0, 0x7f090d7f

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/a3;->j:Landroid/widget/LinearLayout;

    const v0, 0x7f09132b

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/a3;->k:Landroid/view/View;

    const v0, 0x7f0905a8

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
    new-instance v2, Lcom/join/mgps/activity/SimulatorFastEntryActivity_$b;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/SimulatorFastEntryActivity_$b;-><init>(Lcom/join/mgps/activity/SimulatorFastEntryActivity_;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/a3;->c:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    .line 16
    new-instance v2, Lcom/join/mgps/activity/SimulatorFastEntryActivity_$c;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/SimulatorFastEntryActivity_$c;-><init>(Lcom/join/mgps/activity/SimulatorFastEntryActivity_;)V

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    if-eqz v1, :cond_2

    .line 17
    new-instance v0, Lcom/join/mgps/activity/SimulatorFastEntryActivity_$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/SimulatorFastEntryActivity_$d;-><init>(Lcom/join/mgps/activity/SimulatorFastEntryActivity_;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    if-eqz p1, :cond_3

    .line 18
    new-instance v0, Lcom/join/mgps/activity/SimulatorFastEntryActivity_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/SimulatorFastEntryActivity_$e;-><init>(Lcom/join/mgps/activity/SimulatorFastEntryActivity_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    :cond_3
    invoke-virtual {p0}, Lcom/join/mgps/activity/a3;->afterviews()V

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
    iget-object v0, p0, Lcom/join/mgps/activity/SimulatorFastEntryActivity_;->m:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/SimulatorFastEntryActivity_;->l:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/SimulatorFastEntryActivity_;->l:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/SimulatorFastEntryActivity_;->l:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method showLoding()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/SimulatorFastEntryActivity_$g;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/SimulatorFastEntryActivity_$g;-><init>(Lcom/join/mgps/activity/SimulatorFastEntryActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLodingFailed()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/SimulatorFastEntryActivity_$h;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/SimulatorFastEntryActivity_$h;-><init>(Lcom/join/mgps/activity/SimulatorFastEntryActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
