.class public final Lcom/join/mgps/fragment/GameSubscribeFragment_;
.super Lcom/join/mgps/fragment/GameSubscribeFragment;
.source "GameSubscribeFragment_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/GameSubscribeFragment_$n;
    }
.end annotation


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
    invoke-direct {p0}, Lcom/join/mgps/fragment/GameSubscribeFragment;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/GameSubscribeFragment_;->r:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/GameSubscribeFragment_;->t:Ljava/util/Map;

    return-void
.end method

.method static synthetic g0(Lcom/join/mgps/fragment/GameSubscribeFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/GameSubscribeFragment;->e0()V

    return-void
.end method

.method static synthetic h0(Lcom/join/mgps/fragment/GameSubscribeFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/GameSubscribeFragment;->b0()V

    return-void
.end method

.method static synthetic i0(Lcom/join/mgps/fragment/GameSubscribeFragment_;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/fragment/GameSubscribeFragment;->W(Ljava/util/List;)V

    return-void
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0}, La4/c;->b(La4/b;)V

    return-void
.end method

.method static synthetic j0(Lcom/join/mgps/fragment/GameSubscribeFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/GameSubscribeFragment;->d0()V

    return-void
.end method

.method static synthetic k0(Lcom/join/mgps/fragment/GameSubscribeFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/GameSubscribeFragment;->X()V

    return-void
.end method

.method static synthetic l0(Lcom/join/mgps/fragment/GameSubscribeFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/GameSubscribeFragment;->f0()V

    return-void
.end method

.method static synthetic m0(Lcom/join/mgps/fragment/GameSubscribeFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/GameSubscribeFragment;->a0()V

    return-void
.end method

.method static synthetic n0(Lcom/join/mgps/fragment/GameSubscribeFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/GameSubscribeFragment;->showLoding()V

    return-void
.end method

.method static synthetic o0(Lcom/join/mgps/fragment/GameSubscribeFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/GameSubscribeFragment;->c0()V

    return-void
.end method

.method static synthetic p0(Lcom/join/mgps/fragment/GameSubscribeFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/GameSubscribeFragment;->showLodingFailed()V

    return-void
.end method

.method static synthetic q0(Lcom/join/mgps/fragment/GameSubscribeFragment_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/fragment/GameSubscribeFragment;->Z()V

    return-void
.end method

.method public static r0()Lcom/join/mgps/fragment/GameSubscribeFragment_$n;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/GameSubscribeFragment_$n;

    invoke-direct {v0}, Lcom/join/mgps/fragment/GameSubscribeFragment_$n;-><init>()V

    return-object v0
.end method


# virtual methods
.method W(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/GameSubscribeFragment_$h;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/GameSubscribeFragment_$h;-><init>(Lcom/join/mgps/fragment/GameSubscribeFragment_;Ljava/util/List;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method X()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/GameSubscribeFragment_$j;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/GameSubscribeFragment_$j;-><init>(Lcom/join/mgps/fragment/GameSubscribeFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method Z()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/GameSubscribeFragment_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/GameSubscribeFragment_$c;-><init>(Lcom/join/mgps/fragment/GameSubscribeFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method a0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/GameSubscribeFragment_$l;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/GameSubscribeFragment_$l;-><init>(Lcom/join/mgps/fragment/GameSubscribeFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method b0()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/fragment/GameSubscribeFragment_$d;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/fragment/GameSubscribeFragment_$d;-><init>(Lcom/join/mgps/fragment/GameSubscribeFragment_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method c0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/GameSubscribeFragment_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/GameSubscribeFragment_$a;-><init>(Lcom/join/mgps/fragment/GameSubscribeFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method d0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/GameSubscribeFragment_$i;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/GameSubscribeFragment_$i;-><init>(Lcom/join/mgps/fragment/GameSubscribeFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method e0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/GameSubscribeFragment_$g;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/GameSubscribeFragment_$g;-><init>(Lcom/join/mgps/fragment/GameSubscribeFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method f0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/GameSubscribeFragment_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/GameSubscribeFragment_$k;-><init>(Lcom/join/mgps/fragment/GameSubscribeFragment_;)V

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
    iget-object v0, p0, Lcom/join/mgps/fragment/GameSubscribeFragment_;->t:Ljava/util/Map;

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
    iget-object v0, p0, Lcom/join/mgps/fragment/GameSubscribeFragment_;->s:Landroid/view/View;

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
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/GameSubscribeFragment_;->r:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/GameSubscribeFragment_;->init_(Landroid/os/Bundle;)V

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

    iput-object p3, p0, Lcom/join/mgps/fragment/GameSubscribeFragment_;->s:Landroid/view/View;

    if-nez p3, :cond_0

    const p3, 0x7f0c02a9

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/GameSubscribeFragment_;->s:Landroid/view/View;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/GameSubscribeFragment_;->s:Landroid/view/View;

    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/fragment/GameSubscribeFragment_;->s:Landroid/view/View;

    .line 3
    iput-object v0, p0, Lcom/join/mgps/fragment/GameSubscribeFragment;->b:Landroid/widget/LinearLayout;

    .line 4
    iput-object v0, p0, Lcom/join/mgps/fragment/GameSubscribeFragment;->c:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    .line 5
    iput-object v0, p0, Lcom/join/mgps/fragment/GameSubscribeFragment;->d:Lcom/join/mgps/customview/XListView2;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/fragment/GameSubscribeFragment;->e:Landroid/widget/LinearLayout;

    .line 7
    iput-object v0, p0, Lcom/join/mgps/fragment/GameSubscribeFragment;->f:Landroid/widget/LinearLayout;

    .line 8
    iput-object v0, p0, Lcom/join/mgps/fragment/GameSubscribeFragment;->g:Landroid/widget/Button;

    .line 9
    iput-object v0, p0, Lcom/join/mgps/fragment/GameSubscribeFragment;->h:Landroid/widget/ImageView;

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 1

    const v0, 0x7f091641

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/GameSubscribeFragment;->b:Landroid/widget/LinearLayout;

    const v0, 0x7f090ea0

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/GameSubscribeFragment;->c:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    const v0, 0x7f090c97

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/XListView2;

    iput-object v0, p0, Lcom/join/mgps/fragment/GameSubscribeFragment;->d:Lcom/join/mgps/customview/XListView2;

    const v0, 0x7f090d82

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/GameSubscribeFragment;->e:Landroid/widget/LinearLayout;

    const v0, 0x7f090d7f

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/GameSubscribeFragment;->f:Landroid/widget/LinearLayout;

    const v0, 0x7f091261

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/join/mgps/fragment/GameSubscribeFragment;->g:Landroid/widget/Button;

    const v0, 0x7f09110c

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/join/mgps/fragment/GameSubscribeFragment;->h:Landroid/widget/ImageView;

    if-eqz p1, :cond_0

    .line 8
    new-instance v0, Lcom/join/mgps/fragment/GameSubscribeFragment_$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/GameSubscribeFragment_$e;-><init>(Lcom/join/mgps/fragment/GameSubscribeFragment_;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/GameSubscribeFragment;->g:Landroid/widget/Button;

    if-eqz p1, :cond_1

    .line 10
    new-instance v0, Lcom/join/mgps/fragment/GameSubscribeFragment_$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/GameSubscribeFragment_$f;-><init>(Lcom/join/mgps/fragment/GameSubscribeFragment_;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 11
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/GameSubscribeFragment;->V()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/GameSubscribeFragment_;->r:La4/c;

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
    iget-object v0, p0, Lcom/join/mgps/fragment/GameSubscribeFragment_;->t:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method showLoding()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/GameSubscribeFragment_$m;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/GameSubscribeFragment_$m;-><init>(Lcom/join/mgps/fragment/GameSubscribeFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method showLodingFailed()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/fragment/GameSubscribeFragment_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/GameSubscribeFragment_$b;-><init>(Lcom/join/mgps/fragment/GameSubscribeFragment_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
